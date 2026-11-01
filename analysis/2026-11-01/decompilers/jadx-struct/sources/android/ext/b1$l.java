package android.ext;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class b1$l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f626a;

    b1$l(String str) {
        this.f626a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        TextView textView = (TextView) b1.I.get();
        if (textView != null) {
            textView.setText(this.f626a);
        }
    }
}
