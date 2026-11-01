package android.ext;

import android.content.DialogInterface;
import catch_.me_.if_.you_.can_.R$string;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class Config$k extends Config$s {
    Config$k(int i, int i2, int[] iArr, int i3, String str, boolean z) {
        super(i, i2, iArr, i3, str, z);
    }

    private String l(String str) {
        Locale localeD;
        try {
            if (str.length() == 0) {
                localeD = k.c();
                str = Tools.N1(R$string.default_);
            } else {
                localeD = k.d(str);
            }
            String str2 = "";
            try {
                str2 = String.format(localeD, "\n[%,.1f | %.2e]", Double.valueOf(-1234.0d), Double.valueOf(-4.56E-78d));
            } catch (Throwable th) {
                e1.a(th);
            }
            return str + str2;
        } catch (Throwable th2) {
            e1.a(th2);
            return str;
        }
    }

    private String[] m() {
        return new String[]{"", "en_US", "in_ID", "ru_RU"};
    }

    @Override // android.ext.Config$p
    protected void d() {
        if (this.f42d <= 0) {
            return;
        }
        String[] strArrM = m();
        int i = this.f42d;
        if (i >= strArrM.length) {
            return;
        }
        k.j(k.d(strArrM[i]));
    }

    @Override // android.ext.Config$s, android.ext.Config$p
    public boolean e(DialogInterface dialogInterface, int i) {
        boolean zE = super.e(dialogInterface, i);
        if (zE) {
            ConfigListAdapter.m();
        }
        return zE;
    }

    @Override // android.ext.Config$s
    protected void i() {
        super.i();
        if (this.l == null) {
            String[] strArrM = m();
            CharSequence[] charSequenceArr = new CharSequence[strArrM.length];
            for (int i = 0; i < strArrM.length; i++) {
                charSequenceArr[i] = l(strArrM[i]);
            }
            this.l = charSequenceArr;
        }
    }
}
