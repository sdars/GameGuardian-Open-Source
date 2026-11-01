package f;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f1551e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f1552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private luaj.LuaValue f1555d;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            f.a.f1551e = r0
            return
    }

    public a() {
            r1 = this;
            r0 = 64
            r1.<init>(r0)
            return
    }

    public a(int r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = new byte[r1]
            r0.f1552a = r1
            r1 = 0
            r0.f1553b = r1
            r0.f1554c = r1
            r1 = 0
            r0.f1555d = r1
            return
    }

    public a(luaj.LuaValue r2) {
            r1 = this;
            r1.<init>()
            byte[] r0 = f.a.f1551e
            r1.f1552a = r0
            r0 = 0
            r1.f1554c = r0
            r1.f1553b = r0
            r1.f1555d = r2
            return
    }

    private final void i(int r4, int r5) {
            r3 = this;
            byte[] r0 = r3.f1552a
            int r1 = r0.length
            if (r4 == r1) goto L12
            byte[] r4 = new byte[r4]
            int r1 = r3.f1554c
            int r2 = r3.f1553b
            java.lang.System.arraycopy(r0, r1, r4, r5, r2)
            r3.f1552a = r4
            r3.f1554c = r5
        L12:
            return
    }

    public final f.a a(byte r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            r4.h(r0, r1)
            byte[] r0 = r4.f1552a
            int r1 = r4.f1554c
            int r2 = r4.f1553b
            int r3 = r2 + 1
            r4.f1553b = r3
            int r1 = r1 + r2
            r0[r1] = r5
            return r4
    }

    public final f.a b(java.lang.String r3) {
            r2 = this;
            byte[] r3 = r3.getBytes()
            int r0 = r3.length
            r1 = 0
            f.a r3 = r2.e(r3, r1, r0)
            return r3
    }

    public final f.a c(luaj.LuaString r6) {
            r5 = this;
            int r0 = r6.R
            r1 = 0
            r5.h(r1, r0)
            byte[] r2 = r5.f1552a
            int r3 = r5.f1554c
            int r4 = r5.f1553b
            int r3 = r3 + r4
            r6.U2(r1, r2, r3, r0)
            int r6 = r5.f1553b
            int r6 = r6 + r0
            r5.f1553b = r6
            return r5
    }

    public final f.a d(luaj.LuaValue r1) {
            r0 = this;
            luaj.LuaString r1 = r1.q2()
            r0.c(r1)
            return r0
    }

    public final f.a e(byte[] r4, int r5, int r6) {
            r3 = this;
            r0 = 0
            r3.h(r0, r6)
            byte[] r0 = r3.f1552a
            int r1 = r3.f1554c
            int r2 = r3.f1553b
            int r1 = r1 + r2
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            int r4 = r3.f1553b
            int r4 = r4 + r6
            r3.f1553b = r4
            return r3
    }

    public final f.a f(int r8) {
            r7 = this;
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            if (r8 < 0) goto L49
            if (r8 > r0) goto L49
            r0 = 127(0x7f, float:1.78E-43)
            r1 = 0
            if (r8 > r0) goto Lf
            r0 = 1
            r2 = 0
            goto L23
        Lf:
            r0 = 2047(0x7ff, float:2.868E-42)
            if (r8 > r0) goto L17
            r0 = 2
            r2 = 192(0xc0, float:2.69E-43)
            goto L23
        L17:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r8 > r0) goto L20
            r0 = 3
            r2 = 224(0xe0, float:3.14E-43)
            goto L23
        L20:
            r0 = 4
            r2 = 240(0xf0, float:3.36E-43)
        L23:
            r7.h(r1, r0)
            int r1 = r7.f1554c
            int r3 = r7.f1553b
            int r1 = r1 + r3
            byte[] r3 = r7.f1552a
            int r4 = r0 + (-1)
        L2f:
            if (r4 <= 0) goto L3f
            int r5 = r1 + r4
            r6 = r8 & 63
            r6 = r6 | 128(0x80, float:1.8E-43)
            byte r6 = (byte) r6
            r3[r5] = r6
            int r8 = r8 >> 6
            int r4 = r4 + (-1)
            goto L2f
        L3f:
            r8 = r8 | r2
            byte r8 = (byte) r8
            r3[r1] = r8
            int r8 = r7.f1553b
            int r8 = r8 + r0
            r7.f1553b = r8
            return r7
        L49:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Code point ("
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = ") out of range [0; "
            r2.append(r8)
            r2.append(r0)
            java.lang.String r8 = "]"
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8)
            throw r1
    }

    public f.a g(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.m()
            luaj.LuaValue r2 = r2.K0(r0)
            f.a r2 = r1.j(r2)
            return r2
    }

    public final void h(int r5, int r6) {
            r4 = this;
            luaj.LuaValue r0 = r4.f1555d
            if (r0 == 0) goto L20
            luaj.LuaString r0 = r0.q2()
            r1 = 0
            r4.f1555d = r1
            int r1 = r0.R
            r4.f1553b = r1
            r4.f1554c = r5
            int r2 = r5 + r1
            int r2 = r2 + r6
            byte[] r6 = new byte[r2]
            r4.f1552a = r6
            byte[] r2 = r0.P
            int r0 = r0.Q
            java.lang.System.arraycopy(r2, r0, r6, r5, r1)
            goto L48
        L20:
            int r0 = r4.f1554c
            int r1 = r4.f1553b
            int r2 = r0 + r1
            int r2 = r2 + r6
            byte[] r3 = r4.f1552a
            int r3 = r3.length
            if (r2 > r3) goto L2e
            if (r0 >= r5) goto L48
        L2e:
            int r0 = r5 + r1
            int r0 = r0 + r6
            r2 = 32
            if (r0 >= r2) goto L38
            r0 = 32
            goto L3e
        L38:
            int r2 = r1 * 2
            if (r0 >= r2) goto L3e
            int r0 = r1 * 2
        L3e:
            if (r5 != 0) goto L42
            r5 = 0
            goto L45
        L42:
            int r5 = r0 - r1
            int r5 = r5 - r6
        L45:
            r4.i(r0, r5)
        L48:
            return
    }

    public f.a j(luaj.LuaValue r2) {
            r1 = this;
            byte[] r0 = f.a.f1551e
            r1.f1552a = r0
            r0 = 0
            r1.f1553b = r0
            r1.f1554c = r0
            r1.f1555d = r2
            return r1
    }

    public java.lang.String k() {
            r1 = this;
            luaj.LuaValue r0 = r1.m()
            java.lang.String r0 = r0.g0()
            return r0
    }

    public final luaj.LuaString l() {
            r3 = this;
            int r0 = r3.f1553b
            r1 = 0
            r3.i(r0, r1)
            byte[] r0 = r3.f1552a
            int r1 = r3.f1554c
            int r2 = r3.f1553b
            luaj.LuaString r0 = luaj.LuaString.L2(r0, r1, r2)
            return r0
    }

    public luaj.LuaValue m() {
            r1 = this;
            luaj.LuaValue r0 = r1.f1555d
            if (r0 == 0) goto L5
            goto L9
        L5:
            luaj.LuaString r0 = r1.l()
        L9:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.k()
            return r0
    }
}
