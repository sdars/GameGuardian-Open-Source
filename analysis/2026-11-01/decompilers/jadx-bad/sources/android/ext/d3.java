package android.ext;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
class d3 extends b3 {
    final TextView n;
    final LinearLayout o;
    final TextView p;
    final ImageView q;

    interface a extends b3.a, View.OnClickListener {
    }

    d3(View view, a aVar) {
        super(view, aVar);
        this.n = (TextView) view.findViewById(2131034121);
        this.o = (LinearLayout) view.findViewById(2131034117);
        this.p = (TextView) view.findViewById(2131034120);
        ImageView imageViewM = Config.m((ImageView) view.findViewById(2131034119));
        this.q = imageViewM;
        imageViewM.setOnClickListener(aVar);
        imageViewM.setOnLongClickListener(aVar);
    }
}
