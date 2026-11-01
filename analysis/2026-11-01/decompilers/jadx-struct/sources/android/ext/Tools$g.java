package android.ext;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
class Tools$g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.widget.EditText f508a;

    Tools$g(android.widget.EditText editText) {
        this.f508a = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        Editable text = this.f508a.getText();
        if (text.length() > 0) {
            try {
                text.replace(0, 1, text.subSequence(0, 1), 0, 1);
            } catch (Throwable th) {
                e1.a(th);
            }
            this.f508a.selectAll();
        }
    }
}
