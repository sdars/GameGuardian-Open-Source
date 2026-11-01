package android.ext;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f716b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f717c = 1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double[] f715a = {1.0d};

    public d1() {
        h(t1.f(Tools.M0().getString("list-speeds", "0.000000001;0.00000001;0.0000001;0.000001;0.00001;0.0001;0.001;0.002;0.005;0.01;0.02;0.05;0.1;0.2;0.5;0.6;0.75;0.9;1;1.2;1.3;1.5;2;3;4;5;6;9;12;15;20;30;60;120;180;300;600;1200;2400;3600")), false);
    }

    public static String a(double d2) {
        int iMin = 9 - Math.min(Math.max((int) Math.log10(d2), 0), 9);
        String strL1 = Tools.L1("%,." + iMin + 'f', Double.valueOf(d2));
        return iMin == 0 ? strL1 : strL1.replaceAll("[" + t1.f1252b + "]?0*$", "");
    }

    public static String c() {
        return t1.f("0.000000001;0.00000001;0.0000001;0.000001;0.00001;0.0001;0.001;0.002;0.005;0.01;0.02;0.05;0.1;0.2;0.5;0.6;0.75;0.9;1;1.2;1.3;1.5;2;3;4;5;6;9;12;15;20;30;60;120;180;300;600;1200;2400;3600");
    }

    public static d1$a d(double d2) {
        int iPow = (int) (Math.pow(10.0d, 9 - Math.max(0, (int) Math.ceil(Math.log10(d2)))) * 2.0d);
        int i = (int) (d2 * ((double) iPow));
        if (i == 0) {
            i = 1;
        }
        int iV = Tools.V(i, iPow);
        return new d1$a(i / iV, iPow / iV);
    }

    private void f(double d2) {
        int i = 0;
        double d3 = Double.MAX_VALUE;
        int i2 = 0;
        while (true) {
            double[] dArr = this.f715a;
            if (i >= dArr.length) {
                this.f716b = i2;
                this.f717c = dArr[i2];
                return;
            } else {
                double dAbs = Math.abs(d2 - dArr[i]);
                if (dAbs < d3) {
                    i2 = i;
                    d3 = dAbs;
                }
                i++;
            }
        }
    }

    private void h(String str, boolean z) {
        int i;
        int i2;
        String[] strArrSplit = (str.length() == 0 ? c() : str).split(";");
        int length = strArrSplit.length + 1;
        double[] dArrCopyOf = new double[length];
        int length2 = strArrSplit.length;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (i3 < length2) {
            String str2 = strArrSplit[i3];
            try {
                Double dValueOf = Double.valueOf(Tools.j1(str2));
                i = length;
                i2 = i3;
                if (dValueOf.doubleValue() < 1.0E-9d || dValueOf.doubleValue() > 1.0E9d) {
                    e1.p("Speed outside range: " + dValueOf + " (1.0E-9; 1.0E9)");
                } else {
                    if (!z2 && dValueOf.doubleValue() == 1.0d) {
                        z2 = true;
                    }
                    dArrCopyOf[i4] = dValueOf.doubleValue();
                    i4++;
                }
            } catch (NumberFormatException e2) {
                i = length;
                i2 = i3;
                e1.s("Failed parse speed: '" + str2 + '\'', e2);
            }
            i3 = i2 + 1;
            length = i;
        }
        int i5 = length;
        if (!z2) {
            dArrCopyOf[i4] = 1.0d;
            i4++;
        }
        if (i5 > i4) {
            dArrCopyOf = Arrays.copyOf(dArrCopyOf, i4);
        }
        if (Config.l != 0) {
            Arrays.sort(dArrCopyOf);
            if (Config.l == 2) {
                double d2 = 0.0d;
                int i6 = 0;
                for (int i7 = 0; i7 < dArrCopyOf.length; i7++) {
                    double d3 = dArrCopyOf[i7];
                    if (i7 <= 0 || d3 != d2) {
                        if (i7 != i6) {
                            dArrCopyOf[i6] = d3;
                        }
                        i6++;
                        d2 = d3;
                    } else {
                        e1.p("Speed duplicate: " + d3 + " (" + i7 + ')');
                    }
                }
                if (dArrCopyOf.length > i6) {
                    dArrCopyOf = Arrays.copyOf(dArrCopyOf, i6);
                }
            }
        }
        this.f715a = dArrCopyOf;
        f(this.f717c);
        if (z) {
            new g2().k("list-speeds", t1.e(b()), "0.000000001;0.00000001;0.0000001;0.000001;0.00001;0.0001;0.001;0.002;0.005;0.01;0.02;0.05;0.1;0.2;0.5;0.6;0.75;0.9;1;1.2;1.3;1.5;2;3;4;5;6;9;12;15;20;30;60;120;180;300;600;1200;2400;3600").commit();
        }
    }

    private void m(int i) {
        int length = this.f716b + i;
        if (length < 0) {
            length = 0;
        }
        double[] dArr = this.f715a;
        if (length >= dArr.length) {
            length = dArr.length - 1;
        }
        this.f716b = length;
        this.f717c = dArr[length];
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (double d2 : this.f715a) {
            if (z) {
                z = false;
            } else {
                sb.append(';');
            }
            sb.append(a(d2));
        }
        return sb.toString();
    }

    public double e() {
        return this.f717c;
    }

    public void g(String str) {
        h(str, true);
    }

    public void i(double d2) {
        f(d2);
    }

    public void j() {
        i(1.0d);
    }

    public void k() {
        m(1);
    }

    public void l() {
        m(-1);
    }
}
