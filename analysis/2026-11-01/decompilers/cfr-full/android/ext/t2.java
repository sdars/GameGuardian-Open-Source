/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.Tools;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

public abstract class t2 {
    private static final ThreadLocal a = new ThreadLocal(){

        protected char[] a() {
            return new char[16];
        }
    };
    private static final char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Appendable a(Appendable appendable, int n3, char c4, String string2) {
        int n4 = string2.length();
        for (int i3 = 0; i3 < n3 - n4; ++i3) {
            appendable.append(c4);
            continue;
        }
        try {
            return appendable.append(string2);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public static String b(int n3, char c4, String string2) {
        int n4 = string2.length();
        Object object = string2;
        if (n4 < n3) {
            object = (char[])a.get();
            int n5 = n3 - n4;
            Arrays.fill((char[])object, 0, n5, c4);
            string2.getChars(0, n4, (char[])object, n5);
            object = new String((char[])object, 0, n3);
        }
        return object;
    }

    public static Appendable c(Appendable appendable, int n3, int n4) {
        return t2.a(appendable, n3, '0', Integer.toHexString(n4).toUpperCase(Locale.US));
    }

    public static Appendable d(Appendable appendable, int n3, long l3) {
        return t2.a(appendable, n3, '0', Long.toHexString(l3).toUpperCase(Locale.US));
    }

    public static String e(int n3, long l3) {
        return t2.b(n3, '0', Long.toHexString(l3).toUpperCase(Locale.US));
    }

    public static String f(String string2, Object ... objectArray) {
        return Tools.L1(string2, objectArray);
    }

    public static String g(int n3) {
        char[] cArray = new char[7];
        boolean bl = n3 < 0;
        int n4 = n3;
        if (!bl) {
            n4 = -n3;
        }
        char[] cArray2 = b;
        n3 = 6;
        while (n4 <= -64) {
            cArray[n3] = cArray2[-(n4 % 64)];
            n4 /= 64;
            --n3;
        }
        cArray[n3] = cArray2[-n4];
        n4 = n3;
        if (bl) {
            n4 = n3 - 1;
            cArray[n4] = 45;
        }
        return new String(cArray, n4, 7 - n4);
    }

    public static String h(long l3) {
        char[] cArray = new char[12];
        boolean bl = l3 < 0L;
        long l4 = l3;
        if (!bl) {
            l4 = -l3;
        }
        char[] cArray2 = b;
        int n3 = 11;
        while (l4 <= -64L) {
            cArray[n3] = cArray2[(int)(-(l4 % 64L))];
            l4 /= 64L;
            --n3;
        }
        cArray[n3] = cArray2[(int)(-l4)];
        int n4 = n3;
        if (bl) {
            n4 = n3 - 1;
            cArray[n4] = 45;
        }
        return new String(cArray, n4, 12 - n4);
    }
}

