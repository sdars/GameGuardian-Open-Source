package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class s0 {
    static int a(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L21
            int r1 = r3.length()
            r2 = 40
            if (r1 <= r2) goto Lc
            goto L21
        Lc:
            r1 = 10
            int r1 = r3.indexOf(r1)
            if (r1 < 0) goto L18
            java.lang.String r3 = r3.substring(r0, r1)
        L18:
            java.lang.String r3 = d(r3)     // Catch: java.lang.NumberFormatException -> L21
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L21
            return r3
        L21:
            return r0
    }

    static java.lang.String b(int r1, long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    static boolean c(int r3, long r4, int r6, long r7) {
            r0 = 0
            if (r3 == r6) goto L4
            return r0
        L4:
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto Le
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 > 0) goto Lf
        Le:
            r0 = 1
        Lf:
            return r0
    }

    private static java.lang.String d(java.lang.String r2) {
            java.lang.String r0 = "\r"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L13
            int r0 = r2.length()
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L13:
            return r2
    }

    static long e(java.lang.String r4) {
            r0 = -1
            if (r4 == 0) goto L24
            int r2 = r4.length()
            r3 = 40
            if (r2 <= r3) goto Ld
            goto L24
        Ld:
            r2 = 10
            int r2 = r4.indexOf(r2)
            if (r2 >= 0) goto L16
            return r0
        L16:
            int r2 = r2 + 1
            java.lang.String r4 = r4.substring(r2)     // Catch: java.lang.NumberFormatException -> L24
            java.lang.String r4 = d(r4)     // Catch: java.lang.NumberFormatException -> L24
            long r0 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L24
        L24:
            return r0
    }
}
