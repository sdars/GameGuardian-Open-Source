/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.g0;
import android.ext.n2;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.UnknownHostException;

public abstract class e1 {
    static volatile boolean a = false;
    static volatile BufferedWriter b;
    private static long c;
    static final Runnable d;
    static String e;
    public static String f;
    static StringBuilder g;

    static {
        d = new Runnable(){

            @Override
            public void run() {
                e1.m(true);
            }
        };
        e = "/last_run.log";
        f = "- none -";
        g = null;
    }

    public static int a(Throwable throwable) {
        return e1.s("Bad implementation", throwable);
    }

    public static void b() {
        n2.g(new Runnable(){

            @Override
            public void run() {
                a = true;
                if (b == null) {
                    return;
                }
                try {
                    b.flush();
                    b.close();
                    b = null;
                }
                catch (IOException iOException) {
                    android.ext.e1$e.b("AndroidService", "Log close: I/O", iOException);
                }
            }
        });
    }

    public static void c() {
        n2.g(new Runnable(){

            @Override
            public void run() {
                e1.b();
            }
        });
    }

    public static int d(String string2) {
        return e1.e("AndroidService", string2);
    }

    public static int e(String string2, String string3) {
        return android.ext.e1$e.a(string2, string3);
    }

    public static int f(String string2, String string3, Throwable throwable) {
        return android.ext.e1$e.b(string2, string3, throwable);
    }

    public static int g(String string2, Throwable throwable) {
        return e1.f("AndroidService", string2, throwable);
    }

    public static int h(String string2) {
        int n3 = string2.length();
        int n4 = 0;
        while (n4 < n3) {
            int n5 = n4 + 1003;
            int n6 = n5 < n3 ? n5 : n3;
            e1.d(string2.substring(n4, n6));
            n4 = n5;
        }
        return 0;
    }

    public static int i(String string2) {
        return e1.j("AndroidService", string2);
    }

    public static int j(String string2, String string3) {
        return android.ext.e1$e.c(string2, string3);
    }

    public static int k(String string2, String string3, Throwable throwable) {
        return android.ext.e1$e.d(string2, string3, throwable);
    }

    public static int l(String string2, Throwable throwable) {
        return e1.k("AndroidService", string2, throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean m(boolean bl) {
        long l3;
        block6: {
            IOException iOException2;
            block8: {
                if (b == null) {
                    return false;
                }
                try {
                    l3 = System.currentTimeMillis();
                    long l4 = c;
                    if (l3 - l4 <= 5000L && !bl) break block6;
                    try {}
                    catch (NullPointerException nullPointerException) {
                    }
                }
                catch (IOException iOException2) {
                    break block8;
                }
                b.flush();
            }
            android.ext.e1$e.b("AndroidService", "Log write: I/O", iOException2);
        }
        return false;
        c = l3;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public static String n(Throwable var0) {
        block9: {
            var2_2 = "";
            if (var0 == null) {
                return "";
            }
            for (var1_3 = var0; var1_3 != null; var1_3 = var1_3.getCause()) {
                if (!(var1_3 instanceof UnknownHostException)) continue;
                return "";
            }
            var1_3 = new StringWriter();
            var3_4 = new PrintWriter((Writer)var1_3);
            try {
                var0.printStackTrace(var3_4);
            }
            catch (Throwable var4_5) {
                var0 = new StringBuilder();
                var0.append("Exception on printStackTrace: ");
                var0.append(var4_5.getMessage());
                var0 = var0.toString();
lbl19:
                // 2 sources

                while (true) {
                    var3_4.write((String)var0);
                    break;
                }
            }
            catch (OutOfMemoryError var4_6) {
                var3_4.write("OutOfMemoryError 1\n");
                while (var0 != null) {
                    try {
                        var3_4.write(var0.toString());
                        var3_4.write("\n");
                        var0 = var0.getCause();
                    }
                    catch (OutOfMemoryError var0_1) {
                        var0 = "OutOfMemoryError 2\n";
                        ** continue;
lbl33:
                        // 1 sources

                        ** GOTO lbl19
                    }
                }
            }
            var3_4.flush();
            var0 = var1_3.toString();
            if (var0 != null) break block9;
            var0 = var2_2;
        }
        return var0;
    }

    public static void o(Process process, InputStream inputStream) {
        if (process == null) {
            return;
        }
        new g0("runLogOnProcessErrStream", inputStream, process){
            final InputStream a;
            final Process b;
            {
                this.a = inputStream;
                this.b = process;
                super(string2);
            }

            /*
             * Exception decompiling
             */
            @Override
            public void run() {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [5 : 77->83)] java.lang.NullPointerException
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                 *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                 */
                throw new IllegalStateException("Decompilation failed");
            }
        }.start();
    }

    public static int p(String string2) {
        return e1.q("AndroidService", string2);
    }

    public static int q(String string2, String string3) {
        return android.ext.e1$e.g(string2, string3);
    }

    public static int r(String string2, String string3, Throwable throwable) {
        return android.ext.e1$e.h(string2, string3, throwable);
    }

    public static int s(String string2, Throwable throwable) {
        return e1.r("AndroidService", string2, throwable);
    }

    public static abstract class e {
        public static int a(String string2, String string3) {
            return android.ext.e1$e.f(2, string2, string3, null);
        }

        public static int b(String string2, String string3, Throwable throwable) {
            return android.ext.e1$e.f(3, string2, string3, throwable);
        }

        public static int c(String string2, String string3) {
            return android.ext.e1$e.f(9, string2, string3, null);
        }

        public static int d(String string2, String string3, Throwable throwable) {
            return android.ext.e1$e.f(10, string2, string3, throwable);
        }

        private static String e(String string2) {
            String string3;
            if (string2 == null) {
                string3 = "null";
            } else {
                string3 = string2;
                if (string2.length() > 23) {
                    string3 = string2.substring(0, 23);
                }
            }
            return string3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private static int f(int n3, String string2, String string3, Throwable throwable) {
            String string4 = android.ext.e1$e.e(string2);
            string2 = string3;
            if (string3 == null) {
                string2 = "null";
            }
            int n4 = string2.length();
            int n5 = 0;
            while (true) {
                int n6;
                block9: {
                    block10: {
                        block13: {
                            block11: {
                                block12: {
                                    int n7;
                                    n6 = n7 = n4 - n5;
                                    if (n7 > 1023) {
                                        n6 = 1023;
                                    }
                                    string3 = string2.substring(n5, n6 += n5);
                                    if (n3 == 2) break block10;
                                    if (n3 == 3) break block11;
                                    if (n3 == 6) break block10;
                                    if (n3 == 7) break block12;
                                    if (n3 == 9) break block10;
                                    if (n3 != 10) break block9;
                                    if (n6 != n4) break block10;
                                    break block13;
                                }
                                if (n6 != n4) break block10;
                                break block13;
                            }
                            if (n6 != n4) break block10;
                        }
                        try {
                            Log.e((String)string4, (String)string3, (Throwable)throwable);
                            break block9;
                        }
                        catch (OutOfMemoryError outOfMemoryError) {}
                    }
                    try {
                        Log.e((String)string4, (String)string3);
                    }
                    catch (OutOfMemoryError outOfMemoryError) {
                        Log.e((String)string4, (String)"OOM for Log 1");
                    }
                }
                if (n6 >= n4) {
                    return 0;
                }
                n5 = n6;
            }
        }

        public static int g(String string2, String string3) {
            return android.ext.e1$e.f(6, string2, string3, null);
        }

        public static int h(String string2, String string3, Throwable throwable) {
            return android.ext.e1$e.f(7, string2, string3, throwable);
        }
    }
}

