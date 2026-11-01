package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Globals extends luaj.LuaTable {
    public boolean X;
    public int Y;
    public luaj.lib.e Z;
    public long a0;
    public int b0;
    public java.io.PrintStream c0;
    public java.io.PrintStream d0;
    public luaj.lib.f e0;
    public luaj.LuaThread f0;
    public luaj.lib.BaseLib g0;
    public luaj.lib.PackageLib h0;
    public luaj.lib.DebugLib i0;
    public luaj.Globals.b j0;
    public luaj.Globals.a k0;
    public luaj.Globals.d l0;
    private java.lang.String m0;

    public interface a {
        luaj.h b(java.io.InputStream r1, java.lang.String r2);
    }

    public interface b {
        luaj.LuaFunction a(luaj.h r1, java.lang.String r2, luaj.LuaValue r3);
    }

    static class c extends java.io.PushbackInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f1643b = 65;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1644a;

        static {
                return
        }

        private c(java.io.InputStream r2) {
                r1 = this;
                int r0 = luaj.Globals.c.f1643b
                r1.<init>(r2, r0)
                r2 = 0
                r1.f1644a = r2
                return
        }

        static luaj.Globals.c b(java.io.InputStream r1) {
                boolean r0 = r1 instanceof luaj.Globals.c
                if (r0 != 0) goto La
                luaj.Globals$c r0 = new luaj.Globals$c
                r0.<init>(r1)
                r1 = r0
            La:
                luaj.Globals$c r1 = (luaj.Globals.c) r1
                return r1
        }

        public luaj.Globals.c a(boolean r1) {
                r0 = this;
                r0.f1644a = r1
                return r0
        }

        @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read() {
                r4 = this;
                byte[] r0 = r4.buf
                if (r0 == 0) goto L42
                int r1 = r4.pos
                int r2 = luaj.Globals.c.f1643b
                if (r1 >= r2) goto L13
                int r2 = r1 + 1
                r4.pos = r2
                r0 = r0[r1]
                r0 = r0 & 255(0xff, float:3.57E-43)
                goto L19
            L13:
                java.io.InputStream r0 = r4.in
                int r0 = r0.read()
            L19:
                r1 = 239(0xef, float:3.35E-43)
                if (r0 != r1) goto L41
                boolean r1 = r4.f1644a
                if (r1 != 0) goto L22
                goto L41
            L22:
                int r1 = super.read()
                r2 = 187(0xbb, float:2.62E-43)
                if (r1 == r2) goto L2e
                r4.unread(r1)
                return r0
            L2e:
                int r2 = super.read()
                r3 = 191(0xbf, float:2.68E-43)
                if (r2 == r3) goto L3d
                r4.unread(r2)
                r4.unread(r1)
                return r0
            L3d:
                int r0 = r4.read()
            L41:
                return r0
            L42:
                java.io.IOException r0 = new java.io.IOException
                r0.<init>()
                throw r0
        }
    }

    public interface d {
        luaj.h a(java.io.InputStream r1, java.lang.String r2);
    }

    public Globals() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.X = r0
            r0 = 0
            r3.Y = r0
            r1 = 0
            r3.a0 = r1
            r3.b0 = r0
            java.io.PrintStream r0 = java.lang.System.out
            r3.c0 = r0
            java.io.PrintStream r0 = java.lang.System.err
            r3.d0 = r0
            luaj.LuaThread r0 = new luaj.LuaThread
            r0.<init>(r3)
            r3.f0 = r0
            r0 = 0
            r3.m0 = r0
            return
    }

    public void L3(java.lang.String r5) {
            r4 = this;
            int r0 = r4.Y
            int r1 = r0 + 1
            r4.Y = r1
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 >= r2) goto Lb
            return
        Lb:
            r4.Y = r0
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Too many open files: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "; last: "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
    }

    public void M3(long r6) {
            r5 = this;
            long r0 = r5.a0
            long r0 = r0 + r6
            r5.a0 = r0
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld
            return
        Ld:
            android.content.Context r0 = android.ext.Tools.f0()
            luaj.d r1 = new luaj.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Too many write to files: "
            r2.append(r3)
            long r3 = r5.a0
            java.lang.String r3 = android.ext.Tools.U(r0, r3)
            r2.append(r3)
            java.lang.String r3 = "; last: "
            r2.append(r3)
            java.lang.String r6 = android.ext.Tools.U(r0, r6)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6)
            throw r1
    }

    public luaj.h N3(java.io.InputStream r3, java.lang.String r4) {
            r2 = this;
            luaj.Globals$a r0 = r2.k0
            if (r0 != 0) goto L9
            java.lang.String r0 = "No compiler."
            luaj.LuaValue.R0(r0)
        L9:
            luaj.Globals$a r0 = r2.k0
            luaj.Globals$c r3 = luaj.Globals.c.b(r3)
            r1 = 1
            luaj.Globals$c r3 = r3.a(r1)
            luaj.h r3 = r0.b(r3, r4)
            return r3
    }

    public luaj.LuaValue O3(java.io.InputStream r2, java.lang.String r3, java.lang.String r4, luaj.LuaValue r5) {
            r1 = this;
            luaj.h r4 = r1.P3(r2, r3, r4)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10 java.io.EOFException -> L12 luaj.d -> L14
            luaj.Globals$b r0 = r1.j0     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10 java.io.EOFException -> L12 luaj.d -> L14
            luaj.LuaFunction r3 = r0.a(r4, r3, r5)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10 java.io.EOFException -> L12 luaj.d -> L14
            r2.close()     // Catch: java.io.IOException -> Ld
        Ld:
            return r3
        Le:
            r3 = move-exception
            goto L42
        L10:
            r4 = move-exception
            goto L16
        L12:
            r3 = move-exception
            goto L37
        L14:
            r3 = move-exception
            goto L41
        L16:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r5.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "load "
            r5.append(r0)     // Catch: java.lang.Throwable -> Le
            r5.append(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = ": "
            r5.append(r3)     // Catch: java.lang.Throwable -> Le
            r5.append(r4)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Le
            luaj.LuaValue r3 = luaj.LuaValue.S0(r3, r4)     // Catch: java.lang.Throwable -> Le
            r2.close()     // Catch: java.io.IOException -> L36
        L36:
            return r3
        L37:
            java.lang.String r4 = "truncated precompiled chunk"
            luaj.LuaValue r3 = luaj.LuaValue.S0(r4, r3)     // Catch: java.lang.Throwable -> Le
            r2.close()     // Catch: java.io.IOException -> L40
        L40:
            return r3
        L41:
            throw r3     // Catch: java.lang.Throwable -> Le
        L42:
            r2.close()     // Catch: java.io.IOException -> L45
        L45:
            throw r3
    }

    public luaj.h P3(java.io.InputStream r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            r0 = 98
            int r0 = r12.indexOf(r0)
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 < 0) goto L80
            luaj.Globals$d r0 = r9.l0
            if (r0 != 0) goto L15
            java.lang.String r0 = "No undumper."
            luaj.LuaValue.R0(r0)
        L15:
            r0 = 4
            byte[] r0 = new byte[r0]
            int r5 = r10.read(r0)
            r6 = r0[r4]
            byte[] r7 = luaj.a.n
            r8 = r7[r4]
            if (r6 != r8) goto L77
            r6 = r0[r3]
            r8 = r7[r3]
            if (r6 != r8) goto L77
            r6 = r0[r2]
            r8 = r7[r2]
            if (r6 != r8) goto L77
            r6 = r0[r1]
            r7 = r7[r1]
            if (r6 != r7) goto L77
            luaj.Globals$d r12 = r9.l0
            luaj.h r11 = r12.a(r10, r11)
            boolean r12 = r10 instanceof luaj.lib.BaseLib.b
            if (r12 == 0) goto L5d
            luaj.lib.BaseLib$b r10 = (luaj.lib.BaseLib.b) r10
            java.io.InputStream r12 = r10.b()
            boolean r0 = r12 instanceof java.io.FileInputStream
            if (r0 == 0) goto L76
            long r0 = r10.a()
            java.io.FileInputStream r12 = (java.io.FileInputStream) r12
            java.nio.channels.FileChannel r10 = r12.getChannel()
            long r2 = r10.size()
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 >= 0) goto L76
            goto L73
        L5d:
            boolean r12 = r10 instanceof java.io.FileInputStream
            if (r12 == 0) goto L76
            java.io.FileInputStream r10 = (java.io.FileInputStream) r10
            java.nio.channels.FileChannel r10 = r10.getChannel()
            long r0 = r10.position()
            long r2 = r10.size()
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 >= 0) goto L76
        L73:
            int r10 = (int) r0
            r11.m = r10
        L76:
            return r11
        L77:
            if (r5 <= 0) goto L80
            luaj.Globals$c r10 = luaj.Globals.c.b(r10)
            r10.unread(r0, r4, r5)
        L80:
            r0 = 116(0x74, float:1.63E-43)
            int r0 = r12.indexOf(r0)
            if (r0 < 0) goto L108
            r0 = 61
            byte[] r0 = new byte[r0]
            int r5 = r10.read(r0)
            if (r5 <= 0) goto L99
            luaj.Globals$c r10 = luaj.Globals.c.b(r10)
            r10.unread(r0, r4, r5)
        L99:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            java.lang.String r6 = "; --[=========[ Lua assembler file generated by GameGuardian "
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lcc
            lasm.a r11 = new lasm.a     // Catch: e.d -> Lb0
            r11.<init>(r10)     // Catch: e.d -> Lb0
            luaj.h r10 = r11.u()     // Catch: e.d -> Lb0
            return r10
        Lb0:
            r10 = move-exception
            luaj.d r11 = new luaj.d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Failed assemble: "
            r12.append(r0)
            java.lang.String r0 = r10.getMessage()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12, r10)
            throw r11
        Lcc:
            r5 = r0[r4]
            byte[] r6 = luaj.a.n
            r4 = r6[r4]
            if (r5 != r4) goto L103
            r4 = r0[r3]
            r3 = r6[r3]
            if (r4 != r3) goto L103
            r3 = r0[r2]
            r2 = r6[r2]
            if (r3 != r2) goto L103
            r0 = r0[r1]
            r1 = r6[r1]
            if (r0 == r1) goto Le7
            goto L103
        Le7:
            luaj.d r10 = new luaj.d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "attempt to load a binary chunk (mode is '"
            r11.append(r0)
            r11.append(r12)
            java.lang.String r12 = "')"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L103:
            luaj.h r10 = r9.N3(r10, r11)
            return r10
        L108:
            luaj.d r10 = new luaj.d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "attempt to load a text chunk (mode is '"
            r11.append(r0)
            r11.append(r12)
            java.lang.String r12 = "'"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    public luaj.LuaValue Q3(java.lang.String r5) {
            r4 = this;
            luaj.lib.f r0 = r4.e0     // Catch: java.lang.Exception -> L2f
            java.io.InputStream r0 = r0.u(r5)     // Catch: java.lang.Exception -> L2f
            java.io.File r1 = r4.R3(r5)     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            r2.<init>()     // Catch: java.lang.Exception -> L2f
            r3 = 64
            r2.append(r3)     // Catch: java.lang.Exception -> L2f
            r2.append(r1)     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = "bt"
            luaj.LuaValue r0 = r4.O3(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L2f
            boolean r2 = r0 instanceof luaj.LuaClosure     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L31
            r2 = r0
            luaj.LuaClosure r2 = (luaj.LuaClosure) r2     // Catch: java.lang.Exception -> L2f
            r2.U = r1     // Catch: java.lang.Exception -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L32
        L31:
            return r0
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "load "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ": "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            luaj.LuaValue r5 = luaj.LuaValue.S0(r5, r0)
            return r5
    }

    public java.io.File R3(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.m0
            if (r0 == 0) goto L19
            int r1 = r4.length()
            if (r1 == 0) goto L13
            r1 = 0
            char r1 = r4.charAt(r1)
            r2 = 47
            if (r1 == r2) goto L19
        L13:
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r4)
            return r1
        L19:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            return r0
    }

    public void S3() {
            r1 = this;
            int r0 = r1.Y
            if (r0 <= 0) goto L8
            int r0 = r0 + (-1)
            r1.Y = r0
        L8:
            return
    }

    public void T3(java.lang.String r1) {
            r0 = this;
            r0.m0 = r1
            return
    }

    @Override // luaj.LuaValue
    public luaj.Globals z0() {
            r0 = this;
            return r0
    }
}
