/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.Context;
import android.ext.MainService;
import android.ext.e1;
import android.fix.FrameLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class HotFrame
extends FrameLayout
implements View.OnLongClickListener {
    private final Runnable a;

    public HotFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setHapticFeedbackEnabled(false);
        this.setOnLongClickListener(this);
        this.a = new Runnable(this){
            final HotFrame a;
            {
                this.a = hotFrame;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                StringBuilder stringBuilder;
                boolean bl;
                block5: {
                    block4: {
                        try {
                            this.a.setHapticFeedbackEnabled(true);
                            bl = this.a.performHapticFeedback(0, 1);
                        }
                        catch (Throwable throwable) {
                            bl = false;
                            break block4;
                        }
                        try {
                            this.a.setHapticFeedbackEnabled(false);
                            break block5;
                        }
                        catch (Throwable throwable) {}
                    }
                    e1.g("Failed make HapticFeedback", (Throwable)((Object)stringBuilder));
                    this.a.setHapticFeedbackEnabled(false);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Real long click: ");
                stringBuilder.append(bl);
                e1.d(stringBuilder.toString());
                MainService.instance.onLongClick(null);
            }
        };
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        block5: {
            int n3 = motionEvent.getAction();
            if (n3 != 0 && n3 != 1 && n3 != 3) break block5;
            try {
                this.removeCallbacks(this.a);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                e1.a(noSuchMethodError);
            }
        }
        try {
            boolean bl = super.dispatchTouchEvent(motionEvent);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    public boolean onLongClick(View object) {
        int n3;
        int n4 = n3 = ViewConfiguration.getLongPressTimeout();
        if (n3 < 0) {
            n4 = 0;
        }
        n4 = 750 - n4;
        object = new StringBuilder();
        ((StringBuilder)object).append("Fake long click: ");
        ((StringBuilder)object).append(n4);
        e1.d(((StringBuilder)object).toString());
        if (n4 > 0) {
            this.removeCallbacks(this.a);
            this.postDelayed(this.a, n4);
        } else {
            this.a.run();
        }
        return true;
    }
}

