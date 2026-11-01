/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Locale;

static abstract class n.c {
    static final int[] a = n.c.$d2j$hex$97e2ef07$decode_I("0001000e108ff00f0001100e108ff00f0001200e108ff00f0001300e108ff00f0001400e108ff00f0001500e108ff00f0001600e108ff00f0001700e108ff00f0001800e108ff00f0001900e108ff00f0001a00e108ff00f0001b00e108ff00f0001c00e108ff00f0081000e108ff00f0081100e108ff00f0081200e108ff00f0081300e108ff00f0081400e108ff00f0081500e108ff00f0081600e108ff00f0081700e108ff00f0081800e108ff00f0081900e108ff00f0081a00e108ff00f0081b00e108ff00f0081c00e108ff00f0081d00e108ff00f0081e00e108ff00f0081f00e108ff00f1001000e1f0ff00f1001100e980fff0f1001200eff0fff0f1001300eff0fff0f1001400eff0fff0f1001500eff0fff0f10f1900ef0fff80f10f1b00ef0fff80f10f1d00ef0fff80f10f1f00ef0fff80f0001000c000f100e0001100c000f100e0002000c000f100e0002100c000f100e000b2d0d010fbf0f000b200d010fb00f000b300d010fb00f000b800c010f900f000bbd0c010fbf0f000b900c010f900f000b000d000f300f000b100d000f300f000a2d0d000fbf0f000a200d000fb00f000a300d000fb00f000a800c000f900f000abd0c000fbf0f000a900c000f900f000a000d000f300f000a100d000f300f010b200d010fb00f010b300d010fb00f010b800c010f900f010b900c010f900f100b800e700ff00f300b800e700ff00f100ba00e700ff00f300ba00e700ff00f100bc00e700ff00f100be00e700ff00f100b400cd00ff00f100b500cd00ff00f100b000e700fd00f100b100e700f500f300b000e300fd00f300b100e300f500f100b400e100fd00f100b500e100f500f400bb20e500fbf0f400bb30e500fbf0f400ab20e500fbf0f400ab30e500fbf0f100ae00eff0fff0f100ae10eff0fff0f100ae60eff0fff0f100ae70eff0fff0f100ae80eff0fff0f100ae90eff0fff0f100aea0eff0fff0f100af00eff0fff0f10faf10effffff0f100af10eff0fff0f100af60eff0fff0f100af70eff0fff0f100af80eff0fff0f100af90eff0fff0f100afa0eff0fff0f100b000eff0fd00f100b100eff0fd00f100ae00eff0ff00f100af00eff0ff00f100a000e7f0ff00f100a100e7f0ff00f400ab50e700fbf0f400bb50e700fbf0f400ab00ed00fbf0fc00ab00ed00fbf0f400bb00ed00fbf0fc00bb00ed00fbf0f400ab10ed00fbf0fc00ab10ed00fbf0f400bb10ed00fbf0fc00bb10ed00fbf0fc00ab70ed00fbf0fc00bb70ed00fbf0f400ab80e500fbf0f400bb80e500fbf0f400ab40e500fbf0f400bb40e500fbf0f400aba0e500fbe0f400bba0e500fbe0f400abc0e500fbe0f400bbc0e500fbe0f400abe0e500fbe0f400bbe0e500fbe0f100b500cf00fb00f000ab00ef00fb00f000bb00ef00fb00f100a400cd00ff00f100b400cd00ff00f100a500cd00ff00f000a000e500fb00f400a000e500fb00f000b000e500fb00f400b000e500fb00f000a100e500fb00f400a100e500fb00f000b100e500fb00f400b100e500fb00f000a200e500fb00f400a200e500fb00f000b200e500fb00f400b200e500fb00f000a300e500fb00f400a300e500fb00f000b300e500fb00f400b300e500fb00f000a800e500fb00f000b800e500fb00f000aa00e500fb00f000ba00e500fb00f400aa00e500fb00f400ba00e500fb00f400a900e500fb00f400b900e500fb00f000a900e500fb00f000b900e500fb00f000a00fe000f80ff000b00fe000f80ff000a80fe400fb0ff000b80fe400fb0ff400a80fe400fb0ff400b80fe400fb0ff400abcfe500fbcff400bbcfe500fbcff400ab60e500fbe0f400bb60e500fbe0f400ab8fe500fbcff400bb8fe500fbcff0000400c0000f00f0000500c0000f00f0000000e1000000f10f0100e10f0100f1000100e1000100f1000000e1000100f0000000c0000100e0000100c0000100e000050fc0000f0ff000040fc0000f0ff000010fc000010fe000000fc000010fe000000fe100000ff100000fe100010ff100010fe100010ff");
    static final String[] b = new String[]{"ADF%c%P%R\t %12-14f, %16-18f, %0-3f", "MUF%c%P%R\t %12-14f, %16-18f, %0-3f", "SUF%c%P%R\t %12-14f, %16-18f, %0-3f", "RSF%c%P%R\t %12-14f, %16-18f, %0-3f", "DVF%c%P%R\t %12-14f, %16-18f, %0-3f", "RDF%c%P%R\t %12-14f, %16-18f, %0-3f", "POW%c%P%R\t %12-14f, %16-18f, %0-3f", "RPW%c%P%R\t %12-14f, %16-18f, %0-3f", "RMF%c%P%R\t %12-14f, %16-18f, %0-3f", "FML%c%P%R\t %12-14f, %16-18f, %0-3f", "FDV%c%P%R\t %12-14f, %16-18f, %0-3f", "FRD%c%P%R\t %12-14f, %16-18f, %0-3f", "POL%c%P%R\t %12-14f, %16-18f, %0-3f", "MVF%c%P%R\t %12-14f, %0-3f", "MNF%c%P%R\t %12-14f, %0-3f", "ABS%c%P%R\t %12-14f, %0-3f", "RND%c%P%R\t %12-14f, %0-3f", "SQT%c%P%R\t %12-14f, %0-3f", "LOG%c%P%R\t %12-14f, %0-3f", "LGN%c%P%R\t %12-14f, %0-3f", "EXP%c%P%R\t %12-14f, %0-3f", "SIN%c%P%R\t %12-14f, %0-3f", "COS%c%P%R\t %12-14f, %0-3f", "TAN%c%P%R\t %12-14f, %0-3f", "ASN%c%P%R\t %12-14f, %0-3f", "ACS%c%P%R\t %12-14f, %0-3f", "ATN%c%P%R\t %12-14f, %0-3f", "URD%c%P%R\t %12-14f, %0-3f", "NRM%c%P%R\t %12-14f, %0-3f", "FLT%c%P%R\t %16-18f, %12-15r", "FIX%c%R\t %12-15r, %0-2f", "WFS%c\t %12-15r", "RFS%c\t %12-15r", "WFC%c\t %12-15r", "RFC%c\t %12-15r", "CMF%c\t %16-18f, %0-3f", "CNF%c\t %16-18f, %0-3f", "CMFE%c\t %16-18f, %0-3f", "CNFE%c\t %16-18f, %0-3f", "STF%c%Q\t %12-14f, %A", "LDF%c%Q\t %12-14f, %A", "SFM%c\t %12-14f, %F, %A", "LFM%c\t %12-14f, %F, %A", "VPUSH%c\t %B", "VSTMDB%c\t %16-19r!, %B", "VLDMDB%c\t %16-19r!, %B", "VSTMIA%c\t %16-19r%21'!, %B", "VPOP%c\t %B", "VLDMIA%c\t %16-19r%21'!, %B", "VSTR%c\t %12-15,22D, %A", "VLDR%c\t %12-15,22D, %A", "VPUSH%c\t %y3", "VSTMDB%c\t %16-19r!, %y3", "VLDMDB%c\t %16-19r!, %y3", "VSTMIA%c\t %16-19r%21'!, %y3", "VPOP%c\t %y3", "VLDMIA%c\t %16-19r%21'!, %y3", "VSTR%c\t %y1, %A", "VLDR%c\t %y1, %A", "FSTMDBX%c\t %16-19r!, %z3\t ;@ Deprecated", "FLDMDBX%c\t %16-19r!, %z3\t ;@ Deprecated", "FSTMIAX%c\t %16-19r%21'!, %z3\t ;@ Deprecated", "FLDMIAX%c\t %16-19r%21'!, %z3\t ;@ Deprecated", "VDUP%c.32\t %16-19,7D, %12-15r", "VDUP%c.16\t %16-19,7D, %12-15r", "VDUP%c.32\t %16-19,7Q, %12-15r", "VDUP%c.16\t %16-19,7Q, %12-15r", "VDUP%c.8\t %16-19,7D, %12-15r", "VDUP%c.8\t %16-19,7Q, %12-15r", "VMOV%c\t %0-3,5D, %12-15r, %16-19r", "VMOV%c\t %12-15r, %16-19r, %0-3,5D", "VMOV%c.32\t %16-19,7D[%21d], %12-15r", "VMOV%c.32\t %12-15r, %16-19,7D[%21d]", "VMOV%c.16\t %16-19,7D[%6,21d], %12-15r", "VMOV%c.%23?US16\t %12-15r, %16-19,7D[%6,21d]", "VMOV%c.8\t %16-19,7D[%5,6,21d], %12-15r", "VMOV%c.%23?US8\t %12-15r, %16-19,7D[%5,6,21d]", "VCVT%7?TB%c.F64.F16\t %z1, %y0", "VCVT%7?TB%c.F16.F64\t %y1, %z0", "VCVT%7?TB%c.F32.F16\t %y1, %y0", "VCVT%7?TB%c.F16.F32\t %y1, %y0", "VMSR%c\t fpsid, %12-15r", "VMSR%c\t fpscr, %12-15r", "VMSR%c\t mvfr1, %12-15r", "VMSR%c\t mvfR0, %12-15r", "VMSR%c\t fpexc, %12-15r", "VMSR%c\t fpinst, %12-15r\t @ Impl def", "VMSR%c\t fpinst2, %12-15r\t @ Impl def", "VMRS%c\t %12-15r, fpsid", "VMRS%c\t APSR_nzcv, fpscr", "VMRS%c\t %12-15r, fpscr", "VMRS%c\t %12-15r, mvfr1", "VMRS%c\t %12-15r, mvfR0", "VMRS%c\t %12-15r, fpexc", "VMRS%c\t %12-15r, fpinst\t @ Impl def", "VMRS%c\t %12-15r, fpinst2\t @ Impl def", "VMOV%c.32\t %z2[%21d], %12-15r", "VMOV%c.32\t %12-15r, %z2[%21d]", "VMSR%c\t <impl def %16-19x>, %12-15r", "VMRS%c\t %12-15r, <impl def %16-19x>", "VMOV%c\t %y2, %12-15r", "VMOV%c\t %12-15r, %y2", "VCMP%7'E%c.F32\t %y1, #0.0", "VCMP%7'E%c.F64\t %z1, #0.0", "VMOV%c.F32\t %y1, %y0", "VABS%c.F32\t %y1, %y0", "VMOV%c.F64\t %z1, %z0", "VABS%c.F64\t %z1, %z0", "VNEG%c.F32\t %y1, %y0", "VSQRT%c.F32\t %y1, %y0", "VNEG%c.F64\t %z1, %z0", "VSQRT%c.F64\t %z1, %z0", "VCVT%c.F64.F32\t %z1, %y0", "VCVT%c.F32.F64\t %y1, %z0", "VCVT%c.F32.%7?SU32\t %y1, %y0", "VCVT%c.F64.%7?SU32\t %z1, %y0", "VCMP%7'E%c.F32\t %y1, %y0", "VCMP%7'E%c.F64\t %z1, %z0", "VCVT%c.F32.%16?US%7?31%7?26\t %y1, %y1, #%5,0-3k", "VCVT%c.F64.%16?US%7?31%7?26\t %z1, %z1, #%5,0-3k", "VCVT%7`R%c.%16?SU32.F32\t %y1, %y0", "VCVT%7`R%c.%16?SU32.F64\t %y1, %z0", "VCVT%c.%16?US%7?31%7?26.F32\t %y1, %y1, #%5,0-3k", "VCVT%c.%16?US%7?31%7?26.F64\t %z1, %z1, #%5,0-3k", "VMOV%c\t %12-15r, %16-19r, %z0", "VMOV%c.F32\t %y1, #%0-3,16-19d", "VMOV%c.F64\t %z1, #%0-3,16-19d", "VMOV%c\t %y4, %12-15r, %16-19r", "VMOV%c\t %z0, %12-15r, %16-19r", "VMOV%c\t %12-15r, %16-19r, %y4", "VMLA%c.F32\t %y1, %y2, %y0", "VMLS%c.F32\t %y1, %y2, %y0", "VMLA%c.F64\t %z1, %z2, %z0", "VMLS%c.F64\t %z1, %z2, %z0", "VNMLS%c.F32\t %y1, %y2, %y0", "VNMLA%c.F32\t %y1, %y2, %y0", "VNMLS%c.F64\t %z1, %z2, %z0", "VNMLA%c.F64\t %z1, %z2, %z0", "VMUL%c.F32\t %y1, %y2, %y0", "VNMUL%c.F32\t %y1, %y2, %y0", "VMUL%c.F64\t %z1, %z2, %z0", "VNMUL%c.F64\t %z1, %z2, %z0", "VADD%c.F32\t %y1, %y2, %y0", "VSUB%c.F32\t %y1, %y2, %y0", "VADD%c.F64\t %z1, %z2, %z0", "VSUB%c.F64\t %z1, %z2, %z0", "VDIV%c.F32\t %y1, %y2, %y0", "VDIV%c.F64\t %z1, %z2, %z0", "VFMA%c.F32\t %y1, %y2, %y0", "VFMA%c.F64\t %z1, %z2, %z0", "VFMS%c.F32\t %y1, %y2, %y0", "VFMS%c.F64\t %z1, %z2, %z0", "VFNMA%c.F32\t %y1, %y2, %y0", "VFNMA%c.F64\t %z1, %z2, %z0", "VFNMS%c.F32\t %y1, %y2, %y0", "VFNMS%c.F64\t %z1, %z2, %z0", "VSEL%20-21c%u.F32\t %y1, %y2, %y0", "VSEL%20-21c%u.F64\t %z1, %z2, %z0", "VMAXNM%u.F32\t %y1, %y2, %y0", "VMAXNM%u.F64\t %z1, %z2, %z0", "VMINNM%u.F32\t %y1, %y2, %y0", "VMINNM%u.F64\t %z1, %z2, %z0", "VCVT%16-17?MPNA%u.%7?SU32.F32\t %y1, %y0", "VCVT%16-17?MPNA%u.%7?SU32.F64\t %y1, %z0", "VRINT%7,16??XZR%c.F32\t %y1, %y0", "VRINT%7,16??XZR%c.F64\t %z1, %z0", "VRINT%16-17?MPNA%u.F32\t %y1, %y0", "VRINT%16-17?MPNA%u.F64\t %z1, %z0", "MCRR%c\t %8-11d, %4-7d, %12-15R, %16-19r, CR%0-3d", "MRRC%c\t %8-11d, %4-7d, %12-15Ru, %16-19Ru, CR%0-3d", "CDP%c\t %8-11d, %20-23d, CR%12-15d, CR%16-19d, CR%0-3d, {%5-7d}", "MRC%c\t %8-11d, %21-23d, APSR_nzcv, CR%16-19d, CR%0-3d, {%5-7d}", "MRC%c\t %8-11d, %21-23d, %12-15r, CR%16-19d, CR%0-3d, {%5-7d}", "MCR%c\t %8-11d, %21-23d, %12-15R, CR%16-19d, CR%0-3d, {%5-7d}", "STC%22'L%c\t %8-11d, CR%12-15d, %A", "LDC%22'L%c\t %8-11d, CR%12-15d, %A", "MRRC2%c\t %8-11d, %4-7d, %12-15Ru, %16-19Ru, CR%0-3d", "MCRR2%c\t %8-11d, %4-7d, %12-15R, %16-19R, CR%0-3d", "LDC2%22'L%c\t %8-11d, CR%12-15d, %A", "STC2%22'L%c\t %8-11d, CR%12-15d, %A", "CDP2%c\t %8-11d, %20-23d, CR%12-15d, CR%16-19d, CR%0-3d, {%5-7d}", "MCR2%c\t %8-11d, %21-23d, %12-15R, CR%16-19d, CR%0-3d, {%5-7d}", "MRC2%c\t %8-11d, %21-23d, %12-15r, CR%16-19d, CR%0-3d, {%5-7d}"};

    /*
     * Exception decompiling
     */
    static int a(n var0, long var1_1, String var3_2, boolean var4_5, int var5_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 283->292)] android.ext.n$f
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
    static String b(n var0, long var1_1, int var3_2, boolean var4_3) {
        var22_4 = var1_1;
        var9_5 = (0x200000 & var3_2) != 0 ? 1 : 0;
        var11_6 = (0x800000 & var3_2) == 0 ? 1 : 0;
        var14_7 = (0x1000000 & var3_2) != 0;
        var17_8 = n.c.b.length;
        for (var15_9 = 0; var15_9 < var17_8; ++var15_9) {
            block80: {
                block84: {
                    var24_16 /* !! */  = n.c.a;
                    var8_11 = var15_9 * 2;
                    var7_10 = var24_16 /* !! */ [var8_11 + 1];
                    var10_12 = var24_16 /* !! */ [var8_11];
                    if (var4_3) {
                        var7_10 |= -268435456;
                        var8_11 = var10_12 | -536870912;
lbl14:
                        // 3 sources

                        while (true) {
                            var13_14 = 16;
                            var12_13 = var7_10;
                            break block80;
                            break;
                        }
                    }
                    if ((var3_2 & -268435456) != -268435456) break block84;
                    var7_10 |= -268435456;
                    var8_11 = var10_12;
                    ** GOTO lbl14
                }
                var16_15 = var3_2 >> 28 & 15;
                var8_11 = var10_12;
                var13_14 = var16_15;
                var12_13 = var7_10;
                if (var16_15 == 14) {
                    var8_11 = var10_12;
                    ** continue;
                }
            }
            if ((var12_13 & var3_2) != var8_11) {
                continue;
            }
            var26_17 = new StringBuilder();
            var25_18 = n.c.b[var15_9];
            var20_19 = var25_18.length();
            var17_8 = 0;
            var10_12 = 16;
            var12_13 = 0;
            var8_11 = 0;
            var7_10 = var13_14;
            var16_15 = var11_6;
            var11_6 = var17_8;
            var17_8 = var9_5;
            while (var12_13 < var20_19) {
                block82: {
                    block86: {
                        block95: {
                            block96: {
                                block97: {
                                    block87: {
                                        block81: {
                                            block88: {
                                                block89: {
                                                    block83: {
                                                        block90: {
                                                            block94: {
                                                                block91: {
                                                                    block93: {
                                                                        block92: {
                                                                            block85: {
                                                                                var5_20 = n.g(var25_18, var20_19, var12_13);
                                                                                if (var5_20 == '%') break block85;
                                                                                n.d(var26_17, var5_20);
                                                                                var9_5 = var12_13;
                                                                                break block82;
                                                                            }
                                                                            var13_14 = var12_13 + 1;
                                                                            var5_20 = n.g(var25_18, var20_19, var13_14);
                                                                            if (var5_20 == '%') break block86;
                                                                            if (var5_20 == 'F') break block87;
                                                                            if (var5_20 == 'c') break block88;
                                                                            if (var5_20 == 'u') break block89;
                                                                            var18_22 = 4;
                                                                            if (var5_20 == 65) break block90;
                                                                            if (var5_20 == 66) break block91;
                                                                            if (var5_20 == 121 || var5_20 == 122) break block92;
                                                                            block0 : switch (var5_20) {
                                                                                default: {
                                                                                    switch (var5_20) {
                                                                                        default: {
                                                                                            var0 = new StringBuilder();
                                                                                            var0.append("30 Invalid format char '");
                                                                                            var0.append(var5_20);
                                                                                            var0.append("'; ");
                                                                                            var0.append(var15_9);
                                                                                            var0.append("; ");
                                                                                            var0.append(var13_14);
                                                                                            var0.append("; '");
                                                                                            var0.append(var25_18);
                                                                                            var0.append("'");
                                                                                            throw new RuntimeException(var0.toString());
                                                                                        }
                                                                                        case 'R': {
                                                                                            var9_5 = var3_2 & 96;
                                                                                            if (var9_5 == 0) ** GOTO lbl95
                                                                                            if (var9_5 == 32) ** GOTO lbl100
                                                                                            if (var9_5 != 64) {
                                                                                                var5_20 = 'Z';
lbl91:
                                                                                                // 6 sources

                                                                                                while (true) {
                                                                                                    var26_17.append(var5_20);
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            ** GOTO lbl98
lbl95:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var22_4 = var1_1;
                                                                                                break block81;
                                                                                                break;
                                                                                            }
lbl98:
                                                                                            // 1 sources

                                                                                            var5_20 = 'M';
                                                                                            ** GOTO lbl91
lbl100:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var5_20 = 'P';
                                                                                                ** GOTO lbl91
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        case 'Q': {
                                                                                            var9_5 = 0x408000 & var3_2;
                                                                                            if (var9_5 == 0) ** GOTO lbl114
                                                                                            if (var9_5 == 32768) ** GOTO lbl111
                                                                                            if (var9_5 != 0x400000) ** continue;
                                                                                            while (true) {
                                                                                                var5_20 = 'E';
                                                                                                ** GOTO lbl91
                                                                                                break;
                                                                                            }
lbl111:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var5_20 = 'D';
                                                                                                ** GOTO lbl91
                                                                                                break;
                                                                                            }
lbl114:
                                                                                            // 1 sources

                                                                                            var5_20 = 'S';
                                                                                            ** continue;
                                                                                        }
                                                                                        case 'P': {
                                                                                            var9_5 = 524416 & var3_2;
                                                                                            if (var9_5 != 0) {
                                                                                                if (var9_5 == 128) ** continue;
                                                                                                if (var9_5 == 524288) ** continue;
                                                                                                var26_17.append("<illegal precision>");
                                                                                                break;
                                                                                            }
                                                                                            var26_17.append('S');
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    ** continue;
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
                                                                                    var9_5 = n.j(var25_18, var20_19, var13_14, var3_2, (n)var0);
                                                                                    var18_22 = n.a((n)var0);
                                                                                    var21_24 = n.c((n)var0);
                                                                                    var5_20 = n.g(var25_18, var20_19, var9_5);
                                                                                    if (var5_20 == 39) ** GOTO lbl276
                                                                                    if (var5_20 == 63) ** GOTO lbl270
                                                                                    if (var5_20 == 68) ** GOTO lbl268
                                                                                    if (var5_20 == 96) ** GOTO lbl257
                                                                                    if (var5_20 == 102) ** GOTO lbl242
                                                                                    if (var5_20 == 107) ** GOTO lbl239
                                                                                    var12_13 = var8_11;
                                                                                    if (var5_20 == 114) ** GOTO lbl217
                                                                                    if (var5_20 == 120) ** GOTO lbl212
                                                                                    if (var5_20 == 81) ** GOTO lbl195
                                                                                    if (var5_20 == 82) ** GOTO lbl191
                                                                                    if (var5_20 != 'c') {
                                                                                        if (var5_20 == 'd') {
                                                                                            var26_17.append(var18_22);
                                                                                            var11_6 = var18_22;
lbl149:
                                                                                            // 3 sources

                                                                                            while (true) {
                                                                                                var22_4 = var1_1;
                                                                                                break block82;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var0 = new StringBuilder();
                                                                                        var0.append("10 Invalid format char '");
                                                                                        var0.append(var5_20);
                                                                                        var0.append("'; ");
                                                                                        var0.append(var15_9);
                                                                                        var0.append("; ");
                                                                                        var0.append(var9_5);
                                                                                        var0.append("; '");
                                                                                        var0.append(var25_18);
                                                                                        var0.append("'");
                                                                                        throw new RuntimeException(var0.toString());
                                                                                    }
                                                                                    if (var18_22 != 0) {
                                                                                        if (var18_22 != 1) {
                                                                                            if (var18_22 != 2) {
                                                                                                if (var18_22 != 3) {
                                                                                                    var24_16 /* !! */  = (int[])"??";
                                                                                                    var12_13 = var8_11;
                                                                                                } else {
                                                                                                    var24_16 /* !! */  = (int[])"GT";
                                                                                                    var12_13 = var8_11;
                                                                                                }
                                                                                            } else {
                                                                                                var24_16 /* !! */  = (int[])"GE";
                                                                                                var12_13 = var8_11;
                                                                                            }
                                                                                        } else {
                                                                                            var24_16 /* !! */  = (int[])"VS";
                                                                                            var12_13 = var8_11;
                                                                                        }
                                                                                    } else {
                                                                                        var24_16 /* !! */  = (int[])"EQ";
                                                                                        var12_13 = var8_11;
                                                                                    }
                                                                                    ** GOTO lbl231
lbl191:
                                                                                    // 1 sources

                                                                                    var12_13 = var8_11;
                                                                                    if (var18_22 != 15) ** GOTO lbl217
                                                                                    var12_13 = 1;
                                                                                    ** GOTO lbl217
lbl195:
                                                                                    // 1 sources

                                                                                    if ((var18_22 & 1) != 0) {
                                                                                        var26_17.append("<illegal reg Q");
                                                                                        var26_17.append(var18_22 >> 1);
                                                                                        var24_16 /* !! */  = (int[])".5>";
                                                                                        var12_13 = var8_11;
                                                                                    } else {
                                                                                        var26_17.append('Q');
                                                                                        var12_13 = var18_22 >> 1;
lbl206:
                                                                                        // 3 sources

                                                                                        while (true) {
                                                                                            var26_17.append(var12_13);
                                                                                            var13_14 = var10_12;
                                                                                            var12_13 = var8_11;
                                                                                            break block0;
                                                                                            break;
                                                                                        }
lbl212:
                                                                                        // 1 sources

                                                                                        var26_17.append("0x");
                                                                                        var24_16 /* !! */  = (int[])Integer.toHexString(var18_22).toUpperCase(Locale.US);
                                                                                        var12_13 = var8_11;
                                                                                    }
                                                                                    ** GOTO lbl231
lbl217:
                                                                                    // 3 sources

                                                                                    var19_23 = var9_5 + 1;
                                                                                    var8_11 = var10_12;
                                                                                    var13_14 = var12_13;
                                                                                    if (n.g(var25_18, var20_19, var19_23) == 'u') {
                                                                                        n.g(var25_18, var20_19, var19_23);
                                                                                        if (var10_12 == var18_22) {
                                                                                            var12_13 = 1;
                                                                                        }
                                                                                        var9_5 = var19_23;
                                                                                        var8_11 = var18_22;
                                                                                        var13_14 = var12_13;
                                                                                    }
                                                                                    var24_16 /* !! */  = (int[])n.e[var18_22];
                                                                                    var12_13 = var13_14;
                                                                                    var10_12 = var8_11;
lbl231:
                                                                                    // 9 sources

                                                                                    while (true) {
                                                                                        var26_17.append((String)var24_16 /* !! */ );
                                                                                        var13_14 = var10_12;
                                                                                        break;
                                                                                    }
lbl235:
                                                                                    // 5 sources

                                                                                    while (true) {
                                                                                        var10_12 = var13_14;
                                                                                        var8_11 = var12_13;
                                                                                        ** GOTO lbl149
                                                                                        break;
                                                                                    }
lbl239:
                                                                                    // 1 sources

                                                                                    var12_13 = (var3_2 & 128) == 0 ? 32 : 16;
                                                                                    var12_13 -= var18_22;
                                                                                    ** GOTO lbl206
lbl242:
                                                                                    // 1 sources

                                                                                    if (var18_22 > 7) {
                                                                                        var26_17.append('#');
                                                                                        var24_16 /* !! */  = (int[])n.f[var18_22 & 7];
                                                                                        var12_13 = var8_11;
                                                                                        ** continue;
                                                                                    }
                                                                                    var5_20 = 'F';
lbl249:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var26_17.append(var5_20);
                                                                                        var26_17.append(var18_22);
                                                                                        var13_14 = var10_12;
                                                                                        var12_13 = var8_11;
                                                                                        break block0;
                                                                                        break;
                                                                                    }
lbl257:
                                                                                    // 1 sources

                                                                                    var19_23 = var9_5 + 1;
                                                                                    var5_20 = n.g(var25_18, var20_19, var19_23);
                                                                                    var13_14 = var10_12;
                                                                                    var9_5 = var19_23;
                                                                                    var12_13 = var8_11;
                                                                                    if (var18_22 != 0) ** GOTO lbl235
                                                                                    n.d(var26_17, var5_20);
                                                                                    var13_14 = var10_12;
                                                                                    var9_5 = var19_23;
                                                                                    var12_13 = var8_11;
                                                                                    break;
lbl268:
                                                                                    // 1 sources

                                                                                    var5_20 = 'D';
                                                                                    ** continue;
lbl270:
                                                                                    // 1 sources

                                                                                    n.d(var26_17, n.g(var25_18, var20_19, (var9_5 += 1 << var21_24) - var18_22));
                                                                                    n.g(var25_18, var20_19, var9_5);
                                                                                    var13_14 = var10_12;
                                                                                    var12_13 = var8_11;
                                                                                    break;
lbl276:
                                                                                    // 1 sources

                                                                                    var19_23 = var9_5 + 1;
                                                                                    var5_20 = n.g(var25_18, var20_19, var19_23);
                                                                                    var13_14 = var10_12;
                                                                                    var9_5 = var19_23;
                                                                                    var12_13 = var8_11;
                                                                                    if (var18_22 != (1 << var21_24) - 1) ** GOTO lbl235
                                                                                    n.d(var26_17, var5_20);
                                                                                    var13_14 = var10_12;
                                                                                    var9_5 = var19_23;
                                                                                    var12_13 = var8_11;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            ** GOTO lbl235
                                                                        }
                                                                        var19_23 = var5_20 == 'y' ? 1 : 0;
                                                                        var18_22 = var12_13 + 2;
                                                                        var6_21 = n.g(var25_18, var20_19, var18_22);
                                                                        block8 : switch (var6_21) {
                                                                            default: {
                                                                                var0 = new StringBuilder();
                                                                                var0.append("20 Invalid format char '");
                                                                                var0.append(var6_21);
                                                                                var0.append("'; ");
                                                                                var0.append(var15_9);
                                                                                var0.append("; ");
                                                                                var0.append(var18_22);
                                                                                var0.append("; '");
                                                                                var0.append(var25_18);
                                                                                var0.append("'");
                                                                                throw new RuntimeException(var0.toString());
                                                                            }
                                                                            case '2': {
                                                                                var9_5 = var3_2 >> 16 & 15;
                                                                                if (var19_23 != 0) {
                                                                                    var9_5 <<= 1;
                                                                                    var12_13 = var3_2 >> 7;
lbl319:
                                                                                    // 3 sources

                                                                                    while (true) {
                                                                                        var12_13 &= 1;
lbl321:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            var21_24 = var9_5 + var12_13;
                                                                                            break block8;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var12_13 = var3_2 >> 7;
lbl325:
                                                                                // 3 sources

                                                                                while (true) {
                                                                                    var12_13 = (var12_13 & 1) << 4;
                                                                                    ** continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            case '1': 
                                                                            case '3': {
                                                                                if (var6_21 == '3') {
                                                                                    var26_17.append('{');
                                                                                }
                                                                                var9_5 = var3_2 >> 12 & 15;
                                                                                if (var19_23 == 0) ** GOTO lbl337
                                                                                var9_5 <<= 1;
                                                                                var12_13 = var3_2 >> 22;
                                                                                ** GOTO lbl319
lbl337:
                                                                                // 1 sources

                                                                                var12_13 = var3_2 >> 22;
                                                                                ** GOTO lbl325
                                                                            }
                                                                            case '0': 
                                                                            case '4': {
                                                                                var9_5 = var3_2 & 15;
                                                                                if (var19_23 != 0) {
                                                                                    var9_5 <<= 1;
                                                                                    var12_13 = var3_2 >> 5;
                                                                                    ** continue;
                                                                                }
                                                                                var12_13 = var3_2 >> 5;
                                                                                ** continue;
                                                                            }
                                                                        }
                                                                        var5_20 = var19_23 != 0 ? 'S' : 'D';
                                                                        var26_17.append(var5_20);
                                                                        var26_17.append(var21_24);
                                                                        if (var6_21 != '3') break block93;
                                                                        var9_5 = var12_13 = var3_2 & 255;
                                                                        if (var19_23 == 0) {
                                                                            var9_5 = var12_13 >> 1;
                                                                        }
                                                                        if (--var9_5 != 0) {
                                                                            var26_17.append('-');
                                                                            var5_20 = var19_23 != 0 ? 'S' : 'D';
                                                                            var26_17.append(var5_20);
                                                                            var26_17.append(var21_24 + var9_5);
                                                                        }
                                                                        var26_17.append('}');
                                                                        var13_14 = var10_12;
                                                                        var9_5 = var18_22;
                                                                        var12_13 = var8_11;
                                                                        ** GOTO lbl235
                                                                    }
                                                                    var13_14 = var10_12;
                                                                    var9_5 = var18_22;
                                                                    var12_13 = var8_11;
                                                                    if (var6_21 == '4') ** break;
                                                                    ** continue;
                                                                    var26_17.append(", ");
                                                                    var5_20 = var19_23 != 0 ? 'S' : 'D';
                                                                    var26_17.append(var5_20);
                                                                    var12_13 = var21_24 + 1;
                                                                    var9_5 = var18_22;
                                                                    ** continue;
                                                                }
                                                                var9_5 = var3_2 >> 12 & 15 | var3_2 >> 18 & 16;
                                                                var12_13 = var3_2 >> 1 & 63;
                                                                if (var12_13 == 0) {
                                                                    var26_17.append('D');
                                                                    var26_17.append(var9_5);
lbl392:
                                                                    // 3 sources

                                                                    while (true) {
                                                                        var22_4 = var1_1;
                                                                        break block81;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var12_13 != 1) break block94;
                                                                var26_17.append("{D");
                                                                var26_17.append(var9_5);
lbl400:
                                                                // 2 sources

                                                                while (true) {
                                                                    var26_17.append('}');
                                                                    ** GOTO lbl392
                                                                    break;
                                                                }
                                                            }
                                                            var26_17.append("{D");
                                                            var26_17.append(var9_5);
                                                            if ((var12_13 += var9_5) > 32) {
                                                                var26_17.append("-<overflow reg D");
                                                                var26_17.append(var12_13 - 1);
                                                                var26_17.append(">}");
                                                                ** continue;
                                                            }
                                                            var26_17.append("-D");
                                                            var26_17.append(var12_13 - 1);
                                                            ** continue;
                                                        }
                                                        var19_23 = var3_2 >> 16 & 15;
                                                        var9_5 = var3_2 & 255;
                                                        var26_17.append('[');
                                                        var26_17.append(n.e[var19_23]);
                                                        if (var14_7) ** GOTO lbl-1000
                                                        var12_13 = var9_5;
                                                        if (var17_8 == 0) {
                                                            while (true) {
                                                                var9_5 = var12_13;
                                                                var12_13 = var11_6;
                                                                break;
                                                            }
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var9_5 = var12_13 = var9_5 * 4;
                                                            if (var16_15 != 0) {
                                                                var9_5 = -var12_13;
                                                            }
                                                            var12_13 = var9_5;
                                                            if (var19_23 == 15) ** continue;
                                                            var12_13 = var9_5;
                                                        }
                                                        var5_20 = ']';
                                                        if (!var14_7) ** GOTO lbl467
                                                        if (var9_5 != 0) {
                                                            var26_17.append(",#");
                                                            var26_17.append(var9_5);
                                                            var26_17.append(']');
                                                            var11_6 = var12_13;
                                                            if (var17_8 != 0) {
                                                                var5_20 = '!';
                                                                while (true) {
                                                                    var26_17.append(var5_20);
                                                                    var11_6 = var12_13;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            if (var16_15 == 0) ** continue;
                                                            var24_16 /* !! */  = (int[])",#-0]";
lbl462:
                                                            // 2 sources

                                                            while (true) {
                                                                var26_17.append((String)var24_16 /* !! */ );
                                                                var11_6 = var12_13;
                                                                break block83;
                                                                break;
                                                            }
lbl467:
                                                            // 1 sources

                                                            var26_17.append(']');
                                                            if (var17_8 != 0) {
                                                                if (var9_5 != 0) {
                                                                    var26_17.append(", #");
                                                                    var26_17.append(var9_5);
                                                                    var11_6 = var12_13;
                                                                } else {
                                                                    var11_6 = var12_13;
                                                                    if (var16_15 != 0) {
                                                                        var24_16 /* !! */  = (int[])", #-0";
                                                                        ** continue;
                                                                    }
                                                                }
                                                            } else {
                                                                var26_17.append(", {");
                                                                if (var16_15 != 0 && var9_5 == 0) {
                                                                    var26_17.append('-');
                                                                }
                                                                var26_17.append(var9_5);
                                                                var26_17.append('}');
                                                                var11_6 = var9_5;
                                                            }
                                                        }
                                                    }
                                                    if (var19_23 == 15 && (var14_7 || var17_8 != 0)) {
                                                        var26_17.append("\t ; ");
                                                        var12_13 = var18_22;
                                                        if (var4_3) {
                                                            var12_13 = 2;
                                                        }
                                                        var22_4 = var9_5 + var12_13 * 2;
                                                        n.r(var26_17, var1_1, var22_4 - (var1_1 & 3L));
                                                    }
                                                    var9_5 = var13_14;
                                                    ** continue;
                                                }
                                                if (var7_10 != 16) {
                                                    var8_11 = 1;
                                                }
                                            }
                                            var26_17.append(n.d[var7_10]);
                                        }
lbl510:
                                        // 3 sources

                                        while (true) {
                                            var9_5 = var13_14;
                                            break block82;
                                            break;
                                        }
                                    }
                                    var9_5 = 0x408000 & var3_2;
                                    if (var9_5 == 0) break block95;
                                    if (var9_5 == 32768) break block96;
                                    if (var9_5 == 0x400000) break block97;
                                    var5_20 = '3';
lbl519:
                                    // 4 sources

                                    while (true) {
                                        var26_17.append(var5_20);
                                        ** GOTO lbl510
                                        break;
                                    }
                                }
                                var5_20 = '2';
                                ** GOTO lbl519
                            }
                            var5_20 = '1';
                            ** GOTO lbl519
                        }
                        var5_20 = '4';
                        ** continue;
                    }
                    var26_17.append('%');
                    ** continue;
                }
                var12_13 = var9_5 + 1;
            }
            if (var11_6 > 32 || var11_6 < -16) {
                var26_17.append("\t ; 0x");
                var26_17.append(Integer.toHexString(var11_6).toUpperCase(Locale.US));
            }
            if (var8_11 != 0) {
                var26_17.append("\t ; <UNPREDICTABLE>");
            }
            return var26_17.toString();
        }
        return null;
    }

    private static long[] $d2j$hex$97e2ef07$decode_J(String src) {
        byte[] d2 = n.c.$d2j$hex$97e2ef07$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s.get(data);
        return data;
    }

    private static int[] $d2j$hex$97e2ef07$decode_I(String src) {
        byte[] d2 = n.c.$d2j$hex$97e2ef07$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s.get(data);
        return data;
    }

    private static short[] $d2j$hex$97e2ef07$decode_S(String src) {
        byte[] d2 = n.c.$d2j$hex$97e2ef07$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s.get(data);
        return data;
    }

    private static byte[] $d2j$hex$97e2ef07$decode_B(String src) {
        char[] d2 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i = 0; i < ret.length; ++i) {
            int ll;
            int hh;
            char h2 = d2[2 * i];
            char l = d2[2 * i + 1];
            if (h2 >= '0' && h2 <= '9') {
                hh = h2 - 48;
            } else if (h2 >= 'a' && h2 <= 'f') {
                hh = h2 - 97 + 10;
            } else if (h2 >= 'A' && h2 <= 'F') {
                hh = h2 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l >= '0' && l <= '9') {
                ll = l - 48;
            } else if (l >= 'a' && l <= 'f') {
                ll = l - 97 + 10;
            } else if (l >= 'A' && l <= 'F') {
                ll = l - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}
