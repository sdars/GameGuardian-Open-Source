package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import catch_.me_.if_.you_.can_.R$string;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class x2 {
    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    public static InputStream a(String str, int i) {
        String str2;
        String str3 = Tools.K0() + "/tmp.file.tmp";
        File externalFilesDir = Tools.f0().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            externalFilesDir.mkdirs();
            if (externalFilesDir.exists()) {
                str2 = externalFilesDir.getAbsolutePath() + "/tmp.file.tmp";
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str3;
        }
        String[][] strArr = {new String[]{"exec cat " + str, null}, new String[]{"exec dalvikvm -cp " + Tools.W() + ' ' + Cat.class.getName() + ' ' + str, null}, new String[]{"exec cp " + str + ' ' + str2, str2}, new String[]{"exec cp " + str + ' ' + str3, str3}, new String[]{"exec cp " + str + ' ' + str2.replace("/emulated/0", "/emulated/legacy"), str2}};
        if (i >= 5) {
            return null;
        }
        String[] strArr2 = strArr[i];
        Process processQ = e2.q(strArr2[0]);
        if (processQ == null) {
            e1.p("Failed run " + Arrays.toString(strArr2));
            return null;
        }
        try {
            if (strArr2[1] == null) {
                return processQ.getInputStream();
            }
            try {
                processQ.waitFor();
            } catch (InterruptedException e2) {
                e1.s("Wait fail: " + strArr2[0], e2);
            }
            return new x2$g(strArr2[1], strArr2[1]);
        } catch (IOException e3) {
            e1.s("Failed read xml", e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00d8 A[SYNTHETIC] */
    private static void b(File file, File file2, String str) {
        int i;
        int i2 = 0;
        while (true) {
            int i3 = 10;
            if (i2 >= 10) {
                return;
            }
            InputStream inputStreamI = i(file.getAbsolutePath(), i2);
            if (inputStreamI != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamI));
                int i4 = 0;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            break;
                        }
                        i4++;
                        if (!line.endsWith("_preferences.xml") && line.endsWith(".xml")) {
                            File file3 = line.startsWith("/") ? new File(line) : new File(file, line);
                            String name = file3.getName();
                            try {
                                if (!name.equals(str) && !name.equals("DefaultStorage.xml")) {
                                    try {
                                        File file4 = new File(file2, file3.getName());
                                        file2.mkdirs();
                                        if (!file4.exists()) {
                                            int i5 = 0;
                                            while (i5 < i3) {
                                                InputStream inputStreamA = a(file3.getAbsolutePath(), i5);
                                                if (inputStreamA != null) {
                                                    try {
                                                        byte[] bArr = new byte[8192];
                                                        FileOutputStream fileOutputStream = new FileOutputStream(file4);
                                                        i = 0;
                                                        while (true) {
                                                            try {
                                                                int i6 = inputStreamA.read(bArr);
                                                                if (i6 != -1) {
                                                                    fileOutputStream.write(bArr, 0, i6);
                                                                    i += i6;
                                                                } else {
                                                                    try {
                                                                        break;
                                                                    } catch (IOException e2) {
                                                                        e = e2;
                                                                        e1.s("Failed read data from " + file3, e);
                                                                    }
                                                                }
                                                                if (i > 0) {
                                                                    break;
                                                                }
                                                            } catch (Throwable th) {
                                                                fileOutputStream.close();
                                                                throw th;
                                                            }
                                                            e = e2;
                                                            e1.s("Failed read data from " + file3, e);
                                                        }
                                                        fileOutputStream.close();
                                                        inputStreamA.close();
                                                    } catch (IOException e3) {
                                                        e = e3;
                                                        i = 0;
                                                    }
                                                    if (i > 0) {
                                                        break;
                                                        break;
                                                    }
                                                }
                                                i5++;
                                                i3 = 10;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        e1.s("Failed read list from " + file, th);
                                        if (i4 > 0) {
                                            return;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        i3 = 10;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                if (i4 > 0) {
                    return;
                }
            }
            i2++;
        }
    }

    private static boolean c(a.e eVar) {
        File fileG = g(MainService.G0);
        boolean zD = false;
        if (h()) {
            return false;
        }
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        HashMap map = new HashMap(sharedPreferencesM0.getAll());
        SharedPreferences$Editor sharedPreferences$EditorEdit = sharedPreferencesM0.edit();
        String absolutePath = fileG.getAbsolutePath();
        String strC0 = Tools.C0();
        File fileG2 = g("DefaultStorage");
        if (fileG2.exists()) {
            zD = d(absolutePath, strC0, fileG, map, sharedPreferences$EditorEdit, strC0, true);
            fileG2.delete();
        }
        boolean z = zD;
        for (int size = eVar.size() - 1; size >= 0; size--) {
            if (d(absolutePath, strC0, fileG, map, sharedPreferences$EditorEdit, ((x2$h) eVar.valueAt(size)).f1323a, false)) {
                z = true;
            }
        }
        e1.d("New: " + n(sharedPreferences$EditorEdit, map) + " from " + map.size());
        sharedPreferences$EditorEdit.putBoolean("installed", true).commit();
        return z;
    }

    private static boolean d(String str, String str2, File file, Map map, SharedPreferences$Editor sharedPreferences$Editor, String str3, boolean z) {
        String strReplace = str.replace(str2, str3);
        int i = 0;
        if (!z && str.equals(strReplace)) {
            return false;
        }
        if (!z) {
            b(new File(strReplace).getParentFile(), file.getParentFile(), MainService.G0.replace(str2, str3));
        }
        HashMap mapK = z ? null : k(strReplace);
        if (mapK == null && (mapK = k(str.replace(MainService.G0, "DefaultStorage").replace(str2, str3))) == null) {
            return false;
        }
        Iterator it = mapK.entrySet().iterator();
        while (it.hasNext()) {
            if (!map.containsKey(((Map$Entry) it.next()).getKey())) {
                i++;
            }
        }
        e1.d("Copy: " + n(sharedPreferences$Editor, mapK) + " from " + mapK.size() + " new " + i);
        return true;
    }

    private static a.e e(String str) {
        int i;
        a.e eVar = new a.e();
        if (str != null && str.length() != 0) {
            for (String str2 : str.split(";")) {
                int iIndexOf = str2.indexOf(124);
                int iIndexOf2 = iIndexOf < 0 ? -1 : str2.indexOf(124, iIndexOf + 1);
                if (iIndexOf >= 0 && iIndexOf2 >= 0) {
                    try {
                        i = Integer.parseInt(str2.substring(iIndexOf + 1, iIndexOf2));
                    } catch (NumberFormatException e2) {
                        e1.s("Failed parse deferred old version code", e2);
                        i = 0;
                    }
                    eVar.put(eVar.size(), new x2$h(s1.S(str2.substring(0, iIndexOf)), i, s1.S(str2.substring(iIndexOf2 + 1))));
                }
            }
        }
        return eVar;
    }

    private static String f(a.e eVar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < eVar.size(); i++) {
            x2$h x2_h = (x2$h) eVar.valueAt(i);
            if (x2_h != null && x2_h.f1323a != null) {
                if (sb.length() > 0) {
                    sb.append(';');
                }
                sb.append(s1.p(x2_h.f1323a));
                sb.append('|');
                sb.append(x2_h.f1324b);
                sb.append('|');
                String str = x2_h.f1325c;
                if (str == null) {
                    str = "";
                }
                sb.append(s1.p(str));
            }
        }
        return sb.toString();
    }

    public static File g(String str) {
        File file;
        Context context = MainService.context;
        try {
            if (Build$VERSION.SDK_INT >= 24) {
                try {
                    file = (File) context.getClass().getMethod("getSharedPreferencesPath", String.class).invoke(context, str);
                } catch (Throwable th) {
                    e1.s("Failed call getSharedPreferencesPath", th);
                    file = null;
                }
            } else {
                file = null;
            }
            return file == null ? (File) context.getClass().getMethod("getSharedPrefsFile", String.class).invoke(context, str) : file;
        } catch (Throwable th2) {
            e1.s("Failed call getSharedPrefsFile", th2);
            return new File(Tools.p0(), "../shared_prefs/" + str + ".xml");
        }
    }

    public static boolean h() {
        return Tools.M0().getBoolean("installed", false);
    }

    public static InputStream i(String str, int i) {
        String[] strArr = {"exec ls " + str, "exec dalvikvm -cp " + Tools.W() + ' ' + Ls.class.getName() + ' ' + str};
        if (i >= 2) {
            return null;
        }
        String str2 = strArr[i];
        Process processQ = e2.q(str2);
        if (processQ != null) {
            return processQ.getInputStream();
        }
        e1.p("Failed run " + str2);
        return null;
    }

    private static final String j(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return Tools.l(messageDigest.digest());
        } catch (Throwable th) {
            e1.s("Failed check old versions", th);
            return null;
        }
    }

    public static HashMap k(String str) {
        HashMap mapA = null;
        for (int i = 0; i < 10; i++) {
            try {
                InputStream inputStreamA = a(str, i);
                if (inputStreamA != null) {
                    x2$i x2_i = new x2$i(inputStreamA);
                    try {
                        mapA = b.b.a(x2_i);
                    } catch (Throwable th) {
                        e1.s("Fail: " + str, th);
                        e1.p("Last data: " + x2_i.a());
                    }
                    x2_i.close();
                    if (mapA != null) {
                        break;
                    }
                }
            } catch (IOException e2) {
                e1.s("Failed read xml", e2);
            }
        }
        if (mapA == null) {
            try {
                e2.n("exec ls -l " + str, 10);
            } catch (Throwable th2) {
                e1.s("Failed check xml", th2);
            }
        }
        return mapA;
    }

    private static void l(a.e eVar) {
        m(eVar, null);
    }

    private static boolean m(a.e eVar, Runnable runnable) {
        boolean[] zArr = new boolean[1];
        AlertDialog alertDialogCreate = f.b().setCustomTitle(Tools.g0(R$string.app_name)).setMessage(b2.f(R$string.exit_confirm)).setPositiveButton(b2.f(R$string.restart), new x2$b(zArr, new p0(1300, true))).setNegativeButton(b2.f(R$string.skip), new x2$a(eVar, runnable, zArr)).setCancelable(false).create();
        if (runnable != null) {
            f.k(alertDialogCreate, new x2$c(zArr, runnable));
        }
        f.m(alertDialogCreate);
        return true;
    }

    private static int n(SharedPreferences$Editor sharedPreferences$Editor, Map map) {
        int i = 0;
        for (Map$Entry map$Entry : map.entrySet()) {
            Object value = map$Entry.getValue();
            if (value instanceof Boolean) {
                sharedPreferences$Editor.putBoolean((String) map$Entry.getKey(), ((Boolean) map$Entry.getValue()).booleanValue());
                i++;
            }
            if (value instanceof Float) {
                sharedPreferences$Editor.putFloat((String) map$Entry.getKey(), ((Float) map$Entry.getValue()).floatValue());
                i++;
            }
            if (value instanceof Integer) {
                sharedPreferences$Editor.putInt((String) map$Entry.getKey(), ((Integer) map$Entry.getValue()).intValue());
                i++;
            }
            if (value instanceof Long) {
                sharedPreferences$Editor.putLong((String) map$Entry.getKey(), ((Long) map$Entry.getValue()).longValue());
                i++;
            }
            if (value instanceof String) {
                sharedPreferences$Editor.putString((String) map$Entry.getKey(), (String) map$Entry.getValue());
                i++;
            }
            if (value instanceof Set) {
                sharedPreferences$Editor.putStringSet((String) map$Entry.getKey(), (Set) map$Entry.getValue());
                i++;
            }
        }
        return i;
    }

    static boolean o(String str, Runnable runnable) {
        a.e eVarE = e(str);
        if (eVarE.size() == 0) {
            return false;
        }
        return r(eVarE, runnable);
    }

    static boolean p(String str, Runnable runnable) {
        a.e eVarE = e(str);
        if (eVarE.size() == 0) {
            return false;
        }
        return m(eVarE, runnable);
    }

    static void q(a.e eVar) {
        r(eVar, null);
    }

    static boolean r(a.e eVar, Runnable runnable) {
        String str;
        PackageInfo packageInfoZ0;
        float f2 = 1;
        int i = (int) (((16391.2f * f2) - 236.2f) + 0.5f);
        int i2 = 0;
        while (i2 < eVar.size()) {
            x2$h x2_h = (x2$h) eVar.valueAt(i2);
            if ((x2_h.f1324b == i && !i.f1000b.equals(x2_h.f1323a)) || !Tools.e1(x2_h.f1323a)) {
                eVar.removeAt(i2);
                i2--;
                e1.d("Un: ignore: " + x2_h.f1323a + ' ' + x2_h.f1324b);
            }
            i2++;
        }
        if (eVar.size() == 0) {
            str = "Un: empty";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(b2.f(R$string.found_old_version));
            int i3 = 0;
            while (true) {
                if (i3 >= eVar.size()) {
                    break;
                }
                x2$h x2_h2 = (x2$h) eVar.valueAt(i3);
                sb.append("\n\n");
                try {
                    packageInfoZ0 = Tools.z0(x2_h2.f1323a);
                } catch (PackageManager$NameNotFoundException e2) {
                    e1.l("Package not found: " + x2_h2.f1323a, e2);
                    packageInfoZ0 = null;
                }
                if (packageInfoZ0 != null) {
                    ApplicationInfo applicationInfo = packageInfoZ0.applicationInfo;
                    sb.append(applicationInfo != null ? Tools.a0(applicationInfo) : null);
                    sb.append(" (");
                    sb.append(x2_h2.f1323a);
                    sb.append(") - ");
                    sb.append(x2_h2.f1325c.length() > 0 ? x2_h2.f1325c : packageInfoZ0.versionName);
                    sb.append(" (");
                    int i4 = x2_h2.f1324b;
                    if (i4 <= 0) {
                        i4 = packageInfoZ0.versionCode;
                    }
                    sb.append(i4);
                    sb.append(')');
                } else {
                    sb.append(x2_h2.f1323a);
                    sb.append(" - ");
                    sb.append(x2_h2.f1324b);
                }
                i3++;
            }
            e1.d("Un: alert: " + eVar.size());
            String string = sb.toString();
            int iHashCode = ((int) (((f2 * 17734.3f) - 1579.3f) + 0.5f)) ^ string.hashCode();
            if (iHashCode != Tools.M0().getInt("skip-old", 0)) {
                x2$d x2_d = new x2$d(iHashCode, eVar);
                AlertDialog alertDialogCreate = f.b().setCustomTitle(Tools.g0(R$string.old_version)).setMessage(string).setCancelable(false).setPositiveButton(b2.f(R$string.yes), x2_d).setNeutralButton(b2.f(R$string.skip), x2_d).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null).create();
                if (runnable != null) {
                    f.k(alertDialogCreate, new x2$e(runnable));
                }
                f.m(alertDialogCreate);
                return true;
            }
            str = "Un: skip";
        }
        e1.d(str);
        return false;
    }

    public static void s(String str, Runnable runnable) {
        if (!Tools.e1(str)) {
            e1.d(runnable + ": 50");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (runnable == null) {
            t(str);
            return;
        }
        e1.d(runnable + ": 60");
        try {
            e2.n("exec pm uninstall --user -1 " + str, 45);
        } catch (Throwable th) {
            e1.l("run cmd fail", th);
        }
        e1.d(runnable + ": 70");
        if (Tools.e1(str)) {
            try {
                e2.n("exec pm uninstall " + str, 45);
            } catch (Throwable th2) {
                e1.l("run cmd fail", th2);
            }
        }
        e1.d(runnable + ": 80");
        if (Tools.e1(str)) {
            f.r(f.c(r.p).setMessage(b2.f(R$string.need_uninstall)).setPositiveButton(b2.f(R$string.ok), new x2$f(runnable, str)).create(), runnable, true);
            return;
        }
        e1.d(runnable + ": 110");
        runnable.run();
    }

    static boolean t(String str) {
        for (Intent intent : b1.k0(str)) {
            try {
                Tools.f0().startActivity(intent);
                return true;
            } catch (Throwable th) {
                e1.l("intent fail", th);
            }
        }
        return false;
    }

    public static void u(w wVar, boolean z) {
        String[] strArr = {"df1e68bf2355bb69260b6efaa7fdacc1", "f63d4ea576f8d71e0963de6834e0c219", "b333d385ec3aeaaf7598031a42f99961", "f6d10cdcc825ab580f2fbb8ae2752990", "6c188a31fe500c3ada0914215e7df3b3", "4aa610afe8a9f409d98e62b4ed2ef780", "bbc0c87ac43ea5b61f59d6607a1eaf84", "70fb9cca0e11cb09250a11ba0c23b4c2", "b4d8929ffb0484d60369dd2c2e5c919d", "1517a1932503e400deef335e1d331593", "761cf7c032752696b26cd60ea3f3d74d", "1027157cbd6831cfebb80321570bb784", "8791855c8c65cb6a950f34ec0b093668", "a517cf7078e7e9b25ae975b4bdb2cc65", "b4ab3afbb70f23f600d048be0e8d49b2", "bd2173c6afb552fae3d9428756430123", "9bcf2de327544b17352830f9b004b229", "94d8ee3a7d26aa70f473e0ac8845b040", "d6683c02b361fed6c0ece0338921cf2b", "2cba6ddcf12910bc651455907da1fa00", "95760d2d26320be5d407e9823fd089ea", "db2aaa81ea92a69ae45642d0f5142c24", "6e513de086b0378f970968445a5da263", "60ee44a5be7a862f6615d5b68ca0d017", "0e41efb62a276c61f7b2253a1cb70c96", "3534ed8e94149e09012244b0053f387c", "7e146f369544a77f5bd3dcaa498a1e93", "5ff0619a03b5424a273491e365b6356a", "7abdd4c0904fe8f0a78424f971ff52f4", "4be2ea55d617fc0362440a93ae8a0bda", "25a4c4b1be1822ea6b990582e5038364", "b3ea34ef077e6fb86332e03b5321b28c", "ff748cbd537fd83894360f37ac9ccb03", "1353d43dff30877182f5d709e282d224"};
        a.e eVar = new a.e();
        wVar.j();
        int i = (int) (((1 * 16327.1f) - 172.1f) + 0.5f);
        String strC0 = Tools.C0();
        int iK = wVar.k() / 9;
        HashMap map = z ? new HashMap() : null;
        int i2 = 0;
        while (true) {
            try {
                int iF = wVar.f();
                if (iF < 0 || iF > 1024) {
                    e1.l("Bad pkg length: " + iF, new RuntimeException());
                    break;
                }
                if (iF == 0) {
                    break;
                }
                int iF2 = wVar.f();
                int iF3 = wVar.f();
                String strI = wVar.i(iF, null);
                String strI2 = wVar.i(wVar.e(), null);
                if (z) {
                    map.put(strI, Integer.valueOf(iF3));
                }
                if (!strC0.equals(strI)) {
                    if (iF2 <= 0) {
                        if (strI.equals(i.f1000b)) {
                            eVar.put((iK * i) + 1, new x2$h(strI, iF2, strI2));
                        }
                        String strJ = j(strI);
                        for (int i3 = 33; i3 >= 0; i3--) {
                            if (strArr[i3].equalsIgnoreCase(strJ)) {
                                eVar.put((35 - i3) + (iK * i), new x2$h(strI, iF2, strI2));
                                break;
                            }
                        }
                    } else if (iF2 <= i) {
                        eVar.put(((i - iF2) * iK) + i2, new x2$h(strI, iF2, strI2));
                        i2++;
                    }
                }
            } catch (IOException e2) {
                e1.l("???", e2);
                String str = eVar.size() == 0 ? "Un: what?" : "Un: drain owns recovery";
                e1.d(str);
                return;
            }
        }
        if (z) {
            z1.j = map;
        }
        boolean z2 = !h();
        e1.d("Un: copy " + eVar.size());
        boolean zC = c(eVar);
        if (s1.u()) {
            String strF = f(eVar);
            if (zC) {
                e1.d("Un: defer restart");
                s1.v(1, strF);
                return;
            } else {
                e1.d("Un: defer show");
                s1.v(2, strF);
                return;
            }
        }
        if (s1.n()) {
            e1.d(str);
            return;
        }
        if (zC) {
            e1.d("Un: restart?");
            l(eVar);
        } else {
            e1.d("Un: show");
            q(eVar);
        }
        if (z2 && h()) {
            e1.d("Un: faq");
            f1.q(Tools.f0());
        }
    }
}
