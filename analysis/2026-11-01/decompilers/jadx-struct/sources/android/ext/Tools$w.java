package android.ext;

import android.view.View;
import android.view.View$OnFocusChangeListener;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class Tools$w implements View$OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f548a;

    private Tools$w() {
        this.f548a = new ArrayList();
    }

    /* synthetic */ Tools$w(Tools$j tools$j) {
        this();
    }

    void a(View$OnFocusChangeListener view$OnFocusChangeListener) {
        if (view$OnFocusChangeListener == null || this.f548a.contains(view$OnFocusChangeListener)) {
            return;
        }
        this.f548a.add(view$OnFocusChangeListener);
    }

    @Override // android.view.View$OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        Iterator it = this.f548a.iterator();
        while (it.hasNext()) {
            ((View$OnFocusChangeListener) it.next()).onFocusChange(view, z);
        }
    }
}
