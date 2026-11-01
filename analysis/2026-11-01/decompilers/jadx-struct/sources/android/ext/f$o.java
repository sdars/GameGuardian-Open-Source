package android.ext;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

/* JADX INFO: loaded from: classes.dex */
class f$o implements AdapterView$OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdapterView$OnItemClickListener f787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f$n f788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f789c;

    private f$o(AdapterView$OnItemClickListener adapterView$OnItemClickListener, f$n f_n, Runnable runnable) {
        this.f787a = adapterView$OnItemClickListener;
        this.f788b = f_n;
        this.f789c = runnable;
    }

    /* synthetic */ f$o(AdapterView$OnItemClickListener adapterView$OnItemClickListener, f$n f_n, Runnable runnable, f$a f_a) {
        this(adapterView$OnItemClickListener, f_n, runnable);
    }

    @Override // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean zB = this.f788b.b();
        AdapterView$OnItemClickListener adapterView$OnItemClickListener = this.f787a;
        if (adapterView$OnItemClickListener != null) {
            try {
                adapterView$OnItemClickListener.onItemClick(adapterView, view, i, j);
            } catch (Throwable th) {
                e1.a(th);
            }
        }
        if (!zB || this.f789c == null) {
            return;
        }
        n2.d().post(this.f789c);
    }
}
