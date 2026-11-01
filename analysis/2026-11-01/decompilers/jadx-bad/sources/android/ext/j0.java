package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class j0 extends p1 {

    private static class b implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnShowListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.widget.EditText f1028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AlertDialog f1029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EditText f1030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EditText f1031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CheckBox f1032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f1033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f1034g;

        class a extends InternalKeyboard.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ EditTextPath f1035a;

            a(EditTextPath editTextPath) {
                this.f1035a = editTextPath;
            }

            @Override // android.ext.InternalKeyboard.e
            protected boolean a(View view, boolean z) {
                return view == this.f1035a;
            }
        }

        private b() {
            this.f1033f = 0L;
            this.f1034g = -1L;
        }

        private String a() {
            return Tools.K0() + "/dump";
        }

        private long b(int i) {
            long jB = MemoryRange.b(i, this.f1030c, "0", this.f1031d, "-1");
            if (i == 0) {
                this.f1033f = jB;
            } else {
                this.f1034g = jB;
            }
            return jB;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            android.widget.EditText editText = this.f1028a;
            if (editText == null) {
                return;
            }
            try {
                b(0);
                b(1);
                String strQ1 = Tools.Q1(editText.getText().toString().trim());
                if (Tools.f1(strQ1)) {
                    y0.b(strQ1, 4);
                    boolean zIsChecked = this.f1032e.isChecked();
                    e1.d("Dump: " + strQ1 + "; " + Long.toHexString(this.f1033f) + '-' + Long.toHexString(this.f1034g) + "; " + Integer.toHexString(zIsChecked ? 1 : 0));
                    Tools.D(this.f1029b);
                    z1.d dVar = MainService.instance.v0;
                    String str = dVar == null ? "unknown" : dVar.f1434c;
                    if (MainService.instance.a1()) {
                        MainService.instance.i.x(this.f1033f, this.f1034g, zIsChecked ? 1 : 0, strQ1, str);
                        c2 c2Var = MainService.instance.f216f;
                        if (c2Var != null) {
                            c2Var.write("gg.dumpMemory(");
                            Script.Consts.b(c2Var, this.f1033f);
                            c2Var.write(", ");
                            Script.Consts.b(c2Var, this.f1034g);
                            c2Var.write(", ");
                            Script.Consts.d(c2Var, strQ1);
                            c2Var.write(", ");
                            Script.Consts.a(c2Var, c2Var.f697c.i, zIsChecked ? 1 : 0);
                            c2Var.write(")\n");
                        }
                    }
                }
            } catch (NumberFormatException e2) {
                j2.i(e2, editText);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            android.widget.EditText editText = this.f1028a;
            if (editText == null) {
                return;
            }
            new g2().k("dump-path", editText.getText().toString().trim(), a()).commit();
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
            View viewF = a.d.f(2131099650, null);
            EditTextPath editTextPath = (EditTextPath) viewF.findViewById(2131034353);
            this.f1028a = editTextPath;
            editTextPath.setText(Tools.M0().getString("dump-path", a()));
            editTextPath.setDataType(4);
            editTextPath.setPathType(0);
            viewF.findViewById(2131034354).setTag(editTextPath);
            v2.a((Button) viewF.findViewById(2131034434), editTextPath);
            EditText editText = (EditText) viewF.findViewById(2131034320);
            this.f1030c = editText;
            viewF.findViewById(2131034377).setTag(editText);
            EditText editText2 = (EditText) viewF.findViewById(2131034324);
            this.f1031d = editText2;
            viewF.findViewById(2131034378).setTag(editText2);
            editText.setText(c.G(this.f1033f, 4));
            editText.setDataType(1);
            InternalKeyboard.o(editText, 1);
            editText2.setText(c.G(this.f1034g, 4));
            editText2.setDataType(1);
            this.f1032e = (CheckBox) viewF.findViewById(2131034406);
            a aVar = new a(editTextPath);
            for (View view2 : viewF.getFocusables(2)) {
                if (view2 instanceof EditText) {
                    Tools.z1(view2, aVar);
                }
            }
            AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(2131296917), this).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).create();
            this.f1029b = alertDialogCreate;
            f.l(alertDialogCreate, this);
            f.k(alertDialogCreate, this);
            f.n(alertDialogCreate, editTextPath);
        }
    }

    public j0() {
        super(2131296392, 2130968613);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }
}
