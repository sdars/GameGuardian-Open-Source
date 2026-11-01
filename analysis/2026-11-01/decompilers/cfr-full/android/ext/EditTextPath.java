/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.content.Context;
import android.ext.Config;
import android.ext.EditText;
import android.ext.PathSelector;
import android.ext.e1;
import android.ext.k0;
import android.ext.n0;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.io.File;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Locale;

public class EditTextPath
extends AutoCompleteTextView
implements k0 {
    private int a = 0;
    private int b = -1;

    public EditTextPath(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        this.setAdapter((ListAdapter)new a(this));
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
            EditText.a((android.widget.EditText)this);
        }
        this.setInputType(this.getInputType() | 0x40000);
        this.setHorizontallyScrolling(false);
        this.setMaxLines(Integer.MAX_VALUE);
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

    @Override
    public int getDataType() {
        return this.b;
    }

    public int getPathType() {
        return this.a;
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

    public boolean onKeyPreIme(int n3, KeyEvent keyEvent) {
        boolean bl = this.isPopupShowing();
        bl = n3 == 66 && bl ? true : super.onKeyPreIme(n3, keyEvent);
        return bl;
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

    @Override
    public void setDataType(int n3) {
        this.b = n3;
    }

    public void setHorizontallyScrolling(boolean bl) {
        super.setHorizontallyScrolling(false);
    }

    public void setImeOptions(int n3) {
        try {
            super.setImeOptions(n3 | 0x72000000);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void setMaxLines(int n3) {
        super.setMaxLines(Integer.MAX_VALUE);
    }

    public void setPathType(int n3) {
        this.a = n3;
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

    class android.ext.EditTextPath$a
    extends BaseAdapter
    implements Filterable {
        final Filter a;
        private File[] b;
        final EditTextPath c;

        public android.ext.EditTextPath$a(EditTextPath editTextPath) {
            this.c = editTextPath;
            this.b = null;
            this.a = new a(this);
        }

        static /* synthetic */ File[] a(android.ext.EditTextPath$a a4, File[] fileArray) {
            a4.b = fileArray;
            return fileArray;
        }

        public int getCount() {
            File[] fileArray = this.b;
            int n3 = fileArray == null ? 0 : fileArray.length;
            return n3;
        }

        public Filter getFilter() {
            return this.a;
        }

        public Object getItem(int n3) {
            File[] fileArray = this.b;
            if (fileArray != null && n3 >= 0 && n3 < fileArray.length) {
                return fileArray[n3];
            }
            return null;
        }

        public long getItemId(int n3) {
            return n3;
        }

        public View getView(int n3, View object, ViewGroup object2) {
            View view = object;
            if (object == null) {
                view = d.g(2131099666, object2, false);
            }
            if ((object2 = this.getItem(n3)) instanceof File) {
                TextView textView = (TextView)view.findViewById(2131034424);
                object = new StringBuilder();
                ((StringBuilder)object).append(".../");
                ((StringBuilder)object).append(((File)object2).getName());
                textView.setText((CharSequence)((StringBuilder)object).toString());
            }
            return view;
        }

        class a
        extends Filter {
            final android.ext.EditTextPath$a a;

            a(android.ext.EditTextPath$a a4) {
                this.a = a4;
            }

            private String a(CharSequence charSequence) {
                charSequence = charSequence != null && charSequence.length() != 0 ? charSequence.toString() : "/";
                return charSequence;
            }

            protected Filter.FilterResults performFiltering(CharSequence object) {
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (object != null) {
                    String[] stringArray;
                    object = this.a((CharSequence)object);
                    Object object2 = new File((String)object);
                    boolean bl = ((String)object).endsWith("/");
                    object = bl ? object2 : object2.getParentFile();
                    object2 = bl ? "" : object2.getName();
                    object2 = object2.toLowerCase(Locale.US);
                    if (((File)object).exists() && (stringArray = PathSelector.d((File)object)) != null && stringArray.length > 0) {
                        object = PathSelector.e(this.a.c.a, (File)object, stringArray, (String)object2, true);
                        int n3 = ((ArrayList)object).size();
                        int n4 = 0;
                        int n5 = n3;
                        if (n3 == 1) {
                            n5 = n3;
                            if (((PathSelector.d)((ArrayList)object).get((int)0)).b.equals(object2)) {
                                n5 = 0;
                            }
                        }
                        if (n5 > 0) {
                            object2 = new File[n5];
                            while (n4 < n5) {
                                object2[n4] = ((PathSelector.d)((ArrayList)object).get((int)n4)).a;
                                ++n4;
                            }
                            filterResults.values = object2;
                            filterResults.count = n5;
                        }
                    }
                }
                return filterResults;
            }

            protected void publishResults(CharSequence object, Filter.FilterResults filterResults) {
                android.ext.EditTextPath$a a4 = this.a;
                object = filterResults != null && (object = filterResults.values) instanceof File[] ? (File[])object : null;
                android.ext.EditTextPath$a.a(a4, object);
                this.a.notifyDataSetChanged();
            }
        }
    }
}

