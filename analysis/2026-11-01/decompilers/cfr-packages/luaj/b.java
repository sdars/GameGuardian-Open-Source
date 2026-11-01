/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import java.io.File;

public abstract class b {
    public static final int[] a = new int[]{96, 113, 65, 84, 80, 80, 92, 108, 60, 16, 60, 84, 108, 124, 124, 124, 124, 124, 124, 96, 96, 96, 104, 34, 188, 188, 188, 132, 228, 84, 80, 16, 98, 98, 4, 226, 20, 81, 80, 23, 124, 96, 124, 124, 124, 124, 124};

    public static int c(int n3) {
        return n3 >>> 6 & 0xFF;
    }

    public static int d(int n3) {
        return n3 >>> 6 & 0x3FFFFFF;
    }

    public static int e(int n3) {
        return n3 >>> 23 & 0x1FF;
    }

    public static int f(int n3) {
        return n3 >>> 14 & 0x3FFFF;
    }

    public static int g(int n3) {
        return n3 >>> 14 & 0x1FF;
    }

    public static int h(int n3) {
        return (n3 >>> 14 & 0x3FFFF) - 131071;
    }

    public static int i(int n3) {
        return n3 & 0x3F;
    }

    public static int j(int n3) {
        return n3 & 0xFFFFFEFF;
    }

    public static boolean k(int n3) {
        boolean bl = (n3 & 0x100) != 0;
        return bl;
    }

    public static int l(int n3) {
        return n3 | 0x100;
    }

    public static String m(String charSequence) {
        if (((String)charSequence).startsWith("=")) {
            return ((String)charSequence).substring(1);
        }
        CharSequence charSequence2 = charSequence;
        if (((String)charSequence).startsWith("@")) {
            charSequence2 = ((String)charSequence).substring(1);
        }
        charSequence = charSequence2;
        if (!new File((String)charSequence2).exists()) {
            charSequence = charSequence2;
            if (((String)charSequence2).length() > 69) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(((String)charSequence2).substring(0, 66));
                ((StringBuilder)charSequence).append("...");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("[string '");
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append("']");
            charSequence = ((StringBuilder)charSequence2).toString();
        }
        return charSequence;
    }

    public static int n(int n3) {
        return a[n3] >>> 4 & 3;
    }

    public static int o(int n3) {
        return a[n3] >>> 2 & 3;
    }

    public static int p(int n3) {
        return a[n3] & 3;
    }

    public static boolean q(int n3) {
        boolean bl = (a[n3] & 0x40) != 0;
        return bl;
    }

    public static boolean r(int n3) {
        boolean bl = (a[n3] & 0x80) != 0;
        return bl;
    }
}

