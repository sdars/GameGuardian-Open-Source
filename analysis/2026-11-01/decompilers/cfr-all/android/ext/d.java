/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.MainService;
import android.ext.c;
import android.ext.e1;
import d.f;
import java.util.ArrayList;
import java.util.List;

public class d {
    private final f[] a;

    public d() {
        this(10);
    }

    public d(int n3) {
        f[] fArray = new f[7];
        for (int i3 = 0; i3 < 7; ++i3) {
            fArray[i3] = new f(n3);
        }
        this.a = fArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(long l3, int n3, a a4) {
        boolean bl;
        f f4;
        if ((n3 = Integer.numberOfTrailingZeros(n3)) < 7 && (n3 = (f4 = this.a[n3]).b(l3)) >= 0) {
            a4.a = f4.g(n3);
            bl = true;
        } else {
            bl = false;
        }
        a4.b = bl;
    }

    public List b() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        f[] fArray = this.a;
        block2: for (int i3 = 0; i3 < 7; ++i3) {
            f f4 = fArray[i3];
            int n3 = f4.e();
            if (n3 <= 0) continue;
            for (int i4 = 0; i4 < n3; ++i4) {
                Object object;
                try {
                    object = new c();
                    ((c)object).c = 1 << i3;
                    ((c)object).a = f4.c(i4);
                    ((c)object).b = f4.g(i4);
                    arrayList.add(object);
                    continue;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Concurent modification for ");
                    ((StringBuilder)object).append(i3);
                    e1.s(((StringBuilder)object).toString(), arrayIndexOutOfBoundsException);
                    continue block2;
                }
            }
        }
        return arrayList;
    }

    public boolean c(long l3, int n3, long l4) {
        if ((n3 = Integer.numberOfTrailingZeros(n3)) < 7) {
            return this.a[n3].d(l3, l4);
        }
        return false;
    }

    public void d() {
        f[] fArray = this.a;
        boolean bl = false;
        block2: for (int i3 = 0; i3 < 7; ++i3) {
            Object object = fArray[i3];
            int n3 = ((f)object).e();
            if (n3 <= 0) continue;
            boolean bl2 = bl;
            if (!bl) {
                bl2 = true;
            }
            int n4 = 0;
            while (true) {
                bl = bl2;
                if (n4 >= n3) continue block2;
                try {
                    c c4 = new c();
                    c4.c = 1 << i3 | 0x1000000;
                    c4.a = ((f)object).c(n4);
                    c4.b = ((f)object).g(n4);
                    c4.a();
                    ++n4;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Concurent modification for ");
                    ((StringBuilder)object).append(i3);
                    e1.s(((StringBuilder)object).toString(), arrayIndexOutOfBoundsException);
                    bl = bl2;
                    continue block2;
                }
            }
        }
        if (bl) {
            MainService.instance.e0();
        }
    }

    public int e() {
        f[] fArray = this.a;
        int n3 = 0;
        for (int i3 = 0; i3 < 7; ++i3) {
            n3 += fArray[i3].e();
        }
        return n3;
    }

    public void f() {
        f[] fArray = this.a;
        for (int i3 = 0; i3 < 7; ++i3) {
            fArray[i3].f();
        }
    }

    public static class a {
        public long a;
        public boolean b;
    }
}

