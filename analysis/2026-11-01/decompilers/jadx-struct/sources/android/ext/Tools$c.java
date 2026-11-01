package android.ext;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class Tools$c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f504b;

    Tools$c(TextView textView, String str) {
        this.f503a = textView;
        this.f504b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 1;
        while (i < 4) {
            try {
                this.f503a.setLinksClickable(i <= 2);
                this.f503a.setAutoLinkMask(i <= 2 ? 1 : 0);
                this.f503a.setMovementMethod(i <= 1 ? LinkMovementMethod.getInstance() : null);
                this.f503a.setText(this.f504b);
                break;
            } catch (Throwable th) {
                e1.l("Failed set clickable text " + i, th);
                i++;
            }
        }
        if (i == 4) {
            this.f503a.setText("Failed set text");
        }
        DefensiveURLSpan.a(this.f503a);
    }
}
