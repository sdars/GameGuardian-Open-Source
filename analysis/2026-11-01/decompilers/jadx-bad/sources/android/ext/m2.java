package android.ext;

import android.os.Build;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f1074a = true;

    public static int a() {
        int i = Config.u;
        if (i < 0) {
            return 8;
        }
        return i;
    }

    public static int b() {
        int i = Config.t;
        if (i < 0) {
            i = 2002;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return 2038;
        }
        return i;
    }

    public static int c() {
        int i = Config.t;
        if (i < 0) {
            i = 2003;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return 2038;
        }
        return i;
    }
}
