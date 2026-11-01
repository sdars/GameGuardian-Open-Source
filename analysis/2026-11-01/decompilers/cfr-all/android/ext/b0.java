/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.MainService;
import android.ext.Script;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.c2;
import android.ext.t1;
import java.text.DecimalFormat;

public abstract class b0 {
    private static int a;
    private static a b;
    private static final DecimalFormat c;
    private static final DecimalFormat d;

    static {
        b = new a(0, 0L, 0L, 0L, 0, 0L, 0, 0, 0, 0.0, 0);
        c = new DecimalFormat("0.0#######E0");
        d = new DecimalFormat("###,###,##0.0##########");
    }

    public static String a(double d4) {
        double d5 = Math.abs(d4);
        DecimalFormat decimalFormat = 1.0E-6 < d5 && d5 < 1.0E10 || d5 == 0.0 ? d : c;
        return decimalFormat.format(d4).replace('E', 'e');
    }

    public static String b(long l3) {
        return b0.a(Double.longBitsToDouble(l3));
    }

    public static String c(float f4) {
        return b0.a(f4);
    }

    public static String d(int n3) {
        return b0.c(Float.intBitsToFloat(n3));
    }

    public static String e(long l3) {
        return b0.d((int)l3);
    }

    public static a f(long l3, long l4, String object, String string2, int n3, String string3, int n4) {
        double d4;
        int n5;
        long l5;
        int n6;
        long l6;
        int n7 = l3 != 0L ? 1 : 0;
        int n8 = n7;
        if (l4 != -1L) {
            n8 = n7 | 2;
        }
        if (object != null) {
            n8 |= 4;
            object = t1.o(null, ((String)object).trim(), 127, false);
            l6 = ((t1.b)object).a;
            n6 = ((t1.b)object).c;
        } else {
            l6 = 0L;
            n6 = 0;
        }
        if (string2 != null) {
            n8 |= 8;
            object = t1.o(null, string2.trim(), 127, false);
            l5 = ((t1.b)object).a;
            n5 = ((t1.b)object).c;
        } else {
            l5 = 0L;
            n5 = 0;
        }
        n7 = n8;
        if (n3 != 0) {
            n7 = n8 | 0x10;
        }
        if (string3 != null) {
            object = string3.trim();
            int n9 = n7 | 0x20;
            if (((String)object).length() > 0 && ((String)object).charAt(0) == '!') {
                object = ((String)object).substring(1);
                n7 = 0x10000000;
            } else {
                n7 = 0x20000000;
            }
            d4 = Double.longBitsToDouble(t1.o(null, (String)object, (int)64, (boolean)false).a);
            n8 = n7;
            n7 = n9;
        } else {
            d4 = 0.0;
            n8 = 0;
        }
        if (n4 != 0) {
            n7 |= 0x40;
        }
        return new a(n7, l3, l4, l6, n6, l5, n5, n3, n8, d4, n4);
    }

    public static void g() {
        b0.h((byte)0, b0.i(), 0, b);
    }

    public static void h(byte by, int n3, int n4, a a4) {
        MainService.instance.i.Y(by, n3, n4, a4.a, a4.b, a4.c, a4.d, a4.e, a4.f, a4.g, a4.h, a4.i, a4.j, a4.k);
    }

    public static int i() {
        return a;
    }

    public static void j(MainService mainService) {
        int n3;
        mainService = Tools.M0();
        try {
            n3 = b0.m(mainService.getString(b2.b(2131034233), "100"));
        }
        catch (NumberFormatException numberFormatException) {
            n3 = 100;
        }
        b0.p(n3);
    }

    public static boolean k() {
        boolean bl = b0.b.a != 0;
        return bl;
    }

    public static int l(long l3) {
        int n3 = (int)(l3 & Integer.MAX_VALUE);
        if ((Integer.MIN_VALUE & l3) != 0L) {
            return Integer.MIN_VALUE | n3;
        }
        return n3;
    }

    public static int m(String string2) {
        String string3 = string2.trim();
        Integer n3 = string3.indexOf(46) != -1 ? Integer.valueOf(Float.floatToRawIntBits(Float.parseFloat(string3))) : null;
        int n4 = string3.length();
        int n5 = 10;
        Integer n6 = n3;
        int n7 = n5;
        string2 = string3;
        if (n4 >= 1) {
            int n8 = n4 - 1;
            n4 = string3.charAt(n8);
            String string4 = string3;
            if (n4 == 104) {
                string4 = string3.substring(0, n8);
                n5 = 16;
            }
            n6 = n3;
            n7 = n5;
            string2 = string4;
            if (n4 == 102) {
                string2 = string4.substring(0, n8);
                n6 = Float.floatToRawIntBits(Float.parseFloat(string2));
                n7 = n5;
            }
        }
        n3 = n6;
        if (n6 == null) {
            n3 = b0.l(t1.r(string2, n7));
        }
        return n3;
    }

    public static void n(c2 c22, boolean bl) {
        c22.write("gg.getResults(");
        c22.write(Integer.toString(b0.i()));
        if (bl) {
            a a4 = b;
            int n3 = a4.a;
            c22.write(", ");
            c22.write("nil");
            c22.write(", ");
            if ((n3 & 1) == 0) {
                c22.write("nil");
            } else {
                Script.Consts.b(c22, a4.b);
            }
            c22.write(", ");
            if ((n3 & 2) == 0) {
                c22.write("nil");
            } else {
                Script.Consts.b(c22, a4.c);
            }
            c22.write(", ");
            if ((n3 & 4) == 0) {
                c22.write("nil");
            } else {
                Script.Consts.d(c22, android.ext.c.I(0L, a4.d, a4.e));
            }
            c22.write(", ");
            if ((n3 & 8) == 0) {
                c22.write("nil");
            } else {
                Script.Consts.d(c22, android.ext.c.I(0L, a4.f, a4.g));
            }
            c22.write(", ");
            if ((n3 & 0x10) == 0) {
                c22.write("nil");
            } else {
                Script.Consts.a(c22, c22.c.b, a4.h);
            }
            c22.write(", ");
            if ((n3 & 0x20) == 0) {
                c22.write("nil");
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                String string2 = a4.i == 0x10000000 ? "|" : "";
                stringBuilder.append(string2);
                stringBuilder.append(a4.j);
                Script.Consts.d(c22, stringBuilder.toString());
            }
            c22.write(", ");
            if ((n3 & 0x40) == 0) {
                c22.write("nil");
            } else {
                Script.Consts.a(c22, c22.c.h, a4.k);
            }
        }
        c22.write(")\n");
    }

    public static void o(String charSequence, String string2, String string3, String string4, int n3, String string5, int n4) {
        long l3;
        long l4;
        if (charSequence == null) {
            l4 = 0L;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((String)charSequence).trim());
            stringBuilder.append('h');
            l4 = t1.o(null, (String)stringBuilder.toString(), (int)127, (boolean)false).a;
        }
        if (string2 == null) {
            l3 = -1L;
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2.trim());
            ((StringBuilder)charSequence).append('h');
            l3 = t1.o(null, (String)((StringBuilder)charSequence).toString(), (int)127, (boolean)false).a;
        }
        b = b0.f(l4, l3, string3, string4, n3, string5, n4);
    }

    public static void p(int n3) {
        a = Math.min(Math.max(1, n3), 100000);
    }

    public static class a {
        int a;
        long b;
        long c;
        long d;
        int e;
        long f;
        int g;
        int h;
        int i;
        double j;
        int k;

        public a(int n3, long l3, long l4, long l5, int n4, long l6, int n5, int n6, int n7, double d4, int n8) {
            this.a = n3;
            this.b = l3;
            this.c = l4;
            this.d = l5;
            this.e = n4;
            this.f = l6;
            this.g = n5;
            this.h = n6;
            this.i = n7;
            this.j = d4;
            this.k = n8;
        }
    }
}

