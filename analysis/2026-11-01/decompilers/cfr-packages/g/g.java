/*
 * Decompiled with CFR 0.152.
 */
package g;

import g.a;
import g.c;
import g.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Hashtable;
import luaj.LuaDouble;
import luaj.LuaLong;
import luaj.LuaString;
import luaj.LuaValue;

public class g
extends a {
    protected static final String[] r;
    private static final Hashtable s;
    static final String[] t;
    static final Hashtable u;
    static g[] v;
    int b;
    int c;
    int d;
    final i e = new i();
    final i f = new i();
    g.c g;
    h.a h;
    InputStream i;
    char[] j;
    int k;
    d l = new d();
    LuaString m;
    LuaString n;
    byte o;
    private b p = new b();
    private final int[] q = new int[24];

    static {
        Object object;
        int n3;
        r = new String[]{"(for control)", "(for generator)", "(for index)", "(for limit)", "(for state)", "(for step)", "break"};
        s = new Hashtable();
        for (n3 = 0; n3 < ((String[])(object = r)).length; ++n3) {
            s.put(object[n3], Boolean.TRUE);
        }
        t = new String[]{"and", "break", "do", "else", "elseif", "end", "false", "for", "function", "goto", "if", "in", "local", "nil", "not", "or", "repeat", "return", "then", "true", "until", "while", "//", "..", "...", "==", ">=", "<=", "~=", "<<", ">>", "::", "<eof>", "<number>", "<integer>", "<name>", "<string>"};
        u = new Hashtable();
        for (n3 = 0; n3 < 22; ++n3) {
            object = LuaValue.K2(t[n3]);
            u.put(object, n3 + 257);
        }
        v = new g[]{new g(60, 60), new g(60, 60), new g(70, 70), new g(70, 70), new g(70, 70), new g(100, 90), new g(50, 40), new g(30, 30), new g(30, 30), new g(30, 30), new g(30, 30), new g(30, 30), new g(30, 30), new g(20, 20), new g(10, 10), new g(70, 70), new g(36, 36), new g(32, 32), new g(34, 34), new g(38, 38), new g(38, 38)};
    }

    public g(h.a a4, InputStream inputStream) {
        this.i = inputStream;
        this.j = new char[32];
        this.h = a4;
    }

    private void B1() {
        if (this.b == 35) {
            while (!this.j0() && this.b != -1) {
                this.h1();
            }
        }
    }

    public static int H0(int n3) {
        n3 = n3 <= 57 ? (n3 -= 48) : (n3 <= 70 ? (n3 -= 55) : (n3 -= 87));
        return n3;
    }

    public static boolean K0(String string2) {
        return s.containsKey(string2);
    }

    public static boolean L0(int n3) {
        boolean bl = n3 >= 48 && n3 <= 57 || n3 >= 97 && n3 <= 122 || n3 >= 65 && n3 <= 90 || n3 == 95;
        return bl;
    }

    private static final String M(Object object) {
        return g.g.N(String.valueOf(object));
    }

    public static boolean M0(int n3) {
        boolean bl = n3 >= 97 && n3 <= 122 || n3 >= 65 && n3 <= 90;
        return bl;
    }

    private static final String N(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\'');
        stringBuilder.append(string2);
        stringBuilder.append('\'');
        return stringBuilder.toString();
    }

    private static boolean N0(int n3) {
        boolean bl = n3 < 32 || n3 == 255;
        return bl;
    }

    public static boolean O0(int n3) {
        boolean bl = n3 >= 48 && n3 <= 57;
        return bl;
    }

    public static boolean P0(int n3) {
        boolean bl = n3 >= 0 && n3 <= 32;
        return bl;
    }

    public static boolean Q0(int n3) {
        boolean bl = n3 >= 48 && n3 <= 57 || n3 >= 97 && n3 <= 102 || n3 >= 65 && n3 <= 70;
        return bl;
    }

    static int Z0(int n3) {
        int n4 = 0;
        while (n3 >= 16) {
            n3 = n3 + 1 >> 1;
            ++n4;
        }
        if (n3 < 8) {
            return n3;
        }
        return n3 - 8 | n4 + 1 << 3;
    }

    void A0(k k3, int n3) {
        g.c c4 = this.g;
        k k4 = new k();
        i i3 = this.e;
        int n4 = i3.a;
        boolean bl = false;
        if (n4 != 40) {
            if (n4 != 123) {
                if (n4 != 293) {
                    this.J1("function arguments expected");
                    return;
                }
                this.g0(k4, i3.b.b);
                this.g1();
            } else {
                this.i0(k4);
            }
        } else {
            this.g1();
            if (this.e.a == 41) {
                k4.a = 0;
            } else {
                this.q0(k4);
                c4.h1(k4);
            }
            this.Z(41, 40, n3);
        }
        if (k3.a == 6) {
            bl = true;
        }
        g.a.C(bl);
        int n5 = k3.b.e;
        if (this.G0(k4.a)) {
            n4 = -1;
        } else {
            if (k4.a != 0) {
                c4.o0(k4);
            }
            n4 = c4.p - (n5 + 1);
        }
        k3.b(12, c4.T(29, n5, n4 + 1, 2));
        c4.s0(n3);
        c4.p = (short)(n5 + 1);
    }

    void A1(k k3) {
        LuaString luaString = this.G1();
        g.c c4 = this.g;
        boolean bl = true;
        if (g.c.k1(c4, luaString, k3, 1) == 0) {
            k k4 = new k();
            g.c.k1(c4, this.n, k3, 1);
            int n3 = k3.a;
            boolean bl2 = bl;
            if (n3 != 7) {
                bl2 = n3 == 8 ? bl : false;
            }
            g.a.C(bl2);
            this.g0(k4, luaString);
            c4.E0(k3, k4);
        }
    }

    boolean B0(k k3) {
        boolean bl;
        int n3;
        this.A1(k3);
        while ((n3 = this.e.a) == 46) {
            this.t0(k3);
        }
        if (n3 == 58) {
            this.t0(k3);
            bl = true;
        } else {
            bl = false;
        }
        return bl;
    }

    void C0(int n3) {
        k k3 = new k();
        k k4 = new k();
        this.g1();
        this.U(k4, this.B0(k3), n3);
        this.g.l1(k3, k4);
        this.g.s0(n3);
    }

    int C1() {
        int n3;
        int n4 = this.b;
        this.w1();
        int n5 = 0;
        while ((n3 = this.b) == 61) {
            this.w1();
            ++n5;
        }
        if (n3 != n4) {
            n5 = -n5 - 1;
        }
        return n5;
    }

    int D0(int n3) {
        if (n3 != 37) {
            if (n3 != 38) {
                if (n3 != 42) {
                    if (n3 != 43) {
                        if (n3 != 45) {
                            if (n3 != 47) {
                                if (n3 != 60) {
                                    if (n3 != 62) {
                                        if (n3 != 94) {
                                            if (n3 != 124) {
                                                if (n3 != 126) {
                                                    if (n3 != 257) {
                                                        if (n3 != 272) {
                                                            if (n3 != 279) {
                                                                if (n3 != 280) {
                                                                    switch (n3) {
                                                                        default: {
                                                                            return 21;
                                                                        }
                                                                        case 287: {
                                                                            return 20;
                                                                        }
                                                                        case 286: {
                                                                            return 19;
                                                                        }
                                                                        case 285: {
                                                                            return 7;
                                                                        }
                                                                        case 284: {
                                                                            return 10;
                                                                        }
                                                                        case 283: {
                                                                            return 12;
                                                                        }
                                                                        case 282: 
                                                                    }
                                                                    return 8;
                                                                }
                                                                return 6;
                                                            }
                                                            return 15;
                                                        }
                                                        return 14;
                                                    }
                                                    return 13;
                                                }
                                                return 18;
                                            }
                                            return 17;
                                        }
                                        return 5;
                                    }
                                    return 11;
                                }
                                return 9;
                            }
                            return 3;
                        }
                        return 1;
                    }
                    return 0;
                }
                return 2;
            }
            return 16;
        }
        return 4;
    }

    void D1() {
        int n3;
        while ((n3 = this.e.a) == 59 || n3 == 288) {
            this.E1();
        }
        return;
    }

    int E0(int n3) {
        if (n3 != 35) {
            if (n3 != 45) {
                if (n3 != 126) {
                    if (n3 != 271) {
                        return 3;
                    }
                    return 1;
                }
                return 4;
            }
            return 0;
        }
        return 2;
    }

    /*
     * Unable to fully structure code
     */
    void E1() {
        block12: {
            block8: {
                block9: {
                    block10: {
                        block11: {
                            var1_1 = this.c;
                            this.k0();
                            var2_2 = this.e.a;
                            if (var2_2 == 59) break block8;
                            if (var2_2 == 269) break block9;
                            if (var2_2 == 278) break block10;
                            if (var2_2 == 288) break block11;
                            if (var2_2 == 258) ** GOTO lbl-1000
                            if (var2_2 == 259) ** GOTO lbl30
                            if (var2_2 == 273) ** GOTO lbl28
                            if (var2_2 == 274) ** GOTO lbl25
                            switch (var2_2) {
                                default: {
                                    this.s0();
                                    break;
                                }
                                case 267: {
                                    this.I0(var1_1);
                                    break;
                                }
                                case 265: {
                                    this.C0(var1_1);
                                    break;
                                }
                                case 264: {
                                    this.z0(var1_1);
                                    break;
                                }
lbl25:
                                // 1 sources

                                this.g1();
                                this.u1();
                                break;
lbl28:
                                // 1 sources

                                this.t1(var1_1);
                                break;
lbl30:
                                // 1 sources

                                this.g1();
                                this.S();
                                this.Z(262, 259, var1_1);
                                break;
                                case 266: lbl-1000:
                                // 2 sources

                                {
                                    this.F0(this.g.H0());
                                    break;
                                }
                            }
                            break block12;
                        }
                        this.g1();
                        this.R0(this.G1(), var1_1);
                        break block12;
                    }
                    this.P1(var1_1);
                    break block12;
                }
                this.g1();
                if (this.L1(265)) {
                    this.W0();
                } else {
                    this.X0();
                }
                break block12;
            }
            this.g1();
        }
        var4_3 = this.g;
        var1_1 = var4_3.b.l;
        var2_2 = var4_3.p;
        var3_4 = var1_1 >= var2_2 && var2_2 >= var4_3.n;
        g.a.C(var3_4);
        var4_3 = this.g;
        var4_3.p = var4_3.n;
        this.S0();
    }

    void F0(int n3) {
        LuaString luaString;
        int n4 = this.c;
        if (this.L1(266)) {
            luaString = this.G1();
        } else {
            this.g1();
            luaString = LuaString.K2("break");
        }
        d d4 = this.l;
        f[] fArray = g.a.D(d4.c, d4.d + 1);
        d4.c = fArray;
        d4 = this.l;
        int n5 = d4.d;
        d4.d = n5 + 1;
        this.v0(this.d1(fArray, n5, luaString, n4, n3));
    }

    void F1() {
        while (!this.T(true)) {
            int n3 = this.e.a;
            this.E1();
            if (n3 != 274) continue;
        }
    }

    boolean G0(int n3) {
        boolean bl = n3 == 12 || n3 == 13;
        return bl;
    }

    LuaString G1() {
        this.W(292);
        LuaString luaString = this.e.b.b;
        this.g1();
        return luaString;
    }

    int H1(k k3, int n3) {
        int n4;
        this.k0();
        int n5 = this.E0(this.e.a);
        if (n5 != 3) {
            n4 = this.c;
            this.g1();
            this.H1(k3, 80);
            this.g.Y0(n5, k3, n4);
        } else {
            this.z1(k3);
        }
        n5 = this.D0(this.e.a);
        while (n5 != 21 && g.g.v[n5].a > n3) {
            k k4 = new k();
            int n6 = this.c;
            this.g1();
            this.g.F0(n5, k3);
            n4 = this.H1(k4, g.g.v[n5].b);
            this.g.X0(n5, k3, k4, n6);
            n5 = n4;
        }
        this.S0();
        return n5;
    }

    void I0(int n3) {
        g.e e4 = new g.e(-1);
        do {
            this.K1(e4);
        } while (this.e.a == 261);
        if (this.L1(260)) {
            this.S();
        }
        this.Z(262, 267, n3);
        this.g.W0(e4.a);
    }

    /*
     * Enabled aggressive block sorting
     */
    void I1(k k3) {
        int n3 = this.c;
        this.k1(k3);
        while (true) {
            block8: {
                block7: {
                    int n4;
                    if ((n4 = this.e.a) == 40) break block7;
                    if (n4 != 46) {
                        k k4;
                        if (n4 != 58) {
                            if (n4 != 91) {
                                if (n4 != 123 && n4 != 293) {
                                    return;
                                }
                                break block7;
                            } else {
                                k4 = new k();
                                this.g.n0(k3);
                                this.Q1(k4);
                                this.g.E0(k3, k4);
                                continue;
                            }
                        }
                        k4 = new k();
                        this.g1();
                        this.b0(k4);
                        this.g.f1(k3, k4);
                        break block8;
                    } else {
                        this.t0(k3);
                        continue;
                    }
                }
                this.g.o0(k3);
            }
            this.A0(k3, n3);
        }
    }

    void J0() {
        int n3 = this.b;
        g.a.C(this.j0());
        this.h1();
        if (this.j0() && this.b != n3) {
            this.h1();
        }
        this.c = n3 = this.c + 1;
        if (n3 >= 0x7FFFFFFD) {
            this.J1("chunk has too many lines (> 2147483645)");
        }
    }

    void J1(String string2) {
        this.T0(string2, this.e.a);
    }

    void K1(g.e e4) {
        Object object = new k();
        c.a a4 = new c.a();
        this.g1();
        this.r0((k)object);
        this.c0(275);
        int n3 = this.e.a;
        if (n3 != 266 && n3 != 258) {
            this.g.C0((k)object);
            this.g.j0(a4, false);
            n3 = ((k)object).d.a;
        } else {
            this.g.B0((k)object);
            this.g.j0(a4, false);
            this.F0(((k)object).c.a);
            this.D1();
            if (this.T(false)) {
                this.g.K0();
                return;
            }
            n3 = this.g.H0();
        }
        this.F1();
        this.g.K0();
        int n4 = this.e.a;
        if (n4 == 260 || n4 == 261) {
            object = this.g;
            ((g.c)object).c0(e4, ((g.c)object).H0());
        }
        this.g.W0(n3);
    }

    boolean L1(int n3) {
        if (this.e.a == n3) {
            this.g1();
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    String M1(int n3) {
        if (n3 < 257) {
            CharSequence charSequence;
            h.a a4;
            if (g.g.N0(n3)) {
                a4 = this.h;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("'<\\");
                ((StringBuilder)charSequence).append(n3);
                ((StringBuilder)charSequence).append(">' (symbol with decimal code ");
                ((StringBuilder)charSequence).append(n3);
                ((StringBuilder)charSequence).append(" or 0x");
                ((StringBuilder)charSequence).append(Integer.toHexString(n3));
                ((StringBuilder)charSequence).append(")");
                charSequence = ((StringBuilder)charSequence).toString();
                return a4.e((String)charSequence);
            }
            a4 = this.h;
            charSequence = String.valueOf((char)n3);
            return a4.e((String)charSequence);
        }
        String string2 = t[n3 - 257];
        switch (n3) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append('\'');
                stringBuilder.append(string2);
                stringBuilder.append('\'');
                return stringBuilder.toString();
            }
            case 289: 
            case 290: 
            case 291: 
            case 292: 
            case 293: 
        }
        return string2;
    }

    String N1(int n3) {
        switch (n3) {
            default: {
                return this.M1(n3);
            }
            case 290: 
            case 291: 
            case 292: 
            case 293: 
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\'');
        stringBuilder.append(new String(this.j, 0, this.k));
        stringBuilder.append('\'');
        return stringBuilder.toString();
    }

    luaj.h O() {
        luaj.h[] hArray = this.g;
        Object object = hArray.b;
        luaj.h[] hArray2 = ((luaj.h)object).c;
        if (hArray2 == null || hArray.k >= hArray2.length) {
            ((luaj.h)object).c = g.a.L(hArray2, Math.max(1, hArray.k * 2));
        }
        hArray = ((luaj.h)object).c;
        object = this.g;
        int n3 = ((g.c)object).k;
        ((g.c)object).k = n3 + 1;
        hArray[n3] = object = new luaj.h();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    void O1(f object, g.c object2, c.a object3) {
        Object object4;
        this.c = ((f)object).c;
        String string2 = ((f)object).a.g0();
        boolean bl = g.g.K0(string2);
        object2 = this.h;
        if (bl) {
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("<");
            ((StringBuilder)object4).append(((f)object).a);
            ((StringBuilder)object4).append("> at line ");
            ((StringBuilder)object4).append(((f)object).c);
            ((StringBuilder)object4).append(" not inside a loop");
        } else {
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("no visible label '");
            ((StringBuilder)object4).append(((f)object).a);
            ((StringBuilder)object4).append("' for <goto> at line ");
            ((StringBuilder)object4).append(((f)object).c);
        }
        object = ((StringBuilder)object4).toString();
        object2 = object = ((h.a)object2).e((String)object);
        if (!bl) {
            object4 = this.l;
            int n3 = ((c.a)object3).b;
            while (true) {
                object2 = object;
                if (n3 >= ((d)object4).f) break;
                object3 = ((d)object4).e[n3];
                object2 = object;
                if (object3 != null) {
                    object2 = ((f)object3).a;
                    if (object2 == null) {
                        object2 = object;
                    } else {
                        String string3 = ((LuaString)object2).g0();
                        object2 = object;
                        if (string3.equalsIgnoreCase(string2)) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append((String)object);
                            ((StringBuilder)object2).append("\ndid you mean label '");
                            ((StringBuilder)object2).append(string3);
                            ((StringBuilder)object2).append("' at line ");
                            ((StringBuilder)object2).append(((f)object3).c);
                            ((StringBuilder)object2).append('?');
                            object2 = ((StringBuilder)object2).toString();
                        }
                    }
                }
                ++n3;
                object = object2;
            }
        }
        this.x1((String)object2);
    }

    void P(int n3, int n4, k k3) {
        g.c c4 = this.g;
        n3 -= n4;
        if (this.G0(k3.a)) {
            n3 = n4 = n3 + 1;
            if (n4 < 0) {
                n3 = 0;
            }
            c4.j1(k3, n3);
            if (n3 > 1) {
                c4.b1(n3 - 1);
            }
        } else {
            if (k3.a != 0) {
                c4.o0(k3);
            }
            if (n3 > 0) {
                n4 = c4.p;
                c4.b1(n3);
                c4.P0(n4, n3);
            }
        }
    }

    void P1(int n3) {
        g.c c4 = this.g;
        c.a a4 = new c.a();
        this.g1();
        int n4 = c4.z0();
        int n5 = this.h0();
        c4.j0(a4, true);
        this.c0(259);
        this.S();
        c4.T0(c4.H0(), n4);
        this.Z(262, 278, n3);
        c4.K0();
        c4.W0(n5);
    }

    void Q(int n3) {
        g.c c4 = this.g;
        c4.n = (short)(c4.n + n3);
        while (n3 > 0) {
            c4.A0((int)(c4.n - n3)).b = c4.g;
            --n3;
        }
    }

    void Q1(k k3) {
        this.g1();
        this.r0(k3);
        this.g.q0(k3);
        this.c0(93);
    }

    /*
     * Unable to fully structure code
     */
    void R(e var1_1, int var2_2) {
        block8: {
            block7: {
                block6: {
                    var5_3 = new k();
                    var3_4 = var1_1.b.a;
                    var4_5 = 7 <= var3_4 && var3_4 <= 9;
                    this.X(var4_5, "syntax error");
                    if (!this.L1(44)) break block6;
                    var6_6 = new e();
                    var6_6.a = var1_1;
                    this.I1(var6_6.b);
                    var7_8 = var6_6.b;
                    if (var7_8.a != 9) {
                        this.Y(var1_1, var7_8);
                    }
                    this.R(var6_6, var2_2 + 1);
                    break block7;
                }
                this.c0(61);
                var3_4 = this.q0(var5_3);
                if (var3_4 == var2_2) break block8;
                this.P(var2_2, var3_4, var5_3);
                if (var3_4 > var2_2) {
                    var6_7 = this.g;
                    var6_7.p = (short)(var6_7.p - (var3_4 - var2_2));
                }
            }
            var5_3.b(6, this.g.p - 1);
lbl24:
            // 2 sources

            while (true) {
                this.g.l1(var1_1.b, var5_3);
                return;
            }
        }
        this.g.i1(var5_3);
        ** while (true)
    }

    void R0(LuaString luaString, int n3) {
        f[] fArray = this.g;
        d d4 = this.l;
        fArray.P(d4.e, d4.f, luaString);
        this.c0(288);
        d4 = this.l;
        fArray = g.a.D(d4.e, d4.f + 1);
        d4.e = fArray;
        d4 = this.l;
        int n4 = d4.f;
        d4.f = n4 + 1;
        n3 = this.d1(fArray, n4, luaString, n3, this.g.z0());
        this.D1();
        if (this.T(false)) {
            this.l.e[n3].d = this.g.f.d;
        }
        this.u0(this.l.e[n3]);
    }

    void S() {
        g.c c4 = this.g;
        c4.j0(new c.a(), false);
        this.F1();
        c4.K0();
    }

    void S0() {
        h.a a4 = this.h;
        --a4.a;
    }

    boolean T(boolean bl) {
        int n3 = this.e.a;
        if (n3 != 277) {
            if (n3 != 289) {
                switch (n3) {
                    default: {
                        return false;
                    }
                    case 260: 
                    case 261: 
                    case 262: 
                }
            }
            bl = true;
        }
        return bl;
    }

    void T0(String object, int n3) {
        String string2 = luaj.b.m(this.m.g0());
        Object object2 = this.h;
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(':');
        ((StringBuilder)charSequence).append(this.c);
        ((StringBuilder)charSequence).append(": ");
        ((StringBuilder)charSequence).append((String)object);
        ((h.a)object2).e(((StringBuilder)charSequence).toString());
        charSequence = object;
        if (n3 != 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(" near ");
            ((StringBuilder)charSequence).append(this.N1(n3));
            charSequence = ((StringBuilder)charSequence).toString();
            object = this.h;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("syntax error: ");
            ((StringBuilder)object2).append((String)charSequence);
            ((h.a)object).e(((StringBuilder)object2).toString());
        }
        throw new luaj.d(string2, this.c, (String)charSequence);
    }

    void U(k k3, boolean bl, int n3) {
        luaj.h h4;
        g.c c4 = new g.c();
        c.a a4 = new c.a();
        c4.b = h4 = this.O();
        h4.h = n3;
        this.i1(c4, a4);
        this.c0(40);
        if (bl) {
            this.c1("self");
            this.Q(1);
        }
        this.j1();
        this.c0(41);
        this.F1();
        c4.b.i = this.c;
        this.Z(262, 265, n3);
        this.f0(k3);
        this.d0();
    }

    void U0(c c4) {
        this.r0(c4.a);
        this.g.O(c4.d, 0x7FFFFFFD, "items in a constructor");
        ++c4.d;
        ++c4.e;
    }

    void V() {
        LuaString luaString = LuaString.K2("break");
        d d4 = this.l;
        f[] fArray = g.a.D(d4.e, d4.f + 1);
        d4.e = fArray;
        d4 = this.l;
        int n3 = d4.f;
        d4.f = n3 + 1;
        n3 = this.d1(fArray, n3, luaString, 0, this.g.g);
        this.u0(this.l.e[n3]);
    }

    /*
     * Exception decompiling
     */
    int V0(h var1_1) {
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

    void W(int n3) {
        if (this.e.a != n3) {
            this.l0(n3);
        }
    }

    void W0() {
        k k3 = new k();
        g.c c4 = this.g;
        this.b1(this.G1());
        this.Q(1);
        this.U(k3, false, this.c);
        c4.A0((int)(c4.n - 1)).b = c4.g;
    }

    void X(boolean bl, String string2) {
        if (!bl) {
            this.J1(string2);
        }
    }

    void X0() {
        int n3;
        k k3 = new k();
        int n4 = 0;
        int n5 = 0;
        do {
            this.b1(this.G1());
            n5 = n3 = n5 + 1;
        } while (this.L1(44));
        if (this.L1(61)) {
            n5 = this.q0(k3);
        } else {
            k3.a = 0;
            n5 = n4;
        }
        this.P(n3, n5, k3);
        this.Q(n3);
    }

    void Y(e e4, k k3) {
        g.c c4 = this.g;
        short s3 = c4.p;
        int n3 = 0;
        while (e4 != null) {
            Object object = e4.b;
            int n4 = n3;
            if (((k)object).a == 9) {
                object = ((k)object).b;
                n4 = ((k.a)object).c;
                int n5 = k3.a;
                int n6 = n3;
                if (n4 == n5) {
                    n6 = n3;
                    if (((k.a)object).b == k3.b.e) {
                        ((k.a)object).c = (short)7;
                        ((k.a)object).b = s3;
                        n6 = 1;
                    }
                }
                n4 = n6;
                if (n5 == 7) {
                    n4 = n6;
                    if (((k.a)object).a == k3.b.e) {
                        ((k.a)object).a = s3;
                        n4 = 1;
                    }
                }
            }
            e4 = e4.a;
            n3 = n4;
        }
        if (n3 != 0) {
            n3 = k3.a == 7 ? 0 : 5;
            c4.T(n3, s3, k3.b.e, 0);
            c4.b1(1);
        }
    }

    void Y0() {
        boolean bl = this.f.a == 289;
        g.a.C(bl);
        i i3 = this.f;
        i3.a = this.V0(i3.b);
    }

    void Z(int n3, int n4, int n5) {
        if (!this.L1(n3)) {
            if (n5 == this.c) {
                this.l0(n3);
            } else {
                h.a a4 = this.h;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(g.g.N(this.M1(n3)));
                stringBuilder.append(" expected (to close ");
                stringBuilder.append(g.g.N(this.M1(n4)));
                stringBuilder.append(" at line ");
                stringBuilder.append(n5);
                stringBuilder.append(')');
                this.J1(a4.e(stringBuilder.toString()));
            }
        }
    }

    boolean a0(String string2) {
        if (string2.indexOf(this.b) < 0) {
            return false;
        }
        this.w1();
        return true;
    }

    public void a1(g.c object) {
        this.i1((g.c)object, new c.a());
        this.g.b.k = 1;
        object = new k();
        ((k)object).b(7, 0);
        this.g.O0(this.n, (k)object);
        this.g1();
        this.F1();
        this.W(289);
        this.d0();
    }

    void b0(k k3) {
        this.g0(k3, this.G1());
    }

    void b1(LuaString object) {
        int n3 = this.s1((LuaString)object);
        this.g.O(this.l.b + 1, 200, "local variables");
        j[] jArray = this.l;
        object = jArray.a;
        if (object == null || jArray.b + 1 > ((j[])object).length) {
            jArray.a = g.a.J(object, Math.max(1, jArray.b * 2));
        }
        object = this.l;
        jArray = object.a;
        int n4 = object.b;
        object.b = n4 + 1;
        jArray[n4] = new j(n3);
    }

    void c0(int n3) {
        this.W(n3);
        this.g1();
    }

    void c1(String string2) {
        this.b1(this.e1(string2));
    }

    void d0() {
        g.c c4 = this.g;
        luaj.h h4 = c4.b;
        boolean bl = false;
        c4.c1(0, 0);
        c4.K0();
        h4.b = g.a.F(h4.b, c4.g);
        h4.d = g.a.F(h4.d, c4.g);
        h4.a = g.a.K(h4.a, c4.j);
        h4.c = g.a.L(h4.c, c4.k);
        h4.e = g.a.G(h4.e, c4.m);
        h4.f = g.a.H(h4.f, c4.o);
        if (c4.f == null) {
            bl = true;
        }
        g.a.C(bl);
        this.g = c4.d;
    }

    int d1(f[] fArray, int n3, LuaString luaString, int n4, int n5) {
        fArray[n3] = new f(luaString, n5, n4, this.g.n);
        return n3;
    }

    void e0(int n3, f object) {
        g.c c4 = this.g;
        f[] fArray = this.l.c;
        f f4 = fArray[n3];
        g.a.C(f4.a.P0(((f)object).a));
        short s3 = f4.d;
        if (s3 < ((f)object).d) {
            LuaString luaString = c4.A0((int)s3).a;
            h.a a4 = this.h;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<goto ");
            stringBuilder.append(f4.a);
            stringBuilder.append("> at line ");
            stringBuilder.append(f4.c);
            stringBuilder.append(" jumps into the scope of local '");
            stringBuilder.append(luaString.g0());
            stringBuilder.append('\'');
            this.x1(a4.e(stringBuilder.toString()));
        }
        c4.T0(f4.b, ((f)object).b);
        System.arraycopy(fArray, n3 + 1, fArray, n3, this.l.d - n3 - 1);
        object = this.l;
        ((d)object).d = n3 = ((d)object).d - 1;
        fArray[n3] = null;
    }

    LuaString e1(String string2) {
        return this.h.c(string2);
    }

    void f0(k k3) {
        g.c c4 = this.g.d;
        k3.b(11, c4.U(37, 0, c4.k - 1));
        c4.o0(k3);
    }

    LuaString f1(char[] cArray, int n3, int n4) {
        return this.h.c(new String(cArray, n3, n4));
    }

    void g0(k k3, LuaString luaString) {
        k3.b(4, this.g.m1(luaString));
    }

    void g1() {
        this.d = this.c;
        i i3 = this.f;
        if (i3.a != 289) {
            this.e.a(i3);
            this.f.a = 289;
        } else {
            i3 = this.e;
            i3.a = this.V0(i3.b);
        }
    }

    int h0() {
        k k3 = new k();
        this.r0(k3);
        if (k3.a == 1) {
            k3.a = 3;
        }
        this.g.C0(k3);
        return k3.d.a;
    }

    void h1() {
        try {
            this.b = this.i.read();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            this.b = -1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void i0(k object) {
        g.c c4 = this.g;
        int n3 = this.c;
        int n4 = c4.T(11, 0, 0, 0);
        c c5 = new c();
        c5.e = 0;
        c5.c = 0;
        c5.d = 0;
        c5.b = object;
        ((k)object).b(11, n4);
        c5.a.b(0, 0);
        c4.o0((k)object);
        this.c0(123);
        do {
            block4: {
                block5: {
                    boolean bl = c5.a.a == 0 || c5.e > 0;
                    g.a.C(bl);
                    if (this.e.a == 125) break;
                    c4.R(c5);
                    int n5 = this.e.a;
                    if (n5 == 91) break block4;
                    if (n5 != 292) break block5;
                    this.Y0();
                    if (this.f.a == 61) break block4;
                }
                this.U0(c5);
                continue;
            }
            this.r1(c5);
        } while (this.L1(44) || this.L1(59));
        this.Z(125, 123, n3);
        c4.J0(c5);
        object = new g.d(c4.b.b, n4);
        g.a.x((g.d)object, g.g.Z0(c5.d));
        g.a.z((g.d)object, g.g.Z0(c5.c));
    }

    void i1(g.c c4, c.a a4) {
        c4.d = this.g;
        c4.e = this;
        this.g = c4;
        c4.g = 0;
        c4.h = -1;
        c4.i = new g.e(-1);
        c4.p = 0;
        c4.j = 0;
        c4.k = 0;
        c4.o = 0;
        c4.m = 0;
        c4.n = 0;
        c4.l = this.l.b;
        c4.f = null;
        luaj.h h4 = c4.b;
        h4.g = this.m;
        h4.l = 2;
        c4.j0(a4, false);
    }

    boolean j0() {
        int n3 = this.b;
        boolean bl = n3 == 10 || n3 == 13;
        return bl;
    }

    void j1() {
        int n3;
        int n4;
        g.c c4;
        block6: {
            c4 = this.g;
            luaj.h h4 = c4.b;
            n4 = 0;
            n3 = 0;
            h4.k = 0;
            if (this.e.a != 41) {
                n4 = n3;
                do {
                    if ((n3 = this.e.a) != 281) {
                        if (n3 != 292) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("<name> or ");
                            stringBuilder.append(g.g.M("..."));
                            stringBuilder.append(" expected");
                            this.J1(stringBuilder.toString());
                            n3 = n4;
                        } else {
                            this.b1(this.G1());
                            n3 = n4 + 1;
                        }
                    } else {
                        this.g1();
                        h4.k = 1;
                        n3 = n4;
                    }
                    n4 = n3;
                    if (h4.k != 0) break block6;
                    n4 = n3;
                } while (this.L1(44));
                n4 = n3;
            }
        }
        this.Q(n4);
        h4.j = n3 = (int)c4.n;
        c4.b1(n3);
    }

    void k0() {
        int n3;
        h.a a4 = this.h;
        a4.a = n3 = a4.a + 1;
        if (n3 > 200) {
            this.T0("chunk has too many syntax levels", 0);
        }
    }

    void k1(k k3) {
        int n3 = this.e.a;
        if (n3 != 40) {
            if (n3 != 292) {
                this.J1("unexpected symbol");
                return;
            }
            this.A1(k3);
            return;
        }
        n3 = this.c;
        this.g1();
        this.r0(k3);
        this.Z(41, 40, n3);
        this.g.i0(k3);
    }

    void l0(int n3) {
        h.a a4 = this.h;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(g.g.N(this.M1(n3)));
        stringBuilder.append(" expected");
        this.J1(a4.e(stringBuilder.toString()));
    }

    /*
     * Enabled aggressive block sorting
     */
    void l1(h h4, int n3) {
        Object object;
        this.w1();
        if (this.j0()) {
            this.J0();
        }
        boolean bl = false;
        while (!bl) {
            int n4;
            block9: {
                int n5 = this.b;
                if (n5 != -1) {
                    if (n5 != 10 && n5 != 13) {
                        n4 = 91;
                        if (n5 != 91) {
                            if (n5 != 93) {
                                if (h4 != null) {
                                    this.w1();
                                    continue;
                                }
                                this.h1();
                                continue;
                            }
                            if (this.C1() != n3) continue;
                            this.w1();
                            bl = true;
                            continue;
                        }
                        if (this.C1() != n3) continue;
                        this.w1();
                        if (n3 != 0) continue;
                        object = "nesting of [[...]] is deprecated";
                        break block9;
                    } else {
                        this.v1(10);
                        this.J0();
                        if (h4 != null) continue;
                        this.k = 0;
                        continue;
                    }
                }
                object = h4 != null ? (Object)"unfinished long string" : (Object)"unfinished long comment";
                n4 = 289;
            }
            this.T0((String)object, n4);
        }
        if (h4 != null) {
            h.a a4 = this.h;
            object = this.j;
            h4.b = a4.d(LuaString.n3((char[])object, n3 += 2, this.k - n3 * 2));
        }
    }

    void m0(int n3, String string2) {
        int n4;
        this.v1(92);
        for (int i3 = 0; i3 < n3 && (n4 = this.q[i3]) != -1; ++i3) {
            this.v1(n4);
        }
        this.T0(string2, 293);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void m1(h var1_1, boolean var2_2) {
        block13: {
            block16: {
                block15: {
                    var5_3 = this.b;
                    this.w1();
                    var6_4 = 0;
                    var5_3 = var5_3 == 48 && this.a0("Xx") != false ? 1 : 0;
                    var13_5 = var5_3 != 0 ? "Pp" : "Ee";
                    while (true) {
                        if (this.a0((String)var13_5)) {
                            this.a0("+-");
                            var2_2 = false;
                        }
                        if ((var7_7 = this.b) >= 48 && var7_7 <= 57 || var5_3 != 0 && (var7_7 >= 97 && var7_7 <= 102 || var7_7 >= 65 && var7_7 <= 70)) {
                            this.w1();
                            continue;
                        }
                        if (var7_7 != 46) break;
                        this.w1();
                        var2_2 = false;
                    }
                    var12_8 = var2_2;
                    if (var5_3 == 0) {
                        var12_8 = var2_2;
                        if (var2_2) {
                            var12_8 = var2_2;
                            if (this.k > 19) {
                                var12_8 = false;
                            }
                        }
                    }
                    if (var5_3 == 0) break block15;
                    try {
                        var13_5 = this.p;
                        var13_5.a = this.j;
                        var13_5.b = this.k;
                        var13_5 = LuaValue.N1((CharSequence)var13_5);
                        ** GOTO lbl61
                    }
                    catch (NumberFormatException var13_6) {
                        break block13;
                    }
                }
                if (!var12_8) ** GOTO lbl58
                var13_5 = this.j;
                var7_7 = this.k;
                var8_9 = 0L;
                if (var7_7 == 19) break block16;
                for (var5_3 = var6_4; var5_3 < var7_7; ++var5_3) {
                    var8_9 = var8_9 * 10L + (long)(var13_5[var5_3] - 48);
                }
                {
                    var13_5 = LuaLong.I2(var8_9);
                    ** GOTO lbl61
                }
            }
            for (var5_3 = 0; var5_3 < 18; ++var5_3) {
                var8_9 = var8_9 * 10L + (long)(var13_5[var5_3] - 48);
            }
            var10_10 = 10L * var8_9 + (long)(var13_5[18] - 48);
            if (var10_10 >= var8_9) ** GOTO lbl56
            {
                block14: {
                    var14_11 = new String((char[])var13_5, 0, var7_7);
                    var3_12 = Double.parseDouble(var14_11);
lbl53:
                    // 2 sources

                    while (true) {
                        var13_5 = LuaDouble.J2(var3_12);
                        break block14;
                        break;
                    }
lbl56:
                    // 1 sources

                    var13_5 = LuaLong.I2(var10_10);
                    break block14;
lbl58:
                    // 1 sources

                    var13_5 = new String(this.j, 0, this.k);
                    var3_12 = Double.parseDouble((String)var13_5);
                    ** continue;
                }
                var1_1.a = var13_5;
                return;
            }
        }
        var1_1 = new StringBuilder();
        var1_1.append("malformed number (");
        var1_1.append(var13_6.getMessage());
        var1_1.append(")");
        this.T0(var1_1.toString(), 290);
    }

    void n0(int n3, int n4, String string2) {
        int[] nArray = this.q;
        nArray[0] = 117;
        nArray[1] = n3;
        this.m0(n4, string2);
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    void n1(int n3, h h4) {
        block15: while (true) {
            this.w1();
            block16: while (true) {
                int n4;
                int n5;
                if ((n5 = this.b) == n3) {
                    this.w1();
                    h4.b = this.h.d(LuaString.n3(this.j, 1, this.k - 2));
                    return;
                }
                if (n5 != -1) {
                    n4 = 10;
                    if (n5 != 10 && n5 != 13) {
                        if (n5 != 92) continue block15;
                        this.h1();
                        n5 = this.b;
                        int n6 = 0;
                        block17: do {
                            switch (n6 == 0 ? n5 : n6) {
                                case 34: 
                                case 39: 
                                case 92: {
                                    continue block15;
                                }
                                case -1: {
                                    continue block16;
                                }
                                default: {
                                    if (!g.g.O0(n5)) {
                                        this.q[0] = this.b;
                                        this.m0(1, "invalid escape sequence");
                                        continue block16;
                                    }
                                    this.v1(this.o1());
                                    continue block16;
                                }
                                case 122: {
                                    block18: while (true) {
                                        this.h1();
                                        while (true) {
                                            if (!g.g.P0(this.b)) continue block16;
                                            if (!this.j0()) continue block18;
                                            this.J0();
                                        }
                                        break;
                                    }
                                }
                                case 120: {
                                    n4 = this.p1();
                                    n6 = 110;
                                    continue block17;
                                }
                                case 118: {
                                    n4 = 11;
                                    n6 = 110;
                                    continue block17;
                                }
                                case 117: {
                                    this.q1();
                                    continue block16;
                                }
                                case 116: {
                                    n4 = 9;
                                    n6 = 110;
                                    continue block17;
                                }
                                case 114: {
                                    n4 = 13;
                                    n6 = 110;
                                    continue block17;
                                }
                                case 102: {
                                    n4 = 12;
                                    n6 = 110;
                                    continue block17;
                                }
                                case 98: {
                                    n4 = 8;
                                    n6 = 110;
                                    continue block17;
                                }
                                case 97: {
                                    n4 = 7;
                                }
                                case 110: {
                                    this.v1(n4);
                                    this.h1();
                                    continue block16;
                                }
                                case 10: 
                                case 13: 
                            }
                            break;
                        } while (true);
                        this.v1(10);
                        this.J0();
                        continue;
                    }
                    n4 = 293;
                } else {
                    n4 = 289;
                }
                this.T0("unfinished string", n4);
            }
            break;
        }
    }

    void o0(int n3, String string2) {
        this.n0(123, n3, string2);
    }

    int o1() {
        int n3;
        int n4 = 0;
        for (n3 = 0; n3 < 3 && g.g.O0(this.b); ++n3) {
            int n5;
            int[] nArray = this.q;
            nArray[n3] = n5 = this.b;
            n4 = n4 * 10 + n5 - 48;
            this.h1();
        }
        if (n4 > 255) {
            this.q[n3] = this.b;
            this.m0(n3 + 1, "decimal escape too large");
        }
        return n4;
    }

    int p0() {
        k k3 = new k();
        this.r0(k3);
        int n3 = k3.a;
        this.g.o0(k3);
        return n3;
    }

    int p1() {
        int n3 = 0;
        for (int i3 = 1; i3 < 3; ++i3) {
            int n4;
            this.h1();
            int[] nArray = this.q;
            nArray[i3] = n4 = this.b;
            if (!g.g.Q0(n4)) {
                this.q[0] = 120;
                this.m0(i3 + 1, "hexadecimal digit expected");
            }
            n3 = (n3 << 4) + g.g.H0(n4);
        }
        return n3;
    }

    int q0(k k3) {
        this.r0(k3);
        int n3 = 1;
        while (this.L1(44)) {
            this.g.o0(k3);
            this.r0(k3);
            ++n3;
        }
        return n3;
    }

    void q1() {
        Object object;
        this.h1();
        int n3 = this.b;
        if (n3 != 123) {
            object = new StringBuilder();
            ((StringBuilder)object).append("missing '{', got '");
            ((StringBuilder)object).append((char)n3);
            ((StringBuilder)object).append("'");
            this.n0(n3, 2, ((StringBuilder)object).toString());
        }
        int n4 = 0;
        n3 = 2;
        int n5 = 0;
        while (true) {
            this.h1();
            if (n3 == 23) {
                this.o0(n3, "unicode escape too long");
            }
            object = this.q;
            int n6 = this.b;
            object[n3] = n6;
            if (!g.g.Q0(n6)) {
                if (n3 == 2) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("hexadecimal digit expected, got '");
                    ((StringBuilder)object).append((char)n6);
                    ((StringBuilder)object).append("'");
                    this.o0(3, ((StringBuilder)object).toString());
                }
                if (n6 != 125) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("missing '}', got '");
                    ((StringBuilder)object).append((char)n6);
                    ((StringBuilder)object).append("'");
                    this.o0(n3 + 1, ((StringBuilder)object).toString());
                }
                object = new String(Character.toChars(n5)).getBytes();
                n5 = ((Object)object).length;
                for (n3 = n4; n3 < n5; ++n3) {
                    this.v1((int)object[n3]);
                }
                this.h1();
                return;
            }
            if ((n5 = (n5 << 4) + g.g.H0(n6)) > 0x10FFFF) {
                object = new StringBuilder();
                ((StringBuilder)object).append("UTF-8 value too large: 0x");
                ((StringBuilder)object).append(Integer.toHexString(n5));
                ((StringBuilder)object).append(" (max allowed = 0x");
                ((StringBuilder)object).append(Integer.toHexString(0x10FFFF));
                ((StringBuilder)object).append(")");
                this.o0(n3 + 1, ((StringBuilder)object).toString());
            }
            ++n3;
        }
    }

    void r0(k k3) {
        this.H1(k3, 0);
    }

    void r1(c c4) {
        g.c c5 = this.g;
        short s3 = c5.p;
        k k3 = new k();
        k k4 = new k();
        if (this.e.a == 292) {
            c5.O(c4.c, 0x7FFFFFFD, "items in a constructor");
            this.b0(k3);
        } else {
            this.Q1(k3);
        }
        ++c4.c;
        this.c0(61);
        int n3 = c5.l0(k3);
        this.r0(k4);
        c5.T(10, c4.b.b.e, n3, c5.l0(k4));
        c5.p = s3;
    }

    void s0() {
        g.c c4 = this.g;
        e e4 = new e();
        this.I1(e4.b);
        int n3 = this.e.a;
        if (n3 != 61 && n3 != 44) {
            boolean bl = e4.b.a == 12;
            this.X(bl, "syntax error");
            g.a.z(c4.w0(e4.b), 1);
        } else {
            e4.a = null;
            this.R(e4, 1);
        }
    }

    int s1(LuaString luaString) {
        g.c c4 = this.g;
        luaj.h h4 = c4.b;
        f.b[] bArray = h4.e;
        if (bArray == null || c4.m + 1 > bArray.length) {
            h4.e = g.a.G(bArray, c4.m * 2 + 1);
        }
        h4.e[c4.m] = new f.b(luaString, 0, 0);
        short s3 = c4.m;
        c4.m = (short)(s3 + 1);
        return s3;
    }

    void t0(k k3) {
        g.c c4 = this.g;
        k k4 = new k();
        c4.n0(k3);
        this.g1();
        this.b0(k4);
        c4.E0(k3, k4);
    }

    void t1(int n3) {
        g.c c4 = this.g;
        int n4 = c4.z0();
        c.a a4 = new c.a();
        c.a a5 = new c.a();
        c4.j0(a4, true);
        c4.j0(a5, false);
        this.g1();
        this.F1();
        this.Z(277, 273, n3);
        n3 = this.h0();
        if (a5.e) {
            c4.S0(n3, a5.d);
        }
        c4.K0();
        c4.T0(n3, n4);
        c4.K0();
    }

    void u0(f f4) {
        f[] fArray = this.l.c;
        int n3 = this.g.f.c;
        while (n3 < this.l.d) {
            if (fArray[n3].a.P0(f4.a)) {
                this.e0(n3, f4);
                continue;
            }
            ++n3;
        }
    }

    void u1() {
        int n3;
        g.c c4 = this.g;
        k k3 = new k();
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = this.T(true);
        int n4 = 0;
        if (!bl3 && this.e.a != 59) {
            n3 = this.q0(k3);
            if (this.G0(k3.a)) {
                c4.h1(k3);
                if (k3.a == 12 && n3 == 1) {
                    g.a.B(c4.w0(k3), 30);
                    if (luaj.b.c(c4.v0(k3)) != c4.n) {
                        bl2 = false;
                    }
                    g.a.C(bl2);
                }
                n4 = c4.n;
                n3 = -1;
            } else if (n3 == 1) {
                n4 = c4.m0(k3);
            } else {
                c4.o0(k3);
                n4 = c4.n;
                bl2 = n3 == c4.p - n4 ? bl : false;
                g.a.C(bl2);
            }
        } else {
            n3 = 0;
        }
        c4.c1(n4, n3);
        this.L1(59);
    }

    boolean v0(int n3) {
        c.a a4 = this.g.f;
        d d4 = this.l;
        f f4 = d4.c[n3];
        for (int i3 = a4.b; i3 < d4.f; ++i3) {
            f f5 = d4.e[i3];
            if (!f5.a.P0(f4.a)) continue;
            i3 = f4.d;
            short s3 = f5.d;
            if (i3 > s3 && (a4.e || d4.f > a4.b)) {
                this.g.S0(f4.b, s3);
            }
            this.e0(n3, f5);
            return true;
        }
        return false;
    }

    void v1(int n3) {
        int n4;
        block3: {
            char[] cArray;
            char[] cArray2;
            block2: {
                cArray2 = this.j;
                n4 = this.k;
                if (cArray2 == null) break block2;
                cArray = cArray2;
                if (n4 + 1 <= cArray2.length) break block3;
            }
            this.j = cArray = g.a.E(cArray2, n4 * 2 + 1);
        }
        cArray[n4] = (char)n3;
        this.k = n4 + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    void w0(int n3, int n4, int n5, boolean bl) {
        c.a a4 = new c.a();
        g.c c4 = this.g;
        this.Q(3);
        this.c0(259);
        int n6 = bl ? c4.V(33, n3, -1) : c4.H0();
        c4.j0(a4, false);
        this.Q(n5);
        c4.b1(n5);
        this.S();
        c4.K0();
        c4.W0(n6);
        if (bl) {
            n5 = 32;
        } else {
            c4.T(34, n3, 0, n5);
            c4.s0(n4);
            n3 += 2;
            n5 = 35;
        }
        n3 = c4.V(n5, n3, -1);
        c4.T0(n3, n6 + 1);
        c4.s0(n4);
    }

    void w1() {
        this.v1(this.b);
        this.h1();
    }

    void x0(LuaString luaString) {
        g.c c4 = this.g;
        k k3 = new k();
        short s3 = c4.p;
        this.c1("(for generator)");
        this.c1("(for state)");
        this.c1("(for control)");
        this.b1(luaString);
        int n3 = 4;
        while (this.L1(44)) {
            this.b1(this.G1());
            ++n3;
        }
        this.c0(268);
        int n4 = this.c;
        this.P(3, this.q0(k3), k3);
        c4.Q(3);
        this.w0(s3, n4, n3 - 3, false);
    }

    void x1(String string2) {
        this.e.a = 0;
        this.J1(string2);
    }

    void y0(LuaString luaString, int n3) {
        g.c c4 = this.g;
        short s3 = c4.p;
        this.c1("(for index)");
        this.c1("(for limit)");
        this.c1("(for step)");
        this.b1(luaString);
        this.c0(61);
        this.p0();
        this.c0(44);
        this.p0();
        if (this.L1(44)) {
            this.p0();
        } else {
            c4.W(c4.p, c4.R0(LuaLong.I2(1L)));
            c4.b1(1);
        }
        this.w0(s3, n3, 1, true);
    }

    void y1(h.a a4, int n3, InputStream inputStream, LuaString luaString) {
        this.o = (byte)46;
        this.h = a4;
        this.f.a = 289;
        this.i = inputStream;
        this.g = null;
        this.c = 1;
        this.d = 1;
        this.m = luaString;
        this.n = LuaValue.k;
        this.k = 0;
        this.b = n3;
        this.B1();
    }

    void z0(int n3) {
        g.c c4;
        block2: {
            Object object;
            block0: {
                block1: {
                    c4 = this.g;
                    c4.j0(new c.a(), true);
                    this.g1();
                    object = this.G1();
                    int n4 = this.e.a;
                    if (n4 == 44) break block0;
                    if (n4 == 61) break block1;
                    if (n4 == 268) break block0;
                    object = new StringBuilder();
                    ((StringBuilder)object).append(g.g.M("="));
                    ((StringBuilder)object).append(" or ");
                    ((StringBuilder)object).append(g.g.M("in"));
                    ((StringBuilder)object).append(" expected");
                    this.J1(((StringBuilder)object).toString());
                    break block2;
                }
                this.y0((LuaString)object, n3);
                break block2;
            }
            this.x0((LuaString)object);
        }
        this.Z(262, 264, n3);
        c4.K0();
    }

    /*
     * Enabled aggressive block sorting
     */
    void z1(k k3) {
        block7: {
            int n3;
            block11: {
                block8: {
                    block9: {
                        block10: {
                            Object object = this.e;
                            n3 = ((i)object).a;
                            if (n3 == 123) {
                                this.i0(k3);
                                return;
                            }
                            if (n3 == 263) break block8;
                            if (n3 == 265) {
                                this.g1();
                                this.U(k3, false, this.c);
                                return;
                            }
                            if (n3 == 270) break block9;
                            if (n3 == 276) break block10;
                            if (n3 != 281) {
                                if (n3 != 290) {
                                    if (n3 != 293) {
                                        this.I1(k3);
                                        return;
                                    }
                                    this.g0(k3, ((i)object).b.b);
                                    break block7;
                                } else {
                                    k3.b(5, 0);
                                    k3.b.b(this.e.b.a);
                                }
                                break block7;
                            } else {
                                object = this.g;
                                boolean bl = ((g.c)object).b.k != 0;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("cannot use ");
                                stringBuilder.append(g.g.M("..."));
                                stringBuilder.append(" outside a vararg function");
                                this.X(bl, stringBuilder.toString());
                                k3.b(13, ((g.c)object).T(38, 0, 1, 0));
                            }
                            break block7;
                        }
                        n3 = 2;
                        break block11;
                    }
                    k3.b(1, 0);
                    break block7;
                }
                n3 = 3;
            }
            k3.b(n3, 0);
        }
        this.g1();
    }

    static class b
    implements CharSequence {
        char[] a;
        int b;

        b() {
        }

        @Override
        public char charAt(int n3) {
            return this.a[n3];
        }

        @Override
        public int length() {
            return this.b;
        }

        @Override
        public CharSequence subSequence(int n3, int n4) {
            return null;
        }
    }

    static class c {
        k a = new k();
        k b;
        int c;
        int d;
        int e;

        c() {
        }
    }

    static class d {
        j[] a;
        int b = 0;
        f[] c;
        int d = 0;
        f[] e;
        int f = 0;

        d() {
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Dyndata [actvar=");
            stringBuilder.append(Arrays.toString(this.a));
            stringBuilder.append(", n_actvar=");
            stringBuilder.append(this.b);
            stringBuilder.append(", gt=");
            stringBuilder.append(Arrays.toString(this.c));
            stringBuilder.append(", n_gt=");
            stringBuilder.append(this.d);
            stringBuilder.append(", label=");
            stringBuilder.append(Arrays.toString(this.e));
            stringBuilder.append(", n_label=");
            stringBuilder.append(this.f);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    static class e {
        e a;
        k b = new k();

        e() {
        }
    }

    static class f {
        LuaString a;
        int b;
        int c;
        short d;

        public f(LuaString luaString, int n3, int n4, short s3) {
            this.a = luaString;
            this.b = n3;
            this.c = n4;
            this.d = s3;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Labeldesc [name=");
            stringBuilder.append(this.a);
            stringBuilder.append(", pc=");
            stringBuilder.append(this.b);
            stringBuilder.append(", line=");
            stringBuilder.append(this.c);
            stringBuilder.append(", nactvar=");
            stringBuilder.append(this.d);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    static class g {
        final byte a;
        final byte b;

        public g(int n3, int n4) {
            this.a = (byte)n3;
            this.b = (byte)n4;
        }
    }

    private static class h {
        LuaValue a;
        LuaString b;

        private h() {
        }
    }

    private static class i {
        int a;
        final h b = new h();

        private i() {
        }

        public void a(i object) {
            this.a = ((i)object).a;
            h h4 = this.b;
            object = ((i)object).b;
            h4.a = ((h)object).a;
            h4.b = ((h)object).b;
        }
    }

    static class j {
        final short a;

        j(int n3) {
            this.a = (short)n3;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Vardesc [idx=");
            stringBuilder.append(this.a);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    static class k {
        int a;
        final a b = new a();
        final g.e c = new g.e();
        final g.e d = new g.e();

        k() {
        }

        boolean a() {
            boolean bl = this.c.a != this.d.a;
            return bl;
        }

        void b(int n3, int n4) {
            this.d.a = -1;
            this.c.a = -1;
            this.a = n3;
            this.b.e = n4;
        }

        boolean c() {
            boolean bl = this.a == 5 && this.c.a == -1 && this.d.a == -1;
            return bl;
        }

        public void d(k object) {
            this.d.a = ((k)object).d.a;
            this.a = ((k)object).a;
            this.c.a = ((k)object).c.a;
            a a4 = this.b;
            object = ((k)object).b;
            a4.d = ((a)object).d;
            a4.a = ((a)object).a;
            a4.b = ((a)object).b;
            a4.c = ((a)object).c;
            a4.e = ((a)object).e;
        }

        static class a {
            short a;
            short b;
            short c;
            LuaValue d;
            int e;

            a() {
            }

            public LuaValue a() {
                LuaValue luaValue;
                LuaValue luaValue2 = luaValue = this.d;
                if (luaValue == null) {
                    luaValue2 = LuaLong.I2(this.e);
                }
                return luaValue2;
            }

            public void b(LuaValue luaValue) {
                this.d = luaValue;
            }
        }
    }
}

