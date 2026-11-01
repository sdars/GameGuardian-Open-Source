package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.util.SparseIntArray;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class u2 implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c$a[] f1273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DialogInterface$OnClickListener f1275c;

    public u2(a.e eVar, SparseIntArray sparseIntArray, String str, String str2, DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        c$a[] c_aArrX = c.x(eVar, sparseIntArray);
        this.f1273a = c_aArrX;
        this.f1274b = str;
        this.f1275c = dialogInterface$OnClickListener;
        if (eVar.size() == 1) {
            onClick(null, 0);
        } else {
            f.o(f.c(Tools.k0()).setCustomTitle(Tools.h0(str2)).setAdapter(new u2$a(this, MainService.context, c_aArrX), this).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null));
        }
    }

    public u2(a.e eVar, String str, String str2, DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        this(eVar, null, str, str2, dialogInterface$OnClickListener);
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            int i2 = this.f1273a[i].f675a;
            if (!"0".equals(this.f1274b)) {
                c.e(0L, this.f1274b, i2);
            }
            if (dialogInterface != null) {
                Tools.D(dialogInterface);
            }
            this.f1275c.onClick(dialogInterface, i2);
        } catch (NumberFormatException e2) {
            j2.i(e2, null);
        }
    }
}
