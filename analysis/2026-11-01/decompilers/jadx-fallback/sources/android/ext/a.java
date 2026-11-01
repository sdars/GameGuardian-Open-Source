package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class a extends android.view.ActionMode implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.CharSequence f557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.CharSequence f558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.View f559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.widget.LinearLayout f560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c.a f561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.content.Context f562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f563g;
    private boolean h;
    private android.view.WindowManager.LayoutParams i;
    private android.view.ActionMode.Callback j;

    public a(android.view.ActionMode.Callback r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f557a = r0
            r4.f558b = r0
            r4.f559c = r0
            r4.f560d = r0
            r4.f561e = r0
            r0 = 0
            r4.f563g = r0
            r4.h = r0
            android.content.Context r1 = android.ext.MainService.context
            r4.f562f = r1
            c.a r2 = new c.a
            r2.<init>(r1)
            r4.f561e = r2
            android.fix.LinearLayout r1 = new android.fix.LinearLayout
            android.content.Context r2 = r4.f562f
            r1.<init>(r2)
            r4.f560d = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            android.widget.LinearLayout r1 = r4.f560d
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            boolean r3 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r3 == 0) goto L3d
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            int r1 = r1.getColor()
            goto L3e
        L3d:
            r1 = 0
        L3e:
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 | r3
            android.widget.LinearLayout r3 = r4.f560d
            r3.setBackgroundColor(r1)
            android.view.WindowManager$LayoutParams r1 = new android.view.WindowManager$LayoutParams
            r1.<init>()
            r4.i = r1
            int r3 = android.ext.m2.b()
            r1.type = r3
            android.view.WindowManager$LayoutParams r1 = r4.i
            r3 = -1
            r1.width = r3
            r3 = -2
            r1.height = r3
            r1.format = r3
            int r3 = android.ext.m2.a()
            r1.flags = r3
            android.view.WindowManager$LayoutParams r1 = r4.i
            r3 = 55
            r1.gravity = r3
            r1.y = r0
            r1.alpha = r2
            r4.j = r5
            return
    }

    public void a() {
            r2 = this;
            boolean r0 = r2.f563g
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.LinearLayout r0 = r2.f560d     // Catch: java.lang.Throwable -> Lb
            android.ext.Tools.m1(r0)     // Catch: java.lang.Throwable -> Lb
            goto L11
        Lb:
            r0 = move-exception
            java.lang.String r1 = "removeView failed"
            android.ext.e1.l(r1, r0)
        L11:
            r0 = 0
            r2.f563g = r0
            return
    }

    public void b() {
            r2 = this;
            boolean r0 = r2.f563g
            if (r0 == 0) goto L5
            return
        L5:
            android.widget.LinearLayout r0 = r2.f560d     // Catch: java.lang.Throwable -> L10
            android.view.WindowManager$LayoutParams r1 = r2.i     // Catch: java.lang.Throwable -> L10
            android.ext.Tools.f(r0, r1)     // Catch: java.lang.Throwable -> L10
            r0 = 1
            r2.f563g = r0     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r0 = move-exception
            java.lang.String r1 = "addView failed"
            android.ext.e1.l(r1, r0)
        L16:
            return
    }

    @Override // android.view.ActionMode
    public void finish() {
            r1 = this;
            boolean r0 = r1.h
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.h = r0
            r1.a()
            android.view.ActionMode$Callback r0 = r1.j
            r0.onDestroyActionMode(r1)
            return
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
            r1 = this;
            android.view.View r0 = r1.f559c
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
            r1 = this;
            c.a r0 = r1.f561e
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
            r2 = this;
            android.view.MenuInflater r0 = new android.view.MenuInflater
            android.content.Context r1 = r2.f562f
            r0.<init>(r1)
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f558b
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f557a
            return r0
    }

    @Override // android.view.ActionMode
    public void invalidate() {
            r10 = this;
            java.lang.String r0 = "invalidate"
            r1 = 32
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            android.view.ActionMode$Callback r4 = r10.j     // Catch: java.lang.Throwable -> L5f
            c.a r5 = r10.f561e     // Catch: java.lang.Throwable -> L5f
            r4.onPrepareActionMode(r10, r5)     // Catch: java.lang.Throwable -> L5f
            android.widget.LinearLayout r4 = r10.f560d
            r4.removeAllViews()
            c.a r4 = r10.f561e
            int r4 = r4.size()
            r5 = 0
        L1a:
            if (r5 >= r4) goto L4d
            c.a r6 = r10.f561e
            android.view.MenuItem r6 = r6.getItem(r5)
            android.fix.Button r7 = new android.fix.Button
            android.content.Context r8 = r10.f562f
            r7.<init>(r8)
            r7.setAlpha(r2)
            r7.setFocusable(r3)
            android.graphics.drawable.Drawable r8 = r6.getIcon()
            android.ext.Tools.c(r7, r8, r1)
            if (r8 != 0) goto L3f
            java.lang.CharSequence r8 = r6.getTitle()
            r7.setText(r8)
        L3f:
            r7.setTag(r6)
            r7.setOnClickListener(r10)
            android.widget.LinearLayout r6 = r10.f560d
            r6.addView(r7)
            int r5 = r5 + 1
            goto L1a
        L4d:
            android.view.View r1 = r10.f559c
            if (r1 == 0) goto L56
            android.widget.LinearLayout r2 = r10.f560d
            r2.addView(r1)
        L56:
            android.widget.LinearLayout r1 = r10.f560d
            r1.invalidate()
            android.ext.e1.d(r0)
            return
        L5f:
            r4 = move-exception
            android.widget.LinearLayout r5 = r10.f560d
            r5.removeAllViews()
            c.a r5 = r10.f561e
            int r5 = r5.size()
            r6 = 0
        L6c:
            if (r6 >= r5) goto L9f
            c.a r7 = r10.f561e
            android.view.MenuItem r7 = r7.getItem(r6)
            android.fix.Button r8 = new android.fix.Button
            android.content.Context r9 = r10.f562f
            r8.<init>(r9)
            r8.setAlpha(r2)
            r8.setFocusable(r3)
            android.graphics.drawable.Drawable r9 = r7.getIcon()
            android.ext.Tools.c(r8, r9, r1)
            if (r9 != 0) goto L91
            java.lang.CharSequence r9 = r7.getTitle()
            r8.setText(r9)
        L91:
            r8.setTag(r7)
            r8.setOnClickListener(r10)
            android.widget.LinearLayout r7 = r10.f560d
            r7.addView(r8)
            int r6 = r6 + 1
            goto L6c
        L9f:
            android.view.View r1 = r10.f559c
            if (r1 == 0) goto La8
            android.widget.LinearLayout r2 = r10.f560d
            r2.addView(r1)
        La8:
            android.widget.LinearLayout r1 = r10.f560d
            r1.invalidate()
            android.ext.e1.d(r0)
            throw r4
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            java.lang.Object r2 = r2.getTag()
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            boolean r0 = r2 instanceof c.b
            if (r0 == 0) goto L10
            r0 = r2
            c.b r0 = (c.b) r0
            r0.a()
        L10:
            android.view.ActionMode$Callback r0 = r1.j
            r0.onActionItemClicked(r1, r2)
            return
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View r1) {
            r0 = this;
            r0.f559c = r1
            r0.invalidate()
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int r1) {
            r0 = this;
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.f558b = r1
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f558b = r1
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(int r1) {
            r0 = this;
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.f557a = r1
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f557a = r1
            return
    }
}
