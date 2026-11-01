package android.ext;

import android.content.Context;
import android.content.DialogInterface;
import catch_.me_.if_.you_.can_.R$color;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class Config$a extends Config$OptionMultiChoice {
    private CharSequence[] o;
    private CharSequence[] p;
    private int[] q;

    Config$a(int i, int i2, int[] iArr, int i3, String str, boolean z) {
        super(i, i2, iArr, i3, str, z);
    }

    @Override // android.ext.Config$p
    public CharSequence a() {
        if (this.m == null) {
            i();
        }
        CharSequence[] charSequenceArr = new CharSequence[this.m.length * 2];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.m;
            if (i >= iArr.length) {
                return Tools.x((CharSequence[]) Arrays.copyOf(charSequenceArr, i2));
            }
            int i3 = iArr[i];
            if ((this.f42d & i3) == i3) {
                if (i2 > 0) {
                    charSequenceArr[i2] = ",";
                    i2++;
                }
                charSequenceArr[i2] = this.o[i];
                i2++;
            }
            i++;
        }
    }

    @Override // android.ext.Config$p
    protected void d() {
        this.f40b = 262207;
    }

    @Override // android.ext.Config$OptionMultiChoice, android.ext.Config$s, android.ext.Config$p
    public boolean e(DialogInterface dialogInterface, int i) {
        c2 c2Var;
        boolean zE = super.e(dialogInterface, i);
        if (zE && (c2Var = MainService.instance.f216f) != null) {
            c2Var.write("gg.setRanges(");
            Script$Consts.a(c2Var, c2Var.f697c.f371a, this.f42d);
            c2Var.write(")\n");
        }
        return zE;
    }

    @Override // android.ext.Config$s
    protected void i() {
        super.i();
        if (this.m == null) {
            int iD0 = Tools.d0(R$color.region_good);
            int iD1 = Tools.d0(R$color.region_good);
            int iD2 = Tools.d0(R$color.region_good);
            int iD3 = Tools.d0(R$color.region_good);
            int iD4 = Tools.d0(R$color.region_good);
            int iD5 = Tools.d0(R$color.region_good);
            int iD6 = Tools.d0(R$color.region_good);
            int iD7 = Tools.d0(R$color.region_other);
            int iD8 = Tools.d0(R$color.region_other);
            int iD9 = Tools.d0(R$color.region_other);
            int iD10 = Tools.d0(R$color.region_other);
            int[] iArr = {2, 1, 4, 8, 16, 262144, 32, 65536, 64, 524288, 1048576, -2080896, 131072, 16384, 32768};
            int[] iArr2 = {iD0, iD1, iD2, iD3, iD4, iD5, iD6, iD7, iD8, iD9, iD10, Tools.d0(R$color.region_slow), Tools.d0(R$color.region_bad), Tools.d0(R$color.region_code), Tools.d0(R$color.region_system_code)};
            CharSequence[] charSequenceArr = {Tools.t("Jh: Java heap", iD0), Tools.t("Ch: C++ heap", iD1), Tools.t("Ca: C++ alloc", iD2), Tools.t("Cd: C++ .data", iD3), Tools.t("Cb: C++ .bss", iD4), Tools.t("PS: PPSSPP", iD5), Tools.t("A: Anonymous", iD6), Tools.t("J: Java", iD7), Tools.t("S: Stack", iD8), Tools.t("As: Ashmem", iD9), Tools.t("V: Video", iD10), Tools.t(b2.g("O: Other (__slow__)"), iArr2[11]), Tools.t(b2.g("B: Bad (__dangerous__)"), iArr2[12]), Tools.t(b2.g("Xa: Code app (__dangerous__)"), iArr2[13]), Tools.t(b2.g("Xs: Code system (__dangerous__)"), iArr2[14])};
            CharSequence[] charSequenceArr2 = new CharSequence[15];
            for (int i = 0; i < 15; i++) {
                charSequenceArr2[i] = Tools.t(charSequenceArr[i].toString().split(":")[0], iArr2[i]);
            }
            this.q = iArr2;
            this.m = iArr;
            this.p = charSequenceArr;
            this.o = charSequenceArr2;
            this.k = null;
            RegionList.k(iArr, charSequenceArr2, iArr2);
        }
        CharSequence[] charSequenceArr3 = new CharSequence[this.m.length];
        CharSequence[] charSequenceArr4 = this.p;
        Context contextF0 = Tools.f0();
        for (int i2 = 0; i2 < charSequenceArr4.length; i2++) {
            String string = charSequenceArr4[i2].toString();
            try {
                string = string + " [" + Tools.U(contextF0, RegionList.d(i2)) + ']';
            } catch (Throwable th) {
                e1.a(th);
                n0.h(Thread.currentThread(), th, false);
            }
            charSequenceArr3[i2] = Tools.t(string, this.q[i2]);
        }
        this.l = charSequenceArr3;
    }
}
