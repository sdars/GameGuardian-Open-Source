/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.Context;
import android.content.SharedPreferences;
import android.ext.e1;
import android.ext.u;
import android.ext.v;

public abstract class k2 {
    private Context a;

    protected k2(Context context) {
        this.a = context;
    }

    protected SharedPreferences a(String string2, int n3) {
        return this.a.getSharedPreferences(string2, n3);
    }

    protected Object b(String string2) {
        return this.a.getSystemService(string2);
    }

    protected void c() {
        Object object = v.a;
        v.e = true;
        if (object != null) {
            e1.d("BootstrapService stopSelf");
            object.stopSelf();
        }
        if ((object = u.b) != null) {
            object.onDestroy();
        }
    }
}

