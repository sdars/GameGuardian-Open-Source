package android.ext;

import catch_.me_.if_.you_.can_.R$id;

/* JADX INFO: loaded from: classes.dex */
class Script$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Script$SavedState f365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Script f366b;

    Script$1(Script script, Script$SavedState script$SavedState) {
        this.f366b = script;
        this.f365a = script$SavedState;
    }

    @Override // java.lang.Runnable
    public void run() {
        Config.b(R$id.config_ranges).f42d = this.f365a.f389a;
        Config.k();
    }
}
