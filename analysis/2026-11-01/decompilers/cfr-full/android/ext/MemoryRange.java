/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.content.Context;
import android.ext.Config;
import android.ext.EditText;
import android.ext.InternalKeyboard;
import android.ext.b2;
import android.ext.c;
import android.ext.j2;
import android.ext.t1;
import android.ext.y0;
import android.fix.LinearLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import java.util.Locale;

public class MemoryRange
extends LinearLayout
implements View.OnClickListener {
    private Runnable a = null;
    private int b = 0;
    private Button c = null;
    private View d;
    private EditText e;
    private EditText f;
    private View g;
    private EditText h;
    private CheckBox i;
    private CheckBox j;
    private EditText k;

    public MemoryRange(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long b(int n3, EditText object, String string2, EditText object2, String string3) {
        NumberFormatException numberFormatException2;
        EditText editText;
        block8: {
            long l3;
            block7: {
                boolean bl;
                editText = object2;
                if (n3 == 0) {
                    editText = object;
                }
                String string4 = j2.h(editText.getText().toString().trim());
                object2 = string4;
                if (string4.length() == 0) {
                    if (n3 != 0) {
                        string2 = string3;
                    }
                    object2 = string2;
                }
                if (bl = (string2 = j2.h(object.getText().toString().trim())).contains("?")) {
                    object = n3 == 0 ? "0" : "F";
                    object2 = object = string2.replace("?", (CharSequence)object);
                    if (n3 != 0) {
                        editText.setText((CharSequence)object);
                        object2 = object;
                    }
                }
                try {
                    l3 = t1.r((String)object2, 16);
                    if (n3 != 0 || !bl) break block7;
                    y0.b(string2, 1);
                }
                catch (NumberFormatException numberFormatException2) {
                    break block8;
                }
            }
            y0.b((String)object2, 1);
            return l3;
        }
        editText.requestFocus();
        throw numberFormatException2;
    }

    private void d() {
        int n3 = this.b;
        Button button = this.c;
        int n4 = n3 == 1 ? 2131296839 : (n3 == 2 ? 2131296790 : 2131296268);
        button.setText((CharSequence)b2.f(n4));
        button = this.d;
        int n5 = 8;
        n4 = n3 == 1 ? 0 : 8;
        button.setVisibility(n4);
        button = this.g;
        n4 = n5;
        if (n3 == 2) {
            n4 = 0;
        }
        button.setVisibility(n4);
    }

    public long a(int n3) {
        int n4 = this.b;
        if (n4 == 1) {
            long l3 = MemoryRange.b(n3, this.e, "0", this.f, "-1");
            if (n3 == 0) {
                Config.d = l3;
            } else {
                Config.e = l3;
            }
            Config.k();
            return l3;
        }
        if (n4 == 2) {
            long l4;
            long l5;
            String string2 = j2.h(this.h.getText().toString().trim());
            try {
                l5 = t1.r(string2, 16);
                y0.b(string2, 1);
                string2 = n3 == 0 ? this.i : this.j;
                l4 = l5;
            }
            catch (NumberFormatException numberFormatException) {
                this.h.requestFocus();
                throw numberFormatException;
            }
            if (string2.isChecked()) {
                long l6;
                string2 = j2.h(this.k.getText().toString().trim());
                try {
                    l6 = t1.r(string2, 16);
                    y0.b(string2, 1);
                    Config.f = l6;
                }
                catch (NumberFormatException numberFormatException) {
                    this.k.requestFocus();
                    throw numberFormatException;
                }
                Config.k();
                l4 = l6;
                if (n3 == 0) {
                    l4 = -l6;
                }
                l4 = l5 + l4;
            }
            return l4;
        }
        long l7 = n3 == 0 ? 0L : -1L;
        return l7;
    }

    public void c() {
        EditText editText;
        if (this.c != null) {
            return;
        }
        a.d.f(2131099661, (ViewGroup)this);
        this.c = (Button)this.findViewById(2131034364);
        this.d = this.findViewById(2131034365);
        this.e = editText = (EditText)this.findViewById(2131034320);
        editText.setDataType(1);
        this.findViewById(2131034377).setTag((Object)this.e);
        this.f = editText = (EditText)this.findViewById(2131034324);
        editText.setDataType(1);
        this.findViewById(2131034378).setTag((Object)this.f);
        this.e.setText(android.ext.c.G(Config.d, 4));
        this.f.setText(android.ext.c.G(Config.e, 4));
        this.g = this.findViewById(2131034340);
        this.h = editText = (EditText)this.findViewById(2131034123);
        editText.setDataType(1);
        this.i = (CheckBox)this.findViewById(2131034132);
        this.j = (CheckBox)this.findViewById(2131034124);
        this.k = editText = (EditText)this.findViewById(2131034227);
        editText.setDataType(1);
        this.k.setText(Long.toHexString(Config.f).toUpperCase(Locale.US));
        this.c.setOnClickListener((View.OnClickListener)this);
        InternalKeyboard.o((View)this.e, 1);
        this.d();
    }

    public int getType() {
        return this.b;
    }

    public void onClick(View view) {
        this.setType((this.b + 1) % 3);
    }

    public void setAddress(String string2) {
        this.h.setText(string2);
    }

    public void setType(int n3) {
        int n4 = this.b;
        this.b = n3;
        this.d();
        Runnable runnable = this.a;
        if (n4 != n3 && runnable != null) {
            runnable.run();
        }
    }

    public void setTypeChangeListener(Runnable runnable) {
        this.a = runnable;
    }
}

