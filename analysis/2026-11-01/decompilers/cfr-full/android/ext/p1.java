/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.SharedPreferences;
import android.ext.Tools;
import android.ext.b2;
import android.ext.g2;
import android.fix.ToolbarButton;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public abstract class p1
implements View.OnClickListener {
    public static final long[] e = new long[3];
    protected String a;
    private int b = 0;
    private WeakReference c = new WeakReference<Object>(null);
    private int d = -1;

    public p1(int n3, int n4) {
        this.a = b2.f(n3);
        this.b = n4;
    }

    public p1(String string2) {
        this.a = string2;
    }

    public static String d() {
        SharedPreferences sharedPreferences = Tools.M0();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = 0; i3 < 3; ++i3) {
            CharSequence charSequence = new StringBuilder();
            charSequence.append("m-");
            charSequence.append(i3);
            charSequence = charSequence.toString();
            long l3 = sharedPreferences.getLong((String)charSequence, 0L);
            editor.remove((String)charSequence);
            if (l3 == 0L) continue;
            stringBuilder.append("&m");
            stringBuilder.append(i3);
            stringBuilder.append('=');
            stringBuilder.append(Long.toHexString(l3));
        }
        editor.commit();
        return stringBuilder.toString();
    }

    private static void f() {
        g2 g22 = new g2();
        for (int i3 = 0; i3 < 3; ++i3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("m-");
            stringBuilder.append(i3);
            g22.i(stringBuilder.toString(), e[i3], 0L);
        }
        g22.commit();
    }

    public final ImageView a() {
        return this.b(false);
    }

    public ImageView b(boolean bl) {
        ToolbarButton toolbarButton = new ToolbarButton(Tools.f0());
        toolbarButton.setIcon(this.b);
        p1 p12 = !bl ? this : new View.OnClickListener(this){
            final p1 a;
            {
                this.a = p12;
            }

            public void onClick(View view) {
                this.a.e(view);
            }
        };
        toolbarButton.setOnClickListener(p12);
        toolbarButton.setTag(this);
        return toolbarButton;
    }

    public Drawable c() {
        Drawable drawable2;
        if (this.b == 0) {
            return null;
        }
        Drawable drawable3 = drawable2 = (Drawable)this.c.get();
        if (drawable2 == null) {
            drawable3 = Tools.o0(this.b);
            this.c = new WeakReference<Drawable>(drawable3);
        }
        return drawable3;
    }

    public void e(View view) {
        long l3;
        long[] lArray;
        long l4;
        int n3;
        int n4 = this.d;
        if (n4 != -1 && (n3 = n4 / 64) >= 0 && n3 < 3 && ((l4 = (lArray = e)[n3]) & (l3 = 1L << n4 % 64)) == 0L) {
            lArray[n3] = l3 | l4;
            p1.f();
        }
        this.onClick(view);
    }

    public void g(int n3, int n4) {
        this.d = n3 * 64 + n4;
    }

    public abstract void onClick(View var1);

    public String toString() {
        return this.a;
    }
}

