package android.ext;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class Tools$u$a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Tools$u f545b;

    Tools$u$a(Tools$u tools$u, TextView textView) {
        this.f545b = tools$u;
        this.f544a = textView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        onTextChanged(editable, 0, 0, 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            String string = charSequence.toString();
            int i4 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.f545b.f541b;
                if (i4 >= charSequenceArr.length) {
                    return;
                }
                if (charSequenceArr[i4].toString().equals(string)) {
                    TextView textView = this.f544a;
                    Tools$u tools$u = this.f545b;
                    Tools.c(textView, tools$u.f542c[i4], tools$u.f543d);
                    return;
                }
                i4++;
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
