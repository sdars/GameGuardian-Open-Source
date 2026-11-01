/*
 * Decompiled with CFR 0.152.
 */
package g;

import g.d;
import g.g;
import luaj.LuaValue;
import luaj.b;
import luaj.h;

public abstract class a
extends b {
    protected a() {
    }

    public static void A(d d4, int n3) {
        g.a.y(d4, n3 + 131071);
    }

    public static void B(d d4, int n3) {
        d4.b(n3 & 0x3F | d4.a() & 0xFFFFFFC0);
    }

    protected static void C(boolean bl) {
        if (bl) {
            return;
        }
        throw new luaj.d("compiler assert failed");
    }

    static g.f[] D(g.f[] fArray, int n3) {
        g.f[] fArray2;
        if (fArray == null) {
            fArray2 = new g.f[2];
        } else {
            fArray2 = fArray;
            if (fArray.length < n3) {
                fArray2 = g.a.I(fArray, fArray.length * 2);
            }
        }
        return fArray2;
    }

    static char[] E(char[] cArray, int n3) {
        char[] cArray2 = new char[n3];
        if (cArray != null) {
            System.arraycopy(cArray, 0, cArray2, 0, Math.min(cArray.length, n3));
        }
        return cArray2;
    }

    static int[] F(int[] nArray, int n3) {
        int[] nArray2 = new int[n3];
        if (nArray != null) {
            System.arraycopy(nArray, 0, nArray2, 0, Math.min(nArray.length, n3));
        }
        return nArray2;
    }

    static f.b[] G(f.b[] bArray, int n3) {
        f.b[] bArray2 = new f.b[n3];
        if (bArray != null) {
            System.arraycopy(bArray, 0, bArray2, 0, Math.min(bArray.length, n3));
        }
        return bArray2;
    }

    static f.d[] H(f.d[] dArray, int n3) {
        f.d[] dArray2 = new f.d[n3];
        if (dArray != null) {
            System.arraycopy(dArray, 0, dArray2, 0, Math.min(dArray.length, n3));
        }
        return dArray2;
    }

    static g.f[] I(g.f[] fArray, int n3) {
        g.f[] fArray2 = new g.f[n3];
        if (fArray != null) {
            System.arraycopy(fArray, 0, fArray2, 0, Math.min(fArray.length, n3));
        }
        return fArray2;
    }

    static g.j[] J(g.j[] jArray, int n3) {
        g.j[] jArray2 = new g.j[n3];
        if (jArray != null) {
            System.arraycopy(jArray, 0, jArray2, 0, Math.min(jArray.length, n3));
        }
        return jArray2;
    }

    static LuaValue[] K(LuaValue[] luaValueArray, int n3) {
        LuaValue[] luaValueArray2 = new LuaValue[n3];
        if (luaValueArray != null) {
            System.arraycopy(luaValueArray, 0, luaValueArray2, 0, Math.min(luaValueArray.length, n3));
        }
        return luaValueArray2;
    }

    static h[] L(h[] hArray, int n3) {
        h[] hArray2 = new h[n3];
        if (hArray != null) {
            System.arraycopy(hArray, 0, hArray2, 0, Math.min(hArray.length, n3));
        }
        return hArray2;
    }

    public static int s(int n3, int n4, int n5, int n6) {
        return n3 & 0x3F | n4 << 6 & 0x3FC0 | n5 << 23 & 0xFF800000 | n6 << 14 & 0x7FC000;
    }

    public static int t(int n3, int n4, int n5) {
        return n3 & 0x3F | n4 << 6 & 0x3FC0 | n5 << 14 & 0xFFFFC000;
    }

    public static int u(int n3, int n4) {
        return n3 & 0x3F | n4 << 6 & 0xFFFFFFC0;
    }

    public static void v(d d4, int n3) {
        d4.b(n3 << 6 & 0x3FC0 | d4.a() & 0xFFFFC03F);
    }

    public static void w(int[] nArray, int n3, int n4) {
        nArray[n3] = n4 << 6 & 0x3FC0 | nArray[n3] & 0xFFFFC03F;
    }

    public static void x(d d4, int n3) {
        d4.b(n3 << 23 & 0xFF800000 | d4.a() & 0x7FFFFF);
    }

    public static void y(d d4, int n3) {
        d4.b(n3 << 14 & 0xFFFFC000 | d4.a() & 0x3FFF);
    }

    public static void z(d d4, int n3) {
        d4.b(n3 << 14 & 0x7FC000 | d4.a() & 0xFF803FFF);
    }
}

