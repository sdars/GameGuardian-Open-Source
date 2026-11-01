/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package d;

import android.view.View;

public abstract class b {
    public static final String[] a = new String[0];
    public static final View[] b;
    public static final byte[] c;
    public static final int[] d;
    public static final long[] e;
    public static final Object[] f;
    public static final boolean[] g;

    static {
        c = new byte[0];
        d = new int[0];
        e = new long[0];
        f = new Object[0];
        g = new boolean[0];
        b = new View[0];
    }

    static int a(long[] lArray, int n3, long l3) {
        --n3;
        int n4 = 0;
        while (n4 <= n3) {
            int n5 = n4 + n3 >>> 1;
            long l4 = lArray[n5] - l3;
            long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l5 < 0) {
                n4 = n5 + 1;
                continue;
            }
            if (l5 > 0) {
                n3 = n5 - 1;
                continue;
            }
            return n5;
        }
        return ~n4;
    }

    public static int b(int n3) {
        for (int i3 = 4; i3 < 32; ++i3) {
            int n4 = (1 << i3) - 12;
            if (n3 > n4) continue;
            return n4;
        }
        return n3;
    }

    public static int c(int n3) {
        return d.b.b(n3 * 8) / 8;
    }
}

