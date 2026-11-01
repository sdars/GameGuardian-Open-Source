package android.ext;

import android.content.Context;
import android.fix.TextView;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

/* JADX INFO: loaded from: classes.dex */
class z$k extends TextView implements View$OnTouchListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f1408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f1410e;

    public z$k(Context context, String str, int i, int i2) {
        super(context);
        this.f1408c = str;
        this.f1409d = i;
        this.f1410e = i2;
        setTextColor(Color.rgb(255, 255, 255));
        setText(str);
        setOnTouchListener(this);
    }

    @Override // android.view.View
    protected boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        e1.g("TestButton: dispatchGenericFocusedEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        e1.g("TestButton: dispatchGenericMotionEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    protected boolean dispatchGenericPointerEvent(MotionEvent motionEvent) {
        e1.g("TestButton: dispatchGenericPointerEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
        return super.dispatchGenericPointerEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        e1.g("TestButton: dispatchKeyEvent for " + this.f1408c + ": " + keyEvent, new RuntimeException());
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e1.g("TestButton: dispatchTouchEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        e1.g("TestButton: dispatchTrackballEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        e1.g("TestButton: onGenericMotionEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View$OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        e1.g("TestButton: onTouch for " + this.f1408c + ": " + motionEvent, new RuntimeException());
        return false;
    }

    @Override // android.fix.TextView, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e1.g("TestButton: onTouchEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
        return super.onTouchEvent(motionEvent);
    }
}
