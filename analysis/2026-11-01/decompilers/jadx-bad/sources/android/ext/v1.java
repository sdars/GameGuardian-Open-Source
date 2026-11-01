package android.ext;

import java.io.File;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class v1 {
    public static String a(String str, String str2, String str3) {
        StringBuilder sb;
        z1.d dVar = MainService.instance.v0;
        if (dVar == null) {
            sb = new StringBuilder();
            sb.append(b(null, str));
            sb.append("/file");
        } else {
            String str4 = dVar.f1434c;
            String string = Tools.M0().getString(str4 + str2, null);
            if (string != null) {
                return string;
            }
            sb = new StringBuilder();
            sb.append(b(null, str));
            sb.append('/');
            sb.append(str4);
        }
        sb.append(str3);
        return sb.toString();
    }

    public static String b(String str, String str2) {
        String str3 = Tools.K0() + "/Notes";
        if (str == null) {
            return Tools.M0().getString(str2, str3);
        }
        new g2().k(str2, str, str3).commit();
        return null;
    }

    public static void c(String str, String str2, String str3, String str4) {
        File file = new File(str.trim());
        String parent = file.getParent();
        if (str2 != null && parent != null && parent.length() > 0) {
            b(parent, str2);
        }
        z1.d dVar = MainService.instance.v0;
        if (dVar != null) {
            String str5 = dVar.f1434c;
            new g2().k(str5 + str3, file.getAbsolutePath(), b(null, str2) + '/' + str5 + str4).commit();
        }
    }
}
