package android.ext;

import android.view.View;
import android.view.View$OnLongClickListener;
import android.widget.ImageView;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
public class o1$c extends p1 implements View$OnLongClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o1 f1157f;

    public o1$c(o1 o1Var) {
        super(R$string.forward, R$drawable.ic_history_forward_24dp);
        this.f1157f = o1Var;
    }

    @Override // android.ext.p1
    public ImageView b(boolean z) {
        ImageView imageViewB = super.b(z);
        imageViewB.setOnLongClickListener(this);
        return imageViewB;
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        this.f1157f.e();
    }

    @Override // android.view.View$OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1157f.d();
        return true;
    }
}
