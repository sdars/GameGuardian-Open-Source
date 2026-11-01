/*
 * Decompiled with CFR 0.152.
 */
package lasm;

import e.c;
import e.d;
import e.e;
import e.f;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import lasm.LasmBase;
import lasm.b;
import luaj.LuaBoolean;
import luaj.LuaLong;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.h;

public class a
extends LasmBase
implements e.a {
    private static int[] l;
    private static int[] m;
    private static int[] n;
    public c b;
    e c;
    public f d;
    public f e;
    private int f;
    private int g;
    private final int[] h = new int[34];
    private List i = new ArrayList();
    private int[] j;
    private int k = -1;

    static {
        a.x();
        a.y();
        a.z();
    }

    public a(InputStream inputStream) {
        this(inputStream, null);
    }

    public a(InputStream inputStream, String string2) {
        try {
            e e4;
            this.c = e4 = new e(inputStream, string2, 1, 1);
            this.b = new c(this.c);
            this.d = new f();
            this.f = -1;
            this.g = 0;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
        for (int i3 = 0; i3 < 34; ++i3) {
            this.h[i3] = -1;
        }
        return;
    }

    private int A() {
        int n3;
        f f4;
        f f5 = this.d;
        this.e = f4 = f5.g;
        f f6 = f4;
        if (f4 == null) {
            f5.g = f6 = this.b.b();
        }
        this.f = n3 = f6.a;
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private f w(int n3) {
        f f4 = this.d;
        f f5 = f4.g;
        if (f5 == null) {
            f4.g = f5 = this.b.b();
        }
        this.d = f5;
        this.f = -1;
        f5 = this.d;
        if (f5.a != n3) {
            this.d = f4;
            this.k = n3;
            throw this.v();
        }
        ++this.g;
        return f5;
    }

    private static void x() {
        l = new int[]{0, 0, -32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 256, 67584, 0, 8273920, 58720288, 0, 0, 0x70000000, 0, 0, 0, 0, 0, 0, 0, 0, -32, 0};
    }

    private static void y() {
        m = new int[]{0, 0, 0x23FFFF, 0, 0xF040000, 0x7040000, 0x8000000, 0x8000000, 0x100000, 0x1000000, 0, 0, 0, 0, 0, 0x800000, 64, 0, 0, 256000, 4096, 0x8000000, 176, 0, 0, 0x8400000, 0x8400000, 1028, 0, 0, 0x8000000, 0x20080000, 0x23FFFF, 0};
    }

    private static void z() {
        n = new int[]{1024, 16, 4192, 256, 1286144, 1277952, 24576, 8192, 4096, 131072, 4192, 128, 128, 128, 4192, 0, 0, 0, 2048, 0, 0, 8192, 0, 0, 2048, 8192, 8192, 0, 2048, 2048, 8192, 0, 0, 128};
    }

    public final b k() {
        b b4 = new b();
        this.w(62);
        this.w(81);
        b4.g = LasmBase.j(this.d);
        this.w(74);
        this.w(63);
        this.w(79);
        b4.h = LasmBase.e(this.d);
        this.w(74);
        this.w(64);
        this.w(79);
        b4.i = LasmBase.e(this.d);
        this.w(74);
        this.w(65);
        this.w(79);
        b4.j = LasmBase.g(this.d, 255);
        this.w(74);
        this.w(66);
        this.w(79);
        b4.k = LasmBase.g(this.d, 255);
        this.w(74);
        this.w(67);
        this.w(79);
        b4.p(this.d);
        this.w(74);
        while (true) {
            int n3;
            int n4 = n3 = this.f;
            if (n3 == -1) {
                n4 = this.A();
            }
            if (n4 != 68) {
                this.h[1] = this.g;
                block4: while (true) {
                    this.o(b4);
                    n4 = n3 = this.f;
                    if (n3 == -1) {
                        n4 = this.A();
                    }
                    if (n4 == 53 || n4 == 76 || n4 == 69 || n4 == 70) continue;
                    switch (n4) {
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 10: 
                        case 11: 
                        case 12: 
                        case 13: 
                        case 14: 
                        case 15: 
                        case 16: 
                        case 17: 
                        case 18: 
                        case 19: 
                        case 20: 
                        case 21: 
                        case 22: 
                        case 23: 
                        case 24: 
                        case 25: 
                        case 26: 
                        case 27: 
                        case 28: 
                        case 29: 
                        case 30: 
                        case 31: 
                        case 32: 
                        case 33: 
                        case 34: 
                        case 35: 
                        case 36: 
                        case 37: 
                        case 38: 
                        case 39: 
                        case 40: 
                        case 41: 
                        case 42: 
                        case 43: 
                        case 44: 
                        case 45: 
                        case 46: 
                        case 47: 
                        case 48: 
                        case 49: {
                            continue block4;
                        }
                    }
                    break;
                }
                this.h[2] = this.g;
                while (true) {
                    n4 = n3 = this.f;
                    if (n3 == -1) {
                        n4 = this.A();
                    }
                    if (n4 != 72) {
                        this.h[3] = this.g;
                        return b4.j();
                    }
                    this.m(b4);
                }
            }
            this.t(b4);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final f l() {
        int n3;
        int n4 = n3 = this.f;
        if (n3 == -1) {
            n4 = this.A();
        }
        if (n4 != 52) {
            if (n4 == 76) {
                return this.w(76);
            }
            this.h[8] = this.g;
            this.w(-1);
            throw new d();
        }
        this.w(52);
        f f4 = this.w(60);
        this.w(89);
        return f4;
    }

    public final void m(b b4) {
        this.w(72);
        f f4 = this.w(61);
        this.w(74);
        b4.d(f4, this.k());
        this.w(73);
        this.w(74);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final LuaValue n() {
        void var3_10;
        block13: {
            block12: {
                int n3;
                int n4 = n3 = this.f;
                if (n3 == -1) {
                    n4 = this.A();
                }
                if (n4 == 50) {
                    this.w(50);
                    this.w(88);
                    this.w(79);
                    LasmBase.Const const_ = new LasmBase.Const(this.d);
                    this.w(89);
                    return var3_10;
                }
                if (n4 == 84) break block12;
                switch (n4) {
                    default: {
                        switch (n4) {
                            default: {
                                this.h[5] = this.g;
                                this.w(-1);
                                throw new d();
                            }
                            case 81: {
                                this.w(81);
                                LuaString luaString = LasmBase.j(this.d);
                                return var3_10;
                            }
                            case 80: {
                                this.w(80);
                                break block13;
                            }
                            case 79: {
                                this.w(79);
                                LuaLong luaLong = LuaLong.I2(LasmBase.h(this.d));
                                return var3_10;
                            }
                        }
                    }
                    case 58: {
                        this.w(58);
                        LuaBoolean luaBoolean = LuaValue.e;
                        return var3_10;
                    }
                    case 57: {
                        this.w(57);
                        LuaBoolean luaBoolean = LuaValue.d;
                        return var3_10;
                    }
                    case 56: {
                        this.w(56);
                        LuaValue luaValue = LuaValue.c;
                        return var3_10;
                    }
                }
            }
            this.w(84);
        }
        LuaValue luaValue = LasmBase.i(this.d);
        return var3_10;
    }

    /*
     * Unable to fully structure code
     */
    public final void o(b var1_1) {
        block49: while (true) {
            block127: {
                block126: {
                    block128: {
                        var2_2 = var3_3 = this.f;
                        if (var3_3 == -1) {
                            var2_2 = this.A();
                        }
                        var3_3 = 0;
                        if (var2_2 == 69 || var2_2 == 70 || var2_2 == 76) break block127;
                        this.h[10] = this.g;
                        var2_2 = var4_5 = this.f;
                        if (var4_5 == -1) {
                            var2_2 = this.A();
                        }
                        if (var2_2 == 53) break block128;
                        block0 : switch (var2_2) {
                            default: {
                                this.h[32] = this.g;
                                this.w(-1);
                                throw new d();
                            }
                            case 41: {
                                var6_6 = this.w(41);
                                var7_7 = this.p();
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 != 51) {
                                    if (var2_2 == 61) {
                                        var5_4 = this.w(61);
lbl27:
                                        // 5 sources

                                        while (true) {
                                            var8_9 = null;
                                            var9_8 = var7_7;
                                            var7_7 = var8_9;
lbl31:
                                            // 3 sources

                                            while (true) {
                                                var8_9 = null;
lbl33:
                                                // 3 sources

                                                while (true) {
                                                    var11_11 = null;
                                                    var10_10 = var9_8;
                                                    var9_8 = var11_11;
                                                    break block126;
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    this.h[31] = this.g;
                                    this.w(-1);
                                    throw new d();
                                }
                                this.w(51);
                                var5_4 = this.w(79);
                                this.w(89);
                                ** GOTO lbl27
                            }
                            case 40: {
                                var6_6 = this.w(40);
                                var7_7 = this.p();
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 != 75) {
                                    this.h[18] = this.g;
                                    var5_4 = null;
                                } else {
                                    this.w(75);
                                    var5_4 = this.p();
                                    LasmBase.a((LasmBase.V)var7_7, (LasmBase.V)var5_4, 1);
                                }
lbl62:
                                // 3 sources

                                while (true) {
                                    var8_9 = this.w(79);
                                    var9_8 = var5_4;
                                    var10_10 = var7_7;
                                    var5_4 = var6_6;
lbl67:
                                    // 2 sources

                                    while (true) {
                                        var7_7 = var9_8;
                                        var6_6 = var5_4;
                                        var9_8 = var10_10;
                                        var5_4 = var8_9;
                                        ** GOTO lbl31
                                        break;
                                    }
                                    break;
                                }
                            }
                            case 36: 
                            case 37: 
                            case 39: {
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 == 36) ** GOTO lbl89
                                if (var2_2 != 37) {
                                    if (var2_2 == 39) {
                                        var2_2 = 39;
lbl81:
                                        // 3 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    this.h[22] = this.g;
                                    this.w(-1);
                                    throw new d();
                                }
                                var2_2 = 37;
                                ** GOTO lbl81
lbl89:
                                // 1 sources

                                var2_2 = 36;
                                ** continue;
                                this.w(var2_2);
                                var6_6 = this.d;
lbl94:
                                // 3 sources

                                while (true) {
                                    var7_7 = this.p();
lbl96:
                                    // 2 sources

                                    while (true) {
                                        var5_4 = this.l();
                                        ** GOTO lbl27
                                        break;
                                    }
                                    break;
                                }
                            }
                            case 35: {
                                var5_4 = this.w(35);
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 == 59 || var2_2 == 77) ** GOTO lbl114
                                this.h[30] = this.g;
                                var7_7 = null;
                                var8_9 = null;
                                var9_8 = null;
lbl109:
                                // 3 sources

                                while (true) {
                                    var10_10 = null;
                                    var6_6 = var5_4;
                                    var5_4 = var10_10;
                                    ** GOTO lbl33
                                    break;
                                }
lbl114:
                                // 1 sources

                                var7_7 = this.p();
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                var8_9 = var5_4;
                                var6_6 = var7_7;
                                if (var2_2 == 75) ** GOTO lbl129
                                this.h[29] = this.g;
                                var6_6 = var7_7;
lbl123:
                                // 2 sources

                                while (true) {
                                    var7_7 = null;
                                    var9_8 = var6_6;
lbl126:
                                    // 3 sources

                                    while (true) {
                                        var8_9 = null;
                                        ** GOTO lbl109
                                        break;
                                    }
                                    break;
                                }
lbl129:
                                // 2 sources

                                while (true) {
                                    this.w(75);
                                    var7_7 = this.p();
                                    LasmBase.a((LasmBase.V)var6_6, (LasmBase.V)var7_7, 0);
                                    var5_4 = var8_9;
                                    break;
                                }
lbl135:
                                // 1 sources

                                while (true) {
                                    var9_8 = var6_6;
                                    ** GOTO lbl126
                                    break;
                                }
                            }
                            case 34: 
                            case 42: {
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 != 34) {
                                    if (var2_2 == 42) {
                                        var2_2 = 42;
lbl145:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    this.h[27] = this.g;
                                    this.w(-1);
                                    throw new d();
                                }
                                var2_2 = 34;
                                ** continue;
                                this.w(var2_2);
                                var5_4 = this.d;
                                var7_7 = this.p();
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                var8_9 = var5_4;
                                var6_6 = var7_7;
                                if (var2_2 == 75) ** continue;
                                this.h[28] = this.g;
                                var6_6 = var7_7;
                                ** continue;
                            }
                            case 33: {
                                var5_4 = this.w(33);
                                var8_9 = this.p();
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 != 75) {
                                    this.h[24] = this.g;
                                    var7_7 = null;
                                } else {
                                    this.w(75);
                                    var7_7 = this.p();
                                    LasmBase.a((LasmBase.V)var8_9, (LasmBase.V)var7_7, 0);
                                }
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 != 54 && var2_2 != 59 && var2_2 != 77) {
                                    this.h[26] = this.g;
                                    var6_6 = var8_9;
                                    break;
                                }
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 != 54) {
                                    if (var2_2 != 59 && var2_2 != 77) {
                                        this.h[25] = this.g;
                                        this.w(-1);
                                        throw new d();
                                    }
                                    LasmBase.b((LasmBase.V)var8_9, this.p());
                                    this.w(75);
                                    var6_6 = this.p();
                                    LasmBase.a((LasmBase.V)var8_9, (LasmBase.V)var6_6, 0);
lbl201:
                                    // 3 sources

                                    while (true) {
                                        var9_8 = var8_9;
                                        var8_9 = var6_6;
                                        ** continue;
                                        break;
                                    }
                                }
                                var6_6 = this.w(54);
                                var10_10 = var8_9;
                                var9_8 = var7_7;
                                var8_9 = var6_6;
                                ** continue;
                            }
                            case 32: {
                                var6_6 = this.w(32);
                                var7_7 = this.p();
                                var5_4 = this.p();
                                ** continue;
                            }
                            case 31: {
                                var6_6 = this.w(31);
                                var7_7 = this.p();
                                var5_4 = this.w(79);
                                ** GOTO lbl27
                            }
                            case 28: 
                            case 29: 
                            case 30: {
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                block24 : switch (var2_2) {
                                    default: {
                                        this.h[23] = this.g;
                                        this.w(-1);
                                        throw new d();
                                    }
                                    case 30: {
                                        var2_2 = 30;
lbl232:
                                        // 3 sources

                                        while (true) {
                                            this.w(var2_2);
                                            break block24;
                                            break;
                                        }
                                    }
                                    case 29: {
                                        var2_2 = 29;
                                        ** GOTO lbl232
                                    }
                                    case 28: {
                                        var2_2 = 28;
                                        ** continue;
                                    }
                                }
                                var6_6 = this.d;
                                var5_4 = this.w(79);
                                var9_8 = this.q();
                                var7_7 = this.q();
                                ** continue;
                            }
                            case 27: {
                                var5_4 = this.w(27);
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                var6_6 = var5_4;
                                if (var2_2 == 59) ** GOTO lbl94
                                var6_6 = var5_4;
                                if (var2_2 != 77) ** break;
                                ** continue;
                                this.h[21] = this.g;
                                var7_7 = null;
                                var6_6 = var5_4;
                                ** continue;
                            }
                            case 26: {
                                var5_4 = this.w(26);
                                var8_9 = this.p();
                                var7_7 = this.p();
                                this.w(75);
                                var6_6 = this.p();
                                LasmBase.a((LasmBase.V)var7_7, (LasmBase.V)var6_6, 0);
                                ** GOTO lbl201
                            }
                            case 15: {
                                var5_4 = this.w(15);
                                var8_9 = this.p();
                                var7_7 = this.w(79);
                                var6_6 = this.w(79);
lbl275:
                                // 2 sources

                                while (true) {
                                    var10_10 = var8_9;
                                    var11_11 = var7_7;
                                    var9_8 = var6_6;
                                    var7_7 = null;
                                    var8_9 = null;
                                    var6_6 = var5_4;
                                    var5_4 = var11_11;
                                    break block126;
                                    break;
                                }
                            }
                            case 14: 
                            case 17: 
                            case 18: 
                            case 19: 
                            case 20: 
                            case 21: 
                            case 22: 
                            case 43: 
                            case 45: 
                            case 46: 
                            case 47: 
                            case 48: 
                            case 49: {
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 == 14) ** GOTO lbl337
                                if (var2_2 == 43) ** GOTO lbl335
                                block29 : switch (var2_2) {
                                    default: {
                                        switch (var2_2) {
                                            default: {
                                                this.h[19] = this.g;
                                                this.w(-1);
                                                throw new d();
                                            }
                                            case 49: {
                                                var2_2 = 49;
                                            }
lbl300:
                                            // 2 sources

                                            while (true) {
                                                this.w(var2_2);
                                                ** GOTO lbl339
                                                break;
                                            }
                                            case 48: {
                                                var2_2 = 48;
                                                break block29;
                                            }
                                            case 47: {
                                                var2_2 = 47;
                                                break block29;
                                            }
                                            case 46: {
                                                var2_2 = 46;
                                                break block29;
                                            }
                                            case 45: 
                                        }
                                        var2_2 = 45;
                                        break;
                                    }
                                    case 22: {
                                        var2_2 = 22;
                                        break;
                                    }
                                    case 21: {
                                        var2_2 = 21;
                                        break;
                                    }
                                    case 20: {
                                        var2_2 = 20;
                                        break;
                                    }
                                    case 19: {
                                        var2_2 = 19;
                                        break;
                                    }
                                    case 18: {
                                        var2_2 = 18;
                                        break;
                                    }
                                    case 17: {
                                        var2_2 = 17;
                                        break;
                                    }
                                }
                                ** GOTO lbl300
lbl335:
                                // 1 sources

                                var2_2 = 43;
                                ** continue;
lbl337:
                                // 1 sources

                                this.w(14);
lbl339:
                                // 2 sources

                                var5_4 = this.d;
                                var8_9 = this.p();
lbl341:
                                // 2 sources

                                while (true) {
                                    var7_7 = this.q();
lbl343:
                                    // 3 sources

                                    while (true) {
                                        var6_6 = this.q();
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                            }
                            case 13: {
                                var5_4 = this.w(13);
lbl348:
                                // 2 sources

                                while (true) {
                                    var6_6 = this.p();
                                    var7_7 = this.s();
                                    break block0;
                                    break;
                                }
                            }
                            case 12: {
                                var5_4 = this.w(12);
                                var8_9 = this.s();
                                ** continue;
                            }
                            case 11: 
                            case 16: {
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 == 11) ** GOTO lbl369
                                if (var2_2 == 16) {
                                    this.w(16);
                                } else {
                                    this.h[17] = this.g;
                                    this.w(-1);
                                    throw new d();
lbl369:
                                    // 1 sources

                                    this.w(11);
                                }
                                var5_4 = this.d;
                                var8_9 = this.p();
                                var7_7 = this.p();
                                ** GOTO lbl343
                            }
                            case 10: {
                                var5_4 = this.w(10);
                                var8_9 = this.p();
                                var7_7 = this.s();
                                ** continue;
                            }
                            case 9: {
                                var5_4 = this.w(9);
                                ** continue;
                            }
                            case 8: 
                            case 38: {
                                var2_2 = var4_5 = this.f;
                                if (var4_5 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 == 8) ** GOTO lbl396
                                if (var2_2 == 38) {
                                    this.w(38);
                                } else {
                                    this.h[16] = this.g;
                                    this.w(-1);
                                    throw new d();
lbl396:
                                    // 1 sources

                                    this.w(8);
                                }
                                var5_4 = this.d;
                                var9_8 = this.p();
                                this.w(75);
                                var7_7 = this.p();
                                var2_2 = var3_3;
                                if (var5_4.a == 38) {
                                    var2_2 = 2;
                                }
                                LasmBase.a((LasmBase.V)var9_8, (LasmBase.V)var7_7, var2_2);
                                ** continue;
                            }
                            case 7: {
                                var5_4 = this.w(7);
                                var7_7 = this.p();
                                var9_8 = this.w(79);
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 != 55) {
                                    this.h[15] = this.g;
                                    var6_6 = var5_4;
                                    var5_4 = var9_8;
                                    ** continue;
                                }
                                var6_6 = this.w(55);
                                var8_9 = var7_7;
                                var7_7 = var9_8;
                                ** continue;
                            }
                            case 6: {
                                var5_4 = this.w(6);
                                var6_6 = this.p();
                                var7_7 = this.n();
                                break;
                            }
                            case 5: 
                            case 23: 
                            case 24: 
                            case 25: 
                            case 44: {
                                var2_2 = var3_3 = this.f;
                                if (var3_3 == -1) {
                                    var2_2 = this.A();
                                }
                                if (var2_2 == 5) ** GOTO lbl456
                                if (var2_2 == 44) ** GOTO lbl454
                                switch (var2_2) {
                                    default: {
                                        this.h[20] = this.g;
                                        this.w(-1);
                                        throw new d();
                                    }
                                    case 25: {
                                        var2_2 = 25;
lbl443:
                                        // 3 sources

                                        while (true) {
                                            this.w(var2_2);
                                            ** GOTO lbl458
                                            break;
                                        }
                                    }
                                    case 24: {
                                        var2_2 = 24;
                                        break;
                                    }
                                    case 23: {
                                        var2_2 = 23;
                                        break;
                                    }
                                }
                                ** GOTO lbl443
lbl454:
                                // 1 sources

                                var2_2 = 44;
                                ** GOTO lbl443
lbl456:
                                // 1 sources

                                var2_2 = 5;
                                ** continue;
lbl458:
                                // 1 sources

                                var5_4 = this.d;
                                var6_6 = this.p();
                                var7_7 = this.p();
                                break;
                            }
                        }
                        ** continue;
                    }
                    this.w(53);
                    this.w(88);
                    var6_6 = this.w(79);
                    this.w(89);
                    var5_4 = this.w(80);
                    var7_7 = null;
                    var8_9 = null;
                    var9_8 = null;
                    ** continue;
                }
                while (true) {
                    this.w(74);
                    var2_2 = var3_3 = this.f;
                    if (var3_3 == -1) {
                        var2_2 = this.A();
                    }
                    if (var2_2 != 71) {
                        this.h[33] = this.g;
                        var1_1.h((f)var6_6, (LuaValue)var10_10, (LuaValue)var7_7, (LuaValue)var8_9, (f)var5_4, (f)var9_8);
                        return;
                    }
                    this.w(71);
                    var11_11 = this.p();
                    this.w(81);
                    var1_1.l((LasmBase.V)var11_11, this.d, 1);
                }
            }
            var2_2 = var3_3 = this.f;
            if (var3_3 == -1) {
                var2_2 = this.A();
            }
            if (var2_2 != 69) {
                if (var2_2 != 70) {
                    if (var2_2 == 76) {
                        this.w(76);
                        var1_1.e(this.d);
                        while (true) {
                            this.w(74);
                            var2_2 = var3_3 = this.f;
                            if (var3_3 == -1) {
                                var2_2 = this.A();
                            }
                            if (var2_2 != 71) {
                                this.h[11] = this.g;
                                continue block49;
                            }
                            this.w(71);
                            var5_4 = this.p();
                            this.w(81);
                            var1_1.l((LasmBase.V)var5_4, this.d, 0);
                        }
                    }
                    this.h[14] = this.g;
                    this.w(-1);
                    throw new d();
                }
                this.w(70);
                var5_4 = this.p();
                this.w(81);
                var1_1.q((LasmBase.V)var5_4, this.d);
                while (true) {
                    this.w(74);
                    var2_2 = var3_3 = this.f;
                    if (var3_3 == -1) {
                        var2_2 = this.A();
                    }
                    if (var2_2 != 71) {
                        this.h[12] = this.g;
                        continue block49;
                    }
                    this.w(71);
                    var5_4 = this.p();
                    this.w(81);
                    var1_1.l((LasmBase.V)var5_4, this.d, 0);
                }
            }
            this.w(69);
            this.w(79);
            var1_1.f(this.d);
            while (true) {
                this.w(74);
                var2_2 = var3_3 = this.f;
                if (var3_3 == -1) {
                    var2_2 = this.A();
                }
                if (var2_2 != 71) {
                    this.h[13] = this.g;
                    continue block49;
                }
                this.w(71);
                var5_4 = this.p();
                this.w(81);
                var1_1.l((LasmBase.V)var5_4, this.d, 0);
            }
            break;
        }
    }

    public final LasmBase.V p() {
        int n3;
        int n4 = n3 = this.f;
        if (n3 == -1) {
            n4 = this.A();
        }
        n3 = 59;
        if (n4 != 59) {
            n3 = 77;
            if (n4 == 77) {
            } else {
                this.h[7] = this.g;
                this.w(-1);
                throw new d();
            }
        }
        this.w(n3);
        return new LasmBase.V(this.d);
    }

    /*
     * Exception decompiling
     */
    public final LuaValue q() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final LasmBase.Internal r() {
        void var3_5;
        int n3;
        int n4 = n3 = this.f;
        if (n3 == -1) {
            n4 = this.A();
        }
        if (n4 != 59 && n4 != 77) {
            if (n4 == 78) {
                LasmBase.U u3 = this.s();
                return var3_5;
            }
            this.h[6] = this.g;
            this.w(-1);
            throw new d();
        }
        LasmBase.V v3 = this.p();
        return var3_5;
    }

    public final LasmBase.U s() {
        this.w(78);
        return new LasmBase.U(this.d);
    }

    public final void t(b b4) {
        int n3;
        this.w(68);
        LasmBase.Internal internal = this.r();
        int n4 = n3 = this.f;
        if (n3 == -1) {
            n4 = this.A();
        }
        n3 = 56;
        if (n4 != 56) {
            n3 = 81;
            if (n4 == 81) {
            } else {
                this.h[9] = this.g;
                this.w(-1);
                throw new d();
            }
        }
        f f4 = this.w(n3);
        this.w(74);
        b4.i(internal, f4);
    }

    public final h u() {
        int n3;
        int n4 = n3 = this.f;
        if (n3 == -1) {
            n4 = this.A();
        }
        if (n4 != 74) {
            this.h[0] = this.g;
        } else {
            this.w(74);
        }
        b b4 = this.k();
        this.w(0);
        return b4;
    }

    public d v() {
        Object object;
        this.i.clear();
        boolean[] blArray = new boolean[90];
        int n3 = this.k;
        if (n3 >= 0) {
            blArray[n3] = true;
            this.k = -1;
        }
        int n4 = 0;
        for (n3 = 0; n3 < 34; ++n3) {
            if (this.h[n3] != this.g) continue;
            for (int i3 = 0; i3 < 32; ++i3) {
                int n5 = l[n3];
                int n6 = 1 << i3;
                if ((n5 & n6) != 0) {
                    blArray[i3] = true;
                }
                if ((m[n3] & n6) != 0) {
                    blArray[i3 + 32] = true;
                }
                if ((n[n3] & n6) == 0) continue;
                blArray[i3 + 64] = true;
            }
        }
        for (n3 = 0; n3 < 90; ++n3) {
            if (!blArray[n3]) continue;
            object = new int[1];
            this.j = (int[])object;
            object[0] = (int[])n3;
            this.i.add(object);
        }
        object = new int[this.i.size()][];
        for (n3 = n4; n3 < this.i.size(); ++n3) {
            object[n3] = (int[])this.i.get(n3);
        }
        return new d(this.d, (int[][])object, e.a.a);
    }
}

