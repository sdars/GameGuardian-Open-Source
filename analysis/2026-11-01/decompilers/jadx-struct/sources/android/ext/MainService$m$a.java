package android.ext;

import android.R$id;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$style;

/* JADX INFO: loaded from: classes.dex */
class MainService$m$a extends ArrayAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService$m f271b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainService$m$a(MainService$m mainService$m, Context context, p1[] p1VarArr) {
        super(context, p1VarArr);
        this.f271b = mainService$m;
    }

    @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2.findViewById(R$id.text1);
        if (textView != null) {
            Tools.D1(textView, R$style.SmallText);
        }
        return view2;
    }
}
