/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import java.io.IOException;
import java.io.InputStream;
import luaj.Globals;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.d;
import luaj.lib.OneArgFunction;
import luaj.lib.TwoArgFunction;
import luaj.lib.VarArgFunction;

public class PackageLib
extends TwoArgFunction {
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

    static {
        String string2;
        try {
            string2 = System.getProperty("luaj.package.path");
        }
        catch (Exception exception) {
            System.out.println(((Object)exception).toString());
            string2 = null;
        }
        String string3 = string2;
        if (string2 == null) {
            string3 = "?.lua";
        }
        Z = string3;
        a0 = LuaValue.K2("loaded");
        b0 = LuaValue.K2("loadlib");
        c0 = LuaValue.K2("preload");
        d0 = LuaValue.K2("path");
        e0 = LuaValue.K2("searchpath");
        f0 = LuaValue.K2("searchers");
        g0 = LuaValue.K2("");
        h0 = System.getProperty("file.separator");
    }

    private static final boolean Y2(char c4) {
        if (c4 >= 'a' && c4 <= 'z' || c4 >= 'A' && c4 <= 'Z' || c4 >= '0' && c4 <= '9') {
            return true;
        }
        return c4 == '$' || c4 == '.' || c4 == '_';
    }

    private boolean Z2(String string2) {
        String[] stringArray = this.Y;
        int n3 = stringArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            if (!string2.equals(stringArray[i3])) continue;
            return true;
        }
        return false;
    }

    public static final String a3(String string2) {
        int n3 = string2.length();
        int n4 = string2.endsWith(".lua") ? n3 - 4 : n3;
        int n5 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n6 = string2.charAt(i3);
            if (PackageLib.Y2((char)n6) && n6 != 47 && n6 != 92) {
                continue;
            }
            StringBuffer stringBuffer = new StringBuffer(n4);
            for (i3 = n5; i3 < n4; ++i3) {
                n6 = string2.charAt(i3);
                if (!PackageLib.Y2((char)n6)) {
                    n6 = n6 != 47 && n6 != 92 ? 95 : 46;
                }
                stringBuffer.append((char)n6);
            }
            return stringBuffer.toString();
        }
        if (n3 != n4) {
            string2 = string2.substring(0, n4);
        }
        return string2;
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        luaValue = luaValue2.z0();
        this.T = luaValue;
        luaValue.i2("require", new require(this));
        Object object = new LuaTable();
        this.U = object;
        luaValue = a0;
        ((LuaTable)object).j2(luaValue, new LuaTable());
        this.U.j2(c0, new LuaTable());
        this.U.j2(d0, LuaValue.K2(Z));
        this.U.j2(b0, new loadlib());
        this.U.j2(e0, new searchpath(this));
        object = new LuaTable();
        LuaValue luaValue3 = new preload_searcher(this);
        this.V = luaValue3;
        ((LuaTable)object).e2(1, luaValue3);
        luaValue3 = new lua_searcher(this);
        this.W = luaValue3;
        ((LuaTable)object).e2(2, luaValue3);
        luaValue3 = new java_searcher(this);
        this.X = luaValue3;
        ((LuaTable)object).e2(3, luaValue3);
        this.U.j2(f0, (LuaValue)object);
        luaValue3 = this.U;
        object = new StringBuilder();
        ((StringBuilder)object).append(h0);
        ((StringBuilder)object).append("\n;\n?\n!\n-\n");
        luaValue3.h2("config", ((StringBuilder)object).toString());
        this.U.U0(luaValue).i2("package", this.U);
        luaValue2.i2("package", this.U);
        this.T.h0 = this;
        return luaValue2;
    }

    @Override
    public String g0() {
        return "package";
    }

    public class java_searcher
    extends VarArgFunction {
        final PackageLib T;

        public java_searcher(PackageLib packageLib) {
            this.T = packageLib;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs invoke(Varargs object) {
            String string2 = PackageLib.a3(((Varargs)object).E(1));
            if (!this.T.Z2(string2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("\n\tjava class '");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append("' not allowed");
            } else {
                try {
                    object = Class.forName(string2, false, PackageLib.class.getClassLoader()).asSubclass(LuaValue.class).newInstance();
                    if (!((LuaValue)object).g1()) return LuaValue.N2((LuaValue)object, this.T.T);
                    ((LuaFunction)object).c1(this.T.T);
                    return LuaValue.N2((LuaValue)object, this.T.T);
                }
                catch (Exception exception) {}
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\n\tjava load failed on '");
                stringBuilder.append(string2);
                stringBuilder.append("', ");
                stringBuilder.append(exception);
                object = stringBuilder.toString();
                return LuaValue.K2((String)object);
                catch (ClassNotFoundException classNotFoundException) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("\n\tno class '");
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append('\'');
                }
            }
            object = ((StringBuilder)object).toString();
            return LuaValue.K2((String)object);
        }
    }

    public static class loadlib
    extends VarArgFunction {
        @Override
        public Varargs invoke(Varargs varargs) {
            varargs.H(1);
            return LuaValue.M2(LuaValue.c, LuaValue.K2("dynamic libraries not enabled"), LuaValue.K2("absent"));
        }
    }

    public class lua_searcher
    extends VarArgFunction {
        final PackageLib T;

        public lua_searcher(PackageLib packageLib) {
            this.T = packageLib;
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            Object object = varargs.H(1);
            varargs = this.T.U.U0(d0);
            if (!((LuaValue)varargs).n1()) {
                return LuaValue.K2("\n\tpackage.path is not a string");
            }
            varargs = this.T.U.U0(e0).invoke(LuaValue.N2((LuaValue)object, varargs));
            if (!varargs.S(1)) {
                return varargs.v(2).B2();
            }
            varargs = varargs.w().q2();
            object = ((LuaString)varargs).g0();
            this.T.T.g0.Y2(null, (String)object, true, null);
            LuaValue luaValue = this.T.T.Q3((String)object);
            if (((Varargs)luaValue).w().g1()) {
                return LuaValue.N2(((Varargs)luaValue).w(), varargs);
            }
            LuaValue luaValue2 = LuaValue.c;
            object = new StringBuilder();
            ((StringBuilder)object).append("'");
            ((StringBuilder)object).append(varargs);
            ((StringBuilder)object).append("': ");
            ((StringBuilder)object).append(((Varargs)luaValue).v(2).g0());
            return LuaValue.N2(luaValue2, LuaValue.K2(((StringBuilder)object).toString()));
        }
    }

    public class preload_searcher
    extends VarArgFunction {
        final PackageLib T;

        public preload_searcher(PackageLib packageLib) {
            this.T = packageLib;
        }

        @Override
        public Varargs invoke(Varargs object) {
            LuaString luaString = ((Varargs)object).H(1);
            LuaValue luaValue = this.T.U.U0(c0).U0(luaString);
            object = luaValue;
            if (luaValue.l1()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("\n\tno field package.preload['");
                ((StringBuilder)object).append(luaString);
                ((StringBuilder)object).append("']");
                object = LuaValue.K2(((StringBuilder)object).toString());
            }
            return object;
        }
    }

    public class require
    extends OneArgFunction {
        final PackageLib T;

        public require(PackageLib packageLib) {
            this.T = packageLib;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public LuaValue call(LuaValue var1_1) {
            var4_2 = var1_1.G0();
            var5_3 = this.T.U.U0(PackageLib.a0);
            var1_1 = var5_3.U0((LuaValue)var4_2);
            if (var1_1.w2()) {
                if (var1_1 != PackageLib.g0) return var1_1;
                var3_5 = new StringBuilder();
                var3_5.append("loop or previous error loading module '");
                var3_5.append(var4_2);
                var3_5.append('\'');
                LuaValue.R0(var3_5.toString());
                return var1_1;
            }
            var1_1 = this.T.U.U0(PackageLib.f0);
            if (!var1_1.o1()) {
                LuaValue.R0("'package.searchers' must be a table");
            }
            var8_7 = var1_1.H0();
            var6_8 = new StringBuffer();
            var2_9 = 1;
            while (true) {
                block12: {
                    var1_1 = var3_6 = null;
                    try {
                        var9_11 = var8_7.c3(var2_9);
                        var1_1 = var3_6;
                        if (!var9_11.l1()) break block12;
                        var1_1 = var3_6;
                        var1_1 = var3_6;
                        var7_10 = new StringBuilder();
                        var1_1 = var3_6;
                        var7_10.append("module '");
                        var1_1 = var3_6;
                        var7_10.append(var4_2);
                        var1_1 = var3_6;
                        var7_10.append("' not found: ");
                        var1_1 = var3_6;
                        var7_10.append(var4_2);
                        var1_1 = var3_6;
                        var7_10.append(var6_8);
                        var1_1 = var3_6;
                        LuaValue.R0(var7_10.toString());
                    }
                    catch (Exception var5_4) {
                        break;
                    }
                }
                var1_1 = var3_6;
                var7_10 = var9_11.invoke((Varargs)var4_2);
                var1_1 = var3_6;
                if (var7_10.P(1)) {
                    var1_1 = var3_6;
                    var6_8 = PackageLib.g0;
                    var1_1 = var3_6;
                    var5_3.j2((LuaValue)var4_2, (LuaValue)var6_8);
                    var1_1 = var3_6;
                    var1_1 = var3_6 = var7_10.v(2);
                    var3_6 = var7_10.w().call((LuaValue)var4_2, (LuaValue)var3_6);
                    if (!var3_6.l1()) {
                        var1_1 = var3_6;
lbl67:
                        // 2 sources

                        while (true) {
                            var5_3.j2((LuaValue)var4_2, (LuaValue)var1_1);
                            return var1_1;
                        }
                    }
                    var1_1 = var3_6 = var5_3.U0((LuaValue)var4_2);
                    if (var3_6 != var6_8) return var1_1;
                    var1_1 = LuaValue.d;
                    ** continue;
                }
                var1_1 = var3_6;
                {
                    if (var7_10.S(1)) {
                        var1_1 = var3_6;
                        var6_8.append(var7_10.h0(1));
                    }
                    ++var2_9;
                    continue;
                }
                break;
            }
            if (var5_4 instanceof d == false) throw var5_4;
            var6_8 = (d)var5_4;
            var3_6 = new StringBuilder();
            var3_6.append("error loading module '");
            var3_6.append(var4_2);
            var3_6.append("'");
            if (var1_1 == null) {
                var1_1 = "";
            } else {
                var4_2 = new StringBuilder();
                var4_2.append(" from file '");
                var4_2.append(var1_1);
                var4_2.append("'");
                var1_1 = var4_2.toString();
            }
            var3_6.append((String)var1_1);
            var3_6.append(":\n");
            var6_8.i = var3_6.toString();
            throw var5_4;
        }
    }

    public class searchpath
    extends VarArgFunction {
        final PackageLib T;

        public searchpath(PackageLib packageLib) {
            this.T = packageLib;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Varargs invoke(Varargs object) {
            Object object2 = ((Varargs)object).E(1);
            String string3 = ((Varargs)object).E(2);
            String string4 = ((Varargs)object).Z(3, ".");
            String string5 = ((Varargs)object).Z(4, h0);
            int n3 = string3.length();
            int n4 = string4.length();
            int n5 = -1;
            StringBuffer stringBuffer = null;
            object = object2;
            int n6 = n5;
            Object object3 = stringBuffer;
            if (n4 > 0) {
                object = ((String)object2).replace(string4, string5);
                object3 = stringBuffer;
                n6 = n5;
            }
            while (n6 < n3) {
                String string2;
                n4 = n6 + 1;
                n6 = n5 = string3.indexOf(59, n4);
                if (n5 < 0) {
                    n6 = string3.length();
                }
                if ((object2 = this.T.T.e0.u(string2 = string3.substring(n4, n6).replace("?", (CharSequence)object))) != null) {
                    try {
                        ((InputStream)object2).close();
                        return LuaValue.K2(string2);
                    }
                    catch (IOException iOException) {
                        return LuaValue.K2(string2);
                    }
                }
                object2 = object3;
                if (object3 == null) {
                    object2 = new StringBuffer();
                }
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("\n\t");
                ((StringBuilder)object3).append(string2);
                ((StringBuffer)object2).append(((StringBuilder)object3).toString());
                object3 = object2;
            }
            return LuaValue.N2(LuaValue.c, LuaValue.K2(((StringBuffer)object3).toString()));
        }
    }
}

