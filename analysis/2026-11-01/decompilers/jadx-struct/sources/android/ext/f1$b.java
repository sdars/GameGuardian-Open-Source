package android.ext;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.os.Build$VERSION;
import catch_.me_.if_.you_.can_.R$string;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
class f1$b implements Runnable {
    f1$b() {
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bytes;
        BufferedReader bufferedReader;
        StringBuilder sb;
        int iE;
        int iE2;
        String str;
        String str2;
        try {
            f1.f951a = Boolean.FALSE;
            String str3 = "" + ((1 * 112.0f) - 10.6f);
            String str4 = null;
            try {
                StringBuilder sb2 = new StringBuilder();
                SharedPreferences sharedPreferencesM0 = Tools.M0();
                for (int i = 0; i < 4; i++) {
                    String str5 = "used-" + i;
                    if (sharedPreferencesM0.contains(str5)) {
                        String string = sharedPreferencesM0.getString(str5, "");
                        if (string.length() != 0) {
                            if (sb2.length() != 0) {
                                sb2.append('&');
                            }
                            sb2.append(i);
                            sb2.append('=');
                            sb2.append(string);
                        }
                    }
                }
                SharedPreferences$Editor sharedPreferences$EditorEdit = sharedPreferencesM0.edit();
                for (int i2 = 0; i2 < 4; i2++) {
                    sharedPreferences$EditorEdit.remove("used-" + i2);
                }
                sharedPreferences$EditorEdit.commit();
                bytes = sb2.toString().getBytes();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (str4 == null) {
                        str4 = line;
                    }
                    if ("".equals(str)) {
                        if (h0.e(line) <= iE) {
                            break;
                        } else {
                            str2 = line;
                        }
                    }
                    sb.append(line);
                    sb.append('\n');
                    if (line.contains("ARMv5") && h0.e(str2) > iE2) {
                        try {
                            i.f999a = Float.parseFloat(str2);
                            iE2 = h0.e(str2);
                        } catch (NumberFormatException e2) {
                            e1.s("Failed parse as float '" + str2 + "'", e2);
                        }
                    }
                    str = line;
                }
            } catch (Throwable th) {
                e1.a(th);
                bytes = null;
            }
            URLConnection uRLConnectionOpenConnection = new URL(Tools.L1(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2JJborjv2yhuvlrq1sksBv@(g)y@(v)o@(v)w@(v)d@(g)r@(v)x@(v"), Integer.valueOf(Build$VERSION.SDK_INT), str3, k.b(), b2.f(R$string.lang_code), Integer.valueOf(e0.f()), f1.v(), f1.x()) + p1.d() + ConfigListAdapter.i()).openConnection();
            if (bytes != null) {
                try {
                    uRLConnectionOpenConnection.setDoOutput(true);
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(uRLConnectionOpenConnection.getOutputStream());
                    gZIPOutputStream.write(bytes);
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    e1.a(th2);
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(uRLConnectionOpenConnection.getInputStream()));
            sb = new StringBuilder();
            iE = h0.e(str3);
            iE2 = h0.e(Float.toString(i.f999a));
            str = "";
            str2 = null;
            bufferedReader.close();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Server version: ");
            sb3.append(str4 != null ? str4 + ' ' + h0.e(str4) : "null");
            e1.d(sb3.toString());
            if (str4 == null || h0.e(str4) <= iE) {
                return;
            }
            f1.f951a = Boolean.TRUE;
            n2.i(new f1$b$a(this, sb, str4));
        } catch (Throwable th3) {
            e1.l("checkNewVersion", th3);
        }
    }
}
