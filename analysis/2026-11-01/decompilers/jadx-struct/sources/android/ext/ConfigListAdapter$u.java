package android.ext;

import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$u implements SeekBar$OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SeekBar f92a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ SeekBar f93b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SeekBar f94c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextView f95d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ImageView f96e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f97f;

    ConfigListAdapter$u(ConfigListAdapter configListAdapter, SeekBar seekBar, SeekBar seekBar2, SeekBar seekBar3, TextView textView, ImageView imageView) {
        this.f97f = configListAdapter;
        this.f92a = seekBar;
        this.f93b = seekBar2;
        this.f94c = seekBar3;
        this.f95d = textView;
        this.f96e = imageView;
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f97f.w((10 - this.f92a.getProgress()) / 10.0f, this.f93b.getMax() == this.f93b.getProgress() ? -1 : this.f93b.getProgress(), this.f95d, this.f96e, this.f94c.getProgress());
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
