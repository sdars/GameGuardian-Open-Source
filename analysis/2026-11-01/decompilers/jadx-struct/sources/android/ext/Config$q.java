package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnShowListener;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class Config$q extends Config$p implements DialogInterface$OnShowListener, View$OnClickListener {
    int k;
    int l;
    long m;
    private WeakReference n;
    private WeakReference o;
    private boolean p;
    private boolean q;
    private int r;

    public Config$q(int i, int i2, int i3, int i4, long j, int i5, String str, boolean z) {
        super(i, i2, i5, str, z);
        this.n = new WeakReference(null);
        this.o = new WeakReference(null);
        this.p = false;
        this.q = true;
        this.r = 8;
        this.k = i3;
        this.l = i4;
        this.m = j;
    }

    public Config$q(int i, int i2, int i3, int i4, long j, int i5, String str, boolean z, int i6) {
        this(i, i2, i3, i4, j, i5, str, z);
        this.h = i6;
    }

    public Config$q(int i, int i2, int i3, int i4, long j, int i5, String str, boolean z, boolean z2, boolean z3) {
        this(i, i2, i3, i4, j, i5, str, z);
        this.p = z2;
        this.q = z3;
    }

    public Config$q(int i, int i2, int i3, int i4, long j, int i5, String str, boolean z, boolean z2, boolean z3, int i6) {
        this(i, i2, i3, i4, j, i5, str, z, z2, z3);
        this.r = i6;
    }

    private String h() {
        int i = this.k;
        return i == 0 ? "" : b2.f(i);
    }

    @Override // android.ext.Config$p
    public void b() {
        i();
    }

    @Override // android.ext.Config$p
    public boolean e(DialogInterface dialogInterface, int i) {
        EditText editText = (EditText) this.o.get();
        if (editText == null) {
            return false;
        }
        try {
            String strH = j2.h(editText.getText().toString().trim());
            t1$b t1_bX = t1.x(strH);
            long j = this.l;
            long j2 = this.m;
            if (!this.f43e) {
                long j3 = t1_bX.f1261a;
                if (j3 < j || j3 > j2) {
                    throw new NumberFormatException(Tools.L1(b2.f(R$string.number_out_of_range), strH) + Tools.L1(" [%,d, %,d]", Long.valueOf(j), Long.valueOf(j2)));
                }
            }
            y0.b(strH, this.r);
            if (this.f43e) {
                long j4 = t1_bX.f1261a;
                this.f42d = (int) j4;
                this.f44f = (int) (j4 >> 32);
            } else {
                this.f42d = Math.max((int) Math.min(t1_bX.f1261a, this.m), this.l);
            }
            Config.k();
            Tools.E(this.n);
            return true;
        } catch (NumberFormatException e2) {
            j2.i(e2, editText);
            return false;
        }
    }

    protected void i() {
        View viewF = a.d.f(R$layout.option_edit, null);
        TextView textView = (TextView) viewF.findViewById(R$id.message);
        textView.setText(b2.f(this.f39a));
        int i = this.h;
        if (i != -1 && i != 0) {
            Tools.r1(textView);
            textView.setOnClickListener(new Config$q$a(this));
        }
        TextView textView2 = (TextView) viewF.findViewById(R$id.hint);
        String strF = b2.f(R$string.type_edit_limit);
        Object[] objArr = new Object[2];
        Object[] objArr2 = new Object[1];
        objArr2[0] = Long.valueOf(this.f43e ? Long.MIN_VALUE : this.l);
        objArr[0] = Tools.L1("%,d", objArr2);
        Object[] objArr3 = new Object[1];
        objArr3[0] = Long.valueOf(this.f43e ? Long.MAX_VALUE : this.m);
        objArr[1] = Tools.L1("%,d", objArr3);
        textView2.setText(Tools.L1(strF, objArr));
        ((TextView) viewF.findViewById(R$id.unit)).setText(h());
        TextView textView3 = (TextView) viewF.findViewById(R$id.default_);
        textView3.setText(Tools.N1(R$string.default_) + ": " + Tools.L1("%,d", Integer.valueOf(this.f40b)));
        textView3.setOnClickListener(this);
        EditText editText = (EditText) viewF.findViewById(R$id.number);
        Object[] objArr4 = new Object[1];
        objArr4[0] = Long.valueOf(this.f43e ? c() : this.f42d);
        editText.setText(Tools.L1("%,d", objArr4));
        editText.setDataType(this.r);
        this.o = new WeakReference(editText);
        HexConverter hexConverter = (HexConverter) viewF.findViewById(R$id.number_converter);
        hexConverter.setTag(new Object[]{editText, 4});
        hexConverter.setVisibility(this.p ? 0 : 8);
        hexConverter.setUseXor(this.q);
        AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(R$string.ok, this).setNegativeButton(R$string.cancel, (DialogInterface$OnClickListener) null).create();
        f.l(alertDialogCreate, this);
        this.n = new WeakReference(alertDialogCreate);
        f.n(alertDialogCreate, editText);
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        if (view == null || view.getId() != 2131034224) {
            onClick((DialogInterface) this.n.get(), -1);
            return;
        }
        EditText editText = (EditText) this.o.get();
        if (editText != null) {
            editText.setText(Tools.L1("%,d", Integer.valueOf(this.f40b)));
        }
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.t1(dialogInterface, -1, null, this, (EditText) this.o.get());
    }

    @Override // android.ext.Config$p
    public String toString() {
        return b2.f(this.f39a) + ' ' + Tools.L1("%,d", Integer.valueOf(this.f42d)) + ' ' + h();
    }
}
