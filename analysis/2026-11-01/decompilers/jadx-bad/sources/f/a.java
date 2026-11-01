package f;

import luaj.LuaString;
import luaj.LuaValue;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f1551e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f1552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LuaValue f1555d;

    public a() {
        this(64);
    }

    private final void i(int i, int i2) {
        byte[] bArr = this.f1552a;
        if (i != bArr.length) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, this.f1554c, bArr2, i2, this.f1553b);
            this.f1552a = bArr2;
            this.f1554c = i2;
        }
    }

    public final a a(byte b2) {
        h(0, 1);
        byte[] bArr = this.f1552a;
        int i = this.f1554c;
        int i2 = this.f1553b;
        this.f1553b = i2 + 1;
        bArr[i + i2] = b2;
        return this;
    }

    public final a b(String str) {
        byte[] bytes = str.getBytes();
        return e(bytes, 0, bytes.length);
    }

    public final a c(LuaString luaString) {
        int i = luaString.R;
        h(0, i);
        luaString.U2(0, this.f1552a, this.f1554c + this.f1553b, i);
        this.f1553b += i;
        return this;
    }

    public final a d(LuaValue luaValue) {
        c(luaValue.q2());
        return this;
    }

    public final a e(byte[] bArr, int i, int i2) {
        h(0, i2);
        System.arraycopy(bArr, i, this.f1552a, this.f1554c + this.f1553b, i2);
        this.f1553b += i2;
        return this;
    }

    public final a f(int i) {
        int i2;
        int i3;
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException("Code point (" + i + ") out of range [0; 1114111]");
        }
        if (i <= 127) {
            i2 = 1;
            i3 = 0;
        } else if (i <= 2047) {
            i2 = 2;
            i3 = 192;
        } else if (i <= 65535) {
            i2 = 3;
            i3 = 224;
        } else {
            i2 = 4;
            i3 = 240;
        }
        h(0, i2);
        int i4 = this.f1554c + this.f1553b;
        byte[] bArr = this.f1552a;
        for (int i5 = i2 - 1; i5 > 0; i5--) {
            bArr[i4 + i5] = (byte) ((i & 63) | 128);
            i >>= 6;
        }
        bArr[i4] = (byte) (i | i3);
        this.f1553b += i2;
        return this;
    }

    public a g(LuaValue luaValue) {
        return j(luaValue.K0(m()));
    }

    public final void h(int i, int i2) {
        LuaValue luaValue = this.f1555d;
        if (luaValue != null) {
            LuaString luaStringQ2 = luaValue.q2();
            this.f1555d = null;
            int i3 = luaStringQ2.R;
            this.f1553b = i3;
            this.f1554c = i;
            byte[] bArr = new byte[i + i3 + i2];
            this.f1552a = bArr;
            System.arraycopy(luaStringQ2.P, luaStringQ2.Q, bArr, i, i3);
            return;
        }
        int i4 = this.f1554c;
        int i5 = this.f1553b;
        if (i4 + i5 + i2 > this.f1552a.length || i4 < i) {
            int i6 = i + i5 + i2;
            if (i6 < 32) {
                i6 = 32;
            } else if (i6 < i5 * 2) {
                i6 = i5 * 2;
            }
            i(i6, i == 0 ? 0 : (i6 - i5) - i2);
        }
    }

    public a j(LuaValue luaValue) {
        this.f1552a = f1551e;
        this.f1553b = 0;
        this.f1554c = 0;
        this.f1555d = luaValue;
        return this;
    }

    public String k() {
        return m().g0();
    }

    public final LuaString l() {
        i(this.f1553b, 0);
        return LuaString.L2(this.f1552a, this.f1554c, this.f1553b);
    }

    public LuaValue m() {
        LuaValue luaValue = this.f1555d;
        return luaValue != null ? luaValue : l();
    }

    public String toString() {
        return k();
    }

    public a(int i) {
        this.f1552a = new byte[i];
        this.f1553b = 0;
        this.f1554c = 0;
        this.f1555d = null;
    }

    public a(LuaValue luaValue) {
        this.f1552a = f1551e;
        this.f1554c = 0;
        this.f1553b = 0;
        this.f1555d = luaValue;
    }
}
