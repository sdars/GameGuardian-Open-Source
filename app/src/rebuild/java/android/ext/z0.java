package android.ext;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
abstract class z0 {

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            z0.f();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            z0.e();
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0003 A[PHI: r0
          0x0003: PHI (r0v2 byte) = (r0v0 byte), (r0v1 byte) binds: [B:3:0x0001, B:6:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            byte b2 = 1;
            if (i == 1) {
                b1.y = b2;
            } else {
                b2 = 2;
                if (i == 2) {
                    b1.y = b2;
                }
            }
            if (dialogInterface instanceof AlertDialog) {
                ((AlertDialog) dialogInterface).dismiss();
            }
        }
    }

    class d implements DialogInterface.OnCancelListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            z0.e();
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.n.L(1);
            b1.z1();
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b1.R1("install-mode-unavailable");
            r rVar = r.n;
            if (rVar != null) {
                rVar.finish();
            }
            f1.n();
        }
    }

    class g implements DialogInterface.OnClickListener {
        g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            z0.h();
        }
    }

    class h implements DialogInterface.OnCancelListener {
        h() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            z0.h();
        }
    }

    class i implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog f1411a;

        i(AlertDialog alertDialog) {
            this.f1411a = alertDialog;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            z0.j(this.f1411a);
        }
    }

    private static int d(AlertDialog alertDialog) {
        int i2;
        try {
            TypedValue typedValue = new TypedValue();
            if (!alertDialog.getContext().getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true) || (i2 = typedValue.type) < 28 || i2 > 31) {
                return -7686920;
            }
            return typedValue.data;
        } catch (Throwable th) {
            e1.a(th);
            return -7686920;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        r rVar = r.n;
        if (rVar != null) {
            rVar.finish();
        }
        f1.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        AlertDialog alertDialogCreate = android.ext.f.c(r.p).setTitle(b2.f(catch_.me_.if_.you_.can_.R.string.install_mode)).setMessage(g()).setPositiveButton(catch_.me_.if_.you_.can_.R.string.ok, new g()).create();
        i(alertDialogCreate);
        alertDialogCreate.setOnCancelListener(new h());
        android.ext.f.m(alertDialogCreate);
    }

    private static CharSequence g() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) b2.f(catch_.me_.if_.you_.can_.R.string.install_help_intro)).append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) b2.f(catch_.me_.if_.you_.can_.R.string.install_help_choose)).append((CharSequence) "\n\n");
        String[] strArr = {b2.f(catch_.me_.if_.you_.can_.R.string.default_mark), b2.f(catch_.me_.if_.you_.can_.R.string.for32), b2.f(catch_.me_.if_.you_.can_.R.string.for64)};
        int iMax = Math.max(1, (int) (r.p.getResources().getDisplayMetrics().density * 12.0f));
        int i2 = 0;
        while (i2 < 3) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "• ").append((CharSequence) strArr[i2]);
            spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(0, iMax), length, spannableStringBuilder.length(), 33);
            i2++;
            if (i2 < 3) {
                spannableStringBuilder.append('\n');
            }
        }
        return spannableStringBuilder;
    }

    static void h() {
        AlertDialog alertDialogCreate = android.ext.f.c(r.p).setTitle(b2.f(catch_.me_.if_.you_.can_.R.string.install_mode)).setSingleChoiceItems(new String[]{b2.f(catch_.me_.if_.you_.can_.R.string.default_mark), b2.f(catch_.me_.if_.you_.can_.R.string.for32), b2.f(catch_.me_.if_.you_.can_.R.string.for64)}, -1, new c()).setNegativeButton(catch_.me_.if_.you_.can_.R.string.cancel, new b()).setNeutralButton(catch_.me_.if_.you_.can_.R.string.more, new a()).setCancelable(true).create();
        i(alertDialogCreate);
        alertDialogCreate.setOnCancelListener(new d());
        android.ext.f.u(alertDialogCreate, new e(), new f());
    }

    private static void i(AlertDialog alertDialog) {
        try {
            ListView listView = alertDialog.getListView();
            if (listView != null) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(872415231));
                stateListDrawable.addState(new int[]{R.attr.state_focused}, new ColorDrawable(587202559));
                listView.setSelector(stateListDrawable);
                listView.setDivider(new ColorDrawable(587202559));
                listView.setDividerHeight(Math.max(1, (int) listView.getResources().getDisplayMetrics().density));
            }
        } catch (Throwable th) {
            e1.a(th);
        }
        android.ext.f.l(alertDialog, new i(alertDialog));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(AlertDialog alertDialog) {
        try {
            int iD = d(alertDialog);
            int[] iArr = {-1, -2, -3};
            for (int i2 = 0; i2 < 3; i2++) {
                Button button = alertDialog.getButton(iArr[i2]);
                if (button != null) {
                    button.setTextColor(iD);
                    button.setTypeface(button.getTypeface(), 1);
                }
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
