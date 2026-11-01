/*
 * Decompiled with CFR 0.152.
 */
package c;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class b
implements MenuItem {
    private final int a;
    private final int b;
    private final int c;
    private CharSequence d;
    private CharSequence e;
    private Intent f;
    private char g;
    private char h;
    private Drawable i;
    private Context j;
    private MenuItem.OnMenuItemClickListener k;
    private int l = 16;

    public b(Context context, int n3, int n4, int n5, int n6, CharSequence charSequence) {
        this.j = context;
        this.a = n4;
        this.b = n3;
        this.c = n6;
        this.d = charSequence;
    }

    public boolean a() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.k;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        onMenuItemClickListener = this.f;
        if (onMenuItemClickListener != null) {
            this.j.startActivity((Intent)onMenuItemClickListener);
            return true;
        }
        return false;
    }

    public b b(boolean bl) {
        int n3 = this.l;
        int n4 = bl ? 4 : 0;
        this.l = n4 | n3 & 0xFFFFFFFB;
        return this;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        return null;
    }

    public View getActionView() {
        return null;
    }

    public char getAlphabeticShortcut() {
        return this.h;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public Intent getIntent() {
        return this.f;
    }

    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.g;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.d;
    }

    public CharSequence getTitleCondensed() {
        return this.e;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        int n3 = this.l;
        boolean bl = true;
        if ((n3 & 1) == 0) {
            bl = false;
        }
        return bl;
    }

    public boolean isChecked() {
        boolean bl = (this.l & 2) != 0;
        return bl;
    }

    public boolean isEnabled() {
        boolean bl = (this.l & 0x10) != 0;
        return bl;
    }

    public boolean isVisible() {
        boolean bl = (this.l & 8) == 0;
        return bl;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int n3) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c4) {
        this.h = c4;
        return this;
    }

    public MenuItem setCheckable(boolean bl) {
        this.l = bl | this.l & 0xFFFFFFFE;
        return this;
    }

    public MenuItem setChecked(boolean bl) {
        int n3 = this.l;
        int n4 = bl ? 2 : 0;
        this.l = n4 | n3 & 0xFFFFFFFD;
        return this;
    }

    public MenuItem setEnabled(boolean bl) {
        int n3 = this.l;
        int n4 = bl ? 16 : 0;
        this.l = n4 | n3 & 0xFFFFFFEF;
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public MenuItem setIcon(int n3) {
        try {
            this.i = this.j.getDrawable(n3);
            return this;
        }
        catch (Throwable throwable) {
            return this;
        }
    }

    public MenuItem setIcon(Drawable drawable2) {
        this.i = drawable2;
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c4) {
        this.g = c4;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.k = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c4, char c5) {
        this.g = c4;
        this.h = c5;
        return this;
    }

    public void setShowAsAction(int n3) {
    }

    public MenuItem setShowAsActionFlags(int n3) {
        this.setShowAsAction(n3);
        return this;
    }

    public MenuItem setTitle(int n3) {
        this.d = this.j.getResources().getString(n3);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean bl) {
        int n3 = this.l;
        int n4 = 8;
        if (bl) {
            n4 = 0;
        }
        this.l = n3 & 8 | n4;
        return this;
    }
}

