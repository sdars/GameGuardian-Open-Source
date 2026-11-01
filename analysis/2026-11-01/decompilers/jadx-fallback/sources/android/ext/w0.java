package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class w0 {
    public static final java.lang.String a(java.lang.Object r3, java.lang.String r4) {
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r3 instanceof java.io.File     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L25
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Throwable -> L1f
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L1f
        L13:
            int r1 = r0.read(r3)     // Catch: java.lang.Throwable -> L1f
            r2 = -1
            if (r1 == r2) goto L21
            r2 = 0
            r4.update(r3, r2, r1)     // Catch: java.lang.Throwable -> L1f
            goto L13
        L1f:
            r3 = move-exception
            goto L35
        L21:
            r0.close()     // Catch: java.lang.Throwable -> L1f
            goto L30
        L25:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1f
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L1f
            r4.update(r3)     // Catch: java.lang.Throwable -> L1f
        L30:
            java.lang.String r3 = b(r4)     // Catch: java.lang.Throwable -> L1f
            return r3
        L35:
            java.lang.String r4 = "hash fail"
            android.ext.e1.l(r4, r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static final java.lang.String b(java.security.MessageDigest r3) {
            byte[] r3 = r3.digest()
            r0 = 8
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 4
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
            int r1 = r3.length
            int r1 = r1 - r2
            java.lang.System.arraycopy(r3, r1, r0, r2, r2)
            java.lang.String r3 = android.ext.Tools.l(r0)
            return r3
    }
}
