package android.ext;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
class g$a extends OutputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static g$a f985c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f987b = 0;

    public g$a(OutputStream outputStream) {
        this.f986a = outputStream;
        f985c = this;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f986a.close();
    }

    public boolean equals(Object obj) {
        return this.f986a.equals(obj);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f986a.flush();
    }

    public int hashCode() {
        return this.f986a.hashCode();
    }

    public String toString() {
        return this.f986a.toString();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f986a.write(i);
        this.f987b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f986a.write(bArr);
        this.f987b += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f986a.write(bArr, i, i2);
        this.f987b += i2;
    }
}
