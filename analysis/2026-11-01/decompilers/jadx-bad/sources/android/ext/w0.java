package android.ext;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class w0 {
    public static final String a(Object obj, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (obj instanceof File) {
                FileInputStream fileInputStream = new FileInputStream((File) obj);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                fileInputStream.close();
            } else {
                messageDigest.update(obj.toString().getBytes());
            }
            return b(messageDigest);
        } catch (Throwable th) {
            e1.l("hash fail", th);
            return th.toString();
        }
    }

    public static final String b(MessageDigest messageDigest) {
        byte[] bArrDigest = messageDigest.digest();
        byte[] bArr = new byte[8];
        System.arraycopy(bArrDigest, 0, bArr, 0, 4);
        System.arraycopy(bArrDigest, bArrDigest.length - 4, bArr, 4, 4);
        return Tools.l(bArr);
    }
}
