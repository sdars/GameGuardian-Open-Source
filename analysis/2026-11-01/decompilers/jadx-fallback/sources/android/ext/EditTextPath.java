package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class EditTextPath extends android.widget.AutoCompleteTextView implements android.ext.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f116b;

    class a extends android.widget.BaseAdapter implements android.widget.Filterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.widget.Filter f117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.io.File[] f118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextPath f119c;

        /* JADX INFO: renamed from: android.ext.EditTextPath$a$a, reason: collision with other inner class name */
        class C0004a extends android.widget.Filter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.EditTextPath.a f120a;

            C0004a(android.ext.EditTextPath.a r1) {
                    r0 = this;
                    r0.f120a = r1
                    r0.<init>()
                    return
            }

            private java.lang.String a(java.lang.CharSequence r2) {
                    r1 = this;
                    if (r2 == 0) goto Le
                    int r0 = r2.length()
                    if (r0 != 0) goto L9
                    goto Le
                L9:
                    java.lang.String r2 = r2.toString()
                    goto L10
                Le:
                    java.lang.String r2 = "/"
                L10:
                    return r2
            }

            @Override // android.widget.Filter
            protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r6) {
                    r5 = this;
                    android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
                    r0.<init>()
                    if (r6 == 0) goto L76
                    java.lang.String r6 = r5.a(r6)
                    java.io.File r1 = new java.io.File
                    r1.<init>(r6)
                    java.lang.String r2 = "/"
                    boolean r6 = r6.endsWith(r2)
                    if (r6 == 0) goto L1a
                    r2 = r1
                    goto L1e
                L1a:
                    java.io.File r2 = r1.getParentFile()
                L1e:
                    if (r6 == 0) goto L23
                    java.lang.String r6 = ""
                    goto L27
                L23:
                    java.lang.String r6 = r1.getName()
                L27:
                    java.util.Locale r1 = java.util.Locale.US
                    java.lang.String r6 = r6.toLowerCase(r1)
                    boolean r1 = r2.exists()
                    if (r1 == 0) goto L76
                    java.lang.String[] r1 = android.ext.PathSelector.d(r2)
                    if (r1 == 0) goto L76
                    int r3 = r1.length
                    if (r3 <= 0) goto L76
                    android.ext.EditTextPath$a r3 = r5.f120a
                    android.ext.EditTextPath r3 = r3.f119c
                    int r3 = android.ext.EditTextPath.a(r3)
                    r4 = 1
                    java.util.ArrayList r1 = android.ext.PathSelector.e(r3, r2, r1, r6, r4)
                    int r2 = r1.size()
                    r3 = 0
                    if (r2 != r4) goto L5f
                    java.lang.Object r4 = r1.get(r3)
                    android.ext.PathSelector$d r4 = (android.ext.PathSelector.d) r4
                    java.lang.String r4 = r4.f336b
                    boolean r6 = r4.equals(r6)
                    if (r6 == 0) goto L5f
                    r2 = 0
                L5f:
                    if (r2 <= 0) goto L76
                    java.io.File[] r6 = new java.io.File[r2]
                L63:
                    if (r3 >= r2) goto L72
                    java.lang.Object r4 = r1.get(r3)
                    android.ext.PathSelector$d r4 = (android.ext.PathSelector.d) r4
                    java.io.File r4 = r4.f335a
                    r6[r3] = r4
                    int r3 = r3 + 1
                    goto L63
                L72:
                    r0.values = r6
                    r0.count = r2
                L76:
                    return r0
            }

            @Override // android.widget.Filter
            protected void publishResults(java.lang.CharSequence r2, android.widget.Filter.FilterResults r3) {
                    r1 = this;
                    android.ext.EditTextPath$a r2 = r1.f120a
                    if (r3 == 0) goto Le
                    java.lang.Object r3 = r3.values
                    boolean r0 = r3 instanceof java.io.File[]
                    if (r0 != 0) goto Lb
                    goto Le
                Lb:
                    java.io.File[] r3 = (java.io.File[]) r3
                    goto Lf
                Le:
                    r3 = 0
                Lf:
                    android.ext.EditTextPath.a.a(r2, r3)
                    android.ext.EditTextPath$a r2 = r1.f120a
                    r2.notifyDataSetChanged()
                    return
            }
        }

        public a(android.ext.EditTextPath r1) {
                r0 = this;
                r0.f119c = r1
                r0.<init>()
                r1 = 0
                r0.f118b = r1
                android.ext.EditTextPath$a$a r1 = new android.ext.EditTextPath$a$a
                r1.<init>(r0)
                r0.f117a = r1
                return
        }

        static /* synthetic */ java.io.File[] a(android.ext.EditTextPath.a r0, java.io.File[] r1) {
                r0.f118b = r1
                return r1
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                java.io.File[] r0 = r1.f118b
                if (r0 != 0) goto L6
                r0 = 0
                goto L7
            L6:
                int r0 = r0.length
            L7:
                return r0
        }

        @Override // android.widget.Filterable
        public android.widget.Filter getFilter() {
                r1 = this;
                android.widget.Filter r0 = r1.f117a
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r3) {
                r2 = this;
                java.io.File[] r0 = r2.f118b
                if (r0 == 0) goto Ld
                if (r3 < 0) goto Ld
                int r1 = r0.length
                if (r3 < r1) goto La
                goto Ld
            La:
                r3 = r0[r3]
                return r3
            Ld:
                r3 = 0
                return r3
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
                r2 = this;
                if (r4 != 0) goto La
                r4 = 2131099666(0x7f060012, float:1.7811692E38)
                r0 = 0
                android.view.View r4 = a.d.g(r4, r5, r0)
            La:
                java.lang.Object r3 = r2.getItem(r3)
                boolean r5 = r3 instanceof java.io.File
                if (r5 == 0) goto L35
                r5 = 2131034424(0x7f050138, float:1.7679365E38)
                android.view.View r5 = r4.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = ".../"
                r0.append(r1)
                java.io.File r3 = (java.io.File) r3
                java.lang.String r3 = r3.getName()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r5.setText(r3)
            L35:
                return r4
        }
    }

    public EditTextPath(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r3 = 0
            r2.f115a = r3
            r4 = -1
            r2.f116b = r4
            android.ext.EditTextPath$a r4 = new android.ext.EditTextPath$a
            r4.<init>(r2)
            r2.setAdapter(r4)
            boolean r4 = r2.isInEditMode()
            r0 = 1
            if (r4 != 0) goto L26
            int r4 = android.ext.Config.B
            r4 = r4 & 8
            if (r4 == 0) goto L20
            r4 = 1
            goto L23
        L20:
            r4 = 524289(0x80001, float:7.34685E-40)
        L23:
            r2.setInputType(r4)
        L26:
            r2.setSingleLine(r0)
            r2.setSelectAllOnFocus(r0)
            r4 = 10
            r2.setMinEms(r4)
            r2.setCursorVisible(r0)
            r2.setFocusableInTouchMode(r0)
            java.lang.Class<android.widget.TextView> r4 = android.widget.TextView.class
            java.lang.String r1 = "mCursorDrawableRes"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r1)     // Catch: java.lang.Exception -> L4a
            r4.setAccessible(r0)     // Catch: java.lang.Exception -> L4a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L4a
            r4.set(r2, r0)     // Catch: java.lang.Exception -> L4a
            goto L4b
        L4a:
        L4b:
            boolean r4 = r2.isInEditMode()
            if (r4 != 0) goto L54
            android.ext.EditText.a(r2)
        L54:
            int r4 = r2.getInputType()
            r0 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 | r0
            r2.setInputType(r4)
            r2.setHorizontallyScrolling(r3)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.setMaxLines(r3)
            return
    }

    static /* synthetic */ int a(android.ext.EditTextPath r0) {
            int r0 = r0.f115a
            return r0
    }

    @Override // android.view.View
    public void dispatchWindowFocusChanged(boolean r1) {
            r0 = this;
            super.dispatchWindowFocusChanged(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.ext.k0
    public int getDataType() {
            r1 = this;
            int r0 = r1.f116b
            return r0
    }

    public int getPathType() {
            r1 = this;
            int r0 = r1.f115a
            return r0
    }

    public boolean getSecClipboardEnabled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.invalidateDrawable(r1)     // Catch: java.lang.NoSuchFieldError -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent r1) {
            r0 = this;
            boolean r1 = super.onDragEvent(r1)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4 java.lang.NullPointerException -> L9
            goto Lb
        L4:
            r1 = move-exception
        L5:
            android.ext.e1.a(r1)
            goto Lb
        L9:
            r1 = move-exception
            goto L5
        Lb:
            return
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean r4, int r5, android.graphics.Rect r6) {
            r3 = this;
            int r0 = super.getImeOptions()     // Catch: java.lang.Throwable -> Lf
            r1 = 1912602624(0x72000000, float:2.5353012E30)
            r2 = r0 & r1
            if (r2 == r1) goto L13
            r0 = r0 | r1
            super.setImeOptions(r0)     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r0 = move-exception
            android.ext.e1.a(r0)
        L13:
            super.onFocusChanged(r4, r5, r6)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r4 = move-exception
            android.ext.e1.a(r4)
        L1b:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)     // Catch: java.lang.NullPointerException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
            r2 = this;
            boolean r0 = r2.isPopupShowing()
            r1 = 66
            if (r3 != r1) goto Lc
            if (r0 == 0) goto Lc
            r3 = 1
            goto L10
        Lc:
            boolean r3 = super.onKeyPreIme(r3, r4)
        L10:
            return r3
    }

    @Override // android.widget.EditText, android.widget.TextView, android.view.View
    public boolean onKeyShortcut(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super.onKeyShortcut(r1, r2)     // Catch: java.lang.NullPointerException -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L4
            goto L10
        L4:
            r2 = move-exception
            android.ext.e1.a(r2)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r0 = 0
            android.ext.n0.h(r3, r2, r0)
        L10:
            return
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int r1) {
            r0 = this;
            boolean r1 = super.onTextContextMenuItem(r1)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onTouchEvent(r1)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean performLongClick() {
            r1 = this;
            boolean r0 = super.performLongClick()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public void playSoundEffect(int r1) {
            r0 = this;
            super.playSoundEffect(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.view.View
    public void refreshDrawableState() {
            r1 = this;
            super.refreshDrawableState()     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int r1) {
            r0 = this;
            super.sendAccessibilityEvent(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.ext.k0
    public void setDataType(int r1) {
            r0 = this;
            r0.f116b = r1
            return
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean r1) {
            r0 = this;
            r1 = 0
            super.setHorizontallyScrolling(r1)
            return
    }

    @Override // android.widget.TextView
    public void setImeOptions(int r2) {
            r1 = this;
            r0 = 1912602624(0x72000000, float:2.5353012E30)
            r2 = r2 | r0
            super.setImeOptions(r2)     // Catch: java.lang.Throwable -> L7
            goto Lb
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
        Lb:
            return
    }

    @Override // android.widget.TextView
    public void setMaxLines(int r1) {
            r0 = this;
            r1 = 2147483647(0x7fffffff, float:NaN)
            super.setMaxLines(r1)
            return
    }

    public void setPathType(int r1) {
            r0 = this;
            r0.f115a = r1
            return
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(java.lang.CharSequence r1, android.widget.TextView.BufferType r2) {
            r0 = this;
            super.setText(r1, r2)     // Catch: java.lang.NullPointerException -> L4 java.lang.SecurityException -> L6
            goto La
        L4:
            r1 = move-exception
            goto L7
        L6:
            r1 = move-exception
        L7:
            android.ext.e1.a(r1)
        La:
            return
    }
}
