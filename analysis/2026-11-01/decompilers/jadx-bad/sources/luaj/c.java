package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c extends d {
    public final int j;
    public final String k;
    public final String l;

    public c(int i, String str, String str2) {
        super((String) null);
        this.j = i;
        this.k = str2;
        this.l = e(str);
        this.h = f();
    }

    private String e(String str) {
        StackTraceElement[] stackTrace;
        if (str != null || (stackTrace = getStackTrace()) == null) {
            return str;
        }
        int length = stackTrace.length;
        for (int i = 1; i < length; i++) {
            String className = stackTrace[i].getClassName();
            if (className != null) {
                if (className.endsWith("LuaClosure")) {
                    return str;
                }
                if (className.contains("Lib$")) {
                    return LuaFunction.U2(className);
                }
            }
        }
        return str;
    }

    private String f() {
        StringBuilder sb;
        String str;
        String str2;
        String str3;
        if (this.l == null) {
            sb = new StringBuilder();
            if (this.j == 0) {
                str3 = "calling method on bad self";
            } else {
                str3 = "bad argument #" + this.j + ": ";
            }
            sb.append(str3);
            str2 = this.k;
        } else {
            sb = new StringBuilder();
            if (this.j == 0) {
                str = "calling '" + this.l + "' on bad self";
            } else {
                str = "bad argument #" + this.j + " to '" + this.l + "'";
            }
            sb.append(str);
            sb.append(" (");
            sb.append(this.k);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    c(c cVar) {
        super((String) null, cVar);
        this.j = cVar.j - 1;
        this.k = cVar.k;
        this.l = cVar.l;
        this.h = f();
    }
}
