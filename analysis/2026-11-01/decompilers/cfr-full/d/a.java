/*
 * Decompiled with CFR 0.152.
 */
package d;

import android.ext.c;
import d.b;

public class a {
    private long[] a;
    private int[] b;
    private boolean[] c;
    int d;

    public a() {
        this(0);
    }

    public a(int n3) {
        this.h(d.b.c(n3));
    }

    private void g() {
        int n3 = this.d;
        int n4 = n3 < 6 ? 12 : n3 >> 1;
        this.h(n3 + n4);
    }

    private void h(int n3) {
        boolean[] blArray;
        int[] nArray;
        long[] lArray;
        if (n3 == 0) {
            lArray = d.b.e;
            nArray = d.b.d;
            blArray = d.b.g;
        } else {
            lArray = new long[n3 * 2];
            nArray = new int[n3];
            blArray = new boolean[n3];
        }
        n3 = this.d;
        if (n3 != 0) {
            System.arraycopy(this.a, 0, lArray, 0, n3 * 2);
            System.arraycopy(this.b, 0, nArray, 0, n3);
            System.arraycopy(this.c, 0, blArray, 0, n3);
        }
        this.a = lArray;
        this.b = nArray;
        this.c = blArray;
    }

    static IndexOutOfBoundsException j(int n3, int n4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid index ");
        stringBuilder.append(n3);
        stringBuilder.append(", size is ");
        stringBuilder.append(n4);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public void a(long l3, long l4, int n3, boolean bl) {
        int n4 = this.d;
        if (n4 == this.b.length) {
            this.g();
        }
        long[] lArray = this.a;
        int n5 = n4 * 2;
        lArray[n5] = l3;
        lArray[n5 + 1] = l4;
        this.b[n4] = n3;
        this.c[n4] = bl;
        this.d = n4 + 1;
    }

    public void b(int n3, boolean bl) {
        this.c[n3] = bl;
    }

    public boolean c(int n3) {
        return this.c[n3];
    }

    public void d() {
        this.d = 0;
    }

    public void e(int n3) {
        if (this.b.length < n3) {
            this.h(n3);
        }
    }

    public c f(int n3, c object) {
        int n4 = this.d;
        if (n3 >= n4) {
            d.a.j(n3, n4);
        }
        if (object == null) {
            object = this.a;
            n4 = n3 * 2;
            return new c((long)object[n4], (long)object[n4 + 1], this.b[n3]);
        }
        long[] lArray = this.a;
        n4 = n3 * 2;
        ((c)object).a = lArray[n4];
        ((c)object).b = lArray[n4 + 1];
        ((c)object).c = this.b[n3];
        return object;
    }

    public int i() {
        return this.d;
    }

    public void k() {
        int n3 = this.d;
        if (n3 == this.c.length) {
            return;
        }
        this.h(n3);
    }
}

