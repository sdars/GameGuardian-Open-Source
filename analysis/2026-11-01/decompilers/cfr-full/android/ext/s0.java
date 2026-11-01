/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

abstract class s0 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static int a(String string2) {
        if (string2 == null) return 0;
        if (string2.length() > 40) {
            return 0;
        }
        int n3 = string2.indexOf(10);
        String string3 = string2;
        if (n3 >= 0) {
            string3 = string2.substring(0, n3);
        }
        try {
            return Integer.parseInt(s0.d(string3));
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    static String b(int n3, long l3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append("\n");
        stringBuilder.append(l3);
        return stringBuilder.toString();
    }

    static boolean c(int n3, long l3, int n4, long l4) {
        boolean bl = false;
        if (n3 != n4) {
            return false;
        }
        if (l3 <= 0L || l4 <= l3) {
            bl = true;
        }
        return bl;
    }

    private static String d(String string2) {
        String string3 = string2;
        if (string2.endsWith("\r")) {
            string3 = string2.substring(0, string2.length() - 1);
        }
        return string3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static long e(String string2) {
        long l3;
        long l4 = l3 = -1L;
        if (string2 == null) return l4;
        if (string2.length() > 40) {
            return l3;
        }
        int n3 = string2.indexOf(10);
        if (n3 < 0) {
            return -1L;
        }
        try {
            return Long.parseLong(s0.d(string2.substring(n3 + 1)));
        }
        catch (NumberFormatException numberFormatException) {
            return l3;
        }
    }
}

