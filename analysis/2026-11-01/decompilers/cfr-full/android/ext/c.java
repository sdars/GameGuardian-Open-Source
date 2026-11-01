/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.e;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b0;
import android.ext.b2;
import android.ext.e1;
import android.ext.i0;
import android.ext.k;
import android.ext.n;
import android.ext.t1;
import android.ext.t2;
import android.util.SparseIntArray;

public class c {
    public static final long[] d = new long[]{0L, 255L, 65535L, 0xFFFFFFL, 0xFFFFFFFFL, 0xFFFFFFFFFFL, 0xFFFFFFFFFFFFL, 0xFFFFFFFFFFFFFFL, -1L};
    private static e e = null;
    private static e f = null;
    private static e g = null;
    private static e h = null;
    private static SparseIntArray i = null;
    private static int j = 0xFFFFFF;
    private static final int[] k;
    public long a;
    public long b;
    public int c;

    static {
        Object object = t1.k();
        e e4 = new e();
        e e5 = new e();
        android.ext.c.U(e4, e5, 1, "B: %s (%,d - %,d)", 2131297028, object[0], object[1]);
        android.ext.c.U(e4, e5, 2, "W: %s (%,d - %,d)", 2131297043, object[2], object[3]);
        android.ext.c.U(e4, e5, 4, "D: %s (%,d - %,d)", 2131297034, object[4], object[5]);
        android.ext.c.U(e4, e5, 8, "X: %s (%,d - %,d)", 2131297045, object[4], object[5]);
        android.ext.c.U(e4, e5, 16, "F: %s (%.1e - %.1e)", 2131297037, Float.valueOf(-3.4028235E38f), Float.valueOf(Float.MAX_VALUE));
        android.ext.c.U(e4, e5, 32, "Q: %s (%,d - %,d)", 2131297039, object[6], object[7]);
        android.ext.c.U(e4, e5, 64, "E: %s (%.1e - %.1e)", 2131297031, -1.7976931348623157E308, Double.MAX_VALUE);
        f = e5;
        e = e4;
        android.ext.c.updateLocale();
        object = new e();
        object.append(0x20000000, (Object)"=");
        object.append(0x4000000, (Object)"≥");
        object.append(0x8000000, (Object)"≤");
        object.append(0x10000000, (Object)"≠");
        g = object;
        object = new e();
        object.append(0x20000000, (Object)"=");
        object.append(0x10000000, (Object)"≠");
        h = object;
        android.ext.k.h(c.class);
        k = new int[]{8, 32, 1, 2, 64, 16, 4};
    }

    protected c() {
    }

    public c(long l3, long l4, int n3) {
        this.a = l3;
        this.b = l4;
        this.c = n3;
    }

    public c(c c4) {
        this(c4.a, c4.b, c4.c);
    }

    public static CharSequence A(int n3) {
        return android.ext.c.t(n3 & 0x7F).toString().substring(0, 1).intern();
    }

    public static e B() {
        return g;
    }

    public static e C() {
        return h;
    }

    public static int E(int n3) {
        if ((n3 & 0x60) != 0) {
            return 8;
        }
        if ((n3 & 0x1C) != 0) {
            return 4;
        }
        if ((n3 & 2) != 0) {
            return 2;
        }
        if ((n3 & 1) != 0) {
            return 1;
        }
        return 8;
    }

    public static String G(long l3, int n3) {
        return t2.e(8, android.ext.c.j(l3, n3));
    }

    public static String I(long l3, long l4, int n3) {
        String string2 = null;
        if ((n3 &= 0x7F) != 8) {
            if (n3 != 16) {
                if (n3 == 64 || n3 == 80) {
                    string2 = b0.b(l4);
                }
            } else {
                string2 = b0.e(l4);
            }
        } else {
            l4 ^= l3;
        }
        String string3 = string2;
        if (string2 == null) {
            string3 = i0.c(l4, n3);
        }
        return string3;
    }

    public static String K(long l3, long l4, int n3) {
        return android.ext.c.I(l3, l4, n3).trim();
    }

    public static String M(long l3, long l4, int n3) {
        return android.ext.c.N(l3, l4, n3, false);
    }

    private static String N(long l3, long l4, int n3, boolean bl) {
        int n4;
        block2: {
            n4 = n3 & 0x7F;
            long l5 = l4;
            if (n4 == 8) {
                l5 = l4 ^ l3;
            }
            l3 = l5;
            if (!bl) break block2;
            n3 = android.ext.c.E(n4);
            l3 = Long.reverseBytes(l5);
            int n5 = n3 * 8;
            l3 >>= 64 - n5;
            if (n3 != 8) {
                l3 &= (1L << n5) - 1L;
            }
        }
        return i0.d(l3, n4, true);
    }

    public static String P(long l3, long l4, int n3) {
        return android.ext.c.N(l3, l4, n3, true);
    }

    public static int R(int n3) {
        block0: {
            int n4 = 127;
            if ((n3 &= 0x7F) == 0 || n3 == 1 || n3 == 2 || n3 == 4 || n3 == 8 || n3 == 16 || n3 == 32 || n3 == 64 || n3 == 127) break block0;
            n3 = n4;
        }
        return n3;
    }

    public static int S(long l3, boolean bl) {
        return android.ext.c.T(l3, bl, null);
    }

    public static int T(long l3, boolean bl, SparseIntArray sparseIntArray) {
        int n3;
        long l4 = (3L & l3) - 0L;
        long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l5 == false) {
            if (bl) {
                return 32;
            }
            if (sparseIntArray != null) {
                sparseIntArray.put(32, sparseIntArray.get(32) + 1);
                sparseIntArray.put(64, sparseIntArray.get(64) + 1);
            }
            n3 = 96;
        } else {
            n3 = 0;
        }
        int n4 = n3;
        if (l5 == false) {
            if (bl) {
                return 4;
            }
            n4 = n3 |= 0x1C;
            if (sparseIntArray != null) {
                sparseIntArray.put(4, sparseIntArray.get(4) + 1);
                sparseIntArray.put(8, sparseIntArray.get(8) + 1);
                sparseIntArray.put(16, sparseIntArray.get(16) + 1);
                n4 = n3;
            }
        }
        n3 = n4;
        if ((l3 & 1L) == 0L) {
            if (bl) {
                return 2;
            }
            n3 = n4 |= 2;
            if (sparseIntArray != null) {
                sparseIntArray.put(2, sparseIntArray.get(2) + 1);
                n3 = n4;
            }
        }
        if (sparseIntArray != null) {
            sparseIntArray.put(1, sparseIntArray.get(1) + 1);
        }
        return n3 | 1;
    }

    private static void U(e e4, e e5, int n3, String string2, int n4, Object object, Object object2) {
        String string3 = b2.f(n4);
        n4 = android.ext.c.n(n3);
        e4.append(n3, Tools.t(Tools.L1(string2, string3, object, object2), n4));
        e5.append(n3, Tools.t(string3, n4));
    }

    public static t1.b W(t1.b b4, String object, int n3, int n4, long l3) {
        try {
            b4 = t1.p(b4, (String)object, n3, true, l3);
            return b4;
        }
        catch (NumberFormatException numberFormatException) {
            String string2 = b2.f(n4);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed parse '");
            stringBuilder.append((String)object);
            stringBuilder.append("' as ");
            stringBuilder.append(n3);
            stringBuilder.append(" on '");
            stringBuilder.append(string2);
            stringBuilder.append('\'');
            e1.s(stringBuilder.toString(), numberFormatException);
            if (!(numberFormatException instanceof t1.a) && !(numberFormatException instanceof n.b)) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(": ");
                ((StringBuilder)object).append(numberFormatException.getMessage());
                object = new NumberFormatException(((StringBuilder)object).toString());
                ((Throwable)object).initCause(numberFormatException);
                throw object;
            }
            throw numberFormatException;
        }
    }

    public static long d(t1.b b4, String string2, int n3) {
        return android.ext.c.W((t1.b)b4, (String)string2, (int)(n3 & 0x7F), (int)2131296829, (long)0L).a;
    }

    public static long e(long l3, String string2, int n3) {
        long l4;
        long l5 = l4 = android.ext.c.W(null, (String)string2, (int)(n3 &= 0x7F), (int)2131296829, (long)l3).a;
        if (n3 == 8) {
            l5 = l4 ^ l3;
        }
        return l5;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int g(int n3, long l3, boolean bl) {
        int n4 = n3;
        if (n3 == 80) return n4;
        if (n3 == 64) {
            return n3;
        }
        n4 = 1;
        int n5 = 1;
        if (bl) {
            if (l3 >> 7 == -1L) {
                n5 = 0;
            }
            n4 = n5;
            if (l3 >> 15 != -1L) {
                n4 = n5 | 2;
            }
            n5 = n4;
            if (l3 >> 31 == -1L) return n3 & ~n5;
        } else {
            n5 = l3 >> 8 != 0L ? n4 : 0;
            n4 = n5;
            if (l3 >> 16 != 0L) {
                n4 = n5 | 2;
            }
            n5 = n4;
            if (l3 >> 32 == 0L) return n3 & ~n5;
        }
        n5 = n4 | 0xC;
        return n3 & ~n5;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static long h(long l3, int n3) {
        long l4;
        block4: {
            int n4;
            block5: {
                block1: {
                    block2: {
                        block3: {
                            n4 = n3 & 0x7F;
                            if (n4 == 1) break block1;
                            if (n4 == 2) break block2;
                            if (n4 == 4 || n4 == 8) break block3;
                            l4 = l3;
                            break block4;
                        }
                        n4 = (int)l3;
                        break block5;
                    }
                    n4 = (short)l3;
                    break block5;
                }
                n4 = (byte)l3;
            }
            l4 = n4;
        }
        if (l3 != l4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fixValue[");
            stringBuilder.append(n3);
            stringBuilder.append(", ");
            stringBuilder.append(Integer.toHexString(n3));
            stringBuilder.append("]: ");
            stringBuilder.append(l3);
            stringBuilder.append('[');
            stringBuilder.append(Long.toHexString(l3));
            stringBuilder.append("] -> ");
            stringBuilder.append(l4);
            stringBuilder.append('[');
            stringBuilder.append(Long.toHexString(l4));
            stringBuilder.append(']');
            e1.d(stringBuilder.toString());
        }
        return l4;
    }

    public static long j(long l3, int n3) {
        return l3;
    }

    public static int l(int n3) {
        if ((n3 & 0x60) != 0) {
            return 4;
        }
        if ((n3 & 0x1C) != 0) {
            return 4;
        }
        if ((n3 & 2) != 0) {
            return 2;
        }
        if ((n3 & 1) != 0) {
            return 1;
        }
        return 4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int n(int n3) {
        Throwable throwable2;
        block3: {
            int n4;
            SparseIntArray sparseIntArray;
            block2: {
                try {
                    SparseIntArray sparseIntArray2;
                    sparseIntArray = sparseIntArray2 = i;
                    if (sparseIntArray2 != null) break block2;
                    sparseIntArray = new SparseIntArray(8);
                    sparseIntArray.append(1, Tools.d0(2130837531));
                    sparseIntArray.append(2, Tools.d0(2130837537));
                    sparseIntArray.append(4, Tools.d0(2130837533));
                    sparseIntArray.append(8, Tools.d0(2130837538));
                    sparseIntArray.append(16, Tools.d0(2130837534));
                    sparseIntArray.append(32, Tools.d0(2130837535));
                    sparseIntArray.append(64, Tools.d0(2130837532));
                    i = sparseIntArray;
                    j = Tools.d0(2130837536);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            int n5 = n4 = sparseIntArray.get(android.ext.c.R(n3));
            if (n4 != 0) return n5;
            return j;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed getColor for: ");
        stringBuilder.append(n3);
        e1.l(stringBuilder.toString(), throwable2);
        return j;
    }

    public static e o(int n3) {
        return android.ext.c.p(n3, 0L);
    }

    public static e p(int n3, long l3) {
        e e4 = android.ext.c.q(n3);
        e4.remove(127);
        long l4 = (3L & l3) - 0L;
        n3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (n3 != 0) {
            e4.remove(32);
            e4.remove(64);
        }
        if (n3 != 0) {
            e4.remove(4);
            e4.remove(8);
            e4.remove(16);
        }
        if ((l3 & 1L) != 0L) {
            e4.remove(2);
        }
        return e4;
    }

    public static e q(int n3) {
        return android.ext.c.r(n3, false);
    }

    public static e r(int n3, boolean bl) {
        e e4 = new e();
        int n4 = e.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            int n5 = e.keyAt(i3);
            if ((n3 & n5) != n5) continue;
            e4.append(n5, (CharSequence)e.valueAt(i3));
        }
        if (bl && e4.get(n3) == null) {
            e4.append(n3, (CharSequence)e.get(127));
        }
        return e4;
    }

    public static String s(int n3) {
        if (n3 != 0 && (n3 & 0x40) == 0) {
            if ((n3 & 0x10) != 0) {
                return Tools.L1(b2.f(2131297036), Tools.L1("%.1e", Float.valueOf(-3.4028235E38f)), Tools.L1("%.1e", Float.valueOf(Float.MAX_VALUE)));
            }
            Object[] objectArray = t1.k();
            n3 = android.ext.c.y(n3);
            String string2 = b2.f(2131297036);
            return Tools.L1(string2, Tools.L1("%,d", objectArray[n3 *= 2]), Tools.L1("%,d", objectArray[n3 + 1]));
        }
        return Tools.L1(b2.f(2131297036), Tools.L1("%.1e", -1.7976931348623157E308), Tools.L1("%.1e", Double.MAX_VALUE));
    }

    public static CharSequence t(int n3) {
        CharSequence charSequence;
        CharSequence charSequence2 = charSequence = (CharSequence)e.get(android.ext.c.R(n3));
        if (charSequence == null) {
            charSequence2 = "Unknown";
        }
        return charSequence2;
    }

    public static void updateLocale() {
        e e4 = e;
        e e5 = f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A: %s (%.1e - %.1e) (");
        stringBuilder.append(b2.f(2131296967));
        stringBuilder.append(')');
        android.ext.c.U(e4, e5, 127, stringBuilder.toString(), 2131297026, -1.7976931348623157E308, Double.MAX_VALUE);
    }

    public static CharSequence v(int n3) {
        CharSequence charSequence;
        CharSequence charSequence2 = charSequence = (CharSequence)f.get(android.ext.c.R(n3));
        if (charSequence == null) {
            charSequence2 = "Unknown";
        }
        return charSequence2;
    }

    public static int w(int n3) {
        n3 = n3 != 1 ? (n3 != 2 ? (n3 != 4 ? (n3 != 8 ? (n3 != 16 ? (n3 != 32 ? (n3 != 64 ? 250 : 30) : 60) : 20) : 70) : 10) : 40) : 50;
        return n3;
    }

    public static a[] x(e object, SparseIntArray sparseIntArray) {
        int n3 = ((e)((Object)object)).size();
        a[] aArray = new a[n3];
        if (n3 == 1) {
            int n4 = object.keyAt(0);
            object = (CharSequence)object.valueAt(0);
            int n5 = sparseIntArray == null ? 0 : sparseIntArray.get(n4);
            aArray[0] = new a(n4, (CharSequence)object, n5);
        } else {
            int n6;
            CharSequence charSequence;
            int n7;
            int n8;
            boolean[] blArray = new boolean[n3];
            int n9 = n3 - 1;
            for (n8 = 0; n8 < n3 && (n7 = object.keyAt(n8)) <= -10; ++n8) {
                charSequence = (CharSequence)object.valueAt(n8);
                n6 = sparseIntArray == null ? 0 : sparseIntArray.get(n7);
                aArray[n9] = new a(n7, charSequence, n6);
                blArray[n8] = true;
                --n9;
            }
            for (int n10 : k) {
                int n11 = ((e)((Object)object)).indexOfKey(n10);
                n6 = n9;
                if (n11 >= 0) {
                    if (blArray[n11]) {
                        n6 = n9;
                    } else {
                        charSequence = (CharSequence)object.valueAt(n11);
                        n6 = sparseIntArray == null ? 0 : sparseIntArray.get(n10);
                        aArray[n9] = new a(n10, charSequence, n6);
                        blArray[n11] = true;
                        n6 = n9 - 1;
                    }
                }
                n9 = n6;
            }
            n8 = 0;
            for (n9 = 0; n9 < n3; ++n9) {
                if (blArray[n9]) continue;
                n7 = object.keyAt(n9);
                charSequence = (CharSequence)object.valueAt(n9);
                n6 = sparseIntArray == null ? 0 : sparseIntArray.get(n7);
                aArray[n8] = new a(n7, charSequence, n6);
                ++n8;
            }
        }
        return aArray;
    }

    public static int y(int n3) {
        if ((n3 & 0x60) != 0) {
            return 3;
        }
        if ((n3 & 0x1C) != 0) {
            return 2;
        }
        if ((n3 & 2) != 0) {
            return 1;
        }
        if ((n3 & 1) != 0) {
            return 0;
        }
        return 3;
    }

    public int D() {
        return android.ext.c.E(this.c);
    }

    public String F() {
        return android.ext.c.G(this.a, this.c);
    }

    public String H() {
        return android.ext.c.I(this.a, this.b, this.c);
    }

    public String J() {
        return android.ext.c.K(this.a, this.b, this.c);
    }

    public String L() {
        return android.ext.c.N(this.a, this.b, this.c, false);
    }

    public String O() {
        return android.ext.c.N(this.a, this.b, this.c, true);
    }

    public int Q() {
        return android.ext.c.R(this.c);
    }

    public boolean V() {
        long l3 = this.a;
        int n3 = this.k();
        boolean bl = true;
        if ((l3 & (long)(n3 - 1)) != 0L) {
            bl = false;
        }
        return bl;
    }

    public void X(String string2) {
        this.b = android.ext.c.e(this.a, string2, this.c);
    }

    public void a() {
        this.b(0);
    }

    public void b(int n3) {
        MainService.instance.i.a(this, n3);
    }

    public c c() {
        return new c(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        if (this.a != ((c)object).a) {
            return false;
        }
        int n3 = this.c;
        return ((((c)object).c ^ n3) & 0x7F) == 0;
    }

    public b f(b object, t1.b object2, String string2, long l3, String string3, int n3) {
        t1.b b4 = object2;
        if (object2 == null) {
            b4 = android.ext.c.W(null, string2, this.c, 2131296829, l3);
        }
        long l4 = b4.a;
        object2 = object;
        l3 = l4;
        if (n3 != 0) {
            int n4;
            object2 = object;
            if (object == null) {
                object = android.ext.c.W(null, string3, this.c, 2131296993, 0L);
                object2 = new b();
                ((b)object2).a = Float.intBitsToFloat((int)((t1.b)object).a);
                ((b)object2).b = Double.longBitsToDouble(((t1.b)object).a);
                ((b)object2).c = ((t1.b)object).a;
            }
            l3 = (n4 = b4.c) == 16 ? (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)l4) + ((b)object2).a * (float)n3) : (n4 == 64 ? Double.doubleToRawLongBits(Double.longBitsToDouble(l4) + ((b)object2).b * (double)n3) : l4 + ((b)object2).c * (long)n3);
        }
        l4 = l3;
        if (this.c == 8) {
            l4 = l3 ^ this.a;
        }
        this.b = l4;
        return object2;
    }

    public int hashCode() {
        long l3 = this.a;
        return ((int)(l3 ^ l3 >>> 32) + 31) * 31 + (this.c & 0x7F);
    }

    public long i() {
        return android.ext.c.j(this.a, this.c);
    }

    public int k() {
        return android.ext.c.l(this.c);
    }

    public int m() {
        return android.ext.c.n(this.c);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.F());
        stringBuilder.append(": ");
        stringBuilder.append(this.H());
        stringBuilder.append(' ');
        stringBuilder.append((Object)this.u());
        stringBuilder.append(" (");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public CharSequence u() {
        return android.ext.c.v(this.c);
    }

    public CharSequence z() {
        return android.ext.c.A(this.c);
    }

    public static class a {
        int a;
        CharSequence b;
        public int c;

        public a(int n3, CharSequence charSequence, int n4) {
            this.a = n3;
            this.b = charSequence;
            this.c = n4;
        }

        public String toString() {
            CharSequence charSequence;
            if (this.c > 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.c);
                ((StringBuilder)charSequence).append(": ");
                ((StringBuilder)charSequence).append(this.b.toString());
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = this.b.toString();
            }
            return charSequence;
        }
    }

    public static class b {
        float a;
        double b;
        long c;
    }
}

