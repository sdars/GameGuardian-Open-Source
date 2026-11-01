package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class d2$b implements DialogInterface$OnClickListener, DialogInterface$OnShowListener, DialogInterface$OnDismissListener, View$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AlertDialog f720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.widget.EditText f721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f722c;

    private d2$b(d2 d2Var) {
        this.f722c = d2Var;
    }

    /* synthetic */ d2$b(d2 d2Var, d2$a d2_a) {
        this(d2Var);
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        android.widget.EditText editText = this.f721b;
        if (editText == null) {
            return;
        }
        String strTrim = editText.getText().toString().trim();
        if (Tools.f1(strTrim)) {
            if (MainService.instance.f216f != null) {
                f.o(f.b().setCustomTitle(Tools.g0(R$string.error)).setMessage(b2.f(R$string.another_record)).setPositiveButton(b2.f(R$string.stop), new d2$b$a(this, i)).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null));
                return;
            }
            try {
                c2 c2Var = new c2(strTrim);
                y0.b(strTrim, 4);
                MainService.instance.f1(c2Var);
                Tools.D(this.f720a);
            } catch (Throwable th) {
                f.o(f.b().setCustomTitle(Tools.g0(R$string.error)).setMessage(strTrim + "\n\n" + th.toString()).setPositiveButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
            }
        }
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        if (view != null && !(view.getTag() instanceof p1)) {
            onClick(null, -1);
            return;
        }
        if (MainService.instance.i.d0()) {
            View viewF = a.d.f(R$layout.save, null);
            ((TextView) viewF.findViewById(R$id.message)).setText(b2.f(R$string.record_script));
            EditTextPath editTextPath = (EditTextPath) viewF.findViewById(R$id.file);
            this.f721b = editTextPath;
            editTextPath.setText(v1.a("record-path", "-record", ".lua"));
            editTextPath.setDataType(4);
            editTextPath.setPathType(2);
            viewF.findViewById(R$id.path_selector).setTag(editTextPath);
            AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.e(viewF, false)).setPositiveButton(b2.f(R$string.record), this).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).create();
            f.l(alertDialogCreate, this);
            f.k(alertDialogCreate, this);
            this.f720a = alertDialogCreate;
            f.n(alertDialogCreate, editTextPath);
        }
    }

    @Override // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        android.widget.EditText editText = this.f721b;
        if (editText != null) {
            v1.c(editText.getText().toString(), "record-path", "-record", ".lua");
        }
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.s1(dialogInterface, -1, null, this);
    }
}
