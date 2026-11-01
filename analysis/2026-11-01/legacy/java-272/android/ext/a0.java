package android.ext;

import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile String f569f = ";;";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f568e = j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f566c = "bugged-packages";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f567d = "bugged-uids";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f564a = "native_crash.txt";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f565b = " _QAZ_WSX_EDC_RFV_TGB_YHN_UJM_ ";

    public static boolean a(String str, String str2) {
        boolean z = f568e;
        if (!z || i.f1002d.equals(str)) {
            return false;
        }
        if (str.startsWith("uid:")) {
            if (str.equals("uid:" + Process.myUid())) {
                return false;
            }
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CNC[");
            sb.append(z ? '1' : '0');
            sb.append("] - n: ");
            sb.append(str2);
            sb.append("; ");
            sb.append(str);
            e1.d(sb.toString());
            if (!z) {
                return true;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(g());
            fileOutputStream.write(str.getBytes());
            fileOutputStream.write(f565b.getBytes());
            fileOutputStream.write((str2 + '\n' + h0.c()).getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (Throwable th) {
            e1.l("Failed n CNC", th);
            return true;
        }
    }

    public static void b(boolean z) {
        boolean z2 = f568e;
        if (z2 && z) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("CNC[");
                sb.append(z2 ? '1' : '0');
                sb.append("] - x");
                e1.d(sb.toString());
                if (z2) {
                    g().delete();
                }
            } catch (Throwable th) {
                e1.l("Failed x CNC", th);
            }
        }
    }

    public static String[] c() {
        if (f568e) {
            String strD = d();
            if (strD.length() > 0) {
                e1.d("BUGGED_PACKAGES: " + strD);
                return strD.split(";");
            }
        }
        return d.b.f1511a;
    }

    private static String d() {
        String strL = l(Tools.M0().getString(f566c, ""));
        if (strL.length() > 0) {
            f569f = ';' + strL + ';';
        }
        return strL;
    }

    public static String[] e() {
        if (f568e) {
            String strF = f();
            if (strF.length() > 0) {
                e1.d("BUGGED_UIDS: " + strF);
                return strF.split(";");
            }
        }
        return d.b.f1511a;
    }

    private static String f() {
        return l(Tools.M0().getString(f567d, ""));
    }

    private static File g() {
        File file = new File(Tools.q0(), Process.myPid() + f564a);
        try {
            file.getParentFile().mkdirs();
        } catch (Throwable th) {
            e1.l("Failed mkdirs CNC", th);
        }
        return file;
    }

    private static String[] h() {
        File[] fileArrListFiles;
        File parentFile = g().getParentFile();
        if (parentFile == null || (fileArrListFiles = parentFile.listFiles()) == null) {
            return null;
        }
        int length = fileArrListFiles.length;
        String[] strArr = new String[length * 2];
        for (int i = 0; i < length; i++) {
            File file = fileArrListFiles[i];
            if (file != null && file.getName().endsWith(f564a)) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[Math.min(((int) file.length()) + 8192, 102400)];
                    int i2 = fileInputStream.read(bArr);
                    fileInputStream.close();
                    if (i2 > 0) {
                        String[] strArrSplit = new String(bArr, 0, i2).split(f565b, 2);
                        if (strArrSplit.length == 2) {
                            int i3 = i * 2;
                            strArr[i3] = strArrSplit[0];
                            strArr[i3 + 1] = strArrSplit[1];
                        }
                    }
                } catch (Throwable th) {
                    e1.l("Failed read native crash", th);
                }
                file.delete();
            }
        }
        return strArr;
    }

    public static boolean i(String str) {
        if (!f568e) {
            return false;
        }
        return f569f.contains(';' + str + ';');
    }

    private static boolean j() {
        Throwable th;
        boolean z;
        boolean z2 = false;
        try {
            File file = new File("/system/lib/libandroidfw.so");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bytes = "_ZN7android12AssetManager10getPkgNameEPKc".getBytes();
                byte[] bArr = new byte[8192];
                int length = bytes.length;
                int i = 0;
                z = false;
                while (true) {
                    try {
                        int i2 = fileInputStream.read(bArr, i, 8192 - i);
                        if (i2 <= 0) {
                            break;
                        }
                        i += i2;
                        if (i >= length) {
                            int i3 = (i - length) + 1;
                            for (int i4 = 0; i4 < i3; i4++) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        z = true;
                                        break;
                                    }
                                    if (bArr[i4 + i5] != bytes[i5]) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                            if (z) {
                                break;
                            }
                            int i6 = length - 1;
                            for (int i7 = 0; i7 < i6; i7++) {
                                bArr[i7] = bArr[(i - i6) + i7];
                            }
                            i = i6;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                z2 = z;
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    z = z2;
                    th = th3;
                    e1.s("Failed detect CM13", th);
                    z2 = z;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            z = false;
        }
        e1.d("CM13: " + z2);
        return z2;
    }

    public static void k() {
        e1.d("lLC - 1");
        d();
        f();
        String[] strArrH = h();
        if (strArrH != null) {
            int length = strArrH.length;
            for (int i = 0; i < length; i += 2) {
                String str = strArrH[i];
                if (str != null) {
                    e1.i("Bad package: '" + str + "' " + strArrH[i + 1]);
                    String str2 = f566c;
                    if (str.contains("uid:")) {
                        str2 = f567d;
                        str = str.split(":", -1)[1];
                    }
                    SharedPreferences sharedPreferencesM0 = Tools.M0();
                    String string = sharedPreferencesM0.getString(str2, "");
                    if (string != null && string.length() != 0) {
                        str = (';' + string + ';').contains(';' + str + ';') ? string : string + ';' + str;
                    }
                    sharedPreferencesM0.edit().putString(str2, l(str)).commit();
                }
            }
        }
        d();
        f();
        e1.d("lLC - 0");
    }

    private static String l(String str) {
        ArrayList arrayList = new ArrayList(new HashSet(Arrays.asList(str.split(";"))));
        return TextUtils.join(";", arrayList.toArray(new String[arrayList.size()]));
    }
}
