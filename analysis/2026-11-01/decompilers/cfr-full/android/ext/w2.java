/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.ext.ConfigListAdapter;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.e1;

public abstract class w2
extends BroadcastReceiver {
    private static final int a = Tools.a.nextInt();

    private static Intent a() {
        String string2 = Tools.C0();
        Intent intent = new Intent();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(".Receiver");
        intent.setClassName(string2, stringBuilder.toString());
        intent.setAction(string2);
        intent.setFlags((intent.getFlags() | 0x1000020) & 0xFF7FFFEF);
        intent.putExtra("check-hash", a);
        return intent;
    }

    public static PendingIntent b(int n3) {
        PendingIntent pendingIntent;
        try {
            pendingIntent = PendingIntent.getBroadcast((Context)Tools.f0(), (int)Tools.a.nextInt(), (Intent)w2.a().putExtra("action", n3), (int)0x8000000);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            pendingIntent = null;
        }
        return pendingIntent;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onReceive(Context object, Intent intent) {
        Throwable throwable2;
        block7: {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onReceive broadcast: ");
            stringBuilder.append(intent);
            stringBuilder.append("; ");
            stringBuilder.append(object);
            stringBuilder.append("; ");
            stringBuilder.append(MainService.instance);
            e1.p(stringBuilder.toString());
            int n3 = MainService.instance == null ? 1 : (intent == null ? 2 : (intent.getIntExtra("check-hash", 0) != a ? 3 : 0));
            stringBuilder = new StringBuilder();
            stringBuilder.append("Broadcast: ");
            stringBuilder.append(n3);
            e1.p(stringBuilder.toString());
            if (n3 != 0) {
                return;
            }
            {
                block8: {
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    try {
                        stringBuilder = new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS");
                        object.sendBroadcast((Intent)stringBuilder);
                        break block8;
                    }
                    catch (Throwable throwable3) {}
                    e1.s("Failed hide status bar", throwable3);
                }
                if (intent.getIntExtra("action", 0) != 1) {
                    MainService.instance.i1();
                    return;
                }
                ConfigListAdapter.v();
                return;
            }
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("onReceive broadcast fail: ");
        ((StringBuilder)object).append(intent);
        e1.s(((StringBuilder)object).toString(), throwable2);
    }
}

