/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.Tools;
import android.ext.e1;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

public abstract class w0 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String a(Object object, String object2) {
        Throwable throwable2;
        block4: {
            block3: {
                try {
                    int n3;
                    object2 = MessageDigest.getInstance((String)object2);
                    if (!(object instanceof File)) break block3;
                    Object object3 = (File)object;
                    object = new FileInputStream((File)object3);
                    object3 = new byte[1024];
                    while ((n3 = ((FileInputStream)object).read((byte[])object3)) != -1) {
                        ((MessageDigest)object2).update((byte[])object3, 0, n3);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                ((FileInputStream)object).close();
                return w0.b((MessageDigest)object2);
            }
            ((MessageDigest)object2).update(object.toString().getBytes());
            return w0.b((MessageDigest)object2);
        }
        e1.l("hash fail", throwable2);
        return throwable2.toString();
    }

    public static final String b(MessageDigest object) {
        object = ((MessageDigest)object).digest();
        byte[] byArray = new byte[8];
        System.arraycopy(object, 0, byArray, 0, 4);
        System.arraycopy(object, ((Object)object).length - 4, byArray, 4, 4);
        return Tools.l(byArray);
    }
}

