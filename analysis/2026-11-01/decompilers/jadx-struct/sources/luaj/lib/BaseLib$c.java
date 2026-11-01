package luaj.lib;

import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import catch_.me_.if_.you_.can_.R$string;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class BaseLib$c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    File f1738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    OutputStream f1739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    File f1740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    DataOutputStream f1741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ BaseLib f1742e;

    BaseLib$c(BaseLib baseLib, String str) {
        this.f1742e = baseLib;
        this.f1738a = new File(str + ".load");
        this.f1739b = new BufferedOutputStream(new FileOutputStream(this.f1738a));
        this.f1740c = new File(str + ".load.tmp");
        this.f1741d = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.f1740c)));
    }

    void a() {
        try {
            this.f1739b.close();
            this.f1741d.close();
            int length = ((int) this.f1740c.length()) / 4;
            if (length > 0) {
                Tools.J1(b2.f(R$string.debug_load) + ": " + length);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f1738a));
                DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(this.f1740c)));
                BaseLib baseLib = this.f1742e;
                byte[] bArr = baseLib.V;
                if (bArr == null) {
                    bArr = new byte[8192];
                    baseLib.V = bArr;
                }
                byte[] bArr2 = new byte[512];
                b(bArr2, 0, "load_0000000.lua");
                b(bArr2, 100, "0000666\u00000000000\u00000002004\u000000000000000\u000000000000000\u0000000000\u0000 0");
                b(bArr2, 257, "ustar00\u0000root");
                b(bArr2, 297, "sdcard_r");
                int i = -64;
                for (int i2 = 0; i2 < 512; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 != 0) {
                        i += b2 & 255;
                    }
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.f1738a.getAbsolutePath() + ".tar"));
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = dataInputStream.readInt();
                    String string = Integer.toString(i3);
                    int length2 = string.length();
                    int i5 = 12 - length2;
                    int i6 = i;
                    for (int i7 = 0; i7 < length2; i7++) {
                        char cCharAt = string.charAt(i7);
                        i6 += (cCharAt & 255) - 48;
                        bArr2[i5 + i7] = (byte) cCharAt;
                    }
                    b(bArr2, 124, "00000000000\u000000000000000\u0000000000\u0000");
                    c(bArr2, 154, i6 + c(bArr2, 135, i4));
                    bufferedOutputStream.write(bArr2, 0, 512);
                    int i8 = i4;
                    while (i8 > 0) {
                        int i9 = bufferedInputStream.read(bArr, 0, i8 > bArr.length ? bArr.length : i8);
                        if (i9 > 0) {
                            bufferedOutputStream.write(bArr, 0, i9);
                            i8 -= i9;
                        }
                    }
                    int i10 = i4 % 512;
                    if (i10 > 0) {
                        int i11 = 512 - i10;
                        Arrays.fill(bArr, 0, i11, (byte) 0);
                        bufferedOutputStream.write(bArr, 0, i11);
                    }
                }
                bufferedOutputStream.write(new byte[1024], 0, 1024);
                bufferedOutputStream.close();
                bufferedInputStream.close();
                dataInputStream.close();
            }
            this.f1738a.delete();
            this.f1740c.delete();
        } catch (Throwable th) {
            e1.g("Failed end log load for " + this.f1738a, th);
        }
    }

    void b(byte[] bArr, int i, String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i + i2] = (byte) str.charAt(i2);
        }
    }

    int c(byte[] bArr, int i, int i2) {
        String octalString = Integer.toOctalString(i2);
        int length = octalString.length();
        int i3 = i - length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = octalString.charAt(i5);
            i4 += (cCharAt & 255) - 48;
            bArr[i3 + i5] = (byte) cCharAt;
        }
        return i4;
    }
}
