package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1705a = null;

    static {
            r0 = 47
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [96, 113, 65, 84, 80, 80, 92, 108, 60, 16, 60, 84, 108, 124, 124, 124, 124, 124, 124, 96, 96, 96, 104, 34, 188, 188, 188, 132, 228, 84, 80, 16, 98, 98, 4, 226, 20, 81, 80, 23, 124, 96, 124, 124, 124, 124, 124} // fill-array
            luaj.b.f1705a = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int c(int r0) {
            int r0 = r0 >>> 6
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public static int d(int r1) {
            int r1 = r1 >>> 6
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r1 = r1 & r0
            return r1
    }

    public static int e(int r0) {
            int r0 = r0 >>> 23
            r0 = r0 & 511(0x1ff, float:7.16E-43)
            return r0
    }

    public static int f(int r1) {
            int r1 = r1 >>> 14
            r0 = 262143(0x3ffff, float:3.6734E-40)
            r1 = r1 & r0
            return r1
    }

    public static int g(int r0) {
            int r0 = r0 >>> 14
            r0 = r0 & 511(0x1ff, float:7.16E-43)
            return r0
    }

    public static int h(int r1) {
            int r1 = r1 >>> 14
            r0 = 262143(0x3ffff, float:3.6734E-40)
            r1 = r1 & r0
            r0 = 131071(0x1ffff, float:1.8367E-40)
            int r1 = r1 - r0
            return r1
    }

    public static int i(int r0) {
            r0 = r0 & 63
            return r0
    }

    public static int j(int r0) {
            r0 = r0 & (-257(0xfffffffffffffeff, float:NaN))
            return r0
    }

    public static boolean k(int r0) {
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static int l(int r0) {
            r0 = r0 | 256(0x100, float:3.59E-43)
            return r0
    }

    public static java.lang.String m(java.lang.String r3) {
            java.lang.String r0 = "="
            boolean r0 = r3.startsWith(r0)
            r1 = 1
            if (r0 == 0) goto Le
            java.lang.String r3 = r3.substring(r1)
            return r3
        Le:
            java.lang.String r0 = "@"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L1a
            java.lang.String r3 = r3.substring(r1)
        L1a:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L5b
            int r0 = r3.length()
            r1 = 69
            if (r0 <= r1) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 66
            java.lang.String r3 = r3.substring(r1, r2)
            r0.append(r3)
            java.lang.String r3 = "..."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[string '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "']"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L5b:
            return r3
    }

    public static int n(int r1) {
            int[] r0 = luaj.b.f1705a
            r1 = r0[r1]
            int r1 = r1 >>> 4
            r1 = r1 & 3
            return r1
    }

    public static int o(int r1) {
            int[] r0 = luaj.b.f1705a
            r1 = r0[r1]
            int r1 = r1 >>> 2
            r1 = r1 & 3
            return r1
    }

    public static int p(int r1) {
            int[] r0 = luaj.b.f1705a
            r1 = r0[r1]
            r1 = r1 & 3
            return r1
    }

    public static boolean q(int r1) {
            int[] r0 = luaj.b.f1705a
            r1 = r0[r1]
            r1 = r1 & 64
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static boolean r(int r1) {
            int[] r0 = luaj.b.f1705a
            r1 = r0[r1]
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }
}
