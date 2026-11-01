package android.fix;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LinearLayout extends android.widget.LinearLayout {
    public LinearLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public LinearLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.String r0 = r4.toString()
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LinearLayout onConfigurationChanged: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.ext.e1.d(r0)
            android.content.res.Configuration r4 = a.b.f(r4)
            super.onConfigurationChanged(r4)
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L4
            goto L10
        L4:
            r2 = move-exception
            android.ext.e1.a(r2)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r0 = 0
            android.ext.n0.h(r3, r2, r0)
        L10:
            return
    }

    @Override // android.view.View
    public void playSoundEffect(int r1) {
            r0 = this;
            super.playSoundEffect(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int r1) {
            r0 = this;
            super.sendAccessibilityEvent(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }
}
