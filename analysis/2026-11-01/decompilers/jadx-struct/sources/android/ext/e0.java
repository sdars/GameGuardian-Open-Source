package android.ext;

import android.content.res.Resources;
import android.lang.ProcessBuilder;
import android.system.ErrnoException;
import android.system.Os;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f725b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile String f726c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile int f727d = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile char f728e = 'i';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile char f729f = 'g';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static StringBuilder f730g = new StringBuilder();
    public static StringBuilder h = new StringBuilder();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f731a = i();

    private static void a(ArrayList arrayList, String str, String str2, boolean z) {
        File file = new File(str);
        if (!z || file.exists()) {
            arrayList.add(new File(str + "/files", str2));
            arrayList.add(new File(str + "/cache", str2));
            arrayList.add(new File(str + "/files"));
            arrayList.add(new File(str + "/cache"));
            arrayList.add(file);
        }
    }

    private static void b(char c2) {
        c(Character.toString(c2));
    }

    private static void c(String str) {
        File file = new File(g(), r(str));
        if (file.isFile()) {
            return;
        }
        e1.d("Extract file " + file);
        Resources resources = Tools.f0().getResources();
        int iD = b2.d("ydw" + str, "raw");
        if (iD == 0) {
            e1.d("Nothing extract file " + str + ' ' + file.getAbsolutePath());
            return;
        }
        try {
            byte[] bArr = new byte[8192];
            InputStream inputStreamOpenRawResource = resources.openRawResource(iD);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                int i = inputStreamOpenRawResource.read(bArr);
                if (i <= 0) {
                    fileOutputStream.close();
                    inputStreamOpenRawResource.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            e1.g("Failed extract file " + str + ' ' + file.getAbsolutePath(), th);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0017. Please report as an issue. */
    private void d(char c2) {
        char c3;
        b(c2);
        try {
            if (c2 != '5') {
                if (c2 != '7' && c2 != '8') {
                    if (c2 != 'a' && c2 != 'b') {
                        switch (c2) {
                            case '2':
                                c("01");
                                b('4');
                                b('f');
                                f729f = 'f';
                                b('k');
                            case '0':
                            case '1':
                                b('3');
                                b('e');
                                f728e = 'e';
                                c3 = 'j';
                                break;
                        }
                        Tools.M("sh", new File(Tools.q0(), "sh.jar"));
                        return;
                    }
                    b('d');
                    b('i');
                    f728e = 'i';
                    c3 = 'o';
                }
                b(c3);
                Tools.M("sh", new File(Tools.q0(), "sh.jar"));
                return;
            }
            c("08");
            b('6');
            b('g');
            f729f = 'g';
            b('l');
            Tools.M("sh", new File(Tools.q0(), "sh.jar"));
            return;
        } catch (Throwable th) {
            e1.l("JVM fail", th);
            return;
        }
        b('9');
        b('h');
        f728e = 'h';
        c3 = 'n';
        b(c3);
    }

    private int e(String str) {
        Tools.j(str);
        for (int i = 0; i < 2; i++) {
            try {
                String[] strArr = new String[2];
                strArr[0] = Tools.F0(str);
                strArr[1] = Config.vSpaceReal ? Config.E : "1";
                Process processI = Tools.I(strArr);
                if (Tools.X1(processI, 30)) {
                    return processI.exitValue();
                }
                throw new RuntimeException("timeout: 30");
            } catch (IOException e2) {
                if (i == 0) {
                    try {
                        String message = e2.getMessage();
                        if (message != null && message.indexOf("denied") != -1) {
                            Tools.r(str, "0755");
                        }
                    } catch (Throwable th) {
                        e1.s("getArch: " + str, th);
                        h.append(th.toString());
                        return 100;
                    }
                }
                throw e2;
            }
        }
        return 100;
    }

    public static int f() {
        h();
        return f727d;
    }

    public static String g() {
        if (f726c == null) {
            File fileJ = j();
            if (fileJ == null) {
                fileJ = Tools.q0();
            }
            f726c = s(fileJ.getAbsolutePath());
        }
        return f726c;
    }

    public static String h() {
        if (f725b == null) {
            f725b = new e0().f731a;
        }
        return f725b;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x0053, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x008e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00d0, please report this as an issue */
    private String i() {
        String str;
        File file;
        int iE;
        char[] cArr = {0, '2', '1', '5', '8', 'b', '0', '7', 'a'};
        String strG = g();
        boolean z = true;
        char c2 = (Config.C && (Config.G == 1 || (Config.G == 0 && Config.E.contains("64")))) ? (char) 0 : (char) 2;
        for (int i = 0; i < cArr.length; i++) {
            if (i == 0) {
                for (int i2 = 1; i2 < cArr.length; i2++) {
                    if (new File(strG, q(cArr[i2])).exists()) {
                        cArr[0] = cArr[i2];
                        break;
                    }
                }
                if (cArr[0] == 0) {
                    continue;
                } else {
                    h.append(cArr[i]);
                    h.append(": ");
                    str = "0" + cArr[i];
                    file = new File(strG, r(str));
                    if (!file.isFile()) {
                        c(str);
                    }
                    if (file.isFile()) {
                        f730g.append(cArr[i]);
                        iE = e(file.getAbsolutePath());
                        if (!o(cArr[i], iE)) {
                            if (iE != 105 && iE != 102) {
                                z = false;
                            }
                            InOut.p(z);
                            f730g = new StringBuilder(0);
                            h = new StringBuilder(0);
                            String absolutePath = new File(strG, q(cArr[i])).getAbsolutePath();
                            e1.d("Daemon: " + absolutePath);
                            f727d = iE;
                            d(cArr[i]);
                            Tools.j(absolutePath);
                            return absolutePath;
                        }
                        e1.d("getArch " + cArr[i] + ' ' + iE);
                        h.append("; ");
                        h.append(iE);
                        h.append('\n');
                        if (c2 != 0 && (iE & 127) < 100) {
                            c2 = 1;
                        }
                    } else {
                        h.append(file);
                        h.append(" NF.\n");
                        e1.d("Not a file " + file + ' ' + file.getAbsolutePath());
                    }
                }
            } else {
                h.append(cArr[i]);
                h.append(": ");
                str = "0" + cArr[i];
                file = new File(strG, r(str));
                if (!file.isFile()) {
                    c(str);
                }
                if (file.isFile()) {
                    h.append(file);
                    h.append(" NF.\n");
                    e1.d("Not a file " + file + ' ' + file.getAbsolutePath());
                } else {
                    f730g.append(cArr[i]);
                    iE = e(file.getAbsolutePath());
                    if (!o(cArr[i], iE)) {
                        if (iE != 105) {
                            z = false;
                        }
                        InOut.p(z);
                        f730g = new StringBuilder(0);
                        h = new StringBuilder(0);
                        String absolutePath2 = new File(strG, q(cArr[i])).getAbsolutePath();
                        e1.d("Daemon: " + absolutePath2);
                        f727d = iE;
                        d(cArr[i]);
                        Tools.j(absolutePath2);
                        return absolutePath2;
                    }
                    e1.d("getArch " + cArr[i] + ' ' + iE);
                    h.append("; ");
                    h.append(iE);
                    h.append('\n');
                    if (c2 != 0) {
                    }
                }
            }
        }
        if (c2 == 1) {
            try {
                File file2 = new File(Tools.K0());
                if (n(file2)) {
                    file2 = Tools.f0().getExternalCacheDir();
                    if (n(file2)) {
                        file2 = Tools.f0().getExternalFilesDir(null);
                        if (n(file2)) {
                            file2 = new File("/sdcard");
                        }
                    }
                }
                File file3 = new File(file2, "gg_fixer.apk");
                if (file3.exists()) {
                    file3.delete();
                }
                Tools.M("fx", file3);
                n2.i(new e0$a(this, file3));
            } catch (Throwable th) {
                e1.s("Failed extract fx", th);
            }
        }
        f730g.append(';');
        String strF0 = Tools.F0(strG);
        String[] strArr = {"ls", "-l", strF0};
        try {
            h.append("\n\n");
            h.append("ls -l ");
            h.append(strF0);
            h.append(":\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Tools.I(strArr).getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.indexOf("lib") != -1 && line.indexOf(".so") != -1) {
                    e1.d("ls: " + line);
                    h.append(line);
                    h.append('\n');
                }
            }
            bufferedReader.close();
        } catch (Exception e2) {
            e1.s("ls: " + strF0, e2);
            h.append(e2);
            h.append('\n');
        }
        h.append('\n');
        return "no_binary_for_your_arch";
    }

    private static File j() {
        File fileP0 = Tools.p0();
        File fileB0 = Tools.b0();
        String strS0 = Tools.s0();
        ArrayList<File> arrayList = new ArrayList(64);
        arrayList.add(Tools.q0());
        arrayList.add(Tools.c0());
        arrayList.add(fileP0);
        arrayList.add(fileB0);
        arrayList.add(new File(fileP0.getParentFile(), strS0));
        arrayList.add(new File(fileB0.getParentFile(), strS0));
        arrayList.add(fileP0.getParentFile());
        arrayList.add(fileB0.getParentFile());
        String absolutePath = fileP0.getAbsolutePath();
        String str = absolutePath.startsWith("/data/user/") ? absolutePath.split("/", -1)[3] : "0";
        String str2 = absolutePath.startsWith("/data/user/") ? "/data/user/" + str + "/" : "/data/data/";
        if (Config.vSpaceReal) {
            String str3 = str2 + Config.E;
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append("/parallel_intl/0/");
            String str4 = i.f1002d;
            sb.append(str4);
            a(arrayList, sb.toString(), strS0, true);
            a(arrayList, str3 + "/parallel_lite/0/" + str4, strS0, true);
            a(arrayList, str3 + "/parallel_pro/0/" + str4, strS0, true);
            a(arrayList, str3 + "/virtual/data/user/0/" + str4, strS0, true);
            a(arrayList, str3 + "/gaia/data/user/0/" + str4, strS0, true);
            a(arrayList, str3 + "/com.vmos.glb/osimg/r/ot01/data/data/" + str4, strS0, true);
            a(arrayList, str3 + "/mopen/data/user/0/" + str4, strS0, true);
            a(arrayList, str3 + "/vbox/data/user/0/" + str4, strS0, true);
            a(arrayList, str3 + "/sandboxdata/" + str4, strS0, true);
            a(arrayList, str3 + "/gameplugins/" + str4, strS0, true);
            a(arrayList, str3 + "/Plugin/0/" + str4 + "/data/" + str4, strS0, true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("/data/user_de/");
            sb2.append(str);
            sb2.append("/");
            sb2.append(Config.E);
            a(arrayList, sb2.toString(), strS0, false);
            a(arrayList, str3, strS0, false);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            String str5 = i.f1002d;
            sb3.append(str5);
            a(arrayList, sb3.toString(), strS0, false);
            a(arrayList, "/data/user_de/" + str + "/" + str5, strS0, false);
            arrayList.add(new File("/data/data"));
            arrayList.add(new File("/data"));
        }
        for (File file : arrayList) {
            if (file != null) {
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (file.exists()) {
                    return file;
                }
                try {
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if ((Os.stat(absolutePath2).st_mode & 16384) != 0) {
                            return file;
                        }
                    } catch (Exception e2) {
                        e1.s(e2 instanceof ErrnoException ? "Errno for path '" + absolutePath2 + "': " + ((ErrnoException) e2).errno : "Exception for path '" + absolutePath2 + "'", e2);
                    }
                } catch (Throwable th) {
                    e1.a(th);
                }
            }
        }
        e1.p("Failed get dir for fix");
        return null;
    }

    public static String k(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("/lib");
        sb.append(z ? f729f : f728e);
        sb.append(".so");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0051, please report this as an issue */
    public static void l() {
        File file;
        StringBuilder sb;
        String str;
        char[] cArr = {0, 'q', 'p', 'r', 's', 't'};
        String strG = g();
        for (int i = 0; i < cArr.length; i++) {
            if (i == 0) {
                for (int i2 = 1; i2 < cArr.length; i2++) {
                    if (new File(strG, q(cArr[i2])).exists()) {
                        cArr[0] = cArr[i2];
                        break;
                    }
                }
                if (cArr[0] == 0) {
                    continue;
                } else {
                    file = new File(strG, q(cArr[i]));
                    if (!file.isFile()) {
                        b(cArr[i]);
                    }
                    if (!file.isFile()) {
                        try {
                            System.load(file.getAbsolutePath());
                            try {
                                ProcessBuilder.loaded();
                                return;
                            } catch (Throwable th) {
                                th = th;
                                sb = new StringBuilder();
                                str = "Failed check ";
                                sb.append(str);
                                sb.append(file);
                                sb.append(' ');
                                sb.append(file.getAbsolutePath());
                                e1.g(sb.toString(), th);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sb = new StringBuilder();
                            str = "Failed load ";
                        }
                    } else {
                        e1.d("Not a file " + file + ' ' + file.getAbsolutePath());
                    }
                }
            } else {
                file = new File(strG, q(cArr[i]));
                if (!file.isFile()) {
                    b(cArr[i]);
                }
                if (!file.isFile()) {
                    System.load(file.getAbsolutePath());
                    ProcessBuilder.loaded();
                    return;
                }
                e1.d("Not a file " + file + ' ' + file.getAbsolutePath());
            }
        }
    }

    public static boolean m() {
        return f() == 105;
    }

    private boolean n(File file) {
        if (file == null) {
            return true;
        }
        if (file.exists()) {
            return false;
        }
        file.mkdirs();
        return !file.exists();
    }

    private boolean o(char c2, int i) {
        if (c2 != '5') {
            if (c2 != '7') {
                if (c2 != '8') {
                    if (c2 != 'a') {
                        if (c2 != 'b') {
                            switch (c2) {
                                case '0':
                                    if (101 != i) {
                                        return false;
                                    }
                                    break;
                                case '1':
                                    if (101 != i) {
                                        return false;
                                    }
                                    break;
                                case '2':
                                    if (102 != i) {
                                        return false;
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("Unknown lib: " + c2);
                            }
                        } else if (103 != i) {
                            return false;
                        }
                    } else if (103 != i) {
                        return false;
                    }
                } else if (104 != i) {
                    return false;
                }
            } else if (104 != i) {
                return false;
            }
        } else if (105 != i) {
            return false;
        }
        return true;
    }

    public static boolean p() {
        int iF = f();
        return iF == 101 || iF == 102;
    }

    private static String q(char c2) {
        return r(Character.toString(c2));
    }

    private static String r(String str) {
        return "lib" + str + ".so";
    }

    private static String s(String str) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'd'};
        for (int i = 0; i < 13; i++) {
            File file = new File(str, q(cArr[i]));
            if (file.exists()) {
                String absolutePath = file.getAbsolutePath();
                if (!Tools.j(absolutePath)) {
                    e1.d("Can not execute " + absolutePath);
                }
            }
        }
        return str;
    }
}
