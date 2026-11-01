package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.content.Context f1198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.StringBuilder f1199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.Map f1201d;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.q1 f1202a;

        a(android.ext.q1 r1) {
                r0 = this;
                r0.f1202a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.q1 r0 = r1.f1202a
                r0.b()
                return
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.q1 f1203a;

        b(android.ext.q1 r1) {
                r0 = this;
                r0.f1203a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L1d
                java.lang.String r3 = "android.intent.action.VIEW"
                android.ext.q1 r0 = r1.f1203a     // Catch: java.lang.Throwable -> L1d
                java.lang.String r0 = r0.g()     // Catch: java.lang.Throwable -> L1d
                java.lang.String r0 = android.ext.Tools.removeNewLinesChars(r0)     // Catch: java.lang.Throwable -> L1d
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L1d
                r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L1d
                android.ext.q1 r3 = r1.f1203a     // Catch: java.lang.Throwable -> L1d
                android.content.Context r3 = r3.f1198a     // Catch: java.lang.Throwable -> L1d
                r3.startActivity(r2)     // Catch: java.lang.Throwable -> L1d
                goto L23
            L1d:
                r2 = move-exception
                java.lang.String r3 = "Failed call activity"
                android.ext.e1.s(r3, r2)
            L23:
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog.Builder f1204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.q1 f1205b;

        c(android.ext.q1 r1, android.app.AlertDialog.Builder r2) {
                r0 = this;
                r0.f1205b = r1
                r0.f1204a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.app.AlertDialog$Builder r0 = r2.f1204a     // Catch: java.lang.Throwable -> Ld
                android.app.AlertDialog r0 = r0.create()     // Catch: java.lang.Throwable -> Ld
                android.ext.f.w(r0)     // Catch: java.lang.Throwable -> Ld
                android.ext.Tools.u1(r0)     // Catch: java.lang.Throwable -> Ld
                goto L13
            Ld:
                r0 = move-exception
                java.lang.String r1 = "Failed show miui dialog"
                android.ext.e1.l(r1, r0)
            L13:
                return
        }
    }

    public q1() {
            r3 = this;
            r3.<init>()
            android.ext.r r0 = android.ext.r.n
            r3.f1198a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3.f1199b = r0
            r0 = -1
            r3.f1200c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f1201d = r0
            r1 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "android.permission.SYSTEM_ALERT_WINDOW"
            r0.put(r2, r1)
            return
    }

    private int a() {
            r1 = this;
            r0 = 134217728(0x8000000, float:3.85186E-34)
            return r0
    }

    private int c(int r11) {
            r10 = this;
            android.content.Context r0 = r10.f1198a     // Catch: java.lang.Throwable -> L47
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> L47
            android.content.Context r1 = r10.f1198a     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "appops"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L47
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1     // Catch: java.lang.Throwable -> L47
            java.lang.Class<android.app.AppOpsManager> r2 = android.app.AppOpsManager.class
            java.lang.String r3 = "checkOp"
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L47
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L47
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L47
            r8 = 1
            r5[r8] = r6     // Catch: java.lang.Throwable -> L47
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r9 = 2
            r5[r9] = r6     // Catch: java.lang.Throwable -> L47
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L47
            r3[r7] = r4     // Catch: java.lang.Throwable -> L47
            int r4 = r0.uid     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L47
            r3[r8] = r4     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L47
            r3[r9] = r0     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L47
            int r11 = r0.intValue()     // Catch: java.lang.Throwable -> L47
            return r11
        L47:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MIUI-checkOp("
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ") failed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.e1.g(r1, r0)
            java.lang.StringBuilder r1 = r10.f1199b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\nMIUI-checkOp("
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = ") failed:\n"
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r1.append(r11)
            java.lang.StringBuilder r11 = r10.f1199b
            java.lang.String r0 = android.ext.e1.n(r0)
            r11.append(r0)
            r11 = -1
            return r11
    }

    private boolean d(java.lang.String r5) {
            r4 = this;
            java.lang.StringBuilder r0 = r4.f1199b
            java.lang.String r1 = "\nMIUI-checkPermission "
            r0.append(r1)
            java.lang.StringBuilder r0 = r4.f1199b
            r0.append(r5)
            java.lang.StringBuilder r0 = r4.f1199b
            java.lang.String r1 = " - "
            r0.append(r1)
            java.util.Map r0 = r4.f1201d
            java.lang.Object r5 = r0.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r0 = 1
            if (r5 != 0) goto L26
            java.lang.StringBuilder r5 = r4.f1199b
            java.lang.String r1 = "unknown - "
            r5.append(r1)
            goto L6d
        L26:
            int r1 = r5.intValue()
            r2 = 24
            r3 = 0
            if (r1 != r2) goto L44
            int r1 = r4.f1200c
            r2 = 5
            if (r1 != r2) goto L44
            int r5 = r4.a()
            android.content.Context r1 = r4.f1198a
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            int r1 = r1.flags
            r1 = r1 & r5
            if (r1 != r5) goto L6c
            goto L6d
        L44:
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L4f
            int r5 = r4.c(r5)     // Catch: java.lang.Throwable -> L4f
            if (r5 != 0) goto L6c
            goto L6d
        L4f:
            r5 = move-exception
            java.lang.String r0 = "MIUI-checkPermission failed"
            android.ext.e1.g(r0, r5)
            java.lang.StringBuilder r0 = r4.f1199b
            java.lang.String r1 = "failed:\n"
            r0.append(r1)
            java.lang.StringBuilder r0 = r4.f1199b
            java.lang.String r5 = android.ext.e1.n(r5)
            r0.append(r5)
            java.lang.StringBuilder r5 = r4.f1199b
            r0 = 10
            r5.append(r0)
        L6c:
            r0 = 0
        L6d:
            java.lang.StringBuilder r5 = r4.f1199b
            r5.append(r0)
            return r0
    }

    private void e() {
            r6 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "getprop"
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.Throwable -> L3b
            java.lang.Process r0 = android.ext.Tools.I(r0)     // Catch: java.lang.Throwable -> L3b
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3b
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3b
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r0 = r6.f1199b     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "\ngetprop:\n"
            r0.append(r3)     // Catch: java.lang.Throwable -> L3b
        L21:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto La4
            java.lang.String r3 = "ro.product.device"
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3b
            r4 = -1
            if (r3 == 0) goto L3d
            java.lang.String r3 = "_sprout"
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L3d
            r6.f1200c = r4     // Catch: java.lang.Throwable -> L3b
            goto La4
        L3b:
            r0 = move-exception
            goto La8
        L3d:
            java.lang.String r3 = "fpc.fp.miui."
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3b
            if (r3 != 0) goto L21
            java.lang.String r3 = "ro.ril.miui.imei"
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L4e
            goto L21
        L4e:
            java.lang.String r3 = "miui"
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3b
            if (r3 != 0) goto L5e
            java.lang.String r3 = "MIUI"
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L84
        L5e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r3.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = "MIUI found: "
            r3.append(r5)     // Catch: java.lang.Throwable -> L3b
            r3.append(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3b
            android.ext.e1.d(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r3 = r6.f1199b     // Catch: java.lang.Throwable -> L3b
            r3.append(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r3 = r6.f1199b     // Catch: java.lang.Throwable -> L3b
            r5 = 10
            r3.append(r5)     // Catch: java.lang.Throwable -> L3b
            int r3 = r6.f1200c     // Catch: java.lang.Throwable -> L3b
            if (r3 != r4) goto L84
            r6.f1200c = r2     // Catch: java.lang.Throwable -> L3b
        L84:
            java.lang.String r3 = "ro.miui.ui.version.name"
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L21
            java.lang.String r3 = "V5"
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L97
            r3 = 5
            r6.f1200c = r3     // Catch: java.lang.Throwable -> L3b
        L97:
            java.lang.String r3 = "V6"
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L21
            r0 = 6
            r6.f1200c = r0     // Catch: java.lang.Throwable -> L3b
            goto L21
        La4:
            r1.close()     // Catch: java.lang.Throwable -> L3b
            goto Lbd
        La8:
            java.lang.String r1 = "MIUI-detect"
            android.ext.e1.l(r1, r0)
            java.lang.StringBuilder r1 = r6.f1199b
            java.lang.String r2 = "\nMIUI-detect failed:\n"
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            java.lang.String r0 = android.ext.e1.n(r0)
            r1.append(r0)
        Lbd:
            return
    }

    private void f(java.lang.String r13) {
            r12 = this;
            java.lang.StringBuilder r0 = r12.f1199b
            java.lang.String r1 = "\nMIUI-fixPermission "
            r0.append(r1)
            java.lang.StringBuilder r0 = r12.f1199b
            r0.append(r13)
            java.lang.StringBuilder r0 = r12.f1199b
            java.lang.String r1 = " - "
            r0.append(r1)
            java.util.Map r0 = r12.f1201d
            java.lang.Object r13 = r0.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 != 0) goto L25
            java.lang.StringBuilder r13 = r12.f1199b
            java.lang.String r0 = "unknown"
            r13.append(r0)
            return
        L25:
            int r0 = r13.intValue()
            r1 = 24
            r2 = 10
            java.lang.String r3 = "MIUI-fixPermission failed"
            if (r0 != r1) goto L68
            int r0 = r12.f1200c
            r1 = 5
            if (r0 != r1) goto L68
            android.content.pm.PackageManager r0 = android.ext.Tools.B0()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L4f
            int r4 = r12.a()     // Catch: java.lang.Throwable -> L4f
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r0.setApplicationEnabledSetting(r1, r5, r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r0 = r12.f1199b     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "success 1"
            r0.append(r1)     // Catch: java.lang.Throwable -> L4f
            goto L68
        L4f:
            r0 = move-exception
            android.ext.e1.g(r3, r0)
            java.lang.StringBuilder r1 = r12.f1199b
            java.lang.String r4 = "failed 1:\n"
            r1.append(r4)
            java.lang.StringBuilder r1 = r12.f1199b
            java.lang.String r0 = android.ext.e1.n(r0)
            r1.append(r0)
            java.lang.StringBuilder r0 = r12.f1199b
            r0.append(r2)
        L68:
            android.content.Context r0 = r12.f1198a     // Catch: java.lang.Throwable -> Lb4
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> Lb4
            java.lang.Class<android.app.AppOpsManager> r1 = android.app.AppOpsManager.class
            java.lang.String r4 = "setMode"
            r5 = 4
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lb4
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb4
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> Lb4
            r9 = 1
            r6[r9] = r7     // Catch: java.lang.Throwable -> Lb4
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r11 = 2
            r6[r11] = r10     // Catch: java.lang.Throwable -> Lb4
            r10 = 3
            r6[r10] = r7     // Catch: java.lang.Throwable -> Lb4
            java.lang.reflect.Method r1 = r1.getMethod(r4, r6)     // Catch: java.lang.Throwable -> Lb4
            android.content.Context r4 = r12.f1198a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = "appops"
            java.lang.Object r4 = r4.getSystemService(r6)     // Catch: java.lang.Throwable -> Lb4
            android.app.AppOpsManager r4 = (android.app.AppOpsManager) r4     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lb4
            r5[r8] = r13     // Catch: java.lang.Throwable -> Lb4
            int r13 = r0.uid     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> Lb4
            r5[r9] = r13     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r13 = r0.packageName     // Catch: java.lang.Throwable -> Lb4
            r5[r11] = r13     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lb4
            r5[r10] = r13     // Catch: java.lang.Throwable -> Lb4
            r1.invoke(r4, r5)     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r13 = r12.f1199b     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "success 2"
            r13.append(r0)     // Catch: java.lang.Throwable -> Lb4
            goto Lcd
        Lb4:
            r13 = move-exception
            android.ext.e1.g(r3, r13)
            java.lang.StringBuilder r0 = r12.f1199b
            java.lang.String r1 = "failed 2:\n"
            r0.append(r1)
            java.lang.StringBuilder r0 = r12.f1199b
            java.lang.String r13 = android.ext.e1.n(r13)
            r0.append(r13)
            java.lang.StringBuilder r13 = r12.f1199b
            r13.append(r2)
        Lcd:
            return
    }

    private void i() {
            r6 = this;
            java.lang.StringBuilder r0 = r6.f1199b
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r6.f1199b = r1
            java.lang.String r2 = "MIUI\nGG: "
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            r2 = 1
            float r2 = (float) r2
            r3 = 1122657895(0x42ea6667, float:117.200005)
            float r3 = r3 * r2
            r4 = 1098697933(0x417ccccd, float:15.8)
            float r3 = r3 - r4
            r1.append(r3)
            java.lang.StringBuilder r1 = r6.f1199b
            java.lang.String r3 = " ["
            r1.append(r3)
            java.lang.StringBuilder r1 = r6.f1199b
            r3 = 1183175731(0x4685d433, float:17130.1)
            float r2 = r2 * r3
            r3 = 1148438118(0x4473c666, float:975.1)
            float r2 = r2 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            java.lang.String r2 = "]\nAndroid: "
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            java.lang.String r2 = "\nSDK: "
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            int r2 = android.os.Build.VERSION.SDK_INT
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            java.lang.String r2 = "\nappInfo.flags: "
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "0x"
            r2.append(r3)
            android.content.Context r3 = r6.f1198a
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.flags
            long r3 = (long) r3
            r5 = 8
            java.lang.String r3 = android.ext.t2.e(r5, r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            java.lang.String r2 = "\ncheckOp(OP_SYSTEM_ALERT_WINDOW): "
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            r2 = 24
            int r2 = r6.c(r2)
            r1.append(r2)
            java.lang.StringBuilder r1 = r6.f1199b
            r1.append(r0)
            java.lang.StringBuilder r0 = r6.f1199b
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "[\\r\\n]+"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
        La8:
            if (r2 >= r1) goto Lb2
            r3 = r0[r2]
            android.ext.e1.d(r3)
            int r2 = r2 + 1
            goto La8
        Lb2:
            return
    }

    public void b() {
            r7 = this;
            r7.e()     // Catch: java.lang.Throwable -> L4e
            int r0 = r7.f1200c     // Catch: java.lang.Throwable -> L4e
            r1 = -1
            if (r0 != r1) goto L9
            return
        L9:
            long r0 = android.ext.Config.f30c     // Catch: java.lang.Throwable -> L4e
            r2 = 2
            long r0 = r0 & r2
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L15
            return
        L15:
            java.lang.String r0 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r1 = r7.d(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L97
            r7.f(r0)     // Catch: java.lang.Throwable -> L4e
            android.content.Context r1 = r7.f1198a     // Catch: java.lang.Throwable -> L4e
            android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)     // Catch: java.lang.Throwable -> L4e
            r4 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r4 = android.ext.b2.f(r4)     // Catch: java.lang.Throwable -> L4e
            android.content.DialogInterface$OnClickListener r2 = android.ext.f1.w(r2)     // Catch: java.lang.Throwable -> L4e
            android.app.AlertDialog$Builder r1 = r1.setNeutralButton(r4, r2)     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r7.d(r0)     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L50
            android.ext.z.H(r1)     // Catch: java.lang.Throwable -> L4e
            r0 = 2131296455(0x7f0900c7, float:1.8210827E38)
            java.lang.String r0 = android.ext.b2.f(r0)     // Catch: java.lang.Throwable -> L4e
            android.ext.q1$b r2 = new android.ext.q1$b     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L4e
            r1.setPositiveButton(r0, r2)     // Catch: java.lang.Throwable -> L4e
            goto L79
        L4e:
            r0 = move-exception
            goto L82
        L50:
            r0 = 2131296777(0x7f090209, float:1.821148E38)
            java.lang.String r0 = android.ext.b2.f(r0)     // Catch: java.lang.Throwable -> L4e
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)     // Catch: java.lang.Throwable -> L4e
            r2 = 2131296904(0x7f090288, float:1.8211738E38)
            java.lang.String r2 = android.ext.b2.f(r2)     // Catch: java.lang.Throwable -> L4e
            android.ext.p0 r3 = new android.ext.p0     // Catch: java.lang.Throwable -> L4e
            r4 = 1200(0x4b0, float:1.682E-42)
            r5 = 1
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L4e
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r3)     // Catch: java.lang.Throwable -> L4e
            r2 = 2131296805(0x7f090225, float:1.8211537E38)
            java.lang.String r2 = android.ext.b2.f(r2)     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            r0.setNegativeButton(r2, r3)     // Catch: java.lang.Throwable -> L4e
        L79:
            android.ext.q1$c r0 = new android.ext.q1$c     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L4e
            android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L4e
            goto L97
        L82:
            java.lang.String r1 = "MIUI-check"
            android.ext.e1.l(r1, r0)
            java.lang.StringBuilder r1 = r7.f1199b
            java.lang.String r2 = "\nMIUI-check failed:\n"
            r1.append(r2)
            java.lang.StringBuilder r1 = r7.f1199b
            java.lang.String r0 = android.ext.e1.n(r0)
            r1.append(r0)
        L97:
            r7.i()
            return
    }

    java.lang.String g() {
            r2 = this;
            int r0 = r2.f1200c
            r1 = 6
            if (r0 == r1) goto L8
            java.lang.String r0 = "kwws=22zzz1|rxwxeh1frp2zdwfkBy@3[{m:N}:ZmT"
            goto La
        L8:
            java.lang.String r0 = "kwws=22zzz1|rxwxeh1frp2zdwfkBy@k]ifLW:7SV;"
        La:
            return r0
    }

    public void h() {
            r3 = this;
            android.ext.g0 r0 = new android.ext.g0
            android.ext.q1$a r1 = new android.ext.q1$a
            r1.<init>(r3)
            java.lang.String r2 = "runCheck"
            r0.<init>(r1, r2)
            r0.start()
            return
    }
}
