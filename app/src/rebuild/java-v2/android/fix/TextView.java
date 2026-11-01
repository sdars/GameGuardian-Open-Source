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

/* JADX INFO: loaded from: classes.dex */
public class TextView extends android.widget.TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f1448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint.FontMetricsInt f1449b;

    public TextView(Context context) {
        super(context);
    }

    private static int a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : size;
        }
        return Math.min(i, size);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        try {
            super.drawableStateChanged();
        } catch (ArrayIndexOutOfBoundsException e2) {
            e1.a(e2);
        }
    }

    public boolean getSecClipboardEnabled() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        try {
            super.invalidateDrawable(drawable);
        } catch (NoSuchFieldError e2) {
            e1.a(e2);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        Tools.P(this);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        try {
            return super.onDragEvent(dragEvent);
        } catch (ClassCastException e2) {
            e1.a(e2);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        try {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        } catch (NullPointerException e2) {
            e1.a(e2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        try {
            return super.onKeyShortcut(i, keyEvent);
        } catch (NullPointerException e2) {
            e1.a(e2);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            e1.a(th);
            try {
                int suggestedMinimumWidth = getSuggestedMinimumWidth();
                int suggestedMinimumHeight = getSuggestedMinimumHeight();
                int i3 = Integer.MAX_VALUE;
                int size = View.MeasureSpec.getMode(i) == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i) : Integer.MAX_VALUE;
                if (size != 0) {
                    i3 = size;
                }
                TextPaint paint = getPaint();
                CharSequence text = getText();
                int iG = (int) (((double) Tools.G(1.0f)) + 0.99d);
                int length = text.length();
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 <= length; i6++) {
                    if (i6 == length || text.charAt(i6) == '\n') {
                        i4++;
                        if (i6 > i5) {
                            int iMeasureText = (int) (((double) paint.measureText(text, i5, i6)) + 0.99d);
                            if (iG < iMeasureText) {
                                iG = iMeasureText;
                            }
                            i4 += iMeasureText / i3;
                        }
                        i5 = i6 + 1;
                    }
                }
                if (this.f1448a == null) {
                    this.f1448a = new Rect();
                }
                if (this.f1449b == null) {
                    this.f1449b = new Paint.FontMetricsInt();
                }
                paint.getTextBounds("!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~", 0, 94, this.f1448a);
                Rect rect = this.f1448a;
                int iMax = Math.max((rect.bottom - rect.top) + 1, paint.getFontMetricsInt(this.f1449b));
                if (iMax <= 5) {
                    iMax = Math.max(iMax, (int) ((((double) getTextSize()) * 1.5d) + 0.99d));
                }
                int iMax2 = Math.max(suggestedMinimumWidth, iG + getCompoundPaddingLeft() + getCompoundPaddingRight());
                int compoundPaddingTop = (iMax * i4) + getCompoundPaddingTop() + getCompoundPaddingBottom();
                Paint.FontMetricsInt fontMetricsInt = this.f1449b;
                setMeasuredDimension(a(iMax2, i), a(Math.max(suggestedMinimumHeight, compoundPaddingTop + ((fontMetricsInt.bottom - fontMetricsInt.top) - (fontMetricsInt.descent - fontMetricsInt.ascent))), i2));
            } catch (Throwable th2) {
                e1.a(th2);
                n0.h(Thread.currentThread(), th, false);
                n0.h(Thread.currentThread(), th2, false);
            }
        }
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        try {
            return super.onTextContextMenuItem(i);
        } catch (NullPointerException e2) {
            e1.a(e2);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (NullPointerException e2) {
            e1.a(e2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.View
    public void playSoundEffect(int i) {
        try {
            super.playSoundEffect(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        try {
            super.refreshDrawableState();
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        try {
            super.sendAccessibilityEvent(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        try {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } catch (StringIndexOutOfBoundsException e2) {
            e1.a(e2);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
        } catch (StackOverflowError e2) {
            e1.a(e2);
        }
    }

    public TextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
