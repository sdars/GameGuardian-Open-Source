package android.ext;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import catch_.me_.if_.you_.can_.AnalyticsService;
import catch_.me_.if_.you_.can_.Instrumentation;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Boolean f951a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f952b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile int f953c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile boolean f954d = false;

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

    static void B(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("main ");
        sb.append(i);
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
            e1$e.a("AndroidService", "Failed mark client exit");
        } catch (Throwable th) {
            e1$e.a("AndroidService", "Failed mark client exit: " + th);
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
                int i = fileInputStream.read(bArr);
                String str = i > 0 ? new String(bArr, 0, i) : null;
                fileInputStream.close();
                return str;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            e1.l("Fail get FC file", th2);
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
        n2.i(new f1$o());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0026 -> B:16:0x0029). Please report as a decompilation issue!!! */
    static void I() {
        Context baseContext;
        Context context = null;
        try {
            int i = Config.z;
            if (i == 2) {
                baseContext = r.n.createPackageContext(r.n.getPackageName(), 3);
            } else if (i != 3) {
                baseContext = i != 4 ? null : r.n.getBaseContext();
            } else {
                baseContext = r.o;
            }
        } catch (Throwable th) {
            e1.a(th);
        }
        e1.d("setContext: " + Config.z + ' ' + baseContext);
        if (baseContext != null) {
            try {
                ((a.d) a.f.a(LayoutInflater.from(baseContext))).inflate(R$layout.service_dialog, (ViewGroup) null);
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
        Tools.J1(Tools.N1(R$string.could_not_use) + ": " + b2.f(R$string.service));
        r.n.T();
    }

    static Runnable J(Context context, String str, long j, boolean z) {
        return new f1$i(context, str, j);
    }

    public static void K() {
        n2.i(new f1$a());
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
                fileOutputStream.close();
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            e1.l("Fail set FC file", th2);
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
        new g0(new f1$g(), "checkAutoTranslation").start();
    }

    private static void c() {
        new g0(new f1$l(), "checkBadApps").start();
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
            AlertDialog alertDialogCreate = f.b().setMessage(b2.f(R$string.force_close_)).setPositiveButton(b2.f(R$string.fix_it), new f1$e(zArr, runnable)).setNegativeButton(b2.f(R$string.skip), w(64L)).setNeutralButton(b2.f(R$string.help), new f1$d()).create();
            if (runnable != null) {
                f.k(alertDialogCreate, new f1$f(zArr, runnable));
            }
            f.m(alertDialogCreate);
        }
        file.delete();
        P(file);
        return z2;
    }

    static void f(byte b2) {
        File file = new File(Tools.q0(), "instr.check");
        int i = (int) (((1 * 16258.4f) - 103.4f) + 0.5f);
        if (b2 == 0) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(Integer.toString(i).getBytes());
                    fileOutputStream.close();
                    return;
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                e1.l("Fail set instr file", th2);
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
                    int i2 = fileInputStream.read(bArr);
                    if ((i2 > 0 ? Integer.parseInt(new String(bArr, 0, i2)) : 0) == i && Config.z == 0) {
                        Config.b(R$id.config_context_source).f42d = 1;
                        Config.k();
                    }
                    fileInputStream.close();
                } catch (Throwable th3) {
                    fileInputStream.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                e1.l("Fail get instr file", th4);
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
                n2.i(J(r.p, Tools.L1(b2.f(R$string.wrong_float_), Float.toString(1.2E34f), strL1), 128L, false));
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    private static void h() {
        new g0(new f1$b(), "checkNewVersion").start();
    }

    static void i() {
        if (Tools.e1("com.chaozhuo.permission.controller") && (Config.f30c & 4) == 0) {
            n2.i(J(r.p, b2.f(R$string.need_allow_background) + "\n\n" + Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25<70krz0wr0uxq0lq0skrhql{rv0jdphjxdugldq2"), 4L, true));
        }
    }

    private static void j() {
        new g0(new f1$j(), "checkRandomName").start();
    }

    private static void k() {
        File file = new File(Tools.q0(), "sel.txt");
        try {
            if (file.exists()) {
                if ((Config.A & 4) != 0) {
                    file.delete();
                } else {
                    d(true);
                    f.m(f.b().setCustomTitle(Tools.g0(R$string.last_run_failed)).setItems(new String[]{b2.f(R$string.work_with_selinux), b2.f(R$string.skip)}, new f1$c(file)).create());
                }
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    private static void l() {
        new g0(new f1$k(), "checkSlowEmulator").start();
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
        e1$e.a("AndroidService", "Main: die");
        try {
            System.exit(0);
        } catch (Throwable th) {
            e1$e.d("AndroidService", "OnExit", th);
        }
        e1$e.a("AndroidService", "exit: 14");
        try {
            Runtime.getRuntime().halt(0);
        } catch (Throwable th2) {
            e1$e.d("AndroidService", "OnExit", th2);
        }
        e1$e.a("AndroidService", "exit: 15");
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable th3) {
            e1$e.d("AndroidService", "OnExit", th3);
        }
        e1$e.a("AndroidService", "exit: 16");
        try {
            e2.n("exec kill " + Process.myPid(), 45);
        } catch (Throwable th4) {
            e1$e.d("AndroidService", "OnExit", th4);
        }
        e1$e.a("AndroidService", "exit: 17");
        throw new n0$h("Failed exit from the app normally");
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
        e1$e.a("AndroidService", "exit: 1");
        new File(Tools.q0(), "sel.txt").delete();
        d(true);
        e1$e.a("AndroidService", "exit: 2");
        try {
            e1.b();
        } catch (Throwable th2) {
            e1$e.d("AndroidService", "OnExit", th2);
        }
        e1$e.a("AndroidService", "exit: 3");
        boolean z2 = v.f1277a != null;
        f1$n f1_n = new f1$n();
        e1$e.a("AndroidService", "wait 1: " + z2);
        if (z2) {
            v.f1279c = f1_n;
            v.f1277a.c();
        }
        if (!N() && !z2) {
            z = false;
        }
        e1$e.a("AndroidService", "wait 2: " + z);
        if (!z) {
            p();
            return;
        }
        if (v.f1279c == null) {
            v.f1279c = f1_n;
        }
        n2.d().postDelayed(f1_n, 3000L);
    }

    static void p() {
        C();
        try {
            H();
        } catch (Throwable th) {
            e1$e.d("AndroidService", "OnExit", th);
        }
        e1$e.a("AndroidService", "exit: 4");
        try {
            n2.a();
        } catch (Throwable th2) {
            e1$e.d("AndroidService", "OnExit", th2);
        }
        e1$e.a("AndroidService", "exit: 5");
        try {
            u.a();
        } catch (Throwable th3) {
            e1$e.d("AndroidService", "OnExit", th3);
        }
        e1$e.a("AndroidService", "exit: 6");
        File file = new File(Tools.b0(), "skipFinalization");
        e1$e.a("AndroidService", "exit: 7");
        if (!file.exists()) {
            e1$e.a("AndroidService", "exit: 8");
            try {
                file.createNewFile();
            } catch (Throwable th4) {
                e1$e.d("AndroidService", "OnExit", th4);
            }
            e1$e.a("AndroidService", "exit: 9");
            try {
                System.runFinalization();
            } catch (Throwable th5) {
                e1$e.d("AndroidService", "OnExit", th5);
            }
            e1$e.a("AndroidService", "exit: 10");
            try {
                file.delete();
            } catch (Throwable th6) {
                e1$e.d("AndroidService", "OnExit", th6);
            }
        }
        e1$e.a("AndroidService", "exit: 11");
        if (!Config.vSpaceReal) {
            try {
                e2.n("exec am force-stop " + Tools.C0(), 45);
            } catch (Throwable th7) {
                e1$e.d("AndroidService", "OnExit", th7);
            }
            e1$e.a("AndroidService", "exit: 12");
            try {
                e2.n("exec am kill " + Tools.C0(), 45);
            } catch (Throwable th8) {
                e1$e.d("AndroidService", "OnExit", th8);
            }
            e1$e.a("AndroidService", "exit: 13");
        }
        n();
    }

    public static void q(Context context) {
        r(context, null);
    }

    public static void r(Context context, Runnable runnable) {
        n2.i(new f1$m(context, runnable));
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
        int i;
        int i2;
        int i3 = 0;
        try {
            Resources resources = Tools.f0().getResources();
            Configuration configuration = resources.getConfiguration();
            try {
                i2 = configuration.screenWidthDp;
                try {
                    i = configuration.screenHeightDp;
                    i3 = i2;
                } catch (Throwable th) {
                    th = th;
                    try {
                        e1.a(th);
                        i3 = i2;
                        i = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        i3 = i2;
                        i = 0;
                        e1.a(th);
                        return "" + i3 + 'x' + i;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                i2 = 0;
            }
            try {
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (i3 == 0 && displayMetrics != null) {
                    float f2 = displayMetrics.density;
                    if (f2 != 0.0f) {
                        i3 = (int) (displayMetrics.widthPixels / f2);
                    }
                }
                if (i == 0 && displayMetrics != null) {
                    float f3 = displayMetrics.density;
                    if (f3 != 0.0f) {
                        i = (int) (displayMetrics.heightPixels / f3);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                e1.a(th);
            }
        } catch (Throwable th5) {
            th = th5;
        }
        return "" + i3 + 'x' + i;
    }

    static DialogInterface$OnClickListener w(long j) {
        return new f1$h(j);
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

    public static boolean z(Context context, DialogInterface$OnDismissListener dialogInterface$OnDismissListener) {
        if (!Config.C) {
            return true;
        }
        if (context == null) {
            context = Tools.f0();
        }
        AlertDialog alertDialogCreate = f.c(context).setMessage(b2.f(R$string.need_root_mode)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null).create();
        if (dialogInterface$OnDismissListener != null) {
            f.k(alertDialogCreate, dialogInterface$OnDismissListener);
        }
        f.m(alertDialogCreate);
        return false;
    }
}
