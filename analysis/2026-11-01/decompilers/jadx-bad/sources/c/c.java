package c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c extends a implements SubMenu {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f1502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f1503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f1504g;
    View h;
    MenuItem i;
    a j;

    public c(Context context, a aVar, MenuItem menuItem) {
        super(context);
        this.f1502e = "";
        this.f1503f = null;
        this.f1504g = null;
        this.h = null;
        this.i = menuItem;
        this.j = aVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.h = null;
        this.f1502e = "";
        this.f1503f = null;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.i;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return setHeaderIcon(this.f1492b.getDrawable(i));
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return setHeaderTitle(this.f1492b.getString(i));
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.h = view;
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        return setIcon(this.f1492b.getDrawable(i));
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1503f = drawable;
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1502e = charSequence;
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1504g = drawable;
        return this;
    }
}
