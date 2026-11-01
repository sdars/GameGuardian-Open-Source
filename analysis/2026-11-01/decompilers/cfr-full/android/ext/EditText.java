/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.Context;
import android.ext.Config;
import android.ext.Tools;
import android.ext.e1;
import android.ext.k0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class EditText
extends android.fix.EditText
implements k0 {
    private static volatile a[] b = new a[0];
    private int a = -1;

    public EditText(Context object) {
        super((Context)object);
        if (!this.isInEditMode()) {
            int n3 = (Config.B & 8) != 0 ? 1 : 524289;
            this.setInputType(n3);
        }
        this.setSingleLine(true);
        this.setSelectAllOnFocus(true);
        this.setMinEms(10);
        this.setCursorVisible(true);
        this.setFocusableInTouchMode(true);
        try {
            object = TextView.class.getDeclaredField("mCursorDrawableRes");
            ((AccessibleObject)object).setAccessible(true);
            ((Field)object).set(this, 0);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (!this.isInEditMode()) {
            EditText.a(this);
        }
    }

    public EditText(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        if (!this.isInEditMode()) {
            int n3 = (Config.B & 8) != 0 ? 1 : 524289;
            this.setInputType(n3);
        }
        this.setSingleLine(true);
        this.setSelectAllOnFocus(true);
        this.setMinEms(10);
        this.setCursorVisible(true);
        this.setFocusableInTouchMode(true);
        try {
            object = TextView.class.getDeclaredField("mCursorDrawableRes");
            ((AccessibleObject)object).setAccessible(true);
            ((Field)object).set(this, 0);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (!this.isInEditMode()) {
            EditText.a(this);
        }
    }

    static void a(android.widget.EditText editText) {
        int n3;
        int[] nArray;
        block4: {
            block3: {
                Bitmap bitmap;
                nArray = View.ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
                Drawable drawable2 = editText.getBackground();
                if (drawable2 == null) break block3;
                n3 = (int)Tools.G(36.0f);
                Rect rect = drawable2.copyBounds();
                int[] nArray2 = drawable2.getState();
                drawable2.setBounds(0, 0, n3, n3);
                drawable2.setState(nArray);
                try {
                    bitmap = Bitmap.createBitmap((int)n3, (int)n3, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    e1.s("Failed checkContrast", outOfMemoryError);
                    return;
                }
                drawable2.draw(new Canvas(bitmap));
                n3 /= 2;
                n3 = bitmap.getPixel(n3, n3);
                drawable2.setBounds(rect);
                drawable2.setState(nArray2);
                break block4;
            }
            n3 = -16777216;
        }
        int n4 = editText.getTextColors().getColorForState(nArray, editText.getCurrentTextColor());
        int n5 = EditText.h(editText);
        if (EditText.b(EditText.j(n4, n3), n3, EditText.j(n5, n3))) {
            editText.setTextColor(-1);
            editText.setHighlightColor(-6262672);
            editText.setBackgroundResource(2130968576);
        }
    }

    private static boolean b(int n3, int n4, int n5) {
        float[] fArray;
        float[] fArray2 = fArray = new float[3];
        fArray[0] = 2.0f;
        fArray2[1] = 50.0f;
        fArray2[2] = 150.0f;
        boolean bl = EditText.c(n3, n4, new float[]{4.5f, 125.0f, 500.0f}) || EditText.c(n3, n5, fArray) || EditText.c(n5, n4, fArray);
        return bl;
    }

    private static boolean c(int n3, int n4, float[] fArray) {
        a[] aArray;
        boolean bl;
        a[] aArray2;
        block4: {
            aArray2 = b;
            int n5 = aArray2.length;
            bl = false;
            for (int i3 = 0; i3 < n5; ++i3) {
                aArray = aArray2[i3];
                if (aArray.a != n3 || aArray.b != n4) {
                    continue;
                }
                break block4;
            }
            aArray = null;
        }
        a[] aArray3 = aArray;
        if (aArray == null) {
            aArray3 = new a();
            aArray3.a = n3;
            aArray3.b = n4;
            EditText.d((a)aArray3);
            n3 = aArray2.length;
            aArray = new a[n3 + 1];
            System.arraycopy(aArray2, 0, aArray, 0, n3);
            aArray[n3] = aArray3;
            b = aArray;
        }
        if (aArray3.c < fArray[0] || aArray3.d < fArray[1] || aArray3.e < fArray[2]) {
            bl = true;
        }
        return bl;
    }

    private static void d(a a4) {
        int n3 = a4.a;
        int n4 = a4.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("checkContrast(fg, bg): ");
        stringBuilder.append(Integer.toHexString(n3));
        stringBuilder.append(' ');
        stringBuilder.append(Integer.toHexString(n4));
        e1.d(stringBuilder.toString());
        a4.c = (float)EditText.g(n3, n4);
        a4.d = (float)Math.abs(EditText.e(n3) - EditText.e(n4));
        a4.e = (float)EditText.f(n3, n4);
        try {
            stringBuilder = new StringBuilder();
            stringBuilder.append("checkContrast(fg, bg): ");
            stringBuilder.append(a4.c);
            stringBuilder.append(", ");
            stringBuilder.append(a4.d);
            stringBuilder.append(", ");
            stringBuilder.append(a4.e);
            e1.d(stringBuilder.toString());
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    private static double e(int n3) {
        return (double)(Color.red((int)n3) * 299 + Color.green((int)n3) * 587 + Color.blue((int)n3) * 114) / 1000.0;
    }

    private static double f(int n3, int n4) {
        int n5 = Color.red((int)n3);
        int n6 = Color.green((int)n3);
        n3 = Color.blue((int)n3);
        int n7 = Color.red((int)n4);
        int n8 = Color.green((int)n4);
        n4 = Color.blue((int)n4);
        return Math.max(n5, n7) - Math.min(n5, n7) + (Math.max(n6, n8) - Math.min(n6, n8)) + (Math.max(n3, n4) - Math.min(n3, n4));
    }

    private static double g(int n3, int n4) {
        double d4;
        double d5 = EditText.i(n3) + 0.05;
        d4 = d5 > (d4 = EditText.i(n4) + 0.05) ? d5 / d4 : (d4 /= d5);
        return d4;
    }

    private static int h(android.widget.EditText editText) {
        try {
            int n3 = editText.getHighlightColor();
            return n3;
        }
        catch (Throwable throwable) {
            e1.l("Failed getHighlightColor", throwable);
            try {
                Field field = TextView.class.getDeclaredField("mHighlightColor");
                ((AccessibleObject)field).setAccessible(true);
                int n4 = field.getInt(editText);
                return n4;
            }
            catch (Throwable throwable2) {
                e1.l("Failed getHighlightColor2", throwable2);
                return 0;
            }
        }
    }

    private static double i(int n3) {
        double d4 = (double)Color.red((int)n3) / 255.0;
        double d5 = (double)Color.green((int)n3) / 255.0;
        double d6 = (double)Color.blue((int)n3) / 255.0;
        d4 = d4 <= 0.03928 ? (d4 /= 12.92) : Math.pow((d4 + 0.055) / 1.055, 2.4);
        d5 = d5 <= 0.03928 ? (d5 /= 12.92) : Math.pow((d5 + 0.055) / 1.055, 2.4);
        d6 = d6 <= 0.03928 ? (d6 /= 12.92) : Math.pow((d6 + 0.055) / 1.055, 2.4);
        return d4 * 0.2126 + d5 * 0.7152 + d6 * 0.0722;
    }

    private static int j(int n3, int n4) {
        int n5 = Color.alpha((int)n3);
        int n6 = -16777216;
        for (int i3 = 0; i3 < 3; ++i3) {
            int n7 = i3 * 8;
            n6 |= ((n3 >> n7 & 0xFF) * n5 + (n4 >> n7 & 0xFF) * (255 - n5)) / 255 << n7;
        }
        return n6;
    }

    @Override
    public int getDataType() {
        return this.a;
    }

    @Override
    public void setDataType(int n3) {
        this.a = n3;
    }

    static class a {
        int a;
        int b;
        float c;
        float d;
        float e;

        a() {
        }
    }
}

