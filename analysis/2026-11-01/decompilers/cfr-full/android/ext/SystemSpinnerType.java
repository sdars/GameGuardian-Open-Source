/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.Context;
import android.content.DialogInterface;
import android.ext.ArrayAdapter;
import android.ext.MainService;
import android.ext.SystemSpinner;
import android.ext.Tools;
import android.ext.c;
import android.ext.f;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

public class SystemSpinnerType
extends SystemSpinner {
    c.a[] d;

    public SystemSpinnerType(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void a() {
        int n3;
        this.d = android.ext.c.x(this.c, null);
        int n4 = 0;
        int n5 = 0;
        while (true) {
            c.a[] aArray = this.d;
            n3 = n4;
            if (n5 >= aArray.length) break;
            if (aArray[n5].a == this.a) {
                n3 = n5;
                break;
            }
            ++n5;
        }
        f.o(f.c(Tools.l0(this.getContext())).setSingleChoiceItems((ListAdapter)new ArrayAdapter(this, MainService.context, 17367058, 16908308, this.d){
            final SystemSpinnerType b;
            {
                this.b = systemSpinnerType;
                super(context, n3, n4, aArray);
            }

            @Override
            public View getView(int n3, View view, ViewGroup viewGroup) {
                if ((viewGroup = (TextView)(view = super.getView(n3, view, viewGroup)).findViewById(16908308)) != null) {
                    Object object;
                    Tools.D1((TextView)viewGroup, 2131361799);
                    if (n3 > 0 && n3 < ((c.a[])(object = this.b.d)).length && (object = object[n3]) != null) {
                        viewGroup.setTextColor(android.ext.c.n(object.a));
                    }
                }
                return view;
            }
        }, n3, (DialogInterface.OnClickListener)this));
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int n3) {
        this.setSelected(this.d[n3].a);
        Tools.D(dialogInterface);
    }

    @Override
    public void setSelected(int n3) {
        super.setSelected(n3);
        this.setTextColor(android.ext.c.n(n3));
    }
}

