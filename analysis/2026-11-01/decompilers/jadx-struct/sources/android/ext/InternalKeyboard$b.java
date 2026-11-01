package android.ext;

import android.inputmethodservice.Keyboard;

/* JADX INFO: loaded from: classes.dex */
class InternalKeyboard$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Keyboard f191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InternalKeyboard f192b;

    InternalKeyboard$b(InternalKeyboard internalKeyboard, Keyboard keyboard) {
        this.f192b = internalKeyboard;
        this.f191a = keyboard;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f192b.setKeyboard(this.f191a);
    }
}
