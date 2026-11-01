package android.ext;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Cat {
    public static void main(String[] strArr) throws IOException {
        byte[] bArr = new byte[8192];
        FileInputStream fileInputStream = new FileInputStream(strArr[0]);
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i < 0) {
                fileInputStream.close();
                return;
            }
            System.out.write(bArr, 0, i);
        }
    }
}
