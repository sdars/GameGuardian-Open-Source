package android.ext;

import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f220a;

    MainService$b(MainService mainService) {
        this.f220a = mainService;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainService mainService = this.f220a;
        mainService.f213c = mainService.C("script-interrupt", 0, 0, R$string.interrupt, R$drawable.ic_stop_white_24dp);
        MainService mainService2 = this.f220a;
        mainService2.f214d = null;
        mainService2.h0.o();
    }
}
