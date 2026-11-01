package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class TableLib$sort extends VarArgFunction {
    TableLib$sort() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        varargs.I(1).D3(varargs.Q(2) ? LuaValue.f1673c : varargs.C(2));
        return LuaValue.f1676f;
    }
}
