package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class EditText extends android.fix.EditText implements android.ext.k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile android.ext.EditText.a[] f108b = new android.ext.EditText.a[0];

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
        }
    }

    public EditText(android.content.Context context) {
        super(context);
        this.f109a = -1;
        if (!isInEditMode()) {
            setInputType((android.ext.Config.B & 8) != 0 ? 1 : 524289);
        }
        setSingleLine(true);
        setSelectAllOnFocus(true);
        setMinEms(10);
        setCursorVisible(true);
        setFocusableInTouchMode(true);
        try {
            java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this, 0);
        } catch (java.lang.Exception unused) {
        }
        if (isInEditMode()) {
            return;
        }
        a(this);
    }

    public EditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109a = -1;
        if (!isInEditMode()) {
            setInputType((android.ext.Config.B & 8) != 0 ? 1 : 524289);
        }
        setSingleLine(true);
        setSelectAllOnFocus(true);
        setMinEms(10);
        setCursorVisible(true);
        setFocusableInTouchMode(true);
        try {
            java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this, 0);
        } catch (java.lang.Exception unused) {
        }
        if (isInEditMode()) {
            return;
        }
        a(this);
    }

    static void a(android.widget.EditText editText) {
        int pixel;
        int[] iArr = android.view.View.ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
        android.graphics.drawable.Drawable background = editText.getBackground();
        if (background != null) {
            int iG = (int) android.ext.Tools.G(36.0f);
            android.graphics.Rect rectCopyBounds = background.copyBounds();
            int[] state = background.getState();
            background.setBounds(0, 0, iG, iG);
            background.setState(iArr);
            try {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iG, iG, android.graphics.Bitmap.Config.ARGB_8888);
                background.draw(new android.graphics.Canvas(bitmapCreateBitmap));
                int i = iG / 2;
                pixel = bitmapCreateBitmap.getPixel(i, i);
                background.setBounds(rectCopyBounds);
                background.setState(state);
            } catch (java.lang.OutOfMemoryError e2) {
                android.ext.e1.s("Failed checkContrast", e2);
                return;
            }
        } else {
            pixel = -16777216;
        }
        if (b(j(editText.getTextColors().getColorForState(iArr, editText.getCurrentTextColor()), pixel), pixel, j(h(editText), pixel))) {
            editText.setTextColor(-1);
            editText.setHighlightColor(-6262672);
            editText.setBackgroundResource(catch_.me_.if_.you_.can_.R.drawable.abc_textfield_default_mtrl_alpha);
        }
    }

    private static boolean b(int i, int i2, int i3) {
        float[] fArr = {2.0f, 50.0f, 150.0f};
        return c(i, i2, new float[]{4.5f, 125.0f, 500.0f}) || c(i, i3, fArr) || c(i3, i2, fArr);
    }

    private static boolean c(int i, int i2, float[] fArr) {
        android.ext.EditText.a aVar;
        android.ext.EditText.a[] aVarArr = f108b;
        int length = aVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i3];
            if (aVar.f110a == i && aVar.f111b == i2) {
                break;
            }
            i3++;
        }
        if (aVar == null) {
            aVar = new android.ext.EditText.a();
            aVar.f110a = i;
            aVar.f111b = i2;
            d(aVar);
            int length2 = aVarArr.length;
            android.ext.EditText.a[] aVarArr2 = new android.ext.EditText.a[length2 + 1];
            java.lang.System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
            aVarArr2[length2] = aVar;
            f108b = aVarArr2;
        }
        return aVar.f112c < fArr[0] || aVar.f113d < fArr[1] || aVar.f114e < fArr[2];
    }

    private static void d(android.ext.EditText.a aVar) {
        int i = aVar.f110a;
        int i2 = aVar.f111b;
        android.ext.e1.d("checkContrast(fg, bg): " + java.lang.Integer.toHexString(i) + ' ' + java.lang.Integer.toHexString(i2));
        aVar.f112c = (float) g(i, i2);
        aVar.f113d = (float) java.lang.Math.abs(e(i) - e(i2));
        aVar.f114e = (float) f(i, i2);
        try {
            android.ext.e1.d("checkContrast(fg, bg): " + aVar.f112c + ", " + aVar.f113d + ", " + aVar.f114e);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
    }

    private static double e(int i) {
        return ((double) (((android.graphics.Color.red(i) * 299) + (android.graphics.Color.green(i) * 587)) + (android.graphics.Color.blue(i) * 114))) / 1000.0d;
    }

    private static double f(int i, int i2) {
        int iRed = android.graphics.Color.red(i);
        int iGreen = android.graphics.Color.green(i);
        int iBlue = android.graphics.Color.blue(i);
        int iRed2 = android.graphics.Color.red(i2);
        int iGreen2 = android.graphics.Color.green(i2);
        int iBlue2 = android.graphics.Color.blue(i2);
        return (java.lang.Math.max(iRed, iRed2) - java.lang.Math.min(iRed, iRed2)) + (java.lang.Math.max(iGreen, iGreen2) - java.lang.Math.min(iGreen, iGreen2)) + (java.lang.Math.max(iBlue, iBlue2) - java.lang.Math.min(iBlue, iBlue2));
    }

    private static double g(int i, int i2) {
        double dI = i(i) + 0.05d;
        double dI2 = i(i2) + 0.05d;
        return dI > dI2 ? dI / dI2 : dI2 / dI;
    }

    private static int h(android.widget.EditText editText) {
        try {
            return editText.getHighlightColor();
        } catch (java.lang.Throwable th) {
            android.ext.e1.l("Failed getHighlightColor", th);
            try {
                java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mHighlightColor");
                declaredField.setAccessible(true);
                return declaredField.getInt(editText);
            } catch (java.lang.Throwable th2) {
                android.ext.e1.l("Failed getHighlightColor2", th2);
                return 0;
            }
        }
    }

    private static double i(int i) {
        double dRed = ((double) android.graphics.Color.red(i)) / 255.0d;
        double dGreen = ((double) android.graphics.Color.green(i)) / 255.0d;
        double dBlue = ((double) android.graphics.Color.blue(i)) / 255.0d;
        return ((dRed <= 0.03928d ? dRed / 12.92d : java.lang.Math.pow((dRed + 0.055d) / 1.055d, 2.4d)) * 0.2126d) + ((dGreen <= 0.03928d ? dGreen / 12.92d : java.lang.Math.pow((dGreen + 0.055d) / 1.055d, 2.4d)) * 0.7152d) + ((dBlue <= 0.03928d ? dBlue / 12.92d : java.lang.Math.pow((dBlue + 0.055d) / 1.055d, 2.4d)) * 0.0722d);
    }

    private static int j(int i, int i2) {
        int iAlpha = android.graphics.Color.alpha(i);
        int i3 = -16777216;
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = i4 * 8;
            i3 |= (((((i >> i5) & 255) * iAlpha) + (((i2 >> i5) & 255) * (255 - iAlpha))) / 255) << i5;
        }
        return i3;
    }

    @Override // android.ext.k0
    public int getDataType() {
        return this.f109a;
    }

    @Override // android.ext.k0
    public void setDataType(int i) {
        this.f109a = i;
    }
}
