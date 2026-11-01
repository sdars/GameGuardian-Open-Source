package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class EditText extends android.fix.EditText implements android.ext.k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile android.ext.EditText.a[] f108b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f109a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f114e;

        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 0
            android.ext.EditText$a[] r0 = new android.ext.EditText.a[r0]
            android.ext.EditText.f108b = r0
            return
    }

    public EditText(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = -1
            r2.f109a = r3
            boolean r3 = r2.isInEditMode()
            r0 = 1
            if (r3 != 0) goto L1b
            int r3 = android.ext.Config.B
            r3 = r3 & 8
            if (r3 == 0) goto L15
            r3 = 1
            goto L18
        L15:
            r3 = 524289(0x80001, float:7.34685E-40)
        L18:
            r2.setInputType(r3)
        L1b:
            r2.setSingleLine(r0)
            r2.setSelectAllOnFocus(r0)
            r3 = 10
            r2.setMinEms(r3)
            r2.setCursorVisible(r0)
            r2.setFocusableInTouchMode(r0)
            java.lang.Class<android.widget.TextView> r3 = android.widget.TextView.class
            java.lang.String r1 = "mCursorDrawableRes"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r1)     // Catch: java.lang.Exception -> L40
            r3.setAccessible(r0)     // Catch: java.lang.Exception -> L40
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L40
            r3.set(r2, r0)     // Catch: java.lang.Exception -> L40
            goto L41
        L40:
        L41:
            boolean r3 = r2.isInEditMode()
            if (r3 != 0) goto L4a
            a(r2)
        L4a:
            return
    }

    public EditText(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = -1
            r1.f109a = r2
            boolean r2 = r1.isInEditMode()
            r3 = 1
            if (r2 != 0) goto L1b
            int r2 = android.ext.Config.B
            r2 = r2 & 8
            if (r2 == 0) goto L15
            r2 = 1
            goto L18
        L15:
            r2 = 524289(0x80001, float:7.34685E-40)
        L18:
            r1.setInputType(r2)
        L1b:
            r1.setSingleLine(r3)
            r1.setSelectAllOnFocus(r3)
            r2 = 10
            r1.setMinEms(r2)
            r1.setCursorVisible(r3)
            r1.setFocusableInTouchMode(r3)
            java.lang.Class<android.widget.TextView> r2 = android.widget.TextView.class
            java.lang.String r0 = "mCursorDrawableRes"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r0)     // Catch: java.lang.Exception -> L40
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L40
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L40
            r2.set(r1, r3)     // Catch: java.lang.Exception -> L40
            goto L41
        L40:
        L41:
            boolean r2 = r1.isInEditMode()
            if (r2 != 0) goto L4a
            a(r1)
        L4a:
            return
    }

    static void a(android.widget.EditText r7) {
            int[] r0 = android.view.View.ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET
            android.graphics.drawable.Drawable r1 = r7.getBackground()
            if (r1 == 0) goto L40
            r2 = 1108344832(0x42100000, float:36.0)
            float r2 = android.ext.Tools.G(r2)
            int r2 = (int) r2
            android.graphics.Rect r3 = r1.copyBounds()
            int[] r4 = r1.getState()
            r5 = 0
            r1.setBounds(r5, r5, r2, r2)
            r1.setState(r0)
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.OutOfMemoryError -> L39
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r2, r5)     // Catch: java.lang.OutOfMemoryError -> L39
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r5)
            r1.draw(r6)
            int r2 = r2 / 2
            int r2 = r5.getPixel(r2, r2)
            r1.setBounds(r3)
            r1.setState(r4)
            goto L42
        L39:
            r7 = move-exception
            java.lang.String r0 = "Failed checkContrast"
            android.ext.e1.s(r0, r7)
            return
        L40:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L42:
            android.content.res.ColorStateList r1 = r7.getTextColors()
            int r3 = r7.getCurrentTextColor()
            int r0 = r1.getColorForState(r0, r3)
            int r1 = h(r7)
            int r0 = j(r0, r2)
            int r1 = j(r1, r2)
            boolean r0 = b(r0, r2, r1)
            if (r0 == 0) goto L6f
            r0 = -1
            r7.setTextColor(r0)
            r0 = -6262672(0xffffffffffa07070, float:NaN)
            r7.setHighlightColor(r0)
            r0 = 2130968576(0x7f040000, float:1.754581E38)
            r7.setBackgroundResource(r0)
        L6f:
            return
    }

    private static boolean b(int r2, int r3, int r4) {
            r0 = 3
            float[] r1 = new float[r0]
            r1 = {x0022: FILL_ARRAY_DATA , data: [1083179008, 1123680256, 1140457472} // fill-array
            float[] r0 = new float[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [1073741824, 1112014848, 1125515264} // fill-array
            boolean r1 = c(r2, r3, r1)
            if (r1 != 0) goto L20
            boolean r2 = c(r2, r4, r0)
            if (r2 != 0) goto L20
            boolean r2 = c(r4, r3, r0)
            if (r2 == 0) goto L1e
            goto L20
        L1e:
            r2 = 0
            goto L21
        L20:
            r2 = 1
        L21:
            return r2
    }

    private static boolean c(int r6, int r7, float[] r8) {
            android.ext.EditText$a[] r0 = android.ext.EditText.f108b
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L15
            r4 = r0[r3]
            int r5 = r4.f110a
            if (r5 != r6) goto L12
            int r5 = r4.f111b
            if (r5 != r7) goto L12
            goto L16
        L12:
            int r3 = r3 + 1
            goto L5
        L15:
            r4 = 0
        L16:
            if (r4 != 0) goto L30
            android.ext.EditText$a r4 = new android.ext.EditText$a
            r4.<init>()
            r4.f110a = r6
            r4.f111b = r7
            d(r4)
            int r6 = r0.length
            int r7 = r6 + 1
            android.ext.EditText$a[] r7 = new android.ext.EditText.a[r7]
            java.lang.System.arraycopy(r0, r2, r7, r2, r6)
            r7[r6] = r4
            android.ext.EditText.f108b = r7
        L30:
            float r6 = r4.f112c
            r7 = r8[r2]
            r0 = 1
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L4a
            float r6 = r4.f113d
            r7 = r8[r0]
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L4a
            float r6 = r4.f114e
            r7 = 2
            r7 = r8[r7]
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L4b
        L4a:
            r2 = 1
        L4b:
            return r2
    }

    private static void d(android.ext.EditText.a r9) {
            java.lang.String r0 = ", "
            int r1 = r9.f110a
            int r2 = r9.f111b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkContrast(fg, bg): "
            r3.append(r4)
            java.lang.String r5 = java.lang.Integer.toHexString(r1)
            r3.append(r5)
            r5 = 32
            r3.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r2)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.ext.e1.d(r3)
            double r5 = g(r1, r2)
            float r3 = (float) r5
            r9.f112c = r3
            double r5 = e(r1)
            double r7 = e(r2)
            double r5 = r5 - r7
            double r5 = java.lang.Math.abs(r5)
            float r3 = (float) r5
            r9.f113d = r3
            double r1 = f(r1, r2)
            float r1 = (float) r1
            r9.f114e = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L6d
            r1.append(r4)     // Catch: java.lang.Throwable -> L6d
            float r2 = r9.f112c     // Catch: java.lang.Throwable -> L6d
            r1.append(r2)     // Catch: java.lang.Throwable -> L6d
            r1.append(r0)     // Catch: java.lang.Throwable -> L6d
            float r2 = r9.f113d     // Catch: java.lang.Throwable -> L6d
            r1.append(r2)     // Catch: java.lang.Throwable -> L6d
            r1.append(r0)     // Catch: java.lang.Throwable -> L6d
            float r9 = r9.f114e     // Catch: java.lang.Throwable -> L6d
            r1.append(r9)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L6d
            android.ext.e1.d(r9)     // Catch: java.lang.Throwable -> L6d
            goto L71
        L6d:
            r9 = move-exception
            android.ext.e1.a(r9)
        L71:
            return
    }

    private static double e(int r4) {
            int r0 = android.graphics.Color.red(r4)
            int r0 = r0 * 299
            int r1 = android.graphics.Color.green(r4)
            int r1 = r1 * 587
            int r0 = r0 + r1
            int r4 = android.graphics.Color.blue(r4)
            int r4 = r4 * 114
            int r0 = r0 + r4
            double r0 = (double) r0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            return r0
    }

    private static double f(int r5, int r6) {
            int r0 = android.graphics.Color.red(r5)
            int r1 = android.graphics.Color.green(r5)
            int r5 = android.graphics.Color.blue(r5)
            int r2 = android.graphics.Color.red(r6)
            int r3 = android.graphics.Color.green(r6)
            int r6 = android.graphics.Color.blue(r6)
            int r4 = java.lang.Math.max(r0, r2)
            int r0 = java.lang.Math.min(r0, r2)
            int r4 = r4 - r0
            int r0 = java.lang.Math.max(r1, r3)
            int r1 = java.lang.Math.min(r1, r3)
            int r0 = r0 - r1
            int r4 = r4 + r0
            int r0 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.min(r5, r6)
            int r0 = r0 - r5
            int r4 = r4 + r0
            double r5 = (double) r4
            return r5
    }

    private static double g(int r4, int r5) {
            double r0 = i(r4)
            r2 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r0 = r0 + r2
            double r4 = i(r5)
            double r4 = r4 + r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L15
            double r0 = r0 / r4
            goto L17
        L15:
            double r0 = r4 / r0
        L17:
            return r0
    }

    private static int h(android.widget.EditText r2) {
            int r2 = r2.getHighlightColor()     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r0 = move-exception
            java.lang.String r1 = "Failed getHighlightColor"
            android.ext.e1.l(r1, r0)
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            java.lang.String r1 = "mHighlightColor"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L1c
            int r2 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L1c
            return r2
        L1c:
            r2 = move-exception
            java.lang.String r0 = "Failed getHighlightColor2"
            android.ext.e1.l(r0, r2)
            r2 = 0
            return r2
    }

    private static double i(int r17) {
            int r0 = android.graphics.Color.red(r17)
            double r0 = (double) r0
            r2 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 / r2
            int r4 = android.graphics.Color.green(r17)
            double r4 = (double) r4
            double r4 = r4 / r2
            int r6 = android.graphics.Color.blue(r17)
            double r6 = (double) r6
            double r6 = r6 / r2
            r2 = 4612586738352862003(0x4003333333333333, double:2.4)
            r8 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r10 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r12 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            r14 = 4585821665623414051(0x3fa41c8216c61523, double:0.03928)
            int r16 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r16 > 0) goto L36
            double r0 = r0 / r12
            goto L3c
        L36:
            double r0 = r0 + r10
            double r0 = r0 / r8
            double r0 = java.lang.Math.pow(r0, r2)
        L3c:
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 > 0) goto L42
            double r4 = r4 / r12
            goto L48
        L42:
            double r4 = r4 + r10
            double r4 = r4 / r8
            double r4 = java.lang.Math.pow(r4, r2)
        L48:
            int r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r16 > 0) goto L4e
            double r6 = r6 / r12
            goto L54
        L4e:
            double r6 = r6 + r10
            double r6 = r6 / r8
            double r6 = java.lang.Math.pow(r6, r2)
        L54:
            r2 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r0 = r0 * r2
            r2 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r4 = r4 * r2
            double r0 = r0 + r4
            r2 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r6 = r6 * r2
            double r0 = r0 + r6
            return r0
    }

    private static int j(int r7, int r8) {
            int r0 = android.graphics.Color.alpha(r7)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = 0
        L7:
            r3 = 3
            if (r2 >= r3) goto L23
            int r3 = r2 * 8
            int r4 = r7 >> r3
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 * r0
            int r5 = r8 >> r3
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = 255 - r0
            int r5 = r5 * r6
            int r4 = r4 + r5
            int r4 = r4 / 255
            int r3 = r4 << r3
            r1 = r1 | r3
            int r2 = r2 + 1
            goto L7
        L23:
            return r1
    }

    @Override // android.ext.k0
    public int getDataType() {
            r1 = this;
            int r0 = r1.f109a
            return r0
    }

    @Override // android.ext.k0
    public void setDataType(int r1) {
            r0 = this;
            r0.f109a = r1
            return
    }
}
