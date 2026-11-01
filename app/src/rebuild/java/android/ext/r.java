package android.ext;

import android.animation.ValueAnimator;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.ActivityMain;
import catch_.me_.if_.you_.can_.MainActivity;
import catch_.me_.if_.you_.can_.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends gga.a implements View.OnClickListener {
    public static volatile boolean k = false;
    public static volatile boolean l = true;
    public static volatile boolean m = false;
    public static volatile r n = null;
    public static volatile Context o = null;
    public static volatile Context p = null;
    public static volatile boolean q = true;
    private static volatile boolean r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f1206d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f1207e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f1208f = new WeakReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference f1209g = new WeakReference(null);
    private WeakReference h = new WeakReference(null);
    private StringBuilder i = new StringBuilder();
    private Runnable j;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1210a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f1211b;

        a(Bundle bundle) {
            this.f1211b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.d(this + ": 1200");
            if (!this.f1210a) {
                this.f1210a = true;
                r.this.F(this.f1211b);
            } else {
                e1.d(this + ": already");
            }
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f1213a;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    r.p.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2"))));
                } catch (Throwable th) {
                    e1.s("Failed call activity", th);
                }
                new p0(1400).onClick(null, 0);
            }
        }

        b(Runnable runnable) {
            this.f1213a = runnable;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f1213a.run();
            } else if (i != 1) {
                new p0(1500).onClick(null, 0);
            } else {
                android.ext.f.o(android.ext.f.c(r.p).setMessage(b2.f(R.string.how_no_root)).setCancelable(false).setPositiveButton(b2.f(R.string.ok), new a()));
                r.k();
            }
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                r.p.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/android/answer/6088895")));
            } catch (Throwable th) {
                e1.s("Failed call activity", th);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService.instance.e1();
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[PHI: r4
          0x0065: PHI (r4v6 android.ext.Config$p) = (r4v2 android.ext.Config$p), (r4v8 android.ext.Config$p) binds: [B:33:0x0093, B:26:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Config.p pVarB;
            int i2 = 1;
            switch (i) {
                case 0:
                    r0.d(m2.f1074a);
                    r.I();
                    break;
                case 1:
                    pVarB = Config.b(R.id.selinux);
                    if ((Config.A & 4) != 0) {
                        i2 = 0;
                    }
                    pVarB.f42d = i2;
                    Config.k();
                    r.I();
                    break;
                case 2:
                    new z(r.this).J();
                    break;
                case 3:
                    Config.b(R.id.config_float_type).f42d = -1;
                    Config.b(R.id.config_float_flags).f42d = -1;
                    Config.k();
                    r.I();
                    break;
                case 4:
                    pVarB = Config.b(R.id.config_use_notification);
                    if ((Config.B & 256) != 0) {
                        i2 = 0;
                    }
                    pVarB.f42d = i2;
                    Config.k();
                    r.I();
                    break;
                case 5:
                    Config.b(R.id.config_hot_key).b();
                    break;
                case 6:
                    r.this.T();
                    break;
                case 7:
                    Config.f30c = 0L;
                    Config.k();
                    r.I();
                    break;
                case 8:
                    ConfigListAdapter.b();
                    break;
                case 9:
                    r.H();
                    break;
                case 10:
                    r.O();
                    break;
                case 11:
                    Config.b(R.id.config_prevent_unload).b();
                    break;
                case 12:
                    Config.b(R.id.config_acceleration).b();
                    break;
                case 13:
                    Config.b(R.id.config_vspace_root).b();
                    break;
                case 14:
                    Config.b(R.id.config_number_locale).b();
                    break;
                default:
                    r.I();
                    break;
            }
        }
    }

    class f implements Config.p.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Config.p f1217a;

        f(Config.p pVar) {
            this.f1217a = pVar;
        }

        @Override // android.ext.Config.p.b
        public void a(int i) {
            this.f1217a.g(null);
            r.I();
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1219a;

        g(String str) {
            this.f1219a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            try {
                String strV = r.v();
                File file = new File(strV);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                r.U(fileOutputStream, strV, this.f1219a);
                Tools.q(file, 420);
                String str2 = "chmod 0644 " + strV + " 2>&1 ; logcat -v threadtime -b main -b system *:V 2>&1 ; exit\n";
                if (strV.contains("/emulated/0")) {
                    str2 = "chmod 0644 " + strV.replace("/emulated/0", "/emulated/legacy") + " 2>&1 ; " + str2;
                }
                Process processQ = e2.q(str2);
                InputStream inputStream = processQ.getInputStream();
                byte[] bArr = new byte[8192];
                if (Tools.Z0(processQ)) {
                    str = b2.f(R.string.record_logcat) + ": " + b2.f(R.string.error);
                } else {
                    str = b2.f(R.string.record_logcat) + ": " + strV;
                }
                Tools.J1(str);
                while (!Thread.interrupted()) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        if (i == -1 && Tools.Z0(processQ)) {
                            break;
                        }
                    } else {
                        fileOutputStream.write(bArr, 0, i);
                        fileOutputStream.flush();
                    }
                }
                fileOutputStream.close();
                Tools.J1(b2.f(R.string.record_logcat) + ": " + b2.f(R.string.exit));
            } catch (Throwable th) {
                e1.a(th);
                Tools.J1(b2.f(R.string.record_logcat) + "> " + b2.f(R.string.error));
            }
        }
    }

    class h implements DialogInterface.OnClickListener {
        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Config.b(R.id.record_logcat).f42d = (int) (((1 * 16733.4f) - 578.4f) + 0.5f);
            Config.k();
            new p0(1400, true).onClick(null, 0);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1221a;

        i(int i) {
            this.f1221a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = (View) r.this.f1208f.get();
            if (view == null) {
                return;
            }
            View viewFindViewById = view.findViewById(R.id.loader);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(this.f1221a == 0 ? 0 : 8);
            }
            View viewFindViewById2 = view.findViewById(R.id.installer);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(this.f1221a == 1 ? 0 : 8);
            }
            View viewFindViewById3 = view.findViewById(R.id.starter);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(this.f1221a == 2 ? 0 : 8);
            }
            if (this.f1221a == 2) {
                if (viewFindViewById != null) {
                    Tools.O0(viewFindViewById);
                }
                if (viewFindViewById2 != null) {
                    Tools.O0(viewFindViewById2);
                }
            }
        }
    }

    class j implements DialogInterface.OnClickListener {
        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            boolean z = i == -1;
            new g2().putInt("odd-vspace", z ? 1 : 2).commit();
            if (z) {
                ConfigListAdapter.m();
            }
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1224a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f1225b;

        k(Bundle bundle) {
            this.f1225b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.d(this + ": 200");
            if (!this.f1224a) {
                this.f1224a = true;
                r.this.B(this.f1225b);
            } else {
                e1.d(this + ": already");
            }
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f1227a;

        l(Bundle bundle) {
            this.f1227a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.j = null;
            r.this.C(this.f1227a, false);
        }
    }

    class m implements e2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f1229a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f1231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1232b;

            a(r rVar, int i) {
                this.f1231a = rVar;
                this.f1232b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f1231a.G()) {
                    this.f1231a.E(m.this.f1229a, this.f1232b);
                    return;
                }
                e1.d(this.f1231a + ": drop root probe verdict " + this.f1232b);
            }
        }

        m(Bundle bundle) {
            this.f1229a = bundle;
        }

        @Override // android.ext.e2.c
        public void a(int i) {
            n2.i(new a(r.this, i));
        }
    }

    public static class n implements DialogInterface.OnClickListener, View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1234a;

        public n(String str) {
            this.f1234a = str == null ? "kwws=22jdphjxdugldq1qhw2grzqordg" : str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                Tools.f0().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Tools.removeNewLinesChars(this.f1234a))));
                android.ext.f.d();
            } catch (Throwable th) {
                e1.s("Failed call activity", th);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            onClick(null, 0);
        }
    }

    static {
        e1.d("BaseActivity clinit");
        android.ext.i.a();
        n0.f();
        r = false;
    }

    public r() {
        boolean z = this instanceof MainActivity;
        if (z || n == null) {
            n = this;
        }
        if (z || p == null) {
            p = this;
        }
        l = true ^ z;
        e1.d("BaseActivity init: " + this);
        n0.f();
    }

    private void A() {
        TextView textView = (TextView) this.f1209g.get();
        if (textView == null) {
            return;
        }
        CharSequence charSequence = (CharSequence) this.h.get();
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        String str = b2.f(R.string.download) + Tools.removeNewLinesChars("#kwws=22jdphjxdugldq1qhw2grzqordg") + "\n\n" + b2.f(R.string.front_text) + "\n\n";
        String strG = b2.g("     32. __help_faq_32_q__\r\n        __help_faq_32_b__\r\n\r\n__rtfm__");
        Tools.v1(textView, str + strG + ("\n\n" + b2.f(R.string.help_front)));
        Tools.u(textView.getText());
        Tools.v(textView.getText(), strG, Tools.d0(R.color.alert));
        this.h = new WeakReference(textView.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(Bundle bundle, int i2) {
        if (i2 == 1) {
            new g2().putInt("root-ok", (int) (((1 * 23979.6f) - 7824.6f) + 0.5f)).commit();
        }
        D(bundle, i2 != -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        return (this != n || isFinishing() || isDestroyed()) ? false : true;
    }

    static void H() {
        android.ext.f.o(android.ext.f.c(p).setMessage(Tools.L1(b2.f(R.string.record_logcat_info), v())).setPositiveButton(b2.f(R.string.ok), new h()).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null));
    }

    public static void I() {
        try {
            f1.f953c = 2;
            f1.o();
        } catch (Throwable th) {
            throw new RuntimeException("Failed restart", th);
        }
    }

    public static void J(Context context, long j2) {
        if (context == null) {
            return;
        }
        try {
            Tools.w1(200, new ComponentName(Tools.C0(), t()), 1);
            PendingIntent activity = PendingIntent.getActivity(context, 123456, Tools.N0(context, Tools.C0(), t()), 268435456);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (alarmManager != null) {
                alarmManager.set(1, System.currentTimeMillis() + j2, activity);
            }
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    public static void K(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("reminst")) {
            e1.d("removeInstaller: from bundle");
            m = true;
        }
        if (bundle.containsKey("hw")) {
            l = bundle.getBoolean("hw");
        }
        if (bundle.containsKey("uid")) {
            int i2 = bundle.getInt("uid");
            int iMyUid = Process.myUid();
            if (!bundle.getBoolean("vspace") || iMyUid == i2) {
                return;
            }
            e1.d("Kill by diff uids: " + iMyUid + " != " + i2);
            f1.n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a1  */
    private void N(String str) {
        String str2;
        String str3;
        StringBuilder sb = this.i;
        if (str.startsWith("/mnt/expand/")) {
            str = str.replace("/mnt/expand/" + str.split("/", -1)[3], "/data");
            r = true;
            sb.append("1\n");
        }
        if (!str.startsWith("/data/data/")) {
            if (str.startsWith("/data/user/")) {
                str2 = str.split("/", -1)[4];
                str3 = "3\n";
            } else {
                str2 = null;
            }
            Config.F = "";
            if (str2 != null) {
                sb.append(str2);
                sb.append("\n4\n");
                Config.C = !str2.startsWith(android.ext.i.f1002d);
                Config.E = str2;
                Config.D = str2.contains("vmos");
                try {
                    Config.F = Tools.a0(Tools.Y(str2));
                } catch (Throwable th) {
                    e1.s("Failed get vSpace name for " + str2, th);
                }
            }
            if (Config.F.length() == 0) {
                Config.F = b2.f(R.string.virtual_space);
            }
            sb.append(Config.C);
            sb.append('\n');
        }
        str2 = str.split("/", -1)[3];
        str3 = "2\n";
        sb.append(str3);
        Config.F = "";
        if (str2 != null) {
            sb.append(str2);
            sb.append("\n4\n");
            Config.C = !str2.startsWith(android.ext.i.f1002d);
            Config.E = str2;
            Config.D = str2.contains("vmos");
            Config.F = Tools.a0(Tools.Y(str2));
        }
        if (Config.F.length() == 0) {
            Config.F = b2.f(R.string.virtual_space);
        }
        sb.append(Config.C);
        sb.append('\n');
    }

    static void O() {
        StringBuilder sb = new StringBuilder();
        q(sb, 1);
        try {
            sb.append(n.getFilesDir());
        } catch (Throwable th) {
            sb.append(th);
        }
        q(sb, 2);
        int iMyUid = Process.myUid();
        try {
            sb.append(iMyUid);
        } catch (Throwable th2) {
            sb.append(th2);
        }
        q(sb, 3);
        try {
            sb.append(Arrays.toString(n.getPackageManager().getPackagesForUid(iMyUid)));
        } catch (Throwable th3) {
            sb.append(th3);
        }
        q(sb, 4);
        try {
            sb.append(Arrays.toString(n.getPackageManager().getPackageGids(n.getPackageName())));
        } catch (Throwable th4) {
            sb.append(th4);
        }
        q(sb, 5);
        try {
            sb.append(n.getPackageManager().getPackageUid(n.getPackageName(), 0));
        } catch (Throwable th5) {
            sb.append(th5);
        }
        q(sb, 6);
        try {
            sb.append(n.checkCallingOrSelfPermission(Tools.removeNewLinesChars("dqgurlg1shuplvvlrq1UHDGbVPV")));
        } catch (Throwable th6) {
            sb.append(th6);
        }
        sb.append(' ');
        sb.append(Tools.M0().getInt("odd-vspace", 0));
        q(sb, 7);
        try {
            sb.append(Build.VERSION.SDK_INT);
        } catch (Throwable th7) {
            sb.append(th7);
        }
        q(sb, 8);
        try {
            String str = Tools.f489a.nextInt() + ".txt";
            File file = new File(n.getFilesDir(), str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(new byte[4096]);
                fileOutputStream.flush();
                File file2 = new File("/proc/self/fd/" + android.lang.a.a(fileOutputStream.getFD()));
                sb.append(file2.getPath());
                sb.append(" -> ");
                sb.append(file2.getCanonicalPath());
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, 4096L);
                    l(sb, str);
                    map.capacity();
                    fileInputStream.close();
                } catch (Throwable th8) {
                    sb.append('\n');
                    sb.append(th8);
                }
                sb.append("\nN: '");
                sb.append(Tools.y0(file.getAbsolutePath()));
                sb.append('\'');
                fileOutputStream.close();
                file.delete();
            } catch (Throwable th9) {
                file.delete();
                throw th9;
            }
        } catch (Throwable th10) {
            sb.append(th10);
        }
        q(sb, 9);
        try {
            l(sb, n.getPackageName());
        } catch (Throwable th11) {
            sb.append(th11);
        }
        q(sb, 10);
        try {
            sb.append(ConfigListAdapter.k());
        } catch (Throwable th12) {
            sb.append(th12);
        }
        q(sb, 11);
        try {
            File file3 = new File("/proc/self/exe");
            sb.append(file3.getPath());
            sb.append(" -> ");
            sb.append(file3.getCanonicalPath());
        } catch (Throwable th13) {
            sb.append(th13);
        }
        q(sb, 12);
        try {
            sb.append(Process.myPid());
        } catch (Throwable th14) {
            sb.append(th14);
        }
        q(sb, 13);
        try {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/self/status");
            byte[] bArr = new byte[65536];
            int i2 = fileInputStream2.read(bArr);
            sb.append(i2);
            sb.append(" -> ");
            if (i2 > 0) {
                sb.append(new String(bArr, 0, i2));
            }
            fileInputStream2.close();
        } catch (Throwable th15) {
            sb.append(th15);
        }
        e1.d("FIN");
        Tools.h(sb.toString().trim(), 0);
    }

    private AlertDialog P(Context context) {
        AlertDialog.Builder customTitle = android.ext.f.c(context).setCustomTitle(Tools.g0(R.string.fix_it));
        String[] strArr = new String[15];
        strArr[0] = b2.f(m2.f1074a ? R.string.disable_floating_windows : R.string.enable_floating_windows);
        strArr[1] = b2.f((Config.A & 4) != 0 ? R.string.work_without_selinux : R.string.work_with_selinux);
        strArr[2] = b2.f(R.string.change_float_type);
        strArr[3] = b2.f(R.string.reset_float_type);
        strArr[4] = Config.b(R.id.config_use_notification).toString();
        strArr[5] = Config.b(R.id.config_hot_key).toString();
        strArr[6] = Config.b(R.id.config_context_source).toString();
        strArr[7] = b2.f(R.string.reset_ignore);
        strArr[8] = b2.f(R.string.su_command);
        strArr[9] = b2.f(R.string.record_logcat);
        strArr[10] = b2.f(R.string.show_debug_info);
        strArr[11] = Config.b(R.id.config_prevent_unload).toString();
        strArr[12] = Config.b(R.id.config_acceleration).toString();
        strArr[13] = Config.b(R.id.config_vspace_root).toString();
        strArr[14] = Config.b(R.id.config_number_locale).toString();
        return customTitle.setItems(strArr, new e()).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).create();
    }

    private void R(Bundle bundle) {
        e2.i(new m(bundle));
    }

    private static void S() {
        n2.d().post(new d());
    }

    static void U(OutputStream outputStream, String str, String str2) {
        try {
            outputStream.write(("\n\n" + new GregorianCalendar().getTime().toString() + '\n' + str + '\n' + h0.c() + '\n' + f1.x() + '\n' + Tools.f0().getFilesDir().getAbsolutePath() + '\n' + str2 + "\n\n").getBytes());
            outputStream.flush();
        } catch (Throwable th) {
            e1.s("Fail write logcat header", th);
        }
    }

    private static void i(Context context) {
        try {
            context.getSharedPreferences(MainService.G0, 0).edit().putBoolean("perm-restart", true).commit();
            J(context, 3000L);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    private static void j() {
        AlarmManager alarmManager;
        try {
            if (Tools.M0().contains("perm-restart")) {
                e1.d("cancelPermissionRestart");
                Tools.M0().edit().remove("perm-restart").commit();
            }
        } catch (Throwable th) {
            e1.a(th);
        }
        try {
            Context contextF0 = Tools.f0();
            if (contextF0 == null || (alarmManager = (AlarmManager) contextF0.getSystemService("alarm")) == null) {
                return;
            }
            alarmManager.cancel(PendingIntent.getActivity(contextF0, 123456, Tools.N0(contextF0, Tools.C0(), t()), 268435456));
        } catch (Throwable th2) {
            e1.a(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k() {
        if (r) {
            android.ext.f.o(android.ext.f.c(p).setMessage(b2.f(R.string.mnt_expand)).setNeutralButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null).setPositiveButton(b2.f(R.string.fix_it), new c()));
        }
    }

    private static void l(StringBuilder sb, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return;
            }
            int iIndexOf = line.indexOf(str);
            if (iIndexOf >= 0) {
                int i2 = iIndexOf;
                while (i2 > 0 && line.charAt(i2) > ' ') {
                    i2--;
                }
                if (i2 < iIndexOf) {
                    sb.append("\n'");
                    sb.append(line.substring(i2, line.length()).trim());
                    sb.append('\'');
                }
            }
        }
    }

    private void n() {
        TextView textView = (TextView) this.f1209g.get();
        if (textView != null) {
            textView.setText("");
        }
        y(false);
    }

    static boolean o(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(MainService.G0, 0);
            if (!sharedPreferences.getBoolean("perm-restart", false)) {
                return false;
            }
            sharedPreferences.edit().remove("perm-restart").commit();
            e1.d("consumePermissionRestart");
            return true;
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    private static void q(StringBuilder sb, int i2) {
        e1.d("START: " + i2);
        sb.append('\n');
        sb.append(i2);
        sb.append(": ");
    }

    private void r() {
        StringBuilder sb = this.i;
        try {
            File filesDir = getFilesDir();
            String absolutePath = filesDir.getAbsolutePath();
            sb.append(absolutePath);
            sb.append('\n');
            String str = android.ext.i.f1002d;
            sb.append(str);
            sb.append('\n');
            N(absolutePath);
            if (!Config.C && (n.checkCallingOrSelfPermission(Tools.removeNewLinesChars("dqgurlg1shuplvvlrq1UHDGbVPV")) == 0 || !new File("/proc/self/exe").getCanonicalPath().startsWith("/system/"))) {
                sb.append("? ");
                String str2 = Tools.f489a.nextInt() + ".txt";
                File file = new File(filesDir, str2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(new byte[4096]);
                fileOutputStream.flush();
                fileOutputStream.close();
                String strReplace = Tools.y0(file.getAbsolutePath()).replace('/' + str2, "");
                file.delete();
                sb.append(strReplace);
                sb.append('\n');
                N(strReplace);
                if (Config.C) {
                    String str3 = '/' + filesDir.getName();
                    String strReplace2 = strReplace.replace(str3, "");
                    String strReplace3 = absolutePath.replace(str3, "");
                    String str4 = "F2R: [" + strReplace2.length() + "] " + strReplace3 + " -> " + strReplace2;
                    e1.p(str4);
                    sb.append(str4);
                    sb.append('\n');
                    Tools.v = new String[]{strReplace3, strReplace2};
                } else {
                    String str5 = "Odd vSpace: " + absolutePath + "; " + strReplace;
                    e1.p(str5);
                    sb.append(str5);
                    sb.append('\n');
                    int i2 = Tools.M0().getInt("odd-vspace", 0);
                    sb.append(i2);
                    sb.append('\n');
                    if (i2 == 1) {
                        Config.C = true;
                    } else if (i2 == 0) {
                        j jVar = new j();
                        android.ext.f.o(android.ext.f.c(p).setMessage(b2.f(R.string.odd_vspace)).setCancelable(false).setPositiveButton(b2.f(R.string.yes), jVar).setNegativeButton(b2.f(R.string.no), jVar));
                    }
                }
            }
            String str6 = "Files: " + absolutePath + ' ' + str;
            e1.d(str6);
            sb.append(str6);
            sb.append('\n');
        } catch (Throwable th) {
            e1.a(th);
            sb.append(th.toString());
            sb.append('\n');
        }
        Config.vSpaceReal = Config.C;
        if (!Config.C || (Config.B & 512) == 0) {
            return;
        }
        Config.C = false;
    }

    private static void s() {
        try {
            Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            if ((obj instanceof Float) && Float.valueOf(0.0f).equals(obj)) {
                declaredField.set(null, Float.valueOf(1.0f));
                e1.d("Fix sDurationScale");
            }
        } catch (Throwable th) {
            e1.s("failed fix sDurationScale", th);
        }
    }

    public static String t() {
        return (l ? ActivityMain.class : MainActivity.class).getName();
    }

    public static Bundle u() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hw", l);
        bundle.putInt("uid", Process.myUid());
        bundle.putBoolean("vspace", Config.C);
        if (m) {
            e1.d("removeInstaller: to bundle");
            bundle.putBoolean("reminst", true);
        }
        return bundle;
    }

    static String v() {
        String str;
        String strK0 = Tools.K0();
        StringBuilder sb = new StringBuilder();
        sb.append("GG_logcat_");
        if (Config.C) {
            str = "v";
        } else {
            str = Config.vSpaceReal ? "R" : "r";
        }
        sb.append(str);
        float f2 = 1;
        sb.append((115.700005f * f2) - 14.3f);
        sb.append('_');
        sb.append((int) (((f2 * 16480.3f) - 325.3f) + 0.5f));
        sb.append('_');
        sb.append(Build.VERSION.RELEASE);
        sb.append('_');
        sb.append(Build.VERSION.SDK_INT);
        sb.append(".log");
        return new File(strK0, sb.toString()).getAbsolutePath();
    }

    private String w() {
        StringBuilder sb = this.i;
        this.i = null;
        return sb == null ? "" : sb.toString();
    }

    private void y(boolean z) {
        View view = (View) this.f1208f.get();
        if (view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.starter);
        if (!z) {
            if (viewFindViewById != null) {
                TextView textView = (TextView) this.f1209g.get();
                if (textView != null) {
                    Tools.P(textView);
                    Tools.O0(textView);
                }
                Tools.O0(viewFindViewById);
                return;
            }
            return;
        }
        if (viewFindViewById == null) {
            ((ViewGroup) view).addView(Tools.O0(((ViewGroup) gga.d.f(R.layout.main, null)).findViewById(R.id.starter)));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.front_text);
        this.f1209g = new WeakReference(textView2);
        int[] iArr = {R.id.btn_stop_service, R.id.btn_start_usage, R.id.check, R.id.fix_it, R.id.language, R.id.help};
        for (int i2 = 0; i2 < 6; i2++) {
            View viewFindViewById2 = view.findViewById(iArr[i2]);
            if (viewFindViewById2 instanceof TextView) {
                TextView textView3 = (TextView) viewFindViewById2;
                textView3.setText(b2.g(textView3.getText().toString()));
            }
            viewFindViewById2.setOnClickListener(this);
        }
        Tools.S(textView2);
    }

    private void z() {
        s();
        setContentView(R.layout.main);
        View viewFindViewById = findViewById(R.id.root);
        this.f1208f = new WeakReference(viewFindViewById);
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.installing);
        textView.setText(b2.f(R.string.installing));
        b1.G = new WeakReference((ProgressBar) viewFindViewById.findViewById(R.id.progress_bar));
        b1.H = new WeakReference((TextView) viewFindViewById.findViewById(R.id.progress_bar_text));
        b1.I = new WeakReference(textView);
        b1.E = new WeakReference((Button) viewFindViewById.findViewById(R.id.abort_button));
        L(0);
        y(true);
    }

    void B(Bundle bundle) {
        boolean zU = s1.u();
        s1.d();
        if (!zU) {
            C(bundle, s1.E());
        } else if (s1.O() < 2) {
            this.j = new l(bundle);
        } else {
            C(bundle, true);
        }
    }

    void C(Bundle bundle, boolean z) {
        if (z || Config.vSpaceReal || b1.B0() || Tools.M0().getInt("root-ok", 0) == ((int) (((1 * 17178.5f) - 1023.5f) + 0.5f))) {
            D(bundle, true);
            return;
        }
        try {
            R(bundle);
        } catch (Throwable th) {
            e1.l("Failed start root probe", th);
            D(bundle, true);
        }
    }

    void D(Bundle bundle, boolean z) {
        if (z) {
            F(bundle);
        } else {
            a aVar = new a(bundle);
            android.ext.f.r(android.ext.f.c(p).setTitle(b2.f(R.string.work_mode)).setCancelable(false).setItems(new String[]{b2.f(R.string.root), b2.f(R.string.no_root), b2.f(R.string.exit)}, new b(aVar)).create(), aVar, false);
        }
    }

    void F(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("installer-state");
            if (parcelable instanceof b1.c0) {
                b1.s1((b1.c0) parcelable);
            }
        }
        if (f1.f954d) {
            L(2);
        } else {
            f1.K();
        }
        s1.C();
    }

    void L(int i2) {
        n2.i(new i(i2));
    }

    public void M(boolean z) {
        boolean z2 = this.f1207e;
        this.f1207e = z;
        if (z2 == z || MainService.instance == null) {
            return;
        }
        MainService.instance.l1();
    }

    void Q() {
        String strW = w();
        if (Config.b(R.id.record_logcat).f42d != ((int) (((1 * 16493.2f) - 338.2f) + 0.5f))) {
            return;
        }
        Config.b(R.id.record_logcat).f42d = 0;
        Config.k();
        new g0(new g(strW), "RecordLogcat").start();
    }

    void T() {
        Config.p pVarB = Config.b(R.id.config_context_source);
        pVarB.g(new f(pVarB));
        pVarB.b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return super.dispatchKeyEvent(keyEvent);
        } catch (IllegalStateException e2) {
            e1.a(e2);
            return false;
        }
    }

    public void m() {
        if (!Config.vSpaceReal) {
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("INTERNET: 0~");
                sb.append(Config.vSpaceReal ? '$' : '#');
                sb.append(";1~");
                Context contextF0 = Tools.f0();
                int iCheckPermission = contextF0.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid());
                sb.append(iCheckPermission);
                sb.append(";2~");
                sb.append(contextF0.checkCallingOrSelfPermission("android.permission.INTERNET"));
                sb.append(";3~");
                sb.append(contextF0.checkCallingPermission("android.permission.INTERNET"));
                e1.d(sb.toString());
                if (iCheckPermission != 0) {
                    n0.h(Thread.currentThread(), new RuntimeException(sb.toString()), false);
                }
            } catch (Throwable th) {
                RuntimeException runtimeException = new RuntimeException(sb.toString(), th);
                e1.a(runtimeException);
                n0.h(Thread.currentThread(), runtimeException, false);
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            Context contextF1 = Tools.f0();
            PackageInfo packageInfoA0 = Tools.A0(Tools.C0(), 4096);
            if (packageInfoA0 == null || packageInfoA0.requestedPermissions == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            PackageManager packageManagerB0 = Tools.B0();
            for (String str : packageInfoA0.requestedPermissions) {
                if (str != null && (contextF1.checkSelfPermission(str) != 0 || (Config.vSpaceReal && packageManagerB0.checkPermission(str, Config.E) != 0))) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() <= 0) {
                j();
                s1.B();
                return;
            }
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            e1.d("requestPermissions: " + Arrays.toString(strArr));
            i(contextF1);
            s1.y();
            requestPermissions(strArr, 0);
        } catch (Throwable th2) {
            e1.a(th2);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1206d ? "Installer: " : "");
        sb.append("onActivityResult()");
        e1.d(sb.toString());
        super.onActivityResult(i2, i3, intent);
        if (this.f1206d) {
            b1.F0(i2, i3, intent);
        } else if (s1.u()) {
            s1.A();
        } else {
            z.m();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e2) {
            e1.a(e2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
        }
        switch (view.getId()) {
            case R.id.btn_start_usage /* 2131034133 */:
                if (m2.f1074a) {
                    try {
                        if (!moveTaskToBack(true)) {
                            finish();
                        }
                    } catch (Throwable th) {
                        e1.a(th);
                    }
                }
                MainService.instance.e1();
                break;
            case R.id.btn_stop_service /* 2131034134 */:
                e1.d("Pushed exit");
                finish();
                new p0(100).onClick(null, 0);
                break;
            case R.id.check /* 2131034149 */:
                new z(this).u();
                break;
            case R.id.fix_it /* 2131034263 */:
                try {
                    P(p).show();
                } catch (Throwable th2) {
                    e1.a(th2);
                    android.ext.f.m(P(Tools.f0()));
                    return;
                }
                break;
            case R.id.help /* 2131034277 */:
                ConfigListAdapter.s();
                break;
            case R.id.language /* 2131034304 */:
                ConfigListAdapter.d();
                break;
        }
    }

    @Override // gga.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        n0.f();
        boolean z = this instanceof MainActivity;
        if (z || n == null) {
            n = this;
        }
        if (z || !(p instanceof gga.b)) {
            p = gga.b.i(this);
        }
        if (z || o == null) {
            o = gga.b.i(getApplicationContext());
        }
        try {
            android.fix.Button button = new android.fix.Button(this);
            button.setText("Fix it");
            button.setId(R.id.fix_it);
            button.setOnClickListener(this);
            setContentView(button);
        } catch (Throwable th) {
            e1.a(th);
        }
        r();
        gga.c.f14a = false;
        Tools.W0(this);
        Window window = getWindow();
        if (window != null) {
            if (l) {
                window.addFlags(16777216);
            } else {
                window.clearFlags(16777216);
            }
        }
        gga.b.a(p);
        android.ext.k.g();
        Q();
        StringBuilder sb = new StringBuilder();
        if (Config.C) {
            str = "$";
        } else {
            str = Config.vSpaceReal ? "@" : "#";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(b2.f(R.string.app_name));
        sb.append(' ');
        float f2 = 1;
        sb.append((105.0f * f2) - 3.6f);
        sb.append(" (");
        sb.append((int) (((f2 * 17071.5f) - 916.5f) + 0.5f));
        sb.append(") ");
        sb.append(l ? "HW" : "SW");
        setTitle(sb.toString());
        z();
        Tools.o();
        k kVar = new k(bundle);
        e1.d(kVar + ": 10");
        b1.i1(kVar);
        e1.d(kVar + ": 20");
    }

    @Override // gga.a, android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            j();
        }
        M(false);
        n();
        super.onDestroy();
        if (!this.f1206d && q) {
            e1.d("onDestroy(exit)");
            f1.o();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1206d ? "Installer: " : "");
            sb.append("onDestroy()");
            e1.d(sb.toString());
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        try {
            return super.onKeyUp(i2, keyEvent);
        } catch (IllegalStateException e2) {
            e1.a(e2);
            return false;
        }
    }

    @Override // gga.a, android.app.Activity
    public void onPause() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1206d ? "Installer: " : "");
        sb.append("onPause()");
        e1.d(sb.toString());
        M(false);
        if (!this.f1206d && MainService.instance != null && !s1.u() && m2.f1074a) {
            MainService.instance.e1();
        }
        super.onPause();
    }

    @Override // gga.a, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1206d ? "Installer: " : "");
        sb.append("onPostCreate()");
        e1.d(sb.toString());
        super.onPostCreate(bundle);
    }

    @Override // gga.a, android.app.Activity
    protected void onPostResume() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1206d ? "Installer: " : "");
        sb.append("onPostResume()");
        e1.d(sb.toString());
        M(true);
        y(true);
        super.onPostResume();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        j();
        if (strArr != null && iArr != null) {
            int iMin = Math.min(strArr.length, iArr.length);
            for (int i3 = 0; i3 < iMin; i3++) {
                String str = strArr[i3];
                if (str != null) {
                    e1.d(str + ": " + iArr[i3]);
                }
            }
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
        s1.B();
    }

    @Override // gga.a, android.app.Activity
    protected void onRestart() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1206d ? "Installer: " : "");
        sb.append("onRestart()");
        e1.d(sb.toString());
        M(true);
        y(true);
        super.onRestart();
    }

    @Override // gga.a, android.app.Activity
    public void onResume() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1206d ? "Installer: " : "");
        sb.append("onResume()");
        e1.d(sb.toString());
        b1.G0();
        M(true);
        y(true);
        super.onResume();
        if (s1.O() != 1) {
            s1.C();
        }
        if (this.f1206d || MainService.instance == null) {
            return;
        }
        if (m2.f1074a) {
            MainService.instance.g1();
        } else if (MainService.instance.n == null) {
            S();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("installer-state", b1.j0());
        super.onSaveInstanceState(bundle);
    }

    @Override // gga.a, android.app.Activity
    protected void onStart() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1206d ? "Installer: " : "");
        sb.append("onStart()");
        e1.d(sb.toString());
        M(true);
        y(true);
        A();
        super.onStart();
    }

    @Override // gga.a, android.app.Activity
    public void onStop() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1206d ? "Installer: " : "");
        sb.append("onStop()");
        e1.d(sb.toString());
        M(false);
        n();
        super.onStop();
    }

    void p() {
        Runnable runnable = this.j;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean x() {
        return this.f1207e;
    }
}
