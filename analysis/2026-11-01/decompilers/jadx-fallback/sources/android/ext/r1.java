package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class r1 {
    public static int a(java.lang.Object r11, java.lang.Object r12) {
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = r12.toString()
            int r0 = r11.length()
            int r1 = r12.length()
            r2 = 0
            r3 = 0
            r4 = 0
        L13:
            if (r3 < r0) goto L17
            r5 = 0
            goto L1b
        L17:
            char r5 = r11.charAt(r3)
        L1b:
            if (r4 < r1) goto L1f
            r6 = 0
            goto L23
        L1f:
            char r6 = r12.charAt(r4)
        L23:
            r7 = 0
        L24:
            r8 = 32
            r9 = 48
            if (r5 == r8) goto L70
            if (r5 != r9) goto L2d
            goto L70
        L2d:
            r10 = 0
        L2e:
            if (r6 == r8) goto L5f
            if (r6 != r9) goto L33
            goto L5f
        L33:
            r8 = 57
            if (r5 > r8) goto L4c
            if (r6 > r8) goto L4c
            if (r9 > r5) goto L4c
            if (r9 > r6) goto L4c
            java.lang.String r8 = r11.substring(r3)
            java.lang.String r9 = r12.substring(r4)
            int r8 = b(r8, r9)
            if (r8 == 0) goto L4c
            return r8
        L4c:
            if (r5 != 0) goto L52
            if (r6 != 0) goto L52
            int r7 = r7 - r10
            return r7
        L52:
            if (r5 >= r6) goto L56
            r11 = -1
            return r11
        L56:
            if (r5 <= r6) goto L5a
            r11 = 1
            return r11
        L5a:
            int r3 = r3 + 1
            int r4 = r4 + 1
            goto L13
        L5f:
            if (r6 != r9) goto L64
            int r10 = r10 + 1
            goto L65
        L64:
            r10 = 0
        L65:
            int r4 = r4 + 1
            if (r4 < r1) goto L6b
            r6 = 0
            goto L2e
        L6b:
            char r6 = r12.charAt(r4)
            goto L2e
        L70:
            if (r5 != r9) goto L75
            int r7 = r7 + 1
            goto L76
        L75:
            r7 = 0
        L76:
            int r3 = r3 + 1
            if (r3 < r0) goto L7c
            r5 = 0
            goto L24
        L7c:
            char r5 = r11.charAt(r3)
            goto L24
    }

    private static int b(java.lang.String r12, java.lang.String r13) {
            int r0 = r12.length()
            int r1 = r13.length()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Lc:
            if (r3 < r0) goto L10
            r6 = 0
            goto L14
        L10:
            char r6 = r12.charAt(r3)
        L14:
            if (r4 < r1) goto L18
            r7 = 0
            goto L1c
        L18:
            char r7 = r13.charAt(r4)
        L1c:
            r8 = 48
            r9 = 57
            r10 = 1
            if (r6 > r9) goto L28
            if (r8 <= r6) goto L26
            goto L28
        L26:
            r11 = 0
            goto L29
        L28:
            r11 = 1
        L29:
            if (r7 > r9) goto L30
            if (r8 <= r7) goto L2e
            goto L30
        L2e:
            r8 = 0
            goto L31
        L30:
            r8 = 1
        L31:
            if (r11 == 0) goto L36
            if (r8 == 0) goto L36
            return r5
        L36:
            r9 = -1
            if (r11 == 0) goto L3a
            return r9
        L3a:
            if (r8 == 0) goto L3d
            return r10
        L3d:
            if (r6 != 0) goto L42
            if (r7 != 0) goto L42
            return r5
        L42:
            if (r5 != 0) goto L4b
            if (r6 >= r7) goto L48
            r5 = -1
            goto L4b
        L48:
            if (r6 <= r7) goto L4b
            r5 = 1
        L4b:
            int r3 = r3 + 1
            int r4 = r4 + 1
            goto Lc
    }
}
