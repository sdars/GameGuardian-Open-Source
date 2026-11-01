package android.lang;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
class UNIXProcess$e extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final UNIXProcess$e f1484a = new UNIXProcess$e();

    private UNIXProcess$e() {
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        throw new IOException("Stream closed");
    }
}
