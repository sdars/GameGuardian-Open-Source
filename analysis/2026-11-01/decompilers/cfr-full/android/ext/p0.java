/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.DialogInterface;
import android.ext.e1;
import android.ext.f1;

public class p0
implements DialogInterface.OnClickListener {
    private boolean a;
    private final int b;

    public p0(int n3) {
        this(n3, false);
    }

    public p0(int n3, boolean bl) {
        this.b = n3;
        this.a = bl;
    }

    public void onClick(DialogInterface object, int n3) {
        object = new StringBuilder();
        ((StringBuilder)object).append("ExitListener called: ");
        ((StringBuilder)object).append(this.b);
        e1.d(((StringBuilder)object).toString());
        f1.c = this.a ? 1 : 0;
        f1.o();
    }
}

