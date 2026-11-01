/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.Config;
import android.os.Build;

public abstract class m2 {
    public static volatile boolean a = true;

    public static int a() {
        int n3;
        int n4 = n3 = Config.u;
        if (n3 < 0) {
            n4 = 8;
        }
        return n4;
    }

    public static int b() {
        int n3;
        int n4 = n3 = Config.t;
        if (n3 < 0) {
            n4 = 2002;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            n4 = 2038;
        }
        return n4;
    }

    public static int c() {
        int n3;
        int n4 = n3 = Config.t;
        if (n3 < 0) {
            n4 = 2003;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            n4 = 2038;
        }
        return n4;
    }
}

