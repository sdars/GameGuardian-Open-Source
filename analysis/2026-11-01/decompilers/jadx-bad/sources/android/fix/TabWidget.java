package android.fix;

import android.content.Context;
import android.ext.e1;
import android.ext.n0;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class TabWidget extends android.widget.TabWidget {
    public TabWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TabWidget
    public void focusCurrentTab(int i) {
        try {
            super.focusCurrentTab(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            e1.a(th);
            n0.h(Thread.currentThread(), th, false);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        try {
            return super.performClick();
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.View
    public void playSoundEffect(int i) {
        try {
            super.playSoundEffect(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        try {
            super.sendAccessibilityEvent(i);
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
