package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$p0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ MainService f280g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainService$p0(MainService mainService, boolean z) {
        super(R$string.remove, R$drawable.ic_delete_white_24dp);
        this.f280g = mainService;
        this.f279f = z;
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        Object objZ = this.f280g.z();
        int iL0 = Tools.L0(objZ);
        String str = " (" + iL0 + ')';
        f.o(f.b().setItems(new String[]{b2.f(R$string.remove_all2), "---", b2.f(R$string.revert_and_remove) + str, b2.f(R$string.remove) + str}, new MainService$p0$a(this, iL0, objZ)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null));
    }
}
