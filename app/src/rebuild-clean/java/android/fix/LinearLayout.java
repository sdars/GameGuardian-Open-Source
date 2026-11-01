package android.fix;

import gga.b;
import android.content.Context;
import android.content.res.Configuration;
import android.ext.e1;
import android.ext.n0;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayout extends android.widget.LinearLayout {
    public LinearLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        e1.d("LinearLayout onConfigurationChanged: " + (configuration == null ? null : configuration.toString()));
        super.onConfigurationChanged(b.f(configuration));
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

    public LinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
