/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.e;
import android.content.Context;
import android.content.DialogInterface;
import android.ext.Tools;
import android.ext.f;
import android.fix.Button;
import android.util.AttributeSet;
import android.view.View;

public class SystemSpinner
extends Button
implements View.OnClickListener,
DialogInterface.OnClickListener {
    protected int a;
    protected DialogInterface.OnClickListener b;
    protected e c = null;

    public SystemSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void a() {
        e e4 = this.c;
        int n3 = e4.size();
        CharSequence[] charSequenceArray = new CharSequence[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            charSequenceArray[i3] = (CharSequence)e4.valueAt(n3 - 1 - i3);
        }
        f.o(f.c(this.getContext()).setSingleChoiceItems(charSequenceArray, n3 - 1 - e4.indexOfKey(this.a), (DialogInterface.OnClickListener)this));
    }

    public int getSelected() {
        return this.a;
    }

    public void onClick(DialogInterface dialogInterface, int n3) {
        e e4 = this.c;
        this.setSelected(e4.keyAt(e4.size() - 1 - n3));
        Tools.D(dialogInterface);
    }

    public void onClick(View object) {
        object = this.c;
        if (object == null) {
            return;
        }
        if (object.size() == 0) {
            return;
        }
        this.a();
    }

    public void setData(e e4) {
        if (e4 == null) {
            return;
        }
        this.c = e4;
        int n3 = e4.size();
        if (n3 == 0) {
            return;
        }
        this.a = e4.keyAt(n3 - 1);
        this.setOnClickListener(this);
    }

    public void setOnItemSelectedListener(DialogInterface.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public void setSelected(int n3) {
        CharSequence charSequence;
        e e4 = this.c;
        if (e4 == null) {
            return;
        }
        CharSequence charSequence2 = charSequence = (CharSequence)e4.get(n3);
        int n4 = n3;
        if (charSequence == null) {
            if (e4.size() == 1) {
                charSequence2 = (CharSequence)e4.valueAt(0);
                n4 = e4.keyAt(0);
            } else {
                charSequence2 = "???";
                n4 = n3;
            }
        }
        this.setText(charSequence2);
        this.a = n4;
        charSequence2 = this.b;
        if (charSequence2 != null) {
            charSequence2.onClick(null, n4);
        }
    }
}

