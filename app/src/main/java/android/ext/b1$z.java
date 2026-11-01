package android.ext;

/* JADX INFO: loaded from: classes.dex */
class b1$z extends java.io.InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.RandomAccessFile f654a;

    private b1$z(java.io.RandomAccessFile randomAccessFile) throws java.io.IOException {
        this.f654a = randomAccessFile;
        randomAccessFile.seek(0L);
    }

    /* synthetic */ b1$z(java.io.RandomAccessFile randomAccessFile, android.ext.b1$i b1_i) {
        this(randomAccessFile);
    }

    @Override // java.io.InputStream
    public int available() {
        int length = (int) (this.f654a.length() - this.f654a.getFilePointer());
        if (length > 0) {
            return length;
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f654a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.f654a.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.f654a.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
    }

    @Override // java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        java.io.RandomAccessFile randomAccessFile = this.f654a;
        randomAccessFile.seek(randomAccessFile.getFilePointer() + j);
        return j;
    }
}
