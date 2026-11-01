package d;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class d {
    static {
            return
    }

    public static int[] a(int[] r2, int r3, int r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = c(r3)
            int[] r0 = new int[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    public static java.lang.Object[] b(java.lang.Object[] r2, int r3, java.lang.Object r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = c(r3)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L1c:
            r2[r3] = r4
            return r2
    }

    public static int c(int r1) {
            r0 = 4
            if (r1 > r0) goto L6
            r1 = 8
            goto L8
        L6:
            int r1 = r1 * 2
        L8:
            return r1
    }

    public static long[] d(long[] r2, int r3, int r4, long r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            int r3 = c(r3)
            long[] r3 = new long[r3]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r6 = r2.length
            int r6 = r6 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r6)
            return r3
    }

    public static java.lang.Object[] e(java.lang.Object[] r2, int r3, int r4, java.lang.Object r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r3 = c(r3)
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r0, r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r0 = r2.length
            int r0 = r0 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r0)
            return r3
    }

    public static boolean[] f(boolean[] r2, int r3, int r4, boolean r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            int r3 = c(r3)
            boolean[] r3 = new boolean[r3]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r0 = r2.length
            int r0 = r0 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r0)
            return r3
    }
}
