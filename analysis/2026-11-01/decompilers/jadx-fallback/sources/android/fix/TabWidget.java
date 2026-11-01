package android.fix;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class TabWidget extends android.widget.TabWidget {
    public TabWidget(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.widget.TabWidget
    public void focusCurrentTab(int r1) {
            r0 = this;
            super.focusCurrentTab(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
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
    public boolean performClick() {
            r1 = this;
            boolean r0 = super.performClick()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            r0 = 0
            return r0
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
