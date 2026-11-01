package android.fix;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ScrollView extends android.widget.ScrollView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f1444d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1447c;

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            long r0 = (long) r0
            android.fix.ScrollView.f1444d = r0
            return
    }

    public ScrollView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f1445a = r1
            r1 = -1
            r0.f1446b = r1
            r1 = 1
            r0.f1447c = r1
            return
    }

    private void a() {
            r2 = this;
            r0 = -1
            r2.f1446b = r0
            r0 = 2
            r2.f1447c = r0
            r0 = 1
            r2.requestDisallowInterceptTouchEvent(r0)
            r2.b()
            return
    }

    private void b() {
            r8 = this;
            r0 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            r6 = 0
            r7 = 0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            r8.onTouchEvent(r0)
            r0.recycle()
            return
    }

    private void c() {
            r2 = this;
            r0 = -1
            r2.f1446b = r0
            return
    }

    private int d(float r4) {
            r3 = this;
            int r0 = r3.getHeight()
            int r1 = android.ext.Tools.H()
            int r1 = r1 / 2
            float r1 = (float) r1
            int r0 = r0 + (-1)
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r1
            float r0 = r0 - r2
            r2 = 0
            android.view.View r2 = r3.getChildAt(r2)
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r4 = r4 - r1
            float r4 = r4 / r0
            float r4 = r4 * r2
            r0 = 0
            float r4 = java.lang.Math.max(r4, r0)
            float r4 = java.lang.Math.min(r4, r2)
            int r4 = (int) r4
            return r4
    }

    private boolean e(float r3) {
            r2 = this;
            int r0 = r2.getWidth()
            int r1 = android.ext.Tools.H()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            return r3
    }

    private void f() {
            r4 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = android.fix.ScrollView.f1444d
            long r0 = r0 + r2
            r4.f1446b = r0
            return
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()     // Catch: java.lang.IllegalArgumentException -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            boolean r0 = r5.f1445a
            if (r0 == 0) goto L56
            int r0 = r6.getActionMasked()
            if (r0 == 0) goto L49
            r1 = 1
            if (r0 == r1) goto L1e
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 3
            if (r0 == r1) goto L1e
            goto L56
        L14:
            float r0 = r6.getX()
            boolean r0 = r5.e(r0)
            if (r0 != 0) goto L22
        L1e:
            r5.c()
            goto L56
        L22:
            long r0 = r5.f1446b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L56
            long r2 = android.os.SystemClock.uptimeMillis()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L56
            r5.a()
            int r0 = r5.getScrollX()
            float r1 = r6.getY()
            int r1 = r5.d(r1)
            r5.scrollTo(r0, r1)
            boolean r6 = r5.onTouchEvent(r6)
            return r6
        L49:
            float r0 = r6.getX()
            boolean r0 = r5.e(r0)
            if (r0 == 0) goto L56
            r5.f()
        L56:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
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

    @Override // android.widget.ScrollView, android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r1, android.graphics.Rect r2) {
            r0 = this;
            boolean r1 = super.onRequestFocusInDescendants(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r9) {
            r8 = this;
            boolean r0 = r8.f1445a
            r1 = 0
            if (r0 == 0) goto L68
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L5a
            r3 = 0
            r5 = 2
            if (r0 == r2) goto L38
            if (r0 == r5) goto L1b
            r2 = 3
            if (r0 == r2) goto L17
            goto L68
        L17:
            r8.c()
            goto L68
        L1b:
            long r6 = r8.f1446b
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L24
            r8.a()
        L24:
            int r0 = r8.f1447c
            if (r0 != r5) goto L68
            int r0 = r8.getScrollX()
            float r9 = r9.getY()
            int r9 = r8.d(r9)
            r8.scrollTo(r0, r9)
            return r2
        L38:
            long r6 = r8.f1446b
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L50
            r8.a()
            int r0 = r8.getScrollX()
            float r3 = r9.getY()
            int r3 = r8.d(r3)
            r8.scrollTo(r0, r3)
        L50:
            int r0 = r8.f1447c
            if (r0 != r5) goto L68
            r8.requestDisallowInterceptTouchEvent(r1)
            r8.f1447c = r2
            return r2
        L5a:
            float r0 = r9.getX()
            boolean r0 = r8.e(r0)
            if (r0 == 0) goto L68
            r8.a()
            return r2
        L68:
            boolean r9 = super.onTouchEvent(r9)     // Catch: java.lang.Throwable -> L6d
            return r9
        L6d:
            r9 = move-exception
            android.ext.e1.a(r9)
            return r1
    }

    @Override // android.view.View
    public void playSoundEffect(int r1) {
            r0 = this;
            super.playSoundEffect(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int r1) {
            r0 = this;
            super.sendAccessibilityEvent(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    public void setFastScrollEnabled(boolean r1) {
            r0 = this;
            r0.f1445a = r1
            int r1 = android.ext.Tools.H()
            int r1 = r1 / 2
            r0.setScrollBarSize(r1)
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
