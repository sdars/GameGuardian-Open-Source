package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
class t0$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SeekBar f1249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t0 f1250b;

    t0$b(t0 t0Var, SeekBar seekBar) {
        this.f1250b = t0Var;
        this.f1249a = seekBar;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            t0.l("0", MainService.D() & 127, 536870912, this.f1249a.getProgress() + 1, this.f1250b.j.e(0), this.f1250b.j.e(1), this.f1250b.j.b());
        } catch (NumberFormatException e2) {
            j2.i(e2, this.f1250b.j.g());
        }
    }
}
