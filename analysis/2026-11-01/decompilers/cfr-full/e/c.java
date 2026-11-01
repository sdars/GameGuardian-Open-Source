/*
 * Decompiled with CFR 0.152.
 */
package e;

import e.a;
import e.e;
import e.f;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class c
implements a {
    static final long[] m = new long[]{-2L, -1L, -1L, -1L};
    static final long[] n = new long[]{0L, 0L, -1L, -1L};
    static final int[] o = e.c.$d2j$hex$8952c603$decode_I("03000000000000000500000031000000210000002200000027000000280000002c0000002d0000000100000002000000010000000200000000000000050000002e0000000300000000000000050000001b00000020000000160000001800000019000000110000001300000014000000210000002200000027000000280000001e0000001f0000002500000026000000290000002a000000320000001f0000002000000025000000260000002a0000002b00000001000000020000002c000000030000000000000005000000190000001e0000001400000016000000170000000f00000011000000120000001f0000002000000025000000260000002f000000300000001c0000001d00000023000000240000002700000028000000250000003200000027000000280000002d0000002e00000020000000210000000100000002000000250000001a000000260000002200000003000000000000000500000027000000280000002d0000002e0000001d0000001e0000002b0000002c000000330000002300000024000000290000002a0000002e0000002f000000030000000400000003000000040000000200000007000000300000000500000002000000070000001d00000022000000180000001a0000001b0000001300000015000000160000000500000002000000070000002300000024000000290000002a0000002000000021000000");
    public static final String[] p = new String[]{"", null, null, null, null, "MOVE", "LOADK", "LOADBOOL", "LOADNIL", "GETUPVAL", "GETTABUP", "GETTABLE", "SETTABUP", "SETUPVAL", "SETTABLE", "NEWTABLE", "SELF", "ADD", "SUB", "MUL", "DIV", "MOD", "POW", "UNM", "NOT", "LEN", "CONCAT", "JMP", "EQ", "LT", "LE", "TEST", "TESTSET", "CALL", "TAILCALL", "RETURN", "FORLOOP", "FORPREP", "TFORCALL", "TFORLOOP", "SETLIST", "CLOSURE", "VARARG", "IDIV", "BNOT", "BAND", "BOR", "BXOR", "SHL", "SHR", "CONST", "FUNC[", "GOTO[", "OP", "SET_TOP", "SKIP_NEXT", "nil", "true", "false", null, null, null, ".source", ".linedefined", ".lastlinedefined", ".numparams", ".is_vararg", ".maxstacksize", ".upval", ".line", ".local", ".end local", ".func", ".end", null, "..", null, null, null, null, null, null, null, null, null, null, null, null, "[", "]"};
    public static final String[] q = new String[]{"STATE_NAME", "STATE_SINT", "STATE_V_NAME", "DEFAULT"};
    public static final int[] r = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 0, 3, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, 3, -1, -1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    static final long[] s = new long[]{-31L, 0x313FFFFL};
    static final long[] t = new long[]{30L, 0L};
    static final long[] u = new long[]{16L, 0L};
    public PrintStream b = System.out;
    protected e c;
    private final int[] d = new int[52];
    private final int[] e = new int[104];
    protected char f;
    int g = 3;
    int h = 3;
    int i;
    int j;
    int k;
    int l;

    public c(e e4) {
        this.c = e4;
    }

    private int A(long l3, long l4, long l5, long l6) {
        if ((l4 & l3 | (l6 &= l5)) == 0L) {
            return this.E0(10, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                if (c4 == 'i') {
                    return this.E(l6, 1L);
                }
            } else if ((8L & l6) != 0L) {
                return this.G0(12, 67);
            }
            return this.E0(11, 0L, l6);
        }
        catch (IOException iOException) {
            this.J0(11, 0L, l6);
            return 12;
        }
    }

    private int A0(int n3, int n4, int n5) {
        this.l = n4;
        this.k = n3;
        try {
            this.f = this.c.k();
            return this.k(n5, n3 + 1);
        }
        catch (IOException iOException) {
            return n3 + 1;
        }
    }

    private int B(long l3, long l4, long l5, long l6) {
        if ((l4 & l3 | (l6 &= l5)) == 0L) {
            return this.F0(10, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                if (c4 == 'i') {
                    return this.F(l6, 1L);
                }
            } else if ((8L & l6) != 0L) {
                return this.G0(12, 67);
            }
            return this.F0(11, 0L, l6);
        }
        catch (IOException iOException) {
            this.K0(11, 0L, l6);
            return 12;
        }
    }

    private int B0(int n3, int n4, int n5) {
        this.l = n4;
        this.k = n3;
        try {
            this.f = this.c.k();
            return this.l(n5, n3 + 1);
        }
        catch (IOException iOException) {
            return n3 + 1;
        }
    }

    private int C(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.C0(11, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'n') {
                return this.C0(12, 0L, l4);
            }
            return this.G(l4, 1L);
        }
        catch (IOException iOException) {
            this.H0(12, 0L, l4);
            return 13;
        }
    }

    private final int C0(int n3, long l3, long l4) {
        return this.i(this.H0(n3, l3, l4), n3 + 1);
    }

    private int D(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.D0(11, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'n') {
                return this.D0(12, 0L, l4);
            }
            return this.H(l4, 1L);
        }
        catch (IOException iOException) {
            this.I0(12, 0L, l4);
            return 13;
        }
    }

    private final int D0(int n3, long l3, long l4) {
        return this.j(this.I0(n3, l3, l4), n3 + 1);
    }

    private int E(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.E0(11, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'n') {
                return this.E0(12, 0L, l4);
            }
            return this.I(l4, 1L);
        }
        catch (IOException iOException) {
            this.J0(12, 0L, l4);
            return 13;
        }
    }

    private final int E0(int n3, long l3, long l4) {
        return this.k(this.J0(n3, l3, l4), n3 + 1);
    }

    private int F(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.F0(11, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'n') {
                return this.F0(12, 0L, l4);
            }
            return this.J(l4, 1L);
        }
        catch (IOException iOException) {
            this.K0(12, 0L, l4);
            return 13;
        }
    }

    private final int F0(int n3, long l3, long l4) {
        return this.l(this.K0(n3, l3, l4), n3 + 1);
    }

    private int G(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.C0(12, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                return this.C0(13, 0L, l4);
            }
            return this.K(l4, 1L);
        }
        catch (IOException iOException) {
            this.H0(13, 0L, l4);
            return 14;
        }
    }

    private int G0(int n3, int n4) {
        this.l = n4;
        this.k = n3;
        return n3 + 1;
    }

    private int H(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.D0(12, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                return this.D0(13, 0L, l4);
            }
            return this.L(l4, 1L);
        }
        catch (IOException iOException) {
            this.I0(13, 0L, l4);
            return 14;
        }
    }

    /*
     * Unable to fully structure code
     */
    private final int H0(int var1_1, long var2_2, long var4_3) {
        switch (var1_1) {
            default: {
                return -1;
            }
            case 8: {
                if ((var2_2 & 0x80000000000000L) != 0L) {
                    return 1;
                }
                return -1;
            }
            case 7: {
                if ((var2_2 & 0x80000000000000L) != 0L) {
                    this.l = 61;
                    var1_1 = 7;
lbl12:
                    // 4 sources

                    while (true) {
                        this.k = var1_1;
                        return 1;
                    }
                }
                if ((var2_2 & 841813655168L) != 0L) {
                    return 1;
                }
                return -1;
            }
            case 6: {
                if ((36029638832619136L & var2_2) == 0L) ** GOTO lbl23
                this.l = 61;
                var1_1 = 6;
                ** GOTO lbl12
lbl23:
                // 1 sources

                if ((var2_2 & 18017907497763072L) != 0L) {
                    return 1;
                }
                return -1;
            }
            case 5: {
                if ((0x40804000000L & var2_2) != 0L) {
                    return 1;
                }
                if ((var2_2 & 54047546330382208L) == 0L) ** GOTO lbl33
                this.l = 61;
                var1_1 = 5;
                ** GOTO lbl12
lbl33:
                // 1 sources

                return -1;
            }
            case 4: {
                if ((0x404000000000040L & var2_2) != 0L) {
                    return 1;
                }
                if ((var2_2 & 54051978803740544L) != 0L) {
                    if (this.k != 4) {
                        this.l = 61;
                        this.k = 4;
                    }
                    return 1;
                }
                return -1;
            }
            case 3: {
                if ((144317513247817760L & var2_2) != 0L) {
                    return 1;
                }
                if ((var2_2 & 350163650008383424L) != 0L) {
                    if (this.k != 3) {
                        this.l = 61;
                        this.k = 3;
                    }
                    return 1;
                }
                return -1;
            }
            case 2: {
                if ((72972387913433088L & var2_2) != 0L) {
                    return 1;
                }
                if ((var2_2 & 494481163256201184L) != 0L) {
                    this.l = 61;
                    var1_1 = 2;
                    ** continue;
                }
                return -1;
            }
            case 1: {
                if ((0x20000072000000L & var2_2) != 0L) {
                    return 1;
                }
                if ((var2_2 & 567453551136079840L) != 0L) {
                    if (this.k != 1) {
                        this.l = 61;
                        this.k = 1;
                    }
                    return 1;
                }
                return -1;
            }
            case 0: 
        }
        if ((576460752303423456L & var2_2) != 0L) {
            this.l = 61;
            return 1;
        }
        if ((14L & var2_2) != 0L) {
            return 52;
        }
        if ((var2_2 & -4611686018427387904L) == 0L && (3071L & var4_3) == 0L) {
            return -1;
        }
        return 30;
    }

    private int I(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.E0(12, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                return this.E0(13, 0L, l4);
            }
            return this.M(l4, 1L);
        }
        catch (IOException iOException) {
            this.J0(13, 0L, l4);
            return 14;
        }
    }

    private final int I0(int n3, long l3, long l4) {
        if (n3 != 0) {
            return -1;
        }
        if ((0xEL & l3) != 0L) {
            return 51;
        }
        if ((l3 & 0xC000000000000000L) == 0L && (0xBFFL & l4) == 0L) {
            return -1;
        }
        return 27;
    }

    private int J(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.F0(12, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                return this.F0(13, 0L, l4);
            }
            return this.N(l4, 1L);
        }
        catch (IOException iOException) {
            this.K0(13, 0L, l4);
            return 14;
        }
    }

    private final int J0(int n3, long l3, long l4) {
        if (n3 != 0) {
            return -1;
        }
        if ((0xC000000000000000L & l3) == 0L && (l4 & 0xBFFL) == 0L) {
            if ((l3 & 0xEL) != 0L) {
                return 51;
            }
            return -1;
        }
        return 26;
    }

    private int K(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.C0(13, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 == 'd' && (1L & l4) != 0L) {
                return this.G0(15, 64);
            }
            return this.C0(14, 0L, l4);
        }
        catch (IOException iOException) {
            this.H0(14, 0L, l4);
            return 15;
        }
    }

    private final int K0(int n3, long l3, long l4) {
        if (n3 != 0) {
            return -1;
        }
        if ((0xC000000000000000L & l3) == 0L && (l4 & 0xBFFL) == 0L) {
            if ((l3 & 0xEL) != 0L) {
                return 50;
            }
            return -1;
        }
        return 28;
    }

    private int L(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.D0(13, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 == 'd' && (1L & l4) != 0L) {
                return this.G0(15, 64);
            }
            return this.D0(14, 0L, l4);
        }
        catch (IOException iOException) {
            this.I0(14, 0L, l4);
            return 15;
        }
    }

    private int M(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.E0(13, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 == 'd' && (1L & l4) != 0L) {
                return this.G0(15, 64);
            }
            return this.E0(14, 0L, l4);
        }
        catch (IOException iOException) {
            this.J0(14, 0L, l4);
            return 15;
        }
    }

    private int N(long l3, long l4) {
        if ((l4 &= l3) == 0L) {
            return this.F0(13, 0L, l3);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 == 'd' && (1L & l4) != 0L) {
                return this.G0(15, 64);
            }
            return this.F0(14, 0L, l4);
        }
        catch (IOException iOException) {
            this.K0(14, 0L, l4);
            return 15;
        }
    }

    private int O(long l3, long l4) {
        block40: {
            block26: {
                block27: {
                    block28: {
                        block29: {
                            block30: {
                                block31: {
                                    block32: {
                                        block33: {
                                            block34: {
                                                block35: {
                                                    block36: {
                                                        block37: {
                                                            block38: {
                                                                block39: {
                                                                    char c4;
                                                                    try {
                                                                        this.f = c4 = this.c.k();
                                                                        if (c4 == '.') break block26;
                                                                        if (c4 == 'A') break block27;
                                                                        if (c4 == 'X') break block28;
                                                                        if (c4 == 'a') break block29;
                                                                        if (c4 == 'i') break block30;
                                                                        if (c4 == 'u') break block31;
                                                                        if (c4 == 'H') break block32;
                                                                        if (c4 == 'I') break block33;
                                                                        if (c4 == 'T') break block34;
                                                                        if (c4 == 'U') break block35;
                                                                        if (c4 == 'e') break block36;
                                                                        if (c4 == 'f') break block37;
                                                                        if (c4 == 'r') break block38;
                                                                        if (c4 == 's') break block39;
                                                                    }
                                                                    catch (IOException iOException) {
                                                                        this.H0(0, l3, l4);
                                                                        return 1;
                                                                    }
                                                                    switch (c4) {
                                                                        default: {
                                                                            switch (c4) {
                                                                                default: {
                                                                                    switch (c4) {
                                                                                        default: {
                                                                                            break block40;
                                                                                        }
                                                                                        case 'n': {
                                                                                            return this.S(l3, 0L, l4, 2L);
                                                                                        }
                                                                                        case 'm': {
                                                                                            return this.S(l3, 0L, l4, 8L);
                                                                                        }
                                                                                        case 'l': {
                                                                                            return this.S(l3, Long.MIN_VALUE, l4, 97L);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                case 'Q': {
                                                                                    if ((0x10000000L & l3) != 0L) {
                                                                                        return this.y0(1, 28, 1);
                                                                                    }
                                                                                    break block40;
                                                                                }
                                                                                case 'P': {
                                                                                    if ((0x20000000000000L & l3) != 0L) {
                                                                                        return this.y0(1, 53, 1);
                                                                                    }
                                                                                    break block40;
                                                                                }
                                                                                case 'O': {
                                                                                    return this.S(l3, 5700074526999008L, l4, 0L);
                                                                                }
                                                                                case 'N': {
                                                                                    return this.S(l3, 0x100000800000L, l4, 0L);
                                                                                }
                                                                                case 'M': {
                                                                                    return this.S(l3, 0x8000000L, l4, 0L);
                                                                                }
                                                                                case 'L': {
                                                                                    return this.S(l3, 0x20000000000L, l4, 0L);
                                                                                }
                                                                                case 'K': {
                                                                                    return this.S(l3, 0x80000000000000L, l4, 0L);
                                                                                }
                                                                            }
                                                                        }
                                                                        case 'F': {
                                                                            return this.S(l3, 0xC000000000L, l4, 0L);
                                                                        }
                                                                        case 'E': {
                                                                            if ((0x40000000L & l3) != 0L) {
                                                                                this.l = 30;
                                                                                this.k = 1;
                                                                            }
                                                                            return this.S(l3, 18015538856984064L, l4, 0L);
                                                                        }
                                                                        case 'D': {
                                                                            return this.S(l3, 0x80000020000L, l4, 0L);
                                                                        }
                                                                    }
                                                                }
                                                                return this.S(l3, 0x4000000000000000L, l4, 0L);
                                                            }
                                                            return this.S(l3, 0x200000000000000L, l4, 0L);
                                                        }
                                                        return this.S(l3, 0L, l4, 256L);
                                                    }
                                                    return this.S(l3, 0L, l4, 640L);
                                                }
                                                return this.S(l3, 0x80000000C0000L, l4, 0L);
                                            }
                                            if ((0x20000000L & l3) != 0L) {
                                                return this.y0(1, 29, 1);
                                            }
                                            break block40;
                                        }
                                        return this.S(l3, 0x100000L, l4, 0L);
                                    }
                                    return this.S(l3, 0x3000000000000L, l4, 0L);
                                }
                                return this.S(l3, 0L, l4, 16L);
                            }
                            return this.S(l3, 0x100000000000000L, l4, 4L);
                        }
                        return this.S(l3, 0x400000000000000L, l4, 0L);
                    }
                    return this.S(l3, 0x800000000000L, l4, 0L);
                }
                return this.S(l3, 39608188403712L, l4, 0L);
            }
            if ((0x800L & l4) != 0L) {
                return this.G0(1, 75);
            }
        }
        return this.C0(0, l3, l4);
    }

    private int P(long l3, long l4) {
        block40: {
            block26: {
                block27: {
                    block28: {
                        block29: {
                            block30: {
                                block31: {
                                    block32: {
                                        block33: {
                                            block34: {
                                                block35: {
                                                    block36: {
                                                        block37: {
                                                            block38: {
                                                                block39: {
                                                                    char c4;
                                                                    try {
                                                                        this.f = c4 = this.c.k();
                                                                        if (c4 == '.') break block26;
                                                                        if (c4 == 'A') break block27;
                                                                        if (c4 == 'X') break block28;
                                                                        if (c4 == 'a') break block29;
                                                                        if (c4 == 'i') break block30;
                                                                        if (c4 == 'u') break block31;
                                                                        if (c4 == 'H') break block32;
                                                                        if (c4 == 'I') break block33;
                                                                        if (c4 == 'T') break block34;
                                                                        if (c4 == 'U') break block35;
                                                                        if (c4 == 'e') break block36;
                                                                        if (c4 == 'f') break block37;
                                                                        if (c4 == 'r') break block38;
                                                                        if (c4 == 's') break block39;
                                                                    }
                                                                    catch (IOException iOException) {
                                                                        this.I0(0, l3, l4);
                                                                        return 1;
                                                                    }
                                                                    switch (c4) {
                                                                        default: {
                                                                            switch (c4) {
                                                                                default: {
                                                                                    switch (c4) {
                                                                                        default: {
                                                                                            break block40;
                                                                                        }
                                                                                        case 'n': {
                                                                                            return this.T(l3, 0L, l4, 2L);
                                                                                        }
                                                                                        case 'm': {
                                                                                            return this.T(l3, 0L, l4, 8L);
                                                                                        }
                                                                                        case 'l': {
                                                                                            return this.T(l3, Long.MIN_VALUE, l4, 97L);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                case 'Q': {
                                                                                    if ((0x10000000L & l3) != 0L) {
                                                                                        return this.G0(1, 28);
                                                                                    }
                                                                                    break block40;
                                                                                }
                                                                                case 'P': {
                                                                                    if ((0x20000000000000L & l3) != 0L) {
                                                                                        return this.G0(1, 53);
                                                                                    }
                                                                                    break block40;
                                                                                }
                                                                                case 'O': {
                                                                                    return this.T(l3, 5700074526999008L, l4, 0L);
                                                                                }
                                                                                case 'N': {
                                                                                    return this.T(l3, 0x100000800000L, l4, 0L);
                                                                                }
                                                                                case 'M': {
                                                                                    return this.T(l3, 0x8000000L, l4, 0L);
                                                                                }
                                                                                case 'L': {
                                                                                    return this.T(l3, 0x20000000000L, l4, 0L);
                                                                                }
                                                                                case 'K': {
                                                                                    return this.T(l3, 0x80000000000000L, l4, 0L);
                                                                                }
                                                                            }
                                                                        }
                                                                        case 'F': {
                                                                            return this.T(l3, 0xC000000000L, l4, 0L);
                                                                        }
                                                                        case 'E': {
                                                                            if ((0x40000000L & l3) != 0L) {
                                                                                this.l = 30;
                                                                                this.k = 1;
                                                                            }
                                                                            return this.T(l3, 18015538856984064L, l4, 0L);
                                                                        }
                                                                        case 'D': {
                                                                            return this.T(l3, 0x80000020000L, l4, 0L);
                                                                        }
                                                                    }
                                                                }
                                                                return this.T(l3, 0x4000000000000000L, l4, 0L);
                                                            }
                                                            return this.T(l3, 0x200000000000000L, l4, 0L);
                                                        }
                                                        return this.T(l3, 0L, l4, 256L);
                                                    }
                                                    return this.T(l3, 0L, l4, 640L);
                                                }
                                                return this.T(l3, 0x80000000C0000L, l4, 0L);
                                            }
                                            if ((0x20000000L & l3) != 0L) {
                                                return this.G0(1, 29);
                                            }
                                            break block40;
                                        }
                                        return this.T(l3, 0x100000L, l4, 0L);
                                    }
                                    return this.T(l3, 0x3000000000000L, l4, 0L);
                                }
                                return this.T(l3, 0L, l4, 16L);
                            }
                            return this.T(l3, 0x100000000000000L, l4, 4L);
                        }
                        return this.T(l3, 0x400000000000000L, l4, 0L);
                    }
                    return this.T(l3, 0x800000000000L, l4, 0L);
                }
                return this.T(l3, 39608188403712L, l4, 0L);
            }
            if ((0x800L & l4) != 0L) {
                return this.G0(1, 75);
            }
        }
        return this.D0(0, l3, l4);
    }

    private int Q(long l3, long l4) {
        block40: {
            block26: {
                block27: {
                    block28: {
                        block29: {
                            block30: {
                                block31: {
                                    block32: {
                                        block33: {
                                            block34: {
                                                block35: {
                                                    block36: {
                                                        block37: {
                                                            block38: {
                                                                block39: {
                                                                    char c4;
                                                                    try {
                                                                        this.f = c4 = this.c.k();
                                                                        if (c4 == '.') break block26;
                                                                        if (c4 == 'A') break block27;
                                                                        if (c4 == 'X') break block28;
                                                                        if (c4 == 'a') break block29;
                                                                        if (c4 == 'i') break block30;
                                                                        if (c4 == 'u') break block31;
                                                                        if (c4 == 'H') break block32;
                                                                        if (c4 == 'I') break block33;
                                                                        if (c4 == 'T') break block34;
                                                                        if (c4 == 'U') break block35;
                                                                        if (c4 == 'e') break block36;
                                                                        if (c4 == 'f') break block37;
                                                                        if (c4 == 'r') break block38;
                                                                        if (c4 == 's') break block39;
                                                                    }
                                                                    catch (IOException iOException) {
                                                                        this.J0(0, l3, l4);
                                                                        return 1;
                                                                    }
                                                                    switch (c4) {
                                                                        default: {
                                                                            switch (c4) {
                                                                                default: {
                                                                                    switch (c4) {
                                                                                        default: {
                                                                                            break block40;
                                                                                        }
                                                                                        case 'n': {
                                                                                            return this.U(l3, 0L, l4, 2L);
                                                                                        }
                                                                                        case 'm': {
                                                                                            return this.U(l3, 0L, l4, 8L);
                                                                                        }
                                                                                        case 'l': {
                                                                                            return this.U(l3, Long.MIN_VALUE, l4, 97L);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                case 'Q': {
                                                                                    if ((0x10000000L & l3) != 0L) {
                                                                                        return this.G0(1, 28);
                                                                                    }
                                                                                    break block40;
                                                                                }
                                                                                case 'P': {
                                                                                    if ((0x20000000000000L & l3) != 0L) {
                                                                                        return this.G0(1, 53);
                                                                                    }
                                                                                    break block40;
                                                                                }
                                                                                case 'O': {
                                                                                    return this.U(l3, 5700074526999008L, l4, 0L);
                                                                                }
                                                                                case 'N': {
                                                                                    return this.U(l3, 0x100000800000L, l4, 0L);
                                                                                }
                                                                                case 'M': {
                                                                                    return this.U(l3, 0x8000000L, l4, 0L);
                                                                                }
                                                                                case 'L': {
                                                                                    return this.U(l3, 0x20000000000L, l4, 0L);
                                                                                }
                                                                                case 'K': {
                                                                                    return this.U(l3, 0x80000000000000L, l4, 0L);
                                                                                }
                                                                            }
                                                                        }
                                                                        case 'F': {
                                                                            return this.U(l3, 0xC000000000L, l4, 0L);
                                                                        }
                                                                        case 'E': {
                                                                            if ((0x40000000L & l3) != 0L) {
                                                                                this.l = 30;
                                                                                this.k = 1;
                                                                            }
                                                                            return this.U(l3, 18015538856984064L, l4, 0L);
                                                                        }
                                                                        case 'D': {
                                                                            return this.U(l3, 0x80000020000L, l4, 0L);
                                                                        }
                                                                    }
                                                                }
                                                                return this.U(l3, 0x4000000000000000L, l4, 0L);
                                                            }
                                                            return this.U(l3, 0x200000000000000L, l4, 0L);
                                                        }
                                                        return this.U(l3, 0L, l4, 256L);
                                                    }
                                                    return this.U(l3, 0L, l4, 640L);
                                                }
                                                return this.U(l3, 0x80000000C0000L, l4, 0L);
                                            }
                                            if ((0x20000000L & l3) != 0L) {
                                                return this.G0(1, 29);
                                            }
                                            break block40;
                                        }
                                        return this.U(l3, 0x100000L, l4, 0L);
                                    }
                                    return this.U(l3, 0x3000000000000L, l4, 0L);
                                }
                                return this.U(l3, 0L, l4, 16L);
                            }
                            return this.U(l3, 0x100000000000000L, l4, 4L);
                        }
                        return this.U(l3, 0x400000000000000L, l4, 0L);
                    }
                    return this.U(l3, 0x800000000000L, l4, 0L);
                }
                return this.U(l3, 39608188403712L, l4, 0L);
            }
            if ((0x800L & l4) != 0L) {
                return this.G0(1, 75);
            }
        }
        return this.E0(0, l3, l4);
    }

    private int R(long l3, long l4) {
        block40: {
            block26: {
                block27: {
                    block28: {
                        block29: {
                            block30: {
                                block31: {
                                    block32: {
                                        block33: {
                                            block34: {
                                                block35: {
                                                    block36: {
                                                        block37: {
                                                            block38: {
                                                                block39: {
                                                                    char c4;
                                                                    try {
                                                                        this.f = c4 = this.c.k();
                                                                        if (c4 == '.') break block26;
                                                                        if (c4 == 'A') break block27;
                                                                        if (c4 == 'X') break block28;
                                                                        if (c4 == 'a') break block29;
                                                                        if (c4 == 'i') break block30;
                                                                        if (c4 == 'u') break block31;
                                                                        if (c4 == 'H') break block32;
                                                                        if (c4 == 'I') break block33;
                                                                        if (c4 == 'T') break block34;
                                                                        if (c4 == 'U') break block35;
                                                                        if (c4 == 'e') break block36;
                                                                        if (c4 == 'f') break block37;
                                                                        if (c4 == 'r') break block38;
                                                                        if (c4 == 's') break block39;
                                                                    }
                                                                    catch (IOException iOException) {
                                                                        this.K0(0, l3, l4);
                                                                        return 1;
                                                                    }
                                                                    switch (c4) {
                                                                        default: {
                                                                            switch (c4) {
                                                                                default: {
                                                                                    switch (c4) {
                                                                                        default: {
                                                                                            break block40;
                                                                                        }
                                                                                        case 'n': {
                                                                                            return this.V(l3, 0L, l4, 2L);
                                                                                        }
                                                                                        case 'm': {
                                                                                            return this.V(l3, 0L, l4, 8L);
                                                                                        }
                                                                                        case 'l': {
                                                                                            return this.V(l3, Long.MIN_VALUE, l4, 97L);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                case 'Q': {
                                                                                    if ((0x10000000L & l3) != 0L) {
                                                                                        return this.G0(1, 28);
                                                                                    }
                                                                                    break block40;
                                                                                }
                                                                                case 'P': {
                                                                                    if ((0x20000000000000L & l3) != 0L) {
                                                                                        return this.G0(1, 53);
                                                                                    }
                                                                                    break block40;
                                                                                }
                                                                                case 'O': {
                                                                                    return this.V(l3, 5700074526999008L, l4, 0L);
                                                                                }
                                                                                case 'N': {
                                                                                    return this.V(l3, 0x100000800000L, l4, 0L);
                                                                                }
                                                                                case 'M': {
                                                                                    return this.V(l3, 0x8000000L, l4, 0L);
                                                                                }
                                                                                case 'L': {
                                                                                    return this.V(l3, 0x20000000000L, l4, 0L);
                                                                                }
                                                                                case 'K': {
                                                                                    return this.V(l3, 0x80000000000000L, l4, 0L);
                                                                                }
                                                                            }
                                                                        }
                                                                        case 'F': {
                                                                            return this.V(l3, 0xC000000000L, l4, 0L);
                                                                        }
                                                                        case 'E': {
                                                                            if ((0x40000000L & l3) != 0L) {
                                                                                this.l = 30;
                                                                                this.k = 1;
                                                                            }
                                                                            return this.V(l3, 18015538856984064L, l4, 0L);
                                                                        }
                                                                        case 'D': {
                                                                            return this.V(l3, 0x80000020000L, l4, 0L);
                                                                        }
                                                                    }
                                                                }
                                                                return this.V(l3, 0x4000000000000000L, l4, 0L);
                                                            }
                                                            return this.V(l3, 0x200000000000000L, l4, 0L);
                                                        }
                                                        return this.V(l3, 0L, l4, 256L);
                                                    }
                                                    return this.V(l3, 0L, l4, 640L);
                                                }
                                                return this.V(l3, 0x80000000C0000L, l4, 0L);
                                            }
                                            if ((0x20000000L & l3) != 0L) {
                                                return this.G0(1, 29);
                                            }
                                            break block40;
                                        }
                                        return this.V(l3, 0x100000L, l4, 0L);
                                    }
                                    return this.V(l3, 0x3000000000000L, l4, 0L);
                                }
                                return this.V(l3, 0L, l4, 16L);
                            }
                            return this.V(l3, 0x100000000000000L, l4, 4L);
                        }
                        return this.V(l3, 0x400000000000000L, l4, 0L);
                    }
                    return this.V(l3, 0x800000000000L, l4, 0L);
                }
                return this.V(l3, 39608188403712L, l4, 0L);
            }
            if ((0x800L & l4) != 0L) {
                return this.G0(1, 75);
            }
        }
        return this.F0(0, l3, l4);
    }

    private int S(long l3, long l4, long l5, long l6) {
        block34: {
            block45: {
                block35: {
                    block36: {
                        block37: {
                            block38: {
                                block39: {
                                    block40: {
                                        block41: {
                                            block42: {
                                                block43: {
                                                    block44: {
                                                        char c4;
                                                        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                            return this.C0(0, l3, l5);
                                                        }
                                                        try {
                                                            this.f = c4 = this.c.k();
                                                            if (c4 == 'A') break block34;
                                                            if (c4 == 'B') break block35;
                                                            if (c4 == 'D') break block36;
                                                            if (c4 == 'I') break block37;
                                                            if (c4 == 'a') break block38;
                                                            if (c4 == 'i') break block39;
                                                            if (c4 == 'l') break block40;
                                                            if (c4 == 's') break block41;
                                                            if (c4 == 'u') break block42;
                                                            if (c4 == 'V') break block43;
                                                            if (c4 == 'W') break block44;
                                                        }
                                                        catch (IOException iOException) {
                                                            this.H0(1, l4, l6);
                                                            return 2;
                                                        }
                                                        switch (c4) {
                                                            default: {
                                                                switch (c4) {
                                                                    default: {
                                                                        switch (c4) {
                                                                            default: {
                                                                                break block45;
                                                                            }
                                                                            case 'p': {
                                                                                return this.W(l4, 0L, l6, 16L);
                                                                            }
                                                                            case 'o': {
                                                                                return this.W(l4, 0x4000000000000000L, l6, 64L);
                                                                            }
                                                                            case 'n': {
                                                                                return this.W(l4, 0L, l6, 640L);
                                                                            }
                                                                        }
                                                                    }
                                                                    case 'T': {
                                                                        if ((0x1000000L & l4) != 0L) {
                                                                            return this.y0(2, 24, 1);
                                                                        }
                                                                        return this.W(l4, 22519132008250880L, l6, 0L);
                                                                    }
                                                                    case 'S': {
                                                                        return this.W(l4, 0x180000000L, l6, 0L);
                                                                    }
                                                                    case 'R': {
                                                                        if ((0x400000000000L & l4) != 0L) {
                                                                            return this.y0(2, 46, 1);
                                                                        }
                                                                        if ((0x2000000000000L & l4) != 0L) {
                                                                            return this.y0(2, 49, 1);
                                                                        }
                                                                        return this.W(l4, 0x43000000000L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            case 'P': {
                                                                if ((0x8000000L & l4) != 0L) {
                                                                    return this.y0(2, 27, 1);
                                                                }
                                                                break block45;
                                                            }
                                                            case 'O': {
                                                                return this.W(l4, 161353331376128L, l6, 0L);
                                                            }
                                                            case 'N': {
                                                                if ((0x2000000L & l4) != 0L) {
                                                                    return this.y0(2, 25, 1);
                                                                }
                                                                return this.W(l4, 3412884159725568L, l6, 0L);
                                                            }
                                                            case 'M': {
                                                                if ((0x800000L & l4) != 0L) {
                                                                    return this.y0(2, 23, 1);
                                                                }
                                                                break block45;
                                                            }
                                                            case 'L': {
                                                                if ((0x80000L & l4) != 0L) {
                                                                    return this.y0(2, 19, 1);
                                                                }
                                                                if ((0x1000000000000L & l4) != 0L) {
                                                                    return this.y0(2, 48, 1);
                                                                }
                                                                return this.W(l4, 0x200010000L, l6, 0L);
                                                            }
                                                        }
                                                    }
                                                    if ((0x400000L & l4) != 0L) {
                                                        return this.y0(2, 22, 1);
                                                    }
                                                    return this.W(l4, 32768L, l6, 0L);
                                                }
                                                if ((0x100000L & l4) != 0L) {
                                                    return this.y0(2, 20, 1);
                                                }
                                                return this.W(l4, 32L, l6, 0L);
                                            }
                                            return this.W(l4, 0x200000000000000L, l6, 258L);
                                        }
                                        return this.W(l4, 0L, l6, 4L);
                                    }
                                    if ((0x100000000000000L & l4) != 0L) {
                                        return this.y0(2, 56, 1);
                                    }
                                    return this.W(l4, 0x400000000000000L, l6, 0L);
                                }
                                return this.W(l4, Long.MIN_VALUE, l6, 32L);
                            }
                            return this.W(l4, 0L, l6, 9L);
                        }
                        return this.W(l4, 0x80080400000000L, l6, 0L);
                    }
                    if ((0x20000L & l4) != 0L) {
                        return this.y0(2, 17, 1);
                    }
                    if ((0x200000L & l4) != 0L) {
                        return this.y0(2, 21, 1);
                    }
                    break block45;
                }
                if ((0x40000L & l4) != 0L) {
                    return this.y0(2, 18, 1);
                }
            }
            return this.C0(1, l4, l6);
        }
        return this.W(l4, 448L, l6, 0L);
    }

    private int T(long l3, long l4, long l5, long l6) {
        block34: {
            block45: {
                block35: {
                    block36: {
                        block37: {
                            block38: {
                                block39: {
                                    block40: {
                                        block41: {
                                            block42: {
                                                block43: {
                                                    block44: {
                                                        char c4;
                                                        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                            return this.D0(0, l3, l5);
                                                        }
                                                        try {
                                                            this.f = c4 = this.c.k();
                                                            if (c4 == 'A') break block34;
                                                            if (c4 == 'B') break block35;
                                                            if (c4 == 'D') break block36;
                                                            if (c4 == 'I') break block37;
                                                            if (c4 == 'a') break block38;
                                                            if (c4 == 'i') break block39;
                                                            if (c4 == 'l') break block40;
                                                            if (c4 == 's') break block41;
                                                            if (c4 == 'u') break block42;
                                                            if (c4 == 'V') break block43;
                                                            if (c4 == 'W') break block44;
                                                        }
                                                        catch (IOException iOException) {
                                                            this.I0(1, l4, l6);
                                                            return 2;
                                                        }
                                                        switch (c4) {
                                                            default: {
                                                                switch (c4) {
                                                                    default: {
                                                                        switch (c4) {
                                                                            default: {
                                                                                break block45;
                                                                            }
                                                                            case 'p': {
                                                                                return this.X(l4, 0L, l6, 16L);
                                                                            }
                                                                            case 'o': {
                                                                                return this.X(l4, 0x4000000000000000L, l6, 64L);
                                                                            }
                                                                            case 'n': {
                                                                                return this.X(l4, 0L, l6, 640L);
                                                                            }
                                                                        }
                                                                    }
                                                                    case 'T': {
                                                                        if ((0x1000000L & l4) != 0L) {
                                                                            return this.G0(2, 24);
                                                                        }
                                                                        return this.X(l4, 22519132008250880L, l6, 0L);
                                                                    }
                                                                    case 'S': {
                                                                        return this.X(l4, 0x180000000L, l6, 0L);
                                                                    }
                                                                    case 'R': {
                                                                        if ((0x400000000000L & l4) != 0L) {
                                                                            return this.G0(2, 46);
                                                                        }
                                                                        if ((0x2000000000000L & l4) != 0L) {
                                                                            return this.G0(2, 49);
                                                                        }
                                                                        return this.X(l4, 0x43000000000L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            case 'P': {
                                                                if ((0x8000000L & l4) != 0L) {
                                                                    return this.G0(2, 27);
                                                                }
                                                                break block45;
                                                            }
                                                            case 'O': {
                                                                return this.X(l4, 161353331376128L, l6, 0L);
                                                            }
                                                            case 'N': {
                                                                if ((0x2000000L & l4) != 0L) {
                                                                    return this.G0(2, 25);
                                                                }
                                                                return this.X(l4, 3412884159725568L, l6, 0L);
                                                            }
                                                            case 'M': {
                                                                if ((0x800000L & l4) != 0L) {
                                                                    return this.G0(2, 23);
                                                                }
                                                                break block45;
                                                            }
                                                            case 'L': {
                                                                if ((0x80000L & l4) != 0L) {
                                                                    return this.G0(2, 19);
                                                                }
                                                                if ((0x1000000000000L & l4) != 0L) {
                                                                    return this.G0(2, 48);
                                                                }
                                                                return this.X(l4, 0x200010000L, l6, 0L);
                                                            }
                                                        }
                                                    }
                                                    if ((0x400000L & l4) != 0L) {
                                                        return this.G0(2, 22);
                                                    }
                                                    return this.X(l4, 32768L, l6, 0L);
                                                }
                                                if ((0x100000L & l4) != 0L) {
                                                    return this.G0(2, 20);
                                                }
                                                return this.X(l4, 32L, l6, 0L);
                                            }
                                            return this.X(l4, 0x200000000000000L, l6, 258L);
                                        }
                                        return this.X(l4, 0L, l6, 4L);
                                    }
                                    if ((0x100000000000000L & l4) != 0L) {
                                        return this.G0(2, 56);
                                    }
                                    return this.X(l4, 0x400000000000000L, l6, 0L);
                                }
                                return this.X(l4, Long.MIN_VALUE, l6, 32L);
                            }
                            return this.X(l4, 0L, l6, 9L);
                        }
                        return this.X(l4, 0x80080400000000L, l6, 0L);
                    }
                    if ((0x20000L & l4) != 0L) {
                        return this.G0(2, 17);
                    }
                    if ((0x200000L & l4) != 0L) {
                        return this.G0(2, 21);
                    }
                    break block45;
                }
                if ((0x40000L & l4) != 0L) {
                    return this.G0(2, 18);
                }
            }
            return this.D0(1, l4, l6);
        }
        return this.X(l4, 448L, l6, 0L);
    }

    private int U(long l3, long l4, long l5, long l6) {
        block34: {
            block45: {
                block35: {
                    block36: {
                        block37: {
                            block38: {
                                block39: {
                                    block40: {
                                        block41: {
                                            block42: {
                                                block43: {
                                                    block44: {
                                                        char c4;
                                                        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                            return this.E0(0, l3, l5);
                                                        }
                                                        try {
                                                            this.f = c4 = this.c.k();
                                                            if (c4 == 'A') break block34;
                                                            if (c4 == 'B') break block35;
                                                            if (c4 == 'D') break block36;
                                                            if (c4 == 'I') break block37;
                                                            if (c4 == 'a') break block38;
                                                            if (c4 == 'i') break block39;
                                                            if (c4 == 'l') break block40;
                                                            if (c4 == 's') break block41;
                                                            if (c4 == 'u') break block42;
                                                            if (c4 == 'V') break block43;
                                                            if (c4 == 'W') break block44;
                                                        }
                                                        catch (IOException iOException) {
                                                            this.J0(1, l4, l6);
                                                            return 2;
                                                        }
                                                        switch (c4) {
                                                            default: {
                                                                switch (c4) {
                                                                    default: {
                                                                        switch (c4) {
                                                                            default: {
                                                                                break block45;
                                                                            }
                                                                            case 'p': {
                                                                                return this.Y(l4, 0L, l6, 16L);
                                                                            }
                                                                            case 'o': {
                                                                                return this.Y(l4, 0x4000000000000000L, l6, 64L);
                                                                            }
                                                                            case 'n': {
                                                                                return this.Y(l4, 0L, l6, 640L);
                                                                            }
                                                                        }
                                                                    }
                                                                    case 'T': {
                                                                        if ((0x1000000L & l4) != 0L) {
                                                                            return this.G0(2, 24);
                                                                        }
                                                                        return this.Y(l4, 22519132008250880L, l6, 0L);
                                                                    }
                                                                    case 'S': {
                                                                        return this.Y(l4, 0x180000000L, l6, 0L);
                                                                    }
                                                                    case 'R': {
                                                                        if ((0x400000000000L & l4) != 0L) {
                                                                            return this.G0(2, 46);
                                                                        }
                                                                        if ((0x2000000000000L & l4) != 0L) {
                                                                            return this.G0(2, 49);
                                                                        }
                                                                        return this.Y(l4, 0x43000000000L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            case 'P': {
                                                                if ((0x8000000L & l4) != 0L) {
                                                                    return this.G0(2, 27);
                                                                }
                                                                break block45;
                                                            }
                                                            case 'O': {
                                                                return this.Y(l4, 161353331376128L, l6, 0L);
                                                            }
                                                            case 'N': {
                                                                if ((0x2000000L & l4) != 0L) {
                                                                    return this.G0(2, 25);
                                                                }
                                                                return this.Y(l4, 3412884159725568L, l6, 0L);
                                                            }
                                                            case 'M': {
                                                                if ((0x800000L & l4) != 0L) {
                                                                    return this.G0(2, 23);
                                                                }
                                                                break block45;
                                                            }
                                                            case 'L': {
                                                                if ((0x80000L & l4) != 0L) {
                                                                    return this.G0(2, 19);
                                                                }
                                                                if ((0x1000000000000L & l4) != 0L) {
                                                                    return this.G0(2, 48);
                                                                }
                                                                return this.Y(l4, 0x200010000L, l6, 0L);
                                                            }
                                                        }
                                                    }
                                                    if ((0x400000L & l4) != 0L) {
                                                        return this.G0(2, 22);
                                                    }
                                                    return this.Y(l4, 32768L, l6, 0L);
                                                }
                                                if ((0x100000L & l4) != 0L) {
                                                    return this.G0(2, 20);
                                                }
                                                return this.Y(l4, 32L, l6, 0L);
                                            }
                                            return this.Y(l4, 0x200000000000000L, l6, 258L);
                                        }
                                        return this.Y(l4, 0L, l6, 4L);
                                    }
                                    if ((0x100000000000000L & l4) != 0L) {
                                        return this.G0(2, 56);
                                    }
                                    return this.Y(l4, 0x400000000000000L, l6, 0L);
                                }
                                return this.Y(l4, Long.MIN_VALUE, l6, 32L);
                            }
                            return this.Y(l4, 0L, l6, 9L);
                        }
                        return this.Y(l4, 0x80080400000000L, l6, 0L);
                    }
                    if ((0x20000L & l4) != 0L) {
                        return this.G0(2, 17);
                    }
                    if ((0x200000L & l4) != 0L) {
                        return this.G0(2, 21);
                    }
                    break block45;
                }
                if ((0x40000L & l4) != 0L) {
                    return this.G0(2, 18);
                }
            }
            return this.E0(1, l4, l6);
        }
        return this.Y(l4, 448L, l6, 0L);
    }

    private int V(long l3, long l4, long l5, long l6) {
        block34: {
            block45: {
                block35: {
                    block36: {
                        block37: {
                            block38: {
                                block39: {
                                    block40: {
                                        block41: {
                                            block42: {
                                                block43: {
                                                    block44: {
                                                        char c4;
                                                        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                            return this.F0(0, l3, l5);
                                                        }
                                                        try {
                                                            this.f = c4 = this.c.k();
                                                            if (c4 == 'A') break block34;
                                                            if (c4 == 'B') break block35;
                                                            if (c4 == 'D') break block36;
                                                            if (c4 == 'I') break block37;
                                                            if (c4 == 'a') break block38;
                                                            if (c4 == 'i') break block39;
                                                            if (c4 == 'l') break block40;
                                                            if (c4 == 's') break block41;
                                                            if (c4 == 'u') break block42;
                                                            if (c4 == 'V') break block43;
                                                            if (c4 == 'W') break block44;
                                                        }
                                                        catch (IOException iOException) {
                                                            this.K0(1, l4, l6);
                                                            return 2;
                                                        }
                                                        switch (c4) {
                                                            default: {
                                                                switch (c4) {
                                                                    default: {
                                                                        switch (c4) {
                                                                            default: {
                                                                                break block45;
                                                                            }
                                                                            case 'p': {
                                                                                return this.Z(l4, 0L, l6, 16L);
                                                                            }
                                                                            case 'o': {
                                                                                return this.Z(l4, 0x4000000000000000L, l6, 64L);
                                                                            }
                                                                            case 'n': {
                                                                                return this.Z(l4, 0L, l6, 640L);
                                                                            }
                                                                        }
                                                                    }
                                                                    case 'T': {
                                                                        if ((0x1000000L & l4) != 0L) {
                                                                            return this.G0(2, 24);
                                                                        }
                                                                        return this.Z(l4, 22519132008250880L, l6, 0L);
                                                                    }
                                                                    case 'S': {
                                                                        return this.Z(l4, 0x180000000L, l6, 0L);
                                                                    }
                                                                    case 'R': {
                                                                        if ((0x400000000000L & l4) != 0L) {
                                                                            return this.G0(2, 46);
                                                                        }
                                                                        if ((0x2000000000000L & l4) != 0L) {
                                                                            return this.G0(2, 49);
                                                                        }
                                                                        return this.Z(l4, 0x43000000000L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            case 'P': {
                                                                if ((0x8000000L & l4) != 0L) {
                                                                    return this.G0(2, 27);
                                                                }
                                                                break block45;
                                                            }
                                                            case 'O': {
                                                                return this.Z(l4, 161353331376128L, l6, 0L);
                                                            }
                                                            case 'N': {
                                                                if ((0x2000000L & l4) != 0L) {
                                                                    return this.G0(2, 25);
                                                                }
                                                                return this.Z(l4, 3412884159725568L, l6, 0L);
                                                            }
                                                            case 'M': {
                                                                if ((0x800000L & l4) != 0L) {
                                                                    return this.G0(2, 23);
                                                                }
                                                                break block45;
                                                            }
                                                            case 'L': {
                                                                if ((0x80000L & l4) != 0L) {
                                                                    return this.G0(2, 19);
                                                                }
                                                                if ((0x1000000000000L & l4) != 0L) {
                                                                    return this.G0(2, 48);
                                                                }
                                                                return this.Z(l4, 0x200010000L, l6, 0L);
                                                            }
                                                        }
                                                    }
                                                    if ((0x400000L & l4) != 0L) {
                                                        return this.G0(2, 22);
                                                    }
                                                    return this.Z(l4, 32768L, l6, 0L);
                                                }
                                                if ((0x100000L & l4) != 0L) {
                                                    return this.G0(2, 20);
                                                }
                                                return this.Z(l4, 32L, l6, 0L);
                                            }
                                            return this.Z(l4, 0x200000000000000L, l6, 258L);
                                        }
                                        return this.Z(l4, 0L, l6, 4L);
                                    }
                                    if ((0x100000000000000L & l4) != 0L) {
                                        return this.G0(2, 56);
                                    }
                                    return this.Z(l4, 0x400000000000000L, l6, 0L);
                                }
                                return this.Z(l4, Long.MIN_VALUE, l6, 32L);
                            }
                            return this.Z(l4, 0L, l6, 9L);
                        }
                        return this.Z(l4, 0x80080400000000L, l6, 0L);
                    }
                    if ((0x20000L & l4) != 0L) {
                        return this.G0(2, 17);
                    }
                    if ((0x200000L & l4) != 0L) {
                        return this.G0(2, 21);
                    }
                    break block45;
                }
                if ((0x40000L & l4) != 0L) {
                    return this.G0(2, 18);
                }
            }
            return this.F0(1, l4, l6);
        }
        return this.Z(l4, 448L, l6, 0L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int W(long l3, long l4, long l5, long l6) {
        block23: {
            char c4;
            if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                return this.C0(1, l3, l5);
            }
            try {
                this.f = c4 = this.c.k();
                if (c4 == 'A') return this.a0(l4, 0x40000000000L, l6, 0L);
                if (c4 == 'L') break block23;
                if (c4 == '_') return this.a0(l4, 0x40000000000000L, l6, 4L);
                if (c4 == 's') return this.a0(l4, 0x400000000000000L, l6, 1L);
                if (c4 == 'x') return this.a0(l4, 0L, l6, 8L);
                if (c4 == 'O') return this.a0(l4, 0x10000000000000L, l6, 0L);
                if (c4 == 'P') return this.a0(l4, 0x80002000000000L, l6, 0L);
                if (c4 == 'm') return this.a0(l4, 0L, l6, 2L);
                if (c4 == 'n') return this.a0(l4, Long.MIN_VALUE, l6, 288L);
                if (c4 == 'u') return this.a0(l4, 0x4000000000000000L, l6, 0L);
                if (c4 == 'v') return this.a0(l4, 0L, l6, 16L);
            }
            catch (IOException iOException) {
                this.H0(2, l4, l6);
                return 3;
            }
            switch (c4) {
                default: {
                    switch (c4) {
                        default: {
                            switch (c4) {
                                default: {
                                    return this.C0(2, l4, l6);
                                }
                                case 'e': {
                                    if ((0x200000000000000L & l4) == 0L) return this.C0(2, l4, l6);
                                    return this.y0(3, 57, 1);
                                }
                                case 'd': {
                                    if ((0x200L & l6) == 0L) return this.a0(l4, 0L, l6, 128L);
                                    this.l = 73;
                                    this.k = 3;
                                    return this.a0(l4, 0L, l6, 128L);
                                }
                                case 'c': {
                                    return this.a0(l4, 0L, l6, 64L);
                                }
                            }
                        }
                        case 'V': {
                            if ((0x80000000000L & l4) == 0L) return this.C0(2, l4, l6);
                            return this.y0(3, 43, 1);
                        }
                        case 'U': {
                            return this.a0(l4, 0x800002200L, l6, 0L);
                        }
                        case 'T': {
                            if ((0x80000000L & l4) != 0L) {
                                this.l = 31;
                                this.k = 3;
                                return this.a0(l4, 4295023616L, l6, 0L);
                            } else {
                                if ((0x100000000000L & l4) == 0L) return this.a0(l4, 4295023616L, l6, 0L);
                                return this.y0(3, 44, 1);
                            }
                        }
                        case 'S': {
                            return this.a0(l4, 0x4020000000000L, l6, 0L);
                        }
                        case 'R': {
                            if ((0x800000000000L & l4) == 0L) return this.a0(l4, 0xC000000000L, l6, 0L);
                            return this.y0(3, 47, 1);
                        }
                    }
                }
                case 'F': {
                    if ((0x10000L & l4) == 0L) return this.C0(2, l4, l6);
                    return this.y0(3, 16, 1);
                }
                case 'E': {
                    if ((0x20L & l4) == 0L) return this.C0(2, l4, l6);
                    return this.y0(3, 5, 1);
                }
                case 'D': {
                    if ((0x200000000000L & l4) == 0L) return this.a0(l4, 448L, l6, 0L);
                    return this.y0(3, 45, 1);
                }
                case 'C': 
            }
            return this.a0(l4, 0x8000004000000L, l6, 0L);
        }
        if ((0x200000000L & l4) == 0L) return this.a0(l4, 0x11400000000L, l6, 0L);
        return this.y0(3, 33, 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int X(long l3, long l4, long l5, long l6) {
        block23: {
            char c4;
            if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                return this.D0(1, l3, l5);
            }
            try {
                this.f = c4 = this.c.k();
                if (c4 == 'A') return this.b0(l4, 0x40000000000L, l6, 0L);
                if (c4 == 'L') break block23;
                if (c4 == '_') return this.b0(l4, 0x40000000000000L, l6, 4L);
                if (c4 == 's') return this.b0(l4, 0x400000000000000L, l6, 1L);
                if (c4 == 'x') return this.b0(l4, 0L, l6, 8L);
                if (c4 == 'O') return this.b0(l4, 0x10000000000000L, l6, 0L);
                if (c4 == 'P') return this.b0(l4, 0x80002000000000L, l6, 0L);
                if (c4 == 'm') return this.b0(l4, 0L, l6, 2L);
                if (c4 == 'n') return this.b0(l4, Long.MIN_VALUE, l6, 288L);
                if (c4 == 'u') return this.b0(l4, 0x4000000000000000L, l6, 0L);
                if (c4 == 'v') return this.b0(l4, 0L, l6, 16L);
            }
            catch (IOException iOException) {
                this.I0(2, l4, l6);
                return 3;
            }
            switch (c4) {
                default: {
                    switch (c4) {
                        default: {
                            switch (c4) {
                                default: {
                                    return this.D0(2, l4, l6);
                                }
                                case 'e': {
                                    if ((0x200000000000000L & l4) == 0L) return this.D0(2, l4, l6);
                                    return this.G0(3, 57);
                                }
                                case 'd': {
                                    if ((0x200L & l6) == 0L) return this.b0(l4, 0L, l6, 128L);
                                    this.l = 73;
                                    this.k = 3;
                                    return this.b0(l4, 0L, l6, 128L);
                                }
                                case 'c': {
                                    return this.b0(l4, 0L, l6, 64L);
                                }
                            }
                        }
                        case 'V': {
                            if ((0x80000000000L & l4) == 0L) return this.D0(2, l4, l6);
                            return this.G0(3, 43);
                        }
                        case 'U': {
                            return this.b0(l4, 0x800002200L, l6, 0L);
                        }
                        case 'T': {
                            if ((0x80000000L & l4) != 0L) {
                                this.l = 31;
                                this.k = 3;
                                return this.b0(l4, 4295023616L, l6, 0L);
                            } else {
                                if ((0x100000000000L & l4) == 0L) return this.b0(l4, 4295023616L, l6, 0L);
                                return this.G0(3, 44);
                            }
                        }
                        case 'S': {
                            return this.b0(l4, 0x4020000000000L, l6, 0L);
                        }
                        case 'R': {
                            if ((0x800000000000L & l4) == 0L) return this.b0(l4, 0xC000000000L, l6, 0L);
                            return this.G0(3, 47);
                        }
                    }
                }
                case 'F': {
                    if ((0x10000L & l4) == 0L) return this.D0(2, l4, l6);
                    return this.G0(3, 16);
                }
                case 'E': {
                    if ((0x20L & l4) == 0L) return this.D0(2, l4, l6);
                    return this.G0(3, 5);
                }
                case 'D': {
                    if ((0x200000000000L & l4) == 0L) return this.b0(l4, 448L, l6, 0L);
                    return this.G0(3, 45);
                }
                case 'C': 
            }
            return this.b0(l4, 0x8000004000000L, l6, 0L);
        }
        if ((0x200000000L & l4) == 0L) return this.b0(l4, 0x11400000000L, l6, 0L);
        return this.G0(3, 33);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int Y(long l3, long l4, long l5, long l6) {
        block23: {
            char c4;
            if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                return this.E0(1, l3, l5);
            }
            try {
                this.f = c4 = this.c.k();
                if (c4 == 'A') return this.c0(l4, 0x40000000000L, l6, 0L);
                if (c4 == 'L') break block23;
                if (c4 == '_') return this.c0(l4, 0x40000000000000L, l6, 4L);
                if (c4 == 's') return this.c0(l4, 0x400000000000000L, l6, 1L);
                if (c4 == 'x') return this.c0(l4, 0L, l6, 8L);
                if (c4 == 'O') return this.c0(l4, 0x10000000000000L, l6, 0L);
                if (c4 == 'P') return this.c0(l4, 0x80002000000000L, l6, 0L);
                if (c4 == 'm') return this.c0(l4, 0L, l6, 2L);
                if (c4 == 'n') return this.c0(l4, Long.MIN_VALUE, l6, 288L);
                if (c4 == 'u') return this.c0(l4, 0x4000000000000000L, l6, 0L);
                if (c4 == 'v') return this.c0(l4, 0L, l6, 16L);
            }
            catch (IOException iOException) {
                this.J0(2, l4, l6);
                return 3;
            }
            switch (c4) {
                default: {
                    switch (c4) {
                        default: {
                            switch (c4) {
                                default: {
                                    return this.E0(2, l4, l6);
                                }
                                case 'e': {
                                    if ((0x200000000000000L & l4) == 0L) return this.E0(2, l4, l6);
                                    return this.G0(3, 57);
                                }
                                case 'd': {
                                    if ((0x200L & l6) == 0L) return this.c0(l4, 0L, l6, 128L);
                                    this.l = 73;
                                    this.k = 3;
                                    return this.c0(l4, 0L, l6, 128L);
                                }
                                case 'c': {
                                    return this.c0(l4, 0L, l6, 64L);
                                }
                            }
                        }
                        case 'V': {
                            if ((0x80000000000L & l4) == 0L) return this.E0(2, l4, l6);
                            return this.G0(3, 43);
                        }
                        case 'U': {
                            return this.c0(l4, 0x800002200L, l6, 0L);
                        }
                        case 'T': {
                            if ((0x80000000L & l4) != 0L) {
                                this.l = 31;
                                this.k = 3;
                                return this.c0(l4, 4295023616L, l6, 0L);
                            } else {
                                if ((0x100000000000L & l4) == 0L) return this.c0(l4, 4295023616L, l6, 0L);
                                return this.G0(3, 44);
                            }
                        }
                        case 'S': {
                            return this.c0(l4, 0x4020000000000L, l6, 0L);
                        }
                        case 'R': {
                            if ((0x800000000000L & l4) == 0L) return this.c0(l4, 0xC000000000L, l6, 0L);
                            return this.G0(3, 47);
                        }
                    }
                }
                case 'F': {
                    if ((0x10000L & l4) == 0L) return this.E0(2, l4, l6);
                    return this.G0(3, 16);
                }
                case 'E': {
                    if ((0x20L & l4) == 0L) return this.E0(2, l4, l6);
                    return this.G0(3, 5);
                }
                case 'D': {
                    if ((0x200000000000L & l4) == 0L) return this.c0(l4, 448L, l6, 0L);
                    return this.G0(3, 45);
                }
                case 'C': 
            }
            return this.c0(l4, 0x8000004000000L, l6, 0L);
        }
        if ((0x200000000L & l4) == 0L) return this.c0(l4, 0x11400000000L, l6, 0L);
        return this.G0(3, 33);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int Z(long l3, long l4, long l5, long l6) {
        block23: {
            char c4;
            if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                return this.F0(1, l3, l5);
            }
            try {
                this.f = c4 = this.c.k();
                if (c4 == 'A') return this.d0(l4, 0x40000000000L, l6, 0L);
                if (c4 == 'L') break block23;
                if (c4 == '_') return this.d0(l4, 0x40000000000000L, l6, 4L);
                if (c4 == 's') return this.d0(l4, 0x400000000000000L, l6, 1L);
                if (c4 == 'x') return this.d0(l4, 0L, l6, 8L);
                if (c4 == 'O') return this.d0(l4, 0x10000000000000L, l6, 0L);
                if (c4 == 'P') return this.d0(l4, 0x80002000000000L, l6, 0L);
                if (c4 == 'm') return this.d0(l4, 0L, l6, 2L);
                if (c4 == 'n') return this.d0(l4, Long.MIN_VALUE, l6, 288L);
                if (c4 == 'u') return this.d0(l4, 0x4000000000000000L, l6, 0L);
                if (c4 == 'v') return this.d0(l4, 0L, l6, 16L);
            }
            catch (IOException iOException) {
                this.K0(2, l4, l6);
                return 3;
            }
            switch (c4) {
                default: {
                    switch (c4) {
                        default: {
                            switch (c4) {
                                default: {
                                    return this.F0(2, l4, l6);
                                }
                                case 'e': {
                                    if ((0x200000000000000L & l4) == 0L) return this.F0(2, l4, l6);
                                    return this.G0(3, 57);
                                }
                                case 'd': {
                                    if ((0x200L & l6) == 0L) return this.d0(l4, 0L, l6, 128L);
                                    this.l = 73;
                                    this.k = 3;
                                    return this.d0(l4, 0L, l6, 128L);
                                }
                                case 'c': {
                                    return this.d0(l4, 0L, l6, 64L);
                                }
                            }
                        }
                        case 'V': {
                            if ((0x80000000000L & l4) == 0L) return this.F0(2, l4, l6);
                            return this.G0(3, 43);
                        }
                        case 'U': {
                            return this.d0(l4, 0x800002200L, l6, 0L);
                        }
                        case 'T': {
                            if ((0x80000000L & l4) != 0L) {
                                this.l = 31;
                                this.k = 3;
                                return this.d0(l4, 4295023616L, l6, 0L);
                            } else {
                                if ((0x100000000000L & l4) == 0L) return this.d0(l4, 4295023616L, l6, 0L);
                                return this.G0(3, 44);
                            }
                        }
                        case 'S': {
                            return this.d0(l4, 0x4020000000000L, l6, 0L);
                        }
                        case 'R': {
                            if ((0x800000000000L & l4) == 0L) return this.d0(l4, 0xC000000000L, l6, 0L);
                            return this.G0(3, 47);
                        }
                    }
                }
                case 'F': {
                    if ((0x10000L & l4) == 0L) return this.F0(2, l4, l6);
                    return this.G0(3, 16);
                }
                case 'E': {
                    if ((0x20L & l4) == 0L) return this.F0(2, l4, l6);
                    return this.G0(3, 5);
                }
                case 'D': {
                    if ((0x200000000000L & l4) == 0L) return this.d0(l4, 448L, l6, 0L);
                    return this.G0(3, 45);
                }
                case 'C': 
            }
            return this.d0(l4, 0x8000004000000L, l6, 0L);
        }
        if ((0x200000000L & l4) == 0L) return this.d0(l4, 0x11400000000L, l6, 0L);
        return this.G0(3, 33);
    }

    private void a() {
        this.j = -2147483647;
        int n3 = 52;
        while (true) {
            int n4 = n3 - 1;
            if (n3 <= 0) break;
            this.d[n4] = Integer.MIN_VALUE;
            n3 = n4;
        }
    }

    private int a0(long l3, long l4, long l5, long l6) {
        block31: {
            block32: {
                block42: {
                    block33: {
                        block34: {
                            block35: {
                                block36: {
                                    block37: {
                                        block38: {
                                            block39: {
                                                block40: {
                                                    block41: {
                                                        char c4;
                                                        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                            return this.C0(2, l3, l5);
                                                        }
                                                        try {
                                                            this.f = c4 = this.c.k();
                                                            if (c4 == ' ') break block31;
                                                            if (c4 == 'I') break block32;
                                                            if (c4 == '[') break block33;
                                                            if (c4 == '_') break block34;
                                                            if (c4 == 'a') break block35;
                                                            if (c4 == 'c') break block36;
                                                            if (c4 == 'e') break block37;
                                                            if (c4 == 'p') break block38;
                                                            if (c4 == 'v') break block39;
                                                            if (c4 == 'K') break block40;
                                                            if (c4 == 'L') break block41;
                                                        }
                                                        catch (IOException iOException) {
                                                            this.H0(3, l4, l6);
                                                            return 4;
                                                        }
                                                        switch (c4) {
                                                            default: {
                                                                switch (c4) {
                                                                    default: {
                                                                        switch (c4) {
                                                                            default: {
                                                                                switch (c4) {
                                                                                    default: {
                                                                                        break block42;
                                                                                    }
                                                                                    case 't': {
                                                                                        return this.e0(l4, 0L, l6, 1L);
                                                                                    }
                                                                                    case 's': {
                                                                                        return this.e0(l4, 0L, l6, 8L);
                                                                                    }
                                                                                    case 'r': {
                                                                                        return this.e0(l4, 0x4000000000000000L, l6, 0L);
                                                                                    }
                                                                                }
                                                                            }
                                                                            case 'U': {
                                                                                return this.e0(l4, 0x20000000000L, l6, 0L);
                                                                            }
                                                                            case 'T': {
                                                                                if ((0x4000000000000L & l4) != 0L) {
                                                                                    return this.y0(4, 50, 1);
                                                                                }
                                                                                return this.e0(l4, 0x40000000000000L, l6, 0L);
                                                                            }
                                                                            case 'S': {
                                                                                return this.e0(l4, 0x100000000L, l6, 0L);
                                                                            }
                                                                            case 'R': {
                                                                                return this.e0(l4, 4569845202944L, l6, 0L);
                                                                            }
                                                                        }
                                                                    }
                                                                    case 'P': {
                                                                        return this.e0(l4, 8704L, l6, 0L);
                                                                    }
                                                                    case 'O': {
                                                                        return this.e0(l4, 0x1000000000L, l6, 0L);
                                                                    }
                                                                    case 'N': {
                                                                        return this.e0(l4, 256L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            case 'C': {
                                                                return this.e0(l4, 0x4400000000L, l6, 0L);
                                                            }
                                                            case 'B': {
                                                                return this.e0(l4, 128L, l6, 0L);
                                                            }
                                                            case 'A': {
                                                                return this.e0(l4, 67165184L, l6, 0L);
                                                            }
                                                        }
                                                    }
                                                    return this.e0(l4, 0x8000000000L, l6, 0L);
                                                }
                                                if ((0x40L & l4) != 0L) {
                                                    return this.y0(4, 6, 1);
                                                }
                                                break block42;
                                            }
                                            return this.e0(l4, 0L, l6, 4L);
                                        }
                                        return this.e0(l4, 0L, l6, 2L);
                                    }
                                    if ((0x400000000000000L & l4) != 0L) {
                                        return this.y0(4, 58, 1);
                                    }
                                    if ((0x20L & l6) != 0L) {
                                        this.l = 69;
                                        this.k = 4;
                                    }
                                    return this.e0(l4, Long.MIN_VALUE, l6, 0L);
                                }
                                if ((0x100L & l6) != 0L) {
                                    return this.G0(4, 72);
                                }
                                break block42;
                            }
                            return this.e0(l4, 0L, l6, 80L);
                        }
                        return this.e0(l4, 0x80000000000000L, l6, 0L);
                    }
                    if ((0x8000000000000L & l4) != 0L) {
                        return this.G0(4, 51);
                    }
                    if ((0x10000000000000L & l4) != 0L) {
                        return this.G0(4, 52);
                    }
                }
                return this.C0(3, l4, l6);
            }
            return this.e0(l4, 0x10000000000L, l6, 0L);
        }
        return this.e0(l4, 0L, l6, 128L);
    }

    private int b0(long l3, long l4, long l5, long l6) {
        block31: {
            block32: {
                block42: {
                    block33: {
                        block34: {
                            block35: {
                                block36: {
                                    block37: {
                                        block38: {
                                            block39: {
                                                block40: {
                                                    block41: {
                                                        char c4;
                                                        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                            return this.D0(2, l3, l5);
                                                        }
                                                        try {
                                                            this.f = c4 = this.c.k();
                                                            if (c4 == ' ') break block31;
                                                            if (c4 == 'I') break block32;
                                                            if (c4 == '[') break block33;
                                                            if (c4 == '_') break block34;
                                                            if (c4 == 'a') break block35;
                                                            if (c4 == 'c') break block36;
                                                            if (c4 == 'e') break block37;
                                                            if (c4 == 'p') break block38;
                                                            if (c4 == 'v') break block39;
                                                            if (c4 == 'K') break block40;
                                                            if (c4 == 'L') break block41;
                                                        }
                                                        catch (IOException iOException) {
                                                            this.I0(3, l4, l6);
                                                            return 4;
                                                        }
                                                        switch (c4) {
                                                            default: {
                                                                switch (c4) {
                                                                    default: {
                                                                        switch (c4) {
                                                                            default: {
                                                                                switch (c4) {
                                                                                    default: {
                                                                                        break block42;
                                                                                    }
                                                                                    case 't': {
                                                                                        return this.f0(l4, 0L, l6, 1L);
                                                                                    }
                                                                                    case 's': {
                                                                                        return this.f0(l4, 0L, l6, 8L);
                                                                                    }
                                                                                    case 'r': {
                                                                                        return this.f0(l4, 0x4000000000000000L, l6, 0L);
                                                                                    }
                                                                                }
                                                                            }
                                                                            case 'U': {
                                                                                return this.f0(l4, 0x20000000000L, l6, 0L);
                                                                            }
                                                                            case 'T': {
                                                                                if ((0x4000000000000L & l4) != 0L) {
                                                                                    return this.G0(4, 50);
                                                                                }
                                                                                return this.f0(l4, 0x40000000000000L, l6, 0L);
                                                                            }
                                                                            case 'S': {
                                                                                return this.f0(l4, 0x100000000L, l6, 0L);
                                                                            }
                                                                            case 'R': {
                                                                                return this.f0(l4, 4569845202944L, l6, 0L);
                                                                            }
                                                                        }
                                                                    }
                                                                    case 'P': {
                                                                        return this.f0(l4, 8704L, l6, 0L);
                                                                    }
                                                                    case 'O': {
                                                                        return this.f0(l4, 0x1000000000L, l6, 0L);
                                                                    }
                                                                    case 'N': {
                                                                        return this.f0(l4, 256L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            case 'C': {
                                                                return this.f0(l4, 0x4400000000L, l6, 0L);
                                                            }
                                                            case 'B': {
                                                                return this.f0(l4, 128L, l6, 0L);
                                                            }
                                                            case 'A': {
                                                                return this.f0(l4, 67165184L, l6, 0L);
                                                            }
                                                        }
                                                    }
                                                    return this.f0(l4, 0x8000000000L, l6, 0L);
                                                }
                                                if ((0x40L & l4) != 0L) {
                                                    return this.G0(4, 6);
                                                }
                                                break block42;
                                            }
                                            return this.f0(l4, 0L, l6, 4L);
                                        }
                                        return this.f0(l4, 0L, l6, 2L);
                                    }
                                    if ((0x400000000000000L & l4) != 0L) {
                                        return this.G0(4, 58);
                                    }
                                    if ((0x20L & l6) != 0L) {
                                        this.l = 69;
                                        this.k = 4;
                                    }
                                    return this.f0(l4, Long.MIN_VALUE, l6, 0L);
                                }
                                if ((0x100L & l6) != 0L) {
                                    return this.G0(4, 72);
                                }
                                break block42;
                            }
                            return this.f0(l4, 0L, l6, 80L);
                        }
                        return this.f0(l4, 0x80000000000000L, l6, 0L);
                    }
                    if ((0x8000000000000L & l4) != 0L) {
                        return this.G0(4, 51);
                    }
                    if ((0x10000000000000L & l4) != 0L) {
                        return this.G0(4, 52);
                    }
                }
                return this.D0(3, l4, l6);
            }
            return this.f0(l4, 0x10000000000L, l6, 0L);
        }
        return this.f0(l4, 0L, l6, 128L);
    }

    private void c(int n3, int n4) {
        while (true) {
            int[] nArray = this.e;
            int n5 = this.i;
            this.i = n5 + 1;
            nArray[n5] = o[n3];
            if (n3 == n4) {
                return;
            }
            ++n3;
        }
    }

    private int c0(long l3, long l4, long l5, long l6) {
        block31: {
            block32: {
                block42: {
                    block33: {
                        block34: {
                            block35: {
                                block36: {
                                    block37: {
                                        block38: {
                                            block39: {
                                                block40: {
                                                    block41: {
                                                        char c4;
                                                        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                            return this.E0(2, l3, l5);
                                                        }
                                                        try {
                                                            this.f = c4 = this.c.k();
                                                            if (c4 == ' ') break block31;
                                                            if (c4 == 'I') break block32;
                                                            if (c4 == '[') break block33;
                                                            if (c4 == '_') break block34;
                                                            if (c4 == 'a') break block35;
                                                            if (c4 == 'c') break block36;
                                                            if (c4 == 'e') break block37;
                                                            if (c4 == 'p') break block38;
                                                            if (c4 == 'v') break block39;
                                                            if (c4 == 'K') break block40;
                                                            if (c4 == 'L') break block41;
                                                        }
                                                        catch (IOException iOException) {
                                                            this.J0(3, l4, l6);
                                                            return 4;
                                                        }
                                                        switch (c4) {
                                                            default: {
                                                                switch (c4) {
                                                                    default: {
                                                                        switch (c4) {
                                                                            default: {
                                                                                switch (c4) {
                                                                                    default: {
                                                                                        break block42;
                                                                                    }
                                                                                    case 't': {
                                                                                        return this.g0(l4, 0L, l6, 1L);
                                                                                    }
                                                                                    case 's': {
                                                                                        return this.g0(l4, 0L, l6, 8L);
                                                                                    }
                                                                                    case 'r': {
                                                                                        return this.g0(l4, 0x4000000000000000L, l6, 0L);
                                                                                    }
                                                                                }
                                                                            }
                                                                            case 'U': {
                                                                                return this.g0(l4, 0x20000000000L, l6, 0L);
                                                                            }
                                                                            case 'T': {
                                                                                if ((0x4000000000000L & l4) != 0L) {
                                                                                    return this.G0(4, 50);
                                                                                }
                                                                                return this.g0(l4, 0x40000000000000L, l6, 0L);
                                                                            }
                                                                            case 'S': {
                                                                                return this.g0(l4, 0x100000000L, l6, 0L);
                                                                            }
                                                                            case 'R': {
                                                                                return this.g0(l4, 4569845202944L, l6, 0L);
                                                                            }
                                                                        }
                                                                    }
                                                                    case 'P': {
                                                                        return this.g0(l4, 8704L, l6, 0L);
                                                                    }
                                                                    case 'O': {
                                                                        return this.g0(l4, 0x1000000000L, l6, 0L);
                                                                    }
                                                                    case 'N': {
                                                                        return this.g0(l4, 256L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            case 'C': {
                                                                return this.g0(l4, 0x4400000000L, l6, 0L);
                                                            }
                                                            case 'B': {
                                                                return this.g0(l4, 128L, l6, 0L);
                                                            }
                                                            case 'A': {
                                                                return this.g0(l4, 67165184L, l6, 0L);
                                                            }
                                                        }
                                                    }
                                                    return this.g0(l4, 0x8000000000L, l6, 0L);
                                                }
                                                if ((0x40L & l4) != 0L) {
                                                    return this.G0(4, 6);
                                                }
                                                break block42;
                                            }
                                            return this.g0(l4, 0L, l6, 4L);
                                        }
                                        return this.g0(l4, 0L, l6, 2L);
                                    }
                                    if ((0x400000000000000L & l4) != 0L) {
                                        return this.G0(4, 58);
                                    }
                                    if ((0x20L & l6) != 0L) {
                                        this.l = 69;
                                        this.k = 4;
                                    }
                                    return this.g0(l4, Long.MIN_VALUE, l6, 0L);
                                }
                                if ((0x100L & l6) != 0L) {
                                    return this.G0(4, 72);
                                }
                                break block42;
                            }
                            return this.g0(l4, 0L, l6, 80L);
                        }
                        return this.g0(l4, 0x80000000000000L, l6, 0L);
                    }
                    if ((0x8000000000000L & l4) != 0L) {
                        return this.G0(4, 51);
                    }
                    if ((0x10000000000000L & l4) != 0L) {
                        return this.G0(4, 52);
                    }
                }
                return this.E0(3, l4, l6);
            }
            return this.g0(l4, 0x10000000000L, l6, 0L);
        }
        return this.g0(l4, 0L, l6, 128L);
    }

    private static final boolean d(int n3, int n4, int n5, long l3, long l4) {
        boolean bl = false;
        if (n3 != 0) {
            return (m[n4] & l3) != 0L;
        }
        if ((n[n5] & l4) != 0L) {
            bl = true;
        }
        return bl;
    }

    private int d0(long l3, long l4, long l5, long l6) {
        block31: {
            block32: {
                block42: {
                    block33: {
                        block34: {
                            block35: {
                                block36: {
                                    block37: {
                                        block38: {
                                            block39: {
                                                block40: {
                                                    block41: {
                                                        char c4;
                                                        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                            return this.F0(2, l3, l5);
                                                        }
                                                        try {
                                                            this.f = c4 = this.c.k();
                                                            if (c4 == ' ') break block31;
                                                            if (c4 == 'I') break block32;
                                                            if (c4 == '[') break block33;
                                                            if (c4 == '_') break block34;
                                                            if (c4 == 'a') break block35;
                                                            if (c4 == 'c') break block36;
                                                            if (c4 == 'e') break block37;
                                                            if (c4 == 'p') break block38;
                                                            if (c4 == 'v') break block39;
                                                            if (c4 == 'K') break block40;
                                                            if (c4 == 'L') break block41;
                                                        }
                                                        catch (IOException iOException) {
                                                            this.K0(3, l4, l6);
                                                            return 4;
                                                        }
                                                        switch (c4) {
                                                            default: {
                                                                switch (c4) {
                                                                    default: {
                                                                        switch (c4) {
                                                                            default: {
                                                                                switch (c4) {
                                                                                    default: {
                                                                                        break block42;
                                                                                    }
                                                                                    case 't': {
                                                                                        return this.h0(l4, 0L, l6, 1L);
                                                                                    }
                                                                                    case 's': {
                                                                                        return this.h0(l4, 0L, l6, 8L);
                                                                                    }
                                                                                    case 'r': {
                                                                                        return this.h0(l4, 0x4000000000000000L, l6, 0L);
                                                                                    }
                                                                                }
                                                                            }
                                                                            case 'U': {
                                                                                return this.h0(l4, 0x20000000000L, l6, 0L);
                                                                            }
                                                                            case 'T': {
                                                                                if ((0x4000000000000L & l4) != 0L) {
                                                                                    return this.G0(4, 50);
                                                                                }
                                                                                return this.h0(l4, 0x40000000000000L, l6, 0L);
                                                                            }
                                                                            case 'S': {
                                                                                return this.h0(l4, 0x100000000L, l6, 0L);
                                                                            }
                                                                            case 'R': {
                                                                                return this.h0(l4, 4569845202944L, l6, 0L);
                                                                            }
                                                                        }
                                                                    }
                                                                    case 'P': {
                                                                        return this.h0(l4, 8704L, l6, 0L);
                                                                    }
                                                                    case 'O': {
                                                                        return this.h0(l4, 0x1000000000L, l6, 0L);
                                                                    }
                                                                    case 'N': {
                                                                        return this.h0(l4, 256L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            case 'C': {
                                                                return this.h0(l4, 0x4400000000L, l6, 0L);
                                                            }
                                                            case 'B': {
                                                                return this.h0(l4, 128L, l6, 0L);
                                                            }
                                                            case 'A': {
                                                                return this.h0(l4, 67165184L, l6, 0L);
                                                            }
                                                        }
                                                    }
                                                    return this.h0(l4, 0x8000000000L, l6, 0L);
                                                }
                                                if ((0x40L & l4) != 0L) {
                                                    return this.G0(4, 6);
                                                }
                                                break block42;
                                            }
                                            return this.h0(l4, 0L, l6, 4L);
                                        }
                                        return this.h0(l4, 0L, l6, 2L);
                                    }
                                    if ((0x400000000000000L & l4) != 0L) {
                                        return this.G0(4, 58);
                                    }
                                    if ((0x20L & l6) != 0L) {
                                        this.l = 69;
                                        this.k = 4;
                                    }
                                    return this.h0(l4, Long.MIN_VALUE, l6, 0L);
                                }
                                if ((0x100L & l6) != 0L) {
                                    return this.G0(4, 72);
                                }
                                break block42;
                            }
                            return this.h0(l4, 0L, l6, 80L);
                        }
                        return this.h0(l4, 0x80000000000000L, l6, 0L);
                    }
                    if ((0x8000000000000L & l4) != 0L) {
                        return this.G0(4, 51);
                    }
                    if ((0x10000000000000L & l4) != 0L) {
                        return this.G0(4, 52);
                    }
                }
                return this.F0(3, l4, l6);
            }
            return this.h0(l4, 0x10000000000L, l6, 0L);
        }
        return this.h0(l4, 0L, l6, 128L);
    }

    private void e(int n3) {
        int[] nArray = this.d;
        int n4 = nArray[n3];
        int n5 = this.j;
        if (n4 != n5) {
            int[] nArray2 = this.e;
            n4 = this.i;
            this.i = n4 + 1;
            nArray2[n4] = n3;
            nArray[n3] = n5;
        }
    }

    private int e0(long l3, long l4, long l5, long l6) {
        block13: {
            block14: {
                block15: {
                    block26: {
                        block16: {
                            block17: {
                                block18: {
                                    block19: {
                                        block20: {
                                            block21: {
                                                block22: {
                                                    block23: {
                                                        block24: {
                                                            block25: {
                                                                char c4;
                                                                if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                                    return this.C0(3, l3, l5);
                                                                }
                                                                try {
                                                                    this.f = c4 = this.c.k();
                                                                    if (c4 == 'A') break block13;
                                                                    if (c4 == 'B') break block14;
                                                                    if (c4 == 'E') break block15;
                                                                    if (c4 == 'G') break block16;
                                                                    if (c4 == 'I') break block17;
                                                                    if (c4 == 'V') break block18;
                                                                    if (c4 == 'a') break block19;
                                                                    if (c4 == 'l') break block20;
                                                                    if (c4 == 't') break block21;
                                                                    if (c4 == 'N') break block22;
                                                                    if (c4 == 'O') break block23;
                                                                    if (c4 == 'c') break block24;
                                                                    if (c4 == 'd') break block25;
                                                                }
                                                                catch (IOException iOException) {
                                                                    this.H0(4, l4, l6);
                                                                    return 5;
                                                                }
                                                                switch (c4) {
                                                                    default: {
                                                                        break block26;
                                                                    }
                                                                    case 'T': {
                                                                        if ((0x4000000L & l4) != 0L) {
                                                                            return this.y0(5, 26, 1);
                                                                        }
                                                                        break block26;
                                                                    }
                                                                    case 'S': {
                                                                        return this.i0(l4, 0x10000000000L, l6, 0L);
                                                                    }
                                                                    case 'R': {
                                                                        return this.i0(l4, 0x20000000000L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            return this.i0(l4, Long.MIN_VALUE, l6, 0L);
                                                        }
                                                        return this.i0(l4, 0x4000000000000000L, l6, 0L);
                                                    }
                                                    return this.i0(l4, 18015016984772736L, l6, 0L);
                                                }
                                                if ((0x800000000L & l4) != 0L) {
                                                    return this.y0(5, 35, 1);
                                                }
                                                return this.i0(l4, 0x80000000000000L, l6, 0L);
                                            }
                                            return this.i0(l4, 0L, l6, 8L);
                                        }
                                        if ((0x10L & l6) != 0L) {
                                            return this.G0(5, 68);
                                        }
                                        if ((0x40L & l6) != 0L) {
                                            return this.G0(5, 70);
                                        }
                                        return this.i0(l4, 0L, l6, 129L);
                                    }
                                    return this.i0(l4, 0L, l6, 6L);
                                }
                                return this.i0(l4, 8704L, l6, 0L);
                            }
                            return this.i0(l4, 256L, l6, 0L);
                        }
                        if ((0x40000000000L & l4) != 0L) {
                            return this.y0(5, 42, 1);
                        }
                    }
                    return this.C0(4, l4, l6);
                }
                return this.i0(l4, 0x2100000000L, l6, 0L);
            }
            return this.i0(l4, 56320L, l6, 0L);
        }
        return this.i0(l4, 0x4400000000L, l6, 0L);
    }

    private void f(int n3, int n4) {
        while (true) {
            this.e(o[n3]);
            if (n3 == n4) {
                return;
            }
            ++n3;
        }
    }

    private int f0(long l3, long l4, long l5, long l6) {
        block13: {
            block14: {
                block15: {
                    block26: {
                        block16: {
                            block17: {
                                block18: {
                                    block19: {
                                        block20: {
                                            block21: {
                                                block22: {
                                                    block23: {
                                                        block24: {
                                                            block25: {
                                                                char c4;
                                                                if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                                    return this.D0(3, l3, l5);
                                                                }
                                                                try {
                                                                    this.f = c4 = this.c.k();
                                                                    if (c4 == 'A') break block13;
                                                                    if (c4 == 'B') break block14;
                                                                    if (c4 == 'E') break block15;
                                                                    if (c4 == 'G') break block16;
                                                                    if (c4 == 'I') break block17;
                                                                    if (c4 == 'V') break block18;
                                                                    if (c4 == 'a') break block19;
                                                                    if (c4 == 'l') break block20;
                                                                    if (c4 == 't') break block21;
                                                                    if (c4 == 'N') break block22;
                                                                    if (c4 == 'O') break block23;
                                                                    if (c4 == 'c') break block24;
                                                                    if (c4 == 'd') break block25;
                                                                }
                                                                catch (IOException iOException) {
                                                                    this.I0(4, l4, l6);
                                                                    return 5;
                                                                }
                                                                switch (c4) {
                                                                    default: {
                                                                        break block26;
                                                                    }
                                                                    case 'T': {
                                                                        if ((0x4000000L & l4) != 0L) {
                                                                            return this.G0(5, 26);
                                                                        }
                                                                        break block26;
                                                                    }
                                                                    case 'S': {
                                                                        return this.j0(l4, 0x10000000000L, l6, 0L);
                                                                    }
                                                                    case 'R': {
                                                                        return this.j0(l4, 0x20000000000L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            return this.j0(l4, Long.MIN_VALUE, l6, 0L);
                                                        }
                                                        return this.j0(l4, 0x4000000000000000L, l6, 0L);
                                                    }
                                                    return this.j0(l4, 18015016984772736L, l6, 0L);
                                                }
                                                if ((0x800000000L & l4) != 0L) {
                                                    return this.G0(5, 35);
                                                }
                                                return this.j0(l4, 0x80000000000000L, l6, 0L);
                                            }
                                            return this.j0(l4, 0L, l6, 8L);
                                        }
                                        if ((0x10L & l6) != 0L) {
                                            return this.G0(5, 68);
                                        }
                                        if ((0x40L & l6) != 0L) {
                                            return this.G0(5, 70);
                                        }
                                        return this.j0(l4, 0L, l6, 129L);
                                    }
                                    return this.j0(l4, 0L, l6, 6L);
                                }
                                return this.j0(l4, 8704L, l6, 0L);
                            }
                            return this.j0(l4, 256L, l6, 0L);
                        }
                        if ((0x40000000000L & l4) != 0L) {
                            return this.G0(5, 42);
                        }
                    }
                    return this.D0(4, l4, l6);
                }
                return this.j0(l4, 0x2100000000L, l6, 0L);
            }
            return this.j0(l4, 56320L, l6, 0L);
        }
        return this.j0(l4, 0x4400000000L, l6, 0L);
    }

    private void g(int n3, int n4) {
        this.e(n3);
        this.e(n4);
    }

    private int g0(long l3, long l4, long l5, long l6) {
        block13: {
            block14: {
                block15: {
                    block26: {
                        block16: {
                            block17: {
                                block18: {
                                    block19: {
                                        block20: {
                                            block21: {
                                                block22: {
                                                    block23: {
                                                        block24: {
                                                            block25: {
                                                                char c4;
                                                                if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                                    return this.E0(3, l3, l5);
                                                                }
                                                                try {
                                                                    this.f = c4 = this.c.k();
                                                                    if (c4 == 'A') break block13;
                                                                    if (c4 == 'B') break block14;
                                                                    if (c4 == 'E') break block15;
                                                                    if (c4 == 'G') break block16;
                                                                    if (c4 == 'I') break block17;
                                                                    if (c4 == 'V') break block18;
                                                                    if (c4 == 'a') break block19;
                                                                    if (c4 == 'l') break block20;
                                                                    if (c4 == 't') break block21;
                                                                    if (c4 == 'N') break block22;
                                                                    if (c4 == 'O') break block23;
                                                                    if (c4 == 'c') break block24;
                                                                    if (c4 == 'd') break block25;
                                                                }
                                                                catch (IOException iOException) {
                                                                    this.J0(4, l4, l6);
                                                                    return 5;
                                                                }
                                                                switch (c4) {
                                                                    default: {
                                                                        break block26;
                                                                    }
                                                                    case 'T': {
                                                                        if ((0x4000000L & l4) != 0L) {
                                                                            return this.G0(5, 26);
                                                                        }
                                                                        break block26;
                                                                    }
                                                                    case 'S': {
                                                                        return this.k0(l4, 0x10000000000L, l6, 0L);
                                                                    }
                                                                    case 'R': {
                                                                        return this.k0(l4, 0x20000000000L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            return this.k0(l4, Long.MIN_VALUE, l6, 0L);
                                                        }
                                                        return this.k0(l4, 0x4000000000000000L, l6, 0L);
                                                    }
                                                    return this.k0(l4, 18015016984772736L, l6, 0L);
                                                }
                                                if ((0x800000000L & l4) != 0L) {
                                                    return this.G0(5, 35);
                                                }
                                                return this.k0(l4, 0x80000000000000L, l6, 0L);
                                            }
                                            return this.k0(l4, 0L, l6, 8L);
                                        }
                                        if ((0x10L & l6) != 0L) {
                                            return this.G0(5, 68);
                                        }
                                        if ((0x40L & l6) != 0L) {
                                            return this.G0(5, 70);
                                        }
                                        return this.k0(l4, 0L, l6, 129L);
                                    }
                                    return this.k0(l4, 0L, l6, 6L);
                                }
                                return this.k0(l4, 8704L, l6, 0L);
                            }
                            return this.k0(l4, 256L, l6, 0L);
                        }
                        if ((0x40000000000L & l4) != 0L) {
                            return this.G0(5, 42);
                        }
                    }
                    return this.E0(4, l4, l6);
                }
                return this.k0(l4, 0x2100000000L, l6, 0L);
            }
            return this.k0(l4, 56320L, l6, 0L);
        }
        return this.k0(l4, 0x4400000000L, l6, 0L);
    }

    private int h0(long l3, long l4, long l5, long l6) {
        block13: {
            block14: {
                block15: {
                    block26: {
                        block16: {
                            block17: {
                                block18: {
                                    block19: {
                                        block20: {
                                            block21: {
                                                block22: {
                                                    block23: {
                                                        block24: {
                                                            block25: {
                                                                char c4;
                                                                if (((l4 &= l3) | (l6 &= l5)) == 0L) {
                                                                    return this.F0(3, l3, l5);
                                                                }
                                                                try {
                                                                    this.f = c4 = this.c.k();
                                                                    if (c4 == 'A') break block13;
                                                                    if (c4 == 'B') break block14;
                                                                    if (c4 == 'E') break block15;
                                                                    if (c4 == 'G') break block16;
                                                                    if (c4 == 'I') break block17;
                                                                    if (c4 == 'V') break block18;
                                                                    if (c4 == 'a') break block19;
                                                                    if (c4 == 'l') break block20;
                                                                    if (c4 == 't') break block21;
                                                                    if (c4 == 'N') break block22;
                                                                    if (c4 == 'O') break block23;
                                                                    if (c4 == 'c') break block24;
                                                                    if (c4 == 'd') break block25;
                                                                }
                                                                catch (IOException iOException) {
                                                                    this.K0(4, l4, l6);
                                                                    return 5;
                                                                }
                                                                switch (c4) {
                                                                    default: {
                                                                        break block26;
                                                                    }
                                                                    case 'T': {
                                                                        if ((0x4000000L & l4) != 0L) {
                                                                            return this.G0(5, 26);
                                                                        }
                                                                        break block26;
                                                                    }
                                                                    case 'S': {
                                                                        return this.l0(l4, 0x10000000000L, l6, 0L);
                                                                    }
                                                                    case 'R': {
                                                                        return this.l0(l4, 0x20000000000L, l6, 0L);
                                                                    }
                                                                }
                                                            }
                                                            return this.l0(l4, Long.MIN_VALUE, l6, 0L);
                                                        }
                                                        return this.l0(l4, 0x4000000000000000L, l6, 0L);
                                                    }
                                                    return this.l0(l4, 18015016984772736L, l6, 0L);
                                                }
                                                if ((0x800000000L & l4) != 0L) {
                                                    return this.G0(5, 35);
                                                }
                                                return this.l0(l4, 0x80000000000000L, l6, 0L);
                                            }
                                            return this.l0(l4, 0L, l6, 8L);
                                        }
                                        if ((0x10L & l6) != 0L) {
                                            return this.G0(5, 68);
                                        }
                                        if ((0x40L & l6) != 0L) {
                                            return this.G0(5, 70);
                                        }
                                        return this.l0(l4, 0L, l6, 129L);
                                    }
                                    return this.l0(l4, 0L, l6, 6L);
                                }
                                return this.l0(l4, 8704L, l6, 0L);
                            }
                            return this.l0(l4, 256L, l6, 0L);
                        }
                        if ((0x40000000000L & l4) != 0L) {
                            return this.G0(5, 42);
                        }
                    }
                    return this.F0(4, l4, l6);
                }
                return this.l0(l4, 0x2100000000L, l6, 0L);
            }
            return this.l0(l4, 56320L, l6, 0L);
        }
        return this.l0(l4, 0x4400000000L, l6, 0L);
    }

    /*
     * Unable to fully structure code
     */
    private int i(int var1_1, int var2_2) {
        this.i = 52;
        this.e[0] = var1_1;
        var5_3 = var2_2;
        var4_4 = 0;
        var2_2 = 1;
        var1_1 = 0x7FFFFFFF;
        block62: while (true) {
            block174: {
                block173: {
                    this.j = var3_5 = this.j + 1;
                    if (var3_5 == 0x7FFFFFFF) {
                        this.a();
                    }
                    if ((var3_5 = (int)this.f) >= 64) break block173;
                    var9_9 = 1L << var3_5;
                    var3_5 = var2_2;
                    do {
                        var13_11 = this.e;
                        var6_6 = var3_5 - 1;
                        block1 : switch (var13_11[var6_6]) {
                            default: {
                                var2_2 = var1_1;
                                break;
                            }
                            case 52: {
                                cfr_temp_0 = (var9_9 & 0x100001200L) - 0L;
                                var2_2 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                if (var2_2 != 0) {
                                    this.g(3, 4);
                                } else if (this.f == ';') {
                                    this.f(121, 123);
                                }
                                if (var2_2 != 0) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        this.g(46, 47);
                                        var2_2 = var1_1;
                                        break block1;
                                        break;
                                    }
                                }
                                var2_2 = var1_1;
                                if (this.f != ';') break;
                                var2_2 = var1_1;
                                if (var1_1 <= 4) ** GOTO lbl40
lbl38:
                                // 3 sources

                                while (true) {
                                    var2_2 = 4;
lbl40:
                                    // 4 sources

                                    while (true) {
                                        this.e(48);
                                        break block1;
                                        break;
                                    }
                                    break;
                                }
                            }
                            case 51: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var2_2 = var1_1;
                                if (var1_1 > 79) {
                                    var2_2 = 79;
                                }
                                var3_5 = 51;
                                var1_1 = var2_2;
                                var2_2 = var3_5;
lbl53:
                                // 5 sources

                                while (true) {
                                    this.e(var2_2);
                                    var2_2 = var1_1;
                                    break block1;
                                    break;
                                }
                            }
                            case 50: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 > 79) {
                                    var3_5 = 79;
                                }
                                var2_2 = 96;
                                var1_1 = 100;
lbl66:
                                // 7 sources

                                while (true) {
                                    this.f(var2_2, var1_1);
                                    var2_2 = var3_5;
                                    break block1;
                                    break;
                                }
                            }
                            case 49: {
                                if (this.f != ';') {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 > 4) {
                                    var3_5 = 4;
                                }
                                var2_2 = 109;
                                var1_1 = 112;
                                ** GOTO lbl66
                            }
                            case 48: {
                                if ((var9_9 & -9217L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var2_2 = var1_1;
                                if (var1_1 <= 4) ** GOTO lbl40
                                ** GOTO lbl38
                            }
                            case 47: {
                                if (this.f != ';') {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var2_2 = var1_1;
                                if (var1_1 <= 4) ** continue;
                                ** continue;
                            }
                            case 46: {
                                var2_2 = var1_1;
                                if ((var9_9 & 0x100001200L) == 0L) break;
                                ** continue;
                            }
                            case 45: {
                                var2_2 = var1_1;
                                if ((var9_9 & 0x100001200L) == 0L) break;
                                var2_2 = 101;
                                var7_7 = 104;
                                var3_5 = var1_1;
                                var1_1 = var7_7;
                                ** GOTO lbl66
                            }
                            case 44: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 > 84) {
                                    var3_5 = 84;
                                }
lbl113:
                                // 4 sources

                                while (true) {
                                    var2_2 = 44;
                                    var1_1 = var3_5;
                                    ** GOTO lbl53
                                    break;
                                }
                            }
                            case 43: {
                                var2_2 = var1_1;
                                if ((var9_9 & 0x280000000000L) == 0L) break;
                                var3_5 = var1_1;
                                ** continue;
                            }
                            case 41: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var2_2 = var1_1;
                                if (var1_1 > 84) {
                                    var2_2 = 84;
                                }
                                var7_7 = 41;
                                var3_5 = 42;
                                var1_1 = var2_2;
                                var2_2 = var7_7;
lbl133:
                                // 4 sources

                                while (true) {
                                    this.g(var2_2, var3_5);
                                    var2_2 = var1_1;
                                    break block1;
                                    break;
                                }
                            }
                            case 40: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 > 84) {
                                    var3_5 = 84;
                                }
lbl144:
                                // 4 sources

                                while (true) {
                                    var2_2 = 40;
                                    var1_1 = var3_5;
                                    ** GOTO lbl53
                                    break;
                                }
                            }
                            case 39: {
                                var2_2 = var1_1;
                                if ((var9_9 & 0x280000000000L) == 0L) break;
                                var3_5 = var1_1;
                                ** continue;
                            }
                            case 37: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 <= 84) ** GOTO lbl161
lbl159:
                                // 2 sources

                                while (true) {
                                    var3_5 = 84;
lbl161:
                                    // 3 sources

                                    while (true) {
                                        var2_2 = 37;
                                        var7_7 = 38;
                                        var1_1 = var3_5;
                                        var3_5 = var7_7;
                                        ** GOTO lbl133
                                        break;
                                    }
                                    break;
                                }
                            }
                            case 36: {
                                if (this.f != '.') {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 <= 84) ** continue;
                                ** continue;
                            }
                            case 35: {
                                var2_2 = var1_1;
                                if ((var9_9 & 0x3FF000000000000L) == 0L) break;
                                var2_2 = 35;
                                var3_5 = 36;
                                ** GOTO lbl133
                            }
                            case 34: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 > 84) {
                                    var3_5 = 84;
                                }
                                var2_2 = 124;
                                var1_1 = 127;
                                ** GOTO lbl66
                            }
                            case 33: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 > 84) {
                                    var3_5 = 84;
                                }
lbl197:
                                // 4 sources

                                while (true) {
                                    var2_2 = 33;
                                    var1_1 = var3_5;
                                    ** GOTO lbl53
                                    break;
                                }
                            }
                            case 32: {
                                var2_2 = var1_1;
                                if ((var9_9 & 0x280000000000L) == 0L) break;
                                var3_5 = var1_1;
                                ** continue;
                            }
                            case 30: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 > 84) {
                                    var3_5 = 84;
                                }
                                var2_2 = 30;
                                var7_7 = 31;
                                var1_1 = var3_5;
                                var3_5 = var7_7;
                                ** continue;
                            }
                            case 29: {
                                var2_2 = var1_1;
                                if (this.f != '.') break;
                                var2_2 = 30;
                                ** continue;
                            }
                            case 28: {
                                var2_2 = var1_1;
                                if (this.f != '-') break;
                                this.c(113, 114);
                                var2_2 = var1_1;
                                break;
                            }
                            case 27: {
                                var2_2 = var1_1;
                                if (this.f != '\'') break;
                                var2_2 = var1_1;
                                if (var1_1 <= 81) break;
lbl234:
                                // 2 sources

                                while (true) {
                                    var2_2 = 81;
                                    break block1;
                                    break;
                                }
                            }
                            case 26: {
                                var2_2 = var1_1;
                                if ((var9_9 & -549755813889L) == 0L) break;
                            }
                            case 25: {
                                var2_2 = 115;
                                var7_7 = 117;
                                var3_5 = var1_1;
                                var1_1 = var7_7;
                                ** GOTO lbl66
                            }
                            case 23: {
                                var3_5 = 115;
                                var7_7 = 117;
                                var2_2 = var1_1;
                                if (this.f != '\'') break;
                                var2_2 = var3_5;
                                var3_5 = var1_1;
                                var1_1 = var7_7;
                                ** GOTO lbl66
                            }
                            case 22: {
                                var2_2 = var1_1;
                                if (this.f != '\"') break;
                                var2_2 = var1_1;
                                if (var1_1 <= 81) break;
                                ** continue;
                            }
                            case 21: {
                                var2_2 = var1_1;
                                if ((var9_9 & -17179869185L) == 0L) break;
                            }
lbl264:
                            // 3 sources

                            case 20: {
                                this.f(118, 120);
                                var2_2 = var1_1;
                                break;
                            }
                            case 18: {
                                var2_2 = var1_1;
                                if (this.f != '\"') break;
                                ** GOTO lbl264
                            }
                            case 17: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var2_2 = var1_1;
                                if (var1_1 > 80) {
                                    var2_2 = 80;
                                }
                                var1_1 = this.i;
                                this.i = var1_1 + 1;
                                var13_11[var1_1] = 17;
                                break;
                            }
                            case 15: {
                                var2_2 = var1_1;
                                if (this.f != '0') break;
                                var2_2 = this.i;
                                this.i = var2_2 + 1;
                                var13_11[var2_2] = 16;
                                var2_2 = var1_1;
                                break;
                            }
                            case 14: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var2_2 = var1_1;
                                if (var1_1 > 78) {
                                    var2_2 = 78;
                                }
                                var1_1 = this.i;
                                this.i = var1_1 + 1;
                                var13_11[var1_1] = 14;
                                break;
                            }
                            case 12: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var2_2 = var1_1;
                                if (var1_1 > 77) {
                                    var2_2 = 77;
                                }
                                var1_1 = this.i;
                                this.i = var1_1 + 1;
                                var13_11[var1_1] = 12;
                                break;
                            }
                            case 10: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var2_2 = var1_1;
                                if (var1_1 > 76) {
                                    var2_2 = 76;
                                }
                                var1_1 = this.i;
                                this.i = var1_1 + 1;
                                var13_11[var1_1] = 10;
                                break;
                            }
                            case 8: {
                                var2_2 = var1_1;
                                if (this.f != ':') break;
                                var2_2 = this.i;
                                this.i = var2_2 + 1;
                                var13_11[var2_2] = 9;
                                var2_2 = var1_1;
                                break;
                            }
                            case 7: {
                                var2_2 = var1_1;
                                if (this.f != '\r') break;
                                var2_2 = this.i;
                                this.i = var2_2 + 1;
                                var13_11[var2_2] = 6;
                                var2_2 = var1_1;
                                break;
                            }
                            case 6: {
                                if (this.f != '\n') {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 <= 74) ** GOTO lbl348
lbl346:
                                // 2 sources

                                while (true) {
                                    var3_5 = 74;
lbl348:
                                    // 3 sources

                                    while (true) {
                                        var2_2 = 105;
                                        var1_1 = 108;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                            }
                            case 5: {
                                var2_2 = var1_1;
                                if ((var9_9 & -9217L) == 0L) break;
lbl355:
                                // 2 sources

                                while (true) {
                                    this.f(121, 123);
                                    var2_2 = var1_1;
                                    break block1;
                                    break;
                                }
                            }
                            case 4: {
                                var2_2 = var1_1;
                                if (this.f != ';') break;
                                ** continue;
                            }
                            case 3: {
                                var2_2 = var1_1;
                                if ((var9_9 & 0x100001200L) == 0L) break;
                                this.g(3, 4);
                                var2_2 = var1_1;
                                break;
                            }
                            case 2: {
                                if ((var9_9 & 9216L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var3_5 = var1_1;
                                if (var1_1 <= 74) ** continue;
                                ** continue;
                            }
                            case 1: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) {
                                    var2_2 = var1_1;
                                    break;
                                }
                                var2_2 = var1_1;
                                if (var1_1 > 61) {
                                    var2_2 = 61;
                                }
                                var1_1 = this.i;
                                this.i = var1_1 + 1;
                                var13_11[var1_1] = 1;
                                break;
                            }
                            case 0: {
                                if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl400
                                var2_2 = var1_1;
                                if (var1_1 > 79) {
                                    var2_2 = 79;
                                }
                                var7_7 = 96;
                                var3_5 = 100;
                                var1_1 = var2_2;
                                var2_2 = var7_7;
lbl396:
                                // 4 sources

                                while (true) {
                                    this.f(var2_2, var3_5);
                                    var3_5 = var1_1;
                                    ** GOTO lbl445
                                    break;
                                }
lbl400:
                                // 1 sources

                                if ((var9_9 & 0x100001200L) == 0L) ** GOTO lbl404
                                var2_2 = 101;
                                var3_5 = 104;
                                ** GOTO lbl396
lbl404:
                                // 1 sources

                                if ((var9_9 & 9216L) == 0L) ** GOTO lbl413
                                var3_5 = var1_1;
                                if (var1_1 > 74) {
                                    var3_5 = 74;
                                }
                                var2_2 = 105;
                                var7_7 = 108;
                                var1_1 = var3_5;
                                var3_5 = var7_7;
                                ** GOTO lbl396
lbl413:
                                // 1 sources

                                var2_2 = this.f;
                                if (var2_2 == 59) {
                                    var3_5 = var1_1;
                                    if (var1_1 > 4) {
                                        var3_5 = 4;
                                    }
                                    var2_2 = 109;
                                    var7_7 = 112;
                                    var1_1 = var3_5;
                                    var3_5 = var7_7;
                                    ** continue;
                                }
                                if (var2_2 == 46) {
                                    this.e(30);
                                    var3_5 = var1_1;
                                } else if (var2_2 == 45) {
                                    this.c(113, 114);
                                    var3_5 = var1_1;
                                } else if (var2_2 == 39) {
                                    this.f(115, 117);
                                    var3_5 = var1_1;
                                } else if (var2_2 == 34) {
                                    this.f(118, 120);
                                    var3_5 = var1_1;
                                } else {
                                    var3_5 = var1_1;
                                    if (var2_2 == 58) {
                                        var2_2 = this.i;
                                        this.i = var2_2 + 1;
                                        var13_11[var2_2] = 9;
                                        var3_5 = var1_1;
                                    }
                                }
lbl445:
                                // 8 sources

                                var1_1 = this.f;
                                if (var1_1 == 48) {
                                    var13_11 = this.e;
                                    var1_1 = this.i;
                                    this.i = var1_1 + 1;
                                    var13_11[var1_1] = 16;
                                    var2_2 = var3_5;
                                    break;
                                }
                                var2_2 = var3_5;
                                if (var1_1 != 13) break;
                                var13_11 = this.e;
                                var1_1 = this.i;
                                this.i = var1_1 + 1;
                                var13_11[var1_1] = 6;
                                var2_2 = var3_5;
                            }
                        }
                        var3_5 = var6_6;
                        var1_1 = var2_2;
                    } while (var6_6 != var4_4);
                    ** GOTO lbl650
                }
                if (var3_5 >= 128) break block174;
                var9_9 = 1L << (var3_5 & 63);
                var3_5 = var2_2;
                do {
                    block185: {
                        block175: {
                            block176: {
                                block177: {
                                    block178: {
                                        block179: {
                                            block180: {
                                                block181: {
                                                    block182: {
                                                        block183: {
                                                            block184: {
                                                                if ((var2_2 = (var13_11 = this.e)[var6_6 = var3_5 - 1]) == 0) break block175;
                                                                if (var2_2 == 1) break block176;
                                                                if (var2_2 == 5) break block177;
                                                                if (var2_2 == 13) break block178;
                                                                if (var2_2 == 31) break block179;
                                                                if (var2_2 == 38) break block180;
                                                                if (var2_2 == 42) break block181;
                                                                if (var2_2 == 48) break block182;
                                                                if (var2_2 == 16) break block183;
                                                                if (var2_2 == 17) break block184;
                                                                switch (var2_2) {
                                                                    default: {
                                                                        block51 : switch (var2_2) {
                                                                            default: {
                                                                                switch (var2_2) {
                                                                                    case 26: {
                                                                                        if ((-268435457L & var9_9) == 0L) ** GOTO lbl-1000
                                                                                    }
                                                                                    case 25: {
                                                                                        this.f(115, 117);
                                                                                        break block51;
                                                                                    }
                                                                                    case 24: 
                                                                                }
                                                                                if (this.f == '\\') {
                                                                                    var2_2 = this.i;
                                                                                    this.i = var2_2 + 1;
                                                                                    var13_11[var2_2] = 25;
                                                                                    break;
                                                                                }
                                                                                ** GOTO lbl-1000
                                                                            }
                                                                            case 21: {
                                                                                if ((-268435457L & var9_9) == 0L) ** GOTO lbl-1000
                                                                            }
                                                                            case 20: {
                                                                                this.f(118, 120);
                                                                                break;
                                                                            }
                                                                            {
                                                                            }
                                                                            case 19: {
                                                                                if (this.f == '\\') {
                                                                                    var2_2 = this.i;
                                                                                    this.i = var2_2 + 1;
                                                                                    var13_11[var2_2] = 20;
                                                                                    break;
                                                                                }
                                                                                ** GOTO lbl-1000
                                                                            }
                                                                        }
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                    case 11: {
                                                                        if (this.f == 'v') {
                                                                            var2_2 = this.i;
                                                                            this.i = var2_2 + 1;
                                                                            var13_11[var2_2] = 12;
                                                                        }
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                    case 9: 
                                                                    case 10: {
                                                                        if ((576460745995190270L & var9_9) == 0L) ** GOTO lbl-1000
                                                                        var2_2 = var1_1;
                                                                        if (var1_1 > 76) {
                                                                            var2_2 = 76;
                                                                        }
                                                                        this.e(10);
                                                                        break;
                                                                    }
                                                                }
                                                                break block185;
                                                            }
                                                            if ((0x7E0000007EL & var9_9) == 0L) ** GOTO lbl-1000
                                                            if (var1_1 > 80) {
                                                                var1_1 = 80;
                                                            }
                                                            this.e(17);
                                                            var2_2 = var1_1;
                                                            break block185;
                                                        }
                                                        var2_2 = var1_1;
                                                        if ((0x100000001000000L & var9_9) == 0L) break block185;
                                                        this.e(17);
                                                        ** GOTO lbl-1000
                                                    }
                                                    var2_2 = var1_1;
                                                    if (var1_1 > 4) {
                                                        var2_2 = 4;
                                                    }
                                                    var1_1 = this.i;
                                                    this.i = var1_1 + 1;
                                                    var13_11[var1_1] = 48;
                                                    break block185;
                                                }
                                                var2_2 = var1_1;
                                                if ((0x2000000020L & var9_9) == 0L) break block185;
                                                var2_2 = 94;
                                                var3_5 = 95;
lbl549:
                                                // 3 sources

                                                while (true) {
                                                    this.c(var2_2, var3_5);
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                            }
                                            var2_2 = var1_1;
                                            if ((0x2000000020L & var9_9) == 0L) break block185;
                                            var2_2 = 69;
                                            var3_5 = 70;
                                            ** GOTO lbl549
                                        }
                                        var2_2 = var1_1;
                                        if ((0x2000000020L & var9_9) != 0L) {
                                            var2_2 = 128;
                                            var3_5 = 129;
                                            ** continue;
                                        }
                                        break block185;
                                    }
                                    var2_2 = var1_1;
                                    if (this.f != 'u') break block185;
                                    var2_2 = this.i;
                                    this.i = var2_2 + 1;
                                    var13_11[var2_2] = 14;
                                    ** GOTO lbl-1000
                                }
                                this.c(121, 123);
                                ** GOTO lbl-1000
                            }
                            if ((576460745995190270L & var9_9) == 0L) lbl-1000:
                            // 13 sources

                            {
                                var2_2 = var1_1;
                            } else {
                                var2_2 = var1_1;
                                if (var1_1 > 61) {
                                    var2_2 = 61;
                                }
                                this.e(1);
                            }
                            break block185;
                        }
                        var3_5 = var1_1;
                        if ((576460745995190270L & var9_9) != 0L) {
                            var3_5 = var1_1;
                            if (var1_1 > 61) {
                                var3_5 = 61;
                            }
                            this.e(1);
                        }
                        if ((var1_1 = (int)this.f) == 117) {
                            var13_11 = this.e;
                            var1_1 = this.i;
                            this.i = var1_1 + 1;
                            var13_11[var1_1] = 14;
                            var2_2 = var3_5;
                        } else {
                            var2_2 = var3_5;
                            if (var1_1 == 118) {
                                var13_11 = this.e;
                                var1_1 = this.i;
                                this.i = var1_1 + 1;
                                var13_11[var1_1] = 12;
                                var2_2 = var3_5;
                            }
                        }
                    }
                    var3_5 = var6_6;
                    var1_1 = var2_2;
                } while (var6_6 != var4_4);
                ** GOTO lbl650
            }
            var7_7 = var3_5 >> 8;
            var8_8 = var3_5 >> 14;
            var9_9 = 1L << (var7_7 & 63);
            var6_6 = (var3_5 & 255) >> 6;
            var11_10 = 1L << (var3_5 & 63);
            while (true) {
                block186: {
                    if ((var2_2 = (var13_11 = this.e)[var3_5 = var2_2 - 1]) != 5) {
                        if (var2_2 != 48) {
                            if (var2_2 != 20 && var2_2 != 21) {
                                if (var2_2 != 25 && var2_2 != 26) {
                                    while (true) {
                                        var2_2 = var1_1;
                                        break;
                                    }
                                } else {
                                    var2_2 = var1_1;
                                    if (e.c.d(var7_7, var8_8, var6_6, var9_9, var11_10)) {
                                        this.f(115, 117);
                                        var2_2 = var1_1;
                                    }
                                }
                            } else {
                                var2_2 = var1_1;
                                if (e.c.d(var7_7, var8_8, var6_6, var9_9, var11_10)) {
                                    this.f(118, 120);
                                    var2_2 = var1_1;
                                }
                            }
                        } else {
                            if (!e.c.d(var7_7, var8_8, var6_6, var9_9, var11_10)) ** continue;
                            var2_2 = var1_1;
                            if (var1_1 > 4) {
                                var2_2 = 4;
                            }
                            var13_11 = this.e;
                            var1_1 = this.i;
                            this.i = var1_1 + 1;
                            var13_11[var1_1] = 48;
                        }
                        while (true) {
                            var1_1 = var2_2;
                            break;
                        }
                    } else {
                        var2_2 = var1_1;
                        if (!e.c.d(var7_7, var8_8, var6_6, var9_9, var11_10)) ** continue;
                        this.c(121, 123);
                    }
                    if (var3_5 != var4_4) break block186;
                    var2_2 = var1_1;
lbl650:
                    // 3 sources

                    var1_1 = var2_2;
                    if (var2_2 != 0x7FFFFFFF) {
                        this.l = var2_2;
                        this.k = var5_3;
                        var1_1 = 0x7FFFFFFF;
                    }
                    ++var5_3;
                    var2_2 = this.i;
                    this.i = var4_4;
                    if (var2_2 == (var4_4 = 52 - var4_4)) {
                        return var5_3;
                    }
                    try {
                        this.f = this.c.k();
                        continue block62;
                    }
                    catch (IOException var13_12) {
                        return var5_3;
                    }
                }
                var2_2 = var3_5;
            }
            break;
        }
    }

    private int i0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.C0(4, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'A') {
                if (c4 != 'E') {
                    if (c4 != 'L') {
                        if (c4 != 'a') {
                            if (c4 != 'e') {
                                if (c4 != 'i') {
                                    if (c4 != 'o') {
                                        if (c4 != 'r') {
                                            if (c4 != 'O') {
                                                if (c4 != 'P') {
                                                    if (c4 != 'T') {
                                                        if (c4 == 'U') {
                                                            return this.m0(l4, 5120L, l6, 0L);
                                                        }
                                                    } else {
                                                        if ((0x100000000L & l4) != 0L) {
                                                            return this.y0(6, 32, 1);
                                                        }
                                                        if ((0x10000000000L & l4) != 0L) {
                                                            return this.y0(6, 40, 1);
                                                        }
                                                    }
                                                } else {
                                                    if ((0x1000000000L & l4) != 0L) {
                                                        return this.y0(6, 36, 1);
                                                    }
                                                    if ((0x2000000000L & l4) != 0L) {
                                                        return this.y0(6, 37, 1);
                                                    }
                                                    if ((0x40000000000000L & l4) != 0L) {
                                                        return this.y0(6, 54, 1);
                                                    }
                                                }
                                                return this.C0(5, l4, l6);
                                            }
                                            return this.m0(l4, 0x8000000080L, l6, 0L);
                                        }
                                        return this.m0(l4, 0L, l6, 6L);
                                    }
                                    return this.m0(l4, 0L, l6, 128L);
                                }
                                return this.m0(l4, 0L, l6, 1L);
                            }
                            if ((0x4000000000000000L & l4) != 0L) {
                                return this.G0(6, 62);
                            }
                            return this.m0(l4, Long.MIN_VALUE, l6, 0L);
                        }
                        return this.m0(l4, 0L, l6, 8L);
                    }
                    if ((0x100L & l4) != 0L) {
                        return this.y0(6, 8, 1);
                    }
                    return this.m0(l4, 292057827328L, l6, 0L);
                }
                if ((0x20000000000L & l4) != 0L) {
                    return this.y0(6, 41, 1);
                }
                return this.m0(l4, 0x80000000000000L, l6, 0L);
            }
            return this.m0(l4, 8704L, l6, 0L);
        }
        catch (IOException iOException) {
            this.H0(5, l4, l6);
            return 6;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int j(int var1_1, int var2_2) {
        this.i = 51;
        this.e[0] = var1_1;
        var6_3 = var2_2;
        var1_1 = 0x7FFFFFFF;
        var2_2 = 1;
        var5_4 = 0;
        block62: while (true) {
            block190: {
                block188: {
                    this.j = var3_5 = this.j + 1;
                    if (var3_5 == 0x7FFFFFFF) {
                        this.a();
                    }
                    if ((var3_5 = (int)this.f) >= 64) break block188;
                    var10_10 = 1L << var3_5;
                    var3_5 = var2_2;
                    do {
                        block186: {
                            block189: {
                                var14_12 = this.e;
                                var7_7 = var3_5 - 1;
                                switch (var14_12[var7_7]) {
                                    default: {
                                        var2_2 = var1_1;
                                        break block186;
                                    }
                                    case 51: {
                                        cfr_temp_0 = (var10_10 & 0x100001200L) - 0L;
                                        var2_2 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                        if (var2_2 != 0) {
                                            this.g(1, 2);
                                        } else if (this.f == ';') {
                                            this.f(0, 2);
                                        }
                                        if (var2_2 == 0) ** GOTO lbl34
lbl30:
                                        // 2 sources

                                        while (true) {
                                            var2_2 = 32;
                                            var3_5 = 33;
                                            ** GOTO lbl89
                                            break;
                                        }
lbl34:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (this.f != ';') break block186;
                                        var2_2 = var1_1;
                                        if (var1_1 <= 4) ** GOTO lbl40
lbl38:
                                        // 3 sources

                                        while (true) {
                                            var2_2 = 4;
lbl40:
                                            // 4 sources

                                            while (true) {
                                                this.e(34);
                                                break block186;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    case 50: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl47
                                        var2_2 = var1_1;
                                        break block186;
lbl47:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 79) {
                                            var2_2 = 79;
                                        }
                                        var1_1 = 50;
lbl51:
                                        // 5 sources

                                        while (true) {
                                            this.e(var1_1);
                                            break block186;
                                            break;
                                        }
                                    }
                                    case 49: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 60) {
                                                var2_2 = 60;
                                            }
                                            this.f(71, 76);
                                        }
                                        break block186;
                                    }
                                    case 48: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl67
                                        var2_2 = var1_1;
                                        break block186;
lbl67:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 84) {
                                            var2_2 = 84;
                                        }
lbl70:
                                        // 4 sources

                                        while (true) {
                                            var1_1 = 48;
                                            ** GOTO lbl51
                                            break;
                                        }
                                    }
                                    case 47: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x280000000000L) != 0L) {
                                            var2_2 = var1_1;
                                            ** continue;
                                        }
                                        break block186;
                                    }
                                    case 45: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl83
                                        var2_2 = var1_1;
                                        break block186;
lbl83:
                                        // 1 sources

                                        var4_6 = var1_1;
                                        if (var1_1 > 84) {
                                            var4_6 = 84;
                                        }
                                        var2_2 = 45;
                                        var3_5 = 46;
                                        var1_1 = var4_6;
lbl89:
                                        // 4 sources

                                        while (true) {
                                            this.g(var2_2, var3_5);
                                            var2_2 = var1_1;
                                            break block186;
                                            break;
                                        }
                                    }
                                    case 44: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl97
                                        var2_2 = var1_1;
                                        break block186;
lbl97:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 84) {
                                            var2_2 = 84;
                                        }
lbl100:
                                        // 4 sources

                                        while (true) {
                                            var1_1 = 44;
                                            ** GOTO lbl51
                                            break;
                                        }
                                    }
                                    case 43: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x280000000000L) != 0L) {
                                            var2_2 = var1_1;
                                            ** continue;
                                        }
                                        break block186;
                                    }
                                    case 41: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl113
                                        var2_2 = var1_1;
                                        break block186;
lbl113:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 <= 84) ** GOTO lbl117
lbl115:
                                        // 2 sources

                                        while (true) {
                                            var2_2 = 84;
lbl117:
                                            // 3 sources

                                            while (true) {
                                                var4_6 = 41;
                                                var3_5 = 42;
                                                var1_1 = var2_2;
                                                var2_2 = var4_6;
                                                ** GOTO lbl89
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    case 40: {
                                        if (this.f == '.') ** GOTO lbl127
                                        var2_2 = var1_1;
                                        break block186;
lbl127:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 <= 84) ** continue;
                                        ** continue;
                                    }
                                    case 39: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) {
                                            var2_2 = 39;
                                            var3_5 = 40;
                                            ** continue;
                                        }
                                        break block186;
                                    }
                                    case 38: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl141
                                        var2_2 = var1_1;
                                        break block186;
lbl141:
                                        // 1 sources

                                        var3_5 = var1_1;
                                        if (var1_1 > 84) {
                                            var3_5 = 84;
                                        }
                                        var1_1 = 88;
                                        var2_2 = 91;
lbl146:
                                        // 7 sources

                                        while (true) {
                                            this.f(var1_1, var2_2);
                                            var2_2 = var3_5;
                                            break block186;
                                            break;
                                        }
                                    }
                                    case 37: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl154
                                        var2_2 = var1_1;
                                        break block186;
lbl154:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 60) {
                                            var2_2 = 60;
                                        }
                                        var1_1 = 37;
                                        ** GOTO lbl51
                                    }
                                    case 36: {
                                        var2_2 = var1_1;
                                        if (this.f == '-') {
                                            this.f(81, 83);
                                            var2_2 = var1_1;
                                        }
                                        break block186;
                                    }
                                    case 35: {
                                        if (this.f != ';') {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 4) {
                                                var2_2 = 4;
                                            }
                                            this.f(84, 87);
                                        }
                                        break block186;
                                    }
                                    case 34: {
                                        if ((var10_10 & -9217L) != 0L) ** GOTO lbl178
                                        var2_2 = var1_1;
                                        break block186;
lbl178:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 <= 4) ** GOTO lbl40
                                        ** GOTO lbl38
                                    }
                                    case 33: {
                                        if (this.f == ';') ** GOTO lbl185
                                        var2_2 = var1_1;
                                        break block186;
lbl185:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 <= 4) ** continue;
                                        ** continue;
                                    }
                                    case 32: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x100001200L) != 0L) {
                                            ** continue;
                                        }
                                        break block186;
                                    }
                                    case 31: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x100001200L) == 0L) break block186;
                                        var4_6 = 77;
                                        var2_2 = 80;
                                        var3_5 = var1_1;
                                        var1_1 = var4_6;
                                        ** GOTO lbl146
                                    }
                                    case 30: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl205
                                        var2_2 = var1_1;
                                        break block186;
lbl205:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 84) {
                                            var2_2 = 84;
                                        }
lbl208:
                                        // 4 sources

                                        while (true) {
                                            var1_1 = 30;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    case 29: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x280000000000L) != 0L) {
                                            var2_2 = var1_1;
                                            ** continue;
                                        }
                                        break block186;
                                    }
                                    case 27: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 84) {
                                                var2_2 = 84;
                                            }
                                            this.g(27, 28);
                                        }
                                        break block186;
                                    }
                                    case 26: {
                                        var2_2 = var1_1;
                                        if (this.f == '.') {
                                            this.e(27);
                                            var2_2 = var1_1;
                                        }
                                        break block186;
                                    }
                                    case 25: {
                                        var2_2 = var1_1;
                                        if (this.f == '\'') {
                                            var2_2 = var1_1;
                                            if (var1_1 > 81) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    var2_2 = 81;
                                                    ** GOTO lbl449
                                                    break;
                                                }
                                            }
                                        }
                                        break block186;
                                    }
                                    case 24: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & -549755813889L) == 0L) break block186;
                                    }
                                    case 23: {
                                        var4_6 = 22;
                                        var2_2 = 24;
                                        var3_5 = var1_1;
                                        var1_1 = var4_6;
                                        ** GOTO lbl146
                                    }
                                    case 21: {
                                        var8_8 = 22;
                                        var4_6 = 24;
                                        var2_2 = var1_1;
                                        if (this.f != '\'') break block186;
                                        var3_5 = var1_1;
                                        var1_1 = var8_8;
                                        var2_2 = var4_6;
                                        ** GOTO lbl146
                                    }
                                    case 20: {
                                        var2_2 = var1_1;
                                        if (this.f == '\"') {
                                            var2_2 = var1_1;
                                            if (var1_1 > 81) {
                                                ** continue;
                                            }
                                        }
                                        break block186;
                                    }
                                    case 19: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & -17179869185L) == 0L) break block186;
                                    }
                                    case 18: {
                                        var4_6 = 25;
                                        var2_2 = 27;
                                        var3_5 = var1_1;
                                        var1_1 = var4_6;
                                        ** GOTO lbl146
                                    }
                                    case 16: {
                                        var8_8 = 25;
                                        var4_6 = 27;
                                        var2_2 = var1_1;
                                        if (this.f != '\"') break block186;
                                        var3_5 = var1_1;
                                        var1_1 = var8_8;
                                        var2_2 = var4_6;
                                        ** GOTO lbl146
                                    }
                                    case 15: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 80) {
                                                var2_2 = 80;
                                            }
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 15;
                                        }
                                        break block186;
                                    }
                                    case 13: {
                                        var2_2 = var1_1;
                                        if (this.f == '0') {
                                            var2_2 = this.i;
                                            this.i = var2_2 + 1;
                                            var14_12[var2_2] = 14;
                                            var2_2 = var1_1;
                                        }
                                        break block186;
                                    }
                                    case 12: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 78) {
                                                var2_2 = 78;
                                            }
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 12;
                                        }
                                        break block186;
                                    }
                                    case 10: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 77) {
                                                var2_2 = 77;
                                            }
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 10;
                                        }
                                        break block186;
                                    }
                                    case 8: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 76) {
                                                var2_2 = 76;
                                            }
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 8;
                                        }
                                        break block186;
                                    }
                                    case 6: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) ** GOTO lbl343
                                        var3_5 = var1_1;
                                        if (var1_1 > 60) {
                                            var3_5 = 60;
                                        }
                                        this.f(71, 76);
                                        ** GOTO lbl386
lbl343:
                                        // 1 sources

                                        if ((var10_10 & 0x100001200L) == 0L) ** GOTO lbl347
                                        var4_6 = 77;
                                        var3_5 = 80;
                                        ** GOTO lbl354
lbl347:
                                        // 1 sources

                                        if ((var10_10 & 9216L) != 0L) {
                                            var2_2 = var1_1;
                                            if (var1_1 > 74) {
                                                var2_2 = 74;
                                            }
                                            var4_6 = 12;
                                            var3_5 = 15;
                                            var1_1 = var2_2;
lbl354:
                                            // 2 sources

                                            this.f(var4_6, var3_5);
                                            var3_5 = var1_1;
                                        } else {
                                            var2_2 = this.f;
                                            if (var2_2 == 45) {
                                                this.f(81, 83);
                                                var3_5 = var1_1;
                                            } else if (var2_2 == 59) {
                                                var3_5 = var1_1;
                                                if (var1_1 > 4) {
                                                    var3_5 = 4;
                                                }
                                                this.f(84, 87);
                                            } else if (var2_2 == 46) {
                                                this.e(27);
                                                var3_5 = var1_1;
                                            } else if (var2_2 == 39) {
                                                this.f(22, 24);
                                                var3_5 = var1_1;
                                            } else if (var2_2 == 34) {
                                                this.f(25, 27);
                                                var3_5 = var1_1;
                                            } else {
                                                var3_5 = var1_1;
                                                if (var2_2 == 58) {
                                                    var2_2 = this.i;
                                                    this.i = var2_2 + 1;
                                                    var14_12[var2_2] = 7;
                                                    var3_5 = var1_1;
                                                }
                                            }
                                        }
lbl386:
                                        // 10 sources

                                        var1_1 = this.f;
                                        if (var1_1 == 48) {
                                            var14_12 = this.e;
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 14;
                                            var2_2 = var3_5;
                                        } else {
                                            var2_2 = var3_5;
                                            if (var1_1 == 13) {
                                                var14_12 = this.e;
                                                var1_1 = this.i;
                                                this.i = var1_1 + 1;
                                                var14_12[var1_1] = 4;
                                                var2_2 = var3_5;
                                            }
                                        }
                                        break block186;
                                    }
                                    case 5: {
                                        var2_2 = var1_1;
                                        if (this.f == '\r') {
                                            var2_2 = this.i;
                                            this.i = var2_2 + 1;
                                            var14_12[var2_2] = 4;
                                            var2_2 = var1_1;
                                        }
                                        break block186;
                                    }
                                    case 4: {
                                        if (this.f == '\n') ** GOTO lbl414
                                        var2_2 = var1_1;
                                        break block186;
lbl414:
                                        // 1 sources

                                        var3_5 = var1_1;
                                        if (var1_1 > 74) {
                                            var3_5 = 74;
                                        }
lbl417:
                                        // 5 sources

                                        while (true) {
                                            var1_1 = 12;
                                            var2_2 = 15;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    case 3: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & -9217L) != 0L) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                this.f(0, 2);
                                                var2_2 = var1_1;
                                                ** GOTO lbl449
                                                break;
                                            }
                                        }
                                        break block186;
                                    }
                                    case 2: {
                                        var2_2 = var1_1;
                                        if (this.f == ';') {
                                            ** continue;
                                        }
                                        break block186;
                                    }
                                    case 1: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x100001200L) != 0L) {
                                            this.g(1, 2);
                                            var2_2 = var1_1;
                                        }
                                        break block186;
                                    }
                                    case 0: 
                                }
                                if ((var10_10 & 9216L) != 0L) break block189;
                                var2_2 = var1_1;
                                break block186;
                            }
                            var3_5 = var1_1;
                            if (var1_1 <= 74) ** GOTO lbl417
                            var3_5 = 74;
                            ** continue;
                        }
                        var1_1 = var2_2;
                        var3_5 = var7_7;
                    } while (var7_7 != var5_4);
                    ** GOTO lbl650
                }
                if (var3_5 >= 128) break block190;
                var10_10 = 1L << (var3_5 & 63);
                while (true) {
                    block200: {
                        block187: {
                            block191: {
                                block192: {
                                    block193: {
                                        block194: {
                                            block195: {
                                                block196: {
                                                    block197: {
                                                        block198: {
                                                            block199: {
                                                                if ((var2_2 = (var14_12 = this.e)[var4_6 = var2_2 - 1]) == 3) break block191;
                                                                if (var2_2 == 11) break block192;
                                                                if (var2_2 == 28) break block193;
                                                                if (var2_2 == 34) break block194;
                                                                if (var2_2 == 42) break block195;
                                                                if (var2_2 == 46) break block196;
                                                                if (var2_2 == 14) break block197;
                                                                if (var2_2 == 15) break block198;
                                                                switch (var2_2) {
                                                                    default: {
                                                                        switch (var2_2) {
                                                                            default: {
                                                                                block56 : switch (var2_2) {
                                                                                    default: lbl-1000:
                                                                                    // 3 sources

                                                                                    {
                                                                                        while (true) {
                                                                                            var2_2 = var1_1;
                                                                                            break block56;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    case 24: {
                                                                                        var2_2 = var1_1;
                                                                                        if ((var10_10 & -268435457L) == 0L) ** GOTO lbl527
                                                                                    }
                                                                                    case 23: {
                                                                                        var2_2 = 22;
                                                                                        var3_5 = 24;
lbl481:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            this.f(var2_2, var3_5);
                                                                                            var2_2 = var1_1;
                                                                                            break block56;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                    }
                                                                                    case 22: {
                                                                                        var2_2 = var1_1;
                                                                                        if (this.f == '\\') {
                                                                                            var2_2 = this.i;
                                                                                            this.i = var2_2 + 1;
                                                                                            var14_12[var2_2] = 23;
                                                                                            var2_2 = var1_1;
                                                                                            break;
                                                                                        }
                                                                                        ** GOTO lbl527
                                                                                    }
                                                                                }
                                                                                ** GOTO lbl527
                                                                            }
                                                                            case 19: {
                                                                                var2_2 = var1_1;
                                                                                if ((var10_10 & -268435457L) == 0L) ** GOTO lbl527
                                                                            }
                                                                            case 18: {
                                                                                var2_2 = 25;
                                                                                var3_5 = 27;
                                                                                ** continue;
                                                                            }
                                                                            {
                                                                            }
                                                                            case 17: {
                                                                                var2_2 = var1_1;
                                                                                if (this.f == '\\') {
                                                                                    var2_2 = this.i;
                                                                                    this.i = var2_2 + 1;
                                                                                    var14_12[var2_2] = 18;
                                                                                    var2_2 = var1_1;
                                                                                    ** break;
                                                                                }
lbl512:
                                                                                // 3 sources

                                                                                ** GOTO lbl527
                                                                            }
                                                                        }
                                                                    }
                                                                    case 9: {
                                                                        var2_2 = var1_1;
                                                                        if (this.f == 'v') {
                                                                            var2_2 = this.i;
                                                                            this.i = var2_2 + 1;
                                                                            var14_12[var2_2] = 10;
                                                                            var2_2 = var1_1;
                                                                        }
                                                                        ** GOTO lbl527
                                                                    }
                                                                    case 7: 
                                                                    case 8: {
                                                                        if ((var10_10 & 576460745995190270L) == 0L) ** GOTO lbl-1000
                                                                        var2_2 = var1_1;
                                                                        if (var1_1 > 76) {
                                                                            var2_2 = 76;
                                                                        }
                                                                        this.e(8);
lbl527:
                                                                        // 18 sources

                                                                        while (true) {
                                                                            var1_1 = var2_2;
                                                                            break block187;
                                                                            break;
                                                                        }
                                                                    }
                                                                    case 6: 
                                                                }
                                                                var3_5 = this.f;
                                                                if (var3_5 != 117) break block199;
                                                                var2_2 = this.i;
                                                                this.i = var2_2 + 1;
                                                                var14_12[var2_2] = 12;
                                                                break block187;
                                                            }
                                                            var2_2 = var1_1;
                                                            if (var3_5 != 118) ** GOTO lbl527
                                                            var2_2 = this.i;
                                                            this.i = var2_2 + 1;
                                                            var14_12[var2_2] = 10;
                                                            var2_2 = var1_1;
                                                            ** GOTO lbl527
                                                        }
                                                        if ((var10_10 & 0x7E0000007EL) != 0L) ** break;
                                                        ** continue;
                                                        var2_2 = var1_1;
                                                        if (var1_1 > 80) {
                                                            var2_2 = 80;
                                                        }
                                                        var1_1 = var2_2;
lbl552:
                                                        // 2 sources

                                                        while (true) {
                                                            this.e(15);
                                                            var2_2 = var1_1;
                                                            ** GOTO lbl527
                                                            break;
                                                        }
                                                    }
                                                    var2_2 = var1_1;
                                                    if ((var10_10 & 0x100000001000000L) == 0L) ** GOTO lbl527
                                                    ** continue;
                                                }
                                                var2_2 = var1_1;
                                                if ((var10_10 & 0x2000000020L) == 0L) ** GOTO lbl527
                                                this.c(63, 64);
                                                var2_2 = var1_1;
                                                ** GOTO lbl527
                                            }
                                            var2_2 = var1_1;
                                            if ((var10_10 & 0x2000000020L) == 0L) ** GOTO lbl527
                                            var2_2 = 94;
                                            var3_5 = 95;
lbl571:
                                            // 2 sources

                                            while (true) {
                                                this.c(var2_2, var3_5);
                                                var2_2 = var1_1;
                                                ** GOTO lbl527
                                                break;
                                            }
                                        }
                                        var2_2 = var1_1;
                                        if (var1_1 > 4) {
                                            var2_2 = 4;
                                        }
                                        var1_1 = this.i;
                                        this.i = var1_1 + 1;
                                        var14_12[var1_1] = 34;
                                        ** GOTO lbl527
                                    }
                                    var2_2 = var1_1;
                                    if ((var10_10 & 0x2000000020L) == 0L) ** GOTO lbl527
                                    var2_2 = 92;
                                    var3_5 = 93;
                                    ** continue;
                                }
                                var2_2 = var1_1;
                                if (this.f == 'u') ** break;
                                ** continue;
                                var2_2 = this.i;
                                this.i = var2_2 + 1;
                                var14_12[var2_2] = 12;
                                break block187;
                            }
                            this.c(0, 2);
                        }
                        if (var4_6 != var5_4) break block200;
                        var2_2 = var1_1;
                        ** GOTO lbl650
                    }
                    var2_2 = var4_6;
                }
            }
            var8_8 = var3_5 >> 8;
            var9_9 = var3_5 >> 14;
            var12_11 = 1L << (var8_8 & 63);
            var7_7 = (var3_5 & 255) >> 6;
            var10_10 = 1L << (var3_5 & 63);
            while (true) {
                block201: {
                    if ((var2_2 = (var14_12 = this.e)[var4_6 = var2_2 - 1]) != 3) {
                        if (var2_2 != 34) {
                            if (var2_2 != 18 && var2_2 != 19) {
                                if (var2_2 != 23 && var2_2 != 24) {
                                    var2_2 = var1_1;
                                } else {
                                    var3_5 = 24;
                                    var2_2 = var1_1;
                                    if (e.c.d(var8_8, var9_9, var7_7, var12_11, var10_10)) {
                                        var2_2 = 22;
lbl623:
                                        // 2 sources

                                        while (true) {
                                            this.f(var2_2, var3_5);
                                            var2_2 = var1_1;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                var2_2 = var1_1;
                                if (e.c.d(var8_8, var9_9, var7_7, var12_11, var10_10)) {
                                    var2_2 = 25;
                                    var3_5 = 27;
                                    ** continue;
                                }
                            }
                        } else if (!e.c.d(var8_8, var9_9, var7_7, var12_11, var10_10)) {
                            var2_2 = var1_1;
                        } else {
                            var2_2 = var1_1;
                            if (var1_1 > 4) {
                                var2_2 = 4;
                            }
                            var14_12 = this.e;
                            var1_1 = this.i;
                            this.i = var1_1 + 1;
                            var14_12[var1_1] = 34;
                        }
                    } else {
                        var2_2 = var1_1;
                        if (e.c.d(var8_8, var9_9, var7_7, var12_11, var10_10)) {
                            this.c(0, 2);
                            var2_2 = var1_1;
                        }
                    }
                    if (var4_6 != var5_4) break block201;
lbl650:
                    // 3 sources

                    var1_1 = var2_2;
                    if (var2_2 != 0x7FFFFFFF) {
                        this.l = var2_2;
                        this.k = var6_3;
                        var1_1 = 0x7FFFFFFF;
                    }
                    ++var6_3;
                    var2_2 = this.i;
                    this.i = var5_4;
                    if (var2_2 == (var5_4 = 51 - var5_4)) {
                        return var6_3;
                    }
                    try {
                        this.f = this.c.k();
                        continue block62;
                    }
                    catch (IOException var14_13) {
                        return var6_3;
                    }
                }
                var1_1 = var2_2;
                var2_2 = var4_6;
            }
            break;
        }
    }

    private int j0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.D0(4, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'A') {
                if (c4 != 'E') {
                    if (c4 != 'L') {
                        if (c4 != 'a') {
                            if (c4 != 'e') {
                                if (c4 != 'i') {
                                    if (c4 != 'o') {
                                        if (c4 != 'r') {
                                            if (c4 != 'O') {
                                                if (c4 != 'P') {
                                                    if (c4 != 'T') {
                                                        if (c4 == 'U') {
                                                            return this.n0(l4, 5120L, l6, 0L);
                                                        }
                                                    } else {
                                                        if ((0x100000000L & l4) != 0L) {
                                                            return this.G0(6, 32);
                                                        }
                                                        if ((0x10000000000L & l4) != 0L) {
                                                            return this.G0(6, 40);
                                                        }
                                                    }
                                                } else {
                                                    if ((0x1000000000L & l4) != 0L) {
                                                        return this.G0(6, 36);
                                                    }
                                                    if ((0x2000000000L & l4) != 0L) {
                                                        return this.G0(6, 37);
                                                    }
                                                    if ((0x40000000000000L & l4) != 0L) {
                                                        return this.G0(6, 54);
                                                    }
                                                }
                                                return this.D0(5, l4, l6);
                                            }
                                            return this.n0(l4, 0x8000000080L, l6, 0L);
                                        }
                                        return this.n0(l4, 0L, l6, 6L);
                                    }
                                    return this.n0(l4, 0L, l6, 128L);
                                }
                                return this.n0(l4, 0L, l6, 1L);
                            }
                            if ((0x4000000000000000L & l4) != 0L) {
                                return this.G0(6, 62);
                            }
                            return this.n0(l4, Long.MIN_VALUE, l6, 0L);
                        }
                        return this.n0(l4, 0L, l6, 8L);
                    }
                    if ((0x100L & l4) != 0L) {
                        return this.G0(6, 8);
                    }
                    return this.n0(l4, 292057827328L, l6, 0L);
                }
                if ((0x20000000000L & l4) != 0L) {
                    return this.G0(6, 41);
                }
                return this.n0(l4, 0x80000000000000L, l6, 0L);
            }
            return this.n0(l4, 8704L, l6, 0L);
        }
        catch (IOException iOException) {
            this.I0(5, l4, l6);
            return 6;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int k(int var1_1, int var2_2) {
        this.i = 51;
        this.e[0] = var1_1;
        var5_3 = var2_2;
        var1_1 = 0x7FFFFFFF;
        var2_2 = 1;
        var4_4 = 0;
        block62: while (true) {
            block177: {
                block176: {
                    this.j = var3_5 = this.j + 1;
                    if (var3_5 == 0x7FFFFFFF) {
                        this.a();
                    }
                    if ((var3_5 = (int)this.f) >= 64) break block176;
                    var9_9 = 1L << var3_5;
                    while (true) {
                        block173: {
                            var13_11 = this.e;
                            var7_7 = var2_2 - 1;
                            var3_5 = var13_11[var7_7];
                            var2_2 = 59;
                            switch (var3_5) lbl-1000:
                            // 19 sources

                            {
                                default: {
                                    var2_2 = var1_1;
                                    break block173;
                                }
                                case 51: {
                                    cfr_temp_0 = (var9_9 & 0x100001200L) - 0L;
                                    var2_2 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                    if (var2_2 != 0) {
                                        this.g(1, 2);
                                    } else if (this.f == ';') {
                                        this.f(0, 2);
                                    }
                                    if (var2_2 == 0) ** GOTO lbl35
lbl31:
                                    // 2 sources

                                    while (true) {
                                        var2_2 = 42;
                                        var3_5 = 43;
                                        ** GOTO lbl142
                                        break;
                                    }
lbl35:
                                    // 1 sources

                                    var2_2 = var1_1;
                                    if (this.f != ';') break block173;
                                    var2_2 = var1_1;
                                    if (var1_1 <= 4) ** GOTO lbl41
lbl39:
                                    // 3 sources

                                    while (true) {
                                        var2_2 = 4;
lbl41:
                                        // 4 sources

                                        while (true) {
                                            this.e(44);
                                            break block173;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                case 50: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var2_2 = var1_1;
                                    if (var1_1 > 79) {
                                        var2_2 = 79;
                                    }
                                    var3_5 = 50;
                                    var1_1 = var2_2;
                                    var2_2 = var3_5;
lbl52:
                                    // 5 sources

                                    while (true) {
                                        this.e(var2_2);
                                        var2_2 = var1_1;
                                        break block173;
                                        break;
                                    }
                                }
                                case 49: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var2_2 = var1_1;
                                    if (var1_1 > 79) {
                                        var2_2 = 79;
                                    }
                                    var6_6 = 38;
                                    var3_5 = 42;
                                    var1_1 = var2_2;
                                    var2_2 = var6_6;
lbl65:
                                    // 5 sources

                                    while (true) {
                                        this.f(var2_2, var3_5);
                                        var2_2 = var1_1;
                                        break block173;
                                        break;
                                    }
                                }
                                case 48: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var2_2 = var1_1;
                                    if (var1_1 > 77) {
                                        var2_2 = 77;
                                    }
                                    var1_1 = this.i;
                                    this.i = var1_1 + 1;
                                    var13_11[var1_1] = 48;
                                    break block173;
                                }
                                case 47: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var2_2 = var1_1;
                                    if (var1_1 > 59) {
                                        var2_2 = 59;
                                    }
                                    var1_1 = this.i;
                                    this.i = var1_1 + 1;
                                    var13_11[var1_1] = 47;
                                    break block173;
                                }
                                case 45: {
                                    if (this.f != ';') ** GOTO lbl-1000
                                    var3_5 = var1_1;
                                    if (var1_1 > 4) {
                                        var3_5 = 4;
                                    }
                                    var2_2 = 47;
                                    var6_6 = 50;
                                    var1_1 = var3_5;
                                    var3_5 = var6_6;
                                    ** GOTO lbl65
                                }
                                case 44: {
                                    if ((var9_9 & -9217L) == 0L) ** GOTO lbl-1000
                                    var2_2 = var1_1;
                                    if (var1_1 <= 4) ** GOTO lbl41
                                    ** GOTO lbl39
                                }
                                case 43: {
                                    if (this.f != ';') ** GOTO lbl-1000
                                    var2_2 = var1_1;
                                    if (var1_1 <= 4) ** continue;
                                    ** continue;
                                }
                                case 42: {
                                    var2_2 = var1_1;
                                    if ((var9_9 & 0x100001200L) != 0L) {
                                        ** continue;
                                    }
                                    break block173;
                                }
                                case 41: {
                                    var2_2 = var1_1;
                                    if ((var9_9 & 0x100001200L) != 0L) {
                                        this.f(43, 46);
                                        var2_2 = var1_1;
                                    }
                                    break block173;
                                }
                                case 40: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var3_5 = var1_1;
                                    if (var1_1 > 84) {
                                        var3_5 = 84;
                                    }
lbl123:
                                    // 4 sources

                                    while (true) {
                                        var2_2 = 40;
                                        var1_1 = var3_5;
                                        ** GOTO lbl52
                                        break;
                                    }
                                }
                                case 39: {
                                    var2_2 = var1_1;
                                    if ((var9_9 & 0x280000000000L) != 0L) {
                                        var3_5 = var1_1;
                                        ** continue;
                                    }
                                    break block173;
                                }
                                case 37: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var2_2 = var1_1;
                                    if (var1_1 > 84) {
                                        var2_2 = 84;
                                    }
                                    var6_6 = 37;
                                    var3_5 = 38;
                                    var1_1 = var2_2;
                                    var2_2 = var6_6;
lbl142:
                                    // 6 sources

                                    while (true) {
                                        this.g(var2_2, var3_5);
                                        var2_2 = var1_1;
                                        break block173;
                                        break;
                                    }
                                }
                                case 36: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var3_5 = var1_1;
                                    if (var1_1 > 84) {
                                        var3_5 = 84;
                                    }
lbl151:
                                    // 4 sources

                                    while (true) {
                                        var2_2 = 36;
                                        var1_1 = var3_5;
                                        ** GOTO lbl52
                                        break;
                                    }
                                }
                                case 35: {
                                    var2_2 = var1_1;
                                    if ((var9_9 & 0x280000000000L) != 0L) {
                                        var3_5 = var1_1;
                                        ** continue;
                                    }
                                    break block173;
                                }
                                case 33: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var3_5 = var1_1;
                                    if (var1_1 > 84) {
                                        var3_5 = 84;
                                    }
                                    var2_2 = 33;
                                    var6_6 = 34;
                                    var1_1 = var3_5;
                                    var3_5 = var6_6;
                                    ** GOTO lbl142
                                }
                                case 32: {
                                    var6_6 = 34;
                                    if (this.f != '.') ** GOTO lbl-1000
                                    var3_5 = var1_1;
                                    if (var1_1 > 84) {
                                        var3_5 = 84;
                                    }
                                    var2_2 = 33;
                                    var1_1 = var3_5;
                                    var3_5 = var6_6;
                                    ** GOTO lbl142
                                }
                                case 31: {
                                    var2_2 = var1_1;
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) break block173;
                                    var2_2 = 31;
                                    var3_5 = 32;
                                    ** GOTO lbl142
                                }
                                case 30: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var3_5 = var1_1;
                                    if (var1_1 > 84) {
                                        var3_5 = 84;
                                    }
                                    var6_6 = 62;
                                    var1_1 = var3_5;
                                    var3_5 = var6_6;
                                    ** GOTO lbl65
                                }
                                case 29: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var3_5 = var1_1;
                                    if (var1_1 > 84) {
                                        var3_5 = 84;
                                    }
lbl201:
                                    // 4 sources

                                    while (true) {
                                        var2_2 = 29;
                                        var1_1 = var3_5;
                                        ** GOTO lbl52
                                        break;
                                    }
                                }
                                case 28: {
                                    var2_2 = var1_1;
                                    if ((var9_9 & 0x280000000000L) != 0L) {
                                        var3_5 = var1_1;
                                        ** continue;
                                    }
                                    break block173;
                                }
                                case 26: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var3_5 = var1_1;
                                    if (var1_1 > 84) {
                                        var3_5 = 84;
                                    }
                                    var2_2 = 26;
                                    var6_6 = 27;
                                    var1_1 = var3_5;
                                    var3_5 = var6_6;
                                    ** continue;
                                }
                                case 25: {
                                    var2_2 = var1_1;
                                    if (this.f == '.') {
                                        var2_2 = 26;
                                        ** continue;
                                    }
                                    break block173;
                                }
                                case 24: {
                                    var2_2 = var1_1;
                                    if (this.f == '-') {
                                        this.c(51, 52);
                                        var2_2 = var1_1;
                                    }
                                    break block173;
                                }
                                case 23: {
                                    var2_2 = var1_1;
                                    if (this.f == '\'') {
                                        var2_2 = var1_1;
                                        if (var1_1 > 81) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                var2_2 = 81;
                                                ** GOTO lbl425
                                                break;
                                            }
                                        }
                                    }
                                    break block173;
                                }
                                case 22: {
                                    var2_2 = var1_1;
                                    if ((var9_9 & -549755813889L) == 0L) break block173;
                                }
lbl245:
                                // 3 sources

                                case 21: {
                                    this.f(53, 55);
                                    var2_2 = var1_1;
                                }
                                {
                                    break block173;
                                }
                                case 19: {
                                    var2_2 = var1_1;
                                    if (this.f != '\'') break block173;
                                    ** GOTO lbl245
                                }
                                case 18: {
                                    var2_2 = var1_1;
                                    if (this.f == '\"') {
                                        var2_2 = var1_1;
                                        if (var1_1 > 81) {
                                            ** continue;
                                        }
                                    }
                                    break block173;
                                }
                                case 17: {
                                    var2_2 = var1_1;
                                    if ((var9_9 & -17179869185L) == 0L) break block173;
                                }
                                case 16: {
                                    var2_2 = 56;
                                    var3_5 = 58;
                                    ** GOTO lbl65
                                }
                                case 14: {
                                    var6_6 = 56;
                                    var3_5 = 58;
                                    var2_2 = var1_1;
                                    if (this.f == '\"') {
                                        var2_2 = var6_6;
                                        ** continue;
                                    }
                                    break block173;
                                }
                                case 13: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var2_2 = var1_1;
                                    if (var1_1 > 80) {
                                        var2_2 = 80;
                                    }
                                    var1_1 = this.i;
                                    this.i = var1_1 + 1;
                                    var13_11[var1_1] = 13;
                                    break block173;
                                }
                                case 11: {
                                    var2_2 = var1_1;
                                    if (this.f == '0') {
                                        var2_2 = this.i;
                                        this.i = var2_2 + 1;
                                        var13_11[var2_2] = 12;
                                        var2_2 = var1_1;
                                    }
                                    break block173;
                                }
                                case 10: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var2_2 = var1_1;
                                    if (var1_1 > 78) {
                                        var2_2 = 78;
                                    }
                                    var1_1 = this.i;
                                    this.i = var1_1 + 1;
                                    var13_11[var1_1] = 10;
                                    break block173;
                                }
                                case 8: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl-1000
                                    var2_2 = var1_1;
                                    if (var1_1 > 76) {
                                        var2_2 = 76;
                                    }
                                    var1_1 = this.i;
                                    this.i = var1_1 + 1;
                                    var13_11[var1_1] = 8;
                                    break block173;
                                }
                                case 6: {
                                    if ((var9_9 & 0x3FF000000000000L) == 0L) ** GOTO lbl324
                                    var2_2 = var1_1;
                                    if (var1_1 > 79) {
                                        var2_2 = 79;
                                    }
                                    var3_5 = 38;
                                    var6_6 = 42;
                                    var1_1 = var2_2;
lbl319:
                                    // 2 sources

                                    while (true) {
                                        this.f(var3_5, var6_6);
lbl321:
                                        // 4 sources

                                        while (true) {
                                            var3_5 = var1_1;
                                            ** GOTO lbl364
                                            break;
                                        }
                                        break;
                                    }
lbl324:
                                    // 1 sources

                                    if ((var9_9 & 0x100001200L) == 0L) ** GOTO lbl327
                                    this.f(43, 46);
                                    ** GOTO lbl321
lbl327:
                                    // 1 sources

                                    if ((var9_9 & 9216L) == 0L) ** GOTO lbl334
                                    var2_2 = var1_1;
                                    if (var1_1 > 74) {
                                        var2_2 = 74;
                                    }
                                    this.f(12, 15);
                                    var1_1 = var2_2;
                                    ** GOTO lbl321
lbl334:
                                    // 1 sources

                                    var2_2 = this.f;
                                    if (var2_2 == 59) {
                                        var2_2 = var1_1;
                                        if (var1_1 > 4) {
                                            var2_2 = 4;
                                        }
                                        var3_5 = 47;
                                        var6_6 = 50;
                                        var1_1 = var2_2;
                                        ** continue;
                                    }
                                    if (var2_2 == 46) {
                                        this.e(26);
                                        ** continue;
                                    }
                                    if (var2_2 == 45) {
                                        this.c(51, 52);
                                        var3_5 = var1_1;
                                    } else if (var2_2 == 39) {
                                        this.f(53, 55);
                                        var3_5 = var1_1;
                                    } else if (var2_2 == 34) {
                                        this.f(56, 58);
                                        var3_5 = var1_1;
                                    } else {
                                        var3_5 = var1_1;
                                        if (var2_2 == 58) {
                                            var2_2 = this.i;
                                            this.i = var2_2 + 1;
                                            var13_11[var2_2] = 7;
                                            var3_5 = var1_1;
                                        }
                                    }
lbl364:
                                    // 7 sources

                                    var1_1 = this.f;
                                    if (var1_1 == 48) {
                                        var13_11 = this.e;
                                        var1_1 = this.i;
                                        this.i = var1_1 + 1;
                                        var13_11[var1_1] = 12;
                                        var2_2 = var3_5;
                                    } else {
                                        var2_2 = var3_5;
                                        if (var1_1 == 13) {
                                            var13_11 = this.e;
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var13_11[var1_1] = 4;
                                            var2_2 = var3_5;
                                        }
                                    }
                                    break block173;
                                }
                                case 5: {
                                    var2_2 = var1_1;
                                    if (this.f == '\r') {
                                        var2_2 = this.i;
                                        this.i = var2_2 + 1;
                                        var13_11[var2_2] = 4;
                                        var2_2 = var1_1;
                                    }
                                    break block173;
                                }
                                case 4: {
                                    if (this.f == '\n') ** GOTO lbl392
                                    var2_2 = var1_1;
                                    break block173;
lbl392:
                                    // 1 sources

                                    var2_2 = var1_1;
                                    if (var1_1 <= 74) ** GOTO lbl396
lbl394:
                                    // 2 sources

                                    while (true) {
                                        var2_2 = 74;
lbl396:
                                        // 3 sources

                                        while (true) {
                                            this.f(12, 15);
                                            break block173;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                case 3: {
                                    var2_2 = var1_1;
                                    if ((var9_9 & -9217L) != 0L) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            this.f(0, 2);
                                            var2_2 = var1_1;
                                            ** GOTO lbl425
                                            break;
                                        }
                                    }
                                    break block173;
                                }
                                case 2: {
                                    var2_2 = var1_1;
                                    if (this.f == ';') {
                                        ** continue;
                                    }
                                    break block173;
                                }
                                case 1: {
                                    var2_2 = var1_1;
                                    if ((var9_9 & 0x100001200L) != 0L) {
                                        this.g(1, 2);
                                        var2_2 = var1_1;
                                    }
                                    break block173;
                                }
                                case 0: 
                            }
                            if ((var9_9 & 9216L) == 0L) {
                                var2_2 = var1_1;
                            } else {
                                var2_2 = var1_1;
                                if (var1_1 <= 74) ** continue;
                                ** continue;
                            }
                        }
                        if (var7_7 != var4_4) {
                            var1_1 = var2_2;
                            var2_2 = var7_7;
                            continue;
                        }
                        ** GOTO lbl623
                        break;
                    }
                }
                if (var3_5 >= 128) break block177;
                var9_9 = 1L << (var3_5 & 63);
                while (true) {
                    block174: {
                        block178: {
                            block179: {
                                block180: {
                                    block181: {
                                        block182: {
                                            block183: {
                                                block184: {
                                                    block185: {
                                                        if ((var2_2 = (var13_11 = this.e)[var6_6 = var2_2 - 1]) == 3) break block178;
                                                        if (var2_2 == 27) break block179;
                                                        if (var2_2 == 34) break block180;
                                                        if (var2_2 == 38) break block181;
                                                        if (var2_2 == 44) break block182;
                                                        if (var2_2 == 46) break block183;
                                                        if (var2_2 == 12) break block184;
                                                        if (var2_2 == 13) break block185;
                                                        switch (var2_2) {
                                                            default: {
                                                                switch (var2_2) {
                                                                    default: {
                                                                        block56 : switch (var2_2) {
                                                                            default: lbl-1000:
                                                                            // 3 sources

                                                                            {
                                                                                while (true) {
                                                                                    var2_2 = var1_1;
                                                                                    break block56;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            case 22: {
                                                                                var2_2 = var1_1;
                                                                                if ((var9_9 & -268435457L) == 0L) break block174;
                                                                            }
                                                                            case 21: {
                                                                                this.f(53, 55);
                                                                                var2_2 = var1_1;
                                                                                break;
                                                                            }
                                                                            {
                                                                            }
                                                                            case 20: {
                                                                                var2_2 = var1_1;
                                                                                if (this.f == '\\') {
                                                                                    var2_2 = this.i;
                                                                                    this.i = var2_2 + 1;
                                                                                    var13_11[var2_2] = 21;
                                                                                    var2_2 = var1_1;
                                                                                    break;
                                                                                }
                                                                                break block174;
                                                                            }
                                                                        }
                                                                        break block174;
                                                                    }
                                                                    case 17: {
                                                                        var2_2 = var1_1;
                                                                        if ((var9_9 & -268435457L) == 0L) break block174;
                                                                    }
                                                                    case 16: {
                                                                        this.f(56, 58);
                                                                        var2_2 = var1_1;
                                                                        break;
                                                                    }
                                                                    {
                                                                    }
                                                                    case 15: {
                                                                        var2_2 = var1_1;
                                                                        if (this.f == '\\') {
                                                                            var2_2 = this.i;
                                                                            this.i = var2_2 + 1;
                                                                            var13_11[var2_2] = 16;
                                                                            var2_2 = var1_1;
                                                                            break;
                                                                        }
                                                                        break block174;
                                                                    }
                                                                }
                                                                break block174;
                                                            }
                                                            case 9: {
                                                                var2_2 = var1_1;
                                                                if (this.f == 'u') {
                                                                    var2_2 = this.i;
                                                                    this.i = var2_2 + 1;
                                                                    var13_11[var2_2] = 10;
                                                                    var2_2 = var1_1;
                                                                    break;
                                                                }
                                                                break block174;
                                                            }
                                                            case 7: 
                                                            case 8: {
                                                                if ((var9_9 & 576460745995190270L) == 0L) ** GOTO lbl-1000
                                                                var2_2 = var1_1;
                                                                if (var1_1 > 76) {
                                                                    var2_2 = 76;
                                                                }
                                                                this.e(8);
                                                            }
                                                            case 6: {
                                                                var3_5 = this.f;
                                                                if (var3_5 == 118) {
                                                                    this.c(63, 64);
                                                                    var2_2 = var1_1;
                                                                    break;
                                                                }
                                                                var2_2 = var1_1;
                                                                if (var3_5 == 117) {
                                                                    var2_2 = this.i;
                                                                    this.i = var2_2 + 1;
                                                                    var13_11[var2_2] = 10;
                                                                    var2_2 = var1_1;
                                                                    break;
                                                                }
                                                                break block174;
                                                            }
                                                        }
                                                        break block174;
                                                    }
                                                    if ((var9_9 & 0x7E0000007EL) != 0L) ** break;
                                                    ** continue;
                                                    var2_2 = var1_1;
                                                    if (var1_1 > 80) {
                                                        var2_2 = 80;
                                                    }
                                                    var1_1 = var2_2;
lbl525:
                                                    // 2 sources

                                                    while (true) {
                                                        this.e(13);
                                                        var2_2 = var1_1;
                                                        break block174;
                                                        break;
                                                    }
                                                }
                                                var2_2 = var1_1;
                                                if ((var9_9 & 0x100000001000000L) != 0L) {
                                                    ** continue;
                                                }
                                                break block174;
                                            }
                                            var2_2 = var1_1;
                                            if (this.f == 'v') {
                                                this.c(63, 64);
                                                var2_2 = var1_1;
                                            }
                                            break block174;
                                        }
                                        var2_2 = var1_1;
                                        if (var1_1 > 4) {
                                            var2_2 = 4;
                                        }
                                        var1_1 = this.i;
                                        this.i = var1_1 + 1;
                                        var13_11[var1_1] = 44;
                                        break block174;
                                    }
                                    var2_2 = var1_1;
                                    if ((var9_9 & 0x2000000020L) != 0L) {
                                        var2_2 = 69;
                                        var3_5 = 70;
lbl553:
                                        // 3 sources

                                        while (true) {
                                            this.c(var2_2, var3_5);
                                            var2_2 = var1_1;
                                            ** GOTO lbl574
                                            break;
                                        }
                                    }
                                    break block174;
                                }
                                var2_2 = var1_1;
                                if ((var9_9 & 0x2000000020L) == 0L) break block174;
                                var2_2 = 67;
                                var3_5 = 68;
                                ** GOTO lbl553
                            }
                            var2_2 = var1_1;
                            if ((var9_9 & 0x2000000020L) != 0L) {
                                var2_2 = 65;
                                var3_5 = 66;
                                ** continue;
                            }
                            break block174;
                        }
                        this.c(0, 2);
                        var2_2 = var1_1;
                    }
                    if (var6_6 != var4_4) {
                        var1_1 = var2_2;
                        var2_2 = var6_6;
                        continue;
                    }
                    ** GOTO lbl623
                    break;
                }
            }
            var8_8 = var3_5 >> 8;
            var6_6 = var3_5 >> 14;
            var9_9 = 1L << (var8_8 & 63);
            var7_7 = (var3_5 & 255) >> 6;
            var11_10 = 1L << (var3_5 & 63);
            while (true) {
                block190: {
                    block175: {
                        block186: {
                            block187: {
                                block188: {
                                    block189: {
                                        if ((var2_2 = (var13_11 = this.e)[var3_5 = var2_2 - 1]) == 3) break block186;
                                        if (var2_2 == 44) break block187;
                                        if (var2_2 == 16 || var2_2 == 17) break block188;
                                        if (var2_2 == 21 || var2_2 == 22) break block189;
lbl591:
                                        // 3 sources

                                        while (true) {
                                            var2_2 = var1_1;
                                            break block175;
                                            break;
                                        }
                                    }
                                    if (!e.c.d(var8_8, var6_6, var7_7, var9_9, var11_10)) ** GOTO lbl591
                                    this.f(53, 55);
                                    ** GOTO lbl591
                                }
                                if (e.c.d(var8_8, var6_6, var7_7, var9_9, var11_10)) ** break;
                                ** continue;
                                this.f(56, 58);
                                var2_2 = var1_1;
                                break block175;
                            }
                            if (!e.c.d(var8_8, var6_6, var7_7, var9_9, var11_10)) {
                                var2_2 = var1_1;
                            } else {
                                var2_2 = var1_1;
                                if (var1_1 > 4) {
                                    var2_2 = 4;
                                }
                                var13_11 = this.e;
                                var1_1 = this.i;
                                this.i = var1_1 + 1;
                                var13_11[var1_1] = 44;
                            }
                            break block175;
                        }
                        var2_2 = var1_1;
                        if (e.c.d(var8_8, var6_6, var7_7, var9_9, var11_10)) {
                            this.c(0, 2);
                            var2_2 = var1_1;
                        }
                    }
                    if (var3_5 != var4_4) break block190;
lbl623:
                    // 3 sources

                    var1_1 = var2_2;
                    if (var2_2 != 0x7FFFFFFF) {
                        this.l = var2_2;
                        this.k = var5_3;
                        var1_1 = 0x7FFFFFFF;
                    }
                    ++var5_3;
                    var2_2 = this.i;
                    this.i = var4_4;
                    if (var2_2 == (var4_4 = 51 - var4_4)) {
                        return var5_3;
                    }
                    try {
                        this.f = this.c.k();
                        continue block62;
                    }
                    catch (IOException var13_12) {
                        return var5_3;
                    }
                }
                var1_1 = var2_2;
                var2_2 = var3_5;
            }
            break;
        }
    }

    private int k0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.E0(4, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'A') {
                if (c4 != 'E') {
                    if (c4 != 'L') {
                        if (c4 != 'a') {
                            if (c4 != 'e') {
                                if (c4 != 'i') {
                                    if (c4 != 'o') {
                                        if (c4 != 'r') {
                                            if (c4 != 'O') {
                                                if (c4 != 'P') {
                                                    if (c4 != 'T') {
                                                        if (c4 == 'U') {
                                                            return this.o0(l4, 5120L, l6, 0L);
                                                        }
                                                    } else {
                                                        if ((0x100000000L & l4) != 0L) {
                                                            return this.G0(6, 32);
                                                        }
                                                        if ((0x10000000000L & l4) != 0L) {
                                                            return this.G0(6, 40);
                                                        }
                                                    }
                                                } else {
                                                    if ((0x1000000000L & l4) != 0L) {
                                                        return this.G0(6, 36);
                                                    }
                                                    if ((0x2000000000L & l4) != 0L) {
                                                        return this.G0(6, 37);
                                                    }
                                                    if ((0x40000000000000L & l4) != 0L) {
                                                        return this.G0(6, 54);
                                                    }
                                                }
                                                return this.E0(5, l4, l6);
                                            }
                                            return this.o0(l4, 0x8000000080L, l6, 0L);
                                        }
                                        return this.o0(l4, 0L, l6, 6L);
                                    }
                                    return this.o0(l4, 0L, l6, 128L);
                                }
                                return this.o0(l4, 0L, l6, 1L);
                            }
                            if ((0x4000000000000000L & l4) != 0L) {
                                return this.G0(6, 62);
                            }
                            return this.o0(l4, Long.MIN_VALUE, l6, 0L);
                        }
                        return this.o0(l4, 0L, l6, 8L);
                    }
                    if ((0x100L & l4) != 0L) {
                        return this.G0(6, 8);
                    }
                    return this.o0(l4, 292057827328L, l6, 0L);
                }
                if ((0x20000000000L & l4) != 0L) {
                    return this.G0(6, 41);
                }
                return this.o0(l4, 0x80000000000000L, l6, 0L);
            }
            return this.o0(l4, 8704L, l6, 0L);
        }
        catch (IOException iOException) {
            this.J0(5, l4, l6);
            return 6;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int l(int var1_1, int var2_2) {
        this.i = 50;
        this.e[0] = var1_1;
        var6_3 = var2_2;
        var2_2 = 1;
        var1_1 = 0x7FFFFFFF;
        var5_4 = 0;
        block61: while (true) {
            block184: {
                block182: {
                    this.j = var3_5 = this.j + 1;
                    if (var3_5 == 0x7FFFFFFF) {
                        this.a();
                    }
                    if ((var3_5 = (int)this.f) >= 64) break block182;
                    var10_10 = 1L << var3_5;
                    var3_5 = var2_2;
                    do {
                        block180: {
                            block183: {
                                var14_12 = this.e;
                                var7_7 = var3_5 - 1;
                                switch (var14_12[var7_7]) {
                                    default: {
                                        var2_2 = var1_1;
                                        break block180;
                                    }
                                    case 50: {
                                        cfr_temp_0 = (var10_10 & 0x100001200L) - 0L;
                                        var2_2 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                        if (var2_2 != 0) {
                                            this.g(1, 2);
                                        } else if (this.f == ';') {
                                            this.f(0, 2);
                                        }
                                        if (var2_2 == 0) ** GOTO lbl34
lbl30:
                                        // 2 sources

                                        while (true) {
                                            var2_2 = 44;
                                            var3_5 = 45;
                                            ** GOTO lbl139
                                            break;
                                        }
lbl34:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (this.f != ';') break block180;
                                        var2_2 = var1_1;
                                        if (var1_1 <= 4) ** GOTO lbl40
lbl38:
                                        // 3 sources

                                        while (true) {
                                            var2_2 = 4;
lbl40:
                                            // 4 sources

                                            while (true) {
                                                this.e(46);
                                                break block180;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    case 49: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl47
                                        var2_2 = var1_1;
                                        break block180;
lbl47:
                                        // 1 sources

                                        var3_5 = var1_1;
                                        if (var1_1 > 79) {
                                            var3_5 = 79;
                                        }
                                        var2_2 = 49;
                                        var1_1 = var3_5;
lbl52:
                                        // 5 sources

                                        while (true) {
                                            this.e(var2_2);
                                            var2_2 = var1_1;
                                            break block180;
                                            break;
                                        }
                                    }
                                    case 48: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl60
                                        var2_2 = var1_1;
                                        break block180;
lbl60:
                                        // 1 sources

                                        var4_6 = var1_1;
                                        if (var1_1 > 79) {
                                            var4_6 = 79;
                                        }
                                        var2_2 = 3;
                                        var3_5 = 7;
                                        var1_1 = var4_6;
lbl66:
                                        // 6 sources

                                        while (true) {
                                            this.f(var2_2, var3_5);
                                            var2_2 = var1_1;
                                            break block180;
                                            break;
                                        }
                                    }
                                    case 47: {
                                        if (this.f == ';') ** GOTO lbl74
                                        var2_2 = var1_1;
                                        break block180;
lbl74:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 4) {
                                            var2_2 = 4;
                                        }
                                        var4_6 = 16;
                                        var3_5 = 19;
                                        var1_1 = var2_2;
                                        var2_2 = var4_6;
                                        ** GOTO lbl66
                                    }
                                    case 46: {
                                        if ((var10_10 & -9217L) != 0L) ** GOTO lbl86
                                        var2_2 = var1_1;
                                        break block180;
lbl86:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 <= 4) ** GOTO lbl40
                                        ** GOTO lbl38
                                    }
                                    case 45: {
                                        if (this.f == ';') ** GOTO lbl93
                                        var2_2 = var1_1;
                                        break block180;
lbl93:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 <= 4) ** continue;
                                        ** continue;
                                    }
                                    case 44: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x100001200L) != 0L) {
                                            ** continue;
                                        }
                                        break block180;
                                    }
                                    case 43: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x100001200L) != 0L) {
                                            var2_2 = 11;
                                            var3_5 = 8;
lbl106:
                                            // 3 sources

                                            while (true) {
                                                this.f(var3_5, var2_2);
                                                var2_2 = var1_1;
                                                ** GOTO lbl459
                                                break;
                                            }
                                        }
                                        break block180;
                                    }
                                    case 42: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl115
                                        var2_2 = var1_1;
                                        break block180;
lbl115:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 84) {
                                            var2_2 = 84;
                                        }
lbl118:
                                        // 4 sources

                                        while (true) {
                                            var3_5 = 42;
                                            var1_1 = var2_2;
                                            var2_2 = var3_5;
                                            ** GOTO lbl52
                                            break;
                                        }
                                    }
                                    case 41: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x280000000000L) != 0L) {
                                            var2_2 = var1_1;
                                            ** continue;
                                        }
                                        break block180;
                                    }
                                    case 39: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl133
                                        var2_2 = var1_1;
                                        break block180;
lbl133:
                                        // 1 sources

                                        var4_6 = var1_1;
                                        if (var1_1 > 84) {
                                            var4_6 = 84;
                                        }
                                        var2_2 = 39;
                                        var3_5 = 40;
                                        var1_1 = var4_6;
lbl139:
                                        // 5 sources

                                        while (true) {
                                            this.g(var2_2, var3_5);
                                            var2_2 = var1_1;
                                            break block180;
                                            break;
                                        }
                                    }
                                    case 38: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl147
                                        var2_2 = var1_1;
                                        break block180;
lbl147:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 84) {
                                            var2_2 = 84;
                                        }
lbl150:
                                        // 4 sources

                                        while (true) {
                                            var3_5 = 38;
                                            var1_1 = var2_2;
                                            var2_2 = var3_5;
                                            ** GOTO lbl52
                                            break;
                                        }
                                    }
                                    case 37: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x280000000000L) != 0L) {
                                            var2_2 = var1_1;
                                            ** continue;
                                        }
                                        break block180;
                                    }
                                    case 35: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl165
                                        var2_2 = var1_1;
                                        break block180;
lbl165:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 <= 84) ** GOTO lbl169
lbl167:
                                        // 2 sources

                                        while (true) {
                                            var2_2 = 84;
lbl169:
                                            // 3 sources

                                            while (true) {
                                                var4_6 = 35;
                                                var3_5 = 36;
                                                var1_1 = var2_2;
                                                var2_2 = var4_6;
                                                ** GOTO lbl139
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    case 34: {
                                        if (this.f == '.') ** GOTO lbl179
                                        var2_2 = var1_1;
                                        break block180;
lbl179:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 <= 84) ** continue;
                                        ** continue;
                                    }
                                    case 33: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) break block180;
                                        var2_2 = 33;
                                        var3_5 = 34;
                                        ** GOTO lbl139
                                    }
                                    case 32: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl192
                                        var2_2 = var1_1;
                                        break block180;
lbl192:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 84) {
                                            var2_2 = 84;
                                        }
                                        var4_6 = 28;
                                        var3_5 = 31;
                                        var1_1 = var2_2;
                                        var2_2 = var4_6;
                                        ** GOTO lbl66
                                    }
                                    case 31: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl204
                                        var2_2 = var1_1;
                                        break block180;
lbl204:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 84) {
                                            var2_2 = 84;
                                        }
lbl207:
                                        // 4 sources

                                        while (true) {
                                            var3_5 = 31;
                                            var1_1 = var2_2;
                                            var2_2 = var3_5;
                                            ** GOTO lbl52
                                            break;
                                        }
                                    }
                                    case 30: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x280000000000L) != 0L) {
                                            var2_2 = var1_1;
                                            ** continue;
                                        }
                                        break block180;
                                    }
                                    case 28: {
                                        if ((var10_10 & 0x3FF000000000000L) != 0L) ** GOTO lbl222
                                        var2_2 = var1_1;
                                        break block180;
lbl222:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 84) {
                                            var2_2 = 84;
                                        }
                                        var4_6 = 28;
                                        var3_5 = 29;
                                        var1_1 = var2_2;
                                        var2_2 = var4_6;
                                        ** continue;
                                    }
                                    case 27: {
                                        var2_2 = var1_1;
                                        if (this.f == '.') {
                                            var2_2 = 28;
                                            ** continue;
                                        }
                                        break block180;
                                    }
                                    case 26: {
                                        var2_2 = var1_1;
                                        if (this.f == '-') {
                                            this.c(20, 21);
                                            var2_2 = var1_1;
                                        }
                                        break block180;
                                    }
                                    case 25: {
                                        var2_2 = var1_1;
                                        if (this.f == '\'') {
                                            var2_2 = var1_1;
                                            if (var1_1 > 81) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    var2_2 = 81;
                                                    ** GOTO lbl459
                                                    break;
                                                }
                                            }
                                        }
                                        break block180;
                                    }
                                    case 24: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & -549755813889L) == 0L) break block180;
                                    }
                                    case 23: {
                                        var2_2 = 22;
                                        var3_5 = 24;
                                        ** GOTO lbl66
                                    }
                                    case 21: {
                                        var4_6 = 22;
                                        var3_5 = 24;
                                        var2_2 = var1_1;
                                        if (this.f != '\'') break block180;
                                        var2_2 = var4_6;
                                        ** GOTO lbl66
                                    }
                                    case 20: {
                                        var2_2 = var1_1;
                                        if (this.f == '\"') {
                                            var2_2 = var1_1;
                                            if (var1_1 > 81) {
                                                ** continue;
                                            }
                                        }
                                        break block180;
                                    }
                                    case 19: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & -17179869185L) == 0L) break block180;
                                    }
                                    case 18: {
                                        var2_2 = 27;
                                        var3_5 = 25;
                                        ** GOTO lbl106
                                    }
                                    case 16: {
                                        var4_6 = 27;
                                        var3_5 = 25;
                                        var2_2 = var1_1;
                                        if (this.f == '\"') {
                                            var2_2 = var4_6;
                                            ** continue;
                                        }
                                        break block180;
                                    }
                                    case 15: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 80) {
                                                var2_2 = 80;
                                            }
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 15;
                                        }
                                        break block180;
                                    }
                                    case 13: {
                                        var2_2 = var1_1;
                                        if (this.f == '0') {
                                            var2_2 = this.i;
                                            this.i = var2_2 + 1;
                                            var14_12[var2_2] = 14;
                                            var2_2 = var1_1;
                                        }
                                        break block180;
                                    }
                                    case 12: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 78) {
                                                var2_2 = 78;
                                            }
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 12;
                                        }
                                        break block180;
                                    }
                                    case 10: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 77) {
                                                var2_2 = 77;
                                            }
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 10;
                                        }
                                        break block180;
                                    }
                                    case 8: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) {
                                            var2_2 = var1_1;
                                        } else {
                                            var2_2 = var1_1;
                                            if (var1_1 > 76) {
                                                var2_2 = 76;
                                            }
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 8;
                                        }
                                        break block180;
                                    }
                                    case 6: {
                                        if ((var10_10 & 0x3FF000000000000L) == 0L) ** GOTO lbl351
                                        var2_2 = var1_1;
                                        if (var1_1 > 79) {
                                            var2_2 = 79;
                                        }
                                        var3_5 = 3;
                                        var4_6 = 7;
                                        var1_1 = var2_2;
lbl347:
                                        // 3 sources

                                        while (true) {
                                            this.f(var3_5, var4_6);
                                            var3_5 = var1_1;
                                            ** GOTO lbl394
                                            break;
                                        }
lbl351:
                                        // 1 sources

                                        if ((var10_10 & 0x100001200L) == 0L) ** GOTO lbl355
                                        this.f(8, 11);
                                        var3_5 = var1_1;
                                        ** GOTO lbl394
lbl355:
                                        // 1 sources

                                        if ((var10_10 & 9216L) == 0L) ** GOTO lbl363
                                        var2_2 = var1_1;
                                        if (var1_1 > 74) {
                                            var2_2 = 74;
                                        }
                                        var3_5 = 12;
                                        var4_6 = 15;
                                        var1_1 = var2_2;
                                        ** GOTO lbl347
lbl363:
                                        // 1 sources

                                        var2_2 = this.f;
                                        if (var2_2 == 59) {
                                            var2_2 = var1_1;
                                            if (var1_1 > 4) {
                                                var2_2 = 4;
                                            }
                                            var3_5 = 16;
                                            var4_6 = 19;
                                            var1_1 = var2_2;
                                            ** continue;
                                        }
                                        if (var2_2 == 46) {
                                            this.e(28);
                                            var3_5 = var1_1;
                                        } else if (var2_2 == 45) {
                                            this.c(20, 21);
                                            var3_5 = var1_1;
                                        } else if (var2_2 == 39) {
                                            this.f(22, 24);
                                            var3_5 = var1_1;
                                        } else if (var2_2 == 34) {
                                            this.f(25, 27);
                                            var3_5 = var1_1;
                                        } else {
                                            var3_5 = var1_1;
                                            if (var2_2 == 58) {
                                                var2_2 = this.i;
                                                this.i = var2_2 + 1;
                                                var14_12[var2_2] = 7;
                                                var3_5 = var1_1;
                                            }
                                        }
lbl394:
                                        // 9 sources

                                        var1_1 = this.f;
                                        if (var1_1 == 48) {
                                            var14_12 = this.e;
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 14;
                                            var2_2 = var3_5;
                                        } else {
                                            var2_2 = var3_5;
                                            if (var1_1 == 13) {
                                                var14_12 = this.e;
                                                var1_1 = this.i;
                                                this.i = var1_1 + 1;
                                                var14_12[var1_1] = 4;
                                                var2_2 = var3_5;
                                            }
                                        }
                                        break block180;
                                    }
                                    case 5: {
                                        var2_2 = var1_1;
                                        if (this.f == '\r') {
                                            var2_2 = this.i;
                                            this.i = var2_2 + 1;
                                            var14_12[var2_2] = 4;
                                            var2_2 = var1_1;
                                        }
                                        break block180;
                                    }
                                    case 4: {
                                        if (this.f == '\n') ** GOTO lbl422
                                        var2_2 = var1_1;
                                        break block180;
lbl422:
                                        // 1 sources

                                        var2_2 = var1_1;
                                        if (var1_1 > 74) {
                                            var2_2 = 74;
                                        }
lbl425:
                                        // 5 sources

                                        while (true) {
                                            var4_6 = 12;
                                            var3_5 = 15;
                                            var1_1 = var2_2;
                                            var2_2 = var4_6;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    case 3: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & -9217L) != 0L) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                this.f(0, 2);
                                                var2_2 = var1_1;
                                                ** GOTO lbl459
                                                break;
                                            }
                                        }
                                        break block180;
                                    }
                                    case 2: {
                                        var2_2 = var1_1;
                                        if (this.f == ';') {
                                            ** continue;
                                        }
                                        break block180;
                                    }
                                    case 1: {
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x100001200L) != 0L) {
                                            this.g(1, 2);
                                            var2_2 = var1_1;
                                        }
                                        break block180;
                                    }
                                    case 0: 
                                }
                                if ((var10_10 & 9216L) != 0L) break block183;
                                var2_2 = var1_1;
                                break block180;
                            }
                            var2_2 = var1_1;
                            if (var1_1 <= 74) ** GOTO lbl425
                            var2_2 = 74;
                            ** continue;
                        }
                        var3_5 = var7_7;
                        var1_1 = var2_2;
                    } while (var7_7 != var5_4);
                    var1_1 = var2_2;
                    while (true) {
                        var2_2 = var1_1;
                        ** GOTO lbl653
                        break;
                    }
                }
                if (var3_5 >= 128) break block184;
                var10_10 = 1L << (var3_5 & 63);
                while (true) {
                    block181: {
                        block185: {
                            block186: {
                                block187: {
                                    block188: {
                                        block189: {
                                            block190: {
                                                block191: {
                                                    block192: {
                                                        block193: {
                                                            if ((var2_2 = (var14_12 = this.e)[var3_5 = var2_2 - 1]) == 3) break block185;
                                                            if (var2_2 == 11) break block186;
                                                            if (var2_2 == 29) break block187;
                                                            if (var2_2 == 36) break block188;
                                                            if (var2_2 == 40) break block189;
                                                            if (var2_2 == 46) break block190;
                                                            if (var2_2 == 14) break block191;
                                                            if (var2_2 == 15) break block192;
                                                            switch (var2_2) {
                                                                default: {
                                                                    switch (var2_2) {
                                                                        default: {
                                                                            block55 : switch (var2_2) {
                                                                                default: lbl-1000:
                                                                                // 3 sources

                                                                                {
                                                                                    while (true) {
                                                                                        var2_2 = var1_1;
                                                                                        break block55;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                case 24: {
                                                                                    var2_2 = var1_1;
                                                                                    if ((-268435457L & var10_10) == 0L) ** GOTO lbl538
                                                                                }
                                                                                case 23: {
                                                                                    this.f(22, 24);
                                                                                    var2_2 = var1_1;
                                                                                    break;
                                                                                }
                                                                                {
                                                                                }
                                                                                case 22: {
                                                                                    var2_2 = var1_1;
                                                                                    if (this.f == '\\') {
                                                                                        var2_2 = this.i;
                                                                                        this.i = var2_2 + 1;
                                                                                        var14_12[var2_2] = 23;
                                                                                        var2_2 = var1_1;
                                                                                        break;
                                                                                    }
                                                                                    ** GOTO lbl538
                                                                                }
                                                                            }
                                                                            ** GOTO lbl538
                                                                        }
                                                                        case 19: {
                                                                            var2_2 = var1_1;
                                                                            if ((-268435457L & var10_10) == 0L) ** GOTO lbl538
                                                                        }
                                                                        case 18: {
                                                                            this.f(25, 27);
                                                                            var2_2 = var1_1;
                                                                            break;
                                                                        }
                                                                        {
                                                                        }
                                                                        case 17: {
                                                                            var2_2 = var1_1;
                                                                            if (this.f == '\\') {
                                                                                var2_2 = this.i;
                                                                                this.i = var2_2 + 1;
                                                                                var14_12[var2_2] = 18;
                                                                                var2_2 = var1_1;
                                                                                break;
                                                                            }
                                                                            ** GOTO lbl538
                                                                        }
                                                                    }
                                                                    ** GOTO lbl538
                                                                }
                                                                case 9: {
                                                                    var2_2 = var1_1;
                                                                    if (this.f == 'v') {
                                                                        var2_2 = this.i;
                                                                        this.i = var2_2 + 1;
                                                                        var14_12[var2_2] = 10;
                                                                        var2_2 = var1_1;
                                                                    }
                                                                    ** GOTO lbl538
                                                                }
                                                                case 7: 
                                                                case 8: {
                                                                    if ((576460745995190270L & var10_10) == 0L) ** GOTO lbl-1000
                                                                    var2_2 = var1_1;
                                                                    if (var1_1 > 76) {
                                                                        var2_2 = 76;
                                                                    }
                                                                    this.e(8);
lbl538:
                                                                    // 11 sources

                                                                    while (true) {
                                                                        var1_1 = var2_2;
                                                                        break block181;
                                                                        break;
                                                                    }
                                                                }
                                                                case 6: 
                                                            }
                                                            var4_6 = this.f;
                                                            if (var4_6 != 117) break block193;
                                                            var2_2 = this.i;
                                                            this.i = var2_2 + 1;
                                                            var14_12[var2_2] = 12;
                                                            var2_2 = var1_1;
                                                            ** GOTO lbl538
                                                        }
                                                        var2_2 = var1_1;
                                                        if (var4_6 != 118) ** GOTO lbl538
                                                        var2_2 = this.i;
                                                        this.i = var2_2 + 1;
                                                        var14_12[var2_2] = 10;
                                                        var2_2 = var1_1;
                                                        ** continue;
                                                    }
                                                    if ((0x7E0000007EL & var10_10) != 0L) ** break;
                                                    ** continue;
                                                    var2_2 = var1_1;
                                                    if (var1_1 > 80) {
                                                        var2_2 = 80;
                                                    }
                                                    var1_1 = var2_2;
lbl564:
                                                    // 2 sources

                                                    while (true) {
                                                        this.e(15);
                                                        var2_2 = var1_1;
lbl567:
                                                        // 5 sources

                                                        while (true) {
                                                            var1_1 = var2_2;
                                                            break block181;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                var2_2 = var1_1;
                                                if ((var10_10 & 0x100000001000000L) == 0L) ** GOTO lbl567
                                                ** continue;
                                            }
                                            var2_2 = var1_1;
                                            if (var1_1 > 4) {
                                                var2_2 = 4;
                                            }
                                            var1_1 = this.i;
                                            this.i = var1_1 + 1;
                                            var14_12[var1_1] = 46;
                                            ** GOTO lbl567
                                        }
                                        var2_2 = var1_1;
                                        if ((var10_10 & 0x2000000020L) == 0L) ** GOTO lbl567
                                        this.c(36, 37);
                                        var2_2 = var1_1;
                                        ** continue;
                                    }
                                    if ((var10_10 & 0x2000000020L) != 0L) {
                                        this.c(34, 35);
                                    }
                                    break block181;
                                }
                                if ((var10_10 & 0x2000000020L) != 0L) {
                                    this.c(32, 33);
                                }
                                break block181;
                            }
                            if (this.f == 'u') {
                                var2_2 = this.i;
                                this.i = var2_2 + 1;
                                var14_12[var2_2] = 12;
                            }
                            break block181;
                        }
                        this.c(0, 2);
                    }
                    if (var3_5 == var5_4) ** continue;
                    var2_2 = var3_5;
                }
            }
            var8_8 = var3_5 >> 8;
            var7_7 = var3_5 >> 14;
            var12_11 = 1L << (var8_8 & 63);
            var9_9 = (var3_5 & 255) >> 6;
            var10_10 = 1L << (var3_5 & 63);
            while (true) {
                block194: {
                    if ((var2_2 = (var14_12 = this.e)[var4_6 = var2_2 - 1]) != 3) {
                        if (var2_2 != 46) {
                            if (var2_2 != 18 && var2_2 != 19) {
                                if (var2_2 != 23 && var2_2 != 24) {
                                    while (true) {
                                        var2_2 = var1_1;
                                        break;
                                    }
                                } else {
                                    var3_5 = 24;
                                    var2_2 = var1_1;
                                    if (e.c.d(var8_8, var7_7, var9_9, var12_11, var10_10)) {
                                        var2_2 = 22;
lbl626:
                                        // 2 sources

                                        while (true) {
                                            this.f(var2_2, var3_5);
                                            var2_2 = var1_1;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                var2_2 = var1_1;
                                if (e.c.d(var8_8, var7_7, var9_9, var12_11, var10_10)) {
                                    var3_5 = 27;
                                    var2_2 = 25;
                                    ** continue;
                                }
                            }
                        } else {
                            if (!e.c.d(var8_8, var7_7, var9_9, var12_11, var10_10)) ** continue;
                            var2_2 = var1_1;
                            if (var1_1 > 4) {
                                var2_2 = 4;
                            }
                            var14_12 = this.e;
                            var1_1 = this.i;
                            this.i = var1_1 + 1;
                            var14_12[var1_1] = 46;
                        }
                        while (true) {
                            var1_1 = var2_2;
                            break;
                        }
                    } else {
                        var2_2 = var1_1;
                        if (!e.c.d(var8_8, var7_7, var9_9, var12_11, var10_10)) ** continue;
                        this.c(0, 2);
                    }
                    if (var4_6 != var5_4) break block194;
                    var2_2 = var1_1;
lbl653:
                    // 2 sources

                    var1_1 = var2_2;
                    if (var2_2 != 0x7FFFFFFF) {
                        this.l = var2_2;
                        this.k = var6_3;
                        var1_1 = 0x7FFFFFFF;
                    }
                    ++var6_3;
                    var2_2 = this.i;
                    this.i = var5_4;
                    if (var2_2 == (var5_4 = 50 - var5_4)) {
                        return var6_3;
                    }
                    try {
                        this.f = this.c.k();
                        continue block61;
                    }
                    catch (IOException var14_13) {
                        return var6_3;
                    }
                }
                var2_2 = var4_6;
            }
            break;
        }
    }

    private int l0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.F0(4, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'A') {
                if (c4 != 'E') {
                    if (c4 != 'L') {
                        if (c4 != 'a') {
                            if (c4 != 'e') {
                                if (c4 != 'i') {
                                    if (c4 != 'o') {
                                        if (c4 != 'r') {
                                            if (c4 != 'O') {
                                                if (c4 != 'P') {
                                                    if (c4 != 'T') {
                                                        if (c4 == 'U') {
                                                            return this.p0(l4, 5120L, l6, 0L);
                                                        }
                                                    } else {
                                                        if ((0x100000000L & l4) != 0L) {
                                                            return this.G0(6, 32);
                                                        }
                                                        if ((0x10000000000L & l4) != 0L) {
                                                            return this.G0(6, 40);
                                                        }
                                                    }
                                                } else {
                                                    if ((0x1000000000L & l4) != 0L) {
                                                        return this.G0(6, 36);
                                                    }
                                                    if ((0x2000000000L & l4) != 0L) {
                                                        return this.G0(6, 37);
                                                    }
                                                    if ((0x40000000000000L & l4) != 0L) {
                                                        return this.G0(6, 54);
                                                    }
                                                }
                                                return this.F0(5, l4, l6);
                                            }
                                            return this.p0(l4, 0x8000000080L, l6, 0L);
                                        }
                                        return this.p0(l4, 0L, l6, 6L);
                                    }
                                    return this.p0(l4, 0L, l6, 128L);
                                }
                                return this.p0(l4, 0L, l6, 1L);
                            }
                            if ((0x4000000000000000L & l4) != 0L) {
                                return this.G0(6, 62);
                            }
                            return this.p0(l4, Long.MIN_VALUE, l6, 0L);
                        }
                        return this.p0(l4, 0L, l6, 8L);
                    }
                    if ((0x100L & l4) != 0L) {
                        return this.G0(6, 8);
                    }
                    return this.p0(l4, 292057827328L, l6, 0L);
                }
                if ((0x20000000000L & l4) != 0L) {
                    return this.G0(6, 41);
                }
                return this.p0(l4, 0x80000000000000L, l6, 0L);
            }
            return this.p0(l4, 8704L, l6, 0L);
        }
        catch (IOException iOException) {
            this.K0(5, l4, l6);
            return 6;
        }
    }

    private int m() {
        char c4 = this.f;
        if (c4 != '\t') {
            if (c4 != '\f') {
                if (c4 != ' ') {
                    if (c4 != '.') {
                        if (c4 != 'f') {
                            if (c4 != 'n') {
                                if (c4 != 't') {
                                    if (c4 != 'I') {
                                        if (c4 != 'J') {
                                            switch (c4) {
                                                default: {
                                                    switch (c4) {
                                                        default: {
                                                            switch (c4) {
                                                                default: {
                                                                    return this.i(0, 0);
                                                                }
                                                                case 'V': {
                                                                    return this.O(0x40000000000L, 0L);
                                                                }
                                                                case 'U': {
                                                                    return this.O(0x800000L, 0L);
                                                                }
                                                                case 'T': {
                                                                    return this.O(848256040960L, 0L);
                                                                }
                                                                case 'S': {
                                                                    return this.O(54888719970562048L, 0L);
                                                                }
                                                                case 'R': 
                                                            }
                                                            return this.O(0x800000000L, 0L);
                                                        }
                                                        case 'P': {
                                                            return this.O(0x400000L, 0L);
                                                        }
                                                        case 'O': {
                                                            return this.O(0x20000000000000L, 0L);
                                                        }
                                                        case 'N': {
                                                            return this.O(0x1008000L, 0L);
                                                        }
                                                        case 'M': {
                                                            return this.O(0x280020L, 0L);
                                                        }
                                                        case 'L': 
                                                    }
                                                    return this.O(1644167616L, 0L);
                                                }
                                                case 'G': {
                                                    return this.O(0x10000000000E00L, 0L);
                                                }
                                                case 'F': {
                                                    return this.O(0x8003000000000L, 0L);
                                                }
                                                case 'E': {
                                                    return this.O(0x10000000L, 0L);
                                                }
                                                case 'D': {
                                                    return this.O(0x100000L, 0L);
                                                }
                                                case 'C': {
                                                    return this.O(0x4020204000000L, 0L);
                                                }
                                                case 'B': {
                                                    return this.O(0xF00000000000L, 0L);
                                                }
                                                case 'A': 
                                            }
                                            return this.O(131072L, 0L);
                                        }
                                        return this.O(0x8000000L, 0L);
                                    }
                                    return this.O(0x80000000000L, 0L);
                                }
                                return this.O(0x200000000000000L, 0L);
                            }
                            return this.O(0x100000000000000L, 0L);
                        }
                        return this.O(0x400000000000000L, 0L);
                    }
                    return this.O(-4611686018427387904L, 3071L);
                }
                return this.y0(0, 1, 52);
            }
            return this.y0(0, 3, 52);
        }
        return this.y0(0, 2, 52);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int m0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.C0(5, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'E') {
                if (c4 != 'L') {
                    if (c4 != 'P') {
                        if (c4 == 'X') return this.q0(l4, 0x80000000000000L, l6, 0L);
                        if (c4 == 'a') return this.q0(l4, 0L, l6, 6L);
                        if (c4 == 'c') return this.q0(l4, 0L, l6, 136L);
                        if (c4 == 'f') return this.q0(l4, Long.MIN_VALUE, l6, 0L);
                        if (c4 != 'n') return this.C0(6, l4, l6);
                        return this.q0(l4, 0L, l6, 1L);
                    }
                    if ((0x400L & l4) != 0L) {
                        return this.y0(7, 10, 1);
                    }
                    if ((0x1000L & l4) != 0L) {
                        return this.y0(7, 12, 1);
                    }
                    if ((0x8000000000L & l4) == 0L) return this.C0(6, l4, l6);
                    return this.y0(7, 39, 1);
                }
                if ((0x80L & l4) != 0L) {
                    return this.y0(7, 7, 1);
                }
                if ((0x200L & l4) != 0L) {
                    return this.y0(7, 9, 1);
                }
                if ((0x2000L & l4) != 0L) {
                    return this.y0(7, 13, 1);
                }
                if ((0x400000000L & l4) != 0L) {
                    return this.y0(7, 34, 1);
                }
                if ((0x4000000000L & l4) == 0L) return this.C0(6, l4, l6);
                return this.y0(7, 38, 1);
            }
            if ((0x800L & l4) != 0L) {
                return this.y0(7, 11, 1);
            }
            if ((0x4000L & l4) != 0L) {
                return this.y0(7, 14, 1);
            }
            if ((0x8000L & l4) == 0L) return this.C0(6, l4, l6);
            return this.y0(7, 15, 1);
        }
        catch (IOException iOException) {
            this.H0(6, l4, l6);
            return 7;
        }
    }

    private int n() {
        char c4 = this.f;
        if (c4 != '\t') {
            if (c4 != '\f') {
                if (c4 != ' ') {
                    if (c4 != '.') {
                        if (c4 != 'f') {
                            if (c4 != 'n') {
                                if (c4 != 't') {
                                    if (c4 != 'I') {
                                        if (c4 != 'J') {
                                            switch (c4) {
                                                default: {
                                                    switch (c4) {
                                                        default: {
                                                            switch (c4) {
                                                                default: {
                                                                    return this.j(6, 0);
                                                                }
                                                                case 'V': {
                                                                    return this.P(0x40000000000L, 0L);
                                                                }
                                                                case 'U': {
                                                                    return this.P(0x800000L, 0L);
                                                                }
                                                                case 'T': {
                                                                    return this.P(848256040960L, 0L);
                                                                }
                                                                case 'S': {
                                                                    return this.P(54888719970562048L, 0L);
                                                                }
                                                                case 'R': 
                                                            }
                                                            return this.P(0x800000000L, 0L);
                                                        }
                                                        case 'P': {
                                                            return this.P(0x400000L, 0L);
                                                        }
                                                        case 'O': {
                                                            return this.P(0x20000000000000L, 0L);
                                                        }
                                                        case 'N': {
                                                            return this.P(0x1008000L, 0L);
                                                        }
                                                        case 'M': {
                                                            return this.P(0x280020L, 0L);
                                                        }
                                                        case 'L': 
                                                    }
                                                    return this.P(1644167616L, 0L);
                                                }
                                                case 'G': {
                                                    return this.P(0x10000000000E00L, 0L);
                                                }
                                                case 'F': {
                                                    return this.P(0x8003000000000L, 0L);
                                                }
                                                case 'E': {
                                                    return this.P(0x10000000L, 0L);
                                                }
                                                case 'D': {
                                                    return this.P(0x100000L, 0L);
                                                }
                                                case 'C': {
                                                    return this.P(0x4020204000000L, 0L);
                                                }
                                                case 'B': {
                                                    return this.P(0xF00000000000L, 0L);
                                                }
                                                case 'A': 
                                            }
                                            return this.P(131072L, 0L);
                                        }
                                        return this.P(0x8000000L, 0L);
                                    }
                                    return this.P(0x80000000000L, 0L);
                                }
                                return this.P(0x200000000000000L, 0L);
                            }
                            return this.P(0x100000000000000L, 0L);
                        }
                        return this.P(0x400000000000000L, 0L);
                    }
                    return this.P(-4611686018427387904L, 3071L);
                }
                return this.z0(0, 1, 51);
            }
            return this.z0(0, 3, 51);
        }
        return this.z0(0, 2, 51);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int n0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.D0(5, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'E') {
                if (c4 != 'L') {
                    if (c4 != 'P') {
                        if (c4 == 'X') return this.r0(l4, 0x80000000000000L, l6, 0L);
                        if (c4 == 'a') return this.r0(l4, 0L, l6, 6L);
                        if (c4 == 'c') return this.r0(l4, 0L, l6, 136L);
                        if (c4 == 'f') return this.r0(l4, Long.MIN_VALUE, l6, 0L);
                        if (c4 != 'n') return this.D0(6, l4, l6);
                        return this.r0(l4, 0L, l6, 1L);
                    }
                    if ((0x400L & l4) != 0L) {
                        return this.G0(7, 10);
                    }
                    if ((0x1000L & l4) != 0L) {
                        return this.G0(7, 12);
                    }
                    if ((0x8000000000L & l4) == 0L) return this.D0(6, l4, l6);
                    return this.G0(7, 39);
                }
                if ((0x80L & l4) != 0L) {
                    return this.G0(7, 7);
                }
                if ((0x200L & l4) != 0L) {
                    return this.G0(7, 9);
                }
                if ((0x2000L & l4) != 0L) {
                    return this.G0(7, 13);
                }
                if ((0x400000000L & l4) != 0L) {
                    return this.G0(7, 34);
                }
                if ((0x4000000000L & l4) == 0L) return this.D0(6, l4, l6);
                return this.G0(7, 38);
            }
            if ((0x800L & l4) != 0L) {
                return this.G0(7, 11);
            }
            if ((0x4000L & l4) != 0L) {
                return this.G0(7, 14);
            }
            if ((0x8000L & l4) == 0L) return this.D0(6, l4, l6);
            return this.G0(7, 15);
        }
        catch (IOException iOException) {
            this.I0(6, l4, l6);
            return 7;
        }
    }

    private int o() {
        char c4 = this.f;
        if (c4 != '\t') {
            if (c4 != '\f') {
                if (c4 != ' ') {
                    if (c4 != '.') {
                        if (c4 != 'f') {
                            if (c4 != 'n') {
                                if (c4 != 't') {
                                    if (c4 != 'I') {
                                        if (c4 != 'J') {
                                            switch (c4) {
                                                default: {
                                                    switch (c4) {
                                                        default: {
                                                            switch (c4) {
                                                                default: {
                                                                    return this.k(6, 0);
                                                                }
                                                                case 'V': {
                                                                    return this.Q(0x40000000000L, 0L);
                                                                }
                                                                case 'U': {
                                                                    return this.Q(0x800000L, 0L);
                                                                }
                                                                case 'T': {
                                                                    return this.Q(848256040960L, 0L);
                                                                }
                                                                case 'S': {
                                                                    return this.Q(54888719970562048L, 0L);
                                                                }
                                                                case 'R': 
                                                            }
                                                            return this.Q(0x800000000L, 0L);
                                                        }
                                                        case 'P': {
                                                            return this.Q(0x400000L, 0L);
                                                        }
                                                        case 'O': {
                                                            return this.Q(0x20000000000000L, 0L);
                                                        }
                                                        case 'N': {
                                                            return this.Q(0x1008000L, 0L);
                                                        }
                                                        case 'M': {
                                                            return this.Q(0x280020L, 0L);
                                                        }
                                                        case 'L': 
                                                    }
                                                    return this.Q(1644167616L, 0L);
                                                }
                                                case 'G': {
                                                    return this.Q(0x10000000000E00L, 0L);
                                                }
                                                case 'F': {
                                                    return this.Q(0x8003000000000L, 0L);
                                                }
                                                case 'E': {
                                                    return this.Q(0x10000000L, 0L);
                                                }
                                                case 'D': {
                                                    return this.Q(0x100000L, 0L);
                                                }
                                                case 'C': {
                                                    return this.Q(0x4020204000000L, 0L);
                                                }
                                                case 'B': {
                                                    return this.Q(0xF00000000000L, 0L);
                                                }
                                                case 'A': 
                                            }
                                            return this.Q(131072L, 0L);
                                        }
                                        return this.Q(0x8000000L, 0L);
                                    }
                                    return this.Q(0x80000000000L, 0L);
                                }
                                return this.Q(0x200000000000000L, 0L);
                            }
                            return this.Q(0x100000000000000L, 0L);
                        }
                        return this.Q(0x400000000000000L, 0L);
                    }
                    return this.Q(-4611686018427387904L, 3071L);
                }
                return this.A0(0, 1, 51);
            }
            return this.A0(0, 3, 51);
        }
        return this.A0(0, 2, 51);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int o0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.E0(5, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'E') {
                if (c4 != 'L') {
                    if (c4 != 'P') {
                        if (c4 == 'X') return this.s0(l4, 0x80000000000000L, l6, 0L);
                        if (c4 == 'a') return this.s0(l4, 0L, l6, 6L);
                        if (c4 == 'c') return this.s0(l4, 0L, l6, 136L);
                        if (c4 == 'f') return this.s0(l4, Long.MIN_VALUE, l6, 0L);
                        if (c4 != 'n') return this.E0(6, l4, l6);
                        return this.s0(l4, 0L, l6, 1L);
                    }
                    if ((0x400L & l4) != 0L) {
                        return this.G0(7, 10);
                    }
                    if ((0x1000L & l4) != 0L) {
                        return this.G0(7, 12);
                    }
                    if ((0x8000000000L & l4) == 0L) return this.E0(6, l4, l6);
                    return this.G0(7, 39);
                }
                if ((0x80L & l4) != 0L) {
                    return this.G0(7, 7);
                }
                if ((0x200L & l4) != 0L) {
                    return this.G0(7, 9);
                }
                if ((0x2000L & l4) != 0L) {
                    return this.G0(7, 13);
                }
                if ((0x400000000L & l4) != 0L) {
                    return this.G0(7, 34);
                }
                if ((0x4000000000L & l4) == 0L) return this.E0(6, l4, l6);
                return this.G0(7, 38);
            }
            if ((0x800L & l4) != 0L) {
                return this.G0(7, 11);
            }
            if ((0x4000L & l4) != 0L) {
                return this.G0(7, 14);
            }
            if ((0x8000L & l4) == 0L) return this.E0(6, l4, l6);
            return this.G0(7, 15);
        }
        catch (IOException iOException) {
            this.J0(6, l4, l6);
            return 7;
        }
    }

    private int p() {
        char c4 = this.f;
        if (c4 != '\t') {
            if (c4 != '\f') {
                if (c4 != ' ') {
                    if (c4 != '.') {
                        if (c4 != '[') {
                            if (c4 != ']') {
                                if (c4 != 'f') {
                                    if (c4 != 'n') {
                                        if (c4 != 't') {
                                            if (c4 != 'I') {
                                                if (c4 != 'J') {
                                                    switch (c4) {
                                                        default: {
                                                            switch (c4) {
                                                                default: {
                                                                    switch (c4) {
                                                                        default: {
                                                                            return this.l(6, 0);
                                                                        }
                                                                        case 'V': {
                                                                            return this.R(0x40000000000L, 0L);
                                                                        }
                                                                        case 'U': {
                                                                            return this.R(0x800000L, 0L);
                                                                        }
                                                                        case 'T': {
                                                                            return this.R(848256040960L, 0L);
                                                                        }
                                                                        case 'S': {
                                                                            return this.R(54888719970562048L, 0L);
                                                                        }
                                                                        case 'R': 
                                                                    }
                                                                    return this.R(0x800000000L, 0L);
                                                                }
                                                                case 'P': {
                                                                    return this.R(0x400000L, 0L);
                                                                }
                                                                case 'O': {
                                                                    return this.R(0x20000000000000L, 0L);
                                                                }
                                                                case 'N': {
                                                                    return this.R(0x1008000L, 0L);
                                                                }
                                                                case 'M': {
                                                                    return this.R(0x280020L, 0L);
                                                                }
                                                                case 'L': 
                                                            }
                                                            return this.R(1644167616L, 0L);
                                                        }
                                                        case 'G': {
                                                            return this.R(0x10000000000E00L, 0L);
                                                        }
                                                        case 'F': {
                                                            return this.R(0x8003000000000L, 0L);
                                                        }
                                                        case 'E': {
                                                            return this.R(0x10000000L, 0L);
                                                        }
                                                        case 'D': {
                                                            return this.R(0x100000L, 0L);
                                                        }
                                                        case 'C': {
                                                            return this.R(0x4020204000000L, 0L);
                                                        }
                                                        case 'B': {
                                                            return this.R(0xF00000000000L, 0L);
                                                        }
                                                        case 'A': 
                                                    }
                                                    return this.R(131072L, 0L);
                                                }
                                                return this.R(0x8000000L, 0L);
                                            }
                                            return this.R(0x80000000000L, 0L);
                                        }
                                        return this.R(0x200000000000000L, 0L);
                                    }
                                    return this.R(0x100000000000000L, 0L);
                                }
                                return this.R(0x400000000000000L, 0L);
                            }
                            return this.G0(0, 89);
                        }
                        return this.G0(0, 88);
                    }
                    return this.R(-4611686018427387904L, 3071L);
                }
                return this.B0(0, 1, 50);
            }
            return this.B0(0, 3, 50);
        }
        return this.B0(0, 2, 50);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int p0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.F0(5, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'E') {
                if (c4 != 'L') {
                    if (c4 != 'P') {
                        if (c4 == 'X') return this.t0(l4, 0x80000000000000L, l6, 0L);
                        if (c4 == 'a') return this.t0(l4, 0L, l6, 6L);
                        if (c4 == 'c') return this.t0(l4, 0L, l6, 136L);
                        if (c4 == 'f') return this.t0(l4, Long.MIN_VALUE, l6, 0L);
                        if (c4 != 'n') return this.F0(6, l4, l6);
                        return this.t0(l4, 0L, l6, 1L);
                    }
                    if ((0x400L & l4) != 0L) {
                        return this.G0(7, 10);
                    }
                    if ((0x1000L & l4) != 0L) {
                        return this.G0(7, 12);
                    }
                    if ((0x8000000000L & l4) == 0L) return this.F0(6, l4, l6);
                    return this.G0(7, 39);
                }
                if ((0x80L & l4) != 0L) {
                    return this.G0(7, 7);
                }
                if ((0x200L & l4) != 0L) {
                    return this.G0(7, 9);
                }
                if ((0x2000L & l4) != 0L) {
                    return this.G0(7, 13);
                }
                if ((0x400000000L & l4) != 0L) {
                    return this.G0(7, 34);
                }
                if ((0x4000000000L & l4) == 0L) return this.F0(6, l4, l6);
                return this.G0(7, 38);
            }
            if ((0x800L & l4) != 0L) {
                return this.G0(7, 11);
            }
            if ((0x4000L & l4) != 0L) {
                return this.G0(7, 14);
            }
            if ((0x8000L & l4) == 0L) return this.F0(6, l4, l6);
            return this.G0(7, 15);
        }
        catch (IOException iOException) {
            this.K0(6, l4, l6);
            return 7;
        }
    }

    private int q(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.C0(8, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                if (c4 != 'i') {
                    return this.C0(9, l4, l6);
                }
                return this.u(l4, 0L, l6, 8L);
            }
            return this.u(l4, Long.MIN_VALUE, l6, 1L);
        }
        catch (IOException iOException) {
            this.H0(9, l4, l6);
            return 10;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int q0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.C0(6, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'T') {
                if (c4 == 'a') return this.u0(l4, 0L, l6, 128L);
                if (c4 == 'e') return this.u0(l4, 0L, l6, 1L);
                if (c4 == 'i') return this.u0(l4, Long.MIN_VALUE, l6, 0L);
                if (c4 == 'k') return this.u0(l4, 0L, l6, 8L);
                if (c4 == 'm') return this.u0(l4, 0L, l6, 2L);
                if (c4 != 'r') return this.C0(7, l4, l6);
                return this.u0(l4, 0L, l6, 4L);
            }
            if ((0x80000000000000L & l4) == 0L) return this.C0(7, l4, l6);
            return this.y0(8, 55, 1);
        }
        catch (IOException iOException) {
            this.H0(7, l4, l6);
            return 8;
        }
    }

    private int r(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.D0(8, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                if (c4 != 'i') {
                    return this.D0(9, l4, l6);
                }
                return this.v(l4, 0L, l6, 8L);
            }
            return this.v(l4, Long.MIN_VALUE, l6, 1L);
        }
        catch (IOException iOException) {
            this.I0(9, l4, l6);
            return 10;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int r0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.D0(6, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'T') {
                if (c4 == 'a') return this.v0(l4, 0L, l6, 128L);
                if (c4 == 'e') return this.v0(l4, 0L, l6, 1L);
                if (c4 == 'i') return this.v0(l4, Long.MIN_VALUE, l6, 0L);
                if (c4 == 'k') return this.v0(l4, 0L, l6, 8L);
                if (c4 == 'm') return this.v0(l4, 0L, l6, 2L);
                if (c4 != 'r') return this.D0(7, l4, l6);
                return this.v0(l4, 0L, l6, 4L);
            }
            if ((0x80000000000000L & l4) == 0L) return this.D0(7, l4, l6);
            return this.G0(8, 55);
        }
        catch (IOException iOException) {
            this.I0(7, l4, l6);
            return 8;
        }
    }

    private int s(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.E0(8, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                if (c4 != 'i') {
                    return this.E0(9, l4, l6);
                }
                return this.w(l4, 0L, l6, 8L);
            }
            return this.w(l4, Long.MIN_VALUE, l6, 1L);
        }
        catch (IOException iOException) {
            this.J0(9, l4, l6);
            return 10;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int s0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.E0(6, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'T') {
                if (c4 == 'a') return this.w0(l4, 0L, l6, 128L);
                if (c4 == 'e') return this.w0(l4, 0L, l6, 1L);
                if (c4 == 'i') return this.w0(l4, Long.MIN_VALUE, l6, 0L);
                if (c4 == 'k') return this.w0(l4, 0L, l6, 8L);
                if (c4 == 'm') return this.w0(l4, 0L, l6, 2L);
                if (c4 != 'r') return this.E0(7, l4, l6);
                return this.w0(l4, 0L, l6, 4L);
            }
            if ((0x80000000000000L & l4) == 0L) return this.E0(7, l4, l6);
            return this.G0(8, 55);
        }
        catch (IOException iOException) {
            this.J0(7, l4, l6);
            return 8;
        }
    }

    private int t(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.F0(8, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                if (c4 != 'i') {
                    return this.F0(9, l4, l6);
                }
                return this.x(l4, 0L, l6, 8L);
            }
            return this.x(l4, Long.MIN_VALUE, l6, 1L);
        }
        catch (IOException iOException) {
            this.K0(9, l4, l6);
            return 10;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int t0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.F0(6, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'T') {
                if (c4 == 'a') return this.x0(l4, 0L, l6, 128L);
                if (c4 == 'e') return this.x0(l4, 0L, l6, 1L);
                if (c4 == 'i') return this.x0(l4, Long.MIN_VALUE, l6, 0L);
                if (c4 == 'k') return this.x0(l4, 0L, l6, 8L);
                if (c4 == 'm') return this.x0(l4, 0L, l6, 2L);
                if (c4 != 'r') return this.F0(7, l4, l6);
                return this.x0(l4, 0L, l6, 4L);
            }
            if ((0x80000000000000L & l4) == 0L) return this.F0(7, l4, l6);
            return this.G0(8, 55);
        }
        catch (IOException iOException) {
            this.K0(7, l4, l6);
            return 8;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int u(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.C0(9, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'd') {
                if (c4 == 'f') return this.y(l4, 0L, l6, 1L);
                if (c4 != 'z') return this.C0(10, l4, l6);
                return this.y(l4, 0L, l6, 8L);
            }
            if ((Long.MIN_VALUE & l4) == 0L) return this.C0(10, l4, l6);
            return this.G0(11, 63);
        }
        catch (IOException iOException) {
            this.H0(10, l4, l6);
            return 11;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int u0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.C0(7, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 == 'd') return this.q(l4, 0L, l6, 1L);
            if (c4 != 'g') {
                if (c4 != 'l') {
                    if (c4 == 'n') return this.q(l4, Long.MIN_VALUE, l6, 0L);
                    if (c4 != 's') return this.C0(8, l4, l6);
                    if ((2L & l6) == 0L) return this.q(l4, 0L, l6, 8L);
                    return this.G0(9, 65);
                }
                if ((0x80L & l6) == 0L) return this.C0(8, l4, l6);
                return this.G0(9, 71);
            }
            if ((4L & l6) == 0L) return this.C0(8, l4, l6);
            return this.G0(9, 66);
        }
        catch (IOException iOException) {
            this.H0(8, l4, l6);
            return 9;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int v(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.D0(9, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'd') {
                if (c4 == 'f') return this.z(l4, 0L, l6, 1L);
                if (c4 != 'z') return this.D0(10, l4, l6);
                return this.z(l4, 0L, l6, 8L);
            }
            if ((Long.MIN_VALUE & l4) == 0L) return this.D0(10, l4, l6);
            return this.G0(11, 63);
        }
        catch (IOException iOException) {
            this.I0(10, l4, l6);
            return 11;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int v0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.D0(7, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 == 'd') return this.r(l4, 0L, l6, 1L);
            if (c4 != 'g') {
                if (c4 != 'l') {
                    if (c4 == 'n') return this.r(l4, Long.MIN_VALUE, l6, 0L);
                    if (c4 != 's') return this.D0(8, l4, l6);
                    if ((2L & l6) == 0L) return this.r(l4, 0L, l6, 8L);
                    return this.G0(9, 65);
                }
                if ((0x80L & l6) == 0L) return this.D0(8, l4, l6);
                return this.G0(9, 71);
            }
            if ((4L & l6) == 0L) return this.D0(8, l4, l6);
            return this.G0(9, 66);
        }
        catch (IOException iOException) {
            this.I0(8, l4, l6);
            return 9;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int w(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.E0(9, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'd') {
                if (c4 == 'f') return this.A(l4, 0L, l6, 1L);
                if (c4 != 'z') return this.E0(10, l4, l6);
                return this.A(l4, 0L, l6, 8L);
            }
            if ((Long.MIN_VALUE & l4) == 0L) return this.E0(10, l4, l6);
            return this.G0(11, 63);
        }
        catch (IOException iOException) {
            this.J0(10, l4, l6);
            return 11;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int w0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.E0(7, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 == 'd') return this.s(l4, 0L, l6, 1L);
            if (c4 != 'g') {
                if (c4 != 'l') {
                    if (c4 == 'n') return this.s(l4, Long.MIN_VALUE, l6, 0L);
                    if (c4 != 's') return this.E0(8, l4, l6);
                    if ((2L & l6) == 0L) return this.s(l4, 0L, l6, 8L);
                    return this.G0(9, 65);
                }
                if ((0x80L & l6) == 0L) return this.E0(8, l4, l6);
                return this.G0(9, 71);
            }
            if ((4L & l6) == 0L) return this.E0(8, l4, l6);
            return this.G0(9, 66);
        }
        catch (IOException iOException) {
            this.J0(8, l4, l6);
            return 9;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int x(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.F0(9, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'd') {
                if (c4 == 'f') return this.B(l4, 0L, l6, 1L);
                if (c4 != 'z') return this.F0(10, l4, l6);
                return this.B(l4, 0L, l6, 8L);
            }
            if ((Long.MIN_VALUE & l4) == 0L) return this.F0(10, l4, l6);
            return this.G0(11, 63);
        }
        catch (IOException iOException) {
            this.K0(10, l4, l6);
            return 11;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int x0(long l3, long l4, long l5, long l6) {
        if (((l4 &= l3) | (l6 &= l5)) == 0L) {
            return this.F0(7, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 == 'd') return this.t(l4, 0L, l6, 1L);
            if (c4 != 'g') {
                if (c4 != 'l') {
                    if (c4 == 'n') return this.t(l4, Long.MIN_VALUE, l6, 0L);
                    if (c4 != 's') return this.F0(8, l4, l6);
                    if ((2L & l6) == 0L) return this.t(l4, 0L, l6, 8L);
                    return this.G0(9, 65);
                }
                if ((0x80L & l6) == 0L) return this.F0(8, l4, l6);
                return this.G0(9, 71);
            }
            if ((4L & l6) == 0L) return this.F0(8, l4, l6);
            return this.G0(9, 66);
        }
        catch (IOException iOException) {
            this.K0(8, l4, l6);
            return 9;
        }
    }

    private int y(long l3, long l4, long l5, long l6) {
        if ((l4 & l3 | (l6 &= l5)) == 0L) {
            return this.C0(10, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                if (c4 == 'i') {
                    return this.C(l6, 1L);
                }
            } else if ((8L & l6) != 0L) {
                return this.G0(12, 67);
            }
            return this.C0(11, 0L, l6);
        }
        catch (IOException iOException) {
            this.H0(11, 0L, l6);
            return 12;
        }
    }

    private int y0(int n3, int n4, int n5) {
        this.l = n4;
        this.k = n3;
        try {
            this.f = this.c.k();
            return this.i(n5, n3 + 1);
        }
        catch (IOException iOException) {
            return n3 + 1;
        }
    }

    private int z(long l3, long l4, long l5, long l6) {
        if ((l4 & l3 | (l6 &= l5)) == 0L) {
            return this.D0(10, l3, l5);
        }
        try {
            char c4;
            this.f = c4 = this.c.k();
            if (c4 != 'e') {
                if (c4 == 'i') {
                    return this.D(l6, 1L);
                }
            } else if ((8L & l6) != 0L) {
                return this.G0(12, 67);
            }
            return this.D0(11, 0L, l6);
        }
        catch (IOException iOException) {
            this.I0(11, 0L, l6);
            return 12;
        }
    }

    private int z0(int n3, int n4, int n5) {
        this.l = n4;
        this.k = n3;
        try {
            this.f = this.c.k();
            return this.j(n5, n3 + 1);
        }
        catch (IOException iOException) {
            return n3 + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f b() {
        boolean bl;
        int n3;
        int n4;
        String string2 = "";
        Object var9_2 = null;
        Object object = null;
        int n5 = 0;
        while (true) {
            try {
                block15: {
                    block16: {
                        block17: {
                            this.f = this.c.a();
                            n4 = this.g;
                            if (n4 == 0) break block16;
                            if (n4 == 1) break block17;
                            if (n4 != 2) {
                                if (n4 != 3) {
                                    n4 = n5;
                                    break block15;
                                } else {
                                    this.l = Integer.MAX_VALUE;
                                    this.k = 0;
                                    n4 = this.p();
                                }
                                break block15;
                            } else {
                                this.l = Integer.MAX_VALUE;
                                this.k = 0;
                                n4 = this.o();
                            }
                            break block15;
                        }
                        this.l = Integer.MAX_VALUE;
                        this.k = 0;
                        n4 = this.n();
                        break block15;
                    }
                    this.l = Integer.MAX_VALUE;
                    this.k = 0;
                    n4 = this.m();
                }
                if (this.l == Integer.MAX_VALUE) break;
                n5 = this.k;
                if (n5 + 1 < n4) {
                    this.c.f(n4 - n5 - 1);
                }
            }
            catch (IOException iOException) {
                this.l = 0;
                f f4 = this.h();
                f4.h = object;
                return f4;
            }
            Object object2 = s;
            n5 = this.l;
            if ((object2[n5 >> 6] & 1L << (n5 & 0x3F)) != 0L) {
                object2 = this.h();
                object2.h = object;
                n4 = r[this.l];
                if (n4 == -1) return object2;
                this.g = n4;
                return object2;
            }
            object2 = object;
            if ((1L << (n5 & 0x3F) & u[n5 >> 6]) != 0L) {
                object2 = this.h();
                if (object != null) {
                    object2.h = object;
                    ((f)object).g = object2;
                }
            }
            n3 = r[this.l];
            object = object2;
            n5 = n4;
            if (n3 == -1) continue;
            this.g = n3;
            object = object2;
            n5 = n4;
        }
        n5 = this.c.j();
        n3 = this.c.i();
        try {
            this.c.k();
            this.c.f(1);
            bl = false;
            object = var9_2;
        }
        catch (IOException iOException) {
            object = n4 <= 1 ? "" : this.c.d();
            char c4 = this.f;
            if (c4 != '\n' && c4 != '\r') {
                ++n3;
                bl = true;
            }
            ++n5;
            bl = true;
            n3 = 0;
        }
        if (bl) throw new lasm.c(bl, this.g, n5, n3, (String)object, this.f, 0);
        this.c.f(1);
        if (n4 <= 1) {
            object = string2;
            throw new lasm.c(bl, this.g, n5, n3, (String)object, this.f, 0);
        }
        object = this.c.d();
        throw new lasm.c(bl, this.g, n5, n3, (String)object, this.f, 0);
    }

    protected f h() {
        String string2 = p[this.l];
        Object object = string2;
        if (string2 == null) {
            object = this.c.d();
        }
        int n3 = this.c.h();
        int n4 = this.c.g();
        int n5 = this.c.j();
        int n6 = this.c.i();
        object = e.f.a(this.l, (String)object);
        ((f)object).b = n3;
        ((f)object).d = n5;
        ((f)object).c = n4;
        ((f)object).e = n6;
        return object;
    }

    private static long[] $d2j$hex$8952c603$decode_J(String src) {
        byte[] d4 = e.c.$d2j$hex$8952c603$decode_B(src);
        ByteBuffer b4 = ByteBuffer.wrap(d4);
        b4.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s3 = b4.asLongBuffer();
        long[] data = new long[d4.length / 8];
        s3.get(data);
        return data;
    }

    private static int[] $d2j$hex$8952c603$decode_I(String src) {
        byte[] d4 = e.c.$d2j$hex$8952c603$decode_B(src);
        ByteBuffer b4 = ByteBuffer.wrap(d4);
        b4.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s3 = b4.asIntBuffer();
        int[] data = new int[d4.length / 4];
        s3.get(data);
        return data;
    }

    private static short[] $d2j$hex$8952c603$decode_S(String src) {
        byte[] d4 = e.c.$d2j$hex$8952c603$decode_B(src);
        ByteBuffer b4 = ByteBuffer.wrap(d4);
        b4.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s3 = b4.asShortBuffer();
        short[] data = new short[d4.length / 2];
        s3.get(data);
        return data;
    }

    private static byte[] $d2j$hex$8952c603$decode_B(String src) {
        char[] d4 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i3 = 0; i3 < ret.length; ++i3) {
            int ll;
            int hh;
            char h4 = d4[2 * i3];
            char l3 = d4[2 * i3 + 1];
            if (h4 >= '0' && h4 <= '9') {
                hh = h4 - 48;
            } else if (h4 >= 'a' && h4 <= 'f') {
                hh = h4 - 97 + 10;
            } else if (h4 >= 'A' && h4 <= 'F') {
                hh = h4 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l3 >= '0' && l3 <= '9') {
                ll = l3 - 48;
            } else if (l3 >= 'a' && l3 <= 'f') {
                ll = l3 - 97 + 10;
            } else if (l3 >= 'A' && l3 <= 'F') {
                ll = l3 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i3] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}

