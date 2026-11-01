package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
public class Bit32Lib extends luaj.lib.TwoArgFunction {

    static final class Bit32Lib2 extends luaj.lib.TwoArgFunction {
        Bit32Lib2() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            int i = this.R;
            if (i == 0) {
                return luaj.lib.Bit32Lib.X2((int) luaValue.C0(), (int) luaValue2.C0());
            }
            if (i == 1) {
                return luaj.lib.Bit32Lib.f3((int) luaValue.C0(), (int) luaValue2.C0());
            }
            if (i == 2) {
                return luaj.lib.Bit32Lib.g3((int) luaValue.C0(), (int) luaValue2.C0());
            }
            if (i != 3) {
                return i != 4 ? luaj.LuaValue.f1673c : luaj.lib.Bit32Lib.j3((int) luaValue.C0(), (int) luaValue2.C0());
            }
            return luaj.lib.Bit32Lib.i3((int) luaValue.C0(), (int) luaValue2.C0());
        }
    }

    static final class Bit32LibV extends luaj.lib.VarArgFunction {
        Bit32LibV() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            switch (this.R) {
                case 0:
                    return luaj.lib.Bit32Lib.Y2(varargs);
                case 1:
                    return luaj.lib.Bit32Lib.a3(varargs);
                case 2:
                    return luaj.lib.Bit32Lib.b3(varargs);
                case 3:
                    return luaj.lib.Bit32Lib.c3(varargs);
                case 4:
                    return luaj.lib.Bit32Lib.d3(varargs);
                case 5:
                    return luaj.lib.Bit32Lib.e3((int) varargs.F(1), (int) varargs.F(2), (int) varargs.a0(3, 1L));
                case 6:
                    return luaj.lib.Bit32Lib.h3((int) varargs.F(1), (int) varargs.F(2), (int) varargs.F(3), (int) varargs.a0(4, 1L));
                default:
                    return luaj.LuaValue.f1673c;
            }
        }
    }

    class a implements luaj.lib.LibFunction.a {
        a() {
        }

        @Override // luaj.lib.LibFunction.a
        public luaj.lib.LibFunction a() {
            return new luaj.lib.Bit32Lib.Bit32LibV();
        }
    }

    class b implements luaj.lib.LibFunction.a {
        b() {
        }

        @Override // luaj.lib.LibFunction.a
        public luaj.lib.LibFunction a() {
            return new luaj.lib.Bit32Lib.Bit32Lib2();
        }
    }

    static luaj.LuaValue X2(int i, int i2) {
        return Z2(i2 >= 0 ? i >> i2 : i << (-i2));
    }

    static luaj.Varargs Y2(luaj.Varargs varargs) {
        int iF = -1;
        for (int i = 1; i <= varargs.U(); i++) {
            iF &= (int) varargs.F(i);
        }
        return Z2(iF);
    }

    private static luaj.LuaValue Z2(int i) {
        long j = i;
        if (i < 0) {
            j &= 4294967295L;
        }
        return luaj.LuaValue.I2(j);
    }

    static luaj.Varargs a3(luaj.Varargs varargs) {
        return Z2(~((int) varargs.F(1)));
    }

    static luaj.Varargs b3(luaj.Varargs varargs) {
        int iF = 0;
        for (int i = 1; i <= varargs.U(); i++) {
            iF |= (int) varargs.F(i);
        }
        return Z2(iF);
    }

    static luaj.Varargs c3(luaj.Varargs varargs) {
        int iF = -1;
        for (int i = 1; i <= varargs.U(); i++) {
            iF &= (int) varargs.F(i);
        }
        return luaj.LuaValue.H2(iF != 0);
    }

    static luaj.Varargs d3(luaj.Varargs varargs) {
        int iF = 0;
        for (int i = 1; i <= varargs.U(); i++) {
            iF ^= (int) varargs.F(i);
        }
        return Z2(iF);
    }

    static luaj.LuaValue e3(int i, int i2, int i3) {
        if (i2 < 0) {
            luaj.LuaValue.k0(2, "field cannot be negative");
        }
        if (i3 < 0) {
            luaj.LuaValue.k0(3, "width must be postive");
        }
        if (i2 + i3 > 32) {
            luaj.LuaValue.R0("trying to access non-existent bits");
        }
        return Z2((i >>> i2) & ((-1) >>> (32 - i3)));
    }

    static luaj.LuaValue f3(int i, int i2) {
        if (i2 < 0) {
            return i3(i, -i2);
        }
        int i3 = i2 & 31;
        return Z2((i >>> (32 - i3)) | (i << i3));
    }

    static luaj.LuaValue g3(int i, int i2) {
        if (i2 >= 32 || i2 <= -32) {
            return luaj.LuaValue.f1677g;
        }
        return Z2(i2 >= 0 ? i << i2 : i >>> (-i2));
    }

    static luaj.LuaValue h3(int i, int i2, int i3, int i4) {
        if (i3 < 0) {
            luaj.LuaValue.k0(3, "field cannot be negative");
        }
        if (i4 < 0) {
            luaj.LuaValue.k0(4, "width must be postive");
        }
        if (i3 + i4 > 32) {
            luaj.LuaValue.R0("trying to access non-existent bits");
        }
        int i5 = ((-1) >>> (32 - i4)) << i3;
        return Z2((i & (~i5)) | ((i2 << i3) & i5));
    }

    static luaj.LuaValue i3(int i, int i2) {
        if (i2 < 0) {
            return f3(i, -i2);
        }
        int i3 = i2 & 31;
        return Z2((i << (32 - i3)) | (i >>> i3));
    }

    static luaj.LuaValue j3(int i, int i2) {
        if (i2 >= 32 || i2 <= -32) {
            return luaj.LuaValue.f1677g;
        }
        return Z2(i2 >= 0 ? i >>> i2 : i << (-i2));
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        luaj.LuaTable luaTable = new luaj.LuaTable();
        V2(luaTable, new luaj.lib.Bit32Lib.a(), new java.lang.String[]{"band", "bnot", "bor", "btest", "bxor", "extract", "replace"});
        V2(luaTable, new luaj.lib.Bit32Lib.b(), new java.lang.String[]{"arshift", "lrotate", "lshift", "rrotate", "rshift"});
        luaValue2.i2("bit32", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("bit32", luaTable);
        }
        return luaTable;
    }
}
