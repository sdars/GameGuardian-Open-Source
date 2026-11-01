/*
 * Decompiled with CFR 0.152.
 */
package android.fix;

import android.content.Context;
import android.ext.Tools;
import android.ext.e1;
import android.ext.n0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

public class TextView
extends android.widget.TextView {
    private Rect a;
    private Paint.FontMetricsInt b;

    public TextView(Context context) {
        super(context);
    }

    public TextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int a(int n3, int n4) {
        int n5 = View.MeasureSpec.getMode((int)n4);
        n4 = View.MeasureSpec.getSize((int)n4);
        if (n5 != Integer.MIN_VALUE) {
            if (n5 == 0x40000000) {
                n3 = n4;
            }
        } else {
            n3 = Math.min(n3, n4);
        }
        return n3;
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

    protected void onDetachedFromWindow() {
        Tools.P(this);
        super.onDetachedFromWindow();
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

    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onMeasure(int n3, int n4) {
        try {
            super.onMeasure(n3, n4);
            return;
        }
        catch (Throwable throwable) {
            Throwable throwable22;
            block15: {
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                e1.a(throwable);
                try {
                    n10 = this.getSuggestedMinimumWidth();
                    n9 = this.getSuggestedMinimumHeight();
                    n8 = View.MeasureSpec.getMode((int)n3);
                    n7 = Integer.MAX_VALUE;
                    n8 = n8 == Integer.MIN_VALUE ? View.MeasureSpec.getSize((int)n3) : Integer.MAX_VALUE;
                }
                catch (Throwable throwable22) {
                    break block15;
                }
                if (n8 != 0) {
                    n7 = n8;
                }
                TextPaint textPaint = this.getPaint();
                CharSequence charSequence = this.getText();
                n8 = (int)((double)Tools.G(1.0f) + 0.99);
                int n11 = charSequence.length();
                int n12 = 0;
                int n13 = 0;
                for (n6 = 0; n6 <= n11; ++n6) {
                    int n14;
                    int n15;
                    block17: {
                        block16: {
                            if (n6 == n11) break block16;
                            n15 = n8;
                            n5 = n12;
                            n14 = n13;
                            if (charSequence.charAt(n6) != '\n') break block17;
                        }
                        n14 = n12 + 1;
                        n12 = n8;
                        n5 = n14;
                        if (n6 > n13) {
                            n5 = (int)((double)textPaint.measureText(charSequence, n13, n6) + 0.99);
                            n12 = n8;
                            if (n8 < n5) {
                                n12 = n5;
                            }
                            n5 = n14 + n5 / n7;
                        }
                        n14 = n6 + 1;
                        n15 = n12;
                    }
                    n8 = n15;
                    n12 = n5;
                    n13 = n14;
                }
                if (this.a == null) {
                    charSequence = new Rect();
                    this.a = charSequence;
                }
                if (this.b == null) {
                    charSequence = new Paint.FontMetricsInt();
                    this.b = charSequence;
                }
                textPaint.getTextBounds("!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~", 0, 94, this.a);
                charSequence = this.a;
                n5 = n7 = Math.max(((Rect)charSequence).bottom - ((Rect)charSequence).top + 1, textPaint.getFontMetricsInt(this.b));
                if (n7 <= 5) {
                    n5 = Math.max(n7, (int)((double)this.getTextSize() * 1.5 + 0.99));
                }
                n8 = Math.max(n10, n8 + this.getCompoundPaddingLeft() + this.getCompoundPaddingRight());
                n7 = this.getCompoundPaddingTop();
                n6 = this.getCompoundPaddingBottom();
                textPaint = this.b;
                n12 = Math.max(n9, n5 * n12 + n7 + n6 + (textPaint.bottom - textPaint.top - (textPaint.descent - textPaint.ascent)));
                this.setMeasuredDimension(TextView.a(n8, n3), TextView.a(n12, n4));
                return;
            }
            e1.a(throwable22);
            n0.h(Thread.currentThread(), throwable, false);
            n0.h(Thread.currentThread(), throwable22, false);
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
        catch (Throwable throwable) {
            e1.a(throwable);
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

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void setVisibility(int n3) {
        try {
            super.setVisibility(n3);
        }
        catch (StackOverflowError stackOverflowError) {
            e1.a(stackOverflowError);
        }
    }
}

