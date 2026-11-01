package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long[] f1004a;

    static {
            r0 = 12
            long[] r0 = new long[r0]
            android.ext.i0.f1004a = r0
            r0 = 0
        L7:
            r1 = 3
            if (r0 >= r1) goto L2d
            r2 = 1
            int r3 = r2 << r0
            int r3 = r3 * 8
            r4 = 1
            long r6 = r4 << r3
            long r6 = r6 - r4
            long r2 = r6 >> r2
            long r4 = ~r2
            long r8 = r6 & r4
            int r10 = r0 * 4
            long[] r11 = android.ext.i0.f1004a
            r11[r10] = r8
            int r8 = r10 + 1
            r11[r8] = r2
            int r2 = r10 + 2
            r11[r2] = r4
            int r10 = r10 + r1
            r11[r10] = r6
            int r0 = r0 + 1
            goto L7
        L2d:
            return
    }

    public static boolean a(long r9, long r11, int r13) {
            int r13 = android.ext.c.y(r13)
            r0 = 3
            r1 = 0
            r2 = 1
            if (r13 != r0) goto Lf
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto Le
            r1 = 1
        Le:
            return r1
        Lf:
            int r13 = r13 * 4
            long[] r0 = android.ext.i0.f1004a
            r3 = r0[r13]
            long r5 = r9 & r3
            long r3 = r3 & r11
            int r13 = r13 + r2
            r7 = r0[r13]
            long r9 = r9 & r7
            long r11 = r11 & r7
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L27
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L2e
        L25:
            r1 = 1
            goto L2e
        L27:
            r9 = 0
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 == 0) goto L2e
            goto L25
        L2e:
            return r1
    }

    public static long b(long r5, int r7, boolean r8) {
            r0 = 3
            if (r7 == r0) goto L23
            int r7 = r7 * 4
            if (r8 == 0) goto Le
            long[] r8 = android.ext.i0.f1004a
            int r7 = r7 + r0
            r7 = r8[r7]
        Lc:
            long r5 = r5 & r7
            goto L23
        Le:
            long[] r8 = android.ext.i0.f1004a
            r0 = r8[r7]
            long r0 = r0 & r5
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1e
            int r7 = r7 + 1
            r7 = r8[r7]
            goto Lc
        L1e:
            int r7 = r7 + 2
            r7 = r8[r7]
            long r5 = r5 | r7
        L23:
            return r5
    }

    public static java.lang.String c(long r1, int r3) {
            r0 = 0
            java.lang.String r1 = d(r1, r3, r0)
            return r1
    }

    public static java.lang.String d(long r0, int r2, boolean r3) {
            int r2 = android.ext.c.y(r2)
            long r0 = b(r0, r2, r3)
            if (r3 == 0) goto L13
            r3 = 1
            int r2 = r2 + r3
            int r2 = r3 << r2
            java.lang.String r0 = android.ext.t2.e(r2, r0)
            goto L17
        L13:
            java.lang.String r0 = e(r0)
        L17:
            return r0
    }

    private static java.lang.String e(long r4) {
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r2 = "%,d"
            java.lang.String r3 = "%d"
            java.lang.String r0 = android.ext.Tools.M1(r2, r3, r0, r1)
            if (r0 != 0) goto L1a
            java.lang.String r0 = java.lang.Long.toString(r4)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L14:
            r1 = move-exception
            java.lang.String r2 = "Format fail 3"
            android.ext.e1.s(r2, r1)
        L1a:
            if (r0 != 0) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = ""
            r1.append(r2)     // Catch: java.lang.Throwable -> L2e
            r1.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            goto L34
        L2e:
            r4 = move-exception
            java.lang.String r5 = "Format fail 4"
            android.ext.e1.s(r5, r4)
        L34:
            if (r0 != 0) goto L38
            java.lang.String r0 = "fail"
        L38:
            return r0
    }
}
