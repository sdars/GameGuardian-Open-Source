package android.ext;

import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import android.fix.ScrollView;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Tools$m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ DialogInterface$OnClickListener f520d;

    Tools$m(String str, int i, String str2, DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        this.f517a = str;
        this.f518b = i;
        this.f519c = str2;
        this.f520d = dialogInterface$OnClickListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        int iIndexOf;
        View viewF = a.d.f(R$layout.logcat, null);
        TextView textView = (TextView) viewF.findViewById(R$id.logcat_text);
        textView.setText(this.f517a);
        if ((this.f518b & 4) != 0 && (iIndexOf = this.f517a.indexOf(8291)) >= 0) {
            SpannableString spannableString = new SpannableString(this.f517a);
            spannableString.setSpan(new BackgroundColorSpan(-7864320), iIndexOf, iIndexOf + 4, 33);
            textView.setText(spannableString);
        }
        ScrollView scrollView = (ScrollView) viewF.findViewById(R$id.logcat_page);
        scrollView.setFastScrollEnabled(true);
        AlertDialog$Builder view = f.b().setPositiveButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null).setView(viewF);
        if ((this.f518b & 2) == 0) {
            view.setNegativeButton(R$string.copy, new Tools$m$a(this, textView));
        }
        String str = this.f519c;
        if (str != null) {
            view.setNeutralButton(str, this.f520d);
        }
        AlertDialog alertDialogCreate = view.create();
        if ((this.f518b & 1) != 0) {
            f.l(alertDialogCreate, new Tools$m$b(this, scrollView));
        }
        f.m(alertDialogCreate);
        Window window = alertDialogCreate.getWindow();
        WindowManager$LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        window.setAttributes(attributes);
    }
}
