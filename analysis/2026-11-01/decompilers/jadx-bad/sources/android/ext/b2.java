package android.ext;

import android.content.res.Resources;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile WeakReference f655a = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile a.e f656b = new a.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static int[] f657c = d.b.f1512d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile long f658d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Runnable f659e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Pattern f660f = Pattern.compile("__([a-z0-9_]+?)__");

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = b2.f658d;
            if (j != 0 && System.currentTimeMillis() - j > 5000) {
                b2.a();
            }
            Handler handlerD = n2.d();
            try {
                handlerD.removeCallbacks(this);
            } catch (NullPointerException e2) {
                e1.a(e2);
            }
            handlerD.postDelayed(this, 1000L);
        }
    }

    public static void a() {
        a.e eVar = f656b;
        if (eVar.size() <= f657c.length) {
            return;
        }
        a.e eVar2 = new a.e();
        for (int i : f657c) {
            String str = (String) eVar.b(i);
            if (str != null) {
                eVar2.put(i, str);
            }
        }
        f656b = eVar2;
        f658d = 0L;
    }

    public static String b(int i) {
        try {
            return c().getResourceEntryName(i);
        } catch (Throwable th) {
            String str = "Resource name for id 0x" + t2.e(8, i) + " not found";
            e1.l(str, th);
            return str;
        }
    }

    private static Resources c() {
        Resources resources = (Resources) f655a.get();
        if (resources == null) {
            resources = Tools.f0().getResources();
            f655a = new WeakReference(resources);
            f659e.run();
            a.e eVar = new a.e();
            ArrayList arrayList = f657c.length == 0 ? new ArrayList() : null;
            int iD = d(Tools.removeNewLinesChars("dssbqdph"), "string");
            String strIntern = Tools.removeNewLinesChars("JdphJxdugldq").intern();
            if (arrayList != null) {
                arrayList.add(Integer.valueOf(iD));
            }
            eVar.put(iD, strIntern);
            try {
                String.format(k.f(), h(2131296356), 1000);
            } catch (Exception e2) {
                e1.l("Check format", e2);
                if (arrayList != null) {
                    arrayList.add(2131296356);
                }
                eVar.put(2131296356, "%d");
            }
            String strRemoveNewLinesChars = Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2iruxp");
            if (arrayList != null) {
                arrayList.add(2131296475);
            }
            eVar.put(2131296475, strRemoveNewLinesChars);
            if (arrayList != null) {
                arrayList.add(2131296370);
            }
            eVar.put(2131296370, String.valueOf(t1.f1252b));
            if (arrayList != null) {
                arrayList.add(2131297009);
            }
            eVar.put(2131297009, t1.f1251a);
            if (arrayList != null) {
                f657c = Tools.Y0(arrayList);
            }
            f656b = eVar;
        }
        return resources;
    }

    public static int d(String str, String str2) {
        try {
            Resources resourcesC = c();
            return resourcesC.getIdentifier(str, str2, resourcesC.getResourcePackageName(2131296356));
        } catch (Throwable th) {
            e1.s("Resource id for name '" + str + "' not found", th);
            return 0;
        }
    }

    private static String e(String str) {
        String strReplace;
        if (str == null) {
            str = "null";
        }
        if (str.indexOf(95) < 0) {
            return str;
        }
        try {
            Matcher matcher = f660f.matcher(str);
            strReplace = str;
            while (matcher.find()) {
                try {
                    try {
                        int iD = d(matcher.group(1), "string");
                        if (iD != 0) {
                            strReplace = strReplace.replace(matcher.group(0), h(iD));
                        }
                    } catch (Throwable th) {
                        e1.l("Exception for: " + str, th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    e1.l("Exception on: " + str, th);
                    return strReplace;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            strReplace = str;
        }
        return strReplace;
    }

    public static String f(int i) {
        return h(i);
    }

    public static String g(String str) {
        return e(str);
    }

    private static String h(int i) {
        String string;
        if (i == 0 || i == -1) {
            return "(Invalid resource id " + i + ")";
        }
        a.e eVar = f656b;
        Object objB = eVar.b(i);
        String string2 = objB == null ? null : objB.toString();
        if (string2 == null) {
            try {
                string = c().getString(i);
            } catch (Throwable th) {
                String str = "Resource for id 0x" + t2.e(8, i) + " not found";
                e1.l(str, th);
                string = str;
            }
            string2 = e(string);
            try {
                eVar.c(i, string2);
            } catch (Throwable th2) {
                e1.a(th2);
            }
            f658d = System.currentTimeMillis();
        }
        return string2;
    }
}
