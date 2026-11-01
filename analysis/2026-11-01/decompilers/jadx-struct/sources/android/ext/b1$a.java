package android.ext;

import android.app.AlertDialog;
import android.content.Intent;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class b1$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent[] f600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f602d;

    b1$a(int i, Intent[] intentArr, int i2, String str) {
        this.f599a = i;
        this.f600b = intentArr;
        this.f601c = i2;
        this.f602d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        b1$a$a b1_a_a = new b1$a$a(this);
        b1.B.E();
        AlertDialog alertDialogCreate = f.c(r.p).setMessage(b1.L + ": [" + this.f601c + "] " + this.f602d).setPositiveButton(R$string.yes, b1_a_a).setNegativeButton(R$string.no, b1_a_a).setCancelable(false).create();
        f.m(alertDialogCreate);
        b1.B.r = alertDialogCreate;
    }
}
