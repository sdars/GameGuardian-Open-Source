package android.ext;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;

/* JADX INFO: loaded from: classes.dex */
class SavedListAdapter$b extends d3 {
    final ImageView r;
    final TextView s;

    SavedListAdapter$b(View view, d3$a d3_a) {
        super(view, d3_a);
        ImageView imageViewM = Config.m((ImageView) view.findViewById(R$id.freeze));
        this.r = imageViewM;
        imageViewM.setOnClickListener(d3_a);
        imageViewM.setOnLongClickListener(d3_a);
        this.s = (TextView) view.findViewById(R$id.name);
    }
}
