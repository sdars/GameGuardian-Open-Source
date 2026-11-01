package android.ext;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class x2$g extends FileInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1322a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x2$g(String str, String str2) {
        super(str);
        this.f1322a = str2;
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        new File(this.f1322a).delete();
    }

    @Override // java.io.FileInputStream
    protected void finalize() throws IOException {
        super.finalize();
        new File(this.f1322a).delete();
    }
}
