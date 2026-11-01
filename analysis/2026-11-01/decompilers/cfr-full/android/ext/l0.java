/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.EditText;
import android.ext.InternalKeyboard;
import android.ext.Searcher;
import android.ext.SystemSpinner;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.h2;
import android.ext.j2;
import android.ext.t1;
import android.ext.y0;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class l0
implements TextWatcher,
View.OnClickListener,
View.OnLongClickListener {
    private static volatile boolean F = false;
    private final View[] A;
    private final int[][] B;
    private final c C;
    private int D;
    private String E;
    private final View a;
    private final TextView b;
    private final View c;
    private final CheckBox d;
    private final View e;
    final EditText f;
    private final TextView g;
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

    public l0(int n3, c object) {
        this.D = n3;
        this.C = ((c)object).c();
        Object object2 = a.d.f(2131099678, null);
        this.a = object2;
        this.b = (TextView)object2.findViewById(2131034328);
        this.c = object2.findViewById(2131034338);
        this.d = (CheckBox)object2.findViewById(2131034385);
        this.e = object2.findViewById(2131034339);
        Object object32 = (EditText)object2.findViewById(2131034337);
        this.f = object32;
        ((EditText)object32).setDataType(3);
        this.g = (TextView)object2.findViewById(2131034432);
        object32 = (EditText)object2.findViewById(2131034346);
        this.h = object32;
        ((EditText)object32).setDataType(1);
        object2.findViewById(2131034347).setTag((Object)new Object[]{object32, ((c)object).c});
        this.i = object2.findViewById(2131034241);
        this.j = object = (EditText)object2.findViewById(2131034239);
        ((EditText)object).setDataType(1);
        object2.findViewById(2131034418).setTag(object);
        object = object2.findViewById(2131034240);
        Tools.r1((View)object);
        object.setOnClickListener((View.OnClickListener)this);
        object = (CheckBox)object2.findViewById(2131034115);
        this.s = object;
        Tools.r1((View)object);
        object.setOnLongClickListener((View.OnLongClickListener)this);
        this.k = object2.findViewById(2131034254);
        this.l = object2.findViewById(2131034261);
        this.m = object2.findViewById(2131034260);
        this.n = object2.findViewById(2131034259);
        this.o = object2.findViewById(2131034255);
        this.p = object2.findViewById(2131034257);
        this.q = object2.findViewById(2131034256);
        this.r = object2.findViewById(2131034258);
        this.t = (CheckBox)object2.findViewById(2131034147);
        this.u = (CheckBox)object2.findViewById(2131034265);
        this.v = (SystemSpinner)object2.findViewById(2131034269);
        this.w = object2.findViewById(2131034267);
        this.x = object = (EditText)object2.findViewById(2131034266);
        ((EditText)object).setDataType(1);
        object2.findViewById(2131034271).setTag(object);
        this.y = object = (EditText)object2.findViewById(2131034270);
        ((EditText)object).setDataType(1);
        object2.findViewById(2131034428).setTag(object);
        this.z = (Button)object2.findViewById(2131034248);
        object = new InternalKeyboard.e(this){
            final l0 a;
            {
                this.a = l02;
            }

            @Override
            protected boolean a(View view, boolean bl) {
                bl = this.a.u() || view == this.a.f;
                return bl;
            }
        };
        for (Object object32 : object2.getFocusables(2)) {
            if (!(object32 instanceof EditText)) continue;
            Tools.z1((View)object32, (View.OnFocusChangeListener)object);
        }
        this.A = new View[]{this.c, this.d, this.e, this.i, this.k, this.z, this.t};
        object2 = new int[4][];
        object2[0] = (View)new int[]{1, 0, 1, 0, 0, 0, 0};
        object2[1] = (View)new int[]{1, 1, 0, 0, 0, 0, 0};
        object2[2] = (View)new int[]{0, 0, 0, 1, 1, 1, 1};
        object2[3] = (View)new int[]{1, 1, 0, 0, 0, 0, 0};
        this.B = (int[][])object2;
        if (n3 >= 0 && n3 < ((View)object2).length) {
            this.t(n3);
            this.E = b2.f(2131296396);
            object = (TextView)this.a.findViewById(2131034438);
            if (n3 == 2) {
                Tools.r1((View)object);
                object.setOnClickListener((View.OnClickListener)this);
                this.E = b2.f(2131296394);
                this.p(F);
            } else if (n3 == 1) {
                Tools.r1((View)object);
                object.setOnClickListener((View.OnClickListener)this);
            }
            this.z.setOnClickListener((View.OnClickListener)this);
            object32 = Tools.O1(object.getText().toString());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object32);
            ((StringBuilder)object2).append(':');
            object.setText((CharSequence)((StringBuilder)object2).toString());
            this.m();
            this.f.addTextChangedListener(this);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Type must be between: 0 and ");
        ((StringBuilder)object).append(((View)object2).length - 1);
        ((StringBuilder)object).append(" but got: ");
        ((StringBuilder)object).append(n3);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private void m() {
        this.g.setText((CharSequence)android.ext.c.s(this.C.c));
        this.h.setText(this.C.J());
        this.j.setText("0");
        this.t.setChecked(true);
        Object object = new TextWatcher(this){
            final l0 a;
            {
                this.a = l02;
            }

            private void a() {
                this.a.t.setChecked(true);
                this.a.u();
            }

            public void afterTextChanged(Editable editable) {
                this.a();
            }

            public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
            }

            public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
                this.a();
            }
        };
        this.h.addTextChangedListener((TextWatcher)object);
        this.j.addTextChangedListener((TextWatcher)object);
        this.s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
            final l0 a;
            {
                this.a = l02;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                if (bl) {
                    this.a.u.setChecked(false);
                }
                this.a.t.setChecked(true);
            }
        });
        this.u.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
            final l0 a;
            {
                this.a = l02;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                if (bl) {
                    this.a.s.setChecked(false);
                }
            }
        });
        this.v.setData(h2.a0());
        this.v.setOnItemSelectedListener(new DialogInterface.OnClickListener(this){
            final l0 a;
            {
                this.a = l02;
            }

            public void onClick(DialogInterface dialogInterface, int n3) {
                dialogInterface = this.a.w;
                n3 = n3 == 3 ? 0 : 8;
                dialogInterface.setVisibility(n3);
            }
        });
        object = this.C;
        if (object instanceof h2) {
            object = (h2)object;
            this.f.setText(((h2)object).b0());
            this.u.setChecked(((h2)object).m);
            this.v.setSelected(((h2)object).n);
            this.x.setText(((h2)object).c0(true));
            this.y.setText(((h2)object).c0(false));
        } else {
            this.u.setChecked(false);
            this.v.setSelected(0);
            this.x.setText("0");
            this.y.setText("0");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void p(boolean bl) {
        F = bl;
        Button button = this.z;
        int n3 = bl ? 2131296738 : 2131296786;
        String string2 = b2.f(n3);
        button.setText((CharSequence)string2);
        button = this.i;
        int n4 = 8;
        n3 = bl ? 0 : 8;
        button.setVisibility(n3);
        button = this.k;
        n3 = bl ? 0 : 8;
        button.setVisibility(n3);
        button = this.m;
        n3 = bl && this.C.c == 1 ? 0 : 8;
        button.setVisibility(n3);
        button = this.n;
        n3 = bl && (this.C.c & 7) != 0 ? 0 : 8;
        button.setVisibility(n3);
        n3 = n4;
        if (bl) {
            n3 = n4;
            if (this.C.c == 1) {
                n3 = 0;
            }
        }
        this.o.setVisibility(n3);
        this.p.setVisibility(n3);
        this.q.setVisibility(n3);
        this.r.setVisibility(n3);
    }

    private void t(int n3) {
        int[] nArray;
        for (int i3 = 0; i3 < (nArray = this.B[n3]).length; ++i3) {
            View view = this.A[i3];
            int n4 = nArray[i3] == 1 ? 0 : 8;
            view.setVisibility(n4);
        }
    }

    private boolean u() {
        int n3 = Config.B;
        boolean bl = true;
        if ((n3 & 1) == 0) {
            return false;
        }
        if (!this.h.isFocused() || !t1.n(this.h.getText().toString())) {
            bl = false;
        }
        InternalKeyboard.i((View)this.h, bl);
        return bl;
    }

    public void afterTextChanged(Editable editable) {
        this.d.setChecked(true);
    }

    public String b() {
        if (this.i.getVisibility() == 0) {
            String string2 = this.j.getText().toString().trim();
            y0.b(string2, 1);
            return string2;
        }
        return "0";
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
    }

    public c c() {
        return this.C;
    }

    public String d() {
        String string2 = this.f.getText().toString().trim();
        y0.b(string2, 2);
        return string2;
    }

    public String e() {
        String string2 = this.h.getText().toString().trim();
        y0.b(string2, 1);
        return string2;
    }

    public EditText f() {
        return this.h;
    }

    public h2 g() {
        return this.h(this.C);
    }

    public h2 h(c object) {
        h2 h22 = new h2((c)object);
        h22.m = this.u.isChecked();
        h22.d0(this.v.getSelected());
        if (h22.n == 3) {
            h22.e0(j2.h(this.x.getText().toString().trim()), j2.h(this.y.getText().toString().trim()));
        }
        if (!h22.m && this.s.isChecked()) {
            h22.c |= 0x40000000;
        }
        if (this.d.getVisibility() == 0 && this.d.isChecked() || this.e.getVisibility() == 0) {
            object = this.d();
            if (!h22.b0().equals(object)) {
                h22.l = object;
            }
        }
        return h22;
    }

    public View i() {
        return this.a;
    }

    public View j() {
        return InternalKeyboard.d(this.k());
    }

    public View k() {
        return Tools.O0(this.i());
    }

    public void l() {
        this.d.setChecked(true);
    }

    public boolean n() {
        if (this.u.isChecked()) {
            return true;
        }
        if (this.c.getVisibility() == 0) {
            if (this.d.getVisibility() == 0 && this.d.isChecked()) {
                return true;
            }
            if (this.e.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean o() {
        return this.t.isChecked();
    }

    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int n3 = view.getId();
        if (n3 != 2131034240) {
            if (n3 != 2131034248) {
                if (n3 == 2131034438) {
                    Searcher.I(this.E);
                }
            } else {
                if (this.D == 2) {
                    this.p(F ^ true);
                }
                this.h.requestFocus();
            }
        } else {
            ConfigListAdapter.t(2131296608);
        }
    }

    public boolean onLongClick(View view) {
        if (view == null) {
            return false;
        }
        if (view.getId() != 2131034115) {
            return false;
        }
        ConfigListAdapter.t(2131296520);
        return true;
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
        this.d.setChecked(true);
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
        this.b.setText(charSequence);
    }

    public void s(String string2) {
        this.h.setText(string2.trim());
    }
}

