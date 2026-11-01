package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class n0 implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile java.lang.Throwable f1100c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f1101d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Thread.UncaughtExceptionHandler f1102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f1103b;

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f1105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f1107d;

        a(java.lang.String r1, java.lang.String[] r2, int r3, java.lang.Runnable r4) {
                r0 = this;
                r0.f1104a = r1
                r0.f1105b = r2
                r0.f1106c = r3
                r0.f1107d = r4
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1 = -1
                if (r2 != r1) goto Le
                java.lang.String r1 = r0.f1104a
                android.ext.z2.c(r1)
                r1 = 2131297008(0x7f0902f0, float:1.8211949E38)
                android.ext.Tools.H1(r1)
            Le:
                r1 = -3
                if (r2 != r1) goto L1c
                java.lang.String[] r1 = r0.f1105b
                int r2 = r0.f1106c
                int r2 = r2 + 1
                r1 = r1[r2]
                android.ext.Tools.i1(r1)
            L1c:
                java.lang.Runnable r1 = r0.f1107d
                r1.run()
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.SharedPreferences f1108a;

        b(android.content.SharedPreferences r1) {
                r0 = this;
                r0.f1108a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.content.SharedPreferences r0 = r2.f1108a
                android.content.SharedPreferences$Editor r0 = r0.edit()
                java.lang.String r1 = "last_exception"
                android.content.SharedPreferences$Editor r0 = r0.remove(r1)
                r0.commit()
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.io.File f1109a;

        c(java.io.File r1) {
                r0 = this;
                r0.f1109a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.io.File r0 = r1.f1109a
                r0.delete()
                return
        }
    }

    class d implements android.content.DialogInterface.OnClickListener {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.content.Context r1 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> Ld
                java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> Ld
                java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld
                goto L15
            Ld:
                r1 = move-exception
                java.lang.String r2 = "Failed get files dir"
                android.ext.e1.s(r2, r1)
                java.lang.String r1 = "error"
            L15:
                android.ext.ConfigListAdapter.a(r1)
                return
        }
    }

    class e implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f1110a;

        e(java.lang.String[] r1) {
                r0 = this;
                r0.f1110a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                java.lang.String r3 = ": "
                r4 = 8
                java.lang.String r0 = "exec setprop persist.sys.whetstone.level 0"
                r1 = 15
                android.ext.e2.n(r0, r1)     // Catch: java.lang.Throwable -> L30
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
                r0.<init>()     // Catch: java.lang.Throwable -> L30
                java.lang.String[] r1 = r2.f1110a     // Catch: java.lang.Throwable -> L30
                r1 = r1[r4]     // Catch: java.lang.Throwable -> L30
                r0.append(r1)     // Catch: java.lang.Throwable -> L30
                r0.append(r3)     // Catch: java.lang.Throwable -> L30
                r1 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L30
                r0.append(r1)     // Catch: java.lang.Throwable -> L30
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L30
                java.lang.String r0 = android.ext.b2.g(r0)     // Catch: java.lang.Throwable -> L30
                android.ext.Tools.J1(r0)     // Catch: java.lang.Throwable -> L30
                goto L6c
            L30:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed fix "
                r0.append(r1)
                java.lang.String[] r1 = r2.f1110a
                r1 = r1[r4]
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.p(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String[] r1 = r2.f1110a
                r4 = r1[r4]
                r0.append(r4)
                r0.append(r3)
                r3 = 2131296848(0x7f090250, float:1.8211624E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r3 = android.ext.b2.g(r3)
                android.ext.Tools.J1(r3)
            L6c:
                return
        }
    }

    class f implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f1111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1112b;

        f(java.lang.String[] r1, int r2) {
                r0 = this;
                r0.f1111a = r1
                r0.f1112b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                java.lang.String[] r1 = r0.f1111a
                int r2 = r0.f1112b
                int r2 = r2 * 2
                int r2 = r2 + 1
                r1 = r1[r2]
                android.ext.Tools.i1(r1)
                return
        }
    }

    class g extends java.lang.Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.n0 f1114b;

        g(android.ext.n0 r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.f1114b = r1
                r0.f1113a = r3
                r0.<init>(r2)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
                android.os.Looper.prepare()     // Catch: java.lang.Throwable -> L14
                android.content.Context r0 = android.ext.p2.h()     // Catch: java.lang.Throwable -> L14
                java.lang.String r1 = r3.f1113a     // Catch: java.lang.Throwable -> L14
                r2 = 1
                android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)     // Catch: java.lang.Throwable -> L14
                android.ext.p2.j(r0)     // Catch: java.lang.Throwable -> L14
                android.os.Looper.loop()     // Catch: java.lang.Throwable -> L14
            L14:
                return
        }
    }

    public static class h extends java.lang.RuntimeException {
        public h(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static class i extends java.lang.Thread {
        public i(java.lang.Runnable r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.ext.n0.g(r0)
                return
        }
    }

    static {
            return
    }

    private n0(java.lang.Thread.UncaughtExceptionHandler r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f1102a = r1
            r0.f1103b = r2
            return
    }

    private static void a(java.lang.String r7, int r8, android.content.DialogInterface.OnClickListener r9) {
            java.lang.String[] r0 = e()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8 * 2
            r3 = r0[r2]
            r1.append(r3)
            java.lang.String r3 = " is reason of last fail"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.ext.e1.p(r1)
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            r3 = 2131296736(0x7f0901e0, float:1.8211397E38)
            android.view.View r3 = android.ext.Tools.g0(r3)
            android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 2131296729(0x7f0901d9, float:1.8211383E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r2 = r0[r2]
            r5[r6] = r2
            java.lang.String r2 = android.ext.Tools.L1(r4, r5)
            r3.append(r2)
            java.lang.String r2 = "\n\n"
            r3.append(r2)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.app.AlertDialog$Builder r7 = r1.setMessage(r7)
            r1 = 2131296786(0x7f090212, float:1.8211499E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.n0$f r2 = new android.ext.n0$f
            r2.<init>(r0, r8)
            android.app.AlertDialog$Builder r7 = r7.setNeutralButton(r1, r2)
            r8 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            r0 = 0
            android.app.AlertDialog$Builder r7 = r7.setNegativeButton(r8, r0)
            if (r9 == 0) goto L7e
            r8 = 2131296455(0x7f0900c7, float:1.8210827E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            r7.setPositiveButton(r8, r9)
        L7e:
            android.ext.f.s(r7)
            return
    }

    public static void b() {
            java.lang.String r0 = "- unknown -"
            java.lang.String r1 = "last_exception"
            c()
            android.content.SharedPreferences r2 = android.ext.Tools.M0()     // Catch: java.lang.StackOverflowError -> L24
            boolean r3 = r2.contains(r1)     // Catch: java.lang.StackOverflowError -> L24
            if (r3 == 0) goto L28
            java.lang.String r1 = r2.getString(r1, r0)     // Catch: java.lang.StackOverflowError -> L24
            java.lang.String r3 = "last_exception_trace"
            java.lang.String r0 = r2.getString(r3, r0)     // Catch: java.lang.StackOverflowError -> L24
            android.ext.n0$b r3 = new android.ext.n0$b     // Catch: java.lang.StackOverflowError -> L24
            r3.<init>(r2)     // Catch: java.lang.StackOverflowError -> L24
            j(r1, r0, r3)     // Catch: java.lang.StackOverflowError -> L24
            goto L28
        L24:
            r0 = move-exception
            android.ext.e1.a(r0)
        L28:
            java.io.File r0 = new java.io.File     // Catch: java.lang.StackOverflowError -> L5c
            java.io.File r1 = android.ext.Tools.q0()     // Catch: java.lang.StackOverflowError -> L5c
            java.lang.String r2 = "store_ex.txt"
            r0.<init>(r1, r2)     // Catch: java.lang.StackOverflowError -> L5c
            boolean r1 = r0.exists()     // Catch: java.lang.StackOverflowError -> L5c
            if (r1 == 0) goto L86
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            r3.<init>(r0)     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            r2.<init>(r3)     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            r1.<init>(r2)     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            r2.<init>()     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
        L4d:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            if (r3 == 0) goto L60
            r2.append(r3)     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            r3 = 10
            r2.append(r3)     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            goto L4d
        L5c:
            r0 = move-exception
            goto L83
        L5e:
            r0 = move-exception
            goto L7d
        L60:
            r1.close()     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            java.lang.String r1 = r2.toString()     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            java.lang.String r2 = "@#%~~%#@"
            r3 = 2
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            r2 = 0
            r2 = r1[r2]     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            r3 = 1
            r1 = r1[r3]     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            android.ext.n0$c r3 = new android.ext.n0$c     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            r3.<init>(r0)     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            j(r2, r1, r3)     // Catch: java.lang.StackOverflowError -> L5c java.io.IOException -> L5e
            goto L86
        L7d:
            java.lang.String r1 = "Failed load exception"
            android.ext.e1.l(r1, r0)     // Catch: java.lang.StackOverflowError -> L5c
            goto L86
        L83:
            android.ext.e1.a(r0)
        L86:
            return
    }

    private static void c() {
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.ext.Tools.q0()
            java.lang.String r2 = "client_crash.log"
            r0.<init>(r1, r2)
            long r1 = android.ext.Config.f30c
            r3 = 64
            long r1 = r1 & r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L13c
            boolean r1 = r0.exists()
            if (r1 == 0) goto L13c
            long r1 = r0.length()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L13c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            r2 = 10
            r3 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L60
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L60
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L60
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L60
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L60
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L60
        L3b:
            boolean r5 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L6f
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L6f
            if (r3 != 0) goto L68
            java.lang.String r6 = android.ext.f0.T()     // Catch: java.lang.Throwable -> L60
            boolean r7 = r5.contains(r6)     // Catch: java.lang.Throwable -> L60
            if (r7 == 0) goto L62
            java.lang.String r7 = r5.trim()     // Catch: java.lang.Throwable -> L60
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L5e
            goto L62
        L5e:
            r3 = 1
            goto L68
        L60:
            r4 = move-exception
            goto L73
        L62:
            java.lang.String r5 = "Native crash check fail."
            android.ext.e1.p(r5)     // Catch: java.lang.Throwable -> L60
            goto L6f
        L68:
            r1.append(r5)     // Catch: java.lang.Throwable -> L60
            r1.append(r2)     // Catch: java.lang.Throwable -> L60
            goto L3b
        L6f:
            r4.close()     // Catch: java.lang.Throwable -> L60
            goto L82
        L73:
            java.lang.String r5 = r4.getMessage()     // Catch: java.lang.Throwable -> Laf
            r1.append(r5)     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "Native crash load fail."
            android.ext.e1.s(r2, r4)     // Catch: java.lang.Throwable -> Laf
        L82:
            java.lang.String r2 = "Native crash not detected: "
            if (r3 == 0) goto L11a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
            boolean r3 = d(r1)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r4 = "Native crash detected: "
            if (r3 == 0) goto Lb2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            r1.append(r4)     // Catch: java.lang.Throwable -> Laf
            long r2 = r0.length()     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = " bytes, known reason."
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
            android.ext.e1.p(r1)     // Catch: java.lang.Throwable -> Laf
            goto L133
        Laf:
            r1 = move-exception
            goto L137
        Lb2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r3.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = ">>> "
            r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> Laf
            r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = " <<<"
            r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Laf
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> Laf
            if (r3 == 0) goto Lfe
            java.lang.String r3 = "backtrace:"
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> Laf
            if (r3 == 0) goto Lfe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r2.<init>()     // Catch: java.lang.Throwable -> Laf
            r2.append(r4)     // Catch: java.lang.Throwable -> Laf
            long r3 = r0.length()     // Catch: java.lang.Throwable -> Laf
            r2.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = " bytes."
            r2.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Laf
            android.ext.e1.p(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "Native crash sended."
            android.ext.e1.p(r2)     // Catch: java.lang.Throwable -> Laf
            i(r1)     // Catch: java.lang.Throwable -> Laf
            goto L133
        Lfe:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            long r2 = r0.length()     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = " bytes spooled without a native backtrace, discarded."
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
        L116:
            android.ext.e1.d(r1)     // Catch: java.lang.Throwable -> Laf
            goto L133
        L11a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            long r2 = r0.length()     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = " bytes spool failed the header check, discarded."
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
            goto L116
        L133:
            r0.delete()     // Catch: java.lang.Throwable -> Laf
            goto L13c
        L137:
            java.lang.String r2 = "Native crash check file fail."
            android.ext.e1.s(r2, r1)
        L13c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L14b
            java.io.File r2 = android.ext.Tools.q0()     // Catch: java.lang.Throwable -> L14b
            java.lang.String r3 = "client_exit"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L14b
            r1.delete()     // Catch: java.lang.Throwable -> L14b
            goto L151
        L14b:
            r1 = move-exception
            java.lang.String r2 = "Native crash clear exit mark fail."
            android.ext.e1.s(r2, r1)
        L151:
            r0.createNewFile()     // Catch: java.lang.Throwable -> L155
            goto L15b
        L155:
            r0 = move-exception
            java.lang.String r1 = "Native crash create file fail."
            android.ext.e1.s(r1, r0)
        L15b:
            return
    }

    public static boolean d(java.lang.String r5) {
            java.lang.String[] r0 = e()
            java.lang.String r1 = " Process  ("
            boolean r1 = r5.contains(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L68
            java.lang.String r1 = ") has open file /"
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L68
            java.lang.String r0 = "unmount is reason of last fail"
            android.ext.e1.p(r0)
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r1 = 2131296736(0x7f0901e0, float:1.8211397E38)
            android.view.View r1 = android.ext.Tools.g0(r1)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r4 = 2131297064(0x7f090328, float:1.8212062E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            r1.append(r4)
            java.lang.String r4 = "\n\n"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.app.AlertDialog$Builder r5 = r0.setMessage(r5)
            r0 = 2131296455(0x7f0900c7, float:1.8210827E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.ext.n0$d r1 = new android.ext.n0$d
            r1.<init>()
            android.app.AlertDialog$Builder r5 = r5.setPositiveButton(r0, r1)
            r0 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r0, r2)
            android.ext.f.s(r5)
            return r3
        L68:
            java.lang.String r1 = "CZAutoRunController"
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L7c
            android.ext.r$n r0 = new android.ext.r$n
            java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25<70krz0wr0uxq0lq0skrhql{rv0jdphjxdugldq2"
            r0.<init>(r1)
            r1 = 3
            a(r5, r1, r0)
            return r3
        L7c:
            r1 = 8
            r1 = r0[r1]
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L90
            android.ext.n0$e r1 = new android.ext.n0$e
            r1.<init>(r0)
            r0 = 4
            a(r5, r0, r1)
            return r3
        L90:
            r1 = 10
            r0 = r0[r1]
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L9f
            r0 = 5
            a(r5, r0, r2)
            return r3
        L9f:
            r5 = 0
            return r5
    }

    public static java.lang.String[] e() {
            java.lang.String r0 = "XPrivacy"
            java.lang.String r1 = "biz.bokhorst.xprivacy"
            java.lang.String r2 = "Prevent Running"
            java.lang.String r3 = "me.piebridge.forcestopgb"
            java.lang.String r4 = "Brevent"
            java.lang.String r5 = "me.piebridge.brevent"
            java.lang.String r6 = "Security"
            java.lang.String r7 = "com.chaozhuo.permission.controller"
            java.lang.String r8 = "Whetstone"
            java.lang.String r9 = "com.miui.whetstone"
            java.lang.String r10 = "NeoSafe"
            java.lang.String r11 = "cn.nubia.security2"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            return r0
    }

    public static void f() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            g(r0)
            return
    }

    public static void g(java.lang.Thread r4) {
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            if (r0 == 0) goto La
            boolean r1 = r0 instanceof android.ext.n0
            if (r1 != 0) goto L14
        La:
            android.ext.n0 r1 = new android.ext.n0
            java.lang.String r2 = "default"
            r1.<init>(r0, r2)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
        L14:
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.getUncaughtExceptionHandler()
            if (r0 == 0) goto L1e
            boolean r1 = r0 instanceof android.ext.n0
            if (r1 != 0) goto L41
        L1e:
            if (r0 != 0) goto L24
            java.lang.ThreadGroup r0 = r4.getThreadGroup()
        L24:
            android.ext.n0 r1 = new android.ext.n0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "thread:"
            r2.append(r3)
            java.lang.String r3 = r4.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            r4.setUncaughtExceptionHandler(r1)
        L41:
            return
    }

    public static java.lang.String h(java.lang.Thread r16, java.lang.Throwable r17, boolean r18) {
            r1 = r17
            java.lang.String r2 = "-b"
            java.lang.String r3 = ""
            java.lang.String r0 = "JJ#fudvkhg"
            java.lang.String r4 = android.ext.Tools.removeNewLinesChars(r0)
            java.lang.String r5 = r16.getName()
            if (r18 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Exception in thread "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.ext.e1.l(r0, r1)
            android.ext.e1.c()
        L29:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "GG: "
            r6.append(r0)
            r7 = 1
            float r8 = (float) r7
            r0 = 1121779712(0x42dd0000, float:110.5)
            float r0 = r0 * r8
            r9 = 1091672474(0x4111999a, float:9.1)
            float r0 = r0 - r9
            r6.append(r0)
            java.lang.String r0 = " ["
            r6.append(r0)
            r0 = 1182892698(0x4681829a, float:16577.3)
            float r0 = r0 * r8
            r9 = 1137911398(0x43d32666, float:422.3)
            float r0 = r0 - r9
            r9 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r9
            int r0 = (int) r0
            r6.append(r0)
            java.lang.String r0 = "]\nAndroid: "
            r6.append(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r6.append(r0)
            java.lang.String r0 = "\nSDK: "
            r6.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r6.append(r0)
            java.lang.String r0 = "\nvSpace: "
            r6.append(r0)
            java.lang.String r0 = android.ext.f1.x()
            r6.append(r0)
            java.lang.String r0 = "\nThread: "
            r6.append(r0)
            r6.append(r5)
            r10 = 10
            r6.append(r10)
            java.lang.String r0 = android.ext.e1.n(r17)
            boolean r11 = r1 instanceof java.lang.StackOverflowError
            r12 = 0
            if (r11 != 0) goto L93
            java.lang.String r11 = "java.lang.StackOverflowError"
            boolean r11 = r0.contains(r11)
            if (r11 == 0) goto L9d
        L93:
            java.lang.String r11 = "com.lody.virtual.client.ipc."
            boolean r11 = r0.contains(r11)
            if (r11 == 0) goto L9d
            r11 = 1
            goto L9e
        L9d:
            r11 = 0
        L9e:
            r6.append(r0)
            java.lang.String r13 = "ActivityNotFoundException"
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto Lae
            java.lang.String r0 = android.ext.i.f1002d
            android.ext.Tools.B(r0, r6)
        Lae:
            java.lang.String r0 = "\nHash: "
            r6.append(r0)
            java.lang.String r0 = android.ext.b1.X()     // Catch: java.lang.Throwable -> Lbb
            r6.append(r0)     // Catch: java.lang.Throwable -> Lbb
            goto Lc6
        Lbb:
            r0 = move-exception
            java.lang.String r13 = "???"
            r6.append(r13)
            java.lang.String r13 = "dbg"
            android.ext.e1.l(r13, r0)
        Lc6:
            java.lang.String r6 = r6.toString()
            android.content.Context r0 = android.ext.Tools.f0()
            if (r0 == 0) goto Ld2
            r0 = 1
            goto Ld3
        Ld2:
            r0 = 0
        Ld3:
            java.lang.String r13 = "EGL_"
            boolean r13 = r6.contains(r13)
            if (r13 != 0) goto Lee
            java.lang.String r13 = "egl"
            boolean r13 = r6.contains(r13)
            if (r13 != 0) goto Lee
            java.lang.String r13 = "HardwareRenderer"
            boolean r13 = r6.contains(r13)
            if (r13 == 0) goto Lec
            goto Lee
        Lec:
            r13 = 0
            goto Lef
        Lee:
            r13 = 1
        Lef:
            r14 = 2
            if (r18 == 0) goto L11a
            if (r0 == 0) goto L11a
            if (r13 == 0) goto L11a
            int r15 = android.ext.Config.B
            r15 = r15 & r14
            if (r15 == 0) goto L11a
            r0 = 2131034150(0x7f050026, float:1.767881E38)
            android.ext.Config$p r0 = android.ext.Config.b(r0)
            r0.f42d = r12
            android.ext.Config.k()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = ". Hardware acceleration fail."
        L111:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L312
        L11a:
            if (r18 == 0) goto L13e
            if (r13 == 0) goto L13e
            int r13 = android.ext.Config.B
            r13 = r13 & r14
            if (r13 != 0) goto L13e
            boolean r13 = android.ext.r.l
            if (r13 == 0) goto L13e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = ". Hardware acceleration fail. Try use 'GG (SW)' icon for start."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.n0.f1101d = r7
            android.ext.r.l = r12
            goto L312
        L13e:
            r13 = 8
            if (r18 == 0) goto L168
            if (r0 == 0) goto L168
            java.lang.String r15 = "Suggestion"
            boolean r15 = r6.contains(r15)
            if (r15 == 0) goto L168
            int r15 = android.ext.Config.B
            r15 = r15 & r13
            if (r15 == 0) goto L168
            r0 = 2131034201(0x7f050059, float:1.7678913E38)
            android.ext.Config$p r0 = android.ext.Config.b(r0)
            r0.f42d = r12
            android.ext.Config.k()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = ". Cause: suggestions."
            goto L111
        L168:
            if (r18 == 0) goto L191
            if (r0 == 0) goto L191
            java.lang.String r0 = "playSoundEffect"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L191
            int r0 = android.ext.Config.B
            r0 = r0 & 32
            if (r0 == 0) goto L191
            r0 = 2131034212(0x7f050064, float:1.7678935E38)
            android.ext.Config$p r0 = android.ext.Config.b(r0)
            r0.f42d = r12
            android.ext.Config.k()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = ". Cause: sound effects."
            goto L111
        L191:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r15 = android.ext.Tools.K0()     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r9 = "crash.txt"
            r0.<init>(r15, r9)     // Catch: java.lang.Throwable -> L1d2
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1d2
            r9.<init>(r0, r7)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r15 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L1d2
            android.ext.r.U(r9, r15, r3)     // Catch: java.lang.Throwable -> L1d2
            byte[] r15 = r3.getBytes()     // Catch: java.lang.Throwable -> L1d2
            r9.write(r15)     // Catch: java.lang.Throwable -> L1d2
            byte[] r15 = r6.getBytes()     // Catch: java.lang.Throwable -> L1d2
            r9.write(r15)     // Catch: java.lang.Throwable -> L1d2
            r9.close()     // Catch: java.lang.Throwable -> L1d2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d2
            r9.<init>()     // Catch: java.lang.Throwable -> L1d2
            r9.append(r4)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r15 = "\nLog: "
            r9.append(r15)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L1d2
            r9.append(r0)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L1d2
            goto L1d8
        L1d2:
            r0 = move-exception
            java.lang.String r9 = "Failed out crash to file"
            android.ext.e1.s(r9, r0)
        L1d8:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L252
            java.lang.String r0 = android.ext.Tools.K0()     // Catch: java.lang.Throwable -> L252
            java.lang.String r15 = "logcat.txt"
            r9.<init>(r0, r15)     // Catch: java.lang.Throwable -> L252
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L252
            r0.<init>(r9, r7)     // Catch: java.lang.Throwable -> L252
            java.lang.String r15 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L252
            android.ext.r.U(r0, r15, r3)     // Catch: java.lang.Throwable -> L252
            r0 = 11
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = "logcat"
            r0[r12] = r3     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = "-f"
            r0[r7] = r3     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = android.ext.Tools.F0(r3)     // Catch: java.lang.Throwable -> L252
            r0[r14] = r3     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = "-d"
            r14 = 3
            r0[r14] = r3     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = "-v"
            r14 = 4
            r0[r14] = r3     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = "threadtime"
            r14 = 5
            r0[r14] = r3     // Catch: java.lang.Throwable -> L252
            r3 = 6
            r0[r3] = r2     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = "main"
            r14 = 7
            r0[r14] = r3     // Catch: java.lang.Throwable -> L252
            r0[r13] = r2     // Catch: java.lang.Throwable -> L252
            java.lang.String r2 = "system"
            r3 = 9
            r0[r3] = r2     // Catch: java.lang.Throwable -> L252
            java.lang.String r2 = "*:V"
            r0[r10] = r2     // Catch: java.lang.Throwable -> L252
            java.lang.Process r2 = android.ext.Tools.I(r0)     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            r3 = 15
            boolean r2 = android.ext.Tools.X1(r2, r3)     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            if (r2 != 0) goto L25a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            r2.<init>()     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            java.lang.String r3 = "timeout fail 1: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            r2.append(r0)     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            r2.<init>()     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            android.ext.e1.s(r0, r2)     // Catch: java.lang.Throwable -> L252 java.lang.Exception -> L254
            goto L25a
        L252:
            r0 = move-exception
            goto L273
        L254:
            r0 = move-exception
            java.lang.String r2 = "exec"
            android.ext.e1.s(r2, r0)     // Catch: java.lang.Throwable -> L252
        L25a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L252
            r0.<init>()     // Catch: java.lang.Throwable -> L252
            r0.append(r4)     // Catch: java.lang.Throwable -> L252
            java.lang.String r2 = "\nLogcat: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L252
            java.lang.String r2 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L252
            r0.append(r2)     // Catch: java.lang.Throwable -> L252
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L252
            goto L278
        L273:
            java.lang.String r2 = "Failed out logcat to file"
            android.ext.e1.s(r2, r0)
        L278:
            r0 = 2131034375(0x7f050107, float:1.7679266E38)
            android.ext.Config$p r0 = android.ext.Config.b(r0)     // Catch: java.lang.Throwable -> L2ab
            r2 = 1182923162(0x4681f99a, float:16636.8)
            float r8 = r8 * r2
            r2 = 1139861094(0x43f0e666, float:481.8)
            float r8 = r8 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r2
            int r2 = (int) r8     // Catch: java.lang.Throwable -> L2ab
            r0.f42d = r2     // Catch: java.lang.Throwable -> L2ab
            android.ext.Config.k()     // Catch: java.lang.Throwable -> L2ab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ab
            r0.<init>()     // Catch: java.lang.Throwable -> L2ab
            r0.append(r4)     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r2 = "\nNext run rec logcat: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r2 = android.ext.r.v()     // Catch: java.lang.Throwable -> L2ab
            r0.append(r2)     // Catch: java.lang.Throwable -> L2ab
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2ab
            r4 = r0
            goto L2b1
        L2ab:
            r0 = move-exception
            java.lang.String r2 = "Failed enable logcat on next run"
            android.ext.e1.s(r2, r0)
        L2b1:
            java.lang.String[] r0 = e()     // Catch: java.lang.Throwable -> L2ea
            if (r18 == 0) goto L2ec
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ea
            r2.<init>()     // Catch: java.lang.Throwable -> L2ea
            java.lang.String r3 = ": "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2ea
            r3 = r0[r12]     // Catch: java.lang.Throwable -> L2ea
            r2.append(r3)     // Catch: java.lang.Throwable -> L2ea
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2ea
            boolean r2 = r6.contains(r2)     // Catch: java.lang.Throwable -> L2ea
            if (r2 != 0) goto L2d1
            goto L2ec
        L2d1:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2ea
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ea
            r3.<init>()     // Catch: java.lang.Throwable -> L2ea
            r0 = r0[r12]     // Catch: java.lang.Throwable -> L2ea
            r3.append(r0)     // Catch: java.lang.Throwable -> L2ea
            java.lang.String r0 = " is cause"
            r3.append(r0)     // Catch: java.lang.Throwable -> L2ea
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L2ea
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2ea
            throw r2     // Catch: java.lang.Throwable -> L2ea
        L2ea:
            r0 = move-exception
            goto L303
        L2ec:
            if (r11 == 0) goto L2f4
            java.lang.String r0 = "VSpace StackOverflowError - log not sended"
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L2ea
            goto L311
        L2f4:
            boolean r0 = android.ext.z2.d(r6, r7)     // Catch: java.lang.Throwable -> L2ea
            if (r0 == 0) goto L2fb
            goto L311
        L2fb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2ea
            java.lang.String r2 = "Failed sendLogBlocking"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2ea
            throw r0     // Catch: java.lang.Throwable -> L2ea
        L303:
            java.lang.String r2 = "Cannot send exception info"
            android.ext.e1.s(r2, r0)
            if (r18 == 0) goto L311
            java.lang.String r0 = android.ext.e1.n(r17)
            l(r6, r5, r0)
        L311:
            r0 = r4
        L312:
            return r0
    }

    public static void i(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GG: "
            r0.append(r1)
            r1 = 1
            float r2 = (float) r1
            r3 = 1122015642(0x42e0999a, float:112.3)
            float r3 = r3 * r2
            r4 = 1093559910(0x412e6666, float:10.9)
            float r3 = r3 - r4
            r0.append(r3)
            java.lang.String r3 = " ["
            r0.append(r3)
            r3 = 1183026893(0x46838ecd, float:16839.4)
            float r2 = r2 * r3
            r3 = 1143675290(0x442b199a, float:684.4)
            float r2 = r2 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            r0.append(r2)
            java.lang.String r2 = "]\nAndroid: "
            r0.append(r2)
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            r0.append(r2)
            java.lang.String r2 = "\nSDK: "
            r0.append(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0.append(r2)
            java.lang.String r2 = "\nvSpace: "
            r0.append(r2)
            java.lang.String r2 = android.ext.f1.x()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = "\nHash: "
            r0.append(r5)
            java.lang.String r5 = android.ext.b1.X()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.ext.z2.d(r5, r1)
            return
    }

    private static void j(java.lang.String r7, java.lang.String r8, java.lang.Runnable r9) {
            java.lang.String[] r0 = e()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0.length
            if (r2 >= r3) goto L26
            r3 = r0[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ": "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L23
            goto L27
        L23:
            int r2 = r2 + 2
            goto L6
        L26:
            r2 = -1
        L27:
            android.ext.n0$a r3 = new android.ext.n0$a
            r3.<init>(r7, r0, r2, r9)
            java.lang.String r9 = "\n\n"
            r4 = 2131296736(0x7f0901e0, float:1.8211397E38)
            if (r2 < 0) goto L97
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r5 = r0[r2]
            r7.append(r5)
            java.lang.String r5 = " is reason of last fail"
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            android.ext.e1.p(r7)
            android.app.AlertDialog$Builder r7 = android.ext.f.b()
            android.view.View r4 = android.ext.Tools.g0(r4)
            android.app.AlertDialog$Builder r7 = r7.setCustomTitle(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 2131296729(0x7f0901d9, float:1.8211383E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r0 = r0[r2]
            r6[r1] = r0
            java.lang.String r0 = android.ext.Tools.L1(r5, r6)
            r4.append(r0)
            r4.append(r9)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            android.app.AlertDialog$Builder r7 = r7.setMessage(r8)
            r8 = 2131296786(0x7f090212, float:1.8211499E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            android.app.AlertDialog$Builder r7 = r7.setNeutralButton(r8, r3)
            r8 = 2131296836(0x7f090244, float:1.82116E38)
        L8b:
            java.lang.String r8 = android.ext.b2.f(r8)
            android.app.AlertDialog$Builder r7 = r7.setNegativeButton(r8, r3)
            android.ext.f.s(r7)
            goto Lcf
        L97:
            android.app.AlertDialog$Builder r8 = android.ext.f.b()
            android.view.View r0 = android.ext.Tools.g0(r4)
            android.app.AlertDialog$Builder r8 = r8.setCustomTitle(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2131297049(0x7f090319, float:1.8212032E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.append(r1)
            r0.append(r9)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.app.AlertDialog$Builder r7 = r8.setMessage(r7)
            r8 = 2131297115(0x7f09035b, float:1.8212166E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            android.app.AlertDialog$Builder r7 = r7.setPositiveButton(r8, r3)
            r8 = 2131296805(0x7f090225, float:1.8211537E38)
            goto L8b
        Lcf:
            return
    }

    private void k(java.lang.String r3) {
            r2 = this;
            android.ext.n0$g r0 = new android.ext.n0$g     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "showToast"
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> Lf
            r0.start()     // Catch: java.lang.Throwable -> Lf
            r0 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Thread.sleep(r0)
        Lf:
            return
    }

    public static void l(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            android.content.Context r4 = android.ext.Tools.f0()
            if (r4 == 0) goto L1e
            android.content.SharedPreferences r4 = android.ext.Tools.M0()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r0 = "last_exception"
            android.content.SharedPreferences$Editor r3 = r4.putString(r0, r3)
            java.lang.String r4 = "last_exception_trace"
            android.content.SharedPreferences$Editor r3 = r3.putString(r4, r5)
            r3.commit()
            goto L59
        L1e:
            java.io.File r4 = new java.io.File
            java.io.File r0 = android.ext.Tools.q0()
            java.lang.String r1 = "store_ex.txt"
            r4.<init>(r0, r1)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.io.IOException -> L53
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.io.IOException -> L53
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L53
            r2.<init>(r4)     // Catch: java.io.IOException -> L53
            r1.<init>(r2)     // Catch: java.io.IOException -> L53
            r0.<init>(r1)     // Catch: java.io.IOException -> L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L53
            r4.<init>()     // Catch: java.io.IOException -> L53
            r4.append(r3)     // Catch: java.io.IOException -> L53
            java.lang.String r3 = "@#%~~%#@"
            r4.append(r3)     // Catch: java.io.IOException -> L53
            r4.append(r5)     // Catch: java.io.IOException -> L53
            java.lang.String r3 = r4.toString()     // Catch: java.io.IOException -> L53
            r0.write(r3)     // Catch: java.io.IOException -> L53
            r0.close()     // Catch: java.io.IOException -> L53
            goto L59
        L53:
            r3 = move-exception
            java.lang.String r4 = "Failed store exception"
            android.ext.e1.l(r4, r3)
        L59:
            return
    }

    public static void m(java.lang.Thread r4, java.lang.Throwable r5) {
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = android.ext.e1.n(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GG: "
            r0.append(r1)
            r1 = 1
            float r1 = (float) r1
            r2 = 1121438925(0x42d7cccd, float:107.9)
            float r2 = r2 * r1
            r3 = 1087373312(0x40d00000, float:6.5)
            float r2 = r2 - r3
            r0.append(r2)
            java.lang.String r2 = " ["
            r0.append(r2)
            r2 = 1182853018(0x4680e79a, float:16499.8)
            float r1 = r1 * r2
            r2 = 1135371878(0x43ac6666, float:344.8)
            float r1 = r1 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r1 = "]\nAndroid: "
            r0.append(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r0.append(r1)
            java.lang.String r1 = "\nSDK: "
            r0.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0.append(r1)
            java.lang.String r1 = "\nvSpace: "
            r0.append(r1)
            java.lang.String r1 = android.ext.f1.x()
            r0.append(r1)
            java.lang.String r1 = "\nThread: "
            r0.append(r1)
            r0.append(r4)
            r1 = 10
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "\nHash: "
            r0.append(r1)
            java.lang.String r1 = android.ext.b1.X()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            l(r0, r4, r5)
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
            r2 = this;
            java.lang.Throwable r0 = android.ext.n0.f1100c
            if (r0 == r4) goto L1a
            android.ext.n0.f1100c = r4
            boolean r0 = r4 instanceof android.ext.n0.h
            if (r0 != 0) goto L2e
            r0 = 1
            java.lang.String r0 = h(r3, r4, r0)
            r2.k(r0)
            boolean r0 = android.ext.n0.f1101d
            if (r0 == 0) goto L2e
            android.ext.r.I()
            goto L2e
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "uncaughtException already called for: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
        L2e:
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.f1102a
            if (r0 == 0) goto L35
            r0.uncaughtException(r3, r4)
        L35:
            return
    }
}
