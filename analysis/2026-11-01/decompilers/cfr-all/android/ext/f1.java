/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.PackageInfo
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.TextView
 */
package android.ext;

import a.d;
import a.f;
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
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b1;
import android.ext.b2;
import android.ext.c1;
import android.ext.e0;
import android.ext.e1;
import android.ext.e2;
import android.ext.g0;
import android.ext.h0;
import android.ext.h2;
import android.ext.i;
import android.ext.k;
import android.ext.l2;
import android.ext.n0;
import android.ext.n2;
import android.ext.p1;
import android.ext.p2;
import android.ext.q1;
import android.ext.r;
import android.ext.r0;
import android.ext.s0;
import android.ext.s1;
import android.ext.t;
import android.ext.u;
import android.ext.v;
import android.ext.y0;
import android.ext.z;
import android.ext.z0;
import android.os.Build;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.AnalyticsService;
import catch_.me_.if_.you_.can_.Instrumentation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

public abstract class f1 {
    public static volatile Boolean a;
    public static volatile boolean b = false;
    static volatile int c = 0;
    static volatile boolean d = false;

    /*
     * Unable to fully structure code
     */
    static boolean A() {
        block6: {
            block7: {
                block5: {
                    var0 = true;
                    v.b = true;
                    var1_1 = Tools.C0();
                    var2_5 = r.p;
                    var3_6 = new Intent();
                    var2_5 = var2_5.startService(var3_6.setClassName((String)var1_1, AnalyticsService.class.getName()));
                    if (var2_5 == null) {
                        var0 = false;
                    }
                    if (var2_5 != null) break block5;
                    var1_1 = null;
                    ** GOTO lbl23
                }
                try {
                    var1_1 = new StringBuilder();
                    var1_1.append(var2_5.toString());
                    var1_1.append(' ');
                    var1_1.append(var2_5.toShortString());
                    var1_1 = var1_1.toString();
lbl23:
                    // 2 sources

                    f1.B(10, (String)var1_1);
                    break block6;
                }
                catch (Throwable var1_2) {
                    break block7;
                }
                catch (Throwable var1_3) {
                    var0 = false;
                }
            }
            e1.l("Failed load Service", (Throwable)var1_4);
        }
        return var0;
    }

    static void B(int n3, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("main ");
        stringBuilder.append(n3);
        stringBuilder.append(':');
        stringBuilder.append(Process.myUid());
        stringBuilder.append(": ");
        stringBuilder.append(u.c());
        stringBuilder.append(' ');
        Boolean bl = r.n == null ? null : Boolean.valueOf(r.n.d);
        stringBuilder.append(bl);
        stringBuilder.append(' ');
        stringBuilder.append((Object)u.b);
        stringBuilder.append(' ');
        stringBuilder.append((Object)v.a);
        stringBuilder.append(' ');
        stringBuilder.append(string2);
        e1.d(stringBuilder.toString());
    }

    private static void C() {
        try {
            File file = new File(Tools.q0(), "client_exit");
            if (!file.exists() && !file.createNewFile()) {
                e1.e.a("AndroidService", "Failed mark client exit");
            }
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed mark client exit: ");
            stringBuilder.append(throwable);
            e1.e.a("AndroidService", stringBuilder.toString());
        }
    }

    public static void D() {
        r.n.L(2);
        if (d) {
            return;
        }
        d = true;
        h0.i();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GG started: ");
        float f4 = 1.0f;
        stringBuilder.append(108.9f * f4 - 7.5f);
        stringBuilder.append(" (");
        stringBuilder.append((int)(f4 * 16916.8f - 761.8f + 0.5f));
        stringBuilder.append(") on ");
        stringBuilder.append(h0.b());
        e1.h(stringBuilder.toString());
        new r0(false);
        new h2(0L, 0L, 0);
        if (!s1.E()) {
            r.n.m();
            z.m();
        }
        t.c();
        y0.e();
        new q1().h();
        f1.h();
        n0.b();
        f1.B(5, null);
        f1.b();
        f1.l();
        f1.c();
        f1.j();
        f1.g();
        f1.k();
        if (!s1.E()) {
            f1.d(false);
        }
        c1.g();
        p2.i();
        ConfigListAdapter.j(3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String E() {
        Throwable throwable3;
        block6: {
            Throwable throwable22;
            FileInputStream fileInputStream;
            block7: {
                Object object = new File(Tools.q0(), "FC.txt");
                if (!((File)object).exists()) {
                    return null;
                }
                try {
                    fileInputStream = new FileInputStream((File)object);
                }
                catch (Throwable throwable3) {
                    break block6;
                }
                try {
                    byte[] byArray = new byte[41];
                    int n3 = ((InputStream)fileInputStream).read(byArray);
                    object = n3 > 0 ? new String(byArray, 0, n3) : null;
                }
                catch (Throwable throwable22) {
                    break block7;
                }
                ((InputStream)fileInputStream).close();
                return object;
            }
            ((InputStream)fileInputStream).close();
            throw throwable22;
        }
        e1.l("Fail get FC file", throwable3);
        return null;
    }

    static void F() {
        if (f1.t()) {
            return;
        }
        boolean bl = s1.Q();
        String string2 = f1.E();
        boolean bl2 = s0.c(s0.a(string2), s0.e(string2), f1.s(), f1.m());
        f1.d(true);
        f1.a();
        if (bl2 && !bl) {
            s1.v(4, "");
        }
    }

    static boolean G(Runnable runnable) {
        return f1.e(false, runnable);
    }

    public static void H() {
        if (c == 0) {
            return;
        }
        n2.i(new Runnable(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                CharSequence charSequence;
                Object object;
                Context context;
                try {
                    context = Tools.f0();
                    object = f1.u();
                    charSequence = new StringBuilder();
                    charSequence.append("Restart: true ");
                    charSequence.append(Config.z);
                    charSequence.append(' ');
                    charSequence.append(object);
                    e1.e.a("AndroidService", charSequence.toString());
                    if (!Config.vSpaceReal && Config.z == 0 && object != null && context.startInstrumentation((ComponentName)object, null, r.u())) {
                        e1.e.a("AndroidService", "Restart 1");
                    }
                }
                catch (Throwable throwable) {
                    throw new RuntimeException("Failed restart", throwable);
                }
                e1.e.a("AndroidService", "Restart 2");
                charSequence = Tools.C0();
                object = r.t();
                ComponentName componentName = new ComponentName((String)charSequence, (String)object);
                Tools.w1(200, componentName, 1);
                charSequence = Tools.N0(context, (String)charSequence, (String)object);
                object = new StringBuilder();
                ((StringBuilder)object).append("Restart: ");
                ((StringBuilder)object).append((Object)charSequence);
                e1.d(((StringBuilder)object).toString());
                object = PendingIntent.getActivity((Context)context, (int)123456, (Intent)charSequence, (int)0x10000000);
                ((AlarmManager)context.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000L, (PendingIntent)object);
                f1.n();
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void I() {
        Object object;
        Object var2;
        block9: {
            block8: {
                Throwable throwable2;
                block10: {
                    block6: {
                        block7: {
                            var2 = null;
                            try {
                                int n3 = Config.z;
                                if (n3 == 2) break block6;
                                if (n3 == 3) break block7;
                                if (n3 != 4) break block8;
                                object = r.n.getBaseContext();
                                break block9;
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                        }
                        object = r.o;
                        break block9;
                    }
                    object = r.n.createPackageContext(r.n.getPackageName(), 3);
                    break block9;
                }
                e1.a(throwable2);
            }
            object = null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setContext: ");
        stringBuilder.append(Config.z);
        stringBuilder.append(' ');
        stringBuilder.append(object);
        e1.d(stringBuilder.toString());
        if (object != null) {
            try {
                ((d)((Object)f.a(LayoutInflater.from((Context)object)))).inflate(2131099677, null);
            }
            catch (Throwable throwable) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed use context: ");
                stringBuilder.append(object);
                e1.s(stringBuilder.toString(), throwable);
                object = var2;
            }
        }
        if (object != null) {
            Tools.X0((Context)object);
            MainService.context = l2.i((Context)object);
            f1.O();
            f1.D();
            return;
        }
        v.d = true;
        if (f1.A()) return;
        object = new StringBuilder();
        ((StringBuilder)object).append(Tools.N1(2131296350));
        ((StringBuilder)object).append(": ");
        ((StringBuilder)object).append(b2.f(2131296955));
        Tools.J1(((StringBuilder)object).toString());
        r.n.T();
    }

    static Runnable J(Context context, String string2, long l3, boolean bl) {
        return new Runnable(context, string2, l3){
            final Context a;
            final String b;
            final long c;
            {
                this.a = context;
                this.b = string2;
                this.c = l3;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                Throwable throwable2;
                block3: {
                    Context context;
                    block2: {
                        try {
                            Context context2;
                            context = context2 = this.a;
                            if (context2 != null) break block2;
                            context = Tools.f0();
                        }
                        catch (Throwable throwable2) {
                            break block3;
                        }
                    }
                    context = android.ext.f.c(context).setMessage((CharSequence)this.b).setPositiveButton((CharSequence)b2.f(2131296836), null).setNeutralButton((CharSequence)b2.f(2131296963), f1.w(this.c)).create();
                    android.ext.f.m((AlertDialog)context);
                    Tools.u1((AlertDialog)context);
                    return;
                }
                e1.a(throwable2);
            }
        };
    }

    public static void K() {
        n2.i(new Runnable(){

            /*
             * Enabled aggressive block sorting
             */
            @Override
            public void run() {
                byte by = 1;
                f1.B(1, null);
                boolean bl = b1.j0().a;
                Object object = r.n;
                boolean bl2 = bl && (!Config.vSpaceReal || Config.D);
                ((r)((Object)object)).d = bl2;
                if (bl) {
                    bl2 = ConfigListAdapter.k();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Install64: ");
                    ((StringBuilder)object).append(bl2);
                    e1.d(((StringBuilder)object).toString());
                    if (bl2) {
                        f1.M();
                        return;
                    }
                    f1.L();
                    return;
                }
                r.q = false;
                if (d) {
                    f1.B(8, null);
                } else {
                    bl2 = u.c();
                    if (!bl2) {
                        by = 2;
                    }
                    f1.f(by);
                    if (!bl2) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Not instr: ");
                        ((StringBuilder)object).append(Process.myUid());
                        e1.d(((StringBuilder)object).toString());
                        object = new StringBuilder();
                        ((StringBuilder)object).append("");
                        ((StringBuilder)object).append(Config.z);
                        f1.B(2, ((StringBuilder)object).toString());
                        n2.i(new Runnable(this){
                            final a a;
                            {
                                this.a = a4;
                            }

                            /*
                             * Loose catch block
                             * WARNING - void declaration
                             * Enabled aggressive block sorting
                             * Enabled unnecessary exception pruning
                             * Enabled aggressive exception aggregation
                             */
                            @Override
                            public void run() {
                                block10: {
                                    void var3_6;
                                    boolean bl;
                                    block9: {
                                        boolean bl2;
                                        StringBuilder stringBuilder;
                                        block8: {
                                            block7: {
                                                block6: {
                                                    ComponentName componentName;
                                                    bl = false;
                                                    try {
                                                        if (Config.vSpaceReal || Config.z != 0) break block6;
                                                        componentName = f1.u();
                                                        if (componentName == null) break block7;
                                                        stringBuilder = new StringBuilder();
                                                        stringBuilder.append("Try instr: ");
                                                        stringBuilder.append(Process.myUid());
                                                        e1.d(stringBuilder.toString());
                                                        f1.f((byte)0);
                                                    }
                                                    catch (Throwable throwable) {}
                                                    bl2 = r.p.startInstrumentation(componentName, null, r.u());
                                                    f1.f((byte)1);
                                                    stringBuilder = new StringBuilder();
                                                    stringBuilder.append("Fail instr: ");
                                                    stringBuilder.append(Process.myUid());
                                                    e1.d(stringBuilder.toString());
                                                    break block8;
                                                    break block9;
                                                    catch (Throwable throwable) {
                                                        bl = true;
                                                    }
                                                    break block9;
                                                }
                                                f1.i();
                                            }
                                            bl2 = false;
                                        }
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("");
                                        stringBuilder.append(bl2);
                                        stringBuilder.append(' ');
                                        stringBuilder.append(Config.z);
                                        f1.B(3, stringBuilder.toString());
                                        break block10;
                                    }
                                    e1.l("Failed load Instrumentation", (Throwable)var3_6);
                                    if (bl) {
                                        f1.f((byte)1);
                                    }
                                }
                                f1.B(6, null);
                                f1.I();
                            }
                        });
                        f1.B(4, null);
                        return;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Use instr: ");
                    ((StringBuilder)object).append(Process.myUid());
                    e1.d(((StringBuilder)object).toString());
                    f1.B(9, null);
                    f1.O();
                }
                f1.D();
            }
        });
    }

    static void L() {
        r.n.L(1);
        b1.z1();
    }

    static void M() {
        z0.h();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean N() {
        Throwable throwable2;
        boolean bl;
        block3: {
            boolean bl2;
            boolean bl3 = false;
            bl = bl2 = false;
            try {
                Object object = Tools.f0();
                if (object != null) {
                    bl = bl2;
                    String string2 = Tools.C0();
                    bl = bl2;
                    bl = bl2;
                    Intent intent = new Intent();
                    bl = bl2;
                    bl = bl3 = object.stopService(intent.setClassName(string2, AnalyticsService.class.getName()));
                    bl = bl3;
                    object = new StringBuilder();
                    bl = bl3;
                    ((StringBuilder)object).append(" ");
                    bl = bl3;
                    ((StringBuilder)object).append(bl3);
                    bl = bl3;
                    f1.B(100, ((StringBuilder)object).toString());
                    return bl3;
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            bl = bl2;
            f1.B(101, "");
            return bl3;
        }
        e1.l("Failed unload Service", throwable2);
        return bl;
    }

    static void O() {
        if (Config.z == 1) {
            return;
        }
        if ((Config.B & 0x100) != 0) {
            f1.A();
        } else {
            f1.N();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void P(File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
        }
        catch (Throwable throwable) {}
        try {
            ((OutputStream)fileOutputStream).write(s0.b(f1.s(), f1.m()).getBytes());
        }
        catch (Throwable throwable) {
            ((OutputStream)fileOutputStream).close();
            throw throwable;
        }
        ((OutputStream)fileOutputStream).close();
        return;
        e1.l("Fail set FC file", throwable);
    }

    static void a() {
        if (f1.t()) {
            return;
        }
        File file = new File(Tools.q0(), "FC.txt");
        if (file.exists()) {
            return;
        }
        f1.P(file);
    }

    public static void b() {
        new g0(new Runnable(){

            @Override
            public void run() {
                try {
                    Object object = Tools.M0();
                    DialogInterface.OnClickListener onClickListener = object.getString("improve-translate", "");
                    CharSequence charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(b2.f(2131297084));
                    ((StringBuilder)charSequence).append(':');
                    ((StringBuilder)charSequence).append(b2.f(2131296732));
                    charSequence = ((StringBuilder)charSequence).toString();
                    if (((String)charSequence).equals(onClickListener)) {
                        return;
                    }
                    onClickListener = b2.f(2131296694);
                    if (!b2.f(2131296502).contains((CharSequence)onClickListener)) {
                        return;
                    }
                    onClickListener = new DialogInterface.OnClickListener(this, (SharedPreferences)object, (String)charSequence){
                        final SharedPreferences a;
                        final String b;
                        final g c;
                        {
                            this.c = g4;
                            this.a = sharedPreferences;
                            this.b = string2;
                        }

                        public void onClick(DialogInterface dialogInterface, int n3) {
                            if (n3 == -1) {
                                new r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:8770li0|rx0zdqw0wr0dgg0d0qhz0wudqvodwlrq0ru0lpsuryh0dq0h{lvwlqj2").onClick(dialogInterface, n3);
                            }
                            this.a.edit().putString("improve-translate", this.b).commit();
                        }
                    };
                    object = new Runnable(this, onClickListener){
                        final DialogInterface.OnClickListener a;
                        final g b;
                        {
                            this.b = g4;
                            this.a = onClickListener;
                        }

                        @Override
                        public void run() {
                            android.ext.f.o(android.ext.f.b().setMessage((CharSequence)b2.f(2131296693)).setPositiveButton((CharSequence)b2.f(2131296962), this.a).setNegativeButton((CharSequence)b2.f(2131296963), this.a));
                        }
                    };
                    n2.i((Runnable)object);
                }
                catch (Throwable throwable) {
                    e1.l("checkAutoTranslation", throwable);
                }
            }
        }, "checkAutoTranslation").start();
    }

    private static void c() {
        new g0(new Runnable(){

            @Override
            public void run() {
                if ((Config.c & 8L) != 0L) {
                    return;
                }
                CharSequence charSequence = new StringBuilder();
                String[] stringArray = n0.e();
                for (int i3 = 2; i3 < stringArray.length; i3 += 2) {
                    String string2 = stringArray[i3];
                    int n3 = i3 + 1;
                    if (!Tools.e1(stringArray[n3])) continue;
                    ((StringBuilder)charSequence).append('\n');
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append(" (");
                    ((StringBuilder)charSequence).append(stringArray[n3]);
                    ((StringBuilder)charSequence).append(')');
                }
                if (((StringBuilder)charSequence).length() == 0) {
                    return;
                }
                ((StringBuilder)charSequence).append('\n');
                charSequence = ((StringBuilder)charSequence).toString();
                n2.i(f1.J(r.p, Tools.L1(b2.f(2131296730), charSequence), 8L, false));
            }
        }, "checkBadApps").start();
    }

    private static void d(boolean bl) {
        f1.e(bl, null);
    }

    private static boolean e(boolean bl, Runnable runnable) {
        boolean bl2 = f1.t();
        boolean bl3 = false;
        if (bl2) {
            return false;
        }
        File file = new File(Tools.q0(), "FC.txt");
        if (bl) {
            file.delete();
            return false;
        }
        Object object = f1.E();
        bl = bl3;
        if (s0.c(s0.a((String)object), s0.e((String)object), f1.s(), f1.m())) {
            bl = true;
            object = new boolean[1];
            AlertDialog alertDialog = android.ext.f.b().setMessage((CharSequence)b2.f(2131296468)).setPositiveButton((CharSequence)b2.f(2131296455), new DialogInterface.OnClickListener((boolean[])object, runnable){
                final boolean[] a;
                final Runnable b;
                {
                    this.a = blArray;
                    this.b = runnable;
                }

                public void onClick(DialogInterface object, int n3) {
                    this.a[0] = true;
                    AlertDialog.Builder builder = android.ext.f.b().setCustomTitle(Tools.g0(2131296455));
                    String string2 = Config.b(2131034186).toString();
                    object = Config.b(2131034188).toString();
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this){
                        final e a;
                        {
                            this.a = e4;
                        }

                        /*
                         * Enabled aggressive block sorting
                         */
                        public void onClick(DialogInterface dialogInterface, int n3) {
                            if (n3 != 0) {
                                if (n3 != 1) {
                                    return;
                                }
                                n3 = 2131034188;
                            } else {
                                n3 = 2131034186;
                            }
                            Config.b(n3).b();
                        }
                    };
                    object = builder.setItems((CharSequence[])new String[]{string2, object}, onClickListener).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
                    if (this.b != null) {
                        android.ext.f.k((AlertDialog)object, new DialogInterface.OnDismissListener(this){
                            final e a;
                            {
                                this.a = e4;
                            }

                            public void onDismiss(DialogInterface dialogInterface) {
                                this.a.b.run();
                            }
                        });
                    }
                    android.ext.f.m((AlertDialog)object);
                }
            }).setNegativeButton((CharSequence)b2.f(2131296963), f1.w(64L)).setNeutralButton((CharSequence)b2.f(2131296519), new DialogInterface.OnClickListener(){

                public void onClick(DialogInterface dialogInterface, int n3) {
                    ConfigListAdapter.t(2131296614);
                }
            }).create();
            if (runnable != null) {
                android.ext.f.k(alertDialog, new DialogInterface.OnDismissListener((boolean[])object, runnable){
                    final boolean[] a;
                    final Runnable b;
                    {
                        this.a = blArray;
                        this.b = runnable;
                    }

                    public void onDismiss(DialogInterface dialogInterface) {
                        if (!this.a[0]) {
                            this.b.run();
                        }
                    }
                });
            }
            android.ext.f.m(alertDialog);
        }
        file.delete();
        f1.P(file);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void f(byte by) {
        File file;
        block16: {
            int n3;
            block18: {
                FileOutputStream fileOutputStream;
                file = new File(Tools.q0(), "instr.check");
                n3 = (int)(1.0f * 16258.4f - 103.4f + 0.5f);
                if (by != 0) break block18;
                try {
                    fileOutputStream = new FileOutputStream(file);
                }
                catch (Throwable throwable) {}
                try {
                    ((OutputStream)fileOutputStream).write(Integer.toString(n3).getBytes());
                }
                catch (Throwable throwable) {
                    ((OutputStream)fileOutputStream).close();
                    throw throwable;
                }
                ((OutputStream)fileOutputStream).close();
                return;
                e1.l("Fail set instr file", throwable);
                return;
            }
            if (by == 1) {
                if (!file.exists()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("No instr file: ");
                    stringBuilder.append(file);
                    e1.i(stringBuilder.toString());
                }
            } else {
                Throwable throwable3;
                block17: {
                    Throwable throwable22;
                    FileInputStream fileInputStream;
                    block15: {
                        block14: {
                            if (!file.exists()) return;
                            try {
                                fileInputStream = new FileInputStream(file);
                            }
                            catch (Throwable throwable3) {
                                break block17;
                            }
                            try {
                                byte[] byArray = new byte[12];
                                int n4 = ((InputStream)fileInputStream).read(byArray);
                                by = 0;
                                if (n4 <= 0) break block14;
                                String string2 = new String(byArray, 0, n4);
                                by = (byte)Integer.parseInt(string2);
                            }
                            catch (Throwable throwable22) {
                                break block15;
                            }
                        }
                        if (by == n3 && Config.z == 0) {
                            Config.b((int)2131034157).d = 1;
                            Config.k();
                        }
                        ((InputStream)fileInputStream).close();
                        break block16;
                    }
                    ((InputStream)fileInputStream).close();
                    throw throwable22;
                }
                e1.l("Fail get instr file", throwable3);
            }
        }
        file.delete();
    }

    private static void g() {
        if ((Config.c & 0x80L) != 0L) {
            return;
        }
        try {
            String string2 = Tools.L1("%e", Float.valueOf(1.2E34f));
            if (string2.indexOf(101) == -1 && string2.indexOf(69) == -1 && string2.indexOf(1077) == -1 && string2.indexOf(1045) == -1) {
                n2.i(f1.J(r.p, Tools.L1(b2.f(2131297113), Float.toString(1.2E34f), string2), 128L, false));
            }
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    private static void h() {
        new g0(new Runnable(){

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                block22: {
                    f1.a = Boolean.FALSE;
                    var5_1 = new StringBuilder();
                    var5_1.append("");
                    var5_1.append((float)true * 112.0f - 10.6f);
                    var6_6 = var5_1.toString();
                    var7_7 = null;
                    {
                        block27: {
                            block26: {
                                block25: {
                                    block23: {
                                        block24: {
                                            catch (Throwable var5_4) {
                                                break block22;
                                            }
                                            try {
                                                var5_1 = new StringBuilder();
                                                var8_9 = Tools.M0();
                                                var1_10 = 0;
lbl17:
                                                // 2 sources

                                                while (var1_10 < 4) {
                                                    var9_11 = new StringBuilder();
                                                    var9_11.append("used-");
                                                    var9_11.append(var1_10);
                                                    var9_11 = var9_11.toString();
                                                    if (!var8_9.contains((String)var9_11) || (var9_11 = var8_9.getString((String)var9_11, "")).length() == 0) break block23;
                                                    if (var5_1.length() == 0) break block24;
                                                    var5_1.append('&');
                                                    break block24;
                                                }
                                                break block25;
                                            }
                                            catch (Throwable var5_2) {
                                                ** GOTO lbl-1000
                                            }
                                        }
                                        var5_1.append(var1_10);
                                        var5_1.append('=');
                                        var5_1.append((String)var9_11);
                                    }
                                    ++var1_10;
                                    ** GOTO lbl17
                                }
                                var8_9 = var8_9.edit();
                                for (var1_10 = 0; var1_10 < 4; ++var1_10) {
                                    var9_11 = new StringBuilder();
                                    var9_11.append("used-");
                                    var9_11.append(var1_10);
                                    var8_9.remove(var9_11.toString());
                                }
                                {
                                    var8_9.commit();
                                    var5_1 = (Runnable)var5_1.toString().getBytes();
                                    ** GOTO lbl60
                                }
lbl-1000:
                                // 1 sources

                                {
                                    e1.a(var5_2);
                                    var5_1 = null;
lbl60:
                                    // 2 sources

                                    var8_9 = new StringBuilder();
                                    var8_9.append(Tools.L1(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2JJborjv2yhuvlrq1sksBv@(g)y@(v)o@(v)w@(v)d@(g)r@(v)x@(v"), new Object[]{Build.VERSION.SDK_INT, var6_6, k.b(), b2.f(2131296732), e0.f(), f1.v(), f1.x()}));
                                    var8_9.append(p1.d());
                                    var8_9.append(ConfigListAdapter.i());
                                    var9_11 = new URL(var8_9.toString());
                                    var8_9 = var9_11.openConnection();
                                    if (var5_1 == null) break block26;
                                }
                                try {
                                    var8_9.setDoOutput(true);
                                    var9_11 = new GZIPOutputStream(var8_9.getOutputStream());
                                    var9_11.write((byte[])var5_1);
                                    var9_11.close();
                                    break block26;
                                }
                                catch (Throwable var5_3) {}
                                e1.a(var5_3);
                            }
                            var5_1 = new InputStreamReader(var8_9.getInputStream());
                            var11_12 = new BufferedReader((Reader)var5_1);
                            var10_13 = new StringBuilder();
                            var3_14 = h0.e((String)var6_6);
                            var1_10 = h0.e(Float.toString(i.a));
                            var8_9 = "";
                            var9_11 = null;
                            block14: while (true) {
                                var5_1 = var11_12.readLine();
                                var6_6 = var7_7;
                                if (var5_1 == null) break block27;
                                var6_6 = var7_7;
                                if (var7_7 == null) {
                                    var6_6 = var5_1;
                                }
                                if ("".equals(var8_9)) {
                                    if (h0.e((String)var5_1) <= var3_14) break block27;
                                    var9_11 = var5_1;
                                }
                                var10_13.append((String)var5_1);
                                var10_13.append('\n');
                                var2_15 = var1_10;
                                if (var5_1.contains("ARMv5")) {
                                    var4_16 = h0.e((String)var9_11);
                                    var2_15 = var1_10;
                                    if (var4_16 > var1_10) {
                                        i.a = Float.parseFloat((String)var9_11);
                                        var2_15 = h0.e((String)var9_11);
                                    }
                                }
lbl109:
                                // 6 sources

                                while (true) {
                                    var1_10 = var2_15;
                                    var7_7 = var6_6;
                                    var8_9 = var5_1;
                                    continue block14;
                                    break;
                                }
                                break;
                            }
                            catch (NumberFormatException var7_8) {
                                var8_9 = new StringBuilder();
                                var8_9.append("Failed parse as float '");
                                var8_9.append((String)var9_11);
                                var8_9.append("'");
                                e1.s(var8_9.toString(), var7_8);
                                var2_15 = var1_10;
                                ** continue;
                            }
                        }
                        var11_12.close();
                        var7_7 = new StringBuilder();
                        var7_7.append("Server version: ");
                        if (var6_6 != null) {
                            var5_1 = new StringBuilder();
                            var5_1.append((String)var6_6);
                            var5_1.append(' ');
                            var5_1.append(h0.e((String)var6_6));
                            var5_1 = var5_1.toString();
                        } else {
                            var5_1 = "null";
                        }
                        var7_7.append((String)var5_1);
                        e1.d(var7_7.toString());
                        if (var6_6 == null) return;
                        if (h0.e((String)var6_6) <= var3_14) return;
                        f1.a = Boolean.TRUE;
                        var5_1 = new Runnable(this, var10_13, (String)var6_6){
                            final StringBuilder a;
                            final String b;
                            final b c;
                            {
                                this.c = b4;
                                this.a = stringBuilder;
                                this.b = string2;
                            }

                            @Override
                            public void run() {
                                View view = a.d.f(2131099658, null);
                                Tools.v1((TextView)view.findViewById(2131034148), this.a.toString());
                                android.ext.f.o(android.ext.f.b().setCustomTitle(Tools.h0(Tools.L1(b2.f(2131296478), this.b))).setView(view).setCancelable(false).setPositiveButton((CharSequence)b2.f(2131296388), (DialogInterface.OnClickListener)new r.n(null)).setNegativeButton((CharSequence)b2.f(2131296836), null));
                            }
                        };
                        n2.i(var5_1);
                        return;
                    }
                }
                e1.l("checkNewVersion", var5_4);
            }
        }, "checkNewVersion").start();
    }

    static void i() {
        if (!Tools.e1("com.chaozhuo.permission.controller")) {
            return;
        }
        if ((Config.c & 4L) != 0L) {
            return;
        }
        CharSequence charSequence = new StringBuilder();
        charSequence.append(b2.f(2131296791));
        charSequence.append("\n\n");
        charSequence.append(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25<70krz0wr0uxq0lq0skrhql{rv0jdphjxdugldq2"));
        charSequence = charSequence.toString();
        n2.i(f1.J(r.p, (String)charSequence, 4L, true));
    }

    private static void j() {
        new g0(new Runnable(){

            @Override
            public void run() {
                if ((Config.c & 0x10L) == 0L && Config.vSpaceReal && b1.B0()) {
                    n2.i(f1.J(r.p, b2.f(2131296794), 16L, false));
                }
            }
        }, "checkRandomName").start();
    }

    private static void k() {
        Object object;
        block3: {
            object = new File(Tools.q0(), "sel.txt");
            try {
                boolean bl = ((File)object).exists();
                if (!bl) {
                    return;
                }
                if ((Config.A & 4) != 0) break block3;
            }
            catch (Throwable throwable) {
                e1.a(throwable);
                return;
            }
            f1.d(true);
            AlertDialog.Builder builder = android.ext.f.b().setCustomTitle(Tools.g0(2131296736));
            String string2 = b2.f(2131297104);
            String string3 = b2.f(2131296963);
            object = new DialogInterface.OnClickListener((File)object){
                final File a;
                {
                    this.a = file;
                }

                public void onClick(DialogInterface dialogInterface, int n3) {
                    this.a.delete();
                    if (n3 == 0) {
                        Config.b((int)2131034402).d = 1;
                        Config.k();
                        r.I();
                    }
                }
            };
            android.ext.f.m(builder.setItems((CharSequence[])new String[]{string2, string3}, (DialogInterface.OnClickListener)object).create());
            return;
        }
        ((File)object).delete();
    }

    private static void l() {
        new g0(new Runnable(){

            @Override
            public void run() {
                String string2;
                block3: {
                    if ((Config.c & 0x20L) != 0L) {
                        return;
                    }
                    for (int i3 = 0; i3 < 143; ++i3) {
                        if (!new File((new String[]{"/system/priv-app/com.bluestacks.settings", "/system/priv-app/com.bluestacks.settings/com.bluestacks.settings.apk", "/system/priv-app/com.bluestacks.bstfolder", "/system/priv-app/com.bluestacks.bstfolder/com.bluestacks.bstfolder.apk", "/system/priv-app/com.bluestacks.BstCommandProcessor", "/system/priv-app/com.bluestacks.BstCommandProcessor/com.bluestacks.BstCommandProcessor.apk", "/boot/android/android/system/priv-app/com.bluestacks.settings", "/boot/android/android/system/priv-app/com.bluestacks.settings/com.bluestacks.settings.apk", "/boot/android/android/system/priv-app/com.bluestacks.bstfolder", "/boot/android/android/system/priv-app/com.bluestacks.bstfolder/com.bluestacks.bstfolder.apk", "/boot/android/android/system/priv-app/com.bluestacks.BstCommandProcessor", "/boot/android/android/system/priv-app/com.bluestacks.BstCommandProcessor/com.bluestacks.BstCommandProcessor.apk", "/storage/emulated/0/Android/data/com.bluestacks.settings", "/storage/emulated/0/Android/data/com.bluestacks.home", "/mnt/runtime/write/emulated/0/Android/data/com.bluestacks.settings", "/mnt/runtime/write/emulated/0/Android/data/com.bluestacks.home", "/mnt/runtime/read/emulated/0/Android/data/com.bluestacks.settings", "/mnt/runtime/read/emulated/0/Android/data/com.bluestacks.home", "/mnt/runtime/default/emulated/0/Android/data/com.bluestacks.settings", "/mnt/runtime/default/emulated/0/Android/data/com.bluestacks.home", "/data/.bluestacks.prop", "/data/misc/profiles/cur/0/com.bluestacks.settings", "/data/misc/profiles/cur/0/com.bluestacks.BstCommandProcessor", "/data/misc/profiles/cur/0/com.bluestacks.appmart", "/data/misc/profiles/cur/0/com.bluestacks.bstfolder", "/data/misc/profiles/cur/0/com.bluestacks.home", "/data/misc/profiles/cur/0/com.bluestacks.filemanager", "/data/misc/profiles/cur/0/com.bluestacks.appguidance", "/data/misc/profiles/ref/com.bluestacks.settings", "/data/misc/profiles/ref/com.bluestacks.BstCommandProcessor", "/data/misc/profiles/ref/com.bluestacks.appmart", "/data/misc/profiles/ref/com.bluestacks.bstfolder", "/data/misc/profiles/ref/com.bluestacks.home", "/data/misc/profiles/ref/com.bluestacks.filemanager", "/data/misc/profiles/ref/com.bluestacks.appguidance", "/data/media/0/Android/data/com.bluestacks.settings", "/data/media/0/Android/data/com.bluestacks.home", "/data/data/com.bluestacks.settings", "/data/data/com.bluestacks.BstCommandProcessor", "/data/data/com.bluestacks.appmart", "/data/data/com.bluestacks.bstfolder", "/data/data/com.bluestacks.home", "/data/data/com.bluestacks.filemanager", "/data/data/com.bluestacks.appguidance", "/data/downloads/com.bluestacks.appmart", "/data/downloads/com.bluestacks.home", "/data/downloads/com.bluestacks.filemanager", "/data/app-lib/com.bluestacks.settings", "/data/app-lib/com.bluestacks.BstCommandProcessor", "/data/app-lib/com.bluestacks.appmart", "/data/app-lib/com.bluestacks.bstfolder", "/data/app-lib/com.bluestacks.home", "/data/app-lib/com.bluestacks.filemanager", "/data/user_de/0/com.bluestacks.settings", "/data/user_de/0/com.bluestacks.BstCommandProcessor", "/data/user_de/0/com.bluestacks.appmart", "/data/user_de/0/com.bluestacks.bstfolder", "/data/user_de/0/com.bluestacks.home", "/data/user_de/0/com.bluestacks.filemanager", "/data/user_de/0/com.bluestacks.appguidance", "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.BstCommandProcessor@com.bluestacks.BstCommandProcessor.apk@classes.dex", "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.bstfolder@com.bluestacks.bstfolder.apk@classes.dex", "/data/dalvik-cache/x86/data@downloads@com.bluestacks.appmart@com.bluestacks.appmart.apk@classes.dex", "/data/dalvik-cache/x86/data@downloads@com.bluestacks.filemanager@com.bluestacks.filemanager.apk@classes.dex", "/data/dalvik-cache/x86/data@downloads@com.bluestacks.home@com.bluestacks.home.apk@classes.dex", "/data/dalvik-cache/x86/system@priv-app@com.bluestacks.settings@com.bluestacks.settings.apk@classes.dex", "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.BstCommandProcessor@com.bluestacks.BstCommandProcessor.apk@classes.dex", "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.bstfolder@com.bluestacks.bstfolder.apk@classes.dex", "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.appmart@com.bluestacks.appmart.apk@classes.dex", "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.filemanager@com.bluestacks.filemanager.apk@classes.dex", "/data/dalvik-cache/x86_64/data@downloads@com.bluestacks.home@com.bluestacks.home.apk@classes.dex", "/data/dalvik-cache/x86_64/system@priv-app@com.bluestacks.settings@com.bluestacks.settings.apk@classes.dex", "/system/lib64/libbstfolder_jni.so", "/system/lib64/egl/libGLES_bst.so", "/system/lib64/hw/gralloc.bst.so", "/system/lib/libbstfolder_jni.so", "/system/lib/egl/libGLES_bst.so", "/system/lib/hw/gralloc.bst.so", "/system/bin/bstsvcmgrtest", "/system/bin/bstshutdown_core", "/system/bin/bstfolderd", "/system/bin/bstfolder_ctl", "/system/bin/bstime", "/system/bin/bstsyncfs", "/system/bin/bstshutdown", "/system/xbin/bstk", "/storage/emulated/0/.bstshutdown_sync", "/mnt/runtime/write/emulated/0/.bstshutdown_sync", "/mnt/runtime/read/emulated/0/.bstshutdown_sync", "/mnt/runtime/default/emulated/0/.bstshutdown_sync", "/data/media/0/.bstshutdown_sync", "/data/downloads/.bstABI2Apps", "/sys/devices/virtual/bstsensor", "/sys/devices/virtual/misc/bst_ime", "/sys/devices/virtual/misc/bst_gps", "/sys/devices/virtual/misc/bstpgaipc", "/sys/class/bstsensor", "/sys/class/misc/bst_ime", "/sys/class/misc/bst_gps", "/sys/class/misc/bstpgaipc", "/sys/bus/pci/drivers/bstsensor", "/sys/bus/pci/drivers/bstvideo", "/sys/bus/pci/drivers/bstaudio", "/sys/bus/pci/drivers/bstcamera", "/sys/bus/pci/drivers/bstinput", "/sys/bus/pci/drivers/bstpgaipc", "/sys/module/bstsensor", "/sys/module/bstvideo", "/sys/module/bstaudio", "/sys/module/bstcamera", "/sys/module/videobuf_core/holders/bstcamera", "/sys/module/bstinput", "/sys/module/bstpgaipc", "/proc/irq/16/bstcamera", "/proc/irq/17/bstaudio", "/proc/irq/18/bstinput", "/proc/irq/22/bstpgaipc", "/proc/irq/23/bstsensor", "/proc/bstid", "/proc/asound/bstaudio", "/proc/bstfolder_exports", "/boot/android/android/system/lib64/egl/libGLES_bst.so", "/boot/android/android/system/lib64/hw/gralloc.bst.so", "/boot/android/android/system/lib/egl/libGLES_bst.so", "/boot/android/android/system/lib/hw/gralloc.bst.so", "/boot/android/android/system/bin/bstsvcmgrtest", "/boot/android/android/system/bin/bstshutdown_core", "/boot/android/android/system/bin/bstfolderd", "/boot/android/android/system/bin/bstfolder_ctl", "/boot/android/android/system/bin/bstime", "/boot/android/android/system/bin/bstsyncfs", "/boot/android/android/system/bin/bstshutdown", "/boot/android/android/system/xbin/bstk", "/boot/bstsetup.env", "/boot/bstmods", "/dev/bstpgaipc", "/dev/bst_gps", "/dev/bst_ime", "/dev/bstgyro", "/dev/bstorie", "/dev/bstmegn", "/dev/bstacce", "/dev/socket/bstfolderd"})[i3]).exists()) continue;
                        string2 = b2.f(2131296302);
                        break block3;
                    }
                    string2 = null;
                }
                if (string2 == null) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Tools.L1(Tools.N1(2131296968), string2));
                stringBuilder.append(b2.f(2131296444));
                string2 = stringBuilder.toString();
                n2.d().postDelayed(f1.J(null, string2, 32L, true), 30000L);
            }
        }, "checkSlowEmulator").start();
    }

    private static long m() {
        block3: {
            PackageInfo packageInfo = Tools.A0(Tools.C0(), 0);
            if (packageInfo == null) break block3;
            try {
                long l3 = packageInfo.lastUpdateTime;
                return l3;
            }
            catch (Throwable throwable) {
                e1.l("Fail get package info", throwable);
            }
        }
        return -1L;
    }

    public static void n() {
        f1.C();
        f1.N();
        e1.e.a("AndroidService", "Main: die");
        try {
            System.exit(0);
        }
        catch (Throwable throwable) {
            e1.e.d("AndroidService", "OnExit", throwable);
        }
        e1.e.a("AndroidService", "exit: 14");
        try {
            Runtime.getRuntime().halt(0);
        }
        catch (Throwable throwable) {
            e1.e.d("AndroidService", "OnExit", throwable);
        }
        e1.e.a("AndroidService", "exit: 15");
        try {
            Process.killProcess((int)Process.myPid());
        }
        catch (Throwable throwable) {
            e1.e.d("AndroidService", "OnExit", throwable);
        }
        e1.e.a("AndroidService", "exit: 16");
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("exec kill ");
            stringBuilder.append(Process.myPid());
            e2.n(stringBuilder.toString(), 45);
        }
        catch (Throwable throwable) {
            e1.e.d("AndroidService", "OnExit", throwable);
        }
        e1.e.a("AndroidService", "exit: 17");
        throw new n0.h("Failed exit from the app normally");
    }

    public static void o() {
        e1.d("Main: exit");
        boolean bl = true;
        b = true;
        try {
            if (MainService.instance != null) {
                MainService.instance.m1(true);
                MainService.instance.a0();
            }
        }
        catch (Throwable throwable) {
            e1.s("Exception on exit", throwable);
        }
        e1.e.a("AndroidService", "exit: 1");
        new File(Tools.q0(), "sel.txt").delete();
        f1.d(true);
        e1.e.a("AndroidService", "exit: 2");
        try {
            e1.b();
        }
        catch (Throwable throwable) {
            e1.e.d("AndroidService", "OnExit", throwable);
        }
        e1.e.a("AndroidService", "exit: 3");
        boolean bl2 = v.a != null;
        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                e1.e.a("AndroidService", "wait 4");
                n2.d().removeCallbacks((Runnable)this);
                f1.p();
            }
        };
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("wait 1: ");
        stringBuilder.append(bl2);
        e1.e.a("AndroidService", stringBuilder.toString());
        if (bl2) {
            v.c = runnable;
            v.a.c();
        }
        boolean bl3 = bl;
        if (!f1.N()) {
            bl3 = bl2 ? bl : false;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("wait 2: ");
        stringBuilder.append(bl3);
        e1.e.a("AndroidService", stringBuilder.toString());
        if (!bl3) {
            f1.p();
        } else {
            if (v.c == null) {
                v.c = runnable;
            }
            n2.d().postDelayed(runnable, 3000L);
        }
    }

    static void p() {
        f1.C();
        try {
            f1.H();
        }
        catch (Throwable throwable) {
            e1.e.d("AndroidService", "OnExit", throwable);
        }
        e1.e.a("AndroidService", "exit: 4");
        try {
            n2.a();
        }
        catch (Throwable throwable) {
            e1.e.d("AndroidService", "OnExit", throwable);
        }
        e1.e.a("AndroidService", "exit: 5");
        try {
            u.a();
        }
        catch (Throwable throwable) {
            e1.e.d("AndroidService", "OnExit", throwable);
        }
        e1.e.a("AndroidService", "exit: 6");
        Comparable<File> comparable = new File(Tools.b0(), "skipFinalization");
        e1.e.a("AndroidService", "exit: 7");
        if (!((File)comparable).exists()) {
            e1.e.a("AndroidService", "exit: 8");
            try {
                ((File)comparable).createNewFile();
            }
            catch (Throwable throwable) {
                e1.e.d("AndroidService", "OnExit", throwable);
            }
            e1.e.a("AndroidService", "exit: 9");
            try {
                System.runFinalization();
            }
            catch (Throwable throwable) {
                e1.e.d("AndroidService", "OnExit", throwable);
            }
            e1.e.a("AndroidService", "exit: 10");
            try {
                ((File)comparable).delete();
            }
            catch (Throwable throwable) {
                e1.e.d("AndroidService", "OnExit", throwable);
            }
        }
        e1.e.a("AndroidService", "exit: 11");
        if (!Config.vSpaceReal) {
            try {
                comparable = new Comparable<File>();
                ((StringBuilder)comparable).append("exec am force-stop ");
                ((StringBuilder)comparable).append(Tools.C0());
                e2.n(((StringBuilder)comparable).toString(), 45);
            }
            catch (Throwable throwable) {
                e1.e.d("AndroidService", "OnExit", throwable);
            }
            e1.e.a("AndroidService", "exit: 12");
            try {
                comparable = new Comparable<File>();
                ((StringBuilder)comparable).append("exec am kill ");
                ((StringBuilder)comparable).append(Tools.C0());
                e2.n(((StringBuilder)comparable).toString(), 45);
            }
            catch (Throwable throwable) {
                e1.e.d("AndroidService", "OnExit", throwable);
            }
            e1.e.a("AndroidService", "exit: 13");
        }
        f1.n();
    }

    public static void q(Context context) {
        f1.r(context, null);
    }

    public static void r(Context context, Runnable runnable) {
        n2.i(new Runnable(context, runnable){
            final Context a;
            final Runnable b;
            {
                this.a = context;
                this.b = runnable;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                Throwable throwable2;
                block3: {
                    String string2;
                    block2: {
                        try {
                            string2 = b2.g("     15. __help_faq_15_q__\r\n        __help_faq_15_a__\r\n\r\n     16. __help_faq_16_q__\r\n        __help_faq_16_a__\r\n\r\n     17. __help_faq_17_q__\r\n        __help_faq_17_a__\r\n\r\n__rtfm__");
                            string2 = android.ext.f.c(this.a).setMessage((CharSequence)string2).setNegativeButton((CharSequence)b2.f(2131296836), null).create();
                            if (this.b == null) break block2;
                            DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener(this){
                                final m a;
                                {
                                    this.a = m3;
                                }

                                public void onDismiss(DialogInterface dialogInterface) {
                                    this.a.b.run();
                                }
                            };
                            android.ext.f.k((AlertDialog)string2, onDismissListener);
                        }
                        catch (Throwable throwable2) {
                            break block3;
                        }
                    }
                    android.ext.f.m((AlertDialog)string2);
                    return;
                }
                e1.l("Failed faq alert", throwable2);
            }
        });
    }

    private static int s() {
        return (int)(1.0f * 17371.5f - 1216.5f + 0.5f);
    }

    private static boolean t() {
        boolean bl = (Config.c & 0x40L) != 0L || (Config.B & 0x2000) != 0;
        return bl;
    }

    static ComponentName u() {
        try {
            ComponentName componentName = new ComponentName(Tools.C0(), Instrumentation.class.getName());
            return componentName;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static String v() {
        int n3;
        Object object;
        int n4;
        block16: {
            int n5;
            block17: {
                float f4;
                int n6;
                Resources resources;
                block18: {
                    n4 = 0;
                    resources = Tools.f0().getResources();
                    object = resources.getConfiguration();
                    {
                        catch (Throwable throwable) {}
                    }
                    n6 = ((Configuration)object).screenWidthDp;
                    try {
                        n5 = ((Configuration)object).screenHeightDp;
                        return n5;
                    }
                    finally {
                        n3 = n6;
                    }
                    break block18;
                    catch (Throwable throwable) {
                        n5 = 0;
                    }
                    e1.a((Throwable)object);
                    n3 = n5;
                    n5 = 0;
                }
                n4 = n3;
                try {
                    object = resources.getDisplayMetrics();
                    n6 = n3;
                    if (n3 == 0) {
                        n6 = n3;
                        if (object != null) {
                            n4 = n3;
                            f4 = ((DisplayMetrics)object).density;
                            n6 = n3;
                            if (f4 != 0.0f) {
                                n4 = n3;
                                n6 = (int)((float)((DisplayMetrics)object).widthPixels / f4);
                            }
                        }
                    }
                    n4 = n6;
                    n3 = n5;
                    if (n5 != 0) break block16;
                    n4 = n6;
                    n3 = n5;
                    if (object == null) break block16;
                    n4 = n6;
                    f4 = ((DisplayMetrics)object).density;
                    n4 = n6;
                    n3 = n5;
                    if (f4 == 0.0f) break block16;
                    n4 = n6;
                    n3 = ((DisplayMetrics)object).heightPixels;
                }
                catch (Throwable throwable) {
                    break block17;
                }
                n3 = (int)((float)n3 / f4);
                n4 = n6;
                break block16;
                catch (Throwable throwable) {
                    n4 = n5;
                    n5 = 0;
                }
            }
            e1.a((Throwable)object);
            n3 = n5;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append('x');
        ((StringBuilder)object).append(n3);
        return ((StringBuilder)object).toString();
    }

    static DialogInterface.OnClickListener w(long l3) {
        return new DialogInterface.OnClickListener(l3){
            final long a;
            {
                this.a = l3;
            }

            public void onClick(DialogInterface dialogInterface, int n3) {
                Config.c |= this.a;
                Config.k();
            }
        };
    }

    static String x() {
        CharSequence charSequence;
        if (Config.C) {
            charSequence = Config.E;
        } else if (Config.vSpaceReal) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(e2.h(null));
            ((StringBuilder)charSequence).append("@");
            ((StringBuilder)charSequence).append(Config.E);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = e2.h(null);
        }
        return charSequence;
    }

    public static boolean y() {
        return f1.z(null, null);
    }

    public static boolean z(Context context, DialogInterface.OnDismissListener onDismissListener) {
        if (!Config.C) {
            return true;
        }
        Context context2 = context;
        if (context == null) {
            context2 = Tools.f0();
        }
        context = android.ext.f.c(context2).setMessage((CharSequence)b2.f(2131296797)).setNegativeButton((CharSequence)b2.f(2131296836), null).create();
        if (onDismissListener != null) {
            android.ext.f.k((AlertDialog)context, onDismissListener);
        }
        android.ext.f.m((AlertDialog)context);
        return false;
    }
}

