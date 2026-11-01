package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.widget.CheckBox f661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final android.widget.TextView f662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final android.widget.TextView f663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final android.widget.TextView f664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final android.widget.TextView f665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final android.widget.TextView f666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final android.widget.TextView f667g;
    final android.widget.TextView h;
    final android.widget.TextView i;
    final android.widget.TextView j;
    final android.view.View k;
    final int l;
    int m;

    interface a extends android.widget.CompoundButton.OnCheckedChangeListener, android.view.View.OnLongClickListener {
    }

    b3(android.view.View r3, android.ext.b3.a r4) {
            r2 = this;
            r2.<init>()
            r0 = 2131034146(0x7f050022, float:1.7678801E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r2.f661a = r0
            r1 = 2131034123(0x7f05000b, float:1.7678755E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.f662b = r1
            r1 = 2131034446(0x7f05014e, float:1.767941E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.f663c = r1
            r1 = 2131034449(0x7f050151, float:1.7679416E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.f664d = r1
            r1 = 2131034451(0x7f050153, float:1.767942E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.f665e = r1
            r1 = 2131034447(0x7f05014f, float:1.7679412E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.f666f = r1
            r1 = 2131034439(0x7f050147, float:1.7679396E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.f667g = r1
            r1 = 2131034452(0x7f050154, float:1.7679422E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.h = r1
            r1 = 2131034440(0x7f050148, float:1.7679398E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.i = r1
            r1 = 2131034118(0x7f050006, float:1.7678745E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.j = r1
            r2.k = r3
            android.content.Context r1 = android.ext.MainService.context
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r2.l = r1
            r3.setTag(r2)
            r0.setOnCheckedChangeListener(r4)
            r0.setOnLongClickListener(r4)
            r0.setTag(r2)
            return
    }

    void a(boolean r2, int r3) {
            r1 = this;
            android.view.View r0 = r1.k
            if (r2 == 0) goto L8
            r2 = -2139864428(0xffffffff80744294, float:-1.0676801E-38)
            goto L11
        L8:
            int r2 = r1.m
            if (r2 != r3) goto L10
            r2 = -2137746366(0xffffffff80949442, float:-1.3644838E-38)
            goto L11
        L10:
            r2 = 0
        L11:
            r0.setBackgroundColor(r2)
            return
    }

    boolean b() {
            r2 = this;
            int r0 = r2.l
            android.content.Context r1 = android.ext.MainService.context
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r0 == r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }
}
