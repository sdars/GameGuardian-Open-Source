package android.ext;

import android.widget.BaseAdapter;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
class MainService$k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ListAdapter f258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService f259b;

    MainService$k(MainService mainService, ListAdapter listAdapter) {
        this.f259b = mainService;
        this.f258a = listAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        ListAdapter listAdapter = this.f258a;
        if (listAdapter instanceof ConfigListAdapter) {
            ((ConfigListAdapter) listAdapter).x();
        }
        ListAdapter listAdapter2 = this.f258a;
        if (listAdapter2 instanceof BaseAdapter) {
            try {
                ((BaseAdapter) listAdapter2).notifyDataSetChanged();
            } catch (NoSuchMethodError e2) {
                e1.a(e2);
            }
        }
    }
}
