package android.ext;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1048a;

    protected k2(Context context) {
        this.f1048a = context;
    }

    protected SharedPreferences a(String str, int i) {
        return this.f1048a.getSharedPreferences(str, i);
    }

    protected Object b(String str) {
        return this.f1048a.getSystemService(str);
    }

    protected void c() {
        v vVar = v.f1277a;
        v.f1281e = true;
        if (vVar != null) {
            e1.d("BootstrapService stopSelf");
            vVar.stopSelf();
        }
        u uVar = u.f1267b;
        if (uVar != null) {
            uVar.onDestroy();
        }
    }
}
