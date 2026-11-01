package c;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class a implements android.view.Menu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected android.content.Context f1491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected android.content.res.Resources f1492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.ArrayList f1494d;

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f1491a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f1494d = r1
            android.content.Context r1 = r0.f1491a
            android.content.res.Resources r1 = r1.getResources()
            r0.f1492b = r1
            return
    }

    private int a(int r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f1494d
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L19
            java.lang.Object r3 = r0.get(r2)
            c.b r3 = (c.b) r3
            int r3 = r3.getItemId()
            if (r3 != r5) goto L16
            return r2
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r5 = -1
            return r5
    }

    private c.b b(int r6, android.view.KeyEvent r7) {
            r5 = this;
            boolean r7 = r5.f1493c
            java.util.ArrayList r0 = r5.f1494d
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L22
            java.lang.Object r3 = r0.get(r2)
            c.b r3 = (c.b) r3
            if (r7 == 0) goto L18
            char r4 = r3.getAlphabeticShortcut()
            goto L1c
        L18:
            char r4 = r3.getNumericShortcut()
        L1c:
            if (r6 != r4) goto L1f
            return r3
        L1f:
            int r2 = r2 + 1
            goto L9
        L22:
            r6 = 0
            return r6
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2) {
            r1 = this;
            r0 = 0
            android.view.MenuItem r2 = r1.add(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.f1492b
            java.lang.String r5 = r0.getString(r5)
            android.view.MenuItem r2 = r1.add(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r9, int r10, int r11, java.lang.CharSequence r12) {
            r8 = this;
            c.b r7 = new c.b
            android.content.Context r1 = r8.c()
            r4 = 0
            r0 = r7
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r9 = r8.f1494d
            r9.add(r11, r7)
            return r7
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.MenuItem r2 = r1.add(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
            r7 = this;
            android.content.Context r0 = r7.f1491a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L12
            int r2 = r11.size()
            goto L13
        L12:
            r2 = 0
        L13:
            r14 = r14 & 1
            if (r14 != 0) goto L1a
            r7.removeGroup(r8)
        L1a:
            if (r1 >= r2) goto L5e
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L2a
            r4 = r13
            goto L2c
        L2a:
            r4 = r12[r4]
        L2c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.add(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            android.view.MenuItem r4 = r4.setIcon(r5)
            android.view.MenuItem r3 = r4.setIntent(r3)
            if (r15 == 0) goto L5b
            int r14 = r14.specificIndex
            if (r14 < 0) goto L5b
            r15[r14] = r3
        L5b:
            int r1 = r1 + 1
            goto L1a
        L5e:
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f1492b
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            android.view.SubMenu r2 = r1.addSubMenu(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.f1492b
            java.lang.String r5 = r0.getString(r5)
            android.view.SubMenu r2 = r1.addSubMenu(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.add(r1, r2, r3, r4)
            c.c r2 = new c.c
            android.content.Context r3 = r0.f1491a
            r2.<init>(r3, r0, r1)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.SubMenu r2 = r1.addSubMenu(r0, r0, r0, r2)
            return r2
    }

    public android.content.Context c() {
            r1 = this;
            android.content.Context r0 = r1.f1491a
            return r0
    }

    @Override // android.view.Menu
    public void clear() {
            r1 = this;
            java.util.ArrayList r0 = r1.f1494d
            r0.clear()
            java.util.ArrayList r0 = r1.f1494d
            r0.trimToSize()
            return
    }

    @Override // android.view.Menu
    public void close() {
            r0 = this;
            return
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r2) {
            r1 = this;
            int r2 = r1.a(r2)
            if (r2 >= 0) goto L8
            r2 = 0
            goto L10
        L8:
            java.util.ArrayList r0 = r1.f1494d
            java.lang.Object r2 = r0.get(r2)
            android.view.MenuItem r2 = (android.view.MenuItem) r2
        L10:
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.f1494d
            java.lang.Object r2 = r0.get(r2)
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            return r2
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r5 = this;
            java.util.ArrayList r0 = r5.f1494d
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L1b
            java.lang.Object r4 = r0.get(r3)
            c.b r4 = (c.b) r4
            boolean r4 = r4.isVisible()
            if (r4 == 0) goto L18
            r0 = 1
            return r0
        L18:
            int r3 = r3 + 1
            goto L8
        L1b:
            return r2
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r1, android.view.KeyEvent r2) {
            r0 = this;
            c.b r1 = r0.b(r1, r2)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r1, int r2) {
            r0 = this;
            int r1 = r0.a(r1)
            if (r1 >= 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.ArrayList r2 = r0.f1494d
            java.lang.Object r1 = r2.get(r1)
            c.b r1 = (c.b) r1
            boolean r1 = r1.a()
            return r1
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r1, android.view.KeyEvent r2, int r3) {
            r0 = this;
            c.b r1 = r0.b(r1, r2)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = r1.a()
            return r1
    }

    @Override // android.view.Menu
    public void removeGroup(int r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f1494d
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L1e
            java.lang.Object r3 = r0.get(r2)
            c.b r3 = (c.b) r3
            int r3 = r3.getGroupId()
            if (r3 != r5) goto L1b
            r0.remove(r2)
            int r1 = r1 + (-1)
            goto L7
        L1b:
            int r2 = r2 + 1
            goto L7
        L1e:
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.f1494d
            int r2 = r1.a(r2)
            r0.remove(r2)
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r6, boolean r7, boolean r8) {
            r5 = this;
            java.util.ArrayList r0 = r5.f1494d
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L1e
            java.lang.Object r3 = r0.get(r2)
            c.b r3 = (c.b) r3
            int r4 = r3.getGroupId()
            if (r4 != r6) goto L1b
            r3.setCheckable(r7)
            r3.b(r8)
        L1b:
            int r2 = r2 + 1
            goto L7
        L1e:
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r6, boolean r7) {
            r5 = this;
            java.util.ArrayList r0 = r5.f1494d
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L1b
            java.lang.Object r3 = r0.get(r2)
            c.b r3 = (c.b) r3
            int r4 = r3.getGroupId()
            if (r4 != r6) goto L18
            r3.setEnabled(r7)
        L18:
            int r2 = r2 + 1
            goto L7
        L1b:
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r6, boolean r7) {
            r5 = this;
            java.util.ArrayList r0 = r5.f1494d
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L1b
            java.lang.Object r3 = r0.get(r2)
            c.b r3 = (c.b) r3
            int r4 = r3.getGroupId()
            if (r4 != r6) goto L18
            r3.setVisible(r7)
        L18:
            int r2 = r2 + 1
            goto L7
        L1b:
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
            r0 = this;
            r0.f1493c = r1
            return
    }

    @Override // android.view.Menu
    public int size() {
            r1 = this;
            java.util.ArrayList r0 = r1.f1494d
            int r0 = r0.size()
            return r0
    }
}
