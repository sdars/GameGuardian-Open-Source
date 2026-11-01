/*
 * Decompiled with CFR 0.152.
 */
package c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.a;

public class c
extends a
implements SubMenu {
    private CharSequence e = "";
    Drawable f = null;
    Drawable g = null;
    View h = null;
    MenuItem i;
    a j;

    public c(Context context, a a4, MenuItem menuItem) {
        super(context);
        this.i = menuItem;
        this.j = a4;
    }

    public void clearHeader() {
        this.h = null;
        this.e = "";
        this.f = null;
    }

    public MenuItem getItem() {
        return this.i;
    }

    public SubMenu setHeaderIcon(int n3) {
        return this.setHeaderIcon(this.b.getDrawable(n3));
    }

    public SubMenu setHeaderIcon(Drawable drawable2) {
        this.f = drawable2;
        return this;
    }

    public SubMenu setHeaderTitle(int n3) {
        return this.setHeaderTitle(this.b.getString(n3));
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.h = view;
        return this;
    }

    public SubMenu setIcon(int n3) {
        return this.setIcon(this.b.getDrawable(n3));
    }

    public SubMenu setIcon(Drawable drawable2) {
        this.g = drawable2;
        return this;
    }
}

