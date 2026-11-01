package luaj.lib;

import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class PackageLib$require extends OneArgFunction {
    final /* synthetic */ PackageLib T;

    public PackageLib$require(PackageLib packageLib) {
        this.T = packageLib;
    }

    @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) throws Exception {
        LuaValue luaValueV;
        String str;
        Varargs varargsInvoke;
        LuaString luaStringG0 = luaValue.G0();
        LuaValue luaValueU0 = this.T.U.U0(PackageLib.a0);
        LuaValue luaValueU1 = luaValueU0.U0(luaStringG0);
        if (luaValueU1.w2()) {
            if (luaValueU1 == PackageLib.g0) {
                LuaValue.R0("loop or previous error loading module '" + luaStringG0 + '\'');
            }
            return luaValueU1;
        }
        LuaValue luaValueU2 = this.T.U.U0(PackageLib.f0);
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
