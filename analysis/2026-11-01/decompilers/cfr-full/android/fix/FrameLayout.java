/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.Context;
import android.ext.e1;
import android.ext.n0;
import android.util.AttributeSet;

public class FrameLayout
extends android.widget.FrameLayout {
    public FrameLayout(Context context) {
        super(context);
    }

    public FrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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

