package android.ext;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public class p0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1169b;

    public p0(int i) {
        this(i, false);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        e1.d("ExitListener called: " + this.f1169b);
        f1.f953c = this.f1168a ? 1 : 0;
        f1.o();
    }

    public p0(int i, boolean z) {
        this.f1169b = i;
        this.f1168a = z;
    }
}
