package android.ext;

/* JADX INFO: loaded from: classes.dex */
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
            RunnableC0018a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zStartInstrumentation;
                boolean z = false;
                try {
                    if (!android.ext.Config.vSpaceReal && android.ext.Config.z == 0) {
                        android.content.ComponentName componentNameU = android.ext.f1.u();
                        if (componentNameU != null) {
                            android.ext.e1.d("Try instr: " + android.os.Process.myUid());
                            android.ext.f1.f((byte) 0);
                            try {
                                zStartInstrumentation = android.ext.r.p.startInstrumentation(componentNameU, null, android.ext.r.u());
                                android.ext.f1.f((byte) 1);
                                android.ext.e1.d("Fail instr: " + android.os.Process.myUid());
                            } catch (java.lang.Throwable th) {
                                th = th;
                                z = true;
                                android.ext.e1.l("Failed load Instrumentation", th);
                                if (z) {
                                    android.ext.f1.f((byte) 1);
                                }
                            }
                        }
                        android.ext.f1.B(3, "" + zStartInstrumentation + ' ' + android.ext.Config.z);
                        android.ext.f1.B(6, null);
                        android.ext.f1.I();
                    }
                    android.ext.f1.i();
                    zStartInstrumentation = false;
                    android.ext.f1.B(3, "" + zStartInstrumentation + ' ' + android.ext.Config.z);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
                android.ext.f1.B(6, null);
                android.ext.f1.I();
            }
        }

        a() {
        }

        /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
            java.util.ConcurrentModificationException
            	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
            	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
            	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
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
                r0.<init>()
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
            */
            throw new UnsupportedOperationException("Method not decompiled: android.ext.f1.a.run():void");
        }
    }

    class b implements java.lang.Runnable {

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.StringBuilder f956a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ java.lang.String f957b;

            a(java.lang.StringBuilder sb, java.lang.String str) {
                this.f956a = sb;
                this.f957b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.view.View viewF = gga.d.f(catch_.me_.if_.you_.can_.R.layout.main_new_version, null);
                android.ext.Tools.v1((android.widget.TextView) viewF.findViewById(catch_.me_.if_.you_.can_.R.id.changelog), this.f956a.toString());
                android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.h0(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.found_new_version), this.f957b))).setView(viewF).setCancelable(false).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.download_it), new android.ext.r.n(null)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bytes;
            java.io.BufferedReader bufferedReader;
            java.lang.StringBuilder sb;
            int iE;
            int iE2;
            java.lang.String str;
            java.lang.String str2;
            try {
                android.ext.f1.f951a = java.lang.Boolean.FALSE;
                java.lang.String str3 = "" + ((1 * 112.0f) - 10.6f);
                java.lang.String str4 = null;
                try {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    android.content.SharedPreferences sharedPreferencesM0 = android.ext.Tools.M0();
                    for (int i = 0; i < 4; i++) {
                        java.lang.String str5 = "used-" + i;
                        if (sharedPreferencesM0.contains(str5)) {
                            java.lang.String string = sharedPreferencesM0.getString(str5, "");
                            if (string.length() != 0) {
                                if (sb2.length() != 0) {
                                    sb2.append('&');
                                }
                                sb2.append(i);
                                sb2.append('=');
                                sb2.append(string);
                            }
                        }
                    }
                    android.content.SharedPreferences.Editor editorEdit = sharedPreferencesM0.edit();
                    for (int i2 = 0; i2 < 4; i2++) {
                        editorEdit.remove("used-" + i2);
                    }
                    editorEdit.commit();
                    bytes = sb2.toString().getBytes();
                    while (true) {
                        java.lang.String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (str4 == null) {
                            str4 = line;
                        }
                        if ("".equals(str)) {
                            if (android.ext.h0.e(line) <= iE) {
                                break;
                            } else {
                                str2 = line;
                            }
                        }
                        sb.append(line);
                        sb.append('\n');
                        if (line.contains("ARMv5") && android.ext.h0.e(str2) > iE2) {
                            try {
                                android.ext.i.f999a = java.lang.Float.parseFloat(str2);
                                iE2 = android.ext.h0.e(str2);
                            } catch (java.lang.NumberFormatException e2) {
                                android.ext.e1.s("Failed parse as float '" + str2 + "'", e2);
                            }
                        }
                        str = line;
                    }
                } catch (java.lang.Throwable th) {
                    android.ext.e1.a(th);
                    bytes = null;
                }
                java.net.URLConnection uRLConnectionOpenConnection = new java.net.URL(android.ext.Tools.L1(android.ext.Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2JJborjv2yhuvlrq1sksBv@(g)y@(v)o@(v)w@(v)d@(g)r@(v)x@(v"), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), str3, android.ext.k.b(), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.lang_code), java.lang.Integer.valueOf(android.ext.e0.f()), android.ext.f1.v(), android.ext.f1.x()) + android.ext.p1.d() + android.ext.ConfigListAdapter.i()).openConnection();
                if (bytes != null) {
                    try {
                        uRLConnectionOpenConnection.setDoOutput(true);
                        java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(uRLConnectionOpenConnection.getOutputStream());
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        android.ext.e1.a(th2);
                    }
                }
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(uRLConnectionOpenConnection.getInputStream()));
                sb = new java.lang.StringBuilder();
                iE = android.ext.h0.e(str3);
                iE2 = android.ext.h0.e(java.lang.Float.toString(android.ext.i.f999a));
                str = "";
                str2 = null;
                bufferedReader.close();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append("Server version: ");
                sb3.append(str4 != null ? str4 + ' ' + android.ext.h0.e(str4) : "null");
                android.ext.e1.d(sb3.toString());
                if (str4 == null || android.ext.h0.e(str4) <= iE) {
                    return;
                }
                android.ext.f1.f951a = java.lang.Boolean.TRUE;
                android.ext.n2.i(new android.ext.f1.b.a(sb, str4));
            } catch (java.lang.Throwable th3) {
                android.ext.e1.l("checkNewVersion", th3);
            }
        }
    }

    class c implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.io.File f959a;

        c(java.io.File file) {
            this.f959a = file;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            this.f959a.delete();
            if (i != 0) {
                return;
            }
            android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.selinux).f42d = 1;
            android.ext.Config.k();
            android.ext.r.I();
        }
    }

    class d implements android.content.DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.ConfigListAdapter.t(catch_.me_.if_.you_.can_.R.string.help_force_close_title);
        }
    }

    class e implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f961b;

        class a implements android.content.DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                int i2;
                if (i == 0) {
                    i2 = catch_.me_.if_.you_.can_.R.id.config_prevent_unload;
                } else if (i != 1) {
                    return;
                } else {
                    i2 = catch_.me_.if_.you_.can_.R.id.config_ram;
                }
                android.ext.Config.b(i2).b();
            }
        }

        class b implements android.content.DialogInterface.OnDismissListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface dialogInterface) {
                android.ext.f1.e.this.f961b.run();
            }
        }

        e(boolean[] zArr, java.lang.Runnable runnable) {
            this.f960a = zArr;
            this.f961b = runnable;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            this.f960a[0] = true;
            android.app.AlertDialog alertDialogCreate = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.fix_it)).setItems(new java.lang.String[]{android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_prevent_unload).toString(), android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_ram).toString()}, new android.ext.f1.e.a()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null).create();
            if (this.f961b != null) {
                android.ext.f.k(alertDialogCreate, new android.ext.f1.e.b());
            }
            android.ext.f.m(alertDialogCreate);
        }
    }

    class f implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f965b;

        f(boolean[] zArr, java.lang.Runnable runnable) {
            this.f964a = zArr;
            this.f965b = runnable;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            if (this.f964a[0]) {
                return;
            }
            this.f965b.run();
        }
    }

    class g implements java.lang.Runnable {

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.content.SharedPreferences f966a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ java.lang.String f967b;

            a(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
                this.f966a = sharedPreferences;
                this.f967b = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                if (i == -1) {
                    new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:8770li0|rx0zdqw0wr0dgg0d0qhz0wudqvodwlrq0ru0lpsuryh0dq0h{lvwlqj2").onClick(dialogInterface, i);
                }
                this.f966a.edit().putString("improve-translate", this.f967b).commit();
            }
        }

        class b implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.content.DialogInterface.OnClickListener f969a;

            b(android.content.DialogInterface.OnClickListener onClickListener) {
                this.f969a = onClickListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.ext.f.o(android.ext.f.b().setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.improve_translation_)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.site), this.f969a).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), this.f969a));
            }
        }

        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.content.SharedPreferences sharedPreferencesM0 = android.ext.Tools.M0();
                java.lang.String string = sharedPreferencesM0.getString("improve-translate", "");
                java.lang.String str = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.version_number) + ':' + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.lang_code);
                if (str.equals(string)) {
                    return;
                }
                if (android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.front_text).contains(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.improve_translation_en))) {
                    android.ext.n2.i(new android.ext.f1.g.b(new android.ext.f1.g.a(sharedPreferencesM0, str)));
                }
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("checkAutoTranslation", th);
            }
        }
    }

    class h implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f971a;

        h(long j) {
            this.f971a = j;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.Config.f30c |= this.f971a;
            android.ext.Config.k();
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f974c;

        i(android.content.Context context, java.lang.String str, long j) {
            this.f972a = context;
            this.f973b = str;
            this.f974c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.content.Context contextF0 = this.f972a;
                if (contextF0 == null) {
                    contextF0 = android.ext.Tools.f0();
                }
                android.app.AlertDialog alertDialogCreate = android.ext.f.c(contextF0).setMessage(this.f973b).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), android.ext.f1.w(this.f974c)).create();
                android.ext.f.m(alertDialogCreate);
                android.ext.Tools.u1(alertDialogCreate);
            } catch (java.lang.Throwable th) {
                android.ext.e1.a(th);
            }
        }
    }

    class j implements java.lang.Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((android.ext.Config.f30c & 16) == 0 && android.ext.Config.vSpaceReal && android.ext.b1.B0()) {
                android.ext.n2.i(android.ext.f1.J(android.ext.r.p, android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.need_random_name), 16L, false));
            }
        }
    }

    class k implements java.lang.Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.String strF;
            if ((android.ext.Config.f30c & 32) != 0) {
                return;
            }
            java.lang.String[] strArr = {"/system/priv-app/com.bluestacks.settings", "/system/priv-app/com.bluestacks.settings/com.bluestacks.settings.apk", "/system/priv-app/com.bluestacks.bstfolder", "/system/priv-app/com.bluestacks.bstfolder/com.bluestacks.bstfolder.apk", "/system/priv-app/com.bluestacks.BstCommandProcessor", "/system/priv-app/com.bluestacks.BstCommandProcessor/com.bluestacks.BstCommandProcessor.apk", "/boot/android/android/system/priv-app/com.bluestacks.settings", "/boot/android/android/system/priv-app/com.bluestacks.settings/com.bluestacks.settings.apk", "/boot/android/android/system/priv-app/com.bluestacks.bstfolder", "/boot/android/android/system/priv-app/com.bluestacks.bstfolder/com.bluestacks.bstfolder.apk", "/boot/android/android/system/priv-app/com.bluestacks.BstCommandProcessor", "/boot/android/android/system/priv-app/com.bluestacks.BstCommandProcessor/com.bluestacks.BstCommandProcessor.apk", "/storage/emulated/0/Android/data/com.bluestacks.settings", "/storage/emulated/0/Android/data/com.bluestacks.home", "/mnt/runtime/write/emulated/0/Android/data/com.bluestacks.settings", "/mnt/runtime/write/emulated/0/Android/data/com.bluestacks.home", "/mnt/runtime/read/emulated/0/Android/data/com.bluestacks.settings", "/mnt/runtime/read/emulated/0/Android/data/com.bluestacks.home", "/mnt/runtime/default/emulated/0/Android/data/com.bluestacks.settings", "/mnt/runtime/default/emulated/0/Android/data/com.bluestacks.home", "/data/.bluestacks.prop", "/data/misc/profiles/cur/0/com.bluestacks.settings", "/data/misc/profiles/cur/0/com.bluestacks.BstCommandProcessor", "/data/misc/profiles/cur/0/com.bluestacks.appmart", "/data/misc/profiles/cur/0/com.bluestacks.bstfolder", "/data/misc/profiles/cur/0/com.bluestacks.home", "/data/misc/profiles/cur/0/com.bluestacks.filemanager", "/data/misc/profiles/cur/0/com.bluestacks.appguidance", "/data/misc/profiles/ref/com.bluestacks.settings", "/data/misc/profiles/ref/com.bluestacks.BstCommandProcessor", "/data/misc/profiles/ref/com.bluestacks.appmart", "/data/misc/profiles/ref/com.bluestacks.bstfolder", "/data/misc/profiles/ref/com.bluestacks.home", "/data/misc/profiles/ref/com.bluestacks.filemanager", "/data/misc/profiles/ref/com.bluestacks.appguidance", "/data/media/0/Android/data/com.bluestacks.settings", "/data/media/0/Android/data/com.bluestacks.home", "/data/data/com.bluestacks.settings", "/data/data/com.bluestacks.BstCommandProcessor", "/data/data/com.bluestacks.appmart", "/data/data/com.bluestacks.bstfolder", "/data/data/com.bluestacks.home", "/data/data/com.bluestacks.filemanager", "/data/data/com.bluestacks.appguidance", "/data/downloads/com.bluestacks.appmart", "/data/downloads/com.bluestacks.home", "/data/downloads/com.bluestacks.filemanager", "/data/app-lib/com.bluestacks.settings", "/data/app-lib/com.bluestacks.BstCommandProcessor", "/data/app-lib/com.bluestacks.appmart", "/data/app-lib/com.bluestacks.bstfolder", "/data/app-lib/com.bluestacks.home", "/data/app-lib/com.bluestacks.filemanager", "/data/user_de/0/com.bluestacks.settings", "/data/user_de/0/com.bluestacks.BstCommandProcessor", "/data/user_de/0/com.bluestacks.appmart", "/data/user_de/0/com.bluestacks.bstfolder", "/data/user_de/0/com.bluestacks.home", "/data/user_de/0/com.bluestacks.filemanager", "/data/user_de/0/com.bluestacks.appguidance", "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.BstCommandProcessor@com.bluestacks.BstCommandProcessor.apk@classes.dex", "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.bstfolder@com.bluestacks.bstfolder.apk@classes.dex", "/data/dalvik-cache/x86/data@downloads@com.bluestacks.appmart@com.bluestacks.appmart.apk@classes.dex", "/data/dalvik-cache/x86/data@downloads@com.bluestacks.filemanager@com.bluestacks.filemanager.apk@classes.dex", "/data/dalvik-cache/x86/data@downloads@com.bluestacks.home@com.bluestacks.home.apk@classes.dex", "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.settings@com.bluestacks.settings.apk@classes.dex", "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.BstCommandProcessor@com.bluestacks.BstCommandProcessor.apk@classes.dex", "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.bstfolder@com.bluestacks.bstfolder.apk@classes.dex", "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.appmart@com.bluestacks.appmart.apk@classes.dex", "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.filemanager@com.bluestacks.filemanager.apk@classes.dex", "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.home@com.bluestacks.home.apk@classes.dex", "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.settings@com.bluestacks.settings.apk@classes.dex", "/system/lib64/libbstfolder_jni.so", "/system/lib64/egl/libGLES_bst.so", "/system/lib64/hw/gralloc.bst.so", "/system/lib/libbstfolder_jni.so", "/system/lib/egl/libGLES_bst.so", "/system/lib/hw/gralloc.bst.so", "/system/bin/bstsvcmgrtest", "/system/bin/bstshutdown_core", "/system/bin/bstfolderd", "/system/bin/bstfolder_ctl", "/system/bin/bstime", "/system/bin/bstsyncfs", "/system/bin/bstshutdown", "/system/xbin/bstk", "/storage/emulated/0/.bstshutdown_sync", "/mnt/runtime/write/emulated/0/.bstshutdown_sync", "/mnt/runtime/read/emulated/0/.bstshutdown_sync", "/mnt/runtime/default/emulated/0/.bstshutdown_sync", "/data/media/0/.bstshutdown_sync", "/data/downloads/.bstABI2Apps", "/sys/devices/virtual/bstsensor", "/sys/devices/virtual/misc/bst_ime", "/sys/devices/virtual/misc/bst_gps", "/sys/devices/virtual/misc/bstpgaipc", "/sys/class/bstsensor", "/sys/class/misc/bst_ime", "/sys/class/misc/bst_gps", "/sys/class/misc/bstpgaipc", "/sys/bus/pci/drivers/bstsensor", "/sys/bus/pci/drivers/bstvideo", "/sys/bus/pci/drivers/bstaudio", "/sys/bus/pci/drivers/bstcamera", "/sys/bus/pci/drivers/bstinput", "/sys/bus/pci/drivers/bstpgaipc", "/sys/module/bstsensor", "/sys/module/bstvideo", "/sys/module/bstaudio", "/sys/module/bstcamera", "/sys/module/videobuf_core/holders/bstcamera", "/sys/module/bstinput", "/sys/module/bstpgaipc", "/proc/irq/16/bstcamera", "/proc/irq/17/bstaudio", "/proc/irq/18/bstinput", "/proc/irq/22/bstpgaipc", "/proc/irq/23/bstsensor", "/proc/bstid", "/proc/asound/bstaudio", "/proc/bstfolder_exports", "/boot/android/android/system/lib64/egl/libGLES_bst.so", "/boot/android/android/system/lib64/hw/gralloc.bst.so", "/boot/android/android/system/lib/egl/libGLES_bst.so", "/boot/android/android/system/lib/hw/gralloc.bst.so", "/boot/android/android/system/bin/bstsvcmgrtest", "/boot/android/android/system/bin/bstshutdown_core", "/boot/android/android/system/bin/bstfolderd", "/boot/android/android/system/bin/bstfolder_ctl", "/boot/android/android/system/bin/bstime", "/boot/android/android/system/bin/bstsyncfs", "/boot/android/android/system/bin/bstshutdown", "/boot/android/android/system/xbin/bstk", "/boot/bstsetup.env", "/boot/bstmods", "/dev/bstpgaipc", "/dev/bst_gps", "/dev/bst_ime", "/dev/bstgyro", "/dev/bstorie", "/dev/bstmegn", "/dev/bstacce", "/dev/socket/bstfolderd"};
            int i = 0;
            while (true) {
                if (i >= 143) {
                    strF = null;
                    break;
                } else {
                    if (new java.io.File(strArr[i]).exists()) {
                        strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.bluestacks);
                        break;
                    }
                    i++;
                }
            }
            if (strF == null) {
                return;
            }
            android.ext.n2.d().postDelayed(android.ext.f1.J(null, android.ext.Tools.L1(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.slow_emulator), strF) + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fast_emulators), 32L, true), 30000L);
        }
    }

    class l implements java.lang.Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((android.ext.Config.f30c & 8) != 0) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String[] strArrE = android.ext.n0.e();
            for (int i = 2; i < strArrE.length; i += 2) {
                java.lang.String str = strArrE[i];
                int i2 = i + 1;
                if (android.ext.Tools.e1(strArrE[i2])) {
                    sb.append('\n');
                    sb.append(str);
                    sb.append(" (");
                    sb.append(strArrE[i2]);
                    sb.append(')');
                }
            }
            if (sb.length() == 0) {
                return;
            }
            sb.append('\n');
            android.ext.n2.i(android.ext.f1.J(android.ext.r.p, android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.killers_found), sb.toString()), 8L, false));
        }
    }

    class m implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f976b;

        class a implements android.content.DialogInterface.OnDismissListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface dialogInterface) {
                android.ext.f1.m.this.f976b.run();
            }
        }

        m(android.content.Context context, java.lang.Runnable runnable) {
            this.f975a = context;
            this.f976b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.app.AlertDialog alertDialogCreate = android.ext.f.c(this.f975a).setMessage(android.ext.b2.g("     15. __help_faq_15_q__\r\n        __help_faq_15_a__\r\n\r\n     16. __help_faq_16_q__\r\n        __help_faq_16_a__\r\n\r\n     17. __help_faq_17_q__\r\n        __help_faq_17_a__\r\n\r\n__rtfm__")).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null).create();
                if (this.f976b != null) {
                    android.ext.f.k(alertDialogCreate, new android.ext.f1.m.a());
                }
                android.ext.f.m(alertDialogCreate);
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed faq alert", th);
            }
        }
    }

    class n implements java.lang.Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.e1.e.a("AndroidService", "wait 4");
            android.ext.n2.d().removeCallbacks(this);
            android.ext.f1.p();
        }
    }

    class o implements java.lang.Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.content.Context contextF0 = android.ext.Tools.f0();
                android.content.ComponentName componentNameU = android.ext.f1.u();
                android.ext.e1.e.a("AndroidService", "Restart: true " + android.ext.Config.z + ' ' + componentNameU);
                if (!android.ext.Config.vSpaceReal && android.ext.Config.z == 0 && componentNameU != null && contextF0.startInstrumentation(componentNameU, null, android.ext.r.u())) {
                    android.ext.e1.e.a("AndroidService", "Restart 1");
                }
                android.ext.e1.e.a("AndroidService", "Restart 2");
                java.lang.String strC0 = android.ext.Tools.C0();
                java.lang.String strT = android.ext.r.t();
                android.ext.Tools.w1(200, new android.content.ComponentName(strC0, strT), 1);
                android.content.Intent intentN0 = android.ext.Tools.N0(contextF0, strC0, strT);
                android.ext.e1.d("Restart: " + intentN0);
                ((android.app.AlarmManager) contextF0.getSystemService("alarm")).set(1, java.lang.System.currentTimeMillis() + 1000, android.app.PendingIntent.getActivity(contextF0, 123456, intentN0, 268435456));
                android.ext.f1.n();
            } catch (java.lang.Throwable th) {
                throw new java.lang.RuntimeException("Failed restart", th);
            }
        }
    }

    static boolean A() {
        java.lang.Throwable th;
        boolean z;
        java.lang.String str;
        android.ext.v.f1278b = true;
        try {
            android.content.ComponentName componentNameStartService = android.ext.r.p.startService(new android.content.Intent().setClassName(android.ext.Tools.C0(), catch_.me_.if_.you_.can_.AnalyticsService.class.getName()));
            z = componentNameStartService != null;
            if (componentNameStartService == null) {
                str = null;
            } else {
                try {
                    str = componentNameStartService.toString() + ' ' + componentNameStartService.toShortString();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    android.ext.e1.l("Failed load Service", th);
                }
            }
            B(10, str);
        } catch (java.lang.Throwable th3) {
            th = th3;
            z = false;
        }
        return z;
    }

    static void B(int i2, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("main ");
        sb.append(i2);
        sb.append(':');
        sb.append(android.os.Process.myUid());
        sb.append(": ");
        sb.append(android.ext.u.c());
        sb.append(' ');
        sb.append(android.ext.r.n == null ? null : java.lang.Boolean.valueOf(android.ext.r.n.f1206d));
        sb.append(' ');
        sb.append(android.ext.u.f1267b);
        sb.append(' ');
        sb.append(android.ext.v.f1277a);
        sb.append(' ');
        sb.append(str);
        android.ext.e1.d(sb.toString());
    }

    private static void C() {
        try {
            java.io.File file = new java.io.File(android.ext.Tools.q0(), "client_exit");
            if (file.exists() || file.createNewFile()) {
                return;
            }
            android.ext.e1.e.a("AndroidService", "Failed mark client exit");
        } catch (java.lang.Throwable th) {
            android.ext.e1.e.a("AndroidService", "Failed mark client exit: " + th);
        }
    }

    public static void D() {
        android.ext.r.n.L(2);
        if (f954d) {
            return;
        }
        f954d = true;
        android.ext.h0.i();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GG started: ");
        float f2 = 1;
        sb.append((108.9f * f2) - 7.5f);
        sb.append(" (");
        sb.append((int) (((f2 * 16916.8f) - 761.8f) + 0.5f));
        sb.append(") on ");
        sb.append(android.ext.h0.b());
        android.ext.e1.h(sb.toString());
        new android.ext.r0(false);
        new android.ext.h2(0L, 0L, 0);
        if (!android.ext.s1.E()) {
            android.ext.r.n.m();
            android.ext.z.m();
        }
        android.ext.t.c();
        android.ext.y0.e();
        new android.ext.q1().h();
        h();
        android.ext.n0.b();
        B(5, null);
        b();
        l();
        c();
        j();
        g();
        k();
        if (!android.ext.s1.E()) {
            d(false);
        }
        android.ext.c1.g();
        android.ext.p2.i();
        android.ext.ConfigListAdapter.j(3);
    }

    private static java.lang.String E() {
        java.io.File file = new java.io.File(android.ext.Tools.q0(), "FC.txt");
        if (!file.exists()) {
            return null;
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                byte[] bArr = new byte[41];
                int i2 = fileInputStream.read(bArr);
                return i2 > 0 ? new java.lang.String(bArr, 0, i2) : null;
            } finally {
                fileInputStream.close();
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.l("Fail get FC file", th);
            return null;
        }
    }

    static void F() {
        if (t()) {
            return;
        }
        boolean zQ = android.ext.s1.Q();
        java.lang.String strE = E();
        boolean zC = android.ext.s0.c(android.ext.s0.a(strE), android.ext.s0.e(strE), s(), m());
        d(true);
        a();
        if (!zC || zQ) {
            return;
        }
        android.ext.s1.v(4, "");
    }

    static boolean G(java.lang.Runnable runnable) {
        return e(false, runnable);
    }

    public static void H() {
        if (f953c == 0) {
            return;
        }
        android.ext.n2.i(new android.ext.f1.o());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0026 -> B:16:0x0029). Please report as a decompilation issue!!! */
    static void I() {
        android.content.Context baseContext;
        android.content.Context context = null;
        try {
            int i2 = android.ext.Config.z;
            if (i2 == 2) {
                baseContext = android.ext.r.n.createPackageContext(android.ext.r.n.getPackageName(), 3);
            } else if (i2 != 3) {
                baseContext = i2 != 4 ? null : android.ext.r.n.getBaseContext();
            } else {
                baseContext = android.ext.r.o;
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
        android.ext.e1.d("setContext: " + android.ext.Config.z + ' ' + baseContext);
        if (baseContext != null) {
            try {
                ((gga.d) gga.f.a(android.view.LayoutInflater.from(baseContext))).inflate(catch_.me_.if_.you_.can_.R.layout.service_dialog, (android.view.ViewGroup) null);
            } catch (java.lang.Throwable th2) {
                android.ext.e1.s("Failed use context: " + baseContext, th2);
            }
        }
        context = baseContext;
        if (context != null) {
            android.ext.Tools.X0(context);
            android.ext.MainService.context = android.ext.l2.i(context);
            O();
            D();
            return;
        }
        android.ext.v.f1280d = true;
        if (A()) {
            return;
        }
        android.ext.Tools.J1(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.could_not_use) + ": " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.service));
        android.ext.r.n.T();
    }

    static java.lang.Runnable J(android.content.Context context, java.lang.String str, long j2, boolean z) {
        return new android.ext.f1.i(context, str, j2);
    }

    public static void K() {
        android.ext.n2.i(new android.ext.f1.a());
    }

    static void L() {
        android.ext.r.n.L(1);
        android.ext.b1.z1();
    }

    static void M() {
        android.ext.z0.h();
    }

    private static boolean N() {
        boolean zStopService = false;
        try {
            android.content.Context contextF0 = android.ext.Tools.f0();
            if (contextF0 != null) {
                zStopService = contextF0.stopService(new android.content.Intent().setClassName(android.ext.Tools.C0(), catch_.me_.if_.you_.can_.AnalyticsService.class.getName()));
                B(100, " " + zStopService);
            } else {
                B(101, "");
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.l("Failed unload Service", th);
        }
        return zStopService;
    }

    static void O() {
        if (android.ext.Config.z == 1) {
            return;
        }
        if ((android.ext.Config.B & 256) != 0) {
            A();
        } else {
            N();
        }
    }

    private static void P(java.io.File file) {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                fileOutputStream.write(android.ext.s0.b(s(), m()).getBytes());
            } finally {
                fileOutputStream.close();
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.l("Fail set FC file", th);
        }
    }

    static void a() {
        if (t()) {
            return;
        }
        java.io.File file = new java.io.File(android.ext.Tools.q0(), "FC.txt");
        if (file.exists()) {
            return;
        }
        P(file);
    }

    public static void b() {
        new android.ext.g0(new android.ext.f1.g(), "checkAutoTranslation").start();
    }

    private static void c() {
        new android.ext.g0(new android.ext.f1.l(), "checkBadApps").start();
    }

    private static void d(boolean z) {
        e(z, null);
    }

    private static boolean e(boolean z, java.lang.Runnable runnable) {
        boolean z2 = false;
        if (t()) {
            return false;
        }
        java.io.File file = new java.io.File(android.ext.Tools.q0(), "FC.txt");
        if (z) {
            file.delete();
            return false;
        }
        java.lang.String strE = E();
        if (android.ext.s0.c(android.ext.s0.a(strE), android.ext.s0.e(strE), s(), m())) {
            z2 = true;
            boolean[] zArr = new boolean[1];
            android.app.AlertDialog alertDialogCreate = android.ext.f.b().setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.force_close_)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it), new android.ext.f1.e(zArr, runnable)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), w(64L)).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.help), new android.ext.f1.d()).create();
            if (runnable != null) {
                android.ext.f.k(alertDialogCreate, new android.ext.f1.f(zArr, runnable));
            }
            android.ext.f.m(alertDialogCreate);
        }
        file.delete();
        P(file);
        return z2;
    }

    static void f(byte b2) {
        java.io.File file = new java.io.File(android.ext.Tools.q0(), "instr.check");
        int i2 = (int) (((1 * 16258.4f) - 103.4f) + 0.5f);
        if (b2 == 0) {
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                try {
                    fileOutputStream.write(java.lang.Integer.toString(i2).getBytes());
                    return;
                } finally {
                    fileOutputStream.close();
                }
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Fail set instr file", th);
                return;
            }
        }
        if (b2 == 1) {
            if (!file.exists()) {
                android.ext.e1.i("No instr file: " + file);
            }
        } else {
            if (!file.exists()) {
                return;
            }
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                try {
                    byte[] bArr = new byte[12];
                    int i3 = fileInputStream.read(bArr);
                    if ((i3 > 0 ? java.lang.Integer.parseInt(new java.lang.String(bArr, 0, i3)) : 0) == i2 && android.ext.Config.z == 0) {
                        android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_context_source).f42d = 1;
                        android.ext.Config.k();
                    }
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    fileInputStream.close();
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                android.ext.e1.l("Fail get instr file", th3);
            }
        }
        file.delete();
    }

    private static void g() {
        if ((android.ext.Config.f30c & 128) != 0) {
            return;
        }
        try {
            java.lang.String strL1 = android.ext.Tools.L1("%e", java.lang.Float.valueOf(1.2E34f));
            if (strL1.indexOf(101) == -1 && strL1.indexOf(69) == -1 && strL1.indexOf(1077) == -1 && strL1.indexOf(1045) == -1) {
                android.ext.n2.i(J(android.ext.r.p, android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.wrong_float_), java.lang.Float.toString(1.2E34f), strL1), 128L, false));
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
    }

    private static void h() {
        new android.ext.g0(new android.ext.f1.b(), "checkNewVersion").start();
    }

    static void i() {
        if (android.ext.Tools.e1("com.chaozhuo.permission.controller") && (android.ext.Config.f30c & 4) == 0) {
            android.ext.n2.i(J(android.ext.r.p, android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.need_allow_background) + "\n\n" + android.ext.Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25<70krz0wr0uxq0lq0skrhql{rv0jdphjxdugldq2"), 4L, true));
        }
    }

    private static void j() {
        new android.ext.g0(new android.ext.f1.j(), "checkRandomName").start();
    }

    private static void k() {
        java.io.File file = new java.io.File(android.ext.Tools.q0(), "sel.txt");
        try {
            if (file.exists()) {
                if ((android.ext.Config.A & 4) != 0) {
                    file.delete();
                } else {
                    d(true);
                    android.ext.f.m(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.last_run_failed)).setItems(new java.lang.String[]{android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.work_with_selinux), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip)}, new android.ext.f1.c(file)).create());
                }
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
    }

    private static void l() {
        new android.ext.g0(new android.ext.f1.k(), "checkSlowEmulator").start();
    }

    private static long m() {
        try {
            android.content.pm.PackageInfo packageInfoA0 = android.ext.Tools.A0(android.ext.Tools.C0(), 0);
            if (packageInfoA0 != null) {
                return packageInfoA0.lastUpdateTime;
            }
            return -1L;
        } catch (java.lang.Throwable th) {
            android.ext.e1.l("Fail get package info", th);
            return -1L;
        }
    }

    public static void n() {
        C();
        N();
        android.ext.e1.e.a("AndroidService", "Main: die");
        try {
            java.lang.System.exit(0);
        } catch (java.lang.Throwable th) {
            android.ext.e1.e.d("AndroidService", "OnExit", th);
        }
        android.ext.e1.e.a("AndroidService", "exit: 14");
        try {
            java.lang.Runtime.getRuntime().halt(0);
        } catch (java.lang.Throwable th2) {
            android.ext.e1.e.d("AndroidService", "OnExit", th2);
        }
        android.ext.e1.e.a("AndroidService", "exit: 15");
        try {
            android.os.Process.killProcess(android.os.Process.myPid());
        } catch (java.lang.Throwable th3) {
            android.ext.e1.e.d("AndroidService", "OnExit", th3);
        }
        android.ext.e1.e.a("AndroidService", "exit: 16");
        try {
            android.ext.e2.n("exec kill " + android.os.Process.myPid(), 45);
        } catch (java.lang.Throwable th4) {
            android.ext.e1.e.d("AndroidService", "OnExit", th4);
        }
        android.ext.e1.e.a("AndroidService", "exit: 17");
        throw new android.ext.n0.h("Failed exit from the app normally");
    }

    public static void o() {
        android.ext.e1.d("Main: exit");
        boolean z = true;
        f952b = true;
        try {
            if (android.ext.MainService.instance != null) {
                android.ext.MainService.instance.m1(true);
                android.ext.MainService.instance.a0();
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.s("Exception on exit", th);
        }
        android.ext.e1.e.a("AndroidService", "exit: 1");
        new java.io.File(android.ext.Tools.q0(), "sel.txt").delete();
        d(true);
        android.ext.e1.e.a("AndroidService", "exit: 2");
        try {
            android.ext.e1.b();
        } catch (java.lang.Throwable th2) {
            android.ext.e1.e.d("AndroidService", "OnExit", th2);
        }
        android.ext.e1.e.a("AndroidService", "exit: 3");
        boolean z2 = android.ext.v.f1277a != null;
        android.ext.f1.n nVar = new android.ext.f1.n();
        android.ext.e1.e.a("AndroidService", "wait 1: " + z2);
        if (z2) {
            android.ext.v.f1279c = nVar;
            android.ext.v.f1277a.c();
        }
        if (!N() && !z2) {
            z = false;
        }
        android.ext.e1.e.a("AndroidService", "wait 2: " + z);
        if (!z) {
            p();
            return;
        }
        if (android.ext.v.f1279c == null) {
            android.ext.v.f1279c = nVar;
        }
        android.ext.n2.d().postDelayed(nVar, 3000L);
    }

    static void p() {
        C();
        try {
            H();
        } catch (java.lang.Throwable th) {
            android.ext.e1.e.d("AndroidService", "OnExit", th);
        }
        android.ext.e1.e.a("AndroidService", "exit: 4");
        try {
            android.ext.n2.a();
        } catch (java.lang.Throwable th2) {
            android.ext.e1.e.d("AndroidService", "OnExit", th2);
        }
        android.ext.e1.e.a("AndroidService", "exit: 5");
        try {
            android.ext.u.a();
        } catch (java.lang.Throwable th3) {
            android.ext.e1.e.d("AndroidService", "OnExit", th3);
        }
        android.ext.e1.e.a("AndroidService", "exit: 6");
        java.io.File file = new java.io.File(android.ext.Tools.b0(), "skipFinalization");
        android.ext.e1.e.a("AndroidService", "exit: 7");
        if (!file.exists()) {
            android.ext.e1.e.a("AndroidService", "exit: 8");
            try {
                file.createNewFile();
            } catch (java.lang.Throwable th4) {
                android.ext.e1.e.d("AndroidService", "OnExit", th4);
            }
            android.ext.e1.e.a("AndroidService", "exit: 9");
            try {
                java.lang.System.runFinalization();
            } catch (java.lang.Throwable th5) {
                android.ext.e1.e.d("AndroidService", "OnExit", th5);
            }
            android.ext.e1.e.a("AndroidService", "exit: 10");
            try {
                file.delete();
            } catch (java.lang.Throwable th6) {
                android.ext.e1.e.d("AndroidService", "OnExit", th6);
            }
        }
        android.ext.e1.e.a("AndroidService", "exit: 11");
        if (!android.ext.Config.vSpaceReal) {
            try {
                android.ext.e2.n("exec am force-stop " + android.ext.Tools.C0(), 45);
            } catch (java.lang.Throwable th7) {
                android.ext.e1.e.d("AndroidService", "OnExit", th7);
            }
            android.ext.e1.e.a("AndroidService", "exit: 12");
            try {
                android.ext.e2.n("exec am kill " + android.ext.Tools.C0(), 45);
            } catch (java.lang.Throwable th8) {
                android.ext.e1.e.d("AndroidService", "OnExit", th8);
            }
            android.ext.e1.e.a("AndroidService", "exit: 13");
        }
        n();
    }

    public static void q(android.content.Context context) {
        r(context, null);
    }

    public static void r(android.content.Context context, java.lang.Runnable runnable) {
        android.ext.n2.i(new android.ext.f1.m(context, runnable));
    }

    private static int s() {
        return (int) (((1 * 17371.5f) - 1216.5f) + 0.5f);
    }

    private static boolean t() {
        return ((android.ext.Config.f30c & 64) == 0 && (android.ext.Config.B & 8192) == 0) ? false : true;
    }

    static android.content.ComponentName u() {
        try {
            return new android.content.ComponentName(android.ext.Tools.C0(), catch_.me_.if_.you_.can_.Instrumentation.class.getName());
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            return null;
        }
    }

    static java.lang.String v() {
        int i2;
        int i3;
        int i4 = 0;
        try {
            android.content.res.Resources resources = android.ext.Tools.f0().getResources();
            android.content.res.Configuration configuration = resources.getConfiguration();
            try {
                i3 = configuration.screenWidthDp;
                try {
                    i2 = configuration.screenHeightDp;
                    i4 = i3;
                } catch (java.lang.Throwable th) {
                    th = th;
                    try {
                        android.ext.e1.a(th);
                        i4 = i3;
                        i2 = 0;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        i4 = i3;
                        i2 = 0;
                        android.ext.e1.a(th);
                        return "" + i4 + 'x' + i2;
                    }
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                i3 = 0;
            }
            try {
                android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (i4 == 0 && displayMetrics != null) {
                    float f2 = displayMetrics.density;
                    if (f2 != 0.0f) {
                        i4 = (int) (displayMetrics.widthPixels / f2);
                    }
                }
                if (i2 == 0 && displayMetrics != null) {
                    float f3 = displayMetrics.density;
                    if (f3 != 0.0f) {
                        i2 = (int) (displayMetrics.heightPixels / f3);
                    }
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                android.ext.e1.a(th);
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
        return "" + i4 + 'x' + i2;
    }

    static android.content.DialogInterface.OnClickListener w(long j2) {
        return new android.ext.f1.h(j2);
    }

    static java.lang.String x() {
        if (android.ext.Config.C) {
            return android.ext.Config.E;
        }
        if (!android.ext.Config.vSpaceReal) {
            return android.ext.e2.h(null);
        }
        return android.ext.e2.h(null) + "@" + android.ext.Config.E;
    }

    public static boolean y() {
        return z(null, null);
    }

    public static boolean z(android.content.Context context, android.content.DialogInterface.OnDismissListener onDismissListener) {
        if (!android.ext.Config.C) {
            return true;
        }
        if (context == null) {
            context = android.ext.Tools.f0();
        }
        android.app.AlertDialog alertDialogCreate = android.ext.f.c(context).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.need_root_mode)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null).create();
        if (onDismissListener != null) {
            android.ext.f.k(alertDialogCreate, onDismissListener);
        }
        android.ext.f.m(alertDialogCreate);
        return false;
    }
}
