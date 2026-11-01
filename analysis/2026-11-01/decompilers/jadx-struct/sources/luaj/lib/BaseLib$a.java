package luaj.lib;

import android.ext.e1;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
class BaseLib$a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1732a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InputStream f1733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BaseLib$c f1734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BaseLib f1735d;

    BaseLib$a(BaseLib baseLib, InputStream inputStream, BaseLib$c baseLib$c) {
        this.f1735d = baseLib;
        this.f1733b = inputStream;
        this.f1734c = baseLib$c;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.f1733b.read();
        try {
            if (i != -1) {
                this.f1734c.f1739b.write(i);
                this.f1732a++;
            } else {
                int i2 = this.f1732a;
                if (i2 > 0) {
                    this.f1734c.f1741d.writeInt(i2);
                }
            }
        } catch (Throwable th) {
            e1.s("Failed write log file", th);
        }
        return i;
    }
}
