package android.ext;

import android.util.Base64;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class z2 {

    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1442a;

        a(String str) {
            this.f1442a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(z2.b(this.f1442a.getBytes()));
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1443a;

        b(String str) {
            this.f1443a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    z2.b(this.f1443a.getBytes());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static byte[] a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return Base64.encode(byteArray, 0);
    }

    static boolean b(byte[] bArr) {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2JJborjv2xvdjh1sks")).openConnection();
            uRLConnectionOpenConnection.setDoOutput(true);
            OutputStream outputStream = uRLConnectionOpenConnection.getOutputStream();
            byte[] bArrA = a(bArr);
            outputStream.write(bArrA);
            outputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnectionOpenConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    boolean zEquals = "OK".equals(sb.toString());
                    e1.d("UsageStats compress from " + bArr.length + " to " + bArrA.length + ", sended: " + zEquals);
                    return zEquals;
                }
                sb.append(line);
            }
        } catch (Exception e2) {
            e1.g("UsageStats send fail", e2);
            return false;
        }
    }

    public static boolean c(String str) {
        return d(str, false);
    }

    public static boolean d(String str, boolean z) {
        if (Boolean.TRUE.equals(f1.f951a)) {
            e1.d("NLV - log not sended");
            return true;
        }
        if (!z) {
            new g0(new b(str), "sendLog").start();
            return true;
        }
        try {
            return ((Boolean) Executors.newSingleThreadExecutor().submit(new a(str)).get()).booleanValue();
        } catch (Throwable th) {
            e1.s("sendLog", th);
            return false;
        }
    }
}
