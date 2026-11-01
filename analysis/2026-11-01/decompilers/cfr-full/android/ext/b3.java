/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.MainService;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

abstract class b3 {
    final CheckBox a;
    final TextView b;
    final TextView c;
    final TextView d;
    final TextView e;
    final TextView f;
    final TextView g;
    final TextView h;
    final TextView i;
    final TextView j;
    final View k;
    final int l;
    int m;

    b3(View view, a a4) {
        CheckBox checkBox;
        this.a = checkBox = (CheckBox)view.findViewById(2131034146);
        this.b = (TextView)view.findViewById(2131034123);
        this.c = (TextView)view.findViewById(2131034446);
        this.d = (TextView)view.findViewById(2131034449);
        this.e = (TextView)view.findViewById(2131034451);
        this.f = (TextView)view.findViewById(2131034447);
        this.g = (TextView)view.findViewById(2131034439);
        this.h = (TextView)view.findViewById(2131034452);
        this.i = (TextView)view.findViewById(2131034440);
        this.j = (TextView)view.findViewById(2131034118);
        this.k = view;
        this.l = MainService.context.getResources().getConfiguration().orientation;
        view.setTag((Object)this);
        checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)a4);
        checkBox.setOnLongClickListener((View.OnLongClickListener)a4);
        checkBox.setTag((Object)this);
    }

    void a(boolean bl, int n3) {
        View view = this.k;
        n3 = bl ? -2139864428 : (this.m == n3 ? -2137746366 : 0);
        view.setBackgroundColor(n3);
    }

    boolean b() {
        boolean bl = this.l != MainService.context.getResources().getConfiguration().orientation;
        return bl;
    }

    static interface a
    extends CompoundButton.OnCheckedChangeListener,
    View.OnLongClickListener {
    }
}

