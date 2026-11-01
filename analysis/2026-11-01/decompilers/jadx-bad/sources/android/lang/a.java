package android.lang;

import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class a {
    public static int a(FileDescriptor fileDescriptor) {
        try {
            Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(fileDescriptor)).intValue();
        } catch (Throwable th) {
            throw new RuntimeException("Failed get fd", th);
        }
    }

    static Process b(String[] strArr, Map map, String str, boolean z) {
        int length = strArr.length - 1;
        byte[][] bArr = new byte[length][];
        int length2 = length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            byte[] bytes = strArr[i2].getBytes();
            bArr[i] = bytes;
            length2 += bytes.length;
            i = i2;
        }
        byte[] bArr2 = new byte[length2];
        int length3 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            byte[] bArr3 = bArr[i3];
            System.arraycopy(bArr3, 0, bArr2, length3, bArr3.length);
            length3 += bArr3.length + 1;
        }
        int[] iArr = new int[1];
        return new UNIXProcess(c(strArr[0]), bArr2, length, ProcessEnvironment.j(map, iArr), iArr[0], c(str), new int[]{-1, -1, -1}, z);
    }

    private static byte[] c(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[length] = 0;
        return bArr;
    }
}
