package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class a {
    public static final luaj.Globals.d l = null;
    public static java.lang.String m;
    public static final byte[] n = null;
    public static final byte[] o = null;
    private static final luaj.LuaValue[] p = null;
    private static final luaj.h[] q = null;
    private static final f.b[] r = null;
    private static final f.d[] s = null;
    private static final int[] t = null;
    public static volatile boolean u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1699g;
    private int h;
    public final java.io.DataInputStream i;
    java.lang.String j;
    private byte[] k;

    /* JADX INFO: renamed from: luaj.a$a, reason: collision with other inner class name */
    class RunnableC0028a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ luaj.a.b f1700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ luaj.a f1701b;

        /* JADX INFO: renamed from: luaj.a$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0029a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ luaj.a.RunnableC0028a f1702a;

            DialogInterfaceOnClickListenerC0029a(luaj.a.RunnableC0028a r1) {
                    r0 = this;
                    r0.f1702a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    luaj.a$a r1 = r0.f1702a
                    luaj.a$b r1 = r1.f1700a
                    r2 = 0
                    r1.f1704a = r2
                    return
            }
        }

        /* JADX INFO: renamed from: luaj.a$a$b */
        class b implements android.content.DialogInterface.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ luaj.a.RunnableC0028a f1703a;

            b(luaj.a.RunnableC0028a r1) {
                    r0 = this;
                    r0.f1703a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface r2) {
                    r1 = this;
                    luaj.a$a r2 = r1.f1703a
                    luaj.a$b r2 = r2.f1700a
                    monitor-enter(r2)
                    luaj.a$a r0 = r1.f1703a     // Catch: java.lang.Throwable -> Le
                    luaj.a$b r0 = r0.f1700a     // Catch: java.lang.Throwable -> Le
                    r0.notify()     // Catch: java.lang.Throwable -> Le
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
                    return
                Le:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
                    throw r0
            }
        }

        RunnableC0028a(luaj.a r1, luaj.a.b r2) {
                r0 = this;
                r0.f1701b = r1
                r0.f1700a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                android.content.Context r0 = android.ext.Tools.f0()
                android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                luaj.a r2 = r6.f1701b
                java.lang.String r2 = r2.j
                r1.append(r2)
                java.lang.String r2 = "\n\n"
                r1.append(r2)
                r2 = 2131296713(0x7f0901c9, float:1.821135E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                luaj.a$b r4 = r6.f1700a
                java.lang.String r4 = r4.f1704a
                r5 = 0
                r3[r5] = r4
                java.lang.String r2 = android.ext.Tools.L1(r2, r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
                r1 = 2131296455(0x7f0900c7, float:1.8210827E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.ext.r$n r2 = new android.ext.r$n
                java.lang.String r3 = "kwws=22jdphjxdugldq1qhw2iruxp2wrslf2594440elqdu|0vfulswv0zlwk0fruuxswhg0ru0lqydolg0khdghuv2"
                r2.<init>(r3)
                android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r1, r2)
                luaj.a$a$a r1 = new luaj.a$a$a
                r1.<init>(r6)
                java.util.Random r2 = android.ext.Tools.f489a
                boolean r2 = r2.nextBoolean()
                r3 = 0
                r4 = 2131296805(0x7f090225, float:1.8211537E38)
                r5 = 2131297115(0x7f09035b, float:1.8212166E38)
                if (r2 == 0) goto L6f
                java.lang.String r2 = android.ext.b2.f(r5)
                android.app.AlertDialog$Builder r1 = r0.setPositiveButton(r2, r1)
                java.lang.String r2 = android.ext.b2.f(r4)
                r1.setNegativeButton(r2, r3)
                goto L7e
            L6f:
                java.lang.String r2 = android.ext.b2.f(r5)
                android.app.AlertDialog$Builder r1 = r0.setNegativeButton(r2, r1)
                java.lang.String r2 = android.ext.b2.f(r4)
                r1.setPositiveButton(r2, r3)
            L7e:
                android.app.AlertDialog r0 = r0.create()
                luaj.a$a$b r1 = new luaj.a$a$b
                r1.<init>(r6)
                android.ext.f.k(r0, r1)
                android.ext.f.m(r0)
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f1704a;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static final class c implements luaj.Globals.d {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(luaj.a.RunnableC0028a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.Globals.d
        public luaj.h a(java.io.InputStream r1, java.lang.String r2) {
                r0 = this;
                luaj.h r1 = luaj.a.o(r1, r2)
                return r1
        }
    }

    static {
            luaj.a$c r0 = new luaj.a$c
            r1 = 0
            r0.<init>(r1)
            luaj.a.l = r0
            luaj.a.m = r1
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [27, 76, 117, 97} // fill-array
            luaj.a.n = r0
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [25, -109, 13, 10, 26, 10} // fill-array
            luaj.a.o = r0
            r0 = 0
            luaj.LuaValue[] r1 = new luaj.LuaValue[r0]
            luaj.a.p = r1
            luaj.h[] r1 = new luaj.h[r0]
            luaj.a.q = r1
            f.b[] r1 = new f.b[r0]
            luaj.a.r = r1
            f.d[] r1 = new f.d[r0]
            luaj.a.s = r1
            int[] r1 = new int[r0]
            luaj.a.t = r1
            luaj.a.u = r0
            return
    }

    private a(java.io.InputStream r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 512(0x200, float:7.17E-43)
            byte[] r0 = new byte[r0]
            r1.k = r0
            r1.j = r3
            java.io.DataInputStream r3 = new java.io.DataInputStream
            r3.<init>(r2)
            r1.i = r3
            return
    }

    private static luaj.h a(luaj.h r2, luaj.LuaString r3) {
            luaj.LuaString r0 = r2.f1727g
            if (r0 != 0) goto L6
            r2.f1727g = r3
        L6:
            r3 = 0
        L7:
            luaj.h[] r0 = r2.f1723c
            int r1 = r0.length
            if (r3 >= r1) goto L16
            r0 = r0[r3]
            luaj.LuaString r1 = r2.f1727g
            a(r0, r1)
            int r3 = r3 + 1
            goto L7
        L16:
            return r2
    }

    public static java.lang.String b(java.lang.String r1) {
            java.lang.String r0 = "@"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "="
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L11
            goto L1c
        L11:
            java.lang.String r0 = "\u001b"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L21
            java.lang.String r1 = "=?"
            goto L21
        L1c:
            r0 = 1
            java.lang.String r1 = r1.substring(r0)
        L21:
            return r1
    }

    public static void c(luaj.Globals r1) {
            luaj.Globals$d r0 = luaj.a.l
            r1.l0 = r0
            return
    }

    public static luaj.LuaValue n(long r10) {
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r0 & r10
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            luaj.LuaNumber r10 = luaj.LuaValue.f1675g
            return r10
        Lf:
            r0 = 52
            long r0 = r10 >> r0
            r4 = 2047(0x7ff, double:1.0114E-320)
            long r0 = r0 & r4
            int r1 = (int) r0
            int r1 = r1 + (-1023)
            if (r1 < 0) goto L48
            r0 = 31
            if (r1 >= r0) goto L48
            r4 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r4 = r4 & r10
            int r0 = 52 - r1
            r6 = 1
            long r8 = r6 << r0
            long r8 = r8 - r6
            long r6 = r4 & r8
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L48
            long r4 = r4 >> r0
            int r0 = (int) r4
            r4 = 1
            int r1 = r4 << r1
            r0 = r0 | r1
            r1 = 63
            long r10 = r10 >> r1
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 == 0) goto L42
            int r10 = -r0
            long r10 = (long) r10
            goto L43
        L42:
            long r10 = (long) r0
        L43:
            luaj.LuaLong r10 = luaj.LuaLong.I2(r10)
            return r10
        L48:
            double r10 = java.lang.Double.longBitsToDouble(r10)
            luaj.LuaNumber r10 = luaj.LuaValue.J2(r10)
            return r10
    }

    public static luaj.h o(java.io.InputStream r3, java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L5
            r1 = r0
            goto L9
        L5:
            java.lang.String r1 = b(r4)
        L9:
            luaj.a r2 = new luaj.a
            r2.<init>(r3, r1)
            r2.g()
            if (r4 != 0) goto L14
            return r0
        L14:
            int r3 = r2.h
            if (r3 == 0) goto L38
            r4 = 1
            if (r3 == r4) goto L38
            r4 = 4
            if (r3 != r4) goto L1f
            goto L38
        L1f:
            luaj.d r3 = new luaj.d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "unsupported int size: "
            r4.append(r0)
            int r0 = r2.h
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L38:
            luaj.h r3 = r2.f()
            luaj.LuaString r4 = luaj.LuaString.K2(r1)
            luaj.h r3 = a(r3, r4)
            return r3
    }

    void d(luaj.h r7) {
            r6 = this;
            int r0 = r6.h()
            if (r0 <= 0) goto L9
            luaj.LuaValue[] r1 = new luaj.LuaValue[r0]
            goto Lb
        L9:
            luaj.LuaValue[] r1 = luaj.a.p
        Lb:
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r0) goto L5c
            java.io.DataInputStream r4 = r6.i
            byte r4 = r4.readByte()
            r5 = -2
            if (r4 == r5) goto L4e
            if (r4 == 0) goto L49
            r5 = 1
            if (r4 == r5) goto L39
            r5 = 3
            if (r4 == r5) goto L32
            r5 = 4
            if (r4 != r5) goto L2a
            luaj.LuaString r4 = r6.l()
            r1[r3] = r4
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "bad constant"
            r7.<init>(r0)
            throw r7
        L32:
            luaj.LuaValue r4 = r6.k()
            r1[r3] = r4
            goto L59
        L39:
            java.io.DataInputStream r4 = r6.i
            int r4 = r4.readUnsignedByte()
            if (r4 == 0) goto L44
            luaj.LuaBoolean r4 = luaj.LuaValue.f1672d
            goto L46
        L44:
            luaj.LuaBoolean r4 = luaj.LuaValue.f1673e
        L46:
            r1[r3] = r4
            goto L59
        L49:
            luaj.LuaValue r4 = luaj.LuaValue.f1671c
            r1[r3] = r4
            goto L59
        L4e:
            int r4 = r6.h()
            long r4 = (long) r4
            luaj.LuaLong r4 = luaj.LuaLong.I2(r4)
            r1[r3] = r4
        L59:
            int r3 = r3 + 1
            goto Ld
        L5c:
            r7.f1721a = r1
            int r0 = r6.h()
            if (r0 <= 0) goto L67
            luaj.h[] r1 = new luaj.h[r0]
            goto L69
        L67:
            luaj.h[] r1 = luaj.a.q
        L69:
            if (r2 >= r0) goto L74
            luaj.h r3 = r6.f()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L69
        L74:
            r7.f1723c = r1
            return
    }

    void e(luaj.h r9) {
            r8 = this;
            luaj.LuaString r0 = r8.l()
            if (r0 == 0) goto L8
            r9.f1727g = r0
        L8:
            int[] r0 = r8.j()
            r9.f1724d = r0
            int r0 = r8.h()
            if (r0 <= 0) goto L17
            f.b[] r1 = new f.b[r0]
            goto L19
        L17:
            f.b[] r1 = luaj.a.r
        L19:
            r9.f1725e = r1
            r1 = 0
            r2 = 0
        L1d:
            if (r2 >= r0) goto L37
            luaj.LuaString r3 = r8.l()
            int r4 = r8.h()
            int r5 = r8.h()
            f.b[] r6 = r9.f1725e
            f.b r7 = new f.b
            r7.<init>(r3, r4, r5)
            r6[r2] = r7
            int r2 = r2 + 1
            goto L1d
        L37:
            int r0 = r8.h()
        L3b:
            if (r1 >= r0) goto L4a
            f.d[] r2 = r9.f1726f
            r2 = r2[r1]
            luaj.LuaString r3 = r8.l()
            r2.f1563a = r3
            int r1 = r1 + 1
            goto L3b
        L4a:
            return
    }

    public luaj.h f() {
            r4 = this;
            luaj.h r0 = new luaj.h
            r0.<init>()
            int r1 = r4.h()
            r0.h = r1
            int r1 = r4.h()
            r0.i = r1
            java.io.DataInputStream r1 = r4.i
            int r1 = r1.readUnsignedByte()
            r0.j = r1
            java.io.DataInputStream r1 = r4.i
            int r1 = r1.readUnsignedByte()
            r0.k = r1
            java.io.DataInputStream r1 = r4.i
            int r1 = r1.readUnsignedByte()
            r0.l = r1
            int r2 = r0.j
            if (r1 < r2) goto L3d
            int[] r1 = r4.j()
            r0.f1722b = r1
            r4.d(r0)
            r4.m(r0)
            r4.e(r0)
            return r0
        L3d:
            luaj.d r1 = new luaj.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Damaged script 2: .maxstacksize ("
            r2.append(r3)
            int r3 = r0.l
            r2.append(r3)
            java.lang.String r3 = ") < .numparams ("
            r2.append(r3)
            int r0 = r0.j
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public void g() {
            r12 = this;
            java.io.DataInputStream r0 = r12.i
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r12.f1693a = r0
            java.io.DataInputStream r0 = r12.i
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r12.f1694b = r0
            java.io.DataInputStream r0 = r12.i
            byte r0 = r0.readByte()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            r12.f1695c = r3
            java.io.DataInputStream r3 = r12.i
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r12.f1696d = r3
            java.io.DataInputStream r3 = r12.i
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r12.f1697e = r3
            java.io.DataInputStream r3 = r12.i
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r12.f1698f = r3
            java.io.DataInputStream r3 = r12.i
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r12.f1699g = r3
            java.io.DataInputStream r3 = r12.i
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r12.h = r3
            java.lang.String r3 = ""
            int r4 = r12.f1693a
            r5 = 82
            r6 = 2
            r7 = 2131296426(0x7f0900aa, float:1.8210768E38)
            if (r4 == r5) goto Lc8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 2131297063(0x7f090327, float:1.821206E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4.append(r3)
            java.lang.String r3 = " "
            r4.append(r3)
            java.lang.String r3 = android.ext.b2.f(r7)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "'"
            r9.append(r10)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r9.append(r5)
            java.lang.String r5 = "'"
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            r8[r1] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "'"
            r5.append(r9)
            int r9 = r12.f1693a
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r5.append(r9)
            java.lang.String r9 = "'"
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            r8[r2] = r5
            java.lang.String r3 = android.ext.Tools.L1(r3, r8)
            r4.append(r3)
            java.lang.String r3 = "\n"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lc8:
            int r4 = r12.f1694b
            if (r4 == 0) goto L117
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 2131297059(0x7f090323, float:1.8212052E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4.append(r3)
            java.lang.String r3 = " "
            r4.append(r3)
            java.lang.String r3 = android.ext.b2.f(r7)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r8 = "'0'"
            r5[r1] = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "'"
            r8.append(r9)
            int r9 = r12.f1694b
            r8.append(r9)
            java.lang.String r9 = "'"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r5[r2] = r8
            java.lang.String r3 = android.ext.Tools.L1(r3, r5)
            r4.append(r3)
            java.lang.String r3 = "\n"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L117:
            r4 = 2131296840(0x7f090248, float:1.8211608E38)
            if (r0 == 0) goto L181
            if (r0 == r2) goto L181
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r3 = 2131297057(0x7f090321, float:1.8212048E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r5.append(r3)
            java.lang.String r3 = " "
            r5.append(r3)
            java.lang.String r3 = android.ext.b2.f(r7)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "'0' "
            r9.append(r10)
            java.lang.String r10 = android.ext.b2.f(r4)
            r9.append(r10)
            java.lang.String r10 = " '1'"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8[r1] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "'"
            r9.append(r10)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9.append(r0)
            java.lang.String r0 = "'"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r8[r2] = r0
            java.lang.String r0 = android.ext.Tools.L1(r3, r8)
            r5.append(r0)
            java.lang.String r0 = "\n"
            r5.append(r0)
            java.lang.String r3 = r5.toString()
        L181:
            int r0 = r12.f1696d
            r5 = 2131297062(0x7f090326, float:1.8212058E38)
            r8 = 4
            if (r0 == r8) goto L1db
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = android.ext.b2.f(r5)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.String r10 = "int"
            r9[r1] = r10
            java.lang.String r3 = android.ext.Tools.L1(r3, r9)
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            java.lang.String r3 = android.ext.b2.f(r7)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r10 = "'4'"
            r9[r1] = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "'"
            r10.append(r11)
            int r11 = r12.f1696d
            r10.append(r11)
            java.lang.String r11 = "'"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9[r2] = r10
            java.lang.String r3 = android.ext.Tools.L1(r3, r9)
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L1db:
            int r0 = r12.f1697e
            if (r0 == r8) goto L231
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = android.ext.b2.f(r5)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r9 = "size_t"
            r5[r1] = r9
            java.lang.String r3 = android.ext.Tools.L1(r3, r5)
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            java.lang.String r3 = android.ext.b2.f(r7)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r9 = "'4'"
            r5[r1] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "'"
            r9.append(r10)
            int r10 = r12.f1697e
            r9.append(r10)
            java.lang.String r10 = "'"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r5[r2] = r9
            java.lang.String r3 = android.ext.Tools.L1(r3, r5)
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L231:
            int r0 = r12.f1698f
            if (r0 == r8) goto L280
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 2131297060(0x7f090324, float:1.8212054E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            java.lang.String r3 = android.ext.b2.f(r7)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r9 = "'4'"
            r5[r1] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "'"
            r9.append(r10)
            int r10 = r12.f1698f
            r9.append(r10)
            java.lang.String r10 = "'"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r5[r2] = r9
            java.lang.String r3 = android.ext.Tools.L1(r3, r5)
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L280:
            int r0 = r12.f1699g
            if (r0 == r8) goto L2eb
            r5 = 8
            if (r0 == r5) goto L2eb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 2131297061(0x7f090325, float:1.8212056E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            java.lang.String r3 = android.ext.b2.f(r7)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "'4' "
            r6.append(r7)
            java.lang.String r4 = android.ext.b2.f(r4)
            r6.append(r4)
            java.lang.String r4 = " '8'"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5[r1] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "'"
            r4.append(r6)
            int r6 = r12.f1699g
            r4.append(r6)
            java.lang.String r6 = "'"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5[r2] = r4
            java.lang.String r3 = android.ext.Tools.L1(r3, r5)
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L2eb:
            int r0 = r3.length()
            if (r0 <= 0) goto L3ac
            boolean r0 = luaj.a.u
            r4 = 2131296716(0x7f0901cc, float:1.8211357E38)
            r5 = 2131296714(0x7f0901ca, float:1.8211352E38)
            if (r0 != 0) goto L36a
            boolean r0 = android.ext.n2.e()
            if (r0 != 0) goto L36a
            luaj.a.u = r2
            luaj.a$b r0 = new luaj.a$b
            r0.<init>()
            java.lang.String r2 = r3.trim()
            r0.f1704a = r2
            monitor-enter(r0)
            luaj.a$a r2 = new luaj.a$a     // Catch: java.lang.Throwable -> L321
            r2.<init>(r12, r0)     // Catch: java.lang.Throwable -> L321
            android.ext.n2.i(r2)     // Catch: java.lang.Throwable -> L321
            r0.wait()     // Catch: java.lang.Throwable -> L321 java.lang.InterruptedException -> L355
            java.lang.String r2 = r0.f1704a     // Catch: java.lang.Throwable -> L321
            if (r2 != 0) goto L323
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L321
            goto L3ac
        L321:
            r1 = move-exception
            goto L368
        L323:
            luaj.d r1 = new luaj.d     // Catch: java.lang.Throwable -> L321
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L321
            r2.<init>()     // Catch: java.lang.Throwable -> L321
            java.lang.String r5 = android.ext.b2.f(r5)     // Catch: java.lang.Throwable -> L321
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L321
            r2.append(r5)     // Catch: java.lang.Throwable -> L321
            java.lang.String r5 = "\n\n"
            r2.append(r5)     // Catch: java.lang.Throwable -> L321
            r2.append(r3)     // Catch: java.lang.Throwable -> L321
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch: java.lang.Throwable -> L321
            java.lang.String r3 = android.ext.b2.f(r4)     // Catch: java.lang.Throwable -> L321
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L321
            r2.append(r3)     // Catch: java.lang.Throwable -> L321
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L321
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L321
            throw r1     // Catch: java.lang.Throwable -> L321
        L355:
            r1 = move-exception
            java.lang.String r2 = "Interrupted wait"
            android.ext.e1.s(r2, r1)     // Catch: java.lang.Throwable -> L321
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L321
            r2.interrupt()     // Catch: java.lang.Throwable -> L321
            luaj.d r2 = new luaj.d     // Catch: java.lang.Throwable -> L321
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L321
            throw r2     // Catch: java.lang.Throwable -> L321
        L368:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L321
            throw r1
        L36a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "-------------------\n"
            r0.append(r6)
            java.lang.String r5 = android.ext.b2.f(r5)
            java.lang.String r5 = r5.trim()
            r0.append(r5)
            java.lang.String r5 = "\n\n"
            r0.append(r5)
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            java.lang.String r3 = android.ext.b2.f(r4)
            java.lang.String r3 = r3.trim()
            r0.append(r3)
            java.lang.String r3 = "\n-------------------\n"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r0.trim()
            android.ext.Tools.K1(r3, r2)
            java.io.PrintStream r2 = luaj.g.f1714b
            r2.println(r0)
        L3ac:
            byte[] r0 = luaj.a.o
            int r2 = r0.length
            if (r1 >= r2) goto L3f0
            java.io.DataInputStream r2 = r12.i
            byte r2 = r2.readByte()
            r3 = r0[r1]
            if (r2 != r3) goto L3be
            int r1 = r1 + 1
            goto L3ac
        L3be:
            luaj.d r3 = new luaj.d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unexpected byte in luac tail of header, index = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = " ("
            r4.append(r5)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r4.append(r2)
            java.lang.String r2 = ", not "
            r4.append(r2)
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4.append(r0)
            java.lang.String r0 = ")"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L3f0:
            return
    }

    int h() {
            r5 = this;
            java.io.DataInputStream r0 = r5.i
            byte[] r1 = r5.k
            r2 = 4
            r3 = 0
            r0.readFully(r1, r3, r2)
            boolean r0 = r5.f1695c
            r1 = 1
            r2 = 2
            r4 = 3
            if (r0 == 0) goto L2a
            byte[] r0 = r5.k
            r4 = r0[r4]
            int r4 = r4 << 24
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r2 = r2 | r4
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r2
            r0 = r0[r3]
        L26:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            goto L41
        L2a:
            byte[] r0 = r5.k
            r3 = r0[r3]
            int r3 = r3 << 24
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r1 = r1 | r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            r0 = r0[r4]
            goto L26
        L41:
            return r0
    }

    long i() {
            r7 = this;
            boolean r0 = r7.f1695c
            if (r0 == 0) goto Ld
            int r0 = r7.h()
            int r1 = r7.h()
            goto L15
        Ld:
            int r1 = r7.h()
            int r0 = r7.h()
        L15:
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            long r3 = (long) r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r0 = r1 | r3
            return r0
    }

    int[] j() {
            r7 = this;
            int r0 = r7.h()
            if (r0 != 0) goto L9
            int[] r0 = luaj.a.t
            return r0
        L9:
            int r1 = r0 << 2
            byte[] r2 = r7.k
            int r2 = r2.length
            if (r2 >= r1) goto L14
            byte[] r2 = new byte[r1]
            r7.k = r2
        L14:
            java.io.DataInputStream r2 = r7.i
            byte[] r3 = r7.k
            r4 = 0
            r2.readFully(r3, r4, r1)
            int[] r1 = new int[r0]
            r2 = 0
        L1f:
            if (r4 >= r0) goto L69
            boolean r3 = r7.f1695c
            if (r3 == 0) goto L45
            byte[] r3 = r7.k
            int r5 = r2 + 3
            r5 = r3[r5]
            int r5 = r5 << 24
            int r6 = r2 + 2
            r6 = r3[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            int r6 = r2 + 1
            r6 = r3[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            r3 = r3[r2]
        L41:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            goto L62
        L45:
            byte[] r3 = r7.k
            r5 = r3[r2]
            int r5 = r5 << 24
            int r6 = r2 + 1
            r6 = r3[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            int r6 = r2 + 2
            r6 = r3[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            int r6 = r2 + 3
            r3 = r3[r6]
            goto L41
        L62:
            r1[r4] = r3
            int r4 = r4 + 1
            int r2 = r2 + 4
            goto L1f
        L69:
            return r1
    }

    luaj.LuaValue k() {
            r2 = this;
            int r0 = r2.h
            r1 = 1
            if (r0 != r1) goto Lf
            int r0 = r2.h()
            long r0 = (long) r0
            luaj.LuaLong r0 = luaj.LuaLong.I2(r0)
            return r0
        Lf:
            long r0 = r2.i()
            luaj.LuaValue r0 = n(r0)
            return r0
    }

    luaj.LuaString l() {
            r4 = this;
            int r0 = r4.f1697e
            r1 = 8
            if (r0 != r1) goto Lc
            long r0 = r4.i()
            int r1 = (int) r0
            goto L10
        Lc:
            int r1 = r4.h()
        L10:
            if (r1 != 0) goto L14
            r0 = 0
            return r0
        L14:
            byte[] r0 = new byte[r1]
            java.io.DataInputStream r2 = r4.i
            r3 = 0
            r2.readFully(r0, r3, r1)
            int r1 = r1 + (-1)
            luaj.LuaString r0 = luaj.LuaString.p3(r0, r3, r1)
            return r0
    }

    void m(luaj.h r9) {
            r8 = this;
            int r0 = r8.h()
            if (r0 <= 0) goto L9
            f.d[] r1 = new f.d[r0]
            goto Lb
        L9:
            f.d[] r1 = luaj.a.s
        Lb:
            r9.f1726f = r1
            r1 = 0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L31
            java.io.DataInputStream r3 = r8.i
            byte r3 = r3.readByte()
            if (r3 == 0) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            java.io.DataInputStream r4 = r8.i
            byte r4 = r4.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            f.d[] r5 = r9.f1726f
            f.d r6 = new f.d
            r7 = 0
            r6.<init>(r7, r3, r4)
            r5[r2] = r6
            int r2 = r2 + 1
            goto Lf
        L31:
            return
    }
}
