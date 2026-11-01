package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class g extends java.util.zip.ZipOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.ext.g.a f980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.zip.ZipEntry f981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.zip.CRC32 f982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f984f;

    private static class a extends java.io.OutputStream {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static android.ext.g.a f985c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.io.OutputStream f986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f987b;

        public a(java.io.OutputStream r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f987b = r0
                r1.f986a = r2
                android.ext.g.a.f985c = r1
                return
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                java.io.OutputStream r0 = r1.f986a
                r0.close()
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                java.io.OutputStream r0 = r1.f986a
                boolean r2 = r0.equals(r2)
                return r2
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
                r1 = this;
                java.io.OutputStream r0 = r1.f986a
                r0.flush()
                return
        }

        public int hashCode() {
                r1 = this;
                java.io.OutputStream r0 = r1.f986a
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.io.OutputStream r0 = r1.f986a
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // java.io.OutputStream
        public void write(int r2) {
                r1 = this;
                java.io.OutputStream r0 = r1.f986a
                r0.write(r2)
                int r2 = r1.f987b
                int r2 = r2 + 1
                r1.f987b = r2
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2) {
                r1 = this;
                java.io.OutputStream r0 = r1.f986a
                r0.write(r2)
                int r0 = r1.f987b
                int r2 = r2.length
                int r0 = r0 + r2
                r1.f987b = r0
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) {
                r1 = this;
                java.io.OutputStream r0 = r1.f986a
                r0.write(r2, r3, r4)
                int r2 = r1.f987b
                int r2 = r2 + r4
                r1.f987b = r2
                return
        }
    }

    public g(java.io.OutputStream r4) {
            r3 = this;
            android.ext.g$a r0 = new android.ext.g$a
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream
            r2 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r4, r2)
            r0.<init>(r1)
            r3.<init>(r0)
            r4 = 0
            r3.f979a = r4
            r0 = 0
            r3.f981c = r0
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            r3.f982d = r1
            r3.f983e = r4
            r3.f984f = r0
            android.ext.g$a r4 = android.ext.g.a.f985c
            r3.f980b = r4
            java.lang.String r4 = ""
            r3.setComment(r4)
            return
    }

    public static java.lang.String a(java.util.zip.ZipEntry r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = "null"
            goto L49
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getName()
            r0.append(r1)
            java.lang.String r1 = ", method: "
            r0.append(r1)
            int r1 = r3.getMethod()
            r0.append(r1)
            java.lang.String r1 = ", crc: 0x"
            r0.append(r1)
            long r1 = r3.getCrc()
            java.lang.String r1 = java.lang.Long.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ", size: "
            r0.append(r1)
            long r1 = r3.getSize()
            r0.append(r1)
            java.lang.String r1 = ", compressed size: "
            r0.append(r1)
            long r1 = r3.getCompressedSize()
            r0.append(r1)
            java.lang.String r3 = r0.toString()
        L49:
            return r3
    }

    @Override // java.util.zip.ZipOutputStream
    public void closeEntry() {
            r6 = this;
            java.util.zip.ZipEntry r0 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            if (r0 == 0) goto Lc7
            int r0 = r0.getMethod()     // Catch: java.util.zip.ZipException -> L4e
            if (r0 != 0) goto Lc7
            java.util.zip.ZipEntry r0 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            long r0 = r0.getCrc()     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.CRC32 r2 = r6.f982d     // Catch: java.util.zip.ZipException -> L4e
            long r2 = r2.getValue()     // Catch: java.util.zip.ZipException -> L4e
            java.lang.String r4 = " != "
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.util.zip.ZipException -> L4e
            r0.<init>()     // Catch: java.util.zip.ZipException -> L4e
            java.lang.String r1 = "CRC mismatch: "
            r0.append(r1)     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.ZipEntry r1 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            java.lang.String r1 = a(r1)     // Catch: java.util.zip.ZipException -> L4e
            r0.append(r1)     // Catch: java.util.zip.ZipException -> L4e
            r0.append(r4)     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.CRC32 r1 = r6.f982d     // Catch: java.util.zip.ZipException -> L4e
            long r1 = r1.getValue()     // Catch: java.util.zip.ZipException -> L4e
            r0.append(r1)     // Catch: java.util.zip.ZipException -> L4e
            java.lang.String r0 = r0.toString()     // Catch: java.util.zip.ZipException -> L4e
            android.ext.e1.p(r0)     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.ZipEntry r0 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.CRC32 r1 = r6.f982d     // Catch: java.util.zip.ZipException -> L4e
            long r1 = r1.getValue()     // Catch: java.util.zip.ZipException -> L4e
            r0.setCrc(r1)     // Catch: java.util.zip.ZipException -> L4e
            goto L51
        L4e:
            r0 = move-exception
            goto Ld8
        L51:
            java.util.zip.ZipEntry r0 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            long r0 = r0.getSize()     // Catch: java.util.zip.ZipException -> L4e
            int r2 = r6.f983e     // Catch: java.util.zip.ZipException -> L4e
            long r2 = (long) r2     // Catch: java.util.zip.ZipException -> L4e
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L88
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.util.zip.ZipException -> L4e
            r0.<init>()     // Catch: java.util.zip.ZipException -> L4e
            java.lang.String r1 = "Size mismatch: "
            r0.append(r1)     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.ZipEntry r1 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            java.lang.String r1 = a(r1)     // Catch: java.util.zip.ZipException -> L4e
            r0.append(r1)     // Catch: java.util.zip.ZipException -> L4e
            r0.append(r4)     // Catch: java.util.zip.ZipException -> L4e
            int r1 = r6.f983e     // Catch: java.util.zip.ZipException -> L4e
            r0.append(r1)     // Catch: java.util.zip.ZipException -> L4e
            java.lang.String r0 = r0.toString()     // Catch: java.util.zip.ZipException -> L4e
            android.ext.e1.p(r0)     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.ZipEntry r0 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            int r1 = r6.f983e     // Catch: java.util.zip.ZipException -> L4e
            long r1 = (long) r1     // Catch: java.util.zip.ZipException -> L4e
            r0.setSize(r1)     // Catch: java.util.zip.ZipException -> L4e
        L88:
            java.util.zip.ZipEntry r0 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            long r0 = r0.getCompressedSize()     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.ZipEntry r2 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            long r2 = r2.getSize()     // Catch: java.util.zip.ZipException -> L4e
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto Lc7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.util.zip.ZipException -> L4e
            r0.<init>()     // Catch: java.util.zip.ZipException -> L4e
            java.lang.String r1 = "CompressedSize mismatch: "
            r0.append(r1)     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.ZipEntry r1 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            java.lang.String r1 = a(r1)     // Catch: java.util.zip.ZipException -> L4e
            r0.append(r1)     // Catch: java.util.zip.ZipException -> L4e
            r0.append(r4)     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.ZipEntry r1 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            long r1 = r1.getSize()     // Catch: java.util.zip.ZipException -> L4e
            r0.append(r1)     // Catch: java.util.zip.ZipException -> L4e
            java.lang.String r0 = r0.toString()     // Catch: java.util.zip.ZipException -> L4e
            android.ext.e1.p(r0)     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.ZipEntry r0 = r6.f981c     // Catch: java.util.zip.ZipException -> L4e
            long r1 = r0.getSize()     // Catch: java.util.zip.ZipException -> L4e
            r0.setCompressedSize(r1)     // Catch: java.util.zip.ZipException -> L4e
        Lc7:
            super.closeEntry()     // Catch: java.util.zip.ZipException -> L4e
            r0 = 0
            r6.f979a = r0     // Catch: java.util.zip.ZipException -> L4e
            r1 = 0
            r6.f981c = r1     // Catch: java.util.zip.ZipException -> L4e
            java.util.zip.CRC32 r1 = r6.f982d     // Catch: java.util.zip.ZipException -> L4e
            r1.reset()     // Catch: java.util.zip.ZipException -> L4e
            r6.f983e = r0     // Catch: java.util.zip.ZipException -> L4e
            return
        Ld8:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed close entry: "
            r2.append(r3)
            java.util.zip.ZipEntry r3 = r6.f981c
            java.lang.String r3 = a(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // java.util.zip.ZipOutputStream
    public void putNextEntry(java.util.zip.ZipEntry r4) {
            r3 = this;
            java.lang.String r0 = ""
            r4.setComment(r0)
            r3.f981c = r4
            boolean r0 = r3.f979a
            if (r0 == 0) goto Le
            r3.closeEntry()
        Le:
            int r0 = r4.getMethod()
            if (r0 != 0) goto L47
            r3.flush()
            android.ext.g$a r0 = r3.f980b
            int r0 = r0.f987b
            int r0 = r0 + 30
            java.lang.String r1 = r4.getName()
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)
            int r1 = r1.length
            int r0 = r0 + r1
            java.lang.String r1 = r4.getName()
            boolean r1 = android.ext.h3.b(r1)
            if (r1 == 0) goto L36
            r1 = 4096(0x1000, float:5.74E-42)
            goto L37
        L36:
            r1 = 4
        L37:
            int r0 = r0 % r1
            int r0 = r1 - r0
            int r0 = r0 % r1
            byte[] r0 = new byte[r0]
            r4.setExtra(r0)
            long r0 = r4.getSize()
            r4.setCompressedSize(r0)
        L47:
            super.putNextEntry(r4)
            r4 = 1
            r3.f979a = r4
            java.util.zip.CRC32 r4 = r3.f982d
            r4.reset()
            r4 = 0
            r3.f983e = r4
            return
    }

    @Override // java.util.zip.ZipOutputStream
    public void setComment(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = ""
            super.setComment(r1)
            return
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r4) {
            r3 = this;
            byte[] r0 = r3.f984f
            r1 = 1
            if (r0 != 0) goto L9
            byte[] r0 = new byte[r1]
            r3.f984f = r0
        L9:
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2 = 0
            r0[r2] = r4
            r3.write(r0, r2, r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.write(r3, r1, r0)
            return
    }

    @Override // java.util.zip.ZipOutputStream, java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) {
            r1 = this;
            super.write(r2, r3, r4)
            java.util.zip.CRC32 r0 = r1.f982d
            r0.update(r2, r3, r4)
            int r2 = r1.f983e
            int r2 = r2 + r4
            r1.f983e = r2
            return
    }
}
