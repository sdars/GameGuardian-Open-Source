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

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class EditText extends android.widget.EditText {
    public EditText(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void dispatchWindowFocusChanged(boolean z) {
        try {
            super.dispatchWindowFocusChanged(z);
        } catch (Throwable th) {
            e1.a(th);
        }
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

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        try {
            return super.onDragEvent(dragEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e2) {
            e1.a(e2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            int imeOptions = super.getImeOptions();
            if ((imeOptions & 1912602624) != 1912602624) {
                super.setImeOptions(imeOptions | 1912602624);
            }
        } catch (Throwable th) {
            e1.a(th);
        }
        try {
            super.onFocusChanged(z, i, rect);
        } catch (Throwable th2) {
            e1.a(th2);
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

    @Override // android.widget.EditText, android.widget.TextView, android.view.View
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
            n0.h(Thread.currentThread(), th, false);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        try {
            return super.onTextContextMenuItem(i);
        } catch (Throwable th) {
            e1.a(th);
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
        } catch (Throwable th) {
            e1.a(th);
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
    public void setImeOptions(int i) {
        try {
            super.setImeOptions(i | 1912602624);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (NullPointerException | SecurityException e2) {
            e1.a(e2);
        }
    }

    public EditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
