/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.Context;
import android.ext.e1;
import android.ext.n0;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;

public class SeekBar
extends android.widget.SeekBar {
    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onDraw(Canvas canvas) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    try {
                        super.onDraw(canvas);
                    }
                    catch (RuntimeException runtimeException) {
                        e1.a(runtimeException);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
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

    protected void onVisibilityChanged(View view, int n3) {
        try {
            super.onVisibilityChanged(view, n3);
        }
        catch (RuntimeException runtimeException) {
            e1.a(runtimeException);
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

    public void setInterpolator(Context context, int n3) {
        try {
            super.setInterpolator(context, n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        try {
            super.setInterpolator(interpolator);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setProgress(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    try {
                        super.setProgress(n3);
                    }
                    catch (NullPointerException nullPointerException) {
                        e1.a(nullPointerException);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

