/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.system.ErrnoException
 *  android.system.Os
 */
package android.ext;

import android.ext.Config;
import android.ext.InOut;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.i;
import android.ext.n2;
import android.lang.ProcessBuilder;
import android.system.ErrnoException;
import android.system.Os;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class e0 {
    private static volatile String b;
    private static volatile String c;
    private static volatile int d = 100;
    private static volatile char e = 'i';
    private static volatile char f = 'g';
    public static StringBuilder g;
    public static StringBuilder h;
    private final String a = this.i();

    static {
        g = new StringBuilder();
        h = new StringBuilder();
    }

    private static void a(ArrayList arrayList, String string2, String charSequence, boolean bl) {
        File file = new File(string2);
        if (!bl || file.exists()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("/files");
            arrayList.add(new File(stringBuilder.toString(), (String)charSequence));
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("/cache");
            arrayList.add(new File(stringBuilder.toString(), (String)charSequence));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("/files");
            arrayList.add(new File(((StringBuilder)charSequence).toString()));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("/cache");
            arrayList.add(new File(((StringBuilder)charSequence).toString()));
            arrayList.add(file);
        }
    }

    private static void b(char c4) {
        e0.c(Character.toString(c4));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c(String string2) {
        File file = new File(e0.g(), e0.r(string2));
        if (file.isFile()) return;
        Object object = new StringBuilder();
        ((StringBuilder)object).append("Extract file ");
        ((StringBuilder)object).append(file);
        e1.d(((StringBuilder)object).toString());
        Object object2 = Tools.f0().getResources();
        object = new StringBuilder();
        ((StringBuilder)object).append("ydw");
        ((StringBuilder)object).append(string2);
        int n3 = b2.d(((StringBuilder)object).toString(), "raw");
        if (n3 == 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Nothing extract file ");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(file.getAbsolutePath());
            e1.d(((StringBuilder)object).toString());
            return;
        }
        try {
            object = new byte[8192];
            InputStream inputStream = object2.openRawResource(n3);
            object2 = new FileOutputStream(file);
            while (true) {
                if ((n3 = inputStream.read((byte[])object)) <= 0) {
                    ((OutputStream)object2).close();
                    inputStream.close();
                    return;
                }
                ((OutputStream)object2).write((byte[])object, 0, n3);
            }
        }
        catch (Throwable throwable) {}
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed extract file ");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(' ');
        ((StringBuilder)object).append(file.getAbsolutePath());
        e1.g(((StringBuilder)object).toString(), throwable);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d(char var1_1) {
        block8: {
            block10: {
                block9: {
                    e0.b(var1_1);
                    if (var1_1 == '5') break block9;
                    if (var1_1 == '7' || var1_1 == '8') break block10;
                    if (var1_1 != 'a' && var1_1 != 'b') {
                        switch (var1_1) {
                            default: {
                                ** break;
                            }
                            case '2': {
                                e0.c("01");
                                e0.b('4');
                                e0.b('f');
                                e0.f = (char)102;
                                e0.b('k');
                            }
                            case '0': 
                            case '1': 
                        }
                        e0.b('3');
                        e0.b('e');
                        e0.e = (char)101;
                        var1_1 = (char)106;
                        break block8;
                    } else {
                        e0.b('d');
                        e0.b('i');
                        e0.e = (char)105;
                        var1_1 = (char)111;
                    }
                    break block8;
                }
                e0.c("08");
                e0.b('6');
                e0.b('g');
                e0.f = (char)103;
                e0.b('l');
            }
            e0.b('9');
            e0.b('h');
            e0.e = (char)104;
            var1_1 = (char)110;
        }
        e0.b(var1_1);
        ** break;
lbl39:
        // 2 sources

        try {
            var2_2 = new File(Tools.q0(), "sh.jar");
            Tools.M("sh", var2_2);
            return;
        }
        catch (Throwable var2_3) {
            e1.l("JVM fail", var2_3);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int e(String string2) {
        Object object;
        int n3;
        Tools.j(string2);
        int n4 = 0;
        while (true) {
            IOException iOException222;
            block7: {
                CharSequence charSequence;
                int n5 = n3 = 100;
                if (n4 >= 2) return n5;
                try {
                    charSequence = Tools.F0(string2);
                    object = Config.vSpaceReal ? Config.E : "1";
                }
                catch (IOException iOException222) {
                    break block7;
                }
                object = Tools.I(new String[]{charSequence, object});
                if (Tools.X1((Process)object, 30)) {
                    return ((Process)object).exitValue();
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("timeout: ");
                ((StringBuilder)charSequence).append(30);
                object = new RuntimeException(((StringBuilder)charSequence).toString());
                throw object;
            }
            if (n4 != 0) throw iOException222;
            object = iOException222.getMessage();
            if (object == null) throw iOException222;
            if (((String)object).indexOf("denied") == -1) throw iOException222;
            Tools.r(string2, "0755");
            ++n4;
            continue;
            break;
        }
        catch (Throwable throwable) {}
        object = new StringBuilder();
        ((StringBuilder)object).append("getArch: ");
        ((StringBuilder)object).append(string2);
        e1.s(((StringBuilder)object).toString(), throwable);
        h.append(throwable.toString());
        return n3;
    }

    public static int f() {
        e0.h();
        return d;
    }

    public static String g() {
        if (c == null) {
            File file;
            File file2 = file = e0.j();
            if (file == null) {
                file2 = Tools.q0();
            }
            c = e0.s(file2.getAbsolutePath());
        }
        return c;
    }

    public static String h() {
        if (b == null) {
            b = new e0().a;
        }
        return b;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    private String i() {
        block18: {
            Exception exception2;
            Object object;
            Object object2;
            block17: {
                block24: {
                    Object object3;
                    Object object4;
                    block16: {
                        Throwable throwable2;
                        block15: {
                            block23: {
                                char[] cArray = object2 = new char[9];
                                object2[0] = 0;
                                cArray[1] = 50;
                                cArray[2] = 49;
                                cArray[3] = 53;
                                cArray[4] = 56;
                                cArray[5] = 98;
                                cArray[6] = 48;
                                cArray[7] = 55;
                                cArray[8] = 97;
                                object4 = e0.g();
                                boolean bl = Config.C;
                                boolean bl2 = true;
                                int n3 = bl && (Config.G == 1 || Config.G == 0 && Config.E.contains("64")) ? 0 : 2;
                                for (int i3 = 0; i3 < ((char[])object2).length; ++i3) {
                                    int n4;
                                    block22: {
                                        int n5;
                                        block20: {
                                            block21: {
                                                block19: {
                                                    if (i3 != 0) break block19;
                                                    for (n5 = 1; n5 < ((char[])object2).length; ++n5) {
                                                        if (!new File((String)object4, e0.q(object2[n5])).exists()) continue;
                                                        object2[0] = object2[n5];
                                                        break;
                                                    }
                                                    if (object2[0] != '\u0000') break block19;
                                                    n5 = n3;
                                                    break block20;
                                                }
                                                h.append(object2[i3]);
                                                h.append(": ");
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append("0");
                                                ((StringBuilder)object).append(object2[i3]);
                                                object3 = ((StringBuilder)object).toString();
                                                object = new File((String)object4, e0.r((String)object3));
                                                if (!((File)object).isFile()) {
                                                    e0.c((String)object3);
                                                }
                                                if (((File)object).isFile()) break block21;
                                                h.append(object);
                                                h.append(" NF.\n");
                                                object3 = new StringBuilder();
                                                ((StringBuilder)object3).append("Not a file ");
                                                ((StringBuilder)object3).append(object);
                                                ((StringBuilder)object3).append(' ');
                                                ((StringBuilder)object3).append(((File)object).getAbsolutePath());
                                                e1.d(((StringBuilder)object3).toString());
                                                n5 = n3;
                                                break block20;
                                            }
                                            g.append(object2[i3]);
                                            n4 = this.e(((File)object).getAbsolutePath());
                                            if (this.o(object2[i3], n4)) break block22;
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append("getArch ");
                                            ((StringBuilder)object).append(object2[i3]);
                                            ((StringBuilder)object).append(' ');
                                            ((StringBuilder)object).append(n4);
                                            e1.d(((StringBuilder)object).toString());
                                            h.append("; ");
                                            h.append(n4);
                                            h.append('\n');
                                            n5 = n3;
                                            if (n3 == 0) {
                                                n5 = n3;
                                                if ((n4 & 0x7F) < 100) {
                                                    n5 = 1;
                                                }
                                            }
                                        }
                                        n3 = n5;
                                        continue;
                                    }
                                    bl = bl2;
                                    if (n4 != 105) {
                                        bl = n4 == 102 ? bl2 : false;
                                    }
                                    InOut.p(bl);
                                    g = new StringBuilder(0);
                                    h = new StringBuilder(0);
                                    object = new File((String)object4, e0.q(object2[i3])).getAbsolutePath();
                                    object4 = new StringBuilder();
                                    ((StringBuilder)object4).append("Daemon: ");
                                    ((StringBuilder)object4).append((String)object);
                                    e1.d(((StringBuilder)object4).toString());
                                    d = n4;
                                    this.d(object2[i3]);
                                    Tools.j((String)object);
                                    return object;
                                }
                                if (n3 != 1) break block16;
                                object = new File(Tools.K0());
                                object2 = object;
                                if (!this.n((File)object)) break block23;
                                object = Tools.f0().getExternalCacheDir();
                                object2 = object;
                                if (!this.n((File)object)) break block23;
                                object = Tools.f0().getExternalFilesDir(null);
                                object2 = object;
                                if (!this.n((File)object)) break block23;
                                object2 = new File;
                                object2("/sdcard");
                                break block23;
                                catch (Throwable throwable2) {
                                    break block15;
                                }
                            }
                            if (((File)(object = new File((File)object2, "gg_fixer.apk"))).exists()) {
                                ((File)object).delete();
                            }
                            Tools.M("fx", object);
                            object2 = new a;
                            object2(this, (File)object);
                            n2.i((Runnable)object2);
                            break block16;
                        }
                        e1.s("Failed extract fx", throwable2);
                    }
                    g.append(';');
                    object2 = Tools.F0((String)object4);
                    h.append("\n\n");
                    h.append("ls -l ");
                    h.append((String)object2);
                    h.append(":\n");
                    object3 = Tools.I(new String[]{"ls", "-l", object2});
                    object4 = new InputStreamReader(((Process)object3).getInputStream());
                    object = new BufferedReader((Reader)object4);
                    while ((object4 = ((BufferedReader)object).readLine()) != null) {
                        if (((String)object4).indexOf("lib") == -1 || ((String)object4).indexOf(".so") == -1) continue;
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("ls: ");
                        ((StringBuilder)object3).append((String)object4);
                        e1.d(((StringBuilder)object3).toString());
                        h.append((String)object4);
                        h.append('\n');
                    }
                    break block24;
                    catch (Exception exception2) {
                        break block17;
                    }
                }
                ((BufferedReader)object).close();
                break block18;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("ls: ");
            ((StringBuilder)object).append((String)object2);
            e1.s(((StringBuilder)object).toString(), exception2);
            h.append(exception2);
            h.append('\n');
        }
        h.append('\n');
        return "no_binary_for_your_arch";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static File j() {
        CharSequence charSequence;
        Iterator iterator = Tools.p0();
        Object object = Tools.b0();
        CharSequence charSequence2 = Tools.s0();
        Serializable serializable = new ArrayList<File>(64);
        ((ArrayList)serializable).add(Tools.q0());
        ((ArrayList)serializable).add(Tools.c0());
        ((ArrayList)serializable).add(iterator);
        ((ArrayList)serializable).add(object);
        ((ArrayList)serializable).add(new File(((File)((Object)iterator)).getParentFile(), (String)charSequence2));
        ((ArrayList)serializable).add(new File(((File)object).getParentFile(), (String)charSequence2));
        ((ArrayList)serializable).add(((File)((Object)iterator)).getParentFile());
        ((ArrayList)serializable).add(((File)object).getParentFile());
        iterator = ((File)((Object)iterator)).getAbsolutePath();
        object = ((String)((Object)iterator)).startsWith("/data/user/") ? ((String)((Object)iterator)).split("/", -1)[3] : "0";
        if (((String)((Object)iterator)).startsWith("/data/user/")) {
            iterator = new StringBuilder();
            ((StringBuilder)((Object)iterator)).append("/data/user/");
            ((StringBuilder)((Object)iterator)).append((String)object);
            ((StringBuilder)((Object)iterator)).append("/");
            iterator = ((StringBuilder)((Object)iterator)).toString();
        } else {
            iterator = "/data/data/";
        }
        if (Config.vSpaceReal) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)((Object)iterator));
            ((StringBuilder)charSequence).append(Config.E);
            iterator = ((StringBuilder)charSequence).toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/parallel_intl/0/");
            charSequence = i.d;
            stringBuilder.append((String)charSequence);
            e0.a(serializable, stringBuilder.toString(), (String)charSequence2, true);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/parallel_lite/0/");
            stringBuilder.append((String)charSequence);
            e0.a(serializable, stringBuilder.toString(), (String)charSequence2, true);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/parallel_pro/0/");
            stringBuilder.append((String)charSequence);
            e0.a((ArrayList)serializable, stringBuilder.toString(), (String)charSequence2, true);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/virtual/data/user/0/");
            stringBuilder.append((String)charSequence);
            e0.a((ArrayList)serializable, stringBuilder.toString(), (String)charSequence2, true);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/gaia/data/user/0/");
            stringBuilder.append((String)charSequence);
            e0.a((ArrayList)serializable, stringBuilder.toString(), (String)charSequence2, true);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/com.vmos.glb/osimg/r/ot01/data/data/");
            stringBuilder.append((String)charSequence);
            e0.a((ArrayList)serializable, stringBuilder.toString(), (String)charSequence2, true);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/mopen/data/user/0/");
            stringBuilder.append((String)charSequence);
            e0.a((ArrayList)serializable, stringBuilder.toString(), (String)charSequence2, true);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/vbox/data/user/0/");
            stringBuilder.append((String)charSequence);
            e0.a((ArrayList)serializable, stringBuilder.toString(), (String)charSequence2, true);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/sandboxdata/");
            stringBuilder.append((String)charSequence);
            e0.a((ArrayList)serializable, stringBuilder.toString(), (String)charSequence2, true);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/gameplugins/");
            stringBuilder.append((String)charSequence);
            e0.a((ArrayList)serializable, stringBuilder.toString(), (String)charSequence2, true);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)iterator));
            stringBuilder.append("/Plugin/0/");
            stringBuilder.append((String)charSequence);
            stringBuilder.append("/data/");
            stringBuilder.append((String)charSequence);
            e0.a((ArrayList)serializable, stringBuilder.toString(), (String)charSequence2, true);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("/data/user_de/");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("/");
            ((StringBuilder)charSequence).append(Config.E);
            e0.a((ArrayList)serializable, ((StringBuilder)charSequence).toString(), (String)charSequence2, false);
            e0.a((ArrayList)serializable, iterator, (String)charSequence2, false);
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)((Object)iterator));
            iterator = i.d;
            ((StringBuilder)charSequence).append((String)((Object)iterator));
            e0.a(serializable, ((StringBuilder)charSequence).toString(), (String)charSequence2, false);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("/data/user_de/");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("/");
            ((StringBuilder)charSequence).append((String)((Object)iterator));
            e0.a(serializable, ((StringBuilder)charSequence).toString(), (String)charSequence2, false);
            ((ArrayList)serializable).add(new File("/data/data"));
            ((ArrayList)serializable).add(new File("/data"));
        }
        iterator = ((ArrayList)serializable).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                e1.p("Failed get dir for fix");
                return null;
            }
            serializable = (File)iterator.next();
            if (serializable == null) continue;
            if (!((File)serializable).exists()) {
                ((File)serializable).mkdirs();
            }
            if (((File)serializable).exists()) {
                return serializable;
            }
            try {
                object = ((File)serializable).getAbsolutePath();
                try {
                    int n3 = Os.stat((String)object).st_mode;
                    if ((n3 & 0x4000) == 0) continue;
                    return serializable;
                }
                catch (Exception exception) {
                    if (exception instanceof ErrnoException) {
                        charSequence2 = new StringBuilder();
                        ((StringBuilder)charSequence2).append("Errno for path '");
                        ((StringBuilder)charSequence2).append((String)object);
                        ((StringBuilder)charSequence2).append("': ");
                        ((StringBuilder)charSequence2).append(((ErrnoException)((Object)exception)).errno);
                        object = ((StringBuilder)charSequence2).toString();
                    } else {
                        charSequence2 = new StringBuilder();
                        ((StringBuilder)charSequence2).append("Exception for path '");
                        ((StringBuilder)charSequence2).append((String)object);
                        ((StringBuilder)charSequence2).append("'");
                        object = ((StringBuilder)charSequence2).toString();
                    }
                    e1.s((String)object, exception);
                    continue;
                }
            }
            catch (Throwable throwable) {}
            e1.a(throwable);
        }
    }

    public static String k(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/lib");
        char c4 = bl ? f : e;
        stringBuilder.append(c4);
        stringBuilder.append(".so");
        return stringBuilder.toString();
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void l() {
        char[] cArray;
        char[] cArray2 = cArray = new char[6];
        cArray[0] = 0;
        cArray2[1] = 113;
        cArray2[2] = 112;
        cArray2[3] = 114;
        cArray2[4] = 115;
        cArray2[5] = 116;
        String string2 = e0.g();
        int n3 = 0;
        while (n3 < cArray.length) {
            block8: {
                CharSequence charSequence;
                File file;
                block9: {
                    block7: {
                        if (n3 != 0) break block7;
                        for (int i3 = 1; i3 < cArray.length; ++i3) {
                            if (!new File(string2, e0.q(cArray[i3])).exists()) continue;
                            cArray[0] = cArray[i3];
                            break;
                        }
                        if (cArray[0] == '\u0000') break block8;
                    }
                    if (!(file = new File(string2, e0.q(cArray[n3]))).isFile()) {
                        e0.b(cArray[n3]);
                    }
                    if (file.isFile()) break block9;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Not a file ");
                    ((StringBuilder)charSequence).append(file);
                    ((StringBuilder)charSequence).append(' ');
                    ((StringBuilder)charSequence).append(file.getAbsolutePath());
                    e1.d(((StringBuilder)charSequence).toString());
                    break block8;
                }
                charSequence = file.getAbsolutePath();
                System.load((String)charSequence);
                try {
                    ProcessBuilder.loaded();
                    return;
                }
                catch (Throwable throwable) {
                    void var3_5;
                    StringBuilder stringBuilder;
                    block10: {
                        stringBuilder = new StringBuilder();
                        charSequence = "Failed check ";
                        break block10;
                        catch (Throwable throwable2) {
                            stringBuilder = new StringBuilder();
                            charSequence = "Failed load ";
                        }
                    }
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append(file);
                    stringBuilder.append(' ');
                    stringBuilder.append(file.getAbsolutePath());
                    e1.g(stringBuilder.toString(), (Throwable)var3_5);
                }
            }
            ++n3;
        }
    }

    public static boolean m() {
        boolean bl = e0.f() == 105;
        return bl;
    }

    private boolean n(File file) {
        if (file == null) {
            return true;
        }
        if (!file.exists()) {
            file.mkdirs();
            if (!file.exists()) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean o(char c4, int n3) {
        boolean bl = false;
        if (c4 != '5') {
            if (c4 != '7') {
                if (c4 != '8') {
                    if (c4 != 'a') {
                        if (c4 != 'b') {
                            switch (c4) {
                                default: {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown lib: ");
                                    stringBuilder.append(c4);
                                    throw new RuntimeException(stringBuilder.toString());
                                }
                                case '2': {
                                    if (102 != n3) return bl;
                                }
                                case '1': {
                                    if (101 != n3) return bl;
                                    return true;
                                }
                                case '0': {
                                    if (101 != n3) return bl;
                                    return true;
                                }
                            }
                            return true;
                        }
                        if (103 != n3) return bl;
                        return true;
                    }
                    if (103 != n3) return bl;
                    return true;
                }
                if (104 != n3) return bl;
                return true;
            }
            if (104 != n3) return bl;
            return true;
        }
        if (105 != n3) return bl;
        return true;
    }

    public static boolean p() {
        int n3 = e0.f();
        boolean bl = n3 == 101 || n3 == 102;
        return bl;
    }

    private static String q(char c4) {
        return e0.r(Character.toString(c4));
    }

    private static String r(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lib");
        stringBuilder.append(string2);
        stringBuilder.append(".so");
        return stringBuilder.toString();
    }

    private static String s(String string2) {
        for (int i3 = 0; i3 < 13; ++i3) {
            Object object = new File(string2, e0.q((new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'd'})[i3]));
            if (!((File)object).exists() || Tools.j((String)(object = ((File)object).getAbsolutePath()))) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not execute ");
            stringBuilder.append((String)object);
            e1.d(stringBuilder.toString());
        }
        return string2;
    }
}

