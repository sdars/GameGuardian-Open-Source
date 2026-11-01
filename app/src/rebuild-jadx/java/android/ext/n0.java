package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class n0 implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile java.lang.Throwable f1100c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f1101d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Thread.UncaughtExceptionHandler f1102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f1103b;

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f1105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f1107d;

        a(java.lang.String str, java.lang.String[] strArr, int i, java.lang.Runnable runnable) {
            this.f1104a = str;
            this.f1105b = strArr;
            this.f1106c = i;
            this.f1107d = runnable;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            if (i == -1) {
                android.ext.z2.c(this.f1104a);
                android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.thank_you);
            }
            if (i == -3) {
                android.ext.Tools.i1(this.f1105b[this.f1106c + 1]);
            }
            this.f1107d.run();
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.SharedPreferences f1108a;

        b(android.content.SharedPreferences sharedPreferences) {
            this.f1108a = sharedPreferences;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1108a.edit().remove("last_exception").commit();
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.io.File f1109a;

        c(java.io.File file) {
            this.f1109a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1109a.delete();
        }
    }

    class d implements android.content.DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            java.lang.String absolutePath;
            try {
                absolutePath = android.ext.Tools.f0().getFilesDir().getAbsolutePath();
            } catch (java.lang.Throwable th) {
                android.ext.e1.s("Failed get files dir", th);
                absolutePath = "error";
            }
            android.ext.ConfigListAdapter.a(absolutePath);
        }
    }

    class e implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f1110a;

        e(java.lang.String[] strArr) {
            this.f1110a = strArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            try {
                android.ext.e2.n("exec setprop persist.sys.whetstone.level 0", 15);
                android.ext.Tools.J1(android.ext.b2.g(this.f1110a[8] + ": " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok)));
            } catch (java.lang.Throwable unused) {
                android.ext.e1.p("Failed fix " + this.f1110a[8]);
                android.ext.Tools.J1(android.ext.b2.g(this.f1110a[8] + ": " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.patch_failed)));
            }
        }
    }

    class f implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f1111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1112b;

        f(java.lang.String[] strArr, int i) {
            this.f1111a = strArr;
            this.f1112b = i;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.Tools.i1(this.f1111a[(this.f1112b * 2) + 1]);
        }
    }

    class g extends java.lang.Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1113a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(java.lang.String str, java.lang.String str2) {
            super(str);
            this.f1113a = str2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                android.os.Looper.prepare();
                android.ext.p2.j(android.widget.Toast.makeText(android.ext.p2.h(), this.f1113a, 1));
                android.os.Looper.loop();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static class h extends java.lang.RuntimeException {
        public h(java.lang.String str) {
            super(str);
        }
    }

    public static class i extends java.lang.Thread {
        public i(java.lang.Runnable runnable, java.lang.String str) {
            super(runnable, str);
            android.ext.n0.g(this);
        }
    }

    private n0(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, java.lang.String str) {
        this.f1102a = uncaughtExceptionHandler;
        this.f1103b = str;
    }

    private static void a(java.lang.String str, int i2, android.content.DialogInterface.OnClickListener onClickListener) {
        java.lang.String[] strArrE = e();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i3 = i2 * 2;
        sb.append(strArrE[i3]);
        sb.append(" is reason of last fail");
        android.ext.e1.p(sb.toString());
        android.app.AlertDialog.Builder negativeButton = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.last_run_failed)).setMessage(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.killed_by), strArrE[i3]) + "\n\n" + str).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.more), new android.ext.n0.f(strArrE, i2)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null);
        if (onClickListener != null) {
            negativeButton.setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it), onClickListener);
        }
        android.ext.f.s(negativeButton);
    }

    public static void b() {
        c();
        try {
            android.content.SharedPreferences sharedPreferencesM0 = android.ext.Tools.M0();
            if (sharedPreferencesM0.contains("last_exception")) {
                j(sharedPreferencesM0.getString("last_exception", "- unknown -"), sharedPreferencesM0.getString("last_exception_trace", "- unknown -"), new android.ext.n0.b(sharedPreferencesM0));
            }
        } catch (java.lang.StackOverflowError e2) {
            android.ext.e1.a(e2);
        }
        try {
            java.io.File file = new java.io.File(android.ext.Tools.q0(), "store_ex.txt");
            if (file.exists()) {
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    while (true) {
                        java.lang.String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            java.lang.String[] strArrSplit = sb.toString().split("@#%~~%#@", 2);
                            j(strArrSplit[0], strArrSplit[1], new android.ext.n0.c(file));
                            return;
                        }
                        sb.append(line);
                        sb.append('\n');
                        android.ext.e1.a(e);
                    }
                } catch (java.io.IOException e3) {
                    android.ext.e1.l("Failed load exception", e3);
                }
            }
        } catch (java.lang.StackOverflowError e4) {
            android.ext.e1.a(e4);
        }
    }

    private static void c() {
        java.lang.String str;
        java.lang.String line;
        java.io.File file = new java.io.File(android.ext.Tools.q0(), "client_crash.log");
        if ((android.ext.Config.f30c & 64) == 0 && file.exists() && file.length() > 0) {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                boolean z = false;
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
                    while (!java.lang.Thread.interrupted() && (line = bufferedReader.readLine()) != null) {
                        if (!z) {
                            java.lang.String strT = android.ext.f0.T();
                            if (line.contains(strT) && !line.trim().equals(strT)) {
                                z = true;
                            }
                            android.ext.e1.p("Native crash check fail.");
                            break;
                        }
                        sb.append(line);
                        sb.append('\n');
                    }
                    bufferedReader.close();
                } catch (java.lang.Throwable th) {
                    sb.append(th.getMessage());
                    sb.append('\n');
                    android.ext.e1.s("Native crash load fail.", th);
                }
                if (z) {
                    java.lang.String string = sb.toString();
                    if (d(string)) {
                        android.ext.e1.p("Native crash detected: " + file.length() + " bytes, known reason.");
                    } else {
                        if (string.contains(">>> " + android.ext.Tools.C0() + " <<<") && string.contains("backtrace:")) {
                            android.ext.e1.p("Native crash detected: " + file.length() + " bytes.");
                            android.ext.e1.p("Native crash sended.");
                            i(string);
                        } else {
                            str = "Native crash not detected: " + file.length() + " bytes spooled without a native backtrace, discarded.";
                        }
                    }
                    file.delete();
                } else {
                    str = "Native crash not detected: " + file.length() + " bytes spool failed the header check, discarded.";
                }
                android.ext.e1.d(str);
                file.delete();
            } catch (java.lang.Throwable th2) {
                android.ext.e1.s("Native crash check file fail.", th2);
            }
        }
        try {
            new java.io.File(android.ext.Tools.q0(), "client_exit").delete();
        } catch (java.lang.Throwable th3) {
            android.ext.e1.s("Native crash clear exit mark fail.", th3);
        }
        try {
            file.createNewFile();
        } catch (java.lang.Throwable th4) {
            android.ext.e1.s("Native crash create file fail.", th4);
        }
    }

    public static boolean d(java.lang.String str) {
        java.lang.String[] strArrE = e();
        if (str.contains(" Process  (") && str.contains(") has open file /")) {
            android.ext.e1.p("unmount is reason of last fail");
            android.ext.f.s(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.last_run_failed)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.unmount_kill) + "\n\n" + str).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it), new android.ext.n0.d()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
            return true;
        }
        if (str.contains("CZAutoRunController")) {
            a(str, 3, new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25<70krz0wr0uxq0lq0skrhql{rv0jdphjxdugldq2"));
            return true;
        }
        if (str.contains(strArrE[8])) {
            a(str, 4, new android.ext.n0.e(strArrE));
            return true;
        }
        if (!str.contains(strArrE[10])) {
            return false;
        }
        a(str, 5, null);
        return true;
    }

    public static java.lang.String[] e() {
        return new java.lang.String[]{"XPrivacy", "biz.bokhorst.xprivacy", "Prevent Running", "me.piebridge.forcestopgb", "Brevent", "me.piebridge.brevent", "Security", "com.chaozhuo.permission.controller", "Whetstone", "com.miui.whetstone", "NeoSafe", "cn.nubia.security2"};
    }

    public static void f() {
        g(java.lang.Thread.currentThread());
    }

    public static void g(java.lang.Thread thread) {
        java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == null || !(defaultUncaughtExceptionHandler instanceof android.ext.n0)) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(new android.ext.n0(defaultUncaughtExceptionHandler, "default"));
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler == null || !(uncaughtExceptionHandler instanceof android.ext.n0)) {
            if (uncaughtExceptionHandler == null) {
                uncaughtExceptionHandler = thread.getThreadGroup();
            }
            thread.setUncaughtExceptionHandler(new android.ext.n0(uncaughtExceptionHandler, "thread:" + thread.getName()));
        }
    }

    public static java.lang.String h(java.lang.Thread thread, java.lang.Throwable th, boolean z) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        java.lang.String strRemoveNewLinesChars = android.ext.Tools.removeNewLinesChars("JJ#fudvkhg");
        java.lang.String name = thread.getName();
        if (z) {
            android.ext.e1.l("Exception in thread " + name, th);
            android.ext.e1.c();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("GG: ");
        float f2 = 1;
        sb2.append((110.5f * f2) - 9.1f);
        sb2.append(" [");
        sb2.append((int) (((16577.3f * f2) - 422.3f) + 0.5f));
        sb2.append("]\nAndroid: ");
        sb2.append(android.os.Build.VERSION.RELEASE);
        sb2.append("\nSDK: ");
        sb2.append(android.os.Build.VERSION.SDK_INT);
        sb2.append("\nvSpace: ");
        sb2.append(android.ext.f1.x());
        sb2.append("\nThread: ");
        sb2.append(name);
        sb2.append('\n');
        java.lang.String strN = android.ext.e1.n(th);
        boolean z2 = ((th instanceof java.lang.StackOverflowError) || strN.contains("java.lang.StackOverflowError")) && strN.contains("com.lody.virtual.client.ipc.");
        sb2.append(strN);
        if (strN.contains("ActivityNotFoundException")) {
            android.ext.Tools.B(android.ext.i.f1002d, sb2);
        }
        sb2.append("\nHash: ");
        try {
            sb2.append(android.ext.b1.X());
        } catch (java.lang.Throwable th2) {
            sb2.append("???");
            android.ext.e1.l("dbg", th2);
        }
        java.lang.String string = sb2.toString();
        boolean z3 = android.ext.Tools.f0() != null;
        boolean z4 = string.contains("EGL_") || string.contains("egl") || string.contains("HardwareRenderer");
        if (z && z3 && z4 && (android.ext.Config.B & 2) != 0) {
            android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_acceleration).f42d = 0;
            android.ext.Config.k();
            sb = new java.lang.StringBuilder();
            sb.append(strRemoveNewLinesChars);
            str = ". Hardware acceleration fail.";
        } else {
            if (z && z4 && (android.ext.Config.B & 2) == 0 && android.ext.r.l) {
                java.lang.String str2 = strRemoveNewLinesChars + ". Hardware acceleration fail. Try use 'GG (SW)' icon for start.";
                f1101d = true;
                android.ext.r.l = false;
                return str2;
            }
            if (z && z3 && string.contains("Suggestion") && (android.ext.Config.B & 8) != 0) {
                android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_suggestions).f42d = 0;
                android.ext.Config.k();
                sb = new java.lang.StringBuilder();
                sb.append(strRemoveNewLinesChars);
                str = ". Cause: suggestions.";
            } else {
                if (!z || !z3 || !string.contains("playSoundEffect") || (android.ext.Config.B & 32) == 0) {
                    try {
                        java.io.File file = new java.io.File(android.ext.Tools.K0(), "crash.txt");
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file, true);
                        android.ext.r.U(fileOutputStream, file.getAbsolutePath(), "");
                        fileOutputStream.write("".getBytes());
                        fileOutputStream.write(string.getBytes());
                        fileOutputStream.close();
                        strRemoveNewLinesChars = strRemoveNewLinesChars + "\nLog: " + file.getAbsolutePath();
                    } catch (java.lang.Throwable th3) {
                        android.ext.e1.s("Failed out crash to file", th3);
                    }
                    try {
                        java.io.File file2 = new java.io.File(android.ext.Tools.K0(), "logcat.txt");
                        android.ext.r.U(new java.io.FileOutputStream(file2, true), file2.getAbsolutePath(), "");
                        java.lang.String[] strArr = {"logcat", "-f", android.ext.Tools.F0(file2.getAbsolutePath()), "-d", "-v", "threadtime", "-b", "main", "-b", "system", "*:V"};
                        try {
                            if (!android.ext.Tools.X1(android.ext.Tools.I(strArr), 15)) {
                                android.ext.e1.s("timeout fail 1: " + java.util.Arrays.toString(strArr), new java.lang.RuntimeException());
                            }
                        } catch (java.lang.Exception e2) {
                            android.ext.e1.s("exec", e2);
                        }
                        strRemoveNewLinesChars = strRemoveNewLinesChars + "\nLogcat: " + file2.getAbsolutePath();
                    } catch (java.lang.Throwable th4) {
                        android.ext.e1.s("Failed out logcat to file", th4);
                    }
                    try {
                        android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.record_logcat).f42d = (int) (((f2 * 16636.8f) - 481.8f) + 0.5f);
                        android.ext.Config.k();
                        strRemoveNewLinesChars = strRemoveNewLinesChars + "\nNext run rec logcat: " + android.ext.r.v();
                    } catch (java.lang.Throwable th5) {
                        android.ext.e1.s("Failed enable logcat on next run", th5);
                    }
                    try {
                        java.lang.String[] strArrE = e();
                        if (z) {
                            if (string.contains(": " + strArrE[0])) {
                                throw new java.lang.RuntimeException(strArrE[0] + " is cause");
                            }
                        }
                        if (z2) {
                            android.ext.e1.d("VSpace StackOverflowError - log not sended");
                        } else if (!android.ext.z2.d(string, true)) {
                            throw new java.lang.RuntimeException("Failed sendLogBlocking");
                        }
                    } catch (java.lang.Throwable th6) {
                        android.ext.e1.s("Cannot send exception info", th6);
                        if (z) {
                            l(string, name, android.ext.e1.n(th));
                        }
                    }
                    return strRemoveNewLinesChars;
                }
                android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_use_sound_effects).f42d = 0;
                android.ext.Config.k();
                sb = new java.lang.StringBuilder();
                sb.append(strRemoveNewLinesChars);
                str = ". Cause: sound effects.";
            }
        }
        sb.append(str);
        return sb.toString();
    }

    public static void i(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GG: ");
        float f2 = 1;
        sb.append((112.3f * f2) - 10.9f);
        sb.append(" [");
        sb.append((int) (((f2 * 16839.4f) - 684.4f) + 0.5f));
        sb.append("]\nAndroid: ");
        sb.append(android.os.Build.VERSION.RELEASE);
        sb.append("\nSDK: ");
        sb.append(android.os.Build.VERSION.SDK_INT);
        sb.append("\nvSpace: ");
        sb.append(android.ext.f1.x());
        sb.append('\n');
        sb.append(str);
        sb.append("\nHash: ");
        sb.append(android.ext.b1.X());
        android.ext.z2.d(sb.toString(), true);
    }

    private static void j(java.lang.String str, java.lang.String str2, java.lang.Runnable runnable) {
        android.app.AlertDialog.Builder positiveButton;
        int i2;
        java.lang.String[] strArrE = e();
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
        android.ext.n0.a aVar = new android.ext.n0.a(str, strArrE, i3, runnable);
        if (i3 >= 0) {
            android.ext.e1.p(strArrE[i3] + " is reason of last fail");
            positiveButton = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.last_run_failed)).setMessage(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.killed_by), strArrE[i3]) + "\n\n" + str2).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.more), aVar);
            i2 = catch_.me_.if_.you_.can_.R.string.ok;
        } else {
            positiveButton = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.last_run_failed)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.unhandled_exception) + "\n\n" + str).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes), aVar);
            i2 = catch_.me_.if_.you_.can_.R.string.no;
        }
        android.ext.f.s(positiveButton.setNegativeButton(android.ext.b2.f(i2), aVar));
    }

    private void k(java.lang.String str) throws java.lang.InterruptedException {
        try {
            new android.ext.n0.g("showToast", str).start();
            java.lang.Thread.sleep(4000L);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void l(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.ext.Tools.f0() != null) {
            android.ext.Tools.M0().edit().putString("last_exception", str).putString("last_exception_trace", str3).commit();
            return;
        }
        try {
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(new java.io.File(android.ext.Tools.q0(), "store_ex.txt"))));
            bufferedWriter.write(str + "@#%~~%#@" + str3);
            bufferedWriter.close();
        } catch (java.io.IOException e2) {
            android.ext.e1.l("Failed store exception", e2);
        }
    }

    public static void m(java.lang.Thread thread, java.lang.Throwable th) {
        java.lang.String name = thread.getName();
        java.lang.String strN = android.ext.e1.n(th);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GG: ");
        float f2 = 1;
        sb.append((107.9f * f2) - 6.5f);
        sb.append(" [");
        sb.append((int) (((f2 * 16499.8f) - 344.8f) + 0.5f));
        sb.append("]\nAndroid: ");
        sb.append(android.os.Build.VERSION.RELEASE);
        sb.append("\nSDK: ");
        sb.append(android.os.Build.VERSION.SDK_INT);
        sb.append("\nvSpace: ");
        sb.append(android.ext.f1.x());
        sb.append("\nThread: ");
        sb.append(name);
        sb.append('\n');
        sb.append(strN);
        sb.append("\nHash: ");
        sb.append(android.ext.b1.X());
        l(sb.toString(), name, strN);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) throws java.lang.InterruptedException {
        if (f1100c != th) {
            f1100c = th;
            if (!(th instanceof android.ext.n0.h)) {
                k(h(thread, th, true));
                if (f1101d) {
                    android.ext.r.I();
                }
            }
        } else {
            android.ext.e1.d("uncaughtException already called for: " + th);
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1102a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
