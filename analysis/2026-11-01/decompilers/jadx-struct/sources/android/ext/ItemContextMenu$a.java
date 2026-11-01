package android.ext;

import android.R$id;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$style;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ItemContextMenu$a extends ArrayAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ItemContextMenu f203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ItemContextMenu$a(ItemContextMenu itemContextMenu, Context context, List list, List list2) {
        super(context, list);
        this.f203c = itemContextMenu;
        this.f202b = list2;
    }

    @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        Drawable drawableO0 = Tools.o0(((Integer) this.f202b.get(i)).intValue());
        TextView textView = (TextView) view2.findViewById(R$id.text1);
        if (textView != null) {
            Tools.D1(textView, R$style.ListItemText);
            Tools.c(textView, drawableO0, Config.d());
        }
        return view2;
    }
}
