/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.DialogInterface;
import android.ext.MainService;
import android.ext.Script;
import android.ext.Searcher;
import android.ext.b2;
import android.ext.c2;
import android.ext.j2;
import android.view.View;

public class m1
extends j2
implements View.OnClickListener {
    public m1() {
        super(2131296641, 2130968629);
    }

    public static boolean k(byte by, String object, long l3, int n3, int n4, long l4, long l5, boolean bl, long l6) {
        int n5 = n3 & 0x7F;
        MainService mainService = MainService.instance;
        n3 = n5;
        if (mainService.p0 != 0L) {
            n3 = n5;
            if (!bl) {
                n3 = n5 & (MainService.D() & 0x7F);
            }
        }
        if (n3 == 0) {
            mainService.n(by);
            return true;
        }
        object = Searcher.t((String)object, l3);
        if (mainService.a1()) {
            if (mainService.p0 != 0L && bl) {
                mainService.n(by);
            }
            if (mainService.p0 == 0L) {
                mainService.q0 = false;
                mainService.i.x0(by);
            }
            mainService.R(by);
            mainService.r0 = false;
            mainService.i.o0(by, (long)object[0], (long)object[1], n3 | n4, l4, l5, l6);
            MainService.N0(n3, by);
            return false;
        }
        throw new NumberFormatException(b2.f(2131296305));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean l(String string2, long l3, int n3, int n4, long l4, long l5, boolean bl, long l6) {
        String string3 = j2.h(string2);
        boolean bl2 = m1.k((byte)0, string3, l3, n3, n4, l4, l5, bl, l6);
        c2 c22 = MainService.instance.f;
        if (c22 != null) {
            if (bl) {
                c22.write("\ngg.clearResults()\n");
            }
            string2 = !bl && MainService.instance.p0 != 0L ? "gg.refineAddress(" : "gg.searchAddress(";
            c22.write(string2);
            Script.Consts.c(c22, string3);
            c22.write(", ");
            Script.Consts.b(c22, l3);
            c22.write(", ");
            Script.Consts.a(c22, c22.c.b, n3);
            c22.write(", ");
            Script.Consts.a(c22, c22.c.d, n4);
            c22.write(", ");
            Script.Consts.b(c22, l4);
            c22.write(", ");
            Script.Consts.b(c22, l5);
            c22.write(", ");
            c22.write(Long.toString(l6));
            c22.write(")\n");
        }
        return bl2;
    }

    @Override
    public void j(DialogInterface object, int n3) {
        object = this.j.f();
        long l3 = this.j.a();
        int n4 = this.j.i();
        long l4 = this.j.e(0);
        long l5 = this.j.e(1);
        boolean bl = this.i == -3;
        m1.l((String)object, l3, n3, n4, l4, l5, bl, this.j.b());
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        this.f = this.j.f();
        this.h = this.j.c();
        MainService.O0 = this.j.j();
        this.g = this.j.i();
        super.onDismiss(dialogInterface);
    }
}

