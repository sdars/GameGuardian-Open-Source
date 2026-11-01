package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal f1264a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f1265b = null;

    class a extends java.lang.ThreadLocal {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        protected char[] a() {
                r1 = this;
                r0 = 16
                char[] r0 = new char[r0]
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected /* bridge */ /* synthetic */ java.lang.Object initialValue() {
                r1 = this;
                char[] r0 = r1.a()
                return r0
        }
    }

    static {
            android.ext.t2$a r0 = new android.ext.t2$a
            r0.<init>()
            android.ext.t2.f1264a = r0
            r0 = 64
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122} // fill-array
            android.ext.t2.f1265b = r0
            return
    }

    public static java.lang.Appendable a(java.lang.Appendable r1, int r2, char r3, java.lang.String r4) {
            int r0 = r4.length()     // Catch: java.io.IOException -> Le
            int r2 = r2 - r0
            r0 = 0
        L6:
            if (r0 >= r2) goto L10
            r1.append(r3)     // Catch: java.io.IOException -> Le
            int r0 = r0 + 1
            goto L6
        Le:
            r1 = move-exception
            goto L15
        L10:
            java.lang.Appendable r1 = r1.append(r4)     // Catch: java.io.IOException -> Le
            return r1
        L15:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    public static java.lang.String b(int r4, char r5, java.lang.String r6) {
            int r0 = r6.length()
            if (r0 >= r4) goto L1c
            java.lang.ThreadLocal r1 = android.ext.t2.f1264a
            java.lang.Object r1 = r1.get()
            char[] r1 = (char[]) r1
            int r2 = r4 - r0
            r3 = 0
            java.util.Arrays.fill(r1, r3, r2, r5)
            r6.getChars(r3, r0, r1, r2)
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r3, r4)
        L1c:
            return r6
    }

    public static java.lang.Appendable c(java.lang.Appendable r1, int r2, int r3) {
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toUpperCase(r0)
            r0 = 48
            java.lang.Appendable r1 = a(r1, r2, r0, r3)
            return r1
    }

    public static java.lang.Appendable d(java.lang.Appendable r0, int r1, long r2) {
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r3)
            r3 = 48
            java.lang.Appendable r0 = a(r0, r1, r3, r2)
            return r0
    }

    public static java.lang.String e(int r0, long r1) {
            java.lang.String r1 = java.lang.Long.toHexString(r1)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            r2 = 48
            java.lang.String r0 = b(r0, r2, r1)
            return r0
    }

    public static java.lang.String f(java.lang.String r0, java.lang.Object... r1) {
            java.lang.String r0 = android.ext.Tools.L1(r0, r1)
            return r0
    }

    public static java.lang.String g(int r6) {
            r0 = 7
            char[] r0 = new char[r0]
            if (r6 >= 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            if (r1 != 0) goto Lb
            int r6 = -r6
        Lb:
            char[] r2 = android.ext.t2.f1265b
            r3 = 6
        Le:
            r4 = -64
            if (r6 > r4) goto L1f
            int r4 = r3 + (-1)
            int r5 = r6 % 64
            int r5 = -r5
            char r5 = r2[r5]
            r0[r3] = r5
            int r6 = r6 / 64
            r3 = r4
            goto Le
        L1f:
            int r6 = -r6
            char r6 = r2[r6]
            r0[r3] = r6
            if (r1 == 0) goto L2c
            int r3 = r3 + (-1)
            r6 = 45
            r0[r3] = r6
        L2c:
            java.lang.String r6 = new java.lang.String
            int r1 = 7 - r3
            r6.<init>(r0, r3, r1)
            return r6
    }

    public static java.lang.String h(long r9) {
            r0 = 12
            char[] r0 = new char[r0]
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 != 0) goto L10
            long r9 = -r9
        L10:
            char[] r2 = android.ext.t2.f1265b
            r3 = 11
        L14:
            r4 = -64
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 > 0) goto L29
            int r4 = r3 + (-1)
            r5 = 64
            long r7 = r9 % r5
            long r7 = -r7
            int r8 = (int) r7
            char r7 = r2[r8]
            r0[r3] = r7
            long r9 = r9 / r5
            r3 = r4
            goto L14
        L29:
            long r9 = -r9
            int r10 = (int) r9
            char r9 = r2[r10]
            r0[r3] = r9
            if (r1 == 0) goto L37
            int r3 = r3 + (-1)
            r9 = 45
            r0[r3] = r9
        L37:
            java.lang.String r9 = new java.lang.String
            int r10 = 12 - r3
            r9.<init>(r0, r3, r10)
            return r9
    }
}
