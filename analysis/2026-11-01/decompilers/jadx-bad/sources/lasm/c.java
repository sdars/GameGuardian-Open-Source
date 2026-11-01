package lasm;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c extends Error {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1642c;

    public c(String str, int i) {
        super(str);
        this.f1640a = i;
    }

    protected static String a(boolean z, int i, int i2, int i3, String str, char c2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Lexical error at line ");
        sb.append(i2);
        sb.append(", column ");
        sb.append(i3);
        sb.append(".  Encountered: ");
        if (z) {
            str2 = "<EOF> ";
        } else {
            str2 = "\"" + b(String.valueOf(c2)) + "\" (" + ((int) c2) + "), ";
        }
        sb.append(str2);
        sb.append("after : \"");
        sb.append(b(str));
        sb.append("\"");
        return sb.toString();
    }

    protected static final String b(String str) {
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 0) {
                if (cCharAt == '\"') {
                    str2 = "\\\"";
                } else if (cCharAt == '\'') {
                    str2 = "\\'";
                } else if (cCharAt == '\\') {
                    str2 = "\\\\";
                } else if (cCharAt == '\f') {
                    str2 = "\\f";
                } else if (cCharAt != '\r') {
                    switch (cCharAt) {
                        case '\b':
                            str2 = "\\b";
                            break;
                        case '\t':
                            str2 = "\\t";
                            break;
                        case '\n':
                            str2 = "\\n";
                            break;
                        default:
                            char cCharAt2 = str.charAt(i);
                            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                                String str3 = "0000" + Integer.toString(cCharAt2, 16);
                                str2 = "\\u" + str3.substring(str3.length() - 4, str3.length());
                            } else {
                                stringBuffer.append(cCharAt2);
                            }
                            break;
                    }
                } else {
                    str2 = "\\r";
                }
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    public c(boolean z, int i, int i2, int i3, String str, char c2, int i4) {
        this(a(z, i, i2, i3, str, c2), i4);
        this.f1641b = i2;
        this.f1642c = i3;
    }
}
