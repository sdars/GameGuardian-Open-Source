package e;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c implements e.a {
    static final long[] m = null;
    static final long[] n = null;
    static final int[] o = null;
    public static final java.lang.String[] p = null;
    public static final java.lang.String[] q = null;
    public static final int[] r = null;
    static final long[] s = null;
    static final long[] t = null;
    static final long[] u = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.io.PrintStream f1527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e.e f1528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f1529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f1530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected char f1531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1532g;
    int h;
    int i;
    int j;
    int k;
    int l;

    static {
            r0 = 4
            long[] r1 = new long[r0]
            r1 = {x00fc: FILL_ARRAY_DATA , data: [-2, -1, -1, -1} // fill-array
            e.c.m = r1
            long[] r0 = new long[r0]
            r0 = {x0110: FILL_ARRAY_DATA , data: [0, 0, -1, -1} // fill-array
            e.c.n = r0
            r0 = 130(0x82, float:1.82E-43)
            int[] r0 = new int[r0]
            r0 = {x0124: FILL_ARRAY_DATA , data: [3, 0, 5, 49, 33, 34, 39, 40, 44, 45, 1, 2, 1, 2, 0, 5, 46, 3, 0, 5, 27, 32, 22, 24, 25, 17, 19, 20, 33, 34, 39, 40, 30, 31, 37, 38, 41, 42, 50, 31, 32, 37, 38, 42, 43, 1, 2, 44, 3, 0, 5, 25, 30, 20, 22, 23, 15, 17, 18, 31, 32, 37, 38, 47, 48, 28, 29, 35, 36, 39, 40, 37, 50, 39, 40, 45, 46, 32, 33, 1, 2, 37, 26, 38, 34, 3, 0, 5, 39, 40, 45, 46, 29, 30, 43, 44, 51, 35, 36, 41, 42, 46, 47, 3, 4, 3, 4, 2, 7, 48, 5, 2, 7, 29, 34, 24, 26, 27, 19, 21, 22, 5, 2, 7, 35, 36, 41, 42, 32, 33} // fill-array
            e.c.o = r0
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r6 = "MOVE"
            java.lang.String r7 = "LOADK"
            java.lang.String r8 = "LOADBOOL"
            java.lang.String r9 = "LOADNIL"
            java.lang.String r10 = "GETUPVAL"
            java.lang.String r11 = "GETTABUP"
            java.lang.String r12 = "GETTABLE"
            java.lang.String r13 = "SETTABUP"
            java.lang.String r14 = "SETUPVAL"
            java.lang.String r15 = "SETTABLE"
            java.lang.String r16 = "NEWTABLE"
            java.lang.String r17 = "SELF"
            java.lang.String r18 = "ADD"
            java.lang.String r19 = "SUB"
            java.lang.String r20 = "MUL"
            java.lang.String r21 = "DIV"
            java.lang.String r22 = "MOD"
            java.lang.String r23 = "POW"
            java.lang.String r24 = "UNM"
            java.lang.String r25 = "NOT"
            java.lang.String r26 = "LEN"
            java.lang.String r27 = "CONCAT"
            java.lang.String r28 = "JMP"
            java.lang.String r29 = "EQ"
            java.lang.String r30 = "LT"
            java.lang.String r31 = "LE"
            java.lang.String r32 = "TEST"
            java.lang.String r33 = "TESTSET"
            java.lang.String r34 = "CALL"
            java.lang.String r35 = "TAILCALL"
            java.lang.String r36 = "RETURN"
            java.lang.String r37 = "FORLOOP"
            java.lang.String r38 = "FORPREP"
            java.lang.String r39 = "TFORCALL"
            java.lang.String r40 = "TFORLOOP"
            java.lang.String r41 = "SETLIST"
            java.lang.String r42 = "CLOSURE"
            java.lang.String r43 = "VARARG"
            java.lang.String r44 = "IDIV"
            java.lang.String r45 = "BNOT"
            java.lang.String r46 = "BAND"
            java.lang.String r47 = "BOR"
            java.lang.String r48 = "BXOR"
            java.lang.String r49 = "SHL"
            java.lang.String r50 = "SHR"
            java.lang.String r51 = "CONST"
            java.lang.String r52 = "FUNC["
            java.lang.String r53 = "GOTO["
            java.lang.String r54 = "OP"
            java.lang.String r55 = "SET_TOP"
            java.lang.String r56 = "SKIP_NEXT"
            java.lang.String r57 = "nil"
            java.lang.String r58 = "true"
            java.lang.String r59 = "false"
            r60 = 0
            r61 = 0
            r62 = 0
            java.lang.String r63 = ".source"
            java.lang.String r64 = ".linedefined"
            java.lang.String r65 = ".lastlinedefined"
            java.lang.String r66 = ".numparams"
            java.lang.String r67 = ".is_vararg"
            java.lang.String r68 = ".maxstacksize"
            java.lang.String r69 = ".upval"
            java.lang.String r70 = ".line"
            java.lang.String r71 = ".local"
            java.lang.String r72 = ".end local"
            java.lang.String r73 = ".func"
            java.lang.String r74 = ".end"
            r75 = 0
            java.lang.String r76 = ".."
            r77 = 0
            r78 = 0
            r79 = 0
            r80 = 0
            r81 = 0
            r82 = 0
            r83 = 0
            r84 = 0
            r85 = 0
            r86 = 0
            r87 = 0
            r88 = 0
            java.lang.String r89 = "["
            java.lang.String r90 = "]"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90}
            e.c.p = r0
            java.lang.String r0 = "STATE_V_NAME"
            java.lang.String r1 = "DEFAULT"
            java.lang.String r2 = "STATE_NAME"
            java.lang.String r3 = "STATE_SINT"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            e.c.q = r0
            r0 = 90
            int[] r0 = new int[r0]
            r0 = {x022c: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 0, 3, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, 3, -1, -1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1} // fill-array
            e.c.r = r0
            r0 = 2
            long[] r1 = new long[r0]
            r1 = {x02e4: FILL_ARRAY_DATA , data: [-31, 51642367} // fill-array
            e.c.s = r1
            long[] r1 = new long[r0]
            r1 = {x02f0: FILL_ARRAY_DATA , data: [30, 0} // fill-array
            e.c.t = r1
            long[] r0 = new long[r0]
            r0 = {x02fc: FILL_ARRAY_DATA , data: [16, 0} // fill-array
            e.c.u = r0
            return
    }

    public c(e.e r2) {
            r1 = this;
            r1.<init>()
            java.io.PrintStream r0 = java.lang.System.out
            r1.f1527b = r0
            r0 = 52
            int[] r0 = new int[r0]
            r1.f1529d = r0
            r0 = 104(0x68, float:1.46E-43)
            int[] r0 = new int[r0]
            r1.f1530e = r0
            r0 = 3
            r1.f1532g = r0
            r1.h = r0
            r1.f1528c = r2
            return
    }

    private int A(long r10, long r12, long r14, long r16) {
            r9 = this;
            r6 = r9
            long r0 = r12 & r10
            long r2 = r16 & r14
            long r0 = r0 | r2
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L16
            r1 = 10
            r0 = r9
            r2 = r10
            r4 = r14
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L16:
            r0 = 12
            e.e r1 = r6.f1528c     // Catch: java.io.IOException -> L4b
            char r1 = r1.k()     // Catch: java.io.IOException -> L4b
            r6.f1531f = r1     // Catch: java.io.IOException -> L4b
            r7 = 101(0x65, float:1.42E-43)
            if (r1 == r7) goto L30
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L29
            goto L3e
        L29:
            r0 = 1
            int r0 = r9.E(r2, r0)
            return r0
        L30:
            r7 = 8
            long r7 = r7 & r2
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L3e
            r1 = 67
            int r0 = r9.G0(r0, r1)
            return r0
        L3e:
            r0 = 11
            r4 = 0
            r10 = r9
            r11 = r0
            r12 = r4
            r14 = r2
            int r0 = r10.E0(r11, r12, r14)
            return r0
        L4b:
            r1 = 11
            r4 = 0
            r10 = r9
            r11 = r1
            r12 = r4
            r14 = r2
            r10.J0(r11, r12, r14)
            return r0
    }

    private int A0(int r1, int r2, int r3) {
            r0 = this;
            r0.l = r2
            r0.k = r1
            e.e r2 = r0.f1528c     // Catch: java.io.IOException -> L13
            char r2 = r2.k()     // Catch: java.io.IOException -> L13
            r0.f1531f = r2     // Catch: java.io.IOException -> L13
            int r1 = r1 + 1
            int r1 = r0.k(r3, r1)
            return r1
        L13:
            int r1 = r1 + 1
            return r1
    }

    private int B(long r10, long r12, long r14, long r16) {
            r9 = this;
            r6 = r9
            long r0 = r12 & r10
            long r2 = r16 & r14
            long r0 = r0 | r2
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L16
            r1 = 10
            r0 = r9
            r2 = r10
            r4 = r14
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L16:
            r0 = 12
            e.e r1 = r6.f1528c     // Catch: java.io.IOException -> L4b
            char r1 = r1.k()     // Catch: java.io.IOException -> L4b
            r6.f1531f = r1     // Catch: java.io.IOException -> L4b
            r7 = 101(0x65, float:1.42E-43)
            if (r1 == r7) goto L30
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L29
            goto L3e
        L29:
            r0 = 1
            int r0 = r9.F(r2, r0)
            return r0
        L30:
            r7 = 8
            long r7 = r7 & r2
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L3e
            r1 = 67
            int r0 = r9.G0(r0, r1)
            return r0
        L3e:
            r0 = 11
            r4 = 0
            r10 = r9
            r11 = r0
            r12 = r4
            r14 = r2
            int r0 = r10.F0(r11, r12, r14)
            return r0
        L4b:
            r1 = 11
            r4 = 0
            r10 = r9
            r11 = r1
            r12 = r4
            r14 = r2
            r10.K0(r11, r12, r14)
            return r0
    }

    private int B0(int r1, int r2, int r3) {
            r0 = this;
            r0.l = r2
            r0.k = r1
            e.e r2 = r0.f1528c     // Catch: java.io.IOException -> L13
            char r2 = r2.k()     // Catch: java.io.IOException -> L13
            r0.f1531f = r2     // Catch: java.io.IOException -> L13
            int r1 = r1 + 1
            int r1 = r0.l(r3, r1)
            return r1
        L13:
            int r1 = r1 + 1
            return r1
    }

    private int C(long r7, long r9) {
            r6 = this;
            long r4 = r9 & r7
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 11
            r2 = 0
            r0 = r6
            r4 = r7
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L13:
            e.e r0 = r6.f1528c     // Catch: java.io.IOException -> L30
            char r0 = r0.k()     // Catch: java.io.IOException -> L30
            r6.f1531f = r0     // Catch: java.io.IOException -> L30
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L29
            r1 = 12
            r2 = 0
            r0 = r6
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L29:
            r0 = 1
            int r0 = r6.G(r4, r0)
            return r0
        L30:
            r1 = 12
            r2 = 0
            r0 = r6
            r0.H0(r1, r2, r4)
            r0 = 13
            return r0
    }

    private final int C0(int r1, long r2, long r4) {
            r0 = this;
            int r2 = r0.H0(r1, r2, r4)
            int r1 = r1 + 1
            int r1 = r0.i(r2, r1)
            return r1
    }

    private int D(long r7, long r9) {
            r6 = this;
            long r4 = r9 & r7
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 11
            r2 = 0
            r0 = r6
            r4 = r7
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L13:
            e.e r0 = r6.f1528c     // Catch: java.io.IOException -> L30
            char r0 = r0.k()     // Catch: java.io.IOException -> L30
            r6.f1531f = r0     // Catch: java.io.IOException -> L30
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L29
            r1 = 12
            r2 = 0
            r0 = r6
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L29:
            r0 = 1
            int r0 = r6.H(r4, r0)
            return r0
        L30:
            r1 = 12
            r2 = 0
            r0 = r6
            r0.I0(r1, r2, r4)
            r0 = 13
            return r0
    }

    private final int D0(int r1, long r2, long r4) {
            r0 = this;
            int r2 = r0.I0(r1, r2, r4)
            int r1 = r1 + 1
            int r1 = r0.j(r2, r1)
            return r1
    }

    private int E(long r7, long r9) {
            r6 = this;
            long r4 = r9 & r7
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 11
            r2 = 0
            r0 = r6
            r4 = r7
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L13:
            e.e r0 = r6.f1528c     // Catch: java.io.IOException -> L30
            char r0 = r0.k()     // Catch: java.io.IOException -> L30
            r6.f1531f = r0     // Catch: java.io.IOException -> L30
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L29
            r1 = 12
            r2 = 0
            r0 = r6
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L29:
            r0 = 1
            int r0 = r6.I(r4, r0)
            return r0
        L30:
            r1 = 12
            r2 = 0
            r0 = r6
            r0.J0(r1, r2, r4)
            r0 = 13
            return r0
    }

    private final int E0(int r1, long r2, long r4) {
            r0 = this;
            int r2 = r0.J0(r1, r2, r4)
            int r1 = r1 + 1
            int r1 = r0.k(r2, r1)
            return r1
    }

    private int F(long r7, long r9) {
            r6 = this;
            long r4 = r9 & r7
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 11
            r2 = 0
            r0 = r6
            r4 = r7
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L13:
            e.e r0 = r6.f1528c     // Catch: java.io.IOException -> L30
            char r0 = r0.k()     // Catch: java.io.IOException -> L30
            r6.f1531f = r0     // Catch: java.io.IOException -> L30
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L29
            r1 = 12
            r2 = 0
            r0 = r6
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L29:
            r0 = 1
            int r0 = r6.J(r4, r0)
            return r0
        L30:
            r1 = 12
            r2 = 0
            r0 = r6
            r0.K0(r1, r2, r4)
            r0 = 13
            return r0
    }

    private final int F0(int r1, long r2, long r4) {
            r0 = this;
            int r2 = r0.K0(r1, r2, r4)
            int r1 = r1 + 1
            int r1 = r0.l(r2, r1)
            return r1
    }

    private int G(long r7, long r9) {
            r6 = this;
            long r4 = r9 & r7
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 12
            r2 = 0
            r0 = r6
            r4 = r7
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L13:
            e.e r0 = r6.f1528c     // Catch: java.io.IOException -> L30
            char r0 = r0.k()     // Catch: java.io.IOException -> L30
            r6.f1531f = r0     // Catch: java.io.IOException -> L30
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L29
            r1 = 13
            r2 = 0
            r0 = r6
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L29:
            r0 = 1
            int r0 = r6.K(r4, r0)
            return r0
        L30:
            r1 = 13
            r2 = 0
            r0 = r6
            r0.H0(r1, r2, r4)
            r0 = 14
            return r0
    }

    private int G0(int r1, int r2) {
            r0 = this;
            r0.l = r2
            r0.k = r1
            int r1 = r1 + 1
            return r1
    }

    private int H(long r7, long r9) {
            r6 = this;
            long r4 = r9 & r7
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 12
            r2 = 0
            r0 = r6
            r4 = r7
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L13:
            e.e r0 = r6.f1528c     // Catch: java.io.IOException -> L30
            char r0 = r0.k()     // Catch: java.io.IOException -> L30
            r6.f1531f = r0     // Catch: java.io.IOException -> L30
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L29
            r1 = 13
            r2 = 0
            r0 = r6
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L29:
            r0 = 1
            int r0 = r6.L(r4, r0)
            return r0
        L30:
            r1 = 13
            r2 = 0
            r0 = r6
            r0.I0(r1, r2, r4)
            r0 = 14
            return r0
    }

    private final int H0(int r8, long r9, long r11) {
            r7 = this;
            r0 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r2 = 61
            r3 = -1
            r4 = 1
            r5 = 0
            switch(r8) {
                case 0: goto Le1;
                case 1: goto Lc1;
                case 2: goto La5;
                case 3: goto L84;
                case 4: goto L63;
                case 5: goto L48;
                case 6: goto L2d;
                case 7: goto L14;
                case 8: goto Lc;
                default: goto Lb;
            }
        Lb:
            return r3
        Lc:
            long r8 = r9 & r0
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L13
            return r4
        L13:
            return r3
        L14:
            long r11 = r9 & r0
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 == 0) goto L20
            r7.l = r2
            r8 = 7
        L1d:
            r7.k = r8
            return r4
        L20:
            r11 = 841813655168(0xc40000fe80, double:4.159112072186E-312)
            long r8 = r9 & r11
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L2c
            return r4
        L2c:
            return r3
        L2d:
            r11 = 36029638832619136(0x8000c40000fe80, double:2.8486269052344575E-306)
            long r11 = r11 & r9
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 == 0) goto L3b
            r7.l = r2
            r8 = 6
            goto L1d
        L3b:
            r11 = 18017907497763072(0x40033100000100, double:1.781446023254837E-307)
            long r8 = r9 & r11
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L47
            return r4
        L47:
            return r3
        L48:
            r11 = 4432473358336(0x40804000000, double:2.1899328124604E-311)
            long r11 = r11 & r9
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 == 0) goto L53
            return r4
        L53:
            r11 = 54047546330382208(0xc003f50000ff80, double:4.561353605684767E-305)
            long r8 = r9 & r11
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L62
            r7.l = r2
            r8 = 5
            goto L1d
        L62:
            return r3
        L63:
            r11 = 289356276058554432(0x404000000000040, double:2.5653355008115143E-289)
            long r11 = r11 & r9
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 == 0) goto L6e
            return r4
        L6e:
            r11 = 54051978803740544(0xc007fd0400ff80, double:4.565838588084686E-305)
            long r8 = r9 & r11
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L83
            int r8 = r7.k
            r9 = 4
            if (r8 == r9) goto L82
            r7.l = r2
            r7.k = r9
        L82:
            return r4
        L83:
            return r3
        L84:
            r11 = 144317513247817760(0x200b80380010020, double:4.992976308391206E-299)
            long r11 = r11 & r9
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 == 0) goto L8f
            return r4
        L8f:
            r11 = 350163650008383424(0x4dc07fc0400ffc0, double:2.9454092203495083E-285)
            long r8 = r9 & r11
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto La4
            int r8 = r7.k
            r9 = 3
            if (r8 == r9) goto La3
            r7.l = r2
            r7.k = r9
        La3:
            return r4
        La4:
            return r3
        La5:
            r11 = 72972387913433088(0x10340000bfe0000, double:8.772131505505145E-304)
            long r11 = r11 & r9
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 == 0) goto Lb0
            return r4
        Lb0:
            r11 = 494481163256201184(0x6dcbfff8401ffe0, double:1.2974831241201508E-275)
            long r8 = r9 & r11
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto Lc0
            r7.l = r2
            r8 = 2
            goto L1d
        Lc0:
            return r3
        Lc1:
            r11 = 9007201167343616(0x20000072000000, double:4.450149606916904E-308)
            long r11 = r11 & r9
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 == 0) goto Lcc
            return r4
        Lcc:
            r11 = 567453551136079840(0x7dfffff8dffffe0, double:9.464415479645113E-271)
            long r8 = r9 & r11
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto Le0
            int r8 = r7.k
            if (r8 == r4) goto Ldf
            r7.l = r2
            r7.k = r4
        Ldf:
            return r4
        Le0:
            return r3
        Le1:
            r0 = 576460752303423456(0x7ffffffffffffe0, double:3.7857669957336656E-270)
            long r0 = r0 & r9
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 == 0) goto Lee
            r7.l = r2
            return r4
        Lee:
            r0 = 14
            long r0 = r0 & r9
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 == 0) goto Lf8
            r8 = 52
            return r8
        Lf8:
            r0 = -4611686018427387904(0xc000000000000000, double:-2.0)
            long r8 = r9 & r0
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L109
            r8 = 3071(0xbff, double:1.5173E-320)
            long r8 = r8 & r11
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L108
            goto L109
        L108:
            return r3
        L109:
            r8 = 30
            return r8
    }

    private int I(long r7, long r9) {
            r6 = this;
            long r4 = r9 & r7
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 12
            r2 = 0
            r0 = r6
            r4 = r7
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L13:
            e.e r0 = r6.f1528c     // Catch: java.io.IOException -> L30
            char r0 = r0.k()     // Catch: java.io.IOException -> L30
            r6.f1531f = r0     // Catch: java.io.IOException -> L30
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L29
            r1 = 13
            r2 = 0
            r0 = r6
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L29:
            r0 = 1
            int r0 = r6.M(r4, r0)
            return r0
        L30:
            r1 = 13
            r2 = 0
            r0 = r6
            r0.J0(r1, r2, r4)
            r0 = 14
            return r0
    }

    private final int I0(int r6, long r7, long r9) {
            r5 = this;
            r0 = -1
            if (r6 == 0) goto L4
            return r0
        L4:
            r1 = 14
            long r1 = r1 & r7
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L10
            r6 = 51
            return r6
        L10:
            r1 = -4611686018427387904(0xc000000000000000, double:-2.0)
            long r6 = r7 & r1
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L21
            r6 = 3071(0xbff, double:1.5173E-320)
            long r6 = r6 & r9
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 == 0) goto L20
            goto L21
        L20:
            return r0
        L21:
            r6 = 27
            return r6
    }

    private int J(long r7, long r9) {
            r6 = this;
            long r4 = r9 & r7
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 12
            r2 = 0
            r0 = r6
            r4 = r7
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L13:
            e.e r0 = r6.f1528c     // Catch: java.io.IOException -> L30
            char r0 = r0.k()     // Catch: java.io.IOException -> L30
            r6.f1531f = r0     // Catch: java.io.IOException -> L30
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L29
            r1 = 13
            r2 = 0
            r0 = r6
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L29:
            r0 = 1
            int r0 = r6.N(r4, r0)
            return r0
        L30:
            r1 = 13
            r2 = 0
            r0 = r6
            r0.K0(r1, r2, r4)
            r0 = 14
            return r0
    }

    private final int J0(int r6, long r7, long r9) {
            r5 = this;
            r0 = -1
            if (r6 == 0) goto L4
            return r0
        L4:
            r1 = -4611686018427387904(0xc000000000000000, double:-2.0)
            long r1 = r1 & r7
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L21
            r1 = 3071(0xbff, double:1.5173E-320)
            long r9 = r9 & r1
            int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r6 == 0) goto L15
            goto L21
        L15:
            r9 = 14
            long r6 = r7 & r9
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 == 0) goto L20
            r6 = 51
            return r6
        L20:
            return r0
        L21:
            r6 = 26
            return r6
    }

    private int K(long r9, long r11) {
            r8 = this;
            long r4 = r11 & r9
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 13
            r2 = 0
            r0 = r8
            r4 = r9
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L13:
            r6 = 15
            e.e r2 = r8.f1528c     // Catch: java.io.IOException -> L3a
            char r2 = r2.k()     // Catch: java.io.IOException -> L3a
            r8.f1531f = r2     // Catch: java.io.IOException -> L3a
            r3 = 100
            if (r2 == r3) goto L22
            goto L30
        L22:
            r2 = 1
            long r2 = r2 & r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L30
            r0 = 64
            int r0 = r8.G0(r6, r0)
            return r0
        L30:
            r1 = 14
            r2 = 0
            r0 = r8
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L3a:
            r1 = 14
            r2 = 0
            r0 = r8
            r0.H0(r1, r2, r4)
            return r6
    }

    private final int K0(int r6, long r7, long r9) {
            r5 = this;
            r0 = -1
            if (r6 == 0) goto L4
            return r0
        L4:
            r1 = -4611686018427387904(0xc000000000000000, double:-2.0)
            long r1 = r1 & r7
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L21
            r1 = 3071(0xbff, double:1.5173E-320)
            long r9 = r9 & r1
            int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r6 == 0) goto L15
            goto L21
        L15:
            r9 = 14
            long r6 = r7 & r9
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 == 0) goto L20
            r6 = 50
            return r6
        L20:
            return r0
        L21:
            r6 = 28
            return r6
    }

    private int L(long r9, long r11) {
            r8 = this;
            long r4 = r11 & r9
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 13
            r2 = 0
            r0 = r8
            r4 = r9
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L13:
            r6 = 15
            e.e r2 = r8.f1528c     // Catch: java.io.IOException -> L3a
            char r2 = r2.k()     // Catch: java.io.IOException -> L3a
            r8.f1531f = r2     // Catch: java.io.IOException -> L3a
            r3 = 100
            if (r2 == r3) goto L22
            goto L30
        L22:
            r2 = 1
            long r2 = r2 & r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L30
            r0 = 64
            int r0 = r8.G0(r6, r0)
            return r0
        L30:
            r1 = 14
            r2 = 0
            r0 = r8
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L3a:
            r1 = 14
            r2 = 0
            r0 = r8
            r0.I0(r1, r2, r4)
            return r6
    }

    private int M(long r9, long r11) {
            r8 = this;
            long r4 = r11 & r9
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 13
            r2 = 0
            r0 = r8
            r4 = r9
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L13:
            r6 = 15
            e.e r2 = r8.f1528c     // Catch: java.io.IOException -> L3a
            char r2 = r2.k()     // Catch: java.io.IOException -> L3a
            r8.f1531f = r2     // Catch: java.io.IOException -> L3a
            r3 = 100
            if (r2 == r3) goto L22
            goto L30
        L22:
            r2 = 1
            long r2 = r2 & r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L30
            r0 = 64
            int r0 = r8.G0(r6, r0)
            return r0
        L30:
            r1 = 14
            r2 = 0
            r0 = r8
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L3a:
            r1 = 14
            r2 = 0
            r0 = r8
            r0.J0(r1, r2, r4)
            return r6
    }

    private int N(long r9, long r11) {
            r8 = this;
            long r4 = r11 & r9
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r1 = 13
            r2 = 0
            r0 = r8
            r4 = r9
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L13:
            r6 = 15
            e.e r2 = r8.f1528c     // Catch: java.io.IOException -> L3a
            char r2 = r2.k()     // Catch: java.io.IOException -> L3a
            r8.f1531f = r2     // Catch: java.io.IOException -> L3a
            r3 = 100
            if (r2 == r3) goto L22
            goto L30
        L22:
            r2 = 1
            long r2 = r2 & r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L30
            r0 = 64
            int r0 = r8.G0(r6, r0)
            return r0
        L30:
            r1 = 14
            r2 = 0
            r0 = r8
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L3a:
            r1 = 14
            r2 = 0
            r0 = r8
            r0.K0(r1, r2, r4)
            return r6
    }

    private int O(long r10, long r12) {
            r9 = this;
            r6 = 1
            e.e r0 = r9.f1528c     // Catch: java.io.IOException -> L1d0
            char r0 = r0.k()     // Catch: java.io.IOException -> L1d0
            r9.f1531f = r0     // Catch: java.io.IOException -> L1d0
            r1 = 46
            r2 = 0
            if (r0 == r1) goto L1b9
            r1 = 65
            if (r0 == r1) goto L1aa
            r1 = 88
            if (r0 == r1) goto L19b
            r1 = 97
            if (r0 == r1) goto L18f
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L183
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L177
            r1 = 72
            if (r0 == r1) goto L16b
            r1 = 73
            if (r0 == r1) goto L15e
            r1 = 84
            if (r0 == r1) goto L14f
            r1 = 85
            if (r0 == r1) goto L140
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L134
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L128
            r1 = 114(0x72, float:1.6E-43)
            if (r0 == r1) goto L11c
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L110
            switch(r0) {
                case 68: goto L101;
                case 69: goto Le4;
                case 70: goto Ld5;
                default: goto L46;
            }
        L46:
            switch(r0) {
                case 75: goto Lc9;
                case 76: goto Lba;
                case 77: goto Lad;
                case 78: goto L9e;
                case 79: goto L8f;
                case 80: goto L81;
                case 81: goto L72;
                default: goto L49;
            }
        L49:
            switch(r0) {
                case 108: goto L66;
                case 109: goto L5a;
                case 110: goto L4e;
                default: goto L4c;
            }
        L4c:
            goto L1c7
        L4e:
            r3 = 0
            r7 = 2
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L5a:
            r3 = 0
            r7 = 8
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L66:
            r3 = -9223372036854775808
            r7 = 97
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L72:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 28
            int r0 = r9.y0(r6, r0, r6)
            return r0
        L81:
            r0 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 53
            int r0 = r9.y0(r6, r0, r6)
            return r0
        L8f:
            r3 = 5700074526999008(0x144030056001e0, double:2.816211002525003E-308)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L9e:
            r3 = 17592194433024(0x100000800000, double:8.691698904317E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        Lad:
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        Lba:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        Lc9:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        Ld5:
            r3 = 824633720832(0xc000000000, double:4.074231918653E-312)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        Le4:
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf2
            r0 = 30
            r9.l = r0
            r9.k = r6
        Lf2:
            r3 = 18015538856984064(0x4001098201fe00, double:1.78050981202584E-307)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L101:
            r3 = 8796093153280(0x80000020000, double:4.345847444655E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L110:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L11c:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L128:
            r3 = 0
            r7 = 256(0x100, double:1.265E-321)
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L134:
            r3 = 0
            r7 = 640(0x280, double:3.16E-321)
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L140:
            r3 = 2251799814471680(0x80000000c0000, double:1.1125369296421497E-308)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L14f:
            r0 = 536870912(0x20000000, double:2.65249474E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 29
            int r0 = r9.y0(r6, r0, r6)
            return r0
        L15e:
            r3 = 1048576(0x100000, double:5.180654E-318)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L16b:
            r3 = 844424930131968(0x3000000000000, double:4.172013484701003E-309)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L177:
            r3 = 0
            r7 = 16
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L183:
            r3 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            r7 = 4
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L18f:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L19b:
            r3 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L1aa:
            r3 = 39608188403712(0x240600000000, double:1.95690451842817E-310)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.S(r1, r3, r5, r7)
            return r0
        L1b9:
            r0 = 2048(0x800, double:1.012E-320)
            long r0 = r0 & r12
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 75
            int r0 = r9.G0(r6, r0)
            return r0
        L1c7:
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r12
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L1d0:
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r12
            r0.H0(r1, r2, r4)
            return r6
    }

    private int P(long r10, long r12) {
            r9 = this;
            r6 = 1
            e.e r0 = r9.f1528c     // Catch: java.io.IOException -> L1d0
            char r0 = r0.k()     // Catch: java.io.IOException -> L1d0
            r9.f1531f = r0     // Catch: java.io.IOException -> L1d0
            r1 = 46
            r2 = 0
            if (r0 == r1) goto L1b9
            r1 = 65
            if (r0 == r1) goto L1aa
            r1 = 88
            if (r0 == r1) goto L19b
            r1 = 97
            if (r0 == r1) goto L18f
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L183
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L177
            r1 = 72
            if (r0 == r1) goto L16b
            r1 = 73
            if (r0 == r1) goto L15e
            r1 = 84
            if (r0 == r1) goto L14f
            r1 = 85
            if (r0 == r1) goto L140
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L134
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L128
            r1 = 114(0x72, float:1.6E-43)
            if (r0 == r1) goto L11c
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L110
            switch(r0) {
                case 68: goto L101;
                case 69: goto Le4;
                case 70: goto Ld5;
                default: goto L46;
            }
        L46:
            switch(r0) {
                case 75: goto Lc9;
                case 76: goto Lba;
                case 77: goto Lad;
                case 78: goto L9e;
                case 79: goto L8f;
                case 80: goto L81;
                case 81: goto L72;
                default: goto L49;
            }
        L49:
            switch(r0) {
                case 108: goto L66;
                case 109: goto L5a;
                case 110: goto L4e;
                default: goto L4c;
            }
        L4c:
            goto L1c7
        L4e:
            r3 = 0
            r7 = 2
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L5a:
            r3 = 0
            r7 = 8
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L66:
            r3 = -9223372036854775808
            r7 = 97
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L72:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 28
            int r0 = r9.G0(r6, r0)
            return r0
        L81:
            r0 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 53
            int r0 = r9.G0(r6, r0)
            return r0
        L8f:
            r3 = 5700074526999008(0x144030056001e0, double:2.816211002525003E-308)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L9e:
            r3 = 17592194433024(0x100000800000, double:8.691698904317E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        Lad:
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        Lba:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        Lc9:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        Ld5:
            r3 = 824633720832(0xc000000000, double:4.074231918653E-312)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        Le4:
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf2
            r0 = 30
            r9.l = r0
            r9.k = r6
        Lf2:
            r3 = 18015538856984064(0x4001098201fe00, double:1.78050981202584E-307)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L101:
            r3 = 8796093153280(0x80000020000, double:4.345847444655E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L110:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L11c:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L128:
            r3 = 0
            r7 = 256(0x100, double:1.265E-321)
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L134:
            r3 = 0
            r7 = 640(0x280, double:3.16E-321)
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L140:
            r3 = 2251799814471680(0x80000000c0000, double:1.1125369296421497E-308)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L14f:
            r0 = 536870912(0x20000000, double:2.65249474E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 29
            int r0 = r9.G0(r6, r0)
            return r0
        L15e:
            r3 = 1048576(0x100000, double:5.180654E-318)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L16b:
            r3 = 844424930131968(0x3000000000000, double:4.172013484701003E-309)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L177:
            r3 = 0
            r7 = 16
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L183:
            r3 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            r7 = 4
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L18f:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L19b:
            r3 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L1aa:
            r3 = 39608188403712(0x240600000000, double:1.95690451842817E-310)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.T(r1, r3, r5, r7)
            return r0
        L1b9:
            r0 = 2048(0x800, double:1.012E-320)
            long r0 = r0 & r12
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 75
            int r0 = r9.G0(r6, r0)
            return r0
        L1c7:
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r12
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L1d0:
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r12
            r0.I0(r1, r2, r4)
            return r6
    }

    private int Q(long r10, long r12) {
            r9 = this;
            r6 = 1
            e.e r0 = r9.f1528c     // Catch: java.io.IOException -> L1d0
            char r0 = r0.k()     // Catch: java.io.IOException -> L1d0
            r9.f1531f = r0     // Catch: java.io.IOException -> L1d0
            r1 = 46
            r2 = 0
            if (r0 == r1) goto L1b9
            r1 = 65
            if (r0 == r1) goto L1aa
            r1 = 88
            if (r0 == r1) goto L19b
            r1 = 97
            if (r0 == r1) goto L18f
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L183
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L177
            r1 = 72
            if (r0 == r1) goto L16b
            r1 = 73
            if (r0 == r1) goto L15e
            r1 = 84
            if (r0 == r1) goto L14f
            r1 = 85
            if (r0 == r1) goto L140
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L134
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L128
            r1 = 114(0x72, float:1.6E-43)
            if (r0 == r1) goto L11c
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L110
            switch(r0) {
                case 68: goto L101;
                case 69: goto Le4;
                case 70: goto Ld5;
                default: goto L46;
            }
        L46:
            switch(r0) {
                case 75: goto Lc9;
                case 76: goto Lba;
                case 77: goto Lad;
                case 78: goto L9e;
                case 79: goto L8f;
                case 80: goto L81;
                case 81: goto L72;
                default: goto L49;
            }
        L49:
            switch(r0) {
                case 108: goto L66;
                case 109: goto L5a;
                case 110: goto L4e;
                default: goto L4c;
            }
        L4c:
            goto L1c7
        L4e:
            r3 = 0
            r7 = 2
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L5a:
            r3 = 0
            r7 = 8
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L66:
            r3 = -9223372036854775808
            r7 = 97
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L72:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 28
            int r0 = r9.G0(r6, r0)
            return r0
        L81:
            r0 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 53
            int r0 = r9.G0(r6, r0)
            return r0
        L8f:
            r3 = 5700074526999008(0x144030056001e0, double:2.816211002525003E-308)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L9e:
            r3 = 17592194433024(0x100000800000, double:8.691698904317E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        Lad:
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        Lba:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        Lc9:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        Ld5:
            r3 = 824633720832(0xc000000000, double:4.074231918653E-312)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        Le4:
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf2
            r0 = 30
            r9.l = r0
            r9.k = r6
        Lf2:
            r3 = 18015538856984064(0x4001098201fe00, double:1.78050981202584E-307)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L101:
            r3 = 8796093153280(0x80000020000, double:4.345847444655E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L110:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L11c:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L128:
            r3 = 0
            r7 = 256(0x100, double:1.265E-321)
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L134:
            r3 = 0
            r7 = 640(0x280, double:3.16E-321)
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L140:
            r3 = 2251799814471680(0x80000000c0000, double:1.1125369296421497E-308)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L14f:
            r0 = 536870912(0x20000000, double:2.65249474E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 29
            int r0 = r9.G0(r6, r0)
            return r0
        L15e:
            r3 = 1048576(0x100000, double:5.180654E-318)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L16b:
            r3 = 844424930131968(0x3000000000000, double:4.172013484701003E-309)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L177:
            r3 = 0
            r7 = 16
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L183:
            r3 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            r7 = 4
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L18f:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L19b:
            r3 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L1aa:
            r3 = 39608188403712(0x240600000000, double:1.95690451842817E-310)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.U(r1, r3, r5, r7)
            return r0
        L1b9:
            r0 = 2048(0x800, double:1.012E-320)
            long r0 = r0 & r12
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 75
            int r0 = r9.G0(r6, r0)
            return r0
        L1c7:
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r12
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L1d0:
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r12
            r0.J0(r1, r2, r4)
            return r6
    }

    private int R(long r10, long r12) {
            r9 = this;
            r6 = 1
            e.e r0 = r9.f1528c     // Catch: java.io.IOException -> L1d0
            char r0 = r0.k()     // Catch: java.io.IOException -> L1d0
            r9.f1531f = r0     // Catch: java.io.IOException -> L1d0
            r1 = 46
            r2 = 0
            if (r0 == r1) goto L1b9
            r1 = 65
            if (r0 == r1) goto L1aa
            r1 = 88
            if (r0 == r1) goto L19b
            r1 = 97
            if (r0 == r1) goto L18f
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L183
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L177
            r1 = 72
            if (r0 == r1) goto L16b
            r1 = 73
            if (r0 == r1) goto L15e
            r1 = 84
            if (r0 == r1) goto L14f
            r1 = 85
            if (r0 == r1) goto L140
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L134
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L128
            r1 = 114(0x72, float:1.6E-43)
            if (r0 == r1) goto L11c
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L110
            switch(r0) {
                case 68: goto L101;
                case 69: goto Le4;
                case 70: goto Ld5;
                default: goto L46;
            }
        L46:
            switch(r0) {
                case 75: goto Lc9;
                case 76: goto Lba;
                case 77: goto Lad;
                case 78: goto L9e;
                case 79: goto L8f;
                case 80: goto L81;
                case 81: goto L72;
                default: goto L49;
            }
        L49:
            switch(r0) {
                case 108: goto L66;
                case 109: goto L5a;
                case 110: goto L4e;
                default: goto L4c;
            }
        L4c:
            goto L1c7
        L4e:
            r3 = 0
            r7 = 2
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L5a:
            r3 = 0
            r7 = 8
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L66:
            r3 = -9223372036854775808
            r7 = 97
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L72:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 28
            int r0 = r9.G0(r6, r0)
            return r0
        L81:
            r0 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 53
            int r0 = r9.G0(r6, r0)
            return r0
        L8f:
            r3 = 5700074526999008(0x144030056001e0, double:2.816211002525003E-308)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L9e:
            r3 = 17592194433024(0x100000800000, double:8.691698904317E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        Lad:
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        Lba:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        Lc9:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        Ld5:
            r3 = 824633720832(0xc000000000, double:4.074231918653E-312)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        Le4:
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf2
            r0 = 30
            r9.l = r0
            r9.k = r6
        Lf2:
            r3 = 18015538856984064(0x4001098201fe00, double:1.78050981202584E-307)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L101:
            r3 = 8796093153280(0x80000020000, double:4.345847444655E-311)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L110:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L11c:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L128:
            r3 = 0
            r7 = 256(0x100, double:1.265E-321)
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L134:
            r3 = 0
            r7 = 640(0x280, double:3.16E-321)
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L140:
            r3 = 2251799814471680(0x80000000c0000, double:1.1125369296421497E-308)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L14f:
            r0 = 536870912(0x20000000, double:2.65249474E-315)
            long r0 = r0 & r10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 29
            int r0 = r9.G0(r6, r0)
            return r0
        L15e:
            r3 = 1048576(0x100000, double:5.180654E-318)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L16b:
            r3 = 844424930131968(0x3000000000000, double:4.172013484701003E-309)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L177:
            r3 = 0
            r7 = 16
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L183:
            r3 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            r7 = 4
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L18f:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L19b:
            r3 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L1aa:
            r3 = 39608188403712(0x240600000000, double:1.95690451842817E-310)
            r7 = 0
            r0 = r9
            r1 = r10
            r5 = r12
            int r0 = r0.V(r1, r3, r5, r7)
            return r0
        L1b9:
            r0 = 2048(0x800, double:1.012E-320)
            long r0 = r0 & r12
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r0 = 75
            int r0 = r9.G0(r6, r0)
            return r0
        L1c7:
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r12
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L1d0:
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r12
            r0.K0(r1, r2, r4)
            return r6
    }

    private int S(long r13, long r15, long r17, long r19) {
            r12 = this;
            r9 = r12
            long r1 = r15 & r13
            long r5 = r19 & r17
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 0
            r0 = r12
            r2 = r13
            r4 = r17
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L17:
            r0 = 2
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1fe
            char r3 = r3.k()     // Catch: java.io.IOException -> L1fe
            r9.f1531f = r3     // Catch: java.io.IOException -> L1fe
            r4 = 65
            if (r3 == r4) goto L1f4
            r4 = 66
            r10 = 1
            if (r3 == r4) goto L1da
            r4 = 68
            if (r3 == r4) goto L1bc
            r4 = 73
            if (r3 == r4) goto L1af
            r4 = 97
            if (r3 == r4) goto L1a5
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto L19b
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L183
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L179
            r4 = 117(0x75, float:1.64E-43)
            if (r3 == r4) goto L16f
            r4 = 86
            if (r3 == r4) goto L156
            r4 = 87
            if (r3 == r4) goto L13c
            switch(r3) {
                case 76: goto L112;
                case 77: goto L103;
                case 78: goto Le7;
                case 79: goto Lda;
                case 80: goto Lcb;
                default: goto L50;
            }
        L50:
            switch(r3) {
                case 82: goto L9f;
                case 83: goto L92;
                case 84: goto L76;
                default: goto L53;
            }
        L53:
            switch(r3) {
                case 110: goto L6c;
                case 111: goto L62;
                case 112: goto L58;
                default: goto L56;
            }
        L56:
            goto L1e9
        L58:
            r3 = 0
            r7 = 16
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L62:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 64
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L6c:
            r3 = 0
            r7 = 640(0x280, double:3.16E-321)
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L76:
            r3 = 16777216(0x1000000, double:8.289046E-317)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L85
            r1 = 24
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L85:
            r3 = 22519132008250880(0x50010800007e00, double:3.5610145046591245E-307)
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L92:
            r3 = 6442450944(0x180000000, double:3.1829936864E-314)
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L9f:
            r3 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lb0
            r1 = 46
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lb0:
            r3 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lbe
            r1 = 49
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lbe:
            r3 = 4604204941312(0x43000000000, double:2.274779487915E-311)
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        Lcb:
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L1e9
            r1 = 27
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lda:
            r3 = 161353331376128(0x92c000000000, double:7.97191378749834E-310)
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        Le7:
            r3 = 33554432(0x2000000, double:1.6578092E-316)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lf6
            r1 = 25
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lf6:
            r3 = 3412884159725568(0xc200004000000, double:1.686188816556173E-308)
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L103:
            r3 = 8388608(0x800000, double:4.144523E-317)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L1e9
            r1 = 23
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L112:
            r3 = 524288(0x80000, double:2.590327E-318)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L121
            r1 = 19
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L121:
            r3 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L12f
            r1 = 48
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L12f:
            r3 = 8590000128(0x200010000, double:4.244023961E-314)
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L13c:
            r3 = 4194304(0x400000, double:2.0722615E-317)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L14b
            r1 = 22
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L14b:
            r3 = 32768(0x8000, double:1.61895E-319)
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L156:
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L165
            r1 = 20
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L165:
            r3 = 32
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L16f:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r7 = 258(0x102, double:1.275E-321)
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L179:
            r3 = 0
            r7 = 4
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L183:
            r3 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L191
            r1 = 56
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L191:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L19b:
            r3 = -9223372036854775808
            r7 = 32
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L1a5:
            r3 = 0
            r7 = 9
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L1af:
            r3 = 36037610291855360(0x80080400000000, double:2.8536680881539355E-306)
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L1bc:
            r3 = 131072(0x20000, double:6.4758E-319)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L1cb
            r1 = 17
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L1cb:
            r3 = 2097152(0x200000, double:1.036131E-317)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L1e9
            r1 = 21
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L1da:
            r3 = 262144(0x40000, double:1.295163E-318)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L1e9
            r1 = 18
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L1e9:
            r0 = 1
            r13 = r12
            r14 = r0
            r15 = r1
            r17 = r5
            int r0 = r13.C0(r14, r15, r17)
            return r0
        L1f4:
            r3 = 448(0x1c0, double:2.213E-321)
            r7 = 0
            r0 = r12
            int r0 = r0.W(r1, r3, r5, r7)
            return r0
        L1fe:
            r3 = 1
            r13 = r12
            r14 = r3
            r15 = r1
            r17 = r5
            r13.H0(r14, r15, r17)
            return r0
    }

    private int T(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 0
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L17:
            r0 = 2
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1fd
            char r3 = r3.k()     // Catch: java.io.IOException -> L1fd
            r9.f1531f = r3     // Catch: java.io.IOException -> L1fd
            r4 = 65
            if (r3 == r4) goto L1f3
            r4 = 66
            if (r3 == r4) goto L1d9
            r4 = 68
            if (r3 == r4) goto L1bb
            r4 = 73
            if (r3 == r4) goto L1ae
            r4 = 97
            if (r3 == r4) goto L1a4
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto L19a
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L182
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L178
            r4 = 117(0x75, float:1.64E-43)
            if (r3 == r4) goto L16e
            r4 = 86
            if (r3 == r4) goto L155
            r4 = 87
            if (r3 == r4) goto L13b
            switch(r3) {
                case 76: goto L111;
                case 77: goto L102;
                case 78: goto Le6;
                case 79: goto Ld9;
                case 80: goto Lca;
                default: goto L4f;
            }
        L4f:
            switch(r3) {
                case 82: goto L9e;
                case 83: goto L91;
                case 84: goto L75;
                default: goto L52;
            }
        L52:
            switch(r3) {
                case 110: goto L6b;
                case 111: goto L61;
                case 112: goto L57;
                default: goto L55;
            }
        L55:
            goto L1e8
        L57:
            r3 = 0
            r7 = 16
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L61:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 64
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L6b:
            r3 = 0
            r7 = 640(0x280, double:3.16E-321)
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L75:
            r3 = 16777216(0x1000000, double:8.289046E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L84
            r1 = 24
            int r0 = r11.G0(r0, r1)
            return r0
        L84:
            r3 = 22519132008250880(0x50010800007e00, double:3.5610145046591245E-307)
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L91:
            r3 = 6442450944(0x180000000, double:3.1829936864E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L9e:
            r3 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Laf
            r1 = 46
            int r0 = r11.G0(r0, r1)
            return r0
        Laf:
            r3 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lbd
            r1 = 49
            int r0 = r11.G0(r0, r1)
            return r0
        Lbd:
            r3 = 4604204941312(0x43000000000, double:2.274779487915E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        Lca:
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 27
            int r0 = r11.G0(r0, r1)
            return r0
        Ld9:
            r3 = 161353331376128(0x92c000000000, double:7.97191378749834E-310)
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        Le6:
            r3 = 33554432(0x2000000, double:1.6578092E-316)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf5
            r1 = 25
            int r0 = r11.G0(r0, r1)
            return r0
        Lf5:
            r3 = 3412884159725568(0xc200004000000, double:1.686188816556173E-308)
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L102:
            r3 = 8388608(0x800000, double:4.144523E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 23
            int r0 = r11.G0(r0, r1)
            return r0
        L111:
            r3 = 524288(0x80000, double:2.590327E-318)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L120
            r1 = 19
            int r0 = r11.G0(r0, r1)
            return r0
        L120:
            r3 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L12e
            r1 = 48
            int r0 = r11.G0(r0, r1)
            return r0
        L12e:
            r3 = 8590000128(0x200010000, double:4.244023961E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L13b:
            r3 = 4194304(0x400000, double:2.0722615E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L14a
            r1 = 22
            int r0 = r11.G0(r0, r1)
            return r0
        L14a:
            r3 = 32768(0x8000, double:1.61895E-319)
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L155:
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L164
            r1 = 20
            int r0 = r11.G0(r0, r1)
            return r0
        L164:
            r3 = 32
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L16e:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r7 = 258(0x102, double:1.275E-321)
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L178:
            r3 = 0
            r7 = 4
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L182:
            r3 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L190
            r1 = 56
            int r0 = r11.G0(r0, r1)
            return r0
        L190:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L19a:
            r3 = -9223372036854775808
            r7 = 32
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L1a4:
            r3 = 0
            r7 = 9
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L1ae:
            r3 = 36037610291855360(0x80080400000000, double:2.8536680881539355E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L1bb:
            r3 = 131072(0x20000, double:6.4758E-319)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1ca
            r1 = 17
            int r0 = r11.G0(r0, r1)
            return r0
        L1ca:
            r3 = 2097152(0x200000, double:1.036131E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 21
            int r0 = r11.G0(r0, r1)
            return r0
        L1d9:
            r3 = 262144(0x40000, double:1.295163E-318)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 18
            int r0 = r11.G0(r0, r1)
            return r0
        L1e8:
            r0 = 1
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.D0(r13, r14, r16)
            return r0
        L1f3:
            r3 = 448(0x1c0, double:2.213E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.X(r1, r3, r5, r7)
            return r0
        L1fd:
            r3 = 1
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.I0(r13, r14, r16)
            return r0
    }

    private int U(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 0
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L17:
            r0 = 2
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1fd
            char r3 = r3.k()     // Catch: java.io.IOException -> L1fd
            r9.f1531f = r3     // Catch: java.io.IOException -> L1fd
            r4 = 65
            if (r3 == r4) goto L1f3
            r4 = 66
            if (r3 == r4) goto L1d9
            r4 = 68
            if (r3 == r4) goto L1bb
            r4 = 73
            if (r3 == r4) goto L1ae
            r4 = 97
            if (r3 == r4) goto L1a4
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto L19a
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L182
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L178
            r4 = 117(0x75, float:1.64E-43)
            if (r3 == r4) goto L16e
            r4 = 86
            if (r3 == r4) goto L155
            r4 = 87
            if (r3 == r4) goto L13b
            switch(r3) {
                case 76: goto L111;
                case 77: goto L102;
                case 78: goto Le6;
                case 79: goto Ld9;
                case 80: goto Lca;
                default: goto L4f;
            }
        L4f:
            switch(r3) {
                case 82: goto L9e;
                case 83: goto L91;
                case 84: goto L75;
                default: goto L52;
            }
        L52:
            switch(r3) {
                case 110: goto L6b;
                case 111: goto L61;
                case 112: goto L57;
                default: goto L55;
            }
        L55:
            goto L1e8
        L57:
            r3 = 0
            r7 = 16
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L61:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 64
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L6b:
            r3 = 0
            r7 = 640(0x280, double:3.16E-321)
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L75:
            r3 = 16777216(0x1000000, double:8.289046E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L84
            r1 = 24
            int r0 = r11.G0(r0, r1)
            return r0
        L84:
            r3 = 22519132008250880(0x50010800007e00, double:3.5610145046591245E-307)
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L91:
            r3 = 6442450944(0x180000000, double:3.1829936864E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L9e:
            r3 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Laf
            r1 = 46
            int r0 = r11.G0(r0, r1)
            return r0
        Laf:
            r3 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lbd
            r1 = 49
            int r0 = r11.G0(r0, r1)
            return r0
        Lbd:
            r3 = 4604204941312(0x43000000000, double:2.274779487915E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        Lca:
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 27
            int r0 = r11.G0(r0, r1)
            return r0
        Ld9:
            r3 = 161353331376128(0x92c000000000, double:7.97191378749834E-310)
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        Le6:
            r3 = 33554432(0x2000000, double:1.6578092E-316)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf5
            r1 = 25
            int r0 = r11.G0(r0, r1)
            return r0
        Lf5:
            r3 = 3412884159725568(0xc200004000000, double:1.686188816556173E-308)
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L102:
            r3 = 8388608(0x800000, double:4.144523E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 23
            int r0 = r11.G0(r0, r1)
            return r0
        L111:
            r3 = 524288(0x80000, double:2.590327E-318)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L120
            r1 = 19
            int r0 = r11.G0(r0, r1)
            return r0
        L120:
            r3 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L12e
            r1 = 48
            int r0 = r11.G0(r0, r1)
            return r0
        L12e:
            r3 = 8590000128(0x200010000, double:4.244023961E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L13b:
            r3 = 4194304(0x400000, double:2.0722615E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L14a
            r1 = 22
            int r0 = r11.G0(r0, r1)
            return r0
        L14a:
            r3 = 32768(0x8000, double:1.61895E-319)
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L155:
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L164
            r1 = 20
            int r0 = r11.G0(r0, r1)
            return r0
        L164:
            r3 = 32
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L16e:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r7 = 258(0x102, double:1.275E-321)
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L178:
            r3 = 0
            r7 = 4
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L182:
            r3 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L190
            r1 = 56
            int r0 = r11.G0(r0, r1)
            return r0
        L190:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L19a:
            r3 = -9223372036854775808
            r7 = 32
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L1a4:
            r3 = 0
            r7 = 9
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L1ae:
            r3 = 36037610291855360(0x80080400000000, double:2.8536680881539355E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L1bb:
            r3 = 131072(0x20000, double:6.4758E-319)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1ca
            r1 = 17
            int r0 = r11.G0(r0, r1)
            return r0
        L1ca:
            r3 = 2097152(0x200000, double:1.036131E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 21
            int r0 = r11.G0(r0, r1)
            return r0
        L1d9:
            r3 = 262144(0x40000, double:1.295163E-318)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 18
            int r0 = r11.G0(r0, r1)
            return r0
        L1e8:
            r0 = 1
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.E0(r13, r14, r16)
            return r0
        L1f3:
            r3 = 448(0x1c0, double:2.213E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.Y(r1, r3, r5, r7)
            return r0
        L1fd:
            r3 = 1
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.J0(r13, r14, r16)
            return r0
    }

    private int V(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 0
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L17:
            r0 = 2
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1fd
            char r3 = r3.k()     // Catch: java.io.IOException -> L1fd
            r9.f1531f = r3     // Catch: java.io.IOException -> L1fd
            r4 = 65
            if (r3 == r4) goto L1f3
            r4 = 66
            if (r3 == r4) goto L1d9
            r4 = 68
            if (r3 == r4) goto L1bb
            r4 = 73
            if (r3 == r4) goto L1ae
            r4 = 97
            if (r3 == r4) goto L1a4
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto L19a
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L182
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L178
            r4 = 117(0x75, float:1.64E-43)
            if (r3 == r4) goto L16e
            r4 = 86
            if (r3 == r4) goto L155
            r4 = 87
            if (r3 == r4) goto L13b
            switch(r3) {
                case 76: goto L111;
                case 77: goto L102;
                case 78: goto Le6;
                case 79: goto Ld9;
                case 80: goto Lca;
                default: goto L4f;
            }
        L4f:
            switch(r3) {
                case 82: goto L9e;
                case 83: goto L91;
                case 84: goto L75;
                default: goto L52;
            }
        L52:
            switch(r3) {
                case 110: goto L6b;
                case 111: goto L61;
                case 112: goto L57;
                default: goto L55;
            }
        L55:
            goto L1e8
        L57:
            r3 = 0
            r7 = 16
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L61:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 64
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L6b:
            r3 = 0
            r7 = 640(0x280, double:3.16E-321)
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L75:
            r3 = 16777216(0x1000000, double:8.289046E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L84
            r1 = 24
            int r0 = r11.G0(r0, r1)
            return r0
        L84:
            r3 = 22519132008250880(0x50010800007e00, double:3.5610145046591245E-307)
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L91:
            r3 = 6442450944(0x180000000, double:3.1829936864E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L9e:
            r3 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Laf
            r1 = 46
            int r0 = r11.G0(r0, r1)
            return r0
        Laf:
            r3 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lbd
            r1 = 49
            int r0 = r11.G0(r0, r1)
            return r0
        Lbd:
            r3 = 4604204941312(0x43000000000, double:2.274779487915E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        Lca:
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 27
            int r0 = r11.G0(r0, r1)
            return r0
        Ld9:
            r3 = 161353331376128(0x92c000000000, double:7.97191378749834E-310)
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        Le6:
            r3 = 33554432(0x2000000, double:1.6578092E-316)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf5
            r1 = 25
            int r0 = r11.G0(r0, r1)
            return r0
        Lf5:
            r3 = 3412884159725568(0xc200004000000, double:1.686188816556173E-308)
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L102:
            r3 = 8388608(0x800000, double:4.144523E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 23
            int r0 = r11.G0(r0, r1)
            return r0
        L111:
            r3 = 524288(0x80000, double:2.590327E-318)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L120
            r1 = 19
            int r0 = r11.G0(r0, r1)
            return r0
        L120:
            r3 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L12e
            r1 = 48
            int r0 = r11.G0(r0, r1)
            return r0
        L12e:
            r3 = 8590000128(0x200010000, double:4.244023961E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L13b:
            r3 = 4194304(0x400000, double:2.0722615E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L14a
            r1 = 22
            int r0 = r11.G0(r0, r1)
            return r0
        L14a:
            r3 = 32768(0x8000, double:1.61895E-319)
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L155:
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L164
            r1 = 20
            int r0 = r11.G0(r0, r1)
            return r0
        L164:
            r3 = 32
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L16e:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r7 = 258(0x102, double:1.275E-321)
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L178:
            r3 = 0
            r7 = 4
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L182:
            r3 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L190
            r1 = 56
            int r0 = r11.G0(r0, r1)
            return r0
        L190:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L19a:
            r3 = -9223372036854775808
            r7 = 32
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L1a4:
            r3 = 0
            r7 = 9
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L1ae:
            r3 = 36037610291855360(0x80080400000000, double:2.8536680881539355E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L1bb:
            r3 = 131072(0x20000, double:6.4758E-319)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1ca
            r1 = 17
            int r0 = r11.G0(r0, r1)
            return r0
        L1ca:
            r3 = 2097152(0x200000, double:1.036131E-317)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 21
            int r0 = r11.G0(r0, r1)
            return r0
        L1d9:
            r3 = 262144(0x40000, double:1.295163E-318)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1e8
            r1 = 18
            int r0 = r11.G0(r0, r1)
            return r0
        L1e8:
            r0 = 1
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.F0(r13, r14, r16)
            return r0
        L1f3:
            r3 = 448(0x1c0, double:2.213E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.Z(r1, r3, r5, r7)
            return r0
        L1fd:
            r3 = 1
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.K0(r13, r14, r16)
            return r0
    }

    private int W(long r13, long r15, long r17, long r19) {
            r12 = this;
            r9 = r12
            long r1 = r15 & r13
            long r5 = r19 & r17
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 1
            r0 = r12
            r2 = r13
            r4 = r17
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L17:
            r0 = 3
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1d6
            char r3 = r3.k()     // Catch: java.io.IOException -> L1d6
            r9.f1531f = r3     // Catch: java.io.IOException -> L1d6
            r4 = 65
            if (r3 == r4) goto L1c9
            r4 = 76
            r10 = 1
            if (r3 == r4) goto L1ab
            r4 = 95
            if (r3 == r4) goto L1a1
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L197
            r4 = 120(0x78, float:1.68E-43)
            if (r3 == r4) goto L18d
            r4 = 79
            if (r3 == r4) goto L183
            r4 = 80
            if (r3 == r4) goto L176
            r4 = 109(0x6d, float:1.53E-43)
            if (r3 == r4) goto L16c
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L162
            r4 = 117(0x75, float:1.64E-43)
            if (r3 == r4) goto L158
            r4 = 118(0x76, float:1.65E-43)
            if (r3 == r4) goto L14e
            switch(r3) {
                case 67: goto L141;
                case 68: goto L126;
                case 69: goto L10e;
                case 70: goto Lff;
                default: goto L50;
            }
        L50:
            switch(r3) {
                case 82: goto Le1;
                case 83: goto Ld4;
                case 84: goto La5;
                case 85: goto L98;
                case 86: goto L87;
                default: goto L53;
            }
        L53:
            switch(r3) {
                case 99: goto L7d;
                case 100: goto L66;
                case 101: goto L58;
                default: goto L56;
            }
        L56:
            goto L11b
        L58:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L11b
            r1 = 57
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L66:
            r3 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L73
            r3 = 73
            r9.l = r3
            r9.k = r0
        L73:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L7d:
            r3 = 0
            r7 = 64
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L87:
            r3 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L11b
            r1 = 43
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L98:
            r3 = 34359747072(0x800002200, double:1.6975970628E-313)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        La5:
            r3 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lb6
            r3 = 31
            r9.l = r3
            r9.k = r0
            goto Lc7
        Lb6:
            r3 = 17592186044416(0x100000000000, double:8.691694759794E-311)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lc7
            r1 = 44
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lc7:
            r3 = 4295023616(0x10000dc00, double:2.1220236167E-314)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        Ld4:
            r3 = 1128098930098176(0x4020000000000, double:5.573549264717746E-309)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        Le1:
            r3 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lf2
            r1 = 47
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lf2:
            r3 = 824633720832(0xc000000000, double:4.074231918653E-312)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        Lff:
            r3 = 65536(0x10000, double:3.2379E-319)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L11b
            r1 = 16
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L10e:
            r3 = 32
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L11b
            r1 = 5
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L11b:
            r0 = 2
            r13 = r12
            r14 = r0
            r15 = r1
            r17 = r5
            int r0 = r13.C0(r14, r15, r17)
            return r0
        L126:
            r3 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L137
            r1 = 45
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L137:
            r3 = 448(0x1c0, double:2.213E-321)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L141:
            r3 = 2251799880794112(0x8000004000000, double:1.112536962409785E-308)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L14e:
            r3 = 0
            r7 = 16
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L158:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L162:
            r3 = -9223372036854775808
            r7 = 288(0x120, double:1.423E-321)
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L16c:
            r3 = 0
            r7 = 2
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L176:
            r3 = 36028934457917440(0x80002000000000, double:2.848181455836816E-306)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L183:
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L18d:
            r3 = 0
            r7 = 8
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L197:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 1
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L1a1:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            r7 = 4
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L1ab:
            r3 = 8589934592(0x200000000, double:4.243991582E-314)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L1bc
            r1 = 33
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L1bc:
            r3 = 1185410973696(0x11400000000, double:5.856708383064E-312)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L1c9:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            r7 = 0
            r0 = r12
            int r0 = r0.a0(r1, r3, r5, r7)
            return r0
        L1d6:
            r3 = 2
            r13 = r12
            r14 = r3
            r15 = r1
            r17 = r5
            r13.H0(r14, r15, r17)
            return r0
    }

    private int X(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 1
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L17:
            r0 = 3
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1d5
            char r3 = r3.k()     // Catch: java.io.IOException -> L1d5
            r9.f1531f = r3     // Catch: java.io.IOException -> L1d5
            r4 = 65
            if (r3 == r4) goto L1c8
            r4 = 76
            if (r3 == r4) goto L1aa
            r4 = 95
            if (r3 == r4) goto L1a0
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L196
            r4 = 120(0x78, float:1.68E-43)
            if (r3 == r4) goto L18c
            r4 = 79
            if (r3 == r4) goto L182
            r4 = 80
            if (r3 == r4) goto L175
            r4 = 109(0x6d, float:1.53E-43)
            if (r3 == r4) goto L16b
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L161
            r4 = 117(0x75, float:1.64E-43)
            if (r3 == r4) goto L157
            r4 = 118(0x76, float:1.65E-43)
            if (r3 == r4) goto L14d
            switch(r3) {
                case 67: goto L140;
                case 68: goto L125;
                case 69: goto L10d;
                case 70: goto Lfe;
                default: goto L4f;
            }
        L4f:
            switch(r3) {
                case 82: goto Le0;
                case 83: goto Ld3;
                case 84: goto La4;
                case 85: goto L97;
                case 86: goto L86;
                default: goto L52;
            }
        L52:
            switch(r3) {
                case 99: goto L7c;
                case 100: goto L65;
                case 101: goto L57;
                default: goto L55;
            }
        L55:
            goto L11a
        L57:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 57
            int r0 = r11.G0(r0, r1)
            return r0
        L65:
            r3 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L72
            r3 = 73
            r9.l = r3
            r9.k = r0
        L72:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L7c:
            r3 = 0
            r7 = 64
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L86:
            r3 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 43
            int r0 = r11.G0(r0, r1)
            return r0
        L97:
            r3 = 34359747072(0x800002200, double:1.6975970628E-313)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        La4:
            r3 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lb5
            r3 = 31
            r9.l = r3
            r9.k = r0
            goto Lc6
        Lb5:
            r3 = 17592186044416(0x100000000000, double:8.691694759794E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lc6
            r1 = 44
            int r0 = r11.G0(r0, r1)
            return r0
        Lc6:
            r3 = 4295023616(0x10000dc00, double:2.1220236167E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        Ld3:
            r3 = 1128098930098176(0x4020000000000, double:5.573549264717746E-309)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        Le0:
            r3 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf1
            r1 = 47
            int r0 = r11.G0(r0, r1)
            return r0
        Lf1:
            r3 = 824633720832(0xc000000000, double:4.074231918653E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        Lfe:
            r3 = 65536(0x10000, double:3.2379E-319)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 16
            int r0 = r11.G0(r0, r1)
            return r0
        L10d:
            r3 = 32
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 5
            int r0 = r11.G0(r0, r1)
            return r0
        L11a:
            r0 = 2
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.D0(r13, r14, r16)
            return r0
        L125:
            r3 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L136
            r1 = 45
            int r0 = r11.G0(r0, r1)
            return r0
        L136:
            r3 = 448(0x1c0, double:2.213E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L140:
            r3 = 2251799880794112(0x8000004000000, double:1.112536962409785E-308)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L14d:
            r3 = 0
            r7 = 16
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L157:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L161:
            r3 = -9223372036854775808
            r7 = 288(0x120, double:1.423E-321)
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L16b:
            r3 = 0
            r7 = 2
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L175:
            r3 = 36028934457917440(0x80002000000000, double:2.848181455836816E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L182:
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L18c:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L196:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 1
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L1a0:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            r7 = 4
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L1aa:
            r3 = 8589934592(0x200000000, double:4.243991582E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1bb
            r1 = 33
            int r0 = r11.G0(r0, r1)
            return r0
        L1bb:
            r3 = 1185410973696(0x11400000000, double:5.856708383064E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L1c8:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.b0(r1, r3, r5, r7)
            return r0
        L1d5:
            r3 = 2
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.I0(r13, r14, r16)
            return r0
    }

    private int Y(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 1
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L17:
            r0 = 3
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1d5
            char r3 = r3.k()     // Catch: java.io.IOException -> L1d5
            r9.f1531f = r3     // Catch: java.io.IOException -> L1d5
            r4 = 65
            if (r3 == r4) goto L1c8
            r4 = 76
            if (r3 == r4) goto L1aa
            r4 = 95
            if (r3 == r4) goto L1a0
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L196
            r4 = 120(0x78, float:1.68E-43)
            if (r3 == r4) goto L18c
            r4 = 79
            if (r3 == r4) goto L182
            r4 = 80
            if (r3 == r4) goto L175
            r4 = 109(0x6d, float:1.53E-43)
            if (r3 == r4) goto L16b
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L161
            r4 = 117(0x75, float:1.64E-43)
            if (r3 == r4) goto L157
            r4 = 118(0x76, float:1.65E-43)
            if (r3 == r4) goto L14d
            switch(r3) {
                case 67: goto L140;
                case 68: goto L125;
                case 69: goto L10d;
                case 70: goto Lfe;
                default: goto L4f;
            }
        L4f:
            switch(r3) {
                case 82: goto Le0;
                case 83: goto Ld3;
                case 84: goto La4;
                case 85: goto L97;
                case 86: goto L86;
                default: goto L52;
            }
        L52:
            switch(r3) {
                case 99: goto L7c;
                case 100: goto L65;
                case 101: goto L57;
                default: goto L55;
            }
        L55:
            goto L11a
        L57:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 57
            int r0 = r11.G0(r0, r1)
            return r0
        L65:
            r3 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L72
            r3 = 73
            r9.l = r3
            r9.k = r0
        L72:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L7c:
            r3 = 0
            r7 = 64
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L86:
            r3 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 43
            int r0 = r11.G0(r0, r1)
            return r0
        L97:
            r3 = 34359747072(0x800002200, double:1.6975970628E-313)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        La4:
            r3 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lb5
            r3 = 31
            r9.l = r3
            r9.k = r0
            goto Lc6
        Lb5:
            r3 = 17592186044416(0x100000000000, double:8.691694759794E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lc6
            r1 = 44
            int r0 = r11.G0(r0, r1)
            return r0
        Lc6:
            r3 = 4295023616(0x10000dc00, double:2.1220236167E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        Ld3:
            r3 = 1128098930098176(0x4020000000000, double:5.573549264717746E-309)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        Le0:
            r3 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf1
            r1 = 47
            int r0 = r11.G0(r0, r1)
            return r0
        Lf1:
            r3 = 824633720832(0xc000000000, double:4.074231918653E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        Lfe:
            r3 = 65536(0x10000, double:3.2379E-319)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 16
            int r0 = r11.G0(r0, r1)
            return r0
        L10d:
            r3 = 32
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 5
            int r0 = r11.G0(r0, r1)
            return r0
        L11a:
            r0 = 2
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.E0(r13, r14, r16)
            return r0
        L125:
            r3 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L136
            r1 = 45
            int r0 = r11.G0(r0, r1)
            return r0
        L136:
            r3 = 448(0x1c0, double:2.213E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L140:
            r3 = 2251799880794112(0x8000004000000, double:1.112536962409785E-308)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L14d:
            r3 = 0
            r7 = 16
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L157:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L161:
            r3 = -9223372036854775808
            r7 = 288(0x120, double:1.423E-321)
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L16b:
            r3 = 0
            r7 = 2
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L175:
            r3 = 36028934457917440(0x80002000000000, double:2.848181455836816E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L182:
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L18c:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L196:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 1
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L1a0:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            r7 = 4
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L1aa:
            r3 = 8589934592(0x200000000, double:4.243991582E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1bb
            r1 = 33
            int r0 = r11.G0(r0, r1)
            return r0
        L1bb:
            r3 = 1185410973696(0x11400000000, double:5.856708383064E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L1c8:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.c0(r1, r3, r5, r7)
            return r0
        L1d5:
            r3 = 2
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.J0(r13, r14, r16)
            return r0
    }

    private int Z(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 1
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L17:
            r0 = 3
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1d5
            char r3 = r3.k()     // Catch: java.io.IOException -> L1d5
            r9.f1531f = r3     // Catch: java.io.IOException -> L1d5
            r4 = 65
            if (r3 == r4) goto L1c8
            r4 = 76
            if (r3 == r4) goto L1aa
            r4 = 95
            if (r3 == r4) goto L1a0
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L196
            r4 = 120(0x78, float:1.68E-43)
            if (r3 == r4) goto L18c
            r4 = 79
            if (r3 == r4) goto L182
            r4 = 80
            if (r3 == r4) goto L175
            r4 = 109(0x6d, float:1.53E-43)
            if (r3 == r4) goto L16b
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L161
            r4 = 117(0x75, float:1.64E-43)
            if (r3 == r4) goto L157
            r4 = 118(0x76, float:1.65E-43)
            if (r3 == r4) goto L14d
            switch(r3) {
                case 67: goto L140;
                case 68: goto L125;
                case 69: goto L10d;
                case 70: goto Lfe;
                default: goto L4f;
            }
        L4f:
            switch(r3) {
                case 82: goto Le0;
                case 83: goto Ld3;
                case 84: goto La4;
                case 85: goto L97;
                case 86: goto L86;
                default: goto L52;
            }
        L52:
            switch(r3) {
                case 99: goto L7c;
                case 100: goto L65;
                case 101: goto L57;
                default: goto L55;
            }
        L55:
            goto L11a
        L57:
            r3 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 57
            int r0 = r11.G0(r0, r1)
            return r0
        L65:
            r3 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L72
            r3 = 73
            r9.l = r3
            r9.k = r0
        L72:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L7c:
            r3 = 0
            r7 = 64
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L86:
            r3 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 43
            int r0 = r11.G0(r0, r1)
            return r0
        L97:
            r3 = 34359747072(0x800002200, double:1.6975970628E-313)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        La4:
            r3 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lb5
            r3 = 31
            r9.l = r3
            r9.k = r0
            goto Lc6
        Lb5:
            r3 = 17592186044416(0x100000000000, double:8.691694759794E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lc6
            r1 = 44
            int r0 = r11.G0(r0, r1)
            return r0
        Lc6:
            r3 = 4295023616(0x10000dc00, double:2.1220236167E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        Ld3:
            r3 = 1128098930098176(0x4020000000000, double:5.573549264717746E-309)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        Le0:
            r3 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf1
            r1 = 47
            int r0 = r11.G0(r0, r1)
            return r0
        Lf1:
            r3 = 824633720832(0xc000000000, double:4.074231918653E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        Lfe:
            r3 = 65536(0x10000, double:3.2379E-319)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 16
            int r0 = r11.G0(r0, r1)
            return r0
        L10d:
            r3 = 32
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11a
            r1 = 5
            int r0 = r11.G0(r0, r1)
            return r0
        L11a:
            r0 = 2
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.F0(r13, r14, r16)
            return r0
        L125:
            r3 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L136
            r1 = 45
            int r0 = r11.G0(r0, r1)
            return r0
        L136:
            r3 = 448(0x1c0, double:2.213E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L140:
            r3 = 2251799880794112(0x8000004000000, double:1.112536962409785E-308)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L14d:
            r3 = 0
            r7 = 16
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L157:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L161:
            r3 = -9223372036854775808
            r7 = 288(0x120, double:1.423E-321)
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L16b:
            r3 = 0
            r7 = 2
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L175:
            r3 = 36028934457917440(0x80002000000000, double:2.848181455836816E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L182:
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L18c:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L196:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r7 = 1
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L1a0:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            r7 = 4
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L1aa:
            r3 = 8589934592(0x200000000, double:4.243991582E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1bb
            r1 = 33
            int r0 = r11.G0(r0, r1)
            return r0
        L1bb:
            r3 = 1185410973696(0x11400000000, double:5.856708383064E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L1c8:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.d0(r1, r3, r5, r7)
            return r0
        L1d5:
            r3 = 2
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.K0(r13, r14, r16)
            return r0
    }

    private void a() {
            r3 = this;
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r3.j = r0
            r0 = 52
        L7:
            int r1 = r0 + (-1)
            if (r0 <= 0) goto L13
            int[] r0 = r3.f1529d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0[r1] = r2
            r0 = r1
            goto L7
        L13:
            return
    }

    private int a0(long r13, long r15, long r17, long r19) {
            r12 = this;
            r9 = r12
            long r1 = r15 & r13
            long r5 = r19 & r17
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 2
            r0 = r12
            r2 = r13
            r4 = r17
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L17:
            r0 = 4
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1ae
            char r3 = r3.k()     // Catch: java.io.IOException -> L1ae
            r9.f1531f = r3     // Catch: java.io.IOException -> L1ae
            r4 = 32
            if (r3 == r4) goto L1a4
            r4 = 73
            if (r3 == r4) goto L197
            r4 = 91
            if (r3 == r4) goto L170
            r4 = 95
            if (r3 == r4) goto L166
            r4 = 97
            if (r3 == r4) goto L15c
            r4 = 99
            if (r3 == r4) goto L14e
            r4 = 101(0x65, float:1.42E-43)
            r10 = 1
            if (r3 == r4) goto L129
            r4 = 112(0x70, float:1.57E-43)
            if (r3 == r4) goto L11f
            r4 = 118(0x76, float:1.65E-43)
            if (r3 == r4) goto L115
            r4 = 75
            if (r3 == r4) goto L108
            r4 = 76
            if (r3 == r4) goto Lfb
            switch(r3) {
                case 65: goto Lf0;
                case 66: goto Le6;
                case 67: goto Ld9;
                default: goto L50;
            }
        L50:
            switch(r3) {
                case 78: goto Lcf;
                case 79: goto Lc2;
                case 80: goto Lb8;
                default: goto L53;
            }
        L53:
            switch(r3) {
                case 82: goto Lab;
                case 83: goto L9e;
                case 84: goto L86;
                case 85: goto L79;
                default: goto L56;
            }
        L56:
            switch(r3) {
                case 114: goto L6f;
                case 115: goto L65;
                case 116: goto L5b;
                default: goto L59;
            }
        L59:
            goto L18c
        L5b:
            r3 = 0
            r7 = 1
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L65:
            r3 = 0
            r7 = 8
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L6f:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L79:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L86:
            r3 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L94
            r1 = 50
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L94:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L9e:
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        Lab:
            r3 = 4569845202944(0x42800000000, double:2.257803521587E-311)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        Lb8:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        Lc2:
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        Lcf:
            r3 = 256(0x100, double:1.265E-321)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        Ld9:
            r3 = 292057776128(0x4400000000, double:1.442957137856E-312)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        Le6:
            r3 = 128(0x80, double:6.3E-322)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        Lf0:
            r3 = 67165184(0x400dc00, double:3.318401E-316)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        Lfb:
            r3 = 549755813888(0x8000000000, double:2.716154612436E-312)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L108:
            r3 = 64
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L18c
            r1 = 6
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L115:
            r3 = 0
            r7 = 4
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L11f:
            r3 = 0
            r7 = 2
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L129:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L137
            r1 = 58
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L137:
            r3 = 32
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L144
            r3 = 69
            r9.l = r3
            r9.k = r0
        L144:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L14e:
            r3 = 256(0x100, double:1.265E-321)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18c
            r1 = 72
            int r0 = r12.G0(r0, r1)
            return r0
        L15c:
            r3 = 0
            r7 = 80
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L166:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L170:
            r3 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L17e
            r1 = 51
            int r0 = r12.G0(r0, r1)
            return r0
        L17e:
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18c
            r1 = 52
            int r0 = r12.G0(r0, r1)
            return r0
        L18c:
            r0 = 3
            r13 = r12
            r14 = r0
            r15 = r1
            r17 = r5
            int r0 = r13.C0(r14, r15, r17)
            return r0
        L197:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r7 = 0
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L1a4:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r12
            int r0 = r0.e0(r1, r3, r5, r7)
            return r0
        L1ae:
            r3 = 3
            r13 = r12
            r14 = r3
            r15 = r1
            r17 = r5
            r13.H0(r14, r15, r17)
            return r0
    }

    private int b0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 2
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L17:
            r0 = 4
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1ad
            char r3 = r3.k()     // Catch: java.io.IOException -> L1ad
            r9.f1531f = r3     // Catch: java.io.IOException -> L1ad
            r4 = 32
            if (r3 == r4) goto L1a3
            r4 = 73
            if (r3 == r4) goto L196
            r4 = 91
            if (r3 == r4) goto L16f
            r4 = 95
            if (r3 == r4) goto L165
            r4 = 97
            if (r3 == r4) goto L15b
            r4 = 99
            if (r3 == r4) goto L14d
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L128
            r4 = 112(0x70, float:1.57E-43)
            if (r3 == r4) goto L11e
            r4 = 118(0x76, float:1.65E-43)
            if (r3 == r4) goto L114
            r4 = 75
            if (r3 == r4) goto L107
            r4 = 76
            if (r3 == r4) goto Lfa
            switch(r3) {
                case 65: goto Lef;
                case 66: goto Le5;
                case 67: goto Ld8;
                default: goto L4f;
            }
        L4f:
            switch(r3) {
                case 78: goto Lce;
                case 79: goto Lc1;
                case 80: goto Lb7;
                default: goto L52;
            }
        L52:
            switch(r3) {
                case 82: goto Laa;
                case 83: goto L9d;
                case 84: goto L85;
                case 85: goto L78;
                default: goto L55;
            }
        L55:
            switch(r3) {
                case 114: goto L6e;
                case 115: goto L64;
                case 116: goto L5a;
                default: goto L58;
            }
        L58:
            goto L18b
        L5a:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L64:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L6e:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L78:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L85:
            r3 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L93
            r1 = 50
            int r0 = r11.G0(r0, r1)
            return r0
        L93:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L9d:
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        Laa:
            r3 = 4569845202944(0x42800000000, double:2.257803521587E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        Lb7:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        Lc1:
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        Lce:
            r3 = 256(0x100, double:1.265E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        Ld8:
            r3 = 292057776128(0x4400000000, double:1.442957137856E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        Le5:
            r3 = 128(0x80, double:6.3E-322)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        Lef:
            r3 = 67165184(0x400dc00, double:3.318401E-316)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        Lfa:
            r3 = 549755813888(0x8000000000, double:2.716154612436E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L107:
            r3 = 64
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18b
            r1 = 6
            int r0 = r11.G0(r0, r1)
            return r0
        L114:
            r3 = 0
            r7 = 4
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L11e:
            r3 = 0
            r7 = 2
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L128:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L136
            r1 = 58
            int r0 = r11.G0(r0, r1)
            return r0
        L136:
            r3 = 32
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L143
            r3 = 69
            r9.l = r3
            r9.k = r0
        L143:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L14d:
            r3 = 256(0x100, double:1.265E-321)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18b
            r1 = 72
            int r0 = r11.G0(r0, r1)
            return r0
        L15b:
            r3 = 0
            r7 = 80
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L165:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L16f:
            r3 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L17d
            r1 = 51
            int r0 = r11.G0(r0, r1)
            return r0
        L17d:
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18b
            r1 = 52
            int r0 = r11.G0(r0, r1)
            return r0
        L18b:
            r0 = 3
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.D0(r13, r14, r16)
            return r0
        L196:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L1a3:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.f0(r1, r3, r5, r7)
            return r0
        L1ad:
            r3 = 3
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.I0(r13, r14, r16)
            return r0
    }

    private void c(int r4, int r5) {
            r3 = this;
        L0:
            int[] r0 = r3.f1530e
            int r1 = r3.i
            int r2 = r1 + 1
            r3.i = r2
            int[] r2 = e.c.o
            r2 = r2[r4]
            r0[r1] = r2
            int r0 = r4 + 1
            if (r4 != r5) goto L13
            return
        L13:
            r4 = r0
            goto L0
    }

    private int c0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 2
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L17:
            r0 = 4
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1ad
            char r3 = r3.k()     // Catch: java.io.IOException -> L1ad
            r9.f1531f = r3     // Catch: java.io.IOException -> L1ad
            r4 = 32
            if (r3 == r4) goto L1a3
            r4 = 73
            if (r3 == r4) goto L196
            r4 = 91
            if (r3 == r4) goto L16f
            r4 = 95
            if (r3 == r4) goto L165
            r4 = 97
            if (r3 == r4) goto L15b
            r4 = 99
            if (r3 == r4) goto L14d
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L128
            r4 = 112(0x70, float:1.57E-43)
            if (r3 == r4) goto L11e
            r4 = 118(0x76, float:1.65E-43)
            if (r3 == r4) goto L114
            r4 = 75
            if (r3 == r4) goto L107
            r4 = 76
            if (r3 == r4) goto Lfa
            switch(r3) {
                case 65: goto Lef;
                case 66: goto Le5;
                case 67: goto Ld8;
                default: goto L4f;
            }
        L4f:
            switch(r3) {
                case 78: goto Lce;
                case 79: goto Lc1;
                case 80: goto Lb7;
                default: goto L52;
            }
        L52:
            switch(r3) {
                case 82: goto Laa;
                case 83: goto L9d;
                case 84: goto L85;
                case 85: goto L78;
                default: goto L55;
            }
        L55:
            switch(r3) {
                case 114: goto L6e;
                case 115: goto L64;
                case 116: goto L5a;
                default: goto L58;
            }
        L58:
            goto L18b
        L5a:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L64:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L6e:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L78:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L85:
            r3 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L93
            r1 = 50
            int r0 = r11.G0(r0, r1)
            return r0
        L93:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L9d:
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        Laa:
            r3 = 4569845202944(0x42800000000, double:2.257803521587E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        Lb7:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        Lc1:
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        Lce:
            r3 = 256(0x100, double:1.265E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        Ld8:
            r3 = 292057776128(0x4400000000, double:1.442957137856E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        Le5:
            r3 = 128(0x80, double:6.3E-322)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        Lef:
            r3 = 67165184(0x400dc00, double:3.318401E-316)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        Lfa:
            r3 = 549755813888(0x8000000000, double:2.716154612436E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L107:
            r3 = 64
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18b
            r1 = 6
            int r0 = r11.G0(r0, r1)
            return r0
        L114:
            r3 = 0
            r7 = 4
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L11e:
            r3 = 0
            r7 = 2
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L128:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L136
            r1 = 58
            int r0 = r11.G0(r0, r1)
            return r0
        L136:
            r3 = 32
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L143
            r3 = 69
            r9.l = r3
            r9.k = r0
        L143:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L14d:
            r3 = 256(0x100, double:1.265E-321)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18b
            r1 = 72
            int r0 = r11.G0(r0, r1)
            return r0
        L15b:
            r3 = 0
            r7 = 80
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L165:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L16f:
            r3 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L17d
            r1 = 51
            int r0 = r11.G0(r0, r1)
            return r0
        L17d:
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18b
            r1 = 52
            int r0 = r11.G0(r0, r1)
            return r0
        L18b:
            r0 = 3
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.E0(r13, r14, r16)
            return r0
        L196:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L1a3:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.g0(r1, r3, r5, r7)
            return r0
        L1ad:
            r3 = 3
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.J0(r13, r14, r16)
            return r0
    }

    private static final boolean d(int r4, int r5, int r6, long r7, long r9) {
            r0 = 0
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L12
            long[] r4 = e.c.m
            r5 = r4[r5]
            long r4 = r5 & r7
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L11
            return r1
        L11:
            return r0
        L12:
            long[] r4 = e.c.n
            r5 = r4[r6]
            long r4 = r5 & r9
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L1d
            r0 = 1
        L1d:
            return r0
    }

    private int d0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 2
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L17:
            r0 = 4
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L1ad
            char r3 = r3.k()     // Catch: java.io.IOException -> L1ad
            r9.f1531f = r3     // Catch: java.io.IOException -> L1ad
            r4 = 32
            if (r3 == r4) goto L1a3
            r4 = 73
            if (r3 == r4) goto L196
            r4 = 91
            if (r3 == r4) goto L16f
            r4 = 95
            if (r3 == r4) goto L165
            r4 = 97
            if (r3 == r4) goto L15b
            r4 = 99
            if (r3 == r4) goto L14d
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L128
            r4 = 112(0x70, float:1.57E-43)
            if (r3 == r4) goto L11e
            r4 = 118(0x76, float:1.65E-43)
            if (r3 == r4) goto L114
            r4 = 75
            if (r3 == r4) goto L107
            r4 = 76
            if (r3 == r4) goto Lfa
            switch(r3) {
                case 65: goto Lef;
                case 66: goto Le5;
                case 67: goto Ld8;
                default: goto L4f;
            }
        L4f:
            switch(r3) {
                case 78: goto Lce;
                case 79: goto Lc1;
                case 80: goto Lb7;
                default: goto L52;
            }
        L52:
            switch(r3) {
                case 82: goto Laa;
                case 83: goto L9d;
                case 84: goto L85;
                case 85: goto L78;
                default: goto L55;
            }
        L55:
            switch(r3) {
                case 114: goto L6e;
                case 115: goto L64;
                case 116: goto L5a;
                default: goto L58;
            }
        L58:
            goto L18b
        L5a:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L64:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L6e:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L78:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L85:
            r3 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L93
            r1 = 50
            int r0 = r11.G0(r0, r1)
            return r0
        L93:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L9d:
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        Laa:
            r3 = 4569845202944(0x42800000000, double:2.257803521587E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        Lb7:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        Lc1:
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        Lce:
            r3 = 256(0x100, double:1.265E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        Ld8:
            r3 = 292057776128(0x4400000000, double:1.442957137856E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        Le5:
            r3 = 128(0x80, double:6.3E-322)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        Lef:
            r3 = 67165184(0x400dc00, double:3.318401E-316)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        Lfa:
            r3 = 549755813888(0x8000000000, double:2.716154612436E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L107:
            r3 = 64
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18b
            r1 = 6
            int r0 = r11.G0(r0, r1)
            return r0
        L114:
            r3 = 0
            r7 = 4
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L11e:
            r3 = 0
            r7 = 2
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L128:
            r3 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L136
            r1 = 58
            int r0 = r11.G0(r0, r1)
            return r0
        L136:
            r3 = 32
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L143
            r3 = 69
            r9.l = r3
            r9.k = r0
        L143:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L14d:
            r3 = 256(0x100, double:1.265E-321)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18b
            r1 = 72
            int r0 = r11.G0(r0, r1)
            return r0
        L15b:
            r3 = 0
            r7 = 80
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L165:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L16f:
            r3 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L17d
            r1 = 51
            int r0 = r11.G0(r0, r1)
            return r0
        L17d:
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L18b
            r1 = 52
            int r0 = r11.G0(r0, r1)
            return r0
        L18b:
            r0 = 3
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.F0(r13, r14, r16)
            return r0
        L196:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L1a3:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.h0(r1, r3, r5, r7)
            return r0
        L1ad:
            r3 = 3
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.K0(r13, r14, r16)
            return r0
    }

    private void e(int r6) {
            r5 = this;
            int[] r0 = r5.f1529d
            r1 = r0[r6]
            int r2 = r5.j
            if (r1 == r2) goto L14
            int[] r1 = r5.f1530e
            int r3 = r5.i
            int r4 = r3 + 1
            r5.i = r4
            r1[r3] = r6
            r0[r6] = r2
        L14:
            return
    }

    private int e0(long r13, long r15, long r17, long r19) {
            r12 = this;
            r9 = r12
            long r1 = r15 & r13
            long r5 = r19 & r17
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 3
            r0 = r12
            r2 = r13
            r4 = r17
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L17:
            r0 = 5
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L14e
            char r3 = r3.k()     // Catch: java.io.IOException -> L14e
            r9.f1531f = r3     // Catch: java.io.IOException -> L14e
            r4 = 65
            if (r3 == r4) goto L141
            r4 = 66
            if (r3 == r4) goto L136
            r4 = 69
            if (r3 == r4) goto L129
            r4 = 71
            r10 = 1
            if (r3 == r4) goto L10d
            r4 = 73
            if (r3 == r4) goto L103
            r4 = 86
            if (r3 == r4) goto Lf9
            r4 = 97
            if (r3 == r4) goto Lef
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto Lc9
            r4 = 116(0x74, float:1.63E-43)
            if (r3 == r4) goto Lbf
            r4 = 78
            if (r3 == r4) goto La4
            r4 = 79
            if (r3 == r4) goto L97
            r4 = 99
            if (r3 == r4) goto L8d
            r4 = 100
            if (r3 == r4) goto L83
            switch(r3) {
                case 82: goto L76;
                case 83: goto L69;
                case 84: goto L5a;
                default: goto L58;
            }
        L58:
            goto L11e
        L5a:
            r3 = 67108864(0x4000000, double:3.3156184E-316)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L11e
            r1 = 26
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L69:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        L76:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        L83:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        L8d:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        L97:
            r3 = 18015016984772736(0x40009000000080, double:1.780303540720931E-307)
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        La4:
            r3 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lb5
            r1 = 35
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lb5:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        Lbf:
            r3 = 0
            r7 = 8
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        Lc9:
            r3 = 16
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Ld7
            r1 = 68
            int r0 = r12.G0(r0, r1)
            return r0
        Ld7:
            r3 = 64
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Le5
            r1 = 70
            int r0 = r12.G0(r0, r1)
            return r0
        Le5:
            r3 = 0
            r7 = 129(0x81, double:6.37E-322)
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        Lef:
            r3 = 0
            r7 = 6
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        Lf9:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        L103:
            r3 = 256(0x100, double:1.265E-321)
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        L10d:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L11e
            r1 = 42
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L11e:
            r0 = 4
            r13 = r12
            r14 = r0
            r15 = r1
            r17 = r5
            int r0 = r13.C0(r14, r15, r17)
            return r0
        L129:
            r3 = 141733920768(0x2100000000, double:7.0025861102E-313)
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        L136:
            r3 = 56320(0xdc00, double:2.7826E-319)
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        L141:
            r3 = 292057776128(0x4400000000, double:1.442957137856E-312)
            r7 = 0
            r0 = r12
            int r0 = r0.i0(r1, r3, r5, r7)
            return r0
        L14e:
            r3 = 4
            r13 = r12
            r14 = r3
            r15 = r1
            r17 = r5
            r13.H0(r14, r15, r17)
            return r0
    }

    private void f(int r2, int r3) {
            r1 = this;
        L0:
            int[] r0 = e.c.o
            r0 = r0[r2]
            r1.e(r0)
            int r0 = r2 + 1
            if (r2 != r3) goto Lc
            return
        Lc:
            r2 = r0
            goto L0
    }

    private int f0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 3
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L17:
            r0 = 5
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L14d
            char r3 = r3.k()     // Catch: java.io.IOException -> L14d
            r9.f1531f = r3     // Catch: java.io.IOException -> L14d
            r4 = 65
            if (r3 == r4) goto L140
            r4 = 66
            if (r3 == r4) goto L135
            r4 = 69
            if (r3 == r4) goto L128
            r4 = 71
            if (r3 == r4) goto L10c
            r4 = 73
            if (r3 == r4) goto L102
            r4 = 86
            if (r3 == r4) goto Lf8
            r4 = 97
            if (r3 == r4) goto Lee
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto Lc8
            r4 = 116(0x74, float:1.63E-43)
            if (r3 == r4) goto Lbe
            r4 = 78
            if (r3 == r4) goto La3
            r4 = 79
            if (r3 == r4) goto L96
            r4 = 99
            if (r3 == r4) goto L8c
            r4 = 100
            if (r3 == r4) goto L82
            switch(r3) {
                case 82: goto L75;
                case 83: goto L68;
                case 84: goto L59;
                default: goto L57;
            }
        L57:
            goto L11d
        L59:
            r3 = 67108864(0x4000000, double:3.3156184E-316)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11d
            r1 = 26
            int r0 = r11.G0(r0, r1)
            return r0
        L68:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        L75:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        L82:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        L8c:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        L96:
            r3 = 18015016984772736(0x40009000000080, double:1.780303540720931E-307)
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        La3:
            r3 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lb4
            r1 = 35
            int r0 = r11.G0(r0, r1)
            return r0
        Lb4:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        Lbe:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        Lc8:
            r3 = 16
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Ld6
            r1 = 68
            int r0 = r11.G0(r0, r1)
            return r0
        Ld6:
            r3 = 64
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Le4
            r1 = 70
            int r0 = r11.G0(r0, r1)
            return r0
        Le4:
            r3 = 0
            r7 = 129(0x81, double:6.37E-322)
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        Lee:
            r3 = 0
            r7 = 6
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        Lf8:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        L102:
            r3 = 256(0x100, double:1.265E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        L10c:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11d
            r1 = 42
            int r0 = r11.G0(r0, r1)
            return r0
        L11d:
            r0 = 4
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.D0(r13, r14, r16)
            return r0
        L128:
            r3 = 141733920768(0x2100000000, double:7.0025861102E-313)
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        L135:
            r3 = 56320(0xdc00, double:2.7826E-319)
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        L140:
            r3 = 292057776128(0x4400000000, double:1.442957137856E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.j0(r1, r3, r5, r7)
            return r0
        L14d:
            r3 = 4
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.I0(r13, r14, r16)
            return r0
    }

    private void g(int r1, int r2) {
            r0 = this;
            r0.e(r1)
            r0.e(r2)
            return
    }

    private int g0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 3
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L17:
            r0 = 5
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L14d
            char r3 = r3.k()     // Catch: java.io.IOException -> L14d
            r9.f1531f = r3     // Catch: java.io.IOException -> L14d
            r4 = 65
            if (r3 == r4) goto L140
            r4 = 66
            if (r3 == r4) goto L135
            r4 = 69
            if (r3 == r4) goto L128
            r4 = 71
            if (r3 == r4) goto L10c
            r4 = 73
            if (r3 == r4) goto L102
            r4 = 86
            if (r3 == r4) goto Lf8
            r4 = 97
            if (r3 == r4) goto Lee
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto Lc8
            r4 = 116(0x74, float:1.63E-43)
            if (r3 == r4) goto Lbe
            r4 = 78
            if (r3 == r4) goto La3
            r4 = 79
            if (r3 == r4) goto L96
            r4 = 99
            if (r3 == r4) goto L8c
            r4 = 100
            if (r3 == r4) goto L82
            switch(r3) {
                case 82: goto L75;
                case 83: goto L68;
                case 84: goto L59;
                default: goto L57;
            }
        L57:
            goto L11d
        L59:
            r3 = 67108864(0x4000000, double:3.3156184E-316)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11d
            r1 = 26
            int r0 = r11.G0(r0, r1)
            return r0
        L68:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        L75:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        L82:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        L8c:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        L96:
            r3 = 18015016984772736(0x40009000000080, double:1.780303540720931E-307)
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        La3:
            r3 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lb4
            r1 = 35
            int r0 = r11.G0(r0, r1)
            return r0
        Lb4:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        Lbe:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        Lc8:
            r3 = 16
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Ld6
            r1 = 68
            int r0 = r11.G0(r0, r1)
            return r0
        Ld6:
            r3 = 64
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Le4
            r1 = 70
            int r0 = r11.G0(r0, r1)
            return r0
        Le4:
            r3 = 0
            r7 = 129(0x81, double:6.37E-322)
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        Lee:
            r3 = 0
            r7 = 6
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        Lf8:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        L102:
            r3 = 256(0x100, double:1.265E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        L10c:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11d
            r1 = 42
            int r0 = r11.G0(r0, r1)
            return r0
        L11d:
            r0 = 4
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.E0(r13, r14, r16)
            return r0
        L128:
            r3 = 141733920768(0x2100000000, double:7.0025861102E-313)
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        L135:
            r3 = 56320(0xdc00, double:2.7826E-319)
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        L140:
            r3 = 292057776128(0x4400000000, double:1.442957137856E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.k0(r1, r3, r5, r7)
            return r0
        L14d:
            r3 = 4
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.J0(r13, r14, r16)
            return r0
    }

    private int h0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 3
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L17:
            r0 = 5
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L14d
            char r3 = r3.k()     // Catch: java.io.IOException -> L14d
            r9.f1531f = r3     // Catch: java.io.IOException -> L14d
            r4 = 65
            if (r3 == r4) goto L140
            r4 = 66
            if (r3 == r4) goto L135
            r4 = 69
            if (r3 == r4) goto L128
            r4 = 71
            if (r3 == r4) goto L10c
            r4 = 73
            if (r3 == r4) goto L102
            r4 = 86
            if (r3 == r4) goto Lf8
            r4 = 97
            if (r3 == r4) goto Lee
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto Lc8
            r4 = 116(0x74, float:1.63E-43)
            if (r3 == r4) goto Lbe
            r4 = 78
            if (r3 == r4) goto La3
            r4 = 79
            if (r3 == r4) goto L96
            r4 = 99
            if (r3 == r4) goto L8c
            r4 = 100
            if (r3 == r4) goto L82
            switch(r3) {
                case 82: goto L75;
                case 83: goto L68;
                case 84: goto L59;
                default: goto L57;
            }
        L57:
            goto L11d
        L59:
            r3 = 67108864(0x4000000, double:3.3156184E-316)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11d
            r1 = 26
            int r0 = r11.G0(r0, r1)
            return r0
        L68:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        L75:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        L82:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        L8c:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        L96:
            r3 = 18015016984772736(0x40009000000080, double:1.780303540720931E-307)
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        La3:
            r3 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lb4
            r1 = 35
            int r0 = r11.G0(r0, r1)
            return r0
        Lb4:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        Lbe:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        Lc8:
            r3 = 16
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Ld6
            r1 = 68
            int r0 = r11.G0(r0, r1)
            return r0
        Ld6:
            r3 = 64
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Le4
            r1 = 70
            int r0 = r11.G0(r0, r1)
            return r0
        Le4:
            r3 = 0
            r7 = 129(0x81, double:6.37E-322)
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        Lee:
            r3 = 0
            r7 = 6
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        Lf8:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        L102:
            r3 = 256(0x100, double:1.265E-321)
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        L10c:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L11d
            r1 = 42
            int r0 = r11.G0(r0, r1)
            return r0
        L11d:
            r0 = 4
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.F0(r13, r14, r16)
            return r0
        L128:
            r3 = 141733920768(0x2100000000, double:7.0025861102E-313)
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        L135:
            r3 = 56320(0xdc00, double:2.7826E-319)
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        L140:
            r3 = 292057776128(0x4400000000, double:1.442957137856E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.l0(r1, r3, r5, r7)
            return r0
        L14d:
            r3 = 4
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.K0(r13, r14, r16)
            return r0
    }

    private int i(int r32, int r33) {
            r31 = this;
            r0 = r31
            r1 = 52
            r0.i = r1
            int[] r1 = r0.f1530e
            r2 = 0
            r1[r2] = r32
            r1 = 0
            r2 = 1
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = r33
            r4 = 0
            r5 = 1
            r6 = 2147483647(0x7fffffff, float:NaN)
        L17:
            int r7 = r0.j
            int r7 = r7 + r2
            r0.j = r7
            if (r7 != r3) goto L21
            r31.a()
        L21:
            char r7 = r0.f1531f
            r8 = 64
            r10 = 1
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 121(0x79, float:1.7E-43)
            r9 = 48
            r2 = 4
            r18 = 0
            if (r7 >= r8) goto L380
            long r20 = r10 << r7
        L34:
            int[] r7 = r0.f1530e
            int r5 = r5 + (-1)
            r8 = r7[r5]
            r10 = 81
            r11 = 46
            r22 = 4294971904(0x100001200, double:2.1219980676E-314)
            r15 = 79
            r3 = 59
            r14 = 84
            r24 = 287948901175001088(0x3ff000000000000, double:1.988135013128901E-289)
            switch(r8) {
                case 0: goto L2e3;
                case 1: goto L2ca;
                case 2: goto L2bb;
                case 3: goto L2af;
                case 4: goto L2aa;
                case 5: goto L29d;
                case 6: goto L289;
                case 7: goto L278;
                case 8: goto L266;
                case 9: goto L4e;
                case 10: goto L24c;
                case 11: goto L4e;
                case 12: goto L232;
                case 13: goto L4e;
                case 14: goto L218;
                case 15: goto L208;
                case 16: goto L4e;
                case 17: goto L1ee;
                case 18: goto L1e3;
                case 19: goto L4e;
                case 20: goto L1da;
                case 21: goto L1cf;
                case 22: goto L1c6;
                case 23: goto L1ba;
                case 24: goto L4e;
                case 25: goto L1b4;
                case 26: goto L1a9;
                case 27: goto L19d;
                case 28: goto L18e;
                case 29: goto L186;
                case 30: goto L174;
                case 31: goto L4e;
                case 32: goto L168;
                case 33: goto L158;
                case 34: goto L146;
                case 35: goto L13b;
                case 36: goto L132;
                case 37: goto L121;
                case 38: goto L4e;
                case 39: goto L115;
                case 40: goto L105;
                case 41: goto Lf0;
                case 42: goto L4e;
                case 43: goto Le4;
                case 44: goto Ld5;
                case 45: goto Lca;
                case 46: goto Lc3;
                case 47: goto Lba;
                case 48: goto Lad;
                case 49: goto L9f;
                case 50: goto L8a;
                case 51: goto L77;
                case 52: goto L50;
                default: goto L4e;
            }
        L4e:
            goto L379
        L50:
            long r7 = r20 & r22
            int r10 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r10 == 0) goto L5b
            r7 = 3
            r0.g(r7, r2)
            goto L62
        L5b:
            char r7 = r0.f1531f
            if (r7 != r3) goto L62
            r0.f(r13, r12)
        L62:
            if (r10 == 0) goto L6b
        L64:
            r3 = 47
            r0.g(r11, r3)
            goto L379
        L6b:
            char r7 = r0.f1531f
            if (r7 != r3) goto L379
            if (r6 <= r2) goto L72
        L71:
            r6 = 4
        L72:
            r0.e(r9)
            goto L379
        L77:
            long r7 = r20 & r24
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L7f
            goto L379
        L7f:
            if (r6 <= r15) goto L83
            r6 = 79
        L83:
            r3 = 51
        L85:
            r0.e(r3)
            goto L379
        L8a:
            long r7 = r20 & r24
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L92
            goto L379
        L92:
            if (r6 <= r15) goto L96
            r6 = 79
        L96:
            r3 = 96
            r7 = 100
        L9a:
            r0.f(r3, r7)
            goto L379
        L9f:
            char r7 = r0.f1531f
            if (r7 == r3) goto La5
            goto L379
        La5:
            if (r6 <= r2) goto La8
            r6 = 4
        La8:
            r3 = 109(0x6d, float:1.53E-43)
            r7 = 112(0x70, float:1.57E-43)
            goto L9a
        Lad:
            r7 = -9217(0xffffffffffffdbff, double:NaN)
            long r7 = r20 & r7
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto Lb7
            goto L379
        Lb7:
            if (r6 <= r2) goto L72
            goto L71
        Lba:
            char r7 = r0.f1531f
            if (r7 == r3) goto Lc0
            goto L379
        Lc0:
            if (r6 <= r2) goto L72
            goto L71
        Lc3:
            long r7 = r20 & r22
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L379
            goto L64
        Lca:
            long r7 = r20 & r22
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L379
            r3 = 101(0x65, float:1.42E-43)
            r7 = 104(0x68, float:1.46E-43)
            goto L9a
        Ld5:
            long r7 = r20 & r24
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto Ldd
            goto L379
        Ldd:
            if (r6 <= r14) goto Le1
            r6 = 84
        Le1:
            r3 = 44
            goto L85
        Le4:
            r7 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r7 = r20 & r7
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L379
            goto Le1
        Lf0:
            long r7 = r20 & r24
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto Lf8
            goto L379
        Lf8:
            if (r6 <= r14) goto Lfc
            r6 = 84
        Lfc:
            r3 = 41
            r7 = 42
        L100:
            r0.g(r3, r7)
            goto L379
        L105:
            long r7 = r20 & r24
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L10d
            goto L379
        L10d:
            if (r6 <= r14) goto L111
            r6 = 84
        L111:
            r3 = 40
            goto L85
        L115:
            r7 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r7 = r20 & r7
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L379
            goto L111
        L121:
            long r7 = r20 & r24
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L129
            goto L379
        L129:
            if (r6 <= r14) goto L12d
        L12b:
            r6 = 84
        L12d:
            r3 = 37
            r7 = 38
            goto L100
        L132:
            char r3 = r0.f1531f
            if (r3 == r11) goto L138
            goto L379
        L138:
            if (r6 <= r14) goto L12d
            goto L12b
        L13b:
            long r7 = r20 & r24
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L379
            r3 = 35
            r7 = 36
            goto L100
        L146:
            long r7 = r20 & r24
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L14e
            goto L379
        L14e:
            if (r6 <= r14) goto L152
            r6 = 84
        L152:
            r3 = 124(0x7c, float:1.74E-43)
            r7 = 127(0x7f, float:1.78E-43)
            goto L9a
        L158:
            long r7 = r20 & r24
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L160
            goto L379
        L160:
            if (r6 <= r14) goto L164
            r6 = 84
        L164:
            r3 = 33
            goto L85
        L168:
            r7 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r7 = r20 & r7
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L379
            goto L164
        L174:
            long r7 = r20 & r24
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L17c
            goto L379
        L17c:
            if (r6 <= r14) goto L180
            r6 = 84
        L180:
            r3 = 30
            r7 = 31
            goto L100
        L186:
            char r3 = r0.f1531f
            if (r3 != r11) goto L379
            r3 = 30
            goto L85
        L18e:
            char r3 = r0.f1531f
            r7 = 45
            if (r3 != r7) goto L379
            r3 = 113(0x71, float:1.58E-43)
            r7 = 114(0x72, float:1.6E-43)
            r0.c(r3, r7)
            goto L379
        L19d:
            char r3 = r0.f1531f
            r7 = 39
            if (r3 != r7) goto L379
            if (r6 <= r10) goto L379
        L1a5:
            r6 = 81
            goto L379
        L1a9:
            r7 = -549755813889(0xffffff7fffffffff, double:NaN)
            long r7 = r20 & r7
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L379
        L1b4:
            r3 = 115(0x73, float:1.61E-43)
            r7 = 117(0x75, float:1.64E-43)
            goto L9a
        L1ba:
            r3 = 115(0x73, float:1.61E-43)
            r7 = 117(0x75, float:1.64E-43)
            char r8 = r0.f1531f
            r10 = 39
            if (r8 != r10) goto L379
            goto L9a
        L1c6:
            char r3 = r0.f1531f
            r7 = 34
            if (r3 != r7) goto L379
            if (r6 <= r10) goto L379
            goto L1a5
        L1cf:
            r7 = -17179869185(0xfffffffbffffffff, double:NaN)
            long r7 = r20 & r7
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L379
        L1da:
            r3 = 120(0x78, float:1.68E-43)
            r7 = 118(0x76, float:1.65E-43)
        L1de:
            r0.f(r7, r3)
            goto L379
        L1e3:
            r3 = 120(0x78, float:1.68E-43)
            r7 = 118(0x76, float:1.65E-43)
            char r8 = r0.f1531f
            r10 = 34
            if (r8 != r10) goto L379
            goto L1de
        L1ee:
            long r10 = r20 & r24
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 != 0) goto L1f6
            goto L379
        L1f6:
            r3 = 80
            if (r6 <= r3) goto L1fc
            r6 = 80
        L1fc:
            int r3 = r0.i
            int r8 = r3 + 1
            r0.i = r8
            r8 = 17
            r7[r3] = r8
            goto L379
        L208:
            char r3 = r0.f1531f
            if (r3 != r9) goto L379
            int r3 = r0.i
            int r8 = r3 + 1
            r0.i = r8
            r8 = 16
            r7[r3] = r8
            goto L379
        L218:
            long r10 = r20 & r24
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 != 0) goto L220
            goto L379
        L220:
            r3 = 78
            if (r6 <= r3) goto L226
            r6 = 78
        L226:
            int r3 = r0.i
            int r8 = r3 + 1
            r0.i = r8
            r8 = 14
            r7[r3] = r8
            goto L379
        L232:
            long r10 = r20 & r24
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 != 0) goto L23a
            goto L379
        L23a:
            r3 = 77
            if (r6 <= r3) goto L240
            r6 = 77
        L240:
            int r3 = r0.i
            int r8 = r3 + 1
            r0.i = r8
            r8 = 12
            r7[r3] = r8
            goto L379
        L24c:
            long r10 = r20 & r24
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 != 0) goto L254
            goto L379
        L254:
            r3 = 76
            if (r6 <= r3) goto L25a
            r6 = 76
        L25a:
            int r3 = r0.i
            int r8 = r3 + 1
            r0.i = r8
            r8 = 10
            r7[r3] = r8
            goto L379
        L266:
            char r3 = r0.f1531f
            r8 = 58
            if (r3 != r8) goto L379
            int r3 = r0.i
            int r8 = r3 + 1
            r0.i = r8
            r8 = 9
            r7[r3] = r8
            goto L379
        L278:
            char r3 = r0.f1531f
            r8 = 13
            if (r3 != r8) goto L379
            int r3 = r0.i
            int r8 = r3 + 1
            r0.i = r8
            r8 = 6
            r7[r3] = r8
            goto L379
        L289:
            char r3 = r0.f1531f
            r7 = 10
            if (r3 == r7) goto L291
            goto L379
        L291:
            r3 = 74
            if (r6 <= r3) goto L297
        L295:
            r6 = 74
        L297:
            r3 = 105(0x69, float:1.47E-43)
            r7 = 108(0x6c, float:1.51E-43)
            goto L9a
        L29d:
            r7 = -9217(0xffffffffffffdbff, double:NaN)
            long r7 = r20 & r7
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L379
        L2a5:
            r0.f(r13, r12)
            goto L379
        L2aa:
            char r7 = r0.f1531f
            if (r7 != r3) goto L379
            goto L2a5
        L2af:
            long r7 = r20 & r22
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L379
            r3 = 3
            r0.g(r3, r2)
            goto L379
        L2bb:
            r7 = 9216(0x2400, double:4.5533E-320)
            long r7 = r20 & r7
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L2c5
            goto L379
        L2c5:
            r3 = 74
            if (r6 <= r3) goto L297
            goto L295
        L2ca:
            long r10 = r20 & r24
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 != 0) goto L2d2
            goto L379
        L2d2:
            r3 = 61
            if (r6 <= r3) goto L2d8
            r6 = 61
        L2d8:
            int r3 = r0.i
            int r8 = r3 + 1
            r0.i = r8
            r8 = 1
            r7[r3] = r8
            goto L379
        L2e3:
            long r24 = r20 & r24
            int r8 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1))
            if (r8 == 0) goto L2f5
            if (r6 <= r15) goto L2ed
            r6 = 79
        L2ed:
            r3 = 96
            r7 = 100
        L2f1:
            r0.f(r3, r7)
            goto L359
        L2f5:
            long r14 = r20 & r22
            int r8 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r8 == 0) goto L300
            r3 = 101(0x65, float:1.42E-43)
            r7 = 104(0x68, float:1.46E-43)
            goto L2f1
        L300:
            r14 = 9216(0x2400, double:4.5533E-320)
            long r14 = r20 & r14
            int r8 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r8 == 0) goto L313
            r8 = 74
            if (r6 <= r8) goto L30e
            r6 = 74
        L30e:
            r3 = 105(0x69, float:1.47E-43)
            r7 = 108(0x6c, float:1.51E-43)
            goto L2f1
        L313:
            char r8 = r0.f1531f
            if (r8 != r3) goto L31f
            if (r6 <= r2) goto L31a
            r6 = 4
        L31a:
            r3 = 109(0x6d, float:1.53E-43)
            r7 = 112(0x70, float:1.57E-43)
            goto L2f1
        L31f:
            if (r8 != r11) goto L327
            r3 = 30
            r0.e(r3)
            goto L359
        L327:
            r3 = 45
            if (r8 != r3) goto L333
            r3 = 113(0x71, float:1.58E-43)
            r7 = 114(0x72, float:1.6E-43)
            r0.c(r3, r7)
            goto L359
        L333:
            r3 = 39
            if (r8 != r3) goto L33f
            r3 = 115(0x73, float:1.61E-43)
            r10 = 117(0x75, float:1.64E-43)
            r0.f(r3, r10)
            goto L359
        L33f:
            r3 = 34
            if (r8 != r3) goto L34b
            r3 = 120(0x78, float:1.68E-43)
            r10 = 118(0x76, float:1.65E-43)
            r0.f(r10, r3)
            goto L359
        L34b:
            r3 = 58
            if (r8 != r3) goto L359
            int r3 = r0.i
            int r8 = r3 + 1
            r0.i = r8
            r8 = 9
            r7[r3] = r8
        L359:
            char r3 = r0.f1531f
            if (r3 != r9) goto L36a
            int[] r3 = r0.f1530e
            int r7 = r0.i
            int r8 = r7 + 1
            r0.i = r8
            r8 = 16
            r3[r7] = r8
            goto L379
        L36a:
            r7 = 13
            if (r3 != r7) goto L379
            int[] r3 = r0.f1530e
            int r7 = r0.i
            int r8 = r7 + 1
            r0.i = r8
            r8 = 6
            r3[r7] = r8
        L379:
            if (r5 != r4) goto L34
        L37b:
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L5a9
        L380:
            r3 = 128(0x80, float:1.8E-43)
            if (r7 >= r3) goto L50b
            r3 = r7 & 63
            long r14 = r10 << r3
        L388:
            int[] r3 = r0.f1530e
            int r5 = r5 + (-1)
            r7 = r3[r5]
            if (r7 == 0) goto L4ce
            r8 = 1
            if (r7 == r8) goto L4b6
            r8 = 5
            if (r7 == r8) goto L4b0
            r8 = 13
            if (r7 == r8) goto L49d
            r8 = 31
            if (r7 == r8) goto L48c
            r8 = 38
            if (r7 == r8) goto L47b
            r8 = 42
            if (r7 == r8) goto L467
            if (r7 == r9) goto L459
            r8 = 16
            if (r7 == r8) goto L447
            r8 = 17
            if (r7 == r8) goto L42b
            switch(r7) {
                case 9: goto L410;
                case 10: goto L410;
                case 11: goto L3ff;
                default: goto L3b3;
            }
        L3b3:
            switch(r7) {
                case 19: goto L3ee;
                case 20: goto L3e6;
                case 21: goto L3de;
                default: goto L3b6;
            }
        L3b6:
            switch(r7) {
                case 24: goto L3cd;
                case 25: goto L3c5;
                case 26: goto L3bd;
                default: goto L3b9;
            }
        L3b9:
            r8 = 80
            goto L4c2
        L3bd:
            r7 = -268435457(0xffffffffefffffff, double:NaN)
            long r7 = r7 & r14
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L3b9
        L3c5:
            r3 = 115(0x73, float:1.61E-43)
            r7 = 117(0x75, float:1.64E-43)
            r0.f(r3, r7)
            goto L3b9
        L3cd:
            char r7 = r0.f1531f
            r8 = 92
            if (r7 != r8) goto L3b9
            int r7 = r0.i
            int r8 = r7 + 1
            r0.i = r8
            r8 = 25
            r3[r7] = r8
            goto L3b9
        L3de:
            r7 = -268435457(0xffffffffefffffff, double:NaN)
            long r7 = r7 & r14
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 == 0) goto L3b9
        L3e6:
            r3 = 120(0x78, float:1.68E-43)
            r7 = 118(0x76, float:1.65E-43)
            r0.f(r7, r3)
            goto L3b9
        L3ee:
            char r7 = r0.f1531f
            r8 = 92
            if (r7 != r8) goto L3b9
            int r7 = r0.i
            int r8 = r7 + 1
            r0.i = r8
            r8 = 20
            r3[r7] = r8
            goto L3b9
        L3ff:
            char r7 = r0.f1531f
            r8 = 118(0x76, float:1.65E-43)
            if (r7 != r8) goto L3b9
            int r7 = r0.i
            int r8 = r7 + 1
            r0.i = r8
            r8 = 12
            r3[r7] = r8
            goto L3b9
        L410:
            r7 = 576460745995190270(0x7fffffe87fffffe, double:3.7857643443544387E-270)
            long r7 = r7 & r14
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L41b
            goto L3b9
        L41b:
            r3 = 76
            if (r6 <= r3) goto L421
            r6 = 76
        L421:
            r3 = 10
            r0.e(r3)
            r7 = 1
            r8 = 80
            goto L507
        L42b:
            r7 = 541165879422(0x7e0000007e, double:2.67371469724E-312)
            long r7 = r7 & r14
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 != 0) goto L436
            goto L3b9
        L436:
            r8 = 80
            if (r6 <= r8) goto L43d
            r3 = 80
            goto L43e
        L43d:
            r3 = r6
        L43e:
            r6 = 17
            r0.e(r6)
            r6 = r3
        L444:
            r7 = 1
            goto L507
        L447:
            r8 = 80
            r10 = 72057594054705152(0x100000001000000, double:7.291122046717944E-304)
            long r10 = r10 & r14
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 == 0) goto L444
            r3 = 17
            r0.e(r3)
            goto L4c2
        L459:
            r8 = 80
            if (r6 <= r2) goto L45e
            r6 = 4
        L45e:
            int r7 = r0.i
            int r10 = r7 + 1
            r0.i = r10
            r3[r7] = r9
            goto L444
        L467:
            r8 = 80
            r10 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r10 = r10 & r14
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 == 0) goto L444
            r3 = 94
            r7 = 95
        L477:
            r0.c(r3, r7)
            goto L4c2
        L47b:
            r8 = 80
            r10 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r10 = r10 & r14
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 == 0) goto L444
            r3 = 69
            r7 = 70
            goto L477
        L48c:
            r8 = 80
            r10 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r10 = r10 & r14
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 == 0) goto L444
            r3 = 128(0x80, float:1.8E-43)
            r7 = 129(0x81, float:1.81E-43)
            goto L477
        L49d:
            r8 = 80
            char r7 = r0.f1531f
            r10 = 117(0x75, float:1.64E-43)
            if (r7 != r10) goto L444
            int r7 = r0.i
            int r10 = r7 + 1
            r0.i = r10
            r10 = 14
            r3[r7] = r10
            goto L4c2
        L4b0:
            r8 = 80
            r0.c(r13, r12)
            goto L4c2
        L4b6:
            r8 = 80
            r10 = 576460745995190270(0x7fffffe87fffffe, double:3.7857643443544387E-270)
            long r10 = r10 & r14
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 != 0) goto L4c3
        L4c2:
            goto L444
        L4c3:
            r3 = 61
            if (r6 <= r3) goto L4c9
            r6 = 61
        L4c9:
            r7 = 1
            r0.e(r7)
            goto L507
        L4ce:
            r3 = 61
            r7 = 1
            r8 = 80
            r10 = 576460745995190270(0x7fffffe87fffffe, double:3.7857643443544387E-270)
            long r10 = r10 & r14
            int r16 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r16 == 0) goto L4e4
            if (r6 <= r3) goto L4e1
            r6 = 61
        L4e1:
            r0.e(r7)
        L4e4:
            char r10 = r0.f1531f
            r11 = 117(0x75, float:1.64E-43)
            if (r10 != r11) goto L4f7
            int[] r10 = r0.f1530e
            int r11 = r0.i
            int r3 = r11 + 1
            r0.i = r3
            r3 = 14
            r10[r11] = r3
            goto L507
        L4f7:
            r3 = 118(0x76, float:1.65E-43)
            if (r10 != r3) goto L507
            int[] r3 = r0.f1530e
            int r10 = r0.i
            int r11 = r10 + 1
            r0.i = r11
            r11 = 12
            r3[r10] = r11
        L507:
            if (r5 != r4) goto L388
            goto L37b
        L50b:
            r3 = 1
            int r8 = r7 >> 8
            int r14 = r7 >> 14
            r15 = r8 & 63
            long r15 = r10 << r15
            r3 = r7 & 255(0xff, float:3.57E-43)
            int r3 = r3 >> 6
            r7 = r7 & 63
            long r10 = r10 << r7
        L51b:
            int[] r7 = r0.f1530e
            int r5 = r5 + (-1)
            r7 = r7[r5]
            r12 = 5
            if (r7 == r12) goto L590
            if (r7 == r9) goto L56b
            r12 = 20
            if (r7 == r12) goto L54f
            r12 = 21
            if (r7 == r12) goto L54f
            r12 = 25
            if (r7 == r12) goto L537
            r12 = 26
            if (r7 == r12) goto L537
        L536:
            goto L58d
        L537:
            r24 = r8
            r25 = r14
            r26 = r3
            r27 = r15
            r29 = r10
            boolean r7 = d(r24, r25, r26, r27, r29)
            if (r7 == 0) goto L58d
            r7 = 115(0x73, float:1.61E-43)
            r12 = 117(0x75, float:1.64E-43)
            r0.f(r7, r12)
            goto L58d
        L54f:
            r7 = 115(0x73, float:1.61E-43)
            r12 = 117(0x75, float:1.64E-43)
            r24 = r8
            r25 = r14
            r26 = r3
            r27 = r15
            r29 = r10
            boolean r18 = d(r24, r25, r26, r27, r29)
            if (r18 == 0) goto L58d
            r7 = 120(0x78, float:1.68E-43)
            r12 = 118(0x76, float:1.65E-43)
            r0.f(r12, r7)
            goto L58d
        L56b:
            r7 = 120(0x78, float:1.68E-43)
            r12 = 118(0x76, float:1.65E-43)
            r24 = r8
            r25 = r14
            r26 = r3
            r27 = r15
            r29 = r10
            boolean r17 = d(r24, r25, r26, r27, r29)
            if (r17 != 0) goto L580
            goto L536
        L580:
            if (r6 <= r2) goto L583
            r6 = 4
        L583:
            int[] r2 = r0.f1530e
            int r7 = r0.i
            int r12 = r7 + 1
            r0.i = r12
            r2[r7] = r9
        L58d:
            r2 = 123(0x7b, float:1.72E-43)
            goto L5a5
        L590:
            r24 = r8
            r25 = r14
            r26 = r3
            r27 = r15
            r29 = r10
            boolean r2 = d(r24, r25, r26, r27, r29)
            if (r2 == 0) goto L58d
            r2 = 123(0x7b, float:1.72E-43)
            r0.c(r13, r2)
        L5a5:
            if (r5 != r4) goto L5cc
            goto L37b
        L5a9:
            if (r6 == r7) goto L5b2
            r0.l = r6
            r0.k = r1
            r6 = 2147483647(0x7fffffff, float:NaN)
        L5b2:
            int r1 = r1 + 1
            int r5 = r0.i
            r0.i = r4
            int r4 = 52 - r4
            if (r5 != r4) goto L5bd
            return r1
        L5bd:
            e.e r2 = r0.f1528c     // Catch: java.io.IOException -> L5cb
            char r2 = r2.k()     // Catch: java.io.IOException -> L5cb
            r0.f1531f = r2     // Catch: java.io.IOException -> L5cb
            r2 = 1
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L17
        L5cb:
            return r1
        L5cc:
            r2 = 4
            r12 = 123(0x7b, float:1.72E-43)
            goto L51b
    }

    private int i0(long r13, long r15, long r17, long r19) {
            r12 = this;
            r9 = r12
            long r1 = r15 & r13
            long r5 = r19 & r17
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 4
            r0 = r12
            r2 = r13
            r4 = r17
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L17:
            r0 = 6
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L146
            char r3 = r3.k()     // Catch: java.io.IOException -> L146
            r9.f1531f = r3     // Catch: java.io.IOException -> L146
            r4 = 65
            if (r3 == r4) goto L13c
            r4 = 69
            r10 = 1
            if (r3 == r4) goto L121
            r4 = 76
            if (r3 == r4) goto L106
            r4 = 97
            if (r3 == r4) goto Lfc
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto Le4
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto Lda
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 == r4) goto Ld0
            r4 = 114(0x72, float:1.6E-43)
            if (r3 == r4) goto Lc6
            r4 = 79
            if (r3 == r4) goto Lb9
            r4 = 80
            if (r3 == r4) goto L7e
            r4 = 84
            if (r3 == r4) goto L5c
            r0 = 85
            if (r3 == r0) goto L52
            goto Lae
        L52:
            r3 = 5120(0x1400, double:2.5296E-320)
            r7 = 0
            r0 = r12
            int r0 = r0.m0(r1, r3, r5, r7)
            return r0
        L5c:
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L6d
            r1 = 32
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L6d:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lae
            r1 = 40
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L7e:
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L8f
            r1 = 36
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L8f:
            r3 = 137438953472(0x2000000000, double:6.7903865311E-313)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto La0
            r1 = 37
            int r0 = r12.y0(r0, r1, r10)
            return r0
        La0:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lae
            r1 = 54
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lae:
            r0 = 5
            r13 = r12
            r14 = r0
            r15 = r1
            r17 = r5
            int r0 = r13.C0(r14, r15, r17)
            return r0
        Lb9:
            r3 = 549755814016(0x8000000080, double:2.71615461307E-312)
            r7 = 0
            r0 = r12
            int r0 = r0.m0(r1, r3, r5, r7)
            return r0
        Lc6:
            r3 = 0
            r7 = 6
            r0 = r12
            int r0 = r0.m0(r1, r3, r5, r7)
            return r0
        Ld0:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r12
            int r0 = r0.m0(r1, r3, r5, r7)
            return r0
        Lda:
            r3 = 0
            r7 = 1
            r0 = r12
            int r0 = r0.m0(r1, r3, r5, r7)
            return r0
        Le4:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf2
            r1 = 62
            int r0 = r12.G0(r0, r1)
            return r0
        Lf2:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r12
            int r0 = r0.m0(r1, r3, r5, r7)
            return r0
        Lfc:
            r3 = 0
            r7 = 8
            r0 = r12
            int r0 = r0.m0(r1, r3, r5, r7)
            return r0
        L106:
            r3 = 256(0x100, double:1.265E-321)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L114
            r1 = 8
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L114:
            r3 = 292057827328(0x440000c800, double:1.44295739082E-312)
            r7 = 0
            r0 = r12
            int r0 = r0.m0(r1, r3, r5, r7)
            return r0
        L121:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L132
            r1 = 41
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L132:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r12
            int r0 = r0.m0(r1, r3, r5, r7)
            return r0
        L13c:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r12
            int r0 = r0.m0(r1, r3, r5, r7)
            return r0
        L146:
            r3 = 5
            r13 = r12
            r14 = r3
            r15 = r1
            r17 = r5
            r13.H0(r14, r15, r17)
            return r0
    }

    private int j(int r32, int r33) {
            r31 = this;
            r0 = r31
            r1 = 51
            r0.i = r1
            int[] r1 = r0.f1530e
            r2 = 0
            r1[r2] = r32
            r1 = 1
            r3 = 2147483647(0x7fffffff, float:NaN)
            r3 = r33
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 1
            r6 = 0
        L16:
            int r7 = r0.j
            int r7 = r7 + r1
            r0.j = r7
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r8) goto L23
            r31.a()
        L23:
            char r7 = r0.f1531f
            r8 = 64
            r12 = 76
            r10 = 2
            r13 = 34
            r15 = 4
            r18 = 0
            if (r7 >= r8) goto L36a
            r20 = 1
            long r20 = r20 << r7
        L35:
            int[] r7 = r0.f1530e
            int r5 = r5 + (-1)
            r8 = r7[r5]
            r22 = 4294971904(0x100001200, double:2.1219980676E-314)
            r11 = 60
            r14 = 59
            r25 = 287948901175001088(0x3ff000000000000, double:1.988135013128901E-289)
            r9 = 84
            switch(r8) {
                case 0: goto L356;
                case 1: goto L34c;
                case 2: goto L347;
                case 3: goto L33b;
                case 4: goto L328;
                case 5: goto L319;
                case 6: goto L27f;
                case 7: goto L4b;
                case 8: goto L267;
                case 9: goto L4b;
                case 10: goto L24d;
                case 11: goto L4b;
                case 12: goto L233;
                case 13: goto L221;
                case 14: goto L4b;
                case 15: goto L207;
                case 16: goto L1fd;
                case 17: goto L4b;
                case 18: goto L1f7;
                case 19: goto L1ec;
                case 20: goto L1e3;
                case 21: goto L1d7;
                case 22: goto L4b;
                case 23: goto L1d1;
                case 24: goto L1c6;
                case 25: goto L1b8;
                case 26: goto L1ab;
                case 27: goto L196;
                case 28: goto L4b;
                case 29: goto L18a;
                case 30: goto L17a;
                case 31: goto L16f;
                case 32: goto L167;
                case 33: goto L15d;
                case 34: goto L14f;
                case 35: goto L13f;
                case 36: goto L130;
                case 37: goto L120;
                case 38: goto L10b;
                case 39: goto L100;
                case 40: goto Lf5;
                case 41: goto Le4;
                case 42: goto L4b;
                case 43: goto Ld8;
                case 44: goto Lc9;
                case 45: goto Lb4;
                case 46: goto L4b;
                case 47: goto La8;
                case 48: goto L99;
                case 49: goto L86;
                case 50: goto L71;
                case 51: goto L4d;
                default: goto L4b;
            }
        L4b:
            goto L366
        L4d:
            long r7 = r20 & r22
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L57
            r0.g(r1, r10)
            goto L5e
        L57:
            char r7 = r0.f1531f
            if (r7 != r14) goto L5e
            r0.f(r2, r10)
        L5e:
            if (r9 == 0) goto L65
        L60:
            r7 = 32
            r8 = 33
            goto Lc4
        L65:
            char r7 = r0.f1531f
            if (r7 != r14) goto L366
            if (r4 <= r15) goto L6c
        L6b:
            r4 = 4
        L6c:
            r0.e(r13)
            goto L366
        L71:
            long r7 = r20 & r25
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 != 0) goto L79
            goto L366
        L79:
            r7 = 79
            if (r4 <= r7) goto L7f
            r4 = 79
        L7f:
            r7 = 50
        L81:
            r0.e(r7)
            goto L366
        L86:
            long r7 = r20 & r25
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 != 0) goto L8e
            goto L366
        L8e:
            if (r4 <= r11) goto L92
            r4 = 60
        L92:
            r7 = 71
            r0.f(r7, r12)
            goto L366
        L99:
            long r7 = r20 & r25
            int r11 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r11 != 0) goto La1
            goto L366
        La1:
            if (r4 <= r9) goto La5
            r4 = 84
        La5:
            r7 = 48
            goto L81
        La8:
            r7 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r7 = r20 & r7
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L366
            goto La5
        Lb4:
            long r7 = r20 & r25
            int r11 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r11 != 0) goto Lbc
            goto L366
        Lbc:
            if (r4 <= r9) goto Lc0
            r4 = 84
        Lc0:
            r7 = 45
            r8 = 46
        Lc4:
            r0.g(r7, r8)
            goto L366
        Lc9:
            long r7 = r20 & r25
            int r11 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r11 != 0) goto Ld1
            goto L366
        Ld1:
            if (r4 <= r9) goto Ld5
            r4 = 84
        Ld5:
            r7 = 44
            goto L81
        Ld8:
            r7 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r7 = r20 & r7
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L366
            goto Ld5
        Le4:
            long r7 = r20 & r25
            int r11 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r11 != 0) goto Lec
            goto L366
        Lec:
            if (r4 <= r9) goto Lf0
        Lee:
            r4 = 84
        Lf0:
            r7 = 41
            r8 = 42
            goto Lc4
        Lf5:
            char r7 = r0.f1531f
            r8 = 46
            if (r7 == r8) goto Lfd
            goto L366
        Lfd:
            if (r4 <= r9) goto Lf0
            goto Lee
        L100:
            long r7 = r20 & r25
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L366
            r7 = 39
            r8 = 40
            goto Lc4
        L10b:
            long r7 = r20 & r25
            int r11 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r11 != 0) goto L113
            goto L366
        L113:
            if (r4 <= r9) goto L117
            r4 = 84
        L117:
            r7 = 88
            r8 = 91
        L11b:
            r0.f(r7, r8)
            goto L366
        L120:
            long r7 = r20 & r25
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 != 0) goto L128
            goto L366
        L128:
            if (r4 <= r11) goto L12c
            r4 = 60
        L12c:
            r7 = 37
            goto L81
        L130:
            char r7 = r0.f1531f
            r8 = 45
            if (r7 != r8) goto L366
            r7 = 83
            r8 = 81
            r0.f(r8, r7)
            goto L366
        L13f:
            char r7 = r0.f1531f
            if (r7 == r14) goto L145
            goto L366
        L145:
            if (r4 <= r15) goto L148
            r4 = 4
        L148:
            r7 = 87
            r0.f(r9, r7)
            goto L366
        L14f:
            r7 = -9217(0xffffffffffffdbff, double:NaN)
            long r7 = r20 & r7
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 != 0) goto L159
            goto L366
        L159:
            if (r4 <= r15) goto L6c
            goto L6b
        L15d:
            char r7 = r0.f1531f
            if (r7 == r14) goto L163
            goto L366
        L163:
            if (r4 <= r15) goto L6c
            goto L6b
        L167:
            long r7 = r20 & r22
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L366
            goto L60
        L16f:
            long r7 = r20 & r22
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L366
            r7 = 77
            r8 = 80
            goto L11b
        L17a:
            long r7 = r20 & r25
            int r11 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r11 != 0) goto L182
            goto L366
        L182:
            if (r4 <= r9) goto L186
            r4 = 84
        L186:
            r7 = 30
            goto L81
        L18a:
            r7 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r7 = r20 & r7
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L366
            goto L186
        L196:
            long r7 = r20 & r25
            int r11 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r11 != 0) goto L19e
            goto L366
        L19e:
            if (r4 <= r9) goto L1a2
            r4 = 84
        L1a2:
            r7 = 28
            r8 = 27
            r0.g(r8, r7)
            goto L366
        L1ab:
            r8 = 27
            char r7 = r0.f1531f
            r9 = 46
            if (r7 != r9) goto L366
            r0.e(r8)
            goto L366
        L1b8:
            char r7 = r0.f1531f
            r8 = 39
            if (r7 != r8) goto L366
            r7 = 81
            if (r4 <= r7) goto L366
        L1c2:
            r4 = 81
            goto L366
        L1c6:
            r7 = -549755813889(0xffffff7fffffffff, double:NaN)
            long r7 = r20 & r7
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L366
        L1d1:
            r7 = 22
            r8 = 24
            goto L11b
        L1d7:
            r7 = 22
            r8 = 24
            char r9 = r0.f1531f
            r11 = 39
            if (r9 != r11) goto L366
            goto L11b
        L1e3:
            char r7 = r0.f1531f
            if (r7 != r13) goto L366
            r7 = 81
            if (r4 <= r7) goto L366
            goto L1c2
        L1ec:
            r7 = -17179869185(0xfffffffbffffffff, double:NaN)
            long r7 = r20 & r7
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L366
        L1f7:
            r7 = 25
            r8 = 27
            goto L11b
        L1fd:
            r7 = 25
            r8 = 27
            char r9 = r0.f1531f
            if (r9 != r13) goto L366
            goto L11b
        L207:
            long r8 = r20 & r25
            int r11 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r11 != 0) goto L20f
            goto L366
        L20f:
            r8 = 80
            if (r4 <= r8) goto L215
            r4 = 80
        L215:
            int r8 = r0.i
            int r9 = r8 + 1
            r0.i = r9
            r9 = 15
            r7[r8] = r9
            goto L366
        L221:
            char r8 = r0.f1531f
            r9 = 48
            if (r8 != r9) goto L366
            int r8 = r0.i
            int r9 = r8 + 1
            r0.i = r9
            r9 = 14
            r7[r8] = r9
            goto L366
        L233:
            long r8 = r20 & r25
            int r11 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r11 != 0) goto L23b
            goto L366
        L23b:
            r8 = 78
            if (r4 <= r8) goto L241
            r4 = 78
        L241:
            int r8 = r0.i
            int r9 = r8 + 1
            r0.i = r9
            r9 = 12
            r7[r8] = r9
            goto L366
        L24d:
            long r8 = r20 & r25
            int r11 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r11 != 0) goto L255
            goto L366
        L255:
            r8 = 77
            if (r4 <= r8) goto L25b
            r4 = 77
        L25b:
            int r8 = r0.i
            int r9 = r8 + 1
            r0.i = r9
            r9 = 10
            r7[r8] = r9
            goto L366
        L267:
            long r8 = r20 & r25
            int r11 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r11 != 0) goto L26f
            goto L366
        L26f:
            if (r4 <= r12) goto L273
            r4 = 76
        L273:
            int r8 = r0.i
            int r9 = r8 + 1
            r0.i = r9
            r9 = 8
            r7[r8] = r9
            goto L366
        L27f:
            long r25 = r20 & r25
            int r8 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            if (r8 == 0) goto L290
            if (r4 <= r11) goto L289
            r4 = 60
        L289:
            r7 = 71
            r0.f(r7, r12)
            goto L2f7
        L290:
            long r22 = r20 & r22
            int r8 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r8 == 0) goto L29b
            r7 = 77
            r8 = 80
            goto L2ad
        L29b:
            r22 = 9216(0x2400, double:4.5533E-320)
            long r22 = r20 & r22
            int r8 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r8 == 0) goto L2b1
            r8 = 74
            if (r4 <= r8) goto L2a9
            r4 = 74
        L2a9:
            r7 = 12
            r8 = 15
        L2ad:
            r0.f(r7, r8)
            goto L2f7
        L2b1:
            char r8 = r0.f1531f
            r11 = 45
            if (r8 != r11) goto L2bf
            r7 = 83
            r8 = 81
            r0.f(r8, r7)
            goto L2f7
        L2bf:
            if (r8 != r14) goto L2ca
            if (r4 <= r15) goto L2c4
            r4 = 4
        L2c4:
            r7 = 87
            r0.f(r9, r7)
            goto L2f7
        L2ca:
            r9 = 46
            if (r8 != r9) goto L2d4
            r9 = 27
            r0.e(r9)
            goto L2f7
        L2d4:
            r9 = 27
            r11 = 39
            if (r8 != r11) goto L2e2
            r11 = 22
            r14 = 24
            r0.f(r11, r14)
            goto L2f7
        L2e2:
            if (r8 != r13) goto L2ea
            r11 = 25
            r0.f(r11, r9)
            goto L2f7
        L2ea:
            r9 = 58
            if (r8 != r9) goto L2f7
            int r8 = r0.i
            int r9 = r8 + 1
            r0.i = r9
            r9 = 7
            r7[r8] = r9
        L2f7:
            char r7 = r0.f1531f
            r8 = 48
            if (r7 != r8) goto L30a
            int[] r7 = r0.f1530e
            int r8 = r0.i
            int r9 = r8 + 1
            r0.i = r9
            r9 = 14
            r7[r8] = r9
            goto L366
        L30a:
            r8 = 13
            if (r7 != r8) goto L366
            int[] r7 = r0.f1530e
            int r8 = r0.i
            int r9 = r8 + 1
            r0.i = r9
            r7[r8] = r15
            goto L366
        L319:
            char r8 = r0.f1531f
            r9 = 13
            if (r8 != r9) goto L366
            int r8 = r0.i
            int r9 = r8 + 1
            r0.i = r9
            r7[r8] = r15
            goto L366
        L328:
            char r7 = r0.f1531f
            r8 = 10
            if (r7 == r8) goto L32f
            goto L366
        L32f:
            r7 = 74
            if (r4 <= r7) goto L335
            r4 = 74
        L335:
            r7 = 12
            r8 = 15
            goto L11b
        L33b:
            r7 = -9217(0xffffffffffffdbff, double:NaN)
            long r7 = r20 & r7
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L366
        L343:
            r0.f(r2, r10)
            goto L366
        L347:
            char r7 = r0.f1531f
            if (r7 != r14) goto L366
            goto L343
        L34c:
            long r7 = r20 & r22
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L366
            r0.g(r1, r10)
            goto L366
        L356:
            r7 = 9216(0x2400, double:4.5533E-320)
            long r7 = r20 & r7
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 != 0) goto L35f
            goto L366
        L35f:
            r7 = 74
            if (r4 <= r7) goto L335
            r4 = 74
            goto L335
        L366:
            if (r5 != r6) goto L35
            goto L560
        L36a:
            r8 = 128(0x80, float:1.8E-43)
            if (r7 >= r8) goto L4c7
            r7 = r7 & 63
            r8 = 1
            long r8 = r8 << r7
        L373:
            int[] r7 = r0.f1530e
            int r5 = r5 + (-1)
            r11 = r7[r5]
            r14 = 3
            if (r11 == r14) goto L4b9
            r14 = 11
            if (r11 == r14) goto L4a6
            r14 = 28
            if (r11 == r14) goto L494
            if (r11 == r13) goto L483
            r14 = 42
            if (r11 == r14) goto L46c
            r14 = 46
            if (r11 == r14) goto L455
            r1 = 14
            if (r11 == r1) goto L445
            r1 = 15
            if (r11 == r1) goto L42c
            switch(r11) {
                case 6: goto L40b;
                case 7: goto L3f2;
                case 8: goto L3f2;
                case 9: goto L3e1;
                default: goto L399;
            }
        L399:
            switch(r11) {
                case 17: goto L3d0;
                case 18: goto L3cb;
                case 19: goto L3c2;
                default: goto L39c;
            }
        L39c:
            switch(r11) {
                case 22: goto L3b1;
                case 23: goto L3a9;
                case 24: goto L3a0;
                default: goto L39f;
            }
        L39f:
            goto L407
        L3a0:
            r21 = -268435457(0xffffffffefffffff, double:NaN)
            long r21 = r8 & r21
            int r1 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r1 == 0) goto L407
        L3a9:
            r1 = 22
            r7 = 24
        L3ad:
            r0.f(r1, r7)
            goto L407
        L3b1:
            char r1 = r0.f1531f
            r11 = 92
            if (r1 != r11) goto L407
            int r1 = r0.i
            int r11 = r1 + 1
            r0.i = r11
            r11 = 23
            r7[r1] = r11
            goto L407
        L3c2:
            r21 = -268435457(0xffffffffefffffff, double:NaN)
            long r21 = r8 & r21
            int r1 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r1 == 0) goto L407
        L3cb:
            r1 = 25
            r7 = 27
            goto L3ad
        L3d0:
            char r1 = r0.f1531f
            r11 = 92
            if (r1 != r11) goto L407
            int r1 = r0.i
            int r11 = r1 + 1
            r0.i = r11
            r11 = 18
            r7[r1] = r11
            goto L407
        L3e1:
            char r1 = r0.f1531f
            r11 = 118(0x76, float:1.65E-43)
            if (r1 != r11) goto L407
            int r1 = r0.i
            int r11 = r1 + 1
            r0.i = r11
            r11 = 10
            r7[r1] = r11
            goto L407
        L3f2:
            r21 = 576460745995190270(0x7fffffe87fffffe, double:3.7857643443544387E-270)
            long r21 = r8 & r21
            int r1 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r1 != 0) goto L3fe
            goto L39f
        L3fe:
            if (r4 <= r12) goto L402
            r4 = 76
        L402:
            r1 = 8
            r0.e(r1)
        L407:
            r11 = 12
            goto L4c0
        L40b:
            char r1 = r0.f1531f
            r11 = 117(0x75, float:1.64E-43)
            if (r1 != r11) goto L41d
            int r1 = r0.i
            int r11 = r1 + 1
            r0.i = r11
            r11 = 12
            r7[r1] = r11
            goto L4c0
        L41d:
            r11 = 118(0x76, float:1.65E-43)
            if (r1 != r11) goto L407
            int r1 = r0.i
            int r11 = r1 + 1
            r0.i = r11
            r11 = 10
            r7[r1] = r11
            goto L407
        L42c:
            r21 = 541165879422(0x7e0000007e, double:2.67371469724E-312)
            long r21 = r8 & r21
            int r1 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r1 != 0) goto L439
            goto L39f
        L439:
            r1 = 80
            if (r4 <= r1) goto L43f
            r4 = 80
        L43f:
            r11 = 15
        L441:
            r0.e(r11)
            goto L407
        L445:
            r1 = 80
            r11 = 15
            r21 = 72057594054705152(0x100000001000000, double:7.291122046717944E-304)
            long r21 = r8 & r21
            int r7 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r7 == 0) goto L407
            goto L441
        L455:
            r1 = 80
            r11 = 15
            r21 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r21 = r8 & r21
            int r7 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r7 == 0) goto L407
            r7 = 63
            r1 = 64
            r0.c(r7, r1)
            goto L407
        L46c:
            r11 = 15
            r14 = 46
            r21 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r21 = r8 & r21
            int r1 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r1 == 0) goto L407
            r1 = 94
            r7 = 95
        L47f:
            r0.c(r1, r7)
            goto L407
        L483:
            r11 = 15
            r14 = 46
            if (r4 <= r15) goto L48a
            r4 = 4
        L48a:
            int r1 = r0.i
            int r11 = r1 + 1
            r0.i = r11
            r7[r1] = r13
            goto L407
        L494:
            r14 = 46
            r21 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r21 = r8 & r21
            int r1 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r1 == 0) goto L407
            r1 = 92
            r7 = 93
            goto L47f
        L4a6:
            r14 = 46
            char r1 = r0.f1531f
            r11 = 117(0x75, float:1.64E-43)
            if (r1 != r11) goto L407
            int r1 = r0.i
            int r11 = r1 + 1
            r0.i = r11
            r11 = 12
            r7[r1] = r11
            goto L4c0
        L4b9:
            r11 = 12
            r14 = 46
            r0.c(r2, r10)
        L4c0:
            if (r5 != r6) goto L4c4
            goto L560
        L4c4:
            r1 = 1
            goto L373
        L4c7:
            int r1 = r7 >> 8
            int r8 = r7 >> 14
            r9 = r1 & 63
            r11 = 1
            long r11 = r11 << r9
            r9 = r7 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 6
            r7 = r7 & 63
            r18 = 1
            long r18 = r18 << r7
        L4da:
            int[] r7 = r0.f1530e
            int r5 = r5 + (-1)
            r7 = r7[r5]
            r14 = 3
            if (r7 == r14) goto L54b
            if (r7 == r13) goto L528
            r14 = 18
            if (r7 == r14) goto L50f
            r14 = 19
            if (r7 == r14) goto L50f
            r14 = 23
            if (r7 == r14) goto L4f7
            r14 = 24
            if (r7 == r14) goto L4f9
            goto L55e
        L4f7:
            r14 = 24
        L4f9:
            r24 = r1
            r25 = r8
            r26 = r9
            r27 = r11
            r29 = r18
            boolean r7 = d(r24, r25, r26, r27, r29)
            if (r7 == 0) goto L55e
            r7 = 22
        L50b:
            r0.f(r7, r14)
            goto L55e
        L50f:
            r7 = 22
            r14 = 24
            r24 = r1
            r25 = r8
            r26 = r9
            r27 = r11
            r29 = r18
            boolean r17 = d(r24, r25, r26, r27, r29)
            if (r17 == 0) goto L55e
            r7 = 25
            r14 = 27
            goto L50b
        L528:
            r7 = 25
            r14 = 27
            r24 = r1
            r25 = r8
            r26 = r9
            r27 = r11
            r29 = r18
            boolean r16 = d(r24, r25, r26, r27, r29)
            if (r16 != 0) goto L53d
            goto L55e
        L53d:
            if (r4 <= r15) goto L540
            r4 = 4
        L540:
            int[] r7 = r0.f1530e
            int r14 = r0.i
            int r15 = r14 + 1
            r0.i = r15
            r7[r14] = r13
            goto L55e
        L54b:
            r24 = r1
            r25 = r8
            r26 = r9
            r27 = r11
            r29 = r18
            boolean r7 = d(r24, r25, r26, r27, r29)
            if (r7 == 0) goto L55e
            r0.c(r2, r10)
        L55e:
            if (r5 != r6) goto L586
        L560:
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r1) goto L56f
            r0.l = r4
            r0.k = r3
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4 = 2147483647(0x7fffffff, float:NaN)
        L56f:
            int r3 = r3 + 1
            int r5 = r0.i
            r0.i = r6
            int r6 = 51 - r6
            if (r5 != r6) goto L57a
            return r3
        L57a:
            e.e r1 = r0.f1528c     // Catch: java.io.IOException -> L585
            char r1 = r1.k()     // Catch: java.io.IOException -> L585
            r0.f1531f = r1     // Catch: java.io.IOException -> L585
            r1 = 1
            goto L16
        L585:
            return r3
        L586:
            r15 = 4
            goto L4da
    }

    private int j0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 4
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L17:
            r0 = 6
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L145
            char r3 = r3.k()     // Catch: java.io.IOException -> L145
            r9.f1531f = r3     // Catch: java.io.IOException -> L145
            r4 = 65
            if (r3 == r4) goto L13b
            r4 = 69
            if (r3 == r4) goto L120
            r4 = 76
            if (r3 == r4) goto L105
            r4 = 97
            if (r3 == r4) goto Lfb
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto Le3
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto Ld9
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 == r4) goto Lcf
            r4 = 114(0x72, float:1.6E-43)
            if (r3 == r4) goto Lc5
            r4 = 79
            if (r3 == r4) goto Lb8
            r4 = 80
            if (r3 == r4) goto L7d
            r4 = 84
            if (r3 == r4) goto L5b
            r0 = 85
            if (r3 == r0) goto L51
            goto Lad
        L51:
            r3 = 5120(0x1400, double:2.5296E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.n0(r1, r3, r5, r7)
            return r0
        L5b:
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L6c
            r1 = 32
            int r0 = r11.G0(r0, r1)
            return r0
        L6c:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lad
            r1 = 40
            int r0 = r11.G0(r0, r1)
            return r0
        L7d:
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L8e
            r1 = 36
            int r0 = r11.G0(r0, r1)
            return r0
        L8e:
            r3 = 137438953472(0x2000000000, double:6.7903865311E-313)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L9f
            r1 = 37
            int r0 = r11.G0(r0, r1)
            return r0
        L9f:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lad
            r1 = 54
            int r0 = r11.G0(r0, r1)
            return r0
        Lad:
            r0 = 5
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.D0(r13, r14, r16)
            return r0
        Lb8:
            r3 = 549755814016(0x8000000080, double:2.71615461307E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.n0(r1, r3, r5, r7)
            return r0
        Lc5:
            r3 = 0
            r7 = 6
            r0 = r11
            int r0 = r0.n0(r1, r3, r5, r7)
            return r0
        Lcf:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.n0(r1, r3, r5, r7)
            return r0
        Ld9:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.n0(r1, r3, r5, r7)
            return r0
        Le3:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf1
            r1 = 62
            int r0 = r11.G0(r0, r1)
            return r0
        Lf1:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.n0(r1, r3, r5, r7)
            return r0
        Lfb:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.n0(r1, r3, r5, r7)
            return r0
        L105:
            r3 = 256(0x100, double:1.265E-321)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L113
            r1 = 8
            int r0 = r11.G0(r0, r1)
            return r0
        L113:
            r3 = 292057827328(0x440000c800, double:1.44295739082E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.n0(r1, r3, r5, r7)
            return r0
        L120:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L131
            r1 = 41
            int r0 = r11.G0(r0, r1)
            return r0
        L131:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.n0(r1, r3, r5, r7)
            return r0
        L13b:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.n0(r1, r3, r5, r7)
            return r0
        L145:
            r3 = 5
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.I0(r13, r14, r16)
            return r0
    }

    private int k(int r31, int r32) {
            r30 = this;
            r0 = r30
            r1 = 51
            r0.i = r1
            int[] r2 = r0.f1530e
            r3 = 0
            r2[r3] = r31
            r2 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r4 = r32
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 1
            r7 = 0
        L16:
            int r8 = r0.j
            int r8 = r8 + r2
            r0.j = r8
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r8 != r9) goto L23
            r30.a()
        L23:
            char r8 = r0.f1531f
            r9 = 64
            r13 = 46
            r11 = 44
            r14 = 2
            r10 = 4
            r17 = 0
            if (r8 >= r9) goto L385
            r19 = 1
            long r19 = r19 << r8
        L35:
            int[] r8 = r0.f1530e
            int r6 = r6 + (-1)
            r9 = r8[r6]
            r21 = 4294971904(0x100001200, double:2.1219980676E-314)
            r15 = 79
            r1 = 59
            r12 = 84
            r26 = 287948901175001088(0x3ff000000000000, double:1.988135013128901E-289)
            switch(r9) {
                case 0: goto L36d;
                case 1: goto L361;
                case 2: goto L35a;
                case 3: goto L34c;
                case 4: goto L335;
                case 5: goto L324;
                case 6: goto L281;
                case 7: goto L4b;
                case 8: goto L267;
                case 9: goto L4b;
                case 10: goto L24d;
                case 11: goto L23b;
                case 12: goto L4b;
                case 13: goto L221;
                case 14: goto L215;
                case 15: goto L4b;
                case 16: goto L20f;
                case 17: goto L204;
                case 18: goto L1f9;
                case 19: goto L1ee;
                case 20: goto L4b;
                case 21: goto L1e5;
                case 22: goto L1da;
                case 23: goto L1ca;
                case 24: goto L1bb;
                case 25: goto L1b3;
                case 26: goto L1a1;
                case 27: goto L4b;
                case 28: goto L195;
                case 29: goto L185;
                case 30: goto L175;
                case 31: goto L16a;
                case 32: goto L15b;
                case 33: goto L14a;
                case 34: goto L4b;
                case 35: goto L13e;
                case 36: goto L12e;
                case 37: goto L119;
                case 38: goto L4b;
                case 39: goto L10d;
                case 40: goto Lfd;
                case 41: goto Lf0;
                case 42: goto Le8;
                case 43: goto Ldf;
                case 44: goto Ld2;
                case 45: goto Lc5;
                case 46: goto L4b;
                case 47: goto Laf;
                case 48: goto L97;
                case 49: goto L84;
                case 50: goto L73;
                case 51: goto L4c;
                default: goto L4b;
            }
        L4b:
            goto L6f
        L4c:
            long r8 = r19 & r21
            int r12 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r12 == 0) goto L56
            r0.g(r2, r14)
            goto L5d
        L56:
            char r8 = r0.f1531f
            if (r8 != r1) goto L5d
            r0.f(r3, r14)
        L5d:
            if (r12 == 0) goto L65
        L5f:
            r1 = 42
            r8 = 43
            goto L129
        L65:
            char r8 = r0.f1531f
            if (r8 != r1) goto L6f
            if (r5 <= r10) goto L6c
        L6b:
            r5 = 4
        L6c:
            r0.e(r11)
        L6f:
            r12 = 51
            goto L37d
        L73:
            long r8 = r19 & r26
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 != 0) goto L7a
            goto L4b
        L7a:
            if (r5 <= r15) goto L7e
            r5 = 79
        L7e:
            r1 = 50
        L80:
            r0.e(r1)
            goto L6f
        L84:
            long r8 = r19 & r26
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 != 0) goto L8b
            goto L4b
        L8b:
            if (r5 <= r15) goto L8f
            r5 = 79
        L8f:
            r1 = 38
            r8 = 42
        L93:
            r0.f(r1, r8)
            goto L6f
        L97:
            long r21 = r19 & r26
            int r1 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r1 != 0) goto L9e
            goto L4b
        L9e:
            r1 = 77
            if (r5 <= r1) goto La4
            r5 = 77
        La4:
            int r1 = r0.i
            int r9 = r1 + 1
            r0.i = r9
            r9 = 48
            r8[r1] = r9
            goto L6f
        Laf:
            long r21 = r19 & r26
            int r9 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r9 != 0) goto Lb6
            goto L4b
        Lb6:
            if (r5 <= r1) goto Lba
            r5 = 59
        Lba:
            int r1 = r0.i
            int r9 = r1 + 1
            r0.i = r9
            r9 = 47
            r8[r1] = r9
            goto L6f
        Lc5:
            char r8 = r0.f1531f
            if (r8 == r1) goto Lca
            goto L4b
        Lca:
            if (r5 <= r10) goto Lcd
            r5 = 4
        Lcd:
            r1 = 47
            r8 = 50
            goto L93
        Ld2:
            r8 = -9217(0xffffffffffffdbff, double:NaN)
            long r8 = r19 & r8
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 != 0) goto Ldc
            goto L4b
        Ldc:
            if (r5 <= r10) goto L6c
            goto L6b
        Ldf:
            char r8 = r0.f1531f
            if (r8 == r1) goto Le5
            goto L4b
        Le5:
            if (r5 <= r10) goto L6c
            goto L6b
        Le8:
            long r8 = r19 & r21
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L6f
            goto L5f
        Lf0:
            long r8 = r19 & r21
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L6f
            r1 = 43
            r0.f(r1, r13)
            goto L6f
        Lfd:
            long r8 = r19 & r26
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 != 0) goto L105
            goto L4b
        L105:
            if (r5 <= r12) goto L109
            r5 = 84
        L109:
            r1 = 40
            goto L80
        L10d:
            r8 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r8 = r19 & r8
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L6f
            goto L109
        L119:
            long r8 = r19 & r26
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 != 0) goto L121
            goto L4b
        L121:
            if (r5 <= r12) goto L125
            r5 = 84
        L125:
            r1 = 37
            r8 = 38
        L129:
            r0.g(r1, r8)
            goto L6f
        L12e:
            long r8 = r19 & r26
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 != 0) goto L136
            goto L4b
        L136:
            if (r5 <= r12) goto L13a
            r5 = 84
        L13a:
            r1 = 36
            goto L80
        L13e:
            r8 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r8 = r19 & r8
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L6f
            goto L13a
        L14a:
            long r8 = r19 & r26
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 != 0) goto L152
            goto L4b
        L152:
            if (r5 <= r12) goto L156
            r5 = 84
        L156:
            r1 = 33
            r8 = 34
            goto L129
        L15b:
            r8 = 34
            char r1 = r0.f1531f
            if (r1 == r13) goto L163
            goto L4b
        L163:
            if (r5 <= r12) goto L167
            r5 = 84
        L167:
            r1 = 33
            goto L129
        L16a:
            long r8 = r19 & r26
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L6f
            r1 = 31
            r8 = 32
            goto L129
        L175:
            long r8 = r19 & r26
            int r15 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r15 != 0) goto L17d
            goto L4b
        L17d:
            if (r5 <= r12) goto L181
            r5 = 84
        L181:
            r8 = 62
            goto L93
        L185:
            long r8 = r19 & r26
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 != 0) goto L18d
            goto L4b
        L18d:
            if (r5 <= r12) goto L191
            r5 = 84
        L191:
            r1 = 29
            goto L80
        L195:
            r8 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r8 = r19 & r8
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L6f
            goto L191
        L1a1:
            long r8 = r19 & r26
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 != 0) goto L1a9
            goto L4b
        L1a9:
            if (r5 <= r12) goto L1ad
            r5 = 84
        L1ad:
            r1 = 26
            r8 = 27
            goto L129
        L1b3:
            char r1 = r0.f1531f
            if (r1 != r13) goto L6f
            r1 = 26
            goto L80
        L1bb:
            char r1 = r0.f1531f
            r8 = 45
            if (r1 != r8) goto L6f
            r1 = 52
            r8 = 51
            r0.c(r8, r1)
            goto L6f
        L1ca:
            char r1 = r0.f1531f
            r8 = 39
            if (r1 != r8) goto L6f
            r1 = 81
            if (r5 <= r1) goto L6f
        L1d4:
            r1 = 81
            r5 = 81
            goto L6f
        L1da:
            r8 = -549755813889(0xffffff7fffffffff, double:NaN)
            long r8 = r19 & r8
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L6f
        L1e5:
            r1 = 55
            r8 = 53
        L1e9:
            r0.f(r8, r1)
            goto L6f
        L1ee:
            r1 = 55
            r8 = 53
            char r9 = r0.f1531f
            r12 = 39
            if (r9 != r12) goto L6f
            goto L1e9
        L1f9:
            char r1 = r0.f1531f
            r8 = 34
            if (r1 != r8) goto L6f
            r1 = 81
            if (r5 <= r1) goto L6f
            goto L1d4
        L204:
            r8 = -17179869185(0xfffffffbffffffff, double:NaN)
            long r8 = r19 & r8
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L6f
        L20f:
            r1 = 56
            r8 = 58
            goto L93
        L215:
            r1 = 56
            r8 = 58
            char r9 = r0.f1531f
            r12 = 34
            if (r9 != r12) goto L6f
            goto L93
        L221:
            long r21 = r19 & r26
            int r1 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r1 != 0) goto L229
            goto L4b
        L229:
            r1 = 80
            if (r5 <= r1) goto L22f
            r5 = 80
        L22f:
            int r1 = r0.i
            int r9 = r1 + 1
            r0.i = r9
            r9 = 13
            r8[r1] = r9
            goto L6f
        L23b:
            char r1 = r0.f1531f
            r9 = 48
            if (r1 != r9) goto L6f
            int r1 = r0.i
            int r9 = r1 + 1
            r0.i = r9
            r9 = 12
            r8[r1] = r9
            goto L6f
        L24d:
            long r21 = r19 & r26
            int r1 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r1 != 0) goto L255
            goto L4b
        L255:
            r1 = 78
            if (r5 <= r1) goto L25b
            r5 = 78
        L25b:
            int r1 = r0.i
            int r9 = r1 + 1
            r0.i = r9
            r9 = 10
            r8[r1] = r9
            goto L6f
        L267:
            long r21 = r19 & r26
            int r1 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r1 != 0) goto L26f
            goto L4b
        L26f:
            r1 = 76
            if (r5 <= r1) goto L275
            r5 = 76
        L275:
            int r1 = r0.i
            int r9 = r1 + 1
            r0.i = r9
            r9 = 8
            r8[r1] = r9
            goto L6f
        L281:
            long r26 = r19 & r26
            int r9 = (r26 > r17 ? 1 : (r26 == r17 ? 0 : -1))
            if (r9 == 0) goto L296
            if (r5 <= r15) goto L28b
            r5 = 79
        L28b:
            r1 = 38
            r8 = 42
        L28f:
            r0.f(r1, r8)
        L292:
            r12 = 51
            goto L2ff
        L296:
            long r21 = r19 & r21
            int r9 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r9 == 0) goto L2a2
            r1 = 43
            r0.f(r1, r13)
            goto L292
        L2a2:
            r21 = 9216(0x2400, double:4.5533E-320)
            long r21 = r19 & r21
            int r9 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r9 == 0) goto L2b8
            r9 = 74
            if (r5 <= r9) goto L2b0
            r5 = 74
        L2b0:
            r1 = 15
            r8 = 12
            r0.f(r8, r1)
            goto L292
        L2b8:
            char r9 = r0.f1531f
            if (r9 != r1) goto L2c4
            if (r5 <= r10) goto L2bf
            r5 = 4
        L2bf:
            r1 = 47
            r8 = 50
            goto L28f
        L2c4:
            if (r9 != r13) goto L2cc
            r1 = 26
            r0.e(r1)
            goto L292
        L2cc:
            r1 = 45
            if (r9 != r1) goto L2d8
            r1 = 52
            r12 = 51
            r0.c(r12, r1)
            goto L2ff
        L2d8:
            r12 = 51
            r1 = 39
            if (r9 != r1) goto L2e6
            r1 = 55
            r15 = 53
            r0.f(r15, r1)
            goto L2ff
        L2e6:
            r1 = 34
            if (r9 != r1) goto L2f2
            r1 = 56
            r15 = 58
            r0.f(r1, r15)
            goto L2ff
        L2f2:
            r15 = 58
            if (r9 != r15) goto L2ff
            int r1 = r0.i
            int r9 = r1 + 1
            r0.i = r9
            r9 = 7
            r8[r1] = r9
        L2ff:
            char r1 = r0.f1531f
            r8 = 48
            if (r1 != r8) goto L315
            int[] r1 = r0.f1530e
            int r8 = r0.i
            int r9 = r8 + 1
            r0.i = r9
            r9 = 12
            r1[r8] = r9
            r9 = 13
            goto L37d
        L315:
            r9 = 13
            if (r1 != r9) goto L37d
            int[] r1 = r0.f1530e
            int r8 = r0.i
            int r15 = r8 + 1
            r0.i = r15
            r1[r8] = r10
            goto L37d
        L324:
            r9 = 13
            r12 = 51
            char r1 = r0.f1531f
            if (r1 != r9) goto L37d
            int r1 = r0.i
            int r9 = r1 + 1
            r0.i = r9
            r8[r1] = r10
            goto L37d
        L335:
            r12 = 51
            char r1 = r0.f1531f
            r8 = 10
            if (r1 == r8) goto L33e
            goto L37d
        L33e:
            r1 = 74
            if (r5 <= r1) goto L344
        L342:
            r5 = 74
        L344:
            r1 = 15
            r8 = 12
            r0.f(r8, r1)
            goto L37d
        L34c:
            r12 = 51
            r8 = -9217(0xffffffffffffdbff, double:NaN)
            long r8 = r19 & r8
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L37d
        L356:
            r0.f(r3, r14)
            goto L37d
        L35a:
            r12 = 51
            char r8 = r0.f1531f
            if (r8 != r1) goto L37d
            goto L356
        L361:
            r12 = 51
            long r8 = r19 & r21
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L37d
            r0.g(r2, r14)
            goto L37d
        L36d:
            r12 = 51
            r8 = 9216(0x2400, double:4.5533E-320)
            long r8 = r19 & r8
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 != 0) goto L378
            goto L37d
        L378:
            r1 = 74
            if (r5 <= r1) goto L344
            goto L342
        L37d:
            if (r6 != r7) goto L381
            goto L57e
        L381:
            r1 = 51
            goto L35
        L385:
            r12 = 51
            r1 = 128(0x80, float:1.8E-43)
            if (r8 >= r1) goto L4d7
            r1 = r8 & 63
            r8 = 1
            long r19 = r8 << r1
        L391:
            int[] r1 = r0.f1530e
            int r6 = r6 + (-1)
            r8 = r1[r6]
            r9 = 3
            if (r8 == r9) goto L4c9
            r9 = 27
            if (r8 == r9) goto L4b5
            r9 = 34
            if (r8 == r9) goto L4a3
            r15 = 38
            if (r8 == r15) goto L48e
            if (r8 == r11) goto L480
            r15 = 63
            if (r8 == r13) goto L472
            r2 = 12
            if (r8 == r2) goto L464
            r2 = 13
            if (r8 == r2) goto L44a
            switch(r8) {
                case 6: goto L42f;
                case 7: goto L414;
                case 8: goto L414;
                case 9: goto L403;
                default: goto L3b7;
            }
        L3b7:
            switch(r8) {
                case 15: goto L3f2;
                case 16: goto L3ea;
                case 17: goto L3e1;
                default: goto L3ba;
            }
        L3ba:
            switch(r8) {
                case 20: goto L3d0;
                case 21: goto L3c8;
                case 22: goto L3bf;
                default: goto L3bd;
            }
        L3bd:
            goto L42b
        L3bf:
            r1 = -268435457(0xffffffffefffffff, double:NaN)
            long r1 = r19 & r1
            int r8 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r8 == 0) goto L42b
        L3c8:
            r1 = 55
            r2 = 53
            r0.f(r2, r1)
            goto L42b
        L3d0:
            char r2 = r0.f1531f
            r8 = 92
            if (r2 != r8) goto L42b
            int r2 = r0.i
            int r8 = r2 + 1
            r0.i = r8
            r8 = 21
            r1[r2] = r8
            goto L42b
        L3e1:
            r1 = -268435457(0xffffffffefffffff, double:NaN)
            long r1 = r19 & r1
            int r8 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r8 == 0) goto L42b
        L3ea:
            r1 = 56
            r2 = 58
            r0.f(r1, r2)
            goto L42b
        L3f2:
            char r2 = r0.f1531f
            r8 = 92
            if (r2 != r8) goto L42b
            int r2 = r0.i
            int r8 = r2 + 1
            r0.i = r8
            r8 = 16
            r1[r2] = r8
            goto L42b
        L403:
            char r2 = r0.f1531f
            r8 = 117(0x75, float:1.64E-43)
            if (r2 != r8) goto L42b
            int r2 = r0.i
            int r8 = r2 + 1
            r0.i = r8
            r8 = 10
            r1[r2] = r8
            goto L42b
        L414:
            r1 = 576460745995190270(0x7fffffe87fffffe, double:3.7857643443544387E-270)
            long r1 = r19 & r1
            int r8 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r8 != 0) goto L420
            goto L3bd
        L420:
            r1 = 76
            if (r5 <= r1) goto L426
            r5 = 76
        L426:
            r1 = 8
            r0.e(r1)
        L42b:
            r2 = 13
            goto L4d0
        L42f:
            char r2 = r0.f1531f
            r8 = 118(0x76, float:1.65E-43)
            if (r2 != r8) goto L43b
            r1 = 64
            r0.c(r15, r1)
            goto L42b
        L43b:
            r8 = 117(0x75, float:1.64E-43)
            if (r2 != r8) goto L42b
            int r2 = r0.i
            int r8 = r2 + 1
            r0.i = r8
            r8 = 10
            r1[r2] = r8
            goto L42b
        L44a:
            r1 = 541165879422(0x7e0000007e, double:2.67371469724E-312)
            long r1 = r19 & r1
            int r8 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r8 != 0) goto L457
            goto L3bd
        L457:
            r1 = 80
            if (r5 <= r1) goto L45d
            r5 = 80
        L45d:
            r2 = 13
        L45f:
            r0.e(r2)
            goto L4d0
        L464:
            r2 = 13
            r23 = 72057594054705152(0x100000001000000, double:7.291122046717944E-304)
            long r23 = r19 & r23
            int r1 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r1 == 0) goto L4d0
            goto L45f
        L472:
            r2 = 13
            char r1 = r0.f1531f
            r8 = 118(0x76, float:1.65E-43)
            if (r1 != r8) goto L4d0
            r1 = 64
            r0.c(r15, r1)
            goto L4d0
        L480:
            r2 = 13
            if (r5 <= r10) goto L485
            r5 = 4
        L485:
            int r8 = r0.i
            int r15 = r8 + 1
            r0.i = r15
            r1[r8] = r11
            goto L4d0
        L48e:
            r2 = 13
            r23 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r23 = r19 & r23
            int r1 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r1 == 0) goto L4d0
            r1 = 69
            r8 = 70
        L49f:
            r0.c(r1, r8)
            goto L4d0
        L4a3:
            r2 = 13
            r23 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r23 = r19 & r23
            int r1 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r1 == 0) goto L4d0
            r1 = 67
            r8 = 68
            goto L49f
        L4b5:
            r2 = 13
            r9 = 34
            r23 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r23 = r19 & r23
            int r1 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r1 == 0) goto L4d0
            r1 = 65
            r8 = 66
            goto L49f
        L4c9:
            r2 = 13
            r9 = 34
            r0.c(r3, r14)
        L4d0:
            if (r6 != r7) goto L4d4
            goto L57e
        L4d4:
            r2 = 1
            goto L391
        L4d7:
            int r1 = r8 >> 8
            int r2 = r8 >> 14
            r9 = r1 & 63
            r17 = 1
            long r17 = r17 << r9
            r9 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 6
            r8 = r8 & 63
            r19 = 1
            long r19 = r19 << r8
        L4eb:
            int[] r8 = r0.f1530e
            int r6 = r6 + (-1)
            r8 = r8[r6]
            r13 = 3
            if (r8 == r13) goto L565
            if (r8 == r11) goto L540
            r13 = 16
            if (r8 == r13) goto L524
            r13 = 17
            if (r8 == r13) goto L524
            r13 = 21
            if (r8 == r13) goto L50c
            r13 = 22
            if (r8 == r13) goto L50c
        L506:
            r13 = 53
        L508:
            r15 = 56
            goto L57c
        L50c:
            r23 = r1
            r24 = r2
            r25 = r9
            r26 = r17
            r28 = r19
            boolean r8 = d(r23, r24, r25, r26, r28)
            if (r8 == 0) goto L506
            r8 = 55
            r13 = 53
            r0.f(r13, r8)
            goto L508
        L524:
            r8 = 55
            r13 = 53
            r23 = r1
            r24 = r2
            r25 = r9
            r26 = r17
            r28 = r19
            boolean r15 = d(r23, r24, r25, r26, r28)
            if (r15 == 0) goto L508
            r8 = 58
            r15 = 56
            r0.f(r15, r8)
            goto L57c
        L540:
            r8 = 58
            r13 = 53
            r15 = 56
            r23 = r1
            r24 = r2
            r25 = r9
            r26 = r17
            r28 = r19
            boolean r16 = d(r23, r24, r25, r26, r28)
            if (r16 != 0) goto L557
            goto L57c
        L557:
            if (r5 <= r10) goto L55a
            r5 = 4
        L55a:
            int[] r8 = r0.f1530e
            int r10 = r0.i
            int r12 = r10 + 1
            r0.i = r12
            r8[r10] = r11
            goto L57c
        L565:
            r13 = 53
            r15 = 56
            r23 = r1
            r24 = r2
            r25 = r9
            r26 = r17
            r28 = r19
            boolean r8 = d(r23, r24, r25, r26, r28)
            if (r8 == 0) goto L57c
            r0.c(r3, r14)
        L57c:
            if (r6 != r7) goto L5a6
        L57e:
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r1) goto L58d
            r0.l = r5
            r0.k = r4
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L58d:
            int r4 = r4 + 1
            int r6 = r0.i
            r0.i = r7
            int r7 = 51 - r7
            if (r6 != r7) goto L598
            return r4
        L598:
            e.e r1 = r0.f1528c     // Catch: java.io.IOException -> L5a5
            char r1 = r1.k()     // Catch: java.io.IOException -> L5a5
            r0.f1531f = r1     // Catch: java.io.IOException -> L5a5
            r1 = 51
            r2 = 1
            goto L16
        L5a5:
            return r4
        L5a6:
            r10 = 4
            r12 = 51
            goto L4eb
    }

    private int k0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 4
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L17:
            r0 = 6
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L145
            char r3 = r3.k()     // Catch: java.io.IOException -> L145
            r9.f1531f = r3     // Catch: java.io.IOException -> L145
            r4 = 65
            if (r3 == r4) goto L13b
            r4 = 69
            if (r3 == r4) goto L120
            r4 = 76
            if (r3 == r4) goto L105
            r4 = 97
            if (r3 == r4) goto Lfb
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto Le3
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto Ld9
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 == r4) goto Lcf
            r4 = 114(0x72, float:1.6E-43)
            if (r3 == r4) goto Lc5
            r4 = 79
            if (r3 == r4) goto Lb8
            r4 = 80
            if (r3 == r4) goto L7d
            r4 = 84
            if (r3 == r4) goto L5b
            r0 = 85
            if (r3 == r0) goto L51
            goto Lad
        L51:
            r3 = 5120(0x1400, double:2.5296E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.o0(r1, r3, r5, r7)
            return r0
        L5b:
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L6c
            r1 = 32
            int r0 = r11.G0(r0, r1)
            return r0
        L6c:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lad
            r1 = 40
            int r0 = r11.G0(r0, r1)
            return r0
        L7d:
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L8e
            r1 = 36
            int r0 = r11.G0(r0, r1)
            return r0
        L8e:
            r3 = 137438953472(0x2000000000, double:6.7903865311E-313)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L9f
            r1 = 37
            int r0 = r11.G0(r0, r1)
            return r0
        L9f:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lad
            r1 = 54
            int r0 = r11.G0(r0, r1)
            return r0
        Lad:
            r0 = 5
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.E0(r13, r14, r16)
            return r0
        Lb8:
            r3 = 549755814016(0x8000000080, double:2.71615461307E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.o0(r1, r3, r5, r7)
            return r0
        Lc5:
            r3 = 0
            r7 = 6
            r0 = r11
            int r0 = r0.o0(r1, r3, r5, r7)
            return r0
        Lcf:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.o0(r1, r3, r5, r7)
            return r0
        Ld9:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.o0(r1, r3, r5, r7)
            return r0
        Le3:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf1
            r1 = 62
            int r0 = r11.G0(r0, r1)
            return r0
        Lf1:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.o0(r1, r3, r5, r7)
            return r0
        Lfb:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.o0(r1, r3, r5, r7)
            return r0
        L105:
            r3 = 256(0x100, double:1.265E-321)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L113
            r1 = 8
            int r0 = r11.G0(r0, r1)
            return r0
        L113:
            r3 = 292057827328(0x440000c800, double:1.44295739082E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.o0(r1, r3, r5, r7)
            return r0
        L120:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L131
            r1 = 41
            int r0 = r11.G0(r0, r1)
            return r0
        L131:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.o0(r1, r3, r5, r7)
            return r0
        L13b:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.o0(r1, r3, r5, r7)
            return r0
        L145:
            r3 = 5
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.J0(r13, r14, r16)
            return r0
    }

    private int l(int r30, int r31) {
            r29 = this;
            r0 = r29
            r1 = 50
            r0.i = r1
            int[] r1 = r0.f1530e
            r2 = 0
            r1[r2] = r30
            r1 = 1
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = r31
            r5 = 1
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
        L16:
            int r8 = r0.j
            int r8 = r8 + r1
            r0.j = r8
            if (r8 != r3) goto L20
            r29.a()
        L20:
            char r8 = r0.f1531f
            r9 = 64
            r10 = 1
            r3 = 2
            r14 = 46
            r15 = 4
            r18 = 0
            if (r8 >= r9) goto L354
            long r20 = r10 << r8
        L30:
            int[] r8 = r0.f1530e
            int r5 = r5 + (-1)
            r9 = r8[r5]
            r10 = 4294971904(0x100001200, double:2.1219980676E-314)
            r13 = 59
            r22 = 287948901175001088(0x3ff000000000000, double:1.988135013128901E-289)
            r12 = 84
            switch(r9) {
                case 0: goto L33c;
                case 1: goto L332;
                case 2: goto L32d;
                case 3: goto L321;
                case 4: goto L30e;
                case 5: goto L2ff;
                case 6: goto L264;
                case 7: goto L44;
                case 8: goto L24a;
                case 9: goto L44;
                case 10: goto L230;
                case 11: goto L44;
                case 12: goto L216;
                case 13: goto L204;
                case 14: goto L44;
                case 15: goto L1ea;
                case 16: goto L1de;
                case 17: goto L44;
                case 18: goto L1d8;
                case 19: goto L1cd;
                case 20: goto L1c2;
                case 21: goto L1b6;
                case 22: goto L44;
                case 23: goto L1b0;
                case 24: goto L1a5;
                case 25: goto L197;
                case 26: goto L188;
                case 27: goto L180;
                case 28: goto L16e;
                case 29: goto L44;
                case 30: goto L162;
                case 31: goto L152;
                case 32: goto L140;
                case 33: goto L135;
                case 34: goto L12c;
                case 35: goto L11b;
                case 36: goto L44;
                case 37: goto L10f;
                case 38: goto Lff;
                case 39: goto Lea;
                case 40: goto L44;
                case 41: goto Lde;
                case 42: goto Lcf;
                case 43: goto Lc0;
                case 44: goto Lb9;
                case 45: goto Lb0;
                case 46: goto La3;
                case 47: goto L95;
                case 48: goto L80;
                case 49: goto L6b;
                case 50: goto L46;
                default: goto L44;
            }
        L44:
            goto L34c
        L46:
            long r8 = r20 & r10
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L50
            r0.g(r1, r3)
            goto L57
        L50:
            char r8 = r0.f1531f
            if (r8 != r13) goto L57
            r0.f(r2, r3)
        L57:
            if (r10 == 0) goto L5f
        L59:
            r8 = 44
            r9 = 45
            goto Lfa
        L5f:
            char r8 = r0.f1531f
            if (r8 != r13) goto L34c
            if (r6 <= r15) goto L66
        L65:
            r6 = 4
        L66:
            r0.e(r14)
            goto L34c
        L6b:
            long r8 = r20 & r22
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto L73
            goto L34c
        L73:
            r8 = 79
            if (r6 <= r8) goto L79
            r6 = 79
        L79:
            r8 = 49
        L7b:
            r0.e(r8)
            goto L34c
        L80:
            r8 = 79
            long r9 = r20 & r22
            int r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r11 != 0) goto L8a
            goto L34c
        L8a:
            if (r6 <= r8) goto L8e
            r6 = 79
        L8e:
            r8 = 3
            r9 = 7
        L90:
            r0.f(r8, r9)
            goto L34c
        L95:
            char r8 = r0.f1531f
            if (r8 == r13) goto L9b
            goto L34c
        L9b:
            if (r6 <= r15) goto L9e
            r6 = 4
        L9e:
            r8 = 16
            r9 = 19
            goto L90
        La3:
            r8 = -9217(0xffffffffffffdbff, double:NaN)
            long r8 = r20 & r8
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto Lad
            goto L34c
        Lad:
            if (r6 <= r15) goto L66
            goto L65
        Lb0:
            char r8 = r0.f1531f
            if (r8 == r13) goto Lb6
            goto L34c
        Lb6:
            if (r6 <= r15) goto L66
            goto L65
        Lb9:
            long r8 = r20 & r10
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L34c
            goto L59
        Lc0:
            long r8 = r20 & r10
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L34c
            r8 = 11
            r9 = 8
        Lca:
            r0.f(r9, r8)
            goto L34c
        Lcf:
            long r8 = r20 & r22
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto Ld7
            goto L34c
        Ld7:
            if (r6 <= r12) goto Ldb
            r6 = 84
        Ldb:
            r8 = 42
            goto L7b
        Lde:
            r8 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r8 = r20 & r8
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L34c
            goto Ldb
        Lea:
            long r8 = r20 & r22
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto Lf2
            goto L34c
        Lf2:
            if (r6 <= r12) goto Lf6
            r6 = 84
        Lf6:
            r8 = 39
            r9 = 40
        Lfa:
            r0.g(r8, r9)
            goto L34c
        Lff:
            long r8 = r20 & r22
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto L107
            goto L34c
        L107:
            if (r6 <= r12) goto L10b
            r6 = 84
        L10b:
            r8 = 38
            goto L7b
        L10f:
            r8 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r8 = r20 & r8
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L34c
            goto L10b
        L11b:
            long r8 = r20 & r22
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto L123
            goto L34c
        L123:
            if (r6 <= r12) goto L127
        L125:
            r6 = 84
        L127:
            r8 = 35
            r9 = 36
            goto Lfa
        L12c:
            char r8 = r0.f1531f
            if (r8 == r14) goto L132
            goto L34c
        L132:
            if (r6 <= r12) goto L127
            goto L125
        L135:
            long r8 = r20 & r22
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L34c
            r8 = 33
            r9 = 34
            goto Lfa
        L140:
            long r8 = r20 & r22
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto L148
            goto L34c
        L148:
            if (r6 <= r12) goto L14c
            r6 = 84
        L14c:
            r8 = 28
            r9 = 31
            goto L90
        L152:
            long r8 = r20 & r22
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto L15a
            goto L34c
        L15a:
            if (r6 <= r12) goto L15e
            r6 = 84
        L15e:
            r8 = 31
            goto L7b
        L162:
            r8 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r8 = r20 & r8
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L34c
            goto L15e
        L16e:
            long r8 = r20 & r22
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto L176
            goto L34c
        L176:
            if (r6 <= r12) goto L17a
            r6 = 84
        L17a:
            r8 = 28
            r9 = 29
            goto Lfa
        L180:
            char r8 = r0.f1531f
            if (r8 != r14) goto L34c
            r8 = 28
            goto L7b
        L188:
            char r8 = r0.f1531f
            r9 = 45
            if (r8 != r9) goto L34c
            r8 = 20
            r9 = 21
            r0.c(r8, r9)
            goto L34c
        L197:
            char r8 = r0.f1531f
            r9 = 39
            if (r8 != r9) goto L34c
            r8 = 81
            if (r6 <= r8) goto L34c
        L1a1:
            r6 = 81
            goto L34c
        L1a5:
            r8 = -549755813889(0xffffff7fffffffff, double:NaN)
            long r8 = r20 & r8
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L34c
        L1b0:
            r8 = 22
            r9 = 24
            goto L90
        L1b6:
            r8 = 22
            r9 = 24
            char r10 = r0.f1531f
            r11 = 39
            if (r10 != r11) goto L34c
            goto L90
        L1c2:
            char r8 = r0.f1531f
            r9 = 34
            if (r8 != r9) goto L34c
            r8 = 81
            if (r6 <= r8) goto L34c
            goto L1a1
        L1cd:
            r8 = -17179869185(0xfffffffbffffffff, double:NaN)
            long r8 = r20 & r8
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L34c
        L1d8:
            r8 = 27
            r9 = 25
            goto Lca
        L1de:
            r8 = 27
            r9 = 25
            char r10 = r0.f1531f
            r11 = 34
            if (r10 != r11) goto L34c
            goto Lca
        L1ea:
            long r9 = r20 & r22
            int r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r11 != 0) goto L1f2
            goto L34c
        L1f2:
            r9 = 80
            if (r6 <= r9) goto L1f8
            r6 = 80
        L1f8:
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r10 = 15
            r8[r9] = r10
            goto L34c
        L204:
            char r9 = r0.f1531f
            r10 = 48
            if (r9 != r10) goto L34c
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r10 = 14
            r8[r9] = r10
            goto L34c
        L216:
            long r9 = r20 & r22
            int r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r11 != 0) goto L21e
            goto L34c
        L21e:
            r9 = 78
            if (r6 <= r9) goto L224
            r6 = 78
        L224:
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r10 = 12
            r8[r9] = r10
            goto L34c
        L230:
            long r9 = r20 & r22
            int r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r11 != 0) goto L238
            goto L34c
        L238:
            r9 = 77
            if (r6 <= r9) goto L23e
            r6 = 77
        L23e:
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r10 = 10
            r8[r9] = r10
            goto L34c
        L24a:
            long r9 = r20 & r22
            int r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r11 != 0) goto L252
            goto L34c
        L252:
            r9 = 76
            if (r6 <= r9) goto L258
            r6 = 76
        L258:
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r10 = 8
            r8[r9] = r10
            goto L34c
        L264:
            long r22 = r20 & r22
            int r9 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r9 == 0) goto L277
            r9 = 79
            if (r6 <= r9) goto L270
            r6 = 79
        L270:
            r8 = 3
            r9 = 7
        L272:
            r0.f(r8, r9)
            goto L2dd
        L277:
            long r9 = r20 & r10
            int r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r11 == 0) goto L285
            r8 = 11
            r9 = 8
            r0.f(r9, r8)
            goto L2dd
        L285:
            r9 = 9216(0x2400, double:4.5533E-320)
            long r9 = r20 & r9
            int r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r11 == 0) goto L298
            r9 = 74
            if (r6 <= r9) goto L293
            r6 = 74
        L293:
            r8 = 12
            r9 = 15
            goto L272
        L298:
            char r9 = r0.f1531f
            if (r9 != r13) goto L2a4
            if (r6 <= r15) goto L29f
            r6 = 4
        L29f:
            r8 = 16
            r9 = 19
            goto L272
        L2a4:
            if (r9 != r14) goto L2ac
            r8 = 28
            r0.e(r8)
            goto L2dd
        L2ac:
            r10 = 45
            if (r9 != r10) goto L2b8
            r8 = 20
            r9 = 21
            r0.c(r8, r9)
            goto L2dd
        L2b8:
            r10 = 39
            if (r9 != r10) goto L2c4
            r10 = 22
            r11 = 24
            r0.f(r10, r11)
            goto L2dd
        L2c4:
            r10 = 34
            if (r9 != r10) goto L2d0
            r10 = 27
            r11 = 25
            r0.f(r11, r10)
            goto L2dd
        L2d0:
            r10 = 58
            if (r9 != r10) goto L2dd
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r10 = 7
            r8[r9] = r10
        L2dd:
            char r8 = r0.f1531f
            r9 = 48
            if (r8 != r9) goto L2f0
            int[] r8 = r0.f1530e
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r10 = 14
            r8[r9] = r10
            goto L34c
        L2f0:
            r9 = 13
            if (r8 != r9) goto L34c
            int[] r8 = r0.f1530e
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r8[r9] = r15
            goto L34c
        L2ff:
            char r9 = r0.f1531f
            r10 = 13
            if (r9 != r10) goto L34c
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r8[r9] = r15
            goto L34c
        L30e:
            char r8 = r0.f1531f
            r9 = 10
            if (r8 == r9) goto L315
            goto L34c
        L315:
            r8 = 74
            if (r6 <= r8) goto L31b
            r6 = 74
        L31b:
            r8 = 12
            r9 = 15
            goto L90
        L321:
            r8 = -9217(0xffffffffffffdbff, double:NaN)
            long r8 = r20 & r8
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L34c
        L329:
            r0.f(r2, r3)
            goto L34c
        L32d:
            char r8 = r0.f1531f
            if (r8 != r13) goto L34c
            goto L329
        L332:
            long r8 = r20 & r10
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L34c
            r0.g(r1, r3)
            goto L34c
        L33c:
            r8 = 9216(0x2400, double:4.5533E-320)
            long r8 = r20 & r8
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto L345
            goto L34c
        L345:
            r8 = 74
            if (r6 <= r8) goto L31b
            r6 = 74
            goto L31b
        L34c:
            if (r5 != r7) goto L30
        L34e:
            r3 = 0
        L34f:
            r15 = 2147483647(0x7fffffff, float:NaN)
            goto L565
        L354:
            r9 = 128(0x80, float:1.8E-43)
            if (r8 >= r9) goto L4cb
            r8 = r8 & 63
            long r12 = r10 << r8
        L35c:
            int[] r8 = r0.f1530e
            int r5 = r5 + (-1)
            r9 = r8[r5]
            r10 = 3
            if (r9 == r10) goto L4bb
            r10 = 11
            if (r9 == r10) goto L4a4
            r10 = 29
            if (r9 == r10) goto L48b
            r10 = 36
            if (r9 == r10) goto L46f
            r10 = 40
            if (r9 == r10) goto L458
            if (r9 == r14) goto L448
            r10 = 14
            if (r9 == r10) goto L438
            r10 = 15
            if (r9 == r10) goto L41c
            switch(r9) {
                case 6: goto L3fa;
                case 7: goto L3dc;
                case 8: goto L3dc;
                case 9: goto L3cb;
                default: goto L382;
            }
        L382:
            switch(r9) {
                case 17: goto L3ba;
                case 18: goto L3b2;
                case 19: goto L3aa;
                default: goto L385;
            }
        L385:
            switch(r9) {
                case 22: goto L399;
                case 23: goto L391;
                case 24: goto L389;
                default: goto L388;
            }
        L388:
            goto L3f2
        L389:
            r8 = -268435457(0xffffffffefffffff, double:NaN)
            long r8 = r8 & r12
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L3f2
        L391:
            r8 = 22
            r9 = 24
            r0.f(r8, r9)
            goto L3f2
        L399:
            char r9 = r0.f1531f
            r10 = 92
            if (r9 != r10) goto L3f2
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r10 = 23
            r8[r9] = r10
            goto L3f2
        L3aa:
            r8 = -268435457(0xffffffffefffffff, double:NaN)
            long r8 = r8 & r12
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L3f2
        L3b2:
            r8 = 27
            r9 = 25
            r0.f(r9, r8)
            goto L3f2
        L3ba:
            char r9 = r0.f1531f
            r10 = 92
            if (r9 != r10) goto L3f2
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r10 = 18
            r8[r9] = r10
            goto L3f2
        L3cb:
            char r9 = r0.f1531f
            r10 = 118(0x76, float:1.65E-43)
            if (r9 != r10) goto L3f2
            int r9 = r0.i
            int r10 = r9 + 1
            r0.i = r10
            r10 = 10
            r8[r9] = r10
            goto L3f2
        L3dc:
            r8 = 576460745995190270(0x7fffffe87fffffe, double:3.7857643443544387E-270)
            long r8 = r8 & r12
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto L3e7
            goto L388
        L3e7:
            r8 = 76
            if (r6 <= r8) goto L3ed
            r6 = 76
        L3ed:
            r9 = 8
            r0.e(r9)
        L3f2:
            r9 = 12
            r10 = 15
        L3f6:
            r11 = 34
            goto L4c4
        L3fa:
            r9 = 8
            char r10 = r0.f1531f
            r11 = 117(0x75, float:1.64E-43)
            if (r10 != r11) goto L40d
            int r10 = r0.i
            int r11 = r10 + 1
            r0.i = r11
            r11 = 12
            r8[r10] = r11
            goto L3f2
        L40d:
            r11 = 118(0x76, float:1.65E-43)
            if (r10 != r11) goto L3f2
            int r10 = r0.i
            int r11 = r10 + 1
            r0.i = r11
            r11 = 10
            r8[r10] = r11
            goto L3f2
        L41c:
            r9 = 8
            r10 = 541165879422(0x7e0000007e, double:2.67371469724E-312)
            long r10 = r10 & r12
            int r8 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r8 != 0) goto L42a
            goto L388
        L42a:
            r8 = 80
            if (r6 <= r8) goto L430
            r6 = 80
        L430:
            r10 = 15
        L432:
            r0.e(r10)
        L435:
            r9 = 12
            goto L3f6
        L438:
            r9 = 8
            r10 = 15
            r20 = 72057594054705152(0x100000001000000, double:7.291122046717944E-304)
            long r20 = r12 & r20
            int r8 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r8 == 0) goto L435
            goto L432
        L448:
            r9 = 8
            r10 = 15
            if (r6 <= r15) goto L44f
            r6 = 4
        L44f:
            int r11 = r0.i
            int r1 = r11 + 1
            r0.i = r1
            r8[r11] = r14
            goto L435
        L458:
            r9 = 8
            r10 = 15
            r20 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r20 = r12 & r20
            int r1 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r1 == 0) goto L435
            r1 = 36
            r8 = 37
            r0.c(r1, r8)
            goto L435
        L46f:
            r9 = 8
            r10 = 15
            r20 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r20 = r12 & r20
            int r1 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r1 == 0) goto L488
            r1 = 35
            r11 = 34
            r0.c(r11, r1)
        L485:
            r9 = 12
            goto L4c4
        L488:
            r11 = 34
            goto L485
        L48b:
            r9 = 8
            r10 = 15
            r11 = 34
            r20 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r20 = r12 & r20
            int r1 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r1 == 0) goto L485
            r1 = 32
            r8 = 33
            r0.c(r1, r8)
            goto L485
        L4a4:
            r9 = 8
            r10 = 15
            r11 = 34
            char r1 = r0.f1531f
            r9 = 117(0x75, float:1.64E-43)
            if (r1 != r9) goto L485
            int r1 = r0.i
            int r9 = r1 + 1
            r0.i = r9
            r9 = 12
            r8[r1] = r9
            goto L4c4
        L4bb:
            r9 = 12
            r10 = 15
            r11 = 34
            r0.c(r2, r3)
        L4c4:
            if (r5 != r7) goto L4c8
            goto L34e
        L4c8:
            r1 = 1
            goto L35c
        L4cb:
            int r1 = r8 >> 8
            int r9 = r8 >> 14
            r12 = r1 & 63
            long r12 = r10 << r12
            r2 = r8 & 255(0xff, float:3.57E-43)
            int r2 = r2 >> 6
            r8 = r8 & 63
            long r10 = r10 << r8
        L4da:
            int[] r8 = r0.f1530e
            int r5 = r5 + (-1)
            r8 = r8[r5]
            r3 = 3
            if (r8 == r3) goto L54c
            if (r8 == r14) goto L527
            r3 = 18
            if (r8 == r3) goto L50e
            r3 = 19
            if (r8 == r3) goto L50e
            r3 = 23
            if (r8 == r3) goto L4f6
            r3 = 24
            if (r8 == r3) goto L4f8
        L4f5:
            goto L549
        L4f6:
            r3 = 24
        L4f8:
            r22 = r1
            r23 = r9
            r24 = r2
            r25 = r12
            r27 = r10
            boolean r8 = d(r22, r23, r24, r25, r27)
            if (r8 == 0) goto L549
            r8 = 22
        L50a:
            r0.f(r8, r3)
            goto L549
        L50e:
            r3 = 24
            r8 = 22
            r22 = r1
            r23 = r9
            r24 = r2
            r25 = r12
            r27 = r10
            boolean r17 = d(r22, r23, r24, r25, r27)
            if (r17 == 0) goto L549
            r3 = 27
            r8 = 25
            goto L50a
        L527:
            r3 = 27
            r8 = 25
            r22 = r1
            r23 = r9
            r24 = r2
            r25 = r12
            r27 = r10
            boolean r16 = d(r22, r23, r24, r25, r27)
            if (r16 != 0) goto L53c
            goto L4f5
        L53c:
            if (r6 <= r15) goto L53f
            r6 = 4
        L53f:
            int[] r3 = r0.f1530e
            int r8 = r0.i
            int r15 = r8 + 1
            r0.i = r15
            r3[r8] = r14
        L549:
            r3 = 0
            r8 = 2
            goto L561
        L54c:
            r22 = r1
            r23 = r9
            r24 = r2
            r25 = r12
            r27 = r10
            boolean r3 = d(r22, r23, r24, r25, r27)
            if (r3 == 0) goto L549
            r3 = 0
            r8 = 2
            r0.c(r3, r8)
        L561:
            if (r5 != r7) goto L589
            goto L34f
        L565:
            if (r6 == r15) goto L56e
            r0.l = r6
            r0.k = r4
            r6 = 2147483647(0x7fffffff, float:NaN)
        L56e:
            int r4 = r4 + 1
            int r5 = r0.i
            r0.i = r7
            int r7 = 50 - r7
            if (r5 != r7) goto L579
            return r4
        L579:
            e.e r1 = r0.f1528c     // Catch: java.io.IOException -> L588
            char r1 = r1.k()     // Catch: java.io.IOException -> L588
            r0.f1531f = r1     // Catch: java.io.IOException -> L588
            r1 = 1
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L16
        L588:
            return r4
        L589:
            r3 = 2
            r15 = 4
            goto L4da
    }

    private int l0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 4
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L17:
            r0 = 6
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L145
            char r3 = r3.k()     // Catch: java.io.IOException -> L145
            r9.f1531f = r3     // Catch: java.io.IOException -> L145
            r4 = 65
            if (r3 == r4) goto L13b
            r4 = 69
            if (r3 == r4) goto L120
            r4 = 76
            if (r3 == r4) goto L105
            r4 = 97
            if (r3 == r4) goto Lfb
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto Le3
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto Ld9
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 == r4) goto Lcf
            r4 = 114(0x72, float:1.6E-43)
            if (r3 == r4) goto Lc5
            r4 = 79
            if (r3 == r4) goto Lb8
            r4 = 80
            if (r3 == r4) goto L7d
            r4 = 84
            if (r3 == r4) goto L5b
            r0 = 85
            if (r3 == r0) goto L51
            goto Lad
        L51:
            r3 = 5120(0x1400, double:2.5296E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.p0(r1, r3, r5, r7)
            return r0
        L5b:
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L6c
            r1 = 32
            int r0 = r11.G0(r0, r1)
            return r0
        L6c:
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lad
            r1 = 40
            int r0 = r11.G0(r0, r1)
            return r0
        L7d:
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L8e
            r1 = 36
            int r0 = r11.G0(r0, r1)
            return r0
        L8e:
            r3 = 137438953472(0x2000000000, double:6.7903865311E-313)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L9f
            r1 = 37
            int r0 = r11.G0(r0, r1)
            return r0
        L9f:
            r3 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lad
            r1 = 54
            int r0 = r11.G0(r0, r1)
            return r0
        Lad:
            r0 = 5
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.F0(r13, r14, r16)
            return r0
        Lb8:
            r3 = 549755814016(0x8000000080, double:2.71615461307E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.p0(r1, r3, r5, r7)
            return r0
        Lc5:
            r3 = 0
            r7 = 6
            r0 = r11
            int r0 = r0.p0(r1, r3, r5, r7)
            return r0
        Lcf:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.p0(r1, r3, r5, r7)
            return r0
        Ld9:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.p0(r1, r3, r5, r7)
            return r0
        Le3:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf1
            r1 = 62
            int r0 = r11.G0(r0, r1)
            return r0
        Lf1:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.p0(r1, r3, r5, r7)
            return r0
        Lfb:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.p0(r1, r3, r5, r7)
            return r0
        L105:
            r3 = 256(0x100, double:1.265E-321)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L113
            r1 = 8
            int r0 = r11.G0(r0, r1)
            return r0
        L113:
            r3 = 292057827328(0x440000c800, double:1.44295739082E-312)
            r7 = 0
            r0 = r11
            int r0 = r0.p0(r1, r3, r5, r7)
            return r0
        L120:
            r3 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L131
            r1 = 41
            int r0 = r11.G0(r0, r1)
            return r0
        L131:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.p0(r1, r3, r5, r7)
            return r0
        L13b:
            r3 = 8704(0x2200, double:4.3003E-320)
            r7 = 0
            r0 = r11
            int r0 = r0.p0(r1, r3, r5, r7)
            return r0
        L145:
            r3 = 5
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.K0(r13, r14, r16)
            return r0
    }

    private int m() {
            r6 = this;
            char r0 = r6.f1531f
            r1 = 9
            r2 = 52
            r3 = 0
            if (r0 == r1) goto L10c
            r1 = 12
            if (r0 == r1) goto L106
            r1 = 32
            if (r0 == r1) goto L100
            r1 = 46
            if (r0 == r1) goto Lf7
            r1 = 102(0x66, float:1.43E-43)
            r4 = 0
            if (r0 == r1) goto Lf0
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto Le9
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto Le2
            r1 = 73
            if (r0 == r1) goto Ld8
            r1 = 74
            if (r0 == r1) goto Ld0
            switch(r0) {
                case 65: goto Lc8;
                case 66: goto Lbe;
                case 67: goto Lb4;
                case 68: goto Lac;
                case 69: goto La4;
                case 70: goto L9a;
                case 71: goto L90;
                default: goto L2e;
            }
        L2e:
            switch(r0) {
                case 76: goto L88;
                case 77: goto L80;
                case 78: goto L78;
                case 79: goto L71;
                case 80: goto L69;
                default: goto L31;
            }
        L31:
            switch(r0) {
                case 82: goto L5f;
                case 83: goto L55;
                case 84: goto L4b;
                case 85: goto L43;
                case 86: goto L39;
                default: goto L34;
            }
        L34:
            int r0 = r6.i(r3, r3)
            return r0
        L39:
            r0 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            int r0 = r6.O(r0, r4)
            return r0
        L43:
            r0 = 8388608(0x800000, double:4.144523E-317)
            int r0 = r6.O(r0, r4)
            return r0
        L4b:
            r0 = 848256040960(0xc580000000, double:4.190941687156E-312)
            int r0 = r6.O(r0, r4)
            return r0
        L55:
            r0 = 54888719970562048(0xc3010000057000, double:5.412492161179341E-305)
            int r0 = r6.O(r0, r4)
            return r0
        L5f:
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            int r0 = r6.O(r0, r4)
            return r0
        L69:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            int r0 = r6.O(r0, r4)
            return r0
        L71:
            r0 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            int r0 = r6.O(r0, r4)
            return r0
        L78:
            r0 = 16809984(0x1008000, double:8.3052356E-317)
            int r0 = r6.O(r0, r4)
            return r0
        L80:
            r0 = 2621472(0x280020, double:1.2951793E-317)
            int r0 = r6.O(r0, r4)
            return r0
        L88:
            r0 = 1644167616(0x620001c0, double:8.12326735E-315)
            int r0 = r6.O(r0, r4)
            return r0
        L90:
            r0 = 4503599627374080(0x10000000000e00, double:2.225073858508972E-308)
            int r0 = r6.O(r0, r4)
            return r0
        L9a:
            r0 = 2252005972115456(0x8003000000000, double:1.112638785051567E-308)
            int r0 = r6.O(r0, r4)
            return r0
        La4:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            int r0 = r6.O(r0, r4)
            return r0
        Lac:
            r0 = 1048576(0x100000, double:5.180654E-318)
            int r0 = r6.O(r0, r4)
            return r0
        Lb4:
            r0 = 1128107587141632(0x4020204000000, double:5.573592036195407E-309)
            int r0 = r6.O(r0, r4)
            return r0
        Lbe:
            r0 = 263882790666240(0xf00000000000, double:1.303754213969063E-309)
            int r0 = r6.O(r0, r4)
            return r0
        Lc8:
            r0 = 131072(0x20000, double:6.4758E-319)
            int r0 = r6.O(r0, r4)
            return r0
        Ld0:
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            int r0 = r6.O(r0, r4)
            return r0
        Ld8:
            r0 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            int r0 = r6.O(r0, r4)
            return r0
        Le2:
            r0 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            int r0 = r6.O(r0, r4)
            return r0
        Le9:
            r0 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            int r0 = r6.O(r0, r4)
            return r0
        Lf0:
            r0 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            int r0 = r6.O(r0, r4)
            return r0
        Lf7:
            r0 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r2 = 3071(0xbff, double:1.5173E-320)
            int r0 = r6.O(r0, r2)
            return r0
        L100:
            r0 = 1
            int r0 = r6.y0(r3, r0, r2)
            return r0
        L106:
            r0 = 3
            int r0 = r6.y0(r3, r0, r2)
            return r0
        L10c:
            r0 = 2
            int r0 = r6.y0(r3, r0, r2)
            return r0
    }

    private int m0(long r13, long r15, long r17, long r19) {
            r12 = this;
            r9 = r12
            long r1 = r15 & r13
            long r5 = r19 & r17
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 5
            r0 = r12
            r2 = r13
            r4 = r17
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L17:
            r0 = 7
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L122
            char r3 = r3.k()     // Catch: java.io.IOException -> L122
            r9.f1531f = r3     // Catch: java.io.IOException -> L122
            r4 = 69
            r10 = 1
            if (r3 == r4) goto Lec
            r4 = 76
            if (r3 == r4) goto La2
            r4 = 80
            if (r3 == r4) goto L75
            r0 = 88
            if (r3 == r0) goto L6b
            r0 = 97
            if (r3 == r0) goto L61
            r0 = 99
            if (r3 == r0) goto L57
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L4d
            r0 = 110(0x6e, float:1.54E-43)
            if (r3 == r0) goto L43
            goto L117
        L43:
            r3 = 0
            r7 = 1
            r0 = r12
            int r0 = r0.q0(r1, r3, r5, r7)
            return r0
        L4d:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r12
            int r0 = r0.q0(r1, r3, r5, r7)
            return r0
        L57:
            r3 = 0
            r7 = 136(0x88, double:6.7E-322)
            r0 = r12
            int r0 = r0.q0(r1, r3, r5, r7)
            return r0
        L61:
            r3 = 0
            r7 = 6
            r0 = r12
            int r0 = r0.q0(r1, r3, r5, r7)
            return r0
        L6b:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r12
            int r0 = r0.q0(r1, r3, r5, r7)
            return r0
        L75:
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L83
            r1 = 10
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L83:
            r3 = 4096(0x1000, double:2.0237E-320)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L91
            r1 = 12
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L91:
            r3 = 549755813888(0x8000000000, double:2.716154612436E-312)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L117
            r1 = 39
            int r0 = r12.y0(r0, r1, r10)
            return r0
        La2:
            r3 = 128(0x80, double:6.3E-322)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lae
            int r0 = r12.y0(r0, r0, r10)
            return r0
        Lae:
            r3 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lbc
            r1 = 9
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lbc:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lca
            r1 = 13
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lca:
            r3 = 17179869184(0x400000000, double:8.487983164E-314)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Ldb
            r1 = 34
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Ldb:
            r3 = 274877906944(0x4000000000, double:1.35807730622E-312)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L117
            r1 = 38
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lec:
            r3 = 2048(0x800, double:1.012E-320)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto Lfa
            r1 = 11
            int r0 = r12.y0(r0, r1, r10)
            return r0
        Lfa:
            r3 = 16384(0x4000, double:8.095E-320)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L108
            r1 = 14
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L108:
            r3 = 32768(0x8000, double:1.61895E-319)
            long r3 = r3 & r1
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L117
            r1 = 15
            int r0 = r12.y0(r0, r1, r10)
            return r0
        L117:
            r0 = 6
            r13 = r12
            r14 = r0
            r15 = r1
            r17 = r5
            int r0 = r13.C0(r14, r15, r17)
            return r0
        L122:
            r3 = 6
            r13 = r12
            r14 = r3
            r15 = r1
            r17 = r5
            r13.H0(r14, r15, r17)
            return r0
    }

    private int n() {
            r6 = this;
            char r0 = r6.f1531f
            r1 = 9
            r2 = 51
            r3 = 0
            if (r0 == r1) goto L10d
            r1 = 12
            if (r0 == r1) goto L107
            r1 = 32
            if (r0 == r1) goto L101
            r1 = 46
            if (r0 == r1) goto Lf8
            r1 = 102(0x66, float:1.43E-43)
            r4 = 0
            if (r0 == r1) goto Lf1
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto Lea
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto Le3
            r1 = 73
            if (r0 == r1) goto Ld9
            r1 = 74
            if (r0 == r1) goto Ld1
            switch(r0) {
                case 65: goto Lc9;
                case 66: goto Lbf;
                case 67: goto Lb5;
                case 68: goto Lad;
                case 69: goto La5;
                case 70: goto L9b;
                case 71: goto L91;
                default: goto L2e;
            }
        L2e:
            switch(r0) {
                case 76: goto L89;
                case 77: goto L81;
                case 78: goto L79;
                case 79: goto L72;
                case 80: goto L6a;
                default: goto L31;
            }
        L31:
            switch(r0) {
                case 82: goto L60;
                case 83: goto L56;
                case 84: goto L4c;
                case 85: goto L44;
                case 86: goto L3a;
                default: goto L34;
            }
        L34:
            r0 = 6
            int r0 = r6.j(r0, r3)
            return r0
        L3a:
            r0 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            int r0 = r6.P(r0, r4)
            return r0
        L44:
            r0 = 8388608(0x800000, double:4.144523E-317)
            int r0 = r6.P(r0, r4)
            return r0
        L4c:
            r0 = 848256040960(0xc580000000, double:4.190941687156E-312)
            int r0 = r6.P(r0, r4)
            return r0
        L56:
            r0 = 54888719970562048(0xc3010000057000, double:5.412492161179341E-305)
            int r0 = r6.P(r0, r4)
            return r0
        L60:
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            int r0 = r6.P(r0, r4)
            return r0
        L6a:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            int r0 = r6.P(r0, r4)
            return r0
        L72:
            r0 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            int r0 = r6.P(r0, r4)
            return r0
        L79:
            r0 = 16809984(0x1008000, double:8.3052356E-317)
            int r0 = r6.P(r0, r4)
            return r0
        L81:
            r0 = 2621472(0x280020, double:1.2951793E-317)
            int r0 = r6.P(r0, r4)
            return r0
        L89:
            r0 = 1644167616(0x620001c0, double:8.12326735E-315)
            int r0 = r6.P(r0, r4)
            return r0
        L91:
            r0 = 4503599627374080(0x10000000000e00, double:2.225073858508972E-308)
            int r0 = r6.P(r0, r4)
            return r0
        L9b:
            r0 = 2252005972115456(0x8003000000000, double:1.112638785051567E-308)
            int r0 = r6.P(r0, r4)
            return r0
        La5:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            int r0 = r6.P(r0, r4)
            return r0
        Lad:
            r0 = 1048576(0x100000, double:5.180654E-318)
            int r0 = r6.P(r0, r4)
            return r0
        Lb5:
            r0 = 1128107587141632(0x4020204000000, double:5.573592036195407E-309)
            int r0 = r6.P(r0, r4)
            return r0
        Lbf:
            r0 = 263882790666240(0xf00000000000, double:1.303754213969063E-309)
            int r0 = r6.P(r0, r4)
            return r0
        Lc9:
            r0 = 131072(0x20000, double:6.4758E-319)
            int r0 = r6.P(r0, r4)
            return r0
        Ld1:
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            int r0 = r6.P(r0, r4)
            return r0
        Ld9:
            r0 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            int r0 = r6.P(r0, r4)
            return r0
        Le3:
            r0 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            int r0 = r6.P(r0, r4)
            return r0
        Lea:
            r0 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            int r0 = r6.P(r0, r4)
            return r0
        Lf1:
            r0 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            int r0 = r6.P(r0, r4)
            return r0
        Lf8:
            r0 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r2 = 3071(0xbff, double:1.5173E-320)
            int r0 = r6.P(r0, r2)
            return r0
        L101:
            r0 = 1
            int r0 = r6.z0(r3, r0, r2)
            return r0
        L107:
            r0 = 3
            int r0 = r6.z0(r3, r0, r2)
            return r0
        L10d:
            r0 = 2
            int r0 = r6.z0(r3, r0, r2)
            return r0
    }

    private int n0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 5
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L17:
            r0 = 7
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L121
            char r3 = r3.k()     // Catch: java.io.IOException -> L121
            r9.f1531f = r3     // Catch: java.io.IOException -> L121
            r4 = 69
            if (r3 == r4) goto Leb
            r4 = 76
            if (r3 == r4) goto La1
            r4 = 80
            if (r3 == r4) goto L74
            r0 = 88
            if (r3 == r0) goto L6a
            r0 = 97
            if (r3 == r0) goto L60
            r0 = 99
            if (r3 == r0) goto L56
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L4c
            r0 = 110(0x6e, float:1.54E-43)
            if (r3 == r0) goto L42
            goto L116
        L42:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.r0(r1, r3, r5, r7)
            return r0
        L4c:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.r0(r1, r3, r5, r7)
            return r0
        L56:
            r3 = 0
            r7 = 136(0x88, double:6.7E-322)
            r0 = r11
            int r0 = r0.r0(r1, r3, r5, r7)
            return r0
        L60:
            r3 = 0
            r7 = 6
            r0 = r11
            int r0 = r0.r0(r1, r3, r5, r7)
            return r0
        L6a:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.r0(r1, r3, r5, r7)
            return r0
        L74:
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L82
            r1 = 10
            int r0 = r11.G0(r0, r1)
            return r0
        L82:
            r3 = 4096(0x1000, double:2.0237E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L90
            r1 = 12
            int r0 = r11.G0(r0, r1)
            return r0
        L90:
            r3 = 549755813888(0x8000000000, double:2.716154612436E-312)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L116
            r1 = 39
            int r0 = r11.G0(r0, r1)
            return r0
        La1:
            r3 = 128(0x80, double:6.3E-322)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lad
            int r0 = r11.G0(r0, r0)
            return r0
        Lad:
            r3 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lbb
            r1 = 9
            int r0 = r11.G0(r0, r1)
            return r0
        Lbb:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lc9
            r1 = 13
            int r0 = r11.G0(r0, r1)
            return r0
        Lc9:
            r3 = 17179869184(0x400000000, double:8.487983164E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lda
            r1 = 34
            int r0 = r11.G0(r0, r1)
            return r0
        Lda:
            r3 = 274877906944(0x4000000000, double:1.35807730622E-312)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L116
            r1 = 38
            int r0 = r11.G0(r0, r1)
            return r0
        Leb:
            r3 = 2048(0x800, double:1.012E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf9
            r1 = 11
            int r0 = r11.G0(r0, r1)
            return r0
        Lf9:
            r3 = 16384(0x4000, double:8.095E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L107
            r1 = 14
            int r0 = r11.G0(r0, r1)
            return r0
        L107:
            r3 = 32768(0x8000, double:1.61895E-319)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L116
            r1 = 15
            int r0 = r11.G0(r0, r1)
            return r0
        L116:
            r0 = 6
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.D0(r13, r14, r16)
            return r0
        L121:
            r3 = 6
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.I0(r13, r14, r16)
            return r0
    }

    private int o() {
            r6 = this;
            char r0 = r6.f1531f
            r1 = 9
            r2 = 51
            r3 = 0
            if (r0 == r1) goto L10d
            r1 = 12
            if (r0 == r1) goto L107
            r1 = 32
            if (r0 == r1) goto L101
            r1 = 46
            if (r0 == r1) goto Lf8
            r1 = 102(0x66, float:1.43E-43)
            r4 = 0
            if (r0 == r1) goto Lf1
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto Lea
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto Le3
            r1 = 73
            if (r0 == r1) goto Ld9
            r1 = 74
            if (r0 == r1) goto Ld1
            switch(r0) {
                case 65: goto Lc9;
                case 66: goto Lbf;
                case 67: goto Lb5;
                case 68: goto Lad;
                case 69: goto La5;
                case 70: goto L9b;
                case 71: goto L91;
                default: goto L2e;
            }
        L2e:
            switch(r0) {
                case 76: goto L89;
                case 77: goto L81;
                case 78: goto L79;
                case 79: goto L72;
                case 80: goto L6a;
                default: goto L31;
            }
        L31:
            switch(r0) {
                case 82: goto L60;
                case 83: goto L56;
                case 84: goto L4c;
                case 85: goto L44;
                case 86: goto L3a;
                default: goto L34;
            }
        L34:
            r0 = 6
            int r0 = r6.k(r0, r3)
            return r0
        L3a:
            r0 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            int r0 = r6.Q(r0, r4)
            return r0
        L44:
            r0 = 8388608(0x800000, double:4.144523E-317)
            int r0 = r6.Q(r0, r4)
            return r0
        L4c:
            r0 = 848256040960(0xc580000000, double:4.190941687156E-312)
            int r0 = r6.Q(r0, r4)
            return r0
        L56:
            r0 = 54888719970562048(0xc3010000057000, double:5.412492161179341E-305)
            int r0 = r6.Q(r0, r4)
            return r0
        L60:
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            int r0 = r6.Q(r0, r4)
            return r0
        L6a:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            int r0 = r6.Q(r0, r4)
            return r0
        L72:
            r0 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            int r0 = r6.Q(r0, r4)
            return r0
        L79:
            r0 = 16809984(0x1008000, double:8.3052356E-317)
            int r0 = r6.Q(r0, r4)
            return r0
        L81:
            r0 = 2621472(0x280020, double:1.2951793E-317)
            int r0 = r6.Q(r0, r4)
            return r0
        L89:
            r0 = 1644167616(0x620001c0, double:8.12326735E-315)
            int r0 = r6.Q(r0, r4)
            return r0
        L91:
            r0 = 4503599627374080(0x10000000000e00, double:2.225073858508972E-308)
            int r0 = r6.Q(r0, r4)
            return r0
        L9b:
            r0 = 2252005972115456(0x8003000000000, double:1.112638785051567E-308)
            int r0 = r6.Q(r0, r4)
            return r0
        La5:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            int r0 = r6.Q(r0, r4)
            return r0
        Lad:
            r0 = 1048576(0x100000, double:5.180654E-318)
            int r0 = r6.Q(r0, r4)
            return r0
        Lb5:
            r0 = 1128107587141632(0x4020204000000, double:5.573592036195407E-309)
            int r0 = r6.Q(r0, r4)
            return r0
        Lbf:
            r0 = 263882790666240(0xf00000000000, double:1.303754213969063E-309)
            int r0 = r6.Q(r0, r4)
            return r0
        Lc9:
            r0 = 131072(0x20000, double:6.4758E-319)
            int r0 = r6.Q(r0, r4)
            return r0
        Ld1:
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            int r0 = r6.Q(r0, r4)
            return r0
        Ld9:
            r0 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            int r0 = r6.Q(r0, r4)
            return r0
        Le3:
            r0 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            int r0 = r6.Q(r0, r4)
            return r0
        Lea:
            r0 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            int r0 = r6.Q(r0, r4)
            return r0
        Lf1:
            r0 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            int r0 = r6.Q(r0, r4)
            return r0
        Lf8:
            r0 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r2 = 3071(0xbff, double:1.5173E-320)
            int r0 = r6.Q(r0, r2)
            return r0
        L101:
            r0 = 1
            int r0 = r6.A0(r3, r0, r2)
            return r0
        L107:
            r0 = 3
            int r0 = r6.A0(r3, r0, r2)
            return r0
        L10d:
            r0 = 2
            int r0 = r6.A0(r3, r0, r2)
            return r0
    }

    private int o0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 5
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L17:
            r0 = 7
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L121
            char r3 = r3.k()     // Catch: java.io.IOException -> L121
            r9.f1531f = r3     // Catch: java.io.IOException -> L121
            r4 = 69
            if (r3 == r4) goto Leb
            r4 = 76
            if (r3 == r4) goto La1
            r4 = 80
            if (r3 == r4) goto L74
            r0 = 88
            if (r3 == r0) goto L6a
            r0 = 97
            if (r3 == r0) goto L60
            r0 = 99
            if (r3 == r0) goto L56
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L4c
            r0 = 110(0x6e, float:1.54E-43)
            if (r3 == r0) goto L42
            goto L116
        L42:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.s0(r1, r3, r5, r7)
            return r0
        L4c:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.s0(r1, r3, r5, r7)
            return r0
        L56:
            r3 = 0
            r7 = 136(0x88, double:6.7E-322)
            r0 = r11
            int r0 = r0.s0(r1, r3, r5, r7)
            return r0
        L60:
            r3 = 0
            r7 = 6
            r0 = r11
            int r0 = r0.s0(r1, r3, r5, r7)
            return r0
        L6a:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.s0(r1, r3, r5, r7)
            return r0
        L74:
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L82
            r1 = 10
            int r0 = r11.G0(r0, r1)
            return r0
        L82:
            r3 = 4096(0x1000, double:2.0237E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L90
            r1 = 12
            int r0 = r11.G0(r0, r1)
            return r0
        L90:
            r3 = 549755813888(0x8000000000, double:2.716154612436E-312)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L116
            r1 = 39
            int r0 = r11.G0(r0, r1)
            return r0
        La1:
            r3 = 128(0x80, double:6.3E-322)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lad
            int r0 = r11.G0(r0, r0)
            return r0
        Lad:
            r3 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lbb
            r1 = 9
            int r0 = r11.G0(r0, r1)
            return r0
        Lbb:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lc9
            r1 = 13
            int r0 = r11.G0(r0, r1)
            return r0
        Lc9:
            r3 = 17179869184(0x400000000, double:8.487983164E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lda
            r1 = 34
            int r0 = r11.G0(r0, r1)
            return r0
        Lda:
            r3 = 274877906944(0x4000000000, double:1.35807730622E-312)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L116
            r1 = 38
            int r0 = r11.G0(r0, r1)
            return r0
        Leb:
            r3 = 2048(0x800, double:1.012E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf9
            r1 = 11
            int r0 = r11.G0(r0, r1)
            return r0
        Lf9:
            r3 = 16384(0x4000, double:8.095E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L107
            r1 = 14
            int r0 = r11.G0(r0, r1)
            return r0
        L107:
            r3 = 32768(0x8000, double:1.61895E-319)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L116
            r1 = 15
            int r0 = r11.G0(r0, r1)
            return r0
        L116:
            r0 = 6
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.E0(r13, r14, r16)
            return r0
        L121:
            r3 = 6
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.J0(r13, r14, r16)
            return r0
    }

    private int p() {
            r6 = this;
            char r0 = r6.f1531f
            r1 = 9
            r2 = 50
            r3 = 0
            if (r0 == r1) goto L123
            r1 = 12
            if (r0 == r1) goto L11d
            r1 = 32
            if (r0 == r1) goto L117
            r1 = 46
            if (r0 == r1) goto L10e
            r1 = 91
            if (r0 == r1) goto L107
            r1 = 93
            if (r0 == r1) goto L100
            r1 = 102(0x66, float:1.43E-43)
            r4 = 0
            if (r0 == r1) goto Lf9
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto Lf2
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto Leb
            r1 = 73
            if (r0 == r1) goto Le1
            r1 = 74
            if (r0 == r1) goto Ld9
            switch(r0) {
                case 65: goto Ld1;
                case 66: goto Lc7;
                case 67: goto Lbd;
                case 68: goto Lb5;
                case 69: goto Lad;
                case 70: goto La3;
                case 71: goto L99;
                default: goto L36;
            }
        L36:
            switch(r0) {
                case 76: goto L91;
                case 77: goto L89;
                case 78: goto L81;
                case 79: goto L7a;
                case 80: goto L72;
                default: goto L39;
            }
        L39:
            switch(r0) {
                case 82: goto L68;
                case 83: goto L5e;
                case 84: goto L54;
                case 85: goto L4c;
                case 86: goto L42;
                default: goto L3c;
            }
        L3c:
            r0 = 6
            int r0 = r6.l(r0, r3)
            return r0
        L42:
            r0 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            int r0 = r6.R(r0, r4)
            return r0
        L4c:
            r0 = 8388608(0x800000, double:4.144523E-317)
            int r0 = r6.R(r0, r4)
            return r0
        L54:
            r0 = 848256040960(0xc580000000, double:4.190941687156E-312)
            int r0 = r6.R(r0, r4)
            return r0
        L5e:
            r0 = 54888719970562048(0xc3010000057000, double:5.412492161179341E-305)
            int r0 = r6.R(r0, r4)
            return r0
        L68:
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            int r0 = r6.R(r0, r4)
            return r0
        L72:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            int r0 = r6.R(r0, r4)
            return r0
        L7a:
            r0 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            int r0 = r6.R(r0, r4)
            return r0
        L81:
            r0 = 16809984(0x1008000, double:8.3052356E-317)
            int r0 = r6.R(r0, r4)
            return r0
        L89:
            r0 = 2621472(0x280020, double:1.2951793E-317)
            int r0 = r6.R(r0, r4)
            return r0
        L91:
            r0 = 1644167616(0x620001c0, double:8.12326735E-315)
            int r0 = r6.R(r0, r4)
            return r0
        L99:
            r0 = 4503599627374080(0x10000000000e00, double:2.225073858508972E-308)
            int r0 = r6.R(r0, r4)
            return r0
        La3:
            r0 = 2252005972115456(0x8003000000000, double:1.112638785051567E-308)
            int r0 = r6.R(r0, r4)
            return r0
        Lad:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            int r0 = r6.R(r0, r4)
            return r0
        Lb5:
            r0 = 1048576(0x100000, double:5.180654E-318)
            int r0 = r6.R(r0, r4)
            return r0
        Lbd:
            r0 = 1128107587141632(0x4020204000000, double:5.573592036195407E-309)
            int r0 = r6.R(r0, r4)
            return r0
        Lc7:
            r0 = 263882790666240(0xf00000000000, double:1.303754213969063E-309)
            int r0 = r6.R(r0, r4)
            return r0
        Ld1:
            r0 = 131072(0x20000, double:6.4758E-319)
            int r0 = r6.R(r0, r4)
            return r0
        Ld9:
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            int r0 = r6.R(r0, r4)
            return r0
        Le1:
            r0 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            int r0 = r6.R(r0, r4)
            return r0
        Leb:
            r0 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            int r0 = r6.R(r0, r4)
            return r0
        Lf2:
            r0 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            int r0 = r6.R(r0, r4)
            return r0
        Lf9:
            r0 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            int r0 = r6.R(r0, r4)
            return r0
        L100:
            r0 = 89
            int r0 = r6.G0(r3, r0)
            return r0
        L107:
            r0 = 88
            int r0 = r6.G0(r3, r0)
            return r0
        L10e:
            r0 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r2 = 3071(0xbff, double:1.5173E-320)
            int r0 = r6.R(r0, r2)
            return r0
        L117:
            r0 = 1
            int r0 = r6.B0(r3, r0, r2)
            return r0
        L11d:
            r0 = 3
            int r0 = r6.B0(r3, r0, r2)
            return r0
        L123:
            r0 = 2
            int r0 = r6.B0(r3, r0, r2)
            return r0
    }

    private int p0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 5
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L17:
            r0 = 7
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L121
            char r3 = r3.k()     // Catch: java.io.IOException -> L121
            r9.f1531f = r3     // Catch: java.io.IOException -> L121
            r4 = 69
            if (r3 == r4) goto Leb
            r4 = 76
            if (r3 == r4) goto La1
            r4 = 80
            if (r3 == r4) goto L74
            r0 = 88
            if (r3 == r0) goto L6a
            r0 = 97
            if (r3 == r0) goto L60
            r0 = 99
            if (r3 == r0) goto L56
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L4c
            r0 = 110(0x6e, float:1.54E-43)
            if (r3 == r0) goto L42
            goto L116
        L42:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.t0(r1, r3, r5, r7)
            return r0
        L4c:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.t0(r1, r3, r5, r7)
            return r0
        L56:
            r3 = 0
            r7 = 136(0x88, double:6.7E-322)
            r0 = r11
            int r0 = r0.t0(r1, r3, r5, r7)
            return r0
        L60:
            r3 = 0
            r7 = 6
            r0 = r11
            int r0 = r0.t0(r1, r3, r5, r7)
            return r0
        L6a:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r7 = 0
            r0 = r11
            int r0 = r0.t0(r1, r3, r5, r7)
            return r0
        L74:
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L82
            r1 = 10
            int r0 = r11.G0(r0, r1)
            return r0
        L82:
            r3 = 4096(0x1000, double:2.0237E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L90
            r1 = 12
            int r0 = r11.G0(r0, r1)
            return r0
        L90:
            r3 = 549755813888(0x8000000000, double:2.716154612436E-312)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L116
            r1 = 39
            int r0 = r11.G0(r0, r1)
            return r0
        La1:
            r3 = 128(0x80, double:6.3E-322)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lad
            int r0 = r11.G0(r0, r0)
            return r0
        Lad:
            r3 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lbb
            r1 = 9
            int r0 = r11.G0(r0, r1)
            return r0
        Lbb:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lc9
            r1 = 13
            int r0 = r11.G0(r0, r1)
            return r0
        Lc9:
            r3 = 17179869184(0x400000000, double:8.487983164E-314)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lda
            r1 = 34
            int r0 = r11.G0(r0, r1)
            return r0
        Lda:
            r3 = 274877906944(0x4000000000, double:1.35807730622E-312)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L116
            r1 = 38
            int r0 = r11.G0(r0, r1)
            return r0
        Leb:
            r3 = 2048(0x800, double:1.012E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto Lf9
            r1 = 11
            int r0 = r11.G0(r0, r1)
            return r0
        Lf9:
            r3 = 16384(0x4000, double:8.095E-320)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L107
            r1 = 14
            int r0 = r11.G0(r0, r1)
            return r0
        L107:
            r3 = 32768(0x8000, double:1.61895E-319)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L116
            r1 = 15
            int r0 = r11.G0(r0, r1)
            return r0
        L116:
            r0 = 6
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.F0(r13, r14, r16)
            return r0
        L121:
            r3 = 6
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.K0(r13, r14, r16)
            return r0
    }

    private int q(long r11, long r13, long r15, long r17) {
            r10 = this;
            r9 = r10
            long r1 = r13 & r11
            long r5 = r17 & r15
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 8
            r0 = r10
            r2 = r11
            r4 = r15
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L17:
            e.e r0 = r9.f1528c     // Catch: java.io.IOException -> L46
            char r0 = r0.k()     // Catch: java.io.IOException -> L46
            r9.f1531f = r0     // Catch: java.io.IOException -> L46
            r3 = 101(0x65, float:1.42E-43)
            if (r0 == r3) goto L3c
            r3 = 105(0x69, float:1.47E-43)
            if (r0 == r3) goto L32
            r0 = 9
            r11 = r10
            r12 = r0
            r13 = r1
            r15 = r5
            int r0 = r11.C0(r12, r13, r15)
            return r0
        L32:
            r3 = 0
            r7 = 8
            r0 = r10
            int r0 = r0.u(r1, r3, r5, r7)
            return r0
        L3c:
            r3 = -9223372036854775808
            r7 = 1
            r0 = r10
            int r0 = r0.u(r1, r3, r5, r7)
            return r0
        L46:
            r0 = 9
            r11 = r10
            r12 = r0
            r13 = r1
            r15 = r5
            r11.H0(r12, r13, r15)
            r0 = 10
            return r0
    }

    private int q0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 6
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L17:
            r0 = 8
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L94
            char r3 = r3.k()     // Catch: java.io.IOException -> L94
            r9.f1531f = r3     // Catch: java.io.IOException -> L94
            r4 = 84
            if (r3 == r4) goto L7a
            r0 = 97
            if (r3 == r0) goto L70
            r0 = 101(0x65, float:1.42E-43)
            if (r3 == r0) goto L66
            r0 = 105(0x69, float:1.47E-43)
            if (r3 == r0) goto L5c
            r0 = 107(0x6b, float:1.5E-43)
            if (r3 == r0) goto L52
            r0 = 109(0x6d, float:1.53E-43)
            if (r3 == r0) goto L48
            r0 = 114(0x72, float:1.6E-43)
            if (r3 == r0) goto L3e
            goto L89
        L3e:
            r3 = 0
            r7 = 4
            r0 = r11
            int r0 = r0.u0(r1, r3, r5, r7)
            return r0
        L48:
            r3 = 0
            r7 = 2
            r0 = r11
            int r0 = r0.u0(r1, r3, r5, r7)
            return r0
        L52:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.u0(r1, r3, r5, r7)
            return r0
        L5c:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.u0(r1, r3, r5, r7)
            return r0
        L66:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.u0(r1, r3, r5, r7)
            return r0
        L70:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.u0(r1, r3, r5, r7)
            return r0
        L7a:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L89
            r1 = 55
            r2 = 1
            int r0 = r11.y0(r0, r1, r2)
            return r0
        L89:
            r0 = 7
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.C0(r13, r14, r16)
            return r0
        L94:
            r3 = 7
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.H0(r13, r14, r16)
            return r0
    }

    private int r(long r11, long r13, long r15, long r17) {
            r10 = this;
            r9 = r10
            long r1 = r13 & r11
            long r5 = r17 & r15
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 8
            r0 = r10
            r2 = r11
            r4 = r15
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L17:
            e.e r0 = r9.f1528c     // Catch: java.io.IOException -> L46
            char r0 = r0.k()     // Catch: java.io.IOException -> L46
            r9.f1531f = r0     // Catch: java.io.IOException -> L46
            r3 = 101(0x65, float:1.42E-43)
            if (r0 == r3) goto L3c
            r3 = 105(0x69, float:1.47E-43)
            if (r0 == r3) goto L32
            r0 = 9
            r11 = r10
            r12 = r0
            r13 = r1
            r15 = r5
            int r0 = r11.D0(r12, r13, r15)
            return r0
        L32:
            r3 = 0
            r7 = 8
            r0 = r10
            int r0 = r0.v(r1, r3, r5, r7)
            return r0
        L3c:
            r3 = -9223372036854775808
            r7 = 1
            r0 = r10
            int r0 = r0.v(r1, r3, r5, r7)
            return r0
        L46:
            r0 = 9
            r11 = r10
            r12 = r0
            r13 = r1
            r15 = r5
            r11.I0(r12, r13, r15)
            r0 = 10
            return r0
    }

    private int r0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 6
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L17:
            r0 = 8
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L93
            char r3 = r3.k()     // Catch: java.io.IOException -> L93
            r9.f1531f = r3     // Catch: java.io.IOException -> L93
            r4 = 84
            if (r3 == r4) goto L7a
            r0 = 97
            if (r3 == r0) goto L70
            r0 = 101(0x65, float:1.42E-43)
            if (r3 == r0) goto L66
            r0 = 105(0x69, float:1.47E-43)
            if (r3 == r0) goto L5c
            r0 = 107(0x6b, float:1.5E-43)
            if (r3 == r0) goto L52
            r0 = 109(0x6d, float:1.53E-43)
            if (r3 == r0) goto L48
            r0 = 114(0x72, float:1.6E-43)
            if (r3 == r0) goto L3e
            goto L88
        L3e:
            r3 = 0
            r7 = 4
            r0 = r11
            int r0 = r0.v0(r1, r3, r5, r7)
            return r0
        L48:
            r3 = 0
            r7 = 2
            r0 = r11
            int r0 = r0.v0(r1, r3, r5, r7)
            return r0
        L52:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.v0(r1, r3, r5, r7)
            return r0
        L5c:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.v0(r1, r3, r5, r7)
            return r0
        L66:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.v0(r1, r3, r5, r7)
            return r0
        L70:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.v0(r1, r3, r5, r7)
            return r0
        L7a:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L88
            r1 = 55
            int r0 = r11.G0(r0, r1)
            return r0
        L88:
            r0 = 7
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.D0(r13, r14, r16)
            return r0
        L93:
            r3 = 7
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.I0(r13, r14, r16)
            return r0
    }

    private int s(long r11, long r13, long r15, long r17) {
            r10 = this;
            r9 = r10
            long r1 = r13 & r11
            long r5 = r17 & r15
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 8
            r0 = r10
            r2 = r11
            r4 = r15
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L17:
            e.e r0 = r9.f1528c     // Catch: java.io.IOException -> L46
            char r0 = r0.k()     // Catch: java.io.IOException -> L46
            r9.f1531f = r0     // Catch: java.io.IOException -> L46
            r3 = 101(0x65, float:1.42E-43)
            if (r0 == r3) goto L3c
            r3 = 105(0x69, float:1.47E-43)
            if (r0 == r3) goto L32
            r0 = 9
            r11 = r10
            r12 = r0
            r13 = r1
            r15 = r5
            int r0 = r11.E0(r12, r13, r15)
            return r0
        L32:
            r3 = 0
            r7 = 8
            r0 = r10
            int r0 = r0.w(r1, r3, r5, r7)
            return r0
        L3c:
            r3 = -9223372036854775808
            r7 = 1
            r0 = r10
            int r0 = r0.w(r1, r3, r5, r7)
            return r0
        L46:
            r0 = 9
            r11 = r10
            r12 = r0
            r13 = r1
            r15 = r5
            r11.J0(r12, r13, r15)
            r0 = 10
            return r0
    }

    private int s0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 6
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L17:
            r0 = 8
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L93
            char r3 = r3.k()     // Catch: java.io.IOException -> L93
            r9.f1531f = r3     // Catch: java.io.IOException -> L93
            r4 = 84
            if (r3 == r4) goto L7a
            r0 = 97
            if (r3 == r0) goto L70
            r0 = 101(0x65, float:1.42E-43)
            if (r3 == r0) goto L66
            r0 = 105(0x69, float:1.47E-43)
            if (r3 == r0) goto L5c
            r0 = 107(0x6b, float:1.5E-43)
            if (r3 == r0) goto L52
            r0 = 109(0x6d, float:1.53E-43)
            if (r3 == r0) goto L48
            r0 = 114(0x72, float:1.6E-43)
            if (r3 == r0) goto L3e
            goto L88
        L3e:
            r3 = 0
            r7 = 4
            r0 = r11
            int r0 = r0.w0(r1, r3, r5, r7)
            return r0
        L48:
            r3 = 0
            r7 = 2
            r0 = r11
            int r0 = r0.w0(r1, r3, r5, r7)
            return r0
        L52:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.w0(r1, r3, r5, r7)
            return r0
        L5c:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.w0(r1, r3, r5, r7)
            return r0
        L66:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.w0(r1, r3, r5, r7)
            return r0
        L70:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.w0(r1, r3, r5, r7)
            return r0
        L7a:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L88
            r1 = 55
            int r0 = r11.G0(r0, r1)
            return r0
        L88:
            r0 = 7
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.E0(r13, r14, r16)
            return r0
        L93:
            r3 = 7
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.J0(r13, r14, r16)
            return r0
    }

    private int t(long r11, long r13, long r15, long r17) {
            r10 = this;
            r9 = r10
            long r1 = r13 & r11
            long r5 = r17 & r15
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 8
            r0 = r10
            r2 = r11
            r4 = r15
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L17:
            e.e r0 = r9.f1528c     // Catch: java.io.IOException -> L46
            char r0 = r0.k()     // Catch: java.io.IOException -> L46
            r9.f1531f = r0     // Catch: java.io.IOException -> L46
            r3 = 101(0x65, float:1.42E-43)
            if (r0 == r3) goto L3c
            r3 = 105(0x69, float:1.47E-43)
            if (r0 == r3) goto L32
            r0 = 9
            r11 = r10
            r12 = r0
            r13 = r1
            r15 = r5
            int r0 = r11.F0(r12, r13, r15)
            return r0
        L32:
            r3 = 0
            r7 = 8
            r0 = r10
            int r0 = r0.x(r1, r3, r5, r7)
            return r0
        L3c:
            r3 = -9223372036854775808
            r7 = 1
            r0 = r10
            int r0 = r0.x(r1, r3, r5, r7)
            return r0
        L46:
            r0 = 9
            r11 = r10
            r12 = r0
            r13 = r1
            r15 = r5
            r11.K0(r12, r13, r15)
            r0 = 10
            return r0
    }

    private int t0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 6
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L17:
            r0 = 8
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L93
            char r3 = r3.k()     // Catch: java.io.IOException -> L93
            r9.f1531f = r3     // Catch: java.io.IOException -> L93
            r4 = 84
            if (r3 == r4) goto L7a
            r0 = 97
            if (r3 == r0) goto L70
            r0 = 101(0x65, float:1.42E-43)
            if (r3 == r0) goto L66
            r0 = 105(0x69, float:1.47E-43)
            if (r3 == r0) goto L5c
            r0 = 107(0x6b, float:1.5E-43)
            if (r3 == r0) goto L52
            r0 = 109(0x6d, float:1.53E-43)
            if (r3 == r0) goto L48
            r0 = 114(0x72, float:1.6E-43)
            if (r3 == r0) goto L3e
            goto L88
        L3e:
            r3 = 0
            r7 = 4
            r0 = r11
            int r0 = r0.x0(r1, r3, r5, r7)
            return r0
        L48:
            r3 = 0
            r7 = 2
            r0 = r11
            int r0 = r0.x0(r1, r3, r5, r7)
            return r0
        L52:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.x0(r1, r3, r5, r7)
            return r0
        L5c:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.x0(r1, r3, r5, r7)
            return r0
        L66:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.x0(r1, r3, r5, r7)
            return r0
        L70:
            r3 = 0
            r7 = 128(0x80, double:6.3E-322)
            r0 = r11
            int r0 = r0.x0(r1, r3, r5, r7)
            return r0
        L7a:
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L88
            r1 = 55
            int r0 = r11.G0(r0, r1)
            return r0
        L88:
            r0 = 7
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.F0(r13, r14, r16)
            return r0
        L93:
            r3 = 7
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.K0(r13, r14, r16)
            return r0
    }

    private int u(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L18
            r1 = 9
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L18:
            r0 = 11
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L5d
            char r3 = r3.k()     // Catch: java.io.IOException -> L5d
            r9.f1531f = r3     // Catch: java.io.IOException -> L5d
            r4 = 100
            if (r3 == r4) goto L43
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L39
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 == r0) goto L2f
            goto L51
        L2f:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.y(r1, r3, r5, r7)
            return r0
        L39:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.y(r1, r3, r5, r7)
            return r0
        L43:
            r3 = -9223372036854775808
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L51
            r1 = 63
            int r0 = r11.G0(r0, r1)
            return r0
        L51:
            r0 = 10
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.C0(r13, r14, r16)
            return r0
        L5d:
            r3 = 10
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.H0(r13, r14, r16)
            return r0
    }

    private int u0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 7
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L17:
            r0 = 9
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L8a
            char r3 = r3.k()     // Catch: java.io.IOException -> L8a
            r9.f1531f = r3     // Catch: java.io.IOException -> L8a
            r4 = 100
            if (r3 == r4) goto L80
            r4 = 103(0x67, float:1.44E-43)
            if (r3 == r4) goto L66
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L58
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L4e
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L36
            goto L74
        L36:
            r3 = 2
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L44
            r1 = 65
            int r0 = r11.G0(r0, r1)
            return r0
        L44:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.q(r1, r3, r5, r7)
            return r0
        L4e:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.q(r1, r3, r5, r7)
            return r0
        L58:
            r3 = 128(0x80, double:6.3E-322)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L74
            r1 = 71
            int r0 = r11.G0(r0, r1)
            return r0
        L66:
            r3 = 4
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L74
            r1 = 66
            int r0 = r11.G0(r0, r1)
            return r0
        L74:
            r0 = 8
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.C0(r13, r14, r16)
            return r0
        L80:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.q(r1, r3, r5, r7)
            return r0
        L8a:
            r3 = 8
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.H0(r13, r14, r16)
            return r0
    }

    private int v(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L18
            r1 = 9
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L18:
            r0 = 11
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L5d
            char r3 = r3.k()     // Catch: java.io.IOException -> L5d
            r9.f1531f = r3     // Catch: java.io.IOException -> L5d
            r4 = 100
            if (r3 == r4) goto L43
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L39
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 == r0) goto L2f
            goto L51
        L2f:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.z(r1, r3, r5, r7)
            return r0
        L39:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.z(r1, r3, r5, r7)
            return r0
        L43:
            r3 = -9223372036854775808
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L51
            r1 = 63
            int r0 = r11.G0(r0, r1)
            return r0
        L51:
            r0 = 10
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.D0(r13, r14, r16)
            return r0
        L5d:
            r3 = 10
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.I0(r13, r14, r16)
            return r0
    }

    private int v0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 7
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L17:
            r0 = 9
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L8a
            char r3 = r3.k()     // Catch: java.io.IOException -> L8a
            r9.f1531f = r3     // Catch: java.io.IOException -> L8a
            r4 = 100
            if (r3 == r4) goto L80
            r4 = 103(0x67, float:1.44E-43)
            if (r3 == r4) goto L66
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L58
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L4e
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L36
            goto L74
        L36:
            r3 = 2
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L44
            r1 = 65
            int r0 = r11.G0(r0, r1)
            return r0
        L44:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.r(r1, r3, r5, r7)
            return r0
        L4e:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.r(r1, r3, r5, r7)
            return r0
        L58:
            r3 = 128(0x80, double:6.3E-322)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L74
            r1 = 71
            int r0 = r11.G0(r0, r1)
            return r0
        L66:
            r3 = 4
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L74
            r1 = 66
            int r0 = r11.G0(r0, r1)
            return r0
        L74:
            r0 = 8
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.D0(r13, r14, r16)
            return r0
        L80:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.r(r1, r3, r5, r7)
            return r0
        L8a:
            r3 = 8
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.I0(r13, r14, r16)
            return r0
    }

    private int w(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L18
            r1 = 9
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L18:
            r0 = 11
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L5d
            char r3 = r3.k()     // Catch: java.io.IOException -> L5d
            r9.f1531f = r3     // Catch: java.io.IOException -> L5d
            r4 = 100
            if (r3 == r4) goto L43
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L39
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 == r0) goto L2f
            goto L51
        L2f:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.A(r1, r3, r5, r7)
            return r0
        L39:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.A(r1, r3, r5, r7)
            return r0
        L43:
            r3 = -9223372036854775808
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L51
            r1 = 63
            int r0 = r11.G0(r0, r1)
            return r0
        L51:
            r0 = 10
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.E0(r13, r14, r16)
            return r0
        L5d:
            r3 = 10
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.J0(r13, r14, r16)
            return r0
    }

    private int w0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 7
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.E0(r1, r2, r4)
            return r0
        L17:
            r0 = 9
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L8a
            char r3 = r3.k()     // Catch: java.io.IOException -> L8a
            r9.f1531f = r3     // Catch: java.io.IOException -> L8a
            r4 = 100
            if (r3 == r4) goto L80
            r4 = 103(0x67, float:1.44E-43)
            if (r3 == r4) goto L66
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L58
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L4e
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L36
            goto L74
        L36:
            r3 = 2
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L44
            r1 = 65
            int r0 = r11.G0(r0, r1)
            return r0
        L44:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.s(r1, r3, r5, r7)
            return r0
        L4e:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.s(r1, r3, r5, r7)
            return r0
        L58:
            r3 = 128(0x80, double:6.3E-322)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L74
            r1 = 71
            int r0 = r11.G0(r0, r1)
            return r0
        L66:
            r3 = 4
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L74
            r1 = 66
            int r0 = r11.G0(r0, r1)
            return r0
        L74:
            r0 = 8
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.E0(r13, r14, r16)
            return r0
        L80:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.s(r1, r3, r5, r7)
            return r0
        L8a:
            r3 = 8
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.J0(r13, r14, r16)
            return r0
    }

    private int x(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L18
            r1 = 9
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L18:
            r0 = 11
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L5d
            char r3 = r3.k()     // Catch: java.io.IOException -> L5d
            r9.f1531f = r3     // Catch: java.io.IOException -> L5d
            r4 = 100
            if (r3 == r4) goto L43
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L39
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 == r0) goto L2f
            goto L51
        L2f:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.B(r1, r3, r5, r7)
            return r0
        L39:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.B(r1, r3, r5, r7)
            return r0
        L43:
            r3 = -9223372036854775808
            long r3 = r3 & r1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L51
            r1 = 63
            int r0 = r11.G0(r0, r1)
            return r0
        L51:
            r0 = 10
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.F0(r13, r14, r16)
            return r0
        L5d:
            r3 = 10
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.K0(r13, r14, r16)
            return r0
    }

    private int x0(long r12, long r14, long r16, long r18) {
            r11 = this;
            r9 = r11
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 7
            r0 = r11
            r2 = r12
            r4 = r16
            int r0 = r0.F0(r1, r2, r4)
            return r0
        L17:
            r0 = 9
            e.e r3 = r9.f1528c     // Catch: java.io.IOException -> L8a
            char r3 = r3.k()     // Catch: java.io.IOException -> L8a
            r9.f1531f = r3     // Catch: java.io.IOException -> L8a
            r4 = 100
            if (r3 == r4) goto L80
            r4 = 103(0x67, float:1.44E-43)
            if (r3 == r4) goto L66
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L58
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L4e
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L36
            goto L74
        L36:
            r3 = 2
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L44
            r1 = 65
            int r0 = r11.G0(r0, r1)
            return r0
        L44:
            r3 = 0
            r7 = 8
            r0 = r11
            int r0 = r0.t(r1, r3, r5, r7)
            return r0
        L4e:
            r3 = -9223372036854775808
            r7 = 0
            r0 = r11
            int r0 = r0.t(r1, r3, r5, r7)
            return r0
        L58:
            r3 = 128(0x80, double:6.3E-322)
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L74
            r1 = 71
            int r0 = r11.G0(r0, r1)
            return r0
        L66:
            r3 = 4
            long r3 = r3 & r5
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L74
            r1 = 66
            int r0 = r11.G0(r0, r1)
            return r0
        L74:
            r0 = 8
            r12 = r11
            r13 = r0
            r14 = r1
            r16 = r5
            int r0 = r12.F0(r13, r14, r16)
            return r0
        L80:
            r3 = 0
            r7 = 1
            r0 = r11
            int r0 = r0.t(r1, r3, r5, r7)
            return r0
        L8a:
            r3 = 8
            r12 = r11
            r13 = r3
            r14 = r1
            r16 = r5
            r12.K0(r13, r14, r16)
            return r0
    }

    private int y(long r10, long r12, long r14, long r16) {
            r9 = this;
            r6 = r9
            long r0 = r12 & r10
            long r2 = r16 & r14
            long r0 = r0 | r2
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L16
            r1 = 10
            r0 = r9
            r2 = r10
            r4 = r14
            int r0 = r0.C0(r1, r2, r4)
            return r0
        L16:
            r0 = 12
            e.e r1 = r6.f1528c     // Catch: java.io.IOException -> L4b
            char r1 = r1.k()     // Catch: java.io.IOException -> L4b
            r6.f1531f = r1     // Catch: java.io.IOException -> L4b
            r7 = 101(0x65, float:1.42E-43)
            if (r1 == r7) goto L30
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L29
            goto L3e
        L29:
            r0 = 1
            int r0 = r9.C(r2, r0)
            return r0
        L30:
            r7 = 8
            long r7 = r7 & r2
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L3e
            r1 = 67
            int r0 = r9.G0(r0, r1)
            return r0
        L3e:
            r0 = 11
            r4 = 0
            r10 = r9
            r11 = r0
            r12 = r4
            r14 = r2
            int r0 = r10.C0(r11, r12, r14)
            return r0
        L4b:
            r1 = 11
            r4 = 0
            r10 = r9
            r11 = r1
            r12 = r4
            r14 = r2
            r10.H0(r11, r12, r14)
            return r0
    }

    private int y0(int r1, int r2, int r3) {
            r0 = this;
            r0.l = r2
            r0.k = r1
            e.e r2 = r0.f1528c     // Catch: java.io.IOException -> L13
            char r2 = r2.k()     // Catch: java.io.IOException -> L13
            r0.f1531f = r2     // Catch: java.io.IOException -> L13
            int r1 = r1 + 1
            int r1 = r0.i(r3, r1)
            return r1
        L13:
            int r1 = r1 + 1
            return r1
    }

    private int z(long r10, long r12, long r14, long r16) {
            r9 = this;
            r6 = r9
            long r0 = r12 & r10
            long r2 = r16 & r14
            long r0 = r0 | r2
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L16
            r1 = 10
            r0 = r9
            r2 = r10
            r4 = r14
            int r0 = r0.D0(r1, r2, r4)
            return r0
        L16:
            r0 = 12
            e.e r1 = r6.f1528c     // Catch: java.io.IOException -> L4b
            char r1 = r1.k()     // Catch: java.io.IOException -> L4b
            r6.f1531f = r1     // Catch: java.io.IOException -> L4b
            r7 = 101(0x65, float:1.42E-43)
            if (r1 == r7) goto L30
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L29
            goto L3e
        L29:
            r0 = 1
            int r0 = r9.D(r2, r0)
            return r0
        L30:
            r7 = 8
            long r7 = r7 & r2
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L3e
            r1 = 67
            int r0 = r9.G0(r0, r1)
            return r0
        L3e:
            r0 = 11
            r4 = 0
            r10 = r9
            r11 = r0
            r12 = r4
            r14 = r2
            int r0 = r10.D0(r11, r12, r14)
            return r0
        L4b:
            r1 = 11
            r4 = 0
            r10 = r9
            r11 = r1
            r12 = r4
            r14 = r2
            r10.I0(r11, r12, r14)
            return r0
    }

    private int z0(int r1, int r2, int r3) {
            r0 = this;
            r0.l = r2
            r0.k = r1
            e.e r2 = r0.f1528c     // Catch: java.io.IOException -> L13
            char r2 = r2.k()     // Catch: java.io.IOException -> L13
            r0.f1531f = r2     // Catch: java.io.IOException -> L13
            int r1 = r1 + 1
            int r1 = r0.j(r3, r1)
            return r1
        L13:
            int r1 = r1 + 1
            return r1
    }

    public e.f b() {
            r17 = this;
            r0 = r17
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = 0
        L8:
            e.e r6 = r0.f1528c     // Catch: java.io.IOException -> Lff
            char r6 = r6.a()     // Catch: java.io.IOException -> Lff
            r0.f1531f = r6     // Catch: java.io.IOException -> Lff
            int r6 = r0.f1532g
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8 = 1
            if (r6 == 0) goto L3c
            if (r6 == r8) goto L33
            r9 = 2
            if (r6 == r9) goto L2a
            r9 = 3
            if (r6 == r9) goto L21
            goto L44
        L21:
            r0.l = r7
            r0.k = r3
            int r5 = r17.p()
            goto L44
        L2a:
            r0.l = r7
            r0.k = r3
            int r5 = r17.o()
            goto L44
        L33:
            r0.l = r7
            r0.k = r3
            int r5 = r17.n()
            goto L44
        L3c:
            r0.l = r7
            r0.k = r3
            int r5 = r17.m()
        L44:
            int r6 = r0.l
            if (r6 == r7) goto La4
            int r6 = r0.k
            int r7 = r6 + 1
            if (r7 >= r5) goto L56
            e.e r7 = r0.f1528c
            int r6 = r5 - r6
            int r6 = r6 - r8
            r7.f(r6)
        L56:
            long[] r6 = e.c.s
            int r7 = r0.l
            int r8 = r7 >> 6
            r8 = r6[r8]
            r6 = r7 & 63
            r10 = 1
            long r12 = r10 << r6
            long r8 = r8 & r12
            r6 = -1
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 == 0) goto L7d
            e.f r1 = r17.h()
            r1.h = r4
            int[] r2 = e.c.r
            int r3 = r0.l
            r2 = r2[r3]
            if (r2 == r6) goto L7c
            r0.f1532g = r2
        L7c:
            return r1
        L7d:
            long[] r8 = e.c.u
            int r9 = r7 >> 6
            r14 = r8[r9]
            r7 = r7 & 63
            long r7 = r10 << r7
            long r7 = r7 & r14
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 == 0) goto L98
            e.f r7 = r17.h()
            if (r4 != 0) goto L93
            goto L97
        L93:
            r7.h = r4
            r4.f1550g = r7
        L97:
            r4 = r7
        L98:
            int[] r7 = e.c.r
            int r8 = r0.l
            r7 = r7[r8]
            if (r7 == r6) goto L8
            r0.f1532g = r7
            goto L8
        La4:
            e.e r4 = r0.f1528c
            int r4 = r4.j()
            e.e r6 = r0.f1528c
            int r6 = r6.i()
            e.e r7 = r0.f1528c     // Catch: java.io.IOException -> Lbe
            r7.k()     // Catch: java.io.IOException -> Lbe
            e.e r7 = r0.f1528c     // Catch: java.io.IOException -> Lbe
            r7.f(r8)     // Catch: java.io.IOException -> Lbe
            r12 = r4
            r13 = r6
            r10 = 0
            goto Ldf
        Lbe:
            if (r5 > r8) goto Lc3
            r2 = r1
            goto Lc9
        Lc3:
            e.e r2 = r0.f1528c
            java.lang.String r2 = r2.d()
        Lc9:
            char r7 = r0.f1531f
            r9 = 10
            if (r7 == r9) goto Lda
            r9 = 13
            if (r7 != r9) goto Ld4
            goto Lda
        Ld4:
            int r3 = r6 + 1
            r13 = r3
            r12 = r4
            r10 = 1
            goto Ldf
        Lda:
            int r4 = r4 + 1
            r12 = r4
            r10 = 1
            r13 = 0
        Ldf:
            if (r10 != 0) goto Lf1
            e.e r2 = r0.f1528c
            r2.f(r8)
            if (r5 > r8) goto Le9
            goto Lef
        Le9:
            e.e r1 = r0.f1528c
            java.lang.String r1 = r1.d()
        Lef:
            r14 = r1
            goto Lf2
        Lf1:
            r14 = r2
        Lf2:
            lasm.c r1 = new lasm.c
            int r11 = r0.f1532g
            char r15 = r0.f1531f
            r16 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            throw r1
        Lff:
            r0.l = r3
            e.f r1 = r17.h()
            r1.h = r4
            return r1
    }

    protected e.f h() {
            r6 = this;
            java.lang.String[] r0 = e.c.p
            int r1 = r6.l
            r0 = r0[r1]
            if (r0 != 0) goto Le
            e.e r0 = r6.f1528c
            java.lang.String r0 = r0.d()
        Le:
            e.e r1 = r6.f1528c
            int r1 = r1.h()
            e.e r2 = r6.f1528c
            int r2 = r2.g()
            e.e r3 = r6.f1528c
            int r3 = r3.j()
            e.e r4 = r6.f1528c
            int r4 = r4.i()
            int r5 = r6.l
            e.f r0 = e.f.a(r5, r0)
            r0.f1545b = r1
            r0.f1547d = r3
            r0.f1546c = r2
            r0.f1548e = r4
            return r0
    }
}
