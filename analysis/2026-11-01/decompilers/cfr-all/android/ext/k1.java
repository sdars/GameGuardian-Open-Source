/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Action$Builder
 *  android.app.PendingIntent
 *  android.graphics.drawable.Icon
 */
package android.ext;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

public abstract class k1 {
    public static /* synthetic */ Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }
}

