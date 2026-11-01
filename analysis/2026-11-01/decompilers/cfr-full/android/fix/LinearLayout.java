/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import a.b;
import android.content.Context;
import android.content.res.Configuration;
import android.ext.e1;
import android.ext.n0;
import android.util.AttributeSet;

public class LinearLayout
extends android.widget.LinearLayout {
    public LinearLayout(Context context) {
        super(context);
    }

    public LinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onConfigurationChanged(Configuration configuration) {
        String string2 = configuration == null ? null : configuration.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LinearLayout onConfigurationChanged: ");
        stringBuilder.append(string2);
        e1.d(stringBuilder.toString());
        super.onConfigurationChanged(b.f(configuration));
    }

    protected void onMeasure(int n3, int n4) {
        try {
            super.onMeasure(n3, n4);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            n0.h(Thread.currentThread(), throwable, false);
        }
    }

    public void playSoundEffect(int n3) {
        try {
            super.playSoundEffect(n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void sendAccessibilityEvent(int n3) {
        try {
            super.sendAccessibilityEvent(n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }
}

