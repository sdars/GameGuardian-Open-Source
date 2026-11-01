package android.lang;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class UNIXProcess$f extends BufferedInputStream {
    UNIXProcess$f(int i) {
        super(UNIXProcess.g(i));
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArrCopyOf = null;
        if (inputStream == null) {
            return null;
        }
        int i = 0;
        while (true) {
            int iAvailable = inputStream.available();
            if (iAvailable <= 0) {
                break;
            }
            bArrCopyOf = bArrCopyOf == null ? new byte[iAvailable] : Arrays.copyOf(bArrCopyOf, i + iAvailable);
            i += inputStream.read(bArrCopyOf, i, iAvailable);
        }
        return (bArrCopyOf == null || i == bArrCopyOf.length) ? bArrCopyOf : Arrays.copyOf(bArrCopyOf, i);
    }

    synchronized void b() {
        try {
            InputStream inputStream = ((BufferedInputStream) this).in;
            if (inputStream != null) {
                byte[] bArrA = a(inputStream);
                inputStream.close();
                ((BufferedInputStream) this).in = bArrA == null ? UNIXProcess$d.f1483a : new ByteArrayInputStream(bArrA);
                if (((BufferedInputStream) this).buf == null) {
                    ((BufferedInputStream) this).in = null;
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            throw th;
        }
    }
}
