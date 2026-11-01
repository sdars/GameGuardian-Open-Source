/*
 * Decompiled with CFR 0.152.
 */
package e;

import java.io.Serializable;

public class f
implements Serializable {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;
    public f g;
    public f h;

    public f() {
    }

    public f(int n3, String string2) {
        this.a = n3;
        this.f = string2;
    }

    public static f a(int n3, String string2) {
        return new f(n3, string2);
    }

    public String toString() {
        return this.f;
    }
}

