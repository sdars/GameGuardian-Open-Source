/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import a.e;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.ext.AddressArrayAdapter;
import android.ext.EditText;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.SystemSpinner;
import android.ext.Tools;
import android.ext.b0;
import android.ext.b2;
import android.ext.c;
import android.ext.e1;
import android.ext.f;
import android.ext.g2;
import android.ext.n1;
import android.ext.p1;
import android.ext.y0;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

public class q0
extends p1 {
    static final SparseBooleanArray f = new SparseBooleanArray();

    public q0(MainService mainService) {
        super(2131296453, 2130968612);
    }

    @Override
    public void onClick(View view) {
        new b(this).onClick(view);
    }

    private class b
    implements View.OnClickListener,
    DialogInterface.OnClickListener,
    DialogInterface.OnShowListener,
    View.OnLongClickListener {
        private View a;
        private EditText b;
        private CheckBox c;
        private EditText d;
        private CheckBox e;
        private EditText f;
        private CheckBox g;
        private EditText h;
        private CheckBox i;
        private EditText j;
        private CheckBox k;
        private SystemSpinner l;
        private CheckBox m;
        private SystemSpinner n;
        private EditText o;
        private CheckBox p;
        private SystemSpinner q;
        private final int[] r;
        private final CheckBox[] s;
        private SharedPreferences t;
        private AlertDialog u;
        final q0 v;

        private b(q0 object) {
            this.v = object;
            Object object2 = object = (Object)new int[7];
            object2[0] = true;
            object2[1] = 2;
            object2[2] = 4;
            object2[3] = 8;
            object2[4] = 16;
            object2[5] = 32;
            object2[6] = 64;
            this.r = (int[])object;
            this.s = new CheckBox[((Object)object).length];
        }

        private void a(View view, CheckBox checkBox) {
            if (view instanceof EditText) {
                ((EditText)view).addTextChangedListener(new TextWatcher(this, checkBox){
                    final CheckBox a;
                    final b b;
                    {
                        this.b = b4;
                        this.a = checkBox;
                    }

                    public void afterTextChanged(Editable editable) {
                        this.a.setChecked(true);
                    }

                    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
                    }

                    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
                    }
                });
            } else if (view instanceof SystemSpinner) {
                ((SystemSpinner)view).setOnItemSelectedListener(new DialogInterface.OnClickListener(this, checkBox){
                    final CheckBox a;
                    final b b;
                    {
                        this.b = b4;
                        this.a = checkBox;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        this.a.setChecked(true);
                    }
                });
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void b(g2 g22, View object) {
            if (object == null) {
                return;
            }
            boolean bl = object instanceof ViewGroup;
            int n3 = 0;
            int n4 = 0;
            if (!bl) {
                n4 = object.getId();
                if (n4 == -1) {
                    return;
                }
                if (object instanceof EditText) {
                    EditText editText = (EditText)object;
                    object = n4 == 2131034233 ? "100" : "";
                    if (g22 == null) {
                        editText.setText(this.t.getString(b2.b(n4), (String)object));
                        editText.setDataType(1);
                        return;
                    }
                    object = editText.getText().toString().trim();
                    y0.b((String)object, 1);
                    g22.k(b2.b(n4), (String)object, "");
                    return;
                }
                if (object instanceof SystemSpinner) {
                    object = (SystemSpinner)((Object)object);
                    if (n4 == 2131034381) {
                        n3 = 0x20000000;
                    }
                    if (g22 == null) {
                        ((SystemSpinner)((Object)object)).setSelected(this.t.getInt(b2.b(n4), n3));
                        return;
                    }
                    g22.g(b2.b(n4), ((SystemSpinner)((Object)object)).getSelected(), n3);
                    return;
                }
                if (!(object instanceof CheckBox)) return;
                object = (CheckBox)object;
                if (g22 == null) {
                    object.setChecked(f.get(n4, false));
                    return;
                }
                f.put(n4, object.isChecked());
                return;
            }
            object = (ViewGroup)object;
            int n5 = object.getChildCount();
            n3 = n4;
            while (n3 < n5) {
                try {
                    View view = object.getChildAt(n3);
                    if (view != null) {
                        this.b(g22, view);
                    }
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
                ++n3;
            }
        }

        private void c() {
            Object object;
            if (this.a != null) {
                return;
            }
            this.a = a.d.f(2131099679, null);
            this.t = Tools.M0();
            this.b = (EditText)this.a.findViewById(2131034233);
            this.c = (CheckBox)this.a.findViewById(2131034136);
            this.d = (EditText)this.a.findViewById(2131034230);
            this.e = (CheckBox)this.a.findViewById(2131034137);
            this.f = (EditText)this.a.findViewById(2131034231);
            this.g = (CheckBox)this.a.findViewById(2131034141);
            this.h = (EditText)this.a.findViewById(2131034234);
            this.i = (CheckBox)this.a.findViewById(2131034142);
            this.j = (EditText)this.a.findViewById(2131034235);
            this.k = (CheckBox)this.a.findViewById(2131034140);
            this.l = (SystemSpinner)this.a.findViewById(2131034383);
            this.m = (CheckBox)this.a.findViewById(2131034138);
            this.n = (SystemSpinner)this.a.findViewById(2131034381);
            this.o = (EditText)this.a.findViewById(2131034232);
            this.p = (CheckBox)this.a.findViewById(2131034139);
            this.q = (SystemSpinner)this.a.findViewById(2131034382);
            CharSequence[] charSequenceArray = n1.l();
            Object object2 = n1.g();
            int n3 = 0;
            while (true) {
                int n4 = this.r.length;
                boolean bl = true;
                if (n3 >= n4) break;
                object = (CheckBox)this.a.findViewById((new int[]{2131034446, 2131034449, 2131034451, 2131034447, 2131034439, 2131034452, 2131034440})[n3]);
                object.setTextColor((int)object2[n3]);
                object.setText(charSequenceArray[n3]);
                if ((AddressArrayAdapter.d & this.r[n3]) == 0) {
                    bl = false;
                }
                object.setChecked(bl);
                object.setId(-1);
                this.s[n3] = object;
                ++n3;
            }
            object2 = this.c;
            object = new StringBuilder();
            ((StringBuilder)object).append(Tools.N1(2131296264));
            ((StringBuilder)object).append(" ≥");
            object2.setText((CharSequence)((StringBuilder)object).toString());
            object = this.e;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(Tools.N1(2131296264));
            ((StringBuilder)object2).append(" ≤");
            object.setText((CharSequence)((StringBuilder)object2).toString());
            object = this.g;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(Tools.N1(2131296825));
            ((StringBuilder)object2).append(" ≥");
            object.setText((CharSequence)((StringBuilder)object2).toString());
            object2 = this.i;
            object = new StringBuilder();
            ((StringBuilder)object).append(Tools.N1(2131296825));
            ((StringBuilder)object).append(" ≤");
            object2.setText((CharSequence)((StringBuilder)object).toString());
            this.l.setData(android.ext.c.o(-1));
            Tools.r1((View)this.m);
            this.m.setOnLongClickListener((View.OnLongClickListener)this);
            this.n.setData(android.ext.c.C());
            object = new e();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("-: ");
            ((StringBuilder)object2).append(b2.f(2131296805));
            ((e)((Object)object)).put(4, Tools.t(((StringBuilder)object2).toString(), Tools.d0(2130837520)));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("R: ");
            ((StringBuilder)object2).append(b2.f(2131296883));
            ((e)((Object)object)).put(8, Tools.t(((StringBuilder)object2).toString(), Tools.d0(2130837519)));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("W: ");
            ((StringBuilder)object2).append(b2.f(2131297108));
            ((e)((Object)object)).put(16, Tools.t(((StringBuilder)object2).toString(), Tools.d0(2130837521)));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("X: ");
            ((StringBuilder)object2).append(b2.f(2131296421));
            ((e)((Object)object)).put(2, Tools.t(((StringBuilder)object2).toString(), Tools.d0(2130837517)));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("WX: ");
            ((StringBuilder)object2).append(b2.f(2131297109));
            ((e)((Object)object)).put(1, Tools.t(((StringBuilder)object2).toString(), Tools.d0(2130837518)));
            this.q.setData((e)((Object)object));
            this.b(null, this.a);
            this.a((View)this.d, this.c);
            this.a((View)this.f, this.e);
            this.a((View)this.h, this.g);
            this.a((View)this.j, this.i);
            this.a((View)this.l, this.k);
            this.a((View)this.n, this.m);
            this.a((View)this.o, this.m);
            this.a((View)this.q, this.p);
        }

        public void onClick(DialogInterface dialogInterface, int n3) {
            this.onClick((View)((AlertDialog)dialogInterface).getButton(n3));
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onClick(View object) {
            if (object != null && !(object.getTag() instanceof p1)) {
                NumberFormatException numberFormatException2;
                block12: {
                    block9: {
                        block10: {
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            int n3;
                            int n4;
                            block11: {
                                StringBuilder stringBuilder;
                                if (object.getTag() instanceof Boolean) {
                                    this.c.setChecked(false);
                                    this.e.setChecked(false);
                                    this.g.setChecked(false);
                                    this.i.setChecked(false);
                                    this.k.setChecked(false);
                                    this.m.setChecked(false);
                                    this.p.setChecked(false);
                                    for (n4 = 0; n4 < this.r.length; ++n4) {
                                        this.s[n4].setChecked(false);
                                    }
                                }
                                try {
                                    n3 = b0.m(this.b.getText().toString().trim());
                                    if (n3 < 1) break block9;
                                    if (n3 > 100000) break block10;
                                    object = !this.c.isChecked() ? null : this.d.getText().toString();
                                    string5 = !this.e.isChecked() ? null : this.f.getText().toString();
                                    string4 = !this.g.isChecked() ? null : this.h.getText().toString();
                                    string3 = !this.i.isChecked() ? null : this.j.getText().toString();
                                    n4 = !this.k.isChecked() ? 0 : this.l.getSelected();
                                    if (!this.m.isChecked()) {
                                        string2 = null;
                                        break block11;
                                    }
                                    stringBuilder = new StringBuilder();
                                    string2 = this.n.getSelected() == 0x10000000 ? "!" : "";
                                }
                                catch (NumberFormatException numberFormatException2) {
                                    break block12;
                                }
                                stringBuilder.append(string2);
                                stringBuilder.append(this.o.getText().toString());
                                string2 = stringBuilder.toString();
                            }
                            int n5 = !this.p.isChecked() ? 0 : this.q.getSelected();
                            b0.o((String)object, string5, string4, string3, n4, string2, n5);
                            b0.p(n3);
                            n5 = 0;
                            for (n4 = 0; n4 < this.r.length; ++n4) {
                                n3 = n5;
                                if (this.s[n4].isChecked()) {
                                    n3 = n5 | this.r[n4];
                                }
                                n5 = n3;
                            }
                            AddressArrayAdapter.b(n5);
                            object = new g2(this.t.edit());
                            this.b((g2)object, this.a);
                            ((g2)object).commit();
                            Tools.D((DialogInterface)this.u);
                            MainService.instance.D0(false);
                            return;
                        }
                        object = new NumberFormatException(Tools.L1(b2.f(2131296826), b2.f(2131296770), 100000));
                        throw object;
                    }
                    object = new NumberFormatException(Tools.L1(b2.f(2131296827), b2.f(2131296770), 1));
                    throw object;
                }
                e1.s("Error", numberFormatException2);
                android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296417)).setMessage((CharSequence)numberFormatException2.getMessage()).setPositiveButton((CharSequence)b2.f(2131296836), null));
                return;
            }
            this.c();
            object = android.ext.f.b().setView(InternalKeyboard.d(Tools.O0(this.a))).setPositiveButton((CharSequence)b2.f(2131296285), (DialogInterface.OnClickListener)this).setNeutralButton((CharSequence)b2.f(2131296898), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
            this.u = object;
            android.ext.f.l((AlertDialog)object, this);
            android.ext.f.n((AlertDialog)object, this.b);
        }

        public boolean onLongClick(View view) {
            if (view == null) {
                return false;
            }
            if (view.getId() != 2131034138) {
                return false;
            }
            android.ext.f.o(android.ext.f.b().setMessage((CharSequence)b2.f(2131296482)).setNegativeButton((CharSequence)b2.f(2131296836), null));
            return true;
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.t1(dialogInterface, -1, null, this, this.b);
            Tools.s1(dialogInterface, -3, Boolean.TRUE, this);
        }
    }
}

