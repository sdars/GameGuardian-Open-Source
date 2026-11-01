package android.ext;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* JADX INFO: loaded from: classes.dex */
class TimersEditor$a extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TimersEditor f488a;

    TimersEditor$a(TimersEditor timersEditor) {
        this.f488a = timersEditor;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f488a.f484d + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return i == 0 ? this.f488a.c(view, viewGroup) : this.f488a.d(i, view, viewGroup);
    }
}
