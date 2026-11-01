package luaj.lib;

import java.util.Random;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
class MathLib$random extends LibFunction {
    Random T = new Random();

    MathLib$random() {
    }

    private long X2() {
        long jNextLong = this.T.nextLong();
        return jNextLong < 0 ? jNextLong - Long.MIN_VALUE : jNextLong;
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call() {
        return LuaValue.J2(this.T.nextDouble());
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        long jC0 = luaValue.C0();
        if (jC0 < 1) {
            LuaValue.k0(1, "interval is empty");
        }
        return LuaValue.I2((X2() % jC0) + 1);
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        long jC0 = luaValue.C0();
        long jC1 = luaValue2.C0();
        if (jC1 < jC0) {
            LuaValue.k0(2, "interval is empty");
        }
        long j = jC1 - jC0;
        if (j < 0) {
            LuaValue.k0(2, "interval too large");
        }
        long jX2 = X2();
        if (j != Long.MAX_VALUE) {
            jX2 %= j + 1;
        }
        return LuaValue.I2(jC0 + jX2);
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return LuaValue.k0(3, "too many arguments");
    }
}
