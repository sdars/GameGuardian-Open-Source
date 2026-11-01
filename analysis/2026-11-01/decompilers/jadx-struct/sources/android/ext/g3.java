package android.ext;

import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window$Callback;
import android.view.WindowManager$LayoutParams;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public class g3 implements Window$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Window$Callback f989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InternalKeyboard f990b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f991c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f992d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f993e = false;

    public g3(Window$Callback window$Callback) {
        this.f989a = window$Callback;
    }

    public void a(InternalKeyboard internalKeyboard) {
        this.f990b = internalKeyboard;
    }

    @Override // android.view.Window$Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        try {
            return this.f989a.dispatchGenericMotionEvent(motionEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.Window$Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return this.f989a.dispatchKeyEvent(keyEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.Window$Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        try {
            return this.f989a.dispatchKeyShortcutEvent(keyEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.Window$Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f989a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window$Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return this.f989a.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.Window$Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f989a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window$Callback
    public void onActionModeFinished(ActionMode actionMode) {
        if (this.f993e) {
            return;
        }
        this.f993e = true;
        try {
            this.f989a.onActionModeFinished(actionMode);
            actionMode.finish();
            this.f993e = false;
        } catch (Throwable th) {
            this.f993e = false;
            throw th;
        }
    }

    @Override // android.view.Window$Callback
    public void onActionModeStarted(ActionMode actionMode) {
        if (this.f992d) {
            return;
        }
        this.f992d = true;
        try {
            this.f989a.onActionModeStarted(actionMode);
            this.f992d = false;
        } catch (Throwable th) {
            this.f992d = false;
            throw th;
        }
    }

    @Override // android.view.Window$Callback
    public void onAttachedToWindow() {
        this.f989a.onAttachedToWindow();
    }

    @Override // android.view.Window$Callback
    public void onContentChanged() {
        this.f989a.onContentChanged();
    }

    @Override // android.view.Window$Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f989a.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window$Callback
    public View onCreatePanelView(int i) {
        return this.f989a.onCreatePanelView(i);
    }

    @Override // android.view.Window$Callback
    public void onDetachedFromWindow() {
        this.f989a.onDetachedFromWindow();
    }

    @Override // android.view.Window$Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f989a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window$Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.f989a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window$Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f989a.onPanelClosed(i, menu);
    }

    @Override // android.view.Window$Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f989a.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window$Callback
    public boolean onSearchRequested() {
        return this.f989a.onSearchRequested();
    }

    @Override // android.view.Window$Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f989a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window$Callback
    public void onWindowAttributesChanged(WindowManager$LayoutParams windowManager$LayoutParams) {
        try {
            this.f989a.onWindowAttributesChanged(windowManager$LayoutParams);
        } catch (IllegalArgumentException e2) {
            e1.a(e2);
        }
    }

    @Override // android.view.Window$Callback
    public void onWindowFocusChanged(boolean z) {
        try {
            this.f989a.onWindowFocusChanged(z);
        } catch (IllegalArgumentException e2) {
            e1.a(e2);
        }
        InternalKeyboard internalKeyboard = this.f990b;
        if (internalKeyboard != null) {
            internalKeyboard.j();
        }
    }

    @Override // android.view.Window$Callback
    public ActionMode onWindowStartingActionMode(ActionMode$Callback actionMode$Callback) {
        ActionMode actionModeOnWindowStartingActionMode = null;
        if (this.f991c) {
            return null;
        }
        this.f991c = true;
        try {
            actionModeOnWindowStartingActionMode = this.f989a.onWindowStartingActionMode(actionMode$Callback);
            if (actionModeOnWindowStartingActionMode == null) {
                a aVar = new a(actionMode$Callback);
                try {
                    if (actionMode$Callback.onCreateActionMode(aVar, aVar.getMenu())) {
                        aVar.invalidate();
                        aVar.b();
                    }
                    actionModeOnWindowStartingActionMode = aVar;
                } catch (Throwable th) {
                    th = th;
                    actionModeOnWindowStartingActionMode = aVar;
                    try {
                        e1.l("Fail on onWindowStartingActionMode", th);
                    } catch (Throwable th2) {
                        this.f991c = false;
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        this.f991c = false;
        return actionModeOnWindowStartingActionMode;
    }

    @Override // android.view.Window$Callback
    public ActionMode onWindowStartingActionMode(ActionMode$Callback actionMode$Callback, int i) {
        try {
            ActionMode actionModeOnWindowStartingActionMode = this.f989a.onWindowStartingActionMode(actionMode$Callback, i);
            return (actionModeOnWindowStartingActionMode == null && i == 0) ? onWindowStartingActionMode(actionMode$Callback) : actionModeOnWindowStartingActionMode;
        } catch (Throwable th) {
            e1.l("Fail on onWindowStartingActionMode", th);
            return null;
        }
    }
}
