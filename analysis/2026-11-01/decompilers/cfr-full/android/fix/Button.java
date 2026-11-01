/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.ext.e1;
import android.ext.n0;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

public class Button
extends android.widget.Button {
    public Button(Context context) {
        super(context);
    }

    public Button(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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
        catch (ClassCastException classCastException) {
            e1.a(classCastException);
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
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            boolean bl = super.onTouchEvent(motionEvent);
            return bl;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            e1.a(activityNotFoundException);
            return false;
        }
    }

    public void onWindowFocusChanged(boolean bl) {
        try {
            super.onWindowFocusChanged(bl);
        }
        catch (NullPointerException nullPointerException) {
            e1.a(nullPointerException);
        }
    }

    public boolean performLongClick() {
        try {
            boolean bl = super.performLongClick();
            return bl;
        }
        catch (ClassCastException classCastException) {
            e1.a(classCastException);
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

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        }
        catch (SecurityException securityException) {
            e1.a(securityException);
        }
    }
}

