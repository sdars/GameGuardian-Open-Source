package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class InternalKeyboard extends a.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.ref.WeakReference f189g;
    private boolean h;
    private int i;

    class a implements android.inputmethodservice.KeyboardView.OnKeyboardActionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.InternalKeyboard f190a;

        a(android.ext.InternalKeyboard r1) {
                r0 = this;
                r0.f190a = r1
                r0.<init>()
                return
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void onKey(int r2, int[] r3) {
                r1 = this;
                android.ext.InternalKeyboard r0 = r1.f190a
                r0.l(r2, r3)
                return
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void onPress(int r1) {
                r0 = this;
                return
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void onRelease(int r1) {
                r0 = this;
                return
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void onText(java.lang.CharSequence r1) {
                r0 = this;
                return
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void swipeDown() {
                r0 = this;
                return
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void swipeLeft() {
                r0 = this;
                return
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void swipeRight() {
                r0 = this;
                return
        }

        @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
        public void swipeUp() {
                r0 = this;
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.inputmethodservice.Keyboard f191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.InternalKeyboard f192b;

        b(android.ext.InternalKeyboard r1, android.inputmethodservice.Keyboard r2) {
                r0 = this;
                r0.f192b = r1
                r0.f191a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.InternalKeyboard r0 = r2.f192b
                android.inputmethodservice.Keyboard r1 = r2.f191a
                r0.setKeyboard(r1)
                return
        }
    }

    class c implements android.view.View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f194b;

        c(int r1) {
                r0 = this;
                r0.f194b = r1
                r0.<init>()
                r1 = -1
                r0.f193a = r1
                return
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r3, boolean r4) {
                r2 = this;
                int r0 = android.ext.Config.B
                r0 = r0 & 1
                if (r0 != 0) goto L7
                return
            L7:
                android.view.View r3 = r3.getRootView()
                r0 = 2131034303(0x7f0500bf, float:1.767912E38)
                android.view.View r3 = r3.findViewById(r0)
                android.ext.InternalKeyboard r3 = (android.ext.InternalKeyboard) r3
                if (r3 == 0) goto L30
                int r0 = r2.f193a
                r1 = -1
                if (r0 != r1) goto L21
                int r0 = r3.getFlags()
                r2.f193a = r0
            L21:
                int r0 = r2.f193a
                if (r4 == 0) goto L28
                int r4 = r2.f194b
                goto L29
            L28:
                r4 = 0
            L29:
                r4 = r4 | r0
                r3.setFlags(r4)
                r3.t()
            L30:
                return
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f195a;

        public d(int r1) {
                r0 = this;
                r0.<init>()
                r0.f195a = r1
                return
        }
    }

    public static abstract class e implements android.view.View.OnFocusChangeListener {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        protected abstract boolean a(android.view.View r1, boolean r2);

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r3, boolean r4) {
                r2 = this;
                int r0 = android.ext.Config.B
                r0 = r0 & 1
                if (r0 != 0) goto L7
                return
            L7:
                android.view.View r0 = r3.getRootView()
                r1 = 2131034303(0x7f0500bf, float:1.767912E38)
                android.view.View r0 = r0.findViewById(r1)
                android.ext.InternalKeyboard r0 = (android.ext.InternalKeyboard) r0
                if (r0 == 0) goto L26
                boolean r1 = r2.a(r3, r4)
                if (r1 == 0) goto L1d
                goto L1e
            L1d:
                r4 = 0
            L1e:
                r0.h(r3, r4)
                if (r1 != 0) goto L26
                android.ext.Tools.S0(r3)
            L26:
                return
        }
    }

    public InternalKeyboard(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r4 = 1
            r2.f186d = r4
            r4 = 0
            r2.f187e = r4
            r2.f188f = r4
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.f189g = r0
            r2.h = r4
            r4 = -1
            r2.i = r4
            r2.f(r3)
            return
    }

    public static boolean a() {
            r0 = 2131099654(0x7f060006, float:1.7811667E38)
            r1 = 0
            r2 = 0
            android.view.View r0 = a.d.f(r0, r1)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto Lc
            goto L14
        Lc:
            r2 = 1
            goto L14
        Le:
            r0 = move-exception
            java.lang.String r1 = "Check internal keyboard fail"
            android.ext.e1.l(r1, r0)
        L14:
            return r2
    }

    private void b(android.view.Window r5, boolean r6) {
            r4 = this;
            android.view.WindowManager$LayoutParams r0 = r5.getAttributes()
            android.view.View r1 = r5.getDecorView()
            int r2 = r1.getWidth()
            r3 = -2
            r1.measure(r3, r3)     // Catch: java.lang.Throwable -> L19
            int r1 = r1.getMeasuredWidth()     // Catch: java.lang.Throwable -> L19
            int r2 = java.lang.Math.max(r2, r1)     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r1 = move-exception
            android.ext.e1.a(r1)
        L1d:
            if (r6 == 0) goto L34
            int r6 = r4.getWidth()
            r4.measure(r3, r3)     // Catch: java.lang.Throwable -> L2f
            int r1 = r4.getMeasuredWidth()     // Catch: java.lang.Throwable -> L2f
            int r6 = java.lang.Math.max(r6, r1)     // Catch: java.lang.Throwable -> L2f
            goto L38
        L2f:
            r6 = move-exception
            android.ext.e1.a(r6)
            goto L39
        L34:
            int r6 = android.ext.Tools.H()
        L38:
            int r2 = r2 + r6
        L39:
            r0.width = r2
            android.content.Context r6 = android.ext.MainService.context
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.widthPixels
            if (r2 < r6) goto L4c
            r6 = -1
            r0.width = r6
        L4c:
            r5.setAttributes(r0)
            return
    }

    private int c(boolean r1, boolean r2, boolean r3, boolean r4) {
            r0 = this;
            if (r1 == 0) goto L18
            if (r2 == 0) goto L8
            r1 = 2131034298(0x7f0500ba, float:1.767911E38)
            goto L1b
        L8:
            if (r3 == 0) goto Le
            r1 = 2131034297(0x7f0500b9, float:1.7679108E38)
            goto L1b
        Le:
            if (r4 == 0) goto L14
            r1 = 2131034300(0x7f0500bc, float:1.7679114E38)
            goto L1b
        L14:
            r1 = 2131034299(0x7f0500bb, float:1.7679112E38)
            goto L1b
        L18:
            r1 = 2131034296(0x7f0500b8, float:1.7679106E38)
        L1b:
            return r1
    }

    public static android.view.View d(android.view.View r1) {
            r0 = 1
            android.view.View r1 = e(r1, r0)
            return r1
    }

    public static android.view.View e(android.view.View r3, boolean r4) {
            boolean r0 = a()
            if (r0 == 0) goto L47
            r0 = 2131099654(0x7f060006, float:1.7811667E38)
            r1 = 0
            android.view.View r0 = a.d.f(r0, r1)
            android.ext.KeyboardLayout r0 = (android.ext.KeyboardLayout) r0
            boolean r1 = r3 instanceof android.widget.ScrollView
            if (r1 == 0) goto L18
            r1 = 2131034301(0x7f0500bd, float:1.7679116E38)
            goto L1b
        L18:
            r1 = 2131034302(0x7f0500be, float:1.7679118E38)
        L1b:
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r3)
            r2 = 0
            r1.setVisibility(r2)
            r1 = 2131034303(0x7f0500bf, float:1.767912E38)
            android.view.View r1 = r0.findViewById(r1)
            android.ext.InternalKeyboard r1 = (android.ext.InternalKeyboard) r1
            r1.setAllowUseInternal(r4)
            java.lang.Object r3 = r3.getTag()
            boolean r4 = r3 instanceof android.ext.InternalKeyboard.d
            if (r4 == 0) goto L43
            android.ext.InternalKeyboard$d r3 = (android.ext.InternalKeyboard.d) r3
            int r3 = r3.f195a
            r1.setFlags(r3)
        L43:
            r0.c()
            return r0
        L47:
            return r3
    }

    private void f(android.content.Context r2) {
            r1 = this;
            r2 = 0
            r1.f184b = r2
            r1.f185c = r2
            boolean r0 = r1.isInEditMode()
            if (r0 == 0) goto Lc
            return
        Lc:
            r1.setPreviewEnabled(r2)     // Catch: java.lang.Throwable -> L18
            android.ext.InternalKeyboard$a r2 = new android.ext.InternalKeyboard$a     // Catch: java.lang.Throwable -> L18
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L18
            r1.setOnKeyboardActionListener(r2)     // Catch: java.lang.Throwable -> L18
            goto L1e
        L18:
            r2 = move-exception
            java.lang.String r0 = "Failed init internal keyboard"
            android.ext.e1.l(r0, r2)
        L1e:
            return
    }

    private android.view.Window getWindow() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.f189g
            java.lang.Object r0 = r0.get()
            android.view.Window r0 = (android.view.Window) r0
            return r0
    }

    public static void i(android.view.View r2, boolean r3) {
            android.view.View r0 = r2.getRootView()
            r1 = 2131034303(0x7f0500bf, float:1.767912E38)
            android.view.View r0 = r0.findViewById(r1)
            android.ext.InternalKeyboard r0 = (android.ext.InternalKeyboard) r0
            if (r0 == 0) goto L17
            r0.h(r2, r3)
            if (r3 != 0) goto L17
            android.ext.Tools.S0(r2)
        L17:
            return
    }

    private void m(android.inputmethodservice.Keyboard.Key r3) {
            r2 = this;
            int r0 = r2.f188f
            r0 = r0 & 1
            if (r0 == 0) goto L15
            java.lang.CharSequence r0 = r3.label
            java.lang.String r1 = ":"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
            java.lang.String r0 = "?"
            r2.n(r3, r0)
        L15:
            int r0 = r2.f188f
            r0 = r0 & 2
            if (r0 == 0) goto L2a
            java.lang.CharSequence r0 = r3.label
            java.lang.String r1 = ";"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2a
            java.lang.String r0 = "*"
            r2.n(r3, r0)
        L2a:
            int r0 = r2.f188f
            r0 = r0 & 4
            if (r0 == 0) goto L3f
            java.lang.CharSequence r0 = r3.label
            java.lang.String r1 = "~"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3f
            java.lang.String r0 = "^"
            r2.n(r3, r0)
        L3f:
            int r0 = r2.f188f
            r0 = r0 & 8
            if (r0 == 0) goto L54
            java.lang.CharSequence r0 = r3.label
            java.lang.String r1 = "r"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L54
            java.lang.String r0 = "$"
            r2.n(r3, r0)
        L54:
            return
    }

    private void n(android.inputmethodservice.Keyboard.Key r2, java.lang.String r3) {
            r1 = this;
            r2.label = r3
            int[] r0 = r2.codes
            if (r0 != 0) goto Lb
            r0 = 1
            int[] r0 = new int[r0]
            r2.codes = r0
        Lb:
            int[] r2 = r2.codes
            r0 = 0
            char r3 = r3.charAt(r0)
            r2[r0] = r3
            return
    }

    public static void o(android.view.View r1, int r2) {
            android.ext.InternalKeyboard$c r0 = new android.ext.InternalKeyboard$c
            r0.<init>(r2)
            android.ext.Tools.z1(r1, r0)
            return
    }

    private void p() {
            r1 = this;
            boolean r0 = r1.f185c
            r0 = r0 ^ 1
            r1.f185c = r0
            r1.r()
            return
    }

    private void q() {
            r1 = this;
            boolean r0 = r1.f184b
            r0 = r0 ^ 1
            r1.f184b = r0
            r1.r()
            return
    }

    private void r() {
            r2 = this;
            boolean r0 = r2.f186d
            if (r0 == 0) goto Lb
            int r0 = android.ext.Config.B
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r2.setKeyboard(r1)
            return
    }

    private void s() {
            r2 = this;
            int r0 = android.ext.Config.B
            r0 = r0 & 64
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r1 = 2131034176(0x7f050040, float:1.7678862E38)
            android.ext.Config$p r1 = android.ext.Config.b(r1)
            r1.f42d = r0
            android.ext.Config.k()
            r2.r()
            return
    }

    private void setKeyboard(boolean r10) {
            r9 = this;
            boolean r0 = r9.f184b
            boolean r1 = r9.f185c
            int r2 = android.ext.Config.B
            r2 = r2 & 64
            r3 = 1
            r4 = 0
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            boolean r5 = r9.f187e
            if (r5 == 0) goto L16
            r5 = 2131427328(0x7f0b0000, float:1.847627E38)
            goto L19
        L16:
            r5 = 2131427329(0x7f0b0001, float:1.8476271E38)
        L19:
            android.inputmethodservice.Keyboard r6 = new android.inputmethodservice.Keyboard
            android.content.Context r7 = android.ext.MainService.context
            int r8 = r9.c(r10, r0, r1, r2)
            r6.<init>(r7, r5, r8)
            boolean r7 = r9.f187e
            if (r7 != 0) goto L70
            if (r0 == 0) goto L40
            java.util.List r7 = r6.getKeys()
            int r7 = r7.size()
            if (r7 != 0) goto L40
            android.inputmethodservice.Keyboard r6 = new android.inputmethodservice.Keyboard
            android.content.Context r0 = android.ext.MainService.context
            int r7 = r9.c(r10, r4, r1, r2)
            r6.<init>(r0, r5, r7)
            r0 = 0
        L40:
            if (r1 == 0) goto L59
            java.util.List r7 = r6.getKeys()
            int r7 = r7.size()
            if (r7 != 0) goto L59
            android.inputmethodservice.Keyboard r1 = new android.inputmethodservice.Keyboard
            android.content.Context r6 = android.ext.MainService.context
            int r7 = r9.c(r10, r0, r4, r2)
            r1.<init>(r6, r5, r7)
            r6 = r1
            r1 = 0
        L59:
            if (r2 == 0) goto L70
            java.util.List r2 = r6.getKeys()
            int r2 = r2.size()
            if (r2 != 0) goto L70
            android.inputmethodservice.Keyboard r6 = new android.inputmethodservice.Keyboard
            android.content.Context r2 = android.ext.MainService.context
            int r10 = r9.c(r10, r0, r1, r4)
            r6.<init>(r2, r5, r10)
        L70:
            android.util.SparseIntArray r10 = new android.util.SparseIntArray
            r10.<init>()
            java.util.List r0 = r6.getKeys()
            java.util.Iterator r0 = r0.iterator()
        L7d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r0.next()
            android.inputmethodservice.Keyboard$Key r2 = (android.inputmethodservice.Keyboard.Key) r2
            if (r2 != 0) goto L8c
            goto L7d
        L8c:
            int r5 = r2.y
            int r7 = r10.get(r5, r4)
            int r7 = r7 + r3
            r10.put(r5, r7)
            if (r1 != 0) goto L9b
            r9.m(r2)
        L9b:
            int[] r5 = r2.codes
            if (r5 == 0) goto L7d
            int r7 = r5.length
            if (r7 != 0) goto La3
            goto L7d
        La3:
            r5 = r5[r4]
            r7 = 5002(0x138a, float:7.009E-42)
            if (r5 != r7) goto Lad
            java.lang.String r7 = android.ext.t1.f1251a
            r2.label = r7
        Lad:
            r7 = 5003(0x138b, float:7.01E-42)
            if (r5 != r7) goto L7d
            char r5 = android.ext.t1.f1252b
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r2.label = r5
            goto L7d
        Lba:
            android.content.Context r0 = r9.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            if (r1 == 0) goto L145
            int r2 = r10.size()
            if (r2 <= 0) goto L145
            r2 = 2130903043(0x7f030003, float:1.7412893E38)
            float r2 = r0.getDimension(r2)
            int r3 = r10.valueAt(r4)
            float r3 = (float) r3
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            r1.width = r2
            r2 = 2130903042(0x7f030002, float:1.741289E38)
            float r0 = r0.getDimension(r2)
            int r2 = r10.size()
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            r1.height = r0
            r9.setLayoutParams(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Kbd: "
            r0.append(r2)
            int r2 = r10.valueAt(r4)
            r0.append(r2)
            java.lang.String r2 = " x "
            r0.append(r2)
            int r10 = r10.size()
            r0.append(r10)
            java.lang.String r10 = "; "
            r0.append(r10)
            int r2 = r1.width
            r0.append(r2)
            r2 = 120(0x78, float:1.68E-43)
            r0.append(r2)
            int r1 = r1.height
            r0.append(r1)
            r0.append(r10)
            int r10 = r6.getMinWidth()
            r0.append(r10)
            r0.append(r2)
            int r10 = r6.getHeight()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            android.ext.e1.d(r10)
        L145:
            boolean r10 = r9.h
            if (r10 == 0) goto L152
            android.ext.InternalKeyboard$b r10 = new android.ext.InternalKeyboard$b
            r10.<init>(r9, r6)
            r9.post(r10)
            goto L155
        L152:
            r9.setKeyboard(r6)
        L155:
            return
    }

    public void g(android.view.Window r3) {
            r2 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f189g = r0
            boolean r0 = r2.f186d
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 == 0) goto L17
            int r0 = android.ext.Config.B
            r0 = r0 & 1
            if (r0 == 0) goto L17
            r3.addFlags(r1)
            goto L1a
        L17:
            r3.clearFlags(r1)
        L1a:
            r2.r()
            android.view.View r0 = r3.getDecorView()
            android.view.Window$Callback r3 = r3.getCallback()
            boolean r1 = r3 instanceof android.ext.g3
            if (r1 == 0) goto L35
            int r0 = r0.getWidth()
            if (r0 != 0) goto L35
            android.ext.g3 r3 = (android.ext.g3) r3
            r3.a(r2)
            goto L38
        L35:
            r2.j()
        L38:
            return
    }

    public int getFlags() {
            r1 = this;
            int r0 = r1.f188f
            return r0
    }

    public void h(android.view.View r3, boolean r4) {
            r2 = this;
            if (r3 == 0) goto L2d
            android.view.Window r0 = r2.getWindow()     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            android.ext.Tools.L(r0, r3, r4)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r3 = move-exception
            goto L19
        Le:
            if (r4 == 0) goto L15
            r3 = 0
            r2.setKeyboard(r3)     // Catch: java.lang.Throwable -> Lc
            goto L2d
        L15:
            r2.r()     // Catch: java.lang.Throwable -> Lc
            goto L2d
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed show/hide kbd: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.ext.e1.l(r4, r3)
        L2d:
            return
    }

    public void j() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            if (r0 != 0) goto L7
            return
        L7:
            android.content.Context r1 = android.ext.MainService.context
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            int r2 = r3.i
            if (r2 == r1) goto L21
            r3.i = r1
            r2 = 1
            if (r1 == r2) goto L1d
            goto L1e
        L1d:
            r2 = 0
        L1e:
            r3.b(r0, r2)
        L21:
            return
    }

    void k(int r12) {
            r11 = this;
            android.view.Window r0 = r11.getWindow()
            if (r0 != 0) goto L7
            return
        L7:
            android.view.View r0 = r0.getCurrentFocus()
            boolean r1 = r0 instanceof android.widget.EditText
            if (r1 != 0) goto L10
            return
        L10:
            android.widget.EditText r0 = (android.widget.EditText) r0
            int r1 = r0.getSelectionStart()
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r3 = r0.getSelectionEnd()
            int r3 = java.lang.Math.max(r3, r2)
            r4 = 5000(0x1388, float:7.006E-42)
            if (r12 >= r4) goto L2f
            char r12 = (char) r12
        L28:
            java.lang.String r12 = java.lang.String.valueOf(r12)
        L2c:
            r8 = r12
        L2d:
            r12 = 0
            goto L75
        L2f:
            r4 = 0
            switch(r12) {
                case 5000: goto L72;
                case 5001: goto L6f;
                case 5002: goto L6c;
                case 5003: goto L69;
                case 5004: goto L48;
                case 5005: goto L48;
                case 5006: goto L44;
                case 5007: goto L40;
                case 5008: goto L3c;
                case 5009: goto L38;
                case 5010: goto L34;
                default: goto L33;
            }
        L33:
            goto L5e
        L34:
            r11.p()
            goto L5e
        L38:
            r11.s()
            goto L5e
        L3c:
            android.ext.Tools.o1(r0)
            goto L5e
        L40:
            android.ext.y0.i(r0)
            goto L5e
        L44:
            r11.q()
            goto L5e
        L48:
            r5 = 5004(0x138c, float:7.012E-42)
            if (r1 != r3) goto L60
            if (r1 != 0) goto L50
            if (r12 == r5) goto L5e
        L50:
            android.text.Editable r6 = r0.getText()
            int r6 = r6.length()
            if (r1 != r6) goto L60
            r6 = 5005(0x138d, float:7.013E-42)
            if (r12 != r6) goto L60
        L5e:
            r8 = r4
            goto L2d
        L60:
            if (r12 != r5) goto L65
            r12 = 21
            goto L67
        L65:
            r12 = 22
        L67:
            r8 = r4
            goto L75
        L69:
            char r12 = android.ext.t1.f1252b
            goto L28
        L6c:
            java.lang.String r12 = android.ext.t1.f1251a
            goto L2c
        L6f:
            r12 = 112(0x70, float:1.57E-43)
            goto L67
        L72:
            r12 = 67
            goto L67
        L75:
            if (r8 == 0) goto L9a
            android.text.Editable r5 = r0.getText()
            int r6 = java.lang.Math.min(r1, r3)
            int r7 = java.lang.Math.max(r1, r3)
            r9 = 0
            int r10 = r8.length()
            r5.replace(r6, r7, r8, r9, r10)
            int r1 = r0.getSelectionStart()
            int r3 = r0.getSelectionEnd()
            int r1 = java.lang.Math.max(r1, r3)
            r0.setSelection(r1)
        L9a:
            if (r12 == 0) goto Lb4
            android.view.KeyEvent r1 = new android.view.KeyEvent     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r2, r12)     // Catch: java.lang.Throwable -> Lae
            r0.dispatchKeyEvent(r1)     // Catch: java.lang.Throwable -> Lae
            android.view.KeyEvent r1 = new android.view.KeyEvent     // Catch: java.lang.Throwable -> Lae
            r2 = 1
            r1.<init>(r2, r12)     // Catch: java.lang.Throwable -> Lae
            r0.dispatchKeyEvent(r1)     // Catch: java.lang.Throwable -> Lae
            goto Lb4
        Lae:
            r12 = move-exception
            java.lang.String r0 = "Failed send key to app"
            android.ext.e1.l(r0, r12)
        Lb4:
            return
    }

    void l(int r1, int[] r2) {
            r0 = this;
            r2 = 1
            r0.h = r2
            r2 = 0
            r0.k(r1)     // Catch: java.lang.Throwable -> La
            r0.h = r2
            return
        La:
            r1 = move-exception
            r0.h = r2
            throw r1
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

    public void setAllowUseInternal(boolean r1) {
            r0 = this;
            r0.f186d = r1
            return
    }

    public void setFlags(int r1) {
            r0 = this;
            r0.f188f = r1
            return
    }

    public void setHideKeyboard(boolean r2) {
            r1 = this;
            boolean r0 = r1.f187e
            r1.f187e = r2
            if (r0 == r2) goto L9
            r1.r()
        L9:
            return
    }

    public void t() {
            r0 = this;
            r0.r()
            r0.j()
            return
    }
}
