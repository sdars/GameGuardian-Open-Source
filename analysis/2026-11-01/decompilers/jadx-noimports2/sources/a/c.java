package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends android.inputmethodservice.KeyboardView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f14a = true;

    public static class a extends android.content.ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.content.Context f15a;

        public a(android.content.Context context) {
            super(context);
            this.f15a = context;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.Object getSystemService(java.lang.String str) {
            if ("audio".equals(str)) {
                return null;
            }
            return this.f15a.getSystemService(str);
        }
    }

    public c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(f14a ? new a.c.a(context) : context, attributeSet);
    }

    @Override // android.inputmethodservice.KeyboardView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.IllegalArgumentException | java.lang.OutOfMemoryError e2) {
            android.ext.e1.a(e2);
        }
    }

    @Override // android.inputmethodservice.KeyboardView, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            android.ext.n0.h(java.lang.Thread.currentThread(), th, false);
        }
    }
}
