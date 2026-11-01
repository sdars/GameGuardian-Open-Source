package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
class d3 extends android.ext.b3 {
    final android.widget.TextView n;
    final android.widget.LinearLayout o;
    final android.widget.TextView p;
    final android.widget.ImageView q;

    interface a extends android.ext.b3.a, android.view.View.OnClickListener {
    }

    d3(android.view.View r2, android.ext.d3.a r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 2131034121(0x7f050009, float:1.767875E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.n = r0
            r0 = 2131034117(0x7f050005, float:1.7678742E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.o = r0
            r0 = 2131034120(0x7f050008, float:1.7678749E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.p = r0
            r0 = 2131034119(0x7f050007, float:1.7678747E38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.widget.ImageView r2 = android.ext.Config.m(r2)
            r1.q = r2
            r2.setOnClickListener(r3)
            r2.setOnLongClickListener(r3)
            return
    }
}
