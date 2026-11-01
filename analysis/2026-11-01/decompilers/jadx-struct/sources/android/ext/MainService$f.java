package android.ext;

import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f240a;

    MainService$f(MainService mainService) {
        this.f240a = mainService;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainService mainService = this.f240a;
        mainService.f217g = mainService.C("record-interrupt", 0, 0, R$string.record, R$drawable.ic_stop_white_24dp);
        this.f240a.h0.n();
    }
}
