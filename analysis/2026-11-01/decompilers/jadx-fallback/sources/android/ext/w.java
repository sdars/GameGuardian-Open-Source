package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.nio.ByteBuffer f1287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f1288b;

    public w(byte[] r2) {
            r1 = this;
            r1.<init>()
            r1.f1288b = r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            r1.f1287a = r2
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            return
    }

    public int a() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f1287a
            int r0 = r0.position()
            return r0
    }

    public byte b() {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.f1287a
            int r0 = r0.position()
            java.nio.ByteBuffer r1 = r3.f1287a
            r2 = 1
            r1.position(r2)
            byte r1 = r3.e()     // Catch: java.io.IOException -> L11
            goto L18
        L11:
            r1 = move-exception
            java.lang.String r2 = "getSeq fail"
            android.ext.e1.l(r2, r1)
            r1 = -1
        L18:
            java.nio.ByteBuffer r2 = r3.f1287a
            r2.position(r0)
            return r1
    }

    public void c(byte[] r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f1287a
            r0.get(r2)
            return
    }

    public void d(byte[] r2, int r3, int r4) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f1287a
            r0.get(r2, r3, r4)
            return
    }

    public byte e() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f1287a
            byte r0 = r0.get()
            return r0
    }

    public int f() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f1287a
            int r0 = r0.getInt()
            return r0
    }

    public long g() {
            r4 = this;
            boolean r0 = android.ext.InOut.m
            if (r0 == 0) goto Lb
            java.nio.ByteBuffer r0 = r4.f1287a
            long r0 = r0.getLong()
            return r0
        Lb:
            int r0 = r4.f()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    public long h() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f1287a
            long r0 = r0.getLong()
            return r0
    }

    public java.lang.String i(int r6, java.lang.String r7) {
            r5 = this;
            if (r6 != 0) goto L5
            java.lang.String r6 = ""
            return r6
        L5:
            java.nio.ByteBuffer r0 = r5.f1287a
            int r0 = r0.position()
            byte[] r1 = r5.f1288b
            if (r7 == 0) goto L26
            int r2 = r7.length()
            if (r2 != r6) goto L26
            r2 = 0
        L16:
            if (r2 >= r6) goto L27
            char r3 = r7.charAt(r2)
            int r4 = r0 + r2
            r4 = r1[r4]
            if (r3 == r4) goto L23
            goto L26
        L23:
            int r2 = r2 + 1
            goto L16
        L26:
            r7 = 0
        L27:
            if (r7 != 0) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r0, r6)
        L2e:
            java.nio.ByteBuffer r1 = r5.f1287a
            int r0 = r0 + r6
            r1.position(r0)
            return r7
    }

    public void j() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f1287a
            r1 = 2
            r0.position(r1)
            return
    }

    public int k() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f1287a
            int r0 = r0.capacity()
            return r0
    }

    public void l(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f1287a
            int r1 = r0.position()
            int r1 = r1 + r3
            r0.position(r1)
            return
    }
}
