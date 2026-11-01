package android.ext;

import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Config$n extends Config$s {
    Config$n(int i, int i2, int[] iArr, int i3, String str, boolean z) {
        super(i, i2, iArr, i3, str, z);
    }

    @Override // android.ext.Config$s, android.ext.Config$p
    public void b() {
        if (f1.y()) {
            super.b();
        }
    }

    @Override // android.ext.Config$s
    protected void i() {
        super.i();
        int length = Config.f28a.length;
        int[] iArr = this.m;
        if (iArr == null || iArr.length != length + 1) {
            int i = length + 1;
            int[] iArr2 = new int[i];
            CharSequence[] charSequenceArr = new CharSequence[i];
            int i2 = 0;
            iArr2[0] = 0;
            charSequenceArr[0] = b2.f(R$string.no);
            while (i2 < length) {
                int i3 = Config.f28a[i2];
                i2++;
                iArr2[i2] = i3;
                charSequenceArr[i2] = Config.f(i3);
            }
            this.m = iArr2;
            this.l = charSequenceArr;
            this.k = null;
        }
    }

    @Override // android.ext.Config$s, android.ext.Config$p
    public String toString() {
        return Tools.N1(this.f39a) + ": " + Config.f(this.f42d);
    }
}
