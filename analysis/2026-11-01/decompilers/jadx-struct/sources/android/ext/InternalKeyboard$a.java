package android.ext;

import android.inputmethodservice.KeyboardView$OnKeyboardActionListener;

/* JADX INFO: loaded from: classes.dex */
class InternalKeyboard$a implements KeyboardView$OnKeyboardActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InternalKeyboard f190a;

    InternalKeyboard$a(InternalKeyboard internalKeyboard) {
        this.f190a = internalKeyboard;
    }

    @Override // android.inputmethodservice.KeyboardView$OnKeyboardActionListener
    public void onKey(int i, int[] iArr) {
        this.f190a.l(i, iArr);
    }

    @Override // android.inputmethodservice.KeyboardView$OnKeyboardActionListener
    public void onPress(int i) {
    }

    @Override // android.inputmethodservice.KeyboardView$OnKeyboardActionListener
    public void onRelease(int i) {
    }

    @Override // android.inputmethodservice.KeyboardView$OnKeyboardActionListener
    public void onText(CharSequence charSequence) {
    }

    @Override // android.inputmethodservice.KeyboardView$OnKeyboardActionListener
    public void swipeDown() {
    }

    @Override // android.inputmethodservice.KeyboardView$OnKeyboardActionListener
    public void swipeLeft() {
    }

    @Override // android.inputmethodservice.KeyboardView$OnKeyboardActionListener
    public void swipeRight() {
    }

    @Override // android.inputmethodservice.KeyboardView$OnKeyboardActionListener
    public void swipeUp() {
    }
}
