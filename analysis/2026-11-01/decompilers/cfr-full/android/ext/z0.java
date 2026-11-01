/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.b1;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.f1;
import android.ext.r;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.ListView;

abstract class z0 {
    private static int d(AlertDialog alertDialog) {
        block3: {
            int n3;
            TypedValue typedValue = new TypedValue();
            if (!alertDialog.getContext().getTheme().resolveAttribute(16843829, typedValue, true) || (n3 = typedValue.type) < 28 || n3 > 31) break block3;
            try {
                n3 = typedValue.data;
                return n3;
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        return -7686920;
    }

    private static void e() {
        r r3 = r.n;
        if (r3 != null) {
            r3.finish();
        }
        f1.n();
    }

    private static void f() {
        AlertDialog alertDialog = f.c(r.p).setTitle((CharSequence)b2.f(2131296704)).setMessage(z0.g()).setPositiveButton(2131296836, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n3) {
                z0.h();
            }
        }).create();
        z0.i(alertDialog);
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener(){

            public void onCancel(DialogInterface dialogInterface) {
                z0.h();
            }
        });
        f.m(alertDialog);
    }

    private static CharSequence g() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence)b2.f(2131296703)).append((CharSequence)"\n\n");
        spannableStringBuilder.append((CharSequence)b2.f(2131296702)).append((CharSequence)"\n\n");
        String string2 = b2.f(2131296373);
        String string3 = b2.f(2131296464);
        String string4 = b2.f(2131296465);
        int n3 = Math.max(1, (int)(r.p.getResources().getDisplayMetrics().density * 12.0f));
        int n4 = 0;
        while (n4 < 3) {
            int n5 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence)"• ").append((CharSequence)(new String[]{string2, string3, string4})[n4]);
            spannableStringBuilder.setSpan((Object)new LeadingMarginSpan.Standard(0, n3), n5, spannableStringBuilder.length(), 33);
            n4 = n5 = n4 + 1;
            if (n5 >= 3) continue;
            spannableStringBuilder.append('\n');
            n4 = n5;
        }
        return spannableStringBuilder;
    }

    static void h() {
        AlertDialog.Builder builder = f.c(r.p).setTitle((CharSequence)b2.f(2131296704));
        String string2 = b2.f(2131296373);
        String string3 = b2.f(2131296464);
        String string4 = b2.f(2131296465);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(){

            /*
             * Enabled aggressive block sorting
             */
            public void onClick(DialogInterface dialogInterface, int n3) {
                block5: {
                    int n4;
                    block4: {
                        n4 = 1;
                        if (n3 == 1) break block4;
                        n4 = 2;
                        if (n3 != 2) break block5;
                    }
                    b1.y = n4;
                }
                if (dialogInterface instanceof AlertDialog) {
                    ((AlertDialog)dialogInterface).dismiss();
                }
            }
        };
        builder = builder.setSingleChoiceItems((CharSequence[])new String[]{string2, string3, string4}, -1, onClickListener).setNegativeButton(2131296311, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n3) {
                z0.e();
            }
        }).setNeutralButton(2131296786, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n3) {
                z0.f();
            }
        }).setCancelable(true).create();
        z0.i((AlertDialog)builder);
        builder.setOnCancelListener(new DialogInterface.OnCancelListener(){

            public void onCancel(DialogInterface dialogInterface) {
                z0.e();
            }
        });
        f.u((AlertDialog)builder, new Runnable(){

            @Override
            public void run() {
                r.n.L(1);
                b1.z1();
            }
        }, new Runnable(){

            @Override
            public void run() {
                b1.R1("install-mode-unavailable");
                r r3 = r.n;
                if (r3 != null) {
                    r3.finish();
                }
                f1.n();
            }
        });
    }

    private static void i(AlertDialog alertDialog) {
        block3: {
            ListView listView = alertDialog.getListView();
            if (listView == null) break block3;
            try {
                StateListDrawable stateListDrawable = new StateListDrawable();
                ColorDrawable colorDrawable = new ColorDrawable(0x33FFFFFF);
                stateListDrawable.addState(new int[]{16842919}, (Drawable)colorDrawable);
                colorDrawable = new ColorDrawable(0x22FFFFFF);
                stateListDrawable.addState(new int[]{16842908}, (Drawable)colorDrawable);
                listView.setSelector((Drawable)stateListDrawable);
                stateListDrawable = new ColorDrawable(0x22FFFFFF);
                listView.setDivider((Drawable)stateListDrawable);
                listView.setDividerHeight(Math.max(1, (int)listView.getResources().getDisplayMetrics().density));
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        f.l(alertDialog, new DialogInterface.OnShowListener(alertDialog){
            final AlertDialog a;
            {
                this.a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                z0.j(this.a);
            }
        });
    }

    private static void j(AlertDialog alertDialog) {
        int n3 = z0.d(alertDialog);
        for (int i3 = 0; i3 < 3; ++i3) {
            Button button = alertDialog.getButton((new int[]{-1, -2, -3})[i3]);
            if (button == null) continue;
            try {
                button.setTextColor(n3);
                button.setTypeface(button.getTypeface(), 1);
            }
            catch (Throwable throwable) {
                e1.a(throwable);
                break;
            }
            continue;
        }
    }
}

