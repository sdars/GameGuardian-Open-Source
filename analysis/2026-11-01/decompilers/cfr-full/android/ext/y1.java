/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.ActivityManager;
import android.content.ComponentName;

public abstract class y1 {
    public static /* bridge */ /* synthetic */ ComponentName a(ActivityManager.RunningTaskInfo runningTaskInfo) {
        return runningTaskInfo.baseActivity;
    }
}

