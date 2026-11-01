/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.b;
import a.d;
import a.e;
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
import android.content.res.Configuration;
import android.database.DataSetObserver;
import android.ext.AddressArrayAdapter;
import android.ext.ArrayAdapter;
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.EditorListener;
import android.ext.FastScrollerFix;
import android.ext.FloatPanel;
import android.ext.HotPoint;
import android.ext.ItemContextMenu;
import android.ext.OffsetCalculator;
import android.ext.RegionList;
import android.ext.SavedListAdapter;
import android.ext.Script;
import android.ext.ShowApp;
import android.ext.TimeJumpPanel;
import android.ext.TimersEditor;
import android.ext.Tools;
import android.ext.a3;
import android.ext.b0;
import android.ext.b2;
import android.ext.c1;
import android.ext.c2;
import android.ext.d;
import android.ext.d0;
import android.ext.d1;
import android.ext.d2;
import android.ext.e0;
import android.ext.e1;
import android.ext.e2;
import android.ext.f;
import android.ext.f0;
import android.ext.f1;
import android.ext.h;
import android.ext.h2;
import android.ext.i;
import android.ext.i0;
import android.ext.i1;
import android.ext.i2;
import android.ext.j;
import android.ext.j1;
import android.ext.k;
import android.ext.k1;
import android.ext.k2;
import android.ext.l1;
import android.ext.l2;
import android.ext.m1;
import android.ext.m2;
import android.ext.n0;
import android.ext.n1;
import android.ext.n2;
import android.ext.o1;
import android.ext.o2;
import android.ext.p1;
import android.ext.r;
import android.ext.t0;
import android.ext.t1;
import android.ext.t2;
import android.ext.u0;
import android.ext.u2;
import android.ext.v;
import android.ext.v0;
import android.ext.w;
import android.ext.w1;
import android.ext.w2;
import android.ext.x;
import android.ext.y0;
import android.ext.y2;
import android.ext.z1;
import android.fix.WrapLayout;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class MainService
extends k2
implements View.OnClickListener,
View.OnLongClickListener {
    public static final String G0;
    public static volatile boolean H0;
    public static volatile boolean I0;
    public static final p1[][] J0;
    private static volatile boolean K0;
    public static final boolean[] L0;
    public static final boolean[] M0;
    private static int N0;
    static int O0;
    private static volatile boolean P0;
    private static volatile ComponentCallbacks Q0;
    private static volatile boolean R0;
    private static volatile boolean S0;
    private static long T0;
    public static volatile Context context;
    public static volatile MainService instance;
    private volatile long A;
    private final Runnable A0;
    private volatile long B;
    Runnable B0 = null;
    TextView C;
    private boolean C0 = true;
    final WrapLayout[] D;
    private boolean D0 = false;
    View E;
    private final a3[] E0;
    private ImageView F;
    volatile boolean F0 = false;
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
    boolean R = false;
    boolean S = false;
    private boolean T = false;
    private boolean U = false;
    t0 V;
    i2 W;
    m1 X;
    ListView Y;
    View Z;
    View a0;
    Script b = null;
    View b0;
    View c = null;
    View c0;
    View d = null;
    private TextView d0;
    boolean e = false;
    private TextView e0;
    c2 f = null;
    View f0;
    View g = null;
    TextView g0;
    j h;
    ShowApp h0;
    f0 i;
    x i0;
    HotPoint j;
    private boolean j0 = true;
    TimeJumpPanel k = null;
    public d1 k0;
    WindowManager l;
    volatile int l0 = 0;
    TabHost m;
    volatile int m0 = 0;
    volatile i1 n = null;
    TimersEditor n0;
    private ImageView o;
    TimersEditor o0;
    private ImageView p;
    volatile long p0 = 0L;
    private ImageView q;
    boolean q0 = false;
    View r;
    boolean r0 = true;
    TextView s;
    final d.a s0 = new d.a();
    TextView t;
    SavedListAdapter t0 = new SavedListAdapter();
    TextView u;
    final android.ext.d u0 = new android.ext.d();
    View v;
    public z1.d v0 = null;
    TextView w;
    private SparseBooleanArray w0 = new SparseBooleanArray();
    View x;
    ConfigListAdapter x0;
    TextView y;
    private volatile ArrayList y0 = new ArrayList();
    View z;
    private final int[] z0 = new int[3];

    static {
        boolean bl;
        int n3;
        Object object = new StringBuilder();
        ((StringBuilder)object).append(android.ext.i.d);
        ((StringBuilder)object).append("_preferences");
        G0 = ((StringBuilder)object).toString();
        instance = null;
        H0 = false;
        I0 = false;
        J0 = new p1[3][];
        K0 = false;
        L0 = new boolean[176];
        M0 = new boolean[76];
        int n4 = 0;
        while (true) {
            object = M0;
            n3 = ((Object)object).length;
            bl = true;
            if (n4 >= n3) break;
            if (n4 % 4 >= 2) {
                bl = false;
            }
            object[n4] = bl;
            ++n4;
        }
        for (n4 = 0; n4 < ((Object)(object = (Object)L0)).length; ++n4) {
            bl = n4 % 4 < 2;
            object[n4] = bl;
        }
        for (n4 = 0; n4 < 3; ++n4) {
            n3 = (new int[]{40, 43, 44})[n4];
            object = L0;
            n3 = (n3 - 1) * 4;
            object[n3] = false;
            object[n3 + 1] = false;
            object[n3 + 2] = false;
            object[n3 + 3] = false;
        }
        N0 = 127;
        O0 = 0;
        P0 = true;
        Q0 = null;
        R0 = false;
        S0 = true;
        T0 = 0L;
    }

    public MainService(Context context) {
        super(context);
        this.A0 = new Runnable(this){
            final MainService a;
            {
                this.a = mainService;
            }

            @Override
            public void run() {
                int n3;
                MainService mainService;
                block6: {
                    int n4;
                    try {
                        mainService = this.a;
                        if (mainService.f0 == mainService.a0) {
                            mainService.t0.i();
                        }
                    }
                    catch (Throwable throwable) {
                        e1.l("Failed update saved list", throwable);
                    }
                    n3 = n4 = Config.n;
                    if (n4 > 0) break block6;
                    n3 = 1000;
                }
                try {
                    mainService = n2.d();
                    mainService.removeCallbacks(this);
                    mainService.postDelayed(this, n3);
                }
                catch (Throwable throwable) {
                    e1.s("Failed post timer", throwable);
                }
            }
        };
        this.E0 = new a3[4];
        if (MainService.context == null) {
            MainService.context = l2.i(context);
        }
        instance = this;
        Tools.o();
        this.i = new f0();
        this.D = new WrapLayout[3];
    }

    public static ComponentCallbacks A() {
        ComponentCallbacks componentCallbacks;
        Object object = componentCallbacks = Q0;
        if (componentCallbacks == null) {
            Q0 = object = new ComponentCallbacks2(){

                public void onConfigurationChanged(Configuration configuration) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ComponentCallbacks2 onConfigurationChanged: ");
                    stringBuilder.append(configuration);
                    e1.d(stringBuilder.toString());
                    MainService.Y(a.b.f(configuration));
                }

                public void onLowMemory() {
                    e1.d("ComponentCallbacks2 onLowMemory");
                    MainService.t0(-1);
                }

                public void onTrimMemory(int n3) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ComponentCallbacks2 onTrimMemory: ");
                    stringBuilder.append(n3);
                    e1.d(stringBuilder.toString());
                    MainService.t0(n3);
                }
            };
        }
        return object;
    }

    static int D() {
        int n3 = MainService.instance.p0 == 0L ? 127 : N0;
        return n3;
    }

    static int E() {
        int n3;
        block3: {
            block2: {
                if (MainService.instance.p0 == 0L) break block2;
                int n4 = N0;
                int n5 = O0;
                n3 = n4;
                if ((n4 & n5) != n5) break block3;
            }
            n3 = O0;
        }
        return n3;
    }

    private void G0() {
        context.registerComponentCallbacks(MainService.A());
    }

    public static void I0() {
        android.ext.f.o(android.ext.f.b().setMessage((CharSequence)b2.f(2131296297)).setNegativeButton((CharSequence)b2.f(2131296836), null));
    }

    private void J0() {
        this.z0();
        this.q(true);
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

    private void M0(Long l3, long l4) {
        long l5;
        int n3;
        int n4;
        int n5 = 0;
        Object object = l3;
        if (l3 == null) {
            n3 = n4 = this.M.getFirstVisiblePosition();
            if (this.M.getChildCount() > 1) {
                n3 = n4;
                if (this.M.getChildAt(0).getTop() < 0) {
                    n3 = n4 + 1;
                }
            }
            l3 = (object = this.M.getItemAtPosition(n3)) instanceof v0 ? Long.valueOf(((v0)object).b()) : null;
            object = object instanceof android.ext.c ? Long.valueOf(((android.ext.c)object).a) : l3;
        }
        if (object != null && (l5 = ((Long)object).longValue()) != l4 && l5 != this.O.f()) {
            n4 = this.N.p(l5) - this.M.getFirstVisiblePosition();
            n3 = n5;
            if (n4 >= 0) {
                n3 = n5;
                if (n4 < this.M.getChildCount()) {
                    n3 = this.M.getChildAt(n4).getTop();
                }
            }
            this.O.b(l5, Tools.N1(2131296862), n3);
        }
    }

    private void N(String string2, int n3, int n4) {
        TabHost.TabSpec tabSpec = this.m.newTabSpec(string2);
        tabSpec.setContent(n3);
        string2 = Config.m((ImageView)this.m.findViewById(n4));
        tabSpec.setIndicator((CharSequence)"", string2.getDrawable());
        try {
            this.m.addTab(tabSpec);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            e1.a(illegalArgumentException);
            tabSpec.setIndicator((CharSequence)"");
            try {
                this.m.addTab(tabSpec);
                return;
            }
            catch (IllegalArgumentException illegalArgumentException2) {
                e1.a(illegalArgumentException2);
                try {
                    tabSpec.setIndicator(a.d.g(2131099687, (ViewGroup)this.m.getTabWidget(), false));
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    e1.a(noSuchMethodError);
                    tabSpec.setIndicator((CharSequence)"", string2.getDrawable());
                }
                this.m.addTab(tabSpec);
                return;
            }
        }
    }

    static void N0(int n3, int n4) {
        N0 = n3 &= 0x7F;
        if (n4 == 0) {
            O0 = n3;
        }
    }

    private void S(int[] nArray) {
        if (nArray != null && nArray.length == 2) {
            int n3 = nArray[0];
            a3[] a3Array = this.E0;
            if (n3 >= 0 && n3 < 4) {
                a3 a32;
                a3 a33 = a32 = a3Array[n3];
                if (a32 == null) {
                    a3Array[n3] = a33 = new a3(n3);
                }
                a33.a(nArray[1]);
            }
        }
    }

    private void T0(byte by, double d4) {
        d1.a a4 = d1.d(d4);
        this.i.F0(by, a4.a, a4.b);
        this.j.A(d1.a((double)a4.a / (double)a4.b));
    }

    private void V0() {
        ConfigListAdapter configListAdapter;
        this.x0 = configListAdapter = new ConfigListAdapter();
        this.Y.setAdapter((ListAdapter)configListAdapter);
        this.Y.setOnItemClickListener((AdapterView.OnItemClickListener)configListAdapter);
    }

    private void W0(p1[][] object) {
        n1 n12;
        this.O = new o1();
        this.N = n12 = new n1();
        p1 p12 = n12.i();
        this.t.setOnClickListener((View.OnClickListener)p12);
        object[2] = new p1[]{new EditorListener(), new l0(this), new r0(this), new u0(), new o1.c(this.O), new o1.b(this.O), new d0(), new o0(this), new q0(this), new k0(this), new j0(this), new android.ext.j0(), new android.ext.c0(), new h(), new OffsetCalculator(), new s0(this), new m0(this), this.I, p12};
        try {
            this.M.setAdapter((ListAdapter)n12);
            object = this.M;
            p12 = new EditorListener(true);
            object.setOnItemClickListener((AdapterView.OnItemClickListener)p12);
            p12 = this.M;
            object = new ItemContextMenu(3);
            p12.setOnItemLongClickListener((AdapterView.OnItemLongClickListener)object);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            e1.a(outOfMemoryError);
        }
        FastScrollerFix.a(this.M, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Y(Configuration configuration) {
        Throwable throwable2;
        block7: {
            block6: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Main onConfigurationChanged: ");
                stringBuilder.append(configuration);
                e1.d(stringBuilder.toString());
                if (R0) {
                    return;
                }
                R0 = true;
                try {
                    Tools.U1(configuration);
                    if (android.ext.k.b().equals(Locale.getDefault().toString())) break block6;
                    android.ext.k.g();
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            if (instance != null && MainService.instance.j != null) {
                MainService.instance.j.o();
            }
            if (instance != null && MainService.instance.n != null) {
                MainService.instance.n.h();
            }
            if (I0) {
                instance.q1();
            }
            R0 = false;
            return;
        }
        R0 = false;
        throw throwable2;
    }

    private void Y0(p1[][] p1Array) {
        p1Array[1] = new p1[]{new p1(this, 2131296751, 2130968664){
            final MainService f;
            {
                this.f = mainService;
                super(n3, n4);
            }

            @Override
            public void onClick(View view) {
                new c1(this.f.v0, null);
            }
        }, new q0(this), new s0(this), new p1(this, 2131296919, 2130968607){
            final MainService f;
            {
                this.f = mainService;
                super(n3, n4);
            }

            @Override
            public void onClick(View h2Array) {
                int n3 = this.f.t0.getCount();
                h2Array = new h2[n3];
                for (int i3 = 0; i3 < n3; ++i3) {
                    h2Array[i3] = this.f.t0.d(i3);
                }
                new c1(this.f.v0, h2Array);
            }
        }, new p0(this, true), new EditorListener(), new m0(this), new l0(this), new o0(this), new d0(), new j0(this), new android.ext.b(), new k0(this), new OffsetCalculator(), this.I};
        this.L.setAdapter((ListAdapter)this.t0);
        this.L.setOnItemClickListener((AdapterView.OnItemClickListener)new EditorListener());
        this.L.setOnItemLongClickListener((AdapterView.OnItemLongClickListener)new ItemContextMenu(2));
        new FastScrollerFix(this.L);
        SavedListAdapter.r();
        this.X0();
    }

    private void Z0(p1[][] p1Array) {
        this.V = new t0();
        this.W = new i2();
        this.X = new m1();
        p1Array[0] = new p1[]{new android.ext.o0(), this.W, new EditorListener(), new p0(this, false), this.V, new r0(this), new o2(), new q0(this), new s0(this), new d0(), this.X, new m0(this), new d2(), new l0(this), new k0(this), new o0(this), new j0(this), new y2(), new w1(), new OffsetCalculator(), this.H, new p1(this, 2131296978, 2130968653){
            final MainService f;
            {
                this.f = mainService;
                super(n3, n4);
            }

            @Override
            public void onClick(View view) {
                Tools.H1(2131296986);
                this.f.t();
                this.f.onLongClick(null);
            }
        }, new n0(this)};
        this.G.setAdapter((ListAdapter)new AddressArrayAdapter(this.s0));
        this.G.setOnItemClickListener((AdapterView.OnItemClickListener)new EditorListener());
        this.G.setOnItemLongClickListener((AdapterView.OnItemLongClickListener)new ItemContextMenu(1));
        new FastScrollerFix(this.G);
        this.b1();
    }

    private static void d(List list, String string2) {
        if (string2 != null && string2.length() != 0) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!((String)iterator.next()).equals(string2)) continue;
                return;
            }
            list.add(string2);
        }
    }

    private static void f(List list, File file) {
        if (file == null) {
            return;
        }
        MainService.g(list, file.getAbsolutePath());
    }

    private static void g(List list, String string2) {
        if (string2 != null && string2.length() != 0) {
            if (string2.contains("/emulated/0")) {
                MainService.d(list, string2.replace("/emulated/0", "/emulated/legacy"));
            }
            MainService.d(list, string2);
        }
    }

    private String i(String string2) {
        z1.d d4 = this.v0;
        CharSequence charSequence = string2;
        if (d4 != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("\n\n");
            ((StringBuilder)charSequence).append(d4.b);
            ((StringBuilder)charSequence).append("\n[");
            ((StringBuilder)charSequence).append(d4.c);
            ((StringBuilder)charSequence).append("]");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }

    private void j1() {
        context.unregisterComponentCallbacks(MainService.A());
    }

    private void k() {
        if (this.n == null) {
            return;
        }
        if (this.T || (Config.B & 4) != 0 && this.h.e()) {
            this.y0(false);
        }
        this.n1();
    }

    public static void t0(int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onTrimMemory: ");
        stringBuilder.append(n3);
        e1.p(stringBuilder.toString());
        if (instance == null) {
            return;
        }
        b2.a();
        z1.g();
        instance.w(n3);
    }

    boolean A0(byte by) {
        if (this.R) {
            this.Q();
            this.i.L0(by, (byte)1);
            this.R = false;
            this.n1();
            return true;
        }
        return false;
    }

    public long B(long l3, int n3) {
        this.Q();
        return this.i.Q(l3, n3);
    }

    boolean B0(byte by, boolean bl) {
        if (!bl && this.n == null) {
            return false;
        }
        this.Q();
        this.i.L0(by, (byte)(this.R ? 1 : 0));
        this.R ^= true;
        this.n1();
        return true;
    }

    FloatPanel C(String object, int n3, int n4, int n5, int n6) {
        object = new FloatPanel(this, context, (String)object, n3, n4){
            final String p;
            final int q;
            final int r;
            final MainService s;
            {
                this.s = mainService;
                this.p = string2;
                this.q = n3;
                this.r = n4;
                super(context);
            }

            @Override
            protected boolean f() {
                return true;
            }

            @Override
            protected int getDefX() {
                return this.q;
            }

            @Override
            protected int getDefY() {
                return this.r;
            }

            @Override
            protected String getPrefName() {
                return this.p;
            }
        };
        android.fix.ImageButton imageButton = new android.fix.ImageButton(context);
        imageButton.setImageResource(n6);
        imageButton.setKeepScreenOn(true);
        imageButton.setId(n5);
        imageButton.setOnClickListener(instance);
        object.addView((View)imageButton);
        return object;
    }

    boolean C0(boolean bl) {
        bl = this.B0((byte)0, bl);
        c2 c22 = MainService.instance.f;
        if (c22 != null) {
            c22.write("gg.processToggle()\n");
        }
        return bl;
    }

    void D0(boolean bl) {
        if (bl || !this.i0.b()) {
            ++this.A;
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
            this.D0(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Notification F(boolean bl, boolean bl2) {
        Context context;
        Context context2;
        String string2;
        PendingIntent pendingIntent;
        block13: {
            Throwable throwable2;
            block12: {
                int n3;
                block11: {
                    pendingIntent = w2.b(0);
                    n3 = !(m2.a ? this.n == null : this.n == null || android.ext.r.n == null || !android.ext.r.n.x()) ? 2131296678 : 2131296959;
                    string2 = b2.f(n3);
                    n3 = Build.VERSION.SDK_INT;
                    try {
                        context = context2 = MainService.context.getApplicationContext();
                        if (!bl2) break block11;
                        context = Config.a(context2);
                    }
                    catch (Throwable throwable2) {
                        break block12;
                    }
                }
                context2 = new Notification.Builder(context);
                context2 = context2.setContentTitle((CharSequence)string2).setContentText((CharSequence)"").setContentIntent(pendingIntent).setAutoCancel(false).setOngoing(true);
                if (bl) {
                    context2.setSmallIcon(2130968633);
                    String string3 = b2.f(2131296926);
                    context = w2.b(1);
                    if (n3 >= 23) {
                        l1.a();
                        context = k1.a(j1.a(Tools.C0(), 2130968593), string3, (PendingIntent)context);
                    } else {
                        context = new Notification.Action.Builder(2130968593, (CharSequence)string3, (PendingIntent)context);
                    }
                    context2.addAction(context.build());
                }
                context = context2.build();
                break block13;
            }
            e1.a(throwable2);
            context = null;
        }
        context2 = context;
        if (context == null) {
            context2 = new Notification();
            if (bl) {
                try {
                    context2.icon = 2130968633;
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
            }
            context2.tickerText = string2;
            context2.contentIntent = pendingIntent;
            try {
                Notification.class.getMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class).invoke((Object)context2, MainService.context.getApplicationContext(), string2, "", pendingIntent);
            }
            catch (Throwable throwable) {
                e1.s("Method not found", throwable);
            }
        }
        context2.flags = 34;
        return context2;
    }

    public void F0() {
        Runnable runnable = this.B0;
        Handler handler = n2.d();
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        } else {
            this.B0 = runnable = new Runnable(this){
                final MainService a;
                {
                    this.a = mainService;
                }

                @Override
                public void run() {
                    this.a.E0();
                }
            };
        }
        handler.postDelayed(runnable, 500L);
    }

    public double G() {
        return this.i.Z();
    }

    public int H() {
        return this.m.getCurrentTab();
    }

    void H0(Object object) {
        int n3;
        boolean bl = object instanceof d.e;
        if (bl) {
            d.e e4 = (d.e)object;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            int n4 = e4.l();
            for (n3 = 0; n3 < n4; ++n3) {
                if (!e4.a(n3) || !((object = (h2)e4.n(n3)) instanceof h2)) continue;
                arrayList.add(object);
            }
            this.t0.l(arrayList);
        } else if (object instanceof d.a) {
            d.a a4 = (d.a)object;
            object = new ArrayList();
            int n5 = a4.i();
            for (n3 = 0; n3 < n5; ++n3) {
                if (!a4.c(n3)) continue;
                object.add(a4.f(n3, null));
            }
            this.i.j0((List)object);
            this.D0(false);
        }
    }

    String I() {
        int n3;
        Object object = new ArrayList();
        Object object2 = Tools.M0();
        Object object3 = object2.getString("temp-path", null);
        int n4 = 0;
        if (object3 != null) {
            if ("/bypass".equals(object3)) {
                android.ext.f0.v = true;
            }
            if (((String)object3).length() >= 2 && ((String)object3).charAt(0) == '/') {
                MainService.g(object, (String)object3);
            } else {
                object2.edit().remove("temp-path").commit();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Removed bad path: ");
                ((StringBuilder)object2).append((String)object3);
                e1.i(((StringBuilder)object2).toString());
            }
        }
        try {
            MainService.f(object, context.getExternalFilesDir(null));
        }
        catch (Throwable throwable) {
            e1.l("Fail get path", throwable);
        }
        object3 = context.getExternalFilesDirs(null);
        int n5 = ((File[])object3).length;
        for (n3 = 0; n3 < n5; ++n3) {
            try {
                MainService.f(object, object3[n3]);
                continue;
            }
            catch (Throwable throwable) {
                e1.l("Fail get path", throwable);
                break;
            }
        }
        try {
            MainService.f(object, context.getExternalCacheDir());
        }
        catch (Throwable throwable) {
            e1.l("Fail get path", throwable);
        }
        object3 = context.getExternalCacheDirs();
        n5 = ((File[])object3).length;
        for (n3 = n4; n3 < n5; ++n3) {
            try {
                MainService.f(object, object3[n3]);
                continue;
            }
            catch (Throwable throwable) {
                e1.l("Fail get path", throwable);
                break;
            }
        }
        try {
            MainService.f(object, Environment.getExternalStorageDirectory());
        }
        catch (Throwable throwable) {
            e1.l("Fail get path", throwable);
        }
        MainService.g(object, "/sdcard");
        try {
            MainService.f(object, Tools.p0());
        }
        catch (Throwable throwable) {
            e1.l("Fail get path", throwable);
        }
        try {
            MainService.f(object, Tools.b0());
        }
        catch (Throwable throwable) {
            e1.l("Fail get path", throwable);
        }
        MainService.g(object, "/data");
        object3 = new StringBuilder();
        object = object.iterator();
        while (object.hasNext()) {
            object2 = (String)object.next();
            if (object2 == null || "".equals(object2 = ((String)object2).trim())) continue;
            if (((StringBuilder)object3).length() > 0) {
                ((StringBuilder)object3).append('|');
            }
            ((StringBuilder)object3).append((String)object2);
        }
        return ((StringBuilder)object3).toString();
    }

    public void J(long l3) {
        this.K(l3, 0);
    }

    public void K(long l3, int n3) {
        this.N.M(l3, n3);
        if (this.f0 == this.b0) {
            Tools.s((View)this.P);
        } else {
            this.m.setCurrentTab(3);
        }
    }

    public void K0() {
        e1.d("***");
        this.k0.j();
        this.o1(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void L(Long l3, String string2, CharSequence charSequence) {
        android.ext.y0.b(string2, 1);
        int n3 = string2.length();
        long l4 = 0L;
        int n4 = 0;
        while (true) {
            int n5;
            block10: {
                long l5;
                block9: {
                    Object object2;
                    String string3;
                    if (n4 >= n3) {
                        this.M0(l3, l4);
                        this.O.a(l4, charSequence);
                        this.J(l4);
                        return;
                    }
                    int n6 = n4 + 1;
                    n5 = string2.indexOf(45, n6);
                    int n7 = string2.indexOf(43, n6);
                    n6 = n5;
                    if (n7 != -1) {
                        n6 = n5 != -1 && n5 < n7 ? n5 : n7;
                    }
                    n5 = n6;
                    if (n6 == -1) {
                        n5 = n3;
                    }
                    if ((n6 = (string3 = string2.substring(n4, n5).trim()).length()) > 0) {
                        for (Object object2 : RegionList.getList()) {
                            String string4 = ((RegionList.b)object2).d;
                            if (string4 == null || string4.length() < n6 || !string4.endsWith(string3) || string4.length() != string3.length() && string4.charAt(string4.length() - string3.length() - 1) != '/') continue;
                            l5 = ((RegionList.b)object2).b;
                            break block9;
                        }
                    }
                    object2 = string3;
                    if (string3.endsWith("h")) {
                        object2 = string3.substring(0, string3.length() - 1);
                    }
                    try {
                        l5 = t1.r((String)object2, 16);
                    }
                    catch (Throwable throwable) {
                        e1.g("Failed parse", throwable);
                        break block10;
                    }
                }
                l4 += l5;
            }
            n4 = n5;
        }
    }

    void L0(Object object, android.ext.d d4) {
        int n3 = 0;
        int n4 = 0;
        boolean bl = d4 != null;
        if (!bl) {
            d4 = new android.ext.d();
        }
        android.ext.d d5 = this.u0;
        d.a a4 = new d.a();
        if (object instanceof d.a) {
            d.a a5 = (d.a)object;
            object = new android.ext.c();
            n3 = a5.i();
            while (n4 < n3) {
                if (a5.c(n4)) {
                    a5.f(n4, (android.ext.c)object);
                    d5.a(((android.ext.c)object).a, ((android.ext.c)object).c, a4);
                    if (a4.b) {
                        d4.c(((android.ext.c)object).a, ((android.ext.c)object).c, a4.a);
                    }
                }
                ++n4;
            }
        } else if (object instanceof d.e) {
            object = (d.e)object;
            int n5 = ((d.e)object).l();
            for (n4 = n3; n4 < n5; ++n4) {
                h2 h22;
                if (!((d.e)object).a(n4) || !((h22 = (h2)((d.e)object).n(n4)) instanceof h2)) continue;
                d5.a(h22.a, h22.c, a4);
                if (!a4.b) continue;
                d4.c(h22.a, h22.c, a4.a);
            }
        }
        if (!bl) {
            d4.d();
        }
    }

    public void O() {
        c2 c22 = this.f;
        if (c22 != null) {
            c22.e();
        }
    }

    void O0(int n3, int n4) {
        this.l0 = n3;
        this.m0 = n4;
    }

    public void P() {
        Script script = this.b;
        if (script != null) {
            script.w3();
        }
    }

    public void P0(w w3) {
        this.N.G(w3);
    }

    void Q() {
        this.R((byte)0);
    }

    public void Q0(z1.d d4) {
        Comparable comparable = this.v0;
        boolean bl = comparable == null || d4 == null || ((z1.d)comparable).f != d4.f;
        if (bl) {
            P0 = true;
            this.J0();
        }
        Config.k();
        this.v0 = d4;
        Config.h();
        this.x0.o();
        if (d4 != null) {
            comparable = Tools.R1(d4.e);
            this.p.setImageDrawable((Drawable)comparable);
            if (d4.e == null) {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append("setProcessInfo icon is null: ");
                ((StringBuilder)comparable).append(d4);
                e1.i(((StringBuilder)comparable).toString());
            }
            this.s.setText((CharSequence)d4.toString());
            comparable = Tools.R1(d4.e);
            this.j.y((Drawable)comparable);
            this.i.D0(d4.f, d4.c, d4.d);
        }
        this.n0.f();
        this.o0.f();
        this.k();
        if (bl) {
            this.E0();
        }
    }

    void R(byte by) {
        if (this.j0) {
            this.r(false);
            Comparable comparable = this.v0;
            if (comparable != null) {
                this.i.C0(by, ((z1.d)comparable).f, ((z1.d)comparable).c, ((z1.d)comparable).d);
                this.j0 = false;
                this.q.setVisibility(0);
                String string2 = this.g0.getText().toString();
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append(b2.f(2131297084));
                ((StringBuilder)comparable).append(' ');
                ((StringBuilder)comparable).append((Object)this.i.a0());
                if (!string2.startsWith(((StringBuilder)comparable).toString())) {
                    n2.d().postDelayed(new Runnable(this){
                        final MainService a;
                        {
                            this.a = mainService;
                        }

                        /*
                         * Enabled force condition propagation
                         * Lifted jumps to return sites
                         */
                        @Override
                        public void run() {
                            try {
                                this.a.i.K0((byte)2);
                                return;
                            }
                            catch (Throwable throwable) {
                                return;
                            }
                        }
                    }, (long)(Tools.a.nextInt(300000) + 180000));
                }
            }
        }
    }

    void R0(boolean bl) {
        boolean bl2 = this.d != null;
        if (bl == bl2) {
            return;
        }
        n2.i(new Runnable(this, bl){
            final boolean a;
            final MainService b;
            {
                this.b = mainService;
                this.a = bl;
            }

            @Override
            public void run() {
                boolean bl = this.a;
                if (bl) {
                    this.b.e = false;
                }
                MainService mainService = this.b;
                FloatPanel floatPanel = bl ? mainService.C("script-ui-button", 0, 50, 2130968657, 2130968657) : null;
                mainService.d = floatPanel;
                this.b.h0.o();
            }
        });
    }

    public void S0(byte by, double d4) {
        this.T0(by, d4);
        this.k0.i(d4);
    }

    public void T() {
        e1.d(">>");
        this.k0.k();
        this.o1(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    void U() {
        View view = this.f0;
        if (view == this.Z) {
            view = this.G;
        } else if (view == this.a0) {
            view = this.L;
        } else {
            if (view != this.b0) return;
            view = this.M;
        }
        this.W((ListView)view);
    }

    public void U0(int n3) {
        this.m.setCurrentTab(n3);
    }

    void V(ListAdapter listAdapter) {
        if (listAdapter == null) {
            return;
        }
        n2.i(new Runnable(this, listAdapter){
            final ListAdapter a;
            final MainService b;
            {
                this.b = mainService;
                this.a = listAdapter;
            }

            @Override
            public void run() {
                ListAdapter listAdapter = this.a;
                if (listAdapter instanceof ConfigListAdapter) {
                    ((ConfigListAdapter)listAdapter).x();
                }
                if ((listAdapter = this.a) instanceof BaseAdapter) {
                    try {
                        ((BaseAdapter)listAdapter).notifyDataSetChanged();
                    }
                    catch (NoSuchMethodError noSuchMethodError) {
                        e1.a(noSuchMethodError);
                    }
                }
            }
        });
    }

    void W(ListView listView) {
        if (listView == null) {
            return;
        }
        this.V(listView.getAdapter());
    }

    public void X(byte by, String string2) {
        if (by == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("notifyScript client: ");
            stringBuilder.append(string2);
            e1.d(stringBuilder.toString());
            return;
        }
        Script script = this.b;
        if (script != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("notifyScript: ");
            stringBuilder.append(by);
            stringBuilder.append("; ");
            stringBuilder.append(string2);
            e1.d(stringBuilder.toString());
            script.c3(by, string2);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("notifyScript no script: ");
            stringBuilder.append(by);
            stringBuilder.append("; ");
            stringBuilder.append(string2);
            e1.d(stringBuilder.toString());
        }
    }

    public void X0() {
        try {
            n2.d().post(this.A0);
        }
        catch (Throwable throwable) {
            e1.s("Failed post timer", throwable);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void Z() {
        block76: {
            block77: {
                block70: {
                    block75: {
                        block74: {
                            e1.d("Service onCreate");
                            this.n0 = new TimersEditor("TE", "timers", 44, MainService.L0, 0);
                            this.o0 = new TimersEditor("RE", "rand", 19, MainService.M0, 1);
                            this.m = var9_1 = (TabHost)a.d.f(2131099677, null);
                            var9_1.setFocusableInTouchMode(true);
                            var6_2 /* !! */  = (TextView)var9_1.findViewById((new int[]{2131034242})[0]);
                            var6_2 /* !! */ .setText((CharSequence)b2.g(var6_2 /* !! */ .getText().toString().trim()));
                            var6_2 /* !! */  = new ZipFile(MainService.context.getPackageResourcePath());
                            var8_7 = Tools.removeNewLinesChars("zlqgrz&dvvhwv2&uhv2udz2&fodvvhv51gh{").split("#");
                            var3_9 = ((String[])var8_7).length;
                            var11_10 = Tools.removeNewLinesChars("uhv2udz2|gz");
                            var10_11 = var6_2 /* !! */ .entries();
                            this.r = var9_1.findViewById(2131034292);
                            var2_12 = 2131034113;
                            block46: while (true) {
                                var7_15 /* !! */  = var6_2 /* !! */ ;
                                if (!var10_11.hasMoreElements()) break;
                                var7_15 /* !! */  = var6_2 /* !! */ ;
                                var12_19 = var10_11.nextElement();
                                var1_13 = 0;
                                while (true) {
                                    block73: {
                                        block72: {
                                            block71: {
                                                block69: {
                                                    if (var1_13 >= var3_9) continue block46;
                                                    var7_15 /* !! */  = var6_2 /* !! */ ;
                                                    try {
                                                        if (this.o != null) break block69;
                                                        var7_15 /* !! */  = var6_2 /* !! */ ;
                                                    }
                                                    catch (Throwable var6_3) {
                                                        var6_2 /* !! */  = var7_15 /* !! */ ;
                                                        break block70;
                                                    }
                                                    this.o = (ImageView)var9_1.findViewById(2131034131);
                                                }
                                                var7_15 /* !! */  = var6_2 /* !! */ ;
                                                var4_14 = var2_12;
                                                var6_2 /* !! */  = var7_15 /* !! */ ;
                                                var2_12 = (int)(var4_14 ^ var12_19.getSize());
                                                var6_2 /* !! */  = var7_15 /* !! */ ;
                                                if (this.p != null) break block71;
                                                var6_2 /* !! */  = var7_15 /* !! */ ;
                                                this.p = (ImageView)var9_1.findViewById(2131034128);
                                            }
                                            var6_2 /* !! */  = var7_15 /* !! */ ;
                                            var2_12 = (int)((long)var2_12 ^ var12_19.getSize());
                                            var6_2 /* !! */  = var7_15 /* !! */ ;
                                            if (this.q != null) break block72;
                                            var6_2 /* !! */  = var7_15 /* !! */ ;
                                            this.q = (ImageView)var9_1.findViewById(2131034407);
                                        }
                                        var6_2 /* !! */  = var7_15 /* !! */ ;
                                        var2_12 *= -var12_19.getName().indexOf((String)var8_7[var1_13]) * var12_19.getName().indexOf(var11_10) - var12_19.getName().indexOf(var11_10) - 1;
                                        var6_2 /* !! */  = var7_15 /* !! */ ;
                                        if (this.y != null) break block73;
                                        var6_2 /* !! */  = var7_15 /* !! */ ;
                                        this.y = (TextView)var9_1.findViewById(2131034264);
                                    }
                                    ++var1_13;
                                    var6_2 /* !! */  = var7_15 /* !! */ ;
                                }
                                break;
                            }
                            var7_15 /* !! */  = var6_2 /* !! */ ;
                            var6_2 /* !! */  = var7_15 /* !! */ ;
                            this.l = (WindowManager)this.b(var8_7[0]);
                            var6_2 /* !! */  = var7_15 /* !! */ ;
                            this.s = (TextView)var9_1.findViewById(2131034129);
                            var6_2 /* !! */  = var7_15 /* !! */ ;
                            if (2131034128 / var2_12 == 2131034344) break block74;
                            var6_2 /* !! */  = var7_15 /* !! */ ;
                            this.P = (ImageButton)var9_1.findViewById(2131034115);
                            var6_2 /* !! */  = var7_15 /* !! */ ;
                            this.Q = (ImageButton)var9_1.findViewById(2131034121);
                            var6_2 /* !! */  = var7_15 /* !! */ ;
                            var8_7 = var9_1.findViewById(2131034334);
lbl93:
                            // 2 sources

                            while (true) {
                                var6_2 /* !! */  = var7_15 /* !! */ ;
                                this.Y = (ListView)var8_7;
                                break block75;
                                break;
                            }
                        }
                        var6_2 /* !! */  = var7_15 /* !! */ ;
                        this.P = (ImageButton)var9_1.findViewById(2131034201);
                        var6_2 /* !! */  = var7_15 /* !! */ ;
                        this.Q = (ImageButton)var9_1.findViewById(2131034151);
                        var6_2 /* !! */  = var7_15 /* !! */ ;
                        var8_7 = var9_1.findViewById(2131034161);
                        ** continue;
                    }
                    var6_2 /* !! */  = var7_15 /* !! */ ;
                    var8_7 = (ListView)var9_1.findViewById(2131034122);
                    var6_2 /* !! */  = var7_15 /* !! */ ;
                    this.G = var8_7;
                    var6_2 /* !! */  = var7_15 /* !! */ ;
                    var8_7.setEmptyView(var9_1.findViewById(2131034345));
                    var6_2 /* !! */  = var7_15 /* !! */ ;
                    ** GOTO lbl132
                }
lbl122:
                // 2 sources

                while (true) {
                    var7_15 /* !! */  = var6_2 /* !! */ ;
                    try {
                        this.G = (ListView)var9_1.findViewById(2131034120);
                        var7_15 /* !! */  = var6_2 /* !! */ ;
                    }
                    catch (Throwable var6_4) {
                        var6_2 /* !! */  = var7_15 /* !! */ ;
                        break block77;
                    }
                    this.y = (TextView)var9_1.findViewById(2131034150);
lbl132:
                    // 2 sources

                    var7_15 /* !! */  = var6_2 /* !! */ ;
                    var8_7 = var10_11.nextElement();
                    var7_15 /* !! */  = var6_2 /* !! */ ;
                    this.p = (ImageView)var9_1.findViewById(2131034219);
                    var7_15 /* !! */  = var6_2 /* !! */ ;
                    this.o = (ImageView)var9_1.findViewById(2131034177);
                    var7_15 /* !! */  = var6_2 /* !! */ ;
                    this.y = (TextView)var9_1.findViewById(2131034185);
                    break block76;
                    break;
                }
                catch (Throwable var7_16) {}
                break block77;
                catch (Throwable var6_5) {
                    var6_2 /* !! */  = null;
                }
            }
            this.C = (TextView)var9_1.findViewById(2131034344);
            this.D[0] = (WrapLayout)var9_1.findViewById(2131034399);
            this.D[1] = (WrapLayout)var9_1.findViewById(2131034393);
            this.D[2] = (WrapLayout)var9_1.findViewById(2131034325);
            this.E = var9_1.findViewById(2131034429);
            this.F = (ImageView)var9_1.findViewById(2131034336);
        }
        if (var6_2 /* !! */  != null) {
            try {
                var6_2 /* !! */ .close();
            }
            catch (Throwable var6_6) {
                e1.s("Failed close apk", var6_6);
            }
        }
        this.t = (TextView)var9_1.findViewById(2131034262);
        this.u = (TextView)var9_1.findViewById(2131034445);
        this.v = var9_1.findViewById(2131034291);
        this.w = (TextView)var9_1.findViewById(2131034387);
        this.x = var9_1.findViewById(2131034220);
        this.z = var9_1.findViewById(2131034290);
        Config.h();
        this.l1();
        this.Z = var9_1.findViewById(2131034395);
        this.a0 = var9_1.findViewById(2131034389);
        this.b0 = var9_1.findViewById(2131034319);
        this.c0 = var9_1.findViewById(2131034184);
        this.d0 = (TextView)var9_1.findViewById(2131034397);
        this.e0 = (TextView)var9_1.findViewById(2131034391);
        var9_1.setup();
        this.N("settings", 2131034184, 2131034203);
        this.N("search", 2131034395, 2131034398);
        this.N("saved", 2131034389, 2131034392);
        this.N("memory", 2131034319, 2131034323);
        var7_15 /* !! */  = var9_1.getTabWidget();
        for (var2_12 = 0; var2_12 < var7_15 /* !! */ .getTabCount(); ++var2_12) {
            var6_2 /* !! */  = var7_15 /* !! */ .getChildTabViewAt(var2_12);
            if (var2_12 != 0) {
                if (var2_12 != 1) {
                    if (var2_12 != 2) {
                        if (var2_12 != 3) {
                            var6_2 /* !! */  = null;
                            var1_13 = 0;
                        } else {
                            var1_13 = 2131034322;
                        }
                    } else {
                        var1_13 = 2131034390;
                    }
                } else {
                    var1_13 = 2131034396;
                }
            } else {
                var1_13 = 2131034202;
            }
            if (!(var6_2 /* !! */  instanceof ViewGroup)) continue;
            var6_2 /* !! */  = (ViewGroup)var6_2 /* !! */ ;
            block51: for (var3_9 = 0; var3_9 < var6_2 /* !! */ .getChildCount(); ++var3_9) {
                var8_7 = var6_2 /* !! */ .getChildAt(var3_9);
                ** if (var8_7 == null) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    var8_7.setVisibility(8);
lbl208:
                    // 2 sources

                    continue block51;
                }
lbl-1000:
                // 1 sources

                {
                }
            }
            if (var6_2 /* !! */ .getLayoutParams() instanceof LinearLayout.LayoutParams) {
                var6_2 /* !! */ .setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(0, -2, 1.0f));
            }
            var6_2 /* !! */ .setMinimumWidth(0);
            var6_2 /* !! */ .setMinimumHeight(0);
            var6_2 /* !! */ .setPadding(0, 0, 0, 0);
            var8_7 = var9_1.findViewById(var1_13);
            var6_2 /* !! */ .addView(Tools.O0((View)var8_7));
            var6_2 /* !! */  = var8_7.getLayoutParams();
            if (var6_2 /* !! */  instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams)var6_2 /* !! */ ).gravity = 17;
            }
            if (var6_2 /* !! */  instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams)var6_2 /* !! */ ).addRule(13, -1);
            }
            var8_7.setLayoutParams((ViewGroup.LayoutParams)var6_2 /* !! */ );
        }
        var7_15 /* !! */ .setMinimumWidth(0);
        var7_15 /* !! */ .setMinimumHeight(0);
        this.J = var9_1.findViewById(2131034326);
        this.K = (ImageView)var9_1.findViewById(2131034327);
        var6_2 /* !! */  = (ListView)var9_1.findViewById(2131034388);
        this.L = var6_2 /* !! */ ;
        var6_2 /* !! */ .setEmptyView(var9_1.findViewById(2131034243));
        this.M = (ListView)var9_1.findViewById(2131034317);
        this.P = (ImageButton)var9_1.findViewById(2131034307);
        this.Q = (ImageButton)var9_1.findViewById(2131034356);
        this.Y = (ListView)var9_1.findViewById(2131034181);
        this.g0 = (TextView)var9_1.findViewById(2131034417);
        this.j0 = true;
        this.q.setVisibility(4);
        var9_1.setOnTabChangedListener(new TabHost.OnTabChangeListener(this){
            final MainService a;
            {
                this.a = mainService;
            }

            public void onTabChanged(String object) {
                object = instance;
                int n3 = ((MainService)object).H();
                View view = ((MainService)object).r;
                int n4 = 8;
                boolean bl = false;
                int n5 = n3 >= 1 ? 0 : 8;
                view.setVisibility(n5);
                view = ((MainService)object).s;
                n5 = n3 != 3 ? 0 : 8;
                view.setVisibility(n5);
                view = ((MainService)object).z;
                n5 = n3 == 1 ? 0 : 8;
                view.setVisibility(n5);
                view = ((MainService)object).v;
                n5 = n3 == 3 ? 0 : 8;
                view.setVisibility(n5);
                view = ((MainService)object).w;
                n5 = n4;
                if (n3 == 2) {
                    n5 = 0;
                }
                view.setVisibility(n5);
                ((MainService)object).q1();
                ((MainService)object).f0 = ((MainService)object).m.getCurrentView();
                Tools.s((View)((MainService)object).P);
                ((MainService)object).p1();
                object = this.a.x0;
                if (object != null) {
                    if (n3 == 0) {
                        bl = true;
                    }
                    ((ConfigListAdapter)((Object)object)).l(bl);
                }
            }
        });
        var6_2 /* !! */  = new android.ext.q0(this);
        this.H = var6_2 /* !! */ ;
        this.z.setOnClickListener((View.OnClickListener)var6_2 /* !! */ );
        this.z.setTag((Object)this.H);
        var6_2 /* !! */  = new p1(this, 2131297081, 2130968639){
            final MainService f;
            {
                this.f = mainService;
                super(n3, n4);
            }

            @Override
            public void onClick(View view) {
                this.f.N.b();
            }
        };
        this.I = var6_2 /* !! */ ;
        this.u.setOnClickListener((View.OnClickListener)var6_2 /* !! */ );
        this.w.setOnClickListener((View.OnClickListener)this.I);
        this.g0.setOnClickListener((View.OnClickListener)this);
        var6_2 /* !! */  = null;
        this.h0 = (ShowApp)a.d.f(2131099686, null);
        this.Q.setOnClickListener((View.OnClickListener)this);
        var9_1.setCurrentTab(1);
        this.o.setOnClickListener((View.OnClickListener)this);
        try {
            var7_15 /* !! */  = (ActivityManager)this.b("activity");
            var6_2 /* !! */  = var7_15 /* !! */ ;
        }
        catch (Throwable var7_17) {
            e1.l("Failed get service activity", var7_17);
        }
        this.h = new j((ActivityManager)var6_2 /* !! */ , Tools.B0());
        this.i.N0();
        this.i.G();
        this.j = HotPoint.getInstance();
        this.k0 = new d1();
        android.ext.b0.j(this);
        Config.m(this.K);
        Config.m(this.o);
        Config.m(this.F);
        this.F.setOnClickListener((View.OnClickListener)this);
        var6_2 /* !! */  = MainService.J0;
        this.Z0((p1[][])var6_2 /* !! */ );
        this.Y0((p1[][])var6_2 /* !! */ );
        this.W0((p1[][])var6_2 /* !! */ );
        this.V0();
        for (var1_13 = 0; var1_13 < (var7_15 /* !! */  = this.D).length; ++var1_13) {
            var7_15 /* !! */  = var7_15 /* !! */ [var1_13];
            var7_15 /* !! */ .removeAllViews();
            for (var2_12 = 0; var2_12 < ((View)(var8_7 = var6_2 /* !! */ [var1_13])).length; ++var2_12) {
                var8_7 = var8_7[var2_12];
                var8_7.g(var1_13, var2_12);
                var7_15 /* !! */ .addView((View)var8_7.b(true));
            }
        }
        this.P.setOnClickListener((View.OnClickListener)this);
        var7_15 /* !! */  = new p1(this, "tmp"){
            final MainService f;
            {
                this.f = mainService;
                super(string2);
            }

            @Override
            public void onClick(View view) {
            }
        };
        this.J.setTag((Object)var7_15 /* !! */ );
        this.K.setTag((Object)var7_15 /* !! */ );
        var6_2 /* !! */  = new View.OnClickListener(this, (p1[][])var6_2 /* !! */ ){
            private ListAdapter[] a;
            final p1[][] b;
            final MainService c;
            {
                this.c = mainService;
                this.b = p1Array;
                this.a = new ListAdapter[p1Array.length];
            }

            public void onClick(View listAdapterArray) {
                int n3 = this.c.f0.getId();
                if (n3 != 2131034319) {
                    if (n3 != 2131034389) {
                        if (n3 != 2131034395) {
                            return;
                        }
                        n3 = 106 - "kwws=22jdphjxdugldq1qhw2grzqordg".charAt(11);
                    } else {
                        n3 = 101 - "kwws=22jdphjxdugldq1qhw2iruxp2wrslf25<;940grqdwh2".charAt(13);
                    }
                } else {
                    n3 = 115 - "kwws=22jdphjxdugldq1qhw2khos2".charAt(20);
                }
                listAdapterArray = this.a;
                if (listAdapterArray[n3] == null) {
                    listAdapterArray[n3] = new ArrayAdapter(this, context, this.b[n3]){
                        final m b;
                        {
                            this.b = m3;
                            super(context, p1Array);
                        }

                        @Override
                        public View getView(int n3, View view, ViewGroup viewGroup) {
                            if ((view = (TextView)(viewGroup = super.getView(n3, view, viewGroup)).findViewById(16908308)) != null) {
                                Tools.D1((TextView)view, 2131361799);
                            }
                            return viewGroup;
                        }
                    };
                }
                android.ext.f.o(android.ext.f.c(Tools.k0()).setAdapter(this.a[n3], new DialogInterface.OnClickListener(this, n3){
                    final int a;
                    final m b;
                    {
                        this.b = m3;
                        this.a = n3;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        m m3 = this.b;
                        m3.b[this.a][n3].e(m3.c.J);
                        Tools.D(dialogInterface);
                    }
                }));
            }
        };
        this.J.setOnClickListener((View.OnClickListener)var6_2 /* !! */ );
        this.K.setOnClickListener((View.OnClickListener)var6_2 /* !! */ );
        this.p.setOnClickListener((View.OnClickListener)this);
        this.q.setOnClickListener((View.OnClickListener)this);
        this.s.setOnClickListener((View.OnClickListener)this);
        this.G0();
        var6_2 /* !! */  = Tools.M0();
        if (var6_2 /* !! */ .contains("mem-fail")) {
            Config.b((int)2131034182).d = 0;
            Config.k();
            var6_2 /* !! */ .edit().remove("mem-fail").commit();
        }
        this.i.B0(this.I());
        var6_2 /* !! */  = new DataSetObserver(this){
            final MainService a;
            {
                this.a = mainService;
            }

            public void onChanged() {
                super.onChanged();
                this.a.k1();
            }

            public void onInvalidated() {
                super.onInvalidated();
                this.a.k1();
            }
        };
        this.G.getAdapter().registerDataSetObserver((DataSetObserver)var6_2 /* !! */ );
        this.L.getAdapter().registerDataSetObserver((DataSetObserver)var6_2 /* !! */ );
        this.M.getAdapter().registerDataSetObserver((DataSetObserver)var6_2 /* !! */ );
        this.k1();
        this.l1();
        this.i0 = new x();
        MainService.I0 = true;
        this.q1();
        this.M();
        return;
        catch (Throwable var7_18) {
            ** continue;
        }
        catch (ArrayIndexOutOfBoundsException var8_8) {
        }
        ** while (true)
    }

    public void a0() {
        this.s();
        this.h1();
    }

    boolean a1() {
        this.j.t((byte)1, -1L, 1L, 0, 1, "");
        return this.i0.e(true);
    }

    public void b0() {
        e1.d("Service onDestroy");
        this.m1(true);
        this.j1();
        f1.o();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void b1() {
        void var6_19;
        void var5_11;
        void var5_8;
        CharSequence charSequence;
        StringBuilder stringBuilder;
        Object var8_2;
        block16: {
            void var6_16;
            boolean bl;
            block15: {
                int n3;
                long l3;
                block14: {
                    block11: {
                        void var5_4;
                        block13: {
                            block12: {
                                l3 = this.p0;
                                var8_2 = null;
                                if (l3 != 0L) break block11;
                                if (!this.r0) break block12;
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(b2.f(2131296944));
                                stringBuilder2.append('\n');
                                n3 = 2131296981;
                                break block13;
                            }
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(b2.f(2131296821));
                            if (Config.i != -1) {
                                stringBuilder3.append('\n');
                                stringBuilder3.append(b2.f(2131297023));
                            }
                            StringBuilder stringBuilder4 = stringBuilder3;
                            if (this.q0) break block14;
                            stringBuilder3.append('\n');
                            n3 = 2131297021;
                            StringBuilder stringBuilder5 = stringBuilder3;
                        }
                        var5_4.append(b2.f(n3));
                        break block14;
                    }
                    Object var5_7 = null;
                }
                n3 = this.s0.i();
                bl = android.ext.b0.k();
                stringBuilder = new StringBuilder();
                stringBuilder.append(" (");
                l3 = n3;
                stringBuilder.append(android.ext.i0.c(l3, 32));
                String string2 = "";
                if (bl) break block15;
                charSequence = string2;
                if (this.p0 == l3) break block16;
            }
            charSequence = new StringBuilder();
            if (bl) {
                String string3 = "*";
            }
            ((StringBuilder)charSequence).append((String)var6_16);
            ((StringBuilder)charSequence).append("/");
            ((StringBuilder)charSequence).append(android.ext.i0.c(this.p0, 32));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append(")");
        String string4 = stringBuilder.toString();
        if (var5_8 == null) {
            Object var5_9 = var8_2;
        } else {
            String string5 = var5_8.toString();
        }
        if (AddressArrayAdapter.d != 0) {
            CharSequence charSequence2 = Tools.x(string4, " ", n1.B(AddressArrayAdapter.d));
        }
        n2.i(new Runnable(this, (String)var5_11, (CharSequence)var6_19){
            final String a;
            final CharSequence b;
            final MainService c;
            {
                this.c = mainService;
                this.a = string2;
                this.b = charSequence;
            }

            @Override
            public void run() {
                CharSequence charSequence = this.a;
                if (charSequence != null) {
                    this.c.C.setText(charSequence);
                }
                if ((charSequence = this.b) != null) {
                    this.c.y.setText(charSequence);
                }
                this.c.x.setVisibility(8);
            }
        });
    }

    public void c0() {
        if (!I0) {
            return;
        }
        this.D0(false);
        this.c1();
    }

    void c1() {
        WrapLayout[] wrapLayoutArray = new StringBuilder();
        wrapLayoutArray.append("ServiceProxy showDialog: ");
        wrapLayoutArray.append((Object)this.n);
        e1.d(wrapLayoutArray.toString());
        if (this.n != null) {
            e1.g("Something going wrong", new RuntimeException("mainDialog != null"));
            this.n.dismiss();
        }
        this.n = new i1(context, (View)this.m);
        for (int i3 = 0; i3 < (wrapLayoutArray = this.D).length; ++i3) {
            wrapLayoutArray[i3].setFill(Config.g - 1);
        }
        n2.i(new Runnable(this){
            final MainService a;
            {
                this.a = mainService;
            }

            @Override
            public void run() {
                this.a.n.show();
                this.a.i0.e(false);
            }
        });
        this.h0.k();
        this.h.a(this.j0, null);
        this.j.e();
        this.k();
        this.i.L();
        if (!this.i0.b()) {
            this.E0();
            if (K0) {
                K0 = false;
                if (this.s0.i() == 0 && this.p0 != 0L) {
                    this.D0(false);
                }
                if (android.ext.f0.w) {
                    this.V.onClick(this.J);
                } else {
                    this.W.onClick(this.J);
                }
            }
        }
        this.l1();
        this.d1(null);
    }

    public void d0(int n3) {
        if (Config.w != 0 && n3 == Config.w) {
            n2.i(new Runnable(this){
                final MainService a;
                {
                    this.a = mainService;
                }

                @Override
                public void run() {
                    if (this.a.n == null) {
                        this.a.c0();
                    }
                }
            });
        }
    }

    public void d1(Runnable iterator) {
        if (iterator == null) {
            iterator = this.y0;
            this.y0 = new ArrayList();
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while (iterator.hasNext()) {
                Runnable runnable = (Runnable)iterator.next();
                try {
                    runnable.run();
                }
                catch (Throwable throwable) {
                    e1.s("Failed showScriptEnd", throwable);
                }
            }
            return;
        }
        if (this.n != null) {
            try {
                iterator.run();
            }
            catch (Throwable throwable) {
                e1.s("Failed showScriptEnd", throwable);
            }
        } else {
            this.y0.add(iterator);
        }
    }

    void e() {
        TextView textView = this.s;
        if (textView != null && this.v0 == null && this.i.b.h()) {
            textView.setText((CharSequence)b2.f(2131296754));
        }
        if ((textView = this.g0) != null) {
            String string2 = String.valueOf(' ');
            textView.setText(Tools.x(b2.f(2131297094 - string2.length() * 10), " ", this.i.a0(), string2.substring(0, 1), Config.b(2131034196 - string2.length() * 7).a(), string2.substring(0, 1), Integer.toString(Tools.L0(this.z()) * string2.length())));
        }
    }

    public void e0() {
        this.f0((byte)0);
    }

    void e1() {
        Object object = new StringBuilder();
        ((StringBuilder)object).append("startHotkeyDetection: ");
        ((StringBuilder)object).append((Object)this.j);
        e1.d(((StringBuilder)object).toString());
        object = this.j;
        if (object == null) {
            return;
        }
        ((FloatPanel)((Object)object)).m();
        this.i.L();
    }

    public void f0(byte by) {
        this.i.C(by);
        this.t0.i();
        this.D0(false);
        this.W(this.M);
        this.W(this.L);
    }

    public void f1(c2 c22) {
        this.O();
        this.f = c22;
        n2.i(new Runnable(this){
            final MainService a;
            {
                this.a = mainService;
            }

            @Override
            public void run() {
                MainService mainService = this.a;
                mainService.g = mainService.C("record-interrupt", 0, 0, 2131296884, 2130968654);
                this.a.h0.n();
            }
        });
    }

    public void g0() {
        View view = this.f0;
        if (view == this.Z || view == this.a0 || view == this.b0) {
            Tools.s(this.J);
        }
    }

    void g1() {
        Object object = new StringBuilder();
        ((StringBuilder)object).append("stopHotkeyDetection: ");
        ((StringBuilder)object).append((Object)this.j);
        e1.d(((StringBuilder)object).toString());
        object = this.j;
        if (object == null) {
            return;
        }
        ((FloatPanel)((Object)object)).e();
    }

    void h(long l3) {
        n2.i(new Runnable(this, l3){
            final long a;
            final MainService b;
            {
                this.b = mainService;
                this.a = l3;
            }

            /*
             * Enabled aggressive block sorting
             */
            @Override
            public void run() {
                StringBuilder stringBuilder;
                long l3 = this.a;
                if (-1024L < l3 && l3 <= 0L) {
                    AlertDialog.Builder builder = android.ext.f.b();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.f(2131296269));
                    stringBuilder.append(' ');
                    stringBuilder.append(-this.a);
                    stringBuilder = builder.setMessage((CharSequence)stringBuilder.toString());
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(android.ext.c.G(this.a, 4));
                    stringBuilder.append('h');
                    String string2 = stringBuilder.toString();
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this, string2){
                        final String a;
                        final l b;
                        {
                            this.b = l3;
                            this.a = string2;
                        }

                        public void onClick(DialogInterface dialogInterface, int n3) {
                            if (n3 != -3) {
                                if (n3 == -1) {
                                    instance.L(null, this.a, Tools.N1(2131296271));
                                }
                            } else {
                                Tools.z(this.a);
                            }
                        }
                    };
                    android.ext.y0.b(string2, 1);
                    AlertDialog.Builder builder = android.ext.f.b();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(Tools.N1(2131296271));
                    stringBuilder.append(": ");
                    stringBuilder.append(string2);
                    stringBuilder = builder.setMessage((CharSequence)stringBuilder.toString()).setPositiveButton((CharSequence)b2.f(2131296514), onClickListener).setNeutralButton((CharSequence)b2.f(2131296338), onClickListener);
                }
                android.ext.f.m(stringBuilder.setNegativeButton(b2.f(2131296836), null).create());
            }
        });
    }

    public void h0(CharSequence charSequence) {
        this.i0(charSequence, -1L, 1L, 0, 1, 0L);
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
        this.c();
    }

    public void i0(CharSequence charSequence, long l3, long l4, int n3, int n4, long l5) {
        StringBuilder stringBuilder;
        if (l3 > 0L && l4 != 0L) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(Tools.L1("%.2f", (double)l3 * 100.0 / (double)l4));
            stringBuilder.append(" %");
        } else {
            stringBuilder = null;
        }
        x x3 = this.i0;
        Object object = stringBuilder == null ? "" : stringBuilder.toString();
        x3.c(charSequence, l3, l4, n3, n4, l5, (String)object);
        if (stringBuilder != null) {
            stringBuilder.setLength(4);
            stringBuilder.append('%');
        }
        object = this.j;
        charSequence = stringBuilder == null ? "" : stringBuilder.toString();
        ((HotPoint)((Object)object)).t((byte)0, l3, l4, n3, n4, (String)charSequence);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i1() {
        Throwable throwable2;
        block7: {
            Object object;
            block5: {
                block6: {
                    if (m2.a) {
                        if (this.n == null) {
                            this.c0();
                            return;
                        }
                        this.t();
                        return;
                    }
                    try {
                        object = this.n;
                        if (object == null || android.ext.r.n == null || !android.ext.r.n.x()) break block5;
                        object = this.v0;
                        if (object == null) return;
                        String string2 = ((z1.d)object).c;
                        Intent intent = context.getPackageManager().getLaunchIntentForPackage(string2);
                        object = intent;
                        if (intent != null) break block6;
                        object = new Intent("android.intent.action.MAIN");
                        object.setPackage(string2);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                object.setFlags(131072);
                context.startActivity((Intent)object);
                return;
            }
            String string3 = context.getPackageName();
            Intent intent = context.getPackageManager().getLaunchIntentForPackage(string3);
            object = intent;
            if (intent == null) {
                object = android.ext.r.t();
                intent = new ComponentName(string3, (String)object);
                Tools.w1(300, (ComponentName)intent, 1);
                intent = new Intent("android.intent.action.MAIN");
                object = intent.setClassName(string3, (String)object);
            }
            object.setFlags(131072);
            context.startActivity((Intent)object);
            if (this.n != null) return;
            this.c0();
            return;
        }
        e1.s("bring to front fail", throwable2);
    }

    void j(int n3) {
        Tools.n(this.z(), n3);
        this.U();
    }

    public void j0(c2 c22) {
        n2.i(new Runnable(this){
            final MainService a;
            {
                this.a = mainService;
            }

            @Override
            public void run() {
                MainService mainService = this.a;
                mainService.g = null;
                mainService.h0.d();
            }
        });
        if (this.f == c22) {
            this.f = null;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void k0(int var1_1) {
        block25: {
            block32: {
                block24: {
                    block26: {
                        block27: {
                            block28: {
                                block29: {
                                    block30: {
                                        block31: {
                                            this.s();
                                            var4_2 = var1_1 <= 100;
                                            var3_3 = 2131296903;
                                            if (var1_1 == 1) break block26;
                                            if (var1_1 == 2) break block27;
                                            if (var1_1 == 3) break block28;
                                            var2_5 = var5_4 = 2131296719;
                                            if (var1_1 == 4) break block29;
                                            if (var1_1 == 9) break block30;
                                            if (var1_1 == 10) break block31;
                                            block2 : switch (var1_1) {
                                                default: {
                                                    var2_5 = 2131297058;
lbl14:
                                                    // 3 sources

                                                    while (true) {
                                                        var8_6 = null;
                                                        break block2;
                                                        break;
                                                    }
                                                }
                                                case 108: {
                                                    var8_6 = new StringBuilder();
                                                    var8_6.append(Tools.N1(2131297017));
                                                    var8_6.append(": ");
                                                    var8_6.append(64);
                                                    var8_6 = var8_6.toString();
                                                    var2_5 = 2131296417;
                                                    break;
                                                }
                                                case 107: {
                                                    var3_3 = 2131296979;
                                                    var8_6 = null;
                                                    var2_5 = 2131296979;
                                                    break;
                                                }
                                                case 106: {
                                                    var8_6 = new StringBuilder();
                                                    var8_6.append(b2.f(2131296410));
                                                    var8_6.append('\n');
                                                    var8_6.append(1);
                                                    var8_6.append(": ");
                                                    var8_6.append(b2.f(2131296411));
                                                    var8_6.append('\n');
                                                    var8_6.append(2);
                                                    var8_6.append(": ");
                                                    var8_6.append(b2.f(2131296412));
                                                    var8_6 = this.i(var8_6.toString());
                                                    var2_5 = 2131296409;
                                                    break;
                                                }
                                                case 105: {
                                                    if (!Config.C) ** GOTO lbl77
                                                    var2_5 = Tools.Y((String)Config.E).flags;
                                                    if ((var2_5 & 2) != 0) ** GOTO lbl77
                                                    try {
                                                        var8_6 = Tools.L1(b2.f(2131296819), new Object[]{Config.F, Config.F});
                                                    }
                                                    finally {
                                                        var2_5 = 2131296819;
                                                        ** GOTO lbl79
                                                    }
                                                    catch (Throwable var8_8) {
                                                        var2_5 = 2131296903;
                                                    }
                                                    var9_9 = new StringBuilder();
                                                    var9_9.append("Failed check vSpace: ");
                                                    var9_9.append(Config.E);
                                                    e1.s(var9_9.toString(), (Throwable)var8_6);
                                                    var8_6 = null;
                                                    ** GOTO lbl79
lbl77:
                                                    // 2 sources

                                                    var8_6 = null;
                                                    var2_5 = 2131296903;
lbl79:
                                                    // 3 sources

                                                    if (var2_5 == 2131296903) {
                                                        var8_6 = new StringBuilder();
                                                        var8_6.append(b2.f(2131296410));
                                                        var8_6.append('\n');
                                                        var8_6.append(1);
                                                        var8_6.append(": ");
                                                        var8_6.append(b2.f(2131296413));
                                                        var8_6.append('\n');
                                                        var8_6.append(2);
                                                        var8_6.append(": ");
                                                        if (!Config.C) {
                                                            var3_3 = 2131296414;
lbl99:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var3_3 = 2131296415;
                                                        ** continue;
                                                        var8_6.append(b2.f(var3_3));
                                                        var8_6 = var8_6.toString();
                                                    }
                                                    var5_4 = 2131296408;
                                                    var3_3 = var2_5;
                                                    var2_5 = var5_4;
                                                    break;
                                                }
                                            }
                                            break block24;
                                        }
                                        var8_6 = new StringBuilder();
                                        var8_6.append(b2.f(2131296764));
                                        var8_6.append("\n\n");
                                        var2_5 = Config.C != false ? 2131297090 : 2131296914;
                                        var8_6.append(b2.f(var2_5));
                                        var8_6 = var8_6.toString();
                                        var2_5 = var5_4;
                                        break block24;
                                    }
                                    var8_6 = new StringBuilder();
                                    var8_6.append(b2.f(2131296764));
                                    var8_6.append("\n\n");
                                    var8_6.append(b2.f(2131296509));
                                    var8_6 = var9_9 = var8_6.toString();
                                    if (Config.C) {
                                        var8_6 = new StringBuilder();
                                        var8_6.append((String)var9_9);
                                        var8_6.append("\n\n");
                                        var8_6.append(b2.f(2131296796));
                                        var8_6 = var8_6.toString();
                                    }
                                    var8_6 = this.i((String)var8_6);
                                    var2_5 = var5_4;
                                    break block24;
                                }
lbl145:
                                // 2 sources

                                while (true) {
                                    var8_6 = null;
                                    var3_3 = 2131296456;
                                    break block24;
                                    break;
                                }
                            }
                            var2_5 = 2131296382;
                            ** while (true)
                        }
                        var2_5 = 2131296304;
                        ** GOTO lbl14
                    }
                    var2_5 = 2131296844;
                    ** while (true)
                }
                var9_9 = var8_6;
                if (var8_6 == null) {
                    var9_9 = b2.f(var3_3);
                }
                var8_6 = b2.f(var2_5);
                var10_10 = new StringBuilder();
                var10_10.append("{");
                var10_10.append(var1_1);
                var10_10.append('}');
                var10_10 = var10_10.toString();
                if (this.w0.get(var1_1)) {
                    var6_11 = System.currentTimeMillis();
                    if (MainService.T0 < var6_11) {
                        MainService.T0 = var6_11 + 2000L;
                        var8_6 = new StringBuilder();
                        var8_6.append((String)var10_10);
                        var8_6.append(b2.f(var2_5));
                        Tools.K1(var8_6.toString(), 0);
                    }
                    if (var4_2) {
                        this.q(true);
                    }
                    return;
                }
                this.w0.put(var1_1, true);
                var11_12 = android.ext.f.b().setCustomTitle(Tools.h0((String)var10_10));
                var10_10 = new StringBuilder();
                var10_10.append((String)var8_6);
                var10_10.append("\n\n");
                var10_10.append((String)var9_9);
                var9_9 = var11_12.setMessage((CharSequence)var10_10.toString());
                var10_10 = b2.f(2131296836);
                var8_6 = var4_2 == false ? null : new DialogInterface.OnClickListener(this){
                    final MainService a;
                    {
                        this.a = mainService;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        this.a.q(true);
                    }
                };
                var10_10 = var9_9.setPositiveButton(var10_10, (DialogInterface.OnClickListener)var8_6).setCancelable(false);
                if (var3_3 == 2131296456) {
                    var8_6 = b2.f(2131296455);
                    var9_9 = new DialogInterface.OnClickListener(this){
                        final MainService a;
                        {
                            this.a = mainService;
                        }

                        public void onClick(DialogInterface dialogInterface, int n3) {
                            ConfigListAdapter.a(null);
                        }
                    };
lbl200:
                    // 3 sources

                    while (true) {
                        var10_10.setNeutralButton((CharSequence)var8_6, (DialogInterface.OnClickListener)var9_9);
                        break block25;
                        break;
                    }
                }
                if (var2_5 != 2131296409) break block32;
                var8_6 = b2.f(2131296519);
                var9_9 = new DialogInterface.OnClickListener(this){
                    final MainService a;
                    {
                        this.a = mainService;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        this.a.q(true);
                        ConfigListAdapter.t(2131296623);
                    }
                };
                ** GOTO lbl200
            }
            if (var3_3 == 2131296819) {
                var8_6 = b2.f(2131296455);
                var9_9 = new r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                ** continue;
            }
        }
        android.ext.f.o((AlertDialog.Builder)var10_10);
    }

    void k1() {
        int n3 = this.G.getAdapter().getCount();
        TextView textView = this.d0;
        int n4 = 0;
        int n5 = n3 == 0 ? 8 : 0;
        textView.setVisibility(n5);
        this.d0.setText((CharSequence)Integer.toString(n3));
        n3 = this.L.getAdapter().getCount();
        textView = this.e0;
        n5 = n4;
        if (n3 == 0) {
            n5 = 8;
        }
        textView.setVisibility(n5);
        this.e0.setText((CharSequence)Integer.toString(n3));
        this.p1();
    }

    void l() {
        if (P0 && (Config.B & 0x800) != 0 && this.v0 != null && android.ext.e0.p()) {
            P0 = false;
            new n0.i(new Runnable(this){
                final MainService a;
                {
                    this.a = mainService;
                }

                @Override
                public void run() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("doCheckLibs: ");
                    stringBuilder.append(this.a.v());
                    e1.d(stringBuilder.toString());
                }
            }, "CheckLibs").start();
        }
    }

    /*
     * Exception decompiling
     */
    public void l0(w var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 12[TRYBLOCK] [22 : 243->252)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void l1() {
        this.m1(false);
    }

    void m() {
        this.q(false);
    }

    public void m0(Script script) {
        n2.i(new Runnable(this){
            final MainService a;
            {
                this.a = mainService;
            }

            @Override
            public void run() {
                MainService mainService = this.a;
                mainService.c = null;
                mainService.d = null;
                mainService.h0.e();
                this.a.D0(true);
            }
        });
        if (this.b == script) {
            this.b = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m1(boolean bl) {
        Throwable throwable3;
        block19: {
            if (f1.b) {
                bl = true;
            }
            boolean bl2 = Config.vSpaceReal;
            int n3 = bl2 ? 4 : 2;
            Serializable serializable = null;
            int n4 = 0;
            while (n4 < n3) {
                block20: {
                    Throwable throwable22;
                    block21: {
                        block18: {
                            Object object;
                            block17: {
                                Context context;
                                block16: {
                                    bl2 = n4 >= 2;
                                    try {
                                        context = MainService.context.getApplicationContext();
                                        object = context;
                                        if (bl2) {
                                            object = Config.a(context);
                                        }
                                        context = (NotificationManager)object.getSystemService("notification");
                                        if ((bl || !android.ext.v.d) && (Config.B & 0x100) == 0) break block16;
                                        if (n4 == 0) {
                                            e1.d("add notification");
                                        }
                                        if (context != null) {
                                            boolean bl3 = n4 % 2 == 0;
                                            object = this.F(bl3, bl2);
                                            context.notify(1, (Notification)object);
                                            if (android.ext.v.a == null) return;
                                            android.ext.v.a.startForeground(1, (Notification)object);
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append("startForeground 2.");
                                            ((StringBuilder)object).append(n4);
                                            e1.d(((StringBuilder)object).toString());
                                            return;
                                        }
                                        break block17;
                                    }
                                    catch (Throwable throwable22) {
                                        break block18;
                                    }
                                }
                                if (n4 == 0) {
                                    e1.d("cancel notification");
                                    if (android.ext.v.a != null) {
                                        android.ext.v.a.stopForeground(true);
                                    }
                                }
                                if (context != null) {
                                    context.cancel(1);
                                    context.cancelAll();
                                    return;
                                }
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Failed get NotificationManager ");
                            ((StringBuilder)object).append(n4);
                            e1.d(((StringBuilder)object).toString());
                            break block20;
                        }
                        if (serializable != null) {
                            throwable22.addSuppressed((Throwable)serializable);
                        }
                        if (n4 != n3 - 1) break block21;
                        try {
                            serializable = new StringBuilder();
                            ((StringBuilder)serializable).append("Failed startForeground ");
                            ((StringBuilder)serializable).append(n4);
                            e1.s(((StringBuilder)serializable).toString(), throwable22);
                            android.ext.n0.h(Thread.currentThread(), throwable22, false);
                        }
                        catch (Throwable throwable3) {}
                        break block19;
                    }
                    serializable = throwable22;
                }
                ++n4;
            }
            return;
        }
        e1.a(throwable3);
    }

    void n(byte by) {
        this.o(by, false);
    }

    public void n0(Script script) {
        n2.i(new Runnable(this){
            final MainService a;
            {
                this.a = mainService;
            }

            @Override
            public void run() {
                MainService mainService = this.a;
                mainService.c = mainService.C("script-interrupt", 0, 0, 2131296711, 2130968654);
                mainService = this.a;
                mainService.d = null;
                mainService.h0.o();
            }
        });
    }

    void n1() {
        ImageButton imageButton = this.Q;
        int n3 = !this.R ? 2130968634 : 2130968637;
        imageButton.setImageResource(n3);
    }

    void o(byte by, boolean bl) {
        this.p(by, bl, true);
    }

    public void o0(byte by, long l3, long l4, int n3) {
        this.p0 = l3;
        if (n3 == 0) {
            this.s();
            boolean bl = true;
            S0 = true;
            if (by == 0) {
                if (!android.ext.b0.k() && Config.k != 0 && l3 > (long)android.ext.b0.i()) {
                    this.t();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(b2.f(2131296943));
                    stringBuilder.append(' ');
                    stringBuilder.append(Tools.L1(b2.f(2131296477), l3));
                    Tools.J1(stringBuilder.toString());
                    if (Config.k != 2) {
                        bl = false;
                    }
                    K0 = bl;
                } else {
                    this.D0(true);
                }
            }
        }
        if (this.p0 == 0L) {
            this.p((byte)0, false, false);
        }
    }

    public void o1(boolean bl) {
        if (bl) {
            this.Q();
        }
        double d4 = this.k0.e();
        this.T0((byte)0, d4);
        c2 c22 = MainService.instance.f;
        if (c22 != null) {
            c22.write("gg.setSpeed(");
            c22.write(Double.toString(d4));
            c22.write(")\n");
        }
    }

    /*
     * Unable to fully structure code
     */
    public void onClick(View var1_1) {
        if (var1_1 != this.p && var1_1 != this.q && var1_1 != this.s) {
            if (var1_1 == this.P) {
                this.E0();
            } else if (var1_1 == this.o) lbl-1000:
            // 2 sources

            {
                while (true) {
                    this.t();
                    break;
                }
            } else if (var1_1 == this.Q) {
                this.C0(true);
            } else if (var1_1 == this.g0) {
                Config.b(2131034189).b();
            } else if (var1_1 != null) {
                var2_2 = var1_1.getTag() instanceof Integer != false ? ((Integer)var1_1.getTag()).intValue() : var1_1.getId();
                var1_1 = "?";
                block0 : switch (var2_2) {
                    case 2131296674: {
                        ** continue;
                    }
                    default: {
                        break;
                    }
                    case 2131296884: {
                        var3_3 = this.f;
                        if (var3_3 != null) {
                            var1_1 = var3_3.c();
                        }
                        var3_3 = android.ext.f.b().setCustomTitle(Tools.h0(Tools.N1(2131296888))).setMessage((CharSequence)var1_1);
                        var4_4 = b2.f(2131296994);
                        var1_1 = new DialogInterface.OnClickListener(this){
                            final MainService a;
                            {
                                this.a = mainService;
                            }

                            public void onClick(DialogInterface dialogInterface, int n3) {
                                this.a.O();
                            }
                        };
lbl31:
                        // 2 sources

                        while (true) {
                            android.ext.f.o(var3_3.setPositiveButton((CharSequence)var4_4, (DialogInterface.OnClickListener)var1_1).setNegativeButton((CharSequence)b2.f(2131296805), null));
                            break block0;
                            break;
                        }
                    }
                    case 2131296711: {
                        var3_3 = this.b;
                        if (var3_3 != null) {
                            var3_3 = var3_3.U;
                            if (var3_3 != null) {
                                var1_1 = var3_3 = var3_3.toString();
                                if (var3_3.length() > 250) {
                                    var1_1 = new StringBuilder();
                                    var1_1.append(var3_3.substring(0, 250));
                                    var1_1.append("...");
                                    var1_1 = var1_1.toString();
                                }
                            }
                        } else {
                            var1_1 = "??";
                        }
                        var3_3 = android.ext.f.b().setCustomTitle(Tools.h0(Tools.N1(2131296928))).setMessage((CharSequence)var1_1);
                        var4_4 = b2.f(2131296711);
                        var1_1 = new DialogInterface.OnClickListener(this){
                            final MainService a;
                            {
                                this.a = mainService;
                            }

                            public void onClick(DialogInterface dialogInterface, int n3) {
                                this.a.P();
                            }
                        };
                        ** continue;
                    }
                    case 2131034336: {
                        Tools.s(this.J);
                        break;
                    }
                    case 2131034287: {
                        this.c0();
                        break;
                    }
                    case 2131034112: {
                        this.i.h();
                        this.s();
                        break;
                    }
                    case 2130968657: {
                        this.e = true;
                        break;
                    }
                }
            }
        } else {
            this.r(true);
        }
    }

    public boolean onLongClick(View view) {
        this.h.a(false, new Runnable(this){
            final MainService a;
            {
                this.a = mainService;
            }

            @Override
            public void run() {
                this.a.onLongClick(null);
            }
        });
        this.o1(false);
        this.j.x();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void p(byte by, boolean bl, boolean bl2) {
        if (bl) {
            this.r0 = true;
        }
        this.p0 = 0L;
        if (bl2) {
            this.i.l(by);
        }
        MainService.instance.i.b.r();
        d.a a4 = this.s0;
        synchronized (a4) {
            a4.d();
            a4.k();
        }
        this.V(this.G.getAdapter());
        this.b1();
        K0 = false;
    }

    /*
     * Unable to fully structure code
     */
    public void p0(byte var1_1, int var2_2, int[] var3_3) {
        block0 : switch (var2_2) {
            default: {
                break;
            }
            case 22: {
                this.D0 = true;
                break;
            }
            case 21: {
                if (var3_3[1] != 0) {
                    var2_2 = 2131296447;
                } else if (var3_3[2] != 0) {
                    var2_2 = 2131296446;
                } else {
                    if (this.C0 && (Config.A & 131072) != 0) {
                        this.C0 = false;
                        Config.b(2131034187).b();
                    }
                    var2_2 = 2131296448;
                }
                Tools.K1(b2.f(var2_2), 1);
                break;
            }
            case 20: {
                var6_4 = android.ext.f.b();
                var5_5 = new StringBuilder();
                var5_5.append(b2.f(2131296874));
                var5_5.append("\n\n");
                var2_2 = var3_3[0] != false ? 2131296876 : 2131296875;
                var5_5.append(b2.f(var2_2));
                var5_5.append("\n\n");
                var5_5.append(b2.f(2131296877));
                var3_3 = var6_4.setMessage((CharSequence)var5_5.toString()).setPositiveButton((CharSequence)b2.f(2131296836), null);
lbl35:
                // 2 sources

                while (true) {
                    android.ext.f.o((AlertDialog.Builder)var3_3);
                    break block0;
                    break;
                }
            }
            case 19: {
                this.S((int[])var3_3);
                break;
            }
lbl41:
            // 6 sources

            case 18: {
                this.X(var1_1, null);
                break;
            }
            case 17: {
                if (var1_1 != 0) break;
                var3_3 = android.ext.f.b().setCustomTitle(Tools.g0(2131297096)).setMessage((CharSequence)b2.f(2131296667)).setPositiveButton((CharSequence)b2.f(2131296274), new DialogInterface.OnClickListener(this){
                    final MainService a;
                    {
                        this.a = mainService;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        Config.b((int)2131034215).d = 1;
                        Config.k();
                        ConfigListAdapter.m();
                    }
                }).setNegativeButton((CharSequence)b2.f(2131296963), null);
                ** continue;
            }
            case 16: {
                if (var1_1 != 0) ** GOTO lbl64
                var5_6 = b2.f(2131297068);
                var3_3 = var5_6;
                if (this.D0) {
                    var3_3 = new StringBuilder();
                    var3_3.append(var5_6);
                    var3_3.append("\n");
                    var3_3.append(b2.f(2131296985));
                    var3_3 = var3_3.toString();
                }
                var2_2 = (int)this.D0;
lbl62:
                // 2 sources

                while (true) {
                    Tools.K1((String)var3_3, var2_2);
lbl64:
                    // 3 sources

                    while (true) {
                        this.D0 = false;
                        break block0;
                        break;
                    }
                    break;
                }
            }
            case 15: {
                if (var1_1 != 0) break;
                var2_2 = 2131297069;
lbl70:
                // 3 sources

                while (true) {
                    Tools.I1(var2_2, 0);
                    break block0;
                    break;
                }
            }
            case 14: {
                var2_2 = var4_8 = 2131296848;
                if (var1_1 != 0) ** GOTO lbl79
                var2_2 = var4_8;
lbl77:
                // 3 sources

                while (true) {
                    Tools.H1(var2_2);
lbl79:
                    // 4 sources

                    while (true) {
                        this.X(var1_1, b2.f(var2_2));
                        break block0;
                        break;
                    }
                    break;
                }
            }
            case 13: {
                if (var1_1 != 0) ** GOTO lbl41
                Tools.H1(2131296849);
                android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296381)).setMessage((CharSequence)b2.f(2131296788)).setPositiveButton((CharSequence)b2.f(2131296836), null));
                ** GOTO lbl41
            }
            case 12: {
                if (var1_1 != 0) break;
                var2_2 = 2131296850;
                ** GOTO lbl70
            }
            case 11: {
                if (var1_1 != 0) ** continue;
                var5_7 = b2.f(2131296983);
                var3_3 = var5_7;
                if (this.D0) {
                    var3_3 = new StringBuilder();
                    var3_3.append(var5_7);
                    var3_3.append("\n");
                    var3_3.append(b2.f(2131296985));
                    var3_3 = var3_3.toString();
                }
                var2_2 = (int)this.D0;
                ** continue;
            }
            case 10: {
                if (var1_1 != 0) break;
                var2_2 = 2131296984;
                ** continue;
            }
            case 9: {
                this.S = false;
                break;
            }
            case 8: {
                this.S = true;
                break;
            }
            case 6: {
                var2_2 = var4_9 = 2131296342;
                if (var1_1 != 0) ** GOTO lbl79
                var2_2 = var4_9;
                ** GOTO lbl77
            }
            case 5: {
                if (var1_1 != 0) ** GOTO lbl41
                var2_2 = 2131296341;
lbl124:
                // 2 sources

                while (true) {
                    Tools.I1(var2_2, 0);
                    ** GOTO lbl41
                    break;
                }
            }
            case 4: {
                this.s();
                var2_2 = var4_10 = 2131296391;
                if (var1_1 != 0) ** continue;
                var2_2 = var4_10;
                ** continue;
            }
            case 3: {
                this.s();
                if (var1_1 != 0) ** GOTO lbl41
                var2_2 = 2131296390;
                ** continue;
            }
            case 1: {
                var3_3 = Tools.M0().edit().remove("mem-fail");
lbl140:
                // 2 sources

                while (true) {
                    var3_3.commit();
                    break block0;
                    break;
                }
            }
            case 0: {
                var3_3 = Tools.M0().edit().putBoolean("mem-fail", true);
                ** continue;
            }
        }
    }

    void p1() {
        if (n2.e()) {
            this.e();
        } else {
            n2.i(new Runnable(this){
                final MainService a;
                {
                    this.a = mainService;
                }

                @Override
                public void run() {
                    this.a.e();
                }
            });
        }
    }

    void q(boolean bl) {
        this.o((byte)0, bl);
    }

    public void q0() {
        this.p1();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void q1() {
        Object object;
        int n3;
        if (!I0) {
            return;
        }
        int n4 = this.H() - 1;
        int n5 = (Config.p & 1 << n4 * 2 + (n3 = Tools.d1())) != 0 ? 1 : 0;
        int n6 = Config.r;
        if (n4 >= 0 && (object = this.z0)[n4] != n6) {
            object[n4] = n6;
            n6 = (n6 & 1 << n4) == 0 ? 0 : -16777216;
            this.m.getCurrentView().setBackgroundColor(n6);
        }
        object = this.J;
        n6 = n5 == 0 && n3 == 0 ? 0 : 8;
        object.setVisibility(n6);
        object = this.K;
        n6 = n3 == 1 ? (n4 >= 0 ? 0 : 4) : 8;
        object.setVisibility(n6);
        object = this.F;
        n6 = n3 == 0 ? 0 : 8;
        object.setVisibility(n6);
        object = this.E;
        n6 = n4 >= 0 && n5 != 0 ? 0 : 8;
        object.setVisibility(n6);
        n6 = 0;
        block4: while (n6 < ((int[])(object = (Object)this.D)).length) {
            object = object[n6];
            ((WrapLayout)((Object)object)).setFill(Config.g - 1);
            n5 = n6 == n4 ? 0 : 8;
            object.setVisibility(n5);
            long l3 = Config.b[n6 * 2 + n3];
            n5 = 0;
            while (true) {
                block11: {
                    if (n5 < object.getChildCount()) {
                        try {
                            View view = object.getChildAt(n5);
                            if (view != null) {
                                int n7 = (1L << n5 & l3) != 0L ? 0 : 8;
                                view.setVisibility(n7);
                            }
                            break block11;
                        }
                        catch (Throwable throwable) {
                            e1.a(throwable);
                            break block11;
                        }
                    }
                    ++n6;
                    continue block4;
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
                }
                ++n5;
            }
            break;
        }
        return;
    }

    void r(boolean bl) {
        this.h.b(bl);
    }

    public void r0() {
        this.P();
        if (this.F0) {
            return;
        }
        this.F0 = true;
        z1.d d4 = this.v0;
        String string2 = d4 == null ? null : d4.c;
        boolean bl = d4 == null ? false : d4.n;
        this.r(false);
        this.J0();
        this.s();
        this.s0(string2, bl);
    }

    void s() {
        this.j.t((byte)2, -1L, 1L, 0, 1, "");
        this.i0.a(true);
        this.i.m();
        this.i.L();
        this.U = false;
    }

    void s0(String object, boolean bl) {
        String string2 = b2.f(2131296424);
        String string3 = b2.f(2131296905);
        String string4 = b2.f(2131296906);
        String string5 = b2.f(2131296626);
        String string6 = b2.f(2131296836);
        AlertDialog.Builder builder = android.ext.f.b().setCustomTitle(Tools.g0(2131296508));
        object = new DialogInterface.OnClickListener(this, (String)object, bl){
            final String a;
            final boolean b;
            final MainService c;
            {
                this.c = mainService;
                this.a = string2;
                this.b = bl;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onClick(DialogInterface dialogInterface, int n3) {
                block10: {
                    block8: {
                        Intent intent;
                        Object object;
                        block11: {
                            Exception exception2;
                            int n4;
                            block7: {
                                block6: {
                                    block9: {
                                        object = this.c;
                                        n4 = 0;
                                        ((MainService)object).F0 = false;
                                        if (n3 == 0) break block8;
                                        if (n3 == 1) break block9;
                                        if (n3 != 2) {
                                            if (n3 == 3) {
                                                ConfigListAdapter.t(2131296626);
                                            }
                                            this.c.h.g();
                                            break block10;
                                        } else if (f1.z(null, new DialogInterface.OnDismissListener(this){
                                            final c0 a;
                                            {
                                                this.a = c02;
                                            }

                                            public void onDismiss(DialogInterface object) {
                                                object = this.a;
                                                object.c.s0(object.a, object.b);
                                            }
                                        })) {
                                            android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296906)).setMessage((CharSequence)b2.f(2131297100)).setNegativeButton((CharSequence)b2.f(2131296311), null).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(this){
                                                final c0 a;
                                                {
                                                    this.a = c02;
                                                }

                                                public void onClick(DialogInterface dialogInterface, int n3) {
                                                    n2.h(new Runnable(this){
                                                        final c a;
                                                        {
                                                            this.a = c4;
                                                        }

                                                        /*
                                                         * Enabled aggressive block sorting
                                                         * Enabled unnecessary exception pruning
                                                         * Enabled aggressive exception aggregation
                                                         */
                                                        @Override
                                                        public void run() {
                                                            String string2;
                                                            boolean bl;
                                                            Runnable runnable;
                                                            Object object;
                                                            block12: {
                                                                Throwable throwable3;
                                                                block10: {
                                                                    block8: {
                                                                        block11: {
                                                                            block9: {
                                                                                object = new StringBuilder();
                                                                                ((StringBuilder)object).append("Restart stub: ");
                                                                                ((StringBuilder)object).append(this.a.a.a);
                                                                                e1.d(((StringBuilder)object).toString());
                                                                                runnable = new StringBuilder();
                                                                                ((StringBuilder)((Object)runnable)).append("exec setprop wrap.");
                                                                                object = this.a.a.a;
                                                                                bl = false;
                                                                                object = object != null && ((String)object).length() > 26 ? this.a.a.a.substring(0, 26) : this.a.a.a;
                                                                                ((StringBuilder)((Object)runnable)).append((String)object);
                                                                                string2 = ((StringBuilder)((Object)runnable)).toString();
                                                                                try {
                                                                                    object = new StringBuilder();
                                                                                    ((StringBuilder)object).append(android.ext.e0.g());
                                                                                    ((StringBuilder)object).append(android.ext.e0.k(this.a.a.b));
                                                                                    object = ((StringBuilder)object).toString();
                                                                                    runnable = new StringBuilder();
                                                                                    ((StringBuilder)((Object)runnable)).append(string2);
                                                                                    ((StringBuilder)((Object)runnable)).append(" LD_PRELOAD=");
                                                                                    ((StringBuilder)((Object)runnable)).append((String)object);
                                                                                    e2.n(((StringBuilder)((Object)runnable)).toString(), 5);
                                                                                }
                                                                                catch (Throwable throwable2) {
                                                                                    object = new StringBuilder();
                                                                                    ((StringBuilder)object).append("Failed stub app: ");
                                                                                    ((StringBuilder)object).append(this.a.a.a);
                                                                                    e1.l(((StringBuilder)object).toString(), throwable2);
                                                                                }
                                                                                try {
                                                                                    object = new StringBuilder();
                                                                                    ((StringBuilder)object).append("exec monkey -p ");
                                                                                    ((StringBuilder)object).append(this.a.a.a);
                                                                                    ((StringBuilder)object).append(" 1");
                                                                                    if (e2.n(((StringBuilder)object).toString(), 10).contains("Events injected")) break block8;
                                                                                    runnable = Tools.B0().getLaunchIntentForPackage(this.a.a.a);
                                                                                    object = runnable;
                                                                                    if (runnable != null) break block9;
                                                                                    object = new Intent("android.intent.action.MAIN");
                                                                                    object.setPackage(this.a.a.a);
                                                                                }
                                                                                catch (Throwable throwable3) {
                                                                                    break block10;
                                                                                }
                                                                            }
                                                                            if ((runnable = object.getComponent()) == null) break block11;
                                                                            StringBuilder stringBuilder = new StringBuilder();
                                                                            stringBuilder.append("exec am start -n ");
                                                                            stringBuilder.append(runnable.flattenToString());
                                                                            if (e2.n(stringBuilder.toString(), 10).contains("Starting: Intent")) break block8;
                                                                        }
                                                                        object.setFlags(0x10000000);
                                                                        runnable = new Runnable(this, (Intent)object){
                                                                            final Intent a;
                                                                            final a b;
                                                                            {
                                                                                this.b = a4;
                                                                                this.a = intent;
                                                                            }

                                                                            @Override
                                                                            public void run() {
                                                                                try {
                                                                                    Tools.f0().startActivity(this.a);
                                                                                }
                                                                                catch (Exception exception) {
                                                                                    StringBuilder stringBuilder = new StringBuilder();
                                                                                    stringBuilder.append("Failed restart app 2: ");
                                                                                    stringBuilder.append(this.b.a.a.a);
                                                                                    e1.l(stringBuilder.toString(), exception);
                                                                                }
                                                                            }
                                                                        };
                                                                        n2.i(runnable);
                                                                    }
                                                                    bl = true;
                                                                    break block12;
                                                                }
                                                                object = new StringBuilder();
                                                                ((StringBuilder)object).append("Failed restart app: ");
                                                                ((StringBuilder)object).append(this.a.a.a);
                                                                e1.l(((StringBuilder)object).toString(), throwable3);
                                                            }
                                                            object = n2.c();
                                                            runnable = new Runnable(this, string2){
                                                                final String a;
                                                                final a b;
                                                                {
                                                                    this.b = a4;
                                                                    this.a = string2;
                                                                }

                                                                @Override
                                                                public void run() {
                                                                    try {
                                                                        StringBuilder stringBuilder = new StringBuilder();
                                                                        stringBuilder.append(this.a);
                                                                        stringBuilder.append(" ''");
                                                                        e2.n(stringBuilder.toString(), 5);
                                                                    }
                                                                    catch (Throwable throwable) {
                                                                        StringBuilder stringBuilder = new StringBuilder();
                                                                        stringBuilder.append("Failed unstub app: ");
                                                                        stringBuilder.append(this.b.a.a.a);
                                                                        e1.l(stringBuilder.toString(), throwable);
                                                                    }
                                                                }
                                                            };
                                                            long l3 = 0L;
                                                            long l4 = bl ? 10000L : 0L;
                                                            object.postDelayed(runnable, l4);
                                                            object = n2.d();
                                                            runnable = new Runnable(this){
                                                                final a a;
                                                                {
                                                                    this.a = a4;
                                                                }

                                                                @Override
                                                                public void run() {
                                                                    c0 c02 = this.a.a.a;
                                                                    c02.c.h.c(true, c02.a);
                                                                }
                                                            };
                                                            l4 = l3;
                                                            if (bl) {
                                                                l4 = 4000L;
                                                            }
                                                            object.postDelayed(runnable, l4);
                                                        }
                                                    });
                                                }
                                            }));
                                        }
                                        break block10;
                                    }
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("Restart: ");
                                    ((StringBuilder)object).append(this.a);
                                    e1.d(((StringBuilder)object).toString());
                                    try {
                                        intent = Tools.B0().getLaunchIntentForPackage(this.a);
                                        object = intent;
                                        if (intent != null) break block6;
                                        object = new Intent("android.intent.action.MAIN");
                                        object.setPackage(this.a);
                                    }
                                    catch (Exception exception2) {
                                        break block7;
                                    }
                                }
                                object.setFlags(0x10000000);
                                Tools.f0().startActivity((Intent)object);
                                n3 = 1;
                                break block11;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Failed restart app: ");
                            ((StringBuilder)object).append(this.a);
                            e1.l(((StringBuilder)object).toString(), exception2);
                            n3 = n4;
                        }
                        intent = n2.d();
                        object = new Runnable(this){
                            final c0 a;
                            {
                                this.a = c02;
                            }

                            @Override
                            public void run() {
                                c0 c02 = this.a;
                                c02.c.h.c(true, c02.a);
                            }
                        };
                        long l3 = n3 != 0 ? 4000L : 0L;
                        intent.postDelayed((Runnable)object, l3);
                        break block10;
                    }
                    new android.ext.p0(1100).onClick(dialogInterface, n3);
                }
                Tools.D(dialogInterface);
            }
        };
        android.ext.f.o(builder.setItems((CharSequence[])new String[]{string2, string3, string4, string5, string6}, (DialogInterface.OnClickListener)object).setCancelable(false));
    }

    void t() {
        this.u(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    void u(boolean bl) {
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("ServiceProxy dismissDialog: ");
        ((StringBuilder)charSequence).append((Object)this.n);
        e1.d(((StringBuilder)charSequence).toString());
        if (this.n == null) {
            return;
        }
        this.i0.a(false);
        this.n.dismiss();
        this.n = null;
        this.h0.a(bl);
        this.j.m();
        this.T = this.R;
        bl = this.S;
        boolean bl2 = (Config.A & 0x80) != 0;
        if (this.i0.b() && (bl2 || bl)) {
            CharSequence charSequence2;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(Tools.N1(2131296854));
            ((StringBuilder)charSequence).append(":\n");
            CharSequence charSequence3 = ((StringBuilder)charSequence).toString();
            charSequence = charSequence3;
            if (bl2) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence3);
                ((StringBuilder)charSequence).append("- ");
                charSequence3 = b2.f(2131296306);
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(Tools.N1(2131296677));
                ((StringBuilder)charSequence2).append(": 1");
                ((StringBuilder)charSequence).append(Tools.L1((String)charSequence3, ((StringBuilder)charSequence2).toString()));
                ((StringBuilder)charSequence).append(";\n");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            charSequence3 = charSequence;
            if (bl) {
                if ((Config.B & 4) != 0) {
                    charSequence3 = new StringBuilder();
                    ((StringBuilder)charSequence3).append((String)charSequence);
                    ((StringBuilder)charSequence3).append("- ");
                    charSequence2 = b2.f(2131296306);
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(Tools.N1(2131296293));
                    ((StringBuilder)charSequence).append(": ");
                    ((StringBuilder)charSequence).append(b2.f(2131297115));
                    charSequence = Tools.L1((String)charSequence2, ((StringBuilder)charSequence).toString());
                } else {
                    charSequence3 = new StringBuilder();
                    ((StringBuilder)charSequence3).append((String)charSequence);
                    ((StringBuilder)charSequence3).append("- ");
                    charSequence = b2.f(2131296307);
                }
                ((StringBuilder)charSequence3).append((String)charSequence);
                ((StringBuilder)charSequence3).append(";\n");
                charSequence3 = ((StringBuilder)charSequence3).toString();
            }
            charSequence = ((String)charSequence3).trim();
            if (!this.U) {
                this.U = true;
                android.ext.f.m(android.ext.f.c(android.ext.r.p).setMessage(charSequence).setNegativeButton((CharSequence)b2.f(2131296836), null).create());
            } else {
                Tools.J1((String)charSequence);
            }
        }
        this.z0();
        this.i.L();
        this.l1();
    }

    public void u0() {
        e1.d("<<");
        this.k0.l();
        this.o1(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    int v() {
        Throwable throwable3;
        Object object;
        block28: {
            boolean bl;
            Object object2;
            Object object3;
            Object object4;
            block27: {
                object4 = Tools.Y(this.v0.c);
                boolean bl2 = true;
                if (object4 == null) {
                    return 1;
                }
                object = object4.nativeLibraryDir;
                if (object == null) {
                    return 2;
                }
                object3 = new byte[20];
                object2 = new File((String)object);
                File[] fileArray = ((File)object2).listFiles();
                if (fileArray == null) return 3;
                int n3 = fileArray.length;
                bl = false;
                for (int i3 = 0; i3 < n3; ++i3) {
                    boolean bl3;
                    block25: {
                        object2 = fileArray[i3];
                        if (bl) break;
                        bl3 = bl;
                        if (object2 != null) {
                            Object object5;
                            int n4;
                            block26: {
                                bl3 = bl;
                                if (!((File)object2).getName().startsWith("lib")) break block25;
                                boolean bl4 = ((File)object2).getName().endsWith(".so");
                                if (!bl4) {
                                    bl3 = bl;
                                    break block25;
                                }
                                n4 = bl;
                                n4 = bl;
                                object5 = new FileInputStream((File)object2);
                                n4 = bl;
                                bl3 = bl;
                                if (((InputStream)object5).read((byte[])object3) <= 13) break block26;
                                bl3 = bl;
                                if (object3[0] == 127) {
                                    bl3 = bl;
                                    if (object3[1] == 69) {
                                        bl3 = bl;
                                        if (object3[2] == 76) {
                                            bl3 = bl;
                                            if (object3[3] == 70) {
                                                n4 = object3[18];
                                                bl3 = bl;
                                                if (n4 == 40) {
                                                    try {
                                                        object = new StringBuilder();
                                                        object.append("doCheckLibs: ");
                                                        object.append(object2);
                                                        object.append(" is ARM lib");
                                                        e1.d(object.toString());
                                                    }
                                                    finally {
                                                        bl3 = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            n4 = bl3;
                            try {
                                ((InputStream)object5).close();
                                break block25;
                            }
                            catch (Throwable throwable2) {
                                bl3 = n4;
                            }
                            object5 = new StringBuilder();
                            ((StringBuilder)object5).append("Failed check lib ");
                            ((StringBuilder)object5).append(object2);
                            e1.l(((StringBuilder)object5).toString(), (Throwable)object);
                        }
                    }
                    bl = bl3;
                }
                if (!bl) {
                    return 3;
                }
                try {
                    object4 = object4.sourceDir;
                    if (object4 == null) {
                        return 4;
                    }
                }
                catch (Throwable throwable3) {}
                break block28;
                object3 = new ZipFile;
                ((ZipFile)object3)((String)object4);
                object2 = ((ZipFile)object3).entries();
                while (object2.hasMoreElements()) {
                    object = (ZipEntry)object2.nextElement();
                    if (!object.getName().contains("lib/x86/lib")) continue;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("doCheckLibs: ");
                    ((StringBuilder)object2).append(object.getName());
                    ((StringBuilder)object2).append(" is x86 lib");
                    e1.d(((StringBuilder)object2).toString());
                    bl = bl2;
                    break block27;
                }
                bl = false;
            }
            ((ZipFile)object3).close();
            if (!bl) {
                return 5;
            }
            object3 = android.ext.f.b().setCustomTitle(Tools.h0(Tools.N1(2131296321))).setMessage((CharSequence)b2.f(2131296286));
            object2 = b2.f(2131296455);
            object = !Config.C ? new DialogInterface.OnClickListener(this, (String)object4){
                final String a;
                final MainService b;
                {
                    this.b = mainService;
                    this.a = string2;
                }

                public void onClick(DialogInterface dialogInterface, int n3) {
                    android.ext.f.o(android.ext.f.b().setMessage((CharSequence)b2.f(2131297024)).setPositiveButton((CharSequence)b2.f(2131297115), new DialogInterface.OnClickListener(this){
                        final g0 a;
                        {
                            this.a = g02;
                        }

                        public void onClick(DialogInterface dialogInterface, int n3) {
                            Tools.I1(2131296894, 0);
                            new n0.i(new Runnable(this){
                                final a a;
                                {
                                    this.a = a4;
                                }

                                /*
                                 * Enabled aggressive block sorting
                                 * Enabled unnecessary exception pruning
                                 * Enabled aggressive exception aggregation
                                 */
                                @Override
                                public void run() {
                                    Object object;
                                    block5: {
                                        InterruptedException interruptedException2;
                                        block6: {
                                            block4: {
                                                try {
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append(Tools.removeNewLinesChars("h{hf#sp#lqvwdoo#0u#00del#{;9#"));
                                                    ((StringBuilder)object).append(this.a.a.a);
                                                    object = e2.q(((StringBuilder)object).toString());
                                                    if (object != null) break block4;
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append(b2.f(2131296893));
                                                    ((StringBuilder)object).append("\nnull");
                                                    object = ((StringBuilder)object).toString();
                                                    break block5;
                                                }
                                                catch (InterruptedException interruptedException2) {
                                                    break block6;
                                                }
                                            }
                                            int n3 = ((Process)object).waitFor();
                                            if (n3 == 0) {
                                                object = b2.f(2131296891);
                                                break block5;
                                            } else {
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append(b2.f(2131296893));
                                                ((StringBuilder)object).append("\ncode: ");
                                                ((StringBuilder)object).append(n3);
                                                object = ((StringBuilder)object).toString();
                                            }
                                            break block5;
                                        }
                                        e1.g("Reinstall failed", interruptedException2);
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append(b2.f(2131296893));
                                        ((StringBuilder)object).append("\n");
                                        ((StringBuilder)object).append(interruptedException2.getMessage());
                                        object = ((StringBuilder)object).toString();
                                    }
                                    Tools.K1((String)object, 1);
                                }
                            }, "FixLibs").start();
                        }
                    }).setNeutralButton((CharSequence)b2.f(2131296962), (DialogInterface.OnClickListener)new r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh278:0krz0wr0uhsodfh0dup0oleudulhv0zlwk0{;90oleudulhv0{0soruh2")).setNegativeButton((CharSequence)b2.f(2131296805), null));
                }
            } : new r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh278:0krz0wr0uhsodfh0dup0oleudulhv0zlwk0{;90oleudulhv0{0soruh2");
            object3 = object3.setPositiveButton((CharSequence)object2, object);
            object4 = b2.f(2131296963);
            object = new DialogInterface.OnClickListener(this){
                final MainService a;
                {
                    this.a = mainService;
                }

                public void onClick(DialogInterface dialogInterface, int n3) {
                    Config.b((int)2131034154).d = 0;
                    Config.k();
                }
            };
            android.ext.f.o(object3.setNeutralButton((CharSequence)object4, object).setNegativeButton((CharSequence)b2.f(2131296836), null));
            return 6;
        }
        object = new StringBuilder();
        object.append("Failed check libs for ");
        object.append(this.v0);
        e1.l(object.toString(), throwable3);
        return 0;
    }

    boolean v0() {
        boolean bl = this.w0((byte)0);
        c2 c22 = MainService.instance.f;
        if (c22 != null) {
            c22.write("gg.processKill()\n");
        }
        return bl;
    }

    public void w(int n3) {
        f0 f02 = this.i;
        if (f02 != null && n3 >= 80) {
            f02.z();
        }
    }

    boolean w0(byte by) {
        z1.d d4 = this.v0;
        if (d4 == null) {
            Tools.J1(b2.f(2131296806));
            return false;
        }
        e1.d("Kill game");
        this.i.C0(by, d4.f, d4.c, d4.d);
        this.i.L0(by, (byte)2);
        return true;
    }

    public void x(String object, int n3, String string2) {
        this.P();
        this.b = object = new Script(new File((String)object), n3, string2);
        ((Script)object).R3();
    }

    boolean x0(byte by, boolean bl) {
        if (!bl && this.n == null) {
            return false;
        }
        if (!this.R) {
            this.Q();
            this.i.L0(by, (byte)0);
            this.R = true;
            this.n1();
            return true;
        }
        return false;
    }

    void y(boolean bl) {
        if (this.n != null) {
            return;
        }
        if (bl) {
            this.h0.k();
        } else {
            this.h0.a(true);
        }
    }

    boolean y0(boolean bl) {
        bl = this.x0((byte)0, bl);
        c2 c22 = MainService.instance.f;
        if (c22 != null) {
            c22.write("gg.processPause()\n");
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    Object z() {
        n1 n12;
        void var1_9;
        View view = this.f0;
        if (view == this.Z) {
            d.a a4 = this.s0;
            return var1_9;
        }
        if (view == this.a0) {
            SavedListAdapter savedListAdapter = this.t0;
            if (savedListAdapter != null) {
                d.e e4 = savedListAdapter.f();
                return var1_9;
            }
        } else if (view == this.b0 && (n12 = this.N) != null) {
            boolean[] blArray = n12.f();
            return var1_9;
        }
        Object var1_8 = null;
        return var1_9;
    }

    boolean z0() {
        boolean bl = this.A0((byte)0);
        c2 c22 = MainService.instance.f;
        if (c22 != null) {
            c22.write("gg.processResume()\n");
        }
        return bl;
    }

    private class j0
    extends p1 {
        final MainService f;

        public j0(MainService mainService) {
            this.f = mainService;
            super(2131296309, 2130968665);
        }

        private void h() {
            int n3;
            int n4;
            long[] lArray;
            long[] lArray2;
            block17: {
                Object object;
                block18: {
                    object = this.f.z();
                    lArray2 = new long[10];
                    lArray = new long[10];
                    if (object instanceof d.a) {
                        object = (d.a)object;
                        android.ext.c c4 = new android.ext.c();
                        int n5 = ((d.a)object).i();
                        int n6 = 0;
                        int n7 = 0;
                        int n8 = 0;
                        while (true) {
                            n4 = n7;
                            n3 = n8;
                            if (n6 >= n5) break block17;
                            if (((d.a)object).c(n6)) {
                                n4 = n7;
                                if (n7 < 10) {
                                    ((d.a)object).f(n6, c4);
                                    lArray2[n7] = c4.a;
                                    lArray[n7] = c4.b & android.ext.c.d[c4.D()];
                                    n4 = n7 + 1;
                                }
                                n3 = n8 + 1;
                                n7 = n4;
                                n8 = n3;
                                if (n3 > 10) break block17;
                            }
                            ++n6;
                        }
                    }
                    if (!(object instanceof d.e)) break block18;
                    d.e e4 = (d.e)object;
                    int n9 = e4.l();
                    int n10 = 0;
                    n3 = 0;
                    int n11 = 0;
                    while (true) {
                        block20: {
                            int n12;
                            block19: {
                                n4 = n3;
                                n12 = n11;
                                if (n10 >= n9) break block19;
                                if (!e4.a(n10) || !((object = (h2)e4.n(n10)) instanceof h2)) break block20;
                                n4 = n3;
                                if (n3 < 10) {
                                    lArray2[n3] = ((android.ext.c)object).a;
                                    lArray[n3] = ((android.ext.c)object).b & android.ext.c.d[((android.ext.c)object).D()];
                                    n4 = n3 + 1;
                                }
                                n12 = n11 + 1;
                                n3 = n4;
                                n11 = n12;
                                if (n12 <= 10) break block20;
                            }
                            n3 = n12;
                            break block17;
                        }
                        ++n10;
                    }
                }
                if (object instanceof boolean[]) {
                    n1 n12 = this.f.N;
                    boolean[] blArray = (boolean[])object;
                    int n13 = blArray.length;
                    int n14 = 1;
                    int n15 = 0;
                    int n16 = 0;
                    while (true) {
                        n4 = n15;
                        n3 = n16;
                        if (n14 >= n13 - 1) break block17;
                        if (blArray[n14]) {
                            n4 = n15;
                            if (n15 < 10) {
                                lArray2[n15] = n12.e(n14);
                                object = (android.ext.c)n12.getItem(n14);
                                lArray[n15] = ((android.ext.c)object).b & android.ext.c.d[((android.ext.c)object).D()];
                                n4 = n15 + 1;
                            }
                            n3 = n16 + 1;
                            n15 = n4;
                            n16 = n3;
                            if (n3 > 10) break block17;
                        }
                        ++n14;
                    }
                }
                n4 = 0;
                n3 = 0;
            }
            if (n4 < 2) {
                Tools.J1(Tools.L1(b2.f(2131296798), 2));
            } else {
                if (n3 > n4) {
                    Tools.J1(Tools.L1(b2.f(2131297077), n4));
                }
                android.ext.f.o(android.ext.f.b().setAdapter(new ArrayAdapter<String>(context, new String[]{Tools.N1(2131296833), "XOR"}), new DialogInterface.OnClickListener(this, lArray2, lArray, n4){
                    final long[] a;
                    final long[] b;
                    final int c;
                    final j0 d;
                    {
                        this.d = j02;
                        this.a = lArray;
                        this.b = lArray2;
                        this.c = n3;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        this.d.i(this.a, this.b, this.c, n3);
                    }
                }).setNegativeButton((CharSequence)b2.f(2131296311), null));
            }
        }

        void i(long[] lArray, long[] lArray2, int n3, int n4) {
            int n5 = n3 - 1;
            int n6 = n3 * n5 / 2;
            String[] stringArray = new String[n6];
            String[] stringArray2 = new String[n6];
            n6 = 0;
            int n7 = 0;
            while (n6 < n5) {
                int n8;
                for (int i3 = n8 = n6 + 1; i3 < n3; ++i3) {
                    long l3 = lArray[n6];
                    long l4 = lArray[i3];
                    String string2 = n4 == 0 ? Long.toHexString(l4 - l3).toUpperCase(Locale.US) : Tools.L1("%,d", lArray2[n6] ^ lArray2[i3]);
                    stringArray2[n7] = string2;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(t2.e(8, l3));
                    stringBuilder.append(" - ");
                    stringBuilder.append(t2.e(8, l4));
                    stringBuilder.append(": ");
                    stringBuilder.append(string2);
                    stringArray[n7] = stringBuilder.toString();
                    ++n7;
                }
                n6 = n8;
            }
            android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296949)).setAdapter(new ArrayAdapter<String>(context, stringArray), new DialogInterface.OnClickListener(this, stringArray2){
                final String[] a;
                final j0 b;
                {
                    this.b = j02;
                    this.a = stringArray;
                }

                public void onClick(DialogInterface dialogInterface, int n3) {
                    Tools.z(this.a[n3]);
                    Tools.D(dialogInterface);
                }
            }).setNegativeButton((CharSequence)b2.f(2131296311), null));
        }

        @Override
        public void onClick(View view) {
            this.h();
        }
    }

    private class k0
    extends p1 {
        final MainService f;

        public k0(MainService mainService) {
            this.f = mainService;
            super(2131296327, 2130968650);
        }

        @Override
        public void onClick(View view) {
            this.f.j(0);
        }
    }

    private class l0
    extends p1 {
        int f;
        final MainService g;

        public l0(MainService mainService) {
            this.g = mainService;
            super(2131296428, 2130968606);
            this.f = 0;
        }

        l0(MainService mainService, int n3, int n4) {
            this.g = mainService;
            super(n3, n4);
            this.f = 0;
        }

        void h(List list, Object object) {
            int n3 = list.size();
            h2[] h2Array = new h2[n3];
            for (int i3 = 0; i3 < n3; ++i3) {
                object = (android.ext.c)list.get(i3);
                object = object instanceof h2 ? (h2)object : new h2((android.ext.c)object);
                h2Array[i3] = object;
            }
            new c1((z1.d)this.g.v0, (h2[])h2Array).g = true;
        }

        void i() {
            int n3;
            Object object = this.g.z();
            if (Tools.L0(object) == 0) {
                Tools.H1(2131296822);
                return;
            }
            SparseIntArray sparseIntArray = new ArrayList();
            boolean bl = object instanceof boolean[];
            int n4 = 0;
            if (bl) {
                if (this.f == 0) {
                    sparseIntArray = new SparseIntArray();
                    new u2(android.ext.c.o(this.g.N.q((boolean[])object, sparseIntArray)), sparseIntArray, "0", b2.f(2131297030), new DialogInterface.OnClickListener(this){
                        final l0 a;
                        {
                            this.a = l02;
                        }

                        public void onClick(DialogInterface object, int n3) {
                            object = this.a;
                            ((l0)object).f = n3;
                            ((l0)object).i();
                        }
                    });
                    return;
                }
                n1 n12 = this.g.N;
                boolean[] blArray = (boolean[])object;
                n4 = blArray.length;
                for (n3 = 1; n3 < n4 - 1; ++n3) {
                    Object object2;
                    if (!blArray[n3] || !((object2 = n12.getItem(n3)) instanceof android.ext.c)) continue;
                    object2 = (android.ext.c)object2;
                    ((android.ext.c)object2).c = this.f;
                    if (!((android.ext.c)object2).V()) continue;
                    sparseIntArray.add(object2);
                }
                this.f = 0;
            } else if (object instanceof d.a) {
                d.a a4 = (d.a)object;
                int n5 = a4.i();
                for (n3 = n4; n3 < n5; ++n3) {
                    if (!a4.c(n3)) continue;
                    sparseIntArray.add(a4.f(n3, null));
                }
            } else if (object instanceof d.e) {
                d.e e4 = (d.e)object;
                n4 = e4.l();
                for (n3 = 0; n3 < n4; ++n3) {
                    h2 h22;
                    if (!e4.a(n3) || !((h22 = (h2)e4.n(n3)) instanceof h2)) continue;
                    sparseIntArray.add(h22);
                }
            }
            this.h((List)sparseIntArray, object);
        }

        void j() {
            this.f = 0;
            this.i();
        }

        @Override
        public void onClick(View view) {
            this.j();
        }
    }

    private class m0
    extends p1 {
        final MainService f;

        public m0(MainService mainService) {
            this.f = mainService;
            super(2131296718, 2130968649);
        }

        @Override
        public void onClick(View view) {
            this.f.j(2);
        }
    }

    private class n0
    extends o0 {
        final MainService i;

        public n0(MainService mainService) {
            this.i = mainService;
            super(mainService, 2131296317, 2130968645);
        }

        @Override
        void i() {
            android.ext.d d4 = this.i.u0;
            if (d4.e() == 0) {
                Tools.J1(b2.f(2131296318));
                return;
            }
            this.h(d4.b(), null);
        }
    }

    private class o0
    extends l0 {
        final MainService h;

        public o0(MainService mainService) {
            this.h = mainService;
            super(mainService, 2131296952, 2130968647);
        }

        o0(MainService mainService, int n3, int n4) {
            this.h = mainService;
            super(mainService, n3, n4);
        }

        @Override
        void h(List object, Object object2) {
            block7: {
                block6: {
                    block5: {
                        if (object.size() != 0) break block5;
                        this.h.n((byte)0);
                        break block6;
                    }
                    if (!this.h.a1()) break block7;
                    if (this.h.p0 != 0L) {
                        this.h.n((byte)0);
                    }
                    MainService mainService = this.h;
                    mainService.q0 = false;
                    mainService.i.x0((byte)0);
                    this.h.R((byte)0);
                    mainService = this.h;
                    mainService.r0 = false;
                    mainService.i.f0((byte)0, (List)object);
                    this.h.m.setCurrentTab(1);
                    boolean bl = object2 instanceof d.a;
                    if ((bl || object2 instanceof d.e) && (object = this.h.f) != null && bl) {
                        android.ext.b0.n((c2)object, true);
                    }
                }
                return;
            }
            throw new NumberFormatException(b2.f(2131296305));
        }

        @Override
        public void onClick(View view) {
            if (this.h.p0 == 0L) {
                this.j();
            } else {
                android.ext.f.o(android.ext.f.b().setMessage((CharSequence)b2.f(2131296326)).setPositiveButton((CharSequence)b2.f(2131297115), new DialogInterface.OnClickListener(this){
                    final o0 a;
                    {
                        this.a = o02;
                    }

                    public void onClick(DialogInterface dialogInterface, int n3) {
                        this.a.j();
                    }
                }).setNegativeButton((CharSequence)b2.f(2131296805), null));
            }
        }
    }

    class p0
    extends p1 {
        final boolean f;
        final MainService g;

        public p0(MainService mainService, boolean bl) {
            this.g = mainService;
            super(2131296895, 2130968603);
            this.f = bl;
        }

        @Override
        public void onClick(View object) {
            object = this.g.z();
            int n3 = Tools.L0(object);
            CharSequence charSequence = new StringBuilder();
            charSequence.append(" (");
            charSequence.append(n3);
            charSequence.append(')');
            String string2 = charSequence.toString();
            charSequence = b2.f(2131296896);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append(b2.f(2131296909));
            charSequence2.append(string2);
            charSequence2 = charSequence2.toString();
            CharSequence charSequence3 = new StringBuilder();
            charSequence3.append(b2.f(2131296895));
            charSequence3.append(string2);
            charSequence3 = charSequence3.toString();
            string2 = android.ext.f.b();
            object = new DialogInterface.OnClickListener(this, n3, object){
                final int a;
                final Object b;
                final p0 c;
                {
                    this.c = p02;
                    this.a = n3;
                    this.b = object;
                }

                public void onClick(DialogInterface dialogInterface, int n3) {
                    block5: {
                        block1: {
                            block2: {
                                block4: {
                                    block3: {
                                        if (n3 > 2 && this.a == 0) {
                                            Tools.H1(2131296822);
                                            return;
                                        }
                                        if (n3 == 0) break block1;
                                        if (n3 == 1) break block2;
                                        if (n3 == 2) break block3;
                                        if (n3 == 3) break block4;
                                        break block5;
                                    }
                                    this.c.g.L0(this.b, null);
                                }
                                this.c.g.H0(this.b);
                                break block5;
                            }
                            n2.d().postDelayed(new Runnable(this, dialogInterface){
                                final DialogInterface a;
                                final a b;
                                {
                                    this.b = a4;
                                    this.a = dialogInterface;
                                }

                                @Override
                                public void run() {
                                    android.ext.f.m((AlertDialog)this.a);
                                }
                            }, 1000L);
                            break block5;
                        }
                        android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296896)).setPositiveButton((CharSequence)b2.f(2131297115), new DialogInterface.OnClickListener(this){
                            final a a;
                            {
                                this.a = a4;
                            }

                            public void onClick(DialogInterface object, int n3) {
                                object = this.a.c;
                                boolean bl = ((p0)object).f;
                                object = ((p0)object).g;
                                if (bl) {
                                    ((MainService)object).t0.c();
                                } else {
                                    ((MainService)object).m();
                                }
                                c2 c22 = MainService.instance.f;
                                if (c22 != null) {
                                    object = this.a.c.f ? "\ngg.clearList()\n" : "\ngg.clearResults()\n";
                                    c22.write((String)object);
                                }
                            }
                        }).setNegativeButton((CharSequence)b2.f(2131296805), null));
                    }
                }
            };
            android.ext.f.o(string2.setItems((CharSequence[])new String[]{charSequence, "---", charSequence2, charSequence3}, (DialogInterface.OnClickListener)object).setNegativeButton((CharSequence)b2.f(2131296311), null));
        }
    }

    class q0
    extends p1 {
        int f;
        final MainService g;

        public q0(MainService mainService) {
            this.g = mainService;
            super(2131296911, 2130968658);
            this.f = 0;
        }

        void h() {
            int n3;
            Object object = this.g.z();
            android.ext.d d4 = new android.ext.d();
            android.ext.d d5 = this.g.u0;
            Object object2 = new d.a();
            if (object instanceof boolean[]) {
                if (this.f == 0) {
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    object2 = android.ext.c.o(this.g.N.q((boolean[])object, sparseIntArray));
                    if (sparseIntArray.size() > 0) {
                        new u2((e)((Object)object2), sparseIntArray, "0", b2.f(2131297030), new DialogInterface.OnClickListener(this){
                            final q0 a;
                            {
                                this.a = q02;
                            }

                            public void onClick(DialogInterface object, int n3) {
                                object = this.a;
                                ((q0)object).f = n3;
                                ((q0)object).h();
                            }
                        });
                        return;
                    }
                } else {
                    n1 n12 = this.g.N;
                    boolean[] blArray = (boolean[])object;
                    int n4 = blArray.length;
                    for (n3 = 1; n3 < n4 - 1; ++n3) {
                        if (!blArray[n3] || !((android.ext.c)(object = new android.ext.c(n12.e(n3), 0L, this.f))).V()) continue;
                        d5.a(((android.ext.c)object).a, ((android.ext.c)object).c, (d.a)object2);
                        if (!object2.b) continue;
                        d4.c(((android.ext.c)object).a, ((android.ext.c)object).c, object2.a);
                    }
                    this.f = 0;
                }
            } else {
                this.g.L0(object, d4);
            }
            if ((n3 = d4.e()) == 0) {
                Tools.H1(2131296823);
            } else {
                android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.g0(2131296911)).setMessage((CharSequence)Tools.L1(b2.f(2131296910), n3)).setPositiveButton((CharSequence)b2.f(2131297115), new DialogInterface.OnClickListener(this, d4){
                    final android.ext.d a;
                    final q0 b;
                    {
                        this.b = q02;
                        this.a = d4;
                    }

                    public void onClick(DialogInterface object, int n3) {
                        this.a.d();
                        object = MainService.instance.f;
                        if (object != null) {
                            ((c2)object).write("if revert ~= nil then gg.setValues(revert) end\n");
                        }
                    }
                }).setNegativeButton((CharSequence)b2.f(2131296805), null));
            }
        }

        @Override
        public void onClick(View view) {
            this.f = 0;
            this.h();
        }
    }

    class r0
    extends p1 {
        final MainService f;

        public r0(MainService mainService) {
            this.f = mainService;
            super(2131296920, 2130968600);
        }

        @Override
        public void onClick(View object) {
            object = this.f.z();
            int n3 = Tools.L0(object);
            if (n3 == 0) {
                Tools.H1(2131296822);
            } else if (object instanceof boolean[]) {
                SparseIntArray sparseIntArray = new SparseIntArray();
                new u2(android.ext.c.o(this.f.N.q((boolean[])object, sparseIntArray)), sparseIntArray, "0", b2.f(2131297030), new DialogInterface.OnClickListener(this, object, n3){
                    final Object a;
                    final int b;
                    final r0 c;
                    {
                        this.c = r02;
                        this.a = object;
                        this.b = n3;
                    }

                    public void onClick(DialogInterface object, int n3) {
                        n1 n12 = this.c.f.N;
                        boolean[] blArray = (boolean[])this.a;
                        int n4 = blArray.length;
                        for (int i3 = 1; i3 < n4 - 1; ++i3) {
                            if (!blArray[i3]) continue;
                            long l3 = n12.e(i3);
                            h2 h22 = new h2(l3, 0L, n3);
                            if (!h22.V()) {
                                h22.c = android.ext.c.S(h22.a, true);
                            }
                            if ((object = this.c.f.t0.e(l3)) != null && object.c == h22.c) continue;
                            this.c.f.t0.b(h22, (byte)0, false);
                        }
                        this.c.f.t0.notifyDataSetChanged();
                        this.c.f.t0.i();
                        Tools.J1(Tools.L1(b2.f(2131296721), this.b));
                    }
                });
            } else if (object instanceof d.a) {
                Object object2 = new ArrayList<android.ext.c>();
                object = (d.a)object;
                int n4 = ((d.a)object).i();
                for (int i3 = 0; i3 < n4; ++i3) {
                    if (!((d.a)object).c(i3)) continue;
                    object2.add(((d.a)object).f(i3, null));
                }
                object = object2.iterator();
                while (object.hasNext()) {
                    android.ext.c c4 = (android.ext.c)object.next();
                    object2 = this.f.t0.e(c4.a);
                    if (object2 != null && ((android.ext.c)object2).c == c4.c) continue;
                    this.f.t0.b(new h2(c4), (byte)0, false);
                }
                this.f.t0.notifyDataSetChanged();
                this.f.t0.i();
                Tools.J1(Tools.L1(b2.f(2131296721), n3));
                object = MainService.instance.f;
                if (object != null) {
                    ((c2)object).write("\nlocal t = ");
                    android.ext.b0.n((c2)object, true);
                    ((c2)object).write("gg.addListItems(t)\n");
                    ((c2)object).write("t = nil\n\n");
                }
            }
        }
    }

    private class s0
    extends p1 {
        final MainService f;

        public s0(MainService mainService) {
            this.f = mainService;
            super(2131296948, 2130968648);
        }

        @Override
        public void onClick(View view) {
            this.f.j(1);
        }
    }
}

