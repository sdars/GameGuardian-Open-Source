package android.ext;

import android.content.SharedPreferences;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public final class r0 {

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.a();
        }
    }

    public r0(boolean z) {
        if (z) {
            new g0(new a(), "FloatCheck").start();
        } else {
            a();
        }
    }

    private void b(String str) {
        e1.d("FloatCheck: float off by " + str);
        m2.f1074a = false;
    }

    private void c() {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Tools.I(new String[]{"getprop"}).getInputStream()));
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                }
                bufferedReader.close();
            } while (!line.contains("ro.build.remixos.version"));
            e1.d("Remix-detect: " + line);
            if (line.contains("[2.")) {
                b(line);
            }
            bufferedReader.close();
        } catch (Throwable th) {
            e1.l("Remix-detect", th);
        }
    }

    public static void d(boolean z) {
        new g2().c("float-off", z, false).commit();
    }

    void a() {
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        if (!sharedPreferencesM0.contains("float-off")) {
            c();
        } else if (sharedPreferencesM0.getBoolean("float-off", false)) {
            b("pref");
        }
    }
}
