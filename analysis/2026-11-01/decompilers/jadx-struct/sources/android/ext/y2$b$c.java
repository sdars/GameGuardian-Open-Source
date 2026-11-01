package android.ext;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

/* JADX INFO: loaded from: classes.dex */
class y2$b$c implements CompoundButton$OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CheckBox f1374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y2$b f1375b;

    y2$b$c(y2$b y2_b, CheckBox checkBox) {
        this.f1375b = y2_b;
        this.f1374a = checkBox;
    }

    @Override // android.widget.CompoundButton$OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f1374a.setChecked(true);
        }
    }
}
