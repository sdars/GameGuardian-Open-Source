package android.ext;

import android.content.Context;
import android.fix.FrameLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class HotFrame extends FrameLayout implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f156a;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zPerformHapticFeedback;
            try {
                HotFrame.this.setHapticFeedbackEnabled(true);
                zPerformHapticFeedback = HotFrame.this.performHapticFeedback(0, 1);
                try {
                    HotFrame.this.setHapticFeedbackEnabled(false);
                } catch (Throwable th) {
                    th = th;
                    e1.g("Failed make HapticFeedback", th);
                    HotFrame.this.setHapticFeedbackEnabled(false);
                }
            } catch (Throwable th2) {
                th = th2;
                zPerformHapticFeedback = false;
            }
            e1.d("Real long click: " + zPerformHapticFeedback);
            MainService.instance.onLongClick(null);
        }
    }

    public HotFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHapticFeedbackEnabled(false);
        setOnLongClickListener(this);
        this.f156a = new a();
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

    @Override // android.view.View.OnLongClickListener
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
