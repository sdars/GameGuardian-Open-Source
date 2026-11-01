package android.ext;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

/* JADX INFO: loaded from: classes.dex */
class y2$b$b implements CompoundButton$OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CheckBox f1372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y2$b f1373b;

    y2$b$b(y2$b y2_b, CheckBox checkBox) {
        this.f1373b = y2_b;
        this.f1372a = checkBox;
    }

    @Override // android.widget.CompoundButton$OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            return;
        }
        this.f1372a.setChecked(false);
    }
}
