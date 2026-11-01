/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import luaj.LuaLong;
import luaj.LuaNumber;
import luaj.LuaValue;

public class LuaString
extends LuaValue {
    public static LuaValue U;
    private static final boolean[] V;
    public final byte[] P;
    public final int Q;
    public final int R;
    public final int S;
    private LuaValue T = null;

    static {
        int n3;
        V = new boolean[128];
        for (n3 = 48; n3 <= 57; n3 = (int)((byte)(n3 + 1))) {
            LuaString.V[n3] = true;
        }
        for (n3 = 65; n3 <= 70; n3 = (int)((byte)(n3 + 1))) {
            LuaString.V[n3] = true;
        }
        for (n3 = 97; n3 <= 102; n3 = (int)((byte)(n3 + 1))) {
            LuaString.V[n3] = true;
        }
        boolean[] blArray = V;
        blArray[13] = true;
        blArray[10] = true;
        blArray[9] = true;
        blArray[32] = true;
        blArray[43] = true;
        blArray[45] = true;
        blArray[46] = true;
        blArray[80] = true;
        blArray[112] = true;
        blArray[88] = true;
        blArray[120] = true;
    }

    private LuaString(byte[] byArray, int n3, int n4) {
        this.P = byArray;
        this.Q = n3;
        this.R = n4;
        this.S = LuaString.b3(byArray, n3, n4);
    }

    public static LuaString K2(String object) {
        LuaString luaString = LuaString.Z2((String)object);
        if (luaString != null) {
            return luaString;
        }
        object = ((String)object).getBytes();
        return LuaString.p3((byte[])object, 0, ((Object)object).length);
    }

    public static LuaString L2(byte[] object, int n3, int n4) {
        LuaString[] luaStringArray = LuaString.a3(object, n3, n4);
        if (luaStringArray != null) {
            return luaStringArray;
        }
        if (n4 > 32) {
            return LuaString.m3(object, n3, n4);
        }
        luaStringArray = luaj.LuaString$b.a;
        int n5 = LuaString.b3(object, n3, n4);
        int n6 = n5 & 0x7F;
        LuaString luaString = luaStringArray[n6];
        if (luaString != null && luaString.S == n5 && luaString.S2((byte[])object, n3, n4)) {
            return luaString;
        }
        object = LuaString.m3(object, n3, n4);
        luaStringArray[n6] = object;
        return object;
    }

    private boolean S2(byte[] byArray, int n3, int n4) {
        boolean bl = this.R == n4 && LuaString.X2(this.P, this.Q, byArray, n3, n4);
        return bl;
    }

    public static String V2(byte[] byArray, int n3, int n4) {
        return new String(byArray, n3, n4);
    }

    public static boolean W2(LuaString luaString, int n3, LuaString luaString2, int n4, int n5) {
        return LuaString.X2(luaString.P, luaString.Q + n3, luaString2.P, luaString2.Q + n4, n5);
    }

    public static boolean X2(byte[] byArray, int n3, byte[] byArray2, int n4, int n5) {
        if (byArray.length >= n3 + n5) {
            int n6 = n4;
            int n7 = n5;
            if (byArray2.length >= n4 + n5) {
                while (--n7 >= 0) {
                    if (byArray[n3] != byArray2[n6]) {
                        return false;
                    }
                    ++n3;
                    ++n6;
                }
                return true;
            }
        }
        return false;
    }

    private LuaValue Y2() {
        LuaValue luaValue;
        LuaValue luaValue2 = luaValue = this.T;
        if (luaValue == null) {
            this.T = luaValue2 = this.A2();
        }
        return luaValue2;
    }

    private static LuaString Z2(String string2) {
        int n3 = string2.length();
        if (n3 == 0) {
            return LuaValue.L;
        }
        if (n3 == 1) {
            n3 = string2.charAt(0);
            if (n3 == 48) {
                return LuaValue.M;
            }
            if (n3 == 49) {
                return LuaValue.N;
            }
        }
        return null;
    }

    private static LuaString a3(byte[] byArray, int n3, int n4) {
        if (n4 == 0) {
            return LuaValue.L;
        }
        if (n4 == 1) {
            if ((n3 = byArray[n3]) == 48) {
                return LuaValue.M;
            }
            if (n3 == 49) {
                return LuaValue.N;
            }
        }
        return null;
    }

    public static int b3(byte[] byArray, int n3, int n4) {
        int n5 = (n4 >> 5) + 1;
        int n6 = n4;
        while (n4 >= n5) {
            n6 ^= (n6 << 5) + (n6 >> 2) + (byArray[n3 + n4 - 1] & 0xFF);
            n4 -= n5;
        }
        return n6 >>> 6 | n6 << 26;
    }

    static LuaString i3(String object) {
        object = ((String)object).getBytes();
        return new LuaString((byte[])object, 0, ((Object)object).length);
    }

    private static LuaString m3(byte[] byArray, int n3, int n4) {
        byte[] byArray2 = new byte[n4];
        System.arraycopy(byArray, n3, byArray2, 0, n4);
        return new LuaString(byArray2, 0, n4);
    }

    public static LuaString n3(char[] cArray, int n3, int n4) {
        byte[] byArray = new byte[n4];
        for (int i3 = 0; i3 < n4; ++i3) {
            byArray[i3] = (byte)cArray[i3 + n3];
        }
        return LuaString.p3(byArray, 0, n4);
    }

    public static LuaString o3(byte[] byArray) {
        return LuaString.p3(byArray, 0, byArray.length);
    }

    public static LuaString p3(byte[] object, int n3, int n4) {
        LuaString[] luaStringArray = LuaString.a3(object, n3, n4);
        if (luaStringArray != null) {
            return luaStringArray;
        }
        if (((byte[])object).length > 32) {
            return new LuaString((byte[])object, n3, n4);
        }
        luaStringArray = luaj.LuaString$b.a;
        int n5 = LuaString.b3(object, n3, n4);
        int n6 = n5 & 0x7F;
        LuaString luaString = luaStringArray[n6];
        if (luaString != null && luaString.S == n5 && luaString.S2((byte[])object, n3, n4)) {
            return luaString;
        }
        object = new LuaString((byte[])object, n3, n4);
        luaStringArray[n6] = object;
        return object;
    }

    @Override
    public int A0() {
        LuaValue luaValue = this.Y2();
        int n3 = luaValue.l1() ? super.A0() : luaValue.A0();
        return n3;
    }

    @Override
    public LuaValue A1() {
        LuaValue luaValue = this.Y2();
        luaValue = luaValue.l1() ? super.A1() : luaValue.A1();
        return luaValue;
    }

    @Override
    public LuaValue A2() {
        Object object = this.P;
        int n3 = this.Q;
        int n4 = this.R;
        Object object2 = V;
        for (int i3 = 0; i3 < n4; ++i3) {
            byte by = object[n3 + i3];
            if (by >= 9 && object2[by]) {
                continue;
            }
            return LuaValue.c;
        }
        try {
            object2 = new String;
            object2((byte[])object, n3, n4);
            object = LuaValue.P1((String)object2, LuaValue.c);
            return object;
        }
        catch (Throwable throwable) {
            return LuaValue.c;
        }
    }

    @Override
    public String B0() {
        return this.g0();
    }

    @Override
    public LuaValue B2() {
        return this;
    }

    @Override
    public long C0() {
        LuaValue luaValue = this.Y2();
        long l3 = luaValue.l1() ? super.C0() : luaValue.C0();
        return l3;
    }

    @Override
    public int C2() {
        return 4;
    }

    @Override
    public String D2() {
        return "string";
    }

    @Override
    public LuaNumber E0() {
        LuaValue luaValue = this.Y2();
        luaValue = luaValue.l1() ? super.E0() : luaValue.E0();
        return luaValue;
    }

    @Override
    public LuaNumber F0(String object) {
        LuaValue luaValue = this.Y2();
        object = luaValue.l1() ? super.F0((String)object) : luaValue.F0((String)object);
        return object;
    }

    @Override
    public double F1(double d4) {
        return this.x0();
    }

    @Override
    public LuaString G0() {
        return this;
    }

    @Override
    public int H1(int n3) {
        return this.A0();
    }

    @Override
    public String I1(String string2) {
        return this.g0();
    }

    @Override
    public long J1(long l3) {
        return this.C0();
    }

    @Override
    public LuaValue K0(LuaValue luaValue) {
        return luaValue.M0(this);
    }

    @Override
    public LuaString K1(LuaString luaString) {
        return this;
    }

    @Override
    public LuaValue L0(LuaNumber luaNumber) {
        return this.M0(luaNumber.q2());
    }

    @Override
    public LuaValue M0(LuaString luaString) {
        int n3 = luaString.R;
        int n4 = this.R + n3;
        byte[] byArray = new byte[n4];
        System.arraycopy(luaString.P, luaString.Q, byArray, 0, n3);
        System.arraycopy(this.P, this.Q, byArray, luaString.R, this.R);
        return LuaString.p3(byArray, 0, n4);
    }

    @Override
    public LuaValue O0(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.O0(luaValue) : luaValue2.O0(luaValue);
        return luaValue;
    }

    @Override
    public boolean P0(LuaValue luaValue) {
        return luaValue.S1(this);
    }

    @Override
    public LuaValue Q1(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.Q1(luaValue) : luaValue2.Q1(luaValue);
        return luaValue;
    }

    @Override
    public boolean S1(LuaString luaString) {
        if (this == luaString) {
            return true;
        }
        if (luaString.R != this.R) {
            return false;
        }
        if (luaString.P == this.P && luaString.Q == this.Q) {
            return true;
        }
        if (luaString.hashCode() != this.hashCode()) {
            return false;
        }
        for (int i3 = 0; i3 < this.R; ++i3) {
            if (luaString.P[luaString.Q + i3] == this.P[this.Q + i3]) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean T1(LuaValue luaValue) {
        return luaValue.S1(this);
    }

    public int T2(int n3) {
        if (n3 >= 0 && n3 < this.R) {
            return this.g3(n3);
        }
        throw new IndexOutOfBoundsException();
    }

    public void U2(int n3, byte[] byArray, int n4, int n5) {
        System.arraycopy(this.P, this.Q + n3, byArray, n4, n5);
    }

    @Override
    public LuaValue V0() {
        return U;
    }

    @Override
    public int W1() {
        return this.R;
    }

    @Override
    public boolean X0(LuaValue luaValue) {
        boolean bl = luaValue.n1() ? luaValue.o2(this) < 0 : super.X0(luaValue);
        return bl;
    }

    @Override
    public boolean Y0(LuaValue luaValue) {
        boolean bl = luaValue.n1() ? luaValue.o2(this) <= 0 : super.Y0(luaValue);
        return bl;
    }

    @Override
    public LuaValue Z0(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.Z0(luaValue) : luaValue2.Z0(luaValue);
        return luaValue;
    }

    public int c3(byte by, int n3) {
        while (n3 < this.R) {
            if (this.P[this.Q + n3] == by) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public int d3(LuaString luaString, int n3) {
        int n4 = luaString.s1();
        int n5 = this.R;
        while (n3 <= n5 - n4) {
            if (LuaString.X2(this.P, this.Q + n3, luaString.P, luaString.Q, n4)) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public int e3(LuaString luaString) {
        int n3;
        int n4 = this.Q;
        int n5 = this.R;
        int n6 = luaString.Q;
        int n7 = luaString.R;
        int n8 = n4;
        while ((n3 = n8) < n5 + n4) {
            for (n8 = luaString.Q; n8 < n6 + n7; ++n8) {
                if (this.P[n3] != luaString.P[n8]) continue;
                return n3 - this.Q;
            }
            n8 = n3 + 1;
        }
        return -1;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof LuaString) {
            return this.S1((LuaString)object);
        }
        return false;
    }

    public boolean f3() {
        byte[] byArray = this.P;
        int n3 = this.Q;
        int n4 = this.R + n3;
        while (n3 < n4) {
            int n5 = n3 + 1;
            byte by = byArray[n3];
            if (by >= 0) {
                n3 = n5;
                continue;
            }
            int n6 = n5;
            if ((by & 0xE0) == 192) {
                n6 = n5;
                if (n5 < n4) {
                    n3 += 2;
                    if ((byArray[n5] & 0xC0) == 128) continue;
                    n6 = n3;
                }
            }
            n3 = n6;
            if ((by & 0xF0) == 224) {
                n5 = n6 + 1;
                n3 = n6;
                if (n5 < n4) {
                    if ((byArray[n6] & 0xC0) == 128) {
                        n3 = n6 += 2;
                        if ((byArray[n5] & 0xC0) == 128) {
                            n3 = n6;
                            continue;
                        }
                    } else {
                        n3 = n5;
                    }
                }
            }
            if ((by & 0xF8) == 240 && n3 + 2 < n4 && (byArray[n3] & 0xC0) == 128 && (byArray[n3 + 1] & 0xC0) == 128) {
                n6 = n3 + 3;
                if ((byArray[n3 + 2] & 0xC0) == 128) {
                    n3 = n6;
                    continue;
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public String g0() {
        return LuaString.V2(this.P, this.Q, this.R);
    }

    public int g3(int n3) {
        return this.P[this.Q + n3] & 0xFF;
    }

    @Override
    public boolean h1() {
        return this.Y2().h1();
    }

    public LuaString h3() {
        return new DeprecatedLuaString(this.P, this.Q, this.R);
    }

    public int hashCode() {
        return this.S;
    }

    @Override
    public LuaValue j0(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.j0(luaValue) : luaValue2.j0(luaValue);
        return luaValue;
    }

    @Override
    public boolean j1() {
        return this.Y2().j1();
    }

    public LuaString j3(int n3, int n4) {
        int n5 = this.Q + n3;
        LuaString luaString = (n3 = n4 - n3) >= this.R / 2 ? LuaString.p3(this.P, n5, n3) : LuaString.L2(this.P, n5, n3);
        return luaString;
    }

    @Override
    public boolean k1() {
        return this.Y2().k1();
    }

    public InputStream k3() {
        return new ByteArrayInputStream(this.P, this.Q, this.R);
    }

    public LuaValue l3(int n3) {
        byte by;
        int n4;
        int n5;
        int n6;
        int n7;
        byte[] byArray;
        block15: {
            block14: {
                byArray = this.P;
                n7 = this.Q;
                n6 = this.R + n7;
                while (true) {
                    n5 = n6;
                    if (n7 >= n6) break;
                    n4 = byArray[n7];
                    n5 = n6;
                    if (n4 > 32) break;
                    n5 = n6;
                    if (n4 <= 0) break;
                    ++n7;
                }
                while (n7 < n5 && (n6 = byArray[n5 - 1]) <= 32 && n6 > 0) {
                    --n5;
                }
                if (n7 == n5) {
                    return LuaValue.c;
                }
                by = byArray[n7];
                if (by == 45) break block14;
                n6 = n7;
                if (by != 43) break block15;
            }
            n6 = n7 + 1;
        }
        if (n6 == n5) {
            return LuaValue.c;
        }
        long l3 = n3;
        long l4 = Long.MIN_VALUE / l3;
        long l5 = 0L;
        while (n6 < n5) {
            byte by2 = byArray[n6];
            n7 = n4 = 48;
            if (n3 > 10) {
                n7 = by2 >= 48 && by2 <= 57 ? n4 : (by2 >= 65 && by2 <= 90 ? 55 : 87);
            }
            if ((n7 = by2 - n7) >= 0 && n7 < n3) {
                if (l4 > l5) {
                    return LuaValue.c;
                }
                long l6 = l5 * l3 - (long)n7;
                if (l6 > l5) {
                    return LuaValue.c;
                }
                l5 = l6;
                ++n6;
                continue;
            }
            return LuaValue.c;
        }
        l3 = l5;
        if (by != 45) {
            l3 = l5 = -l5;
            if (l5 < 0L) {
                return LuaValue.c;
            }
        }
        return LuaLong.I2(l3);
    }

    @Override
    public boolean m1() {
        return this.Y2().m1();
    }

    @Override
    public LuaValue m2(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.m2(luaValue) : luaValue2.m2(luaValue);
        return luaValue;
    }

    @Override
    public boolean n1() {
        return true;
    }

    @Override
    public LuaValue n2(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.n2(luaValue) : luaValue2.n2(luaValue);
        return luaValue;
    }

    @Override
    public LuaValue o0(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.o0(luaValue) : luaValue2.o0(luaValue);
        return luaValue;
    }

    @Override
    public int o2(LuaString luaString) {
        int n3;
        int n4 = 0;
        for (int i3 = 0; n4 < (n3 = this.R) && i3 < luaString.R; ++n4, ++i3) {
            byte[] byArray = this.P;
            int n5 = this.Q;
            n3 = byArray[n5 + n4];
            byte[] byArray2 = luaString.P;
            int n6 = luaString.Q;
            if (n3 == byArray2[n6 + i3]) continue;
            return byArray[n5 + n4] - byArray2[n6 + i3];
        }
        return n3 - luaString.R;
    }

    @Override
    public LuaValue q0() {
        LuaValue luaValue = this.Y2();
        luaValue = luaValue.l1() ? super.q0() : luaValue.q0();
        return luaValue;
    }

    @Override
    public LuaString q2() {
        return this;
    }

    public void q3(DataOutputStream dataOutputStream, int n3, int n4) {
        dataOutputStream.write(this.P, this.Q + n3, n4);
    }

    @Override
    public LuaValue r0(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.r0(luaValue) : luaValue2.r0(luaValue);
        return luaValue;
    }

    @Override
    public LuaValue r1() {
        return LuaLong.I2(this.R);
    }

    @Override
    public LuaValue r2(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.r2(luaValue) : luaValue2.r2(luaValue);
        return luaValue;
    }

    @Override
    public int s1() {
        return this.R;
    }

    @Override
    public LuaValue t0(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.t0(luaValue) : luaValue2.t0(luaValue);
        return luaValue;
    }

    @Override
    public boolean u1(LuaValue luaValue) {
        boolean bl = luaValue.n1() ? luaValue.o2(this) > 0 : super.u1(luaValue);
        return bl;
    }

    @Override
    public boolean v1(LuaValue luaValue) {
        boolean bl = luaValue.n1() ? luaValue.o2(this) >= 0 : super.v1(luaValue);
        return bl;
    }

    @Override
    public double x0() {
        LuaValue luaValue = this.Y2();
        double d4 = luaValue.l1() ? super.x0() : luaValue.x0();
        return d4;
    }

    @Override
    public double x2() {
        return this.Y2().x2();
    }

    @Override
    public LuaValue y1(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.y1(luaValue) : luaValue2.y1(luaValue);
        return luaValue;
    }

    @Override
    public int y2() {
        return this.Y2().y2();
    }

    @Override
    public LuaValue z1(LuaValue luaValue) {
        LuaValue luaValue2 = this.Y2();
        luaValue = luaValue2.l1() ? super.z1(luaValue) : luaValue2.z1(luaValue);
        return luaValue;
    }

    @Override
    public long z2() {
        return this.Y2().z2();
    }

    private static class DeprecatedLuaString
    extends LuaString {
        public DeprecatedLuaString(byte[] byArray, int n3, int n4) {
            super(byArray, n3, n4);
        }

        @Override
        public boolean d1() {
            return true;
        }
    }

    private static final abstract class b {
        static final LuaString[] a = new LuaString[128];
    }
}

