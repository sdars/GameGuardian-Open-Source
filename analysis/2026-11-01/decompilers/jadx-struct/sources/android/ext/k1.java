package android.ext;

import android.app.Notification$Action$Builder;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k1 {
    public static /* synthetic */ Notification$Action$Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification$Action$Builder(icon, charSequence, pendingIntent);
    }
}
