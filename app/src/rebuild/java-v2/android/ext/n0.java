package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.widget.Toast;
import catch_.me_.if_.you_.can_.R;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class n0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Throwable f1100c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f1101d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f1102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1103b;

    class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f1105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f1107d;

        a(String str, String[] strArr, int i, Runnable runnable) {
            this.f1104a = str;
            this.f1105b = strArr;
            this.f1106c = i;
            this.f1107d = runnable;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                z2.c(this.f1104a);
                Tools.H1(R.string.thank_you);
            }
            if (i == -3) {
                Tools.i1(this.f1105b[this.f1106c + 1]);
            }
            this.f1107d.run();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f1108a;

        b(SharedPreferences sharedPreferences) {
            this.f1108a = sharedPreferences;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1108a.edit().remove("last_exception").commit();
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f1109a;

        c(File file) {
            this.f1109a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1109a.delete();
        }
    }

    class d implements DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String absolutePath;
            try {
                absolutePath = Tools.f0().getFilesDir().getAbsolutePath();
            } catch (Throwable th) {
                e1.s("Failed get files dir", th);
                absolutePath = "error";
            }
            ConfigListAdapter.a(absolutePath);
        }
    }

    class e implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f1110a;

        e(String[] strArr) {
            this.f1110a = strArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                e2.n("exec setprop persist.sys.whetstone.level 0", 15);
                Tools.J1(b2.g(this.f1110a[8] + ": " + b2.f(R.string.ok)));
            } catch (Throwable unused) {
                e1.p("Failed fix " + this.f1110a[8]);
                Tools.J1(b2.g(this.f1110a[8] + ": " + b2.f(R.string.patch_failed)));
            }
        }
    }

    class f implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f1111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1112b;

        f(String[] strArr, int i) {
            this.f1111a = strArr;
            this.f1112b = i;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Tools.i1(this.f1111a[(this.f1112b * 2) + 1]);
        }
    }

    class g extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1113a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2) {
            super(str);
            this.f1113a = str2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Looper.prepare();
                p2.j(Toast.makeText(p2.h(), this.f1113a, 1));
                Looper.loop();
            } catch (Throwable unused) {
            }
        }
    }

    public static class h extends RuntimeException {
        public h(String str) {
            super(str);
        }
    }

    public static class i extends Thread {
        public i(Runnable runnable, String str) {
            super(runnable, str);
            n0.g(this);
        }
    }

    private n0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, String str) {
        this.f1102a = uncaughtExceptionHandler;
        this.f1103b = str;
    }

    private static void a(String str, int i2, DialogInterface.OnClickListener onClickListener) {
        String[] strArrE = e();
        StringBuilder sb = new StringBuilder();
        int i3 = i2 * 2;
        sb.append(strArrE[i3]);
        sb.append(" is reason of last fail");
        e1.p(sb.toString());
        AlertDialog.Builder negativeButton = android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.last_run_failed)).setMessage(Tools.L1(b2.f(R.string.killed_by), strArrE[i3]) + "\n\n" + str).setNeutralButton(b2.f(R.string.more), new f(strArrE, i2)).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null);
        if (onClickListener != null) {
            negativeButton.setPositiveButton(b2.f(R.string.fix_it), onClickListener);
        }
        android.ext.f.s(negativeButton);
    }

    public static void b() {
        c();
        try {
            SharedPreferences sharedPreferencesM0 = Tools.M0();
            if (sharedPreferencesM0.contains("last_exception")) {
                j(sharedPreferencesM0.getString("last_exception", "- unknown -"), sharedPreferencesM0.getString("last_exception_trace", "- unknown -"), new b(sharedPreferencesM0));
            }
        } catch (StackOverflowError e2) {
            e1.a(e2);
        }
        try {
            File file = new File(Tools.q0(), "store_ex.txt");
            if (file.exists()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            String[] strArrSplit = sb.toString().split("@#%~~%#@", 2);
                            j(strArrSplit[0], strArrSplit[1], new c(file));
                            return;
                        }
                        sb.append(line);
                        sb.append('\n');
                        e1.a(e);
                    }
                } catch (IOException e3) {
                    e1.l("Failed load exception", e3);
                }
            }
        } catch (StackOverflowError e4) {
            e1.a(e4);
        }
    }

    private static void c() {
        String str;
        String line;
        File file = new File(Tools.q0(), "client_crash.log");
        if ((Config.f30c & 64) == 0 && file.exists() && file.length() > 0) {
            try {
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    while (!Thread.interrupted() && (line = bufferedReader.readLine()) != null) {
                        if (!z) {
                            String strT = f0.T();
                            if (line.contains(strT) && !line.trim().equals(strT)) {
                                z = true;
                            }
                            e1.p("Native crash check fail.");
                            break;
                        }
                        sb.append(line);
                        sb.append('\n');
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    sb.append(th.getMessage());
                    sb.append('\n');
                    e1.s("Native crash load fail.", th);
                }
                if (z) {
                    String string = sb.toString();
                    if (d(string)) {
                        e1.p("Native crash detected: " + file.length() + " bytes, known reason.");
                    } else {
                        if (string.contains(">>> " + Tools.C0() + " <<<") && string.contains("backtrace:")) {
                            e1.p("Native crash detected: " + file.length() + " bytes.");
                            e1.p("Native crash sended.");
                            i(string);
                        } else {
                            str = "Native crash not detected: " + file.length() + " bytes spooled without a native backtrace, discarded.";
                        }
                    }
                    file.delete();
                } else {
                    str = "Native crash not detected: " + file.length() + " bytes spool failed the header check, discarded.";
                }
                e1.d(str);
                file.delete();
            } catch (Throwable th2) {
                e1.s("Native crash check file fail.", th2);
            }
        }
        try {
            new File(Tools.q0(), "client_exit").delete();
        } catch (Throwable th3) {
            e1.s("Native crash clear exit mark fail.", th3);
        }
        try {
            file.createNewFile();
        } catch (Throwable th4) {
            e1.s("Native crash create file fail.", th4);
        }
    }

    public static boolean d(String str) {
        String[] strArrE = e();
        if (str.contains(" Process  (") && str.contains(") has open file /")) {
            e1.p("unmount is reason of last fail");
            android.ext.f.s(android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.last_run_failed)).setMessage(b2.f(R.string.unmount_kill) + "\n\n" + str).setPositiveButton(b2.f(R.string.fix_it), new d()).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
            return true;
        }
        if (str.contains("CZAutoRunController")) {
            a(str, 3, new r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25<70krz0wr0uxq0lq0skrhql{rv0jdphjxdugldq2"));
            return true;
        }
        if (str.contains(strArrE[8])) {
            a(str, 4, new e(strArrE));
            return true;
        }
        if (!str.contains(strArrE[10])) {
            return false;
        }
        a(str, 5, null);
        return true;
    }

    public static String[] e() {
        return new String[]{"XPrivacy", "biz.bokhorst.xprivacy", "Prevent Running", "me.piebridge.forcestopgb", "Brevent", "me.piebridge.brevent", "Security", "com.chaozhuo.permission.controller", "Whetstone", "com.miui.whetstone", "NeoSafe", "cn.nubia.security2"};
    }

    public static void f() {
        g(Thread.currentThread());
    }

    public static void g(Thread thread) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == null || !(defaultUncaughtExceptionHandler instanceof n0)) {
            Thread.setDefaultUncaughtExceptionHandler(new n0(defaultUncaughtExceptionHandler, "default"));
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler == null || !(uncaughtExceptionHandler instanceof n0)) {
            if (uncaughtExceptionHandler == null) {
                uncaughtExceptionHandler = thread.getThreadGroup();
            }
            thread.setUncaughtExceptionHandler(new n0(uncaughtExceptionHandler, "thread:" + thread.getName()));
        }
    }

    public static String h(Thread thread, Throwable th, boolean z) {
        StringBuilder sb;
        String str;
        String strRemoveNewLinesChars = Tools.removeNewLinesChars("JJ#fudvkhg");
        String name = thread.getName();
        if (z) {
            e1.l("Exception in thread " + name, th);
            e1.c();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GG: ");
        float f2 = 1;
        sb2.append((110.5f * f2) - 9.1f);
        sb2.append(" [");
        sb2.append((int) (((16577.3f * f2) - 422.3f) + 0.5f));
        sb2.append("]\nAndroid: ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append("\nSDK: ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("\nvSpace: ");
        sb2.append(f1.x());
        sb2.append("\nThread: ");
        sb2.append(name);
        sb2.append('\n');
        String strN = e1.n(th);
        boolean z2 = ((th instanceof StackOverflowError) || strN.contains("java.lang.StackOverflowError")) && strN.contains("com.lody.virtual.client.ipc.");
        sb2.append(strN);
        if (strN.contains("ActivityNotFoundException")) {
            Tools.B(android.ext.i.f1002d, sb2);
        }
        sb2.append("\nHash: ");
        try {
            sb2.append(b1.X());
        } catch (Throwable th2) {
            sb2.append("???");
            e1.l("dbg", th2);
        }
        String string = sb2.toString();
        boolean z3 = Tools.f0() != null;
        boolean z4 = string.contains("EGL_") || string.contains("egl") || string.contains("HardwareRenderer");
        if (z && z3 && z4 && (Config.B & 2) != 0) {
            Config.b(R.id.config_acceleration).f42d = 0;
            Config.k();
            sb = new StringBuilder();
            sb.append(strRemoveNewLinesChars);
            str = ". Hardware acceleration fail.";
        } else {
            if (z && z4 && (Config.B & 2) == 0 && r.l) {
                String str2 = strRemoveNewLinesChars + ". Hardware acceleration fail. Try use 'GG (SW)' icon for start.";
                f1101d = true;
                r.l = false;
                return str2;
            }
            if (z && z3 && string.contains("Suggestion") && (Config.B & 8) != 0) {
                Config.b(R.id.config_suggestions).f42d = 0;
                Config.k();
                sb = new StringBuilder();
                sb.append(strRemoveNewLinesChars);
                str = ". Cause: suggestions.";
            } else {
                if (!z || !z3 || !string.contains("playSoundEffect") || (Config.B & 32) == 0) {
                    try {
                        File file = new File(Tools.K0(), "crash.txt");
                        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                        r.U(fileOutputStream, file.getAbsolutePath(), "");
                        fileOutputStream.write("".getBytes());
                        fileOutputStream.write(string.getBytes());
                        fileOutputStream.close();
                        strRemoveNewLinesChars = strRemoveNewLinesChars + "\nLog: " + file.getAbsolutePath();
                    } catch (Throwable th3) {
                        e1.s("Failed out crash to file", th3);
                    }
                    try {
                        File file2 = new File(Tools.K0(), "logcat.txt");
                        r.U(new FileOutputStream(file2, true), file2.getAbsolutePath(), "");
                        String[] strArr = {"logcat", "-f", Tools.F0(file2.getAbsolutePath()), "-d", "-v", "threadtime", "-b", "main", "-b", "system", "*:V"};
                        try {
                            if (!Tools.X1(Tools.I(strArr), 15)) {
                                e1.s("timeout fail 1: " + Arrays.toString(strArr), new RuntimeException());
                            }
                        } catch (Exception e2) {
                            e1.s("exec", e2);
                        }
                        strRemoveNewLinesChars = strRemoveNewLinesChars + "\nLogcat: " + file2.getAbsolutePath();
                    } catch (Throwable th4) {
                        e1.s("Failed out logcat to file", th4);
                    }
                    try {
                        Config.b(R.id.record_logcat).f42d = (int) (((f2 * 16636.8f) - 481.8f) + 0.5f);
                        Config.k();
                        strRemoveNewLinesChars = strRemoveNewLinesChars + "\nNext run rec logcat: " + r.v();
                    } catch (Throwable th5) {
                        e1.s("Failed enable logcat on next run", th5);
                    }
                    try {
                        String[] strArrE = e();
                        if (z) {
                            if (string.contains(": " + strArrE[0])) {
                                throw new RuntimeException(strArrE[0] + " is cause");
                            }
                        }
                        if (z2) {
                            e1.d("VSpace StackOverflowError - log not sended");
                        } else if (!z2.d(string, true)) {
                            throw new RuntimeException("Failed sendLogBlocking");
                        }
                    } catch (Throwable th6) {
                        e1.s("Cannot send exception info", th6);
                        if (z) {
                            l(string, name, e1.n(th));
                        }
                    }
                    return strRemoveNewLinesChars;
                }
                Config.b(R.id.config_use_sound_effects).f42d = 0;
                Config.k();
                sb = new StringBuilder();
                sb.append(strRemoveNewLinesChars);
                str = ". Cause: sound effects.";
            }
        }
        sb.append(str);
        return sb.toString();
    }

    public static void i(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("GG: ");
        float f2 = 1;
        sb.append((112.3f * f2) - 10.9f);
        sb.append(" [");
        sb.append((int) (((f2 * 16839.4f) - 684.4f) + 0.5f));
        sb.append("]\nAndroid: ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\nSDK: ");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("\nvSpace: ");
        sb.append(f1.x());
        sb.append('\n');
        sb.append(str);
        sb.append("\nHash: ");
        sb.append(b1.X());
        z2.d(sb.toString(), true);
    }

    private static void j(String str, String str2, Runnable runnable) {
        AlertDialog.Builder positiveButton;
        int i2;
        String[] strArrE = e();
        int i3 = 0;
        while (true) {
            if (i3 >= strArrE.length) {
                i3 = -1;
                break;
            }
            if (str.contains(": " + strArrE[i3])) {
                break;
            } else {
                i3 += 2;
            }
        }
        a aVar = new a(str, strArrE, i3, runnable);
        if (i3 >= 0) {
            e1.p(strArrE[i3] + " is reason of last fail");
            positiveButton = android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.last_run_failed)).setMessage(Tools.L1(b2.f(R.string.killed_by), strArrE[i3]) + "\n\n" + str2).setNeutralButton(b2.f(R.string.more), aVar);
            i2 = R.string.ok;
        } else {
            positiveButton = android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.last_run_failed)).setMessage(b2.f(R.string.unhandled_exception) + "\n\n" + str).setPositiveButton(b2.f(R.string.yes), aVar);
            i2 = R.string.no;
        }
        android.ext.f.s(positiveButton.setNegativeButton(b2.f(i2), aVar));
    }

    private void k(String str) throws InterruptedException {
        try {
            new g("showToast", str).start();
            Thread.sleep(4000L);
        } catch (Throwable unused) {
        }
    }

    public static void l(String str, String str2, String str3) {
        if (Tools.f0() != null) {
            Tools.M0().edit().putString("last_exception", str).putString("last_exception_trace", str3).commit();
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(Tools.q0(), "store_ex.txt"))));
            bufferedWriter.write(str + "@#%~~%#@" + str3);
            bufferedWriter.close();
        } catch (IOException e2) {
            e1.l("Failed store exception", e2);
        }
    }

    public static void m(Thread thread, Throwable th) {
        String name = thread.getName();
        String strN = e1.n(th);
        StringBuilder sb = new StringBuilder();
        sb.append("GG: ");
        float f2 = 1;
        sb.append((107.9f * f2) - 6.5f);
        sb.append(" [");
        sb.append((int) (((f2 * 16499.8f) - 344.8f) + 0.5f));
        sb.append("]\nAndroid: ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\nSDK: ");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("\nvSpace: ");
        sb.append(f1.x());
        sb.append("\nThread: ");
        sb.append(name);
        sb.append('\n');
        sb.append(strN);
        sb.append("\nHash: ");
        sb.append(b1.X());
        l(sb.toString(), name, strN);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        if (f1100c != th) {
            f1100c = th;
            if (!(th instanceof h)) {
                k(h(thread, th, true));
                if (f1101d) {
                    r.I();
                }
            }
        } else {
            e1.d("uncaughtException already called for: " + th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1102a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
