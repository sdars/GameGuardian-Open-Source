package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f564a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f565b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String f566c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f567d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f568e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile java.lang.String f569f = ";;";

    static {
            boolean r0 = j()
            android.ext.a0.f568e = r0
            java.lang.String r0 = "bugged-packages"
            android.ext.a0.f566c = r0
            java.lang.String r0 = "bugged-uids"
            android.ext.a0.f567d = r0
            java.lang.String r0 = "native_crash.txt"
            android.ext.a0.f564a = r0
            java.lang.String r0 = " _QAZ_WSX_EDC_RFV_TGB_YHN_UJM_ "
            android.ext.a0.f565b = r0
            return
    }

    public static boolean a(java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.ext.a0.f568e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = android.ext.i.f1002d
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto Lf
            return r1
        Lf:
            java.lang.String r2 = "uid:"
            boolean r3 = r4.startsWith(r2)
            if (r3 == 0) goto L31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            int r2 = android.os.Process.myUid()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L31
            return r1
        L31:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r1.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "CNC["
            r1.append(r2)     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L40
            r2 = 49
            goto L42
        L40:
            r2 = 48
        L42:
            r1.append(r2)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "] - n: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L9d
            r1.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "; "
            r1.append(r2)     // Catch: java.lang.Throwable -> L9d
            r1.append(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9d
            android.ext.e1.d(r1)     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto La3
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9d
            java.io.File r1 = g()     // Catch: java.lang.Throwable -> L9d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9d
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L9d
            r0.write(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = android.ext.a0.f565b     // Catch: java.lang.Throwable -> L9d
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L9d
            r0.write(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r4.<init>()     // Catch: java.lang.Throwable -> L9d
            r4.append(r5)     // Catch: java.lang.Throwable -> L9d
            r5 = 10
            r4.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = android.ext.h0.c()     // Catch: java.lang.Throwable -> L9d
            r4.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L9d
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L9d
            r0.write(r4)     // Catch: java.lang.Throwable -> L9d
            r0.flush()     // Catch: java.lang.Throwable -> L9d
            r0.close()     // Catch: java.lang.Throwable -> L9d
            goto La3
        L9d:
            r4 = move-exception
            java.lang.String r5 = "Failed n CNC"
            android.ext.e1.l(r5, r4)
        La3:
            r4 = 1
            return r4
    }

    public static void b(boolean r2) {
            boolean r0 = android.ext.a0.f568e
            if (r0 == 0) goto L37
            if (r2 != 0) goto L7
            goto L37
        L7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "CNC["
            r2.append(r1)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L16
            r1 = 49
            goto L18
        L16:
            r1 = 48
        L18:
            r2.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "] - x"
            r2.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L31
            android.ext.e1.d(r2)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L37
            java.io.File r2 = g()     // Catch: java.lang.Throwable -> L31
            r2.delete()     // Catch: java.lang.Throwable -> L31
            goto L37
        L31:
            r2 = move-exception
            java.lang.String r0 = "Failed x CNC"
            android.ext.e1.l(r0, r2)
        L37:
            return
    }

    public static java.lang.String[] c() {
            boolean r0 = android.ext.a0.f568e
            if (r0 == 0) goto L29
            java.lang.String r0 = d()
            int r1 = r0.length()
            if (r1 <= 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "BUGGED_PACKAGES: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            return r0
        L29:
            java.lang.String[] r0 = d.b.f1509a
            return r0
    }

    private static java.lang.String d() {
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            java.lang.String r1 = android.ext.a0.f566c
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.String r0 = l(r0)
            int r1 = r0.length()
            if (r1 <= 0) goto L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 59
            r1.append(r2)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.a0.f569f = r1
        L2c:
            return r0
    }

    public static java.lang.String[] e() {
            boolean r0 = android.ext.a0.f568e
            if (r0 == 0) goto L29
            java.lang.String r0 = f()
            int r1 = r0.length()
            if (r1 <= 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "BUGGED_UIDS: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            return r0
        L29:
            java.lang.String[] r0 = d.b.f1509a
            return r0
    }

    private static java.lang.String f() {
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            java.lang.String r1 = android.ext.a0.f567d
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.String r0 = l(r0)
            return r0
    }

    private static java.io.File g() {
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.ext.Tools.q0()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = android.os.Process.myPid()
            r2.append(r3)
            java.lang.String r3 = android.ext.a0.f564a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            java.io.File r1 = r0.getParentFile()     // Catch: java.lang.Throwable -> L26
            r1.mkdirs()     // Catch: java.lang.Throwable -> L26
            goto L2c
        L26:
            r1 = move-exception
            java.lang.String r2 = "Failed mkdirs CNC"
            android.ext.e1.l(r2, r1)
        L2c:
            return r0
    }

    private static java.lang.String[] h() {
            java.io.File r0 = g()
            java.io.File r0 = r0.getParentFile()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.io.File[] r0 = r0.listFiles()
            if (r0 != 0) goto L13
            return r1
        L13:
            int r1 = r0.length
            int r2 = r1 * 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r4 = 0
        L1a:
            if (r4 >= r1) goto L74
            r5 = r0[r4]
            if (r5 == 0) goto L71
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = android.ext.a0.f564a
            boolean r6 = r6.endsWith(r7)
            if (r6 != 0) goto L2d
            goto L71
        L2d:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L68
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L68
            long r7 = r5.length()     // Catch: java.lang.Throwable -> L68
            int r8 = (int) r7     // Catch: java.lang.Throwable -> L68
            int r8 = r8 + 8192
            r7 = 102400(0x19000, float:1.43493E-40)
            int r7 = java.lang.Math.min(r8, r7)     // Catch: java.lang.Throwable -> L68
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L68
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L68
            r6.close()     // Catch: java.lang.Throwable -> L68
            if (r8 <= 0) goto L6e
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L68
            r6.<init>(r7, r3, r8)     // Catch: java.lang.Throwable -> L68
            java.lang.String r7 = android.ext.a0.f565b     // Catch: java.lang.Throwable -> L68
            r8 = 2
            java.lang.String[] r6 = r6.split(r7, r8)     // Catch: java.lang.Throwable -> L68
            int r7 = r6.length     // Catch: java.lang.Throwable -> L68
            if (r7 != r8) goto L6e
            int r7 = r4 * 2
            r8 = r6[r3]     // Catch: java.lang.Throwable -> L68
            r2[r7] = r8     // Catch: java.lang.Throwable -> L68
            int r7 = r7 + 1
            r8 = 1
            r6 = r6[r8]     // Catch: java.lang.Throwable -> L68
            r2[r7] = r6     // Catch: java.lang.Throwable -> L68
            goto L6e
        L68:
            r6 = move-exception
            java.lang.String r7 = "Failed read native crash"
            android.ext.e1.l(r7, r6)
        L6e:
            r5.delete()
        L71:
            int r4 = r4 + 1
            goto L1a
        L74:
            return r2
    }

    public static boolean i(java.lang.String r3) {
            boolean r0 = android.ext.a0.f568e
            if (r0 == 0) goto L1f
            java.lang.String r0 = android.ext.a0.f569f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 59
            r1.append(r2)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = r1.toString()
            boolean r3 = r0.contains(r3)
            goto L20
        L1f:
            r3 = 0
        L20:
            return r3
    }

    private static boolean j() {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = "/system/lib/libandroidfw.so"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L63
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L6c
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L63
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "_ZN7android12AssetManager10getPkgNameEPKc"
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L63
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L63
            int r4 = r1.length     // Catch: java.lang.Throwable -> L63
            r5 = 0
            r6 = 0
        L20:
            int r7 = 8192 - r5
            int r7 = r2.read(r3, r5, r7)     // Catch: java.lang.Throwable -> L43
            if (r7 <= 0) goto L48
            int r5 = r5 + r7
            if (r5 < r4) goto L20
            int r7 = r5 - r4
            r8 = 1
            int r7 = r7 + r8
            r9 = 0
        L30:
            if (r9 >= r7) goto L46
            r10 = 0
        L33:
            if (r10 >= r4) goto L45
            int r11 = r9 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L43
            r12 = r1[r10]     // Catch: java.lang.Throwable -> L43
            if (r11 == r12) goto L40
            int r9 = r9 + 1
            goto L30
        L40:
            int r10 = r10 + 1
            goto L33
        L43:
            r0 = move-exception
            goto L66
        L45:
            r6 = 1
        L46:
            if (r6 == 0) goto L4a
        L48:
            r0 = r6
            goto L5b
        L4a:
            int r7 = r4 + (-1)
            r8 = 0
        L4d:
            if (r8 >= r7) goto L59
            int r9 = r5 - r7
            int r9 = r9 + r8
            r9 = r3[r9]     // Catch: java.lang.Throwable -> L43
            r3[r8] = r9     // Catch: java.lang.Throwable -> L43
            int r8 = r8 + 1
            goto L4d
        L59:
            r5 = r7
            goto L20
        L5b:
            r2.close()     // Catch: java.lang.Throwable -> L5f
            goto L6c
        L5f:
            r1 = move-exception
            r6 = r0
            r0 = r1
            goto L66
        L63:
            r1 = move-exception
            r0 = r1
            r6 = 0
        L66:
            java.lang.String r1 = "Failed detect CM13"
            android.ext.e1.s(r1, r0)
            r0 = r6
        L6c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CM13: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            return r0
    }

    public static void k() {
            java.lang.String r0 = "lLC - 1"
            android.ext.e1.d(r0)
            d()
            f()
            java.lang.String[] r0 = h()
            if (r0 == 0) goto Lb7
            int r1 = r0.length
            r2 = 0
        L13:
            if (r2 >= r1) goto Lb7
            r3 = r0[r2]
            if (r3 != 0) goto L1b
            goto Lb3
        L1b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Bad package: '"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = "' "
            r4.append(r5)
            int r5 = r2 + 1
            r5 = r0[r5]
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.ext.e1.i(r4)
            java.lang.String r4 = android.ext.a0.f566c
            java.lang.String r5 = "uid:"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L51
            java.lang.String r4 = android.ext.a0.f567d
            java.lang.String r5 = ":"
            r6 = -1
            java.lang.String[] r3 = r3.split(r5, r6)
            r5 = 1
            r3 = r3[r5]
        L51:
            android.content.SharedPreferences r5 = android.ext.Tools.M0()
            java.lang.String r6 = ""
            java.lang.String r6 = r5.getString(r4, r6)
            if (r6 == 0) goto La4
            int r7 = r6.length()
            if (r7 != 0) goto L64
            goto La4
        L64:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 59
            r7.append(r8)
            r7.append(r6)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r3)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            boolean r7 = r7.contains(r9)
            if (r7 != 0) goto La3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            goto La4
        La3:
            r3 = r6
        La4:
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r3 = l(r3)
            android.content.SharedPreferences$Editor r3 = r5.putString(r4, r3)
            r3.commit()
        Lb3:
            int r2 = r2 + 2
            goto L13
        Lb7:
            d()
            f()
            java.lang.String r0 = "lLC - 0"
            android.ext.e1.d(r0)
            return
    }

    private static java.lang.String l(java.lang.String r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.HashSet r1 = new java.util.HashSet
            java.lang.String r2 = ";"
            java.lang.String[] r3 = r3.split(r2)
            java.util.List r3 = java.util.Arrays.asList(r3)
            r1.<init>(r3)
            r0.<init>(r1)
            int r3 = r0.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            java.lang.String r3 = android.text.TextUtils.join(r2, r3)
            return r3
    }
}
