/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.Context;
import android.ext.MainService;
import android.ext.e1;
import android.ext.n0;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

public class ListView
extends android.widget.ListView {
    public ListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean bl;
        boolean bl2;
        block5: {
            void var1_5;
            bl2 = false;
            try {
                bl = super.dispatchTouchEvent(motionEvent);
                break block5;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            }
            catch (OutOfMemoryError outOfMemoryError) {
                // empty catch block
            }
            e1.a((Throwable)var1_5);
            bl = false;
            bl2 = true;
        }
        if (bl2) {
            MainService.I0();
        }
        return bl;
    }

    public void draw(Canvas canvas) {
        try {
            super.draw(canvas);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
        }
    }

    protected void layoutChildren() {
        block4: {
            try {
                super.layoutChildren();
            }
            catch (IllegalStateException illegalStateException) {
                e1.s("Layout failed 1", illegalStateException);
                ListAdapter listAdapter = this.getAdapter();
                if (!(listAdapter instanceof BaseAdapter)) break block4;
                ((BaseAdapter)listAdapter).notifyDataSetChanged();
                try {
                    super.layoutChildren();
                }
                catch (IllegalStateException illegalStateException2) {
                    e1.s("Layout failed 2", illegalStateException2);
                }
            }
        }
    }

    protected void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        }
        catch (StackOverflowError stackOverflowError) {
            e1.a(stackOverflowError);
        }
        View view = this.getEmptyView();
        if (view != null) {
            this.setEmptyView(view);
        }
    }

    /*
     * WARNING - void declaration
     */
    protected void onLayout(boolean bl, int n3, int n4, int n5, int n6) {
        block3: {
            void var6_8;
            try {
                super.onLayout(bl, n3, n4, n5, n6);
                break block3;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (NoSuchMethodError noSuchMethodError) {
                // empty catch block
            }
            e1.a((Throwable)var6_8);
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

    public void setFastScrollEnabled(boolean bl) {
        try {
            super.setFastScrollEnabled(bl);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
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

