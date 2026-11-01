package lasm;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class a extends lasm.LasmBase implements e.a {
    private static int[] l;
    private static int[] m;
    private static int[] n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e.c f1632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e.e f1633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.f f1634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e.f f1635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1637g;
    private final int[] h;
    private java.util.List i;
    private int[] j;
    private int k;

    static {
            x()
            y()
            z()
            return
    }

    public a(java.io.InputStream r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public a(java.io.InputStream r5, java.lang.String r6) {
            r4 = this;
            r4.<init>()
            r0 = 34
            int[] r1 = new int[r0]
            r4.h = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.i = r1
            r1 = -1
            r4.k = r1
            e.e r2 = new e.e     // Catch: java.io.UnsupportedEncodingException -> L3a
            r3 = 1
            r2.<init>(r5, r6, r3, r3)     // Catch: java.io.UnsupportedEncodingException -> L3a
            r4.f1633c = r2     // Catch: java.io.UnsupportedEncodingException -> L3a
            e.c r5 = new e.c
            e.e r6 = r4.f1633c
            r5.<init>(r6)
            r4.f1632b = r5
            e.f r5 = new e.f
            r5.<init>()
            r4.f1634d = r5
            r4.f1636f = r1
            r5 = 0
            r4.f1637g = r5
        L30:
            if (r5 >= r0) goto L39
            int[] r6 = r4.h
            r6[r5] = r1
            int r5 = r5 + 1
            goto L30
        L39:
            return
        L3a:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
    }

    private int A() {
            r2 = this;
            e.f r0 = r2.f1634d
            e.f r1 = r0.f1550g
            r2.f1635e = r1
            if (r1 != 0) goto L10
            e.c r1 = r2.f1632b
            e.f r1 = r1.b()
            r0.f1550g = r1
        L10:
            int r0 = r1.f1544a
            r2.f1636f = r0
            return r0
    }

    private e.f w(int r4) {
            r3 = this;
            e.f r0 = r3.f1634d
            e.f r1 = r0.f1550g
            if (r1 == 0) goto L9
        L6:
            r3.f1634d = r1
            goto L12
        L9:
            e.c r1 = r3.f1632b
            e.f r1 = r1.b()
            r0.f1550g = r1
            goto L6
        L12:
            r1 = -1
            r3.f1636f = r1
            e.f r1 = r3.f1634d
            int r2 = r1.f1544a
            if (r2 != r4) goto L22
            int r4 = r3.f1637g
            int r4 = r4 + 1
            r3.f1637g = r4
            return r1
        L22:
            r3.f1634d = r0
            r3.k = r4
            e.d r4 = r3.v()
            throw r4
    }

    private static void x() {
            r0 = 34
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, -32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 256, 67584, 0, 8273920, 58720288, 0, 0, 1879048192, 0, 0, 0, 0, 0, 0, 0, 0, -32, 0} // fill-array
            lasm.a.l = r0
            return
    }

    private static void y() {
            r0 = 34
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 2359295, 0, 251920384, 117702656, 134217728, 134217728, 1048576, 16777216, 0, 0, 0, 0, 0, 8388608, 64, 0, 0, 256000, 4096, 134217728, 176, 0, 0, 138412032, 138412032, 1028, 0, 0, 134217728, 537395200, 2359295, 0} // fill-array
            lasm.a.m = r0
            return
    }

    private static void z() {
            r0 = 34
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1024, 16, 4192, 256, 1286144, 1277952, 24576, 8192, 4096, 131072, 4192, 128, 128, 128, 4192, 0, 0, 0, 2048, 0, 0, 8192, 0, 0, 2048, 8192, 8192, 0, 2048, 2048, 8192, 0, 0, 128} // fill-array
            lasm.a.n = r0
            return
    }

    public final lasm.b k() {
            r5 = this;
            lasm.b r0 = new lasm.b
            r0.<init>()
            r1 = 62
            r5.w(r1)
            r1 = 81
            r5.w(r1)
            e.f r1 = r5.f1634d
            luaj.LuaString r1 = lasm.LasmBase.j(r1)
            r0.f1727g = r1
            r1 = 74
            r5.w(r1)
            r2 = 63
            r5.w(r2)
            r2 = 79
            r5.w(r2)
            e.f r3 = r5.f1634d
            int r3 = lasm.LasmBase.e(r3)
            r0.h = r3
            r5.w(r1)
            r3 = 64
            r5.w(r3)
            r5.w(r2)
            e.f r3 = r5.f1634d
            int r3 = lasm.LasmBase.e(r3)
            r0.i = r3
            r5.w(r1)
            r3 = 65
            r5.w(r3)
            r5.w(r2)
            e.f r3 = r5.f1634d
            r4 = 255(0xff, float:3.57E-43)
            int r3 = lasm.LasmBase.g(r3, r4)
            r0.j = r3
            r5.w(r1)
            r3 = 66
            r5.w(r3)
            r5.w(r2)
            e.f r3 = r5.f1634d
            int r3 = lasm.LasmBase.g(r3, r4)
            r0.k = r3
            r5.w(r1)
            r3 = 67
            r5.w(r3)
            r5.w(r2)
            e.f r2 = r5.f1634d
            r0.p(r2)
            r5.w(r1)
        L7c:
            int r1 = r5.f1636f
            r2 = -1
            if (r1 != r2) goto L85
            int r1 = r5.A()
        L85:
            r3 = 68
            if (r1 == r3) goto Ld1
            int[] r1 = r5.h
            r3 = 1
            int r4 = r5.f1637g
            r1[r3] = r4
        L90:
            r5.o(r0)
            int r1 = r5.f1636f
            if (r1 != r2) goto L9b
            int r1 = r5.A()
        L9b:
            r3 = 53
            if (r1 == r3) goto L90
            r3 = 76
            if (r1 == r3) goto L90
            r3 = 69
            if (r1 == r3) goto L90
            r3 = 70
            if (r1 == r3) goto L90
            switch(r1) {
                case 5: goto L90;
                case 6: goto L90;
                case 7: goto L90;
                case 8: goto L90;
                case 9: goto L90;
                case 10: goto L90;
                case 11: goto L90;
                case 12: goto L90;
                case 13: goto L90;
                case 14: goto L90;
                case 15: goto L90;
                case 16: goto L90;
                case 17: goto L90;
                case 18: goto L90;
                case 19: goto L90;
                case 20: goto L90;
                case 21: goto L90;
                case 22: goto L90;
                case 23: goto L90;
                case 24: goto L90;
                case 25: goto L90;
                case 26: goto L90;
                case 27: goto L90;
                case 28: goto L90;
                case 29: goto L90;
                case 30: goto L90;
                case 31: goto L90;
                case 32: goto L90;
                case 33: goto L90;
                case 34: goto L90;
                case 35: goto L90;
                case 36: goto L90;
                case 37: goto L90;
                case 38: goto L90;
                case 39: goto L90;
                case 40: goto L90;
                case 41: goto L90;
                case 42: goto L90;
                case 43: goto L90;
                case 44: goto L90;
                case 45: goto L90;
                case 46: goto L90;
                case 47: goto L90;
                case 48: goto L90;
                case 49: goto L90;
                default: goto Lae;
            }
        Lae:
            int[] r1 = r5.h
            r3 = 2
            int r4 = r5.f1637g
            r1[r3] = r4
        Lb5:
            int r1 = r5.f1636f
            if (r1 != r2) goto Lbd
            int r1 = r5.A()
        Lbd:
            r3 = 72
            if (r1 == r3) goto Lcd
            int[] r1 = r5.h
            r2 = 3
            int r3 = r5.f1637g
            r1[r2] = r3
            lasm.b r0 = r0.j()
            return r0
        Lcd:
            r5.m(r0)
            goto Lb5
        Ld1:
            r5.t(r0)
            goto L7c
    }

    public final e.f l() {
            r4 = this;
            int r0 = r4.f1636f
            r1 = -1
            if (r0 != r1) goto L9
            int r0 = r4.A()
        L9:
            r2 = 52
            if (r0 == r2) goto L27
            r2 = 76
            if (r0 != r2) goto L16
            e.f r0 = r4.w(r2)
            goto L35
        L16:
            int[] r0 = r4.h
            r2 = 8
            int r3 = r4.f1637g
            r0[r2] = r3
            r4.w(r1)
            e.d r0 = new e.d
            r0.<init>()
            throw r0
        L27:
            r4.w(r2)
            r0 = 60
            e.f r0 = r4.w(r0)
            r1 = 89
            r4.w(r1)
        L35:
            return r0
    }

    public final void m(lasm.b r4) {
            r3 = this;
            r0 = 72
            r3.w(r0)
            r0 = 61
            e.f r0 = r3.w(r0)
            r1 = 74
            r3.w(r1)
            lasm.b r2 = r3.k()
            r4.d(r0, r2)
            r4 = 73
            r3.w(r4)
            r3.w(r1)
            return
    }

    public final luaj.LuaValue n() {
            r4 = this;
            int r0 = r4.f1636f
            r1 = -1
            if (r0 != r1) goto L9
            int r0 = r4.A()
        L9:
            r2 = 79
            r3 = 50
            if (r0 == r3) goto L6b
            r3 = 84
            if (r0 == r3) goto L67
            switch(r0) {
                case 56: goto L5f;
                case 57: goto L57;
                case 58: goto L4f;
                default: goto L16;
            }
        L16:
            switch(r0) {
                case 79: goto L41;
                case 80: goto L35;
                case 81: goto L29;
                default: goto L19;
            }
        L19:
            int[] r0 = r4.h
            r2 = 5
            int r3 = r4.f1637g
            r0[r2] = r3
            r4.w(r1)
            e.d r0 = new e.d
            r0.<init>()
            throw r0
        L29:
            r0 = 81
            r4.w(r0)
            e.f r0 = r4.f1634d
            luaj.LuaString r0 = lasm.LasmBase.j(r0)
            goto L82
        L35:
            r0 = 80
            r4.w(r0)
        L3a:
            e.f r0 = r4.f1634d
            luaj.LuaValue r0 = lasm.LasmBase.i(r0)
            goto L82
        L41:
            r4.w(r2)
            e.f r0 = r4.f1634d
            long r0 = lasm.LasmBase.h(r0)
            luaj.LuaLong r0 = luaj.LuaLong.I2(r0)
            goto L82
        L4f:
            r0 = 58
            r4.w(r0)
            luaj.LuaBoolean r0 = luaj.LuaValue.f1673e
            goto L82
        L57:
            r0 = 57
            r4.w(r0)
            luaj.LuaBoolean r0 = luaj.LuaValue.f1672d
            goto L82
        L5f:
            r0 = 56
            r4.w(r0)
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
            goto L82
        L67:
            r4.w(r3)
            goto L3a
        L6b:
            r4.w(r3)
            r0 = 88
            r4.w(r0)
            r4.w(r2)
            lasm.LasmBase$Const r0 = new lasm.LasmBase$Const
            e.f r1 = r4.f1634d
            r0.<init>(r1)
            r1 = 89
            r4.w(r1)
        L82:
            return r0
    }

    public final void o(lasm.b r20) {
            r19 = this;
            r0 = r19
            r1 = r20
        L4:
            int r2 = r0.f1636f
            r3 = -1
            if (r2 != r3) goto Ld
            int r2 = r19.A()
        Ld:
            r4 = 13
            r5 = 12
            r6 = 11
            r7 = 14
            r8 = 76
            r9 = 70
            r10 = 69
            r13 = 74
            r14 = 0
            r15 = 79
            if (r2 == r10) goto L49b
            if (r2 == r9) goto L49b
            if (r2 == r8) goto L49b
            int[] r2 = r0.h
            int r8 = r0.f1637g
            r9 = 10
            r2[r9] = r8
            int r2 = r0.f1636f
            if (r2 != r3) goto L36
            int r2 = r19.A()
        L36:
            r8 = 53
            if (r2 == r8) goto L442
            r8 = 16
            r10 = 77
            r11 = 59
            r12 = 75
            switch(r2) {
                case 5: goto L402;
                case 6: goto L3f3;
                case 7: goto L3c8;
                case 8: goto L386;
                case 9: goto L37f;
                case 10: goto L372;
                case 11: goto L343;
                case 12: goto L33a;
                case 13: goto L32c;
                case 14: goto L2cd;
                case 15: goto L2b1;
                case 16: goto L343;
                case 17: goto L2cd;
                case 18: goto L2cd;
                case 19: goto L2cd;
                case 20: goto L2cd;
                case 21: goto L2cd;
                case 22: goto L2cd;
                case 23: goto L402;
                case 24: goto L402;
                case 25: goto L402;
                case 26: goto L297;
                case 27: goto L27a;
                case 28: goto L23d;
                case 29: goto L23d;
                case 30: goto L23d;
                case 31: goto L22d;
                case 32: goto L21d;
                case 33: goto L19e;
                case 34: goto L15b;
                case 35: goto L110;
                case 36: goto Ld3;
                case 37: goto Ld3;
                case 38: goto L386;
                case 39: goto Ld3;
                case 40: goto La0;
                case 41: goto L56;
                case 42: goto L15b;
                case 43: goto L2cd;
                case 44: goto L402;
                case 45: goto L2cd;
                case 46: goto L2cd;
                case 47: goto L2cd;
                case 48: goto L2cd;
                case 49: goto L2cd;
                default: goto L45;
            }
        L45:
            int[] r1 = r0.h
            r2 = 32
            int r4 = r0.f1637g
            r1[r2] = r4
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        L56:
            r2 = 41
            e.f r2 = r0.w(r2)
            lasm.LasmBase$V r4 = r19.p()
            int r5 = r0.f1636f
            if (r5 != r3) goto L68
            int r5 = r19.A()
        L68:
            r6 = 51
            if (r5 == r6) goto L91
            r6 = 61
            if (r5 != r6) goto L80
            r5 = 61
            e.f r5 = r0.w(r5)
        L76:
            r16 = r4
            r17 = r5
            r11 = 0
        L7b:
            r12 = 0
        L7c:
            r18 = 0
            goto L461
        L80:
            int[] r1 = r0.h
            r2 = 31
            int r4 = r0.f1637g
            r1[r2] = r4
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        L91:
            r5 = 51
            r0.w(r5)
            e.f r5 = r0.w(r15)
            r6 = 89
            r0.w(r6)
            goto L76
        La0:
            r2 = 40
            e.f r2 = r0.w(r2)
            lasm.LasmBase$V r4 = r19.p()
            int r5 = r0.f1636f
            if (r5 != r3) goto Lb2
            int r5 = r19.A()
        Lb2:
            if (r5 == r12) goto Lbe
            int[] r5 = r0.h
            r6 = 18
            int r7 = r0.f1637g
            r5[r6] = r7
            r5 = 0
            goto Lc9
        Lbe:
            r0.w(r12)
            lasm.LasmBase$V r5 = r19.p()
            r6 = 1
            lasm.LasmBase.a(r4, r5, r6)
        Lc9:
            e.f r6 = r0.w(r15)
        Lcd:
            r16 = r4
            r11 = r5
            r17 = r6
            goto L7b
        Ld3:
            int r2 = r0.f1636f
            if (r2 != r3) goto Ldb
            int r2 = r19.A()
        Ldb:
            r4 = 36
            if (r2 == r4) goto L101
            r4 = 37
            if (r2 == r4) goto Lfe
            r4 = 39
            if (r2 != r4) goto Led
            r2 = 39
        Le9:
            r0.w(r2)
            goto L104
        Led:
            int[] r1 = r0.h
            r2 = 22
            int r4 = r0.f1637g
            r1[r2] = r4
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        Lfe:
            r2 = 37
            goto Le9
        L101:
            r2 = 36
            goto Le9
        L104:
            e.f r2 = r0.f1634d
        L106:
            lasm.LasmBase$V r4 = r19.p()
        L10a:
            e.f r5 = r19.l()
            goto L76
        L110:
            r2 = 35
            e.f r2 = r0.w(r2)
            int r4 = r0.f1636f
            if (r4 != r3) goto L11e
            int r4 = r19.A()
        L11e:
            if (r4 == r11) goto L132
            if (r4 == r10) goto L132
            int[] r4 = r0.h
            r5 = 30
            int r6 = r0.f1637g
            r4[r5] = r6
            r11 = 0
            r12 = 0
            r16 = 0
        L12e:
            r17 = 0
            goto L7c
        L132:
            lasm.LasmBase$V r4 = r19.p()
            int r5 = r0.f1636f
            if (r5 != r3) goto L13e
            int r5 = r19.A()
        L13e:
            if (r5 == r12) goto L14d
            int[] r5 = r0.h
            r6 = 29
            int r7 = r0.f1637g
            r5[r6] = r7
        L148:
            r16 = r4
            r11 = 0
        L14b:
            r12 = 0
            goto L12e
        L14d:
            r0.w(r12)
            lasm.LasmBase$V r5 = r19.p()
            lasm.LasmBase.a(r4, r5, r14)
        L157:
            r16 = r4
            r11 = r5
            goto L14b
        L15b:
            int r2 = r0.f1636f
            if (r2 != r3) goto L163
            int r2 = r19.A()
        L163:
            r4 = 34
            if (r2 == r4) goto L182
            r4 = 42
            if (r2 != r4) goto L171
            r2 = 42
        L16d:
            r0.w(r2)
            goto L185
        L171:
            int[] r1 = r0.h
            r2 = 27
            int r4 = r0.f1637g
            r1[r2] = r4
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        L182:
            r2 = 34
            goto L16d
        L185:
            e.f r2 = r0.f1634d
            lasm.LasmBase$V r4 = r19.p()
            int r5 = r0.f1636f
            if (r5 != r3) goto L193
            int r5 = r19.A()
        L193:
            if (r5 == r12) goto L14d
            int[] r5 = r0.h
            r6 = 28
            int r7 = r0.f1637g
            r5[r6] = r7
            goto L148
        L19e:
            r2 = 33
            e.f r2 = r0.w(r2)
            lasm.LasmBase$V r4 = r19.p()
            int r5 = r0.f1636f
            if (r5 != r3) goto L1b0
            int r5 = r19.A()
        L1b0:
            if (r5 == r12) goto L1bc
            int[] r5 = r0.h
            r6 = 24
            int r7 = r0.f1637g
            r5[r6] = r7
            r5 = 0
            goto L1c6
        L1bc:
            r0.w(r12)
            lasm.LasmBase$V r5 = r19.p()
            lasm.LasmBase.a(r4, r5, r14)
        L1c6:
            int r6 = r0.f1636f
            if (r6 != r3) goto L1ce
            int r6 = r19.A()
        L1ce:
            r7 = 54
            if (r6 == r7) goto L1e0
            if (r6 == r11) goto L1e0
            if (r6 == r10) goto L1e0
            int[] r6 = r0.h
            r7 = 26
            int r8 = r0.f1637g
            r6[r7] = r8
            goto L157
        L1e0:
            int r6 = r0.f1636f
            if (r6 != r3) goto L1e8
            int r6 = r19.A()
        L1e8:
            if (r6 == r7) goto L217
            if (r6 == r11) goto L200
            if (r6 != r10) goto L1ef
            goto L200
        L1ef:
            int[] r1 = r0.h
            r2 = 25
            int r4 = r0.f1637g
            r1[r2] = r4
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        L200:
            lasm.LasmBase$V r6 = r19.p()
            lasm.LasmBase.b(r4, r6)
            r0.w(r12)
            lasm.LasmBase$V r6 = r19.p()
            lasm.LasmBase.a(r4, r6, r14)
        L211:
            r16 = r4
            r11 = r5
            r12 = r6
            goto L12e
        L217:
            e.f r6 = r0.w(r7)
            goto Lcd
        L21d:
            r2 = 32
            e.f r2 = r0.w(r2)
            lasm.LasmBase$V r4 = r19.p()
            lasm.LasmBase$V r5 = r19.p()
            goto Lc9
        L22d:
            r2 = 31
            e.f r2 = r0.w(r2)
            lasm.LasmBase$V r4 = r19.p()
            e.f r5 = r0.w(r15)
            goto L76
        L23d:
            int r2 = r0.f1636f
            if (r2 != r3) goto L245
            int r2 = r19.A()
        L245:
            switch(r2) {
                case 28: goto L262;
                case 29: goto L25f;
                case 30: goto L259;
                default: goto L248;
            }
        L248:
            int[] r1 = r0.h
            r2 = 23
            int r4 = r0.f1637g
            r1[r2] = r4
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        L259:
            r2 = 30
        L25b:
            r0.w(r2)
            goto L265
        L25f:
            r2 = 29
            goto L25b
        L262:
            r2 = 28
            goto L25b
        L265:
            e.f r2 = r0.f1634d
            e.f r4 = r0.w(r15)
            luaj.LuaValue r5 = r19.q()
            luaj.LuaValue r6 = r19.q()
            r17 = r4
            r16 = r5
            r11 = r6
            goto L7b
        L27a:
            r2 = 27
            e.f r2 = r0.w(r2)
            int r4 = r0.f1636f
            if (r4 != r3) goto L288
            int r4 = r19.A()
        L288:
            if (r4 == r11) goto L106
            if (r4 == r10) goto L106
            int[] r4 = r0.h
            r5 = 21
            int r6 = r0.f1637g
            r4[r5] = r6
            r4 = 0
            goto L10a
        L297:
            r2 = 26
            e.f r2 = r0.w(r2)
            lasm.LasmBase$V r4 = r19.p()
            lasm.LasmBase$V r5 = r19.p()
            r0.w(r12)
            lasm.LasmBase$V r6 = r19.p()
            lasm.LasmBase.a(r5, r6, r14)
            goto L211
        L2b1:
            r2 = 15
            e.f r2 = r0.w(r2)
            lasm.LasmBase$V r4 = r19.p()
            e.f r5 = r0.w(r15)
            e.f r6 = r0.w(r15)
        L2c3:
            r16 = r4
            r17 = r5
            r18 = r6
            r11 = 0
            r12 = 0
            goto L461
        L2cd:
            int r2 = r0.f1636f
            if (r2 != r3) goto L2d5
            int r2 = r19.A()
        L2d5:
            if (r2 == r7) goto L319
            r4 = 43
            if (r2 == r4) goto L316
            switch(r2) {
                case 17: goto L313;
                case 18: goto L310;
                case 19: goto L30d;
                case 20: goto L30a;
                case 21: goto L307;
                case 22: goto L304;
                default: goto L2de;
            }
        L2de:
            switch(r2) {
                case 45: goto L301;
                case 46: goto L2fe;
                case 47: goto L2fb;
                case 48: goto L2f8;
                case 49: goto L2f2;
                default: goto L2e1;
            }
        L2e1:
            int[] r1 = r0.h
            r2 = 19
            int r4 = r0.f1637g
            r1[r2] = r4
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        L2f2:
            r2 = 49
        L2f4:
            r0.w(r2)
            goto L31c
        L2f8:
            r2 = 48
            goto L2f4
        L2fb:
            r2 = 47
            goto L2f4
        L2fe:
            r2 = 46
            goto L2f4
        L301:
            r2 = 45
            goto L2f4
        L304:
            r2 = 22
            goto L2f4
        L307:
            r2 = 21
            goto L2f4
        L30a:
            r2 = 20
            goto L2f4
        L30d:
            r2 = 19
            goto L2f4
        L310:
            r2 = 18
            goto L2f4
        L313:
            r2 = 17
            goto L2f4
        L316:
            r2 = 43
            goto L2f4
        L319:
            r0.w(r7)
        L31c:
            e.f r2 = r0.f1634d
            lasm.LasmBase$V r4 = r19.p()
        L322:
            luaj.LuaValue r5 = r19.q()
        L326:
            luaj.LuaValue r6 = r19.q()
            goto L211
        L32c:
            e.f r2 = r0.w(r4)
        L330:
            lasm.LasmBase$V r4 = r19.p()
            lasm.LasmBase$U r5 = r19.s()
            goto L157
        L33a:
            e.f r2 = r0.w(r5)
            lasm.LasmBase$U r4 = r19.s()
            goto L322
        L343:
            int r2 = r0.f1636f
            if (r2 != r3) goto L34b
            int r2 = r19.A()
        L34b:
            if (r2 == r6) goto L364
            if (r2 != r8) goto L353
            r0.w(r8)
            goto L367
        L353:
            int[] r1 = r0.h
            r2 = 17
            int r4 = r0.f1637g
            r1[r2] = r4
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        L364:
            r0.w(r6)
        L367:
            e.f r2 = r0.f1634d
            lasm.LasmBase$V r4 = r19.p()
            lasm.LasmBase$V r5 = r19.p()
            goto L326
        L372:
            e.f r2 = r0.w(r9)
            lasm.LasmBase$V r4 = r19.p()
            lasm.LasmBase$U r5 = r19.s()
            goto L326
        L37f:
            r2 = 9
            e.f r2 = r0.w(r2)
            goto L330
        L386:
            int r2 = r0.f1636f
            if (r2 != r3) goto L38e
            int r2 = r19.A()
        L38e:
            r4 = 8
            r5 = 38
            if (r2 == r4) goto L3a9
            if (r2 != r5) goto L39a
            r0.w(r5)
            goto L3ae
        L39a:
            int[] r1 = r0.h
            int r2 = r0.f1637g
            r1[r8] = r2
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        L3a9:
            r2 = 8
            r0.w(r2)
        L3ae:
            e.f r2 = r0.f1634d
            lasm.LasmBase$V r4 = r19.p()
            r0.w(r12)
            lasm.LasmBase$V r6 = r19.p()
            int r7 = r2.f1544a
            if (r7 != r5) goto L3c0
            r14 = 2
        L3c0:
            lasm.LasmBase.a(r4, r6, r14)
            r16 = r4
            r11 = r6
            goto L14b
        L3c8:
            r2 = 7
            e.f r2 = r0.w(r2)
            lasm.LasmBase$V r4 = r19.p()
            e.f r5 = r0.w(r15)
            int r6 = r0.f1636f
            if (r6 != r3) goto L3dd
            int r6 = r19.A()
        L3dd:
            r7 = 55
            if (r6 == r7) goto L3eb
            int[] r6 = r0.h
            r7 = 15
            int r8 = r0.f1637g
            r6[r7] = r8
            goto L76
        L3eb:
            r6 = 55
            e.f r6 = r0.w(r6)
            goto L2c3
        L3f3:
            r2 = 6
            e.f r2 = r0.w(r2)
            lasm.LasmBase$V r4 = r19.p()
            luaj.LuaValue r5 = r19.n()
            goto L157
        L402:
            int r2 = r0.f1636f
            if (r2 != r3) goto L40a
            int r2 = r19.A()
        L40a:
            r4 = 5
            if (r2 == r4) goto L434
            r4 = 44
            if (r2 == r4) goto L431
            switch(r2) {
                case 23: goto L42e;
                case 24: goto L42b;
                case 25: goto L425;
                default: goto L414;
            }
        L414:
            int[] r1 = r0.h
            r2 = 20
            int r4 = r0.f1637g
            r1[r2] = r4
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        L425:
            r2 = 25
        L427:
            r0.w(r2)
            goto L436
        L42b:
            r2 = 24
            goto L427
        L42e:
            r2 = 23
            goto L427
        L431:
            r2 = 44
            goto L427
        L434:
            r2 = 5
            goto L427
        L436:
            e.f r2 = r0.f1634d
            lasm.LasmBase$V r4 = r19.p()
            lasm.LasmBase$V r5 = r19.p()
            goto L157
        L442:
            r0.w(r8)
            r2 = 88
            r0.w(r2)
            e.f r2 = r0.w(r15)
            r4 = 89
            r0.w(r4)
            r4 = 80
            e.f r4 = r0.w(r4)
            r17 = r4
            r11 = 0
            r12 = 0
            r16 = 0
            goto L7c
        L461:
            r0.w(r13)
            int r4 = r0.f1636f
            if (r4 != r3) goto L46c
            int r4 = r19.A()
        L46c:
            r5 = 71
            if (r4 == r5) goto L486
            int[] r3 = r0.h
            r4 = 33
            int r5 = r0.f1637g
            r3[r4] = r5
            r1 = r20
            r3 = r16
            r4 = r11
            r5 = r12
            r6 = r17
            r7 = r18
            r1.h(r2, r3, r4, r5, r6, r7)
            return
        L486:
            r4 = 71
            r0.w(r4)
            lasm.LasmBase$V r4 = r19.p()
            r5 = 81
            r0.w(r5)
            e.f r5 = r0.f1634d
            r6 = 1
            r1.l(r4, r5, r6)
            goto L461
        L49b:
            int r2 = r0.f1636f
            if (r2 != r3) goto L4a3
            int r2 = r19.A()
        L4a3:
            if (r2 == r10) goto L523
            if (r2 == r9) goto L4e9
            if (r2 != r8) goto L4da
            r0.w(r8)
            e.f r2 = r0.f1634d
            r1.e(r2)
        L4b1:
            r0.w(r13)
            int r2 = r0.f1636f
            if (r2 != r3) goto L4bc
            int r2 = r19.A()
        L4bc:
            r4 = 71
            if (r2 == r4) goto L4c8
            int[] r2 = r0.h
            int r3 = r0.f1637g
            r2[r6] = r3
            goto L4
        L4c8:
            r0.w(r4)
            lasm.LasmBase$V r2 = r19.p()
            r4 = 81
            r0.w(r4)
            e.f r4 = r0.f1634d
            r1.l(r2, r4, r14)
            goto L4b1
        L4da:
            int[] r1 = r0.h
            int r2 = r0.f1637g
            r1[r7] = r2
            r0.w(r3)
            e.d r1 = new e.d
            r1.<init>()
            throw r1
        L4e9:
            r0.w(r9)
            lasm.LasmBase$V r2 = r19.p()
            r4 = 81
            r0.w(r4)
            e.f r4 = r0.f1634d
            r1.q(r2, r4)
        L4fa:
            r0.w(r13)
            int r2 = r0.f1636f
            if (r2 != r3) goto L505
            int r2 = r19.A()
        L505:
            r4 = 71
            if (r2 == r4) goto L511
            int[] r2 = r0.h
            int r3 = r0.f1637g
            r2[r5] = r3
            goto L4
        L511:
            r0.w(r4)
            lasm.LasmBase$V r2 = r19.p()
            r4 = 81
            r0.w(r4)
            e.f r4 = r0.f1634d
            r1.l(r2, r4, r14)
            goto L4fa
        L523:
            r0.w(r10)
            r0.w(r15)
            e.f r2 = r0.f1634d
            r1.f(r2)
        L52e:
            r0.w(r13)
            int r2 = r0.f1636f
            if (r2 != r3) goto L539
            int r2 = r19.A()
        L539:
            r5 = 71
            if (r2 == r5) goto L545
            int[] r2 = r0.h
            int r3 = r0.f1637g
            r2[r4] = r3
            goto L4
        L545:
            r0.w(r5)
            lasm.LasmBase$V r2 = r19.p()
            r6 = 81
            r0.w(r6)
            e.f r7 = r0.f1634d
            r1.l(r2, r7, r14)
            goto L52e
    }

    public final lasm.LasmBase.V p() {
            r4 = this;
            int r0 = r4.f1636f
            r1 = -1
            if (r0 != r1) goto L9
            int r0 = r4.A()
        L9:
            r2 = 59
            if (r0 == r2) goto L11
            r2 = 77
            if (r0 != r2) goto L15
        L11:
            r4.w(r2)
            goto L25
        L15:
            int[] r0 = r4.h
            r2 = 7
            int r3 = r4.f1637g
            r0[r2] = r3
            r4.w(r1)
            e.d r0 = new e.d
            r0.<init>()
            throw r0
        L25:
            lasm.LasmBase$V r0 = new lasm.LasmBase$V
            e.f r1 = r4.f1634d
            r0.<init>(r1)
            return r0
    }

    public final luaj.LuaValue q() {
            r4 = this;
            int r0 = r4.f1636f
            r1 = -1
            if (r0 != r1) goto L9
            int r0 = r4.A()
        L9:
            r2 = 50
            if (r0 == r2) goto L30
            r2 = 77
            if (r0 == r2) goto L2b
            r2 = 84
            if (r0 == r2) goto L30
            switch(r0) {
                case 56: goto L30;
                case 57: goto L30;
                case 58: goto L30;
                case 59: goto L2b;
                default: goto L18;
            }
        L18:
            switch(r0) {
                case 79: goto L30;
                case 80: goto L30;
                case 81: goto L30;
                default: goto L1b;
            }
        L1b:
            int[] r0 = r4.h
            r2 = 4
            int r3 = r4.f1637g
            r0[r2] = r3
            r4.w(r1)
            e.d r0 = new e.d
            r0.<init>()
            throw r0
        L2b:
            lasm.LasmBase$V r0 = r4.p()
            goto L34
        L30:
            luaj.LuaValue r0 = r4.n()
        L34:
            return r0
    }

    public final lasm.LasmBase.Internal r() {
            r4 = this;
            int r0 = r4.f1636f
            r1 = -1
            if (r0 != r1) goto L9
            int r0 = r4.A()
        L9:
            r2 = 59
            if (r0 == r2) goto L2a
            r2 = 77
            if (r0 == r2) goto L2a
            r2 = 78
            if (r0 != r2) goto L1a
            lasm.LasmBase$U r0 = r4.s()
            goto L2e
        L1a:
            int[] r0 = r4.h
            r2 = 6
            int r3 = r4.f1637g
            r0[r2] = r3
            r4.w(r1)
            e.d r0 = new e.d
            r0.<init>()
            throw r0
        L2a:
            lasm.LasmBase$V r0 = r4.p()
        L2e:
            return r0
    }

    public final lasm.LasmBase.U s() {
            r2 = this;
            r0 = 78
            r2.w(r0)
            lasm.LasmBase$U r0 = new lasm.LasmBase$U
            e.f r1 = r2.f1634d
            r0.<init>(r1)
            return r0
    }

    public final void t(lasm.b r5) {
            r4 = this;
            r0 = 68
            r4.w(r0)
            lasm.LasmBase$Internal r0 = r4.r()
            int r1 = r4.f1636f
            r2 = -1
            if (r1 != r2) goto L12
            int r1 = r4.A()
        L12:
            r3 = 56
            if (r1 == r3) goto L1a
            r3 = 81
            if (r1 != r3) goto L1f
        L1a:
            e.f r1 = r4.w(r3)
            goto L30
        L1f:
            int[] r5 = r4.h
            r0 = 9
            int r1 = r4.f1637g
            r5[r0] = r1
            r4.w(r2)
            e.d r5 = new e.d
            r5.<init>()
            throw r5
        L30:
            r2 = 74
            r4.w(r2)
            r5.i(r0, r1)
            return
    }

    public final luaj.h u() {
            r3 = this;
            int r0 = r3.f1636f
            r1 = -1
            if (r0 != r1) goto L9
            int r0 = r3.A()
        L9:
            r1 = 0
            r2 = 74
            if (r0 == r2) goto L15
            int[] r0 = r3.h
            int r2 = r3.f1637g
            r0[r1] = r2
            goto L18
        L15:
            r3.w(r2)
        L18:
            lasm.b r0 = r3.k()
            r3.w(r1)
            return r0
    }

    public e.d v() {
            r8 = this;
            java.util.List r0 = r8.i
            r0.clear()
            r0 = 90
            boolean[] r1 = new boolean[r0]
            int r2 = r8.k
            r3 = 1
            if (r2 < 0) goto L13
            r1[r2] = r3
            r2 = -1
            r8.k = r2
        L13:
            r2 = 0
            r4 = 0
        L15:
            r5 = 34
            if (r4 >= r5) goto L4d
            int[] r5 = r8.h
            r5 = r5[r4]
            int r6 = r8.f1637g
            if (r5 != r6) goto L4a
            r5 = 0
        L22:
            r6 = 32
            if (r5 >= r6) goto L4a
            int[] r6 = lasm.a.l
            r6 = r6[r4]
            int r7 = r3 << r5
            r6 = r6 & r7
            if (r6 == 0) goto L31
            r1[r5] = r3
        L31:
            int[] r6 = lasm.a.m
            r6 = r6[r4]
            r6 = r6 & r7
            if (r6 == 0) goto L3c
            int r6 = r5 + 32
            r1[r6] = r3
        L3c:
            int[] r6 = lasm.a.n
            r6 = r6[r4]
            r6 = r6 & r7
            if (r6 == 0) goto L47
            int r6 = r5 + 64
            r1[r6] = r3
        L47:
            int r5 = r5 + 1
            goto L22
        L4a:
            int r4 = r4 + 1
            goto L15
        L4d:
            r4 = 0
        L4e:
            if (r4 >= r0) goto L62
            boolean r5 = r1[r4]
            if (r5 == 0) goto L5f
            int[] r5 = new int[r3]
            r8.j = r5
            r5[r2] = r4
            java.util.List r6 = r8.i
            r6.add(r5)
        L5f:
            int r4 = r4 + 1
            goto L4e
        L62:
            java.util.List r0 = r8.i
            int r0 = r0.size()
            int[][] r0 = new int[r0][]
        L6a:
            java.util.List r1 = r8.i
            int r1 = r1.size()
            if (r2 >= r1) goto L7f
            java.util.List r1 = r8.i
            java.lang.Object r1 = r1.get(r2)
            int[] r1 = (int[]) r1
            r0[r2] = r1
            int r2 = r2 + 1
            goto L6a
        L7f:
            e.d r1 = new e.d
            e.f r2 = r8.f1634d
            java.lang.String[] r3 = e.a.f1526a
            r1.<init>(r2, r0, r3)
            return r1
    }
}
