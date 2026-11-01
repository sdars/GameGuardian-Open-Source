package android.ext;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes.dex */
class Searcher$a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Searcher f452a;

    Searcher$a(Searcher searcher) {
        this.f452a = searcher;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f452a.L();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f452a.L();
    }
}
