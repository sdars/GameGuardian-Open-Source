package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class h0 {

    class a extends android.ext.g0 {
        a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r0 = this;
                super.run()
                android.ext.h0.a()
                return
        }
    }

    class b extends android.ext.g0 {
        b(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "GG started: "
                r0.append(r1)
                java.lang.String r1 = android.ext.h0.c()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.h(r0)
                return
        }
    }

    public static void a() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = android.ext.Tools.K0()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "GG_"
            r2.append(r3)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            r2.append(r3)
            java.lang.String r4 = "_API_"
            r2.append(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r2.append(r4)
            java.lang.String r5 = ".log"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            java.lang.String r0 = r0.getAbsolutePath()
            r1 = 0
            r2 = 1
            r5 = 0
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch: java.lang.Exception -> L1ae
            java.io.FileWriter r7 = new java.io.FileWriter     // Catch: java.lang.Exception -> L1ae
            r7.<init>(r0, r5)     // Catch: java.lang.Exception -> L1ae
            r6.<init>(r7)     // Catch: java.lang.Exception -> L1ae
            java.util.GregorianCalendar r7 = new java.util.GregorianCalendar     // Catch: java.lang.Exception -> L1ae
            r7.<init>()     // Catch: java.lang.Exception -> L1ae
            java.util.Date r7 = r7.getTime()     // Catch: java.lang.Exception -> L1ae
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L1ae
            r6.write(r7)     // Catch: java.lang.Exception -> L1ae
            java.lang.String r7 = "\n"
            r6.write(r7)     // Catch: java.lang.Exception -> L1ae
            java.lang.String r7 = "Release: "
            r6.write(r7)     // Catch: java.lang.Exception -> L1ae
            r6.write(r3)     // Catch: java.lang.Exception -> L1ae
            java.lang.String r3 = "\n"
            r6.write(r3)     // Catch: java.lang.Exception -> L1ae
            java.lang.String r3 = "SDK: "
            r6.write(r3)     // Catch: java.lang.Exception -> L1ae
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1ae
            r3.<init>()     // Catch: java.lang.Exception -> L1ae
            java.lang.String r7 = ""
            r3.append(r7)     // Catch: java.lang.Exception -> L1ae
            r3.append(r4)     // Catch: java.lang.Exception -> L1ae
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L1ae
            r6.write(r3)     // Catch: java.lang.Exception -> L1ae
            java.lang.String r3 = "\n"
            r6.write(r3)     // Catch: java.lang.Exception -> L1ae
            java.lang.String r3 = "hfkr#%olvw=%>#ov#0o#2surf2>#iru#l#lq#2surf2->#gr#hfkr#%fdw#'l2pdsv=%>#fdw#'l2pdsv>#grqh>#h{lw>"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)     // Catch: java.lang.Exception -> L8e
            java.lang.Process r3 = android.ext.e2.r(r3, r1, r2)     // Catch: java.lang.Exception -> L8e
            if (r3 != 0) goto L91
            java.lang.String r3 = android.ext.e2.f745a     // Catch: java.lang.Exception -> L8e
            r6.write(r3)     // Catch: java.lang.Exception -> L8e
            goto Lb1
        L8e:
            r3 = move-exception
            goto L19b
        L91:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L8e
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L8e
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Exception -> L8e
            r7.<init>(r3)     // Catch: java.lang.Exception -> L8e
            r4.<init>(r7)     // Catch: java.lang.Exception -> L8e
        L9f:
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Exception -> L8e
            if (r3 == 0) goto Lae
            r6.write(r3)     // Catch: java.lang.Exception -> L8e
            java.lang.String r3 = "\n"
            r6.write(r3)     // Catch: java.lang.Exception -> L8e
            goto L9f
        Lae:
            r4.close()     // Catch: java.lang.Exception -> L8e
        Lb1:
            java.lang.String r3 = ""
            android.ext.e2.f745a = r3     // Catch: java.lang.Exception -> L8e
            java.lang.String r3 = "current pid: "
            r6.write(r3)     // Catch: java.lang.Exception -> L8e
            android.ext.MainService r3 = android.ext.MainService.instance     // Catch: java.lang.Exception -> L8e
            android.ext.z1$d r3 = r3.v0     // Catch: java.lang.Exception -> L8e
            if (r3 == 0) goto Ld4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8e
            r4.<init>()     // Catch: java.lang.Exception -> L8e
            java.lang.String r7 = ""
            r4.append(r7)     // Catch: java.lang.Exception -> L8e
            int r3 = r3.f1437f     // Catch: java.lang.Exception -> L8e
            r4.append(r3)     // Catch: java.lang.Exception -> L8e
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L8e
            goto Ld6
        Ld4:
            java.lang.String r3 = "0"
        Ld6:
            r6.write(r3)     // Catch: java.lang.Exception -> L8e
            java.lang.String r3 = "\n"
            r6.write(r3)     // Catch: java.lang.Exception -> L8e
            java.lang.String r3 = "search results:\n"
            r6.write(r3)     // Catch: java.lang.Exception -> L8e
            android.ext.MainService r3 = android.ext.MainService.instance     // Catch: java.lang.Exception -> L8e
            d.a r3 = r3.s0     // Catch: java.lang.Exception -> L8e
            android.ext.c r4 = new android.ext.c     // Catch: java.lang.Exception -> L8e
            r4.<init>()     // Catch: java.lang.Exception -> L8e
            monitor-enter(r3)     // Catch: java.lang.Exception -> L8e
            int r7 = r3.i()     // Catch: java.lang.Throwable -> L13a
            r8 = 0
        Lf2:
            r9 = 8
            r10 = 32
            if (r8 >= r7) goto L13c
            r3.f(r8, r4)     // Catch: java.lang.Throwable -> L13a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13a
            r11.<init>()     // Catch: java.lang.Throwable -> L13a
            long r12 = r4.f672a     // Catch: java.lang.Throwable -> L13a
            java.lang.String r9 = android.ext.t2.e(r9, r12)     // Catch: java.lang.Throwable -> L13a
            r11.append(r9)     // Catch: java.lang.Throwable -> L13a
            r11.append(r10)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r9 = r4.J()     // Catch: java.lang.Throwable -> L13a
            r11.append(r9)     // Catch: java.lang.Throwable -> L13a
            r11.append(r10)     // Catch: java.lang.Throwable -> L13a
            java.lang.CharSequence r9 = r4.u()     // Catch: java.lang.Throwable -> L13a
            r11.append(r9)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r9 = " ("
            r11.append(r9)     // Catch: java.lang.Throwable -> L13a
            int r9 = r4.f674c     // Catch: java.lang.Throwable -> L13a
            java.lang.String r9 = java.lang.Integer.toBinaryString(r9)     // Catch: java.lang.Throwable -> L13a
            r11.append(r9)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r9 = ")\n"
            r11.append(r9)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L13a
            r6.write(r9)     // Catch: java.lang.Throwable -> L13a
            int r8 = r8 + 1
            goto Lf2
        L13a:
            r4 = move-exception
            goto L199
        L13c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r3 = "saved list:\n"
            r6.write(r3)     // Catch: java.lang.Exception -> L8e
            android.ext.MainService r3 = android.ext.MainService.instance     // Catch: java.lang.Exception -> L8e
            android.ext.SavedListAdapter r3 = r3.t0     // Catch: java.lang.Exception -> L8e
            d.e r3 = r3.f()     // Catch: java.lang.Exception -> L8e
            r4 = 0
        L14b:
            int r7 = r3.l()     // Catch: java.lang.Exception -> L8e
            if (r4 >= r7) goto L1a7
            java.lang.Object r7 = r3.n(r4)     // Catch: java.lang.Exception -> L8e
            android.ext.h2 r7 = (android.ext.h2) r7     // Catch: java.lang.Exception -> L8e
            if (r7 != 0) goto L15a
            goto L196
        L15a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8e
            r8.<init>()     // Catch: java.lang.Exception -> L8e
            long r11 = r7.f672a     // Catch: java.lang.Exception -> L8e
            java.lang.String r11 = android.ext.t2.e(r9, r11)     // Catch: java.lang.Exception -> L8e
            r8.append(r11)     // Catch: java.lang.Exception -> L8e
            r8.append(r10)     // Catch: java.lang.Exception -> L8e
            java.lang.String r11 = r7.J()     // Catch: java.lang.Exception -> L8e
            r8.append(r11)     // Catch: java.lang.Exception -> L8e
            r8.append(r10)     // Catch: java.lang.Exception -> L8e
            java.lang.CharSequence r11 = r7.u()     // Catch: java.lang.Exception -> L8e
            r8.append(r11)     // Catch: java.lang.Exception -> L8e
            java.lang.String r11 = " ("
            r8.append(r11)     // Catch: java.lang.Exception -> L8e
            int r7 = r7.f674c     // Catch: java.lang.Exception -> L8e
            java.lang.String r7 = java.lang.Integer.toBinaryString(r7)     // Catch: java.lang.Exception -> L8e
            r8.append(r7)     // Catch: java.lang.Exception -> L8e
            java.lang.String r7 = ")\n"
            r8.append(r7)     // Catch: java.lang.Exception -> L8e
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Exception -> L8e
            r6.write(r7)     // Catch: java.lang.Exception -> L8e
        L196:
            int r4 = r4 + 1
            goto L14b
        L199:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13a
            throw r4     // Catch: java.lang.Exception -> L8e
        L19b:
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Exception -> L1ae
            r6.write(r3)     // Catch: java.lang.Exception -> L1ae
            java.lang.String r3 = "\n"
            r6.write(r3)     // Catch: java.lang.Exception -> L1ae
        L1a7:
            r6.close()     // Catch: java.lang.Exception -> L1ae
            r3 = 2131296758(0x7f0901f6, float:1.8211442E38)
            goto L1c6
        L1ae:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Error opening file to save: "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            android.ext.e1.l(r4, r3)
            r3 = 2131296442(0x7f0900ba, float:1.82108E38)
        L1c6:
            android.app.AlertDialog$Builder r4 = android.ext.f.b()
            r6 = 2131296890(0x7f09027a, float:1.821171E38)
            android.view.View r6 = android.ext.Tools.g0(r6)
            android.app.AlertDialog$Builder r4 = r4.setCustomTitle(r6)
            java.lang.String r3 = android.ext.b2.f(r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r0
            java.lang.String r0 = android.ext.Tools.L1(r3, r2)
            android.app.AlertDialog$Builder r0 = r4.setMessage(r0)
            r2 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
            android.ext.f.o(r0)
            return
    }

    public static java.lang.String b() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " Android("
            r0.append(r1)
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class<android.os.Build$VERSION> r3 = android.os.Build.VERSION.class
            r4 = 0
            r2[r4] = r3
            r3 = 1
            java.lang.Class<android.os.Build> r5 = android.os.Build.class
            r2[r3] = r5
            r3 = 0
        L18:
            if (r3 >= r1) goto L76
            r5 = r2[r3]
            java.lang.reflect.Field[] r5 = r5.getFields()
            int r6 = r5.length
            r7 = 0
        L22:
            if (r7 >= r6) goto L73
            r8 = r5[r7]
            int r9 = r8.getModifiers()     // Catch: java.lang.Throwable -> L68
            boolean r10 = java.lang.reflect.Modifier.isPublic(r9)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto L70
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L70
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> L68
            r0.append(r9)     // Catch: java.lang.Throwable -> L68
            java.lang.String r9 = ": "
            r0.append(r9)     // Catch: java.lang.Throwable -> L68
            r9 = 0
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Throwable -> L55
            boolean r9 = r8 instanceof java.lang.Object[]     // Catch: java.lang.Throwable -> L55
            if (r9 == 0) goto L57
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch: java.lang.Throwable -> L55
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch: java.lang.Throwable -> L55
            r0.append(r8)     // Catch: java.lang.Throwable -> L55
            goto L62
        L55:
            r8 = move-exception
            goto L5b
        L57:
            r0.append(r8)     // Catch: java.lang.Throwable -> L55
            goto L62
        L5b:
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L68
            r0.append(r8)     // Catch: java.lang.Throwable -> L68
        L62:
            java.lang.String r8 = "; "
            r0.append(r8)     // Catch: java.lang.Throwable -> L68
            goto L70
        L68:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
        L70:
            int r7 = r7 + 1
            goto L22
        L73:
            int r3 = r3 + 1
            goto L18
        L76:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String c() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 1
            float r1 = (float) r1
            r2 = 1120862208(0x42cf0000, float:103.5)
            float r2 = r2 * r1
            r3 = 1074161254(0x40066666, float:2.1)
            float r2 = r2 - r3
            r0.append(r2)
            java.lang.String r2 = " ("
            r0.append(r2)
            r2 = 1182782157(0x467fd2cd, float:16372.7)
            float r1 = r1 * r2
            r2 = 1129952051(0x4359b333, float:217.7)
            float r1 = r1 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r1 = ") "
            r0.append(r1)
            java.lang.String r1 = android.ext.b1.X()
            r0.append(r1)
            java.lang.String r1 = " on "
            r0.append(r1)
            java.lang.String r1 = b()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static int d() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            r1 = 1
            float r1 = (float) r1
            r2 = 1122081178(0x42e1999a, float:112.8)
            float r1 = r1 * r2
            r2 = 1094084198(0x41366666, float:11.4)
            float r1 = r1 - r2
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r0 = e(r0)
            return r0
    }

    public static int e(java.lang.String r6) {
            java.lang.String r0 = "[^\\d.]"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.replaceAll(r0, r1)
            java.lang.String r1 = "\\."
            r2 = -1
            java.lang.String[] r0 = r0.split(r1, r2)
            r1 = 0
            r2 = 0
        L11:
            int r3 = r0.length
            if (r1 >= r3) goto L46
            int r3 = r2 * 100
            r4 = r0[r1]     // Catch: java.lang.NumberFormatException -> L1f
            int r2 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L1f
            int r3 = r3 + r2
            r2 = r3
            goto L43
        L1f:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bad part of version: "
            r4.append(r5)
            r5 = r0[r1]
            r4.append(r5)
            r5 = 40
            r4.append(r5)
            r4.append(r6)
            r5 = 41
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.ext.e1.s(r4, r3)
        L43:
            int r1 = r1 + 1
            goto L11
        L46:
            return r2
    }

    public static java.lang.String f(boolean r1) {
            r0 = 0
            java.lang.String r1 = g(r1, r0)
            return r1
    }

    private static java.lang.String g(boolean r11, int r12) {
            java.lang.String r0 = "OutOfMemoryError\n"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 10
            java.lang.String r3 = "h{hf#orjfdw#0g#"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r11 == 0) goto L26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            r4.<init>()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            r4.append(r3)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            java.lang.String r3 = "-v threadtime "
            r4.append(r3)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
        L1e:
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            goto L34
        L23:
            r11 = move-exception
            goto L143
        L26:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            r4.<init>()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            r4.append(r3)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            java.lang.String r3 = "-v brief "
            r4.append(r3)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            goto L1e
        L34:
            r4 = 0
            r5 = 1
            java.lang.Process r3 = android.ext.e2.r(r3, r4, r5)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r3 != 0) goto L43
            java.lang.String r12 = android.ext.e2.f745a     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            r1.append(r12)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            goto L16c
        L43:
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r12 <= 0) goto L55
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
        L55:
            r3 = 0
        L56:
            r7 = 0
        L57:
            boolean r8 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r8 != 0) goto L126
            java.lang.String r8 = r6.readLine()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r8 == 0) goto L126
            java.lang.String r9 = "AndroidService"
            boolean r9 = r8.contains(r9)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r9 != 0) goto L74
            java.lang.String r10 = "android-daemon"
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto L74
            r9 = 1
        L74:
            if (r9 != 0) goto L7f
            java.lang.String r10 = "AndroidRuntime"
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto L7f
            r9 = 1
        L7f:
            if (r9 != 0) goto L8a
            java.lang.String r10 = "libc"
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto L8a
            r9 = 1
        L8a:
            if (r9 != 0) goto L95
            java.lang.String r10 = "Vold"
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto L95
            r9 = 1
        L95:
            if (r9 != 0) goto La0
            java.lang.String r10 = "DEBUG"
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto La0
            r9 = 1
        La0:
            if (r9 != 0) goto Lab
            java.lang.String r10 = "CRASH"
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto Lab
            r9 = 1
        Lab:
            if (r9 != 0) goto Lb6
            java.lang.String r10 = "*** *** *** *** *** *** ***"
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto Lb6
            r9 = 1
        Lb6:
            if (r9 != 0) goto Lc3
            java.lang.String r10 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto Lc3
            r9 = 1
        Lc3:
            if (r9 != 0) goto Lce
            java.lang.String r10 = "--- beginning of "
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto Lce
            r9 = 1
        Lce:
            int r10 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r9 != 0) goto Le1
            if (r10 <= 0) goto Le1
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto Le1
            r9 = 1
        Le1:
            android.ext.MainService r10 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            android.ext.f0 r10 = r10.i     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            int r10 = r10.J()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r9 != 0) goto Lf8
            if (r10 <= 0) goto Lf8
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto Lf8
            r9 = 1
        Lf8:
            android.ext.MainService r10 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            android.ext.f0 r10 = r10.i     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            int r10 = r10.b0()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r9 != 0) goto L10f
            if (r10 <= 0) goto L10f
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            boolean r10 = r8.contains(r10)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r10 == 0) goto L10f
            goto L111
        L10f:
            if (r9 == 0) goto L57
        L111:
            if (r4 == 0) goto L11e
            int r9 = r7 + 1
            r4[r7] = r8     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r9 < r12) goto L11b
            goto L56
        L11b:
            r7 = r9
            goto L57
        L11e:
            r1.append(r8)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            r1.append(r2)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            goto L57
        L126:
            if (r4 == 0) goto L16c
            r5 = r7
        L129:
            boolean r6 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r6 != 0) goto L16c
            int r6 = r5 + 1
            r5 = r4[r5]     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            if (r5 == 0) goto L13b
            r1.append(r5)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
            r1.append(r2)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L153
        L13b:
            if (r6 < r12) goto L13f
            r5 = 0
            goto L140
        L13f:
            r5 = r6
        L140:
            if (r5 != r7) goto L129
            goto L16c
        L143:
            java.lang.String r12 = r11.getMessage()
            r1.append(r12)
            r1.append(r2)
            java.lang.String r12 = "getLogcat fail."
            android.ext.e1.g(r12, r11)
            goto L16c
        L153:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.OutOfMemoryError -> L163
            r12.<init>()     // Catch: java.lang.OutOfMemoryError -> L163
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r11 = g(r11, r1)     // Catch: java.lang.OutOfMemoryError -> L163
            r12.append(r11)     // Catch: java.lang.OutOfMemoryError -> L163
            r1 = r12
            goto L16c
        L163:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r1 = r11
        L16c:
            java.lang.String r11 = ""
            android.ext.e2.f745a = r11
            java.lang.String r11 = r1.toString()     // Catch: java.lang.OutOfMemoryError -> L175
            return r11
        L175:
            return r0
    }

    public static void h() {
            r0 = 2131296330(0x7f09004a, float:1.8210574E38)
            android.ext.Tools.H1(r0)
            android.ext.h0$a r0 = new android.ext.h0$a
            java.lang.String r1 = "runCollectRegionLog"
            r0.<init>(r1)
            r0.start()
            return
    }

    public static void i() {
            android.ext.h0$b r0 = new android.ext.h0$b
            java.lang.String r1 = "showInfo"
            r0.<init>(r1)
            r0.start()
            return
    }
}
