package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class HotFrame extends android.fix.FrameLayout implements android.view.View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Runnable f156a;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.HotFrame f157a;

        a(android.ext.HotFrame r1) {
                r0 = this;
                r0.f157a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r0 = 0
                android.ext.HotFrame r1 = r4.f157a     // Catch: java.lang.Throwable -> L15
                r2 = 1
                r1.setHapticFeedbackEnabled(r2)     // Catch: java.lang.Throwable -> L15
                android.ext.HotFrame r1 = r4.f157a     // Catch: java.lang.Throwable -> L15
                boolean r1 = r1.performHapticFeedback(r0, r2)     // Catch: java.lang.Throwable -> L15
                android.ext.HotFrame r2 = r4.f157a     // Catch: java.lang.Throwable -> L13
                r2.setHapticFeedbackEnabled(r0)     // Catch: java.lang.Throwable -> L13
                goto L21
            L13:
                r2 = move-exception
                goto L17
            L15:
                r2 = move-exception
                r1 = 0
            L17:
                java.lang.String r3 = "Failed make HapticFeedback"
                android.ext.e1.g(r3, r2)
                android.ext.HotFrame r2 = r4.f157a
                r2.setHapticFeedbackEnabled(r0)
            L21:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Real long click: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                android.ext.MainService r0 = android.ext.MainService.instance
                r1 = 0
                r0.onLongClick(r1)
                return
        }
    }

    public HotFrame(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.setHapticFeedbackEnabled(r1)
            r0.setOnLongClickListener(r0)
            android.ext.HotFrame$a r1 = new android.ext.HotFrame$a
            r1.<init>(r0)
            r0.f156a = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()     // Catch: java.lang.NoSuchMethodError -> L13
            if (r0 == 0) goto Ld
            r1 = 1
            if (r0 == r1) goto Ld
            r1 = 3
            if (r0 == r1) goto Ld
            goto L17
        Ld:
            java.lang.Runnable r0 = r2.f156a     // Catch: java.lang.NoSuchMethodError -> L13
            r2.removeCallbacks(r0)     // Catch: java.lang.NoSuchMethodError -> L13
            goto L17
        L13:
            r0 = move-exception
            android.ext.e1.a(r0)
        L17:
            boolean r3 = super.dispatchTouchEvent(r3)     // Catch: java.lang.Throwable -> L1c
            return r3
        L1c:
            r3 = move-exception
            android.ext.e1.a(r3)
            r3 = 0
            return r3
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r4) {
            r3 = this;
            int r4 = android.view.ViewConfiguration.getLongPressTimeout()
            if (r4 >= 0) goto L7
            r4 = 0
        L7:
            int r4 = 750 - r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fake long click: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            if (r4 <= 0) goto L2b
            java.lang.Runnable r0 = r3.f156a
            r3.removeCallbacks(r0)
            java.lang.Runnable r0 = r3.f156a
            long r1 = (long) r4
            r3.postDelayed(r0, r1)
            goto L30
        L2b:
            java.lang.Runnable r4 = r3.f156a
            r4.run()
        L30:
            r4 = 1
            return r4
    }
}
