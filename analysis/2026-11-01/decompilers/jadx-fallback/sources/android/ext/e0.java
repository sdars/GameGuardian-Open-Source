package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile java.lang.String f725b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile java.lang.String f726c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile int f727d = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile char f728e = 'i';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile char f729f = 'g';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static java.lang.StringBuilder f730g;
    public static java.lang.StringBuilder h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f731a;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.io.File f732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.e0 f733b;

        /* JADX INFO: renamed from: android.ext.e0$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0014a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.e0.a f734a;

            DialogInterfaceOnClickListenerC0014a(android.ext.e0.a r1) {
                    r0 = this;
                    r0.f734a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r4, int r5) {
                    r3 = this;
                    android.ext.e0$a r4 = r3.f734a
                    java.io.File r4 = r4.f732a
                    android.content.Intent[] r4 = android.ext.b1.b0(r4)
                    int r5 = r4.length
                    r0 = 0
                La:
                    if (r0 >= r5) goto L1d
                    r1 = r4[r0]
                    android.content.Context r2 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L16
                    r2.startActivity(r1)     // Catch: java.lang.Throwable -> L16
                    goto L1d
                L16:
                    r1 = move-exception
                    android.ext.e1.a(r1)
                    int r0 = r0 + 1
                    goto La
                L1d:
                    return
            }
        }

        a(android.ext.e0 r1, java.io.File r2) {
                r0 = this;
                r0.f733b = r1
                r0.f732a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                android.app.AlertDialog$Builder r0 = android.ext.f.b()
                r1 = 2131296792(0x7f090218, float:1.821151E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.io.File r3 = r5.f732a
                java.lang.String r3 = r3.getAbsolutePath()
                r4 = 0
                r2[r4] = r3
                java.lang.String r1 = android.ext.Tools.L1(r1, r2)
                android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
                r1 = 2131296455(0x7f0900c7, float:1.8210827E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.ext.e0$a$a r2 = new android.ext.e0$a$a
                r2.<init>(r5)
                android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
                r1 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                r2 = 0
                android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
                android.ext.f.o(r0)
                return
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.ext.e0.f730g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.ext.e0.h = r0
            return
    }

    public e0() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r1.i()
            r1.f731a = r0
            return
    }

    private static void a(java.util.ArrayList r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            if (r7 == 0) goto Ld
            boolean r7 = r0.exists()
            if (r7 == 0) goto L70
        Ld:
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r2 = "/files"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.<init>(r1, r6)
            r4.add(r7)
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r3 = "/cache"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r7.<init>(r1, r6)
            r4.add(r7)
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            r4.add(r6)
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r3)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            r4.add(r6)
            r4.add(r0)
        L70:
            return
    }

    private static void b(char r0) {
            java.lang.String r0 = java.lang.Character.toString(r0)
            c(r0)
            return
    }

    private static void c(java.lang.String r7) {
            java.lang.String r0 = g()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r(r7)
            r1.<init>(r0, r2)
            boolean r0 = r1.isFile()
            if (r0 != 0) goto La8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Extract file "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.content.Context r0 = android.ext.Tools.f0()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ydw"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "raw"
            int r2 = android.ext.b2.d(r2, r3)
            r3 = 32
            if (r2 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Nothing extract file "
            r0.append(r2)
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r1.getAbsolutePath()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.ext.e1.d(r7)
            goto La8
        L69:
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L81
            java.io.InputStream r0 = r0.openRawResource(r2)     // Catch: java.lang.Throwable -> L81
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L81
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L81
        L76:
            int r5 = r0.read(r4)     // Catch: java.lang.Throwable -> L81
            if (r5 <= 0) goto L83
            r6 = 0
            r2.write(r4, r6, r5)     // Catch: java.lang.Throwable -> L81
            goto L76
        L81:
            r0 = move-exception
            goto L8a
        L83:
            r2.close()     // Catch: java.lang.Throwable -> L81
            r0.close()     // Catch: java.lang.Throwable -> L81
            goto La8
        L8a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Failed extract file "
            r2.append(r4)
            r2.append(r7)
            r2.append(r3)
            java.lang.String r7 = r1.getAbsolutePath()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.ext.e1.g(r7, r0)
        La8:
            return
    }

    private void d(char r3) {
            r2 = this;
            b(r3)
            r0 = 53
            if (r3 == r0) goto L52
            r0 = 55
            if (r3 == r0) goto L68
            r0 = 56
            if (r3 == r0) goto L68
            r0 = 97
            if (r3 == r0) goto L43
            r0 = 98
            if (r3 == r0) goto L43
            switch(r3) {
                case 48: goto L31;
                case 49: goto L31;
                case 50: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L77
        L1b:
            java.lang.String r3 = "01"
            c(r3)
            r3 = 52
            b(r3)
            r3 = 102(0x66, float:1.43E-43)
            b(r3)
            android.ext.e0.f729f = r3
            r3 = 107(0x6b, float:1.5E-43)
            b(r3)
        L31:
            r3 = 51
            b(r3)
            r3 = 101(0x65, float:1.42E-43)
            b(r3)
            android.ext.e0.f728e = r3
            r3 = 106(0x6a, float:1.49E-43)
        L3f:
            b(r3)
            goto L77
        L43:
            r3 = 100
            b(r3)
            r3 = 105(0x69, float:1.47E-43)
            b(r3)
            android.ext.e0.f728e = r3
            r3 = 111(0x6f, float:1.56E-43)
            goto L3f
        L52:
            java.lang.String r3 = "08"
            c(r3)
            r3 = 54
            b(r3)
            r3 = 103(0x67, float:1.44E-43)
            b(r3)
            android.ext.e0.f729f = r3
            r3 = 108(0x6c, float:1.51E-43)
            b(r3)
        L68:
            r3 = 57
            b(r3)
            r3 = 104(0x68, float:1.46E-43)
            b(r3)
            android.ext.e0.f728e = r3
            r3 = 110(0x6e, float:1.54E-43)
            goto L3f
        L77:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L88
            java.io.File r0 = android.ext.Tools.q0()     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "sh.jar"
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "sh"
            android.ext.Tools.M(r0, r3)     // Catch: java.lang.Throwable -> L88
            goto L8e
        L88:
            r3 = move-exception
            java.lang.String r0 = "JVM fail"
            android.ext.e1.l(r0, r3)
        L8e:
            return
    }

    private int e(java.lang.String r8) {
            r7 = this;
            android.ext.Tools.j(r8)
            r0 = 0
            r1 = 0
        L5:
            r2 = 2
            r3 = 100
            if (r1 >= r2) goto L81
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.lang.String r4 = android.ext.Tools.F0(r8)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r2[r0] = r4     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            boolean r4 = android.ext.Config.vSpaceReal     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            if (r4 == 0) goto L1d
            java.lang.String r4 = android.ext.Config.E     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            goto L1f
        L19:
            r0 = move-exception
            goto L64
        L1b:
            r2 = move-exception
            goto L4a
        L1d:
            java.lang.String r4 = "1"
        L1f:
            r5 = 1
            r2[r5] = r4     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.lang.Process r2 = android.ext.Tools.I(r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r4 = 30
            boolean r5 = android.ext.Tools.X1(r2, r4)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            if (r5 == 0) goto L33
            int r3 = r2.exitValue()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            goto L81
        L33:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r5.<init>()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.lang.String r6 = "timeout: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r5.append(r4)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            throw r2     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
        L4a:
            if (r1 != 0) goto L63
            java.lang.String r4 = r2.getMessage()     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L63
            java.lang.String r5 = "denied"
            int r4 = r4.indexOf(r5)     // Catch: java.lang.Throwable -> L19
            r5 = -1
            if (r4 == r5) goto L63
            java.lang.String r2 = "0755"
            android.ext.Tools.r(r8, r2)     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + 1
            goto L5
        L63:
            throw r2     // Catch: java.lang.Throwable -> L19
        L64:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getArch: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.ext.e1.s(r8, r0)
            java.lang.StringBuilder r8 = android.ext.e0.h
            java.lang.String r0 = r0.toString()
            r8.append(r0)
        L81:
            return r3
    }

    public static int f() {
            h()
            int r0 = android.ext.e0.f727d
            return r0
    }

    public static java.lang.String g() {
            java.lang.String r0 = android.ext.e0.f726c
            if (r0 != 0) goto L18
            java.io.File r0 = j()
            if (r0 != 0) goto Le
            java.io.File r0 = android.ext.Tools.q0()
        Le:
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r0 = s(r0)
            android.ext.e0.f726c = r0
        L18:
            java.lang.String r0 = android.ext.e0.f726c
            return r0
    }

    public static java.lang.String h() {
            java.lang.String r0 = android.ext.e0.f725b
            if (r0 != 0) goto Ld
            android.ext.e0 r0 = new android.ext.e0
            r0.<init>()
            java.lang.String r0 = r0.f731a
            android.ext.e0.f725b = r0
        Ld:
            java.lang.String r0 = android.ext.e0.f725b
            return r0
    }

    private java.lang.String i() {
            r12 = this;
            java.lang.String r0 = "ls: "
            r1 = 9
            char[] r1 = new char[r1]
            r1 = {x024c: FILL_ARRAY_DATA , data: [0, 50, 49, 53, 56, 98, 48, 55, 97} // fill-array
            java.lang.String r2 = g()
            boolean r3 = android.ext.Config.C
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L27
            byte r3 = android.ext.Config.G
            if (r3 == r5) goto L25
            byte r3 = android.ext.Config.G
            if (r3 != 0) goto L27
            java.lang.String r3 = android.ext.Config.E
            java.lang.String r6 = "64"
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L27
        L25:
            r3 = 0
            goto L28
        L27:
            r3 = 2
        L28:
            r6 = 0
        L29:
            int r7 = r1.length
            r8 = 10
            if (r6 >= r7) goto L153
            if (r6 != 0) goto L53
            r7 = 1
        L31:
            int r9 = r1.length
            if (r7 >= r9) goto L4d
            java.io.File r9 = new java.io.File
            char r10 = r1[r7]
            java.lang.String r10 = q(r10)
            r9.<init>(r2, r10)
            boolean r9 = r9.exists()
            if (r9 == 0) goto L4a
            char r7 = r1[r7]
            r1[r4] = r7
            goto L4d
        L4a:
            int r7 = r7 + 1
            goto L31
        L4d:
            char r7 = r1[r4]
            if (r7 != 0) goto L53
            goto L106
        L53:
            java.lang.StringBuilder r7 = android.ext.e0.h
            char r9 = r1[r6]
            r7.append(r9)
            java.lang.StringBuilder r7 = android.ext.e0.h
            java.lang.String r9 = ": "
            r7.append(r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "0"
            r7.append(r9)
            char r9 = r1[r6]
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.io.File r9 = new java.io.File
            java.lang.String r10 = r(r7)
            r9.<init>(r2, r10)
            boolean r10 = r9.isFile()
            if (r10 != 0) goto L86
            c(r7)
        L86:
            boolean r7 = r9.isFile()
            r10 = 32
            if (r7 != 0) goto Lb9
            java.lang.StringBuilder r7 = android.ext.e0.h
            r7.append(r9)
            java.lang.StringBuilder r7 = android.ext.e0.h
            java.lang.String r8 = " NF.\n"
            r7.append(r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Not a file "
            r7.append(r8)
            r7.append(r9)
            r7.append(r10)
            java.lang.String r8 = r9.getAbsolutePath()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.ext.e1.d(r7)
            goto L106
        Lb9:
            java.lang.StringBuilder r7 = android.ext.e0.f730g
            char r11 = r1[r6]
            r7.append(r11)
            java.lang.String r7 = r9.getAbsolutePath()
            int r7 = r12.e(r7)
            char r9 = r1[r6]
            boolean r9 = r12.o(r9, r7)
            if (r9 != 0) goto L10a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "getArch "
            r9.append(r11)
            char r11 = r1[r6]
            r9.append(r11)
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.ext.e1.d(r9)
            java.lang.StringBuilder r9 = android.ext.e0.h
            java.lang.String r10 = "; "
            r9.append(r10)
            java.lang.StringBuilder r9 = android.ext.e0.h
            r9.append(r7)
            java.lang.StringBuilder r9 = android.ext.e0.h
            r9.append(r8)
            if (r3 != 0) goto L106
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r8 = 100
            if (r7 >= r8) goto L106
            r3 = 1
        L106:
            int r6 = r6 + 1
            goto L29
        L10a:
            r0 = 105(0x69, float:1.47E-43)
            if (r7 == r0) goto L114
            r0 = 102(0x66, float:1.43E-43)
            if (r7 != r0) goto L113
            goto L114
        L113:
            r5 = 0
        L114:
            android.ext.InOut.p(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            android.ext.e0.f730g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            android.ext.e0.h = r0
            java.io.File r0 = new java.io.File
            char r3 = r1[r6]
            java.lang.String r3 = q(r3)
            r0.<init>(r2, r3)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Daemon: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.ext.e1.d(r2)
            android.ext.e0.f727d = r7
            char r1 = r1[r6]
            r12.d(r1)
            android.ext.Tools.j(r0)
            return r0
        L153:
            if (r3 != r5) goto L1ae
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L189
            java.lang.String r3 = android.ext.Tools.K0()     // Catch: java.lang.Throwable -> L189
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L189
            boolean r3 = r12.n(r1)     // Catch: java.lang.Throwable -> L189
            if (r3 == 0) goto L18b
            android.content.Context r1 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L189
            java.io.File r1 = r1.getExternalCacheDir()     // Catch: java.lang.Throwable -> L189
            boolean r3 = r12.n(r1)     // Catch: java.lang.Throwable -> L189
            if (r3 == 0) goto L18b
            android.content.Context r1 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L189
            r3 = 0
            java.io.File r1 = r1.getExternalFilesDir(r3)     // Catch: java.lang.Throwable -> L189
            boolean r3 = r12.n(r1)     // Catch: java.lang.Throwable -> L189
            if (r3 == 0) goto L18b
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L189
            java.lang.String r3 = "/sdcard"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L189
            goto L18b
        L189:
            r1 = move-exception
            goto L1a9
        L18b:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L189
            java.lang.String r4 = "gg_fixer.apk"
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L189
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L189
            if (r1 == 0) goto L19b
            r3.delete()     // Catch: java.lang.Throwable -> L189
        L19b:
            java.lang.String r1 = "fx"
            android.ext.Tools.M(r1, r3)     // Catch: java.lang.Throwable -> L189
            android.ext.e0$a r1 = new android.ext.e0$a     // Catch: java.lang.Throwable -> L189
            r1.<init>(r12, r3)     // Catch: java.lang.Throwable -> L189
            android.ext.n2.i(r1)     // Catch: java.lang.Throwable -> L189
            goto L1ae
        L1a9:
            java.lang.String r3 = "Failed extract fx"
            android.ext.e1.s(r3, r1)
        L1ae:
            java.lang.StringBuilder r1 = android.ext.e0.f730g
            r3 = 59
            r1.append(r3)
            java.lang.String r1 = android.ext.Tools.F0(r2)
            java.lang.String r2 = "ls"
            java.lang.String r3 = "-l"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r1}
            java.lang.StringBuilder r3 = android.ext.e0.h     // Catch: java.lang.Exception -> L221
            java.lang.String r4 = "\n\n"
            r3.append(r4)     // Catch: java.lang.Exception -> L221
            java.lang.StringBuilder r3 = android.ext.e0.h     // Catch: java.lang.Exception -> L221
            java.lang.String r4 = "ls -l "
            r3.append(r4)     // Catch: java.lang.Exception -> L221
            java.lang.StringBuilder r3 = android.ext.e0.h     // Catch: java.lang.Exception -> L221
            r3.append(r1)     // Catch: java.lang.Exception -> L221
            java.lang.StringBuilder r3 = android.ext.e0.h     // Catch: java.lang.Exception -> L221
            java.lang.String r4 = ":\n"
            r3.append(r4)     // Catch: java.lang.Exception -> L221
            java.lang.Process r2 = android.ext.Tools.I(r2)     // Catch: java.lang.Exception -> L221
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L221
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L221
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L221
            r4.<init>(r2)     // Catch: java.lang.Exception -> L221
            r3.<init>(r4)     // Catch: java.lang.Exception -> L221
        L1ed:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Exception -> L221
            if (r2 == 0) goto L223
            java.lang.String r4 = "lib"
            int r4 = r2.indexOf(r4)     // Catch: java.lang.Exception -> L221
            r5 = -1
            if (r4 == r5) goto L1ed
            java.lang.String r4 = ".so"
            int r4 = r2.indexOf(r4)     // Catch: java.lang.Exception -> L221
            if (r4 == r5) goto L1ed
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L221
            r4.<init>()     // Catch: java.lang.Exception -> L221
            r4.append(r0)     // Catch: java.lang.Exception -> L221
            r4.append(r2)     // Catch: java.lang.Exception -> L221
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L221
            android.ext.e1.d(r4)     // Catch: java.lang.Exception -> L221
            java.lang.StringBuilder r4 = android.ext.e0.h     // Catch: java.lang.Exception -> L221
            r4.append(r2)     // Catch: java.lang.Exception -> L221
            java.lang.StringBuilder r2 = android.ext.e0.h     // Catch: java.lang.Exception -> L221
            r2.append(r8)     // Catch: java.lang.Exception -> L221
            goto L1ed
        L221:
            r2 = move-exception
            goto L227
        L223:
            r3.close()     // Catch: java.lang.Exception -> L221
            goto L243
        L227:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            android.ext.e1.s(r0, r2)
            java.lang.StringBuilder r0 = android.ext.e0.h
            r0.append(r2)
            java.lang.StringBuilder r0 = android.ext.e0.h
            r0.append(r8)
        L243:
            java.lang.StringBuilder r0 = android.ext.e0.h
            r0.append(r8)
            java.lang.String r0 = "no_binary_for_your_arch"
            return r0
    }

    private static java.io.File j() {
            java.io.File r0 = android.ext.Tools.p0()
            java.io.File r1 = android.ext.Tools.b0()
            java.lang.String r2 = android.ext.Tools.s0()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 64
            r3.<init>(r4)
            java.io.File r4 = android.ext.Tools.q0()
            r3.add(r4)
            java.io.File r4 = android.ext.Tools.c0()
            r3.add(r4)
            r3.add(r0)
            r3.add(r1)
            java.io.File r4 = new java.io.File
            java.io.File r5 = r0.getParentFile()
            r4.<init>(r5, r2)
            r3.add(r4)
            java.io.File r4 = new java.io.File
            java.io.File r5 = r1.getParentFile()
            r4.<init>(r5, r2)
            r3.add(r4)
            java.io.File r4 = r0.getParentFile()
            r3.add(r4)
            java.io.File r1 = r1.getParentFile()
            r3.add(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = "/data/user/"
            boolean r4 = r0.startsWith(r1)
            java.lang.String r5 = "/"
            if (r4 == 0) goto L64
            r4 = -1
            java.lang.String[] r4 = r0.split(r5, r4)
            r6 = 3
            r4 = r4[r6]
            goto L66
        L64:
            java.lang.String r4 = "0"
        L66:
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r4)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            goto L81
        L7f:
            java.lang.String r0 = "/data/data/"
        L81:
            boolean r1 = android.ext.Config.vSpaceReal
            java.lang.String r6 = "/data/user_de/"
            r7 = 0
            if (r1 == 0) goto L1bf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = android.ext.Config.E
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r8 = "/parallel_intl/0/"
            r1.append(r8)
            java.lang.String r8 = android.ext.i.f1002d
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r9 = 1
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = "/parallel_lite/0/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = "/parallel_pro/0/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = "/virtual/data/user/0/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = "/gaia/data/user/0/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = "/com.vmos.glb/osimg/r/ot01/data/data/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = "/mopen/data/user/0/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = "/vbox/data/user/0/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = "/sandboxdata/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = "/gameplugins/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = "/Plugin/0/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r10 = "/data/"
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = android.ext.Config.E
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r7)
            a(r3, r0, r2, r7)
            goto L1ff
        L1bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = android.ext.i.f1002d
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            a(r3, r1, r2, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r4)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            a(r3, r0, r2, r7)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/data/data"
            r0.<init>(r1)
            r3.add(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/data"
            r0.<init>(r1)
            r3.add(r0)
        L1ff:
            java.util.Iterator r0 = r3.iterator()
        L203:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L275
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            if (r1 != 0) goto L212
            goto L203
        L212:
            boolean r2 = r1.exists()
            if (r2 != 0) goto L21b
            r1.mkdirs()
        L21b:
            boolean r2 = r1.exists()
            if (r2 == 0) goto L222
            return r1
        L222:
            java.lang.String r2 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L231
            android.system.StructStat r3 = android.system.Os.stat(r2)     // Catch: java.lang.Throwable -> L231 java.lang.Exception -> L233
            int r2 = r3.st_mode     // Catch: java.lang.Throwable -> L231 java.lang.Exception -> L233
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L203
            return r1
        L231:
            r1 = move-exception
            goto L271
        L233:
            r1 = move-exception
            boolean r3 = r1 instanceof android.system.ErrnoException     // Catch: java.lang.Throwable -> L231
            if (r3 == 0) goto L25a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L231
            r3.<init>()     // Catch: java.lang.Throwable -> L231
            java.lang.String r4 = "Errno for path '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L231
            r3.append(r2)     // Catch: java.lang.Throwable -> L231
            java.lang.String r2 = "': "
            r3.append(r2)     // Catch: java.lang.Throwable -> L231
            r2 = r1
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2     // Catch: java.lang.Throwable -> L231
            int r2 = r2.errno     // Catch: java.lang.Throwable -> L231
            r3.append(r2)     // Catch: java.lang.Throwable -> L231
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L231
        L256:
            android.ext.e1.s(r2, r1)     // Catch: java.lang.Throwable -> L231
            goto L203
        L25a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L231
            r3.<init>()     // Catch: java.lang.Throwable -> L231
            java.lang.String r4 = "Exception for path '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L231
            r3.append(r2)     // Catch: java.lang.Throwable -> L231
            java.lang.String r2 = "'"
            r3.append(r2)     // Catch: java.lang.Throwable -> L231
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L231
            goto L256
        L271:
            android.ext.e1.a(r1)
            goto L203
        L275:
            java.lang.String r0 = "Failed get dir for fix"
            android.ext.e1.p(r0)
            r0 = 0
            return r0
    }

    public static java.lang.String k(boolean r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "/lib"
            r0.append(r1)
            if (r2 == 0) goto Lf
            char r2 = android.ext.e0.f729f
            goto L11
        Lf:
            char r2 = android.ext.e0.f728e
        L11:
            r0.append(r2)
            java.lang.String r2 = ".so"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static void l() {
            r0 = 6
            char[] r0 = new char[r0]
            r0 = {x00aa: FILL_ARRAY_DATA , data: [0, 113, 112, 114, 115, 116} // fill-array
            java.lang.String r1 = g()
            r2 = 0
            r3 = 0
        Lc:
            int r4 = r0.length
            if (r3 >= r4) goto La8
            if (r3 != 0) goto L33
            r4 = 1
        L12:
            int r5 = r0.length
            if (r4 >= r5) goto L2e
            java.io.File r5 = new java.io.File
            char r6 = r0[r4]
            java.lang.String r6 = q(r6)
            r5.<init>(r1, r6)
            boolean r5 = r5.exists()
            if (r5 == 0) goto L2b
            char r4 = r0[r4]
            r0[r2] = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L12
        L2e:
            char r4 = r0[r2]
            if (r4 != 0) goto L33
            goto La4
        L33:
            java.io.File r4 = new java.io.File
            char r5 = r0[r3]
            java.lang.String r5 = q(r5)
            r4.<init>(r1, r5)
            boolean r5 = r4.isFile()
            if (r5 != 0) goto L49
            char r5 = r0[r3]
            b(r5)
        L49:
            boolean r5 = r4.isFile()
            r6 = 32
            if (r5 != 0) goto L70
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Not a file "
            r5.append(r7)
            r5.append(r4)
            r5.append(r6)
            java.lang.String r4 = r4.getAbsolutePath()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.ext.e1.d(r4)
            goto La4
        L70:
            java.lang.String r5 = r4.getAbsolutePath()
            java.lang.System.load(r5)     // Catch: java.lang.Throwable -> L9b
            android.lang.ProcessBuilder.loaded()     // Catch: java.lang.Throwable -> L7b
            goto La8
        L7b:
            r5 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed check "
        L83:
            r7.append(r8)
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r4.getAbsolutePath()
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.ext.e1.g(r4, r5)
            goto La4
        L9b:
            r5 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed load "
            goto L83
        La4:
            int r3 = r3 + 1
            goto Lc
        La8:
            return
    }

    public static boolean m() {
            int r0 = f()
            r1 = 105(0x69, float:1.47E-43)
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private boolean n(java.io.File r3) {
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.exists()
            if (r1 != 0) goto L14
            r3.mkdirs()
            boolean r3 = r3.exists()
            if (r3 != 0) goto L14
            return r0
        L14:
            r3 = 0
            return r3
    }

    private boolean o(char r5, int r6) {
            r4 = this;
            r0 = 53
            r1 = 0
            r2 = 1
            if (r5 == r0) goto L4e
            r0 = 55
            r3 = 104(0x68, float:1.46E-43)
            if (r5 == r0) goto L4b
            r0 = 56
            if (r5 == r0) goto L48
            r0 = 97
            r3 = 103(0x67, float:1.44E-43)
            if (r5 == r0) goto L45
            r0 = 98
            if (r5 == r0) goto L42
            r0 = 101(0x65, float:1.42E-43)
            switch(r5) {
                case 48: goto L3f;
                case 49: goto L3c;
                case 50: goto L36;
                default: goto L1f;
            }
        L1f:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown lib: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L36:
            r5 = 102(0x66, float:1.43E-43)
            if (r5 != r6) goto L53
        L3a:
            r1 = 1
            goto L53
        L3c:
            if (r0 != r6) goto L53
            goto L3a
        L3f:
            if (r0 != r6) goto L53
            goto L3a
        L42:
            if (r3 != r6) goto L53
            goto L3a
        L45:
            if (r3 != r6) goto L53
            goto L3a
        L48:
            if (r3 != r6) goto L53
            goto L3a
        L4b:
            if (r3 != r6) goto L53
            goto L3a
        L4e:
            r5 = 105(0x69, float:1.47E-43)
            if (r5 != r6) goto L53
            goto L3a
        L53:
            return r1
    }

    public static boolean p() {
            int r0 = f()
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto Lf
            r1 = 102(0x66, float:1.43E-43)
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private static java.lang.String q(char r0) {
            java.lang.String r0 = java.lang.Character.toString(r0)
            java.lang.String r0 = r(r0)
            return r0
    }

    private static java.lang.String r(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "lib"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ".so"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String s(java.lang.String r6) {
            r0 = 13
            char[] r1 = new char[r0]
            r1 = {x003e: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 100} // fill-array
            r2 = 0
        L8:
            if (r2 >= r0) goto L3d
            char r3 = r1[r2]
            java.lang.String r3 = q(r3)
            java.io.File r4 = new java.io.File
            r4.<init>(r6, r3)
            boolean r3 = r4.exists()
            if (r3 != 0) goto L1c
            goto L3a
        L1c:
            java.lang.String r3 = r4.getAbsolutePath()
            boolean r4 = android.ext.Tools.j(r3)
            if (r4 != 0) goto L3a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Can not execute "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.ext.e1.d(r3)
        L3a:
            int r2 = r2 + 1
            goto L8
        L3d:
            return r6
    }
}
