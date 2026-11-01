package android.ext;

import android.content.ClipData;
import android.content.ClipboardManager;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Tools$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f497b;

    Tools$a(String str, boolean z) {
        this.f496a = str;
        this.f497b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strReplace = this.f496a.replace(" ", " ");
        if (this.f497b) {
            y0.b(strReplace, 1);
        }
        try {
            ((ClipboardManager) MainService.context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(strReplace, strReplace));
            Tools.H1(R$string.copied);
        } catch (Throwable th) {
            e1.l("Failed to copy text to the clipboard", th);
            e1.d("Text: " + strReplace);
            Tools.J1(b2.f(R$string.failed_copy_text) + ' ' + th.getMessage());
        }
    }
}
