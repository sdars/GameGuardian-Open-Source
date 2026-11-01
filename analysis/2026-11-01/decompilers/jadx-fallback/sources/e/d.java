package e;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d extends java.lang.Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e.f f1533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[][] f1534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String[] f1535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected java.lang.String f1536d;

    public d() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "line.separator"
            java.lang.String r1 = "\n"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            r2.f1536d = r0
            return
    }

    public d(e.f r3, int[][] r4, java.lang.String[] r5) {
            r2 = this;
            java.lang.String r0 = b(r3, r4, r5)
            r2.<init>(r0)
            java.lang.String r0 = "line.separator"
            java.lang.String r1 = "\n"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            r2.f1536d = r0
            r2.f1533a = r3
            r2.f1534b = r4
            r2.f1535c = r5
            return
    }

    public d(java.lang.String r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r2 = "line.separator"
            java.lang.String r0 = "\n"
            java.lang.String r2 = java.lang.System.getProperty(r2, r0)
            r1.f1536d = r2
            return
    }

    public d(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "line.separator"
            java.lang.String r2 = "\n"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            r0.f1536d = r1
            return
    }

    static java.lang.String a(java.lang.String r6) {
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

    private static java.lang.String b(e.f r11, int[][] r12, java.lang.String[] r13) {
            java.lang.String r0 = "line.separator"
            java.lang.String r1 = "\n"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r2 = 0
            r3 = 0
            r4 = 0
        L10:
            int r5 = r12.length
            java.lang.String r6 = "    "
            r7 = 1
            if (r3 >= r5) goto L45
            r5 = r12[r3]
            int r8 = r5.length
            if (r4 >= r8) goto L1c
            int r4 = r5.length
        L1c:
            r5 = 0
        L1d:
            r8 = r12[r3]
            int r9 = r8.length
            if (r5 >= r9) goto L31
            r8 = r8[r5]
            r8 = r13[r8]
            r1.append(r8)
            r8 = 32
            r1.append(r8)
            int r5 = r5 + 1
            goto L1d
        L31:
            int r5 = r8.length
            int r5 = r5 - r7
            r5 = r8[r5]
            if (r5 == 0) goto L3c
            java.lang.String r5 = "..."
            r1.append(r5)
        L3c:
            r1.append(r0)
            r1.append(r6)
            int r3 = r3 + 1
            goto L10
        L45:
            e.f r3 = r11.f1550g
            java.lang.String r5 = "Encountered \""
            r8 = 0
        L4a:
            if (r8 >= r4) goto Lc5
            java.lang.String r9 = " "
            if (r8 == 0) goto L5f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r9)
            java.lang.String r5 = r10.toString()
        L5f:
            int r10 = r3.f1544a
            if (r10 != 0) goto L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r13 = r13[r2]
            r3.append(r13)
            java.lang.String r5 = r3.toString()
            goto Lc5
        L75:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r9)
            int r5 = r3.f1544a
            r5 = r13[r5]
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r5 = " \""
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = r3.f1549f
            java.lang.String r9 = a(r9)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            e.f r3 = r3.f1550g
            int r8 = r8 + 1
            goto L4a
        Lc5:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r5)
            java.lang.String r2 = "\" at line "
            r13.append(r2)
            e.f r2 = r11.f1550g
            int r2 = r2.f1545b
            r13.append(r2)
            java.lang.String r2 = ", column "
            r13.append(r2)
            e.f r11 = r11.f1550g
            int r11 = r11.f1546c
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r11 = "."
            r13.append(r11)
            r13.append(r0)
            java.lang.String r11 = r13.toString()
            int r12 = r12.length
            if (r12 != r7) goto L118
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "Was expecting:"
        L10a:
            r12.append(r11)
            r12.append(r0)
            r12.append(r6)
            java.lang.String r11 = r12.toString()
            goto L123
        L118:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "Was expecting one of:"
            goto L10a
        L123:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = r1.toString()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            return r11
    }
}
