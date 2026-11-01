package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class Config$OptionSeek extends Config$p implements SeekBar$OnSeekBarChangeListener {
    int k;
    protected WeakReference l;

    public Config$OptionSeek(int i, int i2, int i3, int i4, String str, boolean z) {
        super(i, i2, i4, str, z);
        this.l = new WeakReference(null);
        this.k = i3;
    }

    public Config$OptionSeek(int i, int i2, int i3, int i4, String str, boolean z, int i5) {
        this(i, i2, i3, i4, str, z);
        this.h = i5;
    }

    @Override // android.ext.Config$p
    public void b() {
        h();
    }

    @Override // android.ext.Config$p
    public boolean e(DialogInterface dialogInterface, int i) {
        SeekBar seekBar = (SeekBar) this.l.get();
        if (seekBar == null) {
            return false;
        }
        this.f42d = seekBar.getProgress();
        Config.k();
        return true;
    }

    protected void h() {
        View viewF = a.d.f(R$layout.option_seek, null);
        SeekBar seekBar = (SeekBar) viewF.findViewById(R$id.seek);
        seekBar.setMax(this.k);
        seekBar.setProgress(this.f42d);
        seekBar.setOnSeekBarChangeListener(this);
        this.l = new WeakReference(seekBar);
        f.m(f.b().setCustomTitle(Config.c(this.f39a, this.h, this.f45g)).setView(viewF).setPositiveButton(R$string.ok, this).setNegativeButton(R$string.cancel, (DialogInterface$OnClickListener) null).create());
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.ext.Config$p
    public String toString() {
        return Tools.N1(this.f39a);
    }
}
