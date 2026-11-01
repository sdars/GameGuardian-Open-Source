package c;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c extends c.a implements android.view.SubMenu {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.CharSequence f1502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    android.graphics.drawable.Drawable f1503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    android.graphics.drawable.Drawable f1504g;
    android.view.View h;
    android.view.MenuItem i;
    c.a j;

    public c(android.content.Context r1, c.a r2, android.view.MenuItem r3) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = ""
            r0.f1502e = r1
            r1 = 0
            r0.f1503f = r1
            r0.f1504g = r1
            r0.h = r1
            r0.i = r3
            r0.j = r2
            return
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
            r2 = this;
            r0 = 0
            r2.h = r0
            java.lang.String r1 = ""
            r2.f1502e = r1
            r2.f1503f = r0
            return
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
            r1 = this;
            android.view.MenuItem r0 = r1.i
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f1492b
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            android.view.SubMenu r2 = r1.setHeaderIcon(r2)
            return r2
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f1503f = r1
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f1492b
            java.lang.String r2 = r0.getString(r2)
            android.view.SubMenu r2 = r1.setHeaderTitle(r2)
            return r2
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1502e = r1
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View r1) {
            r0 = this;
            r0.h = r1
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f1492b
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            android.view.SubMenu r2 = r1.setIcon(r2)
            return r2
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f1504g = r1
            return r0
    }
}
