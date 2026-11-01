/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.InternalKeyboard;
import android.ext.a;
import android.ext.e1;
import android.ext.e3;
import android.ext.f3;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

public class g3
implements Window.Callback {
    Window.Callback a;
    private InternalKeyboard b = null;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;

    public g3(Window.Callback callback) {
        this.a = callback;
    }

    public void a(InternalKeyboard internalKeyboard) {
        this.b = internalKeyboard;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        try {
            boolean bl = this.a.dispatchGenericMotionEvent(motionEvent);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            boolean bl = this.a.dispatchKeyEvent(keyEvent);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean bl;
        try {
            bl = this.a.dispatchKeyShortcutEvent(keyEvent);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            bl = false;
        }
        return bl;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean bl;
        try {
            bl = this.a.dispatchTouchEvent(motionEvent);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            bl = false;
        }
        return bl;
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        if (this.e) {
            return;
        }
        this.e = true;
        try {
            this.a.onActionModeFinished(actionMode);
            actionMode.finish();
            return;
        }
        finally {
            this.e = false;
        }
    }

    public void onActionModeStarted(ActionMode actionMode) {
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            this.a.onActionModeStarted(actionMode);
            return;
        }
        finally {
            this.d = false;
        }
    }

    public void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.a.onContentChanged();
    }

    public boolean onCreatePanelMenu(int n3, Menu menu) {
        return this.a.onCreatePanelMenu(n3, menu);
    }

    public View onCreatePanelView(int n3) {
        return this.a.onCreatePanelView(n3);
    }

    public void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int n3, MenuItem menuItem) {
        return this.a.onMenuItemSelected(n3, menuItem);
    }

    public boolean onMenuOpened(int n3, Menu menu) {
        return this.a.onMenuOpened(n3, menu);
    }

    public void onPanelClosed(int n3, Menu menu) {
        this.a.onPanelClosed(n3, menu);
    }

    public boolean onPreparePanel(int n3, View view, Menu menu) {
        return this.a.onPreparePanel(n3, view, menu);
    }

    public boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return f3.a(this.a, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        try {
            this.a.onWindowAttributesChanged(layoutParams);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            e1.a(illegalArgumentException);
        }
    }

    public void onWindowFocusChanged(boolean bl) {
        try {
            this.a.onWindowFocusChanged(bl);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            e1.a(illegalArgumentException);
        }
        InternalKeyboard internalKeyboard = this.b;
        if (internalKeyboard != null) {
            internalKeyboard.j();
        }
    }

    /*
     * WARNING - void declaration
     */
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        ActionMode actionMode;
        block12: {
            void var1_4;
            boolean bl = this.c;
            actionMode = null;
            if (bl) {
                return null;
            }
            this.c = true;
            try {
                ActionMode actionMode2;
                actionMode = actionMode2 = this.a.onWindowStartingActionMode(callback);
                if (actionMode2 != null) break block12;
                actionMode = actionMode2;
                actionMode = actionMode2;
            }
            catch (Throwable throwable) {}
            a a4 = new a(callback);
            try {
                if (callback.onCreateActionMode((ActionMode)a4, a4.getMenu())) {
                    a4.invalidate();
                    a4.b();
                }
            }
            finally {
                actionMode = a4;
                break block12;
            }
            {
            }
            e1.l("Fail on onWindowStartingActionMode", (Throwable)var1_4);
        }
        return actionMode;
        finally {
            this.c = false;
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int n3) {
        ActionMode actionMode;
        block3: {
            ActionMode actionMode2;
            actionMode = null;
            actionMode = actionMode2 = e3.a(this.a, callback, n3);
            if (actionMode2 != null) break block3;
            actionMode = actionMode2;
            if (n3 != 0) break block3;
            actionMode = actionMode2;
            try {
                callback = this.onWindowStartingActionMode(callback);
                actionMode = callback;
            }
            catch (Throwable throwable) {
                e1.l("Fail on onWindowStartingActionMode", throwable);
            }
        }
        return actionMode;
    }
}

