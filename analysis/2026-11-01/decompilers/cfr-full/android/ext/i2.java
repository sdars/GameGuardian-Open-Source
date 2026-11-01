/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.DialogInterface;
import android.ext.MainService;
import android.ext.MemoryRange;
import android.ext.Script;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c2;
import android.ext.e1;
import android.ext.j2;
import android.ext.t1;
import android.ext.z1;
import android.view.View;
import java.util.Arrays;

public class i2
extends j2
implements View.OnClickListener {
    public static String l;

    public i2() {
        super(2131296945, 2130968628);
    }

    private static boolean A(byte by, long l3, long l4, int n3, int n4, long l5, long l6, boolean bl, long l7) {
        MainService mainService = MainService.instance;
        if (mainService.a1()) {
            if (mainService.p0 != 0L && bl) {
                mainService.n(by);
            }
            if (mainService.p0 == 0L) {
                mainService.q0 = false;
                mainService.i.x0(by);
            }
            mainService.R(by);
            mainService.r0 = false;
            mainService.i.r0(by, l3, l4, n3, n4, l5, l6, l7);
            MainService.N0(n4, by);
            return false;
        }
        throw new NumberFormatException(b2.f(2131296305));
    }

    private static boolean k(byte by, String charSequence, int n3, boolean bl, boolean bl2, int n4, long l3, long l4, boolean bl3, long l5) {
        a a4 = i2.v(((String)charSequence).trim(), n3, bl);
        n3 = bl ? 0x400000 : 0;
        charSequence = "";
        if (bl2) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("");
            ((StringBuilder)charSequence).append(Tools.L1(b2.f(2131296384), b2.f(2131296630), b2.f(2131296780)));
            ((StringBuilder)charSequence).append('\n');
            charSequence = ((StringBuilder)charSequence).toString();
        }
        if (n4 != 0x20000000 && n4 != 0x10000000) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(Tools.L1(b2.f(2131296384), b2.f(2131296630), android.ext.c.B().get(n4)));
            stringBuilder.append('\n');
            charSequence = stringBuilder.toString();
        } else {
            n3 |= n4;
        }
        if (((String)charSequence).length() <= 0) {
            return i2.z(by, a4.a, a4.b, a4.c, a4.d, n3, l3, l4, bl3, l5);
        }
        throw new NumberFormatException((String)charSequence);
    }

    private static boolean l(byte by, String charSequence, int n3, boolean bl, int n4, long l3, long l4, boolean bl2, long l5, int n5) {
        Object object = i2.x((String)(charSequence = ((String)charSequence).trim()), true);
        int n6 = object != null ? ((c)object).b : 0;
        if (object != null) {
            charSequence = ((c)object).a;
        }
        b b4 = i2.w(null, (String)charSequence, n3, n4);
        charSequence = "";
        if (bl) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("");
            ((StringBuilder)charSequence).append(Tools.L1(b2.f(2131296384), b2.f(2131296649), b2.f(2131296780)));
            ((StringBuilder)charSequence).append('\n');
            charSequence = ((StringBuilder)charSequence).toString();
        }
        object = charSequence;
        if (n4 != 0x20000000) {
            object = charSequence;
            if (n4 != 0x10000000) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(Tools.L1(b2.f(2131296384), b2.f(2131296649), android.ext.c.B().get(n4)));
                ((StringBuilder)object).append('\n');
                object = ((StringBuilder)object).toString();
            }
        }
        if (((String)object).length() <= 0) {
            if (n6 != 0) {
                b4.c |= 0x200000;
            }
            return i2.A(by, b4.a, b4.b, n6, b4.c | b4.d | n5, l3, l4, bl2, l5);
        }
        throw new NumberFormatException((String)object);
    }

    public static boolean m(byte by, int n3, byte[] byArray, long l3, long l4, boolean bl, long l5) {
        int n4 = n3 & 0x7F;
        MainService mainService = MainService.instance;
        n3 = n4;
        if (mainService.p0 != 0L) {
            n3 = n4;
            if (!bl) {
                n3 = n4 & (MainService.D() & 0x7F);
            }
        }
        if (n3 == 0) {
            mainService.n(by);
            return true;
        }
        if (mainService.a1()) {
            if (mainService.p0 != 0L && bl) {
                mainService.n(by);
            }
            if (mainService.p0 == 0L) {
                mainService.q0 = false;
                mainService.i.x0(by);
            }
            mainService.R(by);
            mainService.r0 = false;
            mainService.i.s0(by, n3, byArray, l3, l4, l5);
            MainService.N0(n3, by);
            return false;
        }
        throw new NumberFormatException(b2.f(2131296305));
    }

    public static boolean n(byte by, String string2, int n3, boolean bl, int n4, long l3, long l4, boolean bl2, long l5) {
        return i2.o(by, string2, n3, bl, n4, l3, l4, bl2, l5, 0);
    }

    public static boolean o(byte by, String string2, int n3, boolean bl, int n4, long l3, long l4, boolean bl2, long l5, int n5) {
        long l6;
        int n6;
        MainService mainService;
        int n7;
        block24: {
            Object object;
            block25: {
                block23: {
                    object = string2;
                    n7 = n3 & 0x7F;
                    n3 = n4 & 0x3C000000;
                    mainService = MainService.instance;
                    if (t1.m(string2)) {
                        n3 = ((String)object).charAt(0) == ';' ? 2 : 1;
                        bl = i2.m(by, n3, t1.h(string2), l3, l4, bl2, l5);
                        l = object;
                        return bl;
                    }
                    if (((String)object).indexOf(59) != -1) {
                        return i2.k(by, string2, n7, ((String)object).contains("::"), bl, n3, l3, l4, bl2, l5);
                    }
                    if (((String)object).indexOf(126) != -1 && t1.C(string2) == 0) {
                        return i2.l(by, string2, n7, bl, n3, l3, l4, bl2, l5, n5);
                    }
                    n6 = n7;
                    if (mainService.p0 != 0L) {
                        n6 = n7;
                        if (!bl2) {
                            n6 = n7 & (MainService.D() & 0x7F);
                        }
                    }
                    if (n6 == 0) {
                        mainService.n(by);
                        return true;
                    }
                    c c4 = i2.x((String)object, true);
                    n4 = c4 != null ? c4.b : 0;
                    string2 = object;
                    if (c4 != null) {
                        string2 = c4.a;
                    }
                    object = new t1.b();
                    l6 = android.ext.c.d((t1.b)object, string2, n6);
                    n7 = n6 & ((t1.b)object).c;
                    if (Integer.bitCount(n7) <= 1) break block23;
                    n6 = android.ext.c.g(n7, l6, ((t1.b)object).b);
                    break block24;
                }
                n6 = n7;
                if (bl) break block24;
                n6 = n7;
                if (n7 == 16) break block24;
                n6 = n7;
                if (n7 == 64) break block24;
                if (n3 == 0x8000000) break block25;
                n6 = n7;
                if (n3 != 0x4000000) break block24;
            }
            n6 = n7;
            if (string2.indexOf(45) == -1) {
                n6 = n7;
                if ((l6 & 1L << android.ext.c.E(n7) * 8 - 1) != 0L) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("unsigned search 1: '");
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append("' ");
                    ((StringBuilder)object).append(Integer.toHexString(n7));
                    ((StringBuilder)object).append(' ');
                    ((StringBuilder)object).append(bl);
                    ((StringBuilder)object).append(' ');
                    ((StringBuilder)object).append(Integer.toHexString(n3));
                    e1.d(((StringBuilder)object).toString());
                    if (n3 == 0x8000000) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(string2);
                        ((StringBuilder)object).append("~0");
                        string2 = ((StringBuilder)object).toString();
                        n3 = 0x10000000;
                    } else if (n3 == 0x4000000) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(string2);
                        ((StringBuilder)object).append("~-1");
                        string2 = ((StringBuilder)object).toString();
                        n3 = 0x20000000;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("unsigned search 2: '");
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append("' ");
                    ((StringBuilder)object).append(Integer.toHexString(n7));
                    ((StringBuilder)object).append(' ');
                    ((StringBuilder)object).append(bl);
                    ((StringBuilder)object).append(' ');
                    ((StringBuilder)object).append(Integer.toHexString(n3));
                    e1.d(((StringBuilder)object).toString());
                    return i2.o(by, string2, n7, bl, n3, l3, l4, bl2, l5, n5);
                }
            }
        }
        n7 = n3;
        if (bl) {
            n7 = n3;
            if (n4 == 0) {
                n7 = 0x2000000;
            }
        }
        n3 = n7 = n6 | n7;
        if (n4 != 0) {
            if (!bl) {
                n3 = n7 | 0x200000;
            } else {
                throw new NumberFormatException(Tools.L1(b2.f(2131296384), b2.f(2131296669), b2.f(2131296780)));
            }
        }
        if (mainService.a1()) {
            if (mainService.p0 != 0L && bl2) {
                mainService.n(by);
            }
            if (mainService.p0 == 0L) {
                mainService.q0 = false;
                mainService.i.x0(by);
            }
            mainService.R(by);
            mainService.r0 = false;
            mainService.i.p0(by, l6, n4, n3 | n5, l3, l4, l5);
            MainService.N0(n6, by);
            return false;
        }
        throw new NumberFormatException(b2.f(2131296305));
    }

    public static boolean p(byte by, short s3, long l3, long l4, long l5) {
        MainService mainService = MainService.instance;
        if (mainService.p0 == 0L) {
            mainService.n(by);
            return true;
        }
        if (mainService.a1()) {
            mainService.R(by);
            mainService.r0 = false;
            z1.d d4 = mainService.v0;
            int n3 = d4 != null && d4.n ? 32 : 4;
            mainService.i.q0(by, s3, n3, l3, l4, l5);
            MainService.N0(n3, by);
            return false;
        }
        throw new NumberFormatException(b2.f(2131296305));
    }

    public static boolean q(String string2, int n3, boolean bl, int n4, long l3, long l4, boolean bl2, long l5) {
        return i2.r(string2, n3, bl, n4, l3, l4, bl2, l5, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean r(String string2, int n3, boolean bl, int n4, long l3, long l4, boolean bl2, long l5, int n5) {
        String string3 = j2.h(string2);
        boolean bl3 = i2.o((byte)0, string3, n3, bl, n4, l3, l4, bl2, l5, n5);
        c2 c22 = MainService.instance.f;
        if (c22 == null) return bl3;
        if ((n5 & 0x100000) != 0) {
            string2 = "\n-- pointer search by address: not recorded (no gg.searchNumber/gg.refineNumber equivalent for the ARM64 tag-normalizing pointer comparison)\n";
        } else {
            if (bl2) {
                c22.write("\ngg.clearResults()\n");
            }
            string2 = !bl2 && MainService.instance.p0 != 0L ? "gg.refineNumber(" : "gg.searchNumber(";
            c22.write(string2);
            Script.Consts.c(c22, string3);
            c22.write(", ");
            Script.Consts.a(c22, c22.c.b, n3);
            c22.write(", ");
            c22.write(Boolean.toString(bl));
            c22.write(", ");
            Script.Consts.a(c22, c22.c.d, n4);
            c22.write(", ");
            Script.Consts.b(c22, l3);
            c22.write(", ");
            Script.Consts.b(c22, l4);
            c22.write(", ");
            c22.write(Long.toString(l5));
            string2 = ")\n";
        }
        c22.write(string2);
        return bl3;
    }

    private static void s(b b4, String string2) {
        int n3 = b4.c & 0x7F;
        long l3 = 1L << android.ext.c.E(n3) * 8 - 1;
        if (Integer.bitCount(n3) == 1 && n3 != 16 && n3 != 64 && string2.indexOf(45) == -1 && (b4.a & l3) == 0L && (b4.b & l3) != 0L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unsigned search 3: '");
            stringBuilder.append(string2);
            stringBuilder.append("' ");
            stringBuilder.append(b4.a);
            stringBuilder.append(' ');
            stringBuilder.append(b4.b);
            stringBuilder.append(' ');
            stringBuilder.append(Integer.toHexString(n3));
            stringBuilder.append(' ');
            stringBuilder.append(Integer.toHexString(b4.d));
            e1.d(stringBuilder.toString());
            l3 = b4.b;
            b4.b = b4.a;
            b4.a = l3;
            int n4 = b4.d;
            int n5 = 0x20000000;
            if (n4 == 0x20000000) {
                n5 = 0x10000000;
            }
            b4.d = n5;
            stringBuilder = new StringBuilder();
            stringBuilder.append("unsigned search 4: '");
            stringBuilder.append(string2);
            stringBuilder.append("' ");
            stringBuilder.append(b4.a);
            stringBuilder.append(' ');
            stringBuilder.append(b4.b);
            stringBuilder.append(' ');
            stringBuilder.append(Integer.toHexString(n3));
            stringBuilder.append(' ');
            stringBuilder.append(Integer.toHexString(b4.d));
            e1.d(stringBuilder.toString());
        }
    }

    public static int t(String object, int n3, boolean bl) {
        int n4;
        int n5;
        try {
            object = i2.v((String)object, n3, bl);
            n5 = ((a)object).c.length;
            n4 = 0;
        }
        catch (NumberFormatException numberFormatException) {
            n3 = 2;
        }
        for (n3 = 0; n3 < n5 - 1; ++n3) {
            int n6 = android.ext.c.E(((a)object).c[n3]);
            n4 += n6;
            continue;
        }
        n3 = n4 + 1;
        return n3;
    }

    private static a v(String object, int n3, boolean bl) {
        Object object2 = ((String)object).trim();
        object = bl ? "::" : ":";
        if (((String[])(object2 = ((String)object2).split((String)object))).length <= 2) {
            long l3 = ((String[])object2).length == 1 ? 512L : t1.x((String)object2[1]).a;
            int n4 = (int)l3;
            if (n4 >= 2 && n4 <= 65536) {
                if (((Object)(object2 = ((String)object2[0]).split(";"))).length >= 2) {
                    if (((Object)object2).length <= 64) {
                        a a4 = new a(((Object)object2).length);
                        object = null;
                        for (int i3 = 0; i3 < ((Object)object2).length; ++i3) {
                            if (((String)object2[i3]).indexOf(126) != -1) {
                                b b4 = i2.w((t1.b)object, (String)object2[i3], n3, 0x20000000);
                                a4.a[i3] = b4.a;
                                a4.b[i3] = b4.b;
                                int[] nArray = a4.c;
                                int n5 = b4.c;
                                nArray[i3] = b4.d | n5;
                                continue;
                            }
                            object = t1.o((t1.b)object, (String)object2[i3], n3, false);
                            a4.a[i3] = ((t1.b)object).a;
                            a4.b[i3] = 0L;
                            a4.c[i3] = ((t1.b)object).c;
                        }
                        a4.d = n4;
                        return a4;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(Tools.N1(2131297017));
                    ((StringBuilder)object).append(": ");
                    ((StringBuilder)object).append(64);
                    throw new NumberFormatException(((StringBuilder)object).toString());
                }
                throw new NumberFormatException(b2.f(2131297051));
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(Tools.L1(b2.f(2131296712), 2, 65536));
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(n4);
            object = new t1.a(((StringBuilder)object).toString());
            ((t1.a)object).a(65536L);
            throw object;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(b2.f(2131297016));
        ((StringBuilder)object2).append(" '");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append('\'');
        throw new NumberFormatException(((StringBuilder)object2).toString());
    }

    public static b w(t1.b object, String stringArray, int n3, int n4) {
        String string2 = stringArray.trim();
        stringArray = "~~";
        if (string2.contains("~~")) {
            n4 = n4 == 0x20000000 ? 0x10000000 : 0x20000000;
        } else {
            stringArray = "~";
        }
        Object object2 = string2.split((String)stringArray);
        if (((String[])object2).length <= 2) {
            stringArray = object2;
            if (((String[])object2).length != 2) {
                stringArray = Arrays.copyOf(object2, 2);
            }
            long[] lArray = new long[2];
            int[] nArray = new int[2];
            int n5 = 1;
            while (true) {
                object2 = "";
                if (n5 < 0) break;
                String string3 = stringArray[n5];
                if (string3 != null) {
                    object2 = string3.trim();
                }
                int n6 = n5 == 1 ? n3 : nArray[1];
                object = t1.o((t1.b)object, (String)object2, n6, false);
                if (n3 == 127 && ((t1.b)object).c == 64 && "BWDXFQEAbwdxfqea".indexOf(((String)object2).charAt(((String)object2).length() - 1)) == -1) {
                    ((t1.b)object).c |= 0x10;
                }
                lArray[n5] = ((t1.b)object).a;
                nArray[n5] = ((t1.b)object).c;
                --n5;
            }
            n5 = nArray[0] & nArray[1];
            if (n5 == 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("");
                ((StringBuilder)object).append(b2.f(2131296881));
                ((StringBuilder)object).append('\n');
                object2 = ((StringBuilder)object).toString();
            }
            if (((String)object2).length() <= 0) {
                if (n3 == 127 && (n5 & 0x20) == 0) {
                    for (n3 = 0; n3 < 2; ++n3) {
                        if ((nArray[n3] & 0x20) == 0) continue;
                        lArray[n3] = Double.doubleToRawLongBits(lArray[n3]);
                    }
                }
                object = new b();
                ((b)object).a = lArray[0];
                ((b)object).b = lArray[1];
                ((b)object).c = n5;
                ((b)object).d = n4;
                i2.s((b)object, string2);
                return object;
            }
            throw new NumberFormatException((String)object2);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(b2.f(2131297016));
        ((StringBuilder)object).append(" '");
        ((StringBuilder)object).append((String)stringArray);
        ((StringBuilder)object).append('\'');
        throw new NumberFormatException(((StringBuilder)object).toString());
    }

    public static c x(String string2, boolean bl) {
        Object object;
        block5: {
            c c4;
            block6: {
                boolean bl2 = t1.m(string2);
                c4 = null;
                object = c4;
                if (bl2) break block5;
                object = c4;
                if (t1.C(string2) != 0) break block5;
                if (string2.indexOf(88) != -1) break block6;
                object = c4;
                if (string2.indexOf(120) == -1) break block5;
            }
            c4 = new c();
            String[] stringArray = string2.split("[Xx]");
            int n3 = stringArray.length;
            object = "";
            string2 = n3 == 2 ? stringArray[1] : "";
            n3 = (int)t1.o(null, (String)string2, (int)2, (boolean)false).a;
            if (stringArray.length > 0) {
                object = stringArray[0];
            }
            c4.a = object;
            if (bl && (n3 < 1 || n3 > 4096)) {
                object = new StringBuilder();
                ((StringBuilder)object).append(Tools.L1(b2.f(2131296830), string2));
                ((StringBuilder)object).append(" [1; 4096]");
                object = new t1.a(((StringBuilder)object).toString());
                ((t1.a)object).c(string2);
                throw object;
            }
            c4.b = n3;
            object = c4;
        }
        return object;
    }

    private static boolean z(byte by, long[] lArray, long[] lArray2, int[] nArray, int n3, int n4, long l3, long l4, boolean bl, long l5) {
        MainService mainService = MainService.instance;
        if (mainService.a1()) {
            if (mainService.p0 != 0L && bl) {
                mainService.n(by);
            }
            if (mainService.p0 == 0L) {
                mainService.q0 = false;
                mainService.i.x0(by);
            }
            mainService.Q();
            mainService.r0 = false;
            mainService.i.n0(by, n4, n3, nArray, lArray, lArray2, l3, l4, l5);
            n4 = 0;
            for (n3 = 0; n3 < nArray.length; ++n3) {
                n4 |= nArray[n3];
            }
            MainService.N0(n4, by);
            return false;
        }
        throw new NumberFormatException(b2.f(2131296305));
    }

    @Override
    public void j(DialogInterface object, int n3) {
        object = this.j.f();
        boolean bl = this.j.p();
        int n4 = this.j.i();
        long l3 = this.j.e(0);
        long l4 = this.j.e(1);
        boolean bl2 = this.i == -3;
        i2.q((String)object, n3, bl, n4, l3, l4, bl2, this.j.b());
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        this.f = this.j.f();
        this.g = this.j.i();
        MainService.O0 = this.j.j();
        super.onDismiss(dialogInterface);
    }

    public void u(String string2) {
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        this.f = string3;
        this.a().performClick();
    }

    public void y(String string2) {
        this.a().performClick();
        MemoryRange memoryRange = this.j.y;
        memoryRange.setType(2);
        memoryRange.setAddress(string2);
    }

    private static class a {
        long[] a;
        long[] b;
        int[] c;
        int d;

        public a(int n3) {
            this.a = new long[n3];
            this.b = new long[n3];
            this.c = new int[n3];
            this.d = 2;
        }
    }

    public static class b {
        public long a = 0L;
        public long b = 0L;
        public int c = 0;
        public int d = 0x20000000;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append(": ");
            stringBuilder.append(this.a);
            String string2 = this.d == 0x20000000 ? "~" : "~~";
            stringBuilder.append(string2);
            stringBuilder.append(this.b);
            stringBuilder.append(' ');
            stringBuilder.append(this.c);
            return stringBuilder.toString();
        }
    }

    public static class c {
        public String a;
        public int b;
    }
}

