package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
class b1$a$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b1$a f603a;

    b1$a$a(b1$a b1_a) {
        this.f603a = b1_a;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i != -2) {
            int i2 = -1;
            if (i == -1) {
                int length = this.f603a.f599a == 1 ? b1.L % this.f603a.f600b.length : 0;
                for (Intent intent : this.f603a.f600b) {
                    i2++;
                    if (i2 >= length) {
                        try {
                            if (this.f603a.f599a == 1) {
                                b1.L++;
                            }
                            r.n.startActivityForResult(intent, this.f603a.f599a);
                            break;
                        } catch (Throwable th) {
                            e1.l("intent fail", th);
                        }
                    }
                }
            }
        } else {
            b1.C.j &= ~this.f603a.f599a;
        }
        b1.B.r = null;
    }
}
