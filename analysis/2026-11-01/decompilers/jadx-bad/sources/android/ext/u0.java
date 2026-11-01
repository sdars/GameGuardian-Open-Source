package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class u0 extends p1 {

    private static class b implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static String f1268c = "";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AlertDialog f1269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EditText f1270b;

        class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RegionList f1271a;

            a(RegionList regionList) {
                this.f1271a = regionList;
            }

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
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i;
                int id = view.getId();
                if (id == 2131034144) {
                    i = 16;
                } else if (id != 2131034363) {
                    i = id != 2131034456 ? 8 : 16384;
                } else {
                    i = 262144;
                }
                RegionList regionList = this.f1271a;
                regionList.j(regionList, i);
            }
        }

        private b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                onClick(((AlertDialog) dialogInterface).getButton(i));
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            EditText editText = this.f1270b;
            if (editText != null) {
                f1268c = editText.getText().toString().trim();
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.t1(dialogInterface, -1, null, this, this.f1270b);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != null && !(view.getTag() instanceof p1)) {
                if (view.getId() == 2131034286) {
                    Tools.D(this.f1269a);
                    MainService.instance.O.d();
                    return;
                }
                if (view.getId() == 2131034116) {
                    f.o(f.b().setMessage(b2.f(2131296418) + ":\nBAFE890\nBAFE890+3F0\nBAFE890-A40\nBAFE890+FE-CD7+44-3E\n\nlibc.so\nlibc.so+E0\nlibc.so-32C").setPositiveButton(b2.f(2131296519), ConfigListAdapter.h()).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null));
                    return;
                }
                try {
                    EditText editText = this.f1270b;
                    if (editText != null) {
                        String strH = j2.h(editText.getText().toString().trim());
                        y0.b(strH, 1);
                        MainService.instance.L(null, strH, Tools.N1(2131296497));
                    }
                    Tools.D(this.f1269a);
                    return;
                } catch (NumberFormatException e2) {
                    j2.i(e2, this.f1270b);
                    return;
                }
            }
            View viewF = a.d.f(2131099681, null);
            TextView textView = (TextView) viewF.findViewById(2131034116);
            Tools.r1(textView);
            textView.setOnClickListener(this);
            EditText editText2 = (EditText) viewF.findViewById(2131034316);
            this.f1270b = editText2;
            RegionList regionList = (RegionList) viewF.findViewById(2131034377);
            regionList.setTag(editText2);
            a aVar = new a(regionList);
            viewF.findViewById(2131034145).setOnClickListener(aVar);
            viewF.findViewById(2131034144).setOnClickListener(aVar);
            viewF.findViewById(2131034363).setOnClickListener(aVar);
            viewF.findViewById(2131034456).setOnClickListener(aVar);
            viewF.findViewById(2131034286).setOnClickListener(this);
            editText2.setText(f1268c);
            editText2.setDataType(1);
            AlertDialog alertDialogCreate = f.b().setView(InternalKeyboard.d(viewF)).setPositiveButton(b2.f(2131296514), this).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).create();
            this.f1269a = alertDialogCreate;
            f.k(alertDialogCreate, this);
            f.l(alertDialogCreate, this);
            f.n(alertDialogCreate, editText2);
        }
    }

    public u0() {
        super(2131296514, 2130968618);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(View view) {
        new b().onClick(view);
    }
}
