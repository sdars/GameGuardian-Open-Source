package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class InOut {
    public static volatile int byteOrderMask = 15;
    public static volatile boolean m;
    public static volatile int n;
    static boolean o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.io.InputStream f174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.io.OutputStream f175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.nio.ByteBuffer f177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.nio.ByteBuffer f179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f180g;
    private int h;
    private boolean i;
    private final java.util.ArrayList j;
    private volatile boolean k;
    private java.util.zip.CRC32 l;

    private static class a extends java.io.InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.io.InputStream f181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f182b;

        public a(java.io.InputStream r1) {
                r0 = this;
                r0.<init>()
                r0.f181a = r1
                r1 = -2017(0xfffffffffffff81f, float:NaN)
                r0.f182b = r1
                return
        }

        @Override // java.io.InputStream
        public int read() {
                r6 = this;
                int r0 = r6.f182b
                r1 = -2017(0xfffffffffffff81f, float:NaN)
                if (r0 == r1) goto L9
                r6.f182b = r1
                return r0
            L9:
                java.io.InputStream r0 = r6.f181a
                int r1 = r0.read()
                r2 = -1
                r3 = 97
                if (r1 < r3) goto L31
                r4 = 112(0x70, float:1.57E-43)
                if (r1 > r4) goto L31
                int r5 = r1 + (-97)
                int r0 = r0.read()
                if (r0 < r3) goto L27
                if (r0 > r4) goto L27
                int r0 = r0 - r3
                int r0 = r0 * 16
                int r5 = r5 + r0
                return r5
            L27:
                if (r0 == r2) goto L2c
                r6.f182b = r0
                return r1
            L2c:
                java.io.EOFException r0 = android.ext.InOut.a()
                throw r0
            L31:
                if (r1 == r2) goto L34
                return r1
            L34:
                java.io.EOFException r0 = android.ext.InOut.a()
                throw r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r10, int r11, int r12) {
                r9 = this;
                int r12 = r12 + r11
                int r0 = r9.f182b
                java.io.InputStream r1 = r9.f181a
            L5:
                if (r11 >= r12) goto L4a
                r2 = -2017(0xfffffffffffff81f, float:NaN)
                r3 = -1
                if (r0 == r2) goto L11
                if (r0 == r3) goto Lf
                goto L3e
            Lf:
                r0 = -2017(0xfffffffffffff81f, float:NaN)
            L11:
                int r2 = r1.read()
                r4 = 97
                if (r2 < r4) goto L3b
                r5 = 112(0x70, float:1.57E-43)
                if (r2 > r5) goto L3b
                int r6 = r2 + (-97)
                int r7 = r1.read()
                if (r7 < r4) goto L31
                if (r7 > r5) goto L31
                int r7 = r7 + (-97)
                int r7 = r7 * 16
                int r2 = r6 + r7
            L2d:
                r8 = r2
                r2 = r0
                r0 = r8
                goto L3e
            L31:
                if (r7 == r3) goto L36
                r0 = r2
                r2 = r7
                goto L3e
            L36:
                java.io.EOFException r10 = android.ext.InOut.a()
                throw r10
            L3b:
                if (r2 == r3) goto L45
                goto L2d
            L3e:
                byte r0 = (byte) r0
                r10[r11] = r0
                int r11 = r11 + 1
                r0 = r2
                goto L5
            L45:
                java.io.EOFException r10 = android.ext.InOut.a()
                throw r10
            L4a:
                r9.f182b = r0
                r10 = 0
                return r10
        }
    }

    private static class b extends java.io.OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.io.OutputStream f183a;

        public b(java.io.OutputStream r1) {
                r0 = this;
                r0.<init>()
                r0.f183a = r1
                return
        }

        private byte[] a(byte[] r8, int r9, int r10) {
                r7 = this;
                int r0 = r10 * 2
                int r1 = r0 + 4
                byte[] r1 = new byte[r1]
                r2 = 0
                r3 = 59
                r1[r2] = r3
                r4 = 1
                r1[r4] = r3
            Le:
                if (r2 >= r10) goto L31
                int r3 = r9 + r2
                r3 = r8[r3]
                int r4 = r2 * 2
                int r5 = r4 + 2
                r6 = r3 & 15
                int r6 = r7.b(r6)
                byte r6 = (byte) r6
                r1[r5] = r6
                int r4 = r4 + 3
                r3 = r3 & 240(0xf0, float:3.36E-43)
                int r3 = r3 >> 4
                int r3 = r7.b(r3)
                byte r3 = (byte) r3
                r1[r4] = r3
                int r2 = r2 + 1
                goto Le
            L31:
                int r8 = r0 + 2
                r9 = 10
                r1[r8] = r9
                int r0 = r0 + 3
                r1[r0] = r9
                return r1
        }

        private int b(int r2) {
                r1 = this;
                if (r2 < 0) goto L8
                r0 = 15
                if (r2 > r0) goto L8
                int r2 = r2 + 97
            L8:
                return r2
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
                r1 = this;
                java.io.OutputStream r0 = r1.f183a
                r0.flush()
                return
        }

        @Override // java.io.OutputStream
        public void write(int r3) {
                r2 = this;
                java.io.OutputStream r0 = r2.f183a
                r1 = r3 & 15
                int r1 = r2.b(r1)
                r0.write(r1)
                java.io.OutputStream r0 = r2.f183a
                r3 = r3 & 240(0xf0, float:3.36E-43)
                int r3 = r3 >> 4
                int r3 = r2.b(r3)
                r0.write(r3)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r4) {
                r3 = this;
                java.io.OutputStream r0 = r3.f183a
                int r1 = r4.length
                r2 = 0
                byte[] r4 = r3.a(r4, r2, r1)
                r0.write(r4)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) {
                r1 = this;
                java.io.OutputStream r0 = r1.f183a
                byte[] r2 = r1.a(r2, r3, r4)
                r0.write(r2)
                return
        }
    }

    static {
            r0 = 0
            java.lang.String[] r1 = android.os.Build.SUPPORTED_64_BIT_ABIS     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto Le
            int r1 = r1.length     // Catch: java.lang.Throwable -> La
            if (r1 <= 0) goto Le
            r1 = 1
            goto Lf
        La:
            r1 = move-exception
            android.ext.e1.a(r1)
        Le:
            r1 = 0
        Lf:
            p(r1)
            android.ext.InOut.o = r0
            return
    }

    public InOut() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.l = r0
            r2.f174a = r0
            r2.f175b = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r2.f176c = r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r2.f177d = r0
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            r0 = 8
            byte[] r0 = new byte[r0]
            r2.f178e = r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r2.f179f = r0
            r0.order(r1)
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r2.f180g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.j = r0
            r0 = 0
            r2.k = r0
            return
    }

    static /* synthetic */ java.io.EOFException a() {
            java.io.EOFException r0 = f()
            return r0
    }

    static java.lang.String b(byte[] r7, int r8, int r9) {
            int r0 = r7.length
            int r0 = r0 + (-1)
            r1 = 32
            if (r0 >= r8) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "bytesToHex failed: "
            r0.append(r2)
            int r7 = r7.length
            r0.append(r7)
            r0.append(r1)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r7 = r0.toString()
            android.ext.e1.p(r7)
            java.lang.String r7 = ""
            return r7
        L2b:
            int r0 = r7.length
            int r2 = r8 + r9
            if (r0 >= r2) goto L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "bytesToHex fix len: "
            r0.append(r2)
            int r2 = r7.length
            r0.append(r2)
            r0.append(r1)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.ext.e1.p(r9)
            int r9 = r7.length
            int r9 = r9 - r8
        L53:
            int r0 = r9 * 3
            char[] r0 = new char[r0]
            char[] r2 = android.ext.x0.f1306a
            r3 = 0
        L5a:
            if (r3 >= r9) goto L79
            int r4 = r8 + r3
            r4 = r7[r4]
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r3 * 3
            int r5 = r5 >>> 4
            char r5 = r2[r5]
            r0[r6] = r5
            int r5 = r6 + 1
            r4 = r4 & 15
            char r4 = r2[r4]
            r0[r5] = r4
            int r6 = r6 + 2
            r0[r6] = r1
            int r3 = r3 + 1
            goto L5a
        L79:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
            return r7
    }

    private void c(int r4, boolean r5) {
            r3 = this;
            byte[] r0 = r3.f180g
            int r1 = r3.h
            int r4 = r4 + r1
            int r2 = r0.length
            if (r4 > r2) goto La
            if (r5 == 0) goto L16
        La:
            int r4 = r4 + 1024
            byte[] r4 = new byte[r4]
            if (r1 <= 0) goto L14
            r5 = 0
            java.lang.System.arraycopy(r0, r5, r4, r5, r1)
        L14:
            r3.f180g = r4
        L16:
            return
    }

    private static java.io.EOFException f() {
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.String r1 = "daemon stream closed (EOF)"
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String g(byte[] r6, int r7, int r8) {
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 32
            if (r0 >= r7) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "dump failed: "
            r0.append(r2)
            int r6 = r6.length
            r0.append(r6)
            r0.append(r1)
            r0.append(r7)
            r0.append(r1)
            r0.append(r8)
            java.lang.String r6 = r0.toString()
            android.ext.e1.p(r6)
            java.lang.String r6 = ""
            return r6
        L2b:
            int r0 = r6.length
            int r2 = r7 + r8
            if (r0 >= r2) goto L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "dump fix len: "
            r0.append(r2)
            int r2 = r6.length
            r0.append(r2)
            r0.append(r1)
            r0.append(r7)
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            android.ext.e1.p(r8)
            int r8 = r6.length
            int r8 = r8 - r7
        L53:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r7
        L59:
            if (r2 >= r8) goto L7e
            int r3 = r8 - r2
            if (r3 <= r1) goto L61
            r3 = 32
        L61:
            int r4 = r7 + r2
            java.lang.String r5 = b(r6, r4, r3)
            r0.append(r5)
            r5 = 39
            r0.append(r5)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6, r4, r3)
            r0.append(r5)
            java.lang.String r4 = "'\n"
            r0.append(r4)
            int r2 = r2 + r3
            goto L59
        L7e:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private byte i() {
            r2 = this;
            java.io.InputStream r0 = r2.f174a
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto Lb
            byte r0 = (byte) r0
            return r0
        Lb:
            java.io.EOFException r0 = f()
            throw r0
    }

    private int j() {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 4
            if (r1 >= r2) goto L1b
            java.io.InputStream r2 = r5.f174a
            byte[] r3 = r5.f176c
            int r4 = 4 - r1
            int r2 = r2.read(r3, r1, r4)
            if (r2 < 0) goto L16
            if (r2 != 0) goto L14
            goto L1b
        L14:
            int r1 = r1 + r2
            goto L2
        L16:
            java.io.EOFException r0 = f()
            throw r0
        L1b:
            java.nio.ByteBuffer r1 = r5.f177d
            int r0 = r1.getInt(r0)
            return r0
    }

    static void p(boolean r0) {
            android.ext.InOut.m = r0
            if (r0 == 0) goto L7
            r0 = 8
            goto L8
        L7:
            r0 = 4
        L8:
            android.ext.InOut.n = r0
            return
    }

    public void d() {
            r1 = this;
            r0 = 0
            r1.h = r0
            return
    }

    public long e() {
            r4 = this;
            int r0 = r4.h
            r1 = 2
            if (r0 >= r1) goto L8
            r0 = 0
            return r0
        L8:
            java.util.zip.CRC32 r0 = r4.l
            if (r0 != 0) goto L14
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r4.l = r0
            goto L17
        L14:
            r0.reset()
        L17:
            byte[] r2 = r4.f180g
            int r3 = r4.h
            r0.update(r2, r1, r3)
            long r0 = r0.getValue()
            return r0
    }

    public boolean h() {
            r1 = this;
            boolean r0 = r1.k
            return r0
    }

    public byte[] k() {
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = 0
        L4:
            byte r4 = r8.i()
            r5 = 2
            r6 = 10
            if (r4 == r5) goto L49
            if (r2 != 0) goto L16
            if (r4 == r6) goto L4
            r5 = 59
            if (r4 != r5) goto L16
            goto L4
        L16:
            if (r2 != 0) goto L1c
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]
        L1c:
            int r5 = r2.length
            if (r3 >= r5) goto L21
            r2[r3] = r4
        L21:
            int r3 = r3 + 1
            int r5 = r2.length
            if (r3 >= r5) goto L2a
            int r5 = r3 % 10
            if (r5 != 0) goto L4
        L2a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Bad input from daemon: "
            r5.append(r7)
            r5.append(r4)
            r5.append(r6)
            java.lang.String r4 = g(r2, r1, r3)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.ext.e1.d(r4)
            goto L4
        L49:
            if (r2 == 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Bad input from daemon 2: "
            r4.append(r7)
            r4.append(r3)
            r4.append(r6)
            java.lang.String r2 = g(r2, r1, r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.ext.e1.d(r2)
        L69:
            int r2 = r8.j()
            r3 = 10485760(0xa00000, float:1.469368E-38)
            if (r2 > r3) goto Lc5
            if (r2 >= r5) goto L74
            goto Lc5
        L74:
            byte[] r3 = new byte[r2]
            r4 = 0
        L77:
            if (r4 >= r2) goto L90
            java.io.InputStream r5 = r8.f174a
            int r6 = r2 - r4
            int r5 = r5.read(r3, r4, r6)
            if (r5 < 0) goto L8b
            if (r5 != 0) goto L89
            if (r4 != 0) goto L90
            r4 = -1
            goto L90
        L89:
            int r4 = r4 + r5
            goto L77
        L8b:
            java.io.EOFException r0 = f()
            throw r0
        L90:
            int r2 = r2 + (-1)
            r5 = r3[r2]
            r6 = 3
            if (r5 == r6) goto Lc4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Bad end from daemon: "
            r5.append(r6)
            r6 = r3[r2]
            r5.append(r6)
            java.lang.String r6 = "; "
            r5.append(r6)
            r1 = r3[r1]
            r5.append(r1)
            r5.append(r6)
            r5.append(r2)
            r5.append(r6)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
        Lc0:
            android.ext.e1.d(r1)
            return r0
        Lc4:
            return r3
        Lc5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Bad len from daemon: "
            r3.append(r4)
            r3.append(r2)
            r2 = 32
            r3.append(r2)
            byte[] r2 = r8.f176c
            r4 = 4
            java.lang.String r1 = g(r2, r1, r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto Lc0
    }

    public synchronized void l() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.k     // Catch: java.lang.Throwable -> L33
            r1 = 0
            if (r0 != 0) goto L35
            int r0 = r5.h     // Catch: java.lang.Throwable -> L33
            if (r0 <= 0) goto L46
            java.util.ArrayList r0 = r5.j     // Catch: java.lang.Throwable -> L33
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList r2 = r5.j     // Catch: java.lang.Throwable -> L2d
            byte[] r3 = r5.f180g     // Catch: java.lang.Throwable -> L2d
            int r4 = r5.h     // Catch: java.lang.Throwable -> L2d
            byte[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: java.lang.Throwable -> L2d
            r2.add(r3)     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r2 = r5.j     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2d
            r3 = 40
            if (r2 <= r3) goto L2f
            java.util.ArrayList r2 = r5.j     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = r2.remove(r1)     // Catch: java.lang.Throwable -> L2d
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r1 = move-exception
            goto L31
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            goto L46
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r1     // Catch: java.lang.Throwable -> L33
        L33:
            r0 = move-exception
            goto L4a
        L35:
            r5.m()     // Catch: java.lang.Throwable -> L33
            java.io.OutputStream r0 = r5.f175b     // Catch: java.lang.Throwable -> L33
            byte[] r2 = r5.f180g     // Catch: java.lang.Throwable -> L33
            int r3 = r5.h     // Catch: java.lang.Throwable -> L33
            r0.write(r2, r1, r3)     // Catch: java.lang.Throwable -> L33
            java.io.OutputStream r0 = r5.f175b     // Catch: java.lang.Throwable -> L33
            r0.flush()     // Catch: java.lang.Throwable -> L33
        L46:
            r5.h = r1     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)
            return
        L4a:
            monitor-exit(r5)
            throw r0
    }

    public void m() {
            r4 = this;
            java.util.ArrayList r0 = r4.j
            monitor-enter(r0)
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L22
            if (r1 <= 0) goto L2a
            java.io.OutputStream r1 = r4.f175b     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L22
        Lf:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L22
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L22
            r1.write(r3)     // Catch: java.lang.Throwable -> L22
            r1.flush()     // Catch: java.lang.Throwable -> L22
            goto Lf
        L22:
            r1 = move-exception
            goto L2c
        L24:
            r0.clear()     // Catch: java.lang.Throwable -> L22
            r0.trimToSize()     // Catch: java.lang.Throwable -> L22
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    public void n(boolean r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void o(java.io.InputStream r3, java.io.OutputStream r4) {
            r2 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = 65536(0x10000, float:9.1835E-41)
            r0.<init>(r3, r1)
            boolean r3 = android.ext.InOut.o
            if (r3 != 0) goto L17
            android.ext.InOut$b r3 = new android.ext.InOut$b
            r3.<init>(r4)
            android.ext.InOut$a r4 = new android.ext.InOut$a
            r4.<init>(r0)
            r0 = r4
            r4 = r3
        L17:
            r2.f174a = r0
            r2.f175b = r4
            return
    }

    public void q(byte r3, byte r4, int r5) {
            r2 = this;
            r0 = 2
            int r5 = r5 + r0
            boolean r1 = r2.i
            r2.c(r5, r1)
            r5 = 0
            r2.i = r5
            byte[] r1 = r2.f180g
            r1[r5] = r4
            r4 = 1
            r1[r4] = r3
            r2.h = r0
            return
    }

    public void r() {
            r2 = this;
            byte[] r0 = r2.f180g
            int r0 = r0.length
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto La
            r0 = 1
            r2.i = r0
        La:
            return
    }

    public void s(byte r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            r3.c(r0, r1)
            byte[] r0 = r3.f180g
            int r1 = r3.h
            int r2 = r1 + 1
            r3.h = r2
            r0[r1] = r4
            return
    }

    public void t(byte[] r4, int r5) {
            r3 = this;
            r0 = 0
            r3.c(r5, r0)
            byte[] r1 = r3.f180g
            int r2 = r3.h
            java.lang.System.arraycopy(r4, r0, r1, r2, r5)
            int r4 = r3.h
            int r4 = r4 + r5
            r3.h = r4
            return
    }

    public void u(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f179f
            int r1 = android.ext.InOut.byteOrderMask
            r3 = r3 ^ r1
            r1 = 0
            r0.putInt(r1, r3)
            byte[] r3 = r2.f178e
            r0 = 4
            r2.t(r3, r0)
            return
    }

    public void v(long r3) {
            r2 = this;
            boolean r0 = android.ext.InOut.m
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r0 = r2.f179f
            r1 = 0
            r0.putLong(r1, r3)
            byte[] r3 = r2.f178e
            r4 = 8
            r2.t(r3, r4)
            goto L16
        L12:
            int r4 = (int) r3
            r2.u(r4)
        L16:
            return
    }

    public void w(long r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f179f
            r1 = 0
            r0.putLong(r1, r3)
            byte[] r3 = r2.f178e
            r4 = 8
            r2.t(r3, r4)
            return
    }
}
