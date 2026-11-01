package android.ext;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes.dex */
class l0$b implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l0 f1058a;

    l0$b(l0 l0Var) {
        this.f1058a = l0Var;
    }

    private void a() {
        this.f1058a.t.setChecked(true);
        this.f1058a.u();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        a();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a();
    }
}
