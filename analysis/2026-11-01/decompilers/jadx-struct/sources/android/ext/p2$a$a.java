package android.ext;

import android.view.View;
import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
class p2$a$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p2$a f1183a;

    p2$a$a(p2$a p2_a) {
        this.f1183a = p2_a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Toast toastMakeText = Toast.makeText(p2.h(), " ", 1);
            View view = toastMakeText.getView();
            view.setBackgroundColor(0);
            toastMakeText.setView(view);
            p2.g(toastMakeText).show();
            synchronized (p2.f1177b) {
                try {
                    Toast unused = p2.f1176a = toastMakeText;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            e1.s("Toast show", th2);
        }
    }
}
