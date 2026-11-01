package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LuaClosure extends luaj.LuaFunction {
    private static final luaj.i[] X = null;
    private static int Y;
    public final luaj.h R;
    public luaj.i[] S;
    final luaj.Globals T;
    public java.lang.String U;
    private luaj.Varargs V;
    public volatile int W;

    static {
            r0 = 0
            luaj.i[] r0 = new luaj.i[r0]
            luaj.LuaClosure.X = r0
            return
    }

    public LuaClosure(luaj.h r5, luaj.LuaValue r6, boolean r7) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.U = r0
            luaj.LuaValue r1 = luaj.LuaValue.f1674f
            r4.V = r1
            r4.R = r5
            f.d[] r5 = r5.f1726f
            if (r5 == 0) goto L39
            int r1 = r5.length
            if (r1 != 0) goto L14
            goto L39
        L14:
            int r5 = r5.length
            luaj.i[] r1 = new luaj.i[r5]
            if (r7 == 0) goto L36
            luaj.LuaValue[] r7 = new luaj.LuaValue[r5]
            r2 = 0
            r7[r2] = r6
            luaj.i r3 = new luaj.i
            r3.<init>(r7, r2)
            r1[r2] = r3
            r2 = 1
        L26:
            if (r2 >= r5) goto L36
            luaj.LuaValue r3 = luaj.LuaValue.f1671c
            r7[r2] = r3
            luaj.i r3 = new luaj.i
            r3.<init>(r7, r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L26
        L36:
            r4.S = r1
            goto L3d
        L39:
            luaj.i[] r5 = luaj.LuaClosure.X
            r4.S = r5
        L3d:
            boolean r5 = r6 instanceof luaj.Globals
            if (r5 == 0) goto L44
            r0 = r6
            luaj.Globals r0 = (luaj.Globals) r0
        L44:
            r4.T = r0
            return
    }

    private luaj.LuaValue V2(luaj.LuaValue r2) {
            r1 = this;
            if (r2 == 0) goto L3
            return r2
        L3:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "return null as LuaValue"
            r2.<init>(r0)
            throw r2
    }

    private luaj.Varargs W2(luaj.Varargs r2) {
            r1 = this;
            if (r2 == 0) goto L3
            return r2
        L3:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "return null as Varargs"
            r2.<init>(r0)
            throw r2
    }

    private static void X2(luaj.Globals r2, luaj.d r3, java.lang.StringBuilder r4) {
            if (r2 == 0) goto L3d
            luaj.LuaThread r0 = r2.f0
            luaj.LuaValue r1 = r0.S
            if (r1 == 0) goto L29
            java.lang.String r2 = r4.toString()
            r3.f1710e = r2
            luaj.LuaValue r4 = r0.S     // Catch: java.lang.Throwable -> L20
            luaj.LuaValue r0 = r3.f1712g     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L15
            goto L19
        L15:
            luaj.LuaString r0 = luaj.LuaValue.K2(r2)     // Catch: java.lang.Throwable -> L20
        L19:
            luaj.LuaValue r2 = r4.call(r0)     // Catch: java.lang.Throwable -> L20
            r3.f1712g = r2     // Catch: java.lang.Throwable -> L20
            goto L28
        L20:
            java.lang.String r2 = "error in error handling"
            luaj.LuaString r2 = luaj.LuaValue.K2(r2)
            r3.f1712g = r2
        L28:
            return
        L29:
            luaj.lib.DebugLib r0 = r2.i0
            if (r0 == 0) goto L3d
            r0 = 10
            r4.append(r0)
            luaj.lib.DebugLib r0 = r2.i0
            int r1 = r3.f1706a
            java.lang.String r2 = r0.m3(r2, r1)
            r4.append(r2)
        L3d:
            java.lang.String r2 = r4.toString()
            r3.f1710e = r2
            return
    }

    private luaj.i Z2(luaj.LuaValue[] r6, short r7, luaj.i[] r8) {
            r5 = this;
            int r0 = r8.length
            r1 = -1
            r2 = 0
        L3:
            if (r2 >= r0) goto L15
            r3 = r8[r2]
            if (r3 != 0) goto Ld
            if (r1 >= 0) goto L12
            r1 = r2
            goto L12
        Ld:
            int r4 = r3.f1729b
            if (r4 != r7) goto L12
            return r3
        L12:
            int r2 = r2 + 1
            goto L3
        L15:
            if (r1 < 0) goto L1f
            luaj.i r0 = new luaj.i
            r0.<init>(r6, r7)
            r8[r1] = r0
            return r0
        L1f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No space for upvalue "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            luaj.LuaValue.R0(r6)
            r6 = 0
            return r6
    }

    private luaj.LuaValue[] a3() {
            r4 = this;
            luaj.h r0 = r4.R
            int r0 = r0.l
            luaj.LuaValue[] r1 = new luaj.LuaValue[r0]
            luaj.LuaValue[] r2 = luaj.LuaValue.O
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    private static void c3(luaj.Globals r4, luaj.d r5, luaj.h r6, int r7, java.lang.String r8) {
            java.lang.String r0 = r5.f1710e
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            if (r6 == 0) goto L48
            java.lang.String r1 = "?"
            if (r4 == 0) goto L29
            luaj.lib.DebugLib r2 = r4.i0
            if (r2 == 0) goto L29
            int r3 = r5.f1706a
            luaj.lib.DebugLib$a r2 = r2.d3(r3)
            if (r2 == 0) goto L2a
            java.lang.String r3 = r2.i()
            if (r3 == 0) goto L1f
            goto L20
        L1f:
            r3 = r1
        L20:
            r5.f1708c = r3
            int r3 = r2.a()
            r5.f1709d = r3
            goto L2a
        L29:
            r2 = r0
        L2a:
            if (r2 != 0) goto L45
            luaj.LuaString r2 = r6.f1727g
            if (r2 == 0) goto L34
            java.lang.String r1 = r2.g0()
        L34:
            r5.f1708c = r1
            int[] r1 = r6.f1724d
            if (r1 == 0) goto L42
            if (r7 < 0) goto L42
            int r2 = r1.length
            if (r7 >= r2) goto L42
            r1 = r1[r7]
            goto L43
        L42:
            r1 = -1
        L43:
            r5.f1709d = r1
        L45:
            r5.d()
        L48:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getMessage()
            r1.append(r2)
            if (r8 == 0) goto L63
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = ")"
            r1.append(r8)
        L63:
            java.lang.String r8 = "\nlevel = "
            r1.append(r8)
            int r8 = r5.f1706a
            r1.append(r8)
            if (r6 == 0) goto Lc7
            java.lang.String r8 = ", const = "
            r1.append(r8)
            luaj.LuaValue[] r8 = r6.f1721a
            int r8 = r8.length
            r1.append(r8)
            java.lang.String r8 = ", proto = "
            r1.append(r8)
            luaj.h[] r8 = r6.f1723c
            int r8 = r8.length
            r1.append(r8)
            java.lang.String r8 = ", upval = "
            r1.append(r8)
            f.d[] r8 = r6.f1726f
            int r8 = r8.length
            r1.append(r8)
            java.lang.String r8 = ", vars = "
            r1.append(r8)
            int r8 = r6.l
            r1.append(r8)
            java.lang.String r8 = ", code = "
            r1.append(r8)
            int[] r8 = r6.f1722b
            int r8 = r8.length
            r1.append(r8)
            r8 = 10
            r1.append(r8)
            if (r7 < 0) goto Lbf
            int[] r2 = r6.f1722b
            int r2 = r2.length
            if (r7 >= r2) goto Lbf
            luaj.g.F(r1, r6, r7, r0)
            r1.append(r8)
            int[] r6 = r6.f1722b
            r6 = r6[r7]
            luaj.g.v(r1, r7, r6)
            goto Lc7
        Lbf:
            java.lang.String r6 = "PC "
            r1.append(r6)
            r1.append(r7)
        Lc7:
            X2(r4, r5, r1)
            return
    }

    public static luaj.Varargs d3(luaj.Globals r2, luaj.LuaFunction r3, luaj.LuaValue r4, luaj.Varargs r5) {
            r0 = 0
            if (r2 == 0) goto La
            luaj.lib.DebugLib r1 = r2.i0
            if (r1 == 0) goto La
            r1.j3(r3, r0)
        La:
            int r3 = luaj.LuaClosure.Y
            luaj.LuaClosure.Y = r0
            luaj.LuaBoolean r1 = luaj.LuaValue.f1672d     // Catch: java.lang.Throwable -> L24
            luaj.Varargs r4 = r4.invoke(r5)     // Catch: java.lang.Throwable -> L24
            luaj.Varargs r4 = luaj.LuaValue.N2(r1, r4)     // Catch: java.lang.Throwable -> L24
            luaj.LuaClosure.Y = r3
            if (r2 == 0) goto L23
            luaj.lib.DebugLib r2 = r2.i0
            if (r2 == 0) goto L23
            r2.l3()
        L23:
            return r4
        L24:
            r4 = move-exception
            boolean r5 = r4 instanceof luaj.d     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L2e
            luaj.d r4 = (luaj.d) r4     // Catch: java.lang.Throwable -> L2c
            goto L34
        L2c:
            r4 = move-exception
            goto L57
        L2e:
            luaj.d$a r5 = new luaj.d$a     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2c
            r4 = r5
        L34:
            java.lang.String r5 = r4.f1710e     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L3c
            r5 = 0
            c3(r2, r4, r5, r0, r5)     // Catch: java.lang.Throwable -> L2c
        L3c:
            luaj.LuaValue r4 = r4.b()     // Catch: java.lang.Throwable -> L2c
            luaj.LuaBoolean r5 = luaj.LuaValue.f1673e     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L45
            goto L47
        L45:
            luaj.LuaValue r4 = luaj.LuaValue.f1671c     // Catch: java.lang.Throwable -> L2c
        L47:
            luaj.Varargs r4 = luaj.LuaValue.N2(r5, r4)     // Catch: java.lang.Throwable -> L2c
            luaj.LuaClosure.Y = r3
            if (r2 == 0) goto L56
            luaj.lib.DebugLib r2 = r2.i0
            if (r2 == 0) goto L56
            r2.l3()
        L56:
            return r4
        L57:
            luaj.LuaClosure.Y = r3
            if (r2 == 0) goto L62
            luaj.lib.DebugLib r2 = r2.i0
            if (r2 == 0) goto L62
            r2.l3()
        L62:
            throw r4
    }

    private void e3(luaj.LuaValue r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.ext.Script.DebugFunction
            if (r0 == 0) goto L9
            android.ext.Script$DebugFunction r2 = (android.ext.Script.DebugFunction) r2
            r2.l3(r1)
        L9:
            return
    }

    private static luaj.d g3(int r3, int r4, int r5) {
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Damaged script "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ": an attempt to get an upvalue with index "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = " when there are "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = " in total."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    @Override // luaj.LuaValue
    public final luaj.Varargs D1(luaj.Varargs r5, boolean r6) {
            r4 = this;
            luaj.LuaValue[] r0 = r4.a3()
            luaj.h r1 = r4.R
            int r2 = r1.l
            int r1 = r1.j
            if (r2 < r1) goto L2f
            r1 = 0
        Ld:
            luaj.h r2 = r4.R
            int r3 = r2.j
            if (r1 >= r3) goto L1d
            int r2 = r1 + 1
            luaj.LuaValue r3 = r5.v(r2)
            r0[r1] = r3
            r1 = r2
            goto Ld
        L1d:
            int r1 = r2.k
            if (r1 != 0) goto L24
            luaj.LuaValue r5 = luaj.LuaValue.f1674f
            goto L2a
        L24:
            int r3 = r3 + 1
            luaj.Varargs r5 = r5.e0(r3)
        L2a:
            luaj.Varargs r5 = r4.Y2(r0, r5, r6)
            return r5
        L2f:
            luaj.d r5 = new luaj.d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Damaged script: .maxstacksize ("
            r6.append(r0)
            luaj.h r0 = r4.R
            int r0 = r0.l
            r6.append(r0)
            java.lang.String r0 = ") < .numparams ("
            r6.append(r0)
            luaj.h r0 = r4.R
            int r0 = r0.j
            r6.append(r0)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    protected luaj.Varargs Y2(luaj.LuaValue[] r40, luaj.Varargs r41, boolean r42) {
            r39 = this;
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            java.lang.String r5 = ")"
            luaj.LuaValue r6 = luaj.LuaValue.f1674f
            luaj.h r7 = r1.R
            int[] r8 = r7.f1722b
            luaj.LuaValue[] r9 = r7.f1721a
            luaj.i[] r10 = r1.S
            r1.V = r3
            int r11 = r2.length
            luaj.h[] r7 = r7.f1723c
            int r7 = r7.length
            if (r7 <= 0) goto L1f
            luaj.i[] r7 = new luaj.i[r11]
            goto L20
        L1f:
            r7 = 0
        L20:
            luaj.Globals r13 = r1.T
            if (r13 == 0) goto L27
            luaj.lib.DebugLib r14 = r13.i0
            goto L28
        L27:
            r14 = 0
        L28:
            if (r14 == 0) goto L2d
            r14.i3(r1, r3, r2, r4)
        L2d:
            r15 = 1
            int r16 = luaj.LuaClosure.Y     // Catch: java.lang.Throwable -> L1054 java.lang.InterruptedException -> L105d java.lang.StackOverflowError -> L1063 luaj.d -> L106a
            int r16 = r16 + 1
            luaj.LuaClosure.Y = r16     // Catch: java.lang.Throwable -> L1054 java.lang.InterruptedException -> L105d java.lang.StackOverflowError -> L1063 luaj.d -> L106a
            luaj.LuaValue r16 = luaj.LuaValue.f1671c     // Catch: java.lang.Throwable -> L1054 java.lang.InterruptedException -> L105d java.lang.StackOverflowError -> L1063 luaj.d -> L106a
            luaj.LuaBoolean r17 = luaj.LuaValue.f1672d     // Catch: java.lang.Throwable -> L1054 java.lang.InterruptedException -> L105d java.lang.StackOverflowError -> L1063 luaj.d -> L106a
            luaj.LuaBoolean r18 = luaj.LuaValue.f1673e     // Catch: java.lang.Throwable -> L1054 java.lang.InterruptedException -> L105d java.lang.StackOverflowError -> L1063 luaj.d -> L106a
            luaj.LuaNumber r3 = luaj.LuaValue.f1675g     // Catch: java.lang.Throwable -> L1054 java.lang.InterruptedException -> L105d java.lang.StackOverflowError -> L1063 luaj.d -> L106a
            java.lang.String r15 = r1.U     // Catch: java.lang.Throwable -> L1054 java.lang.InterruptedException -> L105d java.lang.StackOverflowError -> L1063 luaj.d -> L106a
            luaj.h r12 = r1.R     // Catch: java.lang.Throwable -> L1054 java.lang.InterruptedException -> L105d java.lang.StackOverflowError -> L1063 luaj.d -> L106a
            luaj.h[] r12 = r12.f1723c     // Catch: java.lang.Throwable -> L1054 java.lang.InterruptedException -> L105d java.lang.StackOverflowError -> L1063 luaj.d -> L106a
            java.lang.Thread r21 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1054 java.lang.InterruptedException -> L105d java.lang.StackOverflowError -> L1063 luaj.d -> L106a
            r25 = r6
            r24 = r11
            r4 = 0
            r11 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
        L54:
            boolean r28 = r21.isInterrupted()     // Catch: java.lang.Throwable -> L1028 java.lang.InterruptedException -> L1030 java.lang.StackOverflowError -> L1036 luaj.d -> L103d
            if (r28 != 0) goto L1044
            if (r14 == 0) goto L87
            r14.k3(r11, r6, r4)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L68 java.lang.StackOverflowError -> L6f luaj.d -> L77
            goto L87
        L60:
            r0 = move-exception
            r2 = r0
            r28 = r7
            r3 = r11
            r13 = r14
            goto L1078
        L68:
            r0 = move-exception
            r2 = r0
            r28 = r7
            r13 = r14
            goto L108a
        L6f:
            r0 = move-exception
            r2 = r0
            r4 = r5
            r28 = r7
            r13 = r14
            goto L1095
        L77:
            r0 = move-exception
            r5 = r0
            r28 = r7
            r4 = r11
            r13 = r14
            r3 = r22
            r22 = r23
        L81:
            r6 = r26
        L83:
            r11 = r27
            goto L10b8
        L87:
            r1.W = r11     // Catch: java.lang.Throwable -> L1028 java.lang.InterruptedException -> L1030 java.lang.StackOverflowError -> L1036 luaj.d -> L103d
            r28 = r14
            r14 = r8[r11]     // Catch: java.lang.Throwable -> L8fe java.lang.InterruptedException -> L907 java.lang.StackOverflowError -> L1016 luaj.d -> L101a
            r29 = r3
            int r3 = r14 >> 6
            r30 = r5
            r5 = 255(0xff, float:3.57E-43)
            r3 = r3 & r5
            r5 = r14 & 63
            r31 = r6
            java.lang.String r6 = " ("
            r22 = r6
            java.lang.String r6 = "Null from "
            r23 = 8372224(0x7fc000, float:1.1731985E-38)
            r32 = 131071(0x1ffff, float:1.8367E-40)
            r33 = r6
            r6 = 2
            switch(r5) {
                case 0: goto Lfd9;
                case 1: goto Lfb8;
                case 2: goto Lf49;
                case 3: goto Lf1a;
                case 4: goto Lee1;
                case 5: goto Leb4;
                case 6: goto Le75;
                case 7: goto Le3d;
                case 8: goto Ldd8;
                case 9: goto Ldaa;
                case 10: goto Ld58;
                case 11: goto Ld30;
                case 12: goto Lce9;
                case 13: goto Lcac;
                case 14: goto Lc6f;
                case 15: goto Lc32;
                case 16: goto Lbf5;
                case 17: goto Lbb8;
                case 18: goto Lb7b;
                case 19: goto Lb56;
                case 20: goto Lb31;
                case 21: goto Lb0c;
                case 22: goto Lab6;
                case 23: goto La69;
                case 24: goto La27;
                case 25: goto L9e6;
                case 26: goto L982;
                case 27: goto L959;
                case 28: goto L91e;
                case 29: goto L630;
                case 30: goto L5a3;
                case 31: goto L514;
                case 32: goto L4d4;
                case 33: goto L47e;
                case 34: goto L3e7;
                case 35: goto L3ba;
                case 36: goto L309;
                case 37: goto L2c9;
                case 38: goto L28a;
                case 39: goto L282;
                case 40: goto L258;
                case 41: goto L233;
                case 42: goto L209;
                case 43: goto L1e0;
                case 44: goto L1b7;
                case 45: goto L170;
                case 46: goto Lfa;
                default: goto Lac;
            }
        Lac:
            r4 = 63
            if (r5 != r4) goto Le3
            luaj.d r4 = new luaj.d     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            java.lang.String r5 = "Damaged script: 5"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            throw r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
        Lb8:
            r0 = move-exception
            r2 = r0
            r3 = r11
        Lbb:
            r13 = r28
            r28 = r7
            goto L1078
        Lc1:
            r0 = move-exception
            r2 = r0
            r13 = r28
        Lc5:
            r28 = r7
            goto L108a
        Lc9:
            r0 = move-exception
        Lca:
            r2 = r0
            r13 = r28
            r4 = r30
        Lcf:
            r28 = r7
            goto L1095
        Ld3:
            r0 = move-exception
            r5 = r0
            r22 = r3
            r4 = r11
            r3 = r14
            r6 = r26
        Ldb:
            r11 = r27
            r13 = r28
        Ldf:
            r28 = r7
            goto L10b8
        Le3:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r6.<init>()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            java.lang.String r8 = "Illegal opcode: "
            r6.append(r8)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r6.append(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            throw r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
        Lfa:
            int r5 = r14 >>> 23
            r6 = 255(0xff, float:3.57E-43)
            if (r5 <= r6) goto L111
            r6 = r5 & 255(0xff, float:3.57E-43)
            r6 = r9[r6]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L105
            goto L113
        L105:
            r0 = move-exception
            r22 = r3
            r6 = r5
            r4 = r11
            r3 = r14
            r11 = r27
            r13 = r28
            r5 = r0
            goto Ldf
        L111:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L15e
        L113:
            r22 = r5
            int r5 = r14 >> 14
            r34 = r4
            r4 = r5 & 511(0x1ff, float:7.16E-43)
            r35 = r8
            r8 = 255(0xff, float:3.57E-43)
            if (r4 <= r8) goto L138
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r9[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L126
            goto L13a
        L126:
            r0 = move-exception
            r5 = r0
            r6 = r22
            r13 = r28
            r22 = r3
            r28 = r7
            r3 = r14
        L131:
            r38 = r11
            r11 = r4
            r4 = r38
            goto L10b8
        L138:
            r5 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L126
        L13a:
            luaj.LuaValue r5 = r6.n2(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L126
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L126
            r23 = r3
            r27 = r4
        L144:
            r36 = r12
            r19 = r13
            r37 = r15
            r26 = r22
        L14c:
            r13 = r28
            r4 = r30
            r6 = r31
        L152:
            r5 = r34
        L154:
            r3 = 1
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            goto Lffa
        L15e:
            r0 = move-exception
            r22 = r5
        L161:
            r5 = r0
            r4 = r11
            r6 = r22
        L165:
            r11 = r27
            r13 = r28
            r22 = r3
            r28 = r7
        L16d:
            r3 = r14
            goto L10b8
        L170:
            r34 = r4
            r35 = r8
            int r4 = r14 >>> 23
            r5 = 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L188
            r5 = r4 & 255(0xff, float:3.57E-43)
            r5 = r9[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            goto L18a
        L17f:
            r0 = move-exception
            r5 = r0
            r22 = r3
            r6 = r4
            r4 = r11
            r3 = r14
            goto Ldb
        L188:
            r5 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L1b3
        L18a:
            int r6 = r14 >> 14
            r8 = r6 & 511(0x1ff, float:7.16E-43)
            r22 = r4
            r4 = 255(0xff, float:3.57E-43)
            if (r8 <= r4) goto L1a6
            r4 = r6 & 255(0xff, float:3.57E-43)
            r4 = r9[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            goto L1a8
        L199:
            r0 = move-exception
            r5 = r0
            r4 = r11
            r6 = r22
            r13 = r28
            r22 = r3
            r28 = r7
            r11 = r8
            goto L16d
        L1a6:
            r4 = r2[r8]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
        L1a8:
            luaj.LuaValue r4 = r5.m2(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            r2[r3] = r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
        L1ae:
            r23 = r3
            r27 = r8
            goto L144
        L1b3:
            r0 = move-exception
            r22 = r4
            goto L161
        L1b7:
            r34 = r4
            r35 = r8
            int r4 = r14 >>> 23
            r5 = 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1c6
            r5 = r4 & 255(0xff, float:3.57E-43)
            r5 = r9[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            goto L1c8
        L1c6:
            r5 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L1b3
        L1c8:
            int r6 = r14 >> 14
            r8 = r6 & 511(0x1ff, float:7.16E-43)
            r22 = r4
            r4 = 255(0xff, float:3.57E-43)
            if (r8 <= r4) goto L1d7
            r4 = r6 & 255(0xff, float:3.57E-43)
            r4 = r9[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            goto L1d9
        L1d7:
            r4 = r2[r8]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
        L1d9:
            luaj.LuaValue r4 = r5.t0(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            r2[r3] = r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            goto L1ae
        L1e0:
            r34 = r4
            r35 = r8
            int r4 = r14 >>> 23
            r5 = 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1ef
            r5 = r4 & 255(0xff, float:3.57E-43)
            r5 = r9[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            goto L1f1
        L1ef:
            r5 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L1b3
        L1f1:
            int r6 = r14 >> 14
            r8 = r6 & 511(0x1ff, float:7.16E-43)
            r22 = r4
            r4 = 255(0xff, float:3.57E-43)
            if (r8 <= r4) goto L200
            r4 = r6 & 255(0xff, float:3.57E-43)
            r4 = r9[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            goto L202
        L200:
            r4 = r2[r8]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
        L202:
            luaj.LuaValue r4 = r5.r0(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            r2[r3] = r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            goto L1ae
        L209:
            r34 = r4
            r35 = r8
            int r4 = r14 >>> 23
            r5 = 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L218
            r5 = r4 & 255(0xff, float:3.57E-43)
            r5 = r9[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            goto L21a
        L218:
            r5 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L1b3
        L21a:
            int r6 = r14 >> 14
            r8 = r6 & 511(0x1ff, float:7.16E-43)
            r22 = r4
            r4 = 255(0xff, float:3.57E-43)
            if (r8 <= r4) goto L229
            r4 = r6 & 255(0xff, float:3.57E-43)
            r4 = r9[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            goto L22b
        L229:
            r4 = r2[r8]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
        L22b:
            luaj.LuaValue r4 = r5.o0(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            r2[r3] = r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            goto L1ae
        L233:
            r34 = r4
            r35 = r8
            int r4 = r14 >>> 23
            r4 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            luaj.LuaValue r4 = r4.q0()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r2[r3] = r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r33 = r11
            r36 = r12
        L245:
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
        L24f:
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            goto Lf15
        L258:
            r34 = r4
            r35 = r8
            int r4 = r14 >>> 23
            r5 = 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L267
            r5 = r4 & 255(0xff, float:3.57E-43)
            r5 = r9[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            goto L269
        L267:
            r5 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L1b3
        L269:
            int r6 = r14 >> 14
            r8 = r6 & 511(0x1ff, float:7.16E-43)
            r22 = r4
            r4 = 255(0xff, float:3.57E-43)
            if (r8 <= r4) goto L278
            r4 = r6 & 255(0xff, float:3.57E-43)
            r4 = r9[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            goto L27a
        L278:
            r4 = r2[r8]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
        L27a:
            luaj.LuaValue r4 = r5.Z0(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            r2[r3] = r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L199
            goto L1ae
        L282:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            java.lang.String r5 = "Uexecutable opcode: EXTRAARG"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            throw r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
        L28a:
            r34 = r4
            r35 = r8
            int r4 = r14 >>> 23
            if (r4 != 0) goto L2a9
            luaj.Varargs r6 = r1.V     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            int r26 = r6.U()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            int r4 = r3 + r26
            r23 = r3
            r5 = r4
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            goto L154
        L2a9:
            luaj.Varargs r5 = r1.V     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            r6 = 1
        L2ac:
            if (r6 >= r4) goto L2bd
            int r8 = r3 + r6
            r20 = 1
            int r8 = r8 + (-1)
            luaj.LuaValue r22 = r5.v(r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            r2[r8] = r22     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            int r6 = r6 + 1
            goto L2ac
        L2bd:
            r23 = r3
            r26 = r4
            r36 = r12
            r19 = r13
            r37 = r15
            goto L14c
        L2c9:
            r34 = r4
            r35 = r8
            int r4 = r14 >>> 14
            r4 = r12[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            luaj.LuaClosure r5 = new luaj.LuaClosure     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r6 = 0
            r5.<init>(r4, r13, r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r5.U = r15     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            f.d[] r4 = r4.f1726f     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            int r6 = r4.length     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            luaj.i[] r8 = r5.S     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r36 = r12
            r12 = 0
        L2e1:
            if (r12 >= r6) goto L303
            r22 = r6
            r6 = r4[r12]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r23 = r4
            boolean r4 = r6.f1564b     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            if (r4 == 0) goto L2f6
            short r4 = r6.f1565c     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            luaj.i r4 = r1.Z2(r2, r4, r7)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r8[r12] = r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            goto L2fc
        L2f6:
            short r4 = r6.f1565c     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r4 = r10[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r8[r12] = r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
        L2fc:
            int r12 = r12 + 1
            r6 = r22
            r4 = r23
            goto L2e1
        L303:
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r33 = r11
            goto L245
        L309:
            r34 = r4
            r35 = r8
            r36 = r12
            int r4 = r14 >> 14
            r4 = r4 & 511(0x1ff, float:7.16E-43)
            if (r4 != 0) goto L319
            int r11 = r11 + 1
            r4 = r35[r11]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L31c
        L319:
            r27 = r4
            goto L329
        L31c:
            r0 = move-exception
            r5 = r0
            r22 = r3
            r3 = r14
            r6 = r26
            r13 = r28
            r28 = r7
            goto L131
        L329:
            int r4 = r27 + (-1)
            int r4 = r4 * 50
            r5 = r2[r3]     // Catch: java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 java.lang.Throwable -> L381 luaj.d -> L3b0
            int r6 = r14 >>> 23
            if (r6 != 0) goto L389
            int r6 = r34 - r3
            r8 = 1
            int r6 = r6 - r8
            int r8 = r31.U()     // Catch: java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 java.lang.Throwable -> L381 luaj.d -> L385
            int r8 = r6 - r8
            r12 = 1
        L33e:
            if (r12 > r8) goto L360
            r22 = r11
            int r11 = r4 + r12
            int r23 = r3 + r12
            r37 = r15
            r15 = r2[r23]     // Catch: java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 java.lang.Throwable -> L354 luaj.d -> L35a
            r5.e2(r11, r15)     // Catch: java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 java.lang.Throwable -> L354 luaj.d -> L35a
            int r12 = r12 + 1
            r11 = r22
            r15 = r37
            goto L33e
        L354:
            r0 = move-exception
        L355:
            r2 = r0
            r3 = r22
            goto Lbb
        L35a:
            r0 = move-exception
        L35b:
            r5 = r0
            r4 = r22
            goto L165
        L360:
            r22 = r11
            r37 = r15
        L364:
            if (r12 > r6) goto L37c
            int r11 = r4 + r12
            int r15 = r12 - r8
            r23 = r8
            r8 = r31
            luaj.LuaValue r15 = r8.v(r15)     // Catch: java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 java.lang.Throwable -> L354 luaj.d -> L35a
            r5.e2(r11, r15)     // Catch: java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 java.lang.Throwable -> L354 luaj.d -> L35a
            int r12 = r12 + 1
            r31 = r8
            r8 = r23
            goto L364
        L37c:
            r8 = r31
        L37e:
            r26 = r6
            goto L3a3
        L381:
            r0 = move-exception
            r22 = r11
            goto L355
        L385:
            r0 = move-exception
            r22 = r11
            goto L35b
        L389:
            r22 = r11
            r37 = r15
            r8 = r31
            int r11 = r4 + r6
            r5.R1(r11)     // Catch: java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 java.lang.Throwable -> L354 luaj.d -> L35a
            r11 = 1
        L395:
            if (r11 > r6) goto L37e
            int r12 = r4 + r11
            int r15 = r3 + r11
            r15 = r2[r15]     // Catch: java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 java.lang.Throwable -> L354 luaj.d -> L35a
            r5.e2(r12, r15)     // Catch: java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 java.lang.Throwable -> L354 luaj.d -> L35a
            int r11 = r11 + 1
            goto L395
        L3a3:
            r23 = r3
            r6 = r8
            r19 = r13
            r11 = r22
        L3aa:
            r13 = r28
            r4 = r30
            goto L152
        L3b0:
            r0 = move-exception
            r22 = r11
            r5 = r0
            r4 = r22
            r6 = r26
            goto L165
        L3ba:
            r34 = r4
            r35 = r8
            r36 = r12
            r37 = r15
            r8 = r31
            int r4 = r3 + 1
            r5 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            boolean r5 = r5.l1()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            if (r5 != 0) goto L3dd
            r4 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r2[r3] = r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            int r4 = r14 >>> 14
            int r4 = r4 - r32
            int r11 = r11 + r4
            r23 = r3
            r6 = r8
            r19 = r13
            goto L3aa
        L3dd:
            r33 = r11
            r19 = r13
            r13 = r28
            r4 = r30
            goto L24f
        L3e7:
            r34 = r4
            r35 = r8
            r36 = r12
            r37 = r15
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            r1.e3(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3 java.lang.NullPointerException -> L434
            int r5 = r3 + 1
            r5 = r2[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3 java.lang.NullPointerException -> L434
            int r6 = r3 + 2
            r6 = r2[r6]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3 java.lang.NullPointerException -> L434
            luaj.Varargs r5 = luaj.LuaValue.N2(r5, r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3 java.lang.NullPointerException -> L434
            luaj.Varargs r4 = r4.invoke(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3 java.lang.NullPointerException -> L434
            luaj.Varargs r4 = r1.W2(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3 java.lang.NullPointerException -> L434
            int r5 = r14 >> 14
            r5 = r5 & 511(0x1ff, float:7.16E-43)
        L40e:
            int r27 = r5 + (-1)
            if (r27 < 0) goto L41f
            int r6 = r3 + 3
            int r6 = r6 + r27
            luaj.LuaValue r5 = r4.v(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r2[r6] = r5     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r5 = r27
            goto L40e
        L41f:
            r23 = r3
            r19 = r13
            r6 = r25
            r13 = r28
            r4 = r30
            r5 = r34
            r3 = 1
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r6
            goto Lffa
        L434:
            r0 = move-exception
            r4 = r0
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            r6.<init>()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            r12 = r33
            r6.append(r12)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            r8 = r2[r3]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            r6.append(r8)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            r15 = r22
            r6.append(r15)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            int r8 = r3 + 1
            r8 = r2[r8]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            int r9 = r3 + 2
            r9 = r2[r9]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            luaj.Varargs r8 = luaj.LuaValue.N2(r8, r9)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            r6.append(r8)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L47a
            r12 = r30
            r6.append(r12)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L473
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L473
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L473
            r5.initCause(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L473
            throw r5     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L473
        L473:
            r0 = move-exception
        L474:
            r2 = r0
            r4 = r12
        L476:
            r13 = r28
            goto Lcf
        L47a:
            r0 = move-exception
            r12 = r30
            goto L474
        L47e:
            r34 = r4
            r35 = r8
            r36 = r12
            r37 = r15
            r12 = r30
            r8 = r31
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L4cf
            java.lang.String r5 = "'for' initial value must be a number"
            luaj.LuaNumber r4 = r4.F0(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L4cf
            int r5 = r3 + 1
            r6 = r2[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L4cf
            java.lang.String r15 = "'for' limit must be a number"
            luaj.LuaNumber r6 = r6.F0(r15)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L4cf
            int r15 = r3 + 2
            r30 = r12
            r12 = r2[r15]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r31 = r10
            java.lang.String r10 = "'for' step must be a number"
            luaj.LuaNumber r10 = r12.F0(r10)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            luaj.LuaValue r4 = r4.r2(r10)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r2[r3] = r4     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r2[r5] = r6     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r2[r15] = r10     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            int r4 = r14 >>> 14
            int r4 = r4 - r32
            int r11 = r11 + r4
            r23 = r3
            r6 = r8
        L4bc:
            r19 = r13
            r13 = r28
            r4 = r30
            r5 = r34
            r3 = 1
            r28 = r7
            r30 = r9
            r9 = r25
        L4cb:
            r7 = r31
            goto Lffa
        L4cf:
            r0 = move-exception
            r30 = r12
            goto Lca
        L4d4:
            r34 = r4
            r35 = r8
            r36 = r12
            r37 = r15
            r8 = r31
            r31 = r10
            int r4 = r3 + 1
            r4 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            int r5 = r3 + 2
            r5 = r2[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r6 = r2[r3]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            luaj.LuaValue r6 = r6.j0(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r10 = r29
            boolean r5 = r5.X0(r10)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            if (r5 == 0) goto L4fd
            boolean r4 = r6.v1(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            if (r4 == 0) goto L50e
            goto L503
        L4fd:
            boolean r4 = r6.Y0(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            if (r4 == 0) goto L50e
        L503:
            r2[r3] = r6     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            int r4 = r3 + 3
            r2[r4] = r6     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            int r4 = r14 >>> 14
            int r4 = r4 - r32
            int r11 = r11 + r4
        L50e:
            r23 = r3
            r6 = r8
            r29 = r10
            goto L4bc
        L514:
            r34 = r4
            r8 = r31
            int r4 = r14 >>> 23
            if (r4 == 0) goto L582
            r5 = 1
            if (r4 == r5) goto L560
            if (r4 == r6) goto L549
            int r5 = r4 + (-1)
            luaj.Varargs r2 = luaj.LuaValue.P2(r2, r3, r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            if (r7 == 0) goto L537
            r11 = r24
        L52b:
            r3 = -1
            int r11 = r11 + r3
            if (r11 < 0) goto L537
            r3 = r7[r11]
            if (r3 == 0) goto L52b
            r3.a()
            goto L52b
        L537:
            if (r28 == 0) goto L53e
            if (r42 != 0) goto L53e
        L53b:
            r28.l3()
        L53e:
            luaj.LuaValue r3 = luaj.LuaValue.f1674f
            r1.V = r3
            int r3 = luaj.LuaClosure.Y
            r4 = 1
            int r3 = r3 - r4
            luaj.LuaClosure.Y = r3
            return r2
        L549:
            r2 = r2[r3]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            if (r7 == 0) goto L55b
            r11 = r24
        L54f:
            r3 = -1
            int r11 = r11 + r3
            if (r11 < 0) goto L55b
            r3 = r7[r11]
            if (r3 == 0) goto L54f
            r3.a()
            goto L54f
        L55b:
            if (r28 == 0) goto L53e
            if (r42 != 0) goto L53e
            goto L53b
        L560:
            if (r7 == 0) goto L570
            r11 = r24
        L564:
            r2 = -1
            int r11 = r11 + r2
            if (r11 < 0) goto L570
            r2 = r7[r11]
            if (r2 == 0) goto L564
            r2.a()
            goto L564
        L570:
            if (r28 == 0) goto L577
            if (r42 != 0) goto L577
            r28.l3()
        L577:
            luaj.LuaValue r2 = luaj.LuaValue.f1674f
            r1.V = r2
            int r2 = luaj.LuaClosure.Y
            r3 = 1
            int r2 = r2 - r3
            luaj.LuaClosure.Y = r2
            return r25
        L582:
            r5 = r34
            int r6 = r8.U()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            int r5 = r5 - r6
            int r5 = r5 - r3
            luaj.Varargs r2 = luaj.LuaValue.Q2(r2, r3, r5, r8)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            if (r7 == 0) goto L59e
            r11 = r24
        L592:
            r3 = -1
            int r11 = r11 + r3
            if (r11 < 0) goto L59e
            r3 = r7[r11]
            if (r3 == 0) goto L592
            r3.a()
            goto L592
        L59e:
            if (r28 == 0) goto L53e
            if (r42 != 0) goto L53e
            goto L53b
        L5a3:
            r5 = r4
            r8 = r31
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r1.e3(r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r4 = -8388608(0xffffffffff800000, float:-Infinity)
            r4 = r4 & r14
            r6 = 8388608(0x800000, float:1.1754944E-38)
            if (r4 == r6) goto L5ff
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 == r6) goto L5fa
            r6 = 25165824(0x1800000, float:4.7019774E-38)
            if (r4 == r6) goto L5ed
            r6 = 33554432(0x2000000, float:9.403955E-38)
            if (r4 == r6) goto L5dc
            int r4 = r14 >>> 23
            if (r4 <= 0) goto L5cc
            int r5 = r3 + 1
            int r6 = r4 + (-1)
            luaj.Varargs r5 = luaj.LuaValue.P2(r2, r5, r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
        L5ca:
            r6 = r5
            goto L5d9
        L5cc:
            int r6 = r3 + 1
            int r9 = r8.U()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            int r5 = r5 - r9
            int r5 = r5 - r6
            luaj.Varargs r5 = luaj.LuaValue.Q2(r2, r6, r5, r8)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> L17f
            goto L5ca
        L5d9:
            r26 = r4
            goto L601
        L5dc:
            int r4 = r3 + 1
            r4 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            int r5 = r3 + 2
            r5 = r2[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            int r6 = r3 + 3
            r6 = r2[r6]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            luaj.Varargs r6 = luaj.LuaValue.M2(r4, r5, r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            goto L601
        L5ed:
            int r4 = r3 + 1
            r4 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            int r5 = r3 + 2
            r5 = r2[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            luaj.Varargs r6 = luaj.LuaValue.N2(r4, r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            goto L601
        L5fa:
            int r4 = r3 + 1
            r6 = r2[r4]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            goto L601
        L5ff:
            r6 = r25
        L601:
            f.c r4 = new f.c     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r5 = r2[r3]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            r4.<init>(r13, r5, r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
            if (r42 != 0) goto L60e
            luaj.Varargs r4 = r4.N()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 java.lang.StackOverflowError -> Lc9 luaj.d -> Ld3
        L60e:
            if (r7 == 0) goto L61e
            r11 = r24
        L612:
            r2 = -1
            int r11 = r11 + r2
            if (r11 < 0) goto L61e
            r2 = r7[r11]
            if (r2 == 0) goto L612
            r2.a()
            goto L612
        L61e:
            if (r28 == 0) goto L625
            if (r42 != 0) goto L625
            r28.l3()
        L625:
            luaj.LuaValue r2 = luaj.LuaValue.f1674f
            r1.V = r2
            int r2 = luaj.LuaClosure.Y
            r3 = 1
            int r2 = r2 - r3
            luaj.LuaClosure.Y = r2
            return r4
        L630:
            r5 = r4
            r35 = r8
            r36 = r12
            r37 = r15
            r15 = r22
            r4 = r30
            r8 = r31
            r12 = r33
            r31 = r10
            r10 = r29
            r6 = r2[r3]     // Catch: java.lang.Throwable -> L8fe java.lang.InterruptedException -> L907 java.lang.StackOverflowError -> L90e luaj.d -> L915
            r1.e3(r6)     // Catch: java.lang.Throwable -> L8fe java.lang.InterruptedException -> L907 java.lang.StackOverflowError -> L90e luaj.d -> L915
            if (r28 == 0) goto L665
            r6 = r2[r3]     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L654 java.lang.NullPointerException -> L658
            boolean r6 = r6.f1()     // Catch: java.lang.Throwable -> Lb8 java.lang.InterruptedException -> Lc1 luaj.d -> Ld3 java.lang.StackOverflowError -> L654 java.lang.NullPointerException -> L658
            if (r6 != 0) goto L665
            r6 = 1
            goto L666
        L654:
            r0 = move-exception
            r2 = r0
            goto L476
        L658:
            r0 = move-exception
            r6 = r8
            r33 = r11
            r9 = r25
            r13 = r28
            r28 = r7
        L662:
            r7 = r0
            goto L865
        L665:
            r6 = 0
        L666:
            if (r6 == 0) goto L6c2
            r22 = r2[r3]     // Catch: java.lang.Throwable -> L6a5 java.lang.InterruptedException -> L6a9 java.lang.StackOverflowError -> L6ad luaj.d -> L6b1 java.lang.NullPointerException -> L6b5
            boolean r22 = r22.g1()     // Catch: java.lang.Throwable -> L6a5 java.lang.InterruptedException -> L6a9 java.lang.StackOverflowError -> L6ad luaj.d -> L6b1 java.lang.NullPointerException -> L6b5
            if (r22 == 0) goto L6b9
            r22 = r2[r3]     // Catch: java.lang.Throwable -> L6a5 java.lang.InterruptedException -> L6a9 java.lang.StackOverflowError -> L6ad luaj.d -> L6b1 java.lang.NullPointerException -> L6b5
            r23 = r6
            luaj.LuaFunction r6 = r22.y0()     // Catch: java.lang.Throwable -> L6a5 java.lang.InterruptedException -> L6a9 java.lang.StackOverflowError -> L6ad luaj.d -> L6b1 java.lang.NullPointerException -> L6b5
            r29 = r10
            r19 = r13
            r13 = r28
            r10 = 0
            r13.j3(r6, r10)     // Catch: java.lang.Throwable -> L683 java.lang.InterruptedException -> L68a java.lang.StackOverflowError -> L68e luaj.d -> L692 java.lang.NullPointerException -> L69c
            goto L6cb
        L683:
            r0 = move-exception
        L684:
            r2 = r0
            r28 = r7
        L687:
            r3 = r11
            goto L1078
        L68a:
            r0 = move-exception
        L68b:
            r2 = r0
            goto Lc5
        L68e:
            r0 = move-exception
        L68f:
            r2 = r0
            goto Lcf
        L692:
            r0 = move-exception
        L693:
            r5 = r0
            r22 = r3
            r28 = r7
        L698:
            r4 = r11
            r3 = r14
            goto L81
        L69c:
            r0 = move-exception
        L69d:
            r28 = r7
            r6 = r8
            r33 = r11
            r9 = r25
            goto L662
        L6a5:
            r0 = move-exception
            r13 = r28
            goto L684
        L6a9:
            r0 = move-exception
            r13 = r28
            goto L68b
        L6ad:
            r0 = move-exception
            r13 = r28
            goto L68f
        L6b1:
            r0 = move-exception
            r13 = r28
            goto L693
        L6b5:
            r0 = move-exception
            r13 = r28
            goto L69d
        L6b9:
            r29 = r10
            r19 = r13
            r13 = r28
            r10 = 0
            r6 = 0
            goto L6cd
        L6c2:
            r23 = r6
            r29 = r10
            r19 = r13
            r13 = r28
            r10 = 0
        L6cb:
            r6 = r23
        L6cd:
            r10 = r14 & (-16384(0xffffffffffffc000, float:NaN))
            switch(r10) {
                case 8388608: goto L80a;
                case 8404992: goto L7fc;
                case 8421376: goto L7e9;
                case 16777216: goto L7ca;
                case 16793600: goto L7ba;
                case 16809984: goto L7a3;
                case 25182208: goto L78e;
                case 25198592: goto L772;
                case 33570816: goto L759;
                case 33587200: goto L736;
                default: goto L6d2;
            }
        L6d2:
            int r26 = r14 >>> 23
            int r10 = r14 >> 14
            r10 = r10 & 511(0x1ff, float:7.16E-43)
            r28 = r7
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L732
            if (r26 <= 0) goto L6f3
            r30 = r9
            int r9 = r3 + 1
            r33 = r11
            int r11 = r26 + (-1)
            luaj.Varargs r9 = luaj.LuaValue.P2(r2, r9, r11)     // Catch: java.lang.Throwable -> L6eb
            goto L704
        L6eb:
            r0 = move-exception
        L6ec:
            r7 = r0
            r27 = r10
        L6ef:
            r9 = r25
            goto L85a
        L6f3:
            r30 = r9
            r33 = r11
            int r9 = r3 + 1
            int r11 = r8.U()     // Catch: java.lang.Throwable -> L6eb
            int r11 = r5 - r11
            int r11 = r11 - r9
            luaj.Varargs r9 = luaj.LuaValue.Q2(r2, r9, r11, r8)     // Catch: java.lang.Throwable -> L6eb
        L704:
            luaj.Varargs r7 = r7.invoke(r9)     // Catch: java.lang.Throwable -> L6eb
            luaj.Varargs r7 = r1.W2(r7)     // Catch: java.lang.Throwable -> L6eb
            if (r10 <= 0) goto L723
            int r8 = r10 + (-1)
            r7.L(r2, r3, r8)     // Catch: java.lang.Throwable -> L71a
            r27 = r10
            r7 = r25
            r9 = r7
            goto L821
        L71a:
            r0 = move-exception
            r8 = r7
            r27 = r10
        L71e:
            r9 = r25
        L720:
            r7 = r0
            goto L85a
        L723:
            int r5 = r7.U()     // Catch: java.lang.Throwable -> L71a
            int r5 = r5 + r3
            luaj.Varargs r7 = r7.M()     // Catch: java.lang.Throwable -> L71a
            r27 = r10
        L72e:
            r9 = r25
            goto L821
        L732:
            r0 = move-exception
            r33 = r11
            goto L6ec
        L736:
            r28 = r7
            r30 = r9
            r33 = r11
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L756
            int r9 = r3 + 1
            r9 = r2[r9]     // Catch: java.lang.Throwable -> L756
            int r10 = r3 + 2
            r10 = r2[r10]     // Catch: java.lang.Throwable -> L756
            int r11 = r3 + 3
            r11 = r2[r11]     // Catch: java.lang.Throwable -> L756
            luaj.LuaValue r7 = r7.call(r9, r10, r11)     // Catch: java.lang.Throwable -> L756
            luaj.LuaValue r7 = r1.V2(r7)     // Catch: java.lang.Throwable -> L756
            r2[r3] = r7     // Catch: java.lang.Throwable -> L756
            goto L807
        L756:
            r0 = move-exception
            r7 = r0
            goto L6ef
        L759:
            r28 = r7
            r30 = r9
            r33 = r11
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L756
            int r9 = r3 + 1
            r9 = r2[r9]     // Catch: java.lang.Throwable -> L756
            int r10 = r3 + 2
            r10 = r2[r10]     // Catch: java.lang.Throwable -> L756
            int r11 = r3 + 3
            r11 = r2[r11]     // Catch: java.lang.Throwable -> L756
            r7.call(r9, r10, r11)     // Catch: java.lang.Throwable -> L756
            goto L807
        L772:
            r28 = r7
            r30 = r9
            r33 = r11
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L756
            int r9 = r3 + 1
            r9 = r2[r9]     // Catch: java.lang.Throwable -> L756
            int r10 = r3 + 2
            r10 = r2[r10]     // Catch: java.lang.Throwable -> L756
            luaj.LuaValue r7 = r7.call(r9, r10)     // Catch: java.lang.Throwable -> L756
            luaj.LuaValue r7 = r1.V2(r7)     // Catch: java.lang.Throwable -> L756
            r2[r3] = r7     // Catch: java.lang.Throwable -> L756
            goto L807
        L78e:
            r28 = r7
            r30 = r9
            r33 = r11
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L756
            int r9 = r3 + 1
            r9 = r2[r9]     // Catch: java.lang.Throwable -> L756
            int r10 = r3 + 2
            r10 = r2[r10]     // Catch: java.lang.Throwable -> L756
            r7.call(r9, r10)     // Catch: java.lang.Throwable -> L756
            goto L807
        L7a3:
            r28 = r7
            r30 = r9
            r33 = r11
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L756
            int r9 = r3 + 1
            r9 = r2[r9]     // Catch: java.lang.Throwable -> L756
            luaj.LuaValue r7 = r7.call(r9)     // Catch: java.lang.Throwable -> L756
            luaj.LuaValue r7 = r1.V2(r7)     // Catch: java.lang.Throwable -> L756
            r2[r3] = r7     // Catch: java.lang.Throwable -> L756
            goto L807
        L7ba:
            r28 = r7
            r30 = r9
            r33 = r11
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L756
            int r9 = r3 + 1
            r9 = r2[r9]     // Catch: java.lang.Throwable -> L756
            r7.call(r9)     // Catch: java.lang.Throwable -> L756
            goto L807
        L7ca:
            r28 = r7
            r30 = r9
            r33 = r11
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L756
            int r9 = r3 + 1
            r9 = r2[r9]     // Catch: java.lang.Throwable -> L756
            luaj.Varargs r7 = r7.invoke(r9)     // Catch: java.lang.Throwable -> L756
            luaj.Varargs r7 = r1.W2(r7)     // Catch: java.lang.Throwable -> L756
            int r5 = r7.U()     // Catch: java.lang.Throwable -> L7e5
            int r5 = r5 + r3
            goto L72e
        L7e5:
            r0 = move-exception
            r8 = r7
            goto L71e
        L7e9:
            r28 = r7
            r30 = r9
            r33 = r11
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L756
            luaj.LuaValue r7 = r7.call()     // Catch: java.lang.Throwable -> L756
            luaj.LuaValue r7 = r1.V2(r7)     // Catch: java.lang.Throwable -> L756
            r2[r3] = r7     // Catch: java.lang.Throwable -> L756
            goto L807
        L7fc:
            r28 = r7
            r30 = r9
            r33 = r11
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L756
            r7.call()     // Catch: java.lang.Throwable -> L756
        L807:
            r7 = r8
            goto L72e
        L80a:
            r28 = r7
            r30 = r9
            r33 = r11
            r7 = r2[r3]     // Catch: java.lang.Throwable -> L857
            r9 = r25
            luaj.Varargs r7 = r7.invoke(r9)     // Catch: java.lang.Throwable -> L854
            luaj.Varargs r7 = r1.W2(r7)     // Catch: java.lang.Throwable -> L854
            int r5 = r7.U()     // Catch: java.lang.Throwable -> L850
            int r5 = r5 + r3
        L821:
            if (r6 == 0) goto L846
            r13.l3()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835 java.lang.NullPointerException -> L842
            goto L846
        L827:
            r0 = move-exception
        L828:
            r2 = r0
            r3 = r33
            goto L1078
        L82d:
            r0 = move-exception
        L82e:
            r2 = r0
            goto L108a
        L831:
            r0 = move-exception
        L832:
            r2 = r0
            goto L1095
        L835:
            r0 = move-exception
        L836:
            r5 = r0
            r22 = r3
            r3 = r14
        L83a:
            r6 = r26
        L83c:
            r11 = r27
        L83e:
            r4 = r33
            goto L10b8
        L842:
            r0 = move-exception
            r6 = r7
            goto L662
        L846:
            r23 = r3
            r6 = r7
        L849:
            r7 = r31
            r11 = r33
        L84d:
            r3 = 1
            goto Lffa
        L850:
            r0 = move-exception
            r8 = r7
            goto L720
        L854:
            r0 = move-exception
            goto L720
        L857:
            r0 = move-exception
            goto L71e
        L85a:
            if (r6 == 0) goto L864
            r13.l3()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835 java.lang.NullPointerException -> L860
            goto L864
        L860:
            r0 = move-exception
            r7 = r0
            r6 = r8
            goto L865
        L864:
            throw r7     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835 java.lang.NullPointerException -> L860
        L865:
            java.lang.String r8 = ""
            r10 = r14 & (-16384(0xffffffffffffc000, float:NaN))
            java.lang.String r11 = ", "
            switch(r10) {
                case 8388608: goto L8cf;
                case 8404992: goto L8d3;
                case 8421376: goto L8d3;
                case 16777216: goto L8c6;
                case 16793600: goto L8c6;
                case 16809984: goto L8c6;
                case 25182208: goto L8af;
                case 25198592: goto L8af;
                case 33570816: goto L88a;
                case 33587200: goto L88a;
                default: goto L86e;
            }
        L86e:
            if (r26 <= 0) goto L879
            int r5 = r3 + 1
            int r6 = r26 + (-1)
            luaj.Varargs r5 = luaj.LuaValue.P2(r2, r5, r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto L885
        L879:
            int r8 = r3 + 1
            int r9 = r6.U()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r5 = r5 - r9
            int r5 = r5 - r8
            luaj.Varargs r5 = luaj.LuaValue.Q2(r2, r8, r5, r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
        L885:
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto L8d3
        L88a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.<init>()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r6 = r3 + 1
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.append(r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.append(r11)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r6 = r3 + 2
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.append(r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.append(r11)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r6 = r3 + 3
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.append(r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
        L8aa:
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto L8d3
        L8af:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.<init>()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r6 = r3 + 1
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.append(r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.append(r11)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r6 = r3 + 2
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.append(r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto L8aa
        L8c6:
            int r5 = r3 + 1
            r5 = r2[r5]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto L8d3
        L8cf:
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
        L8d3:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r6.<init>()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r6.append(r12)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r9 = r2[r3]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r6.append(r9)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r6.append(r15)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r6.append(r8)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r6.append(r4)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5.initCause(r7)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            throw r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
        L8fe:
            r0 = move-exception
            r33 = r11
            r13 = r28
            r28 = r7
            goto L828
        L907:
            r0 = move-exception
            r13 = r28
            r28 = r7
            goto L82e
        L90e:
            r0 = move-exception
        L90f:
            r13 = r28
            r28 = r7
            goto L832
        L915:
            r0 = move-exception
            r33 = r11
            r13 = r28
            r28 = r7
            goto L836
        L91e:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            boolean r7 = r6.w2()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r10 = r14 & r23
            if (r10 == 0) goto L945
            r10 = 1
            goto L946
        L945:
            r10 = 0
        L946:
            if (r7 == r10) goto L951
        L948:
            int r11 = r33 + 1
        L94a:
            r23 = r3
        L94c:
            r6 = r8
            r7 = r31
            goto L84d
        L951:
            r2[r3] = r6     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
        L953:
            r34 = r5
            r7 = r31
            goto Lf15
        L959:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            r6 = r2[r3]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            boolean r6 = r6.w2()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r7 = r14 & r23
            if (r7 == 0) goto L97e
            r7 = 1
            goto L97f
        L97e:
            r7 = 0
        L97f:
            if (r6 == r7) goto L953
            goto L948
        L982:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r7 = 255(0xff, float:3.57E-43)
            if (r6 <= r7) goto L9ad
            r7 = r6 & 255(0xff, float:3.57E-43)
            r7 = r30[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
            goto L9af
        L9a6:
            r0 = move-exception
            r5 = r0
            r22 = r3
        L9aa:
            r3 = r14
            goto L83c
        L9ad:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
        L9af:
            int r10 = r14 >> 14
            r11 = r10 & 511(0x1ff, float:7.16E-43)
            r12 = 255(0xff, float:3.57E-43)
            if (r11 <= r12) goto L9c3
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r30[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto L9c5
        L9bc:
            r0 = move-exception
            r5 = r0
            r22 = r3
        L9c0:
            r3 = r14
            goto L83e
        L9c3:
            r10 = r2[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
        L9c5:
            boolean r7 = r7.v1(r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            if (r3 == 0) goto L9cd
            r10 = 1
            goto L9ce
        L9cd:
            r10 = 0
        L9ce:
            if (r7 == r10) goto L9dd
        L9d0:
            int r7 = r33 + 1
            r23 = r3
            r26 = r6
            r6 = r8
            r27 = r11
            r3 = 1
            r11 = r7
            goto L4cb
        L9dd:
            r23 = r3
            r26 = r6
            r6 = r8
            r27 = r11
            goto L849
        L9e6:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r7 = 255(0xff, float:3.57E-43)
            if (r6 <= r7) goto La0a
            r7 = r6 & 255(0xff, float:3.57E-43)
            r7 = r30[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
            goto La0c
        La0a:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
        La0c:
            int r10 = r14 >> 14
            r11 = r10 & 511(0x1ff, float:7.16E-43)
            r12 = 255(0xff, float:3.57E-43)
            if (r11 <= r12) goto La19
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r30[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto La1b
        La19:
            r10 = r2[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
        La1b:
            boolean r7 = r7.u1(r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            if (r3 == 0) goto La23
            r10 = 1
            goto La24
        La23:
            r10 = 0
        La24:
            if (r7 == r10) goto L9dd
            goto L9d0
        La27:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r7 = 255(0xff, float:3.57E-43)
            if (r6 <= r7) goto La4b
            r7 = r6 & 255(0xff, float:3.57E-43)
            r7 = r30[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
            goto La4d
        La4b:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
        La4d:
            int r10 = r14 >> 14
            r11 = r10 & 511(0x1ff, float:7.16E-43)
            r12 = 255(0xff, float:3.57E-43)
            if (r11 <= r12) goto La5a
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r30[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto La5c
        La5a:
            r10 = r2[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
        La5c:
            boolean r7 = r7.P0(r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            if (r3 == 0) goto La64
            r10 = 1
            goto La65
        La64:
            r10 = 0
        La65:
            if (r7 == r10) goto L9dd
            goto L9d0
        La69:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 14
            int r6 = r6 - r32
            int r11 = r33 + r6
            if (r3 <= 0) goto L94a
            int r3 = r3 + (-1)
            if (r28 == 0) goto L94a
            r7 = r24
        La90:
            r6 = -1
            int r7 = r7 + r6
            if (r7 < 0) goto Lab0
            r6 = r28[r7]     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Laa7
            if (r6 == 0) goto La90
            int r10 = r6.f1729b     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Laa7
            if (r10 < r3) goto La90
            r6.a()     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Laa7
            r6 = 0
            r28[r7] = r6     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Laa7
            goto La90
        Laa3:
            r0 = move-exception
            r2 = r0
            goto L687
        Laa7:
            r0 = move-exception
            r5 = r0
            r22 = r3
            r6 = r7
            r4 = r11
            r3 = r14
            goto L83
        Lab0:
            r23 = r3
            r26 = r7
            goto L94c
        Lab6:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            int r7 = r14 >> 14
            r7 = r7 & 511(0x1ff, float:7.16E-43)
            int r10 = r6 + 1
            if (r7 <= r10) goto Laff
            r10 = r2[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lae9
            f.a r10 = r10.s0()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lae9
        Ladf:
            r11 = -1
            int r7 = r7 + r11
            if (r7 < r6) goto Laf0
            r11 = r2[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lae9
            r10.g(r11)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lae9
            goto Ladf
        Lae9:
            r0 = move-exception
            r5 = r0
            r22 = r3
            r11 = r7
            goto L9c0
        Laf0:
            luaj.LuaValue r10 = r10.m()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lae9
            r2[r3] = r10     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lae9
        Laf6:
            r23 = r3
            r26 = r6
            r27 = r7
            r6 = r8
            goto L849
        Laff:
            int r10 = r7 + (-1)
            r10 = r2[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lae9
            r11 = r2[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lae9
            luaj.LuaValue r10 = r10.K0(r11)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lae9
            r2[r3] = r10     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lae9
            goto Laf6
        Lb0c:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            luaj.LuaValue r6 = r6.r1()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r2[r3] = r6     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto L953
        Lb31:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            luaj.LuaValue r6 = r6.B1()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r2[r3] = r6     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto L953
        Lb56:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            luaj.LuaValue r6 = r6.A1()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r2[r3] = r6     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto L953
        Lb7b:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r7 = 255(0xff, float:3.57E-43)
            if (r6 <= r7) goto Lb9f
            r7 = r6 & 255(0xff, float:3.57E-43)
            r7 = r30[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
            goto Lba1
        Lb9f:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
        Lba1:
            int r10 = r14 >> 14
            r11 = r10 & 511(0x1ff, float:7.16E-43)
            r12 = 255(0xff, float:3.57E-43)
            if (r11 <= r12) goto Lbae
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r30[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto Lbb0
        Lbae:
            r10 = r2[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
        Lbb0:
            luaj.LuaValue r7 = r7.Q1(r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            r2[r3] = r7     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto L9dd
        Lbb8:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r7 = 255(0xff, float:3.57E-43)
            if (r6 <= r7) goto Lbdc
            r7 = r6 & 255(0xff, float:3.57E-43)
            r7 = r30[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
            goto Lbde
        Lbdc:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
        Lbde:
            int r10 = r14 >> 14
            r11 = r10 & 511(0x1ff, float:7.16E-43)
            r12 = 255(0xff, float:3.57E-43)
            if (r11 <= r12) goto Lbeb
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r30[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto Lbed
        Lbeb:
            r10 = r2[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
        Lbed:
            luaj.LuaValue r7 = r7.y1(r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            r2[r3] = r7     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto L9dd
        Lbf5:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r7 = 255(0xff, float:3.57E-43)
            if (r6 <= r7) goto Lc19
            r7 = r6 & 255(0xff, float:3.57E-43)
            r7 = r30[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
            goto Lc1b
        Lc19:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
        Lc1b:
            int r10 = r14 >> 14
            r11 = r10 & 511(0x1ff, float:7.16E-43)
            r12 = 255(0xff, float:3.57E-43)
            if (r11 <= r12) goto Lc28
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r30[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto Lc2a
        Lc28:
            r10 = r2[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
        Lc2a:
            luaj.LuaValue r7 = r7.O0(r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            r2[r3] = r7     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto L9dd
        Lc32:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r7 = 255(0xff, float:3.57E-43)
            if (r6 <= r7) goto Lc56
            r7 = r6 & 255(0xff, float:3.57E-43)
            r7 = r30[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
            goto Lc58
        Lc56:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
        Lc58:
            int r10 = r14 >> 14
            r11 = r10 & 511(0x1ff, float:7.16E-43)
            r12 = 255(0xff, float:3.57E-43)
            if (r11 <= r12) goto Lc65
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r30[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto Lc67
        Lc65:
            r10 = r2[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
        Lc67:
            luaj.LuaValue r7 = r7.z1(r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            r2[r3] = r7     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto L9dd
        Lc6f:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r7 = 255(0xff, float:3.57E-43)
            if (r6 <= r7) goto Lc93
            r7 = r6 & 255(0xff, float:3.57E-43)
            r7 = r30[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
            goto Lc95
        Lc93:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
        Lc95:
            int r10 = r14 >> 14
            r11 = r10 & 511(0x1ff, float:7.16E-43)
            r12 = 255(0xff, float:3.57E-43)
            if (r11 <= r12) goto Lca2
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r30[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto Lca4
        Lca2:
            r10 = r2[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
        Lca4:
            luaj.LuaValue r7 = r7.r2(r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            r2[r3] = r7     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto L9dd
        Lcac:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r14 >>> 23
            r7 = 255(0xff, float:3.57E-43)
            if (r6 <= r7) goto Lcd0
            r7 = r6 & 255(0xff, float:3.57E-43)
            r7 = r30[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
            goto Lcd2
        Lcd0:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9a6
        Lcd2:
            int r10 = r14 >> 14
            r11 = r10 & 511(0x1ff, float:7.16E-43)
            r12 = 255(0xff, float:3.57E-43)
            if (r11 <= r12) goto Lcdf
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r30[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto Lce1
        Lcdf:
            r10 = r2[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
        Lce1:
            luaj.LuaValue r7 = r7.j0(r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            r2[r3] = r7     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L9bc
            goto L9dd
        Lce9:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            int r6 = r3 + 1
            int r7 = r14 >>> 23
            r7 = r2[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r2[r6] = r7     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r6 = r14 >> 14
            r10 = r6 & 511(0x1ff, float:7.16E-43)
            r11 = 255(0xff, float:3.57E-43)
            if (r10 <= r11) goto Ld21
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r30[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
            goto Ld23
        Ld17:
            r0 = move-exception
            r5 = r0
            r22 = r3
            r11 = r10
            r3 = r14
            r6 = r26
            goto L83e
        Ld21:
            r6 = r2[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
        Ld23:
            luaj.LuaValue r6 = r7.U0(r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
            r2[r3] = r6     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
            r23 = r3
            r6 = r8
            r27 = r10
            goto L849
        Ld30:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            luaj.LuaTable r6 = new luaj.LuaTable     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r7 = r14 >>> 23
            int r10 = r14 >> 14
            r10 = r10 & 511(0x1ff, float:7.16E-43)
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r2[r3] = r6     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto L953
        Ld58:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r31 = r10
            r9 = r25
            r6 = r2[r3]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r7 = r14 >>> 23
            r10 = 255(0xff, float:3.57E-43)
            if (r7 <= r10) goto Ld85
            r10 = r7 & 255(0xff, float:3.57E-43)
            r10 = r30[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld7e
            goto Ld87
        Ld7e:
            r0 = move-exception
            r5 = r0
            r22 = r3
            r6 = r7
            goto L9aa
        Ld85:
            r10 = r2[r7]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld7e
        Ld87:
            int r11 = r14 >> 14
            r12 = r11 & 511(0x1ff, float:7.16E-43)
            r15 = 255(0xff, float:3.57E-43)
            if (r12 <= r15) goto Ld9c
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r30[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld94
            goto Ld9e
        Ld94:
            r0 = move-exception
            r5 = r0
            r22 = r3
            r6 = r7
            r11 = r12
            goto L9c0
        Ld9c:
            r11 = r2[r12]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld94
        Ld9e:
            r6.j2(r10, r11)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld94
            r23 = r3
            r26 = r7
            r6 = r8
            r27 = r12
            goto L849
        Ldaa:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            int r6 = r7.length     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r10 = r14 >>> 23
            if (r10 >= r6) goto Ldd2
            r6 = r7[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r10 = r2[r3]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r6.c(r10)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r34 = r5
            goto Lf15
        Ldd2:
            r5 = 4
            luaj.d r5 = g3(r5, r10, r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            throw r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
        Ldd8:
            r5 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            int r6 = r7.length     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            if (r3 >= r6) goto Le37
            r6 = r7[r3]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            luaj.LuaValue r6 = r6.b()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r10 = r14 >>> 23
            r11 = 255(0xff, float:3.57E-43)
            if (r10 <= r11) goto Le0b
            r11 = r10 & 255(0xff, float:3.57E-43)
            r11 = r30[r11]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Le04
            goto Le0d
        Le04:
            r0 = move-exception
            r5 = r0
            r22 = r3
            r6 = r10
            goto L9aa
        Le0b:
            r11 = r2[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Le04
        Le0d:
            int r12 = r14 >> 14
            r15 = r12 & 511(0x1ff, float:7.16E-43)
            r34 = r5
            r5 = 255(0xff, float:3.57E-43)
            if (r15 <= r5) goto Le25
            r5 = r12 & 255(0xff, float:3.57E-43)
            r5 = r30[r5]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Le1c
            goto Le27
        Le1c:
            r0 = move-exception
            r5 = r0
            r22 = r3
            r6 = r10
            r3 = r14
            r11 = r15
            goto L83e
        Le25:
            r5 = r2[r15]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Le1c
        Le27:
            r6.j2(r11, r5)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Le1c
            r23 = r3
            r6 = r8
            r26 = r10
            r27 = r15
        Le31:
            r11 = r33
        Le33:
            r5 = r34
            goto L84d
        Le37:
            r5 = 3
            luaj.d r5 = g3(r5, r3, r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            throw r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
        Le3d:
            r34 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            int r5 = r14 >>> 23
            r5 = r2[r5]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r6 = r14 >> 14
            r10 = r6 & 511(0x1ff, float:7.16E-43)
            r11 = 255(0xff, float:3.57E-43)
            if (r10 <= r11) goto Le67
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r30[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
            goto Le69
        Le67:
            r6 = r2[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
        Le69:
            luaj.LuaValue r5 = r5.U0(r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
            r2[r3] = r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
        Le6f:
            r23 = r3
            r6 = r8
            r27 = r10
            goto Le31
        Le75:
            r34 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            int r5 = r7.length     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r10 = r14 >>> 23
            if (r10 >= r5) goto Leaf
            r5 = r7[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            luaj.LuaValue r5 = r5.b()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r6 = r14 >> 14
            r10 = r6 & 511(0x1ff, float:7.16E-43)
            r11 = 255(0xff, float:3.57E-43)
            if (r10 <= r11) goto Lea6
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r30[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
            goto Lea8
        Lea6:
            r6 = r2[r10]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
        Lea8:
            luaj.LuaValue r5 = r5.U0(r6)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
            r2[r3] = r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Ld17
            goto Le6f
        Leaf:
            luaj.d r5 = g3(r6, r10, r5)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            throw r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
        Leb4:
            r34 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            int r5 = r7.length     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            int r6 = r14 >>> 23
            if (r6 >= r5) goto Ledb
            r5 = r7[r6]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            luaj.LuaValue r5 = r5.b()     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r2[r3] = r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto Lf15
        Ledb:
            r7 = 1
            luaj.d r5 = g3(r7, r6, r5)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            throw r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
        Lee1:
            r34 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            int r5 = r14 >>> 23
        Lefc:
            int r26 = r5 + (-1)
            if (r5 < 0) goto Lf15
            int r5 = r3 + 1
            r2[r3] = r16     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> Lf08
            r3 = r5
            r5 = r26
            goto Lefc
        Lf08:
            r0 = move-exception
            r22 = r5
            r3 = r14
            r6 = r26
            r11 = r27
            r4 = r33
        Lf12:
            r5 = r0
            goto L10b8
        Lf15:
            r23 = r3
            r6 = r8
            goto Le31
        Lf1a:
            r34 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            int r5 = r14 >>> 23
            if (r5 == 0) goto Lf3a
            r5 = r17
            goto Lf3c
        Lf3a:
            r5 = r18
        Lf3c:
            r2[r3] = r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r5 = r14 & r23
            if (r5 == 0) goto Lf15
            int r11 = r33 + 1
            r23 = r3
        Lf46:
            r6 = r8
            goto Le33
        Lf49:
            r34 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            int r11 = r33 + 1
            r5 = r35[r11]     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lfb2
            r6 = r5 & 63
            r10 = 39
            if (r6 == r10) goto Lfa8
            luaj.d r7 = new luaj.d     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            r8.<init>()     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            java.lang.String r9 = "EXTRAARG expected after LOADKX, got "
            r8.append(r9)     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            java.lang.String[] r9 = luaj.g.f1715c     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            int r10 = r9.length     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            r12 = 1
            int r10 = r10 - r12
            if (r6 >= r10) goto Lf8c
            r6 = r9[r6]     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            goto Lf9d
        Lf82:
            r0 = move-exception
            r22 = r3
            r3 = r5
            r4 = r11
            r6 = r26
            r11 = r27
            goto Lf12
        Lf8c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            r9.<init>()     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            java.lang.String r10 = "UNKNOWN_OP_"
            r9.append(r10)     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            r9.append(r6)     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            java.lang.String r6 = r9.toString()     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
        Lf9d:
            r8.append(r6)     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            java.lang.String r6 = r8.toString()     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            r7.<init>(r6)     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            throw r7     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
        Lfa8:
            int r6 = r5 >>> 6
            r6 = r30[r6]     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            r2[r3] = r6     // Catch: java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 java.lang.Throwable -> Laa3 luaj.d -> Lf82
            r23 = r3
            r14 = r5
            goto Lf46
        Lfb2:
            r0 = move-exception
            r5 = r0
            r22 = r3
            goto L698
        Lfb8:
            r34 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            int r5 = r14 >>> 14
            r5 = r30[r5]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r2[r3] = r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto Lf15
        Lfd9:
            r34 = r4
            r35 = r8
            r33 = r11
            r36 = r12
            r19 = r13
            r37 = r15
            r13 = r28
            r4 = r30
            r8 = r31
            r28 = r7
            r30 = r9
            r7 = r10
            r9 = r25
            int r5 = r14 >>> 23
            r5 = r2[r5]     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            r2[r3] = r5     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L835
            goto Lf15
        Lffa:
            int r11 = r11 + r3
            r10 = r7
            r25 = r9
            r22 = r14
            r7 = r28
            r3 = r29
            r9 = r30
            r8 = r35
            r12 = r36
            r15 = r37
            r14 = r13
            r13 = r19
            r38 = r5
            r5 = r4
            r4 = r38
            goto L54
        L1016:
            r0 = move-exception
            r4 = r5
            goto L90f
        L101a:
            r0 = move-exception
            r33 = r11
            r13 = r28
            r28 = r7
        L1021:
            r5 = r0
            r3 = r22
            r22 = r23
            goto L83a
        L1028:
            r0 = move-exception
            r28 = r7
            r33 = r11
            r13 = r14
            goto L828
        L1030:
            r0 = move-exception
            r28 = r7
        L1033:
            r13 = r14
            goto L82e
        L1036:
            r0 = move-exception
            r4 = r5
            r28 = r7
        L103a:
            r13 = r14
            goto L832
        L103d:
            r0 = move-exception
            r28 = r7
            r33 = r11
            r13 = r14
            goto L1021
        L1044:
            r4 = r5
            r28 = r7
            r33 = r11
            r13 = r14
            java.lang.InterruptedException r3 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L1052
            java.lang.String r5 = "Script thread interrupted"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L1052
            throw r3     // Catch: java.lang.Throwable -> L827 java.lang.InterruptedException -> L82d java.lang.StackOverflowError -> L831 luaj.d -> L1052
        L1052:
            r0 = move-exception
            goto L1021
        L1054:
            r0 = move-exception
            r28 = r7
            r24 = r11
            r13 = r14
            r2 = r0
            r3 = 0
            goto L1078
        L105d:
            r0 = move-exception
            r28 = r7
            r24 = r11
            goto L1033
        L1063:
            r0 = move-exception
            r4 = r5
            r28 = r7
            r24 = r11
            goto L103a
        L106a:
            r0 = move-exception
            r28 = r7
            r24 = r11
            r13 = r14
            r5 = r0
            r3 = 0
            r4 = 0
            r6 = 0
            r11 = 0
            r22 = 0
            goto L10b8
        L1078:
            luaj.d$a r4 = new luaj.d$a     // Catch: java.lang.Throwable -> L1086
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L1086
            luaj.Globals r2 = r1.T     // Catch: java.lang.Throwable -> L1086
            luaj.h r5 = r1.R     // Catch: java.lang.Throwable -> L1086
            r6 = 0
            c3(r2, r4, r5, r3, r6)     // Catch: java.lang.Throwable -> L1086
            throw r4     // Catch: java.lang.Throwable -> L1086
        L1086:
            r0 = move-exception
            r2 = r0
            goto L11ed
        L108a:
            java.lang.String r3 = "Interrupted closure"
            android.ext.e1.s(r3, r2)     // Catch: java.lang.Throwable -> L1086
            luaj.d r3 = new luaj.d     // Catch: java.lang.Throwable -> L1086
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1086
            throw r3     // Catch: java.lang.Throwable -> L1086
        L1095:
            java.lang.String r3 = r2.getMessage()     // Catch: java.lang.Throwable -> L1086
            luaj.d$b r5 = new luaj.d$b     // Catch: java.lang.Throwable -> L1086
            if (r3 != 0) goto L10a0
            java.lang.String r3 = "stack overflow"
            goto L10b4
        L10a0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1086
            r6.<init>()     // Catch: java.lang.Throwable -> L1086
            java.lang.String r7 = "stack overflow ("
            r6.append(r7)     // Catch: java.lang.Throwable -> L1086
            r6.append(r3)     // Catch: java.lang.Throwable -> L1086
            r6.append(r4)     // Catch: java.lang.Throwable -> L1086
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L1086
        L10b4:
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L1086
            throw r5     // Catch: java.lang.Throwable -> L1086
        L10b8:
            java.lang.String r7 = r5.f1710e     // Catch: java.lang.Throwable -> L1086
            if (r7 != 0) goto L119f
            r7 = r3 & 63
            switch(r7) {
                case 5: goto L1152;
                case 6: goto L1152;
                case 7: goto L114f;
                case 8: goto L114c;
                case 9: goto L1152;
                case 10: goto L1149;
                case 11: goto L10c1;
                case 12: goto L114f;
                case 13: goto L112b;
                case 14: goto L112b;
                case 15: goto L112b;
                case 16: goto L112b;
                case 17: goto L112b;
                case 18: goto L112b;
                case 19: goto L114f;
                case 20: goto L114f;
                case 21: goto L114f;
                case 22: goto L10f9;
                case 23: goto L10c1;
                case 24: goto L10c1;
                case 25: goto L10df;
                case 26: goto L10df;
                case 27: goto L1149;
                case 28: goto L114f;
                case 29: goto L1149;
                case 30: goto L1149;
                case 31: goto L10c1;
                case 32: goto L10c1;
                case 33: goto L10c1;
                case 34: goto L1149;
                case 35: goto L10c1;
                case 36: goto L1149;
                case 37: goto L10c1;
                case 38: goto L10c1;
                case 39: goto L10c1;
                case 40: goto L112b;
                case 41: goto L114f;
                case 42: goto L10c3;
                case 43: goto L10c3;
                case 44: goto L10c3;
                case 45: goto L10c3;
                case 46: goto L10c3;
                default: goto L10c1;
            }     // Catch: java.lang.Throwable -> L1086
        L10c1:
            goto L1146
        L10c3:
            r3 = 255(0xff, float:3.57E-43)
            if (r6 > r3) goto L10d3
            r3 = r2[r6]     // Catch: java.lang.Throwable -> L1086
            boolean r3 = r3.k1()     // Catch: java.lang.Throwable -> L1086
            if (r3 != 0) goto L10d1
            goto L1137
        L10d1:
            r3 = 255(0xff, float:3.57E-43)
        L10d3:
            if (r11 > r3) goto L1146
            r2 = r2[r11]     // Catch: java.lang.Throwable -> L1086
            boolean r2 = r2.k1()     // Catch: java.lang.Throwable -> L1086
            if (r2 != 0) goto L1146
            goto L1144
        L10df:
            r3 = 255(0xff, float:3.57E-43)
            if (r6 > r3) goto L10ee
            r3 = r2[r6]     // Catch: java.lang.Throwable -> L1086
            boolean r3 = r3.n1()     // Catch: java.lang.Throwable -> L1086
            if (r3 != 0) goto L10ec
            goto L1137
        L10ec:
            r3 = 255(0xff, float:3.57E-43)
        L10ee:
            if (r11 > r3) goto L1146
            r2 = r2[r11]     // Catch: java.lang.Throwable -> L1086
            boolean r2 = r2.n1()     // Catch: java.lang.Throwable -> L1086
            if (r2 != 0) goto L1146
            goto L1144
        L10f9:
            int r6 = r3 >>> 23
            int r3 = r3 >> 14
            r3 = r3 & 511(0x1ff, float:7.16E-43)
            r7 = 1
            int r6 = r6 + r7
            if (r3 <= r6) goto L1117
            r6 = r2[r11]     // Catch: java.lang.Throwable -> L1086
            boolean r6 = r6.n1()     // Catch: java.lang.Throwable -> L1086
            if (r6 != 0) goto L110c
            goto L1144
        L110c:
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L1086
            boolean r2 = r2.n1()     // Catch: java.lang.Throwable -> L1086
            if (r2 != 0) goto L1146
        L1114:
            r6 = r3
        L1115:
            r3 = -1
            goto L1155
        L1117:
            int r3 = r11 + (-1)
            r6 = r2[r3]     // Catch: java.lang.Throwable -> L1086
            boolean r6 = r6.n1()     // Catch: java.lang.Throwable -> L1086
            if (r6 != 0) goto L1122
            goto L1114
        L1122:
            r2 = r2[r11]     // Catch: java.lang.Throwable -> L1086
            boolean r2 = r2.n1()     // Catch: java.lang.Throwable -> L1086
            if (r2 != 0) goto L1146
            goto L1144
        L112b:
            r3 = 255(0xff, float:3.57E-43)
            if (r6 > r3) goto L113a
            r3 = r2[r6]     // Catch: java.lang.Throwable -> L1086
            boolean r3 = r3.m1()     // Catch: java.lang.Throwable -> L1086
            if (r3 != 0) goto L1138
        L1137:
            goto L1115
        L1138:
            r3 = 255(0xff, float:3.57E-43)
        L113a:
            if (r11 > r3) goto L1146
            r2 = r2[r11]     // Catch: java.lang.Throwable -> L1086
            boolean r2 = r2.m1()     // Catch: java.lang.Throwable -> L1086
            if (r2 != 0) goto L1146
        L1144:
            r6 = r11
            goto L1115
        L1146:
            r3 = -1
        L1147:
            r6 = -1
            goto L1155
        L1149:
            r6 = r22
            goto L1115
        L114c:
            r3 = r22
            goto L1147
        L114f:
            int r3 = r3 >>> 23
            goto L1114
        L1152:
            int r3 = r3 >>> 23
            goto L1147
        L1155:
            if (r3 < 0) goto L117c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1086
            r2.<init>()     // Catch: java.lang.Throwable -> L1086
            java.lang.String r6 = "upvalue '"
            r2.append(r6)     // Catch: java.lang.Throwable -> L1086
            luaj.h r6 = r1.R     // Catch: java.lang.Throwable -> L1086
            f.d[] r6 = r6.f1726f     // Catch: java.lang.Throwable -> L1086
            int r7 = r6.length     // Catch: java.lang.Throwable -> L1086
            if (r3 >= r7) goto L116d
            r3 = r6[r3]     // Catch: java.lang.Throwable -> L1086
            luaj.LuaString r3 = r3.f1563a     // Catch: java.lang.Throwable -> L1086
            goto L116f
        L116d:
            java.lang.String r3 = "?"
        L116f:
            r2.append(r3)     // Catch: java.lang.Throwable -> L1086
            java.lang.String r3 = "'"
            r2.append(r3)     // Catch: java.lang.Throwable -> L1086
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1086
            goto L1182
        L117c:
            luaj.h r2 = r1.R     // Catch: java.lang.Throwable -> L1086
            java.lang.String r2 = luaj.lib.DebugLib.f3(r4, r6, r2)     // Catch: java.lang.Throwable -> L1086
        L1182:
            if (r2 == 0) goto L1198
            java.lang.String r3 = "method "
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> L1086
            if (r3 == 0) goto L1198
            boolean r3 = r5 instanceof luaj.c     // Catch: java.lang.Throwable -> L1086
            if (r3 == 0) goto L1198
            luaj.c r3 = new luaj.c     // Catch: java.lang.Throwable -> L1086
            luaj.c r5 = (luaj.c) r5     // Catch: java.lang.Throwable -> L1086
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1086
            r5 = r3
        L1198:
            luaj.Globals r3 = r1.T     // Catch: java.lang.Throwable -> L1086
            luaj.h r6 = r1.R     // Catch: java.lang.Throwable -> L1086
            c3(r3, r5, r6, r4, r2)     // Catch: java.lang.Throwable -> L1086
        L119f:
            boolean r2 = r5 instanceof luaj.d.b     // Catch: java.lang.Throwable -> L1086
            if (r2 == 0) goto L11ec
            int r2 = luaj.LuaClosure.Y     // Catch: java.lang.Throwable -> L1086
            r3 = 1
            if (r2 != r3) goto L11ec
            java.lang.Throwable r2 = r5.getCause()     // Catch: java.lang.Throwable -> L1086
            if (r2 == 0) goto L11ec
            java.lang.String r3 = r2.getMessage()     // Catch: java.lang.Throwable -> L1086
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1086
            r4.<init>()     // Catch: java.lang.Throwable -> L1086
            java.lang.String r6 = "Stack overflow 1: "
            r4.append(r6)     // Catch: java.lang.Throwable -> L1086
            r4.append(r3)     // Catch: java.lang.Throwable -> L1086
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L1086
            android.ext.e1.p(r3)     // Catch: java.lang.Throwable -> L1086
            java.lang.String r3 = "Stack overflow 2"
            android.ext.e1.s(r3, r2)     // Catch: java.lang.Throwable -> L11cc
            goto L11ec
        L11cc:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = "Stack overflow 3"
            android.ext.e1.s(r3, r2)     // Catch: java.lang.Throwable -> L11d4
            goto L11ec
        L11d4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1086
            r3.<init>()     // Catch: java.lang.Throwable -> L1086
            java.lang.String r4 = "Stack overflow 4: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1086
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1086
            r3.append(r2)     // Catch: java.lang.Throwable -> L1086
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L1086
            android.ext.e1.p(r2)     // Catch: java.lang.Throwable -> L1086
        L11ec:
            throw r5     // Catch: java.lang.Throwable -> L1086
        L11ed:
            if (r28 == 0) goto L11fd
            r11 = r24
            r3 = -1
        L11f2:
            int r11 = r11 + r3
            if (r11 < 0) goto L11fd
            r4 = r28[r11]
            if (r4 == 0) goto L11f2
            r4.a()
            goto L11f2
        L11fd:
            if (r13 == 0) goto L1204
            if (r42 != 0) goto L1204
            r13.l3()
        L1204:
            luaj.LuaValue r3 = luaj.LuaValue.f1674f
            r1.V = r3
            int r3 = luaj.LuaClosure.Y
            r4 = 1
            int r3 = r3 - r4
            luaj.LuaClosure.Y = r3
            throw r2
    }

    public luaj.Varargs b3() {
            r1 = this;
            luaj.Varargs r0 = r1.V
            return r0
    }

    @Override // luaj.LuaValue
    public final luaj.LuaValue call() {
            r3 = this;
            luaj.LuaValue[] r0 = r3.a3()
            luaj.LuaValue r1 = luaj.LuaValue.f1674f
            r2 = 0
            luaj.Varargs r0 = r3.Y2(r0, r1, r2)
            luaj.LuaValue r0 = r0.w()
            return r0
    }

    @Override // luaj.LuaValue
    public final luaj.LuaValue call(luaj.LuaValue r5) {
            r4 = this;
            luaj.LuaValue[] r0 = r4.a3()
            luaj.h r1 = r4.R
            int r2 = r1.j
            r3 = 0
            if (r2 == 0) goto L18
            r0[r3] = r5
        Ld:
            luaj.LuaValue r5 = luaj.LuaValue.f1674f
        Lf:
            luaj.Varargs r5 = r4.Y2(r0, r5, r3)
            luaj.LuaValue r5 = r5.w()
            return r5
        L18:
            int r1 = r1.k
            if (r1 != 0) goto Lf
            goto Ld
    }

    @Override // luaj.LuaValue
    public final luaj.LuaValue call(luaj.LuaValue r6, luaj.LuaValue r7) {
            r5 = this;
            luaj.LuaValue[] r0 = r5.a3()
            luaj.h r1 = r5.R
            int r2 = r1.j
            r3 = 0
            if (r2 == 0) goto L2a
            r4 = 1
            if (r2 == r4) goto L1d
            r0[r3] = r6
            r0[r4] = r7
        L12:
            luaj.LuaValue r6 = luaj.LuaValue.f1674f
        L14:
            luaj.Varargs r6 = r5.Y2(r0, r6, r3)
        L18:
            luaj.LuaValue r6 = r6.w()
            return r6
        L1d:
            r0[r3] = r6
            int r6 = r1.k
            if (r6 != 0) goto L25
            luaj.LuaValue r7 = luaj.LuaValue.f1674f
        L25:
            luaj.Varargs r6 = r5.Y2(r0, r7, r3)
            goto L18
        L2a:
            int r1 = r1.k
            if (r1 != 0) goto L2f
            goto L12
        L2f:
            luaj.Varargs r6 = luaj.LuaValue.N2(r6, r7)
            goto L14
    }

    @Override // luaj.LuaValue
    public final luaj.LuaValue call(luaj.LuaValue r7, luaj.LuaValue r8, luaj.LuaValue r9) {
            r6 = this;
            luaj.LuaValue[] r0 = r6.a3()
            luaj.h r1 = r6.R
            int r2 = r1.j
            r3 = 0
            if (r2 == 0) goto L3d
            r4 = 1
            if (r2 == r4) goto L31
            r5 = 2
            if (r2 == r5) goto L22
            r0[r3] = r7
            r0[r4] = r8
            r0[r5] = r9
        L17:
            luaj.LuaValue r7 = luaj.LuaValue.f1674f
        L19:
            luaj.Varargs r7 = r6.Y2(r0, r7, r3)
        L1d:
            luaj.LuaValue r7 = r7.w()
            return r7
        L22:
            r0[r3] = r7
            r0[r4] = r8
            int r7 = r1.k
            if (r7 != 0) goto L2c
            luaj.LuaValue r9 = luaj.LuaValue.f1674f
        L2c:
            luaj.Varargs r7 = r6.Y2(r0, r9, r3)
            goto L1d
        L31:
            r0[r3] = r7
            int r7 = r1.k
            if (r7 != 0) goto L38
        L37:
            goto L17
        L38:
            luaj.Varargs r7 = luaj.LuaValue.N2(r8, r9)
            goto L19
        L3d:
            int r1 = r1.k
            if (r1 != 0) goto L42
            goto L37
        L42:
            luaj.Varargs r7 = luaj.LuaValue.M2(r7, r8, r9)
            goto L19
    }

    @Override // luaj.LuaValue
    public boolean f1() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void f3(luaj.Varargs r1) {
            r0 = this;
            r0.V = r1
            return
    }

    @Override // luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "function: "
            r0.append(r1)
            luaj.h r1 = r2.R
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // luaj.LuaValue
    public final luaj.Varargs invoke(luaj.Varargs r2) {
            r1 = this;
            r0 = 0
            luaj.Varargs r2 = r1.D1(r2, r0)
            luaj.Varargs r2 = r2.N()
            return r2
    }

    @Override // luaj.LuaValue
    public luaj.LuaClosure w0() {
            r0 = this;
            return r0
    }
}
