/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.LibFunction;
import luaj.lib.TwoArgFunction;
import luaj.lib.VarArgFunction;

public class Bit32Lib
extends TwoArgFunction {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static LuaValue X2(int n3, int n4) {
        if (n4 >= 0) {
            n3 >>= n4;
            return Bit32Lib.Z2(n3);
        }
        n3 <<= -n4;
        return Bit32Lib.Z2(n3);
    }

    static Varargs Y2(Varargs varargs) {
        int n3 = -1;
        for (int i3 = 1; i3 <= varargs.U(); ++i3) {
            n3 &= (int)varargs.F(i3);
        }
        return Bit32Lib.Z2(n3);
    }

    private static LuaValue Z2(int n3) {
        long l3;
        long l4 = l3 = (long)n3;
        if (n3 < 0) {
            l4 = l3 & 0xFFFFFFFFL;
        }
        return LuaValue.I2(l4);
    }

    static Varargs a3(Varargs varargs) {
        return Bit32Lib.Z2(~((int)varargs.F(1)));
    }

    static Varargs b3(Varargs varargs) {
        int n3 = 0;
        for (int i3 = 1; i3 <= varargs.U(); ++i3) {
            n3 |= (int)varargs.F(i3);
        }
        return Bit32Lib.Z2(n3);
    }

    static Varargs c3(Varargs varargs) {
        int n3 = -1;
        boolean bl = true;
        for (int i3 = 1; i3 <= varargs.U(); ++i3) {
            n3 &= (int)varargs.F(i3);
        }
        if (n3 == 0) {
            bl = false;
        }
        return LuaValue.H2(bl);
    }

    static Varargs d3(Varargs varargs) {
        int n3 = 0;
        for (int i3 = 1; i3 <= varargs.U(); ++i3) {
            n3 ^= (int)varargs.F(i3);
        }
        return Bit32Lib.Z2(n3);
    }

    static LuaValue e3(int n3, int n4, int n5) {
        if (n4 < 0) {
            LuaValue.k0(2, "field cannot be negative");
        }
        if (n5 < 0) {
            LuaValue.k0(3, "width must be postive");
        }
        if (n4 + n5 > 32) {
            LuaValue.R0("trying to access non-existent bits");
        }
        return Bit32Lib.Z2(n3 >>> n4 & -1 >>> 32 - n5);
    }

    static LuaValue f3(int n3, int n4) {
        if (n4 < 0) {
            return Bit32Lib.i3(n3, -n4);
        }
        return Bit32Lib.Z2(n3 >>> 32 - (n4 &= 0x1F) | n3 << n4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static LuaValue g3(int n3, int n4) {
        if (n4 >= 32 || n4 <= -32) return LuaValue.g;
        if (n4 >= 0) {
            n3 <<= n4;
            return Bit32Lib.Z2(n3);
        }
        n3 >>>= -n4;
        return Bit32Lib.Z2(n3);
    }

    static LuaValue h3(int n3, int n4, int n5, int n6) {
        if (n5 < 0) {
            LuaValue.k0(3, "field cannot be negative");
        }
        if (n6 < 0) {
            LuaValue.k0(4, "width must be postive");
        }
        if (n5 + n6 > 32) {
            LuaValue.R0("trying to access non-existent bits");
        }
        n6 = -1 >>> 32 - n6 << n5;
        return Bit32Lib.Z2(n3 & ~n6 | n4 << n5 & n6);
    }

    static LuaValue i3(int n3, int n4) {
        if (n4 < 0) {
            return Bit32Lib.f3(n3, -n4);
        }
        return Bit32Lib.Z2(n3 << 32 - (n4 &= 0x1F) | n3 >>> n4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static LuaValue j3(int n3, int n4) {
        if (n4 >= 32 || n4 <= -32) return LuaValue.g;
        if (n4 >= 0) {
            n3 >>>= n4;
            return Bit32Lib.Z2(n3);
        }
        n3 <<= -n4;
        return Bit32Lib.Z2(n3);
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        luaValue = new LuaTable();
        this.V2(luaValue, new LibFunction.a(this){
            final Bit32Lib a;
            {
                this.a = bit32Lib;
            }

            @Override
            public LibFunction a() {
                return new Bit32LibV();
            }
        }, new String[]{"band", "bnot", "bor", "btest", "bxor", "extract", "replace"});
        this.V2(luaValue, new LibFunction.a(this){
            final Bit32Lib a;
            {
                this.a = bit32Lib;
            }

            @Override
            public LibFunction a() {
                return new Bit32Lib2();
            }
        }, new String[]{"arshift", "lrotate", "lshift", "rrotate", "rshift"});
        luaValue2.i2("bit32", luaValue);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("bit32", luaValue);
        }
        return luaValue;
    }

    static final class Bit32Lib2
    extends TwoArgFunction {
        Bit32Lib2() {
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            int n3 = this.R;
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) {
                                return LuaValue.c;
                            }
                            return Bit32Lib.j3((int)luaValue.C0(), (int)luaValue2.C0());
                        }
                        return Bit32Lib.i3((int)luaValue.C0(), (int)luaValue2.C0());
                    }
                    return Bit32Lib.g3((int)luaValue.C0(), (int)luaValue2.C0());
                }
                return Bit32Lib.f3((int)luaValue.C0(), (int)luaValue2.C0());
            }
            return Bit32Lib.X2((int)luaValue.C0(), (int)luaValue2.C0());
        }
    }

    static final class Bit32LibV
    extends VarArgFunction {
        Bit32LibV() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            switch (this.R) {
                default: {
                    return LuaValue.c;
                }
                case 6: {
                    return Bit32Lib.h3((int)varargs.F(1), (int)varargs.F(2), (int)varargs.F(3), (int)varargs.a0(4, 1L));
                }
                case 5: {
                    return Bit32Lib.e3((int)varargs.F(1), (int)varargs.F(2), (int)varargs.a0(3, 1L));
                }
                case 4: {
                    return Bit32Lib.d3(varargs);
                }
                case 3: {
                    return Bit32Lib.c3(varargs);
                }
                case 2: {
                    return Bit32Lib.b3(varargs);
                }
                case 1: {
                    return Bit32Lib.a3(varargs);
                }
                case 0: 
            }
            return Bit32Lib.Y2(varargs);
        }
    }
}

