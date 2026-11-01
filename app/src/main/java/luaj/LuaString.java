package luaj;

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class LuaString extends LuaValue {
    public static LuaValue U;
    private static final boolean[] V = new boolean[128];
    public final byte[] P;
    public final int Q;
    public final int R;
    public final int S;
    private LuaValue T;

    private static class DeprecatedLuaString extends LuaString {
        public DeprecatedLuaString(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }

        @Override // luaj.LuaValue
        public boolean d1() {
            return true;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final LuaString[] f1647a = new LuaString[128];
    }

    static {
        for (byte b2 = 48; b2 <= 57; b2 = (byte) (b2 + 1)) {
            V[b2] = true;
        }
        for (byte b3 = 65; b3 <= 70; b3 = (byte) (b3 + 1)) {
            V[b3] = true;
        }
        for (byte b4 = 97; b4 <= 102; b4 = (byte) (b4 + 1)) {
            V[b4] = true;
        }
        boolean[] zArr = V;
        zArr[13] = true;
        zArr[10] = true;
        zArr[9] = true;
        zArr[32] = true;
        zArr[43] = true;
        zArr[45] = true;
        zArr[46] = true;
        zArr[80] = true;
        zArr[112] = true;
        zArr[88] = true;
        zArr[120] = true;
    }

    private LuaString(byte[] bArr, int i, int i2) {
        this.T = null;
        this.P = bArr;
        this.Q = i;
        this.R = i2;
        this.S = b3(bArr, i, i2);
    }

    public static LuaString K2(String str) {
        LuaString luaStringZ2 = Z2(str);
        if (luaStringZ2 != null) {
            return luaStringZ2;
        }
        byte[] bytes = str.getBytes();
        return p3(bytes, 0, bytes.length);
    }

    public static LuaString L2(byte[] bArr, int i, int i2) {
        LuaString luaStringA3 = a3(bArr, i, i2);
        if (luaStringA3 != null) {
            return luaStringA3;
        }
        if (i2 > 32) {
            return m3(bArr, i, i2);
        }
        int iB3 = b3(bArr, i, i2);
        int i3 = iB3 & 127;
        LuaString[] luaStringArr = b.f1647a;
        LuaString luaString = luaStringArr[i3];
        if (luaString != null && luaString.S == iB3 && luaString.S2(bArr, i, i2)) {
            return luaString;
        }
        LuaString luaStringM3 = m3(bArr, i, i2);
        luaStringArr[i3] = luaStringM3;
        return luaStringM3;
    }

    private boolean S2(byte[] bArr, int i, int i2) {
        return this.R == i2 && X2(this.P, this.Q, bArr, i, i2);
    }

    public static String V2(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2);
    }

    public static boolean W2(LuaString luaString, int i, LuaString luaString2, int i2, int i3) {
        return X2(luaString.P, luaString.Q + i, luaString2.P, luaString2.Q + i2, i3);
    }

    public static boolean X2(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length < i + i3 || bArr2.length < i2 + i3) {
            return false;
        }
        while (true) {
            i3--;
            if (i3 < 0) {
                return true;
            }
            int i4 = i + 1;
            int i5 = i2 + 1;
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i = i4;
            i2 = i5;
        }
    }

    private LuaValue Y2() {
        LuaValue luaValue = this.T;
        if (luaValue != null) {
            return luaValue;
        }
        LuaValue luaValueA2 = A2();
        this.T = luaValueA2;
        return luaValueA2;
    }

    private static LuaString Z2(String str) {
        int length = str.length();
        if (length == 0) {
            return LuaValue.L;
        }
        if (length != 1) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '0') {
            return LuaValue.M;
        }
        if (cCharAt == '1') {
            return LuaValue.N;
        }
        return null;
    }

    private static LuaString a3(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return LuaValue.L;
        }
        if (i2 != 1) {
            return null;
        }
        byte b2 = bArr[i];
        if (b2 == 48) {
            return LuaValue.M;
        }
        if (b2 == 49) {
            return LuaValue.N;
        }
        return null;
    }

    public static int b3(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 5) + 1;
        int i4 = i2;
        while (i2 >= i3) {
            i4 ^= ((i4 << 5) + (i4 >> 2)) + (bArr[(i + i2) - 1] & 255);
            i2 -= i3;
        }
        return (i4 >>> 6) | (i4 << 26);
    }

    static LuaString i3(String str) {
        byte[] bytes = str.getBytes();
        return new LuaString(bytes, 0, bytes.length);
    }

    private static LuaString m3(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new LuaString(bArr2, 0, i2);
    }

    public static LuaString n3(char[] cArr, int i, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) cArr[i3 + i];
        }
        return p3(bArr, 0, i2);
    }

    public static LuaString o3(byte[] bArr) {
        return p3(bArr, 0, bArr.length);
    }

    public static LuaString p3(byte[] bArr, int i, int i2) {
        LuaString luaStringA3 = a3(bArr, i, i2);
        if (luaStringA3 != null) {
            return luaStringA3;
        }
        if (bArr.length > 32) {
            return new LuaString(bArr, i, i2);
        }
        int iB3 = b3(bArr, i, i2);
        int i3 = iB3 & 127;
        LuaString[] luaStringArr = b.f1647a;
        LuaString luaString = luaStringArr[i3];
        if (luaString != null && luaString.S == iB3 && luaString.S2(bArr, i, i2)) {
            return luaString;
        }
        LuaString luaString2 = new LuaString(bArr, i, i2);
        luaStringArr[i3] = luaString2;
        return luaString2;
    }

    @Override // luaj.LuaValue
    public int A0() {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.A0() : luaValueY2.A0();
    }

    @Override // luaj.LuaValue
    public LuaValue A1() {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.A1() : luaValueY2.A1();
    }

    @Override // luaj.LuaValue
    public LuaValue A2() {
        byte[] bArr = this.P;
        int i = this.Q;
        int i2 = this.R;
        boolean[] zArr = V;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = bArr[i + i3];
            if (b2 < 9 || !zArr[b2]) {
                return LuaValue.f1673c;
            }
        }
        try {
            return LuaValue.P1(new String(bArr, i, i2), LuaValue.f1673c);
        } catch (Throwable unused) {
            return LuaValue.f1673c;
        }
    }

    @Override // luaj.LuaValue
    public String B0() {
        return g0();
    }

    @Override // luaj.LuaValue
    public LuaValue B2() {
        return this;
    }

    @Override // luaj.LuaValue
    public long C0() {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.C0() : luaValueY2.C0();
    }

    @Override // luaj.LuaValue
    public int C2() {
        return 4;
    }

    @Override // luaj.LuaValue
    public String D2() {
        return "string";
    }

    @Override // luaj.LuaValue
    public LuaNumber E0() {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.E0() : luaValueY2.E0();
    }

    @Override // luaj.LuaValue
    public LuaNumber F0(String str) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.F0(str) : luaValueY2.F0(str);
    }

    @Override // luaj.LuaValue
    public double F1(double d2) {
        return x0();
    }

    @Override // luaj.LuaValue
    public LuaString G0() {
        return this;
    }

    @Override // luaj.LuaValue
    public int H1(int i) {
        return A0();
    }

    @Override // luaj.LuaValue
    public String I1(String str) {
        return g0();
    }

    @Override // luaj.LuaValue
    public long J1(long j) {
        return C0();
    }

    @Override // luaj.LuaValue
    public LuaValue K0(LuaValue luaValue) {
        return luaValue.M0(this);
    }

    @Override // luaj.LuaValue
    public LuaString K1(LuaString luaString) {
        return this;
    }

    @Override // luaj.LuaValue
    public LuaValue L0(LuaNumber luaNumber) {
        return M0(luaNumber.q2());
    }

    @Override // luaj.LuaValue
    public LuaValue M0(LuaString luaString) {
        int i = luaString.R;
        int i2 = this.R + i;
        byte[] bArr = new byte[i2];
        System.arraycopy(luaString.P, luaString.Q, bArr, 0, i);
        System.arraycopy(this.P, this.Q, bArr, luaString.R, this.R);
        return p3(bArr, 0, i2);
    }

    @Override // luaj.LuaValue
    public LuaValue O0(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.O0(luaValue) : luaValueY2.O0(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean P0(LuaValue luaValue) {
        return luaValue.S1(this);
    }

    @Override // luaj.LuaValue
    public LuaValue Q1(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.Q1(luaValue) : luaValueY2.Q1(luaValue);
    }

    @Override // luaj.LuaValue
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
        if (luaString.hashCode() != hashCode()) {
            return false;
        }
        for (int i = 0; i < this.R; i++) {
            if (luaString.P[luaString.Q + i] != this.P[this.Q + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // luaj.LuaValue
    public boolean T1(LuaValue luaValue) {
        return luaValue.S1(this);
    }

    public int T2(int i) {
        if (i < 0 || i >= this.R) {
            throw new IndexOutOfBoundsException();
        }
        return g3(i);
    }

    public void U2(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.P, this.Q + i, bArr, i2, i3);
    }

    @Override // luaj.LuaValue
    public LuaValue V0() {
        return U;
    }

    @Override // luaj.LuaValue
    public int W1() {
        return this.R;
    }

    @Override // luaj.LuaValue
    public boolean X0(LuaValue luaValue) {
        if (luaValue.n1()) {
            return luaValue.o2(this) < 0;
        }
        return super.X0(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean Y0(LuaValue luaValue) {
        if (luaValue.n1()) {
            return luaValue.o2(this) <= 0;
        }
        return super.Y0(luaValue);
    }

    @Override // luaj.LuaValue
    public LuaValue Z0(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.Z0(luaValue) : luaValueY2.Z0(luaValue);
    }

    public int c3(byte b2, int i) {
        while (i < this.R) {
            if (this.P[this.Q + i] == b2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int d3(LuaString luaString, int i) {
        int iS1 = luaString.s1();
        int i2 = this.R - iS1;
        while (i <= i2) {
            if (X2(this.P, this.Q + i, luaString.P, luaString.Q, iS1)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int e3(LuaString luaString) {
        int i = this.Q;
        int i2 = this.R + i;
        int i3 = luaString.Q + luaString.R;
        while (i < i2) {
            for (int i4 = luaString.Q; i4 < i3; i4++) {
                if (this.P[i] == luaString.P[i4]) {
                    return i - this.Q;
                }
            }
            i++;
        }
        return -1;
    }

    @Override // luaj.LuaValue
    public boolean equals(Object obj) {
        if (obj instanceof LuaString) {
            return S1((LuaString) obj);
        }
        return false;
    }

    public boolean f3() {
        int i;
        byte[] bArr = this.P;
        int i2 = this.Q;
        int i3 = this.R + i2;
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 & 224) == 192 && i4 < i3) {
                    i2 += 2;
                    if ((bArr[i4] & 192) == 128) {
                        continue;
                    } else {
                        i4 = i2;
                    }
                }
                if ((b2 & 240) == 224 && (i = i4 + 1) < i3) {
                    if ((bArr[i4] & 192) == 128) {
                        i4 += 2;
                        if ((bArr[i] & 192) == 128) {
                        }
                    } else {
                        i4 = i;
                    }
                }
                if ((b2 & 248) != 240 || i4 + 2 >= i3) {
                    return false;
                }
                int i5 = i4 + 1;
                if ((bArr[i4] & 192) != 128) {
                    return false;
                }
                int i6 = i4 + 2;
                if ((bArr[i5] & 192) != 128) {
                    return false;
                }
                i2 = i4 + 3;
                if ((bArr[i6] & 192) != 128) {
                    return false;
                }
            }
            i2 = i4;
        }
        return true;
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String g0() {
        return V2(this.P, this.Q, this.R);
    }

    public int g3(int i) {
        return this.P[this.Q + i] & 255;
    }

    @Override // luaj.LuaValue
    public boolean h1() {
        return Y2().h1();
    }

    public LuaString h3() {
        return new DeprecatedLuaString(this.P, this.Q, this.R);
    }

    public int hashCode() {
        return this.S;
    }

    @Override // luaj.LuaValue
    public LuaValue j0(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.j0(luaValue) : luaValueY2.j0(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean j1() {
        return Y2().j1();
    }

    public LuaString j3(int i, int i2) {
        int i3 = this.Q + i;
        int i4 = i2 - i;
        return i4 >= this.R / 2 ? p3(this.P, i3, i4) : L2(this.P, i3, i4);
    }

    @Override // luaj.LuaValue
    public boolean k1() {
        return Y2().k1();
    }

    public InputStream k3() {
        return new ByteArrayInputStream(this.P, this.Q, this.R);
    }

    public LuaValue l3(int i) {
        byte b2;
        byte[] bArr = this.P;
        int i2 = this.Q;
        int i3 = this.R + i2;
        while (i2 < i3 && (b2 = bArr[i2]) <= 32 && b2 > 0) {
            i2++;
        }
        while (i2 < i3) {
            byte b3 = bArr[i3 - 1];
            if (b3 > 32 || b3 <= 0) {
                break;
            }
            i3--;
        }
        if (i2 == i3) {
            return LuaValue.f1673c;
        }
        byte b4 = bArr[i2];
        if (b4 == 45 || b4 == 43) {
            i2++;
        }
        if (i2 == i3) {
            return LuaValue.f1673c;
        }
        long j = i;
        long j2 = Long.MIN_VALUE / j;
        long j3 = 0;
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b5 = bArr[i2];
            byte b6 = 48;
            if (i > 10 && (b5 < 48 || b5 > 57)) {
                b6 = (b5 < 65 || b5 > 90) ? (byte) 87 : (byte) 55;
            }
            int i5 = b5 - b6;
            if (i5 < 0 || i5 >= i) {
                return LuaValue.f1673c;
            }
            if (j2 > j3) {
                return LuaValue.f1673c;
            }
            long j4 = j;
            long j5 = (j3 * j) - ((long) i5);
            if (j5 > j3) {
                return LuaValue.f1673c;
            }
            j3 = j5;
            i2 = i4;
            j = j4;
        }
        if (b4 != 45) {
            j3 = -j3;
            if (j3 < 0) {
                return LuaValue.f1673c;
            }
        }
        return LuaLong.I2(j3);
    }

    @Override // luaj.LuaValue
    public boolean m1() {
        return Y2().m1();
    }

    @Override // luaj.LuaValue
    public LuaValue m2(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.m2(luaValue) : luaValueY2.m2(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean n1() {
        return true;
    }

    @Override // luaj.LuaValue
    public LuaValue n2(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.n2(luaValue) : luaValueY2.n2(luaValue);
    }

    @Override // luaj.LuaValue
    public LuaValue o0(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.o0(luaValue) : luaValueY2.o0(luaValue);
    }

    @Override // luaj.LuaValue
    public int o2(LuaString luaString) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.R;
            if (i2 >= i || i3 >= luaString.R) {
                break;
            }
            byte[] bArr = this.P;
            int i4 = this.Q;
            byte b2 = bArr[i4 + i2];
            byte[] bArr2 = luaString.P;
            int i5 = luaString.Q;
            if (b2 != bArr2[i5 + i3]) {
                return bArr[i4 + i2] - bArr2[i5 + i3];
            }
            i2++;
            i3++;
        }
        return i - luaString.R;
    }

    @Override // luaj.LuaValue
    public LuaValue q0() {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.q0() : luaValueY2.q0();
    }

    @Override // luaj.LuaValue
    public LuaString q2() {
        return this;
    }

    public void q3(DataOutputStream dataOutputStream, int i, int i2) throws IOException {
        dataOutputStream.write(this.P, this.Q + i, i2);
    }

    @Override // luaj.LuaValue
    public LuaValue r0(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.r0(luaValue) : luaValueY2.r0(luaValue);
    }

    @Override // luaj.LuaValue
    public LuaValue r1() {
        return LuaLong.I2(this.R);
    }

    @Override // luaj.LuaValue
    public LuaValue r2(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.r2(luaValue) : luaValueY2.r2(luaValue);
    }

    @Override // luaj.LuaValue
    public int s1() {
        return this.R;
    }

    @Override // luaj.LuaValue
    public LuaValue t0(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.t0(luaValue) : luaValueY2.t0(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean u1(LuaValue luaValue) {
        if (luaValue.n1()) {
            return luaValue.o2(this) > 0;
        }
        return super.u1(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean v1(LuaValue luaValue) {
        if (luaValue.n1()) {
            return luaValue.o2(this) >= 0;
        }
        return super.v1(luaValue);
    }

    @Override // luaj.LuaValue
    public double x0() {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.x0() : luaValueY2.x0();
    }

    @Override // luaj.LuaValue
    public double x2() {
        return Y2().x2();
    }

    @Override // luaj.LuaValue
    public LuaValue y1(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.y1(luaValue) : luaValueY2.y1(luaValue);
    }

    @Override // luaj.LuaValue
    public int y2() {
        return Y2().y2();
    }

    @Override // luaj.LuaValue
    public LuaValue z1(LuaValue luaValue) {
        LuaValue luaValueY2 = Y2();
        return luaValueY2.l1() ? super.z1(luaValue) : luaValueY2.z1(luaValue);
    }

    @Override // luaj.LuaValue
    public long z2() {
        return Y2().z2();
    }
}
