package android.ext;

import android.content.DialogInterface;
import android.view.View;
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
public class m1 extends j2 implements View.OnClickListener {
    public m1() {
        super(R.string.help_mask_search_title, R.drawable.ic_mask_white_24dp);
    }

    public static boolean k(byte b2, String str, long j, int i, int i2, long j2, long j3, boolean z, long j4) {
        int iD = i & 127;
        MainService mainService = MainService.instance;
        if (mainService.p0 != 0 && !z) {
            iD &= MainService.D() & 127;
        }
        int i3 = iD;
        if (i3 == 0) {
            mainService.n(b2);
            return true;
        }
        long[] jArrT = Searcher.t(str, j);
        int i4 = i3 | i2;
        if (!mainService.a1()) {
            throw new NumberFormatException(b2.f(R.string.busy_dialog_fail));
        }
        if (mainService.p0 != 0 && z) {
            mainService.n(b2);
        }
        if (mainService.p0 == 0) {
            mainService.q0 = false;
            mainService.i.x0(b2);
        }
        mainService.R(b2);
        mainService.r0 = false;
        mainService.i.o0(b2, jArrT[0], jArrT[1], i4, j2, j3, j4);
        MainService.N0(i3, b2);
        return false;
    }

    public static boolean l(String str, long j, int i, int i2, long j2, long j3, boolean z, long j4) {
        String strH = j2.h(str);
        boolean zK = k((byte) 0, strH, j, i, i2, j2, j3, z, j4);
        c2 c2Var = MainService.instance.f216f;
        if (c2Var != null) {
            if (z) {
                c2Var.write("\ngg.clearResults()\n");
            }
            c2Var.write((z || MainService.instance.p0 == 0) ? "gg.searchAddress(" : "gg.refineAddress(");
            Script.Consts.c(c2Var, strH);
            c2Var.write(", ");
            Script.Consts.b(c2Var, j);
            c2Var.write(", ");
            Script.Consts.a(c2Var, c2Var.f697c.f372b, i);
            c2Var.write(", ");
            Script.Consts.a(c2Var, c2Var.f697c.f374d, i2);
            c2Var.write(", ");
            Script.Consts.b(c2Var, j2);
            c2Var.write(", ");
            Script.Consts.b(c2Var, j3);
            c2Var.write(", ");
            c2Var.write(Long.toString(j4));
            c2Var.write(")\n");
        }
        return zK;
    }

    @Override // android.ext.j2
    public void j(DialogInterface dialogInterface, int i) {
        l(this.j.f(), this.j.a(), i, this.j.i(), this.j.e(0), this.j.e(1), this.i == -3, this.j.b());
    }

    @Override // android.ext.j2, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1037f = this.j.f();
        this.h = this.j.c();
        MainService.O0 = this.j.j();
        this.f1038g = this.j.i();
        super.onDismiss(dialogInterface);
    }
}
