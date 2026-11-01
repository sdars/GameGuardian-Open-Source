package android.ext;

import android.app.AlertDialog;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Script$multiChoice$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CharSequence[] f421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Script$multiChoice f422c;

    Script$multiChoice$1(Script$multiChoice script$multiChoice, String str, CharSequence[] charSequenceArr) {
        this.f422c = script$multiChoice;
        this.f420a = str;
        this.f421b = charSequenceArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertDialog alertDialogCreate = f.c(Tools.k0()).setCustomTitle(Tools.i0(Tools.N1(R$string.script), this.f420a)).setPositiveButton(b2.f(R$string.ok), this.f422c).setNegativeButton(b2.f(R$string.cancel), this.f422c).setMultiChoiceItems(this.f421b, this.f422c.e0, this.f422c).create();
        f.k(alertDialogCreate, this.f422c);
        f.m(alertDialogCreate);
        MainService.instance.y(true);
    }
}
