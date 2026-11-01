package android.ext;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
class x2$i extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f1326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1327b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1328c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f1329d = new byte[512];

    public x2$i(InputStream inputStream) {
        this.f1326a = inputStream;
    }

    public String a() {
        StringBuilder sb;
        String str;
        String str2 = "buf[" + this.f1327b + "]: ";
        if (this.f1327b <= this.f1329d.length) {
            sb = new StringBuilder();
            sb.append(str2);
            str = new String(this.f1329d, 0, this.f1328c);
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            byte[] bArr = this.f1329d;
            int i = this.f1328c;
            sb.append(new String(bArr, i, bArr.length - i));
            str = new String(this.f1329d, 0, this.f1328c);
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f1326a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1326a.close();
    }

    public boolean equals(Object obj) {
        return this.f1326a.equals(obj);
    }

    public int hashCode() {
        return this.f1326a.hashCode();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f1326a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f1326a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.f1326a.read();
        if (i > 0) {
            this.f1327b++;
            byte[] bArr = this.f1329d;
            int i2 = this.f1328c;
            bArr[i2] = (byte) i;
            this.f1328c = (i2 + 1) % bArr.length;
        }
        return i;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.f1326a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f1326a.skip(j);
    }

    public String toString() {
        return this.f1326a.toString();
    }
}
