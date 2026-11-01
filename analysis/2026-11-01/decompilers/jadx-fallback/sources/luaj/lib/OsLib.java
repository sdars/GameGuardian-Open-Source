package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class OsLib extends luaj.lib.TwoArgFunction {
    private static final long U = 0;
    private static long V;
    private luaj.Globals T;

    class OsLibFunc extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.OsLib T;

        public OsLibFunc(luaj.lib.OsLib r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                r0.R = r2
                r0.S = r3
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r10) {
                r9 = this;
                java.lang.String r0 = "!"
                int r1 = r9.R     // Catch: java.io.IOException -> Ld
                r2 = 2
                r3 = 0
                r4 = 1
                switch(r1) {
                    case 0: goto L11f;
                    case 1: goto L9f;
                    case 2: goto L8c;
                    case 3: goto L81;
                    case 4: goto L74;
                    case 5: goto L60;
                    case 6: goto L54;
                    case 7: goto L44;
                    case 8: goto L2a;
                    case 9: goto L1b;
                    case 10: goto L10;
                    default: goto La;
                }     // Catch: java.io.IOException -> Ld
            La:
                luaj.LuaValue r10 = luaj.LuaValue.f1674f     // Catch: java.io.IOException -> Ld
                return r10
            Ld:
                r10 = move-exception
                goto L12a
            L10:
                luaj.lib.OsLib r10 = r9.T     // Catch: java.io.IOException -> Ld
                java.lang.String r10 = luaj.lib.OsLib.e3(r10)     // Catch: java.io.IOException -> Ld
                luaj.LuaString r10 = luaj.LuaValue.K2(r10)     // Catch: java.io.IOException -> Ld
                return r10
            L1b:
                luaj.lib.OsLib r0 = r9.T     // Catch: java.io.IOException -> Ld
                luaj.LuaTable r10 = r10.c0(r4, r3)     // Catch: java.io.IOException -> Ld
                long r0 = luaj.lib.OsLib.Y2(r0, r10)     // Catch: java.io.IOException -> Ld
                luaj.LuaLong r10 = luaj.LuaValue.I2(r0)     // Catch: java.io.IOException -> Ld
                return r10
            L2a:
                luaj.lib.OsLib r0 = r9.T     // Catch: java.io.IOException -> Ld
                java.lang.String r1 = r10.Z(r4, r3)     // Catch: java.io.IOException -> Ld
                java.lang.String r3 = "all"
                java.lang.String r10 = r10.Z(r2, r3)     // Catch: java.io.IOException -> Ld
                java.lang.String r10 = luaj.lib.OsLib.d3(r0, r1, r10)     // Catch: java.io.IOException -> Ld
                if (r10 == 0) goto L41
                luaj.LuaString r10 = luaj.LuaValue.K2(r10)     // Catch: java.io.IOException -> Ld
                goto L43
            L41:
                luaj.LuaValue r10 = luaj.LuaValue.f1671c     // Catch: java.io.IOException -> Ld
            L43:
                return r10
            L44:
                luaj.lib.OsLib r0 = r9.T     // Catch: java.io.IOException -> Ld
                java.lang.String r1 = r10.E(r4)     // Catch: java.io.IOException -> Ld
                java.lang.String r10 = r10.E(r2)     // Catch: java.io.IOException -> Ld
                r0.s3(r1, r10)     // Catch: java.io.IOException -> Ld
                luaj.LuaBoolean r10 = luaj.LuaValue.f1672d     // Catch: java.io.IOException -> Ld
                return r10
            L54:
                luaj.lib.OsLib r0 = r9.T     // Catch: java.io.IOException -> Ld
                java.lang.String r10 = r10.E(r4)     // Catch: java.io.IOException -> Ld
                r0.r3(r10)     // Catch: java.io.IOException -> Ld
                luaj.LuaBoolean r10 = luaj.LuaValue.f1672d     // Catch: java.io.IOException -> Ld
                return r10
            L60:
                luaj.lib.OsLib r0 = r9.T     // Catch: java.io.IOException -> Ld
                java.lang.String r10 = r10.E(r4)     // Catch: java.io.IOException -> Ld
                java.lang.String r10 = luaj.lib.OsLib.c3(r0, r10)     // Catch: java.io.IOException -> Ld
                if (r10 == 0) goto L71
                luaj.LuaString r10 = luaj.LuaValue.K2(r10)     // Catch: java.io.IOException -> Ld
                goto L73
            L71:
                luaj.LuaValue r10 = luaj.LuaValue.f1671c     // Catch: java.io.IOException -> Ld
            L73:
                return r10
            L74:
                luaj.lib.OsLib r0 = r9.T     // Catch: java.io.IOException -> Ld
                r1 = 0
                int r10 = r10.Y(r4, r1)     // Catch: java.io.IOException -> Ld
                luaj.lib.OsLib.b3(r0, r10)     // Catch: java.io.IOException -> Ld
                luaj.LuaValue r10 = luaj.LuaValue.f1674f     // Catch: java.io.IOException -> Ld
                return r10
            L81:
                luaj.lib.OsLib r0 = r9.T     // Catch: java.io.IOException -> Ld
                java.lang.String r10 = r10.Z(r4, r3)     // Catch: java.io.IOException -> Ld
                luaj.Varargs r10 = luaj.lib.OsLib.a3(r0, r10)     // Catch: java.io.IOException -> Ld
                return r10
            L8c:
                luaj.lib.OsLib r0 = r9.T     // Catch: java.io.IOException -> Ld
                double r3 = r10.B(r4)     // Catch: java.io.IOException -> Ld
                double r1 = r10.B(r2)     // Catch: java.io.IOException -> Ld
                double r0 = luaj.lib.OsLib.Z2(r0, r3, r1)     // Catch: java.io.IOException -> Ld
                luaj.LuaNumber r10 = luaj.LuaValue.J2(r0)     // Catch: java.io.IOException -> Ld
                return r10
            L9f:
                java.lang.String r1 = "%c"
                java.lang.String r1 = r10.Z(r4, r1)     // Catch: java.io.IOException -> Ld
                boolean r5 = r10.R(r2)     // Catch: java.io.IOException -> Ld
                if (r5 == 0) goto Lb0
                long r5 = r10.i0(r2)     // Catch: java.io.IOException -> Ld
                goto Lb6
            Lb0:
                luaj.lib.OsLib r10 = r9.T     // Catch: java.io.IOException -> Ld
                long r5 = luaj.lib.OsLib.Y2(r10, r3)     // Catch: java.io.IOException -> Ld
            Lb6:
                r7 = -1
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 != 0) goto Lc2
                luaj.lib.OsLib r10 = r9.T     // Catch: java.io.IOException -> Ld
                long r5 = luaj.lib.OsLib.Y2(r10, r3)     // Catch: java.io.IOException -> Ld
            Lc2:
                r2 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r10 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r10 > 0) goto L117
                r2 = -9223372036854775(0xffdf3b645a1cac09, double:-8.772742498128102E307)
                int r10 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r10 < 0) goto L117
                boolean r10 = r1.startsWith(r0)     // Catch: java.io.IOException -> Ld
                if (r10 == 0) goto Le1
                java.lang.String r10 = "UTC"
                java.util.TimeZone r10 = java.util.TimeZone.getTimeZone(r10)     // Catch: java.io.IOException -> Ld
                goto Le5
            Le1:
                java.util.TimeZone r10 = java.util.TimeZone.getDefault()     // Catch: java.io.IOException -> Ld
            Le5:
                java.util.Calendar r10 = java.util.Calendar.getInstance(r10)     // Catch: java.io.IOException -> Ld
                r2 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 * r2
                r10.setTimeInMillis(r5)     // Catch: java.io.IOException -> Ld
                boolean r0 = r1.startsWith(r0)     // Catch: java.io.IOException -> Ld
                if (r0 == 0) goto Lfa
                java.lang.String r1 = r1.substring(r4)     // Catch: java.io.IOException -> Ld
            Lfa:
                java.lang.String r0 = "*t"
                boolean r0 = r1.equals(r0)     // Catch: java.io.IOException -> Ld
                if (r0 == 0) goto L10c
                luaj.LuaTable r0 = luaj.LuaValue.s2()     // Catch: java.io.IOException -> Ld
                luaj.lib.OsLib r1 = r9.T     // Catch: java.io.IOException -> Ld
                r1.l3(r0, r10)     // Catch: java.io.IOException -> Ld
                return r0
            L10c:
                luaj.lib.OsLib r0 = r9.T     // Catch: java.io.IOException -> Ld
                java.lang.String r10 = r0.h3(r1, r10)     // Catch: java.io.IOException -> Ld
                luaj.LuaString r10 = luaj.LuaValue.K2(r10)     // Catch: java.io.IOException -> Ld
                return r10
            L117:
                luaj.d r10 = new luaj.d     // Catch: java.io.IOException -> Ld
                java.lang.String r0 = "time result cannot be represented in this installation"
                r10.<init>(r0)     // Catch: java.io.IOException -> Ld
                throw r10     // Catch: java.io.IOException -> Ld
            L11f:
                luaj.lib.OsLib r10 = r9.T     // Catch: java.io.IOException -> Ld
                double r0 = luaj.lib.OsLib.X2(r10)     // Catch: java.io.IOException -> Ld
                luaj.LuaNumber r10 = luaj.LuaValue.J2(r0)     // Catch: java.io.IOException -> Ld
                return r10
            L12a:
                luaj.LuaValue r0 = luaj.LuaValue.f1671c
                java.lang.String r10 = r10.getMessage()
                luaj.LuaString r10 = luaj.LuaValue.K2(r10)
                int r1 = r9.R
                long r1 = (long) r1
                luaj.LuaLong r1 = luaj.LuaValue.I2(r1)
                luaj.Varargs r10 = luaj.LuaValue.M2(r0, r10, r1)
                return r10
        }
    }

    static {
            long r0 = java.lang.System.currentTimeMillis()
            luaj.lib.OsLib.U = r0
            luaj.lib.OsLib.V = r0
            return
    }

    public OsLib() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ double X2(luaj.lib.OsLib r2) {
            double r0 = r2.g3()
            return r0
    }

    static /* synthetic */ long Y2(luaj.lib.OsLib r0, luaj.LuaTable r1) {
            long r0 = r0.u3(r1)
            return r0
    }

    static /* synthetic */ double Z2(luaj.lib.OsLib r0, double r1, double r3) {
            double r0 = r0.i3(r1, r3)
            return r0
    }

    static /* synthetic */ luaj.Varargs a3(luaj.lib.OsLib r0, java.lang.String r1) {
            luaj.Varargs r0 = r0.j3(r1)
            return r0
    }

    static /* synthetic */ void b3(luaj.lib.OsLib r0, int r1) {
            r0.k3(r1)
            return
    }

    static /* synthetic */ java.lang.String c3(luaj.lib.OsLib r0, java.lang.String r1) {
            java.lang.String r0 = r0.m3(r1)
            return r0
    }

    static /* synthetic */ java.lang.String d3(luaj.lib.OsLib r0, java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = r0.t3(r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.String e3(luaj.lib.OsLib r0) {
            java.lang.String r0 = r0.v3()
            return r0
    }

    private luaj.LuaValue f3(luaj.LuaValue r2, boolean r3) {
            r1 = this;
            boolean r0 = r2.l1()
            if (r0 == 0) goto L11
            if (r3 != 0) goto L9
            goto L17
        L9:
            luaj.d r2 = new luaj.d
            java.lang.String r3 = "missing in date table"
            r2.<init>(r3)
            throw r2
        L11:
            boolean r3 = r2.i1()
            if (r3 == 0) goto L18
        L17:
            return r2
        L18:
            luaj.d r2 = new luaj.d
            java.lang.String r3 = "is not an integer"
            r2.<init>(r3)
            throw r2
    }

    private double g3() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = luaj.lib.OsLib.U
            long r0 = r0 - r2
            luaj.Globals r2 = r4.T
            int r2 = r2.b0
            long r2 = (long) r2
            long r0 = r0 - r2
            double r0 = (double) r0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            return r0
    }

    private double i3(double r1, double r3) {
            r0 = this;
            double r1 = r1 - r3
            return r1
    }

    private luaj.Varargs j3(java.lang.String r4) {
            r3 = this;
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed os.execute('"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "'): disabled by security reason"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private void k3(int r1) {
            r0 = this;
            return
    }

    private java.lang.String m3(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "'"
            r1 = 0
            if (r6 == 0) goto L49
            int r2 = r6.length()
            if (r2 != 0) goto Lc
            goto L49
        Lc:
            java.lang.String r1 = java.lang.System.getenv(r6)     // Catch: java.lang.Throwable -> L11
            goto L29
        L11:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed getenv '"
            r3.append(r4)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.ext.e1.g(r3, r2)
        L29:
            if (r1 == 0) goto L2c
            return r1
        L2c:
            java.lang.String r1 = java.lang.System.getProperty(r6)     // Catch: java.lang.Throwable -> L31
            goto L49
        L31:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed getProperty '"
            r3.append(r4)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            android.ext.e1.g(r6, r2)
        L49:
            return r1
    }

    private static luaj.LuaValue n3(byte[] r2, int r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid conversion specifier '"
            r0.append(r1)
            int r4 = r4 - r3
            luaj.LuaString r2 = luaj.LuaValue.L2(r2, r3, r4)
            r0.append(r2)
            java.lang.String r2 = "' at offset "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            r3 = 1
            java.lang.String r4 = "os.date"
            luaj.LuaValue r2 = luaj.LuaValue.l0(r3, r4, r2)
            return r2
    }

    private java.util.Calendar o3(java.util.Calendar r6) {
            r5 = this;
            r0 = 6
            int r1 = r6.get(r0)
            r2 = 7
            int r3 = r6.get(r2)
            int r3 = r3 + 5
            int r3 = r3 % r2
            r2 = 1
            int r3 = r3 + r2
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r4.setLenient(r2)
            int r6 = r6.get(r2)
            r4.set(r2, r6)
            int r1 = r1 - r3
            int r1 = r1 + 4
            r4.set(r0, r1)
            return r4
    }

    private int p3(java.util.Calendar r2) {
            r1 = this;
            java.util.Calendar r2 = r1.o3(r2)
            r0 = 6
            int r2 = r2.get(r0)
            int r2 = r2 + (-1)
            int r2 = r2 / 7
            int r2 = r2 + 1
            return r2
    }

    private int q3(java.util.Calendar r2) {
            r1 = this;
            java.util.Calendar r2 = r1.o3(r2)
            r0 = 1
            int r2 = r2.get(r0)
            return r2
    }

    private java.lang.String t3(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = "C"
            return r1
    }

    private long u3(luaj.LuaTable r8) {
            r7 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 14
            if (r8 != 0) goto L11
            luaj.Globals r8 = r7.T
            int r8 = r8.b0
            int r8 = -r8
            r0.add(r1, r8)
            goto L88
        L11:
            java.lang.String r2 = "year"
            luaj.LuaValue r3 = r8.T0(r2)     // Catch: luaj.d -> L90
            r4 = 1
            luaj.LuaValue r3 = r7.f3(r3, r4)     // Catch: luaj.d -> L90
            int r3 = r3.A0()     // Catch: luaj.d -> L90
            r0.set(r4, r3)     // Catch: luaj.d -> L90
            java.lang.String r2 = "month"
            luaj.LuaValue r3 = r8.T0(r2)     // Catch: luaj.d -> L90
            luaj.LuaValue r3 = r7.f3(r3, r4)     // Catch: luaj.d -> L90
            int r3 = r3.A0()     // Catch: luaj.d -> L90
            int r3 = r3 - r4
            r5 = 2
            r0.set(r5, r3)     // Catch: luaj.d -> L90
            java.lang.String r2 = "day"
            luaj.LuaValue r3 = r8.T0(r2)     // Catch: luaj.d -> L90
            luaj.LuaValue r3 = r7.f3(r3, r4)     // Catch: luaj.d -> L90
            int r3 = r3.A0()     // Catch: luaj.d -> L90
            r4 = 5
            r0.set(r4, r3)     // Catch: luaj.d -> L90
            java.lang.String r2 = "hour"
            luaj.LuaValue r3 = r8.T0(r2)     // Catch: luaj.d -> L90
            r4 = 0
            luaj.LuaValue r3 = r7.f3(r3, r4)     // Catch: luaj.d -> L90
            r5 = 12
            int r3 = r3.H1(r5)     // Catch: luaj.d -> L90
            r6 = 11
            r0.set(r6, r3)     // Catch: luaj.d -> L90
            java.lang.String r2 = "min"
            luaj.LuaValue r3 = r8.T0(r2)     // Catch: luaj.d -> L90
            luaj.LuaValue r3 = r7.f3(r3, r4)     // Catch: luaj.d -> L90
            int r3 = r3.H1(r4)     // Catch: luaj.d -> L90
            r0.set(r5, r3)     // Catch: luaj.d -> L90
            java.lang.String r2 = "sec"
            luaj.LuaValue r3 = r8.T0(r2)     // Catch: luaj.d -> L90
            luaj.LuaValue r3 = r7.f3(r3, r4)     // Catch: luaj.d -> L90
            int r3 = r3.H1(r4)     // Catch: luaj.d -> L90
            r5 = 13
            r0.set(r5, r3)     // Catch: luaj.d -> L90
            r0.set(r1, r4)
            r7.l3(r8, r0)
        L88:
            long r0 = r0.getTimeInMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            return r0
        L90:
            r8 = move-exception
            goto L95
        L92:
            r8 = move-exception
            java.lang.String r2 = ""
        L95:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "field '"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = "' "
            r1.append(r2)
            java.lang.String r2 = r8.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r8)
            throw r0
    }

    private java.lang.String v3() {
            r5 = this;
            java.lang.String r0 = ".gg."
            java.lang.String r1 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r0, r1)     // Catch: java.io.IOException -> L13
            r0.deleteOnExit()     // Catch: java.lang.Throwable -> Le
            r0.delete()     // Catch: java.lang.Throwable -> Le
        Le:
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.io.IOException -> L13
            return r0
        L13:
            java.lang.Class<luaj.lib.OsLib> r0 = luaj.lib.OsLib.class
            monitor-enter(r0)
            long r1 = luaj.lib.OsLib.V     // Catch: java.lang.Throwable -> L4d
            r3 = 1
            long r3 = r3 + r1
            luaj.lib.OsLib.V = r3     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = ".gg."
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ".tmp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = android.ext.Tools.b0()
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L4d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r1
    }

    private int w3(java.util.Calendar r3, boolean r4) {
            r2 = this;
            r0 = 6
            int r0 = r3.get(r0)
            r1 = 7
            int r3 = r3.get(r1)
            if (r4 == 0) goto L11
            int r3 = r3 + 5
            int r3 = r3 % r1
            int r3 = r3 + 1
        L11:
            if (r0 > r3) goto L15
            r3 = 0
            return r3
        L15:
            int r3 = r0 - r3
            int r3 = r3 % r1
            int r0 = r0 - r3
            float r4 = (float) r0
            r0 = 1088421888(0x40e00000, float:7.0)
            float r4 = r4 / r0
            double r0 = (double) r4
            double r0 = java.lang.Math.ceil(r0)
            int r4 = (int) r0
            int r0 = r4 + (-1)
            if (r3 == 0) goto L28
            goto L29
        L28:
            r4 = r0
        L29:
            return r4
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r12, luaj.LuaValue r13) {
            r11 = this;
            java.lang.String r0 = "clock"
            java.lang.String r1 = "date"
            java.lang.String r2 = "difftime"
            java.lang.String r3 = "execute"
            java.lang.String r4 = "exit"
            java.lang.String r5 = "getenv"
            java.lang.String r6 = "remove"
            java.lang.String r7 = "rename"
            java.lang.String r8 = "setlocale"
            java.lang.String r9 = "time"
            java.lang.String r10 = "tmpname"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            luaj.Globals r0 = r13.z0()
            r11.T = r0
            luaj.LuaTable r0 = new luaj.LuaTable
            r0.<init>()
            r1 = 0
        L26:
            r2 = 11
            if (r1 >= r2) goto L4d
            luaj.Globals r2 = r11.T
            boolean r2 = r2.X
            if (r2 != 0) goto L40
            r2 = 3
            if (r1 == r2) goto L4a
            r2 = 4
            if (r1 == r2) goto L4a
            r2 = 6
            if (r1 == r2) goto L4a
            r2 = 7
            if (r1 == r2) goto L4a
            r2 = 10
            if (r1 == r2) goto L4a
        L40:
            r2 = r12[r1]
            luaj.lib.OsLib$OsLibFunc r3 = new luaj.lib.OsLib$OsLibFunc
            r3.<init>(r11, r1, r2)
            r0.i2(r2, r3)
        L4a:
            int r1 = r1 + 1
            goto L26
        L4d:
            java.lang.String r12 = "os"
            r13.i2(r12, r0)
            java.lang.String r1 = "package"
            luaj.LuaValue r2 = r13.T0(r1)
            boolean r2 = r2.l1()
            if (r2 != 0) goto L6b
            luaj.LuaValue r13 = r13.T0(r1)
            java.lang.String r1 = "loaded"
            luaj.LuaValue r13 = r13.T0(r1)
            r13.i2(r12, r0)
        L6b:
            return r0
    }

    public java.lang.String h3(java.lang.String r14, java.util.Calendar r15) {
            r13 = this;
            byte[] r14 = r14.getBytes()
            int r0 = r14.length
            f.a r1 = new f.a
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r0) goto L12d
            int r4 = r3 + 1
            r5 = r14[r3]
            java.lang.String r6 = "\n"
            r7 = 10
            if (r5 == r7) goto L127
            r8 = 37
            if (r5 == r8) goto L21
            r1.a(r5)
            goto L12a
        L21:
            if (r4 < r0) goto L26
            n3(r14, r3, r4)
        L26:
            int r5 = r3 + 2
            r4 = r14[r4]
            r9 = 69
            if (r4 == r9) goto L32
            r10 = 79
            if (r4 != r10) goto L51
        L32:
            if (r5 < r0) goto L37
            n3(r14, r3, r5)
        L37:
            if (r4 != r9) goto L3c
            java.lang.String r4 = "cCxXyY"
            goto L3e
        L3c:
            java.lang.String r4 = "deHImMSuUVwwy"
        L3e:
            int r9 = r3 + 3
            r5 = r14[r5]
            r10 = r5 & 255(0xff, float:3.57E-43)
            char r10 = (char) r10
            int r4 = r4.indexOf(r10)
            r10 = -1
            if (r4 != r10) goto L4f
            n3(r14, r3, r9)
        L4f:
            r4 = r5
            r5 = r9
        L51:
            java.lang.String r9 = "%"
            r10 = 84
            r11 = 112(0x70, float:1.57E-43)
            r12 = 1
            if (r4 == r8) goto Lf7
            r8 = 77
            if (r4 == r8) goto Lfb
            if (r4 == r11) goto Lfb
            r8 = 103(0x67, float:1.44E-43)
            if (r4 == r8) goto Le7
            r8 = 104(0x68, float:1.46E-43)
            if (r4 == r8) goto Le4
            switch(r4) {
                case 65: goto Lfb;
                case 66: goto Lfb;
                case 67: goto Ldd;
                case 68: goto Lfb;
                default: goto L6b;
            }
        L6b:
            switch(r4) {
                case 70: goto Lfb;
                case 71: goto Ld6;
                case 72: goto Lfb;
                case 73: goto Lfb;
                default: goto L6e;
            }
        L6e:
            switch(r4) {
                case 82: goto Lfb;
                case 83: goto Lfb;
                case 84: goto Lfb;
                case 85: goto Ld1;
                case 86: goto Lcc;
                case 87: goto Lbd;
                case 88: goto Lba;
                case 89: goto Lfb;
                case 90: goto Lfb;
                default: goto L71;
            }
        L71:
            r8 = 5
            switch(r4) {
                case 97: goto Lfb;
                case 98: goto Lfb;
                case 99: goto Lb3;
                case 100: goto Lfb;
                case 101: goto La7;
                default: goto L75;
            }
        L75:
            switch(r4) {
                case 106: goto Lfb;
                case 107: goto Lfb;
                case 108: goto Lfb;
                case 109: goto Lfb;
                case 110: goto La3;
                default: goto L78;
            }
        L78:
            r6 = 7
            switch(r4) {
                case 114: goto Lfb;
                case 115: goto Lfb;
                case 116: goto La0;
                case 117: goto L98;
                default: goto L7c;
            }
        L7c:
            switch(r4) {
                case 119: goto L88;
                case 120: goto L84;
                case 121: goto Lfb;
                case 122: goto Lfb;
                default: goto L7f;
            }
        L7f:
            n3(r14, r3, r5)
            goto Lf7
        L84:
            r4 = 68
            goto Lfb
        L88:
            int r3 = r15.get(r6)
            int r3 = r3 + 6
            int r3 = r3 % r6
        L8f:
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L93:
            r1.b(r3)
            goto Lfa
        L98:
            int r3 = r15.get(r6)
            int r3 = r3 + r8
            int r3 = r3 % r6
            int r3 = r3 + r12
            goto L8f
        La0:
            java.lang.String r3 = "\t"
            goto L93
        La3:
            r1.b(r6)
            goto Lfa
        La7:
            int r3 = r15.get(r8)
            if (r3 >= r7) goto L8f
            java.lang.String r4 = " "
            r1.b(r4)
            goto L8f
        Lb3:
            java.lang.String r3 = "%a %b %d %H:%M:%S %Y"
            java.lang.String r3 = r13.h3(r3, r15)
            goto L93
        Lba:
            r4 = 84
            goto Lfb
        Lbd:
            int r3 = r13.w3(r15, r12)
        Lc1:
            int r3 = r3 + 100
        Lc3:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r3.substring(r12)
            goto L93
        Lcc:
            int r3 = r13.p3(r15)
            goto Lc1
        Ld1:
            int r3 = r13.w3(r15, r2)
            goto Lc1
        Ld6:
            int r3 = r13.q3(r15)
            int r3 = r3 + 10000
            goto Lc3
        Ldd:
            int r3 = r15.get(r12)
            int r3 = r3 / 100
            goto Lc1
        Le4:
            r4 = 98
            goto Lfb
        Le7:
            int r3 = r13.q3(r15)
            int r3 = r3 + 10000
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 3
            java.lang.String r3 = r3.substring(r4)
            goto L93
        Lf7:
            r1.b(r9)
        Lfa:
            r4 = 0
        Lfb:
            if (r4 == 0) goto L124
            java.util.Locale r3 = java.util.Locale.US
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            if (r4 != r11) goto L10a
            goto L10c
        L10a:
            r10 = 116(0x74, float:1.63E-43)
        L10c:
            r6.append(r10)
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r4 = (char) r4
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[r12]
            r6[r2] = r15
            java.lang.String r3 = java.lang.String.format(r3, r4, r6)
            r1.b(r3)
        L124:
            r3 = r5
            goto Lc
        L127:
            r1.b(r6)
        L12a:
            r3 = r4
            goto Lc
        L12d:
            java.lang.String r14 = r1.k()
            return r14
    }

    void l3(luaj.LuaTable r4, java.util.Calendar r5) {
            r3 = this;
            r0 = 1
            int r1 = r5.get(r0)
            long r1 = (long) r1
            luaj.LuaLong r1 = luaj.LuaValue.I2(r1)
            java.lang.String r2 = "year"
            r4.i2(r2, r1)
            r1 = 2
            int r1 = r5.get(r1)
            int r1 = r1 + r0
            long r0 = (long) r1
            luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
            java.lang.String r1 = "month"
            r4.i2(r1, r0)
            r0 = 5
            int r0 = r5.get(r0)
            long r0 = (long) r0
            luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
            java.lang.String r1 = "day"
            r4.i2(r1, r0)
            r0 = 11
            int r0 = r5.get(r0)
            long r0 = (long) r0
            luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
            java.lang.String r1 = "hour"
            r4.i2(r1, r0)
            r0 = 12
            int r0 = r5.get(r0)
            long r0 = (long) r0
            luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
            java.lang.String r1 = "min"
            r4.i2(r1, r0)
            r0 = 13
            int r0 = r5.get(r0)
            long r0 = (long) r0
            luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
            java.lang.String r1 = "sec"
            r4.i2(r1, r0)
            r0 = 7
            int r0 = r5.get(r0)
            long r0 = (long) r0
            luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
            java.lang.String r1 = "wday"
            r4.i2(r1, r0)
            r0 = 6
            int r0 = r5.get(r0)
            long r0 = (long) r0
            luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
            java.lang.String r1 = "yday"
            r4.i2(r1, r0)
            java.util.TimeZone r0 = r5.getTimeZone()
            java.util.Date r5 = r5.getTime()
            boolean r5 = r0.inDaylightTime(r5)
            luaj.LuaBoolean r5 = luaj.LuaValue.H2(r5)
            java.lang.String r0 = "isdst"
            r4.i2(r0, r5)
            return
    }

    protected void r3(java.lang.String r5) {
            r4 = this;
            luaj.Globals r0 = r4.T
            java.io.File r0 = r0.R3(r5)
            boolean r1 = r0.exists()
            java.lang.String r2 = "'"
            if (r1 == 0) goto L2f
            boolean r0 = r0.delete()
            if (r0 == 0) goto L15
            return
        L15:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Failed to delete: '"
            r1.append(r3)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L2f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "No such file or directory: '"
            r1.append(r3)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    protected void s3(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            luaj.Globals r0 = r4.T
            java.io.File r0 = r0.R3(r5)
            boolean r1 = r0.exists()
            java.lang.String r2 = "'"
            if (r1 == 0) goto L3d
            luaj.Globals r1 = r4.T
            java.io.File r1 = r1.R3(r6)
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto L1b
            return
        L1b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Failed to rename '"
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = "' to '"
            r1.append(r5)
            r1.append(r6)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L3d:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No such file or directory: '"
            r0.append(r1)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
    }
}
