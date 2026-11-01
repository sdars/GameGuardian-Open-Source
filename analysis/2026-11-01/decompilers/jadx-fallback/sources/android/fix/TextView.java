package android.fix;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class TextView extends android.widget.TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.graphics.Rect f1448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.graphics.Paint.FontMetricsInt f1449b;

    public TextView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public TextView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static int a(int r2, int r3) {
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L13
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L11
            goto L17
        L11:
            r2 = r3
            goto L17
        L13:
            int r2 = java.lang.Math.min(r2, r3)
        L17:
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    public boolean getSecClipboardEnabled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.invalidateDrawable(r1)     // Catch: java.lang.NoSuchFieldError -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r0 = this;
            android.ext.Tools.P(r0)
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent r1) {
            r0 = this;
            boolean r1 = super.onDragEvent(r1)     // Catch: java.lang.ClassCastException -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)     // Catch: java.lang.NullPointerException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyShortcut(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super.onKeyShortcut(r1, r2)     // Catch: java.lang.NullPointerException -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r17, int r18) {
            r16 = this;
            r1 = r16
            super.onMeasure(r17, r18)     // Catch: java.lang.Throwable -> L7
            goto Lff
        L7:
            r0 = move-exception
            r2 = r0
            android.ext.e1.a(r2)
            int r0 = r16.getSuggestedMinimumWidth()     // Catch: java.lang.Throwable -> L24
            int r4 = r16.getSuggestedMinimumHeight()     // Catch: java.lang.Throwable -> L24
            int r5 = android.view.View.MeasureSpec.getMode(r17)     // Catch: java.lang.Throwable -> L24
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r6) goto L27
            int r5 = android.view.View.MeasureSpec.getSize(r17)     // Catch: java.lang.Throwable -> L24
            goto L2a
        L24:
            r0 = move-exception
            goto Led
        L27:
            r5 = 2147483647(0x7fffffff, float:NaN)
        L2a:
            if (r5 != 0) goto L2d
            goto L2e
        L2d:
            r7 = r5
        L2e:
            android.text.TextPaint r5 = r16.getPaint()     // Catch: java.lang.Throwable -> L24
            java.lang.CharSequence r6 = r16.getText()     // Catch: java.lang.Throwable -> L24
            r8 = 1065353216(0x3f800000, float:1.0)
            float r8 = android.ext.Tools.G(r8)     // Catch: java.lang.Throwable -> L24
            double r8 = (double) r8     // Catch: java.lang.Throwable -> L24
            r10 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            double r8 = r8 + r10
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L24
            int r9 = r6.length()     // Catch: java.lang.Throwable -> L24
            r12 = 0
            r13 = 0
            r14 = 0
        L4b:
            if (r12 > r9) goto L6c
            if (r12 == r9) goto L57
            char r15 = r6.charAt(r12)     // Catch: java.lang.Throwable -> L24
            r3 = 10
            if (r15 != r3) goto L69
        L57:
            int r13 = r13 + 1
            if (r12 <= r14) goto L67
            float r3 = r5.measureText(r6, r14, r12)     // Catch: java.lang.Throwable -> L24
            double r14 = (double) r3     // Catch: java.lang.Throwable -> L24
            double r14 = r14 + r10
            int r3 = (int) r14     // Catch: java.lang.Throwable -> L24
            if (r8 >= r3) goto L65
            r8 = r3
        L65:
            int r3 = r3 / r7
            int r13 = r13 + r3
        L67:
            int r14 = r12 + 1
        L69:
            int r12 = r12 + 1
            goto L4b
        L6c:
            android.graphics.Rect r3 = r1.f1448a     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L77
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L24
            r3.<init>()     // Catch: java.lang.Throwable -> L24
            r1.f1448a = r3     // Catch: java.lang.Throwable -> L24
        L77:
            android.graphics.Paint$FontMetricsInt r3 = r1.f1449b     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L82
            android.graphics.Paint$FontMetricsInt r3 = new android.graphics.Paint$FontMetricsInt     // Catch: java.lang.Throwable -> L24
            r3.<init>()     // Catch: java.lang.Throwable -> L24
            r1.f1449b = r3     // Catch: java.lang.Throwable -> L24
        L82:
            java.lang.String r3 = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"
            android.graphics.Rect r6 = r1.f1448a     // Catch: java.lang.Throwable -> L24
            r7 = 94
            r9 = 0
            r5.getTextBounds(r3, r9, r7, r6)     // Catch: java.lang.Throwable -> L24
            android.graphics.Rect r3 = r1.f1448a     // Catch: java.lang.Throwable -> L24
            int r6 = r3.bottom     // Catch: java.lang.Throwable -> L24
            int r3 = r3.top     // Catch: java.lang.Throwable -> L24
            int r6 = r6 - r3
            int r6 = r6 + 1
            android.graphics.Paint$FontMetricsInt r3 = r1.f1449b     // Catch: java.lang.Throwable -> L24
            int r3 = r5.getFontMetricsInt(r3)     // Catch: java.lang.Throwable -> L24
            int r3 = java.lang.Math.max(r6, r3)     // Catch: java.lang.Throwable -> L24
            r5 = 5
            if (r3 > r5) goto Lb1
            float r5 = r16.getTextSize()     // Catch: java.lang.Throwable -> L24
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L24
            r14 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r5 = r5 * r14
            double r5 = r5 + r10
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L24
            int r3 = java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> L24
        Lb1:
            int r5 = r16.getCompoundPaddingLeft()     // Catch: java.lang.Throwable -> L24
            int r8 = r8 + r5
            int r5 = r16.getCompoundPaddingRight()     // Catch: java.lang.Throwable -> L24
            int r8 = r8 + r5
            int r0 = java.lang.Math.max(r0, r8)     // Catch: java.lang.Throwable -> L24
            int r3 = r3 * r13
            int r5 = r16.getCompoundPaddingTop()     // Catch: java.lang.Throwable -> L24
            int r3 = r3 + r5
            int r5 = r16.getCompoundPaddingBottom()     // Catch: java.lang.Throwable -> L24
            int r3 = r3 + r5
            android.graphics.Paint$FontMetricsInt r5 = r1.f1449b     // Catch: java.lang.Throwable -> L24
            int r6 = r5.bottom     // Catch: java.lang.Throwable -> L24
            int r7 = r5.top     // Catch: java.lang.Throwable -> L24
            int r6 = r6 - r7
            int r7 = r5.descent     // Catch: java.lang.Throwable -> L24
            int r5 = r5.ascent     // Catch: java.lang.Throwable -> L24
            int r7 = r7 - r5
            int r6 = r6 - r7
            int r3 = r3 + r6
            int r3 = java.lang.Math.max(r4, r3)     // Catch: java.lang.Throwable -> L24
            r4 = r17
            int r0 = a(r0, r4)     // Catch: java.lang.Throwable -> L24
            r4 = r18
            int r3 = a(r3, r4)     // Catch: java.lang.Throwable -> L24
            r1.setMeasuredDimension(r0, r3)     // Catch: java.lang.Throwable -> L24
            goto Lff
        Led:
            android.ext.e1.a(r0)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r4 = 0
            android.ext.n0.h(r3, r2, r4)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            android.ext.n0.h(r2, r0, r4)
        Lff:
            return
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int r1) {
            r0 = this;
            boolean r1 = super.onTextContextMenuItem(r1)     // Catch: java.lang.NullPointerException -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onTouchEvent(r1)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)     // Catch: java.lang.NullPointerException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean performLongClick() {
            r1 = this;
            boolean r0 = super.performLongClick()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            r0 = 0
            return r0
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

    @Override // android.view.View
    public void refreshDrawableState() {
            r1 = this;
            super.refreshDrawableState()     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
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

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence r1, android.widget.TextView.BufferType r2) {
            r0 = this;
            super.setText(r1, r2)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)     // Catch: java.lang.StackOverflowError -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }
}
