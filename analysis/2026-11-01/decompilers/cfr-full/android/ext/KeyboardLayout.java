/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.b;
import android.content.Context;
import android.content.res.Configuration;
import android.ext.InternalKeyboard;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.e1;
import android.fix.FrameLayout;
import android.fix.LinearLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

public class KeyboardLayout
extends LinearLayout {
    private ScrollView a;
    private FrameLayout b;
    private InternalKeyboard c;
    private int d;

    public KeyboardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a() {
        if (this.a != null) {
            return;
        }
        this.d = 0;
        this.a = (ScrollView)this.findViewById(2131034302);
        this.b = (FrameLayout)this.findViewById(2131034301);
        this.c = (InternalKeyboard)this.findViewById(2131034303);
    }

    private void b(View view, int n3, int n4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = n3;
        layoutParams.height = n4;
        view.setLayoutParams(layoutParams);
    }

    public void c() {
        Object object = Tools.f0().getResources().getConfiguration();
        int n3 = object.orientation;
        if (n3 == this.d) {
            return;
        }
        this.d = n3;
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("Screen: ");
        ((StringBuilder)object2).append(object.screenWidthDp);
        ((StringBuilder)object2).append("dp x ");
        ((StringBuilder)object2).append(object.screenHeightDp);
        ((StringBuilder)object2).append("dp");
        e1.d(((StringBuilder)object2).toString());
        this.a();
        object2 = n3 == 1 ? (Object)new int[]{1, -1, 0} : (Object)new int[]{0, -1, -2};
        this.setOrientation((int)object2[0]);
        object = this.a.getVisibility() == 0 ? this.a : this.b;
        this.b((View)object, (int)object2[1], (int)object2[2]);
        this.c.t();
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KeyboardLayout onConfigurationChanged: ");
        stringBuilder.append(configuration);
        e1.d(stringBuilder.toString());
        configuration = a.b.f(configuration);
        super.onConfigurationChanged(configuration);
        this.c();
        MainService.Y(configuration);
    }
}

