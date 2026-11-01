package android.lang;

import android.ext.e1;
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
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class UNIXProcess extends Process {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Executor f1474f = (Executor) e(new UNIXProcess$a());

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

    static {
        initIDs();
    }

    UNIXProcess(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4, int[] iArr, boolean z) throws IOException {
        this.pid = forkAndExec(bArr, bArr2, i, bArr3, i2, bArr4, iArr, z);
        try {
            f(new UNIXProcess$b(this, iArr));
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

    private static FileInputStream g(int i) {
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

    private static FileOutputStream h(int i) {
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

    private native int waitForProcessExit(int i);

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
        try {
            if (!this.f1476b) {
                throw new IllegalThreadStateException("process hasn't exited");
            }
        } catch (Throwable th) {
            throw th;
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
        this.f1477c = iArr[0] == -1 ? UNIXProcess$e.f1484a : new UNIXProcess$g(iArr[0]);
        this.f1478d = iArr[1] == -1 ? UNIXProcess$d.f1483a : new UNIXProcess$f(iArr[1]);
        this.f1479e = iArr[2] == -1 ? UNIXProcess$d.f1483a : new UNIXProcess$f(iArr[2]);
        f1474f.execute(new UNIXProcess$c(this));
    }

    void k(int i) {
        synchronized (this) {
            try {
                this.f1475a = i;
                this.f1476b = true;
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        InputStream inputStream = this.f1478d;
        if (inputStream instanceof UNIXProcess$f) {
            ((UNIXProcess$f) inputStream).b();
        }
        InputStream inputStream2 = this.f1479e;
        if (inputStream2 instanceof UNIXProcess$f) {
            ((UNIXProcess$f) inputStream2).b();
        }
        OutputStream outputStream = this.f1477c;
        if (outputStream instanceof UNIXProcess$g) {
            ((UNIXProcess$g) outputStream).a();
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
