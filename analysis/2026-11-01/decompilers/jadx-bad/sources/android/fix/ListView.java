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

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ListView extends android.widget.ListView {
    public ListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        boolean z = false;
        try {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        } catch (IndexOutOfBoundsException | NullPointerException | OutOfMemoryError e2) {
            e1.a(e2);
            zDispatchTouchEvent = false;
            z = true;
        }
        if (z) {
            MainService.I0();
        }
        return zDispatchTouchEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public void draw(Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    protected void layoutChildren() {
        try {
            super.layoutChildren();
        } catch (IllegalStateException e2) {
            e1.s("Layout failed 1", e2);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof BaseAdapter) {
                ((BaseAdapter) adapter).notifyDataSetChanged();
                try {
                    super.layoutChildren();
                } catch (IllegalStateException e3) {
                    e1.s("Layout failed 2", e3);
                }
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (StackOverflowError e2) {
            e1.a(e2);
        }
        View emptyView = getEmptyView();
        if (emptyView != null) {
            setEmptyView(emptyView);
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (NoSuchMethodError | NullPointerException e2) {
            e1.a(e2);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            e1.a(th);
            n0.h(Thread.currentThread(), th, false);
        }
    }

    @Override // android.widget.AbsListView
    public void setFastScrollEnabled(boolean z) {
        try {
            super.setFastScrollEnabled(z);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
