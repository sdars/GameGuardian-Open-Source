/*
 * Decompiled with CFR 0.152.
 */
package g;

import f.d;
import java.io.DataOutputStream;
import java.io.OutputStream;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.a;
import luaj.g;
import luaj.h;

public class b {
    private boolean a = true;
    private int b = 0;
    private int c = 8;
    DataOutputStream d;
    boolean e;
    boolean f;
    int g;

    public b(OutputStream outputStream, boolean bl, boolean bl2) {
        this.d = new DataOutputStream(outputStream);
        this.e = bl;
        this.f = bl2;
        this.g = 0;
    }

    public static int a(h h4, OutputStream object, boolean bl, boolean bl2) {
        object = new b((OutputStream)object, bl, bl2);
        ((b)object).h();
        ((b)object).g(h4, null);
        return ((b)object).g;
    }

    void b(int n3) {
        this.d.write(n3);
    }

    void c(h h4) {
        int[] nArray = h4.b;
        int n3 = nArray.length;
        this.i(n3);
        boolean bl = this.f;
        if (bl) {
            nArray = new int[n3];
        }
        if (bl) {
            luaj.g.x(h4, nArray);
        }
        for (int i3 = 0; i3 < n3; ++i3) {
            this.i(nArray[i3]);
        }
    }

    /*
     * Unable to fully structure code
     */
    void d(h var1_1) {
        var8_2 = this.d;
        var7_3 = var1_1.a;
        var4_4 = var7_3.length;
        this.i(var4_4);
        var3_5 = 0;
        block0: for (var2_6 = 0; var2_6 < var4_4; ++var2_6) {
            block8: {
                block9: {
                    block11: {
                        block12: {
                            block10: {
                                var6_8 = var7_3[var2_6];
                                var5_7 = var6_8.C2();
                                if (var5_7 == 0) break block8;
                                if (var5_7 == 1) break block9;
                                if (var5_7 != 3) {
                                    if (var5_7 == 4) {
                                        var8_2.write(4);
                                        this.j((LuaString)var6_8);
                                        continue;
                                    }
                                    var1_1 = new StringBuilder();
                                    var1_1.append("bad type for ");
                                    var1_1.append(var6_8);
                                    throw new IllegalArgumentException(var1_1.toString());
                                }
                                var5_7 = this.b;
                                if (var5_7 == 0) break block10;
                                if (var5_7 == 1) break block11;
                                if (var5_7 == 4) {
                                    if (var6_8.h1()) {
                                        var8_2.write(-2);
lbl28:
                                        // 2 sources

                                        while (true) {
                                            this.i(var6_8.y2());
                                            continue block0;
                                            break;
                                        }
                                    } else {
                                        ** GOTO lbl32
                                    }
                                }
                                break block12;
                            }
                            var8_2.write(3);
                            this.f(var6_8.x2());
                            continue;
                        }
                        var1_1 = new StringBuilder();
                        var1_1.append("number format not supported: ");
                        var1_1.append(this.b);
                        throw new IllegalArgumentException(var1_1.toString());
                    }
                    if (var6_8.h1()) {
                        var8_2.write(3);
                        ** continue;
                    }
                    var1_1 = new StringBuilder();
                    var1_1.append("not an integer: ");
                    var1_1.append(var6_8);
                    throw new IllegalArgumentException(var1_1.toString());
                }
                var8_2.write(1);
                this.b((int)var6_8.w2());
                continue;
            }
            var8_2.write(0);
        }
        var4_4 = var1_1.c.length;
        this.i(var4_4);
        for (var2_6 = var3_5; var2_6 < var4_4; ++var2_6) {
            this.g(var1_1.c[var2_6], var1_1.g);
        }
    }

    void e(h dArray, LuaString bArray) {
        int n3;
        boolean bl = this.e;
        int n4 = 0;
        if (!(bl || bArray != null && bArray.P0(dArray.g))) {
            this.j(dArray.g);
        } else {
            this.i(0);
        }
        bArray = (f.b[])dArray.d;
        int n5 = this.e ? 0 : bArray.length;
        this.i(n5);
        for (n3 = 0; n3 < n5; ++n3) {
            this.i((int)bArray[n3]);
        }
        bArray = dArray.e;
        n5 = this.e ? 0 : bArray.length;
        this.i(n5);
        for (n3 = 0; n3 < n5; ++n3) {
            f.b b4 = bArray[n3];
            this.j(b4.a);
            this.i(b4.b);
            this.i(b4.c);
        }
        dArray = dArray.f;
        n5 = this.e ? 0 : dArray.length;
        this.i(n5);
        for (n3 = n4; n3 < n5; ++n3) {
            this.j(dArray[n3].a);
        }
    }

    void f(double d4) {
        long l3;
        long l4 = l3 = Double.doubleToLongBits(d4);
        if (this.a) {
            l4 = Long.reverseBytes(l3);
        }
        this.d.writeLong(l4);
    }

    void g(h h4, LuaString luaString) {
        this.i(h4.h);
        this.i(h4.i);
        this.b(h4.j);
        this.b(h4.k);
        this.b(h4.l);
        this.c(h4);
        this.d(h4);
        this.k(h4);
        this.e(h4, luaString);
    }

    void h() {
        DataOutputStream dataOutputStream = this.d;
        ((OutputStream)dataOutputStream).write(luaj.a.n);
        dataOutputStream.write(82);
        dataOutputStream.write(0);
        dataOutputStream.write(this.a ? 1 : 0);
        dataOutputStream.write(4);
        dataOutputStream.write(4);
        dataOutputStream.write(4);
        dataOutputStream.write(this.c);
        dataOutputStream.write(this.b);
        ((OutputStream)dataOutputStream).write(luaj.a.o);
    }

    void i(int n3) {
        DataOutputStream dataOutputStream = this.d;
        int n4 = n3;
        if (this.a) {
            n4 = Integer.reverseBytes(n3);
        }
        dataOutputStream.writeInt(n4);
    }

    void j(LuaString luaString) {
        LuaString luaString2 = luaString;
        if (luaString == null) {
            luaString2 = LuaValue.K2("");
        }
        int n3 = luaString2.r1().y2();
        this.i(n3 + 1);
        luaString2.q3(this.d, 0, n3);
        this.d.write(0);
    }

    void k(h object) {
        DataOutputStream dataOutputStream = this.d;
        d[] dArray = ((h)object).f;
        int n3 = dArray.length;
        this.i(n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            object = dArray[i3];
            dataOutputStream.writeByte(((d)object).b ? 1 : 0);
            dataOutputStream.writeByte(((d)object).c);
        }
    }
}

