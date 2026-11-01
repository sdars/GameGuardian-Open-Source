package android.ext;

import android.util.SparseBooleanArray;
import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final SparseBooleanArray f1186f = new SparseBooleanArray();

    public q0(MainService mainService) {
        super(R$string.filter, R$drawable.ic_filter_white_24dp);
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        new q0$b(this, null).onClick(view);
    }
}
