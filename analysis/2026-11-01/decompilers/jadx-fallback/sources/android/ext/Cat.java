package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Cat {
    public static void main(java.lang.String[] r4) {
            r0 = 0
            r4 = r4[r0]
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r4)
        Lc:
            int r4 = r2.read(r1)
            if (r4 < 0) goto L18
            java.io.PrintStream r3 = java.lang.System.out
            r3.write(r1, r0, r4)
            goto Lc
        L18:
            r2.close()
            return
    }
}
