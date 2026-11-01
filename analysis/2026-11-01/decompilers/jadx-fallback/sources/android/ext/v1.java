package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class v1 {
    public static java.lang.String a(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.z1$d r0 = r0.v0
            r1 = 0
            if (r0 != 0) goto L20
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = b(r1, r4)
            r5.append(r4)
            java.lang.String r4 = "/file"
            r5.append(r4)
        L18:
            r5.append(r6)
            java.lang.String r4 = r5.toString()
            return r4
        L20:
            java.lang.String r0 = r0.f1434c
            android.content.SharedPreferences r2 = android.ext.Tools.M0()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            java.lang.String r5 = r2.getString(r5, r1)
            if (r5 == 0) goto L3c
            return r5
        L3c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = b(r1, r4)
            r5.append(r4)
            r4 = 47
            r5.append(r4)
            r5.append(r0)
            goto L18
    }

    public static java.lang.String b(java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.ext.Tools.K0()
            r0.append(r1)
            java.lang.String r1 = "/Notes"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            if (r2 != 0) goto L20
            android.content.SharedPreferences r2 = android.ext.Tools.M0()
            java.lang.String r2 = r2.getString(r3, r0)
            return r2
        L20:
            android.ext.g2 r1 = new android.ext.g2
            r1.<init>()
            android.ext.g2 r2 = r1.k(r3, r2, r0)
            r2.commit()
            r2 = 0
            return r2
    }

    public static void c(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.io.File r0 = new java.io.File
            java.lang.String r4 = r4.trim()
            r0.<init>(r4)
            java.lang.String r4 = r0.getParent()
            if (r5 == 0) goto L1a
            if (r4 == 0) goto L1a
            int r1 = r4.length()
            if (r1 <= 0) goto L1a
            b(r4, r5)
        L1a:
            android.ext.MainService r4 = android.ext.MainService.instance
            android.ext.z1$d r4 = r4.v0
            if (r4 == 0) goto L5d
            java.lang.String r4 = r4.f1434c
            android.ext.g2 r1 = new android.ext.g2
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.lang.String r5 = b(r3, r5)
            r2.append(r5)
            r5 = 47
            r2.append(r5)
            r2.append(r4)
            r2.append(r7)
            java.lang.String r4 = r2.toString()
            android.ext.g2 r4 = r1.k(r6, r0, r4)
            r4.commit()
        L5d:
            return
    }
}
