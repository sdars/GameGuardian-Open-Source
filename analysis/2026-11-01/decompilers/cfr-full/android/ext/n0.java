/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.ext.Config;
import android.ext.ConfigListAdapter;
import android.ext.Tools;
import android.ext.b1;
import android.ext.b2;
import android.ext.e1;
import android.ext.e2;
import android.ext.f;
import android.ext.f0;
import android.ext.f1;
import android.ext.p2;
import android.ext.r;
import android.ext.z2;
import android.os.Build;
import android.os.Looper;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Arrays;

public class n0
implements Thread.UncaughtExceptionHandler {
    private static volatile Throwable c;
    private static volatile boolean d = false;
    private final Thread.UncaughtExceptionHandler a;
    private final String b;

    private n0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, String string2) {
        this.a = uncaughtExceptionHandler;
        this.b = string2;
    }

    private static void a(String string2, int n3, DialogInterface.OnClickListener onClickListener) {
        String[] stringArray = n0.e();
        StringBuilder stringBuilder = new StringBuilder();
        int n4 = n3 * 2;
        stringBuilder.append(stringArray[n4]);
        stringBuilder.append(" is reason of last fail");
        e1.p(stringBuilder.toString());
        AlertDialog.Builder builder = f.b().setCustomTitle(Tools.g0(2131296736));
        stringBuilder = new StringBuilder();
        stringBuilder.append(Tools.L1(b2.f(2131296729), stringArray[n4]));
        stringBuilder.append("\n\n");
        stringBuilder.append(string2);
        string2 = builder.setMessage((CharSequence)stringBuilder.toString()).setNeutralButton((CharSequence)b2.f(2131296786), new DialogInterface.OnClickListener(stringArray, n3){
            final String[] a;
            final int b;
            {
                this.a = stringArray;
                this.b = n3;
            }

            public void onClick(DialogInterface dialogInterface, int n3) {
                Tools.i1(this.a[this.b * 2 + 1]);
            }
        }).setNegativeButton((CharSequence)b2.f(2131296836), null);
        if (onClickListener != null) {
            string2.setPositiveButton((CharSequence)b2.f(2131296455), onClickListener);
        }
        f.s((AlertDialog.Builder)string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b() {
        StackOverflowError stackOverflowError3;
        block12: {
            IOException iOException2;
            block11: {
                Runnable runnable;
                Object object;
                Object object2;
                Object object3;
                n0.c();
                try {
                    object3 = Tools.M0();
                    if (object3.contains("last_exception")) {
                        object2 = object3.getString("last_exception", "- unknown -");
                        object = object3.getString("last_exception_trace", "- unknown -");
                        runnable = new Runnable((SharedPreferences)object3){
                            final SharedPreferences a;
                            {
                                this.a = sharedPreferences;
                            }

                            @Override
                            public void run() {
                                this.a.edit().remove("last_exception").commit();
                            }
                        };
                        n0.j((String)object2, (String)object, runnable);
                    }
                }
                catch (StackOverflowError stackOverflowError2) {
                    e1.a(stackOverflowError2);
                }
                try {
                    object3 = new File(Tools.q0(), "store_ex.txt");
                    boolean bl = ((File)object3).exists();
                    if (!bl) return;
                    try {
                        object2 = new FileInputStream((File)object3);
                        object = new InputStreamReader((InputStream)object2);
                        runnable = new BufferedReader((Reader)object);
                        object = new StringBuilder();
                        while ((object2 = ((BufferedReader)((Object)runnable)).readLine()) != null) {
                            object.append((String)object2);
                            object.append('\n');
                        }
                    }
                    catch (IOException iOException2) {
                        break block11;
                    }
                }
                catch (StackOverflowError stackOverflowError3) {
                    break block12;
                }
                ((BufferedReader)((Object)runnable)).close();
                object = object.toString().split("@#%~~%#@", 2);
                runnable = object[0];
                object2 = object[1];
                {
                    object = new Runnable((File)object3){
                        final File a;
                        {
                            this.a = file;
                        }

                        @Override
                        public void run() {
                            this.a.delete();
                        }
                    };
                    n0.j((String)((Object)runnable), (String)object2, (Runnable)object);
                    return;
                }
            }
            e1.l("Failed load exception", iOException2);
            return;
        }
        e1.a(stackOverflowError3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c() {
        block19: {
            block13: {
                block18: {
                    block21: {
                        block22: {
                            block20: {
                                block17: {
                                    block14: {
                                        block15: {
                                            var5 = new File(Tools.q0(), "client_crash.log");
                                            if ((Config.c & 64L) != 0L || !var5.exists() || var5.length() <= 0L) break block19;
                                            try {
                                                var4_1 = new StringBuilder();
                                                var2_5 = false;
                                                var1_6 = false;
                                                var0_7 = var2_5;
                                            }
                                            catch (Throwable var4_2) {
                                                break block13;
                                            }
                                            try {
                                                var0_7 = var2_5;
                                                var0_7 = var2_5;
                                                var0_7 = var2_5;
                                                var8_11 = new FileInputStream(var5);
                                                var0_7 = var2_5;
                                                var7_10 = new InputStreamReader((InputStream)var8_11);
                                                var0_7 = var2_5;
                                                var6_8 = new BufferedReader((Reader)var7_10);
lbl20:
                                                // 2 sources

                                                while (true) {
                                                    var0_7 = var1_6;
                                                    if (Thread.interrupted()) break block14;
                                                    var0_7 = var1_6;
                                                    var7_10 = var6_8.readLine();
                                                    if (var7_10 == null) break block14;
                                                    var2_5 = var1_6;
                                                    if (var1_6) break block15;
                                                    var0_7 = var1_6;
                                                    var8_11 = f0.T();
                                                    var0_7 = var1_6;
                                                    if (!var7_10.contains((CharSequence)var8_11)) break;
                                                    var0_7 = var1_6;
                                                    if (var7_10.trim().equals(var8_11)) break;
                                                    var2_5 = true;
                                                    break block15;
                                                    break;
                                                }
                                            }
                                            catch (Throwable var6_9) {
                                                break block17;
                                            }
                                            var0_7 = var1_6;
                                            e1.p("Native crash check fail.");
                                            break block14;
                                        }
                                        var0_7 = var2_5;
                                        var4_1.append((String)var7_10);
                                        var0_7 = var2_5;
                                        var4_1.append('\n');
                                        var1_6 = var2_5;
                                        ** while (true)
                                    }
                                    var0_7 = var1_6;
                                    var6_8.close();
                                    var0_7 = var1_6;
                                    break block20;
                                }
                                var4_1.append(var6_9.getMessage());
                                var4_1.append('\n');
                                e1.s("Native crash load fail.", var6_9);
                            }
                            if (!var0_7) break block21;
                            var3_12 = n0.d((String)(var4_1 = var4_1.toString()));
                            if (!var3_12) break block22;
                            var4_1 = new StringBuilder();
                            var4_1.append("Native crash detected: ");
                            var4_1.append(var5.length());
                            var4_1.append(" bytes, known reason.");
                            e1.p(var4_1.toString());
                            break block18;
                        }
                        var6_8 = new StringBuilder();
                        var6_8.append(">>> ");
                        var6_8.append(Tools.C0());
                        var6_8.append(" <<<");
                        if (var4_1.contains(var6_8.toString()) && var4_1.contains("backtrace:")) {
                            var6_8 = new StringBuilder();
                            var6_8.append("Native crash detected: ");
                            var6_8.append(var5.length());
                            var6_8.append(" bytes.");
                            e1.p(var6_8.toString());
                            e1.p("Native crash sended.");
                            n0.i((String)var4_1);
                            break block18;
                        } else {
                            var4_1 = new StringBuilder();
                            var4_1.append("Native crash not detected: ");
                            var4_1.append(var5.length());
                            var4_1.append(" bytes spooled without a native backtrace, discarded.");
                            var4_1 = var4_1.toString();
lbl108:
                            // 2 sources

                            while (true) {
                                e1.d((String)var4_1);
                                break block18;
                                break;
                            }
                        }
                    }
                    var4_1 = new StringBuilder();
                    var4_1.append("Native crash not detected: ");
                    var4_1.append(var5.length());
                    var4_1.append(" bytes spool failed the header check, discarded.");
                    var4_1 = var4_1.toString();
                    ** while (true)
                }
                var5.delete();
                break block19;
            }
            e1.s("Native crash check file fail.", var4_2);
        }
        try {
            var4_1 = new File(Tools.q0(), "client_exit");
            var4_1.delete();
        }
        catch (Throwable var4_3) {
            e1.s("Native crash clear exit mark fail.", var4_3);
        }
        try {
            var5.createNewFile();
            return;
        }
        catch (Throwable var4_4) {
            e1.s("Native crash create file fail.", var4_4);
        }
    }

    public static boolean d(String string2) {
        Object object = n0.e();
        if (string2.contains(" Process  (") && string2.contains(") has open file /")) {
            e1.p("unmount is reason of last fail");
            AlertDialog.Builder builder = f.b().setCustomTitle(Tools.g0(2131296736));
            object = new StringBuilder();
            ((StringBuilder)object).append(b2.f(2131297064));
            ((StringBuilder)object).append("\n\n");
            ((StringBuilder)object).append(string2);
            f.s(builder.setMessage((CharSequence)((StringBuilder)object).toString()).setPositiveButton((CharSequence)b2.f(2131296455), new DialogInterface.OnClickListener(){

                public void onClick(DialogInterface object, int n3) {
                    try {
                        object = Tools.f0().getFilesDir().getAbsolutePath();
                    }
                    catch (Throwable throwable) {
                        e1.s("Failed get files dir", throwable);
                        object = "error";
                    }
                    ConfigListAdapter.a((String)object);
                }
            }).setNegativeButton((CharSequence)b2.f(2131296836), null));
            return true;
        }
        if (string2.contains("CZAutoRunController")) {
            n0.a(string2, 3, new r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25<70krz0wr0uxq0lq0skrhql{rv0jdphjxdugldq2"));
            return true;
        }
        if (string2.contains(object[8])) {
            n0.a(string2, 4, new DialogInterface.OnClickListener((String[])object){
                final String[] a;
                {
                    this.a = stringArray;
                }

                public void onClick(DialogInterface object, int n3) {
                    try {
                        e2.n("exec setprop persist.sys.whetstone.level 0", 15);
                        object = new StringBuilder();
                        ((StringBuilder)object).append(this.a[8]);
                        ((StringBuilder)object).append(": ");
                        ((StringBuilder)object).append(b2.f(2131296836));
                        Tools.J1(b2.g(((StringBuilder)object).toString()));
                    }
                    catch (Throwable throwable) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed fix ");
                        stringBuilder.append(this.a[8]);
                        e1.p(stringBuilder.toString());
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(this.a[8]);
                        stringBuilder.append(": ");
                        stringBuilder.append(b2.f(2131296848));
                        Tools.J1(b2.g(stringBuilder.toString()));
                    }
                }
            });
            return true;
        }
        if (string2.contains(object[10])) {
            n0.a(string2, 5, null);
            return true;
        }
        return false;
    }

    public static String[] e() {
        return new String[]{"XPrivacy", "biz.bokhorst.xprivacy", "Prevent Running", "me.piebridge.forcestopgb", "Brevent", "me.piebridge.brevent", "Security", "com.chaozhuo.permission.controller", "Whetstone", "com.miui.whetstone", "NeoSafe", "cn.nubia.security2"};
    }

    public static void f() {
        n0.g(Thread.currentThread());
    }

    public static void g(Thread thread) {
        Object object;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (uncaughtExceptionHandler == null || !(uncaughtExceptionHandler instanceof n0)) {
            Thread.setDefaultUncaughtExceptionHandler(new n0(uncaughtExceptionHandler, "default"));
        }
        if ((object = thread.getUncaughtExceptionHandler()) == null || !(object instanceof n0)) {
            uncaughtExceptionHandler = object;
            if (object == null) {
                uncaughtExceptionHandler = thread.getThreadGroup();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("thread:");
            ((StringBuilder)object).append(thread.getName());
            thread.setUncaughtExceptionHandler(new n0(uncaughtExceptionHandler, ((StringBuilder)object).toString()));
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String h(Thread object, Throwable object2, boolean bl) {
        Serializable serializable;
        Object object4;
        boolean bl2;
        String string2;
        float f4;
        String string3;
        Object object3;
        block24: {
            block28: {
                block26: {
                    boolean bl3;
                    block27: {
                        boolean bl4;
                        block25: {
                            object3 = Tools.removeNewLinesChars("JJ#fudvkhg");
                            string3 = ((Thread)object).getName();
                            if (bl) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Exception in thread ");
                                ((StringBuilder)object).append(string3);
                                e1.l(((StringBuilder)object).toString(), (Throwable)object2);
                                e1.c();
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("GG: ");
                            f4 = 1.0f;
                            ((StringBuilder)object).append(110.5f * f4 - 9.1f);
                            ((StringBuilder)object).append(" [");
                            ((StringBuilder)object).append((int)(16577.3f * f4 - 422.3f + 0.5f));
                            ((StringBuilder)object).append("]\nAndroid: ");
                            ((StringBuilder)object).append(Build.VERSION.RELEASE);
                            ((StringBuilder)object).append("\nSDK: ");
                            ((StringBuilder)object).append(Build.VERSION.SDK_INT);
                            ((StringBuilder)object).append("\nvSpace: ");
                            ((StringBuilder)object).append(f1.x());
                            ((StringBuilder)object).append("\nThread: ");
                            ((StringBuilder)object).append(string3);
                            ((StringBuilder)object).append('\n');
                            string2 = e1.n((Throwable)object2);
                            bl2 = (object2 instanceof StackOverflowError || string2.contains("java.lang.StackOverflowError")) && string2.contains("com.lody.virtual.client.ipc.");
                            ((StringBuilder)object).append(string2);
                            if (string2.contains("ActivityNotFoundException")) {
                                Tools.B(android.ext.i.d, (StringBuilder)object);
                            }
                            ((StringBuilder)object).append("\nHash: ");
                            try {
                                ((StringBuilder)object).append(b1.X());
                            }
                            catch (Throwable throwable3) {
                                ((StringBuilder)object).append("???");
                                e1.l("dbg", throwable3);
                            }
                            string2 = ((StringBuilder)object).toString();
                            bl3 = Tools.f0() != null;
                            bl4 = string2.contains("EGL_") || string2.contains("egl") || string2.contains("HardwareRenderer");
                            if (!bl || !bl3 || !bl4 || (Config.B & 2) == 0) break block25;
                            Config.b((int)2131034150).d = 0;
                            Config.k();
                            object = new StringBuilder();
                            ((StringBuilder)object).append((String)object3);
                            object2 = ". Hardware acceleration fail.";
                            break block26;
                        }
                        if (bl && bl4 && (Config.B & 2) == 0 && r.l) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append((String)object3);
                            ((StringBuilder)object).append(". Hardware acceleration fail. Try use 'GG (SW)' icon for start.");
                            object = ((StringBuilder)object).toString();
                            d = true;
                            r.l = false;
                            return object;
                        }
                        if (!bl || !bl3 || !string2.contains("Suggestion") || (Config.B & 8) == 0) break block27;
                        Config.b((int)2131034201).d = 0;
                        Config.k();
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object3);
                        object2 = ". Cause: suggestions.";
                        break block26;
                    }
                    if (!bl || !bl3 || !string2.contains("playSoundEffect") || (Config.B & 0x20) == 0) break block28;
                    Config.b((int)2131034212).d = 0;
                    Config.k();
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object3);
                    object2 = ". Cause: sound effects.";
                }
                ((StringBuilder)object).append((String)object2);
                return ((StringBuilder)object).toString();
            }
            try {
                object = new File(Tools.K0(), "crash.txt");
                object4 = new FileOutputStream((File)object, true);
                r.U((OutputStream)object4, ((File)object).getAbsolutePath(), "");
                ((FileOutputStream)object4).write("".getBytes());
                ((FileOutputStream)object4).write(string2.getBytes());
                ((FileOutputStream)object4).close();
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append("\nLog: ");
                ((StringBuilder)object4).append(((File)object).getAbsolutePath());
                object = ((StringBuilder)object4).toString();
            }
            catch (Throwable throwable4) {
                e1.s("Failed out crash to file", throwable4);
                object = object3;
            }
            try {
                object3 = new File(Tools.K0(), "logcat.txt");
                object4 = new FileOutputStream((File)object3, true);
                r.U((OutputStream)object4, ((File)object3).getAbsolutePath(), "");
                object4 = new String[]{"logcat", "-f", Tools.F0(((File)object3).getAbsolutePath()), "-d", "-v", "threadtime", "-b", "main", "-b", "system", "*:V"};
                try {
                    if (!Tools.X1(Tools.I((String[])object4), 15)) {
                        serializable = new StringBuilder();
                        serializable.append("timeout fail 1: ");
                        serializable.append(Arrays.toString((Object[])object4));
                        object4 = serializable.toString();
                        serializable = new RuntimeException();
                        e1.s((String)object4, (Throwable)serializable);
                    }
                }
                catch (Exception exception) {
                    e1.s("exec", exception);
                }
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object);
                ((StringBuilder)object4).append("\nLogcat: ");
                ((StringBuilder)object4).append(((File)object3).getAbsolutePath());
                object = object3 = ((StringBuilder)object4).toString();
                break block24;
            }
            catch (Throwable throwable22) {}
            e1.s("Failed out logcat to file", throwable22);
        }
        try {
            Config.b((int)2131034375).d = (int)(f4 * 16636.8f - 481.8f + 0.5f);
            Config.k();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append("\nNext run rec logcat: ");
            ((StringBuilder)object3).append(r.v());
            object = object3 = ((StringBuilder)object3).toString();
        }
        catch (Throwable throwable5) {
            e1.s("Failed enable logcat on next run", throwable5);
        }
        try {
            object3 = n0.e();
            if (bl) {
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(": ");
                ((StringBuilder)object4).append((String)object3[0]);
                if (string2.contains(((StringBuilder)object4).toString())) {
                    serializable = new StringBuilder();
                    serializable.append((String)object3[0]);
                    serializable.append(" is cause");
                    object4 = new RuntimeException(serializable.toString());
                    throw object4;
                }
            }
            if (bl2) {
                e1.d("VSpace StackOverflowError - log not sended");
                return object;
            }
            if (z2.d(string2, true)) {
                return object;
            }
            object3 = new RuntimeException("Failed sendLogBlocking");
            throw object3;
        }
        catch (Throwable throwable6) {}
        e1.s("Cannot send exception info", throwable6);
        if (!bl) return object;
        n0.l(string2, string3, e1.n((Throwable)object2));
        return object;
    }

    public static void i(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GG: ");
        float f4 = 1.0f;
        stringBuilder.append(112.3f * f4 - 10.9f);
        stringBuilder.append(" [");
        stringBuilder.append((int)(f4 * 16839.4f - 684.4f + 0.5f));
        stringBuilder.append("]\nAndroid: ");
        stringBuilder.append(Build.VERSION.RELEASE);
        stringBuilder.append("\nSDK: ");
        stringBuilder.append(Build.VERSION.SDK_INT);
        stringBuilder.append("\nvSpace: ");
        stringBuilder.append(f1.x());
        stringBuilder.append('\n');
        stringBuilder.append(string2);
        stringBuilder.append("\nHash: ");
        stringBuilder.append(b1.X());
        z2.d(stringBuilder.toString(), true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void j(String charSequence, String charSequence2, Runnable object) {
        String string2;
        int n3;
        AlertDialog.Builder builder;
        block4: {
            builder = n0.e();
            for (n3 = 0; n3 < ((String[])builder).length; n3 += 2) {
                string2 = builder[n3];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(": ");
                stringBuilder.append(string2);
                if (!((String)charSequence).contains(stringBuilder.toString())) {
                    continue;
                }
                break block4;
            }
            n3 = -1;
        }
        object = new DialogInterface.OnClickListener((String)charSequence, (String[])builder, n3, (Runnable)object){
            final String a;
            final String[] b;
            final int c;
            final Runnable d;
            {
                this.a = string2;
                this.b = stringArray;
                this.c = n3;
                this.d = runnable;
            }

            public void onClick(DialogInterface dialogInterface, int n3) {
                if (n3 == -1) {
                    z2.c(this.a);
                    Tools.H1(2131297008);
                }
                if (n3 == -3) {
                    Tools.i1(this.b[this.c + 1]);
                }
                this.d.run();
            }
        };
        if (n3 >= 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)builder[n3]);
            ((StringBuilder)charSequence).append(" is reason of last fail");
            e1.p(((StringBuilder)charSequence).toString());
            string2 = f.b().setCustomTitle(Tools.g0(2131296736));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(Tools.L1(b2.f(2131296729), builder[n3]));
            ((StringBuilder)charSequence).append("\n\n");
            ((StringBuilder)charSequence).append((String)charSequence2);
            charSequence = string2.setMessage((CharSequence)((StringBuilder)charSequence).toString()).setNeutralButton((CharSequence)b2.f(2131296786), (DialogInterface.OnClickListener)object);
            n3 = 2131296836;
        } else {
            builder = f.b().setCustomTitle(Tools.g0(2131296736));
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(b2.f(2131297049));
            ((StringBuilder)charSequence2).append("\n\n");
            ((StringBuilder)charSequence2).append((String)charSequence);
            charSequence = builder.setMessage((CharSequence)((StringBuilder)charSequence2).toString()).setPositiveButton((CharSequence)b2.f(2131297115), (DialogInterface.OnClickListener)object);
            n3 = 2131296805;
        }
        f.s(charSequence.setNegativeButton((CharSequence)b2.f(n3), (DialogInterface.OnClickListener)object));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void k(String string2) {
        Thread thread = new Thread(this, "showToast", string2){
            final String a;
            final n0 b;
            {
                this.b = n02;
                this.a = string3;
                super(string2);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public void run() {
                try {
                    Looper.prepare();
                    p2.j(Toast.makeText((Context)p2.h(), (CharSequence)this.a, (int)1));
                    Looper.loop();
                    return;
                }
                catch (Throwable throwable) {
                    return;
                }
            }
        };
        thread.start();
        try {
            Thread.sleep(4000L);
            return;
        }
        catch (InterruptedException | Throwable throwable) {
            return;
        }
    }

    public static void l(String string2, String object, String string3) {
        if (Tools.f0() != null) {
            Tools.M0().edit().putString("last_exception", string2).putString("last_exception_trace", string3).commit();
        } else {
            File file = new File(Tools.q0(), "store_ex.txt");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                Appendable appendable = new OutputStreamWriter(fileOutputStream);
                object = new BufferedWriter((Writer)appendable);
                appendable = new StringBuilder();
                ((StringBuilder)appendable).append(string2);
                ((StringBuilder)appendable).append("@#%~~%#@");
                ((StringBuilder)appendable).append(string3);
                ((Writer)object).write(((StringBuilder)appendable).toString());
                ((BufferedWriter)object).close();
            }
            catch (IOException iOException) {
                e1.l("Failed store exception", iOException);
            }
        }
    }

    public static void m(Thread object, Throwable serializable) {
        object = ((Thread)object).getName();
        String string2 = e1.n((Throwable)serializable);
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("GG: ");
        float f4 = 1.0f;
        ((StringBuilder)serializable).append(107.9f * f4 - 6.5f);
        ((StringBuilder)serializable).append(" [");
        ((StringBuilder)serializable).append((int)(f4 * 16499.8f - 344.8f + 0.5f));
        ((StringBuilder)serializable).append("]\nAndroid: ");
        ((StringBuilder)serializable).append(Build.VERSION.RELEASE);
        ((StringBuilder)serializable).append("\nSDK: ");
        ((StringBuilder)serializable).append(Build.VERSION.SDK_INT);
        ((StringBuilder)serializable).append("\nvSpace: ");
        ((StringBuilder)serializable).append(f1.x());
        ((StringBuilder)serializable).append("\nThread: ");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append('\n');
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("\nHash: ");
        ((StringBuilder)serializable).append(b1.X());
        n0.l(((StringBuilder)serializable).toString(), (String)object, string2);
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        Object object;
        if (c != throwable) {
            c = throwable;
            if (!(throwable instanceof h)) {
                this.k(n0.h(thread, throwable, true));
                if (d) {
                    r.I();
                }
            }
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("uncaughtException already called for: ");
            ((StringBuilder)object).append(throwable);
            e1.d(((StringBuilder)object).toString());
        }
        if ((object = this.a) != null) {
            object.uncaughtException(thread, throwable);
        }
    }

    public static class h
    extends RuntimeException {
        public h(String string2) {
            super(string2);
        }
    }

    public static class i
    extends Thread {
        public i(Runnable runnable, String string2) {
            super(runnable, string2);
            n0.g(this);
        }
    }
}

