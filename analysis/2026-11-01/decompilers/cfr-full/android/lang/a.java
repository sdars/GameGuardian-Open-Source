/*
 * Decompiled with CFR 0.152.
 */
package android.lang;

import android.lang.ProcessEnvironment;
import android.lang.UNIXProcess;
import java.io.FileDescriptor;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class a {
    public static int a(FileDescriptor fileDescriptor) {
        try {
            Field field = FileDescriptor.class.getDeclaredField("descriptor");
            ((AccessibleObject)field).setAccessible(true);
            int n3 = (Integer)field.get(fileDescriptor);
            return n3;
        }
        catch (Throwable throwable) {
            throw new RuntimeException("Failed get fd", throwable);
        }
    }

    static Process b(String[] stringArray, Map object, String string2, boolean bl) {
        byte[] byArray;
        int n3 = stringArray.length - 1;
        Object object2 = new byte[n3][];
        int n4 = n3;
        int n5 = 0;
        while (n5 < n3) {
            int n6 = n5 + 1;
            byArray = stringArray[n6].getBytes();
            object2[n5] = byArray;
            n4 += byArray.length;
            n5 = n6;
        }
        byArray = new byte[n4];
        n5 = 0;
        for (n4 = 0; n4 < n3; ++n4) {
            byte[] byArray2 = object2[n4];
            System.arraycopy(byArray2, 0, byArray, n5, byArray2.length);
            n5 += byArray2.length + 1;
        }
        object2 = new int[1];
        object = ProcessEnvironment.j((Map)object, (int[])object2);
        return new UNIXProcess(a.c(stringArray[0]), byArray, n3, (byte[])object, (int)object2[0], a.c(string2), new int[]{-1, -1, -1}, bl);
    }

    private static byte[] c(String object) {
        if (object == null) {
            return null;
        }
        byte[] byArray = ((String)object).getBytes();
        int n3 = byArray.length;
        object = new byte[n3 + 1];
        System.arraycopy(byArray, 0, object, 0, byArray.length);
        object[n3] = false;
        return object;
    }
}

