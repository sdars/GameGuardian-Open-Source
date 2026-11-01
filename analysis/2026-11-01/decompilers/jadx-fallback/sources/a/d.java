package a;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d extends android.view.LayoutInflater {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f16c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f17a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.view.LayoutInflater f18b;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.add(r2)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            r2 = 16974120(0x1030128, float:2.406173E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            r2 = 16974372(0x1030224, float:2.4062436E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            r2 = 16973931(0x103006b, float:2.40612E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            r2 = 16973829(0x1030005, float:2.4060914E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            r2 = 16973832(0x1030008, float:2.4060922E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.lang.Class<android.R> r2 = android.R.class
            java.lang.reflect.Field[] r2 = r2.getFields()
            int r3 = r2.length
            r4 = 0
        L4f:
            if (r4 >= r3) goto L8a
            r5 = r2[r4]
            int r6 = r5.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r6)
            if (r7 == 0) goto L87
            boolean r6 = java.lang.reflect.Modifier.isFinal(r6)
            if (r6 == 0) goto L87
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "Theme"
            boolean r6 = r6.startsWith(r7)
            if (r6 == 0) goto L87
            java.lang.Class r6 = r5.getType()
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L87
            r6 = 0
            int r5 = r5.getInt(r6)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L87
            r0.add(r5)     // Catch: java.lang.Throwable -> L87
        L87:
            int r4 = r4 + 1
            goto L4f
        L8a:
            int r2 = r0.size()
            int[] r2 = new int[r2]
            a.d.f16c = r2
            int r2 = r0.size()
        L96:
            if (r1 >= r2) goto La9
            int[] r3 = a.d.f16c
            java.lang.Object r4 = r0.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3[r1] = r4
            int r1 = r1 + 1
            goto L96
        La9:
            return
    }

    public d(android.view.LayoutInflater r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r2, r0)
            r1.f18b = r2
            android.content.Context r2 = r2.getContext()
            r1.f17a = r2
            return
    }

    private void a(int r2) {
            r1 = this;
            if (r2 == 0) goto L1a
            android.view.LayoutInflater r0 = r1.f18b
            android.content.Context r0 = r0.getContext()
            int r0 = r1.d(r0)
            if (r0 == r2) goto L1a
            android.view.LayoutInflater r0 = r1.f18b
            android.content.Context r2 = r1.b(r2)
            android.view.LayoutInflater r2 = r0.cloneInContext(r2)
            r1.f18b = r2
        L1a:
            return
    }

    private android.content.Context b(int r3) {
            r2 = this;
            r0 = 1
            if (r3 != r0) goto L6
            android.content.Context r3 = r2.f17a
            goto Le
        L6:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.f17a
            r0.<init>(r1, r3)
            r3 = r0
        Le:
            return r3
    }

    public static a.d c() {
            android.content.Context r0 = android.ext.Tools.f0()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            java.lang.Object r0 = a.f.a(r0)
            a.d r0 = (a.d) r0
            return r0
    }

    private int d(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.f17a
            if (r5 != r0) goto L6
            r5 = 1
            goto L2d
        L6:
            boolean r0 = r5 instanceof android.view.ContextThemeWrapper
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.Class<android.view.ContextThemeWrapper> r0 = android.view.ContextThemeWrapper.class
            java.lang.String r2 = "getThemeResId"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r0.invoke(r5, r2)     // Catch: java.lang.Throwable -> L26
            boolean r0 = r5 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L2c
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L26
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r5 = move-exception
            java.lang.String r0 = "getThemeResId failed call"
            android.ext.e1.l(r0, r5)
        L2c:
            r5 = 0
        L2d:
            return r5
    }

    private android.view.View e(int r2, org.xmlpull.v1.XmlPullParser r3, android.view.ViewGroup r4, boolean r5) {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f18b
            if (r0 != 0) goto L10
            if (r3 != 0) goto Lb
            android.view.View r2 = super.inflate(r2, r4, r5)
            goto Lf
        Lb:
            android.view.View r2 = super.inflate(r3, r4, r5)
        Lf:
            return r2
        L10:
            android.view.View r2 = r1.h(r2, r3, r4, r5)     // Catch: android.view.InflateException -> L15
            return r2
        L15:
            r2 = move-exception
            java.lang.String r3 = "tab_indicator_holo"
            boolean r3 = r1.i(r2, r3)
            if (r3 != 0) goto L28
            java.lang.String r3 = "tab_selected_holo"
            boolean r3 = r1.i(r2, r3)
            if (r3 == 0) goto L27
            goto L28
        L27:
            throw r2
        L28:
            java.lang.String r3 = "Try fix"
            android.ext.e1.l(r3, r2)
            r2 = 2131099687(0x7f060027, float:1.7811734E38)
            r3 = 0
            android.view.View r2 = r1.h(r2, r3, r4, r5)
            return r2
    }

    public static android.view.View f(int r1, android.view.ViewGroup r2) {
            a.d r0 = c()
            android.view.View r1 = r0.inflate(r1, r2)
            return r1
    }

    public static android.view.View g(int r1, android.view.ViewGroup r2, boolean r3) {
            a.d r0 = c()
            android.view.View r1 = r0.inflate(r1, r2, r3)
            return r1
    }

    private android.view.View h(int r10, org.xmlpull.v1.XmlPullParser r11, android.view.ViewGroup r12, boolean r13) {
            r9 = this;
            int[] r0 = a.d.f16c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L95
            r4 = r0[r3]
            android.view.LayoutInflater r5 = r9.f18b
            r9.a(r4)     // Catch: java.lang.Exception -> L17
            if (r11 != 0) goto L19
            android.view.LayoutInflater r6 = r9.f18b     // Catch: java.lang.Exception -> L17
            android.view.View r10 = r6.inflate(r10, r12, r13)     // Catch: java.lang.Exception -> L17
            goto L1f
        L17:
            r6 = move-exception
            goto L20
        L19:
            android.view.LayoutInflater r6 = r9.f18b     // Catch: java.lang.Exception -> L17
            android.view.View r10 = r6.inflate(r11, r12, r13)     // Catch: java.lang.Exception -> L17
        L1f:
            return r10
        L20:
            if (r2 != 0) goto L2f
            boolean r2 = r6 instanceof java.lang.RuntimeException
            if (r2 == 0) goto L2a
            r2 = r6
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            goto L2f
        L2a:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r6)
        L2f:
            boolean r7 = r6 instanceof android.view.InflateException
            if (r7 != 0) goto L37
            boolean r7 = r6 instanceof java.lang.reflect.InvocationTargetException
            if (r7 == 0) goto L95
        L37:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Exception on inflate with theme: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            android.ext.e1.l(r7, r6)
            boolean r6 = android.ext.Config.vSpaceReal
            if (r6 == 0) goto L8f
            android.content.Context r6 = r9.getContext()
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = android.ext.Config.E
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L8f
            android.view.LayoutInflater r6 = r9.f18b
            android.content.Context r7 = r6.getContext()
            android.content.Context r7 = android.ext.Config.a(r7)
            android.view.LayoutInflater r6 = r6.cloneInContext(r7)
            r9.f18b = r6
            if (r11 != 0) goto L78
            android.view.View r10 = r6.inflate(r10, r12, r13)     // Catch: android.view.InflateException -> L76
            goto L7c
        L76:
            r6 = move-exception
            goto L7d
        L78:
            android.view.View r10 = r6.inflate(r11, r12, r13)     // Catch: android.view.InflateException -> L76
        L7c:
            return r10
        L7d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.ext.e1.l(r4, r6)
        L8f:
            r9.f18b = r5
            int r3 = r3 + 1
            goto L5
        L95:
            throw r2
    }

    private boolean i(java.lang.Throwable r2, java.lang.String r3) {
            r1 = this;
            if (r3 == 0) goto L1c
            if (r2 != 0) goto L5
            goto L1c
        L5:
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L13
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L13
            r2 = 1
            return r2
        L13:
            java.lang.Throwable r2 = r2.getCause()
            boolean r2 = r1.i(r2, r3)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    @Override // android.view.LayoutInflater
    public android.view.LayoutInflater cloneInContext(android.content.Context r3) {
            r2 = this;
            a.d r0 = new a.d
            android.view.LayoutInflater r1 = r2.f18b
            android.view.LayoutInflater r3 = r1.cloneInContext(r3)
            r0.<init>(r3)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f18b
            if (r0 != 0) goto L9
            boolean r2 = super.equals(r2)
            return r2
        L9:
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // android.view.LayoutInflater
    public android.content.Context getContext() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f18b
            if (r0 != 0) goto L9
            android.content.Context r0 = super.getContext()
            return r0
        L9:
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // android.view.LayoutInflater
    public android.view.LayoutInflater.Filter getFilter() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f18b
            if (r0 != 0) goto L9
            android.view.LayoutInflater$Filter r0 = super.getFilter()
            return r0
        L9:
            android.view.LayoutInflater$Filter r0 = r0.getFilter()
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f18b
            if (r0 != 0) goto L9
            int r0 = super.hashCode()
            return r0
        L9:
            int r0 = r0.hashCode()
            return r0
    }

    @Override // android.view.LayoutInflater
    public android.view.View inflate(int r2, android.view.ViewGroup r3) {
            r1 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            android.view.View r2 = r1.inflate(r2, r3, r0)
            return r2
    }

    @Override // android.view.LayoutInflater
    public android.view.View inflate(int r2, android.view.ViewGroup r3, boolean r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.e(r2, r0, r3, r4)
            return r2
    }

    @Override // android.view.LayoutInflater
    public android.view.View inflate(org.xmlpull.v1.XmlPullParser r2, android.view.ViewGroup r3) {
            r1 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            android.view.View r2 = r1.inflate(r2, r3, r0)
            return r2
    }

    @Override // android.view.LayoutInflater
    public android.view.View inflate(org.xmlpull.v1.XmlPullParser r2, android.view.ViewGroup r3, boolean r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.e(r0, r2, r3, r4)
            return r2
    }

    @Override // android.view.LayoutInflater
    public void setFactory(android.view.LayoutInflater.Factory r2) {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f18b
            if (r0 != 0) goto L8
            super.setFactory(r2)
            goto Lb
        L8:
            r0.setFactory(r2)
        Lb:
            return
    }

    @Override // android.view.LayoutInflater
    public void setFactory2(android.view.LayoutInflater.Factory2 r2) {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f18b
            if (r0 != 0) goto L8
            super.setFactory2(r2)
            goto Lb
        L8:
            r0.setFactory2(r2)
        Lb:
            return
    }

    @Override // android.view.LayoutInflater
    public void setFilter(android.view.LayoutInflater.Filter r2) {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f18b
            if (r0 != 0) goto L8
            super.setFilter(r2)
            goto Lb
        L8:
            r0.setFilter(r2)
        Lb:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f18b
            if (r0 != 0) goto L9
            java.lang.String r0 = super.toString()
            return r0
        L9:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
