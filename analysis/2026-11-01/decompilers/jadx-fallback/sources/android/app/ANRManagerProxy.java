package android.app;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
class ANRManagerProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.os.IBinder f22a;

    public ANRManagerProxy(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.f22a = r1
            return
    }

    public android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.f22a
            return r0
    }

    public void informMessageDump(java.lang.String r1) {
            r0 = this;
            return
    }

    public void notifyLightWeightANR(int r1, java.lang.String r2, int r3) {
            r0 = this;
            return
    }

    public boolean notifyWNR(int r1, java.lang.String r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
