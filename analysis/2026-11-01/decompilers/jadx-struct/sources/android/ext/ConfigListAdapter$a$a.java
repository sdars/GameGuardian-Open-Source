package android.ext;

import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$a$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ StringBuilder f55a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter$a f56b;

    ConfigListAdapter$a$a(ConfigListAdapter$a configListAdapter$a, StringBuilder sb) {
        this.f56b = configListAdapter$a;
        this.f55a = sb;
    }

    @Override // java.lang.Runnable
    public void run() {
        Tools.u1(f.m(f.b().setCustomTitle(Tools.g0(R$string.change_log)).setMessage(this.f55a.toString()).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null).create()));
    }
}
