package android.fix;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ProgressBar extends android.widget.ProgressBar {
    public ProgressBar(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            monitor-enter(r0)
            super.onDraw(r1)     // Catch: java.lang.Throwable -> L5 java.lang.RuntimeException -> L7
            goto Lb
        L5:
            r1 = move-exception
            goto Ld
        L7:
            r1 = move-exception
            android.ext.e1.a(r1)     // Catch: java.lang.Throwable -> L5
        Lb:
            monitor-exit(r0)
            return
        Ld:
            monitor-exit(r0)
            throw r1
    }

    @Override // android.widget.ProgressBar, android.view.View
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
    protected void onVisibilityChanged(android.view.View r1, int r2) {
            r0 = this;
            super.onVisibilityChanged(r1, r2)     // Catch: java.lang.RuntimeException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
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

    @Override // android.widget.ProgressBar
    public void setInterpolator(android.content.Context r1, int r2) {
            r0 = this;
            super.setInterpolator(r1, r2)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.ProgressBar
    public void setInterpolator(android.view.animation.Interpolator r1) {
            r0 = this;
            super.setInterpolator(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int r1) {
            r0 = this;
            monitor-enter(r0)
            super.setProgress(r1)     // Catch: java.lang.Throwable -> L5 java.lang.NullPointerException -> L7
            goto Lb
        L5:
            r1 = move-exception
            goto Ld
        L7:
            r1 = move-exception
            android.ext.e1.a(r1)     // Catch: java.lang.Throwable -> L5
        Lb:
            monitor-exit(r0)
            return
        Ld:
            monitor-exit(r0)
            throw r1
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }
}
