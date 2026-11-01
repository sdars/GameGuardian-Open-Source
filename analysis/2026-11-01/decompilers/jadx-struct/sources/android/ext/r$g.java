package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
class r$g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f1220b;

    r$g(r rVar, String str) {
        this.f1220b = rVar;
        this.f1219a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            String strV = r.v();
            File file = new File(strV);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            r.U(fileOutputStream, strV, this.f1219a);
            Tools.q(file, 420);
            String str2 = "chmod 0644 " + strV + " 2>&1 ; logcat -v threadtime -b main -b system *:V 2>&1 ; exit\n";
            if (strV.contains("/emulated/0")) {
                str2 = "chmod 0644 " + strV.replace("/emulated/0", "/emulated/legacy") + " 2>&1 ; " + str2;
            }
            Process processQ = e2.q(str2);
            InputStream inputStream = processQ.getInputStream();
            byte[] bArr = new byte[8192];
            if (Tools.Z0(processQ)) {
                str = b2.f(R$string.record_logcat) + ": " + b2.f(R$string.error);
            } else {
                str = b2.f(R$string.record_logcat) + ": " + strV;
            }
            Tools.J1(str);
            while (!Thread.interrupted()) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    if (i == -1 && Tools.Z0(processQ)) {
                        break;
                    }
                } else {
                    fileOutputStream.write(bArr, 0, i);
                    fileOutputStream.flush();
                }
            }
            fileOutputStream.close();
            Tools.J1(b2.f(R$string.record_logcat) + ": " + b2.f(R$string.exit));
        } catch (Throwable th) {
            e1.a(th);
            Tools.J1(b2.f(R$string.record_logcat) + "> " + b2.f(R$string.error));
        }
    }
}
