package android.ext;

import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

/* JADX INFO: loaded from: classes.dex */
class l0$c implements CompoundButton$OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l0 f1059a;

    l0$c(l0 l0Var) {
        this.f1059a = l0Var;
    }

    @Override // android.widget.CompoundButton$OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f1059a.u.setChecked(false);
        }
        this.f1059a.t.setChecked(true);
    }
}
