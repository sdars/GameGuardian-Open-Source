package android.ext;

import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class w1 extends j2 {
    private static String l = "0";
    private static boolean m = true;

    public w1() {
        super(R$string.help_pointer_search_title, R$drawable.ic_pointer_white_24dp);
    }

    private int k() {
        z1$d z1_d = MainService.instance.v0;
        return (z1_d == null || !z1_d.n) ? 4 : 36;
    }

    @Override // android.ext.j2
    public void j(DialogInterface dialogInterface, int i) {
    }

    public void l(String str) {
        if (MainService.instance.i.d0()) {
            MainService mainService = MainService.instance;
            int iK = k();
            if (this.j == null) {
                this.j = new Searcher(4, iK);
            }
            this.j.u(str == null);
            Searcher searcher = this.j;
            if (str == null) {
                str = this.f1037f;
            }
            searcher.z(str);
            this.j.y(b2.f(R$string.mask_request));
            this.j.A(l);
            this.j.B(m);
            this.j.F(c.r(iK, iK != 4), iK);
            AlertDialog$Builder negativeButton = f.b().setView(this.j.l()).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null);
            if (mainService.p0 == 0 || (iK & MainService.D()) == 0) {
                negativeButton.setPositiveButton(b2.f(R$string.new_search), this);
            } else {
                negativeButton.setPositiveButton(b2.f(R$string.refine), this).setNeutralButton(b2.f(R$string.new_search), this);
            }
            AlertDialog alertDialogCreate = negativeButton.create();
            f.k(alertDialogCreate, this);
            f.l(alertDialogCreate, this);
            this.k = new WeakReference(alertDialogCreate);
            f.n(alertDialogCreate, this.j.g());
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
    @Override // android.ext.j2, android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        StringBuilder sb;
        boolean z;
        try {
            int i2 = 16;
            long jR = t1.r(j2.h(this.j.f()), 16);
            String strH = j2.h(this.j.h());
            if (!this.j.q()) {
                i2 = 10;
            }
            long jR2 = t1.r(strH, i2);
            int iJ = this.j.j();
            String string = c.G(jR, iJ) + 'h';
            String str = c.G(jR - jR2, iJ) + 'h';
            if (jR2 <= 0) {
                if (jR2 < 0) {
                    sb = new StringBuilder();
                    sb.append(string);
                    sb.append('~');
                    sb.append(str);
                }
                String str2 = string;
                long jE = this.j.e(0);
                long jE2 = this.j.e(1);
                if (i != -3 || (MainService.D() & iJ) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                i2.r(str2, iJ, false, 536870912, jE, jE2, z, this.j.b(), 1048576);
                MainService.instance.U0(1);
                Tools.U0(this.k);
                Tools.E(this.k);
            }
            sb = new StringBuilder();
            sb.append(str);
            sb.append('~');
            sb.append(string);
            string = sb.toString();
            String str3 = string;
            long jE3 = this.j.e(0);
            long jE4 = this.j.e(1);
            if (i != -3) {
                z = true;
            } else {
                z = true;
            }
            i2.r(str3, iJ, false, 536870912, jE3, jE4, z, this.j.b(), 1048576);
            MainService.instance.U0(1);
            Tools.U0(this.k);
        } catch (NumberFormatException e2) {
            j2.i(e2, this.j.g());
            return;
        } catch (Throwable th) {
            e1.l("Exception on start search", th);
        }
        Tools.E(this.k);
    }

    @Override // android.ext.j2, android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        if (view == null || !(view.getTag() instanceof Integer)) {
            l(null);
        } else {
            onClick(null, ((Integer) view.getTag()).intValue());
        }
    }

    @Override // android.ext.j2, android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Searcher searcher = this.j;
        if (searcher != null) {
            m = searcher.q();
            l = this.j.h();
            this.f1037f = this.j.f();
        }
        super.onDismiss(dialogInterface);
    }
}
