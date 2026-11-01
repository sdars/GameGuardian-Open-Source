package g;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class a extends luaj.b {
    protected a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void A(g.d r1, int r2) {
            r0 = 131071(0x1ffff, float:1.8367E-40)
            int r2 = r2 + r0
            y(r1, r2)
            return
    }

    public static void B(g.d r1, int r2) {
            int r0 = r1.a()
            r0 = r0 & (-64)
            r2 = r2 & 63
            r2 = r2 | r0
            r1.b(r2)
            return
    }

    protected static void C(boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            luaj.d r1 = new luaj.d
            java.lang.String r0 = "compiler assert failed"
            r1.<init>(r0)
            throw r1
    }

    static g.g.f[] D(g.g.f[] r2, int r3) {
            r0 = 2
            if (r2 != 0) goto L6
            g.g$f[] r2 = new g.g.f[r0]
            goto L10
        L6:
            int r1 = r2.length
            if (r1 >= r3) goto L10
            int r3 = r2.length
            int r3 = r3 * 2
            g.g$f[] r2 = I(r2, r3)
        L10:
            return r2
    }

    static char[] E(char[] r2, int r3) {
            char[] r0 = new char[r3]
            if (r2 == 0) goto Ld
            int r1 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
        Ld:
            return r0
    }

    static int[] F(int[] r2, int r3) {
            int[] r0 = new int[r3]
            if (r2 == 0) goto Ld
            int r1 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
        Ld:
            return r0
    }

    static f.b[] G(f.b[] r2, int r3) {
            f.b[] r0 = new f.b[r3]
            if (r2 == 0) goto Ld
            int r1 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
        Ld:
            return r0
    }

    static f.d[] H(f.d[] r2, int r3) {
            f.d[] r0 = new f.d[r3]
            if (r2 == 0) goto Ld
            int r1 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
        Ld:
            return r0
    }

    static g.g.f[] I(g.g.f[] r2, int r3) {
            g.g$f[] r0 = new g.g.f[r3]
            if (r2 == 0) goto Ld
            int r1 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
        Ld:
            return r0
    }

    static g.g.j[] J(g.g.j[] r2, int r3) {
            g.g$j[] r0 = new g.g.j[r3]
            if (r2 == 0) goto Ld
            int r1 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
        Ld:
            return r0
    }

    static luaj.LuaValue[] K(luaj.LuaValue[] r2, int r3) {
            luaj.LuaValue[] r0 = new luaj.LuaValue[r3]
            if (r2 == 0) goto Ld
            int r1 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
        Ld:
            return r0
    }

    static luaj.h[] L(luaj.h[] r2, int r3) {
            luaj.h[] r0 = new luaj.h[r3]
            if (r2 == 0) goto Ld
            int r1 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
        Ld:
            return r0
    }

    public static int s(int r0, int r1, int r2, int r3) {
            r0 = r0 & 63
            int r1 = r1 << 6
            r1 = r1 & 16320(0x3fc0, float:2.2869E-41)
            r0 = r0 | r1
            int r1 = r2 << 23
            r2 = -8388608(0xffffffffff800000, float:-Infinity)
            r1 = r1 & r2
            r0 = r0 | r1
            int r1 = r3 << 14
            r2 = 8372224(0x7fc000, float:1.1731985E-38)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public static int t(int r0, int r1, int r2) {
            r0 = r0 & 63
            int r1 = r1 << 6
            r1 = r1 & 16320(0x3fc0, float:2.2869E-41)
            r0 = r0 | r1
            int r1 = r2 << 14
            r1 = r1 & (-16384(0xffffffffffffc000, float:NaN))
            r0 = r0 | r1
            return r0
    }

    public static int u(int r0, int r1) {
            r0 = r0 & 63
            int r1 = r1 << 6
            r1 = r1 & (-64)
            r0 = r0 | r1
            return r0
    }

    public static void v(g.d r1, int r2) {
            int r0 = r1.a()
            r0 = r0 & (-16321(0xffffffffffffc03f, float:NaN))
            int r2 = r2 << 6
            r2 = r2 & 16320(0x3fc0, float:2.2869E-41)
            r2 = r2 | r0
            r1.b(r2)
            return
    }

    public static void w(int[] r1, int r2, int r3) {
            r0 = r1[r2]
            r0 = r0 & (-16321(0xffffffffffffc03f, float:NaN))
            int r3 = r3 << 6
            r3 = r3 & 16320(0x3fc0, float:2.2869E-41)
            r3 = r3 | r0
            r1[r2] = r3
            return
    }

    public static void x(g.d r2, int r3) {
            int r0 = r2.a()
            r1 = 8388607(0x7fffff, float:1.1754942E-38)
            r0 = r0 & r1
            int r3 = r3 << 23
            r1 = -8388608(0xffffffffff800000, float:-Infinity)
            r3 = r3 & r1
            r3 = r3 | r0
            r2.b(r3)
            return
    }

    public static void y(g.d r1, int r2) {
            int r0 = r1.a()
            r0 = r0 & 16383(0x3fff, float:2.2957E-41)
            int r2 = r2 << 14
            r2 = r2 & (-16384(0xffffffffffffc000, float:NaN))
            r2 = r2 | r0
            r1.b(r2)
            return
    }

    public static void z(g.d r2, int r3) {
            int r0 = r2.a()
            r1 = -8372225(0xffffffffff803fff, float:NaN)
            r0 = r0 & r1
            int r3 = r3 << 14
            r1 = 8372224(0x7fc000, float:1.1731985E-38)
            r3 = r3 & r1
            r3 = r3 | r0
            r2.b(r3)
            return
    }
}
