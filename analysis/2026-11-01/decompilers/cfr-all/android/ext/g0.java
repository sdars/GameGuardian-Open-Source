/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.n0;

public class g0
extends Thread {
    public g0(Runnable runnable, String string2) {
        super(runnable, string2);
        this.setDaemon(true);
        n0.g(this);
    }

    public g0(String string2) {
        super(string2);
        this.setDaemon(true);
        n0.g(this);
    }
}

