/*
 * Decompiled with CFR 0.152.
 */
package android.lang;

import android.ext.e1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class UNIXProcess
extends Process {
    private static final Executor f = (Executor)UNIXProcess.e(new PrivilegedAction(){

        public Executor a() {
            return Executors.newCachedThreadPool(new h());
        }
    });
    private int a;
    private boolean b;
    private OutputStream c;
    private InputStream d;
    private InputStream e;
    private final int pid;

    static {
        UNIXProcess.initIDs();
    }

    UNIXProcess(byte[] object, byte[] byArray, int n3, byte[] byArray2, int n4, byte[] byArray3, int[] nArray, boolean bl) {
        this.pid = this.forkAndExec((byte[])object, byArray, n3, byArray2, n4, byArray3, nArray, bl);
        try {
            object = new b;
            super(this, nArray);
            UNIXProcess.f((PrivilegedExceptionAction)object);
            return;
        }
        catch (PrivilegedActionException privilegedActionException) {
            throw (IOException)privilegedActionException.getException();
        }
    }

    private static native void destroyProcess(int var0);

    public static Object e(PrivilegedAction privilegedAction) {
        return AccessController.doPrivileged(privilegedAction);
    }

    public static Object f(PrivilegedExceptionAction privilegedExceptionAction) {
        return AccessController.doPrivileged(privilegedExceptionAction);
    }

    private native int forkAndExec(byte[] var1, byte[] var2, int var3, byte[] var4, int var5, byte[] var6, int[] var7, boolean var8);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static FileInputStream g(int n3) {
        Throwable throwable2;
        FileInputStream fileInputStream;
        block4: {
            Field field;
            fileInputStream = new FileInputStream(UNIXProcess.j(n3));
            try {
                try {
                    field = FileInputStream.class.getDeclaredField("isFdOwner");
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    field = FileInputStream.class.getDeclaredField("shouldClose");
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            ((AccessibleObject)field).setAccessible(true);
            field.set(fileInputStream, Boolean.TRUE);
            return fileInputStream;
        }
        e1.g("Failed set isFdOwner", throwable2);
        return fileInputStream;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static FileOutputStream h(int n3) {
        Throwable throwable2;
        FileOutputStream fileOutputStream;
        block4: {
            Field field;
            fileOutputStream = new FileOutputStream(UNIXProcess.j(n3));
            try {
                try {
                    field = FileOutputStream.class.getDeclaredField("isFdOwner");
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    field = FileOutputStream.class.getDeclaredField("shouldClose");
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            ((AccessibleObject)field).setAccessible(true);
            field.set(fileOutputStream, Boolean.TRUE);
            return fileOutputStream;
        }
        e1.g("Failed set isFdOwner", throwable2);
        return fileOutputStream;
    }

    private static native void initIDs();

    static FileDescriptor j(int n3) {
        FileDescriptor fileDescriptor = new FileDescriptor();
        try {
            Field field = FileDescriptor.class.getDeclaredField("descriptor");
            ((AccessibleObject)field).setAccessible(true);
            field.set(fileDescriptor, n3);
            return fileDescriptor;
        }
        catch (Throwable throwable) {
            throw new RuntimeException("Failed set fd", throwable);
        }
    }

    private native int waitForProcessExit(int var1);

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void destroy() {
        synchronized (this) {
            if (!this.b) {
                UNIXProcess.destroyProcess(this.pid);
            }
        }
        try {
            this.c.close();
        }
        catch (IOException iOException) {}
        try {
            this.d.close();
        }
        catch (IOException iOException) {}
        try {
            this.e.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
        {
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int exitValue() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (this.b) {
                        return this.a;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                IllegalThreadStateException illegalThreadStateException = new IllegalThreadStateException("process hasn't exited");
                throw illegalThreadStateException;
            }
            throw throwable2;
        }
    }

    @Override
    public InputStream getErrorStream() {
        return this.e;
    }

    @Override
    public InputStream getInputStream() {
        return this.d;
    }

    @Override
    public OutputStream getOutputStream() {
        return this.c;
    }

    void i(int[] object) {
        Closeable closeable = object[0] == -1 ? android.lang.UNIXProcess$e.a : new g(object[0]);
        this.c = closeable;
        closeable = object[1] == -1 ? android.lang.UNIXProcess$d.a : new f(object[1]);
        this.d = closeable;
        object = object[2] == -1 ? (Object)android.lang.UNIXProcess$d.a : (Object)new f(object[2]);
        this.e = object;
        f.execute(new Runnable(this){
            final UNIXProcess a;
            {
                this.a = uNIXProcess;
            }

            @Override
            public void run() {
                UNIXProcess uNIXProcess = this.a;
                int n3 = uNIXProcess.waitForProcessExit(uNIXProcess.pid);
                this.a.k(n3);
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void k(int n3) {
        synchronized (this) {
            this.a = n3;
            this.b = true;
            this.notifyAll();
        }
        Closeable closeable = this.d;
        if (closeable instanceof f) {
            ((f)closeable).b();
        }
        if ((closeable = this.e) instanceof f) {
            ((f)closeable).b();
        }
        if ((closeable = this.c) instanceof g) {
            ((g)closeable).a();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Process[pid=");
        stringBuilder.append(this.pid);
        if (this.b) {
            stringBuilder.append(", hasExited=true, exitcode=");
            stringBuilder.append(this.a);
            stringBuilder.append(']');
        } else {
            stringBuilder.append(", hasExited=false]");
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int waitFor() {
        synchronized (this) {
            try {
                while (true) {
                    if (this.b) {
                        return this.a;
                    }
                    this.wait();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    static class d
    extends InputStream {
        static final d a = new d();

        private d() {
        }

        @Override
        public int available() {
            return 0;
        }

        @Override
        public int read() {
            return -1;
        }
    }

    static class e
    extends OutputStream {
        static final e a = new e();

        private e() {
        }

        @Override
        public void write(int n3) {
            throw new IOException("Stream closed");
        }
    }

    static class f
    extends BufferedInputStream {
        f(int n3) {
            super(UNIXProcess.g(n3));
        }

        private static byte[] a(InputStream object) {
            int n3;
            byte[] byArray = null;
            if (object == null) {
                return null;
            }
            int n4 = 0;
            while ((n3 = ((InputStream)object).available()) > 0) {
                byArray = byArray == null ? new byte[n3] : Arrays.copyOf(byArray, n4 + n3);
                n4 += ((InputStream)object).read(byArray, n4, n3);
            }
            object = byArray;
            if (byArray != null) {
                object = n4 == byArray.length ? (Object)byArray : (Object)Arrays.copyOf(byArray, n4);
            }
            return object;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void b() {
            block7: {
                synchronized (this) {
                    Throwable throwable22;
                    block6: {
                        InputStream inputStream;
                        try {
                            inputStream = this.in;
                            if (inputStream == null) return;
                            byte[] byArray = android.lang.UNIXProcess$f.a(inputStream);
                            inputStream.close();
                            inputStream = byArray == null ? android.lang.UNIXProcess$d.a : new ByteArrayInputStream(byArray);
                        }
                        catch (Throwable throwable22) {
                            break block6;
                        }
                        this.in = inputStream;
                        if (this.buf != null) return;
                        this.in = null;
                        break block7;
                    }
                    throw throwable22;
                    catch (IOException iOException) {}
                }
            }
        }
    }

    static class g
    extends BufferedOutputStream {
        g(int n3) {
            super(UNIXProcess.h(n3));
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void a() {
            synchronized (this) {
                block5: {
                    try {
                        OutputStream outputStream = this.out;
                        if (outputStream == null) break block5;
                        try {
                            outputStream.close();
                        }
                        catch (IOException iOException) {}
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                    this.out = android.lang.UNIXProcess$e.a;
                }
                return;
            }
        }
    }

    private static class h
    implements ThreadFactory {
        private static final ThreadGroup a = h.a();

        private h() {
        }

        private static ThreadGroup a() {
            return (ThreadGroup)UNIXProcess.e(new PrivilegedAction(){

                public ThreadGroup a() {
                    ThreadGroup threadGroup;
                    ThreadGroup threadGroup2 = Thread.currentThread().getThreadGroup();
                    while ((threadGroup = threadGroup2.getParent()) != null && threadGroup2 != threadGroup) {
                        threadGroup2 = threadGroup;
                    }
                    return threadGroup2;
                }
            });
        }

        @Override
        public Thread newThread(Runnable runnable) {
            runnable = new Thread(a, runnable, "process reaper", 32768L);
            ((Thread)runnable).setDaemon(true);
            ((Thread)runnable).setPriority(10);
            return runnable;
        }
    }
}

