package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile java.lang.ref.WeakReference f655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile a.e f656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static int[] f657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile long f658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.Runnable f659e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static java.util.regex.Pattern f660f;

    class a implements java.lang.Runnable {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                long r0 = android.ext.b2.f658d
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L16
                long r2 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r0
                r0 = 5000(0x1388, double:2.4703E-320)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 <= 0) goto L16
                android.ext.b2.a()
            L16:
                android.os.Handler r0 = android.ext.n2.d()
                r0.removeCallbacks(r5)     // Catch: java.lang.NullPointerException -> L1e
                goto L22
            L1e:
                r1 = move-exception
                android.ext.e1.a(r1)
            L22:
                r1 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r5, r1)
                return
        }
    }

    static {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            android.ext.b2.f655a = r0
            a.e r0 = new a.e
            r0.<init>()
            android.ext.b2.f656b = r0
            int[] r0 = d.b.f1512d
            android.ext.b2.f657c = r0
            r0 = 0
            android.ext.b2.f658d = r0
            android.ext.b2$a r0 = new android.ext.b2$a
            r0.<init>()
            android.ext.b2.f659e = r0
            java.lang.String r0 = "__([a-z0-9_]+?)__"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            android.ext.b2.f660f = r0
            return
    }

    public static void a() {
            a.e r0 = android.ext.b2.f656b
            int r1 = r0.size()
            int[] r2 = android.ext.b2.f657c
            int r2 = r2.length
            if (r1 > r2) goto Lc
            return
        Lc:
            a.e r1 = new a.e
            r1.<init>()
            int[] r2 = android.ext.b2.f657c
            int r3 = r2.length
            r4 = 0
        L15:
            if (r4 >= r3) goto L27
            r5 = r2[r4]
            java.lang.Object r6 = r0.b(r5)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L24
            r1.put(r5, r6)
        L24:
            int r4 = r4 + 1
            goto L15
        L27:
            android.ext.b2.f656b = r1
            r0 = 0
            android.ext.b2.f658d = r0
            return
    }

    public static java.lang.String b(int r5) {
            android.content.res.Resources r0 = c()     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = r0.getResourceEntryName(r5)     // Catch: java.lang.Throwable -> L9
            goto L2a
        L9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Resource name for id 0x"
            r1.append(r2)
            r2 = 8
            long r3 = (long) r5
            java.lang.String r5 = android.ext.t2.e(r2, r3)
            r1.append(r5)
            java.lang.String r5 = " not found"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.ext.e1.l(r5, r0)
        L2a:
            return r5
    }

    private static android.content.res.Resources c() {
            java.lang.ref.WeakReference r0 = android.ext.b2.f655a
            java.lang.Object r0 = r0.get()
            android.content.res.Resources r0 = (android.content.res.Resources) r0
            if (r0 != 0) goto Lc5
            android.content.Context r0 = android.ext.Tools.f0()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            android.ext.b2.f655a = r1
            java.lang.Runnable r1 = android.ext.b2.f659e
            r1.run()
            a.e r1 = new a.e
            r1.<init>()
            int[] r2 = android.ext.b2.f657c
            int r2 = r2.length
            if (r2 != 0) goto L2e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L2f
        L2e:
            r2 = 0
        L2f:
            java.lang.String r3 = "dssbqdph"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)
            java.lang.String r4 = "string"
            int r3 = d(r3, r4)
            java.lang.String r4 = "JdphJxdugldq"
            java.lang.String r4 = android.ext.Tools.removeNewLinesChars(r4)
            java.lang.String r4 = r4.intern()
            if (r2 == 0) goto L4e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2.add(r5)
        L4e:
            r1.put(r3, r4)
            r3 = 2131296356(0x7f090064, float:1.8210626E38)
            java.util.Locale r4 = android.ext.k.f()     // Catch: java.lang.Exception -> L6c
            java.lang.String r5 = h(r3)     // Catch: java.lang.Exception -> L6c
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L6c
            r7 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L6c
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Exception -> L6c
            java.lang.String.format(r4, r5, r6)     // Catch: java.lang.Exception -> L6c
            goto L80
        L6c:
            r4 = move-exception
            java.lang.String r5 = "Check format"
            android.ext.e1.l(r5, r4)
            if (r2 == 0) goto L7b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.add(r4)
        L7b:
            java.lang.String r4 = "%d"
            r1.put(r3, r4)
        L80:
            java.lang.String r3 = "kwws=22jdphjxdugldq1qhw2iruxp"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)
            r4 = 2131296475(0x7f0900db, float:1.8210868E38)
            if (r2 == 0) goto L92
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.add(r5)
        L92:
            r1.put(r4, r3)
            r3 = 2131296370(0x7f090072, float:1.8210655E38)
            if (r2 == 0) goto La1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.add(r4)
        La1:
            char r4 = android.ext.t1.f1252b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
            r3 = 2131297009(0x7f0902f1, float:1.821195E38)
            if (r2 == 0) goto Lb6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.add(r4)
        Lb6:
            java.lang.String r4 = android.ext.t1.f1251a
            r1.put(r3, r4)
            if (r2 == 0) goto Lc3
            int[] r2 = android.ext.Tools.Y0(r2)
            android.ext.b2.f657c = r2
        Lc3:
            android.ext.b2.f656b = r1
        Lc5:
            return r0
    }

    public static int d(java.lang.String r2, java.lang.String r3) {
            android.content.res.Resources r0 = c()     // Catch: java.lang.Throwable -> L10
            r1 = 2131296356(0x7f090064, float:1.8210626E38)
            java.lang.String r1 = r0.getResourcePackageName(r1)     // Catch: java.lang.Throwable -> L10
            int r2 = r0.getIdentifier(r2, r3, r1)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Resource id for name '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "' not found"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.ext.e1.s(r2, r3)
            r2 = 0
            return r2
    }

    private static java.lang.String e(java.lang.String r5) {
            if (r5 != 0) goto L4
            java.lang.String r5 = "null"
        L4:
            r0 = 95
            int r0 = r5.indexOf(r0)
            if (r0 < 0) goto L65
            java.util.regex.Pattern r0 = android.ext.b2.f660f     // Catch: java.lang.Throwable -> L4e
            java.util.regex.Matcher r0 = r0.matcher(r5)     // Catch: java.lang.Throwable -> L4e
            r1 = r5
        L13:
            boolean r2 = r0.find()     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L4c
            r2 = 1
            java.lang.String r2 = r0.group(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "string"
            int r2 = d(r2, r3)     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L13
            r3 = 0
            java.lang.String r3 = r0.group(r3)     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = h(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r1.replace(r3, r2)     // Catch: java.lang.Throwable -> L34
            goto L13
        L34:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r3.<init>()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "Exception for: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4a
            r3.append(r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4a
            android.ext.e1.l(r3, r2)     // Catch: java.lang.Throwable -> L4a
            goto L13
        L4a:
            r0 = move-exception
            goto L50
        L4c:
            r5 = r1
            goto L65
        L4e:
            r0 = move-exception
            r1 = r5
        L50:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception on: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.ext.e1.l(r5, r0)
            goto L4c
        L65:
            return r5
    }

    public static java.lang.String f(int r0) {
            java.lang.String r0 = h(r0)
            return r0
    }

    public static java.lang.String g(java.lang.String r0) {
            java.lang.String r0 = e(r0)
            return r0
    }

    private static java.lang.String h(int r6) {
            if (r6 == 0) goto L54
            r0 = -1
            if (r6 != r0) goto L6
            goto L54
        L6:
            a.e r0 = android.ext.b2.f656b
            java.lang.Object r1 = r0.b(r6)
            if (r1 != 0) goto L10
            r1 = 0
            goto L14
        L10:
            java.lang.String r1 = r1.toString()
        L14:
            if (r1 != 0) goto L53
            android.content.res.Resources r1 = c()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r1.getString(r6)     // Catch: java.lang.Throwable -> L1f
            goto L41
        L1f:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Resource for id 0x"
            r2.append(r3)
            r3 = 8
            long r4 = (long) r6
            java.lang.String r3 = android.ext.t2.e(r3, r4)
            r2.append(r3)
            java.lang.String r3 = " not found"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.ext.e1.l(r2, r1)
            r1 = r2
        L41:
            java.lang.String r1 = e(r1)
            r0.c(r6, r1)     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r6 = move-exception
            android.ext.e1.a(r6)
        L4d:
            long r2 = java.lang.System.currentTimeMillis()
            android.ext.b2.f658d = r2
        L53:
            return r1
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(Invalid resource id "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ")"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
