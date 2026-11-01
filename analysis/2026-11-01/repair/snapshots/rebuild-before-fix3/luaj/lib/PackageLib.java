package luaj.lib;

import java.io.IOException;
import java.io.InputStream;
import luaj.Globals;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class PackageLib extends TwoArgFunction {
    public static final String Z;
    static final LuaString a0;
    private static final LuaString b0;
    static final LuaString c0;
    static final LuaString d0;
    static final LuaString e0;
    static final LuaString f0;
    static final LuaString g0;
    static final String h0;
    Globals T;
    LuaTable U;
    public preload_searcher V;
    public lua_searcher W;
    public java_searcher X;
    private volatile String[] Y = new String[0];

    public class java_searcher extends VarArgFunction {
        public java_searcher() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            String string;
            StringBuilder sb;
            String strA3 = PackageLib.a3(varargs.E(1));
            if (PackageLib.this.Z2(strA3)) {
                try {
                    LuaValue luaValue = (LuaValue) Class.forName(strA3, false, PackageLib.class.getClassLoader()).asSubclass(LuaValue.class).newInstance();
                    if (luaValue.g1()) {
                        ((LuaFunction) luaValue).c1(PackageLib.this.T);
                    }
                    return LuaValue.N2(luaValue, PackageLib.this.T);
                } catch (ClassNotFoundException unused) {
                    sb = new StringBuilder();
                    sb.append("\n\tno class '");
                    sb.append(strA3);
                    sb.append('\'');
                } catch (Exception e2) {
                    string = "\n\tjava load failed on '" + strA3 + "', " + e2;
                }
            } else {
                sb = new StringBuilder();
                sb.append("\n\tjava class '");
                sb.append(strA3);
                sb.append("' not allowed");
            }
            string = sb.toString();
            return LuaValue.K2(string);
        }
    }

    public static class loadlib extends VarArgFunction {
        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            varargs.H(1);
            return LuaValue.M2(LuaValue.f1673c, LuaValue.K2("dynamic libraries not enabled"), LuaValue.K2("absent"));
        }
    }

    public class lua_searcher extends VarArgFunction {
        public lua_searcher() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaString luaStringH = varargs.H(1);
            LuaValue luaValueU0 = PackageLib.this.U.U0(PackageLib.d0);
            if (!luaValueU0.n1()) {
                return LuaValue.K2("\n\tpackage.path is not a string");
            }
            Varargs varargsInvoke = PackageLib.this.U.U0(PackageLib.e0).invoke(LuaValue.N2(luaStringH, luaValueU0));
            if (!varargsInvoke.S(1)) {
                return varargsInvoke.v(2).B2();
            }
            LuaString luaStringQ2 = varargsInvoke.w().q2();
            String strG0 = luaStringQ2.g0();
            PackageLib.this.T.g0.Y2(null, strG0, true, null);
            LuaValue luaValueQ3 = PackageLib.this.T.Q3(strG0);
            if (luaValueQ3.w().g1()) {
                return LuaValue.N2(luaValueQ3.w(), luaStringQ2);
            }
            return LuaValue.N2(LuaValue.f1673c, LuaValue.K2("'" + luaStringQ2 + "': " + luaValueQ3.v(2).g0()));
        }
    }

    public class preload_searcher extends VarArgFunction {
        public preload_searcher() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaString luaStringH = varargs.H(1);
            LuaValue luaValueU0 = PackageLib.this.U.U0(PackageLib.c0).U0(luaStringH);
            if (!luaValueU0.l1()) {
                return luaValueU0;
            }
            return LuaValue.K2("\n\tno field package.preload['" + luaStringH + "']");
        }
    }

    public class require extends OneArgFunction {
        public require() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) throws Exception {
            LuaValue luaValueV;
            String str;
            Varargs varargsInvoke;
            LuaString luaStringG0 = luaValue.G0();
            LuaValue luaValueU0 = PackageLib.this.U.U0(PackageLib.a0);
            LuaValue luaValueU1 = luaValueU0.U0(luaStringG0);
            if (luaValueU1.w2()) {
                if (luaValueU1 == PackageLib.g0) {
                    LuaValue.R0("loop or previous error loading module '" + luaStringG0 + '\'');
                }
                return luaValueU1;
            }
            LuaValue luaValueU2 = PackageLib.this.U.U0(PackageLib.f0);
            if (!luaValueU2.o1()) {
                LuaValue.R0("'package.searchers' must be a table");
            }
            LuaTable luaTableH0 = luaValueU2.H0();
            StringBuffer stringBuffer = new StringBuffer();
            int i = 1;
            while (true) {
                luaValueV = null;
                try {
                    LuaValue luaValueC3 = luaTableH0.c3(i);
                    if (luaValueC3.l1()) {
                        LuaValue.R0("module '" + luaStringG0 + "' not found: " + luaStringG0 + ((Object) stringBuffer));
                    }
                    varargsInvoke = luaValueC3.invoke(luaStringG0);
                    if (varargsInvoke.P(1)) {
                        break;
                    }
                    if (varargsInvoke.S(1)) {
                        stringBuffer.append(varargsInvoke.h0(1));
                    }
                    i++;
                } catch (Exception e2) {
                    if (e2 instanceof luaj.d) {
                        luaj.d dVar = (luaj.d) e2;
                        StringBuilder sb = new StringBuilder();
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
            LuaString luaString = PackageLib.g0;
            luaValueU0.j2(luaStringG0, luaString);
            luaValueV = varargsInvoke.v(2);
            LuaValue luaValueCall = varargsInvoke.w().call(luaStringG0, luaValueV);
            if (luaValueCall.l1()) {
                luaValueCall = luaValueU0.U0(luaStringG0);
                if (luaValueCall == luaString) {
                    luaValueCall = LuaValue.f1674d;
                    luaValueU0.j2(luaStringG0, luaValueCall);
                }
            } else {
                luaValueU0.j2(luaStringG0, luaValueCall);
            }
            return luaValueCall;
        }
    }

    public class searchpath extends VarArgFunction {
        public searchpath() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            String strE = varargs.E(1);
            String strE2 = varargs.E(2);
            String strZ = varargs.Z(3, ".");
            String strZ2 = varargs.Z(4, PackageLib.h0);
            int length = strE2.length();
            int i = -1;
            StringBuffer stringBuffer = null;
            if (strZ.length() > 0) {
                strE = strE.replace(strZ, strZ2);
            }
            while (i < length) {
                int i2 = i + 1;
                int iIndexOf = strE2.indexOf(59, i2);
                if (iIndexOf < 0) {
                    iIndexOf = strE2.length();
                }
                String strReplace = strE2.substring(i2, iIndexOf).replace("?", strE);
                InputStream inputStreamU = PackageLib.this.T.e0.u(strReplace);
                if (inputStreamU != null) {
                    try {
                        inputStreamU.close();
                    } catch (IOException unused) {
                    }
                    return LuaValue.K2(strReplace);
                }
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                stringBuffer.append("\n\t" + strReplace);
                i = iIndexOf;
            }
            return LuaValue.N2(LuaValue.f1673c, LuaValue.K2(stringBuffer.toString()));
        }
    }

    static {
        String property;
        try {
            property = System.getProperty("luaj.package.path");
        } catch (Exception e2) {
            System.out.println(e2.toString());
            property = null;
        }
        if (property == null) {
            property = "?.lua";
        }
        Z = property;
        a0 = LuaValue.K2("loaded");
        b0 = LuaValue.K2("loadlib");
        c0 = LuaValue.K2("preload");
        d0 = LuaValue.K2("path");
        e0 = LuaValue.K2("searchpath");
        f0 = LuaValue.K2("searchers");
        g0 = LuaValue.K2("\u0001");
        h0 = System.getProperty("file.separator");
    }

    private static final boolean Y2(char c2) {
        return (c2 >= 'a' && c2 <= 'z') || (c2 >= 'A' && c2 <= 'Z') || ((c2 >= '0' && c2 <= '9') || c2 == '$' || c2 == '.' || c2 == '_');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Z2(String str) {
        for (String str2 : this.Y) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a3(String str) {
        int length = str.length();
        int i = str.endsWith(".lua") ? length - 4 : length;
        for (int i2 = 0; i2 < i; i2++) {
            char cCharAt = str.charAt(i2);
            if (!Y2(cCharAt) || cCharAt == '/' || cCharAt == '\\') {
                StringBuffer stringBuffer = new StringBuffer(i);
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
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        Globals globalsZ0 = luaValue2.z0();
        this.T = globalsZ0;
        globalsZ0.i2("require", new require());
        LuaTable luaTable = new LuaTable();
        this.U = luaTable;
        LuaString luaString = a0;
        luaTable.j2(luaString, new LuaTable());
        this.U.j2(c0, new LuaTable());
        this.U.j2(d0, LuaValue.K2(Z));
        this.U.j2(b0, new loadlib());
        this.U.j2(e0, new searchpath());
        LuaValue luaTable2 = new LuaTable();
        preload_searcher preload_searcherVar = new preload_searcher();
        this.V = preload_searcherVar;
        luaTable2.e2(1, preload_searcherVar);
        lua_searcher lua_searcherVar = new lua_searcher();
        this.W = lua_searcherVar;
        luaTable2.e2(2, lua_searcherVar);
        java_searcher java_searcherVar = new java_searcher();
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
    public String g0() {
        return "package";
    }
}
