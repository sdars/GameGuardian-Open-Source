/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.e;
import android.content.DialogInterface;
import android.ext.ArrayAdapter;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.b2;
import android.ext.c;
import android.ext.f;
import android.ext.j2;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

public class u2
implements DialogInterface.OnClickListener {
    final c.a[] a;
    private final String b;
    private final DialogInterface.OnClickListener c;

    public u2(e e4, SparseIntArray aArray, String string2, String string3, DialogInterface.OnClickListener onClickListener) {
        aArray = android.ext.c.x(e4, (SparseIntArray)aArray);
        this.a = aArray;
        this.b = string2;
        this.c = onClickListener;
        if (e4.size() == 1) {
            this.onClick(null, 0);
        } else {
            f.o(f.c(Tools.k0()).setCustomTitle(Tools.h0(string3)).setAdapter((ListAdapter)new ArrayAdapter(this, MainService.context, aArray){
                final u2 b;
                {
                    this.b = u22;
                    super(context, aArray);
                }

                @Override
                public View getView(int n3, View view, ViewGroup viewGroup) {
                    if ((viewGroup = (TextView)(view = super.getView(n3, view, viewGroup)).findViewById(16908308)) != null) {
                        Object object;
                        Tools.D1((TextView)viewGroup, 2131361799);
                        if (n3 >= 0 && n3 < ((c.a[])(object = this.b.a)).length && (object = object[n3]) != null) {
                            viewGroup.setTextColor(android.ext.c.n(object.a));
                        }
                    }
                    return view;
                }
            }, (DialogInterface.OnClickListener)this).setNegativeButton((CharSequence)b2.f(2131296311), null));
        }
    }

    public u2(e e4, String string2, String string3, DialogInterface.OnClickListener onClickListener) {
        this(e4, null, string2, string3, onClickListener);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onClick(DialogInterface dialogInterface, int n3) {
        NumberFormatException numberFormatException2;
        block4: {
            block3: {
                try {
                    n3 = this.a[n3].a;
                    if ("0".equals(this.b)) break block3;
                    android.ext.c.e(0L, this.b, n3);
                }
                catch (NumberFormatException numberFormatException2) {
                    break block4;
                }
            }
            if (dialogInterface != null) {
                Tools.D(dialogInterface);
            }
            this.c.onClick(dialogInterface, n3);
            return;
        }
        j2.i(numberFormatException2, null);
    }
}

