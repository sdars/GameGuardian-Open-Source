package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
public class DebugLib extends luaj.lib.TwoArgFunction {
    public static boolean U;
    public static boolean V;
    private static final luaj.LuaString W;
    private static final luaj.LuaString X;
    private static final luaj.LuaString Y;
    private static final luaj.LuaString Z;
    private static final luaj.LuaString a0;
    private static final luaj.LuaString b0;
    static final luaj.LuaString c0;
    static final luaj.LuaString d0;
    static final luaj.LuaString e0;
    static final luaj.LuaString f0;
    static final luaj.LuaString g0;
    static final luaj.LuaString h0;
    static final luaj.LuaString i0;
    static final luaj.LuaString j0;
    static final luaj.LuaString k0;
    static final luaj.LuaString l0;
    static final luaj.LuaString m0;
    static final luaj.LuaString n0;
    static final luaj.LuaString o0;
    static final luaj.LuaString p0;
    static final luaj.LuaString q0;
    static final luaj.LuaString r0;
    luaj.Globals T;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        luaj.LuaFunction f1749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private luaj.LuaValue[] f1751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        luaj.lib.DebugLib.a f1752d;

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

        luaj.Varargs b(int i) {
            luaj.LuaValue luaValue;
            if (i < 0) {
                if (!this.f1749a.f1()) {
                    return luaj.LuaValue.f1673c;
                }
                int i2 = -i;
                luaj.Varargs varargsB3 = this.f1749a.w0().b3();
                return (varargsB3 == null || i2 > varargsB3.U()) ? luaj.LuaValue.f1673c : luaj.LuaValue.N2(luaj.lib.DebugLib.r0, varargsB3.v(i2));
            }
            luaj.LuaString luaStringC = c(i);
            luaj.LuaValue[] luaValueArr = this.f1751c;
            if (luaValueArr == null || i < 1 || i > luaValueArr.length || (luaValue = luaValueArr[i - 1]) == null) {
                return luaj.LuaValue.f1673c;
            }
            if (luaStringC == null) {
                luaStringC = luaj.lib.DebugLib.q0;
            }
            return luaj.LuaValue.N2(luaStringC, luaValue);
        }

        luaj.LuaString c(int i) {
            if (this.f1749a.f1()) {
                return this.f1749a.w0().R.a(i, this.f1750b);
            }
            return null;
        }

        void d(int i, luaj.Varargs varargs, int i2) {
            this.f1750b = i;
            if (luaj.lib.DebugLib.V) {
                luaj.g.I(this.f1749a.w0(), i, this.f1751c, i2, varargs);
            }
        }

        void e() {
            this.f1749a = null;
            this.f1751c = null;
            this.f1750b = 0;
            this.f1753e = false;
            this.f1754f = false;
        }

        void f(luaj.LuaClosure luaClosure, luaj.Varargs varargs, luaj.LuaValue[] luaValueArr, boolean z, boolean z2) {
            this.f1749a = luaClosure;
            this.f1751c = luaValueArr;
            this.f1750b = 0;
            this.f1753e = z;
            this.f1754f = z2;
        }

        void g(luaj.LuaFunction luaFunction, boolean z, boolean z2) {
            this.f1749a = luaFunction;
            this.f1751c = null;
            this.f1750b = 0;
            this.f1753e = z;
            this.f1754f = z2;
        }

        luaj.Varargs h(int i, luaj.LuaValue luaValue) {
            int i2 = 1;
            if (i >= 0) {
                luaj.LuaString luaStringC = c(i);
                luaj.LuaValue[] luaValueArr = this.f1751c;
                if (luaValueArr != null && i >= 1 && i <= luaValueArr.length) {
                    int i3 = i - 1;
                    if (luaValueArr[i3] != null) {
                        luaValueArr[i3] = luaValue;
                        return luaStringC == null ? luaj.lib.DebugLib.q0 : luaStringC;
                    }
                }
                return luaj.LuaValue.f1673c;
            }
            if (!this.f1749a.f1()) {
                return luaj.LuaValue.f1673c;
            }
            luaj.LuaClosure luaClosureW0 = this.f1749a.w0();
            int i4 = -i;
            luaj.Varargs varargsB3 = luaClosureW0.b3();
            if (varargsB3 == null || i4 > varargsB3.U()) {
                return luaj.LuaValue.f1673c;
            }
            int iU = varargsB3.U();
            luaj.LuaValue[] luaValueArr2 = new luaj.LuaValue[iU];
            while (i2 <= iU) {
                luaValueArr2[i2 - 1] = i4 == i2 ? luaValue : varargsB3.v(i2);
                i2++;
            }
            luaClosureW0.f3(luaj.LuaValue.O2(luaValueArr2));
            return luaj.lib.DebugLib.r0;
        }

        public java.lang.String i() {
            return this.f1749a.f1() ? this.f1749a.w0().R.b() : "[Java]";
        }

        public java.lang.String toString() {
            return "CallFrame [f=" + this.f1749a + ", pc=" + this.f1750b + ", hookcall=" + this.f1753e + "]";
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final luaj.lib.DebugLib.a[] f1755c = new luaj.lib.DebugLib.a[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        luaj.lib.DebugLib.a[] f1756a = f1755c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1757b = 0;

        b() {
        }

        private static luaj.LuaValue d(java.lang.StringBuffer stringBuffer, luaj.LuaTable luaTable, luaj.LuaValue luaValue, int i) {
            java.lang.String strG0;
            luaj.LuaValue luaValueD;
            if (luaTable == null) {
                return null;
            }
            luaj.LuaTable.i iVarS3 = luaTable.s3();
            while (iVarS3.c()) {
                if (iVarS3.a() == 0) {
                    luaj.LuaValue luaValueB = iVarS3.b();
                    if (luaValueB instanceof luaj.LuaString) {
                        luaj.LuaValue luaValueD2 = iVarS3.d();
                        if (luaValueD2 == luaValue) {
                            if (i != 2) {
                                return luaValueB;
                            }
                            stringBuffer.append("function '");
                            strG0 = luaValueB.g0();
                        } else if (i > 1 && luaValueD2.o1() && (luaValueD = d(stringBuffer, luaValueD2.H0(), luaValue, i - 1)) != null) {
                            java.lang.String strG1 = luaValueB.g0();
                            stringBuffer.append("function '");
                            if (!strG1.equals("_G")) {
                                stringBuffer.append(strG1);
                                stringBuffer.append('.');
                            }
                            strG0 = luaValueD.g0();
                        }
                        stringBuffer.append(strG0);
                        stringBuffer.append('\'');
                        return luaj.LuaValue.f1673c;
                    }
                    continue;
                }
            }
            return null;
        }

        private synchronized luaj.lib.DebugLib.a j(boolean z) {
            try {
                if (z) {
                    return this.f1756a[this.f1757b - 1];
                }
                int i = this.f1757b;
                luaj.lib.DebugLib.a[] aVarArr = this.f1756a;
                if (i >= aVarArr.length) {
                    int iMax = java.lang.Math.max(4, (aVarArr.length * 3) / 2);
                    luaj.lib.DebugLib.a[] aVarArr2 = new luaj.lib.DebugLib.a[iMax];
                    luaj.lib.DebugLib.a[] aVarArr3 = this.f1756a;
                    java.lang.System.arraycopy(aVarArr3, 0, aVarArr2, 0, aVarArr3.length);
                    for (int length = this.f1756a.length; length < iMax; length++) {
                        aVarArr2[length] = new luaj.lib.DebugLib.a();
                    }
                    this.f1756a = aVarArr2;
                    for (int i2 = 1; i2 < iMax; i2++) {
                        aVarArr2[i2].f1752d = aVarArr2[i2 - 1];
                    }
                }
                luaj.lib.DebugLib.a[] aVarArr4 = this.f1756a;
                int i3 = this.f1757b;
                this.f1757b = i3 + 1;
                return aVarArr4[i3];
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }

        private static void k(java.lang.StringBuffer stringBuffer, luaj.Globals globals, luaj.lib.DebugLib.c cVar) {
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

        synchronized luaj.lib.DebugLib.c a(java.lang.String str, luaj.LuaFunction luaFunction, luaj.lib.DebugLib.a aVar) {
            luaj.lib.DebugLib.c cVar;
            luaj.lib.DebugLib.d dVarE3;
            try {
                cVar = new luaj.lib.DebugLib.c();
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
                                luaj.h hVar = luaFunction.w0().R;
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
                                luaj.lib.DebugLib.a aVar2 = aVar.f1752d;
                                if (aVar2 != null && aVar2.f1749a.f1() && (dVarE3 = luaj.lib.DebugLib.e3(aVar.f1752d)) != null) {
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
            } catch (java.lang.Throwable th) {
                throw th;
            }
            return cVar;
        }

        synchronized int b() {
            int i;
            i = this.f1757b;
            return i > 0 ? this.f1756a[i - 1].a() : -1;
        }

        synchronized luaj.lib.DebugLib.a c(luaj.LuaValue luaValue) {
            int i = 1;
            while (true) {
                int i2 = this.f1757b;
                if (i > i2) {
                    return null;
                }
                luaj.lib.DebugLib.a[] aVarArr = this.f1756a;
                if (aVarArr[i2 - i].f1749a == luaValue) {
                    return aVarArr[i];
                }
                i++;
            }
        }

        synchronized luaj.lib.DebugLib.a e(int i) {
            if (i >= 1) {
                int i2 = this.f1757b;
                if (i <= i2) {
                    return this.f1756a[i2 - i];
                }
            }
            return null;
        }

        final synchronized void f(luaj.LuaClosure luaClosure, luaj.Varargs varargs, luaj.LuaValue[] luaValueArr, boolean z, boolean z2) {
            j(z2).f(luaClosure, varargs, luaValueArr, z, z2);
        }

        final synchronized void g(luaj.LuaFunction luaFunction, boolean z, boolean z2) {
            j(z2).g(luaFunction, z, z2);
        }

        final synchronized void h(int i, luaj.Varargs varargs, int i2) {
            int i3 = this.f1757b;
            if (i3 > 0) {
                this.f1756a[i3 - 1].d(i, varargs, i2);
            }
        }

        final synchronized void i(luaj.LuaThread.a aVar) {
            try {
                int i = this.f1757b;
                if (i > 0) {
                    luaj.lib.DebugLib.a[] aVarArr = this.f1756a;
                    int i2 = i - 1;
                    this.f1757b = i2;
                    aVarArr[i2].e();
                }
                l(aVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }

        synchronized void l(luaj.LuaThread.a aVar) {
            int i;
            if (aVar.f1671g && (i = this.f1757b) > 0) {
                luaj.lib.DebugLib.a aVar2 = this.f1756a[i - 1];
                aVar.l = aVar2.a();
                aVar.m = aVar2.f1750b;
            }
        }

        synchronized java.lang.String m(luaj.Globals globals, int i) {
            java.lang.StringBuffer stringBuffer;
            try {
                stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append("stack traceback:");
                while (true) {
                    int i2 = i + 1;
                    luaj.lib.DebugLib.a aVarE = e(i);
                    if (aVarE != null) {
                        luaj.lib.DebugLib.c cVarA = a("Slnt", aVarE.f1749a, aVarE);
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
            } catch (java.lang.Throwable th) {
                throw th;
            }
            return stringBuffer.toString();
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f1758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.String f1759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.String f1760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.lang.String f1761d;

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
        java.lang.String l;
        luaj.lib.DebugLib.a m;

        c() {
        }

        public void a(luaj.LuaFunction luaFunction) {
            java.lang.String strB;
            if (luaFunction.f1()) {
                luaj.h hVar = luaFunction.w0().R;
                luaj.LuaString luaString = hVar.f1729g;
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

        public java.lang.String toString() {
            return "DebugInfo [\n\tname=" + this.f1758a + "\n\tnamewhat=" + this.f1759b + "\n\twhat=" + this.f1760c + "\n\tsource=" + this.f1761d + "\n\tcurrentline=" + this.f1762e + "\n\tlinedefined=" + this.f1763f + "\n\tlastlinedefined=" + this.f1764g + "\n\tnups=" + ((int) this.h) + "\n\tnparams=" + ((int) this.i) + "\n\tisvararg=" + this.j + "\n\tistailcall=" + this.k + "\n\tshort_src=" + this.l + "\n\tcf=" + this.m + "\n]";
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f1765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.lang.String f1766b;

        d(java.lang.String str, java.lang.String str2) {
            this.f1765a = str;
            this.f1766b = str2;
        }

        public java.lang.String toString() {
            return this.f1766b + " '" + this.f1765a + "'";
        }
    }

    static final class debug extends luaj.lib.ZeroArgFunction {
        debug() {
        }

        @Override // luaj.lib.ZeroArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call() {
            return luaj.LuaValue.f1676f;
        }
    }

    final class gethook extends luaj.lib.VarArgFunction {
        gethook() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaThread.a aVar = (varargs.U() > 0 ? varargs.J(1) : luaj.lib.DebugLib.this.T.f0).P;
            luaj.LuaValue luaValue = aVar.f1670f;
            if (luaValue == null) {
                luaValue = luaj.LuaValue.f1673c;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(aVar.h ? "c" : "");
            sb.append(aVar.i ? "r" : "");
            sb.append(aVar.f1671g ? "l" : "");
            return luaj.LuaValue.M2(luaValue, luaj.LuaValue.K2(sb.toString()), luaj.LuaValue.I2(aVar.j));
        }
    }

    final class getinfo extends luaj.lib.VarArgFunction {
        getinfo() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaThread luaThreadJ;
            int i;
            luaj.lib.DebugLib.a aVarC;
            luaj.LuaString luaString;
            int i2;
            luaj.LuaValue luaValueI2;
            if (varargs.T(1)) {
                luaThreadJ = varargs.J(1);
                i = 2;
            } else {
                luaThreadJ = luaj.lib.DebugLib.this.T.f0;
                i = 1;
            }
            luaj.LuaValue luaValueV = varargs.v(i);
            java.lang.String strZ = varargs.Z(i + 1, "flnStu");
            luaj.lib.DebugLib.b bVarZ2 = luaj.lib.DebugLib.this.Z2(luaThreadJ);
            if (luaValueV.m1()) {
                int iY2 = luaValueV.y2();
                if (bVarZ2.e(1).f1749a == this) {
                    iY2++;
                }
                aVarC = bVarZ2.e(iY2);
                if (aVarC == null) {
                    return luaj.LuaValue.f1676f;
                }
                luaValueV = aVarC.f1749a;
            } else {
                if (!luaValueV.g1()) {
                    return luaj.LuaValue.k0(i, "function or level");
                }
                aVarC = bVarZ2.c(luaValueV);
            }
            luaj.lib.DebugLib.c cVarA = bVarZ2.a(strZ, (luaj.LuaFunction) luaValueV, aVarC);
            luaj.LuaTable luaTable = new luaj.LuaTable();
            for (int i3 = 0; i3 < strZ.length(); i3++) {
                char cCharAt = strZ.charAt(i3);
                if (cCharAt != 'L') {
                    if (cCharAt == 'S') {
                        luaTable.j2(luaj.lib.DebugLib.j0, luaj.LuaValue.K2(cVarA.f1760c));
                        luaTable.j2(luaj.lib.DebugLib.k0, luaj.LuaValue.K2(cVarA.f1761d));
                        luaTable.j2(luaj.lib.DebugLib.l0, luaj.LuaValue.K2(cVarA.l));
                        luaTable.j2(luaj.lib.DebugLib.m0, luaj.LuaValue.I2(cVarA.f1763f));
                        luaString = luaj.lib.DebugLib.n0;
                        i2 = cVarA.f1764g;
                    } else if (cCharAt != 'f') {
                        if (cCharAt != 'l') {
                            if (cCharAt == 'n') {
                                luaj.LuaString luaString2 = luaj.lib.DebugLib.h0;
                                java.lang.String str = cVarA.f1758a;
                                luaTable.j2(luaString2, str != null ? luaj.LuaValue.K2(str) : luaj.LuaValue.f1673c);
                                luaString = luaj.lib.DebugLib.i0;
                                luaValueI2 = luaj.LuaValue.K2(cVarA.f1759b);
                            } else if (cCharAt == 't') {
                                luaString = luaj.lib.DebugLib.d0;
                                luaValueI2 = luaj.LuaValue.H2(cVarA.k);
                            } else if (cCharAt != 'u') {
                                char cCharAt2 = strZ.charAt(i3);
                                luaj.LuaValue.l0(i + 1, "debug.getinfo", "invalid option: '" + cCharAt2 + "' [0x" + java.lang.Integer.toHexString(cCharAt2) + "] at index " + (i3 + 1) + " in '" + strZ + "'");
                            } else {
                                luaTable.j2(luaj.lib.DebugLib.f0, luaj.LuaValue.I2(cVarA.h));
                                luaTable.j2(luaj.lib.DebugLib.g0, luaj.LuaValue.I2(cVarA.i));
                                luaString = luaj.lib.DebugLib.e0;
                                luaValueI2 = cVarA.j ? luaj.LuaValue.f1674d : luaj.LuaValue.f1675e;
                            }
                            luaTable.j2(luaString, luaValueI2);
                        } else {
                            luaString = luaj.lib.DebugLib.o0;
                            i2 = cVarA.f1762e;
                        }
                    } else if (luaValueV != null) {
                        luaTable.j2(luaj.lib.DebugLib.c0, luaValueV);
                    }
                    luaValueI2 = luaj.LuaValue.I2(i2);
                    luaTable.j2(luaString, luaValueI2);
                } else if (luaValueV.f1()) {
                    luaj.LuaTable luaTable2 = new luaj.LuaTable();
                    luaTable.j2(luaj.lib.DebugLib.p0, luaTable2);
                    for (int i4 : luaValueV.w0().R.f1726d) {
                        luaTable2.d2(luaj.LuaValue.I2(i4), luaj.LuaValue.f1674d);
                    }
                }
            }
            return luaTable;
        }
    }

    final class getlocal extends luaj.lib.VarArgFunction {
        getlocal() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaThread luaThreadJ;
            int i;
            if (varargs.T(1)) {
                luaThreadJ = varargs.J(1);
                i = 2;
            } else {
                luaThreadJ = luaj.lib.DebugLib.this.T.f0;
                i = 1;
            }
            luaj.LuaValue luaValueV = varargs.v(i);
            int iD = varargs.D(i + 1);
            if (luaValueV.g1()) {
                return !luaValueV.f1() ? luaj.LuaValue.f1673c : luaValueV.w0().R.a(iD, 0);
            }
            int iD2 = varargs.D(i);
            luaj.lib.DebugLib.b bVarZ2 = luaj.lib.DebugLib.this.Z2(luaThreadJ);
            int i2 = bVarZ2.f1757b;
            if (bVarZ2.e(1).f1749a == this) {
                iD2++;
                i2--;
            }
            luaj.lib.DebugLib.a aVarE = bVarZ2.e(iD2);
            if (aVarE != null) {
                return aVarE.b(iD);
            }
            return luaj.LuaValue.l0(i, "debug.getlocal", "level out of range: " + iD2 + " not between 1 and " + i2);
        }
    }

    static final class getmetatable extends luaj.lib.LibFunction {
        getmetatable() {
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            luaj.LuaValue luaValueV0 = luaValue.V0();
            return luaValueV0 != null ? luaValueV0 : luaj.LuaValue.f1673c;
        }
    }

    final class getregistry extends luaj.lib.ZeroArgFunction {
        getregistry() {
        }

        @Override // luaj.lib.ZeroArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call() {
            return luaj.lib.DebugLib.this.T;
        }
    }

    static final class getupvalue extends luaj.lib.VarArgFunction {
        getupvalue() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaClosure luaClosure;
            luaj.LuaString luaStringC3;
            luaj.LuaFunction luaFunctionC = varargs.C(1);
            int iD = varargs.D(2);
            return (!(luaFunctionC instanceof luaj.LuaClosure) || (luaStringC3 = luaj.lib.DebugLib.c3((luaClosure = (luaj.LuaClosure) luaFunctionC), iD)) == null) ? luaj.LuaValue.f1673c : luaj.LuaValue.N2(luaStringC3, luaClosure.S[iD - 1].b());
        }
    }

    final class sethook extends luaj.lib.VarArgFunction {
        sethook() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaThread luaThreadJ;
            int i;
            if (varargs.T(1)) {
                luaThreadJ = varargs.J(1);
                i = 2;
            } else {
                luaThreadJ = luaj.lib.DebugLib.this.T.f0;
                i = 1;
            }
            luaj.LuaFunction luaFunctionX = varargs.X(i, null);
            java.lang.String strZ = varargs.Z(i + 1, "");
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
            luaj.LuaThread.a aVar = luaThreadJ.P;
            aVar.f1670f = luaFunctionX;
            aVar.h = z;
            aVar.f1671g = z2;
            aVar.j = iY;
            aVar.i = z3;
            luaj.lib.DebugLib.this.Y2().l(aVar);
            return luaj.LuaValue.f1676f;
        }
    }

    final class setlocal extends luaj.lib.VarArgFunction {
        setlocal() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaThread luaThreadJ;
            int i;
            if (varargs.T(1)) {
                luaThreadJ = varargs.J(1);
                i = 2;
            } else {
                luaThreadJ = luaj.lib.DebugLib.this.T.f0;
                i = 1;
            }
            int iD = varargs.D(i);
            int iD2 = varargs.D(i + 1);
            luaj.LuaValue luaValueV = varargs.v(i + 2);
            luaj.lib.DebugLib.b bVarZ2 = luaj.lib.DebugLib.this.Z2(luaThreadJ);
            int i2 = bVarZ2.f1757b;
            if (bVarZ2.e(1).f1749a == this) {
                iD++;
                i2--;
            }
            luaj.lib.DebugLib.a aVarE = bVarZ2.e(iD);
            if (aVarE != null) {
                return aVarE.h(iD2, luaValueV);
            }
            return luaj.LuaValue.l0(i, "debug.setlocal", "level out of range: " + iD + " not between 1 and " + i2);
        }
    }

    static final class setmetatable extends luaj.lib.TwoArgFunction {
        setmetatable() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            luaj.LuaTable luaTableL1 = luaValue2.L1(null);
            int iC2 = luaValue.C2();
            if (iC2 == 0) {
                luaj.LuaNil.P = luaTableL1;
            } else if (iC2 == 1) {
                luaj.LuaBoolean.Q = luaTableL1;
            } else if (iC2 == 3) {
                luaj.LuaNumber.P = luaTableL1;
            } else if (iC2 == 4) {
                luaj.LuaString.U = luaTableL1;
            } else if (iC2 == 6) {
                luaj.LuaFunction.P = luaTableL1;
            } else if (iC2 != 8) {
                luaValue.k2(luaTableL1);
            } else {
                luaj.LuaThread.T = luaTableL1;
            }
            return luaValue;
        }
    }

    static final class setupvalue extends luaj.lib.VarArgFunction {
        setupvalue() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaClosure luaClosure;
            luaj.LuaString luaStringC3;
            luaj.LuaFunction luaFunctionC = varargs.C(1);
            int iD = varargs.D(2);
            luaj.LuaValue luaValueV = varargs.v(3);
            if (!(luaFunctionC instanceof luaj.LuaClosure) || (luaStringC3 = luaj.lib.DebugLib.c3((luaClosure = (luaj.LuaClosure) luaFunctionC), iD)) == null) {
                return luaj.LuaValue.f1673c;
            }
            luaClosure.S[iD - 1].c(luaValueV);
            return luaStringC3;
        }
    }

    final class traceback extends luaj.lib.VarArgFunction {
        traceback() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaThread luaThreadJ;
            int i;
            if (varargs.T(1)) {
                luaThreadJ = varargs.J(1);
                i = 2;
            } else {
                luaThreadJ = luaj.lib.DebugLib.this.T.f0;
                i = 1;
            }
            int i2 = i + 1;
            luaj.LuaValue luaValueV = varargs.v(i);
            if (!luaValueV.n1() && !luaValueV.l1()) {
                return luaValueV;
            }
            int iY = varargs.Y(i2, 1);
            luaj.lib.DebugLib.b bVarZ2 = luaj.lib.DebugLib.this.Z2(luaThreadJ);
            if (bVarZ2.e(1).f1749a == this) {
                iY++;
            }
            java.lang.String strM = bVarZ2.m(luaj.lib.DebugLib.this.T, iY);
            if (luaValueV.n1()) {
                strM = luaValueV.g0() + '\n' + strM;
            }
            return luaj.LuaValue.K2(strM);
        }
    }

    static final class upvalueid extends luaj.lib.VarArgFunction {
        upvalueid() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.i[] iVarArr;
            luaj.LuaFunction luaFunctionC = varargs.C(1);
            int iD = varargs.D(2);
            if ((luaFunctionC instanceof luaj.LuaClosure) && (iVarArr = ((luaj.LuaClosure) luaFunctionC).S) != null && iD > 0 && iD <= iVarArr.length) {
                return luaj.LuaValue.I2(iVarArr[iD - 1].hashCode());
            }
            return luaj.LuaValue.l0(2, "debug.upvalueid", "invalid upvalue index " + iD);
        }
    }

    static final class upvaluejoin extends luaj.lib.VarArgFunction {
        upvaluejoin() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaClosure luaClosureA = varargs.A(1);
            int iD = varargs.D(2);
            luaj.LuaClosure luaClosureA2 = varargs.A(3);
            int iD2 = varargs.D(4);
            if (iD < 1 || iD > luaClosureA.S.length) {
                m0("index out of range");
            }
            if (iD2 < 1 || iD2 > luaClosureA2.S.length) {
                m0("index out of range");
            }
            luaClosureA.S[iD - 1] = luaClosureA2.S[iD2 - 1];
            return luaj.LuaValue.f1676f;
        }
    }

    static {
        boolean z = true;
        try {
            U = java.lang.System.getProperty("CALLS") != null;
        } catch (java.lang.Exception unused) {
        }
        try {
            if (java.lang.System.getProperty("TRACE") == null) {
                z = false;
            }
            V = z;
        } catch (java.lang.Exception unused2) {
        }
        W = luaj.LuaValue.K2("?");
        X = luaj.LuaValue.K2("call");
        Y = luaj.LuaValue.K2("tail call");
        Z = luaj.LuaValue.K2("line");
        a0 = luaj.LuaValue.K2("count");
        b0 = luaj.LuaValue.K2("return");
        c0 = luaj.LuaValue.K2("func");
        d0 = luaj.LuaValue.K2("istailcall");
        e0 = luaj.LuaValue.K2("isvararg");
        f0 = luaj.LuaValue.K2("nups");
        g0 = luaj.LuaValue.K2("nparams");
        h0 = luaj.LuaValue.K2("name");
        i0 = luaj.LuaValue.K2("namewhat");
        j0 = luaj.LuaValue.K2("what");
        k0 = luaj.LuaValue.K2("source");
        l0 = luaj.LuaValue.K2("short_src");
        m0 = luaj.LuaValue.K2("linedefined");
        n0 = luaj.LuaValue.K2("lastlinedefined");
        o0 = luaj.LuaValue.K2("currentline");
        p0 = luaj.LuaValue.K2("activelines");
        q0 = luaj.LuaValue.K2("(*temporary)");
        r0 = luaj.LuaValue.K2("(*vararg)");
    }

    private static luaj.LuaString a3(ggf.d dVar, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
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
        return luaj.LuaString.K2(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0063  */
    static int b3(luaj.h hVar, int i, int i2) {
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

    static luaj.LuaString c3(luaj.LuaClosure luaClosure, int i) {
        luaj.i[] iVarArr = luaClosure.S;
        if (iVarArr == null || i <= 0 || i > iVarArr.length) {
            return null;
        }
        ggf.d[] dVarArr = luaClosure.R.f1728f;
        if (dVarArr == null || i > dVarArr.length) {
            return a3(null, i);
        }
        ggf.d dVar = dVarArr[i - 1];
        luaj.LuaString luaString = dVar.f1565a;
        return luaString == null ? a3(dVar, i) : luaString;
    }

    static luaj.lib.DebugLib.d e3(luaj.lib.DebugLib.a aVar) {
        luaj.LuaString luaString;
        if (!aVar.f1749a.f1()) {
            return new luaj.lib.DebugLib.d(aVar.f1749a.S2(), "Java");
        }
        luaj.h hVar = aVar.f1749a.w0().R;
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
                luaString = luaj.LuaValue.l;
                break;
            case 8:
            case 10:
                luaString = luaj.LuaValue.m;
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
                luaString = luaj.LuaValue.q;
                break;
            case 14:
                luaString = luaj.LuaValue.r;
                break;
            case 15:
                luaString = luaj.LuaValue.t;
                break;
            case 16:
                luaString = luaj.LuaValue.s;
                break;
            case 17:
                luaString = luaj.LuaValue.v;
                break;
            case 18:
                luaString = luaj.LuaValue.u;
                break;
            case 19:
                luaString = luaj.LuaValue.w;
                break;
            case 21:
                luaString = luaj.LuaValue.x;
                break;
            case 22:
                luaString = luaj.LuaValue.C;
                break;
            case 24:
                luaString = luaj.LuaValue.y;
                break;
            case 25:
                luaString = luaj.LuaValue.z;
                break;
            case 26:
                luaString = luaj.LuaValue.A;
                break;
            case 29:
            case 30:
                return g3(hVar, i, luaj.b.c(i2));
            case 34:
                return new luaj.lib.DebugLib.d("for iterator", "for iterator");
            case 40:
                luaString = luaj.LuaValue.D;
                break;
            case 41:
                luaString = luaj.LuaValue.E;
                break;
            case 42:
                luaString = luaj.LuaValue.F;
                break;
            case 43:
                luaString = luaj.LuaValue.G;
                break;
            case 44:
                luaString = luaj.LuaValue.H;
                break;
            case 45:
                luaString = luaj.LuaValue.I;
                break;
            case 46:
                luaString = luaj.LuaValue.J;
                break;
        }
        return new luaj.lib.DebugLib.d(luaString.g0(), "metamethod");
    }

    public static java.lang.String f3(int i, int i2, luaj.h hVar) {
        luaj.lib.DebugLib.d dVarG3 = g3(hVar, i, i2);
        if (dVarG3 == null) {
            return null;
        }
        return dVarG3.toString();
    }

    static luaj.lib.DebugLib.d g3(luaj.h hVar, int i, int i2) {
        luaj.LuaString luaStringA;
        luaj.LuaString luaStringA2 = hVar.a(i2 + 1, i);
        if (luaStringA2 != null) {
            return new luaj.lib.DebugLib.d(luaStringA2.g0(), "local");
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
                    return new luaj.lib.DebugLib.d(hVar.f1723a[iF].q2().g0(), "constant");
                }
            } else {
                if (i4 == 5) {
                    int iE2 = luaj.b.e(i3);
                    ggf.d[] dVarArr = hVar.f1728f;
                    luaj.LuaString luaString = iE2 < dVarArr.length ? dVarArr[iE2].f1565a : W;
                    if (luaString == null) {
                        return null;
                    }
                    return new luaj.lib.DebugLib.d(luaString.g0(), "upvalue");
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
                    return new luaj.lib.DebugLib.d(h3(hVar, iB3, iG), (luaStringA == null || !luaStringA.P0(luaj.LuaValue.k)) ? "field" : "global");
                }
                if (i4 == 12) {
                    return new luaj.lib.DebugLib.d(h3(hVar, iB3, luaj.b.g(i3)), "method");
                }
            }
        }
        return null;
    }

    static java.lang.String h3(luaj.h hVar, int i, int i2) {
        if (luaj.b.k(i2)) {
            luaj.LuaValue luaValue = hVar.f1723a[luaj.b.j(i2)];
            return luaValue.n1() ? luaValue.g0() : "?";
        }
        luaj.lib.DebugLib.d dVarG3 = g3(hVar, i, i2);
        return (dVarG3 == null || !"constant".equals(dVarG3.f1766b)) ? "?" : dVarG3.f1765a;
    }

    void X2(luaj.LuaThread.a aVar, luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        luaj.LuaFunction luaFunction = aVar.f1670f;
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
                    } catch (java.lang.Throwable th) {
                        if (zF1) {
                            l3();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    aVar.k = 0;
                    throw th2;
                }
            } catch (luaj.d e2) {
                throw e2;
            }
        } catch (java.lang.RuntimeException e3) {
            throw new luaj.d.a(e3);
        }
    }

    luaj.lib.DebugLib.b Y2() {
        return Z2(this.T.f0);
    }

    luaj.lib.DebugLib.b Z2(luaj.LuaThread luaThread) {
        if (luaThread.Q == null) {
            luaThread.Q = new luaj.lib.DebugLib.b();
        }
        return (luaj.lib.DebugLib.b) luaThread.Q;
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        luaj.Globals globalsZ0 = luaValue2.z0();
        this.T = globalsZ0;
        globalsZ0.i0 = this;
        luaj.LuaTable luaTable = new luaj.LuaTable();
        luaTable.i2("debug", new luaj.lib.DebugLib.debug());
        luaTable.i2("gethook", new luaj.lib.DebugLib.gethook());
        luaTable.i2("getinfo", new luaj.lib.DebugLib.getinfo());
        luaTable.i2("getlocal", new luaj.lib.DebugLib.getlocal());
        luaTable.i2("getmetatable", new luaj.lib.DebugLib.getmetatable());
        luaTable.i2("getregistry", new luaj.lib.DebugLib.getregistry());
        luaTable.i2("getupvalue", new luaj.lib.DebugLib.getupvalue());
        luaTable.i2("sethook", new luaj.lib.DebugLib.sethook());
        luaTable.i2("setlocal", new luaj.lib.DebugLib.setlocal());
        luaTable.i2("setmetatable", new luaj.lib.DebugLib.setmetatable());
        luaTable.i2("setupvalue", new luaj.lib.DebugLib.setupvalue());
        luaTable.i2("traceback", new luaj.lib.DebugLib.traceback());
        luaTable.i2("upvalueid", new luaj.lib.DebugLib.upvalueid());
        luaTable.i2("upvaluejoin", new luaj.lib.DebugLib.upvaluejoin());
        luaValue2.i2("debug", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("debug", luaTable);
        }
        return luaTable;
    }

    public luaj.lib.DebugLib.a d3(int i) {
        return Y2().e(i);
    }

    public void i3(luaj.LuaClosure luaClosure, luaj.Varargs varargs, luaj.LuaValue[] luaValueArr, boolean z) {
        luaj.LuaThread.a aVar = this.T.f0.P;
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
            X2(aVar, z ? Y : X, luaj.LuaValue.f1673c);
        }
    }

    public void j3(luaj.LuaFunction luaFunction, boolean z) {
        luaj.LuaThread.a aVar = this.T.f0.P;
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
            X2(aVar, z ? Y : X, luaj.LuaValue.f1673c);
        }
    }

    public void k3(int i, luaj.Varargs varargs, int i2) {
        luaj.LuaThread luaThread = this.T.f0;
        luaj.LuaThread.a aVar = luaThread.P;
        Z2(luaThread).h(i, varargs, i2);
        if (aVar.k == 0 && aVar.f1670f != null) {
            int i3 = aVar.j;
            if (i3 > 0) {
                int i4 = aVar.n + 1;
                aVar.n = i4;
                if (i4 % i3 == 0) {
                    X2(aVar, a0, luaj.LuaValue.f1673c);
                }
            }
            if (aVar.f1671g) {
                int iB = Y2().b();
                if (iB != aVar.l || i <= aVar.m) {
                    aVar.l = iB;
                    X2(aVar, Z, luaj.LuaValue.I2(iB));
                }
                aVar.m = i;
            }
        }
    }

    public void l3() {
        luaj.LuaThread.a aVar = this.T.f0.P;
        if (aVar.k == 0 && aVar.i) {
            X2(aVar, b0, luaj.LuaValue.f1673c);
        }
        Y2().i(aVar);
    }

    public java.lang.String m3(luaj.Globals globals, int i) {
        return Y2().m(globals, i);
    }
}
