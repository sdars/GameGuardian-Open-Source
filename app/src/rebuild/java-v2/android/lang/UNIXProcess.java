package android.lang;

import android.ext.e1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class UNIXProcess extends Process {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Executor f1474f = (Executor) e(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OutputStream f1477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InputStream f1478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f1479e;
    private final int pid;

    class a implements PrivilegedAction {
        a() {
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Executor run() {
            return Executors.newCachedThreadPool(new h(null));
        }
    }

    class b implements PrivilegedExceptionAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f1480a;

        b(int[] iArr) {
            this.f1480a = iArr;
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void run() {
            UNIXProcess.this.i(this.f1480a);
            return null;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UNIXProcess uNIXProcess = UNIXProcess.this;
            UNIXProcess.this.k(uNIXProcess.waitForProcessExit(uNIXProcess.pid));
        }
    }

    static class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f1483a = new d();

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

    static class e extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f1484a = new e();

        private e() {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            throw new IOException("Stream closed");
        }
    }

    static class f extends BufferedInputStream {
        f(int i) {
            super(UNIXProcess.g(i));
        }

        private static byte[] a(InputStream inputStream) throws IOException {
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
                bArrCopyOf = bArrCopyOf == null ? new byte[iAvailable] : Arrays.copyOf(bArrCopyOf, i + iAvailable);
                i += inputStream.read(bArrCopyOf, i, iAvailable);
            }
            return (bArrCopyOf == null || i == bArrCopyOf.length) ? bArrCopyOf : Arrays.copyOf(bArrCopyOf, i);
        }

        synchronized void b() {
            try {
                InputStream inputStream = ((BufferedInputStream) this).in;
                if (inputStream != null) {
                    byte[] bArrA = a(inputStream);
                    inputStream.close();
                    ((BufferedInputStream) this).in = bArrA == null ? d.f1483a : new ByteArrayInputStream(bArrA);
                    if (((BufferedInputStream) this).buf == null) {
                        ((BufferedInputStream) this).in = null;
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static class g extends BufferedOutputStream {
        g(int i) {
            super(UNIXProcess.h(i));
        }

        synchronized void a() {
            OutputStream outputStream = ((BufferedOutputStream) this).out;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
                ((BufferedOutputStream) this).out = e.f1484a;
            }
        }
    }

    private static class h implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final ThreadGroup f1485a = a();

        class a implements PrivilegedAction {
            a() {
            }

            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ThreadGroup run() {
                ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
                while (true) {
                    ThreadGroup parent = threadGroup.getParent();
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

        /* synthetic */ h(a aVar) {
            this();
        }

        private static ThreadGroup a() {
            return (ThreadGroup) UNIXProcess.e(new a());
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(f1485a, runnable, "process reaper", 32768L);
            thread.setDaemon(true);
            thread.setPriority(10);
            return thread;
        }
    }

    static {
        initIDs();
    }

    UNIXProcess(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4, int[] iArr, boolean z) throws IOException {
        this.pid = forkAndExec(bArr, bArr2, i, bArr3, i2, bArr4, iArr, z);
        try {
            f(new b(iArr));
        } catch (PrivilegedActionException e2) {
            throw ((IOException) e2.getException());
        }
    }

    private static native void destroyProcess(int i);

    public static Object e(PrivilegedAction privilegedAction) {
        return AccessController.doPrivileged(privilegedAction);
    }

    public static Object f(PrivilegedExceptionAction privilegedExceptionAction) {
        return AccessController.doPrivileged(privilegedExceptionAction);
    }

    private native int forkAndExec(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4, int[] iArr, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static FileInputStream g(int i) {
        Field declaredField;
        FileInputStream fileInputStream = new FileInputStream(j(i));
        try {
            try {
                declaredField = FileInputStream.class.getDeclaredField("isFdOwner");
            } catch (NoSuchFieldException unused) {
                declaredField = FileInputStream.class.getDeclaredField("shouldClose");
            }
            declaredField.setAccessible(true);
            declaredField.set(fileInputStream, Boolean.TRUE);
        } catch (Throwable th) {
            e1.g("Failed set isFdOwner", th);
        }
        return fileInputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileOutputStream h(int i) {
        Field declaredField;
        FileOutputStream fileOutputStream = new FileOutputStream(j(i));
        try {
            try {
                declaredField = FileOutputStream.class.getDeclaredField("isFdOwner");
            } catch (NoSuchFieldException unused) {
                declaredField = FileOutputStream.class.getDeclaredField("shouldClose");
            }
            declaredField.setAccessible(true);
            declaredField.set(fileOutputStream, Boolean.TRUE);
        } catch (Throwable th) {
            e1.g("Failed set isFdOwner", th);
        }
        return fileOutputStream;
    }

    private static native void initIDs();

    static FileDescriptor j(int i) {
        FileDescriptor fileDescriptor = new FileDescriptor();
        try {
            Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.set(fileDescriptor, Integer.valueOf(i));
            return fileDescriptor;
        } catch (Throwable th) {
            throw new RuntimeException("Failed set fd", th);
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
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f1477c.close();
        } catch (IOException unused) {
        }
        try {
            this.f1478d.close();
        } catch (IOException unused2) {
        }
        try {
            this.f1479e.close();
        } catch (IOException unused3) {
        }
    }

    @Override // java.lang.Process
    public synchronized int exitValue() {
        if (!this.f1476b) {
            throw new IllegalThreadStateException("process hasn't exited");
        }
        return this.f1475a;
    }

    @Override // java.lang.Process
    public InputStream getErrorStream() {
        return this.f1479e;
    }

    @Override // java.lang.Process
    public InputStream getInputStream() {
        return this.f1478d;
    }

    @Override // java.lang.Process
    public OutputStream getOutputStream() {
        return this.f1477c;
    }

    void i(int[] iArr) {
        this.f1477c = iArr[0] == -1 ? e.f1484a : new g(iArr[0]);
        this.f1478d = iArr[1] == -1 ? d.f1483a : new f(iArr[1]);
        this.f1479e = iArr[2] == -1 ? d.f1483a : new f(iArr[2]);
        f1474f.execute(new c());
    }

    void k(int i) {
        synchronized (this) {
            this.f1475a = i;
            this.f1476b = true;
            notifyAll();
        }
        InputStream inputStream = this.f1478d;
        if (inputStream instanceof f) {
            ((f) inputStream).b();
        }
        InputStream inputStream2 = this.f1479e;
        if (inputStream2 instanceof f) {
            ((f) inputStream2).b();
        }
        OutputStream outputStream = this.f1477c;
        if (outputStream instanceof g) {
            ((g) outputStream).a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f1475a;
    }
}
