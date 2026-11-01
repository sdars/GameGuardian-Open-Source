package android.ext;

import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$m0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ MainService f274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainService$m0(MainService mainService) {
        super(R$string.invert_selection, R$drawable.ic_select_inverse_white_24dp);
        this.f274f = mainService;
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        this.f274f.j(2);
    }
}
