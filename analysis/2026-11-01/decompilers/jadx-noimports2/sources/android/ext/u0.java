package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends android.ext.p1 {

    private static class b implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static java.lang.String f1268c = "";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.app.AlertDialog f1269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.ext.EditText f1270b;

        class a implements android.view.View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.RegionList f1271a;

            a(android.ext.RegionList regionList) {
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
            public void onClick(android.view.View view) {
                int i;
                int id = view.getId();
                if (id == catch_.me_.if_.you_.can_.R.id.cb) {
                    i = 16;
                } else if (id != catch_.me_.if_.you_.can_.R.id.ps) {
                    i = id != catch_.me_.if_.you_.can_.R.id.xa ? 8 : 16384;
                } else {
                    i = 262144;
                }
                android.ext.RegionList regionList = this.f1271a;
                regionList.j(regionList, i);
            }
        }

        private b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            if (i == -1) {
                onClick(((android.app.AlertDialog) dialogInterface).getButton(i));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (view != null && !(view.getTag() instanceof android.ext.p1)) {
                if (view.getId() == catch_.me_.if_.you_.can_.R.id.history) {
                    android.ext.Tools.D(this.f1269a);
                    android.ext.MainService.instance.O.d();
                    return;
                }
                if (view.getId() == catch_.me_.if_.you_.can_.R.id.addr) {
                    android.ext.f.o(android.ext.f.b().setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.examples) + ":\nBAFE890\nBAFE890+3F0\nBAFE890-A40\nBAFE890+FE-CD7+44-3E\n\nlibc.so\nlibc.so+E0\nlibc.so-32C").setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.help), android.ext.ConfigListAdapter.h()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null));
                    return;
                }
                try {
                    android.ext.EditText editText = this.f1270b;
                    if (editText != null) {
                        java.lang.String strH = android.ext.j2.h(editText.getText().toString().trim());
                        android.ext.y0.b(strH, 1);
                        android.ext.MainService.instance.L(null, strH, android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.from_goto));
                    }
                    android.ext.Tools.D(this.f1269a);
                    return;
                } catch (java.lang.NumberFormatException e2) {
                    android.ext.j2.i(e2, this.f1270b);
                    return;
                }
            }
            android.view.View viewF = a.d.f(catch_.me_.if_.you_.can_.R.layout.service_goto, null);
            android.widget.TextView textView = (android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.addr);
            android.ext.Tools.r1(textView);
            textView.setOnClickListener(this);
            android.ext.EditText editText2 = (android.ext.EditText) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.mem_edit_addr);
            this.f1270b = editText2;
            android.ext.RegionList regionList = (android.ext.RegionList) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.region_from);
            regionList.setTag(editText2);
            android.ext.u0.b.a aVar = new android.ext.u0.b.a(regionList);
            viewF.findViewById(catch_.me_.if_.you_.can_.R.id.cd).setOnClickListener(aVar);
            viewF.findViewById(catch_.me_.if_.you_.can_.R.id.cb).setOnClickListener(aVar);
            viewF.findViewById(catch_.me_.if_.you_.can_.R.id.ps).setOnClickListener(aVar);
            viewF.findViewById(catch_.me_.if_.you_.can_.R.id.xa).setOnClickListener(aVar);
            viewF.findViewById(catch_.me_.if_.you_.can_.R.id.history).setOnClickListener(this);
            editText2.setText(f1268c);
            editText2.setDataType(1);
            android.app.AlertDialog alertDialogCreate = android.ext.f.b().setView(android.ext.InternalKeyboard.d(viewF)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.goto1), this).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null).create();
            this.f1269a = alertDialogCreate;
            android.ext.f.k(alertDialogCreate, this);
            android.ext.f.l(alertDialogCreate, this);
            android.ext.f.n(alertDialogCreate, editText2);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            android.ext.EditText editText = this.f1270b;
            if (editText != null) {
                f1268c = editText.getText().toString().trim();
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            android.ext.Tools.t1(dialogInterface, -1, null, this, this.f1270b);
        }
    }

    public u0() {
        super(catch_.me_.if_.you_.can_.R.string.goto1, catch_.me_.if_.you_.can_.R.drawable.ic_forward_white_24dp);
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        new android.ext.u0.b().onClick(view);
    }
}
