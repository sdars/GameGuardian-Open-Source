package luaj.lib;

import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class Bit32Lib extends TwoArgFunction {

    static final class Bit32Lib2 extends TwoArgFunction {
        Bit32Lib2() {
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

    static final class Bit32LibV extends VarArgFunction {
        Bit32LibV() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            switch (this.R) {
                case 0:
                    return Bit32Lib.Y2(varargs);
                case 1:
                    return Bit32Lib.a3(varargs);
                case 2:
                    return Bit32Lib.b3(varargs);
                case 3:
                    return Bit32Lib.c3(varargs);
                case 4:
                    return Bit32Lib.d3(varargs);
                case 5:
                    return Bit32Lib.e3((int) varargs.F(1), (int) varargs.F(2), (int) varargs.a0(3, 1L));
                case 6:
                    return Bit32Lib.h3((int) varargs.F(1), (int) varargs.F(2), (int) varargs.F(3), (int) varargs.a0(4, 1L));
                default:
                    return LuaValue.f1673c;
            }
        }
    }

    class a implements LibFunction.a {
        a() {
        }

        @Override // luaj.lib.LibFunction.a
        public LibFunction a() {
            return new Bit32LibV();
        }
    }

    class b implements LibFunction.a {
        b() {
        }

        @Override // luaj.lib.LibFunction.a
        public LibFunction a() {
            return new Bit32Lib2();
        }
    }

    static LuaValue X2(int i, int i2) {
        return Z2(i2 >= 0 ? i >> i2 : i << (-i2));
    }

    static Varargs Y2(Varargs varargs) {
        int iF = -1;
        for (int i = 1; i <= varargs.U(); i++) {
            iF &= (int) varargs.F(i);
        }
        return Z2(iF);
    }

    private static LuaValue Z2(int i) {
        long j = i;
        if (i < 0) {
            j &= 4294967295L;
        }
        return LuaValue.I2(j);
    }

    static Varargs a3(Varargs varargs) {
        return Z2(~((int) varargs.F(1)));
    }

    static Varargs b3(Varargs varargs) {
        int iF = 0;
        for (int i = 1; i <= varargs.U(); i++) {
            iF |= (int) varargs.F(i);
        }
        return Z2(iF);
    }

    static Varargs c3(Varargs varargs) {
        int iF = -1;
        for (int i = 1; i <= varargs.U(); i++) {
            iF &= (int) varargs.F(i);
        }
        return LuaValue.H2(iF != 0);
    }

    static Varargs d3(Varargs varargs) {
        int iF = 0;
        for (int i = 1; i <= varargs.U(); i++) {
            iF ^= (int) varargs.F(i);
        }
        return Z2(iF);
    }

    static LuaValue e3(int i, int i2, int i3) {
        if (i2 < 0) {
            LuaValue.k0(2, "field cannot be negative");
        }
        if (i3 < 0) {
            LuaValue.k0(3, "width must be postive");
        }
        if (i2 + i3 > 32) {
            LuaValue.R0("trying to access non-existent bits");
        }
        return Z2((i >>> i2) & ((-1) >>> (32 - i3)));
    }

    static LuaValue f3(int i, int i2) {
        if (i2 < 0) {
            return i3(i, -i2);
        }
        int i3 = i2 & 31;
        return Z2((i >>> (32 - i3)) | (i << i3));
    }

    static LuaValue g3(int i, int i2) {
        if (i2 >= 32 || i2 <= -32) {
            return LuaValue.f1677g;
        }
        return Z2(i2 >= 0 ? i << i2 : i >>> (-i2));
    }

    static LuaValue h3(int i, int i2, int i3, int i4) {
        if (i3 < 0) {
            LuaValue.k0(3, "field cannot be negative");
        }
        if (i4 < 0) {
            LuaValue.k0(4, "width must be postive");
        }
        if (i3 + i4 > 32) {
            LuaValue.R0("trying to access non-existent bits");
        }
        int i5 = ((-1) >>> (32 - i4)) << i3;
        return Z2((i & (~i5)) | ((i2 << i3) & i5));
    }

    static LuaValue i3(int i, int i2) {
        if (i2 < 0) {
            return f3(i, -i2);
        }
        int i3 = i2 & 31;
        return Z2((i << (32 - i3)) | (i >>> i3));
    }

    static LuaValue j3(int i, int i2) {
        if (i2 >= 32 || i2 <= -32) {
            return LuaValue.f1677g;
        }
        return Z2(i2 >= 0 ? i >>> i2 : i << (-i2));
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        LuaTable luaTable = new LuaTable();
        V2(luaTable, new a(), new String[]{"band", "bnot", "bor", "btest", "bxor", "extract", "replace"});
        V2(luaTable, new b(), new String[]{"arshift", "lrotate", "lshift", "rrotate", "rshift"});
        luaValue2.i2("bit32", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("bit32", luaTable);
        }
        return luaTable;
    }
}
