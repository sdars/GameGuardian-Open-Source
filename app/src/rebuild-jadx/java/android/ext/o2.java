package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class o2 extends android.ext.p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile java.lang.String f1158f = "0";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile android.ext.o2 f1159g;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f1160a;

        a(long j) {
            this.f1160a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService.instance.i.e(this.f1160a);
        }
    }

    private class b implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener, android.text.TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.ext.EditText f1161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.widget.TextView f1162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.widget.TextView f1163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        android.app.AlertDialog f1164d;

        class a implements android.ext.Config.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.Config.p f1166a;

            a(android.ext.Config.p pVar) {
                this.f1166a = pVar;
            }

            @Override // android.ext.Config.p.b
            public void a(int i) {
                this.f1166a.g(null);
                android.ext.o2.b.this.f1163c.setText(this.f1166a.toString());
            }
        }

        private b() {
        }

        /* synthetic */ b(android.ext.o2 o2Var, android.ext.o2.a aVar) {
            this();
        }

        public void a() {
            java.lang.String strG1;
            android.ext.EditText editText = this.f1161a;
            android.widget.TextView textView = this.f1162b;
            if (editText == null) {
                strG1 = "?";
            } else {
                try {
                    strG1 = android.ext.Tools.g1(android.ext.o2.i(editText.getText().toString().trim()) / 1000000000);
                } catch (java.lang.NumberFormatException unused) {
                    strG1 = "???";
                }
            }
            if (textView != null) {
                textView.setText(strG1);
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            a();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            try {
                java.lang.String strH = android.ext.j2.h(this.f1161a.getText().toString().trim());
                android.ext.o2.h(android.ext.o2.i(strH));
                android.ext.y0.b(strH, 1);
                android.ext.Tools.D(dialogInterface);
            } catch (java.lang.NumberFormatException e2) {
                android.ext.j2.i(e2, this.f1161a);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (view != null && !(view.getTag() instanceof android.ext.p1)) {
                int id = view.getId();
                if (id == catch_.me_.if_.you_.can_.R.id.config_time_jump_panel) {
                    android.ext.Config.p pVarB = android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_time_jump_panel);
                    pVarB.g(new android.ext.o2.b.a(pVarB));
                    pVarB.b();
                    return;
                } else if (id != catch_.me_.if_.you_.can_.R.id.examples) {
                    onClick(this.f1164d, -1);
                    return;
                } else {
                    android.ext.Searcher.I(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.examples_timejump));
                    return;
                }
            }
            android.view.View viewF = gga.d.f(catch_.me_.if_.you_.can_.R.layout.time_jump, null);
            android.ext.Config.m((android.widget.ImageView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.examples)).setOnClickListener(this);
            this.f1162b = (android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.hint);
            android.widget.TextView textView = (android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.config_time_jump_panel);
            this.f1163c = textView;
            textView.setOnClickListener(this);
            this.f1163c.setText(android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_time_jump_panel).toString());
            this.f1161a = (android.ext.EditText) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.time_jump);
            java.lang.String strF = android.ext.o2.f1158f;
            if (strF.length() == 0 || "0".equals(strF)) {
                strF = android.ext.Tools.F(((double) android.ext.Config.v) / 1000.0d);
            }
            this.f1161a.setText(strF);
            this.f1161a.addTextChangedListener(this);
            this.f1161a.setDataType(1);
            a();
            android.app.AlertDialog alertDialogCreate = android.ext.f.b().setView(android.ext.InternalKeyboard.d(viewF)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), this).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.back), (android.content.DialogInterface.OnClickListener) null).create();
            this.f1164d = alertDialogCreate;
            android.ext.f.l(alertDialogCreate, this);
            android.ext.f.k(this.f1164d, this);
            android.ext.f.n(this.f1164d, this.f1161a);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            android.ext.o2.f1158f = this.f1161a.getText().toString().trim();
            try {
                android.ext.o2.j(android.ext.o2.i(android.ext.j2.h(android.ext.o2.f1158f)));
            } catch (java.lang.NumberFormatException unused) {
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            android.ext.Tools.s1(dialogInterface, -1, null, this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            a();
        }
    }

    public o2() {
        super(catch_.me_.if_.you_.can_.R.string.time_jump, catch_.me_.if_.you_.can_.R.drawable.ic_fast_forward_white_24dp);
        f1159g = this;
    }

    public static void h(long j) {
        if (android.ext.MainService.instance.h.a(false, new android.ext.o2.a(j))) {
            android.ext.MainService.instance.i.e(j);
        }
        j(j);
        android.ext.c2 c2Var = android.ext.MainService.instance.f216f;
        if (c2Var != null) {
            java.lang.String strF = android.ext.Tools.F(j / 1.0E9d);
            c2Var.write("gg.timeJump(");
            android.ext.Script.Consts.c(c2Var, strF);
            c2Var.write(")\n");
        }
    }

    public static long i(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        double dJ1 = android.ext.Tools.j1(strTrim);
        if (dJ1 < -92233720) {
            android.ext.t1.a aVar = new android.ext.t1.a(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.number_less), strTrim, -92233720L));
            aVar.c(strTrim);
            aVar.a(-92233720L);
            throw aVar;
        }
        if (dJ1 <= 92233720) {
            return (long) (dJ1 * 1.0E9d);
        }
        android.ext.t1.a aVar2 = new android.ext.t1.a(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.number_greater), strTrim, 92233720L));
        aVar2.c(strTrim);
        aVar2.a(92233720L);
        throw aVar2;
    }

    static void j(long j) {
        android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_time_jump_last).f42d = (int) ((j / 1.0E9d) * 1000.0d);
        android.ext.Config.k();
        android.ext.TimeJumpPanel timeJumpPanel = android.ext.MainService.instance.k;
        if (timeJumpPanel != null) {
            timeJumpPanel.r();
        }
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        new android.ext.o2.b(this, null).onClick(view);
    }
}
