package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class l extends android.app.Application {

    class a implements android.app.Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.l f1049a;

        a(android.ext.l r1) {
                r0 = this;
                r0.f1049a = r1
                r0.<init>()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r3, android.os.Bundle r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onActivityCreated: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = "; "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                android.ext.e1.d(r3)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onActivityDestroyed: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                android.ext.e1.d(r3)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onActivityPaused: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                android.ext.e1.d(r3)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onActivityResumed: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                android.ext.e1.d(r3)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r3, android.os.Bundle r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onActivitySaveInstanceState: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = "; "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                android.ext.e1.d(r3)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onActivityStarted: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                android.ext.e1.d(r3)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onActivityStopped: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                android.ext.e1.d(r3)
                return
        }
    }

    static {
            java.lang.String r0 = "Application clinit"
            android.ext.e1.d(r0)
            android.ext.i.a()
            android.ext.n0.f()
            return
    }

    public l() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Application init"
            android.ext.e1.d(r0)
            android.ext.n0.f()
            return
    }

    @Override // android.app.Application
    public void onCreate() {
            r1 = this;
            java.lang.String r0 = "Application onCreate"
            android.ext.e1.d(r0)
            super.onCreate()
            android.ext.l$a r0 = new android.ext.l$a     // Catch: java.lang.Throwable -> L11
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11
            r1.registerActivityLifecycleCallbacks(r0)     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r0 = move-exception
            android.ext.e1.a(r0)
        L15:
            return
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            java.lang.String r0 = "Application onLowMemory"
            android.ext.e1.d(r0)
            super.onLowMemory()
            r0 = -1
            android.ext.MainService.t0(r0)
            return
    }

    @Override // android.app.Application
    public void onTerminate() {
            r1 = this;
            java.lang.String r0 = "Application onTerminate"
            android.ext.e1.d(r0)
            super.onTerminate()
            return
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Application onTrimMemory: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            super.onTrimMemory(r3)
            android.ext.MainService.t0(r3)
            return
    }
}
