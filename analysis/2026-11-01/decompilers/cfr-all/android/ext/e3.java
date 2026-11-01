/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Window$Callback
 */
package android.ext;

import android.view.ActionMode;
import android.view.Window;

public abstract class e3 {
    public static /* bridge */ /* synthetic */ ActionMode a(Window.Callback callback, ActionMode.Callback callback2, int n3) {
        return callback.onWindowStartingActionMode(callback2, n3);
    }
}

