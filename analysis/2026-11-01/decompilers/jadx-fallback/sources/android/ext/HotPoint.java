package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class HotPoint extends android.ext.FloatPanel implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    private static volatile android.ext.HotPoint D;
    private boolean A;
    android.widget.ImageView B;
    android.widget.ImageView C;
    int p;
    int q;
    private final java.lang.Runnable r;
    android.widget.ImageView s;
    android.view.View t;
    android.view.View u;
    android.widget.TextView v;
    android.widget.ProgressBar w;
    android.widget.ProgressBar x;
    android.widget.TextView y;
    private android.view.WindowManager.LayoutParams z;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.HotPoint f158a;

        a(android.ext.HotPoint r1) {
                r0 = this;
                r0.f158a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.HotPoint r0 = r2.f158a
                r0.q()
                android.ext.HotPoint r0 = r2.f158a
                android.widget.ImageView r0 = r0.s
                r1 = 0
                android.ext.Tools.y1(r0, r1)
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.HotPoint f159a;

        class a implements android.view.View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.HotPoint.b f160a;

            a(android.ext.HotPoint.b r1) {
                    r0 = this;
                    r0.f160a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                    r0 = this;
                    android.ext.HotPoint$b r1 = r0.f160a
                    android.ext.HotPoint r1 = r1.f159a
                    r1.o()
                    return
            }
        }

        b(android.ext.HotPoint r1) {
                r0 = this;
                r0.f159a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r11 = this;
                android.ext.HotPoint r0 = r11.f159a
                r1 = 2131034287(0x7f0500af, float:1.7679087E38)
                android.view.View r1 = r0.findViewById(r1)
                r0.t = r1
                android.ext.HotPoint r0 = r11.f159a
                android.view.View r0 = r0.t
                android.ext.MainService r1 = android.ext.MainService.instance
                r0.setOnClickListener(r1)
                android.ext.HotPoint r0 = r11.f159a
                r1 = 2131034288(0x7f0500b0, float:1.767909E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.s = r1
                android.ext.HotPoint r0 = r11.f159a
                r1 = 2131034361(0x7f0500f9, float:1.7679237E38)
                android.view.View r1 = r0.findViewById(r1)
                r0.u = r1
                android.ext.HotPoint r0 = r11.f159a
                r1 = 2131034360(0x7f0500f8, float:1.7679235E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.v = r1
                android.ext.HotPoint r0 = r11.f159a
                r1 = 2131034357(0x7f0500f5, float:1.767923E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
                r0.w = r1
                android.ext.HotPoint r0 = r11.f159a
                r1 = 2131034358(0x7f0500f6, float:1.7679231E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
                r0.x = r1
                android.ext.HotPoint r0 = r11.f159a
                r1 = 2131034412(0x7f05012c, float:1.767934E38)
                android.view.View r1 = r0.findViewById(r1)
                android.view.View r1 = android.ext.Tools.O0(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0.y = r1
                android.ext.HotPoint r0 = r11.f159a
                r1 = 2131034411(0x7f05012b, float:1.7679339E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.B = r1
                android.ext.HotPoint r0 = r11.f159a
                r1 = 2131034410(0x7f05012a, float:1.7679337E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.C = r1
                android.ext.HotPoint r0 = r11.f159a
                android.widget.ImageView r1 = r0.B
                r1.setOnClickListener(r0)
                android.ext.HotPoint r0 = r11.f159a
                android.widget.ImageView r1 = r0.C
                r1.setOnClickListener(r0)
                android.ext.HotPoint r0 = r11.f159a
                android.widget.TextView r1 = r0.y
                r1.setOnLongClickListener(r0)
                android.ext.HotPoint r0 = r11.f159a
                android.widget.TextView r0 = r0.y
                android.ext.HotPoint$b$a r1 = new android.ext.HotPoint$b$a
                r1.<init>(r11)
                r0.addOnLayoutChangeListener(r1)
                android.ext.HotPoint r2 = r11.f159a
                r3 = 2
                r4 = -1
                r6 = 1
                r8 = 0
                r9 = 1
                java.lang.String r10 = ""
                r2.t(r3, r4, r6, r8, r9, r10)
                android.ext.HotPoint r0 = r11.f159a
                r0.s()
                android.ext.HotPoint r0 = r11.f159a
                r0.q()
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ java.lang.String f166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.ext.HotPoint f167g;

        c(android.ext.HotPoint r1, byte r2, long r3, long r5, int r7, int r8, java.lang.String r9) {
                r0 = this;
                r0.f167g = r1
                r0.f161a = r2
                r0.f162b = r3
                r0.f163c = r5
                r0.f164d = r7
                r0.f165e = r8
                r0.f166f = r9
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                android.ext.HotPoint r0 = r9.f167g
                byte r1 = r9.f161a
                long r2 = r9.f162b
                long r4 = r9.f163c
                int r6 = r9.f164d
                int r7 = r9.f165e
                java.lang.String r8 = r9.f166f
                r0.u(r1, r2, r4, r6, r7, r8)
                return
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.HotPoint f169b;

        d(android.ext.HotPoint r1, int r2) {
                r0 = this;
                r0.f169b = r1
                r0.f168a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                int r0 = r3.f168a
                r1 = -1
                if (r0 != r1) goto L15
                android.ext.HotPoint r0 = r3.f169b
                android.widget.ImageView r0 = r0.B
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 != r1) goto L13
                r0 = 0
                goto L15
            L13:
                r0 = 8
            L15:
                android.ext.HotPoint r1 = r3.f169b
                android.widget.ImageView r1 = r1.B
                r1.setVisibility(r0)
                android.ext.HotPoint r1 = r3.f169b
                android.widget.ImageView r1 = r1.C
                r1.setVisibility(r0)
                android.ext.HotPoint r1 = r3.f169b
                r2 = 1
                r1.setSpeedPanelVisibility(r2)
                android.ext.HotPoint r1 = r3.f169b
                r1.o()
                if (r0 != 0) goto L39
                android.ext.HotPoint r0 = r3.f169b
                int r1 = r0.p
                if (r1 < 0) goto L39
                r0.v(r2)
            L39:
                return
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.drawable.Drawable f170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.HotPoint f171b;

        e(android.ext.HotPoint r1, android.graphics.drawable.Drawable r2) {
                r0 = this;
                r0.f171b = r1
                r0.f170a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.HotPoint r0 = r3.f171b
                android.widget.TextView r1 = r0.y
                android.graphics.drawable.Drawable r2 = r3.f170a
                int r0 = r0.q
                int r0 = 24 - r0
                android.ext.Tools.c(r1, r2, r0)
                return
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.HotPoint f173b;

        f(android.ext.HotPoint r1, java.lang.String r2) {
                r0 = this;
                r0.f173b = r1
                r0.f172a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.HotPoint r0 = r2.f173b
                android.widget.TextView r0 = r0.y
                java.lang.String r1 = r2.f172a
                r0.setText(r1)
                android.ext.HotPoint r0 = r2.f173b
                r0.o()
                return
        }
    }

    static {
            return
    }

    public HotPoint(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.ext.HotPoint$a r1 = new android.ext.HotPoint$a
            r1.<init>(r0)
            r0.r = r1
            return
    }

    public static android.ext.HotPoint getInstance() {
            android.ext.HotPoint r0 = android.ext.HotPoint.D
            if (r0 != 0) goto L13
            r0 = 2131099653(0x7f060005, float:1.7811665E38)
            r1 = 0
            android.view.View r0 = a.d.f(r0, r1)
            android.ext.HotPoint r0 = (android.ext.HotPoint) r0
            r0.r()
            android.ext.HotPoint.D = r0
        L13:
            return r0
    }

    private void r() {
            r1 = this;
            android.ext.HotPoint$b r0 = new android.ext.HotPoint$b
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    private void setVisibilitySpeedhack(int r2) {
            r1 = this;
            android.ext.HotPoint$d r0 = new android.ext.HotPoint$d
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    private void w() {
            r4 = this;
            android.view.View r0 = r4.t
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r4.getMarginX()
            android.view.View r1 = r4.t
            r2 = 0
        Lc:
            if (r1 == r4) goto L21
            if (r1 == 0) goto L21
            int r3 = r1.getLeft()
            int r2 = r2 - r3
            android.view.ViewParent r1 = r1.getParent()
            boolean r3 = r1 instanceof android.view.View
            if (r3 != 0) goto L1e
            goto L21
        L1e:
            android.view.View r1 = (android.view.View) r1
            goto Lc
        L21:
            if (r0 == r2) goto L2c
            r4.setMarginX(r2)
            r4.l()
            r4.o()
        L2c:
            return
    }

    public void A(java.lang.String r2) {
            r1 = this;
            android.ext.HotPoint$f r0 = new android.ext.HotPoint$f
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    @Override // android.ext.FloatPanel
    protected java.lang.String d(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = super.d(r3)
            r0.append(r3)
            r3 = 32
            r0.append(r3)
            int r1 = r2.p
            r0.append(r1)
            r0.append(r3)
            int r3 = r2.q
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // android.ext.FloatPanel
    protected java.lang.String getPrefName() {
            r1 = this;
            java.lang.String r0 = "pos"
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.q
            return r0
    }

    public int getSizePx() {
            r1 = this;
            int r0 = r1.q
            int r0 = r0 * 2
            int r0 = 48 - r0
            float r0 = (float) r0
            float r0 = android.ext.Tools.G(r0)
            int r0 = (int) r0
            return r0
    }

    public int getVanishingTime() {
            r1 = this;
            int r0 = r1.p
            return r0
    }

    @Override // android.ext.FloatPanel
    protected void h(android.content.SharedPreferences r3) {
            r2 = this;
            super.h(r3)
            java.lang.String r0 = "vanishing-time"
            r1 = -1
            int r0 = r3.getInt(r0, r1)
            r2.p = r0
            java.lang.String r0 = "icon-size"
            r1 = 0
            int r3 = r3.getInt(r0, r1)
            r0 = 12
            int r3 = java.lang.Math.min(r0, r3)
            int r3 = java.lang.Math.max(r1, r3)
            r2.q = r3
            return
    }

    @Override // android.ext.FloatPanel
    protected void i() {
            r1 = this;
            super.i()
            r0 = 0
            r1.v(r0)
            r1.setSpeedPanelVisibility(r0)
            android.ext.TimeJumpPanel.s(r0)
            return
    }

    @Override // android.ext.FloatPanel
    protected void j() {
            r4 = this;
            super.j()
            int r0 = r4.getSizePx()
            android.widget.ImageView r1 = r4.B
            android.ext.Config.q(r1, r0)
            android.widget.ImageView r1 = r4.C
            android.ext.Config.q(r1, r0)
            android.widget.ImageView r1 = r4.s
            android.ext.Config.q(r1, r0)
            android.view.View r1 = r4.t
            r1.setMinimumWidth(r0)
            android.view.View r1 = r4.t
            r1.setMinimumHeight(r0)
            android.widget.TextView r1 = r4.v
            float r2 = (float) r0
            android.ext.Tools.G1(r1, r2)
            android.widget.TextView r1 = r4.v
            int r3 = r0 * 20
            int r3 = r3 / 48
            float r3 = (float) r3
            android.ext.Tools.x1(r1, r3)
            android.widget.ProgressBar r1 = r4.w
            android.ext.Tools.G1(r1, r2)
            android.widget.ProgressBar r1 = r4.w
            int r3 = r0 * 14
            int r3 = r3 / 48
            float r3 = (float) r3
            android.ext.Tools.x1(r1, r3)
            android.widget.ProgressBar r1 = r4.x
            android.ext.Tools.G1(r1, r2)
            android.widget.ProgressBar r1 = r4.x
            android.ext.Tools.x1(r1, r3)
            android.widget.TextView r1 = r4.v
            int r0 = r0 * 18
            int r0 = r0 / 48
            float r0 = (float) r0
            r2 = 0
            r1.setTextSize(r2, r0)
            android.widget.TextView r1 = r4.y
            r1.setTextSize(r2, r0)
            int r0 = r4.p
            r1 = 1
            if (r0 >= 0) goto L66
            android.widget.ImageView r0 = r4.s
            r2 = 1132396544(0x437f0000, float:255.0)
            android.ext.Tools.y1(r0, r2)
            goto L69
        L66:
            r4.v(r1)
        L69:
            r4.setSpeedPanelVisibility(r1)
            android.ext.TimeJumpPanel.s(r1)
            return
    }

    @Override // android.ext.FloatPanel
    public void o() {
            r5 = this;
            super.o()
            boolean r0 = r5.A
            if (r0 == 0) goto L75
            android.graphics.Point r0 = new android.graphics.Point
            r1 = 0
            r0.<init>(r1, r1)
            android.graphics.Point r2 = new android.graphics.Point
            android.view.WindowManager$LayoutParams r3 = r5.f137a
            int r4 = r3.x
            int r3 = r3.y
            r2.<init>(r4, r3)
            android.graphics.Point r2 = r5.a(r2, r1, r0)
            int r3 = r2.x
            if (r3 >= 0) goto L22
            r2.x = r1
        L22:
            int r1 = r2.x
            int r3 = r0.x
            int r4 = r5.getMarginX()
            int r3 = r3 + r4
            if (r1 <= r3) goto L36
            int r1 = r0.x
            int r3 = r5.getMarginX()
            int r1 = r1 + r3
            r2.x = r1
        L36:
            android.view.WindowManager$LayoutParams r1 = r5.z
            int r3 = r2.x
            int r4 = r5.getWidth()
            int r4 = r4 / 2
            int r3 = r3 + r4
            android.widget.TextView r4 = r5.y
            int r4 = r4.getWidth()
            int r4 = r4 / 2
            int r3 = r3 - r4
            r1.x = r3
            android.view.WindowManager$LayoutParams r1 = r5.z
            int r3 = r2.y
            int r4 = r5.getHeight()
            int r3 = r3 + r4
            r1.y = r3
            int r1 = r0.y
            if (r1 == 0) goto L6e
            android.widget.TextView r1 = r5.y
            int r1 = r1.getHeight()
            int r0 = r0.y
            int r2 = r2.y
            int r3 = r2 + r1
            if (r0 >= r3) goto L6e
            android.view.WindowManager$LayoutParams r0 = r5.z
            int r2 = r2 - r1
            r0.y = r2
        L6e:
            android.widget.TextView r0 = r5.y
            android.view.WindowManager$LayoutParams r1 = r5.z
            android.ext.Tools.V1(r0, r1)
        L75:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.B
            if (r2 != r0) goto La
            android.ext.MainService r2 = android.ext.MainService.instance
            r2.T()
            goto L13
        La:
            android.widget.ImageView r0 = r1.C
            if (r2 != r0) goto L13
            android.ext.MainService r2 = android.ext.MainService.instance
            r2.u0()
        L13:
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.w()
            return
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r1) {
            r0 = this;
            android.ext.MainService r1 = android.ext.MainService.instance
            r1.K0()
            r1 = 1
            return r1
    }

    public void q() {
            r1 = this;
            r0 = 8
            r1.setVisibilitySpeedhack(r0)
            return
    }

    void s() {
            r3 = this;
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r3.z = r0
            r1 = 51
            r0.gravity = r1
            int r1 = android.ext.m2.b()
            r0.type = r1
            android.view.WindowManager$LayoutParams r0 = r3.z
            r1 = -2
            r0.format = r1
            int r2 = android.ext.m2.a()
            r2 = r2 | 512(0x200, float:7.17E-43)
            r0.flags = r2
            android.view.WindowManager$LayoutParams r0 = r3.z
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.alpha = r2
            r0.width = r1
            r0.height = r1
            return
    }

    @Override // android.ext.FloatPanel
    public void setLayoutAlpha(float r2) {
            r1 = this;
            android.view.WindowManager$LayoutParams r0 = r1.z
            r0.alpha = r2
            super.setLayoutAlpha(r2)
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.TimeJumpPanel r0 = r0.k
            if (r0 == 0) goto L10
            r0.setLayoutAlpha(r2)
        L10:
            return
    }

    public void setSize(int r4) {
            r3 = this;
            r0 = 12
            int r4 = java.lang.Math.min(r0, r4)
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            int r1 = r3.q
            if (r1 != r4) goto L10
            return
        L10:
            android.ext.g2 r1 = new android.ext.g2
            r1.<init>()
            java.lang.String r2 = "icon-size"
            android.ext.g2 r0 = r1.g(r2, r4, r0)
            r0.commit()
            r3.q = r4
            return
    }

    void setSpeedPanelVisibility(boolean r6) {
            r5 = this;
            android.widget.ImageView r0 = r5.B
            int r0 = r0.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            boolean r3 = r5.A
            if (r3 == 0) goto L1f
            android.widget.TextView r3 = r5.y     // Catch: java.lang.Throwable -> L17
            android.ext.Tools.n1(r3)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L17:
            r3 = move-exception
            java.lang.String r4 = "Failed hide speed panel"
            android.ext.e1.s(r4, r3)
        L1d:
            r5.A = r1
        L1f:
            if (r6 == 0) goto L33
            if (r0 == 0) goto L33
            r5.A = r2
            android.widget.TextView r6 = r5.y     // Catch: java.lang.Throwable -> L2d
            android.view.WindowManager$LayoutParams r0 = r5.z     // Catch: java.lang.Throwable -> L2d
            android.ext.Tools.g(r6, r0)     // Catch: java.lang.Throwable -> L2d
            goto L33
        L2d:
            r6 = move-exception
            java.lang.String r0 = "Failed add speed panel"
            android.ext.e1.s(r0, r6)
        L33:
            return
    }

    public void setVanishingTime(int r4) {
            r3 = this;
            int r0 = r3.p
            if (r0 != r4) goto L5
            return
        L5:
            android.ext.g2 r0 = new android.ext.g2
            r0.<init>()
            java.lang.String r1 = "vanishing-time"
            r2 = -1
            android.ext.g2 r0 = r0.g(r1, r4, r2)
            r0.commit()
            r3.p = r4
            return
    }

    public void t(byte r12, long r13, long r15, int r17, int r18, java.lang.String r19) {
            r11 = this;
            boolean r0 = android.ext.n2.e()
            if (r0 == 0) goto La
            r11.u(r12, r13, r15, r17, r18, r19)
            goto L1d
        La:
            android.ext.HotPoint$c r0 = new android.ext.HotPoint$c
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r13
            r6 = r15
            r8 = r17
            r9 = r18
            r10 = r19
            r1.<init>(r2, r3, r4, r6, r8, r9, r10)
            android.ext.n2.i(r0)
        L1d:
            return
    }

    void u(byte r6, long r7, long r9, int r11, int r12, java.lang.String r13) {
            r5 = this;
            r0 = 8
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L11
            android.view.View r3 = r5.u
            if (r6 != r2) goto Lc
            r6 = 0
            goto Le
        Lc:
            r6 = 8
        Le:
            r3.setVisibility(r6)
        L11:
            r3 = 0
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 < 0) goto L33
            int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r6 != 0) goto L1c
            goto L33
        L1c:
            android.widget.ProgressBar r6 = r5.w
            r6.setIndeterminate(r1)
            android.widget.ProgressBar r6 = r5.w
            int r10 = (int) r9
            r6.setMax(r10)
            android.widget.ProgressBar r6 = r5.w
            int r8 = (int) r7
            r6.setProgress(r8)
            android.widget.TextView r6 = r5.v
            r6.setText(r13)
            goto L3d
        L33:
            android.widget.TextView r6 = r5.v
            r6.setText(r13)
            android.widget.ProgressBar r6 = r5.w
            r6.setIndeterminate(r2)
        L3d:
            if (r11 < 0) goto L54
            android.widget.ProgressBar r6 = r5.x
            if (r12 > r2) goto L47
            r6.setVisibility(r0)
            goto L54
        L47:
            r6.setMax(r12)
            android.widget.ProgressBar r6 = r5.x
            r6.setProgress(r11)
            android.widget.ProgressBar r6 = r5.x
            r6.setVisibility(r1)
        L54:
            return
    }

    void v(boolean r4) {
            r3 = this;
            android.os.Handler r0 = android.ext.n2.d()     // Catch: java.lang.Throwable -> La
            java.lang.Runnable r1 = r3.r     // Catch: java.lang.Throwable -> La
            r0.removeCallbacks(r1)     // Catch: java.lang.Throwable -> La
            goto Le
        La:
            r0 = move-exception
            android.ext.e1.a(r0)
        Le:
            if (r4 == 0) goto L30
            android.widget.ImageView r4 = r3.s
            r0 = 1132396544(0x437f0000, float:255.0)
            android.ext.Tools.y1(r4, r0)
            android.os.Handler r4 = android.ext.n2.d()     // Catch: java.lang.Throwable -> L26
            java.lang.Runnable r0 = r3.r     // Catch: java.lang.Throwable -> L26
            int r1 = r3.p     // Catch: java.lang.Throwable -> L26
            int r1 = r1 * 1000
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L26
            r4.postDelayed(r0, r1)     // Catch: java.lang.Throwable -> L26
            goto L30
        L26:
            r4 = move-exception
            android.ext.e1.a(r4)
            android.widget.ImageView r4 = r3.s
            r0 = 0
            android.ext.Tools.y1(r4, r0)
        L30:
            return
    }

    public void x() {
            r1 = this;
            r0 = -1
            r1.setVisibilitySpeedhack(r0)
            return
    }

    public void y(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.ext.HotPoint$e r0 = new android.ext.HotPoint$e
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    public void z() {
            r1 = this;
            boolean r0 = r1.g()
            android.ext.TimeJumpPanel.s(r0)
            return
    }
}
