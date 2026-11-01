package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile java.lang.Boolean f951a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f952b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile int f953c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile boolean f954d = false;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: android.ext.f1$a$a, reason: collision with other inner class name */
        class RunnableC0018a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.f1.a f955a;

            RunnableC0018a(android.ext.f1.a r1) {
                    r0 = this;
                    r0.f955a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r6 = this;
                    r0 = 0
                    r1 = 1
                    r2 = 0
                    boolean r3 = android.ext.Config.vSpaceReal     // Catch: java.lang.Throwable -> L52
                    if (r3 != 0) goto L57
                    int r3 = android.ext.Config.z     // Catch: java.lang.Throwable -> L52
                    if (r3 != 0) goto L57
                    android.content.ComponentName r3 = android.ext.f1.u()     // Catch: java.lang.Throwable -> L52
                    if (r3 == 0) goto L5a
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
                    r4.<init>()     // Catch: java.lang.Throwable -> L52
                    java.lang.String r5 = "Try instr: "
                    r4.append(r5)     // Catch: java.lang.Throwable -> L52
                    int r5 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L52
                    r4.append(r5)     // Catch: java.lang.Throwable -> L52
                    java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L52
                    android.ext.e1.d(r4)     // Catch: java.lang.Throwable -> L52
                    android.ext.f1.f(r2)     // Catch: java.lang.Throwable -> L52
                    android.content.Context r4 = android.ext.r.p     // Catch: java.lang.Throwable -> L54
                    android.os.Bundle r5 = android.ext.r.u()     // Catch: java.lang.Throwable -> L54
                    boolean r3 = r4.startInstrumentation(r3, r0, r5)     // Catch: java.lang.Throwable -> L54
                    android.ext.f1.f(r1)     // Catch: java.lang.Throwable -> L54
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
                    r4.<init>()     // Catch: java.lang.Throwable -> L52
                    java.lang.String r5 = "Fail instr: "
                    r4.append(r5)     // Catch: java.lang.Throwable -> L52
                    int r5 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L52
                    r4.append(r5)     // Catch: java.lang.Throwable -> L52
                    java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L52
                    android.ext.e1.d(r4)     // Catch: java.lang.Throwable -> L52
                    goto L5b
                L52:
                    r3 = move-exception
                    goto L7b
                L54:
                    r3 = move-exception
                    r2 = 1
                    goto L7b
                L57:
                    android.ext.f1.i()     // Catch: java.lang.Throwable -> L52
                L5a:
                    r3 = 0
                L5b:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
                    r4.<init>()     // Catch: java.lang.Throwable -> L52
                    java.lang.String r5 = ""
                    r4.append(r5)     // Catch: java.lang.Throwable -> L52
                    r4.append(r3)     // Catch: java.lang.Throwable -> L52
                    r3 = 32
                    r4.append(r3)     // Catch: java.lang.Throwable -> L52
                    int r3 = android.ext.Config.z     // Catch: java.lang.Throwable -> L52
                    r4.append(r3)     // Catch: java.lang.Throwable -> L52
                    java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L52
                    r4 = 3
                    android.ext.f1.B(r4, r3)     // Catch: java.lang.Throwable -> L52
                    goto L85
                L7b:
                    java.lang.String r4 = "Failed load Instrumentation"
                    android.ext.e1.l(r4, r3)
                    if (r2 == 0) goto L85
                    android.ext.f1.f(r1)
                L85:
                    r1 = 6
                    android.ext.f1.B(r1, r0)
                    android.ext.f1.I()
                    return
            }
        }

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                r0 = 1
                r1 = 0
                android.ext.f1.B(r0, r1)
                android.ext.b1$c0 r2 = android.ext.b1.j0()
                boolean r2 = r2.f610a
                android.ext.r r3 = android.ext.r.n
                r4 = 0
                if (r2 == 0) goto L1a
                boolean r5 = android.ext.Config.vSpaceReal
                if (r5 == 0) goto L18
                boolean r5 = android.ext.Config.D
                if (r5 == 0) goto L1a
            L18:
                r5 = 1
                goto L1b
            L1a:
                r5 = 0
            L1b:
                r3.f1206d = r5
                if (r2 == 0) goto L43
                boolean r0 = android.ext.ConfigListAdapter.k()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Install64: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                android.ext.e1.d(r1)
                if (r0 == 0) goto L3e
                android.ext.f1.M()
                goto Lba
            L3e:
                android.ext.f1.L()
                goto Lba
            L43:
                android.ext.r.q = r4
                boolean r2 = android.ext.f1.f954d
                if (r2 == 0) goto L52
                r0 = 8
                android.ext.f1.B(r0, r1)
            L4e:
                android.ext.f1.D()
                goto Lba
            L52:
                boolean r2 = android.ext.u.c()
                r3 = 2
                if (r2 == 0) goto L5a
                goto L5b
            L5a:
                r0 = 2
            L5b:
                android.ext.f1.f(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                if (r2 != 0) goto L9b
                r0.<init>()
                java.lang.String r2 = "Not instr: "
                r0.append(r2)
                int r2 = android.os.Process.myUid()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = ""
                r0.append(r2)
                int r2 = android.ext.Config.z
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.ext.f1.B(r3, r0)
                android.ext.f1$a$a r0 = new android.ext.f1$a$a
                r0.<init>(r6)
                android.ext.n2.i(r0)
                r0 = 4
                android.ext.f1.B(r0, r1)
                goto Lba
            L9b:
                r0.<init>()
                java.lang.String r2 = "Use instr: "
                r0.append(r2)
                int r2 = android.os.Process.myUid()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                r0 = 9
                android.ext.f1.B(r0, r1)
                android.ext.f1.O()
                goto L4e
            Lba:
                return
        }
    }

    class b implements java.lang.Runnable {

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.StringBuilder f956a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ java.lang.String f957b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.ext.f1.b f958c;

            a(android.ext.f1.b r1, java.lang.StringBuilder r2, java.lang.String r3) {
                    r0 = this;
                    r0.f958c = r1
                    r0.f956a = r2
                    r0.f957b = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r7 = this;
                    r0 = 2131099658(0x7f06000a, float:1.7811675E38)
                    r1 = 0
                    android.view.View r0 = a.d.f(r0, r1)
                    r2 = 2131034148(0x7f050024, float:1.7678805E38)
                    android.view.View r2 = r0.findViewById(r2)
                    android.widget.TextView r2 = (android.widget.TextView) r2
                    java.lang.StringBuilder r3 = r7.f956a
                    java.lang.String r3 = r3.toString()
                    android.ext.Tools.v1(r2, r3)
                    android.app.AlertDialog$Builder r2 = android.ext.f.b()
                    r3 = 2131296478(0x7f0900de, float:1.8210874E38)
                    java.lang.String r3 = android.ext.b2.f(r3)
                    r4 = 1
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    java.lang.String r5 = r7.f957b
                    r6 = 0
                    r4[r6] = r5
                    java.lang.String r3 = android.ext.Tools.L1(r3, r4)
                    android.view.View r3 = android.ext.Tools.h0(r3)
                    android.app.AlertDialog$Builder r2 = r2.setCustomTitle(r3)
                    android.app.AlertDialog$Builder r0 = r2.setView(r0)
                    android.app.AlertDialog$Builder r0 = r0.setCancelable(r6)
                    r2 = 2131296388(0x7f090084, float:1.8210691E38)
                    java.lang.String r2 = android.ext.b2.f(r2)
                    android.ext.r$n r3 = new android.ext.r$n
                    r3.<init>(r1)
                    android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r3)
                    r2 = 2131296836(0x7f090244, float:1.82116E38)
                    java.lang.String r2 = android.ext.b2.f(r2)
                    android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
                    android.ext.f.o(r0)
                    return
            }
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r12 = this;
                java.lang.String r0 = ""
                java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L116
                android.ext.f1.f951a = r1     // Catch: java.lang.Throwable -> L116
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L116
                r1.<init>()     // Catch: java.lang.Throwable -> L116
                r1.append(r0)     // Catch: java.lang.Throwable -> L116
                r2 = 1121976320(0x42e00000, float:112.0)
                r3 = 1
                float r4 = (float) r3     // Catch: java.lang.Throwable -> L116
                float r4 = r4 * r2
                r2 = 1093245338(0x4129999a, float:10.6)
                float r4 = r4 - r2
                r1.append(r4)     // Catch: java.lang.Throwable -> L116
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L116
                r2 = 4
                r4 = 0
                r5 = 0
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
                r6.<init>()     // Catch: java.lang.Throwable -> L5d
                android.content.SharedPreferences r7 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L5d
                r8 = 0
            L2c:
                java.lang.String r9 = "used-"
                if (r8 >= r2) goto L6d
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
                r10.<init>()     // Catch: java.lang.Throwable -> L5d
                r10.append(r9)     // Catch: java.lang.Throwable -> L5d
                r10.append(r8)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L5d
                boolean r10 = r7.contains(r9)     // Catch: java.lang.Throwable -> L5d
                if (r10 != 0) goto L46
                goto L6a
            L46:
                java.lang.String r9 = r7.getString(r9, r0)     // Catch: java.lang.Throwable -> L5d
                int r10 = r9.length()     // Catch: java.lang.Throwable -> L5d
                if (r10 != 0) goto L51
                goto L6a
            L51:
                int r10 = r6.length()     // Catch: java.lang.Throwable -> L5d
                if (r10 == 0) goto L5f
                r10 = 38
                r6.append(r10)     // Catch: java.lang.Throwable -> L5d
                goto L5f
            L5d:
                r6 = move-exception
                goto L95
            L5f:
                r6.append(r8)     // Catch: java.lang.Throwable -> L5d
                r10 = 61
                r6.append(r10)     // Catch: java.lang.Throwable -> L5d
                r6.append(r9)     // Catch: java.lang.Throwable -> L5d
            L6a:
                int r8 = r8 + 1
                goto L2c
            L6d:
                android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Throwable -> L5d
                r8 = 0
            L72:
                if (r8 >= r2) goto L89
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
                r10.<init>()     // Catch: java.lang.Throwable -> L5d
                r10.append(r9)     // Catch: java.lang.Throwable -> L5d
                r10.append(r8)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L5d
                r7.remove(r10)     // Catch: java.lang.Throwable -> L5d
                int r8 = r8 + 1
                goto L72
            L89:
                r7.commit()     // Catch: java.lang.Throwable -> L5d
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5d
                byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L5d
                goto L99
            L95:
                android.ext.e1.a(r6)     // Catch: java.lang.Throwable -> L116
                r6 = r5
            L99:
                java.net.URL r7 = new java.net.URL     // Catch: java.lang.Throwable -> L116
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L116
                r8.<init>()     // Catch: java.lang.Throwable -> L116
                java.lang.String r9 = "kwws=22jdphjxdugldq1qhw2JJborjv2yhuvlrq1sksBv@(g)y@(v)o@(v)w@(v)d@(g)r@(v)x@(v"
                java.lang.String r9 = android.ext.Tools.removeNewLinesChars(r9)     // Catch: java.lang.Throwable -> L116
                r10 = 7
                java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L116
                int r11 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L116
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L116
                r10[r4] = r11     // Catch: java.lang.Throwable -> L116
                r10[r3] = r1     // Catch: java.lang.Throwable -> L116
                java.lang.String r4 = android.ext.k.b()     // Catch: java.lang.Throwable -> L116
                r11 = 2
                r10[r11] = r4     // Catch: java.lang.Throwable -> L116
                r4 = 2131296732(0x7f0901dc, float:1.8211389E38)
                java.lang.String r4 = android.ext.b2.f(r4)     // Catch: java.lang.Throwable -> L116
                r11 = 3
                r10[r11] = r4     // Catch: java.lang.Throwable -> L116
                int r4 = android.ext.e0.f()     // Catch: java.lang.Throwable -> L116
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L116
                r10[r2] = r4     // Catch: java.lang.Throwable -> L116
                java.lang.String r2 = android.ext.f1.v()     // Catch: java.lang.Throwable -> L116
                r4 = 5
                r10[r4] = r2     // Catch: java.lang.Throwable -> L116
                java.lang.String r2 = android.ext.f1.x()     // Catch: java.lang.Throwable -> L116
                r4 = 6
                r10[r4] = r2     // Catch: java.lang.Throwable -> L116
                java.lang.String r2 = android.ext.Tools.L1(r9, r10)     // Catch: java.lang.Throwable -> L116
                r8.append(r2)     // Catch: java.lang.Throwable -> L116
                java.lang.String r2 = android.ext.p1.d()     // Catch: java.lang.Throwable -> L116
                r8.append(r2)     // Catch: java.lang.Throwable -> L116
                java.lang.String r2 = android.ext.ConfigListAdapter.i()     // Catch: java.lang.Throwable -> L116
                r8.append(r2)     // Catch: java.lang.Throwable -> L116
                java.lang.String r2 = r8.toString()     // Catch: java.lang.Throwable -> L116
                r7.<init>(r2)     // Catch: java.lang.Throwable -> L116
                java.net.URLConnection r2 = r7.openConnection()     // Catch: java.lang.Throwable -> L116
                if (r6 == 0) goto L119
                r2.setDoOutput(r3)     // Catch: java.lang.Throwable -> L111
                java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L111
                java.io.OutputStream r4 = r2.getOutputStream()     // Catch: java.lang.Throwable -> L111
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L111
                r3.write(r6)     // Catch: java.lang.Throwable -> L111
                r3.close()     // Catch: java.lang.Throwable -> L111
                goto L119
            L111:
                r3 = move-exception
                android.ext.e1.a(r3)     // Catch: java.lang.Throwable -> L116
                goto L119
            L116:
                r0 = move-exception
                goto L1d9
            L119:
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L116
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L116
                java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L116
                r4.<init>(r2)     // Catch: java.lang.Throwable -> L116
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L116
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L116
                r2.<init>()     // Catch: java.lang.Throwable -> L116
                int r1 = android.ext.h0.e(r1)     // Catch: java.lang.Throwable -> L116
                float r4 = android.ext.i.f999a     // Catch: java.lang.Throwable -> L116
                java.lang.String r4 = java.lang.Float.toString(r4)     // Catch: java.lang.Throwable -> L116
                int r4 = android.ext.h0.e(r4)     // Catch: java.lang.Throwable -> L116
                r7 = r0
                r6 = r5
            L13c:
                java.lang.String r8 = r3.readLine()     // Catch: java.lang.Throwable -> L116
                if (r8 == 0) goto L190
                if (r5 != 0) goto L145
                r5 = r8
            L145:
                boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> L116
                if (r7 == 0) goto L153
                int r6 = android.ext.h0.e(r8)     // Catch: java.lang.Throwable -> L116
                if (r6 > r1) goto L152
                goto L190
            L152:
                r6 = r8
            L153:
                r2.append(r8)     // Catch: java.lang.Throwable -> L116
                r7 = 10
                r2.append(r7)     // Catch: java.lang.Throwable -> L116
                java.lang.String r7 = "ARMv5"
                boolean r7 = r8.contains(r7)     // Catch: java.lang.Throwable -> L116
                if (r7 == 0) goto L173
                int r7 = android.ext.h0.e(r6)     // Catch: java.lang.Throwable -> L116
                if (r7 <= r4) goto L173
                float r7 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Throwable -> L116 java.lang.NumberFormatException -> L175
                android.ext.i.f999a = r7     // Catch: java.lang.Throwable -> L116 java.lang.NumberFormatException -> L175
                int r4 = android.ext.h0.e(r6)     // Catch: java.lang.Throwable -> L116 java.lang.NumberFormatException -> L175
            L173:
                r7 = r8
                goto L13c
            L175:
                r7 = move-exception
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L116
                r9.<init>()     // Catch: java.lang.Throwable -> L116
                java.lang.String r10 = "Failed parse as float '"
                r9.append(r10)     // Catch: java.lang.Throwable -> L116
                r9.append(r6)     // Catch: java.lang.Throwable -> L116
                java.lang.String r10 = "'"
                r9.append(r10)     // Catch: java.lang.Throwable -> L116
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L116
                android.ext.e1.s(r9, r7)     // Catch: java.lang.Throwable -> L116
                goto L173
            L190:
                r3.close()     // Catch: java.lang.Throwable -> L116
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L116
                r0.<init>()     // Catch: java.lang.Throwable -> L116
                java.lang.String r3 = "Server version: "
                r0.append(r3)     // Catch: java.lang.Throwable -> L116
                if (r5 == 0) goto L1b8
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L116
                r3.<init>()     // Catch: java.lang.Throwable -> L116
                r3.append(r5)     // Catch: java.lang.Throwable -> L116
                r4 = 32
                r3.append(r4)     // Catch: java.lang.Throwable -> L116
                int r4 = android.ext.h0.e(r5)     // Catch: java.lang.Throwable -> L116
                r3.append(r4)     // Catch: java.lang.Throwable -> L116
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L116
                goto L1ba
            L1b8:
                java.lang.String r3 = "null"
            L1ba:
                r0.append(r3)     // Catch: java.lang.Throwable -> L116
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L116
                android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L116
                if (r5 == 0) goto L1de
                int r0 = android.ext.h0.e(r5)     // Catch: java.lang.Throwable -> L116
                if (r0 <= r1) goto L1de
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L116
                android.ext.f1.f951a = r0     // Catch: java.lang.Throwable -> L116
                android.ext.f1$b$a r0 = new android.ext.f1$b$a     // Catch: java.lang.Throwable -> L116
                r0.<init>(r12, r2, r5)     // Catch: java.lang.Throwable -> L116
                android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L116
                goto L1de
            L1d9:
                java.lang.String r1 = "checkNewVersion"
                android.ext.e1.l(r1, r0)
            L1de:
                return
        }
    }

    class c implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.io.File f959a;

        c(java.io.File r1) {
                r0 = this;
                r0.f959a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                java.io.File r1 = r0.f959a
                r1.delete()
                if (r2 == 0) goto L8
                goto L18
            L8:
                r1 = 2131034402(0x7f050122, float:1.767932E38)
                android.ext.Config$p r1 = android.ext.Config.b(r1)
                r2 = 1
                r1.f42d = r2
                android.ext.Config.k()
                android.ext.r.I()
            L18:
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
                r1 = 2131296614(0x7f090166, float:1.821115E38)
                android.ext.ConfigListAdapter.t(r1)
                return
        }
    }

    class e implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f961b;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.f1.e f962a;

            a(android.ext.f1.e r1) {
                    r0 = this;
                    r0.f962a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    if (r2 == 0) goto L11
                    r1 = 1
                    if (r2 == r1) goto L6
                    goto L15
                L6:
                    r1 = 2131034188(0x7f05004c, float:1.7678886E38)
                L9:
                    android.ext.Config$p r1 = android.ext.Config.b(r1)
                    r1.b()
                    goto L15
                L11:
                    r1 = 2131034186(0x7f05004a, float:1.7678882E38)
                    goto L9
                L15:
                    return
            }
        }

        class b implements android.content.DialogInterface.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.f1.e f963a;

            b(android.ext.f1.e r1) {
                    r0 = this;
                    r0.f963a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface r1) {
                    r0 = this;
                    android.ext.f1$e r1 = r0.f963a
                    java.lang.Runnable r1 = r1.f961b
                    r1.run()
                    return
            }
        }

        e(boolean[] r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f960a = r1
                r0.f961b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                boolean[] r2 = r1.f960a
                r3 = 0
                r0 = 1
                r2[r3] = r0
                android.app.AlertDialog$Builder r2 = android.ext.f.b()
                r3 = 2131296455(0x7f0900c7, float:1.8210827E38)
                android.view.View r3 = android.ext.Tools.g0(r3)
                android.app.AlertDialog$Builder r2 = r2.setCustomTitle(r3)
                r3 = 2131034186(0x7f05004a, float:1.7678882E38)
                android.ext.Config$p r3 = android.ext.Config.b(r3)
                java.lang.String r3 = r3.toString()
                r0 = 2131034188(0x7f05004c, float:1.7678886E38)
                android.ext.Config$p r0 = android.ext.Config.b(r0)
                java.lang.String r0 = r0.toString()
                java.lang.String[] r3 = new java.lang.String[]{r3, r0}
                android.ext.f1$e$a r0 = new android.ext.f1$e$a
                r0.<init>(r1)
                android.app.AlertDialog$Builder r2 = r2.setItems(r3, r0)
                r3 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r0 = 0
                android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r3, r0)
                android.app.AlertDialog r2 = r2.create()
                java.lang.Runnable r3 = r1.f961b
                if (r3 == 0) goto L54
                android.ext.f1$e$b r3 = new android.ext.f1$e$b
                r3.<init>(r1)
                android.ext.f.k(r2, r3)
            L54:
                android.ext.f.m(r2)
                return
        }
    }

    class f implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f965b;

        f(boolean[] r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f964a = r1
                r0.f965b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r2) {
                r1 = this;
                boolean[] r2 = r1.f964a
                r0 = 0
                boolean r2 = r2[r0]
                if (r2 != 0) goto Lc
                java.lang.Runnable r2 = r1.f965b
                r2.run()
            Lc:
                return
        }
    }

    class g implements java.lang.Runnable {

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.content.SharedPreferences f966a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ java.lang.String f967b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.ext.f1.g f968c;

            a(android.ext.f1.g r1, android.content.SharedPreferences r2, java.lang.String r3) {
                    r0 = this;
                    r0.f968c = r1
                    r0.f966a = r2
                    r0.f967b = r3
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r3, int r4) {
                    r2 = this;
                    r0 = -1
                    if (r4 != r0) goto Ld
                    android.ext.r$n r0 = new android.ext.r$n
                    java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:8770li0|rx0zdqw0wr0dgg0d0qhz0wudqvodwlrq0ru0lpsuryh0dq0h{lvwlqj2"
                    r0.<init>(r1)
                    r0.onClick(r3, r4)
                Ld:
                    android.content.SharedPreferences r3 = r2.f966a
                    android.content.SharedPreferences$Editor r3 = r3.edit()
                    java.lang.String r4 = "improve-translate"
                    java.lang.String r0 = r2.f967b
                    android.content.SharedPreferences$Editor r3 = r3.putString(r4, r0)
                    r3.commit()
                    return
            }
        }

        class b implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.content.DialogInterface.OnClickListener f969a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.f1.g f970b;

            b(android.ext.f1.g r1, android.content.DialogInterface.OnClickListener r2) {
                    r0 = this;
                    r0.f970b = r1
                    r0.f969a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    android.app.AlertDialog$Builder r0 = android.ext.f.b()
                    r1 = 2131296693(0x7f0901b5, float:1.821131E38)
                    java.lang.String r1 = android.ext.b2.f(r1)
                    android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
                    r1 = 2131296962(0x7f0902c2, float:1.8211855E38)
                    java.lang.String r1 = android.ext.b2.f(r1)
                    android.content.DialogInterface$OnClickListener r2 = r3.f969a
                    android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
                    r1 = 2131296963(0x7f0902c3, float:1.8211858E38)
                    java.lang.String r1 = android.ext.b2.f(r1)
                    android.content.DialogInterface$OnClickListener r2 = r3.f969a
                    android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
                    android.ext.f.o(r0)
                    return
            }
        }

        g() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.content.SharedPreferences r0 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L58
                java.lang.String r1 = "improve-translate"
                java.lang.String r2 = ""
                java.lang.String r1 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L58
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
                r2.<init>()     // Catch: java.lang.Throwable -> L58
                r3 = 2131297084(0x7f09033c, float:1.8212103E38)
                java.lang.String r3 = android.ext.b2.f(r3)     // Catch: java.lang.Throwable -> L58
                r2.append(r3)     // Catch: java.lang.Throwable -> L58
                r3 = 58
                r2.append(r3)     // Catch: java.lang.Throwable -> L58
                r3 = 2131296732(0x7f0901dc, float:1.8211389E38)
                java.lang.String r3 = android.ext.b2.f(r3)     // Catch: java.lang.Throwable -> L58
                r2.append(r3)     // Catch: java.lang.Throwable -> L58
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L58
                boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L58
                if (r1 == 0) goto L35
                return
            L35:
                r1 = 2131296694(0x7f0901b6, float:1.8211312E38)
                java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L58
                r3 = 2131296502(0x7f0900f6, float:1.8210922E38)
                java.lang.String r3 = android.ext.b2.f(r3)     // Catch: java.lang.Throwable -> L58
                boolean r1 = r3.contains(r1)     // Catch: java.lang.Throwable -> L58
                if (r1 != 0) goto L4a
                return
            L4a:
                android.ext.f1$g$a r1 = new android.ext.f1$g$a     // Catch: java.lang.Throwable -> L58
                r1.<init>(r4, r0, r2)     // Catch: java.lang.Throwable -> L58
                android.ext.f1$g$b r0 = new android.ext.f1$g$b     // Catch: java.lang.Throwable -> L58
                r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L58
                android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L58
                goto L5e
            L58:
                r0 = move-exception
                java.lang.String r1 = "checkAutoTranslation"
                android.ext.e1.l(r1, r0)
            L5e:
                return
        }
    }

    class h implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f971a;

        h(long r1) {
                r0 = this;
                r0.f971a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                long r3 = android.ext.Config.f30c
                long r0 = r2.f971a
                long r3 = r3 | r0
                android.ext.Config.f30c = r3
                android.ext.Config.k()
                return
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f974c;

        i(android.content.Context r1, java.lang.String r2, long r3) {
                r0 = this;
                r0.f972a = r1
                r0.f973b = r2
                r0.f974c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.content.Context r0 = r4.f972a     // Catch: java.lang.Throwable -> L9
                if (r0 != 0) goto Lb
                android.content.Context r0 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L9
                goto Lb
            L9:
                r0 = move-exception
                goto L3d
            Lb:
                android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)     // Catch: java.lang.Throwable -> L9
                java.lang.String r1 = r4.f973b     // Catch: java.lang.Throwable -> L9
                android.app.AlertDialog$Builder r0 = r0.setMessage(r1)     // Catch: java.lang.Throwable -> L9
                r1 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L9
                r2 = 0
                android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)     // Catch: java.lang.Throwable -> L9
                r1 = 2131296963(0x7f0902c3, float:1.8211858E38)
                java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L9
                long r2 = r4.f974c     // Catch: java.lang.Throwable -> L9
                android.content.DialogInterface$OnClickListener r2 = android.ext.f1.w(r2)     // Catch: java.lang.Throwable -> L9
                android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r1, r2)     // Catch: java.lang.Throwable -> L9
                android.app.AlertDialog r0 = r0.create()     // Catch: java.lang.Throwable -> L9
                android.ext.f.m(r0)     // Catch: java.lang.Throwable -> L9
                android.ext.Tools.u1(r0)     // Catch: java.lang.Throwable -> L9
                goto L40
            L3d:
                android.ext.e1.a(r0)
            L40:
                return
        }
    }

    class j implements java.lang.Runnable {
        j() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                long r0 = android.ext.Config.f30c
                r2 = 16
                long r0 = r0 & r2
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 != 0) goto L27
                boolean r0 = android.ext.Config.vSpaceReal
                if (r0 == 0) goto L27
                boolean r0 = android.ext.b1.B0()
                if (r0 != 0) goto L16
                goto L27
            L16:
                android.content.Context r0 = android.ext.r.p
                r1 = 2131296794(0x7f09021a, float:1.8211515E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                r4 = 0
                java.lang.Runnable r0 = android.ext.f1.J(r0, r1, r2, r4)
                android.ext.n2.i(r0)
            L27:
                return
        }
    }

    class k implements java.lang.Runnable {
        k() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r150 = this;
                long r0 = android.ext.Config.f30c
                r2 = 32
                long r0 = r0 & r2
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 == 0) goto Lc
                return
            Lc:
                java.lang.String r7 = "/system/priv-app/com.bluestacks.settings"
                java.lang.String r8 = "/system/priv-app/com.bluestacks.settings/com.bluestacks.settings.apk"
                java.lang.String r9 = "/system/priv-app/com.bluestacks.bstfolder"
                java.lang.String r10 = "/system/priv-app/com.bluestacks.bstfolder/com.bluestacks.bstfolder.apk"
                java.lang.String r11 = "/system/priv-app/com.bluestacks.BstCommandProcessor"
                java.lang.String r12 = "/system/priv-app/com.bluestacks.BstCommandProcessor/com.bluestacks.BstCommandProcessor.apk"
                java.lang.String r13 = "/boot/android/android/system/priv-app/com.bluestacks.settings"
                java.lang.String r14 = "/boot/android/android/system/priv-app/com.bluestacks.settings/com.bluestacks.settings.apk"
                java.lang.String r15 = "/boot/android/android/system/priv-app/com.bluestacks.bstfolder"
                java.lang.String r16 = "/boot/android/android/system/priv-app/com.bluestacks.bstfolder/com.bluestacks.bstfolder.apk"
                java.lang.String r17 = "/boot/android/android/system/priv-app/com.bluestacks.BstCommandProcessor"
                java.lang.String r18 = "/boot/android/android/system/priv-app/com.bluestacks.BstCommandProcessor/com.bluestacks.BstCommandProcessor.apk"
                java.lang.String r19 = "/storage/emulated/0/Android/data/com.bluestacks.settings"
                java.lang.String r20 = "/storage/emulated/0/Android/data/com.bluestacks.home"
                java.lang.String r21 = "/mnt/runtime/write/emulated/0/Android/data/com.bluestacks.settings"
                java.lang.String r22 = "/mnt/runtime/write/emulated/0/Android/data/com.bluestacks.home"
                java.lang.String r23 = "/mnt/runtime/read/emulated/0/Android/data/com.bluestacks.settings"
                java.lang.String r24 = "/mnt/runtime/read/emulated/0/Android/data/com.bluestacks.home"
                java.lang.String r25 = "/mnt/runtime/default/emulated/0/Android/data/com.bluestacks.settings"
                java.lang.String r26 = "/mnt/runtime/default/emulated/0/Android/data/com.bluestacks.home"
                java.lang.String r27 = "/data/.bluestacks.prop"
                java.lang.String r28 = "/data/misc/profiles/cur/0/com.bluestacks.settings"
                java.lang.String r29 = "/data/misc/profiles/cur/0/com.bluestacks.BstCommandProcessor"
                java.lang.String r30 = "/data/misc/profiles/cur/0/com.bluestacks.appmart"
                java.lang.String r31 = "/data/misc/profiles/cur/0/com.bluestacks.bstfolder"
                java.lang.String r32 = "/data/misc/profiles/cur/0/com.bluestacks.home"
                java.lang.String r33 = "/data/misc/profiles/cur/0/com.bluestacks.filemanager"
                java.lang.String r34 = "/data/misc/profiles/cur/0/com.bluestacks.appguidance"
                java.lang.String r35 = "/data/misc/profiles/ref/com.bluestacks.settings"
                java.lang.String r36 = "/data/misc/profiles/ref/com.bluestacks.BstCommandProcessor"
                java.lang.String r37 = "/data/misc/profiles/ref/com.bluestacks.appmart"
                java.lang.String r38 = "/data/misc/profiles/ref/com.bluestacks.bstfolder"
                java.lang.String r39 = "/data/misc/profiles/ref/com.bluestacks.home"
                java.lang.String r40 = "/data/misc/profiles/ref/com.bluestacks.filemanager"
                java.lang.String r41 = "/data/misc/profiles/ref/com.bluestacks.appguidance"
                java.lang.String r42 = "/data/media/0/Android/data/com.bluestacks.settings"
                java.lang.String r43 = "/data/media/0/Android/data/com.bluestacks.home"
                java.lang.String r44 = "/data/data/com.bluestacks.settings"
                java.lang.String r45 = "/data/data/com.bluestacks.BstCommandProcessor"
                java.lang.String r46 = "/data/data/com.bluestacks.appmart"
                java.lang.String r47 = "/data/data/com.bluestacks.bstfolder"
                java.lang.String r48 = "/data/data/com.bluestacks.home"
                java.lang.String r49 = "/data/data/com.bluestacks.filemanager"
                java.lang.String r50 = "/data/data/com.bluestacks.appguidance"
                java.lang.String r51 = "/data/downloads/com.bluestacks.appmart"
                java.lang.String r52 = "/data/downloads/com.bluestacks.home"
                java.lang.String r53 = "/data/downloads/com.bluestacks.filemanager"
                java.lang.String r54 = "/data/app-lib/com.bluestacks.settings"
                java.lang.String r55 = "/data/app-lib/com.bluestacks.BstCommandProcessor"
                java.lang.String r56 = "/data/app-lib/com.bluestacks.appmart"
                java.lang.String r57 = "/data/app-lib/com.bluestacks.bstfolder"
                java.lang.String r58 = "/data/app-lib/com.bluestacks.home"
                java.lang.String r59 = "/data/app-lib/com.bluestacks.filemanager"
                java.lang.String r60 = "/data/user_de/0/com.bluestacks.settings"
                java.lang.String r61 = "/data/user_de/0/com.bluestacks.BstCommandProcessor"
                java.lang.String r62 = "/data/user_de/0/com.bluestacks.appmart"
                java.lang.String r63 = "/data/user_de/0/com.bluestacks.bstfolder"
                java.lang.String r64 = "/data/user_de/0/com.bluestacks.home"
                java.lang.String r65 = "/data/user_de/0/com.bluestacks.filemanager"
                java.lang.String r66 = "/data/user_de/0/com.bluestacks.appguidance"
                java.lang.String r67 = "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.BstCommandProcessor@com.bluestacks.BstCommandProcessor.apk@classes.dex"
                java.lang.String r68 = "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.bstfolder@com.bluestacks.bstfolder.apk@classes.dex"
                java.lang.String r69 = "/data/dalvik-cache/x86/data@downloads@com.bluestacks.appmart@com.bluestacks.appmart.apk@classes.dex"
                java.lang.String r70 = "/data/dalvik-cache/x86/data@downloads@com.bluestacks.filemanager@com.bluestacks.filemanager.apk@classes.dex"
                java.lang.String r71 = "/data/dalvik-cache/x86/data@downloads@com.bluestacks.home@com.bluestacks.home.apk@classes.dex"
                java.lang.String r72 = "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.settings@com.bluestacks.settings.apk@classes.dex"
                java.lang.String r73 = "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.BstCommandProcessor@com.bluestacks.BstCommandProcessor.apk@classes.dex"
                java.lang.String r74 = "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.bstfolder@com.bluestacks.bstfolder.apk@classes.dex"
                java.lang.String r75 = "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.appmart@com.bluestacks.appmart.apk@classes.dex"
                java.lang.String r76 = "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.filemanager@com.bluestacks.filemanager.apk@classes.dex"
                java.lang.String r77 = "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.home@com.bluestacks.home.apk@classes.dex"
                java.lang.String r78 = "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.settings@com.bluestacks.settings.apk@classes.dex"
                java.lang.String r79 = "/system/lib64/libbstfolder_jni.so"
                java.lang.String r80 = "/system/lib64/egl/libGLES_bst.so"
                java.lang.String r81 = "/system/lib64/hw/gralloc.bst.so"
                java.lang.String r82 = "/system/lib/libbstfolder_jni.so"
                java.lang.String r83 = "/system/lib/egl/libGLES_bst.so"
                java.lang.String r84 = "/system/lib/hw/gralloc.bst.so"
                java.lang.String r85 = "/system/bin/bstsvcmgrtest"
                java.lang.String r86 = "/system/bin/bstshutdown_core"
                java.lang.String r87 = "/system/bin/bstfolderd"
                java.lang.String r88 = "/system/bin/bstfolder_ctl"
                java.lang.String r89 = "/system/bin/bstime"
                java.lang.String r90 = "/system/bin/bstsyncfs"
                java.lang.String r91 = "/system/bin/bstshutdown"
                java.lang.String r92 = "/system/xbin/bstk"
                java.lang.String r93 = "/storage/emulated/0/.bstshutdown_sync"
                java.lang.String r94 = "/mnt/runtime/write/emulated/0/.bstshutdown_sync"
                java.lang.String r95 = "/mnt/runtime/read/emulated/0/.bstshutdown_sync"
                java.lang.String r96 = "/mnt/runtime/default/emulated/0/.bstshutdown_sync"
                java.lang.String r97 = "/data/media/0/.bstshutdown_sync"
                java.lang.String r98 = "/data/downloads/.bstABI2Apps"
                java.lang.String r99 = "/sys/devices/virtual/bstsensor"
                java.lang.String r100 = "/sys/devices/virtual/misc/bst_ime"
                java.lang.String r101 = "/sys/devices/virtual/misc/bst_gps"
                java.lang.String r102 = "/sys/devices/virtual/misc/bstpgaipc"
                java.lang.String r103 = "/sys/class/bstsensor"
                java.lang.String r104 = "/sys/class/misc/bst_ime"
                java.lang.String r105 = "/sys/class/misc/bst_gps"
                java.lang.String r106 = "/sys/class/misc/bstpgaipc"
                java.lang.String r107 = "/sys/bus/pci/drivers/bstsensor"
                java.lang.String r108 = "/sys/bus/pci/drivers/bstvideo"
                java.lang.String r109 = "/sys/bus/pci/drivers/bstaudio"
                java.lang.String r110 = "/sys/bus/pci/drivers/bstcamera"
                java.lang.String r111 = "/sys/bus/pci/drivers/bstinput"
                java.lang.String r112 = "/sys/bus/pci/drivers/bstpgaipc"
                java.lang.String r113 = "/sys/module/bstsensor"
                java.lang.String r114 = "/sys/module/bstvideo"
                java.lang.String r115 = "/sys/module/bstaudio"
                java.lang.String r116 = "/sys/module/bstcamera"
                java.lang.String r117 = "/sys/module/videobuf_core/holders/bstcamera"
                java.lang.String r118 = "/sys/module/bstinput"
                java.lang.String r119 = "/sys/module/bstpgaipc"
                java.lang.String r120 = "/proc/irq/16/bstcamera"
                java.lang.String r121 = "/proc/irq/17/bstaudio"
                java.lang.String r122 = "/proc/irq/18/bstinput"
                java.lang.String r123 = "/proc/irq/22/bstpgaipc"
                java.lang.String r124 = "/proc/irq/23/bstsensor"
                java.lang.String r125 = "/proc/bstid"
                java.lang.String r126 = "/proc/asound/bstaudio"
                java.lang.String r127 = "/proc/bstfolder_exports"
                java.lang.String r128 = "/boot/android/android/system/lib64/egl/libGLES_bst.so"
                java.lang.String r129 = "/boot/android/android/system/lib64/hw/gralloc.bst.so"
                java.lang.String r130 = "/boot/android/android/system/lib/egl/libGLES_bst.so"
                java.lang.String r131 = "/boot/android/android/system/lib/hw/gralloc.bst.so"
                java.lang.String r132 = "/boot/android/android/system/bin/bstsvcmgrtest"
                java.lang.String r133 = "/boot/android/android/system/bin/bstshutdown_core"
                java.lang.String r134 = "/boot/android/android/system/bin/bstfolderd"
                java.lang.String r135 = "/boot/android/android/system/bin/bstfolder_ctl"
                java.lang.String r136 = "/boot/android/android/system/bin/bstime"
                java.lang.String r137 = "/boot/android/android/system/bin/bstsyncfs"
                java.lang.String r138 = "/boot/android/android/system/bin/bstshutdown"
                java.lang.String r139 = "/boot/android/android/system/xbin/bstk"
                java.lang.String r140 = "/boot/bstsetup.env"
                java.lang.String r141 = "/boot/bstmods"
                java.lang.String r142 = "/dev/bstpgaipc"
                java.lang.String r143 = "/dev/bst_gps"
                java.lang.String r144 = "/dev/bst_ime"
                java.lang.String r145 = "/dev/bstgyro"
                java.lang.String r146 = "/dev/bstorie"
                java.lang.String r147 = "/dev/bstmegn"
                java.lang.String r148 = "/dev/bstacce"
                java.lang.String r149 = "/dev/socket/bstfolderd"
                java.lang.String[] r0 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149}
                r1 = 0
                r4 = 0
            L130:
                r5 = 0
                r6 = 143(0x8f, float:2.0E-43)
                if (r4 >= r6) goto L14d
                r6 = r0[r4]
                java.io.File r7 = new java.io.File
                r7.<init>(r6)
                boolean r6 = r7.exists()
                if (r6 == 0) goto L14a
                r0 = 2131296302(0x7f09002e, float:1.8210517E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                goto L14e
            L14a:
                int r4 = r4 + 1
                goto L130
            L14d:
                r0 = r5
            L14e:
                if (r0 != 0) goto L151
                return
            L151:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r6 = 2131296968(0x7f0902c8, float:1.8211868E38)
                java.lang.String r6 = android.ext.Tools.N1(r6)
                r7 = 1
                java.lang.Object[] r8 = new java.lang.Object[r7]
                r8[r1] = r0
                java.lang.String r0 = android.ext.Tools.L1(r6, r8)
                r4.append(r0)
                r0 = 2131296444(0x7f0900bc, float:1.8210805E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                android.os.Handler r1 = android.ext.n2.d()
                java.lang.Runnable r0 = android.ext.f1.J(r5, r0, r2, r7)
                r2 = 30000(0x7530, double:1.4822E-319)
                r1.postDelayed(r0, r2)
                return
        }
    }

    class l implements java.lang.Runnable {
        l() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                long r0 = android.ext.Config.f30c
                r2 = 8
                long r0 = r0 & r2
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 == 0) goto Lc
                return
            Lc:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String[] r1 = android.ext.n0.e()
                r4 = 2
            L16:
                int r5 = r1.length
                r6 = 10
                if (r4 >= r5) goto L3f
                r5 = r1[r4]
                int r7 = r4 + 1
                r8 = r1[r7]
                boolean r8 = android.ext.Tools.e1(r8)
                if (r8 == 0) goto L3c
                r0.append(r6)
                r0.append(r5)
                java.lang.String r5 = " ("
                r0.append(r5)
                r5 = r1[r7]
                r0.append(r5)
                r5 = 41
                r0.append(r5)
            L3c:
                int r4 = r4 + 2
                goto L16
            L3f:
                int r1 = r0.length()
                if (r1 != 0) goto L46
                return
            L46:
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                android.content.Context r1 = android.ext.r.p
                r4 = 2131296730(0x7f0901da, float:1.8211385E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                r5[r6] = r0
                java.lang.String r0 = android.ext.Tools.L1(r4, r5)
                java.lang.Runnable r0 = android.ext.f1.J(r1, r0, r2, r6)
                android.ext.n2.i(r0)
                return
        }
    }

    class m implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f976b;

        class a implements android.content.DialogInterface.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.f1.m f977a;

            a(android.ext.f1.m r1) {
                    r0 = this;
                    r0.f977a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface r1) {
                    r0 = this;
                    android.ext.f1$m r1 = r0.f977a
                    java.lang.Runnable r1 = r1.f976b
                    r1.run()
                    return
            }
        }

        m(android.content.Context r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f975a = r1
                r0.f976b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.String r0 = "     15. __help_faq_15_q__\r\n        __help_faq_15_a__\r\n\r\n     16. __help_faq_16_q__\r\n        __help_faq_16_a__\r\n\r\n     17. __help_faq_17_q__\r\n        __help_faq_17_a__\r\n\r\n__rtfm__"
                java.lang.String r0 = android.ext.b2.g(r0)     // Catch: java.lang.Throwable -> L2d
                android.content.Context r1 = r3.f975a     // Catch: java.lang.Throwable -> L2d
                android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)     // Catch: java.lang.Throwable -> L2d
                android.app.AlertDialog$Builder r0 = r1.setMessage(r0)     // Catch: java.lang.Throwable -> L2d
                r1 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L2d
                r2 = 0
                android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)     // Catch: java.lang.Throwable -> L2d
                android.app.AlertDialog r0 = r0.create()     // Catch: java.lang.Throwable -> L2d
                java.lang.Runnable r1 = r3.f976b     // Catch: java.lang.Throwable -> L2d
                if (r1 == 0) goto L2f
                android.ext.f1$m$a r1 = new android.ext.f1$m$a     // Catch: java.lang.Throwable -> L2d
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L2d
                android.ext.f.k(r0, r1)     // Catch: java.lang.Throwable -> L2d
                goto L2f
            L2d:
                r0 = move-exception
                goto L33
            L2f:
                android.ext.f.m(r0)     // Catch: java.lang.Throwable -> L2d
                goto L38
            L33:
                java.lang.String r1 = "Failed faq alert"
                android.ext.e1.l(r1, r0)
            L38:
                return
        }
    }

    class n implements java.lang.Runnable {
        n() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.String r0 = "AndroidService"
                java.lang.String r1 = "wait 4"
                android.ext.e1.e.a(r0, r1)
                android.os.Handler r0 = android.ext.n2.d()
                r0.removeCallbacks(r2)
                android.ext.f1.p()
                return
        }
    }

    class o implements java.lang.Runnable {
        o() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                java.lang.String r0 = "AndroidService"
                android.content.Context r1 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L43
                android.content.ComponentName r2 = android.ext.f1.u()     // Catch: java.lang.Throwable -> L43
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
                r3.<init>()     // Catch: java.lang.Throwable -> L43
                java.lang.String r4 = "Restart: true "
                r3.append(r4)     // Catch: java.lang.Throwable -> L43
                int r4 = android.ext.Config.z     // Catch: java.lang.Throwable -> L43
                r3.append(r4)     // Catch: java.lang.Throwable -> L43
                r4 = 32
                r3.append(r4)     // Catch: java.lang.Throwable -> L43
                r3.append(r2)     // Catch: java.lang.Throwable -> L43
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L43
                android.ext.e1.e.a(r0, r3)     // Catch: java.lang.Throwable -> L43
                boolean r3 = android.ext.Config.vSpaceReal     // Catch: java.lang.Throwable -> L43
                if (r3 != 0) goto L45
                int r3 = android.ext.Config.z     // Catch: java.lang.Throwable -> L43
                if (r3 != 0) goto L45
                if (r2 == 0) goto L45
                android.os.Bundle r3 = android.ext.r.u()     // Catch: java.lang.Throwable -> L43
                r4 = 0
                boolean r2 = r1.startInstrumentation(r2, r4, r3)     // Catch: java.lang.Throwable -> L43
                if (r2 == 0) goto L45
                java.lang.String r2 = "Restart 1"
                android.ext.e1.e.a(r0, r2)     // Catch: java.lang.Throwable -> L43
                goto L45
            L43:
                r0 = move-exception
                goto L94
            L45:
                java.lang.String r2 = "Restart 2"
                android.ext.e1.e.a(r0, r2)     // Catch: java.lang.Throwable -> L43
                java.lang.String r0 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L43
                java.lang.String r2 = android.ext.r.t()     // Catch: java.lang.Throwable -> L43
                android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L43
                r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L43
                r4 = 1
                r5 = 200(0xc8, float:2.8E-43)
                android.ext.Tools.w1(r5, r3, r4)     // Catch: java.lang.Throwable -> L43
                android.content.Intent r0 = android.ext.Tools.N0(r1, r0, r2)     // Catch: java.lang.Throwable -> L43
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
                r2.<init>()     // Catch: java.lang.Throwable -> L43
                java.lang.String r3 = "Restart: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L43
                r2.append(r0)     // Catch: java.lang.Throwable -> L43
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L43
                android.ext.e1.d(r2)     // Catch: java.lang.Throwable -> L43
                r2 = 123456(0x1e240, float:1.72999E-40)
                r3 = 268435456(0x10000000, float:2.524355E-29)
                android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r2, r0, r3)     // Catch: java.lang.Throwable -> L43
                java.lang.String r2 = "alarm"
                java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L43
                android.app.AlarmManager r1 = (android.app.AlarmManager) r1     // Catch: java.lang.Throwable -> L43
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L43
                r5 = 1000(0x3e8, double:4.94E-321)
                long r2 = r2 + r5
                r1.set(r4, r2, r0)     // Catch: java.lang.Throwable -> L43
                android.ext.f1.n()     // Catch: java.lang.Throwable -> L43
                return
            L94:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Failed restart"
                r1.<init>(r2, r0)
                throw r1
        }
    }

    static {
            return
    }

    static boolean A() {
            r0 = 1
            android.ext.v.f1278b = r0
            r1 = 0
            java.lang.String r2 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L49
            android.content.Context r3 = android.ext.r.p     // Catch: java.lang.Throwable -> L49
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.Class<catch_.me_.if_.you_.can_.AnalyticsService> r5 = catch_.me_.if_.you_.can_.AnalyticsService.class
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L49
            android.content.Intent r2 = r4.setClassName(r2, r5)     // Catch: java.lang.Throwable -> L49
            android.content.ComponentName r2 = r3.startService(r2)     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            if (r2 != 0) goto L25
            r1 = 0
            goto L41
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r1.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L47
            r1.append(r3)     // Catch: java.lang.Throwable -> L47
            r3 = 32
            r1.append(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r2.toShortString()     // Catch: java.lang.Throwable -> L47
            r1.append(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L47
        L41:
            r2 = 10
            B(r2, r1)     // Catch: java.lang.Throwable -> L47
            goto L51
        L47:
            r1 = move-exception
            goto L4c
        L49:
            r0 = move-exception
            r1 = r0
            r0 = 0
        L4c:
            java.lang.String r2 = "Failed load Service"
            android.ext.e1.l(r2, r1)
        L51:
            return r0
    }

    static void B(int r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "main "
            r0.append(r1)
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r2 = android.os.Process.myUid()
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            boolean r2 = android.ext.u.c()
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            android.ext.r r1 = android.ext.r.n
            if (r1 != 0) goto L30
            r1 = 0
            goto L38
        L30:
            android.ext.r r1 = android.ext.r.n
            boolean r1 = r1.f1206d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L38:
            r0.append(r1)
            r0.append(r2)
            android.ext.u r1 = android.ext.u.f1267b
            r0.append(r1)
            r0.append(r2)
            android.ext.v r1 = android.ext.v.f1277a
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            android.ext.e1.d(r2)
            return
    }

    private static void C() {
            java.lang.String r0 = "AndroidService"
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L1f
            java.io.File r2 = android.ext.Tools.q0()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "client_exit"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L34
            boolean r1 = r1.createNewFile()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L34
            java.lang.String r1 = "Failed mark client exit"
            android.ext.e1.e.a(r0, r1)     // Catch: java.lang.Throwable -> L1f
            goto L34
        L1f:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed mark client exit: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.ext.e1.e.a(r0, r1)
        L34:
            return
    }

    public static void D() {
            android.ext.r r0 = android.ext.r.n
            r1 = 2
            r0.L(r1)
            boolean r0 = android.ext.f1.f954d
            if (r0 == 0) goto Lb
            return
        Lb:
            r0 = 1
            android.ext.f1.f954d = r0
            android.ext.h0.i()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GG started: "
            r1.append(r2)
            float r0 = (float) r0
            r2 = 1121569997(0x42d9cccd, float:108.9)
            float r2 = r2 * r0
            r3 = 1089470464(0x40f00000, float:7.5)
            float r2 = r2 - r3
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r2 = 1183066522(0x4684299a, float:16916.8)
            float r0 = r0 * r2
            r2 = 1144943411(0x443e7333, float:761.8)
            float r0 = r0 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r0 = (int) r0
            r1.append(r0)
            java.lang.String r0 = ") on "
            r1.append(r0)
            java.lang.String r0 = android.ext.h0.b()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.ext.e1.h(r0)
            android.ext.r0 r0 = new android.ext.r0
            r1 = 0
            r0.<init>(r1)
            android.ext.h2 r2 = new android.ext.h2
            r3 = 0
            r5 = 0
            r7 = 0
            r2.<init>(r3, r5, r7)
            boolean r0 = android.ext.s1.E()
            if (r0 != 0) goto L6d
            android.ext.r r0 = android.ext.r.n
            r0.m()
            android.ext.z.m()
        L6d:
            android.ext.t.c()
            android.ext.y0.e()
            android.ext.q1 r0 = new android.ext.q1
            r0.<init>()
            r0.h()
            h()
            android.ext.n0.b()
            r0 = 5
            r2 = 0
            B(r0, r2)
            b()
            l()
            c()
            j()
            g()
            k()
            boolean r0 = android.ext.s1.E()
            if (r0 != 0) goto La1
            d(r1)
        La1:
            android.ext.c1.g()
            android.ext.p2.i()
            r0 = 3
            android.ext.ConfigListAdapter.j(r0)
            return
    }

    private static java.lang.String E() {
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.ext.Tools.q0()
            java.lang.String r2 = "FC.txt"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L13
            return r2
        L13:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L30
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 41
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L29
            int r3 = r1.read(r0)     // Catch: java.lang.Throwable -> L29
            if (r3 <= 0) goto L2b
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L29
            r5 = 0
            r4.<init>(r0, r5, r3)     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            r0 = move-exception
            goto L32
        L2b:
            r4 = r2
        L2c:
            r1.close()     // Catch: java.lang.Throwable -> L30
            return r4
        L30:
            r0 = move-exception
            goto L36
        L32:
            r1.close()     // Catch: java.lang.Throwable -> L30
            throw r0     // Catch: java.lang.Throwable -> L30
        L36:
            java.lang.String r1 = "Fail get FC file"
            android.ext.e1.l(r1, r0)
            return r2
    }

    static void F() {
            boolean r0 = t()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = android.ext.s1.Q()
            java.lang.String r1 = E()
            int r2 = android.ext.s0.a(r1)
            long r3 = android.ext.s0.e(r1)
            int r5 = s()
            long r6 = m()
            boolean r1 = android.ext.s0.c(r2, r3, r5, r6)
            r2 = 1
            d(r2)
            a()
            if (r1 == 0) goto L34
            if (r0 != 0) goto L34
            r0 = 4
            java.lang.String r1 = ""
            android.ext.s1.v(r0, r1)
        L34:
            return
    }

    static boolean G(java.lang.Runnable r1) {
            r0 = 0
            boolean r1 = e(r0, r1)
            return r1
    }

    public static void H() {
            int r0 = android.ext.f1.f953c
            if (r0 != 0) goto L5
            return
        L5:
            android.ext.f1$o r0 = new android.ext.f1$o
            r0.<init>()
            android.ext.n2.i(r0)
            return
    }

    static void I() {
            r0 = 0
            int r1 = android.ext.Config.z     // Catch: java.lang.Throwable -> L14
            r2 = 2
            r3 = 3
            if (r1 == r2) goto L19
            if (r1 == r3) goto L16
            r2 = 4
            if (r1 == r2) goto Ld
            goto L29
        Ld:
            android.ext.r r1 = android.ext.r.n     // Catch: java.lang.Throwable -> L14
            android.content.Context r1 = r1.getBaseContext()     // Catch: java.lang.Throwable -> L14
            goto L2a
        L14:
            r1 = move-exception
            goto L26
        L16:
            android.content.Context r1 = android.ext.r.o     // Catch: java.lang.Throwable -> L14
            goto L2a
        L19:
            android.ext.r r1 = android.ext.r.n     // Catch: java.lang.Throwable -> L14
            android.ext.r r2 = android.ext.r.n     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L14
            android.content.Context r1 = r1.createPackageContext(r2, r3)     // Catch: java.lang.Throwable -> L14
            goto L2a
        L26:
            android.ext.e1.a(r1)
        L29:
            r1 = r0
        L2a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "setContext: "
            r2.append(r3)
            int r3 = android.ext.Config.z
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            android.ext.e1.d(r2)
            if (r1 == 0) goto L71
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r2 = a.f.a(r2)     // Catch: java.lang.Throwable -> L5b
            a.d r2 = (a.d) r2     // Catch: java.lang.Throwable -> L5b
            r3 = 2131099677(0x7f06001d, float:1.7811714E38)
            r2.inflate(r3, r0)     // Catch: java.lang.Throwable -> L5b
            goto L71
        L5b:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed use context: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.ext.e1.s(r1, r2)
            goto L72
        L71:
            r0 = r1
        L72:
            if (r0 == 0) goto L84
            android.ext.Tools.X0(r0)
            android.content.Context r0 = android.ext.l2.i(r0)
            android.ext.MainService.context = r0
            O()
            D()
            goto Lb7
        L84:
            r0 = 1
            android.ext.v.f1280d = r0
            boolean r0 = A()
            if (r0 != 0) goto Lb7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2131296350(0x7f09005e, float:1.8210614E38)
            java.lang.String r1 = android.ext.Tools.N1(r1)
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r1 = 2131296955(0x7f0902bb, float:1.8211841E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.Tools.J1(r0)
            android.ext.r r0 = android.ext.r.n
            r0.T()
        Lb7:
            return
    }

    static java.lang.Runnable J(android.content.Context r0, java.lang.String r1, long r2, boolean r4) {
            android.ext.f1$i r4 = new android.ext.f1$i
            r4.<init>(r0, r1, r2)
            return r4
    }

    public static void K() {
            android.ext.f1$a r0 = new android.ext.f1$a
            r0.<init>()
            android.ext.n2.i(r0)
            return
    }

    static void L() {
            android.ext.r r0 = android.ext.r.n
            r1 = 1
            r0.L(r1)
            android.ext.b1.z1()
            return
    }

    static void M() {
            android.ext.z0.h()
            return
    }

    private static boolean N() {
            r0 = 0
            android.content.Context r1 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L37
            java.lang.String r2 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L35
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L35
            r3.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.Class<catch_.me_.if_.you_.can_.AnalyticsService> r4 = catch_.me_.if_.you_.can_.AnalyticsService.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L35
            android.content.Intent r2 = r3.setClassName(r2, r4)     // Catch: java.lang.Throwable -> L35
            boolean r0 = r1.stopService(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r1.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = " "
            r1.append(r2)     // Catch: java.lang.Throwable -> L35
            r1.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L35
            r2 = 100
            B(r2, r1)     // Catch: java.lang.Throwable -> L35
            goto L44
        L35:
            r1 = move-exception
            goto L3f
        L37:
            java.lang.String r1 = ""
            r2 = 101(0x65, float:1.42E-43)
            B(r2, r1)     // Catch: java.lang.Throwable -> L35
            goto L44
        L3f:
            java.lang.String r2 = "Failed unload Service"
            android.ext.e1.l(r2, r1)
        L44:
            return r0
    }

    static void O() {
            int r0 = android.ext.Config.z
            r1 = 1
            if (r0 != r1) goto L6
            return
        L6:
            int r0 = android.ext.Config.B
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L10
            A()
            goto L13
        L10:
            N()
        L13:
            return
    }

    private static void P(java.io.File r3) {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            int r3 = s()     // Catch: java.lang.Throwable -> L1e
            long r1 = m()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = android.ext.s0.b(r3, r1)     // Catch: java.lang.Throwable -> L1e
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L1e
            r0.write(r3)     // Catch: java.lang.Throwable -> L1e
            r0.close()     // Catch: java.lang.Throwable -> L1c
            goto L28
        L1c:
            r3 = move-exception
            goto L23
        L1e:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1c
            throw r3     // Catch: java.lang.Throwable -> L1c
        L23:
            java.lang.String r0 = "Fail set FC file"
            android.ext.e1.l(r0, r3)
        L28:
            return
    }

    static void a() {
            boolean r0 = t()
            if (r0 == 0) goto L7
            return
        L7:
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.ext.Tools.q0()
            java.lang.String r2 = "FC.txt"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L19
            return
        L19:
            P(r0)
            return
    }

    public static void b() {
            android.ext.g0 r0 = new android.ext.g0
            android.ext.f1$g r1 = new android.ext.f1$g
            r1.<init>()
            java.lang.String r2 = "checkAutoTranslation"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private static void c() {
            android.ext.g0 r0 = new android.ext.g0
            android.ext.f1$l r1 = new android.ext.f1$l
            r1.<init>()
            java.lang.String r2 = "checkBadApps"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private static void d(boolean r1) {
            r0 = 0
            e(r1, r0)
            return
    }

    private static boolean e(boolean r8, java.lang.Runnable r9) {
            boolean r0 = t()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            java.io.File r2 = android.ext.Tools.q0()
            java.lang.String r3 = "FC.txt"
            r0.<init>(r2, r3)
            if (r8 == 0) goto L19
            r0.delete()
            return r1
        L19:
            java.lang.String r8 = E()
            int r2 = android.ext.s0.a(r8)
            long r3 = android.ext.s0.e(r8)
            int r5 = s()
            long r6 = m()
            boolean r8 = android.ext.s0.c(r2, r3, r5, r6)
            if (r8 == 0) goto L87
            r1 = 1
            boolean[] r8 = new boolean[r1]
            android.app.AlertDialog$Builder r2 = android.ext.f.b()
            r3 = 2131296468(0x7f0900d4, float:1.8210854E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.app.AlertDialog$Builder r2 = r2.setMessage(r3)
            r3 = 2131296455(0x7f0900c7, float:1.8210827E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.ext.f1$e r4 = new android.ext.f1$e
            r4.<init>(r8, r9)
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r3, r4)
            r3 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4 = 64
            android.content.DialogInterface$OnClickListener r4 = w(r4)
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r3, r4)
            r3 = 2131296519(0x7f090107, float:1.8210957E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.ext.f1$d r4 = new android.ext.f1$d
            r4.<init>()
            android.app.AlertDialog$Builder r2 = r2.setNeutralButton(r3, r4)
            android.app.AlertDialog r2 = r2.create()
            if (r9 == 0) goto L84
            android.ext.f1$f r3 = new android.ext.f1$f
            r3.<init>(r8, r9)
            android.ext.f.k(r2, r3)
        L84:
            android.ext.f.m(r2)
        L87:
            r0.delete()
            P(r0)
            return r1
    }

    static void f(byte r7) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.ext.Tools.q0()
            java.lang.String r2 = "instr.check"
            r0.<init>(r1, r2)
            r1 = 1
            float r2 = (float) r1
            r3 = 1182665114(0x467e099a, float:16258.4)
            float r2 = r2 * r3
            r3 = 1120849101(0x42cecccd, float:103.4)
            float r2 = r2 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r7 != 0) goto L3e
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L31
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = java.lang.Integer.toString(r2)     // Catch: java.lang.Throwable -> L33
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L33
            r7.write(r0)     // Catch: java.lang.Throwable -> L33
            r7.close()     // Catch: java.lang.Throwable -> L31
            goto La2
        L31:
            r7 = move-exception
            goto L38
        L33:
            r0 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L38:
            java.lang.String r0 = "Fail set instr file"
            android.ext.e1.l(r0, r7)
            goto La2
        L3e:
            if (r7 != r1) goto L5e
            boolean r7 = r0.exists()
            if (r7 != 0) goto L5a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "No instr file: "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.ext.e1.i(r7)
        L5a:
            r0.delete()
            goto La2
        L5e:
            boolean r7 = r0.exists()
            if (r7 == 0) goto La2
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L96
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L96
            r3 = 12
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7e
            int r4 = r7.read(r3)     // Catch: java.lang.Throwable -> L7e
            r5 = 0
            if (r4 <= 0) goto L80
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L7e
            r6.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> L7e
            int r5 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r1 = move-exception
            goto L98
        L80:
            if (r5 != r2) goto L92
            int r2 = android.ext.Config.z     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L92
            r2 = 2131034157(0x7f05002d, float:1.7678824E38)
            android.ext.Config$p r2 = android.ext.Config.b(r2)     // Catch: java.lang.Throwable -> L7e
            r2.f42d = r1     // Catch: java.lang.Throwable -> L7e
            android.ext.Config.k()     // Catch: java.lang.Throwable -> L7e
        L92:
            r7.close()     // Catch: java.lang.Throwable -> L96
            goto L5a
        L96:
            r7 = move-exception
            goto L9c
        L98:
            r7.close()     // Catch: java.lang.Throwable -> L96
            throw r1     // Catch: java.lang.Throwable -> L96
        L9c:
            java.lang.String r1 = "Fail get instr file"
            android.ext.e1.l(r1, r7)
            goto L5a
        La2:
            return
    }

    private static void g() {
            long r0 = android.ext.Config.f30c
            r2 = 128(0x80, double:6.3E-322)
            long r0 = r0 & r2
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "%e"
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L60
            r5 = 2014570835(0x7813e953, float:1.2E34)
            java.lang.Float r6 = java.lang.Float.valueOf(r5)     // Catch: java.lang.Throwable -> L60
            r7 = 0
            r4[r7] = r6     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = android.ext.Tools.L1(r0, r4)     // Catch: java.lang.Throwable -> L60
            r4 = 101(0x65, float:1.42E-43)
            int r4 = r0.indexOf(r4)     // Catch: java.lang.Throwable -> L60
            r6 = -1
            if (r4 != r6) goto L64
            r4 = 69
            int r4 = r0.indexOf(r4)     // Catch: java.lang.Throwable -> L60
            if (r4 != r6) goto L64
            r4 = 1077(0x435, float:1.509E-42)
            int r4 = r0.indexOf(r4)     // Catch: java.lang.Throwable -> L60
            if (r4 != r6) goto L64
            r4 = 1045(0x415, float:1.464E-42)
            int r4 = r0.indexOf(r4)     // Catch: java.lang.Throwable -> L60
            if (r4 != r6) goto L64
            android.content.Context r4 = android.ext.r.p     // Catch: java.lang.Throwable -> L60
            r6 = 2131297113(0x7f090359, float:1.8212162E38)
            java.lang.String r6 = android.ext.b2.f(r6)     // Catch: java.lang.Throwable -> L60
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = java.lang.Float.toString(r5)     // Catch: java.lang.Throwable -> L60
            r8[r7] = r5     // Catch: java.lang.Throwable -> L60
            r8[r1] = r0     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = android.ext.Tools.L1(r6, r8)     // Catch: java.lang.Throwable -> L60
            java.lang.Runnable r0 = J(r4, r0, r2, r7)     // Catch: java.lang.Throwable -> L60
            android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L60
            goto L64
        L60:
            r0 = move-exception
            android.ext.e1.a(r0)
        L64:
            return
    }

    private static void h() {
            android.ext.g0 r0 = new android.ext.g0
            android.ext.f1$b r1 = new android.ext.f1$b
            r1.<init>()
            java.lang.String r2 = "checkNewVersion"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    static void i() {
            java.lang.String r0 = "com.chaozhuo.permission.controller"
            boolean r0 = android.ext.Tools.e1(r0)
            if (r0 != 0) goto L9
            return
        L9:
            long r0 = android.ext.Config.f30c
            r2 = 4
            long r0 = r0 & r2
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L15
            return
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2131296791(0x7f090217, float:1.8211509E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.append(r1)
            java.lang.String r1 = "\n\n"
            r0.append(r1)
            java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25<70krz0wr0uxq0lq0skrhql{rv0jdphjxdugldq2"
            java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.content.Context r1 = android.ext.r.p
            r4 = 1
            java.lang.Runnable r0 = J(r1, r0, r2, r4)
            android.ext.n2.i(r0)
            return
    }

    private static void j() {
            android.ext.g0 r0 = new android.ext.g0
            android.ext.f1$j r1 = new android.ext.f1$j
            r1.<init>()
            java.lang.String r2 = "checkRandomName"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private static void k() {
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.ext.Tools.q0()
            java.lang.String r2 = "sel.txt"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L12
            return
        L12:
            int r1 = android.ext.Config.A
            r1 = r1 & 4
            if (r1 != 0) goto L4e
            r1 = 1
            d(r1)
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            r2 = 2131296736(0x7f0901e0, float:1.8211397E38)
            android.view.View r2 = android.ext.Tools.g0(r2)
            android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)
            r2 = 2131297104(0x7f090350, float:1.8212143E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            android.ext.f1$c r3 = new android.ext.f1$c
            r3.<init>(r0)
            android.app.AlertDialog$Builder r0 = r1.setItems(r2, r3)
            android.app.AlertDialog r0 = r0.create()
            android.ext.f.m(r0)
            return
        L4e:
            r0.delete()
            return
        L52:
            r0 = move-exception
            android.ext.e1.a(r0)
            return
    }

    private static void l() {
            android.ext.g0 r0 = new android.ext.g0
            android.ext.f1$k r1 = new android.ext.f1$k
            r1.<init>()
            java.lang.String r2 = "checkSlowEmulator"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    private static long m() {
            java.lang.String r0 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            android.content.pm.PackageInfo r0 = android.ext.Tools.A0(r0, r1)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
            long r0 = r0.lastUpdateTime     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            r0 = move-exception
            java.lang.String r1 = "Fail get package info"
            android.ext.e1.l(r1, r0)
        L14:
            r0 = -1
            return r0
    }

    public static void n() {
            java.lang.String r0 = "OnExit"
            C()
            N()
            java.lang.String r1 = "Main: die"
            java.lang.String r2 = "AndroidService"
            android.ext.e1.e.a(r2, r1)
            r1 = 0
            java.lang.System.exit(r1)     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r3 = move-exception
            android.ext.e1.e.d(r2, r0, r3)
        L18:
            java.lang.String r3 = "exit: 14"
            android.ext.e1.e.a(r2, r3)
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L25
            r3.halt(r1)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r1 = move-exception
            android.ext.e1.e.d(r2, r0, r1)
        L29:
            java.lang.String r1 = "exit: 15"
            android.ext.e1.e.a(r2, r1)
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L36
            android.os.Process.killProcess(r1)     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r1 = move-exception
            android.ext.e1.e.d(r2, r0, r1)
        L3a:
            java.lang.String r1 = "exit: 16"
            android.ext.e1.e.a(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r1.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "exec kill "
            r1.append(r3)     // Catch: java.lang.Throwable -> L5a
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L5a
            r1.append(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5a
            r3 = 45
            android.ext.e2.n(r1, r3)     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r1 = move-exception
            android.ext.e1.e.d(r2, r0, r1)
        L5e:
            java.lang.String r0 = "exit: 17"
            android.ext.e1.e.a(r2, r0)
            android.ext.n0$h r0 = new android.ext.n0$h
            java.lang.String r1 = "Failed exit from the app normally"
            r0.<init>(r1)
            throw r0
    }

    public static void o() {
            java.lang.String r0 = "Main: exit"
            android.ext.e1.d(r0)
            r0 = 1
            android.ext.f1.f952b = r0
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L1d
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L17
            r1.m1(r0)     // Catch: java.lang.Throwable -> L17
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L17
            r1.a0()     // Catch: java.lang.Throwable -> L17
            goto L1d
        L17:
            r1 = move-exception
            java.lang.String r2 = "Exception on exit"
            android.ext.e1.s(r2, r1)
        L1d:
            java.lang.String r1 = "exit: 1"
            java.lang.String r2 = "AndroidService"
            android.ext.e1.e.a(r2, r1)
            java.io.File r1 = android.ext.Tools.q0()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "sel.txt"
            r3.<init>(r1, r4)
            r3.delete()
            d(r0)
            java.lang.String r1 = "exit: 2"
            android.ext.e1.e.a(r2, r1)
            android.ext.e1.b()     // Catch: java.lang.Throwable -> L3e
            goto L44
        L3e:
            r1 = move-exception
            java.lang.String r3 = "OnExit"
            android.ext.e1.e.d(r2, r3, r1)
        L44:
            java.lang.String r1 = "exit: 3"
            android.ext.e1.e.a(r2, r1)
            android.ext.v r1 = android.ext.v.f1277a
            r3 = 0
            if (r1 == 0) goto L50
            r1 = 1
            goto L51
        L50:
            r1 = 0
        L51:
            android.ext.f1$n r4 = new android.ext.f1$n
            r4.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "wait 1: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.ext.e1.e.a(r2, r5)
            if (r1 == 0) goto L73
            android.ext.v.f1279c = r4
            android.ext.v r5 = android.ext.v.f1277a
            r5.c()
        L73:
            boolean r5 = N()
            if (r5 != 0) goto L7d
            if (r1 == 0) goto L7c
            goto L7d
        L7c:
            r0 = 0
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "wait 2: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.ext.e1.e.a(r2, r1)
            if (r0 != 0) goto L97
            p()
            goto La6
        L97:
            java.lang.Runnable r0 = android.ext.v.f1279c
            if (r0 != 0) goto L9d
            android.ext.v.f1279c = r4
        L9d:
            android.os.Handler r0 = android.ext.n2.d()
            r1 = 3000(0xbb8, double:1.482E-320)
            r0.postDelayed(r4, r1)
        La6:
            return
    }

    static void p() {
            java.lang.String r0 = "OnExit"
            java.lang.String r1 = "AndroidService"
            C()
            H()     // Catch: java.lang.Throwable -> Lb
            goto Lf
        Lb:
            r2 = move-exception
            android.ext.e1.e.d(r1, r0, r2)
        Lf:
            java.lang.String r2 = "exit: 4"
            android.ext.e1.e.a(r1, r2)
            android.ext.n2.a()     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r2 = move-exception
            android.ext.e1.e.d(r1, r0, r2)
        L1c:
            java.lang.String r2 = "exit: 5"
            android.ext.e1.e.a(r1, r2)
            android.ext.u.a()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            android.ext.e1.e.d(r1, r0, r2)
        L29:
            java.lang.String r2 = "exit: 6"
            android.ext.e1.e.a(r1, r2)
            java.io.File r2 = new java.io.File
            java.io.File r3 = android.ext.Tools.b0()
            java.lang.String r4 = "skipFinalization"
            r2.<init>(r3, r4)
            java.lang.String r3 = "exit: 7"
            android.ext.e1.e.a(r1, r3)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L6b
            java.lang.String r3 = "exit: 8"
            android.ext.e1.e.a(r1, r3)
            r2.createNewFile()     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r3 = move-exception
            android.ext.e1.e.d(r1, r0, r3)
        L51:
            java.lang.String r3 = "exit: 9"
            android.ext.e1.e.a(r1, r3)
            java.lang.System.runFinalization()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r3 = move-exception
            android.ext.e1.e.d(r1, r0, r3)
        L5e:
            java.lang.String r3 = "exit: 10"
            android.ext.e1.e.a(r1, r3)
            r2.delete()     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r2 = move-exception
            android.ext.e1.e.d(r1, r0, r2)
        L6b:
            java.lang.String r2 = "exit: 11"
            android.ext.e1.e.a(r1, r2)
            boolean r2 = android.ext.Config.vSpaceReal
            if (r2 != 0) goto Lba
            r2 = 45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            r3.<init>()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = "exec am force-stop "
            r3.append(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L8f
            r3.append(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8f
            android.ext.e2.n(r3, r2)     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r3 = move-exception
            android.ext.e1.e.d(r1, r0, r3)
        L93:
            java.lang.String r3 = "exit: 12"
            android.ext.e1.e.a(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r3.<init>()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r4 = "exec am kill "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r4 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> Lb1
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lb1
            android.ext.e2.n(r3, r2)     // Catch: java.lang.Throwable -> Lb1
            goto Lb5
        Lb1:
            r2 = move-exception
            android.ext.e1.e.d(r1, r0, r2)
        Lb5:
            java.lang.String r0 = "exit: 13"
            android.ext.e1.e.a(r1, r0)
        Lba:
            n()
            return
    }

    public static void q(android.content.Context r1) {
            r0 = 0
            r(r1, r0)
            return
    }

    public static void r(android.content.Context r1, java.lang.Runnable r2) {
            android.ext.f1$m r0 = new android.ext.f1$m
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    private static int s() {
            r0 = 1
            float r0 = (float) r0
            r1 = 1183299328(0x4687b700, float:17371.5)
            float r0 = r0 * r1
            r1 = 1150816256(0x44981000, float:1216.5)
            float r0 = r0 - r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            return r0
    }

    private static boolean t() {
            long r0 = android.ext.Config.f30c
            r2 = 64
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L14
            int r0 = android.ext.Config.B
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            return r0
    }

    static android.content.ComponentName u() {
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L10
            java.lang.Class<catch_.me_.if_.you_.can_.Instrumentation> r2 = catch_.me_.if_.you_.can_.Instrumentation.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L10
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = move-exception
            android.ext.e1.a(r0)
            r0 = 0
            return r0
    }

    static java.lang.String v() {
            r0 = 0
            android.content.Context r1 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L48
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L48
            android.content.res.Configuration r2 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L48
            int r3 = r2.screenWidthDp     // Catch: java.lang.Throwable -> L16
            int r0 = r2.screenHeightDp     // Catch: java.lang.Throwable -> L14
            r2 = r0
            r0 = r3
            goto L1d
        L14:
            r2 = move-exception
            goto L18
        L16:
            r2 = move-exception
            r3 = 0
        L18:
            android.ext.e1.a(r2)     // Catch: java.lang.Throwable -> L44
            r0 = r3
            r2 = 0
        L1d:
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r0 != 0) goto L34
            if (r1 == 0) goto L34
            float r4 = r1.density     // Catch: java.lang.Throwable -> L32
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r0 = r1.widthPixels     // Catch: java.lang.Throwable -> L32
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L32
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r1 = move-exception
            goto L4a
        L34:
            if (r2 != 0) goto L4d
            if (r1 == 0) goto L4d
            float r4 = r1.density     // Catch: java.lang.Throwable -> L32
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L4d
            int r1 = r1.heightPixels     // Catch: java.lang.Throwable -> L32
            float r1 = (float) r1
            float r1 = r1 / r4
            int r2 = (int) r1
            goto L4d
        L44:
            r1 = move-exception
            r0 = r3
        L46:
            r2 = 0
            goto L4a
        L48:
            r1 = move-exception
            goto L46
        L4a:
            android.ext.e1.a(r1)
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ""
            r1.append(r3)
            r1.append(r0)
            r0 = 120(0x78, float:1.68E-43)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
    }

    static android.content.DialogInterface.OnClickListener w(long r1) {
            android.ext.f1$h r0 = new android.ext.f1$h
            r0.<init>(r1)
            return r0
    }

    static java.lang.String x() {
            boolean r0 = android.ext.Config.C
            if (r0 == 0) goto L7
            java.lang.String r0 = android.ext.Config.E
            goto L2b
        L7:
            boolean r0 = android.ext.Config.vSpaceReal
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.ext.e2.h(r1)
            r0.append(r1)
            java.lang.String r1 = "@"
            r0.append(r1)
            java.lang.String r1 = android.ext.Config.E
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L2b
        L27:
            java.lang.String r0 = android.ext.e2.h(r1)
        L2b:
            return r0
    }

    public static boolean y() {
            r0 = 0
            boolean r0 = z(r0, r0)
            return r0
    }

    public static boolean z(android.content.Context r2, android.content.DialogInterface.OnDismissListener r3) {
            boolean r0 = android.ext.Config.C
            if (r0 != 0) goto L6
            r2 = 1
            return r2
        L6:
            if (r2 != 0) goto Lc
            android.content.Context r2 = android.ext.Tools.f0()
        Lc:
            android.app.AlertDialog$Builder r2 = android.ext.f.c(r2)
            r0 = 2131296797(0x7f09021d, float:1.821152E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r2 = r2.setMessage(r0)
            r0 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 0
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r0, r1)
            android.app.AlertDialog r2 = r2.create()
            if (r3 == 0) goto L30
            android.ext.f.k(r2, r3)
        L30:
            android.ext.f.m(r2)
            r2 = 0
            return r2
    }
}
