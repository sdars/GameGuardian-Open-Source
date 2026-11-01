package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import catch_.me_.if_.you_.can_.R;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
abstract class s1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f1244g;
    private static String[] i;
    private static volatile boolean j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1238a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f1239b = {"intro-shown", "permissions-requested", "permissions-settled", "overlay-shown", "overlay-settled", "complete"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f1240c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f1241d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f1242e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f1243f = false;
    private static final char[] h = "0123456789ABCDEF".toCharArray();
    private static final Runnable k = new c();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s1.z();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s1.K();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s1.c();
        }
    }

    class d implements DialogInterface.OnClickListener {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (s1.u() && s1.O() == 1 && r.n != null) {
                    s1.N();
                }
            }
        }

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            f1.r(r.p, new a());
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            s1.s();
        }
    }

    class f implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog f1246a;

        f(AlertDialog alertDialog) {
            this.f1246a = alertDialog;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Tools.u1(this.f1246a);
        }
    }

    static void A() {
        if (u() && O() == 3) {
            f1244g = false;
            z.m();
        }
    }

    static void B() {
        if (u() && O() == 2) {
            T("permissions-settled");
            M(3);
            f1240c = false;
            if (Build.VERSION.SDK_INT < 23) {
                T("overlay-settled");
                l();
            } else {
                z.m();
                L();
            }
        }
    }

    static void C() {
        if (j && q()) {
            j = false;
            m();
        }
        if (u()) {
            int iO = O();
            if (iO == 1) {
                if (f1241d) {
                    return;
                }
            } else if (iO != 2) {
                if (iO == 3) {
                    f1244g = false;
                    z.m();
                    return;
                }
                return;
            }
            o();
        }
    }

    static boolean D() {
        return f1244g;
    }

    static boolean E() {
        return f1243f;
    }

    private static String F() {
        try {
            synchronized (f1238a) {
                try {
                    SharedPreferences sharedPreferencesM0 = Tools.M0();
                    if (!R(sharedPreferencesM0)) {
                        return "";
                    }
                    String string = sharedPreferencesM0.getString("onboarding-queue", "");
                    if (string == null) {
                        string = "";
                    }
                    return string;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            e1.a(th2);
            return "";
        }
    }

    private static String G() {
        String strSubstring;
        try {
            synchronized (f1238a) {
                try {
                    SharedPreferences sharedPreferencesM0 = Tools.M0();
                    String string = sharedPreferencesM0.getString("onboarding-queue", "");
                    if (string != null && string.length() != 0) {
                        int iIndexOf = string.indexOf(44);
                        if (iIndexOf < 0) {
                            strSubstring = "";
                        } else {
                            String strSubstring2 = string.substring(0, iIndexOf);
                            strSubstring = string.substring(iIndexOf + 1);
                            string = strSubstring2;
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferencesM0.edit();
                        if (strSubstring.length() > 0) {
                            editorEdit.putString("onboarding-queue", strSubstring);
                        } else {
                            editorEdit.remove("onboarding-queue");
                        }
                        if (editorEdit.commit()) {
                            return string;
                        }
                        e1.p("Failed consume onboarding queue item");
                        return null;
                    }
                    return "";
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            e1.a(th2);
            return null;
        }
    }

    static void H() {
        j = true;
    }

    static void I() {
        f1.F();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    private static void J(int i2, String str) {
        boolean zP;
        try {
            if (i2 == 1) {
                zP = x2.p(str, k);
            } else {
                if (i2 != 2) {
                    if (i2 != 4) {
                        e1.p("Failed replay onboarding prompt: unknown code " + i2);
                    } else {
                        zP = f1.G(k);
                    }
                    if (j()) {
                        m();
                    } else {
                        P();
                    }
                }
                zP = x2.o(str, k);
            }
            if (zP) {
                return;
            }
            if (j()) {
                P();
            } else {
                m();
            }
        } catch (Throwable th) {
            e1.s("Failed replay onboarding prompt " + i2, th);
            P();
        }
    }

    static void K() {
        if (q()) {
            String strF = F();
            if (strF.length() == 0) {
                i(true);
                return;
            }
            f1243f = true;
            synchronized (s1.class) {
                try {
                    String[] strArr = i;
                    if (strArr == null || strArr.length <= 0) {
                        i = strF.split(",");
                        m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static void L() {
        try {
            n2.d().postDelayed(new a(), 20000L);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001d */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void M(int r4) {
        /*
            java.lang.Object r0 = android.ext.s1.f1238a     // Catch: java.lang.Throwable -> L1d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1d
            android.content.SharedPreferences r1 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences$Editor r1 = f(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "onboarding-step"
            r3 = 161550(0x2770e, float:2.2638E-40)
            int r4 = r4 + r3
            android.content.SharedPreferences$Editor r4 = r1.putInt(r2, r4)     // Catch: java.lang.Throwable -> L1a
            r4.commit()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1d
        L1d:
            r4 = move-exception
            android.ext.e1.a(r4)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.s1.M(int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N() {
        AlertDialog alertDialogCreate = android.ext.ggf.c(r.p).setTitle(b2.f(R.string.quick_start_title)).setCancelable(false).setMessage(t()).setPositiveButton(b2.f(R.string.ok), new e()).setNeutralButton(b2.f(R.string.more), new d()).create();
        android.ext.f.l(alertDialogCreate, new f(alertDialogCreate));
        android.ext.f.m(alertDialogCreate);
    }

    static int O() {
        int i2;
        try {
            int i3 = Tools.M0().getInt("onboarding-step", 0);
            if (i3 / 10 == 16155 && (i2 = i3 % 10) >= 0 && i2 <= 5) {
                return i2;
            }
            return 0;
        } catch (Throwable th) {
            e1.a(th);
            return 0;
        }
    }

    private static void P() {
        synchronized (s1.class) {
            i = null;
        }
    }

    static boolean Q() {
        boolean z;
        try {
            synchronized (f1238a) {
                try {
                    SharedPreferences sharedPreferencesM0 = Tools.M0();
                    z = true;
                    boolean z2 = R(sharedPreferencesM0) && sharedPreferencesM0.getBoolean("onboarding-shutdown-expected", false);
                    if (sharedPreferencesM0.contains("onboarding-shutdown-expected")) {
                        sharedPreferencesM0.edit().remove("onboarding-shutdown-expected").commit();
                    }
                    if (!z2 || O() < 2) {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        } catch (Throwable th2) {
            e1.a(th2);
            return false;
        }
    }

    private static boolean R(SharedPreferences sharedPreferences) {
        return sharedPreferences.getInt("onboarding-build", -1) == 16155;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    static String S(String str) {
        int i2;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i3 = 0;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '%' || (i2 = i3 + 2) >= str.length()) {
                sb.append(cCharAt);
            } else {
                int iR = r(str.charAt(i3 + 1));
                int iR2 = r(str.charAt(i2));
                if (iR < 0 || iR2 < 0) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) ((iR << 4) | iR2));
                    i3 = i2;
                }
            }
            i3++;
        }
        return sb.toString();
    }

    static void T(String str) {
        String str2;
        if (str != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = f1239b;
                if (i2 >= strArr.length) {
                    str2 = "Failed write onboarding stage: unknown code";
                    break;
                }
                if (strArr[i2].equals(str)) {
                    try {
                        File fileK = k("onboarding.stage");
                        FileOutputStream fileOutputStream = new FileOutputStream(fileK);
                        Tools.q(fileK, 384);
                        try {
                            fileOutputStream.write(str.getBytes("US-ASCII"));
                            return;
                        } finally {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th) {
                        e1.s("Failed write onboarding stage", th);
                        return;
                    }
                }
                i2++;
            }
        } else {
            str2 = "Failed write onboarding stage: null code";
        }
        e1.p(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        if (!j()) {
            P();
        } else {
            if (j) {
                return;
            }
            m();
        }
    }

    static void d() {
        if (q()) {
            if (!u()) {
                K();
                return;
            }
            f1243f = true;
            f1240c = false;
            if (!f1242e) {
                f1242e = true;
                I();
            }
            int iO = O();
            if (iO == 0 || iO == 1) {
                if (iO == 0) {
                    M(1);
                    T("intro-shown");
                }
                f1241d = true;
                N();
            }
        }
    }

    static void e() {
        j = false;
    }

    private static SharedPreferences.Editor f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (!R(sharedPreferences)) {
            editorEdit.remove("onboarding-queue").remove("onboarding-shutdown-expected").putInt("onboarding-build", 16155);
        }
        return editorEdit;
    }

    static void g() {
        f1244g = false;
    }

    private static void h() {
        T("complete");
        M(4);
    }

    private static boolean i(boolean z) {
        try {
            synchronized (f1238a) {
                try {
                    if (F().length() > 0) {
                        return false;
                    }
                    if (z && O() != 5) {
                        return false;
                    }
                    h();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            e1.a(th2);
            return false;
        }
    }

    private static boolean j() {
        return G() != null;
    }

    private static File k(String str) {
        File fileP0 = Tools.p0();
        if (fileP0 != null && !fileP0.isDirectory()) {
            fileP0.mkdirs();
        }
        return new File(fileP0, str);
    }

    static void l() {
        if (u()) {
            f1240c = false;
            if (i(false)) {
                return;
            }
            M(5);
            n2.i(new b());
        }
    }

    private static void m() {
        String strF = F();
        if (strF.length() == 0) {
            synchronized (s1.class) {
                i = null;
            }
            i(true);
            return;
        }
        int iIndexOf = strF.indexOf(44);
        if (iIndexOf >= 0) {
            strF = strF.substring(0, iIndexOf);
        }
        int iIndexOf2 = strF.indexOf(58);
        if (iIndexOf2 < 0) {
            if (j()) {
                m();
                return;
            } else {
                P();
                return;
            }
        }
        try {
            J(Integer.parseInt(strF.substring(0, iIndexOf2)), S(strF.substring(iIndexOf2 + 1)));
        } catch (NumberFormatException e2) {
            e1.s("Failed replay onboarding prompt: bad code", e2);
            if (j()) {
                m();
            } else {
                P();
            }
        }
    }

    static boolean n() {
        try {
            if (!u() && q()) {
                if (O() == 5) {
                    return true;
                }
                synchronized (s1.class) {
                    try {
                        String[] strArr = i;
                        if (strArr == null || strArr.length <= 0) {
                            return F().length() > 0;
                        }
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            e1.a(th2);
            return false;
        }
    }

    private static void o() {
        if (f1240c) {
            return;
        }
        f1240c = true;
        M(2);
        if (Build.VERSION.SDK_INT < 23) {
            B();
            return;
        }
        r rVar = r.n;
        if (rVar != null) {
            rVar.m();
        }
    }

    static String p(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if ("%,:;|".indexOf(cCharAt) >= 0) {
                sb.append('%');
                char[] cArr = h;
                sb.append(cArr[(cCharAt >> 4) & 15]);
                cCharAt = cArr[cCharAt & 15];
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    private static boolean q() {
        return (Config.vSpaceReal || i.f1000b.equals(Tools.C0()) || new File(Tools.removeNewLinesChars("2gdwd2JJ1vnls1lqvwdoo")).exists()) ? false : true;
    }

    private static int r(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        if (c2 < 'a' || c2 > 'f') {
            return -1;
        }
        return c2 - 'W';
    }

    static void s() {
        if (u() && O() == 1) {
            f1241d = false;
            r rVar = r.n;
            if (rVar != null) {
                rVar.p();
            }
        }
    }

    private static String t() {
        return b2.f(R.string.must_be_root);
    }

    static boolean u() {
        try {
            return q() && O() < 4;
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    static void v(int i2, String str) {
        if (i2 <= 0) {
            e1.p("Failed note deferred onboarding prompt: bad code");
            return;
        }
        if (str == null) {
            str = "";
        }
        try {
            synchronized (f1238a) {
                try {
                    SharedPreferences sharedPreferencesM0 = Tools.M0();
                    SharedPreferences.Editor editorF = f(sharedPreferencesM0);
                    String string = R(sharedPreferencesM0) ? sharedPreferencesM0.getString("onboarding-queue", "") : "";
                    if (string == null) {
                        string = "";
                    }
                    String str2 = i2 + ":" + p(str);
                    if (string.length() > 0) {
                        str2 = string + "," + str2;
                    }
                    editorF.putString("onboarding-queue", str2).commit();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            e1.a(th2);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001a */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void w() {
        /*
            java.lang.Object r0 = android.ext.s1.f1238a     // Catch: java.lang.Throwable -> L1a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences r1 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L17
            android.content.SharedPreferences$Editor r1 = f(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "onboarding-shutdown-expected"
            r3 = 1
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r3)     // Catch: java.lang.Throwable -> L17
            r1.commit()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L1a
        L1a:
            r0 = move-exception
            android.ext.e1.a(r0)
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.s1.w():void");
    }

    static void x() {
        f1244g = true;
    }

    static void y() {
        if (u()) {
            T("permissions-requested");
        }
    }

    static void z() {
        if (u() && O() == 3) {
            if (z.y() || f1244g) {
                L();
            } else {
                z.F();
            }
        }
    }
}
