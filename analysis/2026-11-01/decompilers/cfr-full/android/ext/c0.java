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
import android.ext.MemoryRange;
import android.ext.Script;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.c2;
import android.ext.e1;
import android.ext.f;
import android.ext.i0;
import android.ext.j2;
import android.ext.p1;
import android.ext.t1;
import android.ext.y0;
import android.view.View;
import java.io.Writer;

public class c0
extends p1 {
    public c0() {
        super(2131296345, 2130968599);
    }

    @Override
    public void onClick(View view) {
        new b().onClick(view);
    }

    private static class b
    implements View.OnClickListener,
    DialogInterface.OnClickListener,
    DialogInterface.OnShowListener {
        private EditText a;
        private AlertDialog b;
        private EditText c;
        private EditText d;
        private long e = 0L;
        private long f = 0L;
        private int g = 0;

        private b() {
        }

        private long a(int n3) {
            long l3 = MemoryRange.b(n3, this.c, "0", this.d, "0");
            if (n3 == 0) {
                this.e = l3;
            } else {
                this.f = l3;
            }
            return l3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onClick(DialogInterface object, int n3) {
            NumberFormatException numberFormatException3;
            EditText editText;
            block10: {
                NumberFormatException numberFormatException22;
                block9: {
                    block8: {
                        block7: {
                            editText = this.a;
                            if (editText == null) {
                                return;
                            }
                            try {
                                this.a(0);
                                this.a(1);
                                String string2 = j2.h(editText.getText().toString().trim());
                                object = string2;
                                if (string2.length() != 0) break block7;
                                object = "0";
                            }
                            catch (NumberFormatException numberFormatException3) {}
                        }
                        try {
                            this.g = n3 = (int)t1.x((String)object).a;
                            if (n3 == 0) break block8;
                            y0.b((String)object, 1);
                        }
                        catch (NumberFormatException numberFormatException22) {
                            break block9;
                        }
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Copy: ");
                    ((StringBuilder)object).append(this.g);
                    ((StringBuilder)object).append("; ");
                    ((StringBuilder)object).append(Long.toHexString(this.e));
                    ((StringBuilder)object).append('-');
                    ((StringBuilder)object).append(Long.toHexString(this.f));
                    e1.d(((StringBuilder)object).toString());
                    Tools.D((DialogInterface)this.b);
                    MainService.instance.i.q(this.e, this.f, this.g);
                    object = MainService.instance.f;
                    if (object != null) {
                        ((c2)object).write("gg.copyMemory(");
                        Script.Consts.b((Writer)object, this.e);
                        ((c2)object).write(", ");
                        Script.Consts.b((Writer)object, this.f);
                        ((c2)object).write(", ");
                        ((c2)object).write(Integer.toString(this.g));
                        ((c2)object).write(")\n");
                    }
                    return;
                    break block10;
                }
                editText.requestFocus();
                throw numberFormatException22;
            }
            j2.i(numberFormatException3, editText);
        }

        public void onClick(View object) {
            if (object != null && !(object.getTag() instanceof p1)) {
                this.onClick(null, -1);
            } else {
                EditText editText;
                EditText editText2;
                View view = a.d.f(2131099659, null);
                object = (EditText)view.findViewById(2131034217);
                this.a = object;
                view.findViewById(2131034135).setTag(object);
                object.setText((CharSequence)i0.c(this.g, 4));
                ((EditText)object).setDataType(1);
                this.c = editText2 = (EditText)view.findViewById(2131034320);
                view.findViewById(2131034377).setTag((Object)editText2);
                this.d = editText = (EditText)view.findViewById(2131034318);
                view.findViewById(2131034376).setTag((Object)editText);
                editText2.setText(android.ext.c.G(this.e, 4));
                editText2.setDataType(1);
                editText.setText(android.ext.c.G(this.f, 4));
                editText.setDataType(1);
                editText = android.ext.f.b().setCustomTitle(Tools.g0(2131296345)).setView(InternalKeyboard.d(view)).setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
                this.b = editText;
                android.ext.f.l((AlertDialog)editText, this);
                android.ext.f.n((AlertDialog)editText, (android.widget.EditText)object);
            }
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this);
        }
    }
}

