/*
 * Decompiled with CFR 0.152.
 */
package d;

import java.lang.reflect.Array;

public abstract class d {
    public static int[] a(int[] nArray, int n3, int n4) {
        int[] nArray2 = nArray;
        if (n3 + 1 > nArray.length) {
            nArray2 = new int[d.c(n3)];
            System.arraycopy(nArray, 0, nArray2, 0, n3);
        }
        nArray2[n3] = n4;
        return nArray2;
    }

    public static Object[] b(Object[] objectArray, int n3, Object object) {
        Object[] objectArray2 = objectArray;
        if (n3 + 1 > objectArray.length) {
            objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), d.c(n3));
            System.arraycopy(objectArray, 0, objectArray2, 0, n3);
        }
        objectArray2[n3] = object;
        return objectArray2;
    }

    public static int c(int n3) {
        n3 = n3 <= 4 ? 8 : (n3 *= 2);
        return n3;
    }

    public static long[] d(long[] lArray, int n3, int n4, long l3) {
        if (n3 + 1 <= lArray.length) {
            System.arraycopy(lArray, n4, lArray, n4 + 1, n3 - n4);
            lArray[n4] = l3;
            return lArray;
        }
        long[] lArray2 = new long[d.c(n3)];
        System.arraycopy(lArray, 0, lArray2, 0, n4);
        lArray2[n4] = l3;
        System.arraycopy(lArray, n4, lArray2, n4 + 1, lArray.length - n4);
        return lArray2;
    }

    public static Object[] e(Object[] objectArray, int n3, int n4, Object object) {
        if (n3 + 1 <= objectArray.length) {
            System.arraycopy(objectArray, n4, objectArray, n4 + 1, n3 - n4);
            objectArray[n4] = object;
            return objectArray;
        }
        Object[] objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), d.c(n3));
        System.arraycopy(objectArray, 0, objectArray2, 0, n4);
        objectArray2[n4] = object;
        System.arraycopy(objectArray, n4, objectArray2, n4 + 1, objectArray.length - n4);
        return objectArray2;
    }

    public static boolean[] f(boolean[] blArray, int n3, int n4, boolean bl) {
        if (n3 + 1 <= blArray.length) {
            System.arraycopy(blArray, n4, blArray, n4 + 1, n3 - n4);
            blArray[n4] = bl;
            return blArray;
        }
        boolean[] blArray2 = new boolean[d.c(n3)];
        System.arraycopy(blArray, 0, blArray2, 0, n4);
        blArray2[n4] = bl;
        System.arraycopy(blArray, n4, blArray2, n4 + 1, blArray.length - n4);
        return blArray2;
    }
}

