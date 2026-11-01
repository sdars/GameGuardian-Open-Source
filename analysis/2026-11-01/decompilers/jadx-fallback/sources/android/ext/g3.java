package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class g3 implements android.view.Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.view.Window.Callback f989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.ext.InternalKeyboard f990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f993e;

    public g3(android.view.Window.Callback r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f990b = r0
            r0 = 0
            r1.f991c = r0
            r1.f992d = r0
            r1.f993e = r0
            r1.f989a = r2
            return
    }

    public void a(android.ext.InternalKeyboard r1) {
            r0 = this;
            r0.f990b = r1
            return
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a     // Catch: java.lang.Throwable -> L7
            boolean r2 = r0.dispatchGenericMotionEvent(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            r2 = 0
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a     // Catch: java.lang.Throwable -> L7
            boolean r2 = r0.dispatchKeyEvent(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            r2 = 0
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a     // Catch: java.lang.Throwable -> L7
            boolean r2 = r0.dispatchKeyShortcutEvent(r2)     // Catch: java.lang.Throwable -> L7
            goto Lc
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            r2 = 0
        Lc:
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a     // Catch: java.lang.Throwable -> L7
            boolean r2 = r0.dispatchTouchEvent(r2)     // Catch: java.lang.Throwable -> L7
            goto Lc
        L7:
            r2 = move-exception
            android.ext.e1.a(r2)
            r2 = 0
        Lc:
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode r3) {
            r2 = this;
            boolean r0 = r2.f993e
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.f993e = r0
            r0 = 0
            android.view.Window$Callback r1 = r2.f989a     // Catch: java.lang.Throwable -> L14
            r1.onActionModeFinished(r3)     // Catch: java.lang.Throwable -> L14
            r3.finish()     // Catch: java.lang.Throwable -> L14
            r2.f993e = r0
            return
        L14:
            r3 = move-exception
            r2.f993e = r0
            throw r3
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode r3) {
            r2 = this;
            boolean r0 = r2.f992d
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.f992d = r0
            r0 = 0
            android.view.Window$Callback r1 = r2.f989a     // Catch: java.lang.Throwable -> L11
            r1.onActionModeStarted(r3)     // Catch: java.lang.Throwable -> L11
            r2.f992d = r0
            return
        L11:
            r3 = move-exception
            r2.f992d = r0
            throw r3
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            r0.onContentChanged()
            return
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            boolean r2 = r0.onCreatePanelMenu(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            android.view.View r2 = r0.onCreatePanelView(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            boolean r2 = r0.onMenuOpened(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            r0.onPanelClosed(r2, r3)
            return
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            boolean r2 = r0.onPreparePanel(r2, r3, r4)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a
            boolean r2 = android.ext.f3.a(r0, r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a     // Catch: java.lang.IllegalArgumentException -> L6
            r0.onWindowAttributesChanged(r2)     // Catch: java.lang.IllegalArgumentException -> L6
            goto La
        L6:
            r2 = move-exception
            android.ext.e1.a(r2)
        La:
            return
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f989a     // Catch: java.lang.IllegalArgumentException -> L6
            r0.onWindowFocusChanged(r2)     // Catch: java.lang.IllegalArgumentException -> L6
            goto La
        L6:
            r2 = move-exception
            android.ext.e1.a(r2)
        La:
            android.ext.InternalKeyboard r2 = r1.f990b
            if (r2 == 0) goto L11
            r2.j()
        L11:
            return
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r4) {
            r3 = this;
            boolean r0 = r3.f991c
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            r3.f991c = r0
            r0 = 0
            android.view.Window$Callback r2 = r3.f989a     // Catch: java.lang.Throwable -> L2d
            android.view.ActionMode r1 = r2.onWindowStartingActionMode(r4)     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2f
            android.ext.a r2 = new android.ext.a     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            android.view.Menu r1 = r2.getMenu()     // Catch: java.lang.Throwable -> L28
            boolean r4 = r4.onCreateActionMode(r2, r1)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L2b
            r2.invalidate()     // Catch: java.lang.Throwable -> L28
            r2.b()     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            r4 = move-exception
            r1 = r2
            goto L32
        L2b:
            r1 = r2
            goto L2f
        L2d:
            r4 = move-exception
            goto L32
        L2f:
            r3.f991c = r0
            goto L38
        L32:
            java.lang.String r2 = "Fail on onWindowStartingActionMode"
            android.ext.e1.l(r2, r4)     // Catch: java.lang.Throwable -> L39
            goto L2f
        L38:
            return r1
        L39:
            r4 = move-exception
            r3.f991c = r0
            throw r4
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r3, int r4) {
            r2 = this;
            r0 = 0
            android.view.Window$Callback r1 = r2.f989a     // Catch: java.lang.Throwable -> L10
            android.view.ActionMode r0 = android.ext.e3.a(r1, r3, r4)     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L16
            if (r4 != 0) goto L16
            android.view.ActionMode r0 = r2.onWindowStartingActionMode(r3)     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r3 = move-exception
            java.lang.String r4 = "Fail on onWindowStartingActionMode"
            android.ext.e1.l(r4, r3)
        L16:
            return r0
    }
}
