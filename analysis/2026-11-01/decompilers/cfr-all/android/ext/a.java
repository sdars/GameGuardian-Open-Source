/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.WindowManager$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package android.ext;

import android.content.Context;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.m2;
import android.fix.Button;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.b;

public class a
extends ActionMode
implements View.OnClickListener {
    private CharSequence a = null;
    private CharSequence b = null;
    private View c = null;
    private LinearLayout d = null;
    private c.a e = null;
    private Context f;
    private boolean g = false;
    private boolean h = false;
    private WindowManager.LayoutParams i;
    private ActionMode.Callback j;

    public a(ActionMode.Callback callback) {
        Object object;
        this.f = object = MainService.context;
        this.e = new c.a((Context)object);
        object = new android.fix.LinearLayout(this.f);
        this.d = object;
        object.setAlpha(1.0f);
        object = this.d.getBackground();
        int n3 = object instanceof ColorDrawable ? ((ColorDrawable)object).getColor() : 0;
        this.d.setBackgroundColor(n3 | 0xFF000000);
        object = new WindowManager.LayoutParams();
        this.i = object;
        object.type = m2.b();
        object = this.i;
        object.width = -1;
        object.height = -2;
        object.format = -2;
        object.flags = m2.a();
        object = this.i;
        object.gravity = 55;
        object.y = 0;
        object.alpha = 1.0f;
        this.j = callback;
    }

    public void a() {
        if (!this.g) {
            return;
        }
        try {
            Tools.m1((View)this.d);
        }
        catch (Throwable throwable) {
            e1.l("removeView failed", throwable);
        }
        this.g = false;
    }

    public void b() {
        if (this.g) {
            return;
        }
        try {
            Tools.f((View)this.d, this.i);
            this.g = true;
        }
        catch (Throwable throwable) {
            e1.l("addView failed", throwable);
        }
    }

    public void finish() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.a();
        this.j.onDestroyActionMode((ActionMode)this);
    }

    public View getCustomView() {
        return this.c;
    }

    public Menu getMenu() {
        return this.e;
    }

    public MenuInflater getMenuInflater() {
        return new MenuInflater(this.f);
    }

    public CharSequence getSubtitle() {
        return this.b;
    }

    public CharSequence getTitle() {
        return this.a;
    }

    public void invalidate() {
        try {
            this.j.onPrepareActionMode((ActionMode)this, (Menu)this.e);
            return;
        }
        finally {
            Object object;
            this.d.removeAllViews();
            int n3 = this.e.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                MenuItem menuItem = this.e.getItem(i3);
                object = new Button(this.f);
                object.setAlpha(1.0f);
                object.setFocusable(false);
                Drawable drawable2 = menuItem.getIcon();
                Tools.c((TextView)object, drawable2, 32);
                if (drawable2 == null) {
                    object.setText(menuItem.getTitle());
                }
                object.setTag((Object)menuItem);
                object.setOnClickListener((View.OnClickListener)this);
                this.d.addView(object);
            }
            object = this.c;
            if (object != null) {
                this.d.addView(object);
            }
            this.d.invalidate();
            e1.d("invalidate");
        }
    }

    public void onClick(View view) {
        if ((view = (MenuItem)view.getTag()) instanceof b) {
            ((b)view).a();
        }
        this.j.onActionItemClicked((ActionMode)this, (MenuItem)view);
    }

    public void setCustomView(View view) {
        this.c = view;
        this.invalidate();
    }

    public void setSubtitle(int n3) {
        this.b = b2.f(n3);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b = charSequence;
    }

    public void setTitle(int n3) {
        this.a = b2.f(n3);
    }

    public void setTitle(CharSequence charSequence) {
        this.a = charSequence;
    }
}

