/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.e1;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public abstract class h3 {
    /*
     * Exception decompiling
     */
    public static void a(File var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [7, 6 : 69->122)] java.lang.Throwable
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

    static boolean b(String string2) {
        boolean bl;
        boolean bl2 = bl = false;
        if (string2 != null) {
            bl2 = bl;
            if (string2.startsWith("lib/")) {
                if (!string2.endsWith(".so")) {
                    bl2 = bl;
                } else {
                    bl2 = bl;
                    if (string2.lastIndexOf(47) > 4) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    private static boolean c(long l3) {
        boolean bl = (l3 & 0xFFFL) == 0L;
        return bl;
    }

    public static int d(RandomAccessFile randomAccessFile) {
        int n3;
        int n4;
        int n5;
        int n6 = randomAccessFile.read();
        if ((n6 | (n5 = randomAccessFile.read()) | (n4 = randomAccessFile.read()) | (n3 = randomAccessFile.read())) >= 0) {
            return (n3 << 24) + (n4 << 16) + (n5 << 8) + n6;
        }
        throw new EOFException();
    }

    private static short e(RandomAccessFile randomAccessFile) {
        int n3;
        int n4 = randomAccessFile.read();
        if ((n4 | (n3 = randomAccessFile.read())) >= 0) {
            return (short)((n3 << 8) + n4);
        }
        throw new EOFException();
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(File object) {
        void var0_2;
        RandomAccessFile randomAccessFile;
        block21: {
            int n3;
            Object object2 = null;
            randomAccessFile = new RandomAccessFile((File)object, "r");
            {
                catch (Throwable throwable) {
                    randomAccessFile = object2;
                    break block21;
                }
            }
            try {
                int n4;
                int n5;
                long l3;
                block20: {
                    l3 = randomAccessFile.length();
                    if (l3 >= 22L) {
                        randomAccessFile.seek(l3 - 12L);
                        n5 = h3.e(randomAccessFile) & 0xFFFF;
                        n4 = h3.d(randomAccessFile);
                        l3 = h3.d(randomAccessFile);
                        if (n5 > 0 && n4 > 0 && l3 > 0L) {
                            randomAccessFile.seek(l3);
                            n3 = 0;
                            break block20;
                        } else {
                            object = new IOException("ZipAlign native-lib check: unreadable central directory");
                            throw object;
                        }
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("ZipAlign native-lib check: too small for a zip: ");
                    ((StringBuilder)object2).append(l3);
                    object = new IOException(((StringBuilder)object2).toString());
                    throw object;
                }
                for (n4 = 0; n4 < n5; ++n4) {
                    if (h3.d(randomAccessFile) == 33639248) {
                        long l4;
                        long l5;
                        block22: {
                            randomAccessFile.skipBytes(6);
                            short s3 = h3.e(randomAccessFile);
                            randomAccessFile.skipBytes(16);
                            short s4 = h3.e(randomAccessFile);
                            short s5 = h3.e(randomAccessFile);
                            short s6 = h3.e(randomAccessFile);
                            randomAccessFile.skipBytes(8);
                            long l6 = (long)h3.d(randomAccessFile) & 0xFFFFFFFFL;
                            object2 = new byte[s4 & 0xFFFF];
                            randomAccessFile.readFully((byte[])object2);
                            object = new String((byte[])object2, "UTF-8");
                            l5 = randomAccessFile.getFilePointer();
                            l3 = s5 & 0xFFFF;
                            l4 = s6 & 0xFFFF;
                            if (h3.b((String)object)) {
                                randomAccessFile.seek(l6 + 26L);
                                s5 = h3.e(randomAccessFile);
                                s4 = h3.e(randomAccessFile);
                                l6 = l6 + 30L + (long)(s5 & 0xFFFF) + (long)(s4 & 0xFFFF);
                                if (s3 == 0) {
                                    if (h3.c(l6)) {
                                        ++n3;
                                        break block22;
                                    } else {
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("ZipAlign native-lib check: ");
                                        ((StringBuilder)object2).append((String)object);
                                        ((StringBuilder)object2).append(" data offset ");
                                        ((StringBuilder)object2).append(l6);
                                        ((StringBuilder)object2).append(" is not page-aligned");
                                        e1.i(((StringBuilder)object2).toString());
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("ZipAlign native-lib check failed: ");
                                        ((StringBuilder)object2).append((String)object);
                                        ((StringBuilder)object2).append(" is not page-aligned");
                                        IOException iOException = new IOException(((StringBuilder)object2).toString());
                                        throw iOException;
                                    }
                                }
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("ZipAlign native-lib check: ");
                                ((StringBuilder)object2).append((String)object);
                                ((StringBuilder)object2).append(" is compressed (method ");
                                ((StringBuilder)object2).append(s3);
                                ((StringBuilder)object2).append(")");
                                e1.i(((StringBuilder)object2).toString());
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("ZipAlign native-lib check failed: ");
                                stringBuilder.append((String)object);
                                stringBuilder.append(" is compressed");
                                object2 = new IOException(stringBuilder.toString());
                                throw object2;
                            }
                        }
                        randomAccessFile.seek(l4 + (l5 + l3));
                        continue;
                    }
                    object = new IOException("ZipAlign native-lib check: bad central-directory signature");
                    throw object;
                }
            }
            catch (Throwable throwable) {
                break block21;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("ZipAlign native-lib check: ");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(" lib entries ok");
            e1.d(((StringBuilder)object).toString());
            try {
                randomAccessFile.close();
                return;
            }
            catch (Throwable throwable) {
                e1.l("ZipAlign close fail", throwable);
            }
            return;
        }
        if (randomAccessFile == null) throw var0_2;
        try {
            randomAccessFile.close();
            throw var0_2;
        }
        catch (Throwable throwable) {
            e1.l("ZipAlign close fail", throwable);
        }
        throw var0_2;
    }
}

