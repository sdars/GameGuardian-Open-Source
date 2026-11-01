package android.ext;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$drawable;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class EditText extends android.fix.EditText implements k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile EditText$a[] f108b = new EditText$a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f109a;

    public EditText(Context context) {
        super(context);
        this.f109a = -1;
        if (!isInEditMode()) {
            setInputType((Config.B & 8) != 0 ? 1 : 524289);
        }
        setSingleLine(true);
        setSelectAllOnFocus(true);
        setMinEms(10);
        setCursorVisible(true);
        setFocusableInTouchMode(true);
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this, 0);
        } catch (Exception unused) {
        }
        if (isInEditMode()) {
            return;
        }
        a(this);
    }

    public EditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109a = -1;
        if (!isInEditMode()) {
            setInputType((Config.B & 8) != 0 ? 1 : 524289);
        }
        setSingleLine(true);
        setSelectAllOnFocus(true);
        setMinEms(10);
        setCursorVisible(true);
        setFocusableInTouchMode(true);
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this, 0);
        } catch (Exception unused) {
        }
        if (isInEditMode()) {
            return;
        }
        a(this);
    }

    static void a(android.widget.EditText editText) {
        int pixel;
        int[] iArr = View.ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
        Drawable background = editText.getBackground();
        if (background != null) {
            int iG = (int) Tools.G(36.0f);
            Rect rectCopyBounds = background.copyBounds();
            int[] state = background.getState();
            background.setBounds(0, 0, iG, iG);
            background.setState(iArr);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iG, iG, Bitmap$Config.ARGB_8888);
                background.draw(new Canvas(bitmapCreateBitmap));
                int i = iG / 2;
                pixel = bitmapCreateBitmap.getPixel(i, i);
                background.setBounds(rectCopyBounds);
                background.setState(state);
            } catch (OutOfMemoryError e2) {
                e1.s("Failed checkContrast", e2);
                return;
            }
        } else {
            pixel = -16777216;
        }
        if (b(j(editText.getTextColors().getColorForState(iArr, editText.getCurrentTextColor()), pixel), pixel, j(h(editText), pixel))) {
            editText.setTextColor(-1);
            editText.setHighlightColor(-6262672);
            editText.setBackgroundResource(R$drawable.abc_textfield_default_mtrl_alpha);
        }
    }

    private static boolean b(int i, int i2, int i3) {
        float[] fArr = {2.0f, 50.0f, 150.0f};
        return c(i, i2, new float[]{4.5f, 125.0f, 500.0f}) || c(i, i3, fArr) || c(i3, i2, fArr);
    }

    private static boolean c(int i, int i2, float[] fArr) {
        EditText$a editText$a;
        EditText$a[] editText$aArr = f108b;
        int length = editText$aArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                editText$a = null;
                break;
            }
            editText$a = editText$aArr[i3];
            if (editText$a.f110a == i && editText$a.f111b == i2) {
                break;
            }
            i3++;
        }
        if (editText$a == null) {
            editText$a = new EditText$a();
            editText$a.f110a = i;
            editText$a.f111b = i2;
            d(editText$a);
            int length2 = editText$aArr.length;
            EditText$a[] editText$aArr2 = new EditText$a[length2 + 1];
            System.arraycopy(editText$aArr, 0, editText$aArr2, 0, length2);
            editText$aArr2[length2] = editText$a;
            f108b = editText$aArr2;
        }
        return editText$a.f112c < fArr[0] || editText$a.f113d < fArr[1] || editText$a.f114e < fArr[2];
    }

    private static void d(EditText$a editText$a) {
        int i = editText$a.f110a;
        int i2 = editText$a.f111b;
        e1.d("checkContrast(fg, bg): " + Integer.toHexString(i) + ' ' + Integer.toHexString(i2));
        editText$a.f112c = (float) g(i, i2);
        editText$a.f113d = (float) Math.abs(e(i) - e(i2));
        editText$a.f114e = (float) f(i, i2);
        try {
            e1.d("checkContrast(fg, bg): " + editText$a.f112c + ", " + editText$a.f113d + ", " + editText$a.f114e);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    private static double e(int i) {
        return ((double) (((Color.red(i) * 299) + (Color.green(i) * 587)) + (Color.blue(i) * 114))) / 1000.0d;
    }

    private static double f(int i, int i2) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iRed2 = Color.red(i2);
        int iGreen2 = Color.green(i2);
        int iBlue2 = Color.blue(i2);
        return (Math.max(iRed, iRed2) - Math.min(iRed, iRed2)) + (Math.max(iGreen, iGreen2) - Math.min(iGreen, iGreen2)) + (Math.max(iBlue, iBlue2) - Math.min(iBlue, iBlue2));
    }

    private static double g(int i, int i2) {
        double dI = i(i) + 0.05d;
        double dI2 = i(i2) + 0.05d;
        return dI > dI2 ? dI / dI2 : dI2 / dI;
    }

    private static int h(android.widget.EditText editText) {
        try {
            return editText.getHighlightColor();
        } catch (Throwable th) {
            e1.l("Failed getHighlightColor", th);
            try {
                Field declaredField = TextView.class.getDeclaredField("mHighlightColor");
                declaredField.setAccessible(true);
                return declaredField.getInt(editText);
            } catch (Throwable th2) {
                e1.l("Failed getHighlightColor2", th2);
                return 0;
            }
        }
    }

    private static double i(int i) {
        double dRed = ((double) Color.red(i)) / 255.0d;
        double dGreen = ((double) Color.green(i)) / 255.0d;
        double dBlue = ((double) Color.blue(i)) / 255.0d;
        return ((dRed <= 0.03928d ? dRed / 12.92d : Math.pow((dRed + 0.055d) / 1.055d, 2.4d)) * 0.2126d) + ((dGreen <= 0.03928d ? dGreen / 12.92d : Math.pow((dGreen + 0.055d) / 1.055d, 2.4d)) * 0.7152d) + ((dBlue <= 0.03928d ? dBlue / 12.92d : Math.pow((dBlue + 0.055d) / 1.055d, 2.4d)) * 0.0722d);
    }

    private static int j(int i, int i2) {
        int iAlpha = Color.alpha(i);
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
