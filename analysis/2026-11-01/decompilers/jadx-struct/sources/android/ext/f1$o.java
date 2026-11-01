package android.ext;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
class f1$o implements Runnable {
    f1$o() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Context contextF0 = Tools.f0();
            ComponentName componentNameU = f1.u();
            e1$e.a("AndroidService", "Restart: true " + Config.z + ' ' + componentNameU);
            if (!Config.vSpaceReal && Config.z == 0 && componentNameU != null && contextF0.startInstrumentation(componentNameU, null, r.u())) {
                e1$e.a("AndroidService", "Restart 1");
            }
            e1$e.a("AndroidService", "Restart 2");
            String strC0 = Tools.C0();
            String strT = r.t();
            Tools.w1(200, new ComponentName(strC0, strT), 1);
            Intent intentN0 = Tools.N0(contextF0, strC0, strT);
            e1.d("Restart: " + intentN0);
            ((AlarmManager) contextF0.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000, PendingIntent.getActivity(contextF0, 123456, intentN0, 268435456));
            f1.n();
        } catch (Throwable th) {
            throw new RuntimeException("Failed restart", th);
        }
    }
}
