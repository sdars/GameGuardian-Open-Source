package luaj.lib;

import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class StringLib$GMatchAux extends VarArgFunction {
    private final int T;
    private final StringLib$b U;
    private int V = 0;
    private int W = -1;

    public StringLib$GMatchAux(Varargs varargs, LuaString luaString, LuaString luaString2) {
        this.T = luaString.s1();
        this.U = new StringLib$b(varargs, luaString, luaString2);
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        while (this.V <= this.T) {
            this.U.p();
            int iG = this.U.g(this.V, 0);
            if (iG >= 0 && iG != this.W) {
                int i = this.V;
                this.V = iG;
                this.W = iG;
                return this.U.n(true, i, iG);
            }
            this.V++;
        }
        return LuaValue.f1673c;
    }
}
