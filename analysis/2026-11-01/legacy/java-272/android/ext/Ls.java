package android.ext;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class Ls {
    public static void main(String[] strArr) {
        File[] fileArrListFiles = new File(strArr[0]).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file != null) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
