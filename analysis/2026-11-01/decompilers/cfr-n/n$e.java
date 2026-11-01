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

static abstract class n.e {
    static final int[] a = n.e.$d2j$hex$6ed771d1$decode_I("4008b0f25008b0ff0000b0f21008b0ff000cb4f3900fb7ff000cb2f3900fb3ff000cb1f3900fb1ff0008b0f3500cb0ff4008b0f3500cb0ff0006b6f3d00fbfff0007b6f3d00fbfff100c00f2100fa0ff100c20f2100fa0ff0004baf3100cbfff0000bbf3100cbfff0003b0f3d00fbfff4003b0f3d00fbfff8003b0f3d00fbfffc003b0f3d00fbfffc002b9f3d00fbfff8003baf3d00fbfffc003baf3d00fbfff100a88f2d00fbffe100a90f2d00fbffe100aa0f2d00fbffe0005b0f3900fbfff8005b0f3900fbfff0000b2f3900fbfff0002b2f3d00fb3ff4002b2f3d00fb3ff8002b2f3d00fb3ffc002b2f3d00fb3ff0003b2f3d00fb3ff0004bbf3900ebfff8004bbf3900ebfff0000b0f3900fb3ff8000b0f3900fb3ff0001b0f3900fb3ff0004b0f3900fb3ff8004b0f3900fb3ff0007b0f3900fb3ff8007b0f3900fb3ff8000b2f3900fb3ff0001b2f3900fb3ff8001b2f3900fb3ff0000b1f3900bb3ff8000b1f3900bb3ff0001b1f3900bb3ff8001b1f3900bb3ff0002b1f3900bb3ff0003b1f3900bb3ff8003b1f3900bb3ff0002b0f3100fb3ff0006b0f3100fb3ff0006b3f3100eb3ff400c00f2500fb0ff400c10f2500fb0ff400c20f2500fb0ff400c30f2500fb0ff400c00f3500fb0ff400c10f3500fb0ff400c20f3500fb0ff100f00f3100fa0ff100f20f3100fa0ff100100f2100fb0ff100110f2100fb0ff100120f2100fb0ff100130f2100fb0ff100100f3100fb0ff100110f3100fb0ff100120f3100fb0ff100130f3100fb0ff000d00f2100fa0ff100d00f2100fa0ff000e00f2100fa0ff000f00f2100fa0ff100f00f2100fa0ff000d20f2100fa0ff100d20f2100fa0ff000f20f2100fa0ff100f20f2100fa0ff000d00f3100fa0ff100d00f3100fa0ff000e00f3100fa0ff100e00f3100fa0ff000f00f3100fa0ff000d20f3100fa0ff000e20f3100fa0ff100e20f3100fa0ff000f20f3100fa0ff000800f2100f80ff100800f2100f80ff000900f2100f80ff000b00f2100f80ff100b00f2100f80ff000800f3100f80ff100800f3100f80ff000900f3100f80ff000b00f3100f80ff000000f2100f80fe100000f2100f80fe000100f2100f80fe000200f2100f80fe100200f2100f80fe000300f2100f80fe100300f2100f80fe000400f2100f80fe100400f2100f80fe000500f2100f80fe100500f2100f80fe000600f2100f80fe100600f2100f80fe000700f2100f80fe100700f2100f80fe100900f2100f80fe000a00f2100f80fe100a00f2100f80fe100e80f2b00fb8fe300e80f2b00fb8fe100f80f2b00fb8fe100880f2b00db8fe300880f2b00db8fe100980f2b00db8fe300980f2b00db8fe100c80f2b00eb8fe300c80f2b00eb8fe100180f2b009b8fe300180f2b009b8fe100080f2b008b8fe300080f2b008b8fe100888f2d00fb8ff500888f2d00fb8ff100888f3d00fb8ff500888f3d00fb8ff100988f2d00fb8fe500988f2d00fb8fe100a88f2d00fb8fe100890f2d00fb0ff500890f2d00fb0ff100588f2900fb8ff100488f3900fb8ff100588f3900fb8ff100688f3900fb8ff100890f3d00fb0ff500890f3d00fb0ff100990f2d00fb0fe500990f2d00fb0fe100a90f2d00fb0fe100088f2900fb8fe100188f2900fb8fe100288f2900fb8fe100388f2900fb8fe100788f2900fb8fe1008a0f2d00fa0ff5008a0f2d00fa0ff100590f2900fb0ff100490f3900fb0ff100590f3900fb0ff100690f3900fb0ff100aa0f2d00fa0fe100090f2900fb0fe100190f2900fb0fe100290f2900fb0fe100390f2900fb0fe100790f2900fb0fe1008a0f3d00fa0ff5008a0f3d00fa0ff1009a0f2d00fa0fe5009a0f2d00fa0fe1005a0f2900fa0ff1004a0f3900fa0ff1005a0f3900fa0ff1006a0f3900fa0ff1000a0f2900fa0fe1001a0f2900fa0fe1002a0f2900fa0fe1003a0f2900fa0fe1007a0f2900fa0fe900580f2900f80ff900480f3900f80ff900580f3900f80ff900680f3900f80ff900080f2900f80fe900180f2900f80fe900280f2900f80fe900380f2900f80fe900780f2900f80fe100ea0f2900ea0fe000ea0f2500fb0fe000e80f2500fa0fe000480f2500f80ff000680f2500f80ff000980f2500f80ff000b80f2500f80ff000d80f2500f80ff000480f3500f80ff000680f3500f80ff000080f2500f80fe000180f2500f80fe000280f2500f80fe000380f2500f80fe000580f2500f80fe000780f2500f80fe000880f2500f80fe000a80f2500f80fe000c80f2500f80fe400080f2500f80ff400180f2500f80ff400380f2500f80ff400480f2500f80ff400580f2500f80ff400780f2500f80ff400880f2500f80ff400980f2500f80ff400b80f2500f80ff400c80f2500f80ff400d80f2500f80ff400080f3500f80ff400180f3500f80ff400480f3500f80ff400580f3500f80ff400880f3500f80ff400980f3500f80ff400c80f3500f80ff400d80f3500f80ff400280f2500f80fe400680f2500f80fe400a80f2500f80fec00fa0f4c00fb0ff000ca0f4000fb0ff000da0f4000fb0ff000ea0f4000fb0ff000fa0f4000fb0ff000200f4000f90ff000300f4000f90ff000400f4000f90ff000500f4000f90ff000600f4000f90ff000700f4000f90ff000800f4000f90ff000900f4000f90ff000a00f4000f90ff000000f4000e90ff000080f4000390ff000180f4000390ff000280f4000390ff000380f4000390ff");
    static final String[] b = new String[]{"VEXT%c.8\t %12-15,22R, %16-19,7R, %0-3,5R, #%8-11d", "VEXT%c.8\t %12-15,22R, %16-19,7R, %0-3,5R, #%8-11d", "VDUP%c.32\t %12-15,22R, %0-3,5D[%19d]", "VDUP%c.16\t %12-15,22R, %0-3,5D[%18-19d]", "VDUP%c.8\t %12-15,22R, %0-3,5D[%17-19d]", "VTBL%c.8\t %12-15,22D, %F, %0-3,5D", "VTBX%c.8\t %12-15,22D, %F, %0-3,5D", "VCVT%c.F16.F32\t %12-15,22D, %0-3,5Q", "VCVT%c.F32.F16\t %12-15,22Q, %0-3,5D", "VFMA%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VFMS%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VRINT%7-9?P?M?ZAXN%u.F32\t %12-15,22R, %0-3,5R", "VCVT%8-9?MPNA%u.%7?US32.F32\t %12-15,22R, %0-3,5R", "AESE%u.8\t %12-15,22Q, %0-3,5Q", "AESD%u.8\t %12-15,22Q, %0-3,5Q", "AESMC%u.8\t %12-15,22Q, %0-3,5Q", "AESIMC%u.8\t %12-15,22Q, %0-3,5Q", "SHA1H%u.32\t %12-15,22Q, %0-3,5Q", "SHA1SU1%u.32\t %12-15,22Q, %0-3,5Q", "SHA256SU0%u.32\t %12-15,22Q, %0-3,5Q", "VMOVL%c.%24?US8\t %12-15,22Q, %0-3,5D", "VMOVL%c.%24?US16\t %12-15,22Q, %0-3,5D", "VMOVL%c.%24?US32\t %12-15,22Q, %0-3,5D", "VCNT%c.8\t %12-15,22R, %0-3,5R", "VMVN%c\t %12-15,22R, %0-3,5R", "VSWP%c\t %12-15,22R, %0-3,5R", "VMOVN%c.i%18-19T2\t %12-15,22D, %0-3,5Q", "VQMOVUN%c.s%18-19T2\t %12-15,22D, %0-3,5Q", "VQMOVN%c.s%18-19T2\t %12-15,22D, %0-3,5Q", "VQMOVN%c.u%18-19T2\t %12-15,22D, %0-3,5Q", "VSHLL%c.i%18-19S2\t %12-15,22Q, %0-3,5D, #%18-19S2", "VRECPE%c.%8?FU%18-19S2\t %12-15,22R, %0-3,5R", "VRSQRTE%c.%8?FU%18-19S2\t %12-15,22R, %0-3,5R", "VREV64%c.%18-19S2\t %12-15,22R, %0-3,5R", "VREV32%c.%18-19S2\t %12-15,22R, %0-3,5R", "VREV16%c.%18-19S2\t %12-15,22R, %0-3,5R", "VCLS%c.s%18-19S2\t %12-15,22R, %0-3,5R", "VCLZ%c.i%18-19S2\t %12-15,22R, %0-3,5R", "VQABS%c.s%18-19S2\t %12-15,22R, %0-3,5R", "VQNEG%c.s%18-19S2\t %12-15,22R, %0-3,5R", "VTRN%c.%18-19S2\t %12-15,22R, %0-3,5R", "VUZP%c.%18-19S2\t %12-15,22R, %0-3,5R", "VZIP%c.%18-19S2\t %12-15,22R, %0-3,5R", "VCGT%c.%10?FS%18-19S2\t %12-15,22R, %0-3,5R, #0", "VCGE%c.%10?FS%18-19S2\t %12-15,22R, %0-3,5R, #0", "VCEQ%c.%10?FI%18-19S2\t %12-15,22R, %0-3,5R, #0", "VCLE%c.%10?FS%18-19S2\t %12-15,22R, %0-3,5R, #0", "VCLT%c.%10?FS%18-19S2\t %12-15,22R, %0-3,5R, #0", "VABS%c.%10?FS%18-19S2\t %12-15,22R, %0-3,5R", "VNEG%c.%10?FS%18-19S2\t %12-15,22R, %0-3,5R", "VPADDL%c.%7?US%18-19S2\t %12-15,22R, %0-3,5R", "VPADAL%c.%7?US%18-19S2\t %12-15,22R, %0-3,5R", "VCVT%c.%7-8?USFF%18-19Sa.%7-8?FFUS%18-19Sa\t %12-15,22R, %0-3,5R", "SHA1C%u.32\t %12-15,22Q, %16-19,7Q, %0-3,5Q", "SHA1P%u.32\t %12-15,22Q, %16-19,7Q, %0-3,5Q", "SHA1M%u.32\t %12-15,22Q, %16-19,7Q, %0-3,5Q", "SHA1SU0%u.32\t %12-15,22Q, %16-19,7Q, %0-3,5Q", "SHA256H%u.32\t %12-15,22Q, %16-19,7Q, %0-3,5Q", "SHA256H2%u.32\t %12-15,22Q, %16-19,7Q, %0-3,5Q", "SHA256SU1%u.32\t %12-15,22Q, %16-19,7Q, %0-3,5Q", "VMAXNM%u.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VMINNM%u.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VAND%c\t %12-15,22R, %16-19,7R, %0-3,5R", "VBIC%c\t %12-15,22R, %16-19,7R, %0-3,5R", "VORR%c\t %12-15,22R, %16-19,7R, %0-3,5R", "VORN%c\t %12-15,22R, %16-19,7R, %0-3,5R", "VEOR%c\t %12-15,22R, %16-19,7R, %0-3,5R", "VBSL%c\t %12-15,22R, %16-19,7R, %0-3,5R", "VBIT%c\t %12-15,22R, %16-19,7R, %0-3,5R", "VBIF%c\t %12-15,22R, %16-19,7R, %0-3,5R", "VADD%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VMLA%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VCEQ%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VMAX%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VRECPS%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VSUB%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VMLS%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VMIN%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VRSQRTS%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VPADD%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VMUL%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VCGE%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VACGE%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VPMAX%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VABD%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VCGT%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VACGT%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VPMIN%c.F%20U0\t %12-15,22R, %16-19,7R, %0-3,5R", "VADD%c.i%20-21S3\t %12-15,22R, %16-19,7R, %0-3,5R", "VTST%c.%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VMLA%c.i%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VQDMULH%c.s%20-21S6\t %12-15,22R, %16-19,7R, %0-3,5R", "VPADD%c.i%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VSUB%c.i%20-21S3\t %12-15,22R, %16-19,7R, %0-3,5R", "VCEQ%c.i%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VMLS%c.i%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VQRDMULH%c.s%20-21S6\t %12-15,22R, %16-19,7R, %0-3,5R", "VHADD%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VQADD%c.%24?US%20-21S3\t %12-15,22R, %16-19,7R, %0-3,5R", "VRHADD%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VHSUB%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VQSUB%c.%24?US%20-21S3\t %12-15,22R, %16-19,7R, %0-3,5R", "VCGT%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VCGE%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VSHL%c.%24?US%20-21S3\t %12-15,22R, %0-3,5R, %16-19,7R", "VQSHL%c.%24?US%20-21S3\t %12-15,22R, %0-3,5R, %16-19,7R", "VRSHL%c.%24?US%20-21S3\t %12-15,22R, %0-3,5R, %16-19,7R", "VQRSHL%c.%24?US%20-21S3\t %12-15,22R, %0-3,5R, %16-19,7R", "VMAX%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VMIN%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VABD%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VABA%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VMUL%c.%24?PI%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VPMAX%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VPMIN%c.%24?US%20-21S2\t %12-15,22R, %16-19,7R, %0-3,5R", "VMOV%c.i8\t %12-15,22R, %E", "VMOV%c.i64\t %12-15,22R, %E", "VMOV%c.F32\t %12-15,22R, %E", "VMOV%c.i16\t %12-15,22R, %E", "VMVN%c.i16\t %12-15,22R, %E", "VORR%c.i16\t %12-15,22R, %E", "VBIC%c.i16\t %12-15,22R, %E", "VMOV%c.i32\t %12-15,22R, %E", "VMVN%c.i32\t %12-15,22R, %E", "VORR%c.i32\t %12-15,22R, %E", "VBIC%c.i32\t %12-15,22R, %E", "VMOV%c.i32\t %12-15,22R, %E", "VMVN%c.i32\t %12-15,22R, %E", "VSHRN%c.i16\t %12-15,22D, %0-3,5Q, #%16-18e", "VRSHRN%c.i16\t %12-15,22D, %0-3,5Q, #%16-18e", "VQSHRUN%c.s16\t %12-15,22D, %0-3,5Q, #%16-18e", "VQRSHRUN%c.s16\t %12-15,22D, %0-3,5Q, #%16-18e", "VQSHRN%c.%24?US16\t %12-15,22D, %0-3,5Q, #%16-18e", "VQRSHRN%c.%24?US16\t %12-15,22D, %0-3,5Q, #%16-18e", "VSHLL%c.%24?US8\t %12-15,22Q, %0-3,5D, #%16-18d", "VSHRN%c.i32\t %12-15,22D, %0-3,5Q, #%16-19e", "VRSHRN%c.i32\t %12-15,22D, %0-3,5Q, #%16-19e", "VSHL%c.%24?US8\t %12-15,22R, %0-3,5R, #%16-18d", "VSRI%c.8\t %12-15,22R, %0-3,5R, #%16-18e", "VSLI%c.8\t %12-15,22R, %0-3,5R, #%16-18d", "VQSHLU%c.s8\t %12-15,22R, %0-3,5R, #%16-18d", "VQSHRUN%c.s32\t %12-15,22D, %0-3,5Q, #%16-19e", "VQRSHRUN%c.s32\t %12-15,22D, %0-3,5Q, #%16-19e", "VQSHRN%c.%24?US32\t %12-15,22D, %0-3,5Q, #%16-19e", "VQRSHRN%c.%24?US32\t %12-15,22D, %0-3,5Q, #%16-19e", "VSHLL%c.%24?US16\t %12-15,22Q, %0-3,5D, #%16-19d", "VSHR%c.%24?US8\t %12-15,22R, %0-3,5R, #%16-18e", "VSRA%c.%24?US8\t %12-15,22R, %0-3,5R, #%16-18e", "VRSHR%c.%24?US8\t %12-15,22R, %0-3,5R, #%16-18e", "VRSRA%c.%24?US8\t %12-15,22R, %0-3,5R, #%16-18e", "VQSHL%c.%24?US8\t %12-15,22R, %0-3,5R, #%16-18d", "VSHRN%c.i64\t %12-15,22D, %0-3,5Q, #%16-20e", "VRSHRN%c.i64\t %12-15,22D, %0-3,5Q, #%16-20e", "VSHL%c.%24?US16\t %12-15,22R, %0-3,5R, #%16-19d", "VSRI%c.16\t %12-15,22R, %0-3,5R, #%16-19e", "VSLI%c.16\t %12-15,22R, %0-3,5R, #%16-19d", "VQSHLU%c.s16\t %12-15,22R, %0-3,5R, #%16-19d", "VSHLL%c.%24?US32\t %12-15,22Q, %0-3,5D, #%16-20d", "VSHR%c.%24?US16\t %12-15,22R, %0-3,5R, #%16-19e", "VSRA%c.%24?US16\t %12-15,22R, %0-3,5R, #%16-19e", "VRSHR%c.%24?US16\t %12-15,22R, %0-3,5R, #%16-19e", "VRSRA%c.%24?US16\t %12-15,22R, %0-3,5R, #%16-19e", "VQSHL%c.%24?US16\t %12-15,22R, %0-3,5R, #%16-19d", "VQSHRUN%c.s64\t %12-15,22D, %0-3,5Q, #%16-20e", "VQRSHRUN%c.s64\t %12-15,22D, %0-3,5Q, #%16-20e", "VQSHRN%c.%24?US64\t %12-15,22D, %0-3,5Q, #%16-20e", "VQRSHRN%c.%24?US64\t %12-15,22D, %0-3,5Q, #%16-20e", "VSHL%c.%24?US32\t %12-15,22R, %0-3,5R, #%16-20d", "VSRI%c.32\t %12-15,22R, %0-3,5R, #%16-20e", "VSLI%c.32\t %12-15,22R, %0-3,5R, #%16-20d", "VQSHLU%c.s32\t %12-15,22R, %0-3,5R, #%16-20d", "VSHR%c.%24?US32\t %12-15,22R, %0-3,5R, #%16-20e", "VSRA%c.%24?US32\t %12-15,22R, %0-3,5R, #%16-20e", "VRSHR%c.%24?US32\t %12-15,22R, %0-3,5R, #%16-20e", "VRSRA%c.%24?US32\t %12-15,22R, %0-3,5R, #%16-20e", "VQSHL%c.%24?US32\t %12-15,22R, %0-3,5R, #%16-20d", "VSHL%c.%24?US64\t %12-15,22R, %0-3,5R, #%16-21d", "VSRI%c.64\t %12-15,22R, %0-3,5R, #%16-21e", "VSLI%c.64\t %12-15,22R, %0-3,5R, #%16-21d", "VQSHLU%c.s64\t %12-15,22R, %0-3,5R, #%16-21d", "VSHR%c.%24?US64\t %12-15,22R, %0-3,5R, #%16-21e", "VSRA%c.%24?US64\t %12-15,22R, %0-3,5R, #%16-21e", "VRSHR%c.%24?US64\t %12-15,22R, %0-3,5R, #%16-21e", "VRSRA%c.%24?US64\t %12-15,22R, %0-3,5R, #%16-21e", "VQSHL%c.%24?US64\t %12-15,22R, %0-3,5R, #%16-21d", "VCVT%c.%24,8?USFF32.%24,8?FFUS32\t %12-15,22R, %0-3,5R, #%16-20e", "VMULL%c.p64\t %12-15,22Q, %16-19,7D, %0-3,5D", "VMULL%c.p%20S0\t %12-15,22Q, %16-19,7D, %0-3,5D", "VADDHN%c.i%20-21T2\t %12-15,22D, %16-19,7Q, %0-3,5Q", "VSUBHN%c.i%20-21T2\t %12-15,22D, %16-19,7Q, %0-3,5Q", "VQDMLAL%c.s%20-21S6\t %12-15,22Q, %16-19,7D, %0-3,5D", "VQDMLSL%c.s%20-21S6\t %12-15,22Q, %16-19,7D, %0-3,5D", "VQDMULL%c.s%20-21S6\t %12-15,22Q, %16-19,7D, %0-3,5D", "VRADDHN%c.i%20-21T2\t %12-15,22D, %16-19,7Q, %0-3,5Q", "VRSUBHN%c.i%20-21T2\t %12-15,22D, %16-19,7Q, %0-3,5Q", "VADDL%c.%24?US%20-21S2\t %12-15,22Q, %16-19,7D, %0-3,5D", "VADDW%c.%24?US%20-21S2\t %12-15,22Q, %16-19,7Q, %0-3,5D", "VSUBL%c.%24?US%20-21S2\t %12-15,22Q, %16-19,7D, %0-3,5D", "VSUBW%c.%24?US%20-21S2\t %12-15,22Q, %16-19,7Q, %0-3,5D", "VABAL%c.%24?US%20-21S2\t %12-15,22Q, %16-19,7D, %0-3,5D", "VABDL%c.%24?US%20-21S2\t %12-15,22Q, %16-19,7D, %0-3,5D", "VMLAL%c.%24?US%20-21S2\t %12-15,22Q, %16-19,7D, %0-3,5D", "VMLSL%c.%24?US%20-21S2\t %12-15,22Q, %16-19,7D, %0-3,5D", "VMULL%c.%24?US%20-21S2\t %12-15,22Q, %16-19,7D, %0-3,5D", "VMLA%c.i%20-21S6\t %12-15,22D, %16-19,7D, %D", "VMLA%c.F%20-21Sa\t %12-15,22D, %16-19,7D, %D", "VQDMLAL%c.s%20-21S6\t %12-15,22Q, %16-19,7D, %D", "VMLS%c.i%20-21S6\t %12-15,22D, %16-19,7D, %D", "VMLS%c.F%20-21S6\t %12-15,22D, %16-19,7D, %D", "VQDMLSL%c.s%20-21S6\t %12-15,22Q, %16-19,7D, %D", "VMUL%c.i%20-21S6\t %12-15,22D, %16-19,7D, %D", "VMUL%c.F%20-21Sa\t %12-15,22D, %16-19,7D, %D", "VQDMULL%c.s%20-21S6\t %12-15,22Q, %16-19,7D, %D", "VQDMULH%c.s%20-21S6\t %12-15,22D, %16-19,7D, %D", "VQRDMULH%c.s%20-21S6\t %12-15,22D, %16-19,7D, %D", "VMLA%c.i%20-21S6\t %12-15,22Q, %16-19,7Q, %D", "VMLA%c.F%20-21Sa\t %12-15,22Q, %16-19,7Q, %D", "VMLS%c.i%20-21S6\t %12-15,22Q, %16-19,7Q, %D", "VMLS%c.F%20-21Sa\t %12-15,22Q, %16-19,7Q, %D", "VMUL%c.i%20-21S6\t %12-15,22Q, %16-19,7Q, %D", "VMUL%c.F%20-21Sa\t %12-15,22Q, %16-19,7Q, %D", "VQDMULH%c.s%20-21S6\t %12-15,22Q, %16-19,7Q, %D", "VQRDMULH%c.s%20-21S6\t %12-15,22Q, %16-19,7Q, %D", "VMLAL%c.%24?US%20-21S6\t %12-15,22Q, %16-19,7D, %D", "VMLSL%c.%24?US%20-21S6\t %12-15,22Q, %16-19,7D, %D", "VMULL%c.%24?US%20-21S6\t %12-15,22Q, %16-19,7D, %D", "VLD4%c.32\t %C", "VLD1%c.%6-7S2\t %C", "VLD2%c.%6-7S2\t %C", "VLD3%c.%6-7S2\t %C", "VLD4%c.%6-7S2\t %C", "V%21?LS%21?DT1%c.%6-7S3\t %A", "V%21?LS%21?DT2%c.%6-7S2\t %A", "V%21?LS%21?DT3%c.%6-7S2\t %A", "V%21?LS%21?DT3%c.%6-7S2\t %A", "V%21?LS%21?DT1%c.%6-7S3\t %A", "V%21?LS%21?DT1%c.%6-7S3\t %A", "V%21?LS%21?DT2%c.%6-7S2\t %A", "V%21?LS%21?DT2%c.%6-7S2\t %A", "V%21?LS%21?DT1%c.%6-7S3\t %A", "V%21?LS%21?DT4%c.%6-7S2\t %A", "V%21?LS%21?DT1%c.%10-11S2\t %B", "V%21?LS%21?DT2%c.%10-11S2\t %B", "V%21?LS%21?DT3%c.%10-11S2\t %B", "V%21?LS%21?DT4%c.%10-11S2\t %B"};
    static final byte[] c = new byte[]{4, 20, 4, 4, 3, 19, 3, 1, 2, 18, 2, 0, 0, 0, 0, 0};

    /*
     * Exception decompiling
     */
    static int a(n var0, long var1_1, String var3_2, boolean var4_11, int var5_12) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 296->305)] android.ext.n$f
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
     * Enabled aggressive block sorting
     */
    static String b(n var0, long var1_1, int var3_2, boolean var4_3) {
        block84: {
            block79: {
                block78: {
                    var19_4 = null;
                    if (var4_3) {
                        if ((var3_2 & -285212672) == -285212672) {
                            var6_5 = (var3_2 & 0x10000000) != 0 ? 1 : 0;
                            var6_5 = var6_5 != 0 ? -218103808 : -234881024;
                            var8_6 = var6_5 | var3_2 & 0xFFFFFF;
                        } else {
                            if ((var3_2 & -16777216) != -117440512) return null;
                            var8_6 = var3_2 ^ 0xD000000;
                        }
                    } else {
                        var8_6 = var3_2;
                    }
                    var3_2 = n.e.b.length;
                    var11_7 = 0;
                    while (true) {
                        var18_8 /* !! */  = var19_4;
                        if (var11_7 >= var3_2) return var18_8 /* !! */ ;
                        var18_8 /* !! */  = n.e.a;
                        var6_5 = var11_7 * 2;
                        if ((var18_8 /* !! */ [var6_5 + 1] & var8_6) == var18_8 /* !! */ [var6_5]) break;
                        ++var11_7;
                    }
                    var20_9 = new StringBuilder();
                    var19_4 = n.e.b[var11_7];
                    var3_2 = var19_4.length();
                    var6_5 = 0;
                    block17: for (var9_10 = 0; var9_10 < var3_2; ++var9_10) {
                        block81: {
                            block83: {
                                block82: {
                                    block80: {
                                        var5_11 = n.g((String)var19_4, var3_2, var9_10);
                                        if (var5_11 == '%') break block80;
                                        n.d(var20_9, var5_11);
                                        var7_12 = var3_2;
                                        var7_12 = var6_5;
                                        var6_5 = var9_10;
                                        break block81;
                                    }
                                    var13_15 = var9_10 + 1;
                                    var5_11 = n.g((String)var19_4, var3_2, var13_15);
                                    if (var5_11 == '%') break block82;
                                    if (var5_11 == 'c' || var5_11 == 'u') ** GOTO lbl79
                                    block0 : switch (var5_11) {
                                        default: {
                                            switch (var5_11) {
                                                default: {
                                                    var0 = new StringBuilder();
                                                    var0.append("60 Invalid format char '");
                                                    var0.append(var5_11);
                                                    var0.append("'; ");
                                                    var0.append(var11_7);
                                                    var0.append("; ");
                                                    var0.append(var13_15);
                                                    var0.append("; '");
                                                    var0.append((String)var19_4);
                                                    var0.append("'");
                                                    throw new RuntimeException(var0.toString());
                                                }
                                                case 'F': {
                                                    var9_10 = var8_6 >> 16 & 15 | var8_6 >> 3 & 16;
                                                    var7_12 = 3 & var8_6 >> 8;
                                                    var20_9.append("{D");
                                                    var20_9.append(var9_10);
                                                    if (var7_12 != 0) {
                                                        var18_8 /* !! */  = (var7_12 += var9_10) >= 32 ? (int[])"-<overflow reg D" : (int[])"-D";
                                                        var20_9.append((String)var18_8 /* !! */ );
                                                        var20_9.append(var7_12);
                                                    }
                                                    var20_9.append('}');
lbl79:
                                                    // 2 sources

                                                    var7_12 = var3_2;
                                                    var7_12 = var6_5;
                                                    var10_13 = var8_6;
                                                    var6_5 = var13_15;
                                                    break block0;
                                                }
                                                case 'E': {
                                                    var9_10 = var8_6 >> 8;
                                                    var7_12 = var9_10 & 15;
                                                    var10_13 = var8_6 >> 5 & 1;
                                                    var14_16 = (var8_6 >> 24 & 1) << 7 | (var8_6 >> 16 & 7) << 4 | var8_6 & 15;
                                                    if (var7_12 >= 8) ** GOTO lbl92
                                                    var9_10 = var14_16 << (var7_12 >> 1 & 3) * 8;
                                                    ** GOTO lbl99
lbl92:
                                                    // 1 sources

                                                    if (var7_12 >= 12) ** GOTO lbl96
                                                    var9_10 = var14_16 << (var7_12 >> 1 & 1) * 8;
                                                    var7_12 = 16;
                                                    ** GOTO lbl108
lbl96:
                                                    // 1 sources

                                                    if (var7_12 >= 14) ** GOTO lbl101
                                                    var7_12 = ((var9_10 & 1) + 1) * 8;
                                                    var9_10 = var14_16 << var7_12 | (1 << var7_12) - 1;
lbl99:
                                                    // 2 sources

                                                    var7_12 = 32;
                                                    ** GOTO lbl108
lbl101:
                                                    // 1 sources

                                                    if (var7_12 != 14) ** GOTO lbl110
                                                    if (var10_13 != 0) {
                                                        var9_10 = 0;
                                                        var7_12 = 0;
                                                        break block78;
                                                    }
                                                    var7_12 = 8;
                                                    var9_10 = var14_16;
lbl108:
                                                    // 3 sources

                                                    var10_13 = 0;
                                                    ** GOTO lbl115
lbl110:
                                                    // 1 sources

                                                    if (var10_13 != 0) ** GOTO lbl119
                                                    var7_12 = (var14_16 & 64) != 0 ? 60 : 64;
                                                    var9_10 = (var14_16 & 127) << 19 | (var14_16 & 128) << 24 | var7_12 << 24;
                                                    var7_12 = 32;
                                                    var10_13 = 1;
lbl115:
                                                    // 2 sources

                                                    var14_16 = 0;
                                                    var12_14 = var7_12;
                                                    var7_12 = var14_16;
                                                    break block79;
lbl119:
                                                    // 1 sources

                                                    var20_9.append("<illegal constant ");
                                                    t2.c((Appendable)var20_9, (int)8, (int)var14_16);
                                                    var20_9.append(':');
                                                    var18_8 /* !! */  = (int[])Integer.toHexString(var7_12);
                                                    var21_20 = Locale.US;
                                                    var20_9.append(var18_8 /* !! */ .toUpperCase(var21_20));
                                                    var20_9.append(':');
                                                    var20_9.append(Integer.toHexString(var10_13).toUpperCase(var21_20));
                                                    var5_11 = '>';
                                                    ** GOTO lbl147
                                                }
                                                case 'D': {
                                                    var7_12 = var8_6 & 15 | var8_6 >> 1 & 16;
                                                    var9_10 = var8_6 >> 20 & 3;
                                                    var20_9.append('D');
                                                    var20_9.append((4 << var9_10) - 1 & var7_12);
                                                    var20_9.append('[');
                                                    var20_9.append(var7_12 >> var9_10 >> 2);
                                                    var5_11 = ']';
lbl147:
                                                    // 2 sources

                                                    var20_9.append(var5_11);
                                                    var7_12 = var6_5;
lbl150:
                                                    // 3 sources

                                                    while (true) {
                                                        var6_5 = var3_2;
                                                        var10_13 = var8_6;
                                                        var6_5 = var13_15;
                                                        break block0;
                                                        break;
                                                    }
                                                }
                                                case 'C': {
                                                    var7_12 = var6_5;
                                                    var17_19 = var8_6 >> 12 & 15 | (var8_6 >> 22 & 1) << 4;
                                                    var15_17 = var8_6 & 15;
                                                    var14_16 = var8_6 >> 6 & 3;
                                                    var16_18 = var8_6 >> 8 & 3;
                                                    var12_14 = var16_18 + 1;
                                                    var6_5 = var8_6 >> 5 & 1;
                                                    if (var6_5 != 0 && var12_14 == 1) {
                                                        var9_10 = var16_18 + 2;
                                                    } else {
                                                        ++var6_5;
                                                        var9_10 = var12_14;
                                                    }
                                                    var20_9.append('{');
                                                    if (var6_5 > 1) {
                                                        for (var10_13 = 0; var10_13 != var9_10; ++var10_13) {
                                                            if (var10_13 != 0) {
                                                                var20_9.append(',');
                                                            }
                                                            var20_9.append('D');
                                                            var20_9.append(var17_19 + var10_13 * var6_5);
                                                            var20_9.append("[]");
                                                        }
                                                    } else {
                                                        var20_9.append('D');
                                                        var20_9.append(var17_19);
                                                        if (var9_10 != 1) {
                                                            var20_9.append("[]-D");
                                                            var20_9.append(var17_19 + var9_10 - 1);
                                                        }
                                                        var20_9.append("[]");
                                                    }
                                                    var20_9.append("}, [");
                                                    var18_8 /* !! */  = (int[])n.e;
                                                    var20_9.append((String)var18_8 /* !! */ [var8_6 >> 16 & 15]);
                                                    if ((var8_6 >> 4 & 1) != 0) {
                                                        var6_5 = var9_10 = var12_14 * 8 << var14_16;
                                                        if (var16_18 == 3) {
                                                            var6_5 = var9_10;
                                                            if (var14_16 > 1) {
                                                                var6_5 = var9_10 >> 1;
                                                            }
                                                        }
                                                        if (var16_18 != 2 && (var16_18 != 0 || var14_16 != 0)) {
                                                            var20_9.append(" :");
                                                            var20_9.append(var6_5);
                                                        } else {
                                                            var20_9.append(" :<bad align ");
                                                            var20_9.append(var6_5);
                                                            var20_9.append('>');
                                                        }
                                                    }
                                                    var20_9.append(']');
                                                    if (var15_17 == 13) {
                                                        var20_9.append('!');
                                                    } else if (var15_17 != 15) {
                                                        var20_9.append(", ");
                                                        var20_9.append((String)var18_8 /* !! */ [var15_17]);
                                                    }
                                                    var6_5 = var3_2;
                                                    var10_13 = var8_6;
                                                    var6_5 = var13_15;
                                                    break block0;
                                                }
                                                case 'B': {
                                                    var14_16 = var8_6 & 15;
                                                    var10_13 = var8_6 >> 4;
                                                    var12_14 = var10_13 & 15;
                                                    var16_18 = var8_6 >> 10 & 3;
                                                    var15_17 = (var8_6 >> 8 & 3) + 1;
                                                    if (var15_17 > 1 && var16_18 > 0) {
                                                        var7_12 = (var12_14 & 1 << var16_18) != 0 ? 2 : 1;
                                                        var9_10 = var7_12;
                                                    } else {
                                                        var9_10 = 1;
                                                    }
                                                    if (var15_17 == 1) ** GOTO lbl291
                                                    if (var15_17 == 2) ** GOTO lbl285
                                                    if (var15_17 == 3) ** GOTO lbl280
                                                    if (var15_17 != 4) {
                                                        var0 = new StringBuilder();
                                                        var0.append("150 Invalid length ");
                                                        var0.append(var15_17);
                                                        var0.append(" for format char '");
                                                        var0.append(var5_11);
                                                        var0.append("'; ");
                                                        var0.append(var11_7);
                                                        var0.append("; ");
                                                        var0.append(var13_15);
                                                        var0.append("; '");
                                                        var0.append((String)var19_4);
                                                        var0.append("'");
                                                        throw new RuntimeException(var0.toString());
                                                    }
                                                    if (var16_18 != 2) ** GOTO lbl277
                                                    var7_12 = var10_13 & 3;
                                                    if (var7_12 == 3) {
                                                        return null;
                                                    }
                                                    var7_12 *= 64;
                                                    ** GOTO lbl302
lbl277:
                                                    // 1 sources

                                                    if ((var10_13 & 1) == 0) ** GOTO lbl301
                                                    var7_12 = 32;
                                                    ** GOTO lbl289
lbl280:
                                                    // 1 sources

                                                    if (var16_18 == 2) {
                                                        if ((var10_13 & 3) != 0) return null;
                                                    }
                                                    if ((var10_13 & 1) != 0) {
                                                        return null;
                                                    }
                                                    ** GOTO lbl301
lbl285:
                                                    // 1 sources

                                                    if (var16_18 == 2 && (var10_13 & 2) != 0) {
                                                        return null;
                                                    }
                                                    if ((var10_13 & 1) == 0) ** GOTO lbl301
                                                    var7_12 = 16;
lbl289:
                                                    // 2 sources

                                                    var7_12 <<= var16_18;
                                                    ** GOTO lbl302
lbl291:
                                                    // 1 sources

                                                    var7_12 = 1 << var16_18;
                                                    if ((var12_14 & var7_12) != 0) {
                                                        return null;
                                                    }
                                                    if (var16_18 <= 0) ** GOTO lbl301
                                                    var10_13 = var7_12 - 1;
                                                    if ((var7_12 = var12_14 & var10_13) == var10_13) {
                                                        var7_12 = 8 << var16_18;
                                                    } else {
                                                        if (var7_12 != 0) {
                                                            return null;
                                                        }
lbl301:
                                                        // 6 sources

                                                        var7_12 = 0;
                                                    }
lbl302:
                                                    // 4 sources

                                                    var20_9.append('{');
                                                    for (var10_13 = 0; var10_13 < var15_17; ++var10_13) {
                                                        if (var10_13 != 0) {
                                                            var20_9.append(',');
                                                        }
                                                        var20_9.append('D');
                                                        var20_9.append(var10_13 * var9_10 + (var8_6 >> 12 & 15 | (var8_6 >> 22 & 1) << 4));
                                                        var20_9.append('[');
                                                        var20_9.append(var12_14 >> var16_18 + 1);
                                                        var20_9.append(']');
                                                    }
                                                    var20_9.append("}, [");
                                                    var18_8 /* !! */  = (int[])n.e;
                                                    var20_9.append((String)var18_8 /* !! */ [var8_6 >> 16 & 15]);
                                                    if (var7_12 != 0) {
                                                        var20_9.append(" :");
                                                        var20_9.append(var7_12);
                                                    }
                                                    var20_9.append(']');
                                                    if (var14_16 == 13) ** GOTO lbl379
                                                    if (var14_16 == 15) ** GOTO lbl388
                                                    var20_9.append(", ");
                                                    var18_8 /* !! */  = var18_8 /* !! */ [var14_16];
                                                    ** GOTO lbl386
                                                }
                                                case 'A': 
                                            }
                                            var12_14 = var8_6 >> 12 & 15 | (var8_6 >> 22 & 1) << 4;
                                            var14_16 = var8_6 & 15;
                                            var9_10 = var8_6 >> 4 & 3;
                                            var7_12 = n.e.c[var8_6 >> 8 & 15];
                                            var10_13 = var7_12 & 15;
                                            var15_17 = (var7_12 >> 4) + 1;
                                            var20_9.append('{');
                                            if (var15_17 > 1) {
                                                for (var7_12 = 0; var7_12 != var10_13; ++var7_12) {
                                                    if (var7_12 != 0) {
                                                        var20_9.append(',');
                                                    }
                                                    var20_9.append('D');
                                                    var20_9.append(var7_12 * var15_17 + var12_14);
                                                }
                                            } else {
                                                var20_9.append('D');
                                                var20_9.append(var12_14);
                                                if (var10_13 != 1) {
                                                    var20_9.append("-D");
                                                    var20_9.append(var12_14 + var10_13 - 1);
                                                }
                                            }
                                            var20_9.append("}, [");
                                            var18_8 /* !! */  = (int[])n.e;
                                            var20_9.append((String)var18_8 /* !! */ [var8_6 >> 16 & 15]);
                                            if (var9_10 != 0) {
                                                var20_9.append(" :");
                                                var20_9.append(32 << var9_10);
                                            }
                                            var20_9.append(']');
                                            if (var14_16 != 13) ** GOTO lbl382
lbl379:
                                            // 2 sources

                                            var20_9.append('!');
                                            ** GOTO lbl388
lbl382:
                                            // 1 sources

                                            if (var14_16 == 15) ** GOTO lbl388
                                            var20_9.append(", ");
                                            var18_8 /* !! */  = var18_8 /* !! */ [var14_16];
lbl386:
                                            // 2 sources

                                            var20_9.append((String)var18_8 /* !! */ );
lbl388:
                                            // 4 sources

                                            var7_12 = var6_5;
                                            var6_5 = var3_2;
                                            var10_13 = var8_6;
                                            var6_5 = var13_15;
                                            break;
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
                                            var7_12 = var3_2;
                                            var9_10 = var6_5;
                                            var6_5 = n.j((String)var19_4, var7_12, var13_15, var8_6, (n)var0);
                                            var12_14 = n.a((n)var0);
                                            var14_16 = n.c((n)var0);
                                            var5_11 = n.g((String)var19_4, var7_12, var6_5);
                                            if (var5_11 == '\'') ** GOTO lbl527
                                            if (var5_11 == '?') ** GOTO lbl520
                                            if (var5_11 == 'D') ** GOTO lbl471
                                            if (var5_11 == '`') ** GOTO lbl509
                                            if (var5_11 == 'r') ** GOTO lbl503
                                            if (var5_11 == 'd') ** GOTO lbl499
                                            if (var5_11 == 'e') ** GOTO lbl494
                                            switch (var5_11) {
                                                default: {
                                                    var0 = new StringBuilder();
                                                    var0.append("50 Invalid format char '");
                                                    var0.append(var5_11);
                                                    var0.append("'; ");
                                                    var0.append(var11_7);
                                                    var0.append("; ");
                                                    var0.append(var6_5);
                                                    var0.append("; '");
                                                    var0.append((String)var19_4);
                                                    var0.append("'");
                                                    throw new RuntimeException(var0.toString());
                                                }
                                                case 'S': 
                                                case 'T': 
                                                case 'U': {
                                                    var10_13 = 8 << var5_11 - 83;
                                                    var5_11 = n.g((String)var19_4, var7_12, ++var6_5);
                                                    if (var5_11 < 48 || var5_11 > 57) ** GOTO lbl435
                                                    var7_12 = var5_11 - 48;
                                                    ** GOTO lbl437
lbl435:
                                                    // 1 sources

                                                    if (var5_11 < 97 || var5_11 > 102) ** GOTO lbl449
                                                    var7_12 = var5_11 - 87;
lbl437:
                                                    // 2 sources

                                                    if (var12_14 >= var7_12 >> 2 && var12_14 <= (var7_12 & 3)) {
                                                        var7_12 = var10_13 << var12_14;
                                                    } else {
                                                        var20_9.append("<illegal width ");
                                                        var20_9.append(var10_13 << var12_14);
                                                        var20_9.append('>');
                                                        var7_12 = var9_10;
                                                        var10_13 = var8_6;
                                                        break block0;
                                                    }
lbl449:
                                                    // 1 sources

                                                    var0 = new StringBuilder();
                                                    var0.append("40 Invalid format char '");
                                                    var0.append(var5_11);
                                                    var0.append("'; ");
                                                    var0.append(var11_7);
                                                    var0.append("; ");
                                                    var0.append(var6_5);
                                                    var0.append("; '");
                                                    var0.append((String)var19_4);
                                                    var0.append("'");
                                                    throw new RuntimeException(var0.toString());
                                                }
                                                case 'R': {
                                                    if ((var8_6 & 64) != 0) break;
lbl471:
                                                    // 2 sources

                                                    var20_9.append('D');
                                                    var20_9.append(var12_14);
                                                    var10_13 = var8_6;
                                                    var7_12 = var9_10;
                                                    break block0;
                                                }
                                                case 'Q': 
                                            }
                                            if ((var12_14 & 1) != 0) {
                                                var20_9.append("<illegal reg Q");
                                                var20_9.append(var12_14 >> 1);
                                                var18_8 /* !! */  = (int[])".5>";
                                            } else {
                                                var20_9.append('Q');
                                                var7_12 = var12_14 >> 1;
                                                var20_9.append(var7_12);
                                                var10_13 = var8_6;
                                                var7_12 = var9_10;
                                                break;
                                            }
lbl494:
                                            // 1 sources

                                            var20_9.append((1 << var14_16) - var12_14);
                                            var10_13 = var8_6;
                                            var7_12 = var9_10;
                                            break;
lbl499:
                                            // 1 sources

                                            var20_9.append(var12_14);
                                            var7_12 = var12_14;
                                            break block81;
lbl503:
                                            // 1 sources

                                            var18_8 /* !! */  = (int[])n.e[var12_14];
                                            var20_9.append((String)var18_8 /* !! */ );
                                            var10_13 = var8_6;
                                            var7_12 = var9_10;
                                            break;
lbl509:
                                            // 1 sources

                                            var13_15 = var6_5 + 1;
                                            var5_11 = n.g((String)var19_4, var7_12, var13_15);
                                            var10_13 = var8_6;
                                            var6_5 = var13_15;
                                            var7_12 = var9_10;
                                            if (var12_14 != 0) break;
                                            n.d(var20_9, var5_11);
                                            var10_13 = var8_6;
                                            var6_5 = var13_15;
                                            var7_12 = var9_10;
                                            break;
lbl520:
                                            // 1 sources

                                            var10_13 = var6_5 + (1 << var14_16);
                                            n.d(var20_9, n.g((String)var19_4, var7_12, var10_13 - var12_14));
                                            n.g((String)var19_4, var7_12, var10_13);
                                            var6_5 = var9_10;
                                            var9_10 = var10_13;
                                            continue block17;
lbl527:
                                            // 1 sources

                                            var13_15 = var6_5 + 1;
                                            var5_11 = n.g((String)var19_4, var7_12, var13_15);
                                            var10_13 = var8_6;
                                            var6_5 = var13_15;
                                            var7_12 = var9_10;
                                            if (var12_14 != (1 << var14_16) - 1) break;
                                            n.d(var20_9, var5_11);
                                            var10_13 = var8_6;
                                            var6_5 = var13_15;
                                            var7_12 = var9_10;
                                            break;
                                        }
                                    }
                                    break block83;
                                }
                                var7_12 = var3_2;
                                var7_12 = var6_5;
                                var20_9.append('%');
                                var10_13 = var8_6;
                                var6_5 = var13_15;
                            }
                            var8_6 = var3_2;
                            var8_6 = var10_13;
                        }
                        var9_10 = var3_2;
                        var9_10 = var6_5;
                        var6_5 = var7_12;
                    }
                    if (var6_5 <= 32) {
                        if (var6_5 >= -16) return (int[])var20_9.toString();
                    }
                    var20_9.append("\t ; 0x");
                    var20_9.append(Integer.toHexString(var6_5).toUpperCase(Locale.US));
                    return (int[])var20_9.toString();
                }
                for (var10_13 = 7; var10_13 >= 0; --var10_13) {
                    var12_14 = (var14_16 >> var10_13 & 1) != 0 ? 255 : 0;
                    if (var10_13 <= 3) {
                        var9_10 = var9_10 << 8 | var12_14;
                        continue;
                    }
                    var7_12 = var7_12 << 8 | var12_14;
                }
                var12_14 = 64;
                var10_13 = 0;
            }
            var20_9.append('#');
            if (var12_14 == 8 || var12_14 == 16 || var12_14 == 32) break block84;
            if (var12_14 != 64) {
                var0 = new StringBuilder();
                var0.append("160 Invalid size ");
                var0.append(var12_14);
                var0.append(" for format char '");
                var0.append(var5_11);
                var0.append("'; ");
                var0.append(var11_7);
                var0.append("; ");
                var0.append(var13_15);
                var0.append("; '");
                var0.append((String)var19_4);
                var0.append("'");
                throw new RuntimeException(var0.toString());
            }
            t2.c((Appendable)var20_9, (int)8, (int)var7_12);
            t2.c((Appendable)var20_9, (int)8, (int)var9_10);
            var7_12 = var6_5;
            ** GOTO lbl150
        }
        if (var10_13 != 0) {
            var20_9.append(Float.intBitsToFloat(var9_10));
        } else {
            var20_9.append(var9_10);
        }
        var20_9.append("\t ; 0x");
        t2.c((Appendable)var20_9, (int)(var12_14 >> 2), (int)var9_10);
        var7_12 = var6_5;
        ** while (true)
    }

    private static long[] $d2j$hex$6ed771d1$decode_J(String src) {
        byte[] d2 = n.e.$d2j$hex$6ed771d1$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s.get(data);
        return data;
    }

    private static int[] $d2j$hex$6ed771d1$decode_I(String src) {
        byte[] d2 = n.e.$d2j$hex$6ed771d1$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s.get(data);
        return data;
    }

    private static short[] $d2j$hex$6ed771d1$decode_S(String src) {
        byte[] d2 = n.e.$d2j$hex$6ed771d1$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s.get(data);
        return data;
    }

    private static byte[] $d2j$hex$6ed771d1$decode_B(String src) {
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
