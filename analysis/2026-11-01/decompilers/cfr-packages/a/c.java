/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.Canvas
 *  android.inputmethodservice.KeyboardView
 *  android.util.AttributeSet
 */
package a;

import android.content.Context;
import android.content.ContextWrapper;
import android.ext.e1;
import android.ext.n0;
import android.graphics.Canvas;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

public abstract class c
extends KeyboardView {
    public static volatile boolean a = true;

    public c(Context context, AttributeSet attributeSet) {
        Object object = context;
        if (a) {
            object = new a(context);
        }
        super(object, attributeSet);
    }

    /*
     * Unable to fully structure code
     */
    public void onDraw(Canvas var1_1) {
        try {
            super.onDraw(var1_1);
        }
        catch (IllegalArgumentException var1_2) lbl-1000:
        // 2 sources

        {
            while (true) {
                e1.a((Throwable)var1_3);
                break;
            }
        }
        catch (OutOfMemoryError var1_4) {
            ** continue;
        }
    }

    public void onMeasure(int n3, int n4) {
        try {
            super.onMeasure(n3, n4);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            n0.h(Thread.currentThread(), throwable, false);
        }
    }

    public static class a
    extends ContextWrapper {
        Context a;

        public a(Context context) {
            super(context);
            this.a = context;
        }

        public Object getSystemService(String object) {
            object = "audio".equals(object) ? null : this.a.getSystemService((String)object);
            return object;
        }
    }
}

