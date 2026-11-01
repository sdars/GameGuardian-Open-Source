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
import android.ext.SavedListAdapter;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.e1;
import android.ext.f;
import android.ext.h2;
import android.ext.n1;
import android.ext.n2;
import android.ext.p1;
import android.ext.t1;
import android.ext.t2;
import android.ext.u2;
import android.ext.y0;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

public class OffsetCalculator
extends p1
implements DialogInterface.OnClickListener,
DialogInterface.OnShowListener,
TextWatcher,
Runnable,
CompoundButton.OnCheckedChangeListener,
DialogInterface.OnDismissListener {
    private static String x = "";
    private static String y = "";
    private static boolean z = true;
    long f = 0L;
    private final Long g;
    private EditText h = null;
    private EditText i = null;
    private TextView j = null;
    private CheckBox k = null;
    private ImageView l = null;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;

    public OffsetCalculator() {
        this((Long)null);
    }

    public OffsetCalculator(Long l3) {
        super(2131296834, 2130968592);
        this.g = l3;
    }

    private int h(long l3, long l4, int n3, TextView textView, int n4, int n5, int n6, boolean bl) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (!bl && ((long)(n6 - 1) & l3) == 0L) {
            charSequence2 = c.K(l3, l4, n4);
            charSequence = charSequence2;
            n6 = n3;
            if (n3 == 0) {
                charSequence = charSequence2;
                n6 = n5;
            }
        } else {
            charSequence = "-";
            n6 = n3;
        }
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append((String)charSequence);
        ((StringBuilder)charSequence2).append((Object)c.A(n4));
        ((StringBuilder)charSequence2).append(';');
        textView.setText((CharSequence)((StringBuilder)charSequence2).toString());
        return n6;
    }

    private void i() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        new u2(c.o(c.T(this.f, false, sparseIntArray)), sparseIntArray, "0", b2.f(2131297030), new DialogInterface.OnClickListener(this){
            final OffsetCalculator a;
            {
                this.a = offsetCalculator;
            }

            public void onClick(DialogInterface object, int n3) {
                SavedListAdapter savedListAdapter = MainService.instance.t0;
                h2 h22 = new h2(this.a.f, 0L, n3);
                if (!h22.V()) {
                    h22.c = c.S(h22.a, true);
                }
                if ((object = savedListAdapter.e(this.a.f)) == null || object.c != h22.c) {
                    savedListAdapter.a(h22);
                    savedListAdapter.i();
                }
                Tools.J1(Tools.L1(b2.f(2131296721), 1));
            }
        });
    }

    private void k() {
        if (this.i != null && this.j != null) {
            String string2;
            long l3;
            int n3;
            StringBuilder stringBuilder;
            block10: {
                stringBuilder = new StringBuilder();
                n3 = 16;
                try {
                    l3 = t1.r(this.h.getText().toString().trim(), 16);
                }
                catch (Throwable throwable) {
                    e1.g("Failed parse", throwable);
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("; ");
                    }
                    stringBuilder.append(b2.f(2131296264));
                    stringBuilder.append(' ');
                    stringBuilder.append(throwable.getMessage());
                    l3 = 0L;
                }
                string2 = this.i.getText().toString().trim();
                if (this.k.isChecked()) break block10;
                n3 = 10;
            }
            try {
                this.f = l3 + t1.r(string2, n3);
            }
            catch (Throwable throwable) {
                e1.g("Failed parse", throwable);
                if (stringBuilder.length() != 0) {
                    stringBuilder.append("; ");
                }
                stringBuilder.append(b2.f(2131296833));
                stringBuilder.append(' ');
                stringBuilder.append(throwable.getMessage());
                this.f = 0L;
            }
            boolean bl = stringBuilder.length() != 0;
            if (!bl) {
                stringBuilder.append(c.G(this.f, 4));
                string2 = n2.c();
                string2.removeCallbacks((Runnable)this);
                string2.post((Runnable)this);
            } else {
                this.l(0L, 0L, bl);
            }
            this.j.setText((CharSequence)stringBuilder.toString());
        }
    }

    public void afterTextChanged(Editable editable) {
        this.k();
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
    }

    public void j(String string2) {
        Object object;
        View view = d.f(2131099683, null);
        this.h = (EditText)view.findViewById(2131034123);
        this.i = (EditText)view.findViewById(2131034348);
        this.j = (TextView)view.findViewById(2131034379);
        this.l = object = Config.m((ImageView)view.findViewById(2131034384));
        object.setOnClickListener((View.OnClickListener)this);
        object = (CheckBox)view.findViewById(2131034280);
        this.k = object;
        object.setChecked(z);
        this.k.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
        this.m = (TextView)view.findViewById(2131034446);
        this.n = (TextView)view.findViewById(2131034449);
        this.o = (TextView)view.findViewById(2131034451);
        this.p = (TextView)view.findViewById(2131034447);
        this.q = (TextView)view.findViewById(2131034443);
        this.r = (TextView)view.findViewById(2131034444);
        this.s = (TextView)view.findViewById(2131034442);
        this.t = (TextView)view.findViewById(2131034453);
        this.u = (TextView)view.findViewById(2131034441);
        this.v = (TextView)view.findViewById(2131034448);
        this.w = (TextView)view.findViewById(2131034454);
        EditText editText = this.h;
        object = string2;
        if (string2 == null) {
            object = x;
        }
        editText.setText((CharSequence)object);
        this.h.setDataType(1);
        this.i.setText(y);
        this.i.setDataType(1);
        this.h.addTextChangedListener(this);
        this.i.addTextChangedListener(this);
        this.k();
        string2 = android.ext.f.b().setView(InternalKeyboard.d(view)).setPositiveButton((CharSequence)b2.f(2131296514), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).setNeutralButton((CharSequence)b2.f(2131296338), (DialogInterface.OnClickListener)this).create();
        android.ext.f.k((AlertDialog)string2, this);
        android.ext.f.l((AlertDialog)string2, this);
        android.ext.f.n((AlertDialog)string2, this.i);
    }

    void l(long l3, long l4, boolean bl) {
        CharSequence charSequence;
        int n3;
        if (this.j == null) {
            return;
        }
        int n4 = n3 = this.h(l3, l4, this.h(l3, l4, this.h(l3, l4, this.h(l3, l4, this.h(l3, l4, this.h(l3, l4, this.h(l3, l4, 0, this.s, 64, 8, 4, bl), this.v, 32, 8, 4, bl), this.r, 16, 4, 4, bl), this.q, 4, 4, 4, bl), this.w, 8, 4, 4, bl), this.t, 2, 2, 2, bl), this.u, 1, 1, 1, bl);
        if (n3 == 0) {
            n4 = 1;
        }
        if (!bl) {
            l3 = n4 != 8 ? (1L << n4 * 8) - 1L & l4 : l4;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(t2.e(n4 * 2, l3));
            ((StringBuilder)charSequence).append("h;");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "-h;";
            l3 = l4;
        }
        this.m.setText(charSequence);
        if (!bl) {
            long l5;
            l4 = Long.reverseBytes(l3);
            n3 = n4 * 8;
            l4 = l5 = l4 >> 64 - n3;
            if (n4 != 8) {
                l4 = l5 & (1L << n3) - 1L;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(t2.e(n4 * 2, l4));
            ((StringBuilder)charSequence).append("r;");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "-r;";
        }
        this.n.setText(charSequence);
        String string2 = "-;";
        if (!bl) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append('\'');
            ((StringBuilder)charSequence).append(n1.I(l3, n4));
            ((StringBuilder)charSequence).append("';");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "-;";
        }
        this.o.setText(charSequence);
        charSequence = string2;
        if (!bl) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append('\"');
            ((StringBuilder)charSequence).append(n1.H(l3, n4));
            ((StringBuilder)charSequence).append("\";");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        this.p.setText(charSequence);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
        this.k();
    }

    public void onClick(DialogInterface object, int n3) {
        object = c.G(this.f, 4);
        if (n3 != -3) {
            if (n3 == -1) {
                y0.b(this.i.getText().toString().trim(), 1);
                MainService mainService = MainService.instance;
                Long l3 = this.g;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Tools.N1(2131296494));
                stringBuilder.append(": (");
                stringBuilder.append(this.h.getText().toString().trim());
                stringBuilder.append(" + ");
                stringBuilder.append(this.i.getText().toString().trim());
                stringBuilder.append(')');
                mainService.L(l3, (String)object, stringBuilder.toString());
            }
        } else {
            y0.b(this.i.getText().toString().trim(), 1);
            Tools.z((String)object);
        }
    }

    @Override
    public void onClick(View view) {
        if (view != null && view.getId() == 2131034384) {
            this.i();
            return;
        }
        new OffsetCalculator().j(null);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.h != null) {
            z = this.k.isChecked();
            y = this.i.getText().toString().trim();
            x = this.h.getText().toString().trim();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void onShow(DialogInterface object) {
        void var1_3;
        if (this.h.getText().length() > 0) {
            EditText editText = this.i;
        } else {
            EditText editText = this.h;
        }
        var1_3.requestFocus();
        Tools.o1(this.i);
        this.k();
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
        this.k();
    }

    @Override
    public void run() {
        long l3 = this.f;
        try {
            int n3 = c.S(l3, true);
            long l4 = MainService.instance.i.Q(l3, n3);
            Runnable runnable = new Runnable(this, l3, l4){
                final long a;
                final long b;
                final OffsetCalculator c;
                {
                    this.c = offsetCalculator;
                    this.a = l3;
                    this.b = l4;
                }

                @Override
                public void run() {
                    try {
                        this.c.l(this.a, this.b, false);
                    }
                    catch (Throwable throwable) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed update value: ");
                        stringBuilder.append(this.a);
                        stringBuilder.append(' ');
                        stringBuilder.append(this.b);
                        e1.s(stringBuilder.toString(), throwable);
                    }
                }
            };
            n2.i(runnable);
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed update value: ");
            stringBuilder.append(l3);
            e1.s(stringBuilder.toString(), throwable);
        }
    }
}

