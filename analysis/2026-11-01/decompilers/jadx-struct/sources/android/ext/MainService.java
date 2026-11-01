package android.ext;

import android.app.ActivityManager;
import android.app.AlertDialog$Builder;
import android.app.Notification;
import android.app.Notification$Action$Builder;
import android.app.Notification$Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.fix.WrapLayout;
import android.graphics.drawable.Icon;
import android.os.Build$VERSION;
import android.os.Environment;
import android.os.Handler;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.TabHost;
import android.widget.TabHost$TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;
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
public class MainService extends k2 implements View$OnClickListener, View$OnLongClickListener {
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
    q0 H;
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
    j h;
    ShowApp h0;
    f0 i;
    x i0;
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
    final d.a s0;
    TextView t;
    SavedListAdapter t0;
    TextView u;
    final d u0;
    View v;
    public z1$d v0;
    TextView w;
    private SparseBooleanArray w0;
    View x;
    ConfigListAdapter x0;
    TextView y;
    private volatile ArrayList y0;
    View z;
    private final int[] z0;
    public static final String G0 = i.f1002d + "_preferences";
    public static volatile MainService instance = null;
    public static volatile boolean H0 = false;
    public static volatile boolean I0 = false;
    public static final p1[][] J0 = new p1[3][];
    private static volatile boolean K0 = false;
    public static final boolean[] L0 = new boolean[176];
    public static final boolean[] M0 = new boolean[76];

    static {
        int i = 0;
        while (true) {
            boolean[] zArr = M0;
            boolean z = true;
            if (i >= zArr.length) {
                break;
            }
            if (i % 4 >= 2) {
                z = false;
            }
            zArr[i] = z;
            i++;
        }
        int i2 = 0;
        while (true) {
            boolean[] zArr2 = L0;
            if (i2 >= zArr2.length) {
                break;
            }
            zArr2[i2] = i2 % 4 < 2;
            i2++;
        }
        int[] iArr = {40, 43, 44};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr[i3] - 1;
            boolean[] zArr3 = L0;
            int i5 = i4 * 4;
            zArr3[i5] = false;
            zArr3[i5 + 1] = false;
            zArr3[i5 + 2] = false;
            zArr3[i5 + 3] = false;
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
        this.s0 = new d.a();
        this.t0 = new SavedListAdapter();
        this.u0 = new d();
        this.v0 = null;
        this.w0 = new SparseBooleanArray();
        this.y0 = new ArrayList();
        this.z0 = new int[3];
        this.A0 = new MainService$o(this);
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
        this.i = new f0();
        this.D = new WrapLayout[3];
    }

    public static ComponentCallbacks A() {
        ComponentCallbacks componentCallbacks = Q0;
        if (componentCallbacks != null) {
            return componentCallbacks;
        }
        MainService$t mainService$t = new MainService$t();
        Q0 = mainService$t;
        return mainService$t;
    }

    static int D() {
        if (instance.p0 == 0) {
            return 127;
        }
        return N0;
    }

    static int E() {
        if (instance.p0 != 0) {
            int i = N0;
            int i2 = O0;
            if ((i & i2) != i2) {
                return i;
            }
        }
        return O0;
    }

    private void G0() {
        context.registerComponentCallbacks(A());
    }

    public static void I0() {
        f.o(f.b().setMessage(b2.f(R$string.bad_firmware)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
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

    private void M0(Long l, long j) {
        int top = 0;
        if (l == null) {
            int firstVisiblePosition = this.M.getFirstVisiblePosition();
            if (this.M.getChildCount() > 1 && this.M.getChildAt(0).getTop() < 0) {
                firstVisiblePosition++;
            }
            Object itemAtPosition = this.M.getItemAtPosition(firstVisiblePosition);
            l = itemAtPosition instanceof c ? Long.valueOf(((c) itemAtPosition).f672a) : itemAtPosition instanceof v0 ? Long.valueOf(((v0) itemAtPosition).b()) : null;
        }
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue == j || jLongValue == this.O.f()) {
                return;
            }
            int iP = this.N.p(jLongValue) - this.M.getFirstVisiblePosition();
            if (iP >= 0 && iP < this.M.getChildCount()) {
                top = this.M.getChildAt(iP).getTop();
            }
            this.O.b(jLongValue, Tools.N1(R$string.position_in_memory_editor), top);
        }
    }

    private void N(String str, int i, int i2) {
        TabHost$TabSpec tabHost$TabSpecNewTabSpec = this.m.newTabSpec(str);
        tabHost$TabSpecNewTabSpec.setContent(i);
        ImageView imageViewM = Config.m((ImageView) this.m.findViewById(i2));
        tabHost$TabSpecNewTabSpec.setIndicator("", imageViewM.getDrawable());
        try {
            this.m.addTab(tabHost$TabSpecNewTabSpec);
        } catch (IllegalArgumentException e2) {
            e1.a(e2);
            tabHost$TabSpecNewTabSpec.setIndicator("");
            try {
                this.m.addTab(tabHost$TabSpecNewTabSpec);
            } catch (IllegalArgumentException e3) {
                e1.a(e3);
                try {
                    tabHost$TabSpecNewTabSpec.setIndicator(a.d.g(R$layout.tab_indicator_holo, this.m.getTabWidget(), false));
                } catch (NoSuchMethodError e4) {
                    e1.a(e4);
                    tabHost$TabSpecNewTabSpec.setIndicator("", imageViewM.getDrawable());
                }
                this.m.addTab(tabHost$TabSpecNewTabSpec);
            }
        }
    }

    static void N0(int i, int i2) {
        int i3 = i & 127;
        N0 = i3;
        if (i2 == 0) {
            O0 = i3;
        }
    }

    private void S(int[] iArr) {
        if (iArr == null || iArr.length != 2) {
            return;
        }
        int i = iArr[0];
        a3[] a3VarArr = this.E0;
        if (i < 0 || i >= 4) {
            return;
        }
        a3 a3Var = a3VarArr[i];
        if (a3Var == null) {
            a3Var = new a3(i);
            a3VarArr[i] = a3Var;
        }
        a3Var.a(iArr[1]);
    }

    private void T0(byte b2, double d2) {
        d1$a d1_aD = d1.d(d2);
        this.i.F0(b2, d1_aD.f718a, d1_aD.f719b);
        this.j.A(d1.a(((double) d1_aD.f718a) / ((double) d1_aD.f719b)));
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
        p1VarArr[2] = new p1[]{new EditorListener(), new MainService$l0(this), new MainService$r0(this), new u0(), new o1$c(this.O), new o1$b(this.O), new d0(), new MainService$o0(this), new MainService$q0(this), new MainService$k0(this), new MainService$j0(this), new j0(), new c0(), new h(), new OffsetCalculator(), new MainService$s0(this), new MainService$m0(this), this.I, p1VarI};
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
            if (!k.b().equals(Locale.getDefault().toString())) {
                k.g();
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
            R0 = false;
        } catch (Throwable th) {
            R0 = false;
            throw th;
        }
    }

    private void Y0(p1[][] p1VarArr) {
        p1VarArr[1] = new p1[]{new MainService$i0(this, R$string.load_saved_list, R$drawable.ic_upload_white_24dp), new MainService$q0(this), new MainService$s0(this), new MainService$a(this, R$string.save_saved_list, R$drawable.ic_download_white_24dp), new MainService$p0(this, true), new EditorListener(), new MainService$m0(this), new MainService$l0(this), new MainService$o0(this), new d0(), new MainService$j0(this), new b(), new MainService$k0(this), new OffsetCalculator(), this.I};
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
        p1VarArr[0] = new p1[]{new o0(), this.W, new EditorListener(), new MainService$p0(this, false), this.V, new MainService$r0(this), new o2(), new MainService$q0(this), new MainService$s0(this), new d0(), this.X, new MainService$m0(this), new d2(), new MainService$l0(this), new MainService$k0(this), new MainService$o0(this), new MainService$j0(this), new y2(), new w1(), new OffsetCalculator(), this.H, new MainService$h0(this, R$string.speedhack, R$drawable.ic_speedometer_white_24dp), new MainService$n0(this)};
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
        z1$d z1_d = this.v0;
        if (z1_d == null) {
            return str;
        }
        return str + "\n\n" + z1_d.f1433b + "\n[" + z1_d.f1434c + "]";
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

    public static void t0(int i) {
        e1.p("onTrimMemory: " + i);
        if (instance == null) {
            return;
        }
        b2.a();
        z1.g();
        instance.w(i);
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

    public long B(long j, int i) {
        Q();
        return this.i.Q(j, i);
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
    boolean B0(byte b2, boolean z) {
        if (!z && this.n == null) {
            return false;
        }
        Q();
        this.i.L0(b2, this.R ? (byte) 1 : (byte) 0);
        this.R = !this.R;
        n1();
        return true;
    }

    FloatPanel C(String str, int i, int i2, int i3, int i4) {
        MainService$g mainService$g = new MainService$g(this, context, str, i, i2);
        android.fix.ImageButton imageButton = new android.fix.ImageButton(context);
        imageButton.setImageResource(i4);
        imageButton.setKeepScreenOn(true);
        imageButton.setId(i3);
        imageButton.setOnClickListener(instance);
        mainService$g.addView(imageButton);
        return mainService$g;
    }

    boolean C0(boolean z) {
        boolean zB0 = B0((byte) 0, z);
        c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.processToggle()\n");
        }
        return zB0;
    }

    void D0(boolean z) {
        if (z || !this.i0.b()) {
            this.A++;
            this.x.setVisibility(0);
            b0.g();
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

    public Notification F(boolean z, boolean z2) {
        Notification notification;
        Notification$Action$Builder notification$Action$Builder;
        PendingIntent pendingIntentB = w2.b(0);
        String strF = b2.f((!m2.f1074a ? !(this.n == null || r.n == null || !r.n.x()) : this.n != null) ? R$string.show_gg : R$string.hide_gg);
        int i = Build$VERSION.SDK_INT;
        try {
            Context applicationContext = context.getApplicationContext();
            if (z2) {
                applicationContext = Config.a(applicationContext);
            }
            Notification$Builder ongoing = new Notification$Builder(applicationContext).setContentTitle(strF).setContentText("").setContentIntent(pendingIntentB).setAutoCancel(false).setOngoing(true);
            if (z) {
                ongoing.setSmallIcon(R$drawable.ic_notify);
                String strF2 = b2.f(R$string.screenshot_action);
                PendingIntent pendingIntentB2 = w2.b(1);
                if (i >= 23) {
                    l1.a();
                    notification$Action$Builder = k1.a(Icon.createWithResource(Tools.C0(), R$drawable.ic_cellphone_screenshot_black_32dp), strF2, pendingIntentB2);
                } else {
                    notification$Action$Builder = new Notification$Action$Builder(R$drawable.ic_cellphone_screenshot_black_32dp, strF2, pendingIntentB2);
                }
                ongoing.addAction(notification$Action$Builder.build());
            }
            notification = ongoing.build();
        } catch (Throwable th) {
            e1.a(th);
            notification = null;
        }
        if (notification == null) {
            notification = new Notification();
            if (z) {
                try {
                    notification.icon = R$drawable.ic_notify;
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
        Runnable mainService$p = this.B0;
        Handler handlerD = n2.d();
        if (mainService$p != null) {
            handlerD.removeCallbacks(mainService$p);
        } else {
            mainService$p = new MainService$p(this);
            this.B0 = mainService$p;
        }
        handlerD.postDelayed(mainService$p, 500L);
    }

    public double G() {
        return this.i.Z();
    }

    public int H() {
        return this.m.getCurrentTab();
    }

    void H0(Object obj) {
        if (obj instanceof d.e) {
            d.e eVar = (d.e) obj;
            ArrayList arrayList = new ArrayList();
            int iL = eVar.l();
            for (int i = 0; i < iL; i++) {
                if (eVar.a(i)) {
                    h2 h2Var = (h2) eVar.n(i);
                    if (h2Var instanceof h2) {
                        arrayList.add(h2Var);
                    }
                }
            }
            this.t0.l(arrayList);
            return;
        }
        if (obj instanceof d.a) {
            d.a aVar = (d.a) obj;
            ArrayList arrayList2 = new ArrayList();
            int i2 = aVar.i();
            for (int i3 = 0; i3 < i2; i3++) {
                if (aVar.c(i3)) {
                    arrayList2.add(aVar.f(i3, null));
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
                f0.v = true;
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

    public void J(long j) {
        K(j, 0);
    }

    public void K(long j, int i) {
        this.N.M(j, i);
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
    public void L(Long l, String str, CharSequence charSequence) {
        long jR;
        y0.b(str, 1);
        int length = str.length();
        long j = 0;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int iIndexOf = str.indexOf(45, i2);
            int iIndexOf2 = str.indexOf(43, i2);
            if (iIndexOf2 != -1 && (iIndexOf == -1 || iIndexOf >= iIndexOf2)) {
                iIndexOf = iIndexOf2;
            }
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            String strTrim = str.substring(i, iIndexOf).trim();
            int length2 = strTrim.length();
            if (length2 > 0) {
                Iterator<RegionList$b> it = RegionList.getList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        RegionList$b next = it.next();
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
                    j += jR;
                }
            } else {
                if (strTrim.endsWith("h")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                jR = t1.r(strTrim, 16);
                j += jR;
            }
            i = iIndexOf;
        }
        M0(l, j);
        this.O.a(j, charSequence);
        J(j);
    }

    void L0(Object obj, d dVar) {
        int i = 0;
        boolean z = dVar != null;
        if (!z) {
            dVar = new d();
        }
        d dVar2 = this.u0;
        d$a d_a = new d$a();
        if (obj instanceof d.a) {
            d.a aVar = (d.a) obj;
            c cVar = new c();
            int i2 = aVar.i();
            while (i < i2) {
                if (aVar.c(i)) {
                    aVar.f(i, cVar);
                    dVar2.a(cVar.f672a, cVar.f674c, d_a);
                    if (d_a.f702b) {
                        dVar.c(cVar.f672a, cVar.f674c, d_a.f701a);
                    }
                }
                i++;
            }
        } else if (obj instanceof d.e) {
            d.e eVar = (d.e) obj;
            int iL = eVar.l();
            while (i < iL) {
                if (eVar.a(i)) {
                    h2 h2Var = (h2) eVar.n(i);
                    if (h2Var instanceof h2) {
                        dVar2.a(h2Var.f672a, h2Var.f674c, d_a);
                        if (d_a.f702b) {
                            dVar.c(h2Var.f672a, h2Var.f674c, d_a.f701a);
                        }
                    }
                }
                i++;
            }
        }
        if (z) {
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

    void O0(int i, int i2) {
        this.l0 = i;
        this.m0 = i2;
    }

    public void P() {
        Script script = this.f212b;
        if (script != null) {
            script.w3();
        }
    }

    public void P0(w wVar) {
        this.N.G(wVar);
    }

    void Q() {
        R((byte) 0);
    }

    public void Q0(z1$d z1_d) {
        z1$d z1_d2 = this.v0;
        boolean z = z1_d2 == null || z1_d == null || z1_d2.f1437f != z1_d.f1437f;
        if (z) {
            P0 = true;
            J0();
        }
        Config.k();
        this.v0 = z1_d;
        Config.h();
        this.x0.o();
        if (z1_d != null) {
            this.p.setImageDrawable(Tools.R1(z1_d.f1436e));
            if (z1_d.f1436e == null) {
                e1.i("setProcessInfo icon is null: " + z1_d);
            }
            this.s.setText(z1_d.toString());
            this.j.y(Tools.R1(z1_d.f1436e));
            this.i.D0(z1_d.f1437f, z1_d.f1434c, z1_d.f1435d);
        }
        this.n0.f();
        this.o0.f();
        k();
        if (z) {
            E0();
        }
    }

    void R(byte b2) {
        if (this.j0) {
            r(false);
            z1$d z1_d = this.v0;
            if (z1_d != null) {
                this.i.C0(b2, z1_d.f1437f, z1_d.f1434c, z1_d.f1435d);
                this.j0 = false;
                this.q.setVisibility(0);
                if (this.g0.getText().toString().startsWith(b2.f(R$string.version_number) + ' ' + ((Object) this.i.a0()))) {
                    return;
                }
                n2.d().postDelayed(new MainService$d0(this), Tools.f489a.nextInt(300000) + 180000);
            }
        }
    }

    void R0(boolean z) {
        if (z == (this.f214d != null)) {
            return;
        }
        n2.i(new MainService$c(this, z));
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

    public void U0(int i) {
        this.m.setCurrentTab(i);
    }

    void V(ListAdapter listAdapter) {
        if (listAdapter == null) {
            return;
        }
        n2.i(new MainService$k(this, listAdapter));
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
        int i;
        p1[][] p1VarArr;
        int i2;
        WrapLayout[] wrapLayoutArr;
        SharedPreferences sharedPreferencesM0;
        WrapLayout wrapLayout;
        int i3;
        p1[] p1VarArr2;
        View childTabViewAt;
        int i4;
        ViewGroup viewGroup;
        int i5;
        ViewGroup$LayoutParams layoutParams;
        View childAt;
        ZipFile zipFile2;
        View viewFindViewById;
        e1.d("Service onCreate");
        this.n0 = new TimersEditor("TE", "timers", 44, L0, 0);
        this.o0 = new TimersEditor("RE", "rand", 19, M0, 1);
        TabHost tabHost = (TabHost) a.d.f(R$layout.service_dialog, null);
        this.m = tabHost;
        tabHost.setFocusableInTouchMode(true);
        TextView textView = (TextView) tabHost.findViewById(new int[]{R$id.empty_list_text}[0]);
        textView.setText(b2.g(textView.getText().toString().trim()));
        try {
            zipFile = new ZipFile(context.getPackageResourcePath());
            try {
                try {
                    String[] strArrSplit = Tools.removeNewLinesChars("zlqgrz&dvvhwv2&uhv2udz2&fodvvhv51gh{").split("#");
                    int length = strArrSplit.length;
                    String strRemoveNewLinesChars = Tools.removeNewLinesChars("uhv2udz2|gz");
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    this.r = tabHost.findViewById(R$id.info_row);
                    int iIndexOf = R$id.about;
                    while (enumerationEntries.hasMoreElements()) {
                        try {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            int i6 = 0;
                            while (i6 < length) {
                                if (this.o == null) {
                                    this.o = (ImageView) tabHost.findViewById(R$id.back_btn);
                                }
                                zipFile2 = zipFile;
                                try {
                                    int size = (int) (((long) iIndexOf) ^ zipEntryNextElement.getSize());
                                    if (this.p == null) {
                                        this.p = (ImageView) tabHost.findViewById(R$id.app_icon);
                                    }
                                    int size2 = (int) (((long) size) ^ zipEntryNextElement.getSize());
                                    if (this.q == null) {
                                        this.q = (ImageView) tabHost.findViewById(R$id.small_icon);
                                    }
                                    iIndexOf = size2 * ((((-zipEntryNextElement.getName().indexOf(strArrSplit[i6])) * zipEntryNextElement.getName().indexOf(strRemoveNewLinesChars)) - zipEntryNextElement.getName().indexOf(strRemoveNewLinesChars)) - 1);
                                    if (this.y == null) {
                                        this.y = (TextView) tabHost.findViewById(R$id.found_count);
                                    }
                                    i6++;
                                    zipFile = zipFile2;
                                } catch (Throwable unused) {
                                    try {
                                        this.G = (ListView) tabHost.findViewById(R$id.addr_item_type);
                                        this.y = (TextView) tabHost.findViewById(R$id.config_acceleration);
                                        enumerationEntries.nextElement();
                                        this.p = (ImageView) tabHost.findViewById(R$id.count_fuzzy_equal_seekbar);
                                        this.o = (ImageView) tabHost.findViewById(R$id.config_keyboard);
                                        this.y = (TextView) tabHost.findViewById(R$id.config_path);
                                        zipFile = zipFile2;
                                        while (true) {
                                            wrapLayoutArr = this.D;
                                            if (i2 < wrapLayoutArr.length) {
                                                break;
                                            }
                                            wrapLayout = wrapLayoutArr[i2];
                                            wrapLayout.removeAllViews();
                                            i3 = 0;
                                            while (true) {
                                                p1VarArr2 = p1VarArr[i2];
                                                if (i3 < p1VarArr2.length) {
                                                    p1 p1Var = p1VarArr2[i3];
                                                    p1Var.g(i2, i3);
                                                    wrapLayout.addView(p1Var.b(true));
                                                    i3++;
                                                }
                                            }
                                            i2++;
                                        }
                                    } catch (Throwable unused2) {
                                        zipFile = zipFile2;
                                        this.C = (TextView) tabHost.findViewById(R$id.nothing_found_text);
                                        this.D[0] = (WrapLayout) tabHost.findViewById(R$id.search_toolbar);
                                        this.D[1] = (WrapLayout) tabHost.findViewById(R$id.saved_toolbar);
                                        this.D[2] = (WrapLayout) tabHost.findViewById(R$id.memory_toolbar);
                                        this.E = tabHost.findViewById(R$id.toolbar_row);
                                        this.F = (ImageView) tabHost.findViewById(R$id.more_btn);
                                    }
                                    if (zipFile != null) {
                                        try {
                                            zipFile.close();
                                        } catch (Throwable th) {
                                            e1.s("Failed close apk", th);
                                        }
                                    }
                                    this.t = (TextView) tabHost.findViewById(R$id.filter);
                                    this.u = (TextView) tabHost.findViewById(R$id.value_format);
                                    this.v = tabHost.findViewById(R$id.info_mem);
                                    this.w = (TextView) tabHost.findViewById(R$id.saved_format);
                                    this.x = tabHost.findViewById(R$id.count_wait);
                                    this.z = tabHost.findViewById(R$id.info_cnt);
                                    Config.h();
                                    l1();
                                    this.Z = tabHost.findViewById(R$id.search_page);
                                    this.a0 = tabHost.findViewById(R$id.saved_page);
                                    this.b0 = tabHost.findViewById(R$id.memory_editor_page);
                                    this.c0 = tabHost.findViewById(R$id.config_page);
                                    this.d0 = (TextView) tabHost.findViewById(R$id.search_tab_counter);
                                    this.e0 = (TextView) tabHost.findViewById(R$id.saved_tab_counter);
                                    tabHost.setup();
                                    N("settings", R$id.config_page, R$id.config_tab_icon);
                                    N("search", R$id.search_page, R$id.search_tab_icon);
                                    N("saved", R$id.saved_page, R$id.saved_tab_icon);
                                    N("memory", R$id.memory_editor_page, R$id.memory_tab_icon);
                                    tabWidget = tabHost.getTabWidget();
                                    for (i = 0; i < tabWidget.getTabCount(); i++) {
                                        childTabViewAt = tabWidget.getChildTabViewAt(i);
                                        if (i != 0) {
                                            i4 = R$id.config_tab;
                                        } else if (i != 1) {
                                            i4 = R$id.search_tab;
                                        } else if (i != 2) {
                                            i4 = R$id.saved_tab;
                                        } else if (i != 3) {
                                            childTabViewAt = null;
                                            i4 = 0;
                                        } else {
                                            i4 = R$id.memory_tab;
                                        }
                                        if (!(childTabViewAt instanceof ViewGroup)) {
                                            viewGroup = (ViewGroup) childTabViewAt;
                                            for (i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                                                try {
                                                    childAt = viewGroup.getChildAt(i5);
                                                    if (childAt == null) {
                                                        childAt.setVisibility(8);
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                                }
                                            }
                                            if (viewGroup.getLayoutParams() instanceof LinearLayout$LayoutParams) {
                                                viewGroup.setLayoutParams(new LinearLayout$LayoutParams(0, -2, 1.0f));
                                            }
                                            viewGroup.setMinimumWidth(0);
                                            viewGroup.setMinimumHeight(0);
                                            viewGroup.setPadding(0, 0, 0, 0);
                                            View viewFindViewById2 = tabHost.findViewById(i4);
                                            viewGroup.addView(Tools.O0(viewFindViewById2));
                                            layoutParams = viewFindViewById2.getLayoutParams();
                                            if (layoutParams instanceof LinearLayout$LayoutParams) {
                                                ((LinearLayout$LayoutParams) layoutParams).gravity = 17;
                                            }
                                            if (layoutParams instanceof RelativeLayout$LayoutParams) {
                                                ((RelativeLayout$LayoutParams) layoutParams).addRule(13, -1);
                                            }
                                            viewFindViewById2.setLayoutParams(layoutParams);
                                        }
                                    }
                                    tabWidget.setMinimumWidth(0);
                                    tabWidget.setMinimumHeight(0);
                                    this.J = tabHost.findViewById(R$id.menu_btn);
                                    this.K = (ImageView) tabHost.findViewById(R$id.menu_btn_land);
                                    ListView listView = (ListView) tabHost.findViewById(R$id.saved_list);
                                    this.L = listView;
                                    listView.setEmptyView(tabHost.findViewById(R$id.empty_list_view));
                                    this.M = (ListView) tabHost.findViewById(R$id.mem_listview);
                                    this.P = (ImageButton) tabHost.findViewById(R$id.list_refresh);
                                    this.Q = (ImageButton) tabHost.findViewById(R$id.process_pause);
                                    this.Y = (ListView) tabHost.findViewById(R$id.config_list);
                                    this.g0 = (TextView) tabHost.findViewById(R$id.status_bar);
                                    this.j0 = true;
                                    this.q.setVisibility(4);
                                    tabHost.setOnTabChangedListener(new MainService$h(this));
                                    q0 q0Var = new q0(this);
                                    this.H = q0Var;
                                    this.z.setOnClickListener(q0Var);
                                    this.z.setTag(this.H);
                                    MainService$i mainService$i = new MainService$i(this, R$string.value_format, R$drawable.ic_playlist_check_white_24dp);
                                    this.I = mainService$i;
                                    this.u.setOnClickListener(mainService$i);
                                    this.w.setOnClickListener(this.I);
                                    this.g0.setOnClickListener(this);
                                    ActivityManager activityManager = null;
                                    this.h0 = (ShowApp) a.d.f(R$layout.show_app, null);
                                    this.Q.setOnClickListener(this);
                                    tabHost.setCurrentTab(1);
                                    this.o.setOnClickListener(this);
                                    activityManager = (ActivityManager) b("activity");
                                    this.h = new j(activityManager, Tools.B0());
                                    this.i.N0();
                                    this.i.G();
                                    this.j = HotPoint.getInstance();
                                    this.k0 = new d1();
                                    b0.j(this);
                                    Config.m(this.K);
                                    Config.m(this.o);
                                    Config.m(this.F);
                                    this.F.setOnClickListener(this);
                                    p1VarArr = J0;
                                    Z0(p1VarArr);
                                    Y0(p1VarArr);
                                    W0(p1VarArr);
                                    V0();
                                    i2 = 0;
                                    this.P.setOnClickListener(this);
                                    MainService$j mainService$j = new MainService$j(this, "tmp");
                                    this.J.setTag(mainService$j);
                                    this.K.setTag(mainService$j);
                                    MainService$m mainService$m = new MainService$m(this, p1VarArr);
                                    this.J.setOnClickListener(mainService$m);
                                    this.K.setOnClickListener(mainService$m);
                                    this.p.setOnClickListener(this);
                                    this.q.setOnClickListener(this);
                                    this.s.setOnClickListener(this);
                                    G0();
                                    sharedPreferencesM0 = Tools.M0();
                                    if (sharedPreferencesM0.contains("mem-fail")) {
                                        Config.b(R$id.config_memory_access).f42d = 0;
                                        Config.k();
                                        sharedPreferencesM0.edit().remove("mem-fail").commit();
                                    }
                                    this.i.B0(I());
                                    MainService$n mainService$n = new MainService$n(this);
                                    this.G.getAdapter().registerDataSetObserver(mainService$n);
                                    this.L.getAdapter().registerDataSetObserver(mainService$n);
                                    this.M.getAdapter().registerDataSetObserver(mainService$n);
                                    k1();
                                    l1();
                                    this.i0 = new x();
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
                    this.s = (TextView) tabHost.findViewById(R$id.app_name);
                    if (R$id.app_icon / iIndexOf != 2131034344) {
                        this.P = (ImageButton) tabHost.findViewById(R$id.add_not_replace);
                        this.Q = (ImageButton) tabHost.findViewById(R$id.addr_item_value);
                        viewFindViewById = tabHost.findViewById(R$id.mode_hacking);
                    } else {
                        this.P = (ImageButton) tabHost.findViewById(R$id.config_suggestions);
                        this.Q = (ImageButton) tabHost.findViewById(R$id.config_autopause);
                        viewFindViewById = tabHost.findViewById(R$id.config_exit);
                    }
                    this.Y = (ListView) viewFindViewById;
                    ListView listView2 = (ListView) tabHost.findViewById(R$id.addr_list);
                    this.G = listView2;
                    listView2.setEmptyView(tabHost.findViewById(R$id.nothing_found_view));
                    enumerationEntries.nextElement();
                    this.p = (ImageView) tabHost.findViewById(R$id.count_fuzzy_equal_seekbar);
                    this.o = (ImageView) tabHost.findViewById(R$id.config_keyboard);
                    this.y = (TextView) tabHost.findViewById(R$id.config_path);
                    zipFile = zipFile2;
                    while (true) {
                        wrapLayoutArr = this.D;
                        if (i2 < wrapLayoutArr.length) {
                            break;
                            break;
                        }
                        wrapLayout = wrapLayoutArr[i2];
                        wrapLayout.removeAllViews();
                        i3 = 0;
                        while (true) {
                            p1VarArr2 = p1VarArr[i2];
                            if (i3 < p1VarArr2.length) {
                                p1 p1Var2 = p1VarArr2[i3];
                                p1Var2.g(i2, i3);
                                wrapLayout.addView(p1Var2.b(true));
                                i3++;
                            }
                        }
                        i2++;
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
        this.t = (TextView) tabHost.findViewById(R$id.filter);
        this.u = (TextView) tabHost.findViewById(R$id.value_format);
        this.v = tabHost.findViewById(R$id.info_mem);
        this.w = (TextView) tabHost.findViewById(R$id.saved_format);
        this.x = tabHost.findViewById(R$id.count_wait);
        this.z = tabHost.findViewById(R$id.info_cnt);
        Config.h();
        l1();
        this.Z = tabHost.findViewById(R$id.search_page);
        this.a0 = tabHost.findViewById(R$id.saved_page);
        this.b0 = tabHost.findViewById(R$id.memory_editor_page);
        this.c0 = tabHost.findViewById(R$id.config_page);
        this.d0 = (TextView) tabHost.findViewById(R$id.search_tab_counter);
        this.e0 = (TextView) tabHost.findViewById(R$id.saved_tab_counter);
        tabHost.setup();
        N("settings", R$id.config_page, R$id.config_tab_icon);
        N("search", R$id.search_page, R$id.search_tab_icon);
        N("saved", R$id.saved_page, R$id.saved_tab_icon);
        N("memory", R$id.memory_editor_page, R$id.memory_tab_icon);
        tabWidget = tabHost.getTabWidget();
        while (i < tabWidget.getTabCount()) {
            childTabViewAt = tabWidget.getChildTabViewAt(i);
            if (i != 0) {
                i4 = R$id.config_tab;
            } else if (i != 1) {
                i4 = R$id.search_tab;
            } else if (i != 2) {
                i4 = R$id.saved_tab;
            } else if (i != 3) {
                childTabViewAt = null;
                i4 = 0;
            } else {
                i4 = R$id.memory_tab;
            }
            if (!(childTabViewAt instanceof ViewGroup)) {
                viewGroup = (ViewGroup) childTabViewAt;
                while (i5 < viewGroup.getChildCount()) {
                    childAt = viewGroup.getChildAt(i5);
                    if (childAt == null) {
                        childAt.setVisibility(8);
                    }
                }
                if (viewGroup.getLayoutParams() instanceof LinearLayout$LayoutParams) {
                    viewGroup.setLayoutParams(new LinearLayout$LayoutParams(0, -2, 1.0f));
                }
                viewGroup.setMinimumWidth(0);
                viewGroup.setMinimumHeight(0);
                viewGroup.setPadding(0, 0, 0, 0);
                View viewFindViewById3 = tabHost.findViewById(i4);
                viewGroup.addView(Tools.O0(viewFindViewById3));
                layoutParams = viewFindViewById3.getLayoutParams();
                if (layoutParams instanceof LinearLayout$LayoutParams) {
                    ((LinearLayout$LayoutParams) layoutParams).gravity = 17;
                }
                if (layoutParams instanceof RelativeLayout$LayoutParams) {
                    ((RelativeLayout$LayoutParams) layoutParams).addRule(13, -1);
                }
                viewFindViewById3.setLayoutParams(layoutParams);
            }
        }
        tabWidget.setMinimumWidth(0);
        tabWidget.setMinimumHeight(0);
        this.J = tabHost.findViewById(R$id.menu_btn);
        this.K = (ImageView) tabHost.findViewById(R$id.menu_btn_land);
        ListView listView3 = (ListView) tabHost.findViewById(R$id.saved_list);
        this.L = listView3;
        listView3.setEmptyView(tabHost.findViewById(R$id.empty_list_view));
        this.M = (ListView) tabHost.findViewById(R$id.mem_listview);
        this.P = (ImageButton) tabHost.findViewById(R$id.list_refresh);
        this.Q = (ImageButton) tabHost.findViewById(R$id.process_pause);
        this.Y = (ListView) tabHost.findViewById(R$id.config_list);
        this.g0 = (TextView) tabHost.findViewById(R$id.status_bar);
        this.j0 = true;
        this.q.setVisibility(4);
        tabHost.setOnTabChangedListener(new MainService$h(this));
        q0 q0Var2 = new q0(this);
        this.H = q0Var2;
        this.z.setOnClickListener(q0Var2);
        this.z.setTag(this.H);
        MainService$i mainService$i2 = new MainService$i(this, R$string.value_format, R$drawable.ic_playlist_check_white_24dp);
        this.I = mainService$i2;
        this.u.setOnClickListener(mainService$i2);
        this.w.setOnClickListener(this.I);
        this.g0.setOnClickListener(this);
        ActivityManager activityManager2 = null;
        this.h0 = (ShowApp) a.d.f(R$layout.show_app, null);
        this.Q.setOnClickListener(this);
        tabHost.setCurrentTab(1);
        this.o.setOnClickListener(this);
        this.h = new j(activityManager2, Tools.B0());
        this.i.N0();
        this.i.G();
        this.j = HotPoint.getInstance();
        this.k0 = new d1();
        b0.j(this);
        Config.m(this.K);
        Config.m(this.o);
        Config.m(this.F);
        this.F.setOnClickListener(this);
        p1VarArr = J0;
        Z0(p1VarArr);
        Y0(p1VarArr);
        W0(p1VarArr);
        V0();
        i2 = 0;
        this.P.setOnClickListener(this);
        MainService$j mainService$j2 = new MainService$j(this, "tmp");
        this.J.setTag(mainService$j2);
        this.K.setTag(mainService$j2);
        MainService$m mainService$m2 = new MainService$m(this, p1VarArr);
        this.J.setOnClickListener(mainService$m2);
        this.K.setOnClickListener(mainService$m2);
        this.p.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.s.setOnClickListener(this);
        G0();
        sharedPreferencesM0 = Tools.M0();
        if (sharedPreferencesM0.contains("mem-fail")) {
            Config.b(R$id.config_memory_access).f42d = 0;
            Config.k();
            sharedPreferencesM0.edit().remove("mem-fail").commit();
        }
        this.i.B0(I());
        MainService$n mainService$n2 = new MainService$n(this);
        this.G.getAdapter().registerDataSetObserver(mainService$n2);
        this.L.getAdapter().registerDataSetObserver(mainService$n2);
        this.M.getAdapter().registerDataSetObserver(mainService$n2);
        k1();
        l1();
        this.i0 = new x();
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
        int i;
        if (this.p0 == 0) {
            if (this.r0) {
                sb = new StringBuilder();
                sb.append(b2.f(R$string.search_hint));
                sb.append('\n');
                i = R$string.speedhack_hint;
            } else {
                sb = new StringBuilder();
                sb.append(b2.f(R$string.nothing_found));
                if (Config.i != -1) {
                    sb.append('\n');
                    sb.append(b2.f(R$string.try_more_ranges));
                }
                if (!this.q0) {
                    sb.append('\n');
                    i = R$string.try_fuzzy_search;
                }
            }
            sb.append(b2.f(i));
        } else {
            sb = null;
        }
        int i2 = this.s0.i();
        boolean zK = b0.k();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" (");
        long j = i2;
        sb2.append(i0.c(j, 32));
        String string = "";
        if (zK || this.p0 != j) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(zK ? "*" : "");
            sb3.append("/");
            sb3.append(i0.c(this.p0, 32));
            string = sb3.toString();
        }
        sb2.append(string);
        sb2.append(")");
        CharSequence string2 = sb2.toString();
        String string3 = sb != null ? sb.toString() : null;
        if (AddressArrayAdapter.f23d != 0) {
            string2 = Tools.x(string2, " ", n1.B(AddressArrayAdapter.f23d));
        }
        n2.i(new MainService$v(this, string3, string2));
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
        int i = 0;
        while (true) {
            WrapLayout[] wrapLayoutArr = this.D;
            if (i >= wrapLayoutArr.length) {
                break;
            }
            wrapLayoutArr[i].setFill(Config.f34g - 1);
            i++;
        }
        n2.i(new MainService$b0(this));
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
                if (f0.w) {
                    this.V.onClick(this.J);
                } else {
                    this.W.onClick(this.J);
                }
            }
        }
        l1();
        d1(null);
    }

    public void d0(int i) {
        if (Config.w == 0 || i != Config.w) {
            return;
        }
        n2.i(new MainService$x(this));
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
            textView.setText(b2.f(R$string.loading));
        }
        TextView textView2 = this.g0;
        if (textView2 != null) {
            String strValueOf = String.valueOf(' ');
            textView2.setText(Tools.x(b2.f(R$string.wait_daemon - (strValueOf.length() * 10)), " ", this.i.a0(), strValueOf.substring(0, 1), Config.b(R$id.config_speedhack_functions - (strValueOf.length() * 7)).a(), strValueOf.substring(0, 1), Integer.toString(Tools.L0(z()) * strValueOf.length())));
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
        n2.i(new MainService$f(this));
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

    void h(long j) {
        n2.i(new MainService$l(this, j));
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

    public void i0(CharSequence charSequence, long j, long j2, int i, int i2, long j3) {
        StringBuilder sb;
        if (j <= 0 || j2 == 0) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append(Tools.L1("%.2f", Double.valueOf((j * 100.0d) / j2)));
            sb.append(" %");
        }
        StringBuilder sb2 = sb;
        this.i0.c(charSequence, j, j2, i, i2, j3, sb2 == null ? "" : sb2.toString());
        if (sb2 != null) {
            sb2.setLength(4);
            sb2.append('%');
        }
        this.j.t((byte) 0, j, j2, i, i2, sb2 == null ? "" : sb2.toString());
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
            if (this.n != null && r.n != null && r.n.x()) {
                z1$d z1_d = this.v0;
                if (z1_d != null) {
                    String str = z1_d.f1434c;
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
                String strT = r.t();
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

    void j(int i) {
        Tools.n(z(), i);
        U();
    }

    public void j0(c2 c2Var) {
        n2.i(new MainService$e(this));
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
    public void k0(int i) {
        int i2;
        String strF;
        String strF2;
        String str;
        MainService$y mainService$y;
        String strF3;
        DialogInterface$OnClickListener r_n;
        long jCurrentTimeMillis;
        int i3;
        s();
        boolean z = i <= 100;
        int i4 = R$string.reset_search;
        if (i == 1) {
            i2 = R$string.out_of_memory;
        } else {
            if (i != 2) {
                if (i != 3) {
                    i2 = R$string.io_error;
                    if (i != 4) {
                        if (i == 9) {
                            String str2 = b2.f(R$string.maps_failed) + "\n\n" + b2.f(R$string.game_protected);
                            if (Config.C) {
                                str2 = str2 + "\n\n" + b2.f(R$string.need_root);
                            }
                            strF = i(str2);
                        } else if (i != 10) {
                            switch (i) {
                                case 105:
                                    if (Config.C) {
                                        try {
                                            if ((Tools.Y(Config.E).flags & 2) == 0) {
                                                try {
                                                    strF = Tools.L1(b2.f(R$string.not_optimized2), Config.F, Config.F);
                                                    i3 = R$string.not_optimized2;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    i3 = R$string.not_optimized2;
                                                    e1.s("Failed check vSpace: " + Config.E, th);
                                                    strF = null;
                                                }
                                            } else {
                                                strF = null;
                                                i3 = R$string.reset_search;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i3 = R$string.reset_search;
                                        }
                                    } else {
                                        strF = null;
                                        i3 = R$string.reset_search;
                                    }
                                    if (i3 == 2131296903) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(b2.f(R$string.eperm_error_descr_0));
                                        sb.append('\n');
                                        sb.append(1);
                                        sb.append(": ");
                                        sb.append(b2.f(R$string.eperm_error_descr_3));
                                        sb.append('\n');
                                        sb.append(2);
                                        sb.append(": ");
                                        sb.append(b2.f(!Config.C ? R$string.eperm_error_descr_4 : R$string.eperm_error_descr_5));
                                        strF = sb.toString();
                                    }
                                    i4 = i3;
                                    i2 = R$string.eperm_error;
                                    break;
                                case 106:
                                    strF = i(b2.f(R$string.eperm_error_descr_0) + "\n1: " + b2.f(R$string.eperm_error_descr_1) + "\n2: " + b2.f(R$string.eperm_error_descr_2));
                                    i2 = R$string.eperm_error_defend;
                                    break;
                                case 107:
                                    i4 = R$string.speedhack_fail;
                                    strF = null;
                                    i2 = R$string.speedhack_fail;
                                    break;
                                case 108:
                                    strF = Tools.N1(R$string.too_many_union_numbers) + ": 64";
                                    i2 = R$string.error;
                                    break;
                                default:
                                    i2 = R$string.unknown_error;
                                    break;
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(b2.f(R$string.maps_failed));
                            sb2.append("\n\n");
                            sb2.append(b2.f(Config.C ? R$string.vspace_error : R$string.root_error));
                            strF = sb2.toString();
                        }
                    }
                    if (strF == null) {
                        strF = b2.f(i4);
                    }
                    strF2 = b2.f(i2);
                    str = "{" + i + '}';
                    if (this.w0.get(i)) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (T0 < jCurrentTimeMillis) {
                            T0 = jCurrentTimeMillis + 2000;
                            Tools.K1(str + b2.f(i2), 0);
                        }
                        if (z) {
                            q(true);
                            return;
                        }
                        return;
                    }
                    this.w0.put(i, true);
                    AlertDialog$Builder message = f.b().setCustomTitle(Tools.h0(str)).setMessage(strF2 + "\n\n" + strF);
                    String strF4 = b2.f(R$string.ok);
                    if (z) {
                        mainService$y = new MainService$y(this);
                    } else {
                        mainService$y = null;
                    }
                    AlertDialog$Builder cancelable = message.setPositiveButton(strF4, mainService$y).setCancelable(false);
                    if (i4 == 2131296456) {
                        strF3 = b2.f(R$string.fix_it);
                        r_n = new MainService$z(this);
                    } else {
                        if (i2 != 2131296409) {
                            if (i4 == 2131296819) {
                                strF3 = b2.f(R$string.fix_it);
                                r_n = new r$n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                            }
                            f.o(cancelable);
                        }
                        strF3 = b2.f(R$string.help);
                        r_n = new MainService$a0(this);
                    }
                    cancelable.setNeutralButton(strF3, r_n);
                    f.o(cancelable);
                }
                i2 = R$string.disk_full;
                strF = null;
                i4 = R$string.fix_path;
                if (strF == null) {
                    strF = b2.f(i4);
                }
                strF2 = b2.f(i2);
                str = "{" + i + '}';
                if (this.w0.get(i)) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (T0 < jCurrentTimeMillis) {
                        T0 = jCurrentTimeMillis + 2000;
                        Tools.K1(str + b2.f(i2), 0);
                    }
                    if (z) {
                        q(true);
                        return;
                    }
                    return;
                }
                this.w0.put(i, true);
                AlertDialog$Builder message2 = f.b().setCustomTitle(Tools.h0(str)).setMessage(strF2 + "\n\n" + strF);
                String strF5 = b2.f(R$string.ok);
                if (z) {
                    mainService$y = null;
                } else {
                    mainService$y = new MainService$y(this);
                }
                AlertDialog$Builder cancelable2 = message2.setPositiveButton(strF5, mainService$y).setCancelable(false);
                if (i4 == 2131296456) {
                    strF3 = b2.f(R$string.fix_it);
                    r_n = new MainService$z(this);
                } else {
                    if (i2 != 2131296409) {
                        if (i4 == 2131296819) {
                            strF3 = b2.f(R$string.fix_it);
                            r_n = new r$n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                        }
                        f.o(cancelable2);
                    }
                    strF3 = b2.f(R$string.help);
                    r_n = new MainService$a0(this);
                }
                cancelable2.setNeutralButton(strF3, r_n);
                f.o(cancelable2);
            }
            i2 = R$string.bug_detected;
        }
        strF = null;
        if (strF == null) {
            strF = b2.f(i4);
        }
        strF2 = b2.f(i2);
        str = "{" + i + '}';
        if (this.w0.get(i)) {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (T0 < jCurrentTimeMillis) {
                T0 = jCurrentTimeMillis + 2000;
                Tools.K1(str + b2.f(i2), 0);
            }
            if (z) {
                q(true);
                return;
            }
            return;
        }
        this.w0.put(i, true);
        AlertDialog$Builder message3 = f.b().setCustomTitle(Tools.h0(str)).setMessage(strF2 + "\n\n" + strF);
        String strF6 = b2.f(R$string.ok);
        if (z) {
            mainService$y = null;
        } else {
            mainService$y = new MainService$y(this);
        }
        AlertDialog$Builder cancelable3 = message3.setPositiveButton(strF6, mainService$y).setCancelable(false);
        if (i4 == 2131296456) {
            strF3 = b2.f(R$string.fix_it);
            r_n = new MainService$z(this);
        } else {
            if (i2 != 2131296409) {
                if (i4 == 2131296819) {
                    strF3 = b2.f(R$string.fix_it);
                    r_n = new r$n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                }
                f.o(cancelable3);
            }
            strF3 = b2.f(R$string.help);
            r_n = new MainService$a0(this);
        }
        cancelable3.setNeutralButton(strF3, r_n);
        f.o(cancelable3);
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
        if (!P0 || (Config.B & 2048) == 0 || this.v0 == null || !e0.p()) {
            return;
        }
        P0 = false;
        new n0$i(new MainService$e0(this), "CheckLibs").start();
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
    public void l0(w wVar) throws Throwable {
        Tools$a0 tools$a0;
        MainService mainService;
        long[] jArr;
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        c cVarF;
        long jG;
        int iF;
        int i6;
        boolean z;
        int i7;
        int iW;
        long j;
        int i8;
        Tools$a0 tools$a0J0 = Tools.J0(this.G);
        byte b2 = wVar.b();
        try {
            wVar.j();
            int iK = (wVar.k() - wVar.a()) - 1;
            wVar.f();
            d.a aVar = this.s0;
            int i9 = b0.i();
            c cVar = new c();
            synchronized (aVar) {
                try {
                    boolean z2 = S0;
                    S0 = false;
                    if (z2) {
                        jArr = null;
                        iArr = null;
                        i = 0;
                        aVar.d();
                        i2 = iK / (InOut.n + 12);
                        if (b2 == 0) {
                            i2 = i9;
                        }
                        aVar.e(i2);
                        i3 = 0;
                        while (iK - wVar.a() > 10) {
                            jG = wVar.g();
                            long jH = wVar.h();
                            iF = wVar.f();
                            cVar.f672a = jG;
                            cVar.f674c = iF;
                            if (jArr != null) {
                                i6 = iK;
                                iW = c.w(iF);
                                while (true) {
                                    if (i3 < i) {
                                        tools$a0 = tools$a0J0;
                                        j = jArr[i3];
                                        if (j == jG) {
                                            i8 = iArr[i3];
                                            if (i8 == iW) {
                                                i7 = i3 + 1;
                                                z = true;
                                                break;
                                                break;
                                            } else {
                                                if (i8 > iW) {
                                                }
                                                i3++;
                                                tools$a0J0 = tools$a0;
                                            }
                                        } else if (Tools.S1(j, jG)) {
                                            i3++;
                                            tools$a0J0 = tools$a0;
                                        }
                                    } else {
                                        tools$a0 = tools$a0J0;
                                    }
                                }
                                aVar.a(jG, jH, iF, z);
                                i3 = i7;
                                cVar = cVar;
                                iK = i6;
                                tools$a0J0 = tools$a0;
                            } else {
                                tools$a0 = tools$a0J0;
                                i6 = iK;
                            }
                            i7 = i3;
                            z = z2;
                            aVar.a(jG, jH, iF, z);
                            i3 = i7;
                            cVar = cVar;
                            iK = i6;
                            tools$a0J0 = tools$a0;
                        }
                        tools$a0 = tools$a0J0;
                        aVar.k();
                        if (b2 != 0) {
                            i4 = aVar.i();
                            arrayList = new ArrayList(i4);
                            for (i5 = 0; i5 < i4; i5++) {
                                cVarF = aVar.f(i5, null);
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
                            int i10 = aVar.i();
                            long[] jArr2 = new long[i10];
                            int[] iArr2 = new int[i10];
                            c cVar2 = new c();
                            int i11 = 0;
                            for (int i12 = 0; i12 < i10; i12++) {
                                if (aVar.c(i12)) {
                                    aVar.f(i12, cVar2);
                                    jArr2[i11] = cVar2.f672a;
                                    int i13 = i11 + 1;
                                    iArr2[i11] = c.w(cVar2.f674c);
                                    i11 = i13;
                                }
                            }
                            jArr = jArr2;
                            iArr = iArr2;
                            i = i11;
                        } catch (OutOfMemoryError e2) {
                            e1.l("Failed save checked data", e2);
                            jArr = null;
                            iArr = null;
                            i = 0;
                        }
                        aVar.d();
                        i2 = iK / (InOut.n + 12);
                        if (b2 == 0 && i2 > i9) {
                            i2 = i9;
                        }
                        aVar.e(i2);
                        i3 = 0;
                        while (iK - wVar.a() > 10 && (b2 != 0 || aVar.i() < i9)) {
                            jG = wVar.g();
                            long jH2 = wVar.h();
                            iF = wVar.f();
                            cVar.f672a = jG;
                            cVar.f674c = iF;
                            if (jArr != null) {
                                i6 = iK;
                                iW = c.w(iF);
                                while (true) {
                                    if (i3 < i) {
                                        tools$a0 = tools$a0J0;
                                        try {
                                            j = jArr[i3];
                                            if (j == jG) {
                                                i8 = iArr[i3];
                                                if (i8 == iW) {
                                                    i7 = i3 + 1;
                                                    z = true;
                                                    break;
                                                } else {
                                                    if (i8 > iW) {
                                                    }
                                                    i3++;
                                                    tools$a0J0 = tools$a0;
                                                }
                                            } else if (Tools.S1(j, jG)) {
                                                i3++;
                                                tools$a0J0 = tools$a0;
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
                                                Tools.A1(mainService.G, tools$a0);
                                                instance.p1();
                                                mainService.X(b2, null);
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                mainService = this;
                                                int i14 = mainService.s0.i();
                                                mainService.s0.d();
                                                mainService.s0.k();
                                                Tools.H1(R$string.out_of_memory_error);
                                                e1.s("list.size() = " + i14 + "; show count = " + b0.i(), e);
                                                mainService.V(mainService.G.getAdapter());
                                                b1();
                                                if (b2 == 0) {
                                                    mainService.B++;
                                                }
                                                Tools.A1(mainService.G, tools$a0);
                                                instance.p1();
                                                mainService.X(b2, null);
                                            }
                                        }
                                    } else {
                                        tools$a0 = tools$a0J0;
                                    }
                                }
                                aVar.a(jG, jH2, iF, z);
                                i3 = i7;
                                cVar = cVar;
                                iK = i6;
                                tools$a0J0 = tools$a0;
                            } else {
                                tools$a0 = tools$a0J0;
                                i6 = iK;
                            }
                            i7 = i3;
                            z = z2;
                            aVar.a(jG, jH2, iF, z);
                            i3 = i7;
                            cVar = cVar;
                            iK = i6;
                            tools$a0J0 = tools$a0;
                        }
                        tools$a0 = tools$a0J0;
                        aVar.k();
                        if (b2 != 0) {
                            i4 = aVar.i();
                            arrayList = new ArrayList(i4);
                            while (i5 < i4) {
                                cVarF = aVar.f(i5, null);
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
                    Tools.A1(mainService.G, tools$a0);
                    instance.p1();
                    mainService.X(b2, null);
                } catch (Throwable th2) {
                    th = th2;
                    tools$a0 = tools$a0J0;
                }
            }
        } catch (IOException e5) {
            e = e5;
            tools$a0 = tools$a0J0;
        } catch (OutOfMemoryError e6) {
            e = e6;
            tools$a0 = tools$a0J0;
        }
    }

    public void l1() {
        m1(false);
    }

    void m() {
        q(false);
    }

    public void m0(Script script) {
        n2.i(new MainService$d(this));
        if (this.f212b == script) {
            this.f212b = null;
        }
    }

    public void m1(boolean z) {
        if (f1.f952b) {
            z = true;
        }
        try {
            int i = Config.vSpaceReal ? 4 : 2;
            Throwable th = null;
            int i2 = 0;
            while (i2 < i) {
                boolean z2 = i2 >= 2;
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (z2) {
                        applicationContext = Config.a(applicationContext);
                    }
                    NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
                    if ((z || !v.f1280d) && (Config.B & 256) == 0) {
                        if (i2 == 0) {
                            e1.d("cancel notification");
                            if (v.f1277a != null) {
                                v.f1277a.stopForeground(true);
                            }
                        }
                        if (notificationManager != null) {
                            notificationManager.cancel(1);
                            notificationManager.cancelAll();
                            return;
                        }
                    } else {
                        if (i2 == 0) {
                            e1.d("add notification");
                        }
                        if (notificationManager != null) {
                            Notification notificationF = F(i2 % 2 == 0, z2);
                            notificationManager.notify(1, notificationF);
                            if (v.f1277a != null) {
                                v.f1277a.startForeground(1, notificationF);
                                e1.d("startForeground 2." + i2);
                                return;
                            }
                            return;
                        }
                    }
                    e1.d("Failed get NotificationManager " + i2);
                } catch (Throwable th2) {
                    if (th != null) {
                        th2.addSuppressed(th);
                    }
                    if (i2 == i - 1) {
                        e1.s("Failed startForeground " + i2, th2);
                        n0.h(Thread.currentThread(), th2, false);
                    }
                    th = th2;
                }
                i2++;
            }
        } catch (Throwable th3) {
            e1.a(th3);
        }
    }

    void n(byte b2) {
        o(b2, false);
    }

    public void n0(Script script) {
        n2.i(new MainService$b(this));
    }

    void n1() {
        this.Q.setImageResource(!this.R ? R$drawable.ic_pause_white_18dp : R$drawable.ic_play_arrow_white_18dp);
    }

    void o(byte b2, boolean z) {
        p(b2, z, true);
    }

    public void o0(byte b2, long j, long j2, int i) {
        this.p0 = j;
        if (i == 0) {
            s();
            S0 = true;
            if (b2 == 0) {
                if (b0.k() || Config.k == 0 || j <= b0.i()) {
                    D0(true);
                } else {
                    t();
                    Tools.J1(b2.f(R$string.search_helper) + ' ' + Tools.L1(b2.f(R$string.found_count), Long.valueOf(j)));
                    K0 = Config.k == 2;
                }
            }
        }
        if (this.p0 == 0) {
            p((byte) 0, false, false);
        }
    }

    public void o1(boolean z) {
        if (z) {
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

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        AlertDialog$Builder message;
        String strF;
        DialogInterface$OnClickListener mainService$q;
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
                Config.b(R$id.config_ranges).b();
                return;
            }
            if (view != null) {
                String string = "?";
                switch (view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : view.getId()) {
                    case R$drawable.ic_ui_button_24dp /* 2130968657 */:
                        this.f215e = true;
                        return;
                    case R$id.abort_button /* 2131034112 */:
                        this.i.h();
                        s();
                        return;
                    case R$id.hot_frame /* 2131034287 */:
                        c0();
                        return;
                    case R$id.more_btn /* 2131034336 */:
                        Tools.s(this.J);
                        return;
                    case R$string.hide /* 2131296674 */:
                        break;
                    case R$string.interrupt /* 2131296711 */:
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
                        message = f.b().setCustomTitle(Tools.h0(Tools.N1(R$string.script))).setMessage(string);
                        strF = b2.f(R$string.interrupt);
                        mainService$q = new MainService$q(this);
                        break;
                    case R$string.record /* 2131296884 */:
                        c2 c2Var = this.f216f;
                        message = f.b().setCustomTitle(Tools.h0(Tools.N1(R$string.record_script))).setMessage(c2Var != null ? c2Var.c() : "?");
                        strF = b2.f(R$string.stop);
                        mainService$q = new MainService$r(this);
                        break;
                    default:
                        return;
                }
                f.o(message.setPositiveButton(strF, mainService$q).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null));
                return;
            }
            return;
        }
        t();
    }

    @Override // android.view.View$OnLongClickListener
    public boolean onLongClick(View view) {
        this.h.a(false, new MainService$s(this));
        o1(false);
        this.j.x();
        return true;
    }

    void p(byte b2, boolean z, boolean z2) {
        if (z) {
            this.r0 = true;
        }
        this.p0 = 0L;
        if (z2) {
            this.i.l(b2);
        }
        instance.i.f793b.r();
        d.a aVar = this.s0;
        synchronized (aVar) {
            try {
                aVar.d();
                aVar.k();
            } catch (Throwable th) {
                throw th;
            }
        }
        V(this.G.getAdapter());
        b1();
        K0 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0113 A[PHI: r9
      0x0113: PHI (r9v16 int) = (r9v2 int), (r9v5 int), (r9v17 int) binds: [B:63:0x019c, B:57:0x0189, B:40:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public void p0(byte b2, int i, int[] iArr) {
        SharedPreferences$Editor sharedPreferences$EditorPutBoolean;
        int i2;
        int i3;
        int i4;
        String strF;
        int i5;
        AlertDialog$Builder negativeButton;
        int i6;
        switch (i) {
            case 0:
                sharedPreferences$EditorPutBoolean = Tools.M0().edit().putBoolean("mem-fail", true);
                sharedPreferences$EditorPutBoolean.commit();
                break;
            case 1:
                sharedPreferences$EditorPutBoolean = Tools.M0().edit().remove("mem-fail");
                sharedPreferences$EditorPutBoolean.commit();
                break;
            case 3:
                s();
                if (b2 == 0) {
                    i2 = R$string.dump_ended;
                    Tools.I1(i2, 0);
                }
                X(b2, null);
                break;
            case 4:
                s();
                i3 = R$string.dump_failed;
                if (b2 == 0) {
                    Tools.H1(i3);
                }
                X(b2, b2.f(i3));
                break;
            case 5:
                if (b2 == 0) {
                    i2 = R$string.copy_ended;
                    Tools.I1(i2, 0);
                }
                X(b2, null);
                break;
            case 6:
                i3 = R$string.copy_failed;
                if (b2 == 0) {
                    Tools.H1(i3);
                }
                X(b2, b2.f(i3));
                break;
            case 8:
                this.S = true;
                break;
            case 9:
                this.S = false;
                break;
            case 10:
                if (b2 == 0) {
                    i4 = R$string.speedhack_loading;
                    Tools.I1(i4, 0);
                }
                break;
            case 11:
                if (b2 == 0) {
                    strF = b2.f(R$string.speedhack_loaded);
                    if (this.D0) {
                        strF = strF + "\n" + b2.f(R$string.speedhack_no_x86);
                    }
                    i5 = this.D0;
                    Tools.K1(strF, i5);
                }
                this.D0 = false;
                break;
            case 12:
                if (b2 == 0) {
                    i4 = R$string.patch_loading;
                    Tools.I1(i4, 0);
                }
                break;
            case 13:
                if (b2 == 0) {
                    Tools.H1(R$string.patch_loaded);
                    f.o(f.b().setCustomTitle(Tools.g0(R$string.disable_protection)).setMessage(b2.f(R$string.must_restart_if)).setPositiveButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
                }
                X(b2, null);
                break;
            case 14:
                i3 = R$string.patch_failed;
                if (b2 == 0) {
                    Tools.H1(i3);
                }
                X(b2, b2.f(i3));
                break;
            case 15:
                if (b2 == 0) {
                    i4 = R$string.unrandomizer_loading;
                    Tools.I1(i4, 0);
                }
                break;
            case 16:
                if (b2 == 0) {
                    strF = b2.f(R$string.unrandomizer_loaded);
                    if (this.D0) {
                        strF = strF + "\n" + b2.f(R$string.speedhack_no_x86);
                    }
                    i5 = this.D0;
                    Tools.K1(strF, i5);
                }
                this.D0 = false;
                break;
            case 17:
                if (b2 == 0) {
                    negativeButton = f.b().setCustomTitle(Tools.g0(R$string.waitpid_mode)).setMessage(b2.f(R$string.help_waitpid)).setPositiveButton(b2.f(R$string.alternative), new MainService$w(this)).setNegativeButton(b2.f(R$string.skip), (DialogInterface$OnClickListener) null);
                    f.o(negativeButton);
                }
                break;
            case 18:
                X(b2, null);
                break;
            case 19:
                S(iArr);
                break;
            case 20:
                AlertDialog$Builder alertDialog$BuilderB = f.b();
                StringBuilder sb = new StringBuilder();
                sb.append(b2.f(R$string.ptrace_fail));
                sb.append("\n\n");
                sb.append(b2.f(iArr[0] != 0 ? R$string.ptrace_fail_partially : R$string.ptrace_fail_full));
                sb.append("\n\n");
                sb.append(b2.f(R$string.ptrace_fail_solve));
                negativeButton = alertDialog$BuilderB.setMessage(sb.toString()).setPositiveButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null);
                f.o(negativeButton);
                break;
            case 21:
                if (iArr[1] != 0) {
                    i6 = R$string.feature_hide_4;
                } else if (iArr[2] != 0) {
                    i6 = R$string.feature_firmware;
                } else {
                    if (this.C0 && (Config.A & 131072) != 0) {
                        this.C0 = false;
                        Config.b(R$id.config_ptrace_bypass_mode).b();
                    }
                    i6 = R$string.feature_protection;
                }
                Tools.K1(b2.f(i6), 1);
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
            n2.i(new MainService$u(this));
        }
    }

    void q(boolean z) {
        o((byte) 0, z);
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
        boolean z = (Config.p & (1 << ((iH * 2) + iD1))) != 0;
        int i = Config.r;
        if (iH >= 0) {
            int[] iArr = this.z0;
            if (iArr[iH] != i) {
                iArr[iH] = i;
                this.m.getCurrentView().setBackgroundColor((i & (1 << iH)) == 0 ? 0 : -16777216);
            }
        }
        this.J.setVisibility((z || iD1 != 0) ? 8 : 0);
        this.K.setVisibility(iD1 == 1 ? iH >= 0 ? 0 : 4 : 8);
        this.F.setVisibility(iD1 == 0 ? 0 : 8);
        this.E.setVisibility((iH < 0 || !z) ? 8 : 0);
        int i2 = 0;
        while (true) {
            WrapLayout[] wrapLayoutArr = this.D;
            if (i2 >= wrapLayoutArr.length) {
                return;
            }
            WrapLayout wrapLayout = wrapLayoutArr[i2];
            wrapLayout.setFill(Config.f34g - 1);
            wrapLayout.setVisibility(i2 == iH ? 0 : 8);
            long j = Config.f29b[(i2 * 2) + iD1];
            for (int i3 = 0; i3 < wrapLayout.getChildCount(); i3++) {
                try {
                    View childAt = wrapLayout.getChildAt(i3);
                    if (childAt != null) {
                        childAt.setVisibility(((1 << i3) & j) != 0 ? 0 : 8);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                } catch (Throwable th) {
                    e1.a(th);
                }
            }
            i2++;
        }
    }

    void r(boolean z) {
        this.h.b(z);
    }

    public void r0() {
        P();
        if (this.F0) {
            return;
        }
        this.F0 = true;
        z1$d z1_d = this.v0;
        String str = z1_d == null ? null : z1_d.f1434c;
        boolean z = z1_d == null ? false : z1_d.n;
        r(false);
        J0();
        s();
        s0(str, z);
    }

    void s() {
        this.j.t((byte) 2, -1L, 1L, 0, 1, "");
        this.i0.a(true);
        this.i.m();
        this.i.L();
        this.U = false;
    }

    void s0(String str, boolean z) {
        f.o(f.b().setCustomTitle(Tools.g0(R$string.game_dead)).setItems(new String[]{b2.f(R$string.exit), b2.f(R$string.restart_game), b2.f(R$string.restart_game_without_protection), b2.f(R$string.help_games_protection_title), b2.f(R$string.ok)}, new MainService$c0(this, str, z)).setCancelable(false));
    }

    void t() {
        u(true);
    }

    void u(boolean z) {
        StringBuilder sb;
        String strF;
        e1.d("ServiceProxy dismissDialog: " + this.n);
        if (this.n == null) {
            return;
        }
        this.i0.a(false);
        this.n.dismiss();
        this.n = null;
        this.h0.a(z);
        this.j.m();
        this.T = this.R;
        boolean z2 = this.S;
        boolean z3 = (Config.A & 128) != 0;
        if (this.i0.b() && (z3 || z2)) {
            String string = Tools.N1(R$string.paused) + ":\n";
            if (z3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("- ");
                sb2.append(Tools.L1(b2.f(R$string.by_option), Tools.N1(R$string.hide_from_game) + ": 1"));
                sb2.append(";\n");
                string = sb2.toString();
            }
            if (z2) {
                if ((Config.B & 4) != 0) {
                    sb = new StringBuilder();
                    sb.append(string);
                    sb.append("- ");
                    strF = Tools.L1(b2.f(R$string.by_option), Tools.N1(R$string.autopause) + ": " + b2.f(R$string.yes));
                } else {
                    sb = new StringBuilder();
                    sb.append(string);
                    sb.append("- ");
                    strF = b2.f(R$string.by_pause_button);
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
                f.m(f.c(r.p).setMessage(strTrim).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null).create());
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
            boolean z = true;
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
                boolean z2 = false;
                for (File file : fileArrListFiles) {
                    if (z2) {
                        break;
                    }
                    if (file != null && file.getName().startsWith("lib") && file.getName().endsWith(".so")) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            if (fileInputStream.read(bArr) > 13 && bArr[0] == 127 && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70 && bArr[18] == 40) {
                                try {
                                    e1.d("doCheckLibs: " + file + " is ARM lib");
                                    z2 = true;
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = true;
                                    e1.l("Failed check lib " + file, th);
                                }
                            }
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                if (z2) {
                    String str2 = applicationInfoY.sourceDir;
                    if (str2 == null) {
                        return 4;
                    }
                    ZipFile zipFile = new ZipFile(str2);
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (true) {
                        if (!enumerationEntries.hasMoreElements()) {
                            z = false;
                            break;
                        }
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement.getName().contains("lib/x86/lib")) {
                            e1.d("doCheckLibs: " + zipEntryNextElement.getName() + " is x86 lib");
                            break;
                        }
                    }
                    zipFile.close();
                    if (!z) {
                        return 5;
                    }
                    f.o(f.b().setCustomTitle(Tools.h0(Tools.N1(R$string.check_libs))).setMessage(b2.f(R$string.arm_libs)).setPositiveButton(b2.f(R$string.fix_it), !Config.C ? new MainService$g0(this, str2) : new r$n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh278:0krz0wr0uhsodfh0dup0oleudulhv0zlwk0{;90oleudulhv0{0soruh2")).setNeutralButton(b2.f(R$string.skip), new MainService$f0(this)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
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

    public void w(int i) {
        f0 f0Var = this.i;
        if (f0Var == null || i < 80) {
            return;
        }
        f0Var.z();
    }

    boolean w0(byte b2) {
        z1$d z1_d = this.v0;
        if (z1_d == null) {
            Tools.J1(b2.f(R$string.no_application));
            return false;
        }
        e1.d("Kill game");
        this.i.C0(b2, z1_d.f1437f, z1_d.f1434c, z1_d.f1435d);
        this.i.L0(b2, (byte) 2);
        return true;
    }

    public void x(String str, int i, String str2) {
        P();
        Script script = new Script(new File(str), i, str2);
        this.f212b = script;
        script.R3();
    }

    boolean x0(byte b2, boolean z) {
        if ((!z && this.n == null) || this.R) {
            return false;
        }
        Q();
        this.i.L0(b2, (byte) 0);
        this.R = true;
        n1();
        return true;
    }

    void y(boolean z) {
        if (this.n != null) {
            return;
        }
        if (z) {
            this.h0.k();
        } else {
            this.h0.a(true);
        }
    }

    boolean y0(boolean z) {
        boolean zX0 = x0((byte) 0, z);
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
