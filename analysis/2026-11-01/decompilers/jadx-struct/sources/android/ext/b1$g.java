package android.ext;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class b1$g extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b1 f622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b1$g(b1 b1Var, int i, int i2) {
        super(i);
        this.f622b = b1Var;
        this.f621a = i2;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        byte[][] bArr = b1.z;
        if (bArr != null) {
            byte[] byteArray = toByteArray();
            if (byteArray == null) {
                e1.a(new RuntimeException("toByteArray return null"));
            }
            bArr[this.f621a] = byteArray;
        }
    }
}
