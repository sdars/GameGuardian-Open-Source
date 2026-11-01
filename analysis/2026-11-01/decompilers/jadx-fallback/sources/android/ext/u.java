package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class u extends android.app.Instrumentation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f1266a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile android.ext.u f1267b;

    static {
            java.lang.String r0 = "Instrumentation clinit"
            android.ext.e1.d(r0)
            android.ext.i.a()
            android.ext.n0.f()
            return
    }

    public u() {
            r1 = this;
            r1.<init>()
            android.ext.u.f1267b = r1
            java.lang.String r0 = "Instrumentation init"
            android.ext.e1.d(r0)
            android.ext.n0.f()
            return
    }

    public static void a() {
            android.ext.u r0 = android.ext.u.f1267b
            if (r0 == 0) goto Ld
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 0
            r0.finish(r2, r1)
        Ld:
            return
    }

    public static boolean c() {
            boolean r0 = android.ext.u.f1266a
            return r0
    }

    public android.content.Context b(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L7
            android.content.Context r0 = r1.getTargetContext()
            goto Lb
        L7:
            android.content.Context r0 = r1.getContext()
        Lb:
            if (r2 != 0) goto L12
            android.content.Context r2 = r1.getTargetContext()
            goto L16
        L12:
            android.content.Context r2 = r1.getContext()
        L16:
            if (r0 != 0) goto L19
            r0 = r2
        L19:
            android.content.Context r2 = a.b.i(r0)
            return r2
    }

    @Override // android.app.Instrumentation
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.ext.r.K(r3)
            android.content.Context r0 = r2.getTargetContext()
            android.ext.Tools.X0(r0)
            android.content.Context r0 = r2.getContext()
            android.ext.Tools.X0(r0)
            android.content.Context r0 = android.ext.MainService.context
            if (r0 != 0) goto L23
            r0 = 0
            android.content.Context r0 = r2.b(r0)
            android.content.Context r0 = android.ext.l2.i(r0)
            android.ext.MainService.context = r0
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Instrumentation onCreate "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.ext.e1.d(r3)
            android.ext.n0.f()
            android.ext.u.f1267b = r2
            r3 = 1
            android.ext.u.f1266a = r3
            r2.start()
            return
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
            r0 = this;
            android.ext.t.a()
            super.onDestroy()
            return
    }

    @Override // android.app.Instrumentation
    public boolean onException(java.lang.Object r3, java.lang.Throwable r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Instrumentation onException: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.s(r0, r4)
            boolean r3 = super.onException(r3, r4)
            return r3
    }

    @Override // android.app.Instrumentation
    public void onStart() {
            r6 = this;
            super.onStart()
            java.lang.String r0 = android.ext.r.t()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Instrumentation onStart "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            r1 = 1
            android.content.Context r2 = r6.b(r1)
            java.lang.String r3 = r2.getPackageName()
            android.content.ComponentName r4 = new android.content.ComponentName
            r4.<init>(r3, r0)
            r5 = 100
            android.ext.Tools.w1(r5, r4, r1)
            android.content.Intent r0 = android.ext.Tools.N0(r2, r3, r0)
            r2.startActivity(r0)
            return
    }
}
