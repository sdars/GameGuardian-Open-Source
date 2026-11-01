/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.Context;
import android.ext.e1;
import android.ext.n0;
import android.util.AttributeSet;

public class TabWidget
extends android.widget.TabWidget {
    public TabWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void focusCurrentTab(int n3) {
        try {
            super.focusCurrentTab(n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
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

    public boolean performClick() {
        try {
            boolean bl = super.performClick();
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
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

