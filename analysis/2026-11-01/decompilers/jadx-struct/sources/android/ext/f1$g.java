package android.ext;

import android.content.SharedPreferences;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f1$g implements Runnable {
    f1$g() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            SharedPreferences sharedPreferencesM0 = Tools.M0();
            String string = sharedPreferencesM0.getString("improve-translate", "");
            String str = b2.f(R$string.version_number) + ':' + b2.f(R$string.lang_code);
            if (str.equals(string)) {
                return;
            }
            if (b2.f(R$string.front_text).contains(b2.f(R$string.improve_translation_en))) {
                n2.i(new f1$g$b(this, new f1$g$a(this, sharedPreferencesM0, str)));
            }
        } catch (Throwable th) {
            e1.l("checkAutoTranslation", th);
        }
    }
}
