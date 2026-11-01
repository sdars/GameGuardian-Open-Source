package luaj.lib;

import luaj.LuaFunction;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class PackageLib$java_searcher extends VarArgFunction {
    final /* synthetic */ PackageLib T;

    public PackageLib$java_searcher(PackageLib packageLib) {
        this.T = packageLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        String string;
        StringBuilder sb;
        String strA3 = PackageLib.a3(varargs.E(1));
        if (this.T.Z2(strA3)) {
            try {
                LuaValue luaValue = (LuaValue) Class.forName(strA3, false, PackageLib.class.getClassLoader()).asSubclass(LuaValue.class).newInstance();
                if (luaValue.g1()) {
                    ((LuaFunction) luaValue).c1(this.T.T);
                }
                return LuaValue.N2(luaValue, this.T.T);
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
