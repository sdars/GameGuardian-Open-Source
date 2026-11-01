package ggg;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends luaj.b {
    protected a() {
    }

    public static void A(d dVar, int i) {
        y(dVar, i + 131071);
    }

    public static void B(d dVar, int i) {
        dVar.b((i & 63) | (dVar.a() & (-64)));
    }

    protected static void C(boolean z) {
        if (!z) {
            throw new luaj.d("compiler assert failed");
        }
    }

    static ggg.f[] D(ggg.f[] fVarArr, int i) {
        if (fVarArr == null) {
            return new ggg.f[2];
        }
        return fVarArr.length < i ? I(fVarArr, fVarArr.length * 2) : fVarArr;
    }

    static char[] E(char[] cArr, int i) {
        char[] cArr2 = new char[i];
        if (cArr != null) {
            System.arraycopy(cArr, 0, cArr2, 0, Math.min(cArr.length, i));
        }
        return cArr2;
    }

    static int[] F(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        if (iArr != null) {
            System.arraycopy(iArr, 0, iArr2, 0, Math.min(iArr.length, i));
        }
        return iArr2;
    }

    static ggf.b[] G(ggf.b[] bVarArr, int i) {
        ggf.b[] bVarArr2 = new ggf.b[i];
        if (bVarArr != null) {
            System.arraycopy(bVarArr, 0, bVarArr2, 0, Math.min(bVarArr.length, i));
        }
        return bVarArr2;
    }

    static ggf.d[] H(ggf.d[] dVarArr, int i) {
        ggf.d[] dVarArr2 = new ggf.d[i];
        if (dVarArr != null) {
            System.arraycopy(dVarArr, 0, dVarArr2, 0, Math.min(dVarArr.length, i));
        }
        return dVarArr2;
    }

    static ggg.f[] I(ggg.f[] fVarArr, int i) {
        ggg.f[] fVarArr2 = new ggg.f[i];
        if (fVarArr != null) {
            System.arraycopy(fVarArr, 0, fVarArr2, 0, Math.min(fVarArr.length, i));
        }
        return fVarArr2;
    }

    static ggg.g.j[] J(ggg.g.j[] jVarArr, int i) {
        ggg.g.j[] jVarArr2 = new ggg.g.j[i];
        if (jVarArr != null) {
            System.arraycopy(jVarArr, 0, jVarArr2, 0, Math.min(jVarArr.length, i));
        }
        return jVarArr2;
    }

    static LuaValue[] K(LuaValue[] luaValueArr, int i) {
        LuaValue[] luaValueArr2 = new LuaValue[i];
        if (luaValueArr != null) {
            System.arraycopy(luaValueArr, 0, luaValueArr2, 0, Math.min(luaValueArr.length, i));
        }
        return luaValueArr2;
    }

    static luaj.h[] L(luaj.h[] hVarArr, int i) {
        luaj.h[] hVarArr2 = new luaj.h[i];
        if (hVarArr != null) {
            System.arraycopy(hVarArr, 0, hVarArr2, 0, Math.min(hVarArr.length, i));
        }
        return hVarArr2;
    }

    public static int s(int i, int i2, int i3, int i4) {
        return (i & 63) | ((i2 << 6) & 16320) | ((i3 << 23) & (-8388608)) | ((i4 << 14) & 8372224);
    }

    public static int t(int i, int i2, int i3) {
        return (i & 63) | ((i2 << 6) & 16320) | ((i3 << 14) & (-16384));
    }

    public static int u(int i, int i2) {
        return (i & 63) | ((i2 << 6) & (-64));
    }

    public static void v(d dVar, int i) {
        dVar.b(((i << 6) & 16320) | (dVar.a() & (-16321)));
    }

    public static void w(int[] iArr, int i, int i2) {
        iArr[i] = ((i2 << 6) & 16320) | (iArr[i] & (-16321));
    }

    public static void x(d dVar, int i) {
        dVar.b(((i << 23) & (-8388608)) | (dVar.a() & 8388607));
    }

    public static void y(d dVar, int i) {
        dVar.b(((i << 14) & (-16384)) | (dVar.a() & 16383));
    }

    public static void z(d dVar, int i) {
        dVar.b(((i << 14) & 8372224) | (dVar.a() & (-8372225)));
    }
}
