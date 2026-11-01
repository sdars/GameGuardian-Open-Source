/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences$Editor
 */
package android.ext;

import android.content.SharedPreferences;
import android.ext.Tools;
import java.util.Set;

public class g2
implements SharedPreferences.Editor {
    final SharedPreferences.Editor a;

    public g2() {
        this.a = Tools.M0().edit();
    }

    public g2(SharedPreferences.Editor editor) {
        this.a = editor;
    }

    public g2 a() {
        this.a.clear();
        return this;
    }

    public void apply() {
        this.a.apply();
    }

    public g2 b(String string2, boolean bl) {
        this.a.putBoolean(string2, bl);
        return this;
    }

    public g2 c(String string2, boolean bl, boolean bl2) {
        if (bl == bl2) {
            this.a.remove(string2);
        } else {
            this.a.putBoolean(string2, bl);
        }
        return this;
    }

    public boolean commit() {
        return this.a.commit();
    }

    public g2 d(String string2, float f4) {
        this.a.putFloat(string2, f4);
        return this;
    }

    public g2 e(String string2, float f4, float f5) {
        if (f4 == f5) {
            this.a.remove(string2);
        } else {
            this.a.putFloat(string2, f4);
        }
        return this;
    }

    public g2 f(String string2, int n3) {
        this.a.putInt(string2, n3);
        return this;
    }

    public g2 g(String string2, int n3, int n4) {
        if (n3 == n4) {
            this.a.remove(string2);
        } else {
            this.a.putInt(string2, n3);
        }
        return this;
    }

    public g2 h(String string2, long l3) {
        this.a.putLong(string2, l3);
        return this;
    }

    public g2 i(String string2, long l3, long l4) {
        if (l3 == l4) {
            this.a.remove(string2);
        } else {
            this.a.putLong(string2, l3);
        }
        return this;
    }

    public g2 j(String string2, String string3) {
        this.a.putString(string2, string3);
        return this;
    }

    public g2 k(String string2, String string3, String string4) {
        if (string3.equals(string4)) {
            this.a.remove(string2);
        } else {
            this.a.putString(string2, string3);
        }
        return this;
    }

    public g2 l(String string2, Set set) {
        this.a.putStringSet(string2, set);
        return this;
    }

    public g2 m(String string2) {
        this.a.remove(string2);
        return this;
    }
}

