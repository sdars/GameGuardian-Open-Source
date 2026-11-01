/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.e;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.Script;
import android.ext.Searcher;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.e1;
import android.ext.f;
import android.ext.m1;
import android.ext.n;
import android.ext.p1;
import android.ext.u2;
import android.view.View;
import android.widget.EditText;
import java.lang.ref.WeakReference;

public abstract class j2
extends p1
implements DialogInterface.OnClickListener,
DialogInterface.OnDismissListener,
DialogInterface.OnShowListener {
    protected String f = "";
    protected int g = 0x20000000;
    protected String h = "FFFFFFFFFFFFFFFF";
    protected int i = -1;
    protected Searcher j;
    protected WeakReference k = new WeakReference<Object>(null);

    public j2(int n3, int n4) {
        super(n3, n4);
    }

    public static String h(String object) {
        CharSequence charSequence = object;
        if (object != null) {
            String string2 = ((String)object).trim();
            charSequence = object;
            if (string2.length() > 0) {
                charSequence = object;
                if (((String)object).charAt(0) == '=') {
                    charSequence = string2.substring(1);
                    object = charSequence;
                    if (((String)charSequence).indexOf("return") < 0) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("return ");
                        ((StringBuilder)object).append((String)charSequence);
                        object = ((StringBuilder)object).toString();
                    }
                    try {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("oneLiner IN: '");
                        ((StringBuilder)charSequence).append((String)object);
                        ((StringBuilder)charSequence).append("'");
                        e1.d(((StringBuilder)charSequence).toString());
                        charSequence = Script.F3((String)object);
                        object = new StringBuilder();
                        ((StringBuilder)object).append("oneLiner OUT: '");
                        ((StringBuilder)object).append((String)charSequence);
                        ((StringBuilder)object).append("'");
                        e1.d(((StringBuilder)object).toString());
                    }
                    catch (Throwable throwable) {
                        e1.g("oneLiner ERR:", throwable);
                        object = new NumberFormatException(throwable.getMessage());
                        ((Throwable)object).initCause(throwable);
                        throw object;
                    }
                }
            }
        }
        return charSequence;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void i(NumberFormatException numberFormatException, EditText editText) {
        e1.s("Error", numberFormatException);
        if (editText != null && numberFormatException instanceof n.b) {
            n.b b4 = (n.b)numberFormatException;
            numberFormatException = android.ext.f.b().setCustomTitle(Tools.g0(2131296417)).setMessage((CharSequence)numberFormatException.getMessage()).setPositiveButton((CharSequence)b2.f(2131297115), new DialogInterface.OnClickListener(editText, b4){
                final EditText a;
                final n.b b;
                {
                    this.a = editText;
                    this.b = b4;
                }

                public void onClick(DialogInterface dialogInterface, int n3) {
                    String string2;
                    dialogInterface = this.a.getText();
                    String string3 = dialogInterface.toString();
                    if (!string3.contains(string2 = this.b.b)) {
                        return;
                    }
                    n3 = string3.indexOf(string2);
                    dialogInterface.replace(n3, string2.length() + n3, (CharSequence)this.b.a);
                }
            }).setNegativeButton((CharSequence)b2.f(2131296805), null);
        } else {
            numberFormatException = android.ext.f.b().setCustomTitle(Tools.g0(2131296417)).setMessage((CharSequence)numberFormatException.getMessage()).setPositiveButton((CharSequence)b2.f(2131296836), null);
        }
        android.ext.f.o((AlertDialog.Builder)numberFormatException);
    }

    public abstract void j(DialogInterface var1, int var2);

    public void onClick(DialogInterface dialogInterface, int n3) {
        block6: {
            block5: {
                NumberFormatException numberFormatException2;
                block4: {
                    block3: {
                        if (n3 == -1 || n3 == -3) break block5;
                        if (n3 == -2) break block6;
                        try {
                            this.j.E(n3);
                            this.j(dialogInterface, n3);
                            Tools.U0(this.k);
                            break block3;
                        }
                        catch (Throwable throwable) {
                        }
                        catch (NumberFormatException numberFormatException2) {
                            break block4;
                        }
                        e1.l("Exception on start search", throwable);
                    }
                    Tools.E(this.k);
                    break block6;
                }
                j2.i(numberFormatException2, this.j.g());
                return;
            }
            this.i = n3;
            this.onClick(null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onClick(View object) {
        if (object != null && object.getTag() instanceof Integer) {
            this.i = (Integer)object.getTag();
        }
        boolean bl = this instanceof m1;
        int n4 = 0;
        int n3 = 0;
        if (object != null && object.getTag() instanceof p1) {
            if (!MainService.instance.i.d0()) {
                return;
            }
            if (this.j == null) {
                n4 = n3;
                if (bl) {
                    n4 = 3;
                }
                this.j = new Searcher(n4, 127);
            }
            object = this.j;
            n4 = bl ? 2131296768 : 2131297082;
            ((Searcher)object).y(b2.f(n4));
            this.j.D(this.g);
            this.j.z(this.f);
            if (bl) {
                this.j.x(this.h);
                this.j.k().setTag((Object)new InternalKeyboard.d(1));
            }
            this.j.G(127);
            object = android.ext.f.b().setView(this.j.l()).setNegativeButton((CharSequence)b2.f(2131296311), null);
            if (MainService.instance.p0 == 0L) {
                object.setPositiveButton((CharSequence)b2.f(2131296802), (DialogInterface.OnClickListener)this);
            } else {
                object.setPositiveButton((CharSequence)b2.f(2131296889), (DialogInterface.OnClickListener)this).setNeutralButton((CharSequence)b2.f(2131296802), (DialogInterface.OnClickListener)this);
            }
            this.i = -1;
            object = object.create();
            android.ext.f.k((AlertDialog)object, this);
            android.ext.f.l((AlertDialog)object, this);
            this.k = new WeakReference<Object>(object);
            android.ext.f.n((AlertDialog)object, this.j.g());
            return;
        }
        n3 = this.j.j();
        if (n3 != 0) {
            this.onClick(null, n3);
            return;
        }
        object = "0";
        if (bl) {
            new u2(c.r(127, true), "0", b2.f(2131297042), this);
            return;
        }
        String string2 = this.j.f();
        try {
            string2 = j2.h(string2);
        }
        catch (NumberFormatException numberFormatException) {
            j2.i(numberFormatException, this.j.g());
            return;
        }
        if (string2.indexOf(59) != -1 || string2.indexOf(126) != -1 || string2.indexOf(88) != -1 || string2.indexOf(120) != -1) {
            n4 = 1;
        }
        e e4 = c.r(127, true);
        if (n4 == 0) {
            object = string2;
        }
        new u2(e4, (String)object, b2.f(2131297042), this);
    }

    public void onDismiss(DialogInterface object) {
        object = this.j;
        if (object != null) {
            ((Searcher)object).m();
        }
    }

    public void onShow(DialogInterface object) {
        Tools.s1((DialogInterface)object, -1, -1, this);
        Tools.s1((DialogInterface)object, -3, -3, this);
        object = this.j;
        if (object != null) {
            ((Searcher)object).r();
        }
    }
}

