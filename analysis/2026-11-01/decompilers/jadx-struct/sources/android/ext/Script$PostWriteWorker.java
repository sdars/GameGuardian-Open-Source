package android.ext;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class Script$PostWriteWorker extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f388e;

    Script$PostWriteWorker(OutputStream outputStream, byte[] bArr, int i, int i2) {
        this.f384a = outputStream;
        this.f385b = bArr;
        this.f386c = i;
        this.f387d = i2;
    }

    void a(boolean z) throws IOException {
        try {
            this.f384a.close();
        } catch (Throwable unused) {
        }
        try {
            join(5000L);
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        }
        Throwable th = this.f388e;
        if (z || th == null) {
            return;
        }
        if (!(th instanceof RuntimeException)) {
            throw new IOException(th);
        }
        throw ((RuntimeException) th);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f384a.write(this.f385b, this.f386c, this.f387d);
            this.f384a.flush();
        } catch (Throwable th) {
            this.f388e = th;
        }
    }
}
