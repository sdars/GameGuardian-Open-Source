package android.fix;

import android.content.Context;
import android.ext.e1;
import android.ext.n0;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ProgressBar extends android.widget.ProgressBar {
    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e2) {
            e1.a(e2);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            e1.a(th);
            n0.h(Thread.currentThread(), th, false);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (RuntimeException e2) {
            e1.a(e2);
        }
    }

    @Override // android.view.View
    public void playSoundEffect(int i) {
        try {
            super.playSoundEffect(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        try {
            super.sendAccessibilityEvent(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.widget.ProgressBar
    public void setInterpolator(Context context, int i) {
        try {
            super.setInterpolator(context, i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        try {
            super.setProgress(i);
        } catch (NullPointerException e2) {
            e1.a(e2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.widget.ProgressBar
    public void setInterpolator(Interpolator interpolator) {
        try {
            super.setInterpolator(interpolator);
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
