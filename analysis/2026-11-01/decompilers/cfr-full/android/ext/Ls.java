/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import java.io.File;

public class Ls {
    public static void main(String[] object2) {
        File[] fileArray = new File((String)object2[0]).listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                if (file == null) continue;
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}

