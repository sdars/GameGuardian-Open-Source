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
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
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
                String str = id == R.id.eMaxShow ? "100" : "";
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
                i = id == R.id.sFractional ? 536870912 : 0;
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
            this.f1187a = gga.d.f(R.layout.service_filter_search, null);
            this.t = Tools.M0();
            this.f1188b = (EditText) this.f1187a.findViewById(R.id.eMaxShow);
            this.f1189c = (CheckBox) this.f1187a.findViewById(R.id.cAddrGreat);
            this.f1190d = (EditText) this.f1187a.findViewById(R.id.eAddrGreat);
            this.f1191e = (CheckBox) this.f1187a.findViewById(R.id.cAddrLess);
            this.f1192f = (EditText) this.f1187a.findViewById(R.id.eAddrLess);
            this.f1193g = (CheckBox) this.f1187a.findViewById(R.id.cValGreat);
            this.h = (EditText) this.f1187a.findViewById(R.id.eValGreat);
            this.i = (CheckBox) this.f1187a.findViewById(R.id.cValLess);
            this.j = (EditText) this.f1187a.findViewById(R.id.eValLess);
            this.k = (CheckBox) this.f1187a.findViewById(R.id.cType);
            this.l = (SystemSpinner) this.f1187a.findViewById(R.id.sType);
            this.m = (CheckBox) this.f1187a.findViewById(R.id.cFractional);
            this.n = (SystemSpinner) this.f1187a.findViewById(R.id.sFractional);
            this.o = (EditText) this.f1187a.findViewById(R.id.eFractional);
            this.p = (CheckBox) this.f1187a.findViewById(R.id.cPointer);
            this.q = (SystemSpinner) this.f1187a.findViewById(R.id.sPointer);
            int[] iArr = {R.id.value_hex, R.id.value_rhex, R.id.value_string, R.id.value_java, R.id.value_arm, R.id.value_thumb, R.id.value_arm8};
            CharSequence[] charSequenceArrL = n1.l();
            int[] iArrG = n1.g();
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= this.r.length) {
                    this.f1189c.setText(Tools.N1(R.string.address) + " ≥");
                    this.f1191e.setText(Tools.N1(R.string.address) + " ≤");
                    this.f1193g.setText(Tools.N1(R.string.number) + " ≥");
                    this.i.setText(Tools.N1(R.string.number) + " ≤");
                    this.l.setData(c.o(-1));
                    Tools.r1(this.m);
                    this.m.setOnLongClickListener(this);
                    this.n.setData(c.C());
                    gga.e eVar = new gga.e();
                    eVar.put(4, Tools.t("-: " + b2.f(R.string.no), Tools.d0(R.color.pointer_unknown)));
                    eVar.put(8, Tools.t("R: " + b2.f(R.string.read_only), Tools.d0(R.color.pointer_readable)));
                    eVar.put(16, Tools.t("W: " + b2.f(R.string.writable), Tools.d0(R.color.pointer_writable)));
                    eVar.put(2, Tools.t("X: " + b2.f(R.string.executable), Tools.d0(R.color.pointer_executable)));
                    eVar.put(1, Tools.t("WX: " + b2.f(R.string.writable_and_executable), Tools.d0(R.color.pointer_executable_writable)));
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
            if (view == null || view.getId() != R.id.cFractional) {
                return false;
            }
            f.o(ggf.b().setMessage(b2.f(R.string.fractional_hint_)).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
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
                AlertDialog alertDialogCreate = ggf.b().setView(InternalKeyboard.d(Tools.O0(this.f1187a))).setPositiveButton(b2.f(R.string.apply), this).setNeutralButton(b2.f(R.string.reset_button), this).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).create();
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
                    throw new NumberFormatException(Tools.L1(b2.f(R.string.number_less), b2.f(R.string.max_show_rec), 1));
                }
                if (iM > 100000) {
                    throw new NumberFormatException(Tools.L1(b2.f(R.string.number_greater), b2.f(R.string.max_show_rec), 100000));
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
                f.o(ggf.b().setCustomTitle(Tools.g0(R.string.error)).setMessage(e2.getMessage()).setPositiveButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
            }
        }
    }

    public q0(MainService mainService) {
        super(R.string.filter, R.drawable.ic_filter_white_24dp);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }
}
