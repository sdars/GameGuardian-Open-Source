/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.SearchEvent
 *  android.view.Window$Callback
 */
package android.ext;

import android.view.SearchEvent;
import android.view.Window;

public abstract class f3 {
    public static /* bridge */ /* synthetic */ boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }
}

