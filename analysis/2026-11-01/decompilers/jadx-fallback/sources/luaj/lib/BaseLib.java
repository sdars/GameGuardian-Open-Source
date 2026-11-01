package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class BaseLib extends luaj.lib.TwoArgFunction implements luaj.lib.f {
    luaj.Globals T;
    private luaj.lib.BaseLib.c U;
    byte[] V;

    static final class _assert extends luaj.lib.VarArgFunction {
        _assert() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r4) {
                r3 = this;
                int r0 = r4.U()
                r1 = 1
                if (r0 != 0) goto Le
                java.lang.String r0 = "assert"
                java.lang.String r2 = "value expected"
                luaj.LuaValue.l0(r1, r0, r2)
            Le:
                boolean r0 = r4.f0(r1)
                if (r0 != 0) goto L2d
                int r0 = r4.U()
                if (r0 != r1) goto L22
                luaj.d r4 = new luaj.d
                java.lang.String r0 = "assertion failed!"
                r4.<init>(r0)
                throw r4
            L22:
                luaj.d r0 = new luaj.d
                r1 = 2
                luaj.LuaValue r4 = r4.v(r1)
                r0.<init>(r4)
                throw r0
            L2d:
                return r4
        }
    }

    class a extends java.io.InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.io.InputStream f1731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ luaj.lib.BaseLib.c f1732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ luaj.lib.BaseLib f1733d;

        a(luaj.lib.BaseLib r1, java.io.InputStream r2, luaj.lib.BaseLib.c r3) {
                r0 = this;
                r0.f1733d = r1
                r0.f1731b = r2
                r0.f1732c = r3
                r0.<init>()
                r1 = 0
                r0.f1730a = r1
                return
        }

        @Override // java.io.InputStream
        public int read() {
                r3 = this;
                java.io.InputStream r0 = r3.f1731b
                int r0 = r0.read()
                r1 = -1
                if (r0 == r1) goto L19
                luaj.lib.BaseLib$c r1 = r3.f1732c     // Catch: java.lang.Throwable -> L17
                java.io.OutputStream r1 = r1.f1737b     // Catch: java.lang.Throwable -> L17
                r1.write(r0)     // Catch: java.lang.Throwable -> L17
                int r1 = r3.f1730a     // Catch: java.lang.Throwable -> L17
                int r1 = r1 + 1
                r3.f1730a = r1     // Catch: java.lang.Throwable -> L17
                goto L2a
            L17:
                r1 = move-exception
                goto L25
            L19:
                int r1 = r3.f1730a     // Catch: java.lang.Throwable -> L17
                if (r1 <= 0) goto L2a
                luaj.lib.BaseLib$c r2 = r3.f1732c     // Catch: java.lang.Throwable -> L17
                java.io.DataOutputStream r2 = r2.f1739d     // Catch: java.lang.Throwable -> L17
                r2.writeInt(r1)     // Catch: java.lang.Throwable -> L17
                goto L2a
            L25:
                java.lang.String r2 = "Failed write log file"
                android.ext.e1.s(r2, r1)
            L2a:
                return r0
        }
    }

    static final class assert2 extends luaj.lib.VarArgFunction {
        assert2() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r5) {
                r4 = this;
                r0 = 1
                luaj.LuaValue r0 = r5.v(r0)
                r1 = 2
                luaj.LuaValue r1 = r5.v(r1)
                boolean r2 = r0.P0(r1)
                if (r2 != 0) goto Lb4
                luaj.LuaValue r2 = r0.B2()
                luaj.LuaValue r3 = r1.B2()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L33
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = " ~= "
                r2.append(r0)
                r2.append(r1)
            L2e:
                java.lang.String r0 = r2.toString()
                goto L96
            L33:
                java.lang.String r2 = r0.D2()
                java.lang.String r3 = r1.D2()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L6d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r3 = " ["
                r2.append(r3)
                java.lang.String r0 = r0.D2()
                r2.append(r0)
                java.lang.String r0 = "] ~= "
                r2.append(r0)
                r2.append(r1)
                r2.append(r3)
                java.lang.String r0 = r1.D2()
                r2.append(r0)
                java.lang.String r0 = "]"
            L69:
                r2.append(r0)
                goto L2e
            L6d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r3 = " {"
                r2.append(r3)
                java.lang.Class r0 = r0.getClass()
                r2.append(r0)
                java.lang.String r0 = "} ~= "
                r2.append(r0)
                r2.append(r1)
                r2.append(r3)
                java.lang.Class r0 = r1.getClass()
                r2.append(r0)
                java.lang.String r0 = "}"
                goto L69
            L96:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = ": "
                r1.append(r0)
                r0 = 3
                java.lang.String r2 = "assertion failed!"
                java.lang.String r0 = r5.Z(r0, r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                luaj.LuaValue.R0(r0)
            Lb4:
                return r5
        }
    }

    public static class b extends java.io.BufferedInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f1735b;

        public b(java.io.InputStream r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = -1
                r2.f1735b = r0
                return
        }

        public long a() {
                r2 = this;
                long r0 = r2.f1734a
                return r0
        }

        public java.io.InputStream b() {
                r1 = this;
                java.io.InputStream r0 = r1.in
                return r0
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int r3) {
                r2 = this;
                monitor-enter(r2)
                super.mark(r3)     // Catch: java.lang.Throwable -> La
                long r0 = r2.f1734a     // Catch: java.lang.Throwable -> La
                r2.f1735b = r0     // Catch: java.lang.Throwable -> La
                monitor-exit(r2)
                return
            La:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read() {
                r5 = this;
                int r0 = super.read()
                r1 = -1
                if (r0 == r1) goto Le
                long r1 = r5.f1734a
                r3 = 1
                long r1 = r1 + r3
                r5.f1734a = r1
            Le:
                return r0
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] r3, int r4, int r5) {
                r2 = this;
                int r3 = super.read(r3, r4, r5)
                r4 = -1
                if (r3 == r4) goto Ld
                long r4 = r2.f1734a
                long r0 = (long) r3
                long r4 = r4 + r0
                r2.f1734a = r4
            Ld:
                return r3
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
                r5 = this;
                monitor-enter(r5)
                boolean r0 = super.markSupported()     // Catch: java.lang.Throwable -> L18
                if (r0 == 0) goto L22
                long r0 = r5.f1735b     // Catch: java.lang.Throwable -> L18
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1a
                super.reset()     // Catch: java.lang.Throwable -> L18
                long r0 = r5.f1735b     // Catch: java.lang.Throwable -> L18
                r5.f1734a = r0     // Catch: java.lang.Throwable -> L18
                monitor-exit(r5)
                return
            L18:
                r0 = move-exception
                goto L2a
            L1a:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L18
                java.lang.String r1 = "Mark not set"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
                throw r0     // Catch: java.lang.Throwable -> L18
            L22:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L18
                java.lang.String r1 = "Mark not supported"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
                throw r0     // Catch: java.lang.Throwable -> L18
            L2a:
                monitor-exit(r5)
                throw r0
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public long skip(long r3) {
                r2 = this;
                long r3 = super.skip(r3)
                long r0 = r2.f1734a
                long r0 = r0 + r3
                r2.f1734a = r0
                return r3
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.io.File f1736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.io.OutputStream f1737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.io.File f1738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.io.DataOutputStream f1739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ luaj.lib.BaseLib f1740e;

        c(luaj.lib.BaseLib r3, java.lang.String r4) {
                r2 = this;
                r2.f1740e = r3
                r2.<init>()
                java.io.File r3 = new java.io.File
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                java.lang.String r1 = ".load"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                r2.f1736a = r3
                java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream
                java.io.FileOutputStream r0 = new java.io.FileOutputStream
                java.io.File r1 = r2.f1736a
                r0.<init>(r1)
                r3.<init>(r0)
                r2.f1737b = r3
                java.io.File r3 = new java.io.File
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                java.lang.String r4 = ".load.tmp"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                r2.f1738c = r3
                java.io.DataOutputStream r3 = new java.io.DataOutputStream
                java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream
                java.io.FileOutputStream r0 = new java.io.FileOutputStream
                java.io.File r1 = r2.f1738c
                r0.<init>(r1)
                r4.<init>(r0)
                r3.<init>(r4)
                r2.f1739d = r3
                return
        }

        void a() {
                r17 = this;
                r1 = r17
                java.io.OutputStream r0 = r1.f1737b     // Catch: java.lang.Throwable -> L5f
                r0.close()     // Catch: java.lang.Throwable -> L5f
                java.io.DataOutputStream r0 = r1.f1739d     // Catch: java.lang.Throwable -> L5f
                r0.close()     // Catch: java.lang.Throwable -> L5f
                java.io.File r0 = r1.f1738c     // Catch: java.lang.Throwable -> L5f
                long r2 = r0.length()     // Catch: java.lang.Throwable -> L5f
                int r0 = (int) r2     // Catch: java.lang.Throwable -> L5f
                int r0 = r0 / 4
                if (r0 <= 0) goto L12e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
                r2.<init>()     // Catch: java.lang.Throwable -> L5f
                r3 = 2131296368(0x7f090070, float:1.821065E38)
                java.lang.String r3 = android.ext.b2.f(r3)     // Catch: java.lang.Throwable -> L5f
                r2.append(r3)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r3 = ": "
                r2.append(r3)     // Catch: java.lang.Throwable -> L5f
                r2.append(r0)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5f
                android.ext.Tools.J1(r2)     // Catch: java.lang.Throwable -> L5f
                java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L5f
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5f
                java.io.File r4 = r1.f1736a     // Catch: java.lang.Throwable -> L5f
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L5f
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L5f
                java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L5f
                java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L5f
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5f
                java.io.File r6 = r1.f1738c     // Catch: java.lang.Throwable -> L5f
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L5f
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L5f
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L5f
                luaj.lib.BaseLib r4 = r1.f1740e     // Catch: java.lang.Throwable -> L5f
                byte[] r5 = r4.V     // Catch: java.lang.Throwable -> L5f
                if (r5 != 0) goto L62
                r5 = 8192(0x2000, float:1.148E-41)
                byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L5f
                r4.V = r5     // Catch: java.lang.Throwable -> L5f
                goto L62
            L5f:
                r0 = move-exception
                goto L139
            L62:
                r4 = 512(0x200, float:7.17E-43)
                byte[] r6 = new byte[r4]     // Catch: java.lang.Throwable -> L5f
                java.lang.String r7 = "load_0000000.lua"
                r8 = 0
                r1.b(r6, r8, r7)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r7 = "0000666\u00000000000\u00000002004\u000000000000000\u000000000000000\u0000000000\u0000 0"
                r9 = 100
                r1.b(r6, r9, r7)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r7 = "ustar00\u0000root"
                r9 = 257(0x101, float:3.6E-43)
                r1.b(r6, r9, r7)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r7 = "sdcard_r"
                r9 = 297(0x129, float:4.16E-43)
                r1.b(r6, r9, r7)     // Catch: java.lang.Throwable -> L5f
                r7 = -64
                r9 = 0
            L84:
                if (r9 >= r4) goto L90
                r10 = r6[r9]     // Catch: java.lang.Throwable -> L5f
                if (r10 == 0) goto L8d
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r7 = r7 + r10
            L8d:
                int r9 = r9 + 1
                goto L84
            L90:
                java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L5f
                java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
                r11.<init>()     // Catch: java.lang.Throwable -> L5f
                java.io.File r12 = r1.f1736a     // Catch: java.lang.Throwable -> L5f
                java.lang.String r12 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L5f
                r11.append(r12)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r12 = ".tar"
                r11.append(r12)     // Catch: java.lang.Throwable -> L5f
                java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L5f
                r10.<init>(r11)     // Catch: java.lang.Throwable -> L5f
                r9.<init>(r10)     // Catch: java.lang.Throwable -> L5f
                r10 = 0
            Lb2:
                if (r10 >= r0) goto L11d
                int r11 = r3.readInt()     // Catch: java.lang.Throwable -> L5f
                java.lang.String r12 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L5f
                int r13 = r12.length()     // Catch: java.lang.Throwable -> L5f
                int r14 = 12 - r13
                r16 = r7
                r15 = 0
            Lc5:
                if (r15 >= r13) goto Ldc
                char r4 = r12.charAt(r15)     // Catch: java.lang.Throwable -> L5f
                r8 = r4 & 255(0xff, float:3.57E-43)
                int r8 = r8 + (-48)
                int r16 = r16 + r8
                int r8 = r14 + r15
                byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L5f
                r6[r8] = r4     // Catch: java.lang.Throwable -> L5f
                int r15 = r15 + 1
                r4 = 512(0x200, float:7.17E-43)
                r8 = 0
                goto Lc5
            Ldc:
                java.lang.String r4 = "00000000000\u000000000000000\u0000000000\u0000"
                r8 = 124(0x7c, float:1.74E-43)
                r1.b(r6, r8, r4)     // Catch: java.lang.Throwable -> L5f
                r4 = 135(0x87, float:1.89E-43)
                int r4 = r1.c(r6, r4, r11)     // Catch: java.lang.Throwable -> L5f
                int r4 = r16 + r4
                r8 = 154(0x9a, float:2.16E-43)
                r1.c(r6, r8, r4)     // Catch: java.lang.Throwable -> L5f
                r4 = 512(0x200, float:7.17E-43)
                r8 = 0
                r9.write(r6, r8, r4)     // Catch: java.lang.Throwable -> L5f
                r8 = r11
            Lf7:
                if (r8 <= 0) goto L10c
                int r12 = r5.length     // Catch: java.lang.Throwable -> L5f
                if (r8 <= r12) goto Lff
                int r12 = r5.length     // Catch: java.lang.Throwable -> L5f
            Lfd:
                r13 = 0
                goto L101
            Lff:
                r12 = r8
                goto Lfd
            L101:
                int r12 = r2.read(r5, r13, r12)     // Catch: java.lang.Throwable -> L5f
                if (r12 <= 0) goto Lf7
                r9.write(r5, r13, r12)     // Catch: java.lang.Throwable -> L5f
                int r8 = r8 - r12
                goto Lf7
            L10c:
                int r11 = r11 % 512
                if (r11 <= 0) goto L119
                int r8 = 512 - r11
                r11 = 0
                java.util.Arrays.fill(r5, r11, r8, r11)     // Catch: java.lang.Throwable -> L5f
                r9.write(r5, r11, r8)     // Catch: java.lang.Throwable -> L5f
            L119:
                int r10 = r10 + 1
                r8 = 0
                goto Lb2
            L11d:
                r0 = 1024(0x400, float:1.435E-42)
                byte[] r4 = new byte[r0]     // Catch: java.lang.Throwable -> L5f
                r5 = 0
                r9.write(r4, r5, r0)     // Catch: java.lang.Throwable -> L5f
                r9.close()     // Catch: java.lang.Throwable -> L5f
                r2.close()     // Catch: java.lang.Throwable -> L5f
                r3.close()     // Catch: java.lang.Throwable -> L5f
            L12e:
                java.io.File r0 = r1.f1736a     // Catch: java.lang.Throwable -> L5f
                r0.delete()     // Catch: java.lang.Throwable -> L5f
                java.io.File r0 = r1.f1738c     // Catch: java.lang.Throwable -> L5f
                r0.delete()     // Catch: java.lang.Throwable -> L5f
                goto L14f
            L139:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed end log load for "
                r2.append(r3)
                java.io.File r3 = r1.f1736a
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.ext.e1.g(r2, r0)
            L14f:
                return
        }

        void b(byte[] r5, int r6, java.lang.String r7) {
                r4 = this;
                int r0 = r7.length()
                r1 = 0
            L5:
                if (r1 >= r0) goto L13
                int r2 = r6 + r1
                char r3 = r7.charAt(r1)
                byte r3 = (byte) r3
                r5[r2] = r3
                int r1 = r1 + 1
                goto L5
            L13:
                return
        }

        int c(byte[] r6, int r7, int r8) {
                r5 = this;
                java.lang.String r8 = java.lang.Integer.toOctalString(r8)
                int r0 = r8.length()
                int r7 = r7 - r0
                r1 = 0
                r2 = 0
            Lb:
                if (r1 >= r0) goto L1e
                char r3 = r8.charAt(r1)
                r4 = r3 & 255(0xff, float:3.57E-43)
                int r4 = r4 + (-48)
                int r2 = r2 + r4
                int r4 = r7 + r1
                byte r3 = (byte) r3
                r6[r4] = r3
                int r1 = r1 + 1
                goto Lb
            L1e:
                return r2
        }
    }

    static final class collectgarbage extends luaj.lib.VarArgFunction {
        collectgarbage() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r7) {
                r6 = this;
                r0 = 1
                java.lang.String r1 = "collect"
                java.lang.String r7 = r7.Z(r0, r1)
                boolean r1 = r1.equals(r7)
                if (r1 == 0) goto L13
                java.lang.System.gc()
                luaj.LuaNumber r7 = luaj.LuaValue.f1675g
                return r7
            L13:
                java.lang.String r1 = "count"
                boolean r1 = r1.equals(r7)
                if (r1 == 0) goto L3c
                java.lang.Runtime r7 = java.lang.Runtime.getRuntime()
                long r0 = r7.totalMemory()
                long r2 = r7.freeMemory()
                long r0 = r0 - r2
                double r2 = (double) r0
                r4 = 4652218415073722368(0x4090000000000000, double:1024.0)
                double r2 = r2 / r4
                luaj.LuaNumber r7 = luaj.LuaValue.J2(r2)
                r2 = 1024(0x400, double:5.06E-321)
                long r0 = r0 % r2
                luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
                luaj.Varargs r7 = luaj.LuaValue.N2(r7, r0)
                return r7
            L3c:
                java.lang.String r1 = "step"
                boolean r1 = r1.equals(r7)
                if (r1 == 0) goto L4a
                java.lang.System.gc()
                luaj.LuaBoolean r7 = luaj.LuaValue.f1672d
                return r7
            L4a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "invalid option '"
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = "'"
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                java.lang.String r1 = "collectgarbage"
                luaj.LuaValue.l0(r0, r1, r7)
                luaj.LuaValue r7 = luaj.LuaValue.f1671c
                return r7
        }
    }

    private static class d extends java.io.InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final luaj.LuaValue f1741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte[] f1742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1744d;

        d(luaj.LuaValue r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1744d = r0
                r1.f1741a = r2
                return
        }

        @Override // java.io.InputStream
        public int read() {
                r3 = this;
                int r0 = r3.f1744d
                r1 = -1
                if (r0 >= 0) goto L6
                return r1
            L6:
                if (r0 != 0) goto L2a
                luaj.LuaValue r0 = r3.f1741a
                luaj.LuaValue r0 = r0.call()
                boolean r2 = r0.l1()
                if (r2 == 0) goto L17
                r3.f1744d = r1
                return r1
            L17:
                luaj.LuaString r0 = r0.q2()
                byte[] r2 = r0.P
                r3.f1742b = r2
                int r2 = r0.Q
                r3.f1743c = r2
                int r0 = r0.R
                r3.f1744d = r0
                if (r0 > 0) goto L2a
                return r1
            L2a:
                int r0 = r3.f1744d
                int r0 = r0 + (-1)
                r3.f1744d = r0
                byte[] r0 = r3.f1742b
                int r1 = r3.f1743c
                int r2 = r1 + 1
                r3.f1743c = r2
                r0 = r0[r1]
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
        }
    }

    final class dofile extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.BaseLib T;

        dofile(luaj.lib.BaseLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r5) {
                r4 = this;
                luaj.LuaValue r5 = r5.w()
                boolean r0 = r5.n1()
                r1 = 1
                if (r0 != 0) goto L2b
                boolean r0 = r5.l1()
                if (r0 != 0) goto L2b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "string expected, got "
                r0.append(r2)
                java.lang.String r2 = r5.D2()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "dofile"
                luaj.LuaValue.l0(r1, r2, r0)
            L2b:
                java.lang.String r5 = r5.B0()
                luaj.lib.BaseLib r0 = r4.T
                java.lang.String r2 = "bt"
                luaj.Globals r3 = r0.T
                luaj.Varargs r5 = r0.a3(r5, r2, r3)
                boolean r0 = r5.Q(r1)
                if (r0 == 0) goto L49
                r0 = 2
                java.lang.String r5 = r5.h0(r0)
                luaj.LuaValue r5 = luaj.LuaValue.R0(r5)
                goto L51
            L49:
                luaj.LuaValue r5 = r5.w()
                luaj.Varargs r5 = r5.invoke()
            L51:
                return r5
        }
    }

    static final class error extends luaj.lib.TwoArgFunction {
        error() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3, luaj.LuaValue r4) {
                r2 = this;
                boolean r0 = r3.l1()
                if (r0 != 0) goto L28
                boolean r0 = r3.n1()
                if (r0 == 0) goto L22
                r0 = 1
                int r1 = r4.H1(r0)
                if (r1 != 0) goto L14
                goto L22
            L14:
                luaj.d r1 = new luaj.d
                java.lang.String r3 = r3.g0()
                int r4 = r4.H1(r0)
                r1.<init>(r3, r4)
                throw r1
            L22:
                luaj.d r4 = new luaj.d
                r4.<init>(r3)
                throw r4
            L28:
                luaj.d r3 = new luaj.d
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                r3.<init>(r4)
                throw r3
        }
    }

    static final class getmetatable extends luaj.lib.LibFunction {
        getmetatable() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call() {
                r2 = this;
                r0 = 1
                java.lang.String r1 = "value expected"
                luaj.LuaValue r0 = luaj.LuaValue.k0(r0, r1)
                return r0
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r2) {
                r1 = this;
                luaj.LuaValue r2 = r2.V0()
                if (r2 == 0) goto L11
                luaj.LuaString r0 = luaj.LuaValue.p
                luaj.LuaValue r0 = r2.V1(r0)
                luaj.LuaValue r2 = r0.M1(r2)
                goto L13
            L11:
                luaj.LuaValue r2 = luaj.LuaValue.f1671c
            L13:
                return r2
        }
    }

    static final class inext extends luaj.lib.VarArgFunction {
        inext() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r3) {
                r2 = this;
                r0 = 1
                luaj.LuaTable r0 = r3.I(r0)
                r1 = 2
                luaj.LuaValue r3 = r3.v(r1)
                luaj.Varargs r3 = r0.p3(r3)
                return r3
        }
    }

    static final class ipairs extends luaj.lib.VarArgFunction {
        luaj.lib.BaseLib.inext T;

        ipairs() {
                r1 = this;
                r1.<init>()
                luaj.lib.BaseLib$inext r0 = new luaj.lib.BaseLib$inext
                r0.<init>()
                r1.T = r0
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r3) {
                r2 = this;
                luaj.lib.BaseLib$inext r0 = r2.T
                r1 = 1
                luaj.LuaTable r3 = r3.I(r1)
                luaj.LuaNumber r1 = luaj.LuaValue.f1675g
                luaj.Varargs r3 = luaj.LuaValue.M2(r0, r3, r1)
                return r3
        }
    }

    final class load extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.BaseLib T;

        load(luaj.lib.BaseLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r8) {
                r7 = this;
                luaj.LuaValue r0 = r8.w()
                boolean r1 = r0.n1()
                if (r1 != 0) goto L2b
                boolean r1 = r0.g1()
                if (r1 != 0) goto L2b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "string or function expected, got "
                r1.append(r2)
                java.lang.String r2 = r0.D2()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 1
                java.lang.String r3 = "load"
                luaj.LuaValue.l0(r2, r3, r1)
            L2b:
                boolean r1 = r0.n1()
                if (r1 == 0) goto L36
                java.lang.String r1 = r0.g0()
                goto L38
            L36:
                java.lang.String r1 = "=(load)"
            L38:
                r2 = 2
                java.lang.String r1 = r8.Z(r2, r1)
                r2 = 3
                java.lang.String r3 = "bt"
                java.lang.String r2 = r8.Z(r2, r3)
                luaj.lib.BaseLib r3 = r7.T
                luaj.Globals r3 = r3.T
                r4 = 4
                luaj.LuaValue r8 = r8.d0(r4, r3)
                boolean r3 = r0.n1()
                r4 = 0
                if (r3 == 0) goto L59
                luaj.LuaString r3 = r0.q2()
                goto L5a
            L59:
                r3 = r4
            L5a:
                if (r3 == 0) goto L61
                java.io.InputStream r0 = r3.k3()
                goto L6b
            L61:
                luaj.lib.BaseLib$d r5 = new luaj.lib.BaseLib$d
                luaj.LuaFunction r0 = r0.y0()
                r5.<init>(r0)
                r0 = r5
            L6b:
                luaj.lib.BaseLib r5 = r7.T
                luaj.lib.BaseLib$c r5 = luaj.lib.BaseLib.X2(r5)
                if (r5 == 0) goto L7a
                luaj.lib.BaseLib r5 = r7.T
                r6 = 0
                java.io.InputStream r0 = r5.Y2(r3, r4, r6, r0)
            L7a:
                luaj.lib.BaseLib r3 = r7.T
                luaj.Varargs r8 = r3.b3(r0, r1, r2, r8)
                return r8
        }
    }

    final class loadfile extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.BaseLib T;

        loadfile(luaj.lib.BaseLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r5) {
                r4 = this;
                luaj.LuaValue r0 = r5.w()
                boolean r1 = r0.n1()
                if (r1 != 0) goto L2b
                boolean r1 = r0.l1()
                if (r1 != 0) goto L2b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "string expected, got "
                r1.append(r2)
                java.lang.String r2 = r0.D2()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 1
                java.lang.String r3 = "loadfile"
                luaj.LuaValue.l0(r2, r3, r1)
            L2b:
                java.lang.String r0 = r0.B0()
                r1 = 2
                java.lang.String r2 = "bt"
                java.lang.String r1 = r5.Z(r1, r2)
                luaj.lib.BaseLib r2 = r4.T
                luaj.Globals r2 = r2.T
                r3 = 3
                luaj.LuaValue r5 = r5.d0(r3, r2)
                luaj.lib.BaseLib r2 = r4.T
                luaj.Varargs r5 = r2.a3(r0, r1, r5)
                return r5
        }
    }

    static final class next extends luaj.lib.VarArgFunction {
        next() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r3) {
                r2 = this;
                r0 = 1
                luaj.LuaTable r0 = r3.I(r0)
                r1 = 2
                luaj.LuaValue r3 = r3.v(r1)
                luaj.Varargs r3 = r0.v3(r3)
                return r3
        }
    }

    static final class pairs extends luaj.lib.VarArgFunction {
        final luaj.lib.BaseLib.next T;

        pairs(luaj.lib.BaseLib.next r1) {
                r0 = this;
                r0.<init>()
                r0.T = r1
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r3) {
                r2 = this;
                luaj.lib.BaseLib$next r0 = r2.T
                r1 = 1
                luaj.LuaTable r3 = r3.I(r1)
                luaj.LuaValue r1 = luaj.LuaValue.f1671c
                luaj.Varargs r3 = luaj.LuaValue.M2(r0, r3, r1)
                return r3
        }
    }

    final class pcall extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.BaseLib T;

        pcall(luaj.lib.BaseLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r4) {
                r3 = this;
                luaj.lib.BaseLib r0 = r3.T
                luaj.Globals r0 = r0.T
                r1 = 1
                luaj.LuaValue r1 = r4.K(r1)
                r2 = 2
                luaj.Varargs r4 = r4.e0(r2)
                luaj.Varargs r4 = luaj.LuaClosure.d3(r0, r3, r1, r4)
                return r4
        }
    }

    final class print extends luaj.lib.VarArgFunction {
        final luaj.lib.BaseLib T;
        final /* synthetic */ luaj.lib.BaseLib U;

        print(luaj.lib.BaseLib r1, luaj.lib.BaseLib r2) {
                r0 = this;
                r0.U = r1
                r0.<init>()
                r0.T = r2
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r7) {
                r6 = this;
                luaj.lib.BaseLib r0 = r6.U
                luaj.Globals r0 = r0.T
                java.lang.String r1 = "tostring"
                luaj.LuaValue r0 = r0.T0(r1)
                int r1 = r7.U()
                r2 = 1
                r3 = 1
            L10:
                if (r3 > r1) goto L5c
                if (r3 <= r2) goto L1f
                luaj.lib.BaseLib r4 = r6.U
                luaj.Globals r4 = r4.T
                java.io.PrintStream r4 = r4.c0
                java.lang.String r5 = " \t"
                r4.print(r5)
            L1f:
                luaj.LuaValue r4 = r7.v(r3)
                luaj.LuaValue r4 = r0.call(r4)
                boolean r5 = r4.n1()
                if (r5 == 0) goto L41
                luaj.lib.BaseLib r5 = r6.U
                luaj.Globals r5 = r5.T
                java.io.PrintStream r5 = r5.c0
                luaj.LuaString r4 = r4.q2()
                java.lang.String r4 = r4.g0()
                r5.print(r4)
                int r3 = r3 + 1
                goto L10
            L41:
                luaj.d r7 = new luaj.d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "'tostring' must return a string to 'print', got "
                r0.append(r1)
                java.lang.String r1 = r4.D2()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L5c:
                luaj.lib.BaseLib r7 = r6.U
                luaj.Globals r7 = r7.T
                java.io.PrintStream r7 = r7.c0
                r7.println()
                luaj.LuaValue r7 = luaj.LuaValue.f1674f
                return r7
        }
    }

    static final class rawequal extends luaj.lib.LibFunction {
        rawequal() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call() {
                r2 = this;
                r0 = 1
                java.lang.String r1 = "value expected"
                luaj.LuaValue r0 = luaj.LuaValue.k0(r0, r1)
                return r0
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r2) {
                r1 = this;
                r2 = 2
                java.lang.String r0 = "value expected"
                luaj.LuaValue r2 = luaj.LuaValue.k0(r2, r0)
                return r2
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2) {
                r0 = this;
                boolean r1 = r1.T1(r2)
                luaj.LuaBoolean r1 = luaj.LuaValue.H2(r1)
                return r1
        }
    }

    static final class rawget extends luaj.lib.TableLibFunction {
        rawget() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r2) {
                r1 = this;
                r2 = 2
                java.lang.String r0 = "value expected"
                luaj.LuaValue r2 = luaj.LuaValue.k0(r2, r0)
                return r2
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2) {
                r0 = this;
                luaj.LuaTable r1 = r1.H0()
                luaj.LuaValue r1 = r1.V1(r2)
                return r1
        }
    }

    static final class rawlen extends luaj.lib.LibFunction {
        rawlen() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3) {
                r2 = this;
                int r3 = r3.W1()
                long r0 = (long) r3
                luaj.LuaLong r3 = luaj.LuaValue.I2(r0)
                return r3
        }
    }

    static final class rawset extends luaj.lib.TableLibFunction {
        rawset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r2) {
                r1 = this;
                r2 = 2
                java.lang.String r0 = "value expected"
                luaj.LuaValue r2 = luaj.LuaValue.k0(r2, r0)
                return r2
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2) {
                r0 = this;
                r1 = 3
                java.lang.String r2 = "value expected"
                luaj.LuaValue r1 = luaj.LuaValue.k0(r1, r2)
                return r1
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3, luaj.LuaValue r4, luaj.LuaValue r5) {
                r2 = this;
                luaj.LuaTable r3 = r3.H0()
                boolean r0 = r4.q1()
                if (r0 != 0) goto L10
                r0 = 2
                java.lang.String r1 = "table index is nil"
                luaj.LuaValue.k0(r0, r1)
            L10:
                r3.d2(r4, r5)
                return r3
        }
    }

    static final class select extends luaj.lib.VarArgFunction {
        select() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r5) {
                r4 = this;
                int r0 = r5.U()
                r1 = 1
                int r0 = r0 - r1
                luaj.LuaValue r2 = r5.w()
                java.lang.String r3 = "#"
                luaj.LuaString r3 = luaj.LuaValue.K2(r3)
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L1c
                long r0 = (long) r0
                luaj.LuaLong r5 = luaj.LuaValue.I2(r0)
                return r5
            L1c:
                int r2 = r5.D(r1)
                if (r2 == 0) goto L25
                int r3 = -r0
                if (r2 >= r3) goto L2a
            L25:
                java.lang.String r3 = "index out of range"
                luaj.LuaValue.k0(r1, r3)
            L2a:
                if (r2 >= 0) goto L30
                int r0 = r0 + r2
                int r0 = r0 + 2
                goto L32
            L30:
                int r0 = r2 + 1
            L32:
                luaj.Varargs r5 = r5.e0(r0)
                return r5
        }
    }

    static final class setmetatable extends luaj.lib.TableLibFunction {
        setmetatable() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r2) {
                r1 = this;
                r2 = 2
                java.lang.String r0 = "nil or table expected"
                luaj.LuaValue r2 = luaj.LuaValue.k0(r2, r0)
                return r2
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3, luaj.LuaValue r4) {
                r2 = this;
                luaj.LuaTable r0 = r3.H0()
                luaj.LuaValue r0 = r0.V0()
                if (r0 == 0) goto L1b
                luaj.LuaString r1 = luaj.LuaValue.p
                luaj.LuaValue r0 = r0.V1(r1)
                boolean r0 = r0.l1()
                if (r0 != 0) goto L1b
                java.lang.String r0 = "cannot change a protected metatable"
                luaj.LuaValue.R0(r0)
            L1b:
                boolean r0 = r4.l1()
                if (r0 == 0) goto L23
                r4 = 0
                goto L27
            L23:
                luaj.LuaTable r4 = r4.H0()
            L27:
                luaj.LuaValue r3 = r3.k2(r4)
                return r3
        }
    }

    static final class tonumber extends luaj.lib.LibFunction {
        tonumber() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r1) {
                r0 = this;
                luaj.LuaValue r1 = r1.A2()
                return r1
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3, luaj.LuaValue r4) {
                r2 = this;
                boolean r0 = r4.l1()
                if (r0 == 0) goto Lb
                luaj.LuaValue r3 = r3.A2()
                return r3
            Lb:
                int r4 = r4.A0()
                r0 = 2
                if (r4 < r0) goto L16
                r1 = 36
                if (r4 <= r1) goto L1b
            L16:
                java.lang.String r1 = "base out of range"
                luaj.LuaValue.k0(r0, r1)
            L1b:
                luaj.LuaString r3 = r3.G0()
                luaj.LuaValue r3 = r3.l3(r4)
                return r3
        }
    }

    static final class tostring extends luaj.lib.LibFunction {
        tostring() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r1) {
                r0 = this;
                luaj.LuaString r1 = luaj.lib.BaseLib.d3(r1)
                return r1
        }
    }

    static final class type extends luaj.lib.LibFunction {
        type() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r1) {
                r0 = this;
                java.lang.String r1 = r1.D2()
                luaj.LuaString r1 = luaj.LuaValue.K2(r1)
                return r1
        }
    }

    final class xpcall extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.BaseLib T;

        xpcall(luaj.lib.BaseLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r6) {
                r5 = this;
                luaj.lib.BaseLib r0 = r5.T
                luaj.Globals r0 = r0.T
                luaj.LuaThread r0 = r0.f0
                luaj.LuaValue r1 = r0.S
                r2 = 2
                luaj.LuaValue r2 = r6.K(r2)
                r0.S = r2
                luaj.lib.BaseLib r2 = r5.T     // Catch: java.lang.Throwable -> L24
                luaj.Globals r2 = r2.T     // Catch: java.lang.Throwable -> L24
                r3 = 1
                luaj.LuaValue r3 = r6.K(r3)     // Catch: java.lang.Throwable -> L24
                r4 = 3
                luaj.Varargs r6 = r6.e0(r4)     // Catch: java.lang.Throwable -> L24
                luaj.Varargs r6 = luaj.LuaClosure.d3(r2, r5, r3, r6)     // Catch: java.lang.Throwable -> L24
                r0.S = r1
                return r6
            L24:
                r6 = move-exception
                r0.S = r1
                throw r6
        }
    }

    public BaseLib() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.U = r0
            r1.V = r0
            return
    }

    static /* synthetic */ luaj.lib.BaseLib.c X2(luaj.lib.BaseLib r0) {
            luaj.lib.BaseLib$c r0 = r0.U
            return r0
    }

    static luaj.LuaString d3(luaj.LuaValue r3) {
            luaj.LuaString r0 = luaj.LuaValue.B
            luaj.LuaValue r0 = r3.x1(r0)
            boolean r1 = r0.l1()
            if (r1 != 0) goto L47
            luaj.LuaValue r3 = r0.call(r3)
            luaj.LuaValue r0 = r3.B2()
            boolean r1 = r0.l1()
            if (r1 != 0) goto L1f
            luaj.LuaString r3 = r0.G0()
            return r3
        L1f:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "'__tostring' must return a string, got '"
            r1.append(r2)
            java.lang.String r2 = r3.D2()
            r1.append(r2)
            java.lang.String r2 = "' ('"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "')"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L47:
            luaj.LuaValue r0 = r3.B2()
            boolean r1 = r0.l1()
            if (r1 != 0) goto L56
            luaj.LuaString r3 = r0.G0()
            return r3
        L56:
            java.lang.String r3 = r3.g0()
            luaj.LuaString r3 = luaj.LuaValue.K2(r3)
            return r3
    }

    java.io.InputStream Y2(luaj.LuaString r6, java.lang.String r7, boolean r8, java.io.InputStream r9) {
            r5 = this;
            luaj.lib.BaseLib$c r0 = r5.U
            if (r0 != 0) goto L5
            goto L69
        L5:
            if (r8 == 0) goto L4e
            if (r7 == 0) goto L69
            byte[] r6 = r5.V     // Catch: java.lang.Throwable -> L14
            if (r6 != 0) goto L16
            r6 = 8192(0x2000, float:1.148E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L14
            r5.V = r6     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r6 = move-exception
            goto L39
        L16:
            int r8 = android.system.OsConstants.O_RDONLY     // Catch: java.lang.Throwable -> L14
            r1 = 438(0x1b6, float:6.14E-43)
            java.io.FileDescriptor r8 = android.system.Os.open(r7, r8, r1)     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2 = 0
        L20:
            int r3 = r6.length     // Catch: java.lang.Throwable -> L14
            int r3 = android.system.Os.read(r8, r6, r1, r3)     // Catch: java.lang.Throwable -> L14
            if (r3 <= 0) goto L2e
            java.io.OutputStream r4 = r0.f1737b     // Catch: java.lang.Throwable -> L14
            r4.write(r6, r1, r3)     // Catch: java.lang.Throwable -> L14
            int r2 = r2 + r3
            goto L20
        L2e:
            android.system.Os.close(r8)     // Catch: java.lang.Throwable -> L14
            if (r2 <= 0) goto L69
            java.io.DataOutputStream r6 = r0.f1739d     // Catch: java.lang.Throwable -> L14
            r6.writeInt(r2)     // Catch: java.lang.Throwable -> L14
            goto L69
        L39:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Failed write log file from "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.ext.e1.g(r7, r6)
            goto L69
        L4e:
            if (r6 == 0) goto L6a
            int r7 = r6.R     // Catch: java.lang.Throwable -> L63
            if (r7 <= 0) goto L69
            java.io.OutputStream r8 = r0.f1737b     // Catch: java.lang.Throwable -> L63
            byte[] r1 = r6.P     // Catch: java.lang.Throwable -> L63
            int r6 = r6.Q     // Catch: java.lang.Throwable -> L63
            r8.write(r1, r6, r7)     // Catch: java.lang.Throwable -> L63
            java.io.DataOutputStream r6 = r0.f1739d     // Catch: java.lang.Throwable -> L63
            r6.writeInt(r7)     // Catch: java.lang.Throwable -> L63
            goto L69
        L63:
            r6 = move-exception
            java.lang.String r7 = "Failed write log file"
            android.ext.e1.s(r7, r6)
        L69:
            return r9
        L6a:
            luaj.lib.BaseLib$a r6 = new luaj.lib.BaseLib$a
            r6.<init>(r5, r9, r0)
            return r6
    }

    public void Z2() {
            r1 = this;
            luaj.lib.BaseLib$c r0 = r1.U
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }

    public luaj.Varargs a3(java.lang.String r5, java.lang.String r6, luaj.LuaValue r7) {
            r4 = this;
            luaj.Globals r0 = r4.T
            luaj.lib.f r0 = r0.e0
            java.io.InputStream r0 = r0.u(r5)
            if (r0 != 0) goto L2b
            luaj.LuaValue r6 = luaj.LuaValue.f1671c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "cannot open "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = ": No such file or directory"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            luaj.LuaString r5 = luaj.LuaValue.K2(r5)
            luaj.Varargs r5 = luaj.LuaValue.N2(r6, r5)
            return r5
        L2b:
            luaj.Globals r1 = r4.T     // Catch: java.lang.Throwable -> L54
            java.io.File r1 = r1.R3(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            r3 = 64
            r2.append(r3)     // Catch: java.lang.Throwable -> L54
            r2.append(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L54
            luaj.Varargs r6 = r4.b3(r0, r2, r6, r7)     // Catch: java.lang.Throwable -> L54
            boolean r7 = r6 instanceof luaj.LuaClosure     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L56
            r7 = r6
            luaj.LuaClosure r7 = (luaj.LuaClosure) r7     // Catch: java.lang.Throwable -> L54
            r7.U = r1     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r5 = move-exception
            goto L6c
        L56:
            luaj.lib.BaseLib$c r7 = r4.U     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L63
            boolean r7 = r6 instanceof luaj.LuaFunction     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L63
            r7 = 1
            r1 = 0
            r4.Y2(r1, r5, r7, r1)     // Catch: java.lang.Throwable -> L54
        L63:
            r0.close()     // Catch: java.lang.Exception -> L67
            goto L6b
        L67:
            r5 = move-exception
            r5.printStackTrace()
        L6b:
            return r6
        L6c:
            java.lang.String r6 = r5.getMessage()     // Catch: java.lang.Throwable -> L7b
            if (r6 != 0) goto L7d
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L7b
            goto L7d
        L7b:
            r5 = move-exception
            goto L90
        L7d:
            luaj.LuaValue r5 = luaj.LuaValue.f1671c     // Catch: java.lang.Throwable -> L7b
            luaj.LuaString r6 = luaj.LuaValue.K2(r6)     // Catch: java.lang.Throwable -> L7b
            luaj.Varargs r5 = luaj.LuaValue.N2(r5, r6)     // Catch: java.lang.Throwable -> L7b
            r0.close()     // Catch: java.lang.Exception -> L8b
            goto L8f
        L8b:
            r6 = move-exception
            r6.printStackTrace()
        L8f:
            return r5
        L90:
            r0.close()     // Catch: java.lang.Exception -> L94
            goto L98
        L94:
            r6 = move-exception
            r6.printStackTrace()
        L98:
            throw r5
    }

    public luaj.Varargs b3(java.io.InputStream r2, java.lang.String r3, java.lang.String r4, luaj.LuaValue r5) {
            r1 = this;
            if (r2 != 0) goto L20
            luaj.LuaValue r2 = luaj.LuaValue.f1671c     // Catch: java.lang.Exception -> L1e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1e
            r4.<init>()     // Catch: java.lang.Exception -> L1e
            java.lang.String r5 = "not found: "
            r4.append(r5)     // Catch: java.lang.Exception -> L1e
            r4.append(r3)     // Catch: java.lang.Exception -> L1e
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L1e
            luaj.LuaString r3 = luaj.LuaValue.K2(r3)     // Catch: java.lang.Exception -> L1e
            luaj.Varargs r2 = luaj.LuaValue.N2(r2, r3)     // Catch: java.lang.Exception -> L1e
            return r2
        L1e:
            r2 = move-exception
            goto L27
        L20:
            luaj.Globals r0 = r1.T     // Catch: java.lang.Exception -> L1e
            luaj.LuaValue r2 = r0.O3(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L1e
            return r2
        L27:
            luaj.LuaValue r3 = luaj.LuaValue.f1671c
            java.lang.String r2 = r2.getMessage()
            luaj.LuaString r2 = luaj.LuaValue.K2(r2)
            luaj.Varargs r2 = luaj.LuaValue.N2(r3, r2)
            return r2
    }

    public void c3(java.lang.String r4) {
            r3 = this;
            luaj.lib.BaseLib$c r0 = new luaj.lib.BaseLib$c     // Catch: java.lang.Throwable -> L8
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L8
            r3.U = r0     // Catch: java.lang.Throwable -> L8
            goto L1d
        L8:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed prepare log loads for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.ext.e1.g(r4, r0)
        L1d:
            return
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r3, luaj.LuaValue r4) {
            r2 = this;
            luaj.Globals r3 = r4.z0()
            r2.T = r3
            r3.e0 = r2
            r3.g0 = r2
            boolean r0 = r3.X
            if (r0 == 0) goto L7e
            java.lang.String r0 = "_G"
            r4.i2(r0, r4)
            java.lang.String r0 = "_VERSION"
            java.lang.String r1 = "Lua 5.3 (with Luaj 3.0.1)"
            r4.h2(r0, r1)
            luaj.lib.BaseLib$_assert r0 = new luaj.lib.BaseLib$_assert
            r0.<init>()
            java.lang.String r1 = "assert"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$assert2 r0 = new luaj.lib.BaseLib$assert2
            r0.<init>()
            java.lang.String r1 = "assert2"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$collectgarbage r0 = new luaj.lib.BaseLib$collectgarbage
            r0.<init>()
            java.lang.String r1 = "collectgarbage"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$dofile r0 = new luaj.lib.BaseLib$dofile
            r0.<init>(r2)
            java.lang.String r1 = "dofile"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$error r0 = new luaj.lib.BaseLib$error
            r0.<init>()
            java.lang.String r1 = "error"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$getmetatable r0 = new luaj.lib.BaseLib$getmetatable
            r0.<init>()
            java.lang.String r1 = "getmetatable"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$load r0 = new luaj.lib.BaseLib$load
            r0.<init>(r2)
            java.lang.String r1 = "load"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$loadfile r0 = new luaj.lib.BaseLib$loadfile
            r0.<init>(r2)
            java.lang.String r1 = "loadfile"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$pcall r0 = new luaj.lib.BaseLib$pcall
            r0.<init>(r2)
            java.lang.String r1 = "pcall"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$print r0 = new luaj.lib.BaseLib$print
            r0.<init>(r2, r2)
            java.lang.String r1 = "print"
            r4.i2(r1, r0)
        L7e:
            luaj.lib.BaseLib$rawequal r0 = new luaj.lib.BaseLib$rawequal
            r0.<init>()
            java.lang.String r1 = "rawequal"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$rawget r0 = new luaj.lib.BaseLib$rawget
            r0.<init>()
            java.lang.String r1 = "rawget"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$rawlen r0 = new luaj.lib.BaseLib$rawlen
            r0.<init>()
            java.lang.String r1 = "rawlen"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$rawset r0 = new luaj.lib.BaseLib$rawset
            r0.<init>()
            java.lang.String r1 = "rawset"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$select r0 = new luaj.lib.BaseLib$select
            r0.<init>()
            java.lang.String r1 = "select"
            r4.i2(r1, r0)
            boolean r0 = r3.X
            if (r0 == 0) goto Lbe
            luaj.lib.BaseLib$setmetatable r0 = new luaj.lib.BaseLib$setmetatable
            r0.<init>()
            java.lang.String r1 = "setmetatable"
            r4.i2(r1, r0)
        Lbe:
            luaj.lib.BaseLib$tonumber r0 = new luaj.lib.BaseLib$tonumber
            r0.<init>()
            java.lang.String r1 = "tonumber"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$tostring r0 = new luaj.lib.BaseLib$tostring
            r0.<init>()
            java.lang.String r1 = "tostring"
            r4.i2(r1, r0)
            luaj.lib.BaseLib$type r0 = new luaj.lib.BaseLib$type
            r0.<init>()
            java.lang.String r1 = "type"
            r4.i2(r1, r0)
            boolean r3 = r3.X
            if (r3 == 0) goto Lea
            luaj.lib.BaseLib$xpcall r3 = new luaj.lib.BaseLib$xpcall
            r3.<init>(r2)
            java.lang.String r0 = "xpcall"
            r4.i2(r0, r3)
        Lea:
            luaj.lib.BaseLib$next r3 = new luaj.lib.BaseLib$next
            r3.<init>()
            java.lang.String r0 = "next"
            r4.i2(r0, r3)
            luaj.lib.BaseLib$pairs r0 = new luaj.lib.BaseLib$pairs
            r0.<init>(r3)
            java.lang.String r3 = "pairs"
            r4.i2(r3, r0)
            luaj.lib.BaseLib$ipairs r3 = new luaj.lib.BaseLib$ipairs
            r3.<init>()
            java.lang.String r0 = "ipairs"
            r4.i2(r0, r3)
            return r4
    }

    @Override // luaj.lib.f
    public java.io.InputStream u(java.lang.String r4) {
            r3 = this;
            luaj.Globals r0 = r3.T
            java.io.File r4 = r0.R3(r4)
            luaj.Globals r0 = r3.T
            luaj.lib.e r0 = r0.Z
            r1 = 0
            if (r0 != 0) goto L19
            luaj.lib.BaseLib$b r0 = new luaj.lib.BaseLib$b     // Catch: java.io.IOException -> L18
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.IOException -> L18
            r2.<init>(r4)     // Catch: java.io.IOException -> L18
            r0.<init>(r2)     // Catch: java.io.IOException -> L18
            return r0
        L18:
            return r1
        L19:
            java.io.FileInputStream r4 = luaj.lib.d.e(r4, r0)     // Catch: java.io.IOException -> L26
            if (r4 != 0) goto L20
            goto L26
        L20:
            luaj.lib.BaseLib$b r0 = new luaj.lib.BaseLib$b     // Catch: java.io.IOException -> L26
            r0.<init>(r4)     // Catch: java.io.IOException -> L26
            r1 = r0
        L26:
            return r1
    }
}
