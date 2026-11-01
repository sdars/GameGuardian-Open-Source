package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$c0 implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainService f226c;

    MainService$c0(MainService mainService, String str, boolean z) {
        this.f226c = mainService;
        this.f224a = str;
        this.f225b = z;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        boolean z = false;
        this.f226c.F0 = false;
        if (i == 0) {
            new p0(1100).onClick(dialogInterface, i);
        } else if (i == 1) {
            e1.d("Restart: " + this.f224a);
            try {
                Intent launchIntentForPackage = Tools.B0().getLaunchIntentForPackage(this.f224a);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.MAIN");
                    launchIntentForPackage.setPackage(this.f224a);
                }
                launchIntentForPackage.setFlags(268435456);
                Tools.f0().startActivity(launchIntentForPackage);
                z = true;
            } catch (Exception e2) {
                e1.l("Failed restart app: " + this.f224a, e2);
            }
            n2.d().postDelayed(new MainService$c0$a(this), z ? 4000L : 0L);
        } else if (i != 2) {
            if (i == 3) {
                ConfigListAdapter.t(R$string.help_games_protection_title);
            }
            this.f226c.h.g();
        } else if (f1.z(null, new MainService$c0$b(this))) {
            f.o(f.b().setCustomTitle(Tools.g0(R$string.restart_game_without_protection)).setMessage(b2.f(R$string.warn_restart_off_prot)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).setPositiveButton(b2.f(R$string.ok), new MainService$c0$c(this)));
        }
        Tools.D(dialogInterface);
    }
}
