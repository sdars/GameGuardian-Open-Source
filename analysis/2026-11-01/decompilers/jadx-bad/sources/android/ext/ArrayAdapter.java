package android.ext;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ArrayAdapter<T> extends android.widget.ArrayAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.d f27a;

    public ArrayAdapter(Context context, int i) {
        super(context, i);
        this.f27a = null;
    }

    @Override // android.widget.ArrayAdapter
    public void addAll(Collection collection) {
        super.addAll(collection);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        Object item;
        Drawable drawableC;
        try {
            view = super.getView(i, view, viewGroup);
            item = null;
            textView = null;
        } catch (Throwable th) {
            e1.l("Failed get view for ArrayAdapter", th);
            if (view == null) {
                if (this.f27a == null) {
                    this.f27a = a.d.c();
                }
                view = this.f27a.inflate(2131099670, viewGroup, false);
            }
            TextView textView2 = (TextView) view;
            Object item2 = getItem(i);
            textView2.setText(item2 instanceof CharSequence ? (CharSequence) item2 : item2.toString());
            textView = textView2;
            item = item2;
        }
        if (item == null && (view instanceof TextView)) {
            item = getItem(i);
            textView = (TextView) view;
        }
        if ((item instanceof p1) && textView != null && (drawableC = ((p1) item).c()) != null) {
            Tools.c(textView, drawableC, Config.d());
        }
        return view;
    }

    public ArrayAdapter(Context context, int i, int i2, Object[] objArr) {
        super(context, i, i2, objArr);
        this.f27a = null;
    }

    public ArrayAdapter(Context context, List<T> list) {
        super(context, R.layout.select_dialog_item, R.id.text1, list);
        this.f27a = null;
    }

    public ArrayAdapter(Context context, T[] tArr) {
        super(context, R.layout.select_dialog_item, R.id.text1, tArr);
        this.f27a = null;
    }
}
