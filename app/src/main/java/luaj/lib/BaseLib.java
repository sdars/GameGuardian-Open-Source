package luaj.lib;

import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.system.Os;
import android.system.OsConstants;
import catch_.me_.if_.you_.can_.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import luaj.Globals;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class BaseLib extends TwoArgFunction implements f {
    Globals T;
    private c U = null;
    byte[] V = null;

    static final class _assert extends VarArgFunction {
        _assert() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            if (varargs.U() == 0) {
                LuaValue.l0(1, "assert", "value expected");
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

    class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1732a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f1733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f1734c;

        a(InputStream inputStream, c cVar) {
            this.f1733b = inputStream;
            this.f1734c = cVar;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
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
            } catch (Throwable th) {
                e1.s("Failed write log file", th);
            }
            return i;
        }
    }

    static final class assert2 extends VarArgFunction {
        assert2() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            StringBuilder sb;
            String str;
            LuaValue luaValueV = varargs.v(1);
            LuaValue luaValueV2 = varargs.v(2);
            if (!luaValueV.P0(luaValueV2)) {
                if (luaValueV.B2().equals(luaValueV2.B2())) {
                    if (luaValueV.D2().equals(luaValueV2.D2())) {
                        sb = new StringBuilder();
                        sb.append(luaValueV);
                        sb.append(" {");
                        sb.append(luaValueV.getClass());
                        sb.append("} ~= ");
                        sb.append(luaValueV2);
                        sb.append(" {");
                        sb.append(luaValueV2.getClass());
                        str = "}";
                    } else {
                        sb = new StringBuilder();
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
                    sb = new StringBuilder();
                    sb.append(luaValueV);
                    sb.append(" ~= ");
                    sb.append(luaValueV2);
                }
                LuaValue.R0(sb.toString() + ": " + varargs.Z(3, "assertion failed!"));
            }
            return varargs;
        }
    }

    public static class b extends BufferedInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f1737b;

        public b(InputStream inputStream) {
            super(inputStream);
            this.f1737b = -1L;
        }

        public long a() {
            return this.f1736a;
        }

        public InputStream b() {
            return ((BufferedInputStream) this).in;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            super.mark(i);
            this.f1737b = this.f1736a;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = super.read();
            if (i != -1) {
                this.f1736a++;
            }
            return i;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!super.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f1737b == -1) {
                throw new IOException("Mark not set");
            }
            super.reset();
            this.f1736a = this.f1737b;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long jSkip = super.skip(j);
            this.f1736a += jSkip;
            return jSkip;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = super.read(bArr, i, i2);
            if (i3 != -1) {
                this.f1736a += (long) i3;
            }
            return i3;
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        File f1738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        OutputStream f1739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File f1740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        DataOutputStream f1741d;

        c(String str) {
            this.f1738a = new File(str + ".load");
            this.f1739b = new BufferedOutputStream(new FileOutputStream(this.f1738a));
            this.f1740c = new File(str + ".load.tmp");
            this.f1741d = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.f1740c)));
        }

        void a() {
            try {
                this.f1739b.close();
                this.f1741d.close();
                int length = ((int) this.f1740c.length()) / 4;
                if (length > 0) {
                    Tools.J1(b2.f(R.string.debug_load) + ": " + length);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f1738a));
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(this.f1740c)));
                    BaseLib baseLib = BaseLib.this;
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
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.f1738a.getAbsolutePath() + ".tar"));
                    for (int i3 = 0; i3 < length; i3++) {
                        int i4 = dataInputStream.readInt();
                        String string = Integer.toString(i3);
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
                            Arrays.fill(bArr, 0, i11, (byte) 0);
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
            } catch (Throwable th) {
                e1.g("Failed end log load for " + this.f1738a, th);
            }
        }

        void b(byte[] bArr, int i, String str) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i + i2] = (byte) str.charAt(i2);
            }
        }

        int c(byte[] bArr, int i, int i2) {
            String octalString = Integer.toOctalString(i2);
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

    static final class collectgarbage extends VarArgFunction {
        collectgarbage() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            String strZ = varargs.Z(1, "collect");
            if ("collect".equals(strZ)) {
                System.gc();
                return LuaValue.f1677g;
            }
            if ("count".equals(strZ)) {
                Runtime runtime = Runtime.getRuntime();
                long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
                return LuaValue.N2(LuaValue.J2(jFreeMemory / 1024.0d), LuaValue.I2(jFreeMemory % 1024));
            }
            if ("step".equals(strZ)) {
                System.gc();
                return LuaValue.f1674d;
            }
            LuaValue.l0(1, "collectgarbage", "invalid option '" + strZ + "'");
            return LuaValue.f1673c;
        }
    }

    private static class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final LuaValue f1743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte[] f1744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1746d = 0;

        d(LuaValue luaValue) {
            this.f1743a = luaValue;
        }

        @Override // java.io.InputStream
        public int read() {
            int i = this.f1746d;
            if (i < 0) {
                return -1;
            }
            if (i == 0) {
                LuaValue luaValueCall = this.f1743a.call();
                if (luaValueCall.l1()) {
                    this.f1746d = -1;
                    return -1;
                }
                LuaString luaStringQ2 = luaValueCall.q2();
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

    final class dofile extends VarArgFunction {
        dofile() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValueW = varargs.w();
            if (!luaValueW.n1() && !luaValueW.l1()) {
                LuaValue.l0(1, "dofile", "string expected, got " + luaValueW.D2());
            }
            String strB0 = luaValueW.B0();
            BaseLib baseLib = BaseLib.this;
            Varargs varargsA3 = baseLib.a3(strB0, "bt", baseLib.T);
            return varargsA3.Q(1) ? LuaValue.R0(varargsA3.h0(2)) : varargsA3.w().invoke();
        }
    }

    static final class error extends TwoArgFunction {
        error() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            if (luaValue.l1()) {
                throw new luaj.d(LuaValue.f1673c);
            }
            if (!luaValue.n1() || luaValue2.H1(1) == 0) {
                throw new luaj.d(luaValue);
            }
            throw new luaj.d(luaValue.g0(), luaValue2.H1(1));
        }
    }

    static final class getmetatable extends LibFunction {
        getmetatable() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call() {
            return LuaValue.k0(1, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            LuaValue luaValueV0 = luaValue.V0();
            return luaValueV0 != null ? luaValueV0.V1(LuaValue.p).M1(luaValueV0) : LuaValue.f1673c;
        }
    }

    static final class inext extends VarArgFunction {
        inext() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            return varargs.I(1).p3(varargs.v(2));
        }
    }

    static final class ipairs extends VarArgFunction {
        inext T = new inext();

        ipairs() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            return LuaValue.M2(this.T, varargs.I(1), LuaValue.f1677g);
        }
    }

    final class load extends VarArgFunction {
        load() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValueW = varargs.w();
            if (!luaValueW.n1() && !luaValueW.g1()) {
                LuaValue.l0(1, "load", "string or function expected, got " + luaValueW.D2());
            }
            String strZ = varargs.Z(2, luaValueW.n1() ? luaValueW.g0() : "=(load)");
            String strZ2 = varargs.Z(3, "bt");
            LuaValue luaValueD0 = varargs.d0(4, BaseLib.this.T);
            LuaString luaStringQ2 = luaValueW.n1() ? luaValueW.q2() : null;
            InputStream inputStreamK3 = luaStringQ2 != null ? luaStringQ2.k3() : new d(luaValueW.y0());
            if (BaseLib.this.U != null) {
                inputStreamK3 = BaseLib.this.Y2(luaStringQ2, null, false, inputStreamK3);
            }
            return BaseLib.this.b3(inputStreamK3, strZ, strZ2, luaValueD0);
        }
    }

    final class loadfile extends VarArgFunction {
        loadfile() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValueW = varargs.w();
            if (!luaValueW.n1() && !luaValueW.l1()) {
                LuaValue.l0(1, "loadfile", "string expected, got " + luaValueW.D2());
            }
            return BaseLib.this.a3(luaValueW.B0(), varargs.Z(2, "bt"), varargs.d0(3, BaseLib.this.T));
        }
    }

    static final class next extends VarArgFunction {
        next() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            return varargs.I(1).v3(varargs.v(2));
        }
    }

    static final class pairs extends VarArgFunction {
        final next T;

        pairs(next nextVar) {
            this.T = nextVar;
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            return LuaValue.M2(this.T, varargs.I(1), LuaValue.f1673c);
        }
    }

    final class pcall extends VarArgFunction {
        pcall() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            return LuaClosure.d3(BaseLib.this.T, this, varargs.K(1), varargs.e0(2));
        }
    }

    final class print extends VarArgFunction {
        final BaseLib T;

        print(BaseLib baseLib) {
            this.T = baseLib;
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValueT0 = BaseLib.this.T.T0("tostring");
            int iU = varargs.U();
            for (int i = 1; i <= iU; i++) {
                if (i > 1) {
                    BaseLib.this.T.c0.print(" \t");
                }
                LuaValue luaValueCall = luaValueT0.call(varargs.v(i));
                if (!luaValueCall.n1()) {
                    throw new luaj.d("'tostring' must return a string to 'print', got " + luaValueCall.D2());
                }
                BaseLib.this.T.c0.print(luaValueCall.q2().g0());
            }
            BaseLib.this.T.c0.println();
            return LuaValue.f1676f;
        }
    }

    static final class rawequal extends LibFunction {
        rawequal() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call() {
            return LuaValue.k0(1, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.k0(2, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return LuaValue.H2(luaValue.T1(luaValue2));
        }
    }

    static final class rawget extends TableLibFunction {
        rawget() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.k0(2, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return luaValue.H0().V1(luaValue2);
        }
    }

    static final class rawlen extends LibFunction {
        rawlen() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.I2(luaValue.W1());
        }
    }

    static final class rawset extends TableLibFunction {
        rawset() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.k0(2, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return LuaValue.k0(3, "value expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
            LuaTable luaTableH0 = luaValue.H0();
            if (!luaValue2.q1()) {
                LuaValue.k0(2, "table index is nil");
            }
            luaTableH0.d2(luaValue2, luaValue3);
            return luaTableH0;
        }
    }

    static final class select extends VarArgFunction {
        select() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            int iU = varargs.U() - 1;
            if (varargs.w().equals(LuaValue.K2("#"))) {
                return LuaValue.I2(iU);
            }
            int iD = varargs.D(1);
            if (iD == 0 || iD < (-iU)) {
                LuaValue.k0(1, "index out of range");
            }
            return varargs.e0(iD < 0 ? iU + iD + 2 : iD + 1);
        }
    }

    static final class setmetatable extends TableLibFunction {
        setmetatable() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.k0(2, "nil or table expected");
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            LuaValue luaValueV0 = luaValue.H0().V0();
            if (luaValueV0 != null && !luaValueV0.V1(LuaValue.p).l1()) {
                LuaValue.R0("cannot change a protected metatable");
            }
            return luaValue.k2(luaValue2.l1() ? null : luaValue2.H0());
        }
    }

    static final class tonumber extends LibFunction {
        tonumber() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return luaValue.A2();
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            if (luaValue2.l1()) {
                return luaValue.A2();
            }
            int iA0 = luaValue2.A0();
            if (iA0 < 2 || iA0 > 36) {
                LuaValue.k0(2, "base out of range");
            }
            return luaValue.G0().l3(iA0);
        }
    }

    static final class tostring extends LibFunction {
        tostring() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return BaseLib.d3(luaValue);
        }
    }

    static final class type extends LibFunction {
        type() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.K2(luaValue.D2());
        }
    }

    final class xpcall extends VarArgFunction {
        xpcall() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaThread luaThread = BaseLib.this.T.f0;
            LuaValue luaValue = luaThread.S;
            luaThread.S = varargs.K(2);
            try {
                return LuaClosure.d3(BaseLib.this.T, this, varargs.K(1), varargs.e0(3));
            } finally {
                luaThread.S = luaValue;
            }
        }
    }

    static LuaString d3(LuaValue luaValue) {
        LuaValue luaValueX1 = luaValue.x1(LuaValue.B);
        if (luaValueX1.l1()) {
            LuaValue luaValueB2 = luaValue.B2();
            return !luaValueB2.l1() ? luaValueB2.G0() : LuaValue.K2(luaValue.g0());
        }
        LuaValue luaValueCall = luaValueX1.call(luaValue);
        LuaValue luaValueB3 = luaValueCall.B2();
        if (!luaValueB3.l1()) {
            return luaValueB3.G0();
        }
        throw new luaj.d("'__tostring' must return a string, got '" + luaValueCall.D2() + "' ('" + luaValueCall + "')");
    }

    InputStream Y2(LuaString luaString, String str, boolean z, InputStream inputStream) {
        c cVar = this.U;
        if (cVar != null) {
            if (z) {
                if (str != null) {
                    try {
                        byte[] bArr = this.V;
                        if (bArr == null) {
                            bArr = new byte[8192];
                            this.V = bArr;
                        }
                        FileDescriptor fileDescriptorOpen = Os.open(str, OsConstants.O_RDONLY, 438);
                        int i = 0;
                        while (true) {
                            int i2 = Os.read(fileDescriptorOpen, bArr, 0, bArr.length);
                            if (i2 <= 0) {
                                break;
                            }
                            cVar.f1739b.write(bArr, 0, i2);
                            i += i2;
                        }
                        Os.close(fileDescriptorOpen);
                        if (i > 0) {
                            cVar.f1741d.writeInt(i);
                        }
                    } catch (Throwable th) {
                        e1.g("Failed write log file from " + str, th);
                    }
                }
            } else {
                if (luaString == null) {
                    return new a(inputStream, cVar);
                }
                try {
                    int i3 = luaString.R;
                    if (i3 > 0) {
                        cVar.f1739b.write(luaString.P, luaString.Q, i3);
                        cVar.f1741d.writeInt(i3);
                    }
                } catch (Throwable th2) {
                    e1.s("Failed write log file", th2);
                }
            }
        }
        return inputStream;
    }

    public void Z2() {
        c cVar = this.U;
        if (cVar != null) {
            cVar.a();
        }
    }

    public Varargs a3(String str, String str2, LuaValue luaValue) {
        InputStream inputStreamU = this.T.e0.u(str);
        if (inputStreamU == null) {
            return LuaValue.N2(LuaValue.f1673c, LuaValue.K2("cannot open " + str + ": No such file or directory"));
        }
        try {
            String absolutePath = this.T.R3(str).getAbsolutePath();
            Varargs varargsB3 = b3(inputStreamU, '@' + absolutePath, str2, luaValue);
            if (varargsB3 instanceof LuaClosure) {
                ((LuaClosure) varargsB3).U = absolutePath;
            }
            if (this.U != null && (varargsB3 instanceof LuaFunction)) {
                Y2(null, str, true, null);
            }
            try {
                inputStreamU.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return varargsB3;
        } catch (Throwable th) {
            try {
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getName();
                }
                return LuaValue.N2(LuaValue.f1673c, LuaValue.K2(message));
            } finally {
                try {
                    inputStreamU.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public Varargs b3(InputStream inputStream, String str, String str2, LuaValue luaValue) {
        try {
            if (inputStream != null) {
                return this.T.O3(inputStream, str, str2, luaValue);
            }
            return LuaValue.N2(LuaValue.f1673c, LuaValue.K2("not found: " + str));
        } catch (Exception e2) {
            return LuaValue.N2(LuaValue.f1673c, LuaValue.K2(e2.getMessage()));
        }
    }

    public void c3(String str) {
        try {
            this.U = new c(str);
        } catch (Throwable th) {
            e1.g("Failed prepare log loads for " + str, th);
        }
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        Globals globalsZ0 = luaValue2.z0();
        this.T = globalsZ0;
        globalsZ0.e0 = this;
        globalsZ0.g0 = this;
        if (globalsZ0.X) {
            luaValue2.i2("_G", luaValue2);
            luaValue2.h2("_VERSION", "Lua 5.3 (with Luaj 3.0.1)");
            luaValue2.i2("assert", new _assert());
            luaValue2.i2("assert2", new assert2());
            luaValue2.i2("collectgarbage", new collectgarbage());
            luaValue2.i2("dofile", new dofile());
            luaValue2.i2("error", new error());
            luaValue2.i2("getmetatable", new getmetatable());
            luaValue2.i2("load", new load());
            luaValue2.i2("loadfile", new loadfile());
            luaValue2.i2("pcall", new pcall());
            luaValue2.i2("print", new print(this));
        }
        luaValue2.i2("rawequal", new rawequal());
        luaValue2.i2("rawget", new rawget());
        luaValue2.i2("rawlen", new rawlen());
        luaValue2.i2("rawset", new rawset());
        luaValue2.i2("select", new select());
        if (globalsZ0.X) {
            luaValue2.i2("setmetatable", new setmetatable());
        }
        luaValue2.i2("tonumber", new tonumber());
        luaValue2.i2("tostring", new tostring());
        luaValue2.i2("type", new type());
        if (globalsZ0.X) {
            luaValue2.i2("xpcall", new xpcall());
        }
        next nextVar = new next();
        luaValue2.i2("next", nextVar);
        luaValue2.i2("pairs", new pairs(nextVar));
        luaValue2.i2("ipairs", new ipairs());
        return luaValue2;
    }

    @Override // luaj.lib.f
    public InputStream u(String str) {
        File fileR3 = this.T.R3(str);
        e eVar = this.T.Z;
        if (eVar == null) {
            try {
                return new b(new FileInputStream(fileR3));
            } catch (IOException unused) {
                return null;
            }
        }
        try {
            FileInputStream fileInputStreamE = luaj.lib.d.e(fileR3, eVar);
            if (fileInputStreamE == null) {
                return null;
            }
            return new b(fileInputStreamE);
        } catch (IOException unused2) {
            return null;
        }
    }
}
