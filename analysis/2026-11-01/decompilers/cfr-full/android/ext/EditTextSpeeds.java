/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.Context;
import android.ext.EditText;
import android.ext.EditTextMulti;
import android.util.AttributeSet;

public class EditTextSpeeds
extends EditTextMulti {
    private a c = null;

    public EditTextSpeeds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onSelectionChanged(int n3, int n4) {
        super.onSelectionChanged(n3, n4);
        a a4 = this.c;
        if (a4 != null) {
            a4.a(this, n3, n4);
        }
    }

    protected void onTextChanged(CharSequence charSequence, int n3, int n4, int n5) {
        super.onTextChanged(charSequence, n3, n4, n5);
        a a4 = this.c;
        if (a4 != null) {
            a4.b(this, charSequence, n3, n4, n5);
        }
    }

    public void setOnChangedListener(a a4) {
        this.c = a4;
    }

    public static interface a {
        public void a(EditText var1, int var2, int var3);

        public void b(EditText var1, CharSequence var2, int var3, int var4, int var5);
    }
}

