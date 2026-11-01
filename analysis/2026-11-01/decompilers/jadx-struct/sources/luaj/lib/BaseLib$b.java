package luaj.lib;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class BaseLib$b extends BufferedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f1736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1737b;

    public BaseLib$b(InputStream inputStream) {
        super(inputStream);
        this.f1737b = -1L;
    }

    public long a() {
        return this.f1736a;
    }

    public InputStream b() {
        return ((BufferedInputStream) this).in;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        try {
            super.mark(i);
            this.f1737b = this.f1736a;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.f1736a++;
        }
        return i;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.f1736a += (long) i3;
        }
        return i3;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            if (!super.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f1737b == -1) {
                throw new IOException("Mark not set");
            }
            super.reset();
            this.f1736a = this.f1737b;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        this.f1736a += jSkip;
        return jSkip;
    }
}
