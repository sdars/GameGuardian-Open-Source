package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class OffsetCalculator extends p1 implements DialogInterface$OnClickListener, DialogInterface$OnShowListener, TextWatcher, Runnable, CompoundButton$OnCheckedChangeListener, DialogInterface$OnDismissListener {
    private static String x = "";
    private static String y = "";
    private static boolean z = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Long f317g;
    private EditText h;
    private EditText i;
    private TextView j;
    private CheckBox k;
    private ImageView l;
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
        this(null);
    }

    public OffsetCalculator(Long l) {
        super(R$string.offset_calculator, R$drawable.ic_calculator_white_24dp);
        this.f316f = 0L;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.f317g = l;
    }

    private int h(long j, long j2, int i, TextView textView, int i2, int i3, int i4, boolean z2) {
        String strK;
        if (z2 || (((long) (i4 - 1)) & j) != 0) {
            strK = "-";
        } else {
            strK = c.K(j, j2, i2);
            if (i == 0) {
                i = i3;
            }
        }
        textView.setText(strK + ((Object) c.A(i2)) + ';');
        return i;
    }

    private void i() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        new u2(c.o(c.T(this.f316f, false, sparseIntArray)), sparseIntArray, "0", b2.f(R$string.type_change_request), new OffsetCalculator$a(this));
    }

    private void k() {
        long jR;
        if (this.i == null || this.j == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = 16;
        try {
            jR = t1.r(this.h.getText().toString().trim(), 16);
        } catch (Throwable th) {
            e1.g("Failed parse", th);
            if (sb.length() != 0) {
                sb.append("; ");
            }
            sb.append(b2.f(R$string.address));
            sb.append(' ');
            sb.append(th.getMessage());
            jR = 0;
        }
        String strTrim = this.i.getText().toString().trim();
        try {
            if (!this.k.isChecked()) {
                i = 10;
            }
            this.f316f = jR + t1.r(strTrim, i);
        } catch (Throwable th2) {
            e1.g("Failed parse", th2);
            if (sb.length() != 0) {
                sb.append("; ");
            }
            sb.append(b2.f(R$string.offset));
            sb.append(' ');
            sb.append(th2.getMessage());
            this.f316f = 0L;
        }
        boolean z2 = sb.length() != 0;
        if (z2) {
            l(0L, 0L, z2);
        } else {
            sb.append(c.G(this.f316f, 4));
            Handler handlerC = n2.c();
            handlerC.removeCallbacks(this);
            handlerC.post(this);
        }
        this.j.setText(sb.toString());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        k();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void j(String str) {
        View viewF = a.d.f(R$layout.service_offset, null);
        this.h = (EditText) viewF.findViewById(R$id.address);
        this.i = (EditText) viewF.findViewById(R$id.offset);
        this.j = (TextView) viewF.findViewById(R$id.result);
        ImageView imageViewM = Config.m((ImageView) viewF.findViewById(R$id.save));
        this.l = imageViewM;
        imageViewM.setOnClickListener(this);
        CheckBox checkBox = (CheckBox) viewF.findViewById(R$id.hex);
        this.k = checkBox;
        checkBox.setChecked(z);
        this.k.setOnCheckedChangeListener(this);
        this.m = (TextView) viewF.findViewById(R$id.value_hex);
        this.n = (TextView) viewF.findViewById(R$id.value_rhex);
        this.o = (TextView) viewF.findViewById(R$id.value_string);
        this.p = (TextView) viewF.findViewById(R$id.value_java);
        this.q = (TextView) viewF.findViewById(R$id.value_dword);
        this.r = (TextView) viewF.findViewById(R$id.value_float);
        this.s = (TextView) viewF.findViewById(R$id.value_double);
        this.t = (TextView) viewF.findViewById(R$id.value_word);
        this.u = (TextView) viewF.findViewById(R$id.value_byte);
        this.v = (TextView) viewF.findViewById(R$id.value_qword);
        this.w = (TextView) viewF.findViewById(R$id.value_xor);
        EditText editText = this.h;
        if (str == null) {
            str = x;
        }
        editText.setText(str);
        this.h.setDataType(1);
        this.i.setText(y);
        this.i.setDataType(1);
        this.h.addTextChangedListener(this);
        this.i.addTextChangedListener(this);
        k();
        AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(R$string.goto1), this).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).setNeutralButton(b2.f(R$string.copy), this).create();
        f.k(alertDialogCreate, this);
        f.l(alertDialogCreate, this);
        f.n(alertDialogCreate, this.i);
    }

    void l(long j, long j2, boolean z2) {
        String str;
        long j3;
        String str2;
        String str3;
        if (this.j == null) {
            return;
        }
        int iH = h(j, j2, h(j, j2, h(j, j2, h(j, j2, h(j, j2, h(j, j2, h(j, j2, 0, this.s, 64, 8, 4, z2), this.v, 32, 8, 4, z2), this.r, 16, 4, 4, z2), this.q, 4, 4, 4, z2), this.w, 8, 4, 4, z2), this.t, 2, 2, 2, z2), this.u, 1, 1, 1, z2);
        if (iH == 0) {
            iH = 1;
        }
        if (z2) {
            str = "-h;";
            j3 = j2;
        } else {
            j3 = iH != 8 ? ((1 << (iH * 8)) - 1) & j2 : j2;
            str = t2.e(iH * 2, j3) + "h;";
        }
        this.m.setText(str);
        if (z2) {
            str2 = "-r;";
        } else {
            int i = iH * 8;
            long jReverseBytes = Long.reverseBytes(j3) >> (64 - i);
            if (iH != 8) {
                jReverseBytes &= (1 << i) - 1;
            }
            str2 = t2.e(iH * 2, jReverseBytes) + "r;";
        }
        this.n.setText(str2);
        String str4 = "-;";
        if (z2) {
            str3 = "-;";
        } else {
            str3 = '\'' + n1.I(j3, iH) + "';";
        }
        this.o.setText(str3);
        if (!z2) {
            str4 = '\"' + n1.H(j3, iH) + "\";";
        }
        this.p.setText(str4);
    }

    @Override // android.widget.CompoundButton$OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        k();
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        String strG = c.G(this.f316f, 4);
        if (i == -3) {
            y0.b(this.i.getText().toString().trim(), 1);
            Tools.z(strG);
            return;
        }
        if (i != -1) {
            return;
        }
        y0.b(this.i.getText().toString().trim(), 1);
        MainService.instance.L(this.f317g, strG, Tools.N1(R$string.from_calc) + ": (" + this.h.getText().toString().trim() + " + " + this.i.getText().toString().trim() + ')');
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        if (view == null || view.getId() != 2131034384) {
            new OffsetCalculator().j(null);
        } else {
            i();
        }
    }

    @Override // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.h != null) {
            z = this.k.isChecked();
            y = this.i.getText().toString().trim();
            x = this.h.getText().toString().trim();
        }
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        (this.h.getText().length() > 0 ? this.i : this.h).requestFocus();
        Tools.o1(this.i);
        k();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        k();
    }

    @Override // java.lang.Runnable
    public void run() {
        long j = this.f316f;
        try {
            n2.i(new OffsetCalculator$b(this, j, MainService.instance.i.Q(j, c.S(j, true))));
        } catch (Throwable th) {
            e1.s("Failed update value: " + j, th);
        }
    }
}
