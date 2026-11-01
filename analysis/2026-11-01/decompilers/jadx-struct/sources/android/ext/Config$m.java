package android.ext;

import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Config$m extends Config$s {
    Config$m(int i, int i2, int[] iArr, int i3, String str, boolean z) {
        super(i, i2, iArr, i3, str, z);
    }

    private String l(int i) {
        if (i == Integer.MAX_VALUE) {
            return b2.f(R$string.yes);
        }
        if (i == 0) {
            return b2.f(R$string.no);
        }
        return Tools.L1(b2.f(R$string.first_mb), Integer.valueOf(Math.round((i * 5.0f) / 1024.0f)));
    }

    @Override // android.ext.Config$s
    protected void i() {
        super.i();
        if (this.m == null) {
            int iE0 = Tools.E0();
            int iFloor = iE0 > 0 ? ((int) Math.floor(Math.log(iE0 / 5.0f) / Math.log(2.0d))) - 8 : 0;
            if (iFloor <= 0) {
                iFloor = 7;
            }
            if (iFloor >= 20) {
                iFloor = 20;
            }
            int i = iFloor + 2;
            int[] iArr = new int[i];
            CharSequence[] charSequenceArr = new CharSequence[i];
            iArr[0] = 0;
            charSequenceArr[0] = b2.f(R$string.no);
            int i2 = iFloor + 1;
            iArr[i2] = Integer.MAX_VALUE;
            charSequenceArr[i2] = b2.f(R$string.yes);
            String strF = b2.f(R$string.first_mb);
            for (int i3 = 1; i3 <= iFloor; i3++) {
                int i4 = 1 << (i3 + 8);
                iArr[i3] = i4;
                charSequenceArr[i3] = Tools.L1(strF, Integer.valueOf(Math.round((i4 * 5.0f) / 1024.0f)));
            }
            this.m = iArr;
            this.l = charSequenceArr;
            this.k = null;
        }
    }

    @Override // android.ext.Config$s, android.ext.Config$p
    public String toString() {
        return Tools.N1(this.f39a) + ": " + l(this.f42d);
    }
}
