package e;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f1533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[][] f1534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f1535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f1536d;

    public d() {
        this.f1536d = System.getProperty("line.separator", "\n");
    }

    static String a(String str) {
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

    private static String b(f fVar, int[][] iArr, String[] strArr) {
        StringBuilder sb;
        String str;
        int[] iArr2;
        String property = System.getProperty("line.separator", "\n");
        StringBuffer stringBuffer = new StringBuffer();
        int length = 0;
        for (int i = 0; i < iArr.length; i++) {
            int[] iArr3 = iArr[i];
            if (length < iArr3.length) {
                length = iArr3.length;
            }
            int i2 = 0;
            while (true) {
                iArr2 = iArr[i];
                if (i2 >= iArr2.length) {
                    break;
                }
                stringBuffer.append(strArr[iArr2[i2]]);
                stringBuffer.append(' ');
                i2++;
            }
            if (iArr2[iArr2.length - 1] != 0) {
                stringBuffer.append("...");
            }
            stringBuffer.append(property);
            stringBuffer.append("    ");
        }
        f fVar2 = fVar.f1550g;
        String str2 = "Encountered \"";
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 != 0) {
                str2 = str2 + " ";
            }
            if (fVar2.f1544a == 0) {
                str2 = str2 + strArr[0];
                break;
            }
            str2 = (((str2 + " " + strArr[fVar2.f1544a]) + " \"") + a(fVar2.f1549f)) + " \"";
            fVar2 = fVar2.f1550g;
        }
        String str3 = (str2 + "\" at line " + fVar.f1550g.f1545b + ", column " + fVar.f1550g.f1546c) + "." + property;
        if (iArr.length == 1) {
            sb = new StringBuilder();
            sb.append(str3);
            str = "Was expecting:";
        } else {
            sb = new StringBuilder();
            sb.append(str3);
            str = "Was expecting one of:";
        }
        sb.append(str);
        sb.append(property);
        sb.append("    ");
        return sb.toString() + stringBuffer.toString();
    }

    public d(f fVar, int[][] iArr, String[] strArr) {
        super(b(fVar, iArr, strArr));
        this.f1536d = System.getProperty("line.separator", "\n");
        this.f1533a = fVar;
        this.f1534b = iArr;
        this.f1535c = strArr;
    }

    public d(String str) {
        super(str);
        this.f1536d = System.getProperty("line.separator", "\n");
    }

    public d(String str, Throwable th) {
        super(str, th);
        this.f1536d = System.getProperty("line.separator", "\n");
    }
}
