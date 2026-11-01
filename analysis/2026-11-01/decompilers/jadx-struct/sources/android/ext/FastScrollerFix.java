package android.ext;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class FastScrollerFix implements AbsListView$OnScrollListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ListView f135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f136b = 0;

    public FastScrollerFix(ListView listView) {
        this.f135a = listView;
        b(listView, false);
        try {
            listView.setOnScrollListener(this);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    public static void a(ListView listView, boolean z) {
        if (listView == null) {
            return;
        }
        listView.setScrollBarStyle(16777216);
        b(listView, z);
    }

    private static void b(ListView listView, boolean z) {
        if (listView == null) {
            return;
        }
        try {
            listView.setFastScrollEnabled(z);
        } catch (Throwable th) {
            e1.a(th);
        }
        try {
            listView.setFastScrollAlwaysVisible(z);
        } catch (Throwable th2) {
            e1.a(th2);
        }
    }

    @Override // android.widget.AbsListView$OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.f136b != 0) {
            return;
        }
        Handler handlerD = n2.d();
        handlerD.removeCallbacks(this);
        handlerD.postDelayed(this, 1000L);
    }

    @Override // android.widget.AbsListView$OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.f136b = i;
        Handler handlerD = n2.d();
        handlerD.removeCallbacks(this);
        if (i != 0) {
            b(this.f135a, true);
        } else {
            handlerD.postDelayed(this, 1000L);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        b(this.f135a, false);
    }
}
