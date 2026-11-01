package android.ext;

import java.io.File;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
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
