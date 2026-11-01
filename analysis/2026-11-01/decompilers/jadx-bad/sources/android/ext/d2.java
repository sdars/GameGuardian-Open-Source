package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d2 extends p1 {

    private class b implements DialogInterface.OnClickListener, DialogInterface.OnShowListener, DialogInterface.OnDismissListener, View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AlertDialog f720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.widget.EditText f721b;

        class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f723a;

            a(int i) {
                this.f723a = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                MainService.instance.O();
                b.this.onClick(null, this.f723a);
            }
        }

        private b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            android.widget.EditText editText = this.f721b;
            if (editText == null) {
                return;
            }
            String strTrim = editText.getText().toString().trim();
            if (Tools.f1(strTrim)) {
                if (MainService.instance.f216f != null) {
                    f.o(f.b().setCustomTitle(Tools.g0(2131296417)).setMessage(b2.f(2131296275)).setPositiveButton(b2.f(2131296994), new a(i)).setNegativeButton(b2.f(2131296805), (DialogInterface.OnClickListener) null));
                    return;
                }
                try {
                    c2 c2Var = new c2(strTrim);
                    y0.b(strTrim, 4);
                    MainService.instance.f1(c2Var);
                    Tools.D(this.f720a);
                } catch (Throwable th) {
                    f.o(f.b().setCustomTitle(Tools.g0(2131296417)).setMessage(strTrim + "\n\n" + th.toString()).setPositiveButton(b2.f(2131296836), (DialogInterface.OnClickListener) null));
                }
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            android.widget.EditText editText = this.f721b;
            if (editText != null) {
                v1.c(editText.getText().toString(), "record-path", "-record", ".lua");
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != null && !(view.getTag() instanceof p1)) {
                onClick(null, -1);
                return;
            }
            if (MainService.instance.i.d0()) {
                View viewF = a.d.f(2131099669, null);
                ((TextView) viewF.findViewById(2131034328)).setText(b2.f(2131296888));
                EditTextPath editTextPath = (EditTextPath) viewF.findViewById(2131034251);
                this.f721b = editTextPath;
                editTextPath.setText(v1.a("record-path", "-record", ".lua"));
                editTextPath.setDataType(4);
                editTextPath.setPathType(2);
                viewF.findViewById(2131034354).setTag(editTextPath);
                AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.e(viewF, false)).setPositiveButton(b2.f(2131296884), this).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).create();
                f.l(alertDialogCreate, this);
                f.k(alertDialogCreate, this);
                this.f720a = alertDialogCreate;
                f.n(alertDialogCreate, editTextPath);
            }
        }
    }

    public d2() {
        super(2131296888, 2130968641);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }
}
