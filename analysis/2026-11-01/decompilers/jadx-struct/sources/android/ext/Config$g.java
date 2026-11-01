package android.ext;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.SeekBar;
import catch_.me_.if_.you_.can_.R$drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class Config$g extends Config$OptionSeek {
    private WeakReference m;

    Config$g(int i, int i2, int i3, int i4, String str, boolean z, int i5) {
        super(i, i2, i3, i4, str, z, i5);
        this.m = new WeakReference(null);
    }

    @Override // android.ext.Config$OptionSeek
    protected void h() {
        super.h();
        SeekBar seekBar = (SeekBar) this.l.get();
        if (seekBar == null) {
            return;
        }
        ImageView imageView = new ImageView(seekBar.getContext());
        imageView.setImageResource(R$drawable.ic_tooltip_edit_white_24dp);
        this.m = new WeakReference(imageView);
        Config.n(imageView, Config.e(seekBar.getProgress()));
        ViewParent parent = seekBar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).addView(imageView);
        }
    }

    @Override // android.ext.Config$OptionSeek, android.widget.SeekBar$OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        ImageView imageView = (ImageView) this.m.get();
        if (imageView == null) {
            return;
        }
        Config.n(imageView, Config.e(i));
    }
}
