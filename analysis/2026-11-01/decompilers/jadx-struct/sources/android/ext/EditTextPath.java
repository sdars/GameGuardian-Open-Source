package android.ext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.TextView$BufferType;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPath extends AutoCompleteTextView implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f116b;

    public EditTextPath(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f115a = 0;
        this.f116b = -1;
        setAdapter(new EditTextPath$a(this));
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
        if (!isInEditMode()) {
            EditText.a(this);
        }
        setInputType(getInputType() | 262144);
        setHorizontallyScrolling(false);
        setMaxLines(Integer.MAX_VALUE);
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

    @Override // android.ext.k0
    public int getDataType() {
        return this.f116b;
    }

    public int getPathType() {
        return this.f115a;
    }

    public boolean getSecClipboardEnabled() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable$Callback
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

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
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

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        boolean zIsPopupShowing = isPopupShowing();
        if (i == 66 && zIsPopupShowing) {
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
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

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
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

    @Override // android.ext.k0
    public void setDataType(int i) {
        this.f116b = i;
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean z) {
        super.setHorizontallyScrolling(false);
    }

    @Override // android.widget.TextView
    public void setImeOptions(int i) {
        try {
            super.setImeOptions(i | 1912602624);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(Integer.MAX_VALUE);
    }

    public void setPathType(int i) {
        this.f115a = i;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView$BufferType textView$BufferType) {
        try {
            super.setText(charSequence, textView$BufferType);
        } catch (NullPointerException | SecurityException e2) {
            e1.a(e2);
        }
    }
}
