package lasm;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c extends java.lang.Error {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1642c;

    public c(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f1640a = r2
            return
    }

    public c(boolean r1, int r2, int r3, int r4, java.lang.String r5, char r6, int r7) {
            r0 = this;
            java.lang.String r1 = a(r1, r2, r3, r4, r5, r6)
            r0.<init>(r1, r7)
            r0.f1641b = r3
            r0.f1642c = r4
            return
    }

    protected static java.lang.String a(boolean r1, int r2, int r3, int r4, java.lang.String r5, char r6) {
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Lexical error at line "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = ", column "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ".  Encountered: "
            r2.append(r3)
            java.lang.String r3 = "\""
            if (r1 == 0) goto L21
            java.lang.String r1 = "<EOF> "
            goto L48
        L21:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r4 = b(r4)
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = " ("
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = "), "
            r1.append(r4)
            java.lang.String r1 = r1.toString()
        L48:
            r2.append(r1)
            java.lang.String r1 = "after : \""
            r2.append(r1)
            java.lang.String r1 = b(r5)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            return r1
    }

    protected static final java.lang.String b(java.lang.String r6) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r6.length()
            if (r1 >= r2) goto L90
            char r2 = r6.charAt(r1)
            if (r2 == 0) goto L8c
            r3 = 34
            if (r2 == r3) goto L89
            r3 = 39
            if (r2 == r3) goto L86
            r3 = 92
            if (r2 == r3) goto L83
            r3 = 12
            if (r2 == r3) goto L80
            r3 = 13
            if (r2 == r3) goto L7d
            switch(r2) {
                case 8: goto L7a;
                case 9: goto L77;
                case 10: goto L74;
                default: goto L29;
            }
        L29:
            char r2 = r6.charAt(r1)
            r3 = 32
            if (r2 < r3) goto L3a
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 <= r3) goto L36
            goto L3a
        L36:
            r0.append(r2)
            goto L8c
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "0000"
            r3.append(r4)
            r4 = 16
            java.lang.String r2 = java.lang.Integer.toString(r2, r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "\\u"
            r3.append(r4)
            int r4 = r2.length()
            int r4 = r4 + (-4)
            int r5 = r2.length()
            java.lang.String r2 = r2.substring(r4, r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L70:
            r0.append(r2)
            goto L8c
        L74:
            java.lang.String r2 = "\\n"
            goto L70
        L77:
            java.lang.String r2 = "\\t"
            goto L70
        L7a:
            java.lang.String r2 = "\\b"
            goto L70
        L7d:
            java.lang.String r2 = "\\r"
            goto L70
        L80:
            java.lang.String r2 = "\\f"
            goto L70
        L83:
            java.lang.String r2 = "\\\\"
            goto L70
        L86:
            java.lang.String r2 = "\\'"
            goto L70
        L89:
            java.lang.String r2 = "\\\""
            goto L70
        L8c:
            int r1 = r1 + 1
            goto L6
        L90:
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = super.getMessage()
            return r0
    }
}
