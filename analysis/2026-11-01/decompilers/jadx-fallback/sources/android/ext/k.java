package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f1041a = "locale";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile java.lang.String f1042b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.String f1043c = "crashed-vm";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static java.lang.String f1044d = "crashed-vm2";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile java.util.Locale f1045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static java.util.List f1046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.regex.Pattern f1047g = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.ext.k.f1046f = r0
            java.lang.String r0 = "~~~([-_A-Za-z0-9]{1,10})~~~"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r0 = move-exception
            android.ext.e1.a(r0)
            r0 = 0
        L13:
            android.ext.k.f1047g = r0
            return
    }

    public static void a(java.lang.String r2) {
            java.util.Locale r0 = d(r2)
            java.util.Locale.setDefault(r0)
            r1 = 0
            a.b.g(r1, r0)
            android.content.Context r0 = android.ext.r.p
            k(r0)
            android.content.Context r0 = android.ext.r.o
            k(r0)
            android.content.Context r0 = android.ext.MainService.context
            k(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Loaded locale: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            l()
            java.lang.String r0 = android.ext.k.f1042b
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3e
            android.ext.k.f1042b = r2
            android.ext.b2.a()
        L3e:
            return
    }

    public static java.lang.String b() {
            android.content.SharedPreferences r0 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = android.ext.k.f1041a     // Catch: java.lang.Throwable -> L13
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L13
            goto L1b
        L13:
            r0 = move-exception
            java.lang.String r1 = "Failed get locale"
            android.ext.e1.l(r1, r0)
            java.lang.String r0 = ""
        L1b:
            return r0
    }

    public static java.util.Locale c() {
            java.lang.String r0 = b()
            java.util.Locale r0 = d(r0)
            return r0
    }

    public static java.util.Locale d(java.lang.String r3) {
            java.lang.String r0 = "[-_]"
            java.lang.String[] r0 = r3.split(r0)
            int r1 = r0.length
            r2 = 1
            if (r1 <= r2) goto L15
            java.util.Locale r3 = new java.util.Locale
            r1 = 0
            r1 = r0[r1]
            r0 = r0[r2]
            r3.<init>(r1, r0)
            goto L1b
        L15:
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r3)
            r3 = r0
        L1b:
            return r3
    }

    public static java.lang.String[] e() {
            java.lang.String[] r0 = d.b.f1509a
            android.content.SharedPreferences r1 = android.ext.Tools.M0()
            java.lang.String r2 = android.ext.k.f1043c
            r3 = 0
            boolean r2 = r1.getBoolean(r2, r3)
            r4 = 1
            if (r2 != 0) goto L36
            android.content.SharedPreferences$Editor r0 = r1.edit()
            java.lang.String r2 = android.ext.k.f1043c
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r4)
            r0.commit()
            android.content.Context r0 = android.ext.Tools.f0()
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String[] r0 = r0.getLocales()
            android.content.SharedPreferences$Editor r2 = r1.edit()
            java.lang.String r5 = android.ext.k.f1043c
            android.content.SharedPreferences$Editor r2 = r2.remove(r5)
            r2.commit()
        L36:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r5 = ""
            r2.add(r5)
            int r6 = r0.length
            r7 = 0
        L42:
            if (r7 >= r6) goto L55
            r8 = r0[r7]
            if (r8 != 0) goto L49
            goto L52
        L49:
            boolean r9 = r2.contains(r8)
            if (r9 != 0) goto L52
            r2.add(r8)
        L52:
            int r7 = r7 + 1
            goto L42
        L55:
            java.lang.String r0 = android.ext.k.f1044d
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L7c
            android.content.SharedPreferences$Editor r0 = r1.edit()
            java.lang.String r6 = android.ext.k.f1044d
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r6, r4)
            r0.commit()
            java.util.Locale[] r0 = java.util.Locale.getAvailableLocales()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r6 = android.ext.k.f1044d
            android.content.SharedPreferences$Editor r1 = r1.remove(r6)
            r1.commit()
            goto L7d
        L7c:
            r0 = 0
        L7d:
            r1 = 45
            r6 = 95
            if (r0 == 0) goto Lde
            int r7 = r0.length
            r8 = 0
        L85:
            if (r8 >= r7) goto Lde
            r9 = r0[r8]
            if (r9 != 0) goto L8c
            goto Ldb
        L8c:
            java.lang.String r10 = r9.getCountry()
            java.lang.String r9 = r9.getLanguage()
            if (r10 == 0) goto Lb0
            int r11 = r10.length()
            if (r11 != 0) goto L9d
            goto Lb0
        L9d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r6)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            goto Lb1
        Lb0:
            r11 = r9
        Lb1:
            if (r10 == 0) goto Lcc
            int r12 = r10.length()
            if (r12 != 0) goto Lba
            goto Lcc
        Lba:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            r12.append(r1)
            r12.append(r10)
            java.lang.String r9 = r12.toString()
        Lcc:
            boolean r10 = r2.contains(r11)
            if (r10 != 0) goto Ldb
            boolean r10 = r2.contains(r9)
            if (r10 != 0) goto Ldb
            r2.add(r9)
        Ldb:
            int r8 = r8 + 1
            goto L85
        Lde:
            java.util.regex.Pattern r0 = android.ext.k.f1047g
            if (r0 == 0) goto L168
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L14b
            android.content.Context r7 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L14b
            java.lang.String r7 = r7.getPackageResourcePath()     // Catch: java.lang.Throwable -> L14b
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r7 = "resources.arsc"
            java.util.zip.ZipEntry r7 = r0.getEntry(r7)     // Catch: java.lang.Throwable -> L14b
            java.io.InputStream r7 = r0.getInputStream(r7)     // Catch: java.lang.Throwable -> L14b
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L14b
        Lfd:
            int r9 = r7.read(r8)     // Catch: java.lang.Throwable -> L14b
            r10 = -1
            if (r9 == r10) goto L15c
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L14b
            java.lang.String r12 = "US-ASCII"
            java.nio.charset.Charset r12 = java.nio.charset.Charset.forName(r12)     // Catch: java.lang.Throwable -> L14b
            r11.<init>(r8, r3, r9, r12)     // Catch: java.lang.Throwable -> L14b
            r9 = 126(0x7e, float:1.77E-43)
            int r9 = r11.indexOf(r9)     // Catch: java.lang.Throwable -> L14b
            if (r9 == r10) goto L14d
            java.util.regex.Pattern r9 = android.ext.k.f1047g     // Catch: java.lang.Throwable -> L14b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14b
            r10.<init>()     // Catch: java.lang.Throwable -> L14b
            r10.append(r5)     // Catch: java.lang.Throwable -> L14b
            r10.append(r11)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = r10.toString()     // Catch: java.lang.Throwable -> L14b
            java.util.regex.Matcher r5 = r9.matcher(r5)     // Catch: java.lang.Throwable -> L14b
        L12c:
            boolean r9 = r5.find()     // Catch: java.lang.Throwable -> L14b
            if (r9 == 0) goto L14d
            java.lang.String r9 = r5.group(r4)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r10 = r9.replace(r6, r1)     // Catch: java.lang.Throwable -> L14b
            boolean r9 = r2.contains(r9)     // Catch: java.lang.Throwable -> L14b
            if (r9 != 0) goto L12c
            boolean r9 = r2.contains(r10)     // Catch: java.lang.Throwable -> L14b
            if (r9 == 0) goto L147
            goto L12c
        L147:
            r2.add(r10)     // Catch: java.lang.Throwable -> L14b
            goto L12c
        L14b:
            r0 = move-exception
            goto L163
        L14d:
            int r5 = r11.length()     // Catch: java.lang.Throwable -> L14b
            r9 = 40
            int r5 = java.lang.Math.min(r9, r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r5 = r11.substring(r3, r5)     // Catch: java.lang.Throwable -> L14b
            goto Lfd
        L15c:
            r7.close()     // Catch: java.lang.Throwable -> L14b
            r0.close()     // Catch: java.lang.Throwable -> L14b
            goto L168
        L163:
            java.lang.String r1 = "Failed load locales from apk"
            android.ext.e1.l(r1, r0)
        L168:
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public static java.util.Locale f() {
            java.util.Locale r0 = android.ext.k.f1045e
            if (r0 != 0) goto La
            java.util.Locale r0 = c()
            android.ext.k.f1045e = r0
        La:
            return r0
    }

    public static void g() {
            java.lang.String r0 = b()     // Catch: java.lang.Throwable -> L8
            a(r0)     // Catch: java.lang.Throwable -> L8
            goto Le
        L8:
            r0 = move-exception
            java.lang.String r1 = "Failed load locale"
            android.ext.e1.l(r1, r0)
        Le:
            return
    }

    public static void h(java.lang.Class r1) {
            java.util.List r0 = android.ext.k.f1046f
            r0.add(r1)
            return
    }

    public static void i(java.lang.String r2) {
            android.ext.g2 r0 = new android.ext.g2
            r0.<init>()
            java.lang.String r1 = android.ext.k.f1041a
            android.ext.g2 r0 = r0.j(r1, r2)
            r0.commit()
            a(r2)
            return
    }

    public static void j(java.util.Locale r0) {
            android.ext.k.f1045e = r0
            return
    }

    private static void k(android.content.Context r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.getResources()
            return
    }

    private static void l() {
            java.util.List r0 = android.ext.k.f1046f
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r2 = "updateLocale"
            r3 = 0
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L1d
            r2.invoke(r3, r3)     // Catch: java.lang.Throwable -> L1d
            goto L6
        L1d:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed call updateLocale for "
            r3.append(r4)
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.ext.e1.s(r1, r2)
            goto L6
        L37:
            return
    }
}
