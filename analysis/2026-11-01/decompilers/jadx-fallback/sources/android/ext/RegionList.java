package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class RegionList extends android.fix.ImageButtonView implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile java.util.List f342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile android.ext.RegionList.b f343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile android.util.SparseIntArray f344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static java.lang.CharSequence[] f346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static int[] f347f;

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditText f348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.util.List f350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.util.SparseIntArray f351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.ext.RegionList f352e;

        a(android.ext.RegionList r1, android.ext.EditText r2, boolean r3, java.util.List r4, android.util.SparseIntArray r5) {
                r0 = this;
                r0.f352e = r1
                r0.f348a = r2
                r0.f349b = r3
                r0.f350c = r4
                r0.f351d = r5
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r6, int r7) {
                r5 = this;
                android.ext.EditText r0 = r5.f348a     // Catch: java.lang.Throwable -> L1a
                boolean r1 = r5.f349b     // Catch: java.lang.Throwable -> L1a
                if (r1 == 0) goto L1c
                java.util.List r1 = r5.f350c     // Catch: java.lang.Throwable -> L1a
                android.util.SparseIntArray r2 = r5.f351d     // Catch: java.lang.Throwable -> L1a
                int r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
                android.ext.RegionList$b r1 = (android.ext.RegionList.b) r1     // Catch: java.lang.Throwable -> L1a
                long r1 = r1.f357c     // Catch: java.lang.Throwable -> L1a
                r3 = 1
                long r1 = r1 - r3
                goto L2c
            L1a:
                r0 = move-exception
                goto L3a
            L1c:
                java.util.List r1 = r5.f350c     // Catch: java.lang.Throwable -> L1a
                android.util.SparseIntArray r2 = r5.f351d     // Catch: java.lang.Throwable -> L1a
                int r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
                android.ext.RegionList$b r1 = (android.ext.RegionList.b) r1     // Catch: java.lang.Throwable -> L1a
                long r1 = r1.f356b     // Catch: java.lang.Throwable -> L1a
            L2c:
                r3 = 4
                java.lang.String r1 = android.ext.c.G(r1, r3)     // Catch: java.lang.Throwable -> L1a
                r0.setText(r1)     // Catch: java.lang.Throwable -> L1a
                android.ext.EditText r0 = r5.f348a     // Catch: java.lang.Throwable -> L1a
                r0.requestFocus()     // Catch: java.lang.Throwable -> L1a
                goto L4e
            L3a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "RegionList failed with "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                android.ext.e1.g(r7, r0)
            L4e:
                android.ext.Tools.D(r6)
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static android.util.SparseIntArray f353f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f354g = 16777215;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.lang.String f358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        java.lang.String f359e;

        static {
                return
        }

        public b(int r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.f355a = r1
                r0.f356b = r2
                r0.f357c = r4
                return
        }

        public static int c(android.ext.RegionList.b r6) {
                android.util.SparseIntArray r0 = android.ext.RegionList.b.f353f     // Catch: java.lang.Throwable -> L4b
                r1 = 4
                if (r0 != 0) goto L4d
                android.util.SparseIntArray r0 = new android.util.SparseIntArray     // Catch: java.lang.Throwable -> L4b
                r2 = 8
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L4b
                r3 = 2130837520(0x7f020010, float:1.7279996E38)
                int r4 = android.ext.Tools.d0(r3)     // Catch: java.lang.Throwable -> L4b
                r0.append(r1, r4)     // Catch: java.lang.Throwable -> L4b
                r4 = 2130837518(0x7f02000e, float:1.7279992E38)
                int r4 = android.ext.Tools.d0(r4)     // Catch: java.lang.Throwable -> L4b
                r5 = 1
                r0.append(r5, r4)     // Catch: java.lang.Throwable -> L4b
                r4 = 2130837517(0x7f02000d, float:1.727999E38)
                int r4 = android.ext.Tools.d0(r4)     // Catch: java.lang.Throwable -> L4b
                r5 = 2
                r0.append(r5, r4)     // Catch: java.lang.Throwable -> L4b
                r4 = 2130837521(0x7f020011, float:1.7279998E38)
                int r4 = android.ext.Tools.d0(r4)     // Catch: java.lang.Throwable -> L4b
                r5 = 16
                r0.append(r5, r4)     // Catch: java.lang.Throwable -> L4b
                r4 = 2130837519(0x7f02000f, float:1.7279994E38)
                int r4 = android.ext.Tools.d0(r4)     // Catch: java.lang.Throwable -> L4b
                r0.append(r2, r4)     // Catch: java.lang.Throwable -> L4b
                android.ext.RegionList.b.f353f = r0     // Catch: java.lang.Throwable -> L4b
                int r2 = android.ext.Tools.d0(r3)     // Catch: java.lang.Throwable -> L4b
                android.ext.RegionList.b.f354g = r2     // Catch: java.lang.Throwable -> L4b
                goto L4d
            L4b:
                r0 = move-exception
                goto L5e
            L4d:
                if (r6 == 0) goto L58
                int r2 = r6.d()     // Catch: java.lang.Throwable -> L4b
                int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L4b
                goto L59
            L58:
                r0 = 4
            L59:
                if (r0 != r1) goto L74
                int r0 = android.ext.RegionList.b.f354g     // Catch: java.lang.Throwable -> L4b
                goto L74
            L5e:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed getPointerColor for: "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                android.ext.e1.l(r6, r0)
                int r0 = android.ext.RegionList.b.f354g
            L74:
                return r0
        }

        private int d() {
                r3 = this;
                int r0 = r3.f355a
                r1 = r0 & 1536(0x600, float:2.152E-42)
                r2 = 1536(0x600, float:2.152E-42)
                if (r1 != r2) goto La
                r0 = 1
                return r0
            La:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                r2 = 1024(0x400, float:1.435E-42)
                if (r1 != r2) goto L12
                r0 = 2
                return r0
            L12:
                r1 = r0 & 512(0x200, float:7.17E-43)
                r2 = 512(0x200, float:7.17E-43)
                if (r1 != r2) goto L1b
                r0 = 16
                return r0
            L1b:
                r1 = 256(0x100, float:3.59E-43)
                r0 = r0 & r1
                if (r0 != r1) goto L23
                r0 = 8
                return r0
            L23:
                r0 = 4
                return r0
        }

        public java.lang.String a() {
                r2 = this;
                java.lang.String r0 = r2.f359e
                if (r0 != 0) goto L7
                java.lang.String r0 = r2.f358d
                goto L1a
            L7:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.f359e
                r0.append(r1)
                java.lang.String r1 = ":bss"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L1a:
                return r0
        }

        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.f358d
                return r0
        }

        public java.lang.CharSequence e() {
                r2 = this;
                java.lang.CharSequence[] r0 = android.ext.RegionList.f346e
                int r1 = r2.f355a
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0 = r0[r1]
                return r0
        }

        public java.lang.String f() {
                r5 = this;
                int r0 = r5.f355a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = r0 & 256(0x100, float:3.59E-43)
                java.lang.String r3 = "-"
                r4 = 256(0x100, float:3.59E-43)
                if (r2 != r4) goto L12
                java.lang.String r2 = "r"
                goto L13
            L12:
                r2 = r3
            L13:
                r1.append(r2)
                r2 = r0 & 512(0x200, float:7.17E-43)
                r4 = 512(0x200, float:7.17E-43)
                if (r2 != r4) goto L1f
                java.lang.String r2 = "w"
                goto L20
            L1f:
                r2 = r3
            L20:
                r1.append(r2)
                r2 = r0 & 1024(0x400, float:1.435E-42)
                r4 = 1024(0x400, float:1.435E-42)
                if (r2 != r4) goto L2b
                java.lang.String r3 = "x"
            L2b:
                r1.append(r3)
                r2 = 2048(0x800, float:2.87E-42)
                r0 = r0 & r2
                if (r0 != r2) goto L36
                java.lang.String r0 = "s"
                goto L38
            L36:
                java.lang.String r0 = "p"
            L38:
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }

        public java.lang.CharSequence g() {
                r3 = this;
                java.lang.String r0 = r3.toString()
                int[] r1 = android.ext.RegionList.f347f
                int r2 = r3.f355a
                r2 = r2 & 255(0xff, float:3.57E-43)
                r1 = r1[r2]
                java.lang.CharSequence r0 = android.ext.Tools.t(r0, r1)
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.CharSequence[] r1 = android.ext.RegionList.f346e
                int r2 = r4.f355a
                r2 = r2 & 255(0xff, float:3.57E-43)
                r1 = r1[r2]
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                long r1 = r4.f356b
                r3 = 4
                java.lang.String r1 = android.ext.c.G(r1, r3)
                r0.append(r1)
                r1 = 45
                r0.append(r1)
                long r1 = r4.f357c
                java.lang.String r1 = android.ext.c.G(r1, r3)
                r0.append(r1)
                r1 = 32
                r0.append(r1)
                java.lang.String r1 = r4.f()
                r0.append(r1)
                java.lang.String r1 = " '"
                r0.append(r1)
                java.lang.String r1 = r4.f358d
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.ext.RegionList.f342a = r0
            r0 = 0
            android.ext.RegionList.f343b = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            android.ext.RegionList.f344c = r0
            return
    }

    public RegionList(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.g()
            return
    }

    public static java.lang.CharSequence a(long r0) {
            android.ext.RegionList$b r0 = b(r0)
            if (r0 != 0) goto L9
            java.lang.String r0 = "?"
            goto Ld
        L9:
            java.lang.CharSequence r0 = r0.e()
        Ld:
            return r0
    }

    public static android.ext.RegionList.b b(long r7) {
            boolean r0 = android.ext.e0.m()
            long r7 = android.ext.e.a(r7, r0)
            android.ext.RegionList$b r0 = android.ext.RegionList.f343b
            if (r0 == 0) goto L1d
            long r1 = r0.f356b
            boolean r1 = android.ext.Tools.T1(r1, r7)
            if (r1 == 0) goto L1d
            long r1 = r0.f357c
            boolean r1 = android.ext.Tools.S1(r7, r1)
            if (r1 == 0) goto L1d
            return r0
        L1d:
            java.util.List r0 = android.ext.RegionList.f342a
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r2 = 0
        L26:
            if (r2 > r1) goto L4d
            int r3 = r2 + r1
            int r3 = r3 >>> 1
            java.lang.Object r4 = r0.get(r3)
            android.ext.RegionList$b r4 = (android.ext.RegionList.b) r4
            long r5 = r4.f357c
            boolean r5 = android.ext.Tools.T1(r5, r7)
            if (r5 == 0) goto L3e
            int r3 = r3 + 1
            r2 = r3
            goto L26
        L3e:
            long r5 = r4.f356b
            boolean r1 = android.ext.Tools.S1(r7, r5)
            if (r1 == 0) goto L4a
            int r3 = r3 + (-1)
            r1 = r3
            goto L26
        L4a:
            android.ext.RegionList.f343b = r4
            return r4
        L4d:
            r7 = 0
            return r7
    }

    public static android.ext.RegionList.b c(java.lang.String r16, java.lang.String r17, long r18) {
            java.lang.String r0 = r16.trim()
            java.lang.String r1 = r17.trim()
            int r2 = r1.length()
            r3 = 0
            if (r2 <= 0) goto Le6
            r4 = 0
            int r2 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r2 < 0) goto Le6
            java.util.List r2 = android.ext.RegionList.f342a
            r4 = 6
            android.ext.RegionList$b[] r5 = new android.ext.RegionList.b[r4]
            int[] r6 = new int[r4]
            java.io.File r7 = new java.io.File
            r7.<init>(r1)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 47
            r8.append(r9)
            java.lang.String r10 = r7.getName()
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.io.File r10 = r7.getParentFile()
            if (r10 == 0) goto L57
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.io.File r7 = r7.getParentFile()
            java.lang.String r7 = r7.getName()
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = r10.toString()
            goto L58
        L57:
            r7 = r3
        L58:
            int r0 = f(r0)
            java.util.Iterator r2 = r2.iterator()
        L60:
            boolean r9 = r2.hasNext()
            r10 = 0
            if (r9 == 0) goto Ldc
            java.lang.Object r9 = r2.next()
            android.ext.RegionList$b r9 = (android.ext.RegionList.b) r9
            if (r9 != 0) goto L70
            goto L60
        L70:
            java.lang.String r11 = r9.a()
            int r12 = r11.length()
            if (r12 == 0) goto L60
            long r12 = r9.f357c
            long r14 = r9.f356b
            long r12 = r12 - r14
            int r14 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r14 > 0) goto L84
            goto L60
        L84:
            int r12 = r9.f355a
            r12 = r12 ^ r0
            r12 = r12 & 3840(0xf00, float:5.381E-42)
            if (r12 == 0) goto L8f
            int r12 = java.lang.Integer.bitCount(r12)
        L8f:
            boolean r13 = r11.equals(r1)
            if (r13 == 0) goto La7
            if (r12 != 0) goto L9a
            r5[r10] = r9
            goto Ldc
        L9a:
            r10 = 1
            r13 = r5[r10]
            if (r13 == 0) goto La3
            r13 = r6[r10]
            if (r13 <= r12) goto La7
        La3:
            r5[r10] = r9
            r6[r10] = r12
        La7:
            if (r7 == 0) goto Lc2
            boolean r10 = r11.endsWith(r7)
            if (r10 == 0) goto Lc2
            if (r12 != 0) goto Lb5
            r10 = 2
            r5[r10] = r9
            goto Lc2
        Lb5:
            r10 = 3
            r13 = r5[r10]
            if (r13 == 0) goto Lbe
            r13 = r6[r10]
            if (r13 <= r12) goto Lc2
        Lbe:
            r5[r10] = r9
            r6[r10] = r12
        Lc2:
            boolean r10 = r11.endsWith(r8)
            if (r10 == 0) goto L60
            if (r12 != 0) goto Lce
            r10 = 4
            r5[r10] = r9
            goto L60
        Lce:
            r10 = 5
            r11 = r5[r10]
            if (r11 == 0) goto Ld7
            r11 = r6[r10]
            if (r11 <= r12) goto L60
        Ld7:
            r5[r10] = r9
            r6[r10] = r12
            goto L60
        Ldc:
            if (r10 >= r4) goto Le6
            r0 = r5[r10]
            if (r0 == 0) goto Le3
            return r0
        Le3:
            int r10 = r10 + 1
            goto Ldc
        Le6:
            return r3
    }

    public static long d(int r4) {
            android.util.SparseIntArray r0 = android.ext.RegionList.f344c
            int r4 = r0.get(r4)
            long r0 = (long) r4
            r2 = 4096(0x1000, double:2.0237E-320)
            long r0 = r0 * r2
            return r0
    }

    private static int e(int r4) {
            int[] r0 = android.ext.RegionList.f345d
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r1 >= r0) goto L12
            int[] r3 = android.ext.RegionList.f345d
            r3 = r3[r1]
            r3 = r3 & r4
            if (r3 != r4) goto Lf
            r2 = r1
        Lf:
            int r1 = r1 + 1
            goto L5
        L12:
            return r2
    }

    public static int f(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L9
            return r2
        L9:
            char r0 = r3.charAt(r2)
            r1 = 114(0x72, float:1.6E-43)
            if (r0 != r1) goto L13
            r2 = 256(0x100, float:3.59E-43)
        L13:
            r0 = 1
            char r0 = r3.charAt(r0)
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L1e
            r2 = r2 | 512(0x200, float:7.17E-43)
        L1e:
            r0 = 2
            char r0 = r3.charAt(r0)
            r1 = 120(0x78, float:1.68E-43)
            if (r0 != r1) goto L29
            r2 = r2 | 1024(0x400, float:1.435E-42)
        L29:
            r0 = 3
            char r3 = r3.charAt(r0)
            r0 = 115(0x73, float:1.61E-43)
            if (r3 != r0) goto L34
            r2 = r2 | 2048(0x800, float:2.87E-42)
        L34:
            return r2
    }

    private void g() {
            r1 = this;
            r1.setOnClickListener(r1)
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto L12
            r0 = 2130968588(0x7f04000c, float:1.7545834E38)
            r1.setImageResource(r0)
            android.ext.Config.m(r1)
        L12:
            return
    }

    public static java.util.List<android.ext.RegionList.b> getList() {
            java.util.List r0 = android.ext.RegionList.f342a
            return r0
    }

    public static void h(android.ext.w r15) {
            r15.j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            java.util.List r2 = android.ext.RegionList.f342a
            if (r2 == 0) goto L18
            int r2 = r2.size()
            r0.ensureCapacity(r2)
        L18:
            i()
            r2 = 0
            java.lang.String r3 = ""
        L1e:
            int r4 = r15.f()     // Catch: java.io.IOException -> L73
            if (r4 != 0) goto L26
            goto Lbc
        L26:
            int r5 = e(r4)     // Catch: java.io.IOException -> L73
            long r8 = r15.h()     // Catch: java.io.IOException -> L73
            long r10 = r15.h()     // Catch: java.io.IOException -> L73
            int r6 = r15.f()     // Catch: java.io.IOException -> L73
            int r6 = r6 << 8
            r7 = r5 | r6
            r4 = r4 & 2064(0x810, float:2.892E-42)
            if (r4 != 0) goto L3f
            r3 = r2
        L3f:
            int r4 = r15.f()     // Catch: java.io.IOException -> L73
            if (r4 < 0) goto L9d
            r6 = 1024(0x400, float:1.435E-42)
            if (r4 <= r6) goto L4a
            goto L9d
        L4a:
            android.ext.RegionList$b r6 = b(r8)     // Catch: java.io.IOException -> L73
            if (r6 != 0) goto L52
            r12 = r2
            goto L54
        L52:
            java.lang.String r12 = r6.f358d     // Catch: java.io.IOException -> L73
        L54:
            java.lang.String r4 = r15.i(r4, r12)     // Catch: java.io.IOException -> L73
            java.lang.String r4 = r4.trim()     // Catch: java.io.IOException -> L73
            java.lang.String r4 = r4.intern()     // Catch: java.io.IOException -> L73
            if (r6 == 0) goto L75
            int r12 = r6.f355a     // Catch: java.io.IOException -> L73
            if (r12 != r7) goto L75
            long r12 = r6.f356b     // Catch: java.io.IOException -> L73
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 != 0) goto L75
            long r12 = r6.f357c     // Catch: java.io.IOException -> L73
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 == 0) goto L7c
            goto L75
        L73:
            r15 = move-exception
            goto Lb7
        L75:
            android.ext.RegionList$b r12 = new android.ext.RegionList$b     // Catch: java.io.IOException -> L73
            r6 = r12
            r6.<init>(r7, r8, r10)     // Catch: java.io.IOException -> L73
            r6 = r12
        L7c:
            r6.f358d = r4     // Catch: java.io.IOException -> L73
            r6.f359e = r3     // Catch: java.io.IOException -> L73
            r0.add(r6)     // Catch: java.io.IOException -> L73
            long r7 = r6.f357c     // Catch: java.io.IOException -> L73
            long r9 = r6.f356b     // Catch: java.io.IOException -> L73
            long r7 = r7 - r9
            r9 = 4096(0x1000, double:2.0237E-320)
            long r7 = r7 / r9
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L92
            r7 = r9
        L92:
            int r3 = r1.get(r5)     // Catch: java.io.IOException -> L73
            int r6 = (int) r7     // Catch: java.io.IOException -> L73
            int r3 = r3 + r6
            r1.put(r5, r3)     // Catch: java.io.IOException -> L73
            r3 = r4
            goto L1e
        L9d:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L73
            r15.<init>()     // Catch: java.io.IOException -> L73
            java.lang.String r3 = "Bad name length: "
            r15.append(r3)     // Catch: java.io.IOException -> L73
            r15.append(r4)     // Catch: java.io.IOException -> L73
            java.lang.String r15 = r15.toString()     // Catch: java.io.IOException -> L73
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L73
            r3.<init>()     // Catch: java.io.IOException -> L73
            android.ext.e1.l(r15, r3)     // Catch: java.io.IOException -> L73
            goto Lbc
        Lb7:
            java.lang.String r3 = "???"
            android.ext.e1.l(r3, r15)
        Lbc:
            android.ext.RegionList.f342a = r0
            android.ext.RegionList.f344c = r1
            android.ext.RegionList.f343b = r2
            android.ext.MainService r15 = android.ext.MainService.instance
            android.ext.n1 r15 = r15.N
            r15.d()
            return
    }

    private static void i() {
            r0 = 2131034189(0x7f05004d, float:1.7678889E38)
            android.ext.Config$p r0 = android.ext.Config.b(r0)
            r0.a()
            return
    }

    public static void k(int[] r0, java.lang.CharSequence[] r1, int[] r2) {
            android.ext.RegionList.f345d = r0
            android.ext.RegionList.f346e = r1
            android.ext.RegionList.f347f = r2
            return
    }

    public void j(android.view.View r16, int r17) {
            r15 = this;
            java.lang.Object r0 = r15.getTag()
            boolean r1 = r0 instanceof android.ext.EditText
            if (r1 != 0) goto L9
            return
        L9:
            r4 = r0
            android.ext.EditText r4 = (android.ext.EditText) r4
            r4.requestFocus()
            if (r16 != 0) goto L13
            r0 = r15
            goto L15
        L13:
            r0 = r16
        L15:
            int r0 = r0.getId()
            r1 = 2131034378(0x7f05010a, float:1.7679272E38)
            r2 = 0
            r8 = 1
            if (r0 != r1) goto L22
            r5 = 1
            goto L23
        L22:
            r5 = 0
        L23:
            android.text.Editable r0 = r4.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r0.trim()
            int r0 = r1.length()
            if (r0 <= 0) goto L52
            r0 = 16
            long r0 = android.ext.t1.r(r1, r0)     // Catch: java.lang.NumberFormatException -> L3c
            goto L54
        L3c:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "RegionList failed parse: "
            r0.append(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.s(r0, r3)
        L52:
            r0 = 0
        L54:
            java.util.List r6 = android.ext.RegionList.f342a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r7 = r6.size()
            r3.<init>(r7)
            android.util.SparseIntArray r7 = new android.util.SparseIntArray
            r7.<init>()
            r9 = -1
            r10 = 0
        L66:
            int r11 = r6.size()
            if (r10 >= r11) goto L9e
            java.lang.Object r11 = r6.get(r10)
            android.ext.RegionList$b r11 = (android.ext.RegionList.b) r11
            if (r17 == 0) goto L84
            int r12 = r11.f355a
            r12 = r12 & 255(0xff, float:3.57E-43)
            int[] r13 = android.ext.RegionList.f345d
            int r14 = r13.length
            if (r12 >= r14) goto L84
            r12 = r13[r12]
            r12 = r12 & r17
            if (r12 != 0) goto L84
            goto L9b
        L84:
            int r12 = r3.size()
            r7.append(r12, r10)
            java.lang.CharSequence r12 = r11.g()
            r3.add(r12)
            long r11 = r11.f356b
            boolean r11 = android.ext.Tools.T1(r11, r0)
            if (r11 == 0) goto L9b
            r9 = r10
        L9b:
            int r10 = r10 + 1
            goto L66
        L9e:
            int r0 = r3.size()
            if (r0 != 0) goto Le5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2131296811(0x7f09022b, float:1.821155E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.append(r1)
            if (r17 == 0) goto Ldd
            int[] r1 = android.ext.RegionList.f345d
            java.lang.CharSequence[] r3 = android.ext.RegionList.f346e
            int r4 = r1.length
            r5 = 0
        Lbb:
            if (r2 >= r4) goto Ld6
            r6 = r1[r2]
            r6 = r17 & r6
            if (r6 == 0) goto Ld3
            if (r5 == 0) goto Lc8
            java.lang.String r5 = ", "
            goto Lca
        Lc8:
            java.lang.String r5 = "\n["
        Lca:
            r0.append(r5)
            r5 = r3[r2]
            r0.append(r5)
            r5 = 1
        Ld3:
            int r2 = r2 + 1
            goto Lbb
        Ld6:
            if (r5 == 0) goto Ldd
            r1 = 93
            r0.append(r1)
        Ldd:
            java.lang.String r0 = r0.toString()
            android.ext.Tools.J1(r0)
            return
        Le5:
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            int r1 = r3.size()
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            java.lang.Object[] r1 = r3.toArray(r1)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            android.ext.RegionList$a r10 = new android.ext.RegionList$a
            r2 = r10
            r3 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            android.app.AlertDialog$Builder r0 = r0.setSingleChoiceItems(r1, r9, r10)
            android.app.AlertDialog r0 = r0.create()
            android.widget.ListView r1 = r0.getListView()
            if (r1 == 0) goto L113
            r2 = 2131361799(0x7f0a0007, float:1.834336E38)
            android.ext.Tools.C1(r1, r2)
            android.ext.FastScrollerFix.a(r1, r8)
        L113:
            android.ext.f.m(r0)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            boolean r0 = r1 instanceof android.ext.RegionListFiltered
            if (r0 == 0) goto L7
            int r0 = android.ext.Config.i
            goto L8
        L7:
            r0 = 0
        L8:
            r1.j(r2, r0)
            return
    }
}
