package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class m1 extends android.ext.j2 implements android.view.View.OnClickListener {
    public m1() {
            r2 = this;
            r0 = 2131296641(0x7f090181, float:1.8211204E38)
            r1 = 2130968629(0x7f040035, float:1.7545917E38)
            r2.<init>(r0, r1)
            return
    }

    public static boolean k(byte r16, java.lang.String r17, long r18, int r20, int r21, long r22, long r24, boolean r26, long r27) {
            r13 = r16
            r0 = r20 & 127(0x7f, float:1.78E-43)
            android.ext.MainService r1 = android.ext.MainService.instance
            long r2 = r1.p0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L17
            if (r26 != 0) goto L17
            int r2 = android.ext.MainService.D()
            r2 = r2 & 127(0x7f, float:1.78E-43)
            r0 = r0 & r2
        L17:
            r14 = r0
            r0 = 1
            if (r14 != 0) goto L1f
            r1.n(r13)
            return r0
        L1f:
            long[] r2 = android.ext.Searcher.t(r17, r18)
            r6 = r14 | r21
            boolean r3 = r1.a1()
            if (r3 == 0) goto L61
            long r7 = r1.p0
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L36
            if (r26 == 0) goto L36
            r1.n(r13)
        L36:
            long r7 = r1.p0
            r15 = 0
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 != 0) goto L44
            r1.q0 = r15
            android.ext.f0 r3 = r1.i
            r3.x0(r13)
        L44:
            r1.R(r13)
            r1.r0 = r15
            android.ext.f0 r1 = r1.i
            r3 = r2[r15]
            r7 = r2[r0]
            r0 = r1
            r1 = r16
            r2 = r3
            r4 = r7
            r7 = r22
            r9 = r24
            r11 = r27
            r0.o0(r1, r2, r4, r6, r7, r9, r11)
            android.ext.MainService.N0(r14, r13)
            return r15
        L61:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 2131296305(0x7f090031, float:1.8210523E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.<init>(r1)
            throw r0
    }

    public static boolean l(java.lang.String r14, long r15, int r17, int r18, long r19, long r21, boolean r23, long r24) {
            java.lang.String r13 = android.ext.j2.h(r14)
            r0 = 0
            r1 = r13
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r8 = r21
            r10 = r23
            r11 = r24
            boolean r0 = k(r0, r1, r2, r4, r5, r6, r8, r10, r11)
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.c2 r1 = r1.f216f
            if (r1 == 0) goto L7d
            if (r23 == 0) goto L24
            java.lang.String r2 = "\ngg.clearResults()\n"
            r1.write(r2)
        L24:
            if (r23 != 0) goto L37
            android.ext.MainService r2 = android.ext.MainService.instance
            long r2 = r2.p0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L31
            goto L37
        L31:
            java.lang.String r2 = "gg.refineAddress("
        L33:
            r1.write(r2)
            goto L3a
        L37:
            java.lang.String r2 = "gg.searchAddress("
            goto L33
        L3a:
            android.ext.Script.Consts.c(r1, r13)
            java.lang.String r2 = ", "
            r1.write(r2)
            r3 = r15
            android.ext.Script.Consts.b(r1, r3)
            r1.write(r2)
            android.ext.Script$Consts r3 = r1.f697c
            android.ext.Script$Const[] r3 = r3.f372b
            r4 = r17
            android.ext.Script.Consts.a(r1, r3, r4)
            r1.write(r2)
            android.ext.Script$Consts r3 = r1.f697c
            android.ext.Script$Const[] r3 = r3.f374d
            r4 = r18
            android.ext.Script.Consts.a(r1, r3, r4)
            r1.write(r2)
            r3 = r19
            android.ext.Script.Consts.b(r1, r3)
            r1.write(r2)
            r3 = r21
            android.ext.Script.Consts.b(r1, r3)
            r1.write(r2)
            java.lang.String r2 = java.lang.Long.toString(r24)
            r1.write(r2)
            java.lang.String r2 = ")\n"
            r1.write(r2)
        L7d:
            return r0
    }

    @Override // android.ext.j2
    public void j(android.content.DialogInterface r13, int r14) {
            r12 = this;
            android.ext.Searcher r13 = r12.j
            java.lang.String r0 = r13.f()
            android.ext.Searcher r13 = r12.j
            long r1 = r13.a()
            android.ext.Searcher r13 = r12.j
            int r4 = r13.i()
            android.ext.Searcher r13 = r12.j
            r3 = 0
            long r5 = r13.e(r3)
            android.ext.Searcher r13 = r12.j
            r7 = 1
            long r8 = r13.e(r7)
            int r13 = r12.i
            r10 = -3
            if (r13 != r10) goto L27
            r13 = 1
            goto L28
        L27:
            r13 = 0
        L28:
            android.ext.Searcher r3 = r12.j
            long r10 = r3.b()
            r3 = r14
            r7 = r8
            r9 = r13
            l(r0, r1, r3, r4, r5, r7, r9, r10)
            return
    }

    @Override // android.ext.j2, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            android.ext.Searcher r0 = r1.j
            java.lang.String r0 = r0.f()
            r1.f1037f = r0
            android.ext.Searcher r0 = r1.j
            java.lang.String r0 = r0.c()
            r1.h = r0
            android.ext.Searcher r0 = r1.j
            int r0 = r0.j()
            android.ext.MainService.O0 = r0
            android.ext.Searcher r0 = r1.j
            int r0 = r0.i()
            r1.f1038g = r0
            super.onDismiss(r2)
            return
    }
}
