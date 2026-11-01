/*
 * Decompiled with CFR 0.152.
 */
package d;

import d.b;
import d.d;

public class e
implements Cloneable {
    private static final Object f = new Object();
    private boolean a = false;
    private long[] b;
    private Object[] c;
    private boolean[] d;
    private int e;

    public e() {
        this(16);
    }

    public e(int n3) {
        if (n3 == 0) {
            this.b = d.b.e;
            this.c = d.b.f;
            this.d = d.b.g;
        } else {
            n3 = d.b.c(n3);
            this.b = new long[n3];
            this.c = new Object[n3];
            this.d = new boolean[n3];
        }
        this.e = 0;
    }

    private void d() {
        int n3 = this.e;
        long[] lArray = this.b;
        Object[] objectArray = this.c;
        boolean[] blArray = this.d;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectArray[i3];
            int n5 = n4;
            if (object != f) {
                if (i3 != n4) {
                    lArray[n4] = lArray[i3];
                    objectArray[n4] = object;
                    blArray[n4] = blArray[i3];
                    objectArray[i3] = null;
                }
                n5 = n4 + 1;
            }
            n4 = n5;
        }
        this.a = false;
        this.e = n4;
    }

    public boolean a(int n3) {
        if (this.a) {
            this.d();
        }
        return this.d[n3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public e b() {
        e e4;
        Object var2_1 = null;
        try {
            e4 = (e)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return var2_1;
        }
        try {
            e4.b = (long[])this.b.clone();
            e4.c = (Object[])this.c.clone();
            e4.d = (boolean[])this.d.clone();
            return e4;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            // empty catch block
        }
        return e4;
    }

    public Object c(long l3) {
        Object object;
        Object[] objectArray;
        Object object2;
        int n3 = d.b.a(this.b, this.e, l3);
        if (n3 >= 0 && (object2 = (objectArray = this.c)[n3]) != (object = f)) {
            objectArray[n3] = object;
            this.a = true;
            return object2;
        }
        return null;
    }

    public Object e(long l3) {
        return this.f(l3, null);
    }

    public Object f(long l3, Object object) {
        Object object2;
        int n3 = d.b.a(this.b, this.e, l3);
        if (n3 >= 0 && (object2 = this.c[n3]) != f) {
            return object2;
        }
        return object;
    }

    public int g(long l3) {
        if (this.a) {
            this.d();
        }
        return d.b.a(this.b, this.e, l3);
    }

    public long h(int n3) {
        if (this.a) {
            this.d();
        }
        return this.b[n3];
    }

    public Object i(long l3, Object object, byte by) {
        Object[] objectArray;
        int n3 = d.b.a(this.b, this.e, l3);
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        if (n3 >= 0) {
            Object[] objectArray2 = this.c;
            Object object2 = objectArray2[n3];
            objectArray2[n3] = object;
            if (by != 0) {
                object = this.d;
                bl = bl3;
                if (by == 1) {
                    bl = true;
                }
                object[n3] = bl;
            }
            return object2;
        }
        int n4 = ~n3;
        int n5 = this.e;
        if (n4 < n5 && (objectArray = this.c)[n4] == f) {
            this.b[n4] = l3;
            objectArray[n4] = object;
            if (by != 0) {
                object = this.d;
                if (by == 1) {
                    bl = true;
                }
                object[n4] = bl;
            }
            return null;
        }
        n3 = n4;
        if (this.a) {
            n3 = n4;
            if (n5 >= this.b.length) {
                this.d();
                n3 = ~d.b.a(this.b, this.e, l3);
            }
        }
        this.b = d.d.d(this.b, this.e, n3, l3);
        this.c = d.d.e(this.c, this.e, n3, object);
        object = this.d;
        n4 = this.e;
        bl = bl2;
        if (by == 1) {
            bl = true;
        }
        this.d = d.d.f((boolean[])object, n4, n3, bl);
        ++this.e;
        return null;
    }

    public Object j(int n3) {
        Object[] objectArray = this.c;
        Object object = objectArray[n3];
        Object object2 = f;
        if (object != object2) {
            objectArray[n3] = object2;
            this.a = true;
            return object;
        }
        return null;
    }

    public void k(int n3, boolean bl) {
        if (this.a) {
            this.d();
        }
        this.d[n3] = bl;
    }

    public int l() {
        if (this.a) {
            this.d();
        }
        return this.e;
    }

    public void m() {
        this.b = new long[16];
        this.c = new Object[16];
        this.d = new boolean[16];
        this.e = 0;
        this.a = false;
    }

    public Object n(int n3) {
        if (this.a) {
            this.d();
        }
        return this.c[n3];
    }

    public String toString() {
        if (this.l() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.e * 28);
        stringBuilder.append('{');
        for (int i3 = 0; i3 < this.e; ++i3) {
            if (i3 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.h(i3));
            stringBuilder.append('=');
            Object object = this.n(i3);
            if (object != this) {
                stringBuilder.append(object);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append(" [");
            stringBuilder.append(this.a(i3));
            stringBuilder.append("]");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

