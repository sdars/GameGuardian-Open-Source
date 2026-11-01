package android.ext;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

/* JADX INFO: loaded from: classes.dex */
class f$p implements AdapterView$OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AdapterView$OnItemClickListener f790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AlertDialog f791b;

    private f$p(AlertDialog alertDialog, AdapterView$OnItemClickListener adapterView$OnItemClickListener) {
        this.f790a = adapterView$OnItemClickListener;
        this.f791b = alertDialog;
    }

    /* synthetic */ f$p(AlertDialog alertDialog, AdapterView$OnItemClickListener adapterView$OnItemClickListener, f$a f_a) {
        this(alertDialog, adapterView$OnItemClickListener);
    }

    @Override // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        try {
            this.f790a.onItemClick(adapterView, view, i, j);
        } catch (Throwable th) {
            e1.a(th);
            Tools.D(this.f791b);
        }
    }
}
