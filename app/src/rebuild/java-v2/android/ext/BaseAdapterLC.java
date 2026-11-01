package android.ext;

import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAdapterLC extends BaseAdapter implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        AdapterView<?> adapterViewW0;
        int positionForView;
        if (view == null || (adapterViewW0 = Tools.w0(view)) == null || (positionForView = adapterViewW0.getPositionForView(view)) == -1) {
            return false;
        }
        AdapterView.OnItemLongClickListener onItemLongClickListener = adapterViewW0.getOnItemLongClickListener();
        if (onItemLongClickListener == null) {
            return true;
        }
        onItemLongClickListener.onItemLongClick(adapterViewW0, view, positionForView, getItemId(positionForView));
        return true;
    }
}
