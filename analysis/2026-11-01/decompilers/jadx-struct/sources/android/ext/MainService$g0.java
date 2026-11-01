package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$g0 implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService f243b;

    MainService$g0(MainService mainService, String str) {
        this.f243b = mainService;
        this.f242a = str;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        f.o(f.b().setMessage(b2.f(R$string.try_reinstall_x86)).setPositiveButton(b2.f(R$string.yes), new MainService$g0$a(this)).setNeutralButton(b2.f(R$string.site), new r$n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh278:0krz0wr0uhsodfh0dup0oleudulhv0zlwk0{;90oleudulhv0{0soruh2")).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null));
    }
}
