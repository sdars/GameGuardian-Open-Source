/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.b;
import android.content.Context;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.g2;
import android.ext.r;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public abstract class k {
    private static String a = "locale";
    private static volatile String b;
    private static String c = "crashed-vm";
    private static String d = "crashed-vm2";
    private static volatile Locale e;
    private static List f;
    private static final Pattern g;

    static {
        Pattern pattern;
        f = new ArrayList();
        try {
            pattern = Pattern.compile("~~~([-_A-Za-z0-9]{1,10})~~~");
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            pattern = null;
        }
        g = pattern;
    }

    public static void a(String string2) {
        Serializable serializable = k.d(string2);
        Locale.setDefault((Locale)serializable);
        a.b.g(null, (Locale)serializable);
        k.k(r.p);
        k.k(r.o);
        k.k(MainService.context);
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("Loaded locale: ");
        ((StringBuilder)serializable).append(string2);
        e1.d(((StringBuilder)serializable).toString());
        k.l();
        if (!string2.equals(b)) {
            b = string2;
            b2.a();
        }
    }

    public static String b() {
        String string2;
        try {
            string2 = Tools.M0().getString(a, Locale.getDefault().toString());
        }
        catch (Throwable throwable) {
            e1.l("Failed get locale", throwable);
            string2 = "";
        }
        return string2;
    }

    public static Locale c() {
        return k.d(k.b());
    }

    public static Locale d(String object) {
        String[] stringArray = ((String)object).split("[-_]");
        object = stringArray.length > 1 ? new Locale(stringArray[0], stringArray[1]) : new Locale((String)object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String[] e() {
        Object object;
        CharSequence charSequence;
        Object object22;
        String string2;
        ArrayList<Object> arrayList;
        Object object32;
        Object object4;
        block17: {
            object4 = d.b.a;
            object32 = Tools.M0();
            if (!object32.getBoolean(c, false)) {
                object32.edit().putBoolean(c, true).commit();
                object4 = Tools.f0().getAssets().getLocales();
                object32.edit().remove(c).commit();
            }
            arrayList = new ArrayList<Object>();
            string2 = "";
            arrayList.add("");
            for (Object object22 : object4) {
                if (object22 == null || arrayList.contains(object22)) continue;
                arrayList.add(object22);
            }
            if (!object32.getBoolean(d, false)) {
                object32.edit().putBoolean(d, true).commit();
                object4 = Locale.getAvailableLocales();
                object32.edit().remove(d).commit();
            } else {
                object4 = null;
            }
            if (object4 != null) {
                for (Object object32 : object4) {
                    if (object32 == null) continue;
                    charSequence = ((Locale)object32).getCountry();
                    object32 = ((Locale)object32).getLanguage();
                    if (charSequence != null && ((String)charSequence).length() != 0) {
                        object22 = new StringBuilder();
                        ((StringBuilder)object22).append((String)object32);
                        ((StringBuilder)object22).append('_');
                        ((StringBuilder)object22).append((String)charSequence);
                        object22 = ((StringBuilder)object22).toString();
                    } else {
                        object22 = object32;
                    }
                    object = object32;
                    if (charSequence != null) {
                        if (((String)charSequence).length() == 0) {
                            object = object32;
                        } else {
                            object = new StringBuilder();
                            ((StringBuilder)object).append((String)object32);
                            ((StringBuilder)object).append('-');
                            ((StringBuilder)object).append((String)charSequence);
                            object = ((StringBuilder)object).toString();
                        }
                    }
                    if (arrayList.contains(object22) || arrayList.contains(object)) continue;
                    arrayList.add(object);
                }
            }
            if (g == null) return arrayList.toArray(new String[arrayList.size()]);
            try {
                object32 = new ZipFile(Tools.f0().getPackageResourcePath());
                object = ((ZipFile)object32).getInputStream(((ZipFile)object32).getEntry("resources.arsc"));
                object22 = new byte[1024];
                object4 = string2;
                break block17;
            }
            catch (Throwable throwable) {}
            e1.l("Failed load locales from apk", throwable);
            return arrayList.toArray(new String[arrayList.size()]);
        }
        while (true) {
            int n3;
            if ((n3 = ((InputStream)object).read((byte[])object22)) == -1) {
                ((InputStream)object).close();
                ((ZipFile)object32).close();
                return arrayList.toArray(new String[arrayList.size()]);
            }
            string2 = new String((byte[])object22, 0, n3, Charset.forName("US-ASCII"));
            if (string2.indexOf(126) != -1) {
                Object object5 = g;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object4);
                ((StringBuilder)charSequence).append(string2);
                object4 = ((Pattern)object5).matcher(((StringBuilder)charSequence).toString());
                while (((Matcher)object4).find()) {
                    charSequence = ((Matcher)object4).group(1);
                    object5 = ((String)charSequence).replace('_', '-');
                    if (arrayList.contains(charSequence) || arrayList.contains(object5)) continue;
                    arrayList.add(object5);
                }
            }
            object4 = string2.substring(0, Math.min(40, string2.length()));
        }
    }

    public static Locale f() {
        Locale locale;
        Locale locale2 = locale = e;
        if (locale == null) {
            e = locale2 = k.c();
        }
        return locale2;
    }

    public static void g() {
        try {
            k.a(k.b());
        }
        catch (Throwable throwable) {
            e1.l("Failed load locale", throwable);
        }
    }

    public static void h(Class clazz) {
        f.add(clazz);
    }

    public static void i(String string2) {
        new g2().j(a, string2).commit();
        k.a(string2);
    }

    public static void j(Locale locale) {
        e = locale;
    }

    private static void k(Context context) {
        if (context == null) {
            return;
        }
        context.getResources();
    }

    private static void l() {
        for (Class clazz : f) {
            try {
                clazz.getMethod("updateLocale", null).invoke(null, null);
            }
            catch (Throwable throwable) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed call updateLocale for ");
                stringBuilder.append(clazz.getName());
                e1.s(stringBuilder.toString(), throwable);
            }
        }
    }
}

