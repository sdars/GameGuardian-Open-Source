package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.util.LinkedList f1331a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static int f1332b;

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.y0.b f1333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.EditText f1334b;

        a(android.ext.y0.b r1, android.widget.EditText r2) {
                r0 = this;
                r0.f1333a = r1
                r0.f1334b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r7, int r8) {
                r6 = this;
                android.ext.y0$b r7 = r6.f1333a
                java.lang.Object r7 = r7.getItem(r8)
                java.lang.String r3 = r7.toString()
                android.widget.EditText r7 = r6.f1334b
                int r7 = r7.getSelectionStart()
                r8 = 0
                int r7 = java.lang.Math.max(r7, r8)
                android.widget.EditText r0 = r6.f1334b
                int r0 = r0.getSelectionEnd()
                int r8 = java.lang.Math.max(r0, r8)
                android.widget.EditText r0 = r6.f1334b
                android.text.Editable r0 = r0.getText()
                int r1 = java.lang.Math.min(r7, r8)
                int r2 = java.lang.Math.max(r7, r8)
                r4 = 0
                int r5 = r3.length()
                r0.replace(r1, r2, r3, r4, r5)
                android.widget.EditText r7 = r6.f1334b
                int r8 = r7.getSelectionStart()
                android.widget.EditText r0 = r6.f1334b
                int r0 = r0.getSelectionEnd()
                int r8 = java.lang.Math.max(r8, r0)
                r7.setSelection(r8)
                return
        }
    }

    static class b extends android.widget.BaseAdapter implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.view.View.OnFocusChangeListener {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static boolean f1335e = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.app.AlertDialog f1336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.util.ArrayList f1337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final android.content.Context f1338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1339d;

        class a implements android.text.TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.y0.b.e f1340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.y0.b f1341b;

            a(android.ext.y0.b r1, android.ext.y0.b.e r2) {
                    r0 = this;
                    r0.f1341b = r1
                    r0.f1340a = r2
                    r0.<init>()
                    return
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable r4) {
                    r3 = this;
                    android.ext.y0$b$e r4 = r3.f1340a
                    android.ext.y0$b$d r0 = r4.h
                    if (r0 != 0) goto L7
                    return
                L7:
                    android.ext.y0$b r1 = r3.f1341b
                    android.ext.y0$c r0 = r0.f1347a
                    android.ext.EditText r4 = r4.f1351c
                    android.text.Editable r4 = r4.getText()
                    java.lang.String r4 = r4.toString()
                    r2 = 0
                    r1.c(r0, r4, r2)
                    return
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                    r0 = this;
                    return
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                    r0 = this;
                    return
            }
        }

        /* JADX INFO: renamed from: android.ext.y0$b$b, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0022b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.y0.c f1342a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.EditText f1343b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.ext.y0.b f1344c;

            DialogInterfaceOnClickListenerC0022b(android.ext.y0.b r1, android.ext.y0.c r2, android.ext.EditText r3) {
                    r0 = this;
                    r0.f1344c = r1
                    r0.f1342a = r2
                    r0.f1343b = r3
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r3, int r4) {
                    r2 = this;
                    android.ext.y0$b r3 = r2.f1344c
                    android.ext.y0$c r4 = r2.f1342a
                    android.ext.EditText r0 = r2.f1343b
                    android.text.Editable r0 = r0.getText()
                    java.lang.String r0 = r0.toString()
                    r1 = 1
                    r3.c(r4, r0, r1)
                    return
            }
        }

        class c implements android.content.DialogInterface.OnShowListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.EditText f1345a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.y0.b f1346b;

            c(android.ext.y0.b r1, android.ext.EditText r2) {
                    r0 = this;
                    r0.f1346b = r1
                    r0.f1345a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(android.content.DialogInterface r1) {
                    r0 = this;
                    android.ext.EditText r1 = r0.f1345a
                    android.ext.Tools.o1(r1)
                    android.ext.EditText r1 = r0.f1345a
                    r1.requestFocus()
                    return
            }
        }

        static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            android.ext.y0.c f1347a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f1348b;

            public d(android.ext.y0.c r1, boolean r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f1347a = r1
                    r0.f1348b = r2
                    return
            }

            public java.lang.String toString() {
                    r1 = this;
                    android.ext.y0$c r0 = r1.f1347a
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        static class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public android.widget.TextView f1349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public android.widget.TextView f1350b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public android.ext.EditText f1351c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public android.widget.ImageView f1352d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public android.widget.ImageView f1353e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public android.view.View f1354f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f1355g;
            android.ext.y0.b.d h;

            e() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                return
        }

        public b(android.content.Context r8, int r9) {
                r7 = this;
                r7.<init>()
                r0 = 0
                r7.f1336a = r0
                r0 = 0
                r7.f1339d = r0
                r7.f1338c = r8
                android.ext.y0.d()
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                r7.f1337b = r8
                int r1 = android.ext.y0.f1332b
                java.util.LinkedList r2 = android.ext.y0.f1331a
                java.util.Iterator r2 = r2.iterator()
                r3 = 0
            L1e:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L41
                java.lang.Object r4 = r2.next()
                android.ext.y0$c r4 = (android.ext.y0.c) r4
                if (r4 == 0) goto L3e
                int r5 = r4.f1357b
                r5 = r5 & r9
                if (r5 == 0) goto L3e
                android.ext.y0$b$d r5 = new android.ext.y0$b$d
                if (r3 >= r1) goto L37
                r6 = 1
                goto L38
            L37:
                r6 = 0
            L38:
                r5.<init>(r4, r6)
                r8.add(r5)
            L3e:
                int r3 = r3 + 1
                goto L1e
            L41:
                return
        }

        private void a(android.ext.y0.c r4, android.content.Context r5) {
                r3 = this;
                android.ext.EditText r0 = new android.ext.EditText
                r0.<init>(r5)
                java.lang.String r1 = r4.f1359d
                java.lang.String r1 = r3.b(r1)
                r0.setText(r1)
                android.app.AlertDialog$Builder r5 = android.ext.f.c(r5)
                java.lang.String r1 = r4.f1356a
                android.view.View r1 = android.ext.Tools.h0(r1)
                android.app.AlertDialog$Builder r5 = r5.setCustomTitle(r1)
                android.app.AlertDialog$Builder r5 = r5.setView(r0)
                r1 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.ext.y0$b$b r2 = new android.ext.y0$b$b
                r2.<init>(r3, r4, r0)
                android.app.AlertDialog$Builder r4 = r5.setPositiveButton(r1, r2)
                r5 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r5 = android.ext.b2.f(r5)
                r1 = 0
                android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r5, r1)
                android.app.AlertDialog r4 = r4.create()
                android.ext.y0$b$c r5 = new android.ext.y0$b$c
                r5.<init>(r3, r0)
                android.ext.f.l(r4, r5)
                android.ext.f.n(r4, r0)
                return
        }

        private java.lang.String b(java.lang.String r2) {
                r1 = this;
                java.lang.String r2 = r2.trim()
                java.lang.String r0 = "..."
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Le
                java.lang.String r2 = ""
            Le:
                return r2
        }

        private void d(android.view.View r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.f1339d
                if (r0 != r3) goto L5
                return
            L5:
                android.app.AlertDialog r0 = r1.f1336a
                if (r0 == 0) goto L14
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L14
                android.ext.Tools.L(r0, r2, r3)
                r1.f1339d = r3
            L14:
                return
        }

        private void e(android.ext.y0.b.e r3) {
                r2 = this;
                android.ext.y0$b$d r0 = r3.h
                boolean r0 = r0.f1348b
                if (r0 == 0) goto L10
                r0 = 2130968635(0x7f04003b, float:1.754593E38)
                r1 = -2139864428(0xffffffff80744294, float:-1.0676801E-38)
            Lc:
                r2.f(r3, r0, r1)
                goto L15
            L10:
                r0 = 2130968636(0x7f04003c, float:1.7545931E38)
                r1 = 0
                goto Lc
            L15:
                return
        }

        private void f(android.ext.y0.b.e r2, int r3, int r4) {
                r1 = this;
                android.widget.ImageView r0 = r2.f1352d
                r0.setImageResource(r3)
                android.view.View r2 = r2.f1354f
                r2.setBackgroundColor(r4)
                return
        }

        void c(android.ext.y0.c r4, java.lang.String r5, boolean r6) {
                r3 = this;
                java.util.LinkedList r0 = android.ext.y0.f1331a
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()
                android.ext.y0$c r1 = (android.ext.y0.c) r1
                boolean r2 = r4.equals(r1)
                if (r2 == 0) goto L6
                goto L1a
            L19:
                r1 = r4
            L1a:
                java.lang.String r5 = r5.trim()
                int r0 = r5.length()
                if (r0 != 0) goto L26
                java.lang.String r5 = "..."
            L26:
                java.lang.String r0 = r1.f1359d
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L3c
                r1.f1359d = r5
                if (r4 == r1) goto L34
                r4.f1359d = r5
            L34:
                if (r6 == 0) goto L39
                r3.notifyDataSetChanged()
            L39:
                android.ext.y0.h()
            L3c:
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                java.util.ArrayList r0 = r1.f1337b
                int r0 = r0.size()
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                java.util.ArrayList r0 = r1.f1337b
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
                r4 = this;
                r0 = 0
                if (r6 == 0) goto Lb
                java.lang.Object r1 = r6.getTag()
                boolean r1 = r1 instanceof android.ext.y0.b.e
                if (r1 != 0) goto L8e
            Lb:
                android.content.Context r6 = r4.f1338c
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r1 = 2131099652(0x7f060004, float:1.7811663E38)
                android.view.View r6 = r6.inflate(r1, r7, r0)
                android.ext.y0$b$e r7 = new android.ext.y0$b$e
                r7.<init>()
                r1 = 2131034438(0x7f050146, float:1.7679394E38)
                android.view.View r1 = r6.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r7.f1349a = r1
                r1 = 2131034342(0x7f0500e6, float:1.7679199E38)
                android.view.View r1 = r6.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r7.f1350b = r1
                r1 = 2131034343(0x7f0500e7, float:1.76792E38)
                android.view.View r1 = r6.findViewById(r1)
                android.ext.EditText r1 = (android.ext.EditText) r1
                r7.f1351c = r1
                android.ext.y0$b$a r2 = new android.ext.y0$b$a
                r2.<init>(r4, r7)
                r1.addTextChangedListener(r2)
                android.ext.EditText r1 = r7.f1351c
                android.ext.Tools.z1(r1, r4)
                r1 = 2131034355(0x7f0500f3, float:1.7679225E38)
                android.view.View r1 = r6.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.widget.ImageView r1 = android.ext.Config.m(r1)
                r7.f1352d = r1
                r1.setOnClickListener(r4)
                android.widget.ImageView r1 = r7.f1352d
                r1.setOnLongClickListener(r4)
                android.widget.ImageView r1 = r7.f1352d
                r1.setTag(r7)
                r1 = 2131034225(0x7f050071, float:1.7678962E38)
                android.view.View r1 = r6.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.widget.ImageView r1 = android.ext.Config.m(r1)
                r7.f1353e = r1
                r1.setOnClickListener(r4)
                android.widget.ImageView r1 = r7.f1353e
                r1.setOnLongClickListener(r4)
                android.widget.ImageView r1 = r7.f1353e
                r1.setTag(r7)
                r7.f1354f = r6
                r6.setTag(r7)
                r6.setOnLongClickListener(r4)
                r6.setOnClickListener(r4)
            L8e:
                java.lang.Object r7 = r6.getTag()
                android.ext.y0$b$e r7 = (android.ext.y0.b.e) r7
                java.util.ArrayList r1 = r4.f1337b
                java.lang.Object r1 = r1.get(r5)
                android.ext.y0$b$d r1 = (android.ext.y0.b.d) r1
                r7.h = r1
                android.widget.TextView r2 = r7.f1349a
                android.ext.y0$c r3 = r1.f1347a
                java.lang.String r3 = r3.f1356a
                r2.setText(r3)
                android.ext.y0$c r1 = r1.f1347a
                java.lang.String r1 = r1.f1359d
                android.widget.TextView r2 = r7.f1350b
                r2.setText(r1)
                android.ext.EditText r2 = r7.f1351c
                java.lang.String r1 = r4.b(r1)
                r2.setText(r1)
                r7.f1355g = r5
                android.widget.TextView r5 = r7.f1350b
                boolean r1 = android.ext.y0.b.f1335e
                r2 = 8
                if (r1 != 0) goto Lc5
                r1 = 0
                goto Lc7
            Lc5:
                r1 = 8
            Lc7:
                r5.setVisibility(r1)
                boolean r5 = android.ext.y0.b.f1335e
                if (r5 == 0) goto Lcf
                goto Ld1
            Lcf:
                r0 = 8
            Ld1:
                android.ext.EditText r5 = r7.f1351c
                r5.setVisibility(r0)
                android.widget.ImageView r5 = r7.f1353e
                r5.setVisibility(r0)
                r5 = r6
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                boolean r0 = android.ext.y0.b.f1335e
                if (r0 == 0) goto Le5
                r0 = 131072(0x20000, float:1.83671E-40)
                goto Le7
            Le5:
                r0 = 393216(0x60000, float:5.51013E-40)
            Le7:
                r5.setDescendantFocusability(r0)
                r4.e(r7)
                return r6
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r11) {
                r10 = this;
                if (r11 != 0) goto L3
                return
            L3:
                int r0 = r11.getId()
                r1 = 2131034221(0x7f05006d, float:1.7678953E38)
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L1c
                boolean r0 = android.ext.y0.b.f1335e
                r0 = r0 ^ r3
                android.ext.y0.b.f1335e = r0
                if (r0 != 0) goto L18
                r10.d(r11, r2)
            L18:
                r10.notifyDataSetChanged()
                return
            L1c:
                java.lang.Object r1 = r11.getTag()
                android.ext.y0$b$e r1 = (android.ext.y0.b.e) r1
                if (r1 != 0) goto L25
                return
            L25:
                int r7 = r1.f1355g
                r4 = 2131034225(0x7f050071, float:1.7678962E38)
                if (r0 == r4) goto L60
                r2 = 2131034355(0x7f0500f3, float:1.7679225E38)
                if (r0 == r2) goto L46
                android.widget.ListView r5 = android.ext.Tools.w0(r11)
                if (r5 == 0) goto L97
                android.widget.AdapterView$OnItemClickListener r4 = r5.getOnItemClickListener()
                if (r4 == 0) goto L97
                long r8 = r10.getItemId(r7)
                r6 = r11
                r4.onItemClick(r5, r6, r7, r8)
                goto L97
            L46:
                android.ext.y0$b$d r11 = r1.h
                boolean r0 = r11.f1348b
                r0 = r0 ^ r3
                r11.f1348b = r0
                r10.e(r1)
                android.ext.y0$b$d r11 = r1.h
                android.ext.y0$c r11 = r11.f1347a
                java.lang.String r1 = r11.f1356a
                if (r0 == 0) goto L59
                goto L5a
            L59:
                r3 = 2
            L5a:
                int r11 = r11.f1357b
                android.ext.y0.a(r1, r3, r11)
                goto L97
            L60:
                android.ext.y0$b$d r11 = r1.h
                android.ext.y0$c r11 = r11.f1347a
                java.util.LinkedList r0 = android.ext.y0.f1331a
                java.util.ListIterator r0 = r0.listIterator()
            L6a:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L97
                java.lang.Object r4 = r0.next()
                android.ext.y0$c r4 = (android.ext.y0.c) r4
                boolean r4 = r4.equals(r11)
                if (r4 == 0) goto L94
                r0.remove()
                int r11 = android.ext.y0.f1332b
                if (r2 >= r11) goto L86
                int r11 = r11 - r3
                android.ext.y0.f1332b = r11
            L86:
                java.util.ArrayList r11 = r10.f1337b
                android.ext.y0$b$d r0 = r1.h
                r11.remove(r0)
                r10.notifyDataSetChanged()
                android.ext.y0.h()
                goto L97
            L94:
                int r2 = r2 + 1
                goto L6a
            L97:
                return
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r3, boolean r4) {
                r2 = this;
                boolean r0 = android.ext.y0.b.f1335e
                r1 = r4 ^ 1
                r1 = r1 & r0
                if (r1 == 0) goto L8
                return
            L8:
                r4 = r4 & r0
                r2.d(r3, r4)
                return
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View r4) {
                r3 = this;
                boolean r0 = android.ext.y0.b.f1335e
                r1 = 0
                if (r0 != 0) goto L33
                if (r4 != 0) goto L8
                goto L33
            L8:
                if (r4 == 0) goto L22
                java.lang.Object r0 = r4.getTag()
                boolean r2 = r0 instanceof android.ext.y0.b.e
                if (r2 == 0) goto L15
                android.ext.y0$b$e r0 = (android.ext.y0.b.e) r0
                goto L23
            L15:
                android.view.ViewParent r0 = r4.getParent()
                boolean r2 = r0 instanceof android.view.View
                if (r2 != 0) goto L1e
                goto L22
            L1e:
                r4 = r0
                android.view.View r4 = (android.view.View) r4
                goto L8
            L22:
                r0 = 0
            L23:
                if (r0 != 0) goto L26
                return r1
            L26:
                android.ext.y0$b$d r0 = r0.h
                android.ext.y0$c r0 = r0.f1347a
                android.content.Context r4 = r4.getContext()
                r3.a(r0, r4)
                r4 = 1
                return r4
            L33:
                return r1
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f1356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f1357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.lang.String f1359d;

        public c(java.lang.String r2, int r3, java.lang.String r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1358c = r0
                r1.f1356a = r2
                r1.f1357b = r3
                r1.f1359d = r4
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof android.ext.y0.c
                if (r0 == 0) goto L18
                int r0 = r2.f1357b
                android.ext.y0$c r3 = (android.ext.y0.c) r3
                int r1 = r3.f1357b
                if (r0 != r1) goto L18
                java.lang.String r0 = r2.f1356a
                java.lang.String r3 = r3.f1356a
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L18
                r3 = 1
                goto L19
            L18:
                r3 = 0
            L19:
                return r3
        }

        public int hashCode() {
                r5 = this;
                int r0 = r5.f1358c
                if (r0 != 0) goto L30
                java.lang.String r0 = r5.f1356a
                int r0 = r0.hashCode()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "#$@$#"
                r1.append(r2)
                int r2 = r5.f1357b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                int r2 = r1.length()
                r3 = 0
            L22:
                if (r3 >= r2) goto L2e
                int r0 = r0 * 31
                char r4 = r1.charAt(r3)
                int r0 = r0 + r4
                int r3 = r3 + 1
                goto L22
            L2e:
                r5.f1358c = r0
            L30:
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.f1356a
                return r0
        }
    }

    static {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.ext.y0.f1331a = r0
            r0 = 0
            android.ext.y0.f1332b = r0
            return
    }

    public static void a(java.lang.String r4, byte r5, int r6) {
            if (r4 == 0) goto L77
            int r0 = r4.length()
            if (r0 == 0) goto L77
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L77
            java.lang.String r0 = "-1"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L77
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L21
            goto L77
        L21:
            android.ext.y0$c r0 = new android.ext.y0$c
            java.lang.String r1 = "..."
            r0.<init>(r4, r6, r1)
            java.util.LinkedList r4 = android.ext.y0.f1331a
            java.util.ListIterator r4 = r4.listIterator()
            r6 = 0
        L2f:
            boolean r1 = r4.hasNext()
            r2 = 1
            if (r1 == 0) goto L57
            java.lang.Object r1 = r4.next()
            android.ext.y0$c r1 = (android.ext.y0.c) r1
            boolean r3 = r1.equals(r0)
            if (r3 == 0) goto L54
            java.lang.String r1 = r1.f1359d
            r0.f1359d = r1
            r4.remove()
            int r4 = android.ext.y0.f1332b
            if (r6 >= r4) goto L57
            int r4 = r4 - r2
            android.ext.y0.f1332b = r4
            if (r5 != 0) goto L57
            r5 = 1
            goto L57
        L54:
            int r6 = r6 + 1
            goto L2f
        L57:
            if (r5 != 0) goto L5a
            goto L67
        L5a:
            if (r5 != r2) goto L67
            java.util.LinkedList r4 = android.ext.y0.f1331a
            r4.addFirst(r0)
            int r4 = android.ext.y0.f1332b
            int r4 = r4 + r2
            android.ext.y0.f1332b = r4
            goto L71
        L67:
            d()
            java.util.LinkedList r4 = android.ext.y0.f1331a
            int r5 = android.ext.y0.f1332b
            r4.add(r5, r0)
        L71:
            j()
            h()
        L77:
            return
    }

    public static void b(java.lang.String r1, int r2) {
            r0 = 0
            a(r1, r0, r2)
            return
    }

    public static void c() {
            java.util.LinkedList r0 = android.ext.y0.f1331a
            r0.clear()
            d()
            return
    }

    static void d() {
            int r0 = android.ext.y0.f1332b
            if (r0 >= 0) goto L8
            r0 = 0
            android.ext.y0.f1332b = r0
            return
        L8:
            java.util.LinkedList r1 = android.ext.y0.f1331a
            int r1 = r1.size()
            if (r0 <= r1) goto L12
            android.ext.y0.f1332b = r1
        L12:
            return
    }

    public static void e() {
            f()
            return
    }

    private static void f() {
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.LinkedList r1 = android.ext.y0.f1331a
            java.lang.String r2 = "history-size"
            r3 = 0
            int r2 = r0.getInt(r2, r3)
            int r4 = android.ext.Config.x
            if (r2 <= r4) goto L17
            int r4 = android.ext.Config.x
            goto L18
        L17:
            r4 = r2
        L18:
            int r5 = g(r4)
            boolean[] r6 = new boolean[r5]
            r7 = 1
            int r5 = r5 - r7
            r8 = 0
        L21:
            if (r8 >= r2) goto L96
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "history-"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r10 = 0
            java.lang.String r9 = r0.getString(r9, r10)
            if (r9 == 0) goto L93
            int r10 = r9.length()
            if (r10 != 0) goto L42
            goto L93
        L42:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "h-"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            int r10 = r0.getInt(r10, r7)
            if (r10 != 0) goto L5a
            r10 = 1
        L5a:
            android.ext.y0$c r11 = new android.ext.y0$c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "hi-"
            r12.append(r13)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "..."
            java.lang.String r12 = r0.getString(r12, r13)
            r11.<init>(r9, r10, r12)
            int r9 = r11.hashCode()
            r9 = r9 & r5
            boolean r10 = r6[r9]
            if (r10 == 0) goto L87
            int r9 = r1.indexOf(r11)
            r10 = -1
            if (r9 == r10) goto L89
            goto L93
        L87:
            r6[r9] = r7
        L89:
            r1.addLast(r11)
            int r9 = r1.size()
            if (r9 < r4) goto L93
            goto L96
        L93:
            int r8 = r8 + 1
            goto L21
        L96:
            java.lang.String r1 = "history-sticked"
            int r0 = r0.getInt(r1, r3)
            android.ext.y0.f1332b = r0
            d()
            j()
            return
    }

    private static int g(int r1) {
            int r0 = r1 >> 1
            r1 = r1 | r0
            int r0 = r1 >> 2
            r1 = r1 | r0
            int r0 = r1 >> 4
            r1 = r1 | r0
            int r0 = r1 >> 8
            r1 = r1 | r0
            int r0 = r1 >> 16
            r1 = r1 | r0
            int r1 = r1 + 1
            return r1
    }

    static void h() {
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            if (r0 != 0) goto L7
            return
        L7:
            android.ext.g2 r1 = new android.ext.g2
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1.<init>(r0)
            java.util.LinkedList r0 = android.ext.y0.f1331a
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L18:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r0.next()
            android.ext.y0$c r4 = (android.ext.y0.c) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "history-"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r4.f1356a
            r1.j(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "h-"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            int r6 = r4.f1357b
            r7 = 1
            r1.g(r5, r6, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "hi-"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r4 = r4.f1359d
            java.lang.String r6 = "..."
            r1.k(r5, r4, r6)
            int r3 = r3 + 1
            goto L18
        L6c:
            java.lang.String r0 = "history-size"
            r1.g(r0, r3, r2)
            java.lang.String r0 = "history-sticked"
            int r3 = android.ext.y0.f1332b
            r1.g(r0, r3, r2)
            r1.commit()
            return
    }

    public static void i(android.widget.EditText r3) {
            android.ext.y0$b r0 = new android.ext.y0$b
            android.content.Context r1 = android.ext.Tools.k0()
            boolean r2 = r3 instanceof android.ext.k0
            if (r2 == 0) goto L12
            r2 = r3
            android.ext.k0 r2 = (android.ext.k0) r2
            int r2 = r2.getDataType()
            goto L13
        L12:
            r2 = -1
        L13:
            r0.<init>(r1, r2)
            int r1 = r0.getCount()
            if (r1 != 0) goto L23
            r3 = 2131296681(0x7f0901a9, float:1.8211286E38)
            android.ext.Tools.H1(r3)
            goto L59
        L23:
            r1 = 0
            android.ext.y0.b.f1335e = r1
            r1 = 2131296680(0x7f0901a8, float:1.8211284E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 2131296328(0x7f090048, float:1.821057E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            android.view.View r1 = android.ext.Tools.i0(r1, r2)
            r1.setOnClickListener(r0)
            android.content.Context r2 = android.ext.Tools.k0()
            android.app.AlertDialog$Builder r2 = android.ext.f.c(r2)
            android.app.AlertDialog$Builder r1 = r2.setCustomTitle(r1)
            android.ext.y0$a r2 = new android.ext.y0$a
            r2.<init>(r0, r3)
            android.app.AlertDialog$Builder r3 = r1.setAdapter(r0, r2)
            android.app.AlertDialog r3 = r3.create()
            r0.f1336a = r3
            android.ext.f.m(r3)
        L59:
            return
    }

    private static void j() {
            java.util.LinkedList r0 = android.ext.y0.f1331a
            int r1 = android.ext.Config.x
            int r2 = r0.size()
            if (r2 > r1) goto Lb
            return
        Lb:
            int r2 = r0.size()
            int r2 = r2 - r1
        L10:
            if (r2 <= 0) goto L18
            r0.removeLast()
            int r2 = r2 + (-1)
            goto L10
        L18:
            d()
            return
    }
}
