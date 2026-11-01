package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.os.Build;
import android.os.Build$VERSION;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f0$a0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0 f803a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0$a0(f0 f0Var, String str) {
        super(str);
        this.f803a = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0177 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #3 {all -> 0x0189, blocks: (B:37:0x0171, B:39:0x0177), top: B:76:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0185  */
    /* JADX WARN: Code duplicated, block: B:47:0x0193 A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #1 {all -> 0x01a5, blocks: (B:45:0x018d, B:47:0x0193), top: B:74:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x01af A[Catch: all -> 0x01c1, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:53:0x01a9, B:55:0x01af), top: B:72:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0202  */
    /* JADX WARN: Code duplicated, block: B:85:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01be A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0202, please report this as an issue */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean zEquals;
        String string;
        int i;
        int i2;
        int i3;
        String str;
        InOut inOut = this.f803a.f793b;
        try {
            String strH = e0.h();
            f0 f0Var = this.f803a;
            f0$n0 f0_n0O0 = f0Var.O0(strH);
            f0Var.f792a = f0_n0O0;
            e2.f745a = "";
            inOut.o(f0_n0O0.f918c, f0_n0O0.f917b);
            inOut.n(true);
            MainService.instance.q0();
            e1.o(f0_n0O0.f916a, f0_n0O0.f919d);
            byte[] bArrK = inOut.k();
            if (bArrK == null) {
                str = "DI: null";
            } else if (bArrK.length != 7) {
                str = "DI: " + bArrK.length;
            } else {
                w wVar = new w(bArrK);
                byte bE = wVar.e();
                InOut.p(bE == 8);
                byte bE2 = wVar.e();
                if (bE2 != 4) {
                    e1.i("DI: QE " + ((int) bE2));
                }
                this.f803a.f796e = wVar.f();
                str = "DI: " + ((int) bE) + " " + ((int) bE2) + " " + this.f803a.f796e;
            }
            e1.d(str);
            w wVar2 = new w(inOut.k());
            wVar2.e();
            byte[] bArr = new byte[wVar2.e()];
            wVar2.c(bArr);
            this.f803a.f798g = new String(bArr);
            e1.d("InOut: x64: " + InOut.m + "; QE_ALIGN: 4; " + this.f803a.f796e + "; " + this.f803a.f798g);
            this.f803a.m.start();
            MainService.instance.q0();
            inOut.m();
            this.f803a.v0((byte) 0);
        } catch (f0$l0 e2) {
            e1.l("start daemon failed", e2);
            String str2 = "" + e2.getMessage();
            StringBuilder sb = new StringBuilder();
            try {
                String str3 = Build.CPU_ABI;
                sb.append(str3);
                sb.append("; ");
                zEquals = "armeabi".equals(str3);
                try {
                    String str4 = Build.CPU_ABI2;
                    sb.append(str4);
                    sb.append("; ");
                    if ("armeabi".equals(str4)) {
                        zEquals = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    e1.s("Failed get ABI", th);
                    for (String str5 : Build.SUPPORTED_ABIS) {
                        sb.append(str5);
                        sb.append("; ");
                        if ("armeabi".equals(str5)) {
                            zEquals = true;
                        }
                    }
                    for (String str6 : Build.SUPPORTED_32_BIT_ABIS) {
                        sb.append(str6);
                        sb.append("; ");
                        if ("armeabi".equals(str6)) {
                            zEquals = true;
                        }
                    }
                    for (String str7 : Build.SUPPORTED_64_BIT_ABIS) {
                        sb.append(str7);
                        sb.append("; ");
                        if ("armeabi".equals(str7)) {
                            zEquals = true;
                        }
                    }
                    if (zEquals && b2.d("ydwa", "raw") == 0) {
                        str2 = str2 + "\n\n" + Tools.N1(R$string.try_arm_version) + ": " + i.f999a;
                    }
                    string = sb.toString();
                    if (string.contains("mips")) {
                        str2 = str2 + "\n\n" + b2.f(R$string.mips_arch);
                    }
                    String str8 = str2 + "\n\nABIs: " + string + '\n' + ((Object) e0.f730g) + '\n' + Build$VERSION.SDK_INT + '\n' + ((Object) e0.h);
                    e1.d("Supported ABIs: " + string);
                    f.o(f.b().setCustomTitle(Tools.g0(R$string.failed_load_daemon)).setMessage(str8).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
                    inOut.n(false);
                    MainService.instance.q0();
                    f0.r();
                }
            } catch (Throwable th2) {
                th = th2;
                zEquals = false;
            }
            try {
                while (i3 < r10) {
                    sb.append(str5);
                    sb.append("; ");
                    if ("armeabi".equals(str5)) {
                        zEquals = true;
                    }
                }
            } catch (Throwable th3) {
                e1.s("Failed get ABI", th3);
            }
            try {
                while (i2 < r10) {
                    sb.append(str6);
                    sb.append("; ");
                    if ("armeabi".equals(str6)) {
                        zEquals = true;
                    }
                }
            } catch (Throwable th4) {
                e1.s("Failed get ABI", th4);
            }
            try {
                while (i < r10) {
                    sb.append(str7);
                    sb.append("; ");
                    if ("armeabi".equals(str7)) {
                        zEquals = true;
                    }
                }
            } catch (Throwable th5) {
                e1.s("Failed get ABI", th5);
            }
            if (zEquals) {
                str2 = str2 + "\n\n" + Tools.N1(R$string.try_arm_version) + ": " + i.f999a;
            }
            string = sb.toString();
            if (string.contains("mips")) {
                str2 = str2 + "\n\n" + b2.f(R$string.mips_arch);
            }
            String str9 = str2 + "\n\nABIs: " + string + '\n' + ((Object) e0.f730g) + '\n' + Build$VERSION.SDK_INT + '\n' + ((Object) e0.h);
            e1.d("Supported ABIs: " + string);
            f.o(f.b().setCustomTitle(Tools.g0(R$string.failed_load_daemon)).setMessage(str9).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
            inOut.n(false);
            MainService.instance.q0();
        } catch (Throwable th6) {
            e1.l("start daemon failed", th6);
            n2.i(new f0$a0$a(this));
            inOut.n(false);
            MainService.instance.q0();
        }
        f0.r();
    }
}
