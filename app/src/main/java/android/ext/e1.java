package android.ext;

import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile boolean f735a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile BufferedWriter f736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Runnable f738d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static String f739e = "/last_run.log";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f740f = "- none -";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static StringBuilder f741g = null;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.m(true);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.f735a = true;
            if (e1.f736b == null) {
                return;
            }
            try {
                e1.f736b.flush();
                e1.f736b.close();
                e1.f736b = null;
            } catch (IOException e2) {
                e.b("AndroidService", "Log close: I/O", e2);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.b();
        }
    }

    class d extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Process f743b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MainService.instance.p0((byte) 0, 20, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, InputStream inputStream, Process process) {
            super(str);
            this.f742a = inputStream;
            this.f743b = process;
        }

        /* JADX WARN: Code duplicated, block: B:109:0x013e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:110:0x0040 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:111:0x0088 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:113:0x0090 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:114:0x00cc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:116:0x004a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:117:0x00b4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:118:0x00a7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:119:0x00de A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:120:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:121:0x0132 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:123:0x009f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:124:0x0036 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:127:0x0019 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:132:0x0019 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x0055 A[Catch: NullPointerException -> 0x0028, IllegalArgumentException -> 0x0058, NumberFormatException -> 0x005b, IOException -> 0x014f, InterruptedException -> 0x0157, TryCatch #7 {NumberFormatException -> 0x005b, blocks: (B:22:0x004b, B:24:0x0055, B:29:0x005d, B:31:0x0060), top: B:98:0x004b }] */
        /* JADX WARN: Code duplicated, block: B:31:0x0060 A[Catch: NullPointerException -> 0x0028, IllegalArgumentException -> 0x0058, NumberFormatException -> 0x005b, IOException -> 0x014f, InterruptedException -> 0x0157, TRY_LEAVE, TryCatch #7 {NumberFormatException -> 0x005b, blocks: (B:22:0x004b, B:24:0x0055, B:29:0x005d, B:31:0x0060), top: B:98:0x004b }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0092 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:62:0x00e6 A[Catch: NullPointerException -> 0x0028, IllegalArgumentException -> 0x0058, IOException -> 0x014f, InterruptedException -> 0x0157, TryCatch #9 {NullPointerException -> 0x0028, blocks: (B:3:0x0005, B:4:0x0019, B:7:0x0021, B:14:0x0030, B:16:0x0036, B:18:0x0040, B:22:0x004b, B:24:0x0055, B:29:0x005d, B:31:0x0060, B:33:0x0068, B:86:0x0145, B:40:0x0075, B:41:0x0084, B:42:0x0088, B:46:0x0094, B:48:0x009f, B:51:0x00a8, B:53:0x00b4, B:56:0x00bc, B:57:0x00cc, B:59:0x00d4, B:60:0x00de, B:62:0x00e6, B:65:0x00f5, B:68:0x00fd, B:70:0x0105, B:72:0x010d, B:77:0x0124, B:79:0x012a, B:82:0x0134, B:83:0x013a, B:75:0x0115, B:76:0x011c, B:64:0x00ee, B:84:0x013e, B:12:0x002c), top: B:100:0x0005, inners: #10 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x00ee A[Catch: NullPointerException -> 0x0028, IllegalArgumentException -> 0x0058, IOException -> 0x014f, InterruptedException -> 0x0157, TryCatch #9 {NullPointerException -> 0x0028, blocks: (B:3:0x0005, B:4:0x0019, B:7:0x0021, B:14:0x0030, B:16:0x0036, B:18:0x0040, B:22:0x004b, B:24:0x0055, B:29:0x005d, B:31:0x0060, B:33:0x0068, B:86:0x0145, B:40:0x0075, B:41:0x0084, B:42:0x0088, B:46:0x0094, B:48:0x009f, B:51:0x00a8, B:53:0x00b4, B:56:0x00bc, B:57:0x00cc, B:59:0x00d4, B:60:0x00de, B:62:0x00e6, B:65:0x00f5, B:68:0x00fd, B:70:0x0105, B:72:0x010d, B:77:0x0124, B:79:0x012a, B:82:0x0134, B:83:0x013a, B:75:0x0115, B:76:0x011c, B:64:0x00ee, B:84:0x013e, B:12:0x002c), top: B:100:0x0005, inners: #10 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x00fd A[Catch: NullPointerException -> 0x0028, IllegalArgumentException -> 0x0058, IOException -> 0x014f, InterruptedException -> 0x0157, TRY_ENTER, TryCatch #9 {NullPointerException -> 0x0028, blocks: (B:3:0x0005, B:4:0x0019, B:7:0x0021, B:14:0x0030, B:16:0x0036, B:18:0x0040, B:22:0x004b, B:24:0x0055, B:29:0x005d, B:31:0x0060, B:33:0x0068, B:86:0x0145, B:40:0x0075, B:41:0x0084, B:42:0x0088, B:46:0x0094, B:48:0x009f, B:51:0x00a8, B:53:0x00b4, B:56:0x00bc, B:57:0x00cc, B:59:0x00d4, B:60:0x00de, B:62:0x00e6, B:65:0x00f5, B:68:0x00fd, B:70:0x0105, B:72:0x010d, B:77:0x0124, B:79:0x012a, B:82:0x0134, B:83:0x013a, B:75:0x0115, B:76:0x011c, B:64:0x00ee, B:84:0x013e, B:12:0x002c), top: B:100:0x0005, inners: #10 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0113 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:75:0x0115 A[Catch: NullPointerException -> 0x0028, IllegalArgumentException -> 0x0058, IOException -> 0x014f, InterruptedException -> 0x0157, TryCatch #9 {NullPointerException -> 0x0028, blocks: (B:3:0x0005, B:4:0x0019, B:7:0x0021, B:14:0x0030, B:16:0x0036, B:18:0x0040, B:22:0x004b, B:24:0x0055, B:29:0x005d, B:31:0x0060, B:33:0x0068, B:86:0x0145, B:40:0x0075, B:41:0x0084, B:42:0x0088, B:46:0x0094, B:48:0x009f, B:51:0x00a8, B:53:0x00b4, B:56:0x00bc, B:57:0x00cc, B:59:0x00d4, B:60:0x00de, B:62:0x00e6, B:65:0x00f5, B:68:0x00fd, B:70:0x0105, B:72:0x010d, B:77:0x0124, B:79:0x012a, B:82:0x0134, B:83:0x013a, B:75:0x0115, B:76:0x011c, B:64:0x00ee, B:84:0x013e, B:12:0x002c), top: B:100:0x0005, inners: #10 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x012a A[Catch: NullPointerException -> 0x0028, IllegalArgumentException -> 0x0058, IOException -> 0x014f, InterruptedException -> 0x0157, TryCatch #9 {NullPointerException -> 0x0028, blocks: (B:3:0x0005, B:4:0x0019, B:7:0x0021, B:14:0x0030, B:16:0x0036, B:18:0x0040, B:22:0x004b, B:24:0x0055, B:29:0x005d, B:31:0x0060, B:33:0x0068, B:86:0x0145, B:40:0x0075, B:41:0x0084, B:42:0x0088, B:46:0x0094, B:48:0x009f, B:51:0x00a8, B:53:0x00b4, B:56:0x00bc, B:57:0x00cc, B:59:0x00d4, B:60:0x00de, B:62:0x00e6, B:65:0x00f5, B:68:0x00fd, B:70:0x0105, B:72:0x010d, B:77:0x0124, B:79:0x012a, B:82:0x0134, B:83:0x013a, B:75:0x0115, B:76:0x011c, B:64:0x00ee, B:84:0x013e, B:12:0x002c), top: B:100:0x0005, inners: #10 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x0134 A[Catch: NullPointerException -> 0x0028, IllegalArgumentException -> 0x0058, IOException -> 0x014f, InterruptedException -> 0x0157, TryCatch #9 {NullPointerException -> 0x0028, blocks: (B:3:0x0005, B:4:0x0019, B:7:0x0021, B:14:0x0030, B:16:0x0036, B:18:0x0040, B:22:0x004b, B:24:0x0055, B:29:0x005d, B:31:0x0060, B:33:0x0068, B:86:0x0145, B:40:0x0075, B:41:0x0084, B:42:0x0088, B:46:0x0094, B:48:0x009f, B:51:0x00a8, B:53:0x00b4, B:56:0x00bc, B:57:0x00cc, B:59:0x00d4, B:60:0x00de, B:62:0x00e6, B:65:0x00f5, B:68:0x00fd, B:70:0x0105, B:72:0x010d, B:77:0x0124, B:79:0x012a, B:82:0x0134, B:83:0x013a, B:75:0x0115, B:76:0x011c, B:64:0x00ee, B:84:0x013e, B:12:0x002c), top: B:100:0x0005, inners: #10 }] */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String line;
            String strTrim;
            String str;
            int i;
            int i2;
            StringBuilder sb;
            super.run();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f742a), 512);
                int[] iArrCopyOf = null;
                boolean z = false;
                int i3 = 0;
                int i4 = 0;
                while (!Thread.interrupted()) {
                    if (z) {
                        try {
                            this.f743b.exitValue();
                            return;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            e1.a(e2);
                            z = false;
                            try {
                                line = bufferedReader.readLine();
                                if (line != null) {
                                    strTrim = line.trim();
                                    if (strTrim.length() != 0) {
                                        if (strTrim.startsWith("KEY: ")) {
                                            try {
                                                int i5 = Integer.parseInt(strTrim.substring(5));
                                                if (iArrCopyOf == null) {
                                                    iArrCopyOf = new int[512];
                                                }
                                                if (i3 == iArrCopyOf.length) {
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length + 512);
                                                }
                                                i = i3 + 1;
                                                try {
                                                    iArrCopyOf[i3] = i5;
                                                    i3 = i;
                                                } catch (IOException unused) {
                                                    i3 = i;
                                                    z = true;
                                                } catch (NumberFormatException e3) {
                                                    e = e3;
                                                    i3 = i;
                                                    str = "Failed parse: " + strTrim;
                                                    e1.s(str, e);
                                                } catch (IllegalArgumentException e4) {
                                                    e = e4;
                                                    i3 = i;
                                                    e1.a(e);
                                                    i4++;
                                                    if (i4 > 30) {
                                                        return;
                                                    }
                                                }
                                            } catch (NumberFormatException e5) {
                                                e = e5;
                                            }
                                        } else if (strTrim.startsWith("KEY_END")) {
                                            if (iArrCopyOf != null) {
                                                Config.s(Arrays.copyOf(iArrCopyOf, i3));
                                            }
                                            iArrCopyOf = null;
                                            i3 = 0;
                                        } else if (strTrim.startsWith("EVENT: ")) {
                                            try {
                                                i2 = Integer.parseInt(strTrim.substring(7));
                                                if (MainService.instance != null) {
                                                    MainService.instance.d0(i2);
                                                }
                                            } catch (NumberFormatException e6) {
                                                e = e6;
                                                str = "Failed parse: " + strTrim;
                                                e1.s(str, e);
                                            }
                                        } else if (strTrim.startsWith("BAD_KERNEL")) {
                                            n2.i(new a());
                                        } else {
                                            sb = e1.f741g;
                                            if (strTrim.contains(" dbg: ")) {
                                                sb = new StringBuilder();
                                                e1.f741g = sb;
                                            } else {
                                                sb = new StringBuilder();
                                                e1.f741g = sb;
                                            }
                                            if (strTrim.contains(" dbg: ")) {
                                                if (sb == null) {
                                                    sb = new StringBuilder();
                                                    e1.f741g = sb;
                                                }
                                                sb.append(strTrim);
                                                sb.append('\n');
                                            } else {
                                                if (sb == null) {
                                                    sb = new StringBuilder();
                                                    e1.f741g = sb;
                                                }
                                                sb.append(strTrim);
                                                sb.append('\n');
                                            }
                                            if (!strTrim.contains("::searchDone:")) {
                                            }
                                            if (sb != null) {
                                                e1.f740f = sb.toString();
                                            }
                                            e1.f741g = null;
                                        }
                                    }
                                } else {
                                    Thread.sleep(500L);
                                }
                            } catch (InterruptedException unused2) {
                                return;
                            }
                        } catch (IllegalThreadStateException unused3) {
                            z = false;
                            line = bufferedReader.readLine();
                            if (line != null) {
                                strTrim = line.trim();
                                if (strTrim.length() != 0) {
                                    if (strTrim.startsWith("KEY: ")) {
                                        int i6 = Integer.parseInt(strTrim.substring(5));
                                        if (iArrCopyOf == null) {
                                            iArrCopyOf = new int[512];
                                        }
                                        if (i3 == iArrCopyOf.length) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length + 512);
                                        }
                                        i = i3 + 1;
                                        iArrCopyOf[i3] = i6;
                                        i3 = i;
                                    } else if (strTrim.startsWith("KEY_END")) {
                                        if (iArrCopyOf != null) {
                                            Config.s(Arrays.copyOf(iArrCopyOf, i3));
                                        }
                                        iArrCopyOf = null;
                                        i3 = 0;
                                    } else if (strTrim.startsWith("EVENT: ")) {
                                        i2 = Integer.parseInt(strTrim.substring(7));
                                        if (MainService.instance != null) {
                                            MainService.instance.d0(i2);
                                        }
                                    } else if (strTrim.startsWith("BAD_KERNEL")) {
                                        n2.i(new a());
                                    } else {
                                        sb = e1.f741g;
                                        if (strTrim.contains(" dbg: ")) {
                                            sb = new StringBuilder();
                                            e1.f741g = sb;
                                        } else {
                                            sb = new StringBuilder();
                                            e1.f741g = sb;
                                        }
                                        if (strTrim.contains(" dbg: ")) {
                                            if (sb == null) {
                                                sb = new StringBuilder();
                                                e1.f741g = sb;
                                            }
                                            sb.append(strTrim);
                                            sb.append('\n');
                                        } else {
                                            if (sb == null) {
                                                sb = new StringBuilder();
                                                e1.f741g = sb;
                                            }
                                            sb.append(strTrim);
                                            sb.append('\n');
                                        }
                                        if (!strTrim.contains("::searchDone:")) {
                                        }
                                        if (sb != null) {
                                            e1.f740f = sb.toString();
                                        }
                                        e1.f741g = null;
                                    }
                                }
                            } else {
                                Thread.sleep(500L);
                            }
                        }
                    }
                    try {
                        line = bufferedReader.readLine();
                        if (line != null) {
                            strTrim = line.trim();
                            if (strTrim.length() != 0) {
                                if (strTrim.startsWith("KEY: ")) {
                                    int i7 = Integer.parseInt(strTrim.substring(5));
                                    if (iArrCopyOf == null) {
                                        iArrCopyOf = new int[512];
                                    }
                                    if (i3 == iArrCopyOf.length) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length + 512);
                                    }
                                    i = i3 + 1;
                                    iArrCopyOf[i3] = i7;
                                    i3 = i;
                                } else if (strTrim.startsWith("KEY_END")) {
                                    if (iArrCopyOf != null && i3 > 0) {
                                        Config.s(Arrays.copyOf(iArrCopyOf, i3));
                                    }
                                    iArrCopyOf = null;
                                    i3 = 0;
                                } else if (strTrim.startsWith("EVENT: ")) {
                                    i2 = Integer.parseInt(strTrim.substring(7));
                                    if (MainService.instance != null) {
                                        MainService.instance.d0(i2);
                                    }
                                } else if (strTrim.startsWith("BAD_KERNEL")) {
                                    n2.i(new a());
                                } else {
                                    sb = e1.f741g;
                                    if (strTrim.contains(" dbg: ") || strTrim.endsWith("Send code: 2")) {
                                        sb = new StringBuilder();
                                        e1.f741g = sb;
                                    }
                                    if (strTrim.contains(" dbg: ") || strTrim.contains(" clocks: ") || strTrim.startsWith("MR[") || strTrim.contains("::searchDone:")) {
                                        if (sb == null) {
                                            sb = new StringBuilder();
                                            e1.f741g = sb;
                                        }
                                        sb.append(strTrim);
                                        sb.append('\n');
                                    }
                                    if (!strTrim.contains("::searchDone:") || strTrim.endsWith("Send code: 3")) {
                                        if (sb != null) {
                                            e1.f740f = sb.toString();
                                        }
                                        e1.f741g = null;
                                    }
                                }
                            }
                        } else {
                            Thread.sleep(500L);
                        }
                    } catch (IOException unused4) {
                    } catch (IllegalArgumentException e7) {
                        e = e7;
                    }
                }
            } catch (NullPointerException e8) {
                e1.s("runLogOnProcessErrStream failed", e8);
            }
        }
    }

    public static class e {
        public static int a(String str, String str2) {
            return f(2, str, str2, null);
        }

        public static int b(String str, String str2, Throwable th) {
            return f(3, str, str2, th);
        }

        public static int c(String str, String str2) {
            return f(9, str, str2, null);
        }

        public static int d(String str, String str2, Throwable th) {
            return f(10, str, str2, th);
        }

        private static String e(String str) {
            if (str == null) {
                return "null";
            }
            return str.length() > 23 ? str.substring(0, 23) : str;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        private static int f(int i, String str, String str2, Throwable th) {
            String strE = e(str);
            if (str2 == null) {
                str2 = "null";
            }
            int length = str2.length();
            int i2 = 0;
            while (true) {
                int i3 = length - i2;
                if (i3 > 1023) {
                    i3 = 1023;
                }
                int i4 = i3 + i2;
                String strSubstring = str2.substring(i2, i4);
                if (i == 2) {
                    try {
                        Log.e(strE, strSubstring);
                    } catch (OutOfMemoryError unused) {
                        Log.e(strE, "OOM for Log 1");
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        Log.e(strE, strSubstring);
                    } else if (i != 7) {
                        if (i == 9) {
                            Log.e(strE, strSubstring);
                        } else if (i == 10) {
                            if (i4 == length) {
                                try {
                                    Log.e(strE, strSubstring, th);
                                } catch (OutOfMemoryError unused2) {
                                    Log.e(strE, strSubstring);
                                }
                            } else {
                                Log.e(strE, strSubstring);
                            }
                        }
                    } else if (i4 == length) {
                        Log.e(strE, strSubstring, th);
                    } else {
                        Log.e(strE, strSubstring);
                    }
                } else if (i4 == length) {
                    Log.e(strE, strSubstring, th);
                } else {
                    Log.e(strE, strSubstring);
                }
                if (i4 >= length) {
                    return 0;
                }
                i2 = i4;
            }
        }

        public static int g(String str, String str2) {
            return f(6, str, str2, null);
        }

        public static int h(String str, String str2, Throwable th) {
            return f(7, str, str2, th);
        }
    }

    public static int a(Throwable th) {
        return s("Bad implementation", th);
    }

    public static void b() {
        n2.g(new b());
    }

    public static void c() {
        n2.g(new c());
    }

    public static int d(String str) {
        return e("AndroidService", str);
    }

    public static int e(String str, String str2) {
        return e.a(str, str2);
    }

    public static int f(String str, String str2, Throwable th) {
        return e.b(str, str2, th);
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
        return e.c(str, str2);
    }

    public static int k(String str, String str2, Throwable th) {
        return e.d(str, str2, th);
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
            e.b("AndroidService", "Log write: I/O", e2);
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
        new d("runLogOnProcessErrStream", inputStream, process).start();
    }

    public static int p(String str) {
        return q("AndroidService", str);
    }

    public static int q(String str, String str2) {
        return e.g(str, str2);
    }

    public static int r(String str, String str2, Throwable th) {
        return e.h(str, str2, th);
    }

    public static int s(String str, Throwable th) {
        return r("AndroidService", str, th);
    }
}
