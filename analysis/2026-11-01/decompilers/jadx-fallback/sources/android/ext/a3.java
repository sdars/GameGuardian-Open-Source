package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f573c;

    public a3(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f572b = r0
            r1.f573c = r2
            r2 = 32
            int[] r2 = new int[r2]
            r1.f571a = r2
            return
    }

    private void b() {
            r5 = this;
            int r0 = r5.f572b
            int[] r1 = r5.f571a
            int r2 = r0 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r3)
            r3 = 0
        L10:
            if (r3 >= r0) goto L1a
            r4 = r1[r3]
            r2.putInt(r4)
            int r3 = r3 + 1
            goto L10
        L1a:
            byte[] r0 = r2.array()
            r1 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            android.ext.g2 r1 = new android.ext.g2
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "used-"
            r2.append(r3)
            int r3 = r5.f573c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.ext.g2 r0 = r1.j(r2, r0)
            r0.commit()
            return
    }

    public void a(int r5) {
            r4 = this;
            int r0 = r4.f572b
            int[] r1 = r4.f571a
            r2 = 0
        L5:
            if (r2 >= r0) goto Lf
            r3 = r1[r2]
            if (r3 != r5) goto Lc
            return
        Lc:
            int r2 = r2 + 1
            goto L5
        Lf:
            int r2 = r1.length
            if (r0 != r2) goto L1b
            int r2 = r1.length
            int r2 = r2 + 32
            int[] r1 = java.util.Arrays.copyOf(r1, r2)
            r4.f571a = r1
        L1b:
            r1[r0] = r5
            int r0 = r0 + 1
            r4.f572b = r0
            r4.b()
            return
    }
}
