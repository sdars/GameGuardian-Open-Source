package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class h extends p1 {

    private static class b implements DialogInterface.OnClickListener, DialogInterface.OnShowListener, View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CheckBox f994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CheckBox f995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CheckBox f996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EditText f997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private AlertDialog f998e;

        private b() {
            this.f994a = null;
            this.f995b = null;
            this.f996c = null;
            this.f997d = null;
            this.f998e = null;
        }

        public void a(String str) {
            View viewF = a.d.f(2131099648, null);
            EditText editText = (EditText) viewF.findViewById(2131034320);
            this.f997d = editText;
            viewF.findViewById(2131034377).setTag(editText);
            if (str != null) {
                editText.setText(str);
            }
            editText.setDataType(1);
            this.f994a = (CheckBox) viewF.findViewById(2131034374);
            this.f995b = (CheckBox) viewF.findViewById(2131034455);
            this.f996c = (CheckBox) viewF.findViewById(2131034247);
            AlertDialog alertDialogCreate = f.b().setCustomTitle(Tools.g0(2131296270)).setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(2131296836), this).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).create();
            this.f998e = alertDialogCreate;
            f.l(alertDialogCreate, this);
            f.n(alertDialogCreate, editText);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            EditText editText = this.f997d;
            if (editText == null) {
                return;
            }
            try {
                String strH = j2.h(editText.getText().toString().trim());
                if (strH.endsWith("h")) {
                    strH = strH.substring(0, strH.length() - 1);
                }
                if (strH.length() == 0) {
                    strH = "0";
                }
                try {
                    long jR = t1.r(strH, 16);
                    if (jR != 0) {
                        y0.b(strH, 1);
                    }
                    int i2 = this.f994a.isChecked() ? 2 : 0;
                    if (this.f995b.isChecked()) {
                        i2 |= 1;
                    }
                    if (this.f996c.isChecked()) {
                        i2 |= 4;
                    }
                    e1.d("Allocate: " + i2 + "; " + jR);
                    Tools.D(this.f998e);
                    MainService.instance.i.g(jR, i2);
                    c2 c2Var = MainService.instance.f216f;
                    if (c2Var != null) {
                        c2Var.write("gg.allocatePage(");
                        Script.Consts.a(c2Var, c2Var.f697c.f377g, i2);
                        c2Var.write(", ");
                        Script.Consts.b(c2Var, jR);
                        c2Var.write(")\n");
                    }
                } catch (NumberFormatException e2) {
                    editText.requestFocus();
                    throw e2;
                }
            } catch (NumberFormatException e3) {
                j2.i(e3, editText);
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(this.f998e, -1, null, this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == null || (view.getTag() instanceof p1)) {
                a(null);
            } else {
                onClick(null, -1);
            }
        }
    }

    public h() {
        super(2131296270, 2130968597);
    }

    public static void h(String str) {
        new b().a(str);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }
}
