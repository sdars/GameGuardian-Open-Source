package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Ls {
    public static void main(java.lang.String[] r4) {
            java.io.File r0 = new java.io.File
            r1 = 0
            r4 = r4[r1]
            r0.<init>(r4)
            java.io.File[] r4 = r0.listFiles()
            if (r4 == 0) goto L22
            int r0 = r4.length
        Lf:
            if (r1 >= r0) goto L22
            r2 = r4[r1]
            if (r2 != 0) goto L16
            goto L1f
        L16:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r2 = r2.getAbsolutePath()
            r3.println(r2)
        L1f:
            int r1 = r1 + 1
            goto Lf
        L22:
            return
    }
}
