/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.MainService;
import android.ext.Searcher;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.e1;
import android.ext.f;
import android.ext.i2;
import android.ext.j2;
import android.ext.t1;
import android.ext.z1;
import android.view.View;
import java.lang.ref.WeakReference;

public class w1
extends j2 {
    private static String l = "0";
    private static boolean m = true;

    public w1() {
        super(2131296647, 2130968640);
    }

    private int k() {
        z1.d d4 = MainService.instance.v0;
        int n3 = d4 != null && d4.n ? 36 : 4;
        return n3;
    }

    @Override
    public void j(DialogInterface dialogInterface, int n3) {
    }

    public void l(String object) {
        if (!MainService.instance.i.d0()) {
            return;
        }
        MainService mainService = MainService.instance;
        int n3 = this.k();
        if (this.j == null) {
            this.j = new Searcher(4, n3);
        }
        Object object2 = this.j;
        boolean bl = false;
        boolean bl2 = object == null;
        ((Searcher)object2).u(bl2);
        Searcher searcher = this.j;
        object2 = object;
        if (object == null) {
            object2 = this.f;
        }
        searcher.z((String)object2);
        this.j.y(b2.f(2131296768));
        this.j.A(l);
        this.j.B(m);
        object = this.j;
        bl2 = bl;
        if (n3 != 4) {
            bl2 = true;
        }
        ((Searcher)object).F(c.r(n3, bl2), n3);
        object = android.ext.f.b().setView(this.j.l()).setNegativeButton((CharSequence)b2.f(2131296311), null);
        if (mainService.p0 != 0L && (n3 & MainService.D()) != 0) {
            object.setPositiveButton((CharSequence)b2.f(2131296889), (DialogInterface.OnClickListener)this).setNeutralButton((CharSequence)b2.f(2131296802), (DialogInterface.OnClickListener)this);
        } else {
            object.setPositiveButton((CharSequence)b2.f(2131296802), (DialogInterface.OnClickListener)this);
        }
        object = object.create();
        android.ext.f.k((AlertDialog)object, this);
        android.ext.f.l((AlertDialog)object, this);
        this.k = new WeakReference<Object>(object);
        android.ext.f.n((AlertDialog)object, this.j.g());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onClick(DialogInterface object, int n3) {
        NumberFormatException numberFormatException2;
        block10: {
            block12: {
                Throwable throwable2;
                block9: {
                    int n4;
                    long l3;
                    long l4;
                    block11: {
                        block8: {
                            String string2;
                            String string3;
                            int n5;
                            block7: {
                                try {
                                    object = j2.h(this.j.f());
                                    n5 = 16;
                                    l4 = t1.r((String)object, 16);
                                    object = j2.h(this.j.h());
                                    if (!this.j.q()) {
                                        n5 = 10;
                                    }
                                    l3 = t1.r((String)object, n5);
                                    n4 = this.j.j();
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append(c.G(l4, n4));
                                    ((StringBuilder)object).append('h');
                                    string3 = ((StringBuilder)object).toString();
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append(c.G(l4 - l3, n4));
                                    ((StringBuilder)object).append('h');
                                    string2 = ((StringBuilder)object).toString();
                                    long l5 = l3 - 0L;
                                    n5 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                                    if (n5 <= 0) break block7;
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append(string2);
                                    ((StringBuilder)object).append('~');
                                    ((StringBuilder)object).append(string3);
                                    break block8;
                                }
                                catch (Throwable throwable2) {
                                    break block9;
                                }
                                catch (NumberFormatException numberFormatException2) {
                                    break block10;
                                }
                            }
                            object = string3;
                            if (n5 >= 0) break block11;
                            object = new StringBuilder();
                            ((StringBuilder)object).append(string3);
                            ((StringBuilder)object).append('~');
                            ((StringBuilder)object).append(string2);
                        }
                        object = ((StringBuilder)object).toString();
                    }
                    l3 = this.j.e(0);
                    l4 = this.j.e(1);
                    boolean bl = n3 == -3 || (MainService.D() & n4) == 0;
                    i2.r((String)object, n4, false, 0x20000000, l3, l4, bl, this.j.b(), 0x100000);
                    MainService.instance.U0(1);
                    Tools.U0(this.k);
                    break block12;
                }
                e1.l("Exception on start search", throwable2);
            }
            Tools.E(this.k);
            return;
        }
        j2.i(numberFormatException2, this.j.g());
    }

    @Override
    public void onClick(View view) {
        if (view != null && view.getTag() instanceof Integer) {
            this.onClick(null, (Integer)view.getTag());
            return;
        }
        this.l(null);
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        Searcher searcher = this.j;
        if (searcher != null) {
            m = searcher.q();
            l = this.j.h();
            this.f = this.j.f();
        }
        super.onDismiss(dialogInterface);
    }
}

