package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class MemoryRange extends android.fix.LinearLayout implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Runnable f308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.widget.Button f310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.view.View f311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.ext.EditText f312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.ext.EditText f313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.view.View f314g;
    private android.ext.EditText h;
    private android.widget.CheckBox i;
    private android.widget.CheckBox j;
    private android.ext.EditText k;

    public MemoryRange(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f308a = r1
            r2 = 0
            r0.f309b = r2
            r0.f310c = r1
            return
    }

    public static long b(int r3, android.ext.EditText r4, java.lang.String r5, android.ext.EditText r6, java.lang.String r7) {
            if (r3 != 0) goto L3
            r6 = r4
        L3:
            android.text.Editable r0 = r6.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = android.ext.j2.h(r0)
            int r1 = r0.length()
            if (r1 != 0) goto L1e
            if (r3 != 0) goto L1c
            goto L1d
        L1c:
            r5 = r7
        L1d:
            r0 = r5
        L1e:
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = android.ext.j2.h(r4)
            java.lang.String r5 = "?"
            boolean r7 = r4.contains(r5)
            if (r7 == 0) goto L46
            if (r3 != 0) goto L3b
            java.lang.String r0 = "0"
            goto L3d
        L3b:
            java.lang.String r0 = "F"
        L3d:
            java.lang.String r0 = r4.replace(r5, r0)
            if (r3 == 0) goto L46
            r6.setText(r0)
        L46:
            r5 = 16
            long r1 = android.ext.t1.r(r0, r5)     // Catch: java.lang.NumberFormatException -> L55
            r5 = 1
            if (r3 != 0) goto L57
            if (r7 == 0) goto L57
            android.ext.y0.b(r4, r5)     // Catch: java.lang.NumberFormatException -> L55
            goto L57
        L55:
            r3 = move-exception
            goto L5b
        L57:
            android.ext.y0.b(r0, r5)     // Catch: java.lang.NumberFormatException -> L55
            return r1
        L5b:
            r6.requestFocus()
            throw r3
    }

    private void d() {
            r6 = this;
            int r0 = r6.f309b
            android.widget.Button r1 = r6.f310c
            r2 = 2
            r3 = 1
            if (r0 != r3) goto Lc
            r4 = 2131296839(0x7f090247, float:1.8211606E38)
            goto L15
        Lc:
            if (r0 != r2) goto L12
            r4 = 2131296790(0x7f090216, float:1.8211507E38)
            goto L15
        L12:
            r4 = 2131296268(0x7f09000c, float:1.8210448E38)
        L15:
            java.lang.String r4 = android.ext.b2.f(r4)
            r1.setText(r4)
            android.view.View r1 = r6.f311d
            r4 = 8
            r5 = 0
            if (r0 != r3) goto L25
            r3 = 0
            goto L27
        L25:
            r3 = 8
        L27:
            r1.setVisibility(r3)
            android.view.View r1 = r6.f314g
            if (r0 != r2) goto L2f
            r4 = 0
        L2f:
            r1.setVisibility(r4)
            return
    }

    public long a(int r8) {
            r7 = this;
            int r0 = r7.f309b
            r1 = 1
            if (r0 != r1) goto L1c
            android.ext.EditText r0 = r7.f312e
            android.ext.EditText r1 = r7.f313f
            java.lang.String r2 = "-1"
            java.lang.String r3 = "0"
            long r0 = b(r8, r0, r3, r1, r2)
            if (r8 != 0) goto L16
            android.ext.Config.f31d = r0
            goto L18
        L16:
            android.ext.Config.f32e = r0
        L18:
            android.ext.Config.k()
            return r0
        L1c:
            r2 = 2
            if (r0 != r2) goto L79
            android.ext.EditText r0 = r7.h
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = android.ext.j2.h(r0)
            r2 = 16
            long r3 = android.ext.t1.r(r0, r2)     // Catch: java.lang.NumberFormatException -> L72
            android.ext.y0.b(r0, r1)     // Catch: java.lang.NumberFormatException -> L72
            if (r8 != 0) goto L3f
            android.widget.CheckBox r0 = r7.i
            goto L41
        L3f:
            android.widget.CheckBox r0 = r7.j
        L41:
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L71
            android.ext.EditText r0 = r7.k
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = android.ext.j2.h(r0)
            long r5 = android.ext.t1.r(r0, r2)     // Catch: java.lang.NumberFormatException -> L6a
            android.ext.y0.b(r0, r1)     // Catch: java.lang.NumberFormatException -> L6a
            android.ext.Config.f33f = r5
            android.ext.Config.k()
            if (r8 != 0) goto L68
            long r5 = -r5
        L68:
            long r3 = r3 + r5
            goto L71
        L6a:
            r8 = move-exception
            android.ext.EditText r0 = r7.k
            r0.requestFocus()
            throw r8
        L71:
            return r3
        L72:
            r8 = move-exception
            android.ext.EditText r0 = r7.h
            r0.requestFocus()
            throw r8
        L79:
            if (r8 != 0) goto L7e
            r0 = 0
            goto L80
        L7e:
            r0 = -1
        L80:
            return r0
    }

    public void c() {
            r5 = this;
            android.widget.Button r0 = r5.f310c
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 2131099661(0x7f06000d, float:1.7811682E38)
            a.d.f(r0, r5)
            r0 = 2131034364(0x7f0500fc, float:1.7679243E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r5.f310c = r0
            r0 = 2131034365(0x7f0500fd, float:1.7679245E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.f311d = r0
            r0 = 2131034320(0x7f0500d0, float:1.7679154E38)
            android.view.View r0 = r5.findViewById(r0)
            android.ext.EditText r0 = (android.ext.EditText) r0
            r5.f312e = r0
            r1 = 1
            r0.setDataType(r1)
            r0 = 2131034377(0x7f050109, float:1.767927E38)
            android.view.View r0 = r5.findViewById(r0)
            android.ext.EditText r2 = r5.f312e
            r0.setTag(r2)
            r0 = 2131034324(0x7f0500d4, float:1.7679162E38)
            android.view.View r0 = r5.findViewById(r0)
            android.ext.EditText r0 = (android.ext.EditText) r0
            r5.f313f = r0
            r0.setDataType(r1)
            r0 = 2131034378(0x7f05010a, float:1.7679272E38)
            android.view.View r0 = r5.findViewById(r0)
            android.ext.EditText r2 = r5.f313f
            r0.setTag(r2)
            android.ext.EditText r0 = r5.f312e
            long r2 = android.ext.Config.f31d
            r4 = 4
            java.lang.String r2 = android.ext.c.G(r2, r4)
            r0.setText(r2)
            android.ext.EditText r0 = r5.f313f
            long r2 = android.ext.Config.f32e
            java.lang.String r2 = android.ext.c.G(r2, r4)
            r0.setText(r2)
            r0 = 2131034340(0x7f0500e4, float:1.7679195E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.f314g = r0
            r0 = 2131034123(0x7f05000b, float:1.7678755E38)
            android.view.View r0 = r5.findViewById(r0)
            android.ext.EditText r0 = (android.ext.EditText) r0
            r5.h = r0
            r0.setDataType(r1)
            r0 = 2131034132(0x7f050014, float:1.7678773E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r5.i = r0
            r0 = 2131034124(0x7f05000c, float:1.7678757E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r5.j = r0
            r0 = 2131034227(0x7f050073, float:1.7678966E38)
            android.view.View r0 = r5.findViewById(r0)
            android.ext.EditText r0 = (android.ext.EditText) r0
            r5.k = r0
            r0.setDataType(r1)
            android.ext.EditText r0 = r5.k
            long r2 = android.ext.Config.f33f
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r3)
            r0.setText(r2)
            android.widget.Button r0 = r5.f310c
            r0.setOnClickListener(r5)
            android.ext.EditText r0 = r5.f312e
            android.ext.InternalKeyboard.o(r0, r1)
            r5.d()
            return
    }

    public int getType() {
            r1 = this;
            int r0 = r1.f309b
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r1) {
            r0 = this;
            int r1 = r0.f309b
            int r1 = r1 + 1
            int r1 = r1 % 3
            r0.setType(r1)
            return
    }

    public void setAddress(java.lang.String r2) {
            r1 = this;
            android.ext.EditText r0 = r1.h
            r0.setText(r2)
            return
    }

    public void setType(int r3) {
            r2 = this;
            int r0 = r2.f309b
            r2.f309b = r3
            r2.d()
            java.lang.Runnable r1 = r2.f308a
            if (r0 == r3) goto L10
            if (r1 == 0) goto L10
            r1.run()
        L10:
            return
    }

    public void setTypeChangeListener(java.lang.Runnable r1) {
            r0 = this;
            r0.f308a = r1
            return
    }
}
