package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class w2 extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1289a = 0;

    static {
            java.util.Random r0 = android.ext.Tools.f489a
            int r0 = r0.nextInt()
            android.ext.w2.f1289a = r0
            return
    }

    public w2() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.Intent a() {
            java.lang.String r0 = android.ext.Tools.C0()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = ".Receiver"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setClassName(r0, r2)
            r1.setAction(r0)
            int r0 = r1.getFlags()
            r2 = 16777248(0x1000020, float:2.3509977E-38)
            r0 = r0 | r2
            r2 = -8388625(0xffffffffff7fffef, float:-3.4028202E38)
            r0 = r0 & r2
            r1.setFlags(r0)
            java.lang.String r0 = "check-hash"
            int r2 = android.ext.w2.f1289a
            r1.putExtra(r0, r2)
            return r1
    }

    public static android.app.PendingIntent b(int r4) {
            android.content.Context r0 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L1b
            java.util.Random r1 = android.ext.Tools.f489a     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.nextInt()     // Catch: java.lang.Throwable -> L1b
            android.content.Intent r2 = a()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "action"
            android.content.Intent r4 = r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L1b
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r0, r1, r4, r2)     // Catch: java.lang.Throwable -> L1b
            goto L20
        L1b:
            r4 = move-exception
            android.ext.e1.a(r4)
            r4 = 0
        L20:
            return r4
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
            r5 = this;
            java.lang.String r0 = "; "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r1.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "onReceive broadcast: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L73
            r1.append(r7)     // Catch: java.lang.Throwable -> L73
            r1.append(r0)     // Catch: java.lang.Throwable -> L73
            r1.append(r6)     // Catch: java.lang.Throwable -> L73
            r1.append(r0)     // Catch: java.lang.Throwable -> L73
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L73
            r1.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L73
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L73
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L73
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2c
            r0 = 1
            goto L3d
        L2c:
            if (r7 != 0) goto L30
            r0 = 2
            goto L3d
        L30:
            java.lang.String r0 = "check-hash"
            int r0 = r7.getIntExtra(r0, r2)     // Catch: java.lang.Throwable -> L73
            int r3 = android.ext.w2.f1289a     // Catch: java.lang.Throwable -> L73
            if (r0 == r3) goto L3c
            r0 = 3
            goto L3d
        L3c:
            r0 = 0
        L3d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r3.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "Broadcast: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            r3.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L73
            android.ext.e1.p(r3)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L54
            return
        L54:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L5f
            r6.sendBroadcast(r0)     // Catch: java.lang.Throwable -> L5f
            goto L65
        L5f:
            r6 = move-exception
            java.lang.String r0 = "Failed hide status bar"
            android.ext.e1.s(r0, r6)     // Catch: java.lang.Throwable -> L73
        L65:
            java.lang.String r6 = "action"
            int r6 = r7.getIntExtra(r6, r2)     // Catch: java.lang.Throwable -> L73
            if (r6 == r1) goto L75
            android.ext.MainService r6 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L73
            r6.i1()     // Catch: java.lang.Throwable -> L73
            goto L8d
        L73:
            r6 = move-exception
            goto L79
        L75:
            android.ext.ConfigListAdapter.v()     // Catch: java.lang.Throwable -> L73
            goto L8d
        L79:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onReceive broadcast fail: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.ext.e1.s(r7, r6)
        L8d:
            return
    }
}
