package android.fix;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ToolbarButton extends android.fix.ImageButtonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1451b;

    public ToolbarButton(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f1450a = r1
            r0.f1451b = r1
            return
    }

    public ToolbarButton(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f1450a = r1
            r0.f1451b = r1
            return
    }

    public void setIcon(int r1) {
            r0 = this;
            r0.f1450a = r1
            r1 = 1110704128(0x42340000, float:45.0)
            float r1 = android.ext.Tools.G(r1)
            int r1 = (int) r1
            r0.setMinimumWidth(r1)
            int r1 = android.ext.Tools.H()
            r0.setMinimumHeight(r1)
            return
    }

    public void setIcon(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1451b
            if (r0 == r2) goto L25
            r1.f1451b = r2
            if (r2 == 0) goto L21
            int r2 = r1.f1450a     // Catch: java.lang.Throwable -> L1c
            r1.setImageResource(r2)     // Catch: java.lang.Throwable -> L1c
            r2 = 1110704128(0x42340000, float:45.0)
            float r2 = android.ext.Tools.G(r2)     // Catch: java.lang.Throwable -> L1c
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L1c
            int r0 = android.ext.Tools.H()     // Catch: java.lang.Throwable -> L1c
            android.ext.Config.o(r1, r2, r0)     // Catch: java.lang.Throwable -> L1c
            goto L25
        L1c:
            r2 = move-exception
            android.ext.e1.a(r2)
            goto L25
        L21:
            r2 = 0
            r1.setImageDrawable(r2)     // Catch: java.lang.Throwable -> L1c
        L25:
            return
    }

    @Override // android.view.View
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r1 = r2.f1450a
            r0.append(r1)
            java.lang.String r1 = "; "
            r0.append(r1)
            boolean r1 = r2.f1451b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
