/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.EditText;
import android.ext.EditTextPath;
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
import android.ext.g2;
import android.ext.j2;
import android.ext.p1;
import android.ext.v2;
import android.ext.y0;
import android.ext.z1;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import java.io.Writer;

public class j0
extends p1 {
    public j0() {
        super(2131296392, 2130968613);
    }

    @Override
    public void onClick(View view) {
        new b().onClick(view);
    }

    private static class b
    implements View.OnClickListener,
    DialogInterface.OnClickListener,
    DialogInterface.OnShowListener,
    DialogInterface.OnDismissListener {
        private android.widget.EditText a;
        private AlertDialog b;
        private EditText c;
        private EditText d;
        private CheckBox e;
        private long f = 0L;
        private long g = -1L;

        private b() {
        }

        private String a() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Tools.K0());
            stringBuilder.append("/dump");
            return stringBuilder.toString();
        }

        private long b(int n3) {
            long l3 = MemoryRange.b(n3, this.c, "0", this.d, "-1");
            if (n3 == 0) {
                this.f = l3;
            } else {
                this.g = l3;
            }
            return l3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onClick(DialogInterface object, int n3) {
            NumberFormatException numberFormatException2;
            android.widget.EditText editText;
            block6: {
                String string2;
                editText = this.a;
                if (editText == null) {
                    return;
                }
                try {
                    this.b(0);
                    this.b(1);
                    string2 = Tools.Q1(editText.getText().toString().trim());
                    if (!Tools.f1(string2)) {
                        return;
                    }
                    y0.b(string2, 4);
                    n3 = this.e.isChecked() ? 1 : 0;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Dump: ");
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append("; ");
                    ((StringBuilder)object).append(Long.toHexString(this.f));
                    ((StringBuilder)object).append('-');
                    ((StringBuilder)object).append(Long.toHexString(this.g));
                    ((StringBuilder)object).append("; ");
                    ((StringBuilder)object).append(Integer.toHexString(n3));
                    e1.d(((StringBuilder)object).toString());
                    Tools.D((DialogInterface)this.b);
                    object = MainService.instance.v0;
                    object = object == null ? "unknown" : ((z1.d)object).c;
                }
                catch (NumberFormatException numberFormatException2) {
                    break block6;
                }
                if (MainService.instance.a1()) {
                    MainService.instance.i.x(this.f, this.g, n3, string2, (String)object);
                    object = MainService.instance.f;
                    if (object != null) {
                        ((c2)object).write("gg.dumpMemory(");
                        Script.Consts.b((Writer)object, this.f);
                        ((c2)object).write(", ");
                        Script.Consts.b((Writer)object, this.g);
                        ((c2)object).write(", ");
                        Script.Consts.d((Writer)object, string2);
                        ((c2)object).write(", ");
                        Script.Consts.a((Writer)object, ((c2)object).c.i, n3);
                        ((c2)object).write(")\n");
                    }
                }
                return;
            }
            j2.i(numberFormatException2, editText);
        }

        public void onClick(View object) {
            if (object != null && !(object.getTag() instanceof p1)) {
                this.onClick(null, -1);
            } else {
                EditText editText2;
                View view = a.d.f(2131099650, null);
                object = (EditTextPath)view.findViewById(2131034353);
                this.a = object;
                object.setText((CharSequence)Tools.M0().getString("dump-path", this.a()));
                ((EditTextPath)object).setDataType(4);
                ((EditTextPath)object).setPathType(0);
                view.findViewById(2131034354).setTag(object);
                v2.a((Button)view.findViewById(2131034434), (android.widget.EditText)object);
                Object object2 = (EditText)view.findViewById(2131034320);
                this.c = object2;
                view.findViewById(2131034377).setTag(object2);
                this.d = editText2 = (EditText)view.findViewById(2131034324);
                view.findViewById(2131034378).setTag((Object)editText2);
                object2.setText((CharSequence)android.ext.c.G(this.f, 4));
                ((EditText)object2).setDataType(1);
                InternalKeyboard.o((View)object2, 1);
                editText2.setText(android.ext.c.G(this.g, 4));
                editText2.setDataType(1);
                this.e = (CheckBox)view.findViewById(2131034406);
                object2 = new InternalKeyboard.e(this, (EditTextPath)object){
                    final EditTextPath a;
                    final b b;
                    {
                        this.b = b4;
                        this.a = editTextPath;
                    }

                    @Override
                    protected boolean a(View view, boolean bl) {
                        bl = view == this.a;
                        return bl;
                    }
                };
                for (EditText editText2 : view.getFocusables(2)) {
                    if (!(editText2 instanceof EditText)) continue;
                    Tools.z1((View)editText2, (View.OnFocusChangeListener)object2);
                }
                view = android.ext.f.b().setView(InternalKeyboard.d(view)).setPositiveButton((CharSequence)b2.f(2131296917), (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
                this.b = view;
                android.ext.f.l((AlertDialog)view, this);
                android.ext.f.k((AlertDialog)view, this);
                android.ext.f.n((AlertDialog)view, (android.widget.EditText)object);
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            dialogInterface = this.a;
            if (dialogInterface == null) {
                return;
            }
            new g2().k("dump-path", dialogInterface.getText().toString().trim(), this.a()).commit();
        }

        public void onShow(DialogInterface dialogInterface) {
            Tools.s1(dialogInterface, -1, null, this);
        }
    }
}

