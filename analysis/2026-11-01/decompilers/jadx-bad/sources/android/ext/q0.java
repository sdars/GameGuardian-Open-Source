package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class q0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final SparseBooleanArray f1186f = new SparseBooleanArray();

    private class b implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnShowListener, View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View f1187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EditText f1188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CheckBox f1189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EditText f1190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CheckBox f1191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private EditText f1192f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private CheckBox f1193g;
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

        class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CheckBox f1194a;

            a(CheckBox checkBox) {
                this.f1194a = checkBox;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                this.f1194a.setChecked(true);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* JADX INFO: renamed from: android.ext.q0$b$b, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0020b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CheckBox f1196a;

            DialogInterfaceOnClickListenerC0020b(CheckBox checkBox) {
                this.f1196a = checkBox;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f1196a.setChecked(true);
            }
        }

        private b() {
            int[] iArr = {1, 2, 4, 8, 16, 32, 64};
            this.r = iArr;
            this.s = new CheckBox[iArr.length];
        }

        private void a(View view, CheckBox checkBox) {
            if (view instanceof EditText) {
                ((EditText) view).addTextChangedListener(new a(checkBox));
            } else if (view instanceof SystemSpinner) {
                ((SystemSpinner) view).setOnItemSelectedListener(new DialogInterfaceOnClickListenerC0020b(checkBox));
            }
        }

        private void b(g2 g2Var, View view) {
            if (view == null) {
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    try {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            b(g2Var, childAt);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
                return;
            }
            int id = view.getId();
            if (id == -1) {
                return;
            }
            if (view instanceof EditText) {
                EditText editText = (EditText) view;
                String str = id == 2131034233 ? "100" : "";
                if (g2Var == null) {
                    editText.setText(this.t.getString(b2.b(id), str));
                    editText.setDataType(1);
                    return;
                } else {
                    String strTrim = editText.getText().toString().trim();
                    y0.b(strTrim, 1);
                    g2Var.k(b2.b(id), strTrim, "");
                    return;
                }
            }
            if (view instanceof SystemSpinner) {
                SystemSpinner systemSpinner = (SystemSpinner) view;
                i = id == 2131034381 ? 536870912 : 0;
                if (g2Var == null) {
                    systemSpinner.setSelected(this.t.getInt(b2.b(id), i));
                    return;
                } else {
                    g2Var.g(b2.b(id), systemSpinner.getSelected(), i);
                    return;
                }
            }
            if (view instanceof CheckBox) {
                CheckBox checkBox = (CheckBox) view;
                if (g2Var == null) {
                    checkBox.setChecked(q0.f1186f.get(id, false));
                } else {
                    q0.f1186f.put(id, checkBox.isChecked());
                }
            }
        }

        private void c() {
            if (this.f1187a != null) {
                return;
            }
            this.f1187a = a.d.f(2131099679, null);
            this.t = Tools.M0();
            this.f1188b = (EditText) this.f1187a.findViewById(2131034233);
            this.f1189c = (CheckBox) this.f1187a.findViewById(2131034136);
            this.f1190d = (EditText) this.f1187a.findViewById(2131034230);
            this.f1191e = (CheckBox) this.f1187a.findViewById(2131034137);
            this.f1192f = (EditText) this.f1187a.findViewById(2131034231);
            this.f1193g = (CheckBox) this.f1187a.findViewById(2131034141);
            this.h = (EditText) this.f1187a.findViewById(2131034234);
            this.i = (CheckBox) this.f1187a.findViewById(2131034142);
            this.j = (EditText) this.f1187a.findViewById(2131034235);
            this.k = (CheckBox) this.f1187a.findViewById(2131034140);
            this.l = (SystemSpinner) this.f1187a.findViewById(2131034383);
            this.m = (CheckBox) this.f1187a.findViewById(2131034138);
            this.n = (SystemSpinner) this.f1187a.findViewById(2131034381);
            this.o = (EditText) this.f1187a.findViewById(2131034232);
            this.p = (CheckBox) this.f1187a.findViewById(2131034139);
            this.q = (SystemSpinner) this.f1187a.findViewById(2131034382);
            int[] iArr = {2131034446, 2131034449, 2131034451, 2131034447, 2131034439, 2131034452, 2131034440};
            CharSequence[] charSequenceArrL = n1.l();
            int[] iArrG = n1.g();
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= this.r.length) {
                    this.f1189c.setText(Tools.N1(2131296264) + " ≥");
                    this.f1191e.setText(Tools.N1(2131296264) + " ≤");
                    this.f1193g.setText(Tools.N1(2131296825) + " ≥");
                    this.i.setText(Tools.N1(2131296825) + " ≤");
                    this.l.setData(c.o(-1));
                    Tools.r1(this.m);
                    this.m.setOnLongClickListener(this);
                    this.n.setData(c.C());
                    a.e eVar = new a.e();
                    eVar.put(4, Tools.t("-: " + b2.f(2131296805), Tools.d0(2130837520)));
                    eVar.put(8, Tools.t("R: " + b2.f(2131296883), Tools.d0(2130837519)));
                    eVar.put(16, Tools.t("W: " + b2.f(2131297108), Tools.d0(2130837521)));
                    eVar.put(2, Tools.t("X: " + b2.f(2131296421), Tools.d0(2130837517)));
                    eVar.put(1, Tools.t("WX: " + b2.f(2131297109), Tools.d0(2130837518)));
                    this.q.setData(eVar);
                    b(null, this.f1187a);
                    a(this.f1190d, this.f1189c);
                    a(this.f1192f, this.f1191e);
                    a(this.h, this.f1193g);
                    a(this.j, this.i);
                    a(this.l, this.k);
                    a(this.n, this.m);
                    a(this.o, this.m);
                    a(this.q, this.p);
                    return;
                }
                CheckBox checkBox = (CheckBox) this.f1187a.findViewById(iArr[i]);
                checkBox.setTextColor(iArrG[i]);
                checkBox.setText(charSequenceArrL[i]);
                if ((AddressArrayAdapter.f23d & this.r[i]) == 0) {
                    z = false;
                }
                checkBox.setChecked(z);
                checkBox.setId(-1);
                this.s[i] = checkBox;
                i++;
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            onClick(((AlertDialog) dialogInterface).getButton(i));
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (view == null || view.getId() != 2131034138) {
                return false;
            }
            f.o(f.b().setMessage(b2.f(2131296482)).setNegativeButton(b2.f(2131296836), (DialogInterface.OnClickListener) null));
            return true;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.t1(dialogInterface, -1, null, this, this.f1188b);
            Tools.s1(dialogInterface, -3, Boolean.TRUE, this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string;
            if (view == null || (view.getTag() instanceof p1)) {
                c();
                AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(Tools.O0(this.f1187a))).setPositiveButton(b2.f(2131296285), this).setNeutralButton(b2.f(2131296898), this).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).create();
                this.u = alertDialogCreate;
                f.l(alertDialogCreate, this);
                f.n(alertDialogCreate, this.f1188b);
                return;
            }
            if (view.getTag() instanceof Boolean) {
                this.f1189c.setChecked(false);
                this.f1191e.setChecked(false);
                this.f1193g.setChecked(false);
                this.i.setChecked(false);
                this.k.setChecked(false);
                this.m.setChecked(false);
                this.p.setChecked(false);
                for (int i = 0; i < this.r.length; i++) {
                    this.s[i].setChecked(false);
                }
            }
            try {
                int iM = b0.m(this.f1188b.getText().toString().trim());
                if (iM < 1) {
                    throw new NumberFormatException(Tools.L1(b2.f(2131296827), b2.f(2131296770), 1));
                }
                if (iM > 100000) {
                    throw new NumberFormatException(Tools.L1(b2.f(2131296826), b2.f(2131296770), 100000));
                }
                String string2 = !this.f1189c.isChecked() ? null : this.f1190d.getText().toString();
                String string3 = !this.f1191e.isChecked() ? null : this.f1192f.getText().toString();
                String string4 = !this.f1193g.isChecked() ? null : this.h.getText().toString();
                String string5 = !this.i.isChecked() ? null : this.j.getText().toString();
                int selected = !this.k.isChecked() ? 0 : this.l.getSelected();
                if (this.m.isChecked()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.n.getSelected() == 268435456 ? "!" : "");
                    sb.append(this.o.getText().toString());
                    string = sb.toString();
                } else {
                    string = null;
                }
                b0.o(string2, string3, string4, string5, selected, string, !this.p.isChecked() ? 0 : this.q.getSelected());
                b0.p(iM);
                int i2 = 0;
                for (int i3 = 0; i3 < this.r.length; i3++) {
                    if (this.s[i3].isChecked()) {
                        i2 |= this.r[i3];
                    }
                }
                AddressArrayAdapter.b(i2);
                g2 g2Var = new g2(this.t.edit());
                b(g2Var, this.f1187a);
                g2Var.commit();
                Tools.D(this.u);
                MainService.instance.D0(false);
            } catch (NumberFormatException e2) {
                e1.s("Error", e2);
                f.o(f.b().setCustomTitle(Tools.g0(2131296417)).setMessage(e2.getMessage()).setPositiveButton(b2.f(2131296836), (DialogInterface.OnClickListener) null));
            }
        }
    }

    public q0(MainService mainService) {
        super(2131296453, 2130968612);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }
}
