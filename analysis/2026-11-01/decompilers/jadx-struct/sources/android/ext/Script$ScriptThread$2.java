package android.ext;

import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class Script$ScriptThread$2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ DialogInterface$OnClickListener f397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Script$ScriptThread f398e;

    Script$ScriptThread$2(Script$ScriptThread script$ScriptThread, String str, int i, String str2, DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        this.f398e = script$ScriptThread;
        this.f394a = str;
        this.f395b = i;
        this.f396c = str2;
        this.f397d = dialogInterface$OnClickListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        Tools.i(this.f394a, this.f395b, this.f396c, this.f397d);
    }
}
