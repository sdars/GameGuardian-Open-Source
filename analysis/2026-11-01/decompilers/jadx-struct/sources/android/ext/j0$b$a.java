package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class j0$b$a extends InternalKeyboard$e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditTextPath f1035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j0$b f1036b;

    j0$b$a(j0$b j0_b, EditTextPath editTextPath) {
        this.f1036b = j0_b;
        this.f1035a = editTextPath;
    }

    @Override // android.ext.InternalKeyboard$e
    protected boolean a(View view, boolean z) {
        return view == this.f1035a;
    }
}
