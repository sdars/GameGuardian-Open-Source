package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c0 extends android.ext.p1 {

    static /* synthetic */ class a {
    }

    private static class b implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.ext.EditText f681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.app.AlertDialog f682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.ext.EditText f683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private android.ext.EditText f684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f687g;

        private b() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f685e = r0
                r2.f686f = r0
                r0 = 0
                r2.f687g = r0
                return
        }

        /* synthetic */ b(android.ext.c0.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private long a(int r4) {
                r3 = this;
                android.ext.EditText r0 = r3.f683c
                java.lang.String r1 = "0"
                android.ext.EditText r2 = r3.f684d
                long r0 = android.ext.MemoryRange.b(r4, r0, r1, r2, r1)
                if (r4 != 0) goto Lf
                r3.f685e = r0
                goto L11
            Lf:
                r3.f686f = r0
            L11:
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r8, int r9) {
                r7 = this;
                java.lang.String r8 = ", "
                android.ext.EditText r9 = r7.f681a
                if (r9 != 0) goto L7
                return
            L7:
                r0 = 0
                r7.a(r0)     // Catch: java.lang.NumberFormatException -> L28
                r0 = 1
                r7.a(r0)     // Catch: java.lang.NumberFormatException -> L28
                android.text.Editable r1 = r9.getText()     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r1 = r1.trim()     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r1 = android.ext.j2.h(r1)     // Catch: java.lang.NumberFormatException -> L28
                int r2 = r1.length()     // Catch: java.lang.NumberFormatException -> L28
                if (r2 != 0) goto L2b
                java.lang.String r1 = "0"
                goto L2b
            L28:
                r8 = move-exception
                goto Lae
            L2b:
                android.ext.t1$b r2 = android.ext.t1.x(r1)     // Catch: java.lang.NumberFormatException -> L3a
                long r2 = r2.f1261a     // Catch: java.lang.NumberFormatException -> L3a
                int r3 = (int) r2     // Catch: java.lang.NumberFormatException -> L3a
                r7.f687g = r3     // Catch: java.lang.NumberFormatException -> L3a
                if (r3 == 0) goto L3c
                android.ext.y0.b(r1, r0)     // Catch: java.lang.NumberFormatException -> L3a
                goto L3c
            L3a:
                r8 = move-exception
                goto Laa
            L3c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L28
                r0.<init>()     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r1 = "Copy: "
                r0.append(r1)     // Catch: java.lang.NumberFormatException -> L28
                int r1 = r7.f687g     // Catch: java.lang.NumberFormatException -> L28
                r0.append(r1)     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r1 = "; "
                r0.append(r1)     // Catch: java.lang.NumberFormatException -> L28
                long r1 = r7.f685e     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r1 = java.lang.Long.toHexString(r1)     // Catch: java.lang.NumberFormatException -> L28
                r0.append(r1)     // Catch: java.lang.NumberFormatException -> L28
                r1 = 45
                r0.append(r1)     // Catch: java.lang.NumberFormatException -> L28
                long r1 = r7.f686f     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r1 = java.lang.Long.toHexString(r1)     // Catch: java.lang.NumberFormatException -> L28
                r0.append(r1)     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L28
                android.ext.e1.d(r0)     // Catch: java.lang.NumberFormatException -> L28
                android.app.AlertDialog r0 = r7.f682b     // Catch: java.lang.NumberFormatException -> L28
                android.ext.Tools.D(r0)     // Catch: java.lang.NumberFormatException -> L28
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L28
                android.ext.f0 r1 = r0.i     // Catch: java.lang.NumberFormatException -> L28
                long r2 = r7.f685e     // Catch: java.lang.NumberFormatException -> L28
                long r4 = r7.f686f     // Catch: java.lang.NumberFormatException -> L28
                int r6 = r7.f687g     // Catch: java.lang.NumberFormatException -> L28
                r1.q(r2, r4, r6)     // Catch: java.lang.NumberFormatException -> L28
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L28
                android.ext.c2 r0 = r0.f216f     // Catch: java.lang.NumberFormatException -> L28
                if (r0 == 0) goto La9
                java.lang.String r1 = "gg.copyMemory("
                r0.write(r1)     // Catch: java.lang.NumberFormatException -> L28
                long r1 = r7.f685e     // Catch: java.lang.NumberFormatException -> L28
                android.ext.Script.Consts.b(r0, r1)     // Catch: java.lang.NumberFormatException -> L28
                r0.write(r8)     // Catch: java.lang.NumberFormatException -> L28
                long r1 = r7.f686f     // Catch: java.lang.NumberFormatException -> L28
                android.ext.Script.Consts.b(r0, r1)     // Catch: java.lang.NumberFormatException -> L28
                r0.write(r8)     // Catch: java.lang.NumberFormatException -> L28
                int r8 = r7.f687g     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch: java.lang.NumberFormatException -> L28
                r0.write(r8)     // Catch: java.lang.NumberFormatException -> L28
                java.lang.String r8 = ")\n"
                r0.write(r8)     // Catch: java.lang.NumberFormatException -> L28
            La9:
                return
            Laa:
                r9.requestFocus()     // Catch: java.lang.NumberFormatException -> L28
                throw r8     // Catch: java.lang.NumberFormatException -> L28
            Lae:
                android.ext.j2.i(r8, r9)
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r9) {
                r8 = this;
                r0 = 0
                if (r9 == 0) goto L12
                java.lang.Object r9 = r9.getTag()
                boolean r9 = r9 instanceof android.ext.p1
                if (r9 == 0) goto Lc
                goto L12
            Lc:
                r9 = -1
                r8.onClick(r0, r9)
                goto Lb8
            L12:
                r9 = 2131099659(0x7f06000b, float:1.7811677E38)
                android.view.View r9 = a.d.f(r9, r0)
                r1 = 2131034217(0x7f050069, float:1.7678945E38)
                android.view.View r1 = r9.findViewById(r1)
                android.ext.EditText r1 = (android.ext.EditText) r1
                r8.f681a = r1
                r2 = 2131034135(0x7f050017, float:1.767878E38)
                android.view.View r2 = r9.findViewById(r2)
                r2.setTag(r1)
                int r2 = r8.f687g
                long r2 = (long) r2
                r4 = 4
                java.lang.String r2 = android.ext.i0.c(r2, r4)
                r1.setText(r2)
                r2 = 1
                r1.setDataType(r2)
                r3 = 2131034320(0x7f0500d0, float:1.7679154E38)
                android.view.View r3 = r9.findViewById(r3)
                android.ext.EditText r3 = (android.ext.EditText) r3
                r8.f683c = r3
                r5 = 2131034377(0x7f050109, float:1.767927E38)
                android.view.View r5 = r9.findViewById(r5)
                r5.setTag(r3)
                r5 = 2131034318(0x7f0500ce, float:1.767915E38)
                android.view.View r5 = r9.findViewById(r5)
                android.ext.EditText r5 = (android.ext.EditText) r5
                r8.f684d = r5
                r6 = 2131034376(0x7f050108, float:1.7679268E38)
                android.view.View r6 = r9.findViewById(r6)
                r6.setTag(r5)
                long r6 = r8.f685e
                java.lang.String r6 = android.ext.c.G(r6, r4)
                r3.setText(r6)
                r3.setDataType(r2)
                long r6 = r8.f686f
                java.lang.String r3 = android.ext.c.G(r6, r4)
                r5.setText(r3)
                r5.setDataType(r2)
                android.app.AlertDialog$Builder r2 = android.ext.f.b()
                r3 = 2131296345(0x7f090059, float:1.8210604E38)
                android.view.View r3 = android.ext.Tools.g0(r3)
                android.app.AlertDialog$Builder r2 = r2.setCustomTitle(r3)
                android.view.View r9 = android.ext.InternalKeyboard.d(r9)
                android.app.AlertDialog$Builder r9 = r2.setView(r9)
                r2 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                android.app.AlertDialog$Builder r9 = r9.setPositiveButton(r2, r8)
                r2 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                android.app.AlertDialog$Builder r9 = r9.setNegativeButton(r2, r0)
                android.app.AlertDialog r9 = r9.create()
                r8.f682b = r9
                android.ext.f.l(r9, r8)
                android.ext.f.n(r9, r1)
            Lb8:
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r3) {
                r2 = this;
                r0 = -1
                r1 = 0
                android.ext.Tools.s1(r3, r0, r1, r2)
                return
        }
    }

    public c0() {
            r2 = this;
            r0 = 2131296345(0x7f090059, float:1.8210604E38)
            r1 = 2130968599(0x7f040017, float:1.7545856E38)
            r2.<init>(r0, r1)
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.c0$b r0 = new android.ext.c0$b
            r1 = 0
            r0.<init>(r1)
            r0.onClick(r3)
            return
    }
}
