package android.app;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
class ANRManagerProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder f22a;

    public ANRManagerProxy(IBinder iBinder) {
        this.f22a = iBinder;
    }

    public IBinder asBinder() {
        return this.f22a;
    }

    public void informMessageDump(String str) {
    }

    public void notifyLightWeightANR(int i, String str, int i2) {
    }

    public boolean notifyWNR(int i, String str) {
        return true;
    }
}
