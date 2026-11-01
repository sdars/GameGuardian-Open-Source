package android.ext;

/* JADX INFO: loaded from: classes.dex */
abstract class z0 {

    class a implements android.content.DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.z0.f();
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.z0.e();
        }
    }

    class c implements android.content.DialogInterface.OnClickListener {
        c() {
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0003 A[PHI: r0
          0x0003: PHI (r0v2 byte) = (r0v0 byte), (r0v1 byte) binds: [B:3:0x0001, B:6:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            byte b2 = 1;
            if (i == 1) {
                android.ext.b1.y = b2;
            } else {
                b2 = 2;
                if (i == 2) {
                    android.ext.b1.y = b2;
                }
            }
            if (dialogInterface instanceof android.app.AlertDialog) {
                ((android.app.AlertDialog) dialogInterface).dismiss();
            }
        }
    }

    class d implements android.content.DialogInterface.OnCancelListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface dialogInterface) {
            android.ext.z0.e();
        }
    }

    class e implements java.lang.Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.r.n.L(1);
            android.ext.b1.z1();
        }
    }

    class f implements java.lang.Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.b1.R1("install-mode-unavailable");
            android.ext.r rVar = android.ext.r.n;
            if (rVar != null) {
                rVar.finish();
            }
            android.ext.f1.n();
        }
    }

    class g implements android.content.DialogInterface.OnClickListener {
        g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.z0.h();
        }
    }

    class h implements android.content.DialogInterface.OnCancelListener {
        h() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface dialogInterface) {
            android.ext.z0.h();
        }
    }

    class i implements android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f1411a;

        i(android.app.AlertDialog alertDialog) {
            this.f1411a = alertDialog;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            android.ext.z0.j(this.f1411a);
        }
    }

    private static int d(android.app.AlertDialog alertDialog) {
        int i2;
        try {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (!alertDialog.getContext().getTheme().resolveAttribute(android.R.attr.colorAccent, typedValue, true) || (i2 = typedValue.type) < 28 || i2 > 31) {
                return -7686920;
            }
            return typedValue.data;
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            return -7686920;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        android.ext.r rVar = android.ext.r.n;
        if (rVar != null) {
            rVar.finish();
        }
        android.ext.f1.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        android.app.AlertDialog alertDialogCreate = android.ext.f.c(android.ext.r.p).setTitle(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.install_mode)).setMessage(g()).setPositiveButton(catch_.me_.if_.you_.can_.R.string.ok, new android.ext.z0.g()).create();
        i(alertDialogCreate);
        alertDialogCreate.setOnCancelListener(new android.ext.z0.h());
        android.ext.f.m(alertDialogCreate);
    }

    private static java.lang.CharSequence g() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.install_help_intro)).append((java.lang.CharSequence) "\n\n");
        spannableStringBuilder.append((java.lang.CharSequence) android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.install_help_choose)).append((java.lang.CharSequence) "\n\n");
        java.lang.String[] strArr = {android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.default_mark), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.for32), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.for64)};
        int iMax = java.lang.Math.max(1, (int) (android.ext.r.p.getResources().getDisplayMetrics().density * 12.0f));
        int i2 = 0;
        while (i2 < 3) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) "• ").append((java.lang.CharSequence) strArr[i2]);
            spannableStringBuilder.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, iMax), length, spannableStringBuilder.length(), 33);
            i2++;
            if (i2 < 3) {
                spannableStringBuilder.append('\n');
            }
        }
        return spannableStringBuilder;
    }

    static void h() {
        android.app.AlertDialog alertDialogCreate = android.ext.f.c(android.ext.r.p).setTitle(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.install_mode)).setSingleChoiceItems(new java.lang.String[]{android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.default_mark), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.for32), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.for64)}, -1, new android.ext.z0.c()).setNegativeButton(catch_.me_.if_.you_.can_.R.string.cancel, new android.ext.z0.b()).setNeutralButton(catch_.me_.if_.you_.can_.R.string.more, new android.ext.z0.a()).setCancelable(true).create();
        i(alertDialogCreate);
        alertDialogCreate.setOnCancelListener(new android.ext.z0.d());
        android.ext.f.u(alertDialogCreate, new android.ext.z0.e(), new android.ext.z0.f());
    }

    private static void i(android.app.AlertDialog alertDialog) {
        try {
            android.widget.ListView listView = alertDialog.getListView();
            if (listView != null) {
                android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new android.graphics.drawable.ColorDrawable(872415231));
                stateListDrawable.addState(new int[]{android.R.attr.state_focused}, new android.graphics.drawable.ColorDrawable(587202559));
                listView.setSelector(stateListDrawable);
                listView.setDivider(new android.graphics.drawable.ColorDrawable(587202559));
                listView.setDividerHeight(java.lang.Math.max(1, (int) listView.getResources().getDisplayMetrics().density));
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
        android.ext.f.l(alertDialog, new android.ext.z0.i(alertDialog));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(android.app.AlertDialog alertDialog) {
        try {
            int iD = d(alertDialog);
            int[] iArr = {-1, -2, -3};
            for (int i2 = 0; i2 < 3; i2++) {
                android.widget.Button button = alertDialog.getButton(iArr[i2]);
                if (button != null) {
                    button.setTextColor(iD);
                    button.setTypeface(button.getTypeface(), 1);
                }
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
    }
}
