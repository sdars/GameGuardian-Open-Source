/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.ConfigListAdapter;
import android.ext.EditText;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c2;
import android.ext.f;
import android.ext.i0;
import android.ext.j2;
import android.ext.p1;
import android.ext.t1;
import android.ext.y0;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class y2
extends p1 {
    static volatile boolean f = false;
    static volatile long g = 0L;
    static volatile boolean h = false;
    static volatile long i = 1L;
    static volatile boolean j = false;
    static volatile double k = 0.0;
    static volatile boolean l = false;
    static volatile double m = 0.01;
    static volatile y2 n;

    public y2() {
        super(2131297065, 2130968604);
        n = this;
    }

    public static void h(int n3, long l3, long l4, double d4, double d5) {
        MainService.instance.i.V0(n3, l3, l4, d4, d5);
    }

    public static void i() {
        f = false;
        h = false;
        j = false;
        l = false;
    }

    @Override
    public void onClick(View view) {
        new b(this).onClick(view);
    }

    private class b
    implements View.OnClickListener,
    DialogInterface.OnClickListener,
    DialogInterface.OnShowListener {
        CheckBox a;
        EditText b;
        CheckBox c;
        EditText d;
        CheckBox e;
        EditText f;
        CheckBox g;
        EditText h;
        AlertDialog i;
        final y2 j;

        private b(y2 y22) {
            this.j = y22;
        }

        private void a(CheckBox checkBox, CheckBox checkBox2, boolean bl, EditText editText, String string2) {
            checkBox2.setChecked(bl);
            checkBox2.setText((CharSequence)b2.g(checkBox2.getText().toString()));
            editText.setDataType(1);
            editText.setText(string2);
            editText.setTag(checkBox2);
            editText.addTextChangedListener(new TextWatcher(this, checkBox2, checkBox){
                final CheckBox a;
                final CheckBox b;
                final b c;
                {
                    this.c = b4;
                    this.a = checkBox;
                    this.b = checkBox2;
                }

                public void afterTextChanged(Editable editable) {
                    this.a.setChecked(true);
                    editable = this.b;
                    if (editable != null) {
                        editable.setChecked(true);
                    }
                }

                public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
                }

                public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
                }
            });
            if (checkBox != null) {
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, checkBox2){
                    final CheckBox a;
                    final b b;
                    {
                        this.b = b4;
                        this.a = checkBox;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        if (!bl) {
                            this.a.setChecked(false);
                        }
                    }
                });
                checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, checkBox){
                    final CheckBox a;
                    final b b;
                    {
                        this.b = b4;
                        this.a = checkBox;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        if (bl) {
                            this.a.setChecked(true);
                        }
                    }
                });
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        private long b(EditText object, boolean bl) {
            String string2 = j2.h(object.getText().toString().trim());
            object = bl ? t1.x(string2) : t1.u(string2);
            long l3 = ((t1.b)object).a;
            y0.b(string2, 1);
            return l3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onClick(DialogInterface object, int n3) {
            NumberFormatException numberFormatException2;
            block13: {
                double d4;
                long l3;
                boolean bl;
                long l4;
                boolean bl2;
                boolean bl3;
                block12: {
                    long l5;
                    block11: {
                        try {
                            bl3 = this.a.isChecked();
                            l5 = 0L;
                            bl2 = false;
                            if (!bl3) break block11;
                            g = l4 = this.b(this.b, true);
                            bl = this.c.isChecked();
                            n3 = 2;
                            if (bl) {
                                i = l5 = this.b(this.d, true);
                            }
                            l3 = l5;
                            break block12;
                        }
                        catch (NumberFormatException numberFormatException2) {
                            break block13;
                        }
                    }
                    l3 = 0L;
                    bl = false;
                    n3 = 0;
                    l4 = l5;
                }
                f = bl3;
                h = bl;
                boolean bl4 = this.e.isChecked();
                double d5 = 0.0;
                if (bl4) {
                    k = d4 = Double.longBitsToDouble(this.b(this.f, false));
                    bl = this.g.isChecked();
                    if (bl) {
                        m = d5 = Double.longBitsToDouble(this.b(this.h, false));
                    }
                    n3 |= 4;
                } else {
                    d5 = 0.0;
                    d4 = 0.0;
                    bl = bl2;
                }
                j = bl4;
                l = bl;
                y2.h(n3, l4, l3, d4, d5);
                Tools.D(object);
                c2 c22 = MainService.instance.f;
                if (c22 != null) {
                    c22.write("gg.unrandomizer(");
                    if (bl3) {
                        c22.write(Long.toString(l4));
                        c22.write(", ");
                        c22.write(Long.toString(l3));
                        c22.write(", ");
                    } else {
                        c22.write("nil, nil, ");
                    }
                    if (bl4) {
                        c22.write(Double.toString(d4));
                        c22.write(", ");
                        object = Double.toString(d5);
                    } else {
                        object = "nil, nil";
                    }
                    c22.write((String)object);
                    c22.write(")\n");
                }
                return;
            }
            j2.i(numberFormatException2, null);
        }

        public void onClick(View view) {
            if (view != null && !(view.getTag() instanceof p1)) {
                if (view.getId() != 2131034328) {
                    this.onClick((DialogInterface)this.i, -1);
                } else {
                    ConfigListAdapter.t(2131296664);
                }
            } else {
                view = a.d.f(2131099694, null);
                TextView textView = (TextView)view.findViewById(2131034328);
                Tools.r1((View)textView);
                textView.setOnClickListener((View.OnClickListener)this);
                this.a = (CheckBox)view.findViewById(2131034373);
                this.b = (EditText)view.findViewById(2131034370);
                this.c = (CheckBox)view.findViewById(2131034372);
                this.d = (EditText)view.findViewById(2131034371);
                this.a(null, this.a, f, this.b, i0.c(g, 32));
                this.a(this.a, this.c, h, this.d, i0.c(i, 32));
                this.e = (CheckBox)view.findViewById(2131034369);
                this.f = (EditText)view.findViewById(2131034366);
                this.g = (CheckBox)view.findViewById(2131034368);
                this.h = (EditText)view.findViewById(2131034367);
                this.a(null, this.e, j, this.f, Double.toString(k));
                this.a(this.e, this.g, l, this.h, Double.toString(m));
                view = android.ext.f.b().setView(InternalKeyboard.d(view)).setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
                this.i = view;
                android.ext.f.l((AlertDialog)view, this);
                android.ext.f.n(this.i, this.b);
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this);
        }
    }
}

