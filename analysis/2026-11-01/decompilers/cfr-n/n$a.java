/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.ext.t2
 */
package android.ext;

import android.ext.n;
import android.ext.t2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Locale;

static abstract class n.a {
    static final int[] a = n.a.$d2j$hex$8c161d8b$decode_I("0000a0e1fffffffff000f0e7f000f0ff10ff2f01f0ffff0f90000000f000e00f90002000f000e00f90000001f00fb00f90008000f000a00f9000a000f000a00f05f02003ffffff0f700000e1f000f0ff400000e1f00ff0ff400020e1f00ff0ff400040e1f00ff0ff400200e1f00ff0ff400220e1f00ff0ff400240e1f00ff0ff6e006001ffffff0f70004001f000f00f10f01007f0f0f00f10f03007f0f0f00f00f010f400f070fc00f050f400f070fdf0f02003f0ffff0f51f07ff5f3ffffff41f07ff5f3ffffff50f07ff5f0ffffff40f07ff5f0ffffff60f07ff5f0ffffff1f00c0077f00e00f1000c0077000e00f90006000f000f00fb0002000f000300f90003000f000300f900030009000300f000000030000f00f000040030000f00f300fff06f00fff0f5000a0077000a00f70006001f000f00f1ff07ff5ffffffff9f0fd001ff0ff00f9f0fb001ff0ff00f9f0ff001ff0ff00f900fc001f00ff00f900fa001f00ff00f900fe001f00ff00f01f02003ffffff0f02f02003ffffff0f03f02003ffffff0f04f02003ffffff0f00f0200300ffff0f000008f13ffeffff00000af120feffff00000cf13ffeffff00000ef120feffff000000f120fef1ff10008006f00ff00f100080067000f00f50008006f00ff00f500080067000f00f9f0f9001ff0ff00f100f2006f00ff00f900f2006f00ff00f300f2006f00ff00f700f2006f00ff00ff00f2006f00ff00f500f2006f00ff00f100f1006f00ff00f900f1006f00ff00f300f1006f00ff00f100f3006f00ff00f900f3006f00ff00f300f3006f00ff00f700f3006f00ff00ff00f3006f00ff00f500f3006f00ff00f700f1006f00ff00ff00f1006f00ff00f500f1006f00ff00f100f5006f00ff00f900f5006f00ff00f300f5006f00ff00f100f7006f00ff00f900f7006f00ff00f300f7006f00ff00f700f7006f00ff00ff00f7006f00ff00f500f7006f00ff00f100f6006f00ff00f900f6006f00ff00f300f6006f00ff00f700f6006f00ff00ff00f6006f00ff00f500f6006f00ff00f700f5006f00ff00ff00f5006f00ff00f500f5006f00ff00f300fbf06f00fff0fb00fbf06f00fff0fb00fff06f00fff0f000a10f8ffff50fe7000bf06f00fff0f7004bf06f00fff0f7008bf06f00fff0f700cbf06f00fff0f70008f06f00fff0f70048f06f00fff0f70088f06f00fff0f700c8f06f00fff0f7000af06f00fff0f7004af06f00fff0f7008af06f00fff0f700caf06f00fff0f7000ff06f00fff0f7004ff06f00fff0f7008ff06f00fff0f700cff06f00fff0f7000cf06f00fff0f7004cf06f00fff0f7008cf06f00fff0f700ccf06f00fff0f7000ef06f00fff0f7004ef06f00fff0f7008ef06f00fff0f700cef06f00fff0f7000b006f00ff00f7004b006f00ff00f7008b006f00ff00f700cb006f00ff00f70008006f00ff00f70048006f00ff00f70088006f00ff00f700c8006f00ff00f7000a006f00ff00f7004a006f00ff00f7008a006f00ff00f700ca006f00ff00f7000f006f00ff00f7004f006f00ff00f7008f006f00ff00f700cf006f00ff00f7000c006f00ff00f7004c006f00ff00f7008c006f00ff00f700cc006f00ff00f7000e006f00ff00f7004e006f00ff00f7008e006f00ff00f700ce006f00ff00fb00f8006f00ff00f000001f100fcffff10f00007d0f0f00f50f00007d0f0f00f10000007d000f00f10004007d000f00f50000007d000f00f50004007d000f00f10f05007d0f0f00f10005007d000f00fd0005007d000f00f00054df8e0ff5ffe1000a006f00fe00f1000a0067000e00f5000a0067000e00f300fa006f00ff00f900f8001f00ff00f90004000f000f00f10f08007f0f0f00f10008007f000f00f1000e006f00fe00f1000e0067000e00f5000e0067000e00f300fe006f00ff00f20ff2f01f0ffff0f700020e1f000f0ff000000fa000000fe30ff2f01f0ffff0f100f6f01f00fff0fd0000000f000100ef0000000f000100e00f050f500f070fd80000001f000f00fa0000001f000f00fc0000001f000f00fe0000001f000f00f80002001f000f00fc0002001f000f00f80004001f000f00fa0004001f000f00fc0004001f000f00fe0004001f000f00f80006001f0f0f00fa0006001f0f0f00fc0006001f0f0f00fe0006001f0f0f00fa0002001f0f0f00fe0002001f0f0f00f50000001f00ff00f50004001f00ff00f50002001f00ff00f50006001f00ff00f04002d05ff0fff0f000040040000500e000000040000500e00004006f00f500e00000006f00f500e000040041000500c000000041000500c000040040000500e000040061000500eb0004000f000500eb0000000f00f500e90005000f000500e900050009000500e90001000f00f500e90001000900f500e000000020000e00f000000001000e00f100000009000e00f000020020000e00f000020001000e00f100020009000e00f000040020000e00f000040001000e00f100040009000e00f000060020000e00f000060001000e00f100060009000e00f000080020000e00f000080001000e00f100080009000e00f0000a0020000e00f0000a0001000e00f1000a0009000e00f0000c0020000e00f0000c0001000e00f1000c0009000e00f0000e0020000e00f0000e0001000e00f1000e0009000e00f00f2200100f2b00f00f0200100f0b00d00000001ff0cb00f000010030000f00f000010011000f00f100010019000f00f000030030000f00f000030011000f00f100030019000f00f000050030000f00f000050011000f00f100050019000f00f000070030000f00f000070011000f00f100070019000f00f000080030000e00f000080011000e00f100080019000e00f0000a0030000ef0f0000a001f00fef0d0000a0016000ef0d2000a0016000ef0d4000a0016000ef0d6000a001f00fef0d6000a0016000ef0d0000c0030000e00f0000c0011000e00f1000c0019000e00f0000e0030000e00f0000e0011000e00f1000e0019000e00f100000061000000e04009d04ff0fff0f000050040000500c000030040000700d000010040000500c01002d09ffffff0f02002d09ffffff0f04002d09ffffff0f08002d09ffffff0f10002d09ffffff0f20002d09ffffff0f40002d09ffffff0f80002d09ffffff0f00012d09ffffff0f00022d09ffffff0f00042d09ffffff0f00082d09ffffff0f00102d09ffffff0f00202d09ffffff0f00402d09ffffff0f00802d09ffffff0f00002d090000ff0f000080080000f00f000000080000100e0100bd08ffffff0f0200bd08ffffff0f0400bd08ffffff0f0800bd08ffffff0f1000bd08ffffff0f2000bd08ffffff0f4000bd08ffffff0f8000bd08ffffff0f0001bd08ffffff0f0002bd08ffffff0f0004bd08ffffff0f0008bd08ffffff0f0010bd08ffffff0f0020bd08ffffff0f0040bd08ffffff0f0080bd08ffffff0f0000bd080000ff0f000090080000900f000010080000100e0000000a0000000e0000000f0000000f0000000000000000");
    static final String[] b = new String[]{"NOP\t ; (MOV R0, R0)", "UDF#%e", "BX%c\t %0-3r", "MUL%20'S%c\t %16-19R, %0-3R, %8-11R", "MLA%20'S%c\t %16-19R, %0-3R, %8-11R, %12-15R", "SWP%22'B%c\t %12-15RU, %0-3Ru, [%16-19RuU]", "%22?SUMULL%20'S%c\t %12-15Ru, %16-19Ru, %0-3R, %8-11R", "%22?SUMLAL%20'S%c\t %12-15Ru, %16-19Ru, %0-3R, %8-11R", "SEVL", "HLT0x%16-19X%12-15X%8-11X%0-3X", "CRC32B%12-15R, %16-19R, %0-3R", "CRC32H%12-15R, %16-19R, %0-3R", "CRC32W%12-15R, %16-19R, %0-3R", "CRC32CB%12-15R, %16-19R, %0-3R", "CRC32CH%12-15R, %16-19R, %0-3R", "CRC32CW%12-15R, %16-19R, %0-3R", "ERET%c", "HVC%c\t %e", "SDIV%c\t %16-19r, %0-3r, %8-11r", "UDIV%c\t %16-19r, %0-3r, %8-11r", "PLDW\t %a", "PLI\t %P", "DBG%c\t #%0-3d", "DMB\t %U", "DSB\t %U", "DMB\t %U", "DSB\t %U", "ISB\t %U", "BFC%c\t %12-15R, %E", "BFI%c\t %12-15R, %0-3r, %E", "MLS%c\t %16-19R, %0-3R, %8-11R, %12-15R", "STRHT%c\t %12-15R, %S", "\t \t ; <UNDEFINED> instruction: %0-31x", "LDR%6'S%5?HBT%c\t %12-15R, %S", "MOVW%c\t %12-15R, %V", "MOVT%c\t %12-15R, %V", "RBIT%c\t %12-15R, %0-3R", "%22?USBFX%c\t %12-15r, %0-3r, #%7-11d, #%16-20W", "SMC%c\t %e", "CLREX", "LDREXB%c\t %12-15R, [%16-19R]", "LDREXD%c\t %12-15r, [%16-19R]", "LDREXH%c\t %12-15R, [%16-19R]", "STREXB%c\t %12-15R, %0-3R, [%16-19R]", "STREXD%c\t %12-15R, %0-3r, [%16-19R]", "STREXH%c\t %12-15R, %0-3R, [%16-19R]", "YIELD%c", "WFE%c", "WFI%c", "SEV%c", "NOP%c\t {%0-7d}", "CPSIE%8'A%7'I%6'F", "CPSIE%8'A%7'I%6'F,#%0-4d", "CPSID%8'A%7'I%6'F", "CPSID%8'A%7'I%6'F,#%0-4d", "CPS#%0-4d", "PKHBT%c\t %12-15R, %16-19R, %0-3R", "PKHBT%c\t %12-15R, %16-19R, %0-3R, LSL #%7-11d", "PKHTB%c\t %12-15R, %16-19R, %0-3R, ASR #32", "PKHTB%c\t %12-15R, %16-19R, %0-3R, ASR #%7-11d", "LDREX%c\t r%12-15d, [%16-19R]", "QADD16%c\t %12-15R, %16-19R, %0-3R", "QADD8%c\t %12-15R, %16-19R, %0-3R", "QASX%c\t %12-15R, %16-19R, %0-3R", "QSUB16%c\t %12-15R, %16-19R, %0-3R", "QSUB8%c\t %12-15R, %16-19R, %0-3R", "QSAX%c\t %12-15R, %16-19R, %0-3R", "SADD16%c\t %12-15R, %16-19R, %0-3R", "SADD8%c\t %12-15R, %16-19R, %0-3R", "SASX%c\t %12-15R, %16-19R, %0-3R", "SHADD16%c\t %12-15R, %16-19R, %0-3R", "SHADD8%c\t %12-15R, %16-19R, %0-3R", "SHASX%c\t %12-15R, %16-19R, %0-3R", "SHSUB16%c\t %12-15R, %16-19R, %0-3R", "SHSUB8%c\t %12-15R, %16-19R, %0-3R", "SHSAX%c\t %12-15R, %16-19R, %0-3R", "SSUB16%c\t %12-15R, %16-19R, %0-3R", "SSUB8%c\t %12-15R, %16-19R, %0-3R", "SSAX%c\t %12-15R, %16-19R, %0-3R", "UADD16%c\t %12-15R, %16-19R, %0-3R", "UADD8%c\t %12-15R, %16-19R, %0-3R", "UASX%c\t %12-15R, %16-19R, %0-3R", "UHADD16%c\t %12-15R, %16-19R, %0-3R", "UHADD8%c\t %12-15R, %16-19R, %0-3R", "UHASX%c\t %12-15R, %16-19R, %0-3R", "UHSUB16%c\t %12-15R, %16-19R, %0-3R", "UHSUB8%c\t %12-15R, %16-19R, %0-3R", "UHSAX%c\t %12-15R, %16-19R, %0-3R", "UQADD16%c\t %12-15R, %16-19R, %0-3R", "UQADD8%c\t %12-15R, %16-19R, %0-3R", "UQASX%c\t %12-15R, %16-19R, %0-3R", "UQSUB16%c\t %12-15R, %16-19R, %0-3R", "UQSUB8%c\t %12-15R, %16-19R, %0-3R", "UQSAX%c\t %12-15R, %16-19R, %0-3R", "USUB16%c\t %12-15R, %16-19R, %0-3R", "USUB8%c\t %12-15R, %16-19R, %0-3R", "USAX%c\t %12-15R, %16-19R, %0-3R", "REV%c\t %12-15R, %0-3R", "REV16%c\t %12-15R, %0-3R", "REVSH%c\t %12-15R, %0-3R", "RFE%23?ID%24?BA\t %16-19r%21'!", "SXTH%c\t %12-15R, %0-3R", "SXTH%c\t %12-15R, %0-3R, ROR #8", "SXTH%c\t %12-15R, %0-3R, ROR #16", "SXTH%c\t %12-15R, %0-3R, ROR #24", "SXTB16%c\t %12-15R, %0-3R", "SXTB16%c\t %12-15R, %0-3R, ROR #8", "SXTB16%c\t %12-15R, %0-3R, ROR #16", "SXTB16%c\t %12-15R, %0-3R, ROR #24", "SXTB%c\t %12-15R, %0-3R", "SXTB%c\t %12-15R, %0-3R, ROR #8", "SXTB%c\t %12-15R, %0-3R, ROR #16", "SXTB%c\t %12-15R, %0-3R, ROR #24", "UXTH%c\t %12-15R, %0-3R", "UXTH%c\t %12-15R, %0-3R, ROR #8", "UXTH%c\t %12-15R, %0-3R, ROR #16", "UXTH%c\t %12-15R, %0-3R, ROR #24", "UXTB16%c\t %12-15R, %0-3R", "UXTB16%c\t %12-15R, %0-3R, ROR #8", "UXTB16%c\t %12-15R, %0-3R, ROR #16", "UXTB16%c\t %12-15R, %0-3R, ROR #24", "UXTB%c\t %12-15R, %0-3R", "UXTB%c\t %12-15R, %0-3R, ROR #8", "UXTB%c\t %12-15R, %0-3R, ROR #16", "UXTB%c\t %12-15R, %0-3R, ROR #24", "SXTAH%c\t %12-15R, %16-19r, %0-3R", "SXTAH%c\t %12-15R, %16-19r, %0-3R, ROR #8", "SXTAH%c\t %12-15R, %16-19r, %0-3R, ROR #16", "SXTAH%c\t %12-15R, %16-19r, %0-3R, ROR #24", "SXTAB16%c\t %12-15R, %16-19r, %0-3R", "SXTAB16%c\t %12-15R, %16-19r, %0-3R, ROR #8", "SXTAB16%c\t %12-15R, %16-19r, %0-3R, ROR #16", "SXTAB16%c\t %12-15R, %16-19r, %0-3R, ROR #24", "SXTAB%c\t %12-15R, %16-19r, %0-3R", "SXTAB%c\t %12-15R, %16-19r, %0-3R, ROR #8", "SXTAB%c\t %12-15R, %16-19r, %0-3R, ROR #16", "SXTAB%c\t %12-15R, %16-19r, %0-3R, ROR #24", "UXTAH%c\t %12-15R, %16-19r, %0-3R", "UXTAH%c\t %12-15R, %16-19r, %0-3R, ROR #8", "UXTAH%c\t %12-15R, %16-19r, %0-3R, ROR #16", "UXTAH%c\t %12-15R, %16-19r, %0-3R, ROR #24", "UXTAB16%c\t %12-15R, %16-19r, %0-3R", "UXTAB16%c\t %12-15R, %16-19r, %0-3R, ROR #8", "UXTAB16%c\t %12-15R, %16-19r, %0-3R, ROR #16", "UXTAB16%c\t %12-15R, %16-19r, %0-3R, ROR #24", "UXTAB%c\t %12-15R, %16-19r, %0-3R", "UXTAB%c\t %12-15R, %16-19r, %0-3R, ROR #8", "UXTAB%c\t %12-15R, %16-19r, %0-3R, ROR #16", "UXTAB%c\t %12-15R, %16-19r, %0-3R, ROR #24", "SEL%c\t %12-15R, %16-19R, %0-3R", "SETEND%9?BLE", "SMUAD%5'X%c\t %16-19R, %0-3R, %8-11R", "SMUSD%5'X%c\t %16-19R, %0-3R, %8-11R", "SMLAD%5'X%c\t %16-19R, %0-3R, %8-11R, %12-15R", "SMLALD%5'X%c\t %12-15Ru, %16-19Ru, %0-3R, %8-11R", "SMLSD%5'X%c\t %16-19R, %0-3R, %8-11R, %12-15R", "SMLSLD%5'X%c\t %12-15Ru, %16-19Ru, %0-3R, %8-11R", "SMMUL%5'R%c\t %16-19R, %0-3R, %8-11R", "SMMLA%5'R%c\t %16-19R, %0-3R, %8-11R, %12-15R", "SMMLS%5'R%c\t %16-19R, %0-3R, %8-11R, %12-15R", "SRS%23?ID%24?BA\t %16-19r%21'!, #%0-4d", "SSAT%c\t %12-15R, #%16-20W, %0-3R", "SSAT%c\t %12-15R, #%16-20W, %0-3R, LSL #%7-11d", "SSAT%c\t %12-15R, #%16-20W, %0-3R, ASR #%7-11d", "SSAT16%c\t %12-15r, #%16-19W, %0-3r", "STREX%c\t %12-15R, %0-3R, [%16-19R]", "UMAAL%c\t %12-15R, %16-19R, %0-3R, %8-11R", "USAD8%c\t %16-19R, %0-3R, %8-11R", "USADA8%c\t %16-19R, %0-3R, %8-11R, %12-15R", "USAT%c\t %12-15R, #%16-20d, %0-3R", "USAT%c\t %12-15R, #%16-20d, %0-3R, LSL #%7-11d", "USAT%c\t %12-15R, #%16-20d, %0-3R, ASR #%7-11d", "USAT16%c\t %12-15R, #%16-19d, %0-3R", "BXJ%c\t %0-3R", "BKPT\t 0x%16-19X%12-15X%8-11X%0-3X", "BLX\t %B", "BLX%c\t %0-3R", "CLZ%c\t %12-15R, %0-3R", "LDRD%c\t %12-15r, %s", "STRD%c\t %12-15r, %s", "PLD%a", "SMLABB%c\t %16-19R, %0-3R, %8-11R, %12-15R", "SMLATB%c\t %16-19R, %0-3R, %8-11R, %12-15R", "SMLABT%c\t %16-19R, %0-3R, %8-11R, %12-15R", "SMLATT%c\t %16-19r, %0-3r, %8-11R, %12-15R", "SMLAWB%c\t %16-19R, %0-3R, %8-11R, %12-15R", "SMLAWT%c\t %16-19R, %0-3r, %8-11R, %12-15R", "SMLALBB%c\t %12-15Ru, %16-19Ru, %0-3R, %8-11R", "SMLALTB%c\t %12-15Ru, %16-19Ru, %0-3R, %8-11R", "SMLALBT%c\t %12-15Ru, %16-19Ru, %0-3R, %8-11R", "SMLALTT%c\t %12-15Ru, %16-19Ru, %0-3R, %8-11R", "SMULBB%c\t %16-19R, %0-3R, %8-11R", "SMULTB%c\t %16-19R, %0-3R, %8-11R", "SMULBT%c\t %16-19R, %0-3R, %8-11R", "SMULTT%c\t %16-19R, %0-3R, %8-11R", "SMULWB%c\t %16-19R, %0-3R, %8-11R", "SMULWT%c\t %16-19R, %0-3R, %8-11R", "QADD%c\t %12-15R, %0-3R, %16-19R", "QDADD%c\t %12-15R, %0-3R, %16-19R", "QSUB%c\t %12-15R, %0-3R, %16-19R", "QDSUB%c\t %12-15R, %0-3R, %16-19R", "PUSH%c\t {%12-15r}\t \t ; (STR%c %12-15r, %a)", "STRB%t%c\t %12-15R, %a", "STR%t%c\t %12-15r, %a", "STRB%t%c\t %12-15R, %a", "STR%t%c\t %12-15r, %a", "STRB%t%c\t %12-15R, %a", "STR%t%c\t %12-15r, %a", "STRB%c\t %12-15R, %a", "STRB%c\t %12-15R, %a", "STRH%c\t %12-15R, %s", "STRH%c\t %12-15R, %s", "\t \t ; <UNDEFINED> instruction: %0-31x", "LDR%6'S%5?HB%c\t %12-15R, %s", "\t \t ; <UNDEFINED> instruction: %0-31x", "LDR%6'S%5?HB%c\t %12-15R, %s", "AND%20'S%c\t %12-15r, %16-19r, %o", "AND%20'S%c\t %12-15r, %16-19r, %o", "AND%20'S%c\t %12-15R, %16-19R, %o", "EOR%20'S%c\t %12-15r, %16-19r, %o", "EOR%20'S%c\t %12-15r, %16-19r, %o", "EOR%20'S%c\t %12-15R, %16-19R, %o", "SUB%20'S%c\t %12-15r, %16-19r, %o", "SUB%20'S%c\t %12-15r, %16-19r, %o", "SUB%20'S%c\t %12-15R, %16-19R, %o", "RSB%20'S%c\t %12-15r, %16-19r, %o", "RSB%20'S%c\t %12-15r, %16-19r, %o", "RSB%20'S%c\t %12-15R, %16-19R, %o", "ADD%20'S%c\t %12-15r, %16-19r, %o", "ADD%20'S%c\t %12-15r, %16-19r, %o", "ADD%20'S%c\t %12-15R, %16-19R, %o", "ADC%20'S%c\t %12-15r, %16-19r, %o", "ADC%20'S%c\t %12-15r, %16-19r, %o", "ADC%20'S%c\t %12-15R, %16-19R, %o", "SBC%20'S%c\t %12-15r, %16-19r, %o", "SBC%20'S%c\t %12-15r, %16-19r, %o", "SBC%20'S%c\t %12-15R, %16-19R, %o", "RSC%20'S%c\t %12-15r, %16-19r, %o", "RSC%20'S%c\t %12-15r, %16-19r, %o", "RSC%20'S%c\t %12-15R, %16-19R, %o", "MSR%c\t %C, %0-3r", "MSR%c\t %C, %o", "MRS%c\t %12-15R, %R", "TST%p%c\t %16-19r, %o", "TST%p%c\t %16-19r, %o", "TST%p%c\t %16-19R, %o", "TEQ%p%c\t %16-19r, %o", "TEQ%p%c\t %16-19r, %o", "TEQ%p%c\t %16-19R, %o", "CMP%p%c\t %16-19r, %o", "CMP%p%c\t %16-19r, %o", "CMP%p%c\t %16-19R, %o", "CMN%p%c\t %16-19r, %o", "CMN%p%c\t %16-19r, %o", "CMN%p%c\t %16-19R, %o", "ORR%20'S%c\t %12-15r, %16-19r, %o", "ORR%20'S%c\t %12-15r, %16-19r, %o", "ORR%20'S%c\t %12-15R, %16-19R, %o", "MOV%20'S%c\t %12-15r, %o", "MOV%20'S%c\t %12-15r, %0-3r", "LSL%20'S%c\t %12-15R, %q", "LSR%20'S%c\t %12-15R, %q", "ASR%20'S%c\t %12-15R, %q", "RRX%20'S%c\t %12-15r, %0-3r", "ROR%20'S%c\t %12-15R, %q", "BIC%20'S%c\t %12-15r, %16-19r, %o", "BIC%20'S%c\t %12-15r, %16-19r, %o", "BIC%20'S%c\t %12-15R, %16-19R, %o", "MVN%20'S%c\t %12-15r, %o", "MVN%20'S%c\t %12-15r, %o", "MVN%20'S%c\t %12-15R, %o", "\t \t ; <UNDEFINED> instruction: %0-31x", "POP%c\t {%12-15r}\t \t ; (LDR%c %12-15r, %a)", "LDRB%t%c\t %12-15R, %a", "LDRT%c\t %12-15R, %a", "LDR%c\t %12-15r, %a", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "STMFD%c\t %16-19R!, %m", "PUSH%c\t %m", "STM%c\t %16-19R%21'!, %m%22'^", "STM%23?ID%24?BA%c\t %16-19R%21'!, %m%22'^", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "LDMFD%c\t %16-19R!, %m", "POP%c\t %m", "LDM%c\t %16-19R%21'!, %m%22'^", "LDM%23?ID%24?BA%c\t %16-19R%21'!, %m%22'^", "B%24'L%c\t %b", "SVC%c\t %0-23x", "\t \t ; <UNDEFINED> instruction: %0-31x"};

    /*
     * Exception decompiling
     */
    static int a(n var0, long var1_1, String var3_2, int var4_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 315->324)] android.ext.n$f
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
    static String b(n var0, long var1_1, int var3_2) {
        var32_3 /* !! */  = n.c.b((n)var0, var1_1, var3_2, false);
        if (var32_3 /* !! */  != null) {
            return var32_3 /* !! */ ;
        }
        var32_3 /* !! */  = n.e.b((n)var0, var1_1, var3_2, false);
        if (var32_3 /* !! */  != null) {
            return var32_3 /* !! */ ;
        }
        var6_4 /* !! */  = n.a.b.length;
        for (var19_5 = 0; var19_5 < var6_4 /* !! */ ; ++var19_5) {
            var32_3 /* !! */  = (String[])n.a.a;
            var8_7 /* !! */  = var19_5 * 2;
            var7_6 = var32_3 /* !! */ [var8_7 /* !! */  + 1];
            if ((var3_2 & var7_6) != (var8_7 /* !! */  = (int)var32_3 /* !! */ [var8_7 /* !! */ ]) || (var3_2 & -268435456) == -268435456 && (var7_6 & -268435456) != -268435456 && (var7_6 != false || var8_7 /* !! */  != 0)) {
                continue;
            }
            var8_7 /* !! */  = (var3_2 & 0x200000) != 0 ? 1 : 0;
            var22_8 = 0x400000 & var3_2;
            var12_9 /* !! */  = var22_8 != 0 ? 1 : 0;
            var7_6 = (var3_2 & 0x800000) == 0 ? (Object)true : (Object)false;
            var23_10 = var3_2 & 0x1000000;
            var20_11 = var23_10 != 0;
            var33_12 = new StringBuilder();
            var34_14 = n.a.b[var19_5];
            var25_15 = var34_14.length();
            var26_16 = 0L;
            var13_17 /* !! */  = 0;
            var9_18 /* !! */  = 0;
            var11_19 = 0;
            var6_4 /* !! */  = 16;
            var10_20 /* !! */  = 16;
            var21_21 = var12_9 /* !! */ ;
            var24_22 /* !! */  = var8_7 /* !! */ ;
            block14: for (var12_9 /* !! */  = var13_17 /* !! */ ; var12_9 /* !! */  < var25_15; ++var12_9 /* !! */ ) {
                block83: {
                    block84: {
                        block85: {
                            block86: {
                                block87: {
                                    block88: {
                                        block89: {
                                            block90: {
                                                block91: {
                                                    block109: {
                                                        block107: {
                                                            block108: {
                                                                block106: {
                                                                    block92: {
                                                                        block93: {
                                                                            block94: {
                                                                                block95: {
                                                                                    block96: {
                                                                                        block97: {
                                                                                            block98: {
                                                                                                block105: {
                                                                                                    block100: {
                                                                                                        block99: {
                                                                                                            block101: {
                                                                                                                block102: {
                                                                                                                    block104: {
                                                                                                                        block103: {
                                                                                                                            var4_23 = n.g(var34_14, var25_15, var12_9 /* !! */ );
                                                                                                                            if (var4_23 != '%') {
                                                                                                                                n.d(var33_12, var4_23);
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            var8_7 /* !! */  = var12_9 /* !! */  + 1;
                                                                                                                            var5_24 = n.g(var34_14, var25_15, var8_7 /* !! */ );
                                                                                                                            if (var5_24 == '%') break block84;
                                                                                                                            if (var5_24 == 'E') break block85;
                                                                                                                            if (var5_24 == 'P') break block86;
                                                                                                                            if (var5_24 == 'e') break block87;
                                                                                                                            if (var5_24 == 'm') break block88;
                                                                                                                            if (var5_24 == 'B') break block89;
                                                                                                                            var4_23 = 'C';
                                                                                                                            if (var5_24 == 'C') break block90;
                                                                                                                            if (var5_24 == 'R') break block91;
                                                                                                                            if (var5_24 == 'S') break block92;
                                                                                                                            if (var5_24 == 'U') break block93;
                                                                                                                            if (var5_24 == 'V') break block94;
                                                                                                                            if (var5_24 == 's') break block95;
                                                                                                                            if (var5_24 == 't') break block96;
                                                                                                                            block0 : switch (var5_24) {
                                                                                                                                default: {
                                                                                                                                    block3 : switch (var5_24) {
                                                                                                                                        default: {
                                                                                                                                            switch (var5_24) {
                                                                                                                                                default: {
                                                                                                                                                    var0 = new StringBuilder();
                                                                                                                                                    var0.append("80 Invalid format char '");
                                                                                                                                                    var0.append(var5_24);
                                                                                                                                                    var0.append("'; ");
                                                                                                                                                    var0.append(var19_5);
                                                                                                                                                    var0.append("; ");
                                                                                                                                                    var0.append(var8_7 /* !! */ );
                                                                                                                                                    var0.append("; '");
                                                                                                                                                    var0.append(var34_14);
                                                                                                                                                    var0.append("'");
                                                                                                                                                    throw new RuntimeException(var0.toString());
                                                                                                                                                }
                                                                                                                                                case 'q': {
                                                                                                                                                    n.m(var33_12, var3_2, false);
                                                                                                                                                }
                                                                                                                                                case 'p': {
                                                                                                                                                    if ((61440 & var3_2) == 61440) {
                                                                                                                                                        var33_12.append('P');
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    break block83;
                                                                                                                                                }
                                                                                                                                                case 'o': {
                                                                                                                                                    if ((0x2000000 & var3_2) != 0) {
                                                                                                                                                        var16_27 /* !! */  = (var3_2 & 3840) >> 7;
                                                                                                                                                        var17_28 = var3_2 & 255;
                                                                                                                                                        var9_18 /* !! */  = var17_28 << 32 - var16_27 /* !! */  | var17_28 >> var16_27 /* !! */ ;
                                                                                                                                                        for (var14_25 = 0; var14_25 < 32 && (var9_18 /* !! */  << var14_25 | var9_18 /* !! */  >> 32 - var14_25) > 255; var14_25 += 2) {
                                                                                                                                                        }
                                                                                                                                                        var12_9 /* !! */  = (int)var7_6;
                                                                                                                                                        var33_12.append('#');
                                                                                                                                                        var7_6 = var9_18 /* !! */ ;
                                                                                                                                                        var15_26 = var8_7 /* !! */ ;
                                                                                                                                                        var13_17 /* !! */  = var12_9 /* !! */ ;
                                                                                                                                                        if (var14_25 == var16_27 /* !! */ ) break block0;
                                                                                                                                                        var33_12.append(var17_28);
                                                                                                                                                        var33_12.append(", ");
                                                                                                                                                        var33_12.append(var16_27 /* !! */ );
                                                                                                                                                        var7_6 = var8_7 /* !! */ ;
lbl107:
                                                                                                                                                        // 3 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            var13_17 /* !! */  = var12_9 /* !! */ ;
                                                                                                                                                            var17_28 = var10_20 /* !! */ ;
                                                                                                                                                            var15_26 = var6_4 /* !! */ ;
                                                                                                                                                            var16_27 /* !! */  = var11_19;
                                                                                                                                                            var18_29 = var9_18 /* !! */ ;
lbl113:
                                                                                                                                                            // 5 sources

                                                                                                                                                            while (true) {
                                                                                                                                                                var12_9 /* !! */  = (int)var7_6;
                                                                                                                                                                var9_18 /* !! */  = var18_29;
                                                                                                                                                                var11_19 = var16_27 /* !! */ ;
                                                                                                                                                                var6_4 /* !! */  = var15_26;
                                                                                                                                                                var10_20 /* !! */  = var17_28;
                                                                                                                                                                var7_6 = var13_17 /* !! */ ;
                                                                                                                                                                break block3;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    n.m(var33_12, var3_2, true);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break block83;
                                                                                                                                        }
                                                                                                                                        case 'c': {
                                                                                                                                            var12_9 /* !! */  = var3_2 >> 28 & 15;
                                                                                                                                            if (var12_9 /* !! */  != 14) {
                                                                                                                                                var33_12.append(n.d[var12_9 /* !! */ ]);
                                                                                                                                            }
                                                                                                                                            break block83;
                                                                                                                                        }
                                                                                                                                        case 'b': {
                                                                                                                                            n.r(var33_12, var1_1, ((0xFFFFFF & var3_2 ^ 0x800000) - 0x800000) * 4 + 8);
                                                                                                                                            break block83;
                                                                                                                                        }
                                                                                                                                        case 'a': {
                                                                                                                                            var26_16 = n.a.c(var33_12, var1_1, var3_2);
                                                                                                                                            var12_9 /* !! */  = var8_7 /* !! */ ;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    continue block14;
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
                                                                                                                                    var12_9 /* !! */  = (int)var7_6;
                                                                                                                                    var8_7 /* !! */  = n.j(var34_14, var25_15, var8_7 /* !! */ , var3_2, (n)var0);
                                                                                                                                    var14_25 = n.a((n)var0);
                                                                                                                                    var13_17 /* !! */  = n.c((n)var0);
                                                                                                                                    var4_23 = n.g(var34_14, var25_15, var8_7 /* !! */ );
                                                                                                                                    if (var4_23 == 39) break block97;
                                                                                                                                    if (var4_23 == 63) break block98;
                                                                                                                                    if (var4_23 == 82) break block99;
                                                                                                                                    var13_17 /* !! */  = var11_19;
                                                                                                                                    if (var4_23 == 84) break block100;
                                                                                                                                    if (var4_23 == 96) break block101;
                                                                                                                                    if (var4_23 == 98) break block102;
                                                                                                                                    var7_6 = var14_25;
                                                                                                                                    var15_26 = var8_7 /* !! */ ;
                                                                                                                                    var13_17 /* !! */  = var12_9 /* !! */ ;
                                                                                                                                    if (var4_23 == 100) break;
                                                                                                                                    var13_17 /* !! */  = var11_19;
                                                                                                                                    if (var4_23 == 114) break block100;
                                                                                                                                    if (var4_23 == 120) break block103;
                                                                                                                                    if (var4_23 == 87) ** GOTO lbl185
                                                                                                                                    if (var4_23 != 88) ** GOTO lbl165
                                                                                                                                    var33_12.append(Integer.toHexString(var14_25 & 15).toUpperCase(Locale.US));
                                                                                                                                    var9_18 /* !! */  = var14_25;
                                                                                                                                    var7_6 = var8_7 /* !! */ ;
                                                                                                                                    ** GOTO lbl107
lbl165:
                                                                                                                                    // 1 sources

                                                                                                                                    var0 = new StringBuilder();
                                                                                                                                    var0.append("70 Invalid format char '");
                                                                                                                                    var0.append(var4_23);
                                                                                                                                    var0.append("'; ");
                                                                                                                                    var0.append(var19_5);
                                                                                                                                    var0.append("; ");
                                                                                                                                    var0.append(var8_7 /* !! */ );
                                                                                                                                    var0.append("; '");
                                                                                                                                    var0.append(var34_14);
                                                                                                                                    var0.append("'");
                                                                                                                                    throw new RuntimeException(var0.toString());
lbl185:
                                                                                                                                    // 1 sources

                                                                                                                                    var7_6 = var14_25 + 1;
                                                                                                                                    var13_17 /* !! */  = var12_9 /* !! */ ;
                                                                                                                                    var15_26 = var8_7 /* !! */ ;
                                                                                                                                }
                                                                                                                            }
lbl188:
                                                                                                                            // 4 sources

                                                                                                                            while (true) {
                                                                                                                                var33_12.append((int)var7_6);
                                                                                                                                var9_18 /* !! */  = (int)var7_6;
                                                                                                                                var7_6 = var15_26;
                                                                                                                                var12_9 /* !! */  = var13_17 /* !! */ ;
                                                                                                                                ** continue;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var33_12.append("0x");
                                                                                                                        t2.c((Appendable)var33_12, (int)8, (int)var14_25);
                                                                                                                        var14_25 = 0xFFFFFFF & var3_2;
                                                                                                                        if (var14_25 != 0xFF00000) break block104;
                                                                                                                        var32_3 /* !! */  = "\t ; IMB";
                                                                                                                        var7_6 = var8_7 /* !! */ ;
                                                                                                                        break block105;
                                                                                                                    }
                                                                                                                    var7_6 = var8_7 /* !! */ ;
                                                                                                                    var18_29 = var9_18 /* !! */ ;
                                                                                                                    var16_27 /* !! */  = var11_19;
                                                                                                                    var15_26 = var6_4 /* !! */ ;
                                                                                                                    var17_28 = var10_20 /* !! */ ;
                                                                                                                    var13_17 /* !! */  = var12_9 /* !! */ ;
                                                                                                                    if (var14_25 != 0xFF00001) ** GOTO lbl113
                                                                                                                    var32_3 /* !! */  = "\t ; IMBRange";
                                                                                                                    var7_6 = var8_7 /* !! */ ;
                                                                                                                    break block105;
                                                                                                                }
                                                                                                                var7_6 = var14_25 * 8;
                                                                                                                var15_26 = var8_7 /* !! */ ;
                                                                                                                var13_17 /* !! */  = var12_9 /* !! */ ;
                                                                                                                ** continue;
                                                                                                            }
                                                                                                            var4_23 = n.g(var34_14, var25_15, ++var8_7 /* !! */ );
                                                                                                            var7_6 = var8_7 /* !! */ ;
                                                                                                            var18_29 = var9_18 /* !! */ ;
                                                                                                            var16_27 /* !! */  = var11_19;
                                                                                                            var15_26 = var6_4 /* !! */ ;
                                                                                                            var17_28 = var10_20 /* !! */ ;
                                                                                                            var13_17 /* !! */  = var12_9 /* !! */ ;
                                                                                                            if (var14_25 != 0) ** GOTO lbl113
                                                                                                            n.d(var33_12, var4_23);
                                                                                                            var7_6 = var8_7 /* !! */ ;
                                                                                                            var18_29 = var9_18 /* !! */ ;
                                                                                                            var16_27 /* !! */  = var11_19;
                                                                                                            var15_26 = var6_4 /* !! */ ;
                                                                                                            var17_28 = var10_20 /* !! */ ;
                                                                                                            var13_17 /* !! */  = var12_9 /* !! */ ;
                                                                                                            ** GOTO lbl113
                                                                                                        }
                                                                                                        var13_17 /* !! */  = var11_19;
                                                                                                        if (var14_25 == 15) {
                                                                                                            var13_17 /* !! */  = 1;
                                                                                                        }
                                                                                                    }
                                                                                                    var7_6 = var14_25;
                                                                                                    if (var4_23 == 'T') {
                                                                                                        var7_6 = var14_25 + 1;
                                                                                                    }
                                                                                                    if (n.g(var34_14, var25_15, var11_19 = var8_7 /* !! */  + 1) == 'u') {
                                                                                                        n.g(var34_14, var25_15, var11_19);
                                                                                                        if (var6_4 /* !! */  == var7_6) {
                                                                                                            var13_17 /* !! */  = 1;
                                                                                                        }
                                                                                                        var6_4 /* !! */  = (int)var7_6;
                                                                                                        var8_7 /* !! */  = var11_19;
                                                                                                    }
                                                                                                    if (n.g(var34_14, var25_15, var11_19 = var8_7 /* !! */  + 1) == 'U') {
                                                                                                        n.g(var34_14, var25_15, var11_19);
                                                                                                        if (var10_20 /* !! */  == var7_6) {
                                                                                                            var13_17 /* !! */  = 1;
                                                                                                        }
                                                                                                        var10_20 /* !! */  = (int)var7_6;
                                                                                                        var8_7 /* !! */  = var11_19;
                                                                                                    }
                                                                                                    var32_3 /* !! */  = n.e[var7_6];
                                                                                                    var11_19 = var13_17 /* !! */ ;
                                                                                                    var7_6 = var8_7 /* !! */ ;
                                                                                                }
                                                                                                var33_12.append((String)var32_3 /* !! */ );
                                                                                                var18_29 = var9_18 /* !! */ ;
                                                                                                var16_27 /* !! */  = var11_19;
                                                                                                var15_26 = var6_4 /* !! */ ;
                                                                                                var17_28 = var10_20 /* !! */ ;
                                                                                                var13_17 /* !! */  = var12_9 /* !! */ ;
                                                                                                ** continue;
                                                                                            }
                                                                                            n.d(var33_12, n.g(var34_14, var25_15, (var8_7 /* !! */  += 1 << var13_17 /* !! */ ) - var14_25));
                                                                                            n.g(var34_14, var25_15, var8_7 /* !! */ );
lbl276:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var12_9 /* !! */  = var8_7 /* !! */ ;
                                                                                                continue block14;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var12_9 /* !! */  = var8_7 /* !! */  + 1;
                                                                                        var4_23 = n.g(var34_14, var25_15, var12_9 /* !! */ );
                                                                                        if (var14_25 == (1 << var13_17 /* !! */ ) - 1) {
                                                                                            n.d(var33_12, var4_23);
                                                                                        }
                                                                                        var13_17 /* !! */  = var9_18 /* !! */ ;
lbl285:
                                                                                        // 8 sources

                                                                                        while (true) {
                                                                                            var9_18 /* !! */  = var13_17 /* !! */ ;
                                                                                            continue block14;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if ((0x1200000 & var3_2) == 0x200000) {
                                                                                        var33_12.append('T');
                                                                                    }
                                                                                    break block83;
                                                                                }
                                                                                var17_28 = 0;
                                                                                break block106;
                                                                            }
                                                                            var9_18 /* !! */  = (983040 & var3_2) >> 4 | var3_2 & 4095;
                                                                            var33_12.append('#');
                                                                            var33_12.append(var9_18 /* !! */ );
                                                                            ** continue;
                                                                        }
                                                                        if ((var3_2 & 240) == 96) {
                                                                            var12_9 /* !! */  = var3_2 & 15;
                                                                            if (var12_9 /* !! */  != 15) {
                                                                                var33_12.append('#');
                                                                                var33_12.append(var12_9 /* !! */ );
                                                                            } else {
                                                                                var33_12.append("sy");
                                                                            }
                                                                        } else {
                                                                            n.i(var33_12, var3_2 & 15);
                                                                        }
                                                                        break block83;
                                                                    }
                                                                    var17_28 = 1;
                                                                }
                                                                if ((var3_2 & 0x4F0000) != 0x4F0000) break block107;
                                                                var13_17 /* !! */  = (var3_2 & 3840) >> 4 | var3_2 & 15;
                                                                if (!var20_11) break block108;
                                                                if (var13_17 /* !! */  == 0 && var7_6 == false) {
                                                                    var32_3 /* !! */  = "[PC]\t ; ";
lbl325:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var33_12.append("[PC,#");
                                                                if (var7_6 != false) {
                                                                    var33_12.append('-');
                                                                }
                                                                var33_12.append(var13_17 /* !! */ );
                                                                var32_3 /* !! */  = "]\t ; ";
                                                                ** continue;
                                                                var33_12.append((String)var32_3 /* !! */ );
                                                                var12_9 /* !! */  = var13_17 /* !! */ ;
                                                                if (var7_6 != false) {
                                                                    var12_9 /* !! */  = -var13_17 /* !! */ ;
                                                                }
                                                                n.r(var33_12, var1_1, var12_9 /* !! */  + 8);
                                                                var12_9 /* !! */  = var8_7 /* !! */ ;
                                                                var13_17 /* !! */  = var9_18 /* !! */ ;
                                                                ** GOTO lbl285
                                                            }
                                                            var12_9 /* !! */  = var8_7 /* !! */ ;
                                                            var33_12.append("[PC], #");
                                                            if (var7_6 != false) {
                                                                var33_12.append('-');
                                                            }
                                                            var33_12.append(var13_17 /* !! */ );
                                                            var13_17 /* !! */  = var9_18 /* !! */ ;
                                                            if (var17_28 != 0) ** GOTO lbl285
lbl356:
                                                            // 3 sources

                                                            while (true) {
                                                                var11_19 = 1;
                                                                var12_9 /* !! */  = var8_7 /* !! */ ;
                                                                var13_17 /* !! */  = var9_18 /* !! */ ;
                                                                ** GOTO lbl285
                                                                break;
                                                            }
                                                        }
                                                        var16_27 /* !! */  = var8_7 /* !! */ ;
                                                        var18_29 = var3_2 & 15;
                                                        var12_9 /* !! */  = (var3_2 & 3840) >> 4 | var18_29;
                                                        var33_12.append('[');
                                                        var32_3 /* !! */  = n.e;
                                                        var33_12.append(var32_3 /* !! */ [var3_2 >> 16 & 15]);
                                                        if (!var20_11) break block109;
                                                        if (var21_21 != 0) {
                                                            if (var24_22 /* !! */  != 0 || var7_6 != false || var12_9 /* !! */  != 0) {
                                                                var33_12.append(",#");
                                                                if (var7_6 != false) {
                                                                    var33_12.append('-');
                                                                }
                                                                var33_12.append(var12_9 /* !! */ );
                                                            }
                                                            if (var7_6 != false) {
                                                                var8_7 /* !! */  = -var12_9 /* !! */ ;
                                                                var14_25 = var11_19;
                                                            } else {
                                                                var8_7 /* !! */  = var12_9 /* !! */ ;
                                                                var14_25 = var11_19;
                                                            }
                                                        } else {
                                                            var33_12.append(",");
                                                            if (var7_6 != false) {
                                                                var33_12.append('-');
                                                            }
                                                            var33_12.append(var32_3 /* !! */ [var18_29]);
                                                            var8_7 /* !! */  = var9_18 /* !! */ ;
                                                            var14_25 = var11_19;
                                                            if (var17_28 == 0) {
                                                                var8_7 /* !! */  = var9_18 /* !! */ ;
                                                                var14_25 = var11_19;
                                                                if (var24_22 /* !! */  != 0) {
                                                                    var8_7 /* !! */  = var9_18 /* !! */ ;
                                                                    var14_25 = var11_19;
                                                                    if (var18_29 == (var3_2 >> 12 & 15)) {
                                                                        var14_25 = 1;
                                                                        var8_7 /* !! */  = var9_18 /* !! */ ;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var33_12.append(']');
                                                        var12_9 /* !! */  = var16_27 /* !! */ ;
                                                        var13_17 /* !! */  = var8_7 /* !! */ ;
                                                        var11_19 = var14_25;
                                                        if (var24_22 /* !! */  != 0) {
                                                            var33_12.append('!');
                                                            var12_9 /* !! */  = var16_27 /* !! */ ;
                                                            var13_17 /* !! */  = var8_7 /* !! */ ;
                                                            var11_19 = var14_25;
                                                        }
                                                        ** GOTO lbl285
                                                    }
                                                    if (var21_21 != 0) {
                                                        var33_12.append("], #");
                                                        if (var7_6 != false) {
                                                            var33_12.append('-');
                                                        }
                                                        var33_12.append(var12_9 /* !! */ );
                                                        var9_18 /* !! */  = var12_9 /* !! */ ;
                                                        if (var7_6 != false) {
                                                            var9_18 /* !! */  = -var12_9 /* !! */ ;
                                                        }
                                                        var14_25 = var9_18 /* !! */ ;
                                                        while (true) {
                                                            var15_26 = var11_19;
                                                            break;
                                                        }
                                                    } else {
                                                        var33_12.append("], ");
                                                        if (var7_6 != false) {
                                                            var33_12.append('-');
                                                        }
                                                        var33_12.append(var32_3 /* !! */ [var18_29]);
                                                        var14_25 = var9_18 /* !! */ ;
                                                        if (var17_28 != 0) ** continue;
                                                        var14_25 = var9_18 /* !! */ ;
                                                        var15_26 = var11_19;
                                                        if (var18_29 == (var3_2 >> 12 & 15)) {
                                                            var15_26 = 1;
                                                            var14_25 = var9_18 /* !! */ ;
                                                        }
                                                    }
                                                    var12_9 /* !! */  = var16_27 /* !! */ ;
                                                    var13_17 /* !! */  = var14_25;
                                                    var11_19 = var15_26;
                                                    if (var17_28 != 0) ** GOTO lbl285
                                                    var9_18 /* !! */  = var14_25;
                                                    if (var24_22 /* !! */  != 0) ** GOTO lbl356
                                                    var12_9 /* !! */  = var16_27 /* !! */ ;
                                                    var13_17 /* !! */  = var14_25;
                                                    var11_19 = var15_26;
                                                    if (var21_21 != 0) ** GOTO lbl285
                                                    var12_9 /* !! */  = var16_27 /* !! */ ;
                                                    var13_17 /* !! */  = var14_25;
                                                    var11_19 = var15_26;
                                                    if (var18_29 == 15) ** break;
                                                    ** continue;
                                                    var9_18 /* !! */  = var14_25;
                                                    ** continue;
                                                }
                                                while (true) {
                                                    n.f(var33_12, (0x4F0000 & var3_2) >> 16 | (var3_2 & 768) >> 4);
                                                    break block83;
                                                    break;
                                                }
                                            }
                                            if ((0x2000200 & var3_2) == 512) ** continue;
                                            if (var22_8 != 0) {
                                                var4_23 = 'S';
                                            }
                                            var33_12.append(var4_23);
                                            var33_12.append("PSR_");
                                            if ((524288 & var3_2) != 0) {
                                                var33_12.append('f');
                                            }
                                            if ((262144 & var3_2) != 0) {
                                                var33_12.append('s');
                                            }
                                            if ((131072 & var3_2) != 0) {
                                                var33_12.append('x');
                                            }
                                            if ((65536 & var3_2) != 0) {
                                                var33_12.append('c');
                                            }
                                            break block83;
                                        }
                                        var12_9 /* !! */  = var7_6 == false ? -16777216 : 0;
                                        var30_31 = (long)(var12_9 /* !! */  + (0xFFFFFF & var3_2) << 2) + var1_1;
                                        var28_30 = var30_31 + 8L;
                                        if (var23_10 != 0) {
                                            var28_30 = var30_31 + 10L;
                                        }
                                        n.r(var33_12, var1_1, var28_30 - var1_1);
                                        break block83;
                                    }
                                    var12_9 /* !! */  = var8_7 /* !! */ ;
                                    var13_17 /* !! */  = (int)var7_6;
                                    var14_25 = var6_4 /* !! */ ;
                                    var33_12.append('{');
                                    var16_27 /* !! */  = 0;
                                    for (var15_26 = 0; var15_26 < 16; ++var15_26) {
                                        if ((1 << var15_26 & var3_2) == 0) continue;
                                        if (var15_26 >= 2 && var15_26 <= 12 && (1 << var15_26 - 2 & var3_2) != 0 && (var3_2 & 1 << (var17_28 = var15_26 - 1)) != 0) {
                                            var33_12.setLength(var33_12.length() - 1 - n.e[var17_28].length());
                                            var33_12.append('-');
                                        } else if (var16_27 /* !! */  != 0) {
                                            var33_12.append(',');
                                        }
                                        var33_12.append(n.e[var15_26]);
                                        var16_27 /* !! */  = 1;
                                    }
                                    var33_12.append('}');
                                    if (var16_27 /* !! */  == 0) {
                                        var11_19 = 1;
                                        var6_4 /* !! */  = var14_25;
                                        var7_6 = var13_17 /* !! */ ;
                                        continue;
                                    }
                                    break block83;
                                }
                                var9_18 /* !! */  = var3_2 & 15 | (1048320 & var3_2) >> 4;
                                var33_12.append(var9_18 /* !! */ );
                                var12_9 /* !! */  = var8_7 /* !! */ ;
                                continue;
                            }
                            var26_16 = n.a.c(var33_12, var1_1, var3_2 | 0x1000000);
                            var12_9 /* !! */  = var8_7 /* !! */ ;
                            continue;
                        }
                        var12_9 /* !! */  = (0x1F0000 & var3_2) >> 16;
                        var14_25 = (var3_2 & 3968) >> 7;
                        var13_17 /* !! */  = var12_9 /* !! */  - var14_25 + 1;
                        if (var13_17 /* !! */  > 0) {
                            var33_12.append('#');
                            var33_12.append(var14_25);
                            var33_12.append(", #");
                            var33_12.append(var13_17 /* !! */ );
                        } else {
                            var33_12.append("<invalid: ");
                            var33_12.append(var14_25);
                            var33_12.append(':');
                            var33_12.append(var12_9 /* !! */ );
                            var33_12.append('>');
                        }
                        break block83;
                    }
                    var33_12.append('%');
                }
                var12_9 /* !! */  = var8_7 /* !! */ ;
            }
            if (var9_18 /* !! */  <= 32 && var9_18 /* !! */  >= -16) {
                if (var26_16 > 32L || var26_16 < -16L) {
                    var33_12.append("\t ; 0x");
                    var0 = Long.toHexString(var26_16);
lbl572:
                    // 2 sources

                    while (true) {
                        var33_12.append(var0.toUpperCase(Locale.US));
                        break;
                    }
                }
            } else {
                var33_12.append("\t ; 0x");
                var0 = Integer.toHexString(var9_18 /* !! */ );
                ** continue;
            }
            if (var11_19 != 0) {
                var33_12.append("\t ; <UNPREDICTABLE>");
            }
            return var33_12.toString();
        }
        var33_13 = new StringBuilder();
        var33_13.append("170 No ARM match for ");
        var0 = Integer.toHexString(var3_2);
        var32_3 /* !! */  = Locale.US;
        var33_13.append(var0.toUpperCase((Locale)var32_3 /* !! */ ));
        var33_13.append("; ");
        var33_13.append(Integer.toHexString(Integer.reverseBytes(var3_2)).toUpperCase((Locale)var32_3 /* !! */ ));
        throw new RuntimeException(var33_13.toString());
    }

    static long c(StringBuilder stringBuilder, long l, int n2) {
        boolean bl = false;
        boolean bl2 = (0x200000 & n2) != 0;
        boolean bl3 = (0x800000 & n2) == 0;
        if ((0x1000000 & n2) != 0) {
            bl = true;
        }
        long l2 = 0L;
        if ((n2 & 0xF0000) == 983040 && (n2 & 0x2000000) == 0) {
            long l3;
            long l4 = n2 & 0xFFF;
            stringBuilder.append("[PC");
            if (bl) {
                if (bl2 || bl3 || l4 != 0L) {
                    stringBuilder.append(",#");
                    if (bl3) {
                        stringBuilder.append('-');
                    }
                    stringBuilder.append(l4);
                }
                l3 = l4;
                if (bl3) {
                    l3 = -l4;
                }
                l4 = l3 + (l + 8L);
                stringBuilder.append(']');
                l3 = l4;
                if (bl2) {
                    stringBuilder.append('!');
                    l3 = l4;
                }
            } else {
                stringBuilder.append("], #");
                if (bl3) {
                    stringBuilder.append('-');
                }
                stringBuilder.append(l4);
                l3 = l + 8L;
            }
            stringBuilder.append("\t ; ");
            n.r(stringBuilder, l, l3 - l);
            l = l2;
        } else {
            stringBuilder.append('[');
            stringBuilder.append(e[n2 >> 16 & 0xF]);
            int n3 = n2 & 0x2000000;
            if (bl) {
                if (n3 == 0) {
                    l2 = n2 & 0xFFF;
                    if (bl2 || bl3 || l2 != 0L) {
                        stringBuilder.append(",#");
                        if (bl3) {
                            stringBuilder.append('-');
                        }
                        stringBuilder.append(l2);
                    }
                } else {
                    stringBuilder.append(',');
                    if (bl3) {
                        stringBuilder.append('-');
                    }
                    n.m(stringBuilder, n2, true);
                }
                stringBuilder.append(']');
                l = l2;
                if (bl2) {
                    stringBuilder.append('!');
                    l = l2;
                }
            } else if (n3 == 0) {
                l = n2 & 0xFFF;
                stringBuilder.append("], #");
                if (bl3) {
                    stringBuilder.append('-');
                }
                stringBuilder.append(l);
            } else {
                stringBuilder.append("], ");
                if (bl3) {
                    stringBuilder.append('-');
                }
                n.m(stringBuilder, n2, true);
                l = l2;
            }
        }
        return l;
    }

    private static long[] $d2j$hex$8c161d8b$decode_J(String src) {
        byte[] d2 = n.a.$d2j$hex$8c161d8b$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s.get(data);
        return data;
    }

    private static int[] $d2j$hex$8c161d8b$decode_I(String src) {
        byte[] d2 = n.a.$d2j$hex$8c161d8b$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s.get(data);
        return data;
    }

    private static short[] $d2j$hex$8c161d8b$decode_S(String src) {
        byte[] d2 = n.a.$d2j$hex$8c161d8b$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s.get(data);
        return data;
    }

    private static byte[] $d2j$hex$8c161d8b$decode_B(String src) {
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
