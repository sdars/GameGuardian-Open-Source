/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.ext.e1;
import android.ext.r;
import android.os.Bundle;

public class l2
extends b {
    public l2(Context context) {
        super(context);
    }

    public static Context i(Context context) {
        Object object = context;
        if (context != null) {
            object = context;
            if (!(context instanceof l2)) {
                object = new l2(context);
            }
        }
        return object;
    }

    public Context getApplicationContext() {
        Context context;
        Context context2 = context = super.getApplicationContext();
        if (context == null) {
            context2 = r.o;
        }
        return context2;
    }

    @Override
    public Object getSystemService(String object) {
        try {
            Object object2;
            object = object2 = super.getSystemService((String)object);
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getSystemService fail: ");
            stringBuilder.append((String)object);
            e1.l(stringBuilder.toString(), throwable);
            object = null;
        }
        return object;
    }

    public void startActivities(Intent[] intentArray) {
        if (intentArray != null) {
            int n3 = intentArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                Intent intent = intentArray[i3];
                if (intent == null) continue;
                intent.setFlags(0x10000000);
            }
        }
        super.startActivities(intentArray);
    }

    public void startActivities(Intent[] intentArray, Bundle bundle) {
        if (intentArray != null) {
            int n3 = intentArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                Intent intent = intentArray[i3];
                if (intent == null) continue;
                intent.setFlags(0x10000000);
            }
        }
        super.startActivities(intentArray, bundle);
    }

    @Override
    public void startActivity(Intent intent) {
        if (intent != null) {
            intent.setFlags(0x10000000);
        }
        super.startActivity(intent);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        if (intent != null) {
            intent.setFlags(0x10000000);
        }
        super.startActivity(intent, bundle);
    }

    @Override
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            e1.a(illegalArgumentException);
        }
    }
}

