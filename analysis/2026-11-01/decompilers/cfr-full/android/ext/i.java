/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.e1;
import catch_.me_.if_.you_.can_.MainActivity;

public abstract class i {
    static float a;
    static final String b;
    static final String c;
    static final String d;
    static final String e;

    static {
        String string2;
        a = 1.0f * 113.5f - 12.1f;
        b = "catch_#me_#if_#you_#can_".replace('#', '.').intern();
        c = "@ame@uardian".replace('@', 'G').intern();
        try {
            string2 = MainActivity.class.getPackage().getName();
        }
        catch (Throwable throwable) {
            string2 = "Lcatch_/me_/if_/you_/can_;".replace('/', '.');
            string2 = string2.substring(1, string2.length() - 1);
            e1.a(throwable);
        }
        d = string2.intern();
        e = "Lcar$GameGuardian~Lcar$".replace("Lcar$", "").split("~", 2)[0].intern();
    }

    public static final void a() {
    }
}

