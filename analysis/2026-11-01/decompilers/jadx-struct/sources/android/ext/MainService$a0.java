package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$a0 implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f219a;

    MainService$a0(MainService mainService) {
        this.f219a = mainService;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f219a.q(true);
        ConfigListAdapter.t(R$string.help_games_protection_);
    }
}
