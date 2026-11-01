package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class HexConverter extends android.fix.ImageButtonView implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f146a;

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.EditText f149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.text.Editable f152f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.ext.HexConverter f153g;

        /* JADX INFO: renamed from: android.ext.HexConverter$a$a, reason: collision with other inner class name */
        class C0006a implements android.ext.Config.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.Config.p f154a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.HexConverter.a f155b;

            C0006a(android.ext.HexConverter.a r1, android.ext.Config.p r2) {
                    r0 = this;
                    r0.f155b = r1
                    r0.f154a = r2
                    r0.<init>()
                    return
            }

            @Override // android.ext.Config.p.b
            public void a(int r5) {
                    r4 = this;
                    android.ext.Config$p r5 = r4.f154a
                    r0 = 0
                    r5.g(r0)
                    r5 = 1
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    android.ext.HexConverter$a r0 = r4.f155b
                    long r0 = r0.f148b
                    long r2 = android.ext.Config.s
                    long r0 = r0 ^ r2
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    r1 = 0
                    r5[r1] = r0
                    java.lang.String r0 = "%,d"
                    java.lang.String r5 = android.ext.Tools.L1(r0, r5)
                    android.ext.HexConverter$a r0 = r4.f155b     // Catch: java.lang.IndexOutOfBoundsException -> L34
                    android.ext.EditText r1 = r0.f149c     // Catch: java.lang.IndexOutOfBoundsException -> L34
                    int r2 = r0.f150d     // Catch: java.lang.IndexOutOfBoundsException -> L34
                    int r0 = r0.f151e     // Catch: java.lang.IndexOutOfBoundsException -> L34
                    r1.setSelection(r2, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L34
                    android.ext.HexConverter$a r0 = r4.f155b     // Catch: java.lang.IndexOutOfBoundsException -> L34
                    android.text.Editable r1 = r0.f152f     // Catch: java.lang.IndexOutOfBoundsException -> L34
                    int r2 = r0.f150d     // Catch: java.lang.IndexOutOfBoundsException -> L34
                    int r0 = r0.f151e     // Catch: java.lang.IndexOutOfBoundsException -> L34
                    r1.replace(r2, r0, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L34
                    goto L41
                L34:
                    r0 = move-exception
                    java.lang.String r1 = "Failed replace text"
                    android.ext.e1.s(r1, r0)
                    android.ext.HexConverter$a r0 = r4.f155b
                    android.ext.EditText r0 = r0.f149c
                    r0.setText(r5)
                L41:
                    android.ext.HexConverter$a r5 = r4.f155b
                    android.ext.EditText r5 = r5.f149c
                    r5.requestFocus()
                    return
            }
        }

        a(android.ext.HexConverter r1, java.util.ArrayList r2, long r3, android.ext.EditText r5, int r6, int r7, android.text.Editable r8) {
                r0 = this;
                r0.f153g = r1
                r0.f147a = r2
                r0.f148b = r3
                r0.f149c = r5
                r0.f150d = r6
                r0.f151e = r7
                r0.f152f = r8
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                if (r5 < 0) goto L47
                java.util.ArrayList r4 = r3.f147a     // Catch: java.lang.Throwable -> L27
                int r4 = r4.size()     // Catch: java.lang.Throwable -> L27
                if (r5 >= r4) goto L47
                java.util.ArrayList r4 = r3.f147a     // Catch: java.lang.Throwable -> L27
                java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L27
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L27
                if (r4 != 0) goto L29
                r4 = 2131034216(0x7f050068, float:1.7678943E38)
                android.ext.Config$p r4 = android.ext.Config.b(r4)     // Catch: java.lang.Throwable -> L27
                android.ext.HexConverter$a$a r0 = new android.ext.HexConverter$a$a     // Catch: java.lang.Throwable -> L27
                r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L27
                r4.g(r0)     // Catch: java.lang.Throwable -> L27
                r4.b()     // Catch: java.lang.Throwable -> L27
                goto L47
            L27:
                r4 = move-exception
                goto L4d
            L29:
                android.ext.EditText r0 = r3.f149c     // Catch: java.lang.Throwable -> L27 java.lang.IndexOutOfBoundsException -> L3c
                int r1 = r3.f150d     // Catch: java.lang.Throwable -> L27 java.lang.IndexOutOfBoundsException -> L3c
                int r2 = r3.f151e     // Catch: java.lang.Throwable -> L27 java.lang.IndexOutOfBoundsException -> L3c
                r0.setSelection(r1, r2)     // Catch: java.lang.Throwable -> L27 java.lang.IndexOutOfBoundsException -> L3c
                android.text.Editable r0 = r3.f152f     // Catch: java.lang.Throwable -> L27 java.lang.IndexOutOfBoundsException -> L3c
                int r1 = r3.f150d     // Catch: java.lang.Throwable -> L27 java.lang.IndexOutOfBoundsException -> L3c
                int r2 = r3.f151e     // Catch: java.lang.Throwable -> L27 java.lang.IndexOutOfBoundsException -> L3c
                r0.replace(r1, r2, r4)     // Catch: java.lang.Throwable -> L27 java.lang.IndexOutOfBoundsException -> L3c
                goto L47
            L3c:
                r0 = move-exception
                java.lang.String r1 = "Failed replace text"
                android.ext.e1.s(r1, r0)     // Catch: java.lang.Throwable -> L27
                android.ext.EditText r0 = r3.f149c     // Catch: java.lang.Throwable -> L27
                r0.setText(r4)     // Catch: java.lang.Throwable -> L27
            L47:
                android.ext.EditText r4 = r3.f149c     // Catch: java.lang.Throwable -> L27
                r4.requestFocus()     // Catch: java.lang.Throwable -> L27
                goto L61
            L4d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "HexConverter failed with "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                android.ext.e1.g(r5, r4)
            L61:
                return
        }
    }

    public HexConverter(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.f146a = r1
            r0.a()
            return
    }

    private void a() {
            r1 = this;
            r1.setOnClickListener(r1)
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto L12
            r0 = 2130968588(0x7f04000c, float:1.7545834E38)
            r1.setImageResource(r0)
            android.ext.Config.m(r1)
        L12:
            return
    }

    private java.lang.String b(java.lang.String r4, char r5, boolean r6) {
            r3 = this;
            int r0 = r4.length()
            r1 = 0
            if (r6 == 0) goto L19
            r6 = 0
        L8:
            int r2 = r0 + (-2)
            if (r1 >= r2) goto L17
            char r2 = r4.charAt(r1)
            if (r2 != r5) goto L17
            int r1 = r1 + 1
            r6 = r1 & (-2)
            goto L8
        L17:
            r1 = r6
            goto L2b
        L19:
            int r6 = r0 + (-1)
        L1b:
            r2 = 2
            if (r6 < r2) goto L2b
            char r2 = r4.charAt(r6)
            if (r2 != r5) goto L2b
            int r0 = r6 + 1
            r0 = r0 & (-2)
            int r6 = r6 + (-1)
            goto L1b
        L2b:
            java.lang.String r4 = r4.substring(r1, r0)
            return r4
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r23) {
            r22 = this;
            r10 = r22
            java.lang.String r1 = "%,d"
            java.lang.String r11 = "HexConverter: "
            java.lang.Object r0 = r22.getTag()
            boolean r2 = r0 instanceof android.ext.EditText
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L17
            android.ext.EditText r0 = (android.ext.EditText) r0
            r7 = r0
        L15:
            r0 = 0
            goto L45
        L17:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L43
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r2 = r0.length
            if (r2 != r3) goto L43
            r2 = r0[r6]
            boolean r7 = r2 instanceof android.ext.EditText
            if (r7 == 0) goto L43
            android.ext.EditText r2 = (android.ext.EditText) r2
            r0 = r0[r4]
            boolean r7 = r0 instanceof java.lang.Integer
            if (r7 == 0) goto L36
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L34:
            r7 = r2
            goto L45
        L36:
            boolean r7 = r0 instanceof android.ext.SystemSpinnerType
            if (r7 == 0) goto L41
            android.ext.SystemSpinnerType r0 = (android.ext.SystemSpinnerType) r0
            int r0 = r0.getSelected()
            goto L34
        L41:
            r7 = r2
            goto L15
        L43:
            r7 = r5
            goto L15
        L45:
            if (r0 != 0) goto L4c
            r0 = 32
            r2 = 32
            goto L4d
        L4c:
            r2 = r0
        L4d:
            if (r7 != 0) goto L50
            return
        L50:
            r7.requestFocus()
            android.text.Editable r9 = r7.getText()
            int r0 = r7.getSelectionStart()
            int r8 = r7.getSelectionEnd()
            if (r0 < 0) goto L68
            if (r8 < 0) goto L68
            if (r0 != r8) goto L66
            goto L68
        L66:
            r12 = 0
            goto L69
        L68:
            r12 = 1
        L69:
            if (r12 == 0) goto L72
            int r8 = r9.length()
            r13 = r8
            r8 = 0
            goto L74
        L72:
            r13 = r8
            r8 = r0
        L74:
            java.lang.CharSequence r0 = r9.subSequence(r8, r13)     // Catch: java.lang.StringIndexOutOfBoundsException -> L87
            java.lang.String r0 = r0.toString()     // Catch: java.lang.StringIndexOutOfBoundsException -> L87
            java.lang.String r0 = r0.trim()     // Catch: java.lang.StringIndexOutOfBoundsException -> L87
            r21 = r8
            r8 = r0
            r0 = r12
            r12 = r21
            goto Lbb
        L87:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "subSequence fail for "
            r12.append(r14)
            r12.append(r8)
            java.lang.String r8 = ", "
            r12.append(r8)
            r12.append(r13)
            java.lang.String r8 = "; "
            r12.append(r8)
            int r8 = r9.length()
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            android.ext.e1.s(r8, r0)
            int r13 = r9.length()
            java.lang.String r0 = r9.toString()
            r8 = r0
            r0 = 1
            r12 = 0
        Lbb:
            int r14 = r8.length()
            if (r14 != 0) goto Lcc
            r0 = 2131296400(0x7f090090, float:1.8210716E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.ext.Tools.J1(r0)
            return
        Lcc:
            int r14 = android.ext.t1.C(r8)     // Catch: java.lang.Throwable -> L108
            r15 = 3
            r16 = r7
            r6 = 0
            if (r14 == 0) goto L15f
            char r0 = r8.charAt(r4)     // Catch: java.lang.Throwable -> L108
            r14 = 84
            if (r0 != r14) goto L10b
            java.lang.String r0 = r8.substring(r3)     // Catch: java.lang.Throwable -> L108
            java.lang.String r8 = r0.trim()     // Catch: java.lang.Throwable -> L108
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L108
            r0.<init>()     // Catch: java.lang.Throwable -> L108
            int r14 = android.ext.n.p(r5, r6, r8)     // Catch: java.lang.Throwable -> L108
            java.lang.String r14 = java.lang.Integer.toHexString(r14)     // Catch: java.lang.Throwable -> L108
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L108
            java.lang.String r4 = r14.toUpperCase(r4)     // Catch: java.lang.Throwable -> L108
            r0.append(r4)     // Catch: java.lang.Throwable -> L108
            r4 = 104(0x68, float:1.46E-43)
            r0.append(r4)     // Catch: java.lang.Throwable -> L108
        L102:
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L108
        L106:
            r0 = 0
            goto L15f
        L108:
            r0 = move-exception
            goto L43f
        L10b:
            r4 = 65
            if (r0 != r4) goto L106
            char r0 = r8.charAt(r3)     // Catch: java.lang.Throwable -> L108
            r4 = 56
            if (r0 != r4) goto L13b
            java.lang.String r0 = r8.substring(r15)     // Catch: java.lang.Throwable -> L108
            java.lang.String r8 = r0.trim()     // Catch: java.lang.Throwable -> L108
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L108
            r0.<init>()     // Catch: java.lang.Throwable -> L108
            int r4 = android.ext.m.k(r5, r5, r6, r8)     // Catch: java.lang.Throwable -> L108
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.lang.Throwable -> L108
            java.util.Locale r14 = java.util.Locale.US     // Catch: java.lang.Throwable -> L108
            java.lang.String r4 = r4.toUpperCase(r14)     // Catch: java.lang.Throwable -> L108
            r0.append(r4)     // Catch: java.lang.Throwable -> L108
            r4 = 104(0x68, float:1.46E-43)
            r0.append(r4)     // Catch: java.lang.Throwable -> L108
            goto L102
        L13b:
            java.lang.String r0 = r8.substring(r3)     // Catch: java.lang.Throwable -> L108
            java.lang.String r8 = r0.trim()     // Catch: java.lang.Throwable -> L108
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L108
            r0.<init>()     // Catch: java.lang.Throwable -> L108
            int r4 = android.ext.n.n(r5, r6, r8)     // Catch: java.lang.Throwable -> L108
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.lang.Throwable -> L108
            java.util.Locale r14 = java.util.Locale.US     // Catch: java.lang.Throwable -> L108
            java.lang.String r4 = r4.toUpperCase(r14)     // Catch: java.lang.Throwable -> L108
            r0.append(r4)     // Catch: java.lang.Throwable -> L108
            r4 = 104(0x68, float:1.46E-43)
            r0.append(r4)     // Catch: java.lang.Throwable -> L108
            goto L102
        L15f:
            r4 = 58
            r14 = 59
            if (r0 == 0) goto L1ac
            r0 = 7
            char[] r13 = new char[r0]     // Catch: java.lang.Throwable -> L108
            char r18 = android.ext.t1.f1252b     // Catch: java.lang.Throwable -> L108
            r19 = 0
            r13[r19] = r18     // Catch: java.lang.Throwable -> L108
            r17 = 1
            r13[r17] = r4     // Catch: java.lang.Throwable -> L108
            r13[r3] = r14     // Catch: java.lang.Throwable -> L108
            r18 = 126(0x7e, float:1.77E-43)
            r13[r15] = r18     // Catch: java.lang.Throwable -> L108
            r18 = 4
            r19 = 88
            r13[r18] = r19     // Catch: java.lang.Throwable -> L108
            r18 = 5
            r19 = 87
            r13[r18] = r19     // Catch: java.lang.Throwable -> L108
            r18 = 6
            r19 = 81
            r13[r18] = r19     // Catch: java.lang.Throwable -> L108
            r15 = r8
            r8 = 0
        L18c:
            if (r8 >= r0) goto L1a6
            char r0 = r13[r8]     // Catch: java.lang.Throwable -> L19c
            int r0 = r15.indexOf(r0)     // Catch: java.lang.Throwable -> L19c
            if (r0 <= 0) goto L1a0
            r14 = 0
            java.lang.String r15 = r15.substring(r14, r0)     // Catch: java.lang.Throwable -> L19c
            goto L1a0
        L19c:
            r0 = move-exception
            r8 = r15
            goto L43f
        L1a0:
            int r8 = r8 + 1
            r0 = 7
            r14 = 59
            goto L18c
        L1a6:
            int r0 = r15.length()     // Catch: java.lang.Throwable -> L19c
            r8 = r0
            goto L1ae
        L1ac:
            r15 = r8
            r8 = r13
        L1ae:
            android.ext.t1$b r0 = android.ext.t1.x(r15)     // Catch: java.lang.Throwable -> L19c
            long r13 = r0.f1261a     // Catch: java.lang.Throwable -> L19c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19c
            r4.<init>()     // Catch: java.lang.Throwable -> L19c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19c
            r5.<init>()     // Catch: java.lang.Throwable -> L19c
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L19c
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L19c
            r20 = 0
            r0[r20] = r3     // Catch: java.lang.Throwable -> L19c
            java.lang.String r0 = android.ext.Tools.L1(r1, r0)     // Catch: java.lang.Throwable -> L19c
            r4.add(r0)     // Catch: java.lang.Throwable -> L19c
            r5.add(r0)     // Catch: java.lang.Throwable -> L19c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r0.<init>()     // Catch: java.lang.Throwable -> L19c
            java.lang.String r3 = android.ext.c.M(r6, r13, r2)     // Catch: java.lang.Throwable -> L19c
            r6 = 48
            r7 = 1
            java.lang.String r3 = r10.b(r3, r6, r7)     // Catch: java.lang.Throwable -> L19c
            r0.append(r3)     // Catch: java.lang.Throwable -> L19c
            r3 = 104(0x68, float:1.46E-43)
            r0.append(r3)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L19c
            r4.add(r0)     // Catch: java.lang.Throwable -> L19c
            r5.add(r0)     // Catch: java.lang.Throwable -> L19c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r0.<init>()     // Catch: java.lang.Throwable -> L19c
            r6 = 0
            java.lang.String r2 = android.ext.c.P(r6, r13, r2)     // Catch: java.lang.Throwable -> L19c
            r3 = 0
            r6 = 48
            java.lang.String r2 = r10.b(r2, r6, r3)     // Catch: java.lang.Throwable -> L19c
            r0.append(r2)     // Catch: java.lang.Throwable -> L19c
            r2 = 114(0x72, float:1.6E-43)
            r0.append(r2)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L19c
            r4.add(r0)     // Catch: java.lang.Throwable -> L19c
            r5.add(r0)     // Catch: java.lang.Throwable -> L19c
            boolean r0 = r10.f146a     // Catch: java.lang.Throwable -> L19c
            if (r0 == 0) goto L252
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L19c
            long r2 = android.ext.Config.s     // Catch: java.lang.Throwable -> L19c
            long r2 = r2 ^ r13
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L19c
            r3 = 0
            r0[r3] = r2     // Catch: java.lang.Throwable -> L19c
            java.lang.String r0 = android.ext.Tools.L1(r1, r0)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r1 = "XOR %,d = %s"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L19c
            long r6 = android.ext.Config.s     // Catch: java.lang.Throwable -> L19c
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L19c
            r6 = 0
            r3[r6] = r2     // Catch: java.lang.Throwable -> L19c
            r2 = 1
            r3[r2] = r0     // Catch: java.lang.Throwable -> L19c
            java.lang.String r1 = android.ext.Tools.L1(r1, r3)     // Catch: java.lang.Throwable -> L19c
            r4.add(r1)     // Catch: java.lang.Throwable -> L19c
            r5.add(r0)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r0 = "XOR ... = ???"
            r4.add(r0)     // Catch: java.lang.Throwable -> L19c
            r1 = 0
            r5.add(r1)     // Catch: java.lang.Throwable -> L19c
        L252:
            r1 = -1
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L2f5
            byte[] r2 = android.ext.t1.g(r13)     // Catch: java.lang.Throwable -> L19c
            r0 = 8
            r3 = r2[r0]     // Catch: java.lang.Throwable -> L19c
            if (r3 == r1) goto L2f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L296
            r0.<init>()     // Catch: java.lang.Throwable -> L296
            r6 = 58
            r0.append(r6)     // Catch: java.lang.Throwable -> L296
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L296
            int r7 = r3 + 1
            java.lang.String r1 = "UTF-8"
            r10 = 0
            r6.<init>(r2, r10, r7, r1)     // Catch: java.lang.Throwable -> L296
            r0.append(r6)     // Catch: java.lang.Throwable -> L296
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L296
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L296
            r1.<init>()     // Catch: java.lang.Throwable -> L296
            java.lang.String r6 = "UTF-8: "
            r1.append(r6)     // Catch: java.lang.Throwable -> L296
            r1.append(r0)     // Catch: java.lang.Throwable -> L296
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L296
            r4.add(r1)     // Catch: java.lang.Throwable -> L296
            r5.add(r0)     // Catch: java.lang.Throwable -> L296
            goto L2a9
        L296:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r1.<init>()     // Catch: java.lang.Throwable -> L19c
            r1.append(r11)     // Catch: java.lang.Throwable -> L19c
            r1.append(r15)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L19c
            android.ext.e1.g(r1, r0)     // Catch: java.lang.Throwable -> L19c
        L2a9:
            r0 = r3 & 1
            if (r0 != 0) goto L2af
            int r3 = r3 + 1
        L2af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e2
            r0.<init>()     // Catch: java.lang.Throwable -> L2e2
            r1 = 59
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L2e2
            r6 = 1
            int r3 = r3 + r6
            java.lang.String r6 = "UTF-16LE"
            r7 = 0
            r1.<init>(r2, r7, r3, r6)     // Catch: java.lang.Throwable -> L2e2
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e2
            r1.<init>()     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r2 = "UTF-16LE: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2e2
            r1.append(r0)     // Catch: java.lang.Throwable -> L2e2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e2
            r4.add(r1)     // Catch: java.lang.Throwable -> L2e2
            r5.add(r0)     // Catch: java.lang.Throwable -> L2e2
            goto L2f5
        L2e2:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r1.<init>()     // Catch: java.lang.Throwable -> L19c
            r1.append(r11)     // Catch: java.lang.Throwable -> L19c
            r1.append(r15)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L19c
            android.ext.e1.g(r1, r0)     // Catch: java.lang.Throwable -> L19c
        L2f5:
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L19c
            int r0 = r0.H()     // Catch: java.lang.Throwable -> L19c
            r1 = 1
            if (r0 != r1) goto L301
            int r0 = android.ext.AddressArrayAdapter.f23d     // Catch: java.lang.Throwable -> L19c
            goto L312
        L301:
            r1 = 3
            if (r0 != r1) goto L30b
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L19c
            android.ext.n1 r0 = r0.N     // Catch: java.lang.Throwable -> L19c
            int r0 = r0.j     // Catch: java.lang.Throwable -> L19c
            goto L312
        L30b:
            r1 = 2
            if (r0 != r1) goto L311
            int r0 = android.ext.SavedListAdapter.f360c     // Catch: java.lang.Throwable -> L19c
            goto L312
        L311:
            r0 = 0
        L312:
            if (r0 == 0) goto L3f1
            r1 = 0
        L315:
            r2 = 3
            if (r1 >= r2) goto L3f1
            if (r1 != 0) goto L323
            r3 = r0 & 16
            if (r3 != 0) goto L323
        L31e:
            r6 = 59
            r10 = -1
            goto L3ed
        L323:
            r3 = 1
            if (r1 != r3) goto L32b
            r3 = r0 & 32
            if (r3 != 0) goto L32b
            goto L31e
        L32b:
            r3 = 2
            if (r1 != r3) goto L333
            r3 = r0 & 64
            if (r3 != 0) goto L333
            goto L31e
        L333:
            if (r1 != 0) goto L33e
            r3 = 0
            r6 = 0
            java.lang.String r10 = android.ext.n.o(r3, r6, r13)     // Catch: java.lang.Throwable -> L19c
        L33c:
            r2 = 1
            goto L343
        L33e:
            r3 = 0
            r6 = 0
            r10 = r3
            goto L33c
        L343:
            if (r1 != r2) goto L349
            java.lang.String r10 = android.ext.n.q(r3, r6, r13)     // Catch: java.lang.Throwable -> L19c
        L349:
            r2 = 2
            if (r1 != r2) goto L363
            int[] r2 = android.ext.m.d()     // Catch: java.lang.Throwable -> L19c
            int r6 = (int) r13     // Catch: java.lang.Throwable -> L19c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r7.<init>()     // Catch: java.lang.Throwable -> L19c
            r19 = r4
            r3 = 0
            java.lang.StringBuilder r2 = android.ext.m.g(r2, r3, r6, r7)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L19c
            goto L367
        L363:
            r19 = r4
            r3 = 0
        L367:
            if (r10 != 0) goto L36c
            r4 = r19
            goto L31e
        L36c:
            java.lang.String r2 = r10.trim()     // Catch: java.lang.Throwable -> L19c
            r6 = 59
            int r7 = r2.indexOf(r6)     // Catch: java.lang.Throwable -> L19c
            r10 = -1
            if (r7 == r10) goto L383
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r7)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L19c
            goto L384
        L383:
            r3 = 0
        L384:
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L19c
            if (r4 <= 0) goto L3eb
            if (r1 != 0) goto L3a1
            java.lang.String r4 = "ARM (x32)"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r7.<init>()     // Catch: java.lang.Throwable -> L19c
            java.lang.String r3 = "~A "
            r7.append(r3)     // Catch: java.lang.Throwable -> L19c
            r7.append(r2)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L19c
            r3 = 1
            goto L3a3
        L3a1:
            r3 = 1
            r4 = 0
        L3a3:
            if (r1 != r3) goto L3b8
            java.lang.String r4 = "Thumb"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r7.<init>()     // Catch: java.lang.Throwable -> L19c
            java.lang.String r3 = "~T "
            r7.append(r3)     // Catch: java.lang.Throwable -> L19c
            r7.append(r2)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L19c
        L3b8:
            r3 = 2
            if (r1 != r3) goto L3ce
            java.lang.String r4 = "ARM (x64)"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r7.<init>()     // Catch: java.lang.Throwable -> L19c
            java.lang.String r3 = "~A8 "
            r7.append(r3)     // Catch: java.lang.Throwable -> L19c
            r7.append(r2)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L19c
        L3ce:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r3.<init>()     // Catch: java.lang.Throwable -> L19c
            r3.append(r4)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r4 = ": "
            r3.append(r4)     // Catch: java.lang.Throwable -> L19c
            r3.append(r2)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L19c
            r4 = r19
            r4.add(r3)     // Catch: java.lang.Throwable -> L19c
            r5.add(r2)     // Catch: java.lang.Throwable -> L19c
            goto L3ed
        L3eb:
            r4 = r19
        L3ed:
            int r1 = r1 + 1
            goto L315
        L3f1:
            android.ext.HexConverter$a r0 = new android.ext.HexConverter$a     // Catch: java.lang.Throwable -> L19c
            r1 = r0
            r2 = r22
            r3 = r5
            r10 = r4
            r4 = r13
            r6 = r16
            r7 = r12
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L19c
            android.app.AlertDialog$Builder r1 = android.ext.f.b()     // Catch: java.lang.Throwable -> L19c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19c
            r2.<init>()     // Catch: java.lang.Throwable -> L19c
            r2.append(r15)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r3 = " →"
            r2.append(r3)     // Catch: java.lang.Throwable -> L19c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L19c
            android.view.View r2 = android.ext.Tools.h0(r2)     // Catch: java.lang.Throwable -> L19c
            android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)     // Catch: java.lang.Throwable -> L19c
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L19c
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L19c
            java.lang.Object[] r2 = r10.toArray(r2)     // Catch: java.lang.Throwable -> L19c
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2     // Catch: java.lang.Throwable -> L19c
            android.app.AlertDialog$Builder r1 = r1.setItems(r2, r0)     // Catch: java.lang.Throwable -> L19c
            r2 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r2 = android.ext.b2.f(r2)     // Catch: java.lang.Throwable -> L19c
            android.app.AlertDialog$Builder r0 = r1.setNegativeButton(r2, r0)     // Catch: java.lang.Throwable -> L19c
            android.app.AlertDialog r0 = r0.create()     // Catch: java.lang.Throwable -> L19c
            android.ext.f.m(r0)     // Catch: java.lang.Throwable -> L19c
            goto L473
        L43f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296793(0x7f090219, float:1.8211513E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r1.append(r2)
            java.lang.String r2 = "\n\n"
            r1.append(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.Tools.J1(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.ext.e1.g(r1, r0)
        L473:
            return
    }

    public void setUseXor(boolean r1) {
            r0 = this;
            r0.f146a = r1
            return
    }
}
