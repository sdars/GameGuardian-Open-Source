package android.ext;

import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class o2 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile String f1158f = "0";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile o2 f1159g;

    public o2() {
        super(R$string.time_jump, R$drawable.ic_fast_forward_white_24dp);
        f1159g = this;
    }

    public static void h(long j) {
        if (MainService.instance.h.a(false, new o2$a(j))) {
            MainService.instance.i.e(j);
        }
        j(j);
        c2 c2Var = MainService.instance.f216f;
        if (c2Var != null) {
            String strF = Tools.F(j / 1.0E9d);
            c2Var.write("gg.timeJump(");
            Script$Consts.c(c2Var, strF);
            c2Var.write(")\n");
        }
    }

    public static long i(String str) {
        String strTrim = str.trim();
        double dJ1 = Tools.j1(strTrim);
        if (dJ1 < -92233720) {
            t1$a t1_a = new t1$a(Tools.L1(b2.f(R$string.number_less), strTrim, -92233720L));
            t1_a.c(strTrim);
            t1_a.a(-92233720L);
            throw t1_a;
        }
        if (dJ1 <= 92233720) {
            return (long) (dJ1 * 1.0E9d);
        }
        t1$a t1_a2 = new t1$a(Tools.L1(b2.f(R$string.number_greater), strTrim, 92233720L));
        t1_a2.c(strTrim);
        t1_a2.a(92233720L);
        throw t1_a2;
    }

    static void j(long j) {
        Config.b(R$id.config_time_jump_last).f42d = (int) ((j / 1.0E9d) * 1000.0d);
        Config.k();
        TimeJumpPanel timeJumpPanel = MainService.instance.k;
        if (timeJumpPanel != null) {
            timeJumpPanel.r();
        }
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        new o2$b(this, null).onClick(view);
    }
}
