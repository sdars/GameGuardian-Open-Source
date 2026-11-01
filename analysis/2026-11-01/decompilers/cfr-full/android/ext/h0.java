/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.MainService;
import android.ext.Tools;
import android.ext.b1;
import android.ext.b2;
import android.ext.c;
import android.ext.e1;
import android.ext.e2;
import android.ext.f;
import android.ext.g0;
import android.ext.h2;
import android.ext.t2;
import android.os.Build;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.GregorianCalendar;

public abstract class h0 {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a() {
        block20: {
            block18: {
                block17: {
                    var4 = Tools.K0();
                    var3_2 /* !! */  = new StringBuilder();
                    var3_2 /* !! */ .append("GG_");
                    var2_3 = Build.VERSION.RELEASE;
                    var3_2 /* !! */ .append((String)var2_3);
                    var3_2 /* !! */ .append("_API_");
                    var0_5 = Build.VERSION.SDK_INT;
                    var3_2 /* !! */ .append(var0_5);
                    var3_2 /* !! */ .append(".log");
                    var3_2 /* !! */  = new File((String)var4, var3_2 /* !! */ .toString()).getAbsolutePath();
                    var5_6 = new FileWriter((String)var3_2 /* !! */ , false);
                    var4 = new BufferedWriter((Writer)var5_6);
                    var5_6 = new GregorianCalendar();
                    var4.write(var5_6.getTime().toString());
                    var4.write("\n");
                    var4.write("Release: ");
                    var4.write((String)var2_3);
                    var4.write("\n");
                    var4.write("SDK: ");
                    var2_3 = new StringBuilder();
                    var2_3.append("");
                    var2_3.append(var0_5);
                    var4.write(var2_3.toString());
                    var4.write("\n");
                    try {
                        var5_6 = e2.r(Tools.removeNewLinesChars("hfkr#%olvw=%>#ov#0o#2surf2>#iru#l#lq#2surf2->#gr#hfkr#%fdw#'l2pdsv=%>#fdw#'l2pdsv>#grqh>#h{lw>"), null, true);
                        if (var5_6 != null) break block17;
                        var4.write(e2.a);
                        break block18;
                    }
                    catch (Exception var2_4) {
                        ** GOTO lbl-1000
                    }
                }
                var6_8 = new InputStreamReader(var5_6.getInputStream());
                var2_3 = new BufferedReader((Reader)var6_8);
                while ((var5_6 = var2_3.readLine()) != null) {
                    var4.write((String)var5_6);
                    var4.write("\n");
                }
                var2_3.close();
            }
            e2.a = "";
            var4.write("current pid: ");
            var5_6 = MainService.instance.v0;
            if (var5_6 != null) {
                var2_3 = new StringBuilder();
                var2_3.append("");
                var2_3.append(var5_6.f);
                var2_3 = var2_3.toString();
            } else {
                var2_3 = "0";
            }
            var4.write((String)var2_3);
            var4.write("\n");
            var4.write("search results:\n");
            var2_3 = MainService.instance.s0;
            var5_6 = new c();
            synchronized (var2_3) {
                try {}
                catch (Throwable var5_7) {}
                ** break block19
                {
                    throw var5_7;
                }
            }
            catch (Exception var4_1) {
                var2_3 = new StringBuilder();
                var2_3.append("Error opening file to save: ");
                var2_3.append((String)var3_2 /* !! */ );
                e1.l(var2_3.toString(), var4_1);
                var0_5 = 2131296442;
            }
            break block20;
lbl-1000:
            // 1 sources

            {
                var1_9 = var2_3.i();
                for (var0_5 = 0; var0_5 < var1_9; ++var0_5) {
                    var2_3.f(var0_5, (c)var5_6);
                    var6_8 = new StringBuilder();
                    var6_8.append(t2.e(8, var5_6.a));
                    var6_8.append(' ');
                    var6_8.append(var5_6.J());
                    var6_8.append(' ');
                    var6_8.append((Object)var5_6.u());
                    var6_8.append(" (");
                    var6_8.append(Integer.toBinaryString(var5_6.c));
                    var6_8.append(")\n");
                    var4.write(var6_8.toString());
                }
            }
            {
                var4.write("saved list:\n");
                var5_6 = MainService.instance.t0.f();
                for (var0_5 = 0; var0_5 < var5_6.l(); ++var0_5) {
                    var2_3 = (h2)var5_6.n(var0_5);
                    if (var2_3 == null) continue;
                    var6_8 = new StringBuilder();
                    var6_8.append(t2.e(8, var2_3.a));
                    var6_8.append(' ');
                    var6_8.append(var2_3.J());
                    var6_8.append(' ');
                    var6_8.append((Object)var2_3.u());
                    var6_8.append(" (");
                    var6_8.append(Integer.toBinaryString(var2_3.c));
                    var6_8.append(")\n");
                    var4.write(var6_8.toString());
                }
                ** GOTO lbl132
            }
lbl-1000:
            // 1 sources

            {
                var4.write(var2_4.getMessage());
                var4.write("\n");
lbl132:
                // 2 sources

                var4.close();
                var0_5 = 2131296758;
            }
        }
        f.o(f.b().setCustomTitle(Tools.g0(2131296890)).setMessage((CharSequence)Tools.L1(b2.f(var0_5), new Object[]{var3_2 /* !! */ })).setNegativeButton((CharSequence)b2.f(2131296836), null));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String b() {
        var5 = new StringBuilder();
        var5.append(" Android(");
        var0_1 = 0;
        while (true) {
            if (var0_1 >= 2) {
                var5.append(')');
                return var5.toString();
            }
            for (Object var6_6 : (new Class[]{Build.VERSION.class, Build.class})[var0_1].getFields()) {
                block8: {
                    try {
                        var3_4 = var6_6.getModifiers();
                        if (!Modifier.isPublic(var3_4) || !Modifier.isStatic(var3_4)) continue;
                        var5.append(var6_6.getName());
                        var5.append(": ");
                    }
                    catch (Throwable var6_8) {
                        var5.append(var6_8.getMessage());
                        continue;
                    }
                    try {
                        var6_6 = var6_6.get(null);
                        if (!(var6_6 instanceof Object[])) break block8;
                        var5.append(Arrays.toString((Object[])var6_6));
                        ** GOTO lbl37
                    }
                    catch (Throwable var6_7) {
                        ** GOTO lbl-1000
                    }
                }
                var5.append(var6_6);
                ** GOTO lbl37
lbl-1000:
                // 1 sources

                {
                    var5.append(var6_7.getMessage());
lbl37:
                    // 3 sources

                    var5.append("; ");
                }
            }
            ++var0_1;
        }
    }

    public static String c() {
        StringBuilder stringBuilder = new StringBuilder();
        float f4 = 1.0f;
        stringBuilder.append(103.5f * f4 - 2.1f);
        stringBuilder.append(" (");
        stringBuilder.append((int)(f4 * 16372.7f - 217.7f + 0.5f));
        stringBuilder.append(") ");
        stringBuilder.append(b1.X());
        stringBuilder.append(" on ");
        stringBuilder.append(h0.b());
        return stringBuilder.toString();
    }

    public static int d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(1.0f * 112.8f - 11.4f);
        return h0.e(stringBuilder.toString());
    }

    public static int e(String string2) {
        String[] stringArray = string2.replaceAll("[^\\d.]", "").split("\\.", -1);
        int n3 = 0;
        for (int i3 = 0; i3 < stringArray.length; ++i3) {
            try {
                int n4 = Integer.parseInt(stringArray[i3]);
                n3 = n3 * 100 + n4;
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bad part of version: ");
                stringBuilder.append(stringArray[i3]);
                stringBuilder.append('(');
                stringBuilder.append(string2);
                stringBuilder.append(')');
                e1.s(stringBuilder.toString(), numberFormatException);
            }
        }
        return n3;
    }

    public static String f(boolean bl) {
        return h0.g(bl, 0);
    }

    /*
     * Exception decompiling
     */
    private static String g(boolean var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [7, 6 : 63->93)] java.lang.Throwable
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

    public static void h() {
        Tools.H1(2131296330);
        new g0("runCollectRegionLog"){

            @Override
            public void run() {
                super.run();
                h0.a();
            }
        }.start();
    }

    public static void i() {
        new g0("showInfo"){

            @Override
            public void run() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("GG started: ");
                stringBuilder.append(h0.c());
                e1.h(stringBuilder.toString());
            }
        }.start();
    }
}

