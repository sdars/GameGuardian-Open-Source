package android.ext;

import android.view.View;
import android.view.View$OnFocusChangeListener;
import catch_.me_.if_.you_.can_.R$id;

/* JADX INFO: loaded from: classes.dex */
public abstract class InternalKeyboard$e implements View$OnFocusChangeListener {
    protected abstract boolean a(View view, boolean z);

    @Override // android.view.View$OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        InternalKeyboard internalKeyboard;
        if ((Config.B & 1) == 0 || (internalKeyboard = (InternalKeyboard) view.getRootView().findViewById(R$id.keyboard)) == null) {
            return;
        }
        boolean zA = a(view, z);
        if (!zA) {
            z = false;
        }
        internalKeyboard.h(view, z);
        if (zA) {
            return;
        }
        Tools.S0(view);
    }
}
