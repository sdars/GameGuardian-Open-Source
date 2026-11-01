/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemLongClickListener
 *  android.widget.BaseAdapter
 *  android.widget.ListView
 */
package android.ext;

import android.ext.Tools;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

public abstract class BaseAdapterLC
extends BaseAdapter
implements View.OnLongClickListener {
    public boolean onLongClick(View view) {
        if (view == null) {
            return false;
        }
        ListView listView = Tools.w0(view);
        if (listView != null) {
            int n3 = listView.getPositionForView(view);
            if (n3 == -1) {
                return false;
            }
            AdapterView.OnItemLongClickListener onItemLongClickListener = listView.getOnItemLongClickListener();
            if (onItemLongClickListener != null) {
                onItemLongClickListener.onItemLongClick((AdapterView)listView, view, n3, this.getItemId(n3));
            }
            return true;
        }
        return false;
    }
}

