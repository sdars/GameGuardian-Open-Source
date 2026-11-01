package android.ext;

import catch_.me_.if_.you_.can_.R$drawable;

/* JADX INFO: loaded from: classes.dex */
class MainService$c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService f223b;

    MainService$c(MainService mainService, boolean z) {
        this.f223b = mainService;
        this.f222a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = this.f222a;
        if (z) {
            this.f223b.f215e = false;
        }
        MainService mainService = this.f223b;
        mainService.f214d = z ? mainService.C("script-ui-button", 0, 50, R$drawable.ic_ui_button_24dp, R$drawable.ic_ui_button_24dp) : null;
        this.f223b.h0.o();
    }
}
