package android.ext;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
class Script$saveList$1 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RandomAccessFile f438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Script$saveList f439b;

    Script$saveList$1(Script$saveList script$saveList, RandomAccessFile randomAccessFile) {
        this.f439b = script$saveList;
        this.f438a = randomAccessFile;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f438a.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f438a.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f438a.write(bArr, i, i2);
    }
}
