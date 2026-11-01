/*
 * Decompiled with CFR 0.152.
 */
package android.app;

import android.os.IBinder;

class ANRManagerProxy {
    private IBinder a;

    public ANRManagerProxy(IBinder iBinder) {
        this.a = iBinder;
    }

    public IBinder asBinder() {
        return this.a;
    }

    public void informMessageDump(String string2) {
    }

    public void notifyLightWeightANR(int n3, String string2, int n4) {
    }

    public boolean notifyWNR(int n3, String string2) {
        return true;
    }
}

