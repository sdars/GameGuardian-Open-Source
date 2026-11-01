package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
public class PackageLib extends luaj.lib.TwoArgFunction {
    public static final java.lang.String Z;
    static final luaj.LuaString a0;
    private static final luaj.LuaString b0;
    static final luaj.LuaString c0;
    static final luaj.LuaString d0;
    static final luaj.LuaString e0;
    static final luaj.LuaString f0;
    static final luaj.LuaString g0;
    static final java.lang.String h0;
    luaj.Globals T;
    luaj.LuaTable U;
    public luaj.lib.PackageLib.preload_searcher V;
    public luaj.lib.PackageLib.lua_searcher W;
    public luaj.lib.PackageLib.java_searcher X;
    private volatile java.lang.String[] Y = new java.lang.String[0];

    public class java_searcher extends luaj.lib.VarArgFunction {
        public java_searcher() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            java.lang.String string;
            java.lang.StringBuilder sb;
            java.lang.String strA3 = luaj.lib.PackageLib.a3(varargs.E(1));
            if (luaj.lib.PackageLib.this.Z2(strA3)) {
                try {
                    luaj.LuaValue luaValue = (luaj.LuaValue) java.lang.Class.forName(strA3, false, luaj.lib.PackageLib.class.getClassLoader()).asSubclass(luaj.LuaValue.class).newInstance();
                    if (luaValue.g1()) {
                        ((luaj.LuaFunction) luaValue).c1(luaj.lib.PackageLib.this.T);
                    }
                    return luaj.LuaValue.N2(luaValue, luaj.lib.PackageLib.this.T);
                } catch (java.lang.ClassNotFoundException unused) {
                    sb = new java.lang.StringBuilder();
                    sb.append("\n\tno class '");
                    sb.append(strA3);
                    sb.append('\'');
                } catch (java.lang.Exception e2) {
                    string = "\n\tjava load failed on '" + strA3 + "', " + e2;
                }
            } else {
                sb = new java.lang.StringBuilder();
                sb.append("\n\tjava class '");
                sb.append(strA3);
                sb.append("' not allowed");
            }
            string = sb.toString();
            return luaj.LuaValue.K2(string);
        }
    }

    public static class loadlib extends luaj.lib.VarArgFunction {
        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            varargs.H(1);
            return luaj.LuaValue.M2(luaj.LuaValue.f1673c, luaj.LuaValue.K2("dynamic libraries not enabled"), luaj.LuaValue.K2("absent"));
        }
    }

    public class lua_searcher extends luaj.lib.VarArgFunction {
        public lua_searcher() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaString luaStringH = varargs.H(1);
            luaj.LuaValue luaValueU0 = luaj.lib.PackageLib.this.U.U0(luaj.lib.PackageLib.d0);
            if (!luaValueU0.n1()) {
                return luaj.LuaValue.K2("\n\tpackage.path is not a string");
            }
            luaj.Varargs varargsInvoke = luaj.lib.PackageLib.this.U.U0(luaj.lib.PackageLib.e0).invoke(luaj.LuaValue.N2(luaStringH, luaValueU0));
            if (!varargsInvoke.S(1)) {
                return varargsInvoke.v(2).B2();
            }
            luaj.LuaString luaStringQ2 = varargsInvoke.w().q2();
            java.lang.String strG0 = luaStringQ2.g0();
            luaj.lib.PackageLib.this.T.g0.Y2(null, strG0, true, null);
            luaj.LuaValue luaValueQ3 = luaj.lib.PackageLib.this.T.Q3(strG0);
            if (luaValueQ3.w().g1()) {
                return luaj.LuaValue.N2(luaValueQ3.w(), luaStringQ2);
            }
            return luaj.LuaValue.N2(luaj.LuaValue.f1673c, luaj.LuaValue.K2("'" + luaStringQ2 + "': " + luaValueQ3.v(2).g0()));
        }
    }

    public class preload_searcher extends luaj.lib.VarArgFunction {
        public preload_searcher() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaString luaStringH = varargs.H(1);
            luaj.LuaValue luaValueU0 = luaj.lib.PackageLib.this.U.U0(luaj.lib.PackageLib.c0).U0(luaStringH);
            if (!luaValueU0.l1()) {
                return luaValueU0;
            }
            return luaj.LuaValue.K2("\n\tno field package.preload['" + luaStringH + "']");
        }
    }

    public class require extends luaj.lib.OneArgFunction {
        public require() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) throws java.lang.Exception {
            luaj.LuaValue luaValueV;
            java.lang.String str;
            luaj.Varargs varargsInvoke;
            luaj.LuaString luaStringG0 = luaValue.G0();
            luaj.LuaValue luaValueU0 = luaj.lib.PackageLib.this.U.U0(luaj.lib.PackageLib.a0);
            luaj.LuaValue luaValueU1 = luaValueU0.U0(luaStringG0);
            if (luaValueU1.w2()) {
                if (luaValueU1 == luaj.lib.PackageLib.g0) {
                    luaj.LuaValue.R0("loop or previous error loading module '" + luaStringG0 + '\'');
                }
                return luaValueU1;
            }
            luaj.LuaValue luaValueU2 = luaj.lib.PackageLib.this.U.U0(luaj.lib.PackageLib.f0);
            if (!luaValueU2.o1()) {
                luaj.LuaValue.R0("'package.searchers' must be a table");
            }
            luaj.LuaTable luaTableH0 = luaValueU2.H0();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            int i = 1;
            while (true) {
                luaValueV = null;
                try {
                    luaj.LuaValue luaValueC3 = luaTableH0.c3(i);
                    if (luaValueC3.l1()) {
                        luaj.LuaValue.R0("module '" + luaStringG0 + "' not found: " + luaStringG0 + ((java.lang.Object) stringBuffer));
                    }
                    varargsInvoke = luaValueC3.invoke(luaStringG0);
                    if (varargsInvoke.P(1)) {
                        break;
                    }
                    if (varargsInvoke.S(1)) {
                        stringBuffer.append(varargsInvoke.h0(1));
                    }
                    i++;
                } catch (java.lang.Exception e2) {
                    if (e2 instanceof luaj.d) {
                        luaj.d dVar = (luaj.d) e2;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("error loading module '");
                        sb.append(luaStringG0);
                        sb.append("'");
                        if (luaValueV == null) {
                            str = "";
                        } else {
                            str = " from file '" + luaValueV + "'";
                        }
                        sb.append(str);
                        sb.append(":\n");
                        dVar.i = sb.toString();
                    }
                    throw e2;
                }
            }
            luaj.LuaString luaString = luaj.lib.PackageLib.g0;
            luaValueU0.j2(luaStringG0, luaString);
            luaValueV = varargsInvoke.v(2);
            luaj.LuaValue luaValueCall = varargsInvoke.w().call(luaStringG0, luaValueV);
            if (luaValueCall.l1()) {
                luaValueCall = luaValueU0.U0(luaStringG0);
                if (luaValueCall == luaString) {
                    luaValueCall = luaj.LuaValue.f1674d;
                    luaValueU0.j2(luaStringG0, luaValueCall);
                }
            } else {
                luaValueU0.j2(luaStringG0, luaValueCall);
            }
            return luaValueCall;
        }
    }

    public class searchpath extends luaj.lib.VarArgFunction {
        public searchpath() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            java.lang.String strE = varargs.E(1);
            java.lang.String strE2 = varargs.E(2);
            java.lang.String strZ = varargs.Z(3, ".");
            java.lang.String strZ2 = varargs.Z(4, luaj.lib.PackageLib.h0);
            int length = strE2.length();
            int i = -1;
            java.lang.StringBuffer stringBuffer = null;
            if (strZ.length() > 0) {
                strE = strE.replace(strZ, strZ2);
            }
            while (i < length) {
                int i2 = i + 1;
                int iIndexOf = strE2.indexOf(59, i2);
                if (iIndexOf < 0) {
                    iIndexOf = strE2.length();
                }
                java.lang.String strReplace = strE2.substring(i2, iIndexOf).replace("?", strE);
                java.io.InputStream inputStreamU = luaj.lib.PackageLib.this.T.e0.u(strReplace);
                if (inputStreamU != null) {
                    try {
                        inputStreamU.close();
                    } catch (java.io.IOException unused) {
                    }
                    return luaj.LuaValue.K2(strReplace);
                }
                if (stringBuffer == null) {
                    stringBuffer = new java.lang.StringBuffer();
                }
                stringBuffer.append("\n\t" + strReplace);
                i = iIndexOf;
            }
            return luaj.LuaValue.N2(luaj.LuaValue.f1673c, luaj.LuaValue.K2(stringBuffer.toString()));
        }
    }

    static {
        java.lang.String property;
        try {
            property = java.lang.System.getProperty("luaj.package.path");
        } catch (java.lang.Exception e2) {
            java.lang.System.out.println(e2.toString());
            property = null;
        }
        if (property == null) {
            property = "?.lua";
        }
        Z = property;
        a0 = luaj.LuaValue.K2("loaded");
        b0 = luaj.LuaValue.K2("loadlib");
        c0 = luaj.LuaValue.K2("preload");
        d0 = luaj.LuaValue.K2("path");
        e0 = luaj.LuaValue.K2("searchpath");
        f0 = luaj.LuaValue.K2("searchers");
        g0 = luaj.LuaValue.K2("\u0001");
        h0 = java.lang.System.getProperty("file.separator");
    }

    private static final boolean Y2(char c2) {
        return (c2 >= 'a' && c2 <= 'z') || (c2 >= 'A' && c2 <= 'Z') || ((c2 >= '0' && c2 <= '9') || c2 == '$' || c2 == '.' || c2 == '_');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Z2(java.lang.String str) {
        for (java.lang.String str2 : this.Y) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.String a3(java.lang.String str) {
        int length = str.length();
        int i = str.endsWith(".lua") ? length - 4 : length;
        for (int i2 = 0; i2 < i; i2++) {
            char cCharAt = str.charAt(i2);
            if (!Y2(cCharAt) || cCharAt == '/' || cCharAt == '\\') {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i);
                for (int i3 = 0; i3 < i; i3++) {
                    char cCharAt2 = str.charAt(i3);
                    if (!Y2(cCharAt2)) {
                        cCharAt2 = (cCharAt2 == '/' || cCharAt2 == '\\') ? '.' : '_';
                    }
                    stringBuffer.append(cCharAt2);
                }
                return stringBuffer.toString();
            }
        }
        return length == i ? str : str.substring(0, i);
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        luaj.Globals globalsZ0 = luaValue2.z0();
        this.T = globalsZ0;
        globalsZ0.i2("require", new luaj.lib.PackageLib.require());
        luaj.LuaTable luaTable = new luaj.LuaTable();
        this.U = luaTable;
        luaj.LuaString luaString = a0;
        luaTable.j2(luaString, new luaj.LuaTable());
        this.U.j2(c0, new luaj.LuaTable());
        this.U.j2(d0, luaj.LuaValue.K2(Z));
        this.U.j2(b0, new luaj.lib.PackageLib.loadlib());
        this.U.j2(e0, new luaj.lib.PackageLib.searchpath());
        luaj.LuaValue luaTable2 = new luaj.LuaTable();
        luaj.lib.PackageLib.preload_searcher preload_searcherVar = new luaj.lib.PackageLib.preload_searcher();
        this.V = preload_searcherVar;
        luaTable2.e2(1, preload_searcherVar);
        luaj.lib.PackageLib.lua_searcher lua_searcherVar = new luaj.lib.PackageLib.lua_searcher();
        this.W = lua_searcherVar;
        luaTable2.e2(2, lua_searcherVar);
        luaj.lib.PackageLib.java_searcher java_searcherVar = new luaj.lib.PackageLib.java_searcher();
        this.X = java_searcherVar;
        luaTable2.e2(3, java_searcherVar);
        this.U.j2(f0, luaTable2);
        this.U.h2("config", h0 + "\n;\n?\n!\n-\n");
        this.U.U0(luaString).i2("package", this.U);
        luaValue2.i2("package", this.U);
        this.T.h0 = this;
        return luaValue2;
    }

    @Override // luaj.lib.LibFunction, luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
        return "package";
    }
}
