package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
public class y2 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile boolean f1360f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile long f1361g = 0;
    static volatile boolean h = false;
    static volatile long i = 1;
    static volatile boolean j = false;
    static volatile double k = 0.0d;
    static volatile boolean l = false;
    static volatile double m = 0.01d;
    static volatile y2 n;

    private class b implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CheckBox f1362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        EditText f1363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CheckBox f1364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        EditText f1365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CheckBox f1366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        EditText f1367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        CheckBox f1368g;
        EditText h;
        AlertDialog i;

        class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CheckBox f1369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CheckBox f1370b;

            a(CheckBox checkBox, CheckBox checkBox2) {
                this.f1369a = checkBox;
                this.f1370b = checkBox2;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                this.f1369a.setChecked(true);
                CheckBox checkBox = this.f1370b;
                if (checkBox != null) {
                    checkBox.setChecked(true);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* JADX INFO: renamed from: android.ext.y2$b$b, reason: collision with other inner class name */
        class C0023b implements CompoundButton.OnCheckedChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CheckBox f1372a;

            C0023b(CheckBox checkBox) {
                this.f1372a = checkBox;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    return;
                }
                this.f1372a.setChecked(false);
            }
        }

        class c implements CompoundButton.OnCheckedChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CheckBox f1374a;

            c(CheckBox checkBox) {
                this.f1374a = checkBox;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    this.f1374a.setChecked(true);
                }
            }
        }

        private b() {
        }

        private void a(CheckBox checkBox, CheckBox checkBox2, boolean z, EditText editText, String str) {
            checkBox2.setChecked(z);
            checkBox2.setText(b2.g(checkBox2.getText().toString()));
            editText.setDataType(1);
            editText.setText(str);
            editText.setTag(checkBox2);
            editText.addTextChangedListener(new a(checkBox2, checkBox));
            if (checkBox != null) {
                checkBox.setOnCheckedChangeListener(new C0023b(checkBox2));
                checkBox2.setOnCheckedChangeListener(new c(checkBox));
            }
        }

        private long b(EditText editText, boolean z) {
            String strH = j2.h(editText.getText().toString().trim());
            long j = (z ? t1.x(strH) : t1.u(strH)).f1261a;
            y0.b(strH, 1);
            return j;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            long j;
            boolean z;
            int i2;
            double d2;
            int i3;
            double d3;
            String string;
            try {
                boolean zIsChecked = this.f1362a.isChecked();
                long jB = 0;
                boolean z2 = false;
                if (zIsChecked) {
                    long jB2 = b(this.f1363b, true);
                    y2.f1361g = jB2;
                    boolean zIsChecked2 = this.f1364c.isChecked();
                    i2 = 2;
                    if (zIsChecked2) {
                        jB = b(this.f1365d, true);
                        y2.i = jB;
                    }
                    z = zIsChecked2;
                    j = jB;
                    jB = jB2;
                } else {
                    j = 0;
                    z = false;
                    i2 = 0;
                }
                y2.f1360f = zIsChecked;
                y2.h = z;
                boolean zIsChecked3 = this.f1366e.isChecked();
                double dLongBitsToDouble = 0.0d;
                if (zIsChecked3) {
                    int i4 = i2 | 4;
                    double dLongBitsToDouble2 = Double.longBitsToDouble(b(this.f1367f, false));
                    y2.k = dLongBitsToDouble2;
                    boolean zIsChecked4 = this.f1368g.isChecked();
                    if (zIsChecked4) {
                        dLongBitsToDouble = Double.longBitsToDouble(b(this.h, false));
                        y2.m = dLongBitsToDouble;
                    }
                    z2 = zIsChecked4;
                    d2 = dLongBitsToDouble;
                    i3 = i4;
                    d3 = dLongBitsToDouble2;
                } else {
                    d2 = 0.0d;
                    i3 = i2;
                    d3 = 0.0d;
                }
                y2.j = zIsChecked3;
                y2.l = z2;
                y2.h(i3, jB, j, d3, d2);
                Tools.D(dialogInterface);
                c2 c2Var = MainService.instance.f216f;
                if (c2Var != null) {
                    c2Var.write("gg.unrandomizer(");
                    if (zIsChecked) {
                        c2Var.write(Long.toString(jB));
                        c2Var.write(", ");
                        c2Var.write(Long.toString(j));
                        c2Var.write(", ");
                    } else {
                        c2Var.write("nil, nil, ");
                    }
                    if (zIsChecked3) {
                        c2Var.write(Double.toString(d3));
                        c2Var.write(", ");
                        string = Double.toString(d2);
                    } else {
                        string = "nil, nil";
                    }
                    c2Var.write(string);
                    c2Var.write(")\n");
                }
            } catch (NumberFormatException e2) {
                j2.i(e2, null);
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != null && !(view.getTag() instanceof p1)) {
                if (view.getId() != R.id.message) {
                    onClick(this.i, -1);
                    return;
                } else {
                    ConfigListAdapter.t(R.string.help_unrandomizer);
                    return;
                }
            }
            View viewF = a.d.f(R.layout.unrand, null);
            TextView textView = (TextView) viewF.findViewById(R.id.message);
            Tools.r1(textView);
            textView.setOnClickListener(this);
            this.f1362a = (CheckBox) viewF.findViewById(R.id.rd_qword_use);
            this.f1363b = (EditText) viewF.findViewById(R.id.rd_qword);
            this.f1364c = (CheckBox) viewF.findViewById(R.id.rd_qword_inc_use);
            this.f1365d = (EditText) viewF.findViewById(R.id.rd_qword_inc);
            a(null, this.f1362a, y2.f1360f, this.f1363b, i0.c(y2.f1361g, 32));
            a(this.f1362a, this.f1364c, y2.h, this.f1365d, i0.c(y2.i, 32));
            this.f1366e = (CheckBox) viewF.findViewById(R.id.rd_double_use);
            this.f1367f = (EditText) viewF.findViewById(R.id.rd_double);
            this.f1368g = (CheckBox) viewF.findViewById(R.id.rd_double_inc_use);
            this.h = (EditText) viewF.findViewById(R.id.rd_double_inc);
            a(null, this.f1366e, y2.j, this.f1367f, Double.toString(y2.k));
            a(this.f1366e, this.f1368g, y2.l, this.h, Double.toString(y2.m));
            AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(R.string.ok), this).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).create();
            this.i = alertDialogCreate;
            f.l(alertDialogCreate, this);
            f.n(this.i, this.f1363b);
        }
    }

    public y2() {
        super(R.string.unrandomizer, R.drawable.ic_dice_multiple_white_24dp);
        n = this;
    }

    public static void h(int i2, long j2, long j3, double d2, double d3) {
        MainService.instance.i.V0(i2, j2, j3, d2, d3);
    }

    public static void i() {
        f1360f = false;
        h = false;
        j = false;
        l = false;
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }
}
