package android.ext;

import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$s0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ MainService f299f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainService$s0(MainService mainService) {
        super(R$string.select_all, R$drawable.ic_select_all_white_24dp);
        this.f299f = mainService;
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        this.f299f.j(1);
    }
}
