package a;

import android.content.Context;
import android.ext.e1;
import android.ext.n0;
import android.graphics.Canvas;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends KeyboardView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f14a = true;

    public c(Context context, AttributeSet attributeSet) {
        super(f14a ? new c$a(context) : context, attributeSet);
    }

    @Override // android.inputmethodservice.KeyboardView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IllegalArgumentException | OutOfMemoryError e2) {
            e1.a(e2);
        }
    }

    @Override // android.inputmethodservice.KeyboardView, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            e1.a(th);
            n0.h(Thread.currentThread(), th, false);
        }
    }
}
