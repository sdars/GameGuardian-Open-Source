package android.ext;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
class b1$a0 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f604a;

    private b1$a0(RandomAccessFile randomAccessFile) throws IOException {
        this.f604a = randomAccessFile;
        randomAccessFile.seek(0L);
        randomAccessFile.setLength(0L);
    }

    /* synthetic */ b1$a0(RandomAccessFile randomAccessFile, b1$i b1_i) {
        this(randomAccessFile);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f604a.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f604a.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f604a.write(bArr, i, i2);
    }
}
