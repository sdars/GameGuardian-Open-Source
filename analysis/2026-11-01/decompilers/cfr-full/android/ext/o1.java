/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.p1;
import android.ext.z1;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class o1
implements DialogInterface.OnClickListener {
    private int a = 0;
    private final List b = new ArrayList();

    public boolean a(long l3, CharSequence charSequence) {
        return this.b(l3, charSequence, 0);
    }

    public boolean b(long l3, CharSequence charSequence, int n3) {
        int n4;
        int n5 = n4 = this.b.size();
        if (this.a < n4) {
            for (n5 = n4 - 1; n5 >= (n4 = this.a); --n5) {
                this.b.remove(n5);
            }
            n5 = n4;
        }
        if (n5 >= 100) {
            --this.a;
            this.b.remove(0);
        }
        ++this.a;
        Object object = MainService.instance.v0;
        object = object != null ? ((z1.d)object).c : null;
        return this.b.add(new a(l3, charSequence, (String)object, n3));
    }

    public void c() {
        if (this.b.size() == 0) {
            Tools.H1(2131296681);
            return;
        }
        int n3 = this.a;
        if (n3 < 2) {
            Tools.I1(2131296810, 0);
            return;
        }
        this.onClick(null, n3 - 2);
    }

    public void d() {
        Object object;
        String string2;
        int n3 = this.b.size();
        if (n3 == 0) {
            Tools.H1(2131296681);
            return;
        }
        CharSequence[] charSequenceArray = new CharSequence[n3];
        Drawable[] drawableArray = new Drawable[n3];
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (int i3 = 0; i3 < n3; ++i3) {
            a a4 = (a)this.b.get(i3);
            charSequenceArray[i3] = a4.a();
            string2 = a4.c;
            if (string2 == null) continue;
            string2 = (Drawable)hashMap.get(string2);
            object = string2;
            if (string2 == null) {
                try {
                    object = Tools.R1(Tools.G0(Tools.X(Tools.Y(a4.c)), Tools.H()));
                    string2 = object;
                }
                catch (Throwable throwable) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed load icon for ");
                    stringBuilder.append(a4.c);
                    e1.l(stringBuilder.toString(), throwable);
                }
                hashMap.put(a4.c, string2);
                object = string2;
            }
            drawableArray[i3] = object;
        }
        string2 = f.c(Tools.k0()).setCustomTitle(Tools.g0(2131296515)).setSingleChoiceItems(charSequenceArray, this.a - 1, (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null).create();
        object = string2.getListView();
        if (object != null) {
            Tools.e(object, charSequenceArray, drawableArray, 48, 2131361799);
        }
        f.m((AlertDialog)string2);
    }

    public void e() {
        int n3 = this.b.size();
        if (n3 == 0) {
            Tools.H1(2131296681);
            return;
        }
        int n4 = this.a;
        if (n4 >= n3) {
            Tools.I1(2131296809, 0);
            return;
        }
        this.onClick(null, n4);
    }

    public long f() {
        int n3 = this.b.size();
        int n4 = this.a;
        long l3 = n4 > 0 && n4 <= n3 ? ((a)this.b.get((int)(n4 - 1))).a : 0L;
        return l3;
    }

    public void onClick(DialogInterface dialogInterface, int n3) {
        a a4 = (a)this.b.get(n3);
        if (a4 != null) {
            this.a = n3 + 1;
            MainService.instance.K(a4.a, a4.d);
        }
        if (dialogInterface != null) {
            Tools.D(dialogInterface);
        }
    }

    public static class a {
        long a;
        private CharSequence b;
        String c;
        int d;

        public a(long l3, CharSequence charSequence, String string2, int n3) {
            this.a = l3;
            this.b = charSequence;
            this.c = string2;
            this.d = n3;
        }

        public CharSequence a() {
            CharSequence charSequence = Tools.t(android.ext.c.G(this.a, 0), Tools.d0(2130837504));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(": ");
            stringBuilder.append((Object)this.b);
            return Tools.x(charSequence, Tools.t(stringBuilder.toString(), -1));
        }
    }

    public static class b
    extends p1
    implements View.OnLongClickListener {
        private final o1 f;

        public b(o1 o12) {
            super(2131296295, 2130968624);
            this.f = o12;
        }

        @Override
        public ImageView b(boolean bl) {
            ImageView imageView = super.b(bl);
            imageView.setOnLongClickListener((View.OnLongClickListener)this);
            return imageView;
        }

        @Override
        public void onClick(View view) {
            this.f.c();
        }

        public boolean onLongClick(View view) {
            this.f.d();
            return true;
        }
    }

    public static class c
    extends p1
    implements View.OnLongClickListener {
        private final o1 f;

        public c(o1 o12) {
            super(2131296476, 2130968625);
            this.f = o12;
        }

        @Override
        public ImageView b(boolean bl) {
            ImageView imageView = super.b(bl);
            imageView.setOnLongClickListener((View.OnLongClickListener)this);
            return imageView;
        }

        @Override
        public void onClick(View view) {
            this.f.e();
        }

        public boolean onLongClick(View view) {
            this.f.d();
            return true;
        }
    }
}

