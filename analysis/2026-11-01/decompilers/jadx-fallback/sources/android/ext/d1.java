package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double[] f715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f717c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f719b;

        public a(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f718a = r1
                r0.f719b = r2
                return
        }
    }

    public d1() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f716b = r0
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4.f717c = r1
            r3 = 1
            double[] r3 = new double[r3]
            r3[r0] = r1
            r4.f715a = r3
            android.content.SharedPreferences r1 = android.ext.Tools.M0()
            java.lang.String r2 = "list-speeds"
            java.lang.String r3 = "0.000000001;0.00000001;0.0000001;0.000001;0.00001;0.0001;0.001;0.002;0.005;0.01;0.02;0.05;0.1;0.2;0.5;0.6;0.75;0.9;1;1.2;1.3;1.5;2;3;4;5;6;9;12;15;20;30;60;120;180;300;600;1200;2400;3600"
            java.lang.String r1 = r1.getString(r2, r3)
            java.lang.String r1 = android.ext.t1.f(r1)
            r4.h(r1, r0)
            return
    }

    public static java.lang.String a(double r4) {
            double r0 = java.lang.Math.log10(r4)
            int r0 = (int) r0
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            r2 = 9
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r2 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "%,."
            r0.append(r3)
            r0.append(r2)
            r3 = 102(0x66, float:1.43E-43)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = android.ext.Tools.L1(r0, r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "["
            r5.append(r0)
            char r0 = android.ext.t1.f1252b
            r5.append(r0)
            java.lang.String r0 = "]?0*$"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            if (r2 != 0) goto L4f
            goto L55
        L4f:
            java.lang.String r0 = ""
            java.lang.String r4 = r4.replaceAll(r5, r0)
        L55:
            return r4
    }

    public static java.lang.String c() {
            java.lang.String r0 = "0.000000001;0.00000001;0.0000001;0.000001;0.00001;0.0001;0.001;0.002;0.005;0.01;0.02;0.05;0.1;0.2;0.5;0.6;0.75;0.9;1;1.2;1.3;1.5;2;3;4;5;6;9;12;15;20;30;60;120;180;300;600;1200;2400;3600"
            java.lang.String r0 = android.ext.t1.f(r0)
            return r0
    }

    public static android.ext.d1.a d(double r4) {
            double r0 = java.lang.Math.log10(r4)
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = 9 - r0
            double r0 = (double) r0
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.pow(r2, r0)
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            double r1 = (double) r0
            double r4 = r4 * r1
            int r4 = (int) r4
            if (r4 != 0) goto L23
            r4 = 1
        L23:
            int r5 = android.ext.Tools.V(r4, r0)
            int r4 = r4 / r5
            int r0 = r0 / r5
            android.ext.d1$a r5 = new android.ext.d1$a
            r5.<init>(r4, r0)
            return r5
    }

    private void f(double r8) {
            r7 = this;
            r0 = 0
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r2 = r1
            r1 = 0
        L8:
            double[] r4 = r7.f715a
            int r5 = r4.length
            if (r0 >= r5) goto L1e
            r5 = r4[r0]
            double r4 = r8 - r5
            double r4 = java.lang.Math.abs(r4)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L1b
            r1 = r0
            r2 = r4
        L1b:
            int r0 = r0 + 1
            goto L8
        L1e:
            r7.f716b = r1
            r8 = r4[r1]
            r7.f717c = r8
            return
    }

    private void h(java.lang.String r21, boolean r22) {
            r20 = this;
            r1 = r20
            int r0 = r21.length()
            if (r0 != 0) goto Ld
            java.lang.String r0 = c()
            goto Lf
        Ld:
            r0 = r21
        Lf:
            java.lang.String r2 = ";"
            java.lang.String[] r2 = r0.split(r2)
            int r0 = r2.length
            r3 = 1
            int r4 = r0 + 1
            double[] r5 = new double[r4]
            int r6 = r2.length
            r8 = 0
            r9 = 0
            r10 = 0
        L1f:
            r0 = 41
            java.lang.String r11 = " ("
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r8 >= r6) goto Lb0
            r14 = r2[r8]
            double r15 = android.ext.Tools.j1(r14)     // Catch: java.lang.NumberFormatException -> L8b
            java.lang.Double r14 = java.lang.Double.valueOf(r15)     // Catch: java.lang.NumberFormatException -> L8b
            double r15 = r14.doubleValue()
            r17 = r4
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            r18 = r8
            r7 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            int r19 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r19 < 0) goto L65
            double r15 = r14.doubleValue()
            int r19 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r19 <= 0) goto L50
            goto L65
        L50:
            if (r9 != 0) goto L5b
            double r3 = r14.doubleValue()
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L5b
            r9 = 1
        L5b:
            int r0 = r10 + 1
            double r3 = r14.doubleValue()
            r5[r10] = r3
            r10 = r0
            goto La9
        L65:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Speed outside range: "
            r12.append(r13)
            r12.append(r14)
            r12.append(r11)
            r12.append(r7)
            java.lang.String r7 = "; "
            r12.append(r7)
            r12.append(r3)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            android.ext.e1.p(r0)
            goto La9
        L8b:
            r0 = move-exception
            r17 = r4
            r18 = r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed parse speed: '"
            r3.append(r4)
            r3.append(r14)
            r4 = 39
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.ext.e1.s(r3, r0)
        La9:
            int r8 = r18 + 1
            r4 = r17
            r3 = 1
            goto L1f
        Lb0:
            r17 = r4
            if (r9 != 0) goto Lb9
            int r2 = r10 + 1
            r5[r10] = r12
            r10 = r2
        Lb9:
            r2 = r17
            if (r2 <= r10) goto Lc1
            double[] r5 = java.util.Arrays.copyOf(r5, r10)
        Lc1:
            int r2 = android.ext.Config.l
            if (r2 == 0) goto L10b
            java.util.Arrays.sort(r5)
            int r2 = android.ext.Config.l
            r3 = 2
            if (r2 != r3) goto L10b
            r2 = 0
            r4 = 0
            r7 = 0
        Ld1:
            int r6 = r5.length
            if (r7 >= r6) goto L104
            r8 = r5[r7]
            if (r7 <= 0) goto Lfa
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto Lfa
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Speed duplicate: "
            r6.append(r10)
            r6.append(r8)
            r6.append(r11)
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.ext.e1.p(r6)
            goto L101
        Lfa:
            if (r7 == r4) goto Lfe
            r5[r4] = r8
        Lfe:
            int r4 = r4 + 1
            r2 = r8
        L101:
            int r7 = r7 + 1
            goto Ld1
        L104:
            int r0 = r5.length
            if (r0 <= r4) goto L10b
            double[] r5 = java.util.Arrays.copyOf(r5, r4)
        L10b:
            r1.f715a = r5
            double r2 = r1.f717c
            r1.f(r2)
            if (r22 == 0) goto L12c
            java.lang.String r0 = r20.b()
            java.lang.String r0 = android.ext.t1.e(r0)
            android.ext.g2 r2 = new android.ext.g2
            r2.<init>()
            java.lang.String r3 = "list-speeds"
            java.lang.String r4 = "0.000000001;0.00000001;0.0000001;0.000001;0.00001;0.0001;0.001;0.002;0.005;0.01;0.02;0.05;0.1;0.2;0.5;0.6;0.75;0.9;1;1.2;1.3;1.5;2;3;4;5;6;9;12;15;20;30;60;120;180;300;600;1200;2400;3600"
            android.ext.g2 r0 = r2.k(r3, r0, r4)
            r0.commit()
        L12c:
            return
    }

    private void m(int r3) {
            r2 = this;
            int r0 = r2.f716b
            int r0 = r0 + r3
            if (r0 >= 0) goto L6
            r0 = 0
        L6:
            double[] r3 = r2.f715a
            int r1 = r3.length
            if (r0 < r1) goto Le
            int r0 = r3.length
            int r0 = r0 + (-1)
        Le:
            r2.f716b = r0
            r0 = r3[r0]
            r2.f717c = r0
            return
    }

    public java.lang.String b() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            double[] r1 = r9.f715a
            int r2 = r1.length
            r3 = 1
            r4 = 0
            r5 = 0
        Lb:
            if (r5 >= r2) goto L22
            r6 = r1[r5]
            if (r3 == 0) goto L13
            r3 = 0
            goto L18
        L13:
            r8 = 59
            r0.append(r8)
        L18:
            java.lang.String r6 = a(r6)
            r0.append(r6)
            int r5 = r5 + 1
            goto Lb
        L22:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public double e() {
            r2 = this;
            double r0 = r2.f717c
            return r0
    }

    public void g(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.h(r2, r0)
            return
    }

    public void i(double r1) {
            r0 = this;
            r0.f(r1)
            return
    }

    public void j() {
            r2 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.i(r0)
            return
    }

    public void k() {
            r1 = this;
            r0 = 1
            r1.m(r0)
            return
    }

    public void l() {
            r1 = this;
            r0 = -1
            r1.m(r0)
            return
    }
}
