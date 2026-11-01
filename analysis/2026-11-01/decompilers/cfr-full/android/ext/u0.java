/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.ConfigListAdapter;
import android.ext.EditText;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.RegionList;
import android.ext.Tools;
import android.ext.b2;
import android.ext.f;
import android.ext.j2;
import android.ext.p1;
import android.ext.y0;
import android.view.View;
import android.widget.TextView;

public class u0
extends p1 {
    public u0() {
        super(2131296514, 2130968618);
    }

    @Override
    public void onClick(View view) {
        new b().onClick(view);
    }

    private static class b
    implements View.OnClickListener,
    DialogInterface.OnClickListener,
    DialogInterface.OnDismissListener,
    DialogInterface.OnShowListener {
        private static String c = "";
        private AlertDialog a;
        private EditText b;

        private b() {
        }

        public void onClick(DialogInterface dialogInterface, int n3) {
            if (n3 == -1) {
                this.onClick((View)((AlertDialog)dialogInterface).getButton(n3));
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onClick(View object) {
            if (object != null && !(object.getTag() instanceof p1)) {
                NumberFormatException numberFormatException2;
                block6: {
                    block5: {
                        if (object.getId() == 2131034286) {
                            Tools.D((DialogInterface)this.a);
                            MainService.instance.O.d();
                            return;
                        }
                        if (object.getId() == 2131034116) {
                            object = f.b();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(b2.f(2131296418));
                            stringBuilder.append(":\nBAFE890\nBAFE890+3F0\nBAFE890-A40\nBAFE890+FE-CD7+44-3E\n\nlibc.so\nlibc.so+E0\nlibc.so-32C");
                            f.o(object.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton((CharSequence)b2.f(2131296519), ConfigListAdapter.h()).setNegativeButton((CharSequence)b2.f(2131296311), null));
                            return;
                        }
                        try {
                            object = this.b;
                            if (object == null) break block5;
                            object = j2.h(object.getText().toString().trim());
                            y0.b((String)object, 1);
                            MainService.instance.L(null, (String)object, Tools.N1(2131296497));
                        }
                        catch (NumberFormatException numberFormatException2) {
                            break block6;
                        }
                    }
                    Tools.D((DialogInterface)this.a);
                    return;
                }
                j2.i(numberFormatException2, this.b);
                return;
            }
            object = d.f(2131099681, null);
            Object object2 = (TextView)object.findViewById(2131034116);
            Tools.r1((View)object2);
            object2.setOnClickListener((View.OnClickListener)this);
            object2 = (EditText)object.findViewById(2131034316);
            this.b = object2;
            View.OnClickListener onClickListener = (RegionList)object.findViewById(2131034377);
            onClickListener.setTag(object2);
            onClickListener = new View.OnClickListener(this, (RegionList)onClickListener){
                final RegionList a;
                final b b;
                {
                    this.b = b4;
                    this.a = regionList;
                }

                public void onClick(View object) {
                    int n3 = object.getId();
                    n3 = n3 != 2131034144 ? (n3 != 2131034363 ? (n3 != 2131034456 ? 8 : 16384) : 262144) : 16;
                    object = this.a;
                    ((RegionList)((Object)object)).j((View)object, n3);
                }
            };
            object.findViewById(2131034145).setOnClickListener(onClickListener);
            object.findViewById(2131034144).setOnClickListener(onClickListener);
            object.findViewById(2131034363).setOnClickListener(onClickListener);
            object.findViewById(2131034456).setOnClickListener(onClickListener);
            object.findViewById(2131034286).setOnClickListener((View.OnClickListener)this);
            object2.setText((CharSequence)c);
            ((EditText)object2).setDataType(1);
            object = f.b().setView(InternalKeyboard.d(object)).setPositiveButton((CharSequence)b2.f(2131296514), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
            this.a = object;
            f.k((AlertDialog)object, this);
            f.l((AlertDialog)object, this);
            f.n((AlertDialog)object, (android.widget.EditText)object2);
        }

        public void onDismiss(DialogInterface object) {
            object = this.b;
            if (object != null) {
                c = object.getText().toString().trim();
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.t1(dialogInterface, -1, null, this, this.b);
        }
    }
}

