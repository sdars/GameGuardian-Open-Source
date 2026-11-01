package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class o0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static boolean f1139f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static boolean f1140g = true;
    static boolean h = true;
    static boolean i = true;

    private class b implements DialogInterface.OnClickListener, DialogInterface.OnShowListener, DialogInterface.OnDismissListener, View.OnClickListener, View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AlertDialog f1141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.widget.EditText f1142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.widget.EditText f1143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CheckBox f1144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CheckBox f1145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CheckBox f1146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Button f1147g;
        private View h;

        class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1148a;

            a(int i) {
                this.f1148a = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                MainService.instance.P();
                b.this.onClick(null, this.f1148a);
            }
        }

        private b() {
        }

        private void a() {
            boolean z = o0.f1139f;
            this.f1147g.setText(b2.f(z ? 2131296738 : 2131296786));
            this.h.setVisibility(z ? 0 : 8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [int] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r6v1, types: [android.ext.MainService] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
            ?? r0;
            ?? r1;
            o0.f1140g = this.f1144d.isChecked();
            o0.h = this.f1145e.isChecked();
            o0.i = this.f1146f.isChecked();
            String strTrim = this.f1143c.getText().toString().trim();
            if (!o0.f1139f) {
                r0 = 0;
            } else {
                if (!Tools.f1(strTrim)) {
                    return;
                }
                boolean z = o0.f1140g;
                if (o0.h) {
                    r1 = z;
                    r1 = (z ? 1 : 0) | 2;
                }
                r1 = z;
                r0 = r1;
                if (o0.i) {
                    r0 = (r1 == true ? 1 : 0) | 4;
                }
            }
            y0.b(strTrim, 4);
            android.widget.EditText editText = this.f1142b;
            if (editText == null) {
                return;
            }
            String strTrim2 = editText.getText().toString().trim();
            if (Tools.f1(strTrim2) && Tools.a1(strTrim2)) {
                y0.b(strTrim2, 4);
                if (MainService.instance.f212b != null) {
                    f.o(f.b().setCustomTitle(Tools.g0(2131296417)).setMessage(b2.f(2131296276)).setPositiveButton(b2.f(2131296711), new a(i)).setNegativeButton(b2.f(2131296805), (DialogInterface.OnClickListener) null));
                    return;
                }
                MainService.instance.x(strTrim2, r0, strTrim);
                Tools.D(this.f1141a);
                c2 c2Var = MainService.instance.f216f;
                if (c2Var != null) {
                    c2Var.write("loadfile(");
                    Script.Consts.d(c2Var, strTrim2);
                    c2Var.write(")()\n");
                }
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            android.widget.EditText editText = this.f1142b;
            if (editText != null) {
                v1.c(editText.getText().toString(), "script-path", "-script", ".lua");
            }
            android.widget.EditText editText2 = this.f1143c;
            if (editText2 != null) {
                v1.b(editText2.getText().toString().trim(), "script-debug");
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (view == null || view.getId() != 2131034226) {
                return false;
            }
            ConfigListAdapter.t(2131296638);
            return true;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            String strL1;
            if (view != null && !(view.getTag() instanceof p1)) {
                int id = view.getId();
                if (id == 2131034246) {
                    new Script("print('gg =', gg)", 0, "").R3();
                    return;
                }
                if (id == 2131034248) {
                    o0.f1139f = !o0.f1139f;
                    a();
                    return;
                }
                if (id != 2131034278) {
                    onClick(null, -1);
                    return;
                }
                File file = new File(Tools.K0(), "help.zip");
                try {
                    Tools.M("he", file);
                    str = null;
                } catch (RuntimeException e2) {
                    str = "" + e2.getMessage();
                }
                AlertDialog.Builder customTitle = f.b().setCustomTitle(Tools.g0(2131296532));
                if (str == null) {
                    strL1 = Tools.L1(b2.f(2131296533), file.getAbsolutePath());
                } else {
                    strL1 = Tools.N1(2131296534) + ": " + str;
                }
                f.o(customTitle.setMessage(strL1).setNegativeButton(b2.f(2131296836), (DialogInterface.OnClickListener) null));
                return;
            }
            if (MainService.instance.i.d0()) {
                View viewF = a.d.f(2131099651, null);
                ((TextView) viewF.findViewById(2131034328)).setText(b2.f(2131296423));
                EditTextPath editTextPath = (EditTextPath) viewF.findViewById(2131034251);
                this.f1142b = editTextPath;
                editTextPath.setText(v1.a("script-path", "-script", ".lua"));
                editTextPath.setDataType(4);
                editTextPath.setPathType(1);
                viewF.findViewById(2131034252).setTag(editTextPath);
                Config.m((ImageView) viewF.findViewById(2131034246)).setOnClickListener(this);
                viewF.findViewById(2131034229).setOnClickListener(new r.n("kwws=22jdphjxdugldq1qhw2iruxp2ilohv2fdwhjru|290oxd0vfulswv2"));
                viewF.findViewById(2131034277).setOnClickListener(new r.n("kwws=22jdphjxdugldq1qhw2khos2"));
                viewF.findViewById(2131034278).setOnClickListener(this);
                this.h = viewF.findViewById(2131034223);
                EditTextPath editTextPath2 = (EditTextPath) viewF.findViewById(2131034353);
                this.f1143c = editTextPath2;
                editTextPath2.setText(v1.b(null, "script-debug"));
                editTextPath2.setDataType(4);
                editTextPath2.setPathType(0);
                viewF.findViewById(2131034354).setTag(editTextPath2);
                CheckBox checkBox = (CheckBox) viewF.findViewById(2131034226);
                this.f1144d = checkBox;
                checkBox.setChecked(o0.f1140g);
                Tools.r1(checkBox);
                checkBox.setOnLongClickListener(this);
                CheckBox checkBox2 = (CheckBox) viewF.findViewById(2131034308);
                this.f1145e = checkBox2;
                checkBox2.setChecked(o0.h);
                CheckBox checkBox3 = (CheckBox) viewF.findViewById(2131034311);
                this.f1146f = checkBox3;
                checkBox3.setChecked(o0.i);
                Button button = (Button) viewF.findViewById(2131034248);
                this.f1147g = button;
                button.setOnClickListener(this);
                a();
                AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.e(viewF, false)).setPositiveButton(b2.f(2131296422), this).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).create();
                f.l(alertDialogCreate, this);
                f.k(alertDialogCreate, this);
                this.f1141a = alertDialogCreate;
                f.n(alertDialogCreate, editTextPath);
            }
        }
    }

    public o0() {
        super(2131296423, 2130968638);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }
}
