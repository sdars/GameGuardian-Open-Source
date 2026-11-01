package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d.f[] f700a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f702b;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public d() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public d(int r5) {
            r4 = this;
            r4.<init>()
            r0 = 7
            d.f[] r1 = new d.f[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L13
            d.f r3 = new d.f
            r3.<init>(r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L13:
            r4.f700a = r1
            return
    }

    public void a(long r2, int r4, android.ext.d.a r5) {
            r1 = this;
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            r0 = 7
            if (r4 >= r0) goto L1b
            d.f[] r0 = r1.f700a
            r4 = r0[r4]
            int r2 = r4.b(r2)
            if (r2 < 0) goto L1b
            long r2 = r4.g(r2)
            r5.f701a = r2
            r2 = 1
        L18:
            r5.f702b = r2
            return
        L1b:
            r2 = 0
            goto L18
    }

    public java.util.List b() {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            d.f[] r1 = r11.f700a
            r2 = 0
            r3 = 0
        L9:
            r4 = 7
            if (r3 >= r4) goto L4b
            r4 = r1[r3]
            int r5 = r4.e()
            if (r5 > 0) goto L15
            goto L48
        L15:
            r6 = 1
            int r6 = r6 << r3
            r7 = 0
        L18:
            if (r7 >= r5) goto L48
            android.ext.c r8 = new android.ext.c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            r8.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            r8.f674c = r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            long r9 = r4.c(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            r8.f672a = r9     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            long r9 = r4.g(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            r8.f673b = r9     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            r0.add(r8)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            int r7 = r7 + 1
            goto L18
        L33:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Concurent modification for "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.ext.e1.s(r5, r4)
        L48:
            int r3 = r3 + 1
            goto L9
        L4b:
            return r0
    }

    public boolean c(long r2, int r4, long r5) {
            r1 = this;
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            r0 = 7
            if (r4 >= r0) goto L10
            d.f[] r0 = r1.f700a
            r4 = r0[r4]
            boolean r2 = r4.d(r2, r5)
            return r2
        L10:
            r2 = 0
            return r2
    }

    public void d() {
            r11 = this;
            d.f[] r0 = r11.f700a
            r1 = 0
            r2 = 0
            r3 = 0
        L5:
            r4 = 7
            if (r2 >= r4) goto L4d
            r4 = r0[r2]
            int r5 = r4.e()
            if (r5 > 0) goto L11
            goto L4a
        L11:
            r6 = 1
            if (r3 != 0) goto L15
            r3 = 1
        L15:
            int r6 = r6 << r2
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            r6 = r6 | r7
            r7 = 0
        L1a:
            if (r7 >= r5) goto L4a
            android.ext.c r8 = new android.ext.c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            r8.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            r8.f674c = r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            long r9 = r4.c(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            r8.f672a = r9     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            long r9 = r4.g(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            r8.f673b = r9     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            r8.a()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            int r7 = r7 + 1
            goto L1a
        L35:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Concurent modification for "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            android.ext.e1.s(r5, r4)
        L4a:
            int r2 = r2 + 1
            goto L5
        L4d:
            if (r3 == 0) goto L54
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.e0()
        L54:
            return
    }

    public int e() {
            r4 = this;
            d.f[] r0 = r4.f700a
            r1 = 0
            r2 = 0
        L4:
            r3 = 7
            if (r1 >= r3) goto L11
            r3 = r0[r1]
            int r3 = r3.e()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L4
        L11:
            return r2
    }

    public void f() {
            r3 = this;
            d.f[] r0 = r3.f700a
            r1 = 0
        L3:
            r2 = 7
            if (r1 >= r2) goto Le
            r2 = r0[r1]
            r2.f()
            int r1 = r1 + 1
            goto L3
        Le:
            return
    }
}
