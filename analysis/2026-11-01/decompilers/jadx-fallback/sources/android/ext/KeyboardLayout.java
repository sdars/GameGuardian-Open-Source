package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class KeyboardLayout extends android.fix.LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.widget.ScrollView f208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.fix.FrameLayout f209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.ext.InternalKeyboard f210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f211d;

    public KeyboardLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void a() {
            r1 = this;
            android.widget.ScrollView r0 = r1.f208a
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            r1.f211d = r0
            r0 = 2131034302(0x7f0500be, float:1.7679118E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r1.f208a = r0
            r0 = 2131034301(0x7f0500bd, float:1.7679116E38)
            android.view.View r0 = r1.findViewById(r0)
            android.fix.FrameLayout r0 = (android.fix.FrameLayout) r0
            r1.f209b = r0
            r0 = 2131034303(0x7f0500bf, float:1.767912E38)
            android.view.View r0 = r1.findViewById(r0)
            android.ext.InternalKeyboard r0 = (android.ext.InternalKeyboard) r0
            r1.f210c = r0
            return
    }

    private void b(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.width = r3
            r0.height = r4
            r2.setLayoutParams(r0)
            return
    }

    public void c() {
            r4 = this;
            android.content.Context r0 = android.ext.Tools.f0()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            int r2 = r4.f211d
            if (r1 != r2) goto L13
            return
        L13:
            r4.f211d = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Screen: "
            r2.append(r3)
            int r3 = r0.screenWidthDp
            r2.append(r3)
            java.lang.String r3 = "dp x "
            r2.append(r3)
            int r0 = r0.screenHeightDp
            r2.append(r0)
            java.lang.String r0 = "dp"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.ext.e1.d(r0)
            r4.a()
            r0 = -1
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L47
            int[] r0 = new int[]{r3, r0, r2}
            goto L4c
        L47:
            r1 = -2
            int[] r0 = new int[]{r2, r0, r1}
        L4c:
            r1 = r0[r2]
            r4.setOrientation(r1)
            android.widget.ScrollView r1 = r4.f208a
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L5c
            android.widget.ScrollView r1 = r4.f208a
            goto L5e
        L5c:
            android.fix.FrameLayout r1 = r4.f209b
        L5e:
            r2 = r0[r3]
            r3 = 2
            r0 = r0[r3]
            r4.b(r1, r2, r0)
            android.ext.InternalKeyboard r0 = r4.f210c
            r0.t()
            return
    }

    @Override // android.fix.LinearLayout, android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KeyboardLayout onConfigurationChanged: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.content.res.Configuration r3 = a.b.f(r3)
            super.onConfigurationChanged(r3)
            r2.c()
            android.ext.MainService.Y(r3)
            return
    }
}
