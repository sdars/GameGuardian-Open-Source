/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.Config;
import android.ext.b3;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

class d3
extends b3 {
    final TextView n;
    final LinearLayout o;
    final TextView p;
    final ImageView q;

    d3(View view, a a4) {
        super(view, a4);
        this.n = (TextView)view.findViewById(2131034121);
        this.o = (LinearLayout)view.findViewById(2131034117);
        this.p = (TextView)view.findViewById(2131034120);
        view = Config.m((ImageView)view.findViewById(2131034119));
        this.q = view;
        view.setOnClickListener((View.OnClickListener)a4);
        view.setOnLongClickListener((View.OnLongClickListener)a4);
    }

    static interface a
    extends b3.a,
    View.OnClickListener {
    }
}

