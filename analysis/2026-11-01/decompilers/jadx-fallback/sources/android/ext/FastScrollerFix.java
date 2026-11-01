package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class FastScrollerFix implements android.widget.AbsListView.OnScrollListener, java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.widget.ListView f135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f136b;

    public FastScrollerFix(android.widget.ListView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f136b = r0
            r1.f135a = r2
            b(r2, r0)
            r2.setOnScrollListener(r1)     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r2 = move-exception
            android.ext.e1.a(r2)
        L13:
            return
    }

    public static void a(android.widget.ListView r1, boolean r2) {
            if (r1 != 0) goto L3
            return
        L3:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1.setScrollBarStyle(r0)
            b(r1, r2)
            return
    }

    private static void b(android.widget.ListView r1, boolean r2) {
            if (r1 != 0) goto L3
            return
        L3:
            r1.setFastScrollEnabled(r2)     // Catch: java.lang.Throwable -> L7
            goto Lb
        L7:
            r0 = move-exception
            android.ext.e1.a(r0)
        Lb:
            r1.setFastScrollAlwaysVisible(r2)     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r1 = move-exception
            android.ext.e1.a(r1)
        L13:
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
            r0 = this;
            int r1 = r0.f136b
            if (r1 == 0) goto L5
            return
        L5:
            android.os.Handler r1 = android.ext.n2.d()
            r1.removeCallbacks(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.postDelayed(r0, r2)
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView r3, int r4) {
            r2 = this;
            r2.f136b = r4
            android.os.Handler r3 = android.ext.n2.d()
            r3.removeCallbacks(r2)
            if (r4 == 0) goto L12
            android.widget.ListView r3 = r2.f135a
            r4 = 1
            b(r3, r4)
            goto L17
        L12:
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L17:
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            android.widget.ListView r0 = r2.f135a
            r1 = 0
            b(r0, r1)
            return
    }
}
