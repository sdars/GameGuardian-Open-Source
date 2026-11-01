package android.ext;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class m0$a {
    static byte[] a(byte[] bArr, int i) throws IOException {
        if (i < 0 || i > 7) {
            throw new IOException("bad unused bit count: " + i);
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        bArr2[0] = (byte) i;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        return k(3, bArr2);
    }

    static byte[] b(int i, byte[] bArr) {
        return k(i | 160, bArr);
    }

    static byte[] c(int i, byte[] bArr) {
        return k(i | 160, bArr);
    }

    static byte[] d(String str) {
        return k(24, str.getBytes("US-ASCII"));
    }

    static byte[] e(byte[] bArr) throws IOException {
        if (bArr.length == 0) {
            throw new IOException("empty INTEGER");
        }
        int i = (bArr[0] & 128) != 0 ? 1 : 0;
        byte[] bArr2 = new byte[bArr.length + i];
        System.arraycopy(bArr, 0, bArr2, i, bArr.length);
        return k(2, bArr2);
    }

    static byte[] f() {
        return k(5, new byte[0]);
    }

    static byte[] g(byte[] bArr) {
        return k(4, bArr);
    }

    static byte[] h(String str) throws IOException {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2) {
            throw new IOException("malformed OID: " + str);
        }
        long j = Long.parseLong(strArrSplit[0]);
        long j2 = Long.parseLong(strArrSplit[1]);
        if (j < 0 || j > 2 || j2 < 0 || j2 > 39) {
            throw new IOException("malformed OID arc: " + str);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        n(byteArrayOutputStream, (j * 40) + j2);
        for (int i = 2; i < strArrSplit.length; i++) {
            n(byteArrayOutputStream, Long.parseLong(strArrSplit[i]));
        }
        return k(6, byteArrayOutputStream.toByteArray());
    }

    static byte[] i(byte[] bArr) {
        return k(48, bArr);
    }

    static byte[] j(byte[] bArr) {
        return k(49, bArr);
    }

    private static byte[] k(int i, byte[] bArr) throws IOException {
        if (bArr.length >= 65536) {
            throw new IOException("DER value too large: " + bArr.length);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 6);
        byteArrayOutputStream.write(i);
        int length = bArr.length;
        if (length < 128) {
            byteArrayOutputStream.write(length);
        } else {
            int i2 = 1;
            while ((length >>> (i2 * 8)) != 0) {
                i2++;
            }
            byteArrayOutputStream.write(i2 | 128);
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                byteArrayOutputStream.write((length >>> (i3 * 8)) & 255);
            }
        }
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        return byteArrayOutputStream.toByteArray();
    }

    static byte[] l(String str) {
        return k(23, str.getBytes("US-ASCII"));
    }

    static byte[] m(String str) {
        return k(12, str.getBytes("UTF-8"));
    }

    private static void n(ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
        if (j < 0) {
            throw new IOException("negative OID arc");
        }
        int i = 1;
        while ((j >>> (i * 7)) != 0) {
            i++;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = (int) ((j >>> (i2 * 7)) & 127);
            if (i2 != 0) {
                i3 |= 128;
            }
            byteArrayOutputStream.write(i3);
        }
    }
}
