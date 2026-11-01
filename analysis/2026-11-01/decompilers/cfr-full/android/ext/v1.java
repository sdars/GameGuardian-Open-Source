/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.SharedPreferences;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.g2;
import android.ext.z1;
import java.io.File;

public abstract class v1 {
    /*
     * Enabled aggressive block sorting
     */
    public static String a(String charSequence, String charSequence2, String string2) {
        Object object = MainService.instance.v0;
        if (object == null) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(v1.b(null, (String)charSequence));
            ((StringBuilder)charSequence2).append("/file");
            charSequence = charSequence2;
        } else {
            object = ((z1.d)object).c;
            SharedPreferences sharedPreferences = Tools.M0();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append((String)charSequence2);
            charSequence2 = sharedPreferences.getString(stringBuilder.toString(), null);
            if (charSequence2 != null) {
                return charSequence2;
            }
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(v1.b(null, (String)charSequence));
            ((StringBuilder)charSequence2).append('/');
            ((StringBuilder)charSequence2).append((String)object);
            charSequence = charSequence2;
        }
        ((StringBuilder)charSequence).append(string2);
        return ((StringBuilder)charSequence).toString();
    }

    public static String b(String string2, String string3) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(Tools.K0());
        charSequence.append("/Notes");
        charSequence = charSequence.toString();
        if (string2 == null) {
            return Tools.M0().getString(string3, (String)charSequence);
        }
        new g2().k(string3, string2, (String)charSequence).commit();
        return null;
    }

    public static void c(String object, String string2, String string3, String string4) {
        object = new File(((String)object).trim());
        Object object2 = ((File)object).getParent();
        if (string2 != null && object2 != null && ((String)object2).length() > 0) {
            v1.b((String)object2, string2);
        }
        if ((object2 = MainService.instance.v0) != null) {
            String string5 = ((z1.d)object2).c;
            object2 = new g2();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string5);
            stringBuilder.append(string3);
            string3 = stringBuilder.toString();
            object = ((File)object).getAbsolutePath();
            stringBuilder = new StringBuilder();
            stringBuilder.append(v1.b(null, string2));
            stringBuilder.append('/');
            stringBuilder.append(string5);
            stringBuilder.append(string4);
            ((g2)object2).k(string3, (String)object, stringBuilder.toString()).commit();
        }
    }
}

