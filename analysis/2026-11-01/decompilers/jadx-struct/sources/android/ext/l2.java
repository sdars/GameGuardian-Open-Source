package android.ext;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class l2 extends a.b {
    public l2(Context context) {
        super(context);
    }

    public static Context i(Context context) {
        return (context == null || (context instanceof l2)) ? context : new l2(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return applicationContext == null ? r.o : applicationContext;
    }

    @Override // a.b, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        try {
            return super.getSystemService(str);
        } catch (Throwable th) {
            e1.l("getSystemService fail: " + str, th);
            return null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr) {
        if (intentArr != null) {
            for (Intent intent : intentArr) {
                if (intent != null) {
                    intent.setFlags(268435456);
                }
            }
        }
        super.startActivities(intentArr);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr, Bundle bundle) {
        if (intentArr != null) {
            for (Intent intent : intentArr) {
                if (intent != null) {
                    intent.setFlags(268435456);
                }
            }
        }
        super.startActivities(intentArr, bundle);
    }

    @Override // a.b, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        if (intent != null) {
            intent.setFlags(268435456);
        }
        super.startActivity(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        if (intent != null) {
            intent.setFlags(268435456);
        }
        super.startActivity(intent, bundle);
    }

    @Override // a.b, android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e2) {
            e1.a(e2);
        }
    }
}
