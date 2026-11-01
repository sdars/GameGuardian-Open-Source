/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.Config;
import android.ext.Tools;
import android.ext.e1;
import android.ext.g2;
import android.ext.t1;
import java.util.Arrays;

public class d1 {
    double[] a = new double[]{1.0};
    private int b = 0;
    private double c = 1.0;

    public d1() {
        this.h(t1.f(Tools.M0().getString("list-speeds", "0.000000001;0.00000001;0.0000001;0.000001;0.00001;0.0001;0.001;0.002;0.005;0.01;0.02;0.05;0.1;0.2;0.5;0.6;0.75;0.9;1;1.2;1.3;1.5;2;3;4;5;6;9;12;15;20;30;60;120;180;300;600;1200;2400;3600")), false);
    }

    public static String a(double d4) {
        int n3 = 9 - Math.min(Math.max((int)Math.log10(d4), 0), 9);
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("%,.");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append('f');
        charSequence = Tools.L1(((StringBuilder)charSequence).toString(), d4);
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append("[");
        charSequence2.append(t1.b);
        charSequence2.append("]?0*$");
        charSequence2 = charSequence2.toString();
        if (n3 != 0) {
            charSequence = ((String)charSequence).replaceAll((String)charSequence2, "");
        }
        return charSequence;
    }

    public static String c() {
        return t1.f("0.000000001;0.00000001;0.0000001;0.000001;0.00001;0.0001;0.001;0.002;0.005;0.01;0.02;0.05;0.1;0.2;0.5;0.6;0.75;0.9;1;1.2;1.3;1.5;2;3;4;5;6;9;12;15;20;30;60;120;180;300;600;1200;2400;3600");
    }

    public static a d(double d4) {
        int n3;
        int n4 = (int)(Math.pow(10.0, 9 - Math.max(0, (int)Math.ceil(Math.log10(d4)))) * 2.0);
        int n5 = n3 = (int)(d4 * (double)n4);
        if (n3 == 0) {
            n5 = 1;
        }
        n3 = Tools.V(n5, n4);
        return new a(n5 / n3, n4 / n3);
    }

    private void f(double d4) {
        double[] dArray;
        double d5 = Double.MAX_VALUE;
        int n3 = 0;
        for (int i3 = 0; i3 < (dArray = this.a).length; ++i3) {
            double d6 = Math.abs(d4 - dArray[i3]);
            double d7 = d5;
            if (d6 < d5) {
                n3 = i3;
                d7 = d6;
            }
            d5 = d7;
        }
        this.b = n3;
        this.c = dArray[n3];
    }

    private void h(String object, boolean bl) {
        int n3;
        if (object.length() == 0) {
            object = d1.c();
        }
        object = object.split(";");
        int n4 = ((String[])object).length + 1;
        Object object2 = new double[n4];
        int n5 = ((String[])object).length;
        int n6 = 0;
        int n7 = 0;
        for (int i3 = 0; i3 < n5; ++i3) {
            Comparable<Double> comparable;
            CharSequence charSequence = object[i3];
            try {
                comparable = Tools.j1((String)charSequence);
            }
            catch (NumberFormatException numberFormatException) {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append("Failed parse speed: '");
                ((StringBuilder)comparable).append((String)charSequence);
                ((StringBuilder)comparable).append('\'');
                e1.s(((StringBuilder)comparable).toString(), numberFormatException);
            }
            if (!((Double)comparable < 1.0E-9) && !((Double)comparable > 1.0E9)) {
                n3 = n6;
                if (n6 == 0) {
                    n3 = n6;
                    if ((Double)comparable == 1.0) {
                        n3 = 1;
                    }
                }
                object2[n7] = (Double)comparable;
                ++n7;
                n6 = n3;
                continue;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Speed outside range: ");
            ((StringBuilder)charSequence).append(comparable);
            ((StringBuilder)charSequence).append(" (");
            ((StringBuilder)charSequence).append(1.0E-9);
            ((StringBuilder)charSequence).append("; ");
            ((StringBuilder)charSequence).append(1.0E9);
            ((StringBuilder)charSequence).append(')');
            e1.p(((StringBuilder)charSequence).toString());
            continue;
        }
        n3 = n7;
        if (n6 == 0) {
            object2[n7] = 1.0;
            n3 = n7 + 1;
        }
        object = object2;
        if (n4 > n3) {
            object = Arrays.copyOf((double[])object2, n3);
        }
        object2 = object;
        if (Config.l != 0) {
            Arrays.sort((double[])object);
            object2 = object;
            if (Config.l == 2) {
                Object object3 = 0.0;
                n6 = 0;
                for (n7 = 0; n7 < ((String[])object).length; ++n7) {
                    String string2 = object[n7];
                    if (n7 > 0 && string2 == object3) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Speed duplicate: ");
                        ((StringBuilder)object2).append((double)string2);
                        ((StringBuilder)object2).append(" (");
                        ((StringBuilder)object2).append(n7);
                        ((StringBuilder)object2).append(')');
                        e1.p(((StringBuilder)object2).toString());
                        continue;
                    }
                    if (n7 != n6) {
                        object[n6] = string2;
                    }
                    ++n6;
                    object3 = string2;
                }
                object2 = object;
                if (((String[])object).length > n6) {
                    object2 = Arrays.copyOf((double[])object, n6);
                }
            }
        }
        this.a = object2;
        this.f(this.c);
        if (bl) {
            object = t1.e(this.b());
            new g2().k("list-speeds", (String)object, "0.000000001;0.00000001;0.0000001;0.000001;0.00001;0.0001;0.001;0.002;0.005;0.01;0.02;0.05;0.1;0.2;0.5;0.6;0.75;0.9;1;1.2;1.3;1.5;2;3;4;5;6;9;12;15;20;30;60;120;180;300;600;1200;2400;3600").commit();
        }
    }

    private void m(int n3) {
        int n4;
        n3 = n4 = this.b + n3;
        if (n4 < 0) {
            n3 = 0;
        }
        double[] dArray = this.a;
        n4 = n3;
        if (n3 >= dArray.length) {
            n4 = dArray.length - 1;
        }
        this.b = n4;
        this.c = dArray[n4];
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        double[] dArray = this.a;
        int n3 = dArray.length;
        boolean bl = true;
        for (int i3 = 0; i3 < n3; ++i3) {
            double d4 = dArray[i3];
            if (bl) {
                bl = false;
            } else {
                stringBuilder.append(';');
            }
            stringBuilder.append(d1.a(d4));
        }
        return stringBuilder.toString();
    }

    public double e() {
        return this.c;
    }

    public void g(String string2) {
        this.h(string2, true);
    }

    public void i(double d4) {
        this.f(d4);
    }

    public void j() {
        this.i(1.0);
    }

    public void k() {
        this.m(1);
    }

    public void l() {
        this.m(-1);
    }

    public static class a {
        final int a;
        final int b;

        public a(int n3, int n4) {
            this.a = n3;
            this.b = n4;
        }
    }
}

