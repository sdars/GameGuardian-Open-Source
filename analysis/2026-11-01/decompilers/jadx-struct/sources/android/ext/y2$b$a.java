package android.ext;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
class y2$b$a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CheckBox f1369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CheckBox f1370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ y2$b f1371c;

    y2$b$a(y2$b y2_b, CheckBox checkBox, CheckBox checkBox2) {
        this.f1371c = y2_b;
        this.f1369a = checkBox;
        this.f1370b = checkBox2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f1369a.setChecked(true);
        CheckBox checkBox = this.f1370b;
        if (checkBox != null) {
            checkBox.setChecked(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
