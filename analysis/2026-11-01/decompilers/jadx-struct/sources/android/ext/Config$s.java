package android.ext;

import android.content.DialogInterface;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class Config$s extends Config$p {
    int[] k;
    CharSequence[] l;
    int[] m;

    public Config$s(int i, int i2, int[] iArr, int i3, String str, boolean z) {
        super(i, i2, i3, str, z);
        this.l = null;
        this.m = null;
        this.k = iArr;
    }

    public Config$s(int i, int i2, int[] iArr, int i3, String str, boolean z, int i4) {
        this(i, i2, iArr, i3, str, z);
        this.h = i4;
    }

    @Override // android.ext.Config$p
    public void b() {
        i();
        CharSequence[] charSequenceArr = this.l;
        int[] iArr = this.k;
        if (iArr != null) {
            charSequenceArr = new CharSequence[iArr.length];
            int i = 0;
            while (true) {
                int[] iArr2 = this.k;
                if (i >= iArr2.length) {
                    break;
                }
                charSequenceArr[i] = b2.f(iArr2[i]);
                i++;
            }
        }
        j(charSequenceArr);
    }

    @Override // android.ext.Config$p
    public boolean e(DialogInterface dialogInterface, int i) {
        this.f42d = h(i);
        Config.k();
        Tools.D(dialogInterface);
        return true;
    }

    public int h(int i) {
        i();
        int[] iArr = this.m;
        return iArr == null ? i : iArr[i];
    }

    protected void i() {
    }

    protected void j(CharSequence[] charSequenceArr) {
        int iK = k(this.f40b);
        CharSequence[] charSequenceArr2 = new CharSequence[charSequenceArr.length];
        for (int i = 0; i < charSequenceArr.length; i++) {
            charSequenceArr2[i] = (i != iK || charSequenceArr[i] == null) ? charSequenceArr[i] : ((Object) charSequenceArr[i]) + " (" + b2.f(R$string.default_mark) + ')';
        }
        f.o(f.b().setCustomTitle(Config.c(this.f39a, this.h, this.f45g)).setSingleChoiceItems(charSequenceArr2, k(this.f42d), this));
    }

    public int k(int i) {
        i();
        if (this.m == null) {
            return i;
        }
        int i2 = 1;
        while (true) {
            int[] iArr = this.m;
            if (i2 >= iArr.length) {
                return 0;
            }
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
    }

    @Override // android.ext.Config$p
    public String toString() {
        CharSequence charSequenceF;
        try {
            int iK = k(this.f42d);
            int[] iArr = this.k;
            charSequenceF = iArr != null ? b2.f(iArr[iK]) : this.l[iK];
        } catch (IndexOutOfBoundsException unused) {
            charSequenceF = null;
        }
        if (charSequenceF == null) {
            charSequenceF = "int:" + this.f42d;
        }
        return Tools.N1(this.f39a) + ": " + ((Object) charSequenceF);
    }
}
