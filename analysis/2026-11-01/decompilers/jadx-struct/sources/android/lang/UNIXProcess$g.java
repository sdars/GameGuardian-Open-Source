package android.lang;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
class UNIXProcess$g extends BufferedOutputStream {
    UNIXProcess$g(int i) {
        super(UNIXProcess.h(i));
    }

    synchronized void a() {
        try {
            OutputStream outputStream = ((BufferedOutputStream) this).out;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
                ((BufferedOutputStream) this).out = UNIXProcess$e.f1484a;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
