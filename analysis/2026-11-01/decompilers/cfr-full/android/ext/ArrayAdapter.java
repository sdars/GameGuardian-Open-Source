/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.d;
import android.content.Context;
import android.ext.Config;
import android.ext.Tools;
import android.ext.e1;
import android.ext.p1;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;

public class ArrayAdapter<T>
extends android.widget.ArrayAdapter<T> {
    private d a = null;

    public ArrayAdapter(Context context, int n3) {
        super(context, n3);
    }

    public ArrayAdapter(Context context, int n3, int n4, Object[] objectArray) {
        super(context, n3, n4, objectArray);
    }

    public ArrayAdapter(Context context, List<T> list) {
        super(context, 0x1090011, 16908308, list);
    }

    public ArrayAdapter(Context context, T[] TArray) {
        super(context, 0x1090011, 16908308, (Object[])TArray);
    }

    public void addAll(Collection collection) {
        super.addAll(collection);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public View getView(int n3, View object, ViewGroup viewGroup) {
        Drawable drawable2;
        void var2_8;
        Object object2;
        View view;
        TextView textView;
        try {
            view = super.getView(n3, object, (ViewGroup)textView);
            Object var2_3 = null;
            textView = null;
        }
        catch (Throwable throwable) {
            void var2_5;
            e1.l("Failed get view for ArrayAdapter", throwable);
            view = object;
            if (object == null) {
                if (this.a == null) {
                    this.a = d.c();
                }
                view = this.a.inflate(2131099670, (ViewGroup)textView, false);
            }
            textView = (TextView)view;
            object2 = this.getItem(n3);
            if (object2 instanceof CharSequence) {
                CharSequence charSequence = (CharSequence)object2;
            } else {
                String string2 = object2.toString();
            }
            textView.setText((CharSequence)var2_5);
            Object object3 = object2;
        }
        TextView textView2 = textView;
        object2 = var2_8;
        if (var2_8 == null) {
            textView2 = textView;
            object2 = var2_8;
            if (view instanceof TextView) {
                object2 = this.getItem(n3);
                textView2 = (TextView)view;
            }
        }
        if (object2 instanceof p1 && textView2 != null && (drawable2 = ((p1)object2).c()) != null) {
            Tools.c(textView2, drawable2, Config.d());
        }
        return view;
    }
}

