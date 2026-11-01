package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class p1 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f1170e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected java.lang.String f1171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.ref.WeakReference f1173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1174d;

    class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.p1 f1175a;

        a(android.ext.p1 r1) {
                r0 = this;
                r0.f1175a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.ext.p1 r0 = r1.f1175a
                r0.e(r2)
                return
        }
    }

    static {
            r0 = 3
            long[] r0 = new long[r0]
            android.ext.p1.f1170e = r0
            return
    }

    public p1(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1172b = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.f1173c = r0
            r0 = -1
            r2.f1174d = r0
            java.lang.String r3 = android.ext.b2.f(r3)
            r2.f1171a = r3
            r2.f1172b = r4
            return
    }

    public p1(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1172b = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.f1173c = r0
            r0 = -1
            r2.f1174d = r0
            r2.f1171a = r3
            return
    }

    public static java.lang.String d() {
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        Le:
            r4 = 3
            if (r3 >= r4) goto L47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "m-"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            r5 = 0
            long r7 = r0.getLong(r4, r5)
            r1.remove(r4)
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L30
            goto L44
        L30:
            java.lang.String r4 = "&m"
            r2.append(r4)
            r2.append(r3)
            r4 = 61
            r2.append(r4)
            java.lang.String r4 = java.lang.Long.toHexString(r7)
            r2.append(r4)
        L44:
            int r3 = r3 + 1
            goto Le
        L47:
            r1.commit()
            java.lang.String r0 = r2.toString()
            return r0
    }

    private static void f() {
            android.ext.g2 r6 = new android.ext.g2
            r6.<init>()
            r0 = 0
            r7 = 0
        L7:
            r0 = 3
            if (r7 >= r0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "m-"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = r0.toString()
            long[] r0 = android.ext.p1.f1170e
            r2 = r0[r7]
            r4 = 0
            r0 = r6
            r0.i(r1, r2, r4)
            int r7 = r7 + 1
            goto L7
        L28:
            r6.commit()
            return
    }

    public final android.widget.ImageView a() {
            r1 = this;
            r0 = 0
            android.widget.ImageView r0 = r1.b(r0)
            return r0
    }

    public android.widget.ImageView b(boolean r3) {
            r2 = this;
            android.fix.ToolbarButton r0 = new android.fix.ToolbarButton
            android.content.Context r1 = android.ext.Tools.f0()
            r0.<init>(r1)
            int r1 = r2.f1172b
            r0.setIcon(r1)
            if (r3 != 0) goto L12
            r3 = r2
            goto L17
        L12:
            android.ext.p1$a r3 = new android.ext.p1$a
            r3.<init>(r2)
        L17:
            r0.setOnClickListener(r3)
            r0.setTag(r2)
            return r0
    }

    public android.graphics.drawable.Drawable c() {
            r2 = this;
            int r0 = r2.f1172b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.ref.WeakReference r0 = r2.f1173c
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 != 0) goto L1d
            int r0 = r2.f1172b
            android.graphics.drawable.Drawable r0 = android.ext.Tools.o0(r0)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r2.f1173c = r1
        L1d:
            return r0
    }

    public void e(android.view.View r12) {
            r11 = this;
            int r0 = r11.f1174d
            r1 = -1
            if (r0 == r1) goto L23
            int r1 = r0 / 64
            if (r1 < 0) goto L23
            r2 = 3
            if (r1 >= r2) goto L23
            r2 = 1
            int r0 = r0 % 64
            long r2 = r2 << r0
            long[] r0 = android.ext.p1.f1170e
            r4 = r0[r1]
            long r6 = r4 & r2
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L23
            long r2 = r2 | r4
            r0[r1] = r2
            f()
        L23:
            r11.onClick(r12)
            return
    }

    public void g(int r1, int r2) {
            r0 = this;
            int r1 = r1 * 64
            int r1 = r1 + r2
            r0.f1174d = r1
            return
    }

    @Override // android.view.View.OnClickListener
    public abstract void onClick(android.view.View r1);

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f1171a
            return r0
    }
}
