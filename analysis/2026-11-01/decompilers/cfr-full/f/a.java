/*
 * Decompiled with CFR 0.152.
 */
package f;

import luaj.LuaString;
import luaj.LuaValue;

public final class a {
    private static final byte[] e = new byte[0];
    private byte[] a;
    private int b;
    private int c;
    private LuaValue d;

    public a() {
        this(64);
    }

    public a(int n3) {
        this.a = new byte[n3];
        this.b = 0;
        this.c = 0;
        this.d = null;
    }

    public a(LuaValue luaValue) {
        this.a = e;
        this.c = 0;
        this.b = 0;
        this.d = luaValue;
    }

    private final void i(int n3, int n4) {
        byte[] byArray = this.a;
        if (n3 != byArray.length) {
            byte[] byArray2 = new byte[n3];
            System.arraycopy(byArray, this.c, byArray2, n4, this.b);
            this.a = byArray2;
            this.c = n4;
        }
    }

    public final a a(byte by) {
        this.h(0, 1);
        byte[] byArray = this.a;
        int n3 = this.c;
        int n4 = this.b;
        this.b = n4 + 1;
        byArray[n3 + n4] = by;
        return this;
    }

    public final a b(String object) {
        object = ((String)object).getBytes();
        return this.e((byte[])object, 0, ((Object)object).length);
    }

    public final a c(LuaString luaString) {
        int n3 = luaString.R;
        this.h(0, n3);
        luaString.U2(0, this.a, this.c + this.b, n3);
        this.b += n3;
        return this;
    }

    public final a d(LuaValue luaValue) {
        this.c(luaValue.q2());
        return this;
    }

    public final a e(byte[] byArray, int n3, int n4) {
        this.h(0, n4);
        System.arraycopy(byArray, n3, this.a, this.c + this.b, n4);
        this.b += n4;
        return this;
    }

    public final a f(int n3) {
        if (n3 >= 0 && n3 <= 0x10FFFF) {
            int n4;
            int n5;
            if (n3 <= 127) {
                n5 = 1;
                n4 = 0;
            } else if (n3 <= 2047) {
                n5 = 2;
                n4 = 192;
            } else if (n3 <= 65535) {
                n5 = 3;
                n4 = 224;
            } else {
                n5 = 4;
                n4 = 240;
            }
            this.h(0, n5);
            int n6 = this.c + this.b;
            byte[] byArray = this.a;
            int n7 = n5 - 1;
            int n8 = n3;
            for (n3 = n7; n3 > 0; --n3) {
                byArray[n6 + n3] = (byte)(n8 & 0x3F | 0x80);
                n8 >>= 6;
            }
            byArray[n6] = (byte)(n8 | n4);
            this.b += n5;
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Code point (");
        stringBuilder.append(n3);
        stringBuilder.append(") out of range [0; ");
        stringBuilder.append(0x10FFFF);
        stringBuilder.append("]");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public a g(LuaValue luaValue) {
        return this.j(luaValue.K0(this.m()));
    }

    public final void h(int n3, int n4) {
        LuaValue luaValue = this.d;
        if (luaValue != null) {
            int n5;
            luaValue = luaValue.q2();
            this.d = null;
            this.b = n5 = ((LuaString)luaValue).R;
            this.c = n3;
            byte[] byArray = new byte[n3 + n5 + n4];
            this.a = byArray;
            System.arraycopy(((LuaString)luaValue).P, ((LuaString)luaValue).Q, byArray, n3, n5);
        } else {
            int n6 = this.c;
            int n7 = this.b;
            if (n6 + n7 + n4 > this.a.length || n6 < n3) {
                int n8 = n3 + n7 + n4;
                if (n8 < 32) {
                    n6 = 32;
                } else {
                    n6 = n8;
                    if (n8 < n7 * 2) {
                        n6 = n7 * 2;
                    }
                }
                n3 = n3 == 0 ? 0 : n6 - n7 - n4;
                this.i(n6, n3);
            }
        }
    }

    public a j(LuaValue luaValue) {
        this.a = e;
        this.b = 0;
        this.c = 0;
        this.d = luaValue;
        return this;
    }

    public String k() {
        return this.m().g0();
    }

    public final LuaString l() {
        this.i(this.b, 0);
        return LuaString.L2(this.a, this.c, this.b);
    }

    public LuaValue m() {
        LuaValue luaValue = this.d;
        if (luaValue == null) {
            luaValue = this.l();
        }
        return luaValue;
    }

    public String toString() {
        return this.k();
    }
}

