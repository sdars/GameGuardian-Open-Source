package android.ext;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f1041a = "locale";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f1042b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f1043c = "crashed-vm";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f1044d = "crashed-vm2";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Locale f1045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static List f1046f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f1047g;

    static {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile("~~~([-_A-Za-z0-9]{1,10})~~~");
        } catch (Throwable th) {
            e1.a(th);
            patternCompile = null;
        }
        f1047g = patternCompile;
    }

    public static void a(String str) {
        Locale localeD = d(str);
        Locale.setDefault(localeD);
        gga.b.g(null, localeD);
        k(r.p);
        k(r.o);
        k(MainService.context);
        e1.d("Loaded locale: " + str);
        l();
        if (str.equals(f1042b)) {
            return;
        }
        f1042b = str;
        b2.a();
    }

    public static String b() {
        try {
            return Tools.M0().getString(f1041a, Locale.getDefault().toString());
        } catch (Throwable th) {
            e1.l("Failed get locale", th);
            return "";
        }
    }

    public static Locale c() {
        return d(b());
    }

    public static Locale d(String str) {
        String[] strArrSplit = str.split("[-_]");
        return strArrSplit.length > 1 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(str);
    }

    public static String[] e() {
        Locale[] availableLocales;
        String[] locales = ggd.b.f1511a;
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        if (!sharedPreferencesM0.getBoolean(f1043c, false)) {
            sharedPreferencesM0.edit().putBoolean(f1043c, true).commit();
            locales = Tools.f0().getAssets().getLocales();
            sharedPreferencesM0.edit().remove(f1043c).commit();
        }
        ArrayList arrayList = new ArrayList();
        String strSubstring = "";
        arrayList.add("");
        for (String str : locales) {
            if (str != null && !arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        if (sharedPreferencesM0.getBoolean(f1044d, false)) {
            availableLocales = null;
        } else {
            sharedPreferencesM0.edit().putBoolean(f1044d, true).commit();
            availableLocales = Locale.getAvailableLocales();
            sharedPreferencesM0.edit().remove(f1044d).commit();
        }
        if (availableLocales != null) {
            for (Locale locale : availableLocales) {
                if (locale != null) {
                    String country = locale.getCountry();
                    String language = locale.getLanguage();
                    String str2 = (country == null || country.length() == 0) ? language : language + '_' + country;
                    if (country != null && country.length() != 0) {
                        language = language + '-' + country;
                    }
                    if (!arrayList.contains(str2) && !arrayList.contains(language)) {
                        arrayList.add(language);
                    }
                }
            }
        }
        if (f1047g != null) {
            try {
                ZipFile zipFile = new ZipFile(Tools.f0().getPackageResourcePath());
                InputStream inputStream = zipFile.getInputStream(zipFile.getEntry("resources.arsc"));
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    String str3 = new String(bArr, 0, i, Charset.forName("US-ASCII"));
                    if (str3.indexOf(126) != -1) {
                        Matcher matcher = f1047g.matcher(strSubstring + str3);
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            String strReplace = strGroup.replace('_', '-');
                            if (!arrayList.contains(strGroup) && !arrayList.contains(strReplace)) {
                                arrayList.add(strReplace);
                            }
                        }
                    }
                    strSubstring = str3.substring(0, Math.min(40, str3.length()));
                }
                inputStream.close();
                zipFile.close();
            } catch (Throwable th) {
                e1.l("Failed load locales from apk", th);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static Locale f() {
        Locale locale = f1045e;
        if (locale != null) {
            return locale;
        }
        Locale localeC = c();
        f1045e = localeC;
        return localeC;
    }

    public static void g() {
        try {
            a(b());
        } catch (Throwable th) {
            e1.l("Failed load locale", th);
        }
    }

    public static void h(Class cls) {
        f1046f.add(cls);
    }

    public static void i(String str) {
        new g2().putString(f1041a, str).commit();
        a(str);
    }

    public static void j(Locale locale) {
        f1045e = locale;
    }

    private static void k(Context context) {
        if (context == null) {
            return;
        }
        context.getResources();
    }

    private static void l() {
        for (Class cls : f1046f) {
            try {
                cls.getMethod("updateLocale", null).invoke(null, null);
            } catch (Throwable th) {
                e1.s("Failed call updateLocale for " + cls.getName(), th);
            }
        }
    }
}
