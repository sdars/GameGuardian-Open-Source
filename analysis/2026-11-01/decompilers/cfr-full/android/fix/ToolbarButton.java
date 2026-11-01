/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.Context;
import android.ext.Config;
import android.ext.Tools;
import android.ext.e1;
import android.fix.ImageButtonView;
import android.util.AttributeSet;

public class ToolbarButton
extends ImageButtonView {
    private int a = 0;
    private boolean b = false;

    public ToolbarButton(Context context) {
        super(context);
    }

    public ToolbarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setIcon(int n3) {
        this.a = n3;
        this.setMinimumWidth((int)Tools.G(45.0f));
        this.setMinimumHeight(Tools.H());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setIcon(boolean var1_1) {
        if (this.b == var1_1) return;
        this.b = var1_1;
        if (!var1_1) ** GOTO lbl-1000
        try {
            this.setImageResource(this.a);
            Config.o(this, (int)Tools.G(45.0f), Tools.H());
            return;
        }
        catch (Throwable var2_2) {
            e1.a(var2_2);
            return;
        }
lbl-1000:
        // 1 sources

        {
            this.setImageDrawable(null);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ");
        stringBuilder.append(this.a);
        stringBuilder.append("; ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

