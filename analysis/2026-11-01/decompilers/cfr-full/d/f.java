/*
 * Decompiled with CFR 0.152.
 */
package d;

import d.b;
import d.d;

public class f
implements Cloneable {
    private long[] a;
    private long[] b;
    private int c;

    public f(int n3) {
        if (n3 == 0) {
            long[] lArray = d.b.e;
            this.a = lArray;
            this.b = lArray;
        } else {
            n3 = d.b.c(n3);
            this.a = new long[n3];
            this.b = new long[n3];
        }
        this.c = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public f a() {
        f f4;
        Object var2_1 = null;
        try {
            f4 = (f)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return var2_1;
        }
        try {
            f4.a = (long[])this.a.clone();
            f4.b = (long[])this.b.clone();
            return f4;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            // empty catch block
        }
        return f4;
    }

    public int b(long l3) {
        return d.b.a(this.a, this.c, l3);
    }

    public long c(int n3) {
        return this.a[n3];
    }

    public boolean d(long l3, long l4) {
        int n3 = d.b.a(this.a, this.c, l3);
        if (n3 >= 0) {
            long[] lArray = this.b;
            if (lArray[n3] == l4) {
                return false;
            }
            lArray[n3] = l4;
        } else {
            this.a = d.d(this.a, this.c, n3 ^= 0xFFFFFFFF, l3);
            this.b = d.d(this.b, this.c, n3, l4);
            ++this.c;
        }
        return true;
    }

    public int e() {
        return this.c;
    }

    public void f() {
        this.a = new long[16];
        this.b = new long[16];
        this.c = 0;
    }

    public long g(int n3) {
        return this.b[n3];
    }

    public String toString() {
        if (this.e() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.c * 28);
        stringBuilder.append('{');
        for (int i3 = 0; i3 < this.c; ++i3) {
            if (i3 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.c(i3));
            stringBuilder.append('=');
            stringBuilder.append(this.g(i3));
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

