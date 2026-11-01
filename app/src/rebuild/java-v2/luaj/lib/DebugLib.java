package luaj.lib;

import luaj.Globals;
import luaj.LuaBoolean;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaNil;
import luaj.LuaNumber;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.g;
import luaj.h;
import luaj.i;

/* JADX INFO: loaded from: classes.dex */
public class DebugLib extends TwoArgFunction {
    public static boolean U;
    public static boolean V;
    private static final LuaString W;
    private static final LuaString X;
    private static final LuaString Y;
    private static final LuaString Z;
    private static final LuaString a0;
    private static final LuaString b0;
    static final LuaString c0;
    static final LuaString d0;
    static final LuaString e0;
    static final LuaString f0;
    static final LuaString g0;
    static final LuaString h0;
    static final LuaString i0;
    static final LuaString j0;
    static final LuaString k0;
    static final LuaString l0;
    static final LuaString m0;
    static final LuaString n0;
    static final LuaString o0;
    static final LuaString p0;
    static final LuaString q0;
    static final LuaString r0;
    Globals T;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        LuaFunction f1749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LuaValue[] f1751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f1752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f1753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f1754f;

        public int a() {
            int[] iArr;
            int i;
            if (this.f1749a.f1() && (iArr = this.f1749a.w0().R.f1726d) != null && (i = this.f1750b) >= 0 && i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }

        Varargs b(int i) {
            LuaValue luaValue;
            if (i < 0) {
                if (!this.f1749a.f1()) {
                    return LuaValue.f1673c;
                }
                int i2 = -i;
                Varargs varargsB3 = this.f1749a.w0().b3();
                return (varargsB3 == null || i2 > varargsB3.U()) ? LuaValue.f1673c : LuaValue.N2(DebugLib.r0, varargsB3.v(i2));
            }
            LuaString luaStringC = c(i);
            LuaValue[] luaValueArr = this.f1751c;
            if (luaValueArr == null || i < 1 || i > luaValueArr.length || (luaValue = luaValueArr[i - 1]) == null) {
                return LuaValue.f1673c;
            }
            if (luaStringC == null) {
                luaStringC = DebugLib.q0;
            }
            return LuaValue.N2(luaStringC, luaValue);
        }

        LuaString c(int i) {
            if (this.f1749a.f1()) {
                return this.f1749a.w0().R.a(i, this.f1750b);
            }
            return null;
        }

        void d(int i, Varargs varargs, int i2) {
            this.f1750b = i;
            if (DebugLib.V) {
                g.I(this.f1749a.w0(), i, this.f1751c, i2, varargs);
            }
        }

        void e() {
            this.f1749a = null;
            this.f1751c = null;
            this.f1750b = 0;
            this.f1753e = false;
            this.f1754f = false;
        }

        void f(LuaClosure luaClosure, Varargs varargs, LuaValue[] luaValueArr, boolean z, boolean z2) {
            this.f1749a = luaClosure;
            this.f1751c = luaValueArr;
            this.f1750b = 0;
            this.f1753e = z;
            this.f1754f = z2;
        }

        void g(LuaFunction luaFunction, boolean z, boolean z2) {
            this.f1749a = luaFunction;
            this.f1751c = null;
            this.f1750b = 0;
            this.f1753e = z;
            this.f1754f = z2;
        }

        Varargs h(int i, LuaValue luaValue) {
            int i2 = 1;
            if (i >= 0) {
                LuaString luaStringC = c(i);
                LuaValue[] luaValueArr = this.f1751c;
                if (luaValueArr != null && i >= 1 && i <= luaValueArr.length) {
                    int i3 = i - 1;
                    if (luaValueArr[i3] != null) {
                        luaValueArr[i3] = luaValue;
                        return luaStringC == null ? DebugLib.q0 : luaStringC;
                    }
                }
                return LuaValue.f1673c;
            }
            if (!this.f1749a.f1()) {
                return LuaValue.f1673c;
            }
            LuaClosure luaClosureW0 = this.f1749a.w0();
            int i4 = -i;
            Varargs varargsB3 = luaClosureW0.b3();
            if (varargsB3 == null || i4 > varargsB3.U()) {
                return LuaValue.f1673c;
            }
            int iU = varargsB3.U();
            LuaValue[] luaValueArr2 = new LuaValue[iU];
            while (i2 <= iU) {
                luaValueArr2[i2 - 1] = i4 == i2 ? luaValue : varargsB3.v(i2);
                i2++;
            }
            luaClosureW0.f3(LuaValue.O2(luaValueArr2));
            return DebugLib.r0;
        }

        public String i() {
            return this.f1749a.f1() ? this.f1749a.w0().R.b() : "[Java]";
        }

        public String toString() {
            return "CallFrame [f=" + this.f1749a + ", pc=" + this.f1750b + ", hookcall=" + this.f1753e + "]";
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final a[] f1755c = new a[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a[] f1756a = f1755c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1757b = 0;

        b() {
        }

        private static LuaValue d(StringBuffer stringBuffer, LuaTable luaTable, LuaValue luaValue, int i) {
            String strG0;
            LuaValue luaValueD;
            if (luaTable == null) {
                return null;
            }
            LuaTable.i iVarS3 = luaTable.s3();
            while (iVarS3.c()) {
                if (iVarS3.a() == 0) {
                    LuaValue luaValueB = iVarS3.b();
                    if (luaValueB instanceof LuaString) {
                        LuaValue luaValueD2 = iVarS3.d();
                        if (luaValueD2 == luaValue) {
                            if (i != 2) {
                                return luaValueB;
                            }
                            stringBuffer.append("function '");
                            strG0 = luaValueB.g0();
                        } else if (i > 1 && luaValueD2.o1() && (luaValueD = d(stringBuffer, luaValueD2.H0(), luaValue, i - 1)) != null) {
                            String strG1 = luaValueB.g0();
                            stringBuffer.append("function '");
                            if (!strG1.equals("_G")) {
                                stringBuffer.append(strG1);
                                stringBuffer.append('.');
                            }
                            strG0 = luaValueD.g0();
                        }
                        stringBuffer.append(strG0);
                        stringBuffer.append('\'');
                        return LuaValue.f1673c;
                    }
                    continue;
                }
            }
            return null;
        }

        private synchronized a j(boolean z) {
            try {
                if (z) {
                    return this.f1756a[this.f1757b - 1];
                }
                int i = this.f1757b;
                a[] aVarArr = this.f1756a;
                if (i >= aVarArr.length) {
                    int iMax = Math.max(4, (aVarArr.length * 3) / 2);
                    a[] aVarArr2 = new a[iMax];
                    a[] aVarArr3 = this.f1756a;
                    System.arraycopy(aVarArr3, 0, aVarArr2, 0, aVarArr3.length);
                    for (int length = this.f1756a.length; length < iMax; length++) {
                        aVarArr2[length] = new a();
                    }
                    this.f1756a = aVarArr2;
                    for (int i2 = 1; i2 < iMax; i2++) {
                        aVarArr2[i2].f1752d = aVarArr2[i2 - 1];
                    }
                }
                a[] aVarArr4 = this.f1756a;
                int i3 = this.f1757b;
                this.f1757b = i3 + 1;
                return aVarArr4[i3];
            } catch (Throwable th) {
                throw th;
            }
        }

        private static void k(StringBuffer stringBuffer, Globals globals, c cVar) {
            char c2;
            if (d(stringBuffer, globals, cVar.m.f1749a, 2) != null) {
                return;
            }
            if (cVar.f1759b.length() > 0) {
                stringBuffer.append(cVar.f1759b);
                stringBuffer.append(" '");
                stringBuffer.append(cVar.f1758a);
                c2 = '\'';
            } else if (cVar.f1760c.charAt(0) == 'm') {
                stringBuffer.append("main chunk");
                return;
            } else if (cVar.f1760c.charAt(0) != 'J') {
                stringBuffer.append("function <");
                stringBuffer.append(cVar.l);
                stringBuffer.append(':');
                stringBuffer.append(cVar.f1763f);
                c2 = '>';
            } else {
                c2 = '?';
            }
            stringBuffer.append(c2);
        }

        synchronized c a(String str, LuaFunction luaFunction, a aVar) {
            c cVar;
            d dVarE3;
            try {
                cVar = new c();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == 'S') {
                        cVar.a(luaFunction);
                    } else if (cCharAt == 'l') {
                        cVar.f1762e = (aVar == null || !aVar.f1749a.f1()) ? -1 : aVar.a();
                    } else if (cCharAt != 'n') {
                        boolean z = true;
                        if (cCharAt == 't') {
                            if (aVar == null || !aVar.f1754f) {
                                z = false;
                            }
                            cVar.k = z;
                        } else if (cCharAt == 'u') {
                            if (luaFunction == null || !luaFunction.f1()) {
                                cVar.h = (short) 0;
                                cVar.j = true;
                                cVar.i = (short) 0;
                            } else {
                                h hVar = luaFunction.w0().R;
                                cVar.h = (short) hVar.f1728f.length;
                                cVar.i = (short) hVar.j;
                                if (hVar.k == 0) {
                                    z = false;
                                }
                                cVar.j = z;
                            }
                        }
                    } else {
                        if (aVar != null && !aVar.f1754f) {
                            if (aVar.f1753e) {
                                cVar.f1759b = "hook";
                                cVar.f1758a = "?";
                            } else {
                                a aVar2 = aVar.f1752d;
                                if (aVar2 != null && aVar2.f1749a.f1() && (dVarE3 = DebugLib.e3(aVar.f1752d)) != null) {
                                    cVar.f1758a = dVarE3.f1765a;
                                    cVar.f1759b = dVarE3.f1766b;
                                }
                            }
                        }
                        if (cVar.f1759b == null) {
                            cVar.f1759b = "";
                            cVar.f1758a = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return cVar;
        }

        synchronized int b() {
            int i;
            i = this.f1757b;
            return i > 0 ? this.f1756a[i - 1].a() : -1;
        }

        synchronized a c(LuaValue luaValue) {
            int i = 1;
            while (true) {
                int i2 = this.f1757b;
                if (i > i2) {
                    return null;
                }
                a[] aVarArr = this.f1756a;
                if (aVarArr[i2 - i].f1749a == luaValue) {
                    return aVarArr[i];
                }
                i++;
            }
        }

        synchronized a e(int i) {
            if (i >= 1) {
                int i2 = this.f1757b;
                if (i <= i2) {
                    return this.f1756a[i2 - i];
                }
            }
            return null;
        }

        final synchronized void f(LuaClosure luaClosure, Varargs varargs, LuaValue[] luaValueArr, boolean z, boolean z2) {
            j(z2).f(luaClosure, varargs, luaValueArr, z, z2);
        }

        final synchronized void g(LuaFunction luaFunction, boolean z, boolean z2) {
            j(z2).g(luaFunction, z, z2);
        }

        final synchronized void h(int i, Varargs varargs, int i2) {
            int i3 = this.f1757b;
            if (i3 > 0) {
                this.f1756a[i3 - 1].d(i, varargs, i2);
            }
        }

        final synchronized void i(LuaThread.a aVar) {
            try {
                int i = this.f1757b;
                if (i > 0) {
                    a[] aVarArr = this.f1756a;
                    int i2 = i - 1;
                    this.f1757b = i2;
                    aVarArr[i2].e();
                }
                l(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized void l(LuaThread.a aVar) {
            int i;
            if (aVar.f1671g && (i = this.f1757b) > 0) {
                a aVar2 = this.f1756a[i - 1];
                aVar.l = aVar2.a();
                aVar.m = aVar2.f1750b;
            }
        }

        synchronized String m(Globals globals, int i) {
            StringBuffer stringBuffer;
            try {
                stringBuffer = new StringBuffer();
                stringBuffer.append("stack traceback:");
                while (true) {
                    int i2 = i + 1;
                    a aVarE = e(i);
                    if (aVarE != null) {
                        c cVarA = a("Slnt", aVarE.f1749a, aVarE);
                        cVarA.m = aVarE;
                        stringBuffer.append("\n\t");
                        stringBuffer.append(cVarA.l);
                        stringBuffer.append(':');
                        int i3 = cVarA.f1762e;
                        if (i3 > 0) {
                            stringBuffer.append(i3);
                        }
                        stringBuffer.append(" in ");
                        k(stringBuffer, globals, cVarA);
                        if (cVarA.k) {
                            stringBuffer.append("\n\t(...tail calls...)");
                        }
                        i = i2;
                    } else {
                        stringBuffer.append("\n\t[Java]: in ?");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return stringBuffer.toString();
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f1758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f1759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f1760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f1761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1763f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1764g;
        short h;
        short i;
        boolean j;
        boolean k;
        String l;
        a m;

        c() {
        }

        public void a(LuaFunction luaFunction) {
            String strB;
            if (luaFunction.f1()) {
                h hVar = luaFunction.w0().R;
                LuaString luaString = hVar.f1729g;
                this.f1761d = luaString != null ? luaString.g0() : "=?";
                int i = hVar.h;
                this.f1763f = i;
                this.f1764g = hVar.i;
                this.f1760c = i == 0 ? "main" : "Lua";
                strB = hVar.b();
            } else {
                this.f1761d = "=[Java]";
                this.f1763f = -1;
                this.f1764g = -1;
                this.f1760c = "Java";
                strB = "[Java]";
            }
            this.l = strB;
        }

        public String toString() {
            return "DebugInfo [\n\tname=" + this.f1758a + "\n\tnamewhat=" + this.f1759b + "\n\twhat=" + this.f1760c + "\n\tsource=" + this.f1761d + "\n\tcurrentline=" + this.f1762e + "\n\tlinedefined=" + this.f1763f + "\n\tlastlinedefined=" + this.f1764g + "\n\tnups=" + ((int) this.h) + "\n\tnparams=" + ((int) this.i) + "\n\tisvararg=" + this.j + "\n\tistailcall=" + this.k + "\n\tshort_src=" + this.l + "\n\tcf=" + this.m + "\n]";
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f1765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f1766b;

        d(String str, String str2) {
            this.f1765a = str;
            this.f1766b = str2;
        }

        public String toString() {
            return this.f1766b + " '" + this.f1765a + "'";
        }
    }

    static final class debug extends ZeroArgFunction {
        debug() {
        }

        @Override // luaj.lib.ZeroArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call() {
            return LuaValue.f1676f;
        }
    }

    final class gethook extends VarArgFunction {
        gethook() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaThread.a aVar = (varargs.U() > 0 ? varargs.J(1) : DebugLib.this.T.f0).P;
            LuaValue luaValue = aVar.f1670f;
            if (luaValue == null) {
                luaValue = LuaValue.f1673c;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.h ? "c" : "");
            sb.append(aVar.i ? "r" : "");
            sb.append(aVar.f1671g ? "l" : "");
            return LuaValue.M2(luaValue, LuaValue.K2(sb.toString()), LuaValue.I2(aVar.j));
        }
    }

    final class getinfo extends VarArgFunction {
        getinfo() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaThread luaThreadJ;
            int i;
            a aVarC;
            LuaString luaString;
            int i2;
            LuaValue luaValueI2;
            if (varargs.T(1)) {
                luaThreadJ = varargs.J(1);
                i = 2;
            } else {
                luaThreadJ = DebugLib.this.T.f0;
                i = 1;
            }
            LuaValue luaValueV = varargs.v(i);
            String strZ = varargs.Z(i + 1, "flnStu");
            b bVarZ2 = DebugLib.this.Z2(luaThreadJ);
            if (luaValueV.m1()) {
                int iY2 = luaValueV.y2();
                if (bVarZ2.e(1).f1749a == this) {
                    iY2++;
                }
                aVarC = bVarZ2.e(iY2);
                if (aVarC == null) {
                    return LuaValue.f1676f;
                }
                luaValueV = aVarC.f1749a;
            } else {
                if (!luaValueV.g1()) {
                    return LuaValue.k0(i, "function or level");
                }
                aVarC = bVarZ2.c(luaValueV);
            }
            c cVarA = bVarZ2.a(strZ, (LuaFunction) luaValueV, aVarC);
            LuaTable luaTable = new LuaTable();
            for (int i3 = 0; i3 < strZ.length(); i3++) {
                char cCharAt = strZ.charAt(i3);
                if (cCharAt != 'L') {
                    if (cCharAt == 'S') {
                        luaTable.j2(DebugLib.j0, LuaValue.K2(cVarA.f1760c));
                        luaTable.j2(DebugLib.k0, LuaValue.K2(cVarA.f1761d));
                        luaTable.j2(DebugLib.l0, LuaValue.K2(cVarA.l));
                        luaTable.j2(DebugLib.m0, LuaValue.I2(cVarA.f1763f));
                        luaString = DebugLib.n0;
                        i2 = cVarA.f1764g;
                    } else if (cCharAt != 'f') {
                        if (cCharAt != 'l') {
                            if (cCharAt == 'n') {
                                LuaString luaString2 = DebugLib.h0;
                                String str = cVarA.f1758a;
                                luaTable.j2(luaString2, str != null ? LuaValue.K2(str) : LuaValue.f1673c);
                                luaString = DebugLib.i0;
                                luaValueI2 = LuaValue.K2(cVarA.f1759b);
                            } else if (cCharAt == 't') {
                                luaString = DebugLib.d0;
                                luaValueI2 = LuaValue.H2(cVarA.k);
                            } else if (cCharAt != 'u') {
                                char cCharAt2 = strZ.charAt(i3);
                                LuaValue.l0(i + 1, "debug.getinfo", "invalid option: '" + cCharAt2 + "' [0x" + Integer.toHexString(cCharAt2) + "] at index " + (i3 + 1) + " in '" + strZ + "'");
                            } else {
                                luaTable.j2(DebugLib.f0, LuaValue.I2(cVarA.h));
                                luaTable.j2(DebugLib.g0, LuaValue.I2(cVarA.i));
                                luaString = DebugLib.e0;
                                luaValueI2 = cVarA.j ? LuaValue.f1674d : LuaValue.f1675e;
                            }
                            luaTable.j2(luaString, luaValueI2);
                        } else {
                            luaString = DebugLib.o0;
                            i2 = cVarA.f1762e;
                        }
                    } else if (luaValueV != null) {
                        luaTable.j2(DebugLib.c0, luaValueV);
                    }
                    luaValueI2 = LuaValue.I2(i2);
                    luaTable.j2(luaString, luaValueI2);
                } else if (luaValueV.f1()) {
                    LuaTable luaTable2 = new LuaTable();
                    luaTable.j2(DebugLib.p0, luaTable2);
                    for (int i4 : luaValueV.w0().R.f1726d) {
                        luaTable2.d2(LuaValue.I2(i4), LuaValue.f1674d);
                    }
                }
            }
            return luaTable;
        }
    }

    final class getlocal extends VarArgFunction {
        getlocal() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaThread luaThreadJ;
            int i;
            if (varargs.T(1)) {
                luaThreadJ = varargs.J(1);
                i = 2;
            } else {
                luaThreadJ = DebugLib.this.T.f0;
                i = 1;
            }
            LuaValue luaValueV = varargs.v(i);
            int iD = varargs.D(i + 1);
            if (luaValueV.g1()) {
                return !luaValueV.f1() ? LuaValue.f1673c : luaValueV.w0().R.a(iD, 0);
            }
            int iD2 = varargs.D(i);
            b bVarZ2 = DebugLib.this.Z2(luaThreadJ);
            int i2 = bVarZ2.f1757b;
            if (bVarZ2.e(1).f1749a == this) {
                iD2++;
                i2--;
            }
            a aVarE = bVarZ2.e(iD2);
            if (aVarE != null) {
                return aVarE.b(iD);
            }
            return LuaValue.l0(i, "debug.getlocal", "level out of range: " + iD2 + " not between 1 and " + i2);
        }
    }

    static final class getmetatable extends LibFunction {
        getmetatable() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            LuaValue luaValueV0 = luaValue.V0();
            return luaValueV0 != null ? luaValueV0 : LuaValue.f1673c;
        }
    }

    final class getregistry extends ZeroArgFunction {
        getregistry() {
        }

        @Override // luaj.lib.ZeroArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call() {
            return DebugLib.this.T;
        }
    }

    static final class getupvalue extends VarArgFunction {
        getupvalue() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaClosure luaClosure;
            LuaString luaStringC3;
            LuaFunction luaFunctionC = varargs.C(1);
            int iD = varargs.D(2);
            return (!(luaFunctionC instanceof LuaClosure) || (luaStringC3 = DebugLib.c3((luaClosure = (LuaClosure) luaFunctionC), iD)) == null) ? LuaValue.f1673c : LuaValue.N2(luaStringC3, luaClosure.S[iD - 1].b());
        }
    }

    final class sethook extends VarArgFunction {
        sethook() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaThread luaThreadJ;
            int i;
            if (varargs.T(1)) {
                luaThreadJ = varargs.J(1);
                i = 2;
            } else {
                luaThreadJ = DebugLib.this.T.f0;
                i = 1;
            }
            LuaFunction luaFunctionX = varargs.X(i, null);
            String strZ = varargs.Z(i + 1, "");
            int iY = varargs.Y(i + 2, 0);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i2 = 0; i2 < strZ.length(); i2++) {
                char cCharAt = strZ.charAt(i2);
                if (cCharAt == 'c') {
                    z = true;
                } else if (cCharAt == 'l') {
                    z2 = true;
                } else if (cCharAt == 'r') {
                    z3 = true;
                }
            }
            LuaThread.a aVar = luaThreadJ.P;
            aVar.f1670f = luaFunctionX;
            aVar.h = z;
            aVar.f1671g = z2;
            aVar.j = iY;
            aVar.i = z3;
            DebugLib.this.Y2().l(aVar);
            return LuaValue.f1676f;
        }
    }

    final class setlocal extends VarArgFunction {
        setlocal() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaThread luaThreadJ;
            int i;
            if (varargs.T(1)) {
                luaThreadJ = varargs.J(1);
                i = 2;
            } else {
                luaThreadJ = DebugLib.this.T.f0;
                i = 1;
            }
            int iD = varargs.D(i);
            int iD2 = varargs.D(i + 1);
            LuaValue luaValueV = varargs.v(i + 2);
            b bVarZ2 = DebugLib.this.Z2(luaThreadJ);
            int i2 = bVarZ2.f1757b;
            if (bVarZ2.e(1).f1749a == this) {
                iD++;
                i2--;
            }
            a aVarE = bVarZ2.e(iD);
            if (aVarE != null) {
                return aVarE.h(iD2, luaValueV);
            }
            return LuaValue.l0(i, "debug.setlocal", "level out of range: " + iD + " not between 1 and " + i2);
        }
    }

    static final class setmetatable extends TwoArgFunction {
        setmetatable() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            LuaTable luaTableL1 = luaValue2.L1(null);
            int iC2 = luaValue.C2();
            if (iC2 == 0) {
                LuaNil.P = luaTableL1;
            } else if (iC2 == 1) {
                LuaBoolean.Q = luaTableL1;
            } else if (iC2 == 3) {
                LuaNumber.P = luaTableL1;
            } else if (iC2 == 4) {
                LuaString.U = luaTableL1;
            } else if (iC2 == 6) {
                LuaFunction.P = luaTableL1;
            } else if (iC2 != 8) {
                luaValue.k2(luaTableL1);
            } else {
                LuaThread.T = luaTableL1;
            }
            return luaValue;
        }
    }

    static final class setupvalue extends VarArgFunction {
        setupvalue() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaClosure luaClosure;
            LuaString luaStringC3;
            LuaFunction luaFunctionC = varargs.C(1);
            int iD = varargs.D(2);
            LuaValue luaValueV = varargs.v(3);
            if (!(luaFunctionC instanceof LuaClosure) || (luaStringC3 = DebugLib.c3((luaClosure = (LuaClosure) luaFunctionC), iD)) == null) {
                return LuaValue.f1673c;
            }
            luaClosure.S[iD - 1].c(luaValueV);
            return luaStringC3;
        }
    }

    final class traceback extends VarArgFunction {
        traceback() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaThread luaThreadJ;
            int i;
            if (varargs.T(1)) {
                luaThreadJ = varargs.J(1);
                i = 2;
            } else {
                luaThreadJ = DebugLib.this.T.f0;
                i = 1;
            }
            int i2 = i + 1;
            LuaValue luaValueV = varargs.v(i);
            if (!luaValueV.n1() && !luaValueV.l1()) {
                return luaValueV;
            }
            int iY = varargs.Y(i2, 1);
            b bVarZ2 = DebugLib.this.Z2(luaThreadJ);
            if (bVarZ2.e(1).f1749a == this) {
                iY++;
            }
            String strM = bVarZ2.m(DebugLib.this.T, iY);
            if (luaValueV.n1()) {
                strM = luaValueV.g0() + '\n' + strM;
            }
            return LuaValue.K2(strM);
        }
    }

    static final class upvalueid extends VarArgFunction {
        upvalueid() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            i[] iVarArr;
            LuaFunction luaFunctionC = varargs.C(1);
            int iD = varargs.D(2);
            if ((luaFunctionC instanceof LuaClosure) && (iVarArr = ((LuaClosure) luaFunctionC).S) != null && iD > 0 && iD <= iVarArr.length) {
                return LuaValue.I2(iVarArr[iD - 1].hashCode());
            }
            return LuaValue.l0(2, "debug.upvalueid", "invalid upvalue index " + iD);
        }
    }

    static final class upvaluejoin extends VarArgFunction {
        upvaluejoin() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaClosure luaClosureA = varargs.A(1);
            int iD = varargs.D(2);
            LuaClosure luaClosureA2 = varargs.A(3);
            int iD2 = varargs.D(4);
            if (iD < 1 || iD > luaClosureA.S.length) {
                m0("index out of range");
            }
            if (iD2 < 1 || iD2 > luaClosureA2.S.length) {
                m0("index out of range");
            }
            luaClosureA.S[iD - 1] = luaClosureA2.S[iD2 - 1];
            return LuaValue.f1676f;
        }
    }

    static {
        boolean z = true;
        try {
            U = System.getProperty("CALLS") != null;
        } catch (Exception unused) {
        }
        try {
            if (System.getProperty("TRACE") == null) {
                z = false;
            }
            V = z;
        } catch (Exception unused2) {
        }
        W = LuaValue.K2("?");
        X = LuaValue.K2("call");
        Y = LuaValue.K2("tail call");
        Z = LuaValue.K2("line");
        a0 = LuaValue.K2("count");
        b0 = LuaValue.K2("return");
        c0 = LuaValue.K2("func");
        d0 = LuaValue.K2("istailcall");
        e0 = LuaValue.K2("isvararg");
        f0 = LuaValue.K2("nups");
        g0 = LuaValue.K2("nparams");
        h0 = LuaValue.K2("name");
        i0 = LuaValue.K2("namewhat");
        j0 = LuaValue.K2("what");
        k0 = LuaValue.K2("source");
        l0 = LuaValue.K2("short_src");
        m0 = LuaValue.K2("linedefined");
        n0 = LuaValue.K2("lastlinedefined");
        o0 = LuaValue.K2("currentline");
        p0 = LuaValue.K2("activelines");
        q0 = LuaValue.K2("(*temporary)");
        r0 = LuaValue.K2("(*vararg)");
    }

    private static LuaString a3(ggf.d dVar, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("(.upval ");
        if (dVar != null) {
            sb.append(dVar.f1566b ? 'v' : 'u');
            sb.append((int) dVar.f1567c);
        } else {
            sb.append("???");
        }
        sb.append(" \"(*no name)\"; u");
        sb.append(i);
        sb.append(')');
        return LuaString.K2(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0063  */
    static int b3(h hVar, int i, int i2) {
        int i3 = -1;
        int i4 = 0;
        while (i4 < i) {
            int i5 = hVar.f1724b[i4];
            int i6 = luaj.b.i(i5);
            if (i6 < 47) {
                int iC = luaj.b.c(i5);
                if (i6 == 4) {
                    int iE = luaj.b.e(i5);
                    if (iC <= i2 && i2 <= iC + iE) {
                        i3 = i4;
                    }
                } else if (i6 == 23) {
                    int iH = luaj.b.h(i5);
                    int i7 = i4 + 1 + iH;
                    if (i4 < i7 && i7 <= i) {
                        i4 += iH;
                    }
                } else if (i6 != 27) {
                    if (i6 != 34) {
                        if (i6 != 36) {
                            if (i6 == 29 || i6 == 30) {
                                if (i2 >= iC) {
                                    i3 = i4;
                                }
                            } else if (luaj.b.q(i6) && i2 == iC) {
                                i3 = i4;
                            }
                        } else if (((i5 >> 14) & 511) == 0) {
                            i4++;
                        }
                    } else if (i2 >= iC + 2) {
                        i3 = i4;
                    }
                } else if (i2 == iC) {
                    i3 = i4;
                }
            }
            i4++;
        }
        return i3;
    }

    static LuaString c3(LuaClosure luaClosure, int i) {
        i[] iVarArr = luaClosure.S;
        if (iVarArr == null || i <= 0 || i > iVarArr.length) {
            return null;
        }
        ggf.d[] dVarArr = luaClosure.R.f1728f;
        if (dVarArr == null || i > dVarArr.length) {
            return a3(null, i);
        }
        ggf.d dVar = dVarArr[i - 1];
        LuaString luaString = dVar.f1565a;
        return luaString == null ? a3(dVar, i) : luaString;
    }

    static d e3(a aVar) {
        LuaString luaString;
        if (!aVar.f1749a.f1()) {
            return new d(aVar.f1749a.S2(), "Java");
        }
        h hVar = aVar.f1749a.w0().R;
        int i = aVar.f1750b;
        int[] iArr = hVar.f1724b;
        if (i >= iArr.length) {
            return null;
        }
        int i2 = iArr[i];
        switch (luaj.b.i(i2)) {
            case 6:
            case 7:
            case 12:
                luaString = LuaValue.l;
                break;
            case 8:
            case 10:
                luaString = LuaValue.m;
                break;
            case 9:
            case 11:
            case 20:
            case 23:
            case 27:
            case 28:
            case 31:
            case 32:
            case 33:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            default:
                return null;
            case 13:
                luaString = LuaValue.q;
                break;
            case 14:
                luaString = LuaValue.r;
                break;
            case 15:
                luaString = LuaValue.t;
                break;
            case 16:
                luaString = LuaValue.s;
                break;
            case 17:
                luaString = LuaValue.v;
                break;
            case 18:
                luaString = LuaValue.u;
                break;
            case 19:
                luaString = LuaValue.w;
                break;
            case 21:
                luaString = LuaValue.x;
                break;
            case 22:
                luaString = LuaValue.C;
                break;
            case 24:
                luaString = LuaValue.y;
                break;
            case 25:
                luaString = LuaValue.z;
                break;
            case 26:
                luaString = LuaValue.A;
                break;
            case 29:
            case 30:
                return g3(hVar, i, luaj.b.c(i2));
            case 34:
                return new d("for iterator", "for iterator");
            case 40:
                luaString = LuaValue.D;
                break;
            case 41:
                luaString = LuaValue.E;
                break;
            case 42:
                luaString = LuaValue.F;
                break;
            case 43:
                luaString = LuaValue.G;
                break;
            case 44:
                luaString = LuaValue.H;
                break;
            case 45:
                luaString = LuaValue.I;
                break;
            case 46:
                luaString = LuaValue.J;
                break;
        }
        return new d(luaString.g0(), "metamethod");
    }

    public static String f3(int i, int i2, h hVar) {
        d dVarG3 = g3(hVar, i, i2);
        if (dVarG3 == null) {
            return null;
        }
        return dVarG3.toString();
    }

    static d g3(h hVar, int i, int i2) {
        LuaString luaStringA;
        LuaString luaStringA2 = hVar.a(i2 + 1, i);
        if (luaStringA2 != null) {
            return new d(luaStringA2.g0(), "local");
        }
        int iB3 = b3(hVar, i, i2);
        if (iB3 != -1) {
            int i3 = hVar.f1724b[iB3];
            int i4 = luaj.b.i(i3);
            if (i4 == 0) {
                int iC = luaj.b.c(i3);
                int iE = luaj.b.e(i3);
                if (iE < iC) {
                    return g3(hVar, iB3, iE);
                }
            } else if (i4 == 1 || i4 == 2) {
                int iF = luaj.b.i(i3) == 1 ? luaj.b.f(i3) : luaj.b.d(hVar.f1724b[iB3 + 1]);
                if (hVar.f1723a[iF].n1()) {
                    return new d(hVar.f1723a[iF].q2().g0(), "constant");
                }
            } else {
                if (i4 == 5) {
                    int iE2 = luaj.b.e(i3);
                    ggf.d[] dVarArr = hVar.f1728f;
                    LuaString luaString = iE2 < dVarArr.length ? dVarArr[iE2].f1565a : W;
                    if (luaString == null) {
                        return null;
                    }
                    return new d(luaString.g0(), "upvalue");
                }
                if (i4 == 6 || i4 == 7) {
                    int iG = luaj.b.g(i3);
                    int iE3 = luaj.b.e(i3);
                    if (luaj.b.i(i3) == 7) {
                        luaStringA = hVar.a(iE3 + 1, iB3);
                    } else {
                        ggf.d[] dVarArr2 = hVar.f1728f;
                        luaStringA = iE3 < dVarArr2.length ? dVarArr2[iE3].f1565a : W;
                    }
                    return new d(h3(hVar, iB3, iG), (luaStringA == null || !luaStringA.P0(LuaValue.k)) ? "field" : "global");
                }
                if (i4 == 12) {
                    return new d(h3(hVar, iB3, luaj.b.g(i3)), "method");
                }
            }
        }
        return null;
    }

    static String h3(h hVar, int i, int i2) {
        if (luaj.b.k(i2)) {
            LuaValue luaValue = hVar.f1723a[luaj.b.j(i2)];
            return luaValue.n1() ? luaValue.g0() : "?";
        }
        d dVarG3 = g3(hVar, i, i2);
        return (dVarG3 == null || !"constant".equals(dVarG3.f1766b)) ? "?" : dVarG3.f1765a;
    }

    void X2(LuaThread.a aVar, LuaValue luaValue, LuaValue luaValue2) {
        LuaFunction luaFunction = aVar.f1670f;
        if (aVar.k != 0 || luaFunction == null) {
            return;
        }
        aVar.k = 1;
        try {
            try {
                try {
                    boolean zF1 = true ^ luaFunction.f1();
                    if (zF1) {
                        j3(luaFunction, false);
                    }
                    try {
                        luaFunction.call(luaValue, luaValue2);
                        if (zF1) {
                            l3();
                        }
                        aVar.k = 0;
                    } catch (Throwable th) {
                        if (zF1) {
                            l3();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    aVar.k = 0;
                    throw th2;
                }
            } catch (luaj.d e2) {
                throw e2;
            }
        } catch (RuntimeException e3) {
            throw new luaj.ggd.a(e3);
        }
    }

    b Y2() {
        return Z2(this.T.f0);
    }

    b Z2(LuaThread luaThread) {
        if (luaThread.Q == null) {
            luaThread.Q = new b();
        }
        return (b) luaThread.Q;
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        Globals globalsZ0 = luaValue2.z0();
        this.T = globalsZ0;
        globalsZ0.i0 = this;
        LuaTable luaTable = new LuaTable();
        luaTable.i2("debug", new debug());
        luaTable.i2("gethook", new gethook());
        luaTable.i2("getinfo", new getinfo());
        luaTable.i2("getlocal", new getlocal());
        luaTable.i2("getmetatable", new getmetatable());
        luaTable.i2("getregistry", new getregistry());
        luaTable.i2("getupvalue", new getupvalue());
        luaTable.i2("sethook", new sethook());
        luaTable.i2("setlocal", new setlocal());
        luaTable.i2("setmetatable", new setmetatable());
        luaTable.i2("setupvalue", new setupvalue());
        luaTable.i2("traceback", new traceback());
        luaTable.i2("upvalueid", new upvalueid());
        luaTable.i2("upvaluejoin", new upvaluejoin());
        luaValue2.i2("debug", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("debug", luaTable);
        }
        return luaTable;
    }

    public a d3(int i) {
        return Y2().e(i);
    }

    public void i3(LuaClosure luaClosure, Varargs varargs, LuaValue[] luaValueArr, boolean z) {
        LuaThread.a aVar = this.T.f0.P;
        boolean z2 = aVar.k == 1;
        if (z2) {
            aVar.k = 2;
        }
        Y2().f(luaClosure, varargs, luaValueArr, z2, z);
        if (aVar.k != 0) {
            return;
        }
        if (aVar.f1671g) {
            aVar.l = 0;
            aVar.m = 0;
        }
        if (aVar.h) {
            X2(aVar, z ? Y : X, LuaValue.f1673c);
        }
    }

    public void j3(LuaFunction luaFunction, boolean z) {
        LuaThread.a aVar = this.T.f0.P;
        boolean z2 = aVar.k == 1;
        if (z2) {
            aVar.k = 2;
        }
        Y2().g(luaFunction, z2, z);
        if (aVar.k != 0) {
            return;
        }
        if (aVar.f1671g) {
            aVar.l = 0;
            aVar.m = 0;
        }
        if (aVar.h) {
            X2(aVar, z ? Y : X, LuaValue.f1673c);
        }
    }

    public void k3(int i, Varargs varargs, int i2) {
        LuaThread luaThread = this.T.f0;
        LuaThread.a aVar = luaThread.P;
        Z2(luaThread).h(i, varargs, i2);
        if (aVar.k == 0 && aVar.f1670f != null) {
            int i3 = aVar.j;
            if (i3 > 0) {
                int i4 = aVar.n + 1;
                aVar.n = i4;
                if (i4 % i3 == 0) {
                    X2(aVar, a0, LuaValue.f1673c);
                }
            }
            if (aVar.f1671g) {
                int iB = Y2().b();
                if (iB != aVar.l || i <= aVar.m) {
                    aVar.l = iB;
                    X2(aVar, Z, LuaValue.I2(iB));
                }
                aVar.m = i;
            }
        }
    }

    public void l3() {
        LuaThread.a aVar = this.T.f0.P;
        if (aVar.k == 0 && aVar.i) {
            X2(aVar, b0, LuaValue.f1673c);
        }
        Y2().i(aVar);
    }

    public String m3(Globals globals, int i) {
        return Y2().m(globals, i);
    }
}
