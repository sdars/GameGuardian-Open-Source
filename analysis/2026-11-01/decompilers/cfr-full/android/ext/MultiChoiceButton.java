/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.e;
import android.content.Context;
import android.content.DialogInterface;
import android.ext.SystemSpinner;
import android.ext.Tools;
import android.ext.b2;
import android.ext.f;
import android.ext.y;
import android.util.AttributeSet;

public class MultiChoiceButton
extends SystemSpinner
implements DialogInterface.OnMultiChoiceClickListener {
    protected int d;

    public MultiChoiceButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void a() {
        e e4 = this.c;
        int n3 = e4.size();
        CharSequence[] charSequenceArray = new CharSequence[n3];
        boolean[] blArray = new boolean[n3];
        this.d = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = n3 - 1 - i3;
            int n5 = e4.keyAt(n4);
            charSequenceArray[i3] = (CharSequence)e4.valueAt(n4);
            boolean bl = (this.a & n5) != 0;
            blArray[i3] = bl;
            this.onClick(null, i3, bl);
        }
        f.o(f.c(Tools.l0(this.getContext())).setMultiChoiceItems(charSequenceArray, blArray, (DialogInterface.OnMultiChoiceClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).setNeutralButton((CharSequence)b2.f(2131296898), (DialogInterface.OnClickListener)this).setPositiveButton((CharSequence)b2.f(2131296836), (DialogInterface.OnClickListener)this));
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int n3) {
        int n4 = this.c.size();
        int n5 = 0;
        int n6 = 0;
        if (n3 == -1) {
            n3 = 0;
            for (n5 = n6; n5 < n4; ++n5) {
                if ((this.d & 1 << n5) == 0) continue;
                n3 |= this.c.keyAt(n4 - 1 - n5);
            }
            n5 = n3;
        }
        this.setSelected(n5);
        Tools.D(dialogInterface);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onClick(DialogInterface dialogInterface, int n3, boolean bl) {
        n3 = bl ? 1 << n3 | this.d : ~(1 << n3) & this.d;
        this.d = n3;
    }

    @Override
    public void setSelected(int n3) {
        Object object;
        e e4 = this.c;
        if (e4 == null) {
            return;
        }
        int n4 = e4.size();
        y y3 = new y();
        for (int i3 = 0; i3 < n4; ++i3) {
            int n5 = n4 - 1 - i3;
            if ((e4.keyAt(n5) & n3) == 0) continue;
            if (y3.c() != 0) {
                y3.a(",");
            }
            object = (CharSequence)e4.valueAt(n5);
            y3.a(object.subSequence(0, object.toString().indexOf(58)));
        }
        this.setText(y3.d());
        this.a = n3;
        object = this.b;
        if (object != null) {
            object.onClick(null, n3);
        }
    }
}

