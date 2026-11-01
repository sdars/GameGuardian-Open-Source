package android.lang;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class a {
    static {
            return
    }

    public static int a(java.io.FileDescriptor r2) {
            java.lang.Class<java.io.FileDescriptor> r0 = java.io.FileDescriptor.class
            java.lang.String r1 = "descriptor"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L17
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L17
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L17
            return r2
        L17:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed get fd"
            r0.<init>(r1, r2)
            throw r0
    }

    static java.lang.Process b(java.lang.String[] r11, java.util.Map r12, java.lang.String r13, boolean r14) {
            int r0 = r11.length
            r1 = 1
            int r5 = r0 + (-1)
            byte[][] r0 = new byte[r5][]
            r2 = 0
            r4 = r5
            r3 = 0
        L9:
            if (r3 >= r5) goto L19
            int r6 = r3 + 1
            r7 = r11[r6]
            byte[] r7 = r7.getBytes()
            r0[r3] = r7
            int r3 = r7.length
            int r4 = r4 + r3
            r3 = r6
            goto L9
        L19:
            byte[] r4 = new byte[r4]
            r3 = 0
            r6 = 0
        L1d:
            if (r3 >= r5) goto L2b
            r7 = r0[r3]
            int r8 = r7.length
            java.lang.System.arraycopy(r7, r2, r4, r6, r8)
            int r7 = r7.length
            int r7 = r7 + r1
            int r6 = r6 + r7
            int r3 = r3 + 1
            goto L1d
        L2b:
            int[] r0 = new int[r1]
            byte[] r6 = android.lang.ProcessEnvironment.j(r12, r0)
            android.lang.UNIXProcess r12 = new android.lang.UNIXProcess
            r11 = r11[r2]
            byte[] r3 = c(r11)
            r7 = r0[r2]
            byte[] r8 = c(r13)
            r11 = -1
            int[] r9 = new int[]{r11, r11, r11}
            r2 = r12
            r10 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    private static byte[] c(java.lang.String r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            byte[] r4 = r4.getBytes()
            int r0 = r4.length
            int r1 = r0 + 1
            byte[] r1 = new byte[r1]
            int r2 = r4.length
            r3 = 0
            java.lang.System.arraycopy(r4, r3, r1, r3, r2)
            r1[r0] = r3
            return r1
    }
}
