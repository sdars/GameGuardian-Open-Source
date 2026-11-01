/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.Context;
import android.ext.e1;
import android.ext.n0;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class ImageView
extends android.widget.ImageView {
    public ImageView(Context context) {
        super(context);
    }

    public ImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /*
     * Unable to fully structure code
     */
    protected void onDraw(Canvas var1_1) {
        try {
            super.onDraw(var1_1);
        }
        catch (RuntimeException var1_2) lbl-1000:
        // 2 sources

        {
            while (true) {
                e1.a((Throwable)var1_3);
                break;
            }
        }
        catch (NoSuchFieldError var1_4) {
            ** continue;
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

