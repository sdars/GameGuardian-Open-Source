package android.ext;

import android.R$attr;
import android.app.AlertDialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan$Standard;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.ListView;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
abstract class z0 {
    private static int d(AlertDialog alertDialog) {
        int i;
        try {
            TypedValue typedValue = new TypedValue();
            if (!alertDialog.getContext().getTheme().resolveAttribute(R$attr.colorAccent, typedValue, true) || (i = typedValue.type) < 28 || i > 31) {
                return -7686920;
            }
            return typedValue.data;
        } catch (Throwable th) {
            e1.a(th);
            return -7686920;
        }
    }

    private static void e() {
        r rVar = r.n;
        if (rVar != null) {
            rVar.finish();
        }
        f1.n();
    }

    private static void f() {
        AlertDialog alertDialogCreate = f.c(r.p).setTitle(b2.f(R$string.install_mode)).setMessage(g()).setPositiveButton(R$string.ok, new z0$g()).create();
        i(alertDialogCreate);
        alertDialogCreate.setOnCancelListener(new z0$h());
        f.m(alertDialogCreate);
    }

    private static CharSequence g() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) b2.f(R$string.install_help_intro)).append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) b2.f(R$string.install_help_choose)).append((CharSequence) "\n\n");
        String[] strArr = {b2.f(R$string.default_mark), b2.f(R$string.for32), b2.f(R$string.for64)};
        int iMax = Math.max(1, (int) (r.p.getResources().getDisplayMetrics().density * 12.0f));
        int i = 0;
        while (i < 3) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "• ").append((CharSequence) strArr[i]);
            spannableStringBuilder.setSpan(new LeadingMarginSpan$Standard(0, iMax), length, spannableStringBuilder.length(), 33);
            i++;
            if (i < 3) {
                spannableStringBuilder.append('\n');
            }
        }
        return spannableStringBuilder;
    }

    static void h() {
        AlertDialog alertDialogCreate = f.c(r.p).setTitle(b2.f(R$string.install_mode)).setSingleChoiceItems(new String[]{b2.f(R$string.default_mark), b2.f(R$string.for32), b2.f(R$string.for64)}, -1, new z0$c()).setNegativeButton(R$string.cancel, new z0$b()).setNeutralButton(R$string.more, new z0$a()).setCancelable(true).create();
        i(alertDialogCreate);
        alertDialogCreate.setOnCancelListener(new z0$d());
        f.u(alertDialogCreate, new z0$e(), new z0$f());
    }

    private static void i(AlertDialog alertDialog) {
        try {
            ListView listView = alertDialog.getListView();
            if (listView != null) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{R$attr.state_pressed}, new ColorDrawable(872415231));
                stateListDrawable.addState(new int[]{R$attr.state_focused}, new ColorDrawable(587202559));
                listView.setSelector(stateListDrawable);
                listView.setDivider(new ColorDrawable(587202559));
                listView.setDividerHeight(Math.max(1, (int) listView.getResources().getDisplayMetrics().density));
            }
        } catch (Throwable th) {
            e1.a(th);
        }
        f.l(alertDialog, new z0$i(alertDialog));
    }

    private static void j(AlertDialog alertDialog) {
        try {
            int iD = d(alertDialog);
            int[] iArr = {-1, -2, -3};
            for (int i = 0; i < 3; i++) {
                Button button = alertDialog.getButton(iArr[i]);
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
