package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ConfigListAdapter extends android.widget.BaseAdapter implements android.widget.AdapterView.OnItemClickListener {
    public static final java.lang.String DEVS = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f47g;
    static final int[] h = null;
    static final java.lang.String[] i = null;
    private static boolean j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.View[] f48a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.ref.WeakReference f49b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.ref.WeakReference f50c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.ref.WeakReference f51d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f52e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.ext.Tools.a0 f53f;

    class a extends android.ext.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f54a;

        /* JADX INFO: renamed from: android.ext.ConfigListAdapter$a$a, reason: collision with other inner class name */
        class RunnableC0002a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.StringBuilder f55a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.ConfigListAdapter.a f56b;

            RunnableC0002a(android.ext.ConfigListAdapter.a r1, java.lang.StringBuilder r2) {
                    r0 = this;
                    r0.f56b = r1
                    r0.f55a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    android.app.AlertDialog$Builder r0 = android.ext.f.b()
                    r1 = 2131296316(0x7f09003c, float:1.8210545E38)
                    android.view.View r1 = android.ext.Tools.g0(r1)
                    android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
                    java.lang.StringBuilder r1 = r3.f55a
                    java.lang.String r1 = r1.toString()
                    android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
                    r1 = 2131296836(0x7f090244, float:1.82116E38)
                    java.lang.String r1 = android.ext.b2.f(r1)
                    r2 = 0
                    android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
                    android.app.AlertDialog r0 = r0.create()
                    android.app.AlertDialog r0 = android.ext.f.m(r0)
                    android.ext.Tools.u1(r0)
                    return
            }
        }

        a(android.ext.ConfigListAdapter r1, java.lang.String r2) {
                r0 = this;
                r0.f54a = r1
                r0.<init>(r2)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L2d
                java.lang.String r2 = "kwws=22jdphjxdugldq1qhw2yhuvlrq1w{w"
                java.lang.String r2 = android.ext.Tools.removeNewLinesChars(r2)     // Catch: java.lang.Throwable -> L2d
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L2d
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2d
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2d
                java.io.InputStream r1 = r1.openStream()     // Catch: java.lang.Throwable -> L2d
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L2d
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L2d
            L1e:
                java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L2d
                if (r1 == 0) goto L2f
                r0.append(r1)     // Catch: java.lang.Throwable -> L2d
                r1 = 10
                r0.append(r1)     // Catch: java.lang.Throwable -> L2d
                goto L1e
            L2d:
                r1 = move-exception
                goto L33
            L2f:
                r2.close()     // Catch: java.lang.Throwable -> L2d
                goto L3f
            L33:
                java.lang.String r2 = "Load changelog"
                android.ext.e1.l(r2, r1)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L3f:
                android.ext.ConfigListAdapter$a$a r1 = new android.ext.ConfigListAdapter$a$a
                r1.<init>(r4, r0)
                android.ext.n2.i(r1)
                return
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f57a;

        b(android.ext.ConfigListAdapter r1) {
                r0 = this;
                r0.f57a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1 = 0
                android.ext.Config.f30c = r1
                android.ext.Config.k()
                return
        }
    }

    class c implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f58a;

        c(android.ext.ConfigListAdapter r1) {
                r0 = this;
                r0.f58a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.ConfigListAdapter.j(r2)
                return
        }
    }

    class d implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f59a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f60b;

        d(android.ext.ConfigListAdapter r1, android.ext.MainService r2) {
                r0 = this;
                r0.f60b = r1
                r0.f59a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.MainService r1 = r0.f59a
                android.ext.f0 r1 = r1.i
                r1.s()
                return
        }
    }

    class e implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f61a;

        e(android.ext.ConfigListAdapter r1) {
                r0 = this;
                r0.f61a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.y0.c()
                return
        }
    }

    class f implements android.content.DialogInterface.OnClickListener {

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.ConfigListAdapter.f f62a;

            a(android.ext.ConfigListAdapter.f r1) {
                    r0 = this;
                    r0.f62a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> Lf
                    r0.t()     // Catch: java.lang.Throwable -> Lf
                    android.ext.HotPoint r1 = r0.j     // Catch: java.lang.Throwable -> Lf
                    r1.m()     // Catch: java.lang.Throwable -> Lf
                    r1 = 0
                    r0.m1(r1)     // Catch: java.lang.Throwable -> Lf
                    goto L15
                Lf:
                    r0 = move-exception
                    java.lang.String r1 = "Failed restore after take screenshot"
                    android.ext.e1.l(r1, r0)
                L15:
                    return
            }
        }

        class b implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.ConfigListAdapter.f f63a;

            b(android.ext.ConfigListAdapter.f r1) {
                    r0 = this;
                    r0.f63a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    android.ext.MainService r0 = android.ext.MainService.instance
                    android.ext.f0 r0 = r0.i
                    r0.T0()
                    return
            }
        }

        f() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                android.ext.MainService r4 = android.ext.MainService.instance
                r4.t()     // Catch: java.lang.Throwable -> L2b
                android.os.Handler r5 = android.ext.n2.d()     // Catch: java.lang.Throwable -> L2b
                android.ext.ConfigListAdapter$f$a r0 = new android.ext.ConfigListAdapter$f$a     // Catch: java.lang.Throwable -> L2b
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L2b
                r1 = 8000(0x1f40, double:3.9525E-320)
                r5.postDelayed(r0, r1)     // Catch: java.lang.Throwable -> L2b
                r5 = 1
                r4.m1(r5)     // Catch: java.lang.Throwable -> L2b
                android.ext.HotPoint r5 = r4.j     // Catch: java.lang.Throwable -> L2b
                r5.e()     // Catch: java.lang.Throwable -> L2b
                android.os.Handler r5 = android.ext.n2.d()     // Catch: java.lang.Throwable -> L2b
                android.ext.ConfigListAdapter$f$b r0 = new android.ext.ConfigListAdapter$f$b     // Catch: java.lang.Throwable -> L2b
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L2b
                r1 = 300(0x12c, double:1.48E-321)
                r5.postDelayed(r0, r1)     // Catch: java.lang.Throwable -> L2b
                return
            L2b:
                r5 = move-exception
                java.lang.String r0 = "Failed take screenshot"
                android.ext.e1.l(r0, r5)
                android.ext.HotPoint r4 = r4.j     // Catch: java.lang.Throwable -> L37
                r4.m()     // Catch: java.lang.Throwable -> L37
                goto L3d
            L37:
                r4 = move-exception
                java.lang.String r5 = "Failed restore after take screenshot"
                android.ext.e1.l(r5, r4)
            L3d:
                return
        }
    }

    class g implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f64a;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean[] f65a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f66b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.ext.ConfigListAdapter.g f67c;

            a(android.ext.ConfigListAdapter.g r1, boolean[] r2, int r3) {
                    r0 = this;
                    r0.f67c = r1
                    r0.f65a = r2
                    r0.f66b = r3
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r6, int r7) {
                    r5 = this;
                    r6 = -1
                    if (r7 == r6) goto L6
                    r0 = -3
                    if (r7 != r0) goto L3c
                L6:
                    r0 = 1
                    r1 = -1
                    if (r7 != r6) goto L22
                    r6 = 0
                Lc:
                    boolean[] r7 = r5.f65a
                    int r3 = r7.length
                    if (r6 >= r3) goto L22
                    boolean r7 = r7[r6]
                    if (r7 == 0) goto L1a
                    int r7 = r0 << r6
                    long r3 = (long) r7
                    long r1 = r1 | r3
                    goto L1f
                L1a:
                    int r7 = r0 << r6
                    int r7 = ~r7
                    long r3 = (long) r7
                    long r1 = r1 & r3
                L1f:
                    int r6 = r6 + 1
                    goto Lc
                L22:
                    boolean[] r6 = r5.f65a
                    int r6 = r6.length
                    int r6 = r0 << r6
                    int r6 = r6 - r0
                    long r6 = (long) r6
                    long r6 = r6 & r1
                    r3 = 0
                    int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r0 != 0) goto L33
                    r6 = 1
                    long r1 = r1 | r6
                L33:
                    long[] r6 = android.ext.Config.f29b
                    int r7 = r5.f66b
                    r6[r7] = r1
                    android.ext.Config.k()
                L3c:
                    android.ext.ConfigListAdapter.c()
                    return
            }
        }

        class b implements android.content.DialogInterface.OnMultiChoiceClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean[] f68a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.ConfigListAdapter.g f69b;

            b(android.ext.ConfigListAdapter.g r1, boolean[] r2) {
                    r0 = this;
                    r0.f69b = r1
                    r0.f68a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(android.content.DialogInterface r1, int r2, boolean r3) {
                    r0 = this;
                    boolean[] r1 = r0.f68a
                    r1[r2] = r3
                    return
            }
        }

        g(java.lang.String[] r1) {
                r0 = this;
                r0.f64a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r14, int r15) {
                r13 = this;
                int r14 = r15 / 2
                android.ext.p1[][] r0 = android.ext.MainService.J0
                r14 = r0[r14]
                int r0 = r14.length
                java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
                int r2 = r14.length
                android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
                boolean[] r3 = new boolean[r0]
                long[] r4 = android.ext.Config.f29b
                r5 = r4[r15]
                r4 = 0
                r7 = 0
            L14:
                if (r7 >= r0) goto L38
                r8 = r14[r7]
                java.lang.String r8 = r8.toString()
                r1[r7] = r8
                r8 = 1
                long r8 = r8 << r7
                long r8 = r8 & r5
                r10 = 0
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 == 0) goto L2a
                r8 = 1
                goto L2b
            L2a:
                r8 = 0
            L2b:
                r3[r7] = r8
                r8 = r14[r7]
                android.graphics.drawable.Drawable r8 = r8.c()
                r2[r7] = r8
                int r7 = r7 + 1
                goto L14
            L38:
                android.ext.ConfigListAdapter$g$a r14 = new android.ext.ConfigListAdapter$g$a
                r14.<init>(r13, r3, r15)
                android.content.Context r0 = android.ext.Tools.k0()
                android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
                java.lang.String[] r4 = r13.f64a
                r15 = r4[r15]
                android.view.View r15 = android.ext.Tools.h0(r15)
                android.app.AlertDialog$Builder r15 = r0.setCustomTitle(r15)
                android.ext.ConfigListAdapter$g$b r0 = new android.ext.ConfigListAdapter$g$b
                r0.<init>(r13, r3)
                android.app.AlertDialog$Builder r15 = r15.setMultiChoiceItems(r1, r3, r0)
                r0 = 2131296917(0x7f090295, float:1.8211764E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r15 = r15.setPositiveButton(r0, r14)
                r0 = 2131296898(0x7f090282, float:1.8211726E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r15 = r15.setNeutralButton(r0, r14)
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r14 = r15.setNegativeButton(r0, r14)
                android.app.AlertDialog r14 = r14.create()
                android.widget.ListView r15 = r14.getListView()
                if (r15 == 0) goto L8f
                int r0 = android.ext.Config.d()
                r3 = 2131361799(0x7f0a0007, float:1.834336E38)
                android.ext.Tools.e(r15, r1, r2, r0, r3)
            L8f:
                android.ext.f.m(r14)
                return
        }
    }

    class h implements android.content.DialogInterface.OnClickListener {
        h() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r10, int r11) {
                r9 = this;
                java.lang.String r0 = "Failed check vSpace: "
                if (r11 != 0) goto L10
                android.ext.r$n r0 = new android.ext.r$n
                java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2fdwhjru|250ylghr0wxwruldov2"
                r0.<init>(r1)
                r0.onClick(r10, r11)
                goto L1cb
            L10:
                int r11 = r11 + (-1)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                int[] r1 = android.ext.ConfigListAdapter.h
                int r11 = r11 * 3
                r2 = r1[r11]
                java.lang.String r2 = android.ext.b2.f(r2)
                r10.append(r2)
                java.lang.String r2 = ":\n"
                r10.append(r2)
                int r3 = r11 + 1
                r3 = r1[r3]
                java.lang.String r3 = android.ext.b2.f(r3)
                r10.append(r3)
                java.lang.String r10 = r10.toString()
                int r3 = r11 + 2
                r3 = r1[r3]
                if (r3 < 0) goto L91
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r10 = r10.trim()
                r4.append(r10)
                java.lang.String r10 = "\n\n"
                r4.append(r10)
                java.lang.String r10 = r4.toString()
                int r4 = r10.length()
                int r4 = r4 + (-3)
                char r4 = r10.charAt(r4)
                r5 = 58
                if (r4 == r5) goto L7a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r10)
                r10 = 2131297086(0x7f09033e, float:1.8212107E38)
                java.lang.String r10 = android.ext.b2.f(r10)
                r4.append(r10)
                r4.append(r2)
                java.lang.String r10 = r4.toString()
            L7a:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r10)
                java.lang.String[] r10 = android.ext.ConfigListAdapter.i
                r10 = r10[r3]
                java.lang.String r10 = android.ext.Tools.removeNewLinesChars(r10)
                r4.append(r10)
                java.lang.String r10 = r4.toString()
            L91:
                r3 = r1[r11]
                r4 = 2131296613(0x7f090165, float:1.8211148E38)
                if (r3 != r4) goto Ld1
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r4 = 2131296916(0x7f090294, float:1.8211762E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                r5 = 2131296280(0x7f090018, float:1.8210472E38)
                java.lang.String r5 = android.ext.b2.f(r5)
                java.lang.String r10 = r10.replace(r4, r5)
                r3.append(r10)
                java.lang.String r10 = "\nhttps://productforums.google.com/forum/#!topic/translate/1Pywh5vI1kE\n\n"
                r3.append(r10)
                r10 = 2131297101(0x7f09034d, float:1.8212137E38)
                java.lang.String r10 = android.ext.Tools.N1(r10)
                r3.append(r10)
                r3.append(r2)
                java.lang.String r10 = "kwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25730krz0wr0xvh0jdphjxdugldq0zlwkrxw0iordw0zlqgrz0jdphjxdugldq2"
                java.lang.String r10 = android.ext.Tools.removeNewLinesChars(r10)
                r3.append(r10)
                java.lang.String r10 = r3.toString()
            Ld1:
                r2 = 2131099658(0x7f06000a, float:1.7811675E38)
                r3 = 0
                android.view.View r2 = a.d.f(r2, r3)
                r4 = 2131034148(0x7f050024, float:1.7678805E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                android.ext.Tools.v1(r4, r10)
                java.lang.CharSequence r10 = r4.getText()
                android.ext.Tools.u(r10)
                android.app.AlertDialog$Builder r10 = android.ext.f.b()
                android.app.AlertDialog$Builder r10 = r10.setView(r2)
                r2 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r4 = android.ext.b2.f(r2)
                android.content.DialogInterface$OnClickListener r5 = android.ext.ConfigListAdapter.h()
                android.app.AlertDialog$Builder r10 = r10.setNegativeButton(r4, r5)
                r4 = r1[r11]
                r5 = 2131297106(0x7f090352, float:1.8212148E38)
                java.lang.String r6 = "kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2"
                if (r4 != r5) goto L117
                android.ext.r$n r4 = new android.ext.r$n
                r4.<init>(r6)
                r5 = 2131296786(0x7f090212, float:1.8211499E38)
                r10.setPositiveButton(r5, r4)
            L117:
                android.ext.f.o(r10)
                boolean r10 = android.ext.Config.C
                if (r10 == 0) goto L1cb
                r10 = r1[r11]
                r11 = 2131296621(0x7f09016d, float:1.8211164E38)
                if (r10 != r11) goto L1cb
                r10 = 2
                r11 = 1
                java.lang.String r1 = android.ext.Config.E     // Catch: java.lang.Throwable -> L16c
                android.content.pm.ApplicationInfo r1 = android.ext.Tools.Y(r1)     // Catch: java.lang.Throwable -> L16c
                int r1 = r1.flags     // Catch: java.lang.Throwable -> L16c
                r1 = r1 & r10
                if (r1 != 0) goto L181
                android.app.AlertDialog$Builder r1 = android.ext.f.b()     // Catch: java.lang.Throwable -> L16c
                r4 = 2131296819(0x7f090233, float:1.8211565E38)
                java.lang.String r4 = android.ext.b2.f(r4)     // Catch: java.lang.Throwable -> L16c
                java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L16c
                java.lang.String r7 = android.ext.Config.F     // Catch: java.lang.Throwable -> L16c
                r8 = 0
                r5[r8] = r7     // Catch: java.lang.Throwable -> L16c
                java.lang.String r7 = android.ext.Config.F     // Catch: java.lang.Throwable -> L16c
                r5[r11] = r7     // Catch: java.lang.Throwable -> L16c
                java.lang.String r4 = android.ext.Tools.L1(r4, r5)     // Catch: java.lang.Throwable -> L16c
                android.app.AlertDialog$Builder r1 = r1.setMessage(r4)     // Catch: java.lang.Throwable -> L16c
                r4 = 2131296455(0x7f0900c7, float:1.8210827E38)
                java.lang.String r4 = android.ext.b2.f(r4)     // Catch: java.lang.Throwable -> L16c
                android.ext.r$n r5 = new android.ext.r$n     // Catch: java.lang.Throwable -> L16c
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L16c
                android.app.AlertDialog$Builder r1 = r1.setNeutralButton(r4, r5)     // Catch: java.lang.Throwable -> L16c
                java.lang.String r4 = android.ext.b2.f(r2)     // Catch: java.lang.Throwable -> L16c
                android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r4, r3)     // Catch: java.lang.Throwable -> L16c
                android.ext.f.o(r1)     // Catch: java.lang.Throwable -> L16c
                goto L181
            L16c:
                r1 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                java.lang.String r5 = android.ext.Config.E
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.ext.e1.s(r4, r1)
            L181:
                byte r1 = android.ext.Config.G
                if (r1 != 0) goto L199
                boolean r1 = android.ext.ConfigListAdapter.k()
                if (r1 == 0) goto L196
                java.lang.String r1 = android.ext.Config.E
                java.lang.String r4 = "64"
                boolean r1 = r1.contains(r4)
                if (r1 == 0) goto L196
                r10 = 1
            L196:
                android.ext.Config.G = r10
                r1 = r10
            L199:
                if (r1 != r11) goto L1cb
                android.app.AlertDialog$Builder r10 = android.ext.f.b()     // Catch: java.lang.Throwable -> L1b6
                r11 = 2131297089(0x7f090341, float:1.8212113E38)
                java.lang.String r11 = android.ext.b2.f(r11)     // Catch: java.lang.Throwable -> L1b6
                android.app.AlertDialog$Builder r10 = r10.setMessage(r11)     // Catch: java.lang.Throwable -> L1b6
                java.lang.String r11 = android.ext.b2.f(r2)     // Catch: java.lang.Throwable -> L1b6
                android.app.AlertDialog$Builder r10 = r10.setNegativeButton(r11, r3)     // Catch: java.lang.Throwable -> L1b6
                android.ext.f.o(r10)     // Catch: java.lang.Throwable -> L1b6
                goto L1cb
            L1b6:
                r10 = move-exception
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r0)
                java.lang.String r0 = android.ext.Config.E
                r11.append(r0)
                java.lang.String r11 = r11.toString()
                android.ext.e1.s(r11, r10)
            L1cb:
                return
        }
    }

    class i implements android.content.DialogInterface.OnClickListener {
        i() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.ConfigListAdapter.s()
                return
        }
    }

    class j extends android.ext.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f70a;

        j(android.ext.ConfigListAdapter r1, java.lang.String r2) {
                r0 = this;
                r0.f70a = r1
                r0.<init>(r2)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Logcat: "
                r0.append(r1)
                r1 = 2131296754(0x7f0901f2, float:1.8211434E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                android.ext.Tools.K1(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.util.GregorianCalendar r1 = new java.util.GregorianCalendar
                r1.<init>()
                java.util.Date r1 = r1.getTime()
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                r1 = 10
                r0.append(r1)
                r1 = 1
                java.lang.String r1 = android.ext.h0.f(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 3
                android.ext.Tools.h(r0, r1)
                return
        }
    }

    class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.Tools.a0 f71a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f72b;

        k(android.ext.ConfigListAdapter r1, android.ext.Tools.a0 r2) {
                r0 = this;
                r0.f72b = r1
                r0.f71a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.MainService r0 = android.ext.MainService.instance
                android.widget.ListView r0 = r0.Y
                android.ext.Tools$a0 r1 = r2.f71a
                android.ext.Tools.A1(r0, r1)
                return
        }
    }

    class l implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextPath f73a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f74b;

        l(android.ext.EditTextPath r1, android.app.AlertDialog r2) {
                r0 = this;
                r0.f73a = r1
                r0.f74b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                android.ext.EditTextPath r4 = r3.f73a
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                java.lang.String r4 = r4.trim()
                java.lang.String r4 = android.ext.Tools.Q1(r4)
                int r0 = r4.length()
                if (r0 <= 0) goto L23
                boolean r0 = android.ext.Tools.f1(r4)
                if (r0 != 0) goto L1f
                return
            L1f:
                r0 = 4
                android.ext.y0.b(r4, r0)
            L23:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "save path: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                android.ext.g2 r0 = new android.ext.g2
                r0.<init>()
                java.lang.String r1 = "temp-path"
                java.lang.String r2 = ""
                android.ext.g2 r4 = r0.k(r1, r4, r2)
                r4.commit()
                android.ext.MainService r4 = android.ext.MainService.instance
                android.ext.f0 r0 = r4.i
                java.lang.String r1 = r4.I()
                r0.B0(r1)
                r0 = 1
                r4.q(r0)
                android.app.AlertDialog r4 = r3.f74b
                android.ext.Tools.D(r4)
                return
        }
    }

    class m implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View.OnClickListener f75a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f76b;

        m(android.view.View.OnClickListener r1, android.app.AlertDialog r2) {
                r0 = this;
                r0.f75a = r1
                r0.f76b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                android.view.View$OnClickListener r2 = r1.f75a
                android.app.AlertDialog r3 = r1.f76b
                r0 = -1
                android.widget.Button r3 = r3.getButton(r0)
                r2.onClick(r3)
                return
        }
    }

    class n implements android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View.OnClickListener f77a;

        n(android.view.View.OnClickListener r1) {
                r0 = this;
                r0.f77a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r4) {
                r3 = this;
                r0 = 0
                android.view.View$OnClickListener r1 = r3.f77a
                r2 = -1
                android.ext.Tools.s1(r4, r2, r0, r1)
                return
        }
    }

    class o implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextPath f78a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.CheckBox f79b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f80c;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f81a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.ConfigListAdapter.o f82b;

            /* JADX INFO: renamed from: android.ext.ConfigListAdapter$o$a$a, reason: collision with other inner class name */
            class RunnableC0003a implements java.lang.Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ android.ext.ConfigListAdapter.o.a f83a;

                RunnableC0003a(android.ext.ConfigListAdapter.o.a r1) {
                        r0 = this;
                        r0.f83a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r3 = this;
                        android.ext.ConfigListAdapter$o$a r0 = r3.f83a
                        android.ext.ConfigListAdapter$o r1 = r0.f82b
                        java.lang.String r0 = r0.f81a
                        android.widget.CheckBox r2 = r1.f79b
                        boolean r2 = r2.isChecked()
                        r1.c(r0, r2)
                        return
                }
            }

            a(android.ext.ConfigListAdapter.o r1, java.lang.String r2) {
                    r0 = this;
                    r0.f82b = r1
                    r0.f81a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    android.ext.ConfigListAdapter$o r0 = r3.f82b
                    r0.b()
                    java.lang.String r0 = r3.f81a     // Catch: java.lang.Throwable -> L1e
                    android.ext.e2$d r0 = android.ext.e2.j(r0)     // Catch: java.lang.Throwable -> L1e
                    java.lang.String r1 = r0.f756a     // Catch: java.lang.Throwable -> L1e
                    java.lang.String r2 = "uid=0"
                    boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L1e
                    if (r1 == 0) goto L20
                    android.ext.ConfigListAdapter$o$a$a r0 = new android.ext.ConfigListAdapter$o$a$a     // Catch: java.lang.Throwable -> L1e
                    r0.<init>(r3)     // Catch: java.lang.Throwable -> L1e
                    android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L1e
                    goto L31
                L1e:
                    r0 = move-exception
                    goto L28
                L20:
                    android.ext.ConfigListAdapter$o r1 = r3.f82b     // Catch: java.lang.Throwable -> L1e
                    java.lang.String r0 = r0.f756a     // Catch: java.lang.Throwable -> L1e
                    r1.a(r0)     // Catch: java.lang.Throwable -> L1e
                    goto L31
                L28:
                    android.ext.ConfigListAdapter$o r1 = r3.f82b
                    java.lang.String r0 = r0.getMessage()
                    r1.a(r0)
                L31:
                    java.lang.String r0 = ""
                    android.ext.e2.f745a = r0
                    return
            }
        }

        class b implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.ConfigListAdapter.o f84a;

            b(android.ext.ConfigListAdapter.o r1) {
                    r0 = this;
                    r0.f84a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    android.ext.MainService r0 = android.ext.MainService.instance
                    if (r0 == 0) goto L9
                    android.ext.MainService r0 = android.ext.MainService.instance
                    r0.t()
                L9:
                    android.ext.ConfigListAdapter$o r0 = r1.f84a
                    android.app.AlertDialog r0 = r0.f80c
                    r0.hide()
                    return
            }
        }

        class c implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.ConfigListAdapter.o f85a;

            c(android.ext.ConfigListAdapter.o r1) {
                    r0 = this;
                    r0.f85a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    android.ext.ConfigListAdapter$o r0 = r1.f85a
                    android.app.AlertDialog r0 = r0.f80c
                    r0.show()
                    return
            }
        }

        o(android.ext.EditTextPath r1, android.widget.CheckBox r2, android.app.AlertDialog r3) {
                r0 = this;
                r0.f78a = r1
                r0.f79b = r2
                r0.f80c = r3
                r0.<init>()
                return
        }

        void a(java.lang.String r2) {
                r1 = this;
                android.ext.ConfigListAdapter$o$c r0 = new android.ext.ConfigListAdapter$o$c
                r0.<init>(r1)
                android.ext.n2.i(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = "\n\n"
                r0.append(r2)
                java.lang.String r2 = android.ext.e2.f745a
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r0 = 0
                android.ext.Tools.h(r2, r0)
                return
        }

        void b() {
                r1 = this;
                android.ext.ConfigListAdapter$o$b r0 = new android.ext.ConfigListAdapter$o$b
                r0.<init>(r1)
                android.ext.n2.i(r0)
                return
        }

        void c(java.lang.String r4, boolean r5) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "su path: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = "; sh: "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                android.ext.g2 r0 = new android.ext.g2
                r0.<init>()
                java.lang.String r1 = "su"
                java.lang.String r2 = ""
                android.ext.g2 r0 = r0.k(r1, r4, r2)
                java.lang.String r1 = "sh"
                r2 = 0
                android.ext.g2 r5 = r0.c(r1, r5, r2)
                r5.commit()
                int r5 = r4.length()
                if (r5 == 0) goto L3d
                r5 = 4
                android.ext.y0.b(r4, r5)
            L3d:
                android.app.AlertDialog r4 = r3.f80c
                android.ext.Tools.D(r4)
                android.ext.ConfigListAdapter.m()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                android.ext.EditTextPath r5 = r4.f78a
                android.text.Editable r5 = r5.getText()
                java.lang.String r5 = r5.toString()
                java.lang.String r5 = r5.trim()
                int r0 = r5.length()
                if (r0 <= 0) goto L33
                android.ext.n0$i r0 = new android.ext.n0$i
                android.ext.ConfigListAdapter$o$a r1 = new android.ext.ConfigListAdapter$o$a
                r1.<init>(r4, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "CheckSu: "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r0.<init>(r1, r5)
                r0.start()
                goto L3c
            L33:
                android.widget.CheckBox r0 = r4.f79b
                boolean r0 = r0.isChecked()
                r4.c(r5, r0)
            L3c:
                return
        }
    }

    class p implements java.lang.Runnable {
        p() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.ext.ConfigListAdapter.e()
                return
        }
    }

    class q implements java.util.Comparator {
        q() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "_zzz"
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r4 = 45
                r1 = 95
                java.lang.String r0 = r0.replace(r4, r1)
                java.lang.String r3 = r3.replace(r4, r1)
                int r3 = r0.compareTo(r3)
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = (java.lang.String) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    class r implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.ListAdapter f86a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.util.List f88c;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.ConfigListAdapter.r f89a;

            a(android.ext.ConfigListAdapter.r r1) {
                    r0 = this;
                    r0.f89a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r4, int r5) {
                    r3 = this;
                    android.ext.ConfigListAdapter$r r0 = r3.f89a     // Catch: java.lang.IndexOutOfBoundsException -> L11
                    java.util.List r0 = r0.f88c     // Catch: java.lang.IndexOutOfBoundsException -> L11
                    java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L11
                    java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.IndexOutOfBoundsException -> L11
                    android.ext.k.i(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L11
                    android.ext.ConfigListAdapter.m()     // Catch: java.lang.IndexOutOfBoundsException -> L11
                    goto L26
                L11:
                    r0 = move-exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Failed get locale for index: "
                    r1.append(r2)
                    r1.append(r5)
                    java.lang.String r5 = r1.toString()
                    android.ext.e1.l(r5, r0)
                L26:
                    android.ext.Tools.D(r4)
                    return
            }
        }

        r(android.widget.ListAdapter r1, int r2, java.util.List r3) {
                r0 = this;
                r0.f86a = r1
                r0.f87b = r2
                r0.f88c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.content.Context r0 = android.ext.Tools.k0()
                android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
                r1 = 2131296950(0x7f0902b6, float:1.8211831E38)
                android.view.View r1 = android.ext.Tools.g0(r1)
                android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
                android.widget.ListAdapter r1 = r4.f86a
                int r2 = r4.f87b
                android.ext.ConfigListAdapter$r$a r3 = new android.ext.ConfigListAdapter$r$a
                r3.<init>(r4)
                android.app.AlertDialog$Builder r0 = r0.setSingleChoiceItems(r1, r2, r3)
                android.ext.f.o(r0)
                return
        }
    }

    class s implements android.ext.Config.p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f90a;

        s(android.ext.ConfigListAdapter r1) {
                r0 = this;
                r0.f90a = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Config.p.a
        public int a(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1 = 1
                if (r2 != r1) goto Ld
                boolean r1 = android.ext.InternalKeyboard.a()
                if (r1 != 0) goto Ld
                android.ext.MainService.I0()
                r2 = 0
            Ld:
                return r2
        }
    }

    class t implements android.ext.Config.p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f91a;

        t(android.ext.ConfigListAdapter r1) {
                r0 = this;
                r0.f91a = r1
                r0.<init>()
                return
        }

        @Override // android.ext.Config.p.a
        public int a(android.content.DialogInterface r1, int r2) {
                r0 = this;
                int r1 = android.ext.Config.o
                if (r2 == r1) goto L7
                android.ext.ConfigListAdapter.m()
            L7:
                return r2
        }
    }

    class u implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.SeekBar f92a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.SeekBar f93b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.widget.SeekBar f94c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.widget.TextView f95d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.widget.ImageView f96e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f97f;

        u(android.ext.ConfigListAdapter r1, android.widget.SeekBar r2, android.widget.SeekBar r3, android.widget.SeekBar r4, android.widget.TextView r5, android.widget.ImageView r6) {
                r0 = this;
                r0.f97f = r1
                r0.f92a = r2
                r0.f93b = r3
                r0.f94c = r4
                r0.f95d = r5
                r0.f96e = r6
                r0.<init>()
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r7, int r8, boolean r9) {
                r6 = this;
                android.widget.SeekBar r7 = r6.f92a
                int r7 = r7.getProgress()
                int r7 = 10 - r7
                float r7 = (float) r7
                r8 = 1092616192(0x41200000, float:10.0)
                float r1 = r7 / r8
                android.widget.SeekBar r7 = r6.f93b
                int r7 = r7.getMax()
                android.widget.SeekBar r8 = r6.f93b
                int r8 = r8.getProgress()
                if (r7 != r8) goto L1e
                r7 = -1
                r2 = -1
                goto L25
            L1e:
                android.widget.SeekBar r7 = r6.f93b
                int r7 = r7.getProgress()
                r2 = r7
            L25:
                android.widget.SeekBar r7 = r6.f94c
                int r5 = r7.getProgress()
                android.ext.ConfigListAdapter r0 = r6.f97f
                android.widget.TextView r3 = r6.f95d
                android.widget.ImageView r4 = r6.f96e
                r0.w(r1, r2, r3, r4, r5)
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }
    }

    class v implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f98a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f99b;

        v(android.ext.ConfigListAdapter r1, android.ext.MainService r2) {
                r0 = this;
                r0.f99b = r1
                r0.f98a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.MainService r1 = r0.f98a
                r1.v0()
                return
        }
    }

    class w implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f100a;

        w(android.ext.ConfigListAdapter r1) {
                r0 = this;
                r0.f100a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "GG: "
                r3.append(r4)
                r4 = 1
                float r4 = (float) r4
                r0 = 1122225357(0x42e3cccd, float:113.9)
                float r0 = r0 * r4
                r1 = 1095237632(0x41480000, float:12.5)
                float r0 = r0 - r1
                r3.append(r0)
                java.lang.String r0 = " ("
                r3.append(r0)
                r1 = 1182952755(0x46826d33, float:16694.6)
                float r4 = r4 * r1
                r1 = 1141302886(0x4406e666, float:539.6)
                float r4 = r4 - r1
                r1 = 1056964608(0x3f000000, float:0.5)
                float r4 = r4 + r1
                int r4 = (int) r4
                r3.append(r4)
                java.lang.String r4 = "); Android: "
                r3.append(r4)
                java.lang.String r4 = android.os.Build.VERSION.RELEASE
                r3.append(r4)
                r3.append(r0)
                int r4 = android.os.Build.VERSION.SDK_INT
                r3.append(r4)
                java.lang.String r4 = ") ["
                r3.append(r4)
                java.lang.String r4 = android.ext.f1.x()
                r3.append(r4)
                r4 = 93
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r4 = 0
                android.ext.Tools.A(r3, r4)
                return
        }
    }

    class x implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextSpeeds f101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f102b;

        x(android.ext.ConfigListAdapter r1, android.ext.EditTextSpeeds r2) {
                r0 = this;
                r0.f102b = r1
                r0.f101a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.ext.EditTextSpeeds r2 = r1.f101a
                java.lang.String r0 = android.ext.d1.c()
                r2.setText(r0)
                return
        }
    }

    class y implements android.ext.EditTextSpeeds.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextSpeeds f103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.TextView f104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f105c;

        y(android.ext.ConfigListAdapter r1, android.ext.EditTextSpeeds r2, android.widget.TextView r3) {
                r0 = this;
                r0.f105c = r1
                r0.f103a = r2
                r0.f104b = r3
                r0.<init>()
                return
        }

        @Override // android.ext.EditTextSpeeds.a
        public void a(android.ext.EditText r1, int r2, int r3) {
                r0 = this;
                r0.c()
                return
        }

        @Override // android.ext.EditTextSpeeds.a
        public void b(android.ext.EditText r1, java.lang.CharSequence r2, int r3, int r4, int r5) {
                r0 = this;
                r0.c()
                return
        }

        public void c() {
                r7 = this;
                android.ext.EditTextSpeeds r0 = r7.f103a
                if (r0 == 0) goto L81
                android.widget.TextView r1 = r7.f104b
                if (r1 != 0) goto La
                goto L81
            La:
                android.text.Editable r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> L7e
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L7e
                java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L7e
                android.ext.EditTextSpeeds r1 = r7.f103a     // Catch: java.lang.NumberFormatException -> L7e
                int r1 = r1.getSelectionStart()     // Catch: java.lang.NumberFormatException -> L7e
                r2 = 0
                if (r1 >= 0) goto L20
                r1 = 0
            L20:
                int r3 = r0.length()     // Catch: java.lang.NumberFormatException -> L7e
                r4 = 1
                if (r1 < r3) goto L2c
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> L7e
                int r1 = r1 - r4
            L2c:
                r3 = 59
                r5 = -1
                if (r1 > 0) goto L33
                r6 = -1
                goto L39
            L33:
                int r6 = r1 + (-1)
                int r6 = r0.lastIndexOf(r3, r6)     // Catch: java.lang.NumberFormatException -> L7e
            L39:
                if (r6 >= 0) goto L3c
                goto L3d
            L3c:
                r5 = r6
            L3d:
                int r1 = r0.indexOf(r3, r1)     // Catch: java.lang.NumberFormatException -> L7e
                if (r1 >= 0) goto L47
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> L7e
            L47:
                int r5 = r5 + r4
                java.lang.String r0 = r0.substring(r5, r1)     // Catch: java.lang.NumberFormatException -> L7e
                double r0 = android.ext.Tools.j1(r0)     // Catch: java.lang.NumberFormatException -> L7e
                r5 = 0
                int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r3 <= 0) goto L7b
                android.ext.d1$a r0 = android.ext.d1.d(r0)     // Catch: java.lang.NumberFormatException -> L7e
                r1 = 2131296977(0x7f0902d1, float:1.8211886E38)
                java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.NumberFormatException -> L7e
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.NumberFormatException -> L7e
                int r5 = r0.f719b     // Catch: java.lang.NumberFormatException -> L7e
                long r5 = (long) r5     // Catch: java.lang.NumberFormatException -> L7e
                java.lang.String r5 = android.ext.Tools.g1(r5)     // Catch: java.lang.NumberFormatException -> L7e
                r3[r2] = r5     // Catch: java.lang.NumberFormatException -> L7e
                int r0 = r0.f718a     // Catch: java.lang.NumberFormatException -> L7e
                long r5 = (long) r0     // Catch: java.lang.NumberFormatException -> L7e
                java.lang.String r0 = android.ext.Tools.g1(r5)     // Catch: java.lang.NumberFormatException -> L7e
                r3[r4] = r0     // Catch: java.lang.NumberFormatException -> L7e
                java.lang.String r0 = android.ext.Tools.L1(r1, r3)     // Catch: java.lang.NumberFormatException -> L7e
                goto L83
            L7b:
                java.lang.String r0 = "??"
                goto L83
            L7e:
                java.lang.String r0 = "???"
                goto L83
            L81:
                java.lang.String r0 = "?"
            L83:
                android.widget.TextView r1 = r7.f104b
                r1.setText(r0)
                return
        }
    }

    class z implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.EditTextSpeeds f106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.ConfigListAdapter f107b;

        z(android.ext.ConfigListAdapter r1, android.ext.EditTextSpeeds r2) {
                r0 = this;
                r0.f107b = r1
                r0.f106a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.EditTextSpeeds r1 = r0.f106a
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = r1.trim()
                r2 = 16
                android.ext.y0.b(r1, r2)
                android.ext.MainService r2 = android.ext.MainService.instance
                android.ext.d1 r2 = r2.k0
                r2.g(r1)
                return
        }
    }

    static {
            java.lang.String r0 = "\td2dyno - __owner__, __design__, __pm__.\n\tEnyby - __code__, __pm__.\n\tTrasd - __tech__, __pm__.\n\tAqua - __creator__.\n"
            java.lang.String r0 = r0.intern()
            android.ext.ConfigListAdapter.DEVS = r0
            r0 = 0
            android.ext.ConfigListAdapter.f47g = r0
            r0 = 105(0x69, float:1.47E-43)
            int[] r0 = new int[r0]
            r0 = {x0054: FILL_ARRAY_DATA , data: [2131296606, 2131296535, -1, 2131296526, 2131296525, -1, 2131296523, 2131296522, 2, 2131296613, 2131296611, -1, 2131296651, 2131296650, 21, 2131296531, 2131296530, -1, 2131296657, 2131296656, 1, 2131296630, 2131296628, 6, 2131296649, 2131296648, 5, 2131296529, 2131296528, 7, 2131296947, 2131296618, 0, 2131296641, 2131296640, 8, 2131296609, 2131296608, 9, 2131296658, 2131296659, 12, 2131296669, 2131296668, 11, 2131296653, 2131296652, 20, 2131296643, 2131296642, 16, 2131296645, 2131296644, 4, 2131296661, 2131296660, 3, 2131296655, 2131296654, 10, 2131296626, 2131296623, 14, 2131296633, 2131296625, 24, 2131296637, 2131296636, -1, 2131296632, 2131296631, -1, 2131296647, 2131296646, 17, 2131296663, 2131296662, 22, 2131296616, 2131296615, 23, 2131296521, 2131296520, 13, 2131297065, 2131296664, 18, 2131296906, 2131297100, 15, 2131296381, 2131297099, -1, 2131297106, 2131297105, 19, 2131296621, 2131296620, -1, 2131296614, 2131296360, -1, 2131296639, 2131296638, 25} // fill-array
            android.ext.ConfigListAdapter.h = r0
            java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24950vhdufk0xqnqrz0zlwk0nqrzq0fkdqjhv0jdphjxdugldq2"
            java.lang.String r2 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25570vshhg0kdfn0dqg0wlph0mxps0jdphjxdugldq2"
            java.lang.String r3 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248;0krz0xvh0h|h0lfrq0jdphjxdugldq2"
            java.lang.String r4 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248<0krz0vhdufk0hqfu|swhg0ydoxh0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24970frpsduh0phwkrgv0jdphjxdugldq2"
            java.lang.String r5 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24<40klvwru|0xvdjh0jdphjxdugldq2"
            java.lang.String r6 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25550h{dpsoh0ri0udqjh0vhdufk0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25590krz0wr0vhdufk0urxqghg0ydoxh0jdphjxdugldq2"
            java.lang.String r7 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh255<0krz0wr0xvh0rughuhg0jurxs0vhdufk0jdphjxdugldq2"
            java.lang.String r8 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh248<0krz0vhdufk0hqfu|swhg0ydoxh0jdphjxdugldq2"
            java.lang.String r9 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25960h{dpsoh0ri0wkh0pdvn0vhdufk0jdphjxdugldq2"
            java.lang.String r10 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh255:0krz0wr0xvh0iloo0jdphjxdugldq2"
            java.lang.String r11 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh24<50krz0wr0vshhg0xs0vhdufk0jdphjxdugldq2"
            java.lang.String r12 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25;60{ru0vhdufk0jxlgh0jdphjxdugldq2"
            java.lang.String r13 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28:80;330wh{w0vwulqj0kh{0dre0vhdufk0jdphjxdugldq2"
            java.lang.String r14 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26690rswlrq0dgg0wr0ydoxh0gr0qrw0uhsodfh0jdphjxdugldq2"
            java.lang.String r15 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26860lpsorvlrq0qhyhu0orvh0krsh0kdfn0ohyho0klgh0iurp0wkh0jdph0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26870lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0klgh0iurp0wkh0jdph0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26930lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0uhvwduw0zlwkrxw0surwhfwlrq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26950lpsorvlrq0qhyhu0orvh0krsh0kdfn0fuhglwv0glvdeoh0surwhfwlrq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28680:530xvh0urrw0iurp0yluwxdo0vsdfh0iru0klgh0jdphjxdugldq0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;30iuhh0iluh0dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;40dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2wdjv2dss0klgh2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;80dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0pxowlsoh0dffrxqwv0jdphjxdugldq2"
            java.lang.String r16 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;80uhvwduw0zlwkrxw0surwhfwlrq0uhsdlu0wkh0uherrw0uxq0jdphjxdugldq0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;70uhvwduw0zlwkrxw0surwhfwlrq0uhsdlu0wkh0uherrw0uherrw0ghylfh0jdphjxdugldq2"
            java.lang.String r17 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh267:0krz0wr0vhdufk0ilowhu0lq0wkh0phpru|0hglwru0jdphjxdugldq2"
            java.lang.String r18 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26770krz0wr0txlfno|0vhdufk0iru0srlqwhuv0jdphjxdugldq2"
            java.lang.String r19 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26990xqudqgrpl}hu0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh26;40uxvvldq0vorwv0kdfn0vwruh0xqudqgrpl}hu0jdphjxdugldq2"
            java.lang.String r20 = "kwws=22jdphjxdugldq1qhw2qrurrw"
            java.lang.String r21 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh27480ilowhuv0jdphjxdugldq2"
            java.lang.String r22 = "kwws=22jdphjxdugldq1qhw2iruxp2ilohv2fdwhjru|290oxd0vfulswv2\r\rkwws=22jdphjxdugldq1qhw2khos2"
            java.lang.String r23 = "kwws=22jdphjxdugldq1qhw2iruxp2ilohv2iloh2:970xqdoljqhg0vhdufk2"
            java.lang.String r24 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh286:0:630irupxod0fdofxodwru0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh286;0jxq0zdu0vkrrwlqj0jdphv0kdfn0sulfh0irupxod0fdofxodwru0jdphjxdugldq2"
            java.lang.String r25 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28680:530xvh0urrw0iurp0yluwxdo0vsdfh0iru0klgh0jdphjxdugldq0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;30iuhh0iluh0dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;40dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0yluwxdo{srvhg0jdphjxdugldq2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2wdjv2dss0klgh2\r\rkwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh28;80dyrlg0ghwhfwlrq0urrw0iurp0yluwxdo0vsdfh0pxowlsoh0dffrxqwv0jdphjxdugldq2"
            java.lang.String r26 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh29470il{lqj0d0vfulsw0xvlqj0dvvhpeohu0jdphjxdugldq2"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26}
            android.ext.ConfigListAdapter.i = r0
            r0 = 0
            android.ext.ConfigListAdapter.j = r0
            return
    }

    public ConfigListAdapter() {
            r7 = this;
            r7.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r7.f49b = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r7.f50c = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r7.f51d = r0
            r0 = 0
            r7.f52e = r0
            r7.f53f = r1
            android.view.View[] r0 = d.b.f1510b
            r7.f48a = r0
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.HotPoint r0 = r0.j
            float r2 = r0.getLayoutAlpha()
            int r3 = r0.getVanishingTime()
            r4 = 0
            r5 = 0
            int r6 = r0.getSize()
            r1 = r7
            r1.w(r2, r3, r4, r5, r6)
            r7.x()
            return
    }

    public static void a(java.lang.String r6) {
            java.lang.String r0 = "mConfigTempPath onClick"
            android.ext.e1.d(r0)
            r0 = 2131099688(0x7f060028, float:1.7811736E38)
            r1 = 0
            android.view.View r0 = a.d.f(r0, r1)
            r2 = 2131034423(0x7f050137, float:1.7679363E38)
            android.view.View r2 = r0.findViewById(r2)
            android.ext.EditTextPath r2 = (android.ext.EditTextPath) r2
            android.content.SharedPreferences r3 = android.ext.Tools.M0()
            if (r6 != 0) goto L24
            java.lang.String r6 = "temp-path"
            java.lang.String r4 = ""
            java.lang.String r6 = r3.getString(r6, r4)
        L24:
            r2.setText(r6)
            r6 = 4
            r2.setDataType(r6)
            r6 = 0
            r2.setPathType(r6)
            r3 = 2131034422(0x7f050136, float:1.7679361E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 2131296852(0x7f090254, float:1.8211632E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            r4.append(r5)
            r5 = 10
            r4.append(r5)
            r5 = 2131296853(0x7f090255, float:1.8211634E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
            r3 = 2131034354(0x7f0500f2, float:1.7679223E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setTag(r2)
            android.app.AlertDialog$Builder r3 = android.ext.f.b()
            android.view.View r6 = android.ext.InternalKeyboard.e(r0, r6)
            android.app.AlertDialog$Builder r6 = r3.setView(r6)
            r3 = 2131296334(0x7f09004e, float:1.8210582E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r3, r1)
            r3 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.app.AlertDialog$Builder r6 = r6.setNegativeButton(r3, r1)
            android.app.AlertDialog r6 = r6.create()
            android.ext.ConfigListAdapter$l r1 = new android.ext.ConfigListAdapter$l
            r1.<init>(r2, r6)
            r3 = 2131034434(0x7f050142, float:1.7679385E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.Button r0 = (android.widget.Button) r0
            android.ext.v2.a(r0, r2)
            r(r6, r1, r2)
            return
    }

    public static void b() {
            boolean r0 = android.ext.f1.y()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 2131099688(0x7f060028, float:1.7811736E38)
            r1 = 0
            android.view.View r0 = a.d.f(r0, r1)
            r2 = 2131034423(0x7f050137, float:1.7679363E38)
            android.view.View r2 = r0.findViewById(r2)
            android.ext.EditTextPath r2 = (android.ext.EditTextPath) r2
            android.content.SharedPreferences r3 = android.ext.Tools.M0()
            java.lang.String r4 = ""
            java.lang.String r5 = "su"
            java.lang.String r4 = r3.getString(r5, r4)
            r2.setText(r4)
            r4 = 4
            r2.setDataType(r4)
            r4 = 1
            r2.setPathType(r4)
            r2.setHint(r5)
            r4 = 2131034422(0x7f050136, float:1.7679361E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131297002(0x7f0902ea, float:1.8211937E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            r4.setText(r5)
            r4 = 2131034437(0x7f050145, float:1.7679392E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            java.lang.String r5 = "sh"
            r6 = 0
            boolean r3 = r3.getBoolean(r5, r6)
            r4.setChecked(r3)
            r4.setVisibility(r6)
            r3 = 2131034354(0x7f0500f2, float:1.7679223E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setTag(r2)
            android.app.AlertDialog$Builder r3 = android.ext.f.b()
            android.view.View r5 = android.ext.InternalKeyboard.e(r0, r6)
            android.app.AlertDialog$Builder r3 = r3.setView(r5)
            r5 = 2131296334(0x7f09004e, float:1.8210582E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r5, r1)
            r5 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            android.app.AlertDialog$Builder r1 = r3.setNegativeButton(r5, r1)
            android.app.AlertDialog r1 = r1.create()
            android.ext.ConfigListAdapter$o r3 = new android.ext.ConfigListAdapter$o
            r3.<init>(r2, r4, r1)
            r4 = 2131034434(0x7f050142, float:1.7679385E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.Button r0 = (android.widget.Button) r0
            java.lang.String r4 = "su"
            java.lang.String r5 = "ku.sud"
            java.lang.String r6 = "/system/bin/su"
            java.lang.String r7 = "/system/xbin/su"
            java.lang.String r8 = "/su/bin/su"
            java.lang.String r9 = "/system/xbin/bstk/su"
            java.lang.String r10 = "/sbin/su"
            java.lang.String r11 = "/magisk/.core/bin/su"
            java.lang.String r12 = "/magisk/phh/bin/su"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}
            android.ext.v2 r5 = new android.ext.v2
            r5.<init>(r4, r4)
            r0.setOnClickListener(r5)
            r0.setTag(r2)
            r(r1, r3, r2)
            return
    }

    static void c() {
            android.ext.p1[][] r0 = android.ext.MainService.J0
            int r0 = r0.length
            r1 = 2
            int r0 = r0 * 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131296942(0x7f0902ae, float:1.8211815E38)
            java.lang.String r4 = android.ext.b2.f(r3)
            r2.append(r4)
            java.lang.String r4 = ", "
            r2.append(r4)
            r5 = 2131296861(0x7f09025d, float:1.821165E38)
            java.lang.String r6 = android.ext.b2.f(r5)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r6 = 0
            r0[r6] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = android.ext.b2.f(r3)
            r2.append(r3)
            r2.append(r4)
            r3 = 2131296731(0x7f0901db, float:1.8211387E38)
            java.lang.String r6 = android.ext.b2.f(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r6 = 1
            r0[r6] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r6 = 2131296921(0x7f090299, float:1.8211772E38)
            java.lang.String r7 = android.ext.b2.f(r6)
            r2.append(r7)
            r2.append(r4)
            java.lang.String r7 = android.ext.b2.f(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = android.ext.b2.f(r6)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = android.ext.b2.f(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 3
            r0[r2] = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296772(0x7f090204, float:1.821147E38)
            java.lang.String r6 = android.ext.b2.f(r2)
            r1.append(r6)
            r1.append(r4)
            java.lang.String r5 = android.ext.b2.f(r5)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r5 = 4
            r0[r5] = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = android.ext.b2.f(r2)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = android.ext.b2.f(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 5
            r0[r2] = r1
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            android.ext.ConfigListAdapter$g r2 = new android.ext.ConfigListAdapter$g
            r2.<init>(r0)
            android.app.AlertDialog$Builder r0 = r1.setItems(r0, r2)
            r1 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            android.ext.f.o(r0)
            return
    }

    static void d() {
            r0 = 2131296754(0x7f0901f2, float:1.8211434E38)
            r1 = 0
            android.ext.Tools.I1(r0, r1)
            android.ext.ConfigListAdapter$p r0 = new android.ext.ConfigListAdapter$p
            r0.<init>()
            android.ext.n2.h(r0)
            return
    }

    static void e() {
            java.lang.String r1 = " ("
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 != 0) goto L7
            return
        L7:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics
            r5.<init>()
            android.view.WindowManager r0 = r0.l
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r5)
            android.content.Context r0 = android.ext.MainService.context
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r6 = r0.getConfiguration()
            android.content.res.AssetManager r7 = r0.getAssets()
            java.lang.String[] r8 = android.ext.k.e()
            android.ext.ConfigListAdapter$q r0 = new android.ext.ConfigListAdapter$q
            r0.<init>()
            java.util.Arrays.sort(r8, r0)
            r0 = 2131296732(0x7f0901dc, float:1.8211389E38)
            java.lang.String r9 = android.ext.b2.f(r0)
            long r10 = java.lang.System.currentTimeMillis()
            int r12 = r8.length
            r14 = 0
            r0 = 0
            r15 = 0
            r16 = -1
        L4f:
            if (r15 >= r12) goto L1f9
            r17 = r8[r15]
            r18 = 1
            int r19 = r0 + 1
            if (r17 != 0) goto L61
            r18 = r4
            r22 = r8
        L5d:
            r23 = r9
            goto L1ec
        L61:
            long r20 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1d0
            long r22 = r20 - r10
            r24 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r0 <= 0) goto L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r0.<init>()     // Catch: java.lang.Throwable -> L88
            int r10 = r19 * 100
            int r11 = r8.length     // Catch: java.lang.Throwable -> L88
            int r10 = r10 / r11
            r0.append(r10)     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "%"
            r0.append(r10)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L88
            android.ext.Tools.K1(r0, r14)     // Catch: java.lang.Throwable -> L88
            r10 = r20
            goto L95
        L88:
            r0 = move-exception
            r18 = r4
            r22 = r8
            r23 = r9
            r14 = r17
            r10 = r20
            goto L1d8
        L95:
            int r0 = r17.length()     // Catch: java.lang.Throwable -> L1c3
            if (r0 != 0) goto Lb9
            java.lang.String r14 = "en_US"
            r0 = 95
            r13 = 45
            r14.replace(r0, r13)     // Catch: java.lang.Throwable -> La5
            goto Lbb
        La5:
            r0 = move-exception
            r18 = r4
            r22 = r8
            r23 = r9
            goto L1d8
        Lae:
            r0 = move-exception
            r18 = r4
            r22 = r8
            r23 = r9
        Lb5:
            r14 = r17
            goto L1d8
        Lb9:
            r14 = r17
        Lbb:
            java.util.Locale r13 = android.ext.k.d(r14)     // Catch: java.lang.Throwable -> L1bd
            r22 = r8
            java.lang.String r8 = g(r6, r13, r7, r5)     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r0 = r4.get(r8)     // Catch: java.lang.Throwable -> L1b3
            if (r0 == 0) goto Lce
            r18 = r4
            goto L5d
        Lce:
            boolean r0 = r8.startsWith(r9)     // Catch: java.lang.Throwable -> L1b3
            r23 = r9
            r24 = r10
            r9 = r16
            r10 = -1
            if (r0 == 0) goto Leb
            if (r9 != r10) goto Leb
            int r16 = r2.size()     // Catch: java.lang.Throwable -> Le2
            goto Led
        Le2:
            r0 = move-exception
            r18 = r4
            r16 = r9
        Le7:
            r10 = r24
            goto L1d8
        Leb:
            r16 = r9
        Led:
            java.lang.String r9 = ""
            java.lang.String r0 = "\n[%,.1f | %.2e]"
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L111
            r26 = -4570230032013721600(0xc093480000000000, double:-1234.0)
            java.lang.Double r17 = java.lang.Double.valueOf(r26)     // Catch: java.lang.Throwable -> L111
            r20 = 0
            r11[r20] = r17     // Catch: java.lang.Throwable -> L111
            r26 = -5773362413281678717(0xafe0e57944c0ea83, double:-4.56E-78)
            java.lang.Double r17 = java.lang.Double.valueOf(r26)     // Catch: java.lang.Throwable -> L111
            r11[r18] = r17     // Catch: java.lang.Throwable -> L111
            java.lang.String r9 = java.lang.String.format(r13, r0, r11)     // Catch: java.lang.Throwable -> L111
            goto L115
        L111:
            r0 = move-exception
            android.ext.e1.a(r0)     // Catch: java.lang.Throwable -> L1ae
        L115:
            r4.put(r8, r14)     // Catch: java.lang.Throwable -> L1ae
            r2.add(r14)     // Catch: java.lang.Throwable -> L1ae
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder     // Catch: java.lang.Throwable -> L181
            r0.<init>()     // Catch: java.lang.Throwable -> L181
            java.lang.String r11 = r13.getDisplayName(r13)     // Catch: java.lang.Throwable -> L181
            r0.append(r11)     // Catch: java.lang.Throwable -> L181
            android.text.style.ForegroundColorSpan r11 = new android.text.style.ForegroundColorSpan     // Catch: java.lang.Throwable -> L181
            int r10 = android.ext.z1.d.s     // Catch: java.lang.Throwable -> L181
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L181
            int r10 = r0.length()     // Catch: java.lang.Throwable -> L181
            r8 = 33
            r18 = r4
            r4 = 0
            r0.setSpan(r11, r4, r10, r8)     // Catch: java.lang.Throwable -> L17f
            int r10 = r0.length()     // Catch: java.lang.Throwable -> L17f
            r0.append(r1)     // Catch: java.lang.Throwable -> L17f
            r0.append(r14)     // Catch: java.lang.Throwable -> L17f
            r11 = 41
            r0.append(r11)     // Catch: java.lang.Throwable -> L17f
            android.text.style.ForegroundColorSpan r11 = new android.text.style.ForegroundColorSpan     // Catch: java.lang.Throwable -> L17f
            int r4 = android.ext.z1.d.r     // Catch: java.lang.Throwable -> L17f
            r11.<init>(r4)     // Catch: java.lang.Throwable -> L17f
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L17f
            r0.setSpan(r11, r10, r4, r8)     // Catch: java.lang.Throwable -> L17f
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L17f
            r0.append(r9)     // Catch: java.lang.Throwable -> L17f
            android.text.style.RelativeSizeSpan r10 = new android.text.style.RelativeSizeSpan     // Catch: java.lang.Throwable -> L17f
            r11 = 1058642330(0x3f19999a, float:0.6)
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L17f
            int r11 = r0.length()     // Catch: java.lang.Throwable -> L17f
            r0.setSpan(r10, r4, r11, r8)     // Catch: java.lang.Throwable -> L17f
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan     // Catch: java.lang.Throwable -> L17f
            int r11 = android.ext.z1.d.t     // Catch: java.lang.Throwable -> L17f
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L17f
            int r11 = r0.length()     // Catch: java.lang.Throwable -> L17f
            r0.setSpan(r10, r4, r11, r8)     // Catch: java.lang.Throwable -> L17f
            r3.add(r0)     // Catch: java.lang.Throwable -> L17f
            goto L1a8
        L17f:
            r0 = move-exception
            goto L184
        L181:
            r0 = move-exception
            r18 = r4
        L184:
            android.ext.e1.a(r0)     // Catch: java.lang.Throwable -> L1ab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ab
            r0.<init>()     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r4 = r13.getDisplayName(r13)     // Catch: java.lang.Throwable -> L1ab
            r0.append(r4)     // Catch: java.lang.Throwable -> L1ab
            r0.append(r1)     // Catch: java.lang.Throwable -> L1ab
            r0.append(r14)     // Catch: java.lang.Throwable -> L1ab
            r4 = 41
            r0.append(r4)     // Catch: java.lang.Throwable -> L1ab
            r0.append(r9)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1ab
            r3.add(r0)     // Catch: java.lang.Throwable -> L1ab
        L1a8:
            r10 = r24
            goto L1ec
        L1ab:
            r0 = move-exception
            goto Le7
        L1ae:
            r0 = move-exception
            r18 = r4
            goto Le7
        L1b3:
            r0 = move-exception
            r18 = r4
        L1b6:
            r23 = r9
            r24 = r10
            r9 = r16
            goto L1d8
        L1bd:
            r0 = move-exception
            r18 = r4
            r22 = r8
            goto L1b6
        L1c3:
            r0 = move-exception
            r18 = r4
            r22 = r8
            r23 = r9
            r24 = r10
        L1cc:
            r9 = r16
            goto Lb5
        L1d0:
            r0 = move-exception
            r18 = r4
            r22 = r8
            r23 = r9
            goto L1cc
        L1d8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Failed check locale: "
            r4.append(r8)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            android.ext.e1.l(r4, r0)
        L1ec:
            int r15 = r15 + 1
            r4 = r18
            r0 = r19
            r8 = r22
            r9 = r23
            r14 = 0
            goto L4f
        L1f9:
            r9 = r16
            java.lang.String r0 = android.ext.k.b()
            java.util.Locale r0 = android.ext.k.d(r0)
            g(r6, r0, r7, r5)
            android.ext.k.g()
            android.ext.ArrayAdapter r0 = new android.ext.ArrayAdapter
            android.content.Context r1 = android.ext.MainService.context
            r0.<init>(r1, r3)
            android.ext.ConfigListAdapter$r r1 = new android.ext.ConfigListAdapter$r
            r1.<init>(r0, r9, r2)
            android.ext.n2.i(r1)
            return
    }

    private static void f() {
            boolean r0 = android.ext.Config.C
            if (r0 == 0) goto L21
            boolean r0 = android.ext.ConfigListAdapter.j
            if (r0 == 0) goto L9
            goto L21
        L9:
            r0 = 0
        La:
            int[] r1 = android.ext.ConfigListAdapter.h
            int r2 = r1.length
            if (r0 >= r2) goto L1e
            r2 = r1[r0]
            r3 = 2131296620(0x7f09016c, float:1.8211162E38)
            if (r2 != r3) goto L1b
            r2 = 2131296619(0x7f09016b, float:1.821116E38)
            r1[r0] = r2
        L1b:
            int r0 = r0 + 1
            goto La
        L1e:
            r0 = 1
            android.ext.ConfigListAdapter.j = r0
        L21:
            return
    }

    private static java.lang.String g(android.content.res.Configuration r2, java.util.Locale r3, android.content.res.AssetManager r4, android.util.DisplayMetrics r5) {
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>(r2)
            q(r0, r3)
            android.content.Context r2 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L13
            android.content.Context r2 = r2.createConfigurationContext(r0)     // Catch: java.lang.Throwable -> L13
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r2 = move-exception
            android.ext.e1.a(r2)
            r2 = 0
        L18:
            if (r2 != 0) goto L1f
            android.content.res.Resources r2 = new android.content.res.Resources
            r2.<init>(r4, r5, r0)
        L1f:
            java.lang.String r4 = "%,d;%,d;%e;%e;%e;%e;"
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L6d
            r0 = 1234567890(0x499602d2, float:1228890.2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L6d
            r1 = 0
            r5[r1] = r0     // Catch: java.lang.Exception -> L6d
            r0 = -1234567890(0xffffffffb669fd2e, float:-3.4867076E-6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L6d
            r1 = 1
            r5[r1] = r0     // Catch: java.lang.Exception -> L6d
            r0 = 9096566307362129385(0x7e3d7edc621b45e9, double:1.23456E300)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Exception -> L6d
            r1 = 2
            r5[r1] = r0     // Catch: java.lang.Exception -> L6d
            r0 = -126805729492646423(0xfe3d7edc621b45e9, double:-1.23456E300)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Exception -> L6d
            r1 = 3
            r5[r1] = r0     // Catch: java.lang.Exception -> L6d
            r0 = 120036927227341818(0x1aa74f30750abfa, double:1.23456E-300)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Exception -> L6d
            r1 = 4
            r5[r1] = r0     // Catch: java.lang.Exception -> L6d
            r0 = -9103335109627433990(0x81aa74f30750abfa, double:-1.23456E-300)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Exception -> L6d
            r1 = 5
            r5[r1] = r0     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = java.lang.String.format(r3, r4, r5)     // Catch: java.lang.Exception -> L6d
            goto L73
        L6d:
            r3 = move-exception
            android.ext.e1.a(r3)
            java.lang.String r3 = ""
        L73:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 2131296732(0x7f0901dc, float:1.8211389E38)
            java.lang.String r2 = r2.getString(r5)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            return r2
    }

    public static android.content.DialogInterface.OnClickListener h() {
            android.ext.ConfigListAdapter$i r0 = new android.ext.ConfigListAdapter$i
            r0.<init>()
            return r0
    }

    public static java.lang.String i() {
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mc"
            r4 = 0
            long r6 = r0.getLong(r3, r4)
            r1.remove(r3)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L2d
            java.lang.String r0 = "&mc="
            r2.append(r0)
            r0 = 61
            r2.append(r0)
            java.lang.String r0 = java.lang.Long.toHexString(r6)
            r2.append(r0)
        L2d:
            r1.commit()
            java.lang.String r0 = r2.toString()
            return r0
    }

    static void j(int r15) {
            java.lang.String r0 = ": "
            java.lang.String r1 = "; "
            java.lang.String r2 = "hide-icon"
            r3 = 0
            r4 = 3
            if (r15 != r4) goto L16
            android.content.SharedPreferences r5 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L13
            int r5 = r5.getInt(r2, r3)     // Catch: java.lang.Throwable -> L13
            goto L17
        L13:
            r0 = move-exception
            goto L139
        L16:
            r5 = r15
        L17:
            r6 = 1
            if (r5 != r6) goto L20
            android.ext.r r7 = android.ext.r.n     // Catch: java.lang.Throwable -> L13
            boolean r7 = r7 instanceof catch_.me_.if_.you_.can_.MainActivity     // Catch: java.lang.Throwable -> L13
            if (r7 != 0) goto L29
        L20:
            r7 = 2
            if (r5 != r7) goto L55
            android.ext.r r8 = android.ext.r.n     // Catch: java.lang.Throwable -> L13
            boolean r8 = r8 instanceof catch_.me_.if_.you_.can_.ActivityMain     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L55
        L29:
            if (r15 == r4) goto L54
            android.app.AlertDialog$Builder r0 = android.ext.f.b()     // Catch: java.lang.Throwable -> L13
            r1 = 2131296679(0x7f0901a7, float:1.8211281E38)
            android.view.View r1 = android.ext.Tools.g0(r1)     // Catch: java.lang.Throwable -> L13
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)     // Catch: java.lang.Throwable -> L13
            r1 = 2131296312(0x7f090038, float:1.8210537E38)
            java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L13
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)     // Catch: java.lang.Throwable -> L13
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L13
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)     // Catch: java.lang.Throwable -> L13
            android.ext.f.o(r0)     // Catch: java.lang.Throwable -> L13
        L54:
            return
        L55:
            java.lang.String r8 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L13
            android.content.pm.PackageManager r9 = android.ext.Tools.B0()     // Catch: java.lang.Throwable -> L13
            android.content.ComponentName r10 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L13
            java.lang.Class<catch_.me_.if_.you_.can_.ActivityMain> r11 = catch_.me_.if_.you_.can_.ActivityMain.class
            java.lang.String r11 = r11.getName()     // Catch: java.lang.Throwable -> L13
            r10.<init>(r8, r11)     // Catch: java.lang.Throwable -> L13
            android.content.ComponentName r11 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L13
            java.lang.Class<catch_.me_.if_.you_.can_.MainActivity> r12 = catch_.me_.if_.you_.can_.MainActivity.class
            java.lang.String r12 = r12.getName()     // Catch: java.lang.Throwable -> L13
            r11.<init>(r8, r12)     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r8.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r12 = "hide A: "
            r8.append(r12)     // Catch: java.lang.Throwable -> L13
            r8.append(r5)     // Catch: java.lang.Throwable -> L13
            r8.append(r1)     // Catch: java.lang.Throwable -> L13
            r8.append(r11)     // Catch: java.lang.Throwable -> L13
            r8.append(r0)     // Catch: java.lang.Throwable -> L13
            int r12 = r9.getComponentEnabledSetting(r11)     // Catch: java.lang.Throwable -> L13
            r8.append(r12)     // Catch: java.lang.Throwable -> L13
            r8.append(r1)     // Catch: java.lang.Throwable -> L13
            r8.append(r10)     // Catch: java.lang.Throwable -> L13
            r8.append(r0)     // Catch: java.lang.Throwable -> L13
            int r12 = r9.getComponentEnabledSetting(r10)     // Catch: java.lang.Throwable -> L13
            r8.append(r12)     // Catch: java.lang.Throwable -> L13
            r12 = 59
            r8.append(r12)     // Catch: java.lang.Throwable -> L13
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L13
            android.ext.e1.d(r8)     // Catch: java.lang.Throwable -> L13
            if (r15 != r4) goto Lcf
            int r8 = r9.getComponentEnabledSetting(r11)     // Catch: java.lang.Throwable -> L13
            if (r8 != r7) goto Lb6
            r8 = 1
            goto Lb7
        Lb6:
            r8 = 0
        Lb7:
            int r13 = r9.getComponentEnabledSetting(r10)     // Catch: java.lang.Throwable -> L13
            r14 = 10
            if (r13 != r7) goto Lc2
            r13 = 10
            goto Lc3
        Lc2:
            r13 = 0
        Lc3:
            int r8 = r8 + r13
            if (r5 != r6) goto Lc8
            r14 = 1
            goto Lcc
        Lc8:
            if (r5 != r7) goto Lcb
            goto Lcc
        Lcb:
            r14 = 0
        Lcc:
            if (r8 != r14) goto Lcf
            return
        Lcf:
            if (r5 == r6) goto Ld4
            android.ext.Tools.w1(r6, r11, r6)     // Catch: java.lang.Throwable -> L13
        Ld4:
            if (r5 == r7) goto Ld9
            android.ext.Tools.w1(r4, r10, r6)     // Catch: java.lang.Throwable -> L13
        Ld9:
            if (r5 != r6) goto Ldf
            r8 = 5
            android.ext.Tools.w1(r8, r11, r7)     // Catch: java.lang.Throwable -> L13
        Ldf:
            if (r5 != r7) goto Le5
            r8 = 7
            android.ext.Tools.w1(r8, r10, r7)     // Catch: java.lang.Throwable -> L13
        Le5:
            if (r5 == r6) goto Lec
            r8 = 9
            android.ext.Tools.w1(r8, r11, r6)     // Catch: java.lang.Throwable -> L13
        Lec:
            if (r5 == r7) goto Lf3
            r7 = 11
            android.ext.Tools.w1(r7, r10, r6)     // Catch: java.lang.Throwable -> L13
        Lf3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r6.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = "hide Z: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L13
            r6.append(r5)     // Catch: java.lang.Throwable -> L13
            r6.append(r1)     // Catch: java.lang.Throwable -> L13
            r6.append(r11)     // Catch: java.lang.Throwable -> L13
            r6.append(r0)     // Catch: java.lang.Throwable -> L13
            int r7 = r9.getComponentEnabledSetting(r11)     // Catch: java.lang.Throwable -> L13
            r6.append(r7)     // Catch: java.lang.Throwable -> L13
            r6.append(r1)     // Catch: java.lang.Throwable -> L13
            r6.append(r10)     // Catch: java.lang.Throwable -> L13
            r6.append(r0)     // Catch: java.lang.Throwable -> L13
            int r0 = r9.getComponentEnabledSetting(r10)     // Catch: java.lang.Throwable -> L13
            r6.append(r0)     // Catch: java.lang.Throwable -> L13
            r6.append(r12)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L13
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L13
            if (r15 == r4) goto L14d
            android.ext.g2 r0 = new android.ext.g2     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            android.ext.g2 r0 = r0.g(r2, r5, r3)     // Catch: java.lang.Throwable -> L13
            r0.commit()     // Catch: java.lang.Throwable -> L13
            goto L14d
        L139:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed disable icon "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            android.ext.e1.l(r15, r0)
        L14d:
            return
    }

    public static boolean k() {
            r0 = 0
            java.lang.String[] r1 = android.os.Build.SUPPORTED_64_BIT_ABIS     // Catch: java.lang.Throwable -> Lb
            r2 = 1
            if (r1 == 0) goto Ld
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lb
            if (r1 <= 0) goto Ld
            r1 = 1
            goto Le
        Lb:
            r1 = move-exception
            goto L4f
        Ld:
            r1 = 0
        Le:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "/proc/self/auxv"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L48
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L48
            int r5 = r3.read(r4)     // Catch: java.lang.Throwable -> L48
            r3.close()     // Catch: java.lang.Throwable -> L48
            if (r5 <= 0) goto L64
            int r3 = r5 % 16
            r6 = 8
            if (r3 != r6) goto L29
            return r0
        L29:
            r3 = 0
        L2a:
            if (r3 >= r5) goto L4e
            int r6 = r3 + 4
            r6 = r4[r6]     // Catch: java.lang.Throwable -> L48
            if (r6 != 0) goto L4d
            int r6 = r3 + 5
            r6 = r4[r6]     // Catch: java.lang.Throwable -> L48
            if (r6 != 0) goto L4d
            int r6 = r3 + 6
            r6 = r4[r6]     // Catch: java.lang.Throwable -> L48
            if (r6 != 0) goto L4d
            int r6 = r3 + 7
            r6 = r4[r6]     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L45
            goto L4d
        L45:
            int r3 = r3 + 16
            goto L2a
        L48:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L4f
        L4d:
            return r0
        L4e:
            return r2
        L4f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed check 64 client. Used: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.ext.e1.s(r2, r1)
            r1 = r0
        L64:
            return r1
    }

    static void m() {
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r1 = 2131296280(0x7f090018, float:1.8210472E38)
            android.view.View r1 = android.ext.Tools.g0(r1)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
            r1 = 2131296425(0x7f0900a9, float:1.8210766E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 2131296904(0x7f090288, float:1.8211738E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.p0 r2 = new android.ext.p0
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 1
            r2.<init>(r3, r4)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r1 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            android.ext.f.o(r0)
            return
    }

    private static void n() {
            android.ext.g2 r0 = new android.ext.g2
            r0.<init>()
            java.lang.String r1 = "mc"
            long r2 = android.ext.ConfigListAdapter.f47g
            r4 = 0
            android.ext.g2 r0 = r0.i(r1, r2, r4)
            r0.commit()
            return
    }

    private void p(android.widget.TextView r3) {
            r2 = this;
            int r0 = r3.getId()
            switch(r0) {
                case 2131034151: goto L2d;
                case 2131034168: goto L29;
                case 2131034173: goto L25;
                case 2131034193: goto L21;
                case 2131034198: goto L1d;
                case 2131034205: goto L19;
                case 2131034208: goto L15;
                case 2131034211: goto L11;
                case 2131034277: goto Ld;
                case 2131034394: goto L9;
                default: goto L7;
            }
        L7:
            r0 = 0
            goto L30
        L9:
            r0 = 2130968594(0x7f040012, float:1.7545846E38)
            goto L30
        Ld:
            r0 = 2130968623(0x7f04002f, float:1.7545905E38)
            goto L30
        L11:
            r0 = 2130968617(0x7f040029, float:1.7545893E38)
            goto L30
        L15:
            r0 = 2130968604(0x7f04001c, float:1.7545866E38)
            goto L30
        L19:
            r0 = 2130968609(0x7f040021, float:1.7545876E38)
            goto L30
        L1d:
            r0 = 2130968653(0x7f04004d, float:1.7545966E38)
            goto L30
        L21:
            r0 = 2130968600(0x7f040018, float:1.7545858E38)
            goto L30
        L25:
            r0 = 2130968655(0x7f04004f, float:1.754597E38)
            goto L30
        L29:
            r0 = 2130968626(0x7f040032, float:1.754591E38)
            goto L30
        L2d:
            r0 = 2130968634(0x7f04003a, float:1.7545927E38)
        L30:
            if (r0 == 0) goto L3d
            android.graphics.drawable.Drawable r0 = android.ext.Tools.o0(r0)
            int r1 = android.ext.Config.d()
            android.ext.Tools.c(r3, r0, r1)
        L3d:
            return
    }

    public static void q(android.content.res.Configuration r1, java.util.Locale r2) {
            r1.setLocale(r2)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            r1.setLayoutDirection(r2)     // Catch: java.lang.Throwable -> Lc
            goto L10
        Lc:
            r0 = move-exception
            android.ext.e1.a(r0)
        L10:
            r1.locale = r2     // Catch: java.lang.Throwable -> L13
            goto L19
        L13:
            r1 = move-exception
            java.lang.String r2 = "Failed set locale"
            android.ext.e1.l(r2, r1)
        L19:
            return
    }

    private static void r(android.app.AlertDialog r3, android.view.View.OnClickListener r4, android.widget.EditText r5) {
            r0 = 2131296334(0x7f09004e, float:1.8210582E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.ext.ConfigListAdapter$m r1 = new android.ext.ConfigListAdapter$m
            r1.<init>(r4, r3)
            r2 = -1
            r3.setButton(r2, r0, r1)
            android.ext.ConfigListAdapter$n r0 = new android.ext.ConfigListAdapter$n
            r0.<init>(r4)
            android.ext.f.l(r3, r0)
            android.ext.f.n(r3, r5)
            return
    }

    public static void s() {
            r0 = 0
            t(r0)
            return
    }

    public static void t(int r8) {
            f()
            int[] r0 = android.ext.ConfigListAdapter.h
            int r0 = r0.length
            int r0 = r0 / 3
            int r0 = r0 + 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        Lf:
            int[] r4 = android.ext.ConfigListAdapter.h
            int r5 = r4.length
            if (r2 >= r5) goto L30
            int r5 = r2 % 3
            if (r5 != 0) goto L2d
            int r5 = r2 / 3
            int r5 = r5 + 1
            r6 = r4[r2]
            if (r8 == r6) goto L26
            int r7 = r2 + 1
            r4 = r4[r7]
            if (r8 != r4) goto L27
        L26:
            r3 = r5
        L27:
            java.lang.String r4 = android.ext.b2.f(r6)
            r0[r5] = r4
        L2d:
            int r2 = r2 + 1
            goto Lf
        L30:
            r8 = 2131297087(0x7f09033f, float:1.821211E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            r0[r1] = r8
            android.ext.ConfigListAdapter$h r8 = new android.ext.ConfigListAdapter$h
            r8.<init>()
            r1 = 0
            if (r3 != 0) goto L58
            android.app.AlertDialog$Builder r2 = android.ext.f.b()
            android.app.AlertDialog$Builder r8 = r2.setItems(r0, r8)
            r0 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r0, r1)
            android.ext.f.o(r8)
            goto L5b
        L58:
            r8.onClick(r1, r3)
        L5b:
            return
    }

    private void u() {
            r2 = this;
            android.ext.ConfigListAdapter$j r0 = new android.ext.ConfigListAdapter$j
            java.lang.String r1 = "loadLogcat"
            r0.<init>(r2, r1)
            r0.start()
            return
    }

    static void v() {
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r1 = 2131296925(0x7f09029d, float:1.821178E38)
            android.view.View r1 = android.ext.Tools.g0(r1)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
            r1 = 2131296927(0x7f09029f, float:1.8211784E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r1 = android.ext.Tools.L1(r1, r2)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.ConfigListAdapter$f r2 = new android.ext.ConfigListAdapter$f
            r2.<init>()
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.ext.f.o(r0)
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            android.view.View[] r0 = r1.f48a
            int r0 = r0.length
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View[] r2 = r0.f48a
            int r3 = r2.length
            if (r1 < r3) goto Lf
            android.view.View r1 = new android.view.View
            android.content.Context r2 = android.ext.Tools.f0()
            r1.<init>(r2)
            return r1
        Lf:
            r1 = r2[r1]
            return r1
    }

    public void l(boolean r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto Lea
            android.view.View[] r8 = r7.f48a
            int r8 = r8.length
            if (r8 <= 0) goto L9
            return
        L9:
            r8 = 2131099674(0x7f06001a, float:1.7811708E38)
            android.view.View r8 = a.d.f(r8, r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 2131034275(0x7f0500a3, float:1.7679063E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.<init>(r1)
            r7.f49b = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 2131034172(0x7f05003c, float:1.7678854E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.<init>(r1)
            r7.f50c = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 2131034171(0x7f05003b, float:1.7678852E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.<init>(r1)
            r7.f51d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L49:
            int r3 = r8.getChildCount()
            if (r2 >= r3) goto L8f
            android.view.View r3 = r8.getChildAt(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            int r4 = r3.getVisibility()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            r5 = 8
            if (r4 != r5) goto L5c
            goto L8c
        L5c:
            boolean r4 = r3 instanceof android.widget.TextView     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            if (r4 == 0) goto L7f
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            r5 = r3
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            java.lang.CharSequence r5 = r5.getText()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            java.lang.String r5 = r5.trim()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            java.lang.String r5 = android.ext.b2.g(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            r4.setText(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            r7.p(r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
        L7f:
            android.widget.AbsListView$LayoutParams r4 = new android.widget.AbsListView$LayoutParams     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            r5 = -1
            r6 = -2
            r4.<init>(r5, r6, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            r3.setLayoutParams(r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
            r0.add(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8c
        L8c:
            int r2 = r2 + 1
            goto L49
        L8f:
            java.util.Iterator r8 = r0.iterator()
        L93:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r8.next()
            android.view.View r1 = (android.view.View) r1
            android.ext.Tools.O0(r1)
            goto L93
        La3:
            int r8 = r0.size()
            android.view.View[] r8 = new android.view.View[r8]
            java.lang.Object[] r8 = r0.toArray(r8)
            android.view.View[] r8 = (android.view.View[]) r8
            r7.f48a = r8
            r7.notifyDataSetChanged()
            android.ext.MainService r8 = android.ext.MainService.instance
            android.widget.ListView r0 = r8.Y
            r0.setAdapter(r7)
            android.ext.HotPoint r8 = r8.j
            r7.o()
            float r1 = r8.getLayoutAlpha()
            int r2 = r8.getVanishingTime()
            r3 = 0
            r4 = 0
            int r5 = r8.getSize()
            r0 = r7
            r0.w(r1, r2, r3, r4, r5)
            android.ext.Tools$a0 r8 = r7.f53f
            if (r8 == 0) goto L104
            android.ext.MainService r0 = android.ext.MainService.instance
            android.widget.ListView r0 = r0.Y
            android.ext.Tools.A1(r0, r8)
            android.ext.MainService r0 = android.ext.MainService.instance
            android.widget.ListView r0 = r0.Y
            android.ext.ConfigListAdapter$k r1 = new android.ext.ConfigListAdapter$k
            r1.<init>(r7, r8)
            r0.post(r1)
            goto L104
        Lea:
            android.view.View[] r8 = r7.f48a
            int r8 = r8.length
            if (r8 != 0) goto Lf0
            return
        Lf0:
            android.ext.MainService r8 = android.ext.MainService.instance
            android.widget.ListView r8 = r8.Y
            android.ext.Tools$a0 r1 = android.ext.Tools.J0(r8)
            r7.f53f = r1
            android.view.View[] r1 = d.b.f1510b
            r7.f48a = r1
            r7.notifyDataSetChanged()
            r8.setAdapter(r0)
        L104:
            return
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r1 = this;
            boolean r0 = r1.f52e
            if (r0 != 0) goto Ld
            r0 = 1
            r1.f52e = r0
            r1.x()
            r0 = 0
            r1.f52e = r0
        Ld:
            super.notifyDataSetChanged()
            return
    }

    void o() {
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f49b
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            r1 = 2131296510(0x7f0900fe, float:1.8210939E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.MainService r2 = android.ext.MainService.instance
            android.ext.z1$d r2 = r2.v0
            if (r2 == 0) goto L1b
            java.lang.String r2 = r2.f1433b
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 == 0) goto L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = android.ext.Tools.O1(r1)
            r3.append(r1)
            java.lang.String r1 = " \""
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = "\":"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L3b:
            r0.setText(r1)
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView r17, android.view.View r18, int r19, long r20) {
            r16 = this;
            r8 = r16
            if (r18 != 0) goto L5
            return
        L5:
            int r0 = r18.getId()
            r1 = -1
            if (r0 != r1) goto Ld
            return
        Ld:
            int r1 = r19 % 63
            r2 = 1
            long r1 = r2 << r1
            long r3 = android.ext.ConfigListAdapter.f47g
            long r5 = r3 & r1
            r9 = 0
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L23
            long r1 = r1 | r3
            android.ext.ConfigListAdapter.f47g = r1
            n()
        L23:
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.Config$p r2 = android.ext.Config.b(r0)
            if (r2 == 0) goto L48
            r1 = 2131034177(0x7f050041, float:1.7678864E38)
            if (r0 != r1) goto L39
            android.ext.ConfigListAdapter$s r0 = new android.ext.ConfigListAdapter$s
            r0.<init>(r8)
        L35:
            r2.f(r0)
            goto L44
        L39:
            r1 = 2131034173(0x7f05003d, float:1.7678856E38)
            if (r0 != r1) goto L44
            android.ext.ConfigListAdapter$t r0 = new android.ext.ConfigListAdapter$t
            r0.<init>(r8)
            goto L35
        L44:
            r2.b()
            return
        L48:
            r2 = 2131296805(0x7f090225, float:1.8211537E38)
            r3 = 2131297115(0x7f09035b, float:1.8212166E38)
            r4 = 2131296334(0x7f09004e, float:1.8210582E38)
            java.lang.String r5 = " ("
            r6 = 2131296311(0x7f090037, float:1.8210535E38)
            r7 = 1
            r9 = 0
            r10 = 2131296836(0x7f090244, float:1.82116E38)
            r11 = 0
            switch(r0) {
                case 2131034113: goto L385;
                case 2131034148: goto L37a;
                case 2131034155: goto L361;
                case 2131034156: goto L339;
                case 2131034160: goto L306;
                case 2131034161: goto L2e6;
                case 2131034170: goto L24f;
                case 2131034178: goto L223;
                case 2131034179: goto L21e;
                case 2131034180: goto L1e9;
                case 2131034185: goto L1e4;
                case 2131034190: goto L1df;
                case 2131034191: goto L1da;
                case 2131034196: goto L1d4;
                case 2131034198: goto L122;
                case 2131034200: goto L11d;
                case 2131034206: goto L118;
                case 2131034208: goto L10f;
                case 2131034228: goto L103;
                case 2131034277: goto Lfe;
                case 2131034284: goto L7f;
                case 2131034394: goto L7a;
                case 2131034403: goto L75;
                default: goto L5f;
            }
        L5f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown id in config: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.ext.e1.p(r0)
            goto L3f9
        L75:
            r16.u()
            goto L3f9
        L7a:
            v()
            goto L3f9
        L7f:
            r0 = 3
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131296820(0x7f090234, float:1.8211567E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r2.append(r3)
            r2.append(r5)
            r3 = 2131296373(0x7f090075, float:1.821066E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r2.append(r3)
            r3 = 41
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1[r9] = r2
            r2 = 2131296282(0x7f09001a, float:1.8210476E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r1[r7] = r2
            r2 = 2131296281(0x7f090019, float:1.8210474E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 2
            r1[r3] = r2
            android.app.AlertDialog$Builder r2 = android.ext.f.b()
            r4 = 2131296679(0x7f0901a7, float:1.8211281E38)
            android.view.View r4 = android.ext.Tools.g0(r4)
            android.app.AlertDialog$Builder r2 = r2.setCustomTitle(r4)
            android.ext.ConfigListAdapter$c r4 = new android.ext.ConfigListAdapter$c
            r4.<init>(r8)
            android.app.AlertDialog$Builder r2 = r2.setItems(r1, r4)
            android.app.AlertDialog r2 = r2.create()
            android.widget.ListView r4 = r2.getListView()
            if (r4 == 0) goto Lf9
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            r0[r9] = r11
            r5 = 2131165191(0x7f070007, float:1.7944592E38)
            android.graphics.drawable.Drawable r5 = android.ext.Tools.o0(r5)
            r0[r7] = r5
            r5 = 2131165188(0x7f070004, float:1.7944586E38)
            android.graphics.drawable.Drawable r5 = android.ext.Tools.o0(r5)
            r0[r3] = r5
            r3 = 48
            android.ext.Tools.e(r4, r1, r0, r3, r9)
        Lf9:
            android.ext.f.m(r2)
            goto L3f9
        Lfe:
            s()
            goto L3f9
        L103:
            android.ext.r$n r0 = new android.ext.r$n
            java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2iruxp2wrslf25<;940grqdwh2"
            r0.<init>(r1)
            r0.onClick(r11, r9)
            goto L3f9
        L10f:
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.TimersEditor r0 = r0.o0
        L113:
            r0.h()
            goto L3f9
        L118:
            c()
            goto L3f9
        L11d:
            b()
            goto L3f9
        L122:
            r0 = 2131099655(0x7f060007, float:1.781167E38)
            android.view.View r0 = a.d.f(r0, r11)     // Catch: java.lang.IndexOutOfBoundsException -> L12a
            goto L133
        L12a:
            r0 = move-exception
            r1 = r0
            android.ext.e1.a(r1)
            android.ext.MainService.I0()
            r0 = r11
        L133:
            if (r0 == 0) goto L3f9
            r1 = 2131034285(0x7f0500ad, float:1.7679083E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131034328(0x7f0500d8, float:1.767917E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.CharSequence r3 = r2.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = android.ext.b2.g(r3)
            r2.setText(r3)
            r2 = 2131034413(0x7f05012d, float:1.7679343E38)
            android.view.View r2 = r0.findViewById(r2)
            android.ext.EditTextSpeeds r2 = (android.ext.EditTextSpeeds) r2
            r3 = 2131034224(0x7f050070, float:1.767896E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r7 = 2131296372(0x7f090074, float:1.8210659E38)
            java.lang.String r7 = android.ext.Tools.N1(r7)
            r5.append(r7)
            java.lang.String r7 = ": "
            r5.append(r7)
            java.lang.String r7 = android.ext.d1.c()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r3.setText(r5)
            android.ext.ConfigListAdapter$x r5 = new android.ext.ConfigListAdapter$x
            r5.<init>(r8, r2)
            r3.setOnClickListener(r5)
            android.ext.MainService r3 = android.ext.MainService.instance
            android.ext.d1 r3 = r3.k0
            java.lang.String r3 = r3.b()
            r2.setText(r3)
            r3 = 16
            r2.setDataType(r3)
            android.ext.ConfigListAdapter$y r3 = new android.ext.ConfigListAdapter$y
            r3.<init>(r8, r2, r1)
            r2.setOnChangedListener(r3)
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            android.view.View r0 = android.ext.InternalKeyboard.d(r0)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            java.lang.String r1 = android.ext.b2.f(r4)
            android.ext.ConfigListAdapter$z r3 = new android.ext.ConfigListAdapter$z
            r3.<init>(r8, r2)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r3)
            java.lang.String r1 = android.ext.b2.f(r6)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r11)
            android.ext.f.q(r0, r2)
            goto L3f9
        L1d4:
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.TimersEditor r0 = r0.n0
            goto L113
        L1da:
            r1.r(r7)
            goto L3f9
        L1df:
            android.ext.h0.h()
            goto L3f9
        L1e4:
            a(r11)
            goto L3f9
        L1e9:
            r0 = 2131099658(0x7f06000a, float:1.7811675E38)
            android.view.View r0 = a.d.f(r0, r11)
            r1 = 2131034148(0x7f050024, float:1.7678805E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = android.ext.e1.f740f
            r1.setText(r2)
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            r2 = 2131296737(0x7f0901e1, float:1.82114E38)
            android.view.View r2 = android.ext.Tools.g0(r2)
            android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
        L211:
            java.lang.String r1 = android.ext.b2.f(r10)
        L215:
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r11)
        L219:
            android.ext.f.o(r0)
            goto L3f9
        L21e:
            d()
            goto L3f9
        L223:
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r4 = 2131296726(0x7f0901d6, float:1.8211377E38)
            android.view.View r4 = android.ext.Tools.g0(r4)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r4)
            r4 = 2131296728(0x7f0901d8, float:1.821138E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r4)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.ext.ConfigListAdapter$v r4 = new android.ext.ConfigListAdapter$v
            r4.<init>(r8, r1)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r3, r4)
        L24a:
            java.lang.String r1 = android.ext.b2.f(r2)
            goto L215
        L24f:
            r0 = 2131099676(0x7f06001c, float:1.7811712E38)
            android.view.View r0 = a.d.f(r0, r11)
            r2 = 2131034430(0x7f05013e, float:1.7679377E38)
            android.view.View r2 = r0.findViewById(r2)
            r9 = r2
            android.widget.SeekBar r9 = (android.widget.SeekBar) r9
            r2 = 2131034283(0x7f0500ab, float:1.767908E38)
            android.view.View r2 = r0.findViewById(r2)
            r12 = r2
            android.widget.SeekBar r12 = (android.widget.SeekBar) r12
            r2 = 2131034405(0x7f050125, float:1.7679327E38)
            android.view.View r2 = r0.findViewById(r2)
            r13 = r2
            android.widget.SeekBar r13 = (android.widget.SeekBar) r13
            r2 = 2131034172(0x7f05003c, float:1.7678854E38)
            android.view.View r2 = r0.findViewById(r2)
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 2131034171(0x7f05003b, float:1.7678852E38)
            android.view.View r2 = r0.findViewById(r2)
            r14 = r2
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            android.ext.HotPoint r2 = r1.j
            float r2 = r2.getLayoutAlpha()
            android.ext.HotPoint r3 = r1.j
            int r3 = r3.getVanishingTime()
            android.ext.HotPoint r1 = r1.j
            int r6 = r1.getSize()
            r1 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r1 = 10 - r1
            r9.setProgress(r1)
            if (r3 >= 0) goto L2ab
            int r1 = r12.getMax()
            goto L2ac
        L2ab:
            r1 = r3
        L2ac:
            r12.setProgress(r1)
            r1 = 12
            r13.setMax(r1)
            r13.setProgress(r6)
            r1 = r16
            r4 = r7
            r5 = r14
            r1.w(r2, r3, r4, r5, r6)
            android.ext.ConfigListAdapter$u r15 = new android.ext.ConfigListAdapter$u
            r1 = r15
            r2 = r16
            r3 = r9
            r4 = r12
            r5 = r13
            r6 = r7
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.setOnSeekBarChangeListener(r15)
            r12.setOnSeekBarChangeListener(r15)
            r13.setOnSeekBarChangeListener(r15)
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            java.lang.String r2 = android.ext.b2.f(r10)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r11)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            goto L219
        L2e6:
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r1 = 2131296424(0x7f0900a8, float:1.8210764E38)
            android.view.View r1 = android.ext.Tools.g0(r1)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
            java.lang.String r1 = android.ext.b2.f(r3)
            android.ext.p0 r3 = new android.ext.p0
            r4 = 300(0x12c, float:4.2E-43)
            r3.<init>(r4)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r3)
            goto L24a
        L306:
            boolean r0 = android.ext.f1.y()
            if (r0 == 0) goto L3f9
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r2 = 2131296381(0x7f09007d, float:1.8210677E38)
            android.view.View r2 = android.ext.Tools.g0(r2)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r2)
            r2 = 2131297099(0x7f09034b, float:1.8212133E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r2)
            java.lang.String r2 = android.ext.b2.f(r10)
            android.ext.ConfigListAdapter$d r3 = new android.ext.ConfigListAdapter$d
            r3.<init>(r8, r1)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r3)
        L333:
            java.lang.String r1 = android.ext.b2.f(r6)
            goto L215
        L339:
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r1 = 2131296324(0x7f090044, float:1.8210561E38)
            android.view.View r1 = android.ext.Tools.g0(r1)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
            r1 = 2131296325(0x7f090045, float:1.8210563E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = android.ext.b2.f(r10)
            android.ext.ConfigListAdapter$e r2 = new android.ext.ConfigListAdapter$e
            r2.<init>(r8)
        L35c:
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            goto L333
        L361:
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r1 = 2131296900(0x7f090284, float:1.821173E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = android.ext.b2.f(r4)
            android.ext.ConfigListAdapter$b r2 = new android.ext.ConfigListAdapter$b
            r2.<init>(r8)
            goto L35c
        L37a:
            android.ext.ConfigListAdapter$a r0 = new android.ext.ConfigListAdapter$a
            java.lang.String r1 = "changelog"
            r0.<init>(r8, r1)
            r0.start()
            goto L3f9
        L385:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "__version__ "
            r0.append(r1)
            float r1 = (float) r7
            r2 = 1121517568(0x42d90000, float:108.5)
            float r2 = r2 * r1
            r3 = 1088631603(0x40e33333, float:7.1)
            float r2 = r2 - r3
            r0.append(r2)
            r0.append(r5)
            r2 = 1182897306(0x4681949a, float:16586.3)
            float r1 = r1 * r2
            r2 = 1138206310(0x43d7a666, float:431.3)
            float r1 = r1 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r1 = ")\n\n__developers__\n"
            r0.append(r1)
            java.lang.String r1 = android.ext.ConfigListAdapter.DEVS
            r0.append(r1)
            java.lang.String r1 = "\n__special_thanks__\n\tdanilo_scala,\n\tYoungBai,\n\tKorean L,\n\tiAndroHacker,\n\tMobile46,\n\treduxpl,\n\tjan.eike.kottlarz,\n\ttimo.szillat,\n\tSubZero5,\n\tZuiXan,\n\tAlex,\n\tGanjar Sukmara,\n\tdd09david,\n\tvenomx961,\n\tchatzopoulosapostolos,\n\tWanderMax,\n\tIvan Maldonado,\n\tvesper7dd,\n\tSelfDestruct68,\n\tmallachri,\n\tAzhar Dripana,\n\tIlya Kushnir,\n\twasao0807,\n\tAlex NG,\n\tjeroen.wilmink,\n\tpodluka,\n\tAnty0,\n\tkiilerman496,\n\tthex3only,\n\tmustafayasir6,\n\tHavergal Samosir Jr.,\n\timpykid,\n\t28ado1,\n\tElectroz,\n\tvincensius.august,\n\tRuan Carlos,\n\tNurMarvin,\n\tSkullboyq,\n\tYakiaaa,\n\tag2s20150609,\n\tanitamoellerga,\n\tcoolapk_ooops,\n\tpandecheng,\n\tpkjisoo32,\n\tLeam19999,\n\tminecraft172zzz,\n\tTodd Justin York,\n\tGedablo,\n\trootddos511,\n\t楊萬林,\n\tchetraclr,\n\tcub.madrax,\n\tntnhiu,\n\tbuivanxia10,\n\twl02082201,\n\tBacklift,\n\tvonxom,\n\tPeter Cuevas H,\n\talg1.66336611,\n\tHoangthinh99hp,\n\tJackH4L,\n\tspacemaker2906,\n\tva3kama3eredeti,\n\tAustin Andrews,\n\tsaqibpiash,\n\tsuuyout,\n\tsljivics,\n\tDartel,\n\tdoungvichetra2,\n\t0968688218channa,\n\tCaptainTF,\n\tdbinkv1,\n\tronaldmoura,\n\tlafrite.cassee,\n\tJazeks,\n\tNightMareNivek,\n\tprefix309,\n\tmilad19s,\n\tliato.games,\n\tCmP,\n\t1701silentspawn,\n\tgood7773good7773good7773,\n\tATAA SY,\n\tkhiemhocrot.98,\n\ta0193143,\n\tYaroslav,\n\tzam5355,\n\tlonglix,\n\tsssidiki4,\n\tGeorge,\n\t冰鍊,\n\tFloatKey."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            r2 = 2131296256(0x7f090000, float:1.8210424E38)
            android.view.View r2 = android.ext.Tools.g0(r2)
            android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)
            java.lang.String r0 = android.ext.b2.g(r0)
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            r1 = 2131296338(0x7f090052, float:1.821059E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.ConfigListAdapter$w r2 = new android.ext.ConfigListAdapter$w
            r2.<init>(r8)
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r1, r2)
            r1 = 2131296962(0x7f0902c2, float:1.8211855E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.r$n r2 = new android.ext.r$n
            r2.<init>(r11)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            goto L211
        L3f9:
            return
    }

    void w(float r8, int r9, android.widget.TextView r10, android.widget.ImageView r11, int r12) {
            r7 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            r1 = 0
            r2 = 1
            if (r9 >= 0) goto Le
            r3 = 2131296687(0x7f0901af, float:1.8211298E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            goto L21
        Le:
            r3 = 2131296686(0x7f0901ae, float:1.8211296E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4[r1] = r5
            java.lang.String r3 = android.ext.Tools.L1(r3, r4)
        L21:
            r4 = 2131296333(0x7f09004d, float:1.821058E38)
            java.lang.String r4 = android.ext.b2.f(r4)     // Catch: java.lang.Throwable -> L3f
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L3f
            r6 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r8
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L3f
            int r6 = 100 - r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L3f
            r5[r1] = r6     // Catch: java.lang.Throwable -> L3f
            r5[r2] = r3     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = android.ext.Tools.L1(r4, r5)     // Catch: java.lang.Throwable -> L3f
            goto L47
        L3f:
            r1 = move-exception
            java.lang.String r2 = "Fail setup string for icon config"
            android.ext.e1.l(r2, r1)
            java.lang.String r1 = "fail"
        L47:
            java.lang.ref.WeakReference r2 = r7.f50c
            java.lang.Object r2 = r2.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L54
            r2.setText(r1)
        L54:
            if (r10 == 0) goto L59
            r10.setText(r1)
        L59:
            android.ext.HotPoint r10 = r0.j
            r10.setSize(r12)
            android.ext.HotPoint r10 = r0.j
            int r10 = r10.getSizePx()
            android.ext.TimeJumpPanel r12 = r0.k
            if (r12 == 0) goto L6b
            r12.setMinSize(r10)
        L6b:
            java.lang.ref.WeakReference r12 = r7.f51d
            java.lang.Object r12 = r12.get()
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r1 = 1132396544(0x437f0000, float:255.0)
            if (r12 == 0) goto L7f
            float r2 = r8 * r1
            android.ext.Tools.y1(r12, r2)
            android.ext.Config.q(r12, r10)
        L7f:
            if (r11 == 0) goto L89
            float r1 = r1 * r8
            android.ext.Tools.y1(r11, r1)
            android.ext.Config.q(r11, r10)
        L89:
            android.ext.HotPoint r10 = r0.j
            r10.setLayoutAlpha(r8)
            android.ext.HotPoint r8 = r0.j
            r8.setVanishingTime(r9)
            android.widget.ListView r8 = r0.Y
            android.widget.ListAdapter r8 = r8.getAdapter()
            r0.V(r8)
            return
    }

    public void x() {
            r8 = this;
            android.view.View[] r0 = r8.f48a
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L3c
            r4 = r0[r3]
            boolean r5 = r4 instanceof android.widget.TextView
            if (r5 == 0) goto L39
            r5 = r4
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r4 = r4.getId()
            android.ext.Config$p r6 = android.ext.Config.b(r4)
            r7 = 2131034196(0x7f050054, float:1.7678903E38)
            if (r4 == r7) goto L25
            r7 = 2131034208(0x7f050060, float:1.7678927E38)
            if (r4 != r7) goto L23
            goto L25
        L23:
            r4 = 0
            goto L26
        L25:
            r4 = 1
        L26:
            if (r6 == 0) goto L31
            java.lang.String r4 = r6.toString()
            r5.setText(r4)
            boolean r4 = r6.f45g
        L31:
            if (r4 == 0) goto L39
            r4 = -2137746366(0xffffffff80949442, float:-1.3644838E-38)
            r5.setBackgroundColor(r4)
        L39:
            int r3 = r3 + 1
            goto L5
        L3c:
            return
    }
}
