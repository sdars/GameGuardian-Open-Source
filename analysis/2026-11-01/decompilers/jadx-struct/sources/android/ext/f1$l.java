package android.ext;

import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f1$l implements Runnable {
    f1$l() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if ((Config.f30c & 8) != 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrE = n0.e();
        for (int i = 2; i < strArrE.length; i += 2) {
            String str = strArrE[i];
            int i2 = i + 1;
            if (Tools.e1(strArrE[i2])) {
                sb.append('\n');
                sb.append(str);
                sb.append(" (");
                sb.append(strArrE[i2]);
                sb.append(')');
            }
        }
        if (sb.length() == 0) {
            return;
        }
        sb.append('\n');
        n2.i(f1.J(r.p, Tools.L1(b2.f(R$string.killers_found), sb.toString()), 8L, false));
    }
}
