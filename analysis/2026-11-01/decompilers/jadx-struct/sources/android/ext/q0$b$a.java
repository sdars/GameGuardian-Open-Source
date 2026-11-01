package android.ext;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
class q0$b$a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CheckBox f1194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ q0$b f1195b;

    q0$b$a(q0$b q0_b, CheckBox checkBox) {
        this.f1195b = q0_b;
        this.f1194a = checkBox;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f1194a.setChecked(true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
