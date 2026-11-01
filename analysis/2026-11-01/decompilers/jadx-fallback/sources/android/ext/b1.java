package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class b1 {
    static final boolean[] A = null;
    static android.ext.b1 B;
    static volatile android.ext.b1.c0 C;
    private static final java.lang.Object D = null;
    public static volatile java.lang.ref.WeakReference E;
    private static final java.lang.Runnable F = null;
    public static volatile java.lang.ref.WeakReference G;
    public static volatile java.lang.ref.WeakReference H;
    public static volatile java.lang.ref.WeakReference I;
    private static volatile int J;
    private static volatile boolean K;
    static volatile int L;
    private static final byte[] M = null;
    private static volatile java.lang.ref.WeakReference N;
    private static java.lang.String O;
    private static final java.lang.Object P = null;
    private static final java.lang.String[] t = null;
    private static final java.lang.String[] u = null;
    private static final java.lang.String[] v = null;
    private static final java.util.regex.Pattern w = null;
    private static final java.lang.String[] x = null;
    static byte y;
    static byte[][] z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.RandomAccessFile[] f592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.io.File f593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.io.File f594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    java.io.File f595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f598g;
    private final java.lang.String h;
    private final java.lang.String i;
    private final int j;
    private final android.ext.b1.w[] k;
    private final java.security.MessageDigest l;
    private final java.security.MessageDigest m;
    private final java.security.MessageDigest n;
    private java.util.jar.Manifest o;
    private java.util.Map p;
    private java.util.Set q;
    volatile android.app.AlertDialog r;
    private byte[] s;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.Intent[] f600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.lang.String f602d;

        /* JADX INFO: renamed from: android.ext.b1$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0012a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.b1.a f603a;

            DialogInterfaceOnClickListenerC0012a(android.ext.b1.a r1) {
                    r0 = this;
                    r0.f603a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r8, int r9) {
                    r7 = this;
                    r8 = -2
                    if (r9 == r8) goto L46
                    r8 = -1
                    if (r9 == r8) goto L7
                    goto L54
                L7:
                    android.ext.b1$a r9 = r7.f603a
                    int r9 = r9.f599a
                    r0 = 0
                    r1 = 1
                    if (r9 != r1) goto L18
                    int r9 = android.ext.b1.L
                    android.ext.b1$a r2 = r7.f603a
                    android.content.Intent[] r2 = r2.f600b
                    int r2 = r2.length
                    int r9 = r9 % r2
                    goto L19
                L18:
                    r9 = 0
                L19:
                    android.ext.b1$a r2 = r7.f603a
                    android.content.Intent[] r2 = r2.f600b
                    int r3 = r2.length
                L1e:
                    if (r0 >= r3) goto L54
                    r4 = r2[r0]
                    int r8 = r8 + r1
                    if (r8 >= r9) goto L26
                    goto L43
                L26:
                    android.ext.b1$a r5 = r7.f603a     // Catch: java.lang.Throwable -> L32
                    int r5 = r5.f599a     // Catch: java.lang.Throwable -> L32
                    if (r5 != r1) goto L34
                    int r5 = android.ext.b1.L     // Catch: java.lang.Throwable -> L32
                    int r5 = r5 + r1
                    android.ext.b1.L = r5     // Catch: java.lang.Throwable -> L32
                    goto L34
                L32:
                    r4 = move-exception
                    goto L3e
                L34:
                    android.ext.r r5 = android.ext.r.n     // Catch: java.lang.Throwable -> L32
                    android.ext.b1$a r6 = r7.f603a     // Catch: java.lang.Throwable -> L32
                    int r6 = r6.f599a     // Catch: java.lang.Throwable -> L32
                    r5.startActivityForResult(r4, r6)     // Catch: java.lang.Throwable -> L32
                    goto L54
                L3e:
                    java.lang.String r5 = "intent fail"
                    android.ext.e1.l(r5, r4)
                L43:
                    int r0 = r0 + 1
                    goto L1e
                L46:
                    android.ext.b1$c0 r8 = android.ext.b1.C
                    android.ext.b1$c0 r9 = android.ext.b1.C
                    int r9 = r9.j
                    android.ext.b1$a r0 = r7.f603a
                    int r0 = r0.f599a
                    int r0 = ~r0
                    r9 = r9 & r0
                    r8.j = r9
                L54:
                    android.ext.b1 r8 = android.ext.b1.B
                    r9 = 0
                    r8.r = r9
                    return
            }
        }

        a(int r1, android.content.Intent[] r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.f599a = r1
                r0.f600b = r2
                r0.f601c = r3
                r0.f602d = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.b1$a$a r0 = new android.ext.b1$a$a
                r0.<init>(r4)
                android.ext.b1 r1 = android.ext.b1.B
                r1.E()
                android.content.Context r1 = android.ext.r.p
                android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int r3 = android.ext.b1.L
                r2.append(r3)
                java.lang.String r3 = ": ["
                r2.append(r3)
                int r3 = r4.f601c
                r2.append(r3)
                java.lang.String r3 = "] "
                r2.append(r3)
                java.lang.String r3 = r4.f602d
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
                r2 = 2131297115(0x7f09035b, float:1.8212166E38)
                android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r0)
                r2 = 2131296805(0x7f090225, float:1.8211537E38)
                android.app.AlertDialog$Builder r0 = r1.setNegativeButton(r2, r0)
                r1 = 0
                android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)
                android.app.AlertDialog r0 = r0.create()
                android.ext.f.m(r0)
                android.ext.b1 r1 = android.ext.b1.B
                r1.r = r0
                return
        }
    }

    private static class a0 extends java.io.OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.io.RandomAccessFile f604a;

        private a0(java.io.RandomAccessFile r3) {
                r2 = this;
                r2.<init>()
                r2.f604a = r3
                r0 = 0
                r3.seek(r0)
                r3.setLength(r0)
                return
        }

        /* synthetic */ a0(java.io.RandomAccessFile r1, android.ext.b1.i r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
                r0 = this;
                return
        }

        @Override // java.io.OutputStream
        public void write(int r2) {
                r1 = this;
                java.io.RandomAccessFile r0 = r1.f604a
                r0.write(r2)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2) {
                r1 = this;
                java.io.RandomAccessFile r0 = r1.f604a
                r0.write(r2)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) {
                r1 = this;
                java.io.RandomAccessFile r0 = r1.f604a
                r0.write(r2, r3, r4)
                return
        }
    }

    class b implements java.lang.Runnable {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.b1.H1()
                android.os.Handler r0 = android.ext.n2.d()
                r0.removeCallbacks(r3)
                r1 = 500(0x1f4, double:2.47E-321)
                r0.postDelayed(r3, r1)
                return
        }
    }

    private class b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.io.RandomAccessFile f605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.nio.ByteBuffer f606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.ext.b1 f608d;

        private b0(android.ext.b1 r3, int r4) {
                r2 = this;
                r2.f608d = r3
                r2.<init>()
                r0 = 0
                r2.f605a = r0
                r2.f606b = r0
                boolean[] r0 = android.ext.b1.A
                boolean r0 = r0[r4]
                r2.f607c = r0
                if (r0 == 0) goto L42
                byte[][] r3 = android.ext.b1.z
                if (r3 == 0) goto L21
                r3 = r3[r4]
                if (r3 == 0) goto L21
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
                r2.f606b = r3
                goto L48
            L21:
                android.ext.b1$v r3 = new android.ext.b1$v
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "memCache is null 3: "
                r0.append(r1)
                r0.append(r4)
                r4 = 32
                r0.append(r4)
                byte[][] r4 = android.ext.b1.z
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                throw r3
            L42:
                java.io.RandomAccessFile r3 = r3.h0(r4)
                r2.f605a = r3
            L48:
                return
        }

        /* synthetic */ b0(android.ext.b1 r1, int r2, android.ext.b1.i r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private b0(android.ext.b1 r2, byte[] r3, java.lang.String r4) {
                r1 = this;
                r1.f608d = r2
                r1.<init>()
                r2 = 0
                r1.f605a = r2
                r1.f606b = r2
                if (r3 == 0) goto L16
                r2 = 1
                r1.f607c = r2
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r3)
                r1.f606b = r2
                return
            L16:
                android.ext.b1$v r2 = new android.ext.b1$v
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "RandomAccessData: null data for "
                r3.append(r0)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        /* synthetic */ b0(android.ext.b1 r1, byte[] r2, java.lang.String r3, android.ext.b1.i r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public void a() {
                r0 = this;
                return
        }

        public long b() {
                r2 = this;
                boolean r0 = r2.f607c
                if (r0 == 0) goto Lc
                java.nio.ByteBuffer r0 = r2.f606b
                int r0 = r0.capacity()
                long r0 = (long) r0
                return r0
            Lc:
                java.io.RandomAccessFile r0 = r2.f605a
                long r0 = r0.length()
                return r0
        }

        public long c() {
                r2 = this;
                boolean r0 = r2.f607c
                if (r0 == 0) goto Lc
                java.nio.ByteBuffer r0 = r2.f606b
                int r0 = r0.position()
                long r0 = (long) r0
                return r0
            Lc:
                java.io.RandomAccessFile r0 = r2.f605a
                long r0 = r0.getFilePointer()
                return r0
        }

        public int d(byte[] r3) {
                r2 = this;
                int r0 = r3.length
                r1 = 0
                int r3 = r2.e(r3, r1, r0)
                return r3
        }

        public int e(byte[] r2, int r3, int r4) {
                r1 = this;
                boolean r0 = r1.f607c
                if (r0 == 0) goto L18
                java.nio.ByteBuffer r0 = r1.f606b
                int r0 = r0.remaining()
                int r4 = java.lang.Math.min(r4, r0)
                if (r4 == 0) goto L16
                java.nio.ByteBuffer r0 = r1.f606b
                r0.get(r2, r3, r4)
                goto L1e
            L16:
                r4 = -1
                goto L1e
            L18:
                java.io.RandomAccessFile r0 = r1.f605a
                int r4 = r0.read(r2, r3, r4)
            L1e:
                return r4
        }

        public void f(long r2) {
                r1 = this;
                boolean r0 = r1.f607c
                if (r0 == 0) goto Lb
                java.nio.ByteBuffer r0 = r1.f606b
                int r3 = (int) r2
                r0.position(r3)
                goto L10
            Lb:
                java.io.RandomAccessFile r0 = r1.f605a
                r0.seek(r2)
            L10:
                return
        }

        public void g(int r3) {
                r2 = this;
                boolean r0 = r2.f607c
                if (r0 == 0) goto Lf
                java.nio.ByteBuffer r0 = r2.f606b
                int r1 = r0.position()
                int r1 = r1 + r3
                r0.position(r1)
                goto L14
            Lf:
                java.io.RandomAccessFile r0 = r2.f605a
                r0.skipBytes(r3)
            L14:
                return
        }

        public void h(byte[] r2) {
                r1 = this;
                boolean r0 = r1.f607c
                if (r0 == 0) goto La
                java.nio.ByteBuffer r0 = r1.f606b
                r0.put(r2)
                goto Lf
            La:
                java.io.RandomAccessFile r0 = r1.f605a
                r0.write(r2)
            Lf:
                return
        }

        public void i(byte[] r2, int r3, int r4) {
                r1 = this;
                boolean r0 = r1.f607c
                if (r0 == 0) goto La
                java.nio.ByteBuffer r0 = r1.f606b
                r0.put(r2, r3, r4)
                goto Lf
            La:
                java.io.RandomAccessFile r0 = r1.f605a
                r0.write(r2, r3, r4)
            Lf:
                return
        }
    }

    class c implements android.view.View.OnClickListener {

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.b1.c f609a;

            a(android.ext.b1.c r1) {
                    r0 = this;
                    r0.f609a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    r1 = 1
                    android.ext.b1.k(r1)
                    return
            }
        }

        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.content.Context r3 = android.ext.r.p
                android.app.AlertDialog$Builder r3 = android.ext.f.c(r3)
                r0 = 2131296700(0x7f0901bc, float:1.8211324E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r3 = r3.setMessage(r0)
                android.ext.b1$c$a r0 = new android.ext.b1$c$a
                r0.<init>(r2)
                r1 = 2131297115(0x7f09035b, float:1.8212166E38)
                android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r1, r0)
                r0 = 2131296805(0x7f090225, float:1.8211537E38)
                r1 = 0
                android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r1)
                r0 = 0
                android.app.AlertDialog$Builder r3 = r3.setCancelable(r0)
                android.ext.r r0 = android.ext.r.n
                android.ext.f.p(r3, r0)
                return
        }
    }

    public static class c0 implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.ext.b1.c0> CREATOR = null;
        static volatile boolean p = false;
        static volatile boolean q = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.String f612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.lang.String f613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        java.lang.String f614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        java.lang.String f615f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f616g;
        boolean h;
        volatile boolean i;
        volatile int j;
        java.lang.String k;
        volatile int l;
        volatile boolean m;
        java.lang.String n;
        java.lang.String o;

        class a implements android.os.Parcelable.Creator {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public android.ext.b1.c0 a(android.os.Parcel r2) {
                    r1 = this;
                    android.ext.b1$c0 r0 = new android.ext.b1$c0
                    r0.<init>(r2)
                    return r0
            }

            public android.ext.b1.c0[] b(int r1) {
                    r0 = this;
                    android.ext.b1$c0[] r1 = new android.ext.b1.c0[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    android.ext.b1$c0 r1 = r0.a(r1)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    android.ext.b1$c0[] r1 = r0.b(r1)
                    return r1
            }
        }

        static {
                android.ext.b1$c0$a r0 = new android.ext.b1$c0$a
                r0.<init>()
                android.ext.b1.c0.CREATOR = r0
                return
        }

        c0() {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f610a = r0
                r3.f611b = r0
                r1 = 0
                r3.f612c = r1
                r3.f613d = r1
                r3.f614e = r1
                r3.f615f = r1
                r3.f616g = r0
                r3.h = r0
                r3.i = r0
                r3.j = r0
                java.lang.String r2 = ""
                r3.k = r2
                r3.l = r0
                r3.m = r0
                r3.n = r1
                r3.o = r1
                return
        }

        protected c0(android.os.Parcel r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f610a = r0
                r3.f611b = r0
                r1 = 0
                r3.f612c = r1
                r3.f613d = r1
                r3.f614e = r1
                r3.f615f = r1
                r3.f616g = r0
                r3.h = r0
                r3.i = r0
                r3.j = r0
                java.lang.String r2 = ""
                r3.k = r2
                r3.l = r0
                r3.m = r0
                r3.n = r1
                r3.o = r1
                byte r1 = r4.readByte()
                r2 = 1
                if (r1 == 0) goto L2e
                r1 = 1
                goto L2f
            L2e:
                r1 = 0
            L2f:
                r3.f610a = r1
                int r1 = r4.readInt()
                r3.f611b = r1
                java.lang.String r1 = r4.readString()
                r3.f612c = r1
                java.lang.String r1 = r4.readString()
                r3.f613d = r1
                java.lang.String r1 = r4.readString()
                r3.f614e = r1
                java.lang.String r1 = r4.readString()
                r3.f615f = r1
                int r1 = r4.readInt()
                r3.f616g = r1
                byte r1 = r4.readByte()
                if (r1 == 0) goto L5d
                r1 = 1
                goto L5e
            L5d:
                r1 = 0
            L5e:
                r3.h = r1
                byte r1 = r4.readByte()
                if (r1 == 0) goto L68
                r1 = 1
                goto L69
            L68:
                r1 = 0
            L69:
                r3.i = r1
                int r1 = r4.readInt()
                r3.j = r1
                java.lang.String r1 = r4.readString()
                r3.k = r1
                int r1 = r4.readInt()
                r3.l = r1
                byte r1 = r4.readByte()
                if (r1 == 0) goto L84
                r0 = 1
            L84:
                r3.m = r0
                java.lang.String r0 = r4.readString()
                r3.n = r0
                java.lang.String r4 = r4.readString()
                r3.o = r4
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                boolean r2 = r0.f610a
                byte r2 = (byte) r2
                r1.writeByte(r2)
                int r2 = r0.f611b
                r1.writeInt(r2)
                java.lang.String r2 = r0.f612c
                r1.writeString(r2)
                java.lang.String r2 = r0.f613d
                r1.writeString(r2)
                java.lang.String r2 = r0.f614e
                r1.writeString(r2)
                java.lang.String r2 = r0.f615f
                r1.writeString(r2)
                int r2 = r0.f616g
                r1.writeInt(r2)
                boolean r2 = r0.h
                byte r2 = (byte) r2
                r1.writeByte(r2)
                boolean r2 = r0.i
                byte r2 = (byte) r2
                r1.writeByte(r2)
                int r2 = r0.j
                r1.writeInt(r2)
                java.lang.String r2 = r0.k
                r1.writeString(r2)
                int r2 = r0.l
                r1.writeInt(r2)
                boolean r2 = r0.m
                byte r2 = (byte) r2
                r1.writeByte(r2)
                java.lang.String r2 = r0.n
                r1.writeString(r2)
                java.lang.String r2 = r0.o
                r1.writeString(r2)
                return
        }
    }

    class d implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.b1 f617a;

        d(android.ext.b1 r1) {
                r0 = this;
                r0.f617a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                java.lang.String r1 = android.ext.i.f1000b
                android.ext.x2.t(r1)
                return
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.b1 f619b;

        e(android.ext.b1 r1, int r2) {
                r0 = this;
                r0.f619b = r1
                r0.f618a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.b1$c0 r0 = android.ext.b1.C
                android.ext.b1$c0 r1 = android.ext.b1.C
                int r1 = r1.j
                int r2 = r3.f618a
                int r2 = ~r2
                r1 = r1 & r2
                r0.j = r1
                return
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.b1 f620a;

        f(android.ext.b1 r1) {
                r0 = this;
                r0.f620a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.b1 r0 = r1.f620a
                r0.E()
                return
        }
    }

    class g extends java.io.ByteArrayOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.b1 f622b;

        g(android.ext.b1 r1, int r2, int r3) {
                r0 = this;
                r0.f622b = r1
                r0.f621a = r3
                r0.<init>(r2)
                return
        }

        @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r4 = this;
                super.close()
                byte[][] r0 = android.ext.b1.z
                if (r0 == 0) goto L1b
                byte[] r1 = r4.toByteArray()
                if (r1 != 0) goto L17
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r3 = "toByteArray return null"
                r2.<init>(r3)
                android.ext.e1.a(r2)
            L17:
                int r2 = r4.f621a
                r0[r2] = r1
            L1b:
                return
        }
    }

    static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f623a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f624b = null;

        static {
                android.ext.b1$y[] r0 = android.ext.b1.y.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.ext.b1.h.f624b = r0
                r1 = 1
                android.ext.b1$y r2 = android.ext.b1.y.f649a     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = android.ext.b1.h.f624b     // Catch: java.lang.NoSuchFieldError -> L1d
                android.ext.b1$y r3 = android.ext.b1.y.f650b     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r2 = android.ext.b1.h.f624b     // Catch: java.lang.NoSuchFieldError -> L28
                android.ext.b1$y r3 = android.ext.b1.y.f652d     // Catch: java.lang.NoSuchFieldError -> L28
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r4 = 3
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                android.ext.b1$r[] r2 = android.ext.b1.r.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                android.ext.b1.h.f623a = r2
                android.ext.b1$r r3 = android.ext.b1.r.f633a     // Catch: java.lang.NoSuchFieldError -> L39
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = android.ext.b1.h.f623a     // Catch: java.lang.NoSuchFieldError -> L43
                android.ext.b1$r r2 = android.ext.b1.r.f634b     // Catch: java.lang.NoSuchFieldError -> L43
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                return
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f625a;

        i(java.lang.Runnable r1) {
                r0 = this;
                r0.f625a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.b1.b()
                java.lang.Runnable r0 = r1.f625a
                r0.run()
                java.lang.String r0 = "normal-service-ready"
                android.ext.b1.R1(r0)
                android.ext.b1.c(r0)
                return
        }
    }

    class j implements java.lang.Runnable {
        j() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                boolean r0 = android.ext.b1.d()
                if (r0 != 0) goto L7
                return
            L7:
                android.ext.b1.t0()
                return
        }
    }

    class k implements java.lang.Runnable {
        k() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 4
                android.ext.b1.e(r0)
                return
        }
    }

    class l implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f626a;

        l(java.lang.String r1) {
                r0 = this;
                r0.f626a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.ref.WeakReference r0 = android.ext.b1.I
                java.lang.Object r0 = r0.get()
                android.widget.TextView r0 = (android.widget.TextView) r0
                if (r0 == 0) goto Lf
                java.lang.String r1 = r2.f626a
                r0.setText(r1)
            Lf:
                return
        }
    }

    class m implements java.lang.Runnable {

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.b1.m f627a;

            a(android.ext.b1.m r1) {
                    r0 = this;
                    r0.f627a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r2, int r3) {
                    r1 = this;
                    r2 = -1
                    r0 = 0
                    if (r3 != r2) goto L10
                    android.ext.b1$c0 r2 = android.ext.b1.j0()
                    r2.l = r0
                    r2.m = r0
                    android.ext.b1.z1()
                    goto L13
                L10:
                    android.ext.b1.k(r0)
                L13:
                    return
            }
        }

        m() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.b1$m$a r0 = new android.ext.b1$m$a
                r0.<init>(r3)
                android.content.Context r1 = android.ext.r.p
                android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
                r2 = 2131296437(0x7f0900b5, float:1.821079E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
                r2 = 2131297115(0x7f09035b, float:1.8212166E38)
                android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r0)
                r2 = 2131296805(0x7f090225, float:1.8211537E38)
                android.app.AlertDialog$Builder r0 = r1.setNegativeButton(r2, r0)
                r1 = 0
                android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)
                android.ext.f.o(r0)
                return
        }
    }

    class n implements java.lang.Runnable {
        n() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.r r0 = android.ext.r.n
                r0.finish()
                return
        }
    }

    class o implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f628a;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.b1.o f629a;

            a(android.ext.b1.o r1) {
                    r0 = this;
                    r0.f629a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.ext.r.I()
                    return
            }
        }

        o(java.lang.String r1) {
                r0 = this;
                r0.f628a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                android.ext.b1 r0 = android.ext.b1.B
                if (r0 == 0) goto Ld
                java.io.File r0 = r0.f594c
                if (r0 == 0) goto Ld
                java.lang.String r0 = r0.getAbsolutePath()
                goto Le
            Ld:
                r0 = 0
            Le:
                android.content.Context r1 = android.ext.r.p
                android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 2131296814(0x7f09022e, float:1.8211555E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                java.lang.String r4 = r5.f628a
                r2.append(r4)
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
                android.ext.b1$o$a r1 = new android.ext.b1$o$a
                r1.<init>(r5)
                r2 = 2131296836(0x7f090244, float:1.82116E38)
                android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
                r1 = 0
                android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)
                android.app.AlertDialog r0 = r0.create()
                android.ext.f.m(r0)
                return
        }
    }

    class p implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Throwable f630a;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.b1.p f631a;

            /* JADX INFO: renamed from: android.ext.b1$p$a$a, reason: collision with other inner class name */
            class RunnableC0013a implements java.lang.Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ android.ext.b1.p.a f632a;

                RunnableC0013a(android.ext.b1.p.a r1) {
                        r0 = this;
                        r0.f632a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r1 = this;
                        java.lang.String r0 = "Kill by Installer"
                        android.ext.e1.d(r0)
                        android.ext.f1.n()
                        return
                }
            }

            a(android.ext.b1.p r1) {
                    r0 = this;
                    r0.f631a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r3, int r4) {
                    r2 = this;
                    r0 = -1
                    if (r4 != r0) goto L1c
                    android.ext.r$n r0 = new android.ext.r$n
                    java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:6<;0jdwkhulqj0lqirupdwlrq0derxw0jj0huuruv2"
                    r0.<init>(r1)
                    r0.onClick(r3, r4)
                    android.os.Handler r3 = android.ext.n2.d()
                    android.ext.b1$p$a$a r4 = new android.ext.b1$p$a$a
                    r4.<init>(r2)
                    r0 = 5000(0x1388, double:2.4703E-320)
                    r3.postDelayed(r4, r0)
                    goto L20
                L1c:
                    r3 = 1
                    android.ext.b1.k(r3)
                L20:
                    return
            }
        }

        p(java.lang.Throwable r1) {
                r0 = this;
                r0.f630a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.b1$p$a r0 = new android.ext.b1$p$a
                r0.<init>(r4)
                android.content.Context r1 = android.ext.r.p
                android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 2131296892(0x7f09027c, float:1.8211714E38)
                java.lang.String r3 = android.ext.Tools.N1(r3)
                r2.append(r3)
                java.lang.String r3 = ":\n\n"
                r2.append(r3)
                java.lang.Throwable r3 = r4.f630a
                java.lang.String r3 = android.ext.e1.n(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
                r2 = 2131296786(0x7f090212, float:1.8211499E38)
                android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r0)
                r2 = 2131296836(0x7f090244, float:1.82116E38)
                android.app.AlertDialog$Builder r0 = r1.setNegativeButton(r2, r0)
                r1 = 0
                android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)
                android.app.AlertDialog r0 = r0.create()
                android.ext.f.m(r0)
                return
        }
    }

    class q implements java.lang.Runnable {
        q() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.ext.r.I()
                return
        }
    }

    static final enum r extends java.lang.Enum {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final android.ext.b1.r f633a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final android.ext.b1.r f634b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final android.ext.b1.r f635c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ android.ext.b1.r[] f636d = null;

        static {
                android.ext.b1$r r0 = new android.ext.b1$r
                java.lang.String r1 = "PROCEED"
                r2 = 0
                r0.<init>(r1, r2)
                android.ext.b1.r.f633a = r0
                android.ext.b1$r r0 = new android.ext.b1$r
                java.lang.String r1 = "OPEN_SETTINGS"
                r2 = 1
                r0.<init>(r1, r2)
                android.ext.b1.r.f634b = r0
                android.ext.b1$r r0 = new android.ext.b1$r
                java.lang.String r1 = "FAIL_PENDING"
                r2 = 2
                r0.<init>(r1, r2)
                android.ext.b1.r.f635c = r0
                android.ext.b1$r[] r0 = a()
                android.ext.b1.r.f636d = r0
                return
        }

        private r(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ android.ext.b1.r[] a() {
                r0 = 3
                android.ext.b1$r[] r0 = new android.ext.b1.r[r0]
                r1 = 0
                android.ext.b1$r r2 = android.ext.b1.r.f633a
                r0[r1] = r2
                r1 = 1
                android.ext.b1$r r2 = android.ext.b1.r.f634b
                r0[r1] = r2
                r1 = 2
                android.ext.b1$r r2 = android.ext.b1.r.f635c
                r0[r1] = r2
                return r0
        }

        public static android.ext.b1.r valueOf(java.lang.String r1) {
                java.lang.Class<android.ext.b1$r> r0 = android.ext.b1.r.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                android.ext.b1$r r1 = (android.ext.b1.r) r1
                return r1
        }

        public static android.ext.b1.r[] values() {
                android.ext.b1$r[] r0 = android.ext.b1.r.f636d
                java.lang.Object r0 = r0.clone()
                android.ext.b1$r[] r0 = (android.ext.b1.r[]) r0
                return r0
        }
    }

    private static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        short f637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        short f638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f639c;

        s(java.nio.ByteBuffer r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r2.position(r0)
                short r0 = r2.getShort()
                r1.f637a = r0
                short r0 = r2.getShort()
                r1.f638b = r0
                int r2 = r2.getInt()
                r1.f639c = r2
                return
        }
    }

    private static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f642c;

        t(byte[] r3) {
                r2 = this;
                int r0 = r3.length
                r1 = 0
                r2.<init>(r3, r1, r0)
                return
        }

        t(byte[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f640a = r1
                r0.f642c = r2
                int r2 = r2 + r3
                r0.f641b = r2
                return
        }

        boolean a() {
                r2 = this;
                int r0 = r2.f642c
                int r1 = r2.f641b
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        android.ext.b1.t b(int[] r5) {
                r4 = this;
                android.ext.b1$t r0 = new android.ext.b1$t
                byte[] r1 = r4.f640a
                r2 = 0
                r2 = r5[r2]
                r3 = 1
                r5 = r5[r3]
                r0.<init>(r1, r2, r5)
                return r0
        }

        int[] c(int r7) {
                r6 = this;
                int r0 = r6.f642c
                int r1 = r0 + 2
                int r2 = r6.f641b
                r3 = 0
                if (r1 > r2) goto L50
                byte[] r1 = r6.f640a
                r4 = r1[r0]
                r4 = r4 & 255(0xff, float:3.57E-43)
                if (r4 == r7) goto L12
                goto L50
            L12:
                int r7 = r0 + 1
                int r0 = r0 + 2
                r7 = r1[r7]
                r1 = r7 & 255(0xff, float:3.57E-43)
                r4 = r7 & 128(0x80, float:1.8E-43)
                if (r4 == 0) goto L40
                r7 = r7 & 127(0x7f, float:1.78E-43)
                if (r7 == 0) goto L3f
                r1 = 4
                if (r7 > r1) goto L3f
                int r1 = r0 + r7
                if (r1 <= r2) goto L2a
                goto L3f
            L2a:
                r1 = 0
                r2 = 0
            L2c:
                if (r1 >= r7) goto L3d
                int r2 = r2 << 8
                byte[] r4 = r6.f640a
                int r5 = r0 + 1
                r0 = r4[r0]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r2 = r2 | r0
                int r1 = r1 + 1
                r0 = r5
                goto L2c
            L3d:
                r1 = r2
                goto L40
            L3f:
                return r3
            L40:
                if (r1 < 0) goto L50
                int r7 = r0 + r1
                int r2 = r6.f641b
                if (r7 <= r2) goto L49
                goto L50
            L49:
                r6.f642c = r7
                int[] r7 = new int[]{r0, r1}
                return r7
            L50:
                return r3
        }

        byte[] d(int[] r5) {
                r4 = this;
                r0 = 1
                r0 = r5[r0]
                byte[] r1 = new byte[r0]
                byte[] r2 = r4.f640a
                r3 = 0
                r5 = r5[r3]
                java.lang.System.arraycopy(r2, r5, r1, r3, r0)
                return r1
        }
    }

    private static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f645c;

        u(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f643a = r1
                r0.f644b = r2
                r0.f645c = r3
                return
        }
    }

    static class v extends java.lang.RuntimeException {
        public v(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public v(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public static class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.util.zip.ZipEntry f646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.String f647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.lang.String f648c;

        public w(java.util.zip.ZipEntry r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f646a = r1
                r0.f647b = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Item [entry="
                r0.append(r1)
                java.util.zip.ZipEntry r1 = r2.f646a
                r0.append(r1)
                java.lang.String r1 = ", extractHash="
                r0.append(r1)
                java.lang.String r1 = r2.f647b
                r0.append(r1)
                java.lang.String r1 = ", putHash="
                r0.append(r1)
                java.lang.String r1 = r2.f648c
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class x extends java.io.OutputStream {
        private x() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ x(android.ext.b1.i r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.OutputStream
        public void write(int r1) {
                r0 = this;
                return
        }
    }

    static final enum y extends java.lang.Enum {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final android.ext.b1.y f649a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final android.ext.b1.y f650b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final android.ext.b1.y f651c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final android.ext.b1.y f652d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ android.ext.b1.y[] f653e = null;

        static {
                android.ext.b1$y r0 = new android.ext.b1$y
                java.lang.String r1 = "ROOT"
                r2 = 0
                r0.<init>(r1, r2)
                android.ext.b1.y.f649a = r0
                android.ext.b1$y r0 = new android.ext.b1$y
                java.lang.String r1 = "MANUAL"
                r2 = 1
                r0.<init>(r1, r2)
                android.ext.b1.y.f650b = r0
                android.ext.b1$y r0 = new android.ext.b1$y
                java.lang.String r1 = "OPEN_SETTINGS"
                r2 = 2
                r0.<init>(r1, r2)
                android.ext.b1.y.f651c = r0
                android.ext.b1$y r0 = new android.ext.b1$y
                java.lang.String r1 = "REFUSED"
                r2 = 3
                r0.<init>(r1, r2)
                android.ext.b1.y.f652d = r0
                android.ext.b1$y[] r0 = a()
                android.ext.b1.y.f653e = r0
                return
        }

        private y(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ android.ext.b1.y[] a() {
                r0 = 4
                android.ext.b1$y[] r0 = new android.ext.b1.y[r0]
                r1 = 0
                android.ext.b1$y r2 = android.ext.b1.y.f649a
                r0[r1] = r2
                r1 = 1
                android.ext.b1$y r2 = android.ext.b1.y.f650b
                r0[r1] = r2
                r1 = 2
                android.ext.b1$y r2 = android.ext.b1.y.f651c
                r0[r1] = r2
                r1 = 3
                android.ext.b1$y r2 = android.ext.b1.y.f652d
                r0[r1] = r2
                return r0
        }

        public static android.ext.b1.y valueOf(java.lang.String r1) {
                java.lang.Class<android.ext.b1$y> r0 = android.ext.b1.y.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                android.ext.b1$y r1 = (android.ext.b1.y) r1
                return r1
        }

        public static android.ext.b1.y[] values() {
                android.ext.b1$y[] r0 = android.ext.b1.y.f653e
                java.lang.Object r0 = r0.clone()
                android.ext.b1$y[] r0 = (android.ext.b1.y[]) r0
                return r0
        }
    }

    private static class z extends java.io.InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.io.RandomAccessFile f654a;

        private z(java.io.RandomAccessFile r3) {
                r2 = this;
                r2.<init>()
                r2.f654a = r3
                r0 = 0
                r3.seek(r0)
                return
        }

        /* synthetic */ z(java.io.RandomAccessFile r1, android.ext.b1.i r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.InputStream
        public int available() {
                r4 = this;
                java.io.RandomAccessFile r0 = r4.f654a
                long r0 = r0.length()
                java.io.RandomAccessFile r2 = r4.f654a
                long r2 = r2.getFilePointer()
                long r0 = r0 - r2
                int r1 = (int) r0
                if (r1 <= 0) goto L11
                goto L12
            L11:
                r1 = 0
            L12:
                return r1
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // java.io.InputStream
        public synchronized void mark(int r1) {
                r0 = this;
                monitor-enter(r0)
                monitor-exit(r0)
                return
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.io.InputStream
        public int read() {
                r1 = this;
                java.io.RandomAccessFile r0 = r1.f654a
                int r0 = r0.read()
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2) {
                r1 = this;
                java.io.RandomAccessFile r0 = r1.f654a
                int r2 = r0.read(r2)
                return r2
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) {
                r1 = this;
                java.io.RandomAccessFile r0 = r1.f654a
                int r2 = r0.read(r2, r3, r4)
                return r2
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
                r0 = this;
                monitor-enter(r0)
                monitor-exit(r0)
                return
        }

        @Override // java.io.InputStream
        public long skip(long r4) {
                r3 = this;
                java.io.RandomAccessFile r0 = r3.f654a
                long r1 = r0.getFilePointer()
                long r1 = r1 + r4
                r0.seek(r1)
                return r4
        }
    }

    static {
            java.lang.String r0 = "archive-parse"
            java.lang.String r1 = "package"
            java.lang.String r2 = "version"
            java.lang.String r3 = "application"
            java.lang.String r4 = "label"
            java.lang.String r5 = "signature"
            java.lang.String r6 = "signature-digest"
            java.lang.String r7 = "signature-official"
            java.lang.String r8 = "commit-hash"
            java.lang.String r9 = "binding-missing"
            java.lang.String r10 = "binding-mismatch"
            java.lang.String r11 = "component"
            java.lang.String r12 = "instrumentation"
            java.lang.String r13 = "provider"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            android.ext.b1.t = r0
            java.lang.String r1 = "repack-start"
            java.lang.String r2 = "verify-start"
            java.lang.String r3 = "verify-pass"
            java.lang.String r4 = "root-install-start"
            java.lang.String r5 = "root-install-return"
            java.lang.String r6 = "manual-install-start"
            java.lang.String r7 = "unknown-source-settings-start"
            java.lang.String r8 = "unknown-source-settings-failed"
            java.lang.String r9 = "package-installed"
            java.lang.String r10 = "old-uninstall-start"
            java.lang.String r11 = "preflight-start"
            java.lang.String r12 = "preflight-root-granted"
            java.lang.String r13 = "preflight-root-unavailable"
            java.lang.String r14 = "preflight-root-unanswered"
            java.lang.String r15 = "preflight-manual-start"
            java.lang.String r16 = "preflight-manual-granted"
            java.lang.String r17 = "preflight-manual-refused"
            java.lang.String r18 = "install-mode-unavailable"
            java.lang.String r19 = "installer-removed"
            java.lang.String r20 = "normal-service-ready"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            android.ext.b1.u = r0
            java.lang.String r0 = "installer-removed"
            java.lang.String r1 = "normal-service-ready"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            android.ext.b1.v = r0
            java.lang.String r0 = "[0-9a-f]{32}\\.part\\.apk"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            android.ext.b1.w = r0
            java.lang.String r1 = "classes.dex"
            java.lang.String r2 = "AndroidManifest.xml"
            java.lang.String r3 = "resources.arsc"
            java.lang.String r4 = "META-INF/MANIFEST.MF"
            java.lang.String r5 = "META-INF/CERT.SF"
            java.lang.String r6 = "META-INF/CERT.RSA"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            android.ext.b1.x = r0
            r0 = 0
            android.ext.b1.y = r0
            r1 = 0
            android.ext.b1.z = r1
            r2 = 6
            boolean[] r2 = new boolean[r2]
            r2 = {x00ca: FILL_ARRAY_DATA , data: [0, 1, 0, 1, 1, 1} // fill-array
            android.ext.b1.A = r2
            android.ext.b1.C = r1
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            android.ext.b1.D = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            android.ext.b1.E = r2
            android.ext.b1$b r2 = new android.ext.b1$b
            r2.<init>()
            android.ext.b1.F = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            android.ext.b1.G = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            android.ext.b1.H = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            android.ext.b1.I = r2
            android.ext.b1.J = r0
            android.ext.b1.K = r0
            android.ext.b1.L = r0
            byte[] r0 = new byte[r0]
            android.ext.b1.M = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            android.ext.b1.N = r0
            android.ext.b1.O = r1
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            android.ext.b1.P = r0
            return
    }

    private b1() {
            r4 = this;
            r4.<init>()
            java.lang.String[] r0 = android.ext.b1.x
            int r1 = r0.length
            java.io.RandomAccessFile[] r1 = new java.io.RandomAccessFile[r1]
            r4.f592a = r1
            int r0 = r0.length
            android.ext.b1$w[] r0 = new android.ext.b1.w[r0]
            r4.k = r0
            r0 = 0
            r4.r = r0
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)
            r4.l = r1
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            r4.m = r0
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            r4.n = r0
            java.lang.String r0 = d1()
            r4.f597f = r0
            r0 = 1
            java.io.File r1 = r4.T(r0)
            r1.mkdirs()
            r4.f593b = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Int dir: "
            r2.append(r3)
            java.lang.String r1 = r1.getAbsolutePath()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.ext.e1.d(r1)
            r4.i()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Apk: "
            r1.append(r2)
            java.io.File r2 = r4.f594c
            java.lang.String r2 = r2.getAbsolutePath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            r4.A1()
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.f613d
            if (r1 != 0) goto L7e
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r2 = r4.e0()
            r1.f613d = r2
        L7e:
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.f614e
            if (r1 != 0) goto L95
        L84:
            java.lang.String r1 = f0(r0)
            java.lang.String r2 = android.ext.i.f1001c
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L91
            goto L84
        L91:
            android.ext.b1$c0 r0 = android.ext.b1.C
            r0.f614e = r1
        L95:
            android.ext.b1$c0 r0 = android.ext.b1.C
            java.lang.String r0 = r0.f613d
            r4.f598g = r0
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.f614e
            r4.h = r1
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.f615f
            if (r1 == 0) goto Lac
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.f615f
            goto Lb1
        Lac:
            r1 = 2
            java.lang.String r1 = f0(r1)
        Lb1:
            r4.i = r1
            android.ext.b1$c0 r2 = android.ext.b1.C
            r2.f615f = r1
            android.ext.b1$c0 r1 = android.ext.b1.C
            int r1 = r1.f616g
            if (r1 == 0) goto Lc2
            android.ext.b1$c0 r1 = android.ext.b1.C
            int r1 = r1.f616g
            goto Lc6
        Lc2:
            int r1 = E0()
        Lc6:
            r4.j = r1
            android.ext.b1$c0 r2 = android.ext.b1.C
            r2.f616g = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "package: "
            r1.append(r2)
            java.lang.String r2 = android.ext.i.f1000b
            r1.append(r2)
            java.lang.String r2 = " -> "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.ext.e1.d(r0)
            return
    }

    private static int[] A(java.nio.ByteBuffer r21, int r22, int r23, int r24, int r25, int r26) {
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r26
            java.lang.String r4 = "hashDex: map list out of bounds"
            if (r1 < r3) goto L13f
            int r5 = r2 + (-4)
            if (r1 > r5) goto L13f
            long r5 = B(r21, r22)
            long r7 = (long) r1
            r9 = 4
            long r7 = r7 + r9
            r9 = 12
            long r9 = r9 * r5
            long r7 = r7 + r9
            r9 = 1
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 < 0) goto L139
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 > 0) goto L139
            long r11 = (long) r2
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 > 0) goto L139
            int r4 = (int) r5
            int r5 = (int) r7
            int[] r6 = new int[r4]
            int[] r7 = new int[r4]
            long[] r8 = new long[r4]
            r13 = -1
            r15 = 0
        L39:
            if (r15 >= r4) goto L89
            int r16 = r1 + 4
            int r17 = r15 * 12
            int r14 = r16 + r17
            short r16 = r0.getShort(r14)
            r17 = 65535(0xffff, float:9.1834E-41)
            r16 = r16 & r17
            int r9 = r14 + 2
            short r9 = r0.getShort(r9)
            r9 = r9 & r17
            int r10 = r14 + 4
            long r19 = B(r0, r10)
            int r14 = r14 + 8
            long r2 = B(r0, r14)
            if (r9 != 0) goto L81
            r9 = 1
            int r14 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r14 < 0) goto L81
            int r9 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r9 >= 0) goto L81
            if (r15 <= 0) goto L71
            long r9 = (long) r13
            int r13 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r13 <= 0) goto L81
        L71:
            r6[r15] = r16
            int r13 = (int) r2
            r7[r15] = r13
            r8[r15] = r19
            int r15 = r15 + 1
            r2 = r23
            r3 = r26
            r9 = 1
            goto L39
        L81:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "hashDex: invalid map item"
            r0.<init>(r1)
            throw r0
        L89:
            r0 = -1
            r13 = 0
            r14 = -1
            r18 = -1
        L8e:
            r2 = 1
            if (r13 >= r4) goto Lc5
            r3 = r6[r13]
            if (r3 != r2) goto La1
            if (r14 >= 0) goto L99
            r14 = r13
            goto Lc2
        L99:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "hashDex: duplicate string_ids map item"
            r0.<init>(r1)
            throw r0
        La1:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r3 != r2) goto Lb2
            if (r18 >= 0) goto Laa
            r18 = r13
            goto Lc2
        Laa:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "hashDex: duplicate map_list item"
            r0.<init>(r1)
            throw r0
        Lb2:
            r2 = 8194(0x2002, float:1.1482E-41)
            if (r3 != r2) goto Lc2
            if (r0 >= 0) goto Lba
            r0 = r13
            goto Lc2
        Lba:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "hashDex: duplicate string_data map item"
            r0.<init>(r1)
            throw r0
        Lc2:
            int r13 = r13 + 1
            goto L8e
        Lc5:
            if (r14 < 0) goto L131
            r9 = r8[r14]
            r3 = r24
            long r11 = (long) r3
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L131
            r3 = r7[r14]
            r6 = r25
            if (r3 != r6) goto L131
            if (r18 < 0) goto L129
            r9 = r8[r18]
            r13 = 1
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 != 0) goto L129
            r3 = r7[r18]
            if (r3 != r1) goto L129
            int r1 = r18 + 1
            if (r1 >= r4) goto Leb
            r1 = r7[r1]
            goto Led
        Leb:
            r1 = r23
        Led:
            if (r5 > r1) goto L121
            if (r0 < 0) goto L119
            r5 = r8[r0]
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 != 0) goto L119
            r1 = r7[r0]
            int r0 = r0 + r2
            if (r0 >= r4) goto L101
            r0 = r7[r0]
        Lfe:
            r2 = r26
            goto L104
        L101:
            r0 = r23
            goto Lfe
        L104:
            if (r1 < r2) goto L111
            if (r1 >= r0) goto L111
            r2 = r23
            if (r0 > r2) goto L111
            int[] r0 = new int[]{r1, r0}
            return r0
        L111:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "hashDex: string data out of bounds"
            r0.<init>(r1)
            throw r0
        L119:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "hashDex: string_data map mismatch"
            r0.<init>(r1)
            throw r0
        L121:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "hashDex: map list overlaps another section"
            r0.<init>(r1)
            throw r0
        L129:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "hashDex: map_list entry mismatch"
            r0.<init>(r1)
            throw r0
        L131:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "hashDex: string_ids map mismatch"
            r0.<init>(r1)
            throw r0
        L139:
            android.ext.b1$v r0 = new android.ext.b1$v
            r0.<init>(r4)
            throw r0
        L13f:
            android.ext.b1$v r0 = new android.ext.b1$v
            r0.<init>(r4)
            throw r0
    }

    private static byte[] A0(java.lang.String r8) {
            int r0 = r8.length()
            int r0 = r0 * 3
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
        La:
            int r3 = r8.length()
            if (r1 >= r3) goto L62
            char r3 = r8.charAt(r1)
            if (r3 != 0) goto L23
            int r3 = r2 + 1
            r4 = -64
            r0[r2] = r4
            int r2 = r2 + 2
            r4 = -128(0xffffffffffffff80, float:NaN)
            r0[r3] = r4
            goto L5f
        L23:
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L2e
            int r4 = r2 + 1
            byte r3 = (byte) r3
            r0[r2] = r3
            r2 = r4
            goto L5f
        L2e:
            r5 = 2048(0x800, float:2.87E-42)
            if (r3 >= r5) goto L44
            int r5 = r2 + 1
            int r6 = r3 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r0[r2] = r6
            int r2 = r2 + 2
            r3 = r3 & 63
            r3 = r3 | r4
            byte r3 = (byte) r3
            r0[r5] = r3
            goto L5f
        L44:
            int r5 = r2 + 1
            int r6 = r3 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r0[r2] = r6
            int r6 = r2 + 2
            int r7 = r3 >> 6
            r7 = r7 & 63
            r7 = r7 | r4
            byte r7 = (byte) r7
            r0[r5] = r7
            int r2 = r2 + 3
            r3 = r3 & 63
            r3 = r3 | r4
            byte r3 = (byte) r3
            r0[r6] = r3
        L5f:
            int r1 = r1 + 1
            goto La
        L62:
            byte[] r8 = java.util.Arrays.copyOf(r0, r2)
            return r8
    }

    private void A1() {
            r2 = this;
            java.io.File r0 = r2.f593b
            r2.B1(r0)
            java.io.File r0 = r2.f594c
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L18
            java.io.File r1 = r2.f593b
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L18
            r2.B1(r0)
        L18:
            return
    }

    private static long B(java.nio.ByteBuffer r2, int r3) {
            int r2 = r2.getInt(r3)
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }

    public static boolean B0() {
            u1()
            r0 = 1
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "2gdwd2JJ1vnls1lqvwdoo"
            java.lang.String r2 = android.ext.Tools.removeNewLinesChars(r2)     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L17
            r1 = r1 ^ r0
            if (r1 == 0) goto L34
            goto L1b
        L17:
            r1 = move-exception
            android.ext.e1.a(r1)
        L1b:
            java.lang.String r1 = android.ext.i.f1000b
            java.lang.String r2 = android.ext.Tools.C0()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L34
            java.lang.String r1 = "installer.fail"
            java.io.File r1 = W(r1)
            boolean r1 = r1.exists()
            if (r1 != 0) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
    }

    private void B1(java.io.File r7) {
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            java.lang.String[] r0 = r7.list()
            if (r0 != 0) goto La
            return
        La:
            int r1 = r0.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L49
            r3 = r0[r2]
            boolean r4 = y0(r3)
            if (r4 != 0) goto L17
            goto L46
        L17:
            java.io.File r4 = new java.io.File
            r4.<init>(r7, r3)
            java.io.File r5 = r6.f595d
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L25
            goto L46
        L25:
            boolean r5 = r4.isFile()
            if (r5 != 0) goto L2c
            goto L46
        L2c:
            boolean r4 = r4.delete()
            if (r4 != 0) goto L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed sweep orphaned part: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.ext.e1.p(r3)
        L46:
            int r2 = r2 + 1
            goto Lc
        L49:
            return
    }

    private static java.io.File C(java.lang.String r2) {
            java.io.File r0 = android.ext.Tools.p0()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto Lf
            r0.mkdirs()
        Lf:
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            return r1
    }

    private static java.lang.String C0() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "2gdwd2orfdo2wps21"
            java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)
            r0.append(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static byte[] C1(byte[] r2) {
            int r0 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r0)
            int r0 = r2.length
            if (r0 <= 0) goto L12
            int r0 = r2.length
            int r0 = r0 / 2
            r1 = r2[r0]
            r1 = r1 ^ 1
            byte r1 = (byte) r1
            r2[r0] = r1
        L12:
            return r2
    }

    private void D(java.io.FileOutputStream r2) {
            r1 = this;
            if (r2 == 0) goto La
            r2.close()     // Catch: java.lang.Throwable -> L6
            goto La
        L6:
            r2 = move-exception
            android.ext.e1.a(r2)
        La:
            java.io.File r2 = r1.f595d
            boolean r2 = r2.exists()
            if (r2 == 0) goto L34
            java.io.File r2 = r1.f595d
            boolean r2 = r2.delete()
            if (r2 != 0) goto L34
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Failed discard part: "
            r2.append(r0)
            java.io.File r0 = r1.f595d
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.ext.e1.p(r2)
        L34:
            return
    }

    private static java.lang.String D0() {
            r0 = 16
            byte[] r0 = new byte[r0]
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
            r1.nextBytes(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = android.ext.m0.i(r0)
            r1.append(r0)
            java.lang.String r0 = ".apk"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private static int D1(int r3, byte[] r4, int r5) {
            r0 = 0
        L1:
            r1 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 >>> 7
            if (r3 == 0) goto L9
            r1 = r1 | 128(0x80, float:1.8E-43)
        L9:
            int r2 = r0 + 1
            int r0 = r0 + r5
            byte r1 = (byte) r1
            r4[r0] = r1
            if (r3 != 0) goto L12
            return r2
        L12:
            r0 = r2
            goto L1
    }

    private static int E0() {
            java.util.Random r0 = android.ext.Tools.f489a
            r1 = 1
            float r2 = (float) r1
            r3 = 1183101542(0x4684b266, float:16985.2)
            float r2 = r2 * r3
            r3 = 1146064077(0x444f8ccd, float:830.2)
            float r2 = r2 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            int r2 = r2 * 2
            int r0 = r0.nextInt(r2)
            int r0 = r0 + r1
            return r0
    }

    private static int E1(int r1) {
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L6
            r1 = 1
            return r1
        L6:
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 >= r0) goto Lc
            r1 = 2
            return r1
        Lc:
            r0 = 2097152(0x200000, float:2.938736E-39)
            if (r1 >= r0) goto L12
            r1 = 3
            return r1
        L12:
            r1 = 4
            return r1
    }

    private void F() {
            r6 = this;
            java.util.zip.ZipInputStream r0 = l0()
        L4:
            java.util.zip.ZipEntry r1 = r0.getNextEntry()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L6b
            int r2 = Y(r1)     // Catch: java.lang.Throwable -> L38
            r3 = -1
            if (r2 == r3) goto L3a
            android.ext.b1$w[] r3 = r6.k     // Catch: java.lang.Throwable -> L38
            android.ext.b1$w r4 = new android.ext.b1$w     // Catch: java.lang.Throwable -> L38
            java.util.zip.ZipEntry r5 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L38
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r6.G(r1, r0, r2)     // Catch: java.lang.Throwable -> L38
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L38
            r3[r2] = r4     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r1.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "list: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L38
            r1.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L38
        L34:
            android.ext.e1.d(r1)     // Catch: java.lang.Throwable -> L38
            goto L4
        L38:
            r1 = move-exception
            goto L6f
        L3a:
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L38
            boolean r2 = z0(r2)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L4
            java.util.Map r2 = r6.p1()     // Catch: java.lang.Throwable -> L38
            r6.p = r2     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L38
            byte[] r4 = r6.c1(r1, r0)     // Catch: java.lang.Throwable -> L38
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "secondary dex: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L38
            r2.append(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L38
            goto L34
        L6b:
            r0.close()
            return
        L6f:
            r0.close()
            throw r1
    }

    public static void F0(int r3, int r4, android.content.Intent r5) {
            android.ext.b1$c0 r0 = android.ext.b1.C
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "instance: "
            r1.append(r2)
            android.ext.b1 r2 = android.ext.b1.B
            r1.append(r2)
            java.lang.String r2 = "; "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            if (r0 != 0) goto L23
            return
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.k
            r1.append(r2)
            java.lang.String r2 = "\nget: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " for: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " with: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.k = r5
            android.ext.b1 r5 = android.ext.b1.B
            if (r5 != 0) goto L50
            return
        L50:
            r1 = 1
            if (r3 == r1) goto L68
            r5 = 2
            if (r3 == r5) goto L57
            goto Lb2
        L57:
            r5 = 2131296443(0x7f0900bb, float:1.8210803E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            java.lang.String r0 = android.ext.i.f1000b
            android.content.Intent[] r0 = k0(r0)
            T0(r5, r3, r4, r0)
            goto Lb2
        L68:
            java.lang.String r5 = r5.f598g
            boolean r5 = android.ext.Tools.e1(r5)
            if (r5 == 0) goto L77
            int r4 = r0.j
            int r3 = ~r3
            r3 = r3 & r4
            r0.j = r3
            goto Lb2
        L77:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 2131296437(0x7f0900b5, float:1.821079E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r5.append(r0)
            java.lang.String r0 = "\n\n"
            r5.append(r0)
            r0 = 2131296762(0x7f0901fa, float:1.821145E38)
            java.lang.String r0 = android.ext.Tools.N1(r0)
            r5.append(r0)
            java.lang.String r0 = ":\n"
            r5.append(r0)
            android.ext.b1 r0 = android.ext.b1.B
            java.io.File r0 = r0.f594c
            java.lang.String r0 = r0.getAbsolutePath()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.ext.b1 r0 = android.ext.b1.B
            android.content.Intent[] r0 = r0.a0()
            T0(r5, r3, r4, r0)
        Lb2:
            return
    }

    private void F1() {
            r5 = this;
            android.ext.b1$c0 r0 = android.ext.b1.C
            int r0 = r0.l
            boolean r0 = Q0(r0)
            if (r0 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r0.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "exec pm uninstall "
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = android.ext.i.f1000b     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1 = 45
            android.ext.e2.n(r0, r1)     // Catch: java.lang.Throwable -> L23
            goto L29
        L23:
            r0 = move-exception
            java.lang.String r1 = "run cmd fail"
            android.ext.e1.l(r1, r0)
        L29:
            java.lang.String r0 = android.ext.i.f1000b
            boolean r1 = android.ext.Tools.e1(r0)
            r2 = 2131296836(0x7f090244, float:1.82116E38)
            if (r1 != 0) goto L58
            android.content.Context r0 = android.ext.r.p
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            r1 = 2131296701(0x7f0901bd, float:1.8211326E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = android.ext.b2.f(r2)
            android.ext.p0 r2 = new android.ext.p0
            r3 = 1600(0x640, float:2.242E-42)
            r2.<init>(r3)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.ext.f.o(r0)
            return
        L58:
            android.ext.b1$c0 r1 = android.ext.b1.C
            boolean r1 = r1.h
            if (r1 == 0) goto L76
            android.content.Intent[] r0 = k0(r0)
            int r1 = r0.length
            r2 = 0
        L64:
            if (r2 >= r1) goto L97
            r3 = r0[r2]
            r4 = 2
            r5.P1(r3, r4)     // Catch: android.content.ActivityNotFoundException -> L6d
            goto L97
        L6d:
            r3 = move-exception
            java.lang.String r4 = "intent fail"
            android.ext.e1.l(r4, r3)
            int r2 = r2 + 1
            goto L64
        L76:
            android.content.Context r0 = android.ext.r.p
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            r1 = 2131296799(0x7f09021f, float:1.8211525E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = android.ext.b2.f(r2)
            android.ext.b1$d r2 = new android.ext.b1$d
            r2.<init>(r5)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.ext.f.o(r0)
        L97:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed uninstall self"
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String G(java.util.zip.ZipEntry r9, java.util.zip.ZipInputStream r10, int r11) {
            r8 = this;
            java.lang.String r0 = " -> "
            java.lang.String r1 = ": "
            java.lang.String r2 = "extract "
            java.security.MessageDigest r3 = r8.l
            r3.reset()
            java.security.DigestOutputStream r3 = new java.security.DigestOutputStream
            java.io.OutputStream r4 = r8.g0(r11)
            java.security.MessageDigest r5 = r8.l
            r3.<init>(r4, r5)
            java.security.MessageDigest r4 = r8.m
            r4.reset()
            java.security.DigestInputStream r4 = new java.security.DigestInputStream
            java.security.MessageDigest r5 = r8.m
            r4.<init>(r10, r5)
            r10 = 2
            byte[] r5 = r8.S()     // Catch: java.lang.Throwable -> L33
        L27:
            int r6 = r4.read(r5)     // Catch: java.lang.Throwable -> L33
            r7 = -1
            if (r6 == r7) goto L35
            r7 = 0
            r3.write(r5, r7, r6)     // Catch: java.lang.Throwable -> L33
            goto L27
        L33:
            r11 = move-exception
            goto L75
        L35:
            r3.flush()     // Catch: java.lang.Throwable -> L33
            r3.close()
            java.security.MessageDigest r3 = r8.l
            byte[] r3 = r3.digest()
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r10)
            java.security.MessageDigest r4 = r8.m
            byte[] r4 = r4.digest()
            java.lang.String r10 = android.util.Base64.encodeToString(r4, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r9.getName()
            r4.append(r2)
            r4.append(r1)
            r4.append(r10)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            android.ext.e1.d(r0)
            r8.n(r9, r11, r3, r10)
            return r3
        L75:
            r3.close()
            java.security.MessageDigest r3 = r8.l
            byte[] r3 = r3.digest()
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r10)
            java.security.MessageDigest r4 = r8.m
            byte[] r4 = r4.digest()
            java.lang.String r10 = android.util.Base64.encodeToString(r4, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r9 = r9.getName()
            r4.append(r9)
            r4.append(r1)
            r4.append(r10)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r9 = r4.toString()
            android.ext.e1.d(r9)
            throw r11
    }

    static void G0() {
            android.ext.b1$c0 r0 = android.ext.b1.C
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r0.i
            if (r1 == 0) goto L19
            boolean r1 = android.ext.b1.c0.p
            if (r1 == 0) goto L19
            r1 = 1
            android.ext.b1.c0.q = r1
            r1 = 0
            r0.i = r1
            int r1 = r0.j
            r1 = r1 & (-5)
            r0.j = r1
        L19:
            return
    }

    private void G1(java.util.zip.ZipEntry r9, int r10) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateEntry f: "
            r0.append(r1)
            java.lang.String r1 = android.ext.g.a(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            java.io.InputStream r1 = r8.Z(r10)
            byte[] r2 = r8.S()     // Catch: java.lang.Throwable -> L38
            r3 = 0
        L27:
            int r5 = r1.read(r2)     // Catch: java.lang.Throwable -> L38
            r6 = -1
            if (r5 == r6) goto L3a
            if (r5 != 0) goto L31
            goto L27
        L31:
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L38
            long r3 = r3 + r6
            r6 = 0
            r0.update(r2, r6, r5)     // Catch: java.lang.Throwable -> L38
            goto L27
        L38:
            r9 = move-exception
            goto L7f
        L3a:
            r1.close()
            long r0 = r0.getValue()
            r9.setCrc(r0)
            long r0 = r8.c0(r10)
            r9.setSize(r0)
            int r10 = r9.getMethod()
            if (r10 != 0) goto L53
            r5 = r0
            goto L55
        L53:
            r5 = -1
        L55:
            r9.setCompressedSize(r5)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "updateEntry t: "
            r10.append(r2)
            java.lang.String r9 = android.ext.g.a(r9)
            r10.append(r9)
            r9 = 32
            r10.append(r9)
            r10.append(r0)
            r10.append(r9)
            r10.append(r3)
            java.lang.String r9 = r10.toString()
            android.ext.e1.d(r9)
            return
        L7f:
            r1.close()
            throw r9
    }

    private void H(android.ext.b1.b0 r2) {
            r1 = this;
            r0 = 1
            r1.I(r2, r0)
            return
    }

    private static int H0() {
            r0 = 1
            float r0 = (float) r0
            r1 = 1183640627(0x468cec33, float:18038.1)
            float r0 = r0 * r1
            r1 = 1156277043(0x44eb6333, float:1883.1)
            float r0 = r0 - r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            return r0
    }

    static void H1() {
            android.ext.b1$c0 r0 = android.ext.b1.C
            int r0 = r0.f611b
            int r1 = android.ext.b1.J
            int r0 = r0 + r1
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto Ld
            r0 = 1000(0x3e8, float:1.401E-42)
        Ld:
            java.lang.ref.WeakReference r2 = android.ext.b1.G
            java.lang.Object r2 = r2.get()
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            if (r2 == 0) goto L1d
            r2.setMax(r1)
            r2.setProgress(r0)
        L1d:
            java.lang.ref.WeakReference r1 = android.ext.b1.H
            java.lang.Object r1 = r1.get()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 1
            if (r1 == 0) goto L45
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = (double) r0
            double r6 = r6 * r4
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r6 = r6 / r4
            java.lang.Double r0 = java.lang.Double.valueOf(r6)
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "%.1f %%"
            java.lang.String r0 = android.ext.Tools.L1(r0, r3)
            r1.setText(r0)
        L45:
            int r0 = android.ext.b1.J
            r1 = 199(0xc7, float:2.79E-43)
            if (r0 >= r1) goto L50
            int r0 = android.ext.b1.J
            int r0 = r0 + r2
            android.ext.b1.J = r0
        L50:
            android.ext.b1$c0 r0 = android.ext.b1.C
            int r0 = r0.f611b
            r1 = 600(0x258, float:8.41E-43)
            if (r0 != r1) goto Le1
            int r0 = android.ext.b1.J
            r1 = 60
            java.lang.String r3 = ":\n"
            r4 = 2131296762(0x7f0901fa, float:1.821145E38)
            java.lang.String r5 = "\n\n"
            if (r0 != r1) goto L9b
            java.lang.ref.WeakReference r0 = android.ext.b1.I
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.f612c
            if (r0 == 0) goto L9b
            if (r1 == 0) goto L9b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 2131296705(0x7f0901c1, float:1.8211334E38)
            java.lang.String r7 = android.ext.b2.f(r7)
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = android.ext.Tools.N1(r4)
            r6.append(r7)
            r6.append(r3)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r0.setText(r1)
        L9b:
            int r0 = android.ext.b1.J
            r1 = 198(0xc6, float:2.77E-43)
            if (r0 != r1) goto Le1
            android.ext.b1 r0 = android.ext.b1.B
            if (r0 == 0) goto Le1
            android.ext.b1$c0 r0 = android.ext.b1.C
            boolean r0 = r0.h
            if (r0 == 0) goto Le1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2131296437(0x7f0900b5, float:1.821079E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = android.ext.Tools.N1(r4)
            r0.append(r1)
            r0.append(r3)
            android.ext.b1 r1 = android.ext.b1.B
            java.io.File r1 = r1.f594c
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.b1 r1 = android.ext.b1.B
            android.content.Intent[] r1 = r1.a0()
            r3 = -123(0xffffffffffffff85, float:NaN)
            T0(r0, r2, r3, r1)
        Le1:
            return
    }

    private boolean I(android.ext.b1.b0 r30, boolean r31) {
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = 8
            byte[] r3 = new byte[r2]
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r4 = r4.order(r5)
            long r6 = r30.b()
            r8 = 64
            java.lang.String r10 = "fixDex: truncated classes.dex header"
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 < 0) goto L32b
            r8 = 56
            r1.f(r8)
            r8 = 0
            int r3 = r1.e(r3, r8, r2)
            if (r3 != r2) goto L324
            r4.position(r8)
            int r2 = r4.getInt()
            int r3 = r4.getInt()
            r4 = 1
            if (r2 < r4) goto L31b
            r9 = 64
            if (r3 < r9) goto L31b
            long r10 = (long) r3
            r12 = 4
            long r14 = (long) r2
            long r14 = r14 * r12
            long r14 = r14 + r10
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 > 0) goto L31b
            int r3 = r2 * 4
            byte[] r12 = new byte[r3]
            r1.f(r10)
            int r13 = r1.d(r12)
            if (r13 != r3) goto L312
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r12)
            java.nio.ByteBuffer r3 = r3.order(r5)
            int[] r5 = new int[r2]
            r13 = 0
        L5f:
            if (r13 >= r2) goto L87
            int r14 = r3.getInt()
            r5[r13] = r14
            if (r14 < r9) goto L7f
            r16 = r10
            long r9 = (long) r14
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 >= 0) goto L7f
            if (r13 <= 0) goto L78
            int r9 = r13 + (-1)
            r9 = r5[r9]
            if (r14 <= r9) goto L7f
        L78:
            int r13 = r13 + 1
            r10 = r16
            r9 = 64
            goto L5f
        L7f:
            android.ext.b1$v r1 = new android.ext.b1$v
            java.lang.String r2 = "fixDex: string_ids offsets are not strictly increasing"
            r1.<init>(r2)
            throw r1
        L87:
            r16 = r10
            r9 = r5[r8]
            long r10 = (long) r9
            long r6 = r6 - r10
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 > 0) goto L309
            int r7 = (int) r6
            byte[] r6 = new byte[r7]
            r1.f(r10)
            int r13 = r1.d(r6)
            if (r13 != r7) goto L300
            java.lang.String r13 = android.ext.i.f1000b
            r14 = 46
            r15 = 47
            java.lang.String r13 = r13.replace(r14, r15)
            java.lang.String r8 = r0.f598g
            java.lang.String r8 = r8.replace(r14, r15)
            int r14 = r13.length()
            int r15 = r8.length()
            if (r14 < r15) goto L2f7
            java.lang.String[] r14 = new java.lang.String[r2]
            int[] r15 = new int[r2]
            r18 = r3
            r4 = 0
        Lc1:
            java.lang.String r3 = " has an empty slot"
            java.lang.String r0 = "fixDex: string "
            if (r4 >= r2) goto L10c
            r19 = r5[r4]
            r20 = r10
            int r10 = r19 - r9
            int r11 = r4 + 1
            if (r11 >= r2) goto Ldc
            r19 = r5[r11]
            int r19 = r19 - r9
            r28 = r19
            r19 = r11
            r11 = r28
            goto Ldf
        Ldc:
            r19 = r11
            r11 = r7
        Ldf:
            if (r10 >= r11) goto Lf4
            android.ext.b1$u r0 = x(r6, r10, r11, r4)
            java.lang.String r3 = r0.f643a
            r14[r4] = r3
            int r0 = r0.f645c
            r15[r4] = r0
            r0 = r29
            r4 = r19
            r10 = r20
            goto Lc1
        Lf4:
            android.ext.b1$v r1 = new android.ext.b1$v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L10c:
            r20 = r10
            int r4 = r2 + (-1)
            r10 = r5[r4]
            int r10 = r10 - r9
            r4 = r15[r4]
            int r10 = r10 + r4
            r4 = 1
            if (r10 < r4) goto L2ed
            if (r10 > r7) goto L2ed
            byte[][] r4 = new byte[r2][]
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r19 = r3
            r3 = 0
            r11 = 0
            r15 = 0
        L127:
            r22 = r0
            if (r11 >= r2) goto L19d
            r0 = r14[r11]
            java.lang.String r1 = r0.replace(r13, r8)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L139
            int r15 = r15 + 1
        L139:
            r14[r11] = r1
            byte[] r0 = A0(r1)
            int r23 = r1.length()
            int r23 = E1(r23)
            r24 = r8
            int r8 = r0.length
            int r23 = r23 + r8
            r25 = r14
            r8 = 1
            int r14 = r23 + 1
            byte[] r8 = new byte[r14]
            r23 = r15
            int r15 = r1.length()
            r26 = r13
            r13 = 0
            int r15 = D1(r15, r8, r13)
            r27 = r6
            int r6 = r0.length
            java.lang.System.arraycopy(r0, r13, r8, r15, r6)
            r4[r11] = r8
            int r0 = r10 - r14
            if (r3 > r0) goto L195
            int r3 = r3 + r14
            java.lang.Object r0 = r7.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L177
            r0 = 1
            goto L17d
        L177:
            int r0 = r0.intValue()
            r6 = 1
            int r0 = r0 + r6
        L17d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.put(r1, r0)
            int r11 = r11 + 1
            r1 = r30
            r0 = r22
            r15 = r23
            r8 = r24
            r14 = r25
            r13 = r26
            r6 = r27
            goto L127
        L195:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: repacked string_data section does not fit"
            r0.<init>(r1)
            throw r0
        L19d:
            r27 = r6
            r26 = r13
            if (r15 != 0) goto L1af
            if (r31 != 0) goto L1a7
            r0 = 0
            return r0
        L1a7:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: no string in classes.dex carried the original package"
            r0.<init>(r1)
            throw r0
        L1af:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r12)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            r1 = 0
            r6 = 0
        L1bb:
            if (r1 >= r2) goto L1d6
            int r8 = r9 + r6
            r5[r1] = r8
            int r11 = r1 * 4
            r0.putInt(r11, r8)
            r8 = r4[r1]
            int r11 = r8.length
            r14 = r27
            r13 = 0
            java.lang.System.arraycopy(r8, r13, r14, r6, r11)
            r8 = r4[r1]
            int r8 = r8.length
            int r6 = r6 + r8
            int r1 = r1 + 1
            goto L1bb
        L1d6:
            r14 = r27
            r13 = 0
            java.util.Arrays.fill(r14, r6, r10, r13)
            r0 = r30
            r13 = r16
            r0.f(r13)
            r0.h(r12)
            r11 = r20
            r0.f(r11)
            r4 = r27
            r1 = 0
            r0.i(r4, r1, r10)
            byte[] r1 = new byte[r10]
            r0.f(r11)
            int r4 = r0.d(r1)
            if (r4 != r10) goto L2e3
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r6 = 0
        L202:
            if (r6 >= r2) goto L27b
            r8 = r5[r6]
            int r8 = r8 - r9
            int r10 = r6 + 1
            if (r10 >= r2) goto L20f
            r11 = r5[r10]
            int r11 = r11 - r9
            goto L210
        L20f:
            r11 = r3
        L210:
            if (r8 >= r11) goto L25f
            android.ext.b1$u r12 = x(r1, r8, r11, r6)
            int r13 = r12.f645c
            int r11 = r11 - r8
            if (r13 != r11) goto L248
            java.lang.String r6 = r12.f643a
            r8 = r26
            int r11 = r6.indexOf(r8)
            if (r11 >= 0) goto L240
            java.lang.Object r11 = r4.get(r6)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto L22f
            r11 = 1
            goto L235
        L22f:
            int r11 = r11.intValue()
            r12 = 1
            int r11 = r11 + r12
        L235:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4.put(r6, r11)
            r26 = r8
            r6 = r10
            goto L202
        L240:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: rewritten DEX still contains the original package"
            r0.<init>(r1)
            throw r0
        L248:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fixDex: string_data items are not contiguous at "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L25f:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r22
            r1.append(r2)
            r1.append(r6)
            r2 = r19
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L27b:
            boolean r1 = r7.equals(r4)
            if (r1 == 0) goto L2d9
            byte[] r1 = r29.S()
            r2 = 32
            r0.f(r2)
            r2 = r29
            java.security.MessageDigest r3 = r2.l
            r3.reset()
        L291:
            int r3 = r0.d(r1)
            r4 = -1
            if (r3 == r4) goto L29f
            java.security.MessageDigest r4 = r2.l
            r5 = 0
            r4.update(r1, r5, r3)
            goto L291
        L29f:
            r5 = 12
            r0.f(r5)
            java.security.MessageDigest r3 = r2.l
            byte[] r3 = r3.digest()
            r0.h(r3)
            java.util.zip.Adler32 r3 = new java.util.zip.Adler32
            r3.<init>()
            r0.f(r5)
        L2b5:
            int r5 = r0.d(r1)
            r6 = 0
            if (r5 == r4) goto L2c0
            r3.update(r1, r6, r5)
            goto L2b5
        L2c0:
            r4 = 8
            r0.f(r4)
            long r3 = r3.getValue()
            int r1 = (int) r3
            r3 = r18
            r3.putInt(r6, r1)
            byte[] r1 = r3.array()
            r3 = 4
            r0.i(r1, r6, r3)
            r0 = 1
            return r0
        L2d9:
            r2 = r29
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: on-disk string_data does not match the expected re-base"
            r0.<init>(r1)
            throw r0
        L2e3:
            r2 = r29
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: re-read of string_data section failed"
            r0.<init>(r1)
            throw r0
        L2ed:
            r2 = r29
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: string_data section is out of bounds"
            r0.<init>(r1)
            throw r0
        L2f7:
            r2 = r0
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: generated package is longer than the original"
            r0.<init>(r1)
            throw r0
        L300:
            r2 = r0
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: truncated string_data section"
            r0.<init>(r1)
            throw r0
        L309:
            r2 = r0
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: string_data tail is out of bounds"
            r0.<init>(r1)
            throw r0
        L312:
            r2 = r0
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: truncated string_ids table"
            r0.<init>(r1)
            throw r0
        L31b:
            r2 = r0
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.String r1 = "fixDex: string_ids table is out of bounds"
            r0.<init>(r1)
            throw r0
        L324:
            r2 = r0
            android.ext.b1$v r0 = new android.ext.b1$v
            r0.<init>(r10)
            throw r0
        L32b:
            r2 = r0
            android.ext.b1$v r0 = new android.ext.b1$v
            r0.<init>(r10)
            throw r0
    }

    private static java.lang.String I0() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            r1 = 1
            float r1 = (float) r1
            r2 = 1121701069(0x42dbcccd, float:109.9)
            float r1 = r1 * r2
            r2 = 1091043328(0x41080000, float:8.5)
            float r1 = r1 - r2
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void I1() {
            r3 = this;
            android.ext.b1$c0 r0 = android.ext.b1.C
            java.lang.String r0 = r0.o
            boolean r0 = x0(r0)
            if (r0 == 0) goto L50
            android.ext.b1$c0 r0 = android.ext.b1.C
            java.lang.String r0 = r0.n
            boolean r0 = x0(r0)
            if (r0 == 0) goto L50
            q()
            java.io.File r0 = r3.f594c
            boolean r0 = r0.isFile()
            java.lang.String r1 = "binding-mismatch"
            if (r0 == 0) goto L4b
            android.ext.b1$c0 r0 = android.ext.b1.C
            java.lang.String r0 = r0.n
            java.io.File r2 = r3.f594c
            java.lang.String r2 = v1(r2)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L44
            java.io.File r0 = r3.f594c     // Catch: android.ext.b1.v -> L3e
            android.ext.b1$c0 r2 = android.ext.b1.C     // Catch: android.ext.b1.v -> L3e
            java.lang.String r2 = r2.o     // Catch: android.ext.b1.v -> L3e
            r3.L1(r0, r2)     // Catch: android.ext.b1.v -> L3e
            r3.N1()
            return
        L3e:
            r0 = move-exception
            android.ext.b1$v r0 = K1(r1, r0)
            throw r0
        L44:
            java.lang.String r0 = "commit-hash"
            android.ext.b1$v r0 = J1(r0)
            throw r0
        L4b:
            android.ext.b1$v r0 = J1(r1)
            throw r0
        L50:
            java.lang.String r0 = "binding-missing"
            android.ext.b1$v r0 = J1(r0)
            throw r0
    }

    private void J() {
            r3 = this;
            r3.O()
            r0 = 0
        L4:
            android.ext.b1$w[] r1 = r3.k
            int r2 = r1.length
            if (r0 >= r2) goto L16
            r1 = r1[r0]
            if (r1 != 0) goto Le
            goto L13
        Le:
            java.util.zip.ZipEntry r1 = r1.f646a
            r3.K(r1, r0)
        L13:
            int r0 = r0 + 1
            goto L4
        L16:
            return
    }

    private static java.lang.String J0(java.lang.String r3) {
            r0 = 0
            android.content.pm.PackageManager r1 = android.ext.Tools.B0()     // Catch: java.lang.Throwable -> L1e
            r2 = 64
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L1e
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L1e
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            if (r1 == r2) goto L16
            goto L1e
        L16:
            r1 = 0
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = l(r3)     // Catch: java.lang.Throwable -> L1e
            return r3
        L1e:
            return r0
    }

    private static android.ext.b1.v J1(java.lang.String r1) {
            r0 = 0
            android.ext.b1$v r1 = K1(r1, r0)
            return r1
    }

    private void K(java.util.zip.ZipEntry r6, int r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L104
            r1 = 1
            if (r7 == r1) goto L100
            r2 = 2
            if (r7 == r2) goto L104
            r2 = 3
            if (r7 == r2) goto L7e
            r6 = 4
            if (r7 == r6) goto L71
            r1 = 5
            if (r7 != r1) goto L5a
            byte[][] r1 = android.ext.b1.z     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L18
            r6 = r0
            goto L1a
        L18:
            r6 = r1[r6]     // Catch: java.lang.Throwable -> L2e
        L1a:
            if (r6 == 0) goto L52
            int r1 = r6.length     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L52
            java.lang.String r1 = "tamper-cert-sf"
            java.lang.String r2 = r5.f597f     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L31
            byte[] r6 = C1(r6)     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r6 = move-exception
            goto L121
        L31:
            android.ext.m0$b r6 = android.ext.m0.g(r6)     // Catch: java.lang.Throwable -> L2e
            byte[] r1 = r6.f1072a     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "tamper-cert-rsa"
            java.lang.String r3 = r5.f597f     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L45
            byte[] r1 = C1(r1)     // Catch: java.lang.Throwable -> L2e
        L45:
            java.lang.String r6 = r6.f1073b     // Catch: java.lang.Throwable -> L2e
            r5.f596e = r6     // Catch: java.lang.Throwable -> L2e
            java.io.OutputStream r0 = r5.g0(r7)     // Catch: java.lang.Throwable -> L2e
            r0.write(r1)     // Catch: java.lang.Throwable -> L2e
            goto L117
        L52:
            android.ext.b1$v r6 = new android.ext.b1$v     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = "CERT.SF is not available for signing"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2e
            throw r6     // Catch: java.lang.Throwable -> L2e
        L5a:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "unknown index: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2e
            r1.append(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2e
            throw r6     // Catch: java.lang.Throwable -> L2e
        L71:
            java.util.jar.Manifest r6 = r5.o     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L117
            java.io.OutputStream r0 = r5.g0(r7)     // Catch: java.lang.Throwable -> L2e
            r5.R(r6, r0)     // Catch: java.lang.Throwable -> L2e
            goto L117
        L7e:
            java.util.jar.Manifest r6 = r5.d0(r6)     // Catch: java.lang.Throwable -> L2e
            r5.o = r6     // Catch: java.lang.Throwable -> L2e
            java.util.Map r6 = r6.getEntries()     // Catch: java.lang.Throwable -> L2e
            r2 = 0
        L89:
            java.lang.String[] r3 = android.ext.b1.x     // Catch: java.lang.Throwable -> L2e
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2e
            if (r2 >= r4) goto La7
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Throwable -> L2e
            java.util.jar.Attributes r3 = (java.util.jar.Attributes) r3     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L99
            goto La4
        L99:
            java.io.InputStream r4 = r5.Z(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r5.U(r4)     // Catch: java.lang.Throwable -> L2e
            f1(r3, r4)     // Catch: java.lang.Throwable -> L2e
        La4:
            int r2 = r2 + 1
            goto L89
        La7:
            java.util.Set r2 = r5.P()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2e
        Laf:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto Lcc
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r6.get(r3)     // Catch: java.lang.Throwable -> L2e
            java.util.jar.Attributes r4 = (java.util.jar.Attributes) r4     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto Lc4
            goto Laf
        Lc4:
            java.lang.String r3 = r5.w1(r3)     // Catch: java.lang.Throwable -> L2e
            f1(r4, r3)     // Catch: java.lang.Throwable -> L2e
            goto Laf
        Lcc:
            byte r2 = android.ext.b1.y     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto Lf6
            if (r2 != r1) goto Ld5
            java.lang.String r2 = "lib/armeabi/libAndroid.so"
            goto Ld7
        Ld5:
            java.lang.String r2 = "lib/arm64-v8a/libAndroid.so"
        Ld7:
            java.lang.String r3 = "res/raw/ydw3a"
            java.lang.Object r3 = r6.remove(r3)     // Catch: java.lang.Throwable -> L2e
            java.util.jar.Attributes r3 = (java.util.jar.Attributes) r3     // Catch: java.lang.Throwable -> L2e
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L2e
            byte r2 = android.ext.b1.y     // Catch: java.lang.Throwable -> L2e
            if (r2 != r1) goto Le9
            java.lang.String r1 = "lib/x86/libAndroid.so"
            goto Leb
        Le9:
            java.lang.String r1 = "lib/x86_64/libAndroid.so"
        Leb:
            java.lang.String r2 = "res/raw/ydw3x"
            java.lang.Object r2 = r6.remove(r2)     // Catch: java.lang.Throwable -> L2e
            java.util.jar.Attributes r2 = (java.util.jar.Attributes) r2     // Catch: java.lang.Throwable -> L2e
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L2e
        Lf6:
            java.util.jar.Manifest r6 = r5.o     // Catch: java.lang.Throwable -> L2e
            java.io.OutputStream r0 = r5.g0(r7)     // Catch: java.lang.Throwable -> L2e
            r6.write(r0)     // Catch: java.lang.Throwable -> L2e
            goto L117
        L100:
            r5.M()     // Catch: java.lang.Throwable -> L2e
            goto L117
        L104:
            android.ext.b1$b0 r6 = new android.ext.b1$b0     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r5, r7, r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 != 0) goto L111
            r5.H(r6)     // Catch: java.lang.Throwable -> L10f
            goto L114
        L10f:
            r7 = move-exception
            goto L11d
        L111:
            r5.N(r6)     // Catch: java.lang.Throwable -> L10f
        L114:
            r6.a()     // Catch: java.lang.Throwable -> L2e
        L117:
            if (r0 == 0) goto L11c
            r0.close()
        L11c:
            return
        L11d:
            r6.a()     // Catch: java.lang.Throwable -> L2e
            throw r7     // Catch: java.lang.Throwable -> L2e
        L121:
            if (r0 == 0) goto L126
            r0.close()
        L126:
            throw r6
    }

    private static java.io.File K0(java.io.File r4) {
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = ".apk"
            boolean r1 = r0.endsWith(r1)
            if (r1 == 0) goto L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.length()
            int r2 = r2 + (-4)
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)
            r1.append(r0)
            java.lang.String r0 = ".part.apk"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            java.io.File r4 = r4.getParentFile()
            r1.<init>(r4, r0)
            return r1
        L32:
            android.ext.b1$v r4 = new android.ext.b1$v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "committed apk name is not owned: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
    }

    private static android.ext.b1.v K1(java.lang.String r4, java.lang.Throwable r5) {
            W1(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "verify: generated APK identity check failed: "
            r0.append(r1)
            r0.append(r4)
            if (r5 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L2b
        L29:
            java.lang.String r2 = ""
        L2b:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.ext.e1.i(r0)
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4, r5)
            return r0
    }

    private void L(java.util.zip.ZipEntry r5, java.io.InputStream r6, java.util.zip.ZipOutputStream r7) {
            r4 = this;
            int r0 = Y(r5)
            java.util.zip.ZipEntry r1 = new java.util.zip.ZipEntry
            r1.<init>(r5)
            r5 = -1
            if (r0 == r5) goto L36
            r4.G1(r1, r0)
            android.ext.b1$w[] r5 = r4.k
            r5 = r5[r0]
            if (r5 != 0) goto L2f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "List: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = " is null!"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.ext.e1.p(r5)
            goto L70
        L2f:
            java.lang.String r6 = r4.U0(r1, r7, r0)
            r5.f648c = r6
            goto L70
        L36:
            java.util.Map r5 = r4.p1()
            java.lang.String r0 = r1.getName()
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L6d
            java.util.zip.CRC32 r6 = new java.util.zip.CRC32
            r6.<init>()
            r6.update(r5)
            long r2 = r6.getValue()
            r1.setCrc(r2)
            int r6 = r5.length
            long r2 = (long) r6
            r1.setSize(r2)
            int r6 = r1.getMethod()
            if (r6 != 0) goto L63
            int r6 = r5.length
            long r2 = (long) r6
            goto L65
        L63:
            r2 = -1
        L65:
            r1.setCompressedSize(r2)
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r5)
        L6d:
            r4.V0(r1, r6, r7)
        L70:
            return
    }

    private static boolean L0() {
            java.lang.Object r0 = android.ext.b1.D
            monitor-enter(r0)
            android.ext.b1$c0 r1 = j0()     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.m     // Catch: java.lang.Throwable -> L17
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L24
            int r1 = r1.l     // Catch: java.lang.Throwable -> L17
            boolean r1 = N0(r1)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r4
        L17:
            r1 = move-exception
            goto Lb2
        L1a:
            java.lang.String r1 = "preflight-manual-refused"
            R1(r1)     // Catch: java.lang.Throwable -> L17
            S0()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r3
        L24:
            java.lang.String r2 = "preflight-start"
            R1(r2)     // Catch: java.lang.Throwable -> L17
            r2 = 2131296864(0x7f090260, float:1.8211657E38)
            java.lang.String r2 = android.ext.b2.f(r2)     // Catch: java.lang.Throwable -> L17
            r1(r2)     // Catch: java.lang.Throwable -> L17
            int r2 = O0()     // Catch: java.lang.Throwable -> L17
            r5 = -1
            if (r2 != r5) goto L62
            java.lang.String r5 = "preflight-root-unavailable"
            R1(r5)     // Catch: java.lang.Throwable -> L17
            r5 = 2131296866(0x7f090262, float:1.821166E38)
            java.lang.String r5 = android.ext.b2.f(r5)     // Catch: java.lang.Throwable -> L17
            r1(r5)     // Catch: java.lang.Throwable -> L17
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L17
            r6 = 26
            if (r5 < r6) goto L58
            boolean r5 = u0()     // Catch: java.lang.Throwable -> L17
            if (r5 == 0) goto L56
            goto L58
        L56:
            r5 = 0
            goto L59
        L58:
            r5 = 1
        L59:
            boolean r6 = r1.i     // Catch: java.lang.Throwable -> L17
            android.ext.b1$y r5 = M0(r2, r5, r6)     // Catch: java.lang.Throwable -> L17
            r1.i = r3     // Catch: java.lang.Throwable -> L17
            goto L78
        L62:
            if (r2 != r4) goto L6f
            r5 = 2131296865(0x7f090261, float:1.8211659E38)
            java.lang.String r5 = android.ext.b2.f(r5)     // Catch: java.lang.Throwable -> L17
            r1(r5)     // Catch: java.lang.Throwable -> L17
            goto L74
        L6f:
            java.lang.String r5 = "preflight-root-unanswered"
            R1(r5)     // Catch: java.lang.Throwable -> L17
        L74:
            android.ext.b1$y r5 = M0(r2, r3, r3)     // Catch: java.lang.Throwable -> L17
        L78:
            android.ext.b1$y r6 = android.ext.b1.y.f649a     // Catch: java.lang.Throwable -> L17
            if (r5 != r6) goto L84
            if (r2 != r4) goto L98
            java.lang.String r2 = "preflight-root-granted"
        L80:
            R1(r2)     // Catch: java.lang.Throwable -> L17
            goto L98
        L84:
            android.ext.b1$y r2 = android.ext.b1.y.f650b     // Catch: java.lang.Throwable -> L17
            if (r5 != r2) goto L90
            java.lang.String r2 = "preflight-manual-start"
            R1(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "preflight-manual-granted"
            goto L80
        L90:
            android.ext.b1$y r2 = android.ext.b1.y.f651c     // Catch: java.lang.Throwable -> L17
            if (r5 != r2) goto L98
            android.ext.b1$y r5 = P0()     // Catch: java.lang.Throwable -> L17
        L98:
            int r2 = R0(r5)     // Catch: java.lang.Throwable -> L17
            r1.l = r2     // Catch: java.lang.Throwable -> L17
            r1.m = r4     // Catch: java.lang.Throwable -> L17
            boolean r1 = N0(r2)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto La8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r4
        La8:
            java.lang.String r1 = "preflight-manual-refused"
            R1(r1)     // Catch: java.lang.Throwable -> L17
            S0()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r3
        Lb2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    private java.lang.String L1(java.io.File r9, java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = "label"
            q()
            M1(r9, r10)
            android.content.pm.PackageManager r1 = android.ext.Tools.B0()
            java.lang.String r2 = r9.getAbsolutePath()
            r3 = 95
            android.content.pm.PackageInfo r2 = r1.getPackageArchiveInfo(r2, r3)
            if (r2 == 0) goto L1d3
            java.lang.String r3 = r8.f598g
            java.lang.String r4 = r2.packageName
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1cc
            int r3 = r2.versionCode
            int r4 = r8.j
            if (r3 != r4) goto L1c5
            java.lang.String r3 = r8.i
            java.lang.String r4 = r2.versionName
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1c5
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo
            java.lang.String r4 = "application"
            if (r3 == 0) goto L1c0
            java.lang.String r5 = r9.getAbsolutePath()
            r3.sourceDir = r5
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo
            java.lang.String r5 = r9.getAbsolutePath()
            r3.publicSourceDir = r5
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo     // Catch: java.lang.Throwable -> L1ba
            java.lang.CharSequence r1 = r3.loadLabel(r1)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r3 = r8.h
            boolean r1 = r3.contentEquals(r1)
            if (r1 == 0) goto L1b5
            android.content.pm.Signature[] r0 = r2.signatures
            if (r0 == 0) goto L1ae
            int r1 = r0.length
            r3 = 1
            if (r1 != r3) goto L1ae
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = l(r0)
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L1a7
            java.lang.String r10 = y1()
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L1a0
            java.lang.String r10 = android.ext.Tools.C0()
            java.lang.String r10 = J0(r10)
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L1a0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = android.ext.i.f1000b
            r10.append(r0)
            java.lang.String r0 = "."
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r8.f598g
            r0.append(r5)
            java.lang.String r5 = ".Application"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.content.pm.ApplicationInfo r5 = r2.applicationInfo
            java.lang.String r5 = r5.className
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L19b
            android.content.pm.ActivityInfo[] r0 = r2.activities
            java.lang.String r4 = r8.f598g
            int r0 = m(r0, r4, r10)
            android.content.pm.ActivityInfo[] r4 = r2.receivers
            java.lang.String r5 = r8.f598g
            int r4 = m(r4, r5, r10)
            int r0 = r0 + r4
            android.content.pm.ServiceInfo[] r4 = r2.services
            java.lang.String r5 = r8.f598g
            int r4 = m(r4, r5, r10)
            int r0 = r0 + r4
            android.content.pm.ProviderInfo[] r4 = r2.providers
            java.lang.String r5 = r8.f598g
            int r10 = m(r4, r5, r10)
            int r0 = r0 + r10
            android.content.pm.InstrumentationInfo[] r10 = r2.instrumentation
            if (r10 == 0) goto L146
            int r4 = r10.length
            java.lang.String r5 = "instrumentation"
            if (r4 != r3) goto L141
            java.lang.String r4 = r8.f598g
            r10 = r10[r1]
            java.lang.String r10 = r10.targetPackage
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L141
            java.lang.String r10 = r8.f598g
            android.content.pm.InstrumentationInfo[] r4 = r2.instrumentation
            r4 = r4[r1]
            java.lang.String r4 = r4.packageName
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L141
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r4 = r8.f598g
            r10.append(r4)
            java.lang.String r4 = ".Instrumentation"
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            android.content.pm.InstrumentationInfo[] r4 = r2.instrumentation
            r4 = r4[r1]
            java.lang.String r4 = r4.name
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L141
            r10 = 0
        L117:
            android.content.pm.InstrumentationInfo[] r4 = r2.instrumentation
            int r6 = r4.length
            if (r10 >= r6) goto L146
            r4 = r4[r10]
            java.lang.String r6 = r8.f598g
            java.lang.String r7 = r4.packageName
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L13c
            java.lang.String r6 = r8.f598g
            java.lang.String r4 = r4.targetPackage
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L137
            int r0 = r0 + 1
            int r10 = r10 + 1
            goto L117
        L137:
            android.ext.b1$v r9 = J1(r5)
            throw r9
        L13c:
            android.ext.b1$v r9 = J1(r5)
            throw r9
        L141:
            android.ext.b1$v r9 = J1(r5)
            throw r9
        L146:
            if (r0 == 0) goto L194
            android.content.pm.ProviderInfo[] r10 = r2.providers
            java.lang.String r0 = "provider"
            if (r10 == 0) goto L18f
            int r2 = r10.length
            if (r2 != r3) goto L18f
            r10 = r10[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.f598g
            r1.append(r2)
            java.lang.String r2 = ".FileProvider"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r10.name
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L18a
            java.lang.String r1 = r8.f598g
            java.lang.String r10 = r10.authority
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L185
            q()
            java.lang.String r10 = "verify: generated APK identity ok"
            android.ext.e1.d(r10)
            java.lang.String r9 = v1(r9)
            return r9
        L185:
            android.ext.b1$v r9 = J1(r0)
            throw r9
        L18a:
            android.ext.b1$v r9 = J1(r0)
            throw r9
        L18f:
            android.ext.b1$v r9 = J1(r0)
            throw r9
        L194:
            java.lang.String r9 = "component"
            android.ext.b1$v r9 = J1(r9)
            throw r9
        L19b:
            android.ext.b1$v r9 = J1(r4)
            throw r9
        L1a0:
            java.lang.String r9 = "signature-official"
            android.ext.b1$v r9 = J1(r9)
            throw r9
        L1a7:
            java.lang.String r9 = "signature-digest"
            android.ext.b1$v r9 = J1(r9)
            throw r9
        L1ae:
            java.lang.String r9 = "signature"
            android.ext.b1$v r9 = J1(r9)
            throw r9
        L1b5:
            android.ext.b1$v r9 = J1(r0)
            throw r9
        L1ba:
            r9 = move-exception
            android.ext.b1$v r9 = K1(r0, r9)
            throw r9
        L1c0:
            android.ext.b1$v r9 = J1(r4)
            throw r9
        L1c5:
            java.lang.String r9 = "version"
            android.ext.b1$v r9 = J1(r9)
            throw r9
        L1cc:
            java.lang.String r9 = "package"
            android.ext.b1$v r9 = J1(r9)
            throw r9
        L1d3:
            java.lang.String r9 = "archive-parse"
            android.ext.b1$v r9 = J1(r9)
            throw r9
    }

    private void M() {
            r11 = this;
            java.lang.String r0 = ".Instrumentation"
            java.lang.String r1 = "."
            byte[][] r2 = android.ext.b1.z
            r3 = 1
            r2 = r2[r3]
            if (r2 == 0) goto L156
            java.lang.String r4 = android.ext.i.f1000b     // Catch: java.io.IOException -> La5
            java.lang.String r5 = r11.f598g     // Catch: java.io.IOException -> La5
            java.lang.String r6 = "package"
            byte[] r2 = android.ext.s.e(r2, r4, r5, r6)     // Catch: java.io.IOException -> La5
            java.lang.String r4 = android.ext.i.f1001c     // Catch: java.io.IOException -> La5
            java.lang.String r5 = r11.h     // Catch: java.io.IOException -> La5
            java.lang.String r6 = "label"
            byte[] r2 = android.ext.s.e(r2, r4, r5, r6)     // Catch: java.io.IOException -> La5
            java.lang.String r4 = I0()     // Catch: java.io.IOException -> La5
            java.lang.String r5 = r11.i     // Catch: java.io.IOException -> La5
            java.lang.String r6 = "versionName"
            byte[] r2 = android.ext.s.e(r2, r4, r5, r6)     // Catch: java.io.IOException -> La5
            int r4 = H0()     // Catch: java.io.IOException -> La5
            r5 = 4
            r6 = 0
            byte[] r4 = v0(r6, r5, r4)     // Catch: java.io.IOException -> La5
            r7 = 268435464(0x10000008, float:2.5243573E-29)
            r8 = 0
            byte[] r4 = v0(r4, r8, r7)     // Catch: java.io.IOException -> La5
            int r9 = r11.j     // Catch: java.io.IOException -> La5
            byte[] r9 = v0(r6, r5, r9)     // Catch: java.io.IOException -> La5
            byte[] r7 = v0(r9, r8, r7)     // Catch: java.io.IOException -> La5
            java.lang.String r9 = "versionCode"
            byte[] r2 = android.ext.s.d(r2, r4, r7, r9)     // Catch: java.io.IOException -> La5
            byte r4 = android.ext.b1.y     // Catch: java.io.IOException -> La5
            if (r4 == 0) goto La8
            r4 = 2130968620(0x7f04002c, float:1.7545899E38)
            byte[] r4 = v0(r6, r8, r4)     // Catch: java.io.IOException -> La5
            byte r7 = android.ext.b1.y     // Catch: java.io.IOException -> La5
            if (r7 != r3) goto L5f
            r7 = 2131165184(0x7f070000, float:1.7944578E38)
            goto L62
        L5f:
            r7 = 2131165185(0x7f070001, float:1.794458E38)
        L62:
            byte[] r7 = v0(r6, r8, r7)     // Catch: java.io.IOException -> La5
            java.lang.String r9 = "icon_gg"
            byte[] r2 = android.ext.s.d(r2, r4, r7, r9)     // Catch: java.io.IOException -> La5
            r4 = 2131165188(0x7f070004, float:1.7944586E38)
            byte[] r4 = v0(r6, r8, r4)     // Catch: java.io.IOException -> La5
            byte r7 = android.ext.b1.y     // Catch: java.io.IOException -> La5
            if (r7 != r3) goto L7b
            r7 = 2131165186(0x7f070002, float:1.7944582E38)
            goto L7e
        L7b:
            r7 = 2131165187(0x7f070003, float:1.7944584E38)
        L7e:
            byte[] r7 = v0(r6, r8, r7)     // Catch: java.io.IOException -> La5
            java.lang.String r9 = "icon_hw"
            byte[] r2 = android.ext.s.d(r2, r4, r7, r9)     // Catch: java.io.IOException -> La5
            r4 = 2131165191(0x7f070007, float:1.7944592E38)
            byte[] r4 = v0(r6, r8, r4)     // Catch: java.io.IOException -> La5
            byte r7 = android.ext.b1.y     // Catch: java.io.IOException -> La5
            if (r7 != r3) goto L97
            r7 = 2131165189(0x7f070005, float:1.7944588E38)
            goto L9a
        L97:
            r7 = 2131165190(0x7f070006, float:1.794459E38)
        L9a:
            byte[] r6 = v0(r6, r8, r7)     // Catch: java.io.IOException -> La5
            java.lang.String r7 = "icon_sw"
            byte[] r2 = android.ext.s.d(r2, r4, r6, r7)     // Catch: java.io.IOException -> La5
            goto La8
        La5:
            r0 = move-exception
            goto L13b
        La8:
            r4 = 6
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch: java.io.IOException -> La5
            java.lang.String r7 = "Application"
            r6[r8] = r7     // Catch: java.io.IOException -> La5
            java.lang.String r7 = "Receiver"
            r6[r3] = r7     // Catch: java.io.IOException -> La5
            java.lang.String r7 = "MainActivity"
            r9 = 2
            r6[r9] = r7     // Catch: java.io.IOException -> La5
            java.lang.String r7 = "ActivityMain"
            r9 = 3
            r6[r9] = r7     // Catch: java.io.IOException -> La5
            java.lang.String r7 = "FileProvider"
            r6[r5] = r7     // Catch: java.io.IOException -> La5
            java.lang.String r5 = "AnalyticsService"
            r7 = 5
            r6[r7] = r5     // Catch: java.io.IOException -> La5
        Lc6:
            if (r8 >= r4) goto L10e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La5
            r5.<init>()     // Catch: java.io.IOException -> La5
            java.lang.String r7 = android.ext.i.f1000b     // Catch: java.io.IOException -> La5
            r5.append(r7)     // Catch: java.io.IOException -> La5
            r5.append(r1)     // Catch: java.io.IOException -> La5
            r7 = r6[r8]     // Catch: java.io.IOException -> La5
            r5.append(r7)     // Catch: java.io.IOException -> La5
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> La5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La5
            r7.<init>()     // Catch: java.io.IOException -> La5
            java.lang.String r9 = r11.f598g     // Catch: java.io.IOException -> La5
            r7.append(r9)     // Catch: java.io.IOException -> La5
            r7.append(r1)     // Catch: java.io.IOException -> La5
            r9 = r6[r8]     // Catch: java.io.IOException -> La5
            r7.append(r9)     // Catch: java.io.IOException -> La5
            java.lang.String r7 = r7.toString()     // Catch: java.io.IOException -> La5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La5
            r9.<init>()     // Catch: java.io.IOException -> La5
            java.lang.String r10 = "component:"
            r9.append(r10)     // Catch: java.io.IOException -> La5
            r10 = r6[r8]     // Catch: java.io.IOException -> La5
            r9.append(r10)     // Catch: java.io.IOException -> La5
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> La5
            byte[] r2 = android.ext.s.e(r2, r5, r7, r9)     // Catch: java.io.IOException -> La5
            int r8 = r8 + 1
            goto Lc6
        L10e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La5
            r1.<init>()     // Catch: java.io.IOException -> La5
            java.lang.String r4 = android.ext.i.f1000b     // Catch: java.io.IOException -> La5
            r1.append(r4)     // Catch: java.io.IOException -> La5
            r1.append(r0)     // Catch: java.io.IOException -> La5
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> La5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La5
            r4.<init>()     // Catch: java.io.IOException -> La5
            java.lang.String r5 = r11.f598g     // Catch: java.io.IOException -> La5
            r4.append(r5)     // Catch: java.io.IOException -> La5
            r4.append(r0)     // Catch: java.io.IOException -> La5
            java.lang.String r0 = r4.toString()     // Catch: java.io.IOException -> La5
            java.lang.String r4 = "component:Instrumentation"
            byte[] r0 = android.ext.s.e(r2, r1, r0, r4)     // Catch: java.io.IOException -> La5
            byte[][] r1 = android.ext.b1.z
            r1[r3] = r0
            return
        L13b:
            android.ext.b1$v r1 = new android.ext.b1$v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "manifest rewrite failed: "
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L156:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "memCache is null 4: 1 "
            r1.append(r2)
            boolean[] r2 = android.ext.b1.A
            boolean r2 = r2[r3]
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    static android.ext.b1.y M0(int r1, boolean r2, boolean r3) {
            r0 = -1
            if (r1 == r0) goto L6
            android.ext.b1$y r1 = android.ext.b1.y.f649a
            return r1
        L6:
            int[] r1 = android.ext.b1.h.f623a
            android.ext.b1$r r2 = h(r3, r2)
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L1e
            r2 = 2
            if (r1 == r2) goto L1b
            android.ext.b1$y r1 = android.ext.b1.y.f652d
            return r1
        L1b:
            android.ext.b1$y r1 = android.ext.b1.y.f651c
            return r1
        L1e:
            android.ext.b1$y r1 = android.ext.b1.y.f650b
            return r1
    }

    private static void M1(java.io.File r7, java.lang.String r8) {
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            r0.<init>(r7)
            java.lang.String r7 = "META-INF/CERT.RSA"
            byte[] r7 = e1(r0, r7)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = "META-INF/CERT.SF"
            byte[] r1 = e1(r0, r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r2 = "META-INF/MANIFEST.MF"
            byte[] r2 = e1(r0, r2)     // Catch: java.lang.Throwable -> Lca
            r0.close()
            java.lang.String r0 = "signature"
            if (r7 == 0) goto Lc5
            if (r1 == 0) goto Lc5
            if (r2 == 0) goto Lc5
            int r3 = w(r7)
            int r4 = r7.length
            if (r3 != r4) goto Lc0
            java.lang.String r3 = "X.509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch: java.security.cert.CertificateException -> Lba
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> Lba
            r4.<init>(r7)     // Catch: java.security.cert.CertificateException -> Lba
            java.util.Collection r3 = r3.generateCertificates(r4)     // Catch: java.security.cert.CertificateException -> Lba
            int r4 = r3.size()
            r5 = 1
            if (r4 != r5) goto Lb5
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3
            java.lang.String r4 = "SHA-256"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r4)
            byte[] r6 = r3.getEncoded()
            byte[] r5 = r5.digest(r6)
            java.lang.String r5 = android.ext.m0.i(r5)
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto Lb0
            byte[] r7 = s(r7)
            if (r7 == 0) goto Lab
            java.lang.String r8 = "SHA256withRSA"
            java.security.Signature r8 = java.security.Signature.getInstance(r8)     // Catch: java.security.GeneralSecurityException -> La5
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch: java.security.GeneralSecurityException -> La5
            r8.initVerify(r3)     // Catch: java.security.GeneralSecurityException -> La5
            r8.update(r1)     // Catch: java.security.GeneralSecurityException -> La5
            boolean r7 = r8.verify(r7)     // Catch: java.security.GeneralSecurityException -> La5
            if (r7 == 0) goto La0
            java.lang.String r7 = x1(r1)
            if (r7 == 0) goto L9b
            java.security.MessageDigest r8 = java.security.MessageDigest.getInstance(r4)
            byte[] r8 = r8.digest(r2)
            java.lang.String r8 = android.ext.m0.h(r8)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L96
            return
        L96:
            android.ext.b1$v r7 = J1(r0)
            throw r7
        L9b:
            android.ext.b1$v r7 = J1(r0)
            throw r7
        La0:
            android.ext.b1$v r7 = J1(r0)     // Catch: java.security.GeneralSecurityException -> La5
            throw r7     // Catch: java.security.GeneralSecurityException -> La5
        La5:
            r7 = move-exception
            android.ext.b1$v r7 = K1(r0, r7)
            throw r7
        Lab:
            android.ext.b1$v r7 = J1(r0)
            throw r7
        Lb0:
            android.ext.b1$v r7 = J1(r0)
            throw r7
        Lb5:
            android.ext.b1$v r7 = J1(r0)
            throw r7
        Lba:
            r7 = move-exception
            android.ext.b1$v r7 = K1(r0, r7)
            throw r7
        Lc0:
            android.ext.b1$v r7 = J1(r0)
            throw r7
        Lc5:
            android.ext.b1$v r7 = J1(r0)
            throw r7
        Lca:
            r7 = move-exception
            r0.close()
            throw r7
    }

    private void N(android.ext.b1.b0 r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 8
            byte[] r3 = new byte[r2]
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r4 = r4.order(r5)
            long r5 = r21.b()
            r7 = 0
            r1.f(r7)
            r9 = 0
            r10 = -1
            r11 = r10
            r10 = 0
        L20:
            long r13 = r21.c()
            java.lang.String r7 = "fixResources: expected exactly one RES_TABLE_PACKAGE_TYPE chunk, found "
            int r16 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r16 >= 0) goto Ld8
            int r13 = r1.d(r3)
            if (r13 != r2) goto Lbd
            android.ext.b1$s r13 = new android.ext.b1$s
            r13.<init>(r4)
            short r14 = r13.f638b
            r16 = 8
            if (r14 < r2) goto La0
            int r15 = r13.f639c
            if (r15 < r14) goto La0
            long r14 = r21.c()
            int r2 = r13.f639c
            int r8 = r2 + (-8)
            r18 = r3
            r19 = r4
            long r3 = (long) r8
            long r14 = r14 + r3
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 > 0) goto La0
            short r3 = r13.f637a
            r4 = 512(0x200, float:7.17E-43)
            if (r3 != r4) goto L86
            int r9 = r9 + 1
            r2 = 1
            if (r9 > r2) goto L71
            long r2 = r21.c()
            long r2 = r2 - r16
            short r4 = r13.f638b
            int r7 = r13.f639c
            r8 = 8
            int r7 = r7 - r8
            r1.g(r7)
            r11 = r2
            r10 = r4
            r3 = 8
            goto L97
        L71:
            android.ext.b1$v r1 = new android.ext.b1$v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L86:
            r4 = 2
            if (r3 != r4) goto L92
            short r2 = r13.f638b
            r3 = 8
            int r2 = r2 - r3
        L8e:
            r1.g(r2)
            goto L97
        L92:
            r3 = 8
            int r2 = r2 + (-8)
            goto L8e
        L97:
            r3 = r18
            r4 = r19
            r2 = 8
            r7 = 0
            goto L20
        La0:
            android.ext.b1$v r2 = new android.ext.b1$v
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fixResources: invalid resource-table chunk at "
            r3.append(r4)
            long r4 = r21.c()
            long r4 = r4 - r16
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        Lbd:
            android.ext.b1$v r2 = new android.ext.b1$v
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fixResources: truncated resource-table chunk header at "
            r3.append(r4)
            long r4 = r21.c()
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        Ld8:
            r2 = 1
            if (r9 != r2) goto L148
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 < 0) goto L148
            r2 = 268(0x10c, float:3.76E-43)
            if (r10 < r2) goto L140
            r2 = 12
            long r11 = r11 + r2
            java.lang.String r2 = r0.f598g
            int r2 = r2.length()
            r3 = 30
            if (r2 >= r3) goto L138
            java.lang.String r2 = r0.f598g
            r3 = 1
            java.nio.charset.Charset r4 = android.ext.t1.i(r3)
            byte[] r2 = r2.getBytes(r4)
            r3 = 60
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            r1.f(r11)
            r1.h(r2)
            java.lang.String r2 = r0.f598g
            int r2 = r2.length()
            r3 = 2
            int r2 = r2 * 2
            byte[] r3 = new byte[r2]
            r1.f(r11)
            int r1 = r1.d(r3)
            if (r1 != r2) goto L130
            java.lang.String r1 = r0.f598g
            java.lang.String r2 = new java.lang.String
            r4 = 1
            java.nio.charset.Charset r4 = android.ext.t1.i(r4)
            r2.<init>(r3, r4)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L130
            return
        L130:
            android.ext.b1$v r1 = new android.ext.b1$v
            java.lang.String r2 = "fixResources: package name read-back mismatch"
            r1.<init>(r2)
            throw r1
        L138:
            android.ext.b1$v r1 = new android.ext.b1$v
            java.lang.String r2 = "fixResources: generated package name does not fit the 30-unit field"
            r1.<init>(r2)
            throw r1
        L140:
            android.ext.b1$v r1 = new android.ext.b1$v
            java.lang.String r2 = "fixResources: package chunk header too small for the name field"
            r1.<init>(r2)
            throw r1
        L148:
            android.ext.b1$v r1 = new android.ext.b1$v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    static boolean N0(int r2) {
            r0 = 1
            if (r2 == r0) goto L8
            r1 = 2
            if (r2 != r1) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private void N1() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.o
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.n
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "repack-binding.txt"
            java.io.File r1 = C(r1)
            boolean r2 = r1.isFile()
            r3 = 0
            if (r2 == 0) goto L6e
            long r4 = r1.length()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L6e
            long r4 = r1.length()
            r6 = 256(0x100, double:1.265E-321)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L6e
            long r4 = r1.length()
            int r2 = (int) r4
            byte[] r4 = new byte[r2]
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r1)
            r1 = 0
        L4a:
            if (r1 >= r2) goto L59
            int r6 = r2 - r1
            int r6 = r5.read(r4, r1, r6)     // Catch: java.lang.Throwable -> L57
            if (r6 >= 0) goto L55
            goto L59
        L55:
            int r1 = r1 + r6
            goto L4a
        L57:
            r0 = move-exception
            goto L67
        L59:
            if (r1 != r2) goto L6b
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "US-ASCII"
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r1.trim()     // Catch: java.lang.Throwable -> L57
            goto L6b
        L67:
            r5.close()
            throw r0
        L6b:
            r5.close()
        L6e:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L75
            return
        L75:
            java.lang.String r0 = "binding-mismatch"
            android.ext.b1$v r0 = J1(r0)
            throw r0
    }

    private void O() {
            r6 = this;
            java.util.Map r0 = r6.p
            if (r0 == 0) goto L6a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            goto L6a
        Lb:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            android.ext.b1$b0 r2 = new android.ext.b1$b0
            java.lang.Object r3 = r1.getValue()
            byte[] r3 = (byte[]) r3
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r2.<init>(r6, r3, r4, r5)
            r3 = 0
            boolean r3 = r6.I(r2, r3)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L48
            java.util.Set r3 = r6.P()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = r1.getKey()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L46
            r3.add(r4)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r0 = move-exception
            goto L66
        L48:
            r2.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fixSecondaryDex: "
            r2.append(r3)
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.ext.e1.d(r1)
            goto L13
        L66:
            r2.a()
            throw r0
        L6a:
            return
    }

    private static int O0() {
            r0 = 0
            int r0 = android.ext.e2.k(r0)
            return r0
    }

    private static void O1(android.content.Intent r6) {
            android.ext.b1$c0 r0 = j0()
            int r1 = r0.j
            r2 = 4
            r1 = r1 | r2
            r0.j = r1
            android.os.Handler r1 = android.ext.n2.d()
            android.ext.b1$k r3 = new android.ext.b1$k
            r3.<init>()
            r4 = 300000(0x493e0, double:1.482197E-318)
            r1.postDelayed(r3, r4)
            android.ext.r r4 = android.ext.r.n     // Catch: java.lang.Throwable -> L29 java.lang.InterruptedException -> L2b
            r4.startActivityForResult(r6, r2)     // Catch: java.lang.Throwable -> L29 java.lang.InterruptedException -> L2b
        L1e:
            int r6 = r0.j     // Catch: java.lang.Throwable -> L29 java.lang.InterruptedException -> L2b
            r6 = r6 & r2
            if (r6 != r2) goto L2d
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L29 java.lang.InterruptedException -> L2b
            goto L1e
        L29:
            r6 = move-exception
            goto L38
        L2b:
            r6 = move-exception
            goto L31
        L2d:
            r1.removeCallbacks(r3)
            goto L37
        L31:
            java.lang.String r0 = "Interrupted preflight wait"
            android.ext.e1.l(r0, r6)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L37:
            return
        L38:
            r1.removeCallbacks(r3)
            throw r6
    }

    private java.util.Set P() {
            r1 = this;
            java.util.Set r0 = r1.q
            if (r0 != 0) goto Lb
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.q = r0
        Lb:
            return r0
    }

    private static android.ext.b1.y P0() {
            android.ext.b1$c0 r0 = j0()
            java.lang.String r1 = "preflight-manual-start"
            R1(r1)
            r1 = 2131296863(0x7f09025f, float:1.8211655E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r1(r1)
            r1 = 1
            r0.i = r1
            android.content.Intent r2 = new android.content.Intent
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "package:"
            r3.append(r4)
            java.lang.String r4 = android.ext.Tools.C0()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = "android.settings.MANAGE_UNKNOWN_APP_SOURCES"
            r2.<init>(r4, r3)
            android.ext.b1.c0.p = r1
            r1 = 0
            android.ext.b1.c0.q = r1
            O1(r2)     // Catch: java.lang.Throwable -> L59 java.lang.RuntimeException -> L5b
            boolean r2 = android.ext.b1.c0.q     // Catch: java.lang.Throwable -> L59 java.lang.RuntimeException -> L5b
            r0.i = r1     // Catch: java.lang.Throwable -> L59 java.lang.RuntimeException -> L5b
            android.ext.b1.c0.p = r1
            android.ext.b1.c0.q = r1
            if (r2 == 0) goto L56
            boolean r0 = u0()
            if (r0 == 0) goto L56
            java.lang.String r0 = "preflight-manual-granted"
            R1(r0)
            android.ext.b1$y r0 = android.ext.b1.y.f650b
            return r0
        L56:
            android.ext.b1$y r0 = android.ext.b1.y.f652d
            return r0
        L59:
            r0 = move-exception
            goto L6e
        L5b:
            r2 = move-exception
            r3 = 4
            Q1(r3)     // Catch: java.lang.Throwable -> L59
            r0.i = r1     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = "Fail preflight settings"
            android.ext.e1.l(r0, r2)     // Catch: java.lang.Throwable -> L59
            android.ext.b1$y r0 = android.ext.b1.y.f652d     // Catch: java.lang.Throwable -> L59
            android.ext.b1.c0.p = r1
            android.ext.b1.c0.q = r1
            return r0
        L6e:
            android.ext.b1.c0.p = r1
            android.ext.b1.c0.q = r1
            throw r0
    }

    private void P1(android.content.Intent r5, int r6) {
            r4 = this;
            android.ext.b1$c0 r0 = android.ext.b1.C
            int r1 = r0.j
            r1 = r1 | r6
            r0.j = r1
            android.os.Handler r0 = android.ext.n2.d()
            android.ext.b1$e r1 = new android.ext.b1$e
            r1.<init>(r4, r6)
            r2 = 300000(0x493e0, double:1.482197E-318)
            r0.postDelayed(r1, r2)
            android.ext.r r2 = android.ext.r.n     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            r2.startActivityForResult(r5, r6)     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
        L1b:
            android.ext.b1$c0 r5 = android.ext.b1.C     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            int r5 = r5.j     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            r5 = r5 & r6
            if (r5 != r6) goto L41
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            r5 = 1
            if (r6 != r5) goto L1b
            java.lang.String r5 = r4.f598g     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            boolean r5 = android.ext.Tools.e1(r5)     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            if (r5 == 0) goto L1b
            android.ext.b1$c0 r5 = android.ext.b1.C     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            android.ext.b1$c0 r2 = android.ext.b1.C     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            int r2 = r2.j     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            int r3 = ~r6     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            r2 = r2 & r3
            r5.j = r2     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            goto L1b
        L3d:
            r5 = move-exception
            goto L54
        L3f:
            r5 = move-exception
            goto L45
        L41:
            r0.removeCallbacks(r1)
            goto L4b
        L45:
            java.lang.String r6 = "Interrupted wait"
            android.ext.e1.l(r6, r5)     // Catch: java.lang.Throwable -> L3d
            goto L41
        L4b:
            android.ext.b1$f r5 = new android.ext.b1$f
            r5.<init>(r4)
            android.ext.n2.i(r5)
            return
        L54:
            r0.removeCallbacks(r1)
            throw r5
    }

    private static void Q(java.security.MessageDigest r1, byte r2, byte[] r3) {
            r1.update(r2)
            int r2 = r3.length
            int r0 = r2 >>> 24
            byte r0 = (byte) r0
            r1.update(r0)
            int r0 = r2 >>> 16
            byte r0 = (byte) r0
            r1.update(r0)
            int r0 = r2 >>> 8
            byte r0 = (byte) r0
            r1.update(r0)
            byte r0 = (byte) r2
            r1.update(r0)
            r0 = 0
            r1.update(r3, r0, r2)
            return
    }

    static boolean Q0(int r1) {
            r0 = 1
            if (r1 != r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            return r0
    }

    private static void Q1(int r2) {
            android.ext.b1$c0 r0 = android.ext.b1.C
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r0.j
            int r2 = ~r2
            r2 = r2 & r1
            r0.j = r2
            return
    }

    private void R(java.util.jar.Manifest r9, java.io.OutputStream r10) {
            r8 = this;
            java.lang.String r0 = "Signature-Version: 1.0\r\n"
            byte[] r0 = r0.getBytes()
            r10.write(r0)
            java.lang.String r0 = "Created-By: 1.0 (Android SignApk)\r\n"
            byte[] r0 = r0.getBytes()
            r10.write(r0)
            java.security.MessageDigest r0 = r8.n
            r0.reset()
            java.io.PrintStream r0 = new java.io.PrintStream
            java.security.DigestOutputStream r1 = new java.security.DigestOutputStream
            android.ext.b1$x r2 = new android.ext.b1$x
            r3 = 0
            r2.<init>(r3)
            java.security.MessageDigest r3 = r8.n
            r1.<init>(r2, r3)
            r2 = 1
            java.lang.String r3 = "UTF-8"
            r0.<init>(r1, r2, r3)
            r9.write(r0)
            r0.flush()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SHA-256-Digest-Manifest: "
            r1.append(r2)
            java.security.MessageDigest r2 = r8.n
            byte[] r2 = r2.digest()
            java.lang.String r2 = android.ext.m0.h(r2)
            r1.append(r2)
            java.lang.String r2 = "\r\n\r\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            byte[] r1 = r1.getBytes()
            r10.write(r1)
            java.util.Map r9 = r9.getEntries()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L65:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L101
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Name: "
            r3.append(r4)
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r4 = "\r\n"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.print(r3)
            java.lang.Object r1 = r1.getValue()
            java.util.jar.Attributes r1 = (java.util.jar.Attributes) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L9e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lcd
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Object r7 = r5.getKey()
            r6.append(r7)
            java.lang.String r7 = ": "
            r6.append(r7)
            java.lang.Object r5 = r5.getValue()
            r6.append(r5)
            r6.append(r4)
            java.lang.String r5 = r6.toString()
            r0.print(r5)
            goto L9e
        Lcd:
            r0.print(r4)
            r0.flush()
            byte[] r1 = r3.getBytes()
            r10.write(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "SHA-256-Digest: "
            r1.append(r3)
            java.security.MessageDigest r3 = r8.n
            byte[] r3 = r3.digest()
            java.lang.String r3 = android.ext.m0.h(r3)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            byte[] r1 = r1.getBytes()
            r10.write(r1)
            goto L65
        L101:
            r10.flush()
            return
    }

    static int R0(android.ext.b1.y r1) {
            int[] r0 = android.ext.b1.h.f624b
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L13
            r0 = 2
            if (r1 == r0) goto L13
            r0 = 3
            if (r1 == r0) goto L13
            r1 = 0
            return r1
        L13:
            return r0
    }

    static void R1(java.lang.String r3) {
            if (r3 != 0) goto L8
            java.lang.String r3 = "Failed write install stage: null code"
        L4:
            android.ext.e1.p(r3)
            return
        L8:
            r0 = 0
        L9:
            java.lang.String[] r1 = android.ext.b1.u
            int r2 = r1.length
            if (r0 >= r2) goto L26
            r1 = r1[r0]
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L23
            java.lang.String r0 = "self-install.stage"
            T1(r0, r3)     // Catch: java.lang.Throwable -> L1c
            goto L22
        L1c:
            r3 = move-exception
            java.lang.String r0 = "Failed write install stage"
            android.ext.e1.s(r0, r3)
        L22:
            return
        L23:
            int r0 = r0 + 1
            goto L9
        L26:
            java.lang.String r3 = "Failed write install stage: unknown code"
            goto L4
    }

    private byte[] S() {
            r1 = this;
            byte[] r0 = r1.s
            if (r0 != 0) goto La
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]
            r1.s = r0
        La:
            return r0
    }

    private static void S0() {
            android.ext.b1$m r0 = new android.ext.b1$m
            r0.<init>()
            android.ext.n2.i(r0)
            return
    }

    private static void S1() {
            java.lang.String r0 = "installer-removed"
            java.lang.String r1 = android.ext.i.f1000b     // Catch: java.lang.Throwable -> L11
            boolean r1 = android.ext.Tools.e1(r1)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L15
            R1(r0)     // Catch: java.lang.Throwable -> L11
            f(r0)     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r0 = move-exception
            android.ext.e1.a(r0)
        L15:
            return
    }

    private java.io.File T(boolean r11) {
            r10 = this;
            java.lang.String r0 = "/cache"
            java.lang.String r1 = "/mnt/sdcard/Android/data/"
            java.lang.String r2 = "/files"
            java.lang.String r3 = "/sdcard/Android/data/"
            java.lang.String r4 = "Fail get path"
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r11 == 0) goto L1f
            java.io.File r11 = android.ext.Tools.p0()
            r5.add(r11)
            java.io.File r11 = android.ext.Tools.b0()
            r5.add(r11)
        L1f:
            android.content.Context r11 = android.ext.r.p     // Catch: java.lang.Throwable -> L29
            java.io.File r11 = r11.getExternalCacheDir()     // Catch: java.lang.Throwable -> L29
            r5.add(r11)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r11 = move-exception
            android.ext.e1.l(r4, r11)
        L2d:
            r11 = 0
            android.content.Context r6 = android.ext.r.p     // Catch: java.lang.Throwable -> L40
            java.io.File[] r6 = r6.getExternalCacheDirs()     // Catch: java.lang.Throwable -> L40
            int r7 = r6.length     // Catch: java.lang.Throwable -> L40
            r8 = 0
        L36:
            if (r8 >= r7) goto L44
            r9 = r6[r8]     // Catch: java.lang.Throwable -> L40
            r5.add(r9)     // Catch: java.lang.Throwable -> L40
            int r8 = r8 + 1
            goto L36
        L40:
            r6 = move-exception
            android.ext.e1.l(r4, r6)
        L44:
            r6 = 0
            android.content.Context r7 = android.ext.r.p     // Catch: java.lang.Throwable -> L4f
            java.io.File r7 = r7.getExternalFilesDir(r6)     // Catch: java.lang.Throwable -> L4f
            r5.add(r7)     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r7 = move-exception
            android.ext.e1.l(r4, r7)
        L53:
            android.content.Context r7 = android.ext.r.p     // Catch: java.lang.Throwable -> L64
            java.io.File[] r6 = r7.getExternalFilesDirs(r6)     // Catch: java.lang.Throwable -> L64
            int r7 = r6.length     // Catch: java.lang.Throwable -> L64
        L5a:
            if (r11 >= r7) goto L68
            r8 = r6[r11]     // Catch: java.lang.Throwable -> L64
            r5.add(r8)     // Catch: java.lang.Throwable -> L64
            int r11 = r11 + 1
            goto L5a
        L64:
            r11 = move-exception
            android.ext.e1.l(r4, r11)
        L68:
            java.io.File r11 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L70
            r5.add(r11)     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            r11 = move-exception
            android.ext.e1.l(r4, r11)
        L74:
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> Led
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r6.<init>()     // Catch: java.lang.Throwable -> Led
            r6.append(r3)     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> Led
            r6.append(r7)     // Catch: java.lang.Throwable -> Led
            r6.append(r2)     // Catch: java.lang.Throwable -> Led
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Led
            r11.<init>(r6)     // Catch: java.lang.Throwable -> Led
            r5.add(r11)     // Catch: java.lang.Throwable -> Led
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> Led
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r6.<init>()     // Catch: java.lang.Throwable -> Led
            r6.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> Led
            r6.append(r7)     // Catch: java.lang.Throwable -> Led
            r6.append(r2)     // Catch: java.lang.Throwable -> Led
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> Led
            r11.<init>(r2)     // Catch: java.lang.Throwable -> Led
            r5.add(r11)     // Catch: java.lang.Throwable -> Led
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> Led
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r2.<init>()     // Catch: java.lang.Throwable -> Led
            r2.append(r3)     // Catch: java.lang.Throwable -> Led
            java.lang.String r3 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> Led
            r2.append(r3)     // Catch: java.lang.Throwable -> Led
            r2.append(r0)     // Catch: java.lang.Throwable -> Led
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Led
            r11.<init>(r2)     // Catch: java.lang.Throwable -> Led
            r5.add(r11)     // Catch: java.lang.Throwable -> Led
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> Led
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r2.<init>()     // Catch: java.lang.Throwable -> Led
            r2.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> Led
            r2.append(r1)     // Catch: java.lang.Throwable -> Led
            r2.append(r0)     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Led
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Led
            r5.add(r11)     // Catch: java.lang.Throwable -> Led
            goto Lf1
        Led:
            r11 = move-exception
            android.ext.e1.l(r4, r11)
        Lf1:
            java.io.File r11 = new java.io.File
            java.lang.String r0 = "/sdcard"
            r11.<init>(r0)
            r5.add(r11)
            java.io.File r11 = new java.io.File
            java.lang.String r0 = "/mnt/sdcard"
            r11.<init>(r0)
            r5.add(r11)
            java.io.File r11 = new java.io.File
            java.lang.String r0 = "/data/local/tmp"
            r11.<init>(r0)
            r5.add(r11)
            java.io.File r11 = android.ext.Tools.b0()
            r5.add(r11)
            java.io.File r11 = android.ext.Tools.p0()
            r5.add(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Failed getDir: "
            r11.append(r0)
            java.util.Iterator r0 = r5.iterator()
        L12b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L155
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            java.lang.String r2 = r10.w0(r1)
            if (r2 != 0) goto L13e
            return r1
        L13e:
            if (r1 == 0) goto L12b
            java.lang.String r1 = r1.getAbsolutePath()
            r11.append(r1)
            java.lang.String r1 = ": "
            r11.append(r1)
            r11.append(r2)
            java.lang.String r1 = "; "
            r11.append(r1)
            goto L12b
        L155:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
    }

    private static void T0(java.lang.String r1, int r2, int r3, android.content.Intent[] r4) {
            android.ext.b1$a r0 = new android.ext.b1$a
            r0.<init>(r2, r4, r3, r1)
            android.ext.n2.i(r0)
            return
    }

    private static void T1(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            U1(r1, r2, r0)
            return
    }

    private java.lang.String U(java.io.InputStream r4) {
            r3 = this;
            java.security.MessageDigest r0 = r3.n
            r0.reset()
            java.security.DigestInputStream r0 = new java.security.DigestInputStream
            java.security.MessageDigest r1 = r3.n
            r0.<init>(r4, r1)
            byte[] r4 = r3.S()     // Catch: java.lang.Throwable -> L26
        L10:
            int r1 = r0.read(r4)     // Catch: java.lang.Throwable -> L26
            r2 = -1
            if (r1 == r2) goto L18
            goto L10
        L18:
            r0.close()
            java.security.MessageDigest r4 = r3.n
            byte[] r4 = r4.digest()
            java.lang.String r4 = android.ext.m0.h(r4)
            return r4
        L26:
            r4 = move-exception
            r0.close()
            throw r4
    }

    private java.lang.String U0(java.util.zip.ZipEntry r10, java.util.zip.ZipOutputStream r11, int r12) {
            r9 = this;
            java.lang.String r0 = "; "
            java.lang.String r1 = ": "
            java.lang.String r2 = "put "
            r11.putNextEntry(r10)
            java.security.MessageDigest r3 = r9.l
            r3.reset()
            java.security.DigestInputStream r3 = new java.security.DigestInputStream
            java.io.InputStream r12 = r9.Z(r12)
            java.security.MessageDigest r4 = r9.l
            r3.<init>(r12, r4)
            r12 = 2
            r4 = 0
            byte[] r6 = r9.S()     // Catch: java.lang.Throwable -> L31
        L20:
            int r7 = r3.read(r6)     // Catch: java.lang.Throwable -> L31
            r8 = -1
            if (r7 == r8) goto L33
            if (r7 != 0) goto L2a
            goto L20
        L2a:
            r8 = 0
            r11.write(r6, r8, r7)     // Catch: java.lang.Throwable -> L31
            long r7 = (long) r7
            long r4 = r4 + r7
            goto L20
        L31:
            r11 = move-exception
            goto L69
        L33:
            r3.close()
            java.security.MessageDigest r3 = r9.l
            byte[] r3 = r3.digest()
            java.lang.String r12 = android.util.Base64.encodeToString(r3, r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r10 = r10.getName()
            r3.append(r10)
            r3.append(r1)
            r3.append(r12)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r10 = r3.toString()
            android.ext.e1.d(r10)
            r11.flush()
            r11.closeEntry()
            return r12
        L69:
            r3.close()
            java.security.MessageDigest r3 = r9.l
            byte[] r3 = r3.digest()
            java.lang.String r12 = android.util.Base64.encodeToString(r3, r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r10 = r10.getName()
            r3.append(r10)
            r3.append(r1)
            r3.append(r12)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r10 = r3.toString()
            android.ext.e1.d(r10)
            throw r11
    }

    private static void U1(java.lang.String r1, java.lang.String r2, boolean r3) {
            java.io.File r1 = C(r1)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1, r3)
            r3 = 384(0x180, float:5.38E-43)
            android.ext.Tools.q(r1, r3)
            java.lang.String r1 = "US-ASCII"
            byte[] r1 = r2.getBytes(r1)     // Catch: java.lang.Throwable -> L1b
            r0.write(r1)     // Catch: java.lang.Throwable -> L1b
            r0.close()
            return
        L1b:
            r1 = move-exception
            r0.close()
            throw r1
    }

    private java.io.File V(int r5) {
            r4 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.f593b
            java.lang.String[] r2 = android.ext.b1.x
            r5 = r2[r5]
            r2 = 47
            r3 = 64
            java.lang.String r5 = r5.replace(r2, r3)
            r0.<init>(r1, r5)
            boolean r5 = r0.exists()
            if (r5 == 0) goto L1e
            r5 = 384(0x180, float:5.38E-43)
            android.ext.Tools.q(r0, r5)
        L1e:
            return r0
    }

    private void V0(java.util.zip.ZipEntry r8, java.io.InputStream r9, java.util.zip.ZipOutputStream r10) {
            r7 = this;
            int r0 = r8.getMethod()
            r1 = -1
            if (r0 == 0) goto Lb
            r8.setCompressedSize(r1)
        Lb:
            byte r0 = android.ext.b1.y
            r3 = 0
            if (r0 == 0) goto L7d
            java.lang.String r0 = r8.getName()
            java.lang.String r4 = "res/raw/ydw3a"
            boolean r4 = r4.equals(r0)
            r5 = 1
            if (r4 == 0) goto L27
            byte r4 = android.ext.b1.y
            if (r4 != r5) goto L24
            java.lang.String r4 = "lib/armeabi/libAndroid.so"
            goto L28
        L24:
            java.lang.String r4 = "lib/arm64-v8a/libAndroid.so"
            goto L28
        L27:
            r4 = 0
        L28:
            java.lang.String r6 = "res/raw/ydw3x"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L3b
            byte r0 = android.ext.b1.y
            if (r0 != r5) goto L38
            java.lang.String r0 = "lib/x86/libAndroid.so"
        L36:
            r4 = r0
            goto L3b
        L38:
            java.lang.String r0 = "lib/x86_64/libAndroid.so"
            goto L36
        L3b:
            if (r4 == 0) goto L7d
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry
            r0.<init>(r4)
            long r4 = r8.getTime()
            r0.setTime(r4)
            int r4 = r8.getMethod()
            r0.setMethod(r4)
            long r4 = r8.getCrc()
            r0.setCrc(r4)
            long r4 = r8.getSize()
            r0.setSize(r4)
            int r4 = r8.getMethod()
            if (r4 != 0) goto L68
            long r1 = r8.getSize()
        L68:
            r0.setCompressedSize(r1)
            byte[] r1 = r8.getExtra()
            r0.setExtra(r1)
            java.lang.String r8 = r8.getComment()
            r0.setComment(r8)
            r0.setMethod(r3)
            r8 = r0
        L7d:
            r10.putNextEntry(r8)
            byte[] r8 = r7.S()
        L84:
            int r0 = r9.read(r8)
            r1 = -1
            if (r0 == r1) goto L8f
            r10.write(r8, r3, r0)
            goto L84
        L8f:
            r10.flush()
            r10.closeEntry()
            return
    }

    private void V1() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.o
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.n
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "repack-binding.txt"
            T1(r1, r0)
            return
    }

    private static java.io.File W(java.lang.String r4) {
            java.io.File r0 = android.ext.Tools.q0()
            r0.mkdirs()
            java.io.File r1 = new java.io.File
            r2 = 47
            r3 = 64
            java.lang.String r4 = r4.replace(r2, r3)
            r1.<init>(r0, r4)
            return r1
    }

    private static java.lang.String W0(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            int r1 = r1 + 2
            r0.<init>(r1)
            r1 = 39
            r0.append(r1)
            r2 = 0
        L11:
            int r3 = r4.length()
            if (r2 >= r3) goto L29
            char r3 = r4.charAt(r2)
            if (r3 != r1) goto L23
            java.lang.String r3 = "'\\''"
            r0.append(r3)
            goto L26
        L23:
            r0.append(r3)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static void W1(java.lang.String r1) {
            java.lang.String r0 = "verify-generated-apk.fail"
            T1(r0, r1)     // Catch: java.lang.Throwable -> L6
            goto Lc
        L6:
            r1 = move-exception
            java.lang.String r0 = "Failed write verify marker"
            android.ext.e1.s(r0, r1)
        Lc:
            return
    }

    public static java.lang.String X() {
            java.lang.String r0 = android.ext.b1.O
            if (r0 != 0) goto L164
            java.lang.Object r1 = android.ext.b1.P
            monitor-enter(r1)
            java.lang.String r0 = android.ext.b1.O     // Catch: java.lang.Throwable -> L15e
            if (r0 != 0) goto L160
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L15e
            long r2 = -r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15e
            r4.<init>()     // Catch: java.lang.Throwable -> L15e
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L12b
            java.io.File r0 = i0()     // Catch: java.lang.Throwable -> L12b
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L12b
            java.util.Enumeration r0 = r5.entries()     // Catch: java.lang.Throwable -> L53
            r6 = 0
            r9 = 0
            r9 = r6
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L2a:
            boolean r15 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto Lff
            java.lang.Object r15 = r0.nextElement()     // Catch: java.lang.Throwable -> L53
            java.util.zip.ZipEntry r15 = (java.util.zip.ZipEntry) r15     // Catch: java.lang.Throwable -> L53
            java.lang.String r8 = r15.getName()     // Catch: java.lang.Throwable -> L53
            r16 = r0
            java.lang.String r0 = "META-INF"
            boolean r0 = r8.contains(r0)     // Catch: java.lang.Throwable -> L53
            int r8 = Y(r15)     // Catch: java.lang.Throwable -> L53
            r(r4, r12)     // Catch: java.lang.Throwable -> L53
            if (r13 == 0) goto L56
            long r12 = r13.getSize()     // Catch: java.lang.Throwable -> L53
            long r6 = r6 + r12
            int r11 = r11 + 1
            goto L56
        L53:
            r0 = move-exception
            goto L12d
        L56:
            if (r14 == 0) goto L5d
            long r12 = r14.getCrc()     // Catch: java.lang.Throwable -> L53
            long r9 = r9 + r12
        L5d:
            r12 = 2
            r13 = 1
            if (r8 == r13) goto L73
            if (r8 == 0) goto L73
            if (r8 != r12) goto L66
            goto L73
        L66:
            if (r0 != 0) goto L6a
            r8 = r15
            goto L6b
        L6a:
            r8 = 0
        L6b:
            r17 = r6
            r14 = r8
            r19 = r9
            r12 = 0
            goto Lf2
        L73:
            r4.append(r8)     // Catch: java.lang.Throwable -> L53
            r13 = 45
            r4.append(r13)     // Catch: java.lang.Throwable -> L53
            java.lang.String r14 = "S@H@A@-@3@8@4"
            java.lang.String r13 = "@"
            java.lang.String r12 = ""
            java.lang.String r12 = r14.replace(r13, r12)     // Catch: java.lang.Throwable -> L53
            java.security.MessageDigest r12 = java.security.MessageDigest.getInstance(r12)     // Catch: java.lang.Throwable -> L53
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L53
            long r13 = -r13
            r17 = r6
            java.io.InputStream r6 = r5.getInputStream(r15)     // Catch: java.lang.Throwable -> L53
            r7 = 2
            if (r8 != r7) goto L9e
            java.lang.String r6 = q0(r6, r12)     // Catch: java.lang.Throwable -> L53
            r19 = r9
            goto Lb6
        L9e:
            if (r8 != 0) goto Lb0
            java.lang.String r7 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L53
            r19 = r9
            long r9 = r15.getSize()     // Catch: java.lang.Throwable -> L53
            int r10 = (int) r9     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = o0(r6, r12, r7, r10)     // Catch: java.lang.Throwable -> L53
            goto Lb6
        Lb0:
            r19 = r9
            java.lang.String r6 = p0(r6, r12)     // Catch: java.lang.Throwable -> L53
        Lb6:
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L53
            long r13 = r13 + r9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r7.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r9 = "HH: "
            r7.append(r9)     // Catch: java.lang.Throwable -> L53
            r7.append(r8)     // Catch: java.lang.Throwable -> L53
            java.lang.String r8 = " = "
            r7.append(r8)     // Catch: java.lang.Throwable -> L53
            r7.append(r13)     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L53
            android.ext.e1.d(r7)     // Catch: java.lang.Throwable -> L53
            int r7 = r15.getMethod()     // Catch: java.lang.Throwable -> L53
            r4.append(r7)     // Catch: java.lang.Throwable -> L53
            r7 = 45
            r4.append(r7)     // Catch: java.lang.Throwable -> L53
            long r8 = r15.getTime()     // Catch: java.lang.Throwable -> L53
            r4.append(r8)     // Catch: java.lang.Throwable -> L53
            r4.append(r7)     // Catch: java.lang.Throwable -> L53
            r4.append(r6)     // Catch: java.lang.Throwable -> L53
            r12 = r15
            r14 = 0
        Lf2:
            if (r0 != 0) goto Lf6
            r13 = r15
            goto Lf7
        Lf6:
            r13 = 0
        Lf7:
            r0 = r16
            r6 = r17
            r9 = r19
            goto L2a
        Lff:
            r(r4, r12)     // Catch: java.lang.Throwable -> L53
            if (r13 == 0) goto L10b
            long r12 = r13.getSize()     // Catch: java.lang.Throwable -> L53
            long r6 = r6 + r12
            int r11 = r11 + 1
        L10b:
            if (r14 == 0) goto L112
            long r12 = r14.getCrc()     // Catch: java.lang.Throwable -> L53
            long r9 = r9 + r12
        L112:
            r4.append(r6)     // Catch: java.lang.Throwable -> L53
            r0 = 32
            r4.append(r0)     // Catch: java.lang.Throwable -> L53
            r4.append(r11)     // Catch: java.lang.Throwable -> L53
            r4.append(r0)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = java.lang.Long.toHexString(r9)     // Catch: java.lang.Throwable -> L53
            r4.append(r0)     // Catch: java.lang.Throwable -> L53
            r5.close()     // Catch: java.lang.Throwable -> L12b
            goto L13e
        L12b:
            r0 = move-exception
            goto L131
        L12d:
            r5.close()     // Catch: java.lang.Throwable -> L12b
            throw r0     // Catch: java.lang.Throwable -> L12b
        L131:
            java.lang.String r5 = "Failed get hashes"
            android.ext.e1.l(r5, r0)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r5 = "e:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L15e
            r4.append(r0)     // Catch: java.lang.Throwable -> L15e
        L13e:
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L15e
            android.ext.b1.O = r0     // Catch: java.lang.Throwable -> L15e
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L15e
            long r2 = r2 + r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15e
            r0.<init>()     // Catch: java.lang.Throwable -> L15e
            java.lang.String r4 = "HH: "
            r0.append(r4)     // Catch: java.lang.Throwable -> L15e
            r0.append(r2)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15e
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L15e
            goto L160
        L15e:
            r0 = move-exception
            goto L162
        L160:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15e
            goto L164
        L162:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15e
            throw r0
        L164:
            java.lang.String r0 = android.ext.b1.O
            return r0
    }

    private static long X0(int r4, int r5) {
            long r0 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    private static int Y(java.util.zip.ZipEntry r3) {
            java.lang.String r3 = r3.getName()
            r0 = 0
        L5:
            java.lang.String[] r1 = android.ext.b1.x
            int r2 = r1.length
            if (r0 >= r2) goto L16
            r1 = r1[r0]
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L13
            goto L17
        L13:
            int r0 = r0 + 1
            goto L5
        L16:
            r0 = -1
        L17:
            return r0
    }

    private static int Y0(java.io.InputStream r2, byte[] r3) {
            int r0 = r3.length
            r1 = 0
            int r2 = Z0(r2, r3, r1, r0)
            return r2
    }

    private java.io.InputStream Z(int r4) {
            r3 = this;
            boolean[] r0 = android.ext.b1.A
            boolean r0 = r0[r4]
            if (r0 == 0) goto L39
            byte[][] r0 = android.ext.b1.z
            if (r0 == 0) goto L18
            r0 = r0[r4]
            if (r0 == 0) goto L18
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[][] r1 = android.ext.b1.z
            r4 = r1[r4]
            r0.<init>(r4)
            goto L57
        L18:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "memCache is null 1: "
            r1.append(r2)
            r1.append(r4)
            r4 = 32
            r1.append(r4)
            byte[][] r4 = android.ext.b1.z
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getInputStream: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.ext.b1$z r0 = new android.ext.b1$z
            java.io.RandomAccessFile r4 = r3.h0(r4)
            r1 = 0
            r0.<init>(r4, r1)
        L57:
            return r0
    }

    private static int Z0(java.io.InputStream r3, byte[] r4, int r5, int r6) {
            r0 = 0
        L1:
            if (r0 >= r6) goto L13
            int r1 = r5 + r0
            int r2 = r6 - r0
            int r1 = r3.read(r4, r1, r2)
            if (r1 > 0) goto L11
            if (r0 != 0) goto L10
            r0 = -1
        L10:
            return r0
        L11:
            int r0 = r0 + r1
            goto L1
        L13:
            return r0
    }

    private boolean a() {
            r4 = this;
            o()
            java.lang.String r0 = r4.f598g
            boolean r0 = android.ext.Tools.e1(r0)
            r1 = 800(0x320, float:1.121E-42)
            if (r0 == 0) goto L10
            t1(r1)
        L10:
            android.ext.b1$c0 r0 = android.ext.b1.C
            int r0 = r0.f611b
            r2 = 600(0x258, float:8.41E-43)
            if (r0 >= r2) goto L59
            r0 = 0
            t1(r0)
            java.lang.String r0 = "repack-start"
            R1(r0)
            r4.F()
            r0 = 200(0xc8, float:2.8E-43)
            t1(r0)
            r4.J()
            r0 = 400(0x190, float:5.6E-43)
            t1(r0)
            r4.u()
            java.lang.String r0 = r4.f596e
            if (r0 == 0) goto L52
            java.lang.String r3 = "verify-start"
            R1(r3)
            java.io.File r3 = r4.f595d
            java.lang.String r3 = r4.L1(r3, r0)
            r4.t(r3, r0)
            java.lang.String r0 = "verify-pass"
            R1(r0)
            t1(r2)
            r4.g()
            goto L59
        L52:
            java.lang.String r0 = "signature-digest"
            android.ext.b1$v r0 = J1(r0)
            throw r0
        L59:
            android.ext.b1$c0 r0 = android.ext.b1.C
            int r0 = r0.f611b
            if (r0 >= r1) goto L81
            t1(r2)
            r4.v()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.ext.b1$c0 r2 = android.ext.b1.C
            java.lang.String r3 = r2.k
            r0.append(r3)
            java.lang.String r3 = r4.s0()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.k = r0
            t1(r1)
        L81:
            java.lang.String r0 = r4.f598g
            boolean r0 = android.ext.Tools.e1(r0)
            if (r0 == 0) goto Lb9
            java.lang.String r0 = "package-installed"
            R1(r0)
            android.ext.b1$c0 r0 = android.ext.b1.C
            int r0 = r0.f611b
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 >= r2) goto La7
            t1(r1)
            r4.q1()
            r4.o1()     // Catch: java.lang.Throwable -> La0
            goto La4
        La0:
            r0 = move-exception
            android.ext.e1.a(r0)
        La4:
            t1(r2)
        La7:
            java.lang.String r0 = "old-uninstall-start"
            R1(r0)
            r4.F1()     // Catch: java.lang.Throwable -> Lb0
            goto Lb4
        Lb0:
            r0 = move-exception
            android.ext.e1.a(r0)
        Lb4:
            o()
            r0 = 1
            return r0
        Lb9:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "package not installed: "
            r1.append(r2)
            java.lang.String r2 = r4.f598g
            r1.append(r2)
            r2 = 10
            r1.append(r2)
            android.ext.b1$c0 r2 = android.ext.b1.C
            java.lang.String r2 = r2.k
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private android.content.Intent[] a0() {
            r1 = this;
            java.io.File r0 = r1.f594c
            android.content.Intent[] r0 = b0(r0)
            return r0
    }

    private static byte[] a1(java.io.InputStream r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            byte[] r4 = r0.toByteArray()
            return r4
    }

    static /* synthetic */ void b() {
            S1()
            return
    }

    public static android.content.Intent[] b0(java.io.File r13) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 4
            android.content.Intent[] r1 = new android.content.Intent[r1]
            r2 = 24
            r3 = 0
            r4 = 1
            if (r0 < r2) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            boolean r2 = android.ext.b1.K
            r5 = 0
            r6 = 0
        L12:
            r7 = 2
            if (r5 >= r7) goto L74
            if (r5 != 0) goto L19
            r7 = 1
            goto L1a
        L19:
            r7 = 0
        L1a:
            r7 = r7 ^ r0
            if (r7 == 0) goto L22
            android.net.Uri r8 = android.net.Uri.fromFile(r13)
            goto L2c
        L22:
            android.content.Context r8 = android.ext.Tools.f0()
            java.lang.String r9 = android.ext.i.f1002d
            android.net.Uri r8 = d.c.d(r8, r9, r13)
        L2c:
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r10 = "android.intent.action.INSTALL_PACKAGE"
            r9.<init>(r10)
            java.lang.String r10 = "application/vnd.android.package-archive"
            r9.setDataAndType(r8, r10)
            r9.addFlags(r4)
            java.lang.String r11 = "android.intent.extra.NOT_UNKNOWN_SOURCE"
            r9.putExtra(r11, r4)
            java.lang.String r11 = "android.intent.extra.RETURN_RESULT"
            r9.putExtra(r11, r4)
            int r11 = r6 + 1
            if (r2 != 0) goto L4d
            if (r7 != 0) goto L4d
            r12 = 1
            goto L4e
        L4d:
            r12 = 0
        L4e:
            android.content.Intent r9 = m0(r9, r12)
            r1[r6] = r9
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r9 = "android.intent.action.VIEW"
            r6.<init>(r9)
            r6.setDataAndType(r8, r10)
            r6.addFlags(r4)
            int r8 = r11 + 1
            if (r2 != 0) goto L69
            if (r7 != 0) goto L69
            r7 = 1
            goto L6a
        L69:
            r7 = 0
        L6a:
            android.content.Intent r6 = m0(r6, r7)
            r1[r11] = r6
            int r5 = r5 + 1
            r6 = r8
            goto L12
        L74:
            android.ext.b1.K = r4
            return r1
    }

    private static byte[] b1(java.io.InputStream r4, int r5) {
            if (r5 <= 0) goto L2f
            byte[] r0 = new byte[r5]
            r1 = 0
            int r2 = Z0(r4, r0, r1, r5)
            if (r2 != r5) goto Lc
            return r0
        Lc:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            if (r2 >= 0) goto L12
            r3 = 0
            goto L13
        L12:
            r3 = r2
        L13:
            r5.<init>(r3)
            if (r2 <= 0) goto L1b
            r5.write(r0, r1, r2)
        L1b:
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
        L1f:
            int r2 = r4.read(r0)
            r3 = -1
            if (r2 == r3) goto L2a
            r5.write(r0, r1, r2)
            goto L1f
        L2a:
            byte[] r4 = r5.toByteArray()
            return r4
        L2f:
            byte[] r4 = a1(r4)
            return r4
    }

    static /* synthetic */ void c(java.lang.String r0) {
            f(r0)
            return
    }

    private long c0(int r4) {
            r3 = this;
            boolean[] r0 = android.ext.b1.A
            boolean r0 = r0[r4]
            if (r0 == 0) goto L32
            byte[][] r0 = android.ext.b1.z
            if (r0 == 0) goto L11
            r0 = r0[r4]
            if (r0 == 0) goto L11
            int r4 = r0.length
            long r0 = (long) r4
            goto L3a
        L11:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "memCache is null 2: "
            r1.append(r2)
            r1.append(r4)
            r4 = 32
            r1.append(r4)
            byte[][] r4 = android.ext.b1.z
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L32:
            java.io.RandomAccessFile r4 = r3.h0(r4)
            long r0 = r4.length()
        L3a:
            return r0
    }

    private byte[] c1(java.util.zip.ZipEntry r7, java.util.zip.ZipInputStream r8) {
            r6 = this;
            java.security.MessageDigest r0 = r6.l
            r0.reset()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.security.DigestOutputStream r1 = new java.security.DigestOutputStream
            java.security.MessageDigest r2 = r6.l
            r1.<init>(r0, r2)
            java.security.MessageDigest r2 = r6.m
            r2.reset()
            java.security.DigestInputStream r2 = new java.security.DigestInputStream
            java.security.MessageDigest r3 = r6.m
            r2.<init>(r8, r3)
            byte[] r8 = r6.S()     // Catch: java.lang.Throwable -> L2d
        L21:
            int r3 = r2.read(r8)     // Catch: java.lang.Throwable -> L2d
            r4 = -1
            if (r3 == r4) goto L2f
            r4 = 0
            r1.write(r8, r4, r3)     // Catch: java.lang.Throwable -> L2d
            goto L21
        L2d:
            r7 = move-exception
            goto La4
        L2f:
            r1.flush()     // Catch: java.lang.Throwable -> L2d
            r1.close()
            java.security.MessageDigest r8 = r6.l
            byte[] r8 = r8.digest()
            r1 = 2
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r1)
            java.security.MessageDigest r2 = r6.m
            byte[] r2 = r2.digest()
            java.lang.String r1 = android.util.Base64.encodeToString(r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "extract "
            r2.append(r3)
            java.lang.String r3 = r7.getName()
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r4 = " -> "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.ext.e1.d(r2)
            boolean r2 = r8.equals(r1)
            if (r2 == 0) goto L7d
            byte[] r7 = r0.toByteArray()
            return r7
        L7d:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "check hash for "
            r2.append(r5)
            java.lang.String r7 = r7.getName()
            r2.append(r7)
            r2.append(r3)
            r2.append(r1)
            r2.append(r4)
            r2.append(r8)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7)
            throw r0
        La4:
            r1.close()
            throw r7
    }

    static /* synthetic */ boolean d() {
            boolean r0 = L0()
            return r0
    }

    private java.util.jar.Manifest d0(java.util.zip.ZipEntry r7) {
            r6 = this;
            java.lang.String r7 = " -> "
            r0 = 2
            r1 = 3
            java.security.MessageDigest r2 = r6.l     // Catch: java.io.IOException -> L45
            r2.reset()     // Catch: java.io.IOException -> L45
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch: java.io.IOException -> L45
            java.io.InputStream r3 = r6.Z(r1)     // Catch: java.io.IOException -> L45
            java.security.MessageDigest r4 = r6.l     // Catch: java.io.IOException -> L45
            r2.<init>(r3, r4)     // Catch: java.io.IOException -> L45
            java.util.jar.Manifest r3 = new java.util.jar.Manifest     // Catch: java.lang.Throwable -> L47
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L47
            r2.close()     // Catch: java.io.IOException -> L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L45
            r2.<init>()     // Catch: java.io.IOException -> L45
            java.lang.String r4 = "Manifest: "
            r2.append(r4)     // Catch: java.io.IOException -> L45
            java.security.MessageDigest r4 = r6.l     // Catch: java.io.IOException -> L45
            byte[] r4 = r4.digest()     // Catch: java.io.IOException -> L45
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r0)     // Catch: java.io.IOException -> L45
            r2.append(r4)     // Catch: java.io.IOException -> L45
            r2.append(r7)     // Catch: java.io.IOException -> L45
            android.ext.b1$w[] r4 = r6.k     // Catch: java.io.IOException -> L45
            r4 = r4[r1]     // Catch: java.io.IOException -> L45
            r2.append(r4)     // Catch: java.io.IOException -> L45
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L45
            android.ext.e1.d(r2)     // Catch: java.io.IOException -> L45
            return r3
        L45:
            r2 = move-exception
            goto L4c
        L47:
            r3 = move-exception
            r2.close()     // Catch: java.io.IOException -> L45
            throw r3     // Catch: java.io.IOException -> L45
        L4c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed get manifest: "
            r4.append(r5)
            java.security.MessageDigest r5 = r6.l
            byte[] r5 = r5.digest()
            java.lang.String r0 = android.util.Base64.encodeToString(r5, r0)
            r4.append(r0)
            r4.append(r7)
            android.ext.b1$w[] r7 = r6.k
            r7 = r7[r1]
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r3.<init>(r7, r2)
            throw r3
    }

    private static java.lang.String d1() {
            r0 = 0
            return r0
    }

    static /* synthetic */ void e(int r0) {
            Q1(r0)
            return
    }

    private java.lang.String e0() {
            r2 = this;
        L0:
            r0 = 0
            java.lang.String r0 = f0(r0)
            boolean r1 = android.ext.Tools.e1(r0)
            if (r1 != 0) goto L0
            return r0
    }

    private static byte[] e1(java.util.zip.ZipFile r4, java.lang.String r5) {
            java.util.zip.ZipEntry r5 = r4.getEntry(r5)
            if (r5 != 0) goto L8
            r4 = 0
            return r4
        L8:
            java.io.InputStream r4 = r4.getInputStream(r5)
            long r0 = r5.getSize()     // Catch: java.lang.Throwable -> L33
            r2 = 65536(0x10000, double:3.2379E-319)
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L33
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)     // Catch: java.lang.Throwable -> L33
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L33
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L33
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L33
            r5 = 65536(0x10000, float:9.1835E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L33
        L27:
            int r1 = r4.read(r5)     // Catch: java.lang.Throwable -> L33
            r2 = -1
            if (r1 == r2) goto L35
            r2 = 0
            r0.write(r5, r2, r1)     // Catch: java.lang.Throwable -> L33
            goto L27
        L33:
            r5 = move-exception
            goto L3d
        L35:
            byte[] r5 = r0.toByteArray()     // Catch: java.lang.Throwable -> L33
            r4.close()
            return r5
        L3d:
            r4.close()
            throw r5
    }

    private static void f(java.lang.String r3) {
            if (r3 != 0) goto L8
            java.lang.String r3 = "Failed append readiness trace: null code"
        L4:
            android.ext.e1.p(r3)
            return
        L8:
            r0 = 0
        L9:
            java.lang.String[] r1 = android.ext.b1.v
            int r2 = r1.length
            if (r0 >= r2) goto L38
            r1 = r1[r0]
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            java.lang.String r0 = "self-install.readiness"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            r1.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "\n"
            r1.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            U1(r0, r3, r1)     // Catch: java.lang.Throwable -> L2e
            goto L34
        L2e:
            r3 = move-exception
            java.lang.String r0 = "Failed append readiness trace"
            android.ext.e1.s(r0, r3)
        L34:
            return
        L35:
            int r0 = r0 + 1
            goto L9
        L38:
            java.lang.String r3 = "Failed append readiness trace: unknown code"
            goto L4
    }

    private static java.lang.String f0(int r13) {
            r0 = 2
            if (r13 != r0) goto Lb
            r1 = 11
            char[] r1 = new char[r1]
            r1 = {x00ae: FILL_ARRAY_DATA , data: [46, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57} // fill-array
            goto L12
        Lb:
            r1 = 27
            char[] r1 = new char[r1]
            r1 = {x00be: FILL_ARRAY_DATA , data: [46, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122} // fill-array
        L12:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r13 != 0) goto L1e
            java.lang.String r3 = "com."
            r2.append(r3)
        L1e:
            java.util.Random r3 = android.ext.Tools.f489a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ""
            r4.append(r5)
            r5 = 1122579251(0x42e93333, float:116.6)
            r6 = 1
            float r7 = (float) r6
            float r7 = r7 * r5
            r5 = 1098068787(0x41733333, float:15.2)
            float r7 = r7 - r5
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            if (r13 != r6) goto L41
            java.lang.String r5 = android.ext.i.f1001c
            goto L47
        L41:
            if (r13 != 0) goto L46
            java.lang.String r5 = android.ext.i.f1000b
            goto L47
        L46:
            r5 = r4
        L47:
            int r5 = r5.length()
            int r7 = r2.length()
            int r5 = r5 - r7
            if (r13 != r0) goto L53
            goto L60
        L53:
            if (r13 != 0) goto L56
            goto L58
        L56:
            int r5 = r5 + 1
        L58:
            int r5 = r5 + (-3)
            int r5 = r3.nextInt(r5)
            int r5 = r5 + 3
        L60:
            r7 = 0
            r8 = 0
            r9 = 1
        L63:
            if (r8 >= r5) goto La8
            if (r13 != r0) goto L73
            char r10 = r4.charAt(r8)
            r11 = 46
            if (r10 != r11) goto L73
            r2.append(r11)
            goto La5
        L73:
            if (r13 == r0) goto L7a
            if (r9 == 0) goto L78
            goto L7a
        L78:
            r10 = 0
            goto L7b
        L7a:
            r10 = 1
        L7b:
            int r11 = r1.length
            if (r8 != 0) goto L81
            if (r13 == r6) goto L81
            r10 = 2
        L81:
            int r12 = r5 + (-1)
            if (r8 != r12) goto L88
            if (r10 != 0) goto L88
            r10 = 1
        L88:
            int r11 = r11 - r10
            int r11 = r3.nextInt(r11)
            int r10 = r10 + r11
            char r11 = r1[r10]
            if (r13 != r6) goto L9d
            if (r10 != 0) goto L97
            r11 = 32
            goto L9d
        L97:
            if (r9 == 0) goto L9d
            char r11 = java.lang.Character.toUpperCase(r11)
        L9d:
            r2.append(r11)
            if (r10 != 0) goto La4
            r9 = 1
            goto La5
        La4:
            r9 = 0
        La5:
            int r8 = r8 + 1
            goto L63
        La8:
            java.lang.String r13 = r2.toString()
            return r13
    }

    private static void f1(java.util.jar.Attributes r1, java.lang.String r2) {
            h1(r1)
            java.lang.String r0 = "SHA-256-Digest"
            r1.putValue(r0, r2)
            return
    }

    private void g() {
            r0 = this;
            return
    }

    private java.io.OutputStream g0(int r6) {
            r5 = this;
            boolean[] r0 = android.ext.b1.A
            boolean r0 = r0[r6]
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r3.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "getOutputStream: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L27
            r3.append(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L27
            android.ext.e1.d(r3)     // Catch: java.lang.Throwable -> L27
            android.ext.b1$a0 r3 = new android.ext.b1$a0     // Catch: java.lang.Throwable -> L27
            java.io.RandomAccessFile r4 = r5.h0(r6)     // Catch: java.lang.Throwable -> L27
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L27
            r2 = r3
            goto L2b
        L27:
            r3 = move-exception
            android.ext.e1.a(r3)
        L2b:
            if (r2 != 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Use mem cache for "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            boolean[] r0 = android.ext.b1.A
            r0[r6] = r1
            r0 = 1
        L46:
            if (r0 == 0) goto L68
            if (r6 != r1) goto L4d
            r0 = 9000(0x2328, float:1.2612E-41)
            goto L63
        L4d:
            r0 = 3
            r1 = 75000(0x124f8, float:1.05097E-40)
            if (r6 != r0) goto L57
        L53:
            r0 = 75000(0x124f8, float:1.05097E-40)
            goto L63
        L57:
            r0 = 4
            if (r6 != r0) goto L5b
            goto L53
        L5b:
            r0 = 5
            if (r6 != r0) goto L61
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L63
        L61:
            r0 = 8192(0x2000, float:1.148E-41)
        L63:
            android.ext.b1$g r2 = new android.ext.b1$g
            r2.<init>(r5, r0, r6)
        L68:
            return r2
    }

    private static java.lang.Runnable g1(java.lang.Runnable r1) {
            android.ext.b1$i r0 = new android.ext.b1$i
            r0.<init>(r1)
            return r0
    }

    static android.ext.b1.r h(boolean r0, boolean r1) {
            if (r0 == 0) goto La
            if (r1 == 0) goto L7
            android.ext.b1$r r0 = android.ext.b1.r.f633a
            goto L9
        L7:
            android.ext.b1$r r0 = android.ext.b1.r.f635c
        L9:
            return r0
        La:
            if (r1 == 0) goto Lf
            android.ext.b1$r r0 = android.ext.b1.r.f633a
            goto L11
        Lf:
            android.ext.b1$r r0 = android.ext.b1.r.f634b
        L11:
            return r0
    }

    private static void h1(java.util.jar.Attributes r7) {
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r7.next()
            boolean r1 = r0 instanceof java.util.jar.Attributes.Name
            if (r1 != 0) goto L17
            goto L8
        L17:
            java.util.jar.Attributes$Name r0 = (java.util.jar.Attributes.Name) r0
            java.lang.String r1 = r0.toString()
            int r0 = r1.length()
            r2 = 7
            if (r0 > r2) goto L25
            goto L8
        L25:
            r2 = 1
            int r3 = r0 + (-7)
            java.lang.String r4 = "-Digest"
            r5 = 0
            r6 = 7
            boolean r0 = r1.regionMatches(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L8
            r7.remove()
            goto L8
        L36:
            return
    }

    private void i() {
            r5 = this;
            android.ext.b1$c0 r0 = android.ext.b1.C
            int r0 = r0.f611b
            r1 = 600(0x258, float:8.41E-43)
            if (r0 < r1) goto L20
            android.ext.b1$c0 r0 = android.ext.b1.C
            java.lang.String r0 = r0.f612c
            if (r0 == 0) goto L20
            java.io.File r0 = new java.io.File
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.f612c
            r0.<init>(r1)
        L17:
            r5.f594c = r0
            java.io.File r0 = K0(r0)
            r5.f595d = r0
            return
        L20:
            r0 = 0
            java.io.File r1 = r5.T(r0)
            r1.mkdirs()
            android.ext.b1$c0 r2 = android.ext.b1.C
            java.io.File r3 = new java.io.File
            java.lang.String r4 = D0()
            r3.<init>(r1, r4)
            java.lang.String r1 = r3.getAbsolutePath()
            r2.f612c = r1
            android.ext.b1$c0 r1 = android.ext.b1.C
            r2 = 0
            r1.f613d = r2
            android.ext.b1$c0 r1 = android.ext.b1.C
            r1.f614e = r2
            android.ext.b1$c0 r1 = android.ext.b1.C
            r1.f615f = r2
            android.ext.b1$c0 r1 = android.ext.b1.C
            r1.f616g = r0
            android.ext.b1$c0 r0 = android.ext.b1.C
            r0.n = r2
            android.ext.b1$c0 r0 = android.ext.b1.C
            r0.o = r2
            java.io.File r0 = new java.io.File
            android.ext.b1$c0 r1 = android.ext.b1.C
            java.lang.String r1 = r1.f612c
            r0.<init>(r1)
            goto L17
    }

    private static java.io.File i0() {
            java.lang.ref.WeakReference r0 = android.ext.b1.N
            java.lang.Object r0 = r0.get()
            java.io.File r0 = (java.io.File) r0
            if (r0 != 0) goto L1b
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            java.io.File r1 = new java.io.File
            java.lang.String r2 = android.ext.Tools.W()
            r1.<init>(r2)
            r0.<init>(r1)
            android.ext.b1.N = r0
            r0 = r1
        L1b:
            return r0
    }

    public static void i1(java.lang.Runnable r5) {
            android.ext.r r0 = android.ext.r.n
            android.content.Intent r0 = r0.getIntent()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = android.ext.i.f1000b
            r3.append(r4)
            java.lang.String r4 = ".fromInstaller"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r0 = r0.getBooleanExtra(r3, r2)
            if (r0 == 0) goto L24
            r2 = 1
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "removeInstaller: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = " + "
            r0.append(r3)
            boolean r3 = android.ext.r.m
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            boolean r0 = android.ext.r.m
            if (r0 != 0) goto L51
            if (r2 == 0) goto L49
            goto L51
        L49:
            java.lang.Runnable r5 = g1(r5)
            r5.run()
            goto L84
        L51:
            android.ext.r.m = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = ": 30"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            java.lang.String r0 = android.ext.i.f1000b
            java.lang.Runnable r1 = g1(r5)
            android.ext.x2.s(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = ": 40"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.ext.e1.d(r5)
        L84:
            return
    }

    private void j(java.io.FileOutputStream r10) {
            r9 = this;
            java.lang.String r0 = "uhv2udz2Cdvvhwv2"
            java.lang.String r0 = android.ext.Tools.removeNewLinesChars(r0)
            java.lang.String r1 = "@"
            java.lang.String[] r0 = r0.split(r1)
            java.lang.String r1 = "uhv2udz2|gz"
            java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile
            java.io.File r3 = i0()
            r2.<init>(r3)
            android.ext.g r3 = new android.ext.g     // Catch: java.lang.Throwable -> L95
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L95
            java.util.Enumeration r10 = r2.entries()     // Catch: java.lang.Throwable -> L47
        L24:
            boolean r4 = r10.hasMoreElements()     // Catch: java.lang.Throwable -> L47
            r5 = 0
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r10.nextElement()     // Catch: java.lang.Throwable -> L47
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r4     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L47
            int r7 = r0.length     // Catch: java.lang.Throwable -> L47
        L36:
            if (r5 >= r7) goto L4c
            r8 = r0[r5]     // Catch: java.lang.Throwable -> L47
            boolean r8 = r6.startsWith(r8)     // Catch: java.lang.Throwable -> L47
            if (r8 == 0) goto L49
            boolean r8 = r6.startsWith(r1)     // Catch: java.lang.Throwable -> L47
            if (r8 != 0) goto L49
            goto L24
        L47:
            r10 = move-exception
            goto L97
        L49:
            int r5 = r5 + 1
            goto L36
        L4c:
            java.io.InputStream r5 = r2.getInputStream(r4)     // Catch: java.lang.Throwable -> L47
            r9.L(r4, r5, r3)     // Catch: java.lang.Throwable -> L57
            r5.close()     // Catch: java.lang.Throwable -> L47
            goto L24
        L57:
            r10 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L47
            throw r10     // Catch: java.lang.Throwable -> L47
        L5c:
            r3.close()     // Catch: java.lang.Throwable -> L95
            r2.close()
            java.io.File r10 = r9.f595d
            android.ext.h3.a(r10)
            java.io.File r10 = r9.f595d
            android.ext.h3.f(r10)
        L6c:
            android.ext.b1$w[] r10 = r9.k
            int r10 = r10.length
            if (r5 >= r10) goto L94
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "copy "
            r10.append(r0)
            r10.append(r5)
            r0 = 32
            r10.append(r0)
            android.ext.b1$w[] r0 = r9.k
            r0 = r0[r5]
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.ext.e1.d(r10)
            int r5 = r5 + 1
            goto L6c
        L94:
            return
        L95:
            r10 = move-exception
            goto L9b
        L97:
            r3.close()     // Catch: java.lang.Throwable -> L95
            throw r10     // Catch: java.lang.Throwable -> L95
        L9b:
            r2.close()
            throw r10
    }

    static android.ext.b1.c0 j0() {
            android.ext.b1$c0 r0 = android.ext.b1.C
            if (r0 != 0) goto L11
            android.ext.b1$c0 r0 = new android.ext.b1$c0
            r0.<init>()
            boolean r1 = B0()
            r0.f610a = r1
            android.ext.b1.C = r0
        L11:
            android.ext.b1$c0 r0 = android.ext.b1.C
            return r0
    }

    private static boolean j1(java.lang.String r1) {
            if (r1 == 0) goto L10
            java.lang.String r0 = "h{lw#frgh=#3"
            java.lang.String r0 = android.ext.Tools.removeNewLinesChars(r0)
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    static void k(boolean r2) {
            o()
            java.lang.String r0 = "installer.fail"
            java.io.File r0 = W(r0)     // Catch: java.io.IOException -> Ld
            r0.createNewFile()     // Catch: java.io.IOException -> Ld
            goto L13
        Ld:
            r0 = move-exception
            java.lang.String r1 = "Failed set install flag"
            android.ext.e1.l(r1, r0)
        L13:
            if (r2 == 0) goto L1d
            android.ext.b1$q r2 = new android.ext.b1$q
            r2.<init>()
            android.ext.n2.i(r2)
        L1d:
            return
    }

    public static android.content.Intent[] k0(java.lang.String r6) {
            r0 = 2
            android.content.Intent[] r0 = new android.content.Intent[r0]
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.UNINSTALL_PACKAGE"
            r1.<init>(r2)
            java.lang.String r2 = "package"
            r3 = 0
            android.net.Uri r4 = android.net.Uri.fromParts(r2, r6, r3)
            r1.setData(r4)
            java.lang.String r4 = "android.intent.extra.RETURN_RESULT"
            r5 = 1
            r1.putExtra(r4, r5)
            java.lang.String r4 = "android.intent.extra.UNINSTALL_ALL_USERS"
            r1.putExtra(r4, r5)
            r4 = 0
            r0[r4] = r1
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.DELETE"
            r1.<init>(r4)
            android.net.Uri r6 = android.net.Uri.fromParts(r2, r6, r3)
            r1.setData(r6)
            r0[r5] = r1
            return r0
    }

    private static java.lang.String k1(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "h{hf#sp#lqvwdoo#0i#"
            java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String l(android.content.pm.Signature r1) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r1 = r1.toByteArray()
            byte[] r1 = r0.digest(r1)
            java.lang.String r1 = android.ext.m0.i(r1)
            return r1
    }

    private static java.util.zip.ZipInputStream l0() {
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = i0()
            r2.<init>(r3)
            r3 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
    }

    private static java.lang.String l1(java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "2edvh1dsn"
            java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 256(0x100, float:3.59E-43)
            r1.<init>(r2)
            java.lang.String r2 = "fs#"
            java.lang.String r2 = android.ext.Tools.removeNewLinesChars(r2)
            r1.append(r2)
            java.lang.String r3 = W0(r3)
            r1.append(r3)
            java.lang.String r3 = "#"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)
            r1.append(r3)
            java.lang.String r3 = W0(r0)
            r1.append(r3)
            java.lang.String r3 = "#))#fkprg#3977#"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)
            r1.append(r3)
            java.lang.String r3 = W0(r0)
            r1.append(r3)
            java.lang.String r3 = "#))#sp#lqvwdoo#0i#"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)
            r1.append(r3)
            java.lang.String r3 = W0(r0)
            r1.append(r3)
            java.lang.String r3 = ">#uf@'B>#up#0i#"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)
            r1.append(r3)
            java.lang.String r3 = W0(r0)
            r1.append(r3)
            java.lang.String r3 = ">#upglu#"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)
            r1.append(r3)
            java.lang.String r3 = W0(r4)
            r1.append(r3)
            java.lang.String r3 = ">#h{lw#'uf"
            java.lang.String r3 = android.ext.Tools.removeNewLinesChars(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    private static int m(android.content.pm.ComponentInfo[] r5, java.lang.String r6, java.lang.String r7) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.length
            if (r0 >= r1) goto L48
            r1 = r5[r0]
            java.lang.String r1 = r1.packageName
            boolean r1 = r6.equals(r1)
            java.lang.String r2 = "component"
            if (r1 == 0) goto L43
            r1 = r5[r0]
            java.lang.String r1 = r1.name
            if (r1 == 0) goto L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = "."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L3e
            boolean r1 = r1.startsWith(r7)
            if (r1 != 0) goto L39
            int r0 = r0 + 1
            goto L4
        L39:
            android.ext.b1$v r5 = J1(r2)
            throw r5
        L3e:
            android.ext.b1$v r5 = J1(r2)
            throw r5
        L43:
            android.ext.b1$v r5 = J1(r2)
            throw r5
        L48:
            int r5 = r5.length
            return r5
    }

    private static android.content.Intent m0(android.content.Intent r6, boolean r7) {
            if (r7 == 0) goto L7f
            android.content.Context r7 = android.ext.Tools.f0()
            r0 = 1
            android.content.pm.PackageManager r1 = android.ext.Tools.B0()     // Catch: java.lang.Throwable -> L4b
            r2 = 65536(0x10000, float:9.1835E-41)
            java.util.List r1 = r1.queryIntentActivities(r6, r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4b
        L15:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L60
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4b
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2     // Catch: java.lang.Throwable -> L4b
            android.content.pm.ActivityInfo r3 = r2.activityInfo     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> L2d
            android.net.Uri r4 = r6.getData()     // Catch: java.lang.Throwable -> L2d
            r7.grantUriPermission(r3, r4, r0)     // Catch: java.lang.Throwable -> L2d
            goto L15
        L2d:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r4.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "Failed grant 0 "
            r4.append(r5)     // Catch: java.lang.Throwable -> L4b
            r4.append(r6)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "; "
            r4.append(r5)     // Catch: java.lang.Throwable -> L4b
            r4.append(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L4b
            android.ext.e1.s(r2, r3)     // Catch: java.lang.Throwable -> L4b
            goto L15
        L4b:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed grant 1 "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.ext.e1.s(r2, r1)
        L60:
            java.lang.String r1 = "com.android.packageinstaller"
            android.net.Uri r2 = r6.getData()     // Catch: java.lang.Throwable -> L6a
            r7.grantUriPermission(r1, r2, r0)     // Catch: java.lang.Throwable -> L6a
            goto L7f
        L6a:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed grant 2 "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.ext.e1.s(r0, r7)
        L7f:
            return r6
    }

    private static java.lang.String m1(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "h{hf#up#0ui#"
            java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)
            r0.append(r1)
            java.lang.String r2 = W0(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private void n(java.util.zip.ZipEntry r11, int r12, java.lang.String r13, java.lang.String r14) {
            r10 = this;
            java.lang.String r0 = " : "
            java.lang.String r1 = " -> "
            java.lang.String r2 = "]: "
            java.lang.String r3 = " ["
            java.lang.String r4 = "check hash for "
            java.security.MessageDigest r5 = r10.l
            r5.reset()
            java.security.DigestInputStream r5 = new java.security.DigestInputStream
            java.io.InputStream r6 = r10.Z(r12)
            java.security.MessageDigest r7 = r10.l
            r5.<init>(r6, r7)
            r6 = 2
            byte[] r7 = r10.S()     // Catch: java.lang.Throwable -> L9c
        L1f:
            int r8 = r5.read(r7)     // Catch: java.lang.Throwable -> L9c
            r9 = -1
            if (r8 == r9) goto L27
            goto L1f
        L27:
            r5.close()
            java.security.MessageDigest r5 = r10.l
            byte[] r5 = r5.digest()
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = r11.getName()
            r6.append(r7)
            r6.append(r3)
            r6.append(r12)
            r6.append(r2)
            r6.append(r5)
            r6.append(r0)
            r6.append(r14)
            r6.append(r1)
            r6.append(r13)
            java.lang.String r0 = r6.toString()
            android.ext.e1.d(r0)
            boolean r0 = r13.equals(r5)
            if (r0 == 0) goto L69
            return
        L69:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r11 = r11.getName()
            r6.append(r11)
            r6.append(r3)
            r6.append(r12)
            r6.append(r2)
            r6.append(r5)
            java.lang.String r11 = " != "
            r6.append(r11)
            r6.append(r14)
            r6.append(r1)
            r6.append(r13)
            java.lang.String r11 = r6.toString()
            r0.<init>(r11)
            throw r0
        L9c:
            r7 = move-exception
            r5.close()
            java.security.MessageDigest r5 = r10.l
            byte[] r5 = r5.digest()
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r11 = r11.getName()
            r6.append(r11)
            r6.append(r3)
            r6.append(r12)
            r6.append(r2)
            r6.append(r5)
            r6.append(r0)
            r6.append(r14)
            r6.append(r1)
            r6.append(r13)
            java.lang.String r11 = r6.toString()
            android.ext.e1.d(r11)
            throw r7
    }

    private static int n0(java.io.InputStream r3, java.security.MessageDigest r4, byte[] r5, int r6) {
            r0 = r6
        L1:
            if (r0 <= 0) goto L16
            int r1 = r5.length
            if (r0 <= r1) goto L8
            int r1 = r5.length
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = 0
            int r1 = r3.read(r5, r2, r1)
            if (r1 > 0) goto L11
            goto L16
        L11:
            int r0 = r0 - r1
            r4.update(r5, r2, r1)
            goto L1
        L16:
            return r6
    }

    private static java.lang.String n1(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "xpdvn#3::>#h{hf#pnglu#"
            java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)
            r0.append(r1)
            java.lang.String r2 = W0(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static void o() {
            java.lang.String r0 = "self-install.stage"
            java.io.File r0 = C(r0)     // Catch: java.lang.Throwable -> La
            r0.delete()     // Catch: java.lang.Throwable -> La
            goto L10
        La:
            r0 = move-exception
            java.lang.String r1 = "Failed clear install stage"
            android.ext.e1.s(r1, r0)
        L10:
            p()
            return
    }

    public static final java.lang.String o0(java.io.InputStream r19, java.security.MessageDigest r20, java.lang.String r21, int r22) {
            r0 = r20
            r1 = r21
            r2 = r19
            r3 = r22
            byte[] r2 = b1(r2, r3)     // Catch: java.lang.Throwable -> Lc0
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lc0
            r4 = 112(0x70, float:1.57E-43)
            if (r3 < r4) goto L233
            r3 = 0
            r5 = r2[r3]     // Catch: java.lang.Throwable -> Lc0
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 100
            if (r5 != r6) goto L22b
            r5 = 1
            r6 = r2[r5]     // Catch: java.lang.Throwable -> Lc0
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L22b
            r6 = 2
            r7 = r2[r6]     // Catch: java.lang.Throwable -> Lc0
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 120(0x78, float:1.68E-43)
            if (r7 != r8) goto L22b
            r7 = 3
            r8 = r2[r7]     // Catch: java.lang.Throwable -> Lc0
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 10
            if (r8 != r9) goto L22b
            r8 = 4
            r8 = r2[r8]     // Catch: java.lang.Throwable -> Lc0
            r9 = r8 & 255(0xff, float:3.57E-43)
            r10 = 48
            if (r9 < r10) goto L22b
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 57
            if (r8 > r9) goto L22b
            r8 = 5
            r8 = r2[r8]     // Catch: java.lang.Throwable -> Lc0
            r11 = r8 & 255(0xff, float:3.57E-43)
            if (r11 < r10) goto L22b
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 > r9) goto L22b
            r8 = 6
            r8 = r2[r8]     // Catch: java.lang.Throwable -> Lc0
            r11 = r8 & 255(0xff, float:3.57E-43)
            if (r11 < r10) goto L22b
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 > r9) goto L22b
            r8 = 7
            r8 = r2[r8]     // Catch: java.lang.Throwable -> Lc0
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 != 0) goto L22b
            if (r1 == 0) goto L223
            int r8 = r21.length()     // Catch: java.lang.Throwable -> Lc0
            if (r8 == 0) goto L223
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r2)     // Catch: java.lang.Throwable -> Lc0
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> Lc0
            java.nio.ByteBuffer r8 = r8.order(r9)     // Catch: java.lang.Throwable -> Lc0
            r9 = 36
            int r9 = r8.getInt(r9)     // Catch: java.lang.Throwable -> Lc0
            if (r9 != r4) goto L21b
            r4 = 40
            int r4 = r8.getInt(r4)     // Catch: java.lang.Throwable -> Lc0
            r9 = 305419896(0x12345678, float:5.6904566E-28)
            if (r4 != r9) goto L213
            r4 = 32
            long r9 = B(r8, r4)     // Catch: java.lang.Throwable -> Lc0
            int r11 = r2.length     // Catch: java.lang.Throwable -> Lc0
            long r11 = (long) r11     // Catch: java.lang.Throwable -> Lc0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L20b
            int r9 = r2.length     // Catch: java.lang.Throwable -> Lc0
            r10 = 104(0x68, float:1.46E-43)
            long r10 = B(r8, r10)     // Catch: java.lang.Throwable -> Lc0
            r12 = 108(0x6c, float:1.51E-43)
            long r12 = B(r8, r12)     // Catch: java.lang.Throwable -> Lc0
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 != 0) goto La9
            int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r17 != 0) goto Lb8
        La9:
            r14 = 112(0x70, double:5.53E-322)
            if (r16 == 0) goto Lc3
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto Lb8
            long r10 = r10 + r12
            long r6 = (long) r9     // Catch: java.lang.Throwable -> Lc0
            int r16 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r16 != 0) goto Lb8
            goto Lc3
        Lb8:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: data section out of bounds"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r0 = move-exception
            goto L23b
        Lc3:
            int r6 = (int) r12     // Catch: java.lang.Throwable -> Lc0
            r7 = 56
            long r10 = B(r8, r7)     // Catch: java.lang.Throwable -> Lc0
            r7 = 60
            long r12 = B(r8, r7)     // Catch: java.lang.Throwable -> Lc0
            r16 = 1
            int r7 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r7 < 0) goto L203
            r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r7 > 0) goto L203
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 < 0) goto L203
            r14 = 4
            long r14 = r14 * r10
            long r14 = r14 + r12
            long r4 = (long) r9     // Catch: java.lang.Throwable -> Lc0
            int r18 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r18 > 0) goto L203
            int r4 = (int) r10     // Catch: java.lang.Throwable -> Lc0
            int r5 = (int) r12     // Catch: java.lang.Throwable -> Lc0
            r10 = 52
            long r10 = B(r8, r10)     // Catch: java.lang.Throwable -> Lc0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 > 0) goto L1fb
            int r11 = (int) r10     // Catch: java.lang.Throwable -> Lc0
            r10 = r8
            r12 = r9
            r13 = r4
            r14 = r5
            r15 = r6
            int[] r6 = A(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lc0
            r10 = r6[r3]     // Catch: java.lang.Throwable -> Lc0
            r7 = 1
            r6 = r6[r7]     // Catch: java.lang.Throwable -> Lc0
            int[] r11 = new int[r4]     // Catch: java.lang.Throwable -> Lc0
            r12 = 0
        L109:
            if (r12 >= r4) goto L12f
            int r13 = r12 * 4
            int r13 = r13 + r5
            long r13 = B(r8, r13)     // Catch: java.lang.Throwable -> Lc0
            r15 = r8
            long r7 = (long) r10     // Catch: java.lang.Throwable -> Lc0
            int r17 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r17 < 0) goto L127
            long r7 = (long) r6     // Catch: java.lang.Throwable -> Lc0
            int r17 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r17 >= 0) goto L127
            int r7 = (int) r13     // Catch: java.lang.Throwable -> Lc0
            r11[r12] = r7     // Catch: java.lang.Throwable -> Lc0
            z(r2, r7, r6)     // Catch: java.lang.Throwable -> Lc0
            int r12 = r12 + 1
            r8 = r15
            goto L109
        L127:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: string data out of bounds"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L12f:
            java.lang.Object r7 = r11.clone()     // Catch: java.lang.Throwable -> Lc0
            int[] r7 = (int[]) r7     // Catch: java.lang.Throwable -> Lc0
            java.util.Arrays.sort(r7)     // Catch: java.lang.Throwable -> Lc0
            r8 = r7[r3]     // Catch: java.lang.Throwable -> Lc0
            if (r8 != r10) goto L1f3
            r8 = 0
        L13d:
            int r12 = r7.length     // Catch: java.lang.Throwable -> Lc0
            if (r8 >= r12) goto L16c
            r12 = r7[r8]     // Catch: java.lang.Throwable -> Lc0
            int r12 = z(r2, r12, r6)     // Catch: java.lang.Throwable -> Lc0
            int r8 = r8 + 1
            int r13 = r7.length     // Catch: java.lang.Throwable -> Lc0
            if (r8 >= r13) goto L158
            r13 = r7[r8]     // Catch: java.lang.Throwable -> Lc0
            if (r12 != r13) goto L150
            goto L158
        L150:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: string data items are not contiguous"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L158:
            int r13 = r7.length     // Catch: java.lang.Throwable -> Lc0
            if (r8 != r13) goto L13d
        L15b:
            if (r12 >= r6) goto L13d
            r13 = r2[r12]     // Catch: java.lang.Throwable -> Lc0
            if (r13 != 0) goto L164
            int r12 = r12 + 1
            goto L15b
        L164:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: non-zero string data padding"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L16c:
            r7 = 3
            long[] r8 = new long[r7]     // Catch: java.lang.Throwable -> Lc0
            r7 = 8
            r12 = 32
            long r13 = X0(r7, r12)     // Catch: java.lang.Throwable -> Lc0
            r8[r3] = r13     // Catch: java.lang.Throwable -> Lc0
            int r7 = r4 * 4
            int r7 = r7 + r5
            long r12 = X0(r5, r7)     // Catch: java.lang.Throwable -> Lc0
            r5 = 1
            r8[r5] = r12     // Catch: java.lang.Throwable -> Lc0
            long r12 = X0(r10, r6)     // Catch: java.lang.Throwable -> Lc0
            r5 = 2
            r8[r5] = r12     // Catch: java.lang.Throwable -> Lc0
            java.util.Arrays.sort(r8)     // Catch: java.lang.Throwable -> Lc0
            r5 = 3
            r10 = 0
            r12 = 0
        L190:
            if (r10 >= r5) goto L1aa
            r13 = r8[r10]     // Catch: java.lang.Throwable -> Lc0
            r16 = r8
            r15 = 32
            long r7 = r13 >> r15
            int r8 = (int) r7     // Catch: java.lang.Throwable -> Lc0
            int r7 = (int) r13     // Catch: java.lang.Throwable -> Lc0
            if (r8 <= r12) goto L1a2
            int r8 = r8 - r12
            r0.update(r2, r12, r8)     // Catch: java.lang.Throwable -> Lc0
        L1a2:
            if (r7 <= r12) goto L1a5
            r12 = r7
        L1a5:
            int r10 = r10 + 1
            r8 = r16
            goto L190
        L1aa:
            if (r12 >= r9) goto L1b0
            int r9 = r9 - r12
            r0.update(r2, r12, r9)     // Catch: java.lang.Throwable -> Lc0
        L1b0:
            r5 = 46
            r7 = 47
            java.lang.String r1 = r1.replace(r5, r7)     // Catch: java.lang.Throwable -> Lc0
            r5 = 0
        L1b9:
            if (r5 >= r4) goto L1ee
            r7 = r11[r5]     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r7 = y(r2, r7, r6)     // Catch: java.lang.Throwable -> Lc0
            r8 = 0
        L1c2:
            int r9 = r7.indexOf(r1, r8)     // Catch: java.lang.Throwable -> Lc0
            if (r9 >= 0) goto L1cd
            int r10 = r7.length()     // Catch: java.lang.Throwable -> Lc0
            goto L1ce
        L1cd:
            r10 = r9
        L1ce:
            java.lang.String r8 = r7.substring(r8, r10)     // Catch: java.lang.Throwable -> Lc0
            java.nio.charset.Charset r10 = android.ext.t1.i(r3)     // Catch: java.lang.Throwable -> Lc0
            byte[] r8 = r8.getBytes(r10)     // Catch: java.lang.Throwable -> Lc0
            Q(r0, r3, r8)     // Catch: java.lang.Throwable -> Lc0
            if (r9 >= 0) goto L1e2
            int r5 = r5 + 1
            goto L1b9
        L1e2:
            byte[] r8 = android.ext.b1.M     // Catch: java.lang.Throwable -> Lc0
            r10 = 1
            Q(r0, r10, r8)     // Catch: java.lang.Throwable -> Lc0
            int r8 = r1.length()     // Catch: java.lang.Throwable -> Lc0
            int r8 = r8 + r9
            goto L1c2
        L1ee:
            java.lang.String r0 = android.ext.w0.b(r20)     // Catch: java.lang.Throwable -> Lc0
            return r0
        L1f3:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: string data section has a gap"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L1fb:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: map list out of bounds"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L203:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: string table out of bounds"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L20b:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: file size out of bounds"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L213:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: invalid DEX endian tag"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L21b:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: invalid DEX header size"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L223:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: missing package identity"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L22b:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: invalid DEX magic"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L233:
            android.ext.b1$v r0 = new android.ext.b1$v     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "hashDex: truncated DEX header"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        L23b:
            java.lang.String r1 = "hash fail"
            android.ext.e1.l(r1, r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void o1() {
            r5 = this;
            android.content.Context r0 = android.ext.r.p
            java.lang.String r1 = r5.f598g
            java.lang.String r2 = android.ext.r.t()
            java.lang.String r3 = android.ext.Tools.C0()
            java.lang.String r4 = r5.f598g
            java.lang.String r2 = r2.replace(r3, r4)
            android.content.Intent r0 = android.ext.Tools.N0(r0, r1, r2)
            boolean r1 = android.ext.x2.h()
            if (r1 != 0) goto L38
            java.lang.String r1 = "removeInstaller: just installer"
            android.ext.e1.d(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = android.ext.i.f1000b
            r1.append(r2)
            java.lang.String r2 = ".fromInstaller"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r0.putExtra(r1, r2)
        L38:
            android.content.Context r1 = android.ext.r.p
            r1.startActivity(r0)
            return
    }

    private static void p() {
            java.lang.String r0 = "self-install.readiness"
            java.io.File r0 = C(r0)     // Catch: java.lang.Throwable -> La
            r0.delete()     // Catch: java.lang.Throwable -> La
            goto L10
        La:
            r0 = move-exception
            java.lang.String r1 = "Failed clear readiness trace"
            android.ext.e1.s(r1, r0)
        L10:
            return
    }

    public static final java.lang.String p0(java.io.InputStream r11, java.security.MessageDigest r12) {
            java.lang.String r0 = "\u0000"
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L13e
            int r11 = Y0(r11, r1)     // Catch: java.lang.Throwable -> L13e
            r2 = 1
            java.lang.String r3 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageInfo r3 = android.ext.Tools.z0(r3)     // Catch: java.lang.Throwable -> L18
            int r4 = r3.versionCode     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.versionName     // Catch: java.lang.Throwable -> L18
            goto L43
        L18:
            r3 = move-exception
            android.ext.e1.a(r3)     // Catch: java.lang.Throwable -> L13e
            float r3 = (float) r2     // Catch: java.lang.Throwable -> L13e
            r4 = 1183679130(0x468d829a, float:18113.3)
            float r4 = r4 * r3
            r5 = 1156893082(0x44f4c99a, float:1958.3)
            float r4 = r4 - r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L13e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13e
            r5.<init>()     // Catch: java.lang.Throwable -> L13e
            java.lang.String r6 = ""
            r5.append(r6)     // Catch: java.lang.Throwable -> L13e
            r6 = 1120731136(0x42cd0000, float:102.5)
            float r3 = r3 * r6
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            float r3 = r3 - r6
            r5.append(r3)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L13e
        L43:
            r5 = 13
            byte[][] r6 = new byte[r5][]     // Catch: java.lang.Throwable -> L13e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13e
            r7.<init>()     // Catch: java.lang.Throwable -> L13e
            r7.append(r0)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r8 = android.ext.i.f1002d     // Catch: java.lang.Throwable -> L13e
            int r9 = r8.length()     // Catch: java.lang.Throwable -> L13e
            char r9 = (char) r9     // Catch: java.lang.Throwable -> L13e
            r7.append(r9)     // Catch: java.lang.Throwable -> L13e
            r7.append(r8)     // Catch: java.lang.Throwable -> L13e
            r8 = 0
            r7.append(r8)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L13e
            java.nio.charset.Charset r9 = android.ext.t1.i(r2)     // Catch: java.lang.Throwable -> L13e
            byte[] r7 = r7.getBytes(r9)     // Catch: java.lang.Throwable -> L13e
            r6[r8] = r7     // Catch: java.lang.Throwable -> L13e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13e
            r7.<init>()     // Catch: java.lang.Throwable -> L13e
            r7.append(r0)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r9 = android.ext.i.f1003e     // Catch: java.lang.Throwable -> L13e
            int r10 = r9.length()     // Catch: java.lang.Throwable -> L13e
            char r10 = (char) r10     // Catch: java.lang.Throwable -> L13e
            r7.append(r10)     // Catch: java.lang.Throwable -> L13e
            r7.append(r9)     // Catch: java.lang.Throwable -> L13e
            r7.append(r8)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L13e
            java.nio.charset.Charset r9 = android.ext.t1.i(r2)     // Catch: java.lang.Throwable -> L13e
            byte[] r7 = r7.getBytes(r9)     // Catch: java.lang.Throwable -> L13e
            r6[r2] = r7     // Catch: java.lang.Throwable -> L13e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13e
            r7.<init>()     // Catch: java.lang.Throwable -> L13e
            r7.append(r0)     // Catch: java.lang.Throwable -> L13e
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L13e
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L13e
            r7.append(r0)     // Catch: java.lang.Throwable -> L13e
            r7.append(r3)     // Catch: java.lang.Throwable -> L13e
            r7.append(r8)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L13e
            java.nio.charset.Charset r3 = android.ext.t1.i(r2)     // Catch: java.lang.Throwable -> L13e
            byte[] r0 = r0.getBytes(r3)     // Catch: java.lang.Throwable -> L13e
            r3 = 2
            r6[r3] = r0     // Catch: java.lang.Throwable -> L13e
            r0 = 2130968620(0x7f04002c, float:1.7545899E38)
            r7 = 0
            byte[] r0 = v0(r7, r8, r0)     // Catch: java.lang.Throwable -> L13e
            r9 = 3
            r6[r9] = r0     // Catch: java.lang.Throwable -> L13e
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            byte[] r0 = v0(r7, r8, r0)     // Catch: java.lang.Throwable -> L13e
            r9 = 4
            r6[r9] = r0     // Catch: java.lang.Throwable -> L13e
            r0 = 2131165185(0x7f070001, float:1.794458E38)
            byte[] r0 = v0(r7, r8, r0)     // Catch: java.lang.Throwable -> L13e
            r10 = 5
            r6[r10] = r0     // Catch: java.lang.Throwable -> L13e
            r0 = 2131165188(0x7f070004, float:1.7944586E38)
            byte[] r0 = v0(r7, r8, r0)     // Catch: java.lang.Throwable -> L13e
            r10 = 6
            r6[r10] = r0     // Catch: java.lang.Throwable -> L13e
            r0 = 2131165186(0x7f070002, float:1.7944582E38)
            byte[] r0 = v0(r7, r8, r0)     // Catch: java.lang.Throwable -> L13e
            r10 = 7
            r6[r10] = r0     // Catch: java.lang.Throwable -> L13e
            r0 = 2131165187(0x7f070003, float:1.7944584E38)
            byte[] r0 = v0(r7, r8, r0)     // Catch: java.lang.Throwable -> L13e
            r10 = 8
            r6[r10] = r0     // Catch: java.lang.Throwable -> L13e
            r0 = 2131165191(0x7f070007, float:1.7944592E38)
            byte[] r0 = v0(r7, r8, r0)     // Catch: java.lang.Throwable -> L13e
            r10 = 9
            r6[r10] = r0     // Catch: java.lang.Throwable -> L13e
            r0 = 2131165189(0x7f070005, float:1.7944588E38)
            byte[] r0 = v0(r7, r8, r0)     // Catch: java.lang.Throwable -> L13e
            r10 = 10
            r6[r10] = r0     // Catch: java.lang.Throwable -> L13e
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            byte[] r0 = v0(r7, r8, r0)     // Catch: java.lang.Throwable -> L13e
            r10 = 11
            r6[r10] = r0     // Catch: java.lang.Throwable -> L13e
            byte[] r0 = v0(r7, r9, r4)     // Catch: java.lang.Throwable -> L13e
            r4 = 268435464(0x10000008, float:2.5243573E-29)
            byte[] r0 = v0(r0, r8, r4)     // Catch: java.lang.Throwable -> L13e
            r4 = 12
            r6[r4] = r0     // Catch: java.lang.Throwable -> L13e
            r0 = 0
        L127:
            if (r0 >= r5) goto L14e
            r4 = r6[r0]     // Catch: java.lang.Throwable -> L13e
            int r7 = android.ext.Tools.V0(r1, r4)     // Catch: java.lang.Throwable -> L13e
            if (r7 >= 0) goto L132
            goto L14b
        L132:
            if (r0 != 0) goto L140
            java.lang.String r4 = android.ext.i.f1000b     // Catch: java.lang.Throwable -> L13e
        L136:
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L13e
            int r4 = r4 + r9
            int r4 = r4 * 2
            goto L146
        L13e:
            r11 = move-exception
            goto L16f
        L140:
            if (r0 != r2) goto L145
            java.lang.String r4 = android.ext.i.f1001c     // Catch: java.lang.Throwable -> L13e
            goto L136
        L145:
            int r4 = r4.length     // Catch: java.lang.Throwable -> L13e
        L146:
            byte[] r10 = new byte[r4]     // Catch: java.lang.Throwable -> L13e
            java.lang.System.arraycopy(r10, r8, r1, r7, r4)     // Catch: java.lang.Throwable -> L13e
        L14b:
            int r0 = r0 + 1
            goto L127
        L14e:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)     // Catch: java.lang.Throwable -> L13e
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L13e
            java.nio.ByteBuffer r0 = r0.order(r2)     // Catch: java.lang.Throwable -> L13e
            r2 = 16
            int r0 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L13e
            int r0 = r0 * 4
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L13e
            r3 = 36
            java.lang.System.arraycopy(r2, r8, r1, r3, r0)     // Catch: java.lang.Throwable -> L13e
            r12.update(r1, r8, r11)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r11 = android.ext.w0.b(r12)     // Catch: java.lang.Throwable -> L13e
            return r11
        L16f:
            java.lang.String r12 = "hash fail"
            android.ext.e1.l(r12, r11)
            java.lang.String r11 = r11.toString()
            return r11
    }

    private java.util.Map p1() {
            r1 = this;
            java.util.Map r0 = r1.p
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.p = r0
        Lb:
            return r0
    }

    private static void q() {
            java.lang.String r0 = "verify-generated-apk.fail"
            java.io.File r0 = C(r0)     // Catch: java.lang.Throwable -> La
            r0.delete()     // Catch: java.lang.Throwable -> La
            goto L10
        La:
            r0 = move-exception
            java.lang.String r1 = "Failed clear verify marker"
            android.ext.e1.s(r1, r0)
        L10:
            return
    }

    public static final java.lang.String q0(java.io.InputStream r7, java.security.MessageDigest r8) {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r1 = r1.order(r2)     // Catch: java.lang.Throwable -> L3b
        Le:
            r2 = 0
            r3 = 8
            int r4 = Z0(r7, r0, r2, r3)     // Catch: java.lang.Throwable -> L3b
            r5 = -1
            if (r4 == r5) goto L4b
            r8.update(r0, r2, r3)     // Catch: java.lang.Throwable -> L3b
            android.ext.b1$s r4 = new android.ext.b1$s     // Catch: java.lang.Throwable -> L3b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            short r5 = r4.f637a     // Catch: java.lang.Throwable -> L3b
            r6 = 512(0x200, float:7.17E-43)
            if (r5 != r6) goto L3d
            r3 = 260(0x104, float:3.64E-43)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L3b
            r5 = 4
            Z0(r7, r3, r2, r5)     // Catch: java.lang.Throwable -> L3b
            r8.update(r3)     // Catch: java.lang.Throwable -> L3b
            r2 = 256(0x100, float:3.59E-43)
            Z0(r7, r3, r5, r2)     // Catch: java.lang.Throwable -> L3b
            int r2 = r4.f639c     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + (-268)
            goto L47
        L3b:
            r7 = move-exception
            goto L50
        L3d:
            r2 = 2
            if (r5 != r2) goto L44
            short r2 = r4.f638b     // Catch: java.lang.Throwable -> L3b
        L42:
            int r2 = r2 - r3
            goto L47
        L44:
            int r2 = r4.f639c     // Catch: java.lang.Throwable -> L3b
            goto L42
        L47:
            n0(r7, r8, r0, r2)     // Catch: java.lang.Throwable -> L3b
            goto Le
        L4b:
            java.lang.String r7 = android.ext.w0.b(r8)     // Catch: java.lang.Throwable -> L3b
            return r7
        L50:
            java.lang.String r8 = "hash fail"
            android.ext.e1.l(r8, r7)
            java.lang.String r7 = r7.toString()
            return r7
    }

    private void q1() {
            r3 = this;
            android.content.pm.PackageManager r0 = android.ext.Tools.B0()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = r3.f598g     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            r0.setInstallerPackageName(r1, r2)     // Catch: java.lang.Throwable -> Lb
            goto Lf
        Lb:
            r0 = move-exception
            android.ext.e1.a(r0)
        Lf:
            return
    }

    private static void r(java.lang.StringBuilder r2, java.util.zip.ZipEntry r3) {
            if (r3 != 0) goto L3
            return
        L3:
            r0 = 45
            r2.append(r0)
            long r0 = r3.getSize()
            r2.append(r0)
            r3 = 32
            r2.append(r3)
            return
    }

    private static void r0() {
            java.lang.ref.WeakReference r0 = android.ext.b1.E
            java.lang.Object r0 = r0.get()
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto L12
            android.ext.b1$c r1 = new android.ext.b1$c
            r1.<init>()
            r0.setOnClickListener(r1)
        L12:
            java.lang.ref.WeakReference r0 = android.ext.b1.G
            java.lang.Object r0 = r0.get()
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            if (r0 == 0) goto L20
            r1 = 0
            r0.setIndeterminate(r1)
        L20:
            java.lang.Runnable r0 = android.ext.b1.F
            r0.run()
            return
    }

    private static void r1(java.lang.String r1) {
            android.ext.b1$l r0 = new android.ext.b1$l
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    private static byte[] s(byte[] r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            android.ext.b1$t r1 = new android.ext.b1$t
            r1.<init>(r6)
            r6 = 48
            int[] r2 = r1.c(r6)
            if (r2 == 0) goto Lbb
            boolean r3 = r1.a()
            if (r3 != 0) goto L19
            goto Lbb
        L19:
            android.ext.b1$t r1 = r1.b(r2)
            r2 = 6
            int[] r2 = r1.c(r2)
            if (r2 != 0) goto L25
            return r0
        L25:
            r2 = 160(0xa0, float:2.24E-43)
            int[] r3 = r1.c(r2)
            if (r3 == 0) goto Lbb
            boolean r4 = r1.a()
            if (r4 != 0) goto L35
            goto Lbb
        L35:
            android.ext.b1$t r1 = r1.b(r3)
            int[] r3 = r1.c(r6)
            if (r3 == 0) goto Lbb
            boolean r4 = r1.a()
            if (r4 != 0) goto L47
            goto Lbb
        L47:
            android.ext.b1$t r1 = r1.b(r3)
            r3 = 2
            int[] r4 = r1.c(r3)
            if (r4 != 0) goto L53
            return r0
        L53:
            r4 = 49
            int[] r5 = r1.c(r4)
            if (r5 != 0) goto L5c
            return r0
        L5c:
            int[] r5 = r1.c(r6)
            if (r5 != 0) goto L63
            return r0
        L63:
            int[] r2 = r1.c(r2)
            if (r2 != 0) goto L6a
            return r0
        L6a:
            int[] r2 = r1.c(r4)
            if (r2 == 0) goto Lbb
            boolean r4 = r1.a()
            if (r4 != 0) goto L77
            goto Lbb
        L77:
            android.ext.b1$t r1 = r1.b(r2)
            int[] r2 = r1.c(r6)
            if (r2 == 0) goto Lbb
            boolean r4 = r1.a()
            if (r4 != 0) goto L88
            goto Lbb
        L88:
            android.ext.b1$t r1 = r1.b(r2)
            int[] r2 = r1.c(r3)
            if (r2 != 0) goto L93
            return r0
        L93:
            int[] r2 = r1.c(r6)
            if (r2 != 0) goto L9a
            return r0
        L9a:
            int[] r2 = r1.c(r6)
            if (r2 != 0) goto La1
            return r0
        La1:
            int[] r6 = r1.c(r6)
            if (r6 != 0) goto La8
            return r0
        La8:
            r6 = 4
            int[] r6 = r1.c(r6)
            if (r6 == 0) goto Lbb
            boolean r2 = r1.a()
            if (r2 != 0) goto Lb6
            goto Lbb
        Lb6:
            byte[] r6 = r1.d(r6)
            return r6
        Lbb:
            return r0
    }

    private java.lang.String s0() {
            r16 = this;
            r1 = r16
            java.lang.String r2 = "root stage cleanup: "
            r16.I1()
            java.io.File r0 = r1.f594c
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r3 = "/emulated/0"
            boolean r4 = r0.contains(r3)
            if (r4 == 0) goto L21
            java.lang.String r4 = "/emulated/legacy"
            java.lang.String r3 = r0.replace(r3, r4)
            java.lang.String[] r0 = new java.lang.String[]{r3, r0}
        L1f:
            r3 = r0
            goto L26
        L21:
            java.lang.String[] r0 = new java.lang.String[]{r0}
            goto L1f
        L26:
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L29:
            if (r6 >= r4) goto L6b
            r7 = r3[r6]
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L38
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L38
            r8 = 493(0x1ed, float:6.91E-43)
            android.ext.Tools.q(r0, r8)     // Catch: java.lang.Throwable -> L38
            goto L4d
        L38:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Failed allow execute 1: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            android.ext.e1.s(r8, r0)
        L4d:
            java.lang.String r0 = "0755"
            android.ext.Tools.r(r7, r0)     // Catch: java.lang.Throwable -> L53
            goto L68
        L53:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Failed allow execute 2: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.ext.e1.s(r7, r0)
        L68:
            int r6 = r6 + 1
            goto L29
        L6b:
            android.ext.b1$c0 r0 = android.ext.b1.C
            int r0 = r0.l
            boolean r4 = Q0(r0)
            int r6 = r3.length
            java.lang.String r0 = "Install:"
            r8 = r0
            r0 = 1
            r9 = 0
        L79:
            java.lang.String r10 = "package-installed"
            r11 = 10
            if (r9 >= r6) goto L179
            r12 = r3[r9]
            if (r4 != 0) goto L85
            goto L179
        L85:
            if (r0 == 0) goto L8e
            java.lang.String r0 = "root-install-start"
            R1(r0)
            r13 = 0
            goto L8f
        L8e:
            r13 = r0
        L8f:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb5
            r14 = 24
            r15 = 45
            if (r0 >= r14) goto Lb8
            r16.I1()     // Catch: java.lang.Throwable -> Lb5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5
            r0.append(r8)     // Catch: java.lang.Throwable -> Lb5
            r0.append(r11)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r12 = k1(r12)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r12 = android.ext.e2.n(r12, r15)     // Catch: java.lang.Throwable -> Lb5
            r0.append(r12)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb5
            goto L120
        Lb5:
            r0 = move-exception
            goto L147
        Lb8:
            java.lang.String r14 = C0()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = n1(r14)     // Catch: java.lang.Throwable -> L122
            java.lang.String r0 = android.ext.e2.n(r0, r15)     // Catch: java.lang.Throwable -> L122
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L122
            r7.<init>()     // Catch: java.lang.Throwable -> L122
            r7.append(r8)     // Catch: java.lang.Throwable -> L122
            r7.append(r11)     // Catch: java.lang.Throwable -> L122
            r7.append(r0)     // Catch: java.lang.Throwable -> L122
            java.lang.String r8 = r7.toString()     // Catch: java.lang.Throwable -> L122
            boolean r7 = j1(r0)     // Catch: java.lang.Throwable -> L122
            if (r7 == 0) goto Lfd
            r16.I1()     // Catch: java.lang.Throwable -> Lfb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfb
            r0.<init>()     // Catch: java.lang.Throwable -> Lfb
            r0.append(r8)     // Catch: java.lang.Throwable -> Lfb
            r0.append(r11)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r12 = l1(r12, r14)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r12 = android.ext.e2.n(r12, r15)     // Catch: java.lang.Throwable -> Lfb
            r0.append(r12)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lfb
            r8 = r0
            goto Lfd
        Lfb:
            r0 = move-exception
            goto L124
        Lfd:
            if (r7 == 0) goto L11f
            java.lang.String r0 = m1(r14)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = android.ext.e2.n(r0, r15)     // Catch: java.lang.Throwable -> Lb5
            boolean r7 = j1(r0)     // Catch: java.lang.Throwable -> Lb5
            if (r7 != 0) goto L11f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r7.<init>()     // Catch: java.lang.Throwable -> Lb5
            r7.append(r2)     // Catch: java.lang.Throwable -> Lb5
            r7.append(r0)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> Lb5
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> Lb5
        L11f:
            r0 = r8
        L120:
            r8 = r0
            goto L163
        L122:
            r0 = move-exception
            r7 = 0
        L124:
            if (r7 == 0) goto L146
            java.lang.String r7 = m1(r14)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = android.ext.e2.n(r7, r15)     // Catch: java.lang.Throwable -> Lb5
            boolean r12 = j1(r7)     // Catch: java.lang.Throwable -> Lb5
            if (r12 != 0) goto L146
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r12.<init>()     // Catch: java.lang.Throwable -> Lb5
            r12.append(r2)     // Catch: java.lang.Throwable -> Lb5
            r12.append(r7)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = r12.toString()     // Catch: java.lang.Throwable -> Lb5
            android.ext.e1.p(r7)     // Catch: java.lang.Throwable -> Lb5
        L146:
            throw r0     // Catch: java.lang.Throwable -> Lb5
        L147:
            java.lang.String r7 = "run cmd fail"
            android.ext.e1.l(r7, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            r7.append(r11)
            java.lang.String r0 = r0.getMessage()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            goto L120
        L163:
            java.lang.String r0 = "root-install-return"
            R1(r0)
            java.lang.String r0 = r1.f598g
            boolean r0 = android.ext.Tools.e1(r0)
            if (r0 == 0) goto L174
            R1(r10)
            goto L179
        L174:
            int r9 = r9 + 1
            r0 = r13
            goto L79
        L179:
            java.lang.String r0 = r1.f598g
            boolean r0 = android.ext.Tools.e1(r0)
            if (r0 != 0) goto L28c
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 < r2) goto L238
            android.ext.b1$c0 r0 = android.ext.b1.C
            r0.h = r5
            r2 = 4
            Q1(r2)
            boolean r0 = u0()
            android.ext.b1$c0 r3 = android.ext.b1.C
            boolean r3 = r3.i
            if (r3 != 0) goto L1a3
            android.ext.b1$c0 r3 = android.ext.b1.C
            int r3 = r3.l
            r4 = 2
            if (r3 != r4) goto L1a1
            goto L1a3
        L1a1:
            r3 = 0
            goto L1a4
        L1a3:
            r3 = 1
        L1a4:
            android.ext.b1$r r0 = h(r3, r0)
            android.ext.b1$c0 r3 = android.ext.b1.C
            r3.i = r5
            android.ext.b1$r r3 = android.ext.b1.r.f634b
            java.lang.String r4 = "unknown-source install permission was not granted"
            java.lang.String r6 = "unknown-source-settings-failed"
            if (r0 != r3) goto L22a
            java.lang.String r0 = "unknown-source-settings-start"
            R1(r0)
            android.ext.b1$c0 r0 = android.ext.b1.C
            r3 = 1
            r0.i = r3
            android.content.Intent r0 = new android.content.Intent
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "package:"
            r3.append(r7)
            java.lang.String r7 = android.ext.Tools.C0()
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r7 = "android.settings.MANAGE_UNKNOWN_APP_SOURCES"
            r0.<init>(r7, r3)
            r3 = 1
            android.ext.b1.c0.p = r3
            android.ext.b1.c0.q = r5
            r1.P1(r0, r2)     // Catch: java.lang.Throwable -> L202 java.lang.RuntimeException -> L204 android.content.ActivityNotFoundException -> L206
            boolean r0 = android.ext.b1.c0.q     // Catch: java.lang.Throwable -> L202 java.lang.RuntimeException -> L204 android.content.ActivityNotFoundException -> L206
            android.ext.b1$c0 r3 = android.ext.b1.C     // Catch: java.lang.Throwable -> L202 java.lang.RuntimeException -> L204 android.content.ActivityNotFoundException -> L206
            r3.i = r5     // Catch: java.lang.Throwable -> L202 java.lang.RuntimeException -> L204 android.content.ActivityNotFoundException -> L206
            android.ext.b1.c0.p = r5
            android.ext.b1.c0.q = r5
            if (r0 == 0) goto L1f9
            boolean r0 = u0()
            if (r0 == 0) goto L1f9
            goto L238
        L1f9:
            R1(r6)
            android.ext.b1$v r0 = new android.ext.b1$v
            r0.<init>(r4)
            throw r0
        L202:
            r0 = move-exception
            goto L225
        L204:
            r0 = move-exception
            goto L208
        L206:
            r0 = move-exception
            goto L213
        L208:
            Q1(r2)     // Catch: java.lang.Throwable -> L202
            android.ext.b1$c0 r2 = android.ext.b1.C     // Catch: java.lang.Throwable -> L202
            r2.i = r5     // Catch: java.lang.Throwable -> L202
            R1(r6)     // Catch: java.lang.Throwable -> L202
            throw r0     // Catch: java.lang.Throwable -> L202
        L213:
            Q1(r2)     // Catch: java.lang.Throwable -> L202
            android.ext.b1$c0 r2 = android.ext.b1.C     // Catch: java.lang.Throwable -> L202
            r2.i = r5     // Catch: java.lang.Throwable -> L202
            R1(r6)     // Catch: java.lang.Throwable -> L202
            android.ext.b1$v r2 = new android.ext.b1$v     // Catch: java.lang.Throwable -> L202
            java.lang.String r3 = "unknown-source settings are unavailable"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L202
            throw r2     // Catch: java.lang.Throwable -> L202
        L225:
            android.ext.b1.c0.p = r5
            android.ext.b1.c0.q = r5
            throw r0
        L22a:
            android.ext.b1$r r2 = android.ext.b1.r.f635c
            if (r0 == r2) goto L22f
            goto L238
        L22f:
            R1(r6)
            android.ext.b1$v r0 = new android.ext.b1$v
            r0.<init>(r4)
            throw r0
        L238:
            java.lang.String r0 = "manual-install-start"
            R1(r0)
            android.ext.b1$c0 r0 = android.ext.b1.C
            r2 = 1
            r0.h = r2
            android.content.Intent[] r3 = r16.a0()
            android.ext.b1.L = r5
            int r4 = r3.length
            r6 = 0
        L24a:
            if (r6 >= r4) goto L28c
            r0 = r3[r6]
            int r7 = android.ext.b1.L
            int r7 = r7 + r2
            android.ext.b1.L = r7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r7 = "\nManual: "
            r2.append(r7)
            r2.append(r0)
            java.lang.String r8 = r2.toString()
            r16.I1()     // Catch: java.lang.Throwable -> L271
            r2 = 1
            r1.P1(r0, r2)     // Catch: java.lang.Throwable -> L26f
            goto L28c
        L26f:
            r0 = move-exception
            goto L273
        L271:
            r0 = move-exception
            r2 = 1
        L273:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            r7.append(r11)
            java.lang.String r0 = r0.getMessage()
            r7.append(r0)
            java.lang.String r8 = r7.toString()
            int r6 = r6 + 1
            goto L24a
        L28c:
            java.lang.String r0 = r1.f598g
            boolean r0 = android.ext.Tools.e1(r0)
            if (r0 == 0) goto L29b
            R1(r10)
            android.ext.b1$c0 r0 = android.ext.b1.C
            r0.i = r5
        L29b:
            return r8
    }

    static void s1(android.ext.b1.c0 r0) {
            android.ext.b1.C = r0
            return
    }

    private void t(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.io.File r0 = r2.f595d     // Catch: android.system.ErrnoException -> L33
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: android.system.ErrnoException -> L33
            java.io.File r1 = r2.f594c     // Catch: android.system.ErrnoException -> L33
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: android.system.ErrnoException -> L33
            android.system.Os.rename(r0, r1)     // Catch: android.system.ErrnoException -> L33
            java.io.File r0 = r2.f595d
            boolean r0 = r0.exists()
            if (r0 != 0) goto L2b
            java.io.File r0 = r2.f594c
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L2b
            android.ext.b1$c0 r0 = android.ext.b1.C
            r0.n = r3
            android.ext.b1$c0 r3 = android.ext.b1.C
            r3.o = r4
            r2.V1()
            return
        L2b:
            android.ext.b1$v r3 = new android.ext.b1$v
            java.lang.String r4 = "commit rename incomplete"
            r3.<init>(r4)
            throw r3
        L33:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "commit rename failed: "
            r0.append(r1)
            java.lang.String r1 = r3.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            throw r4
    }

    static void t0() {
            java.lang.String[] r0 = android.ext.b1.x
            int r0 = r0.length
            byte[][] r0 = new byte[r0][]
            android.ext.b1.z = r0
            android.ext.b1 r0 = new android.ext.b1     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            android.ext.b1.B = r0     // Catch: java.lang.Throwable -> L1a
            r0.a()     // Catch: java.lang.Throwable -> L1a
            android.ext.b1$n r0 = new android.ext.b1$n     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L1a
            goto L56
        L1a:
            r0 = move-exception
            java.lang.String r1 = "Failed install"
            android.ext.e1.l(r1, r0)
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L3f
            java.lang.String r2 = "ENOSPC"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L36
            java.lang.String r2 = "o space left"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L3f
        L36:
            android.ext.b1$o r0 = new android.ext.b1$o
            r0.<init>(r1)
            android.ext.n2.i(r0)
            goto L56
        L3f:
            boolean r1 = r0 instanceof android.ext.b1.v
            r2 = 0
            if (r1 != 0) goto L4b
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.ext.n0.h(r1, r0, r2)
        L4b:
            k(r2)
            android.ext.b1$p r1 = new android.ext.b1$p
            r1.<init>(r0)
            android.ext.n2.i(r1)
        L56:
            return
    }

    private static void t1(int r1) {
            android.ext.b1$c0 r0 = android.ext.b1.C
            int r0 = r0.f611b
            if (r0 == r1) goto L9
            r0 = 0
            android.ext.b1.J = r0
        L9:
            android.ext.b1$c0 r0 = android.ext.b1.C
            r0.f611b = r1
            return
    }

    private void u() {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 2
            if (r1 >= r2) goto L50
            java.io.File r2 = r6.f595d     // Catch: java.lang.Throwable -> L13
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L15
            java.io.File r2 = r6.f595d     // Catch: java.lang.Throwable -> L13
            r2.delete()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L29
        L15:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L13
            java.io.File r3 = r6.f595d     // Catch: java.lang.Throwable -> L13
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L13
            java.io.File r0 = r6.f595d     // Catch: java.lang.Throwable -> L25
            r3 = 384(0x180, float:5.38E-43)
            android.ext.Tools.q(r0, r3)     // Catch: java.lang.Throwable -> L25
            r0 = r2
            goto L50
        L25:
            r0 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
        L29:
            r3 = 1
            if (r1 == r3) goto L4f
            android.ext.e1.a(r2)
            java.io.File r2 = new java.io.File
            java.io.File r3 = r6.f593b
            java.io.File r4 = r6.f594c
            java.lang.String r4 = r4.getName()
            r2.<init>(r3, r4)
            android.ext.b1$c0 r3 = android.ext.b1.C
            java.lang.String r4 = r2.getAbsolutePath()
            r3.f612c = r4
            r6.f594c = r2
            java.io.File r2 = K0(r2)
            r6.f595d = r2
            int r1 = r1 + 1
            goto L2
        L4f:
            throw r2
        L50:
            r6.j(r0)     // Catch: java.lang.Error -> L54 java.lang.RuntimeException -> L59 java.io.IOException -> L5e
            return
        L54:
            r1 = move-exception
            r6.D(r0)
            throw r1
        L59:
            r1 = move-exception
            r6.D(r0)
            throw r1
        L5e:
            r1 = move-exception
            r6.D(r0)
            throw r1
    }

    static boolean u0() {
            r0 = 0
            java.lang.String r1 = "android.permission.REQUEST_INSTALL_PACKAGES"
            java.lang.String r1 = android.ext.a1.a(r1)     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto La
            return r0
        La:
            android.content.Context r2 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "appops"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L26
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch: java.lang.Throwable -> L26
            int r3 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L26
            int r1 = r2.checkOpNoThrow(r1, r3, r4)     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L25
            r0 = 1
        L25:
            return r0
        L26:
            r1 = move-exception
            java.lang.String r2 = "installPermissionGranted failed"
            android.ext.e1.g(r2, r1)
            return r0
    }

    private static void u1() {
            java.lang.String r0 = "yhuvlrq1jj"
            java.lang.String r0 = android.ext.Tools.removeNewLinesChars(r0)     // Catch: java.lang.Throwable -> La7
            java.io.File r0 = W(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r1.<init>()     // Catch: java.lang.Throwable -> La7
            r2 = 1
            float r2 = (float) r2     // Catch: java.lang.Throwable -> La7
            r3 = 1182829005(0x468089cd, float:16452.9)
            float r3 = r3 * r2
            r4 = 1133835059(0x4394f333, float:297.9)
            float r3 = r3 - r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch: java.lang.Throwable -> La7
            r1.append(r3)     // Catch: java.lang.Throwable -> La7
            r3 = 58
            r1.append(r3)     // Catch: java.lang.Throwable -> La7
            r3 = 1121360282(0x42d6999a, float:107.3)
            float r2 = r2 * r3
            r3 = 1086115021(0x40bccccd, float:5.9)
            float r2 = r2 - r3
            r1.append(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La7
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> La7
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto La9
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L9b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            int r3 = r1.length     // Catch: java.lang.Throwable -> L59
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L59
            int r5 = r2.read(r4)     // Catch: java.lang.Throwable -> L59
            if (r5 != r3) goto L5b
            boolean r3 = java.util.Arrays.equals(r4, r1)     // Catch: java.lang.Throwable -> L59
            if (r3 != 0) goto L97
            goto L5b
        L59:
            r3 = move-exception
            goto L9d
        L5b:
            java.lang.String r3 = "installer.fail"
            java.io.File r3 = W(r3)     // Catch: java.lang.Throwable -> L59
            r3.delete()     // Catch: java.lang.Throwable -> L59
            java.io.File r3 = android.ext.Tools.q0()     // Catch: java.lang.Throwable -> L59
            java.lang.String[] r4 = r3.list()     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L97
            int r5 = r4.length     // Catch: java.lang.Throwable -> L59
            r6 = 0
        L70:
            if (r6 >= r5) goto L97
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L59
            java.lang.String r8 = "lib"
            boolean r8 = r7.startsWith(r8)     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L84
            java.lang.String r8 = ".so"
            boolean r8 = r7.endsWith(r8)     // Catch: java.lang.Throwable -> L59
            if (r8 != 0) goto L8c
        L84:
            java.lang.String r8 = "gr"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L94
        L8c:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L59
            r8.<init>(r3, r7)     // Catch: java.lang.Throwable -> L59
            r8.delete()     // Catch: java.lang.Throwable -> L59
        L94:
            int r6 = r6 + 1
            goto L70
        L97:
            r2.close()     // Catch: java.lang.Throwable -> L9b
            goto La9
        L9b:
            r2 = move-exception
            goto La1
        L9d:
            r2.close()     // Catch: java.lang.Throwable -> L9b
            throw r3     // Catch: java.lang.Throwable -> L9b
        La1:
            java.lang.String r3 = "Fail get version"
            android.ext.e1.l(r3, r2)     // Catch: java.lang.Throwable -> La7
            goto La9
        La7:
            r0 = move-exception
            goto Lbf
        La9:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La7
            r3 = 384(0x180, float:5.38E-43)
            android.ext.Tools.q(r0, r3)     // Catch: java.lang.Throwable -> La7
            r2.write(r1)     // Catch: java.lang.Throwable -> Lba
            r2.close()     // Catch: java.lang.Throwable -> La7
            goto Lc4
        Lba:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> La7
            throw r0     // Catch: java.lang.Throwable -> La7
        Lbf:
            java.lang.String r1 = "Fail set version"
            android.ext.e1.l(r1, r0)
        Lc4:
            return
    }

    private void v() {
            r4 = this;
            r0 = 0
        L1:
            android.ext.b1$w[] r1 = r4.k
            int r1 = r1.length
            if (r0 >= r1) goto L33
            java.io.File r1 = r4.V(r0)
            r1.delete()
            java.io.RandomAccessFile[] r1 = r4.f592a
            r1 = r1[r0]
            if (r1 != 0) goto L14
            goto L30
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Close: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2c
            r2.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2c
            android.ext.e1.d(r2)     // Catch: java.lang.Throwable -> L2c
            r1.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r1 = move-exception
            android.ext.e1.a(r1)
        L30:
            int r0 = r0 + 1
            goto L1
        L33:
            r0 = 0
            r4.p = r0
            r4.q = r0
            return
    }

    private static byte[] v0(byte[] r3, int r4, int r5) {
            if (r3 != 0) goto L6
            int r3 = r4 + 4
            byte[] r3 = new byte[r3]
        L6:
            r0 = 0
        L7:
            r1 = 4
            if (r0 >= r1) goto L18
            int r1 = r4 + r0
            int r2 = r0 * 8
            int r2 = r5 >> r2
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r1] = r2
            int r0 = r0 + 1
            goto L7
        L18:
            return r3
    }

    private static java.lang.String v1(java.io.File r4) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r4)
            r4 = 65536(0x10000, float:9.1835E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1b
        Lf:
            int r2 = r1.read(r4)     // Catch: java.lang.Throwable -> L1b
            r3 = -1
            if (r2 == r3) goto L1d
            r3 = 0
            r0.update(r4, r3, r2)     // Catch: java.lang.Throwable -> L1b
            goto Lf
        L1b:
            r4 = move-exception
            goto L29
        L1d:
            r1.close()
            byte[] r4 = r0.digest()
            java.lang.String r4 = android.ext.m0.i(r4)
            return r4
        L29:
            r1.close()
            throw r4
    }

    private static int w(byte[] r6) {
            r0 = -1
            if (r6 == 0) goto L3b
            int r1 = r6.length
            r2 = 2
            if (r1 >= r2) goto L8
            goto L3b
        L8:
            r1 = 0
            r3 = r6[r1]
            r4 = 48
            if (r3 == r4) goto L10
            return r0
        L10:
            r3 = 1
            r3 = r6[r3]
            r4 = r3 & 255(0xff, float:3.57E-43)
            r5 = r3 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L39
            r3 = r3 & 127(0x7f, float:1.78E-43)
            if (r3 == 0) goto L38
            r4 = 4
            if (r3 > r4) goto L38
            int r4 = r2 + r3
            int r5 = r6.length
            if (r4 <= r5) goto L26
            goto L38
        L26:
            r0 = 0
        L27:
            if (r1 >= r3) goto L36
            int r0 = r0 << 8
            int r4 = r2 + 1
            r2 = r6[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            int r1 = r1 + 1
            r2 = r4
            goto L27
        L36:
            r4 = r0
            goto L39
        L38:
            return r0
        L39:
            int r2 = r2 + r4
            return r2
        L3b:
            return r0
    }

    private java.lang.String w0(java.io.File r7) {
            r6 = this;
            java.lang.String r0 = "path: "
            if (r7 != 0) goto L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = " - null"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            android.ext.e1.d(r7)
            java.lang.String r7 = "is null"
            return r7
        L1e:
            r7.mkdirs()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "installer.dir.probe"
            r1.<init>(r7, r2)
            r1.delete()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = "We need test read/write to this file"
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            int r3 = r2.length     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r5 = 384(0x180, float:5.38E-43)
            android.ext.Tools.q(r1, r5)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.write(r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.close()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            int r5 = r4.read(r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.close()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            int r4 = r2.length     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            if (r5 == r4) goto L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r3.<init>()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r4 = "Length mismatch: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r3.append(r5)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r4 = " != "
            r3.append(r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            int r2 = r2.length     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r3.append(r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r1.delete()
            return r7
        L71:
            r7 = move-exception
            goto Le9
        L73:
            r2 = move-exception
            goto Lc3
        L75:
            boolean r4 = java.util.Arrays.equals(r3, r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            if (r4 != 0) goto La7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r5 = "Data mismatch: '"
            r4.append(r5)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.append(r5)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r3 = "' != '"
            r4.append(r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r4.append(r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r2 = 39
            r4.append(r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r1.delete()
            return r7
        La7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r2.append(r0)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r2.append(r7)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r3 = " - success"
            r2.append(r3)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            android.ext.e1.d(r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            r1.delete()
            r7 = 0
            return r7
        Lc3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r3.<init>()     // Catch: java.lang.Throwable -> L71
            r3.append(r0)     // Catch: java.lang.Throwable -> L71
            r3.append(r7)     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = " - fail: "
            r3.append(r7)     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = r2.getMessage()     // Catch: java.lang.Throwable -> L71
            r3.append(r7)     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L71
            android.ext.e1.d(r7)     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = r2.getMessage()     // Catch: java.lang.Throwable -> L71
            r1.delete()
            return r7
        Le9:
            r1.delete()
            throw r7
    }

    private java.lang.String w1(java.lang.String r4) {
            r3 = this;
            java.util.Map r0 = r3.p1()
            java.lang.Object r0 = r0.get(r4)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L21
            java.security.MessageDigest r4 = r3.n
            r4.reset()
            java.security.MessageDigest r4 = r3.n
            r4.update(r0)
            java.security.MessageDigest r4 = r3.n
            byte[] r4 = r4.digest()
            java.lang.String r4 = android.ext.m0.h(r4)
            return r4
        L21:
            android.ext.b1$v r0 = new android.ext.b1$v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "missing secondary dex bytes: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private static android.ext.b1.u x(byte[] r11, int r12, int r13, int r14) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fixDex: string "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = " is malformed"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r0 = 0
            r1 = 0
            r2 = 0
        L19:
            int r3 = r13 - r12
            if (r1 >= r3) goto L19e
            int r4 = r12 + r1
            r4 = r11[r4]
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r1 * 7
            int r5 = r5 << r6
            r2 = r2 | r5
            int r1 = r1 + 1
            r5 = 128(0x80, float:1.8E-43)
            r4 = r4 & r5
            if (r4 != 0) goto L182
            if (r2 < 0) goto L16b
            int r4 = r2 + 1
            int r3 = r3 - r1
            if (r4 > r3) goto L16b
            int r1 = r1 + r12
            char[] r3 = new char[r2]
        L38:
            if (r0 >= r2) goto L140
            if (r1 >= r13) goto L129
            r4 = r11[r1]
            r6 = r4 & 255(0xff, float:3.57E-43)
            if (r6 == 0) goto L10f
            if (r6 >= r5) goto L4b
            char r4 = (char) r6
            r3[r0] = r4
            int r1 = r1 + 1
            goto Lca
        L4b:
            r6 = r4 & 224(0xe0, float:3.14E-43)
            java.lang.String r7 = ": bad MUTF-8"
            java.lang.String r8 = ": overlong MUTF-8"
            r9 = 192(0xc0, float:2.69E-43)
            if (r6 != r9) goto L9c
            int r6 = r1 + 2
            if (r6 > r13) goto L87
            int r1 = r1 + 1
            r1 = r11[r1]
            r9 = r1 & 192(0xc0, float:2.69E-43)
            if (r9 != r5) goto L87
            r4 = r4 & 31
            int r4 = r4 << 6
            r1 = r1 & 63
            r1 = r1 | r4
            if (r1 == 0) goto L82
            if (r1 < r5) goto L6d
            goto L82
        L6d:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L82:
            char r1 = (char) r1
            r3[r0] = r1
        L85:
            r1 = r6
            goto Lca
        L87:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L9c:
            r6 = r4 & 240(0xf0, float:3.36E-43)
            r9 = 224(0xe0, float:3.14E-43)
            if (r6 != r9) goto Lf8
            int r6 = r1 + 3
            if (r6 > r13) goto Le3
            int r9 = r1 + 1
            r9 = r11[r9]
            r10 = r9 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto Le3
            int r1 = r1 + 2
            r1 = r11[r1]
            r10 = r1 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto Le3
            r4 = r4 & 15
            int r4 = r4 << 12
            r7 = r9 & 63
            int r7 = r7 << 6
            r4 = r4 | r7
            r1 = r1 & 63
            r1 = r1 | r4
            r4 = 2048(0x800, float:2.87E-42)
            if (r1 < r4) goto Lce
            char r1 = (char) r1
            r3[r0] = r1
            goto L85
        Lca:
            int r0 = r0 + 1
            goto L38
        Lce:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Le3:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lf8:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            java.lang.String r13 = ": invalid MUTF-8"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L10f:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            java.lang.String r13 = ": string shorter than indicated size "
            r12.append(r13)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L129:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            java.lang.String r13 = ": truncated MUTF-8 payload"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L140:
            if (r1 >= r13) goto L154
            r11 = r11[r1]
            if (r11 != 0) goto L154
            android.ext.b1$u r11 = new android.ext.b1$u
            java.lang.String r13 = new java.lang.String
            r13.<init>(r3)
            int r1 = r1 - r12
            int r1 = r1 + 1
            r11.<init>(r13, r2, r1)
            return r11
        L154:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            java.lang.String r13 = ": missing NUL terminator"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L16b:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            java.lang.String r13 = ": payload overruns its bound"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L182:
            r3 = 4
            if (r1 > r3) goto L187
            goto L19
        L187:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            java.lang.String r13 = ": invalid ULEB128 length"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L19e:
            android.ext.b1$v r11 = new android.ext.b1$v
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            java.lang.String r13 = ": truncated ULEB128 length"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    private static boolean x0(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L2e
            int r1 = r4.length()
            r2 = 64
            if (r1 == r2) goto Lc
            goto L2e
        Lc:
            r1 = 0
        Ld:
            int r2 = r4.length()
            if (r1 >= r2) goto L2c
            char r2 = r4.charAt(r1)
            r3 = 48
            if (r2 < r3) goto L1f
            r3 = 57
            if (r2 <= r3) goto L28
        L1f:
            r3 = 97
            if (r2 < r3) goto L2b
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L28
            goto L2b
        L28:
            int r1 = r1 + 1
            goto Ld
        L2b:
            return r0
        L2c:
            r4 = 1
            return r4
        L2e:
            return r0
    }

    private static java.lang.String x1(byte[] r7) {
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "UTF-8"
            r0.<init>(r7, r1)
            java.lang.String r7 = "\r\n|\n"
            r1 = -1
            java.lang.String[] r7 = r0.split(r7, r1)
            r0 = 0
            r1 = 0
        L10:
            int r2 = r7.length
            r3 = 0
            if (r1 >= r2) goto L4b
            r2 = r7[r1]
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L1d
            goto L4b
        L1d:
            r4 = 58
            int r4 = r2.indexOf(r4)
            if (r4 > 0) goto L26
            goto L36
        L26:
            java.lang.String r5 = r2.substring(r0, r4)
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = "SHA-256-Digest-Manifest"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 != 0) goto L39
        L36:
            int r1 = r1 + 1
            goto L10
        L39:
            int r4 = r4 + 1
            java.lang.String r7 = r2.substring(r4)
            java.lang.String r7 = r7.trim()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L4a
            goto L4b
        L4a:
            r3 = r7
        L4b:
            return r3
    }

    private static java.lang.String y(byte[] r7, int r8, int r9) {
            z(r7, r8, r9)
            r9 = 0
            r0 = 0
            r1 = 0
        L6:
            int r2 = r8 + 1
            r8 = r7[r8]
            r3 = r8 & 127(0x7f, float:1.78E-43)
            int r4 = r1 * 7
            int r3 = r3 << r4
            r0 = r0 | r3
            r3 = 128(0x80, float:1.8E-43)
            r8 = r8 & r3
            if (r8 != 0) goto L75
            char[] r8 = new char[r0]
        L17:
            if (r9 >= r0) goto L6f
            r1 = r7[r2]
            r4 = r1 & 255(0xff, float:3.57E-43)
            if (r4 >= r3) goto L25
            char r1 = (char) r4
            r8[r9] = r1
            int r2 = r2 + 1
            goto L66
        L25:
            r4 = r1 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            java.lang.String r6 = "hashDex: overlong MUTF-8"
            if (r4 != r5) goto L49
            r1 = r1 & 31
            int r1 = r1 << 6
            int r4 = r2 + 1
            r4 = r7[r4]
            r4 = r4 & 63
            r1 = r1 | r4
            if (r1 == 0) goto L43
            if (r1 < r3) goto L3d
            goto L43
        L3d:
            android.ext.b1$v r7 = new android.ext.b1$v
            r7.<init>(r6)
            throw r7
        L43:
            char r1 = (char) r1
            r8[r9] = r1
            int r2 = r2 + 2
            goto L66
        L49:
            r1 = r1 & 15
            int r1 = r1 << 12
            int r4 = r2 + 1
            r4 = r7[r4]
            r4 = r4 & 63
            int r4 = r4 << 6
            r1 = r1 | r4
            int r4 = r2 + 2
            r4 = r7[r4]
            r4 = r4 & 63
            r1 = r1 | r4
            r4 = 2048(0x800, float:2.87E-42)
            if (r1 < r4) goto L69
            char r1 = (char) r1
            r8[r9] = r1
            int r2 = r2 + 3
        L66:
            int r9 = r9 + 1
            goto L17
        L69:
            android.ext.b1$v r7 = new android.ext.b1$v
            r7.<init>(r6)
            throw r7
        L6f:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r8)
            return r7
        L75:
            int r1 = r1 + 1
            r8 = r2
            goto L6
    }

    private static boolean y0(java.lang.String r1) {
            java.util.regex.Pattern r0 = android.ext.b1.w
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    private static java.lang.String y1() {
            r0 = 0
            android.content.pm.PackageManager r1 = android.ext.Tools.B0()     // Catch: java.lang.Throwable -> L26
            java.io.File r2 = i0()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L26
            r3 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageArchiveInfo(r2, r3)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L28
            android.content.pm.Signature[] r1 = r1.signatures     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L28
            int r2 = r1.length     // Catch: java.lang.Throwable -> L26
            r3 = 1
            if (r2 == r3) goto L1e
            goto L28
        L1e:
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = l(r1)     // Catch: java.lang.Throwable -> L26
            return r0
        L26:
            r1 = move-exception
            goto L29
        L28:
            return r0
        L29:
            android.ext.e1.a(r1)
            return r0
    }

    private static int z(byte[] r10, int r11, int r12) {
            r0 = 0
            r2 = 0
            r3 = 0
        L4:
            r4 = 5
            java.lang.String r5 = "hashDex: invalid ULEB128 length"
            r6 = 1
            if (r3 >= r4) goto L38
            if (r11 >= r12) goto L30
            int r4 = r11 + 1
            r11 = r10[r11]
            r7 = 4
            if (r3 != r7) goto L1e
            r7 = r11 & 240(0xf0, float:3.36E-43)
            if (r7 != 0) goto L18
            goto L1e
        L18:
            android.ext.b1$v r10 = new android.ext.b1$v
            r10.<init>(r5)
            throw r10
        L1e:
            r7 = r11 & 127(0x7f, float:1.78E-43)
            long r7 = (long) r7
            int r9 = r3 * 7
            long r7 = r7 << r9
            long r0 = r0 | r7
            r11 = r11 & 128(0x80, float:1.8E-43)
            if (r11 != 0) goto L2c
            r11 = r4
            r3 = 1
            goto L39
        L2c:
            int r3 = r3 + 1
            r11 = r4
            goto L4
        L30:
            android.ext.b1$v r10 = new android.ext.b1$v
            java.lang.String r11 = "hashDex: truncated ULEB128 length"
            r10.<init>(r11)
            throw r10
        L38:
            r3 = 0
        L39:
            if (r3 == 0) goto Lca
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto Lc2
            r3 = 1
            long r3 = r3 + r0
            int r5 = r12 - r11
            long r7 = (long) r5
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto Lc2
        L4c:
            int r3 = (int) r0
            if (r2 >= r3) goto Lb2
            if (r11 >= r12) goto Laa
            int r3 = r11 + 1
            r4 = r10[r11]
            r5 = r4 & 255(0xff, float:3.57E-43)
            if (r5 == 0) goto La2
            r7 = 128(0x80, float:1.8E-43)
            if (r5 >= r7) goto L61
            int r2 = r2 + 1
            r11 = r3
            goto L4c
        L61:
            r5 = r4 & 224(0xe0, float:3.14E-43)
            java.lang.String r8 = "hashDex: bad MUTF-8"
            r9 = 192(0xc0, float:2.69E-43)
            if (r5 != r9) goto L7b
            if (r3 >= r12) goto L75
            r3 = r10[r3]
            r3 = r3 & r9
            if (r3 != r7) goto L75
            int r2 = r2 + 1
            int r11 = r11 + 2
            goto L4c
        L75:
            android.ext.b1$v r10 = new android.ext.b1$v
            r10.<init>(r8)
            throw r10
        L7b:
            r4 = r4 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r4 != r5) goto L9a
            int r4 = r11 + 2
            if (r4 >= r12) goto L94
            r3 = r10[r3]
            r3 = r3 & r9
            if (r3 != r7) goto L94
            r3 = r10[r4]
            r3 = r3 & r9
            if (r3 != r7) goto L94
            int r2 = r2 + 1
            int r11 = r11 + 3
            goto L4c
        L94:
            android.ext.b1$v r10 = new android.ext.b1$v
            r10.<init>(r8)
            throw r10
        L9a:
            android.ext.b1$v r10 = new android.ext.b1$v
            java.lang.String r11 = "hashDex: invalid MUTF-8"
            r10.<init>(r11)
            throw r10
        La2:
            android.ext.b1$v r10 = new android.ext.b1$v
            java.lang.String r11 = "hashDex: string shorter than indicated size"
            r10.<init>(r11)
            throw r10
        Laa:
            android.ext.b1$v r10 = new android.ext.b1$v
            java.lang.String r11 = "hashDex: truncated MUTF-8 payload"
            r10.<init>(r11)
            throw r10
        Lb2:
            if (r11 >= r12) goto Lba
            r10 = r10[r11]
            if (r10 != 0) goto Lba
            int r11 = r11 + r6
            return r11
        Lba:
            android.ext.b1$v r10 = new android.ext.b1$v
            java.lang.String r11 = "hashDex: missing NUL terminator"
            r10.<init>(r11)
            throw r10
        Lc2:
            android.ext.b1$v r10 = new android.ext.b1$v
            java.lang.String r11 = "hashDex: string length out of range"
            r10.<init>(r11)
            throw r10
        Lca:
            android.ext.b1$v r10 = new android.ext.b1$v
            r10.<init>(r5)
            throw r10
    }

    private static boolean z0(java.lang.String r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = ".dex"
            boolean r1 = r8.endsWith(r1)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            java.lang.String r1 = "classes"
            r2 = 7
            boolean r1 = r8.regionMatches(r0, r1, r0, r2)
            if (r1 != 0) goto L17
            return r0
        L17:
            int r1 = r8.length()
            int r1 = r1 + (-4)
            if (r1 > r2) goto L20
            return r0
        L20:
            r3 = 0
        L22:
            if (r2 >= r1) goto L45
            char r5 = r8.charAt(r2)
            r6 = 48
            if (r5 < r6) goto L44
            r6 = 57
            if (r5 <= r6) goto L31
            goto L44
        L31:
            r6 = 10
            long r3 = r3 * r6
            int r5 = r5 + (-48)
            long r5 = (long) r5
            long r3 = r3 + r5
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L41
            goto L45
        L41:
            int r2 = r2 + 1
            goto L22
        L44:
            return r0
        L45:
            r1 = 2
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 < 0) goto L4c
            r0 = 1
        L4c:
            return r0
    }

    public static void z1() {
            r0()
            android.ext.n0$i r0 = new android.ext.n0$i
            android.ext.b1$j r1 = new android.ext.b1$j
            r1.<init>()
            java.lang.String r2 = "Installer"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    void E() {
            r2 = this;
            android.app.AlertDialog r0 = r2.r
            if (r0 == 0) goto L13
            android.app.AlertDialog r0 = r2.r     // Catch: java.lang.Throwable -> Ld
            android.ext.Tools.D(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r2.r = r0     // Catch: java.lang.Throwable -> Ld
            goto L13
        Ld:
            r0 = move-exception
            java.lang.String r1 = "Exception on dismiss"
            android.ext.e1.s(r1, r0)
        L13:
            return
    }

    java.io.RandomAccessFile h0(int r5) {
            r4 = this;
            java.io.RandomAccessFile[] r0 = r4.f592a
            r0 = r0[r5]
            r1 = 32
            if (r0 != 0) goto L35
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.io.File r2 = r4.V(r5)
            java.lang.String r3 = "rw"
            r0.<init>(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "RAF new: "
            r2.append(r3)
            r2.append(r5)
            r2.append(r1)
            java.io.FileDescriptor r3 = r0.getFD()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.ext.e1.d(r2)
            java.io.RandomAccessFile[] r2 = r4.f592a
            r2[r5] = r0
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "RAF get: "
            r2.append(r3)
            r2.append(r5)
            r2.append(r1)
            java.io.FileDescriptor r5 = r0.getFD()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.ext.e1.d(r5)
            return r0
    }
}
