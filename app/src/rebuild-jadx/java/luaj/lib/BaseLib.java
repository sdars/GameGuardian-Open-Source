package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
public class BaseLib extends luaj.lib.TwoArgFunction implements luaj.lib.f {
    luaj.Globals T;
    private luaj.lib.BaseLib.c U = null;
    byte[] V = null;

    static final class _assert extends luaj.lib.VarArgFunction {
        _assert() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            if (varargs.U() == 0) {
                luaj.LuaValue.l0(1, "assert", "value expected");
            }
            if (varargs.f0(1)) {
                return varargs;
            }
            if (varargs.U() == 1) {
                throw new luaj.d("assertion failed!");
            }
            throw new luaj.d(varargs.v(2));
        }
    }

    class a extends java.io.InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1732a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.io.InputStream f1733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ luaj.lib.BaseLib.c f1734c;

        a(java.io.InputStream inputStream, luaj.lib.BaseLib.c cVar) {
            this.f1733b = inputStream;
            this.f1734c = cVar;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            int i = this.f1733b.read();
            try {
                if (i != -1) {
                    this.f1734c.f1739b.write(i);
                    this.f1732a++;
                } else {
                    int i2 = this.f1732a;
                    if (i2 > 0) {
                        this.f1734c.f1741d.writeInt(i2);
                    }
                }
            } catch (java.lang.Throwable th) {
                android.ext.e1.s("Failed write log file", th);
            }
            return i;
        }
    }

    static final class assert2 extends luaj.lib.VarArgFunction {
        assert2() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            java.lang.StringBuilder sb;
            java.lang.String str;
            luaj.LuaValue luaValueV = varargs.v(1);
            luaj.LuaValue luaValueV2 = varargs.v(2);
            if (!luaValueV.P0(luaValueV2)) {
                if (luaValueV.B2().equals(luaValueV2.B2())) {
                    if (luaValueV.D2().equals(luaValueV2.D2())) {
                        sb = new java.lang.StringBuilder();
                        sb.append(luaValueV);
                        sb.append(" {");
                        sb.append(luaValueV.getClass());
                        sb.append("} ~= ");
                        sb.append(luaValueV2);
                        sb.append(" {");
                        sb.append(luaValueV2.getClass());
                        str = "}";
                    } else {
                        sb = new java.lang.StringBuilder();
                        sb.append(luaValueV);
                        sb.append(" [");
                        sb.append(luaValueV.D2());
                        sb.append("] ~= ");
                        sb.append(luaValueV2);
                        sb.append(" [");
                        sb.append(luaValueV2.D2());
                        str = "]";
                    }
                    sb.append(str);
                } else {
                    sb = new java.lang.StringBuilder();
                    sb.append(luaValueV);
                    sb.append(" ~= ");
                    sb.append(luaValueV2);
                }
                luaj.LuaValue.R0(sb.toString() + ": " + varargs.Z(3, "assertion failed!"));
            }
            return varargs;
        }
    }

    public static class b extends java.io.BufferedInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f1737b;

        public b(java.io.InputStream inputStream) {
            super(inputStream);
            this.f1737b = -1L;
        }

        public long a() {
            return this.f1736a;
        }

        public java.io.InputStream b() {
            return ((java.io.BufferedInputStream) this).in;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            super.mark(i);
            this.f1737b = this.f1736a;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read() throws java.io.IOException {
            int i = super.read();
            if (i != -1) {
                this.f1736a++;
            }
            return i;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            int i3 = super.read(bArr, i, i2);
            if (i3 != -1) {
                this.f1736a += (long) i3;
            }
            return i3;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!super.markSupported()) {
                throw new java.io.IOException("Mark not supported");
            }
            if (this.f1737b == -1) {
                throw new java.io.IOException("Mark not set");
            }
            super.reset();
            this.f1736a = this.f1737b;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws java.io.IOException {
            long jSkip = super.skip(j);
            this.f1736a += jSkip;
            return jSkip;
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.io.File f1738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.io.OutputStream f1739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.io.File f1740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.io.DataOutputStream f1741d;

        c(java.lang.String str) {
            this.f1738a = new java.io.File(str + ".load");
            this.f1739b = new java.io.BufferedOutputStream(new java.io.FileOutputStream(this.f1738a));
            this.f1740c = new java.io.File(str + ".load.tmp");
            this.f1741d = new java.io.DataOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(this.f1740c)));
        }

        void a() {
            try {
                this.f1739b.close();
                this.f1741d.close();
                int length = ((int) this.f1740c.length()) / 4;
                if (length > 0) {
                    android.ext.Tools.J1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.debug_load) + ": " + length);
                    java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(this.f1738a));
                    java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(this.f1740c)));
                    luaj.lib.BaseLib baseLib = luaj.lib.BaseLib.this;
                    byte[] bArr = baseLib.V;
                    if (bArr == null) {
                        bArr = new byte[8192];
                        baseLib.V = bArr;
                    }
                    byte[] bArr2 = new byte[512];
                    b(bArr2, 0, "load_0000000.lua");
                    b(bArr2, 100, "0000666\u00000000000\u00000002004\u000000000000000\u000000000000000\u0000000000\u0000 0");
                    b(bArr2, 257, "ustar00\u0000root");
                    b(bArr2, 297, "sdcard_r");
                    int i = -64;
                    for (int i2 = 0; i2 < 512; i2++) {
                        byte b2 = bArr2[i2];
                        if (b2 != 0) {
                            i += b2 & 255;
                        }
                    }
                    java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(this.f1738a.getAbsolutePath() + ".tar"));
                    for (int i3 = 0; i3 < length; i3++) {
                        int i4 = dataInputStream.readInt();
                        java.lang.String string = java.lang.Integer.toString(i3);
                        int length2 = string.length();
                        int i5 = 12 - length2;
                        int i6 = i;
                        for (int i7 = 0; i7 < length2; i7++) {
                            char cCharAt = string.charAt(i7);
                            i6 += (cCharAt & 255) - 48;
                            bArr2[i5 + i7] = (byte) cCharAt;
                        }
                        b(bArr2, 124, "00000000000\u000000000000000\u0000000000\u0000");
                        c(bArr2, 154, i6 + c(bArr2, 135, i4));
                        bufferedOutputStream.write(bArr2, 0, 512);
                        int i8 = i4;
                        while (i8 > 0) {
                            int i9 = bufferedInputStream.read(bArr, 0, i8 > bArr.length ? bArr.length : i8);
                            if (i9 > 0) {
                                bufferedOutputStream.write(bArr, 0, i9);
                                i8 -= i9;
                            }
                        }
                        int i10 = i4 % 512;
                        if (i10 > 0) {
                            int i11 = 512 - i10;
                            java.util.Arrays.fill(bArr, 0, i11, (byte) 0);
                            bufferedOutputStream.write(bArr, 0, i11);
                        }
                    }
                    bufferedOutputStream.write(new byte[1024], 0, 1024);
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    dataInputStream.close();
                }
                this.f1738a.delete();
                this.f1740c.delete();
            } catch (java.lang.Throwable th) {
                android.ext.e1.g("Failed end log load for " + this.f1738a, th);
            }
        }

        void b(byte[] bArr, int i, java.lang.String str) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i + i2] = (byte) str.charAt(i2);
            }
        }

        int c(byte[] bArr, int i, int i2) {
            java.lang.String octalString = java.lang.Integer.toOctalString(i2);
            int length = octalString.length();
            int i3 = i - length;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = octalString.charAt(i5);
                i4 += (cCharAt & 255) - 48;
                bArr[i3 + i5] = (byte) cCharAt;
            }
            return i4;
        }
    }

    static final class collectgarbage extends luaj.lib.VarArgFunction {
        collectgarbage() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            java.lang.String strZ = varargs.Z(1, "collect");
            if ("collect".equals(strZ)) {
                java.lang.System.gc();
                return luaj.LuaValue.f1677g;
            }
            if ("count".equals(strZ)) {
                java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
                return luaj.LuaValue.N2(luaj.LuaValue.J2(jFreeMemory / 1024.0d), luaj.LuaValue.I2(jFreeMemory % 1024));
            }
            if ("step".equals(strZ)) {
                java.lang.System.gc();
                return luaj.LuaValue.f1674d;
            }
            luaj.LuaValue.l0(1, "collectgarbage", "invalid option '" + strZ + "'");
            return luaj.LuaValue.f1673c;
        }
    }

    private static class d extends java.io.InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final luaj.LuaValue f1743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte[] f1744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1746d = 0;

        d(luaj.LuaValue luaValue) {
            this.f1743a = luaValue;
        }

        @Override // java.io.InputStream
        public int read() {
            int i = this.f1746d;
            if (i < 0) {
                return -1;
            }
            if (i == 0) {
                luaj.LuaValue luaValueCall = this.f1743a.call();
                if (luaValueCall.l1()) {
                    this.f1746d = -1;
                    return -1;
                }
                luaj.LuaString luaStringQ2 = luaValueCall.q2();
                this.f1744b = luaStringQ2.P;
                this.f1745c = luaStringQ2.Q;
                int i2 = luaStringQ2.R;
                this.f1746d = i2;
                if (i2 <= 0) {
                    return -1;
                }
            }
            this.f1746d--;
            byte[] bArr = this.f1744b;
            int i3 = this.f1745c;
            this.f1745c = i3 + 1;
            return bArr[i3] & 255;
        }
    }

    final class dofile extends luaj.lib.VarArgFunction {
        dofile() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaValue luaValueW = varargs.w();
            if (!luaValueW.n1() && !luaValueW.l1()) {
                luaj.LuaValue.l0(1, "dofile", "string expected, got " + luaValueW.D2());
            }
            java.lang.String strB0 = luaValueW.B0();
            luaj.lib.BaseLib baseLib = luaj.lib.BaseLib.this;
            luaj.Varargs varargsA3 = baseLib.a3(strB0, "bt", baseLib.T);
            return varargsA3.Q(1) ? luaj.LuaValue.R0(varargsA3.h0(2)) : varargsA3.w().invoke();
        }
    }

    static final class error extends luaj.lib.TwoArgFunction {
        error() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            if (luaValue.l1()) {
                throw new luaj.d(luaj.LuaValue.f1673c);
            }
            if (!luaValue.n1() || luaValue2.H1(1) == 0) {
                throw new luaj.d(luaValue);
            }
            throw new luaj.d(luaValue.g0(), luaValue2.H1(1));
        }
    }

    static final class getmetatable extends luaj.lib.LibFunction {
        getmetatable() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call() {
            return luaj.LuaValue.k0(1, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            luaj.LuaValue luaValueV0 = luaValue.V0();
            return luaValueV0 != null ? luaValueV0.V1(luaj.LuaValue.p).M1(luaValueV0) : luaj.LuaValue.f1673c;
        }
    }

    static final class inext extends luaj.lib.VarArgFunction {
        inext() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            return varargs.I(1).p3(varargs.v(2));
        }
    }

    static final class ipairs extends luaj.lib.VarArgFunction {
        luaj.lib.BaseLib.inext T = new luaj.lib.BaseLib.inext();

        ipairs() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            return luaj.LuaValue.M2(this.T, varargs.I(1), luaj.LuaValue.f1677g);
        }
    }

    final class load extends luaj.lib.VarArgFunction {
        load() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaValue luaValueW = varargs.w();
            if (!luaValueW.n1() && !luaValueW.g1()) {
                luaj.LuaValue.l0(1, "load", "string or function expected, got " + luaValueW.D2());
            }
            java.lang.String strZ = varargs.Z(2, luaValueW.n1() ? luaValueW.g0() : "=(load)");
            java.lang.String strZ2 = varargs.Z(3, "bt");
            luaj.LuaValue luaValueD0 = varargs.d0(4, luaj.lib.BaseLib.this.T);
            luaj.LuaString luaStringQ2 = luaValueW.n1() ? luaValueW.q2() : null;
            java.io.InputStream inputStreamK3 = luaStringQ2 != null ? luaStringQ2.k3() : new luaj.lib.BaseLib.d(luaValueW.y0());
            if (luaj.lib.BaseLib.this.U != null) {
                inputStreamK3 = luaj.lib.BaseLib.this.Y2(luaStringQ2, null, false, inputStreamK3);
            }
            return luaj.lib.BaseLib.this.b3(inputStreamK3, strZ, strZ2, luaValueD0);
        }
    }

    final class loadfile extends luaj.lib.VarArgFunction {
        loadfile() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaValue luaValueW = varargs.w();
            if (!luaValueW.n1() && !luaValueW.l1()) {
                luaj.LuaValue.l0(1, "loadfile", "string expected, got " + luaValueW.D2());
            }
            return luaj.lib.BaseLib.this.a3(luaValueW.B0(), varargs.Z(2, "bt"), varargs.d0(3, luaj.lib.BaseLib.this.T));
        }
    }

    static final class next extends luaj.lib.VarArgFunction {
        next() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            return varargs.I(1).v3(varargs.v(2));
        }
    }

    static final class pairs extends luaj.lib.VarArgFunction {
        final luaj.lib.BaseLib.next T;

        pairs(luaj.lib.BaseLib.next nextVar) {
            this.T = nextVar;
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            return luaj.LuaValue.M2(this.T, varargs.I(1), luaj.LuaValue.f1673c);
        }
    }

    final class pcall extends luaj.lib.VarArgFunction {
        pcall() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            return luaj.LuaClosure.d3(luaj.lib.BaseLib.this.T, this, varargs.K(1), varargs.e0(2));
        }
    }

    final class print extends luaj.lib.VarArgFunction {
        final luaj.lib.BaseLib T;

        print(luaj.lib.BaseLib baseLib) {
            this.T = baseLib;
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaValue luaValueT0 = luaj.lib.BaseLib.this.T.T0("tostring");
            int iU = varargs.U();
            for (int i = 1; i <= iU; i++) {
                if (i > 1) {
                    luaj.lib.BaseLib.this.T.c0.print(" \t");
                }
                luaj.LuaValue luaValueCall = luaValueT0.call(varargs.v(i));
                if (!luaValueCall.n1()) {
                    throw new luaj.d("'tostring' must return a string to 'print', got " + luaValueCall.D2());
                }
                luaj.lib.BaseLib.this.T.c0.print(luaValueCall.q2().g0());
            }
            luaj.lib.BaseLib.this.T.c0.println();
            return luaj.LuaValue.f1676f;
        }
    }

    static final class rawequal extends luaj.lib.LibFunction {
        rawequal() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call() {
            return luaj.LuaValue.k0(1, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaj.LuaValue.k0(2, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            return luaj.LuaValue.H2(luaValue.T1(luaValue2));
        }
    }

    static final class rawget extends luaj.lib.TableLibFunction {
        rawget() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaj.LuaValue.k0(2, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            return luaValue.H0().V1(luaValue2);
        }
    }

    static final class rawlen extends luaj.lib.LibFunction {
        rawlen() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaj.LuaValue.I2(luaValue.W1());
        }
    }

    static final class rawset extends luaj.lib.TableLibFunction {
        rawset() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaj.LuaValue.k0(2, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            return luaj.LuaValue.k0(3, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2, luaj.LuaValue luaValue3) {
            luaj.LuaTable luaTableH0 = luaValue.H0();
            if (!luaValue2.q1()) {
                luaj.LuaValue.k0(2, "table index is nil");
            }
            luaTableH0.d2(luaValue2, luaValue3);
            return luaTableH0;
        }
    }

    static final class select extends luaj.lib.VarArgFunction {
        select() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            int iU = varargs.U() - 1;
            if (varargs.w().equals(luaj.LuaValue.K2("#"))) {
                return luaj.LuaValue.I2(iU);
            }
            int iD = varargs.D(1);
            if (iD == 0 || iD < (-iU)) {
                luaj.LuaValue.k0(1, "index out of range");
            }
            return varargs.e0(iD < 0 ? iU + iD + 2 : iD + 1);
        }
    }

    static final class setmetatable extends luaj.lib.TableLibFunction {
        setmetatable() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaj.LuaValue.k0(2, "nil or table expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            luaj.LuaValue luaValueV0 = luaValue.H0().V0();
            if (luaValueV0 != null && !luaValueV0.V1(luaj.LuaValue.p).l1()) {
                luaj.LuaValue.R0("cannot change a protected metatable");
            }
            return luaValue.k2(luaValue2.l1() ? null : luaValue2.H0());
        }
    }

    static final class tonumber extends luaj.lib.LibFunction {
        tonumber() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaValue.A2();
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            if (luaValue2.l1()) {
                return luaValue.A2();
            }
            int iA0 = luaValue2.A0();
            if (iA0 < 2 || iA0 > 36) {
                luaj.LuaValue.k0(2, "base out of range");
            }
            return luaValue.G0().l3(iA0);
        }
    }

    static final class tostring extends luaj.lib.LibFunction {
        tostring() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaj.lib.BaseLib.d3(luaValue);
        }
    }

    static final class type extends luaj.lib.LibFunction {
        type() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaj.LuaValue.K2(luaValue.D2());
        }
    }

    final class xpcall extends luaj.lib.VarArgFunction {
        xpcall() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaThread luaThread = luaj.lib.BaseLib.this.T.f0;
            luaj.LuaValue luaValue = luaThread.S;
            luaThread.S = varargs.K(2);
            try {
                return luaj.LuaClosure.d3(luaj.lib.BaseLib.this.T, this, varargs.K(1), varargs.e0(3));
            } finally {
                luaThread.S = luaValue;
            }
        }
    }

    static luaj.LuaString d3(luaj.LuaValue luaValue) {
        luaj.LuaValue luaValueX1 = luaValue.x1(luaj.LuaValue.B);
        if (luaValueX1.l1()) {
            luaj.LuaValue luaValueB2 = luaValue.B2();
            return !luaValueB2.l1() ? luaValueB2.G0() : luaj.LuaValue.K2(luaValue.g0());
        }
        luaj.LuaValue luaValueCall = luaValueX1.call(luaValue);
        luaj.LuaValue luaValueB3 = luaValueCall.B2();
        if (!luaValueB3.l1()) {
            return luaValueB3.G0();
        }
        throw new luaj.d("'__tostring' must return a string, got '" + luaValueCall.D2() + "' ('" + luaValueCall + "')");
    }

    java.io.InputStream Y2(luaj.LuaString luaString, java.lang.String str, boolean z, java.io.InputStream inputStream) {
        luaj.lib.BaseLib.c cVar = this.U;
        if (cVar != null) {
            if (z) {
                if (str != null) {
                    try {
                        byte[] bArr = this.V;
                        if (bArr == null) {
                            bArr = new byte[8192];
                            this.V = bArr;
                        }
                        java.io.FileDescriptor fileDescriptorOpen = android.system.Os.open(str, android.system.OsConstants.O_RDONLY, 438);
                        int i = 0;
                        while (true) {
                            int i2 = android.system.Os.read(fileDescriptorOpen, bArr, 0, bArr.length);
                            if (i2 <= 0) {
                                break;
                            }
                            cVar.f1739b.write(bArr, 0, i2);
                            i += i2;
                        }
                        android.system.Os.close(fileDescriptorOpen);
                        if (i > 0) {
                            cVar.f1741d.writeInt(i);
                        }
                    } catch (java.lang.Throwable th) {
                        android.ext.e1.g("Failed write log file from " + str, th);
                    }
                }
            } else {
                if (luaString == null) {
                    return new luaj.lib.BaseLib.a(inputStream, cVar);
                }
                try {
                    int i3 = luaString.R;
                    if (i3 > 0) {
                        cVar.f1739b.write(luaString.P, luaString.Q, i3);
                        cVar.f1741d.writeInt(i3);
                    }
                } catch (java.lang.Throwable th2) {
                    android.ext.e1.s("Failed write log file", th2);
                }
            }
        }
        return inputStream;
    }

    public void Z2() {
        luaj.lib.BaseLib.c cVar = this.U;
        if (cVar != null) {
            cVar.a();
        }
    }

    public luaj.Varargs a3(java.lang.String str, java.lang.String str2, luaj.LuaValue luaValue) {
        java.io.InputStream inputStreamU = this.T.e0.u(str);
        if (inputStreamU == null) {
            return luaj.LuaValue.N2(luaj.LuaValue.f1673c, luaj.LuaValue.K2("cannot open " + str + ": No such file or directory"));
        }
        try {
            java.lang.String absolutePath = this.T.R3(str).getAbsolutePath();
            luaj.Varargs varargsB3 = b3(inputStreamU, '@' + absolutePath, str2, luaValue);
            if (varargsB3 instanceof luaj.LuaClosure) {
                ((luaj.LuaClosure) varargsB3).U = absolutePath;
            }
            if (this.U != null && (varargsB3 instanceof luaj.LuaFunction)) {
                Y2(null, str, true, null);
            }
            try {
                inputStreamU.close();
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
            return varargsB3;
        } catch (java.lang.Throwable th) {
            try {
                java.lang.String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getName();
                }
                return luaj.LuaValue.N2(luaj.LuaValue.f1673c, luaj.LuaValue.K2(message));
            } finally {
                try {
                    inputStreamU.close();
                } catch (java.lang.Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public luaj.Varargs b3(java.io.InputStream inputStream, java.lang.String str, java.lang.String str2, luaj.LuaValue luaValue) {
        try {
            if (inputStream != null) {
                return this.T.O3(inputStream, str, str2, luaValue);
            }
            return luaj.LuaValue.N2(luaj.LuaValue.f1673c, luaj.LuaValue.K2("not found: " + str));
        } catch (java.lang.Exception e2) {
            return luaj.LuaValue.N2(luaj.LuaValue.f1673c, luaj.LuaValue.K2(e2.getMessage()));
        }
    }

    public void c3(java.lang.String str) {
        try {
            this.U = new luaj.lib.BaseLib.c(str);
        } catch (java.lang.Throwable th) {
            android.ext.e1.g("Failed prepare log loads for " + str, th);
        }
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        luaj.Globals globalsZ0 = luaValue2.z0();
        this.T = globalsZ0;
        globalsZ0.e0 = this;
        globalsZ0.g0 = this;
        if (globalsZ0.X) {
            luaValue2.i2("_G", luaValue2);
            luaValue2.h2("_VERSION", "Lua 5.3 (with Luaj 3.0.1)");
            luaValue2.i2("assert", new luaj.lib.BaseLib._assert());
            luaValue2.i2("assert2", new luaj.lib.BaseLib.assert2());
            luaValue2.i2("collectgarbage", new luaj.lib.BaseLib.collectgarbage());
            luaValue2.i2("dofile", new luaj.lib.BaseLib.dofile());
            luaValue2.i2("error", new luaj.lib.BaseLib.error());
            luaValue2.i2("getmetatable", new luaj.lib.BaseLib.getmetatable());
            luaValue2.i2("load", new luaj.lib.BaseLib.load());
            luaValue2.i2("loadfile", new luaj.lib.BaseLib.loadfile());
            luaValue2.i2("pcall", new luaj.lib.BaseLib.pcall());
            luaValue2.i2("print", new luaj.lib.BaseLib.print(this));
        }
        luaValue2.i2("rawequal", new luaj.lib.BaseLib.rawequal());
        luaValue2.i2("rawget", new luaj.lib.BaseLib.rawget());
        luaValue2.i2("rawlen", new luaj.lib.BaseLib.rawlen());
        luaValue2.i2("rawset", new luaj.lib.BaseLib.rawset());
        luaValue2.i2("select", new luaj.lib.BaseLib.select());
        if (globalsZ0.X) {
            luaValue2.i2("setmetatable", new luaj.lib.BaseLib.setmetatable());
        }
        luaValue2.i2("tonumber", new luaj.lib.BaseLib.tonumber());
        luaValue2.i2("tostring", new luaj.lib.BaseLib.tostring());
        luaValue2.i2("type", new luaj.lib.BaseLib.type());
        if (globalsZ0.X) {
            luaValue2.i2("xpcall", new luaj.lib.BaseLib.xpcall());
        }
        luaj.lib.BaseLib.next nextVar = new luaj.lib.BaseLib.next();
        luaValue2.i2("next", nextVar);
        luaValue2.i2("pairs", new luaj.lib.BaseLib.pairs(nextVar));
        luaValue2.i2("ipairs", new luaj.lib.BaseLib.ipairs());
        return luaValue2;
    }

    @Override // luaj.lib.f
    public java.io.InputStream u(java.lang.String str) {
        java.io.File fileR3 = this.T.R3(str);
        luaj.lib.e eVar = this.T.Z;
        if (eVar == null) {
            try {
                return new luaj.lib.BaseLib.b(new java.io.FileInputStream(fileR3));
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        try {
            java.io.FileInputStream fileInputStreamE = luaj.lib.d.e(fileR3, eVar);
            if (fileInputStreamE == null) {
                return null;
            }
            return new luaj.lib.BaseLib.b(fileInputStreamE);
        } catch (java.io.IOException unused2) {
            return null;
        }
    }
}
