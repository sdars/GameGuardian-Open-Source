package luaj.lib;

import java.util.Random;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
class MathLib$randomseed extends OneArgFunction {
    final MathLib$random T;

    MathLib$randomseed(MathLib$random mathLib$random) {
        this.T = mathLib$random;
    }

    @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        long jY2 = MathLib.Y2(this, 1, luaValue);
        this.T.T = new Random(jY2);
        return LuaValue.f1676f;
    }
}
