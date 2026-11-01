package android.ext;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class t0$a implements SeekBar$OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f1247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t0 f1248b;

    t0$a(t0 t0Var, TextView textView) {
        this.f1248b = t0Var;
        this.f1247a = textView;
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f1247a.setText("" + (i + 1));
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
