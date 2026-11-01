/*
 * Decompiled with CFR 0.152.
 */
package g;

import g.d;
import g.e;
import g.g;
import g.h;
import java.util.Hashtable;
import luaj.LuaBoolean;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.b;
import luaj.h;

public class c
extends g.a {
    h b;
    Hashtable c;
    c d;
    g e;
    a f;
    int g;
    int h;
    e i;
    int j;
    int k;
    int l;
    short m;
    short n;
    short o;
    short p;

    c() {
    }

    static int k1(c c4, LuaString luaString, g.k k3, int n3) {
        if (c4 == null) {
            return 0;
        }
        int n4 = c4.e1(luaString);
        if (n4 >= 0) {
            k3.b(7, n4);
            if (n3 == 0) {
                c4.L0(n4);
            }
            return 7;
        }
        n3 = n4 = c4.d1(luaString);
        if (n4 < 0) {
            if (g.c.k1(c4.d, luaString, k3, 0) == 0) {
                return 0;
            }
            n3 = c4.O0(luaString, k3);
        }
        k3.b(8, n3);
        return 8;
    }

    static boolean n1(int n3) {
        boolean bl = n3 == 6 || n3 == 7;
        return bl;
    }

    f.b A0(int n3) {
        n3 = this.e.l.a[this.l + n3].a;
        boolean bl = n3 < this.m;
        g.a.C(bl);
        return this.b.e[n3];
    }

    void B0(g.k k3) {
        this.i0(k3);
        int n3 = k3.a;
        n3 = n3 != 1 && n3 != 3 ? (n3 != 10 ? this.I0(k3, 1) : k3.b.e) : -1;
        this.c0(k3.c, n3);
        this.W0(k3.d.a);
        k3.d.a = -1;
    }

    void C0(g.k k3) {
        int n3;
        block2: {
            block0: {
                block1: {
                    this.i0(k3);
                    n3 = k3.a;
                    if (n3 == 2) break block0;
                    if (n3 == 10) break block1;
                    if (n3 == 4 || n3 == 5) break block0;
                    n3 = this.I0(k3, 0);
                    break block2;
                }
                this.G0(k3);
                n3 = k3.b.e;
                break block2;
            }
            n3 = -1;
        }
        this.c0(k3.d, n3);
        this.W0(k3.c.a);
        k3.c.a = -1;
    }

    boolean D0(int n3) {
        boolean bl = n3 == 12 || n3 == 13;
        return bl;
    }

    void E0(g.k k3, g.k object) {
        g.k.a a4 = k3.b;
        a4.b = (short)a4.e;
        a4.a = (short)this.l0((g.k)object);
        int n3 = k3.a;
        int n4 = 8;
        boolean bl = n3 == 8 || g.c.n1(n3);
        g.a.C(bl);
        object = k3.b;
        if (k3.a != 8) {
            n4 = 7;
        }
        ((g.k.a)object).c = (short)n4;
        k3.a = 9;
    }

    /*
     * Exception decompiling
     */
    void F0(int var1_1, g.k var2_2) {
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

    void G0(g.k object) {
        object = this.y0(((g.k)object).b.e);
        boolean bl = luaj.b.r(luaj.b.i(((d)object).a()));
        int n3 = 0;
        bl = bl && luaj.b.i(((d)object).a()) != 28 && luaj.b.i(((d)object).a()) != 27;
        g.a.C(bl);
        if (luaj.b.c(((d)object).a()) == 0) {
            n3 = 1;
        }
        g.a.v((d)object, n3);
    }

    int H0() {
        e e4 = this.i;
        int n3 = e4.a;
        e4.a = -1;
        e4 = new e(this.V(23, 0, -1));
        this.c0(e4, n3);
        return e4.a;
    }

    int I0(g.k k3, int n3) {
        int n4;
        if (k3.a == 11 && luaj.b.i(n4 = this.v0(k3)) == 20) {
            int n5 = this.g;
            int n6 = 1;
            this.g = n5 - 1;
            n4 = luaj.b.e(n4);
            if (n3 != 0) {
                n6 = 0;
            }
            return this.d0(27, n4, 0, n6);
        }
        this.f0(k3);
        this.t0(k3);
        return this.d0(28, 255, k3.b.e, n3);
    }

    void J0(g.c c4) {
        if (c4.e == 0) {
            return;
        }
        if (this.D0(c4.a.a)) {
            this.h1(c4.a);
            this.g1(c4.b.b.e, c4.d, -1);
            --c4.d;
        } else {
            g.k k3 = c4.a;
            if (k3.a != 0) {
                this.o0(k3);
            }
            this.g1(c4.b.b.e, c4.d, c4.e);
        }
    }

    void K0() {
        int n3;
        a a4 = this.f;
        if (a4.a != null && a4.e) {
            n3 = this.H0();
            this.S0(n3, a4.d);
            this.W0(n3);
        }
        if (a4.f) {
            this.e.V();
        }
        this.f = a4.a;
        this.a1(a4.d);
        boolean bl = a4.d == this.n;
        g.a.C(bl);
        this.p = this.n;
        g g4 = this.e;
        g.d d4 = g4.l;
        d4.f = a4.b;
        if (a4.a != null) {
            this.M0(a4);
        } else {
            n3 = a4.c;
            if (n3 < d4.d) {
                g4.O1(d4.c[n3], this, a4);
            }
        }
    }

    void L0(int n3) {
        a a4 = this.f;
        while (a4.d > n3) {
            a4 = a4.a;
        }
        a4.e = true;
    }

    int M(LuaValue luaValue) {
        LuaValue[] luaValueArray;
        Object object = this.c;
        if (object == null) {
            object = new Hashtable<LuaValue, Integer>();
            this.c = object;
        } else {
            luaValueArray = (LuaValue[])object.get(luaValue);
            if (luaValueArray != null) {
                return luaValueArray.intValue();
            }
        }
        int n3 = this.j;
        object.put(luaValue, n3);
        object = this.b;
        luaValueArray = object.a;
        if (luaValueArray == null || this.j + 1 >= luaValueArray.length) {
            object.a = g.a.K(luaValueArray, this.j * 2 + 1);
        }
        object = object.a;
        int n4 = this.j;
        this.j = n4 + 1;
        object[n4] = luaValue;
        return n3;
    }

    void M0(a a4) {
        int n3 = a4.c;
        g.f[] fArray = this.e.l.c;
        while (n3 < this.e.l.d) {
            g.f f4 = fArray[n3];
            short s3 = f4.d;
            short s4 = a4.d;
            if (s3 > s4) {
                if (a4.e) {
                    this.S0(f4.b, s4);
                }
                f4.d = a4.d;
            }
            if (this.e.v0(n3)) continue;
            ++n3;
        }
    }

    int N(boolean bl) {
        LuaBoolean luaBoolean = bl ? LuaValue.d : LuaValue.e;
        return this.M(luaBoolean);
    }

    boolean N0(int n3) {
        while (n3 != -1) {
            if (luaj.b.i(this.y0(n3).a()) != 28) {
                return true;
            }
            n3 = this.x0(n3);
        }
        return false;
    }

    void O(int n3, int n4, String string2) {
        if (n3 > n4) {
            this.k0(n4, string2);
        }
    }

    int O0(LuaString luaString, g.k k3) {
        int n3 = this.o;
        boolean bl = true;
        this.O(n3 + 1, 255, "upvalues");
        h h4 = this.b;
        f.d[] dArray = h4.f;
        if (dArray == null || this.o + 1 > dArray.length) {
            n3 = this.o;
            n3 = n3 > 0 ? (n3 *= 2) : 1;
            h4.f = g.a.H(dArray, n3);
        }
        dArray = this.b.f;
        n3 = this.o;
        if (k3.a != 7) {
            bl = false;
        }
        dArray[n3] = new f.d(luaString, bl, k3.b.e);
        n3 = this.o;
        this.o = (short)(n3 + 1);
        return n3;
    }

    void P(g.f[] fArray, int n3, LuaString luaString) {
        for (int i3 = this.f.b; i3 < n3; ++i3) {
            if (!luaString.P0(fArray[i3].a)) continue;
            h.a a4 = this.e.h;
            CharSequence charSequence = new StringBuilder();
            charSequence.append("label '");
            charSequence.append(luaString);
            charSequence.append("' already defined on line ");
            charSequence.append(fArray[i3].c);
            charSequence = a4.e(charSequence.toString());
            this.e.x1((String)charSequence);
        }
    }

    void P0(int n3, int n4) {
        int n5 = n3 + n4;
        int n6 = n5 - 1;
        int n7 = this.g;
        if (n7 > this.h && n7 > 0 && luaj.b.i(n7 = this.b.b[n7 - 1]) == 4) {
            int n8 = luaj.b.c(n7);
            n7 = luaj.b.e(n7) + n8;
            if (n8 <= n3 && n3 <= n7 + 1 || n3 <= n8 && n8 <= n5) {
                n4 = n3;
                if (n8 < n3) {
                    n4 = n8;
                }
                n3 = n6;
                if (n7 > n6) {
                    n3 = n7;
                }
                d d4 = new d(this.b.b, this.g - 1);
                g.a.v(d4, n4);
                g.a.x(d4, n3 - n4);
                return;
            }
        }
        this.T(4, n3, n4 - 1, 0);
    }

    void Q(int n3) {
        if ((n3 = this.p + n3) > this.b.l) {
            if (n3 >= 250) {
                this.e.J1("function or expression needs too many registers");
            }
            this.b.l = n3;
        }
    }

    int Q0() {
        return this.M(LuaValue.c);
    }

    void R(g.c c4) {
        g.k k3 = c4.a;
        if (k3.a == 0) {
            return;
        }
        this.o0(k3);
        c4.a.a = 0;
        int n3 = c4.e;
        if (n3 == 50) {
            this.g1(c4.b.b.e, c4.d, n3);
            c4.e = 0;
        }
    }

    int R0(LuaValue luaValue) {
        return this.M(luaValue);
    }

    int S(int n3, int n4) {
        Object object = this.b;
        this.h0();
        int[] nArray = ((h)object).b;
        if (nArray == null || this.g + 1 > nArray.length) {
            ((h)object).b = g.a.F(nArray, this.g * 2 + 1);
        }
        nArray = ((h)object).b;
        int n5 = this.g;
        nArray[n5] = n3;
        nArray = ((h)object).d;
        if (nArray == null || n5 + 1 > nArray.length) {
            ((h)object).d = g.a.F(nArray, n5 * 2 + 1);
        }
        object = ((h)object).d;
        n3 = this.g;
        object[n3] = n4;
        this.g = n3 + 1;
        return n3;
    }

    void S0(int n3, int n4) {
        int n5 = n4 + 1;
        while (n3 != -1) {
            n4 = this.x0(n3);
            boolean bl = luaj.b.i(this.b.b[n3]) == 23 && (luaj.b.c(this.b.b[n3]) == 0 || luaj.b.c(this.b.b[n3]) >= n5);
            g.a.C(bl);
            g.a.w(this.b.b, n3, n5);
            n3 = n4;
        }
    }

    int T(int n3, int n4, int n5, int n6) {
        boolean bl;
        block4: {
            block3: {
                int n7 = luaj.b.p(n3);
                boolean bl2 = false;
                bl = n7 == 0;
                g.a.C(bl);
                bl = luaj.b.n(n3) != 0 || n5 == 0;
                g.a.C(bl);
                if (luaj.b.o(n3) != 0) break block3;
                bl = bl2;
                if (n6 != 0) break block4;
            }
            bl = true;
        }
        g.a.C(bl);
        return this.S(g.a.s(n3, n4, n5, n6), this.e.d);
    }

    void T0(int n3, int n4) {
        int n5 = this.g;
        if (n4 == n5) {
            this.W0(n3);
        } else {
            boolean bl = n4 < n5;
            g.a.C(bl);
            this.U0(n3, n4, 255, n4);
        }
    }

    int U(int n3, int n4, int n5) {
        int n6 = luaj.b.p(n3);
        boolean bl = false;
        boolean bl2 = n6 == 1 || luaj.b.p(n3) == 2;
        g.a.C(bl2);
        bl2 = luaj.b.o(n3) == 0;
        g.a.C(bl2);
        bl2 = bl;
        if (n5 >= 0) {
            bl2 = bl;
            if (n5 <= 262143) {
                bl2 = true;
            }
        }
        g.a.C(bl2);
        return this.S(g.a.t(n3, n4, n5), this.e.d);
    }

    void U0(int n3, int n4, int n5, int n6) {
        while (n3 != -1) {
            int n7 = this.x0(n3);
            if (this.V0(n3, n5)) {
                this.r0(n3, n4);
            } else {
                this.r0(n3, n6);
            }
            n3 = n7;
        }
    }

    int V(int n3, int n4, int n5) {
        return this.U(n3, n4, n5 + 131071);
    }

    boolean V0(int n3, int n4) {
        d d4 = this.y0(n3);
        if (luaj.b.i(d4.a()) != 28) {
            return false;
        }
        if (n4 != 255 && n4 != luaj.b.e(d4.a())) {
            g.a.v(d4, n4);
        } else {
            d4.b(g.a.s(27, luaj.b.e(d4.a()), 0, luaj.b.g(d4.a())));
        }
        return true;
    }

    int W(int n3, int n4) {
        if (n4 <= 262143) {
            return this.U(1, n3, n4);
        }
        n3 = this.U(2, n3, 0);
        this.a0(n4);
        return n3;
    }

    void W0(int n3) {
        this.z0();
        this.c0(this.i, n3);
    }

    int X(int n3, int n4, int n5) {
        this.z0();
        return this.T(3, n3, n4, n5);
    }

    /*
     * Unable to fully structure code
     */
    void X0(int var1_1, g.k var2_2, g.k var3_3, int var4_4) {
        var5_5 = true;
        var6_6 = true;
        var7_7 = true;
        block0 : switch (var1_1) {
            default: {
                g.a.C(false);
                break;
            }
            case 20: {
                var1_1 = 46;
lbl10:
                // 12 sources

                while (true) {
                    this.Y(var1_1, var2_2, var3_3, var4_4);
                    break block0;
                    break;
                }
            }
            case 19: {
                var1_1 = 45;
                ** GOTO lbl10
            }
            case 18: {
                var1_1 = 44;
                ** GOTO lbl10
            }
            case 17: {
                var1_1 = 43;
                ** GOTO lbl10
            }
            case 16: {
                var1_1 = 42;
                ** GOTO lbl10
            }
            case 15: {
                var1_1 = 40;
                ** GOTO lbl10
            }
            case 14: {
                var5_5 = var2_2.d.a == -1 ? var7_7 : false;
                g.a.C(var5_5);
                this.i0(var3_3);
                var8_8 = var3_3.c;
                var9_9 = var2_2.c;
lbl34:
                // 2 sources

                while (true) {
                    this.c0(var8_8, var9_9.a);
                    var2_2.d(var3_3);
                    break block0;
                    break;
                }
            }
            case 13: {
                if (var2_2.c.a != -1) {
                    var5_5 = false;
                }
                g.a.C(var5_5);
                this.i0(var3_3);
                var8_8 = var3_3.d;
                var9_9 = var2_2.d;
                ** continue;
            }
            case 12: {
                this.Z(26, 0, var2_2, var3_3);
                break;
            }
            case 11: {
                this.Z(25, 0, var2_2, var3_3);
                break;
            }
            case 10: {
                this.Z(26, 1, var2_2, var3_3);
                break;
            }
            case 9: {
                this.Z(25, 1, var2_2, var3_3);
                break;
            }
            case 8: {
                this.Z(24, 1, var2_2, var3_3);
                break;
            }
            case 7: {
                this.Z(24, 0, var2_2, var3_3);
                break;
            }
            case 6: {
                this.q0(var3_3);
                if (var3_3.a == 11 && luaj.b.i(this.v0(var3_3)) == 22) {
                    var5_5 = var2_2.b.e == luaj.b.e(this.v0(var3_3)) - 1 ? var6_6 : false;
                    g.a.C(var5_5);
                    this.t0(var2_2);
                    g.a.x(this.w0(var3_3), var2_2.b.e);
                    var2_2.a = 11;
                    var2_2.b.e = var3_3.b.e;
                    break;
                }
                this.o0(var3_3);
                this.Y(22, var2_2, var3_3, var4_4);
                break;
            }
            case 5: {
                var1_1 = 18;
                ** GOTO lbl10
            }
            case 4: {
                var1_1 = 17;
                ** GOTO lbl10
            }
            case 3: {
                var1_1 = 16;
                ** GOTO lbl10
            }
            case 2: {
                var1_1 = 15;
                ** GOTO lbl10
            }
            case 1: {
                var1_1 = 14;
                ** GOTO lbl10
            }
            case 0: {
                var1_1 = 13;
                ** continue;
            }
        }
    }

    void Y(int n3, g.k k3, g.k k4, int n4) {
        if (this.e0(n3, k3, k4)) {
            return;
        }
        int n5 = n3 != 19 && n3 != 21 && n3 != 41 ? this.l0(k4) : 0;
        int n6 = this.l0(k3);
        if (n6 > n5) {
            this.t0(k3);
            this.t0(k4);
        } else {
            this.t0(k4);
            this.t0(k3);
        }
        k3.b.e = this.T(n3, 0, n6, n5);
        k3.a = 11;
        this.s0(n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    void Y0(int n3, g.k object, int n4) {
        Object object2;
        block9: {
            block10: {
                block8: {
                    block5: {
                        block6: {
                            block7: {
                                object2 = new g.k();
                                ((g.k)object2).b(5, 0);
                                if (n3 == 0) break block5;
                                if (n3 == 1) {
                                    this.b0((g.k)object);
                                    return;
                                }
                                if (n3 == 2) break block6;
                                if (n3 != 4) {
                                    g.a.C(false);
                                    return;
                                }
                                if (!((g.k)object).c()) break block7;
                                object = ((g.k)object).b;
                                object2 = ((g.k.a)object).a().q0();
                                break block8;
                            }
                            this.m0((g.k)object);
                            n3 = 41;
                            break block9;
                        }
                        this.m0((g.k)object);
                        n3 = 21;
                        break block9;
                    }
                    if (!((g.k)object).c()) break block10;
                    object = ((g.k)object).b;
                    object2 = ((g.k.a)object).a().A1();
                }
                ((g.k.a)object).b((LuaValue)object2);
                return;
            }
            this.m0((g.k)object);
            n3 = 19;
        }
        this.Y(n3, (g.k)object, (g.k)object2, n4);
    }

    void Z(int n3, int n4, g.k k3, g.k k4) {
        int n5 = this.l0(k3);
        int n6 = this.l0(k4);
        this.t0(k4);
        this.t0(k3);
        int n7 = n5;
        int n8 = n6;
        int n9 = n4;
        if (n4 == 0) {
            n7 = n5;
            n8 = n6;
            n9 = n4;
            if (n3 != 24) {
                n9 = 1;
                n8 = n5;
                n7 = n6;
            }
        }
        k3.b.e = this.d0(n3, n9, n7, n8);
        k3.a = 10;
    }

    void Z0(int n3) {
        while (n3 != -1) {
            this.V0(n3, 255);
            n3 = this.x0(n3);
        }
    }

    int a0(int n3) {
        boolean bl = n3 <= 0x3FFFFFF;
        g.a.C(bl);
        return this.S(g.a.u(39, n3), this.e.d);
    }

    void a1(int n3) {
        short s3;
        g.d d4 = this.e.l;
        d4.b -= this.n - n3;
        while ((s3 = this.n) > n3) {
            short s4;
            this.n = s4 = (short)(s3 - 1);
            this.A0((int)s4).c = this.g;
        }
    }

    /*
     * Unable to fully structure code
     */
    void b0(g.k var1_1) {
        block7: {
            block6: {
                this.i0(var1_1);
                var2_2 = var1_1.a;
                if (var2_2 == 10) break block6;
                if (var2_2 == 11) ** GOTO lbl-1000
                block0 : switch (var2_2) {
                    default: {
                        g.a.C(false);
                        break;
                    }
                    case 2: 
                    case 4: 
                    case 5: {
                        var2_2 = 3;
lbl11:
                        // 2 sources

                        while (true) {
                            var1_1.a = var2_2;
                            break block0;
                            break;
                        }
                    }
                    case 1: 
                    case 3: {
                        var2_2 = 2;
                        ** continue;
                    }
                    case 6: lbl-1000:
                    // 2 sources

                    {
                        this.f0(var1_1);
                        this.t0(var1_1);
                        var3_3 = var1_1.b;
                        var3_3.e = this.T(20, 0, var3_3.e, 0);
                        var1_1.a = 11;
                        break;
                    }
                }
                break block7;
            }
            this.G0(var1_1);
        }
        var4_4 = var1_1.d;
        var2_2 = var4_4.a;
        var3_3 = var1_1.c;
        var4_4.a = var3_3.a;
        var3_3.a = var2_2;
        this.Z0(var4_4.a);
        this.Z0(var1_1.c.a);
    }

    void b1(int n3) {
        this.Q(n3);
        this.p = (short)(this.p + n3);
    }

    void c0(e e4, int n3) {
        int n4;
        if (n3 == -1) {
            return;
        }
        int n5 = n4 = e4.a;
        if (n4 == -1) {
            e4.a = n3;
        } else {
            while ((n4 = this.x0(n5)) != -1) {
                n5 = n4;
            }
            this.r0(n5, n3);
        }
    }

    void c1(int n3, int n4) {
        this.T(31, n3, n4 + 1, 0);
    }

    int d0(int n3, int n4, int n5, int n6) {
        this.T(n3, n4, n5, n6);
        return this.H0();
    }

    int d1(LuaString luaString) {
        f.d[] dArray = this.b.f;
        for (int i3 = 0; i3 < this.o; ++i3) {
            if (!dArray[i3].a.P0(luaString)) continue;
            return i3;
        }
        return -1;
    }

    boolean e0(int n3, g.k k3, g.k object) {
        if (k3.c() && ((g.k)object).c()) {
            if ((n3 == 16 || n3 == 40 || n3 == 17) && ((g.k)object).b.a().P0(LuaValue.g)) {
                return false;
            }
            LuaValue luaValue = k3.b.a();
            object = ((g.k)object).b.a();
            if (n3 != 21) {
                block0 : switch (n3) {
                    default: {
                        switch (n3) {
                            default: {
                                g.a.C(false);
                                object = null;
                                break block0;
                            }
                            case 46: {
                                if (luaValue.k1() && ((LuaValue)object).k1()) {
                                    object = luaValue.n2((LuaValue)object);
                                    break block0;
                                }
                                return false;
                            }
                            case 45: {
                                if (luaValue.k1() && ((LuaValue)object).k1()) {
                                    object = luaValue.m2((LuaValue)object);
                                    break block0;
                                }
                                return false;
                            }
                            case 44: {
                                if (luaValue.k1() && ((LuaValue)object).k1()) {
                                    object = luaValue.t0((LuaValue)object);
                                    break block0;
                                }
                                return false;
                            }
                            case 43: {
                                if (luaValue.k1() && ((LuaValue)object).k1()) {
                                    object = luaValue.r0((LuaValue)object);
                                    break block0;
                                }
                                return false;
                            }
                            case 42: {
                                if (luaValue.k1() && ((LuaValue)object).k1()) {
                                    object = luaValue.o0((LuaValue)object);
                                    break block0;
                                }
                                return false;
                            }
                            case 41: {
                                if (!luaValue.k1()) {
                                    return false;
                                }
                                object = luaValue.q0();
                                break block0;
                            }
                            case 40: 
                        }
                        object = luaValue.Z0((LuaValue)object);
                        break;
                    }
                    case 19: {
                        object = luaValue.A1();
                        break;
                    }
                    case 18: {
                        object = luaValue.Q1((LuaValue)object);
                        break;
                    }
                    case 17: {
                        object = luaValue.y1((LuaValue)object);
                        break;
                    }
                    case 16: {
                        object = luaValue.O0((LuaValue)object);
                        break;
                    }
                    case 15: {
                        object = luaValue.z1((LuaValue)object);
                        break;
                    }
                    case 14: {
                        object = luaValue.r2((LuaValue)object);
                        break;
                    }
                    case 13: {
                        object = luaValue.j0((LuaValue)object);
                    }
                }
                if (object != null && !Double.isNaN(((LuaValue)object).x2())) {
                    k3.b.b((LuaValue)object);
                    return true;
                }
            }
        }
        return false;
    }

    int e1(LuaString luaString) {
        for (int i3 = this.n - 1; i3 >= 0; --i3) {
            if (!luaString.P0(this.A0((int)i3).a)) continue;
            return i3;
        }
        return -1;
    }

    void f0(g.k k3) {
        if (k3.a != 6) {
            this.b1(1);
            this.g0(k3, this.p - 1);
        }
    }

    void f1(g.k k3, g.k k4) {
        this.m0(k3);
        this.t0(k3);
        short s3 = this.p;
        this.b1(2);
        this.T(12, s3, k3.b.e, this.l0(k4));
        this.t0(k4);
        k3.b.e = s3;
        k3.a = 6;
    }

    /*
     * Unable to fully structure code
     */
    void g0(g.k var1_1, int var2_2) {
        block12: {
            block11: {
                this.i0(var1_1);
                var4_3 = var1_1.a;
                if (var4_3 == 11) break block11;
                var3_4 = 1;
                var6_5 = true;
                block0 : switch (var4_3) {
                    default: {
                        var5_6 = var6_5;
                        if (var4_3 != 0) {
                            var5_6 = var4_3 == 10 ? var6_5 : false;
                        }
                        g.a.C(var5_6);
                        return;
                    }
                    case 6: {
                        var3_4 = var1_1.b.e;
                        if (var2_2 != var3_4) {
                            this.T(0, var2_2, var3_4, 0);
                            break;
                        }
                        break block12;
                    }
                    case 5: {
                        var3_4 = this.R0(var1_1.b.a());
lbl22:
                        // 2 sources

                        while (true) {
                            this.W(var2_2, var3_4);
                            break block0;
                            break;
                        }
                    }
                    case 4: {
                        var3_4 = var1_1.b.e;
                        ** continue;
                    }
                    case 2: 
                    case 3: {
                        if (var4_3 != 2) {
                            var3_4 = 0;
                        }
                        this.T(3, var2_2, var3_4, 0);
                        break;
                    }
                    case 1: {
                        this.P0(var2_2, 1);
                        break;
                    }
                }
                break block12;
            }
            g.a.v(this.w0(var1_1), var2_2);
        }
        var1_1.b.e = var2_2;
        var1_1.a = 6;
    }

    void g1(int n3, int n4, int n5) {
        int n6 = (n4 - 1) / 50 + 1;
        n4 = n5;
        if (n5 == -1) {
            n4 = 0;
        }
        if (n6 <= 511) {
            this.T(36, n3, n4, n6);
        } else {
            this.T(36, n3, n4, 0);
            this.S(n6, this.e.d);
        }
        this.p = (short)(n3 + 1);
    }

    void h0() {
        int n3 = this.i.a;
        int n4 = this.g;
        this.U0(n3, n4, 255, n4);
        this.i.a = -1;
    }

    void h1(g.k k3) {
        this.j1(k3, -1);
    }

    /*
     * Enabled aggressive block sorting
     */
    void i0(g.k k3) {
        g.k.a a4;
        int n3 = k3.a;
        int n4 = 6;
        if (n3 == 7) {
            k3.a = 6;
            return;
        }
        if (n3 != 8) {
            if (n3 != 9) {
                if (n3 != 12 && n3 != 13) {
                    return;
                }
                this.i1(k3);
                return;
            }
            this.u0(k3.b.a);
            a4 = k3.b;
            if (a4.c == 7) {
                this.u0(a4.b);
                n4 = 7;
            }
            a4 = k3.b;
            n4 = this.T(n4, 0, a4.b, a4.a);
        } else {
            a4 = k3.b;
            n4 = this.T(5, 0, a4.e, 0);
        }
        a4.e = n4;
        k3.a = 11;
    }

    void i1(g.k k3) {
        int n3 = k3.a;
        if (n3 == 12) {
            k3.a = 6;
            k3.b.e = luaj.b.c(this.v0(k3));
        } else if (n3 == 13) {
            g.a.x(this.w0(k3), 2);
            k3.a = 11;
        }
    }

    void j0(a a4, boolean bl) {
        short s3;
        a4.f = bl;
        a4.d = s3 = this.n;
        g.d d4 = this.e.l;
        a4.b = (short)d4.f;
        a4.c = (short)d4.d;
        bl = false;
        a4.e = false;
        a4.a = this.f;
        this.f = a4;
        if (this.p == s3) {
            bl = true;
        }
        g.a.C(bl);
    }

    void j1(g.k k3, int n3) {
        int n4 = k3.a;
        if (n4 == 12) {
            g.a.z(this.w0(k3), n3 + 1);
        } else if (n4 == 13) {
            g.a.x(this.w0(k3), n3 + 1);
            g.a.v(this.w0(k3), this.p);
            this.b1(1);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void k0(int n3, String string2) {
        String string3;
        StringBuilder stringBuilder;
        h.a a4;
        if (this.b.h == 0) {
            a4 = this.e.h;
            stringBuilder = new StringBuilder();
            string3 = "main function has more than ";
        } else {
            a4 = this.e.h;
            stringBuilder = new StringBuilder();
            stringBuilder.append("function at line ");
            stringBuilder.append(this.b.h);
            string3 = " has more than ";
        }
        stringBuilder.append(string3);
        stringBuilder.append(n3);
        stringBuilder.append(' ');
        stringBuilder.append(string2);
        string2 = a4.e(stringBuilder.toString());
        this.e.T0(string2, 0);
    }

    int l0(g.k k3) {
        block9: {
            boolean bl;
            int n3;
            block7: {
                block8: {
                    this.q0(k3);
                    n3 = k3.a;
                    bl = true;
                    if (n3 == 1 || n3 == 2 || n3 == 3) break block7;
                    if (n3 == 4) break block8;
                    if (n3 != 5) break block9;
                    g.k.a a4 = k3.b;
                    a4.e = this.R0(a4.a());
                    k3.a = 4;
                }
                if ((n3 = k3.b.e) <= 255) {
                    return luaj.b.l(n3);
                }
                break block9;
            }
            if (this.j <= 255) {
                g.k.a a5 = k3.b;
                if (n3 == 1) {
                    n3 = this.Q0();
                } else {
                    if (n3 != 2) {
                        bl = false;
                    }
                    n3 = this.N(bl);
                }
                a5.e = n3;
                k3.a = 4;
                return luaj.b.l(k3.b.e);
            }
        }
        return this.m0(k3);
    }

    void l1(g.k object, g.k k3) {
        int n3 = ((g.k)object).a;
        if (n3 != 7) {
            int n4 = 8;
            if (n3 != 8) {
                if (n3 != 9) {
                    g.a.C(false);
                } else {
                    if (((g.k)object).b.c == 7) {
                        n4 = 10;
                    }
                    n3 = this.l0(k3);
                    object = ((g.k)object).b;
                    this.T(n4, ((g.k.a)object).b, ((g.k.a)object).a, n3);
                }
            } else {
                this.T(9, this.m0(k3), ((g.k)object).b.e, 0);
            }
            this.t0(k3);
            return;
        }
        this.t0(k3);
        this.p0(k3, ((g.k)object).b.e);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    int m0(g.k k3) {
        this.i0(k3);
        if (k3.a == 6) {
            if (!k3.a()) {
                return k3.b.e;
            }
            int n3 = k3.b.e;
            if (n3 >= this.n) {
                this.p0(k3, n3);
                return k3.b.e;
            }
        }
        this.o0(k3);
        return k3.b.e;
    }

    int m1(LuaString luaString) {
        return this.M(luaString);
    }

    void n0(g.k k3) {
        if (k3.a != 8 || k3.a()) {
            this.m0(k3);
        }
    }

    void o0(g.k k3) {
        this.i0(k3);
        this.t0(k3);
        this.b1(1);
        this.p0(k3, this.p - 1);
    }

    void p0(g.k k3, int n3) {
        this.g0(k3, n3);
        if (k3.a == 10) {
            this.c0(k3.c, k3.b.e);
        }
        if (k3.a()) {
            int n4;
            int n5;
            int n6;
            if (!this.N0(k3.c.a) && !this.N0(k3.d.a)) {
                n6 = -1;
                n5 = -1;
            } else {
                n5 = k3.a == 10 ? -1 : this.H0();
                n4 = this.X(n3, 0, 1);
                n6 = this.X(n3, 1, 0);
                this.W0(n5);
                n5 = n4;
            }
            n4 = this.z0();
            this.U0(k3.d.a, n4, n3, n5);
            this.U0(k3.c.a, n4, n3, n6);
        }
        e e4 = k3.d;
        k3.c.a = -1;
        e4.a = -1;
        k3.b.e = n3;
        k3.a = 6;
    }

    void q0(g.k k3) {
        if (k3.a()) {
            this.m0(k3);
        } else {
            this.i0(k3);
        }
    }

    void r0(int n3, int n4) {
        d d4 = new d(this.b.b, n3);
        boolean bl = true;
        n3 = n4 - (n3 + 1);
        if (n4 == -1) {
            bl = false;
        }
        g.a.C(bl);
        if (Math.abs(n3) > 131071) {
            this.e.J1("control structure too long");
        }
        g.a.A(d4, n3);
    }

    void s0(int n3) {
        this.b.d[this.g - 1] = n3;
    }

    void t0(g.k k3) {
        if (k3.a == 6) {
            this.u0(k3.b.e);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FuncState [pc=");
        stringBuilder.append(this.g);
        stringBuilder.append(", lasttarget=");
        stringBuilder.append(this.h);
        stringBuilder.append(", nk=");
        stringBuilder.append(this.j);
        stringBuilder.append(", np=");
        stringBuilder.append(this.k);
        stringBuilder.append(", firstlocal=");
        stringBuilder.append(this.l);
        stringBuilder.append(", nlocvars=");
        stringBuilder.append(this.m);
        stringBuilder.append(", nactvar=");
        stringBuilder.append(this.n);
        stringBuilder.append(", nups=");
        stringBuilder.append(this.o);
        stringBuilder.append(", freereg=");
        stringBuilder.append(this.p);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    void u0(int n3) {
        if (!luaj.b.k(n3) && n3 >= this.n) {
            short s3;
            short s4 = this.p;
            boolean bl = true;
            this.p = s3 = (short)(s4 - 1);
            if (n3 != s3) {
                bl = false;
            }
            g.a.C(bl);
        }
    }

    int v0(g.k k3) {
        return this.b.b[k3.b.e];
    }

    d w0(g.k k3) {
        return new d(this.b.b, k3.b.e);
    }

    int x0(int n3) {
        int n4 = luaj.b.h(this.b.b[n3]);
        if (n4 == -1) {
            return -1;
        }
        return n3 + 1 + n4;
    }

    d y0(int n3) {
        d d4 = new d(this.b.b, n3);
        if (n3 >= 1 && luaj.b.r(luaj.b.i(d4.a[d4.b - 1]))) {
            return new d(d4.a, d4.b - 1);
        }
        return d4;
    }

    int z0() {
        int n3;
        this.h = n3 = this.g;
        return n3;
    }

    static class a {
        a a;
        short b;
        short c;
        short d;
        boolean e;
        boolean f;

        a() {
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("BlockCnt [firstlabel=");
            stringBuilder.append(this.b);
            stringBuilder.append(", firstgoto=");
            stringBuilder.append(this.c);
            stringBuilder.append(", nactvar=");
            stringBuilder.append(this.d);
            stringBuilder.append(", upval=");
            stringBuilder.append(this.e);
            stringBuilder.append(", isloop=");
            stringBuilder.append(this.f);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }
}

