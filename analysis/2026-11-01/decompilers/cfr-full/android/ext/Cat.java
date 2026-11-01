/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import java.io.FileInputStream;
import java.io.InputStream;

public class Cat {
    public static void main(String[] objectArray) {
        int n3;
        Object object = objectArray[0];
        objectArray = new byte[8192];
        object = new FileInputStream((String)object);
        while ((n3 = ((InputStream)object).read((byte[])objectArray)) >= 0) {
            System.out.write((byte[])objectArray, 0, n3);
        }
        ((InputStream)object).close();
    }
}

