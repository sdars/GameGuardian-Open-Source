package luaj.lib;

import luaj.Globals;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;

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
    public PackageLib$preload_searcher V;
    public PackageLib$lua_searcher W;
    public PackageLib$java_searcher X;
    private volatile String[] Y = new String[0];

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

    private boolean Z2(String str) {
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
        globalsZ0.i2("require", new PackageLib$require(this));
        LuaTable luaTable = new LuaTable();
        this.U = luaTable;
        LuaString luaString = a0;
        luaTable.j2(luaString, new LuaTable());
        this.U.j2(c0, new LuaTable());
        this.U.j2(d0, LuaValue.K2(Z));
        this.U.j2(b0, new PackageLib$loadlib());
        this.U.j2(e0, new PackageLib$searchpath(this));
        LuaValue luaTable2 = new LuaTable();
        PackageLib$preload_searcher packageLib$preload_searcher = new PackageLib$preload_searcher(this);
        this.V = packageLib$preload_searcher;
        luaTable2.e2(1, packageLib$preload_searcher);
        PackageLib$lua_searcher packageLib$lua_searcher = new PackageLib$lua_searcher(this);
        this.W = packageLib$lua_searcher;
        luaTable2.e2(2, packageLib$lua_searcher);
        PackageLib$java_searcher packageLib$java_searcher = new PackageLib$java_searcher(this);
        this.X = packageLib$java_searcher;
        luaTable2.e2(3, packageLib$java_searcher);
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
