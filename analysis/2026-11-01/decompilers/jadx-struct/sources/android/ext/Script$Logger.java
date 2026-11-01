package android.ext;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class Script$Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final OutputStream f380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final FileInputStream f381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StringBuilder f382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f383d;

    Script$Logger() {
        BufferedOutputStream bufferedOutputStream;
        FileInputStream fileInputStream;
        Throwable th;
        StringBuilder sb = null;
        try {
            File file = new File(Tools.p0(), System.currentTimeMillis() + ".tmp");
            file.createNewFile();
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    file.delete();
                } catch (Throwable th2) {
                    th = th2;
                    e1.a(th);
                    sb = new StringBuilder();
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                th = th;
                e1.a(th);
                sb = new StringBuilder();
                this.f382c = sb;
                this.f380a = bufferedOutputStream;
                this.f381b = fileInputStream;
                this.f383d = 0;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
            fileInputStream = null;
        }
        this.f382c = sb;
        this.f380a = bufferedOutputStream;
        this.f381b = fileInputStream;
        this.f383d = 0;
    }

    public void a(String str) {
        StringBuilder sb = this.f382c;
        if (sb != null) {
            sb.append(str);
            return;
        }
        try {
            byte[] bytes = str.getBytes();
            this.f380a.write(bytes);
            this.f383d += bytes.length;
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    public String toString() {
        int i = this.f383d;
        if (i < 0) {
            return "must be called only once";
        }
        StringBuilder sb = this.f382c;
        if (sb != null) {
            return sb.toString();
        }
        try {
            this.f383d = -1;
            this.f380a.close();
            int i2 = 262144;
            if (i > 262144) {
                this.f381b.skip(i - 262144);
            } else {
                i2 = i;
            }
            byte[] bArr = new byte[i2];
            int i3 = this.f381b.read(bArr);
            this.f381b.close();
            e1.d("Log script size: read = " + i3 + "; used = " + i2 + "; full = " + i);
            return i3 > 0 ? new String(bArr, 0, i3) : "";
        } catch (Throwable th) {
            e1.a(th);
            return "";
        }
    }
}
