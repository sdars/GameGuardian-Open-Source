package android.ext;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile boolean f735a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile BufferedWriter f736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Runnable f738d = new e1$a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static String f739e = "/last_run.log";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f740f = "- none -";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static StringBuilder f741g = null;

    public static int a(Throwable th) {
        return s("Bad implementation", th);
    }

    public static void b() {
        n2.g(new e1$b());
    }

    public static void c() {
        n2.g(new e1$c());
    }

    public static int d(String str) {
        return e("AndroidService", str);
    }

    public static int e(String str, String str2) {
        return e1$e.a(str, str2);
    }

    public static int f(String str, String str2, Throwable th) {
        return e1$e.b(str, str2, th);
    }

    public static int g(String str, Throwable th) {
        return f("AndroidService", str, th);
    }

    public static int h(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1003;
            d(str.substring(i, i2 < length ? i2 : length));
            i = i2;
        }
        return 0;
    }

    public static int i(String str) {
        return j("AndroidService", str);
    }

    public static int j(String str, String str2) {
        return e1$e.c(str, str2);
    }

    public static int k(String str, String str2, Throwable th) {
        return e1$e.d(str, str2, th);
    }

    public static int l(String str, Throwable th) {
        return k("AndroidService", str, th);
    }

    public static boolean m(boolean z) {
        if (f736b == null) {
            return false;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - f737c > 5000 || z) {
                try {
                    f736b.flush();
                } catch (NullPointerException unused) {
                }
                f737c = jCurrentTimeMillis;
                return true;
            }
        } catch (IOException e2) {
            e1$e.b("AndroidService", "Log write: I/O", e2);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    public static String n(Throwable th) {
        String str;
        String string;
        if (th == null) {
            return "";
        }
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
        } catch (OutOfMemoryError unused) {
            printWriter.write("OutOfMemoryError 1\n");
            while (th != null) {
                try {
                    printWriter.write(th.toString());
                    printWriter.write("\n");
                    th = th.getCause();
                } catch (OutOfMemoryError unused2) {
                    str = "OutOfMemoryError 2\n";
                    printWriter.write(str);
                    printWriter.flush();
                    string = stringWriter.toString();
                    if (string == null) {
                        return "";
                    }
                    return string;
                }
            }
        } catch (Throwable th2) {
            str = "Exception on printStackTrace: " + th2.getMessage();
            printWriter.write(str);
        }
        printWriter.flush();
        string = stringWriter.toString();
        if (string == null) {
            return "";
        }
        return string;
    }

    public static void o(Process process, InputStream inputStream) {
        if (process == null) {
            return;
        }
        new e1$d("runLogOnProcessErrStream", inputStream, process).start();
    }

    public static int p(String str) {
        return q("AndroidService", str);
    }

    public static int q(String str, String str2) {
        return e1$e.g(str, str2);
    }

    public static int r(String str, String str2, Throwable th) {
        return e1$e.h(str, str2, th);
    }

    public static int s(String str, Throwable th) {
        return r("AndroidService", str, th);
    }
}
