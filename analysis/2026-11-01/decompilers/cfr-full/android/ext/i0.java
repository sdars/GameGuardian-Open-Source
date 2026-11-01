/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.Tools;
import android.ext.c;
import android.ext.e1;
import android.ext.t2;

public abstract class i0 {
    private static long[] a = new long[12];

    static {
        for (int i3 = 0; i3 < 3; ++i3) {
            long l3 = (1L << (1 << i3) * 8) - 1L;
            long l4 = l3 >> 1;
            long l5 = l4 ^ 0xFFFFFFFFFFFFFFFFL;
            int n3 = i3 * 4;
            long[] lArray = a;
            lArray[n3] = l3 & l5;
            lArray[n3 + 1] = l4;
            lArray[n3 + 2] = l5;
            lArray[n3 + 3] = l3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(long l3, long l4, int n3) {
        n3 = c.y(n3);
        boolean bl = false;
        boolean bl2 = false;
        if (n3 == 3) {
            if (l3 >= l4) return bl2;
            return true;
        }
        long[] lArray = a;
        long l5 = lArray[n3 *= 4];
        long l6 = l3 & l5;
        long l7 = lArray[n3 + 1];
        if (l6 == (l5 & l4)) {
            bl2 = bl;
            if ((l3 & l7) >= (l4 & l7)) return bl2;
            return true;
        }
        bl2 = bl;
        if (l6 == 0L) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long b(long l3, int n3, boolean bl) {
        long l4 = l3;
        if (n3 == 3) return l4;
        n3 *= 4;
        if (bl) {
            l4 = a[n3 + 3];
            return l3 & l4;
        }
        long[] lArray = a;
        if ((lArray[n3] & l3) != 0L) return l3 | lArray[n3 + 2];
        l4 = lArray[n3 + 1];
        return l3 & l4;
    }

    public static String c(long l3, int n3) {
        return i0.d(l3, n3, false);
    }

    public static String d(long l3, int n3, boolean bl) {
        n3 = c.y(n3);
        l3 = i0.b(l3, n3, bl);
        String string2 = bl ? t2.e(1 << n3 + 1, l3) : i0.e(l3);
        return string2;
    }

    private static String e(long l3) {
        CharSequence charSequence = Tools.M1("%,d", "%d", null, l3);
        String string2 = charSequence;
        if (charSequence == null) {
            try {
                string2 = Long.toString(l3);
            }
            catch (Throwable throwable) {
                e1.s("Format fail 3", throwable);
                string2 = charSequence;
            }
        }
        charSequence = string2;
        if (string2 == null) {
            try {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("");
                ((StringBuilder)charSequence).append(l3);
                charSequence = ((StringBuilder)charSequence).toString();
            }
            catch (Throwable throwable) {
                e1.s("Format fail 4", throwable);
                charSequence = string2;
            }
        }
        string2 = charSequence;
        if (charSequence == null) {
            string2 = "fail";
        }
        return string2;
    }
}

