/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.SharedPreferences;
import android.ext.Tools;
import android.ext.e1;
import android.ext.g0;
import android.ext.g2;
import android.ext.m2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public final class r0 {
    public r0(boolean bl) {
        if (bl) {
            new g0(new Runnable(this){
                final r0 a;
                {
                    this.a = r02;
                }

                @Override
                public void run() {
                    this.a.a();
                }
            }, "FloatCheck").start();
        } else {
            this.a();
        }
    }

    private void b(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FloatCheck: float off by ");
        stringBuilder.append(string2);
        e1.d(stringBuilder.toString());
        m2.a = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c() {
        Throwable throwable2;
        block4: {
            BufferedReader bufferedReader;
            try {
                Object object = Tools.I(new String[]{"getprop"});
                Object object2 = new InputStreamReader(((Process)object).getInputStream());
                bufferedReader = new BufferedReader((Reader)object2);
                while ((object2 = bufferedReader.readLine()) != null) {
                    if (!((String)object2).contains("ro.build.remixos.version")) continue;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Remix-detect: ");
                    ((StringBuilder)object).append((String)object2);
                    e1.d(((StringBuilder)object).toString());
                    if (!((String)object2).contains("[2.")) break;
                    this.b((String)object2);
                    break;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            bufferedReader.close();
            return;
        }
        e1.l("Remix-detect", throwable2);
    }

    public static void d(boolean bl) {
        new g2().c("float-off", bl, false).commit();
    }

    void a() {
        SharedPreferences sharedPreferences = Tools.M0();
        if (sharedPreferences.contains("float-off")) {
            if (sharedPreferences.getBoolean("float-off", false)) {
                this.b("pref");
            }
        } else {
            this.c();
        }
    }
}

