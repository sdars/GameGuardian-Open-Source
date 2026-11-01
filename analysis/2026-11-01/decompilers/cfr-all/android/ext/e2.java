/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.os.Process
 *  android.text.TextUtils
 */
package android.ext;

import android.content.SharedPreferences;
import android.ext.Config;
import android.ext.Tools;
import android.ext.e1;
import android.ext.n0;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class e2 {
    public static String a = "";
    private static boolean b = false;
    private static String c = "su";
    private static final String[] d;
    static volatile int e;
    private static final Object f;
    private static boolean g;
    private static int h;
    private static boolean i;
    private static c j;

    static {
        SharedPreferences sharedPreferences = Tools.M0();
        c = sharedPreferences.getString("su", "su");
        b = sharedPreferences.getBoolean("sh", false);
        d = new String[]{"/debug_ramdisk", "/sbin", "/su/bin", "/magisk/.core/bin", "/magisk/phh/bin", "/system/xbin"};
        e = 0;
        f = new Object();
        g = false;
        h = 0;
        i = false;
    }

    private static String b() {
        return e2.c(new String[]{"/debug_ramdisk", "/vendor/bin", "/system/bin", "/bin", "/data/local", "/data/local/bin", "/system/sd/bin", "/system/bin/failsafe", "/system/bin/bstk", "/su/bin", "/magisk/.core/bin", "/magisk/phh/bin"});
    }

    private static String c(String[] stringArray) {
        ArrayList<String> arrayList = new ArrayList<String>(stringArray.length * 3);
        for (String string2 : stringArray) {
            arrayList.add(string2);
            if (!string2.contains("/bin")) continue;
            arrayList.add(string2.replace("/bin", "/xbin"));
            arrayList.add(string2.replace("/bin", "/sbin"));
        }
        return TextUtils.join((CharSequence)":", arrayList);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void d(int n3) {
        Object object = f;
        // MONITORENTER : object
        h = n3;
        g = true;
        i = false;
        c c4 = j;
        j = null;
        // MONITOREXIT : object
        if (c4 == null) return;
        c4.a(n3);
    }

    private static String e(String object, InputStream object2) {
        StringBuilder stringBuilder;
        block4: {
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(": ");
            int n3 = ((InputStream)object2).available();
            if (n3 <= 0) break block4;
            object = new byte[n3];
            n3 = ((InputStream)object2).read((byte[])object);
            if (n3 <= 0) break block4;
            try {
                object2 = new String(Arrays.copyOf((byte[])object, n3));
                stringBuilder.append((String)object2);
            }
            catch (IOException iOException) {
                stringBuilder.append(((Object)iOException).toString());
            }
        }
        stringBuilder.append('\n');
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String[] f(boolean bl) {
        CharSequence charSequence;
        Object object = System.getenv();
        int n3 = object.size();
        String string2 = object.get("PATH");
        int n4 = n3;
        if (string2 == null) {
            n4 = n3 + 1;
        }
        String[] stringArray = new String[n4];
        Iterator<Map.Entry<String, String>> iterator = object.entrySet().iterator();
        n4 = 0;
        while (iterator.hasNext()) {
            object = iterator.next();
            String string3 = (String)object.getKey();
            charSequence = (String)object.getValue();
            object = charSequence;
            if ("PATH".equals(string3)) {
                if (bl) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(e2.m());
                    ((StringBuilder)object).append(':');
                    ((StringBuilder)object).append(e2.b());
                    ((StringBuilder)object).append(':');
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)charSequence);
                    ((StringBuilder)object).append(':');
                    charSequence = e2.b();
                }
                ((StringBuilder)object).append((String)charSequence);
                object = ((StringBuilder)object).toString();
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append('=');
            ((StringBuilder)charSequence).append((String)object);
            stringArray[n4] = ((StringBuilder)charSequence).toString();
            ++n4;
        }
        if (string2 == null) {
            if (bl) {
                object = new StringBuilder();
                ((StringBuilder)object).append(e2.m());
                ((StringBuilder)object).append(':');
                ((StringBuilder)object).append(e2.b());
                object = ((StringBuilder)object).toString();
            } else {
                object = e2.b();
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("PATH=");
            ((StringBuilder)charSequence).append((String)object);
            stringArray[n4] = ((StringBuilder)charSequence).toString();
        }
        return stringArray;
    }

    public static String g(Process process) {
        StringBuilder stringBuilder = new StringBuilder();
        if (process != null) {
            stringBuilder.append(e2.e("stdout", process.getInputStream()));
            stringBuilder.append(e2.e("stderr", process.getErrorStream()));
            stringBuilder.append("exit value: ");
            try {
                stringBuilder.append(process.exitValue());
            }
            catch (IllegalThreadStateException illegalThreadStateException) {
                stringBuilder.append("already run");
            }
            stringBuilder.append('\n');
        } else {
            stringBuilder.append("process is null\n");
        }
        return stringBuilder.toString();
    }

    static String h(String string2) {
        if (Config.C) {
            return "sh";
        }
        if (string2 == null) {
            string2 = c;
        }
        return string2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void i(c runnable) {
        Object object = f;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                try {
                    if (g) {
                        int n3 = h;
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 5] lbl6 : MonitorExitStatement: MONITOREXIT : var2_2
                        runnable.a(n3);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    j = runnable;
                    if (i) {
                        return;
                    }
                    i = true;
                    runnable = new Runnable(){

                        @Override
                        public void run() {
                            e2.d(e2.k(null));
                        }
                    };
                    n0.i i3 = new n0.i(runnable, "RootProbe");
                    i3.start();
                    return;
                }
            }
            throw throwable2;
        }
    }

    static d j(String string2) {
        return e2.p("exec id", 20, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static int k(String charSequence) {
        Throwable throwable2;
        block5: {
            d d4;
            try {
                d4 = e2.j((String)charSequence);
                a = "";
                if (!d4.c) {
                    e1.d("root probe refused: no root shell could be started");
                    return -1;
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            if (d4.b) {
                e1.d("root probe unanswered: bound expired after 20s");
                return 0;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("root probe: ");
            ((StringBuilder)charSequence).append(d4.a);
            e1.d(((StringBuilder)charSequence).toString());
            boolean bl = d4.a.contains("uid=0");
            if (bl) {
                return 1;
            }
            return 0;
        }
        e1.l("Failed root probe", throwable2);
        return 0;
    }

    private static String l() {
        Object object = d;
        int n3 = ((String[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = object[i3];
            File file = new File(string2, "su");
            if (!file.isFile() || !file.canExecute()) continue;
            object = new StringBuilder();
            ((StringBuilder)object).append("absolute su fallback selected: ");
            ((StringBuilder)object).append(string2);
            e1.d(((StringBuilder)object).toString());
            return file.getAbsolutePath();
        }
        e1.d("no absolute su candidate usable; falling back to bare su");
        return "su";
    }

    private static String m() {
        return e2.c(new String[]{"/debug_ramdisk", "/su/bin", "/magisk/.core/bin", "/magisk/phh/bin", "/system/xbin", "/system/sbin", "/system/bin/failsafe", "/system/bin/bstk", "/bin"});
    }

    public static String n(String string2, int n3) {
        string2 = e2.o(string2, n3, null);
        a = "";
        return string2;
    }

    public static String o(String string2, int n3, String string3) {
        return e2.p((String)string2, (int)n3, (String)string3).a;
    }

    private static d p(String charSequence, int n3, String object) {
        boolean[] blArray;
        boolean bl;
        StringBuilder stringBuilder;
        block8: {
            block6: {
                ExecutionException executionException2;
                StringBuilder stringBuilder2;
                block7: {
                    stringBuilder = new StringBuilder();
                    bl = true;
                    blArray = new boolean[]{false};
                    e = 0;
                    object = new FutureTask(new Callable((String)charSequence, (String)object, blArray, stringBuilder){
                        final String a;
                        final String b;
                        final boolean[] c;
                        final StringBuilder d;
                        {
                            this.a = string2;
                            this.b = string3;
                            this.c = blArray;
                            this.d = stringBuilder;
                        }

                        /*
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         */
                        public String a() {
                            Throwable throwable2222;
                            Object object;
                            block8: {
                                int n3;
                                Object object2 = new StringBuilder();
                                ((StringBuilder)object2).append("cmd (");
                                ((StringBuilder)object2).append(this.a);
                                ((StringBuilder)object2).append(") start");
                                e1.d(((StringBuilder)object2).toString());
                                if (!Config.C || "" != (object2 = this.b)) {
                                    object2 = e2.h(this.b);
                                }
                                object = new StringBuilder();
                                ((StringBuilder)object).append("su (");
                                ((StringBuilder)object).append((String)object2);
                                ((StringBuilder)object).append(") used");
                                e1.d(((StringBuilder)object).toString());
                                object2 = object2 == "" ? Tools.I(new String[]{this.a}) : e2.r(this.a, (String)object2, true);
                                if (object2 == null) {
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append("cmd fail: ");
                                    ((StringBuilder)object2).append(a);
                                    e1.i(((StringBuilder)object2).toString());
                                    return "cmd fail - got null";
                                }
                                this.c[0] = true;
                                e = n3 = Tools.D0((Process)object2);
                                object = new BufferedReader(new InputStreamReader(((Process)object2).getInputStream()));
                                try {
                                    String string2;
                                    while ((string2 = ((BufferedReader)object).readLine()) != null) {
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append("cmd (");
                                        stringBuilder.append(this.a);
                                        stringBuilder.append(") out: ");
                                        stringBuilder.append(string2);
                                        e1.d(stringBuilder.toString());
                                        this.d.append(string2);
                                        this.d.append('\n');
                                    }
                                }
                                catch (Throwable throwable2222) {
                                    break block8;
                                }
                                ((BufferedReader)object).close();
                                this.d.append("exit code: ");
                                this.d.append(((Process)object2).waitFor());
                                object = new StringBuilder();
                                ((StringBuilder)object).append("cmd (");
                                ((StringBuilder)object).append(this.a);
                                ((StringBuilder)object).append(") exit: ");
                                ((StringBuilder)object).append(((Process)object2).exitValue());
                                e1.d(((StringBuilder)object).toString());
                                if (n3 > 0) {
                                    try {
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("Kill at end: ");
                                        ((StringBuilder)object2).append(n3);
                                        e1.d(((StringBuilder)object2).toString());
                                        android.os.Process.killProcess((int)n3);
                                        e1.d("Kill at end: ok");
                                    }
                                    catch (Throwable throwable3) {
                                        e1.g("Failed kill at end", throwable3);
                                    }
                                }
                                e = 0;
                                return null;
                            }
                            ((BufferedReader)object).close();
                            throw throwable2222;
                        }
                    });
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("runCmd: ");
                    stringBuilder2.append((String)charSequence);
                    new n0.i((Runnable)object, stringBuilder2.toString()).start();
                    long l3 = n3;
                    try {
                        ((FutureTask)object).get(l3, TimeUnit.SECONDS);
                        break block6;
                    }
                    catch (TimeoutException timeoutException) {
                    }
                    catch (ExecutionException executionException2) {
                        break block7;
                    }
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("cmd (");
                    stringBuilder2.append((String)charSequence);
                    stringBuilder2.append(") exit: timeout ");
                    stringBuilder2.append(n3);
                    e1.g(stringBuilder2.toString(), timeoutException);
                    stringBuilder.append("timeout: ");
                    stringBuilder.append(n3);
                    break block8;
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("cmd (");
                stringBuilder2.append((String)charSequence);
                stringBuilder2.append(") expection");
                e1.l(stringBuilder2.toString(), executionException2);
                stringBuilder.append("expection: ");
                stringBuilder.append(executionException2.getMessage());
            }
            bl = false;
        }
        n3 = e;
        if (n3 > 0) {
            try {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Kill: ");
                ((StringBuilder)charSequence).append(n3);
                e1.d(((StringBuilder)charSequence).toString());
                android.os.Process.killProcess((int)n3);
                e1.d("Kill: ok");
            }
            catch (Throwable throwable) {
                e1.g("Failed kill", throwable);
            }
        }
        e = 0;
        return new d(stringBuilder.toString(), bl, blArray[0]);
    }

    public static Process q(String string2) {
        return e2.r(string2, null, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Process r(String object, String object2, boolean bl) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("try: ");
        ((StringBuilder)charSequence).append((String)object);
        e1.d(((StringBuilder)charSequence).toString());
        if (!((String)object).contains("exec") && !((String)object).contains("exit")) {
            throw new RuntimeException("You forgot exec or exit");
        }
        if (((String)object).contains("/emulated/0")) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Possible bugged call to /emulated/0 from root: ");
            ((StringBuilder)charSequence).append((String)object);
            e1.p(((StringBuilder)charSequence).toString());
        }
        stringBuilder.append("try: ");
        stringBuilder.append((String)object);
        stringBuilder.append('\n');
        Object object3 = e2.h((String)object2);
        stringBuilder.append("su: ");
        stringBuilder.append((String)object3);
        stringBuilder.append('\n');
        if (!Config.C && b) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("exec ");
            ((StringBuilder)charSequence).append((String)object3);
            ((StringBuilder)charSequence).append('\n');
            ((StringBuilder)charSequence).append((String)object);
            string2 = ((StringBuilder)charSequence).toString();
            charSequence = "sh";
        } else {
            charSequence = object3;
            string2 = object;
        }
        String[] stringArray = new String[]{charSequence};
        object = new StringBuilder();
        ((StringBuilder)object).append("suCmd: '");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append("'; su: '");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append("'; runBin: '");
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append('\'');
        e1.d(((StringBuilder)object).toString());
        object2 = null;
        int n3 = 0;
        while (true) {
            block16: {
                block13: {
                    block15: {
                        block14: {
                            object = object2;
                            if (n3 >= 2) break;
                            if (n3 == 0) break block14;
                            if (n3 == 1) {
                                block12: {
                                    block11: {
                                        object = object2;
                                        try {
                                            e1.d("exec 1 start");
                                            object = object2;
                                            if (!"su".equals(charSequence)) break block11;
                                            object = object2;
                                            object3 = new String[1];
                                            object = object2;
                                            object3[0] = e2.l();
                                            break block12;
                                        }
                                        catch (Throwable throwable) {
                                            break block13;
                                        }
                                    }
                                    object3 = stringArray;
                                }
                                object = object2;
                                object = object2 = Tools.J((String[])object3, e2.f("su".equals(charSequence)));
                                object = object2;
                                object3 = new StringBuilder();
                                object = object2;
                                ((StringBuilder)object3).append("exec 1 end: ");
                                object = object2;
                                ((StringBuilder)object3).append(object2);
                                object = object2;
                                object3 = ((StringBuilder)object3).toString();
                                break block15;
                            } else {
                                object = object2;
                                object = object2;
                                object3 = new IllegalAccessException();
                                object = object2;
                                throw object3;
                            }
                        }
                        object = object2;
                        e1.d("exec 0 start");
                        object = object2;
                        object = object2 = Tools.I(stringArray);
                        object = object2;
                        object3 = new StringBuilder();
                        object = object2;
                        ((StringBuilder)object3).append("exec 0 end: ");
                        object = object2;
                        ((StringBuilder)object3).append(object2);
                        object = object2;
                        object3 = ((StringBuilder)object3).toString();
                    }
                    object = object2;
                    e1.d((String)object3);
                    object = object2;
                    object = object2;
                    DataOutputStream dataOutputStream = new DataOutputStream(((Process)object2).getOutputStream());
                    object = object2;
                    object = object2;
                    object3 = new StringBuilder();
                    object = object2;
                    ((StringBuilder)object3).append(Tools.F0(string2));
                    object = object2;
                    ((StringBuilder)object3).append('\n');
                    object = object2;
                    dataOutputStream.writeBytes(((StringBuilder)object3).toString());
                    object = object2;
                    dataOutputStream.flush();
                    object = object2;
                    object = object2;
                    object3 = new StringBuilder();
                    object = object2;
                    ((StringBuilder)object3).append("process started: ");
                    object = object2;
                    ((StringBuilder)object3).append(n3);
                    object = object2;
                    ((StringBuilder)object3).append('\n');
                    object = object2;
                    stringBuilder.append(((StringBuilder)object3).toString());
                    object = object2;
                    break block16;
                }
                while (object2 != null) {
                    stringBuilder.append(((Throwable)object2).toString());
                    stringBuilder.append('\n');
                    object2 = ((Throwable)object2).getCause();
                }
                stringBuilder.append('\n');
                stringBuilder.append(e2.g((Process)object));
            }
            if (object != null) break;
            ++n3;
            object2 = object;
        }
        e1.d("tryRoot end");
        if (bl) {
            a = stringBuilder.toString();
        }
        return object;
    }

    static interface c {
        public void a(int var1);
    }

    static final class d {
        final String a;
        final boolean b;
        final boolean c;

        d(String string2, boolean bl, boolean bl2) {
            this.a = string2;
            this.b = bl;
            this.c = bl2;
        }
    }
}

