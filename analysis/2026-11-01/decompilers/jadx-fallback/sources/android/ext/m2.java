package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f1074a = true;

    static {
            return
    }

    public static int a() {
            int r0 = android.ext.Config.u
            if (r0 >= 0) goto L6
            r0 = 8
        L6:
            return r0
    }

    public static int b() {
            int r0 = android.ext.Config.t
            if (r0 >= 0) goto L6
            r0 = 2002(0x7d2, float:2.805E-42)
        L6:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto Le
            r0 = 2038(0x7f6, float:2.856E-42)
        Le:
            return r0
    }

    public static int c() {
            int r0 = android.ext.Config.t
            if (r0 >= 0) goto L6
            r0 = 2003(0x7d3, float:2.807E-42)
        L6:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto Le
            r0 = 2038(0x7f6, float:2.856E-42)
        Le:
            return r0
    }
}
