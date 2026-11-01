package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPath extends android.widget.AutoCompleteTextView implements android.ext.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f116b;

    class a extends android.widget.BaseAdapter implements android.widget.Filterable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.io.File[] f118b = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.widget.Filter f117a = new android.ext.EditTextPath.a.C0004a();

        /* JADX INFO: renamed from: android.ext.EditTextPath$a$a, reason: collision with other inner class name */
        class C0004a extends android.widget.Filter {
            C0004a() {
            }

            private java.lang.String a(java.lang.CharSequence charSequence) {
                return (charSequence == null || charSequence.length() == 0) ? "/" : charSequence.toString();
            }

            @Override // android.widget.Filter
            protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
                java.lang.String[] strArrD;
                android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
                if (charSequence != null) {
                    java.lang.String strA = a(charSequence);
                    java.io.File file = new java.io.File(strA);
                    boolean zEndsWith = strA.endsWith("/");
                    java.io.File parentFile = zEndsWith ? file : file.getParentFile();
                    java.lang.String lowerCase = (zEndsWith ? "" : file.getName()).toLowerCase(java.util.Locale.US);
                    if (parentFile.exists() && (strArrD = android.ext.PathSelector.d(parentFile)) != null && strArrD.length > 0) {
                        java.util.ArrayList arrayListE = android.ext.PathSelector.e(android.ext.EditTextPath.this.f115a, parentFile, strArrD, lowerCase, true);
                        int size = arrayListE.size();
                        if (size == 1 && ((android.ext.PathSelector.d) arrayListE.get(0)).f336b.equals(lowerCase)) {
                            size = 0;
                        }
                        if (size > 0) {
                            java.io.File[] fileArr = new java.io.File[size];
                            for (int i = 0; i < size; i++) {
                                fileArr[i] = ((android.ext.PathSelector.d) arrayListE.get(i)).f335a;
                            }
                            filterResults.values = fileArr;
                            filterResults.count = size;
                        }
                    }
                }
                return filterResults;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x000e  */
            @Override // android.widget.Filter
            protected void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
                java.io.File[] fileArr;
                android.ext.EditTextPath.a aVar = android.ext.EditTextPath.a.this;
                if (filterResults != null) {
                    java.lang.Object obj = filterResults.values;
                    if (obj instanceof java.io.File[]) {
                        fileArr = (java.io.File[]) obj;
                    } else {
                        fileArr = null;
                    }
                } else {
                    fileArr = null;
                }
                aVar.f118b = fileArr;
                android.ext.EditTextPath.a.this.notifyDataSetChanged();
            }
        }

        public a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            java.io.File[] fileArr = this.f118b;
            if (fileArr == null) {
                return 0;
            }
            return fileArr.length;
        }

        @Override // android.widget.Filterable
        public android.widget.Filter getFilter() {
            return this.f117a;
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int i) {
            java.io.File[] fileArr = this.f118b;
            if (fileArr == null || i < 0 || i >= fileArr.length) {
                return null;
            }
            return fileArr[i];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            if (view == null) {
                view = gga.d.g(catch_.me_.if_.you_.can_.R.layout.path_suggestion, viewGroup, false);
            }
            java.lang.Object item = getItem(i);
            if (item instanceof java.io.File) {
                ((android.widget.TextView) view.findViewById(catch_.me_.if_.you_.can_.R.id.text1)).setText(".../" + ((java.io.File) item).getName());
            }
            return view;
        }
    }

    public EditTextPath(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f115a = 0;
        this.f116b = -1;
        setAdapter(new android.ext.EditTextPath.a());
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
        if (!isInEditMode()) {
            android.ext.EditText.a(this);
        }
        setInputType(getInputType() | 262144);
        setHorizontallyScrolling(false);
        setMaxLines(Integer.MAX_VALUE);
    }

    @Override // android.view.View
    public void dispatchWindowFocusChanged(boolean z) {
        try {
            super.dispatchWindowFocusChanged(z);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        try {
            super.drawableStateChanged();
        } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
            android.ext.e1.a(e2);
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

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        try {
            super.invalidateDrawable(drawable);
        } catch (java.lang.NoSuchFieldError e2) {
            android.ext.e1.a(e2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent dragEvent) {
        try {
            return super.onDragEvent(dragEvent);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NullPointerException e2) {
            android.ext.e1.a(e2);
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        try {
            int imeOptions = super.getImeOptions();
            if ((imeOptions & 1912602624) != 1912602624) {
                super.setImeOptions(imeOptions | 1912602624);
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
        try {
            super.onFocusChanged(z, i, rect);
        } catch (java.lang.Throwable th2) {
            android.ext.e1.a(th2);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        try {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        } catch (java.lang.NullPointerException e2) {
            android.ext.e1.a(e2);
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
        boolean zIsPopupShowing = isPopupShowing();
        if (i == 66 && zIsPopupShowing) {
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView, android.view.View
    public boolean onKeyShortcut(int i, android.view.KeyEvent keyEvent) {
        try {
            return super.onKeyShortcut(i, keyEvent);
        } catch (java.lang.NullPointerException e2) {
            android.ext.e1.a(e2);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            android.ext.n0.h(java.lang.Thread.currentThread(), th, false);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        try {
            return super.onTextContextMenuItem(i);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            return false;
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            return false;
        }
    }

    @Override // android.view.View
    public void playSoundEffect(int i) {
        try {
            super.playSoundEffect(i);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        try {
            super.refreshDrawableState();
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        try {
            super.sendAccessibilityEvent(i);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        try {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } catch (java.lang.StringIndexOutOfBoundsException e2) {
            android.ext.e1.a(e2);
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
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
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
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (java.lang.NullPointerException | java.lang.SecurityException e2) {
            android.ext.e1.a(e2);
        }
    }
}
