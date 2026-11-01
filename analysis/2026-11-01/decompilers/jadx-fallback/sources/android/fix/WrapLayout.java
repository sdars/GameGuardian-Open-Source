package android.fix;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class WrapLayout extends android.view.ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f1452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1453b;

    public WrapLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int[] r1 = d.b.f1512d
            r0.f1452a = r1
            r1 = -1
            r0.f1453b = r1
            return
    }

    private int a(boolean r25, int r26, int r27) {
            r24 = this;
            r0 = r24
            int r1 = r24.getChildCount()
            r2 = 0
            if (r25 != 0) goto L11
            int[] r3 = r0.f1452a
            int r3 = r3.length
            int r4 = r1 * 2
            if (r3 != r4) goto L11
            return r2
        L11:
            int r3 = r0.f1453b
            if (r3 != 0) goto L17
            r5 = 1
            goto L18
        L17:
            r5 = 0
        L18:
            if (r3 <= 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            int r6 = r1 * 2
            int[] r6 = new int[r6]
            int[] r7 = new int[r1]
            if (r3 == 0) goto L28
            int[] r9 = new int[r1]
            goto L29
        L28:
            r9 = 0
        L29:
            if (r3 == 0) goto L34
            int r10 = r24.getPaddingLeft()
            int r11 = r24.getPaddingRight()
            goto L3c
        L34:
            int r10 = r24.getPaddingRight()
            int r11 = r24.getPaddingLeft()
        L3c:
            int r10 = r26 - r10
            int r12 = r10 - r11
            int r13 = r24.getPaddingTop()
            r8 = r11
            r4 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L4e:
            if (r14 >= r1) goto L12f
            android.view.View r19 = r0.getChildAt(r14)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L57
            r2 = r19
            goto L59
        L57:
            r2 = 0
        L59:
            r20 = r15
            if (r2 != 0) goto L5e
            goto L70
        L5e:
            int r15 = r2.getVisibility()
            r0 = 8
            if (r15 != r0) goto L7a
            boolean r0 = r2 instanceof android.fix.ToolbarButton
            if (r0 == 0) goto L70
            android.fix.ToolbarButton r2 = (android.fix.ToolbarButton) r2
            r0 = 0
            r2.setIcon(r0)
        L70:
            r22 = r3
            r21 = r9
            r15 = r20
            r3 = r27
            goto L124
        L7a:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r15 = r0.width
            r21 = r9
            r9 = -1
            r22 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r15 != r9) goto L8e
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r3)
            goto L9b
        L8e:
            if (r15 <= 0) goto L95
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r3)
            goto L9b
        L95:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
        L9b:
            int r0 = r0.height
            if (r0 <= 0) goto La8
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r3 = r27
            r15 = r0
            r0 = 0
            goto Laf
        La8:
            r3 = r27
            r0 = 0
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
        Laf:
            r2.measure(r9, r15)
            int r9 = r2.getMeasuredWidth()
            int r15 = r2.getMeasuredHeight()
            if (r8 <= r11) goto Lf2
            int r0 = r8 + r9
            if (r0 > r10) goto Lc1
            goto Lf2
        Lc1:
            r0 = r20
        Lc3:
            if (r0 >= r14) goto Le6
            int r17 = r1 + r0
            r20 = r6[r17]
            r23 = r7[r0]
            int r23 = r4 - r23
            int r23 = r23 / 2
            int r20 = r20 + r23
            r6[r17] = r20
            if (r5 == 0) goto Le3
            r17 = r6[r0]
            int r20 = r12 - r8
            int r20 = r20 / 2
            int r20 = r11 + r20
            int r20 = r20 - r16
            int r17 = r17 + r20
            r6[r0] = r17
        Le3:
            int r0 = r0 + 1
            goto Lc3
        Le6:
            int r18 = r18 + 1
            int r13 = r13 + r4
            r8 = r11
            r20 = r14
            r4 = r15
            r16 = 0
            r17 = 0
            goto Lf5
        Lf2:
            if (r4 >= r15) goto Lf5
            r4 = r15
        Lf5:
            if (r5 == 0) goto L107
            int r0 = r14 - r20
            int r0 = r0 % 2
            if (r0 == 0) goto L102
            r6[r14] = r17
            int r17 = r17 + r9
            goto L109
        L102:
            int r16 = r16 - r9
            r6[r14] = r16
            goto L109
        L107:
            r6[r14] = r8
        L109:
            int r0 = r1 + r14
            r6[r0] = r13
            r7[r14] = r15
            if (r22 == 0) goto L113
            r21[r14] = r9
        L113:
            int r8 = r8 + r9
            boolean r0 = r2 instanceof android.fix.ToolbarButton
            if (r0 == 0) goto L122
            android.fix.ToolbarButton r2 = (android.fix.ToolbarButton) r2
            if (r18 != 0) goto L11e
            r0 = 1
            goto L11f
        L11e:
            r0 = 0
        L11f:
            r2.setIcon(r0)
        L122:
            r15 = r20
        L124:
            int r14 = r14 + 1
            r2 = 0
            r0 = r24
            r9 = r21
            r3 = r22
            goto L4e
        L12f:
            r22 = r3
            r21 = r9
            r20 = r15
        L135:
            if (r15 >= r1) goto L155
            int r0 = r1 + r15
            r2 = r6[r0]
            r3 = r7[r15]
            int r3 = r4 - r3
            int r3 = r3 / 2
            int r2 = r2 + r3
            r6[r0] = r2
            if (r5 == 0) goto L152
            r0 = r6[r15]
            int r2 = r12 - r8
            int r2 = r2 / 2
            int r2 = r2 + r11
            int r2 = r2 - r16
            int r0 = r0 + r2
            r6[r15] = r0
        L152:
            int r15 = r15 + 1
            goto L135
        L155:
            if (r22 == 0) goto L166
            r2 = 0
        L158:
            if (r2 >= r1) goto L166
            r0 = r6[r2]
            int r0 = r26 - r0
            r3 = r21[r2]
            int r0 = r0 - r3
            r6[r2] = r0
            int r2 = r2 + 1
            goto L158
        L166:
            r0 = r24
            r0.f1452a = r6
            int r13 = r13 + r4
            int r1 = r24.getPaddingBottom()
            int r13 = r13 + r1
            return r13
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof android.view.ViewGroup.LayoutParams
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r6) {
            r5 = this;
            super.onConfigurationChanged(r6)
            int r6 = r5.getChildCount()
            r0 = 0
            r1 = 0
            r2 = 0
        La:
            if (r1 >= r6) goto L22
            android.view.View r3 = r5.getChildAt(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L11
            goto L12
        L11:
            r3 = 0
        L12:
            if (r3 != 0) goto L15
            goto L1f
        L15:
            boolean r4 = r3 instanceof android.fix.ToolbarButton
            if (r4 == 0) goto L1f
            android.fix.ToolbarButton r3 = (android.fix.ToolbarButton) r3
            r3.setIcon(r0)
            r2 = 1
        L1f:
            int r1 = r1 + 1
            goto La
        L22:
            if (r2 == 0) goto L27
            r5.requestLayout()
        L27:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            int r4 = r3.getChildCount()
            int r7 = r7 - r5
            int r8 = r8 - r6
            r5 = 0
            r3.a(r5, r7, r8)
            int[] r6 = r3.f1452a
        Lc:
            if (r5 >= r4) goto L33
            android.view.View r7 = r3.getChildAt(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L30
            if (r7 == 0) goto L30
            int r8 = r7.getVisibility()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L30
            r0 = 8
            if (r8 != r0) goto L1d
            goto L30
        L1d:
            int r8 = r7.getMeasuredWidth()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L30
            int r0 = r7.getMeasuredHeight()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L30
            r1 = r6[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L30
            int r2 = r4 + r5
            r2 = r6[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L30
            int r8 = r8 + r1
            int r0 = r0 + r2
            r7.layout(r1, r2, r8, r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L30
        L30:
            int r5 = r5 + 1
            goto Lc
        L33:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = android.view.View.MeasureSpec.getSize(r5)
            r1 = 1
            int r1 = r3.a(r1, r4, r0)
            int r2 = android.view.View.MeasureSpec.getMode(r5)
            if (r2 != 0) goto L14
            goto L1e
        L14:
            int r5 = android.view.View.MeasureSpec.getMode(r5)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r2) goto L1f
            if (r1 > r0) goto L1f
        L1e:
            r0 = r1
        L1f:
            r3.setMeasuredDimension(r4, r0)
            return
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

    public void setFill(int r2) {
            r1 = this;
            int r0 = r1.f1453b
            r1.f1453b = r2
            if (r0 == r2) goto Lc
            r1.requestLayout()
            r1.postInvalidate()
        Lc:
            return
    }
}
