/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import a.e;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.MainService;
import android.ext.Script;
import android.ext.Searcher;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.c2;
import android.ext.f;
import android.ext.f0;
import android.ext.i2;
import android.ext.j2;
import android.ext.p1;
import android.ext.t1;
import android.ext.u2;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class t0
extends j2
implements View.OnClickListener {
    private e l;
    private long m = 0L;
    private long n = -1L;
    private long o = 0L;

    public t0() {
        super(2131296947, 2130968619);
    }

    public static boolean k(byte by, String object, int n3, int n4, int n5, long l3, long l4, long l5) {
        long l6;
        long l7;
        int n6 = n4 & 0x3C000000;
        MainService mainService = MainService.instance;
        if ((n3 = n3 & 0x7F & (MainService.D() & 0x7F)) == 0) {
            mainService.n(by);
            return true;
        }
        boolean bl = ((String)object).indexOf(126) != -1;
        t1.b b4 = new t1.b();
        if (bl) {
            if (n6 != 0x20000000 && n6 != 0x10000000) {
                throw new NumberFormatException(Tools.L1(b2.f(2131296384), b2.f(2131296649), c.B().get(n6)));
            }
            object = i2.w(b4, (String)object, n3, n6);
            l7 = ((i2.b)object).a;
            l6 = ((i2.b)object).b;
            n4 = ((i2.b)object).c;
            n6 = ((i2.b)object).d;
        } else {
            l7 = c.d(b4, (String)object, n3);
            n4 = b4.c;
            n4 = n3 & n4;
            l6 = 0L;
        }
        n3 = n4;
        if (Integer.bitCount(n4) > 1) {
            n3 = n4 = c.g(n4, l7, b4.b);
            if (l6 != 0L) {
                n3 = c.g(n4, l6, b4.b);
            }
        }
        if (mainService.a1()) {
            mainService.R(by);
            mainService.r0 = false;
            object = mainService.i;
            n4 = bl ? 0x800000 | n3 : n3;
            ((f0)object).D(by, l7, l6, n4, n6, n5, l3, l4, l5);
            MainService.N0(n3, by);
            return false;
        }
        throw new NumberFormatException(b2.f(2131296305));
    }

    public static boolean l(String string2, int n3, int n4, int n5, long l3, long l4, long l5) {
        string2 = j2.h(string2);
        boolean bl = t0.k((byte)0, string2, n3, n4, n5, l3, l4, l5);
        c2 c22 = MainService.instance.f;
        if (c22 != null) {
            c22.write("gg.searchFuzzy(");
            Script.Consts.d(c22, string2);
            c22.write(", ");
            Script.Consts.a(c22, c22.c.c, n4);
            c22.write(", ");
            Script.Consts.a(c22, c22.c.b, n3);
            c22.write(", ");
            Script.Consts.b(c22, l3);
            c22.write(", ");
            Script.Consts.b(c22, l4);
            c22.write(", ");
            c22.write(Long.toString(l5));
            c22.write(")\n");
        }
        return bl;
    }

    public static boolean m(byte by, int n3, long l3, long l4, long l5) {
        MainService mainService = MainService.instance;
        if ((n3 &= 0x7F) == 0) {
            mainService.n(by);
            return true;
        }
        if (mainService.a1()) {
            if (mainService.p0 != 0L) {
                mainService.n(by);
            }
            mainService.q0 = true;
            mainService.i.x0(by);
            mainService.R(by);
            mainService.r0 = false;
            mainService.i.F(by, n3, l3, l4, l5);
            MainService.N0(n3, by);
            return false;
        }
        throw new NumberFormatException(b2.f(2131296305));
    }

    public static boolean n(int n3, long l3, long l4, long l5) {
        boolean bl = t0.m((byte)0, n3, l3, l4, l5);
        c2 c22 = MainService.instance.f;
        if (c22 != null) {
            c22.write("\ngg.startFuzzy(");
            Script.Consts.a(c22, c22.c.b, n3);
            c22.write(", ");
            Script.Consts.b(c22, l3);
            c22.write(", ");
            Script.Consts.b(c22, l4);
            c22.write(", ");
            c22.write(Long.toString(l5));
            c22.write(")\n");
        }
        return bl;
    }

    private void o() {
        View view = d.f(2131099680, null);
        SeekBar seekBar = (SeekBar)view.findViewById(2131034219);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(this, (TextView)view.findViewById(2131034218)){
            final TextView a;
            final t0 b;
            {
                this.b = t02;
                this.a = textView;
            }

            public void onProgressChanged(SeekBar object, int n3, boolean bl) {
                TextView textView = this.a;
                object = new StringBuilder();
                ((StringBuilder)object).append("");
                ((StringBuilder)object).append(n3 + 1);
                textView.setText((CharSequence)((StringBuilder)object).toString());
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296504)).setMessage((CharSequence)b2.f(2131296352)).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(this, seekBar){
            final SeekBar a;
            final t0 b;
            {
                this.b = t02;
                this.a = seekBar;
            }

            public void onClick(DialogInterface dialogInterface, int n3) {
                try {
                    t0.l("0", MainService.D() & 0x7F, 0x20000000, this.a.getProgress() + 1, this.b.j.e(0), this.b.j.e(1), this.b.j.b());
                    return;
                }
                catch (NumberFormatException numberFormatException) {
                    j2.i(numberFormatException, this.b.j.g());
                    return;
                }
            }
        }).setNegativeButton((CharSequence)b2.f(2131296311), null).setView(view));
    }

    private void p() {
        Object object = MainService.instance;
        if (!((MainService)object).i.d0()) {
            return;
        }
        int n3 = MainService.D();
        if (((MainService)object).p0 == 0L) {
            object = new Searcher(1, n3);
            this.j = object;
            this.l = ((Searcher)object).G(n3);
            this.j.y(b2.f(2131297042));
            object = android.ext.f.b().setView(this.j.l()).setPositiveButton((CharSequence)b2.f(2131296942), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
            android.ext.f.k((AlertDialog)object, this);
            android.ext.f.l((AlertDialog)object, this);
            this.k = new WeakReference<Object>(object);
            android.ext.f.m((AlertDialog)object);
            return;
        }
        object = new Searcher(2, n3);
        this.j = object;
        this.l = ((Searcher)object).G(n3);
        this.j.y(b2.f(2131296332));
        this.j.C(this);
        object = this.j.l();
        ((Button)object.findViewById(2131034245)).setOnClickListener((View.OnClickListener)this);
        ((Button)object.findViewById(2131034341)).setOnClickListener((View.OnClickListener)this);
        ((Button)object.findViewById(2131034305)).setOnClickListener((View.OnClickListener)this);
        ((Button)object.findViewById(2131034408)).setOnClickListener((View.OnClickListener)this);
        object = android.ext.f.b().setView((View)object).create();
        android.ext.f.k((AlertDialog)object, this);
        android.ext.f.l((AlertDialog)object, this);
        this.k = new WeakReference<Object>(object);
        android.ext.f.n((AlertDialog)object, this.j.g());
    }

    @Override
    public void j(DialogInterface dialogInterface, int n3) {
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int n3) {
        if (n3 == -1) {
            this.onClick((View)((AlertDialog)dialogInterface).getButton(-1));
            return;
        }
        if (MainService.instance.p0 == 0L) {
            MainService.O0 = n3;
            t0.n(n3, this.m, this.n, this.o);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onClick(View view) {
        block16: {
            block19: {
                int n3;
                block17: {
                    block18: {
                        MainService mainService = MainService.instance;
                        if (view == null || view.getTag() instanceof p1) break block16;
                        if (view.getTag() instanceof Integer && mainService.p0 == 0L) {
                            try {
                                this.m = this.j.e(0);
                                this.n = this.j.e(1);
                                this.o = this.j.b();
                            }
                            catch (NumberFormatException numberFormatException) {
                                j2.i(numberFormatException, null);
                                return;
                            }
                            Tools.U0(this.k);
                            n3 = this.j.j();
                            if (n3 == 0) {
                                new u2(this.l, "0", b2.f(2131297042), this);
                            } else {
                                t0.n(n3, this.m, this.n, this.o);
                            }
                        }
                        switch (view.getId()) {
                            default: {
                                break;
                            }
                            case 2131034408: {
                                n3 = 0x8000000;
                                break block17;
                            }
                            case 2131034341: {
                                n3 = 0x10000000;
                                break block17;
                            }
                            case 2131034305: {
                                n3 = 0x4000000;
                                break block17;
                            }
                            case 2131034245: {
                                if (Searcher.L || mainService.R) break block18;
                                this.o();
                            }
                        }
                        n3 = 0;
                        break block17;
                    }
                    n3 = 0x20000000;
                }
                if (n3 != 0) {
                    NumberFormatException numberFormatException2;
                    block15: {
                        int n4;
                        block14: {
                            try {
                                n4 = this.j.j();
                                if (n4 != 0 && Searcher.L) break block14;
                            }
                            catch (NumberFormatException numberFormatException2) {
                                break block15;
                            }
                            n4 = MainService.D() & 0x7F;
                        }
                        t0.l(this.j.f(), n4, n3, 1, this.j.e(0), this.j.e(1), this.j.b());
                        break block19;
                    }
                    j2.i(numberFormatException2, this.j.g());
                    return;
                }
            }
            Tools.U0(this.k);
            Tools.E(this.k);
            return;
        }
        new t0().p();
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        MainService.O0 = this.j.j();
        super.onDismiss(dialogInterface);
    }
}

