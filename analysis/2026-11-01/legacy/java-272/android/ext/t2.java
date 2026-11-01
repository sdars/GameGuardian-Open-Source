package android.ext;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f1264a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f1265b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[16];
        }
    }

    public static Appendable a(Appendable appendable, int i, char c2, String str) {
        try {
            int length = i - str.length();
            for (int i2 = 0; i2 < length; i2++) {
                appendable.append(c2);
            }
            return appendable.append(str);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String b(int i, char c2, String str) {
        int length = str.length();
        if (length >= i) {
            return str;
        }
        char[] cArr = (char[]) f1264a.get();
        int i2 = i - length;
        Arrays.fill(cArr, 0, i2, c2);
        str.getChars(0, length, cArr, i2);
        return new String(cArr, 0, i);
    }

    public static Appendable c(Appendable appendable, int i, int i2) {
        return a(appendable, i, '0', Integer.toHexString(i2).toUpperCase(Locale.US));
    }

    public static Appendable d(Appendable appendable, int i, long j) {
        return a(appendable, i, '0', Long.toHexString(j).toUpperCase(Locale.US));
    }

    public static String e(int i, long j) {
        return b(i, '0', Long.toHexString(j).toUpperCase(Locale.US));
    }

    public static String f(String str, Object... objArr) {
        return Tools.L1(str, objArr);
    }

    public static String g(int i) {
        char[] cArr = new char[7];
        boolean z = i < 0;
        if (!z) {
            i = -i;
        }
        char[] cArr2 = f1265b;
        int i2 = 6;
        while (i <= -64) {
            cArr[i2] = cArr2[-(i % 64)];
            i /= 64;
            i2--;
        }
        cArr[i2] = cArr2[-i];
        if (z) {
            i2--;
            cArr[i2] = '-';
        }
        return new String(cArr, i2, 7 - i2);
    }

    public static String h(long j) {
        char[] cArr = new char[12];
        boolean z = j < 0;
        if (!z) {
            j = -j;
        }
        char[] cArr2 = f1265b;
        int i = 11;
        while (j <= -64) {
            cArr[i] = cArr2[(int) (-(j % 64))];
            j /= 64;
            i--;
        }
        cArr[i] = cArr2[(int) (-j)];
        if (z) {
            i--;
            cArr[i] = '-';
        }
        return new String(cArr, i, 12 - i);
    }
}
