/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.EditText;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.Script;
import android.ext.Searcher;
import android.ext.TimeJumpPanel;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c2;
import android.ext.f;
import android.ext.j2;
import android.ext.p1;
import android.ext.t1;
import android.ext.y0;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class o2
extends p1 {
    static volatile String f = "0";
    static volatile o2 g;

    public o2() {
        super(2131297011, 2130968609);
        g = this;
    }

    public static void h(long l3) {
        if (MainService.instance.h.a(false, new Runnable(l3){
            final long a;
            {
                this.a = l3;
            }

            @Override
            public void run() {
                MainService.instance.i.e(this.a);
            }
        })) {
            MainService.instance.i.e(l3);
        }
        o2.j(l3);
        c2 c22 = MainService.instance.f;
        if (c22 != null) {
            String string2 = Tools.F((double)l3 / 1.0E9);
            c22.write("gg.timeJump(");
            Script.Consts.c(c22, string2);
            c22.write(")\n");
        }
    }

    public static long i(String string2) {
        double d4 = Tools.j1(string2 = string2.trim());
        if (!(d4 < (double)-92233720L)) {
            if (!(d4 > (double)92233720L)) {
                return (long)(d4 * 1.0E9);
            }
            t1.a a4 = new t1.a(Tools.L1(b2.f(2131296826), string2, 92233720L));
            a4.c(string2);
            a4.a(92233720L);
            throw a4;
        }
        t1.a a5 = new t1.a(Tools.L1(b2.f(2131296827), string2, -92233720L));
        a5.c(string2);
        a5.a(-92233720L);
        throw a5;
    }

    static void j(long l3) {
        Config.b((int)2131034204).d = (int)((double)l3 / 1.0E9 * 1000.0);
        Config.k();
        TimeJumpPanel timeJumpPanel = MainService.instance.k;
        if (timeJumpPanel != null) {
            timeJumpPanel.r();
        }
    }

    @Override
    public void onClick(View view) {
        new b(this).onClick(view);
    }

    private class b
    implements View.OnClickListener,
    DialogInterface.OnClickListener,
    DialogInterface.OnShowListener,
    DialogInterface.OnDismissListener,
    TextWatcher {
        EditText a;
        TextView b;
        TextView c;
        AlertDialog d;
        final o2 e;

        private b(o2 o22) {
            this.e = o22;
        }

        public void a() {
            Object object = this.a;
            TextView textView = this.b;
            if (object == null) {
                object = "?";
            } else {
                try {
                    object = Tools.g1(o2.i(object.getText().toString().trim()) / 1000000000L);
                }
                catch (NumberFormatException numberFormatException) {
                    object = "???";
                }
            }
            if (textView != null) {
                textView.setText((CharSequence)object);
            }
        }

        public void afterTextChanged(Editable editable) {
            this.a();
        }

        public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
        }

        public void onClick(DialogInterface dialogInterface, int n3) {
            try {
                String string2 = j2.h(this.a.getText().toString().trim());
                o2.h(o2.i(string2));
                y0.b(string2, 1);
                Tools.D(dialogInterface);
                return;
            }
            catch (NumberFormatException numberFormatException) {
                j2.i(numberFormatException, this.a);
                return;
            }
        }

        public void onClick(View object) {
            block8: {
                View view;
                block10: {
                    block9: {
                        block7: {
                            if (object == null || object.getTag() instanceof p1) break block7;
                            int n3 = object.getId();
                            if (n3 != 2131034205) {
                                if (n3 != 2131034246) {
                                    this.onClick((DialogInterface)this.d, -1);
                                } else {
                                    Searcher.I(b2.f(2131296420));
                                }
                            } else {
                                object = Config.b(2131034205);
                                ((Config.p)object).g(new Config.p.b(this, (Config.p)object){
                                    final Config.p a;
                                    final b b;
                                    {
                                        this.b = b4;
                                        this.a = p3;
                                    }

                                    @Override
                                    public void a(int n3) {
                                        this.a.g(null);
                                        this.b.c.setText((CharSequence)this.a.toString());
                                    }
                                });
                                ((Config.p)object).b();
                            }
                            break block8;
                        }
                        view = a.d.f(2131099689, null);
                        Config.m((ImageView)view.findViewById(2131034246)).setOnClickListener((View.OnClickListener)this);
                        this.b = (TextView)view.findViewById(2131034285);
                        object = (TextView)view.findViewById(2131034205);
                        this.c = object;
                        object.setOnClickListener((View.OnClickListener)this);
                        this.c.setText((CharSequence)Config.b(2131034205).toString());
                        this.a = (EditText)view.findViewById(2131034426);
                        String string2 = f;
                        if (string2.length() == 0) break block9;
                        object = string2;
                        if (!"0".equals(string2)) break block10;
                    }
                    object = Tools.F((double)Config.v / 1000.0);
                }
                this.a.setText((CharSequence)object);
                this.a.addTextChangedListener(this);
                this.a.setDataType(1);
                this.a();
                object = android.ext.f.b().setView(InternalKeyboard.d(view)).setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296295), null).create();
                this.d = object;
                android.ext.f.l((AlertDialog)object, this);
                android.ext.f.k(this.d, this);
                android.ext.f.n(this.d, this.a);
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void onDismiss(DialogInterface dialogInterface) {
            f = this.a.getText().toString().trim();
            try {
                o2.j(o2.i(j2.h(f)));
                return;
            }
            catch (NumberFormatException numberFormatException) {
                return;
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this);
        }

        public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
            this.a();
        }
    }
}

