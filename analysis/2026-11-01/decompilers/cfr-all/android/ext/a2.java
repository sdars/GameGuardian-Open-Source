/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.TextView
 */
package android.ext;

import a.d;
import android.ext.Tools;
import android.ext.e1;
import android.ext.z1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

class a2
extends BaseAdapter {
    private final List a;

    public a2(List list) {
        this.a = list;
    }

    private static TextView b(View object) {
        if (object instanceof TextView) {
            return (TextView)object;
        }
        object = (object = object.findViewById(16908308)) instanceof TextView ? (TextView)object : null;
        return object;
    }

    public z1.d a(int n3) {
        return (z1.d)this.a.get(n3);
    }

    public int getCount() {
        return this.a.size();
    }

    public long getItemId(int n3) {
        return n3;
    }

    public View getView(int n3, View object, ViewGroup viewGroup) {
        Object object2;
        block9: {
            if (object == null) {
                try {
                    object = d.c().inflate(0x1090011, viewGroup, false);
                }
                catch (Throwable throwable) {
                    e1.l("Failed inflate process list item", throwable);
                    object = d.c().inflate(2131099670, viewGroup, false);
                }
                TextView textView = a2.b((View)object);
                object2 = object;
                viewGroup = textView;
                if (textView != null) {
                    Tools.D1(textView, 2131361796);
                    object2 = object;
                    viewGroup = textView;
                }
            } else {
                viewGroup = a2.b((View)object);
                object2 = object;
            }
            if (viewGroup == null) {
                return object2;
            }
            object = (z1.d)this.a.get(n3);
            if (object == null) break block9;
            try {
                viewGroup.setText(((z1.d)object).l());
                viewGroup.setTag(object);
                ((z1.d)object).j((TextView)viewGroup);
            }
            catch (Throwable throwable) {
                e1.a(throwable);
            }
        }
        return object2;
    }
}

