package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
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
            this.f1147g.setText(b2.f(z ? R.string.less : R.string.more));
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
            int flags;
            o0.f1140g = this.f1144d.isChecked();
            o0.h = this.f1145e.isChecked();
            o0.i = this.f1146f.isChecked();
            String strTrim = this.f1143c.getText().toString().trim();
            if (!o0.f1139f) {
                flags = 0;
            } else {
                if (!Tools.f1(strTrim)) {
                    return;
                }
                flags = o0.f1140g ? 1 : 0;
                if (o0.h) {
                    flags |= 2;
                }
                if (o0.i) {
                    flags |= 4;
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
                    f.o(f.b().setCustomTitle(Tools.g0(R.string.error)).setMessage(b2.f(R.string.another_script)).setPositiveButton(b2.f(R.string.interrupt), new a(i)).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null));
                    return;
                }
                MainService.instance.x(strTrim2, flags, strTrim);
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
            if (view == null || view.getId() != R.id.disassemble) {
                return false;
            }
            ConfigListAdapter.t(R.string.help_lasm);
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
                if (id == R.id.examples) {
                    new Script("print('gg =', gg)", 0, "").R3();
                    return;
                }
                if (id == R.id.ext_btn) {
                    o0.f1139f = !o0.f1139f;
                    a();
                    return;
                }
                if (id != R.id.help_extract) {
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
                AlertDialog.Builder customTitle = f.b().setCustomTitle(Tools.g0(R.string.help_extract));
                if (str == null) {
                    strL1 = Tools.L1(b2.f(R.string.help_extract_done), file.getAbsolutePath());
                } else {
                    strL1 = Tools.N1(R.string.help_extract_fail) + ": " + str;
                }
                f.o(customTitle.setMessage(strL1).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
                return;
            }
            if (MainService.instance.i.d0()) {
                View viewF = a.d.f(R.layout.execute, null);
                ((TextView) viewF.findViewById(R.id.message)).setText(b2.f(R.string.execute_script));
                EditTextPath editTextPath = (EditTextPath) viewF.findViewById(R.id.file);
                this.f1142b = editTextPath;
                editTextPath.setText(v1.a("script-path", "-script", ".lua"));
                editTextPath.setDataType(4);
                editTextPath.setPathType(1);
                viewF.findViewById(R.id.file_selector).setTag(editTextPath);
                Config.m((ImageView) viewF.findViewById(R.id.examples)).setOnClickListener(this);
                viewF.findViewById(R.id.download_scripts).setOnClickListener(new r.n("kwws=22jdphjxdugldq1qhw2iruxp2ilohv2fdwhjru|290oxd0vfulswv2"));
                viewF.findViewById(R.id.help).setOnClickListener(new r.n("kwws=22jdphjxdugldq1qhw2khos2"));
                viewF.findViewById(R.id.help_extract).setOnClickListener(this);
                this.h = viewF.findViewById(R.id.debug);
                EditTextPath editTextPath2 = (EditTextPath) viewF.findViewById(R.id.path);
                this.f1143c = editTextPath2;
                editTextPath2.setText(v1.b(null, "script-debug"));
                editTextPath2.setDataType(4);
                editTextPath2.setPathType(0);
                viewF.findViewById(R.id.path_selector).setTag(editTextPath2);
                CheckBox checkBox = (CheckBox) viewF.findViewById(R.id.disassemble);
                this.f1144d = checkBox;
                checkBox.setChecked(o0.f1140g);
                Tools.r1(checkBox);
                checkBox.setOnLongClickListener(this);
                CheckBox checkBox2 = (CheckBox) viewF.findViewById(R.id.load);
                this.f1145e = checkBox2;
                checkBox2.setChecked(o0.h);
                CheckBox checkBox3 = (CheckBox) viewF.findViewById(R.id.log);
                this.f1146f = checkBox3;
                checkBox3.setChecked(o0.i);
                Button button = (Button) viewF.findViewById(R.id.ext_btn);
                this.f1147g = button;
                button.setOnClickListener(this);
                a();
                AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.e(viewF, false)).setPositiveButton(b2.f(R.string.execute), this).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).create();
                f.l(alertDialogCreate, this);
                f.k(alertDialogCreate, this);
                this.f1141a = alertDialogCreate;
                f.n(alertDialogCreate, editTextPath);
            }
        }
    }

    public o0() {
        super(R.string.execute_script, R.drawable.ic_play_white_24dp);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }
}
