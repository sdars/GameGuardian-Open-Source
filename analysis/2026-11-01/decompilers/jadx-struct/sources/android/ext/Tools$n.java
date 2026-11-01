package android.ext;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
class Tools$n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ListView f526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f528c;

    Tools$n(ListView listView, int i, int i2) {
        this.f526a = listView;
        this.f527b = i;
        this.f528c = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f526a.setSelectionFromTop(this.f527b, this.f528c);
    }
}
