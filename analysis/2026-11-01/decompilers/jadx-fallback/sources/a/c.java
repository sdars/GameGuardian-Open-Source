package a;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class c extends android.inputmethodservice.KeyboardView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f14a = true;

    public static class a extends android.content.ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.content.Context f15a;

        public a(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                r0.f15a = r1
                return
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.Object getSystemService(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "audio"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto La
                r2 = 0
                goto L10
            La:
                android.content.Context r0 = r1.f15a
                java.lang.Object r2 = r0.getSystemService(r2)
            L10:
                return r2
        }
    }

    static {
            return
    }

    public c(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            boolean r0 = a.c.f14a
            if (r0 == 0) goto La
            a.c$a r0 = new a.c$a
            r0.<init>(r2)
            r2 = r0
        La:
            r1.<init>(r2, r3)
            return
    }

    @Override // android.inputmethodservice.KeyboardView, android.view.View
    public void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)     // Catch: java.lang.IllegalArgumentException -> L4 java.lang.OutOfMemoryError -> L9
            goto Lb
        L4:
            r1 = move-exception
        L5:
            android.ext.e1.a(r1)
            goto Lb
        L9:
            r1 = move-exception
            goto L5
        Lb:
            return
    }

    @Override // android.inputmethodservice.KeyboardView, android.view.View
    public void onMeasure(int r2, int r3) {
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
}
