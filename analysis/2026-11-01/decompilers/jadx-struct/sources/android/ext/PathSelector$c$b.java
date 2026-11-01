package android.ext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class PathSelector$c$b extends ArrayAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PathSelector$c f334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PathSelector$c$b(PathSelector$c pathSelector$c, Context context, List list) {
        super(context, list);
        this.f334b = pathSelector$c;
    }

    @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f334b.b(i, view, viewGroup);
    }
}
