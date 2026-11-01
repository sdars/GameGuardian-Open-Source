package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class DefensiveURLSpan extends android.text.style.URLSpan {
    public DefensiveURLSpan(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static void a(android.widget.TextView r0) {
            java.lang.CharSequence r0 = r0.getText()
            b(r0)
            return
    }

    public static void b(java.lang.CharSequence r8) {
            boolean r0 = r8 instanceof android.text.SpannableString
            if (r0 == 0) goto L33
            android.text.SpannableString r8 = (android.text.SpannableString) r8
            int r0 = r8.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r2 = 0
            java.lang.Object[] r0 = r8.getSpans(r2, r0, r1)
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0
            int r1 = r0.length
            r3 = 0
        L15:
            if (r3 >= r1) goto L33
            r4 = r0[r3]
            int r5 = r8.getSpanStart(r4)
            int r6 = r8.getSpanEnd(r4)
            r8.removeSpan(r4)
            android.ext.DefensiveURLSpan r7 = new android.ext.DefensiveURLSpan
            java.lang.String r4 = r4.getURL()
            r7.<init>(r4)
            r8.setSpan(r7, r5, r6, r2)
            int r3 = r3 + 1
            goto L15
        L33:
            return
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(android.view.View r6) {
            r5 = this;
            super.onClick(r6)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L8 android.view.WindowManager.BadTokenException -> La android.util.AndroidRuntimeException -> Lc
            r0 = 0
            goto Ld
        L5:
            r6 = move-exception
            goto L82
        L8:
            r0 = move-exception
            goto Ld
        La:
            r0 = move-exception
            goto Ld
        Lc:
            r0 = move-exception
        Ld:
            java.lang.String r1 = "failed onClick on URLSpan: "
            if (r0 == 0) goto L67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            r2.<init>()     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            r2.append(r1)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            java.lang.String r3 = r5.getURL()     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            r2.append(r3)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            java.lang.String r2 = r2.toString()     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            android.ext.e1.s(r2, r0)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            java.lang.String r2 = r5.getURL()     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            android.content.Context r6 = r6.getContext()     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            android.content.Intent r3 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4, r2)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            java.lang.String r2 = "com.android.browser.application_id"
            java.lang.String r4 = android.ext.Tools.C0()     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            r3.putExtra(r2, r4)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r3.setFlags(r2)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            r6.startActivity(r3)     // Catch: java.lang.Throwable -> L4c
            goto L67
        L4c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            r6.<init>()     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            java.lang.String r2 = "failed2 onClick on URLSpan: "
            r6.append(r2)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            java.lang.String r2 = r5.getURL()     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            r6.append(r2)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            java.lang.String r6 = r6.toString()     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            android.ext.e1.s(r6, r0)     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            goto L67
        L65:
            r6 = move-exception
            goto L6b
        L67:
            android.ext.f.d()     // Catch: android.content.ActivityNotFoundException -> L5 java.lang.SecurityException -> L65
            goto L85
        L6b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = r5.getURL()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L7e:
            android.ext.e1.s(r0, r6)
            goto L85
        L82:
            java.lang.String r0 = "failed call activity"
            goto L7e
        L85:
            return
    }
}
