package luaj.lib;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import luaj.Globals;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public abstract class IoLib extends TwoArgFunction {
    private static final LuaValue Z = LuaValue.K2("stdout");
    private static final LuaValue a0 = LuaValue.K2("stderr");
    private static final LuaValue b0 = LuaValue.K2("file");
    private static final LuaValue c0 = LuaValue.K2("closed file");
    public static final String[] d0 = {"close", "flush", "input", "lines", "open", "output", "popen", "read", "tmpfile", "type", "write"};
    public static final String[] e0 = {"close", "flush", "lines", "read", "seek", "setvbuf", "write"};
    private boolean T = false;
    private IoLib$File U = null;
    private IoLib$File V = null;
    private IoLib$File W = null;
    LuaTable X;
    public Globals Y;

    public static LuaValue A3(IoLib$File ioLib$File, boolean z, boolean z2) {
        int iY2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (!z) {
                while (true) {
                    iY2 = ioLib$File.Y2();
                    if (iY2 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(iY2);
                }
            } else {
                while (true) {
                    iY2 = ioLib$File.Y2();
                    if (iY2 >= 0) {
                        if (iY2 == 10) {
                            if (!z2) {
                                break;
                            }
                            byteArrayOutputStream.write(iY2);
                            break;
                        }
                        if (iY2 != 13 || z2) {
                            byteArrayOutputStream.write(iY2);
                        }
                    } else {
                        break;
                    }
                }
            }
            if (iY2 < 0) {
                if (byteArrayOutputStream.size() == 0) {
                    return LuaValue.f1673c;
                }
            }
        } catch (EOFException unused) {
        }
        return LuaString.o3(byteArrayOutputStream.toByteArray());
    }

    private IoLib$File B3(boolean z) {
        IoLib$File ioLib$File = this.U;
        if (ioLib$File == null) {
            LuaValue.R0("stdin not supported");
        }
        if (z && ioLib$File.V2()) {
            LuaValue.R0("standard input file is closed");
        }
        return ioLib$File;
    }

    private static Varargs C3(IoLib$File ioLib$File) {
        if (ioLib$File.W2()) {
            return t3("cannot close standard file", 1000);
        }
        ioLib$File.S2();
        return M3();
    }

    private IoLib$File D3(int i, String str, String str2) {
        try {
            return K3(i, str, str2);
        } catch (Exception e2) {
            LuaValue.S0("io error: " + e2.getMessage(), e2);
            return null;
        }
    }

    private Varargs E3(IoLib$File ioLib$File, Varargs varargs) {
        LuaValue luaValueW3;
        LuaString luaStringG0;
        int i;
        int iU = varargs.U();
        if (iU == 0) {
            return y3(ioLib$File, false);
        }
        LuaValue[] luaValueArr = new LuaValue[iU];
        int i2 = 0;
        while (i2 < iU) {
            int i3 = i2 + 1;
            LuaValue luaValueV = varargs.v(i3);
            int iC2 = luaValueV.C2();
            if (iC2 != 3) {
                if (iC2 == 4 && (i = (luaStringG0 = luaValueV.G0()).R) >= 1) {
                    byte[] bArr = luaStringG0.P;
                    int i4 = luaStringG0.Q;
                    byte b2 = bArr[i4];
                    if (b2 == 42 && i >= 2) {
                        b2 = bArr[i4 + 1];
                    }
                    if (b2 == 76) {
                        luaValueW3 = y3(ioLib$File, true);
                    } else if (b2 == 97) {
                        luaValueW3 = v3(ioLib$File);
                    } else if (b2 == 108) {
                        luaValueW3 = y3(ioLib$File, false);
                    } else if (b2 == 110) {
                        luaValueW3 = z3(ioLib$File);
                    }
                }
                return LuaValue.l0(i3, "read", "invalid format: '" + luaValueV + "'");
            }
            luaValueW3 = w3(ioLib$File, luaValueV.y2());
            luaValueArr[i2] = luaValueW3;
            if (luaValueW3.l1()) {
                i2 = i3;
                break;
            }
            i2 = i3;
        }
        return i2 == 0 ? LuaValue.f1673c : LuaValue.P2(luaValueArr, 0, i2);
    }

    private static Varargs F3(IoLib$File ioLib$File, Varargs varargs) {
        int iU = varargs.U();
        for (int i = 1; i <= iU; i++) {
            ioLib$File.d3(varargs.H(i));
        }
        return ioLib$File;
    }

    private Varargs G3(IoLib$File ioLib$File, boolean z, Varargs varargs) {
        int iU = varargs.U();
        if (iU > 250) {
            if (z) {
                try {
                    ioLib$File.S2();
                } catch (IOException unused) {
                }
            }
            LuaValue.R0("too many arguments: " + iU + " max = 250");
        }
        try {
            return new IoLib$IoLibV(ioLib$File, "lnext", 18, this, z, varargs);
        } catch (Exception e2) {
            return LuaValue.S0("lines: " + e2, e2);
        }
    }

    private static IoLib$File I3(LuaValue luaValue) {
        if (luaValue instanceof IoLib$File) {
            return (IoLib$File) luaValue;
        }
        return null;
    }

    private IoLib$File J3(boolean z) {
        IoLib$File ioLib$FileD3 = this.V;
        if (ioLib$FileD3 == null) {
            ioLib$FileD3 = D3(1, "-", "w");
            this.V = ioLib$FileD3;
        }
        if (z && ioLib$FileD3.V2()) {
            LuaValue.R0("standard output file is closed");
        }
        return ioLib$FileD3;
    }

    private IoLib$File K3(int i, String str, String str2) {
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str2.charAt(i2);
            if ((i2 != 0 || "rwa".indexOf(cCharAt) < 0) && ((i2 != 1 || cCharAt != '+') && (i2 < 1 || cCharAt != 'b'))) {
                length = -1;
            }
        }
        if (length <= 0) {
            LuaValue.l0(2, "io.open", "invalid mode: '" + str2 + "'");
        }
        if (i == 1) {
            return Q3();
        }
        if (i != 2) {
            return H3(str, (char) (str2.charAt(0) + (str2.indexOf(43) > 0 ? '+' : (char) 0)));
        }
        return P3();
    }

    private void L3(LuaTable luaTable) {
        for (LuaValue luaValue : luaTable.t3()) {
            ((IoLib$IoLibV) luaTable.U0(luaValue)).U = this;
        }
    }

    private static Varargs M3() {
        return LuaValue.f1674d;
    }

    private IoLib$File N3() throws IOException {
        File fileCreateTempFile = File.createTempFile(".gg.", ".tmp");
        this.T = true;
        try {
            IoLib$FileImpl ioLib$FileImpl = new IoLib$FileImpl(this, fileCreateTempFile, (char) 162, null);
            this.T = false;
            fileCreateTempFile.delete();
            return ioLib$FileImpl;
        } catch (Throwable th) {
            this.T = false;
            throw th;
        }
    }

    private IoLib$File P3() {
        return new IoLib$StdoutFile(this, 2, null);
    }

    private IoLib$File Q3() {
        return new IoLib$StdoutFile(this, 1, null);
    }

    private static IoLib$File q3(String str, LuaValue luaValue) {
        IoLib$File ioLib$FileI3 = I3(luaValue);
        if (ioLib$FileI3 == null) {
            LuaValue.l0(1, str, "FILE* expected, got " + luaValue.E2());
        }
        r3(ioLib$FileI3);
        return ioLib$FileI3;
    }

    private static IoLib$File r3(IoLib$File ioLib$File) {
        if (ioLib$File.V2()) {
            LuaValue.R0("attempt to use a closed file");
        }
        return ioLib$File;
    }

    static Varargs s3(IOException iOException, int i) {
        String message = iOException.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append("io error: ");
        if (message == null) {
            message = iOException.toString();
        }
        sb.append(message);
        return t3(sb.toString(), i);
    }

    private static Varargs t3(String str, int i) {
        return LuaValue.M2(LuaValue.f1673c, LuaValue.K2(str), LuaValue.I2(i));
    }

    private IoLib$File u3() {
        IoLib$File ioLib$File = this.W;
        if (ioLib$File != null) {
            return ioLib$File;
        }
        IoLib$File ioLib$FileD3 = D3(2, "-", "w");
        this.W = ioLib$FileD3;
        return ioLib$FileD3;
    }

    public static LuaValue v3(IoLib$File ioLib$File) {
        int iA3 = ioLib$File.a3();
        if (iA3 >= 0) {
            return iA3 == 0 ? LuaValue.L : w3(ioLib$File, iA3);
        }
        return A3(ioLib$File, false, false);
    }

    public static LuaValue w3(IoLib$File ioLib$File, int i) {
        if (i == 0) {
            return ioLib$File.T2() ? LuaValue.f1673c : LuaValue.L;
        }
        byte[] bArr = new byte[i];
        int iZ2 = ioLib$File.Z2(bArr, 0, i);
        return iZ2 < 0 ? LuaValue.f1673c : LuaString.p3(bArr, 0, iZ2);
    }

    private static int x3(IoLib$File ioLib$File, String str, ByteArrayOutputStream byteArrayOutputStream, int i) {
        int i2 = 0;
        while (true) {
            int iX2 = ioLib$File.X2();
            if (str.indexOf(iX2) < 0) {
                return i2;
            }
            ioLib$File.Y2();
            i2++;
            if (byteArrayOutputStream != null) {
                if (byteArrayOutputStream.size() >= 200) {
                    byteArrayOutputStream.reset();
                    return 0;
                }
                byteArrayOutputStream.write(iX2);
            }
            if (i > 0 && i2 >= i) {
                return i2;
            }
        }
    }

    public static LuaValue y3(IoLib$File ioLib$File, boolean z) {
        return A3(ioLib$File, true, z);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    public static LuaValue z3(IoLib$File ioLib$File) {
        int i;
        boolean z;
        String str;
        int iX3;
        String str2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        x3(ioLib$File, " \t\r\n", null, 0);
        x3(ioLib$File, "-+", byteArrayOutputStream, 1);
        if (x3(ioLib$File, "0", byteArrayOutputStream, 1) > 0) {
            if (x3(ioLib$File, "xX", byteArrayOutputStream, 1) > 0) {
                i = 0;
                z = true;
            } else {
                i = 1;
            }
            if (z) {
                str = "0123456789abcdefABCDEF";
            } else {
                str = "0123456789";
            }
            iX3 = i + x3(ioLib$File, str, byteArrayOutputStream, 0);
            if (x3(ioLib$File, ".", byteArrayOutputStream, 1) > 0) {
                iX3 += x3(ioLib$File, z ? "0123456789abcdefABCDEF" : "0123456789", byteArrayOutputStream, 0);
            }
            if (iX3 > 0) {
                if (z) {
                    str2 = "pP";
                } else {
                    str2 = "eE";
                }
                if (x3(ioLib$File, str2, byteArrayOutputStream, 1) > 0) {
                    x3(ioLib$File, "-+", byteArrayOutputStream, 1);
                    x3(ioLib$File, "0123456789", byteArrayOutputStream, 0);
                }
            }
            String string = byteArrayOutputStream.toString();
            return string.length() > 0 ? LuaValue.P1(string, LuaValue.f1673c) : LuaValue.f1673c;
        }
        i = 0;
        z = false;
        if (z) {
            str = "0123456789abcdefABCDEF";
        } else {
            str = "0123456789";
        }
        iX3 = i + x3(ioLib$File, str, byteArrayOutputStream, 0);
        if (x3(ioLib$File, ".", byteArrayOutputStream, 1) > 0) {
            iX3 += x3(ioLib$File, z ? "0123456789abcdefABCDEF" : "0123456789", byteArrayOutputStream, 0);
        }
        if (iX3 > 0) {
            if (z) {
                str2 = "pP";
            } else {
                str2 = "eE";
            }
            if (x3(ioLib$File, str2, byteArrayOutputStream, 1) > 0) {
                x3(ioLib$File, "-+", byteArrayOutputStream, 1);
                x3(ioLib$File, "0123456789", byteArrayOutputStream, 0);
            }
        }
        String string2 = byteArrayOutputStream.toString();
        if (string2.length() > 0) {
        }
    }

    protected IoLib$File H3(String str, char c2) {
        return new IoLib$FileImpl(this, this.Y.R3(str), c2, null);
    }

    protected boolean O3(File file, FileDescriptor fileDescriptor, boolean z) {
        if (this.T) {
            return true;
        }
        return d.b(fileDescriptor, this.Y.Z, z);
    }

    public Varargs X2(LuaValue luaValue) {
        return C3(q3("file:close", luaValue));
    }

    public Varargs Y2(LuaValue luaValue) {
        q3("file:flush", luaValue).U2();
        return LuaValue.f1674d;
    }

    public Varargs Z2(Varargs varargs) {
        return G3(q3("file:lines", varargs.w()), false, varargs.e0(2));
    }

    public Varargs a3(LuaValue luaValue, Varargs varargs) {
        return E3(q3("file:read", luaValue), varargs);
    }

    public Varargs b3(LuaValue luaValue, String str, int i) {
        if (!"set".equals(str) && !"end".equals(str) && !"cur".equals(str)) {
            LuaValue.l0(1, "file:seek", "invalid value: '" + str + "'; must be one of 'set', 'cur' or 'end'");
        }
        return LuaValue.I2(q3("file:seek", luaValue).b3(str, i));
    }

    public Varargs c3(LuaValue luaValue, String str, int i) {
        if ("no".equals(str)) {
            i = 1;
        } else if (!"full".equals(str) && !"line".equals(str)) {
            LuaValue.l0(1, "file:setvbuf", "invalid value: '" + str + "'; must be one of 'no', 'full' or 'line'");
        }
        if (i <= 0) {
            LuaValue.l0(2, "file:setvbuf", "invalid value '" + i + "'; must be positive");
        }
        q3("file:setvbuf", luaValue).c3(str, i);
        return LuaValue.f1674d;
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        this.Y = luaValue2.z0();
        LuaTable luaTable = new LuaTable();
        V2(luaTable, new IoLib$a(this), d0);
        LuaTable luaTable2 = new LuaTable();
        this.X = luaTable2;
        W2(luaTable2, new IoLib$b(this), e0, 11);
        L3(luaTable);
        L3(this.X);
        this.X.h2("__name", "FILE*");
        LuaValue luaValue3 = this.X;
        luaValue3.i2("__index", luaValue3);
        luaTable.j2(Z, J3(false));
        luaTable.j2(a0, u3());
        luaValue2.i2("io", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("io", luaTable);
        }
        return luaTable;
    }

    public Varargs d3(LuaValue luaValue, Varargs varargs) {
        return F3(q3("file:write", luaValue), varargs);
    }

    public Varargs e3(LuaValue luaValue) {
        IoLib$File ioLib$FileJ3 = luaValue.l1() ? J3(false) : q3("io.close", luaValue);
        r3(ioLib$FileJ3);
        return C3(ioLib$FileJ3);
    }

    public Varargs f3() {
        J3(true);
        this.V.U2();
        return LuaValue.f1674d;
    }

    public Varargs g3(LuaValue luaValue) {
        IoLib$File ioLib$FileD3;
        if (luaValue.l1()) {
            ioLib$FileD3 = B3(false);
        } else {
            ioLib$FileD3 = luaValue.n1() ? D3(3, luaValue.B0(), "r") : q3("io.input", luaValue);
        }
        this.U = ioLib$FileD3;
        return ioLib$FileD3;
    }

    public Varargs h3(Varargs varargs) {
        String strZ = varargs.Z(1, null);
        IoLib$File ioLib$FileB3 = strZ == null ? B3(false) : D3(3, strZ, "r");
        r3(ioLib$FileB3);
        return G3(ioLib$FileB3, strZ != null, varargs.e0(2));
    }

    public Varargs i3(String str, String str2) {
        return K3(3, str, str2);
    }

    public Varargs j3(LuaValue luaValue) {
        IoLib$File ioLib$FileD3;
        if (luaValue.l1()) {
            ioLib$FileD3 = J3(false);
        } else {
            ioLib$FileD3 = luaValue.n1() ? D3(3, luaValue.B0(), "w") : q3("io.output", luaValue);
        }
        this.V = ioLib$FileD3;
        return ioLib$FileD3;
    }

    public Varargs k3(String str, String str2) {
        throw new luaj.d("Failed io.popen('" + str + "', '" + str2 + "'): disabled by security reason");
    }

    public Varargs l3(Varargs varargs) {
        B3(true);
        return E3(this.U, varargs);
    }

    public Varargs m3() {
        return N3();
    }

    public Varargs n3(LuaValue luaValue) {
        IoLib$File ioLib$FileI3 = I3(luaValue);
        if (ioLib$FileI3 != null) {
            return ioLib$FileI3.V2() ? c0 : b0;
        }
        return LuaValue.f1673c;
    }

    public Varargs o3(Varargs varargs) {
        J3(true);
        return F3(this.V, varargs);
    }

    public Varargs p3(LuaValue luaValue, boolean z, Varargs varargs) {
        IoLib$File ioLib$FileI3 = I3(luaValue);
        if (ioLib$FileI3 == null) {
            LuaValue.l0(1, "lines", "not a file: " + luaValue);
        }
        if (ioLib$FileI3.V2()) {
            LuaValue.R0("file is already closed");
        }
        Varargs varargsE3 = E3(ioLib$FileI3, varargs);
        if (z && varargsE3.Q(1) && ioLib$FileI3.T2()) {
            ioLib$FileI3.S2();
        }
        return varargsE3;
    }
}
