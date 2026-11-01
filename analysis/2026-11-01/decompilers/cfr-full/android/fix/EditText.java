/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.Context;
import android.ext.e1;
import android.ext.n0;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

public class EditText
extends android.widget.EditText {
    public EditText(Context context) {
        super(context);
    }

    public EditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void dispatchWindowFocusChanged(boolean bl) {
        try {
            super.dispatchWindowFocusChanged(bl);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    protected void drawableStateChanged() {
        try {
            super.drawableStateChanged();
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            e1.a(arrayIndexOutOfBoundsException);
        }
    }

    public boolean getSecClipboardEnabled() {
        return false;
    }

    public void invalidateDrawable(Drawable drawable2) {
        try {
            super.invalidateDrawable(drawable2);
        }
        catch (NoSuchFieldError noSuchFieldError) {
            e1.a(noSuchFieldError);
        }
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        try {
            boolean bl = super.onDragEvent(dragEvent);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void onDraw(Canvas var1_1) {
        try {
            super.onDraw(var1_1);
        }
        catch (ArrayIndexOutOfBoundsException var1_2) lbl-1000:
        // 2 sources

        {
            while (true) {
                e1.a((Throwable)var1_3);
                break;
            }
        }
        catch (NullPointerException var1_4) {
            ** continue;
        }
    }

    protected void onFocusChanged(boolean bl, int n3, Rect rect) {
        block5: {
            int n4 = super.getImeOptions();
            if ((n4 & 0x72000000) == 0x72000000) break block5;
            try {
                super.setImeOptions(n4 | 0x72000000);
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        try {
            super.onFocusChanged(bl, n3, rect);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        try {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        }
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
        }
    }

    public boolean onKeyShortcut(int n3, KeyEvent keyEvent) {
        try {
            boolean bl = super.onKeyShortcut(n3, keyEvent);
            return bl;
        }
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
            return false;
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

    public boolean onTextContextMenuItem(int n3) {
        try {
            boolean bl = super.onTextContextMenuItem(n3);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            boolean bl = super.onTouchEvent(motionEvent);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    public void onWindowFocusChanged(boolean bl) {
        try {
            super.onWindowFocusChanged(bl);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public boolean performLongClick() {
        try {
            boolean bl = super.performLongClick();
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    public void playSoundEffect(int n3) {
        try {
            super.playSoundEffect(n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void refreshDrawableState() {
        try {
            super.refreshDrawableState();
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void sendAccessibilityEvent(int n3) {
        try {
            super.sendAccessibilityEvent(n3);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void setCompoundDrawables(Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5) {
        try {
            super.setCompoundDrawables(drawable2, drawable3, drawable4, drawable5);
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            e1.a(stringIndexOutOfBoundsException);
        }
    }

    public void setImeOptions(int n3) {
        try {
            super.setImeOptions(n3 | 0x72000000);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        block3: {
            void var1_4;
            try {
                super.setText(charSequence, bufferType);
                break block3;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (SecurityException securityException) {
                // empty catch block
            }
            e1.a((Throwable)var1_4);
        }
    }
}

