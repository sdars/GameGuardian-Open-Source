/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.Context;
import android.ext.Tools;
import android.ext.e1;
import android.ext.n0;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class ScrollView
extends android.widget.ScrollView {
    private static final long d = ViewConfiguration.getTapTimeout();
    private boolean a = false;
    private long b = -1L;
    private int c = 1;

    public ScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a() {
        this.b = -1L;
        this.c = 2;
        this.requestDisallowInterceptTouchEvent(true);
        this.b();
    }

    private void b() {
        MotionEvent motionEvent = MotionEvent.obtain((long)0L, (long)0L, (int)3, (float)0.0f, (float)0.0f, (int)0);
        this.onTouchEvent(motionEvent);
        motionEvent.recycle();
    }

    private void c() {
        this.b = -1L;
    }

    private int d(float f4) {
        int n3 = this.getHeight();
        float f5 = Tools.H() / 2;
        float f6 = n3 - 1;
        float f7 = this.getChildAt(0).getHeight();
        return (int)Math.min(Math.max((f4 - f5) / (f6 - 2.0f * f5) * f7, 0.0f), f7);
    }

    private boolean e(float f4) {
        boolean bl = f4 >= (float)(this.getWidth() - Tools.H());
        return bl;
    }

    private void f() {
        this.b = SystemClock.uptimeMillis() + d;
    }

    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            e1.a(illegalArgumentException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.a) return super.onInterceptTouchEvent(motionEvent);
        int n3 = motionEvent.getActionMasked();
        if (n3 == 0) {
            if (!this.e(motionEvent.getX())) return super.onInterceptTouchEvent(motionEvent);
            this.f();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
            } else if (this.e(motionEvent.getX())) {
                long l3 = this.b;
                if (l3 < 0L) return super.onInterceptTouchEvent(motionEvent);
                if (l3 > SystemClock.uptimeMillis()) return super.onInterceptTouchEvent(motionEvent);
                this.a();
                this.scrollTo(this.getScrollX(), this.d(motionEvent.getY()));
                return this.onTouchEvent(motionEvent);
            }
        }
        this.c();
        return super.onInterceptTouchEvent(motionEvent);
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

    protected boolean onRequestFocusInDescendants(int n3, Rect rect) {
        try {
            boolean bl = super.onRequestFocusInDescendants(n3, rect);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            int n3 = motionEvent.getActionMasked();
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 == 3) {
                            this.c();
                        }
                    } else {
                        if (this.b >= 0L) {
                            this.a();
                        }
                        if (this.c == 2) {
                            this.scrollTo(this.getScrollX(), this.d(motionEvent.getY()));
                            return true;
                        }
                    }
                } else {
                    if (this.b >= 0L) {
                        this.a();
                        this.scrollTo(this.getScrollX(), this.d(motionEvent.getY()));
                    }
                    if (this.c == 2) {
                        this.requestDisallowInterceptTouchEvent(false);
                        this.c = 1;
                        return true;
                    }
                }
            } else if (this.e(motionEvent.getX())) {
                this.a();
                return true;
            }
        }
        try {
            boolean bl = super.onTouchEvent(motionEvent);
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

    public void setFastScrollEnabled(boolean bl) {
        this.a = bl;
        this.setScrollBarSize(Tools.H() / 2);
    }

    public void setOverScrollMode(int n3) {
        try {
            super.setOverScrollMode(n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }
}

