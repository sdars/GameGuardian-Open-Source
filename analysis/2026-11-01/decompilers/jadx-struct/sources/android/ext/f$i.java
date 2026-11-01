package android.ext;

import android.app.AlertDialog$Builder;

/* JADX INFO: loaded from: classes.dex */
class f$i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog$Builder f777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f778b;

    f$i(AlertDialog$Builder alertDialog$Builder, EditText editText) {
        this.f777a = alertDialog$Builder;
        this.f778b = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.n(this.f777a.create(), this.f778b);
    }
}
