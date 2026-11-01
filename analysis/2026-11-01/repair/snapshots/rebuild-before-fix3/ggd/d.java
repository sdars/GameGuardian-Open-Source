package ggd;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static int[] a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    public static Object[] b(Object[] objArr, int i, Object obj) {
        if (i + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), c(i));
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        objArr[i] = obj;
        return objArr;
    }

    public static int c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    public static long[] d(long[] jArr, int i, int i2, long j) {
        if (i + 1 <= jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i - i2);
            jArr[i2] = j;
            return jArr;
        }
        long[] jArr2 = new long[c(i)];
        System.arraycopy(jArr, 0, jArr2, 0, i2);
        jArr2[i2] = j;
        System.arraycopy(jArr, i2, jArr2, i2 + 1, jArr.length - i2);
        return jArr2;
    }

    public static Object[] e(Object[] objArr, int i, int i2, Object obj) {
        if (i + 1 <= objArr.length) {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i - i2);
            objArr[i2] = obj;
            return objArr;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), c(i));
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        objArr2[i2] = obj;
        System.arraycopy(objArr, i2, objArr2, i2 + 1, objArr.length - i2);
        return objArr2;
    }

    public static boolean[] f(boolean[] zArr, int i, int i2, boolean z) {
        if (i + 1 <= zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i - i2);
            zArr[i2] = z;
            return zArr;
        }
        boolean[] zArr2 = new boolean[c(i)];
        System.arraycopy(zArr, 0, zArr2, 0, i2);
        zArr2[i2] = z;
        System.arraycopy(zArr, i2, zArr2, i2 + 1, zArr.length - i2);
        return zArr2;
    }
}
