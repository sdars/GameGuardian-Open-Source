/*
 * Decompiled with CFR 0.152.
 */
package g;

import g.c;
import g.g;
import lasm.b;

public class f
extends c {
    final b q;

    public f(b b4) {
        this.q = b4;
        this.e = new g(null, null);
    }

    @Override
    int S(int n3, int n4) {
        return this.q.g(n3);
    }

    @Override
    public int T(int n3, int n4, int n5, int n6) {
        return super.T(n3, n4, n5, n6);
    }

    @Override
    public int U(int n3, int n4, int n5) {
        return super.U(n3, n4, n5);
    }

    @Override
    public int V(int n3, int n4, int n5) {
        return super.V(n3, n4, n5);
    }

    @Override
    public int W(int n3, int n4) {
        return super.W(n3, n4);
    }

    public void o1(int n3, int n4, int n5) {
        if (n5 <= 511) {
            this.T(36, n3, n4, n5);
        } else {
            this.T(36, n3, n4, 0);
            this.S(n5, this.e.d);
        }
    }
}

