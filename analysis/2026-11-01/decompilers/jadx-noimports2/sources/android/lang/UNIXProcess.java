package android.lang;

/* JADX INFO: loaded from: classes.dex */
final class UNIXProcess extends java.lang.Process {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.concurrent.Executor f1474f = (java.util.concurrent.Executor) e(new android.lang.UNIXProcess.a());

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
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.concurrent.Executor run() {
            return java.util.concurrent.Executors.newCachedThreadPool(new android.lang.UNIXProcess.h(null));
        }
    }

    class b implements java.security.PrivilegedExceptionAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f1480a;

        b(int[] iArr) {
            this.f1480a = iArr;
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Void run() {
            android.lang.UNIXProcess.this.i(this.f1480a);
            return null;
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.lang.UNIXProcess uNIXProcess = android.lang.UNIXProcess.this;
            android.lang.UNIXProcess.this.k(uNIXProcess.waitForProcessExit(uNIXProcess.pid));
        }
    }

    static class d extends java.io.InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final android.lang.UNIXProcess.d f1483a = new android.lang.UNIXProcess.d();

        private d() {
        }

        @Override // java.io.InputStream
        public int available() {
            return 0;
        }

        @Override // java.io.InputStream
        public int read() {
            return -1;
        }
    }

    static class e extends java.io.OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final android.lang.UNIXProcess.e f1484a = new android.lang.UNIXProcess.e();

        private e() {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            throw new java.io.IOException("Stream closed");
        }
    }

    static class f extends java.io.BufferedInputStream {
        f(int i) {
            super(android.lang.UNIXProcess.g(i));
        }

        private static byte[] a(java.io.InputStream inputStream) throws java.io.IOException {
            byte[] bArrCopyOf = null;
            if (inputStream == null) {
                return null;
            }
            int i = 0;
            while (true) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0) {
                    break;
                }
                bArrCopyOf = bArrCopyOf == null ? new byte[iAvailable] : java.util.Arrays.copyOf(bArrCopyOf, i + iAvailable);
                i += inputStream.read(bArrCopyOf, i, iAvailable);
            }
            return (bArrCopyOf == null || i == bArrCopyOf.length) ? bArrCopyOf : java.util.Arrays.copyOf(bArrCopyOf, i);
        }

        synchronized void b() {
            try {
                java.io.InputStream inputStream = ((java.io.BufferedInputStream) this).in;
                if (inputStream != null) {
                    byte[] bArrA = a(inputStream);
                    inputStream.close();
                    ((java.io.BufferedInputStream) this).in = bArrA == null ? android.lang.UNIXProcess.d.f1483a : new java.io.ByteArrayInputStream(bArrA);
                    if (((java.io.BufferedInputStream) this).buf == null) {
                        ((java.io.BufferedInputStream) this).in = null;
                    }
                }
            } catch (java.io.IOException unused) {
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    static class g extends java.io.BufferedOutputStream {
        g(int i) {
            super(android.lang.UNIXProcess.h(i));
        }

        synchronized void a() {
            java.io.OutputStream outputStream = ((java.io.BufferedOutputStream) this).out;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.io.IOException unused) {
                }
                ((java.io.BufferedOutputStream) this).out = android.lang.UNIXProcess.e.f1484a;
            }
        }
    }

    private static class h implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.lang.ThreadGroup f1485a = a();

        class a implements java.security.PrivilegedAction {
            a() {
            }

            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.lang.ThreadGroup run() {
                java.lang.ThreadGroup threadGroup = java.lang.Thread.currentThread().getThreadGroup();
                while (true) {
                    java.lang.ThreadGroup parent = threadGroup.getParent();
                    if (parent == null || threadGroup == parent) {
                        break;
                    }
                    threadGroup = parent;
                }
                return threadGroup;
            }
        }

        private h() {
        }

        /* synthetic */ h(android.lang.UNIXProcess.a aVar) {
            this();
        }

        private static java.lang.ThreadGroup a() {
            return (java.lang.ThreadGroup) android.lang.UNIXProcess.e(new android.lang.UNIXProcess.h.a());
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(f1485a, runnable, "process reaper", 32768L);
            thread.setDaemon(true);
            thread.setPriority(10);
            return thread;
        }
    }

    static {
        initIDs();
    }

    UNIXProcess(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4, int[] iArr, boolean z) throws java.io.IOException {
        this.pid = forkAndExec(bArr, bArr2, i, bArr3, i2, bArr4, iArr, z);
        try {
            f(new android.lang.UNIXProcess.b(iArr));
        } catch (java.security.PrivilegedActionException e2) {
            throw ((java.io.IOException) e2.getException());
        }
    }

    private static native void destroyProcess(int i);

    public static java.lang.Object e(java.security.PrivilegedAction privilegedAction) {
        return java.security.AccessController.doPrivileged(privilegedAction);
    }

    public static java.lang.Object f(java.security.PrivilegedExceptionAction privilegedExceptionAction) {
        return java.security.AccessController.doPrivileged(privilegedExceptionAction);
    }

    private native int forkAndExec(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4, int[] iArr, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static java.io.FileInputStream g(int i) {
        java.lang.reflect.Field declaredField;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(j(i));
        try {
            try {
                declaredField = java.io.FileInputStream.class.getDeclaredField("isFdOwner");
            } catch (java.lang.NoSuchFieldException unused) {
                declaredField = java.io.FileInputStream.class.getDeclaredField("shouldClose");
            }
            declaredField.setAccessible(true);
            declaredField.set(fileInputStream, java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th) {
            android.ext.e1.g("Failed set isFdOwner", th);
        }
        return fileInputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.io.FileOutputStream h(int i) {
        java.lang.reflect.Field declaredField;
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(j(i));
        try {
            try {
                declaredField = java.io.FileOutputStream.class.getDeclaredField("isFdOwner");
            } catch (java.lang.NoSuchFieldException unused) {
                declaredField = java.io.FileOutputStream.class.getDeclaredField("shouldClose");
            }
            declaredField.setAccessible(true);
            declaredField.set(fileOutputStream, java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th) {
            android.ext.e1.g("Failed set isFdOwner", th);
        }
        return fileOutputStream;
    }

    private static native void initIDs();

    static java.io.FileDescriptor j(int i) {
        java.io.FileDescriptor fileDescriptor = new java.io.FileDescriptor();
        try {
            java.lang.reflect.Field declaredField = java.io.FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.set(fileDescriptor, java.lang.Integer.valueOf(i));
            return fileDescriptor;
        } catch (java.lang.Throwable th) {
            throw new java.lang.RuntimeException("Failed set fd", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int waitForProcessExit(int i);

    @Override // java.lang.Process
    public void destroy() {
        synchronized (this) {
            try {
                if (!this.f1476b) {
                    destroyProcess(this.pid);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        try {
            this.f1477c.close();
        } catch (java.io.IOException unused) {
        }
        try {
            this.f1478d.close();
        } catch (java.io.IOException unused2) {
        }
        try {
            this.f1479e.close();
        } catch (java.io.IOException unused3) {
        }
    }

    @Override // java.lang.Process
    public synchronized int exitValue() {
        if (!this.f1476b) {
            throw new java.lang.IllegalThreadStateException("process hasn't exited");
        }
        return this.f1475a;
    }

    @Override // java.lang.Process
    public java.io.InputStream getErrorStream() {
        return this.f1479e;
    }

    @Override // java.lang.Process
    public java.io.InputStream getInputStream() {
        return this.f1478d;
    }

    @Override // java.lang.Process
    public java.io.OutputStream getOutputStream() {
        return this.f1477c;
    }

    void i(int[] iArr) {
        this.f1477c = iArr[0] == -1 ? android.lang.UNIXProcess.e.f1484a : new android.lang.UNIXProcess.g(iArr[0]);
        this.f1478d = iArr[1] == -1 ? android.lang.UNIXProcess.d.f1483a : new android.lang.UNIXProcess.f(iArr[1]);
        this.f1479e = iArr[2] == -1 ? android.lang.UNIXProcess.d.f1483a : new android.lang.UNIXProcess.f(iArr[2]);
        f1474f.execute(new android.lang.UNIXProcess.c());
    }

    void k(int i) {
        synchronized (this) {
            this.f1475a = i;
            this.f1476b = true;
            notifyAll();
        }
        java.io.InputStream inputStream = this.f1478d;
        if (inputStream instanceof android.lang.UNIXProcess.f) {
            ((android.lang.UNIXProcess.f) inputStream).b();
        }
        java.io.InputStream inputStream2 = this.f1479e;
        if (inputStream2 instanceof android.lang.UNIXProcess.f) {
            ((android.lang.UNIXProcess.f) inputStream2).b();
        }
        java.io.OutputStream outputStream = this.f1477c;
        if (outputStream instanceof android.lang.UNIXProcess.g) {
            ((android.lang.UNIXProcess.g) outputStream).a();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Process[pid=");
        sb.append(this.pid);
        if (this.f1476b) {
            sb.append(", hasExited=true, exitcode=");
            sb.append(this.f1475a);
            sb.append(']');
        } else {
            sb.append(", hasExited=false]");
        }
        return sb.toString();
    }

    @Override // java.lang.Process
    public synchronized int waitFor() {
        while (!this.f1476b) {
            try {
                wait();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return this.f1475a;
    }
}
