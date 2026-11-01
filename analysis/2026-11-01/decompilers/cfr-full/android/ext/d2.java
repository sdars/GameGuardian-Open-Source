/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.EditTextPath;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c2;
import android.ext.f;
import android.ext.p1;
import android.ext.v1;
import android.ext.y0;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class d2
extends p1 {
    public d2() {
        super(2131296888, 2130968641);
    }

    @Override
    public void onClick(View view) {
        new b(this).onClick(view);
    }

    private class b
    implements DialogInterface.OnClickListener,
    DialogInterface.OnShowListener,
    DialogInterface.OnDismissListener,
    View.OnClickListener {
        private AlertDialog a;
        private EditText b;
        final d2 c;

        private b(d2 d22) {
            this.c = d22;
        }

        public void onClick(DialogInterface object, int n3) {
            c2 c22;
            object = this.b;
            if (object == null) {
                return;
            }
            if (!Tools.f1((String)(object = object.getText().toString().trim()))) {
                return;
            }
            if (MainService.instance.f != null) {
                f.o(f.b().setCustomTitle(Tools.g0(2131296417)).setMessage((CharSequence)b2.f(2131296275)).setPositiveButton((CharSequence)b2.f(2131296994), new DialogInterface.OnClickListener(this, n3){
                    final int a;
                    final b b;
                    {
                        this.b = b4;
                        this.a = n3;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        MainService.instance.O();
                        this.b.onClick(null, this.a);
                    }
                }).setNegativeButton((CharSequence)b2.f(2131296805), null));
                return;
            }
            try {
                c22 = new c2((String)object);
            }
            catch (Throwable throwable) {
                AlertDialog.Builder builder = f.b().setCustomTitle(Tools.g0(2131296417));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append("\n\n");
                stringBuilder.append(throwable.toString());
                f.o(builder.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton((CharSequence)b2.f(2131296836), null));
                return;
            }
            y0.b((String)object, 4);
            MainService.instance.f1(c22);
            Tools.D((DialogInterface)this.a);
        }

        public void onClick(View object) {
            if (object != null && !(object.getTag() instanceof p1)) {
                this.onClick(null, -1);
            } else {
                if (!MainService.instance.i.d0()) {
                    return;
                }
                View view = d.f(2131099669, null);
                ((TextView)view.findViewById(2131034328)).setText((CharSequence)b2.f(2131296888));
                object = (EditTextPath)view.findViewById(2131034251);
                this.b = object;
                object.setText((CharSequence)v1.a("record-path", "-record", ".lua"));
                ((EditTextPath)object).setDataType(4);
                ((EditTextPath)object).setPathType(2);
                view.findViewById(2131034354).setTag(object);
                view = f.b().setView(InternalKeyboard.e(view, false)).setPositiveButton((CharSequence)b2.f(2131296884), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
                f.l((AlertDialog)view, this);
                f.k((AlertDialog)view, this);
                this.a = view;
                f.n((AlertDialog)view, (EditText)object);
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            dialogInterface = this.b;
            if (dialogInterface != null) {
                v1.c(dialogInterface.getText().toString(), "record-path", "-record", ".lua");
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this);
        }
    }
}

