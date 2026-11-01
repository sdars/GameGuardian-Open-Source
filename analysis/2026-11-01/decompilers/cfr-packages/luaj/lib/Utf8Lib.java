/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import java.util.Arrays;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.d;
import luaj.lib.StringLib;
import luaj.lib.TwoArgFunction;
import luaj.lib.VarArgFunction;

public class Utf8Lib
extends TwoArgFunction {
    static void X2(String string2, int n3, int n4, int n5) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("'");
        stringBuilder.append(n4);
        stringBuilder.append("': final position out of string length [");
        stringBuilder.append(n5);
        stringBuilder.append("]");
        LuaValue.l0(n3, string2, stringBuilder.toString());
    }

    static int Y2(byte[] byArray, int n3, int n4) {
        block12: {
            int n5;
            int n6;
            int n7;
            int n8;
            block9: {
                block11: {
                    block10: {
                        block8: {
                            n8 = byArray[n3] & 0xFF;
                            n7 = 1;
                            n6 = 127;
                            if (n8 > 127) break block8;
                            n6 = -1;
                            n5 = 1;
                            break block9;
                        }
                        if (n8 < 192) {
                            return n3 | 0x50000000;
                        }
                        if (n8 >= 224) break block10;
                        n8 ^= 0xC0;
                        n5 = 2;
                        break block9;
                    }
                    if (n8 >= 240) break block11;
                    n8 ^= 0xE0;
                    n5 = 3;
                    n6 = 2047;
                    break block9;
                }
                if (n8 >= 248) break block12;
                n8 ^= 0xF0;
                n5 = 4;
                n6 = 65535;
            }
            while (n7 < n5) {
                if (n7 >= n4) {
                    return n3 | 0x50000000;
                }
                byte by = byArray[n3 + n7];
                if ((by & 0xC0) != 128) {
                    return n3 | 0x50000000;
                }
                n8 = n8 << 6 | by & 0x3F;
                ++n7;
            }
            if (n8 <= 0x10FFFF && n8 > n6) {
                return n5 << 28 | n8;
            }
            return n3 | 0x50000000;
        }
        return n3 | 0x50000000;
    }

    static d Z2(int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid UTF-8 code at ");
        stringBuilder.append(n3 + 1);
        stringBuilder.append(" byte");
        return new d(stringBuilder.toString());
    }

    static void a3(String string2, int n3, int n4, int n5) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("'");
        stringBuilder.append(n4);
        stringBuilder.append("': position out of range [1; ");
        stringBuilder.append(n5);
        stringBuilder.append("]");
        LuaValue.l0(n3, string2, stringBuilder.toString());
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        luaValue = new LuaTable();
        luaValue.i2("char", new _char());
        luaValue.i2("charpattern", LuaString.o3(new byte[]{91, 0, 45, 127, -62, 45, -12, 93, 91, -128, 45, -65, 93, 42}));
        luaValue.i2("codes", new codes());
        luaValue.i2("codepoint", new codepoint());
        luaValue.i2("len", new len());
        luaValue.i2("offset", new offset());
        luaValue2.i2("utf8", luaValue);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("utf8", luaValue);
        }
        return LuaValue.c;
    }

    static class CodesAux
    extends VarArgFunction {
        private int T;
        private final LuaString U;

        public CodesAux(LuaString luaString) {
            this.U = luaString;
            this.T = 0;
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            int n3 = this.T;
            varargs = this.U;
            int n4 = ((LuaString)varargs).Q;
            int n5 = ((LuaString)varargs).R + n4;
            if (n3 >= n5) {
                return LuaValue.c;
            }
            n5 = Utf8Lib.Y2(((LuaString)varargs).P, n4 + n3, n5);
            n4 = n5 >> 28;
            n5 &= 0xFFFFFFF;
            if (n4 != 5) {
                this.T = n4 + n3;
                return LuaValue.N2(LuaValue.I2(n3 + 1), LuaValue.I2(n5));
            }
            throw Utf8Lib.Z2(n5 - this.U.Q + 1);
        }
    }

    static final class _char
    extends VarArgFunction {
        _char() {
        }

        @Override
        public Varargs invoke(Varargs object) {
            int n3 = ((Varargs)object).U();
            if (n3 == 0) {
                return LuaValue.L;
            }
            int n4 = n3 * 4;
            byte[] byArray = new byte[n4];
            int n5 = 0;
            for (int i3 = 1; i3 <= n3; ++i3) {
                int n6;
                int n7;
                int n8 = ((Varargs)object).D(i3);
                if (n8 < 0 || n8 > 0x10FFFF) {
                    String string2 = this.T2();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("'");
                    stringBuilder.append(n8);
                    stringBuilder.append("': value out of range [0; ");
                    stringBuilder.append(0x10FFFF);
                    stringBuilder.append("]");
                    LuaValue.l0(i3, string2, stringBuilder.toString());
                }
                if (n8 <= 127) {
                    n7 = 1;
                    n6 = 0;
                } else if (n8 <= 2047) {
                    n7 = 2;
                    n6 = 192;
                } else if (n8 <= 65535) {
                    n7 = 3;
                    n6 = 224;
                } else {
                    n7 = 4;
                    n6 = 240;
                }
                for (int i4 = n7 - 1; i4 > 0; --i4) {
                    byArray[n5 + i4] = (byte)(n8 & 0x3F | 0x80);
                    n8 >>= 6;
                }
                byArray[n5] = (byte)(n8 | n6);
                n5 += n7;
            }
            object = byArray;
            if (n5 < n4) {
                object = Arrays.copyOf(byArray, n5);
            }
            return LuaString.p3((byte[])object, 0, n5);
        }
    }

    static final class codepoint
    extends VarArgFunction {
        codepoint() {
        }

        @Override
        public Varargs invoke(Varargs luaValueArray) {
            LuaString luaString = luaValueArray.H(1);
            int n3 = luaString.R;
            int n4 = StringLib.c3(luaValueArray.Y(2, 1), n3);
            int n5 = StringLib.c3(luaValueArray.Y(3, n4), n3);
            if (n4 < 1 || n4 > n3 + 1) {
                Utf8Lib.a3(this.T2(), 2, n4, n3);
            }
            if (n5 > n3) {
                Utf8Lib.X2(this.T2(), 3, n5, n3);
            }
            if (n4 > n5) {
                return LuaValue.f;
            }
            int n6 = n5 - n4 + 1;
            LuaValue[] luaValueArray2 = new LuaValue[n6];
            luaValueArray = (LuaValue[])luaString.P;
            int n7 = luaString.Q;
            int n8 = luaString.R;
            n3 = n4 - 1;
            n4 = 0;
            while (n3 < n5) {
                int n9 = Utf8Lib.Y2((byte[])luaValueArray, n7 + n3, n8 + n7);
                int n10 = n9 >> 28;
                n9 &= 0xFFFFFFF;
                if (n10 != 5) {
                    n3 += n10;
                    luaValueArray2[n4] = LuaValue.I2(n9);
                    ++n4;
                    continue;
                }
                throw Utf8Lib.Z2(n9 - n7 + 1);
            }
            if (n4 == 0) {
                return LuaValue.f;
            }
            luaValueArray = luaValueArray2;
            if (n4 < n6) {
                luaValueArray = Arrays.copyOf(luaValueArray2, n4);
            }
            return LuaValue.O2(luaValueArray);
        }
    }

    static final class codes
    extends VarArgFunction {
        codes() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            return new CodesAux(varargs.H(1));
        }
    }

    static final class len
    extends VarArgFunction {
        len() {
        }

        @Override
        public Varargs invoke(Varargs object) {
            LuaString luaString = ((Varargs)object).H(1);
            int n3 = luaString.R;
            int n4 = StringLib.c3(((Varargs)object).Y(2, 1), n3);
            int n5 = StringLib.c3(((Varargs)object).Y(3, -1), n3);
            if (n4 < 1 || n4 > n3 + 1) {
                Utf8Lib.a3(this.T2(), 2, n4, n3);
            }
            if (n5 > n3) {
                Utf8Lib.X2(this.T2(), 3, n5, n3);
            }
            if (n4 > n5) {
                return LuaValue.g;
            }
            object = luaString.P;
            int n6 = luaString.Q;
            int n7 = luaString.R;
            n3 = n4 - 1;
            n4 = 0;
            while (n3 < n5) {
                int n8 = Utf8Lib.Y2((byte[])object, n6 + n3, n7 + n6);
                int n9 = n8 >> 28;
                if (n9 == 5) {
                    return LuaValue.N2(LuaValue.c, LuaValue.I2((0xFFFFFFF & n8) - n6 + 1));
                }
                n3 += n9;
                ++n4;
            }
            return LuaValue.I2(n4);
        }
    }

    static final class offset
    extends VarArgFunction {
        offset() {
        }

        @Override
        public Varargs invoke(Varargs object) {
            int n3;
            Object object2 = ((Varargs)object).H(1);
            int n4 = ((LuaString)object2).R;
            int n5 = ((Varargs)object).D(2);
            int n6 = n5 >= 0 ? 1 : n4 + 1;
            if ((n6 = StringLib.c3(((Varargs)object).Y(3, n6), n4)) < 1 || n6 > n4 + 1) {
                Utf8Lib.a3(this.T2(), 3, n6, n4);
            }
            object = ((LuaString)object2).P;
            int n7 = ((LuaString)object2).Q;
            int n8 = n6 - 1;
            if (n5 == 0) {
                n6 = n8;
                while (true) {
                    n3 = n5;
                    n8 = n6;
                    if (n6 > 0) {
                        n3 = n5;
                        n8 = n6;
                        if (n6 < n4) {
                            n3 = n5;
                            n8 = n6;
                            if ((object[n7 + n6] & 0xC0) == 128) {
                                --n6;
                                continue;
                            }
                        }
                    }
                    break;
                }
            } else {
                if (n8 < n4 && (object[n6 = n7 + n8] & 0xC0) == 128) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("initial position (");
                    ((StringBuilder)object2).append(n8);
                    ((StringBuilder)object2).append(") is a continuation byte (0x");
                    ((StringBuilder)object2).append(Integer.toHexString(object[n6] & 0xFF));
                    ((StringBuilder)object2).append(")");
                    throw new d(((StringBuilder)object2).toString());
                }
                n3 = n5;
                n6 = n8;
                if (n5 < 0) {
                    n6 = n8;
                    while (true) {
                        n3 = n5;
                        n8 = n6;
                        if (n5 < 0) {
                            n3 = n5;
                            n8 = n6;
                            if (n6 > 0) {
                                n8 = n6;
                                while ((n6 = n8 - 1) > 0 && n6 < n4) {
                                    n8 = n6;
                                    if ((object[n7 + n6] & 0xC0) == 128) continue;
                                }
                                ++n5;
                                continue;
                            }
                        }
                        break;
                    }
                } else {
                    block3: while (true) {
                        n3 = n5 = n3 - 1;
                        n8 = n6;
                        if (n5 <= 0) break;
                        n3 = n5;
                        n8 = n6;
                        if (n6 >= n4) break;
                        do {
                            n8 = n6 + 1;
                            n3 = n5;
                            n6 = n8;
                            if (n8 < 0) continue block3;
                            n3 = n5;
                            n6 = n8;
                            if (n8 >= n4) continue block3;
                            n6 = n8;
                        } while ((object[n7 + n8] & 0xC0) == 128);
                        n3 = n5;
                        n6 = n8;
                    }
                }
            }
            object = n3 == 0 ? LuaValue.I2(n8 + 1) : LuaValue.c;
            return object;
        }
    }
}

