package android.ext;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1330a = new ArrayList();

    public y a(CharSequence charSequence) {
        this.f1330a.add(charSequence);
        return this;
    }

    public y b(String str, CharSequence... charSequenceArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int iIndexOf = str.indexOf("%s", i);
            if (iIndexOf < 0) {
                this.f1330a.add(str.substring(i, str.length()));
                return this;
            }
            this.f1330a.add(str.substring(i, iIndexOf));
            this.f1330a.add(charSequenceArr[i2]);
            i = iIndexOf + 2;
            i2++;
        }
    }

    public int c() {
        return this.f1330a.size();
    }

    public CharSequence d() {
        List list = this.f1330a;
        return Tools.x((CharSequence[]) list.toArray(new CharSequence[list.size()]));
    }
}
