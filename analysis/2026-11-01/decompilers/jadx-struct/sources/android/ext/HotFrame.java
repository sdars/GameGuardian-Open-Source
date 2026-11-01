package android.ext;

import android.content.Context;
import android.fix.FrameLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnLongClickListener;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class HotFrame extends FrameLayout implements View$OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f156a;

    public HotFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHapticFeedbackEnabled(false);
        setOnLongClickListener(this);
        this.f156a = new HotFrame$a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action == 0 || action == 1 || action == 3) {
                removeCallbacks(this.f156a);
            }
        } catch (NoSuchMethodError e2) {
            e1.a(e2);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    @Override // android.view.View$OnLongClickListener
    public boolean onLongClick(View view) {
        int longPressTimeout = ViewConfiguration.getLongPressTimeout();
        if (longPressTimeout < 0) {
            longPressTimeout = 0;
        }
        int i = 750 - longPressTimeout;
        e1.d("Fake long click: " + i);
        if (i <= 0) {
            this.f156a.run();
            return true;
        }
        removeCallbacks(this.f156a);
        postDelayed(this.f156a, i);
        return true;
    }
}
