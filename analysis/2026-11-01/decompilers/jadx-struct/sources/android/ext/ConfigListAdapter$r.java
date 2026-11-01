package android.ext;

import android.widget.ListAdapter;
import catch_.me_.if_.you_.can_.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ListAdapter f86a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f87b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f88c;

    ConfigListAdapter$r(ListAdapter listAdapter, int i, List list) {
        this.f86a = listAdapter;
        this.f87b = i;
        this.f88c = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.o(f.c(Tools.k0()).setCustomTitle(Tools.g0(R$string.select_language)).setSingleChoiceItems(this.f86a, this.f87b, new ConfigListAdapter$r$a(this)));
    }
}
