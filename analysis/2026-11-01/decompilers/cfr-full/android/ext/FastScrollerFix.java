/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.e1;
import android.ext.n2;
import android.widget.AbsListView;
import android.widget.ListView;

public class FastScrollerFix
implements AbsListView.OnScrollListener,
Runnable {
    private ListView a;
    private int b = 0;

    public FastScrollerFix(ListView listView) {
        this.a = listView;
        FastScrollerFix.b(listView, false);
        try {
            listView.setOnScrollListener((AbsListView.OnScrollListener)this);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public static void a(ListView listView, boolean bl) {
        if (listView == null) {
            return;
        }
        listView.setScrollBarStyle(0x1000000);
        FastScrollerFix.b(listView, bl);
    }

    private static void b(ListView listView, boolean bl) {
        if (listView == null) {
            return;
        }
        try {
            listView.setFastScrollEnabled(bl);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
        try {
            listView.setFastScrollAlwaysVisible(bl);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void onScroll(AbsListView absListView, int n3, int n4, int n5) {
        if (this.b != 0) {
            return;
        }
        absListView = n2.d();
        absListView.removeCallbacks((Runnable)this);
        absListView.postDelayed((Runnable)this, 1000L);
    }

    public void onScrollStateChanged(AbsListView absListView, int n3) {
        this.b = n3;
        absListView = n2.d();
        absListView.removeCallbacks((Runnable)this);
        if (n3 != 0) {
            FastScrollerFix.b(this.a, true);
        } else {
            absListView.postDelayed((Runnable)this, 1000L);
        }
    }

    @Override
    public void run() {
        FastScrollerFix.b(this.a, false);
    }
}

