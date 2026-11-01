/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.ext.t2
 */
package android.ext;

import android.ext.n;
import android.ext.t2;
import java.util.Locale;

static abstract class n.g {
    static final short[] a = new short[]{-16560, -1, -17792, -64, -16640, -1, -16624, -1, -16608, -1, -16592, -1, -16576, -1, -16640, -241, -18176, -768, -20224, -768, -16640, -256, -18848, -8, -18832, -8, 17920, -64, -17920, -64, -17856, -64, -17728, -64, -18864, -9, -19968, -64, -19904, -64, -19840, -64, -19776, -64, -16896, -256, 18304, -121, 18112, -1, 16384, -64, 16448, -64, 16512, -64, 16576, -64, 16640, -64, 16704, -64, 16768, -64, 16832, -64, 16896, -64, 16960, -64, 17024, -64, 17088, -64, 17152, -64, 17216, -64, 17280, -64, 17344, -64, -20480, -128, -20352, -128, 18176, -128, 17408, -256, 17664, -256, 17920, -256, -19456, -512, -17408, -512, 6144, -512, 6656, -512, 7168, -512, 7680, -512, 20992, -512, 23040, -512, 22016, -2560, 20480, -1536, 22528, -1536, 0, -64, 0, -2048, 2048, -2048, 4096, -2048, 8192, -2048, 10240, -2048, 12288, -2048, 14336, -2048, 18432, -2048, 24576, -2048, 26624, -2048, 28672, -2048, 30720, -2048, Short.MIN_VALUE, -2048, -30720, -2048, -28672, -2048, -26624, -2048, -24576, -2048, -22528, -2048, -16384, -2048, -14336, -2048, -8448, -256, -8704, -256, -8448, -256, -12288, -4096, -8192, -2048, 0, 0};
    static final String[] b = new String[]{"SEVL%c", "HLT\t %0-5x", "NOP%c", "YIELD%c", "WFE%c", "WFI%c", "SEV%c", "NOP%c\t {%4-7d}", "CBNZ\t %0-2r, %b%X", "CBZ\t %0-2r, %b%X", "IT%I%X", "CPSIE%2'A%1'I%0'F%X", "CPSID%2'A%1'I%0'F%X", "MOV%c\t %0-2r, %3-5r", "REV%c\t %0-2r, %3-5r", "REV16%c\t %0-2r, %3-5r", "REVSH%c\t %0-2r, %3-5r", "SETEND%3?BLE%X", "SXTH%c\t %0-2r, %3-5r", "SXTB%c\t %0-2r, %3-5r", "UXTH%c\t %0-2r, %3-5r", "UXTB%c\t %0-2r, %3-5r", "BKPT\t %0-7x", "BLX%c\t %3-6r%x", "NOP%c\t \t \t ; (MOV R8, R8)", "AND%C\t %0-2r, %3-5r", "EOR%C\t %0-2r, %3-5r", "LSL%C\t %0-2r, %3-5r", "LSR%C\t %0-2r, %3-5r", "ASR%C\t %0-2r, %3-5r", "ADC%C\t %0-2r, %3-5r", "SBC%C\t %0-2r, %3-5r", "ROR%C\t %0-2r, %3-5r", "TST%c\t %0-2r, %3-5r", "NEG%C\t %0-2r, %3-5r", "CMP%c\t %0-2r, %3-5r", "CMN%c\t %0-2r, %3-5r", "ORR%C\t %0-2r, %3-5r", "MUL%C\t %0-2r, %3-5r", "BIC%C\t %0-2r, %3-5r", "MVN%C\t %0-2r, %3-5r", "ADD%c\t SP, #%0-6W", "SUB%c\t SP, #%0-6W", "BX%c\t %S%x", "ADD%c\t %D, %S", "CMP%c\t %D, %S", "MOV%c\t %D, %S", "PUSH%c\t %N", "POP%c\t %O", "ADD%C\t %0-2r, %3-5r, %6-8r", "SUB%C\t %0-2r, %3-5r, %6-8r", "ADD%C\t %0-2r, %3-5r, #%6-8d", "SUB%C\t %0-2r, %3-5r, #%6-8d", "STRH%c\t %0-2r, [%3-5r,%6-8r]", "LDRH%c\t %0-2r, [%3-5r,%6-8r]", "LDRS%11?HB%c\t %0-2r, [%3-5r,%6-8r]", "STR%10'B%c\t %0-2r, [%3-5r,%6-8r]", "LDR%10'B%c\t %0-2r, [%3-5r,%6-8r]", "MOV%C\t %0-2r, %3-5r", "LSL%C\t %0-2r, %3-5r, #%6-10d", "LSR%C\t %0-2r, %3-5r, %s", "ASR%C\t %0-2r, %3-5r, %s", "MOV%C\t %8-10r, #%0-7d", "CMP%c\t %8-10r, #%0-7d", "ADD%C\t %8-10r, #%0-7d", "SUB%C\t %8-10r, #%0-7d", "LDR%c\t %8-10r, [PC,#%0-7W]\t ; (%0-7a)", "STR%c\t %0-2r, [%3-5r,#%6-10W]", "LDR%c\t %0-2r, [%3-5r,#%6-10W]", "STRB%c\t %0-2r, [%3-5r,#%6-10d]", "LDRB%c\t %0-2r, [%3-5r,#%6-10d]", "STRH%c\t %0-2r, [%3-5r,#%6-10H]", "LDRH%c\t %0-2r, [%3-5r,#%6-10H]", "STR%c\t %8-10r, [SP,#%0-7W]", "LDR%c\t %8-10r, [SP,#%0-7W]", "ADD%c\t %8-10r, PC, #%0-7W\t ; (ADR %8-10r, %0-7a)", "ADD%c\t %8-10r, SP, #%0-7W", "STMIA%c\t %8-10r!, %M", "LDMIA%c\t %8-10r%W, %M", "SVC%c\t %0-7d", "UDF%c\t #%0-7d", "\t \t ; <UNDEFINED> instruction: %0-31x", "B%8-11c.N\t %0-7B%X", "B%c.N\t %0-10B%x", "\t \t ; <UNDEFINED> instruction: %0-31x"};

    /*
     * Exception decompiling
     */
    static int a(n var0, long var1_2, String var3_3, int var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 269->278)] android.ext.n$f
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static String b(long var0, int var2_1) {
        var5_2 = var2_1;
        var6_3 = n.g.b.length;
        for (var8_4 = 0; var8_4 < var6_3; ++var8_4) {
            var14_6 /* !! */  = n.g.a;
            var7_5 = var8_4 * 2;
            if ((var14_6 /* !! */ [var7_5 + 1] & var5_2) != var14_6 /* !! */ [var7_5]) {
                continue;
            }
            var16_7 = new StringBuilder();
            var15_9 = n.g.b[var8_4];
            var13_11 = var15_9.length();
            var5_2 = 0;
            var6_3 = 0;
            while (true) {
                block38: {
                    block39: {
                        block41: {
                            block42: {
                                block43: {
                                    block40: {
                                        block44: {
                                            block45: {
                                                block46: {
                                                    var7_5 = 32;
                                                    if (var5_2 >= var13_11) break;
                                                    var4_13 = n.g(var15_9, var13_11, var5_2);
                                                    var3_12 = '%';
                                                    if (var4_13 != '%') {
                                                        n.d(var16_7, var4_13);
                                                        var7_5 = var6_3;
lbl21:
                                                        // 8 sources

                                                        while (true) {
                                                            var6_3 = var7_5;
                                                            break block38;
                                                            break;
                                                        }
                                                    }
                                                    var12_17 = var5_2 + 1;
                                                    var4_13 = n.g(var15_9, var13_11, var12_17);
                                                    if (var4_13 == '%') break block40;
                                                    if (var4_13 == 'I') break block41;
                                                    var3_12 = 'S';
                                                    if (var4_13 == 'S') break block42;
                                                    if (var4_13 == 's') break block43;
                                                    if (var4_13 == 'x') break block39;
                                                    if (var4_13 == 'C') break block40;
                                                    if (var4_13 == 'D') break block44;
                                                    if (var4_13 == 'W') break block45;
                                                    if (var4_13 == 'X') break block39;
                                                    if (var4_13 == 'b') break block46;
                                                    if (var4_13 == 'c') break block39;
                                                    switch (var4_13) {
                                                        default: {
                                                            switch (var4_13) {
                                                                default: {
                                                                    var14_6 /* !! */  = (short[])new StringBuilder();
                                                                    var14_6 /* !! */ .append("110 Invalid format char '");
                                                                    var14_6 /* !! */ .append(var4_13);
                                                                    var14_6 /* !! */ .append("'; ");
                                                                    var14_6 /* !! */ .append(var8_4);
                                                                    var14_6 /* !! */ .append("; ");
                                                                    var14_6 /* !! */ .append(var12_17);
                                                                    var14_6 /* !! */ .append("; '");
                                                                    var14_6 /* !! */ .append(var15_9);
                                                                    var14_6 /* !! */ .append("'");
                                                                    throw new RuntimeException(var14_6 /* !! */ .toString());
                                                                }
                                                                case 'N': {
                                                                    if ((var2_1 & 256) == 0) ** GOTO lbl66
                                                                    var5_2 = 1;
                                                                    ** GOTO lbl68
                                                                }
lbl66:
                                                                // 2 sources

                                                                case 'O': {
                                                                    var5_2 = 0;
lbl68:
                                                                    // 2 sources

                                                                    var7_5 = var5_2;
                                                                    if (var4_13 != 'O') ** GOTO lbl75
                                                                    var7_5 = var5_2;
                                                                    if ((var2_1 & 256) == 0) ** GOTO lbl75
                                                                    var9_14 = 1;
                                                                    var7_5 = var5_2;
                                                                    ** GOTO lbl81
lbl75:
                                                                    // 3 sources

                                                                    while (true) {
                                                                        var9_14 = 0;
                                                                        ** GOTO lbl81
                                                                        break;
                                                                    }
                                                                }
                                                                case 'M': 
                                                            }
                                                            var7_5 = 0;
                                                            ** continue;
lbl81:
                                                            // 2 sources

                                                            var16_7.append('{');
                                                            var5_2 = 0;
                                                            for (var10_15 = 0; var10_15 < 8; ++var10_15) {
                                                                var11_16 = var5_2;
                                                                if ((var2_1 & 1 << var10_15) != 0) {
                                                                    if (var10_15 >= 2 && var10_15 <= 12 && (1 << var10_15 - 2 & var2_1) != 0 && (var2_1 & 1 << (var11_16 = var10_15 - 1)) != 0) {
                                                                        var16_7.setLength(var16_7.length() - 1 - n.e[var11_16].length());
                                                                        var16_7.append('-');
                                                                    } else if (var5_2 != 0) {
                                                                        var16_7.append(',');
                                                                    }
                                                                    var16_7.append(n.e[var10_15]);
                                                                    var11_16 = 1;
                                                                }
                                                                var5_2 = var11_16;
                                                            }
                                                            var10_15 = var5_2;
                                                            if (var7_5 != 0) {
                                                                if (var5_2 != 0) {
                                                                    var16_7.append(',');
                                                                }
                                                                var16_7.append(n.e[14]);
                                                                var10_15 = 1;
                                                            }
                                                            if (var9_14 != 0) {
                                                                if (var10_15 != 0) {
                                                                    var16_7.append(',');
                                                                }
                                                                var16_7.append(n.e[15]);
                                                            }
                                                            var3_12 = '}';
lbl115:
                                                            // 2 sources

                                                            while (true) {
                                                                var16_7.append(var3_12);
                                                                break block39;
                                                                break;
                                                            }
                                                        }
                                                        case '0': 
                                                        case '1': 
                                                        case '2': 
                                                        case '3': 
                                                        case '4': 
                                                        case '5': 
                                                        case '6': 
                                                        case '7': 
                                                        case '8': 
                                                        case '9': {
                                                            var9_14 = var4_13 - 48;
                                                            var5_2 += 2;
                                                            while ((var3_12 = n.g(var15_9, var13_11, var5_2)) >= '0' && var3_12 <= '9') {
                                                                var9_14 = var9_14 * 10 + var3_12 - 48;
                                                                ++var5_2;
                                                            }
                                                            if (var3_12 == 39) ** GOTO lbl239
                                                            if (var3_12 == 45) ** GOTO lbl161
                                                            if (var3_12 != 63) ** GOTO lbl141
                                                            var3_12 = n.g(var15_9, var13_11, var5_2 + 1);
                                                            if ((var2_1 & 1 << var9_14) == 0) ** GOTO lbl136
                                                            n.d(var16_7, var3_12);
                                                            n.g(var15_9, var13_11, var5_2 += 2);
                                                            var7_5 = var6_3;
                                                            ** GOTO lbl21
lbl136:
                                                            // 1 sources

                                                            var3_12 = n.g(var15_9, var13_11, var5_2 += 2);
lbl137:
                                                            // 1 sources

                                                            while (true) {
                                                                n.d(var16_7, var3_12);
                                                                var7_5 = var6_3;
                                                                ** GOTO lbl21
                                                                break;
                                                            }
lbl141:
                                                            // 1 sources

                                                            var14_6 /* !! */  = new StringBuilder();
                                                            var14_6 /* !! */ .append("100 Invalid format char '");
                                                            var14_6 /* !! */ .append(var3_12);
                                                            var14_6 /* !! */ .append("'; ");
                                                            var14_6 /* !! */ .append(var8_4);
                                                            var14_6 /* !! */ .append("; ");
                                                            var14_6 /* !! */ .append(var5_2);
                                                            var14_6 /* !! */ .append("; '");
                                                            var14_6 /* !! */ .append(var15_9);
                                                            var14_6 /* !! */ .append("'");
                                                            throw new RuntimeException(var14_6 /* !! */ .toString());
lbl161:
                                                            // 1 sources

                                                            var3_12 = n.g(var15_9, var13_11, ++var5_2);
                                                            var7_5 = 0;
                                                            while (var3_12 >= '0' && var3_12 <= '9') {
                                                                var7_5 = var7_5 * 10 + var3_12 - 48;
                                                                var3_12 = n.g(var15_9, var13_11, ++var5_2);
                                                            }
                                                            if (var7_5 == 0) ** GOTO lbl225
                                                            var9_14 = var2_1 >> var9_14 & (2 << var7_5 - var9_14) - 1;
                                                            if (var3_12 == 66) ** GOTO lbl222
                                                            if (var3_12 == 72 || var3_12 == 87) ** GOTO lbl215
                                                            if (var3_12 == 97) ** GOTO lbl211
                                                            if (var3_12 == 114) ** GOTO lbl209
                                                            if (var3_12 == 120) ** GOTO lbl203
                                                            if (var3_12 == 99) ** GOTO lbl197
                                                            if (var3_12 != 'd') {
                                                                var14_6 /* !! */  = new StringBuilder();
                                                                var14_6 /* !! */ .append("90 Invalid format char '");
                                                                var14_6 /* !! */ .append(var3_12);
                                                                var14_6 /* !! */ .append("'; ");
                                                                var14_6 /* !! */ .append(var8_4);
                                                                var14_6 /* !! */ .append("; ");
                                                                var14_6 /* !! */ .append(var5_2);
                                                                var14_6 /* !! */ .append("; '");
                                                                var14_6 /* !! */ .append(var15_9);
                                                                var14_6 /* !! */ .append("'");
                                                                throw new RuntimeException(var14_6 /* !! */ .toString());
                                                            }
                                                            ** GOTO lbl215
lbl197:
                                                            // 1 sources

                                                            var14_6 /* !! */  = n.d[var9_14];
lbl198:
                                                            // 2 sources

                                                            while (true) {
                                                                var16_7.append((String)var14_6 /* !! */ );
                                                                var7_5 = var6_3;
                                                                ** GOTO lbl21
                                                                break;
                                                            }
lbl203:
                                                            // 1 sources

                                                            var16_7.append("0x");
                                                            t2.c((Appendable)var16_7, (int)4, (int)var9_14);
                                                            var7_5 = var6_3;
                                                            ** GOTO lbl21
lbl209:
                                                            // 1 sources

                                                            var14_6 /* !! */  = n.e[var9_14];
                                                            ** continue;
lbl211:
                                                            // 1 sources

                                                            n.r(var16_7, -4L & var0, (var9_14 << 2) + 4);
lbl212:
                                                            // 2 sources

                                                            while (true) {
                                                                var6_3 = 0;
                                                                break block38;
                                                                break;
                                                            }
lbl215:
                                                            // 2 sources

                                                            var6_3 = var9_14;
                                                            if (var3_12 == 'H') {
                                                                var6_3 = var9_14 << 1;
                                                            }
                                                            var7_5 = var3_12 == 'W' ? var6_3 << 2 : var6_3;
                                                            var16_7.append(var7_5);
                                                            ** GOTO lbl21
lbl222:
                                                            // 1 sources

                                                            var6_3 = 1 << var7_5;
                                                            n.r(var16_7, var0, ((var9_14 ^ var6_3) - var6_3) * 2 + 4);
                                                            ** continue;
lbl225:
                                                            // 1 sources

                                                            var14_6 /* !! */  = new StringBuilder();
                                                            var14_6 /* !! */ .append("180 Zero bitend; ");
                                                            var14_6 /* !! */ .append(var8_4);
                                                            var14_6 /* !! */ .append("; ");
                                                            var14_6 /* !! */ .append(var5_2);
                                                            var14_6 /* !! */ .append("; ");
                                                            var14_6 /* !! */ .append(var15_9);
                                                            throw new RuntimeException(var14_6 /* !! */ .toString());
lbl239:
                                                            // 1 sources

                                                            var10_15 = var5_2 + 1;
                                                            var3_12 = n.g(var15_9, var13_11, var10_15);
                                                            var5_2 = var10_15;
                                                            var7_5 = var6_3;
                                                            if ((var2_1 & 1 << var9_14) == 0) ** GOTO lbl21
                                                            var5_2 = var10_15;
                                                            break;
                                                        }
                                                    }
                                                    ** continue;
                                                }
                                                n.r(var16_7, var0, ((var2_1 & 248) >> 2) + 4 + ((var2_1 & 512) >> 3));
                                                break block39;
                                            }
                                            if ((1 << ((var2_1 & 1792) >> 8) & var2_1) == 0) {
                                                var3_12 = '!';
                                                ** continue;
                                            }
                                            break block39;
                                        }
                                        var5_2 = var7_5 = var2_1 & 7;
                                        if ((var2_1 & 128) != 0) {
                                            var5_2 = var7_5 + 8;
                                        }
                                        var14_6 /* !! */  = (short[])n.e[var5_2];
lbl260:
                                        // 3 sources

                                        while (true) {
                                            var16_7.append((String)var14_6 /* !! */ );
                                            break block39;
                                            break;
                                        }
                                    }
                                    var16_7.append(var3_12);
                                    break block39;
                                }
                                var5_2 = (var2_1 & 1984) >> 6;
                                if (var5_2 == 0) {
                                    var5_2 = var7_5;
                                }
                                var16_7.append('#');
                                var16_7.append(var5_2);
                                break block39;
                            }
                            var5_2 = var7_5 = var2_1 >> 3 & 7;
                            if ((var2_1 & 64) != 0) {
                                var5_2 = var7_5 + 8;
                            }
                            var14_6 /* !! */  = (short[])n.e[var5_2];
                            ** GOTO lbl260
                        }
                        var5_2 = var2_1 << 1;
                        while ((var5_2 & 15) != 0) {
                            var3_12 = ((var2_1 ^ var5_2) & 16) != 0 ? 'E' : 'T';
                            var16_7.append(var3_12);
                            var5_2 <<= 1;
                        }
                        var16_7.append("\t ");
                        var14_6 /* !! */  = (short[])n.d[var2_1 >> 4 & 15];
                        ** continue;
                    }
                    var5_2 = var12_17;
                    var7_5 = var6_3;
                    ** continue;
                }
                ++var5_2;
            }
            if (var6_3 > 32 || var6_3 < -16) {
                var16_7.append("\t ; 0x");
                var16_7.append(Integer.toHexString(var6_3).toUpperCase(Locale.US));
            }
            return var16_7.toString();
        }
        var16_8 = new StringBuilder();
        var16_8.append("190 No Thumb match for ");
        var15_10 = Integer.toHexString(var2_1);
        var14_6 /* !! */  = (short[])Locale.US;
        var16_8.append(var15_10.toUpperCase((Locale)var14_6 /* !! */ ));
        var16_8.append("; ");
        var16_8.append(Integer.toHexString(Integer.reverseBytes(var2_1)).toUpperCase((Locale)var14_6 /* !! */ ));
        throw new RuntimeException(var16_8.toString());
    }
}
