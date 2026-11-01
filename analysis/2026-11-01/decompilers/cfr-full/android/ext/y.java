/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.Tools;
import java.util.ArrayList;
import java.util.List;

public class y {
    private final List a = new ArrayList();

    public y a(CharSequence charSequence) {
        this.a.add(charSequence);
        return this;
    }

    public y b(String string2, CharSequence ... charSequenceArray) {
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n5;
            if ((n5 = string2.indexOf("%s", n3)) < 0) {
                this.a.add(string2.substring(n3, string2.length()));
                return this;
            }
            this.a.add(string2.substring(n3, n5));
            this.a.add(charSequenceArray[n4]);
            n3 = n5 + 2;
            ++n4;
        }
    }

    public int c() {
        return this.a.size();
    }

    public CharSequence d() {
        List list = this.a;
        return Tools.x(list.toArray(new CharSequence[list.size()]));
    }
}

