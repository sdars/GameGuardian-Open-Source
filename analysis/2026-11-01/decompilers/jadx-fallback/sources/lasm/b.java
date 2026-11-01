package lasm;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class b extends luaj.h {
    lasm.b.a[] A;
    g.f B;
    java.util.HashMap C;
    java.util.HashMap D;
    java.util.HashMap E;
    int p;
    int q;
    int r;
    int s;
    int t;
    int u;
    int v;
    lasm.b.a[] w;
    int x;
    lasm.b.a[] y;
    int z;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e.f f1638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1639b;

        a(e.f r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f1638a = r1
                r0.f1639b = r2
                return
        }
    }

    b() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.p = r0
            r2.q = r0
            r2.r = r0
            r2.s = r0
            r2.t = r0
            r2.u = r0
            r2.v = r0
            r2.x = r0
            r2.z = r0
            r0 = 8
            luaj.LuaValue[] r1 = new luaj.LuaValue[r0]
            r2.f1721a = r1
            int[] r1 = new int[r0]
            r2.f1722b = r1
            luaj.h[] r1 = new luaj.h[r0]
            r2.f1723c = r1
            int[] r1 = new int[r0]
            r2.f1724d = r1
            f.b[] r1 = new f.b[r0]
            r2.f1725e = r1
            f.d[] r1 = new f.d[r0]
            r2.f1726f = r1
            lasm.b$a[] r1 = new lasm.b.a[r0]
            r2.w = r1
            lasm.b$a[] r0 = new lasm.b.a[r0]
            r2.y = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.C = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.D = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.E = r0
            g.f r0 = new g.f
            r0.<init>(r2)
            r2.B = r0
            return
    }

    int c(luaj.LuaValue r2) {
            r1 = this;
            boolean r0 = r2 instanceof lasm.LasmBase.Internal
            if (r0 == 0) goto L9
            int r2 = r2.C2()
            goto L11
        L9:
            int r2 = r1.m(r2)
            int r2 = luaj.b.l(r2)
        L11:
            return r2
    }

    void d(e.f r5, lasm.b r6) {
            r4 = this;
            java.lang.String r0 = r5.f1549f
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            java.util.HashMap r1 = r4.E
            java.lang.Object r1 = r1.get(r0)
            lasm.b$a r1 = (lasm.b.a) r1
            if (r1 != 0) goto L2f
            java.util.HashMap r1 = r4.E
            lasm.b$a r2 = new lasm.b$a
            int r3 = r4.s
            r2.<init>(r5, r3)
            r1.put(r0, r2)
            luaj.h[] r5 = r4.f1723c
            int r0 = r4.s
            int r1 = r0 + 1
            r4.s = r1
            java.lang.Object[] r5 = d.d.b(r5, r0, r6)
            luaj.h[] r5 = (luaj.h[]) r5
            r4.f1723c = r5
            return
        L2f:
            e.b r6 = new e.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Duplicate function name '"
            r0.append(r2)
            java.lang.String r2 = r5.f1549f
            r0.append(r2)
            java.lang.String r2 = "' (used at line "
            r0.append(r2)
            e.f r1 = r1.f1638a
            int r1 = r1.f1545b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r5, r0)
            throw r6
    }

    void e(e.f r5) {
            r4 = this;
            java.lang.String r0 = r5.f1549f
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            java.util.HashMap r1 = r4.D
            java.lang.Object r1 = r1.get(r0)
            lasm.b$a r1 = (lasm.b.a) r1
            if (r1 != 0) goto L1f
            java.util.HashMap r1 = r4.D
            lasm.b$a r2 = new lasm.b$a
            int r3 = r4.q
            r2.<init>(r5, r3)
            r1.put(r0, r2)
            return
        L1f:
            e.b r0 = new e.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Try redefine label '"
            r2.append(r3)
            java.lang.String r3 = r5.f1549f
            r2.append(r3)
            java.lang.String r3 = "' (already defined at line "
            r2.append(r3)
            e.f r1 = r1.f1638a
            int r1 = r1.f1545b
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r5, r1)
            throw r0
    }

    void f(e.f r1) {
            r0 = this;
            int r1 = lasm.LasmBase.e(r1)
            r0.r = r1
            return
    }

    public int g(int r4) {
            r3 = this;
            int r0 = r3.r
            if (r0 == 0) goto L23
            int[] r0 = r3.f1724d
            int r1 = r0.length
            int r2 = r3.q
            if (r1 > r2) goto L17
            int r2 = r2 + 1
            int r1 = d.d.c(r2)
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.f1724d = r0
        L17:
            int[] r0 = r3.f1724d
            int r1 = r3.q
            int r2 = r3.r
            r0[r1] = r2
            int r1 = r1 + 1
            r3.t = r1
        L23:
            int[] r0 = r3.f1722b
            int r1 = r3.q
            int r2 = r1 + 1
            r3.q = r2
            int[] r4 = d.d.a(r0, r1, r4)
            r3.f1722b = r4
            r4 = 0
            return r4
    }

    void h(e.f r7, luaj.LuaValue r8, luaj.LuaValue r9, luaj.LuaValue r10, e.f r11, e.f r12) {
            r6 = this;
            java.lang.String r0 = "'"
            r6.k(r8)
            r6.k(r9)
            r6.k(r10)
            int r1 = r7.f1544a     // Catch: java.lang.Throwable -> L35
            r2 = 79
            if (r1 == r2) goto L214
            r2 = 23
            r3 = 1
            r4 = 0
            r5 = -1
            switch(r1) {
                case 5: goto L203;
                case 6: goto L1f5;
                case 7: goto L1e2;
                case 8: goto L1ce;
                case 9: goto L1b8;
                case 10: goto L162;
                case 11: goto L163;
                case 12: goto L16a;
                case 13: goto L1b9;
                case 14: goto L19e;
                case 15: goto L14d;
                case 16: goto L166;
                case 17: goto L16e;
                case 18: goto L172;
                case 19: goto L176;
                case 20: goto L17a;
                case 21: goto L17e;
                case 22: goto L182;
                case 23: goto L1bd;
                case 24: goto L1c1;
                case 25: goto L1c5;
                case 26: goto L1a2;
                case 27: goto L124;
                case 28: goto L107;
                case 29: goto L109;
                case 30: goto L10d;
                case 31: goto Leb;
                case 32: goto Led;
                case 33: goto Lbe;
                case 34: goto L9f;
                case 35: goto L7c;
                case 36: goto L126;
                case 37: goto L12a;
                case 38: goto L64;
                case 39: goto L12e;
                case 40: goto L49;
                case 41: goto L38;
                case 42: goto La1;
                case 43: goto L186;
                case 44: goto L1c9;
                case 45: goto L18a;
                case 46: goto L18e;
                case 47: goto L192;
                case 48: goto L196;
                case 49: goto L19a;
                default: goto L19;
            }     // Catch: java.lang.Throwable -> L35
        L19:
            e.b r8 = new e.b     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r9.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r10 = "Unknow token for OP: '"
            r9.append(r10)     // Catch: java.lang.Throwable -> L35
            java.lang.String r10 = r7.f1549f     // Catch: java.lang.Throwable -> L35
            r9.append(r10)     // Catch: java.lang.Throwable -> L35
            r9.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L35
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L35
            throw r8     // Catch: java.lang.Throwable -> L35
        L35:
            r8 = move-exception
            goto L21c
        L38:
            g.f r9 = r6.B     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r10 = r6.o(r11)     // Catch: java.lang.Throwable -> L35
            r11 = 37
            r9.U(r11, r8, r10)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L49:
            if (r9 != 0) goto L4c
            r9 = r8
        L4c:
            g.f r10 = r6.B     // Catch: java.lang.Throwable -> L35
            int r12 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r9.C2()     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r9 - r8
            int r8 = lasm.LasmBase.e(r11)     // Catch: java.lang.Throwable -> L35
            r10.o1(r12, r9, r8)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L64:
            g.f r10 = r6.B     // Catch: java.lang.Throwable -> L35
            int r11 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r9.C2()     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r9 - r8
            int r9 = r9 + (-2)
            r8 = 34
            r10.T(r8, r11, r4, r9)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L7c:
            if (r8 == 0) goto L83
            int r10 = r8.C2()     // Catch: java.lang.Throwable -> L35
            goto L84
        L83:
            r10 = 0
        L84:
            if (r8 != 0) goto L87
            goto L96
        L87:
            if (r9 != 0) goto L8b
            r3 = 0
            goto L96
        L8b:
            int r9 = r9.C2()     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r9 - r8
            int r3 = r9 + 2
        L96:
            g.f r8 = r6.B     // Catch: java.lang.Throwable -> L35
            r9 = 31
            r8.T(r9, r10, r3, r4)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L9f:
            r5 = 30
        La1:
            if (r5 >= 0) goto La5
            r5 = 38
        La5:
            g.f r10 = r6.B     // Catch: java.lang.Throwable -> L35
            int r11 = r8.C2()     // Catch: java.lang.Throwable -> L35
            if (r9 != 0) goto Laf
            r9 = 0
            goto Lb9
        Laf:
            int r9 = r9.C2()     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r9 - r8
            int r9 = r9 + r3
        Lb9:
            r10.T(r5, r11, r9, r4)     // Catch: java.lang.Throwable -> L35
            goto L21b
        Lbe:
            if (r9 != 0) goto Lc2
            r9 = 0
            goto Lcc
        Lc2:
            int r9 = r9.C2()     // Catch: java.lang.Throwable -> L35
            int r12 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r9 - r12
            int r9 = r9 + r3
        Lcc:
            if (r11 == 0) goto Ld0
            r3 = 0
            goto Lde
        Ld0:
            if (r10 != 0) goto Ld3
            goto Lde
        Ld3:
            int r10 = r10.C2()     // Catch: java.lang.Throwable -> L35
            int r11 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r10 = r10 - r11
            int r3 = r10 + 2
        Lde:
            g.f r10 = r6.B     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            r11 = 29
            r10.T(r11, r8, r9, r3)     // Catch: java.lang.Throwable -> L35
            goto L21b
        Leb:
            r5 = 27
        Led:
            if (r5 >= 0) goto Lf1
            r5 = 28
        Lf1:
            g.f r10 = r6.B     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            if (r9 != 0) goto Lfa
            goto Lfe
        Lfa:
            int r4 = r9.C2()     // Catch: java.lang.Throwable -> L35
        Lfe:
            int r9 = lasm.LasmBase.e(r11)     // Catch: java.lang.Throwable -> L35
            r10.T(r5, r8, r4, r9)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L107:
            r5 = 24
        L109:
            if (r5 >= 0) goto L10d
            r5 = 25
        L10d:
            if (r5 >= 0) goto L111
            r5 = 26
        L111:
            g.f r10 = r6.B     // Catch: java.lang.Throwable -> L35
            int r11 = lasm.LasmBase.e(r11)     // Catch: java.lang.Throwable -> L35
            int r8 = r6.c(r8)     // Catch: java.lang.Throwable -> L35
            int r9 = r6.c(r9)     // Catch: java.lang.Throwable -> L35
            r10.T(r5, r11, r8, r9)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L124:
            r5 = 23
        L126:
            if (r5 >= 0) goto L12a
            r5 = 32
        L12a:
            if (r5 >= 0) goto L12e
            r5 = 33
        L12e:
            if (r5 >= 0) goto L132
            r5 = 35
        L132:
            g.f r9 = r6.B     // Catch: java.lang.Throwable -> L35
            if (r5 == r2) goto L13b
            int r4 = r8.C2()     // Catch: java.lang.Throwable -> L35
            goto L144
        L13b:
            if (r8 != 0) goto L13e
            goto L144
        L13e:
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r4 = r8 + 1
        L144:
            int r8 = r6.n(r11)     // Catch: java.lang.Throwable -> L35
            r9.V(r5, r4, r8)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L14d:
            g.f r9 = r6.B     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r10 = lasm.LasmBase.e(r11)     // Catch: java.lang.Throwable -> L35
            int r11 = lasm.LasmBase.e(r12)     // Catch: java.lang.Throwable -> L35
            r12 = 11
            r9.T(r12, r8, r10, r11)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L162:
            r5 = 6
        L163:
            if (r5 >= 0) goto L166
            r5 = 7
        L166:
            if (r5 >= 0) goto L16a
            r5 = 12
        L16a:
            if (r5 >= 0) goto L16e
            r5 = 8
        L16e:
            if (r5 >= 0) goto L172
            r5 = 13
        L172:
            if (r5 >= 0) goto L176
            r5 = 14
        L176:
            if (r5 >= 0) goto L17a
            r5 = 15
        L17a:
            if (r5 >= 0) goto L17e
            r5 = 16
        L17e:
            if (r5 >= 0) goto L182
            r5 = 17
        L182:
            if (r5 >= 0) goto L186
            r5 = 18
        L186:
            if (r5 >= 0) goto L18a
            r5 = 40
        L18a:
            if (r5 >= 0) goto L18e
            r5 = 42
        L18e:
            if (r5 >= 0) goto L192
            r5 = 43
        L192:
            if (r5 >= 0) goto L196
            r5 = 44
        L196:
            if (r5 >= 0) goto L19a
            r5 = 45
        L19a:
            if (r5 >= 0) goto L19e
            r5 = 46
        L19e:
            if (r5 >= 0) goto L1a2
            r5 = 10
        L1a2:
            if (r5 >= 0) goto L1a6
            r5 = 22
        L1a6:
            g.f r11 = r6.B     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r6.c(r9)     // Catch: java.lang.Throwable -> L35
            int r10 = r6.c(r10)     // Catch: java.lang.Throwable -> L35
            r11.T(r5, r8, r9, r10)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L1b8:
            r5 = 5
        L1b9:
            if (r5 >= 0) goto L1bd
            r5 = 9
        L1bd:
            if (r5 >= 0) goto L1c1
            r5 = 19
        L1c1:
            if (r5 >= 0) goto L1c5
            r5 = 20
        L1c5:
            if (r5 >= 0) goto L1c9
            r5 = 21
        L1c9:
            if (r5 >= 0) goto L203
            r5 = 41
            goto L203
        L1ce:
            g.f r10 = r6.B     // Catch: java.lang.Throwable -> L35
            int r11 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r9.C2()     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r9 - r8
            r8 = 4
            r10.T(r8, r11, r9, r4)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L1e2:
            g.f r9 = r6.B     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r10 = lasm.LasmBase.e(r11)     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L1ef
            goto L1f0
        L1ef:
            r3 = 0
        L1f0:
            r11 = 3
            r9.T(r11, r8, r10, r3)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L1f5:
            g.f r10 = r6.B     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r6.m(r9)     // Catch: java.lang.Throwable -> L35
            r10.W(r8, r9)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L203:
            if (r5 >= 0) goto L206
            r5 = 0
        L206:
            g.f r10 = r6.B     // Catch: java.lang.Throwable -> L35
            int r8 = r8.C2()     // Catch: java.lang.Throwable -> L35
            int r9 = r9.C2()     // Catch: java.lang.Throwable -> L35
            r10.T(r5, r8, r9, r4)     // Catch: java.lang.Throwable -> L35
            goto L21b
        L214:
            int r8 = lasm.LasmBase.d(r11)     // Catch: java.lang.Throwable -> L35
            r6.g(r8)     // Catch: java.lang.Throwable -> L35
        L21b:
            return
        L21c:
            boolean r9 = r8 instanceof e.b
            if (r9 == 0) goto L221
            throw r8
        L221:
            e.b r9 = new e.b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Failed assemble OP '"
            r10.append(r11)
            java.lang.String r11 = r7.f1549f
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r7, r10, r8)
            throw r9
    }

    void i(lasm.LasmBase.Internal r5, e.f r6) {
            r4 = this;
            f.d[] r0 = r4.f1726f
            int r1 = r4.v
            int r2 = r1 + 1
            r4.v = r2
            f.d r2 = new f.d
            luaj.LuaString r6 = lasm.LasmBase.j(r6)
            boolean r3 = r5 instanceof lasm.LasmBase.V
            int r5 = r5.P
            r2.<init>(r6, r3, r5)
            java.lang.Object[] r5 = d.d.b(r0, r1, r2)
            f.d[] r5 = (f.d[]) r5
            r4.f1726f = r5
            return
    }

    lasm.b j() {
            r8 = this;
            luaj.LuaValue[] r0 = r8.f1721a
            int r1 = r0.length
            int r2 = r8.p
            if (r1 == r2) goto Lf
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            luaj.LuaValue[] r0 = (luaj.LuaValue[]) r0
            r8.f1721a = r0
        Lf:
            int[] r0 = r8.f1722b
            int r1 = r0.length
            int r2 = r8.q
            if (r1 == r2) goto L1c
            int[] r0 = java.util.Arrays.copyOf(r0, r2)
            r8.f1722b = r0
        L1c:
            luaj.h[] r0 = r8.f1723c
            int r1 = r0.length
            int r2 = r8.s
            if (r1 == r2) goto L2b
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            luaj.h[] r0 = (luaj.h[]) r0
            r8.f1723c = r0
        L2b:
            int[] r0 = r8.f1724d
            int r1 = r0.length
            int r2 = r8.t
            if (r1 == r2) goto L38
            int[] r0 = java.util.Arrays.copyOf(r0, r2)
            r8.f1724d = r0
        L38:
            f.b[] r0 = r8.f1725e
            int r1 = r0.length
            int r2 = r8.u
            if (r1 == r2) goto L47
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            f.b[] r0 = (f.b[]) r0
            r8.f1725e = r0
        L47:
            f.d[] r0 = r8.f1726f
            int r1 = r0.length
            int r2 = r8.v
            if (r1 == r2) goto L56
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            f.d[] r0 = (f.d[]) r0
            r8.f1726f = r0
        L56:
            int r0 = r8.x
            r1 = 0
            r2 = 0
        L5a:
            java.lang.String r3 = " is missing"
            if (r2 >= r0) goto Lac
            lasm.b$a[] r4 = r8.w
            r4 = r4[r2]
            java.util.HashMap r5 = r8.D
            e.f r6 = r4.f1638a
            java.lang.String r6 = r6.f1549f
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.Object r5 = r5.get(r6)
            lasm.b$a r5 = (lasm.b.a) r5
            if (r5 == 0) goto L8c
            g.d r3 = new g.d
            int[] r6 = r8.f1722b
            int r7 = r4.f1639b
            r3.<init>(r6, r7)
            int r5 = r5.f1639b
            int r4 = r4.f1639b
            int r5 = r5 - r4
            int r5 = r5 + (-1)
            g.a.A(r3, r5)
            int r2 = r2 + 1
            goto L5a
        L8c:
            e.b r0 = new e.b
            e.f r1 = r4.f1638a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "The label "
            r2.append(r5)
            e.f r4 = r4.f1638a
            java.lang.String r4 = r4.f1549f
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            throw r0
        Lac:
            int r0 = r8.z
            r2 = 0
        Laf:
            if (r2 >= r0) goto Lfa
            lasm.b$a[] r4 = r8.y
            r4 = r4[r2]
            java.util.HashMap r5 = r8.E
            e.f r6 = r4.f1638a
            java.lang.String r6 = r6.f1549f
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.Object r5 = r5.get(r6)
            lasm.b$a r5 = (lasm.b.a) r5
            if (r5 == 0) goto Lda
            g.d r6 = new g.d
            int[] r7 = r8.f1722b
            int r4 = r4.f1639b
            r6.<init>(r7, r4)
            int r4 = r5.f1639b
            g.a.y(r6, r4)
            int r2 = r2 + 1
            goto Laf
        Lda:
            e.b r0 = new e.b
            e.f r1 = r4.f1638a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "The function "
            r2.append(r5)
            e.f r4 = r4.f1638a
            java.lang.String r4 = r4.f1549f
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            throw r0
        Lfa:
            lasm.b$a[] r0 = r8.A
            int r0 = r0.length
        Lfd:
            if (r1 >= r0) goto L121
            lasm.b$a[] r2 = r8.A
            r2 = r2[r1]
            if (r2 != 0) goto L108
            int r1 = r1 + 1
            goto Lfd
        L108:
            e.b r0 = new e.b
            e.f r2 = r2.f1638a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No '.end local' for local variable v"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r2, r1)
            throw r0
        L121:
            r0 = 0
            r8.w = r0
            r8.y = r0
            r8.C = r0
            r8.D = r0
            r8.E = r0
            r8.B = r0
            r8.A = r0
            return r8
    }

    void k(luaj.LuaValue r1) {
            r0 = this;
            return
    }

    void l(lasm.LasmBase.V r3, e.f r4, int r5) {
            r2 = this;
            r2.k(r3)
            int r0 = r3.C2()
            lasm.b$a[] r1 = r2.A
            r1 = r1[r0]
            if (r1 == 0) goto L72
            e.f r1 = r1.f1638a
            java.lang.String r1 = r1.f1549f
            java.lang.String r4 = r4.f1549f
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L2c
            f.b[] r3 = r2.f1725e
            lasm.b$a[] r4 = r2.A
            r1 = r4[r0]
            int r1 = r1.f1639b
            r3 = r3[r1]
            int r1 = r2.q
            int r1 = r1 + r5
            r3.f1558c = r1
            r3 = 0
            r4[r0] = r3
            return
        L2c:
            e.b r4 = new e.b
            e.f r3 = r3.Q
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Try end local variable v"
            r5.append(r1)
            r5.append(r0)
            java.lang.String r1 = " with different name (v"
            r5.append(r1)
            r5.append(r0)
            java.lang.String r1 = " defined at line "
            r5.append(r1)
            lasm.b$a[] r1 = r2.A
            r1 = r1[r0]
            e.f r1 = r1.f1638a
            int r1 = r1.f1545b
            r5.append(r1)
            java.lang.String r1 = " as '"
            r5.append(r1)
            lasm.b$a[] r1 = r2.A
            r0 = r1[r0]
            e.f r0 = r0.f1638a
            java.lang.String r0 = r0.f1549f
            r5.append(r0)
            java.lang.String r0 = "')"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r3, r5)
            throw r4
        L72:
            e.b r4 = new e.b
            e.f r3 = r3.Q
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Try end not defined local variable v"
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r3, r5)
            throw r4
    }

    int m(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5 instanceof lasm.LasmBase.Const
            if (r0 == 0) goto L9
            int r5 = r5.C2()
            return r5
        L9:
            java.util.HashMap r0 = r4.C
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L2e
            int r0 = r4.p
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = r4.C
            r1.put(r5, r0)
            luaj.LuaValue[] r1 = r4.f1721a
            int r2 = r4.p
            int r3 = r2 + 1
            r4.p = r3
            java.lang.Object[] r5 = d.d.b(r1, r2, r5)
            luaj.LuaValue[] r5 = (luaj.LuaValue[]) r5
            r4.f1721a = r5
        L2e:
            int r5 = r0.intValue()
            return r5
    }

    int n(e.f r6) {
            r5 = this;
            int r0 = r6.f1544a
            r1 = 60
            if (r0 != r1) goto Lb
            int r0 = lasm.LasmBase.e(r6)
            goto Lc
        Lb:
            r0 = -1
        Lc:
            int r2 = r6.f1544a
            if (r2 == r1) goto L41
            java.util.HashMap r1 = r5.D
            java.lang.String r2 = r6.f1549f
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.Object r1 = r1.get(r2)
            lasm.b$a r1 = (lasm.b.a) r1
            if (r1 == 0) goto L2a
            int r6 = r1.f1639b
            int r0 = r5.q
            int r6 = r6 - r0
            int r0 = r6 + (-1)
            goto L41
        L2a:
            lasm.b$a[] r1 = r5.w
            int r2 = r5.x
            int r3 = r2 + 1
            r5.x = r3
            lasm.b$a r3 = new lasm.b$a
            int r4 = r5.q
            r3.<init>(r6, r4)
            java.lang.Object[] r6 = d.d.b(r1, r2, r3)
            lasm.b$a[] r6 = (lasm.b.a[]) r6
            r5.w = r6
        L41:
            return r0
    }

    int o(e.f r5) {
            r4 = this;
            int r0 = r5.f1544a
            r1 = 79
            if (r0 != r1) goto Lb
            int r5 = lasm.LasmBase.e(r5)
            return r5
        Lb:
            lasm.b$a[] r0 = r4.y
            int r1 = r4.z
            int r2 = r1 + 1
            r4.z = r2
            lasm.b$a r2 = new lasm.b$a
            int r3 = r4.q
            r2.<init>(r5, r3)
            java.lang.Object[] r5 = d.d.b(r0, r1, r2)
            lasm.b$a[] r5 = (lasm.b.a[]) r5
            r4.y = r5
            r5 = 262143(0x3ffff, float:3.6734E-40)
            return r5
    }

    void p(e.f r4) {
            r3 = this;
            r0 = 255(0xff, float:3.57E-43)
            int r0 = lasm.LasmBase.g(r4, r0)
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            r3.l = r0
            int r1 = r3.j
            if (r0 < r1) goto L16
            lasm.b$a[] r4 = new lasm.b.a[r0]
            r3.A = r4
            return
        L16:
            e.b r0 = new e.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".maxstacksize ("
            r1.append(r2)
            int r2 = r3.l
            r1.append(r2)
            java.lang.String r2 = ") must be not less .numparams ("
            r1.append(r2)
            int r2 = r3.j
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r4, r1)
            throw r0
    }

    void q(lasm.LasmBase.V r5, e.f r6) {
            r4 = this;
            r4.k(r5)
            int r0 = r5.C2()
            lasm.b$a[] r1 = r4.A
            r2 = r1[r0]
            if (r2 != 0) goto L34
            lasm.b$a r5 = new lasm.b$a
            int r2 = r4.u
            r5.<init>(r6, r2)
            r1[r0] = r5
            f.b[] r5 = r4.f1725e
            int r0 = r4.u
            int r1 = r0 + 1
            r4.u = r1
            f.b r1 = new f.b
            luaj.LuaString r6 = lasm.LasmBase.j(r6)
            int r2 = r4.q
            int r3 = r2 + 1
            r1.<init>(r6, r2, r3)
            java.lang.Object[] r5 = d.d.b(r5, r0, r1)
            f.b[] r5 = (f.b[]) r5
            r4.f1725e = r5
            return
        L34:
            e.b r6 = new e.b
            e.f r5 = r5.Q
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Try redefine not ended local variable v"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = " (v"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = " defined at line "
            r1.append(r2)
            lasm.b$a[] r2 = r4.A
            r2 = r2[r0]
            e.f r2 = r2.f1638a
            int r2 = r2.f1545b
            r1.append(r2)
            java.lang.String r2 = " as '"
            r1.append(r2)
            lasm.b$a[] r2 = r4.A
            r0 = r2[r0]
            e.f r0 = r0.f1638a
            java.lang.String r0 = r0.f1549f
            r1.append(r0)
            java.lang.String r0 = "')"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r5, r0)
            throw r6
    }
}
