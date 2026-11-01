package android.ext;

import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

/* JADX INFO: loaded from: classes.dex */
class ShowApp$c implements View$OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ShowApp f463a;

    ShowApp$c(ShowApp showApp) {
        this.f463a = showApp;
    }

    @Override // android.view.View$OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f463a.h(true);
            return true;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.f463a.h(false);
        return true;
    }
}
