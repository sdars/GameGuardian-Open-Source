package android.ext;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
class d3 extends b3 {
    final TextView n;
    final LinearLayout o;
    final TextView p;
    final ImageView q;

    interface a extends b3.a, View.OnClickListener {
    }

    d3(View view, a aVar) {
        super(view, aVar);
        this.n = (TextView) view.findViewById(R.id.addr_item_value);
        this.o = (LinearLayout) view.findViewById(R.id.addr_item_info);
        this.p = (TextView) view.findViewById(R.id.addr_item_type);
        ImageView imageViewM = Config.m((ImageView) view.findViewById(R.id.addr_item_remove));
        this.q = imageViewM;
        imageViewM.setOnClickListener(aVar);
        imageViewM.setOnLongClickListener(aVar);
    }
}
