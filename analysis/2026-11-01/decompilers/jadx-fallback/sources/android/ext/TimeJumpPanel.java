package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class TimeJumpPanel extends android.ext.FloatPanel implements android.view.View.OnClickListener {
    android.widget.Button p;
    android.widget.Button q;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.TimeJumpPanel f480a;

        a(android.ext.TimeJumpPanel r1) {
                r0 = this;
                r0.f480a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.TimeJumpPanel r0 = r3.f480a
                r1 = 2131034427(0x7f05013b, float:1.7679371E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                r0.p = r1
                android.ext.TimeJumpPanel r0 = r3.f480a
                r1 = 2131034426(0x7f05013a, float:1.767937E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                r0.q = r1
                android.ext.TimeJumpPanel r0 = r3.f480a
                android.widget.Button r1 = r0.p
                r1.setOnClickListener(r0)
                android.ext.TimeJumpPanel r0 = r3.f480a
                android.widget.Button r1 = r0.q
                r1.setOnClickListener(r0)
                android.ext.TimeJumpPanel r0 = r3.f480a
                r0.r()
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.HotPoint r0 = r0.j
                android.ext.TimeJumpPanel r1 = r3.f480a
                float r2 = r0.getLayoutAlpha()
                r1.setLayoutAlpha(r2)
                android.ext.TimeJumpPanel r1 = r3.f480a
                int r0 = r0.getSizePx()
                r1.setMinSize(r0)
                return
        }
    }

    public TimeJumpPanel(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static long getLast() {
            int r0 = android.ext.Config.v
            double r0 = (double) r0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            r2 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r0 = r0 * r2
            long r0 = (long) r0
            return r0
    }

    private void q() {
            r1 = this;
            android.ext.TimeJumpPanel$a r0 = new android.ext.TimeJumpPanel$a
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public static void s(boolean r3) {
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.TimeJumpPanel r0 = r0.k
            int r1 = android.ext.Config.B
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r2 = 0
            if (r3 == 0) goto L29
            if (r1 == 0) goto L29
            if (r0 != 0) goto L25
            r3 = 2131099690(0x7f06002a, float:1.781174E38)
            android.view.View r3 = a.d.f(r3, r2)
            r0 = r3
            android.ext.TimeJumpPanel r0 = (android.ext.TimeJumpPanel) r0
            r0.q()
            android.ext.MainService r3 = android.ext.MainService.instance
            r3.k = r0
        L25:
            r0.m()
            goto L34
        L29:
            if (r0 == 0) goto L34
            r0.e()
            if (r1 != 0) goto L34
            android.ext.MainService r3 = android.ext.MainService.instance
            r3.k = r2
        L34:
            return
    }

    @Override // android.ext.FloatPanel
    protected java.lang.String getPrefName() {
            r1 = this;
            java.lang.String r0 = "time-jump"
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r5.getId()
            switch(r0) {
                case 2131034426: goto L77;
                case 2131034427: goto L2c;
                default: goto La;
            }
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown id: "
            r0.append(r1)
            int r5 = r5.getId()
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            android.ext.e1.g(r5, r0)
            return
        L2c:
            long r0 = getLast()
            android.ext.o2.h(r0)
            double r0 = (double) r0
            r2 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r0 = r0 / r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r2 = 2131297011(0x7f0902f3, float:1.8211955E38)
            java.lang.String r2 = android.ext.Tools.N1(r2)
            r5.append(r2)
            java.lang.String r2 = ": "
            r5.append(r2)
            java.lang.String r2 = android.ext.Tools.F(r0)
            r5.append(r2)
            java.lang.String r2 = " ("
            r5.append(r2)
            java.lang.String r0 = java.lang.Double.toString(r0)
            java.lang.String r1 = "\\D?0+$"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceFirst(r1, r2)
            r5.append(r0)
            r0 = 41
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r0 = 0
            android.ext.Tools.K1(r5, r0)
            goto L7f
        L77:
            android.ext.o2 r5 = android.ext.o2.f1159g
            if (r5 == 0) goto L7f
            r0 = 0
            r5.onClick(r0)
        L7f:
            return
    }

    public void r() {
            r6 = this;
            long r0 = getLast()
            android.widget.Button r2 = r6.p
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Lf
            r3 = 8
            goto L10
        Lf:
            r3 = 0
        L10:
            r2.setVisibility(r3)
            android.widget.Button r2 = r6.p
            double r0 = (double) r0
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r0 = r0 / r3
            java.lang.String r0 = android.ext.Tools.F(r0)
            r2.setText(r0)
            return
    }

    public void setMinSize(int r2) {
            r1 = this;
            android.widget.Button r0 = r1.p
            if (r0 != 0) goto L5
            return
        L5:
            r0.setMinWidth(r2)
            android.widget.Button r0 = r1.p
            r0.setMinHeight(r2)
            android.widget.Button r0 = r1.q
            r0.setMinWidth(r2)
            android.widget.Button r0 = r1.q
            r0.setMinHeight(r2)
            return
    }
}
