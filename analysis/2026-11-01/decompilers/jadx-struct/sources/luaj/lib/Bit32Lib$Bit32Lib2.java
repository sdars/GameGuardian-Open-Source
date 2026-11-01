package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class Bit32Lib$Bit32Lib2 extends TwoArgFunction {
    Bit32Lib$Bit32Lib2() {
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        int i = this.R;
        if (i == 0) {
            return Bit32Lib.X2((int) luaValue.C0(), (int) luaValue2.C0());
        }
        if (i == 1) {
            return Bit32Lib.f3((int) luaValue.C0(), (int) luaValue2.C0());
        }
        if (i == 2) {
            return Bit32Lib.g3((int) luaValue.C0(), (int) luaValue2.C0());
        }
        if (i != 3) {
            return i != 4 ? LuaValue.f1673c : Bit32Lib.j3((int) luaValue.C0(), (int) luaValue2.C0());
        }
        return Bit32Lib.i3((int) luaValue.C0(), (int) luaValue2.C0());
    }
}
