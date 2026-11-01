package android.lang;

import android.ext.e0;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f1454d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f1455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f1456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f1457c;

    public ProcessBuilder(String... strArr) {
        this.f1455a = strArr;
    }

    public static Process c(String[] strArr, String[] strArr2, File file) {
        if (!f1454d) {
            f1454d = true;
            e0.l();
        }
        return new ProcessBuilder(strArr).b(strArr2).a(file).d();
    }

    public static native boolean loaded();

    public ProcessBuilder a(File file) {
        this.f1456b = file;
        return this;
    }

    ProcessBuilder b(String[] strArr) {
        if (strArr != null) {
            this.f1457c = ProcessEnvironment.i(strArr.length);
            for (String strReplaceFirst : strArr) {
                if (strReplaceFirst.indexOf(0) != -1) {
                    strReplaceFirst = strReplaceFirst.replaceFirst("\u0000.*", "");
                }
                int iIndexOf = strReplaceFirst.indexOf(61, 0);
                if (iIndexOf != -1) {
                    this.f1457c.put(strReplaceFirst.substring(0, iIndexOf), strReplaceFirst.substring(iIndexOf + 1));
                }
            }
        }
        return this;
    }

    public Process d() throws IOException {
        String[] strArr = (String[]) this.f1455a.clone();
        for (String str : strArr) {
            str.getClass();
        }
        String str2 = strArr[0];
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkExec(str2);
        }
        File file = this.f1456b;
        String string = file == null ? null : file.toString();
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].indexOf(0) >= 0) {
                throw new IOException("invalid null character in command");
            }
        }
        try {
            return gga.b(strArr, this.f1457c, string, false);
        } catch (IOException | IllegalArgumentException e2) {
            e = e2;
            String str3 = ": " + e.getMessage();
            if ((e instanceof IOException) && securityManager != null) {
                try {
                    securityManager.checkRead(str2);
                } catch (SecurityException e3) {
                    e = e3;
                    str3 = "";
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot run program \"");
            sb.append(str2);
            sb.append('\"');
            sb.append(string != null ? " (in directory \"" + string + "\")" : "");
            sb.append(str3);
            throw new IOException(sb.toString(), e);
        }
    }
}
