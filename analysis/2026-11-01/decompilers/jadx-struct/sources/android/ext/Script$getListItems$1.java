package android.ext;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class Script$getListItems$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Script$getListItems f415c;

    Script$getListItems$1(Script$getListItems script$getListItems, ArrayList arrayList, Object obj) {
        this.f415c = script$getListItems;
        this.f413a = arrayList;
        this.f414b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        SavedListAdapter savedListAdapter = MainService.instance.t0;
        try {
            int count = savedListAdapter.getCount();
            for (int i = 0; i < count; i++) {
                h2 item = savedListAdapter.getItem(i);
                if (item != null) {
                    this.f413a.add(item);
                }
            }
        } catch (Throwable th) {
            e1.l("Failed get list items", th);
        }
        synchronized (this.f414b) {
            try {
                this.f414b.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
