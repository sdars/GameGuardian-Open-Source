package android.ext;

import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Config$e extends Config$OptionMultiChoice {
    Config$e(int i, int i2, int[] iArr, int i3, String str, boolean z) {
        super(i, i2, iArr, i3, str, z);
    }

    @Override // android.ext.Config$s
    protected void i() {
        super.i();
        if (this.m == null) {
            String str = " (" + b2.f(R$string.slow) + ')';
            this.m = new int[]{1, 2, 4, 8};
            this.l = new CharSequence[]{1 + str, 2 + str, 3 + str, 4 + str};
            this.k = null;
            if (this.j == null) {
                this.j = new Config$e$a(this);
            }
        }
    }
}
