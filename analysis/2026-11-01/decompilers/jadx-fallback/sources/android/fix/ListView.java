package android.fix;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ListView extends android.widget.ListView {
    public ListView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.dispatchDraw(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            r0 = 0
            boolean r2 = super.dispatchTouchEvent(r2)     // Catch: java.lang.NullPointerException -> L6 java.lang.IndexOutOfBoundsException -> L8 java.lang.OutOfMemoryError -> La
            goto L11
        L6:
            r2 = move-exception
            goto Lb
        L8:
            r2 = move-exception
            goto Lb
        La:
            r2 = move-exception
        Lb:
            android.ext.e1.a(r2)
            r2 = 1
            r2 = 0
            r0 = 1
        L11:
            if (r0 == 0) goto L16
            android.ext.MainService.I0()
        L16:
            return r2
    }

    @Override // android.widget.AbsListView, android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            super.draw(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    protected void layoutChildren() {
            r2 = this;
            super.layoutChildren()     // Catch: java.lang.IllegalStateException -> L4
            goto L21
        L4:
            r0 = move-exception
            java.lang.String r1 = "Layout failed 1"
            android.ext.e1.s(r1, r0)
            android.widget.ListAdapter r0 = r2.getAdapter()
            boolean r1 = r0 instanceof android.widget.BaseAdapter
            if (r1 == 0) goto L21
            android.widget.BaseAdapter r0 = (android.widget.BaseAdapter) r0
            r0.notifyDataSetChanged()
            super.layoutChildren()     // Catch: java.lang.IllegalStateException -> L1b
            goto L21
        L1b:
            r0 = move-exception
            java.lang.String r1 = "Layout failed 2"
            android.ext.e1.s(r1, r0)
        L21:
            return
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()     // Catch: java.lang.StackOverflowError -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            android.view.View r0 = r1.getEmptyView()
            if (r0 == 0) goto L11
            r1.setEmptyView(r0)
        L11:
            return
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)     // Catch: java.lang.NullPointerException -> L4 java.lang.NoSuchMethodError -> L6
            goto La
        L4:
            r1 = move-exception
            goto L7
        L6:
            r1 = move-exception
        L7:
            android.ext.e1.a(r1)
        La:
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L4
            goto L10
        L4:
            r2 = move-exception
            android.ext.e1.a(r2)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r0 = 0
            android.ext.n0.h(r3, r2, r0)
        L10:
            return
    }

    @Override // android.widget.AbsListView
    public void setFastScrollEnabled(boolean r1) {
            r0 = this;
            super.setFastScrollEnabled(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.view.View
    public void setOverScrollMode(int r1) {
            r0 = this;
            super.setOverScrollMode(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }
}
