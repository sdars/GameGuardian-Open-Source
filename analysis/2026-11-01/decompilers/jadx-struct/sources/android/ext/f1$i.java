package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f1$i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f974c;

    f1$i(Context context, String str, long j) {
        this.f972a = context;
        this.f973b = str;
        this.f974c = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Context contextF0 = this.f972a;
            if (contextF0 == null) {
                contextF0 = Tools.f0();
            }
            AlertDialog alertDialogCreate = f.c(contextF0).setMessage(this.f973b).setPositiveButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null).setNeutralButton(b2.f(R$string.skip), f1.w(this.f974c)).create();
            f.m(alertDialogCreate);
            Tools.u1(alertDialogCreate);
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
