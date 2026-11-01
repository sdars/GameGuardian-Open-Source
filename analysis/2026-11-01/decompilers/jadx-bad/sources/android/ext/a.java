package android.ext;

import android.content.Context;
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

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class a extends ActionMode implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinearLayout f560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c.a f561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f562f;
    private WindowManager.LayoutParams i;
    private ActionMode.Callback j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f557a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f558b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f559c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f563g = false;
    private boolean h = false;

    public a(ActionMode.Callback callback) {
        this.f560d = null;
        this.f561e = null;
        Context context = MainService.context;
        this.f562f = context;
        this.f561e = new c.a(context);
        android.fix.LinearLayout linearLayout = new android.fix.LinearLayout(this.f562f);
        this.f560d = linearLayout;
        linearLayout.setAlpha(1.0f);
        Drawable background = this.f560d.getBackground();
        this.f560d.setBackgroundColor((background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0) | (-16777216));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.i = layoutParams;
        layoutParams.type = m2.b();
        WindowManager.LayoutParams layoutParams2 = this.i;
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        layoutParams2.format = -2;
        layoutParams2.flags = m2.a();
        WindowManager.LayoutParams layoutParams3 = this.i;
        layoutParams3.gravity = 55;
        layoutParams3.y = 0;
        layoutParams3.alpha = 1.0f;
        this.j = callback;
    }

    public void a() {
        if (this.f563g) {
            try {
                Tools.m1(this.f560d);
            } catch (Throwable th) {
                e1.l("removeView failed", th);
            }
            this.f563g = false;
        }
    }

    public void b() {
        if (this.f563g) {
            return;
        }
        try {
            Tools.f(this.f560d, this.i);
            this.f563g = true;
        } catch (Throwable th) {
            e1.l("addView failed", th);
        }
    }

    @Override // android.view.ActionMode
    public void finish() {
        if (this.h) {
            return;
        }
        this.h = true;
        a();
        this.j.onDestroyActionMode(this);
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f559c;
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return this.f561e;
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return new MenuInflater(this.f562f);
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f558b;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f557a;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        int size;
        int i;
        MenuItem item;
        Button button;
        try {
            this.j.onPrepareActionMode(this, this.f561e);
            this.f560d.removeAllViews();
            size = this.f561e.size();
            int i2 = 0;
            while (i < size) {
                item = this.f561e.getItem(i);
                button = new Button(this.f562f);
                button.setAlpha(1.0f);
                button.setFocusable(false);
                Drawable icon = item.getIcon();
                Tools.c(button, icon, 32);
                if (icon == null) {
                    button.setText(item.getTitle());
                }
            }
        } finally {
            this.f560d.removeAllViews();
            size = this.f561e.size();
            for (i = 0; i < size; i++) {
                item = this.f561e.getItem(i);
                button = new Button(this.f562f);
                button.setAlpha(1.0f);
                button.setFocusable(false);
                Drawable icon2 = item.getIcon();
                Tools.c(button, icon2, 32);
                if (icon2 == null) {
                    button.setText(item.getTitle());
                }
                button.setTag(item);
                button.setOnClickListener(this);
                this.f560d.addView(button);
            }
            View view = this.f559c;
            if (view != null) {
                this.f560d.addView(view);
            }
            this.f560d.invalidate();
            e1.d("invalidate");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MenuItem menuItem = (MenuItem) view.getTag();
        if (menuItem instanceof c.b) {
            ((c.b) menuItem).a();
        }
        this.j.onActionItemClicked(this, menuItem);
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f559c = view;
        invalidate();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f558b = b2.f(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f557a = b2.f(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f558b = charSequence;
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f557a = charSequence;
    }
}
