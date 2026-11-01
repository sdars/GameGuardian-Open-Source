package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class PackageLib$loadlib extends VarArgFunction {
    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        varargs.H(1);
        return LuaValue.M2(LuaValue.f1673c, LuaValue.K2("dynamic libraries not enabled"), LuaValue.K2("absent"));
    }
}
