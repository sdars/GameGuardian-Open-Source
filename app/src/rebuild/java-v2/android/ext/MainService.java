package android.ext;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.database.DataSetObserver;
import android.fix.WrapLayout;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public class MainService extends k2 implements View.OnClickListener, View.OnLongClickListener {
    private static int N0;
    static int O0;
    private static volatile boolean P0;
    private static volatile ComponentCallbacks Q0;
    private static volatile boolean R0;
    private static volatile boolean S0;
    private static long T0;
    public static volatile Context context;
    private volatile long A;
    private final Runnable A0;
    private volatile long B;
    Runnable B0;
    TextView C;
    private boolean C0;
    final WrapLayout[] D;
    private boolean D0;
    View E;
    private final a3[] E0;
    private ImageView F;
    volatile boolean F0;
    ListView G;
    android.ext.q0 H;
    p1 I;
    View J;
    ImageView K;
    ListView L;
    ListView M;
    n1 N;
    o1 O;
    ImageButton P;
    private ImageButton Q;
    boolean R;
    boolean S;
    private boolean T;
    private boolean U;
    t0 V;
    i2 W;
    m1 X;
    ListView Y;
    View Z;
    View a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Script f212b;
    View b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    View f213c;
    View c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    View f214d;
    private TextView d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f215e;
    private TextView e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    c2 f216f;
    View f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    View f217g;
    TextView g0;
    android.ext.j h;
    ShowApp h0;
    android.ext.f0 i;
    android.ext.x i0;
    HotPoint j;
    private boolean j0;
    TimeJumpPanel k;
    public d1 k0;
    WindowManager l;
    volatile int l0;
    TabHost m;
    volatile int m0;
    volatile i1 n;
    TimersEditor n0;
    private ImageView o;
    TimersEditor o0;
    private ImageView p;
    volatile long p0;
    private ImageView q;
    boolean q0;
    View r;
    boolean r0;
    TextView s;
    final ggd.a s0;
    TextView t;
    SavedListAdapter t0;
    TextView u;
    final android.ext.d u0;
    View v;
    public z1.d v0;
    TextView w;
    private SparseBooleanArray w0;
    View x;
    ConfigListAdapter x0;
    TextView y;
    private volatile ArrayList y0;
    View z;
    private final int[] z0;
    public static final String G0 = android.ext.i.f1002d + "_preferences";
    public static volatile MainService instance = null;
    public static volatile boolean H0 = false;
    public static volatile boolean I0 = false;
    public static final p1[][] J0 = new p1[3][];
    private static volatile boolean K0 = false;
    public static final boolean[] L0 = new boolean[176];
    public static final boolean[] M0 = new boolean[76];

    class a extends p1 {
        a(int i, int i2) {
            super(i, i2);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            int count = MainService.this.t0.getCount();
            h2[] h2VarArr = new h2[count];
            for (int i = 0; i < count; i++) {
                h2VarArr[i] = MainService.this.t0.getItem(i);
            }
            new c1(MainService.this.v0, h2VarArr);
        }
    }

    class a0 implements DialogInterface.OnClickListener {
        a0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            MainService.this.q(true);
            ConfigListAdapter.t(R.string.help_games_protection_);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService mainService = MainService.this;
            mainService.f213c = mainService.C("script-interrupt", 0, 0, R.string.interrupt, R.drawable.ic_stop_white_24dp);
            MainService mainService2 = MainService.this;
            mainService2.f214d = null;
            mainService2.h0.o();
        }
    }

    class b0 implements Runnable {
        b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService.this.n.show();
            MainService.this.i0.e(false);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f222a;

        c(boolean z) {
            this.f222a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = this.f222a;
            if (z) {
                MainService.this.f215e = false;
            }
            MainService mainService = MainService.this;
            mainService.f214d = z ? mainService.C("script-ui-button", 0, 50, R.drawable.ic_ui_button_24dp, R.drawable.ic_ui_button_24dp) : null;
            MainService.this.h0.o();
        }
    }

    class c0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f225b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c0 c0Var = c0.this;
                MainService.this.h.c(true, c0Var.f224a);
            }
        }

        class b implements DialogInterface.OnDismissListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                c0 c0Var = c0.this;
                MainService.this.s0(c0Var.f224a, c0Var.f225b);
            }
        }

        class c implements DialogInterface.OnClickListener {

            class a implements Runnable {

                /* JADX INFO: renamed from: android.ext.MainService$c0$c$a$a, reason: collision with other inner class name */
                class RunnableC0007a implements Runnable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Intent f231a;

                    RunnableC0007a(Intent intent) {
                        this.f231a = intent;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Tools.f0().startActivity(this.f231a);
                        } catch (Exception e2) {
                            e1.l("Failed restart app 2: " + c0.this.f224a, e2);
                        }
                    }
                }

                class b implements Runnable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ String f233a;

                    b(String str) {
                        this.f233a = str;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            e2.n(this.f233a + " ''", 5);
                        } catch (Throwable th) {
                            e1.l("Failed unstub app: " + c0.this.f224a, th);
                        }
                    }
                }

                /* JADX INFO: renamed from: android.ext.MainService$c0$c$a$c, reason: collision with other inner class name */
                class RunnableC0008c implements Runnable {
                    RunnableC0008c() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        c0 c0Var = c0.this;
                        MainService.this.h.c(true, c0Var.f224a);
                    }
                }

                a() {
                }

                /* JADX WARN: Code duplicated, block: B:24:0x0112 A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #1 {all -> 0x00e9, blocks: (B:13:0x009e, B:15:0x00c8, B:17:0x00d8, B:20:0x00eb, B:22:0x00f1, B:24:0x0112), top: B:38:0x009e }] */
                @Override // java.lang.Runnable
                public void run() {
                    e1.d("Restart stub: " + c0.this.f224a);
                    StringBuilder sb = new StringBuilder();
                    sb.append("exec setprop wrap.");
                    String str = c0.this.f224a;
                    boolean z = false;
                    sb.append((str == null || str.length() <= 26) ? c0.this.f224a : c0.this.f224a.substring(0, 26));
                    String string = sb.toString();
                    try {
                        e2.n(string + " LD_PRELOAD=" + (android.ext.e0.g() + android.ext.e0.k(c0.this.f225b)), 5);
                    } catch (Throwable th) {
                        e1.l("Failed stub app: " + c0.this.f224a, th);
                    }
                    try {
                        if (!e2.n("exec monkey -p " + c0.this.f224a + " 1", 10).contains("Events injected")) {
                            Intent launchIntentForPackage = Tools.B0().getLaunchIntentForPackage(c0.this.f224a);
                            if (launchIntentForPackage == null) {
                                launchIntentForPackage = new Intent("android.intent.action.MAIN");
                                launchIntentForPackage.setPackage(c0.this.f224a);
                            }
                            ComponentName component = launchIntentForPackage.getComponent();
                            if (component != null) {
                                if (!e2.n("exec am start -n " + component.flattenToString(), 10).contains("Starting: Intent")) {
                                    launchIntentForPackage.setFlags(268435456);
                                    n2.i(new RunnableC0007a(launchIntentForPackage));
                                }
                            } else {
                                launchIntentForPackage.setFlags(268435456);
                                n2.i(new RunnableC0007a(launchIntentForPackage));
                            }
                        }
                        z = true;
                    } catch (Throwable th2) {
                        e1.l("Failed restart app: " + c0.this.f224a, th2);
                    }
                    n2.c().postDelayed(new b(string), z ? 10000L : 0L);
                    n2.d().postDelayed(new RunnableC0008c(), z ? 4000L : 0L);
                }
            }

            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                n2.h(new a());
            }
        }

        c0(String str, boolean z) {
            this.f224a = str;
            this.f225b = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            boolean z = false;
            MainService.this.F0 = false;
            if (i == 0) {
                new android.ext.p0(1100).onClick(dialogInterface, i);
            } else if (i == 1) {
                e1.d("Restart: " + this.f224a);
                try {
                    Intent launchIntentForPackage = Tools.B0().getLaunchIntentForPackage(this.f224a);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.MAIN");
                        launchIntentForPackage.setPackage(this.f224a);
                    }
                    launchIntentForPackage.setFlags(268435456);
                    Tools.f0().startActivity(launchIntentForPackage);
                    z = true;
                } catch (Exception e2) {
                    e1.l("Failed restart app: " + this.f224a, e2);
                }
                n2.d().postDelayed(new a(), z ? 4000L : 0L);
            } else if (i != 2) {
                if (i == 3) {
                    ConfigListAdapter.t(R.string.help_games_protection_title);
                }
                MainService.this.h.g();
            } else if (f1.z(null, new b())) {
                android.ext.f.o(android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.restart_game_without_protection)).setMessage(b2.f(R.string.warn_restart_off_prot)).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null).setPositiveButton(b2.f(R.string.ok), new c()));
            }
            Tools.D(dialogInterface);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService mainService = MainService.this;
            mainService.f213c = null;
            mainService.f214d = null;
            mainService.h0.e();
            MainService.this.D0(true);
        }
    }

    class d0 implements Runnable {
        d0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MainService.this.i.K0((byte) 2);
            } catch (Throwable unused) {
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService mainService = MainService.this;
            mainService.f217g = null;
            mainService.h0.d();
        }
    }

    class e0 implements Runnable {
        e0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.d("doCheckLibs: " + MainService.this.v());
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService mainService = MainService.this;
            mainService.f217g = mainService.C("record-interrupt", 0, 0, R.string.record, R.drawable.ic_stop_white_24dp);
            MainService.this.h0.n();
        }
    }

    class f0 implements DialogInterface.OnClickListener {
        f0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Config.b(R.id.config_check_libs).f42d = 0;
            Config.k();
        }
    }

    class g extends FloatPanel {
        final /* synthetic */ String p;
        final /* synthetic */ int q;
        final /* synthetic */ int r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, String str, int i, int i2) {
            super(context);
            this.p = str;
            this.q = i;
            this.r = i2;
        }

        @Override // android.ext.FloatPanel
        protected boolean f() {
            return true;
        }

        @Override // android.ext.FloatPanel
        protected int getDefX() {
            return this.q;
        }

        @Override // android.ext.FloatPanel
        protected int getDefY() {
            return this.r;
        }

        @Override // android.ext.FloatPanel
        protected String getPrefName() {
            return this.p;
        }
    }

    class g0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f242a;

        class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: android.ext.MainService$g0$a$a, reason: collision with other inner class name */
            class RunnableC0009a implements Runnable {
                RunnableC0009a() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0 */
                /* JADX WARN: Type inference failed for: r0v1, types: [int] */
                /* JADX WARN: Type inference failed for: r0v11 */
                /* JADX WARN: Type inference failed for: r0v12 */
                /* JADX WARN: Type inference failed for: r0v13 */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v9 */
                @Override // java.lang.Runnable
                public void run() {
                    String F;
                    try {
                        Process processQ = e2.q(Tools.removeNewLinesChars("h{hf#sp#lqvwdoo#0u#00del#{;9#") + g0.this.f242a);
                        if (processQ == null) {
                            F = b2.f(R.string.reinstall_failed) + "\nnull";
                        } else {
                            int iWaitFor = processQ.waitFor();
                            if (iWaitFor == 0) {
                                F = b2.f(R.string.reinstall_ended);
                            } else {
                                F = b2.f(R.string.reinstall_failed) + "\ncode: " + iWaitFor;
                            }
                        }
                    } catch (InterruptedException e2) {
                        e1.g("Reinstall failed", e2);
                        F = b2.f(R.string.reinstall_failed) + "\n" + e2.getMessage();
                    }
                    Tools.K1(F, 1);
                }
            }

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Tools.I1(R.string.reinstall_started, 0);
                new android.ext.n0.i(new RunnableC0009a(), "FixLibs").start();
            }
        }

        g0(String str) {
            this.f242a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            android.ext.f.o(android.ext.ggf.b().setMessage(b2.f(R.string.try_reinstall_x86)).setPositiveButton(b2.f(R.string.yes), new a()).setNeutralButton(b2.f(R.string.site), new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh278:0krz0wr0uhsodfh0dup0oleudulhv0zlwk0{;90oleudulhv0{0soruh2")).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null));
        }
    }

    class h implements TabHost.OnTabChangeListener {
        h() {
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public void onTabChanged(String str) {
            MainService mainService = MainService.instance;
            int iH = mainService.H();
            mainService.r.setVisibility(iH >= 1 ? 0 : 8);
            mainService.s.setVisibility(iH != 3 ? 0 : 8);
            mainService.z.setVisibility(iH == 1 ? 0 : 8);
            mainService.v.setVisibility(iH == 3 ? 0 : 8);
            mainService.w.setVisibility(iH == 2 ? 0 : 8);
            mainService.q1();
            mainService.f0 = mainService.m.getCurrentView();
            Tools.s(mainService.P);
            mainService.p1();
            ConfigListAdapter configListAdapter = MainService.this.x0;
            if (configListAdapter != null) {
                configListAdapter.l(iH == 0);
            }
        }
    }

    class h0 extends p1 {
        h0(int i, int i2) {
            super(i, i2);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            Tools.H1(R.string.speedhack_open);
            MainService.this.t();
            MainService.this.onLongClick(null);
        }
    }

    class i extends p1 {
        i(int i, int i2) {
            super(i, i2);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            MainService.this.N.b();
        }
    }

    class i0 extends p1 {
        i0(int i, int i2) {
            super(i, i2);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            new c1(MainService.this.v0, null);
        }
    }

    class j extends p1 {
        j(String str) {
            super(str);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    private class j0 extends p1 {

        class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long[] f252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long[] f253b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f254c;

            a(long[] jArr, long[] jArr2, int i) {
                this.f252a = jArr;
                this.f253b = jArr2;
                this.f254c = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                j0.this.i(this.f252a, this.f253b, this.f254c, i);
            }
        }

        class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String[] f256a;

            b(String[] strArr) {
                this.f256a = strArr;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Tools.z(this.f256a[i]);
                Tools.D(dialogInterface);
            }
        }

        public j0() {
            super(R.string.calculate_offset_xor, R.drawable.ic_vector_difference_white_24dp);
        }

        private void h() {
            int i;
            int i2;
            Object objZ = MainService.this.z();
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            if (objZ instanceof ggd.a) {
                ggd.a aVar = (ggd.a) objZ;
                android.ext.c cVar = new android.ext.c();
                int i3 = aVar.i();
                i = 0;
                i2 = 0;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (aVar.c(i4)) {
                        if (i < 10) {
                            aVar.f(i4, cVar);
                            jArr[i] = cVar.f672a;
                            jArr2[i] = cVar.f673b & android.ext.c.f668d[cVar.D()];
                            i++;
                        }
                        i2++;
                        if (i2 > 10) {
                            break;
                        }
                    }
                }
            } else if (objZ instanceof ggd.e) {
                ggd.e eVar = (ggd.e) objZ;
                int iL = eVar.l();
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < iL; i7++) {
                    if (eVar.a(i7)) {
                        h2 h2Var = (h2) eVar.n(i7);
                        if (h2Var instanceof h2) {
                            if (i5 < 10) {
                                jArr[i5] = h2Var.f672a;
                                jArr2[i5] = h2Var.f673b & android.ext.c.f668d[h2Var.D()];
                                i5++;
                            }
                            i6++;
                            if (i6 > 10) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i2 = i6;
                i = i5;
            } else if (objZ instanceof boolean[]) {
                n1 n1Var = MainService.this.N;
                boolean[] zArr = (boolean[]) objZ;
                int length = zArr.length - 1;
                i = 0;
                i2 = 0;
                for (int i8 = 1; i8 < length; i8++) {
                    if (zArr[i8]) {
                        if (i < 10) {
                            jArr[i] = n1Var.e(i8);
                            android.ext.c cVar2 = (android.ext.c) n1Var.getItem(i8);
                            jArr2[i] = cVar2.f673b & android.ext.c.f668d[cVar2.D()];
                            i++;
                        }
                        i2++;
                        if (i2 > 10) {
                            break;
                        }
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (i < 2) {
                Tools.J1(Tools.L1(b2.f(R.string.need_select_more), 2));
                return;
            }
            if (i2 > i) {
                Tools.J1(Tools.L1(b2.f(R.string.used_only_first), Integer.valueOf(i)));
            }
            android.ext.f.o(android.ext.ggf.b().setAdapter(new ArrayAdapter(MainService.context, new String[]{Tools.N1(R.string.offset), "XOR"}), new a(jArr, jArr2, i)).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null));
        }

        void i(long[] jArr, long[] jArr2, int i, int i2) {
            int i3 = i - 1;
            int i4 = (i * i3) / 2;
            String[] strArr = new String[i4];
            String[] strArr2 = new String[i4];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3) {
                int i7 = i5 + 1;
                for (int i8 = i7; i8 < i; i8++) {
                    long j = jArr[i5];
                    long j2 = jArr[i8];
                    String upperCase = i2 == 0 ? Long.toHexString(j2 - j).toUpperCase(Locale.US) : Tools.L1("%,d", Long.valueOf(jArr2[i5] ^ jArr2[i8]));
                    strArr2[i6] = upperCase;
                    strArr[i6] = t2.e(8, j) + " - " + t2.e(8, j2) + ": " + upperCase;
                    i6++;
                }
                i5 = i7;
            }
            android.ext.f.o(android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.select_copy_item)).setAdapter(new ArrayAdapter(MainService.context, strArr), new b(strArr2)).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null));
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            h();
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ListAdapter f258a;

        k(ListAdapter listAdapter) {
            this.f258a = listAdapter;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListAdapter listAdapter = this.f258a;
            if (listAdapter instanceof ConfigListAdapter) {
                ((ConfigListAdapter) listAdapter).x();
            }
            ListAdapter listAdapter2 = this.f258a;
            if (listAdapter2 instanceof BaseAdapter) {
                try {
                    ((BaseAdapter) listAdapter2).notifyDataSetChanged();
                } catch (NoSuchMethodError e2) {
                    e1.a(e2);
                }
            }
        }
    }

    private class k0 extends p1 {
        public k0() {
            super(R.string.clear_selection, R.drawable.ic_select_off_white_24dp);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            MainService.this.j(0);
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f261a;

        class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f263a;

            a(String str) {
                this.f263a = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == -3) {
                    Tools.z(this.f263a);
                } else {
                    if (i != -1) {
                        return;
                    }
                    MainService.instance.L(null, this.f263a, Tools.N1(R.string.allocated));
                }
            }
        }

        l(long j) {
            this.f261a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertDialog.Builder neutralButton;
            long j = this.f261a;
            if (-1024 >= j || j > 0) {
                String str = android.ext.c.G(this.f261a, 4) + 'h';
                a aVar = new a(str);
                y0.b(str, 1);
                neutralButton = android.ext.ggf.b().setMessage(Tools.N1(R.string.allocated) + ": " + str).setPositiveButton(b2.f(R.string.goto1), aVar).setNeutralButton(b2.f(R.string.copy), aVar);
            } else {
                neutralButton = android.ext.ggf.b().setMessage(b2.f(R.string.allocate_fail) + ' ' + (-this.f261a));
            }
            android.ext.f.m(neutralButton.setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null).create());
        }
    }

    private class l0 extends p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f265f;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                l0 l0Var = l0.this;
                l0Var.f265f = i;
                l0Var.i();
            }
        }

        public l0() {
            super(R.string.export_selected, R.drawable.ic_download_checked_white_24dp);
            this.f265f = 0;
        }

        void h(List list, Object obj) {
            int size = list.size();
            h2[] h2VarArr = new h2[size];
            for (int i = 0; i < size; i++) {
                android.ext.c cVar = (android.ext.c) list.get(i);
                h2VarArr[i] = cVar instanceof h2 ? (h2) cVar : new h2(cVar);
            }
            new c1(MainService.this.v0, h2VarArr).f694g = true;
        }

        void i() {
            Object objZ = MainService.this.z();
            if (Tools.L0(objZ) == 0) {
                Tools.H1(R.string.nothing_selected);
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (objZ instanceof boolean[]) {
                if (this.f265f == 0) {
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    new u2(android.ext.c.o(MainService.this.N.q((boolean[]) objZ, sparseIntArray)), sparseIntArray, "0", b2.f(R.string.type_change_request), new a());
                    return;
                }
                n1 n1Var = MainService.this.N;
                boolean[] zArr = (boolean[]) objZ;
                int length = zArr.length - 1;
                for (int i2 = 1; i2 < length; i2++) {
                    if (zArr[i2]) {
                        Object item = n1Var.getItem(i2);
                        if (item instanceof android.ext.c) {
                            android.ext.c cVar = (android.ext.c) item;
                            cVar.f674c = this.f265f;
                            if (cVar.V()) {
                                arrayList.add(cVar);
                            }
                        }
                    }
                }
                this.f265f = 0;
            } else if (objZ instanceof ggd.a) {
                ggd.a aVar = (ggd.a) objZ;
                int i3 = aVar.i();
                while (i < i3) {
                    if (aVar.c(i)) {
                        arrayList.add(aVar.f(i, null));
                    }
                    i++;
                }
            } else if (objZ instanceof ggd.e) {
                ggd.e eVar = (ggd.e) objZ;
                int iL = eVar.l();
                while (i < iL) {
                    if (eVar.a(i)) {
                        h2 h2Var = (h2) eVar.n(i);
                        if (h2Var instanceof h2) {
                            arrayList.add(h2Var);
                        }
                    }
                    i++;
                }
            }
            h(arrayList, objZ);
        }

        void j() {
            this.f265f = 0;
            i();
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            j();
        }

        l0(int i, int i2) {
            super(i, i2);
            this.f265f = 0;
        }
    }

    class m implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ListAdapter[] f268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p1[][] f269b;

        class a extends ArrayAdapter {
            a(Context context, p1[] p1VarArr) {
                super(context, p1VarArr);
            }

            @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                TextView textView = (TextView) view2.findViewById(android.R.id.text1);
                if (textView != null) {
                    Tools.D1(textView, R.style.SmallText);
                }
                return view2;
            }
        }

        class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f272a;

            b(int i) {
                this.f272a = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                m mVar = m.this;
                mVar.f269b[this.f272a][i].e(MainService.this.J);
                Tools.D(dialogInterface);
            }
        }

        m(p1[][] p1VarArr) {
            this.f269b = p1VarArr;
            this.f268a = new ListAdapter[p1VarArr.length];
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iCharAt;
            int id = MainService.this.f0.getId();
            if (id == R.id.memory_editor_page) {
                iCharAt = 's' - "kwws=22jdphjxdugldq1qhw2khos2".charAt(20);
            } else if (id == R.id.saved_page) {
                iCharAt = 'e' - "kwws=22jdphjxdugldq1qhw2iruxp2wrslf25<;940grqdwh2".charAt(13);
            } else if (id != R.id.search_page) {
                return;
            } else {
                iCharAt = 'j' - "kwws=22jdphjxdugldq1qhw2grzqordg".charAt(11);
            }
            ListAdapter[] listAdapterArr = this.f268a;
            if (listAdapterArr[iCharAt] == null) {
                listAdapterArr[iCharAt] = new a(MainService.context, this.f269b[iCharAt]);
            }
            android.ext.f.o(android.ext.ggf.c(Tools.k0()).setAdapter(this.f268a[iCharAt], new b(iCharAt)));
        }
    }

    private class m0 extends p1 {
        public m0() {
            super(R.string.invert_selection, R.drawable.ic_select_inverse_white_24dp);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            MainService.this.j(2);
        }
    }

    class n extends DataSetObserver {
        n() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            MainService.this.k1();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            MainService.this.k1();
        }
    }

    private class n0 extends o0 {
        public n0() {
            super(R.string.changed_as_search_result, R.drawable.ic_search_changed_white_24dp);
        }

        @Override // android.ext.MainService.l0
        void i() {
            android.ext.d dVar = MainService.this.u0;
            if (dVar.e() == 0) {
                Tools.J1(b2.f(R.string.changed_not_found));
            } else {
                h(dVar.b(), null);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MainService mainService = MainService.this;
                if (mainService.f0 == mainService.a0) {
                    mainService.t0.i();
                }
            } catch (Throwable th) {
                e1.l("Failed update saved list", th);
            }
            try {
                int i = Config.n;
                if (i <= 0) {
                    i = 1000;
                }
                Handler handlerD = n2.d();
                handlerD.removeCallbacks(this);
                handlerD.postDelayed(this, i);
            } catch (Throwable th2) {
                e1.s("Failed post timer", th2);
            }
        }
    }

    private class o0 extends l0 {

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                o0.this.j();
            }
        }

        public o0() {
            super(R.string.selected_as_search_result, R.drawable.ic_search_selected_white_24dp);
        }

        @Override // android.ext.MainService.l0
        void h(List list, Object obj) {
            c2 c2Var;
            if (list.size() == 0) {
                MainService.this.n((byte) 0);
                return;
            }
            if (!MainService.this.a1()) {
                throw new NumberFormatException(b2.f(R.string.busy_dialog_fail));
            }
            if (MainService.this.p0 != 0) {
                MainService.this.n((byte) 0);
            }
            MainService mainService = MainService.this;
            mainService.q0 = false;
            mainService.i.x0((byte) 0);
            MainService.this.R((byte) 0);
            MainService mainService2 = MainService.this;
            mainService2.r0 = false;
            mainService2.i.f0((byte) 0, list);
            MainService.this.m.setCurrentTab(1);
            boolean z = obj instanceof ggd.a;
            if ((z || (obj instanceof ggd.e)) && (c2Var = MainService.this.f216f) != null && z) {
                android.ext.b0.n(c2Var, true);
            }
        }

        @Override // android.ext.MainService.l0, android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            if (MainService.this.p0 == 0) {
                j();
            } else {
                android.ext.f.o(android.ext.ggf.b().setMessage(b2.f(R.string.clear_results_prompt)).setPositiveButton(b2.f(R.string.yes), new a()).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null));
            }
        }

        o0(int i, int i2) {
            super(i, i2);
        }
    }

    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService.this.E0();
        }
    }

    class p0 extends p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f279f;

        class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f281a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f282b;

            /* JADX INFO: renamed from: android.ext.MainService$p0$a$a, reason: collision with other inner class name */
            class DialogInterfaceOnClickListenerC0010a implements DialogInterface.OnClickListener {
                DialogInterfaceOnClickListenerC0010a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    p0 p0Var = p0.this;
                    boolean z = p0Var.f279f;
                    MainService mainService = MainService.this;
                    if (z) {
                        mainService.t0.c();
                    } else {
                        mainService.m();
                    }
                    c2 c2Var = MainService.instance.f216f;
                    if (c2Var != null) {
                        c2Var.write(p0.this.f279f ? "\ngg.clearList()\n" : "\ngg.clearResults()\n");
                    }
                }
            }

            class b implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ DialogInterface f285a;

                b(DialogInterface dialogInterface) {
                    this.f285a = dialogInterface;
                }

                @Override // java.lang.Runnable
                public void run() {
                    android.ext.f.m((AlertDialog) this.f285a);
                }
            }

            a(int i, Object obj) {
                this.f281a = i;
                this.f282b = obj;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i > 2 && this.f281a == 0) {
                    Tools.H1(R.string.nothing_selected);
                    return;
                }
                if (i == 0) {
                    android.ext.f.o(android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.remove_all2)).setPositiveButton(b2.f(R.string.yes), new DialogInterfaceOnClickListenerC0010a()).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null));
                    return;
                }
                if (i == 1) {
                    n2.d().postDelayed(new b(dialogInterface), 1000L);
                    return;
                }
                if (i == 2) {
                    MainService.this.L0(this.f282b, null);
                } else if (i != 3) {
                    return;
                }
                MainService.this.H0(this.f282b);
            }
        }

        public p0(boolean z) {
            super(R.string.remove, R.drawable.ic_delete_white_24dp);
            this.f279f = z;
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            Object objZ = MainService.this.z();
            int iL0 = Tools.L0(objZ);
            String str = " (" + iL0 + ')';
            android.ext.f.o(android.ext.ggf.b().setItems(new String[]{b2.f(R.string.remove_all2), "---", b2.f(R.string.revert_and_remove) + str, b2.f(R.string.remove) + str}, new a(iL0, objZ)).setNegativeButton(b2.f(R.string.cancel), (DialogInterface.OnClickListener) null));
        }
    }

    class q implements DialogInterface.OnClickListener {
        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            MainService.this.P();
        }
    }

    class q0 extends p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f288f;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                q0 q0Var = q0.this;
                q0Var.f288f = i;
                q0Var.h();
            }
        }

        class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.d f291a;

            b(android.ext.d dVar) {
                this.f291a = dVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f291a.d();
                c2 c2Var = MainService.instance.f216f;
                if (c2Var != null) {
                    c2Var.write("if revert ~= nil then gg.setValues(revert) end\n");
                }
            }
        }

        public q0() {
            super(R.string.revert_selected, R.drawable.ic_undo_variant_white_24dp);
            this.f288f = 0;
        }

        void h() {
            Object objZ = MainService.this.z();
            android.ext.d dVar = new android.ext.d();
            android.ext.d dVar2 = MainService.this.u0;
            android.ext.ggd.a aVar = new android.ext.ggd.a();
            if (!(objZ instanceof boolean[])) {
                MainService.this.L0(objZ, dVar);
            } else if (this.f288f == 0) {
                SparseIntArray sparseIntArray = new SparseIntArray();
                gga.e eVarO = android.ext.c.o(MainService.this.N.q((boolean[]) objZ, sparseIntArray));
                if (sparseIntArray.size() > 0) {
                    new u2(eVarO, sparseIntArray, "0", b2.f(R.string.type_change_request), new a());
                    return;
                }
            } else {
                n1 n1Var = MainService.this.N;
                boolean[] zArr = (boolean[]) objZ;
                int length = zArr.length - 1;
                for (int i = 1; i < length; i++) {
                    if (zArr[i]) {
                        android.ext.c cVar = new android.ext.c(n1Var.e(i), 0L, this.f288f);
                        if (cVar.V()) {
                            dVar2.a(cVar.f672a, cVar.f674c, aVar);
                            if (aVar.f702b) {
                                dVar.c(cVar.f672a, cVar.f674c, aVar.f701a);
                            }
                        }
                    }
                }
                this.f288f = 0;
            }
            int iE = dVar.e();
            if (iE == 0) {
                Tools.H1(R.string.nothing_to_revert);
            } else {
                android.ext.f.o(android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.revert_selected)).setMessage(Tools.L1(b2.f(R.string.revert_prompt), Integer.valueOf(iE))).setPositiveButton(b2.f(R.string.yes), new b(dVar)).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null));
            }
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            this.f288f = 0;
            h();
        }
    }

    class r implements DialogInterface.OnClickListener {
        r() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            MainService.this.O();
        }
    }

    class r0 extends p1 {

        class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f296b;

            a(Object obj, int i) {
                this.f295a = obj;
                this.f296b = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                n1 n1Var = MainService.this.N;
                boolean[] zArr = (boolean[]) this.f295a;
                int length = zArr.length - 1;
                for (int i2 = 1; i2 < length; i2++) {
                    if (zArr[i2]) {
                        long jE = n1Var.e(i2);
                        h2 h2Var = new h2(jE, 0L, i);
                        if (!h2Var.V()) {
                            h2Var.f674c = android.ext.c.S(h2Var.f672a, true);
                        }
                        h2 h2VarE = MainService.this.t0.e(jE);
                        if (h2VarE == null || h2VarE.f674c != h2Var.f674c) {
                            MainService.this.t0.b(h2Var, (byte) 0, false);
                        }
                    }
                }
                MainService.this.t0.notifyDataSetChanged();
                MainService.this.t0.i();
                Tools.J1(Tools.L1(b2.f(R.string.items_added), Integer.valueOf(this.f296b)));
            }
        }

        public r0() {
            super(R.string.save_selected, R.drawable.ic_content_save_white_24dp);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            Object objZ = MainService.this.z();
            int iL0 = Tools.L0(objZ);
            if (iL0 == 0) {
                Tools.H1(R.string.nothing_selected);
                return;
            }
            if (objZ instanceof boolean[]) {
                SparseIntArray sparseIntArray = new SparseIntArray();
                new u2(android.ext.c.o(MainService.this.N.q((boolean[]) objZ, sparseIntArray)), sparseIntArray, "0", b2.f(R.string.type_change_request), new a(objZ, iL0));
                return;
            }
            if (objZ instanceof ggd.a) {
                ArrayList<android.ext.c> arrayList = new ArrayList();
                ggd.a aVar = (ggd.a) objZ;
                int i = aVar.i();
                for (int i2 = 0; i2 < i; i2++) {
                    if (aVar.c(i2)) {
                        arrayList.add(aVar.f(i2, null));
                    }
                }
                for (android.ext.c cVar : arrayList) {
                    h2 h2VarE = MainService.this.t0.e(cVar.f672a);
                    if (h2VarE == null || h2VarE.f674c != cVar.f674c) {
                        MainService.this.t0.b(new h2(cVar), (byte) 0, false);
                    }
                }
                MainService.this.t0.notifyDataSetChanged();
                MainService.this.t0.i();
                Tools.J1(Tools.L1(b2.f(R.string.items_added), Integer.valueOf(iL0)));
                c2 c2Var = MainService.instance.f216f;
                if (c2Var != null) {
                    c2Var.write("\nlocal t = ");
                    android.ext.b0.n(c2Var, true);
                    c2Var.write("gg.addListItems(t)\n");
                    c2Var.write("t = nil\n\n");
                }
            }
        }
    }

    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService.this.onLongClick(null);
        }
    }

    private class s0 extends p1 {
        public s0() {
            super(R.string.select_all, R.drawable.ic_select_all_white_24dp);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(View view) {
            MainService.this.j(1);
        }
    }

    class t implements ComponentCallbacks2 {
        t() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            e1.d("ComponentCallbacks2 onConfigurationChanged: " + configuration);
            MainService.Y(gga.b.f(configuration));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            e1.d("ComponentCallbacks2 onLowMemory");
            MainService.t0(-1);
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            e1.d("ComponentCallbacks2 onTrimMemory: " + i);
            MainService.t0(i);
        }
    }

    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainService.this.e();
        }
    }

    class v implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f302b;

        v(String str, CharSequence charSequence) {
            this.f301a = str;
            this.f302b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f301a;
            if (str != null) {
                MainService.this.C.setText(str);
            }
            CharSequence charSequence = this.f302b;
            if (charSequence != null) {
                MainService.this.y.setText(charSequence);
            }
            MainService.this.x.setVisibility(8);
        }
    }

    class w implements DialogInterface.OnClickListener {
        w() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Config.b(R.id.config_waitpid).f42d = 1;
            Config.k();
            ConfigListAdapter.m();
        }
    }

    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MainService.this.n == null) {
                MainService.this.c0();
            }
        }
    }

    class y implements DialogInterface.OnClickListener {
        y() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            MainService.this.q(true);
        }
    }

    class z implements DialogInterface.OnClickListener {
        z() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ConfigListAdapter.a(null);
        }
    }

    static {
        int i2 = 0;
        while (true) {
            boolean[] zArr = M0;
            boolean z2 = true;
            if (i2 >= zArr.length) {
                break;
            }
            if (i2 % 4 >= 2) {
                z2 = false;
            }
            zArr[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            boolean[] zArr2 = L0;
            if (i3 >= zArr2.length) {
                break;
            }
            zArr2[i3] = i3 % 4 < 2;
            i3++;
        }
        int[] iArr = {40, 43, 44};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr[i4] - 1;
            boolean[] zArr3 = L0;
            int i6 = i5 * 4;
            zArr3[i6] = false;
            zArr3[i6 + 1] = false;
            zArr3[i6 + 2] = false;
            zArr3[i6 + 3] = false;
        }
        N0 = 127;
        O0 = 0;
        P0 = true;
        Q0 = null;
        R0 = false;
        S0 = true;
        T0 = 0L;
    }

    public MainService(Context context2) {
        super(context2);
        this.f212b = null;
        this.f213c = null;
        this.f214d = null;
        this.f215e = false;
        this.f216f = null;
        this.f217g = null;
        this.k = null;
        this.n = null;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.j0 = true;
        this.l0 = 0;
        this.m0 = 0;
        this.p0 = 0L;
        this.q0 = false;
        this.r0 = true;
        this.s0 = new ggd.a();
        this.t0 = new SavedListAdapter();
        this.u0 = new android.ext.d();
        this.v0 = null;
        this.w0 = new SparseBooleanArray();
        this.y0 = new ArrayList();
        this.z0 = new int[3];
        this.A0 = new o();
        this.B0 = null;
        this.C0 = true;
        this.D0 = false;
        this.E0 = new a3[4];
        this.F0 = false;
        if (context == null) {
            context = l2.i(context2);
        }
        instance = this;
        Tools.o();
        this.i = new android.ext.f0();
        this.D = new WrapLayout[3];
    }

    public static ComponentCallbacks A() {
        ComponentCallbacks componentCallbacks = Q0;
        if (componentCallbacks != null) {
            return componentCallbacks;
        }
        t tVar = new t();
        Q0 = tVar;
        return tVar;
    }

    static int D() {
        if (instance.p0 == 0) {
            return 127;
        }
        return N0;
    }

    static int E() {
        if (instance.p0 != 0) {
            int i2 = N0;
            int i3 = O0;
            if ((i2 & i3) != i3) {
                return i2;
            }
        }
        return O0;
    }

    private void G0() {
        context.registerComponentCallbacks(A());
    }

    public static void I0() {
        android.ext.f.o(android.ext.ggf.b().setMessage(b2.f(R.string.bad_firmware)).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
    }

    private void J0() {
        z0();
        q(true);
        this.u0.f();
        this.j0 = true;
        this.q.setVisibility(4);
        this.k0.j();
        this.j.q();
        this.w0.clear();
        this.t0.c();
        this.i.k0();
    }

    private void M() {
    }

    private void M0(Long l2, long j2) {
        int top = 0;
        if (l2 == null) {
            int firstVisiblePosition = this.M.getFirstVisiblePosition();
            if (this.M.getChildCount() > 1 && this.M.getChildAt(0).getTop() < 0) {
                firstVisiblePosition++;
            }
            Object itemAtPosition = this.M.getItemAtPosition(firstVisiblePosition);
            l2 = itemAtPosition instanceof android.ext.c ? Long.valueOf(((android.ext.c) itemAtPosition).f672a) : itemAtPosition instanceof v0 ? Long.valueOf(((v0) itemAtPosition).b()) : null;
        }
        if (l2 != null) {
            long jLongValue = l2.longValue();
            if (jLongValue == j2 || jLongValue == this.O.f()) {
                return;
            }
            int iP = this.N.p(jLongValue) - this.M.getFirstVisiblePosition();
            if (iP >= 0 && iP < this.M.getChildCount()) {
                top = this.M.getChildAt(iP).getTop();
            }
            this.O.b(jLongValue, Tools.N1(R.string.position_in_memory_editor), top);
        }
    }

    private void N(String str, int i2, int i3) {
        TabHost.TabSpec tabSpecNewTabSpec = this.m.newTabSpec(str);
        tabSpecNewTabSpec.setContent(i2);
        ImageView imageViewM = Config.m((ImageView) this.m.findViewById(i3));
        tabSpecNewTabSpec.setIndicator("", imageViewM.getDrawable());
        try {
            this.m.addTab(tabSpecNewTabSpec);
        } catch (IllegalArgumentException e2) {
            e1.a(e2);
            tabSpecNewTabSpec.setIndicator("");
            try {
                this.m.addTab(tabSpecNewTabSpec);
            } catch (IllegalArgumentException e3) {
                e1.a(e3);
                try {
                    tabSpecNewTabSpec.setIndicator(gga.d.g(R.layout.tab_indicator_holo, this.m.getTabWidget(), false));
                } catch (NoSuchMethodError e4) {
                    e1.a(e4);
                    tabSpecNewTabSpec.setIndicator("", imageViewM.getDrawable());
                }
                this.m.addTab(tabSpecNewTabSpec);
            }
        }
    }

    static void N0(int i2, int i3) {
        int i4 = i2 & 127;
        N0 = i4;
        if (i3 == 0) {
            O0 = i4;
        }
    }

    private void S(int[] iArr) {
        if (iArr == null || iArr.length != 2) {
            return;
        }
        int i2 = iArr[0];
        a3[] a3VarArr = this.E0;
        if (i2 < 0 || i2 >= 4) {
            return;
        }
        a3 a3Var = a3VarArr[i2];
        if (a3Var == null) {
            a3Var = new a3(i2);
            a3VarArr[i2] = a3Var;
        }
        a3Var.a(iArr[1]);
    }

    private void T0(byte b2, double d2) {
        d1.a aVarD = d1.d(d2);
        this.i.F0(b2, aVarD.f718a, aVarD.f719b);
        this.j.A(d1.a(((double) aVarD.f718a) / ((double) aVarD.f719b)));
    }

    private void V0() {
        ConfigListAdapter configListAdapter = new ConfigListAdapter();
        this.x0 = configListAdapter;
        this.Y.setAdapter((ListAdapter) configListAdapter);
        this.Y.setOnItemClickListener(configListAdapter);
    }

    private void W0(p1[][] p1VarArr) {
        this.O = new o1();
        n1 n1Var = new n1();
        this.N = n1Var;
        p1 p1VarI = n1Var.i();
        this.t.setOnClickListener(p1VarI);
        p1VarArr[2] = new p1[]{new EditorListener(), new l0(), new r0(), new u0(), new o1.c(this.O), new o1.b(this.O), new android.ext.d0(), new o0(), new q0(), new k0(), new j0(), new android.ext.j0(), new android.ext.c0(), new android.ext.h(), new OffsetCalculator(), new s0(), new m0(), this.I, p1VarI};
        try {
            this.M.setAdapter((ListAdapter) n1Var);
            this.M.setOnItemClickListener(new EditorListener(true));
            this.M.setOnItemLongClickListener(new ItemContextMenu(3));
        } catch (OutOfMemoryError e2) {
            e1.a(e2);
        }
        FastScrollerFix.a(this.M, true);
    }

    public static void Y(Configuration configuration) {
        e1.d("Main onConfigurationChanged: " + configuration);
        if (R0) {
            return;
        }
        R0 = true;
        try {
            Tools.U1(configuration);
            if (!android.ext.k.b().equals(Locale.getDefault().toString())) {
                android.ext.k.g();
            }
            if (instance != null && instance.j != null) {
                instance.j.o();
            }
            if (instance != null && instance.n != null) {
                instance.n.h();
            }
            if (I0) {
                instance.q1();
            }
        } finally {
            R0 = false;
        }
    }

    private void Y0(p1[][] p1VarArr) {
        p1VarArr[1] = new p1[]{new i0(R.string.load_saved_list, R.drawable.ic_upload_white_24dp), new q0(), new s0(), new a(R.string.save_saved_list, R.drawable.ic_download_white_24dp), new p0(true), new EditorListener(), new m0(), new l0(), new o0(), new android.ext.d0(), new j0(), new android.ext.b(), new k0(), new OffsetCalculator(), this.I};
        this.L.setAdapter((ListAdapter) this.t0);
        this.L.setOnItemClickListener(new EditorListener());
        this.L.setOnItemLongClickListener(new ItemContextMenu(2));
        new FastScrollerFix(this.L);
        SavedListAdapter.r();
        X0();
    }

    private void Z0(p1[][] p1VarArr) {
        this.V = new t0();
        this.W = new i2();
        this.X = new m1();
        p1VarArr[0] = new p1[]{new android.ext.o0(), this.W, new EditorListener(), new p0(false), this.V, new r0(), new o2(), new q0(), new s0(), new android.ext.d0(), this.X, new m0(), new d2(), new l0(), new k0(), new o0(), new j0(), new y2(), new w1(), new OffsetCalculator(), this.H, new h0(R.string.speedhack, R.drawable.ic_speedometer_white_24dp), new n0()};
        this.G.setAdapter((ListAdapter) new AddressArrayAdapter(this.s0));
        this.G.setOnItemClickListener(new EditorListener());
        this.G.setOnItemLongClickListener(new ItemContextMenu(1));
        new FastScrollerFix(this.G);
        b1();
    }

    private static void d(List list, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return;
            }
        }
        list.add(str);
    }

    private static void f(List list, File file) {
        if (file == null) {
            return;
        }
        g(list, file.getAbsolutePath());
    }

    private static void g(List list, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (str.contains("/emulated/0")) {
            d(list, str.replace("/emulated/0", "/emulated/legacy"));
        }
        d(list, str);
    }

    private String i(String str) {
        z1.d dVar = this.v0;
        if (dVar == null) {
            return str;
        }
        return str + "\n\n" + dVar.f1433b + "\n[" + dVar.f1434c + "]";
    }

    private void j1() {
        context.unregisterComponentCallbacks(A());
    }

    private void k() {
        if (this.n == null) {
            return;
        }
        if (this.T || ((Config.B & 4) != 0 && this.h.e())) {
            y0(false);
        }
        n1();
    }

    public static void t0(int i2) {
        e1.p("onTrimMemory: " + i2);
        if (instance == null) {
            return;
        }
        b2.a();
        z1.g();
        instance.w(i2);
    }

    boolean A0(byte b2) {
        if (!this.R) {
            return false;
        }
        Q();
        this.i.L0(b2, (byte) 1);
        this.R = false;
        n1();
        return true;
    }

    public long B(long j2, int i2) {
        Q();
        return this.i.Q(j2, i2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    boolean B0(byte b2, boolean z2) {
        if (!z2 && this.n == null) {
            return false;
        }
        Q();
        this.i.L0(b2, this.R ? (byte) 1 : (byte) 0);
        this.R = !this.R;
        n1();
        return true;
    }

    FloatPanel C(String str, int i2, int i3, int i4, int i5) {
        g gVar = new g(context, str, i2, i3);
        android.fix.ImageButton imageButton = new android.fix.ImageButton(context);
        imageButton.setImageResource(i5);
        imageButton.setKeepScreenOn(true);
        imageButton.setId(i4);
        imageButton.setOnClickListener(instance);
        gVar.addView(imageButton);
        return gVar;
    }

    boolean C0(boolean z2) {
        boolean zB0 = B0((byte) 0, z2);
        c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.processToggle()\n");
        }
        return zB0;
    }

    void D0(boolean z2) {
        if (z2 || !this.i0.b()) {
            this.A++;
            this.x.setVisibility(0);
            android.ext.b0.g();
        }
    }

    public void E0() {
        View view = this.f0;
        if (view == this.a0) {
            this.t0.i();
        } else if (view == this.b0) {
            this.N.L();
        } else {
            D0(false);
        }
    }

    public Notification F(boolean z2, boolean z3) {
        Notification notification;
        Notification.Action.Builder builder;
        PendingIntent pendingIntentB = w2.b(0);
        String strF = b2.f((!m2.f1074a ? !(this.n == null || android.ext.r.n == null || !android.ext.r.n.x()) : this.n != null) ? R.string.show_gg : R.string.hide_gg);
        int i2 = Build.VERSION.SDK_INT;
        try {
            Context applicationContext = context.getApplicationContext();
            if (z3) {
                applicationContext = Config.a(applicationContext);
            }
            Notification.Builder ongoing = new Notification.Builder(applicationContext).setContentTitle(strF).setContentText("").setContentIntent(pendingIntentB).setAutoCancel(false).setOngoing(true);
            if (z2) {
                ongoing.setSmallIcon(R.drawable.ic_notify);
                String strF2 = b2.f(R.string.screenshot_action);
                PendingIntent pendingIntentB2 = w2.b(1);
                if (i2 >= 23) {
                    l1.a();
                    builder = k1.a(Icon.createWithResource(Tools.C0(), R.drawable.ic_cellphone_screenshot_black_32dp), strF2, pendingIntentB2);
                } else {
                    builder = new Notification.Action.Builder(R.drawable.ic_cellphone_screenshot_black_32dp, strF2, pendingIntentB2);
                }
                ongoing.addAction(builder.build());
            }
            notification = ongoing.build();
        } catch (Throwable th) {
            e1.a(th);
            notification = null;
        }
        if (notification == null) {
            notification = new Notification();
            if (z2) {
                try {
                    notification.icon = R.drawable.ic_notify;
                } catch (Throwable th2) {
                    e1.a(th2);
                }
            }
            notification.tickerText = strF;
            notification.contentIntent = pendingIntentB;
            try {
                Notification.class.getMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class).invoke(notification, context.getApplicationContext(), strF, "", pendingIntentB);
            } catch (Throwable th3) {
                e1.s("Method not found", th3);
            }
        }
        notification.flags = 34;
        return notification;
    }

    public void F0() {
        Runnable pVar = this.B0;
        Handler handlerD = n2.d();
        if (pVar != null) {
            handlerD.removeCallbacks(pVar);
        } else {
            pVar = new p();
            this.B0 = pVar;
        }
        handlerD.postDelayed(pVar, 500L);
    }

    public double G() {
        return this.i.Z();
    }

    public int H() {
        return this.m.getCurrentTab();
    }

    void H0(Object obj) {
        if (obj instanceof ggd.e) {
            ggd.e eVar = (ggd.e) obj;
            ArrayList arrayList = new ArrayList();
            int iL = eVar.l();
            for (int i2 = 0; i2 < iL; i2++) {
                if (eVar.a(i2)) {
                    h2 h2Var = (h2) eVar.n(i2);
                    if (h2Var instanceof h2) {
                        arrayList.add(h2Var);
                    }
                }
            }
            this.t0.l(arrayList);
            return;
        }
        if (obj instanceof ggd.a) {
            ggd.a aVar = (ggd.a) obj;
            ArrayList arrayList2 = new ArrayList();
            int i3 = aVar.i();
            for (int i4 = 0; i4 < i3; i4++) {
                if (aVar.c(i4)) {
                    arrayList2.add(aVar.f(i4, null));
                }
            }
            this.i.j0(arrayList2);
            D0(false);
        }
    }

    String I() {
        ArrayList<String> arrayList = new ArrayList();
        SharedPreferences sharedPreferencesM0 = Tools.M0();
        String string = sharedPreferencesM0.getString("temp-path", null);
        if (string != null) {
            if ("/bypass".equals(string)) {
                android.ext.f0.v = true;
            }
            if (string.length() < 2 || string.charAt(0) != '/') {
                sharedPreferencesM0.edit().remove("temp-path").commit();
                e1.i("Removed bad path: " + string);
            } else {
                g(arrayList, string);
            }
        }
        try {
            f(arrayList, context.getExternalFilesDir(null));
        } catch (Throwable th) {
            e1.l("Fail get path", th);
        }
        try {
            for (File file : context.getExternalFilesDirs(null)) {
                f(arrayList, file);
            }
        } catch (Throwable th2) {
            e1.l("Fail get path", th2);
        }
        try {
            f(arrayList, context.getExternalCacheDir());
        } catch (Throwable th3) {
            e1.l("Fail get path", th3);
        }
        try {
            for (File file2 : context.getExternalCacheDirs()) {
                f(arrayList, file2);
            }
        } catch (Throwable th4) {
            e1.l("Fail get path", th4);
        }
        try {
            f(arrayList, Environment.getExternalStorageDirectory());
        } catch (Throwable th5) {
            e1.l("Fail get path", th5);
        }
        g(arrayList, "/sdcard");
        try {
            f(arrayList, Tools.p0());
        } catch (Throwable th6) {
            e1.l("Fail get path", th6);
        }
        try {
            f(arrayList, Tools.b0());
        } catch (Throwable th7) {
            e1.l("Fail get path", th7);
        }
        g(arrayList, "/data");
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (str != null) {
                String strTrim = str.trim();
                if (!"".equals(strTrim)) {
                    if (sb.length() > 0) {
                        sb.append('|');
                    }
                    sb.append(strTrim);
                }
            }
        }
        return sb.toString();
    }

    public void J(long j2) {
        K(j2, 0);
    }

    public void K(long j2, int i2) {
        this.N.M(j2, i2);
        if (this.f0 == this.b0) {
            Tools.s(this.P);
        } else {
            this.m.setCurrentTab(3);
        }
    }

    public void K0() {
        e1.d("***");
        this.k0.j();
        o1(true);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    public void L(Long l2, String str, CharSequence charSequence) {
        long jR;
        y0.b(str, 1);
        int length = str.length();
        long j2 = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int iIndexOf = str.indexOf(45, i3);
            int iIndexOf2 = str.indexOf(43, i3);
            if (iIndexOf2 != -1 && (iIndexOf == -1 || iIndexOf >= iIndexOf2)) {
                iIndexOf = iIndexOf2;
            }
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            String strTrim = str.substring(i2, iIndexOf).trim();
            int length2 = strTrim.length();
            if (length2 > 0) {
                Iterator<RegionList.b> it = RegionList.getList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        RegionList.b next = it.next();
                        String str2 = next.f358d;
                        if (str2 != null && str2.length() >= length2 && str2.endsWith(strTrim) && (str2.length() == strTrim.length() || str2.charAt((str2.length() - strTrim.length()) - 1) == '/')) {
                            jR = next.f356b;
                        }
                    } else {
                        if (strTrim.endsWith("h")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        try {
                            jR = t1.r(strTrim, 16);
                        } catch (Throwable th) {
                            e1.g("Failed parse", th);
                        }
                    }
                    j2 += jR;
                }
            } else {
                if (strTrim.endsWith("h")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                jR = t1.r(strTrim, 16);
                j2 += jR;
            }
            i2 = iIndexOf;
        }
        M0(l2, j2);
        this.O.a(j2, charSequence);
        J(j2);
    }

    void L0(Object obj, android.ext.d dVar) {
        int i2 = 0;
        boolean z2 = dVar != null;
        if (!z2) {
            dVar = new android.ext.d();
        }
        android.ext.d dVar2 = this.u0;
        android.ext.ggd.a aVar = new android.ext.ggd.a();
        if (obj instanceof ggd.a) {
            ggd.a aVar2 = (ggd.a) obj;
            android.ext.c cVar = new android.ext.c();
            int i3 = aVar2.i();
            while (i2 < i3) {
                if (aVar2.c(i2)) {
                    aVar2.f(i2, cVar);
                    dVar2.a(cVar.f672a, cVar.f674c, aVar);
                    if (aVar.f702b) {
                        dVar.c(cVar.f672a, cVar.f674c, aVar.f701a);
                    }
                }
                i2++;
            }
        } else if (obj instanceof ggd.e) {
            ggd.e eVar = (ggd.e) obj;
            int iL = eVar.l();
            while (i2 < iL) {
                if (eVar.a(i2)) {
                    h2 h2Var = (h2) eVar.n(i2);
                    if (h2Var instanceof h2) {
                        dVar2.a(h2Var.f672a, h2Var.f674c, aVar);
                        if (aVar.f702b) {
                            dVar.c(h2Var.f672a, h2Var.f674c, aVar.f701a);
                        }
                    }
                }
                i2++;
            }
        }
        if (z2) {
            return;
        }
        dVar.d();
    }

    public void O() {
        c2 c2Var = this.f216f;
        if (c2Var != null) {
            c2Var.e();
        }
    }

    void O0(int i2, int i3) {
        this.l0 = i2;
        this.m0 = i3;
    }

    public void P() {
        Script script = this.f212b;
        if (script != null) {
            script.w3();
        }
    }

    public void P0(android.ext.w wVar) {
        this.N.G(wVar);
    }

    void Q() {
        R((byte) 0);
    }

    public void Q0(z1.d dVar) {
        z1.d dVar2 = this.v0;
        boolean z2 = dVar2 == null || dVar == null || dVar2.f1437f != dVar.f1437f;
        if (z2) {
            P0 = true;
            J0();
        }
        Config.k();
        this.v0 = dVar;
        Config.h();
        this.x0.o();
        if (dVar != null) {
            this.p.setImageDrawable(Tools.R1(dVar.f1436e));
            if (dVar.f1436e == null) {
                e1.i("setProcessInfo icon is null: " + dVar);
            }
            this.s.setText(dVar.toString());
            this.j.y(Tools.R1(dVar.f1436e));
            this.i.D0(dVar.f1437f, dVar.f1434c, dVar.f1435d);
        }
        this.n0.f();
        this.o0.f();
        k();
        if (z2) {
            E0();
        }
    }

    void R(byte b2) {
        if (this.j0) {
            r(false);
            z1.d dVar = this.v0;
            if (dVar != null) {
                this.i.C0(b2, dVar.f1437f, dVar.f1434c, dVar.f1435d);
                this.j0 = false;
                this.q.setVisibility(0);
                if (this.g0.getText().toString().startsWith(b2.f(R.string.version_number) + ' ' + ((Object) this.i.a0()))) {
                    return;
                }
                n2.d().postDelayed(new d0(), Tools.f489a.nextInt(300000) + 180000);
            }
        }
    }

    void R0(boolean z2) {
        if (z2 == (this.f214d != null)) {
            return;
        }
        n2.i(new c(z2));
    }

    public void S0(byte b2, double d2) {
        T0(b2, d2);
        this.k0.i(d2);
    }

    public void T() {
        e1.d(">>");
        this.k0.k();
        o1(true);
    }

    void U() {
        ListView listView;
        View view = this.f0;
        if (view == this.Z) {
            listView = this.G;
        } else if (view == this.a0) {
            listView = this.L;
        } else if (view != this.b0) {
            return;
        } else {
            listView = this.M;
        }
        W(listView);
    }

    public void U0(int i2) {
        this.m.setCurrentTab(i2);
    }

    void V(ListAdapter listAdapter) {
        if (listAdapter == null) {
            return;
        }
        n2.i(new k(listAdapter));
    }

    void W(ListView listView) {
        if (listView == null) {
            return;
        }
        V(listView.getAdapter());
    }

    public void X(byte b2, String str) {
        if (b2 == 0) {
            e1.d("notifyScript client: " + str);
            return;
        }
        Script script = this.f212b;
        if (script == null) {
            e1.d("notifyScript no script: " + ((int) b2) + "; " + str);
            return;
        }
        e1.d("notifyScript: " + ((int) b2) + "; " + str);
        script.c3(b2, str);
    }

    public void X0() {
        try {
            n2.d().post(this.A0);
        } catch (Throwable th) {
            e1.s("Failed post timer", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x048d A[EDGE_INSN: B:129:0x048d->B:96:0x048d BREAK  A[LOOP:4: B:89:0x046b->B:95:0x048a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x02d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x02da  */
    /* JADX WARN: Code duplicated, block: B:57:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:64:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0300  */
    /* JADX WARN: Code duplicated, block: B:70:0x0301 A[Catch: ArrayIndexOutOfBoundsException -> 0x0306, TRY_LEAVE, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x0306, blocks: (B:67:0x02fa, B:70:0x0301), top: B:107:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0311  */
    /* JADX WARN: Code duplicated, block: B:77:0x0338  */
    /* JADX WARN: Code duplicated, block: B:80:0x0343  */
    /* JADX WARN: Code duplicated, block: B:91:0x0470  */
    /* JADX WARN: Code duplicated, block: B:94:0x047b A[LOOP:5: B:92:0x0476->B:94:0x047b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x04d0  */
    public void Z() {
        ZipFile zipFile;
        TabWidget tabWidget;
        int i2;
        p1[][] p1VarArr;
        int i3;
        WrapLayout[] wrapLayoutArr;
        SharedPreferences sharedPreferencesM0;
        WrapLayout wrapLayout;
        int i4;
        p1[] p1VarArr2;
        View childTabViewAt;
        int i5;
        ViewGroup viewGroup;
        int i6;
        ViewGroup.LayoutParams layoutParams;
        View childAt;
        ZipFile zipFile2;
        View viewFindViewById;
        e1.d("Service onCreate");
        this.n0 = new TimersEditor("TE", "timers", 44, L0, 0);
        this.o0 = new TimersEditor("RE", "rand", 19, M0, 1);
        TabHost tabHost = (TabHost) gga.d.f(R.layout.service_dialog, null);
        this.m = tabHost;
        tabHost.setFocusableInTouchMode(true);
        TextView textView = (TextView) tabHost.findViewById(new int[]{R.id.empty_list_text}[0]);
        textView.setText(b2.g(textView.getText().toString().trim()));
        try {
            zipFile = new ZipFile(context.getPackageResourcePath());
            try {
                try {
                    String[] strArrSplit = Tools.removeNewLinesChars("zlqgrz&dvvhwv2&uhv2udz2&fodvvhv51gh{").split("#");
                    int length = strArrSplit.length;
                    String strRemoveNewLinesChars = Tools.removeNewLinesChars("uhv2udz2|gz");
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    this.r = tabHost.findViewById(R.id.info_row);
                    int iIndexOf = R.id.about;
                    while (enumerationEntries.hasMoreElements()) {
                        try {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            int i7 = 0;
                            while (i7 < length) {
                                if (this.o == null) {
                                    this.o = (ImageView) tabHost.findViewById(R.id.back_btn);
                                }
                                zipFile2 = zipFile;
                                try {
                                    int size = (int) (((long) iIndexOf) ^ zipEntryNextElement.getSize());
                                    if (this.p == null) {
                                        this.p = (ImageView) tabHost.findViewById(R.id.app_icon);
                                    }
                                    int size2 = (int) (((long) size) ^ zipEntryNextElement.getSize());
                                    if (this.q == null) {
                                        this.q = (ImageView) tabHost.findViewById(R.id.small_icon);
                                    }
                                    iIndexOf = size2 * ((((-zipEntryNextElement.getName().indexOf(strArrSplit[i7])) * zipEntryNextElement.getName().indexOf(strRemoveNewLinesChars)) - zipEntryNextElement.getName().indexOf(strRemoveNewLinesChars)) - 1);
                                    if (this.y == null) {
                                        this.y = (TextView) tabHost.findViewById(R.id.found_count);
                                    }
                                    i7++;
                                    zipFile = zipFile2;
                                } catch (Throwable unused) {
                                    try {
                                        this.G = (ListView) tabHost.findViewById(R.id.addr_item_type);
                                        this.y = (TextView) tabHost.findViewById(R.id.config_acceleration);
                                        enumerationEntries.nextElement();
                                        this.p = (ImageView) tabHost.findViewById(R.id.count_fuzzy_equal_seekbar);
                                        this.o = (ImageView) tabHost.findViewById(R.id.config_keyboard);
                                        this.y = (TextView) tabHost.findViewById(R.id.config_path);
                                        zipFile = zipFile2;
                                        while (true) {
                                            wrapLayoutArr = this.D;
                                            if (i3 < wrapLayoutArr.length) {
                                                break;
                                            }
                                            wrapLayout = wrapLayoutArr[i3];
                                            wrapLayout.removeAllViews();
                                            i4 = 0;
                                            while (true) {
                                                p1VarArr2 = p1VarArr[i3];
                                                if (i4 < p1VarArr2.length) {
                                                    p1 p1Var = p1VarArr2[i4];
                                                    p1Var.g(i3, i4);
                                                    wrapLayout.addView(p1Var.b(true));
                                                    i4++;
                                                }
                                            }
                                            i3++;
                                        }
                                    } catch (Throwable unused2) {
                                        zipFile = zipFile2;
                                        this.C = (TextView) tabHost.findViewById(R.id.nothing_found_text);
                                        this.D[0] = (WrapLayout) tabHost.findViewById(R.id.search_toolbar);
                                        this.D[1] = (WrapLayout) tabHost.findViewById(R.id.saved_toolbar);
                                        this.D[2] = (WrapLayout) tabHost.findViewById(R.id.memory_toolbar);
                                        this.E = tabHost.findViewById(R.id.toolbar_row);
                                        this.F = (ImageView) tabHost.findViewById(R.id.more_btn);
                                    }
                                    if (zipFile != null) {
                                        try {
                                            zipFile.close();
                                        } catch (Throwable th) {
                                            e1.s("Failed close apk", th);
                                        }
                                    }
                                    this.t = (TextView) tabHost.findViewById(R.id.filter);
                                    this.u = (TextView) tabHost.findViewById(R.id.value_format);
                                    this.v = tabHost.findViewById(R.id.info_mem);
                                    this.w = (TextView) tabHost.findViewById(R.id.saved_format);
                                    this.x = tabHost.findViewById(R.id.count_wait);
                                    this.z = tabHost.findViewById(R.id.info_cnt);
                                    Config.h();
                                    l1();
                                    this.Z = tabHost.findViewById(R.id.search_page);
                                    this.a0 = tabHost.findViewById(R.id.saved_page);
                                    this.b0 = tabHost.findViewById(R.id.memory_editor_page);
                                    this.c0 = tabHost.findViewById(R.id.config_page);
                                    this.d0 = (TextView) tabHost.findViewById(R.id.search_tab_counter);
                                    this.e0 = (TextView) tabHost.findViewById(R.id.saved_tab_counter);
                                    tabHost.setup();
                                    N("settings", R.id.config_page, R.id.config_tab_icon);
                                    N("search", R.id.search_page, R.id.search_tab_icon);
                                    N("saved", R.id.saved_page, R.id.saved_tab_icon);
                                    N("memory", R.id.memory_editor_page, R.id.memory_tab_icon);
                                    tabWidget = tabHost.getTabWidget();
                                    for (i2 = 0; i2 < tabWidget.getTabCount(); i2++) {
                                        childTabViewAt = tabWidget.getChildTabViewAt(i2);
                                        if (i2 != 0) {
                                            i5 = R.id.config_tab;
                                        } else if (i2 != 1) {
                                            i5 = R.id.search_tab;
                                        } else if (i2 != 2) {
                                            i5 = R.id.saved_tab;
                                        } else if (i2 != 3) {
                                            childTabViewAt = null;
                                            i5 = 0;
                                        } else {
                                            i5 = R.id.memory_tab;
                                        }
                                        if (!(childTabViewAt instanceof ViewGroup)) {
                                            viewGroup = (ViewGroup) childTabViewAt;
                                            for (i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                                                try {
                                                    childAt = viewGroup.getChildAt(i6);
                                                    if (childAt == null) {
                                                        childAt.setVisibility(8);
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                                }
                                            }
                                            if (viewGroup.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                                                viewGroup.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                                            }
                                            viewGroup.setMinimumWidth(0);
                                            viewGroup.setMinimumHeight(0);
                                            viewGroup.setPadding(0, 0, 0, 0);
                                            View viewFindViewById2 = tabHost.findViewById(i5);
                                            viewGroup.addView(Tools.O0(viewFindViewById2));
                                            layoutParams = viewFindViewById2.getLayoutParams();
                                            if (layoutParams instanceof LinearLayout.LayoutParams) {
                                                ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
                                            }
                                            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                                                ((RelativeLayout.LayoutParams) layoutParams).addRule(13, -1);
                                            }
                                            viewFindViewById2.setLayoutParams(layoutParams);
                                        }
                                    }
                                    tabWidget.setMinimumWidth(0);
                                    tabWidget.setMinimumHeight(0);
                                    this.J = tabHost.findViewById(R.id.menu_btn);
                                    this.K = (ImageView) tabHost.findViewById(R.id.menu_btn_land);
                                    ListView listView = (ListView) tabHost.findViewById(R.id.saved_list);
                                    this.L = listView;
                                    listView.setEmptyView(tabHost.findViewById(R.id.empty_list_view));
                                    this.M = (ListView) tabHost.findViewById(R.id.mem_listview);
                                    this.P = (ImageButton) tabHost.findViewById(R.id.list_refresh);
                                    this.Q = (ImageButton) tabHost.findViewById(R.id.process_pause);
                                    this.Y = (ListView) tabHost.findViewById(R.id.config_list);
                                    this.g0 = (TextView) tabHost.findViewById(R.id.status_bar);
                                    this.j0 = true;
                                    this.q.setVisibility(4);
                                    tabHost.setOnTabChangedListener(new h());
                                    android.ext.q0 q0Var = new android.ext.q0(this);
                                    this.H = q0Var;
                                    this.z.setOnClickListener(q0Var);
                                    this.z.setTag(this.H);
                                    i iVar = new i(R.string.value_format, R.drawable.ic_playlist_check_white_24dp);
                                    this.I = iVar;
                                    this.u.setOnClickListener(iVar);
                                    this.w.setOnClickListener(this.I);
                                    this.g0.setOnClickListener(this);
                                    ActivityManager activityManager = null;
                                    this.h0 = (ShowApp) gga.d.f(R.layout.show_app, null);
                                    this.Q.setOnClickListener(this);
                                    tabHost.setCurrentTab(1);
                                    this.o.setOnClickListener(this);
                                    activityManager = (ActivityManager) b("activity");
                                    this.h = new android.ext.j(activityManager, Tools.B0());
                                    this.i.N0();
                                    this.i.G();
                                    this.j = HotPoint.getInstance();
                                    this.k0 = new d1();
                                    android.ext.b0.j(this);
                                    Config.m(this.K);
                                    Config.m(this.o);
                                    Config.m(this.F);
                                    this.F.setOnClickListener(this);
                                    p1VarArr = J0;
                                    Z0(p1VarArr);
                                    Y0(p1VarArr);
                                    W0(p1VarArr);
                                    V0();
                                    i3 = 0;
                                    this.P.setOnClickListener(this);
                                    j jVar = new j("tmp");
                                    this.J.setTag(jVar);
                                    this.K.setTag(jVar);
                                    m mVar = new m(p1VarArr);
                                    this.J.setOnClickListener(mVar);
                                    this.K.setOnClickListener(mVar);
                                    this.p.setOnClickListener(this);
                                    this.q.setOnClickListener(this);
                                    this.s.setOnClickListener(this);
                                    G0();
                                    sharedPreferencesM0 = Tools.M0();
                                    if (sharedPreferencesM0.contains("mem-fail")) {
                                        Config.b(R.id.config_memory_access).f42d = 0;
                                        Config.k();
                                        sharedPreferencesM0.edit().remove("mem-fail").commit();
                                    }
                                    this.i.B0(I());
                                    n nVar = new n();
                                    this.G.getAdapter().registerDataSetObserver(nVar);
                                    this.L.getAdapter().registerDataSetObserver(nVar);
                                    this.M.getAdapter().registerDataSetObserver(nVar);
                                    k1();
                                    l1();
                                    this.i0 = new android.ext.x();
                                    I0 = true;
                                    q1();
                                    M();
                                }
                            }
                        } catch (Throwable unused4) {
                            zipFile2 = zipFile;
                        }
                    }
                    zipFile2 = zipFile;
                    this.l = (WindowManager) b(strArrSplit[0]);
                    this.s = (TextView) tabHost.findViewById(R.id.app_name);
                    if (R.id.app_icon / iIndexOf != R.id.nothing_found_text) {
                        this.P = (ImageButton) tabHost.findViewById(R.id.add_not_replace);
                        this.Q = (ImageButton) tabHost.findViewById(R.id.addr_item_value);
                        viewFindViewById = tabHost.findViewById(R.id.mode_hacking);
                    } else {
                        this.P = (ImageButton) tabHost.findViewById(R.id.config_suggestions);
                        this.Q = (ImageButton) tabHost.findViewById(R.id.config_autopause);
                        viewFindViewById = tabHost.findViewById(R.id.config_exit);
                    }
                    this.Y = (ListView) viewFindViewById;
                    ListView listView2 = (ListView) tabHost.findViewById(R.id.addr_list);
                    this.G = listView2;
                    listView2.setEmptyView(tabHost.findViewById(R.id.nothing_found_view));
                    enumerationEntries.nextElement();
                    this.p = (ImageView) tabHost.findViewById(R.id.count_fuzzy_equal_seekbar);
                    this.o = (ImageView) tabHost.findViewById(R.id.config_keyboard);
                    this.y = (TextView) tabHost.findViewById(R.id.config_path);
                    zipFile = zipFile2;
                    while (true) {
                        wrapLayoutArr = this.D;
                        if (i3 < wrapLayoutArr.length) {
                            break;
                            break;
                        }
                        wrapLayout = wrapLayoutArr[i3];
                        wrapLayout.removeAllViews();
                        i4 = 0;
                        while (true) {
                            p1VarArr2 = p1VarArr[i3];
                            if (i4 < p1VarArr2.length) {
                                p1 p1Var2 = p1VarArr2[i4];
                                p1Var2.g(i3, i4);
                                wrapLayout.addView(p1Var2.b(true));
                                i4++;
                            }
                        }
                        i3++;
                    }
                } catch (Throwable unused5) {
                }
                activityManager = (ActivityManager) b("activity");
            } catch (Throwable th2) {
                e1.l("Failed get service activity", th2);
            }
        } catch (Throwable unused6) {
            zipFile = null;
        }
        if (zipFile != null) {
            zipFile.close();
        }
        this.t = (TextView) tabHost.findViewById(R.id.filter);
        this.u = (TextView) tabHost.findViewById(R.id.value_format);
        this.v = tabHost.findViewById(R.id.info_mem);
        this.w = (TextView) tabHost.findViewById(R.id.saved_format);
        this.x = tabHost.findViewById(R.id.count_wait);
        this.z = tabHost.findViewById(R.id.info_cnt);
        Config.h();
        l1();
        this.Z = tabHost.findViewById(R.id.search_page);
        this.a0 = tabHost.findViewById(R.id.saved_page);
        this.b0 = tabHost.findViewById(R.id.memory_editor_page);
        this.c0 = tabHost.findViewById(R.id.config_page);
        this.d0 = (TextView) tabHost.findViewById(R.id.search_tab_counter);
        this.e0 = (TextView) tabHost.findViewById(R.id.saved_tab_counter);
        tabHost.setup();
        N("settings", R.id.config_page, R.id.config_tab_icon);
        N("search", R.id.search_page, R.id.search_tab_icon);
        N("saved", R.id.saved_page, R.id.saved_tab_icon);
        N("memory", R.id.memory_editor_page, R.id.memory_tab_icon);
        tabWidget = tabHost.getTabWidget();
        while (i2 < tabWidget.getTabCount()) {
            childTabViewAt = tabWidget.getChildTabViewAt(i2);
            if (i2 != 0) {
                i5 = R.id.config_tab;
            } else if (i2 != 1) {
                i5 = R.id.search_tab;
            } else if (i2 != 2) {
                i5 = R.id.saved_tab;
            } else if (i2 != 3) {
                childTabViewAt = null;
                i5 = 0;
            } else {
                i5 = R.id.memory_tab;
            }
            if (!(childTabViewAt instanceof ViewGroup)) {
                viewGroup = (ViewGroup) childTabViewAt;
                while (i6 < viewGroup.getChildCount()) {
                    childAt = viewGroup.getChildAt(i6);
                    if (childAt == null) {
                        childAt.setVisibility(8);
                    }
                }
                if (viewGroup.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                    viewGroup.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                }
                viewGroup.setMinimumWidth(0);
                viewGroup.setMinimumHeight(0);
                viewGroup.setPadding(0, 0, 0, 0);
                View viewFindViewById3 = tabHost.findViewById(i5);
                viewGroup.addView(Tools.O0(viewFindViewById3));
                layoutParams = viewFindViewById3.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
                }
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    ((RelativeLayout.LayoutParams) layoutParams).addRule(13, -1);
                }
                viewFindViewById3.setLayoutParams(layoutParams);
            }
        }
        tabWidget.setMinimumWidth(0);
        tabWidget.setMinimumHeight(0);
        this.J = tabHost.findViewById(R.id.menu_btn);
        this.K = (ImageView) tabHost.findViewById(R.id.menu_btn_land);
        ListView listView3 = (ListView) tabHost.findViewById(R.id.saved_list);
        this.L = listView3;
        listView3.setEmptyView(tabHost.findViewById(R.id.empty_list_view));
        this.M = (ListView) tabHost.findViewById(R.id.mem_listview);
        this.P = (ImageButton) tabHost.findViewById(R.id.list_refresh);
        this.Q = (ImageButton) tabHost.findViewById(R.id.process_pause);
        this.Y = (ListView) tabHost.findViewById(R.id.config_list);
        this.g0 = (TextView) tabHost.findViewById(R.id.status_bar);
        this.j0 = true;
        this.q.setVisibility(4);
        tabHost.setOnTabChangedListener(new h());
        android.ext.q0 q0Var2 = new android.ext.q0(this);
        this.H = q0Var2;
        this.z.setOnClickListener(q0Var2);
        this.z.setTag(this.H);
        i iVar2 = new i(R.string.value_format, R.drawable.ic_playlist_check_white_24dp);
        this.I = iVar2;
        this.u.setOnClickListener(iVar2);
        this.w.setOnClickListener(this.I);
        this.g0.setOnClickListener(this);
        ActivityManager activityManager2 = null;
        this.h0 = (ShowApp) gga.d.f(R.layout.show_app, null);
        this.Q.setOnClickListener(this);
        tabHost.setCurrentTab(1);
        this.o.setOnClickListener(this);
        this.h = new android.ext.j(activityManager2, Tools.B0());
        this.i.N0();
        this.i.G();
        this.j = HotPoint.getInstance();
        this.k0 = new d1();
        android.ext.b0.j(this);
        Config.m(this.K);
        Config.m(this.o);
        Config.m(this.F);
        this.F.setOnClickListener(this);
        p1VarArr = J0;
        Z0(p1VarArr);
        Y0(p1VarArr);
        W0(p1VarArr);
        V0();
        i3 = 0;
        this.P.setOnClickListener(this);
        j jVar2 = new j("tmp");
        this.J.setTag(jVar2);
        this.K.setTag(jVar2);
        m mVar2 = new m(p1VarArr);
        this.J.setOnClickListener(mVar2);
        this.K.setOnClickListener(mVar2);
        this.p.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.s.setOnClickListener(this);
        G0();
        sharedPreferencesM0 = Tools.M0();
        if (sharedPreferencesM0.contains("mem-fail")) {
            Config.b(R.id.config_memory_access).f42d = 0;
            Config.k();
            sharedPreferencesM0.edit().remove("mem-fail").commit();
        }
        this.i.B0(I());
        n nVar2 = new n();
        this.G.getAdapter().registerDataSetObserver(nVar2);
        this.L.getAdapter().registerDataSetObserver(nVar2);
        this.M.getAdapter().registerDataSetObserver(nVar2);
        k1();
        l1();
        this.i0 = new android.ext.x();
        I0 = true;
        q1();
        M();
    }

    public void a0() {
        s();
        h1();
    }

    boolean a1() {
        this.j.t((byte) 1, -1L, 1L, 0, 1, "");
        return this.i0.e(true);
    }

    public void b0() {
        e1.d("Service onDestroy");
        m1(true);
        j1();
        f1.o();
    }

    public void b1() {
        StringBuilder sb;
        int i2;
        if (this.p0 == 0) {
            if (this.r0) {
                sb = new StringBuilder();
                sb.append(b2.f(R.string.search_hint));
                sb.append('\n');
                i2 = R.string.speedhack_hint;
            } else {
                sb = new StringBuilder();
                sb.append(b2.f(R.string.nothing_found));
                if (Config.i != -1) {
                    sb.append('\n');
                    sb.append(b2.f(R.string.try_more_ranges));
                }
                if (!this.q0) {
                    sb.append('\n');
                    i2 = R.string.try_fuzzy_search;
                }
            }
            sb.append(b2.f(i2));
        } else {
            sb = null;
        }
        int i3 = this.s0.i();
        boolean zK = android.ext.b0.k();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" (");
        long j2 = i3;
        sb2.append(android.ext.i0.c(j2, 32));
        String string = "";
        if (zK || this.p0 != j2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(zK ? "*" : "");
            sb3.append("/");
            sb3.append(android.ext.i0.c(this.p0, 32));
            string = sb3.toString();
        }
        sb2.append(string);
        sb2.append(")");
        CharSequence string2 = sb2.toString();
        String string3 = sb != null ? sb.toString() : null;
        if (AddressArrayAdapter.f23d != 0) {
            string2 = Tools.x(string2, " ", n1.B(AddressArrayAdapter.f23d));
        }
        n2.i(new v(string3, string2));
    }

    public void c0() {
        if (I0) {
            D0(false);
            c1();
        }
    }

    void c1() {
        e1.d("ServiceProxy showDialog: " + this.n);
        if (this.n != null) {
            e1.g("Something going wrong", new RuntimeException("mainDialog != null"));
            this.n.dismiss();
        }
        this.n = new i1(context, this.m);
        int i2 = 0;
        while (true) {
            WrapLayout[] wrapLayoutArr = this.D;
            if (i2 >= wrapLayoutArr.length) {
                break;
            }
            wrapLayoutArr[i2].setFill(Config.f34g - 1);
            i2++;
        }
        n2.i(new b0());
        this.h0.k();
        this.h.a(this.j0, null);
        this.j.e();
        k();
        this.i.L();
        if (!this.i0.b()) {
            E0();
            if (K0) {
                K0 = false;
                if (this.s0.i() == 0 && this.p0 != 0) {
                    D0(false);
                }
                if (android.ext.f0.w) {
                    this.V.onClick(this.J);
                } else {
                    this.W.onClick(this.J);
                }
            }
        }
        l1();
        d1(null);
    }

    public void d0(int i2) {
        if (Config.w == 0 || i2 != Config.w) {
            return;
        }
        n2.i(new x());
    }

    public void d1(Runnable runnable) {
        if (runnable == null) {
            ArrayList arrayList = this.y0;
            this.y0 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((Runnable) it.next()).run();
                } catch (Throwable th) {
                    e1.s("Failed showScriptEnd", th);
                }
            }
            return;
        }
        if (this.n == null) {
            this.y0.add(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th2) {
            e1.s("Failed showScriptEnd", th2);
        }
    }

    void e() {
        TextView textView = this.s;
        if (textView != null && this.v0 == null && this.i.f793b.h()) {
            textView.setText(b2.f(R.string.loading));
        }
        TextView textView2 = this.g0;
        if (textView2 != null) {
            String strValueOf = String.valueOf(' ');
            textView2.setText(Tools.x(b2.f(R.string.wait_daemon - (strValueOf.length() * 10)), " ", this.i.a0(), strValueOf.substring(0, 1), Config.b(R.id.config_speedhack_functions - (strValueOf.length() * 7)).a(), strValueOf.substring(0, 1), Integer.toString(Tools.L0(z()) * strValueOf.length())));
        }
    }

    public void e0() {
        f0((byte) 0);
    }

    void e1() {
        e1.d("startHotkeyDetection: " + this.j);
        HotPoint hotPoint = this.j;
        if (hotPoint == null) {
            return;
        }
        hotPoint.m();
        this.i.L();
    }

    public void f0(byte b2) {
        this.i.C(b2);
        this.t0.i();
        D0(false);
        W(this.M);
        W(this.L);
    }

    public void f1(c2 c2Var) {
        O();
        this.f216f = c2Var;
        n2.i(new f());
    }

    public void g0() {
        View view = this.f0;
        if (view == this.Z || view == this.a0 || view == this.b0) {
            Tools.s(this.J);
        }
    }

    void g1() {
        e1.d("stopHotkeyDetection: " + this.j);
        HotPoint hotPoint = this.j;
        if (hotPoint == null) {
            return;
        }
        hotPoint.e();
    }

    void h(long j2) {
        n2.i(new l(j2));
    }

    public void h0(CharSequence charSequence) {
        i0(charSequence, -1L, 1L, 0, 1, 0L);
    }

    void h1() {
        e1.d("stopService");
        if (H0) {
            e1.d("Service stopService: already");
            return;
        }
        H0 = true;
        this.i.P0();
        this.j.n();
        c();
    }

    public void i0(CharSequence charSequence, long j2, long j3, int i2, int i3, long j4) {
        StringBuilder sb;
        if (j2 <= 0 || j3 == 0) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append(Tools.L1("%.2f", Double.valueOf((j2 * 100.0d) / j3)));
            sb.append(" %");
        }
        StringBuilder sb2 = sb;
        this.i0.c(charSequence, j2, j3, i2, i3, j4, sb2 == null ? "" : sb2.toString());
        if (sb2 != null) {
            sb2.setLength(4);
            sb2.append('%');
        }
        this.j.t((byte) 0, j2, j3, i2, i3, sb2 == null ? "" : sb2.toString());
    }

    public void i1() {
        if (m2.f1074a) {
            if (this.n == null) {
                c0();
                return;
            } else {
                t();
                return;
            }
        }
        try {
            if (this.n != null && android.ext.r.n != null && android.ext.r.n.x()) {
                z1.d dVar = this.v0;
                if (dVar != null) {
                    String str = dVar.f1434c;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.MAIN");
                        launchIntentForPackage.setPackage(str);
                    }
                    launchIntentForPackage.setFlags(131072);
                    context.startActivity(launchIntentForPackage);
                    return;
                }
                return;
            }
            String packageName = context.getPackageName();
            Intent launchIntentForPackage2 = context.getPackageManager().getLaunchIntentForPackage(packageName);
            if (launchIntentForPackage2 == null) {
                String strT = android.ext.r.t();
                Tools.w1(300, new ComponentName(packageName, strT), 1);
                launchIntentForPackage2 = new Intent("android.intent.action.MAIN").setClassName(packageName, strT);
            }
            launchIntentForPackage2.setFlags(131072);
            context.startActivity(launchIntentForPackage2);
            if (this.n == null) {
                c0();
            }
        } catch (Throwable th) {
            e1.s("bring to front fail", th);
        }
    }

    void j(int i2) {
        Tools.n(z(), i2);
        U();
    }

    public void j0(c2 c2Var) {
        n2.i(new e());
        if (this.f216f == c2Var) {
            this.f216f = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01de  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0205  */
    /* JADX WARN: Code duplicated, block: B:70:0x0209  */
    /* JADX WARN: Code duplicated, block: B:72:0x0239  */
    /* JADX WARN: Code duplicated, block: B:73:0x023b  */
    /* JADX WARN: Code duplicated, block: B:76:0x024d  */
    /* JADX WARN: Code duplicated, block: B:78:0x025a  */
    /* JADX WARN: Code duplicated, block: B:80:0x025f  */
    /* JADX WARN: Code duplicated, block: B:81:0x026c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0271  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01e8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0209, please report this as an issue */
    public void k0(int i2) {
        int i3;
        String strF;
        String strF2;
        String str;
        y yVar;
        String strF3;
        DialogInterface.OnClickListener nVar;
        long jCurrentTimeMillis;
        int i4;
        s();
        boolean z2 = i2 <= 100;
        int i5 = R.string.reset_search;
        if (i2 == 1) {
            i3 = R.string.out_of_memory;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    i3 = R.string.io_error;
                    if (i2 != 4) {
                        if (i2 == 9) {
                            String str2 = b2.f(R.string.maps_failed) + "\n\n" + b2.f(R.string.game_protected);
                            if (Config.C) {
                                str2 = str2 + "\n\n" + b2.f(R.string.need_root);
                            }
                            strF = i(str2);
                        } else if (i2 != 10) {
                            switch (i2) {
                                case 105:
                                    if (Config.C) {
                                        try {
                                            if ((Tools.Y(Config.E).flags & 2) == 0) {
                                                try {
                                                    strF = Tools.L1(b2.f(R.string.not_optimized2), Config.F, Config.F);
                                                    i4 = R.string.not_optimized2;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    i4 = R.string.not_optimized2;
                                                    e1.s("Failed check vSpace: " + Config.E, th);
                                                    strF = null;
                                                }
                                            } else {
                                                strF = null;
                                                i4 = R.string.reset_search;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i4 = R.string.reset_search;
                                        }
                                    } else {
                                        strF = null;
                                        i4 = R.string.reset_search;
                                    }
                                    if (i4 == R.string.reset_search) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(b2.f(R.string.eperm_error_descr_0));
                                        sb.append('\n');
                                        sb.append(1);
                                        sb.append(": ");
                                        sb.append(b2.f(R.string.eperm_error_descr_3));
                                        sb.append('\n');
                                        sb.append(2);
                                        sb.append(": ");
                                        sb.append(b2.f(!Config.C ? R.string.eperm_error_descr_4 : R.string.eperm_error_descr_5));
                                        strF = sb.toString();
                                    }
                                    i5 = i4;
                                    i3 = R.string.eperm_error;
                                    break;
                                case 106:
                                    strF = i(b2.f(R.string.eperm_error_descr_0) + "\n1: " + b2.f(R.string.eperm_error_descr_1) + "\n2: " + b2.f(R.string.eperm_error_descr_2));
                                    i3 = R.string.eperm_error_defend;
                                    break;
                                case 107:
                                    i5 = R.string.speedhack_fail;
                                    strF = null;
                                    i3 = R.string.speedhack_fail;
                                    break;
                                case 108:
                                    strF = Tools.N1(R.string.too_many_union_numbers) + ": 64";
                                    i3 = R.string.error;
                                    break;
                                default:
                                    i3 = R.string.unknown_error;
                                    break;
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(b2.f(R.string.maps_failed));
                            sb2.append("\n\n");
                            sb2.append(b2.f(Config.C ? R.string.vspace_error : R.string.root_error));
                            strF = sb2.toString();
                        }
                    }
                    if (strF == null) {
                        strF = b2.f(i5);
                    }
                    strF2 = b2.f(i3);
                    str = "{" + i2 + '}';
                    if (this.w0.get(i2)) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (T0 < jCurrentTimeMillis) {
                            T0 = jCurrentTimeMillis + 2000;
                            Tools.K1(str + b2.f(i3), 0);
                        }
                        if (z2) {
                            q(true);
                            return;
                        }
                        return;
                    }
                    this.w0.put(i2, true);
                    AlertDialog.Builder message = android.ext.ggf.b().setCustomTitle(Tools.h0(str)).setMessage(strF2 + "\n\n" + strF);
                    String strF4 = b2.f(R.string.ok);
                    if (z2) {
                        yVar = new y();
                    } else {
                        yVar = null;
                    }
                    AlertDialog.Builder cancelable = message.setPositiveButton(strF4, yVar).setCancelable(false);
                    if (i5 == R.string.fix_path) {
                        strF3 = b2.f(R.string.fix_it);
                        nVar = new z();
                    } else {
                        if (i3 != R.string.eperm_error_defend) {
                            if (i5 == R.string.not_optimized2) {
                                strF3 = b2.f(R.string.fix_it);
                                nVar = new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                            }
                            android.ext.f.o(cancelable);
                        }
                        strF3 = b2.f(R.string.help);
                        nVar = new a0();
                    }
                    cancelable.setNeutralButton(strF3, nVar);
                    android.ext.f.o(cancelable);
                }
                i3 = R.string.disk_full;
                strF = null;
                i5 = R.string.fix_path;
                if (strF == null) {
                    strF = b2.f(i5);
                }
                strF2 = b2.f(i3);
                str = "{" + i2 + '}';
                if (this.w0.get(i2)) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (T0 < jCurrentTimeMillis) {
                        T0 = jCurrentTimeMillis + 2000;
                        Tools.K1(str + b2.f(i3), 0);
                    }
                    if (z2) {
                        q(true);
                        return;
                    }
                    return;
                }
                this.w0.put(i2, true);
                AlertDialog.Builder message2 = android.ext.ggf.b().setCustomTitle(Tools.h0(str)).setMessage(strF2 + "\n\n" + strF);
                String strF5 = b2.f(R.string.ok);
                if (z2) {
                    yVar = null;
                } else {
                    yVar = new y();
                }
                AlertDialog.Builder cancelable2 = message2.setPositiveButton(strF5, yVar).setCancelable(false);
                if (i5 == R.string.fix_path) {
                    strF3 = b2.f(R.string.fix_it);
                    nVar = new z();
                } else {
                    if (i3 != R.string.eperm_error_defend) {
                        if (i5 == R.string.not_optimized2) {
                            strF3 = b2.f(R.string.fix_it);
                            nVar = new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                        }
                        android.ext.f.o(cancelable2);
                    }
                    strF3 = b2.f(R.string.help);
                    nVar = new a0();
                }
                cancelable2.setNeutralButton(strF3, nVar);
                android.ext.f.o(cancelable2);
            }
            i3 = R.string.bug_detected;
        }
        strF = null;
        if (strF == null) {
            strF = b2.f(i5);
        }
        strF2 = b2.f(i3);
        str = "{" + i2 + '}';
        if (this.w0.get(i2)) {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (T0 < jCurrentTimeMillis) {
                T0 = jCurrentTimeMillis + 2000;
                Tools.K1(str + b2.f(i3), 0);
            }
            if (z2) {
                q(true);
                return;
            }
            return;
        }
        this.w0.put(i2, true);
        AlertDialog.Builder message3 = android.ext.ggf.b().setCustomTitle(Tools.h0(str)).setMessage(strF2 + "\n\n" + strF);
        String strF6 = b2.f(R.string.ok);
        if (z2) {
            yVar = null;
        } else {
            yVar = new y();
        }
        AlertDialog.Builder cancelable3 = message3.setPositiveButton(strF6, yVar).setCancelable(false);
        if (i5 == R.string.fix_path) {
            strF3 = b2.f(R.string.fix_it);
            nVar = new z();
        } else {
            if (i3 != R.string.eperm_error_defend) {
                if (i5 == R.string.not_optimized2) {
                    strF3 = b2.f(R.string.fix_it);
                    nVar = new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                }
                android.ext.f.o(cancelable3);
            }
            strF3 = b2.f(R.string.help);
            nVar = new a0();
        }
        cancelable3.setNeutralButton(strF3, nVar);
        android.ext.f.o(cancelable3);
    }

    void k1() {
        int count = this.G.getAdapter().getCount();
        this.d0.setVisibility(count == 0 ? 8 : 0);
        this.d0.setText(Integer.toString(count));
        int count2 = this.L.getAdapter().getCount();
        this.e0.setVisibility(count2 == 0 ? 8 : 0);
        this.e0.setText(Integer.toString(count2));
        p1();
    }

    void l() {
        if (!P0 || (Config.B & 2048) == 0 || this.v0 == null || !android.ext.e0.p()) {
            return;
        }
        P0 = false;
        new android.ext.n0.i(new e0(), "CheckLibs").start();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:5:0x002a, B:7:0x0032, B:9:0x0043, B:11:0x0049, B:21:0x0073, B:25:0x0081, B:26:0x0085, B:29:0x0091, B:33:0x009c, B:35:0x00ae, B:19:0x006b), top: B:84:0x002a, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:38:0x00b8, B:40:0x00be, B:42:0x00c2, B:55:0x00e6, B:45:0x00ca, B:48:0x00cf, B:67:0x011d, B:56:0x00f5, B:58:0x00fa, B:60:0x0106, B:62:0x010d, B:63:0x0110, B:64:0x0113, B:65:0x0119), top: B:86:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:38:0x00b8, B:40:0x00be, B:42:0x00c2, B:55:0x00e6, B:45:0x00ca, B:48:0x00cf, B:67:0x011d, B:56:0x00f5, B:58:0x00fa, B:60:0x0106, B:62:0x010d, B:63:0x0110, B:64:0x0113, B:65:0x0119), top: B:86:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:38:0x00b8, B:40:0x00be, B:42:0x00c2, B:55:0x00e6, B:45:0x00ca, B:48:0x00cf, B:67:0x011d, B:56:0x00f5, B:58:0x00fa, B:60:0x0106, B:62:0x010d, B:63:0x0110, B:64:0x0113, B:65:0x0119), top: B:86:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0106 A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:38:0x00b8, B:40:0x00be, B:42:0x00c2, B:55:0x00e6, B:45:0x00ca, B:48:0x00cf, B:67:0x011d, B:56:0x00f5, B:58:0x00fa, B:60:0x0106, B:62:0x010d, B:63:0x0110, B:64:0x0113, B:65:0x0119), top: B:86:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x010d A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:38:0x00b8, B:40:0x00be, B:42:0x00c2, B:55:0x00e6, B:45:0x00ca, B:48:0x00cf, B:67:0x011d, B:56:0x00f5, B:58:0x00fa, B:60:0x0106, B:62:0x010d, B:63:0x0110, B:64:0x0113, B:65:0x0119), top: B:86:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0177  */
    /* JADX WARN: Code duplicated, block: B:99:0x0110 A[SYNTHETIC] */
    public void l0(android.ext.w wVar) throws Throwable {
        Tools.a0 a0Var;
        MainService mainService;
        long[] jArr;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        int i6;
        android.ext.c cVarF;
        long jG;
        int iF;
        int i7;
        boolean z2;
        int i8;
        int iW;
        long j2;
        int i9;
        Tools.a0 a0VarJ0 = Tools.J0(this.G);
        byte b2 = wVar.b();
        try {
            wVar.j();
            int iK = (wVar.k() - wVar.a()) - 1;
            wVar.f();
            ggd.a aVar = this.s0;
            int i10 = android.ext.b0.i();
            android.ext.c cVar = new android.ext.c();
            synchronized (aVar) {
                try {
                    boolean z3 = S0;
                    S0 = false;
                    if (z3) {
                        jArr = null;
                        iArr = null;
                        i2 = 0;
                        aVar.d();
                        i3 = iK / (InOut.n + 12);
                        if (b2 == 0) {
                            i3 = i10;
                        }
                        aVar.e(i3);
                        i4 = 0;
                        while (iK - wVar.a() > 10) {
                            jG = wVar.g();
                            long jH = wVar.h();
                            iF = wVar.f();
                            cVar.f672a = jG;
                            cVar.f674c = iF;
                            if (jArr != null) {
                                i7 = iK;
                                iW = android.ext.c.w(iF);
                                while (true) {
                                    if (i4 < i2) {
                                        a0Var = a0VarJ0;
                                        j2 = jArr[i4];
                                        if (j2 == jG) {
                                            i9 = iArr[i4];
                                            if (i9 == iW) {
                                                i8 = i4 + 1;
                                                z2 = true;
                                                break;
                                                break;
                                            } else {
                                                if (i9 > iW) {
                                                }
                                                i4++;
                                                a0VarJ0 = a0Var;
                                            }
                                        } else if (Tools.S1(j2, jG)) {
                                            i4++;
                                            a0VarJ0 = a0Var;
                                        }
                                    } else {
                                        a0Var = a0VarJ0;
                                    }
                                }
                                aVar.a(jG, jH, iF, z2);
                                i4 = i8;
                                cVar = cVar;
                                iK = i7;
                                a0VarJ0 = a0Var;
                            } else {
                                a0Var = a0VarJ0;
                                i7 = iK;
                            }
                            i8 = i4;
                            z2 = z3;
                            aVar.a(jG, jH, iF, z2);
                            i4 = i8;
                            cVar = cVar;
                            iK = i7;
                            a0VarJ0 = a0Var;
                        }
                        a0Var = a0VarJ0;
                        aVar.k();
                        if (b2 != 0) {
                            i5 = aVar.i();
                            arrayList = new ArrayList(i5);
                            for (i6 = 0; i6 < i5; i6++) {
                                cVarF = aVar.f(i6, null);
                                if (cVarF != null) {
                                    arrayList.add(cVarF);
                                }
                            }
                            arrayList.trimToSize();
                            Script.d3(b2, arrayList);
                        }
                        mainService = this;
                    } else {
                        try {
                            int i11 = aVar.i();
                            long[] jArr2 = new long[i11];
                            int[] iArr2 = new int[i11];
                            android.ext.c cVar2 = new android.ext.c();
                            int i12 = 0;
                            for (int i13 = 0; i13 < i11; i13++) {
                                if (aVar.c(i13)) {
                                    aVar.f(i13, cVar2);
                                    jArr2[i12] = cVar2.f672a;
                                    int i14 = i12 + 1;
                                    iArr2[i12] = android.ext.c.w(cVar2.f674c);
                                    i12 = i14;
                                }
                            }
                            jArr = jArr2;
                            iArr = iArr2;
                            i2 = i12;
                        } catch (OutOfMemoryError e2) {
                            e1.l("Failed save checked data", e2);
                            jArr = null;
                            iArr = null;
                            i2 = 0;
                        }
                        aVar.d();
                        i3 = iK / (InOut.n + 12);
                        if (b2 == 0 && i3 > i10) {
                            i3 = i10;
                        }
                        aVar.e(i3);
                        i4 = 0;
                        while (iK - wVar.a() > 10 && (b2 != 0 || aVar.i() < i10)) {
                            jG = wVar.g();
                            long jH2 = wVar.h();
                            iF = wVar.f();
                            cVar.f672a = jG;
                            cVar.f674c = iF;
                            if (jArr != null) {
                                i7 = iK;
                                iW = android.ext.c.w(iF);
                                while (true) {
                                    if (i4 < i2) {
                                        a0Var = a0VarJ0;
                                        try {
                                            j2 = jArr[i4];
                                            if (j2 == jG) {
                                                i9 = iArr[i4];
                                                if (i9 == iW) {
                                                    i8 = i4 + 1;
                                                    z2 = true;
                                                    break;
                                                } else {
                                                    if (i9 > iW) {
                                                    }
                                                    i4++;
                                                    a0VarJ0 = a0Var;
                                                }
                                            } else if (Tools.S1(j2, jG)) {
                                                i4++;
                                                a0VarJ0 = a0Var;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                throw th;
                                            } catch (IOException e3) {
                                                e = e3;
                                                e1.l("Failed read", e);
                                                mainService = this;
                                                mainService.V(mainService.G.getAdapter());
                                                b1();
                                                if (b2 == 0) {
                                                    mainService.B++;
                                                }
                                                Tools.A1(mainService.G, a0Var);
                                                instance.p1();
                                                mainService.X(b2, null);
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                mainService = this;
                                                int i15 = mainService.s0.i();
                                                mainService.s0.d();
                                                mainService.s0.k();
                                                Tools.H1(R.string.out_of_memory_error);
                                                e1.s("list.size() = " + i15 + "; show count = " + android.ext.b0.i(), e);
                                                mainService.V(mainService.G.getAdapter());
                                                b1();
                                                if (b2 == 0) {
                                                    mainService.B++;
                                                }
                                                Tools.A1(mainService.G, a0Var);
                                                instance.p1();
                                                mainService.X(b2, null);
                                            }
                                        }
                                    } else {
                                        a0Var = a0VarJ0;
                                    }
                                }
                                aVar.a(jG, jH2, iF, z2);
                                i4 = i8;
                                cVar = cVar;
                                iK = i7;
                                a0VarJ0 = a0Var;
                            } else {
                                a0Var = a0VarJ0;
                                i7 = iK;
                            }
                            i8 = i4;
                            z2 = z3;
                            aVar.a(jG, jH2, iF, z2);
                            i4 = i8;
                            cVar = cVar;
                            iK = i7;
                            a0VarJ0 = a0Var;
                        }
                        a0Var = a0VarJ0;
                        aVar.k();
                        if (b2 != 0) {
                            i5 = aVar.i();
                            arrayList = new ArrayList(i5);
                            while (i6 < i5) {
                                cVarF = aVar.f(i6, null);
                                if (cVarF != null) {
                                    arrayList.add(cVarF);
                                }
                            }
                            arrayList.trimToSize();
                            Script.d3(b2, arrayList);
                        }
                        mainService = this;
                    }
                    mainService.V(mainService.G.getAdapter());
                    b1();
                    if (b2 == 0) {
                        mainService.B++;
                    }
                    Tools.A1(mainService.G, a0Var);
                    instance.p1();
                    mainService.X(b2, null);
                } catch (Throwable th2) {
                    th = th2;
                    a0Var = a0VarJ0;
                }
            }
        } catch (IOException e5) {
            e = e5;
            a0Var = a0VarJ0;
        } catch (OutOfMemoryError e6) {
            e = e6;
            a0Var = a0VarJ0;
        }
    }

    public void l1() {
        m1(false);
    }

    void m() {
        q(false);
    }

    public void m0(Script script) {
        n2.i(new d());
        if (this.f212b == script) {
            this.f212b = null;
        }
    }

    public void m1(boolean z2) {
        if (f1.f952b) {
            z2 = true;
        }
        try {
            int i2 = Config.vSpaceReal ? 4 : 2;
            Throwable th = null;
            int i3 = 0;
            while (i3 < i2) {
                boolean z3 = i3 >= 2;
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (z3) {
                        applicationContext = Config.a(applicationContext);
                    }
                    NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
                    if ((z2 || !android.ext.v.f1280d) && (Config.B & 256) == 0) {
                        if (i3 == 0) {
                            e1.d("cancel notification");
                            if (android.ext.v.f1277a != null) {
                                android.ext.v.f1277a.stopForeground(true);
                            }
                        }
                        if (notificationManager != null) {
                            notificationManager.cancel(1);
                            notificationManager.cancelAll();
                            return;
                        }
                    } else {
                        if (i3 == 0) {
                            e1.d("add notification");
                        }
                        if (notificationManager != null) {
                            Notification notificationF = F(i3 % 2 == 0, z3);
                            notificationManager.notify(1, notificationF);
                            if (android.ext.v.f1277a != null) {
                                android.ext.v.f1277a.startForeground(1, notificationF);
                                e1.d("startForeground 2." + i3);
                                return;
                            }
                            return;
                        }
                    }
                    e1.d("Failed get NotificationManager " + i3);
                } catch (Throwable th2) {
                    if (th != null) {
                        th2.addSuppressed(th);
                    }
                    if (i3 == i2 - 1) {
                        e1.s("Failed startForeground " + i3, th2);
                        android.ext.n0.h(Thread.currentThread(), th2, false);
                    }
                    th = th2;
                }
                i3++;
            }
        } catch (Throwable th3) {
            e1.a(th3);
        }
    }

    void n(byte b2) {
        o(b2, false);
    }

    public void n0(Script script) {
        n2.i(new b());
    }

    void n1() {
        this.Q.setImageResource(!this.R ? R.drawable.ic_pause_white_18dp : R.drawable.ic_play_arrow_white_18dp);
    }

    void o(byte b2, boolean z2) {
        p(b2, z2, true);
    }

    public void o0(byte b2, long j2, long j3, int i2) {
        this.p0 = j2;
        if (i2 == 0) {
            s();
            S0 = true;
            if (b2 == 0) {
                if (android.ext.b0.k() || Config.k == 0 || j2 <= android.ext.b0.i()) {
                    D0(true);
                } else {
                    t();
                    Tools.J1(b2.f(R.string.search_helper) + ' ' + Tools.L1(b2.f(R.string.found_count), Long.valueOf(j2)));
                    K0 = Config.k == 2;
                }
            }
        }
        if (this.p0 == 0) {
            p((byte) 0, false, false);
        }
    }

    public void o1(boolean z2) {
        if (z2) {
            Q();
        }
        double dE = this.k0.e();
        T0((byte) 0, dE);
        c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.setSpeed(");
            c2Var.write(Double.toString(dE));
            c2Var.write(")\n");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AlertDialog.Builder message;
        String strF;
        DialogInterface.OnClickListener qVar;
        if (view == this.p || view == this.q || view == this.s) {
            r(true);
            return;
        }
        if (view == this.P) {
            E0();
            return;
        }
        if (view != this.o) {
            if (view == this.Q) {
                C0(true);
                return;
            }
            if (view == this.g0) {
                Config.b(R.id.config_ranges).b();
                return;
            }
            if (view != null) {
                String string = "?";
                switch (view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : view.getId()) {
                    case R.drawable.ic_ui_button_24dp /* 2130968657 */:
                        this.f215e = true;
                        return;
                    case R.id.abort_button /* 2131034112 */:
                        this.i.h();
                        s();
                        return;
                    case R.id.hot_frame /* 2131034287 */:
                        c0();
                        return;
                    case R.id.more_btn /* 2131034336 */:
                        Tools.s(this.J);
                        return;
                    case R.string.hide /* 2131296674 */:
                        break;
                    case R.string.interrupt /* 2131296711 */:
                        Script script = this.f212b;
                        if (script != null) {
                            Object obj = script.U;
                            if (obj != null) {
                                string = obj.toString();
                                if (string.length() > 250) {
                                    string = string.substring(0, 250) + "...";
                                }
                            }
                        } else {
                            string = "??";
                        }
                        message = android.ext.ggf.b().setCustomTitle(Tools.h0(Tools.N1(R.string.script))).setMessage(string);
                        strF = b2.f(R.string.interrupt);
                        qVar = new q();
                        break;
                    case R.string.record /* 2131296884 */:
                        c2 c2Var = this.f216f;
                        message = android.ext.ggf.b().setCustomTitle(Tools.h0(Tools.N1(R.string.record_script))).setMessage(c2Var != null ? c2Var.c() : "?");
                        strF = b2.f(R.string.stop);
                        qVar = new r();
                        break;
                    default:
                        return;
                }
                android.ext.f.o(message.setPositiveButton(strF, qVar).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null));
                return;
            }
            return;
        }
        t();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.h.a(false, new s());
        o1(false);
        this.j.x();
        return true;
    }

    void p(byte b2, boolean z2, boolean z3) {
        if (z2) {
            this.r0 = true;
        }
        this.p0 = 0L;
        if (z3) {
            this.i.l(b2);
        }
        instance.i.f793b.r();
        ggd.a aVar = this.s0;
        synchronized (aVar) {
            aVar.d();
            aVar.k();
        }
        V(this.G.getAdapter());
        b1();
        K0 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0113 A[PHI: r9
      0x0113: PHI (r9v16 int) = (r9v2 int), (r9v5 int), (r9v17 int) binds: [B:63:0x019c, B:57:0x0189, B:40:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public void p0(byte b2, int i2, int[] iArr) {
        SharedPreferences.Editor editorPutBoolean;
        int i3;
        int i4;
        int i5;
        String strF;
        int i6;
        AlertDialog.Builder negativeButton;
        int i7;
        switch (i2) {
            case 0:
                editorPutBoolean = Tools.M0().edit().putBoolean("mem-fail", true);
                editorPutBoolean.commit();
                break;
            case 1:
                editorPutBoolean = Tools.M0().edit().remove("mem-fail");
                editorPutBoolean.commit();
                break;
            case 3:
                s();
                if (b2 == 0) {
                    i3 = R.string.dump_ended;
                    Tools.I1(i3, 0);
                }
                X(b2, null);
                break;
            case 4:
                s();
                i4 = R.string.dump_failed;
                if (b2 == 0) {
                    Tools.H1(i4);
                }
                X(b2, b2.f(i4));
                break;
            case 5:
                if (b2 == 0) {
                    i3 = R.string.copy_ended;
                    Tools.I1(i3, 0);
                }
                X(b2, null);
                break;
            case 6:
                i4 = R.string.copy_failed;
                if (b2 == 0) {
                    Tools.H1(i4);
                }
                X(b2, b2.f(i4));
                break;
            case 8:
                this.S = true;
                break;
            case 9:
                this.S = false;
                break;
            case 10:
                if (b2 == 0) {
                    i5 = R.string.speedhack_loading;
                    Tools.I1(i5, 0);
                }
                break;
            case 11:
                if (b2 == 0) {
                    strF = b2.f(R.string.speedhack_loaded);
                    if (this.D0) {
                        strF = strF + "\n" + b2.f(R.string.speedhack_no_x86);
                    }
                    i6 = this.D0;
                    Tools.K1(strF, i6);
                }
                this.D0 = false;
                break;
            case 12:
                if (b2 == 0) {
                    i5 = R.string.patch_loading;
                    Tools.I1(i5, 0);
                }
                break;
            case 13:
                if (b2 == 0) {
                    Tools.H1(R.string.patch_loaded);
                    android.ext.f.o(android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.disable_protection)).setMessage(b2.f(R.string.must_restart_if)).setPositiveButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
                }
                X(b2, null);
                break;
            case 14:
                i4 = R.string.patch_failed;
                if (b2 == 0) {
                    Tools.H1(i4);
                }
                X(b2, b2.f(i4));
                break;
            case 15:
                if (b2 == 0) {
                    i5 = R.string.unrandomizer_loading;
                    Tools.I1(i5, 0);
                }
                break;
            case 16:
                if (b2 == 0) {
                    strF = b2.f(R.string.unrandomizer_loaded);
                    if (this.D0) {
                        strF = strF + "\n" + b2.f(R.string.speedhack_no_x86);
                    }
                    i6 = this.D0;
                    Tools.K1(strF, i6);
                }
                this.D0 = false;
                break;
            case 17:
                if (b2 == 0) {
                    negativeButton = android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.waitpid_mode)).setMessage(b2.f(R.string.help_waitpid)).setPositiveButton(b2.f(R.string.alternative), new w()).setNegativeButton(b2.f(R.string.skip), (DialogInterface.OnClickListener) null);
                    android.ext.f.o(negativeButton);
                }
                break;
            case 18:
                X(b2, null);
                break;
            case 19:
                S(iArr);
                break;
            case 20:
                AlertDialog.Builder builderB = android.ext.ggf.b();
                StringBuilder sb = new StringBuilder();
                sb.append(b2.f(R.string.ptrace_fail));
                sb.append("\n\n");
                sb.append(b2.f(iArr[0] != 0 ? R.string.ptrace_fail_partially : R.string.ptrace_fail_full));
                sb.append("\n\n");
                sb.append(b2.f(R.string.ptrace_fail_solve));
                negativeButton = builderB.setMessage(sb.toString()).setPositiveButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null);
                android.ext.f.o(negativeButton);
                break;
            case 21:
                if (iArr[1] != 0) {
                    i7 = R.string.feature_hide_4;
                } else if (iArr[2] != 0) {
                    i7 = R.string.feature_firmware;
                } else {
                    if (this.C0 && (Config.A & 131072) != 0) {
                        this.C0 = false;
                        Config.b(R.id.config_ptrace_bypass_mode).b();
                    }
                    i7 = R.string.feature_protection;
                }
                Tools.K1(b2.f(i7), 1);
                break;
            case 22:
                this.D0 = true;
                break;
        }
    }

    void p1() {
        if (n2.e()) {
            e();
        } else {
            n2.i(new u());
        }
    }

    void q(boolean z2) {
        o((byte) 0, z2);
    }

    public void q0() {
        p1();
    }

    public void q1() {
        if (!I0) {
            return;
        }
        int iH = H() - 1;
        int iD1 = Tools.d1();
        boolean z2 = (Config.p & (1 << ((iH * 2) + iD1))) != 0;
        int i2 = Config.r;
        if (iH >= 0) {
            int[] iArr = this.z0;
            if (iArr[iH] != i2) {
                iArr[iH] = i2;
                this.m.getCurrentView().setBackgroundColor((i2 & (1 << iH)) == 0 ? 0 : -16777216);
            }
        }
        this.J.setVisibility((z2 || iD1 != 0) ? 8 : 0);
        this.K.setVisibility(iD1 == 1 ? iH >= 0 ? 0 : 4 : 8);
        this.F.setVisibility(iD1 == 0 ? 0 : 8);
        this.E.setVisibility((iH < 0 || !z2) ? 8 : 0);
        int i3 = 0;
        while (true) {
            WrapLayout[] wrapLayoutArr = this.D;
            if (i3 >= wrapLayoutArr.length) {
                return;
            }
            WrapLayout wrapLayout = wrapLayoutArr[i3];
            wrapLayout.setFill(Config.f34g - 1);
            wrapLayout.setVisibility(i3 == iH ? 0 : 8);
            long j2 = Config.f29b[(i3 * 2) + iD1];
            for (int i4 = 0; i4 < wrapLayout.getChildCount(); i4++) {
                try {
                    View childAt = wrapLayout.getChildAt(i4);
                    if (childAt != null) {
                        childAt.setVisibility(((1 << i4) & j2) != 0 ? 0 : 8);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                } catch (Throwable th) {
                    e1.a(th);
                }
            }
            i3++;
        }
    }

    void r(boolean z2) {
        this.h.b(z2);
    }

    public void r0() {
        P();
        if (this.F0) {
            return;
        }
        this.F0 = true;
        z1.d dVar = this.v0;
        String str = dVar == null ? null : dVar.f1434c;
        boolean z2 = dVar == null ? false : dVar.n;
        r(false);
        J0();
        s();
        s0(str, z2);
    }

    void s() {
        this.j.t((byte) 2, -1L, 1L, 0, 1, "");
        this.i0.a(true);
        this.i.m();
        this.i.L();
        this.U = false;
    }

    void s0(String str, boolean z2) {
        android.ext.f.o(android.ext.ggf.b().setCustomTitle(Tools.g0(R.string.game_dead)).setItems(new String[]{b2.f(R.string.exit), b2.f(R.string.restart_game), b2.f(R.string.restart_game_without_protection), b2.f(R.string.help_games_protection_title), b2.f(R.string.ok)}, new c0(str, z2)).setCancelable(false));
    }

    void t() {
        u(true);
    }

    void u(boolean z2) {
        StringBuilder sb;
        String strF;
        e1.d("ServiceProxy dismissDialog: " + this.n);
        if (this.n == null) {
            return;
        }
        this.i0.a(false);
        this.n.dismiss();
        this.n = null;
        this.h0.a(z2);
        this.j.m();
        this.T = this.R;
        boolean z3 = this.S;
        boolean z4 = (Config.A & 128) != 0;
        if (this.i0.b() && (z4 || z3)) {
            String string = Tools.N1(R.string.paused) + ":\n";
            if (z4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("- ");
                sb2.append(Tools.L1(b2.f(R.string.by_option), Tools.N1(R.string.hide_from_game) + ": 1"));
                sb2.append(";\n");
                string = sb2.toString();
            }
            if (z3) {
                if ((Config.B & 4) != 0) {
                    sb = new StringBuilder();
                    sb.append(string);
                    sb.append("- ");
                    strF = Tools.L1(b2.f(R.string.by_option), Tools.N1(R.string.autopause) + ": " + b2.f(R.string.yes));
                } else {
                    sb = new StringBuilder();
                    sb.append(string);
                    sb.append("- ");
                    strF = b2.f(R.string.by_pause_button);
                }
                sb.append(strF);
                sb.append(";\n");
                string = sb.toString();
            }
            String strTrim = string.trim();
            if (this.U) {
                Tools.J1(strTrim);
            } else {
                this.U = true;
                android.ext.f.m(android.ext.ggf.c(android.ext.r.p).setMessage(strTrim).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null).create());
            }
        }
        z0();
        this.i.L();
        l1();
    }

    public void u0() {
        e1.d("<<");
        this.k0.l();
        o1(true);
    }

    int v() {
        try {
            ApplicationInfo applicationInfoY = Tools.Y(this.v0.f1434c);
            boolean z2 = true;
            if (applicationInfoY == null) {
                return 1;
            }
            String str = applicationInfoY.nativeLibraryDir;
            if (str == null) {
                return 2;
            }
            byte[] bArr = new byte[20];
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles != null) {
                boolean z3 = false;
                for (File file : fileArrListFiles) {
                    if (z3) {
                        break;
                    }
                    if (file != null && file.getName().startsWith("lib") && file.getName().endsWith(".so")) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            if (fileInputStream.read(bArr) > 13 && bArr[0] == 127 && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70 && bArr[18] == 40) {
                                try {
                                    e1.d("doCheckLibs: " + file + " is ARM lib");
                                    z3 = true;
                                } catch (Throwable th) {
                                    th = th;
                                    z3 = true;
                                    e1.l("Failed check lib " + file, th);
                                }
                            }
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                if (z3) {
                    String str2 = applicationInfoY.sourceDir;
                    if (str2 == null) {
                        return 4;
                    }
                    ZipFile zipFile = new ZipFile(str2);
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (true) {
                        if (!enumerationEntries.hasMoreElements()) {
                            z2 = false;
                            break;
                        }
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement.getName().contains("lib/x86/lib")) {
                            e1.d("doCheckLibs: " + zipEntryNextElement.getName() + " is x86 lib");
                            break;
                        }
                    }
                    zipFile.close();
                    if (!z2) {
                        return 5;
                    }
                    android.ext.f.o(android.ext.ggf.b().setCustomTitle(Tools.h0(Tools.N1(R.string.check_libs))).setMessage(b2.f(R.string.arm_libs)).setPositiveButton(b2.f(R.string.fix_it), !Config.C ? new g0(str2) : new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh278:0krz0wr0uhsodfh0dup0oleudulhv0zlwk0{;90oleudulhv0{0soruh2")).setNeutralButton(b2.f(R.string.skip), new f0()).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null));
                    return 6;
                }
            }
            return 3;
        } catch (Throwable th3) {
            e1.l("Failed check libs for " + this.v0, th3);
            return 0;
        }
    }

    boolean v0() {
        boolean zW0 = w0((byte) 0);
        c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.processKill()\n");
        }
        return zW0;
    }

    public void w(int i2) {
        android.ext.f0 f0Var = this.i;
        if (f0Var == null || i2 < 80) {
            return;
        }
        f0Var.z();
    }

    boolean w0(byte b2) {
        z1.d dVar = this.v0;
        if (dVar == null) {
            Tools.J1(b2.f(R.string.no_application));
            return false;
        }
        e1.d("Kill game");
        this.i.C0(b2, dVar.f1437f, dVar.f1434c, dVar.f1435d);
        this.i.L0(b2, (byte) 2);
        return true;
    }

    public void x(String str, int i2, String str2) {
        P();
        Script script = new Script(new File(str), i2, str2);
        this.f212b = script;
        script.R3();
    }

    boolean x0(byte b2, boolean z2) {
        if ((!z2 && this.n == null) || this.R) {
            return false;
        }
        Q();
        this.i.L0(b2, (byte) 0);
        this.R = true;
        n1();
        return true;
    }

    void y(boolean z2) {
        if (this.n != null) {
            return;
        }
        if (z2) {
            this.h0.k();
        } else {
            this.h0.a(true);
        }
    }

    boolean y0(boolean z2) {
        boolean zX0 = x0((byte) 0, z2);
        c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.processPause()\n");
        }
        return zX0;
    }

    Object z() {
        n1 n1Var;
        View view = this.f0;
        if (view == this.Z) {
            return this.s0;
        }
        if (view == this.a0) {
            SavedListAdapter savedListAdapter = this.t0;
            if (savedListAdapter != null) {
                return savedListAdapter.f();
            }
        } else if (view == this.b0 && (n1Var = this.N) != null) {
            return n1Var.f();
        }
        return null;
    }

    boolean z0() {
        boolean zA0 = A0((byte) 0);
        c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.processResume()\n");
        }
        return zA0;
    }
}
