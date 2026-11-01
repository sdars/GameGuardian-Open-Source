/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import android.ext.MainService;
import android.ext.e1;
import android.ext.t2;
import android.ext.z1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Locale;
import luaj.LuaClosure;
import luaj.LuaDouble;
import luaj.LuaFunction;
import luaj.LuaLong;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.d;
import luaj.lib.OneArgFunction;
import luaj.lib.TwoArgFunction;
import luaj.lib.VarArgFunction;

public class StringLib
extends TwoArgFunction {
    private static final LuaString T;
    static final byte[] U;

    static {
        byte[] byArray;
        T = LuaValue.K2("^$*+?.([%-");
        U = new byte[256];
        for (int i3 = 0; i3 < 128; ++i3) {
            byte by;
            char c4 = (char)i3;
            byArray = U;
            int n3 = Character.isDigit(c4) ? 8 : 0;
            int n4 = Character.isLowerCase(c4) ? 2 : 0;
            int n5 = Character.isUpperCase(c4) ? 4 : 0;
            int n6 = c4 >= ' ' && c4 != '' ? 0 : 64;
            byArray[i3] = by = (byte)(n6 | (n3 | n4 | n5));
            if (c4 >= 'a' && c4 <= 'f' || c4 >= 'A' && c4 <= 'F' || c4 >= '0' && c4 <= '9') {
                byArray[i3] = (byte)(by | 0xFFFFFF80);
            }
            if (c4 >= '!' && c4 <= '/' || c4 >= ':' && c4 <= '@' || c4 >= '[' && c4 <= '`' || c4 >= '{' && c4 <= '~') {
                byArray[i3] = (byte)(byArray[i3] | 0x10);
            }
            if (((n3 = byArray[i3]) & 6) == 0) continue;
            byArray[i3] = (byte)(n3 | 1);
        }
        byArray = U;
        byArray[32] = 32;
        byArray[13] = (byte)(byArray[13] | 0x20);
        byArray[10] = (byte)(byArray[10] | 0x20);
        byArray[9] = (byte)(byArray[9] | 0x20);
        byArray[11] = (byte)(byArray[11] | 0x20);
        byArray[12] = (byte)(byArray[12] | 0x20);
    }

    /*
     * Enabled aggressive block sorting
     */
    static void X2(f.a a4, LuaString luaString) {
        a4.a((byte)34);
        int n3 = luaString.s1();
        int n4 = 0;
        while (true) {
            block6: {
                int n5;
                block4: {
                    int n6;
                    block2: {
                        block5: {
                            block3: {
                                if (n4 >= n3) {
                                    a4.a((byte)34);
                                    return;
                                }
                                n6 = luaString.g3(n4);
                                if (n6 == 10 || n6 == 34 || n6 == 92) break block2;
                                if (n6 <= 31) break block3;
                                n5 = n6;
                                if (n6 != 127) break block4;
                            }
                            a4.a((byte)92);
                            n5 = n4 + 1;
                            if (n5 == n3 || luaString.g3(n5) < 48 || luaString.g3(n5) > 57) break block5;
                            a4.a((byte)48);
                            a4.a((byte)(n6 / 10 + 48));
                            n5 = (char)(n6 % 10 + 48);
                            break block4;
                        }
                        a4.b(Integer.toString(n6));
                        break block6;
                    }
                    a4.a((byte)92);
                    n5 = n6;
                }
                a4.a((byte)n5);
            }
            ++n4;
        }
    }

    static byte Y2(c c4, int n3) {
        int n4;
        int n5;
        byte by;
        block8: {
            block10: {
                block9: {
                    by = StringLib.a3(c4);
                    n4 = n5 = c4.g;
                    if (by != 8) break block8;
                    if (c4.d.length() <= c4.e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("no next option for option 'X' at pos ");
                        stringBuilder.append(c4.e);
                        LuaValue.k0(1, stringBuilder.toString());
                    }
                    n4 = n5;
                    if (StringLib.a3(c4) == 4) break block9;
                    n4 = n5 = c4.g;
                    if (n5 != 0) break block10;
                    n4 = n5;
                }
                LuaValue.k0(1, t2.f("invalid next option '%c' for option 'X' at pos %d", Character.valueOf(c4.f), c4.e));
            }
            c4.i = 0;
        }
        if (n4 > 1 && by != 4) {
            int n6 = c4.c;
            n5 = n4;
            if (n4 > n6) {
                c4.g = n6;
                n5 = n6;
            }
            if ((n5 & (n4 = n5 - 1)) != 0) {
                LuaValue.k0(1, t2.f("format option '%c' asks for alignment not power of 2 at pos %d", Character.valueOf(c4.f), c4.e));
            }
            c4.h = n5 - (n3 & n4) & n4;
        } else {
            c4.h = 0;
        }
        return by;
    }

    static int Z2(c c4, int n3, boolean bl) {
        String string2 = c4.d;
        int n4 = string2.length();
        int n5 = c4.e;
        int n6 = n3;
        if (n5 < n4) {
            char c5 = string2.charAt(n5);
            n6 = n3;
            if (c5 <= '9') {
                n6 = n3;
                if (c5 >= '0') {
                    int n7;
                    n3 = 0;
                    do {
                        n6 = n3 * 10 + (c5 - 48);
                        n7 = n5 + 1;
                        if (n7 >= n4 || (c5 = string2.charAt(n7)) > '9' || c5 < '0') break;
                        n5 = n7;
                        n3 = n6;
                    } while (n6 <= 0xCCCCCCB);
                    c4.e = n7;
                }
            }
        }
        if (bl && (n6 > 8 || n6 <= 0)) {
            LuaValue.R0(t2.f("integral size (%d) out of limits [1,%d] at pos %d", n6, 8, c4.e));
        }
        return n6;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static byte a3(c var0) {
        var10_1 = var0.d;
        var2_3 = var0.e;
        var0.e = var2_3 + 1;
        var0.f = var1_4 = var10_1.charAt(var2_3);
        var9_5 = 2;
        var2_3 = 4;
        var5_6 = 1;
        var3_7 = 1;
        var6_8 = 1;
        var4_9 = 1;
        var7_10 = 1;
        var8_11 = 0;
        switch (var1_4) {
            default: {
                var3_7 = var8_11;
                LuaValue.R0(t2.f("invalid format option '%c' at pos %d", new Object[]{Character.valueOf(var1_4), var0.e}));
                break;
            }
            case 'z': {
                var0.i = 0;
                var2_3 = var1_4 == 'c' ? var7_10 : 0;
                var0.g = var2_3;
                return 6;
            }
            case 'x': {
                var0.i = 1;
                var0.g = 1;
                return 7;
            }
            case 's': {
                var3_7 = var8_11;
                var0.i = var4_9 = StringLib.Z2(var0, var0.a, true);
                if (var1_4 == 'c') {
                    var2_3 = 1;
                } else if (var4_9 < 8) {
                    var2_3 = var4_9;
                }
                var0.g = var2_3;
                return 5;
            }
            case 'n': {
                var0.i = 9;
                if (var1_4 == 'c') {
                    var2_3 = 1;
                }
                var0.g = var2_3;
                return 10;
            }
            case 'l': {
                var0.i = 8;
                if (var1_4 == 'c') {
                    var2_3 = 1;
                }
                var0.g = var2_3;
                return 1;
            }
            case 'j': {
                var0.i = 8;
                if (var1_4 == 'c') {
                    var2_3 = 1;
                }
                var0.g = var2_3;
                return 1;
            }
            case 'i': {
                var3_7 = var8_11;
                var0.i = var4_9 = StringLib.Z2(var0, 4, true);
                if (var1_4 == 'c') {
                    var2_3 = 1;
                } else if (var4_9 < 8) {
                    var2_3 = var4_9;
                }
                var0.g = var2_3;
                return 1;
            }
            case 'h': {
                var0.i = 2;
                var2_3 = var9_5;
                if (var1_4 == 'c') {
                    var2_3 = 1;
                }
                var0.g = var2_3;
                return 1;
            }
            case 'f': {
                var0.i = 4;
                if (var1_4 == 'c') {
                    var2_3 = 1;
                }
                var0.g = var2_3;
                return 3;
            }
            case 'd': {
                var0.i = 8;
                if (var1_4 == 'c') {
                    var2_3 = 1;
                }
                var0.g = var2_3;
                return 9;
            }
            case 'c': {
                var3_7 = var8_11;
                var4_9 = StringLib.Z2(var0, -1, false);
                if (var4_9 == -1) {
                    var3_7 = var4_9;
                    var3_7 = var4_9;
                    var10_1 = new StringBuilder();
                    var3_7 = var4_9;
                    var10_1.append("missing size for format option 'c' at pos ");
                    var3_7 = var4_9;
                    var10_1.append(var0.e);
                    var3_7 = var4_9;
                    LuaValue.R0(var10_1.toString());
                }
                var0.i = var4_9;
                var2_3 = var1_4 == 'c' ? var5_6 : (var4_9 >= 8 ? 4 : var4_9);
                var0.g = var2_3;
                return 4;
            }
            case 'b': {
                var0.i = 1;
                var0.g = 1;
                return 1;
            }
            case 'X': {
                var0.i = 0;
                var2_3 = var1_4 == 'c' ? var3_7 : 0;
                var0.g = var2_3;
                return 8;
            }
            case 'T': {
                var3_7 = var8_11;
                var0.i = var4_9 = var0.a;
                if (var1_4 == 'c') {
                    var2_3 = 1;
                } else if (var4_9 < 8) {
                    var2_3 = var4_9;
                }
                var0.g = var2_3;
                return 2;
            }
            case 'L': {
                var0.i = 8;
                if (var1_4 == 'c') {
                    var2_3 = 1;
                }
                var0.g = var2_3;
                return 2;
            }
            case 'J': {
                var0.i = 8;
                if (var1_4 == 'c') {
                    var2_3 = 1;
                }
                var0.g = var2_3;
                return 2;
            }
            case 'I': {
                var3_7 = var8_11;
                var0.i = var4_9 = StringLib.Z2(var0, 4, true);
                if (var1_4 == 'c') {
                    var2_3 = 1;
                } else if (var4_9 < 8) {
                    var2_3 = var4_9;
                }
                var0.g = var2_3;
                return 2;
            }
            case 'H': {
                var0.i = 2;
                var2_3 = var1_4 == 'c' ? var6_8 : 2;
                var0.g = var2_3;
                return 2;
            }
            case 'B': {
                var0.i = 1;
                var0.g = 1;
                return 2;
            }
            case '>': {
                var3_7 = var8_11;
                try {
                    var0.b = false;
                    break;
                }
                catch (Throwable var10_2) {
                    ** break;
                }
            }
            case '<': 
            case '=': {
                var3_7 = var8_11;
                var0.b = true;
                break;
            }
            case '!': {
                var3_7 = var8_11;
                var0.c = StringLib.Z2(var0, var0.a, true);
                break;
            }
lbl176:
            // 1 sources

            var0.i = var3_7;
            if (var1_4 != 'c') {
                if (var3_7 < 8) {
                    var2_3 = var3_7;
                }
            } else {
                var2_3 = 1;
            }
            var0.g = var2_3;
            throw var10_2;
            case ' ': 
        }
        var0.i = 0;
        var2_3 = var1_4 == 'c' ? var4_9 : 0;
        var0.g = var2_3;
        return 0;
    }

    static void b3(c c4, f.a a4, long l3) {
        ByteBuffer byteBuffer = c4.k;
        Object object = c4.b ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
        object = byteBuffer.order((ByteOrder)object);
        int n3 = 0;
        ((ByteBuffer)object).putLong(0, l3);
        object = c4.j;
        if (!c4.b) {
            n3 = 8 - c4.i;
        }
        a4.e((byte[])object, n3, c4.i);
    }

    static int c3(int n3, int n4) {
        if (n3 < 0) {
            n3 = n4 + n3 + 1;
        }
        return n3;
    }

    static Varargs d3(Varargs object, boolean bl) {
        int n3;
        LuaString luaString = ((Varargs)object).H(1);
        LuaString luaString2 = ((Varargs)object).H(2);
        int n4 = luaString.s1();
        int n5 = StringLib.c3(((Varargs)object).Y(3, 1), n4);
        if (n5 < 1) {
            n3 = 1;
        } else {
            n3 = n5;
            if (n5 > n4 + 1) {
                return LuaValue.c;
            }
        }
        int n6 = n3 - 1;
        if (bl && (((Varargs)object).v(4).w2() || luaString2.e3(T) == -1)) {
            n3 = luaString.d3(luaString2, n6);
            if (n3 != -1) {
                return LuaValue.N2(LuaValue.I2(n3 + 1), LuaValue.I2(n3 + luaString2.s1()));
            }
        } else {
            object = new b((Varargs)object, luaString, luaString2);
            if (luaString2.s1() > 0 && luaString2.g3(0) == 94) {
                n5 = 1;
                n3 = 1;
            } else {
                n5 = 0;
                n3 = 0;
            }
            while (true) {
                ((b)object).p();
                int n7 = ((b)object).g(n6, n3);
                if (n7 != -1) {
                    if (bl) {
                        return LuaValue.M2(LuaValue.I2(n6 + 1), LuaValue.I2(n7), ((b)object).n(false, n6, n7));
                    }
                    return ((b)object).n(true, n6, n7);
                }
                if (n6 >= n4 || n5 != 0) break;
                ++n6;
            }
        }
        return LuaValue.c;
    }

    /*
     * Unable to fully structure code
     */
    static long e3(c var0, LuaString var1_1, int var2_2, boolean var3_3) {
        block9: {
            block8: {
                var7_4 = var0.i;
                if (var7_4 != 1) break block8;
                var8_7 = var10_5 = (long)var1_1.P[var1_1.Q + var2_2];
                if (!var3_3) {
                    var8_7 = var10_5 & 255L;
                }
                break block9;
            }
            var12_8 = var0.j;
            if (var7_4 >= 8) ** GOTO lbl24
            if (!var0.b) {
                var5_11 = var4_10 = 8 - var7_4;
                while (true) {
                    var6_12 = var5_11 - 1;
                    var5_11 = var4_10;
                    if (var6_12 >= 0) {
                        var12_8[var6_12] = 0;
                        var5_11 = var6_12;
                        continue;
                    }
                    break;
                }
            } else {
                var4_9 = var7_4 - 1;
                while (++var4_9 < 8) {
                    var12_8[var4_9] = 0;
                }
lbl24:
                // 2 sources

                var5_11 = 0;
            }
            var1_1.U2(var2_2, var12_8, var5_11, var7_4);
            var1_1 = var0.k;
            var0 = var0.b != false ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            var8_7 = var10_6 = var1_1.order((ByteOrder)var0).getLong(0);
            if (var7_4 < 8) {
                var8_7 = var10_6;
                if (var3_3) {
                    var8_7 = 1L << var7_4 * 8 - 1;
                    var8_7 = (var10_6 ^ var8_7) - var8_7;
                }
            }
        }
        return var8_7;
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        luaValue = new LuaTable();
        luaValue.i2("byte", new _byte());
        luaValue.i2("char", new _char());
        luaValue.i2("dump", new dump());
        luaValue.i2("find", new find());
        luaValue.i2("format", new format());
        luaValue.i2("gmatch", new gmatch());
        luaValue.i2("gsub", new gsub());
        luaValue.i2("len", new len());
        luaValue.i2("lower", new lower());
        luaValue.i2("match", new match());
        luaValue.i2("pack", new pack());
        luaValue.i2("packsize", new packsize());
        luaValue.i2("rep", new rep());
        luaValue.i2("reverse", new reverse());
        luaValue.i2("sub", new sub());
        luaValue.i2("unpack", new unpack());
        luaValue.i2("upper", new upper());
        luaValue2.i2("string", luaValue);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("string", luaValue);
        }
        if (LuaString.U == null) {
            LuaString.U = LuaValue.u2(new LuaValue[]{LuaValue.l, luaValue});
        }
        return luaValue;
    }

    static class GMatchAux
    extends VarArgFunction {
        private final int T;
        private final b U;
        private int V;
        private int W;

        public GMatchAux(Varargs varargs, LuaString luaString, LuaString luaString2) {
            this.T = luaString.s1();
            this.U = new b(varargs, luaString, luaString2);
            this.V = 0;
            this.W = -1;
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            while (this.V <= this.T) {
                this.U.p();
                int n3 = this.U.g(this.V, 0);
                if (n3 >= 0 && n3 != this.W) {
                    int n4 = this.V;
                    this.V = n3;
                    this.W = n3;
                    return this.U.n(true, n4, n3);
                }
                ++this.V;
            }
            return LuaValue.c;
        }
    }

    static final class _byte
    extends VarArgFunction {
        _byte() {
        }

        @Override
        public Varargs invoke(Varargs luaValueArray) {
            LuaString luaString = luaValueArray.H(1);
            int n3 = luaString.R;
            int n4 = StringLib.c3(luaValueArray.Y(2, 1), n3);
            int n5 = StringLib.c3(luaValueArray.Y(3, n4), n3);
            int n6 = n4;
            if (n4 <= 0) {
                n6 = 1;
            }
            if (n5 <= n3) {
                n3 = n5;
            }
            if (n6 > n3) {
                return LuaValue.f;
            }
            n5 = n3 - n6 + 1;
            if (n6 + n5 <= n3) {
                LuaValue.R0("string slice too long");
            }
            luaValueArray = new LuaValue[n5];
            for (n3 = 0; n3 < n5; ++n3) {
                luaValueArray[n3] = LuaValue.I2(luaString.g3(n6 + n3 - 1));
            }
            return LuaValue.O2(luaValueArray);
        }
    }

    static final class _char
    extends VarArgFunction {
        _char() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            int n3 = varargs.U();
            byte[] byArray = new byte[n3];
            int n4 = 0;
            int n5 = 1;
            while (n4 < n3) {
                int n6 = varargs.D(n5);
                if (n6 < 0 || n6 >= 256) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("invalid value for string.char [0; 255]: ");
                    stringBuilder.append(n6);
                    LuaValue.k0(n5, stringBuilder.toString());
                }
                byArray[n4] = (byte)n6;
                ++n4;
                ++n5;
            }
            return LuaString.o3(byArray);
        }
    }

    static class a {
        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private int f;
        int g;
        public final int h;
        public final int i;
        public final String j;

        public a(Varargs object, LuaString luaString, int n3) {
            int n4 = luaString.s1();
            int n5 = 0;
            int n6 = n3;
            int n7 = 1;
            int n8 = 0;
            while (n7 != 0) {
                if (n6 < n4) {
                    n8 = luaString.g3(n6);
                    ++n6;
                } else {
                    n8 = 0;
                }
                if (n8 != 32) {
                    if (n8 != 35) {
                        if (n8 != 43) {
                            if (n8 != 45) {
                                if (n8 != 48) {
                                    n7 = 0;
                                    continue;
                                }
                                this.b = true;
                                continue;
                            }
                            this.a = true;
                            continue;
                        }
                        this.c = true;
                        continue;
                    }
                    this.e = true;
                    continue;
                }
                this.d = true;
            }
            if (n6 - n3 > 5) {
                LuaValue.R0("invalid format (repeated flags)");
            }
            this.f = -1;
            n7 = n6;
            int n9 = n8;
            if (Character.isDigit((char)n8)) {
                this.f = n8 - 48;
                if (n6 < n4) {
                    n8 = luaString.g3(n6);
                    ++n6;
                } else {
                    n8 = 0;
                }
                n7 = n6;
                n9 = n8;
                if (Character.isDigit((char)n8)) {
                    this.f = this.f * 10 + (n8 - 48);
                    if (n6 < n4) {
                        n9 = luaString.g3(n6);
                        n7 = n6 + 1;
                    } else {
                        n9 = 0;
                        n7 = n6;
                    }
                }
            }
            this.g = -1;
            n8 = n7;
            n6 = n9;
            if (n9 == 46) {
                if (n7 < n4) {
                    n9 = luaString.g3(n7);
                    ++n7;
                } else {
                    n9 = 0;
                }
                n8 = n7;
                n6 = n9;
                if (Character.isDigit((char)n9)) {
                    this.g = n9 - 48;
                    if (n7 < n4) {
                        n9 = luaString.g3(n7);
                        ++n7;
                    } else {
                        n9 = 0;
                    }
                    n8 = n7;
                    n6 = n9;
                    if (Character.isDigit((char)n9)) {
                        this.g = this.g * 10 + (n9 - 48);
                        n9 = n5;
                        n8 = n7;
                        if (n7 < n4) {
                            n9 = luaString.g3(n7);
                            n8 = n7 + 1;
                        }
                        n6 = n9;
                    }
                }
            }
            if (Character.isDigit((char)n6)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("invalid format (width or precision too long) at pos ");
                ((StringBuilder)object).append(n8);
                LuaValue.R0(((StringBuilder)object).toString());
            }
            this.b &= this.a ^ true;
            this.h = n6;
            this.i = n8 - n3;
            this.j = luaString.j3(n3 - 1, n8).g0();
        }

        public static final void e(f.a a4, char c4, int n3) {
            byte by = (byte)c4;
            while (n3 > 0) {
                a4.a(by);
                --n3;
            }
        }

        public void a(f.a a4, byte by) {
            a4.a(by);
        }

        public void b(f.a a4, double d4) {
            CharSequence charSequence;
            String string2 = Double.isNaN(d4) ? "nan" : (Double.isInfinite(d4) ? (d4 < 0.0 ? "-inf" : "inf") : null);
            if (string2 != null) {
                charSequence = string2;
                if (this.h < 97) {
                    charSequence = string2.toUpperCase(Locale.US);
                }
            } else {
                try {
                    charSequence = String.format(Locale.US, this.j, d4);
                }
                catch (Throwable throwable) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Failed format double ");
                    ((StringBuilder)charSequence).append(d4);
                    ((StringBuilder)charSequence).append(" with '");
                    ((StringBuilder)charSequence).append(this.j);
                    ((StringBuilder)charSequence).append('\'');
                    e1.s(((StringBuilder)charSequence).toString(), throwable);
                    charSequence = String.valueOf(d4);
                }
            }
            a4.b((String)charSequence);
        }

        /*
         * Unable to fully structure code
         */
        public void c(f.a var1_1, long var2_2) {
            block15: {
                block13: {
                    block16: {
                        block17: {
                            block18: {
                                block14: {
                                    cfr_temp_0 = var2_2 - 0L;
                                    var7_3 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                    if (var7_3 != false || this.g != 0) break block14;
                                    var13_4 = "";
                                    break block15;
                                }
                                var4_5 = this.h;
                                if (var4_5 == 88) break block16;
                                if (var4_5 == 111) break block17;
                                if (var4_5 == 117) break block18;
                                if (var4_5 != 120) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var12_6 = Long.toString(var2_2);
                                        break block13;
                                        break;
                                    }
                                }
                                break block16;
                            }
                            ** while (var7_3 >= 0)
lbl18:
                            // 1 sources

                            var10_7 = (var2_2 >>> 1) / 5L;
                            var12_6 = new StringBuilder();
                            var12_6.append(Long.toString(var10_7));
                            var12_6.append(var2_2 - 10L * var10_7);
                            var12_6 = var12_6.toString();
                            break block13;
                        }
                        var12_6 = Long.toOctalString(var2_2);
                        break block13;
                    }
                    var12_6 = Long.toHexString(var2_2);
                }
                var13_4 = var12_6;
                if (this.h == 88) {
                    var13_4 = var12_6.toUpperCase(Locale.US);
                }
            }
            var5_8 = var13_4.length();
            var4_5 = var7_3 < 0 ? var5_8-- : (!this.c && !this.d ? var5_8 : var5_8 + 1);
            var8_9 = this.g;
            var6_10 = 0;
            var5_8 = var8_9 > var5_8 ? var8_9 - var5_8 : (var8_9 == -1 && this.b && (var5_8 = this.f) > var4_5 ? (var5_8 -= var4_5) : 0);
            var9_11 = var4_5 + var5_8;
            var8_9 = this.f;
            var4_5 = var6_10;
            if (var8_9 > var9_11) {
                var4_5 = var8_9 - var9_11;
            }
            if (!this.a) {
                luaj.lib.StringLib$a.e(var1_1, ' ', var4_5);
            }
            if (var7_3 < 0) {
                var12_6 = var13_4;
                if (var5_8 > 0) {
                    var1_1.a((byte)45);
                    var12_6 = var13_4.substring(1);
                }
            } else if (this.c) {
                var1_1.a((byte)43);
                var12_6 = var13_4;
            } else {
                var12_6 = var13_4;
                if (this.d) {
                    var1_1.a((byte)32);
                    var12_6 = var13_4;
                }
            }
            if (var5_8 > 0) {
                luaj.lib.StringLib$a.e(var1_1, '0', var5_8);
            }
            var1_1.b((String)var12_6);
            if (this.a) {
                luaj.lib.StringLib$a.e(var1_1, ' ', var4_5);
            }
        }

        public void d(f.a a4, LuaString luaString) {
            byte by;
            int n3;
            int n4 = luaString.s1();
            int n5 = this.f;
            int n6 = n3 = this.g;
            if (n3 == -1) {
                n6 = n4;
            }
            n3 = n4;
            if (n4 > n6) {
                n3 = n6;
            }
            n4 = 32;
            if (n3 < n5 && !this.a) {
                n6 = this.b ? 48 : 32;
                by = (byte)n6;
                for (n6 = n5 - n3; n6 > 0; --n6) {
                    a4.a(by);
                }
            }
            a4.e(luaString.P, luaString.Q, n3);
            if (n3 < n5 && this.a) {
                n6 = n4;
                if (this.b) {
                    n6 = 48;
                }
                by = (byte)n6;
                for (n6 = n5 - n3; n6 > 0; --n6) {
                    a4.a(by);
                }
            }
        }
    }

    static class b {
        int a;
        final LuaString b;
        final LuaString c;
        final Varargs d;
        int e;
        int[] f;
        int[] g;

        b(Varargs varargs, LuaString luaString, LuaString luaString2) {
            this.b = luaString;
            this.c = luaString2;
            this.d = varargs;
            this.e = 0;
            this.f = new int[32];
            this.g = new int[32];
            this.a = 200;
        }

        /*
         * Enabled aggressive block sorting
         */
        private void a(f.a a4, LuaString luaString, int n3, int n4) {
            int n5 = luaString.s1();
            int n6 = 0;
            while (n6 < n5) {
                byte by = (byte)luaString.g3(n6);
                if (by != 37) {
                    a4.a(by);
                } else {
                    Object object;
                    int n7 = n6 + 1;
                    int n8 = n7 < n5 ? luaString.g3(n7) : 0;
                    by = (byte)n8;
                    char c4 = (char)by;
                    if (!Character.isDigit(c4)) {
                        if (by != 37) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("invalid use of '%' in replacement string: after '%' must be '0'-'9' or '%', but found ");
                            if (n7 < n5) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append("symbol '");
                                ((StringBuilder)object).append(c4);
                                ((StringBuilder)object).append("' with code ");
                                ((StringBuilder)object).append(by);
                                ((StringBuilder)object).append(" at pos ");
                                ((StringBuilder)object).append(n6 + 2);
                                object = ((StringBuilder)object).toString();
                            } else {
                                object = "end of string";
                            }
                            stringBuilder.append((String)object);
                            LuaValue.R0(stringBuilder.toString());
                        }
                        a4.a(by);
                    } else {
                        object = by == 48 ? this.b.j3(n3, n4) : this.o(by - 49, n3, n4).q2();
                        a4.c((LuaString)object);
                    }
                    n6 = n7;
                }
                ++n6;
            }
            return;
        }

        private int c() {
            for (int i3 = this.e - 1; i3 >= 0; --i3) {
                if (this.g[i3] != -1) continue;
                return i3;
            }
            LuaValue.R0("invalid pattern capture");
            return 0;
        }

        private int d(int n3) {
            int n4 = n3 - 49;
            if (n4 < 0 || n4 >= this.e || this.g[n4] == -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("invalid capture index %");
                stringBuilder.append(n3 - 48);
                LuaValue.R0(stringBuilder.toString());
            }
            return n4;
        }

        /*
         * Unable to fully structure code
         */
        static boolean i(int var0, int var1_1) {
            block9: {
                block10: {
                    block11: {
                        block12: {
                            block13: {
                                block14: {
                                    block15: {
                                        block16: {
                                            block17: {
                                                block18: {
                                                    var3_2 = Character.toLowerCase((char)var1_1);
                                                    var2_3 = StringLib.U[var0];
                                                    var5_4 = false;
                                                    var4_5 = false;
                                                    if (var3_2 == 'a') break block10;
                                                    if (var3_2 == 'g') break block11;
                                                    if (var3_2 == 'l') break block12;
                                                    if (var3_2 == 'p') break block13;
                                                    if (var3_2 == 's') break block14;
                                                    if (var3_2 == 'u') break block15;
                                                    if (var3_2 == 'z') break block16;
                                                    if (var3_2 == 'c') break block17;
                                                    if (var3_2 == 'd') break block18;
                                                    if (var3_2 != 'w') {
                                                        if (var3_2 != 'x') {
                                                            if (var1_1 == var0) {
                                                                var4_5 = true;
                                                            }
                                                            return var4_5;
                                                        }
                                                        if ((var2_3 & -128) != 0) lbl-1000:
                                                        // 11 sources

                                                        {
                                                            while (true) {
                                                                var4_5 = true;
                                                                break block9;
                                                                break;
                                                            }
                                                        }
lbl23:
                                                        // 12 sources

                                                        while (true) {
                                                            var4_5 = false;
                                                            break block9;
                                                            break;
                                                        }
                                                    }
                                                    if ((var2_3 & 9) == 0) ** GOTO lbl23
                                                    ** GOTO lbl-1000
                                                }
                                                if ((var2_3 & 8) == 0) ** GOTO lbl23
                                                ** GOTO lbl-1000
                                            }
                                            if ((var2_3 & 64) == 0) ** GOTO lbl23
                                            ** GOTO lbl-1000
                                        }
                                        if (var0 != 0) ** GOTO lbl23
                                        ** GOTO lbl-1000
                                    }
                                    if ((var2_3 & 4) == 0) ** GOTO lbl23
                                    ** GOTO lbl-1000
                                }
                                if ((var2_3 & 32) == 0) ** GOTO lbl23
                                ** GOTO lbl-1000
                            }
                            if ((var2_3 & 16) == 0) ** GOTO lbl23
                            ** GOTO lbl-1000
                        }
                        if ((var2_3 & 2) == 0) ** GOTO lbl23
                        ** GOTO lbl-1000
                    }
                    if ((var2_3 & 25) == 0) ** GOTO lbl23
                    ** GOTO lbl-1000
                }
                if ((var2_3 & 1) != 0) ** break;
                ** while (true)
                ** while (true)
            }
            if (var3_2 == var1_1) {
                var5_4 = var4_5;
            } else if (!var4_5) {
                var5_4 = true;
            }
            return var5_4;
        }

        private LuaValue o(int n3, int n4, int n5) {
            if (n3 >= this.e) {
                if (n3 == 0) {
                    return this.b.j3(n4, n5);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("invalid capture index %");
                stringBuilder.append(n3 + 1);
                return LuaValue.R0(stringBuilder.toString());
            }
            n4 = this.g[n3];
            if (n4 == -1) {
                return LuaValue.R0("unfinished capture");
            }
            if (n4 == -2) {
                return LuaValue.I2(this.f[n3] + 1);
            }
            n3 = this.f[n3];
            return this.b.j3(n3, n4 + n3);
        }

        public void b(f.a a4, int n3, int n4, LuaValue luaValue) {
            int n5 = luaValue.C2();
            if (n5 != 3 && n5 != 4) {
                Object object;
                if (n5 != 5) {
                    if (n5 != 6) {
                        LuaValue.R0("bad argument: string/function/table expected");
                        return;
                    }
                    luaValue = luaValue.invoke(this.n(true, n3, n4)).w();
                } else {
                    luaValue = luaValue.U0(this.o(0, n3, n4));
                }
                if (!luaValue.w2()) {
                    object = this.b.j3(n3, n4);
                } else {
                    object = luaValue;
                    if (!luaValue.n1()) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("invalid replacement value (a ");
                        ((StringBuilder)object).append(luaValue.D2());
                        ((StringBuilder)object).append(')');
                        LuaValue.R0(((StringBuilder)object).toString());
                        object = luaValue;
                    }
                }
                a4.c(((LuaValue)object).q2());
                return;
            }
            this.a(a4, luaValue.q2(), n3, n4);
        }

        int e(int n3) {
            LuaString luaString = this.c;
            int n4 = n3 + 1;
            int n5 = luaString.g3(n3);
            if (n5 != 37) {
                if (n5 != 91) {
                    return n4;
                }
                n5 = n4;
                if (n4 != this.c.s1()) {
                    n5 = n4;
                    if (this.c.g3(n4) == 94) {
                        n5 = n3 + 2;
                    }
                }
                while (true) {
                    if (n5 == this.c.s1()) {
                        LuaValue.R0("malformed pattern (missing ']')");
                    }
                    luaString = this.c;
                    n3 = n5 + 1;
                    if (luaString.g3(n5) == 37 && n3 < this.c.s1()) {
                        n3 = n5 + 2;
                    }
                    n5 = n3;
                    if (n3 == this.c.s1()) continue;
                    n5 = n3;
                    if (this.c.g3(n3) == 93) break;
                }
                return n3 + 1;
            }
            if (n4 == this.c.s1()) {
                LuaValue.R0("malformed pattern (ends with '%')");
            }
            return n3 + 2;
        }

        int f(int n3, int n4) {
            int n5 = this.c();
            this.g[n5] = n3 - this.f[n5];
            if ((n3 = this.g(n3, n4)) == -1) {
                this.g[n5] = -1;
            }
            return n3;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        int g(int var1_1, int var2_2) {
            block16: {
                var5_3 = this.a;
                this.a = var5_3 - 1;
                var3_4 = var1_1;
                var4_5 = var2_2;
                if (var5_3 == 0) {
                    LuaValue.R0("pattern too complex");
                    var4_5 = var2_2;
                    var3_4 = var1_1;
                }
                block8: while (true) {
                    block17: {
                        var1_1 = this.c.s1();
                        if (var4_5 != var1_1) ** GOTO lbl20
                        var1_1 = var3_4;
lbl15:
                        // 9 sources

                        while (true) {
                            ++this.a;
                            return var1_1;
                        }
                        {
                            block18: {
                                block20: {
                                    block19: {
                                        catch (Throwable var9_9) {
                                            break block16;
                                        }
lbl20:
                                        // 1 sources

                                        var2_2 = this.c.g3(var4_5);
                                        var1_1 = 0;
                                        var6_6 = 0;
                                        var5_3 = -1;
                                        if (var2_2 == 36) ** GOTO lbl-1000
                                        if (var2_2 == 37) break block18;
                                        if (var2_2 == 40) break block19;
                                        if (var2_2 != 41) ** GOTO lbl85
                                        var1_1 = this.f(var3_4, var4_5 + 1);
                                        ** GOTO lbl15
                                    }
                                    var1_1 = var4_5 + 1;
                                    if (var1_1 >= this.c.s1() || this.c.g3(var1_1) != 41) break block20;
                                    var1_1 = this.r(var3_4, var4_5 + 2, -2);
                                    ** GOTO lbl15
                                }
                                var1_1 = this.r(var3_4, var1_1, -1);
                                ** GOTO lbl15
                            }
                            var2_2 = var4_5 + 1;
                            if (var2_2 == this.c.s1()) {
                                LuaValue.R0("malformed pattern (ends with '%')");
                            }
                            if ((var7_7 = this.c.g3(var2_2)) == 98) ** GOTO lbl72
                            if (var7_7 == 102) ** GOTO lbl54
                            if (!Character.isDigit((char)(var2_2 = this.c.g3(var2_2)))) ** GOTO lbl-1000
                            var1_1 = this.h(var3_4, var2_2);
                            if (var1_1 != -1) ** GOTO lbl-1000
                            var1_1 = var5_3;
                        }
lbl49:
                        // 7 sources

                        while (true) {
                            ++this.a;
                            return var1_1;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var1_1 = this.g(var1_1, var4_5 + 2);
                            ** GOTO lbl15
lbl54:
                            // 1 sources

                            var8_8 = var4_5 + 2;
                            if (var8_8 == this.c.s1() || this.c.g3(var8_8) != 91) {
                                LuaValue.R0("missing '[' after '%f' in pattern");
                            }
                            var7_7 = this.e(var8_8);
                            var2_2 = var3_4 == 0 ? 0 : this.b.g3(var3_4 - 1);
                            var4_5 = var3_4 == this.b.s1() ? var6_6 : this.b.g3(var3_4);
                            var6_6 = var7_7 - 1;
                            var1_1 = var5_3;
                        }
                        {
                            block22: {
                                block21: {
                                    if (this.k(var2_2, var8_8, var6_6)) ** GOTO lbl49
                                    var1_1 = var7_7;
                                    if (this.k(var4_5, var8_8, var6_6)) break block21;
                                    var1_1 = var5_3;
                                    ** GOTO lbl49
                                }
lbl69:
                                // 2 sources

                                while (true) {
                                    var4_5 = var1_1;
                                    continue block8;
                                    break;
                                }
lbl72:
                                // 1 sources

                                if ((var3_4 = this.j(var3_4, var4_5 + 2)) != -1) break block22;
                                var1_1 = var5_3;
                                ** GOTO lbl49
                            }
                            var4_5 += 4;
                            continue;
                        }
lbl-1000:
                        // 2 sources

                        {
                            block25: {
                                block23: {
                                    block24: {
                                        if (var4_5 + 1 != this.c.s1()) break block23;
                                        if (var3_4 != this.b.s1()) break block24;
                                        var1_1 = var3_4;
                                        ** GOTO lbl15
                                    }
                                    var1_1 = -1;
                                    ** GOTO lbl15
                                }
                                var6_6 = this.e(var4_5);
                                var2_2 = var3_4 < this.b.s1() && this.q(this.b.g3(var3_4), var4_5, var6_6) != false ? 1 : 0;
                                if (var6_6 < this.c.s1()) {
                                    var1_1 = this.c.g3(var6_6);
                                }
                                if (var1_1 == 42) ** GOTO lbl113
                                if (var1_1 == 43) ** GOTO lbl109
                                if (var1_1 == 45) break;
                                if (var1_1 == 63) ** GOTO lbl-1000
                                if (var2_2 != 0) break block25;
                                var1_1 = var5_3;
                                ** GOTO lbl49
                            }
                            ++var3_4;
                            var1_1 = var6_6;
                            ** continue;
                        }
lbl-1000:
                        // 1 sources

                        {
                            if (var2_2 == 0 || (var1_1 = this.g(var3_4 + 1, var6_6 + 1)) == -1) break block17;
                            ++this.a;
                            return var1_1;
                        }
                    }
                    var4_5 = var6_6 + 1;
                }
                {
                    var1_1 = this.m(var3_4, var4_5, var6_6);
                    ** GOTO lbl15
lbl109:
                    // 1 sources

                    var1_1 = var5_3;
                    if (var2_2 == 0) ** GOTO lbl49
                    var1_1 = this.l(var3_4 + 1, var4_5, var6_6);
                    ** continue;
lbl113:
                    // 1 sources

                    var1_1 = this.l(var3_4, var4_5, var6_6);
                    ** continue;
                }
            }
            ++this.a;
            throw var9_9;
        }

        int h(int n3, int n4) {
            LuaString luaString;
            n4 = this.d(n4);
            int n5 = this.g[n4];
            if (this.b.s1() - n3 >= n5 && LuaString.W2(luaString = this.b, this.f[n4], luaString, n3, n5)) {
                return n3 + n5;
            }
            return -1;
        }

        /*
         * Enabled aggressive block sorting
         */
        int j(int n3, int n4) {
            int n5;
            int n6 = this.c.s1();
            if (n4 == n6 || n4 + 1 == n6) {
                LuaValue.R0("malformed pattern (missing arguments to '%b')");
            }
            if (n3 >= (n5 = this.b.s1())) {
                return -1;
            }
            int n7 = this.c.g3(n4);
            if (this.b.g3(n3) != n7) {
                return -1;
            }
            LuaString luaString = this.c;
            n6 = 1;
            int n8 = luaString.g3(n4 + 1);
            n4 = n3;
            int n9;
            while ((n9 = n4 + 1) < n5) {
                if (this.b.g3(n9) == n8) {
                    n3 = --n6;
                    if (n6 == 0) {
                        return n4 + 2;
                    }
                } else {
                    n3 = n6;
                    if (this.b.g3(n9) == n7) {
                        n3 = n6 + 1;
                    }
                }
                n4 = n9;
                n6 = n3;
            }
            return -1;
        }

        boolean k(int n3, int n4, int n5) {
            int n6;
            boolean bl;
            LuaString luaString = this.c;
            int n7 = n4 + 1;
            if (luaString.g3(n7) == 94) {
                n4 = n7;
                bl = false;
            } else {
                bl = true;
            }
            while ((n6 = n4 + 1) < n5) {
                if (this.c.g3(n6) == 37) {
                    n4 = n7 = n4 + 2;
                    if (!luaj.lib.StringLib$b.i(n3, this.c.g3(n7))) continue;
                    return bl;
                }
                if (this.c.g3(n4 + 2) == 45 && (n7 = n4 + 3) < n5) {
                    if (this.c.g3(n4 + 1) <= n3 && n3 <= this.c.g3(n7)) {
                        return bl;
                    }
                    n4 = n7;
                    continue;
                }
                if (this.c.g3(n6) == n3) {
                    return bl;
                }
                n4 = n6;
            }
            return bl ^ true;
        }

        int l(int n3, int n4, int n5) {
            int n6;
            int n7;
            int n8 = 0;
            do {
                n7 = n3 + n8;
                n6 = n8;
                if (n7 >= this.b.s1()) break;
                n6 = n8++;
            } while (this.q(this.b.g3(n7), n4, n5));
            while (n6 >= 0) {
                n4 = this.g(n3 + n6, n5 + 1);
                if (n4 != -1) {
                    return n4;
                }
                --n6;
            }
            return -1;
        }

        int m(int n3, int n4, int n5) {
            while (true) {
                int n6;
                if ((n6 = this.g(n3, n5 + 1)) != -1) {
                    return n6;
                }
                if (n3 >= this.b.s1() || !this.q(this.b.g3(n3), n4, n5)) break;
                ++n3;
            }
            return -1;
        }

        Varargs n(boolean bl, int n3, int n4) {
            int n5;
            int n6 = n5 = this.e;
            if (n5 == 0) {
                n6 = n5;
                if (bl) {
                    n6 = 1;
                }
            }
            if (n6 != 0) {
                if (n6 != 1) {
                    LuaValue[] luaValueArray = new LuaValue[n6];
                    for (n5 = 0; n5 < n6; ++n5) {
                        luaValueArray[n5] = this.o(n5, n3, n4);
                    }
                    return LuaValue.O2(luaValueArray);
                }
                return this.o(0, n3, n4);
            }
            return LuaValue.f;
        }

        void p() {
            this.e = 0;
            this.a = 200;
        }

        boolean q(int n3, int n4, int n5) {
            int n6 = this.c.g3(n4);
            boolean bl = true;
            if (n6 != 37) {
                if (n6 != 46) {
                    if (n6 != 91) {
                        if (this.c.g3(n4) != n3) {
                            bl = false;
                        }
                        return bl;
                    }
                    return this.k(n3, n4, n5 - 1);
                }
                return true;
            }
            return luaj.lib.StringLib$b.i(n3, this.c.g3(n4 + 1));
        }

        int r(int n3, int n4, int n5) {
            int n6 = this.e;
            if (n6 >= 32) {
                LuaValue.R0("too many captures");
            }
            this.f[n6] = n3;
            this.g[n6] = n5;
            this.e = n6 + 1;
            if ((n3 = this.g(n3, n4)) == -1) {
                --this.e;
            }
            return n3;
        }
    }

    static final class c {
        final byte a;
        boolean b = true;
        int c = 1;
        final String d;
        int e = 0;
        char f = '\u0000';
        int g = 0;
        int h = 0;
        int i = 0;
        final byte[] j;
        final ByteBuffer k;

        public c(String object) {
            int n3 = 8;
            byte[] byArray = new byte[8];
            this.j = byArray;
            this.k = ByteBuffer.wrap(byArray);
            this.d = object;
            object = MainService.instance.v0;
            if (object == null || !((z1.d)object).n) {
                n3 = 4;
            }
            this.a = (byte)n3;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PackState [size_t=");
            stringBuilder.append(this.a);
            stringBuilder.append(", islittle=");
            stringBuilder.append(this.b);
            stringBuilder.append(", maxalign=");
            stringBuilder.append(this.c);
            stringBuilder.append(", fmt=");
            stringBuilder.append(this.d);
            stringBuilder.append(", pos=");
            stringBuilder.append(this.e);
            stringBuilder.append(", last=");
            stringBuilder.append(this.f);
            stringBuilder.append(", align=");
            stringBuilder.append(this.g);
            stringBuilder.append(", ntoalign=");
            stringBuilder.append(this.h);
            stringBuilder.append(", size=");
            stringBuilder.append(this.i);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    static final class dump
    extends VarArgFunction {
        dump() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaFunction luaFunction = varargs.C(1);
            if (luaFunction instanceof LuaClosure) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.b.a(((LuaClosure)luaFunction).R, byteArrayOutputStream, varargs.V(2, false), varargs.V(3, false));
                    varargs = LuaString.o3(byteArrayOutputStream.toByteArray());
                    return varargs;
                }
                catch (IOException iOException) {
                    return LuaValue.R0(iOException.getMessage());
                }
            }
            throw new d("unable to dump given function");
        }
    }

    static final class find
    extends VarArgFunction {
        find() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            return StringLib.d3(varargs, true);
        }
    }

    static final class format
    extends VarArgFunction {
        format() {
        }

        /*
         * Exception decompiling
         */
        @Override
        public Varargs invoke(Varargs var1_1) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 6[SWITCH]
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }
    }

    static final class gmatch
    extends VarArgFunction {
        gmatch() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            return new GMatchAux(varargs, varargs.H(1), varargs.H(2));
        }
    }

    static final class gsub
    extends VarArgFunction {
        gsub() {
        }

        @Override
        public Varargs invoke(Varargs object) {
            int n3;
            int n4 = 1;
            LuaString luaString = ((Varargs)object).H(1);
            int n5 = luaString.s1();
            LuaString luaString2 = ((Varargs)object).H(2);
            LuaValue luaValue = ((Varargs)object).v(3);
            int n6 = ((Varargs)object).Y(4, n5 + 1);
            int n7 = luaString2.s1();
            int n8 = 0;
            if (n7 <= 0 || luaString2.T2(0) != 94) {
                n4 = 0;
            }
            f.a a4 = new f.a(n5);
            object = new b((Varargs)object, luaString, luaString2);
            int n9 = 0;
            int n10 = -1;
            do {
                n7 = n9;
                n3 = n8;
                if (n8 >= n6) break;
                ((b)object).p();
                n7 = ((b)object).g(n9, n4);
                if (n7 != -1 && n7 != n10) {
                    n3 = n8 + 1;
                    ((b)object).b(a4, n9, n7, luaValue);
                    n10 = n7;
                } else {
                    n7 = n9;
                    n3 = n8;
                    if (n9 >= n5) break;
                    a4.a((byte)luaString.g3(n9));
                    n7 = n9 + 1;
                    n3 = n8;
                }
                n9 = n7;
                n8 = n3;
            } while (n4 == 0);
            a4.c(luaString.j3(n7, n5));
            return LuaValue.N2(a4.l(), LuaValue.I2(n3));
        }
    }

    static final class len
    extends OneArgFunction {
        len() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return luaValue.G0().r1();
        }
    }

    static final class lower
    extends OneArgFunction {
        lower() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.K2(luaValue.B0().toLowerCase(Locale.US));
        }
    }

    static final class match
    extends VarArgFunction {
        match() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            return StringLib.d3(varargs, false);
        }
    }

    static final class pack
    extends VarArgFunction {
        pack() {
        }

        /*
         * Unable to fully structure code
         */
        @Override
        public Varargs invoke(Varargs var1_1) {
            var14_2 = var1_1.E(1);
            var15_3 = new c((String)var14_2);
            var16_4 = new f.a();
            var5_5 = var14_2.length();
            var3_6 = 0;
            var2_7 = 1;
            block11: while (var15_3.e < var5_5) {
                block22: {
                    var7_10 = StringLib.Y2(var15_3, var3_6);
                    var8_11 = var15_3.h;
                    var6_9 = var15_3.i;
                    var4_8 = var3_6 + (var8_11 + var6_9);
                    if (var8_11 > 0) {
                        var16_4.e(new byte[var8_11], 0, var8_11);
                    }
                    var3_6 = var2_7 + 1;
                    block0 : switch (var7_10) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            break;
                        }
                        case 10: {
                            var14_2 = var1_1.G(var3_6);
                            var15_3.i = 8;
                            var13_14 = var14_2 instanceof LuaLong;
                            if (var13_14) {
                                var9_12 = var14_2.z2();
lbl25:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var9_12 = Double.doubleToRawLongBits(var14_2.x2());
                            ** continue;
                            StringLib.b3(var15_3, var16_4, var9_12);
                            var15_3.i = 1;
                            var9_12 = var13_14 != false ? 1L : 0L;
                            StringLib.b3(var15_3, var16_4, var9_12);
                            break;
                        }
                        case 9: {
                            var9_12 = Double.doubleToRawLongBits(var1_1.B(var3_6));
lbl36:
                            // 2 sources

                            while (true) {
                                StringLib.b3(var15_3, var16_4, var9_12);
                                break block0;
                                break;
                            }
                        }
                        case 7: {
                            var16_4.a((byte)0);
                        }
                        case 0: 
                        case 8: {
                            break block22;
                        }
                        case 6: {
                            var14_2 = var1_1.H(var3_6);
                            var2_7 = var14_2.s1();
                            var13_14 = var14_2.g0().indexOf(0) == -1;
                            this.x(var13_14, var3_6, "string contains zeros");
                            var16_4.c((LuaString)var14_2);
                            var16_4.a((byte)0);
                            ++var2_7;
lbl54:
                            // 2 sources

                            while (true) {
                                var4_8 += var2_7;
                                var2_7 = var3_6;
                                var3_6 = var4_8;
                                continue block11;
                                break;
                            }
                        }
                        case 5: {
                            var17_15 = var1_1.H(var3_6);
                            var2_7 = var17_15.s1();
                            var13_14 = var6_9 >= var15_3.a || (long)var2_7 < 1L << var6_9 * 8;
                            var14_2 = new StringBuilder();
                            var14_2.append("string length (");
                            var14_2.append(var2_7);
                            var14_2.append(") does not fit in given size (");
                            var14_2.append(var6_9);
                            var14_2.append(" bytes)");
                            this.x(var13_14, var3_6, var14_2.toString());
                            StringLib.b3(var15_3, var16_4, var2_7);
                            var16_4.c((LuaString)var17_15);
                            ** continue;
                        }
                        case 4: {
                            var14_2 = var1_1.H(var3_6);
                            var2_7 = var14_2.s1();
                            var13_14 = var2_7 <= var6_9;
                            var17_15 = new StringBuilder();
                            var17_15.append("string longer (");
                            var17_15.append(var2_7);
                            var17_15.append(") than given size (");
                            var17_15.append(var6_9);
                            var17_15.append(")");
                            this.x(var13_14, var3_6, var17_15.toString());
                            var16_4.c((LuaString)var14_2);
                            if ((var2_7 = var6_9 - var2_7) <= 0) ** GOTO lbl-1000
                            var16_4.e(new byte[var2_7], 0, var2_7);
                            break;
                        }
                        case 3: {
                            var9_12 = Float.floatToRawIntBits((float)var1_1.B(var3_6));
                            ** continue;
                        }
                        case 1: 
                        case 2: {
                            var11_13 = var1_1.F(var3_6);
                            if (var6_9 < 8) {
                                var2_7 = var6_9 * 8;
                                if (var7_10 == 1) {
                                    var9_12 = 1L << var2_7 - 1;
                                    var13_14 = -var9_12 <= var11_13 && var11_13 < var9_12;
                                    var14_2 = "integer overflow";
lbl112:
                                    // 2 sources

                                    while (true) {
                                        this.x(var13_14, var3_6, (String)var14_2);
                                        break;
                                    }
                                } else {
                                    var13_14 = (((1L << var2_7) - 1L ^ -1L) & var11_13) == 0L;
                                    var14_2 = "unsigned overflow";
                                    ** continue;
                                }
                            }
                            StringLib.b3(var15_3, var16_4, var11_13);
                        }
                    }
                    var2_7 = var3_6;
                }
                var3_6 = var4_8;
            }
            return var16_4.l();
        }
    }

    static final class packsize
    extends VarArgFunction {
        packsize() {
        }

        @Override
        public Varargs invoke(Varargs object) {
            CharSequence charSequence = ((Varargs)object).E(1);
            object = new c((String)charSequence);
            int n3 = ((String)charSequence).length();
            int n4 = 0;
            while (((c)object).e < n3) {
                byte by = StringLib.Y2((c)object, n4);
                int n5 = ((c)object).i + ((c)object).h;
                boolean bl = n4 <= Integer.MAX_VALUE - n5;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("format result too large at pos ");
                ((StringBuilder)charSequence).append(((c)object).e);
                this.x(bl, 1, ((StringBuilder)charSequence).toString());
                n4 += n5;
                if (by != 5 && by != 6) continue;
                LuaValue.k0(1, t2.f("variable-length format option '%c' at pos %d", Character.valueOf(((c)object).f), ((c)object).e));
            }
            return LuaValue.I2(n4);
        }
    }

    static final class rep
    extends VarArgFunction {
        rep() {
        }

        @Override
        public Varargs invoke(Varargs object) {
            int n3;
            Object object2 = ((Varargs)object).H(1);
            int n4 = ((Varargs)object).D(2);
            if (n4 <= 0) {
                return LuaValue.L;
            }
            LuaString luaString = ((Varargs)object).b0(3, LuaValue.L);
            int n5 = ((LuaString)object2).s1();
            int n6 = n5 + (n3 = luaString.s1());
            if (n6 >= n5 && n6 <= Integer.MAX_VALUE / n4) {
                byte[] byArray = new byte[n6 * (n4 - 1) + n5];
                object = ((LuaString)object2).P;
                int n7 = ((LuaString)object2).Q;
                object2 = luaString.P;
                int n8 = luaString.Q;
                n6 = 0;
                while (true) {
                    int n9;
                    System.arraycopy(object, n7, byArray, n6, n5);
                    if (n4 <= 1) break;
                    n6 = n9 = n6 + n5;
                    if (n3 > 0) {
                        System.arraycopy(object2, n8, byArray, n9, n3);
                        n6 = n9 + n3;
                    }
                    --n4;
                }
                return LuaString.o3(byArray);
            }
            throw new d("resulting string too large");
        }
    }

    static final class reverse
    extends OneArgFunction {
        reverse() {
        }

        @Override
        public LuaValue call(LuaValue object) {
            int n3;
            LuaString luaString = ((LuaValue)object).G0();
            int n4 = luaString.s1();
            if (n4 == 0) {
                return LuaValue.L;
            }
            object = new byte[n4];
            byte[] byArray = luaString.P;
            int n5 = n4 - 1;
            int n6 = n3 = luaString.Q;
            while (n6 < n4 + n3) {
                object[n5] = byArray[n6];
                ++n6;
                --n5;
            }
            return LuaString.o3((byte[])object);
        }
    }

    static final class sub
    extends VarArgFunction {
        sub() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaString luaString = varargs.H(1);
            int n3 = luaString.s1();
            int n4 = StringLib.c3(varargs.D(2), n3);
            int n5 = StringLib.c3(varargs.Y(3, -1), n3);
            int n6 = n4;
            if (n4 < 1) {
                n6 = 1;
            }
            if (n5 <= n3) {
                n3 = n5;
            }
            if (n6 <= n3) {
                return luaString.j3(n6 - 1, n3);
            }
            return LuaValue.L;
        }
    }

    static final class unpack
    extends VarArgFunction {
        unpack() {
        }

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        @Override
        public Varargs invoke(Varargs var1_1) {
            var3_2 = 1;
            var16_3 = var1_1.E(1);
            var14_4 = var1_1.H(2);
            var4_5 = var14_4.s1();
            var5_6 = StringLib.c3(var1_1.Y(3, 1), var4_5);
            var2_7 = var5_6 - 1;
            var9_8 = var2_7 >= 0 && var2_7 <= var4_5;
            var1_1 = new StringBuilder();
            var1_1.append("initial position (");
            var1_1.append(var5_6);
            var1_1.append(") out of string (length = ");
            var1_1.append(var4_5);
            var1_1.append(")");
            this.x(var9_8, 3, var1_1.toString());
            var15_9 = new c((String)var16_3);
            var5_6 = var16_3.length();
            var16_3 = new ArrayList<E>();
            while (var15_9.e < var5_6) {
                var8_12 = StringLib.Y2(var15_9, var2_7);
                var7_11 = var15_9.h;
                var6_10 = var15_9.i;
                if ((var7_11 = (var2_7 += var7_11) + var6_10) > var4_5) {
                    var1_1 = new Object[4];
                    var1_1[0] = var4_5;
                    var1_1[var3_2] = Character.valueOf(var15_9.f);
                    var1_1[2] = var7_11;
                    var1_1[3] = var15_9.e;
                    LuaValue.k0(2, t2.f("data string too short (%d) for option '%c' (need %d) at pos %d", var1_1));
                }
                block0 : switch (var8_12) {
                    default: {
                        break;
                    }
                    case 10: {
                        var15_9.i = 8;
                        var12_14 = StringLib.e3(var15_9, var14_4, var2_7, false);
                        var15_9.i = var3_2;
                        var10_13 = var12_14;
                        if (StringLib.e3(var15_9, var14_4, var2_7 + 8, false) == 1L) {
                            var1_1 = LuaLong.I2(var12_14);
lbl45:
                            // 2 sources

                            while (true) {
                                var16_3.add(var1_1);
                                break block0;
                                break;
                            }
                        }
lbl49:
                        // 3 sources

                        while (true) {
                            var1_1 = LuaDouble.J2(Double.longBitsToDouble(var10_13));
                            ** continue;
                            break;
                        }
                    }
                    case 9: {
                        var10_13 = StringLib.e3(var15_9, var14_4, var2_7, false);
                        ** continue;
                    }
                    case 6: {
                        var7_11 = var14_4.c3((byte)0, var2_7);
                        var9_8 = var7_11 != -1;
                        var1_1 = new Object[2];
                        var1_1[0] = Character.valueOf(var15_9.f);
                        var1_1[var3_2] = var15_9.e;
                        this.x(var9_8, 2, t2.f("zero char not found for option '%c' at pos %d", var1_1));
                        var16_3.add(var14_4.j3(var2_7, var7_11));
                        var2_7 = var7_11 + 1;
                        break;
                    }
                    case 5: {
                        var3_2 = (int)StringLib.e3(var15_9, var14_4, var2_7, false);
                        var8_12 = (var2_7 += var3_2) + var6_10;
                        var9_8 = var8_12 <= var4_5;
                        var1_1 = new StringBuilder();
                        var1_1.append("data string too short (");
                        var1_1.append(var4_5);
                        var1_1.append(" but need ");
                        var1_1.append(var8_12);
                        var1_1.append(") at pos ");
                        var1_1.append(var15_9.e);
                        this.x(var9_8, 2, var1_1.toString());
                        var1_1 = var14_4.j3(var7_11, var3_2 + var7_11);
lbl85:
                        // 3 sources

                        while (true) {
                            var16_3.add(var1_1);
                            var3_2 = 1;
                            break block0;
                            break;
                        }
                    }
                    case 4: {
                        var1_1 = var14_4.j3(var2_7, var7_11);
                        ** GOTO lbl85
                    }
                    case 3: {
                        var1_1 = LuaDouble.J2(Float.intBitsToFloat((int)StringLib.e3(var15_9, var14_4, var2_7, false)));
                        ** continue;
                    }
                    case 1: 
                    case 2: {
                        var9_8 = var8_12 == var3_2;
                        var16_3.add(LuaLong.I2(StringLib.e3(var15_9, var14_4, var2_7, var9_8)));
                    }
                }
                var2_7 += var6_10;
            }
            var16_3.add(LuaValue.I2(var2_7 + var3_2));
            return LuaValue.O2(var16_3.toArray(new LuaValue[var16_3.size()]));
        }
    }

    static final class upper
    extends OneArgFunction {
        upper() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.K2(luaValue.B0().toUpperCase(Locale.US));
        }
    }
}

