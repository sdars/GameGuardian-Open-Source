package android.ext;

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

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class g3 implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Window.Callback f989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InternalKeyboard f990b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f991c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f992d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f993e = false;

    public g3(Window.Callback callback) {
        this.f989a = callback;
    }

    public void a(InternalKeyboard internalKeyboard) {
        this.f990b = internalKeyboard;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        try {
            return this.f989a.dispatchGenericMotionEvent(motionEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return this.f989a.dispatchKeyEvent(keyEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        try {
            return this.f989a.dispatchKeyShortcutEvent(keyEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f989a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return this.f989a.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f989a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        if (this.f993e) {
            return;
        }
        this.f993e = true;
        try {
            this.f989a.onActionModeFinished(actionMode);
            actionMode.finish();
        } finally {
            this.f993e = false;
        }
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        if (this.f992d) {
            return;
        }
        this.f992d = true;
        try {
            this.f989a.onActionModeStarted(actionMode);
        } finally {
            this.f992d = false;
        }
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f989a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f989a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f989a.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.f989a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f989a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f989a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.f989a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f989a.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f989a.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f989a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        try {
            this.f989a.onWindowAttributesChanged(layoutParams);
        } catch (IllegalArgumentException e2) {
            e1.a(e2);
        }
    }

    @Override // android.view.Window.Callback
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

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        ActionMode actionModeOnWindowStartingActionMode = null;
        if (this.f991c) {
            return null;
        }
        this.f991c = true;
        try {
            actionModeOnWindowStartingActionMode = this.f989a.onWindowStartingActionMode(callback);
            if (actionModeOnWindowStartingActionMode == null) {
                a aVar = new a(callback);
                try {
                    if (callback.onCreateActionMode(aVar, aVar.getMenu())) {
                        aVar.invalidate();
                        aVar.b();
                    }
                    actionModeOnWindowStartingActionMode = aVar;
                } catch (Throwable th) {
                    th = th;
                    actionModeOnWindowStartingActionMode = aVar;
                    try {
                        e1.l("Fail on onWindowStartingActionMode", th);
                    } finally {
                        this.f991c = false;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return actionModeOnWindowStartingActionMode;
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f989a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        try {
            ActionMode actionModeOnWindowStartingActionMode = this.f989a.onWindowStartingActionMode(callback, i);
            return (actionModeOnWindowStartingActionMode == null && i == 0) ? onWindowStartingActionMode(callback) : actionModeOnWindowStartingActionMode;
        } catch (Throwable th) {
            e1.l("Fail on onWindowStartingActionMode", th);
            return null;
        }
    }
}
