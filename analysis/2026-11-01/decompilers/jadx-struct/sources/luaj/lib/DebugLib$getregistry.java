package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$getregistry extends ZeroArgFunction {
    final /* synthetic */ DebugLib T;

    DebugLib$getregistry(DebugLib debugLib) {
        this.T = debugLib;
    }

    @Override // luaj.lib.ZeroArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call() {
        return this.T.T;
    }
}
