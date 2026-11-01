package android.ext;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class Script$prompt$1$1 implements SeekBar$OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Script$prompt$1 f430c;

    Script$prompt$1$1(Script$prompt$1 script$prompt$1, TextView textView, int i) {
        this.f430c = script$prompt$1;
        this.f428a = textView;
        this.f429b = i;
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f428a.setText(Integer.toString(i + this.f429b));
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
