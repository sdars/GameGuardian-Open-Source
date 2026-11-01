package android.ext;

import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map$Entry;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f745a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f746b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f747c = "su";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile int f749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f751g;
    private static int h;
    private static boolean i;
    private static e2$c j;

    static {
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        f747c = sharedPreferencesM0.getString("su", "su");
        f746b = sharedPreferencesM0.getBoolean("sh", false);
        f748d = new String[]{"/debug_ramdisk", "/sbin", "/su/bin", "/magisk/.core/bin", "/magisk/phh/bin", "/system/xbin"};
        f749e = 0;
        f750f = new Object();
        f751g = false;
        h = 0;
        i = false;
    }

    private static String b() {
        return c(new String[]{"/debug_ramdisk", "/vendor/bin", "/system/bin", "/bin", "/data/local", "/data/local/bin", "/system/sd/bin", "/system/bin/failsafe", "/system/bin/bstk", "/su/bin", "/magisk/.core/bin", "/magisk/phh/bin"});
    }

    private static String c(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length * 3);
        for (String str : strArr) {
            arrayList.add(str);
            if (str.contains("/bin")) {
                arrayList.add(str.replace("/bin", "/xbin"));
                arrayList.add(str.replace("/bin", "/sbin"));
            }
        }
        return TextUtils.join(":", arrayList);
    }

    private static void d(int i2) {
        e2$c e2_c;
        synchronized (f750f) {
            try {
                h = i2;
                f751g = true;
                i = false;
                e2_c = j;
                j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e2_c != null) {
            e2_c.a(i2);
        }
    }

    private static String e(String str, InputStream inputStream) {
        byte[] bArr;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        try {
            int iAvailable = inputStream.available();
            if (iAvailable > 0 && (i2 = inputStream.read((bArr = new byte[iAvailable]))) > 0) {
                sb.append(new String(Arrays.copyOf(bArr, i2)));
            }
        } catch (IOException e2) {
            sb.append(e2.toString());
        }
        sb.append('\n');
        return sb.toString();
    }

    private static String[] f(boolean z) {
        StringBuilder sb;
        Map<String, String> map = System.getenv();
        int size = map.size();
        String str = map.get("PATH");
        if (str == null) {
            size++;
        }
        String[] strArr = new String[size];
        int i2 = 0;
        for (Map$Entry<String, String> map$Entry : map.entrySet()) {
            String key = map$Entry.getKey();
            String value = map$Entry.getValue();
            if ("PATH".equals(key)) {
                if (z) {
                    sb = new StringBuilder();
                    sb.append(m());
                    sb.append(':');
                    sb.append(b());
                    sb.append(':');
                } else {
                    sb = new StringBuilder();
                    sb.append(value);
                    sb.append(':');
                    value = b();
                }
                sb.append(value);
                value = sb.toString();
            }
            strArr[i2] = key + '=' + value;
            i2++;
        }
        if (str == null) {
            strArr[i2] = "PATH=" + (z ? m() + ':' + b() : b());
        }
        return strArr;
    }

    public static String g(Process process) {
        StringBuilder sb = new StringBuilder();
        if (process != null) {
            sb.append(e("stdout", process.getInputStream()));
            sb.append(e("stderr", process.getErrorStream()));
            sb.append("exit value: ");
            try {
                sb.append(process.exitValue());
            } catch (IllegalThreadStateException unused) {
                sb.append("already run");
            }
            sb.append('\n');
        } else {
            sb.append("process is null\n");
        }
        return sb.toString();
    }

    static String h(String str) {
        if (Config.C) {
            return "sh";
        }
        return str != null ? str : f747c;
    }

    static void i(e2$c e2_c) {
        synchronized (f750f) {
            try {
                if (f751g) {
                    e2_c.a(h);
                    return;
                }
                j = e2_c;
                if (i) {
                    return;
                }
                i = true;
                new n0$i(new e2$b(), "RootProbe").start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static e2$d j(String str) {
        return p("exec id", 20, str);
    }

    static int k(String str) {
        try {
            e2$d e2_dJ = j(str);
            f745a = "";
            if (!e2_dJ.f758c) {
                e1.d("root probe refused: no root shell could be started");
                return -1;
            }
            if (e2_dJ.f757b) {
                e1.d("root probe unanswered: bound expired after 20s");
                return 0;
            }
            e1.d("root probe: " + e2_dJ.f756a);
            return e2_dJ.f756a.contains("uid=0") ? 1 : 0;
        } catch (Throwable th) {
            e1.l("Failed root probe", th);
            return 0;
        }
    }

    private static String l() {
        for (String str : f748d) {
            File file = new File(str, "su");
            if (file.isFile() && file.canExecute()) {
                e1.d("absolute su fallback selected: " + str);
                return file.getAbsolutePath();
            }
        }
        e1.d("no absolute su candidate usable; falling back to bare su");
        return "su";
    }

    private static String m() {
        return c(new String[]{"/debug_ramdisk", "/su/bin", "/magisk/.core/bin", "/magisk/phh/bin", "/system/xbin", "/system/sbin", "/system/bin/failsafe", "/system/bin/bstk", "/bin"});
    }

    public static String n(String str, int i2) {
        String strO = o(str, i2, null);
        f745a = "";
        return strO;
    }

    public static String o(String str, int i2, String str2) {
        return p(str, i2, str2).f756a;
    }

    private static e2$d p(String str, int i2, String str2) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean[] zArr = {false};
        f749e = 0;
        FutureTask futureTask = new FutureTask(new e2$a(str, str2, zArr, sb));
        new n0$i(futureTask, "runCmd: " + str).start();
        try {
            futureTask.get(i2, TimeUnit.SECONDS);
        } catch (ExecutionException e2) {
            e1.l("cmd (" + str + ") expection", e2);
            sb.append("expection: ");
            sb.append(e2.getMessage());
        } catch (TimeoutException e3) {
            e1.g("cmd (" + str + ") exit: timeout " + i2, e3);
            sb.append("timeout: ");
            sb.append(i2);
        }
        z = false;
        int i3 = f749e;
        if (i3 > 0) {
            try {
                e1.d("Kill: " + i3);
                Process.killProcess(i3);
                e1.d("Kill: ok");
            } catch (Throwable th) {
                e1.g("Failed kill", th);
            }
        }
        f749e = 0;
        return new e2$d(sb.toString(), z, zArr[0]);
    }

    public static Process q(String str) {
        return r(str, null, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x015b A[LOOP:1: B:37:0x0159->B:38:0x015b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0177 A[LOOP:0: B:19:0x00bd->B:42:0x0177, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x017b A[EDGE_INSN: B:50:0x017b->B:43:0x017b BREAK  A[LOOP:0: B:19:0x00bd->B:42:0x0177], SYNTHETIC] */
    public static Process r(String str, String str2, boolean z) {
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder();
        e1.d("try: " + str);
        if (!str.contains("exec") && !str.contains("exit")) {
            throw new RuntimeException("You forgot exec or exit");
        }
        if (str.contains("/emulated/0")) {
            e1.p("Possible bugged call to /emulated/0 from root: " + str);
        }
        sb.append("try: ");
        sb.append(str);
        sb.append('\n');
        String strH = h(str2);
        sb.append("su: ");
        sb.append(strH);
        sb.append('\n');
        if (Config.C || !f746b) {
            str3 = strH;
        } else {
            str = "exec " + strH + '\n' + str;
            str3 = "sh";
        }
        String[] strArr = {str3};
        e1.d("suCmd: '" + str2 + "'; su: '" + strH + "'; runBin: '" + str3 + '\'');
        Process processI = null;
        for (int i2 = 0; i2 < 2; i2++) {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalAccessException();
                }
                try {
                    e1.d("exec 1 start");
                    processI = Tools.J("su".equals(str3) ? new String[]{l()} : strArr, f("su".equals(str3)));
                    str4 = "exec 1 end: " + processI;
                } catch (Throwable th) {
                    for (th = th; th != null; th = th.getCause()) {
                        sb.append(th.toString());
                        sb.append('\n');
                    }
                    sb.append('\n');
                    sb.append(g(processI));
                }
                while (th != null) {
                    sb.append(th.toString());
                    sb.append('\n');
                }
                sb.append('\n');
                sb.append(g(processI));
                if (processI != null) {
                    break;
                }
            } else {
                e1.d("exec 0 start");
                processI = Tools.I(strArr);
                str4 = "exec 0 end: " + processI;
            }
            e1.d(str4);
            DataOutputStream dataOutputStream = new DataOutputStream(processI.getOutputStream());
            dataOutputStream.writeBytes(Tools.F0(str) + '\n');
            dataOutputStream.flush();
            sb.append("process started: " + i2 + '\n');
            if (processI != null) {
                break;
                break;
            }
        }
        e1.d("tryRoot end");
        if (z) {
            f745a = sb.toString();
        }
        return processI;
    }
}
