package luaj;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes.dex */
class Globals$c extends PushbackInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f1645b = 65;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f1646a;

    private Globals$c(InputStream inputStream) {
        super(inputStream, f1645b);
        this.f1646a = false;
    }

    static Globals$c b(InputStream inputStream) {
        if (!(inputStream instanceof Globals$c)) {
            inputStream = new Globals$c(inputStream);
        }
        return (Globals$c) inputStream;
    }

    public Globals$c a(boolean z) {
        this.f1646a = z;
        return this;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        byte[] bArr = ((PushbackInputStream) this).buf;
        if (bArr == null) {
            throw new IOException();
        }
        int i2 = ((PushbackInputStream) this).pos;
        if (i2 < f1645b) {
            ((PushbackInputStream) this).pos = i2 + 1;
            i = bArr[i2] & 255;
        } else {
            i = ((PushbackInputStream) this).in.read();
        }
        if (i != 239 || !this.f1646a) {
            return i;
        }
        int i3 = super.read();
        if (i3 != 187) {
            unread(i3);
            return i;
        }
        int i4 = super.read();
        if (i4 == 191) {
            return read();
        }
        unread(i4);
        unread(i3);
        return i;
    }
}
