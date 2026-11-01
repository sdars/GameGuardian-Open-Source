package android.ext;

import android.content.DialogInterface;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class Config$OptionMultiChoiceSh extends Config$OptionMultiChoice {
    private final int o;

    public Config$OptionMultiChoiceSh(int i, int i2, int[] iArr, int i3, String str, boolean z, int i4) {
        super(i, i2, iArr, i3, str, z);
        this.o = i4;
    }

    @Override // android.ext.Config$OptionMultiChoice, android.ext.Config$s, android.ext.Config$p
    public boolean e(DialogInterface dialogInterface, int i) {
        boolean zE = super.e(dialogInterface, i);
        if (zE) {
            Tools.H1(R$string.need_restart);
        }
        return zE;
    }

    @Override // android.ext.Config$s
    protected void i() {
        super.i();
        if (this.m == null) {
            int i = this.o;
            int[] iArr = new int[i];
            CharSequence[] charSequenceArr = new CharSequence[i];
            int i2 = 0;
            while (i2 < i) {
                iArr[i2] = 1 << i2;
                int i3 = i2 + 1;
                charSequenceArr[i2] = Integer.toString(i3);
                i2 = i3;
            }
            this.m = iArr;
            this.l = charSequenceArr;
            this.k = null;
        }
    }
}
