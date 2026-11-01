/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.a;
import a.c;
import a.d;
import android.animation.ValueAnimator;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b1;
import android.ext.b2;
import android.ext.e1;
import android.ext.e2;
import android.ext.f;
import android.ext.f1;
import android.ext.g0;
import android.ext.g2;
import android.ext.h0;
import android.ext.i;
import android.ext.k;
import android.ext.m2;
import android.ext.n0;
import android.ext.n2;
import android.ext.o;
import android.ext.p;
import android.ext.p0;
import android.ext.q;
import android.ext.r0;
import android.ext.s1;
import android.ext.z;
import android.fix.Button;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.ActivityMain;
import catch_.me_.if_.you_.can_.MainActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public abstract class r
extends a
implements View.OnClickListener {
    public static volatile boolean k = false;
    public static volatile boolean l = true;
    public static volatile boolean m = false;
    public static volatile r n;
    public static volatile Context o;
    public static volatile Context p;
    public static volatile boolean q = true;
    private static volatile boolean r;
    volatile boolean d = true;
    private volatile boolean e = false;
    private WeakReference f = new WeakReference<Object>(null);
    private WeakReference g = new WeakReference<Object>(null);
    private WeakReference h = new WeakReference<Object>(null);
    private StringBuilder i = new StringBuilder();
    private Runnable j;

    static {
        e1.d("BaseActivity clinit");
        android.ext.i.a();
        n0.f();
        r = false;
    }

    public r() {
        boolean bl = this instanceof MainActivity;
        if (bl || n == null) {
            n = this;
        }
        if (bl || p == null) {
            p = this;
        }
        l = true ^ bl;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BaseActivity init: ");
        stringBuilder.append((Object)this);
        e1.d(stringBuilder.toString());
        n0.f();
    }

    private void A() {
        TextView textView = (TextView)this.g.get();
        if (textView == null) {
            return;
        }
        CharSequence charSequence = (CharSequence)this.h.get();
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(b2.f(2131296387));
        ((StringBuilder)charSequence).append(Tools.removeNewLinesChars("#kwws=22jdphjxdugldq1qhw2grzqordg"));
        ((StringBuilder)charSequence).append("\n\n");
        ((StringBuilder)charSequence).append(b2.f(2131296502));
        ((StringBuilder)charSequence).append("\n\n");
        charSequence = ((StringBuilder)charSequence).toString();
        String string2 = b2.g("     32. __help_faq_32_q__\r\n        __help_faq_32_b__\r\n\r\n__rtfm__");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\n");
        stringBuilder.append(b2.f(2131296617));
        String string3 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        Tools.v1(textView, stringBuilder.toString());
        Tools.u(textView.getText());
        Tools.v(textView.getText(), string2, Tools.d0(2130837505));
        this.h = new WeakReference<CharSequence>(textView.getText());
    }

    private void E(Bundle bundle, int n3) {
        boolean bl = true;
        if (n3 == 1) {
            new g2().f("root-ok", (int)(1.0f * 23979.6f - 7824.6f + 0.5f)).commit();
        }
        if (n3 == -1) {
            bl = false;
        }
        this.D(bundle, bl);
    }

    private boolean G() {
        boolean bl = this == n && !this.isFinishing() && !this.isDestroyed();
        return bl;
    }

    static void H() {
        String string2 = android.ext.r.v();
        android.ext.f.o(android.ext.f.c(p).setMessage((CharSequence)Tools.L1(b2.f(2131296887), string2)).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n3) {
                Config.b((int)2131034375).d = (int)(1.0f * 16733.4f - 578.4f + 0.5f);
                Config.k();
                new p0(1400, true).onClick(null, 0);
            }
        }).setNegativeButton((CharSequence)b2.f(2131296311), null));
    }

    public static void I() {
        try {
            f1.c = 2;
            f1.o();
            return;
        }
        catch (Throwable throwable) {
            throw new RuntimeException("Failed restart", throwable);
        }
    }

    public static void J(Context context, long l3) {
        block4: {
            if (context == null) {
                return;
            }
            String string2 = Tools.C0();
            ComponentName componentName = new ComponentName(string2, android.ext.r.t());
            Tools.w1(200, componentName, 1);
            componentName = PendingIntent.getActivity((Context)context, (int)123456, (Intent)Tools.N0(context, Tools.C0(), android.ext.r.t()), (int)0x10000000);
            context = (AlarmManager)context.getSystemService("alarm");
            if (context == null) break block4;
            try {
                context.set(1, System.currentTimeMillis() + l3, (PendingIntent)componentName);
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
    }

    public static void K(Bundle object) {
        if (object == null) {
            return;
        }
        if (object.containsKey("reminst")) {
            e1.d("removeInstaller: from bundle");
            m = true;
        }
        if (object.containsKey("hw")) {
            l = object.getBoolean("hw");
        }
        if (object.containsKey("uid")) {
            int n3 = object.getInt("uid");
            int n4 = android.os.Process.myUid();
            if (object.getBoolean("vspace") && n4 != n3) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Kill by diff uids: ");
                ((StringBuilder)object).append(n4);
                ((StringBuilder)object).append(" != ");
                ((StringBuilder)object).append(n3);
                e1.d(((StringBuilder)object).toString());
                f1.n();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void N(String var1_1) {
        var3_2 = this.i;
        var2_3 = var1_1;
        if (var1_1.startsWith("/mnt/expand/")) {
            var2_3 = new StringBuilder();
            var2_3.append("/mnt/expand/");
            var2_3.append(var1_1.split("/", -1)[3]);
            var2_3 = var1_1.replace(var2_3.toString(), "/data");
            android.ext.r.r = true;
            var3_2.append("1\n");
        }
        if (var2_3.startsWith("/data/data/")) {
            var1_1 = var2_3.split("/", -1)[3];
            var2_3 = "2\n";
lbl16:
            // 2 sources

            while (true) {
                var3_2.append((String)var2_3);
                break;
            }
        } else {
            if (var2_3.startsWith("/data/user/")) {
                var1_1 = var2_3.split("/", -1)[4];
                var2_3 = "3\n";
                ** continue;
            }
            var1_1 = null;
        }
        Config.F = "";
        if (var1_1 != null) {
            var3_2.append(var1_1);
            var3_2.append("\n4\n");
            Config.C = var1_1.startsWith(android.ext.i.d) ^ true;
            Config.E = var1_1;
            Config.D = var1_1.contains("vmos");
            try {
                Config.F = Tools.a0(Tools.Y(var1_1));
            }
            catch (Throwable var2_4) {
                var4_5 = new StringBuilder();
                var4_5.append("Failed get vSpace name for ");
                var4_5.append(var1_1);
                e1.s(var4_5.toString(), var2_4);
            }
        }
        if (Config.F.length() == 0) {
            Config.F = b2.f(2131297088);
        }
        var3_2.append(Config.C);
        var3_2.append('\n');
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void O() {
        block35: {
            block34: {
                block33: {
                    block32: {
                        var1 = new StringBuilder();
                        android.ext.r.q(var1, 1);
                        try {
                            var1.append(android.ext.r.n.getFilesDir());
                        }
                        catch (Throwable var2_1) {
                            var1.append(var2_1);
                        }
                        android.ext.r.q(var1, 2);
                        var0_15 = android.os.Process.myUid();
                        try {
                            var1.append(var0_15);
                        }
                        catch (Throwable var2_2) {
                            var1.append(var2_2);
                        }
                        android.ext.r.q(var1, 3);
                        try {
                            var1.append(Arrays.toString(android.ext.r.n.getPackageManager().getPackagesForUid(var0_15)));
                        }
                        catch (Throwable var2_4) {
                            var1.append(var2_4);
                        }
                        android.ext.r.q(var1, 4);
                        try {
                            var1.append(Arrays.toString(android.ext.r.n.getPackageManager().getPackageGids(android.ext.r.n.getPackageName())));
                        }
                        catch (Throwable var2_5) {
                            var1.append(var2_5);
                        }
                        android.ext.r.q(var1, 5);
                        try {
                            var1.append(android.ext.q.a(android.ext.r.n.getPackageManager(), android.ext.r.n.getPackageName(), 0));
                        }
                        catch (Throwable var2_6) {
                            var1.append(var2_6);
                        }
                        android.ext.r.q(var1, 6);
                        try {
                            var1.append(android.ext.r.n.checkCallingOrSelfPermission(Tools.removeNewLinesChars("dqgurlg1shuplvvlrq1UHDGbVPV")));
                        }
                        catch (Throwable var2_7) {
                            var1.append(var2_7);
                        }
                        var1.append(' ');
                        var1.append(Tools.M0().getInt("odd-vspace", 0));
                        android.ext.r.q(var1, 7);
                        try {
                            var1.append(Build.VERSION.SDK_INT);
                        }
                        catch (Throwable var2_8) {
                            var1.append(var2_8);
                        }
                        android.ext.r.q(var1, 8);
                        var2_3 = new StringBuilder();
                        var2_3.append(Tools.a.nextInt());
                        var2_3.append(".txt");
                        var4_16 = var2_3.toString();
                        var2_3 = new File(android.ext.r.n.getFilesDir(), var4_16);
                        var3_18 = new FileOutputStream((File)var2_3);
                        var3_18.write(new byte[4096]);
                        var3_18.flush();
                        var0_15 = android.lang.a.a(var3_18.getFD());
                        var5_21 = new Comparable<StringBuilder>();
                        var5_21.append("/proc/self/fd/");
                        var5_21.append(var0_15);
                        var6_20 = new File(var5_21.toString());
                        var1.append(var6_20.getPath());
                        var1.append(" -> ");
                        var1.append(var6_20.getCanonicalPath());
                        {
                            catch (Throwable var3_19) {
                                var2_3.delete();
                                throw var3_19;
                            }
                        }
                        try {
                            var6_20 = new FileInputStream((File)var2_3);
                            var5_21 = var6_20.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, 4096L);
                            android.ext.r.l(var1, var4_16);
                            var5_21.capacity();
                            var6_20.close();
                            ** GOTO lbl107
                        }
                        catch (Throwable var4_17) {
                            var1.append('\n');
                            var1.append(var4_17);
lbl107:
                            // 2 sources

                            var1.append("\nN: '");
                            var1.append(Tools.y0(var2_3.getAbsolutePath()));
                            var1.append('\'');
                            var3_18.close();
                            try {
                                var2_3.delete();
                                break block32;
                            }
                            catch (Throwable var2_9) {}
                        }
                        var1.append(var2_9);
                    }
                    android.ext.r.q(var1, 9);
                    try {
                        android.ext.r.l(var1, android.ext.r.n.getPackageName());
                    }
                    catch (Throwable var2_10) {
                        var1.append(var2_10);
                    }
                    android.ext.r.q(var1, 10);
                    try {
                        var1.append(ConfigListAdapter.k());
                    }
                    catch (Throwable var2_11) {
                        var1.append(var2_11);
                    }
                    android.ext.r.q(var1, 11);
                    try {
                        var2_3 = new File("/proc/self/exe");
                        var1.append(var2_3.getPath());
                        var1.append(" -> ");
                        var1.append(var2_3.getCanonicalPath());
                    }
                    catch (Throwable var2_12) {
                        var1.append(var2_12);
                    }
                    android.ext.r.q(var1, 12);
                    try {
                        var1.append(android.os.Process.myPid());
                    }
                    catch (Throwable var2_13) {
                        var1.append(var2_13);
                    }
                    android.ext.r.q(var1, 13);
                    try {
                        var3_18 = new FileInputStream("/proc/self/status");
                        var2_3 = new byte[65536];
                        var0_15 = var3_18.read((byte[])var2_3);
                        var1.append(var0_15);
                        var1.append(" -> ");
                        if (var0_15 <= 0) break block33;
                        var4_16 = new String((byte[])var2_3, 0, var0_15);
                        var1.append(var4_16);
                    }
                    catch (Throwable var2_14) {
                        break block34;
                    }
                }
                var3_18.close();
                break block35;
            }
            var1.append(var2_14);
        }
        e1.d("FIN");
        Tools.h(var1.toString().trim(), 0);
    }

    private AlertDialog P(Context object) {
        AlertDialog.Builder builder = android.ext.f.c(object).setCustomTitle(Tools.g0(2131296455));
        int n3 = m2.a ? 2131296380 : 2131296406;
        String string2 = b2.f(n3);
        n3 = (Config.A & 4) != 0 ? 2131297107 : 2131297104;
        String string3 = b2.f(n3);
        String string4 = b2.f(2131296315);
        String string5 = b2.f(2131296899);
        String string6 = Config.b(2131034210).toString();
        String string7 = Config.b(2131034169).toString();
        String string8 = Config.b(2131034157).toString();
        String string9 = b2.f(2131296900);
        String string10 = b2.f(2131297002);
        String string11 = b2.f(2131296886);
        String string12 = b2.f(2131296958);
        object = Config.b(2131034186).toString();
        String string13 = Config.b(2131034150).toString();
        String string14 = Config.b(2131034214).toString();
        String string15 = Config.b(2131034183).toString();
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this){
            final r a;
            {
                this.a = r3;
            }

            /*
             * Unable to fully structure code
             * Could not resolve type clashes
             */
            public void onClick(DialogInterface var1_1, int var2_2) {
                var3_3 = 1;
                block0 : switch (var2_2) {
                    default: {
                        break;
                    }
                    case 14: {
                        Config.b(2131034183).b();
                        return;
                    }
                    case 13: {
                        Config.b(2131034214).b();
                        return;
                    }
                    case 12: {
                        Config.b(2131034150).b();
                        return;
                    }
                    case 11: {
                        Config.b(2131034186).b();
                        return;
                    }
                    case 10: {
                        android.ext.r.O();
                        return;
                    }
                    case 9: {
                        android.ext.r.H();
                        return;
                    }
                    case 8: {
                        ConfigListAdapter.b();
                        return;
                    }
                    case 7: {
                        Config.c = 0L;
lbl28:
                        // 3 sources

                        while (true) {
                            Config.k();
                            break block0;
                            break;
                        }
                    }
                    case 6: {
                        this.a.T();
                        return;
                    }
                    case 5: {
                        Config.b(2131034169).b();
                        return;
                    }
                    case 4: {
                        var4_4 = Config.b(2131034210);
                        var2_2 = var3_3;
                        var1_1 /* !! */  = var4_4;
                        if ((Config.B & 256) == 0) ** GOTO lbl45
                        var1_1 /* !! */  = var4_4;
lbl43:
                        // 2 sources

                        while (true) {
                            var2_2 = 0;
lbl45:
                            // 3 sources

                            while (true) {
                                var1_1 /* !! */ .d = var2_2;
                                ** GOTO lbl28
                                break;
                            }
                            break;
                        }
                    }
                    case 3: {
                        Config.b((int)2131034165).d = -1;
                        Config.b((int)2131034164).d = -1;
                        ** continue;
                    }
                    case 2: {
                        new z(this.a).J();
                        return;
                    }
                    case 1: {
                        var4_5 = Config.b(2131034402);
                        var2_2 = var3_3;
                        var1_1 /* !! */  = var4_5;
                        if ((Config.A & 4) == 0) ** continue;
                        var1_1 /* !! */  = var4_5;
                        ** continue;
                    }
                    case 0: {
                        r0.d(m2.a);
                    }
                }
                android.ext.r.I();
            }
        };
        return builder.setItems((CharSequence[])new String[]{string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, object, string13, string14, string15}, onClickListener).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
    }

    private void R(Bundle bundle) {
        e2.i(new e2.c(this, bundle){
            final Bundle a;
            final r b;
            {
                this.b = r3;
                this.a = bundle;
            }

            @Override
            public void a(int n3) {
                n2.i(new Runnable(this, this.b, n3){
                    final r a;
                    final int b;
                    final m c;
                    {
                        this.c = m3;
                        this.a = r3;
                        this.b = n3;
                    }

                    @Override
                    public void run() {
                        if (!this.a.G()) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append((Object)this.a);
                            stringBuilder.append(": drop root probe verdict ");
                            stringBuilder.append(this.b);
                            e1.d(stringBuilder.toString());
                            return;
                        }
                        this.a.E(this.c.a, this.b);
                    }
                });
            }
        });
    }

    private static void S() {
        n2.d().post(new Runnable(){

            @Override
            public void run() {
                MainService.instance.e1();
            }
        });
    }

    static void U(OutputStream outputStream, String string2, String string3) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\n\n");
            stringBuilder.append(gregorianCalendar.getTime().toString());
            stringBuilder.append('\n');
            stringBuilder.append(string2);
            stringBuilder.append('\n');
            stringBuilder.append(h0.c());
            stringBuilder.append('\n');
            stringBuilder.append(f1.x());
            stringBuilder.append('\n');
            stringBuilder.append(Tools.f0().getFilesDir().getAbsolutePath());
            stringBuilder.append('\n');
            stringBuilder.append(string3);
            stringBuilder.append("\n\n");
            outputStream.write(stringBuilder.toString().getBytes());
            outputStream.flush();
        }
        catch (Throwable throwable) {
            e1.s("Fail write logcat header", throwable);
        }
    }

    static /* synthetic */ Runnable e(r r3, Runnable runnable) {
        r3.j = runnable;
        return runnable;
    }

    private static void i(Context context) {
        try {
            context.getSharedPreferences(MainService.G0, 0).edit().putBoolean("perm-restart", true).commit();
            android.ext.r.J(context, 3000L);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    private static void j() {
        block8: {
            Context context;
            block7: {
                try {
                    if (Tools.M0().contains("perm-restart")) {
                        e1.d("cancelPermissionRestart");
                        Tools.M0().edit().remove("perm-restart").commit();
                    }
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                }
                context = Tools.f0();
                if (context != null) break block7;
                return;
            }
            AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
            if (alarmManager == null) break block8;
            try {
                alarmManager.cancel(PendingIntent.getActivity((Context)context, (int)123456, (Intent)Tools.N0(context, Tools.C0(), android.ext.r.t()), (int)0x10000000));
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
    }

    private static void k() {
        if (!r) {
            return;
        }
        android.ext.f.o(android.ext.f.c(p).setMessage((CharSequence)b2.f(2131296778)).setNeutralButton((CharSequence)b2.f(2131296836), null).setPositiveButton((CharSequence)b2.f(2131296455), new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n3) {
                try {
                    dialogInterface = p;
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)"https://support.google.com/android/answer/6088895"));
                    dialogInterface.startActivity(intent);
                }
                catch (Throwable throwable) {
                    e1.s("Failed call activity", throwable);
                }
            }
        }));
    }

    private static void l(StringBuilder stringBuilder, String string2) {
        String string3;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
        while ((string3 = bufferedReader.readLine()) != null) {
            int n3;
            int n4 = string3.indexOf(string2);
            if (n4 < 0) continue;
            for (n3 = n4; n3 > 0 && string3.charAt(n3) > ' '; --n3) {
            }
            if (n3 >= n4) continue;
            stringBuilder.append("\n'");
            stringBuilder.append(string3.substring(n3, string3.length()).trim());
            stringBuilder.append('\'');
        }
        bufferedReader.close();
    }

    private void n() {
        TextView textView = (TextView)this.g.get();
        if (textView != null) {
            textView.setText((CharSequence)"");
        }
        this.y(false);
    }

    static boolean o(Context context) {
        block3: {
            try {
                context = context.getSharedPreferences(MainService.G0, 0);
                if (context.getBoolean("perm-restart", false)) break block3;
                return false;
            }
            catch (Throwable throwable) {
                e1.a(throwable);
                return false;
            }
        }
        context.edit().remove("perm-restart").commit();
        e1.d("consumePermissionRestart");
        return true;
    }

    private static void q(StringBuilder stringBuilder, int n3) {
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("START: ");
        stringBuilder2.append(n3);
        e1.d(stringBuilder2.toString());
        stringBuilder.append('\n');
        stringBuilder.append(n3);
        stringBuilder.append(": ");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void r() {
        block10: {
            Throwable throwable2;
            StringBuilder stringBuilder;
            block9: {
                String string2;
                String string3;
                DialogInterface.OnClickListener onClickListener;
                block8: {
                    Object object;
                    stringBuilder = this.i;
                    try {
                        onClickListener = this.getFilesDir();
                        string3 = onClickListener.getAbsolutePath();
                        stringBuilder.append(string3);
                        stringBuilder.append('\n');
                        string2 = android.ext.i.d;
                        stringBuilder.append(string2);
                        stringBuilder.append('\n');
                        this.N(string3);
                        if (Config.C || n.checkCallingOrSelfPermission(Tools.removeNewLinesChars("dqgurlg1shuplvvlrq1UHDGbVPV")) != 0 && ((File)(object = new File("/proc/self/exe"))).getCanonicalPath().startsWith("/system/")) break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    stringBuilder.append("? ");
                    object = new StringBuilder();
                    ((StringBuilder)object).append(Tools.a.nextInt());
                    ((StringBuilder)object).append(".txt");
                    CharSequence charSequence = ((StringBuilder)object).toString();
                    object = new File((File)onClickListener, (String)charSequence);
                    Object object2 = new FileOutputStream((File)object);
                    ((FileOutputStream)object2).write(new byte[4096]);
                    ((OutputStream)object2).flush();
                    ((FileOutputStream)object2).close();
                    String string4 = Tools.y0(((File)object).getAbsolutePath());
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append('/');
                    ((StringBuilder)object2).append((String)charSequence);
                    charSequence = string4.replace(((StringBuilder)object2).toString(), "");
                    ((File)object).delete();
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append('\n');
                    this.N((String)charSequence);
                    if (Config.C) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append('/');
                        ((StringBuilder)object).append(onClickListener.getName());
                        object = ((StringBuilder)object).toString();
                        onClickListener = ((String)charSequence).replace((CharSequence)object, "");
                        object = string3.replace((CharSequence)object, "");
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("F2R: [");
                        ((StringBuilder)charSequence).append(onClickListener.length());
                        ((StringBuilder)charSequence).append("] ");
                        ((StringBuilder)charSequence).append((String)object);
                        ((StringBuilder)charSequence).append(" -> ");
                        ((StringBuilder)charSequence).append((String)onClickListener);
                        charSequence = ((StringBuilder)charSequence).toString();
                        e1.p((String)charSequence);
                        stringBuilder.append((String)charSequence);
                        stringBuilder.append('\n');
                        Tools.v = new String[]{object, onClickListener};
                    } else {
                        onClickListener = new StringBuilder();
                        onClickListener.append("Odd vSpace: ");
                        onClickListener.append(string3);
                        onClickListener.append("; ");
                        onClickListener.append((String)charSequence);
                        onClickListener = onClickListener.toString();
                        e1.p((String)onClickListener);
                        stringBuilder.append((String)onClickListener);
                        stringBuilder.append('\n');
                        int n3 = Tools.M0().getInt("odd-vspace", 0);
                        stringBuilder.append(n3);
                        stringBuilder.append('\n');
                        if (n3 == 1) {
                            Config.C = true;
                        } else if (n3 == 0) {
                            onClickListener = new DialogInterface.OnClickListener(this){
                                final r a;
                                {
                                    this.a = r3;
                                }

                                public void onClick(DialogInterface object, int n3) {
                                    int n4 = 1;
                                    n3 = n3 == -1 ? 1 : 0;
                                    object = new g2();
                                    if (n3 == 0) {
                                        n4 = 2;
                                    }
                                    ((g2)object).f("odd-vspace", n4).commit();
                                    if (n3 != 0) {
                                        ConfigListAdapter.m();
                                    }
                                }
                            };
                            android.ext.f.o(android.ext.f.c(p).setMessage((CharSequence)b2.f(2131296831)).setCancelable(false).setPositiveButton((CharSequence)b2.f(2131297115), onClickListener).setNegativeButton((CharSequence)b2.f(2131296805), onClickListener));
                        }
                    }
                }
                onClickListener = new StringBuilder();
                onClickListener.append("Files: ");
                onClickListener.append(string3);
                onClickListener.append(' ');
                onClickListener.append(string2);
                string3 = onClickListener.toString();
                e1.d(string3);
                stringBuilder.append(string3);
                stringBuilder.append('\n');
                break block10;
            }
            e1.a(throwable2);
            stringBuilder.append(throwable2.toString());
            stringBuilder.append('\n');
        }
        Config.vSpaceReal = Config.C;
        if (Config.C && (Config.B & 0x200) != 0) {
            Config.C = false;
        }
    }

    private static void s() {
        try {
            Field field = ValueAnimator.class.getDeclaredField("sDurationScale");
            ((AccessibleObject)field).setAccessible(true);
            Object object = field.get(null);
            if (object instanceof Float && Float.valueOf(0.0f).equals(object)) {
                field.set(null, Float.valueOf(1.0f));
                e1.d("Fix sDurationScale");
            }
        }
        catch (Throwable throwable) {
            e1.s("failed fix sDurationScale", throwable);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String t() {
        Object object;
        if (l) {
            object = ActivityMain.class;
            return ((Class)object).getName();
        }
        object = MainActivity.class;
        return ((Class)object).getName();
    }

    public static Bundle u() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hw", l);
        bundle.putInt("uid", android.os.Process.myUid());
        bundle.putBoolean("vspace", Config.C);
        if (m) {
            e1.d("removeInstaller: to bundle");
            bundle.putBoolean("reminst", true);
        }
        return bundle;
    }

    static String v() {
        String string2 = Tools.K0();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GG_logcat_");
        String string3 = Config.C ? "v" : (Config.vSpaceReal ? "R" : "r");
        stringBuilder.append(string3);
        float f4 = 1.0f;
        stringBuilder.append(115.700005f * f4 - 14.3f);
        stringBuilder.append('_');
        stringBuilder.append((int)(f4 * 16480.3f - 325.3f + 0.5f));
        stringBuilder.append('_');
        stringBuilder.append(Build.VERSION.RELEASE);
        stringBuilder.append('_');
        stringBuilder.append(Build.VERSION.SDK_INT);
        stringBuilder.append(".log");
        return new File(string2, stringBuilder.toString()).getAbsolutePath();
    }

    private String w() {
        CharSequence charSequence = this.i;
        this.i = null;
        charSequence = charSequence == null ? "" : charSequence.toString();
        return charSequence;
    }

    private void y(boolean bl) {
        View view = (View)this.f.get();
        if (view == null) {
            return;
        }
        View view2 = view.findViewById(2131034415);
        if (bl) {
            if (view2 == null) {
                view2 = ((ViewGroup)a.d.f(2131099657, null)).findViewById(2131034415);
                ((ViewGroup)view).addView(Tools.O0(view2));
            }
            view2 = (TextView)view.findViewById(2131034272);
            this.g = new WeakReference<View>(view2);
            for (int i3 = 0; i3 < 6; ++i3) {
                View view3 = view.findViewById((new int[]{2131034134, 2131034133, 2131034149, 2131034263, 2131034304, 2131034277})[i3]);
                if (view3 instanceof TextView) {
                    TextView textView = (TextView)view3;
                    textView.setText((CharSequence)b2.g(textView.getText().toString()));
                }
                view3.setOnClickListener((View.OnClickListener)this);
            }
            Tools.S(view2);
        } else if (view2 != null) {
            view = (TextView)this.g.get();
            if (view != null) {
                Tools.P((TextView)view);
                Tools.O0(view);
            }
            Tools.O0(view2);
        }
    }

    private void z() {
        android.ext.r.s();
        this.setContentView(2131099657);
        View view = this.findViewById(2131034380);
        this.f = new WeakReference<View>(view);
        TextView textView = (TextView)view.findViewById(2131034294);
        textView.setText((CharSequence)b2.f(2131296705));
        b1.G = new WeakReference<ProgressBar>((ProgressBar)view.findViewById(2131034357));
        b1.H = new WeakReference<TextView>((TextView)view.findViewById(2131034360));
        b1.I = new WeakReference<TextView>(textView);
        b1.E = new WeakReference<android.widget.Button>((android.widget.Button)view.findViewById(2131034112));
        this.L(0);
        this.y(true);
    }

    void B(Bundle bundle) {
        boolean bl = s1.u();
        s1.d();
        if (!bl) {
            this.C(bundle, s1.E());
            return;
        }
        if (s1.O() < 2) {
            this.j = new Runnable(this, bundle){
                final Bundle a;
                final r b;
                {
                    this.b = r3;
                    this.a = bundle;
                }

                @Override
                public void run() {
                    android.ext.r.e(this.b, null);
                    this.b.C(this.a, false);
                }
            };
            return;
        }
        this.C(bundle, true);
    }

    void C(Bundle bundle, boolean bl) {
        if (!(bl || Config.vSpaceReal || b1.B0() || Tools.M0().getInt("root-ok", 0) == (int)(1.0f * 17178.5f - 1023.5f + 0.5f))) {
            try {
                this.R(bundle);
            }
            catch (Throwable throwable) {
                e1.l("Failed start root probe", throwable);
                this.D(bundle, true);
            }
            return;
        }
        this.D(bundle, true);
    }

    void D(Bundle object, boolean bl) {
        if (bl) {
            this.F((Bundle)object);
        } else {
            Runnable runnable = new Runnable(this, (Bundle)object){
                private boolean a;
                final Bundle b;
                final r c;
                {
                    this.c = r3;
                    this.b = bundle;
                    this.a = false;
                }

                @Override
                public void run() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this);
                    stringBuilder.append(": 1200");
                    e1.d(stringBuilder.toString());
                    if (this.a) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(this);
                        stringBuilder.append(": already");
                        e1.d(stringBuilder.toString());
                        return;
                    }
                    this.a = true;
                    this.c.F(this.b);
                }
            };
            AlertDialog.Builder builder = android.ext.f.c(p).setTitle((CharSequence)b2.f(2131297103)).setCancelable(false);
            String string2 = b2.f(2131296913);
            String string3 = b2.f(2131296812);
            object = b2.f(2131296424);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this, runnable){
                final Runnable a;
                final r b;
                {
                    this.b = r3;
                    this.a = runnable;
                }

                public void onClick(DialogInterface dialogInterface, int n3) {
                    if (n3 == 0) {
                        this.a.run();
                    } else if (n3 == 1) {
                        android.ext.f.o(android.ext.f.c(p).setMessage((CharSequence)b2.f(2131296684)).setCancelable(false).setPositiveButton((CharSequence)b2.f(2131296836), new DialogInterface.OnClickListener(this){
                            final b a;
                            {
                                this.a = b4;
                            }

                            public void onClick(DialogInterface dialogInterface, int n3) {
                                try {
                                    dialogInterface = p;
                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2")));
                                    dialogInterface.startActivity(intent);
                                }
                                catch (Throwable throwable) {
                                    e1.s("Failed call activity", throwable);
                                }
                                new p0(1400).onClick(null, 0);
                            }
                        }));
                        android.ext.r.k();
                    } else {
                        new p0(1500).onClick(null, 0);
                    }
                }
            };
            android.ext.f.r(builder.setItems((CharSequence[])new String[]{string2, string3, object}, onClickListener).create(), runnable, false);
        }
    }

    void F(Bundle bundle) {
        if (bundle != null && (bundle = bundle.getParcelable("installer-state")) instanceof b1.c0) {
            b1.s1((b1.c0)bundle);
        }
        if (f1.d) {
            this.L(2);
        } else {
            f1.K();
        }
        s1.C();
    }

    void L(int n3) {
        n2.i(new Runnable(this, n3){
            final int a;
            final r b;
            {
                this.b = r3;
                this.a = n3;
            }

            @Override
            public void run() {
                View view;
                int n3;
                View view2 = (View)this.b.f.get();
                if (view2 == null) {
                    return;
                }
                View view3 = view2.findViewById(2131034310);
                int n4 = 8;
                if (view3 != null) {
                    n3 = this.a == 0 ? 0 : 8;
                    view3.setVisibility(n3);
                }
                if ((view = view2.findViewById(2131034293)) != null) {
                    n3 = this.a == 1 ? 0 : 8;
                    view.setVisibility(n3);
                }
                if ((view2 = view2.findViewById(2131034415)) != null) {
                    n3 = n4;
                    if (this.a == 2) {
                        n3 = 0;
                    }
                    view2.setVisibility(n3);
                }
                if (this.a == 2) {
                    if (view3 != null) {
                        Tools.O0(view3);
                    }
                    if (view != null) {
                        Tools.O0(view);
                    }
                }
            }
        });
    }

    public void M(boolean bl) {
        boolean bl2 = this.e;
        this.e = bl;
        if (bl2 != bl && MainService.instance != null) {
            MainService.instance.l1();
        }
    }

    void Q() {
        String string2 = this.w();
        if (Config.b((int)2131034375).d != (int)(1.0f * 16493.2f - 338.2f + 0.5f)) {
            return;
        }
        Config.b((int)2131034375).d = 0;
        Config.k();
        new g0(new Runnable(this, string2){
            final String a;
            final r b;
            {
                this.b = r3;
                this.a = string2;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                Throwable throwable2;
                block7: {
                    Object object;
                    FileOutputStream fileOutputStream;
                    Object object2;
                    String string2;
                    block6: {
                        try {
                            string2 = android.ext.r.v();
                            object2 = new File(string2);
                            fileOutputStream = new FileOutputStream((File)object2);
                            android.ext.r.U(fileOutputStream, string2, this.a);
                            Tools.q((File)object2, 420);
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("chmod 0644 ");
                            ((StringBuilder)object2).append(string2);
                            ((StringBuilder)object2).append(" 2>&1 ; logcat -v threadtime -b main -b system *:V 2>&1 ; exit\n");
                            object2 = object = ((StringBuilder)object2).toString();
                            if (!string2.contains("/emulated/0")) break block6;
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("chmod 0644 ");
                            ((StringBuilder)object2).append(string2.replace("/emulated/0", "/emulated/legacy"));
                            ((StringBuilder)object2).append(" 2>&1 ; ");
                            ((StringBuilder)object2).append((String)object);
                            object2 = ((StringBuilder)object2).toString();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    Process process = e2.q((String)object2);
                    object = process.getInputStream();
                    byte[] byArray = new byte[8192];
                    boolean bl = Tools.Z0(process);
                    if (!bl) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(b2.f(2131296886));
                        ((StringBuilder)object2).append(": ");
                        ((StringBuilder)object2).append(string2);
                        object2 = ((StringBuilder)object2).toString();
                    } else {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(b2.f(2131296886));
                        ((StringBuilder)object2).append(": ");
                        ((StringBuilder)object2).append(b2.f(2131296417));
                        object2 = ((StringBuilder)object2).toString();
                    }
                    Tools.J1((String)object2);
                    while (!Thread.interrupted()) {
                        int n3 = ((InputStream)object).read(byArray);
                        if (n3 > 0) {
                            ((OutputStream)fileOutputStream).write(byArray, 0, n3);
                            fileOutputStream.flush();
                            continue;
                        }
                        if (n3 != -1 || !Tools.Z0(process)) continue;
                    }
                    ((OutputStream)fileOutputStream).close();
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(b2.f(2131296886));
                    ((StringBuilder)object2).append(": ");
                    ((StringBuilder)object2).append(b2.f(2131296424));
                    Tools.J1(((StringBuilder)object2).toString());
                    return;
                }
                e1.a(throwable2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(b2.f(2131296886));
                stringBuilder.append("> ");
                stringBuilder.append(b2.f(2131296417));
                Tools.J1(stringBuilder.toString());
            }
        }, "RecordLogcat").start();
    }

    void T() {
        Config.p p3 = Config.b(2131034157);
        p3.g(new Config.p.b(this, p3){
            final Config.p a;
            final r b;
            {
                this.b = r3;
                this.a = p3;
            }

            @Override
            public void a(int n3) {
                this.a.g(null);
                android.ext.r.I();
            }
        });
        p3.b();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            boolean bl = super.dispatchKeyEvent(keyEvent);
            return bl;
        }
        catch (IllegalStateException illegalStateException) {
            e1.a(illegalStateException);
            return false;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m() {
        Throwable throwable3;
        block11: {
            int n3;
            String[] stringArray;
            Serializable serializable;
            int n4;
            Object object;
            Serializable serializable2;
            if (!Config.vSpaceReal) {
                serializable2 = new StringBuilder();
                try {
                    ((StringBuilder)serializable2).append("INTERNET: 0~");
                    char c4 = Config.vSpaceReal ? (char)'$' : '#';
                    ((StringBuilder)serializable2).append(c4);
                    ((StringBuilder)serializable2).append(";1~");
                    object = Tools.f0();
                    n4 = object.checkPermission("android.permission.INTERNET", android.os.Process.myPid(), android.os.Process.myUid());
                    ((StringBuilder)serializable2).append(n4);
                    ((StringBuilder)serializable2).append(";2~");
                    ((StringBuilder)serializable2).append(object.checkCallingOrSelfPermission("android.permission.INTERNET"));
                    ((StringBuilder)serializable2).append(";3~");
                    ((StringBuilder)serializable2).append(object.checkCallingPermission("android.permission.INTERNET"));
                    e1.d(((StringBuilder)serializable2).toString());
                    if (n4 != 0) {
                        object = Thread.currentThread();
                        serializable = new RuntimeException(((StringBuilder)serializable2).toString());
                        n0.h((Thread)object, (Throwable)serializable, false);
                    }
                }
                catch (Throwable throwable2) {
                    serializable2 = new RuntimeException(((StringBuilder)serializable2).toString(), throwable2);
                    e1.a((Throwable)serializable2);
                    n0.h(Thread.currentThread(), (Throwable)serializable2, false);
                }
            }
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            try {
                serializable2 = Tools.f0();
                stringArray = Tools.A0(Tools.C0(), 4096);
                if (stringArray == null) return;
                if (stringArray.requestedPermissions == null) return;
                serializable = new ArrayList();
                object = Tools.B0();
                stringArray = stringArray.requestedPermissions;
                n3 = stringArray.length;
            }
            catch (Throwable throwable3) {
                break block11;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                String string2 = stringArray[n4];
                if (string2 == null || android.ext.o.a((Context)serializable2, string2) == 0 && (!Config.vSpaceReal || object.checkPermission(string2, Config.E) == 0)) continue;
                serializable.add(string2);
            }
            {
                if (serializable.size() > 0) {
                    object = serializable.toArray(new String[serializable.size()]);
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append("requestPermissions: ");
                    ((StringBuilder)serializable).append(Arrays.toString(object));
                    e1.d(((StringBuilder)serializable).toString());
                    android.ext.r.i((Context)serializable2);
                    s1.y();
                    android.ext.p.a(this, (String[])object, 0);
                    return;
                }
                android.ext.r.j();
                s1.B();
                return;
            }
        }
        e1.a(throwable3);
    }

    protected void onActivityResult(int n3, int n4, Intent intent) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d ? "Installer: " : "";
        stringBuilder.append(string2);
        stringBuilder.append("onActivityResult()");
        e1.d(stringBuilder.toString());
        super.onActivityResult(n3, n4, intent);
        if (this.d) {
            b1.F0(n3, n4, intent);
        } else if (s1.u()) {
            s1.A();
        } else {
            z.m();
        }
    }

    public void onBackPressed() {
        try {
            super.onBackPressed();
        }
        catch (IllegalStateException illegalStateException) {
            e1.a(illegalStateException);
        }
    }

    public void onClick(View view) {
        if (view == null) {
            return;
        }
        switch (view.getId()) {
            default: {
                break;
            }
            case 2131034304: {
                ConfigListAdapter.d();
                break;
            }
            case 2131034277: {
                ConfigListAdapter.s();
                break;
            }
            case 2131034263: {
                try {
                    this.P(p).show();
                }
                catch (Throwable throwable) {
                    e1.a(throwable);
                    android.ext.f.m(this.P(Tools.f0()));
                }
                break;
            }
            case 2131034149: {
                new z(this).u();
                break;
            }
            case 2131034134: {
                e1.d("Pushed exit");
                this.finish();
                new p0(100).onClick(null, 0);
                break;
            }
            case 2131034133: {
                if (m2.a) {
                    try {
                        if (!this.moveTaskToBack(true)) {
                            this.finish();
                        }
                    }
                    catch (Throwable throwable) {
                        e1.a(throwable);
                    }
                }
                MainService.instance.e1();
            }
        }
    }

    @Override
    public void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        n0.f();
        boolean bl = this instanceof MainActivity;
        if (bl || n == null) {
            n = this;
        }
        if (bl || !(p instanceof a.b)) {
            p = a.b.i((Context)this);
        }
        if (bl || o == null) {
            o = a.b.i(this.getApplicationContext());
        }
        try {
            object2 = new Button((Context)this);
            object2.setText((CharSequence)"Fix it");
            object2.setId(2131034263);
            object2.setOnClickListener((View.OnClickListener)this);
            this.setContentView((View)object2);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
        this.r();
        c.a = false;
        Tools.W0(this);
        object2 = this.getWindow();
        if (object2 != null) {
            if (l) {
                object2.addFlags(0x1000000);
            } else {
                object2.clearFlags(0x1000000);
            }
        }
        a.b.a(p);
        android.ext.k.g();
        this.Q();
        StringBuilder stringBuilder = new StringBuilder();
        object2 = Config.C ? "$" : (Config.vSpaceReal ? "@" : "#");
        stringBuilder.append((String)object2);
        stringBuilder.append(' ');
        stringBuilder.append(b2.f(2131296280));
        stringBuilder.append(' ');
        float f4 = 1.0f;
        stringBuilder.append(105.0f * f4 - 3.6f);
        stringBuilder.append(" (");
        stringBuilder.append((int)(f4 * 17071.5f - 916.5f + 0.5f));
        stringBuilder.append(") ");
        object2 = l ? "HW" : "SW";
        stringBuilder.append((String)object2);
        this.setTitle(stringBuilder.toString());
        this.z();
        Tools.o();
        object = new Runnable(this, (Bundle)object){
            private boolean a;
            final Bundle b;
            final r c;
            {
                this.c = r3;
                this.b = bundle;
                this.a = false;
            }

            @Override
            public void run() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this);
                stringBuilder.append(": 200");
                e1.d(stringBuilder.toString());
                if (this.a) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(this);
                    stringBuilder.append(": already");
                    e1.d(stringBuilder.toString());
                    return;
                }
                this.a = true;
                this.c.B(this.b);
            }
        };
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(": 10");
        e1.d(((StringBuilder)object2).toString());
        b1.i1((Runnable)object);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(": 20");
        e1.d(((StringBuilder)object2).toString());
    }

    @Override
    public void onDestroy() {
        if (this.isFinishing()) {
            android.ext.r.j();
        }
        this.M(false);
        this.n();
        super.onDestroy();
        if (!this.d && q) {
            e1.d("onDestroy(exit)");
            f1.o();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = this.d ? "Installer: " : "";
            stringBuilder.append(string2);
            stringBuilder.append("onDestroy()");
            e1.d(stringBuilder.toString());
        }
    }

    public boolean onKeyUp(int n3, KeyEvent keyEvent) {
        try {
            boolean bl = super.onKeyUp(n3, keyEvent);
            return bl;
        }
        catch (IllegalStateException illegalStateException) {
            e1.a(illegalStateException);
            return false;
        }
    }

    @Override
    public void onPause() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d ? "Installer: " : "";
        stringBuilder.append(string2);
        stringBuilder.append("onPause()");
        e1.d(stringBuilder.toString());
        this.M(false);
        if (!this.d && MainService.instance != null && !s1.u() && m2.a) {
            MainService.instance.e1();
        }
        super.onPause();
    }

    @Override
    protected void onPostCreate(Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d ? "Installer: " : "";
        stringBuilder.append(string2);
        stringBuilder.append("onPostCreate()");
        e1.d(stringBuilder.toString());
        super.onPostCreate(bundle);
    }

    @Override
    protected void onPostResume() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d ? "Installer: " : "";
        stringBuilder.append(string2);
        stringBuilder.append("onPostResume()");
        e1.d(stringBuilder.toString());
        this.M(true);
        this.y(true);
        super.onPostResume();
    }

    public void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
        android.ext.r.j();
        if (stringArray != null && nArray != null) {
            int n4 = Math.min(stringArray.length, nArray.length);
            for (int i3 = 0; i3 < n4; ++i3) {
                String string2 = stringArray[i3];
                if (string2 == null) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(": ");
                stringBuilder.append(nArray[i3]);
                e1.d(stringBuilder.toString());
            }
        }
        super.onRequestPermissionsResult(n3, stringArray, nArray);
        s1.B();
    }

    @Override
    protected void onRestart() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d ? "Installer: " : "";
        stringBuilder.append(string2);
        stringBuilder.append("onRestart()");
        e1.d(stringBuilder.toString());
        this.M(true);
        this.y(true);
        super.onRestart();
    }

    @Override
    public void onResume() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d ? "Installer: " : "";
        stringBuilder.append(string2);
        stringBuilder.append("onResume()");
        e1.d(stringBuilder.toString());
        b1.G0();
        this.M(true);
        this.y(true);
        super.onResume();
        if (s1.O() != 1) {
            s1.C();
        }
        if (!this.d && MainService.instance != null) {
            if (m2.a) {
                MainService.instance.g1();
            } else if (MainService.instance.n == null) {
                android.ext.r.S();
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("installer-state", (Parcelable)b1.j0());
        super.onSaveInstanceState(bundle);
    }

    @Override
    protected void onStart() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d ? "Installer: " : "";
        stringBuilder.append(string2);
        stringBuilder.append("onStart()");
        e1.d(stringBuilder.toString());
        this.M(true);
        this.y(true);
        this.A();
        super.onStart();
    }

    @Override
    public void onStop() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d ? "Installer: " : "";
        stringBuilder.append(string2);
        stringBuilder.append("onStop()");
        e1.d(stringBuilder.toString());
        this.M(false);
        this.n();
        super.onStop();
    }

    void p() {
        Runnable runnable = this.j;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean x() {
        return this.e;
    }

    public static class n
    implements DialogInterface.OnClickListener,
    View.OnClickListener {
        private String a;

        public n(String string2) {
            String string3 = string2;
            if (string2 == null) {
                string3 = "kwws=22jdphjxdugldq1qhw2grzqordg";
            }
            this.a = string3;
        }

        public void onClick(DialogInterface dialogInterface, int n3) {
            try {
                dialogInterface = Tools.f0();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)Tools.removeNewLinesChars(this.a)));
                dialogInterface.startActivity(intent);
                android.ext.f.d();
            }
            catch (Throwable throwable) {
                e1.s("Failed call activity", throwable);
            }
        }

        public void onClick(View view) {
            this.onClick(null, 0);
        }
    }
}

