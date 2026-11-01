package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class FloatPanel extends android.fix.LinearLayout {
    private static float o = 36.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected android.view.WindowManager.LayoutParams f137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.WindowManager f138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f143g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    boolean l;
    boolean m;
    public final java.lang.String n;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.FloatPanel f144a;

        a(android.ext.FloatPanel r1) {
                r0 = this;
                r0.f144a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.FloatPanel r0 = r2.f144a
                java.lang.String r1 = "show"
                java.lang.String r0 = r0.d(r1)
                android.ext.e1.d(r0)
                android.ext.FloatPanel r0 = r2.f144a
                boolean r1 = r0.m
                if (r1 == 0) goto L12
                return
            L12:
                r0.j()
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.FloatPanel f145a;

        b(android.ext.FloatPanel r1) {
                r0 = this;
                r0.f145a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.FloatPanel r0 = r2.f145a
                java.lang.String r1 = "hide"
                java.lang.String r0 = r0.d(r1)
                android.ext.e1.d(r0)
                android.ext.FloatPanel r0 = r2.f145a
                boolean r1 = r0.l
                if (r1 != 0) goto L12
                return
            L12:
                r1 = 0
                r0.l = r1
                r0.i()
                return
        }
    }

    static {
            return
    }

    public FloatPanel(android.content.Context r12) {
            r11 = this;
            r11.<init>(r12)
            r12 = 0
            r11.i = r12
            r0 = 1
            r11.k = r0
            r11.l = r12
            r11.m = r12
            android.content.Context r1 = r11.getContext()
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            r11.j = r2
            java.lang.String r2 = r11.getPrefName()
            r11.n = r2
            java.lang.String r2 = "window"
            java.lang.Object r2 = r1.getSystemService(r2)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r11.f138b = r2
            android.view.WindowManager$LayoutParams r2 = new android.view.WindowManager$LayoutParams     // Catch: java.lang.Throwable -> L13d
            r2.<init>()     // Catch: java.lang.Throwable -> L13d
            r11.f137a = r2     // Catch: java.lang.Throwable -> L13d
            r3 = 51
            r2.gravity = r3     // Catch: java.lang.Throwable -> L13d
            int r3 = android.ext.m2.b()     // Catch: java.lang.Throwable -> L13d
            r2.type = r3     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r2 = r11.f137a     // Catch: java.lang.Throwable -> L13d
            r3 = -2
            r2.format = r3     // Catch: java.lang.Throwable -> L13d
            int r4 = android.ext.m2.a()     // Catch: java.lang.Throwable -> L13d
            r2.flags = r4     // Catch: java.lang.Throwable -> L13d
            java.lang.String r2 = android.ext.MainService.G0     // Catch: java.lang.Throwable -> L13d
            android.content.SharedPreferences r2 = r1.getSharedPreferences(r2, r12)     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r4 = r11.f137a     // Catch: java.lang.Throwable -> L13d
            r5 = 0
            r4.alpha = r5     // Catch: java.lang.Throwable -> L13d
            r11.h(r2)     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r4 = r11.f137a     // Catch: java.lang.Throwable -> L13d
            r4.width = r3     // Catch: java.lang.Throwable -> L13d
            r4.height = r3     // Catch: java.lang.Throwable -> L13d
            java.lang.String r3 = "fkhfnShuplvvlrqCdqgurlg1shuplvvlrq1LQWHUQHWCdqgurlg1rv1SurfhvvCp|SlgCp|XlgCdqgurlg1h{w1PdlqVhuylfhClqvwdqfhCdqgurlg1h{w1FrqiljCyVsdfhUhdo"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r4 = "@"
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L13d
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = r3[r12]     // Catch: java.lang.Throwable -> L13d
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r8 = r5.getClass()     // Catch: java.lang.Throwable -> L13d
            r7[r12] = r8     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L13d
            r7[r0] = r8     // Catch: java.lang.Throwable -> L13d
            r9 = 2
            r7[r9] = r8     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L13d
            r7 = r3[r0]     // Catch: java.lang.Throwable -> L13d
            r5[r12] = r7     // Catch: java.lang.Throwable -> L13d
            r7 = r3[r9]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L13d
            r8 = r3[r6]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class[] r10 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r7 = r7.invoke(r1, r8)     // Catch: java.lang.Throwable -> L13d
            r5[r0] = r7     // Catch: java.lang.Throwable -> L13d
            r0 = r3[r9]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13d
            r7 = 4
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class[] r10 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Method r0 = r0.getMethod(r8, r10)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r0 = r0.invoke(r1, r8)     // Catch: java.lang.Throwable -> L13d
            r5[r9] = r0     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r0 = r4.invoke(r1, r5)     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r1 = r11.f137a     // Catch: java.lang.Throwable -> L13d
            boolean r4 = r11.f()     // Catch: java.lang.Throwable -> L13d
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto Lc3
            goto Lc9
        Lc3:
            java.lang.String r4 = "opacity"
            float r5 = r2.getFloat(r4, r5)     // Catch: java.lang.Throwable -> L13d
        Lc9:
            r1.alpha = r5     // Catch: java.lang.Throwable -> L13d
            r1 = r3[r9]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13d
            r2 = r3[r6]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class[] r4 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r12 = r1.invoke(r0, r12)     // Catch: java.lang.Throwable -> L13d
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L13d
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L13d
            r1 = r0
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L13d
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L13d
            int r12 = r12 / r1
            r1 = 7
            r1 = r3[r1]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13d
            r2 = 8
            r2 = r3[r2]     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13d
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L13d
            int r0 = r0 - r7
            int r12 = r12 / r0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r0 = r11.f137a     // Catch: java.lang.Throwable -> L13d
            int r1 = r0.flags     // Catch: java.lang.Throwable -> L13d
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.flags = r1     // Catch: java.lang.Throwable -> L13d
            r0 = 5
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13d
            r1 = 6
            r1 = r3[r1]     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> L13d
            r1 = 0
            r0.set(r12, r1)     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r12 = r11.f137a     // Catch: java.lang.Throwable -> L13d
            r0 = 1109393408(0x42200000, float:40.0)
            float r1 = android.ext.Tools.G(r0)     // Catch: java.lang.Throwable -> L13d
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L13d
            r12.width = r1     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r12 = r11.f137a     // Catch: java.lang.Throwable -> L13d
            float r0 = android.ext.Tools.G(r0)     // Catch: java.lang.Throwable -> L13d
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L13d
            r12.height = r0     // Catch: java.lang.Throwable -> L13d
            goto L13e
        L13d:
        L13e:
            boolean r12 = r11.isInEditMode()
            if (r12 != 0) goto L14c
            r12 = 1108344832(0x42100000, float:36.0)
            float r12 = android.ext.Tools.G(r12)
            android.ext.FloatPanel.o = r12
        L14c:
            return
    }

    public FloatPanel(android.content.Context r11, android.util.AttributeSet r12) {
            r10 = this;
            r10.<init>(r11, r12)
            r11 = 0
            r10.i = r11
            r12 = 1
            r10.k = r12
            r10.l = r11
            r10.m = r11
            android.content.Context r0 = r10.getContext()
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r10.j = r1
            java.lang.String r1 = r10.getPrefName()
            r10.n = r1
            java.lang.String r1 = "window"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            r10.f138b = r1
            android.view.WindowManager$LayoutParams r1 = new android.view.WindowManager$LayoutParams     // Catch: java.lang.Throwable -> L13d
            r1.<init>()     // Catch: java.lang.Throwable -> L13d
            r10.f137a = r1     // Catch: java.lang.Throwable -> L13d
            r2 = 51
            r1.gravity = r2     // Catch: java.lang.Throwable -> L13d
            int r2 = android.ext.m2.b()     // Catch: java.lang.Throwable -> L13d
            r1.type = r2     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r1 = r10.f137a     // Catch: java.lang.Throwable -> L13d
            r2 = -2
            r1.format = r2     // Catch: java.lang.Throwable -> L13d
            int r3 = android.ext.m2.a()     // Catch: java.lang.Throwable -> L13d
            r1.flags = r3     // Catch: java.lang.Throwable -> L13d
            java.lang.String r1 = android.ext.MainService.G0     // Catch: java.lang.Throwable -> L13d
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r11)     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r3 = r10.f137a     // Catch: java.lang.Throwable -> L13d
            r4 = 0
            r3.alpha = r4     // Catch: java.lang.Throwable -> L13d
            r10.h(r1)     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r3 = r10.f137a     // Catch: java.lang.Throwable -> L13d
            r3.width = r2     // Catch: java.lang.Throwable -> L13d
            r3.height = r2     // Catch: java.lang.Throwable -> L13d
            java.lang.String r2 = "fkhfnShuplvvlrqCdqgurlg1shuplvvlrq1LQWHUQHWCdqgurlg1rv1SurfhvvCp|SlgCp|XlgCdqgurlg1h{w1PdlqVhuylfhClqvwdqfhCdqgurlg1h{w1FrqiljCyVsdfhUhdo"
            java.lang.String r2 = android.ext.Tools.removeNewLinesChars(r2)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r3 = "@"
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Throwable -> L13d
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = r2[r11]     // Catch: java.lang.Throwable -> L13d
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L13d
            r6[r11] = r7     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L13d
            r6[r12] = r7     // Catch: java.lang.Throwable -> L13d
            r8 = 2
            r6[r8] = r7     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L13d
            r6 = r2[r12]     // Catch: java.lang.Throwable -> L13d
            r4[r11] = r6     // Catch: java.lang.Throwable -> L13d
            r6 = r2[r8]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L13d
            r7 = r2[r5]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class[] r9 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Method r6 = r6.getMethod(r7, r9)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r6 = r6.invoke(r0, r7)     // Catch: java.lang.Throwable -> L13d
            r4[r12] = r6     // Catch: java.lang.Throwable -> L13d
            r12 = r2[r8]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L13d
            r6 = 4
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class[] r9 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Method r12 = r12.getMethod(r7, r9)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r12 = r12.invoke(r0, r7)     // Catch: java.lang.Throwable -> L13d
            r4[r8] = r12     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r12 = r3.invoke(r0, r4)     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r0 = r10.f137a     // Catch: java.lang.Throwable -> L13d
            boolean r3 = r10.f()     // Catch: java.lang.Throwable -> L13d
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto Lc3
            goto Lc9
        Lc3:
            java.lang.String r3 = "opacity"
            float r4 = r1.getFloat(r3, r4)     // Catch: java.lang.Throwable -> L13d
        Lc9:
            r0.alpha = r4     // Catch: java.lang.Throwable -> L13d
            r0 = r2[r8]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13d
            r1 = r2[r5]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class[] r3 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r11 = r0.invoke(r12, r11)     // Catch: java.lang.Throwable -> L13d
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L13d
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L13d
            r0 = r12
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L13d
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L13d
            int r11 = r11 / r0
            r0 = 7
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13d
            r1 = 8
            r1 = r2[r1]     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r12 = r0.get(r12)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L13d
            int r12 = r12.length()     // Catch: java.lang.Throwable -> L13d
            int r12 = r12 - r6
            int r11 = r11 / r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r12 = r10.f137a     // Catch: java.lang.Throwable -> L13d
            int r0 = r12.flags     // Catch: java.lang.Throwable -> L13d
            r0 = r0 | 256(0x100, float:3.59E-43)
            r12.flags = r0     // Catch: java.lang.Throwable -> L13d
            r12 = 5
            r12 = r2[r12]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L13d
            r0 = 6
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Field r12 = r12.getField(r0)     // Catch: java.lang.Throwable -> L13d
            r0 = 0
            r12.set(r11, r0)     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r11 = r10.f137a     // Catch: java.lang.Throwable -> L13d
            r12 = 1109393408(0x42200000, float:40.0)
            float r0 = android.ext.Tools.G(r12)     // Catch: java.lang.Throwable -> L13d
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L13d
            r11.width = r0     // Catch: java.lang.Throwable -> L13d
            android.view.WindowManager$LayoutParams r11 = r10.f137a     // Catch: java.lang.Throwable -> L13d
            float r12 = android.ext.Tools.G(r12)     // Catch: java.lang.Throwable -> L13d
            int r12 = (int) r12     // Catch: java.lang.Throwable -> L13d
            r11.height = r12     // Catch: java.lang.Throwable -> L13d
            goto L13e
        L13d:
        L13e:
            boolean r11 = r10.isInEditMode()
            if (r11 != 0) goto L14c
            r11 = 1108344832(0x42100000, float:36.0)
            float r11 = android.ext.Tools.G(r11)
            android.ext.FloatPanel.o = r11
        L14c:
            return
    }

    private void b(boolean r5) {
            r4 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r1 = 0
            r0.<init>(r1, r1)
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r4.f143g
            int r3 = r4.i
            int r2 = r2 + r3
            int r3 = r4.h
            r1.<init>(r2, r3)
            android.graphics.Point r5 = r4.a(r1, r5, r0)
            int r0 = r5.x
            int r1 = r4.i
            int r0 = r0 - r1
            r4.f143g = r0
            int r5 = r5.y
            r4.h = r5
            return
    }

    private void k() {
            r5 = this;
            int r0 = r5.j     // Catch: java.lang.Throwable -> L8
            r1 = 1
            if (r0 != r1) goto La
            java.lang.String r0 = ""
            goto Lc
        L8:
            r0 = move-exception
            goto L55
        La:
            java.lang.String r0 = "-land"
        Lc:
            android.ext.g2 r1 = new android.ext.g2     // Catch: java.lang.Throwable -> L8
            r1.<init>()     // Catch: java.lang.Throwable -> L8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8
            r2.<init>()     // Catch: java.lang.Throwable -> L8
            java.lang.String r3 = r5.n     // Catch: java.lang.Throwable -> L8
            r2.append(r3)     // Catch: java.lang.Throwable -> L8
            r2.append(r0)     // Catch: java.lang.Throwable -> L8
            java.lang.String r3 = "-x"
            r2.append(r3)     // Catch: java.lang.Throwable -> L8
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L8
            int r3 = r5.f143g     // Catch: java.lang.Throwable -> L8
            int r4 = r5.getDefX()     // Catch: java.lang.Throwable -> L8
            android.ext.g2 r1 = r1.g(r2, r3, r4)     // Catch: java.lang.Throwable -> L8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8
            r2.<init>()     // Catch: java.lang.Throwable -> L8
            java.lang.String r3 = r5.n     // Catch: java.lang.Throwable -> L8
            r2.append(r3)     // Catch: java.lang.Throwable -> L8
            r2.append(r0)     // Catch: java.lang.Throwable -> L8
            java.lang.String r0 = "-y"
            r2.append(r0)     // Catch: java.lang.Throwable -> L8
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L8
            int r2 = r5.h     // Catch: java.lang.Throwable -> L8
            int r3 = r5.getDefY()     // Catch: java.lang.Throwable -> L8
            android.ext.g2 r0 = r1.g(r0, r2, r3)     // Catch: java.lang.Throwable -> L8
            r0.commit()     // Catch: java.lang.Throwable -> L8
            goto L58
        L55:
            android.ext.e1.a(r0)
        L58:
            return
    }

    private void p(float r2, float r3, boolean r4) {
            r1 = this;
            int r0 = r1.f141e
            int r2 = (int) r2
            int r0 = r0 + r2
            r1.f143g = r0
            int r2 = r1.f142f
            int r3 = (int) r3
            int r2 = r2 + r3
            r1.h = r2
            r1.l()
            r1.o()
            if (r4 == 0) goto L17
            r1.k()
        L17:
            return
    }

    private void setLayoutXY(boolean r3) {
            r2 = this;
            r2.b(r3)
            android.view.WindowManager$LayoutParams r3 = r2.f137a
            int r0 = r2.f143g
            int r1 = r2.i
            int r0 = r0 + r1
            r3.x = r0
            int r0 = r2.h
            r3.y = r0
            return
    }

    protected android.graphics.Point a(android.graphics.Point r3, boolean r4, android.graphics.Point r5) {
            r2 = this;
            int r0 = r3.x
            int r1 = r2.i
            if (r0 >= r1) goto L8
            r3.x = r1
        L8:
            int r0 = r3.y
            if (r0 >= 0) goto Lf
            r0 = 0
            r3.y = r0
        Lf:
            android.graphics.Point r5 = r2.c(r5)
            if (r5 == 0) goto L3c
            if (r4 == 0) goto L2c
            int r4 = r5.x
            int r5 = r5.y
            if (r4 <= r5) goto L1e
            goto L1f
        L1e:
            r4 = r5
        L1f:
            int r5 = r3.x
            if (r5 <= r4) goto L25
            r3.x = r4
        L25:
            int r5 = r3.y
            if (r5 <= r4) goto L3c
            r3.y = r4
            goto L3c
        L2c:
            int r4 = r3.x
            int r0 = r5.x
            if (r4 <= r0) goto L34
            r3.x = r0
        L34:
            int r4 = r3.y
            int r5 = r5.y
            if (r4 <= r5) goto L3c
            r3.y = r5
        L3c:
            return r3
    }

    protected android.graphics.Point c(android.graphics.Point r6) {
            r5 = this;
            android.view.WindowManager r0 = r5.f138b     // Catch: java.lang.Throwable -> L30
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.Throwable -> L30
            r1 = -1
            android.graphics.Point r2 = new android.graphics.Point     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            r0.getRealSize(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r2.x     // Catch: java.lang.Throwable -> L16
            int r2 = r2.y     // Catch: java.lang.Throwable -> L14
            goto L1c
        L14:
            r2 = move-exception
            goto L18
        L16:
            r2 = move-exception
            r3 = -1
        L18:
            android.ext.e1.a(r2)     // Catch: java.lang.Throwable -> L30
            r2 = -1
        L1c:
            if (r2 != r1) goto L32
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L2b
            r4.<init>()     // Catch: java.lang.Throwable -> L2b
            r0.getRealMetrics(r4)     // Catch: java.lang.Throwable -> L2b
            int r3 = r4.widthPixels     // Catch: java.lang.Throwable -> L2b
            int r2 = r4.heightPixels     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r4 = move-exception
            android.ext.e1.a(r4)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r6 = move-exception
            goto L88
        L32:
            if (r2 != r1) goto L41
            int r3 = r0.getWidth()     // Catch: java.lang.Throwable -> L3d
            int r2 = r0.getHeight()     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r4 = move-exception
            android.ext.e1.a(r4)     // Catch: java.lang.Throwable -> L30
        L41:
            if (r2 != r1) goto L54
            android.graphics.Point r4 = new android.graphics.Point     // Catch: java.lang.Throwable -> L50
            r4.<init>()     // Catch: java.lang.Throwable -> L50
            r0.getSize(r4)     // Catch: java.lang.Throwable -> L50
            int r3 = r4.x     // Catch: java.lang.Throwable -> L50
            int r2 = r4.y     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r4 = move-exception
            android.ext.e1.a(r4)     // Catch: java.lang.Throwable -> L30
        L54:
            if (r2 != r1) goto L67
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L63
            r4.<init>()     // Catch: java.lang.Throwable -> L63
            r0.getMetrics(r4)     // Catch: java.lang.Throwable -> L63
            int r3 = r4.widthPixels     // Catch: java.lang.Throwable -> L63
            int r2 = r4.heightPixels     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r0 = move-exception
            android.ext.e1.a(r0)     // Catch: java.lang.Throwable -> L30
        L67:
            if (r2 == r1) goto L8b
            int r0 = r5.getWidth()     // Catch: java.lang.Throwable -> L77
            int r1 = r5.i     // Catch: java.lang.Throwable -> L77
            int r0 = r0 + r1
            int r3 = r3 - r0
            int r0 = r5.getHeight()     // Catch: java.lang.Throwable -> L77
            int r2 = r2 - r0
            goto L7b
        L77:
            r0 = move-exception
            android.ext.e1.a(r0)     // Catch: java.lang.Throwable -> L30
        L7b:
            if (r6 == 0) goto L82
            r6.x = r3     // Catch: java.lang.Throwable -> L30
            r6.y = r2     // Catch: java.lang.Throwable -> L30
            goto L87
        L82:
            android.graphics.Point r6 = new android.graphics.Point     // Catch: java.lang.Throwable -> L30
            r6.<init>(r3, r2)     // Catch: java.lang.Throwable -> L30
        L87:
            return r6
        L88:
            android.ext.e1.a(r6)
        L8b:
            r6 = 0
            return r6
    }

    protected java.lang.String d(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FloatPanel "
            r0.append(r1)
            java.lang.String r1 = r2.n
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            boolean r3 = r2.m
            r0.append(r3)
            r0.append(r1)
            boolean r3 = r2.l
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
            r7 = this;
            r0 = 0
            float r1 = r8.getRawX()     // Catch: java.lang.NoSuchMethodError -> L3a
            float r2 = r8.getRawY()     // Catch: java.lang.NoSuchMethodError -> L3a
            float r3 = r7.f139c     // Catch: java.lang.NoSuchMethodError -> L3a
            float r3 = r1 - r3
            float r4 = r7.f140d     // Catch: java.lang.NoSuchMethodError -> L3a
            float r4 = r2 - r4
            int r5 = r8.getAction()     // Catch: java.lang.NoSuchMethodError -> L3a
            r6 = 1
            if (r5 == 0) goto L5c
            if (r5 == r6) goto L54
            r1 = 2
            r2 = 3
            if (r5 == r1) goto L21
            if (r5 == r2) goto L54
            goto L66
        L21:
            boolean r1 = r7.k     // Catch: java.lang.NoSuchMethodError -> L3a
            if (r1 == 0) goto L3c
            float r1 = java.lang.Math.abs(r3)     // Catch: java.lang.NoSuchMethodError -> L3a
            float r5 = android.ext.FloatPanel.o     // Catch: java.lang.NoSuchMethodError -> L3a
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L3c
            float r1 = java.lang.Math.abs(r4)     // Catch: java.lang.NoSuchMethodError -> L3a
            float r5 = android.ext.FloatPanel.o     // Catch: java.lang.NoSuchMethodError -> L3a
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L66
            goto L3c
        L3a:
            r1 = move-exception
            goto L63
        L3c:
            boolean r1 = r7.k     // Catch: java.lang.NoSuchMethodError -> L3a
            if (r1 == 0) goto L4b
            r7.l()     // Catch: java.lang.NoSuchMethodError -> L3a
            int r1 = r7.f143g     // Catch: java.lang.NoSuchMethodError -> L3a
            r7.f141e = r1     // Catch: java.lang.NoSuchMethodError -> L3a
            int r1 = r7.h     // Catch: java.lang.NoSuchMethodError -> L3a
            r7.f142f = r1     // Catch: java.lang.NoSuchMethodError -> L3a
        L4b:
            r7.k = r0     // Catch: java.lang.NoSuchMethodError -> L3a
            r7.p(r3, r4, r0)     // Catch: java.lang.NoSuchMethodError -> L3a
            r8.setAction(r2)     // Catch: java.lang.NoSuchMethodError -> L3a
            goto L66
        L54:
            boolean r1 = r7.k     // Catch: java.lang.NoSuchMethodError -> L3a
            if (r1 != 0) goto L66
            r7.p(r3, r4, r6)     // Catch: java.lang.NoSuchMethodError -> L3a
            goto L66
        L5c:
            r7.f139c = r1     // Catch: java.lang.NoSuchMethodError -> L3a
            r7.f140d = r2     // Catch: java.lang.NoSuchMethodError -> L3a
            r7.k = r6     // Catch: java.lang.NoSuchMethodError -> L3a
            goto L66
        L63:
            android.ext.e1.a(r1)
        L66:
            boolean r8 = super.dispatchTouchEvent(r8)     // Catch: java.lang.ClassCastException -> L6b
            return r8
        L6b:
            r8 = move-exception
            android.ext.e1.a(r8)
            return r0
    }

    public void e() {
            r1 = this;
            android.ext.FloatPanel$b r0 = new android.ext.FloatPanel$b
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    protected boolean f() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean g() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    protected int getDefX() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected int getDefY() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getLayoutAlpha() {
            r1 = this;
            android.view.WindowManager$LayoutParams r0 = r1.f137a
            float r0 = r0.alpha
            return r0
    }

    public int getMarginX() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    protected abstract java.lang.String getPrefName();

    protected void h(android.content.SharedPreferences r5) {
            r4 = this;
            int r0 = r4.j
            r1 = 1
            if (r0 != r1) goto L8
            java.lang.String r0 = ""
            goto La
        L8:
            java.lang.String r0 = "-land"
        La:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.n
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "-x"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r3 = r4.getDefX()
            int r2 = r5.getInt(r2, r3)
            r4.f143g = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.n
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "-y"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r2 = r4.getDefY()
            int r5 = r5.getInt(r0, r2)
            r4.h = r5
            r4.setLayoutXY(r1)
            return
    }

    protected void i() {
            r2 = this;
            android.ext.Tools.n1(r2)     // Catch: java.lang.Throwable -> L4
            goto La
        L4:
            r0 = move-exception
            java.lang.String r1 = "Failed hide float icon"
            android.ext.e1.s(r1, r0)
        La:
            return
    }

    protected void j() {
            r2 = this;
            boolean r0 = r2.l
            if (r0 == 0) goto Le
            android.ext.Tools.n1(r2)     // Catch: java.lang.Throwable -> L8
            goto Le
        L8:
            r0 = move-exception
            java.lang.String r1 = "Failed hide float icon"
            android.ext.e1.s(r1, r0)
        Le:
            r0 = 1
            r2.l = r0
            android.view.WindowManager$LayoutParams r0 = r2.f137a     // Catch: java.lang.Throwable -> L17
            android.ext.Tools.g(r2, r0)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L17:
            r0 = move-exception
            java.lang.String r1 = "Failed add float icon"
            android.ext.e1.s(r1, r0)
        L1d:
            return
    }

    protected void l() {
            r1 = this;
            r0 = 0
            r1.setLayoutXY(r0)
            return
    }

    public void m() {
            r1 = this;
            android.ext.FloatPanel$a r0 = new android.ext.FloatPanel$a
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public void n() {
            r1 = this;
            r0 = 1
            r1.m = r0
            r1.e()
            return
    }

    protected void o() {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L5
            return
        L5:
            android.view.WindowManager$LayoutParams r0 = r1.f137a
            android.ext.Tools.V1(r1, r0)
            return
    }

    @Override // android.fix.LinearLayout, android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FloatPanel onConfigurationChanged: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.content.res.Configuration r3 = a.b.f(r3)
            super.onConfigurationChanged(r3)
            android.ext.MainService.Y(r3)
            int r0 = r3.orientation
            int r1 = r2.j
            if (r0 == r1) goto L3c
            r2.k()
            int r3 = r3.orientation
            r2.j = r3
            android.content.Context r3 = r2.getContext()
            java.lang.String r0 = android.ext.MainService.G0
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.h(r3)
            r2.o()
        L3c:
            return
    }

    public void setLayoutAlpha(float r4) {
            r3 = this;
            android.view.WindowManager$LayoutParams r0 = r3.f137a
            float r1 = r0.alpha
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L9
            return
        L9:
            r0.alpha = r4
            r3.o()
            boolean r0 = r3.f()
            if (r0 != 0) goto L24
            android.ext.g2 r0 = new android.ext.g2
            r0.<init>()
            java.lang.String r1 = "opacity"
            r2 = 1065353216(0x3f800000, float:1.0)
            android.ext.g2 r4 = r0.e(r1, r4, r2)
            r4.commit()
        L24:
            return
    }

    public void setMarginX(int r1) {
            r0 = this;
            r0.i = r1
            return
    }
}
