package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends p1 {

    private static class b implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private EditText f681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AlertDialog f682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EditText f683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EditText f684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f687g;

        private b() {
            this.f685e = 0L;
            this.f686f = 0L;
            this.f687g = 0;
        }

        private long a(int i) {
            long jB = MemoryRange.b(i, this.f683c, "0", this.f684d, "0");
            if (i == 0) {
                this.f685e = jB;
            } else {
                this.f686f = jB;
            }
            return jB;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            EditText editText = this.f681a;
            if (editText == null) {
                return;
            }
            try {
                a(0);
                a(1);
                String strH = j2.h(editText.getText().toString().trim());
                if (strH.length() == 0) {
                    strH = "0";
                }
                try {
                    int i2 = (int) t1.x(strH).f1261a;
                    this.f687g = i2;
                    if (i2 != 0) {
                        y0.b(strH, 1);
                    }
                    e1.d("Copy: " + this.f687g + "; " + Long.toHexString(this.f685e) + '-' + Long.toHexString(this.f686f));
                    Tools.D(this.f682b);
                    MainService.instance.i.q(this.f685e, this.f686f, this.f687g);
                    c2 c2Var = MainService.instance.f216f;
                    if (c2Var != null) {
                        c2Var.write("gg.copyMemory(");
                        Script.Consts.b(c2Var, this.f685e);
                        c2Var.write(", ");
                        Script.Consts.b(c2Var, this.f686f);
                        c2Var.write(", ");
                        c2Var.write(Integer.toString(this.f687g));
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
            Tools.s1(dialogInterface, -1, null, this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != null && !(view.getTag() instanceof p1)) {
                onClick(null, -1);
                return;
            }
            View viewF = gga.d.f(R.layout.memory_copy, null);
            EditText editText = (EditText) viewF.findViewById(R.id.count_bytes);
            this.f681a = editText;
            viewF.findViewById(R.id.bytes_converter).setTag(editText);
            editText.setText(i0.c(this.f687g, 4));
            editText.setDataType(1);
            EditText editText2 = (EditText) viewF.findViewById(R.id.memory_from);
            this.f683c = editText2;
            viewF.findViewById(R.id.region_from).setTag(editText2);
            EditText editText3 = (EditText) viewF.findViewById(R.id.memory_dst);
            this.f684d = editText3;
            viewF.findViewById(R.id.region_dst).setTag(editText3);
            editText2.setText(ggc.G(this.f685e, 4));
            editText2.setDataType(1);
            editText3.setText(ggc.G(this.f686f, 4));
            editText3.setDataType(1);
            AlertDialog alertDialogCreate = ggf.b().setCustomTitle(Tools.g0(R.string.copy_memory)).setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(R.string.ok), this).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).create();
            this.f682b = alertDialogCreate;
            ggf.l(alertDialogCreate, this);
            ggf.n(alertDialogCreate, editText);
        }
    }

    public c0() {
        super(R.string.copy_memory, R.drawable.ic_content_duplicate_white_24dp);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }
}
