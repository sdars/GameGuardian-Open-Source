package android.ext;

import java.util.ArrayList;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
class Script$addListItems$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Script$addListItems f400b;

    Script$addListItems$1(Script$addListItems script$addListItems, Object obj) {
        this.f400b = script$addListItems;
        this.f399a = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList<h2> arrayList = this.f400b.e0;
        try {
            SavedListAdapter savedListAdapter = MainService.instance.t0;
            for (h2 h2Var : arrayList) {
                if (h2Var != null) {
                    savedListAdapter.b(h2Var, (byte) 0, false);
                }
            }
            savedListAdapter.notifyDataSetChanged();
            savedListAdapter.i();
            this.f400b.f0 = LuaValue.f1674d;
        } catch (Throwable th) {
            e1.l("Failed add list items", th);
            this.f400b.f0 = LuaValue.K2(Script.V3(th));
        }
        synchronized (this.f399a) {
            try {
                this.f399a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
