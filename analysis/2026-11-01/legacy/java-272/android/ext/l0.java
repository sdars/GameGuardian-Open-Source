package android.ext;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
public class l0 implements TextWatcher, View.OnClickListener, View.OnLongClickListener {
    private static volatile boolean F = false;
    private final View[] A;
    private final int[][] B;
    private final android.ext.c C;
    private int D;
    private String E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f1051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f1052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckBox f1053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f1054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final EditText f1055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextView f1056g;
    private final EditText h;
    private final View i;
    private final EditText j;
    private final View k;
    private final View l;
    private final View m;
    private final View n;
    private final View o;
    private final View p;
    private final View q;
    private final View r;
    final CheckBox s;
    final CheckBox t;
    final CheckBox u;
    private final SystemSpinner v;
    final View w;
    private final EditText x;
    private final EditText y;
    private final Button z;

    class a extends InternalKeyboard.e {
        a() {
        }

        @Override // android.ext.InternalKeyboard.e
        protected boolean a(View view, boolean z) {
            return l0.this.u() || view == l0.this.f1055f;
        }
    }

    class b implements TextWatcher {
        b() {
        }

        private void a() {
            l0.this.t.setChecked(true);
            l0.this.u();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a();
        }
    }

    class c implements CompoundButton.OnCheckedChangeListener {
        c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                l0.this.u.setChecked(false);
            }
            l0.this.t.setChecked(true);
        }
    }

    class d implements CompoundButton.OnCheckedChangeListener {
        d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                l0.this.s.setChecked(false);
            }
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            l0.this.w.setVisibility(i == 3 ? 0 : 8);
        }
    }

    public l0(int i, android.ext.c cVar) {
        this.D = i;
        this.C = cVar.c();
        View viewF = a.d.f(R.layout.service_editor, null);
        this.f1050a = viewF;
        this.f1051b = (TextView) viewF.findViewById(R.id.message);
        this.f1052c = viewF.findViewById(R.id.name_row);
        this.f1053d = (CheckBox) viewF.findViewById(R.id.save_as);
        this.f1054e = viewF.findViewById(R.id.name_text);
        EditText editText = (EditText) viewF.findViewById(R.id.name);
        this.f1055f = editText;
        editText.setDataType(3);
        this.f1056g = (TextView) viewF.findViewById(R.id.type_hint);
        EditText editText2 = (EditText) viewF.findViewById(R.id.number);
        this.h = editText2;
        editText2.setDataType(1);
        viewF.findViewById(R.id.number_converter).setTag(new Object[]{editText2, Integer.valueOf(cVar.f674c)});
        this.i = viewF.findViewById(R.id.edit_step_row);
        EditText editText3 = (EditText) viewF.findViewById(R.id.edit_step);
        this.j = editText3;
        editText3.setDataType(1);
        viewF.findViewById(R.id.step_converter).setTag(editText3);
        View viewFindViewById = viewF.findViewById(R.id.edit_step_label);
        Tools.r1(viewFindViewById);
        viewFindViewById.setOnClickListener(this);
        CheckBox checkBox = (CheckBox) viewF.findViewById(R.id.add_not_replace);
        this.s = checkBox;
        Tools.r1(checkBox);
        checkBox.setOnLongClickListener(this);
        this.k = viewF.findViewById(R.id.fill);
        this.l = viewF.findViewById(R.id.fill_values);
        this.m = viewF.findViewById(R.id.fill_utf8);
        this.n = viewF.findViewById(R.id.fill_utf16le);
        this.o = viewF.findViewById(R.id.fill_hex);
        this.p = viewF.findViewById(R.id.fill_hex_utf8);
        this.q = viewF.findViewById(R.id.fill_hex_utf16le);
        this.r = viewF.findViewById(R.id.fill_hex_utf8_utf16le);
        this.t = (CheckBox) viewF.findViewById(R.id.change_value);
        this.u = (CheckBox) viewF.findViewById(R.id.freeze);
        this.v = (SystemSpinner) viewF.findViewById(R.id.freeze_spinner);
        this.w = viewF.findViewById(R.id.freeze_range);
        EditText editText4 = (EditText) viewF.findViewById(R.id.freeze_from);
        this.x = editText4;
        editText4.setDataType(1);
        viewF.findViewById(R.id.from_converter).setTag(editText4);
        EditText editText5 = (EditText) viewF.findViewById(R.id.freeze_to);
        this.y = editText5;
        editText5.setDataType(1);
        viewF.findViewById(R.id.to_converter).setTag(editText5);
        this.z = (Button) viewF.findViewById(R.id.ext_btn);
        a aVar = new a();
        for (View view : viewF.getFocusables(2)) {
            if (view instanceof EditText) {
                Tools.z1(view, aVar);
            }
        }
        this.A = new View[]{this.f1052c, this.f1053d, this.f1054e, this.i, this.k, this.z, this.t};
        int[][] iArr = {new int[]{1, 0, 1, 0, 0, 0, 0}, new int[]{1, 1, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 1, 1, 1, 1}, new int[]{1, 1, 0, 0, 0, 0, 0}};
        this.B = iArr;
        if (i < 0 || i >= iArr.length) {
            throw new IllegalArgumentException("Type must be between: 0 and " + (iArr.length - 1) + " but got: " + i);
        }
        t(i);
        this.E = b2.f(R.string.edit_examples);
        TextView textView = (TextView) this.f1050a.findViewById(R.id.value);
        if (i == 2) {
            Tools.r1(textView);
            textView.setOnClickListener(this);
            this.E = b2.f(R.string.edit_all_examples);
            p(F);
        } else if (i == 1) {
            Tools.r1(textView);
            textView.setOnClickListener(this);
        }
        this.z.setOnClickListener(this);
        textView.setText(Tools.O1(textView.getText().toString()) + ':');
        m();
        this.f1055f.addTextChangedListener(this);
    }

    private void m() {
        this.f1056g.setText(android.ext.c.s(this.C.f674c));
        this.h.setText(this.C.J());
        this.j.setText("0");
        this.t.setChecked(true);
        b bVar = new b();
        this.h.addTextChangedListener(bVar);
        this.j.addTextChangedListener(bVar);
        this.s.setOnCheckedChangeListener(new c());
        this.u.setOnCheckedChangeListener(new d());
        this.v.setData(h2.a0());
        this.v.setOnItemSelectedListener(new e());
        android.ext.c cVar = this.C;
        if (!(cVar instanceof h2)) {
            this.u.setChecked(false);
            this.v.setSelected(0);
            this.x.setText("0");
            this.y.setText("0");
            return;
        }
        h2 h2Var = (h2) cVar;
        this.f1055f.setText(h2Var.b0());
        this.u.setChecked(h2Var.m);
        this.v.setSelected(h2Var.n);
        this.x.setText(h2Var.c0(true));
        this.y.setText(h2Var.c0(false));
    }

    private void p(boolean z) {
        F = z;
        this.z.setText(b2.f(z ? R.string.less : R.string.more));
        int i = 8;
        this.i.setVisibility(z ? 0 : 8);
        this.k.setVisibility(z ? 0 : 8);
        this.m.setVisibility((z && this.C.f674c == 1) ? 0 : 8);
        this.n.setVisibility((!z || (this.C.f674c & 7) == 0) ? 8 : 0);
        if (z && this.C.f674c == 1) {
            i = 0;
        }
        this.o.setVisibility(i);
        this.p.setVisibility(i);
        this.q.setVisibility(i);
        this.r.setVisibility(i);
    }

    private void t(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.B[i];
            if (i2 >= iArr.length) {
                return;
            }
            this.A[i2].setVisibility(iArr[i2] == 1 ? 0 : 8);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u() {
        if ((Config.B & 1) == 0) {
            return false;
        }
        boolean z = this.h.isFocused() && t1.n(this.h.getText().toString());
        InternalKeyboard.i(this.h, z);
        return z;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f1053d.setChecked(true);
    }

    public String b() {
        if (this.i.getVisibility() != 0) {
            return "0";
        }
        String strTrim = this.j.getText().toString().trim();
        y0.b(strTrim, 1);
        return strTrim;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public android.ext.c c() {
        return this.C;
    }

    public String d() {
        String strTrim = this.f1055f.getText().toString().trim();
        y0.b(strTrim, 2);
        return strTrim;
    }

    public String e() {
        String strTrim = this.h.getText().toString().trim();
        y0.b(strTrim, 1);
        return strTrim;
    }

    public EditText f() {
        return this.h;
    }

    public h2 g() {
        return h(this.C);
    }

    public h2 h(android.ext.c cVar) {
        h2 h2Var = new h2(cVar);
        h2Var.m = this.u.isChecked();
        h2Var.d0(this.v.getSelected());
        if (h2Var.n == 3) {
            h2Var.e0(j2.h(this.x.getText().toString().trim()), j2.h(this.y.getText().toString().trim()));
        }
        if (!h2Var.m && this.s.isChecked()) {
            h2Var.f674c |= 1073741824;
        }
        if ((this.f1053d.getVisibility() == 0 && this.f1053d.isChecked()) || this.f1054e.getVisibility() == 0) {
            String strD = d();
            if (!h2Var.b0().equals(strD)) {
                h2Var.l = strD;
            }
        }
        return h2Var;
    }

    public View i() {
        return this.f1050a;
    }

    public View j() {
        return InternalKeyboard.d(k());
    }

    public View k() {
        return Tools.O0(i());
    }

    public void l() {
        this.f1053d.setChecked(true);
    }

    public boolean n() {
        if (this.u.isChecked()) {
            return true;
        }
        if (this.f1052c.getVisibility() == 0) {
            return (this.f1053d.getVisibility() == 0 && this.f1053d.isChecked()) || this.f1054e.getVisibility() == 0;
        }
        return false;
    }

    public boolean o() {
        return this.t.isChecked();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.edit_step_label) {
            ConfigListAdapter.t(R.string.help_fill);
            return;
        }
        if (id != R.id.ext_btn) {
            if (id != R.id.value) {
                return;
            }
            Searcher.I(this.E);
        } else {
            if (this.D == 2) {
                p(!F);
            }
            this.h.requestFocus();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (view == null || view.getId() != R.id.add_not_replace) {
            return false;
        }
        ConfigListAdapter.t(R.string.help_add_to_value);
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f1053d.setChecked(true);
    }

    public void q(View.OnClickListener onClickListener) {
        this.l.setOnClickListener(onClickListener);
        this.m.setOnClickListener(onClickListener);
        this.n.setOnClickListener(onClickListener);
        this.o.setOnClickListener(onClickListener);
        this.p.setOnClickListener(onClickListener);
        this.q.setOnClickListener(onClickListener);
        this.r.setOnClickListener(onClickListener);
    }

    public void r(CharSequence charSequence) {
        this.f1051b.setText(charSequence);
    }

    public void s(String str) {
        this.h.setText(str.trim());
    }
}
