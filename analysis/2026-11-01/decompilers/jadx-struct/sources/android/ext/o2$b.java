package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class o2$b implements View$OnClickListener, DialogInterface$OnClickListener, DialogInterface$OnShowListener, DialogInterface$OnDismissListener, TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    EditText f1161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TextView f1162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f1163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    AlertDialog f1164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ o2 f1165e;

    private o2$b(o2 o2Var) {
        this.f1165e = o2Var;
    }

    /* synthetic */ o2$b(o2 o2Var, o2$a o2_a) {
        this(o2Var);
    }

    public void a() {
        String strG1;
        EditText editText = this.f1161a;
        TextView textView = this.f1162b;
        if (editText == null) {
            strG1 = "?";
        } else {
            try {
                strG1 = Tools.g1(o2.i(editText.getText().toString().trim()) / 1000000000);
            } catch (NumberFormatException unused) {
                strG1 = "???";
            }
        }
        if (textView != null) {
            textView.setText(strG1);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        a();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            String strH = j2.h(this.f1161a.getText().toString().trim());
            o2.h(o2.i(strH));
            y0.b(strH, 1);
            Tools.D(dialogInterface);
        } catch (NumberFormatException e2) {
            j2.i(e2, this.f1161a);
        }
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        if (view != null && !(view.getTag() instanceof p1)) {
            int id = view.getId();
            if (id == 2131034205) {
                Config$p config$pB = Config.b(R$id.config_time_jump_panel);
                config$pB.g(new o2$b$a(this, config$pB));
                config$pB.b();
                return;
            } else if (id != 2131034246) {
                onClick(this.f1164d, -1);
                return;
            } else {
                Searcher.I(b2.f(R$string.examples_timejump));
                return;
            }
        }
        View viewF = a.d.f(R$layout.time_jump, null);
        Config.m((ImageView) viewF.findViewById(R$id.examples)).setOnClickListener(this);
        this.f1162b = (TextView) viewF.findViewById(R$id.hint);
        TextView textView = (TextView) viewF.findViewById(R$id.config_time_jump_panel);
        this.f1163c = textView;
        textView.setOnClickListener(this);
        this.f1163c.setText(Config.b(R$id.config_time_jump_panel).toString());
        this.f1161a = (EditText) viewF.findViewById(R$id.time_jump);
        String strF = o2.f1158f;
        if (strF.length() == 0 || "0".equals(strF)) {
            strF = Tools.F(((double) Config.v) / 1000.0d);
        }
        this.f1161a.setText(strF);
        this.f1161a.addTextChangedListener(this);
        this.f1161a.setDataType(1);
        a();
        AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(R$string.ok), this).setNegativeButton(b2.f(R$string.back), (DialogInterface$OnClickListener) null).create();
        this.f1164d = alertDialogCreate;
        f.l(alertDialogCreate, this);
        f.k(this.f1164d, this);
        f.n(this.f1164d, this.f1161a);
    }

    @Override // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        o2.f1158f = this.f1161a.getText().toString().trim();
        try {
            o2.j(o2.i(j2.h(o2.f1158f)));
        } catch (NumberFormatException unused) {
        }
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.s1(dialogInterface, -1, null, this);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a();
    }
}
