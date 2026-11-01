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

static abstract class n.h {
    static final int[] a = n.h.$d2j$hex$f674bbf9$decode_I("0580aff3ffffffff00808ff7fcffffff8f0fc0e8ff0ff0ff9f0fc0e8ff0ff0ffaf0fc0e8ff0ff0ffc00fc0e8f00ff0ffd00fc0e8f00ff0ffe00fc0e8f00ff0fff000c0e8f000f0ff8f0fd0e8ff0ff0ff9f0fd0e8ff0ff0ffaf0fd0e8ff0ff0ffcf0fd0e8ff0ff0ffdf0fd0e8ff0ff0ffef0fd0e8ff0ff0ffff00d0e8ff00f0ff80f0c0faf0f0f0ff90f0c0faf0f0f0ffa0f0c0faf0f0f0ff80f0d0faf0f0f0ff90f0d0faf0f0f0ffa0f0d0faf0f0f0ff00f010f900f070fff080aff3f0ffffff518fbff3f3ffffff418fbff3f3ffffff508fbff3f0ffffff408fbff3f0ffffff608fbff3f0fffffff0f090fbf0f0f0fff0f0b0fbf0f0f0ff0080e0f700f0f0ff00f030f800f070ff0080f0f700f0f0ff0080aff3ffffffff0180aff3ffffffff0280aff3ffffffff0380aff3ffffffff0480aff3ffffffff0080aff300ffffff00a0f0f700f0f0ff2f8fbff3ffffffff0084aff31fffffff0086aff31fffffff008fc0f3fffff0ff00c010e8ffffd0ff00c090e9ffffd0ff0080e0f300f0e0ff0081aff3e0ffffff00f0d0e8f0fff0ff10f0d0e8f0fff0ff0085aff300ffffff0087aff300ffffff008fdef300ffffff008080f300f0e0ff000f50e8ff0ff0ff4f0fd0e8ef0ff0ff00c000e8e0ffd0ff00c080e9e0ffd0ff80f00ffac0f0ffff80f01ffac0f0ffff80f02ffac0f0ffff80f03ffac0f0ffff80f04ffac0f0ffff80f05ffac0f0ffff000040e8ff00f0ff7f00d0e8ff00f0ff00f080faf0f0f0ff10f080faf0f0f0ff20f080faf0f0f0ff40f080faf0f0f0ff50f080faf0f0f0ff60f080faf0f0f0ff80f080faf0f0f0ff90f080faf0f0f0ffa0f080faf0f0f0ffb0f080faf0f0f0ff00f090faf0f0f0ff10f090faf0f0f0ff20f090faf0f0f0ff40f090faf0f0f0ff50f090faf0f0f0ff60f090faf0f0f0ff80f090faf0f0f0ff90f090faf0f0f0ffa0f090faf0f0f0ffb0f090faf0f0f0ff00f0a0faf0f0f0ff10f0a0faf0f0f0ff20f0a0faf0f0f0ff40f0a0faf0f0f0ff50f0a0faf0f0f0ff60f0a0faf0f0f0ff80f0a0faf0f0f0ff80f0b0faf0f0f0ff00f0c0faf0f0f0ff10f0c0faf0f0f0ff20f0c0faf0f0f0ff40f0c0faf0f0f0ff50f0c0faf0f0f0ff60f0c0faf0f0f0ff00f0d0faf0f0f0ff10f0d0faf0f0f0ff20f0d0faf0f0f0ff40f0d0faf0f0f0ff50f0d0faf0f0f0ff60f0d0faf0f0f0ff00f0e0faf0f0f0ff10f0e0faf0f0f0ff20f0e0faf0f0f0ff40f0e0faf0f0f0ff50f0e0faf0f0f0ff60f0e0faf0f0f0ff00f000fbf0f0f0ff00f070fbf0f0f0ff00f000faf0f0e0ff00f020faf0f0e0ff00f040faf0f0e0ff00f060faf0f0e0ff400fc0e8e00ff0ff000020f3e0f0f0ff0000a0f3e0f0f0ff00f020fbe0f0f0ff00f030fbe0f0f0ff00f040fbe0f0f0ff00f050fbe0f0f0ff80f000fac0f0f0ff80f010fac0f0f0ff80f020fac0f0f0ff80f030fac0f0f0ff80f040fac0f0f0ff80f050fac0f0f0ff00f010fbc0f0f0ff00006ff32080ffff000f10ea008ff0ff000f90ea008ff0ff000f10eb008ff0ff000fb0eb008ff0ff000f10f0008ff0fb000f90f0008ff0fb000f10f1008ff0fb000fb0f1008ff0fb00004fea0080efff00006fea0080efff7000c0e8f000f0ff000000fbf000f0ff100000fbf000f0ff000070fbf000f0ff000080fbf000f0ff0000a0fbf000f0ff0000c0fbf000f0ff0000e0fbf000f0ff6000e0fbf000f0ff000f50e8000ff0ff00004ff00080effb00006ff00080effb00f010f800f070ff000020fbe000f0ff000030fbe000f0ff000040fbe000f0ff000050fbe000f0ff000060fbe000f0ffc000c0fbe000f0ffc000d0fbe000f0ff0000c0ea3080f0ff2000c0ea3080f0ff000040f32080f0ff0000c0f32080f0ff000e00f8000f90ff000010fbc000f0ff8000c0fbc000f0ff000060f32080f0ff000e10f8000f90fe000000f32080d0ff000080f32080d0ff000000f20080f0fb000040f20080f0fb0000a0f20080f0fb0000c0f20080f0fb000000ea0080e0ff000020ea0080e0ff000040ea0080e0ff000060ea0080e0ff000080ea0080e0ff000000eb0080e0ff000040eb0080e0ff000060eb0080e0ff0000a0eb0080e0ff0000c0eb0080e0ff000040e80000f0ff000000f00080e0fb000020f00080e0fb000040f00080e0fb000060f00080e0fb000080f00080e0fb000000f10080e0fb000040f10080e0fb000060f10080e0fb0000a0f10080e0fb0000c0f10080e0fb000080e80000d0ff000090e80000d0ff000000e90000d0ff000010e90000d0ff0000c0e9ff00d0ff0000d0e9ff00d0ff000040e9000050ff000050e9000050ff000060e8000070ff000070e8000070ff000000f8000010ff000010f8000010fe0080c0f300d0c0fb008080f300d0c0fb008000f000d000f8009000f000d000f800c000f001d000f800d000f000d000f80000000000000000");
    static final String[] b = new String[]{"SEVL%c.W", "DCPS%0-1d.W", "STLB%c.W\t %12-15r, [%16-19R]", "STLH%c.W\t %12-15r, [%16-19R]", "STL%c.W\t %12-15r, [%16-19R]", "STLEXB%c.W\t %0-3r, %12-15r, [%16-19R]", "STLEXH%c.W\t %0-3r, %12-15r, [%16-19R]", "STLEX%c.W\t %0-3r, %12-15r, [%16-19R]", "STLEXD%c.W\t %0-3r, %12-15r, %8-11r, [%16-19R]", "LDAB%c.W\t %12-15r, [%16-19R]", "LDAH%c.W\t %12-15r, [%16-19R]", "LDA%c.W\t %12-15r, [%16-19R]", "LDAEXB%c.W\t %12-15r, [%16-19R]", "LDAEXH%c.W\t %12-15r, [%16-19R]", "LDAEX%c.W\t %12-15r, [%16-19R]", "LDAEXD%c.W\t %12-15r, %8-11r, [%16-19R]", "CRC32B%8-11S, %16-19S, %0-3S.W", "CRC32H%9-11S, %16-19S, %0-3S.W", "CRC32W%8-11S, %16-19S, %0-3S.W", "CRC32CB%8-11S, %16-19S, %0-3S.W", "CRC32CH%8-11S, %16-19S, %0-3S.W", "CRC32CW%8-11S, %16-19S, %0-3S.W", "PLI%c.W\t %a", "DBG%c.W\t #%0-3d", "DMB%c.W\t %U", "DSB%c.W\t %U", "DMB%c.W\t %U", "DSB%c.W\t %U", "ISB%c.W\t %U", "SDIV%c.W\t %8-11r, %16-19r, %0-3r", "UDIV%c.W\t %8-11r, %16-19r, %0-3r", "HVC%c.W\t %V", "PLDW%c.W\t %a", "SMC%c.W\t %K", "NOP%c.W", "YIELD%c.W", "WFE%c.W", "WFI%c.W", "SEV%c.W", "NOP%c.W\t {%0-7d}", "UDF%c.W\t %H", "CLREX%c.W", "CPSIE.W%7'A%6'I%5'F%X.W", "CPSID.W%7'A%6'I%5'F%X.W", "BXJ%c.W\t %16-19r%x", "RFEDB%c.W\t %16-19r%21'!", "RFEIA%c.W\t %16-19r%21'!", "MRS%c.W\t %8-11r, %D", "CPS#%0-4d%X.W", "TBB%c.W\t [%16-19r,%0-3r]%x", "TBH%c.W\t [%16-19r, %0-3r,LSL #1]%x", "CPSIE%7'A%6'I%5'F, #%0-4d%X.W", "CPSID%7'A%6'I%5'F, #%0-4d%X.W", "SUBS%c.W\t PC, LR, #%0-7d", "MSR%c.W\t %C, %16-19r", "LDREX%c.W\t %12-15r, [%16-19r]", "LDREX%4?HB%c.W\t %12-15r, [%16-19r]", "SRSDB%c.W\t %16-19r%21'!, #%0-4d", "SRSIA%c.W\t %16-19r%21'!, #%0-4d", "SXTH%c.W\t %8-11r, %0-3r%R", "UXTH%c.W\t %8-11r, %0-3r%R", "SXTB16%c.W\t %8-11r, %0-3r%R", "UXTB16%c.W\t %8-11r, %0-3r%R", "SXTB%c.W\t %8-11r, %0-3r%R", "UXTB%c.W\t %8-11r, %0-3r%R", "STREX%c.W\t %8-11r, %12-15r, [%16-19r]", "LDREXD%c.W\t %12-15r, %8-11r, [%16-19r]", "SADD8%c.W\t %8-11r, %16-19r, %0-3r", "QADD8%c.W\t %8-11r, %16-19r, %0-3r", "SHADD8%c.W\t %8-11r, %16-19r, %0-3r", "UADD8%c.W\t %8-11r, %16-19r, %0-3r", "UQADD8%c.W\t %8-11r, %16-19r, %0-3r", "UHADD8%c.W\t %8-11r, %16-19r, %0-3r", "QADD%c.W\t %8-11r, %0-3r, %16-19r", "QDADD%c.W\t %8-11r, %0-3r, %16-19r", "QSUB%c.W\t %8-11r, %0-3r, %16-19r", "QDSUB%c.W\t %8-11r, %0-3r, %16-19r", "SADD16%c.W\t %8-11r, %16-19r, %0-3r", "QADD16%c.W\t %8-11r, %16-19r, %0-3r", "SHADD16%c.W\t %8-11r, %16-19r, %0-3r", "UADD16%c.W\t %8-11r, %16-19r, %0-3r", "UQADD16%c.W\t %8-11r, %16-19r, %0-3r", "UHADD16%c.W\t %8-11r, %16-19r, %0-3r", "REV%c.W\t %8-11r, %16-19r", "REV16%c.W\t %8-11r, %16-19r", "RBIT%c.W\t %8-11r, %16-19r", "REVSH%c.W\t %8-11r, %16-19r", "SASX%c.W\t %8-11r, %16-19r, %0-3r", "QASX%c.W\t %8-11r, %16-19r, %0-3r", "SHASX%c.W\t %8-11r, %16-19r, %0-3r", "UASX%c.W\t %8-11r, %16-19r, %0-3r", "UQASX%c.W\t %8-11r, %16-19r, %0-3r", "UHASX%c.W\t %8-11r, %16-19r, %0-3r", "SEL%c.W\t %8-11r, %16-19r, %0-3r", "CLZ%c.W\t %8-11r, %16-19r", "SSUB8%c.W\t %8-11r, %16-19r, %0-3r", "QSUB8%c.W\t %8-11r, %16-19r, %0-3r", "SHSUB8%c.W\t %8-11r, %16-19r, %0-3r", "USUB8%c.W\t %8-11r, %16-19r, %0-3r", "UQSUB8%c.W\t %8-11r, %16-19r, %0-3r", "UHSUB8%c.W\t %8-11r, %16-19r, %0-3r", "SSUB16%c.W\t %8-11r, %16-19r, %0-3r", "QSUB16%c.W\t %8-11r, %16-19r, %0-3r", "SHSUB16%c.W\t %8-11r, %16-19r, %0-3r", "USUB16%c.W\t %8-11r, %16-19r, %0-3r", "UQSUB16%c.W\t %8-11r, %16-19r, %0-3r", "UHSUB16%c.W\t %8-11r, %16-19r, %0-3r", "SSAX%c.W\t %8-11r, %16-19r, %0-3r", "QSAX%c.W\t %8-11r, %16-19r, %0-3r", "SHSAX%c.W\t %8-11r, %16-19r, %0-3r", "USAX%c.W\t %8-11r, %16-19r, %0-3r", "UQSAX%c.W\t %8-11r, %16-19r, %0-3r", "UHSAX%c.W\t %8-11r, %16-19r, %0-3r", "MUL%c.W\t %8-11r, %16-19r, %0-3r", "USAD8%c.W\t %8-11r, %16-19r, %0-3r", "LSL%20'S%c.W\t %8-11R, %16-19R, %0-3R", "LSR%20'S%c.W\t %8-11R, %16-19R, %0-3R", "ASR%20'S%c.W\t %8-11R, %16-19R, %0-3R", "ROR%20'S%c.W\t %8-11r, %16-19r, %0-3r", "STREX%4?HB%c.W\t %0-3r, %12-15r, [%16-19r]", "SSAT16%c.W\t %8-11r, #%0-4d, %16-19r", "USAT16%c.W\t %8-11r, #%0-4d, %16-19r", "SMUAD%4'X%c.W\t %8-11r, %16-19r, %0-3r", "SMULW%4?TB%c.W\t %8-11r, %16-19r, %0-3r", "SMUSD%4'X%c.W\t %8-11r, %16-19r, %0-3r", "SMMUL%4'R%c.W\t %8-11r, %16-19r, %0-3r", "SXTAH%c.W\t %8-11r, %16-19r, %0-3r%R", "UXTAH%c.W\t %8-11r, %16-19r, %0-3r%R", "SXTAB16%c.W\t %8-11r, %16-19r, %0-3r%R", "UXTAB16%c.W\t %8-11r, %16-19r, %0-3r%R", "SXTAB%c.W\t %8-11r, %16-19r, %0-3r%R", "UXTAB%c.W\t %8-11r, %16-19r, %0-3r%R", "SMUL%5?TB%4?TB%c.W\t %8-11r, %16-19r, %0-3r", "BFC%c.W\t %8-11r, %E", "TST%c.W\t %16-19r, %S", "TEQ%c.W\t %16-19r, %S", "CMN%c.W\t %16-19r, %S", "CMP%c.W\t %16-19r, %S", "TST%c.W\t %16-19r, %M", "TEQ%c.W\t %16-19r, %M", "CMN%c.W\t %16-19r, %M", "CMP%c.W\t %16-19r, %M", "MOV%20'S%c.W\t %8-11r, %S", "MVN%20'S%c.W\t %8-11r, %S", "STREXD%c.W\t %0-3r, %12-15r, %8-11r, [%16-19r]", "MLA%c.W\t %8-11r, %16-19r, %0-3r, %12-15r", "MLS%c.W\t %8-11r, %16-19r, %0-3r, %12-15r", "USADA8%c.W\t %8-11R, %16-19R, %0-3R, %12-15R", "SMULL%c.W\t %12-15R, %8-11R, %16-19R, %0-3R", "UMULL%c.W\t %12-15R, %8-11R, %16-19R, %0-3R", "SMLAL%c.W\t %12-15R, %8-11R, %16-19R, %0-3R", "UMLAL%c.W\t %12-15R, %8-11R, %16-19R, %0-3R", "UMAAL%c.W\t %12-15R, %8-11R, %16-19R, %0-3R", "LDREX%c.W\t %12-15r, [%16-19r,#%0-7W]", "MOV%20'S%c.W\t %8-11r, %M", "MVN%20'S%c.W\t %8-11r, %M", "PLD%c.W\t %a", "SMLAD%4'X%c.W\t %8-11R, %16-19R, %0-3R, %12-15R", "SMLAW%4?TB%c.W\t %8-11R, %16-19R, %0-3R, %12-15R", "SMLSD%4'X%c.W\t %8-11R, %16-19R, %0-3R, %12-15R", "SMMLA%4'R%c.W\t %8-11R, %16-19R, %0-3R, %12-15R", "SMMLS%4'R%c.W\t %8-11R, %16-19R, %0-3R, %12-15R", "SMLALD%4'X%c.W\t %12-15R, %8-11R, %16-19R, %0-3R", "SMLSLD%4'X%c.W\t %12-15R, %8-11R, %16-19R, %0-3R", "PKHBT%c.W\t %8-11r, %16-19r, %S", "PKHTB%c.W\t %8-11r, %16-19r, %S", "SBFX%c.W\t %8-11r, %16-19r, %F", "UBFX%c.W\t %8-11r, %16-19r, %F", "STR%wt%c.W\t %12-15r, %a", "SMLA%5?TB%4?TB%c.W\t %8-11r, %16-19r, %0-3r, %12-15r", "SMLAL%5?TB%4?TB%c.W\t %12-15r, %8-11r, %16-19r, %0-3r", "BFI%c.W\t %8-11r, %16-19r, %E", "LDR%wt%c.W\t %12-15r, %a", "SSAT%c.W\t %8-11r, #%0-4d, %16-19r%s", "USAT%c.W\t %8-11r, #%0-4d, %16-19r%s", "ADDW%c.W\t %8-11r, %16-19r, %I", "MOVW%c.W\t %8-11r, %J", "SUBW%c.W\t %8-11r, %16-19r, %I", "MOVT%c.W\t %8-11r, %J", "AND%20'S%c.W\t %8-11r, %16-19r, %S", "BIC%20'S%c.W\t %8-11r, %16-19r, %S", "ORR%20'S%c.W\t %8-11r, %16-19r, %S", "ORN%20'S%c.W\t %8-11r, %16-19r, %S", "EOR%20'S%c.W\t %8-11r, %16-19r, %S", "ADD%20'S%c.W\t %8-11r, %16-19r, %S", "ADC%20'S%c.W\t %8-11r, %16-19r, %S", "SBC%20'S%c.W\t %8-11r, %16-19r, %S", "SUB%20'S%c.W\t %8-11r, %16-19r, %S", "RSB%20'S%c.W\t %8-11r, %16-19r, %S", "STREX%c.W\t %8-11r, %12-15r, [%16-19r,#%0-7W]", "AND%20'S%c.W\t %8-11r, %16-19r, %M", "BIC%20'S%c.W\t %8-11r, %16-19r, %M", "ORR%20'S%c.W\t %8-11r, %16-19r, %M", "ORN%20'S%c.W\t %8-11r, %16-19r, %M", "EOR%20'S%c.W\t %8-11r, %16-19r, %M", "ADD%20'S%c.W\t %8-11r, %16-19r, %M", "ADC%20'S%c.W\t %8-11r, %16-19r, %M", "SBC%20'S%c.W\t %8-11r, %16-19r, %M", "SUB%20'S%c.W\t %8-11r, %16-19r, %M", "RSB%20'S%c.W\t %8-11r, %16-19r, %M", "STMIA%c.W\t %16-19r%21'!, %m", "LDMIA%c.W\t %16-19r%21'!, %m", "STMDB%c.W\t %16-19r%21'!, %m", "LDMDB%c.W\t %16-19r%21'!, %m", "STRD%c.W\t %12-15r, %8-11r, [%16-19r]", "LDRD%c.W\t %12-15r, %8-11r, [%16-19r]", "STRD%c.W\t %12-15r, %8-11r, [%16-19r,#%23`-%0-7W]%21'!%L", "LDRD%c.W\t %12-15r, %8-11r, [%16-19r,#%23`-%0-7W]%21'!%L", "STRD%c.W\t %12-15r, %8-11r, [%16-19r], #%23`-%0-7W%L", "LDRD%c.W\t %12-15r, %8-11r, [%16-19r], #%23`-%0-7W%L", "STR%w%c.W\t %12-15r, %a", "LDR%w%c.W\t %12-15r, %a", "UNDEFINED(BCC, COND=0xF).W", "UNDEFINED(BCC, COND=0xE).W", "B%22-25c.W\t %b%X", "B%c.W\t %B%x", "BLX%c.W\t %B%x", "BL%c.W\t %B%x", "\t \t ; <UNDEFINED> instruction: %0-31x.W"};

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static String a(n var0, long var1_1, int var3_2) {
        var23_3 /* !! */  = n.c.b((n)var0, var1_1, var3_2, true);
        if (var23_3 /* !! */  != null) {
            return var23_3 /* !! */ ;
        }
        var23_3 /* !! */  = n.e.b((n)var0, var1_1, var3_2, true);
        if (var23_3 /* !! */  != null) {
            return var23_3 /* !! */ ;
        }
        var6_4 = n.h.b.length;
        for (var5_5 = 0; var5_5 < var6_4; ++var5_5) {
            var23_3 /* !! */  = (String[])n.h.a;
            var7_6 = var5_5 * 2;
            if ((var23_3 /* !! */ [var7_6 + 1] & var3_2) != var23_3 /* !! */ [var7_6]) {
                continue;
            }
            var13_7 = (0x200000 & var3_2) != 0;
            var17_8 = 0x800000 & var3_2;
            var14_9 = var17_8 == 0;
            var16_10 = 0x1000000 & var3_2;
            var15_11 = var16_10 != 0;
            var26_12 = new StringBuilder();
            var23_3 /* !! */  = n.h.b[var5_5];
            var6_4 = var23_3 /* !! */ .length();
            var8_13 = 0;
            var7_6 = 0;
            block33: for (var9_14 = 0; var9_14 < var6_4; ++var9_14) {
                block94: {
                    block112: {
                        block95: {
                            block96: {
                                block97: {
                                    block115: {
                                        block116: {
                                            block117: {
                                                block118: {
                                                    block98: {
                                                        block113: {
                                                            block93: {
                                                                block114: {
                                                                    block99: {
                                                                        block100: {
                                                                            block108: {
                                                                                block109: {
                                                                                    block110: {
                                                                                        block111: {
                                                                                            block101: {
                                                                                                block102: {
                                                                                                    block103: {
                                                                                                        block104: {
                                                                                                            block105: {
                                                                                                                block107: {
                                                                                                                    block106: {
                                                                                                                        var4_15 = n.g((String)var23_3 /* !! */ , var6_4, var9_14);
                                                                                                                        if (var4_15 != 37) {
                                                                                                                            n.d(var26_12, (char)var4_15);
                                                                                                                            var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                                                                            var10_16 = var5_5;
                                                                                                                            var10_16 = var6_4;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        var10_16 = var9_14 + 1;
                                                                                                                        var4_15 = n.g((String)var23_3 /* !! */ , var6_4, var10_16);
                                                                                                                        if (var4_15 == 37) break block94;
                                                                                                                        if (var4_15 == 88) ** GOTO lbl-1000
                                                                                                                        if (var4_15 == 109) break block95;
                                                                                                                        if (var4_15 == 115) break block96;
                                                                                                                        if (var4_15 == 82) break block97;
                                                                                                                        if (var4_15 == 83) break block98;
                                                                                                                        if (var4_15 == 85) break block99;
                                                                                                                        if (var4_15 == 86) break block100;
                                                                                                                        if (var4_15 == 119) break block101;
                                                                                                                        if (var4_15 == 120) ** GOTO lbl-1000
                                                                                                                        block0 : switch (var4_15) {
                                                                                                                            default: {
                                                                                                                                block3 : switch (var4_15) {
                                                                                                                                    default: {
                                                                                                                                        switch (var4_15) {
                                                                                                                                            default: {
                                                                                                                                                switch (var4_15) {
                                                                                                                                                    default: {
                                                                                                                                                        var0 = new StringBuilder();
                                                                                                                                                        var0.append("130 Invalid format char '");
                                                                                                                                                        var0.append((char)var4_15);
                                                                                                                                                        var0.append("'; ");
                                                                                                                                                        var0.append(var5_5);
                                                                                                                                                        var0.append("; ");
                                                                                                                                                        var0.append(var10_16);
                                                                                                                                                        var0.append("; '");
                                                                                                                                                        var0.append((String)var23_3 /* !! */ );
                                                                                                                                                        var0.append("'");
                                                                                                                                                        throw new RuntimeException(var0.toString());
                                                                                                                                                    }
                                                                                                                                                    case 99: lbl-1000:
                                                                                                                                                    // 3 sources

                                                                                                                                                    {
                                                                                                                                                        var9_14 = var5_5;
                                                                                                                                                        var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                                                                                                        var9_14 = var6_4;
                                                                                                                                                        var9_14 = var10_16;
                                                                                                                                                        var11_17 = var7_6;
                                                                                                                                                        break block0;
                                                                                                                                                    }
                                                                                                                                                    case 98: {
                                                                                                                                                        n.r(var26_12, var1_1, (1 - ((var3_2 & 0x4000000) >> 26) << 20 | (var3_2 & 2048) >> 11 << 19 | (var3_2 & 8192) >> 13 << 18 | (0x3F0000 & var3_2) >> 4 | (var3_2 & 2047) << 1) - 1048572);
                                                                                                                                                        var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                                                                                                        var9_14 = var6_4;
                                                                                                                                                        var9_14 = var5_5;
                                                                                                                                                        var9_14 = var10_16;
                                                                                                                                                        var11_17 = var7_6;
                                                                                                                                                        break block0;
                                                                                                                                                    }
                                                                                                                                                    case 97: 
                                                                                                                                                }
                                                                                                                                                var18_19 = (var3_2 & 983040) >> 16;
                                                                                                                                                var12_18 = (var3_2 & 3840) >> 8;
                                                                                                                                                var11_17 = var3_2 & 4095;
                                                                                                                                                var9_14 = var3_2 & 255;
                                                                                                                                                var26_12.append('[');
                                                                                                                                                var24_22 /* !! */  = n.e;
                                                                                                                                                var26_12.append(var24_22 /* !! */ [var18_19]);
                                                                                                                                                if (var14_9) ** GOTO lbl106
                                                                                                                                                var9_14 = var11_17;
                                                                                                                                                if (var18_19 != 15) {
                                                                                                                                                    var8_13 = var11_17;
                                                                                                                                                    var9_14 = var11_17;
                                                                                                                                                }
lbl101:
                                                                                                                                                // 6 sources

                                                                                                                                                while (true) {
                                                                                                                                                    var11_17 = 0;
lbl103:
                                                                                                                                                    // 2 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        var12_18 = 0;
                                                                                                                                                        ** GOTO lbl156
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
lbl106:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var18_19 != 15) ** GOTO lbl109
                                                                                                                                                var9_14 = -var11_17;
                                                                                                                                                ** GOTO lbl101
lbl109:
                                                                                                                                                // 1 sources

                                                                                                                                                if (var12_18 == 0) {
                                                                                                                                                    var9_14 = (var3_2 & 48) >> 4;
                                                                                                                                                    var26_12.append(", ");
                                                                                                                                                    var26_12.append(var24_22 /* !! */ [var3_2 & 15]);
                                                                                                                                                    if (var9_14 != 0) {
                                                                                                                                                        var26_12.append(", LSL #");
                                                                                                                                                        var26_12.append(var9_14);
                                                                                                                                                    }
                                                                                                                                                    var4_15 = 93;
lbl121:
                                                                                                                                                    // 2 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        var26_12.append((char)var4_15);
lbl124:
                                                                                                                                                        // 8 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            var9_14 = var5_5;
                                                                                                                                                            var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                                                                                                            var9_14 = var6_4;
                                                                                                                                                            var9_14 = var10_16;
                                                                                                                                                            var11_17 = var7_6;
                                                                                                                                                            break block0;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                switch (var12_18) {
                                                                                                                                                    default: {
                                                                                                                                                        var24_22 /* !! */  = ", <undefined>]";
lbl134:
                                                                                                                                                        // 2 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            var26_12.append((String)var24_22 /* !! */ );
                                                                                                                                                            ** GOTO lbl124
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
lbl138:
                                                                                                                                                    // 2 sources

                                                                                                                                                    case 15: {
                                                                                                                                                        var11_17 = 0;
                                                                                                                                                        var12_18 = 1;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    case 14: {
                                                                                                                                                        ** GOTO lbl101
                                                                                                                                                    }
                                                                                                                                                    case 13: {
                                                                                                                                                        var9_14 = -var9_14;
                                                                                                                                                        ** GOTO lbl138
                                                                                                                                                    }
                                                                                                                                                    case 12: {
                                                                                                                                                        var9_14 = -var9_14;
                                                                                                                                                        ** continue;
                                                                                                                                                    }
lbl150:
                                                                                                                                                    // 2 sources

                                                                                                                                                    case 11: {
                                                                                                                                                        var11_17 = 1;
                                                                                                                                                        ** continue;
                                                                                                                                                    }
                                                                                                                                                    case 9: {
                                                                                                                                                        var9_14 = -var9_14;
                                                                                                                                                        ** GOTO lbl150
                                                                                                                                                    }
                                                                                                                                                }
lbl156:
                                                                                                                                                // 2 sources

                                                                                                                                                if (var11_17 != 0) {
                                                                                                                                                    var26_12.append("], #");
                                                                                                                                                    var26_12.append(var9_14);
                                                                                                                                                } else {
                                                                                                                                                    if (var9_14 != 0) {
                                                                                                                                                        var26_12.append(", #");
                                                                                                                                                        var26_12.append(var9_14);
                                                                                                                                                    }
                                                                                                                                                    var26_12.append(']');
                                                                                                                                                    if (var12_18 != 0) {
                                                                                                                                                        var26_12.append('!');
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (var18_19 == 15) {
                                                                                                                                                    var26_12.append("\t ; ");
                                                                                                                                                    n.r(var26_12, var1_1, (4L + var1_1 & -4L) + (long)var9_14 - var1_1);
                                                                                                                                                }
                                                                                                                                            }
lbl176:
                                                                                                                                            // 4 sources

                                                                                                                                            while (true) {
                                                                                                                                                var9_14 = var5_5;
                                                                                                                                                var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                                                                                                var9_14 = var6_4;
                                                                                                                                                var9_14 = var10_16;
lbl181:
                                                                                                                                                // 4 sources

                                                                                                                                                while (true) {
                                                                                                                                                    var10_16 = var5_5;
                                                                                                                                                    var10_16 = var6_4;
                                                                                                                                                    var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                                                                                                    continue block33;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            case 77: {
                                                                                                                                                var8_13 = var3_2 & 255 | (var3_2 & 28672) >> 4 | (var3_2 & 0x4000000) >> 15;
                                                                                                                                                var9_14 = var8_13 & 255;
                                                                                                                                                var11_17 = (var8_13 & 3840) >> 8;
                                                                                                                                                if (var11_17 == 0) ** GOTO lbl207
                                                                                                                                                if (var11_17 == 1) ** GOTO lbl205
                                                                                                                                                if (var11_17 == 2) ** GOTO lbl202
                                                                                                                                                if (var11_17 == 3) ** GOTO lbl198
                                                                                                                                                var9_14 = (var8_13 & 3968) >> 7;
                                                                                                                                                var8_13 = var8_13 & 127 | 128;
                                                                                                                                                var8_13 = var8_13 >> var9_14 | var8_13 << 32 - var9_14;
                                                                                                                                                ** GOTO lbl208
lbl198:
                                                                                                                                                // 1 sources

                                                                                                                                                var8_13 = var9_14 << 24 | var9_14 << 16 | var9_14 << 8;
lbl199:
                                                                                                                                                // 3 sources

                                                                                                                                                while (true) {
                                                                                                                                                    var8_13 |= var9_14;
                                                                                                                                                    ** GOTO lbl208
                                                                                                                                                    break;
                                                                                                                                                }
lbl202:
                                                                                                                                                // 1 sources

                                                                                                                                                var8_13 = var9_14 << 24;
                                                                                                                                                var9_14 <<= 8;
                                                                                                                                                ** GOTO lbl199
lbl205:
                                                                                                                                                // 1 sources

                                                                                                                                                var8_13 = var9_14 << 16;
                                                                                                                                                ** continue;
lbl207:
                                                                                                                                                // 1 sources

                                                                                                                                                var8_13 = var9_14;
                                                                                                                                            }
lbl208:
                                                                                                                                            // 5 sources

                                                                                                                                            while (true) {
                                                                                                                                                var26_12.append('#');
                                                                                                                                                var26_12.append(var8_13);
                                                                                                                                                break block3;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            case 76: {
                                                                                                                                                if ((var3_2 >> 16 & 15) != 15) ** GOTO lbl124
                                                                                                                                                var9_14 = var11_17 = (var3_2 & 255) * 4;
                                                                                                                                                if (var17_8 == 0) {
                                                                                                                                                    var9_14 = -var11_17;
                                                                                                                                                }
                                                                                                                                                var26_12.append("\t ; ");
                                                                                                                                                n.r(var26_12, var1_1, (-4L & var1_1) + 4L + (long)var9_14 - var1_1);
                                                                                                                                                ** GOTO lbl124
                                                                                                                                            }
                                                                                                                                            case 75: {
                                                                                                                                                var8_13 = (var3_2 & 983040) >> 16 | var3_2 & 4080;
                                                                                                                                                var9_14 = (var3_2 & 15) << 12;
lbl226:
                                                                                                                                                // 3 sources

                                                                                                                                                while (true) {
                                                                                                                                                    var8_13 |= var9_14;
                                                                                                                                                    ** GOTO lbl208
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            case 74: {
                                                                                                                                                var8_13 = var3_2 & 255 | (var3_2 & 28672) >> 4 | (var3_2 & 0x4000000) >> 15;
                                                                                                                                                var9_14 = (var3_2 & 983040) >> 4;
                                                                                                                                                ** GOTO lbl226
                                                                                                                                            }
                                                                                                                                            case 73: {
                                                                                                                                                var8_13 = var3_2 & 255 | (var3_2 & 28672) >> 4;
                                                                                                                                                var9_14 = (var3_2 & 0x4000000) >> 15;
                                                                                                                                                ** continue;
                                                                                                                                            }
                                                                                                                                            case 72: 
                                                                                                                                        }
                                                                                                                                        var8_13 = var3_2 & 4095 | (var3_2 & 983040) >> 4;
                                                                                                                                        ** continue;
                                                                                                                                    }
                                                                                                                                    case 70: {
                                                                                                                                        var9_14 = (var3_2 & 31) + 1;
                                                                                                                                        var26_12.append('#');
                                                                                                                                        var26_12.append((var3_2 & 192) >> 6 | (var3_2 & 28672) >> 10);
                                                                                                                                        var26_12.append(", #");
lbl248:
                                                                                                                                        // 2 sources

                                                                                                                                        while (true) {
                                                                                                                                            var26_12.append(var9_14);
                                                                                                                                            ** GOTO lbl124
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    case 69: {
                                                                                                                                        var9_14 = (var3_2 & 192) >> 6 | (var3_2 & 28672) >> 10;
                                                                                                                                        var26_12.append('#');
                                                                                                                                        var26_12.append(var9_14);
                                                                                                                                        var26_12.append(", #");
                                                                                                                                        var9_14 = (var3_2 & 31) - var9_14 + 1;
                                                                                                                                        ** continue;
                                                                                                                                    }
                                                                                                                                    case 68: {
                                                                                                                                        var9_14 = var3_2 & 255;
                                                                                                                                        if (var9_14 != 0 && (var3_2 & 32) != 32) {
                                                                                                                                            while (true) {
                                                                                                                                                var24_22 /* !! */  = n.h.b(var9_14);
                                                                                                                                                ** continue;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var9_14 = (var3_2 & 983040) >> 16;
lbl269:
                                                                                                                                        // 2 sources

                                                                                                                                        while (true) {
                                                                                                                                            n.f(var26_12, var9_14 | var3_2 & 48 | (0x100000 & var3_2) >> 14);
                                                                                                                                            ** GOTO lbl124
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    case 67: {
                                                                                                                                        var9_14 = var3_2 & 255;
                                                                                                                                        if (var9_14 != 0) ** GOTO lbl292
                                                                                                                                        var4_15 = (0x100000 & var3_2) != 0 ? 83 : 67;
                                                                                                                                        var26_12.append((char)var4_15);
                                                                                                                                        var26_12.append("PSR_");
                                                                                                                                        if ((var3_2 & 2048) != 0) {
                                                                                                                                            var26_12.append('f');
                                                                                                                                        }
                                                                                                                                        if ((var3_2 & 1024) != 0) {
                                                                                                                                            var26_12.append('s');
                                                                                                                                        }
                                                                                                                                        if ((var3_2 & 512) != 0) {
                                                                                                                                            var26_12.append('x');
                                                                                                                                        }
                                                                                                                                        if ((var3_2 & 256) == 0) ** GOTO lbl124
                                                                                                                                        var4_15 = 99;
                                                                                                                                        ** continue;
lbl292:
                                                                                                                                        // 1 sources

                                                                                                                                        if ((var3_2 & 32) != 32) ** continue;
                                                                                                                                        var9_14 = (var3_2 & 3840) >> 8;
                                                                                                                                        ** continue;
                                                                                                                                    }
                                                                                                                                    case 66: {
                                                                                                                                        var9_14 = (var3_2 & 0x4000000) >> 26;
                                                                                                                                        var19_20 = 1 - var9_14 << 24;
                                                                                                                                        var19_20 = var21_21 = ((long)(1 - ((var3_2 & 8192) >> 13 ^ var9_14) << 23) | var19_20 | (long)(1 - (var9_14 ^ (var3_2 & 2048) >> 11) << 22) | (long)((0x3FF0000 & var3_2) >> 4) | (long)((var3_2 & 2047) << 1)) - 0x1000000L + (4L + var1_1);
                                                                                                                                        if ((var3_2 & 4096) == 0) {
                                                                                                                                            var19_20 = var21_21 & -3L;
                                                                                                                                        }
                                                                                                                                        n.r(var26_12, var1_1, var19_20 - var1_1);
                                                                                                                                        ** continue;
                                                                                                                                    }
                                                                                                                                    case 65: {
                                                                                                                                        var9_14 = var3_2 & 255;
                                                                                                                                        var26_12.append('[');
                                                                                                                                        var26_12.append(n.e[(var3_2 & 983040) >> 16]);
                                                                                                                                        if (!var15_11) ** GOTO lbl330
                                                                                                                                        if (var9_14 == 0 && !var14_9) {
                                                                                                                                            var9_14 = var8_13;
                                                                                                                                        } else {
                                                                                                                                            var26_12.append(", #");
                                                                                                                                            var4_15 = var14_9 != false ? 45 : 43;
                                                                                                                                            var26_12.append((char)var4_15);
                                                                                                                                            var8_13 = var9_14 * 4;
                                                                                                                                            var26_12.append(var8_13);
                                                                                                                                            var9_14 = var8_13 != 0 && var14_9 == false ? 1 : -1;
                                                                                                                                        }
                                                                                                                                        var26_12.append(']');
                                                                                                                                        var8_13 = var9_14;
                                                                                                                                        if (!var13_7) ** GOTO lbl176
                                                                                                                                        var26_12.append('!');
                                                                                                                                        var8_13 = var9_14;
                                                                                                                                        break;
lbl330:
                                                                                                                                        // 1 sources

                                                                                                                                        var26_12.append("], ");
                                                                                                                                        if (var13_7) {
                                                                                                                                            var26_12.append('#');
                                                                                                                                            var4_15 = var14_9 != false ? 45 : 43;
                                                                                                                                            var26_12.append((char)var4_15);
                                                                                                                                            var8_13 = var9_14 * 4;
                                                                                                                                            var26_12.append(var8_13);
                                                                                                                                            if (var8_13 != 0 && !var14_9) {
                                                                                                                                                var8_13 = 1;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            var8_13 = -1;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        var26_12.append('{');
                                                                                                                                        var26_12.append(var9_14);
                                                                                                                                        var26_12.append('}');
                                                                                                                                        var8_13 = var9_14;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                ** continue;
                                                                                                                            }
                                                                                                                            case 48: 
                                                                                                                            case 49: 
                                                                                                                            case 50: 
                                                                                                                            case 51: 
                                                                                                                            case 52: 
                                                                                                                            case 53: 
                                                                                                                            case 54: 
                                                                                                                            case 55: 
                                                                                                                            case 56: 
                                                                                                                            case 57: {
                                                                                                                                var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                                                                                var11_17 = var6_4;
                                                                                                                                var9_14 = n.j((String)var24_22 /* !! */ , var11_17, var10_16, var3_2, (n)var0);
                                                                                                                                var10_16 = n.a((n)var0);
                                                                                                                                var18_19 = n.c((n)var0);
                                                                                                                                var4_15 = n.g((String)var24_22 /* !! */ , var11_17, var9_14);
                                                                                                                                if (var4_15 == 39) break block102;
                                                                                                                                if (var4_15 == 63) break block103;
                                                                                                                                if (var4_15 == 87) break block104;
                                                                                                                                if (var4_15 == 96) break block105;
                                                                                                                                if (var4_15 == 114) break block106;
                                                                                                                                if (var4_15 == 120) ** GOTO lbl404
                                                                                                                                if (var4_15 == 82) ** GOTO lbl401
                                                                                                                                if (var4_15 == 83) ** GOTO lbl399
                                                                                                                                if (var4_15 == 99) ** GOTO lbl397
                                                                                                                                if (var4_15 != 100) ** GOTO lbl377
                                                                                                                                var26_12.append(var10_16);
                                                                                                                                var8_13 = var5_5;
                                                                                                                                var8_13 = var10_16;
                                                                                                                                ** GOTO lbl181
lbl377:
                                                                                                                                // 1 sources

                                                                                                                                var0 = new StringBuilder();
                                                                                                                                var0.append("120 Invalid format char '");
                                                                                                                                var0.append((char)var4_15);
                                                                                                                                var0.append("'; ");
                                                                                                                                var0.append(var5_5);
                                                                                                                                var0.append("; ");
                                                                                                                                var0.append(var9_14);
                                                                                                                                var0.append("; '");
                                                                                                                                var0.append((String)var24_22 /* !! */ );
                                                                                                                                var0.append("'");
                                                                                                                                throw new RuntimeException(var0.toString());
lbl397:
                                                                                                                                // 1 sources

                                                                                                                                var24_22 /* !! */  = n.d[var10_16];
                                                                                                                                break block107;
lbl399:
                                                                                                                                // 1 sources

                                                                                                                                if (var10_16 == 13) {
                                                                                                                                    var7_6 = 1;
                                                                                                                                }
lbl401:
                                                                                                                                // 4 sources

                                                                                                                                if (var10_16 != 15) break block106;
                                                                                                                                var7_6 = 1;
                                                                                                                                break block106;
lbl404:
                                                                                                                                // 1 sources

                                                                                                                                var26_12.append("0x");
                                                                                                                                var24_22 /* !! */  = Integer.toHexString(var10_16).toUpperCase(Locale.US);
                                                                                                                                break block107;
                                                                                                                            }
                                                                                                                        }
lbl408:
                                                                                                                        // 22 sources

                                                                                                                        while (true) {
                                                                                                                            var7_6 = var5_5;
                                                                                                                            var7_6 = var6_4;
                                                                                                                            var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                                                                            var7_6 = var11_17;
                                                                                                                            ** GOTO lbl181
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var24_22 /* !! */  = n.e[var10_16];
                                                                                                                }
                                                                                                                var10_16 = var5_5;
                                                                                                                var26_12.append((String)var24_22 /* !! */ );
                                                                                                                var11_17 = var7_6;
                                                                                                                ** GOTO lbl408
                                                                                                            }
                                                                                                            var12_18 = var5_5;
                                                                                                            var12_18 = var9_14 + 1;
                                                                                                            var4_15 = n.g((String)var24_22 /* !! */ , var11_17, var12_18);
                                                                                                            var9_14 = var12_18;
                                                                                                            var11_17 = var7_6;
                                                                                                            if (var10_16 != 0) ** GOTO lbl408
                                                                                                            n.d(var26_12, (char)var4_15);
                                                                                                            var9_14 = var12_18;
                                                                                                            var11_17 = var7_6;
                                                                                                            ** GOTO lbl408
                                                                                                        }
                                                                                                        var8_13 = var10_16 * 4;
lbl435:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            var10_16 = var5_5;
                                                                                                            var10_16 = var6_4;
                                                                                                            var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                                                            var26_12.append(var8_13);
                                                                                                            ** continue;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var12_18 = var5_5;
                                                                                                    n.d(var26_12, n.g((String)var24_22 /* !! */ , var11_17, (var9_14 += 1 << var18_19) - var10_16));
                                                                                                    n.g((String)var24_22 /* !! */ , var11_17, var9_14);
                                                                                                    var11_17 = var7_6;
                                                                                                    ** GOTO lbl408
                                                                                                }
                                                                                                var12_18 = var5_5;
                                                                                                var12_18 = var9_14 + 1;
                                                                                                var4_15 = n.g((String)var24_22 /* !! */ , var11_17, var12_18);
                                                                                                var9_14 = var12_18;
                                                                                                var11_17 = var7_6;
                                                                                                if (var10_16 != (1 << var18_19) - 1) ** GOTO lbl408
                                                                                                n.d(var26_12, (char)var4_15);
                                                                                                var9_14 = var12_18;
                                                                                                var11_17 = var7_6;
                                                                                                ** GOTO lbl408
                                                                                            }
                                                                                            var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                                            var9_14 = var5_5;
                                                                                            var9_14 = var6_4;
                                                                                            var12_18 = var16_10 != 0 ? 1 : 0;
                                                                                            var9_14 = (0x600000 & var3_2) >> 21;
                                                                                            if (var9_14 == 0) break block108;
                                                                                            if (var9_14 == 1) break block109;
                                                                                            if (var9_14 == 2) break block110;
                                                                                            if (var9_14 == 3) break block111;
                                                                                            var9_14 = var10_16;
                                                                                            var11_17 = var7_6;
                                                                                            ** GOTO lbl408
                                                                                        }
lbl474:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            var24_22 /* !! */  = "??";
                                                                                            break block93;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var9_14 = var10_16;
                                                                                    var11_17 = var7_6;
                                                                                    if (var12_18 == 0) ** GOTO lbl408
                                                                                    ** continue;
                                                                                }
                                                                                if (var12_18 != 0) {
                                                                                    var26_12.append('s');
                                                                                }
                                                                                var4_15 = 104;
                                                                                break block112;
                                                                            }
                                                                            if (var12_18 != 0) {
                                                                                var26_12.append('s');
                                                                            }
                                                                            var4_15 = 98;
                                                                            break block112;
                                                                        }
                                                                        var8_13 = (var3_2 & 983040) >> 4 | var3_2 & 4095;
                                                                        var26_12.append('#');
                                                                        var9_14 = var10_16;
                                                                        ** continue;
                                                                    }
                                                                    var24_22 /* !! */  = var23_3 /* !! */ ;
                                                                    var9_14 = var5_5;
                                                                    var9_14 = var6_4;
                                                                    if ((var3_2 & 240) != 96) break block113;
                                                                    var9_14 = var3_2 & 15;
                                                                    if (var9_14 == 15) break block114;
                                                                    var26_12.append('#');
                                                                    var26_12.append(var9_14);
                                                                    var9_14 = var10_16;
                                                                    var11_17 = var7_6;
                                                                    ** GOTO lbl408
                                                                }
                                                                var24_22 /* !! */  = "sy";
                                                            }
lbl517:
                                                            // 2 sources

                                                            while (true) {
                                                                var9_14 = var5_5;
                                                                var9_14 = var6_4;
                                                                var25_24 = var23_3 /* !! */ ;
                                                                var26_12.append((String)var24_22 /* !! */ );
                                                                var9_14 = var10_16;
                                                                var11_17 = var7_6;
                                                                ** GOTO lbl408
                                                                break;
                                                            }
                                                        }
                                                        n.i(var26_12, var3_2 & 15);
                                                        var9_14 = var10_16;
                                                        var11_17 = var7_6;
                                                        ** GOTO lbl408
                                                    }
                                                    var24_22 /* !! */  = var23_3 /* !! */ ;
                                                    var9_14 = var5_5;
                                                    var9_14 = var6_4;
                                                    var9_14 = (var3_2 & 48) >> 4;
                                                    var12_18 = (var3_2 & 192) >> 6 | (var3_2 & 28672) >> 10;
                                                    var26_12.append(n.e[var3_2 & 15]);
                                                    if (var9_14 == 0) break block115;
                                                    if (var9_14 == 1) break block116;
                                                    if (var9_14 == 2) break block117;
                                                    if (var9_14 == 3) break block118;
                                                    var9_14 = var10_16;
                                                    var11_17 = var7_6;
                                                    ** GOTO lbl408
                                                }
                                                if (var12_18 == 0) {
                                                    var24_22 /* !! */  = ", RRX";
                                                    ** continue;
                                                }
                                                var24_22 /* !! */  = ", ROR #";
                                                var9_14 = var12_18;
lbl552:
                                                // 4 sources

                                                while (true) {
                                                    var26_12.append((String)var24_22 /* !! */ );
                                                    var26_12.append(var9_14);
                                                    var9_14 = var10_16;
                                                    var11_17 = var7_6;
                                                    ** GOTO lbl408
                                                    break;
                                                }
                                            }
                                            var9_14 = var12_18;
                                            if (var12_18 == 0) {
                                                var9_14 = 32;
                                            }
                                            var24_22 /* !! */  = ", ASR #";
                                            ** GOTO lbl552
                                        }
                                        var9_14 = var12_18;
                                        if (var12_18 == 0) {
                                            var9_14 = 32;
                                        }
                                        var24_22 /* !! */  = ", LSR #";
                                        ** GOTO lbl552
                                    }
                                    var9_14 = var10_16;
                                    var11_17 = var7_6;
                                    if (var12_18 <= 0) ** GOTO lbl408
                                    var24_22 /* !! */  = ", LSL #";
                                    var9_14 = var12_18;
                                    ** continue;
                                }
                                var24_22 /* !! */  = var23_3 /* !! */ ;
                                var9_14 = var5_5;
                                var9_14 = var6_4;
                                var12_18 = (var3_2 & 48) >> 4;
                                var9_14 = var10_16;
                                var11_17 = var7_6;
                                if (var12_18 == 0) ** GOTO lbl408
                                var26_12.append(", ROR #");
                                var9_14 = var12_18 * 8;
lbl590:
                                // 2 sources

                                while (true) {
                                    var11_17 = var5_5;
                                    var11_17 = var6_4;
                                    var24_22 /* !! */  = var23_3 /* !! */ ;
                                    var26_12.append(var9_14);
                                    var9_14 = var10_16;
                                    var11_17 = var7_6;
                                    ** GOTO lbl408
                                    break;
                                }
                            }
                            var24_22 /* !! */  = var23_3 /* !! */ ;
                            var9_14 = var5_5;
                            var9_14 = var6_4;
                            var12_18 = (var3_2 & 192) >> 6 | (var3_2 & 28672) >> 10;
                            if (var13_7) {
                                var24_22 /* !! */  = ", ASR #";
lbl606:
                                // 2 sources

                                while (true) {
                                    var26_12.append((String)var24_22 /* !! */ );
                                    var9_14 = var12_18;
                                    ** continue;
                                    break;
                                }
                            }
                            var9_14 = var10_16;
                            var11_17 = var7_6;
                            if (var12_18 == 0) ** GOTO lbl408
                            var24_22 /* !! */  = ", LSL #";
                            ** continue;
                        }
                        var26_12.append('{');
                        var11_17 = 0;
                        for (var9_14 = 0; var9_14 < 16; ++var9_14) {
                            var12_18 = var11_17;
                            if ((var3_2 & 1 << var9_14) != 0) {
                                if (var9_14 >= 2 && var9_14 <= 12 && (1 << var9_14 - 2 & var3_2) != 0 && (var3_2 & 1 << (var12_18 = var9_14 - 1)) != 0) {
                                    var26_12.setLength(var26_12.length() - 1 - n.e[var12_18].length());
                                    var4_15 = 45;
lbl626:
                                    // 2 sources

                                    while (true) {
                                        var26_12.append((char)var4_15);
                                        break;
                                    }
                                } else if (var11_17 != 0) {
                                    var4_15 = 44;
                                    ** continue;
                                }
                                var26_12.append(n.e[var9_14]);
                                var12_18 = 1;
                            }
                            var11_17 = var12_18;
                        }
                        var4_15 = 125;
                    }
                    var9_14 = var5_5;
                    var9_14 = var6_4;
                    var24_22 /* !! */  = var23_3 /* !! */ ;
                    var26_12.append((char)var4_15);
                    var9_14 = var10_16;
                    var11_17 = var7_6;
                    ** GOTO lbl408
                }
                var24_22 /* !! */  = var23_3 /* !! */ ;
                var9_14 = var5_5;
                var9_14 = var6_4;
                var26_12.append('%');
                var9_14 = var10_16;
                var11_17 = var7_6;
                ** continue;
            }
            if (var8_13 > 32 || var8_13 < -16) {
                var26_12.append("\t ; 0x");
                var26_12.append(Integer.toHexString(var8_13).toUpperCase(Locale.US));
            }
            if (var7_6 != 0) {
                var26_12.append("\t ; <UNPREDICTABLE>");
            }
            return var26_12.toString();
        }
        var24_23 = new StringBuilder();
        var24_23.append("200 No Thumb32 match for ");
        var0 = Integer.toHexString(var3_2);
        var23_3 /* !! */  = Locale.US;
        var24_23.append(var0.toUpperCase((Locale)var23_3 /* !! */ ));
        var24_23.append("; ");
        var24_23.append(Integer.toHexString(Integer.reverseBytes(var3_2)).toUpperCase((Locale)var23_3 /* !! */ ));
        throw new RuntimeException(var24_23.toString());
    }

    static String b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        switch (n2) {
                            default: {
                                switch (n2) {
                                    default: {
                                        return "<unknown>";
                                    }
                                    case 20: {
                                        return "CONTROL";
                                    }
                                    case 19: {
                                        return "FAULTMASK";
                                    }
                                    case 18: {
                                        return "BASEPRI_MAX";
                                    }
                                    case 17: {
                                        return "BASEPRI";
                                    }
                                    case 16: 
                                }
                                return "PRIMASK";
                            }
                            case 9: {
                                return "PSP";
                            }
                            case 8: {
                                return "MSP";
                            }
                            case 7: {
                                return "IEPSR";
                            }
                            case 6: {
                                return "EPSR";
                            }
                            case 5: 
                        }
                        return "IPSR";
                    }
                    return "PSR";
                }
                return "EAPSR";
            }
            return "IAPSR";
        }
        return "APSR";
    }

    private static long[] $d2j$hex$f674bbf9$decode_J(String src) {
        byte[] d2 = n.h.$d2j$hex$f674bbf9$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s.get(data);
        return data;
    }

    private static int[] $d2j$hex$f674bbf9$decode_I(String src) {
        byte[] d2 = n.h.$d2j$hex$f674bbf9$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s.get(data);
        return data;
    }

    private static short[] $d2j$hex$f674bbf9$decode_S(String src) {
        byte[] d2 = n.h.$d2j$hex$f674bbf9$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s.get(data);
        return data;
    }

    private static byte[] $d2j$hex$f674bbf9$decode_B(String src) {
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
