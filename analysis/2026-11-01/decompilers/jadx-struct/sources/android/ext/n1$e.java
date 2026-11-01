package android.ext;

import android.widget.Filter;
import android.widget.Filter$FilterResults;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
class n1$e extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    n f1132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f1133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ n1 f1134c;

    private n1$e(n1 n1Var) {
        this.f1134c = n1Var;
        this.f1132a = null;
        this.f1133b = null;
    }

    /* synthetic */ n1$e(n1 n1Var, n1$a n1_a) {
        this(n1Var);
    }

    private String a(String str) {
        return str.toLowerCase(Locale.US).replace(t1.f1251a, "");
    }

    @Override // android.widget.Filter
    protected Filter$FilterResults performFiltering(CharSequence charSequence) {
        n nVar;
        Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        int[] iArrD = null;
        filter$FilterResults.values = null;
        try {
            boolean z = (this.f1134c.j & 12) == 0;
            if (charSequence != null && charSequence.length() > 0 && this.f1134c.E()) {
                String string = charSequence.toString();
                if (z) {
                    string = a(string);
                }
                String strK1 = Tools.k1(string);
                e1.d("Filter: '" + strK1 + '\'');
                Pattern patternCompile = Pattern.compile(strK1, 8);
                if ((this.f1134c.j & 48) == 0) {
                    nVar = null;
                } else {
                    nVar = this.f1132a;
                    if (nVar == null) {
                        nVar = new n();
                        this.f1132a = nVar;
                    }
                }
                if ((this.f1134c.j & 64) != 0 && (iArrD = this.f1133b) == null) {
                    iArrD = m.d();
                    this.f1133b = iArrD;
                }
                int iS = (short) this.f1134c.s();
                short[] sArr = new short[iS];
                int i = 0;
                for (short s = 0; s < iS; s = (short) (s + 1)) {
                    String strZ = this.f1134c.z(nVar, iArrD, s);
                    if (z) {
                        strZ = a(strZ);
                    }
                    if (patternCompile.matcher(strZ).find()) {
                        sArr[i] = s;
                        i++;
                    }
                }
                filter$FilterResults.values = Arrays.copyOf(sArr, i);
            }
        } catch (Throwable th) {
            e1.g("Failed filter", th);
            n0.h(Thread.currentThread(), th, false);
        }
        return filter$FilterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter$FilterResults filter$FilterResults) {
        n1 n1Var = this.f1134c;
        n1Var.f1117c = (short[]) filter$FilterResults.values;
        n1Var.P();
    }
}
