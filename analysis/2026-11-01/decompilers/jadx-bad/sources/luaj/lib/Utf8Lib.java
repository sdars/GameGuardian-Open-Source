package luaj.lib;

import java.util.Arrays;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Utf8Lib extends TwoArgFunction {

    static class CodesAux extends VarArgFunction {
        private int T = 0;
        private final LuaString U;

        public CodesAux(LuaString luaString) {
            this.U = luaString;
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            int i = this.T;
            LuaString luaString = this.U;
            int i2 = luaString.Q;
            int i3 = luaString.R + i2;
            if (i >= i3) {
                return LuaValue.f1671c;
            }
            int iY2 = Utf8Lib.Y2(luaString.P, i2 + i, i3);
            int i4 = iY2 >> 28;
            int i5 = iY2 & 268435455;
            if (i4 == 5) {
                throw Utf8Lib.Z2((i5 - this.U.Q) + 1);
            }
            this.T = i4 + i;
            return LuaValue.N2(LuaValue.I2(i + 1), LuaValue.I2(i5));
        }
    }

    static final class _char extends VarArgFunction {
        _char() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            int i;
            int i2;
            int iU = varargs.U();
            if (iU == 0) {
                return LuaValue.L;
            }
            int i3 = iU * 4;
            byte[] bArrCopyOf = new byte[i3];
            int i4 = 0;
            for (int i5 = 1; i5 <= iU; i5++) {
                int iD = varargs.D(i5);
                if (iD < 0 || iD > 1114111) {
                    LuaValue.l0(i5, T2(), "'" + iD + "': value out of range [0; 1114111]");
                }
                if (iD <= 127) {
                    i = 1;
                    i2 = 0;
                } else if (iD <= 2047) {
                    i = 2;
                    i2 = 192;
                } else if (iD <= 65535) {
                    i = 3;
                    i2 = 224;
                } else {
                    i = 4;
                    i2 = 240;
                }
                for (int i6 = i - 1; i6 > 0; i6--) {
                    bArrCopyOf[i4 + i6] = (byte) ((iD & 63) | 128);
                    iD >>= 6;
                }
                bArrCopyOf[i4] = (byte) (iD | i2);
                i4 += i;
            }
            if (i4 < i3) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4);
            }
            return LuaString.p3(bArrCopyOf, 0, i4);
        }
    }

    static final class codepoint extends VarArgFunction {
        codepoint() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaString luaStringH = varargs.H(1);
            int i = luaStringH.R;
            int iC3 = StringLib.c3(varargs.Y(2, 1), i);
            int iC4 = StringLib.c3(varargs.Y(3, iC3), i);
            if (iC3 < 1 || iC3 > i + 1) {
                Utf8Lib.a3(T2(), 2, iC3, i);
            }
            if (iC4 > i) {
                Utf8Lib.X2(T2(), 3, iC4, i);
            }
            if (iC3 > iC4) {
                return LuaValue.f1674f;
            }
            int i2 = (iC4 - iC3) + 1;
            LuaValue[] luaValueArr = new LuaValue[i2];
            byte[] bArr = luaStringH.P;
            int i3 = luaStringH.Q;
            int i4 = luaStringH.R + i3;
            int i5 = iC3 - 1;
            int i6 = 0;
            while (i5 < iC4) {
                int iY2 = Utf8Lib.Y2(bArr, i3 + i5, i4);
                int i7 = iY2 >> 28;
                int i8 = iY2 & 268435455;
                if (i7 == 5) {
                    throw Utf8Lib.Z2((i8 - i3) + 1);
                }
                i5 += i7;
                luaValueArr[i6] = LuaValue.I2(i8);
                i6++;
            }
            if (i6 == 0) {
                return LuaValue.f1674f;
            }
            if (i6 < i2) {
                luaValueArr = (LuaValue[]) Arrays.copyOf(luaValueArr, i6);
            }
            return LuaValue.O2(luaValueArr);
        }
    }

    static final class codes extends VarArgFunction {
        codes() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            return new CodesAux(varargs.H(1));
        }
    }

    static final class len extends VarArgFunction {
        len() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaString luaStringH = varargs.H(1);
            int i = luaStringH.R;
            int iC3 = StringLib.c3(varargs.Y(2, 1), i);
            int iC4 = StringLib.c3(varargs.Y(3, -1), i);
            if (iC3 < 1 || iC3 > i + 1) {
                Utf8Lib.a3(T2(), 2, iC3, i);
            }
            if (iC4 > i) {
                Utf8Lib.X2(T2(), 3, iC4, i);
            }
            if (iC3 > iC4) {
                return LuaValue.f1675g;
            }
            byte[] bArr = luaStringH.P;
            int i2 = luaStringH.Q;
            int i3 = luaStringH.R + i2;
            int i4 = iC3 - 1;
            int i5 = 0;
            while (i4 < iC4) {
                int iY2 = Utf8Lib.Y2(bArr, i2 + i4, i3);
                int i6 = iY2 >> 28;
                if (i6 == 5) {
                    return LuaValue.N2(LuaValue.f1671c, LuaValue.I2(((268435455 & iY2) - i2) + 1));
                }
                i4 += i6;
                i5++;
            }
            return LuaValue.I2(i5);
        }
    }

    static final class offset extends VarArgFunction {
        offset() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaString luaStringH = varargs.H(1);
            int i = luaStringH.R;
            int iD = varargs.D(2);
            int iC3 = StringLib.c3(varargs.Y(3, iD >= 0 ? 1 : i + 1), i);
            if (iC3 < 1 || iC3 > i + 1) {
                Utf8Lib.a3(T2(), 3, iC3, i);
            }
            byte[] bArr = luaStringH.P;
            int i2 = luaStringH.Q;
            int i3 = iC3 - 1;
            if (iD == 0) {
                while (i3 > 0 && i3 < i && (bArr[i2 + i3] & 192) == 128) {
                    i3--;
                }
            } else {
                if (i3 < i) {
                    int i4 = i2 + i3;
                    if ((bArr[i4] & 192) == 128) {
                        throw new luaj.d("initial position (" + i3 + ") is a continuation byte (0x" + Integer.toHexString(bArr[i4] & 255) + ")");
                    }
                }
                if (iD < 0) {
                    while (iD < 0 && i3 > 0) {
                        do {
                            i3--;
                            if (i3 <= 0 || i3 >= i) {
                                break;
                            }
                        } while ((bArr[i2 + i3] & 192) == 128);
                        iD++;
                    }
                } else {
                    while (true) {
                        iD--;
                        if (iD <= 0 || i3 >= i) {
                            break;
                        }
                        do {
                            i3++;
                            if (i3 < 0 || i3 >= i) {
                                break;
                            }
                        } while ((bArr[i2 + i3] & 192) == 128);
                    }
                }
            }
            return iD == 0 ? LuaValue.I2(i3 + 1) : LuaValue.f1671c;
        }
    }

    static void X2(String str, int i, int i2, int i3) {
        LuaValue.l0(i, str, "'" + i2 + "': final position out of string length [" + i3 + "]");
    }

    static int Y2(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = bArr[i] & 255;
        int i5 = 127;
        if (i4 <= 127) {
            i5 = -1;
            i3 = 1;
        } else {
            if (i4 < 192) {
                return i | 1342177280;
            }
            if (i4 < 224) {
                i4 ^= 192;
                i3 = 2;
            } else if (i4 < 240) {
                i4 ^= 224;
                i3 = 3;
                i5 = 2047;
            } else {
                if (i4 >= 248) {
                    return i | 1342177280;
                }
                i4 ^= 240;
                i3 = 4;
                i5 = 65535;
            }
        }
        for (int i6 = 1; i6 < i3; i6++) {
            if (i6 >= i2) {
                return i | 1342177280;
            }
            int i7 = bArr[i + i6];
            if ((i7 & 192) != 128) {
                return i | 1342177280;
            }
            i4 = (i4 << 6) | (i7 & 63);
        }
        return (i4 > 1114111 || i4 <= i5) ? i | 1342177280 : (i3 << 28) | i4;
    }

    static luaj.d Z2(int i) {
        return new luaj.d("invalid UTF-8 code at " + (i + 1) + " byte");
    }

    static void a3(String str, int i, int i2, int i3) {
        LuaValue.l0(i, str, "'" + i2 + "': position out of range [1; " + i3 + "]");
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        LuaTable luaTable = new LuaTable();
        luaTable.i2("char", new _char());
        luaTable.i2("charpattern", LuaString.o3(new byte[]{91, 0, 45, 127, -62, 45, -12, 93, 91, -128, 45, -65, 93, 42}));
        luaTable.i2("codes", new codes());
        luaTable.i2("codepoint", new codepoint());
        luaTable.i2("len", new len());
        luaTable.i2("offset", new offset());
        luaValue2.i2("utf8", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("utf8", luaTable);
        }
        return LuaValue.f1671c;
    }
}
