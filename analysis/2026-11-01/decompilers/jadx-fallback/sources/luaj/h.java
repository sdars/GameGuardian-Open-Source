package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class h {
    private static final f.d[] n = null;
    private static final luaj.h[] o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public luaj.LuaValue[] f1721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public luaj.h[] f1723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f.b[] f1725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f.d[] f1726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public luaj.LuaString f1727g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    int m;

    static {
            r0 = 0
            f.d[] r1 = new f.d[r0]
            luaj.h.n = r1
            luaj.h[] r0 = new luaj.h[r0]
            luaj.h.o = r0
            return
    }

    public h() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.m = r0
            luaj.h[] r0 = luaj.h.o
            r1.f1723c = r0
            f.d[] r0 = luaj.h.n
            r1.f1726f = r0
            return
    }

    public luaj.LuaString a(int r4, int r5) {
            r3 = this;
            r0 = 0
        L1:
            f.b[] r1 = r3.f1725e
            int r2 = r1.length
            if (r0 >= r2) goto L1a
            r1 = r1[r0]
            int r2 = r1.f1557b
            if (r2 > r5) goto L1a
            int r2 = r1.f1558c
            if (r5 >= r2) goto L17
            int r4 = r4 + (-1)
            if (r4 != 0) goto L17
            luaj.LuaString r4 = r1.f1556a
            return r4
        L17:
            int r0 = r0 + 1
            goto L1
        L1a:
            r4 = 0
            return r4
    }

    public java.lang.String b() {
            r4 = this;
            luaj.LuaString r0 = r4.f1727g
            if (r0 != 0) goto L7
            java.lang.String r0 = "null"
            return r0
        L7:
            java.lang.String r0 = r0.g0()
            java.lang.String r1 = "/"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L1e
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r1 = r1.exists()
            if (r1 != 0) goto L3c
        L1e:
            int r1 = r0.length()
            r2 = 124(0x7c, float:1.74E-43)
            if (r1 <= r2) goto L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)
            r1.append(r0)
            java.lang.String r0 = "..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L3c:
            java.lang.String r1 = "@"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L58
            java.lang.String r1 = "="
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L4d
            goto L58
        L4d:
            java.lang.String r1 = "\u001b"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L5d
            java.lang.String r0 = "=?"
            goto L5d
        L58:
            r1 = 1
            java.lang.String r0 = r0.substring(r1)
        L5d:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            luaj.LuaString r1 = r2.f1727g
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            int r1 = r2.h
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            int r1 = r2.i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
