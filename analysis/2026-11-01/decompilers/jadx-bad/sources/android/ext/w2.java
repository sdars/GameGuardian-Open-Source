package android.ext;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class w2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1289a = Tools.f489a.nextInt();

    private static Intent a() {
        String strC0 = Tools.C0();
        Intent intent = new Intent();
        intent.setClassName(strC0, strC0 + ".Receiver");
        intent.setAction(strC0);
        intent.setFlags((intent.getFlags() | 16777248) & (-8388625));
        intent.putExtra("check-hash", f1289a);
        return intent;
    }

    public static PendingIntent b(int i) {
        try {
            return PendingIntent.getBroadcast(Tools.f0(), Tools.f489a.nextInt(), a().putExtra("action", i), 134217728);
        } catch (Throwable th) {
            e1.a(th);
            return null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        try {
            e1.p("onReceive broadcast: " + intent + "; " + context + "; " + MainService.instance);
            if (MainService.instance == null) {
                i = 1;
            } else if (intent == null) {
                i = 2;
            } else {
                i = intent.getIntExtra("check-hash", 0) != f1289a ? 3 : 0;
            }
            e1.p("Broadcast: " + i);
            if (i != 0) {
                return;
            }
            try {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (Throwable th) {
                e1.s("Failed hide status bar", th);
            }
            if (intent.getIntExtra("action", 0) != 1) {
                MainService.instance.i1();
            } else {
                ConfigListAdapter.v();
            }
        } catch (Throwable th2) {
            e1.s("onReceive broadcast fail: " + intent, th2);
        }
    }
}
