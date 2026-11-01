package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnShowListener;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class y2$b implements View$OnClickListener, DialogInterface$OnClickListener, DialogInterface$OnShowListener {

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
    final /* synthetic */ y2 j;

    private y2$b(y2 y2Var) {
        this.j = y2Var;
    }

    /* synthetic */ y2$b(y2 y2Var, y2$a y2_a) {
        this(y2Var);
    }

    private void a(CheckBox checkBox, CheckBox checkBox2, boolean z, EditText editText, String str) {
        checkBox2.setChecked(z);
        checkBox2.setText(b2.g(checkBox2.getText().toString()));
        editText.setDataType(1);
        editText.setText(str);
        editText.setTag(checkBox2);
        editText.addTextChangedListener(new y2$b$a(this, checkBox2, checkBox));
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new y2$b$b(this, checkBox2));
            checkBox2.setOnCheckedChangeListener(new y2$b$c(this, checkBox));
        }
    }

    private long b(EditText editText, boolean z) {
        String strH = j2.h(editText.getText().toString().trim());
        long j = (z ? t1.x(strH) : t1.u(strH)).f1261a;
        y0.b(strH, 1);
        return j;
    }

    @Override // android.content.DialogInterface$OnClickListener
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

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        if (view != null && !(view.getTag() instanceof p1)) {
            if (view.getId() != 2131034328) {
                onClick(this.i, -1);
                return;
            } else {
                ConfigListAdapter.t(R$string.help_unrandomizer);
                return;
            }
        }
        View viewF = a.d.f(R$layout.unrand, null);
        TextView textView = (TextView) viewF.findViewById(R$id.message);
        Tools.r1(textView);
        textView.setOnClickListener(this);
        this.f1362a = (CheckBox) viewF.findViewById(R$id.rd_qword_use);
        this.f1363b = (EditText) viewF.findViewById(R$id.rd_qword);
        this.f1364c = (CheckBox) viewF.findViewById(R$id.rd_qword_inc_use);
        this.f1365d = (EditText) viewF.findViewById(R$id.rd_qword_inc);
        a(null, this.f1362a, y2.f1360f, this.f1363b, i0.c(y2.f1361g, 32));
        a(this.f1362a, this.f1364c, y2.h, this.f1365d, i0.c(y2.i, 32));
        this.f1366e = (CheckBox) viewF.findViewById(R$id.rd_double_use);
        this.f1367f = (EditText) viewF.findViewById(R$id.rd_double);
        this.f1368g = (CheckBox) viewF.findViewById(R$id.rd_double_inc_use);
        this.h = (EditText) viewF.findViewById(R$id.rd_double_inc);
        a(null, this.f1366e, y2.j, this.f1367f, Double.toString(y2.k));
        a(this.f1366e, this.f1368g, y2.l, this.h, Double.toString(y2.m));
        AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(R$string.ok), this).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).create();
        this.i = alertDialogCreate;
        f.l(alertDialogCreate, this);
        f.n(this.i, this.f1363b);
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.s1(dialogInterface, -1, null, this);
    }
}
