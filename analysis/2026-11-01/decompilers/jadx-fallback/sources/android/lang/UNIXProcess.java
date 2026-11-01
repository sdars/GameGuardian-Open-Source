package android.lang;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
final class UNIXProcess extends java.lang.Process {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.concurrent.Executor f1474f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.io.OutputStream f1477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.io.InputStream f1478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.io.InputStream f1479e;
    private final int pid;

    class a implements java.security.PrivilegedAction {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.util.concurrent.Executor a() {
                r2 = this;
                android.lang.UNIXProcess$h r0 = new android.lang.UNIXProcess$h
                r1 = 0
                r0.<init>(r1)
                java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
                return r0
        }

        @Override // java.security.PrivilegedAction
        public /* bridge */ /* synthetic */ java.lang.Object run() {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.a()
                return r0
        }
    }

    class b implements java.security.PrivilegedExceptionAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f1480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.lang.UNIXProcess f1481b;

        b(android.lang.UNIXProcess r1, int[] r2) {
                r0 = this;
                r0.f1481b = r1
                r0.f1480a = r2
                r0.<init>()
                return
        }

        public java.lang.Void a() {
                r2 = this;
                android.lang.UNIXProcess r0 = r2.f1481b
                int[] r1 = r2.f1480a
                r0.i(r1)
                r0 = 0
                return r0
        }

        @Override // java.security.PrivilegedExceptionAction
        public /* bridge */ /* synthetic */ java.lang.Object run() {
                r1 = this;
                java.lang.Void r0 = r1.a()
                return r0
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.lang.UNIXProcess f1482a;

        c(android.lang.UNIXProcess r1) {
                r0 = this;
                r0.f1482a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.lang.UNIXProcess r0 = r2.f1482a
                int r1 = android.lang.UNIXProcess.a(r0)
                int r0 = android.lang.UNIXProcess.b(r0, r1)
                android.lang.UNIXProcess r1 = r2.f1482a
                r1.k(r0)
                return
        }
    }

    static class d extends java.io.InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final android.lang.UNIXProcess.d f1483a = null;

        static {
                android.lang.UNIXProcess$d r0 = new android.lang.UNIXProcess$d
                r0.<init>()
                android.lang.UNIXProcess.d.f1483a = r0
                return
        }

        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.InputStream
        public int available() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.io.InputStream
        public int read() {
                r1 = this;
                r0 = -1
                return r0
        }
    }

    static class e extends java.io.OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final android.lang.UNIXProcess.e f1484a = null;

        static {
                android.lang.UNIXProcess$e r0 = new android.lang.UNIXProcess$e
                r0.<init>()
                android.lang.UNIXProcess.e.f1484a = r0
                return
        }

        private e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.OutputStream
        public void write(int r2) {
                r1 = this;
                java.io.IOException r2 = new java.io.IOException
                java.lang.String r0 = "Stream closed"
                r2.<init>(r0)
                throw r2
        }
    }

    static class f extends java.io.BufferedInputStream {
        f(int r1) {
                r0 = this;
                java.io.FileInputStream r1 = android.lang.UNIXProcess.c(r1)
                r0.<init>(r1)
                return
        }

        private static byte[] a(java.io.InputStream r4) {
                r0 = 0
                if (r4 != 0) goto L4
                return r0
            L4:
                r1 = 0
            L5:
                int r2 = r4.available()
                if (r2 <= 0) goto L1c
                if (r0 != 0) goto L10
                byte[] r0 = new byte[r2]
                goto L16
            L10:
                int r3 = r1 + r2
                byte[] r0 = java.util.Arrays.copyOf(r0, r3)
            L16:
                int r2 = r4.read(r0, r1, r2)
                int r1 = r1 + r2
                goto L5
            L1c:
                if (r0 == 0) goto L26
                int r4 = r0.length
                if (r1 != r4) goto L22
                goto L26
            L22:
                byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            L26:
                return r0
        }

        synchronized void b() {
                r2 = this;
                monitor-enter(r2)
                java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L24
                if (r0 == 0) goto L24
                byte[] r1 = a(r0)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L24
                r0.close()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L24
                if (r1 != 0) goto L13
                android.lang.UNIXProcess$d r0 = android.lang.UNIXProcess.d.f1483a     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L24
                goto L18
            L11:
                r0 = move-exception
                goto L22
            L13:
                java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L24
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L24
            L18:
                r2.in = r0     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L24
                byte[] r0 = r2.buf     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L24
                if (r0 != 0) goto L24
                r0 = 0
                r2.in = r0     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L24
                goto L24
            L22:
                monitor-exit(r2)
                throw r0
            L24:
                monitor-exit(r2)
                return
        }
    }

    static class g extends java.io.BufferedOutputStream {
        g(int r1) {
                r0 = this;
                java.io.FileOutputStream r1 = android.lang.UNIXProcess.d(r1)
                r0.<init>(r1)
                return
        }

        synchronized void a() {
                r1 = this;
                monitor-enter(r1)
                java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> L9
                if (r0 == 0) goto Lf
                r0.close()     // Catch: java.lang.Throwable -> L9 java.io.IOException -> Lb
                goto Lb
            L9:
                r0 = move-exception
                goto L11
            Lb:
                android.lang.UNIXProcess$e r0 = android.lang.UNIXProcess.e.f1484a     // Catch: java.lang.Throwable -> L9
                r1.out = r0     // Catch: java.lang.Throwable -> L9
            Lf:
                monitor-exit(r1)
                return
            L11:
                monitor-exit(r1)
                throw r0
        }
    }

    private static class h implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.lang.ThreadGroup f1485a = null;

        class a implements java.security.PrivilegedAction {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.ThreadGroup a() {
                    r2 = this;
                    java.lang.Thread r0 = java.lang.Thread.currentThread()
                    java.lang.ThreadGroup r0 = r0.getThreadGroup()
                L8:
                    java.lang.ThreadGroup r1 = r0.getParent()
                    if (r1 == 0) goto L13
                    if (r0 != r1) goto L11
                    goto L13
                L11:
                    r0 = r1
                    goto L8
                L13:
                    return r0
            }

            @Override // java.security.PrivilegedAction
            public /* bridge */ /* synthetic */ java.lang.Object run() {
                    r1 = this;
                    java.lang.ThreadGroup r0 = r1.a()
                    return r0
            }
        }

        static {
                java.lang.ThreadGroup r0 = a()
                android.lang.UNIXProcess.h.f1485a = r0
                return
        }

        private h() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ h(android.lang.UNIXProcess.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private static java.lang.ThreadGroup a() {
                android.lang.UNIXProcess$h$a r0 = new android.lang.UNIXProcess$h$a
                r0.<init>()
                java.lang.Object r0 = android.lang.UNIXProcess.e(r0)
                java.lang.ThreadGroup r0 = (java.lang.ThreadGroup) r0
                return r0
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r8) {
                r7 = this;
                java.lang.Thread r6 = new java.lang.Thread
                java.lang.ThreadGroup r1 = android.lang.UNIXProcess.h.f1485a
                java.lang.String r3 = "process reaper"
                r4 = 32768(0x8000, double:1.61895E-319)
                r0 = r6
                r2 = r8
                r0.<init>(r1, r2, r3, r4)
                r8 = 1
                r6.setDaemon(r8)
                r8 = 10
                r6.setPriority(r8)
                return r6
        }
    }

    static {
            android.lang.UNIXProcess$a r0 = new android.lang.UNIXProcess$a
            r0.<init>()
            java.lang.Object r0 = e(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            android.lang.UNIXProcess.f1474f = r0
            initIDs()
            return
    }

    UNIXProcess(byte[] r1, byte[] r2, int r3, byte[] r4, int r5, byte[] r6, int[] r7, boolean r8) {
            r0 = this;
            r0.<init>()
            int r1 = r0.forkAndExec(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.pid = r1
            android.lang.UNIXProcess$b r1 = new android.lang.UNIXProcess$b     // Catch: java.security.PrivilegedActionException -> L12
            r1.<init>(r0, r7)     // Catch: java.security.PrivilegedActionException -> L12
            f(r1)     // Catch: java.security.PrivilegedActionException -> L12
            return
        L12:
            r1 = move-exception
            java.lang.Exception r1 = r1.getException()
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
    }

    static /* synthetic */ int a(android.lang.UNIXProcess r0) {
            int r0 = r0.pid
            return r0
    }

    static /* synthetic */ int b(android.lang.UNIXProcess r0, int r1) {
            int r0 = r0.waitForProcessExit(r1)
            return r0
    }

    static /* synthetic */ java.io.FileInputStream c(int r0) {
            java.io.FileInputStream r0 = g(r0)
            return r0
    }

    static /* synthetic */ java.io.FileOutputStream d(int r0) {
            java.io.FileOutputStream r0 = h(r0)
            return r0
    }

    private static native void destroyProcess(int r0);

    public static java.lang.Object e(java.security.PrivilegedAction r0) {
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            return r0
    }

    public static java.lang.Object f(java.security.PrivilegedExceptionAction r0) {
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            return r0
    }

    private native int forkAndExec(byte[] r1, byte[] r2, int r3, byte[] r4, int r5, byte[] r6, int[] r7, boolean r8);

    private static java.io.FileInputStream g(int r2) {
            java.lang.Class<java.io.FileInputStream> r0 = java.io.FileInputStream.class
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.FileDescriptor r2 = j(r2)
            r1.<init>(r2)
            java.lang.String r2 = "isFdOwner"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L12 java.lang.NoSuchFieldException -> L14
            goto L1a
        L12:
            r2 = move-exception
            goto L24
        L14:
            java.lang.String r2 = "shouldClose"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L12
        L1a:
            r0 = 1
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L12
            r2.set(r1, r0)     // Catch: java.lang.Throwable -> L12
            goto L29
        L24:
            java.lang.String r0 = "Failed set isFdOwner"
            android.ext.e1.g(r0, r2)
        L29:
            return r1
    }

    private static java.io.FileOutputStream h(int r2) {
            java.lang.Class<java.io.FileOutputStream> r0 = java.io.FileOutputStream.class
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            java.io.FileDescriptor r2 = j(r2)
            r1.<init>(r2)
            java.lang.String r2 = "isFdOwner"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L12 java.lang.NoSuchFieldException -> L14
            goto L1a
        L12:
            r2 = move-exception
            goto L24
        L14:
            java.lang.String r2 = "shouldClose"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L12
        L1a:
            r0 = 1
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L12
            r2.set(r1, r0)     // Catch: java.lang.Throwable -> L12
            goto L29
        L24:
            java.lang.String r0 = "Failed set isFdOwner"
            android.ext.e1.g(r0, r2)
        L29:
            return r1
    }

    private static native void initIDs();

    static java.io.FileDescriptor j(int r3) {
            java.io.FileDescriptor r0 = new java.io.FileDescriptor
            r0.<init>()
            java.lang.Class<java.io.FileDescriptor> r1 = java.io.FileDescriptor.class
            java.lang.String r2 = "descriptor"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L19
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L19
            r1.set(r0, r3)     // Catch: java.lang.Throwable -> L19
            return r0
        L19:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed set fd"
            r0.<init>(r1, r3)
            throw r0
    }

    private native int waitForProcessExit(int r1);

    @Override // java.lang.Process
    public void destroy() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f1476b     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            int r0 = r1.pid     // Catch: java.lang.Throwable -> Lb
            destroyProcess(r0)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto L1e
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            java.io.OutputStream r0 = r1.f1477c     // Catch: java.io.IOException -> L13
            r0.close()     // Catch: java.io.IOException -> L13
        L13:
            java.io.InputStream r0 = r1.f1478d     // Catch: java.io.IOException -> L18
            r0.close()     // Catch: java.io.IOException -> L18
        L18:
            java.io.InputStream r0 = r1.f1479e     // Catch: java.io.IOException -> L1d
            r0.close()     // Catch: java.io.IOException -> L1d
        L1d:
            return
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // java.lang.Process
    public synchronized int exitValue() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f1476b     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            int r0 = r2.f1475a     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            goto L13
        Lb:
            java.lang.IllegalThreadStateException r0 = new java.lang.IllegalThreadStateException     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = "process hasn't exited"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L9
        L13:
            monitor-exit(r2)
            throw r0
    }

    @Override // java.lang.Process
    public java.io.InputStream getErrorStream() {
            r1 = this;
            java.io.InputStream r0 = r1.f1479e
            return r0
    }

    @Override // java.lang.Process
    public java.io.InputStream getInputStream() {
            r1 = this;
            java.io.InputStream r0 = r1.f1478d
            return r0
    }

    @Override // java.lang.Process
    public java.io.OutputStream getOutputStream() {
            r1 = this;
            java.io.OutputStream r0 = r1.f1477c
            return r0
    }

    void i(int[] r4) {
            r3 = this;
            r0 = 0
            r1 = r4[r0]
            r2 = -1
            if (r1 != r2) goto L9
            android.lang.UNIXProcess$e r0 = android.lang.UNIXProcess.e.f1484a
            goto L11
        L9:
            android.lang.UNIXProcess$g r1 = new android.lang.UNIXProcess$g
            r0 = r4[r0]
            r1.<init>(r0)
            r0 = r1
        L11:
            r3.f1477c = r0
            r0 = 1
            r1 = r4[r0]
            if (r1 != r2) goto L1b
            android.lang.UNIXProcess$d r0 = android.lang.UNIXProcess.d.f1483a
            goto L23
        L1b:
            android.lang.UNIXProcess$f r1 = new android.lang.UNIXProcess$f
            r0 = r4[r0]
            r1.<init>(r0)
            r0 = r1
        L23:
            r3.f1478d = r0
            r0 = 2
            r1 = r4[r0]
            if (r1 != r2) goto L2d
            android.lang.UNIXProcess$d r4 = android.lang.UNIXProcess.d.f1483a
            goto L35
        L2d:
            android.lang.UNIXProcess$f r1 = new android.lang.UNIXProcess$f
            r4 = r4[r0]
            r1.<init>(r4)
            r4 = r1
        L35:
            r3.f1479e = r4
            java.util.concurrent.Executor r4 = android.lang.UNIXProcess.f1474f
            android.lang.UNIXProcess$c r0 = new android.lang.UNIXProcess$c
            r0.<init>(r3)
            r4.execute(r0)
            return
    }

    void k(int r2) {
            r1 = this;
            monitor-enter(r1)
            r1.f1475a = r2     // Catch: java.lang.Throwable -> L2c
            r2 = 1
            r1.f1476b = r2     // Catch: java.lang.Throwable -> L2c
            r1.notifyAll()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            java.io.InputStream r2 = r1.f1478d
            boolean r0 = r2 instanceof android.lang.UNIXProcess.f
            if (r0 == 0) goto L15
            android.lang.UNIXProcess$f r2 = (android.lang.UNIXProcess.f) r2
            r2.b()
        L15:
            java.io.InputStream r2 = r1.f1479e
            boolean r0 = r2 instanceof android.lang.UNIXProcess.f
            if (r0 == 0) goto L20
            android.lang.UNIXProcess$f r2 = (android.lang.UNIXProcess.f) r2
            r2.b()
        L20:
            java.io.OutputStream r2 = r1.f1477c
            boolean r0 = r2 instanceof android.lang.UNIXProcess.g
            if (r0 == 0) goto L2b
            android.lang.UNIXProcess$g r2 = (android.lang.UNIXProcess.g) r2
            r2.a()
        L2b:
            return
        L2c:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            throw r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Process[pid="
            r0.append(r1)
            int r1 = r2.pid
            r0.append(r1)
            boolean r1 = r2.f1476b
            if (r1 == 0) goto L23
            java.lang.String r1 = ", hasExited=true, exitcode="
            r0.append(r1)
            int r1 = r2.f1475a
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L28
        L23:
            java.lang.String r1 = ", hasExited=false]"
            r0.append(r1)
        L28:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Process
    public synchronized int waitFor() {
            r1 = this;
            monitor-enter(r1)
        L1:
            boolean r0 = r1.f1476b     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto Lb
            r1.wait()     // Catch: java.lang.Throwable -> L9
            goto L1
        L9:
            r0 = move-exception
            goto Lf
        Lb:
            int r0 = r1.f1475a     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        Lf:
            monitor-exit(r1)
            throw r0
    }
}
