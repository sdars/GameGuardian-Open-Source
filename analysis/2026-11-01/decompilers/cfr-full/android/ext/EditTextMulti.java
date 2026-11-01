/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.Context;
import android.ext.EditText;
import android.util.AttributeSet;

public class EditTextMulti
extends EditText {
    public EditTextMulti(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setInputType(this.getInputType() | 0x40000);
        this.setHorizontallyScrolling(false);
        this.setMaxLines(Integer.MAX_VALUE);
    }

    public void setHorizontallyScrolling(boolean bl) {
        super.setHorizontallyScrolling(false);
    }

    public void setMaxLines(int n3) {
        super.setMaxLines(Integer.MAX_VALUE);
    }
}

