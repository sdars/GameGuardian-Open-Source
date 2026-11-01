package android.ext;

import android.R$id;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$style;

/* JADX INFO: loaded from: classes.dex */
class u2$a extends ArrayAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ u2 f1276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u2$a(u2 u2Var, Context context, c$a[] c_aArr) {
        super(context, c_aArr);
        this.f1276b = u2Var;
    }

    @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c$a c_a;
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2.findViewById(R$id.text1);
        if (textView != null) {
            Tools.D1(textView, R$style.SmallText);
            if (i >= 0) {
                c$a[] c_aArr = this.f1276b.f1273a;
                if (i < c_aArr.length && (c_a = c_aArr[i]) != null) {
                    textView.setTextColor(c.n(c_a.f675a));
                }
            }
        }
        return view2;
    }
}
