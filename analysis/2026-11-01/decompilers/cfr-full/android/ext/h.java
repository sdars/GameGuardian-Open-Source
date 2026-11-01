/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.EditText;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.Script;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c2;
import android.ext.e1;
import android.ext.f;
import android.ext.j2;
import android.ext.p1;
import android.ext.t1;
import android.ext.y0;
import android.view.View;
import android.widget.CheckBox;
import java.io.Writer;

public class h
extends p1 {
    public h() {
        super(2131296270, 2130968597);
    }

    public static void h(String string2) {
        new b().a(string2);
    }

    @Override
    public void onClick(View view) {
        new b().onClick(view);
    }

    private static class b
    implements DialogInterface.OnClickListener,
    DialogInterface.OnShowListener,
    View.OnClickListener {
        private CheckBox a = null;
        private CheckBox b = null;
        private CheckBox c = null;
        private EditText d = null;
        private AlertDialog e = null;

        private b() {
        }

        public void a(String string2) {
            EditText editText;
            View view = a.d.f(2131099648, null);
            this.d = editText = (EditText)view.findViewById(2131034320);
            view.findViewById(2131034377).setTag((Object)editText);
            if (string2 != null) {
                editText.setText(string2);
            }
            editText.setDataType(1);
            this.a = (CheckBox)view.findViewById(2131034374);
            this.b = (CheckBox)view.findViewById(2131034455);
            this.c = (CheckBox)view.findViewById(2131034247);
            string2 = f.b().setCustomTitle(Tools.g0(2131296270)).setView(InternalKeyboard.d(view)).setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
            this.e = string2;
            f.l((AlertDialog)string2, this);
            f.n((AlertDialog)string2, editText);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onClick(DialogInterface object, int n3) {
            NumberFormatException numberFormatException3;
            EditText editText;
            block14: {
                NumberFormatException numberFormatException22;
                block13: {
                    long l3;
                    int n4;
                    block12: {
                        Object object2;
                        block11: {
                            editText = this.d;
                            if (editText == null) {
                                return;
                            }
                            try {
                                object2 = j2.h(editText.getText().toString().trim());
                                boolean bl = ((String)object2).endsWith("h");
                                n4 = 0;
                                object = object2;
                                if (bl) {
                                    object = ((String)object2).substring(0, ((String)object2).length() - 1);
                                }
                                object2 = object;
                                if (((String)object).length() != 0) break block11;
                                object2 = "0";
                            }
                            catch (NumberFormatException numberFormatException3) {}
                        }
                        try {
                            l3 = t1.r((String)object2, 16);
                            if (l3 == 0L) break block12;
                            y0.b((String)object2, 1);
                        }
                        catch (NumberFormatException numberFormatException22) {
                            break block13;
                        }
                    }
                    if (this.a.isChecked()) {
                        n4 = 2;
                    }
                    n3 = n4;
                    if (this.b.isChecked()) {
                        n3 = n4 | 1;
                    }
                    n4 = n3;
                    if (this.c.isChecked()) {
                        n4 = n3 | 4;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Allocate: ");
                    ((StringBuilder)object).append(n4);
                    ((StringBuilder)object).append("; ");
                    ((StringBuilder)object).append(l3);
                    e1.d(((StringBuilder)object).toString());
                    Tools.D((DialogInterface)this.e);
                    MainService.instance.i.g(l3, n4);
                    object = MainService.instance.f;
                    if (object != null) {
                        ((c2)object).write("gg.allocatePage(");
                        Script.Consts.a((Writer)object, ((c2)object).c.g, n4);
                        ((c2)object).write(", ");
                        Script.Consts.b((Writer)object, l3);
                        ((c2)object).write(")\n");
                    }
                    return;
                    break block14;
                }
                editText.requestFocus();
                throw numberFormatException22;
            }
            j2.i(numberFormatException3, editText);
        }

        public void onClick(View view) {
            if (view != null && !(view.getTag() instanceof p1)) {
                this.onClick(null, -1);
            } else {
                this.a(null);
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.s1((DialogInterface)this.e, -1, null, this);
        }
    }
}

