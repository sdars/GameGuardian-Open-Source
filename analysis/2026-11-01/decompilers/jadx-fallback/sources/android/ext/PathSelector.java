package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class PathSelector extends android.fix.Button implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f322a = true;

    class a implements java.util.Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f323a;

        a(boolean r1) {
                r0 = this;
                r0.f323a = r1
                r0.<init>()
                return
        }

        public int a(android.ext.PathSelector.d r6, android.ext.PathSelector.d r7) {
                r5 = this;
                boolean r0 = r6.f337c
                boolean r1 = r7.f337c
                r2 = 1
                r3 = -1
                if (r0 == r1) goto Lc
                if (r0 == 0) goto L2c
            La:
                r2 = -1
                goto L2c
            Lc:
                boolean r0 = r5.f323a     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto L1b
                java.lang.String r6 = r6.f336b     // Catch: java.lang.Throwable -> L19
                java.lang.String r7 = r7.f336b     // Catch: java.lang.Throwable -> L19
                int r2 = android.ext.r1.a(r6, r7)     // Catch: java.lang.Throwable -> L19
                goto L2c
            L19:
                r6 = move-exception
                goto L2d
            L1b:
                java.io.File r6 = r6.f335a     // Catch: java.lang.Throwable -> L19
                long r0 = r6.lastModified()     // Catch: java.lang.Throwable -> L19
                java.io.File r6 = r7.f335a     // Catch: java.lang.Throwable -> L19
                long r6 = r6.lastModified()     // Catch: java.lang.Throwable -> L19
                int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r4 <= 0) goto L2c
                goto La
            L2c:
                return r2
            L2d:
                android.ext.e1.a(r6)
                r6 = 0
                return r6
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                android.ext.PathSelector$d r1 = (android.ext.PathSelector.d) r1
                android.ext.PathSelector$d r2 = (android.ext.PathSelector.d) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    class b implements java.util.Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.StringBuilder f324a;

        b(java.lang.StringBuilder r1) {
                r0 = this;
                r0.f324a = r1
                r0.<init>()
                return
        }

        public int a(android.ext.PathSelector.d r7, android.ext.PathSelector.d r8) {
                r6 = this;
                boolean r0 = r7.f337c
                boolean r1 = r8.f337c
                if (r0 == r1) goto Lc
                if (r0 == 0) goto La
                r2 = -1
                goto L14
            La:
                r2 = 1
                goto L14
            Lc:
                java.lang.String r2 = r7.f336b
                java.lang.String r3 = r8.f336b
                int r2 = android.ext.r1.a(r2, r3)
            L14:
                java.lang.StringBuilder r3 = r6.f324a
                r4 = 70
                r5 = 68
                if (r0 == 0) goto L1f
                r0 = 68
                goto L21
            L1f:
                r0 = 70
            L21:
                r3.append(r0)
                java.lang.StringBuilder r0 = r6.f324a
                r3 = 58
                r0.append(r3)
                java.lang.StringBuilder r0 = r6.f324a
                r0.append(r7)
                java.lang.StringBuilder r0 = r6.f324a
                r0.append(r3)
                java.lang.StringBuilder r0 = r6.f324a
                java.lang.String r7 = r7.f336b
                r0.append(r7)
                java.lang.StringBuilder r7 = r6.f324a
                r0 = 10
                r7.append(r0)
                java.lang.StringBuilder r7 = r6.f324a
                if (r1 == 0) goto L49
                r4 = 68
            L49:
                r7.append(r4)
                java.lang.StringBuilder r7 = r6.f324a
                r7.append(r3)
                java.lang.StringBuilder r7 = r6.f324a
                r7.append(r8)
                java.lang.StringBuilder r7 = r6.f324a
                r7.append(r3)
                java.lang.StringBuilder r7 = r6.f324a
                java.lang.String r8 = r8.f336b
                r7.append(r8)
                java.lang.StringBuilder r7 = r6.f324a
                r7.append(r0)
                java.lang.StringBuilder r7 = r6.f324a
                r7.append(r2)
                java.lang.StringBuilder r7 = r6.f324a
                r7.append(r0)
                return r2
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                android.ext.PathSelector$d r1 = (android.ext.PathSelector.d) r1
                android.ext.PathSelector$d r2 = (android.ext.PathSelector.d) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    private class c implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.widget.ImageView f325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.fix.TextView f326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.fix.ListView f327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private android.fix.TextView f328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.io.File f329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private android.ext.ArrayAdapter f330f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private android.app.AlertDialog f331g;
        private int h;
        private android.widget.EditText i;
        private android.widget.EditText j;
        private int k;
        private int l;
        private int m;
        final /* synthetic */ android.ext.PathSelector n;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f332a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.PathSelector.c f333b;

            a(android.ext.PathSelector.c r1, int r2) {
                    r0 = this;
                    r0.f333b = r1
                    r0.f332a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    android.ext.PathSelector$c r0 = r2.f333b
                    android.fix.ListView r0 = r0.f327c
                    int r1 = r2.f332a
                    r0.setSelection(r1)
                    return
            }
        }

        class b extends android.ext.ArrayAdapter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.PathSelector.c f334b;

            b(android.ext.PathSelector.c r1, android.content.Context r2, java.util.List r3) {
                    r0 = this;
                    r0.f334b = r1
                    r0.<init>(r2, r3)
                    return
            }

            @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
            public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                    r1 = this;
                    android.ext.PathSelector$c r0 = r1.f334b
                    android.view.View r2 = r0.b(r2, r3, r4)
                    return r2
            }
        }

        private c(android.ext.PathSelector r2) {
                r1 = this;
                r1.n = r2
                r1.<init>()
                r2 = 2130837512(0x7f020008, float:1.727998E38)
                r0 = -16755456(0xffffffffff005500, float:-1.7058253E38)
                int r2 = android.ext.Tools.e0(r2, r0)
                r1.k = r2
                r2 = 2130837513(0x7f020009, float:1.7279982E38)
                r0 = -16777131(0xffffffffff000055, float:-1.701429E38)
                int r2 = android.ext.Tools.e0(r2, r0)
                r1.l = r2
                r2 = 2130837511(0x7f020007, float:1.7279978E38)
                r0 = -16755371(0xffffffffff005555, float:-1.7058425E38)
                int r2 = android.ext.Tools.e0(r2, r0)
                r1.m = r2
                return
        }

        /* synthetic */ c(android.ext.PathSelector r1, android.ext.PathSelector.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a(java.lang.String r5) {
                r4 = this;
                android.ext.EditText r0 = new android.ext.EditText
                android.content.Context r1 = android.ext.Tools.f0()
                r0.<init>(r1)
                r4.j = r0
                r0.setText(r5)
                android.app.AlertDialog$Builder r5 = android.ext.f.b()
                r1 = 2131296463(0x7f0900cf, float:1.8210843E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.io.File r3 = r4.f329e
                java.lang.String r3 = r3.getAbsolutePath()
                r2.append(r3)
                java.lang.String r3 = "/..."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.view.View r1 = android.ext.Tools.i0(r1, r2)
                android.app.AlertDialog$Builder r5 = r5.setCustomTitle(r1)
                r1 = 0
                android.view.View r0 = android.ext.InternalKeyboard.e(r0, r1)
                android.app.AlertDialog$Builder r5 = r5.setView(r0)
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r1 = 0
                android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r0, r1)
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r5 = r5.setPositiveButton(r0, r4)
                android.ext.f.o(r5)
                return
        }

        private void c(java.lang.String r3) {
                r2 = this;
                java.io.File r0 = new java.io.File
                java.io.File r1 = r2.f329e
                r0.<init>(r1, r3)
                r2.f329e = r0
                return
        }

        private void d(int r3) {
                r2 = this;
                android.fix.ListView r0 = r2.f327c
                r0.setSelection(r3)
                android.fix.ListView r0 = r2.f327c
                android.ext.PathSelector$c$a r1 = new android.ext.PathSelector$c$a
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        private void e(java.io.File r8, boolean r9) {
                r7 = this;
                android.ext.ArrayAdapter r0 = r7.f330f
                int r1 = r0.getCount()
                java.lang.String r2 = r8.getAbsolutePath()
                java.util.Locale r3 = java.util.Locale.US
                java.lang.String r2 = r2.toLowerCase(r3)
                r3 = 0
                r4 = 0
            L12:
                if (r3 >= r1) goto L3b
                java.lang.Object r5 = r0.getItem(r3)
                java.io.File r5 = (java.io.File) r5
                boolean r6 = r8.equals(r5)
                if (r6 == 0) goto L21
                goto L3c
            L21:
                boolean r6 = android.ext.PathSelector.c(r5)
                if (r9 != r6) goto L38
                java.lang.String r5 = r5.getAbsolutePath()
                java.util.Locale r6 = java.util.Locale.US
                java.lang.String r5 = r5.toLowerCase(r6)
                int r5 = r2.compareTo(r5)
                if (r5 <= 0) goto L38
                r4 = r3
            L38:
                int r3 = r3 + 1
                goto L12
            L3b:
                r3 = r4
            L3c:
                r7.d(r3)
                return
        }

        private void f(boolean r5) {
                r4 = this;
                android.fix.TextView r0 = r4.f328d
                r1 = 8
                r2 = 0
                if (r5 == 0) goto L9
                r3 = 0
                goto Lb
            L9:
                r3 = 8
            Lb:
                r0.setVisibility(r3)
                android.fix.ListView r0 = r4.f327c
                if (r5 != 0) goto L13
                r1 = 0
            L13:
                r0.setVisibility(r1)
                return
        }

        private void g(boolean r3) {
                r2 = this;
                android.widget.ImageView r0 = r2.f325a
                if (r3 == 0) goto L6
                r1 = 0
                goto L7
            L6:
                r1 = r0
            L7:
                r0.setTag(r1)
                android.widget.ImageView r0 = r2.f325a
                if (r3 == 0) goto L12
                r3 = 2130968652(0x7f04004c, float:1.7545964E38)
                goto L15
            L12:
                r3 = 2130968651(0x7f04004b, float:1.7545962E38)
            L15:
                android.graphics.drawable.Drawable r3 = android.ext.Tools.o0(r3)
                r0.setImageDrawable(r3)
                return
        }

        private void h() {
                r2 = this;
                java.io.File r0 = r2.f329e
                java.io.File r0 = r0.getParentFile()
                r2.f329e = r0
                if (r0 != 0) goto L13
                java.io.File r0 = new java.io.File
                java.lang.String r1 = "/"
                r0.<init>(r1)
                r2.f329e = r0
            L13:
                return
        }

        private void i() {
                r7 = this;
                android.fix.TextView r0 = r7.f326b
                java.io.File r1 = r7.f329e
                java.lang.String r1 = r1.getAbsolutePath()
                r0.setText(r1)
                java.io.File r0 = r7.f329e
                java.lang.String[] r0 = android.ext.PathSelector.d(r0)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L17
                r3 = 1
                goto L18
            L17:
                r3 = 0
            L18:
                r7.f(r3)
                if (r0 != 0) goto L1f
                java.lang.String[] r0 = d.b.f1509a
            L1f:
                int r3 = r7.h
                java.io.File r4 = r7.f329e
                android.widget.ImageView r5 = r7.f325a
                java.lang.Object r5 = r5.getTag()
                if (r5 != 0) goto L2d
                r5 = 1
                goto L2e
            L2d:
                r5 = 0
            L2e:
                r6 = 0
                java.util.ArrayList r0 = android.ext.PathSelector.e(r3, r4, r0, r6, r5)
                android.ext.ArrayAdapter r3 = r7.f330f
                r3.clear()
                android.ext.ArrayAdapter r3 = r7.f330f
                r3.setNotifyOnChange(r1)
                java.util.Iterator r0 = r0.iterator()
            L41:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L55
                java.lang.Object r1 = r0.next()
                android.ext.PathSelector$d r1 = (android.ext.PathSelector.d) r1
                android.ext.ArrayAdapter r3 = r7.f330f
                java.io.File r1 = r1.f335a
                r3.add(r1)
                goto L41
            L55:
                android.ext.ArrayAdapter r0 = r7.f330f
                r0.notifyDataSetChanged()
                android.ext.ArrayAdapter r0 = r7.f330f
                r0.setNotifyOnChange(r2)
                return
        }

        public android.view.View b(int r9, android.view.View r10, android.view.ViewGroup r11) {
                r8 = this;
                r11 = 0
                if (r10 != 0) goto L4c
                android.ext.PathSelector r10 = r8.n
                android.content.Context r10 = r10.getContext()
                android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
                r0 = 2131099664(0x7f060010, float:1.7811688E38)
                android.view.View r10 = r10.inflate(r0, r11)
                android.ext.PathSelector$e r0 = new android.ext.PathSelector$e
                r0.<init>()
                r1 = 2131034337(0x7f0500e1, float:1.7679189E38)
                android.view.View r1 = r10.findViewById(r1)
                android.fix.TextView r1 = (android.fix.TextView) r1
                r0.f338a = r1
                r1 = 2131034222(0x7f05006e, float:1.7678955E38)
                android.view.View r1 = r10.findViewById(r1)
                android.fix.TextView r1 = (android.fix.TextView) r1
                r0.f339b = r1
                r1 = 2131034405(0x7f050125, float:1.7679327E38)
                android.view.View r1 = r10.findViewById(r1)
                android.fix.TextView r1 = (android.fix.TextView) r1
                r0.f340c = r1
                r1 = 2131034289(0x7f0500b1, float:1.7679091E38)
                android.view.View r1 = r10.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.widget.ImageView r1 = android.ext.Config.m(r1)
                r0.f341d = r1
                r10.setTag(r0)
            L4c:
                android.ext.ArrayAdapter r0 = r8.f330f     // Catch: java.lang.IndexOutOfBoundsException -> L56
                java.lang.Object r0 = r0.getItem(r9)     // Catch: java.lang.IndexOutOfBoundsException -> L56
                java.io.File r0 = (java.io.File) r0     // Catch: java.lang.IndexOutOfBoundsException -> L56
                r11 = r0
                goto L6b
            L56:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed get item: "
                r1.append(r2)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                android.ext.e1.s(r9, r0)
            L6b:
                if (r11 != 0) goto L76
                java.io.File r11 = new java.io.File
                java.io.File r9 = r8.f329e
                java.lang.String r0 = "???"
                r11.<init>(r9, r0)
            L76:
                java.lang.Object r9 = r10.getTag()
                android.ext.PathSelector$e r9 = (android.ext.PathSelector.e) r9
                java.lang.String r0 = r11.getName()
                java.lang.String r1 = ".lua"
                boolean r1 = r0.endsWith(r1)
                r2 = 0
                if (r1 == 0) goto L8f
                int r1 = r8.k
            L8b:
                r10.setBackgroundColor(r1)
                goto La8
            L8f:
                java.lang.String r1 = ".txt"
                boolean r1 = r0.endsWith(r1)
                if (r1 == 0) goto L9a
                int r1 = r8.l
                goto L8b
            L9a:
                java.lang.String r1 = ".lasm"
                boolean r1 = r0.endsWith(r1)
                if (r1 == 0) goto La5
                int r1 = r8.m
                goto L8b
            La5:
                r10.setBackgroundColor(r2)
            La8:
                android.fix.TextView r1 = r9.f338a
                r1.setText(r0)
                r0 = -1
                boolean r3 = android.ext.PathSelector.c(r11)     // Catch: java.lang.Throwable -> Lc3
                if (r3 == 0) goto Lb7
                r4 = r0
                goto Lbb
            Lb7:
                long r4 = r11.length()     // Catch: java.lang.Throwable -> Lc3
            Lbb:
                long r0 = r11.lastModified()     // Catch: java.lang.Throwable -> Lc3
                r11 = r3
                r2 = r0
                r0 = r4
                goto Lde
            Lc3:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Failed get info: "
                r4.append(r5)
                java.lang.String r11 = r11.getAbsolutePath()
                r4.append(r11)
                java.lang.String r11 = r4.toString()
                android.ext.e1.s(r11, r3)
                r2 = r0
                r11 = 0
            Lde:
                android.widget.ImageView r4 = r9.f341d
                if (r11 == 0) goto Le6
                r11 = 2130968614(0x7f040026, float:1.7545887E38)
                goto Le9
            Le6:
                r11 = 2130968611(0x7f040023, float:1.754588E38)
            Le9:
                r4.setImageResource(r11)
                android.fix.TextView r11 = r9.f340c
                java.lang.String r4 = ""
                r5 = 0
                int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r7 < 0) goto L101
                android.ext.PathSelector r7 = r8.n
                android.content.Context r7 = r7.getContext()
                java.lang.String r0 = android.ext.Tools.U(r7, r0)
                goto L102
            L101:
                r0 = r4
            L102:
                r11.setText(r0)
                android.fix.TextView r9 = r9.f339b
                int r11 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r11 <= 0) goto L111
                java.lang.String r11 = "yyyy-MM-dd kk:mm:ss"
                java.lang.CharSequence r4 = android.text.format.DateFormat.format(r11, r2)
            L111:
                r9.setText(r4)
                return r10
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                android.app.AlertDialog r4 = r2.f331g
                if (r3 != r4) goto L46
                java.io.File r3 = r2.f329e
                java.lang.String r3 = r3.getAbsolutePath()
                int r4 = r2.h
                r0 = 2
                if (r4 != r0) goto L40
                java.io.File r4 = new java.io.File
                android.widget.EditText r0 = r2.i
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                java.lang.String r4 = r4.getName()
                if (r4 == 0) goto L2a
                int r0 = r4.length()
                if (r0 != 0) goto L2c
            L2a:
                java.lang.String r4 = "file.txt"
            L2c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "/"
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
            L40:
                android.widget.EditText r4 = r2.i
                r4.setText(r3)
                goto L92
            L46:
                android.widget.EditText r3 = r2.j
                if (r3 == 0) goto L92
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = r3.trim()
                int r4 = r3.length()
                r0 = 2131296461(0x7f0900cd, float:1.821084E38)
                if (r4 <= 0) goto L8c
                java.io.File r4 = new java.io.File
                java.io.File r1 = r2.f329e
                r4.<init>(r1, r3)
                boolean r1 = r4.exists()
                if (r1 == 0) goto L7d
                boolean r4 = android.ext.PathSelector.c(r4)
                if (r4 == 0) goto L79
                r4 = 2131296460(0x7f0900cc, float:1.8210837E38)
            L75:
                android.ext.Tools.H1(r4)
                goto L8f
            L79:
                r4 = 2131296462(0x7f0900ce, float:1.8210841E38)
                goto L75
            L7d:
                boolean r4 = r4.mkdirs()
                if (r4 != 0) goto L84
                goto L8c
            L84:
                r4 = 4
                android.ext.y0.b(r3, r4)
                r2.i()
                goto L92
            L8c:
                android.ext.Tools.H1(r0)
            L8f:
                r2.a(r3)
            L92:
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r9) {
                r8 = this;
                int r9 = r9.getId()
                r0 = 2131034114(0x7f050002, float:1.7678736E38)
                if (r9 == r0) goto L10c
                r1 = 2131034409(0x7f050129, float:1.7679335E38)
                r2 = 0
                r3 = 1
                if (r9 == r1) goto Lf6
                r4 = 2131034436(0x7f050144, float:1.767939E38)
                if (r9 == r4) goto Lea
                android.ext.PathSelector r9 = r8.n
                java.lang.Object r9 = r9.getTag()
                boolean r5 = r9 instanceof android.ext.EditTextPath
                if (r5 != 0) goto L20
                return
            L20:
                android.ext.EditTextPath r9 = (android.ext.EditTextPath) r9
                r8.i = r9
                r5 = 2131099665(0x7f060011, float:1.781169E38)
                r6 = 0
                android.view.View r5 = a.d.f(r5, r6)
                r7 = 2131034353(0x7f0500f1, float:1.7679221E38)
                android.view.View r7 = r5.findViewById(r7)
                android.fix.TextView r7 = (android.fix.TextView) r7
                r8.f326b = r7
                android.view.View r0 = r5.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                android.widget.ImageView r0 = android.ext.Config.m(r0)
                r0.setOnClickListener(r8)
                android.view.View r0 = r5.findViewById(r1)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r8.f325a = r0
                android.widget.ImageView r0 = android.ext.Config.m(r0)
                r0.setOnClickListener(r8)
                boolean r0 = android.ext.PathSelector.f322a
                r8.g(r0)
                android.view.View r0 = r5.findViewById(r4)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                android.widget.ImageView r0 = android.ext.Config.m(r0)
                r0.setOnClickListener(r8)
                r0 = 2131034250(0x7f05008a, float:1.7679012E38)
                android.view.View r0 = r5.findViewById(r0)
                android.fix.TextView r0 = (android.fix.TextView) r0
                r8.f328d = r0
                r0 = 2131034253(0x7f05008d, float:1.7679018E38)
                android.view.View r0 = r5.findViewById(r0)
                android.fix.ListView r0 = (android.fix.ListView) r0
                r8.f327c = r0
                android.ext.PathSelector$c$b r1 = new android.ext.PathSelector$c$b
                android.ext.PathSelector r4 = r8.n
                android.content.Context r4 = r4.getContext()
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                r1.<init>(r8, r4, r7)
                r8.f330f = r1
                r0.setAdapter(r1)
                r0.setOnItemClickListener(r8)
                int r0 = r9.getPathType()
                r8.h = r0
                java.io.File r0 = new java.io.File
                android.text.Editable r9 = r9.getText()
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                r8.f329e = r0
            La8:
                java.io.File r9 = r8.f329e
                boolean r9 = android.ext.PathSelector.c(r9)
                if (r9 != 0) goto Lb4
                r8.h()
                goto La8
            Lb4:
                r8.i()
                int r9 = r8.h
                if (r9 != 0) goto Lbc
                r2 = 1
            Lbc:
                r8.e(r0, r2)
                android.app.AlertDialog$Builder r9 = android.ext.f.b()
                android.app.AlertDialog$Builder r9 = r9.setView(r5)
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r9 = r9.setNegativeButton(r0, r6)
                int r0 = r8.h
                if (r0 == r3) goto Le0
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r9.setPositiveButton(r0, r8)
            Le0:
                android.app.AlertDialog r9 = r9.create()
                r8.f331g = r9
                android.ext.f.m(r9)
                goto L111
            Lea:
                java.io.File r9 = r8.f329e
                r8.h()
                r8.i()
                r8.e(r9, r3)
                goto L111
            Lf6:
                android.widget.ImageView r9 = r8.f325a
                java.lang.Object r9 = r9.getTag()
                if (r9 == 0) goto Lff
                goto L100
            Lff:
                r3 = 0
            L100:
                android.ext.PathSelector.f322a = r3
                r8.g(r3)
                r8.i()
                r8.d(r2)
                goto L111
            L10c:
                java.lang.String r9 = ""
                r8.a(r9)
            L111:
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                if (r3 < 0) goto L53
                android.ext.ArrayAdapter r1 = r0.f330f
                int r1 = r1.getCount()
                if (r3 < r1) goto Lb
                goto L53
            Lb:
                android.ext.ArrayAdapter r1 = r0.f330f     // Catch: java.lang.Exception -> L3e
                java.lang.Object r1 = r1.getItem(r3)     // Catch: java.lang.Exception -> L3e
                java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Exception -> L3e
                if (r1 != 0) goto L16
                return
            L16:
                boolean r2 = android.ext.PathSelector.c(r1)
                if (r2 == 0) goto L2b
                java.lang.String r1 = r1.getName()
                r0.c(r1)
                r0.i()
                r1 = 0
                r0.d(r1)
                goto L3d
            L2b:
                int r2 = r0.h
                if (r2 == 0) goto L3d
                android.widget.EditText r2 = r0.i
                java.lang.String r1 = r1.getAbsolutePath()
                r2.setText(r1)
                android.app.AlertDialog r1 = r0.f331g
                android.ext.Tools.D(r1)
            L3d:
                return
            L3e:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Failed get Item: "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.ext.e1.s(r2, r1)
            L53:
                return
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.io.File f335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.lang.String f336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f337c;

        d(java.io.File r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.f335a = r1
                r0.f336b = r2
                r0.f337c = r3
                return
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.fix.TextView f338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public android.fix.TextView f339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public android.fix.TextView f340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public android.widget.ImageView f341d;

        e() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    public PathSelector(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.b()
            return
    }

    private static void a(java.lang.String r10, java.util.ArrayList r11, java.lang.String r12, java.lang.String r13) {
            if (r13 != 0) goto L3
            return
        L3:
            r0 = 1
            if (r12 != 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 3
        L9:
            r2 = 0
            r4 = r13
            r3 = 0
        Lc:
            if (r3 >= r1) goto La8
            java.lang.String r5 = "/data/data/"
            if (r3 != r0) goto L31
            boolean r6 = r13.startsWith(r5)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto La1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r4.<init>()     // Catch: java.lang.Throwable -> L2e
            r4.append(r12)     // Catch: java.lang.Throwable -> L2e
            r6 = 11
            java.lang.String r6 = r13.substring(r6)     // Catch: java.lang.Throwable -> L2e
            r4.append(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r10 = move-exception
            goto La5
        L31:
            r6 = 2
            if (r3 != r6) goto L51
            boolean r6 = r13.startsWith(r12)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto La1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r4.<init>()     // Catch: java.lang.Throwable -> L2e
            r4.append(r5)     // Catch: java.lang.Throwable -> L2e
            int r5 = r12.length()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r13.substring(r5)     // Catch: java.lang.Throwable -> L2e
            r4.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2e
        L51:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            r6 = 0
        L57:
            java.lang.String r7 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L2e
            boolean r8 = r7.startsWith(r10)     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto L62
            goto La1
        L62:
            boolean r8 = r5.isDirectory()     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto L6e
            boolean r8 = r5.isFile()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L88
        L6e:
            int r8 = r10.length()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = r7.substring(r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = "/"
            r9 = -1
            java.lang.String[] r7 = r7.split(r8, r9)     // Catch: java.lang.Throwable -> L2e
            r7 = r7[r2]     // Catch: java.lang.Throwable -> L2e
            boolean r8 = r11.contains(r7)     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto L88
            r11.add(r7)     // Catch: java.lang.Throwable -> L2e
        L88:
            java.io.File r5 = r5.getParentFile()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto La1
            java.lang.String r7 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L2e
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L2e
            if (r7 <= r0) goto La1
            int r7 = r6 + 1
            r8 = 20
            if (r6 < r8) goto L9f
            goto La1
        L9f:
            r6 = r7
            goto L57
        La1:
            int r3 = r3 + 1
            goto Lc
        La5:
            android.ext.e1.a(r10)
        La8:
            return
    }

    private void b() {
            r1 = this;
            java.lang.String r0 = "..."
            r1.setText(r0)
            r1.setOnClickListener(r1)
            return
    }

    static boolean c(java.io.File r0) {
            boolean r0 = r0.isDirectory()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    static java.lang.String[] d(java.io.File r11) {
            java.lang.String r0 = "/data/app/"
            java.lang.String r1 = "/data/dalvik-cache/x86"
            java.lang.String r2 = "/"
            java.lang.String r3 = "/data/user/"
            r4 = 0
            java.lang.String[] r5 = r11.list()     // Catch: java.lang.SecurityException -> Le
            goto L28
        Le:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed list dir: "
            r6.append(r7)
            java.lang.String r7 = r11.getAbsolutePath()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.ext.e1.s(r6, r5)
            r5 = r4
        L28:
            if (r5 == 0) goto L2b
            return r5
        L2b:
            java.lang.String r11 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L50
            boolean r5 = r11.startsWith(r3)     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L53
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r5.<init>()     // Catch: java.lang.Throwable -> L50
            r5.append(r3)     // Catch: java.lang.Throwable -> L50
            r3 = -1
            java.lang.String[] r3 = r11.split(r2, r3)     // Catch: java.lang.Throwable -> L50
            r6 = 3
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L50
            r5.append(r3)     // Catch: java.lang.Throwable -> L50
            r5.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L50
            goto L55
        L50:
            r11 = move-exception
            goto L1b0
        L53:
            java.lang.String r2 = "/data/user/0/"
        L55:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r3.<init>()     // Catch: java.lang.Throwable -> L50
            r3.append(r11)     // Catch: java.lang.Throwable -> L50
            r11 = 47
            r3.append(r11)     // Catch: java.lang.Throwable -> L50
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r3.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "/data/anr"
            a(r11, r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "/data/app"
            a(r11, r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "/data/app-lib"
            a(r11, r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "/data/app-private"
            a(r11, r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "/data/dalvik-cache/profiles"
            a(r11, r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "/data/dalvik-cache/armeabi"
            a(r11, r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "/data/dalvik-cache/armeabi-v7a"
            a(r11, r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "/data/dalvik-cache/arm"
            a(r11, r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "/data/dalvik-cache/arm64-v8a"
            a(r11, r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "/data/dalvik-cache/arm64"
            a(r11, r3, r2, r5)     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/dalvik-cache/x86_64"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/local/tmp"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/misc/user"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/misc/zoneinfo"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/resource-cache"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/security"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/system/cache"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/system/registered_services"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/system/shared_prefs"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/system/users"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/data/tmp"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/storage/emulated/legacy"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/storage/emulated/0"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/storage/emulated/sdcard0"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/storage/emulated/sdcard1"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/storage/sdcard0"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/storage/sdcard1"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/sdcard"
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = android.ext.Tools.K0()     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> L50
            android.content.pm.PackageManager r1 = android.ext.Tools.B0()     // Catch: java.lang.Throwable -> L50
            r5 = 0
            java.util.List r1 = r1.getInstalledApplications(r5)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L50
        L114:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L19b
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L50
            android.content.pm.ApplicationInfo r6 = (android.content.pm.ApplicationInfo) r6     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r6.dataDir     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r6.nativeLibraryDir     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r6.publicSourceDir     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r6.sourceDir     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String[] r7 = r6.splitPublicSourceDirs     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L144
            int r8 = r7.length     // Catch: java.lang.Throwable -> L50
            r9 = 0
        L13a:
            if (r9 >= r8) goto L144
            r10 = r7[r9]     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r10)     // Catch: java.lang.Throwable -> L50
            int r9 = r9 + 1
            goto L13a
        L144:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L50
            r8 = 24
            if (r7 < r8) goto L151
            java.lang.String r7 = android.ext.u1.a(r6)     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r7)     // Catch: java.lang.Throwable -> L50
        L151:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r7.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = "/data/data/"
            r7.append(r8)     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = r6.packageName     // Catch: java.lang.Throwable -> L50
            r7.append(r8)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r7)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r7.<init>()     // Catch: java.lang.Throwable -> L50
            r7.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = r6.packageName     // Catch: java.lang.Throwable -> L50
            r7.append(r8)     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = "-1/base.apk"
            r7.append(r8)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r7)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r7.<init>()     // Catch: java.lang.Throwable -> L50
            r7.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r6.packageName     // Catch: java.lang.Throwable -> L50
            r7.append(r6)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "-2/base.apk"
            r7.append(r6)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L50
            a(r11, r3, r2, r6)     // Catch: java.lang.Throwable -> L50
            goto L114
        L19b:
            int r11 = r3.size()     // Catch: java.lang.Throwable -> L50
            if (r11 != 0) goto L1a2
            goto L1af
        L1a2:
            int r11 = r3.size()     // Catch: java.lang.Throwable -> L50
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r11 = r3.toArray(r11)     // Catch: java.lang.Throwable -> L50
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch: java.lang.Throwable -> L50
            r4 = r11
        L1af:
            return r4
        L1b0:
            android.ext.e1.a(r11)
            return r4
    }

    static java.util.ArrayList e(int r6, java.io.File r7, java.lang.String[] r8, java.lang.String r9, boolean r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r8.length
            if (r1 >= r2) goto L33
            r2 = r8[r1]
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = r2.toLowerCase(r3)
            if (r9 == 0) goto L1a
            boolean r4 = r3.startsWith(r9)
            if (r4 != 0) goto L1a
            goto L30
        L1a:
            java.io.File r4 = new java.io.File
            r4.<init>(r7, r2)
            boolean r2 = c(r4)
            if (r6 != 0) goto L28
            if (r2 != 0) goto L28
            goto L30
        L28:
            android.ext.PathSelector$d r5 = new android.ext.PathSelector$d
            r5.<init>(r4, r3, r2)
            r0.add(r5)
        L30:
            int r1 = r1 + 1
            goto L6
        L33:
            int r6 = r0.size()
            r7 = 1
            if (r6 <= r7) goto L8b
            android.ext.PathSelector$a r6 = new android.ext.PathSelector$a
            r6.<init>(r10)
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.IllegalArgumentException -> L6d
            long r7 = -r7
            java.util.Collections.sort(r0, r6)     // Catch: java.lang.IllegalArgumentException -> L6d
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.IllegalArgumentException -> L6d
            long r7 = r7 + r9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L6d
            r6.<init>()     // Catch: java.lang.IllegalArgumentException -> L6d
            java.lang.String r9 = "Sort "
            r6.append(r9)     // Catch: java.lang.IllegalArgumentException -> L6d
            int r9 = r0.size()     // Catch: java.lang.IllegalArgumentException -> L6d
            r6.append(r9)     // Catch: java.lang.IllegalArgumentException -> L6d
            java.lang.String r9 = " in "
            r6.append(r9)     // Catch: java.lang.IllegalArgumentException -> L6d
            r6.append(r7)     // Catch: java.lang.IllegalArgumentException -> L6d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.IllegalArgumentException -> L6d
            android.ext.e1.d(r6)     // Catch: java.lang.IllegalArgumentException -> L6d
            goto L8b
        L6d:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed sort:\n"
            r7.append(r8)
            android.ext.PathSelector$b r8 = new android.ext.PathSelector$b
            r8.<init>(r7)
            java.util.Collections.sort(r0, r8)     // Catch: java.lang.IllegalArgumentException -> L81
            goto L88
        L81:
            java.lang.String r7 = r7.toString()
            android.ext.n0.i(r7)
        L88:
            android.ext.e1.a(r6)
        L8b:
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.PathSelector$c r0 = new android.ext.PathSelector$c
            r1 = 0
            r0.<init>(r2, r1)
            r0.onClick(r3)
            return
    }
}
