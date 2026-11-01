package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class Config {
    public static volatile int A;
    public static volatile int B;
    public static volatile boolean C;
    public static volatile boolean D;
    public static volatile java.lang.String E;
    public static volatile java.lang.String F;
    public static volatile byte G;
    static a.e H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile int[] f28a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f29b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile long f30c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile long f31d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile long f32e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile long f33f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile int f34g;
    public static volatile int h;
    public static volatile int i;
    public static volatile long j;
    public static volatile int k;
    public static volatile int l;
    public static volatile int m;
    public static volatile int n;
    public static volatile int o;
    public static volatile int p;
    public static volatile int q;
    public static volatile int r;
    public static volatile long s;
    public static volatile int t;
    public static volatile int u;
    public static volatile int v;
    public static volatile boolean vSpaceReal;
    public static volatile int w;
    public static volatile int x;
    public static volatile int y;
    public static volatile int z;

    public static class OptionMultiChoice extends android.ext.Config.s implements android.content.DialogInterface.OnMultiChoiceClickListener, android.content.DialogInterface.OnShowListener, android.widget.AbsListView.OnScrollListener {
        boolean[] n;

        public OptionMultiChoice(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public OptionMultiChoice(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6, int r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.h = r7
                return
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface r5, int r6) {
                r4 = this;
                r0 = 0
                r1 = -1
                if (r6 == r1) goto L9
                r2 = -3
                if (r6 != r2) goto L8
                goto L9
            L8:
                return r0
            L9:
                boolean[] r2 = r4.n
                int r3 = r4.f40b
                if (r2 == 0) goto L28
                if (r6 != r1) goto L28
            L11:
                int r6 = r2.length
                if (r0 >= r6) goto L25
                int r6 = r4.h(r0)
                boolean r1 = r2[r0]
                if (r1 == 0) goto L1f
                r6 = r6 | r3
            L1d:
                r3 = r6
                goto L22
            L1f:
                int r6 = ~r6
                r6 = r6 & r3
                goto L1d
            L22:
                int r0 = r0 + 1
                goto L11
            L25:
                r6 = 0
                r4.n = r6
            L28:
                r4.f42d = r3
                android.ext.Config.k()
                android.ext.Tools.D(r5)
                r5 = 1
                return r5
        }

        @Override // android.ext.Config.s
        protected void j(java.lang.CharSequence[] r7) {
                r6 = this;
                int r0 = r7.length
                boolean[] r0 = new boolean[r0]
                r6.n = r0
                int r1 = r6.f42d
                r2 = 0
                r3 = 0
            L9:
                int r4 = r7.length
                if (r3 >= r4) goto L1c
                int r4 = r6.h(r3)
                r5 = r1 & r4
                if (r5 != r4) goto L16
                r4 = 1
                goto L17
            L16:
                r4 = 0
            L17:
                r0[r3] = r4
                int r3 = r3 + 1
                goto L9
            L1c:
                android.content.Context r1 = android.ext.Tools.k0()
                android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
                int r2 = r6.f39a
                int r3 = r6.h
                boolean r4 = r6.f45g
                android.view.View r2 = android.ext.Config.c(r2, r3, r4)
                android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)
                android.app.AlertDialog$Builder r7 = r1.setMultiChoiceItems(r7, r0, r6)
                r0 = 2131296917(0x7f090295, float:1.8211764E38)
                android.app.AlertDialog$Builder r7 = r7.setPositiveButton(r0, r6)
                r0 = 2131296898(0x7f090282, float:1.8211726E38)
                android.app.AlertDialog$Builder r7 = r7.setNeutralButton(r0, r6)
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                android.app.AlertDialog$Builder r7 = r7.setNegativeButton(r0, r6)
                android.app.AlertDialog r7 = r7.create()
                android.ext.f.l(r7, r6)
                android.ext.f.m(r7)
                return
        }

        protected void l(boolean r14) {
                r13 = this;
                int[] r0 = r13.m
                if (r0 != 0) goto L100
                r0 = 3
                if (r14 == 0) goto L9
                r1 = 6
                goto La
            L9:
                r1 = 3
            La:
                int[] r2 = new int[r1]
                java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
                r3 = 2131296772(0x7f090204, float:1.821147E38)
                r4 = 2131296921(0x7f090299, float:1.8211772E38)
                r5 = 4
                r6 = 2131296942(0x7f0902ae, float:1.8211815E38)
                r7 = 2
                r8 = 1
                r9 = 0
                if (r14 == 0) goto Le1
                r2[r9] = r8
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r10 = android.ext.b2.f(r6)
                r14.append(r10)
                java.lang.String r10 = ", "
                r14.append(r10)
                r11 = 2131296861(0x7f09025d, float:1.821165E38)
                java.lang.String r12 = android.ext.b2.f(r11)
                r14.append(r12)
                java.lang.String r14 = r14.toString()
                r1[r9] = r14
                r2[r8] = r7
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r6 = android.ext.b2.f(r6)
                r14.append(r6)
                r14.append(r10)
                r6 = 2131296731(0x7f0901db, float:1.8211387E38)
                java.lang.String r9 = android.ext.b2.f(r6)
                r14.append(r9)
                java.lang.String r14 = r14.toString()
                r1[r8] = r14
                r2[r7] = r5
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r8 = android.ext.b2.f(r4)
                r14.append(r8)
                r14.append(r10)
                java.lang.String r8 = android.ext.b2.f(r11)
                r14.append(r8)
                java.lang.String r14 = r14.toString()
                r1[r7] = r14
                r14 = 8
                r2[r0] = r14
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r4 = android.ext.b2.f(r4)
                r14.append(r4)
                r14.append(r10)
                java.lang.String r4 = android.ext.b2.f(r6)
                r14.append(r4)
                java.lang.String r14 = r14.toString()
                r1[r0] = r14
                r14 = 16
                r2[r5] = r14
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r0 = android.ext.b2.f(r3)
                r14.append(r0)
                r14.append(r10)
                java.lang.String r0 = android.ext.b2.f(r11)
                r14.append(r0)
                java.lang.String r14 = r14.toString()
                r1[r5] = r14
                r14 = 32
                r0 = 5
                r2[r0] = r14
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r3 = android.ext.b2.f(r3)
                r14.append(r3)
                r14.append(r10)
                java.lang.String r3 = android.ext.b2.f(r6)
                r14.append(r3)
                java.lang.String r14 = r14.toString()
                r1[r0] = r14
                goto Lf9
            Le1:
                r2[r9] = r8
                java.lang.String r14 = android.ext.b2.f(r6)
                r1[r9] = r14
                r2[r8] = r7
                java.lang.String r14 = android.ext.b2.f(r4)
                r1[r8] = r14
                r2[r7] = r5
                java.lang.String r14 = android.ext.b2.f(r3)
                r1[r7] = r14
            Lf9:
                r13.m = r2
                r13.l = r1
                r14 = 0
                r13.k = r14
            L100:
                return
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(android.content.DialogInterface r2, int r3, boolean r4) {
                r1 = this;
                boolean[] r2 = r1.n
                java.lang.String r0 = ""
                if (r2 != 0) goto L13
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                android.ext.e1.l(r0, r2)
                return
            L13:
                r2[r3] = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
                goto L1a
            L16:
                r2 = move-exception
                android.ext.e1.l(r0, r2)
            L1a:
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                r2 = 0
                r0.onScrollStateChanged(r1, r2)
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r4, int r5) {
                r3 = this;
                int r5 = r4.getChildCount()     // Catch: java.lang.Throwable -> L15
                r0 = 0
            L5:
                if (r0 >= r5) goto L1d
                android.view.View r1 = r4.getChildAt(r0)     // Catch: java.lang.Throwable -> L15 java.lang.ArrayIndexOutOfBoundsException -> L17
                boolean r2 = r1 instanceof android.widget.CheckedTextView     // Catch: java.lang.Throwable -> L15 java.lang.ArrayIndexOutOfBoundsException -> L17
                if (r2 == 0) goto L17
                android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: java.lang.Throwable -> L15 java.lang.ArrayIndexOutOfBoundsException -> L17
                r1.refreshDrawableState()     // Catch: java.lang.Throwable -> L15 java.lang.ArrayIndexOutOfBoundsException -> L17
                goto L17
            L15:
                r4 = move-exception
                goto L1a
            L17:
                int r0 = r0 + 1
                goto L5
            L1a:
                android.ext.e1.a(r4)
            L1d:
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L15
                boolean r0 = r3 instanceof android.app.AlertDialog
                if (r0 == 0) goto L15
                android.app.AlertDialog r3 = (android.app.AlertDialog) r3
                android.widget.ListView r3 = r3.getListView()
                if (r3 == 0) goto L15
                r3.setOnScrollListener(r2)
            L15:
                return
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public java.lang.String toString() {
                r1 = this;
                int r0 = r1.f39a
                java.lang.String r0 = android.ext.Tools.N1(r0)
                return r0
        }
    }

    public static class OptionMultiChoiceSh extends android.ext.Config.OptionMultiChoice {
        private final int o;

        public OptionMultiChoiceSh(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6, int r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.o = r7
                return
        }

        @Override // android.ext.Config.OptionMultiChoice, android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface r1, int r2) {
                r0 = this;
                boolean r1 = super.e(r1, r2)
                if (r1 == 0) goto Lc
                r2 = 2131296795(0x7f09021b, float:1.8211517E38)
                android.ext.Tools.H1(r2)
            Lc:
                return r1
        }

        @Override // android.ext.Config.s
        protected void i() {
                r6 = this;
                super.i()
                int[] r0 = r6.m
                if (r0 != 0) goto L25
                int r0 = r6.o
                int[] r1 = new int[r0]
                java.lang.CharSequence[] r2 = new java.lang.CharSequence[r0]
                r3 = 0
            Le:
                if (r3 >= r0) goto L1e
                r4 = 1
                int r4 = r4 << r3
                r1[r3] = r4
                int r4 = r3 + 1
                java.lang.String r5 = java.lang.Integer.toString(r4)
                r2[r3] = r5
                r3 = r4
                goto Le
            L1e:
                r6.m = r1
                r6.l = r2
                r0 = 0
                r6.k = r0
            L25:
                return
        }
    }

    public static class OptionSeek extends android.ext.Config.p implements android.widget.SeekBar.OnSeekBarChangeListener {
        int k;
        protected java.lang.ref.WeakReference l;

        public OptionSeek(int r7, int r8, int r9, int r10, java.lang.String r11, boolean r12) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
                r8 = 0
                r7.<init>(r8)
                r6.l = r7
                r6.k = r9
                return
        }

        public OptionSeek(int r1, int r2, int r3, int r4, java.lang.String r5, boolean r6, int r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.h = r7
                return
        }

        @Override // android.ext.Config.p
        public void b() {
                r0 = this;
                r0.h()
                return
        }

        @Override // android.ext.Config.p
        public boolean e(android.content.DialogInterface r1, int r2) {
                r0 = this;
                java.lang.ref.WeakReference r1 = r0.l
                java.lang.Object r1 = r1.get()
                android.widget.SeekBar r1 = (android.widget.SeekBar) r1
                if (r1 != 0) goto Lc
                r1 = 0
                return r1
            Lc:
                int r1 = r1.getProgress()
                r0.f42d = r1
                android.ext.Config.k()
                r1 = 1
                return r1
        }

        protected void h() {
                r6 = this;
                r0 = 2131099663(0x7f06000f, float:1.7811686E38)
                r1 = 0
                android.view.View r0 = a.d.f(r0, r1)
                r2 = 2131034400(0x7f050120, float:1.7679316E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.SeekBar r2 = (android.widget.SeekBar) r2
                int r3 = r6.k
                r2.setMax(r3)
                int r3 = r6.f42d
                r2.setProgress(r3)
                r2.setOnSeekBarChangeListener(r6)
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
                r3.<init>(r2)
                r6.l = r3
                android.app.AlertDialog$Builder r2 = android.ext.f.b()
                int r3 = r6.f39a
                int r4 = r6.h
                boolean r5 = r6.f45g
                android.view.View r3 = android.ext.Config.c(r3, r4, r5)
                android.app.AlertDialog$Builder r2 = r2.setCustomTitle(r3)
                android.app.AlertDialog$Builder r0 = r2.setView(r0)
                r2 = 2131296836(0x7f090244, float:1.82116E38)
                android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r6)
                r2 = 2131296311(0x7f090037, float:1.8210535E38)
                android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
                android.app.AlertDialog r0 = r0.create()
                android.ext.f.m(r0)
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r1, int r2, boolean r3) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }

        @Override // android.ext.Config.p
        public java.lang.String toString() {
                r1 = this;
                int r0 = r1.f39a
                java.lang.String r0 = android.ext.Tools.N1(r0)
                return r0
        }
    }

    class a extends android.ext.Config.OptionMultiChoice {
        private java.lang.CharSequence[] o;
        private java.lang.CharSequence[] p;
        private int[] q;

        a(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // android.ext.Config.p
        public java.lang.CharSequence a() {
                r5 = this;
                int[] r0 = r5.m
                if (r0 != 0) goto L7
                r5.i()
            L7:
                int[] r0 = r5.m
                int r0 = r0.length
                int r0 = r0 * 2
                java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
                r1 = 0
                r2 = 0
            L10:
                int[] r3 = r5.m
                int r4 = r3.length
                if (r1 >= r4) goto L31
                r3 = r3[r1]
                int r4 = r5.f42d
                r4 = r4 & r3
                if (r4 != r3) goto L2e
                if (r2 <= 0) goto L25
                int r3 = r2 + 1
                java.lang.String r4 = ","
                r0[r2] = r4
                r2 = r3
            L25:
                int r3 = r2 + 1
                java.lang.CharSequence[] r4 = r5.o
                r4 = r4[r1]
                r0[r2] = r4
                r2 = r3
            L2e:
                int r1 = r1 + 1
                goto L10
            L31:
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
                java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
                java.lang.CharSequence r0 = android.ext.Tools.x(r0)
                return r0
        }

        @Override // android.ext.Config.p
        protected void d() {
                r1 = this;
                r0 = 262207(0x4003f, float:3.6743E-40)
                r1.f40b = r0
                return
        }

        @Override // android.ext.Config.OptionMultiChoice, android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface r3, int r4) {
                r2 = this;
                boolean r3 = super.e(r3, r4)
                if (r3 == 0) goto L1f
                android.ext.MainService r4 = android.ext.MainService.instance
                android.ext.c2 r4 = r4.f216f
                if (r4 == 0) goto L1f
                java.lang.String r0 = "gg.setRanges("
                r4.write(r0)
                android.ext.Script$Consts r0 = r4.f697c
                android.ext.Script$Const[] r0 = r0.f371a
                int r1 = r2.f42d
                android.ext.Script.Consts.a(r4, r0, r1)
                java.lang.String r0 = ")\n"
                r4.write(r0)
            L1f:
                return r3
        }

        @Override // android.ext.Config.s
        protected void i() {
                r11 = this;
                super.i()
                int[] r0 = r11.m
                r1 = 0
                if (r0 != 0) goto L183
                r0 = 15
                int[] r2 = new int[r0]
                int[] r3 = new int[r0]
                java.lang.CharSequence[] r4 = new java.lang.CharSequence[r0]
                r5 = 2
                r2[r1] = r5
                r6 = 2130837527(0x7f020017, float:1.728001E38)
                int r7 = android.ext.Tools.d0(r6)
                r3[r1] = r7
                java.lang.String r8 = "Jh: Java heap"
                java.lang.CharSequence r7 = android.ext.Tools.t(r8, r7)
                r4[r1] = r7
                r7 = 1
                r2[r7] = r7
                int r8 = android.ext.Tools.d0(r6)
                r3[r7] = r8
                java.lang.String r9 = "Ch: C++ heap"
                java.lang.CharSequence r8 = android.ext.Tools.t(r9, r8)
                r4[r7] = r8
                r7 = 4
                r2[r5] = r7
                int r8 = android.ext.Tools.d0(r6)
                r3[r5] = r8
                java.lang.String r9 = "Ca: C++ alloc"
                java.lang.CharSequence r8 = android.ext.Tools.t(r9, r8)
                r4[r5] = r8
                r5 = 3
                r8 = 8
                r2[r5] = r8
                int r9 = android.ext.Tools.d0(r6)
                r3[r5] = r9
                java.lang.String r10 = "Cd: C++ .data"
                java.lang.CharSequence r9 = android.ext.Tools.t(r10, r9)
                r4[r5] = r9
                r5 = 16
                r2[r7] = r5
                int r5 = android.ext.Tools.d0(r6)
                r3[r7] = r5
                java.lang.String r9 = "Cb: C++ .bss"
                java.lang.CharSequence r5 = android.ext.Tools.t(r9, r5)
                r4[r7] = r5
                r5 = 262144(0x40000, float:3.67342E-40)
                r7 = 5
                r2[r7] = r5
                int r5 = android.ext.Tools.d0(r6)
                r3[r7] = r5
                java.lang.String r9 = "PS: PPSSPP"
                java.lang.CharSequence r5 = android.ext.Tools.t(r9, r5)
                r4[r7] = r5
                r5 = 32
                r7 = 6
                r2[r7] = r5
                int r5 = android.ext.Tools.d0(r6)
                r3[r7] = r5
                java.lang.String r6 = "A: Anonymous"
                java.lang.CharSequence r5 = android.ext.Tools.t(r6, r5)
                r4[r7] = r5
                r5 = 65536(0x10000, float:9.1835E-41)
                r6 = 7
                r2[r6] = r5
                r5 = 2130837528(0x7f020018, float:1.7280013E38)
                int r7 = android.ext.Tools.d0(r5)
                r3[r6] = r7
                java.lang.String r9 = "J: Java"
                java.lang.CharSequence r7 = android.ext.Tools.t(r9, r7)
                r4[r6] = r7
                r6 = 64
                r2[r8] = r6
                int r6 = android.ext.Tools.d0(r5)
                r3[r8] = r6
                java.lang.String r7 = "S: Stack"
                java.lang.CharSequence r6 = android.ext.Tools.t(r7, r6)
                r4[r8] = r6
                r6 = 524288(0x80000, float:7.34684E-40)
                r7 = 9
                r2[r7] = r6
                int r6 = android.ext.Tools.d0(r5)
                r3[r7] = r6
                java.lang.String r8 = "As: Ashmem"
                java.lang.CharSequence r6 = android.ext.Tools.t(r8, r6)
                r4[r7] = r6
                r6 = 1048576(0x100000, float:1.469368E-39)
                r7 = 10
                r2[r7] = r6
                int r5 = android.ext.Tools.d0(r5)
                r3[r7] = r5
                java.lang.String r6 = "V: Video"
                java.lang.CharSequence r5 = android.ext.Tools.t(r6, r5)
                r4[r7] = r5
                r5 = -2080896(0xffffffffffe03f80, float:NaN)
                r6 = 11
                r2[r6] = r5
                r5 = 2130837529(0x7f020019, float:1.7280015E38)
                int r5 = android.ext.Tools.d0(r5)
                r3[r6] = r5
                java.lang.String r5 = "O: Other (__slow__)"
                java.lang.String r5 = android.ext.b2.g(r5)
                r7 = r3[r6]
                java.lang.CharSequence r5 = android.ext.Tools.t(r5, r7)
                r4[r6] = r5
                r5 = 131072(0x20000, float:1.83671E-40)
                r6 = 12
                r2[r6] = r5
                r5 = 2130837525(0x7f020015, float:1.7280007E38)
                int r5 = android.ext.Tools.d0(r5)
                r3[r6] = r5
                java.lang.String r5 = "B: Bad (__dangerous__)"
                java.lang.String r5 = android.ext.b2.g(r5)
                r7 = r3[r6]
                java.lang.CharSequence r5 = android.ext.Tools.t(r5, r7)
                r4[r6] = r5
                r5 = 16384(0x4000, float:2.2959E-41)
                r6 = 13
                r2[r6] = r5
                r5 = 2130837526(0x7f020016, float:1.7280009E38)
                int r5 = android.ext.Tools.d0(r5)
                r3[r6] = r5
                java.lang.String r5 = "Xa: Code app (__dangerous__)"
                java.lang.String r5 = android.ext.b2.g(r5)
                r7 = r3[r6]
                java.lang.CharSequence r5 = android.ext.Tools.t(r5, r7)
                r4[r6] = r5
                r5 = 32768(0x8000, float:4.5918E-41)
                r6 = 14
                r2[r6] = r5
                r5 = 2130837530(0x7f02001a, float:1.7280017E38)
                int r5 = android.ext.Tools.d0(r5)
                r3[r6] = r5
                java.lang.String r5 = "Xs: Code system (__dangerous__)"
                java.lang.String r5 = android.ext.b2.g(r5)
                r7 = r3[r6]
                java.lang.CharSequence r5 = android.ext.Tools.t(r5, r7)
                r4[r6] = r5
                java.lang.CharSequence[] r5 = new java.lang.CharSequence[r0]
                r6 = 0
            L15a:
                if (r6 >= r0) goto L175
                r7 = r4[r6]
                java.lang.String r7 = r7.toString()
                java.lang.String r8 = ":"
                java.lang.String[] r7 = r7.split(r8)
                r7 = r7[r1]
                r8 = r3[r6]
                java.lang.CharSequence r7 = android.ext.Tools.t(r7, r8)
                r5[r6] = r7
                int r6 = r6 + 1
                goto L15a
            L175:
                r11.q = r3
                r11.m = r2
                r11.p = r4
                r11.o = r5
                r0 = 0
                r11.k = r0
                android.ext.RegionList.k(r2, r5, r3)
            L183:
                int[] r0 = r11.m
                int r0 = r0.length
                java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
                java.lang.CharSequence[] r2 = r11.p
                android.content.Context r3 = android.ext.Tools.f0()
                r4 = 0
            L18f:
                int r5 = r2.length
                if (r4 >= r5) goto L1d2
                r5 = r2[r4]
                java.lang.String r5 = r5.toString()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ba
                r6.<init>()     // Catch: java.lang.Throwable -> L1ba
                r6.append(r5)     // Catch: java.lang.Throwable -> L1ba
                java.lang.String r7 = " ["
                r6.append(r7)     // Catch: java.lang.Throwable -> L1ba
                long r7 = android.ext.RegionList.d(r4)     // Catch: java.lang.Throwable -> L1ba
                java.lang.String r7 = android.ext.Tools.U(r3, r7)     // Catch: java.lang.Throwable -> L1ba
                r6.append(r7)     // Catch: java.lang.Throwable -> L1ba
                r7 = 93
                r6.append(r7)     // Catch: java.lang.Throwable -> L1ba
                java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L1ba
                goto L1c5
            L1ba:
                r6 = move-exception
                android.ext.e1.a(r6)
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                android.ext.n0.h(r7, r6, r1)
            L1c5:
                int[] r6 = r11.q
                r6 = r6[r4]
                java.lang.CharSequence r5 = android.ext.Tools.t(r5, r6)
                r0[r4] = r5
                int r4 = r4 + 1
                goto L18f
            L1d2:
                r11.l = r0
                return
        }
    }

    class b extends android.ext.Config.OptionMultiChoice {
        b(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // android.ext.Config.s
        protected void i() {
                r1 = this;
                super.i()
                r0 = 1
                r1.l(r0)
                return
        }
    }

    class c extends android.ext.Config.OptionMultiChoice {

        class a implements android.ext.Config.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.Config.c f35a;

            a(android.ext.Config.c r1) {
                    r0 = this;
                    r0.f35a = r1
                    r0.<init>()
                    return
            }

            @Override // android.ext.Config.p.b
            public void a(int r1) {
                    r0 = this;
                    android.ext.MainService r1 = android.ext.MainService.instance
                    r1.e0()
                    return
            }
        }

        c(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6, int r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        @Override // android.ext.Config.s
        protected void i() {
                r1 = this;
                super.i()
                android.ext.Config$p$b r0 = r1.j
                if (r0 != 0) goto Le
                android.ext.Config$c$a r0 = new android.ext.Config$c$a
                r0.<init>(r1)
                r1.j = r0
            Le:
                r0 = 1
                r1.l(r0)
                return
        }
    }

    class d extends android.ext.Config.OptionMultiChoice {
        d(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // android.ext.Config.s
        protected void i() {
                r1 = this;
                super.i()
                r0 = 0
                r1.l(r0)
                return
        }
    }

    class e extends android.ext.Config.OptionMultiChoice {

        class a implements android.ext.Config.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.Config.e f36a;

            a(android.ext.Config.e r1) {
                    r0 = this;
                    r0.f36a = r1
                    r0.<init>()
                    return
            }

            @Override // android.ext.Config.p.b
            public void a(int r4) {
                    r3 = this;
                    r0 = r4 & 1
                    r1 = 0
                    if (r0 == 0) goto L15
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r2 = 2131296675(0x7f0901a3, float:1.8211273E38)
                    java.lang.String r2 = android.ext.b2.f(r2)
                    r0.append(r2)
                    goto L16
                L15:
                    r0 = r1
                L16:
                    r4 = r4 & 8
                    if (r4 == 0) goto L31
                    if (r0 != 0) goto L22
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    goto L27
                L22:
                    java.lang.String r4 = "\n\n"
                    r0.append(r4)
                L27:
                    r4 = 2131296676(0x7f0901a4, float:1.8211275E38)
                    java.lang.String r4 = android.ext.b2.f(r4)
                    r0.append(r4)
                L31:
                    if (r0 == 0) goto L49
                    android.app.AlertDialog$Builder r4 = android.ext.f.b()
                    java.lang.String r0 = r0.toString()
                    android.app.AlertDialog$Builder r4 = r4.setMessage(r0)
                    r0 = 2131296836(0x7f090244, float:1.82116E38)
                    android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r0, r1)
                    android.ext.f.o(r4)
                L49:
                    return
            }
        }

        e(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // android.ext.Config.s
        protected void i() {
                r7 = this;
                super.i()
                int[] r0 = r7.m
                if (r0 != 0) goto L8d
                r0 = 4
                int[] r1 = new int[r0]
                java.lang.CharSequence[] r2 = new java.lang.CharSequence[r0]
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = " ("
                r3.append(r4)
                r4 = 2131296967(0x7f0902c7, float:1.8211866E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                r3.append(r4)
                r4 = 41
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r4 = 0
                r5 = 1
                r1[r4] = r5
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r3)
                java.lang.String r6 = r6.toString()
                r2[r4] = r6
                r4 = 2
                r1[r5] = r4
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                r6.append(r3)
                java.lang.String r6 = r6.toString()
                r2[r5] = r6
                r1[r4] = r0
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r6 = 3
                r5.append(r6)
                r5.append(r3)
                java.lang.String r5 = r5.toString()
                r2[r4] = r5
                r4 = 8
                r1[r6] = r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                r4.append(r3)
                java.lang.String r0 = r4.toString()
                r2[r6] = r0
                r7.m = r1
                r7.l = r2
                r0 = 0
                r7.k = r0
                android.ext.Config$p$b r0 = r7.j
                if (r0 != 0) goto L8d
                android.ext.Config$e$a r0 = new android.ext.Config$e$a
                r0.<init>(r7)
                r7.j = r0
            L8d:
                return
        }
    }

    class f extends android.ext.Config.q {
        f(int r1, int r2, int r3, int r4, long r5, int r7, java.lang.String r8, boolean r9, boolean r10, boolean r11, int r12) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
                r1 = 1
                r0.f43e = r1
                return
        }
    }

    class g extends android.ext.Config.OptionSeek {
        private java.lang.ref.WeakReference m;

        g(int r1, int r2, int r3, int r4, java.lang.String r5, boolean r6, int r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r2 = 0
                r1.<init>(r2)
                r0.m = r1
                return
        }

        @Override // android.ext.Config.OptionSeek
        protected void h() {
                r3 = this;
                super.h()
                java.lang.ref.WeakReference r0 = r3.l
                java.lang.Object r0 = r0.get()
                android.widget.SeekBar r0 = (android.widget.SeekBar) r0
                if (r0 != 0) goto Le
                return
            Le:
                android.widget.ImageView r1 = new android.widget.ImageView
                android.content.Context r2 = r0.getContext()
                r1.<init>(r2)
                r2 = 2130968655(0x7f04004f, float:1.754597E38)
                r1.setImageResource(r2)
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r1)
                r3.m = r2
                int r2 = r0.getProgress()
                int r2 = android.ext.Config.e(r2)
                android.ext.Config.n(r1, r2)
                android.view.ViewParent r0 = r0.getParent()
                boolean r2 = r0 instanceof android.view.ViewGroup
                if (r2 == 0) goto L3c
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r0.addView(r1)
            L3c:
                return
        }

        @Override // android.ext.Config.OptionSeek, android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r1, int r2, boolean r3) {
                r0 = this;
                java.lang.ref.WeakReference r1 = r0.m
                java.lang.Object r1 = r1.get()
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                if (r1 != 0) goto Lb
                return
            Lb:
                int r2 = android.ext.Config.e(r2)
                android.ext.Config.n(r1, r2)
                return
        }
    }

    class h extends android.ext.Config.s {
        h(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public void b() {
                r1 = this;
                boolean r0 = android.ext.f1.y()
                if (r0 != 0) goto L7
                return
            L7:
                super.b()
                return
        }
    }

    class i extends android.ext.Config.s {
        i(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6, int r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface r3, int r4) {
                r2 = this;
                boolean r3 = super.e(r3, r4)
                if (r3 == 0) goto L29
                int r4 = r2.f42d
                r0 = 3
                if (r4 != r0) goto L29
                android.content.Context r4 = android.ext.Tools.f0()
                android.app.AlertDialog$Builder r4 = android.ext.f.c(r4)
                r0 = 2131296586(0x7f09014a, float:1.8211093E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r4 = r4.setMessage(r0)
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                r1 = 0
                android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r0, r1)
                android.ext.f.o(r4)
            L29:
                return r3
        }
    }

    class j extends android.ext.Config.s {
        j(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface r1, int r2) {
                r0 = this;
                boolean r1 = super.e(r1, r2)
                if (r1 == 0) goto Ld
                android.ext.MainService r2 = android.ext.MainService.instance
                android.ext.HotPoint r2 = r2.j
                r2.z()
            Ld:
                return r1
        }
    }

    class k extends android.ext.Config.s {
        k(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        private java.lang.String l(java.lang.String r7) {
                r6 = this;
                int r0 = r7.length()     // Catch: java.lang.Throwable -> L12
                if (r0 != 0) goto L14
                java.util.Locale r0 = android.ext.k.c()     // Catch: java.lang.Throwable -> L12
                r1 = 2131296372(0x7f090074, float:1.8210659E38)
                java.lang.String r7 = android.ext.Tools.N1(r1)     // Catch: java.lang.Throwable -> L12
                goto L18
            L12:
                r0 = move-exception
                goto L50
            L14:
                java.util.Locale r0 = android.ext.k.d(r7)     // Catch: java.lang.Throwable -> L12
            L18:
                java.lang.String r1 = ""
                java.lang.String r2 = "\n[%,.1f | %.2e]"
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3c
                r4 = -4570230032013721600(0xc093480000000000, double:-1234.0)
                java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L3c
                r5 = 0
                r3[r5] = r4     // Catch: java.lang.Throwable -> L3c
                r4 = -5773362413281678717(0xafe0e57944c0ea83, double:-4.56E-78)
                java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L3c
                r5 = 1
                r3[r5] = r4     // Catch: java.lang.Throwable -> L3c
                java.lang.String r1 = java.lang.String.format(r0, r2, r3)     // Catch: java.lang.Throwable -> L3c
                goto L40
            L3c:
                r0 = move-exception
                android.ext.e1.a(r0)     // Catch: java.lang.Throwable -> L12
            L40:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
                r0.<init>()     // Catch: java.lang.Throwable -> L12
                r0.append(r7)     // Catch: java.lang.Throwable -> L12
                r0.append(r1)     // Catch: java.lang.Throwable -> L12
                java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L12
                return r7
            L50:
                android.ext.e1.a(r0)
                return r7
        }

        private java.lang.String[] m() {
                r4 = this;
                java.lang.String r0 = "in_ID"
                java.lang.String r1 = "ru_RU"
                java.lang.String r2 = ""
                java.lang.String r3 = "en_US"
                java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
                return r0
        }

        @Override // android.ext.Config.p
        protected void d() {
                r3 = this;
                int r0 = r3.f42d
                if (r0 > 0) goto L5
                return
            L5:
                java.lang.String[] r0 = r3.m()
                int r1 = r3.f42d
                int r2 = r0.length
                if (r1 < r2) goto Lf
                return
            Lf:
                r0 = r0[r1]
                java.util.Locale r0 = android.ext.k.d(r0)
                android.ext.k.j(r0)
                return
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface r1, int r2) {
                r0 = this;
                boolean r1 = super.e(r1, r2)
                if (r1 == 0) goto L9
                android.ext.ConfigListAdapter.m()
            L9:
                return r1
        }

        @Override // android.ext.Config.s
        protected void i() {
                r4 = this;
                super.i()
                java.lang.CharSequence[] r0 = r4.l
                if (r0 != 0) goto L1f
                java.lang.String[] r0 = r4.m()
                int r1 = r0.length
                java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
                r2 = 0
            Lf:
                int r3 = r0.length
                if (r2 >= r3) goto L1d
                r3 = r0[r2]
                java.lang.String r3 = r4.l(r3)
                r1[r2] = r3
                int r2 = r2 + 1
                goto Lf
            L1d:
                r4.l = r1
            L1f:
                return
        }
    }

    class l extends android.ext.Config.s {
        private int n;

        class a implements android.content.DialogInterface.OnShowListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.app.AlertDialog f37a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.Config.l f38b;

            a(android.ext.Config.l r1, android.app.AlertDialog r2) {
                    r0 = this;
                    r0.f38b = r1
                    r0.f37a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(android.content.DialogInterface r1) {
                    r0 = this;
                    android.app.AlertDialog r1 = r0.f37a
                    android.ext.Tools.u1(r1)
                    return
            }
        }

        l(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6, int r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r1 = 0
                r0.n = r1
                return
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public boolean e(android.content.DialogInterface r2, int r3) {
                r1 = this;
                if (r3 >= 0) goto L19
                r2 = -2
                r0 = 0
                if (r3 != r2) goto Lb
                r1.f42d = r0
                android.ext.Config.k()
            Lb:
                boolean r2 = android.ext.Config.vSpaceReal
                if (r2 == 0) goto L18
                int r2 = r1.n
                int r3 = r1.f42d
                if (r2 == r3) goto L18
                android.ext.ConfigListAdapter.m()
            L18:
                return r0
            L19:
                int r0 = r1.f42d
                r1.n = r0
                boolean r2 = super.e(r2, r3)
                if (r2 == 0) goto L6d
                r0 = 1
                if (r3 != r0) goto L60
                android.content.Context r3 = android.ext.Tools.f0()
                android.app.AlertDialog$Builder r3 = android.ext.f.c(r3)
                int r0 = r1.f39a
                android.view.View r0 = android.ext.Tools.g0(r0)
                android.app.AlertDialog$Builder r3 = r3.setCustomTitle(r0)
                int r0 = r1.h
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r3 = r3.setMessage(r0)
                r0 = 2131296917(0x7f090295, float:1.8211764E38)
                android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r0, r1)
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r1)
                android.app.AlertDialog r3 = r3.create()
                android.ext.f.m(r3)
                android.ext.Config$l$a r0 = new android.ext.Config$l$a
                r0.<init>(r1, r3)
                android.ext.f.l(r3, r0)
                goto L6d
            L60:
                boolean r3 = android.ext.Config.vSpaceReal
                if (r3 == 0) goto L6d
                int r3 = r1.n
                int r0 = r1.f42d
                if (r3 == r0) goto L6d
                android.ext.ConfigListAdapter.m()
            L6d:
                return r2
        }
    }

    class m extends android.ext.Config.s {
        m(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        private java.lang.String l(int r4) {
                r3 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r0) goto Ld
                r4 = 2131297115(0x7f09035b, float:1.8212166E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                return r4
            Ld:
                if (r4 != 0) goto L17
                r4 = 2131296805(0x7f090225, float:1.8211537E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                return r4
            L17:
                r0 = 1084227584(0x40a00000, float:5.0)
                float r4 = (float) r4
                float r4 = r4 * r0
                r0 = 1149239296(0x44800000, float:1024.0)
                float r4 = r4 / r0
                int r4 = java.lang.Math.round(r4)
                r0 = 2131296454(0x7f0900c6, float:1.8210825E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1[r2] = r4
                java.lang.String r4 = android.ext.Tools.L1(r0, r1)
                return r4
        }

        @Override // android.ext.Config.s
        protected void i() {
                r10 = this;
                super.i()
                int[] r0 = r10.m
                if (r0 != 0) goto L84
                int r0 = android.ext.Tools.E0()
                r1 = 1084227584(0x40a00000, float:5.0)
                r2 = 0
                if (r0 <= 0) goto L26
                float r0 = (float) r0
                float r0 = r0 / r1
                double r3 = (double) r0
                double r3 = java.lang.Math.log(r3)
                r5 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r5 = java.lang.Math.log(r5)
                double r3 = r3 / r5
                double r3 = java.lang.Math.floor(r3)
                int r0 = (int) r3
                int r0 = r0 + (-8)
                goto L27
            L26:
                r0 = 0
            L27:
                if (r0 > 0) goto L2a
                r0 = 7
            L2a:
                r3 = 20
                if (r0 < r3) goto L30
                r0 = 20
            L30:
                int r3 = r0 + 2
                int[] r4 = new int[r3]
                java.lang.CharSequence[] r3 = new java.lang.CharSequence[r3]
                r4[r2] = r2
                r5 = 2131296805(0x7f090225, float:1.8211537E38)
                java.lang.String r5 = android.ext.b2.f(r5)
                r3[r2] = r5
                int r5 = r0 + 1
                r6 = 2147483647(0x7fffffff, float:NaN)
                r4[r5] = r6
                r6 = 2131297115(0x7f09035b, float:1.8212166E38)
                java.lang.String r6 = android.ext.b2.f(r6)
                r3[r5] = r6
                r5 = 2131296454(0x7f0900c6, float:1.8210825E38)
                java.lang.String r5 = android.ext.b2.f(r5)
                r6 = 1
                r7 = 1
            L5a:
                if (r7 > r0) goto L7d
                int r8 = r7 + 8
                int r8 = r6 << r8
                r4[r7] = r8
                float r8 = (float) r8
                float r8 = r8 * r1
                r9 = 1149239296(0x44800000, float:1024.0)
                float r8 = r8 / r9
                int r8 = java.lang.Math.round(r8)
                java.lang.Object[] r9 = new java.lang.Object[r6]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r9[r2] = r8
                java.lang.String r8 = android.ext.Tools.L1(r5, r9)
                r3[r7] = r8
                int r7 = r7 + 1
                goto L5a
            L7d:
                r10.m = r4
                r10.l = r3
                r0 = 0
                r10.k = r0
            L84:
                return
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r2.f39a
                java.lang.String r1 = android.ext.Tools.N1(r1)
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                int r1 = r2.f42d
                java.lang.String r1 = r2.l(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    class n extends android.ext.Config.s {
        n(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public void b() {
                r1 = this;
                boolean r0 = android.ext.f1.y()
                if (r0 != 0) goto L7
                return
            L7:
                super.b()
                return
        }

        @Override // android.ext.Config.s
        protected void i() {
                r5 = this;
                super.i()
                int[] r0 = android.ext.Config.f28a
                int r0 = r0.length
                int[] r1 = r5.m
                if (r1 == 0) goto Lf
                int r1 = r1.length
                int r2 = r0 + 1
                if (r1 == r2) goto L39
            Lf:
                int r1 = r0 + 1
                int[] r2 = new int[r1]
                java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
                r3 = 0
                r2[r3] = r3
                r4 = 2131296805(0x7f090225, float:1.8211537E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                r1[r3] = r4
            L21:
                if (r3 >= r0) goto L32
                int[] r4 = android.ext.Config.f28a
                r4 = r4[r3]
                int r3 = r3 + 1
                r2[r3] = r4
                java.lang.String r4 = android.ext.Config.f(r4)
                r1[r3] = r4
                goto L21
            L32:
                r5.m = r2
                r5.l = r1
                r0 = 0
                r5.k = r0
            L39:
                return
        }

        @Override // android.ext.Config.s, android.ext.Config.p
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r2.f39a
                java.lang.String r1 = android.ext.Tools.N1(r1)
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                int r1 = r2.f42d
                java.lang.String r1 = android.ext.Config.f(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class o extends android.content.ContextWrapper {
        public o(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.String getOpPackageName() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Use 2 "
                r0.append(r1)
                java.lang.String r1 = android.ext.Config.E
                r0.append(r1)
                java.lang.String r1 = " instead of "
                r0.append(r1)
                android.content.Context r1 = r2.getBaseContext()
                java.lang.String r1 = r1.getPackageName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                java.lang.String r0 = android.ext.Config.E
                return r0
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.String getPackageName() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Use 1 "
                r0.append(r1)
                java.lang.String r1 = android.ext.Config.E
                r0.append(r1)
                java.lang.String r1 = " instead of "
                r0.append(r1)
                android.content.Context r1 = r2.getBaseContext()
                java.lang.String r1 = r1.getPackageName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                java.lang.String r0 = android.ext.Config.E
                return r0
        }
    }

    public static abstract class p implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f40b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.String f41c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f42d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f43e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f44f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f45g;
        int h;
        protected android.ext.Config.p.a i;
        protected android.ext.Config.p.b j;

        interface a {
            int a(android.content.DialogInterface r1, int r2);
        }

        interface b {
            void a(int r1);
        }

        public p(int r2, int r3, int r4, java.lang.String r5, boolean r6) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f44f = r0
                r1.f39a = r3
                r1.f40b = r4
                r1.f41c = r5
                r1.f42d = r4
                r1.f45g = r6
                r3 = -1
                r1.h = r3
                r3 = 0
                r1.i = r3
                r1.d()
                a.e r3 = android.ext.Config.H
                r3.put(r2, r1)
                return
        }

        public java.lang.CharSequence a() {
                r1 = this;
                java.lang.String r0 = r1.toString()
                return r0
        }

        public abstract void b();

        public long c() {
                r5 = this;
                int r0 = r5.f42d
                long r0 = (long) r0
                int r2 = r5.f44f
                long r2 = (long) r2
                r4 = 32
                long r2 = r2 << r4
                long r0 = r0 | r2
                return r0
        }

        protected void d() {
                r0 = this;
                return
        }

        public abstract boolean e(android.content.DialogInterface r1, int r2);

        public void f(android.ext.Config.p.a r1) {
                r0 = this;
                r0.i = r1
                return
        }

        public void g(android.ext.Config.p.b r1) {
                r0 = this;
                r0.j = r1
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                android.ext.Config$p$a r0 = r1.i
                if (r0 == 0) goto L8
                int r3 = r0.a(r2, r3)
            L8:
                boolean r2 = r1.e(r2, r3)
                if (r2 == 0) goto L17
                android.ext.Config$p$b r2 = r1.j
                if (r2 == 0) goto L17
                int r3 = r1.f42d
                r2.a(r3)
            L17:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r2.f39a
                java.lang.String r1 = android.ext.b2.f(r1)
                r0.append(r1)
                r1 = 32
                r0.append(r1)
                int r1 = r2.f42d
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class q extends android.ext.Config.p implements android.content.DialogInterface.OnShowListener, android.view.View.OnClickListener {
        int k;
        int l;
        long m;
        private java.lang.ref.WeakReference n;
        private java.lang.ref.WeakReference o;
        private boolean p;
        private boolean q;
        private int r;

        class a implements android.view.View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.Config.q f46a;

            a(android.ext.Config.q r1) {
                    r0 = this;
                    r0.f46a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r3) {
                    r2 = this;
                    android.app.AlertDialog$Builder r3 = android.ext.f.b()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    android.ext.Config$q r1 = r2.f46a
                    int r1 = r1.f39a
                    java.lang.String r1 = android.ext.b2.f(r1)
                    r0.append(r1)
                    r1 = 10
                    r0.append(r1)
                    android.ext.Config$q r1 = r2.f46a
                    int r1 = r1.h
                    java.lang.String r1 = android.ext.b2.f(r1)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.app.AlertDialog$Builder r3 = r3.setMessage(r0)
                    r0 = 2131296836(0x7f090244, float:1.82116E38)
                    java.lang.String r0 = android.ext.b2.f(r0)
                    r1 = 0
                    android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r1)
                    android.ext.f.o(r3)
                    return
            }
        }

        public q(int r7, int r8, int r9, int r10, long r11, int r13, java.lang.String r14, boolean r15) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r13
                r4 = r14
                r5 = r15
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
                r8 = 0
                r7.<init>(r8)
                r6.n = r7
                java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
                r7.<init>(r8)
                r6.o = r7
                r7 = 0
                r6.p = r7
                r7 = 1
                r6.q = r7
                r7 = 8
                r6.r = r7
                r6.k = r9
                r6.l = r10
                r6.m = r11
                return
        }

        public q(int r1, int r2, int r3, int r4, long r5, int r7, java.lang.String r8, boolean r9, int r10) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
                r0.h = r10
                return
        }

        public q(int r1, int r2, int r3, int r4, long r5, int r7, java.lang.String r8, boolean r9, boolean r10, boolean r11) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
                r0.p = r10
                r0.q = r11
                return
        }

        public q(int r1, int r2, int r3, int r4, long r5, int r7, java.lang.String r8, boolean r9, boolean r10, boolean r11, int r12) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
                r0.r = r12
                return
        }

        private java.lang.String h() {
                r1 = this;
                int r0 = r1.k
                if (r0 != 0) goto L7
                java.lang.String r0 = ""
                goto Lb
            L7:
                java.lang.String r0 = android.ext.b2.f(r0)
            Lb:
                return r0
        }

        @Override // android.ext.Config.p
        public void b() {
                r0 = this;
                r0.i()
                return
        }

        @Override // android.ext.Config.p
        public boolean e(android.content.DialogInterface r11, int r12) {
                r10 = this;
                java.lang.ref.WeakReference r11 = r10.o
                java.lang.Object r11 = r11.get()
                android.ext.EditText r11 = (android.ext.EditText) r11
                r12 = 0
                if (r11 != 0) goto Lc
                return r12
            Lc:
                android.text.Editable r0 = r11.getText()     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.String r0 = android.ext.j2.h(r0)     // Catch: java.lang.NumberFormatException -> L6e
                android.ext.t1$b r1 = android.ext.t1.x(r0)     // Catch: java.lang.NumberFormatException -> L6e
                int r2 = r10.l     // Catch: java.lang.NumberFormatException -> L6e
                long r2 = (long) r2     // Catch: java.lang.NumberFormatException -> L6e
                long r4 = r10.m     // Catch: java.lang.NumberFormatException -> L6e
                boolean r6 = r10.f43e     // Catch: java.lang.NumberFormatException -> L6e
                r7 = 1
                if (r6 != 0) goto L70
                long r8 = r1.f1261a     // Catch: java.lang.NumberFormatException -> L6e
                int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r6 < 0) goto L35
                int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r6 > 0) goto L35
                goto L70
            L35:
                java.lang.NumberFormatException r1 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L6e
                r6.<init>()     // Catch: java.lang.NumberFormatException -> L6e
                r8 = 2131296830(0x7f09023e, float:1.8211588E38)
                java.lang.String r8 = android.ext.b2.f(r8)     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.NumberFormatException -> L6e
                r9[r12] = r0     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.String r0 = android.ext.Tools.L1(r8, r9)     // Catch: java.lang.NumberFormatException -> L6e
                r6.append(r0)     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.String r0 = " [%,d, %,d]"
                r8 = 2
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L6e
                r8[r12] = r2     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L6e
                r8[r7] = r2     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.String r0 = android.ext.Tools.L1(r0, r8)     // Catch: java.lang.NumberFormatException -> L6e
                r6.append(r0)     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.String r0 = r6.toString()     // Catch: java.lang.NumberFormatException -> L6e
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L6e
                throw r1     // Catch: java.lang.NumberFormatException -> L6e
            L6e:
                r0 = move-exception
                goto L9f
            L70:
                int r2 = r10.r     // Catch: java.lang.NumberFormatException -> L6e
                android.ext.y0.b(r0, r2)     // Catch: java.lang.NumberFormatException -> L6e
                boolean r0 = r10.f43e     // Catch: java.lang.NumberFormatException -> L6e
                if (r0 == 0) goto L85
                long r0 = r1.f1261a     // Catch: java.lang.NumberFormatException -> L6e
                int r2 = (int) r0     // Catch: java.lang.NumberFormatException -> L6e
                r10.f42d = r2     // Catch: java.lang.NumberFormatException -> L6e
                r2 = 32
                long r0 = r0 >> r2
                int r1 = (int) r0     // Catch: java.lang.NumberFormatException -> L6e
                r10.f44f = r1     // Catch: java.lang.NumberFormatException -> L6e
                goto L96
            L85:
                long r0 = r1.f1261a     // Catch: java.lang.NumberFormatException -> L6e
                long r2 = r10.m     // Catch: java.lang.NumberFormatException -> L6e
                long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.NumberFormatException -> L6e
                int r1 = (int) r0     // Catch: java.lang.NumberFormatException -> L6e
                int r0 = r10.l     // Catch: java.lang.NumberFormatException -> L6e
                int r0 = java.lang.Math.max(r1, r0)     // Catch: java.lang.NumberFormatException -> L6e
                r10.f42d = r0     // Catch: java.lang.NumberFormatException -> L6e
            L96:
                android.ext.Config.k()     // Catch: java.lang.NumberFormatException -> L6e
                java.lang.ref.WeakReference r0 = r10.n     // Catch: java.lang.NumberFormatException -> L6e
                android.ext.Tools.E(r0)     // Catch: java.lang.NumberFormatException -> L6e
                return r7
            L9f:
                android.ext.j2.i(r0, r11)
                return r12
        }

        protected void i() {
                r12 = this;
                r0 = 2131099662(0x7f06000e, float:1.7811684E38)
                r1 = 0
                android.view.View r0 = a.d.f(r0, r1)
                r2 = 2131034328(0x7f0500d8, float:1.767917E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                int r3 = r12.f39a
                java.lang.String r3 = android.ext.b2.f(r3)
                r2.setText(r3)
                int r3 = r12.h
                r4 = -1
                if (r3 == r4) goto L2c
                if (r3 == 0) goto L2c
                android.ext.Tools.r1(r2)
                android.ext.Config$q$a r3 = new android.ext.Config$q$a
                r3.<init>(r12)
                r2.setOnClickListener(r3)
            L2c:
                r2 = 2131034285(0x7f0500ad, float:1.7679083E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r3 = 2131297036(0x7f09030c, float:1.8212006E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]
                boolean r8 = r12.f43e
                if (r8 == 0) goto L49
                r8 = -9223372036854775808
                goto L4c
            L49:
                int r8 = r12.l
                long r8 = (long) r8
            L4c:
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r9 = 0
                r7[r9] = r8
                java.lang.String r8 = "%,d"
                java.lang.String r7 = android.ext.Tools.L1(r8, r7)
                r5[r9] = r7
                java.lang.Object[] r7 = new java.lang.Object[r6]
                boolean r10 = r12.f43e
                if (r10 == 0) goto L67
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L69
            L67:
                long r10 = r12.m
            L69:
                java.lang.Long r10 = java.lang.Long.valueOf(r10)
                r7[r9] = r10
                java.lang.String r7 = android.ext.Tools.L1(r8, r7)
                r5[r6] = r7
                java.lang.String r3 = android.ext.Tools.L1(r3, r5)
                r2.setText(r3)
                r2 = 2131034435(0x7f050143, float:1.7679387E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r12.h()
                r2.setText(r3)
                r2 = 2131034224(0x7f050070, float:1.767896E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r5 = 2131296372(0x7f090074, float:1.8210659E38)
                java.lang.String r5 = android.ext.Tools.N1(r5)
                r3.append(r5)
                java.lang.String r5 = ": "
                r3.append(r5)
                java.lang.Object[] r5 = new java.lang.Object[r6]
                int r7 = r12.f40b
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r5[r9] = r7
                java.lang.String r5 = android.ext.Tools.L1(r8, r5)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                r2.setText(r3)
                r2.setOnClickListener(r12)
                r2 = 2131034346(0x7f0500ea, float:1.7679207E38)
                android.view.View r2 = r0.findViewById(r2)
                android.ext.EditText r2 = (android.ext.EditText) r2
                java.lang.Object[] r3 = new java.lang.Object[r6]
                boolean r5 = r12.f43e
                if (r5 == 0) goto Ld8
                long r10 = r12.c()
                goto Ldb
            Ld8:
                int r5 = r12.f42d
                long r10 = (long) r5
            Ldb:
                java.lang.Long r5 = java.lang.Long.valueOf(r10)
                r3[r9] = r5
                java.lang.String r3 = android.ext.Tools.L1(r8, r3)
                r2.setText(r3)
                int r3 = r12.r
                r2.setDataType(r3)
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
                r3.<init>(r2)
                r12.o = r3
                r3 = 2131034347(0x7f0500eb, float:1.7679209E38)
                android.view.View r3 = r0.findViewById(r3)
                android.ext.HexConverter r3 = (android.ext.HexConverter) r3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r9] = r2
                r5 = 4
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r6] = r5
                r3.setTag(r4)
                boolean r4 = r12.p
                if (r4 == 0) goto L110
                goto L112
            L110:
                r9 = 8
            L112:
                r3.setVisibility(r9)
                boolean r4 = r12.q
                r3.setUseXor(r4)
                android.app.AlertDialog$Builder r3 = android.ext.f.b()
                android.view.View r0 = android.ext.InternalKeyboard.d(r0)
                android.app.AlertDialog$Builder r0 = r3.setView(r0)
                r3 = 2131296836(0x7f090244, float:1.82116E38)
                android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r3, r12)
                r3 = 2131296311(0x7f090037, float:1.8210535E38)
                android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r3, r1)
                android.app.AlertDialog r0 = r0.create()
                android.ext.f.l(r0, r12)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r0)
                r12.n = r1
                android.ext.f.n(r0, r2)
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                if (r4 == 0) goto L2b
                int r4 = r4.getId()
                r0 = 2131034224(0x7f050070, float:1.767896E38)
                if (r4 != r0) goto L2b
                java.lang.ref.WeakReference r4 = r3.o
                java.lang.Object r4 = r4.get()
                android.ext.EditText r4 = (android.ext.EditText) r4
                if (r4 == 0) goto L2a
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r1 = r3.f40b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = "%,d"
                java.lang.String r0 = android.ext.Tools.L1(r1, r0)
                r4.setText(r0)
            L2a:
                return
            L2b:
                java.lang.ref.WeakReference r4 = r3.n
                java.lang.Object r4 = r4.get()
                android.content.DialogInterface r4 = (android.content.DialogInterface) r4
                r0 = -1
                r3.onClick(r4, r0)
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r4) {
                r3 = this;
                java.lang.ref.WeakReference r0 = r3.o
                java.lang.Object r0 = r0.get()
                android.ext.EditText r0 = (android.ext.EditText) r0
                r1 = -1
                r2 = 0
                android.ext.Tools.t1(r4, r1, r2, r3, r0)
                return
        }

        @Override // android.ext.Config.p
        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r5.f39a
                java.lang.String r1 = android.ext.b2.f(r1)
                r0.append(r1)
                r1 = 32
                r0.append(r1)
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                int r3 = r5.f42d
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = "%,d"
                java.lang.String r2 = android.ext.Tools.L1(r3, r2)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = r5.h()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class r extends android.ext.Config.p {
        public r(int r1, int r2, int r3, java.lang.String r4, boolean r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // android.ext.Config.p
        public void b() {
                r0 = this;
                return
        }

        @Override // android.ext.Config.p
        public boolean e(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public static class s extends android.ext.Config.p {
        int[] k;
        java.lang.CharSequence[] l;
        int[] m;

        public s(int r7, int r8, int[] r9, int r10, java.lang.String r11, boolean r12) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                r7 = 0
                r6.l = r7
                r6.m = r7
                r6.k = r9
                return
        }

        public s(int r1, int r2, int[] r3, int r4, java.lang.String r5, boolean r6, int r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.h = r7
                return
        }

        @Override // android.ext.Config.p
        public void b() {
                r4 = this;
                r4.i()
                java.lang.CharSequence[] r0 = r4.l
                int[] r1 = r4.k
                if (r1 == 0) goto L1d
                int r0 = r1.length
                java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
                r1 = 0
            Ld:
                int[] r2 = r4.k
                int r3 = r2.length
                if (r1 >= r3) goto L1d
                r2 = r2[r1]
                java.lang.String r2 = android.ext.b2.f(r2)
                r0[r1] = r2
                int r1 = r1 + 1
                goto Ld
            L1d:
                r4.j(r0)
                return
        }

        @Override // android.ext.Config.p
        public boolean e(android.content.DialogInterface r1, int r2) {
                r0 = this;
                int r2 = r0.h(r2)
                r0.f42d = r2
                android.ext.Config.k()
                android.ext.Tools.D(r1)
                r1 = 1
                return r1
        }

        public int h(int r2) {
                r1 = this;
                r1.i()
                int[] r0 = r1.m
                if (r0 != 0) goto L8
                return r2
            L8:
                r2 = r0[r2]
                return r2
        }

        protected void i() {
                r0 = this;
                return
        }

        protected void j(java.lang.CharSequence[] r6) {
                r5 = this;
                int r0 = r5.f40b
                int r0 = r5.k(r0)
                int r1 = r6.length
                java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
                r2 = 0
            La:
                int r3 = r6.length
                if (r2 >= r3) goto L3d
                if (r2 != r0) goto L36
                r3 = r6[r2]
                if (r3 == 0) goto L36
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r4 = r6[r2]
                r3.append(r4)
                java.lang.String r4 = " ("
                r3.append(r4)
                r4 = 2131296373(0x7f090075, float:1.821066E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                r3.append(r4)
                r4 = 41
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                goto L38
            L36:
                r3 = r6[r2]
            L38:
                r1[r2] = r3
                int r2 = r2 + 1
                goto La
            L3d:
                android.app.AlertDialog$Builder r6 = android.ext.f.b()
                int r0 = r5.f39a
                int r2 = r5.h
                boolean r3 = r5.f45g
                android.view.View r0 = android.ext.Config.c(r0, r2, r3)
                android.app.AlertDialog$Builder r6 = r6.setCustomTitle(r0)
                int r0 = r5.f42d
                int r0 = r5.k(r0)
                android.app.AlertDialog$Builder r6 = r6.setSingleChoiceItems(r1, r0, r5)
                android.ext.f.o(r6)
                return
        }

        public int k(int r4) {
                r3 = this;
                r3.i()
                int[] r0 = r3.m
                if (r0 != 0) goto L8
                return r4
            L8:
                r0 = 1
            L9:
                int[] r1 = r3.m
                int r2 = r1.length
                if (r0 >= r2) goto L16
                r1 = r1[r0]
                if (r1 != r4) goto L13
                goto L17
            L13:
                int r0 = r0 + 1
                goto L9
            L16:
                r0 = 0
            L17:
                return r0
        }

        @Override // android.ext.Config.p
        public java.lang.String toString() {
                r3 = this;
                int r0 = r3.f42d     // Catch: java.lang.IndexOutOfBoundsException -> L16
                int r0 = r3.k(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L16
                int[] r1 = r3.k     // Catch: java.lang.IndexOutOfBoundsException -> L16
                if (r1 == 0) goto L11
                r0 = r1[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L16
                java.lang.String r0 = android.ext.b2.f(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L16
                goto L17
            L11:
                java.lang.CharSequence[] r1 = r3.l     // Catch: java.lang.IndexOutOfBoundsException -> L16
                r0 = r1[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L16
                goto L17
            L16:
                r0 = 0
            L17:
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "int:"
                r0.append(r1)
                int r1 = r3.f42d
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L2c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r3.f39a
                java.lang.String r2 = android.ext.Tools.N1(r2)
                r1.append(r2)
                java.lang.String r2 = ": "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    static {
            android.ext.p1[][] r0 = android.ext.MainService.J0
            int r0 = r0.length
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            android.ext.Config.f29b = r0
            r0 = 115(0x73, float:1.61E-43)
            r1 = 116(0x74, float:1.63E-43)
            r2 = 114(0x72, float:1.6E-43)
            int[] r0 = new int[]{r2, r0, r1}
            android.ext.Config.f28a = r0
            a.e r0 = new a.e
            r0.<init>()
            android.ext.Config.H = r0
            android.ext.Config$r r1 = new android.ext.Config$r
            r2 = 2131034165(0x7f050035, float:1.767884E38)
            r3 = 2131296399(0x7f09008f, float:1.8210714E38)
            r4 = -1
            java.lang.String r5 = "float-type"
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            android.ext.Config$r r7 = new android.ext.Config$r
            r8 = 2131034164(0x7f050034, float:1.7678838E38)
            r9 = 2131296399(0x7f09008f, float:1.8210714E38)
            r10 = -1
            java.lang.String r11 = "float-flags"
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            android.ext.Config$r r0 = new android.ext.Config$r
            r1 = 2131034176(0x7f050040, float:1.7678862E38)
            r2 = 2131296399(0x7f09008f, float:1.8210714E38)
            r3 = 0
            java.lang.String r4 = "kbd-small"
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            android.ext.Config$r r6 = new android.ext.Config$r
            r7 = 2131034204(0x7f05005c, float:1.7678919E38)
            r8 = 2131296399(0x7f09008f, float:1.8210714E38)
            r9 = 0
            java.lang.String r10 = "time-jump-last"
            r11 = 1
            r6.<init>(r7, r8, r9, r10, r11)
            android.ext.Config$r r0 = new android.ext.Config$r
            r1 = 2131034158(0x7f05002e, float:1.7678826E38)
            java.lang.String r4 = "copy-params"
            r0.<init>(r1, r2, r3, r4, r5)
            android.ext.Config$r r6 = new android.ext.Config$r
            r7 = 2131034375(0x7f050107, float:1.7679266E38)
            java.lang.String r10 = "record-logcat"
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            android.ext.Config$q r12 = new android.ext.Config$q
            r13 = 2131034166(0x7f050036, float:1.7678842E38)
            r14 = 2131296485(0x7f0900e5, float:1.8210888E38)
            r15 = 2131296774(0x7f090206, float:1.8211474E38)
            r16 = 0
            r17 = 600000000(0x23c34600, double:2.964393875E-315)
            r19 = 33000(0x80e8, float:4.6243E-41)
            java.lang.String r20 = "freeze-interval"
            r21 = 1
            r22 = 2131296487(0x7f0900e7, float:1.8210892E38)
            r12.<init>(r13, r14, r15, r16, r17, r19, r20, r21, r22)
            android.ext.Config$q r0 = new android.ext.Config$q
            r1 = 2131034193(0x7f050051, float:1.7678897E38)
            r2 = 2131296922(0x7f09029a, float:1.8211774E38)
            r3 = 2131296775(0x7f090207, float:1.8211476E38)
            r4 = 100
            r5 = 600000(0x927c0, double:2.964394E-318)
            r7 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r8 = "saved-list-updates-interval"
            r10 = 2131296924(0x7f09029c, float:1.8211778E38)
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            android.ext.Config$f r11 = new android.ext.Config$f
            r12 = 2131034216(0x7f050068, float:1.7678943E38)
            r13 = 2131297114(0x7f09035a, float:1.8212164E38)
            r14 = 2131296399(0x7f09008f, float:1.8210714E38)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r18 = 0
            java.lang.String r19 = "xor-key"
            r20 = 1
            r22 = 0
            r23 = 1
            r11.<init>(r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23)
            android.ext.Config$q r0 = new android.ext.Config$q
            r1 = 2131034168(0x7f050038, float:1.7678846E38)
            r2 = 2131296682(0x7f0901aa, float:1.8211288E38)
            r3 = 2131296399(0x7f09008f, float:1.8210714E38)
            r4 = 0
            r5 = 100000(0x186a0, double:4.94066E-319)
            r7 = 500(0x1f4, float:7.0E-43)
            java.lang.String r8 = "history-limit"
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            android.ext.Config$g r10 = new android.ext.Config$g
            r11 = 2131034173(0x7f05003d, float:1.7678856E38)
            r12 = 2131296688(0x7f0901b0, float:1.82113E38)
            r13 = 12
            r14 = 0
            java.lang.String r15 = "icons-size"
            r16 = 0
            r17 = 2131296689(0x7f0901b1, float:1.8211302E38)
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            android.ext.Config$s r0 = new android.ext.Config$s
            r1 = 2131034174(0x7f05003e, float:1.7678858E38)
            r2 = 2131296690(0x7f0901b2, float:1.8211304E38)
            r8 = 2131296805(0x7f090225, float:1.8211537E38)
            r9 = 2131297115(0x7f09035b, float:1.8212166E38)
            int[] r3 = new int[]{r8, r9}
            r4 = 1
            java.lang.String r5 = "ignore-unknown-chars"
            r6 = 0
            r7 = 2131296691(0x7f0901b3, float:1.8211306E38)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.ext.Config$s r10 = new android.ext.Config$s
            r11 = 2131034210(0x7f050062, float:1.7678931E38)
            r12 = 2131297070(0x7f09032e, float:1.8212075E38)
            int[] r13 = new int[]{r8, r9}
            java.lang.String r15 = "use-notification"
            r17 = 2131297071(0x7f09032f, float:1.8212077E38)
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            android.ext.Config$s r0 = new android.ext.Config$s
            r1 = 2131034157(0x7f05002d, float:1.7678824E38)
            r2 = 2131296335(0x7f09004f, float:1.8210584E38)
            r3 = 2131296284(0x7f09001c, float:1.821048E38)
            r4 = 2131296260(0x7f090004, float:1.8210432E38)
            r5 = 2131296706(0x7f0901c2, float:1.8211336E38)
            r6 = 2131296955(0x7f0902bb, float:1.8211841E38)
            r7 = 2131296354(0x7f090062, float:1.8210622E38)
            int[] r3 = new int[]{r5, r6, r7, r3, r4}
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            r7 = 0
            if (r4 < r5) goto L142
            r4 = 1
            goto L143
        L142:
            r4 = 0
        L143:
            java.lang.String r5 = "context-source"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.ext.Config$s r10 = new android.ext.Config$s
            r11 = 2131034212(0x7f050064, float:1.7678935E38)
            r12 = 2131297073(0x7f090331, float:1.821208E38)
            int[] r13 = new int[]{r8, r9}
            r14 = 1
            java.lang.String r15 = "use-sound-effects"
            r16 = 0
            r17 = 2131297074(0x7f090332, float:1.8212083E38)
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            android.ext.Config$s r0 = new android.ext.Config$s
            r1 = 2131034402(0x7f050122, float:1.767932E38)
            r2 = 2131296399(0x7f09008f, float:1.8210714E38)
            r3 = 2131297107(0x7f090353, float:1.821215E38)
            r4 = 2131297104(0x7f090350, float:1.8212143E38)
            int[] r3 = new int[]{r3, r4}
            r4 = 0
            java.lang.String r5 = "selinux"
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.ext.Config$s r10 = new android.ext.Config$s
            r11 = 2131034177(0x7f050041, float:1.7678864E38)
            r12 = 2131296723(0x7f0901d3, float:1.821137E38)
            r0 = 2131296432(0x7f0900b0, float:1.821078E38)
            r1 = 2131296709(0x7f0901c5, float:1.8211342E38)
            int[] r13 = new int[]{r0, r1}
            boolean r14 = android.ext.InternalKeyboard.a()
            java.lang.String r15 = "use-internal-keyboard"
            r16 = 0
            r17 = 2131296725(0x7f0901d5, float:1.8211375E38)
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            android.ext.Config$s r18 = new android.ext.Config$s
            r19 = 2131034201(0x7f050059, float:1.7678913E38)
            r20 = 2131296272(0x7f090010, float:1.8210456E38)
            int[] r21 = new int[]{r8, r9}
            r22 = 0
            java.lang.String r23 = "allow-suggestions"
            r24 = 0
            r25 = 2131296273(0x7f090011, float:1.8210458E38)
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            android.ext.Config$s r0 = new android.ext.Config$s
            r1 = 2131034175(0x7f05003f, float:1.767886E38)
            r2 = 2131296697(0x7f0901b9, float:1.8211318E38)
            int[] r3 = new int[]{r8, r9}
            r4 = 0
            java.lang.String r5 = "use-indent"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.ext.Config$s r10 = new android.ext.Config$s
            r11 = 2131034151(0x7f050027, float:1.7678811E38)
            r12 = 2131296293(0x7f090025, float:1.8210499E38)
            int[] r13 = new int[]{r8, r9}
            r14 = 0
            java.lang.String r15 = "use-autopause"
            r17 = 2131296294(0x7f090026, float:1.82105E38)
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            android.ext.Config$s r18 = new android.ext.Config$s
            r19 = 2131034150(0x7f050026, float:1.767881E38)
            r20 = 2131296257(0x7f090001, float:1.8210426E38)
            r0 = 2131296973(0x7f0902cd, float:1.8211878E38)
            r1 = 2131296518(0x7f090106, float:1.8210955E38)
            int[] r21 = new int[]{r0, r1}
            java.lang.String r23 = "use-hardware-acceleration"
            r25 = 2131296258(0x7f090002, float:1.8210428E38)
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            android.ext.Config$s r0 = new android.ext.Config$s
            r1 = 2131034195(0x7f050053, float:1.76789E38)
            r2 = 2131296965(0x7f0902c5, float:1.8211862E38)
            r3 = 2131296402(0x7f090092, float:1.821072E38)
            r4 = 2131296404(0x7f090094, float:1.8210724E38)
            r5 = 2131296813(0x7f09022d, float:1.8211553E38)
            int[] r3 = new int[]{r5, r3, r4}
            r4 = 2
            java.lang.String r5 = "skip-memory"
            r6 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.ext.Config$h r10 = new android.ext.Config$h
            r11 = 2131034182(0x7f050046, float:1.7678874E38)
            r12 = 2131296771(0x7f090203, float:1.8211468E38)
            r0 = 2131296431(0x7f0900af, float:1.8210778E38)
            r1 = 2131296427(0x7f0900ab, float:1.821077E38)
            r2 = 2131296815(0x7f09022f, float:1.8211557E38)
            int[] r13 = new int[]{r2, r0, r1}
            java.lang.String r15 = "memory-access"
            r10.<init>(r11, r12, r13, r14, r15, r16)
            android.ext.Config$s r17 = new android.ext.Config$s
            r18 = 2131034159(0x7f05002f, float:1.7678828E38)
            r19 = 2131296371(0x7f090073, float:1.8210657E38)
            r0 = 2131297117(0x7f09035d, float:1.821217E38)
            int[] r20 = new int[]{r8, r0}
            r21 = 0
            java.lang.String r22 = "method"
            r23 = 0
            r24 = 2131296527(0x7f09010f, float:1.8210973E38)
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            android.ext.Config$s r25 = new android.ext.Config$s
            r26 = 2131034153(0x7f050029, float:1.7678816E38)
            r27 = 2131296310(0x7f090036, float:1.8210533E38)
            r0 = 2131296274(0x7f090012, float:1.821046E38)
            int[] r28 = new int[]{r2, r0}
            r29 = 0
            java.lang.String r30 = "calls"
            r31 = 0
            r32 = 2131296524(0x7f09010c, float:1.8210967E38)
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            android.ext.Config$s r10 = new android.ext.Config$s
            r11 = 2131034215(0x7f050067, float:1.7678941E38)
            r12 = 2131297096(0x7f090348, float:1.8212127E38)
            int[] r13 = new int[]{r2, r0}
            java.lang.String r15 = "waitpid"
            r17 = 2131296667(0x7f09019b, float:1.8211257E38)
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            android.ext.Config$s r18 = new android.ext.Config$s
            r19 = 2131034162(0x7f050032, float:1.7678834E38)
            r20 = 2131296445(0x7f0900bd, float:1.8210807E38)
            int[] r21 = new int[]{r8, r9}
            r22 = 0
            java.lang.String r23 = "fast-freeze"
            r24 = 1
            r25 = 2131296607(0x7f09015f, float:1.8211135E38)
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            android.ext.Config$s r0 = new android.ext.Config$s
            r1 = 2131034163(0x7f050033, float:1.7678836E38)
            r2 = 2131296452(0x7f0900c4, float:1.8210821E38)
            r3 = 2131296495(0x7f0900ef, float:1.8210908E38)
            r4 = 2131296501(0x7f0900f5, float:1.821092E38)
            r5 = 2131296499(0x7f0900f3, float:1.8210916E38)
            int[] r3 = new int[]{r5, r3, r4}
            r4 = 2
            java.lang.String r5 = "fill-toolbar"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.ext.Config$s r10 = new android.ext.Config$s
            r11 = 2131034194(0x7f050052, float:1.7678899E38)
            r12 = 2131296943(0x7f0902af, float:1.8211817E38)
            r0 = 2131296512(0x7f090100, float:1.8210943E38)
            r1 = 2131296513(0x7f090101, float:1.8210945E38)
            r2 = 2131296832(0x7f090240, float:1.8211592E38)
            int[] r13 = new int[]{r2, r0, r1}
            r14 = 2
            java.lang.String r15 = "search-helper"
            r10.<init>(r11, r12, r13, r14, r15, r16)
            android.ext.Config$s r17 = new android.ext.Config$s
            r18 = 2131034199(0x7f050057, float:1.7678909E38)
            r19 = 2131296988(0x7f0902dc, float:1.8211908E38)
            r0 = 2131296974(0x7f0902ce, float:1.821188E38)
            r1 = 2131296975(0x7f0902cf, float:1.8211882E38)
            r3 = 2131296820(0x7f090234, float:1.8211567E38)
            int[] r20 = new int[]{r3, r0, r1}
            r21 = 2
            java.lang.String r22 = "speeds-params"
            r23 = 0
            r17.<init>(r18, r19, r20, r21, r22, r23)
            android.ext.Config$s r10 = new android.ext.Config$s
            r11 = 2131034192(0x7f050050, float:1.7678895E38)
            r12 = 2131296902(0x7f090286, float:1.8211734E38)
            int[] r13 = new int[]{r8, r9}
            r14 = 1
            java.lang.String r15 = "reset-on-exit"
            r10.<init>(r11, r12, r13, r14, r15, r16)
            android.ext.Config$s r17 = new android.ext.Config$s
            r18 = 2131034154(0x7f05002a, float:1.7678818E38)
            r19 = 2131296321(0x7f090041, float:1.8210555E38)
            int[] r20 = new int[]{r8, r9}
            r21 = 1
            java.lang.String r22 = "check-libs"
            r17.<init>(r18, r19, r20, r21, r22, r23)
            android.ext.Config$s r24 = new android.ext.Config$s
            r25 = 2131034213(0x7f050065, float:1.7678937E38)
            r26 = 2131297075(0x7f090333, float:1.8212085E38)
            int[] r27 = new int[]{r8, r9}
            r28 = 1
            java.lang.String r29 = "visible-type"
            r30 = 0
            r31 = 2131297076(0x7f090334, float:1.8212087E38)
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            android.ext.Config$i r10 = new android.ext.Config$i
            r11 = 2131034186(0x7f05004a, float:1.7678882E38)
            r12 = 2131296867(0x7f090263, float:1.8211663E38)
            r0 = 2131296741(0x7f0901e5, float:1.8211407E38)
            r1 = 2131296742(0x7f0901e6, float:1.821141E38)
            r3 = 2131296740(0x7f0901e4, float:1.8211405E38)
            int[] r13 = new int[]{r8, r3, r0, r1}
            r14 = 0
            java.lang.String r15 = "prevent-unload"
            r17 = 2131296868(0x7f090264, float:1.8211665E38)
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            android.ext.Config$s r18 = new android.ext.Config$s
            r19 = 2131034187(0x7f05004b, float:1.7678884E38)
            r20 = 2131296872(0x7f090268, float:1.8211673E38)
            r0 = 2131296782(0x7f09020e, float:1.821149E38)
            r1 = 2131296779(0x7f09020b, float:1.8211484E38)
            r3 = 2131296783(0x7f09020f, float:1.8211492E38)
            int[] r21 = new int[]{r3, r0, r1, r2}
            r22 = 3
            java.lang.String r23 = "ptrace-bypass"
            r24 = 1
            r25 = 2131296873(0x7f090269, float:1.8211675E38)
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            android.ext.Config$j r0 = new android.ext.Config$j
            r1 = 2131034205(0x7f05005d, float:1.767892E38)
            r2 = 2131296961(0x7f0902c1, float:1.8211853E38)
            int[] r3 = new int[]{r8, r9}
            r4 = 0
            java.lang.String r5 = "time-jump-panel"
            r6 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.ext.Config$k r9 = new android.ext.Config$k
            r10 = 2131034183(0x7f050047, float:1.7678876E38)
            r11 = 2131296828(0x7f09023c, float:1.8211584E38)
            r12 = 0
            r13 = 0
            java.lang.String r14 = "number-locale"
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            android.ext.Config$l r16 = new android.ext.Config$l
            r17 = 2131034214(0x7f050066, float:1.767894E38)
            r18 = 2131297093(0x7f090345, float:1.8212121E38)
            r0 = 2131297116(0x7f09035c, float:1.8212168E38)
            int[] r19 = new int[]{r8, r0}
            r20 = 0
            java.lang.String r21 = "vspace-root"
            r22 = 0
            r23 = 2131296666(0x7f09019a, float:1.8211255E38)
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            android.ext.Config$m r0 = new android.ext.Config$m
            r1 = 2131034188(0x7f05004c, float:1.7678886E38)
            r2 = 2131296366(0x7f09006e, float:1.8210647E38)
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r5 = "data-in-ram"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.ext.Config$n r8 = new android.ext.Config$n
            r9 = 2131034169(0x7f050039, float:1.7678848E38)
            r10 = 2131296683(0x7f0901ab, float:1.821129E38)
            r11 = 0
            r12 = 0
            java.lang.String r13 = "hot-key"
            r14 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            android.ext.Config$a r0 = new android.ext.Config$a
            r1 = 2131034189(0x7f05004d, float:1.7678889E38)
            r2 = 2131296957(0x7f0902bd, float:1.8211845E38)
            r4 = 0
            java.lang.String r5 = "ranges"
            r6 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.ext.Config$OptionMultiChoiceSh r8 = new android.ext.Config$OptionMultiChoiceSh
            r9 = 2131034197(0x7f050055, float:1.7678905E38)
            r10 = 2131296982(0x7f0902d6, float:1.8211896E38)
            r12 = -1
            java.lang.String r13 = "intercept"
            r14 = 1
            r15 = 21
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            android.ext.Config$OptionMultiChoiceSh r16 = new android.ext.Config$OptionMultiChoiceSh
            r17 = 2131034209(0x7f050061, float:1.767893E38)
            r18 = 2131297067(0x7f09032b, float:1.8212068E38)
            r19 = 0
            r20 = -520193(0xfffffffffff80fff, float:NaN)
            java.lang.String r21 = "unrand-intercept"
            r22 = 1
            r23 = 19
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            android.ext.Config$b r0 = new android.ext.Config$b
            r1 = 2131034207(0x7f05005f, float:1.7678925E38)
            r2 = 2131297019(0x7f0902fb, float:1.8211971E38)
            r4 = -1
            java.lang.String r5 = "toolbars"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.ext.Config$c r8 = new android.ext.Config$c
            r9 = 2131034211(0x7f050063, float:1.7678933E38)
            r10 = 2131296970(0x7f0902ca, float:1.8211872E38)
            r12 = 0
            java.lang.String r13 = "small-items"
            r14 = 0
            r15 = 2131296971(0x7f0902cb, float:1.8211874E38)
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            android.ext.Config$d r0 = new android.ext.Config$d
            r1 = 2131034152(0x7f050028, float:1.7678813E38)
            r2 = 2131296296(0x7f090028, float:1.8210505E38)
            r4 = 0
            java.lang.String r5 = "backgrounds"
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.ext.Config$e r8 = new android.ext.Config$e
            r9 = 2131034167(0x7f050037, float:1.7678844E38)
            r10 = 2131296677(0x7f0901a5, float:1.8211277E38)
            java.lang.String r13 = "hide"
            r14 = 1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            h()
            android.ext.Config.C = r7
            android.ext.Config.vSpaceReal = r7
            android.ext.Config.D = r7
            java.lang.String r0 = "unknown"
            android.ext.Config.E = r0
            android.ext.Config.F = r0
            android.ext.Config.G = r7
            return
    }

    public static android.content.Context a(android.content.Context r1) {
            boolean r0 = r1 instanceof android.ext.Config.o
            if (r0 == 0) goto L5
            goto Lb
        L5:
            android.ext.Config$o r0 = new android.ext.Config$o
            r0.<init>(r1)
            r1 = r0
        Lb:
            return r1
    }

    public static android.ext.Config.p b(int r1) {
            a.e r0 = android.ext.Config.H
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            return r1
    }

    static android.view.View c(int r2, int r3, boolean r4) {
            r0 = 0
            if (r4 == 0) goto L23
            android.ext.MainService r4 = android.ext.MainService.instance
            android.ext.z1$d r4 = r4.v0
            if (r4 == 0) goto Lc
            java.lang.String r4 = r4.f1433b
            goto Ld
        Lc:
            r4 = r0
        Ld:
            if (r4 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 34
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L23:
            java.lang.String r2 = android.ext.b2.f(r2)
            android.view.View r2 = android.ext.Tools.j0(r2, r0, r3)
            return r2
    }

    public static int d() {
            int r0 = android.ext.Config.o
            int r0 = e(r0)
            return r0
    }

    public static int e(int r0) {
            int r0 = r0 * 2
            int r0 = r0 + 24
            return r0
    }

    static java.lang.String f(int r2) {
            switch(r2) {
                case 0: goto L7fe;
                case 1: goto L7fb;
                case 2: goto L7f8;
                case 3: goto L7f5;
                case 4: goto L7f2;
                case 5: goto L7ef;
                case 6: goto L7ec;
                case 7: goto L7e9;
                case 8: goto L7e6;
                case 9: goto L7e3;
                case 10: goto L7e0;
                case 11: goto L7dd;
                case 12: goto L7da;
                case 13: goto L7d7;
                case 14: goto L7d4;
                case 15: goto L7d1;
                case 16: goto L7ce;
                case 17: goto L7cb;
                case 18: goto L7c8;
                case 19: goto L7c5;
                case 20: goto L7c2;
                case 21: goto L7bf;
                case 22: goto L7bc;
                case 23: goto L7b9;
                case 24: goto L7b6;
                case 25: goto L7b2;
                case 26: goto L7ae;
                case 27: goto L7aa;
                case 28: goto L7a6;
                case 29: goto L7a2;
                case 30: goto L79e;
                case 31: goto L79a;
                case 32: goto L796;
                case 33: goto L792;
                case 34: goto L78e;
                case 35: goto L78a;
                case 36: goto L786;
                case 37: goto L782;
                case 38: goto L77e;
                case 39: goto L77a;
                case 40: goto L776;
                case 41: goto L772;
                case 42: goto L76e;
                case 43: goto L76a;
                case 44: goto L766;
                case 45: goto L762;
                case 46: goto L75e;
                case 47: goto L75a;
                case 48: goto L756;
                case 49: goto L752;
                case 50: goto L74e;
                case 51: goto L74a;
                case 52: goto L746;
                case 53: goto L742;
                case 54: goto L73e;
                case 55: goto L73a;
                case 56: goto L736;
                case 57: goto L732;
                case 58: goto L72e;
                case 59: goto L72a;
                case 60: goto L726;
                case 61: goto L722;
                case 62: goto L71e;
                case 63: goto L71a;
                case 64: goto L716;
                case 65: goto L712;
                case 66: goto L70e;
                case 67: goto L70a;
                case 68: goto L706;
                case 69: goto L702;
                case 70: goto L6fe;
                case 71: goto L6fa;
                case 72: goto L6f6;
                case 73: goto L6f2;
                case 74: goto L6ee;
                case 75: goto L6ea;
                case 76: goto L6e6;
                case 77: goto L6e2;
                case 78: goto L6de;
                case 79: goto L6da;
                case 80: goto L6d6;
                case 81: goto L6d2;
                case 82: goto L6ce;
                case 83: goto L6ca;
                case 84: goto L3;
                case 85: goto L6c6;
                case 86: goto L6c2;
                case 87: goto L6be;
                case 88: goto L6ba;
                case 89: goto L6b6;
                case 90: goto L6b2;
                case 91: goto L6ae;
                case 92: goto L6aa;
                case 93: goto L6a6;
                case 94: goto L6a2;
                case 95: goto L69e;
                case 96: goto L69a;
                case 97: goto L696;
                case 98: goto L692;
                case 99: goto L68e;
                case 100: goto L68a;
                case 101: goto L686;
                case 102: goto L682;
                case 103: goto L67e;
                case 104: goto L67a;
                case 105: goto L676;
                case 106: goto L672;
                case 107: goto L66e;
                case 108: goto L66a;
                case 109: goto L666;
                case 110: goto L662;
                case 111: goto L65e;
                case 112: goto L65a;
                case 113: goto L656;
                case 114: goto L652;
                case 115: goto L64e;
                case 116: goto L64a;
                case 117: goto L646;
                case 118: goto L642;
                case 119: goto L63e;
                case 120: goto L63a;
                case 121: goto L636;
                case 122: goto L632;
                case 123: goto L62e;
                case 124: goto L62a;
                case 125: goto L626;
                case 126: goto L622;
                case 127: goto L61e;
                case 128: goto L61a;
                case 129: goto L616;
                case 130: goto L612;
                case 131: goto L60e;
                case 132: goto L60a;
                case 133: goto L606;
                case 134: goto L602;
                case 135: goto L5fe;
                case 136: goto L5fa;
                case 137: goto L5f6;
                case 138: goto L5f2;
                case 139: goto L5ee;
                case 140: goto L5ea;
                case 141: goto L5e6;
                case 142: goto L5e2;
                case 143: goto L5de;
                case 144: goto L5da;
                case 145: goto L5d6;
                case 146: goto L5d2;
                case 147: goto L5ce;
                case 148: goto L5ca;
                case 149: goto L5c6;
                case 150: goto L5c2;
                case 151: goto L5be;
                case 152: goto L5ba;
                case 153: goto L5b6;
                case 154: goto L5b2;
                case 155: goto L5ae;
                case 156: goto L5aa;
                case 157: goto L5a6;
                case 158: goto L5a2;
                case 159: goto L59e;
                case 160: goto L59a;
                case 161: goto L596;
                case 162: goto L592;
                case 163: goto L58e;
                case 164: goto L58a;
                case 165: goto L586;
                case 166: goto L582;
                case 167: goto L57e;
                case 168: goto L57a;
                case 169: goto L576;
                case 170: goto L572;
                case 171: goto L56e;
                case 172: goto L56a;
                case 173: goto L566;
                case 174: goto L562;
                case 175: goto L55e;
                case 176: goto L55a;
                case 177: goto L556;
                case 178: goto L552;
                case 179: goto L54e;
                case 180: goto L54a;
                case 181: goto L546;
                case 182: goto L542;
                case 183: goto L53e;
                case 184: goto L53a;
                case 185: goto L536;
                case 186: goto L532;
                case 187: goto L52e;
                case 188: goto L52a;
                case 189: goto L526;
                case 190: goto L522;
                case 191: goto L51e;
                case 192: goto L51a;
                case 193: goto L516;
                case 194: goto L512;
                case 195: goto L3;
                case 196: goto L3;
                case 197: goto L3;
                case 198: goto L3;
                case 199: goto L3;
                case 200: goto L50e;
                case 201: goto L50a;
                case 202: goto L506;
                case 203: goto L502;
                case 204: goto L4fe;
                case 205: goto L4fa;
                case 206: goto L4f6;
                case 207: goto L4f2;
                case 208: goto L4ee;
                case 209: goto L4ea;
                case 210: goto L4e6;
                case 211: goto L4e2;
                case 212: goto L4de;
                case 213: goto L4da;
                case 214: goto L4d6;
                case 215: goto L4d2;
                case 216: goto L4ce;
                case 217: goto L4ca;
                case 218: goto L4c6;
                case 219: goto L4c2;
                case 220: goto L4be;
                case 221: goto L4ba;
                case 222: goto L4b6;
                case 223: goto L4b2;
                case 224: goto L4ae;
                case 225: goto L4aa;
                case 226: goto L4a6;
                case 227: goto L4a2;
                case 228: goto L49e;
                case 229: goto L49a;
                case 230: goto L496;
                case 231: goto L492;
                case 232: goto L48e;
                case 233: goto L48a;
                case 234: goto L486;
                case 235: goto L482;
                case 236: goto L47e;
                case 237: goto L47a;
                case 238: goto L476;
                case 239: goto L472;
                case 240: goto L46e;
                case 241: goto L46a;
                case 242: goto L466;
                case 243: goto L462;
                case 244: goto L45e;
                case 245: goto L45a;
                case 246: goto L456;
                case 247: goto L452;
                case 248: goto L44e;
                case 249: goto L3;
                case 250: goto L3;
                case 251: goto L3;
                case 252: goto L3;
                case 253: goto L3;
                case 254: goto L3;
                case 255: goto L3;
                case 256: goto L44a;
                case 257: goto L446;
                case 258: goto L442;
                case 259: goto L43e;
                case 260: goto L43a;
                case 261: goto L436;
                case 262: goto L432;
                case 263: goto L42e;
                case 264: goto L42a;
                case 265: goto L426;
                case 266: goto L3;
                case 267: goto L3;
                case 268: goto L3;
                case 269: goto L3;
                case 270: goto L3;
                case 271: goto L3;
                case 272: goto L422;
                case 273: goto L41e;
                case 274: goto L41a;
                case 275: goto L416;
                case 276: goto L412;
                case 277: goto L40e;
                case 278: goto L40a;
                case 279: goto L406;
                case 280: goto L3;
                case 281: goto L3;
                case 282: goto L3;
                case 283: goto L3;
                case 284: goto L3;
                case 285: goto L3;
                case 286: goto L3;
                case 287: goto L3;
                case 288: goto L402;
                case 289: goto L3fe;
                case 290: goto L3fa;
                case 291: goto L3f6;
                case 292: goto L3f2;
                case 293: goto L3ee;
                case 294: goto L3ea;
                case 295: goto L3e6;
                case 296: goto L3e2;
                case 297: goto L3de;
                case 298: goto L3da;
                case 299: goto L3d6;
                case 300: goto L3;
                case 301: goto L3;
                case 302: goto L3;
                case 303: goto L3d2;
                case 304: goto L3ce;
                case 305: goto L3ca;
                case 306: goto L3c6;
                case 307: goto L3c2;
                case 308: goto L3be;
                case 309: goto L3ba;
                case 310: goto L3b6;
                case 311: goto L3b2;
                case 312: goto L3ae;
                case 313: goto L3aa;
                case 314: goto L3a6;
                case 315: goto L3a2;
                case 316: goto L39e;
                case 317: goto L39a;
                case 318: goto L396;
                case 319: goto L3;
                case 320: goto L392;
                case 321: goto L38e;
                case 322: goto L38a;
                case 323: goto L386;
                case 324: goto L382;
                case 325: goto L37e;
                case 326: goto L37a;
                case 327: goto L376;
                case 328: goto L372;
                case 329: goto L3;
                case 330: goto L36e;
                case 331: goto L36a;
                case 332: goto L366;
                case 333: goto L362;
                case 334: goto L35e;
                case 335: goto L35a;
                case 336: goto L356;
                case 337: goto L352;
                case 338: goto L3;
                case 339: goto L3;
                case 340: goto L3;
                case 341: goto L3;
                case 342: goto L3;
                case 343: goto L3;
                case 344: goto L3;
                case 345: goto L3;
                case 346: goto L3;
                case 347: goto L3;
                case 348: goto L3;
                case 349: goto L3;
                case 350: goto L3;
                case 351: goto L3;
                case 352: goto L34e;
                case 353: goto L34a;
                case 354: goto L346;
                case 355: goto L342;
                case 356: goto L33e;
                case 357: goto L33a;
                case 358: goto L336;
                case 359: goto L332;
                case 360: goto L32e;
                case 361: goto L32a;
                case 362: goto L326;
                case 363: goto L322;
                case 364: goto L31e;
                case 365: goto L31a;
                case 366: goto L316;
                case 367: goto L312;
                case 368: goto L30e;
                case 369: goto L30a;
                case 370: goto L306;
                case 371: goto L302;
                case 372: goto L2fe;
                case 373: goto L2fa;
                case 374: goto L2f6;
                case 375: goto L2f2;
                case 376: goto L2ee;
                case 377: goto L2ea;
                case 378: goto L2e6;
                case 379: goto L2e2;
                case 380: goto L2de;
                case 381: goto L2da;
                case 382: goto L2d6;
                case 383: goto L2d2;
                case 384: goto L2ce;
                case 385: goto L2ca;
                case 386: goto L2c6;
                case 387: goto L2c2;
                case 388: goto L2be;
                case 389: goto L2ba;
                case 390: goto L2b6;
                case 391: goto L2b2;
                case 392: goto L2ae;
                case 393: goto L2aa;
                case 394: goto L2a6;
                case 395: goto L2a2;
                case 396: goto L29e;
                case 397: goto L29a;
                case 398: goto L296;
                case 399: goto L292;
                case 400: goto L28e;
                case 401: goto L28a;
                case 402: goto L286;
                case 403: goto L282;
                case 404: goto L27e;
                case 405: goto L27a;
                case 406: goto L276;
                case 407: goto L272;
                case 408: goto L26e;
                case 409: goto L26a;
                case 410: goto L266;
                case 411: goto L262;
                case 412: goto L25e;
                case 413: goto L25a;
                case 414: goto L256;
                case 415: goto L252;
                case 416: goto L24e;
                case 417: goto L24a;
                case 418: goto L246;
                case 419: goto L242;
                case 420: goto L23e;
                case 421: goto L23a;
                case 422: goto L236;
                case 423: goto L232;
                case 424: goto L22e;
                case 425: goto L22a;
                case 426: goto L226;
                case 427: goto L222;
                case 428: goto L21e;
                case 429: goto L21a;
                case 430: goto L216;
                case 431: goto L212;
                case 432: goto L20e;
                case 433: goto L20a;
                case 434: goto L206;
                case 435: goto L202;
                case 436: goto L1fe;
                case 437: goto L1fa;
                case 438: goto L1f6;
                case 439: goto L1f2;
                case 440: goto L1ee;
                case 441: goto L1ea;
                case 442: goto L1e6;
                case 443: goto L3;
                case 444: goto L3;
                case 445: goto L3;
                case 446: goto L3;
                case 447: goto L3;
                case 448: goto L1e2;
                case 449: goto L1de;
                case 450: goto L1da;
                case 451: goto L1d6;
                case 452: goto L3;
                case 453: goto L3;
                case 454: goto L3;
                case 455: goto L3;
                case 456: goto L3;
                case 457: goto L3;
                case 458: goto L3;
                case 459: goto L3;
                case 460: goto L3;
                case 461: goto L3;
                case 462: goto L3;
                case 463: goto L3;
                case 464: goto L1d2;
                case 465: goto L1ce;
                case 466: goto L1ca;
                case 467: goto L1c6;
                case 468: goto L1c2;
                case 469: goto L1be;
                case 470: goto L1ba;
                case 471: goto L1b6;
                case 472: goto L1b2;
                case 473: goto L1ae;
                case 474: goto L1aa;
                case 475: goto L1a6;
                case 476: goto L1a2;
                case 477: goto L19e;
                case 478: goto L19a;
                case 479: goto L196;
                case 480: goto L192;
                case 481: goto L18e;
                case 482: goto L18a;
                case 483: goto L186;
                case 484: goto L182;
                case 485: goto L3;
                case 486: goto L3;
                case 487: goto L3;
                case 488: goto L3;
                case 489: goto L3;
                case 490: goto L3;
                case 491: goto L3;
                case 492: goto L3;
                case 493: goto L3;
                case 494: goto L3;
                case 495: goto L3;
                case 496: goto L3;
                case 497: goto L17e;
                case 498: goto L17a;
                case 499: goto L176;
                case 500: goto L172;
                case 501: goto L16e;
                case 502: goto L16a;
                case 503: goto L166;
                case 504: goto L162;
                case 505: goto L15e;
                case 506: goto L15a;
                case 507: goto L3;
                case 508: goto L3;
                case 509: goto L3;
                case 510: goto L3;
                case 511: goto L3;
                case 512: goto L156;
                case 513: goto L152;
                case 514: goto L14e;
                case 515: goto L14a;
                case 516: goto L146;
                case 517: goto L142;
                case 518: goto L13e;
                case 519: goto L13a;
                case 520: goto L136;
                case 521: goto L132;
                case 522: goto L12e;
                case 523: goto L12a;
                case 524: goto L3;
                case 525: goto L3;
                case 526: goto L3;
                case 527: goto L3;
                case 528: goto L126;
                case 529: goto L122;
                case 530: goto L11e;
                case 531: goto L11a;
                case 532: goto L116;
                case 533: goto L112;
                case 534: goto L10e;
                case 535: goto L10a;
                case 536: goto L106;
                case 537: goto L102;
                case 538: goto Lfe;
                case 539: goto Lfa;
                case 540: goto Lf6;
                case 541: goto Lf2;
                case 542: goto Lee;
                case 543: goto L3;
                case 544: goto Lea;
                case 545: goto Le6;
                case 546: goto Le2;
                case 547: goto Lde;
                case 548: goto L3;
                case 549: goto L3;
                case 550: goto L3;
                case 551: goto L3;
                case 552: goto L3;
                case 553: goto L3;
                case 554: goto L3;
                case 555: goto L3;
                case 556: goto L3;
                case 557: goto L3;
                case 558: goto L3;
                case 559: goto L3;
                case 560: goto Lda;
                case 561: goto L3;
                case 562: goto L3;
                case 563: goto L3;
                case 564: goto L3;
                case 565: goto L3;
                case 566: goto L3;
                case 567: goto L3;
                case 568: goto L3;
                case 569: goto L3;
                case 570: goto L3;
                case 571: goto L3;
                case 572: goto L3;
                case 573: goto L3;
                case 574: goto L3;
                case 575: goto L3;
                case 576: goto Ld6;
                case 577: goto Ld2;
                case 578: goto Lce;
                case 579: goto Lca;
                case 580: goto Lc6;
                case 581: goto Lc2;
                case 582: goto Lbe;
                case 583: goto L3;
                case 584: goto L3;
                case 585: goto L3;
                case 586: goto L3;
                case 587: goto L3;
                case 588: goto L3;
                case 589: goto L3;
                case 590: goto L3;
                case 591: goto L3;
                case 592: goto Lba;
                case 593: goto Lb6;
                case 594: goto L3;
                case 595: goto L3;
                case 596: goto L3;
                case 597: goto L3;
                case 598: goto L3;
                case 599: goto L3;
                case 600: goto L3;
                case 601: goto L3;
                case 602: goto L3;
                case 603: goto L3;
                case 604: goto L3;
                case 605: goto L3;
                case 606: goto L3;
                case 607: goto L3;
                case 608: goto L3;
                case 609: goto L3;
                case 610: goto L3;
                case 611: goto L3;
                case 612: goto L3;
                case 613: goto L3;
                case 614: goto L3;
                case 615: goto L3;
                case 616: goto L3;
                case 617: goto L3;
                case 618: goto L3;
                case 619: goto L3;
                case 620: goto L3;
                case 621: goto L3;
                case 622: goto L3;
                case 623: goto L3;
                case 624: goto L3;
                case 625: goto L3;
                case 626: goto L3;
                case 627: goto L3;
                case 628: goto L3;
                case 629: goto L3;
                case 630: goto L3;
                case 631: goto L3;
                case 632: goto L3;
                case 633: goto L3;
                case 634: goto L3;
                case 635: goto L3;
                case 636: goto L3;
                case 637: goto L3;
                case 638: goto L3;
                case 639: goto L3;
                case 640: goto L3;
                case 641: goto L3;
                case 642: goto L3;
                case 643: goto L3;
                case 644: goto L3;
                case 645: goto L3;
                case 646: goto L3;
                case 647: goto L3;
                case 648: goto L3;
                case 649: goto L3;
                case 650: goto L3;
                case 651: goto L3;
                case 652: goto L3;
                case 653: goto L3;
                case 654: goto L3;
                case 655: goto L3;
                case 656: goto L3;
                case 657: goto L3;
                case 658: goto L3;
                case 659: goto L3;
                case 660: goto L3;
                case 661: goto L3;
                case 662: goto L3;
                case 663: goto L3;
                case 664: goto L3;
                case 665: goto L3;
                case 666: goto L3;
                case 667: goto L3;
                case 668: goto L3;
                case 669: goto L3;
                case 670: goto L3;
                case 671: goto L3;
                case 672: goto L3;
                case 673: goto L3;
                case 674: goto L3;
                case 675: goto L3;
                case 676: goto L3;
                case 677: goto L3;
                case 678: goto L3;
                case 679: goto L3;
                case 680: goto L3;
                case 681: goto L3;
                case 682: goto L3;
                case 683: goto L3;
                case 684: goto L3;
                case 685: goto L3;
                case 686: goto L3;
                case 687: goto L3;
                case 688: goto L3;
                case 689: goto L3;
                case 690: goto L3;
                case 691: goto L3;
                case 692: goto L3;
                case 693: goto L3;
                case 694: goto L3;
                case 695: goto L3;
                case 696: goto L3;
                case 697: goto L3;
                case 698: goto L3;
                case 699: goto L3;
                case 700: goto L3;
                case 701: goto L3;
                case 702: goto L3;
                case 703: goto L3;
                case 704: goto Lb2;
                case 705: goto Lae;
                case 706: goto Laa;
                case 707: goto La6;
                case 708: goto La2;
                case 709: goto L9e;
                case 710: goto L9a;
                case 711: goto L96;
                case 712: goto L92;
                case 713: goto L8e;
                case 714: goto L8a;
                case 715: goto L86;
                case 716: goto L82;
                case 717: goto L7e;
                case 718: goto L7a;
                case 719: goto L76;
                case 720: goto L72;
                case 721: goto L6e;
                case 722: goto L6a;
                case 723: goto L66;
                case 724: goto L62;
                case 725: goto L5e;
                case 726: goto L5a;
                case 727: goto L56;
                case 728: goto L52;
                case 729: goto L4e;
                case 730: goto L4a;
                case 731: goto L46;
                case 732: goto L42;
                case 733: goto L3e;
                case 734: goto L3a;
                case 735: goto L36;
                case 736: goto L32;
                case 737: goto L2e;
                case 738: goto L2a;
                case 739: goto L26;
                case 740: goto L22;
                case 741: goto L1e;
                case 742: goto L1a;
                case 743: goto L16;
                default: goto L3;
            }
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UNKNOWN_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            goto L805
        L16:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY40"
            goto L805
        L1a:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY39"
            goto L805
        L1e:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY38"
            goto L805
        L22:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY37"
            goto L805
        L26:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY36"
            goto L805
        L2a:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY35"
            goto L805
        L2e:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY34"
            goto L805
        L32:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY33"
            goto L805
        L36:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY32"
            goto L805
        L3a:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY31"
            goto L805
        L3e:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY30"
            goto L805
        L42:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY29"
            goto L805
        L46:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY28"
            goto L805
        L4a:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY27"
            goto L805
        L4e:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY26"
            goto L805
        L52:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY25"
            goto L805
        L56:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY24"
            goto L805
        L5a:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY23"
            goto L805
        L5e:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY22"
            goto L805
        L62:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY21"
            goto L805
        L66:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY20"
            goto L805
        L6a:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY19"
            goto L805
        L6e:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY18"
            goto L805
        L72:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY17"
            goto L805
        L76:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY16"
            goto L805
        L7a:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY15"
            goto L805
        L7e:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY14"
            goto L805
        L82:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY13"
            goto L805
        L86:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY12"
            goto L805
        L8a:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY11"
            goto L805
        L8e:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY10"
            goto L805
        L92:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY9"
            goto L805
        L96:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY8"
            goto L805
        L9a:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY7"
            goto L805
        L9e:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY6"
            goto L805
        La2:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY5"
            goto L805
        La6:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY4"
            goto L805
        Laa:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY3"
            goto L805
        Lae:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY2"
            goto L805
        Lb2:
            java.lang.String r2 = "BTN_TRIGGER_HAPPY1"
            goto L805
        Lb6:
            java.lang.String r2 = "KEY_BRIGHTNESS_MAX"
            goto L805
        Lba:
            java.lang.String r2 = "KEY_BRIGHTNESS_MIN"
            goto L805
        Lbe:
            java.lang.String r2 = "KEY_VOICECOMMAND"
            goto L805
        Lc2:
            java.lang.String r2 = "KEY_SCREENSAVER"
            goto L805
        Lc6:
            java.lang.String r2 = "KEY_APPSELECT"
            goto L805
        Lca:
            java.lang.String r2 = "KEY_CONTROLPANEL"
            goto L805
        Lce:
            java.lang.String r2 = "KEY_JOURNAL"
            goto L805
        Ld2:
            java.lang.String r2 = "KEY_TASKMANAGER"
            goto L805
        Ld6:
            java.lang.String r2 = "KEY_BUTTONCONFIG"
            goto L805
        Lda:
            java.lang.String r2 = "KEY_ALS_TOGGLE"
            goto L805
        Lde:
            java.lang.String r2 = "BTN_DPAD_RIGHT"
            goto L805
        Le2:
            java.lang.String r2 = "BTN_DPAD_LEFT"
            goto L805
        Le6:
            java.lang.String r2 = "BTN_DPAD_DOWN"
            goto L805
        Lea:
            java.lang.String r2 = "BTN_DPAD_UP"
            goto L805
        Lee:
            java.lang.String r2 = "KEY_LIGHTS_TOGGLE"
            goto L805
        Lf2:
            java.lang.String r2 = "KEY_ATTENDANT_TOGGLE"
            goto L805
        Lf6:
            java.lang.String r2 = "KEY_ATTENDANT_OFF"
            goto L805
        Lfa:
            java.lang.String r2 = "KEY_ATTENDANT_ON"
            goto L805
        Lfe:
            java.lang.String r2 = "KEY_CAMERA_RIGHT"
            goto L805
        L102:
            java.lang.String r2 = "KEY_CAMERA_LEFT"
            goto L805
        L106:
            java.lang.String r2 = "KEY_CAMERA_DOWN"
            goto L805
        L10a:
            java.lang.String r2 = "KEY_CAMERA_UP"
            goto L805
        L10e:
            java.lang.String r2 = "KEY_CAMERA_ZOOMOUT"
            goto L805
        L112:
            java.lang.String r2 = "KEY_CAMERA_ZOOMIN"
            goto L805
        L116:
            java.lang.String r2 = "KEY_TOUCHPAD_OFF"
            goto L805
        L11a:
            java.lang.String r2 = "KEY_TOUCHPAD_ON"
            goto L805
        L11e:
            java.lang.String r2 = "KEY_TOUCHPAD_TOGGLE"
            goto L805
        L122:
            java.lang.String r2 = "KEY_WPS_BUTTON"
            goto L805
        L126:
            java.lang.String r2 = "KEY_CAMERA_FOCUS"
            goto L805
        L12a:
            java.lang.String r2 = "KEY_NUMERIC_POUND"
            goto L805
        L12e:
            java.lang.String r2 = "KEY_NUMERIC_STAR"
            goto L805
        L132:
            java.lang.String r2 = "KEY_NUMERIC_9"
            goto L805
        L136:
            java.lang.String r2 = "KEY_NUMERIC_8"
            goto L805
        L13a:
            java.lang.String r2 = "KEY_NUMERIC_7"
            goto L805
        L13e:
            java.lang.String r2 = "KEY_NUMERIC_6"
            goto L805
        L142:
            java.lang.String r2 = "KEY_NUMERIC_5"
            goto L805
        L146:
            java.lang.String r2 = "KEY_NUMERIC_4"
            goto L805
        L14a:
            java.lang.String r2 = "KEY_NUMERIC_3"
            goto L805
        L14e:
            java.lang.String r2 = "KEY_NUMERIC_2"
            goto L805
        L152:
            java.lang.String r2 = "KEY_NUMERIC_1"
            goto L805
        L156:
            java.lang.String r2 = "KEY_NUMERIC_0"
            goto L805
        L15a:
            java.lang.String r2 = "KEY_BRL_DOT10"
            goto L805
        L15e:
            java.lang.String r2 = "KEY_BRL_DOT9"
            goto L805
        L162:
            java.lang.String r2 = "KEY_BRL_DOT8"
            goto L805
        L166:
            java.lang.String r2 = "KEY_BRL_DOT7"
            goto L805
        L16a:
            java.lang.String r2 = "KEY_BRL_DOT6"
            goto L805
        L16e:
            java.lang.String r2 = "KEY_BRL_DOT5"
            goto L805
        L172:
            java.lang.String r2 = "KEY_BRL_DOT4"
            goto L805
        L176:
            java.lang.String r2 = "KEY_BRL_DOT3"
            goto L805
        L17a:
            java.lang.String r2 = "KEY_BRL_DOT2"
            goto L805
        L17e:
            java.lang.String r2 = "KEY_BRL_DOT1"
            goto L805
        L182:
            java.lang.String r2 = "KEY_FN_B"
            goto L805
        L186:
            java.lang.String r2 = "KEY_FN_S"
            goto L805
        L18a:
            java.lang.String r2 = "KEY_FN_F"
            goto L805
        L18e:
            java.lang.String r2 = "KEY_FN_E"
            goto L805
        L192:
            java.lang.String r2 = "KEY_FN_D"
            goto L805
        L196:
            java.lang.String r2 = "KEY_FN_2"
            goto L805
        L19a:
            java.lang.String r2 = "KEY_FN_1"
            goto L805
        L19e:
            java.lang.String r2 = "KEY_FN_F12"
            goto L805
        L1a2:
            java.lang.String r2 = "KEY_FN_F11"
            goto L805
        L1a6:
            java.lang.String r2 = "KEY_FN_F10"
            goto L805
        L1aa:
            java.lang.String r2 = "KEY_FN_F9"
            goto L805
        L1ae:
            java.lang.String r2 = "KEY_FN_F8"
            goto L805
        L1b2:
            java.lang.String r2 = "KEY_FN_F7"
            goto L805
        L1b6:
            java.lang.String r2 = "KEY_FN_F6"
            goto L805
        L1ba:
            java.lang.String r2 = "KEY_FN_F5"
            goto L805
        L1be:
            java.lang.String r2 = "KEY_FN_F4"
            goto L805
        L1c2:
            java.lang.String r2 = "KEY_FN_F3"
            goto L805
        L1c6:
            java.lang.String r2 = "KEY_FN_F2"
            goto L805
        L1ca:
            java.lang.String r2 = "KEY_FN_F1"
            goto L805
        L1ce:
            java.lang.String r2 = "KEY_FN_ESC"
            goto L805
        L1d2:
            java.lang.String r2 = "KEY_FN"
            goto L805
        L1d6:
            java.lang.String r2 = "KEY_DEL_LINE"
            goto L805
        L1da:
            java.lang.String r2 = "KEY_INS_LINE"
            goto L805
        L1de:
            java.lang.String r2 = "KEY_DEL_EOS"
            goto L805
        L1e2:
            java.lang.String r2 = "KEY_DEL_EOL"
            goto L805
        L1e6:
            java.lang.String r2 = "KEY_IMAGES"
            goto L805
        L1ea:
            java.lang.String r2 = "KEY_10CHANNELSDOWN"
            goto L805
        L1ee:
            java.lang.String r2 = "KEY_10CHANNELSUP"
            goto L805
        L1f2:
            java.lang.String r2 = "KEY_MEDIA_REPEAT"
            goto L805
        L1f6:
            java.lang.String r2 = "KEY_CONTEXT_MENU"
            goto L805
        L1fa:
            java.lang.String r2 = "KEY_FRAMEFORWARD"
            goto L805
        L1fe:
            java.lang.String r2 = "KEY_FRAMEBACK"
            goto L805
        L202:
            java.lang.String r2 = "KEY_EURO"
            goto L805
        L206:
            java.lang.String r2 = "KEY_DOLLAR"
            goto L805
        L20a:
            java.lang.String r2 = "KEY_LOGOFF"
            goto L805
        L20e:
            java.lang.String r2 = "KEY_SPELLCHECK"
            goto L805
        L212:
            java.lang.String r2 = "KEY_DISPLAYTOGGLE"
            goto L805
        L216:
            java.lang.String r2 = "KEY_MESSENGER"
            goto L805
        L21a:
            java.lang.String r2 = "KEY_ADDRESSBOOK"
            goto L805
        L21e:
            java.lang.String r2 = "KEY_VOICEMAIL"
            goto L805
        L222:
            java.lang.String r2 = "KEY_NEWS"
            goto L805
        L226:
            java.lang.String r2 = "KEY_DATABASE"
            goto L805
        L22a:
            java.lang.String r2 = "KEY_PRESENTATION"
            goto L805
        L22e:
            java.lang.String r2 = "KEY_GRAPHICSEDITOR"
            goto L805
        L232:
            java.lang.String r2 = "KEY_SPREADSHEET"
            goto L805
        L236:
            java.lang.String r2 = "KEY_EDITOR"
            goto L805
        L23a:
            java.lang.String r2 = "KEY_WORDPROCESSOR"
            goto L805
        L23e:
            java.lang.String r2 = "KEY_ZOOMRESET"
            goto L805
        L242:
            java.lang.String r2 = "KEY_ZOOMOUT"
            goto L805
        L246:
            java.lang.String r2 = "KEY_ZOOMIN"
            goto L805
        L24a:
            java.lang.String r2 = "KEY_GAMES"
            goto L805
        L24e:
            java.lang.String r2 = "KEY_VIDEOPHONE"
            goto L805
        L252:
            java.lang.String r2 = "KEY_TWEN"
            goto L805
        L256:
            java.lang.String r2 = "KEY_TEEN"
            goto L805
        L25a:
            java.lang.String r2 = "KEY_DIGITS"
            goto L805
        L25e:
            java.lang.String r2 = "KEY_PREVIOUS"
            goto L805
        L262:
            java.lang.String r2 = "KEY_BREAK"
            goto L805
        L266:
            java.lang.String r2 = "KEY_SHUFFLE"
            goto L805
        L26a:
            java.lang.String r2 = "KEY_SLOW"
            goto L805
        L26e:
            java.lang.String r2 = "KEY_RESTART"
            goto L805
        L272:
            java.lang.String r2 = "KEY_NEXT"
            goto L805
        L276:
            java.lang.String r2 = "KEY_AB"
            goto L805
        L27a:
            java.lang.String r2 = "KEY_LAST"
            goto L805
        L27e:
            java.lang.String r2 = "KEY_FIRST"
            goto L805
        L282:
            java.lang.String r2 = "KEY_CHANNELDOWN"
            goto L805
        L286:
            java.lang.String r2 = "KEY_CHANNELUP"
            goto L805
        L28a:
            java.lang.String r2 = "KEY_BLUE"
            goto L805
        L28e:
            java.lang.String r2 = "KEY_YELLOW"
            goto L805
        L292:
            java.lang.String r2 = "KEY_GREEN"
            goto L805
        L296:
            java.lang.String r2 = "KEY_RED"
            goto L805
        L29a:
            java.lang.String r2 = "KEY_CALENDAR"
            goto L805
        L29e:
            java.lang.String r2 = "KEY_MEMO"
            goto L805
        L2a2:
            java.lang.String r2 = "KEY_LIST"
            goto L805
        L2a6:
            java.lang.String r2 = "KEY_DIRECTORY"
            goto L805
        L2aa:
            java.lang.String r2 = "KEY_VIDEO"
            goto L805
        L2ae:
            java.lang.String r2 = "KEY_AUDIO"
            goto L805
        L2b2:
            java.lang.String r2 = "KEY_MP3"
            goto L805
        L2b6:
            java.lang.String r2 = "KEY_AUX"
            goto L805
        L2ba:
            java.lang.String r2 = "KEY_DVD"
            goto L805
        L2be:
            java.lang.String r2 = "KEY_TEXT"
            goto L805
        L2c2:
            java.lang.String r2 = "KEY_PLAYER"
            goto L805
        L2c6:
            java.lang.String r2 = "KEY_TUNER"
            goto L805
        L2ca:
            java.lang.String r2 = "KEY_RADIO"
            goto L805
        L2ce:
            java.lang.String r2 = "KEY_TAPE"
            goto L805
        L2d2:
            java.lang.String r2 = "KEY_CD"
            goto L805
        L2d6:
            java.lang.String r2 = "KEY_SAT2"
            goto L805
        L2da:
            java.lang.String r2 = "KEY_SAT"
            goto L805
        L2de:
            java.lang.String r2 = "KEY_VCR2"
            goto L805
        L2e2:
            java.lang.String r2 = "KEY_VCR"
            goto L805
        L2e6:
            java.lang.String r2 = "KEY_TV2"
            goto L805
        L2ea:
            java.lang.String r2 = "KEY_TV"
            goto L805
        L2ee:
            java.lang.String r2 = "KEY_PC"
            goto L805
        L2f2:
            java.lang.String r2 = "KEY_SCREEN"
            goto L805
        L2f6:
            java.lang.String r2 = "KEY_KEYBOARD"
            goto L805
        L2fa:
            java.lang.String r2 = "KEY_MODE"
            goto L805
        L2fe:
            java.lang.String r2 = "KEY_ZOOM"
            goto L805
        L302:
            java.lang.String r2 = "KEY_ANGLE"
            goto L805
        L306:
            java.lang.String r2 = "KEY_SUBTITLE"
            goto L805
        L30a:
            java.lang.String r2 = "KEY_TITLE"
            goto L805
        L30e:
            java.lang.String r2 = "KEY_LANGUAGE"
            goto L805
        L312:
            java.lang.String r2 = "KEY_MHP"
            goto L805
        L316:
            java.lang.String r2 = "KEY_PVR"
            goto L805
        L31a:
            java.lang.String r2 = "KEY_EPG"
            goto L805
        L31e:
            java.lang.String r2 = "KEY_FAVORITES"
            goto L805
        L322:
            java.lang.String r2 = "KEY_CHANNEL"
            goto L805
        L326:
            java.lang.String r2 = "KEY_PROGRAM"
            goto L805
        L32a:
            java.lang.String r2 = "KEY_ARCHIVE"
            goto L805
        L32e:
            java.lang.String r2 = "KEY_VENDOR"
            goto L805
        L332:
            java.lang.String r2 = "KEY_TIME"
            goto L805
        L336:
            java.lang.String r2 = "KEY_INFO"
            goto L805
        L33a:
            java.lang.String r2 = "KEY_OPTION"
            goto L805
        L33e:
            java.lang.String r2 = "KEY_POWER2"
            goto L805
        L342:
            java.lang.String r2 = "KEY_CLEAR"
            goto L805
        L346:
            java.lang.String r2 = "KEY_GOTO"
            goto L805
        L34a:
            java.lang.String r2 = "KEY_SELECT"
            goto L805
        L34e:
            java.lang.String r2 = "KEY_OK"
            goto L805
        L352:
            java.lang.String r2 = "BTN_GEAR_UP"
            goto L805
        L356:
            java.lang.String r2 = "BTN_WHEEL"
            goto L805
        L35a:
            java.lang.String r2 = "BTN_TOOL_QUADTAP"
            goto L805
        L35e:
            java.lang.String r2 = "BTN_TOOL_TRIPLETAP"
            goto L805
        L362:
            java.lang.String r2 = "BTN_TOOL_DOUBLETAP"
            goto L805
        L366:
            java.lang.String r2 = "BTN_STYLUS2"
            goto L805
        L36a:
            java.lang.String r2 = "BTN_STYLUS"
            goto L805
        L36e:
            java.lang.String r2 = "BTN_TOUCH"
            goto L805
        L372:
            java.lang.String r2 = "BTN_TOOL_QUINTTAP"
            goto L805
        L376:
            java.lang.String r2 = "BTN_TOOL_LENS"
            goto L805
        L37a:
            java.lang.String r2 = "BTN_TOOL_MOUSE"
            goto L805
        L37e:
            java.lang.String r2 = "BTN_TOOL_FINGER"
            goto L805
        L382:
            java.lang.String r2 = "BTN_TOOL_AIRBRUSH"
            goto L805
        L386:
            java.lang.String r2 = "BTN_TOOL_PENCIL"
            goto L805
        L38a:
            java.lang.String r2 = "BTN_TOOL_BRUSH"
            goto L805
        L38e:
            java.lang.String r2 = "BTN_TOOL_RUBBER"
            goto L805
        L392:
            java.lang.String r2 = "BTN_TOOL_PEN"
            goto L805
        L396:
            java.lang.String r2 = "BTN_THUMBR"
            goto L805
        L39a:
            java.lang.String r2 = "BTN_THUMBL"
            goto L805
        L39e:
            java.lang.String r2 = "BTN_MODE"
            goto L805
        L3a2:
            java.lang.String r2 = "BTN_START"
            goto L805
        L3a6:
            java.lang.String r2 = "BTN_SELECT"
            goto L805
        L3aa:
            java.lang.String r2 = "BTN_TR2"
            goto L805
        L3ae:
            java.lang.String r2 = "BTN_TL2"
            goto L805
        L3b2:
            java.lang.String r2 = "BTN_TR"
            goto L805
        L3b6:
            java.lang.String r2 = "BTN_TL"
            goto L805
        L3ba:
            java.lang.String r2 = "BTN_Z"
            goto L805
        L3be:
            java.lang.String r2 = "BTN_Y"
            goto L805
        L3c2:
            java.lang.String r2 = "BTN_X"
            goto L805
        L3c6:
            java.lang.String r2 = "BTN_C"
            goto L805
        L3ca:
            java.lang.String r2 = "BTN_B"
            goto L805
        L3ce:
            java.lang.String r2 = "BTN_A"
            goto L805
        L3d2:
            java.lang.String r2 = "BTN_DEAD"
            goto L805
        L3d6:
            java.lang.String r2 = "BTN_BASE6"
            goto L805
        L3da:
            java.lang.String r2 = "BTN_BASE5"
            goto L805
        L3de:
            java.lang.String r2 = "BTN_BASE4"
            goto L805
        L3e2:
            java.lang.String r2 = "BTN_BASE3"
            goto L805
        L3e6:
            java.lang.String r2 = "BTN_BASE2"
            goto L805
        L3ea:
            java.lang.String r2 = "BTN_BASE"
            goto L805
        L3ee:
            java.lang.String r2 = "BTN_PINKIE"
            goto L805
        L3f2:
            java.lang.String r2 = "BTN_TOP2"
            goto L805
        L3f6:
            java.lang.String r2 = "BTN_TOP"
            goto L805
        L3fa:
            java.lang.String r2 = "BTN_THUMB2"
            goto L805
        L3fe:
            java.lang.String r2 = "BTN_THUMB"
            goto L805
        L402:
            java.lang.String r2 = "BTN_TRIGGER"
            goto L805
        L406:
            java.lang.String r2 = "BTN_TASK"
            goto L805
        L40a:
            java.lang.String r2 = "BTN_BACK"
            goto L805
        L40e:
            java.lang.String r2 = "BTN_FORWARD"
            goto L805
        L412:
            java.lang.String r2 = "BTN_EXTRA"
            goto L805
        L416:
            java.lang.String r2 = "BTN_SIDE"
            goto L805
        L41a:
            java.lang.String r2 = "BTN_MIDDLE"
            goto L805
        L41e:
            java.lang.String r2 = "BTN_RIGHT"
            goto L805
        L422:
            java.lang.String r2 = "BTN_LEFT"
            goto L805
        L426:
            java.lang.String r2 = "BTN_9"
            goto L805
        L42a:
            java.lang.String r2 = "BTN_8"
            goto L805
        L42e:
            java.lang.String r2 = "BTN_7"
            goto L805
        L432:
            java.lang.String r2 = "BTN_6"
            goto L805
        L436:
            java.lang.String r2 = "BTN_5"
            goto L805
        L43a:
            java.lang.String r2 = "BTN_4"
            goto L805
        L43e:
            java.lang.String r2 = "BTN_3"
            goto L805
        L442:
            java.lang.String r2 = "BTN_2"
            goto L805
        L446:
            java.lang.String r2 = "BTN_1"
            goto L805
        L44a:
            java.lang.String r2 = "BTN_0"
            goto L805
        L44e:
            java.lang.String r2 = "KEY_MICMUTE"
            goto L805
        L452:
            java.lang.String r2 = "KEY_RFKILL"
            goto L805
        L456:
            java.lang.String r2 = "KEY_WWAN"
            goto L805
        L45a:
            java.lang.String r2 = "KEY_DISPLAY_OFF"
            goto L805
        L45e:
            java.lang.String r2 = "KEY_BRIGHTNESS_AUTO"
            goto L805
        L462:
            java.lang.String r2 = "KEY_BRIGHTNESS_CYCLE"
            goto L805
        L466:
            java.lang.String r2 = "KEY_VIDEO_PREV"
            goto L805
        L46a:
            java.lang.String r2 = "KEY_VIDEO_NEXT"
            goto L805
        L46e:
            java.lang.String r2 = "KEY_UNKNOWN"
            goto L805
        L472:
            java.lang.String r2 = "KEY_UWB"
            goto L805
        L476:
            java.lang.String r2 = "KEY_WLAN"
            goto L805
        L47a:
            java.lang.String r2 = "KEY_BLUETOOTH"
            goto L805
        L47e:
            java.lang.String r2 = "KEY_BATTERY"
            goto L805
        L482:
            java.lang.String r2 = "KEY_DOCUMENTS"
            goto L805
        L486:
            java.lang.String r2 = "KEY_SAVE"
            goto L805
        L48a:
            java.lang.String r2 = "KEY_FORWARDMAIL"
            goto L805
        L48e:
            java.lang.String r2 = "KEY_REPLY"
            goto L805
        L492:
            java.lang.String r2 = "KEY_SEND"
            goto L805
        L496:
            java.lang.String r2 = "KEY_KBDILLUMUP"
            goto L805
        L49a:
            java.lang.String r2 = "KEY_KBDILLUMDOWN"
            goto L805
        L49e:
            java.lang.String r2 = "KEY_KBDILLUMTOGGLE"
            goto L805
        L4a2:
            java.lang.String r2 = "KEY_SWITCHVIDEOMODE"
            goto L805
        L4a6:
            java.lang.String r2 = "KEY_MEDIA"
            goto L805
        L4aa:
            java.lang.String r2 = "KEY_BRIGHTNESSUP"
            goto L805
        L4ae:
            java.lang.String r2 = "KEY_BRIGHTNESSDOWN"
            goto L805
        L4b2:
            java.lang.String r2 = "KEY_CANCEL"
            goto L805
        L4b6:
            java.lang.String r2 = "KEY_ALTERASE"
            goto L805
        L4ba:
            java.lang.String r2 = "KEY_SHOP"
            goto L805
        L4be:
            java.lang.String r2 = "KEY_SPORT"
            goto L805
        L4c2:
            java.lang.String r2 = "KEY_FINANCE"
            goto L805
        L4c6:
            java.lang.String r2 = "KEY_CONNECT"
            goto L805
        L4ca:
            java.lang.String r2 = "KEY_SEARCH"
            goto L805
        L4ce:
            java.lang.String r2 = "KEY_CHAT"
            goto L805
        L4d2:
            java.lang.String r2 = "KEY_EMAIL"
            goto L805
        L4d6:
            java.lang.String r2 = "KEY_QUESTION"
            goto L805
        L4da:
            java.lang.String r2 = "KEY_SOUND"
            goto L805
        L4de:
            java.lang.String r2 = "KEY_CAMERA"
            goto L805
        L4e2:
            java.lang.String r2 = "KEY_HP"
            goto L805
        L4e6:
            java.lang.String r2 = "KEY_PRINT"
            goto L805
        L4ea:
            java.lang.String r2 = "KEY_BASSBOOST"
            goto L805
        L4ee:
            java.lang.String r2 = "KEY_FASTFORWARD"
            goto L805
        L4f2:
            java.lang.String r2 = "KEY_PLAY"
            goto L805
        L4f6:
            java.lang.String r2 = "KEY_CLOSE"
            goto L805
        L4fa:
            java.lang.String r2 = "KEY_SUSPEND"
            goto L805
        L4fe:
            java.lang.String r2 = "KEY_DASHBOARD"
            goto L805
        L502:
            java.lang.String r2 = "KEY_PROG4"
            goto L805
        L506:
            java.lang.String r2 = "KEY_PROG3"
            goto L805
        L50a:
            java.lang.String r2 = "KEY_PAUSECD"
            goto L805
        L50e:
            java.lang.String r2 = "KEY_PLAYCD"
            goto L805
        L512:
            java.lang.String r2 = "KEY_F24"
            goto L805
        L516:
            java.lang.String r2 = "KEY_F23"
            goto L805
        L51a:
            java.lang.String r2 = "KEY_F22"
            goto L805
        L51e:
            java.lang.String r2 = "KEY_F21"
            goto L805
        L522:
            java.lang.String r2 = "KEY_F20"
            goto L805
        L526:
            java.lang.String r2 = "KEY_F19"
            goto L805
        L52a:
            java.lang.String r2 = "KEY_F18"
            goto L805
        L52e:
            java.lang.String r2 = "KEY_F17"
            goto L805
        L532:
            java.lang.String r2 = "KEY_F16"
            goto L805
        L536:
            java.lang.String r2 = "KEY_F15"
            goto L805
        L53a:
            java.lang.String r2 = "KEY_F14"
            goto L805
        L53e:
            java.lang.String r2 = "KEY_F13"
            goto L805
        L542:
            java.lang.String r2 = "KEY_REDO"
            goto L805
        L546:
            java.lang.String r2 = "KEY_NEW"
            goto L805
        L54a:
            java.lang.String r2 = "KEY_KPRIGHTPAREN"
            goto L805
        L54e:
            java.lang.String r2 = "KEY_KPLEFTPAREN"
            goto L805
        L552:
            java.lang.String r2 = "KEY_SCROLLDOWN"
            goto L805
        L556:
            java.lang.String r2 = "KEY_SCROLLUP"
            goto L805
        L55a:
            java.lang.String r2 = "KEY_EDIT"
            goto L805
        L55e:
            java.lang.String r2 = "KEY_MOVE"
            goto L805
        L562:
            java.lang.String r2 = "KEY_EXIT"
            goto L805
        L566:
            java.lang.String r2 = "KEY_REFRESH"
            goto L805
        L56a:
            java.lang.String r2 = "KEY_HOMEPAGE"
            goto L805
        L56e:
            java.lang.String r2 = "KEY_CONFIG"
            goto L805
        L572:
            java.lang.String r2 = "KEY_ISO"
            goto L805
        L576:
            java.lang.String r2 = "KEY_PHONE"
            goto L805
        L57a:
            java.lang.String r2 = "KEY_REWIND"
            goto L805
        L57e:
            java.lang.String r2 = "KEY_RECORD"
            goto L805
        L582:
            java.lang.String r2 = "KEY_STOPCD"
            goto L805
        L586:
            java.lang.String r2 = "KEY_PREVIOUSSONG"
            goto L805
        L58a:
            java.lang.String r2 = "KEY_PLAYPAUSE"
            goto L805
        L58e:
            java.lang.String r2 = "KEY_NEXTSONG"
            goto L805
        L592:
            java.lang.String r2 = "KEY_EJECTCLOSECD"
            goto L805
        L596:
            java.lang.String r2 = "KEY_EJECTCD"
            goto L805
        L59a:
            java.lang.String r2 = "KEY_CLOSECD"
            goto L805
        L59e:
            java.lang.String r2 = "KEY_FORWARD"
            goto L805
        L5a2:
            java.lang.String r2 = "KEY_BACK"
            goto L805
        L5a6:
            java.lang.String r2 = "KEY_COMPUTER"
            goto L805
        L5aa:
            java.lang.String r2 = "KEY_BOOKMARKS"
            goto L805
        L5ae:
            java.lang.String r2 = "KEY_MAIL"
            goto L805
        L5b2:
            java.lang.String r2 = "KEY_CYCLEWINDOWS"
            goto L805
        L5b6:
            java.lang.String r2 = "KEY_DIRECTION"
            goto L805
        L5ba:
            java.lang.String r2 = "KEY_SCREENLOCK"
            goto L805
        L5be:
            java.lang.String r2 = "KEY_MSDOS"
            goto L805
        L5c2:
            java.lang.String r2 = "KEY_WWW"
            goto L805
        L5c6:
            java.lang.String r2 = "KEY_PROG2"
            goto L805
        L5ca:
            java.lang.String r2 = "KEY_PROG1"
            goto L805
        L5ce:
            java.lang.String r2 = "KEY_XFER"
            goto L805
        L5d2:
            java.lang.String r2 = "KEY_DELETEFILE"
            goto L805
        L5d6:
            java.lang.String r2 = "KEY_SENDFILE"
            goto L805
        L5da:
            java.lang.String r2 = "KEY_FILE"
            goto L805
        L5de:
            java.lang.String r2 = "KEY_WAKEUP"
            goto L805
        L5e2:
            java.lang.String r2 = "KEY_SLEEP"
            goto L805
        L5e6:
            java.lang.String r2 = "KEY_SETUP"
            goto L805
        L5ea:
            java.lang.String r2 = "KEY_CALC"
            goto L805
        L5ee:
            java.lang.String r2 = "KEY_MENU"
            goto L805
        L5f2:
            java.lang.String r2 = "KEY_HELP"
            goto L805
        L5f6:
            java.lang.String r2 = "KEY_CUT"
            goto L805
        L5fa:
            java.lang.String r2 = "KEY_FIND"
            goto L805
        L5fe:
            java.lang.String r2 = "KEY_PASTE"
            goto L805
        L602:
            java.lang.String r2 = "KEY_OPEN"
            goto L805
        L606:
            java.lang.String r2 = "KEY_COPY"
            goto L805
        L60a:
            java.lang.String r2 = "KEY_FRONT"
            goto L805
        L60e:
            java.lang.String r2 = "KEY_UNDO"
            goto L805
        L612:
            java.lang.String r2 = "KEY_PROPS"
            goto L805
        L616:
            java.lang.String r2 = "KEY_AGAIN"
            goto L805
        L61a:
            java.lang.String r2 = "KEY_STOP"
            goto L805
        L61e:
            java.lang.String r2 = "KEY_COMPOSE"
            goto L805
        L622:
            java.lang.String r2 = "KEY_RIGHTMETA"
            goto L805
        L626:
            java.lang.String r2 = "KEY_LEFTMETA"
            goto L805
        L62a:
            java.lang.String r2 = "KEY_YEN"
            goto L805
        L62e:
            java.lang.String r2 = "KEY_HANJA"
            goto L805
        L632:
            java.lang.String r2 = "KEY_HANGEUL"
            goto L805
        L636:
            java.lang.String r2 = "KEY_KPCOMMA"
            goto L805
        L63a:
            java.lang.String r2 = "KEY_SCALE"
            goto L805
        L63e:
            java.lang.String r2 = "KEY_PAUSE"
            goto L805
        L642:
            java.lang.String r2 = "KEY_KPPLUSMINUS"
            goto L805
        L646:
            java.lang.String r2 = "KEY_KPEQUAL"
            goto L805
        L64a:
            java.lang.String r2 = "KEY_POWER"
            goto L805
        L64e:
            java.lang.String r2 = "KEY_VOLUMEUP"
            goto L805
        L652:
            java.lang.String r2 = "KEY_VOLUMEDOWN"
            goto L805
        L656:
            java.lang.String r2 = "KEY_MUTE"
            goto L805
        L65a:
            java.lang.String r2 = "KEY_MACRO"
            goto L805
        L65e:
            java.lang.String r2 = "KEY_DELETE"
            goto L805
        L662:
            java.lang.String r2 = "KEY_INSERT"
            goto L805
        L666:
            java.lang.String r2 = "KEY_PAGEDOWN"
            goto L805
        L66a:
            java.lang.String r2 = "KEY_DOWN"
            goto L805
        L66e:
            java.lang.String r2 = "KEY_END"
            goto L805
        L672:
            java.lang.String r2 = "KEY_RIGHT"
            goto L805
        L676:
            java.lang.String r2 = "KEY_LEFT"
            goto L805
        L67a:
            java.lang.String r2 = "KEY_PAGEUP"
            goto L805
        L67e:
            java.lang.String r2 = "KEY_UP"
            goto L805
        L682:
            java.lang.String r2 = "KEY_HOME"
            goto L805
        L686:
            java.lang.String r2 = "KEY_LINEFEED"
            goto L805
        L68a:
            java.lang.String r2 = "KEY_RIGHTALT"
            goto L805
        L68e:
            java.lang.String r2 = "KEY_SYSRQ"
            goto L805
        L692:
            java.lang.String r2 = "KEY_KPSLASH"
            goto L805
        L696:
            java.lang.String r2 = "KEY_RIGHTCTRL"
            goto L805
        L69a:
            java.lang.String r2 = "KEY_KPENTER"
            goto L805
        L69e:
            java.lang.String r2 = "KEY_KPJPCOMMA"
            goto L805
        L6a2:
            java.lang.String r2 = "KEY_MUHENKAN"
            goto L805
        L6a6:
            java.lang.String r2 = "KEY_KATAKANAHIRAGANA"
            goto L805
        L6aa:
            java.lang.String r2 = "KEY_HENKAN"
            goto L805
        L6ae:
            java.lang.String r2 = "KEY_HIRAGANA"
            goto L805
        L6b2:
            java.lang.String r2 = "KEY_KATAKANA"
            goto L805
        L6b6:
            java.lang.String r2 = "KEY_RO"
            goto L805
        L6ba:
            java.lang.String r2 = "KEY_F12"
            goto L805
        L6be:
            java.lang.String r2 = "KEY_F11"
            goto L805
        L6c2:
            java.lang.String r2 = "KEY_102ND"
            goto L805
        L6c6:
            java.lang.String r2 = "KEY_ZENKAKUHANKAKU"
            goto L805
        L6ca:
            java.lang.String r2 = "KEY_KPDOT"
            goto L805
        L6ce:
            java.lang.String r2 = "KEY_KP0"
            goto L805
        L6d2:
            java.lang.String r2 = "KEY_KP3"
            goto L805
        L6d6:
            java.lang.String r2 = "KEY_KP2"
            goto L805
        L6da:
            java.lang.String r2 = "KEY_KP1"
            goto L805
        L6de:
            java.lang.String r2 = "KEY_KPPLUS"
            goto L805
        L6e2:
            java.lang.String r2 = "KEY_KP6"
            goto L805
        L6e6:
            java.lang.String r2 = "KEY_KP5"
            goto L805
        L6ea:
            java.lang.String r2 = "KEY_KP4"
            goto L805
        L6ee:
            java.lang.String r2 = "KEY_KPMINUS"
            goto L805
        L6f2:
            java.lang.String r2 = "KEY_KP9"
            goto L805
        L6f6:
            java.lang.String r2 = "KEY_KP8"
            goto L805
        L6fa:
            java.lang.String r2 = "KEY_KP7"
            goto L805
        L6fe:
            java.lang.String r2 = "KEY_SCROLLLOCK"
            goto L805
        L702:
            java.lang.String r2 = "KEY_NUMLOCK"
            goto L805
        L706:
            java.lang.String r2 = "KEY_F10"
            goto L805
        L70a:
            java.lang.String r2 = "KEY_F9"
            goto L805
        L70e:
            java.lang.String r2 = "KEY_F8"
            goto L805
        L712:
            java.lang.String r2 = "KEY_F7"
            goto L805
        L716:
            java.lang.String r2 = "KEY_F6"
            goto L805
        L71a:
            java.lang.String r2 = "KEY_F5"
            goto L805
        L71e:
            java.lang.String r2 = "KEY_F4"
            goto L805
        L722:
            java.lang.String r2 = "KEY_F3"
            goto L805
        L726:
            java.lang.String r2 = "KEY_F2"
            goto L805
        L72a:
            java.lang.String r2 = "KEY_F1"
            goto L805
        L72e:
            java.lang.String r2 = "KEY_CAPSLOCK"
            goto L805
        L732:
            java.lang.String r2 = "KEY_SPACE"
            goto L805
        L736:
            java.lang.String r2 = "KEY_LEFTALT"
            goto L805
        L73a:
            java.lang.String r2 = "KEY_KPASTERISK"
            goto L805
        L73e:
            java.lang.String r2 = "KEY_RIGHTSHIFT"
            goto L805
        L742:
            java.lang.String r2 = "KEY_SLASH"
            goto L805
        L746:
            java.lang.String r2 = "KEY_DOT"
            goto L805
        L74a:
            java.lang.String r2 = "KEY_COMMA"
            goto L805
        L74e:
            java.lang.String r2 = "KEY_M"
            goto L805
        L752:
            java.lang.String r2 = "KEY_N"
            goto L805
        L756:
            java.lang.String r2 = "KEY_B"
            goto L805
        L75a:
            java.lang.String r2 = "KEY_V"
            goto L805
        L75e:
            java.lang.String r2 = "KEY_C"
            goto L805
        L762:
            java.lang.String r2 = "KEY_X"
            goto L805
        L766:
            java.lang.String r2 = "KEY_Z"
            goto L805
        L76a:
            java.lang.String r2 = "KEY_BACKSLASH"
            goto L805
        L76e:
            java.lang.String r2 = "KEY_LEFTSHIFT"
            goto L805
        L772:
            java.lang.String r2 = "KEY_GRAVE"
            goto L805
        L776:
            java.lang.String r2 = "KEY_APOSTROPHE"
            goto L805
        L77a:
            java.lang.String r2 = "KEY_SEMICOLON"
            goto L805
        L77e:
            java.lang.String r2 = "KEY_L"
            goto L805
        L782:
            java.lang.String r2 = "KEY_K"
            goto L805
        L786:
            java.lang.String r2 = "KEY_J"
            goto L805
        L78a:
            java.lang.String r2 = "KEY_H"
            goto L805
        L78e:
            java.lang.String r2 = "KEY_G"
            goto L805
        L792:
            java.lang.String r2 = "KEY_F"
            goto L805
        L796:
            java.lang.String r2 = "KEY_D"
            goto L805
        L79a:
            java.lang.String r2 = "KEY_S"
            goto L805
        L79e:
            java.lang.String r2 = "KEY_A"
            goto L805
        L7a2:
            java.lang.String r2 = "KEY_LEFTCTRL"
            goto L805
        L7a6:
            java.lang.String r2 = "KEY_ENTER"
            goto L805
        L7aa:
            java.lang.String r2 = "KEY_RIGHTBRACE"
            goto L805
        L7ae:
            java.lang.String r2 = "KEY_LEFTBRACE"
            goto L805
        L7b2:
            java.lang.String r2 = "KEY_P"
            goto L805
        L7b6:
            java.lang.String r2 = "KEY_O"
            goto L805
        L7b9:
            java.lang.String r2 = "KEY_I"
            goto L805
        L7bc:
            java.lang.String r2 = "KEY_U"
            goto L805
        L7bf:
            java.lang.String r2 = "KEY_Y"
            goto L805
        L7c2:
            java.lang.String r2 = "KEY_T"
            goto L805
        L7c5:
            java.lang.String r2 = "KEY_R"
            goto L805
        L7c8:
            java.lang.String r2 = "KEY_E"
            goto L805
        L7cb:
            java.lang.String r2 = "KEY_W"
            goto L805
        L7ce:
            java.lang.String r2 = "KEY_Q"
            goto L805
        L7d1:
            java.lang.String r2 = "KEY_TAB"
            goto L805
        L7d4:
            java.lang.String r2 = "KEY_BACKSPACE"
            goto L805
        L7d7:
            java.lang.String r2 = "KEY_EQUAL"
            goto L805
        L7da:
            java.lang.String r2 = "KEY_MINUS"
            goto L805
        L7dd:
            java.lang.String r2 = "KEY_0"
            goto L805
        L7e0:
            java.lang.String r2 = "KEY_9"
            goto L805
        L7e3:
            java.lang.String r2 = "KEY_8"
            goto L805
        L7e6:
            java.lang.String r2 = "KEY_7"
            goto L805
        L7e9:
            java.lang.String r2 = "KEY_6"
            goto L805
        L7ec:
            java.lang.String r2 = "KEY_5"
            goto L805
        L7ef:
            java.lang.String r2 = "KEY_4"
            goto L805
        L7f2:
            java.lang.String r2 = "KEY_3"
            goto L805
        L7f5:
            java.lang.String r2 = "KEY_2"
            goto L805
        L7f8:
            java.lang.String r2 = "KEY_1"
            goto L805
        L7fb:
            java.lang.String r2 = "KEY_ESC"
            goto L805
        L7fe:
            r2 = 2131296805(0x7f090225, float:1.8211537E38)
            java.lang.String r2 = android.ext.b2.f(r2)
        L805:
            return r2
    }

    private static java.lang.String g() {
            r0 = 0
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.lang.NullPointerException -> La
            android.ext.z1$d r1 = r1.v0     // Catch: java.lang.NullPointerException -> La
            if (r1 != 0) goto L8
            goto La
        L8:
            java.lang.String r0 = r1.f1434c     // Catch: java.lang.NullPointerException -> La
        La:
            return r0
    }

    public static void h() {
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            i(r0)
            java.lang.String r1 = g()
            r2 = 0
            r3 = 0
            r4 = 0
        Le:
            a.e r5 = android.ext.Config.H
            int r5 = r5.size()
            if (r3 >= r5) goto La5
            a.e r5 = android.ext.Config.H
            java.lang.Object r5 = r5.valueAt(r3)
            android.ext.Config$p r5 = (android.ext.Config.p) r5
            java.lang.String r6 = r5.f41c
            boolean r7 = r5.f45g
            if (r7 == 0) goto L3c
            if (r1 != 0) goto L28
            goto La1
        L28:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r8 = 45
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L3c:
            int r7 = r5.f40b     // Catch: java.lang.ClassCastException -> L45
            int r7 = r0.getInt(r6, r7)     // Catch: java.lang.ClassCastException -> L45
            r5.f42d = r7     // Catch: java.lang.ClassCastException -> L45
            goto L6e
        L45:
            java.lang.String r7 = r5.f41c     // Catch: java.lang.ClassCastException -> L57
            int r8 = r5.f40b     // Catch: java.lang.ClassCastException -> L57
            r9 = 1
            if (r8 != r9) goto L4e
            r8 = 1
            goto L4f
        L4e:
            r8 = 0
        L4f:
            boolean r7 = r0.getBoolean(r7, r8)     // Catch: java.lang.ClassCastException -> L57
            r5.f42d = r7     // Catch: java.lang.ClassCastException -> L57
            r4 = 1
            goto L6e
        L57:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Failed load data for "
            r8.append(r9)
            java.lang.String r9 = r5.f41c
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.ext.e1.l(r8, r7)
        L6e:
            boolean r7 = r5.f43e
            if (r7 == 0) goto La1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "-2"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            int r6 = r0.getInt(r6, r2)     // Catch: java.lang.ClassCastException -> L8a
            r5.f44f = r6     // Catch: java.lang.ClassCastException -> L8a
            goto La1
        L8a:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed load data2 for "
            r7.append(r8)
            java.lang.String r5 = r5.f41c
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.ext.e1.l(r5, r6)
        La1:
            int r3 = r3 + 1
            goto Le
        La5:
            if (r4 == 0) goto Lab
            k()
            goto Lae
        Lab:
            j()
        Lae:
            return
    }

    private static void i(android.content.SharedPreferences r6) {
            java.lang.String r0 = "ignore"
            r1 = 0
            long r3 = r6.getLong(r0, r1)
            android.ext.Config.f30c = r3
            java.lang.String r0 = "memory-from"
            long r0 = r6.getLong(r0, r1)
            android.ext.Config.f31d = r0
            java.lang.String r0 = "memory-to"
            r1 = -1
            long r3 = r6.getLong(r0, r1)
            android.ext.Config.f32e = r3
            java.lang.String r0 = "nearby-distance"
            r3 = 512(0x200, double:2.53E-321)
            long r3 = r6.getLong(r0, r3)
            android.ext.Config.f33f = r3
            r0 = 0
        L27:
            long[] r3 = android.ext.Config.f29b
            int r4 = r3.length
            if (r0 >= r4) goto L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "toolbar-buttons-"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            long r4 = r6.getLong(r4, r1)
            r3[r0] = r4
            int r0 = r0 + 1
            goto L27
        L46:
            boolean r6 = android.ext.MainService.I0
            if (r6 == 0) goto L4f
            android.ext.MainService r6 = android.ext.MainService.instance
            r6.q1()
        L4f:
            return
    }

    private static void j() {
            r()
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 == 0) goto L2b
            android.ext.MainService r0 = android.ext.MainService.instance
            android.widget.ListView r0 = r0.Y
            if (r0 == 0) goto L1f
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.MainService r1 = android.ext.MainService.instance
            android.widget.ListView r1 = r1.Y
            android.widget.ListAdapter r1 = r1.getAdapter()
            r0.V(r1)
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.X0()
        L1f:
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            r0.w0()
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.p1()
        L2b:
            return
    }

    public static void k() {
            android.ext.g2 r0 = new android.ext.g2
            r0.<init>()
            l(r0)
            java.lang.String r1 = g()
            r2 = 0
            r3 = 0
        Le:
            a.e r4 = android.ext.Config.H
            int r4 = r4.size()
            if (r3 >= r4) goto L5f
            a.e r4 = android.ext.Config.H
            java.lang.Object r4 = r4.valueAt(r3)
            android.ext.Config$p r4 = (android.ext.Config.p) r4
            java.lang.String r5 = r4.f41c
            boolean r6 = r4.f45g
            if (r6 == 0) goto L3b
            if (r1 != 0) goto L27
            goto L5c
        L27:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r7 = 45
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L3b:
            int r6 = r4.f42d
            int r7 = r4.f40b
            r0.g(r5, r6, r7)
            boolean r6 = r4.f43e
            if (r6 == 0) goto L5c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "-2"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            int r4 = r4.f44f
            r0.g(r5, r4, r2)
        L5c:
            int r3 = r3 + 1
            goto Le
        L5f:
            r0.commit()
            j()
            return
    }

    private static void l(android.ext.g2 r12) {
            java.lang.String r1 = "ignore"
            long r2 = android.ext.Config.f30c
            r4 = 0
            r0 = r12
            r0.i(r1, r2, r4)
            java.lang.String r7 = "memory-from"
            long r8 = android.ext.Config.f31d
            r10 = 0
            r6 = r12
            r6.i(r7, r8, r10)
            java.lang.String r1 = "memory-to"
            long r2 = android.ext.Config.f32e
            r4 = -1
            r0.i(r1, r2, r4)
            java.lang.String r7 = "nearby-distance"
            long r8 = android.ext.Config.f33f
            r10 = 512(0x200, double:2.53E-321)
            r6.i(r7, r8, r10)
            r0 = 0
        L27:
            long[] r1 = android.ext.Config.f29b
            int r2 = r1.length
            if (r0 >= r2) goto L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "toolbar-buttons-"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r6 = r1[r0]
            r8 = -1
            r4 = r12
            r4.i(r5, r6, r8)
            int r0 = r0 + 1
            goto L27
        L48:
            return
    }

    public static android.widget.ImageView m(android.widget.ImageView r1) {
            int r0 = android.ext.Tools.H()
            android.widget.ImageView r1 = o(r1, r0, r0)
            return r1
    }

    public static android.widget.ImageView n(android.widget.ImageView r1, int r2) {
            int r0 = android.ext.Tools.H()
            android.widget.ImageView r1 = p(r1, r0, r0, r2)
            return r1
    }

    public static android.widget.ImageView o(android.widget.ImageView r1, int r2, int r3) {
            int r0 = d()
            android.widget.ImageView r1 = p(r1, r2, r3, r0)
            return r1
    }

    public static android.widget.ImageView p(android.widget.ImageView r1, int r2, int r3, int r4) {
            r0 = 0
            r1.setAdjustViewBounds(r0)
            r1.setMinimumWidth(r2)
            r1.setMinimumHeight(r3)
            float r4 = (float) r4
            float r4 = android.ext.Tools.G(r4)
            int r4 = (int) r4
            if (r2 <= r4) goto L16
            int r2 = r2 - r4
            int r2 = r2 / 2
            goto L17
        L16:
            r2 = 0
        L17:
            if (r3 <= r4) goto L1c
            int r3 = r3 - r4
            int r0 = r3 / 2
        L1c:
            r1.setPadding(r2, r0, r2, r0)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.Throwable -> L25
            r1.setScaleType(r2)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            android.ext.e1.a(r2)
        L29:
            r1.invalidate()
            return r1
    }

    public static android.widget.ImageView q(android.widget.ImageView r1, int r2) {
            r0 = 0
            r1.setAdjustViewBounds(r0)
            r1.setMinimumWidth(r2)
            r1.setMinimumHeight(r2)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L17
            r0.width = r2
            r0.height = r2
            r1.setLayoutParams(r0)
        L17:
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r2)
            r1.invalidate()
            return r1
    }

    public static void r() {
            a.e r0 = android.ext.Config.H
            r1 = 2131034192(0x7f050050, float:1.7678895E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 != r4) goto L14
            r1 = 2
            goto L15
        L14:
            r1 = 0
        L15:
            r5 = 2131034402(0x7f050122, float:1.767932E38)
            java.lang.Object r5 = r0.get(r5)
            android.ext.Config$p r5 = (android.ext.Config.p) r5
            int r5 = r5.f42d
            if (r5 != r4) goto L24
            r1 = r1 | 4
        L24:
            r5 = 2131034159(0x7f05002f, float:1.7678828E38)
            java.lang.Object r5 = r0.get(r5)
            android.ext.Config$p r5 = (android.ext.Config.p) r5
            int r5 = r5.f42d
            if (r5 != 0) goto L34
            r5 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 | r5
        L34:
            r5 = 2131034153(0x7f050029, float:1.7678816E38)
            java.lang.Object r5 = r0.get(r5)
            android.ext.Config$p r5 = (android.ext.Config.p) r5
            int r5 = r5.f42d
            if (r5 != r4) goto L43
            r1 = r1 | 2048(0x800, float:2.87E-42)
        L43:
            r5 = 2131034215(0x7f050067, float:1.7678941E38)
            java.lang.Object r5 = r0.get(r5)
            android.ext.Config$p r5 = (android.ext.Config.p) r5
            int r5 = r5.f42d
            if (r5 != r4) goto L52
            r1 = r1 | 4096(0x1000, float:5.74E-42)
        L52:
            r5 = 2131034162(0x7f050032, float:1.7678834E38)
            java.lang.Object r5 = r0.get(r5)
            android.ext.Config$p r5 = (android.ext.Config.p) r5
            int r5 = r5.f42d
            if (r5 != r4) goto L62
            r5 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r5
        L62:
            r5 = 2131034195(0x7f050053, float:1.76789E38)
            java.lang.Object r5 = r0.get(r5)
            android.ext.Config$p r5 = (android.ext.Config.p) r5
            int r5 = r5.f42d
            if (r5 != r4) goto L71
            r1 = r1 | 1
        L71:
            if (r5 != r2) goto L75
            r1 = r1 | 1025(0x401, float:1.436E-42)
        L75:
            r5 = 2131034182(0x7f050046, float:1.7678874E38)
            java.lang.Object r5 = r0.get(r5)
            android.ext.Config$p r5 = (android.ext.Config.p) r5
            int r5 = r5.f42d
            if (r5 != r4) goto L84
            r1 = r1 | 8
        L84:
            if (r5 != r2) goto L88
            r1 = r1 | 16
        L88:
            r5 = 2131034186(0x7f05004a, float:1.7678882E38)
            java.lang.Object r6 = r0.get(r5)
            android.ext.Config$p r6 = (android.ext.Config.p) r6
            int r6 = r6.f42d
            if (r6 != r4) goto L97
            r1 = r1 | 32
        L97:
            r7 = 3
            if (r6 == r2) goto L9c
            if (r6 != r7) goto L9e
        L9c:
            r1 = r1 | 64
        L9e:
            r6 = 2131034167(0x7f050037, float:1.7678844E38)
            java.lang.Object r6 = r0.get(r6)
            android.ext.Config$p r6 = (android.ext.Config.p) r6
            int r6 = r6.f42d
            r8 = r6 & 1
            if (r8 == 0) goto Laf
            r1 = r1 | 128(0x80, float:1.8E-43)
        Laf:
            r8 = r6 & 2
            if (r8 == 0) goto Lb5
            r1 = r1 | 256(0x100, float:3.59E-43)
        Lb5:
            r8 = r6 & 4
            if (r8 == 0) goto Lbb
            r1 = r1 | 512(0x200, float:7.17E-43)
        Lbb:
            r6 = r6 & 8
            if (r6 == 0) goto Lc3
            r6 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r6
        Lc3:
            r6 = 2131034187(0x7f05004b, float:1.7678884E38)
            java.lang.Object r6 = r0.get(r6)
            android.ext.Config$p r6 = (android.ext.Config.p) r6
            int r6 = r6.f42d
            if (r6 != r4) goto Ld2
            r1 = r1 | 8192(0x2000, float:1.148E-41)
        Ld2:
            if (r6 != r2) goto Ld6
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        Ld6:
            if (r6 != r7) goto Ldb
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r2
        Ldb:
            android.ext.Config.A = r1
            r1 = 2131034177(0x7f050041, float:1.7678864E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto Leb
            r3 = 1
        Leb:
            r1 = 2131034150(0x7f050026, float:1.767881E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto Lfa
            r3 = r3 | 2
        Lfa:
            r1 = 2131034151(0x7f050027, float:1.7678811E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L109
            r3 = r3 | 4
        L109:
            r1 = 2131034201(0x7f050059, float:1.7678913E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L118
            r3 = r3 | 8
        L118:
            r1 = 2131034175(0x7f05003f, float:1.767886E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L127
            r3 = r3 | 16
        L127:
            r1 = 2131034212(0x7f050064, float:1.7678935E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L136
            r3 = r3 | 32
        L136:
            r1 = 2131034176(0x7f050040, float:1.7678862E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L145
            r3 = r3 | 64
        L145:
            r1 = 2131034205(0x7f05005d, float:1.767892E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L154
            r3 = r3 | 128(0x80, float:1.8E-43)
        L154:
            r1 = 2131034210(0x7f050062, float:1.7678931E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L163
            r3 = r3 | 256(0x100, float:3.59E-43)
        L163:
            r1 = 2131034154(0x7f05002a, float:1.7678818E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L172
            r3 = r3 | 2048(0x800, float:2.87E-42)
        L172:
            r1 = 2131034174(0x7f05003e, float:1.7678858E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L181
            r3 = r3 | 4096(0x1000, float:5.74E-42)
        L181:
            java.lang.Object r1 = r0.get(r5)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r7) goto L18d
            r3 = r3 | 8192(0x2000, float:1.148E-41)
        L18d:
            r1 = 2131034214(0x7f050066, float:1.767894E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L19c
            r3 = r3 | 512(0x200, float:7.17E-43)
        L19c:
            r1 = 2131034213(0x7f050065, float:1.7678937E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            if (r1 != r4) goto L1ab
            r3 = r3 | 1024(0x400, float:1.435E-42)
        L1ab:
            android.ext.Config.B = r3
            r1 = 2131034183(0x7f050047, float:1.7678876E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            r1.d()
            r1 = 2131034163(0x7f050033, float:1.7678836E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.f34g = r1
            r1 = 2131034188(0x7f05004c, float:1.7678886E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.h = r1
            r1 = 2131034189(0x7f05004d, float:1.7678889E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.i = r1
            r1 = 2131034194(0x7f050052, float:1.7678899E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.k = r1
            r1 = 2131034199(0x7f050057, float:1.7678909E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.l = r1
            r1 = 2131034166(0x7f050036, float:1.7678842E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.m = r1
            r1 = 2131034193(0x7f050051, float:1.7678897E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.n = r1
            r1 = 2131034173(0x7f05003d, float:1.7678856E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.o = r1
            r1 = 2131034207(0x7f05005f, float:1.7678925E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.p = r1
            r1 = 2131034211(0x7f050063, float:1.7678933E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.q = r1
            r1 = 2131034152(0x7f050028, float:1.7678813E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.r = r1
            r1 = 2131034216(0x7f050068, float:1.7678943E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            long r1 = r1.c()
            android.ext.Config.s = r1
            r1 = 2131034165(0x7f050035, float:1.767884E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.t = r1
            r1 = 2131034164(0x7f050034, float:1.7678838E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.u = r1
            r1 = 2131034204(0x7f05005c, float:1.7678919E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.v = r1
            r1 = 2131034169(0x7f050039, float:1.7678848E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.w = r1
            r1 = 2131034168(0x7f050038, float:1.7678846E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.x = r1
            r1 = 2131034158(0x7f05002e, float:1.7678826E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.y = r1
            r1 = 2131034157(0x7f05002d, float:1.7678824E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            android.ext.Config.z = r1
            r1 = 2131034197(0x7f050055, float:1.7678905E38)
            java.lang.Object r1 = r0.get(r1)
            android.ext.Config$p r1 = (android.ext.Config.p) r1
            int r1 = r1.f42d
            long r1 = (long) r1
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            r3 = 2131034209(0x7f050061, float:1.767893E38)
            java.lang.Object r0 = r0.get(r3)
            android.ext.Config$p r0 = (android.ext.Config.p) r0
            int r0 = r0.f42d
            long r3 = (long) r0
            r0 = 21
            long r3 = r3 << r0
            long r0 = r1 | r3
            android.ext.Config.j = r0
            return
    }

    public static void s(int[] r6) {
            if (r6 == 0) goto L32
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L32
        L6:
            int[] r0 = android.ext.Config.f28a
            int r1 = r0.length
            int r2 = r6.length
            int r3 = r1 + r2
            int[] r4 = new int[r3]
            r5 = 0
            java.lang.System.arraycopy(r0, r5, r4, r5, r1)
            java.lang.System.arraycopy(r6, r5, r4, r1, r2)
            java.util.Arrays.sort(r4)
            r6 = 1
            r0 = 1
        L1a:
            if (r6 >= r3) goto L2c
            r1 = r4[r6]
            int r2 = r6 + (-1)
            r2 = r4[r2]
            if (r1 == r2) goto L29
            int r2 = r0 + 1
            r4[r0] = r1
            r0 = r2
        L29:
            int r6 = r6 + 1
            goto L1a
        L2c:
            int[] r6 = java.util.Arrays.copyOf(r4, r0)
            android.ext.Config.f28a = r6
        L32:
            return
    }
}
