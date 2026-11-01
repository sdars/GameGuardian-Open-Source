package android.ext;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.AnalyticsService;
import catch_.me_.if_.you_.can_.Instrumentation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Boolean f951a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f952b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile int f953c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile boolean f954d = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: android.ext.f1$a$a, reason: collision with other inner class name */
        class RunnableC0018a implements Runnable {
            RunnableC0018a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zStartInstrumentation;
                boolean z = false;
                try {
                    if (!Config.vSpaceReal && Config.z == 0) {
                        ComponentName componentNameU = f1.u();
                        if (componentNameU != null) {
                            e1.d("Try instr: " + Process.myUid());
                            f1.f((byte) 0);
                            try {
                                zStartInstrumentation = r.p.startInstrumentation(componentNameU, null, r.u());
                                f1.f((byte) 1);
                                e1.d("Fail instr: " + Process.myUid());
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                e1.l("Failed load Instrumentation", th);
                                if (z) {
                                    f1.f((byte) 1);
                                }
                            }
                        }
                        f1.B(3, "" + zStartInstrumentation + ' ' + Config.z);
                        f1.B(6, null);
                        f1.I();
                    }
                    f1.i();
                    zStartInstrumentation = false;
                    f1.B(3, "" + zStartInstrumentation + ' ' + Config.z);
                } catch (Throwable th2) {
                    th = th2;
                }
                f1.B(6, null);
                f1.I();
            }
        }

        a() {
        }

        /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
            java.util.ConcurrentModificationException
            	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
            	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
            	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r6 = this;
                r0 = 1
                r1 = 0
                android.ext.f1.B(r0, r1)
                android.ext.b1$c0 r2 = android.ext.b1.j0()
                boolean r2 = r2.f610a
                android.ext.r r3 = android.ext.r.n
                r4 = 0
                if (r2 == 0) goto L1a
                boolean r5 = android.ext.Config.vSpaceReal
                if (r5 == 0) goto L18
                boolean r5 = android.ext.Config.D
                if (r5 == 0) goto L1a
            L18:
                r5 = 1
                goto L1b
            L1a:
                r5 = 0
            L1b:
                r3.f1206d = r5
                if (r2 == 0) goto L43
                boolean r0 = android.ext.ConfigListAdapter.k()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Install64: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                android.ext.e1.d(r1)
                if (r0 == 0) goto L3e
                android.ext.f1.M()
                goto Lba
            L3e:
                android.ext.f1.L()
                goto Lba
            L43:
                android.ext.r.q = r4
                boolean r2 = android.ext.f1.f954d
                if (r2 == 0) goto L52
                r0 = 8
                android.ext.f1.B(r0, r1)
            L4e:
                android.ext.f1.D()
                goto Lba
            L52:
                boolean r2 = android.ext.u.c()
                r3 = 2
                if (r2 == 0) goto L5a
                goto L5b
            L5a:
                r0 = 2
            L5b:
                android.ext.f1.f(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                if (r2 != 0) goto L9b
                r0.<init>()
                java.lang.String r2 = "Not instr: "
                r0.append(r2)
                int r2 = android.os.Process.myUid()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = ""
                r0.append(r2)
                int r2 = android.ext.Config.z
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.ext.f1.B(r3, r0)
                android.ext.f1$a$a r0 = new android.ext.f1$a$a
                r0.<init>()
                android.ext.n2.i(r0)
                r0 = 4
                android.ext.f1.B(r0, r1)
                goto Lba
            L9b:
                r0.<init>()
                java.lang.String r2 = "Use instr: "
                r0.append(r2)
                int r2 = android.os.Process.myUid()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                r0 = 9
                android.ext.f1.B(r0, r1)
                android.ext.f1.O()
                goto L4e
            Lba:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.ext.f1.a.run():void");
        }
    }

    class b implements Runnable {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ StringBuilder f956a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f957b;

            a(StringBuilder sb, String str) {
                this.f956a = sb;
                this.f957b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                View viewF = a.d.f(2131099658, null);
                Tools.v1((TextView) viewF.findViewById(2131034148), this.f956a.toString());
                android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.h0(Tools.L1(b2.f(2131296478), this.f957b))).setView(viewF).setCancelable(false).setPositiveButton(b2.f(2131296388), new r.n(null)).setNegativeButton(b2.f(2131296836), (DialogInterface.OnClickListener) null));
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bytes;
            BufferedReader bufferedReader;
            StringBuilder sb;
            int iE;
            int iE2;
            String str;
            String str2;
            try {
                f1.f951a = Boolean.FALSE;
                String str3 = "" + ((1 * 112.0f) - 10.6f);
                String str4 = null;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    SharedPreferences sharedPreferencesM0 = Tools.M0();
                    for (int i = 0; i < 4; i++) {
                        String str5 = "used-" + i;
                        if (sharedPreferencesM0.contains(str5)) {
                            String string = sharedPreferencesM0.getString(str5, "");
                            if (string.length() != 0) {
                                if (sb2.length() != 0) {
                                    sb2.append('&');
                                }
                                sb2.append(i);
                                sb2.append('=');
                                sb2.append(string);
                            }
                        }
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferencesM0.edit();
                    for (int i2 = 0; i2 < 4; i2++) {
                        editorEdit.remove("used-" + i2);
                    }
                    editorEdit.commit();
                    bytes = sb2.toString().getBytes();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (str4 == null) {
                            str4 = line;
                        }
                        if ("".equals(str)) {
                            if (h0.e(line) <= iE) {
                                break;
                            } else {
                                str2 = line;
                            }
                        }
                        sb.append(line);
                        sb.append('\n');
                        if (line.contains("ARMv5") && h0.e(str2) > iE2) {
                            try {
                                android.ext.i.f999a = Float.parseFloat(str2);
                                iE2 = h0.e(str2);
                            } catch (NumberFormatException e2) {
                                e1.s("Failed parse as float '" + str2 + "'", e2);
                            }
                        }
                        str = line;
                    }
                } catch (Throwable th) {
                    e1.a(th);
                    bytes = null;
                }
                URLConnection uRLConnectionOpenConnection = new URL(Tools.L1(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2JJborjv2yhuvlrq1sksBv@(g)y@(v)o@(v)w@(v)d@(g)r@(v)x@(v"), Integer.valueOf(Build.VERSION.SDK_INT), str3, android.ext.k.b(), b2.f(2131296732), Integer.valueOf(e0.f()), f1.v(), f1.x()) + p1.d() + ConfigListAdapter.i()).openConnection();
                if (bytes != null) {
                    try {
                        uRLConnectionOpenConnection.setDoOutput(true);
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(uRLConnectionOpenConnection.getOutputStream());
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        e1.a(th2);
                    }
                }
                bufferedReader = new BufferedReader(new InputStreamReader(uRLConnectionOpenConnection.getInputStream()));
                sb = new StringBuilder();
                iE = h0.e(str3);
                iE2 = h0.e(Float.toString(android.ext.i.f999a));
                str = "";
                str2 = null;
                bufferedReader.close();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Server version: ");
                sb3.append(str4 != null ? str4 + ' ' + h0.e(str4) : "null");
                e1.d(sb3.toString());
                if (str4 == null || h0.e(str4) <= iE) {
                    return;
                }
                f1.f951a = Boolean.TRUE;
                n2.i(new a(sb, str4));
            } catch (Throwable th3) {
                e1.l("checkNewVersion", th3);
            }
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f959a;

        c(File file) {
            this.f959a = file;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f959a.delete();
            if (i != 0) {
                return;
            }
            Config.b(2131034402).f42d = 1;
            Config.k();
            r.I();
        }
    }

    class d implements DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ConfigListAdapter.t(2131296614);
        }
    }

    class e implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f961b;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                int i2;
                if (i == 0) {
                    i2 = 2131034186;
                } else if (i != 1) {
                    return;
                } else {
                    i2 = 2131034188;
                }
                Config.b(i2).b();
            }
        }

        class b implements DialogInterface.OnDismissListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                e.this.f961b.run();
            }
        }

        e(boolean[] zArr, Runnable runnable) {
            this.f960a = zArr;
            this.f961b = runnable;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f960a[0] = true;
            AlertDialog alertDialogCreate = android.ext.f.b().setCustomTitle(Tools.g0(2131296455)).setItems(new String[]{Config.b(2131034186).toString(), Config.b(2131034188).toString()}, new a()).setNegativeButton(b2.f(2131296311), (DialogInterface.OnClickListener) null).create();
            if (this.f961b != null) {
                android.ext.f.k(alertDialogCreate, new b());
            }
            android.ext.f.m(alertDialogCreate);
        }
    }

    class f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f965b;

        f(boolean[] zArr, Runnable runnable) {
            this.f964a = zArr;
            this.f965b = runnable;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f964a[0]) {
                return;
            }
            this.f965b.run();
        }
    }

    class g implements Runnable {

        class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SharedPreferences f966a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f967b;

            a(SharedPreferences sharedPreferences, String str) {
                this.f966a = sharedPreferences;
                this.f967b = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == -1) {
                    new r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:8770li0|rx0zdqw0wr0dgg0d0qhz0wudqvodwlrq0ru0lpsuryh0dq0h{lvwlqj2").onClick(dialogInterface, i);
                }
                this.f966a.edit().putString("improve-translate", this.f967b).commit();
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DialogInterface.OnClickListener f969a;

            b(DialogInterface.OnClickListener onClickListener) {
                this.f969a = onClickListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.ext.f.o(android.ext.f.b().setMessage(b2.f(2131296693)).setPositiveButton(b2.f(2131296962), this.f969a).setNegativeButton(b2.f(2131296963), this.f969a));
            }
        }

        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SharedPreferences sharedPreferencesM0 = Tools.M0();
                String string = sharedPreferencesM0.getString("improve-translate", "");
                String str = b2.f(2131297084) + ':' + b2.f(2131296732);
                if (str.equals(string)) {
                    return;
                }
                if (b2.f(2131296502).contains(b2.f(2131296694))) {
                    n2.i(new b(new a(sharedPreferencesM0, str)));
                }
            } catch (Throwable th) {
                e1.l("checkAutoTranslation", th);
            }
        }
    }

    class h implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f971a;

        h(long j) {
            this.f971a = j;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Config.f30c |= this.f971a;
            Config.k();
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f974c;

        i(Context context, String str, long j) {
            this.f972a = context;
            this.f973b = str;
            this.f974c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Context contextF0 = this.f972a;
                if (contextF0 == null) {
                    contextF0 = Tools.f0();
                }
                AlertDialog alertDialogCreate = android.ext.f.c(contextF0).setMessage(this.f973b).setPositiveButton(b2.f(2131296836), (DialogInterface.OnClickListener) null).setNeutralButton(b2.f(2131296963), f1.w(this.f974c)).create();
                android.ext.f.m(alertDialogCreate);
                Tools.u1(alertDialogCreate);
            } catch (Throwable th) {
                e1.a(th);
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((Config.f30c & 16) == 0 && Config.vSpaceReal && b1.B0()) {
                n2.i(f1.J(r.p, b2.f(2131296794), 16L, false));
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strF;
            if ((Config.f30c & 32) != 0) {
                return;
            }
            String[] strArr = {"/system/priv-app/com.bluestacks.settings", "/system/priv-app/com.bluestacks.settings/com.bluestacks.settings.apk", "/system/priv-app/com.bluestacks.bstfolder", "/system/priv-app/com.bluestacks.bstfolder/com.bluestacks.bstfolder.apk", "/system/priv-app/com.bluestacks.BstCommandProcessor", "/system/priv-app/com.bluestacks.BstCommandProcessor/com.bluestacks.BstCommandProcessor.apk", "/boot/android/android/system/priv-app/com.bluestacks.settings", "/boot/android/android/system/priv-app/com.bluestacks.settings/com.bluestacks.settings.apk", "/boot/android/android/system/priv-app/com.bluestacks.bstfolder", "/boot/android/android/system/priv-app/com.bluestacks.bstfolder/com.bluestacks.bstfolder.apk", "/boot/android/android/system/priv-app/com.bluestacks.BstCommandProcessor", "/boot/android/android/system/priv-app/com.bluestacks.BstCommandProcessor/com.bluestacks.BstCommandProcessor.apk", "/storage/emulated/0/Android/data/com.bluestacks.settings", "/storage/emulated/0/Android/data/com.bluestacks.home", "/mnt/runtime/write/emulated/0/Android/data/com.bluestacks.settings", "/mnt/runtime/write/emulated/0/Android/data/com.bluestacks.home", "/mnt/runtime/read/emulated/0/Android/data/com.bluestacks.settings", "/mnt/runtime/read/emulated/0/Android/data/com.bluestacks.home", "/mnt/runtime/default/emulated/0/Android/data/com.bluestacks.settings", "/mnt/runtime/default/emulated/0/Android/data/com.bluestacks.home", "/data/.bluestacks.prop", "/data/misc/profiles/cur/0/com.bluestacks.settings", "/data/misc/profiles/cur/0/com.bluestacks.BstCommandProcessor", "/data/misc/profiles/cur/0/com.bluestacks.appmart", "/data/misc/profiles/cur/0/com.bluestacks.bstfolder", "/data/misc/profiles/cur/0/com.bluestacks.home", "/data/misc/profiles/cur/0/com.bluestacks.filemanager", "/data/misc/profiles/cur/0/com.bluestacks.appguidance", "/data/misc/profiles/ref/com.bluestacks.settings", "/data/misc/profiles/ref/com.bluestacks.BstCommandProcessor", "/data/misc/profiles/ref/com.bluestacks.appmart", "/data/misc/profiles/ref/com.bluestacks.bstfolder", "/data/misc/profiles/ref/com.bluestacks.home", "/data/misc/profiles/ref/com.bluestacks.filemanager", "/data/misc/profiles/ref/com.bluestacks.appguidance", "/data/media/0/Android/data/com.bluestacks.settings", "/data/media/0/Android/data/com.bluestacks.home", "/data/data/com.bluestacks.settings", "/data/data/com.bluestacks.BstCommandProcessor", "/data/data/com.bluestacks.appmart", "/data/data/com.bluestacks.bstfolder", "/data/data/com.bluestacks.home", "/data/data/com.bluestacks.filemanager", "/data/data/com.bluestacks.appguidance", "/data/downloads/com.bluestacks.appmart", "/data/downloads/com.bluestacks.home", "/data/downloads/com.bluestacks.filemanager", "/data/app-lib/com.bluestacks.settings", "/data/app-lib/com.bluestacks.BstCommandProcessor", "/data/app-lib/com.bluestacks.appmart", "/data/app-lib/com.bluestacks.bstfolder", "/data/app-lib/com.bluestacks.home", "/data/app-lib/com.bluestacks.filemanager", "/data/user_de/0/com.bluestacks.settings", "/data/user_de/0/com.bluestacks.BstCommandProcessor", "/data/user_de/0/com.bluestacks.appmart", "/data/user_de/0/com.bluestacks.bstfolder", "/data/user_de/0/com.bluestacks.home", "/data/user_de/0/com.bluestacks.filemanager", "/data/user_de/0/com.bluestacks.appguidance", "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.BstCommandProcessor@com.bluestacks.BstCommandProcessor.apk@classes.dex", "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.bstfolder@com.bluestacks.bstfolder.apk@classes.dex", "/data/dalvik-cache/x86/data@downloads@com.bluestacks.appmart@com.bluestacks.appmart.apk@classes.dex", "/data/dalvik-cache/x86/data@downloads@com.bluestacks.filemanager@com.bluestacks.filemanager.apk@classes.dex", "/data/dalvik-cache/x86/data@downloads@com.bluestacks.home@com.bluestacks.home.apk@classes.dex", "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.settings@com.bluestacks.settings.apk@classes.dex", "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.BstCommandProcessor@com.bluestacks.BstCommandProcessor.apk@classes.dex", "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.bstfolder@com.bluestacks.bstfolder.apk@classes.dex", "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.appmart@com.bluestacks.appmart.apk@classes.dex", "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.filemanager@com.bluestacks.filemanager.apk@classes.dex", "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.home@com.bluestacks.home.apk@classes.dex", "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.settings@com.bluestacks.settings.apk@classes.dex", "/system/lib64/libbstfolder_jni.so", "/system/lib64/egl/libGLES_bst.so", "/system/lib64/hw/gralloc.bst.so", "/system/lib/libbstfolder_jni.so", "/system/lib/egl/libGLES_bst.so", "/system/lib/hw/gralloc.bst.so", "/system/bin/bstsvcmgrtest", "/system/bin/bstshutdown_core", "/system/bin/bstfolderd", "/system/bin/bstfolder_ctl", "/system/bin/bstime", "/system/bin/bstsyncfs", "/system/bin/bstshutdown", "/system/xbin/bstk", "/storage/emulated/0/.bstshutdown_sync", "/mnt/runtime/write/emulated/0/.bstshutdown_sync", "/mnt/runtime/read/emulated/0/.bstshutdown_sync", "/mnt/runtime/default/emulated/0/.bstshutdown_sync", "/data/media/0/.bstshutdown_sync", "/data/downloads/.bstABI2Apps", "/sys/devices/virtual/bstsensor", "/sys/devices/virtual/misc/bst_ime", "/sys/devices/virtual/misc/bst_gps", "/sys/devices/virtual/misc/bstpgaipc", "/sys/class/bstsensor", "/sys/class/misc/bst_ime", "/sys/class/misc/bst_gps", "/sys/class/misc/bstpgaipc", "/sys/bus/pci/drivers/bstsensor", "/sys/bus/pci/drivers/bstvideo", "/sys/bus/pci/drivers/bstaudio", "/sys/bus/pci/drivers/bstcamera", "/sys/bus/pci/drivers/bstinput", "/sys/bus/pci/drivers/bstpgaipc", "/sys/module/bstsensor", "/sys/module/bstvideo", "/sys/module/bstaudio", "/sys/module/bstcamera", "/sys/module/videobuf_core/holders/bstcamera", "/sys/module/bstinput", "/sys/module/bstpgaipc", "/proc/irq/16/bstcamera", "/proc/irq/17/bstaudio", "/proc/irq/18/bstinput", "/proc/irq/22/bstpgaipc", "/proc/irq/23/bstsensor", "/proc/bstid", "/proc/asound/bstaudio", "/proc/bstfolder_exports", "/boot/android/android/system/lib64/egl/libGLES_bst.so", "/boot/android/android/system/lib64/hw/gralloc.bst.so", "/boot/android/android/system/lib/egl/libGLES_bst.so", "/boot/android/android/system/lib/hw/gralloc.bst.so", "/boot/android/android/system/bin/bstsvcmgrtest", "/boot/android/android/system/bin/bstshutdown_core", "/boot/android/android/system/bin/bstfolderd", "/boot/android/android/system/bin/bstfolder_ctl", "/boot/android/android/system/bin/bstime", "/boot/android/android/system/bin/bstsyncfs", "/boot/android/android/system/bin/bstshutdown", "/boot/android/android/system/xbin/bstk", "/boot/bstsetup.env", "/boot/bstmods", "/dev/bstpgaipc", "/dev/bst_gps", "/dev/bst_ime", "/dev/bstgyro", "/dev/bstorie", "/dev/bstmegn", "/dev/bstacce", "/dev/socket/bstfolderd"};
            int i = 0;
            while (true) {
                if (i >= 143) {
                    strF = null;
                    break;
                } else {
                    if (new File(strArr[i]).exists()) {
                        strF = b2.f(2131296302);
                        break;
                    }
                    i++;
                }
            }
            if (strF == null) {
                return;
            }
            n2.d().postDelayed(f1.J(null, Tools.L1(Tools.N1(2131296968), strF) + b2.f(2131296444), 32L, true), 30000L);
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((Config.f30c & 8) != 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            String[] strArrE = n0.e();
            for (int i = 2; i < strArrE.length; i += 2) {
                String str = strArrE[i];
                int i2 = i + 1;
                if (Tools.e1(strArrE[i2])) {
                    sb.append('\n');
                    sb.append(str);
                    sb.append(" (");
                    sb.append(strArrE[i2]);
                    sb.append(')');
                }
            }
            if (sb.length() == 0) {
                return;
            }
            sb.append('\n');
            n2.i(f1.J(r.p, Tools.L1(b2.f(2131296730), sb.toString()), 8L, false));
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f976b;

        class a implements DialogInterface.OnDismissListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                m.this.f976b.run();
            }
        }

        m(Context context, Runnable runnable) {
            this.f975a = context;
            this.f976b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AlertDialog alertDialogCreate = android.ext.f.c(this.f975a).setMessage(b2.g("     15. __help_faq_15_q__\r\n        __help_faq_15_a__\r\n\r\n     16. __help_faq_16_q__\r\n        __help_faq_16_a__\r\n\r\n     17. __help_faq_17_q__\r\n        __help_faq_17_a__\r\n\r\n__rtfm__")).setNegativeButton(b2.f(2131296836), (DialogInterface.OnClickListener) null).create();
                if (this.f976b != null) {
                    android.ext.f.k(alertDialogCreate, new a());
                }
                android.ext.f.m(alertDialogCreate);
            } catch (Throwable th) {
                e1.l("Failed faq alert", th);
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.e.a("AndroidService", "wait 4");
            n2.d().removeCallbacks(this);
            f1.p();
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Context contextF0 = Tools.f0();
                ComponentName componentNameU = f1.u();
                e1.e.a("AndroidService", "Restart: true " + Config.z + ' ' + componentNameU);
                if (!Config.vSpaceReal && Config.z == 0 && componentNameU != null && contextF0.startInstrumentation(componentNameU, null, r.u())) {
                    e1.e.a("AndroidService", "Restart 1");
                }
                e1.e.a("AndroidService", "Restart 2");
                String strC0 = Tools.C0();
                String strT = r.t();
                Tools.w1(200, new ComponentName(strC0, strT), 1);
                Intent intentN0 = Tools.N0(contextF0, strC0, strT);
                e1.d("Restart: " + intentN0);
                ((AlarmManager) contextF0.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000, PendingIntent.getActivity(contextF0, 123456, intentN0, 268435456));
                f1.n();
            } catch (Throwable th) {
                throw new RuntimeException("Failed restart", th);
            }
        }
    }

    static boolean A() {
        Throwable th;
        boolean z;
        String str;
        v.f1278b = true;
        try {
            ComponentName componentNameStartService = r.p.startService(new Intent().setClassName(Tools.C0(), AnalyticsService.class.getName()));
            z = componentNameStartService != null;
            if (componentNameStartService == null) {
                str = null;
            } else {
                try {
                    str = componentNameStartService.toString() + ' ' + componentNameStartService.toShortString();
                } catch (Throwable th2) {
                    th = th2;
                    e1.l("Failed load Service", th);
                }
            }
            B(10, str);
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        return z;
    }

    static void B(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("main ");
        sb.append(i2);
        sb.append(':');
        sb.append(Process.myUid());
        sb.append(": ");
        sb.append(u.c());
        sb.append(' ');
        sb.append(r.n == null ? null : Boolean.valueOf(r.n.f1206d));
        sb.append(' ');
        sb.append(u.f1267b);
        sb.append(' ');
        sb.append(v.f1277a);
        sb.append(' ');
        sb.append(str);
        e1.d(sb.toString());
    }

    private static void C() {
        try {
            File file = new File(Tools.q0(), "client_exit");
            if (file.exists() || file.createNewFile()) {
                return;
            }
            e1.e.a("AndroidService", "Failed mark client exit");
        } catch (Throwable th) {
            e1.e.a("AndroidService", "Failed mark client exit: " + th);
        }
    }

    public static void D() {
        r.n.L(2);
        if (f954d) {
            return;
        }
        f954d = true;
        h0.i();
        StringBuilder sb = new StringBuilder();
        sb.append("GG started: ");
        float f2 = 1;
        sb.append((108.9f * f2) - 7.5f);
        sb.append(" (");
        sb.append((int) (((f2 * 16916.8f) - 761.8f) + 0.5f));
        sb.append(") on ");
        sb.append(h0.b());
        e1.h(sb.toString());
        new r0(false);
        new h2(0L, 0L, 0);
        if (!s1.E()) {
            r.n.m();
            z.m();
        }
        t.c();
        y0.e();
        new q1().h();
        h();
        n0.b();
        B(5, null);
        b();
        l();
        c();
        j();
        g();
        k();
        if (!s1.E()) {
            d(false);
        }
        c1.g();
        p2.i();
        ConfigListAdapter.j(3);
    }

    private static String E() {
        File file = new File(Tools.q0(), "FC.txt");
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[41];
                int i2 = fileInputStream.read(bArr);
                return i2 > 0 ? new String(bArr, 0, i2) : null;
            } finally {
                fileInputStream.close();
            }
        } catch (Throwable th) {
            e1.l("Fail get FC file", th);
            return null;
        }
    }

    static void F() {
        if (t()) {
            return;
        }
        boolean zQ = s1.Q();
        String strE = E();
        boolean zC = s0.c(s0.a(strE), s0.e(strE), s(), m());
        d(true);
        a();
        if (!zC || zQ) {
            return;
        }
        s1.v(4, "");
    }

    static boolean G(Runnable runnable) {
        return e(false, runnable);
    }

    public static void H() {
        if (f953c == 0) {
            return;
        }
        n2.i(new o());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0026 -> B:16:0x0029). Please report as a decompilation issue!!! */
    static void I() {
        Context baseContext;
        Context context = null;
        try {
            int i2 = Config.z;
            if (i2 == 2) {
                baseContext = r.n.createPackageContext(r.n.getPackageName(), 3);
            } else if (i2 != 3) {
                baseContext = i2 != 4 ? null : r.n.getBaseContext();
            } else {
                baseContext = r.o;
            }
        } catch (Throwable th) {
            e1.a(th);
        }
        e1.d("setContext: " + Config.z + ' ' + baseContext);
        if (baseContext != null) {
            try {
                ((a.d) a.f.a(LayoutInflater.from(baseContext))).inflate(2131099677, (ViewGroup) null);
            } catch (Throwable th2) {
                e1.s("Failed use context: " + baseContext, th2);
            }
        }
        context = baseContext;
        if (context != null) {
            Tools.X0(context);
            MainService.context = l2.i(context);
            O();
            D();
            return;
        }
        v.f1280d = true;
        if (A()) {
            return;
        }
        Tools.J1(Tools.N1(2131296350) + ": " + b2.f(2131296955));
        r.n.T();
    }

    static Runnable J(Context context, String str, long j2, boolean z) {
        return new i(context, str, j2);
    }

    public static void K() {
        n2.i(new a());
    }

    static void L() {
        r.n.L(1);
        b1.z1();
    }

    static void M() {
        z0.h();
    }

    private static boolean N() {
        boolean zStopService = false;
        try {
            Context contextF0 = Tools.f0();
            if (contextF0 != null) {
                zStopService = contextF0.stopService(new Intent().setClassName(Tools.C0(), AnalyticsService.class.getName()));
                B(100, " " + zStopService);
            } else {
                B(101, "");
            }
        } catch (Throwable th) {
            e1.l("Failed unload Service", th);
        }
        return zStopService;
    }

    static void O() {
        if (Config.z == 1) {
            return;
        }
        if ((Config.B & 256) != 0) {
            A();
        } else {
            N();
        }
    }

    private static void P(File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(s0.b(s(), m()).getBytes());
            } finally {
                fileOutputStream.close();
            }
        } catch (Throwable th) {
            e1.l("Fail set FC file", th);
        }
    }

    static void a() {
        if (t()) {
            return;
        }
        File file = new File(Tools.q0(), "FC.txt");
        if (file.exists()) {
            return;
        }
        P(file);
    }

    public static void b() {
        new g0(new g(), "checkAutoTranslation").start();
    }

    private static void c() {
        new g0(new l(), "checkBadApps").start();
    }

    private static void d(boolean z) {
        e(z, null);
    }

    private static boolean e(boolean z, Runnable runnable) {
        boolean z2 = false;
        if (t()) {
            return false;
        }
        File file = new File(Tools.q0(), "FC.txt");
        if (z) {
            file.delete();
            return false;
        }
        String strE = E();
        if (s0.c(s0.a(strE), s0.e(strE), s(), m())) {
            z2 = true;
            boolean[] zArr = new boolean[1];
            AlertDialog alertDialogCreate = android.ext.f.b().setMessage(b2.f(2131296468)).setPositiveButton(b2.f(2131296455), new e(zArr, runnable)).setNegativeButton(b2.f(2131296963), w(64L)).setNeutralButton(b2.f(2131296519), new d()).create();
            if (runnable != null) {
                android.ext.f.k(alertDialogCreate, new f(zArr, runnable));
            }
            android.ext.f.m(alertDialogCreate);
        }
        file.delete();
        P(file);
        return z2;
    }

    static void f(byte b2) {
        File file = new File(Tools.q0(), "instr.check");
        int i2 = (int) (((1 * 16258.4f) - 103.4f) + 0.5f);
        if (b2 == 0) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(Integer.toString(i2).getBytes());
                    return;
                } finally {
                    fileOutputStream.close();
                }
            } catch (Throwable th) {
                e1.l("Fail set instr file", th);
                return;
            }
        }
        if (b2 == 1) {
            if (!file.exists()) {
                e1.i("No instr file: " + file);
            }
        } else {
            if (!file.exists()) {
                return;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[12];
                    int i3 = fileInputStream.read(bArr);
                    if ((i3 > 0 ? Integer.parseInt(new String(bArr, 0, i3)) : 0) == i2 && Config.z == 0) {
                        Config.b(2131034157).f42d = 1;
                        Config.k();
                    }
                    fileInputStream.close();
                } catch (Throwable th2) {
                    fileInputStream.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                e1.l("Fail get instr file", th3);
            }
        }
        file.delete();
    }

    private static void g() {
        if ((Config.f30c & 128) != 0) {
            return;
        }
        try {
            String strL1 = Tools.L1("%e", Float.valueOf(1.2E34f));
            if (strL1.indexOf(101) == -1 && strL1.indexOf(69) == -1 && strL1.indexOf(1077) == -1 && strL1.indexOf(1045) == -1) {
                n2.i(J(r.p, Tools.L1(b2.f(2131297113), Float.toString(1.2E34f), strL1), 128L, false));
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    private static void h() {
        new g0(new b(), "checkNewVersion").start();
    }

    static void i() {
        if (Tools.e1("com.chaozhuo.permission.controller") && (Config.f30c & 4) == 0) {
            n2.i(J(r.p, b2.f(2131296791) + "\n\n" + Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25<70krz0wr0uxq0lq0skrhql{rv0jdphjxdugldq2"), 4L, true));
        }
    }

    private static void j() {
        new g0(new j(), "checkRandomName").start();
    }

    private static void k() {
        File file = new File(Tools.q0(), "sel.txt");
        try {
            if (file.exists()) {
                if ((Config.A & 4) != 0) {
                    file.delete();
                } else {
                    d(true);
                    android.ext.f.m(android.ext.f.b().setCustomTitle(Tools.g0(2131296736)).setItems(new String[]{b2.f(2131297104), b2.f(2131296963)}, new c(file)).create());
                }
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    private static void l() {
        new g0(new k(), "checkSlowEmulator").start();
    }

    private static long m() {
        try {
            PackageInfo packageInfoA0 = Tools.A0(Tools.C0(), 0);
            if (packageInfoA0 != null) {
                return packageInfoA0.lastUpdateTime;
            }
            return -1L;
        } catch (Throwable th) {
            e1.l("Fail get package info", th);
            return -1L;
        }
    }

    public static void n() {
        C();
        N();
        e1.e.a("AndroidService", "Main: die");
        try {
            System.exit(0);
        } catch (Throwable th) {
            e1.e.d("AndroidService", "OnExit", th);
        }
        e1.e.a("AndroidService", "exit: 14");
        try {
            Runtime.getRuntime().halt(0);
        } catch (Throwable th2) {
            e1.e.d("AndroidService", "OnExit", th2);
        }
        e1.e.a("AndroidService", "exit: 15");
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable th3) {
            e1.e.d("AndroidService", "OnExit", th3);
        }
        e1.e.a("AndroidService", "exit: 16");
        try {
            e2.n("exec kill " + Process.myPid(), 45);
        } catch (Throwable th4) {
            e1.e.d("AndroidService", "OnExit", th4);
        }
        e1.e.a("AndroidService", "exit: 17");
        throw new n0.h("Failed exit from the app normally");
    }

    public static void o() {
        e1.d("Main: exit");
        boolean z = true;
        f952b = true;
        try {
            if (MainService.instance != null) {
                MainService.instance.m1(true);
                MainService.instance.a0();
            }
        } catch (Throwable th) {
            e1.s("Exception on exit", th);
        }
        e1.e.a("AndroidService", "exit: 1");
        new File(Tools.q0(), "sel.txt").delete();
        d(true);
        e1.e.a("AndroidService", "exit: 2");
        try {
            e1.b();
        } catch (Throwable th2) {
            e1.e.d("AndroidService", "OnExit", th2);
        }
        e1.e.a("AndroidService", "exit: 3");
        boolean z2 = v.f1277a != null;
        n nVar = new n();
        e1.e.a("AndroidService", "wait 1: " + z2);
        if (z2) {
            v.f1279c = nVar;
            v.f1277a.c();
        }
        if (!N() && !z2) {
            z = false;
        }
        e1.e.a("AndroidService", "wait 2: " + z);
        if (!z) {
            p();
            return;
        }
        if (v.f1279c == null) {
            v.f1279c = nVar;
        }
        n2.d().postDelayed(nVar, 3000L);
    }

    static void p() {
        C();
        try {
            H();
        } catch (Throwable th) {
            e1.e.d("AndroidService", "OnExit", th);
        }
        e1.e.a("AndroidService", "exit: 4");
        try {
            n2.a();
        } catch (Throwable th2) {
            e1.e.d("AndroidService", "OnExit", th2);
        }
        e1.e.a("AndroidService", "exit: 5");
        try {
            u.a();
        } catch (Throwable th3) {
            e1.e.d("AndroidService", "OnExit", th3);
        }
        e1.e.a("AndroidService", "exit: 6");
        File file = new File(Tools.b0(), "skipFinalization");
        e1.e.a("AndroidService", "exit: 7");
        if (!file.exists()) {
            e1.e.a("AndroidService", "exit: 8");
            try {
                file.createNewFile();
            } catch (Throwable th4) {
                e1.e.d("AndroidService", "OnExit", th4);
            }
            e1.e.a("AndroidService", "exit: 9");
            try {
                System.runFinalization();
            } catch (Throwable th5) {
                e1.e.d("AndroidService", "OnExit", th5);
            }
            e1.e.a("AndroidService", "exit: 10");
            try {
                file.delete();
            } catch (Throwable th6) {
                e1.e.d("AndroidService", "OnExit", th6);
            }
        }
        e1.e.a("AndroidService", "exit: 11");
        if (!Config.vSpaceReal) {
            try {
                e2.n("exec am force-stop " + Tools.C0(), 45);
            } catch (Throwable th7) {
                e1.e.d("AndroidService", "OnExit", th7);
            }
            e1.e.a("AndroidService", "exit: 12");
            try {
                e2.n("exec am kill " + Tools.C0(), 45);
            } catch (Throwable th8) {
                e1.e.d("AndroidService", "OnExit", th8);
            }
            e1.e.a("AndroidService", "exit: 13");
        }
        n();
    }

    public static void q(Context context) {
        r(context, null);
    }

    public static void r(Context context, Runnable runnable) {
        n2.i(new m(context, runnable));
    }

    private static int s() {
        return (int) (((1 * 17371.5f) - 1216.5f) + 0.5f);
    }

    private static boolean t() {
        return ((Config.f30c & 64) == 0 && (Config.B & 8192) == 0) ? false : true;
    }

    static ComponentName u() {
        try {
            return new ComponentName(Tools.C0(), Instrumentation.class.getName());
        } catch (Throwable th) {
            e1.a(th);
            return null;
        }
    }

    static String v() {
        int i2;
        int i3;
        int i4 = 0;
        try {
            Resources resources = Tools.f0().getResources();
            Configuration configuration = resources.getConfiguration();
            try {
                i3 = configuration.screenWidthDp;
                try {
                    i2 = configuration.screenHeightDp;
                    i4 = i3;
                } catch (Throwable th) {
                    th = th;
                    try {
                        e1.a(th);
                        i4 = i3;
                        i2 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        i4 = i3;
                        i2 = 0;
                        e1.a(th);
                        return "" + i4 + 'x' + i2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                i3 = 0;
            }
            try {
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (i4 == 0 && displayMetrics != null) {
                    float f2 = displayMetrics.density;
                    if (f2 != 0.0f) {
                        i4 = (int) (displayMetrics.widthPixels / f2);
                    }
                }
                if (i2 == 0 && displayMetrics != null) {
                    float f3 = displayMetrics.density;
                    if (f3 != 0.0f) {
                        i2 = (int) (displayMetrics.heightPixels / f3);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                e1.a(th);
            }
        } catch (Throwable th5) {
            th = th5;
        }
        return "" + i4 + 'x' + i2;
    }

    static DialogInterface.OnClickListener w(long j2) {
        return new h(j2);
    }

    static String x() {
        if (Config.C) {
            return Config.E;
        }
        if (!Config.vSpaceReal) {
            return e2.h(null);
        }
        return e2.h(null) + "@" + Config.E;
    }

    public static boolean y() {
        return z(null, null);
    }

    public static boolean z(Context context, DialogInterface.OnDismissListener onDismissListener) {
        if (!Config.C) {
            return true;
        }
        if (context == null) {
            context = Tools.f0();
        }
        AlertDialog alertDialogCreate = android.ext.f.c(context).setMessage(b2.f(2131296797)).setNegativeButton(b2.f(2131296836), (DialogInterface.OnClickListener) null).create();
        if (onDismissListener != null) {
            android.ext.f.k(alertDialogCreate, onDismissListener);
        }
        android.ext.f.m(alertDialogCreate);
        return false;
    }
}
