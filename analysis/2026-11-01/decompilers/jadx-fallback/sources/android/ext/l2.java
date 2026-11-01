package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class l2 extends a.b {
    public l2(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static android.content.Context i(android.content.Context r1) {
            if (r1 == 0) goto Lc
            boolean r0 = r1 instanceof android.ext.l2
            if (r0 != 0) goto Lc
            android.ext.l2 r0 = new android.ext.l2
            r0.<init>(r1)
            r1 = r0
        Lc:
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context getApplicationContext() {
            r1 = this;
            android.content.Context r0 = super.getApplicationContext()
            if (r0 != 0) goto L8
            android.content.Context r0 = android.ext.r.o
        L8:
            return r0
    }

    @Override // a.b, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String r4) {
            r3 = this;
            java.lang.Object r4 = super.getSystemService(r4)     // Catch: java.lang.Throwable -> L5
            goto L1b
        L5:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getSystemService fail: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.ext.e1.l(r4, r0)
            r4 = 0
        L1b:
            return r4
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] r5) {
            r4 = this;
            if (r5 == 0) goto L12
            int r0 = r5.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L12
            r2 = r5[r1]
            if (r2 == 0) goto Lf
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r3)
        Lf:
            int r1 = r1 + 1
            goto L4
        L12:
            super.startActivities(r5)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] r5, android.os.Bundle r6) {
            r4 = this;
            if (r5 == 0) goto L12
            int r0 = r5.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L12
            r2 = r5[r1]
            if (r2 == 0) goto Lf
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r3)
        Lf:
            int r1 = r1 + 1
            goto L4
        L12:
            super.startActivities(r5, r6)
            return
    }

    @Override // a.b, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent r2) {
            r1 = this;
            if (r2 == 0) goto L7
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r0)
        L7:
            super.startActivity(r2)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent r2, android.os.Bundle r3) {
            r1 = this;
            if (r2 == 0) goto L7
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r0)
        L7:
            super.startActivity(r2, r3)
            return
    }

    @Override // a.b, android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(android.content.BroadcastReceiver r1) {
            r0 = this;
            super.unregisterReceiver(r1)     // Catch: java.lang.IllegalArgumentException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }
}
