package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c1 implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    private static int h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.widget.EditText f688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.widget.RadioGroup f689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.widget.CheckBox f690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.app.AlertDialog f691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.ext.z1.d f692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.ext.h2[] f693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f694g;

    static {
            return
    }

    public c1(android.ext.z1.d r8, android.ext.h2[] r9) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.f694g = r0
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            r2 = 0
            if (r8 != 0) goto L32
            android.app.AlertDialog$Builder r8 = android.ext.f.b()
            r9 = 2131296750(0x7f0901ee, float:1.8211425E38)
            android.view.View r9 = android.ext.Tools.g0(r9)
            android.app.AlertDialog$Builder r8 = r8.setCustomTitle(r9)
            r9 = 2131296806(0x7f090226, float:1.821154E38)
            java.lang.String r9 = android.ext.b2.f(r9)
            android.app.AlertDialog$Builder r8 = r8.setMessage(r9)
            java.lang.String r9 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r9, r2)
            android.ext.f.o(r8)
            return
        L32:
            if (r9 == 0) goto L52
            int r3 = r9.length
            if (r3 != 0) goto L52
            android.app.AlertDialog$Builder r8 = android.ext.f.b()
            r9 = 2131296403(0x7f090093, float:1.8210722E38)
            java.lang.String r9 = android.ext.b2.f(r9)
            android.app.AlertDialog$Builder r8 = r8.setMessage(r9)
            java.lang.String r9 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r9, r2)
            android.ext.f.o(r8)
            return
        L52:
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.f0 r1 = r1.i
            r1.W()
            r7.f692e = r8
            r7.f693f = r9
            r8 = 1
            if (r9 != 0) goto L62
            r9 = 1
            goto L63
        L62:
            r9 = 0
        L63:
            r1 = 2131099669(0x7f060015, float:1.7811698E38)
            android.view.View r1 = a.d.f(r1, r2)
            r3 = 2131034328(0x7f0500d8, float:1.767917E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r9 == 0) goto L79
            r4 = 2131296751(0x7f0901ef, float:1.8211428E38)
            goto L7c
        L79:
            r4 = 2131296919(0x7f090297, float:1.8211768E38)
        L7c:
            java.lang.String r4 = android.ext.b2.f(r4)
            r3.setText(r4)
            r3 = 2131034251(0x7f05008b, float:1.7679014E38)
            android.view.View r3 = r1.findViewById(r3)
            android.ext.EditTextPath r3 = (android.ext.EditTextPath) r3
            r7.f688a = r3
            java.lang.String r4 = "-list"
            java.lang.String r5 = ".txt"
            java.lang.String r6 = "save-path"
            java.lang.String r4 = android.ext.v1.a(r6, r4, r5)
            r3.setText(r4)
            r4 = 4
            r3.setDataType(r4)
            if (r9 == 0) goto La2
            goto La3
        La2:
            r8 = 2
        La3:
            r3.setPathType(r8)
            r8 = 2131034354(0x7f0500f2, float:1.7679223E38)
            android.view.View r8 = r1.findViewById(r8)
            r8.setTag(r3)
            if (r9 == 0) goto Lbd
            r8 = 2131034309(0x7f0500c5, float:1.7679132E38)
        Lb5:
            android.view.View r8 = r1.findViewById(r8)
            r8.setVisibility(r0)
            goto Lc1
        Lbd:
            r8 = 2131034386(0x7f050112, float:1.7679288E38)
            goto Lb5
        Lc1:
            r8 = 2131034330(0x7f0500da, float:1.7679175E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.RadioGroup r8 = (android.widget.RadioGroup) r8
            r7.f689b = r8
            int r4 = android.ext.c1.h
            if (r4 <= 0) goto Ld3
            r8.check(r4)
        Ld3:
            r8 = 2131034331(0x7f0500db, float:1.7679177E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.RadioButton r8 = (android.widget.RadioButton) r8
            r4 = 2131296745(0x7f0901e9, float:1.8211415E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            r8.setText(r4)
            r8 = 2131034332(0x7f0500dc, float:1.7679179E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.RadioButton r8 = (android.widget.RadioButton) r8
            r4 = 2131296746(0x7f0901ea, float:1.8211417E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            r8.setText(r4)
            r8 = 2131034333(0x7f0500dd, float:1.767918E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.RadioButton r8 = (android.widget.RadioButton) r8
            r4 = 2131296747(0x7f0901eb, float:1.821142E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            r8.setText(r4)
            r8 = 2131034130(0x7f050012, float:1.7678769E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.CheckBox r8 = (android.widget.CheckBox) r8
            r7.f690c = r8
            android.ext.Tools.r1(r8)
            r8.setOnLongClickListener(r7)
            android.app.AlertDialog$Builder r8 = android.ext.f.b()
            android.view.View r0 = android.ext.InternalKeyboard.e(r1, r0)
            android.app.AlertDialog$Builder r8 = r8.setView(r0)
            if (r9 == 0) goto L12f
            r0 = 2131296744(0x7f0901e8, float:1.8211413E38)
            goto L132
        L12f:
            r0 = 2131296917(0x7f090295, float:1.8211764E38)
        L132:
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r8 = r8.setPositiveButton(r0, r7)
            r0 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r0, r2)
            if (r9 == 0) goto L15b
            android.ext.MainService r9 = android.ext.MainService.instance
            android.ext.SavedListAdapter r9 = r9.t0
            int r9 = r9.getCount()
            if (r9 == 0) goto L15b
            r9 = 2131296283(0x7f09001b, float:1.8210478E38)
            java.lang.String r9 = android.ext.b2.f(r9)
            r8.setNeutralButton(r9, r7)
        L15b:
            android.app.AlertDialog r8 = r8.create()
            r7.f691d = r8
            android.ext.f.l(r8, r7)
            android.ext.f.k(r8, r7)
            android.ext.f.n(r8, r3)
            return
    }

    private static java.lang.String a(java.lang.String r2) {
            r0 = 124(0x7c, float:1.74E-43)
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    public static void b(int r2, java.lang.String r3, int r4) {
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto Lc
            return
        Lc:
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.FileReader r1 = new java.io.FileReader
            r1.<init>(r0)
            r3.<init>(r1)
            c(r3, r2, r4)
            return
    }

    public static void c(java.io.BufferedReader r28, int r29, int r30) {
            r0 = r30 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            r0 = r30 & 2
            if (r0 == 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.SavedListAdapter r5 = r0.t0
            r0 = r30 & 8
            if (r0 != 0) goto L1b
            r5.c()
        L1b:
            r0 = 0
            r6 = 0
        L1d:
            r7 = 4
            java.lang.String r8 = r28.readLine()     // Catch: java.lang.OutOfMemoryError -> L57
            if (r8 == 0) goto L226
            int r9 = r0 + 1
            r10 = 39
            if (r9 != r2) goto L5a
            int r0 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Throwable -> L37
            r11 = r29
            if (r0 != r11) goto L34
            r6 = 1
            goto L35
        L34:
            r6 = 0
        L35:
            r0 = r9
            goto L1d
        L37:
            r0 = move-exception
            r11 = r29
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.OutOfMemoryError -> L57
            r0.<init>()     // Catch: java.lang.OutOfMemoryError -> L57
            java.lang.String r13 = "Failed parse pid: '"
            r0.append(r13)     // Catch: java.lang.OutOfMemoryError -> L57
            r0.append(r8)     // Catch: java.lang.OutOfMemoryError -> L57
            r0.append(r10)     // Catch: java.lang.OutOfMemoryError -> L57
            java.lang.String r0 = r0.toString()     // Catch: java.lang.OutOfMemoryError -> L57
            android.ext.e1.s(r0, r12)     // Catch: java.lang.OutOfMemoryError -> L57
        L52:
            r20 = r3
            r3 = r9
            goto L21b
        L57:
            r0 = move-exception
            goto L221
        L5a:
            r11 = r29
            java.lang.String r0 = "\\|"
            java.lang.String[] r0 = r8.split(r0)     // Catch: java.lang.OutOfMemoryError -> L57
            int r12 = r0.length     // Catch: java.lang.OutOfMemoryError -> L57
            java.lang.String r13 = "Failed parse line: '"
            r14 = 10
            if (r12 >= r14) goto L85
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.OutOfMemoryError -> L57
            r10.<init>()     // Catch: java.lang.OutOfMemoryError -> L57
            r10.append(r13)     // Catch: java.lang.OutOfMemoryError -> L57
            r10.append(r8)     // Catch: java.lang.OutOfMemoryError -> L57
            java.lang.String r8 = "' "
            r10.append(r8)     // Catch: java.lang.OutOfMemoryError -> L57
            int r0 = r0.length     // Catch: java.lang.OutOfMemoryError -> L57
            r10.append(r0)     // Catch: java.lang.OutOfMemoryError -> L57
            java.lang.String r0 = r10.toString()     // Catch: java.lang.OutOfMemoryError -> L57
            android.ext.e1.p(r0)     // Catch: java.lang.OutOfMemoryError -> L57
            goto L52
        L85:
            android.ext.h2 r12 = new android.ext.h2     // Catch: java.lang.Throwable -> Lac
            r15 = r0[r2]     // Catch: java.lang.Throwable -> Lac
            r2 = 16
            long r16 = android.ext.t1.r(r15, r2)     // Catch: java.lang.Throwable -> Lac
            r15 = 3
            r15 = r0[r15]     // Catch: java.lang.Throwable -> Lac
            long r18 = android.ext.t1.r(r15, r2)     // Catch: java.lang.Throwable -> Lac
            r15 = 2
            r15 = r0[r15]     // Catch: java.lang.Throwable -> Lac
            int r20 = java.lang.Integer.parseInt(r15, r2)     // Catch: java.lang.Throwable -> Lac
            r21 = r0[r1]     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto Lb4
            r15 = r0[r7]     // Catch: java.lang.Throwable -> Lac
            java.lang.String r7 = "1"
            boolean r7 = r15.equals(r7)     // Catch: java.lang.Throwable -> Lac
            r22 = r7
            goto Lb6
        Lac:
            r0 = move-exception
            r20 = r3
            r22 = r8
            r3 = r9
            goto L202
        Lb4:
            r22 = 0
        Lb6:
            r7 = 5
            r7 = r0[r7]     // Catch: java.lang.Throwable -> Lac
            byte r23 = java.lang.Byte.parseByte(r7)     // Catch: java.lang.Throwable -> Lac
            r7 = 6
            r7 = r0[r7]     // Catch: java.lang.Throwable -> Lac
            long r24 = android.ext.t1.r(r7, r2)     // Catch: java.lang.Throwable -> Lac
            r7 = 7
            r7 = r0[r7]     // Catch: java.lang.Throwable -> Lac
            long r26 = android.ext.t1.r(r7, r2)     // Catch: java.lang.Throwable -> Lac
            r15 = r12
            r15.<init>(r16, r18, r20, r21, r22, r23, r24, r26)     // Catch: java.lang.Throwable -> Lac
            r7 = r0[r14]     // Catch: java.lang.Throwable -> Lac
            long r14 = android.ext.t1.r(r7, r2)     // Catch: java.lang.Throwable -> Lac
            if (r6 != 0) goto L1f1
            long r10 = r12.f672a     // Catch: java.lang.Throwable -> L172
            android.ext.RegionList$b r7 = android.ext.RegionList.b(r10)     // Catch: java.lang.Throwable -> L172
            java.lang.String r10 = "; "
            r11 = 9
            r16 = 8
            if (r7 == 0) goto L17b
            java.lang.String r1 = r7.f()     // Catch: java.lang.Throwable -> L172
            r2 = r0[r16]     // Catch: java.lang.Throwable -> L172
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L172
            if (r1 == 0) goto L17b
            java.lang.String r1 = r7.a()     // Catch: java.lang.Throwable -> L172
            r2 = r0[r11]     // Catch: java.lang.Throwable -> L172
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L172
            if (r1 == 0) goto L17b
            long r1 = r12.f672a     // Catch: java.lang.Throwable -> L172
            r20 = r12
            long r11 = r7.f356b     // Catch: java.lang.Throwable -> L172
            long r11 = r11 + r14
            int r22 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r22 == 0) goto L10c
            r2 = r20
            goto L17c
        L10c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L172
            r1.<init>()     // Catch: java.lang.Throwable -> L172
            java.lang.String r2 = "ASLR: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L172
            r2 = r20
            long r11 = r2.f672a     // Catch: java.lang.Throwable -> L172
            java.lang.String r11 = java.lang.Long.toHexString(r11)     // Catch: java.lang.Throwable -> L172
            r1.append(r11)     // Catch: java.lang.Throwable -> L172
            java.lang.String r11 = " ??? "
            r1.append(r11)     // Catch: java.lang.Throwable -> L172
            long r11 = r7.f356b     // Catch: java.lang.Throwable -> L172
            long r11 = r11 + r14
            java.lang.String r11 = java.lang.Long.toHexString(r11)     // Catch: java.lang.Throwable -> L172
            r1.append(r11)     // Catch: java.lang.Throwable -> L172
            r1.append(r10)     // Catch: java.lang.Throwable -> L172
            r11 = r0[r16]     // Catch: java.lang.Throwable -> L172
            r1.append(r11)     // Catch: java.lang.Throwable -> L172
            r11 = 32
            r1.append(r11)     // Catch: java.lang.Throwable -> L172
            r12 = 9
            r0 = r0[r12]     // Catch: java.lang.Throwable -> L172
            r1.append(r0)     // Catch: java.lang.Throwable -> L172
            r1.append(r11)     // Catch: java.lang.Throwable -> L172
            java.lang.String r0 = java.lang.Long.toHexString(r14)     // Catch: java.lang.Throwable -> L172
            r1.append(r0)     // Catch: java.lang.Throwable -> L172
            r1.append(r10)     // Catch: java.lang.Throwable -> L172
            java.lang.String r0 = r7.f()     // Catch: java.lang.Throwable -> L172
            r1.append(r0)     // Catch: java.lang.Throwable -> L172
            r0 = 32
            r1.append(r0)     // Catch: java.lang.Throwable -> L172
            java.lang.String r0 = r7.a()     // Catch: java.lang.Throwable -> L172
            r1.append(r0)     // Catch: java.lang.Throwable -> L172
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L172
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L172
        L16b:
            r20 = r3
            r22 = r8
            r3 = r9
            goto L1f7
        L172:
            r0 = move-exception
            r20 = r3
        L175:
            r22 = r8
            r3 = r9
        L178:
            r1 = 0
            goto L202
        L17b:
            r2 = r12
        L17c:
            r1 = r0[r16]     // Catch: java.lang.Throwable -> L172
            r7 = 9
            r11 = r0[r7]     // Catch: java.lang.Throwable -> L172
            android.ext.RegionList$b r1 = android.ext.RegionList.c(r1, r11, r14)     // Catch: java.lang.Throwable -> L172
            if (r1 == 0) goto L16b
            long r11 = r1.f356b     // Catch: java.lang.Throwable -> L172
            long r11 = r11 + r14
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L172
            r7.<init>()     // Catch: java.lang.Throwable -> L172
            r20 = r3
            java.lang.String r3 = "Fix: "
            r7.append(r3)     // Catch: java.lang.Throwable -> L1ef
            r22 = r8
            r3 = r9
            long r8 = r2.f672a     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r8 = java.lang.Long.toHexString(r8)     // Catch: java.lang.Throwable -> L1ed
            r7.append(r8)     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r8 = " -> "
            r7.append(r8)     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r8 = java.lang.Long.toHexString(r11)     // Catch: java.lang.Throwable -> L1ed
            r7.append(r8)     // Catch: java.lang.Throwable -> L1ed
            r7.append(r10)     // Catch: java.lang.Throwable -> L1ed
            r8 = r0[r16]     // Catch: java.lang.Throwable -> L1ed
            r7.append(r8)     // Catch: java.lang.Throwable -> L1ed
            r8 = 32
            r7.append(r8)     // Catch: java.lang.Throwable -> L1ed
            r9 = 9
            r0 = r0[r9]     // Catch: java.lang.Throwable -> L1ed
            r7.append(r0)     // Catch: java.lang.Throwable -> L1ed
            r7.append(r8)     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r0 = java.lang.Long.toHexString(r14)     // Catch: java.lang.Throwable -> L1ed
            r7.append(r0)     // Catch: java.lang.Throwable -> L1ed
            r7.append(r10)     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r0 = r1.f()     // Catch: java.lang.Throwable -> L1ed
            r7.append(r0)     // Catch: java.lang.Throwable -> L1ed
            r0 = 32
            r7.append(r0)     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r0 = r1.a()     // Catch: java.lang.Throwable -> L1ed
            r7.append(r0)     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L1ed
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L1ed
            r2.f672a = r11     // Catch: java.lang.Throwable -> L1ed
            goto L1f7
        L1ed:
            r0 = move-exception
            goto L178
        L1ef:
            r0 = move-exception
            goto L175
        L1f1:
            r20 = r3
            r22 = r8
            r3 = r9
            r2 = r12
        L1f7:
            if (r4 == 0) goto L1fc
            r2.a()     // Catch: java.lang.Throwable -> L1ed
        L1fc:
            r1 = 0
            r5.b(r2, r1, r1)     // Catch: java.lang.Throwable -> L201
            goto L21b
        L201:
            r0 = move-exception
        L202:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.OutOfMemoryError -> L57
            r2.<init>()     // Catch: java.lang.OutOfMemoryError -> L57
            r2.append(r13)     // Catch: java.lang.OutOfMemoryError -> L57
            r7 = r22
            r2.append(r7)     // Catch: java.lang.OutOfMemoryError -> L57
            r7 = 39
            r2.append(r7)     // Catch: java.lang.OutOfMemoryError -> L57
            java.lang.String r2 = r2.toString()     // Catch: java.lang.OutOfMemoryError -> L57
            android.ext.e1.s(r2, r0)     // Catch: java.lang.OutOfMemoryError -> L57
        L21b:
            r0 = r3
            r3 = r20
            r2 = 1
            goto L1d
        L221:
            java.lang.String r1 = "OOM on load list"
            android.ext.e1.s(r1, r0)
        L226:
            r28.close()
            r5.notifyDataSetChanged()
            r5.i()
            if (r6 != 0) goto L25f
            r1 = 4
            r0 = r30 & 4
            if (r0 != 0) goto L25f
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r1 = 2131296750(0x7f0901ee, float:1.8211425E38)
            android.view.View r1 = android.ext.Tools.g0(r1)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
            r1 = 2131296753(0x7f0901f1, float:1.8211432E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            android.ext.f.o(r0)
        L25f:
            return
    }

    public static void d(int r1, android.ext.h2[] r2, java.lang.String r3, int r4) {
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            java.io.File r3 = r0.getParentFile()
            if (r3 == 0) goto Le
            r3.mkdirs()
        Le:
            java.io.FileWriter r3 = new java.io.FileWriter
            r3.<init>(r0)
            e(r3, r1, r2, r4)
            return
    }

    public static void e(java.io.Writer r11, int r12, android.ext.h2[] r13, int r14) {
            r0 = 1
            r14 = r14 & r0
            r1 = 0
            if (r14 == 0) goto L6
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r14 = "\n"
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r14)
            java.lang.String r12 = r2.toString()
            r11.write(r12)
        L1d:
            int r12 = r13.length
        L1e:
            if (r1 >= r12) goto L116
            r2 = r13[r1]
            if (r2 != 0) goto L26
            goto L112
        L26:
            long r3 = r2.f672a
            android.ext.RegionList$b r3 = android.ext.RegionList.b(r3)
            if (r3 == 0) goto L47
            java.lang.String r4 = r3.a()
            int r4 = r4.length()
            if (r4 != 0) goto L39
            goto L47
        L39:
            java.lang.String r4 = r3.f()
            java.lang.String r5 = r3.a()
            long r6 = r2.f672a
            long r8 = r3.f356b
            long r6 = r6 - r8
            goto L4c
        L47:
            java.lang.String r4 = ""
            r6 = 0
            r5 = r4
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            if (r0 == 0) goto L8b
            long r4 = r2.f672a
            java.lang.CharSequence r4 = android.ext.RegionList.a(r4)
            r3.append(r4)
            java.lang.String r4 = "; "
            r3.append(r4)
            java.lang.String r5 = r2.F()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = r2.b0()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = r2.J()
            r3.append(r5)
            r3.append(r4)
            java.lang.CharSequence r2 = r2.u()
            r3.append(r2)
        L86:
            r3.append(r14)
            goto L10b
        L8b:
            java.lang.String r8 = r2.b0()
            java.lang.String r8 = a(r8)
            r3.append(r8)
            r8 = 124(0x7c, float:1.74E-43)
            r3.append(r8)
            long r9 = r2.f672a
            java.lang.String r9 = java.lang.Long.toHexString(r9)
            r3.append(r9)
            r3.append(r8)
            int r9 = r2.f674c
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r3.append(r9)
            r3.append(r8)
            long r9 = r2.f673b
            java.lang.String r9 = java.lang.Long.toHexString(r9)
            r3.append(r9)
            r3.append(r8)
            boolean r9 = r2.m
            if (r9 == 0) goto Lc6
            r9 = 49
            goto Lc8
        Lc6:
            r9 = 48
        Lc8:
            r3.append(r9)
            r3.append(r8)
            byte r9 = r2.n
            r3.append(r9)
            r3.append(r8)
            long r9 = r2.o
            java.lang.String r9 = java.lang.Long.toHexString(r9)
            r3.append(r9)
            r3.append(r8)
            long r9 = r2.p
            java.lang.String r2 = java.lang.Long.toHexString(r9)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = a(r4)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = a(r5)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = java.lang.Long.toHexString(r6)
            r3.append(r2)
            goto L86
        L10b:
            java.lang.String r2 = r3.toString()
            r11.write(r2)
        L112:
            int r1 = r1 + 1
            goto L1e
        L116:
            r11.close()
            return
    }

    private static boolean f(java.lang.String r24) {
            r1 = r24
            r2 = 0
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Exception -> Lf5
            android.content.SharedPreferences r3 = r0.a(r1, r2)     // Catch: java.lang.Exception -> Lf5
            java.lang.String r0 = "size"
            int r4 = r3.getInt(r0, r2)     // Catch: java.lang.Exception -> Lf5
            android.ext.h2[] r5 = new android.ext.h2[r4]     // Catch: java.lang.Exception -> Lf5
            r6 = 0
        L12:
            r7 = 0
            if (r6 >= r4) goto Lf7
            android.ext.h2 r0 = new android.ext.h2     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r8.<init>()     // Catch: java.lang.Exception -> Ldc
            r8.append(r6)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r9 = "-address"
            r8.append(r9)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldc
            r9 = 0
            long r11 = r3.getLong(r8, r9)     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r8.<init>()     // Catch: java.lang.Exception -> Ldc
            r8.append(r6)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r13 = "-data"
            r8.append(r13)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldc
            long r13 = r3.getLong(r8, r9)     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r8.<init>()     // Catch: java.lang.Exception -> Ldc
            r8.append(r6)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r15 = "-flags"
            r8.append(r15)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldc
            r15 = 4
            int r15 = r3.getInt(r8, r15)     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r8.<init>()     // Catch: java.lang.Exception -> Ldc
            r8.append(r6)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r9 = "-name"
            r8.append(r9)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldc
            java.lang.String r7 = r3.getString(r8, r7)     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r8.<init>()     // Catch: java.lang.Exception -> Ldc
            r8.append(r6)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r9 = "-freeze"
            r8.append(r9)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldc
            boolean r18 = r3.getBoolean(r8, r2)     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r8.<init>()     // Catch: java.lang.Exception -> Ldc
            r8.append(r6)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r9 = "-freezeType"
            r8.append(r9)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldc
            int r8 = r3.getInt(r8, r2)     // Catch: java.lang.Exception -> Ldc
            byte r9 = (byte) r8     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r8.<init>()     // Catch: java.lang.Exception -> Ldc
            r8.append(r6)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r10 = "-freezeFrom"
            r8.append(r10)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldc
            r19 = r9
            r9 = 0
            long r20 = r3.getLong(r8, r9)     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r8.<init>()     // Catch: java.lang.Exception -> Ldc
            r8.append(r6)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r9 = "-freezeTo"
            r8.append(r9)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Ldc
            r9 = 0
            long r22 = r3.getLong(r8, r9)     // Catch: java.lang.Exception -> Ldc
            r8 = r0
            r16 = r19
            r9 = r11
            r11 = r13
            r13 = r15
            r14 = r7
            r15 = r18
            r17 = r20
            r19 = r22
            r8.<init>(r9, r11, r13, r14, r15, r16, r17, r19)     // Catch: java.lang.Exception -> Ldc
            r5[r6] = r0     // Catch: java.lang.Exception -> Ldc
            goto Lf1
        Ldc:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf5
            r7.<init>()     // Catch: java.lang.Exception -> Lf5
            java.lang.String r8 = "Failed load item: "
            r7.append(r8)     // Catch: java.lang.Exception -> Lf5
            r7.append(r6)     // Catch: java.lang.Exception -> Lf5
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> Lf5
            android.ext.e1.s(r7, r0)     // Catch: java.lang.Exception -> Lf5
        Lf1:
            int r6 = r6 + 1
            goto L12
        Lf5:
            r0 = move-exception
            goto L14b
        Lf7:
            java.lang.String r0 = "pid"
            int r3 = r3.getInt(r0, r2)     // Catch: java.lang.Exception -> Lf5
            r4 = 0
        Lfe:
            r0 = 10
            if (r4 >= r0) goto L150
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lf5
            java.lang.String r6 = "save-path"
            java.lang.String r6 = android.ext.v1.b(r7, r6)     // Catch: java.lang.Exception -> Lf5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf5
            r8.<init>()     // Catch: java.lang.Exception -> Lf5
            r8.append(r1)     // Catch: java.lang.Exception -> Lf5
            if (r4 != 0) goto L117
            java.lang.String r9 = ""
            goto L11d
        L117:
            int r9 = r4 + 45
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> Lf5
        L11d:
            r8.append(r9)     // Catch: java.lang.Exception -> Lf5
            java.lang.String r9 = ".txt"
            r8.append(r9)     // Catch: java.lang.Exception -> Lf5
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Lf5
            r0.<init>(r6, r8)     // Catch: java.lang.Exception -> Lf5
            boolean r6 = r0.exists()     // Catch: java.lang.Exception -> Lf5
            if (r6 == 0) goto L133
            goto L148
        L133:
            java.lang.String r6 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> Lf5 java.io.IOException -> L142
            d(r3, r5, r6, r2)     // Catch: java.lang.Exception -> Lf5 java.io.IOException -> L142
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> Lf5 java.io.IOException -> L142
            if (r0 == 0) goto L148
            r0 = 1
            return r0
        L142:
            r0 = move-exception
            java.lang.String r6 = "Failed save saved list"
            android.ext.e1.s(r6, r0)     // Catch: java.lang.Exception -> Lf5
        L148:
            int r4 = r4 + 1
            goto Lfe
        L14b:
            java.lang.String r1 = "Failed load saved list"
            android.ext.e1.s(r1, r0)
        L150:
            return r2
    }

    public static void g() {
            java.lang.String r0 = "tmp"
            java.io.File r0 = android.ext.x2.g(r0)
            java.io.File r0 = r0.getParentFile()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L11
            return
        L11:
            java.lang.String[] r1 = r0.list()
            if (r1 != 0) goto L18
            return
        L18:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L1b:
            if (r4 >= r2) goto L8e
            r5 = r1[r4]
            if (r5 == 0) goto L8b
            java.lang.String r6 = "_preferences.xml"
            boolean r6 = r5.endsWith(r6)
            if (r6 != 0) goto L8b
            java.lang.String r6 = ".xml"
            boolean r6 = r5.endsWith(r6)
            if (r6 != 0) goto L32
            goto L8b
        L32:
            int r6 = r5.length()
            int r6 = r6 + (-4)
            java.lang.String r6 = r5.substring(r3, r6)
            java.lang.String r7 = android.ext.MainService.G0
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L8b
            java.lang.String r7 = "DefaultStorage"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4d
            goto L8b
        L4d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Try convert '"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r8 = "'."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.ext.e1.d(r7)
            boolean r7 = f(r6)
            if (r7 == 0) goto L8b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "All ok - remove '"
            r7.append(r9)
            r7.append(r6)
            r7.append(r8)
            java.lang.String r6 = r7.toString()
            android.ext.e1.d(r6)
            java.io.File r6 = new java.io.File
            r6.<init>(r0, r5)
            r6.delete()
        L8b:
            int r4 = r4 + 1
            goto L1b
        L8e:
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            android.widget.Button r1 = r1.getButton(r2)
            if (r1 == 0) goto Lb
            r0.onClick(r1)
        Lb:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r6) {
            r5 = this;
            android.widget.EditText r0 = r5.f688a
            if (r6 == 0) goto L100
            if (r0 != 0) goto L8
            goto L100
        L8:
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.ext.Tools.f1(r0)
            if (r1 != 0) goto L1b
            return
        L1b:
            android.ext.h2[] r1 = r5.f693f
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L2d
            boolean r4 = android.ext.Tools.a1(r0)
            if (r4 != 0) goto L2d
            return
        L2d:
            r4 = 4
            android.ext.y0.b(r0, r4)
            java.lang.String r4 = ", "
            if (r1 == 0) goto L84
            android.ext.MainService r1 = android.ext.MainService.instance
            r1.Q()
            android.widget.RadioGroup r1 = r5.f689b
            if (r1 != 0) goto L3f
            return
        L3f:
            int r1 = r1.getCheckedRadioButtonId()
            android.ext.c1.h = r1
            switch(r1) {
                case 2131034332: goto L4a;
                case 2131034333: goto L4b;
                default: goto L48;
            }
        L48:
            r2 = 3
            goto L4b
        L4a:
            r2 = 2
        L4b:
            java.lang.Object r6 = r6.getTag()
            boolean r6 = r6 instanceof java.lang.Integer
            if (r6 == 0) goto L55
            r2 = r2 | 8
        L55:
            android.ext.z1$d r6 = r5.f692e     // Catch: java.io.IOException -> L80
            int r6 = r6.f1437f     // Catch: java.io.IOException -> L80
            b(r6, r0, r2)     // Catch: java.io.IOException -> L80
            android.app.AlertDialog r6 = r5.f691d     // Catch: java.io.IOException -> L80
            android.ext.Tools.D(r6)     // Catch: java.io.IOException -> L80
            android.ext.MainService r6 = android.ext.MainService.instance     // Catch: java.io.IOException -> L80
            android.ext.c2 r6 = r6.f216f     // Catch: java.io.IOException -> L80
            if (r6 == 0) goto L100
            java.lang.String r1 = "gg.loadList("
            r6.write(r1)     // Catch: java.io.IOException -> L80
            android.ext.Script.Consts.d(r6, r0)     // Catch: java.io.IOException -> L80
            r6.write(r4)     // Catch: java.io.IOException -> L80
            android.ext.Script$Consts r0 = r6.f697c     // Catch: java.io.IOException -> L80
            android.ext.Script$Const[] r0 = r0.f375e     // Catch: java.io.IOException -> L80
            android.ext.Script.Consts.a(r6, r0, r2)     // Catch: java.io.IOException -> L80
            java.lang.String r0 = ")\n"
            r6.write(r0)     // Catch: java.io.IOException -> L80
            goto L100
        L80:
            r6 = move-exception
            java.lang.String r0 = "Failed load list"
            goto Lf6
        L84:
            android.widget.CheckBox r6 = r5.f690c
            if (r6 != 0) goto L89
            return
        L89:
            boolean r6 = r6.isChecked()     // Catch: java.io.IOException -> Lc2
            android.ext.z1$d r1 = r5.f692e     // Catch: java.io.IOException -> Lc2
            int r1 = r1.f1437f     // Catch: java.io.IOException -> Lc2
            android.ext.h2[] r2 = r5.f693f     // Catch: java.io.IOException -> Lc2
            d(r1, r2, r0, r6)     // Catch: java.io.IOException -> Lc2
            android.app.AlertDialog r1 = r5.f691d     // Catch: java.io.IOException -> Lc2
            android.ext.Tools.D(r1)     // Catch: java.io.IOException -> Lc2
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.io.IOException -> Lc2
            android.ext.c2 r1 = r1.f216f     // Catch: java.io.IOException -> Lc2
            if (r1 == 0) goto L100
            boolean r2 = r5.f694g     // Catch: java.io.IOException -> Lc2
            if (r2 == 0) goto Lc4
            java.lang.String r2 = "\nlocal prev = gg.getListItems()\n"
            r1.write(r2)     // Catch: java.io.IOException -> Lc2
            java.lang.String r2 = "gg.clearList()\n"
            r1.write(r2)     // Catch: java.io.IOException -> Lc2
            java.lang.String r2 = "local t = "
            r1.write(r2)     // Catch: java.io.IOException -> Lc2
            android.ext.b0.n(r1, r3)     // Catch: java.io.IOException -> Lc2
            java.lang.String r2 = "gg.addListItems(t)\n"
            r1.write(r2)     // Catch: java.io.IOException -> Lc2
            java.lang.String r2 = "t = nil\n"
            r1.write(r2)     // Catch: java.io.IOException -> Lc2
            goto Lc4
        Lc2:
            r6 = move-exception
            goto Lf4
        Lc4:
            java.lang.String r2 = "gg.saveList("
            r1.write(r2)     // Catch: java.io.IOException -> Lc2
            android.ext.Script.Consts.d(r1, r0)     // Catch: java.io.IOException -> Lc2
            r1.write(r4)     // Catch: java.io.IOException -> Lc2
            android.ext.Script$Consts r0 = r1.f697c     // Catch: java.io.IOException -> Lc2
            android.ext.Script$Const[] r0 = r0.f376f     // Catch: java.io.IOException -> Lc2
            android.ext.Script.Consts.a(r1, r0, r6)     // Catch: java.io.IOException -> Lc2
            java.lang.String r6 = ")"
            r1.write(r6)     // Catch: java.io.IOException -> Lc2
            boolean r6 = r5.f694g     // Catch: java.io.IOException -> Lc2
            if (r6 == 0) goto Lee
            java.lang.String r6 = "\ngg.clearList()\n"
            r1.write(r6)     // Catch: java.io.IOException -> Lc2
            java.lang.String r6 = "gg.addListItems(prev)\n"
            r1.write(r6)     // Catch: java.io.IOException -> Lc2
            java.lang.String r6 = "prev = nil\n"
            r1.write(r6)     // Catch: java.io.IOException -> Lc2
        Lee:
            java.lang.String r6 = "\n"
            r1.write(r6)     // Catch: java.io.IOException -> Lc2
            goto L100
        Lf4:
            java.lang.String r0 = "Failed save list"
        Lf6:
            android.ext.e1.s(r0, r6)
            java.lang.String r6 = r6.getMessage()
            android.ext.Tools.J1(r6)
        L100:
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r4) {
            r3 = this;
            android.widget.EditText r4 = r3.f688a
            if (r4 == 0) goto L15
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "-list"
            java.lang.String r1 = ".txt"
            java.lang.String r2 = "save-path"
            android.ext.v1.c(r4, r2, r0, r1)
        L15:
            return
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r3 = r3.getId()
            r1 = 2131034130(0x7f050012, float:1.7678769E38)
            if (r3 == r1) goto Le
            return r0
        Le:
            android.app.AlertDialog$Builder r3 = android.ext.f.b()
            r0 = 2131296288(0x7f090020, float:1.8210488E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r3 = r3.setMessage(r0)
            r0 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 0
            android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r1)
            android.ext.f.o(r3)
            r3 = 1
            return r3
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface r3) {
            r2 = this;
            r0 = -1
            r1 = 0
            android.ext.Tools.s1(r3, r0, r1, r2)
            r0 = -3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.ext.Tools.s1(r3, r0, r1, r2)
            return
    }
}
